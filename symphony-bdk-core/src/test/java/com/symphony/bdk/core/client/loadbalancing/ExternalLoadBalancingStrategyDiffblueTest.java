package com.symphony.bdk.core.client.loadbalancing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.config.model.BdkRetryConfig;
import com.symphony.bdk.core.test.BdkRetryConfigTestHelper;
import com.symphony.bdk.gen.api.SignalsApi;
import com.symphony.bdk.gen.api.model.AgentInfo;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import jakarta.ws.rs.client.Client;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ExternalLoadBalancingStrategyDiffblueTest {
  /**
   * Test {@link ExternalLoadBalancingStrategy#ExternalLoadBalancingStrategy(BdkRetryConfig,
   * SignalsApi)}.
   *
   * <ul>
   *   <li>Then return NewBasePath is {@code https://}.
   * </ul>
   *
   * <p>Method under test: {@link
   * ExternalLoadBalancingStrategy#ExternalLoadBalancingStrategy(BdkRetryConfig, SignalsApi)}
   */
  @Test
  @DisplayName(
      "Test new ExternalLoadBalancingStrategy(BdkRetryConfig, SignalsApi); then return NewBasePath is 'https://'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ExternalLoadBalancingStrategy.<init>(BdkRetryConfig, SignalsApi)"})
  void testNewExternalLoadBalancingStrategy_thenReturnNewBasePathIsHttps() throws ApiException {
    // Arrange
    BdkRetryConfig retryConfig = BdkRetryConfigTestHelper.ofMinimalInterval(3);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    AgentInfo agentInfo = mock(AgentInfo.class);
    when(agentInfo.getServerFqdn()).thenReturn("/");

    SignalsApi signalsApi = mock(SignalsApi.class);
    when(signalsApi.v1InfoGet()).thenReturn(agentInfo);
    when(signalsApi.getApiClient()).thenReturn(apiClientJersey2);

    // Act
    ExternalLoadBalancingStrategy actualExternalLoadBalancingStrategy =
        new ExternalLoadBalancingStrategy(retryConfig, signalsApi);
    String actualNewBasePath = actualExternalLoadBalancingStrategy.getNewBasePath();

    // Assert
    verify(signalsApi).getApiClient();
    verify(signalsApi).v1InfoGet();
    verify(agentInfo).getServerFqdn();
    assertEquals("https://", actualNewBasePath);
  }

  /**
   * Test {@link ExternalLoadBalancingStrategy#ExternalLoadBalancingStrategy(BdkRetryConfig,
   * SignalsApi)}.
   *
   * <ul>
   *   <li>Then return NewBasePath is {@code https://Server Fqdn}.
   * </ul>
   *
   * <p>Method under test: {@link
   * ExternalLoadBalancingStrategy#ExternalLoadBalancingStrategy(BdkRetryConfig, SignalsApi)}
   */
  @Test
  @DisplayName(
      "Test new ExternalLoadBalancingStrategy(BdkRetryConfig, SignalsApi); then return NewBasePath is 'https://Server Fqdn'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ExternalLoadBalancingStrategy.<init>(BdkRetryConfig, SignalsApi)"})
  void testNewExternalLoadBalancingStrategy_thenReturnNewBasePathIsHttpsServerFqdn()
      throws ApiException {
    // Arrange
    BdkRetryConfig retryConfig = BdkRetryConfigTestHelper.ofMinimalInterval(3);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    AgentInfo agentInfo = mock(AgentInfo.class);
    when(agentInfo.getServerFqdn()).thenReturn("Server Fqdn");

    SignalsApi signalsApi = mock(SignalsApi.class);
    when(signalsApi.v1InfoGet()).thenReturn(agentInfo);
    when(signalsApi.getApiClient()).thenReturn(apiClientJersey2);

    // Act
    ExternalLoadBalancingStrategy actualExternalLoadBalancingStrategy =
        new ExternalLoadBalancingStrategy(retryConfig, signalsApi);
    String actualNewBasePath = actualExternalLoadBalancingStrategy.getNewBasePath();

    // Assert
    verify(signalsApi).getApiClient();
    verify(signalsApi).v1InfoGet();
    verify(agentInfo).getServerFqdn();
    assertEquals("https://Server Fqdn", actualNewBasePath);
  }
}
