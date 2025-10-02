package com.symphony.bdk.core.service.datafeed.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.AuthSession;
import com.symphony.bdk.core.auth.impl.AuthSessionImpl;
import com.symphony.bdk.core.auth.impl.BotAuthenticatorCertImpl;
import com.symphony.bdk.core.config.model.BdkAgentConfig;
import com.symphony.bdk.core.config.model.BdkBotConfig;
import com.symphony.bdk.core.config.model.BdkCertificateConfig;
import com.symphony.bdk.core.config.model.BdkClientConfig;
import com.symphony.bdk.core.config.model.BdkCommonJwtConfig;
import com.symphony.bdk.core.config.model.BdkConfig;
import com.symphony.bdk.core.config.model.BdkDatafeedConfig;
import com.symphony.bdk.core.config.model.BdkDatahoseConfig;
import com.symphony.bdk.core.config.model.BdkExtAppConfig;
import com.symphony.bdk.core.config.model.BdkLoadBalancingConfig;
import com.symphony.bdk.core.config.model.BdkLoadBalancingMode;
import com.symphony.bdk.core.config.model.BdkProxyConfig;
import com.symphony.bdk.core.config.model.BdkRetryConfig;
import com.symphony.bdk.core.config.model.BdkRsaKeyConfig;
import com.symphony.bdk.core.config.model.BdkSslConfig;
import com.symphony.bdk.core.service.datafeed.DatafeedIdRepository;
import com.symphony.bdk.core.service.datafeed.EventException;
import com.symphony.bdk.core.service.datafeed.RealTimeEventListener;
import com.symphony.bdk.core.service.version.AgentVersionService;
import com.symphony.bdk.core.test.BdkRetryConfigTestHelper;
import com.symphony.bdk.gen.api.DatafeedApi;
import com.symphony.bdk.gen.api.model.UserV2;
import com.symphony.bdk.gen.api.model.V4Event;
import com.symphony.bdk.http.api.ApiClient;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import jakarta.ws.rs.client.Client;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DatafeedLoopV1DiffblueTest {
  /**
   * Test {@link DatafeedLoopV1#DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2)}.
   *
   * <p>Method under test: {@link DatafeedLoopV1#DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig,
   * UserV2)}
   */
  @Test
  @DisplayName("Test new DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DatafeedLoopV1.<init>(DatafeedApi, AuthSession, BdkConfig, UserV2)"})
  void testNewDatafeedLoopV1() {
    // Arrange
    DatafeedApi datafeedApi = mock(DatafeedApi.class);
    V4Event event = new V4Event();
    RealTimeEventListener listener = mock(RealTimeEventListener.class);

    RequeueEventException requeueEventException =
        new RequeueEventException(event, listener, new EventException("An error occurred"));
    when(datafeedApi.getApiClient()).thenThrow(requeueEventException);

    // Act and Assert
    assertThrows(
        RequeueEventException.class,
        () ->
            new DatafeedLoopV1(
                datafeedApi, mock(AuthSession.class), mock(BdkConfig.class), mock(UserV2.class)));
    verify(datafeedApi).getApiClient();
  }

  /**
   * Test {@link DatafeedLoopV1#DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2)}.
   *
   * <ul>
   *   <li>Given {@link BdkLoadBalancingConfig} (default constructor) Stickiness is {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedLoopV1#DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig,
   * UserV2)}
   */
  @Test
  @DisplayName(
      "Test new DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2); given BdkLoadBalancingConfig (default constructor) Stickiness is 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DatafeedLoopV1.<init>(DatafeedApi, AuthSession, BdkConfig, UserV2)"})
  void testNewDatafeedLoopV1_givenBdkLoadBalancingConfigStickinessIsFalse()
      throws UnsupportedEncodingException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    DatafeedApi datafeedApi = mock(DatafeedApi.class);
    when(datafeedApi.getApiClient()).thenReturn(apiClientJersey2);
    AuthSession authSession = mock(AuthSession.class);

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

    HashMap<String, String> defaultHeaders2 = new HashMap<>();
    defaultHeaders2.put("Delivered-To", "alice.liddell@example.org");

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
    parentConfig.setConnectionTimeout(10);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders2);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    BdkProxyConfig proxy = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");
    parentConfig.setProxy(proxy);
    parentConfig.setReadTimeout(10);
    parentConfig.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    BdkLoadBalancingConfig loadBalancing = new BdkLoadBalancingConfig();
    loadBalancing.setMode(BdkLoadBalancingMode.EXTERNAL);
    loadBalancing.setNodes(new ArrayList<>());
    loadBalancing.setStickiness(false);

    BdkAgentConfig bdkAgentConfig = new BdkAgentConfig(parentConfig);
    bdkAgentConfig.setLoadBalancing(loadBalancing);

    BdkDatafeedConfig bdkDatafeedConfig = new BdkDatafeedConfig();
    bdkDatafeedConfig.setIdFilePath("/directory/foo.txt");
    bdkDatafeedConfig.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    bdkDatafeedConfig.setVersion("1.0.2");

    BdkConfig config = mock(BdkConfig.class);
    when(config.getDatafeed()).thenReturn(bdkDatafeedConfig);
    when(config.getAgent()).thenReturn(bdkAgentConfig);
    when(config.getDatafeedRetryConfig()).thenReturn(BdkRetryConfigTestHelper.ofMinimalInterval(3));

    // Act
    DatafeedLoopV1 actualDatafeedLoopV1 =
        new DatafeedLoopV1(datafeedApi, authSession, config, mock(UserV2.class));

    // Assert
    verify(config).getAgent();
    verify(config, atLeast(1)).getDatafeed();
    verify(config).getDatafeedRetryConfig();
    verify(datafeedApi).getApiClient();
    assertEquals(0L, actualDatafeedLoopV1.lastPullTimestamp());
    assertFalse(actualDatafeedLoopV1.started.get());
  }

  /**
   * Test {@link DatafeedLoopV1#DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2,
   * DatafeedIdRepository)}.
   *
   * <ul>
   *   <li>Given {@link BdkLoadBalancingConfig} (default constructor) Stickiness is {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedLoopV1#DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig,
   * UserV2, DatafeedIdRepository)}
   */
  @Test
  @DisplayName(
      "Test new DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2, DatafeedIdRepository); given BdkLoadBalancingConfig (default constructor) Stickiness is 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DatafeedLoopV1.<init>(DatafeedApi, AuthSession, BdkConfig, UserV2, DatafeedIdRepository)"
  })
  void testNewDatafeedLoopV1_givenBdkLoadBalancingConfigStickinessIsFalse2()
      throws UnsupportedEncodingException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    DatafeedApi datafeedApi = mock(DatafeedApi.class);
    when(datafeedApi.getApiClient()).thenReturn(apiClientJersey2);
    AuthSession authSession = mock(AuthSession.class);

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

    HashMap<String, String> defaultHeaders2 = new HashMap<>();
    defaultHeaders2.put("Delivered-To", "alice.liddell@example.org");

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
    parentConfig.setConnectionTimeout(10);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders2);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    BdkProxyConfig proxy = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");
    parentConfig.setProxy(proxy);
    parentConfig.setReadTimeout(10);
    parentConfig.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    BdkLoadBalancingConfig loadBalancing = new BdkLoadBalancingConfig();
    loadBalancing.setMode(BdkLoadBalancingMode.EXTERNAL);
    loadBalancing.setNodes(new ArrayList<>());
    loadBalancing.setStickiness(false);

    BdkAgentConfig bdkAgentConfig = new BdkAgentConfig(parentConfig);
    bdkAgentConfig.setLoadBalancing(loadBalancing);

    BdkConfig config = mock(BdkConfig.class);
    when(config.getAgent()).thenReturn(bdkAgentConfig);
    when(config.getDatafeedRetryConfig()).thenReturn(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    UserV2 botInfo = mock(UserV2.class);

    DatafeedIdRepository repository = mock(DatafeedIdRepository.class);
    Optional<String> ofResult = Optional.of("foo");
    when(repository.read()).thenReturn(ofResult);

    // Act
    DatafeedLoopV1 actualDatafeedLoopV1 =
        new DatafeedLoopV1(datafeedApi, authSession, config, botInfo, repository);

    // Assert
    verify(config).getAgent();
    verify(config).getDatafeedRetryConfig();
    verify(repository).read();
    verify(datafeedApi).getApiClient();
    assertEquals(0L, actualDatafeedLoopV1.lastPullTimestamp());
    assertFalse(actualDatafeedLoopV1.started.get());
  }

  /**
   * Test {@link DatafeedLoopV1#DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2)}.
   *
   * <ul>
   *   <li>Given {@link BdkLoadBalancingConfig} (default constructor) Stickiness is {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedLoopV1#DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig,
   * UserV2)}
   */
  @Test
  @DisplayName(
      "Test new DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2); given BdkLoadBalancingConfig (default constructor) Stickiness is 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DatafeedLoopV1.<init>(DatafeedApi, AuthSession, BdkConfig, UserV2)"})
  void testNewDatafeedLoopV1_givenBdkLoadBalancingConfigStickinessIsTrue()
      throws UnsupportedEncodingException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    DatafeedApi datafeedApi = mock(DatafeedApi.class);
    when(datafeedApi.getApiClient()).thenReturn(apiClientJersey2);
    AuthSession authSession = mock(AuthSession.class);

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

    HashMap<String, String> defaultHeaders2 = new HashMap<>();
    defaultHeaders2.put("Delivered-To", "alice.liddell@example.org");

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
    parentConfig.setConnectionTimeout(10);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders2);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    BdkProxyConfig proxy = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");
    parentConfig.setProxy(proxy);
    parentConfig.setReadTimeout(10);
    parentConfig.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    BdkLoadBalancingConfig loadBalancing = new BdkLoadBalancingConfig();
    loadBalancing.setMode(BdkLoadBalancingMode.EXTERNAL);
    loadBalancing.setNodes(new ArrayList<>());
    loadBalancing.setStickiness(true);

    BdkAgentConfig bdkAgentConfig = new BdkAgentConfig(parentConfig);
    bdkAgentConfig.setLoadBalancing(loadBalancing);

    BdkDatafeedConfig bdkDatafeedConfig = new BdkDatafeedConfig();
    bdkDatafeedConfig.setIdFilePath("/directory/foo.txt");
    bdkDatafeedConfig.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    bdkDatafeedConfig.setVersion("1.0.2");

    BdkConfig config = mock(BdkConfig.class);
    when(config.getDatafeed()).thenReturn(bdkDatafeedConfig);
    when(config.getAgent()).thenReturn(bdkAgentConfig);
    when(config.getDatafeedRetryConfig()).thenReturn(BdkRetryConfigTestHelper.ofMinimalInterval(3));

    // Act
    DatafeedLoopV1 actualDatafeedLoopV1 =
        new DatafeedLoopV1(datafeedApi, authSession, config, mock(UserV2.class));

    // Assert
    verify(config).getAgent();
    verify(config, atLeast(1)).getDatafeed();
    verify(config).getDatafeedRetryConfig();
    verify(datafeedApi).getApiClient();
    assertEquals(0L, actualDatafeedLoopV1.lastPullTimestamp());
    assertFalse(actualDatafeedLoopV1.started.get());
  }

  /**
   * Test {@link DatafeedLoopV1#DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2,
   * DatafeedIdRepository)}.
   *
   * <ul>
   *   <li>Given {@link BdkLoadBalancingConfig} (default constructor) Stickiness is {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedLoopV1#DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig,
   * UserV2, DatafeedIdRepository)}
   */
  @Test
  @DisplayName(
      "Test new DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2, DatafeedIdRepository); given BdkLoadBalancingConfig (default constructor) Stickiness is 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DatafeedLoopV1.<init>(DatafeedApi, AuthSession, BdkConfig, UserV2, DatafeedIdRepository)"
  })
  void testNewDatafeedLoopV1_givenBdkLoadBalancingConfigStickinessIsTrue2()
      throws UnsupportedEncodingException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    DatafeedApi datafeedApi = mock(DatafeedApi.class);
    when(datafeedApi.getApiClient()).thenReturn(apiClientJersey2);
    AuthSession authSession = mock(AuthSession.class);

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

    HashMap<String, String> defaultHeaders2 = new HashMap<>();
    defaultHeaders2.put("Delivered-To", "alice.liddell@example.org");

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
    parentConfig.setConnectionTimeout(10);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders2);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    BdkProxyConfig proxy = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");
    parentConfig.setProxy(proxy);
    parentConfig.setReadTimeout(10);
    parentConfig.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    BdkLoadBalancingConfig loadBalancing = new BdkLoadBalancingConfig();
    loadBalancing.setMode(BdkLoadBalancingMode.EXTERNAL);
    loadBalancing.setNodes(new ArrayList<>());
    loadBalancing.setStickiness(true);

    BdkAgentConfig bdkAgentConfig = new BdkAgentConfig(parentConfig);
    bdkAgentConfig.setLoadBalancing(loadBalancing);

    BdkConfig config = mock(BdkConfig.class);
    when(config.getAgent()).thenReturn(bdkAgentConfig);
    when(config.getDatafeedRetryConfig()).thenReturn(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    UserV2 botInfo = mock(UserV2.class);

    DatafeedIdRepository repository = mock(DatafeedIdRepository.class);
    Optional<String> ofResult = Optional.of("foo");
    when(repository.read()).thenReturn(ofResult);

    // Act
    DatafeedLoopV1 actualDatafeedLoopV1 =
        new DatafeedLoopV1(datafeedApi, authSession, config, botInfo, repository);

    // Assert
    verify(config).getAgent();
    verify(config).getDatafeedRetryConfig();
    verify(repository).read();
    verify(datafeedApi).getApiClient();
    assertEquals(0L, actualDatafeedLoopV1.lastPullTimestamp());
    assertFalse(actualDatafeedLoopV1.started.get());
  }

  /**
   * Test {@link DatafeedLoopV1#DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2)}.
   *
   * <ul>
   *   <li>Given {@code Delivered-To}.
   *   <li>Then {@link AbstractDatafeedLoop#authSession} return {@link AuthSessionImpl}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedLoopV1#DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig,
   * UserV2)}
   */
  @Test
  @DisplayName(
      "Test new DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2); given 'Delivered-To'; then authSession return AuthSessionImpl")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DatafeedLoopV1.<init>(DatafeedApi, AuthSession, BdkConfig, UserV2)"})
  void testNewDatafeedLoopV1_givenDeliveredTo_thenAuthSessionReturnAuthSessionImpl()
      throws UnsupportedEncodingException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    DatafeedApi datafeedApi = new DatafeedApi(apiClient);
    BotAuthenticatorCertImpl authenticator =
        new BotAuthenticatorCertImpl(
            mock(BdkRetryConfig.class),
            "janedoe",
            mock(BdkCommonJwtConfig.class),
            mock(ApiClient.class),
            mock(ApiClient.class),
            mock(ApiClient.class),
            mock(AgentVersionService.class));
    AuthSessionImpl authSession = new AuthSessionImpl(authenticator);

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
    datahose.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders2 = new HashMap<>();
    defaultHeaders2.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

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

    BdkDatafeedConfig datafeed = new BdkDatafeedConfig();
    datafeed.setIdFilePath("/directory/foo.txt");
    datafeed.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose2 = new BdkDatahoseConfig();
    datahose2.setEventTypes(new ArrayList<>());
    datahose2.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    datahose2.setTag("Tag");

    HashMap<String, String> defaultHeaders3 = new HashMap<>();
    defaultHeaders3.put("Delivered-To", "alice.liddell@example.org");

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
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose2);
    parentConfig.setDefaultHeaders(defaultHeaders3);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    BdkProxyConfig proxy = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");
    parentConfig.setProxy(proxy);
    parentConfig.setReadTimeout(10);
    parentConfig.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl2);

    BdkAgentConfig agent = new BdkAgentConfig(parentConfig);
    agent.setLoadBalancing(null);

    BdkDatafeedConfig datafeed2 = new BdkDatafeedConfig();
    datafeed2.setIdFilePath("/directory/foo.txt");
    datafeed2.setVersion("1.0.2");
    datafeed2.setRetry(null);

    BdkConfig config = new BdkConfig();
    config.setApp(app);
    config.setBot(bot);
    config.setCommonJwt(commonJwt);
    config.setConnectionPoolMax(1);
    config.setConnectionPoolPerRoute(1);
    config.setConnectionTimeout(10);
    config.setContext("Context");
    config.setDatahose(datahose);
    config.setDefaultHeaders(defaultHeaders2);
    config.setHost("localhost");
    config.setKeyManager(new BdkClientConfig());
    config.setPod(new BdkClientConfig());
    config.setPort(8080);
    BdkProxyConfig proxy2 = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");
    config.setProxy(proxy2);
    config.setReadTimeout(10);
    config.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    config.setScheme("Scheme");
    config.setSessionAuth(new BdkClientConfig());
    config.setSsl(ssl);
    config.setAgent(agent);
    config.setDatafeed(datafeed2);

    // Act
    DatafeedLoopV1 actualDatafeedLoopV1 =
        new DatafeedLoopV1(datafeedApi, authSession, config, new UserV2());

    // Assert
    assertTrue(actualDatafeedLoopV1.authSession instanceof AuthSessionImpl);
  }

  /**
   * Test {@link DatafeedLoopV1#DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2)}.
   *
   * <ul>
   *   <li>Then return lastPullTimestamp is zero.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedLoopV1#DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig,
   * UserV2)}
   */
  @Test
  @DisplayName(
      "Test new DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2); then return lastPullTimestamp is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DatafeedLoopV1.<init>(DatafeedApi, AuthSession, BdkConfig, UserV2)"})
  void testNewDatafeedLoopV1_thenReturnLastPullTimestampIsZero()
      throws UnsupportedEncodingException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    DatafeedApi datafeedApi = mock(DatafeedApi.class);
    when(datafeedApi.getApiClient()).thenReturn(apiClientJersey2);
    AuthSession authSession = mock(AuthSession.class);

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

    HashMap<String, String> defaultHeaders2 = new HashMap<>();
    defaultHeaders2.put("Delivered-To", "alice.liddell@example.org");

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
    parentConfig.setConnectionTimeout(10);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders2);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    BdkProxyConfig proxy = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");
    parentConfig.setProxy(proxy);
    parentConfig.setReadTimeout(10);
    parentConfig.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    BdkAgentConfig bdkAgentConfig = new BdkAgentConfig(parentConfig);
    bdkAgentConfig.setLoadBalancing(null);

    BdkDatafeedConfig bdkDatafeedConfig = new BdkDatafeedConfig();
    bdkDatafeedConfig.setIdFilePath("/directory/foo.txt");
    bdkDatafeedConfig.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    bdkDatafeedConfig.setVersion("1.0.2");

    BdkConfig config = mock(BdkConfig.class);
    when(config.getDatafeed()).thenReturn(bdkDatafeedConfig);
    when(config.getAgent()).thenReturn(bdkAgentConfig);
    when(config.getDatafeedRetryConfig()).thenReturn(BdkRetryConfigTestHelper.ofMinimalInterval(3));

    // Act
    DatafeedLoopV1 actualDatafeedLoopV1 =
        new DatafeedLoopV1(datafeedApi, authSession, config, mock(UserV2.class));

    // Assert
    verify(config).getAgent();
    verify(config, atLeast(1)).getDatafeed();
    verify(config).getDatafeedRetryConfig();
    verify(datafeedApi).getApiClient();
    assertEquals(0L, actualDatafeedLoopV1.lastPullTimestamp());
    assertFalse(actualDatafeedLoopV1.started.get());
  }

  /**
   * Test {@link DatafeedLoopV1#DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2,
   * DatafeedIdRepository)}.
   *
   * <ul>
   *   <li>Then return lastPullTimestamp is zero.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedLoopV1#DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig,
   * UserV2, DatafeedIdRepository)}
   */
  @Test
  @DisplayName(
      "Test new DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2, DatafeedIdRepository); then return lastPullTimestamp is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DatafeedLoopV1.<init>(DatafeedApi, AuthSession, BdkConfig, UserV2, DatafeedIdRepository)"
  })
  void testNewDatafeedLoopV1_thenReturnLastPullTimestampIsZero2()
      throws UnsupportedEncodingException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    DatafeedApi datafeedApi = mock(DatafeedApi.class);
    when(datafeedApi.getApiClient()).thenReturn(apiClientJersey2);
    AuthSession authSession = mock(AuthSession.class);

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

    HashMap<String, String> defaultHeaders2 = new HashMap<>();
    defaultHeaders2.put("Delivered-To", "alice.liddell@example.org");

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
    parentConfig.setConnectionTimeout(10);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders2);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    BdkProxyConfig proxy = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");
    parentConfig.setProxy(proxy);
    parentConfig.setReadTimeout(10);
    parentConfig.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    BdkAgentConfig bdkAgentConfig = new BdkAgentConfig(parentConfig);
    bdkAgentConfig.setLoadBalancing(null);

    BdkConfig config = mock(BdkConfig.class);
    when(config.getAgent()).thenReturn(bdkAgentConfig);
    when(config.getDatafeedRetryConfig()).thenReturn(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    UserV2 botInfo = mock(UserV2.class);

    DatafeedIdRepository repository = mock(DatafeedIdRepository.class);
    Optional<String> ofResult = Optional.of("foo");
    when(repository.read()).thenReturn(ofResult);

    // Act
    DatafeedLoopV1 actualDatafeedLoopV1 =
        new DatafeedLoopV1(datafeedApi, authSession, config, botInfo, repository);

    // Assert
    verify(config).getAgent();
    verify(config).getDatafeedRetryConfig();
    verify(repository).read();
    verify(datafeedApi).getApiClient();
    assertEquals(0L, actualDatafeedLoopV1.lastPullTimestamp());
    assertFalse(actualDatafeedLoopV1.started.get());
  }

  /**
   * Test {@link DatafeedLoopV1#DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2)}.
   *
   * <p>Method under test: {@link DatafeedLoopV1#DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig,
   * UserV2)}
   */
  @Test
  @DisplayName("Test new DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DatafeedLoopV1.<init>(DatafeedApi, AuthSession, BdkConfig, UserV2)"})
  void testNewDatafeedLoopV12() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    DatafeedApi datafeedApi = mock(DatafeedApi.class);
    when(datafeedApi.getApiClient()).thenReturn(apiClientJersey2);
    AuthSession authSession = mock(AuthSession.class);

    BdkConfig config = mock(BdkConfig.class);
    V4Event event = new V4Event();
    RealTimeEventListener listener = mock(RealTimeEventListener.class);

    RequeueEventException requeueEventException =
        new RequeueEventException(event, listener, new EventException("An error occurred"));
    when(config.getDatafeedRetryConfig()).thenThrow(requeueEventException);

    // Act and Assert
    assertThrows(
        RequeueEventException.class,
        () -> new DatafeedLoopV1(datafeedApi, authSession, config, mock(UserV2.class)));
    verify(config).getDatafeedRetryConfig();
    verify(datafeedApi).getApiClient();
  }

  /**
   * Test {@link DatafeedLoopV1#DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2)}.
   *
   * <p>Method under test: {@link DatafeedLoopV1#DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig,
   * UserV2)}
   */
  @Test
  @DisplayName("Test new DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DatafeedLoopV1.<init>(DatafeedApi, AuthSession, BdkConfig, UserV2)"})
  void testNewDatafeedLoopV13() throws UnsupportedEncodingException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    DatafeedApi datafeedApi = mock(DatafeedApi.class);
    when(datafeedApi.getApiClient()).thenReturn(apiClientJersey2);
    AuthSession authSession = mock(AuthSession.class);

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

    HashMap<String, String> defaultHeaders2 = new HashMap<>();
    defaultHeaders2.put("Delivered-To", "alice.liddell@example.org");

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
    parentConfig.setConnectionTimeout(10);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders2);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    BdkProxyConfig proxy = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");
    parentConfig.setProxy(proxy);
    parentConfig.setReadTimeout(10);
    parentConfig.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    BdkAgentConfig bdkAgentConfig = new BdkAgentConfig(parentConfig);
    bdkAgentConfig.setLoadBalancing(null);

    BdkConfig config = mock(BdkConfig.class);
    V4Event event = new V4Event();
    RealTimeEventListener listener = mock(RealTimeEventListener.class);

    RequeueEventException requeueEventException =
        new RequeueEventException(event, listener, new EventException("An error occurred"));
    when(config.getDatafeed()).thenThrow(requeueEventException);
    when(config.getAgent()).thenReturn(bdkAgentConfig);
    when(config.getDatafeedRetryConfig()).thenReturn(BdkRetryConfigTestHelper.ofMinimalInterval(3));

    // Act and Assert
    assertThrows(
        RequeueEventException.class,
        () -> new DatafeedLoopV1(datafeedApi, authSession, config, mock(UserV2.class)));
    verify(config).getAgent();
    verify(config).getDatafeed();
    verify(config).getDatafeedRetryConfig();
    verify(datafeedApi).getApiClient();
  }

  /**
   * Test {@link DatafeedLoopV1#DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2,
   * DatafeedIdRepository)}.
   *
   * <p>Method under test: {@link DatafeedLoopV1#DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig,
   * UserV2, DatafeedIdRepository)}
   */
  @Test
  @DisplayName(
      "Test new DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2, DatafeedIdRepository)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DatafeedLoopV1.<init>(DatafeedApi, AuthSession, BdkConfig, UserV2, DatafeedIdRepository)"
  })
  void testNewDatafeedLoopV14() {
    // Arrange
    DatafeedApi datafeedApi = mock(DatafeedApi.class);
    V4Event event = new V4Event();
    RealTimeEventListener listener = mock(RealTimeEventListener.class);

    RequeueEventException requeueEventException =
        new RequeueEventException(event, listener, new EventException("An error occurred"));
    when(datafeedApi.getApiClient()).thenThrow(requeueEventException);

    // Act and Assert
    assertThrows(
        RequeueEventException.class,
        () ->
            new DatafeedLoopV1(
                datafeedApi,
                mock(AuthSession.class),
                mock(BdkConfig.class),
                mock(UserV2.class),
                mock(DatafeedIdRepository.class)));
    verify(datafeedApi).getApiClient();
  }

  /**
   * Test {@link DatafeedLoopV1#DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2,
   * DatafeedIdRepository)}.
   *
   * <p>Method under test: {@link DatafeedLoopV1#DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig,
   * UserV2, DatafeedIdRepository)}
   */
  @Test
  @DisplayName(
      "Test new DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2, DatafeedIdRepository)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DatafeedLoopV1.<init>(DatafeedApi, AuthSession, BdkConfig, UserV2, DatafeedIdRepository)"
  })
  void testNewDatafeedLoopV15() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    DatafeedApi datafeedApi = mock(DatafeedApi.class);
    when(datafeedApi.getApiClient()).thenReturn(apiClientJersey2);
    AuthSession authSession = mock(AuthSession.class);

    BdkConfig config = mock(BdkConfig.class);
    V4Event event = new V4Event();
    RealTimeEventListener listener = mock(RealTimeEventListener.class);

    RequeueEventException requeueEventException =
        new RequeueEventException(event, listener, new EventException("An error occurred"));
    when(config.getDatafeedRetryConfig()).thenThrow(requeueEventException);

    // Act and Assert
    assertThrows(
        RequeueEventException.class,
        () ->
            new DatafeedLoopV1(
                datafeedApi,
                authSession,
                config,
                mock(UserV2.class),
                mock(DatafeedIdRepository.class)));
    verify(config).getDatafeedRetryConfig();
    verify(datafeedApi).getApiClient();
  }

  /**
   * Test {@link DatafeedLoopV1#DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2,
   * DatafeedIdRepository)}.
   *
   * <p>Method under test: {@link DatafeedLoopV1#DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig,
   * UserV2, DatafeedIdRepository)}
   */
  @Test
  @DisplayName(
      "Test new DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2, DatafeedIdRepository)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DatafeedLoopV1.<init>(DatafeedApi, AuthSession, BdkConfig, UserV2, DatafeedIdRepository)"
  })
  void testNewDatafeedLoopV16() throws UnsupportedEncodingException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    DatafeedApi datafeedApi = mock(DatafeedApi.class);
    when(datafeedApi.getApiClient()).thenReturn(apiClientJersey2);
    AuthSession authSession = mock(AuthSession.class);

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

    HashMap<String, String> defaultHeaders2 = new HashMap<>();
    defaultHeaders2.put("Delivered-To", "alice.liddell@example.org");

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
    parentConfig.setConnectionTimeout(10);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders2);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    BdkProxyConfig proxy = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");
    parentConfig.setProxy(proxy);
    parentConfig.setReadTimeout(10);
    parentConfig.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    BdkAgentConfig bdkAgentConfig = new BdkAgentConfig(parentConfig);
    bdkAgentConfig.setLoadBalancing(null);

    BdkConfig config = mock(BdkConfig.class);
    when(config.getAgent()).thenReturn(bdkAgentConfig);
    when(config.getDatafeedRetryConfig()).thenReturn(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    UserV2 botInfo = mock(UserV2.class);

    DatafeedIdRepository repository = mock(DatafeedIdRepository.class);
    V4Event event = new V4Event();
    RealTimeEventListener listener = mock(RealTimeEventListener.class);

    RequeueEventException requeueEventException =
        new RequeueEventException(event, listener, new EventException("An error occurred"));
    when(repository.read()).thenThrow(requeueEventException);

    // Act and Assert
    assertThrows(
        RequeueEventException.class,
        () -> new DatafeedLoopV1(datafeedApi, authSession, config, botInfo, repository));
    verify(config).getAgent();
    verify(config).getDatafeedRetryConfig();
    verify(repository).read();
    verify(datafeedApi).getApiClient();
  }
}
