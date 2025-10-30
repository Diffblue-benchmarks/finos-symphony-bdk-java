package com.symphony.bdk.core.client.loadbalancing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.atLeast;
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
import com.symphony.bdk.core.config.model.BdkServerConfig;
import com.symphony.bdk.http.api.ApiClient;
import com.symphony.bdk.http.api.auth.Authentication;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import jakarta.ws.rs.client.Client;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class RegularLoadBalancedApiClientDiffblueTest {
  /**
   * Test {@link RegularLoadBalancedApiClient#RegularLoadBalancedApiClient(BdkConfig, ApiClientFactory)}.
   * <p>
   * Method under test: {@link RegularLoadBalancedApiClient#RegularLoadBalancedApiClient(BdkConfig, ApiClientFactory)}
   */
  @Test
  @DisplayName("Test new RegularLoadBalancedApiClient(BdkConfig, ApiClientFactory)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void RegularLoadBalancedApiClient.<init>(BdkConfig, ApiClientFactory)"})
  void testNewRegularLoadBalancedApiClient() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkServerConfig bdkServerConfig = new BdkServerConfig();
    bdkServerConfig.setConnectionPoolMax(1);
    bdkServerConfig.setConnectionPoolPerRoute(1);
    bdkServerConfig.setConnectionTimeout(10);
    bdkServerConfig.setContext("Field \"nodes\" in loadBalancing is mandatory and must contain at least one element");
    bdkServerConfig.setDefaultHeaders(defaultHeaders);
    bdkServerConfig.setHost("localhost");
    bdkServerConfig.setPort(8080);
    bdkServerConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    bdkServerConfig.setReadTimeout(10);
    bdkServerConfig.setScheme("Field \"nodes\" in loadBalancing is mandatory and must contain at least one element");

    ArrayList<BdkServerConfig> nodes = new ArrayList<>();
    nodes.add(bdkServerConfig);

    BdkLoadBalancingConfig loadBalancing = new BdkLoadBalancingConfig();
    loadBalancing.setMode(BdkLoadBalancingMode.ROUND_ROBIN);
    loadBalancing.setNodes(nodes);
    loadBalancing.setStickiness(true);

    BdkAgentConfig bdkAgentConfig = new BdkAgentConfig();
    bdkAgentConfig.setLoadBalancing(loadBalancing);
    BdkConfig config = mock(BdkConfig.class);
    when(config.getAgent()).thenReturn(bdkAgentConfig);

    HashMap<String, String> defaultHeaders2 = new HashMap<>();
    defaultHeaders2.put("Delivered-To", "alice.liddell@example.org");
    ApiClientFactory apiClientFactory = mock(ApiClientFactory.class);
    when(apiClientFactory.getRegularAgentClient(Mockito.<String>any())).thenReturn(new ApiClientJersey2(
        mock(Client.class), "https://example.org/example", defaultHeaders2, "https://example.org/example"));

    // Act
    RegularLoadBalancedApiClient actualRegularLoadBalancedApiClient = new RegularLoadBalancedApiClient(config,
        apiClientFactory);

    // Assert
    verify(apiClientFactory).getRegularAgentClient(eq(
        "Field \"nodes\" in loadBalancing is mandatory and must contain at least one element://localhost:8080/Field \"nodes\" in loadBalancing is mandatory and must contain at least one element"));
    verify(config, atLeast(1)).getAgent();
    ApiClient apiClient = actualRegularLoadBalancedApiClient.apiClient;
    assertTrue(apiClient instanceof ApiClientJersey2);
    assertEquals("https://example.org/example", actualRegularLoadBalancedApiClient.getBasePath());
    assertEquals("https://example.org/example", apiClient.getBasePath());
    BdkLoadBalancingConfig bdkLoadBalancingConfig = actualRegularLoadBalancedApiClient.loadBalancingConfig;
    List<BdkServerConfig> nodes2 = bdkLoadBalancingConfig.getNodes();
    assertEquals(1, nodes2.size());
    assertEquals(BdkLoadBalancingMode.ROUND_ROBIN, bdkLoadBalancingConfig.getMode());
    assertTrue(bdkLoadBalancingConfig.isStickiness());
    Map<String, Authentication> authentications = actualRegularLoadBalancedApiClient.getAuthentications();
    assertTrue(authentications.isEmpty());
    assertSame(bdkServerConfig, nodes2.get(0));
    assertSame(nodes, nodes2);
    assertSame(authentications, apiClient.getAuthentications());
  }

  /**
   * Test {@link RegularLoadBalancedApiClient#RegularLoadBalancedApiClient(BdkConfig, ApiClientFactory)}.
   * <ul>
   *   <li>Then return {@link LoadBalancedApiClient#loadBalancingConfig} Mode is {@code RANDOM}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RegularLoadBalancedApiClient#RegularLoadBalancedApiClient(BdkConfig, ApiClientFactory)}
   */
  @Test
  @DisplayName("Test new RegularLoadBalancedApiClient(BdkConfig, ApiClientFactory); then return loadBalancingConfig Mode is 'RANDOM'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void RegularLoadBalancedApiClient.<init>(BdkConfig, ApiClientFactory)"})
  void testNewRegularLoadBalancedApiClient_thenReturnLoadBalancingConfigModeIsRandom() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkServerConfig bdkServerConfig = new BdkServerConfig();
    bdkServerConfig.setConnectionPoolMax(1);
    bdkServerConfig.setConnectionPoolPerRoute(1);
    bdkServerConfig.setConnectionTimeout(10);
    bdkServerConfig.setContext("Field \"nodes\" in loadBalancing is mandatory and must contain at least one element");
    bdkServerConfig.setDefaultHeaders(defaultHeaders);
    bdkServerConfig.setHost("localhost");
    bdkServerConfig.setPort(8080);
    bdkServerConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    bdkServerConfig.setReadTimeout(10);
    bdkServerConfig.setScheme("Field \"nodes\" in loadBalancing is mandatory and must contain at least one element");

    ArrayList<BdkServerConfig> nodes = new ArrayList<>();
    nodes.add(bdkServerConfig);

    BdkLoadBalancingConfig loadBalancing = new BdkLoadBalancingConfig();
    loadBalancing.setMode(BdkLoadBalancingMode.RANDOM);
    loadBalancing.setNodes(nodes);
    loadBalancing.setStickiness(true);

    BdkAgentConfig bdkAgentConfig = new BdkAgentConfig();
    bdkAgentConfig.setLoadBalancing(loadBalancing);
    BdkConfig config = mock(BdkConfig.class);
    when(config.getAgent()).thenReturn(bdkAgentConfig);

    HashMap<String, String> defaultHeaders2 = new HashMap<>();
    defaultHeaders2.put("Delivered-To", "alice.liddell@example.org");
    ApiClientFactory apiClientFactory = mock(ApiClientFactory.class);
    when(apiClientFactory.getRegularAgentClient(Mockito.<String>any())).thenReturn(new ApiClientJersey2(
        mock(Client.class), "https://example.org/example", defaultHeaders2, "https://example.org/example"));

    // Act
    RegularLoadBalancedApiClient actualRegularLoadBalancedApiClient = new RegularLoadBalancedApiClient(config,
        apiClientFactory);

    // Assert
    verify(apiClientFactory).getRegularAgentClient(eq(
        "Field \"nodes\" in loadBalancing is mandatory and must contain at least one element://localhost:8080/Field \"nodes\" in loadBalancing is mandatory and must contain at least one element"));
    verify(config, atLeast(1)).getAgent();
    ApiClient apiClient = actualRegularLoadBalancedApiClient.apiClient;
    assertTrue(apiClient instanceof ApiClientJersey2);
    assertEquals("https://example.org/example", actualRegularLoadBalancedApiClient.getBasePath());
    assertEquals("https://example.org/example", apiClient.getBasePath());
    BdkLoadBalancingConfig bdkLoadBalancingConfig = actualRegularLoadBalancedApiClient.loadBalancingConfig;
    List<BdkServerConfig> nodes2 = bdkLoadBalancingConfig.getNodes();
    assertEquals(1, nodes2.size());
    assertEquals(BdkLoadBalancingMode.RANDOM, bdkLoadBalancingConfig.getMode());
    assertTrue(bdkLoadBalancingConfig.isStickiness());
    Map<String, Authentication> authentications = actualRegularLoadBalancedApiClient.getAuthentications();
    assertTrue(authentications.isEmpty());
    assertSame(bdkServerConfig, nodes2.get(0));
    assertSame(nodes, nodes2);
    assertSame(authentications, apiClient.getAuthentications());
  }
}
