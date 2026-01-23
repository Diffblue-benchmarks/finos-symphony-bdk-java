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
import com.symphony.bdk.core.config.model.BdkRsaKeyConfig;
import com.symphony.bdk.core.config.model.BdkSslConfig;
import com.symphony.bdk.core.test.BdkRetryConfigTestHelper;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SymphonyBdkDiffblueTest {
  /**
   * Test {@link SymphonyBdk#SymphonyBdk(BdkConfig, ApiClientFactory, AuthenticatorFactory)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link BdkConfig} (default constructor) Bot is {@code null}.
   *   <li>Then return config Bot is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyBdk#SymphonyBdk(BdkConfig, ApiClientFactory,
   * AuthenticatorFactory)}
   */
  @Test
  @DisplayName(
      "Test new SymphonyBdk(BdkConfig, ApiClientFactory, AuthenticatorFactory); given 'null'; when BdkConfig (default constructor) Bot is 'null'; then return config Bot is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SymphonyBdk.<init>(BdkConfig, ApiClientFactory, AuthenticatorFactory)"})
  void testNewSymphonyBdk_givenNull_whenBdkConfigBotIsNull_thenReturnConfigBotIsNull()
      throws AuthInitializationException, AuthUnauthorizedException, UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkExtAppConfig app = new BdkExtAppConfig();
    app.setAppId("");
    app.setCertificate(new BdkCertificateConfig());
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
    ssl.setTrustStore(new BdkCertificateConfig());
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
    config.setProxy(new BdkProxyConfig());
    config.setReadTimeout(10);
    config.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    config.setScheme("Scheme");
    config.setSessionAuth(new BdkClientConfig());
    config.setSsl(ssl);
    config.setBot(null);
    ApiClientFactory apiClientFactory = new ApiClientFactory(mock(BdkConfig.class));
    AuthenticatorFactory authenticatorFactory =
        new AuthenticatorFactory(mock(BdkConfig.class), mock(ApiClientFactory.class));

    // Act
    SymphonyBdk actualSymphonyBdk = new SymphonyBdk(config, apiClientFactory, authenticatorFactory);

    // Assert
    BdkConfig configResult = actualSymphonyBdk.config();
    assertNull(configResult.getBot());
    BdkExtAppConfig app2 = configResult.getApp();
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), app2.getCertificateContent());
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), app2.getPrivateKeyContent());
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), app2.getPrivateKey().getContent());
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
   *   <li>Then return config Bot Username is empty string.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyBdk#SymphonyBdk(BdkConfig, ApiClientFactory,
   * AuthenticatorFactory)}
   */
  @Test
  @DisplayName(
      "Test new SymphonyBdk(BdkConfig, ApiClientFactory, AuthenticatorFactory); then return config Bot Username is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SymphonyBdk.<init>(BdkConfig, ApiClientFactory, AuthenticatorFactory)"})
  void testNewSymphonyBdk_thenReturnConfigBotUsernameIsEmptyString()
      throws AuthInitializationException, AuthUnauthorizedException, UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkExtAppConfig app = new BdkExtAppConfig();
    app.setAppId("");
    app.setCertificate(new BdkCertificateConfig());
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
    ssl.setTrustStore(new BdkCertificateConfig());
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkRsaKeyConfig privateKey2 = new BdkRsaKeyConfig();
    privateKey2.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey2.setPath("Path");

    BdkBotConfig bot = new BdkBotConfig();
    bot.setCertificate(new BdkCertificateConfig());
    bot.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setCertificatePassword("iloveyou");
    bot.setCertificatePath("Certificate Path");
    bot.setPrivateKey(privateKey2);
    bot.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setPrivateKeyPath("Private Key Path");
    bot.setUsername("");

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
    config.setProxy(new BdkProxyConfig());
    config.setReadTimeout(10);
    config.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    config.setScheme("Scheme");
    config.setSessionAuth(new BdkClientConfig());
    config.setSsl(ssl);
    config.setBot(bot);
    AuthenticatorFactory authenticatorFactory =
        new AuthenticatorFactory(mock(BdkConfig.class), mock(ApiClientFactory.class));

    // Act
    SymphonyBdk actualSymphonyBdk = new SymphonyBdk(config, null, authenticatorFactory);

    // Assert
    BdkConfig configResult = actualSymphonyBdk.config();
    BdkBotConfig bot2 = configResult.getBot();
    assertEquals("", bot2.getUsername());
    assertSame(configResult, configResult.getAgent().getParentConfig());
    assertSame(configResult, configResult.getKeyManager().getParentConfig());
    assertSame(configResult, configResult.getPod().getParentConfig());
    assertSame(configResult, configResult.getSessionAuth().getParentConfig());
    BdkExtAppConfig app2 = configResult.getApp();
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), app2.getCertificateContent());
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), bot2.getCertificateContent());
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), app2.getPrivateKeyContent());
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), bot2.getPrivateKeyContent());
  }

  /**
   * Test {@link SymphonyBdk#SymphonyBdk(BdkConfig, ApiClientFactory, AuthenticatorFactory)}.
   *
   * <ul>
   *   <li>Then return config Bot Username is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyBdk#SymphonyBdk(BdkConfig, ApiClientFactory,
   * AuthenticatorFactory)}
   */
  @Test
  @DisplayName(
      "Test new SymphonyBdk(BdkConfig, ApiClientFactory, AuthenticatorFactory); then return config Bot Username is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SymphonyBdk.<init>(BdkConfig, ApiClientFactory, AuthenticatorFactory)"})
  void testNewSymphonyBdk_thenReturnConfigBotUsernameIsNull()
      throws AuthInitializationException, AuthUnauthorizedException, UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkExtAppConfig app = new BdkExtAppConfig();
    app.setAppId(null);
    app.setCertificate(new BdkCertificateConfig());
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
    ssl.setTrustStore(new BdkCertificateConfig());
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkRsaKeyConfig privateKey2 = new BdkRsaKeyConfig();
    privateKey2.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey2.setPath("Path");

    BdkBotConfig bot = new BdkBotConfig();
    bot.setCertificate(new BdkCertificateConfig());
    bot.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setCertificatePassword("iloveyou");
    bot.setCertificatePath("Certificate Path");
    bot.setPrivateKey(privateKey2);
    bot.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setPrivateKeyPath("Private Key Path");
    bot.setUsername(null);

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
    config.setProxy(new BdkProxyConfig());
    config.setReadTimeout(10);
    config.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    config.setScheme("Scheme");
    config.setSessionAuth(new BdkClientConfig());
    config.setSsl(ssl);
    config.setBot(bot);
    ApiClientFactory apiClientFactory = new ApiClientFactory(mock(BdkConfig.class));
    AuthenticatorFactory authenticatorFactory =
        new AuthenticatorFactory(mock(BdkConfig.class), mock(ApiClientFactory.class));

    // Act
    SymphonyBdk actualSymphonyBdk = new SymphonyBdk(config, apiClientFactory, authenticatorFactory);

    // Assert
    BdkConfig configResult = actualSymphonyBdk.config();
    BdkBotConfig bot2 = configResult.getBot();
    assertNull(bot2.getUsername());
    BdkExtAppConfig app2 = configResult.getApp();
    assertNull(app2.getAppId());
    byte[] certificateContent = bot2.getCertificateContent();
    BdkCertificateConfig certificateConfig = bot2.getCertificateConfig();
    assertSame(certificateContent, certificateConfig.getCertificateBytes());
    assertSame(certificateContent, certificateConfig.getContent());
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), app2.getCertificateContent());
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), certificateContent);
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), app2.getPrivateKeyContent());
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), bot2.getPrivateKeyContent());
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), app2.getPrivateKey().getContent());
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), bot2.getPrivateKey().getContent());
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
    app.setCertificate(new BdkCertificateConfig());
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
    ssl.setTrustStore(new BdkCertificateConfig());
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkRsaKeyConfig privateKey2 = new BdkRsaKeyConfig();
    privateKey2.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey2.setPath("Path");

    BdkBotConfig bot = new BdkBotConfig();
    bot.setCertificate(new BdkCertificateConfig());
    bot.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setCertificatePassword("iloveyou");
    bot.setCertificatePath("Certificate Path");
    bot.setPrivateKey(privateKey2);
    bot.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setPrivateKeyPath("Private Key Path");
    bot.setUsername("not empty");

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
    config.setProxy(new BdkProxyConfig());
    config.setReadTimeout(10);
    config.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    config.setScheme("Scheme");
    config.setSessionAuth(new BdkClientConfig());
    config.setSsl(ssl);
    config.setBot(bot);
    ApiClientFactory apiClientFactory = new ApiClientFactory(mock(BdkConfig.class));

    BdkConfig bdkConfig = mock(BdkConfig.class);
    when(bdkConfig.getApp()).thenThrow(new IllegalStateException());
    AuthenticatorFactory authenticatorFactory =
        new AuthenticatorFactory(bdkConfig, mock(ApiClientFactory.class));

    // Act and Assert
    assertThrows(
        IllegalStateException.class,
        () -> new SymphonyBdk(config, apiClientFactory, authenticatorFactory));
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

  /**
   * Test {@link SymphonyBdk#http()}.
   *
   * <p>Method under test: {@link SymphonyBdk#http()}
   */
  @Test
  @DisplayName("Test http()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.symphony.bdk.http.api.HttpClient.Builder SymphonyBdk.http()"})
  void testHttp() throws AuthInitializationException, AuthUnauthorizedException {
    // Arrange
    BdkConfig config = mock(BdkConfig.class);
    when(config.isBotConfigured()).thenReturn(false);
    when(config.isOboConfigured()).thenReturn(false);
    when(config.getRetry()).thenReturn(BdkRetryConfigTestHelper.ofMinimalInterval(3));

    // Act
    new SymphonyBdk(config).http();

    // Assert
    verify(config).getRetry();
    verify(config).isBotConfigured();
    verify(config, atLeast(1)).isOboConfigured();
  }

  /**
   * Test {@link SymphonyBdk#obo(Long)} with {@code id}.
   *
   * <p>Method under test: {@link SymphonyBdk#obo(Long)}
   */
  @Test
  @DisplayName("Test obo(Long) with 'id'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.symphony.bdk.core.auth.AuthSession SymphonyBdk.obo(Long)"})
  void testOboWithId() throws AuthInitializationException, AuthUnauthorizedException {
    // Arrange
    BdkConfig config = mock(BdkConfig.class);
    when(config.isBotConfigured()).thenReturn(false);
    when(config.isOboConfigured()).thenReturn(false);
    when(config.getRetry()).thenReturn(BdkRetryConfigTestHelper.ofMinimalInterval(3));

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> new SymphonyBdk(config).obo(1L));
    verify(config).getRetry();
    verify(config).isBotConfigured();
    verify(config, atLeast(1)).isOboConfigured();
  }

  /**
   * Test {@link SymphonyBdk#obo(String)} with {@code username}.
   *
   * <p>Method under test: {@link SymphonyBdk#obo(String)}
   */
  @Test
  @DisplayName("Test obo(String) with 'username'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.symphony.bdk.core.auth.AuthSession SymphonyBdk.obo(String)"})
  void testOboWithUsername() throws AuthInitializationException, AuthUnauthorizedException {
    // Arrange
    BdkConfig config = mock(BdkConfig.class);
    when(config.isBotConfigured()).thenReturn(false);
    when(config.isOboConfigured()).thenReturn(false);
    when(config.getRetry()).thenReturn(BdkRetryConfigTestHelper.ofMinimalInterval(3));

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> new SymphonyBdk(config).obo("janedoe"));
    verify(config).getRetry();
    verify(config).isBotConfigured();
    verify(config, atLeast(1)).isOboConfigured();
  }

  /**
   * Test {@link SymphonyBdk#appAuthenticator()}.
   *
   * <p>Method under test: {@link SymphonyBdk#appAuthenticator()}
   */
  @Test
  @DisplayName("Test appAuthenticator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.core.auth.ExtensionAppAuthenticator SymphonyBdk.appAuthenticator()"
  })
  void testAppAuthenticator() throws AuthInitializationException, AuthUnauthorizedException {
    // Arrange
    BdkConfig config = mock(BdkConfig.class);
    when(config.isBotConfigured()).thenReturn(false);
    when(config.isOboConfigured()).thenReturn(false);
    when(config.getRetry()).thenReturn(BdkRetryConfigTestHelper.ofMinimalInterval(3));

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> new SymphonyBdk(config).appAuthenticator());
    verify(config).getRetry();
    verify(config).isBotConfigured();
    verify(config, atLeast(1)).isOboConfigured();
  }

  /**
   * Test {@link SymphonyBdk#extensions()}.
   *
   * <p>Method under test: {@link SymphonyBdk#extensions()}
   */
  @Test
  @DisplayName("Test extensions()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.symphony.bdk.core.extension.ExtensionService SymphonyBdk.extensions()"})
  void testExtensions() throws AuthInitializationException, AuthUnauthorizedException {
    // Arrange
    BdkConfig config = mock(BdkConfig.class);
    when(config.isBotConfigured()).thenReturn(false);
    when(config.isOboConfigured()).thenReturn(false);
    when(config.getRetry()).thenReturn(BdkRetryConfigTestHelper.ofMinimalInterval(3));

    // Act
    new SymphonyBdk(config).extensions();

    // Assert
    verify(config).getRetry();
    verify(config).isBotConfigured();
    verify(config, atLeast(1)).isOboConfigured();
  }

  /**
   * Test {@link SymphonyBdk#getExtensionAppAuthenticator()}.
   *
   * <p>Method under test: {@link SymphonyBdk#getExtensionAppAuthenticator()}
   */
  @Test
  @DisplayName("Test getExtensionAppAuthenticator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.core.auth.ExtensionAppAuthenticator SymphonyBdk.getExtensionAppAuthenticator()"
  })
  void testGetExtensionAppAuthenticator()
      throws AuthInitializationException, AuthUnauthorizedException {
    // Arrange
    BdkConfig config = mock(BdkConfig.class);
    when(config.isBotConfigured()).thenReturn(false);
    when(config.isOboConfigured()).thenReturn(false);
    when(config.getRetry()).thenReturn(BdkRetryConfigTestHelper.ofMinimalInterval(3));

    // Act and Assert
    assertThrows(
        IllegalStateException.class, () -> new SymphonyBdk(config).getExtensionAppAuthenticator());
    verify(config).getRetry();
    verify(config).isBotConfigured();
    verify(config, atLeast(1)).isOboConfigured();
  }

  /**
   * Test {@link SymphonyBdk#getOboAuthenticator()}.
   *
   * <p>Method under test: {@link SymphonyBdk#getOboAuthenticator()}
   */
  @Test
  @DisplayName("Test getOboAuthenticator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.core.auth.OboAuthenticator SymphonyBdk.getOboAuthenticator()"
  })
  void testGetOboAuthenticator() throws AuthInitializationException, AuthUnauthorizedException {
    // Arrange
    BdkConfig config = mock(BdkConfig.class);
    when(config.isBotConfigured()).thenReturn(false);
    when(config.isOboConfigured()).thenReturn(false);
    when(config.getRetry()).thenReturn(BdkRetryConfigTestHelper.ofMinimalInterval(3));

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> new SymphonyBdk(config).getOboAuthenticator());
    verify(config).getRetry();
    verify(config).isBotConfigured();
    verify(config, atLeast(1)).isOboConfigured();
  }
}
