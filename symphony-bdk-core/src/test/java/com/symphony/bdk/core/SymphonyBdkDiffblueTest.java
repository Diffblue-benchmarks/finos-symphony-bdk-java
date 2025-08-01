package com.symphony.bdk.core;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.AuthenticatorFactory;
import com.symphony.bdk.core.auth.exception.AuthInitializationException;
import com.symphony.bdk.core.auth.exception.AuthUnauthorizedException;
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
import com.symphony.bdk.core.test.BdkRetryConfigTestHelper;
import com.symphony.bdk.http.api.ApiClientBuilderProvider;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {SymphonyBdkBuilder.class})
@ExtendWith(SpringExtension.class)
class SymphonyBdkDiffblueTest {
  @Autowired private SymphonyBdkBuilder symphonyBdkBuilder;

  /**
   * Test {@link SymphonyBdk#builder()}.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SymphonyBdk#builder()}
   *   <li>{@link SymphonyBdk#apiClientBuilderProvider(ApiClientBuilderProvider)}
   *   <li>{@link SymphonyBdk#apiClientFactory(ApiClientFactory)}
   *   <li>{@link SymphonyBdk#authenticatorFactory(AuthenticatorFactory)}
   *   <li>{@link SymphonyBdk#config(BdkConfig)}
   * </ul>
   */
  @Test
  @DisplayName("Test builder()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SymphonyBdkBuilder.<init>()",
    "SymphonyBdkBuilder SymphonyBdkBuilder.apiClientBuilderProvider(ApiClientBuilderProvider)",
    "SymphonyBdkBuilder SymphonyBdkBuilder.apiClientFactory(ApiClientFactory)",
    "SymphonyBdkBuilder SymphonyBdkBuilder.authenticatorFactory(AuthenticatorFactory)",
    "SymphonyBdk SymphonyBdkBuilder.build()",
    "SymphonyBdkBuilder SymphonyBdkBuilder.config(BdkConfig)"
  })
  void testBuilder() throws UnsupportedEncodingException {
    // Arrange and Act
    SymphonyBdkBuilder actualApiClientBuilderProviderResult =
        SymphonyBdk.builder().apiClientBuilderProvider(mock(ApiClientBuilderProvider.class));
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");
    BdkExtAppConfig app = new BdkExtAppConfig();
    app.setAppId("42");
    app.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    app.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    app.setCertificatePassword("iloveyou");
    app.setCertificatePath("Certificate Path");
    app.setPrivateKey(privateKey);
    app.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    app.setPrivateKeyPath("Private Key Path");
    BdkRsaKeyConfig privateKey2 = new BdkRsaKeyConfig();
    privateKey2.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey2.setPath("Path");
    BdkBotConfig bot = new BdkBotConfig();
    bot.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    bot.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setCertificatePassword("iloveyou");
    bot.setCertificatePath("Certificate Path");
    bot.setPrivateKey(privateKey2);
    bot.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setPrivateKeyPath("Private Key Path");
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
    datahose.setTag("Tag");
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");
    BdkConfig config = new BdkConfig();
    config.setAgent(new BdkAgentConfig());
    config.setApp(app);
    config.setBot(bot);
    config.setCommonJwt(commonJwt);
    config.setConnectionPoolMax(1);
    config.setConnectionPoolPerRoute(1);
    config.setConnectionTimeout(10);
    config.setContext("Context");
    config.setDatafeed(datafeed);
    config.setDatahose(datahose);
    config.setDefaultHeaders(defaultHeaders);
    config.setHost("localhost");
    config.setKeyManager(new BdkClientConfig());
    config.setPod(new BdkClientConfig());
    config.setPort(8080);
    config.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    config.setReadTimeout(10);
    config.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    config.setScheme("Scheme");
    config.setSessionAuth(new BdkClientConfig());
    config.setSsl(ssl);
    SymphonyBdkBuilder actualApiClientFactoryResult =
        actualApiClientBuilderProviderResult.apiClientFactory(new ApiClientFactory(config));
    BdkRsaKeyConfig privateKey3 = new BdkRsaKeyConfig();
    privateKey3.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey3.setPath("Path");
    BdkExtAppConfig app2 = new BdkExtAppConfig();
    app2.setAppId("42");
    app2.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    app2.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    app2.setCertificatePassword("iloveyou");
    app2.setCertificatePath("Certificate Path");
    app2.setPrivateKey(privateKey3);
    app2.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    app2.setPrivateKeyPath("Private Key Path");
    BdkRsaKeyConfig privateKey4 = new BdkRsaKeyConfig();
    privateKey4.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey4.setPath("Path");
    BdkBotConfig bot2 = new BdkBotConfig();
    bot2.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    bot2.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bot2.setCertificatePassword("iloveyou");
    bot2.setCertificatePath("Certificate Path");
    bot2.setPrivateKey(privateKey4);
    bot2.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bot2.setPrivateKeyPath("Private Key Path");
    bot2.setUsername("janedoe");
    BdkCommonJwtConfig commonJwt2 = new BdkCommonJwtConfig();
    commonJwt2.setEnabled(true);
    BdkDatafeedConfig datafeed2 = new BdkDatafeedConfig();
    datafeed2.setIdFilePath("/directory/foo.txt");
    datafeed2.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    datafeed2.setVersion("1.0.2");
    BdkDatahoseConfig datahose2 = new BdkDatahoseConfig();
    datahose2.setEventTypes(new ArrayList<>());
    datahose2.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    datahose2.setTag("Tag");
    HashMap<String, String> defaultHeaders2 = new HashMap<>();
    defaultHeaders2.put("Delivered-To", "alice.liddell@example.org");
    BdkSslConfig ssl2 = new BdkSslConfig();
    ssl2.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl2.setTrustStorePassword("iloveyou");
    ssl2.setTrustStorePath("Trust Store Path");
    BdkConfig bdkConfig = new BdkConfig();
    bdkConfig.setAgent(new BdkAgentConfig());
    bdkConfig.setApp(app2);
    bdkConfig.setBot(bot2);
    bdkConfig.setCommonJwt(commonJwt2);
    bdkConfig.setConnectionPoolMax(1);
    bdkConfig.setConnectionPoolPerRoute(1);
    bdkConfig.setConnectionTimeout(10);
    bdkConfig.setContext("Context");
    bdkConfig.setDatafeed(datafeed2);
    bdkConfig.setDatahose(datahose2);
    bdkConfig.setDefaultHeaders(defaultHeaders2);
    bdkConfig.setHost("localhost");
    bdkConfig.setKeyManager(new BdkClientConfig());
    bdkConfig.setPod(new BdkClientConfig());
    bdkConfig.setPort(8080);
    bdkConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    bdkConfig.setReadTimeout(10);
    bdkConfig.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    bdkConfig.setScheme("Scheme");
    bdkConfig.setSessionAuth(new BdkClientConfig());
    bdkConfig.setSsl(ssl2);
    BdkExtAppConfig app3 = new BdkExtAppConfig();
    app3.setAppId("42");
    app3.setCertificate(new BdkCertificateConfig());
    app3.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    app3.setCertificatePassword("iloveyou");
    app3.setCertificatePath("Certificate Path");
    app3.setPrivateKey(new BdkRsaKeyConfig());
    app3.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    app3.setPrivateKeyPath("Private Key Path");
    BdkBotConfig bot3 = new BdkBotConfig();
    bot3.setCertificate(new BdkCertificateConfig());
    bot3.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bot3.setCertificatePassword("iloveyou");
    bot3.setCertificatePath("Certificate Path");
    bot3.setPrivateKey(new BdkRsaKeyConfig());
    bot3.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bot3.setPrivateKeyPath("Private Key Path");
    bot3.setUsername("janedoe");
    BdkCommonJwtConfig commonJwt3 = new BdkCommonJwtConfig();
    commonJwt3.setEnabled(true);
    BdkDatafeedConfig datafeed3 = new BdkDatafeedConfig();
    datafeed3.setIdFilePath("/directory/foo.txt");
    datafeed3.setRetry(new BdkRetryConfig());
    datafeed3.setVersion("1.0.2");
    BdkDatahoseConfig datahose3 = new BdkDatahoseConfig();
    datahose3.setEventTypes(new ArrayList<>());
    datahose3.setRetry(new BdkRetryConfig());
    datahose3.setTag("Tag");
    HashMap<String, String> defaultHeaders3 = new HashMap<>();
    defaultHeaders3.put("Delivered-To", "alice.liddell@example.org");
    BdkSslConfig ssl3 = new BdkSslConfig();
    ssl3.setTrustStore(new BdkCertificateConfig());
    ssl3.setTrustStorePassword("iloveyou");
    ssl3.setTrustStorePath("Trust Store Path");
    BdkConfig config2 = new BdkConfig();
    config2.setAgent(new BdkAgentConfig());
    config2.setApp(app3);
    config2.setBot(bot3);
    config2.setCommonJwt(commonJwt3);
    config2.setConnectionPoolMax(1);
    config2.setConnectionPoolPerRoute(1);
    config2.setConnectionTimeout(10);
    config2.setContext("Context");
    config2.setDatafeed(datafeed3);
    config2.setDatahose(datahose3);
    config2.setDefaultHeaders(defaultHeaders3);
    config2.setHost("localhost");
    config2.setKeyManager(new BdkClientConfig());
    config2.setPod(new BdkClientConfig());
    config2.setPort(8080);
    config2.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    config2.setReadTimeout(10);
    config2.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    config2.setScheme("Scheme");
    config2.setSessionAuth(new BdkClientConfig());
    config2.setSsl(ssl3);
    SymphonyBdkBuilder actualAuthenticatorFactoryResult =
        actualApiClientFactoryResult.authenticatorFactory(
            new AuthenticatorFactory(bdkConfig, new ApiClientFactory(config2)));
    BdkRsaKeyConfig privateKey5 = new BdkRsaKeyConfig();
    privateKey5.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey5.setPath("Path");
    BdkExtAppConfig app4 = new BdkExtAppConfig();
    app4.setAppId("42");
    app4.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    app4.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    app4.setCertificatePassword("iloveyou");
    app4.setCertificatePath("Certificate Path");
    app4.setPrivateKey(privateKey5);
    app4.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    app4.setPrivateKeyPath("Private Key Path");
    BdkRsaKeyConfig privateKey6 = new BdkRsaKeyConfig();
    privateKey6.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey6.setPath("Path");
    BdkBotConfig bot4 = new BdkBotConfig();
    bot4.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    bot4.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bot4.setCertificatePassword("iloveyou");
    bot4.setCertificatePath("Certificate Path");
    bot4.setPrivateKey(privateKey6);
    bot4.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bot4.setPrivateKeyPath("Private Key Path");
    bot4.setUsername("janedoe");
    BdkCommonJwtConfig commonJwt4 = new BdkCommonJwtConfig();
    commonJwt4.setEnabled(true);
    BdkDatafeedConfig datafeed4 = new BdkDatafeedConfig();
    datafeed4.setIdFilePath("/directory/foo.txt");
    datafeed4.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    datafeed4.setVersion("1.0.2");
    BdkDatahoseConfig datahose4 = new BdkDatahoseConfig();
    datahose4.setEventTypes(new ArrayList<>());
    datahose4.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    datahose4.setTag("Tag");
    HashMap<String, String> defaultHeaders4 = new HashMap<>();
    defaultHeaders4.put("Delivered-To", "alice.liddell@example.org");
    BdkSslConfig ssl4 = new BdkSslConfig();
    ssl4.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl4.setTrustStorePassword("iloveyou");
    ssl4.setTrustStorePath("Trust Store Path");
    BdkConfig config3 = new BdkConfig();
    config3.setAgent(new BdkAgentConfig());
    config3.setApp(app4);
    config3.setBot(bot4);
    config3.setCommonJwt(commonJwt4);
    config3.setConnectionPoolMax(1);
    config3.setConnectionPoolPerRoute(1);
    config3.setConnectionTimeout(10);
    config3.setContext("Context");
    config3.setDatafeed(datafeed4);
    config3.setDatahose(datahose4);
    config3.setDefaultHeaders(defaultHeaders4);
    config3.setHost("localhost");
    config3.setKeyManager(new BdkClientConfig());
    config3.setPod(new BdkClientConfig());
    config3.setPort(8080);
    config3.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    config3.setReadTimeout(10);
    config3.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    config3.setScheme("Scheme");
    config3.setSessionAuth(new BdkClientConfig());
    config3.setSsl(ssl4);

    // Assert
    assertSame(actualAuthenticatorFactoryResult, actualAuthenticatorFactoryResult.config(config3));
  }

  /**
   * Test {@link SymphonyBdk#SymphonyBdk(BdkConfig, ApiClientFactory, AuthenticatorFactory)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then calls {@link AuthenticatorFactory#getBotAuthenticator()}.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyBdk#SymphonyBdk(BdkConfig, ApiClientFactory,
   * AuthenticatorFactory)}
   */
  @Test
  @DisplayName(
      "Test new SymphonyBdk(BdkConfig, ApiClientFactory, AuthenticatorFactory); given 'true'; then calls getBotAuthenticator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SymphonyBdk.<init>(BdkConfig, ApiClientFactory, AuthenticatorFactory)"})
  void testNewSymphonyBdk_givenTrue_thenCallsGetBotAuthenticator()
      throws AuthInitializationException, AuthUnauthorizedException {
    // Arrange
    BdkConfig config = mock(BdkConfig.class);
    when(config.isBotConfigured()).thenReturn(true);
    when(config.isOboConfigured()).thenReturn(false);
    ApiClientFactory apiClientFactory = mock(ApiClientFactory.class);
    AuthenticatorFactory authenticatorFactory = mock(AuthenticatorFactory.class);
    when(authenticatorFactory.getBotAuthenticator()).thenThrow(new IllegalStateException());

    // Act and Assert
    assertThrows(
        IllegalStateException.class,
        () -> new SymphonyBdk(config, apiClientFactory, authenticatorFactory));

    verify(authenticatorFactory).getBotAuthenticator();
    verify(config).isBotConfigured();
    verify(config, atLeast(1)).isOboConfigured();
  }

  /**
   * Test {@link SymphonyBdk#SymphonyBdk(BdkConfig)}.
   *
   * <ul>
   *   <li>Then return botSession is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyBdk#SymphonyBdk(BdkConfig)}
   */
  @Test
  @DisplayName("Test new SymphonyBdk(BdkConfig); then return botSession is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SymphonyBdk.<init>(BdkConfig)"})
  void testNewSymphonyBdk_thenReturnBotSessionIsNull()
      throws AuthInitializationException, AuthUnauthorizedException {
    // Arrange
    BdkConfig config = mock(BdkConfig.class);
    when(config.isBotConfigured()).thenReturn(false);
    when(config.isOboConfigured()).thenReturn(false);
    when(config.getRetry()).thenReturn(BdkRetryConfigTestHelper.ofMinimalInterval(3));

    // Act
    SymphonyBdk actualSymphonyBdk = new SymphonyBdk(config);

    // Assert
    verify(config).getRetry();
    verify(config).isBotConfigured();
    verify(config, atLeast(1)).isOboConfigured();
    assertNull(actualSymphonyBdk.botSession());
    assertNull(actualSymphonyBdk.botInfo());
    assertSame(config, actualSymphonyBdk.config());
  }

  /**
   * Test {@link SymphonyBdk#SymphonyBdk(BdkConfig, ApiClientFactory, AuthenticatorFactory)}.
   *
   * <ul>
   *   <li>Then return botSession is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyBdk#SymphonyBdk(BdkConfig, ApiClientFactory,
   * AuthenticatorFactory)}
   */
  @Test
  @DisplayName(
      "Test new SymphonyBdk(BdkConfig, ApiClientFactory, AuthenticatorFactory); then return botSession is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SymphonyBdk.<init>(BdkConfig, ApiClientFactory, AuthenticatorFactory)"})
  void testNewSymphonyBdk_thenReturnBotSessionIsNull2()
      throws AuthInitializationException, AuthUnauthorizedException {
    // Arrange
    BdkConfig config = mock(BdkConfig.class);
    when(config.isBotConfigured()).thenReturn(false);
    when(config.isOboConfigured()).thenReturn(false);
    when(config.getRetry()).thenReturn(BdkRetryConfigTestHelper.ofMinimalInterval(3));

    // Act
    SymphonyBdk actualSymphonyBdk =
        new SymphonyBdk(config, mock(ApiClientFactory.class), mock(AuthenticatorFactory.class));

    // Assert
    verify(config).getRetry();
    verify(config).isBotConfigured();
    verify(config, atLeast(1)).isOboConfigured();
    assertNull(actualSymphonyBdk.botSession());
    assertNull(actualSymphonyBdk.botInfo());
    assertSame(config, actualSymphonyBdk.config());
  }

  /**
   * Test {@link SymphonyBdk#SymphonyBdk(BdkConfig, ApiClientFactory, AuthenticatorFactory)}.
   *
   * <ul>
   *   <li>Then return config Agent ParentConfig is config.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyBdk#SymphonyBdk(BdkConfig, ApiClientFactory,
   * AuthenticatorFactory)}
   */
  @Test
  @DisplayName(
      "Test new SymphonyBdk(BdkConfig, ApiClientFactory, AuthenticatorFactory); then return config Agent ParentConfig is config")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SymphonyBdk.<init>(BdkConfig, ApiClientFactory, AuthenticatorFactory)"})
  void testNewSymphonyBdk_thenReturnConfigAgentParentConfigIsConfig()
      throws AuthInitializationException, AuthUnauthorizedException, UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkExtAppConfig app = new BdkExtAppConfig();
    app.setAppId(null);
    app.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    app.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    app.setCertificatePassword("iloveyou");
    app.setCertificatePath("Certificate Path");
    app.setPrivateKey(privateKey);
    app.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    app.setPrivateKeyPath("Private Key Path");

    BdkCommonJwtConfig commonJwt = new BdkCommonJwtConfig();
    commonJwt.setEnabled(true);

    BdkDatafeedConfig datafeed = new BdkDatafeedConfig();
    datafeed.setIdFilePath("/directory/foo.txt");
    datafeed.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkConfig config = new BdkConfig();
    config.setAgent(new BdkAgentConfig());
    config.setApp(app);
    config.setCommonJwt(commonJwt);
    config.setConnectionPoolMax(1);
    config.setConnectionPoolPerRoute(1);
    config.setConnectionTimeout(10);
    config.setContext("Context");
    config.setDatafeed(datafeed);
    config.setDatahose(datahose);
    config.setDefaultHeaders(defaultHeaders);
    config.setHost("localhost");
    config.setKeyManager(new BdkClientConfig());
    config.setPod(new BdkClientConfig());
    config.setPort(8080);
    config.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    config.setReadTimeout(10);
    config.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    config.setScheme("Scheme");
    config.setSessionAuth(new BdkClientConfig());
    config.setSsl(ssl);
    config.setBot(null);

    // Act and Assert
    BdkConfig configResult = new SymphonyBdk(config, null, null).config();
    assertSame(configResult, configResult.getAgent().getParentConfig());
    assertSame(configResult, configResult.getKeyManager().getParentConfig());
    assertSame(configResult, configResult.getPod().getParentConfig());
    assertSame(configResult, configResult.getSessionAuth().getParentConfig());
    byte[] expectedCertificateContent = "AXAXAXAX".getBytes("UTF-8");
    BdkExtAppConfig app2 = configResult.getApp();
    assertArrayEquals(expectedCertificateContent, app2.getCertificateContent());
    byte[] expectedPrivateKeyContent = "AXAXAXAX".getBytes("UTF-8");
    assertArrayEquals(expectedPrivateKeyContent, app2.getPrivateKeyContent());
  }

  /**
   * Test {@link SymphonyBdk#SymphonyBdk(BdkConfig, ApiClientFactory, AuthenticatorFactory)}.
   *
   * <ul>
   *   <li>Then return config App AppId is empty string.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyBdk#SymphonyBdk(BdkConfig, ApiClientFactory,
   * AuthenticatorFactory)}
   */
  @Test
  @DisplayName(
      "Test new SymphonyBdk(BdkConfig, ApiClientFactory, AuthenticatorFactory); then return config App AppId is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SymphonyBdk.<init>(BdkConfig, ApiClientFactory, AuthenticatorFactory)"})
  void testNewSymphonyBdk_thenReturnConfigAppAppIdIsEmptyString()
      throws AuthInitializationException, AuthUnauthorizedException, UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkExtAppConfig app = new BdkExtAppConfig();
    app.setAppId("");
    app.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    app.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    app.setCertificatePassword("iloveyou");
    app.setCertificatePath("Certificate Path");
    app.setPrivateKey(privateKey);
    app.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    app.setPrivateKeyPath("Private Key Path");

    BdkCommonJwtConfig commonJwt = new BdkCommonJwtConfig();
    commonJwt.setEnabled(true);

    BdkDatafeedConfig datafeed = new BdkDatafeedConfig();
    datafeed.setIdFilePath("/directory/foo.txt");
    datafeed.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkConfig config = new BdkConfig();
    config.setAgent(new BdkAgentConfig());
    config.setApp(app);
    config.setCommonJwt(commonJwt);
    config.setConnectionPoolMax(1);
    config.setConnectionPoolPerRoute(1);
    config.setConnectionTimeout(10);
    config.setContext("Context");
    config.setDatafeed(datafeed);
    config.setDatahose(datahose);
    config.setDefaultHeaders(defaultHeaders);
    config.setHost("localhost");
    config.setKeyManager(new BdkClientConfig());
    config.setPod(new BdkClientConfig());
    config.setPort(8080);
    config.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    config.setReadTimeout(10);
    config.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    config.setScheme("Scheme");
    config.setSessionAuth(new BdkClientConfig());
    config.setSsl(ssl);
    config.setBot(null);

    // Act and Assert
    BdkExtAppConfig app2 =
        new SymphonyBdk(
                config,
                null,
                new AuthenticatorFactory(mock(BdkConfig.class), mock(ApiClientFactory.class)))
            .config()
            .getApp();
    assertEquals("", app2.getAppId());
    byte[] expectedCertificateContent = "AXAXAXAX".getBytes("UTF-8");
    assertArrayEquals(expectedCertificateContent, app2.getCertificateContent());
    byte[] expectedPrivateKeyContent = "AXAXAXAX".getBytes("UTF-8");
    assertArrayEquals(expectedPrivateKeyContent, app2.getPrivateKeyContent());
    byte[] expectedContent = "AXAXAXAX".getBytes("UTF-8");
    assertArrayEquals(expectedContent, app2.getPrivateKey().getContent());
  }

  /**
   * Test {@link SymphonyBdk#SymphonyBdk(BdkConfig, ApiClientFactory, AuthenticatorFactory)}.
   *
   * <ul>
   *   <li>Then return config App AppId is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyBdk#SymphonyBdk(BdkConfig, ApiClientFactory,
   * AuthenticatorFactory)}
   */
  @Test
  @DisplayName(
      "Test new SymphonyBdk(BdkConfig, ApiClientFactory, AuthenticatorFactory); then return config App AppId is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SymphonyBdk.<init>(BdkConfig, ApiClientFactory, AuthenticatorFactory)"})
  void testNewSymphonyBdk_thenReturnConfigAppAppIdIsNull()
      throws AuthInitializationException, AuthUnauthorizedException, UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkExtAppConfig app = new BdkExtAppConfig();
    app.setAppId(null);
    app.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    app.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    app.setCertificatePassword("iloveyou");
    app.setCertificatePath("Certificate Path");
    app.setPrivateKey(privateKey);
    app.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    app.setPrivateKeyPath("Private Key Path");

    BdkCommonJwtConfig commonJwt = new BdkCommonJwtConfig();
    commonJwt.setEnabled(true);

    BdkDatafeedConfig datafeed = new BdkDatafeedConfig();
    datafeed.setIdFilePath("/directory/foo.txt");
    datafeed.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkConfig config = new BdkConfig();
    config.setAgent(new BdkAgentConfig());
    config.setApp(app);
    config.setCommonJwt(commonJwt);
    config.setConnectionPoolMax(1);
    config.setConnectionPoolPerRoute(1);
    config.setConnectionTimeout(10);
    config.setContext("Context");
    config.setDatafeed(datafeed);
    config.setDatahose(datahose);
    config.setDefaultHeaders(defaultHeaders);
    config.setHost("localhost");
    config.setKeyManager(new BdkClientConfig());
    config.setPod(new BdkClientConfig());
    config.setPort(8080);
    config.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    config.setReadTimeout(10);
    config.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    config.setScheme("Scheme");
    config.setSessionAuth(new BdkClientConfig());
    config.setSsl(ssl);
    config.setBot(null);

    // Act and Assert
    BdkConfig configResult =
        new SymphonyBdk(
                config,
                null,
                new AuthenticatorFactory(mock(BdkConfig.class), mock(ApiClientFactory.class)))
            .config();
    BdkExtAppConfig app2 = configResult.getApp();
    assertNull(app2.getAppId());
    assertSame(configResult, configResult.getAgent().getParentConfig());
    assertSame(configResult, configResult.getKeyManager().getParentConfig());
    assertSame(configResult, configResult.getPod().getParentConfig());
    assertSame(configResult, configResult.getSessionAuth().getParentConfig());
    byte[] expectedCertificateContent = "AXAXAXAX".getBytes("UTF-8");
    assertArrayEquals(expectedCertificateContent, app2.getCertificateContent());
    byte[] expectedPrivateKeyContent = "AXAXAXAX".getBytes("UTF-8");
    assertArrayEquals(expectedPrivateKeyContent, app2.getPrivateKeyContent());
  }

  /**
   * Test {@link SymphonyBdk#SymphonyBdk(BdkConfig)}.
   *
   * <ul>
   *   <li>When {@link BdkConfig} {@link BdkConfig#getApp()} throw {@link
   *       IllegalStateException#IllegalStateException()}.
   *   <li>Then calls {@link BdkConfig#getApp()}.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyBdk#SymphonyBdk(BdkConfig)}
   */
  @Test
  @DisplayName(
      "Test new SymphonyBdk(BdkConfig); when BdkConfig getApp() throw IllegalStateException(); then calls getApp()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SymphonyBdk.<init>(BdkConfig)"})
  void testNewSymphonyBdk_whenBdkConfigGetAppThrowIllegalStateException_thenCallsGetApp()
      throws AuthInitializationException, AuthUnauthorizedException {
    // Arrange
    BdkConfig config = mock(BdkConfig.class);
    when(config.getApp()).thenThrow(new IllegalStateException());
    when(config.isOboConfigured()).thenReturn(true);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> new SymphonyBdk(config));
    verify(config).getApp();
    verify(config).isOboConfigured();
  }

  /**
   * Test {@link SymphonyBdk#SymphonyBdk(BdkConfig, ApiClientFactory, AuthenticatorFactory)}.
   *
   * <ul>
   *   <li>When {@link BdkConfig} {@link BdkConfig#getApp()} throw {@link
   *       IllegalStateException#IllegalStateException()}.
   *   <li>Then calls {@link BdkConfig#getApp()}.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyBdk#SymphonyBdk(BdkConfig, ApiClientFactory,
   * AuthenticatorFactory)}
   */
  @Test
  @DisplayName(
      "Test new SymphonyBdk(BdkConfig, ApiClientFactory, AuthenticatorFactory); when BdkConfig getApp() throw IllegalStateException(); then calls getApp()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SymphonyBdk.<init>(BdkConfig, ApiClientFactory, AuthenticatorFactory)"})
  void testNewSymphonyBdk_whenBdkConfigGetAppThrowIllegalStateException_thenCallsGetApp2()
      throws AuthInitializationException, AuthUnauthorizedException, UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkExtAppConfig app = new BdkExtAppConfig();
    app.setAppId("42");
    app.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    app.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    app.setCertificatePassword("iloveyou");
    app.setCertificatePath("Certificate Path");
    app.setPrivateKey(privateKey);
    app.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    app.setPrivateKeyPath("Private Key Path");

    BdkCommonJwtConfig commonJwt = new BdkCommonJwtConfig();
    commonJwt.setEnabled(true);

    BdkDatafeedConfig datafeed = new BdkDatafeedConfig();
    datafeed.setIdFilePath("/directory/foo.txt");
    datafeed.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkConfig config = new BdkConfig();
    config.setAgent(new BdkAgentConfig());
    config.setApp(app);
    config.setCommonJwt(commonJwt);
    config.setConnectionPoolMax(1);
    config.setConnectionPoolPerRoute(1);
    config.setConnectionTimeout(10);
    config.setContext("Context");
    config.setDatafeed(datafeed);
    config.setDatahose(datahose);
    config.setDefaultHeaders(defaultHeaders);
    config.setHost("localhost");
    config.setKeyManager(new BdkClientConfig());
    config.setPod(new BdkClientConfig());
    config.setPort(8080);
    config.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    config.setReadTimeout(10);
    config.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    config.setScheme("Scheme");
    config.setSessionAuth(new BdkClientConfig());
    config.setSsl(ssl);
    config.setBot(null);
    BdkConfig bdkConfig = mock(BdkConfig.class);
    when(bdkConfig.getApp()).thenThrow(new IllegalStateException());

    // Act and Assert
    assertThrows(
        IllegalStateException.class,
        () ->
            new SymphonyBdk(
                config, null, new AuthenticatorFactory(bdkConfig, mock(ApiClientFactory.class))));

    verify(bdkConfig).getApp();
  }

  /**
   * Test {@link SymphonyBdk#SymphonyBdk(BdkConfig)}.
   *
   * <ul>
   *   <li>When {@link BdkConfig} {@link BdkConfig#isOboConfigured()} throw {@link
   *       IllegalStateException#IllegalStateException()}.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyBdk#SymphonyBdk(BdkConfig)}
   */
  @Test
  @DisplayName(
      "Test new SymphonyBdk(BdkConfig); when BdkConfig isOboConfigured() throw IllegalStateException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SymphonyBdk.<init>(BdkConfig)"})
  void testNewSymphonyBdk_whenBdkConfigIsOboConfiguredThrowIllegalStateException()
      throws AuthInitializationException, AuthUnauthorizedException {
    // Arrange
    BdkConfig config = mock(BdkConfig.class);
    when(config.isOboConfigured()).thenThrow(new IllegalStateException());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> new SymphonyBdk(config));
    verify(config).isOboConfigured();
  }

  /**
   * Test {@link SymphonyBdk#SymphonyBdk(BdkConfig, ApiClientFactory, AuthenticatorFactory)}.
   *
   * <ul>
   *   <li>When {@link BdkConfig} {@link BdkConfig#isOboConfigured()} throw {@link
   *       IllegalStateException#IllegalStateException()}.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyBdk#SymphonyBdk(BdkConfig, ApiClientFactory,
   * AuthenticatorFactory)}
   */
  @Test
  @DisplayName(
      "Test new SymphonyBdk(BdkConfig, ApiClientFactory, AuthenticatorFactory); when BdkConfig isOboConfigured() throw IllegalStateException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SymphonyBdk.<init>(BdkConfig, ApiClientFactory, AuthenticatorFactory)"})
  void testNewSymphonyBdk_whenBdkConfigIsOboConfiguredThrowIllegalStateException2()
      throws AuthInitializationException, AuthUnauthorizedException {
    // Arrange
    BdkConfig config = mock(BdkConfig.class);
    when(config.isOboConfigured()).thenThrow(new IllegalStateException());

    // Act and Assert
    assertThrows(
        IllegalStateException.class,
        () ->
            new SymphonyBdk(
                config, mock(ApiClientFactory.class), mock(AuthenticatorFactory.class)));

    verify(config).isOboConfigured();
  }
}
