package com.symphony.bdk.core.client.loadbalancing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyBoolean;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.client.ApiClientFactory;
import com.symphony.bdk.core.config.model.BdkAgentConfig;
import com.symphony.bdk.core.config.model.BdkConfig;
import com.symphony.bdk.core.config.model.BdkLoadBalancingConfig;
import com.symphony.bdk.core.config.model.BdkLoadBalancingMode;
import com.symphony.bdk.core.config.model.BdkProxyConfig;
import com.symphony.bdk.core.config.model.BdkRetryConfig;
import com.symphony.bdk.core.config.model.BdkServerConfig;
import com.symphony.bdk.gen.api.SignalsApi;
import com.symphony.bdk.gen.api.model.AgentInfo;
import com.symphony.bdk.http.api.ApiException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ExternalLoadBalancingStrategyDiffblueTest {
  /**
   * Test {@link ExternalLoadBalancingStrategy#ExternalLoadBalancingStrategy(BdkRetryConfig, SignalsApi)}.
   * <ul>
   *   <li>Then return NewBasePath is {@code https://}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ExternalLoadBalancingStrategy#ExternalLoadBalancingStrategy(BdkRetryConfig, SignalsApi)}
   */
  @Test
  @DisplayName("Test new ExternalLoadBalancingStrategy(BdkRetryConfig, SignalsApi); then return NewBasePath is 'https://'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ExternalLoadBalancingStrategy.<init>(BdkRetryConfig, SignalsApi)"})
  void testNewExternalLoadBalancingStrategy_thenReturnNewBasePathIsHttps() throws ApiException {
    // Arrange
    BdkRetryConfig retryConfig = new BdkRetryConfig();

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

    AgentInfo agentInfo = mock(AgentInfo.class);
    when(agentInfo.getServerFqdn()).thenReturn("/");
    SignalsApi signalsApi = mock(SignalsApi.class);
    when(signalsApi.v1InfoGet()).thenReturn(agentInfo);
    when(signalsApi.getApiClient()).thenReturn(datafeedLoadBalancedApiClient);

    // Act
    String actualNewBasePath = (new ExternalLoadBalancingStrategy(retryConfig, signalsApi)).getNewBasePath();

    // Assert
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
    verify(signalsApi).getApiClient();
    verify(signalsApi).v1InfoGet();
    verify(agentInfo).getServerFqdn();
    assertEquals("https://", actualNewBasePath);
  }

  /**
   * Test {@link ExternalLoadBalancingStrategy#ExternalLoadBalancingStrategy(BdkRetryConfig, SignalsApi)}.
   * <ul>
   *   <li>Then return NewBasePath is {@code https://Server Fqdn}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ExternalLoadBalancingStrategy#ExternalLoadBalancingStrategy(BdkRetryConfig, SignalsApi)}
   */
  @Test
  @DisplayName("Test new ExternalLoadBalancingStrategy(BdkRetryConfig, SignalsApi); then return NewBasePath is 'https://Server Fqdn'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ExternalLoadBalancingStrategy.<init>(BdkRetryConfig, SignalsApi)"})
  void testNewExternalLoadBalancingStrategy_thenReturnNewBasePathIsHttpsServerFqdn() throws ApiException {
    // Arrange
    BdkRetryConfig retryConfig = new BdkRetryConfig();

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

    AgentInfo agentInfo = mock(AgentInfo.class);
    when(agentInfo.getServerFqdn()).thenReturn("Server Fqdn");
    SignalsApi signalsApi = mock(SignalsApi.class);
    when(signalsApi.v1InfoGet()).thenReturn(agentInfo);
    when(signalsApi.getApiClient()).thenReturn(datafeedLoadBalancedApiClient);

    // Act
    String actualNewBasePath = (new ExternalLoadBalancingStrategy(retryConfig, signalsApi)).getNewBasePath();

    // Assert
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
    verify(signalsApi).getApiClient();
    verify(signalsApi).v1InfoGet();
    verify(agentInfo).getServerFqdn();
    assertEquals("https://Server Fqdn", actualNewBasePath);
  }

  /**
   * Test {@link ExternalLoadBalancingStrategy#getNewBasePath()}.
   * <ul>
   *   <li>Given {@link AgentInfo} {@link AgentInfo#getServerFqdn()} return {@code /}.</li>
   *   <li>Then return {@code https://}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ExternalLoadBalancingStrategy#getNewBasePath()}
   */
  @Test
  @DisplayName("Test getNewBasePath(); given AgentInfo getServerFqdn() return '/'; then return 'https://'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ExternalLoadBalancingStrategy.getNewBasePath()"})
  void testGetNewBasePath_givenAgentInfoGetServerFqdnReturnSlash_thenReturnHttps() throws ApiException {
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

    AgentInfo agentInfo = mock(AgentInfo.class);
    when(agentInfo.getServerFqdn()).thenReturn("/");
    SignalsApi signalsApi = mock(SignalsApi.class);
    when(signalsApi.v1InfoGet()).thenReturn(agentInfo);
    when(signalsApi.getApiClient()).thenReturn(datafeedLoadBalancedApiClient);

    // Act
    String actualNewBasePath = (new ExternalLoadBalancingStrategy(new BdkRetryConfig(), signalsApi)).getNewBasePath();

    // Assert
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
    verify(signalsApi).getApiClient();
    verify(signalsApi).v1InfoGet();
    verify(agentInfo).getServerFqdn();
    assertEquals("https://", actualNewBasePath);
  }

  /**
   * Test {@link ExternalLoadBalancingStrategy#getNewBasePath()}.
   * <ul>
   *   <li>Then return {@code https://Server Fqdn}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ExternalLoadBalancingStrategy#getNewBasePath()}
   */
  @Test
  @DisplayName("Test getNewBasePath(); then return 'https://Server Fqdn'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ExternalLoadBalancingStrategy.getNewBasePath()"})
  void testGetNewBasePath_thenReturnHttpsServerFqdn() throws ApiException {
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

    AgentInfo agentInfo = mock(AgentInfo.class);
    when(agentInfo.getServerFqdn()).thenReturn("Server Fqdn");
    SignalsApi signalsApi = mock(SignalsApi.class);
    when(signalsApi.v1InfoGet()).thenReturn(agentInfo);
    when(signalsApi.getApiClient()).thenReturn(datafeedLoadBalancedApiClient);

    // Act
    String actualNewBasePath = (new ExternalLoadBalancingStrategy(new BdkRetryConfig(), signalsApi)).getNewBasePath();

    // Assert
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
    verify(signalsApi).getApiClient();
    verify(signalsApi).v1InfoGet();
    verify(agentInfo).getServerFqdn();
    assertEquals("https://Server Fqdn", actualNewBasePath);
  }
}
