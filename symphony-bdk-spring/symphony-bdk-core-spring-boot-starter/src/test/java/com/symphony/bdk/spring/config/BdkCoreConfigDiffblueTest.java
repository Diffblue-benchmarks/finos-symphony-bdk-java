package com.symphony.bdk.spring.config;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyBoolean;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.AuthSession;
import com.symphony.bdk.core.auth.AuthenticatorFactory;
import com.symphony.bdk.core.auth.ExtensionAppTokensRepository;
import com.symphony.bdk.core.auth.impl.AuthSessionImpl;
import com.symphony.bdk.core.auth.impl.InMemoryTokensRepository;
import com.symphony.bdk.core.client.ApiClientFactory;
import com.symphony.bdk.core.client.loadbalancing.DatafeedLoadBalancedApiClient;
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
import com.symphony.bdk.core.config.model.BdkServerConfig;
import com.symphony.bdk.core.config.model.BdkSslConfig;
import com.symphony.bdk.http.api.ApiClient;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import com.symphony.bdk.spring.SymphonyBdkCoreProperties;
import com.symphony.bdk.template.api.TemplateEngine;
import com.symphony.bdk.template.freemarker.FreeMarkerEngine;
import com.symphony.bdk.template.freemarker.FreeMarkerTemplate;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {BdkCoreConfig.class, SymphonyBdkCoreProperties.class})
@ExtendWith(SpringExtension.class)
@ExtendWith(MockitoExtension.class)
class BdkCoreConfigDiffblueTest {
  @Autowired
  private BdkCoreConfig bdkCoreConfig;

  /**
   * Test {@link BdkCoreConfig#apiClientFactory(SymphonyBdkCoreProperties)}.
   * <p>
   * Method under test: {@link BdkCoreConfig#apiClientFactory(SymphonyBdkCoreProperties)}
   */
  @Test
  @DisplayName("Test apiClientFactory(SymphonyBdkCoreProperties)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClientFactory BdkCoreConfig.apiClientFactory(SymphonyBdkCoreProperties)"})
  void testApiClientFactory() {
    // Arrange and Act
    ApiClientFactory actualApiClientFactoryResult = bdkCoreConfig.apiClientFactory(new SymphonyBdkCoreProperties());

    // Assert
    assertTrue(actualApiClientFactoryResult.getAgentClient() instanceof ApiClientJersey2);
    assertTrue(actualApiClientFactoryResult.getDatafeedAgentClient() instanceof ApiClientJersey2);
    assertTrue(actualApiClientFactoryResult.getDatahoseAgentClient() instanceof ApiClientJersey2);
    assertTrue(actualApiClientFactoryResult.getLoginClient() instanceof ApiClientJersey2);
    assertTrue(actualApiClientFactoryResult.getPodClient() instanceof ApiClientJersey2);
    assertTrue(actualApiClientFactoryResult.getRegularAgentClient() instanceof ApiClientJersey2);
    assertTrue(actualApiClientFactoryResult.getRelayClient() instanceof ApiClientJersey2);
  }

  /**
   * Test {@link BdkCoreConfig#agentApiClient(ApiClientFactory)}.
   * <p>
   * Method under test: {@link BdkCoreConfig#agentApiClient(ApiClientFactory)}
   */
  @Test
  @DisplayName("Test agentApiClient(ApiClientFactory)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient BdkCoreConfig.agentApiClient(ApiClientFactory)"})
  void testAgentApiClient() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    BdkAgentConfig bdkAgentConfig = mock(BdkAgentConfig.class);
    when(bdkAgentConfig.getBasePath()).thenReturn("Base Path");
    doNothing().when(bdkAgentConfig).setConnectionPoolMax(Mockito.<Integer>any());
    doNothing().when(bdkAgentConfig).setConnectionPoolPerRoute(Mockito.<Integer>any());
    doNothing().when(bdkAgentConfig).setConnectionTimeout(Mockito.<Integer>any());
    doNothing().when(bdkAgentConfig).setContext(Mockito.<String>any());
    doNothing().when(bdkAgentConfig).setDefaultHeaders(Mockito.<Map<String, String>>any());
    doNothing().when(bdkAgentConfig).setHost(Mockito.<String>any());
    doNothing().when(bdkAgentConfig).setPort(Mockito.<Integer>any());
    doNothing().when(bdkAgentConfig).setProxy(Mockito.<BdkProxyConfig>any());
    doNothing().when(bdkAgentConfig).setReadTimeout(Mockito.<Integer>any());
    doNothing().when(bdkAgentConfig).setScheme(Mockito.<String>any());
    bdkAgentConfig.setConnectionPoolMax(1);
    bdkAgentConfig.setConnectionPoolPerRoute(1);
    bdkAgentConfig.setConnectionTimeout(10);
    bdkAgentConfig.setContext("Context");
    bdkAgentConfig.setDefaultHeaders(defaultHeaders);
    bdkAgentConfig.setHost("localhost");
    bdkAgentConfig.setPort(8080);
    bdkAgentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    bdkAgentConfig.setReadTimeout(10);
    bdkAgentConfig.setScheme("Scheme");

    ArrayList<BdkServerConfig> bdkServerConfigList = new ArrayList<>();
    bdkServerConfigList.add(bdkAgentConfig);
    BdkLoadBalancingConfig bdkLoadBalancingConfig = mock(BdkLoadBalancingConfig.class);
    when(bdkLoadBalancingConfig.getNodes()).thenReturn(bdkServerConfigList);
    when(bdkLoadBalancingConfig.getMode()).thenReturn(BdkLoadBalancingMode.RANDOM);
    doNothing().when(bdkLoadBalancingConfig).setMode(Mockito.<BdkLoadBalancingMode>any());
    doNothing().when(bdkLoadBalancingConfig).setNodes(Mockito.<List<BdkServerConfig>>any());
    doNothing().when(bdkLoadBalancingConfig).setStickiness(anyBoolean());
    bdkLoadBalancingConfig.setMode(BdkLoadBalancingMode.EXTERNAL);
    bdkLoadBalancingConfig.setNodes(new ArrayList<>());
    bdkLoadBalancingConfig.setStickiness(true);
    BdkAgentConfig bdkAgentConfig2 = mock(BdkAgentConfig.class);
    when(bdkAgentConfig2.overridesParentConfig()).thenReturn(false);
    when(bdkAgentConfig2.getLoadBalancing()).thenReturn(bdkLoadBalancingConfig);
    BdkConfig config = mock(BdkConfig.class);
    when(config.getAgent()).thenReturn(bdkAgentConfig2);
    DatafeedLoadBalancedApiClient datafeedLoadBalancedApiClient = new DatafeedLoadBalancedApiClient(config,
        new ApiClientFactory(new BdkConfig()));

    ApiClientFactory apiClientFactory = mock(ApiClientFactory.class);
    when(apiClientFactory.getAgentClient()).thenReturn(datafeedLoadBalancedApiClient);

    // Act
    ApiClient actualAgentApiClientResult = bdkCoreConfig.agentApiClient(apiClientFactory);

    // Assert
    verify(apiClientFactory).getAgentClient();
    verify(bdkAgentConfig2, atLeast(1)).getLoadBalancing();
    verify(bdkAgentConfig2).overridesParentConfig();
    verify(config, atLeast(1)).getAgent();
    verify(bdkLoadBalancingConfig, atLeast(1)).getMode();
    verify(bdkLoadBalancingConfig, atLeast(1)).getNodes();
    verify(bdkLoadBalancingConfig).setMode(eq(BdkLoadBalancingMode.EXTERNAL));
    verify(bdkLoadBalancingConfig).setNodes(isA(List.class));
    verify(bdkLoadBalancingConfig).setStickiness(eq(true));
    verify(bdkAgentConfig).getBasePath();
    verify(bdkAgentConfig).setConnectionPoolMax(eq(1));
    verify(bdkAgentConfig).setConnectionPoolPerRoute(eq(1));
    verify(bdkAgentConfig).setConnectionTimeout(eq(10));
    verify(bdkAgentConfig).setContext(eq("Context"));
    verify(bdkAgentConfig).setDefaultHeaders(isA(Map.class));
    verify(bdkAgentConfig).setHost(eq("localhost"));
    verify(bdkAgentConfig).setPort(eq(8080));
    verify(bdkAgentConfig).setProxy(isA(BdkProxyConfig.class));
    verify(bdkAgentConfig).setReadTimeout(eq(10));
    verify(bdkAgentConfig).setScheme(eq("Scheme"));
    assertSame(datafeedLoadBalancedApiClient, actualAgentApiClientResult);
  }

  /**
   * Test {@link BdkCoreConfig#agentApiClient(ApiClientFactory)}.
   * <ul>
   *   <li>Then return {@link ApiClientJersey2}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkCoreConfig#agentApiClient(ApiClientFactory)}
   */
  @Test
  @DisplayName("Test agentApiClient(ApiClientFactory); then return ApiClientJersey2")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient BdkCoreConfig.agentApiClient(ApiClientFactory)"})
  void testAgentApiClient_thenReturnApiClientJersey2() {
    // Arrange and Act
    ApiClient actualAgentApiClientResult = bdkCoreConfig.agentApiClient(new ApiClientFactory(new BdkConfig()));

    // Assert
    assertTrue(actualAgentApiClientResult instanceof ApiClientJersey2);
    assertEquals("https://null:443/agent", actualAgentApiClientResult.getBasePath());
    assertTrue(actualAgentApiClientResult.getAuthentications().isEmpty());
  }

  /**
   * Test {@link BdkCoreConfig#datafeedAgentApiClient(ApiClientFactory)}.
   * <p>
   * Method under test: {@link BdkCoreConfig#datafeedAgentApiClient(ApiClientFactory)}
   */
  @Test
  @DisplayName("Test datafeedAgentApiClient(ApiClientFactory)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient BdkCoreConfig.datafeedAgentApiClient(ApiClientFactory)"})
  void testDatafeedAgentApiClient() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    BdkAgentConfig bdkAgentConfig = mock(BdkAgentConfig.class);
    when(bdkAgentConfig.getBasePath()).thenReturn("Base Path");
    doNothing().when(bdkAgentConfig).setConnectionPoolMax(Mockito.<Integer>any());
    doNothing().when(bdkAgentConfig).setConnectionPoolPerRoute(Mockito.<Integer>any());
    doNothing().when(bdkAgentConfig).setConnectionTimeout(Mockito.<Integer>any());
    doNothing().when(bdkAgentConfig).setContext(Mockito.<String>any());
    doNothing().when(bdkAgentConfig).setDefaultHeaders(Mockito.<Map<String, String>>any());
    doNothing().when(bdkAgentConfig).setHost(Mockito.<String>any());
    doNothing().when(bdkAgentConfig).setPort(Mockito.<Integer>any());
    doNothing().when(bdkAgentConfig).setProxy(Mockito.<BdkProxyConfig>any());
    doNothing().when(bdkAgentConfig).setReadTimeout(Mockito.<Integer>any());
    doNothing().when(bdkAgentConfig).setScheme(Mockito.<String>any());
    bdkAgentConfig.setConnectionPoolMax(1);
    bdkAgentConfig.setConnectionPoolPerRoute(1);
    bdkAgentConfig.setConnectionTimeout(10);
    bdkAgentConfig.setContext("Context");
    bdkAgentConfig.setDefaultHeaders(defaultHeaders);
    bdkAgentConfig.setHost("localhost");
    bdkAgentConfig.setPort(8080);
    bdkAgentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    bdkAgentConfig.setReadTimeout(10);
    bdkAgentConfig.setScheme("Scheme");

    ArrayList<BdkServerConfig> bdkServerConfigList = new ArrayList<>();
    bdkServerConfigList.add(bdkAgentConfig);
    BdkLoadBalancingConfig bdkLoadBalancingConfig = mock(BdkLoadBalancingConfig.class);
    when(bdkLoadBalancingConfig.getNodes()).thenReturn(bdkServerConfigList);
    when(bdkLoadBalancingConfig.getMode()).thenReturn(BdkLoadBalancingMode.RANDOM);
    doNothing().when(bdkLoadBalancingConfig).setMode(Mockito.<BdkLoadBalancingMode>any());
    doNothing().when(bdkLoadBalancingConfig).setNodes(Mockito.<List<BdkServerConfig>>any());
    doNothing().when(bdkLoadBalancingConfig).setStickiness(anyBoolean());
    bdkLoadBalancingConfig.setMode(BdkLoadBalancingMode.EXTERNAL);
    bdkLoadBalancingConfig.setNodes(new ArrayList<>());
    bdkLoadBalancingConfig.setStickiness(true);
    BdkAgentConfig bdkAgentConfig2 = mock(BdkAgentConfig.class);
    when(bdkAgentConfig2.overridesParentConfig()).thenReturn(false);
    when(bdkAgentConfig2.getLoadBalancing()).thenReturn(bdkLoadBalancingConfig);
    BdkConfig config = mock(BdkConfig.class);
    when(config.getAgent()).thenReturn(bdkAgentConfig2);
    DatafeedLoadBalancedApiClient datafeedLoadBalancedApiClient = new DatafeedLoadBalancedApiClient(config,
        new ApiClientFactory(new BdkConfig()));

    ApiClientFactory apiClientFactory = mock(ApiClientFactory.class);
    when(apiClientFactory.getDatafeedAgentClient()).thenReturn(datafeedLoadBalancedApiClient);

    // Act
    ApiClient actualDatafeedAgentApiClientResult = bdkCoreConfig.datafeedAgentApiClient(apiClientFactory);

    // Assert
    verify(apiClientFactory).getDatafeedAgentClient();
    verify(bdkAgentConfig2, atLeast(1)).getLoadBalancing();
    verify(bdkAgentConfig2).overridesParentConfig();
    verify(config, atLeast(1)).getAgent();
    verify(bdkLoadBalancingConfig, atLeast(1)).getMode();
    verify(bdkLoadBalancingConfig, atLeast(1)).getNodes();
    verify(bdkLoadBalancingConfig).setMode(eq(BdkLoadBalancingMode.EXTERNAL));
    verify(bdkLoadBalancingConfig).setNodes(isA(List.class));
    verify(bdkLoadBalancingConfig).setStickiness(eq(true));
    verify(bdkAgentConfig).getBasePath();
    verify(bdkAgentConfig).setConnectionPoolMax(eq(1));
    verify(bdkAgentConfig).setConnectionPoolPerRoute(eq(1));
    verify(bdkAgentConfig).setConnectionTimeout(eq(10));
    verify(bdkAgentConfig).setContext(eq("Context"));
    verify(bdkAgentConfig).setDefaultHeaders(isA(Map.class));
    verify(bdkAgentConfig).setHost(eq("localhost"));
    verify(bdkAgentConfig).setPort(eq(8080));
    verify(bdkAgentConfig).setProxy(isA(BdkProxyConfig.class));
    verify(bdkAgentConfig).setReadTimeout(eq(10));
    verify(bdkAgentConfig).setScheme(eq("Scheme"));
    assertSame(datafeedLoadBalancedApiClient, actualDatafeedAgentApiClientResult);
  }

  /**
   * Test {@link BdkCoreConfig#datafeedAgentApiClient(ApiClientFactory)}.
   * <ul>
   *   <li>Then return {@link ApiClientJersey2}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkCoreConfig#datafeedAgentApiClient(ApiClientFactory)}
   */
  @Test
  @DisplayName("Test datafeedAgentApiClient(ApiClientFactory); then return ApiClientJersey2")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient BdkCoreConfig.datafeedAgentApiClient(ApiClientFactory)"})
  void testDatafeedAgentApiClient_thenReturnApiClientJersey2() {
    // Arrange and Act
    ApiClient actualDatafeedAgentApiClientResult = bdkCoreConfig
        .datafeedAgentApiClient(new ApiClientFactory(new BdkConfig()));

    // Assert
    assertTrue(actualDatafeedAgentApiClientResult instanceof ApiClientJersey2);
    assertEquals("https://null:443/agent", actualDatafeedAgentApiClientResult.getBasePath());
    assertTrue(actualDatafeedAgentApiClientResult.getAuthentications().isEmpty());
  }

  /**
   * Test {@link BdkCoreConfig#datahoseAgentApiClient(ApiClientFactory)}.
   * <p>
   * Method under test: {@link BdkCoreConfig#datahoseAgentApiClient(ApiClientFactory)}
   */
  @Test
  @DisplayName("Test datahoseAgentApiClient(ApiClientFactory)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient BdkCoreConfig.datahoseAgentApiClient(ApiClientFactory)"})
  void testDatahoseAgentApiClient() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    BdkAgentConfig bdkAgentConfig = mock(BdkAgentConfig.class);
    when(bdkAgentConfig.getBasePath()).thenReturn("Base Path");
    doNothing().when(bdkAgentConfig).setConnectionPoolMax(Mockito.<Integer>any());
    doNothing().when(bdkAgentConfig).setConnectionPoolPerRoute(Mockito.<Integer>any());
    doNothing().when(bdkAgentConfig).setConnectionTimeout(Mockito.<Integer>any());
    doNothing().when(bdkAgentConfig).setContext(Mockito.<String>any());
    doNothing().when(bdkAgentConfig).setDefaultHeaders(Mockito.<Map<String, String>>any());
    doNothing().when(bdkAgentConfig).setHost(Mockito.<String>any());
    doNothing().when(bdkAgentConfig).setPort(Mockito.<Integer>any());
    doNothing().when(bdkAgentConfig).setProxy(Mockito.<BdkProxyConfig>any());
    doNothing().when(bdkAgentConfig).setReadTimeout(Mockito.<Integer>any());
    doNothing().when(bdkAgentConfig).setScheme(Mockito.<String>any());
    bdkAgentConfig.setConnectionPoolMax(1);
    bdkAgentConfig.setConnectionPoolPerRoute(1);
    bdkAgentConfig.setConnectionTimeout(10);
    bdkAgentConfig.setContext("Context");
    bdkAgentConfig.setDefaultHeaders(defaultHeaders);
    bdkAgentConfig.setHost("localhost");
    bdkAgentConfig.setPort(8080);
    bdkAgentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    bdkAgentConfig.setReadTimeout(10);
    bdkAgentConfig.setScheme("Scheme");

    ArrayList<BdkServerConfig> bdkServerConfigList = new ArrayList<>();
    bdkServerConfigList.add(bdkAgentConfig);
    BdkLoadBalancingConfig bdkLoadBalancingConfig = mock(BdkLoadBalancingConfig.class);
    when(bdkLoadBalancingConfig.getNodes()).thenReturn(bdkServerConfigList);
    when(bdkLoadBalancingConfig.getMode()).thenReturn(BdkLoadBalancingMode.RANDOM);
    doNothing().when(bdkLoadBalancingConfig).setMode(Mockito.<BdkLoadBalancingMode>any());
    doNothing().when(bdkLoadBalancingConfig).setNodes(Mockito.<List<BdkServerConfig>>any());
    doNothing().when(bdkLoadBalancingConfig).setStickiness(anyBoolean());
    bdkLoadBalancingConfig.setMode(BdkLoadBalancingMode.EXTERNAL);
    bdkLoadBalancingConfig.setNodes(new ArrayList<>());
    bdkLoadBalancingConfig.setStickiness(true);
    BdkAgentConfig bdkAgentConfig2 = mock(BdkAgentConfig.class);
    when(bdkAgentConfig2.overridesParentConfig()).thenReturn(false);
    when(bdkAgentConfig2.getLoadBalancing()).thenReturn(bdkLoadBalancingConfig);
    BdkConfig config = mock(BdkConfig.class);
    when(config.getAgent()).thenReturn(bdkAgentConfig2);
    DatafeedLoadBalancedApiClient datafeedLoadBalancedApiClient = new DatafeedLoadBalancedApiClient(config,
        new ApiClientFactory(new BdkConfig()));

    ApiClientFactory apiClientFactory = mock(ApiClientFactory.class);
    when(apiClientFactory.getDatahoseAgentClient()).thenReturn(datafeedLoadBalancedApiClient);

    // Act
    ApiClient actualDatahoseAgentApiClientResult = bdkCoreConfig.datahoseAgentApiClient(apiClientFactory);

    // Assert
    verify(apiClientFactory).getDatahoseAgentClient();
    verify(bdkAgentConfig2, atLeast(1)).getLoadBalancing();
    verify(bdkAgentConfig2).overridesParentConfig();
    verify(config, atLeast(1)).getAgent();
    verify(bdkLoadBalancingConfig, atLeast(1)).getMode();
    verify(bdkLoadBalancingConfig, atLeast(1)).getNodes();
    verify(bdkLoadBalancingConfig).setMode(eq(BdkLoadBalancingMode.EXTERNAL));
    verify(bdkLoadBalancingConfig).setNodes(isA(List.class));
    verify(bdkLoadBalancingConfig).setStickiness(eq(true));
    verify(bdkAgentConfig).getBasePath();
    verify(bdkAgentConfig).setConnectionPoolMax(eq(1));
    verify(bdkAgentConfig).setConnectionPoolPerRoute(eq(1));
    verify(bdkAgentConfig).setConnectionTimeout(eq(10));
    verify(bdkAgentConfig).setContext(eq("Context"));
    verify(bdkAgentConfig).setDefaultHeaders(isA(Map.class));
    verify(bdkAgentConfig).setHost(eq("localhost"));
    verify(bdkAgentConfig).setPort(eq(8080));
    verify(bdkAgentConfig).setProxy(isA(BdkProxyConfig.class));
    verify(bdkAgentConfig).setReadTimeout(eq(10));
    verify(bdkAgentConfig).setScheme(eq("Scheme"));
    assertSame(datafeedLoadBalancedApiClient, actualDatahoseAgentApiClientResult);
  }

  /**
   * Test {@link BdkCoreConfig#datahoseAgentApiClient(ApiClientFactory)}.
   * <ul>
   *   <li>Then return {@link ApiClientJersey2}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkCoreConfig#datahoseAgentApiClient(ApiClientFactory)}
   */
  @Test
  @DisplayName("Test datahoseAgentApiClient(ApiClientFactory); then return ApiClientJersey2")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient BdkCoreConfig.datahoseAgentApiClient(ApiClientFactory)"})
  void testDatahoseAgentApiClient_thenReturnApiClientJersey2() {
    // Arrange and Act
    ApiClient actualDatahoseAgentApiClientResult = bdkCoreConfig
        .datahoseAgentApiClient(new ApiClientFactory(new BdkConfig()));

    // Assert
    assertTrue(actualDatahoseAgentApiClientResult instanceof ApiClientJersey2);
    assertEquals("https://null:443/agent", actualDatahoseAgentApiClientResult.getBasePath());
    assertTrue(actualDatahoseAgentApiClientResult.getAuthentications().isEmpty());
  }

  /**
   * Test {@link BdkCoreConfig#podApiClient(ApiClientFactory, Optional, BdkConfig)}.
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkCoreConfig#podApiClient(ApiClientFactory, Optional, BdkConfig)}
   */
  @Test
  @DisplayName("Test podApiClient(ApiClientFactory, Optional, BdkConfig); then throw UnsupportedOperationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient BdkCoreConfig.podApiClient(ApiClientFactory, Optional, BdkConfig)"})
  void testPodApiClient_thenThrowUnsupportedOperationException() throws UnsupportedEncodingException {
    // Arrange
    ApiClientFactory apiClientFactory = new ApiClientFactory(new BdkConfig());
    Optional<AuthSession> botSession = Optional.of(new AuthSessionImpl(null));

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
    config.setRetry(new BdkRetryConfig());
    config.setScheme("Scheme");
    config.setSessionAuth(new BdkClientConfig());
    config.setSsl(ssl);

    // Act and Assert
    assertThrows(UnsupportedOperationException.class,
        () -> bdkCoreConfig.podApiClient(apiClientFactory, botSession, config));
  }

  /**
   * Test {@link BdkCoreConfig#relayApiClient(ApiClientFactory)}.
   * <p>
   * Method under test: {@link BdkCoreConfig#relayApiClient(ApiClientFactory)}
   */
  @Test
  @DisplayName("Test relayApiClient(ApiClientFactory)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient BdkCoreConfig.relayApiClient(ApiClientFactory)"})
  void testRelayApiClient() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    BdkAgentConfig bdkAgentConfig = mock(BdkAgentConfig.class);
    when(bdkAgentConfig.getBasePath()).thenReturn("Base Path");
    doNothing().when(bdkAgentConfig).setConnectionPoolMax(Mockito.<Integer>any());
    doNothing().when(bdkAgentConfig).setConnectionPoolPerRoute(Mockito.<Integer>any());
    doNothing().when(bdkAgentConfig).setConnectionTimeout(Mockito.<Integer>any());
    doNothing().when(bdkAgentConfig).setContext(Mockito.<String>any());
    doNothing().when(bdkAgentConfig).setDefaultHeaders(Mockito.<Map<String, String>>any());
    doNothing().when(bdkAgentConfig).setHost(Mockito.<String>any());
    doNothing().when(bdkAgentConfig).setPort(Mockito.<Integer>any());
    doNothing().when(bdkAgentConfig).setProxy(Mockito.<BdkProxyConfig>any());
    doNothing().when(bdkAgentConfig).setReadTimeout(Mockito.<Integer>any());
    doNothing().when(bdkAgentConfig).setScheme(Mockito.<String>any());
    bdkAgentConfig.setConnectionPoolMax(1);
    bdkAgentConfig.setConnectionPoolPerRoute(1);
    bdkAgentConfig.setConnectionTimeout(10);
    bdkAgentConfig.setContext("Context");
    bdkAgentConfig.setDefaultHeaders(defaultHeaders);
    bdkAgentConfig.setHost("localhost");
    bdkAgentConfig.setPort(8080);
    bdkAgentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    bdkAgentConfig.setReadTimeout(10);
    bdkAgentConfig.setScheme("Scheme");

    ArrayList<BdkServerConfig> bdkServerConfigList = new ArrayList<>();
    bdkServerConfigList.add(bdkAgentConfig);
    BdkLoadBalancingConfig bdkLoadBalancingConfig = mock(BdkLoadBalancingConfig.class);
    when(bdkLoadBalancingConfig.getNodes()).thenReturn(bdkServerConfigList);
    when(bdkLoadBalancingConfig.getMode()).thenReturn(BdkLoadBalancingMode.RANDOM);
    doNothing().when(bdkLoadBalancingConfig).setMode(Mockito.<BdkLoadBalancingMode>any());
    doNothing().when(bdkLoadBalancingConfig).setNodes(Mockito.<List<BdkServerConfig>>any());
    doNothing().when(bdkLoadBalancingConfig).setStickiness(anyBoolean());
    bdkLoadBalancingConfig.setMode(BdkLoadBalancingMode.EXTERNAL);
    bdkLoadBalancingConfig.setNodes(new ArrayList<>());
    bdkLoadBalancingConfig.setStickiness(true);
    BdkAgentConfig bdkAgentConfig2 = mock(BdkAgentConfig.class);
    when(bdkAgentConfig2.overridesParentConfig()).thenReturn(false);
    when(bdkAgentConfig2.getLoadBalancing()).thenReturn(bdkLoadBalancingConfig);
    BdkConfig config = mock(BdkConfig.class);
    when(config.getAgent()).thenReturn(bdkAgentConfig2);
    DatafeedLoadBalancedApiClient datafeedLoadBalancedApiClient = new DatafeedLoadBalancedApiClient(config,
        new ApiClientFactory(new BdkConfig()));

    ApiClientFactory apiClientFactory = mock(ApiClientFactory.class);
    when(apiClientFactory.getRelayClient()).thenReturn(datafeedLoadBalancedApiClient);

    // Act
    ApiClient actualRelayApiClientResult = bdkCoreConfig.relayApiClient(apiClientFactory);

    // Assert
    verify(apiClientFactory).getRelayClient();
    verify(bdkAgentConfig2, atLeast(1)).getLoadBalancing();
    verify(bdkAgentConfig2).overridesParentConfig();
    verify(config, atLeast(1)).getAgent();
    verify(bdkLoadBalancingConfig, atLeast(1)).getMode();
    verify(bdkLoadBalancingConfig, atLeast(1)).getNodes();
    verify(bdkLoadBalancingConfig).setMode(eq(BdkLoadBalancingMode.EXTERNAL));
    verify(bdkLoadBalancingConfig).setNodes(isA(List.class));
    verify(bdkLoadBalancingConfig).setStickiness(eq(true));
    verify(bdkAgentConfig).getBasePath();
    verify(bdkAgentConfig).setConnectionPoolMax(eq(1));
    verify(bdkAgentConfig).setConnectionPoolPerRoute(eq(1));
    verify(bdkAgentConfig).setConnectionTimeout(eq(10));
    verify(bdkAgentConfig).setContext(eq("Context"));
    verify(bdkAgentConfig).setDefaultHeaders(isA(Map.class));
    verify(bdkAgentConfig).setHost(eq("localhost"));
    verify(bdkAgentConfig).setPort(eq(8080));
    verify(bdkAgentConfig).setProxy(isA(BdkProxyConfig.class));
    verify(bdkAgentConfig).setReadTimeout(eq(10));
    verify(bdkAgentConfig).setScheme(eq("Scheme"));
    assertSame(datafeedLoadBalancedApiClient, actualRelayApiClientResult);
  }

  /**
   * Test {@link BdkCoreConfig#relayApiClient(ApiClientFactory)}.
   * <ul>
   *   <li>Then return {@link ApiClientJersey2}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkCoreConfig#relayApiClient(ApiClientFactory)}
   */
  @Test
  @DisplayName("Test relayApiClient(ApiClientFactory); then return ApiClientJersey2")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient BdkCoreConfig.relayApiClient(ApiClientFactory)"})
  void testRelayApiClient_thenReturnApiClientJersey2() {
    // Arrange and Act
    ApiClient actualRelayApiClientResult = bdkCoreConfig.relayApiClient(new ApiClientFactory(new BdkConfig()));

    // Assert
    assertTrue(actualRelayApiClientResult instanceof ApiClientJersey2);
    assertEquals("https://null:443/relay", actualRelayApiClientResult.getBasePath());
    assertTrue(actualRelayApiClientResult.getAuthentications().isEmpty());
  }

  /**
   * Test {@link BdkCoreConfig#loginApiClient(ApiClientFactory)}.
   * <p>
   * Method under test: {@link BdkCoreConfig#loginApiClient(ApiClientFactory)}
   */
  @Test
  @DisplayName("Test loginApiClient(ApiClientFactory)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient BdkCoreConfig.loginApiClient(ApiClientFactory)"})
  void testLoginApiClient() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    BdkAgentConfig bdkAgentConfig = mock(BdkAgentConfig.class);
    when(bdkAgentConfig.getBasePath()).thenReturn("Base Path");
    doNothing().when(bdkAgentConfig).setConnectionPoolMax(Mockito.<Integer>any());
    doNothing().when(bdkAgentConfig).setConnectionPoolPerRoute(Mockito.<Integer>any());
    doNothing().when(bdkAgentConfig).setConnectionTimeout(Mockito.<Integer>any());
    doNothing().when(bdkAgentConfig).setContext(Mockito.<String>any());
    doNothing().when(bdkAgentConfig).setDefaultHeaders(Mockito.<Map<String, String>>any());
    doNothing().when(bdkAgentConfig).setHost(Mockito.<String>any());
    doNothing().when(bdkAgentConfig).setPort(Mockito.<Integer>any());
    doNothing().when(bdkAgentConfig).setProxy(Mockito.<BdkProxyConfig>any());
    doNothing().when(bdkAgentConfig).setReadTimeout(Mockito.<Integer>any());
    doNothing().when(bdkAgentConfig).setScheme(Mockito.<String>any());
    bdkAgentConfig.setConnectionPoolMax(1);
    bdkAgentConfig.setConnectionPoolPerRoute(1);
    bdkAgentConfig.setConnectionTimeout(10);
    bdkAgentConfig.setContext("Context");
    bdkAgentConfig.setDefaultHeaders(defaultHeaders);
    bdkAgentConfig.setHost("localhost");
    bdkAgentConfig.setPort(8080);
    bdkAgentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    bdkAgentConfig.setReadTimeout(10);
    bdkAgentConfig.setScheme("Scheme");

    ArrayList<BdkServerConfig> bdkServerConfigList = new ArrayList<>();
    bdkServerConfigList.add(bdkAgentConfig);
    BdkLoadBalancingConfig bdkLoadBalancingConfig = mock(BdkLoadBalancingConfig.class);
    when(bdkLoadBalancingConfig.getNodes()).thenReturn(bdkServerConfigList);
    when(bdkLoadBalancingConfig.getMode()).thenReturn(BdkLoadBalancingMode.RANDOM);
    doNothing().when(bdkLoadBalancingConfig).setMode(Mockito.<BdkLoadBalancingMode>any());
    doNothing().when(bdkLoadBalancingConfig).setNodes(Mockito.<List<BdkServerConfig>>any());
    doNothing().when(bdkLoadBalancingConfig).setStickiness(anyBoolean());
    bdkLoadBalancingConfig.setMode(BdkLoadBalancingMode.EXTERNAL);
    bdkLoadBalancingConfig.setNodes(new ArrayList<>());
    bdkLoadBalancingConfig.setStickiness(true);
    BdkAgentConfig bdkAgentConfig2 = mock(BdkAgentConfig.class);
    when(bdkAgentConfig2.overridesParentConfig()).thenReturn(false);
    when(bdkAgentConfig2.getLoadBalancing()).thenReturn(bdkLoadBalancingConfig);
    BdkConfig config = mock(BdkConfig.class);
    when(config.getAgent()).thenReturn(bdkAgentConfig2);
    DatafeedLoadBalancedApiClient datafeedLoadBalancedApiClient = new DatafeedLoadBalancedApiClient(config,
        new ApiClientFactory(new BdkConfig()));

    ApiClientFactory apiClientFactory = mock(ApiClientFactory.class);
    when(apiClientFactory.getLoginClient()).thenReturn(datafeedLoadBalancedApiClient);

    // Act
    ApiClient actualLoginApiClientResult = bdkCoreConfig.loginApiClient(apiClientFactory);

    // Assert
    verify(apiClientFactory).getLoginClient();
    verify(bdkAgentConfig2, atLeast(1)).getLoadBalancing();
    verify(bdkAgentConfig2).overridesParentConfig();
    verify(config, atLeast(1)).getAgent();
    verify(bdkLoadBalancingConfig, atLeast(1)).getMode();
    verify(bdkLoadBalancingConfig, atLeast(1)).getNodes();
    verify(bdkLoadBalancingConfig).setMode(eq(BdkLoadBalancingMode.EXTERNAL));
    verify(bdkLoadBalancingConfig).setNodes(isA(List.class));
    verify(bdkLoadBalancingConfig).setStickiness(eq(true));
    verify(bdkAgentConfig).getBasePath();
    verify(bdkAgentConfig).setConnectionPoolMax(eq(1));
    verify(bdkAgentConfig).setConnectionPoolPerRoute(eq(1));
    verify(bdkAgentConfig).setConnectionTimeout(eq(10));
    verify(bdkAgentConfig).setContext(eq("Context"));
    verify(bdkAgentConfig).setDefaultHeaders(isA(Map.class));
    verify(bdkAgentConfig).setHost(eq("localhost"));
    verify(bdkAgentConfig).setPort(eq(8080));
    verify(bdkAgentConfig).setProxy(isA(BdkProxyConfig.class));
    verify(bdkAgentConfig).setReadTimeout(eq(10));
    verify(bdkAgentConfig).setScheme(eq("Scheme"));
    assertSame(datafeedLoadBalancedApiClient, actualLoginApiClientResult);
  }

  /**
   * Test {@link BdkCoreConfig#loginApiClient(ApiClientFactory)}.
   * <ul>
   *   <li>Then return {@link ApiClientJersey2}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkCoreConfig#loginApiClient(ApiClientFactory)}
   */
  @Test
  @DisplayName("Test loginApiClient(ApiClientFactory); then return ApiClientJersey2")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient BdkCoreConfig.loginApiClient(ApiClientFactory)"})
  void testLoginApiClient_thenReturnApiClientJersey2() {
    // Arrange and Act
    ApiClient actualLoginApiClientResult = bdkCoreConfig.loginApiClient(new ApiClientFactory(new BdkConfig()));

    // Assert
    assertTrue(actualLoginApiClientResult instanceof ApiClientJersey2);
    assertEquals("https://null:443/login", actualLoginApiClientResult.getBasePath());
    assertTrue(actualLoginApiClientResult.getAuthentications().isEmpty());
  }

  /**
   * Test {@link BdkCoreConfig#keyAuthApiClient(ApiClientFactory)}.
   * <p>
   * Method under test: {@link BdkCoreConfig#keyAuthApiClient(ApiClientFactory)}
   */
  @Test
  @DisplayName("Test keyAuthApiClient(ApiClientFactory)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient BdkCoreConfig.keyAuthApiClient(ApiClientFactory)"})
  void testKeyAuthApiClient() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    BdkAgentConfig bdkAgentConfig = mock(BdkAgentConfig.class);
    when(bdkAgentConfig.getBasePath()).thenReturn("Base Path");
    doNothing().when(bdkAgentConfig).setConnectionPoolMax(Mockito.<Integer>any());
    doNothing().when(bdkAgentConfig).setConnectionPoolPerRoute(Mockito.<Integer>any());
    doNothing().when(bdkAgentConfig).setConnectionTimeout(Mockito.<Integer>any());
    doNothing().when(bdkAgentConfig).setContext(Mockito.<String>any());
    doNothing().when(bdkAgentConfig).setDefaultHeaders(Mockito.<Map<String, String>>any());
    doNothing().when(bdkAgentConfig).setHost(Mockito.<String>any());
    doNothing().when(bdkAgentConfig).setPort(Mockito.<Integer>any());
    doNothing().when(bdkAgentConfig).setProxy(Mockito.<BdkProxyConfig>any());
    doNothing().when(bdkAgentConfig).setReadTimeout(Mockito.<Integer>any());
    doNothing().when(bdkAgentConfig).setScheme(Mockito.<String>any());
    bdkAgentConfig.setConnectionPoolMax(1);
    bdkAgentConfig.setConnectionPoolPerRoute(1);
    bdkAgentConfig.setConnectionTimeout(10);
    bdkAgentConfig.setContext("Context");
    bdkAgentConfig.setDefaultHeaders(defaultHeaders);
    bdkAgentConfig.setHost("localhost");
    bdkAgentConfig.setPort(8080);
    bdkAgentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    bdkAgentConfig.setReadTimeout(10);
    bdkAgentConfig.setScheme("Scheme");

    ArrayList<BdkServerConfig> bdkServerConfigList = new ArrayList<>();
    bdkServerConfigList.add(bdkAgentConfig);
    BdkLoadBalancingConfig bdkLoadBalancingConfig = mock(BdkLoadBalancingConfig.class);
    when(bdkLoadBalancingConfig.getNodes()).thenReturn(bdkServerConfigList);
    when(bdkLoadBalancingConfig.getMode()).thenReturn(BdkLoadBalancingMode.RANDOM);
    doNothing().when(bdkLoadBalancingConfig).setMode(Mockito.<BdkLoadBalancingMode>any());
    doNothing().when(bdkLoadBalancingConfig).setNodes(Mockito.<List<BdkServerConfig>>any());
    doNothing().when(bdkLoadBalancingConfig).setStickiness(anyBoolean());
    bdkLoadBalancingConfig.setMode(BdkLoadBalancingMode.EXTERNAL);
    bdkLoadBalancingConfig.setNodes(new ArrayList<>());
    bdkLoadBalancingConfig.setStickiness(true);
    BdkAgentConfig bdkAgentConfig2 = mock(BdkAgentConfig.class);
    when(bdkAgentConfig2.overridesParentConfig()).thenReturn(false);
    when(bdkAgentConfig2.getLoadBalancing()).thenReturn(bdkLoadBalancingConfig);
    BdkConfig config = mock(BdkConfig.class);
    when(config.getAgent()).thenReturn(bdkAgentConfig2);
    DatafeedLoadBalancedApiClient datafeedLoadBalancedApiClient = new DatafeedLoadBalancedApiClient(config,
        new ApiClientFactory(new BdkConfig()));

    ApiClientFactory apiClientFactory = mock(ApiClientFactory.class);
    when(apiClientFactory.getKeyAuthClient()).thenReturn(datafeedLoadBalancedApiClient);

    // Act
    ApiClient actualKeyAuthApiClientResult = bdkCoreConfig.keyAuthApiClient(apiClientFactory);

    // Assert
    verify(apiClientFactory).getKeyAuthClient();
    verify(bdkAgentConfig2, atLeast(1)).getLoadBalancing();
    verify(bdkAgentConfig2).overridesParentConfig();
    verify(config, atLeast(1)).getAgent();
    verify(bdkLoadBalancingConfig, atLeast(1)).getMode();
    verify(bdkLoadBalancingConfig, atLeast(1)).getNodes();
    verify(bdkLoadBalancingConfig).setMode(eq(BdkLoadBalancingMode.EXTERNAL));
    verify(bdkLoadBalancingConfig).setNodes(isA(List.class));
    verify(bdkLoadBalancingConfig).setStickiness(eq(true));
    verify(bdkAgentConfig).getBasePath();
    verify(bdkAgentConfig).setConnectionPoolMax(eq(1));
    verify(bdkAgentConfig).setConnectionPoolPerRoute(eq(1));
    verify(bdkAgentConfig).setConnectionTimeout(eq(10));
    verify(bdkAgentConfig).setContext(eq("Context"));
    verify(bdkAgentConfig).setDefaultHeaders(isA(Map.class));
    verify(bdkAgentConfig).setHost(eq("localhost"));
    verify(bdkAgentConfig).setPort(eq(8080));
    verify(bdkAgentConfig).setProxy(isA(BdkProxyConfig.class));
    verify(bdkAgentConfig).setReadTimeout(eq(10));
    verify(bdkAgentConfig).setScheme(eq("Scheme"));
    assertSame(datafeedLoadBalancedApiClient, actualKeyAuthApiClientResult);
  }

  /**
   * Test {@link BdkCoreConfig#sessionAuthApiClient(ApiClientFactory)}.
   * <p>
   * Method under test: {@link BdkCoreConfig#sessionAuthApiClient(ApiClientFactory)}
   */
  @Test
  @DisplayName("Test sessionAuthApiClient(ApiClientFactory)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient BdkCoreConfig.sessionAuthApiClient(ApiClientFactory)"})
  void testSessionAuthApiClient() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    BdkAgentConfig bdkAgentConfig = mock(BdkAgentConfig.class);
    when(bdkAgentConfig.getBasePath()).thenReturn("Base Path");
    doNothing().when(bdkAgentConfig).setConnectionPoolMax(Mockito.<Integer>any());
    doNothing().when(bdkAgentConfig).setConnectionPoolPerRoute(Mockito.<Integer>any());
    doNothing().when(bdkAgentConfig).setConnectionTimeout(Mockito.<Integer>any());
    doNothing().when(bdkAgentConfig).setContext(Mockito.<String>any());
    doNothing().when(bdkAgentConfig).setDefaultHeaders(Mockito.<Map<String, String>>any());
    doNothing().when(bdkAgentConfig).setHost(Mockito.<String>any());
    doNothing().when(bdkAgentConfig).setPort(Mockito.<Integer>any());
    doNothing().when(bdkAgentConfig).setProxy(Mockito.<BdkProxyConfig>any());
    doNothing().when(bdkAgentConfig).setReadTimeout(Mockito.<Integer>any());
    doNothing().when(bdkAgentConfig).setScheme(Mockito.<String>any());
    bdkAgentConfig.setConnectionPoolMax(1);
    bdkAgentConfig.setConnectionPoolPerRoute(1);
    bdkAgentConfig.setConnectionTimeout(10);
    bdkAgentConfig.setContext("Context");
    bdkAgentConfig.setDefaultHeaders(defaultHeaders);
    bdkAgentConfig.setHost("localhost");
    bdkAgentConfig.setPort(8080);
    bdkAgentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    bdkAgentConfig.setReadTimeout(10);
    bdkAgentConfig.setScheme("Scheme");

    ArrayList<BdkServerConfig> bdkServerConfigList = new ArrayList<>();
    bdkServerConfigList.add(bdkAgentConfig);
    BdkLoadBalancingConfig bdkLoadBalancingConfig = mock(BdkLoadBalancingConfig.class);
    when(bdkLoadBalancingConfig.getNodes()).thenReturn(bdkServerConfigList);
    when(bdkLoadBalancingConfig.getMode()).thenReturn(BdkLoadBalancingMode.RANDOM);
    doNothing().when(bdkLoadBalancingConfig).setMode(Mockito.<BdkLoadBalancingMode>any());
    doNothing().when(bdkLoadBalancingConfig).setNodes(Mockito.<List<BdkServerConfig>>any());
    doNothing().when(bdkLoadBalancingConfig).setStickiness(anyBoolean());
    bdkLoadBalancingConfig.setMode(BdkLoadBalancingMode.EXTERNAL);
    bdkLoadBalancingConfig.setNodes(new ArrayList<>());
    bdkLoadBalancingConfig.setStickiness(true);
    BdkAgentConfig bdkAgentConfig2 = mock(BdkAgentConfig.class);
    when(bdkAgentConfig2.overridesParentConfig()).thenReturn(false);
    when(bdkAgentConfig2.getLoadBalancing()).thenReturn(bdkLoadBalancingConfig);
    BdkConfig config = mock(BdkConfig.class);
    when(config.getAgent()).thenReturn(bdkAgentConfig2);
    DatafeedLoadBalancedApiClient datafeedLoadBalancedApiClient = new DatafeedLoadBalancedApiClient(config,
        new ApiClientFactory(new BdkConfig()));

    ApiClientFactory apiClientFactory = mock(ApiClientFactory.class);
    when(apiClientFactory.getSessionAuthClient()).thenReturn(datafeedLoadBalancedApiClient);

    // Act
    ApiClient actualSessionAuthApiClientResult = bdkCoreConfig.sessionAuthApiClient(apiClientFactory);

    // Assert
    verify(apiClientFactory).getSessionAuthClient();
    verify(bdkAgentConfig2, atLeast(1)).getLoadBalancing();
    verify(bdkAgentConfig2).overridesParentConfig();
    verify(config, atLeast(1)).getAgent();
    verify(bdkLoadBalancingConfig, atLeast(1)).getMode();
    verify(bdkLoadBalancingConfig, atLeast(1)).getNodes();
    verify(bdkLoadBalancingConfig).setMode(eq(BdkLoadBalancingMode.EXTERNAL));
    verify(bdkLoadBalancingConfig).setNodes(isA(List.class));
    verify(bdkLoadBalancingConfig).setStickiness(eq(true));
    verify(bdkAgentConfig).getBasePath();
    verify(bdkAgentConfig).setConnectionPoolMax(eq(1));
    verify(bdkAgentConfig).setConnectionPoolPerRoute(eq(1));
    verify(bdkAgentConfig).setConnectionTimeout(eq(10));
    verify(bdkAgentConfig).setContext(eq("Context"));
    verify(bdkAgentConfig).setDefaultHeaders(isA(Map.class));
    verify(bdkAgentConfig).setHost(eq("localhost"));
    verify(bdkAgentConfig).setPort(eq(8080));
    verify(bdkAgentConfig).setProxy(isA(BdkProxyConfig.class));
    verify(bdkAgentConfig).setReadTimeout(eq(10));
    verify(bdkAgentConfig).setScheme(eq("Scheme"));
    assertSame(datafeedLoadBalancedApiClient, actualSessionAuthApiClientResult);
  }

  /**
   * Test {@link BdkCoreConfig#extensionAppTokensRepository()}.
   * <p>
   * Method under test: {@link BdkCoreConfig#extensionAppTokensRepository()}
   */
  @Test
  @DisplayName("Test extensionAppTokensRepository()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ExtensionAppTokensRepository BdkCoreConfig.extensionAppTokensRepository()"})
  void testExtensionAppTokensRepository() {
    // Arrange and Act
    ExtensionAppTokensRepository actualExtensionAppTokensRepositoryResult = (new BdkCoreConfig())
        .extensionAppTokensRepository();

    // Assert
    assertTrue(actualExtensionAppTokensRepositoryResult instanceof InMemoryTokensRepository);
    assertFalse(actualExtensionAppTokensRepositoryResult.get("ABC123").isPresent());
  }

  /**
   * Test {@link BdkCoreConfig#templateEngine()}.
   * <p>
   * Method under test: {@link BdkCoreConfig#templateEngine()}
   */
  @Test
  @DisplayName("Test templateEngine()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TemplateEngine BdkCoreConfig.templateEngine()"})
  void testTemplateEngine() {
    // Arrange and Act
    TemplateEngine actualTemplateEngineResult = (new BdkCoreConfig()).templateEngine();

    // Assert
    assertTrue(actualTemplateEngineResult instanceof FreeMarkerEngine);
    assertTrue(actualTemplateEngineResult.newTemplateFromString("Template") instanceof FreeMarkerTemplate);
  }

  /**
   * Test {@link BdkCoreConfig#botSession(AuthenticatorFactory)}.
   * <ul>
   *   <li>Then throw {@link BeanInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkCoreConfig#botSession(AuthenticatorFactory)}
   */
  @Test
  @DisplayName("Test botSession(AuthenticatorFactory); then throw BeanInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"AuthSession BdkCoreConfig.botSession(AuthenticatorFactory)"})
  void testBotSession_thenThrowBeanInitializationException() {
    // Arrange
    BdkCoreConfig bdkCoreConfig = new BdkCoreConfig();
    BdkConfig bdkConfig = new BdkConfig();

    // Act and Assert
    assertThrows(BeanInitializationException.class,
        () -> bdkCoreConfig.botSession(new AuthenticatorFactory(bdkConfig, new ApiClientFactory(new BdkConfig()))));
  }
}
