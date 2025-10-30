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
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkClientConfigDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BdkClientConfig#BdkClientConfig()}
   *   <li>{@link BdkClientConfig#setParentConfig(BdkConfig)}
   *   <li>{@link BdkClientConfig#getParentConfig()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BdkClientConfig.<init>()", "void BdkClientConfig.<init>(BdkConfig)",
      "BdkConfig BdkClientConfig.getParentConfig()", "void BdkClientConfig.setParentConfig(BdkConfig)"})
  void testGettersAndSetters() throws UnsupportedEncodingException {
    // Arrange and Act
    BdkClientConfig actualBdkClientConfig = new BdkClientConfig();
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
    actualBdkClientConfig.setParentConfig(parentConfig);
    BdkConfig actualParentConfig = actualBdkClientConfig.getParentConfig();

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
    assertEquals(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS, actualBdkClientConfig.getConnectionTimeout().intValue());
    assertEquals(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS, actualBdkClientConfig.getReadTimeout().intValue());
    assertSame(parentConfig, actualParentConfig);
    assertSame(proxy, actualBdkClientConfig.getProxy());
    assertSame(defaultHeaders, defaultHeaders2);
  }

  /**
   * Test getters and setters.
   * <ul>
   *   <li>Given {@link BdkRsaKeyConfig} (default constructor) Content is {@code AXAXAXAX} Bytes is {@code UTF-8}.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BdkClientConfig#BdkClientConfig(BdkConfig)}
   *   <li>{@link BdkClientConfig#BdkClientConfig()}
   *   <li>{@link BdkClientConfig#setParentConfig(BdkConfig)}
   *   <li>{@link BdkClientConfig#getParentConfig()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters; given BdkRsaKeyConfig (default constructor) Content is 'AXAXAXAX' Bytes is 'UTF-8'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BdkClientConfig.<init>()", "void BdkClientConfig.<init>(BdkConfig)",
      "BdkConfig BdkClientConfig.getParentConfig()", "void BdkClientConfig.setParentConfig(BdkConfig)"})
  void testGettersAndSetters_givenBdkRsaKeyConfigContentIsAxaxaxaxBytesIsUtf8() throws UnsupportedEncodingException {
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

    // Act
    BdkClientConfig actualBdkClientConfig = new BdkClientConfig(parentConfig);
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
    datafeed2.setRetry(new BdkRetryConfig());
    datafeed2.setVersion("1.0.2");
    BdkDatahoseConfig datahose2 = new BdkDatahoseConfig();
    datahose2.setEventTypes(new ArrayList<>());
    datahose2.setRetry(new BdkRetryConfig());
    datahose2.setTag("Tag");
    HashMap<String, String> defaultHeaders2 = new HashMap<>();
    defaultHeaders2.put("Delivered-To", "alice.liddell@example.org");
    BdkSslConfig ssl2 = new BdkSslConfig();
    ssl2.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl2.setTrustStorePassword("iloveyou");
    ssl2.setTrustStorePath("Trust Store Path");
    BdkConfig parentConfig2 = new BdkConfig();
    parentConfig2.setAgent(new BdkAgentConfig());
    parentConfig2.setApp(app2);
    parentConfig2.setBot(bot2);
    parentConfig2.setCommonJwt(commonJwt2);
    parentConfig2.setConnectionPoolMax(1);
    parentConfig2.setConnectionPoolPerRoute(1);
    parentConfig2.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig2.setContext("Context");
    parentConfig2.setDatafeed(datafeed2);
    parentConfig2.setDatahose(datahose2);
    parentConfig2.setDefaultHeaders(defaultHeaders2);
    parentConfig2.setHost("localhost");
    parentConfig2.setKeyManager(new BdkClientConfig());
    parentConfig2.setPod(new BdkClientConfig());
    parentConfig2.setPort(8080);
    BdkProxyConfig proxy = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");

    parentConfig2.setProxy(proxy);
    parentConfig2.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig2.setRetry(new BdkRetryConfig());
    parentConfig2.setScheme("Scheme");
    parentConfig2.setSessionAuth(new BdkClientConfig());
    parentConfig2.setSsl(ssl2);
    actualBdkClientConfig.setParentConfig(parentConfig2);
    BdkConfig actualParentConfig = actualBdkClientConfig.getParentConfig();

    // Assert
    assertEquals("Context", actualBdkClientConfig.getContext());
    assertEquals("Scheme", actualBdkClientConfig.getScheme());
    Map<String, String> defaultHeaders3 = actualBdkClientConfig.getDefaultHeaders();
    assertEquals(1, defaultHeaders3.size());
    assertEquals("alice.liddell@example.org", defaultHeaders3.get("Delivered-To"));
    assertEquals("localhost", actualBdkClientConfig.getHost());
    assertEquals(1, actualBdkClientConfig.getConnectionPoolMax().intValue());
    assertEquals(1, actualBdkClientConfig.getConnectionPoolPerRoute().intValue());
    assertEquals(8080, actualBdkClientConfig.getPort().intValue());
    assertEquals(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS, actualBdkClientConfig.getConnectionTimeout().intValue());
    assertEquals(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS, actualBdkClientConfig.getReadTimeout().intValue());
    assertSame(parentConfig2, actualParentConfig);
    assertSame(proxy, actualBdkClientConfig.getProxy());
    assertSame(defaultHeaders2, defaultHeaders3);
  }

  /**
   * Test {@link BdkClientConfig#overridesParentConfig()}.
   * <ul>
   *   <li>Given {@link BdkClientConfig#BdkClientConfig()} Context is {@code foo}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkClientConfig#overridesParentConfig()}
   */
  @Test
  @DisplayName("Test overridesParentConfig(); given BdkClientConfig() Context is 'foo'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkClientConfig.overridesParentConfig()"})
  void testOverridesParentConfig_givenBdkClientConfigContextIsFoo_thenReturnTrue() {
    // Arrange
    BdkClientConfig bdkClientConfig = new BdkClientConfig();
    bdkClientConfig.setScheme(null);
    bdkClientConfig.setHost(null);
    bdkClientConfig.setPort(null);
    bdkClientConfig.setContext("foo");

    // Act and Assert
    assertTrue(bdkClientConfig.overridesParentConfig());
  }

  /**
   * Test {@link BdkClientConfig#overridesParentConfig()}.
   * <ul>
   *   <li>Given {@link BdkClientConfig#BdkClientConfig()} Host is {@code foo}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkClientConfig#overridesParentConfig()}
   */
  @Test
  @DisplayName("Test overridesParentConfig(); given BdkClientConfig() Host is 'foo'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkClientConfig.overridesParentConfig()"})
  void testOverridesParentConfig_givenBdkClientConfigHostIsFoo_thenReturnTrue() {
    // Arrange
    BdkClientConfig bdkClientConfig = new BdkClientConfig();
    bdkClientConfig.setScheme(null);
    bdkClientConfig.setHost("foo");
    bdkClientConfig.setPort(null);
    bdkClientConfig.setContext(null);

    // Act and Assert
    assertTrue(bdkClientConfig.overridesParentConfig());
  }

  /**
   * Test {@link BdkClientConfig#overridesParentConfig()}.
   * <ul>
   *   <li>Given {@link BdkClientConfig#BdkClientConfig()} Port is one.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkClientConfig#overridesParentConfig()}
   */
  @Test
  @DisplayName("Test overridesParentConfig(); given BdkClientConfig() Port is one; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkClientConfig.overridesParentConfig()"})
  void testOverridesParentConfig_givenBdkClientConfigPortIsOne_thenReturnTrue() {
    // Arrange
    BdkClientConfig bdkClientConfig = new BdkClientConfig();
    bdkClientConfig.setScheme(null);
    bdkClientConfig.setHost(null);
    bdkClientConfig.setPort(1);
    bdkClientConfig.setContext(null);

    // Act and Assert
    assertTrue(bdkClientConfig.overridesParentConfig());
  }

  /**
   * Test {@link BdkClientConfig#overridesParentConfig()}.
   * <ul>
   *   <li>Given {@link BdkClientConfig#BdkClientConfig()} Scheme is {@code foo}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkClientConfig#overridesParentConfig()}
   */
  @Test
  @DisplayName("Test overridesParentConfig(); given BdkClientConfig() Scheme is 'foo'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkClientConfig.overridesParentConfig()"})
  void testOverridesParentConfig_givenBdkClientConfigSchemeIsFoo_thenReturnTrue() {
    // Arrange
    BdkClientConfig bdkClientConfig = new BdkClientConfig();
    bdkClientConfig.setScheme("foo");
    bdkClientConfig.setHost(null);
    bdkClientConfig.setPort(null);
    bdkClientConfig.setContext(null);

    // Act and Assert
    assertTrue(bdkClientConfig.overridesParentConfig());
  }

  /**
   * Test {@link BdkClientConfig#overridesParentConfig()}.
   * <ul>
   *   <li>Given {@link BdkClientConfig#BdkClientConfig()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkClientConfig#overridesParentConfig()}
   */
  @Test
  @DisplayName("Test overridesParentConfig(); given BdkClientConfig(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkClientConfig.overridesParentConfig()"})
  void testOverridesParentConfig_givenBdkClientConfig_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new BdkClientConfig()).overridesParentConfig());
  }

  /**
   * Test {@link BdkClientConfig#getScheme()}.
   * <ul>
   *   <li>Given {@link BdkAgentConfig#BdkAgentConfig(BdkConfig)} with parentConfig is {@link BdkConfig} (default constructor).</li>
   *   <li>Then return {@code https}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkClientConfig#getScheme()}
   */
  @Test
  @DisplayName("Test getScheme(); given BdkAgentConfig(BdkConfig) with parentConfig is BdkConfig (default constructor); then return 'https'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String BdkClientConfig.getScheme()"})
  void testGetScheme_givenBdkAgentConfigWithParentConfigIsBdkConfig_thenReturnHttps() {
    // Arrange, Act and Assert
    assertEquals("https", (new BdkAgentConfig(new BdkConfig())).getScheme());
  }

  /**
   * Test {@link BdkClientConfig#getScheme()}.
   * <ul>
   *   <li>Then return {@code Scheme}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkClientConfig#getScheme()}
   */
  @Test
  @DisplayName("Test getScheme(); then return 'Scheme'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String BdkClientConfig.getScheme()"})
  void testGetScheme_thenReturnScheme() {
    // Arrange
    BdkAgentConfig bdkAgentConfig = new BdkAgentConfig(new BdkConfig());
    bdkAgentConfig.setScheme("Scheme");

    // Act and Assert
    assertEquals("Scheme", bdkAgentConfig.getScheme());
  }

  /**
   * Test {@link BdkClientConfig#getHost()}.
   * <ul>
   *   <li>Given {@link BdkAgentConfig#BdkAgentConfig(BdkConfig)} with parentConfig is {@link BdkConfig} (default constructor).</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkClientConfig#getHost()}
   */
  @Test
  @DisplayName("Test getHost(); given BdkAgentConfig(BdkConfig) with parentConfig is BdkConfig (default constructor); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String BdkClientConfig.getHost()"})
  void testGetHost_givenBdkAgentConfigWithParentConfigIsBdkConfig_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull((new BdkAgentConfig(new BdkConfig())).getHost());
  }

  /**
   * Test {@link BdkClientConfig#getHost()}.
   * <ul>
   *   <li>Then return {@code localhost}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkClientConfig#getHost()}
   */
  @Test
  @DisplayName("Test getHost(); then return 'localhost'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String BdkClientConfig.getHost()"})
  void testGetHost_thenReturnLocalhost() {
    // Arrange
    BdkAgentConfig bdkAgentConfig = new BdkAgentConfig(new BdkConfig());
    bdkAgentConfig.setHost("localhost");

    // Act and Assert
    assertEquals("localhost", bdkAgentConfig.getHost());
  }

  /**
   * Test {@link BdkClientConfig#getPort()}.
   * <ul>
   *   <li>Then return intValue is {@code 8080}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkClientConfig#getPort()}
   */
  @Test
  @DisplayName("Test getPort(); then return intValue is '8080'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.Integer BdkClientConfig.getPort()"})
  void testGetPort_thenReturnIntValueIs8080() {
    // Arrange
    BdkAgentConfig bdkAgentConfig = new BdkAgentConfig(new BdkConfig());
    bdkAgentConfig.setPort(8080);

    // Act and Assert
    assertEquals(8080, bdkAgentConfig.getPort().intValue());
  }

  /**
   * Test {@link BdkClientConfig#getPort()}.
   * <ul>
   *   <li>Then return intValue is four hundred forty-three.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkClientConfig#getPort()}
   */
  @Test
  @DisplayName("Test getPort(); then return intValue is four hundred forty-three")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.Integer BdkClientConfig.getPort()"})
  void testGetPort_thenReturnIntValueIsFourHundredFortyThree() {
    // Arrange, Act and Assert
    assertEquals(443, (new BdkAgentConfig(new BdkConfig())).getPort().intValue());
  }

  /**
   * Test {@link BdkClientConfig#getContext()}.
   * <ul>
   *   <li>Then return {@code Context}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkClientConfig#getContext()}
   */
  @Test
  @DisplayName("Test getContext(); then return 'Context'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String BdkClientConfig.getContext()"})
  void testGetContext_thenReturnContext() {
    // Arrange
    BdkAgentConfig bdkAgentConfig = new BdkAgentConfig(new BdkConfig());
    bdkAgentConfig.setContext("Context");

    // Act and Assert
    assertEquals("Context", bdkAgentConfig.getContext());
  }

  /**
   * Test {@link BdkClientConfig#getContext()}.
   * <ul>
   *   <li>Then return empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkClientConfig#getContext()}
   */
  @Test
  @DisplayName("Test getContext(); then return empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String BdkClientConfig.getContext()"})
  void testGetContext_thenReturnEmptyString() {
    // Arrange, Act and Assert
    assertEquals("", (new BdkAgentConfig(new BdkConfig())).getContext());
  }

  /**
   * Test {@link BdkClientConfig#getConnectionTimeout()}.
   * <ul>
   *   <li>Then return intValue is {@link BdkRetryConfig#DEFAULT_MAX_ATTEMPTS}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkClientConfig#getConnectionTimeout()}
   */
  @Test
  @DisplayName("Test getConnectionTimeout(); then return intValue is DEFAULT_MAX_ATTEMPTS")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.Integer BdkClientConfig.getConnectionTimeout()"})
  void testGetConnectionTimeout_thenReturnIntValueIsDefault_max_attempts() {
    // Arrange
    BdkAgentConfig bdkAgentConfig = new BdkAgentConfig(new BdkConfig());
    bdkAgentConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);

    // Act and Assert
    assertEquals(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS, bdkAgentConfig.getConnectionTimeout().intValue());
  }

  /**
   * Test {@link BdkClientConfig#getConnectionTimeout()}.
   * <ul>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkClientConfig#getConnectionTimeout()}
   */
  @Test
  @DisplayName("Test getConnectionTimeout(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.Integer BdkClientConfig.getConnectionTimeout()"})
  void testGetConnectionTimeout_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull((new BdkAgentConfig(new BdkConfig())).getConnectionTimeout());
  }

  /**
   * Test {@link BdkClientConfig#getReadTimeout()}.
   * <ul>
   *   <li>Given {@link BdkAgentConfig#BdkAgentConfig(BdkConfig)} with parentConfig is {@link BdkConfig} (default constructor).</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkClientConfig#getReadTimeout()}
   */
  @Test
  @DisplayName("Test getReadTimeout(); given BdkAgentConfig(BdkConfig) with parentConfig is BdkConfig (default constructor); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.Integer BdkClientConfig.getReadTimeout()"})
  void testGetReadTimeout_givenBdkAgentConfigWithParentConfigIsBdkConfig_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull((new BdkAgentConfig(new BdkConfig())).getReadTimeout());
  }

  /**
   * Test {@link BdkClientConfig#getReadTimeout()}.
   * <ul>
   *   <li>Then return intValue is {@link BdkRetryConfig#DEFAULT_MAX_ATTEMPTS}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkClientConfig#getReadTimeout()}
   */
  @Test
  @DisplayName("Test getReadTimeout(); then return intValue is DEFAULT_MAX_ATTEMPTS")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.Integer BdkClientConfig.getReadTimeout()"})
  void testGetReadTimeout_thenReturnIntValueIsDefault_max_attempts() {
    // Arrange
    BdkAgentConfig bdkAgentConfig = new BdkAgentConfig(new BdkConfig());
    bdkAgentConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);

    // Act and Assert
    assertEquals(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS, bdkAgentConfig.getReadTimeout().intValue());
  }

  /**
   * Test {@link BdkClientConfig#getConnectionPoolMax()}.
   * <ul>
   *   <li>Then return intValue is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkClientConfig#getConnectionPoolMax()}
   */
  @Test
  @DisplayName("Test getConnectionPoolMax(); then return intValue is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.Integer BdkClientConfig.getConnectionPoolMax()"})
  void testGetConnectionPoolMax_thenReturnIntValueIsOne() {
    // Arrange
    BdkAgentConfig bdkAgentConfig = new BdkAgentConfig(new BdkConfig());
    bdkAgentConfig.setConnectionPoolMax(1);

    // Act and Assert
    assertEquals(1, bdkAgentConfig.getConnectionPoolMax().intValue());
  }

  /**
   * Test {@link BdkClientConfig#getConnectionPoolMax()}.
   * <ul>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkClientConfig#getConnectionPoolMax()}
   */
  @Test
  @DisplayName("Test getConnectionPoolMax(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.Integer BdkClientConfig.getConnectionPoolMax()"})
  void testGetConnectionPoolMax_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull((new BdkAgentConfig(new BdkConfig())).getConnectionPoolMax());
  }

  /**
   * Test {@link BdkClientConfig#getConnectionPoolPerRoute()}.
   * <ul>
   *   <li>Then return intValue is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkClientConfig#getConnectionPoolPerRoute()}
   */
  @Test
  @DisplayName("Test getConnectionPoolPerRoute(); then return intValue is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.Integer BdkClientConfig.getConnectionPoolPerRoute()"})
  void testGetConnectionPoolPerRoute_thenReturnIntValueIsOne() {
    // Arrange
    BdkAgentConfig bdkAgentConfig = new BdkAgentConfig(new BdkConfig());
    bdkAgentConfig.setConnectionPoolPerRoute(1);

    // Act and Assert
    assertEquals(1, bdkAgentConfig.getConnectionPoolPerRoute().intValue());
  }

  /**
   * Test {@link BdkClientConfig#getConnectionPoolPerRoute()}.
   * <ul>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkClientConfig#getConnectionPoolPerRoute()}
   */
  @Test
  @DisplayName("Test getConnectionPoolPerRoute(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.Integer BdkClientConfig.getConnectionPoolPerRoute()"})
  void testGetConnectionPoolPerRoute_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull((new BdkAgentConfig(new BdkConfig())).getConnectionPoolPerRoute());
  }

  /**
   * Test {@link BdkClientConfig#getProxy()}.
   * <p>
   * Method under test: {@link BdkClientConfig#getProxy()}
   */
  @Test
  @DisplayName("Test getProxy()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"BdkProxyConfig BdkClientConfig.getProxy()"})
  void testGetProxy() {
    // Arrange
    BdkAgentConfig bdkAgentConfig = new BdkAgentConfig(new BdkConfig());
    BdkProxyConfig proxy = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");

    bdkAgentConfig.setProxy(proxy);

    // Act and Assert
    assertSame(proxy, bdkAgentConfig.getProxy());
  }

  /**
   * Test {@link BdkClientConfig#getProxy()}.
   * <ul>
   *   <li>Given {@link BdkAgentConfig#BdkAgentConfig(BdkConfig)} with parentConfig is {@link BdkConfig} (default constructor).</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkClientConfig#getProxy()}
   */
  @Test
  @DisplayName("Test getProxy(); given BdkAgentConfig(BdkConfig) with parentConfig is BdkConfig (default constructor); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"BdkProxyConfig BdkClientConfig.getProxy()"})
  void testGetProxy_givenBdkAgentConfigWithParentConfigIsBdkConfig_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull((new BdkAgentConfig(new BdkConfig())).getProxy());
  }

  /**
   * Test {@link BdkClientConfig#getDefaultHeaders()}.
   * <ul>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkClientConfig#getDefaultHeaders()}
   */
  @Test
  @DisplayName("Test getDefaultHeaders(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Map BdkClientConfig.getDefaultHeaders()"})
  void testGetDefaultHeaders_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull((new BdkAgentConfig(new BdkConfig())).getDefaultHeaders());
  }

  /**
   * Test {@link BdkClientConfig#getDefaultHeaders()}.
   * <ul>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkClientConfig#getDefaultHeaders()}
   */
  @Test
  @DisplayName("Test getDefaultHeaders(); then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Map BdkClientConfig.getDefaultHeaders()"})
  void testGetDefaultHeaders_thenReturnSizeIsOne() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkAgentConfig bdkAgentConfig = new BdkAgentConfig(new BdkConfig());
    bdkAgentConfig.setDefaultHeaders(defaultHeaders);

    // Act
    Map<String, String> actualDefaultHeaders = bdkAgentConfig.getDefaultHeaders();

    // Assert
    assertEquals(1, actualDefaultHeaders.size());
    assertEquals("alice.liddell@example.org", actualDefaultHeaders.get("Delivered-To"));
    assertSame(defaultHeaders, actualDefaultHeaders);
  }
}
