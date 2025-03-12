package com.symphony.bdk.core.extension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.MethodsUnderTest;
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
import com.symphony.bdk.extension.BdkExtension;
import com.symphony.bdk.extension.BdkExtensionService;
import com.symphony.bdk.extension.BdkExtensionServiceProvider;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ExtensionServiceDiffblueTest {
  /**
   * Test {@link ExtensionService#register(Class)} with {@code extClz}.
   * <ul>
   *   <li>Then throw {@link BdkExtensionException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ExtensionService#register(Class)}
   */
  @Test
  @DisplayName("Test register(Class) with 'extClz'; then throw BdkExtensionException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ExtensionService.register(Class)"})
  void testRegisterWithExtClz_thenThrowBdkExtensionException() {
    // Arrange
    ApiClientFactory apiClientFactory = new ApiClientFactory(new BdkConfig());
    RetryWithRecoveryBuilder<?> retryBuilder = new RetryWithRecoveryBuilder<>();
    ExtensionService extensionService = new ExtensionService(apiClientFactory, null, retryBuilder, new BdkConfig());
    Class<BdkExtension> extClz = BdkExtension.class;

    // Act and Assert
    assertThrows(BdkExtensionException.class, () -> extensionService.register(extClz));
  }

  /**
   * Test {@link ExtensionService#register(BdkExtension)} with {@code extension}.
   * <p>
   * Method under test: {@link ExtensionService#register(BdkExtension)}
   */
  @Test
  @DisplayName("Test register(BdkExtension) with 'extension'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ExtensionService.register(BdkExtension)"})
  void testRegisterWithExtension() {
    // Arrange
    ApiClientFactory apiClientFactory = new ApiClientFactory(new BdkConfig());
    RetryWithRecoveryBuilder<?> retryBuilder = new RetryWithRecoveryBuilder<>();
    ExtensionService extensionService = new ExtensionService(apiClientFactory, null, retryBuilder, new BdkConfig());
    TestExtensionApiClientFactoryAware extension = new TestExtensionApiClientFactoryAware();

    // Act
    extensionService.register(extension);

    // Assert
    assertSame(apiClientFactory, extension.getService().getApiClientFactory());
  }

  /**
   * Test {@link ExtensionService#register(BdkExtension)} with {@code extension}.
   * <p>
   * Method under test: {@link ExtensionService#register(BdkExtension)}
   */
  @Test
  @DisplayName("Test register(BdkExtension) with 'extension'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ExtensionService.register(BdkExtension)"})
  void testRegisterWithExtension2() throws UnsupportedEncodingException {
    // Arrange
    ApiClientFactory apiClientFactory = new ApiClientFactory(new BdkConfig());
    RetryWithRecoveryBuilder<?> retryBuilder = new RetryWithRecoveryBuilder<>();
    ExtensionService extensionService = new ExtensionService(apiClientFactory, null, retryBuilder, new BdkConfig());

    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Extension <{}> uses the ApiClientFactory");

    BdkExtAppConfig app = new BdkExtAppConfig();
    app.setAppId("42");
    app.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
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
    bot.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
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
    datafeed.setRetry(new BdkRetryConfig());
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(new BdkRetryConfig());
    datahose.setTag("Extension <{}> uses the ApiClientFactory");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
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
    config.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    config.setReadTimeout(10);
    config.setRetry(new BdkRetryConfig());
    config.setScheme("Extension <{}> uses the ApiClientFactory");
    config.setSessionAuth(new BdkClientConfig());
    config.setSsl(ssl);

    TestExtensionConfigAware extension = new TestExtensionConfigAware();
    extension.setConfiguration(config);

    // Act
    extensionService.register(extension);

    // Assert
    BdkConfig config2 = extension.getService().getConfig();
    assertEquals("", config2.getContext());
    assertEquals("", config2.getFormattedContext());
    assertEquals("https", config2.getScheme());
    assertEquals("https://null:443", config2.getBasePath());
    assertNull(config2.getProxy());
    assertNull(config2.getConnectionPoolMax());
    assertNull(config2.getConnectionPoolPerRoute());
    assertNull(config2.getConnectionTimeout());
    assertNull(config2.getReadTimeout());
    assertNull(config2.getHost());
    assertNull(config2.getDefaultHeaders());
    assertEquals(443, config2.getPort().intValue());
    assertFalse(config2.isBotConfigured());
    assertFalse(config2.isOboConfigured());
  }

  /**
   * Test {@link ExtensionService#service(Class)}.
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ExtensionService#service(Class)}
   */
  @Test
  @DisplayName("Test service(Class); then throw IllegalStateException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"BdkExtensionService ExtensionService.service(Class)"})
  void testService_thenThrowIllegalStateException() {
    // Arrange
    ApiClientFactory apiClientFactory = new ApiClientFactory(new BdkConfig());
    RetryWithRecoveryBuilder<?> retryBuilder = new RetryWithRecoveryBuilder<>();
    ExtensionService extensionService = new ExtensionService(apiClientFactory, null, retryBuilder, new BdkConfig());
    Class<BdkExtensionServiceProvider> forNameResult = BdkExtensionServiceProvider.class;

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> extensionService
        .service((Class<BdkExtensionServiceProvider<BdkExtensionService>>) (Class) forNameResult));
  }
}
