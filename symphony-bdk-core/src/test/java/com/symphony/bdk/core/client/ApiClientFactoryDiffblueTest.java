package com.symphony.bdk.core.client;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.client.exception.ApiClientInitializationException;
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
import com.symphony.bdk.http.api.ApiClient;
import com.symphony.bdk.http.api.ApiClientBuilder;
import com.symphony.bdk.http.api.ApiClientBuilderProvider;
import com.symphony.bdk.http.jersey2.ApiClientBuilderJersey2;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ApiClientFactoryDiffblueTest {
  /**
   * Test {@link ApiClientFactory#buildAgentClient(String, BdkAgentConfig)}.
   *
   * <ul>
   *   <li>Then return {@link ApiClientJersey2}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientFactory#buildAgentClient(String, BdkAgentConfig)}
   */
  @Test
  @DisplayName("Test buildAgentClient(String, BdkAgentConfig); then return ApiClientJersey2")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiClient ApiClientFactory.buildAgentClient(String, BdkAgentConfig)"})
  void testBuildAgentClient_thenReturnApiClientJersey2() throws UnsupportedEncodingException {
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
    datafeed.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStorePassword(null);
    ssl.setTrustStorePath("Trust Store Path");
    ssl.setTrustStore(null);

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
    BdkProxyConfig proxy = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");
    config.setProxy(proxy);
    config.setReadTimeout(10);
    config.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    config.setScheme("Scheme");
    config.setSessionAuth(new BdkClientConfig());
    config.setSsl(ssl);
    ApiClientFactory apiClientFactory = new ApiClientFactory(config);

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

    BdkConfig parentConfig = new BdkConfig();
    parentConfig.setAgent(new BdkAgentConfig());
    parentConfig.setApp(app2);
    parentConfig.setBot(bot2);
    parentConfig.setCommonJwt(commonJwt2);
    parentConfig.setConnectionPoolMax(1);
    parentConfig.setConnectionPoolPerRoute(1);
    parentConfig.setConnectionTimeout(10);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed2);
    parentConfig.setDatahose(datahose2);
    parentConfig.setDefaultHeaders(defaultHeaders2);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    BdkProxyConfig proxy2 = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");
    parentConfig.setProxy(proxy2);
    parentConfig.setReadTimeout(10);
    parentConfig.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl2);

    BdkAgentConfig agentConfig = new BdkAgentConfig(parentConfig);
    agentConfig.setDefaultHeaders(null);
    agentConfig.setReadTimeout(null);
    agentConfig.setConnectionTimeout(null);
    agentConfig.setConnectionPoolMax(null);
    agentConfig.setConnectionPoolPerRoute(null);
    agentConfig.setProxy(null);

    // Act
    ApiClient actualBuildAgentClientResult =
        apiClientFactory.buildAgentClient("Base Path", agentConfig);

    // Assert
    assertTrue(actualBuildAgentClientResult instanceof ApiClientJersey2);
    assertEquals("Base Path", actualBuildAgentClientResult.getBasePath());
    assertTrue(actualBuildAgentClientResult.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#buildAgentClient(String, BdkAgentConfig)}.
   *
   * <ul>
   *   <li>Then return {@link ApiClientJersey2}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientFactory#buildAgentClient(String, BdkAgentConfig)}
   */
  @Test
  @DisplayName("Test buildAgentClient(String, BdkAgentConfig); then return ApiClientJersey2")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiClient ApiClientFactory.buildAgentClient(String, BdkAgentConfig)"})
  void testBuildAgentClient_thenReturnApiClientJersey22() throws UnsupportedEncodingException {
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
    datafeed.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStorePassword(null);
    ssl.setTrustStorePath("Trust Store Path");
    ssl.setTrustStore(null);

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
    BdkProxyConfig proxy = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");
    config.setProxy(proxy);
    config.setReadTimeout(10);
    config.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    config.setScheme("Scheme");
    config.setSessionAuth(new BdkClientConfig());
    config.setSsl(ssl);
    ApiClientFactory apiClientFactory = new ApiClientFactory(config);

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

    BdkConfig parentConfig = new BdkConfig();
    parentConfig.setAgent(new BdkAgentConfig());
    parentConfig.setApp(app2);
    parentConfig.setBot(bot2);
    parentConfig.setCommonJwt(commonJwt2);
    parentConfig.setConnectionPoolMax(1);
    parentConfig.setConnectionPoolPerRoute(1);
    parentConfig.setConnectionTimeout(10);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed2);
    parentConfig.setDatahose(datahose2);
    parentConfig.setDefaultHeaders(defaultHeaders2);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    BdkProxyConfig proxy2 = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");
    parentConfig.setProxy(proxy2);
    parentConfig.setReadTimeout(10);
    parentConfig.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl2);

    BdkAgentConfig agentConfig = new BdkAgentConfig(parentConfig);
    agentConfig.setDefaultHeaders(null);
    agentConfig.setReadTimeout(null);
    agentConfig.setConnectionTimeout(null);
    agentConfig.setConnectionPoolMax(null);
    agentConfig.setConnectionPoolPerRoute(null);
    agentConfig.setProxy(null);

    // Act
    ApiClient actualBuildAgentClientResult =
        apiClientFactory.buildAgentClient("Base Path", agentConfig);

    // Assert
    assertTrue(actualBuildAgentClientResult instanceof ApiClientJersey2);
    assertEquals("Base Path", actualBuildAgentClientResult.getBasePath());
    assertTrue(actualBuildAgentClientResult.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#buildAgentClient(String, BdkAgentConfig)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiClientInitializationException}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientFactory#buildAgentClient(String, BdkAgentConfig)}
   */
  @Test
  @DisplayName(
      "Test buildAgentClient(String, BdkAgentConfig); then throw ApiClientInitializationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiClient ApiClientFactory.buildAgentClient(String, BdkAgentConfig)"})
  void testBuildAgentClient_thenThrowApiClientInitializationException() {
    // Arrange
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    when(apiClientBuilderProvider.newInstance())
        .thenThrow(new ApiClientInitializationException("An error occurred"));
    ApiClientFactory apiClientFactory =
        new ApiClientFactory(mock(BdkConfig.class), apiClientBuilderProvider);

    // Act and Assert
    assertThrows(
        ApiClientInitializationException.class,
        () -> apiClientFactory.buildAgentClient("Base Path", new BdkAgentConfig()));
    verify(apiClientBuilderProvider).newInstance();
  }

  /**
   * Test {@link ApiClientFactory#buildAgentClient(String, BdkAgentConfig)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiClientInitializationException}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientFactory#buildAgentClient(String, BdkAgentConfig)}
   */
  @Test
  @DisplayName(
      "Test buildAgentClient(String, BdkAgentConfig); then throw ApiClientInitializationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiClient ApiClientFactory.buildAgentClient(String, BdkAgentConfig)"})
  void testBuildAgentClient_thenThrowApiClientInitializationException2() {
    // Arrange
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    when(apiClientBuilderProvider.newInstance())
        .thenThrow(new ApiClientInitializationException("An error occurred"));
    ApiClientFactory apiClientFactory =
        new ApiClientFactory(mock(BdkConfig.class), apiClientBuilderProvider);

    // Act and Assert
    assertThrows(
        ApiClientInitializationException.class,
        () -> apiClientFactory.buildAgentClient("Base Path", new BdkAgentConfig()));
    verify(apiClientBuilderProvider).newInstance();
  }

  /**
   * Test {@link ApiClientFactory#configureProxy(BdkProxyConfig, ApiClientBuilder)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiClientInitializationException}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientFactory#configureProxy(BdkProxyConfig, ApiClientBuilder)}
   */
  @Test
  @DisplayName(
      "Test configureProxy(BdkProxyConfig, ApiClientBuilder); then throw ApiClientInitializationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiClientFactory.configureProxy(BdkProxyConfig, ApiClientBuilder)"})
  void testConfigureProxy_thenThrowApiClientInitializationException() {
    // Arrange
    ApiClientFactory apiClientFactory = new ApiClientFactory(mock(BdkConfig.class));

    BdkProxyConfig proxyConfig = mock(BdkProxyConfig.class);
    when(proxyConfig.getHost())
        .thenThrow(new ApiClientInitializationException("An error occurred"));

    // Act and Assert
    assertThrows(
        ApiClientInitializationException.class,
        () -> apiClientFactory.configureProxy(proxyConfig, new ApiClientBuilderJersey2()));
    verify(proxyConfig).getHost();
  }

  /**
   * Test {@link ApiClientFactory#configureProxy(BdkProxyConfig, ApiClientBuilder)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiClientInitializationException}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientFactory#configureProxy(BdkProxyConfig, ApiClientBuilder)}
   */
  @Test
  @DisplayName(
      "Test configureProxy(BdkProxyConfig, ApiClientBuilder); then throw ApiClientInitializationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiClientFactory.configureProxy(BdkProxyConfig, ApiClientBuilder)"})
  void testConfigureProxy_thenThrowApiClientInitializationException2() {
    // Arrange
    ApiClientFactory apiClientFactory = new ApiClientFactory(mock(BdkConfig.class));

    BdkProxyConfig proxyConfig = mock(BdkProxyConfig.class);
    when(proxyConfig.getHost())
        .thenThrow(new ApiClientInitializationException("An error occurred"));

    // Act and Assert
    assertThrows(
        ApiClientInitializationException.class,
        () -> apiClientFactory.configureProxy(proxyConfig, new ApiClientBuilderJersey2()));
    verify(proxyConfig).getHost();
  }
}
