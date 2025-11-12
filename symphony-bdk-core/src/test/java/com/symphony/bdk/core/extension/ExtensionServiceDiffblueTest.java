package com.symphony.bdk.core.extension;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.AuthSession;
import com.symphony.bdk.core.auth.impl.AuthSessionImpl;
import com.symphony.bdk.core.auth.impl.BotAuthenticatorCertImpl;
import com.symphony.bdk.core.client.ApiClientFactory;
import com.symphony.bdk.core.config.model.BdkAgentConfig;
import com.symphony.bdk.core.config.model.BdkBotConfig;
import com.symphony.bdk.core.config.model.BdkCertificateConfig;
import com.symphony.bdk.core.config.model.BdkClientConfig;
import com.symphony.bdk.core.config.model.BdkCommonJwtConfig;
import com.symphony.bdk.core.config.model.BdkConfig;
import com.symphony.bdk.core.config.model.BdkDatafeedConfig;
import com.symphony.bdk.core.config.model.BdkDatahoseConfig;
import com.symphony.bdk.core.config.model.BdkExtAppConfig;
import com.symphony.bdk.core.config.model.BdkProxyConfig;
import com.symphony.bdk.core.config.model.BdkRetryConfig;
import com.symphony.bdk.core.config.model.BdkRsaKeyConfig;
import com.symphony.bdk.core.config.model.BdkSslConfig;
import com.symphony.bdk.core.extension.exception.BdkExtensionException;
import com.symphony.bdk.core.retry.RetryWithRecoveryBuilder;
import com.symphony.bdk.core.service.version.AgentVersionService;
import com.symphony.bdk.core.test.BdkRetryConfigTestHelper;
import com.symphony.bdk.extension.BdkExtension;
import com.symphony.bdk.extension.BdkExtensionService;
import com.symphony.bdk.extension.BdkExtensionServiceProvider;
import com.symphony.bdk.http.api.ApiClient;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ExtensionServiceDiffblueTest {
  /**
   * Test {@link ExtensionService#register(Class)} with {@code extClz}.
   *
   * <ul>
   *   <li>Then throw {@link BdkExtensionException}.
   * </ul>
   *
   * <p>Method under test: {@link ExtensionService#register(Class)}
   */
  @Test
  @DisplayName("Test register(Class) with 'extClz'; then throw BdkExtensionException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ExtensionService.register(Class)"})
  void testRegisterWithExtClz_thenThrowBdkExtensionException() {
    // Arrange
    ExtensionService extensionService =
        new ExtensionService(
            mock(ApiClientFactory.class),
            mock(AuthSession.class),
            mock(RetryWithRecoveryBuilder.class),
            mock(BdkConfig.class));
    Class<BdkExtension> extClz = BdkExtension.class;

    // Act and Assert
    assertThrows(BdkExtensionException.class, () -> extensionService.register(extClz));
  }

  /**
   * Test {@link ExtensionService#register(BdkExtension)} with {@code extension}.
   *
   * <p>Method under test: {@link ExtensionService#register(BdkExtension)}
   */
  @Test
  @DisplayName("Test register(BdkExtension) with 'extension'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ExtensionService.register(BdkExtension)"})
  void testRegisterWithExtension() {
    // Arrange
    ExtensionService extensionService =
        new ExtensionService(
            mock(ApiClientFactory.class),
            mock(AuthSession.class),
            mock(RetryWithRecoveryBuilder.class),
            mock(BdkConfig.class));

    TestExtensionAuthenticationAware extension = new TestExtensionAuthenticationAware();
    BotAuthenticatorCertImpl authenticator =
        new BotAuthenticatorCertImpl(
            mock(BdkRetryConfig.class),
            "janedoe",
            mock(BdkCommonJwtConfig.class),
            mock(ApiClient.class),
            mock(ApiClient.class),
            mock(ApiClient.class),
            mock(AgentVersionService.class));
    extension.setAuthSession(new AuthSessionImpl(authenticator));

    // Act and Assert
    assertDoesNotThrow(() -> extensionService.register(extension));
  }

  /**
   * Test {@link ExtensionService#register(BdkExtension)} with {@code extension}.
   *
   * <ul>
   *   <li>Given {@link BdkRsaKeyConfig} (default constructor) Content is {@code AXAXAXAX} Bytes is
   *       {@code UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link ExtensionService#register(BdkExtension)}
   */
  @Test
  @DisplayName(
      "Test register(BdkExtension) with 'extension'; given BdkRsaKeyConfig (default constructor) Content is 'AXAXAXAX' Bytes is 'UTF-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ExtensionService.register(BdkExtension)"})
  void testRegisterWithExtension_givenBdkRsaKeyConfigContentIsAxaxaxaxBytesIsUtf8()
      throws UnsupportedEncodingException {
    // Arrange
    ExtensionService extensionService =
        new ExtensionService(
            mock(ApiClientFactory.class),
            mock(AuthSession.class),
            mock(RetryWithRecoveryBuilder.class),
            mock(BdkConfig.class));

    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Extension <{}> uses the ApiClientFactory");

    BdkExtAppConfig app = new BdkExtAppConfig();
    app.setAppId("42");
    app.setCertificate(new BdkCertificateConfig());
    app.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    app.setCertificatePassword("iloveyou");
    app.setCertificatePath("Extension <{}> uses the ApiClientFactory");
    app.setPrivateKey(privateKey);
    app.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    app.setPrivateKeyPath("Extension <{}> uses the ApiClientFactory");

    BdkRsaKeyConfig privateKey2 = new BdkRsaKeyConfig();
    privateKey2.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey2.setPath("Extension <{}> uses the ApiClientFactory");

    BdkBotConfig bot = new BdkBotConfig();
    bot.setCertificate(new BdkCertificateConfig());
    bot.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setCertificatePassword("iloveyou");
    bot.setCertificatePath("Extension <{}> uses the ApiClientFactory");
    bot.setPrivateKey(privateKey2);
    bot.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setPrivateKeyPath("Extension <{}> uses the ApiClientFactory");
    bot.setUsername("janedoe");

    BdkCommonJwtConfig commonJwt = new BdkCommonJwtConfig();
    commonJwt.setEnabled(true);

    BdkDatafeedConfig datafeed = new BdkDatafeedConfig();
    datafeed.setIdFilePath("/directory/foo.txt");
    datafeed.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    datahose.setTag("Extension <{}> uses the ApiClientFactory");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig());
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Extension <{}> uses the ApiClientFactory");

    BdkConfig config = new BdkConfig();
    config.setAgent(new BdkAgentConfig());
    config.setApp(app);
    config.setBot(bot);
    config.setCommonJwt(commonJwt);
    config.setConnectionPoolMax(1);
    config.setConnectionPoolPerRoute(1);
    config.setConnectionTimeout(10);
    config.setContext("Extension <{}> uses the ApiClientFactory");
    config.setDatafeed(datafeed);
    config.setDatahose(datahose);
    config.setDefaultHeaders(defaultHeaders);
    config.setHost("localhost");
    config.setKeyManager(new BdkClientConfig());
    config.setPod(new BdkClientConfig());
    config.setPort(8080);
    config.setProxy(new BdkProxyConfig());
    config.setReadTimeout(10);
    config.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    config.setScheme("Extension <{}> uses the ApiClientFactory");
    config.setSessionAuth(new BdkClientConfig());
    config.setSsl(ssl);

    TestExtensionConfigAware extension = new TestExtensionConfigAware();
    extension.setConfiguration(config);

    // Act and Assert
    assertDoesNotThrow(() -> extensionService.register(extension));
  }

  /**
   * Test {@link ExtensionService#register(BdkExtension)} with {@code extension}.
   *
   * <ul>
   *   <li>Given {@link RetryWithRecoveryBuilder} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link ExtensionService#register(BdkExtension)}
   */
  @Test
  @DisplayName(
      "Test register(BdkExtension) with 'extension'; given RetryWithRecoveryBuilder (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ExtensionService.register(BdkExtension)"})
  void testRegisterWithExtension_givenRetryWithRecoveryBuilder() {
    // Arrange
    ExtensionService extensionService =
        new ExtensionService(
            mock(ApiClientFactory.class),
            mock(AuthSession.class),
            mock(RetryWithRecoveryBuilder.class),
            mock(BdkConfig.class));

    TestExtensionRetryBuilderAware extension = new TestExtensionRetryBuilderAware();
    extension.setRetryBuilder(new RetryWithRecoveryBuilder<>());

    // Act and Assert
    assertDoesNotThrow(() -> extensionService.register(extension));
  }

  /**
   * Test {@link ExtensionService#register(BdkExtension)} with {@code extension}.
   *
   * <ul>
   *   <li>Then throw {@link BdkExtensionException}.
   * </ul>
   *
   * <p>Method under test: {@link ExtensionService#register(BdkExtension)}
   */
  @Test
  @DisplayName("Test register(BdkExtension) with 'extension'; then throw BdkExtensionException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ExtensionService.register(BdkExtension)"})
  void testRegisterWithExtension_thenThrowBdkExtensionException() {
    // Arrange
    ExtensionService extensionService =
        new ExtensionService(
            mock(ApiClientFactory.class),
            mock(AuthSession.class),
            mock(RetryWithRecoveryBuilder.class),
            mock(BdkConfig.class));

    TestExtensionAuthenticationAware extension = mock(TestExtensionAuthenticationAware.class);
    BdkExtensionException bdkExtensionException =
        new BdkExtensionException("An error occurred", new Throwable());
    doThrow(bdkExtensionException).when(extension).setAuthSession(Mockito.<AuthSession>any());

    // Act and Assert
    assertThrows(BdkExtensionException.class, () -> extensionService.register(extension));
    verify(extension).setAuthSession(isA(AuthSession.class));
  }

  /**
   * Test {@link ExtensionService#register(BdkExtension)} with {@code extension}.
   *
   * <ul>
   *   <li>When {@link TestExtensionApiClientFactoryAware} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link ExtensionService#register(BdkExtension)}
   */
  @Test
  @DisplayName(
      "Test register(BdkExtension) with 'extension'; when TestExtensionApiClientFactoryAware (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ExtensionService.register(BdkExtension)"})
  void testRegisterWithExtension_whenTestExtensionApiClientFactoryAware() {
    // Arrange
    ExtensionService extensionService =
        new ExtensionService(
            mock(ApiClientFactory.class),
            mock(AuthSession.class),
            mock(RetryWithRecoveryBuilder.class),
            mock(BdkConfig.class));

    // Act and Assert
    assertDoesNotThrow(() -> extensionService.register(new TestExtensionApiClientFactoryAware()));
  }

  /**
   * Test {@link ExtensionService#service(Class)}.
   *
   * <p>Method under test: {@link ExtensionService#service(Class)}
   */
  @Test
  @DisplayName("Test service(Class)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkExtensionService ExtensionService.service(Class)"})
  void testService() {
    // Arrange
    ExtensionService extensionService =
        new ExtensionService(
            mock(ApiClientFactory.class),
            mock(AuthSession.class),
            mock(RetryWithRecoveryBuilder.class),
            mock(BdkConfig.class));
    Class<BdkExtensionServiceProvider> forNameResult = BdkExtensionServiceProvider.class;

    // Act and Assert
    assertThrows(
        IllegalStateException.class,
        () ->
            extensionService.service(
                (Class<BdkExtensionServiceProvider<BdkExtensionService>>) (Class) forNameResult));
  }
}
