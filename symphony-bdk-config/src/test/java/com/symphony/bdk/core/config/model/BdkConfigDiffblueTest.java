package com.symphony.bdk.core.config.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkConfigDiffblueTest {
  /**
   * Test {@link BdkConfig#isOboConfigured()}.
   * <ul>
   *   <li>Given {@link BdkConfig} (default constructor).</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkConfig#isOboConfigured()}
   */
  @Test
  @DisplayName("Test isOboConfigured(); given BdkConfig (default constructor); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkConfig.isOboConfigured()"})
  void testIsOboConfigured_givenBdkConfig_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new BdkConfig()).isOboConfigured());
  }

  /**
   * Test {@link BdkConfig#isOboConfigured()}.
   * <ul>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkConfig#isOboConfigured()}
   */
  @Test
  @DisplayName("Test isOboConfigured(); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkConfig.isOboConfigured()"})
  void testIsOboConfigured_thenReturnTrue() throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkBotConfig bot = new BdkBotConfig();
    bot.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    bot.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setCertificatePassword("iloveyou");
    bot.setCertificatePath("Certificate Path");
    bot.setPrivateKey(privateKey);
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

    BdkRsaKeyConfig privateKey2 = new BdkRsaKeyConfig();
    privateKey2.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey2.setPath("Path");

    BdkExtAppConfig app = new BdkExtAppConfig();
    app.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    app.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    app.setCertificatePassword("iloveyou");
    app.setCertificatePath("Certificate Path");
    app.setPrivateKey(privateKey2);
    app.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    app.setPrivateKeyPath("Private Key Path");
    app.setAppId("foo");

    BdkConfig bdkConfig = new BdkConfig();
    bdkConfig.setAgent(new BdkAgentConfig());
    bdkConfig.setBot(bot);
    bdkConfig.setCommonJwt(commonJwt);
    bdkConfig.setConnectionPoolMax(1);
    bdkConfig.setConnectionPoolPerRoute(1);
    bdkConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkConfig.setContext("Context");
    bdkConfig.setDatafeed(datafeed);
    bdkConfig.setDatahose(datahose);
    bdkConfig.setDefaultHeaders(defaultHeaders);
    bdkConfig.setHost("localhost");
    bdkConfig.setKeyManager(new BdkClientConfig());
    bdkConfig.setPod(new BdkClientConfig());
    bdkConfig.setPort(8080);
    bdkConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    bdkConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkConfig.setRetry(new BdkRetryConfig());
    bdkConfig.setScheme("Scheme");
    bdkConfig.setSessionAuth(new BdkClientConfig());
    bdkConfig.setSsl(ssl);
    bdkConfig.setApp(app);

    // Act and Assert
    assertTrue(bdkConfig.isOboConfigured());
  }

  /**
   * Test {@link BdkConfig#isBotConfigured()}.
   * <ul>
   *   <li>Given {@link BdkConfig} (default constructor) Bot is {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkConfig#isBotConfigured()}
   */
  @Test
  @DisplayName("Test isBotConfigured(); given BdkConfig (default constructor) Bot is 'null'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkConfig.isBotConfigured()"})
  void testIsBotConfigured_givenBdkConfigBotIsNull_thenReturnFalse() throws UnsupportedEncodingException {
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

    BdkConfig bdkConfig = new BdkConfig();
    bdkConfig.setAgent(new BdkAgentConfig());
    bdkConfig.setApp(app);
    bdkConfig.setCommonJwt(commonJwt);
    bdkConfig.setConnectionPoolMax(1);
    bdkConfig.setConnectionPoolPerRoute(1);
    bdkConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkConfig.setContext("Context");
    bdkConfig.setDatafeed(datafeed);
    bdkConfig.setDatahose(datahose);
    bdkConfig.setDefaultHeaders(defaultHeaders);
    bdkConfig.setHost("localhost");
    bdkConfig.setKeyManager(new BdkClientConfig());
    bdkConfig.setPod(new BdkClientConfig());
    bdkConfig.setPort(8080);
    bdkConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    bdkConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkConfig.setRetry(new BdkRetryConfig());
    bdkConfig.setScheme("Scheme");
    bdkConfig.setSessionAuth(new BdkClientConfig());
    bdkConfig.setSsl(ssl);
    bdkConfig.setBot(null);

    // Act and Assert
    assertFalse(bdkConfig.isBotConfigured());
  }

  /**
   * Test {@link BdkConfig#isBotConfigured()}.
   * <ul>
   *   <li>Given {@link BdkConfig} (default constructor).</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkConfig#isBotConfigured()}
   */
  @Test
  @DisplayName("Test isBotConfigured(); given BdkConfig (default constructor); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkConfig.isBotConfigured()"})
  void testIsBotConfigured_givenBdkConfig_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new BdkConfig()).isBotConfigured());
  }

  /**
   * Test {@link BdkConfig#isBotConfigured()}.
   * <ul>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkConfig#isBotConfigured()}
   */
  @Test
  @DisplayName("Test isBotConfigured(); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkConfig.isBotConfigured()"})
  void testIsBotConfigured_thenReturnTrue() throws UnsupportedEncodingException {
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

    BdkConfig bdkConfig = new BdkConfig();
    bdkConfig.setAgent(new BdkAgentConfig());
    bdkConfig.setApp(app);
    bdkConfig.setCommonJwt(commonJwt);
    bdkConfig.setConnectionPoolMax(1);
    bdkConfig.setConnectionPoolPerRoute(1);
    bdkConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkConfig.setContext("Context");
    bdkConfig.setDatafeed(datafeed);
    bdkConfig.setDatahose(datahose);
    bdkConfig.setDefaultHeaders(defaultHeaders);
    bdkConfig.setHost("localhost");
    bdkConfig.setKeyManager(new BdkClientConfig());
    bdkConfig.setPod(new BdkClientConfig());
    bdkConfig.setPort(8080);
    bdkConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    bdkConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkConfig.setRetry(new BdkRetryConfig());
    bdkConfig.setScheme("Scheme");
    bdkConfig.setSessionAuth(new BdkClientConfig());
    bdkConfig.setSsl(ssl);
    bdkConfig.setBot(bot);

    // Act and Assert
    assertTrue(bdkConfig.isBotConfigured());
  }

  /**
   * Test {@link BdkConfig#isCommonJwtEnabled()}.
   * <ul>
   *   <li>Given {@link BdkConfig} (default constructor).</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkConfig#isCommonJwtEnabled()}
   */
  @Test
  @DisplayName("Test isCommonJwtEnabled(); given BdkConfig (default constructor); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkConfig.isCommonJwtEnabled()"})
  void testIsCommonJwtEnabled_givenBdkConfig_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new BdkConfig()).isCommonJwtEnabled());
  }

  /**
   * Test {@link BdkConfig#isCommonJwtEnabled()}.
   * <ul>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkConfig#isCommonJwtEnabled()}
   */
  @Test
  @DisplayName("Test isCommonJwtEnabled(); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkConfig.isCommonJwtEnabled()"})
  void testIsCommonJwtEnabled_thenReturnTrue() throws UnsupportedEncodingException {
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

    BdkConfig bdkConfig = new BdkConfig();
    bdkConfig.setAgent(new BdkAgentConfig());
    bdkConfig.setApp(app);
    bdkConfig.setBot(bot);
    bdkConfig.setCommonJwt(commonJwt);
    bdkConfig.setConnectionPoolMax(1);
    bdkConfig.setConnectionPoolPerRoute(1);
    bdkConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkConfig.setContext("Context");
    bdkConfig.setDatafeed(datafeed);
    bdkConfig.setDatahose(datahose);
    bdkConfig.setDefaultHeaders(defaultHeaders);
    bdkConfig.setHost("localhost");
    bdkConfig.setKeyManager(new BdkClientConfig());
    bdkConfig.setPod(new BdkClientConfig());
    bdkConfig.setPort(8080);
    bdkConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    bdkConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkConfig.setRetry(new BdkRetryConfig());
    bdkConfig.setScheme("Scheme");
    bdkConfig.setSessionAuth(new BdkClientConfig());
    bdkConfig.setSsl(ssl);

    // Act and Assert
    assertTrue(bdkConfig.isCommonJwtEnabled());
  }

  /**
   * Test {@link BdkConfig#getDatafeedRetryConfig()}.
   * <p>
   * Method under test: {@link BdkConfig#getDatafeedRetryConfig()}
   */
  @Test
  @DisplayName("Test getDatafeedRetryConfig()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"BdkRetryConfig BdkConfig.getDatafeedRetryConfig()"})
  void testGetDatafeedRetryConfig() {
    // Arrange and Act
    BdkRetryConfig actualDatafeedRetryConfig = (new BdkConfig()).getDatafeedRetryConfig();

    // Assert
    assertEquals(BdkRetryConfig.DEFAULT_INITIAL_INTERVAL_MILLIS,
        actualDatafeedRetryConfig.getInitialIntervalMillis().longValue());
    assertEquals(BdkRetryConfig.DEFAULT_MAX_INTERVAL_MILLIS,
        actualDatafeedRetryConfig.getMaxIntervalMillis().longValue());
    assertEquals(BdkRetryConfig.DEFAULT_MULTIPLIER, actualDatafeedRetryConfig.getMultiplier().doubleValue());
    assertEquals(Integer.MAX_VALUE, actualDatafeedRetryConfig.getMaxAttempts().intValue());
  }

  /**
   * Test {@link BdkConfig#getDatafeedRetryConfig()}.
   * <ul>
   *   <li>Then return {@link BdkRetryConfig#BdkRetryConfig()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkConfig#getDatafeedRetryConfig()}
   */
  @Test
  @DisplayName("Test getDatafeedRetryConfig(); then return BdkRetryConfig()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"BdkRetryConfig BdkConfig.getDatafeedRetryConfig()"})
  void testGetDatafeedRetryConfig_thenReturnBdkRetryConfig() throws UnsupportedEncodingException {
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

    BdkDatafeedConfig datafeed = new BdkDatafeedConfig();
    datafeed.setIdFilePath("/directory/foo.txt");
    datafeed.setVersion("1.0.2");
    datafeed.setRetry(null);

    BdkConfig bdkConfig = new BdkConfig();
    bdkConfig.setAgent(new BdkAgentConfig());
    bdkConfig.setApp(app);
    bdkConfig.setBot(bot);
    bdkConfig.setCommonJwt(commonJwt);
    bdkConfig.setConnectionPoolMax(1);
    bdkConfig.setConnectionPoolPerRoute(1);
    bdkConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkConfig.setContext("Context");
    bdkConfig.setDatahose(datahose);
    bdkConfig.setDefaultHeaders(defaultHeaders);
    bdkConfig.setHost("localhost");
    bdkConfig.setKeyManager(new BdkClientConfig());
    bdkConfig.setPod(new BdkClientConfig());
    bdkConfig.setPort(8080);
    bdkConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    bdkConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    BdkRetryConfig retry = new BdkRetryConfig();
    bdkConfig.setRetry(retry);
    bdkConfig.setScheme("Scheme");
    bdkConfig.setSessionAuth(new BdkClientConfig());
    bdkConfig.setSsl(ssl);
    bdkConfig.setDatafeed(datafeed);

    // Act and Assert
    assertSame(retry, bdkConfig.getDatafeedRetryConfig());
  }

  /**
   * Test {@link BdkConfig#setAgent(BdkAgentConfig)}.
   * <ul>
   *   <li>When {@link BdkAgentConfig#BdkAgentConfig()}.</li>
   *   <li>Then {@link BdkAgentConfig#BdkAgentConfig()} Context is empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkConfig#setAgent(BdkAgentConfig)}
   */
  @Test
  @DisplayName("Test setAgent(BdkAgentConfig); when BdkAgentConfig(); then BdkAgentConfig() Context is empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BdkConfig.setAgent(BdkAgentConfig)"})
  void testSetAgent_whenBdkAgentConfig_thenBdkAgentConfigContextIsEmptyString() {
    // Arrange
    BdkConfig bdkConfig = new BdkConfig();
    BdkAgentConfig agent = new BdkAgentConfig();

    // Act
    bdkConfig.setAgent(agent);

    // Assert
    assertEquals("", agent.getContext());
    assertEquals("", agent.getFormattedContext());
    assertEquals("https", agent.getScheme());
    assertEquals("https://null:443", agent.getBasePath());
    assertNull(agent.getProxy());
    assertNull(agent.getConnectionPoolMax());
    assertNull(agent.getConnectionPoolPerRoute());
    assertNull(agent.getConnectionTimeout());
    assertNull(agent.getReadTimeout());
    assertNull(agent.getHost());
    assertNull(agent.getDefaultHeaders());
    assertEquals(443, agent.getPort().intValue());
    assertSame(agent, bdkConfig.getAgent());
    assertSame(bdkConfig, agent.getParentConfig());
  }

  /**
   * Test {@link BdkConfig#setPod(BdkClientConfig)}.
   * <ul>
   *   <li>When {@link BdkClientConfig#BdkClientConfig()}.</li>
   *   <li>Then {@link BdkClientConfig#BdkClientConfig()} Context is empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkConfig#setPod(BdkClientConfig)}
   */
  @Test
  @DisplayName("Test setPod(BdkClientConfig); when BdkClientConfig(); then BdkClientConfig() Context is empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BdkConfig.setPod(BdkClientConfig)"})
  void testSetPod_whenBdkClientConfig_thenBdkClientConfigContextIsEmptyString() {
    // Arrange
    BdkConfig bdkConfig = new BdkConfig();
    BdkClientConfig pod = new BdkClientConfig();

    // Act
    bdkConfig.setPod(pod);

    // Assert
    assertEquals("", pod.getContext());
    assertEquals("", pod.getFormattedContext());
    assertEquals("https", pod.getScheme());
    assertEquals("https://null:443", pod.getBasePath());
    assertNull(pod.getProxy());
    assertNull(pod.getConnectionPoolMax());
    assertNull(pod.getConnectionPoolPerRoute());
    assertNull(pod.getConnectionTimeout());
    assertNull(pod.getReadTimeout());
    assertNull(pod.getHost());
    assertNull(pod.getDefaultHeaders());
    assertEquals(443, pod.getPort().intValue());
    assertSame(pod, bdkConfig.getPod());
    assertSame(bdkConfig, pod.getParentConfig());
  }

  /**
   * Test {@link BdkConfig#setKeyManager(BdkClientConfig)}.
   * <ul>
   *   <li>When {@link BdkClientConfig#BdkClientConfig()}.</li>
   *   <li>Then {@link BdkClientConfig#BdkClientConfig()} Context is empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkConfig#setKeyManager(BdkClientConfig)}
   */
  @Test
  @DisplayName("Test setKeyManager(BdkClientConfig); when BdkClientConfig(); then BdkClientConfig() Context is empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BdkConfig.setKeyManager(BdkClientConfig)"})
  void testSetKeyManager_whenBdkClientConfig_thenBdkClientConfigContextIsEmptyString() {
    // Arrange
    BdkConfig bdkConfig = new BdkConfig();
    BdkClientConfig keyManager = new BdkClientConfig();

    // Act
    bdkConfig.setKeyManager(keyManager);

    // Assert
    assertEquals("", keyManager.getContext());
    assertEquals("", keyManager.getFormattedContext());
    assertEquals("https", keyManager.getScheme());
    assertEquals("https://null:443", keyManager.getBasePath());
    assertNull(keyManager.getProxy());
    assertNull(keyManager.getConnectionPoolMax());
    assertNull(keyManager.getConnectionPoolPerRoute());
    assertNull(keyManager.getConnectionTimeout());
    assertNull(keyManager.getReadTimeout());
    assertNull(keyManager.getHost());
    assertNull(keyManager.getDefaultHeaders());
    assertEquals(443, keyManager.getPort().intValue());
    assertSame(keyManager, bdkConfig.getKeyManager());
    assertSame(bdkConfig, keyManager.getParentConfig());
  }

  /**
   * Test {@link BdkConfig#setSessionAuth(BdkClientConfig)}.
   * <ul>
   *   <li>When {@link BdkClientConfig#BdkClientConfig()}.</li>
   *   <li>Then {@link BdkClientConfig#BdkClientConfig()} Context is empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkConfig#setSessionAuth(BdkClientConfig)}
   */
  @Test
  @DisplayName("Test setSessionAuth(BdkClientConfig); when BdkClientConfig(); then BdkClientConfig() Context is empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BdkConfig.setSessionAuth(BdkClientConfig)"})
  void testSetSessionAuth_whenBdkClientConfig_thenBdkClientConfigContextIsEmptyString() {
    // Arrange
    BdkConfig bdkConfig = new BdkConfig();
    BdkClientConfig sessionAuth = new BdkClientConfig();

    // Act
    bdkConfig.setSessionAuth(sessionAuth);

    // Assert
    assertEquals("", sessionAuth.getContext());
    assertEquals("", sessionAuth.getFormattedContext());
    assertEquals("https", sessionAuth.getScheme());
    assertEquals("https://null:443", sessionAuth.getBasePath());
    assertNull(sessionAuth.getProxy());
    assertNull(sessionAuth.getConnectionPoolMax());
    assertNull(sessionAuth.getConnectionPoolPerRoute());
    assertNull(sessionAuth.getConnectionTimeout());
    assertNull(sessionAuth.getReadTimeout());
    assertNull(sessionAuth.getHost());
    assertNull(sessionAuth.getDefaultHeaders());
    assertEquals(443, sessionAuth.getPort().intValue());
    assertSame(sessionAuth, bdkConfig.getSessionAuth());
    assertSame(bdkConfig, sessionAuth.getParentConfig());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BdkConfig#setApp(BdkExtAppConfig)}
   *   <li>{@link BdkConfig#setBot(BdkBotConfig)}
   *   <li>{@link BdkConfig#setCommonJwt(BdkCommonJwtConfig)}
   *   <li>{@link BdkConfig#setDatafeed(BdkDatafeedConfig)}
   *   <li>{@link BdkConfig#setDatahose(BdkDatahoseConfig)}
   *   <li>{@link BdkConfig#setRetry(BdkRetryConfig)}
   *   <li>{@link BdkConfig#setSsl(BdkSslConfig)}
   *   <li>{@link BdkConfig#getAgent()}
   *   <li>{@link BdkConfig#getApp()}
   *   <li>{@link BdkConfig#getBot()}
   *   <li>{@link BdkConfig#getCommonJwt()}
   *   <li>{@link BdkConfig#getDatafeed()}
   *   <li>{@link BdkConfig#getDatahose()}
   *   <li>{@link BdkConfig#getKeyManager()}
   *   <li>{@link BdkConfig#getPod()}
   *   <li>{@link BdkConfig#getRetry()}
   *   <li>{@link BdkConfig#getSessionAuth()}
   *   <li>{@link BdkConfig#getSsl()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"BdkAgentConfig BdkConfig.getAgent()", "BdkExtAppConfig BdkConfig.getApp()",
      "BdkBotConfig BdkConfig.getBot()", "BdkCommonJwtConfig BdkConfig.getCommonJwt()",
      "BdkDatafeedConfig BdkConfig.getDatafeed()", "BdkDatahoseConfig BdkConfig.getDatahose()",
      "BdkClientConfig BdkConfig.getKeyManager()", "BdkClientConfig BdkConfig.getPod()",
      "BdkRetryConfig BdkConfig.getRetry()", "BdkClientConfig BdkConfig.getSessionAuth()",
      "BdkSslConfig BdkConfig.getSsl()", "void BdkConfig.setApp(BdkExtAppConfig)",
      "void BdkConfig.setBot(BdkBotConfig)", "void BdkConfig.setCommonJwt(BdkCommonJwtConfig)",
      "void BdkConfig.setDatafeed(BdkDatafeedConfig)", "void BdkConfig.setDatahose(BdkDatahoseConfig)",
      "void BdkConfig.setRetry(BdkRetryConfig)", "void BdkConfig.setSsl(BdkSslConfig)"})
  void testGettersAndSetters() throws UnsupportedEncodingException {
    // Arrange
    BdkConfig bdkConfig = new BdkConfig();

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

    // Act
    bdkConfig.setApp(app);
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
    bdkConfig.setBot(bot);
    BdkCommonJwtConfig commonJwt = new BdkCommonJwtConfig();
    commonJwt.setEnabled(true);
    bdkConfig.setCommonJwt(commonJwt);
    BdkDatafeedConfig datafeed = new BdkDatafeedConfig();
    datafeed.setIdFilePath("/directory/foo.txt");
    datafeed.setRetry(new BdkRetryConfig());
    datafeed.setVersion("1.0.2");
    bdkConfig.setDatafeed(datafeed);
    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(new BdkRetryConfig());
    datahose.setTag("Tag");
    bdkConfig.setDatahose(datahose);
    BdkRetryConfig retry = new BdkRetryConfig();
    bdkConfig.setRetry(retry);
    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");
    bdkConfig.setSsl(ssl);
    BdkAgentConfig actualAgent = bdkConfig.getAgent();
    BdkExtAppConfig actualApp = bdkConfig.getApp();
    BdkBotConfig actualBot = bdkConfig.getBot();
    BdkCommonJwtConfig actualCommonJwt = bdkConfig.getCommonJwt();
    BdkDatafeedConfig actualDatafeed = bdkConfig.getDatafeed();
    BdkDatahoseConfig actualDatahose = bdkConfig.getDatahose();
    BdkClientConfig actualKeyManager = bdkConfig.getKeyManager();
    BdkClientConfig actualPod = bdkConfig.getPod();
    BdkRetryConfig actualRetry = bdkConfig.getRetry();
    BdkClientConfig actualSessionAuth = bdkConfig.getSessionAuth();
    BdkSslConfig actualSsl = bdkConfig.getSsl();

    // Assert
    assertEquals("", actualAgent.getContext());
    assertEquals("", actualKeyManager.getContext());
    assertEquals("", actualPod.getContext());
    assertEquals("", actualSessionAuth.getContext());
    assertEquals("", actualAgent.getFormattedContext());
    assertEquals("", actualKeyManager.getFormattedContext());
    assertEquals("", actualPod.getFormattedContext());
    assertEquals("", actualSessionAuth.getFormattedContext());
    assertEquals("https", actualAgent.getScheme());
    assertEquals("https", actualKeyManager.getScheme());
    assertEquals("https", actualPod.getScheme());
    assertEquals("https", actualSessionAuth.getScheme());
    assertEquals("https://null:443", actualAgent.getBasePath());
    assertEquals("https://null:443", actualKeyManager.getBasePath());
    assertEquals("https://null:443", actualPod.getBasePath());
    assertEquals("https://null:443", actualSessionAuth.getBasePath());
    assertNull(actualAgent.getLoadBalancing());
    assertNull(actualAgent.getProxy());
    assertNull(actualKeyManager.getProxy());
    assertNull(actualPod.getProxy());
    assertNull(actualSessionAuth.getProxy());
    assertNull(actualAgent.getConnectionPoolMax());
    assertNull(actualKeyManager.getConnectionPoolMax());
    assertNull(actualPod.getConnectionPoolMax());
    assertNull(actualSessionAuth.getConnectionPoolMax());
    assertNull(actualAgent.getConnectionPoolPerRoute());
    assertNull(actualKeyManager.getConnectionPoolPerRoute());
    assertNull(actualPod.getConnectionPoolPerRoute());
    assertNull(actualSessionAuth.getConnectionPoolPerRoute());
    assertNull(actualAgent.getConnectionTimeout());
    assertNull(actualKeyManager.getConnectionTimeout());
    assertNull(actualPod.getConnectionTimeout());
    assertNull(actualSessionAuth.getConnectionTimeout());
    assertNull(actualAgent.getReadTimeout());
    assertNull(actualKeyManager.getReadTimeout());
    assertNull(actualPod.getReadTimeout());
    assertNull(actualSessionAuth.getReadTimeout());
    assertNull(actualAgent.getHost());
    assertNull(actualKeyManager.getHost());
    assertNull(actualPod.getHost());
    assertNull(actualSessionAuth.getHost());
    assertNull(actualAgent.getDefaultHeaders());
    assertNull(actualKeyManager.getDefaultHeaders());
    assertNull(actualPod.getDefaultHeaders());
    assertNull(actualSessionAuth.getDefaultHeaders());
    assertEquals(443, actualAgent.getPort().intValue());
    assertEquals(443, actualKeyManager.getPort().intValue());
    assertEquals(443, actualPod.getPort().intValue());
    assertEquals(443, actualSessionAuth.getPort().intValue());
    assertTrue(actualCommonJwt.getEnabled());
    assertSame(bot, actualBot);
    assertSame(commonJwt, actualCommonJwt);
    assertSame(bdkConfig, actualAgent.getParentConfig());
    assertSame(bdkConfig, actualKeyManager.getParentConfig());
    assertSame(bdkConfig, actualPod.getParentConfig());
    assertSame(bdkConfig, actualSessionAuth.getParentConfig());
    assertSame(datafeed, actualDatafeed);
    assertSame(datahose, actualDatahose);
    assertSame(app, actualApp);
    assertSame(retry, actualRetry);
    assertSame(ssl, actualSsl);
  }

  /**
   * Test new {@link BdkConfig} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link BdkConfig}
   */
  @Test
  @DisplayName("Test new BdkConfig (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BdkConfig.<init>()"})
  void testNewBdkConfig() {
    // Arrange and Act
    BdkConfig actualBdkConfig = new BdkConfig();

    // Assert
    assertEquals("", actualBdkConfig.getContext());
    assertEquals("", actualBdkConfig.getFormattedContext());
    assertEquals("https", actualBdkConfig.getScheme());
    assertEquals("https://null:443", actualBdkConfig.getBasePath());
    assertNull(actualBdkConfig.getProxy());
    assertNull(actualBdkConfig.getConnectionPoolMax());
    assertNull(actualBdkConfig.getConnectionPoolPerRoute());
    assertNull(actualBdkConfig.getConnectionTimeout());
    assertNull(actualBdkConfig.getReadTimeout());
    assertNull(actualBdkConfig.getHost());
    assertNull(actualBdkConfig.getDefaultHeaders());
    assertEquals(443, actualBdkConfig.getPort().intValue());
    assertFalse(actualBdkConfig.isBotConfigured());
    assertFalse(actualBdkConfig.isOboConfigured());
  }
}
