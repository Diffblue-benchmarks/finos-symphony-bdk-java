package com.symphony.bdk.core.config.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkClientConfigDiffblueTest {
  /**
   * Test {@link BdkClientConfig#BdkClientConfig(BdkConfig)}.
   *
   * <ul>
   *   <li>Then return {@code Context}.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BdkClientConfig#BdkClientConfig(BdkConfig)}
   *   <li>{@link BdkClientConfig#BdkClientConfig()}
   * </ul>
   */
  @Test
  @DisplayName("Test new BdkClientConfig(BdkConfig); then return 'Context'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BdkClientConfig.<init>()", "void BdkClientConfig.<init>(BdkConfig)"})
  void testNewBdkClientConfig_thenReturnContext() throws UnsupportedEncodingException {
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
    datafeed.setRetry(new BdkRetryConfig());
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(new BdkRetryConfig());
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkConfig parentConfig = new BdkConfig();
    parentConfig.setAgent(new BdkAgentConfig());
    parentConfig.setApp(app);
    parentConfig.setBot(bot);
    parentConfig.setCommonJwt(commonJwt);
    parentConfig.setConnectionPoolMax(1);
    parentConfig.setConnectionPoolPerRoute(1);
    parentConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    BdkProxyConfig proxy = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");

    parentConfig.setProxy(proxy);
    parentConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setRetry(new BdkRetryConfig());
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    // Act
    BdkClientConfig actualBdkClientConfig = new BdkClientConfig(parentConfig);

    // Assert
    assertEquals("Context", actualBdkClientConfig.getContext());
    assertEquals("Scheme", actualBdkClientConfig.getScheme());
    Map<String, String> defaultHeaders2 = actualBdkClientConfig.getDefaultHeaders();
    assertEquals(1, defaultHeaders2.size());
    assertEquals("alice.liddell@example.org", defaultHeaders2.get("Delivered-To"));
    assertEquals("localhost", actualBdkClientConfig.getHost());
    assertEquals(1, actualBdkClientConfig.getConnectionPoolMax().intValue());
    assertEquals(1, actualBdkClientConfig.getConnectionPoolPerRoute().intValue());
    assertEquals(8080, actualBdkClientConfig.getPort().intValue());
    assertEquals(
        BdkRetryConfig.DEFAULT_MAX_ATTEMPTS,
        actualBdkClientConfig.getConnectionTimeout().intValue());
    assertEquals(
        BdkRetryConfig.DEFAULT_MAX_ATTEMPTS, actualBdkClientConfig.getReadTimeout().intValue());
    assertSame(parentConfig, actualBdkClientConfig.getParentConfig());
    assertSame(proxy, actualBdkClientConfig.getProxy());
    assertSame(defaultHeaders, defaultHeaders2);
  }

  /**
   * Test {@link BdkClientConfig#BdkClientConfig()}.
   *
   * <ul>
   *   <li>Then return ParentConfig is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkClientConfig#BdkClientConfig()}
   */
  @Test
  @DisplayName("Test new BdkClientConfig(); then return ParentConfig is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BdkClientConfig.<init>()", "void BdkClientConfig.<init>(BdkConfig)"})
  void testNewBdkClientConfig_thenReturnParentConfigIsNull() {
    // Arrange, Act and Assert
    assertNull(new BdkClientConfig().getParentConfig());
  }

  /**
   * Test {@link BdkClientConfig#overridesParentConfig()}.
   *
   * <p>Method under test: {@link BdkClientConfig#overridesParentConfig()}
   */
  @Test
  @DisplayName("Test overridesParentConfig()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkClientConfig.overridesParentConfig()"})
  void testOverridesParentConfig() throws UnsupportedEncodingException {
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
    datafeed.setRetry(new BdkRetryConfig());
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(new BdkRetryConfig());
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkConfig parentConfig = new BdkConfig();
    parentConfig.setAgent(new BdkAgentConfig());
    parentConfig.setApp(app);
    parentConfig.setBot(bot);
    parentConfig.setCommonJwt(commonJwt);
    parentConfig.setConnectionPoolMax(1);
    parentConfig.setConnectionPoolPerRoute(1);
    parentConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    parentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    parentConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setRetry(new BdkRetryConfig());
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    BdkClientConfig bdkClientConfig = new BdkClientConfig(parentConfig);
    bdkClientConfig.setScheme(null);
    bdkClientConfig.setHost(null);
    bdkClientConfig.setPort(null);
    bdkClientConfig.setContext("foo");

    // Act and Assert
    assertTrue(bdkClientConfig.overridesParentConfig());
  }

  /**
   * Test {@link BdkClientConfig#overridesParentConfig()}.
   *
   * <p>Method under test: {@link BdkClientConfig#overridesParentConfig()}
   */
  @Test
  @DisplayName("Test overridesParentConfig()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkClientConfig.overridesParentConfig()"})
  void testOverridesParentConfig2() throws UnsupportedEncodingException {
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
    datafeed.setRetry(new BdkRetryConfig());
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(new BdkRetryConfig());
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkConfig parentConfig = new BdkConfig();
    parentConfig.setAgent(new BdkAgentConfig());
    parentConfig.setApp(app);
    parentConfig.setBot(bot);
    parentConfig.setCommonJwt(commonJwt);
    parentConfig.setConnectionPoolMax(1);
    parentConfig.setConnectionPoolPerRoute(1);
    parentConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    parentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    parentConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setRetry(new BdkRetryConfig());
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    BdkClientConfig bdkClientConfig = new BdkClientConfig(parentConfig);
    bdkClientConfig.setScheme(null);
    bdkClientConfig.setHost(null);
    bdkClientConfig.setPort(1);
    bdkClientConfig.setContext(null);

    // Act and Assert
    assertTrue(bdkClientConfig.overridesParentConfig());
  }

  /**
   * Test {@link BdkClientConfig#overridesParentConfig()}.
   *
   * <p>Method under test: {@link BdkClientConfig#overridesParentConfig()}
   */
  @Test
  @DisplayName("Test overridesParentConfig()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkClientConfig.overridesParentConfig()"})
  void testOverridesParentConfig3() throws UnsupportedEncodingException {
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
    datafeed.setRetry(new BdkRetryConfig());
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(new BdkRetryConfig());
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkConfig parentConfig = new BdkConfig();
    parentConfig.setAgent(new BdkAgentConfig());
    parentConfig.setApp(app);
    parentConfig.setBot(bot);
    parentConfig.setCommonJwt(commonJwt);
    parentConfig.setConnectionPoolMax(1);
    parentConfig.setConnectionPoolPerRoute(1);
    parentConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    parentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    parentConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setRetry(new BdkRetryConfig());
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    BdkClientConfig bdkClientConfig = new BdkClientConfig(parentConfig);
    bdkClientConfig.setScheme(null);
    bdkClientConfig.setHost("foo");
    bdkClientConfig.setPort(null);
    bdkClientConfig.setContext(null);

    // Act and Assert
    assertTrue(bdkClientConfig.overridesParentConfig());
  }

  /**
   * Test {@link BdkClientConfig#overridesParentConfig()}.
   *
   * <p>Method under test: {@link BdkClientConfig#overridesParentConfig()}
   */
  @Test
  @DisplayName("Test overridesParentConfig()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkClientConfig.overridesParentConfig()"})
  void testOverridesParentConfig4() throws UnsupportedEncodingException {
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
    datafeed.setRetry(new BdkRetryConfig());
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(new BdkRetryConfig());
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkConfig parentConfig = new BdkConfig();
    parentConfig.setAgent(new BdkAgentConfig());
    parentConfig.setApp(app);
    parentConfig.setBot(bot);
    parentConfig.setCommonJwt(commonJwt);
    parentConfig.setConnectionPoolMax(1);
    parentConfig.setConnectionPoolPerRoute(1);
    parentConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    parentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    parentConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setRetry(new BdkRetryConfig());
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    BdkClientConfig bdkClientConfig = new BdkClientConfig(parentConfig);
    bdkClientConfig.setScheme("foo");
    bdkClientConfig.setHost(null);
    bdkClientConfig.setPort(null);
    bdkClientConfig.setContext(null);

    // Act and Assert
    assertTrue(bdkClientConfig.overridesParentConfig());
  }

  /**
   * Test {@link BdkClientConfig#overridesParentConfig()}.
   *
   * <ul>
   *   <li>Given {@link BdkClientConfig#BdkClientConfig()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link BdkClientConfig#overridesParentConfig()}
   */
  @Test
  @DisplayName("Test overridesParentConfig(); given BdkClientConfig(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkClientConfig.overridesParentConfig()"})
  void testOverridesParentConfig_givenBdkClientConfig_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(new BdkClientConfig().overridesParentConfig());
  }

  /**
   * Test {@link BdkClientConfig#getScheme()}.
   *
   * <ul>
   *   <li>Then return {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link BdkClientConfig#getScheme()}
   */
  @Test
  @DisplayName("Test getScheme(); then return 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BdkClientConfig.getScheme()"})
  void testGetScheme_thenReturnFoo() throws UnsupportedEncodingException {
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
    datafeed.setRetry(new BdkRetryConfig());
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(new BdkRetryConfig());
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkConfig parentConfig = new BdkConfig();
    parentConfig.setAgent(new BdkAgentConfig());
    parentConfig.setApp(app);
    parentConfig.setBot(bot);
    parentConfig.setCommonJwt(commonJwt);
    parentConfig.setConnectionPoolMax(1);
    parentConfig.setConnectionPoolPerRoute(1);
    parentConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    parentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    parentConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setRetry(new BdkRetryConfig());
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    BdkClientConfig bdkClientConfig = new BdkClientConfig(parentConfig);
    bdkClientConfig.setScheme("foo");

    // Act and Assert
    assertEquals("foo", bdkClientConfig.getScheme());
  }

  /**
   * Test {@link BdkClientConfig#getScheme()}.
   *
   * <ul>
   *   <li>Then return {@code Scheme}.
   * </ul>
   *
   * <p>Method under test: {@link BdkClientConfig#getScheme()}
   */
  @Test
  @DisplayName("Test getScheme(); then return 'Scheme'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BdkClientConfig.getScheme()"})
  void testGetScheme_thenReturnScheme() throws UnsupportedEncodingException {
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
    datafeed.setRetry(new BdkRetryConfig());
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(new BdkRetryConfig());
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkConfig parentConfig = new BdkConfig();
    parentConfig.setAgent(new BdkAgentConfig());
    parentConfig.setApp(app);
    parentConfig.setBot(bot);
    parentConfig.setCommonJwt(commonJwt);
    parentConfig.setConnectionPoolMax(1);
    parentConfig.setConnectionPoolPerRoute(1);
    parentConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    parentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    parentConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setRetry(new BdkRetryConfig());
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    BdkClientConfig bdkClientConfig = new BdkClientConfig(parentConfig);
    bdkClientConfig.setScheme(null);

    // Act and Assert
    assertEquals("Scheme", bdkClientConfig.getScheme());
  }

  /**
   * Test {@link BdkClientConfig#getHost()}.
   *
   * <ul>
   *   <li>Then return {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link BdkClientConfig#getHost()}
   */
  @Test
  @DisplayName("Test getHost(); then return 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BdkClientConfig.getHost()"})
  void testGetHost_thenReturnFoo() throws UnsupportedEncodingException {
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
    datafeed.setRetry(new BdkRetryConfig());
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(new BdkRetryConfig());
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkConfig parentConfig = new BdkConfig();
    parentConfig.setAgent(new BdkAgentConfig());
    parentConfig.setApp(app);
    parentConfig.setBot(bot);
    parentConfig.setCommonJwt(commonJwt);
    parentConfig.setConnectionPoolMax(1);
    parentConfig.setConnectionPoolPerRoute(1);
    parentConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    parentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    parentConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setRetry(new BdkRetryConfig());
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    BdkClientConfig bdkClientConfig = new BdkClientConfig(parentConfig);
    bdkClientConfig.setHost("foo");

    // Act and Assert
    assertEquals("foo", bdkClientConfig.getHost());
  }

  /**
   * Test {@link BdkClientConfig#getHost()}.
   *
   * <ul>
   *   <li>Then return {@code localhost}.
   * </ul>
   *
   * <p>Method under test: {@link BdkClientConfig#getHost()}
   */
  @Test
  @DisplayName("Test getHost(); then return 'localhost'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BdkClientConfig.getHost()"})
  void testGetHost_thenReturnLocalhost() throws UnsupportedEncodingException {
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
    datafeed.setRetry(new BdkRetryConfig());
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(new BdkRetryConfig());
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkConfig parentConfig = new BdkConfig();
    parentConfig.setAgent(new BdkAgentConfig());
    parentConfig.setApp(app);
    parentConfig.setBot(bot);
    parentConfig.setCommonJwt(commonJwt);
    parentConfig.setConnectionPoolMax(1);
    parentConfig.setConnectionPoolPerRoute(1);
    parentConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    parentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    parentConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setRetry(new BdkRetryConfig());
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    BdkClientConfig bdkClientConfig = new BdkClientConfig(parentConfig);
    bdkClientConfig.setHost(null);

    // Act and Assert
    assertEquals("localhost", bdkClientConfig.getHost());
  }

  /**
   * Test {@link BdkClientConfig#getPort()}.
   *
   * <ul>
   *   <li>Then return intValue is {@code 8080}.
   * </ul>
   *
   * <p>Method under test: {@link BdkClientConfig#getPort()}
   */
  @Test
  @DisplayName("Test getPort(); then return intValue is '8080'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Integer BdkClientConfig.getPort()"})
  void testGetPort_thenReturnIntValueIs8080() throws UnsupportedEncodingException {
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
    datafeed.setRetry(new BdkRetryConfig());
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(new BdkRetryConfig());
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkConfig parentConfig = new BdkConfig();
    parentConfig.setAgent(new BdkAgentConfig());
    parentConfig.setApp(app);
    parentConfig.setBot(bot);
    parentConfig.setCommonJwt(commonJwt);
    parentConfig.setConnectionPoolMax(1);
    parentConfig.setConnectionPoolPerRoute(1);
    parentConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    parentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    parentConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setRetry(new BdkRetryConfig());
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    BdkClientConfig bdkClientConfig = new BdkClientConfig(parentConfig);
    bdkClientConfig.setPort(null);

    // Act and Assert
    assertEquals(8080, bdkClientConfig.getPort().intValue());
  }

  /**
   * Test {@link BdkClientConfig#getPort()}.
   *
   * <ul>
   *   <li>Then return intValue is one.
   * </ul>
   *
   * <p>Method under test: {@link BdkClientConfig#getPort()}
   */
  @Test
  @DisplayName("Test getPort(); then return intValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Integer BdkClientConfig.getPort()"})
  void testGetPort_thenReturnIntValueIsOne() throws UnsupportedEncodingException {
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
    datafeed.setRetry(new BdkRetryConfig());
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(new BdkRetryConfig());
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkConfig parentConfig = new BdkConfig();
    parentConfig.setAgent(new BdkAgentConfig());
    parentConfig.setApp(app);
    parentConfig.setBot(bot);
    parentConfig.setCommonJwt(commonJwt);
    parentConfig.setConnectionPoolMax(1);
    parentConfig.setConnectionPoolPerRoute(1);
    parentConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    parentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    parentConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setRetry(new BdkRetryConfig());
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    BdkClientConfig bdkClientConfig = new BdkClientConfig(parentConfig);
    bdkClientConfig.setPort(1);

    // Act and Assert
    assertEquals(1, bdkClientConfig.getPort().intValue());
  }

  /**
   * Test {@link BdkClientConfig#getContext()}.
   *
   * <ul>
   *   <li>Then return {@code Context}.
   * </ul>
   *
   * <p>Method under test: {@link BdkClientConfig#getContext()}
   */
  @Test
  @DisplayName("Test getContext(); then return 'Context'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BdkClientConfig.getContext()"})
  void testGetContext_thenReturnContext() throws UnsupportedEncodingException {
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
    datafeed.setRetry(new BdkRetryConfig());
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(new BdkRetryConfig());
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkConfig parentConfig = new BdkConfig();
    parentConfig.setAgent(new BdkAgentConfig());
    parentConfig.setApp(app);
    parentConfig.setBot(bot);
    parentConfig.setCommonJwt(commonJwt);
    parentConfig.setConnectionPoolMax(1);
    parentConfig.setConnectionPoolPerRoute(1);
    parentConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    parentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    parentConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setRetry(new BdkRetryConfig());
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    BdkClientConfig bdkClientConfig = new BdkClientConfig(parentConfig);
    bdkClientConfig.setContext(null);

    // Act and Assert
    assertEquals("Context", bdkClientConfig.getContext());
  }

  /**
   * Test {@link BdkClientConfig#getContext()}.
   *
   * <ul>
   *   <li>Then return {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link BdkClientConfig#getContext()}
   */
  @Test
  @DisplayName("Test getContext(); then return 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BdkClientConfig.getContext()"})
  void testGetContext_thenReturnFoo() throws UnsupportedEncodingException {
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
    datafeed.setRetry(new BdkRetryConfig());
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(new BdkRetryConfig());
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkConfig parentConfig = new BdkConfig();
    parentConfig.setAgent(new BdkAgentConfig());
    parentConfig.setApp(app);
    parentConfig.setBot(bot);
    parentConfig.setCommonJwt(commonJwt);
    parentConfig.setConnectionPoolMax(1);
    parentConfig.setConnectionPoolPerRoute(1);
    parentConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    parentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    parentConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setRetry(new BdkRetryConfig());
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    BdkClientConfig bdkClientConfig = new BdkClientConfig(parentConfig);
    bdkClientConfig.setContext("foo");

    // Act and Assert
    assertEquals("foo", bdkClientConfig.getContext());
  }

  /**
   * Test {@link BdkClientConfig#getConnectionTimeout()}.
   *
   * <ul>
   *   <li>Then return intValue is {@link BdkRetryConfig#DEFAULT_MAX_ATTEMPTS}.
   * </ul>
   *
   * <p>Method under test: {@link BdkClientConfig#getConnectionTimeout()}
   */
  @Test
  @DisplayName("Test getConnectionTimeout(); then return intValue is DEFAULT_MAX_ATTEMPTS")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Integer BdkClientConfig.getConnectionTimeout()"})
  void testGetConnectionTimeout_thenReturnIntValueIsDefault_max_attempts()
      throws UnsupportedEncodingException {
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
    datafeed.setRetry(new BdkRetryConfig());
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(new BdkRetryConfig());
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkConfig parentConfig = new BdkConfig();
    parentConfig.setAgent(new BdkAgentConfig());
    parentConfig.setApp(app);
    parentConfig.setBot(bot);
    parentConfig.setCommonJwt(commonJwt);
    parentConfig.setConnectionPoolMax(1);
    parentConfig.setConnectionPoolPerRoute(1);
    parentConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    parentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    parentConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setRetry(new BdkRetryConfig());
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    BdkClientConfig bdkClientConfig = new BdkClientConfig(parentConfig);
    bdkClientConfig.setConnectionTimeout(null);

    // Act and Assert
    assertEquals(
        BdkRetryConfig.DEFAULT_MAX_ATTEMPTS, bdkClientConfig.getConnectionTimeout().intValue());
  }

  /**
   * Test {@link BdkClientConfig#getConnectionTimeout()}.
   *
   * <ul>
   *   <li>Then return intValue is one.
   * </ul>
   *
   * <p>Method under test: {@link BdkClientConfig#getConnectionTimeout()}
   */
  @Test
  @DisplayName("Test getConnectionTimeout(); then return intValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Integer BdkClientConfig.getConnectionTimeout()"})
  void testGetConnectionTimeout_thenReturnIntValueIsOne() throws UnsupportedEncodingException {
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
    datafeed.setRetry(new BdkRetryConfig());
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(new BdkRetryConfig());
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkConfig parentConfig = new BdkConfig();
    parentConfig.setAgent(new BdkAgentConfig());
    parentConfig.setApp(app);
    parentConfig.setBot(bot);
    parentConfig.setCommonJwt(commonJwt);
    parentConfig.setConnectionPoolMax(1);
    parentConfig.setConnectionPoolPerRoute(1);
    parentConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    parentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    parentConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setRetry(new BdkRetryConfig());
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    BdkClientConfig bdkClientConfig = new BdkClientConfig(parentConfig);
    bdkClientConfig.setConnectionTimeout(1);

    // Act and Assert
    assertEquals(1, bdkClientConfig.getConnectionTimeout().intValue());
  }

  /**
   * Test {@link BdkClientConfig#getReadTimeout()}.
   *
   * <ul>
   *   <li>Then return intValue is {@link BdkRetryConfig#DEFAULT_MAX_ATTEMPTS}.
   * </ul>
   *
   * <p>Method under test: {@link BdkClientConfig#getReadTimeout()}
   */
  @Test
  @DisplayName("Test getReadTimeout(); then return intValue is DEFAULT_MAX_ATTEMPTS")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Integer BdkClientConfig.getReadTimeout()"})
  void testGetReadTimeout_thenReturnIntValueIsDefault_max_attempts()
      throws UnsupportedEncodingException {
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
    datafeed.setRetry(new BdkRetryConfig());
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(new BdkRetryConfig());
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkConfig parentConfig = new BdkConfig();
    parentConfig.setAgent(new BdkAgentConfig());
    parentConfig.setApp(app);
    parentConfig.setBot(bot);
    parentConfig.setCommonJwt(commonJwt);
    parentConfig.setConnectionPoolMax(1);
    parentConfig.setConnectionPoolPerRoute(1);
    parentConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    parentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    parentConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setRetry(new BdkRetryConfig());
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    BdkClientConfig bdkClientConfig = new BdkClientConfig(parentConfig);
    bdkClientConfig.setReadTimeout(null);

    // Act and Assert
    assertEquals(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS, bdkClientConfig.getReadTimeout().intValue());
  }

  /**
   * Test {@link BdkClientConfig#getReadTimeout()}.
   *
   * <ul>
   *   <li>Then return intValue is one.
   * </ul>
   *
   * <p>Method under test: {@link BdkClientConfig#getReadTimeout()}
   */
  @Test
  @DisplayName("Test getReadTimeout(); then return intValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Integer BdkClientConfig.getReadTimeout()"})
  void testGetReadTimeout_thenReturnIntValueIsOne() throws UnsupportedEncodingException {
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
    datafeed.setRetry(new BdkRetryConfig());
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(new BdkRetryConfig());
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkConfig parentConfig = new BdkConfig();
    parentConfig.setAgent(new BdkAgentConfig());
    parentConfig.setApp(app);
    parentConfig.setBot(bot);
    parentConfig.setCommonJwt(commonJwt);
    parentConfig.setConnectionPoolMax(1);
    parentConfig.setConnectionPoolPerRoute(1);
    parentConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    parentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    parentConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setRetry(new BdkRetryConfig());
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    BdkClientConfig bdkClientConfig = new BdkClientConfig(parentConfig);
    bdkClientConfig.setReadTimeout(1);

    // Act and Assert
    assertEquals(1, bdkClientConfig.getReadTimeout().intValue());
  }

  /**
   * Test {@link BdkClientConfig#getConnectionPoolMax()}.
   *
   * <p>Method under test: {@link BdkClientConfig#getConnectionPoolMax()}
   */
  @Test
  @DisplayName("Test getConnectionPoolMax()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Integer BdkClientConfig.getConnectionPoolMax()"})
  void testGetConnectionPoolMax() throws UnsupportedEncodingException {
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
    datafeed.setRetry(new BdkRetryConfig());
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(new BdkRetryConfig());
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkConfig parentConfig = new BdkConfig();
    parentConfig.setAgent(new BdkAgentConfig());
    parentConfig.setApp(app);
    parentConfig.setBot(bot);
    parentConfig.setCommonJwt(commonJwt);
    parentConfig.setConnectionPoolMax(1);
    parentConfig.setConnectionPoolPerRoute(1);
    parentConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    parentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    parentConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setRetry(new BdkRetryConfig());
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    BdkClientConfig bdkClientConfig = new BdkClientConfig(parentConfig);
    bdkClientConfig.setConnectionPoolMax(null);

    // Act and Assert
    assertEquals(1, bdkClientConfig.getConnectionPoolMax().intValue());
  }

  /**
   * Test {@link BdkClientConfig#getConnectionPoolMax()}.
   *
   * <p>Method under test: {@link BdkClientConfig#getConnectionPoolMax()}
   */
  @Test
  @DisplayName("Test getConnectionPoolMax()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Integer BdkClientConfig.getConnectionPoolMax()"})
  void testGetConnectionPoolMax2() throws UnsupportedEncodingException {
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
    datafeed.setRetry(new BdkRetryConfig());
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(new BdkRetryConfig());
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkConfig parentConfig = new BdkConfig();
    parentConfig.setAgent(new BdkAgentConfig());
    parentConfig.setApp(app);
    parentConfig.setBot(bot);
    parentConfig.setCommonJwt(commonJwt);
    parentConfig.setConnectionPoolMax(1);
    parentConfig.setConnectionPoolPerRoute(1);
    parentConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    parentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    parentConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setRetry(new BdkRetryConfig());
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    BdkClientConfig bdkClientConfig = new BdkClientConfig(parentConfig);
    bdkClientConfig.setConnectionPoolMax(1);

    // Act and Assert
    assertEquals(1, bdkClientConfig.getConnectionPoolMax().intValue());
  }

  /**
   * Test {@link BdkClientConfig#getConnectionPoolPerRoute()}.
   *
   * <p>Method under test: {@link BdkClientConfig#getConnectionPoolPerRoute()}
   */
  @Test
  @DisplayName("Test getConnectionPoolPerRoute()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Integer BdkClientConfig.getConnectionPoolPerRoute()"})
  void testGetConnectionPoolPerRoute() throws UnsupportedEncodingException {
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
    datafeed.setRetry(new BdkRetryConfig());
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(new BdkRetryConfig());
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkConfig parentConfig = new BdkConfig();
    parentConfig.setAgent(new BdkAgentConfig());
    parentConfig.setApp(app);
    parentConfig.setBot(bot);
    parentConfig.setCommonJwt(commonJwt);
    parentConfig.setConnectionPoolMax(1);
    parentConfig.setConnectionPoolPerRoute(1);
    parentConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    parentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    parentConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setRetry(new BdkRetryConfig());
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    BdkClientConfig bdkClientConfig = new BdkClientConfig(parentConfig);
    bdkClientConfig.setConnectionPoolPerRoute(null);

    // Act and Assert
    assertEquals(1, bdkClientConfig.getConnectionPoolPerRoute().intValue());
  }

  /**
   * Test {@link BdkClientConfig#getConnectionPoolPerRoute()}.
   *
   * <p>Method under test: {@link BdkClientConfig#getConnectionPoolPerRoute()}
   */
  @Test
  @DisplayName("Test getConnectionPoolPerRoute()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Integer BdkClientConfig.getConnectionPoolPerRoute()"})
  void testGetConnectionPoolPerRoute2() throws UnsupportedEncodingException {
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
    datafeed.setRetry(new BdkRetryConfig());
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(new BdkRetryConfig());
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkConfig parentConfig = new BdkConfig();
    parentConfig.setAgent(new BdkAgentConfig());
    parentConfig.setApp(app);
    parentConfig.setBot(bot);
    parentConfig.setCommonJwt(commonJwt);
    parentConfig.setConnectionPoolMax(1);
    parentConfig.setConnectionPoolPerRoute(1);
    parentConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    parentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    parentConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setRetry(new BdkRetryConfig());
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    BdkClientConfig bdkClientConfig = new BdkClientConfig(parentConfig);
    bdkClientConfig.setConnectionPoolPerRoute(1);

    // Act and Assert
    assertEquals(1, bdkClientConfig.getConnectionPoolPerRoute().intValue());
  }

  /**
   * Test {@link BdkClientConfig#getProxy()}.
   *
   * <p>Method under test: {@link BdkClientConfig#getProxy()}
   */
  @Test
  @DisplayName("Test getProxy()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkProxyConfig BdkClientConfig.getProxy()"})
  void testGetProxy() throws UnsupportedEncodingException {
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
    datafeed.setRetry(new BdkRetryConfig());
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(new BdkRetryConfig());
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkConfig parentConfig = new BdkConfig();
    parentConfig.setAgent(new BdkAgentConfig());
    parentConfig.setApp(app);
    parentConfig.setBot(bot);
    parentConfig.setCommonJwt(commonJwt);
    parentConfig.setConnectionPoolMax(1);
    parentConfig.setConnectionPoolPerRoute(1);
    parentConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    parentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    parentConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setRetry(new BdkRetryConfig());
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    BdkClientConfig bdkClientConfig = new BdkClientConfig(parentConfig);
    BdkProxyConfig proxy = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");

    bdkClientConfig.setProxy(proxy);

    // Act and Assert
    assertSame(proxy, bdkClientConfig.getProxy());
  }

  /**
   * Test {@link BdkClientConfig#getProxy()}.
   *
   * <ul>
   *   <li>Given {@link BdkClientConfig#BdkClientConfig(BdkConfig)} with parentConfig is {@link
   *       BdkConfig} (default constructor) Proxy is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkClientConfig#getProxy()}
   */
  @Test
  @DisplayName(
      "Test getProxy(); given BdkClientConfig(BdkConfig) with parentConfig is BdkConfig (default constructor) Proxy is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkProxyConfig BdkClientConfig.getProxy()"})
  void testGetProxy_givenBdkClientConfigWithParentConfigIsBdkConfigProxyIsNull()
      throws UnsupportedEncodingException {
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
    datafeed.setRetry(new BdkRetryConfig());
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(new BdkRetryConfig());
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkConfig parentConfig = new BdkConfig();
    parentConfig.setAgent(new BdkAgentConfig());
    parentConfig.setApp(app);
    parentConfig.setBot(bot);
    parentConfig.setCommonJwt(commonJwt);
    parentConfig.setConnectionPoolMax(1);
    parentConfig.setConnectionPoolPerRoute(1);
    parentConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    BdkProxyConfig proxy = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");

    parentConfig.setProxy(proxy);
    parentConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setRetry(new BdkRetryConfig());
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    BdkClientConfig bdkClientConfig = new BdkClientConfig(parentConfig);
    bdkClientConfig.setProxy(null);

    // Act and Assert
    assertSame(proxy, bdkClientConfig.getProxy());
  }

  /**
   * Test {@link BdkClientConfig#getDefaultHeaders()}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link BdkClientConfig#getDefaultHeaders()}
   */
  @Test
  @DisplayName("Test getDefaultHeaders(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map BdkClientConfig.getDefaultHeaders()"})
  void testGetDefaultHeaders_thenReturnEmpty() throws UnsupportedEncodingException {
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
    datafeed.setRetry(new BdkRetryConfig());
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(new BdkRetryConfig());
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkConfig parentConfig = new BdkConfig();
    parentConfig.setAgent(new BdkAgentConfig());
    parentConfig.setApp(app);
    parentConfig.setBot(bot);
    parentConfig.setCommonJwt(commonJwt);
    parentConfig.setConnectionPoolMax(1);
    parentConfig.setConnectionPoolPerRoute(1);
    parentConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    parentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    parentConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setRetry(new BdkRetryConfig());
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    BdkClientConfig bdkClientConfig = new BdkClientConfig(parentConfig);
    bdkClientConfig.setDefaultHeaders(new HashMap<>());

    // Act and Assert
    assertTrue(bdkClientConfig.getDefaultHeaders().isEmpty());
  }

  /**
   * Test {@link BdkClientConfig#getDefaultHeaders()}.
   *
   * <ul>
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link BdkClientConfig#getDefaultHeaders()}
   */
  @Test
  @DisplayName("Test getDefaultHeaders(); then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map BdkClientConfig.getDefaultHeaders()"})
  void testGetDefaultHeaders_thenReturnSizeIsOne() throws UnsupportedEncodingException {
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
    datafeed.setRetry(new BdkRetryConfig());
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(new BdkRetryConfig());
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkConfig parentConfig = new BdkConfig();
    parentConfig.setAgent(new BdkAgentConfig());
    parentConfig.setApp(app);
    parentConfig.setBot(bot);
    parentConfig.setCommonJwt(commonJwt);
    parentConfig.setConnectionPoolMax(1);
    parentConfig.setConnectionPoolPerRoute(1);
    parentConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    parentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    parentConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setRetry(new BdkRetryConfig());
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    BdkClientConfig bdkClientConfig = new BdkClientConfig(parentConfig);
    bdkClientConfig.setDefaultHeaders(null);

    // Act
    Map<String, String> actualDefaultHeaders = bdkClientConfig.getDefaultHeaders();

    // Assert
    assertEquals(1, actualDefaultHeaders.size());
    assertEquals("alice.liddell@example.org", actualDefaultHeaders.get("Delivered-To"));
    assertSame(defaultHeaders, actualDefaultHeaders);
  }
}
