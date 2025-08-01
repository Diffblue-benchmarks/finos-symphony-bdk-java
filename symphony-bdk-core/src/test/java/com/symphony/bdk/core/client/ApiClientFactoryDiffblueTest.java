package com.symphony.bdk.core.client;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.client.ApiClientFactory.ServiceEnum;
import com.symphony.bdk.core.client.exception.ApiClientInitializationException;
import com.symphony.bdk.core.config.model.BdkAgentConfig;
import com.symphony.bdk.core.config.model.BdkConfig;
import com.symphony.bdk.core.config.model.BdkProxyConfig;
import com.symphony.bdk.http.api.ApiClientBuilder;
import com.symphony.bdk.http.api.ApiClientBuilderProvider;
import com.symphony.bdk.http.jersey2.ApiClientBuilderJersey2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ApiClientFactoryDiffblueTest {
  /**
   * Test {@link ApiClientFactory#getAgentClient()}.
   *
   * <ul>
   *   <li>Then throw {@link ApiClientInitializationException}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientFactory#getAgentClient()}
   */
  @Test
  @DisplayName("Test getAgentClient(); then throw ApiClientInitializationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.symphony.bdk.http.api.ApiClient ApiClientFactory.getAgentClient()"})
  void testGetAgentClient_thenThrowApiClientInitializationException() {
    // Arrange
    BdkConfig config = mock(BdkConfig.class);
    when(config.getAgent()).thenThrow(new ApiClientInitializationException("An error occurred"));

    // Act and Assert
    assertThrows(
        ApiClientInitializationException.class,
        () -> new ApiClientFactory(config).getAgentClient());
    verify(config).getAgent();
  }

  /**
   * Test {@link ApiClientFactory#getDatafeedAgentClient()}.
   *
   * <ul>
   *   <li>Then throw {@link ApiClientInitializationException}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientFactory#getDatafeedAgentClient()}
   */
  @Test
  @DisplayName("Test getDatafeedAgentClient(); then throw ApiClientInitializationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiClient ApiClientFactory.getDatafeedAgentClient()"
  })
  void testGetDatafeedAgentClient_thenThrowApiClientInitializationException() {
    // Arrange
    BdkConfig config = mock(BdkConfig.class);
    when(config.getAgent()).thenThrow(new ApiClientInitializationException("An error occurred"));

    // Act and Assert
    assertThrows(
        ApiClientInitializationException.class,
        () -> new ApiClientFactory(config).getDatafeedAgentClient());
    verify(config).getAgent();
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
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiClient ApiClientFactory.buildAgentClient(String, BdkAgentConfig)"
  })
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
   * Test {@link ApiClientFactory#getServiceNameFromBasePath(String)}.
   *
   * <ul>
   *   <li>When {@code /agent}.
   *   <li>Then return {@code AGENT}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientFactory#getServiceNameFromBasePath(String)}
   */
  @Test
  @DisplayName("Test getServiceNameFromBasePath(String); when '/agent'; then return 'AGENT'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ServiceEnum ApiClientFactory.getServiceNameFromBasePath(String)"})
  void testGetServiceNameFromBasePath_whenAgent_thenReturnAgent() {
    // Arrange, Act and Assert
    assertEquals(ServiceEnum.AGENT, ApiClientFactory.getServiceNameFromBasePath("/agent"));
  }

  /**
   * Test {@link ApiClientFactory#getServiceNameFromBasePath(String)}.
   *
   * <ul>
   *   <li>When {@code Base Path}.
   *   <li>Then return {@code POD}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientFactory#getServiceNameFromBasePath(String)}
   */
  @Test
  @DisplayName("Test getServiceNameFromBasePath(String); when 'Base Path'; then return 'POD'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ServiceEnum ApiClientFactory.getServiceNameFromBasePath(String)"})
  void testGetServiceNameFromBasePath_whenBasePath_thenReturnPod() {
    // Arrange, Act and Assert
    assertEquals(ServiceEnum.POD, ApiClientFactory.getServiceNameFromBasePath("Base Path"));
  }

  /**
   * Test {@link ApiClientFactory#getServiceNameFromBasePath(String)}.
   *
   * <ul>
   *   <li>When {@code /keyauth}.
   *   <li>Then return {@code KEY_MANAGER}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientFactory#getServiceNameFromBasePath(String)}
   */
  @Test
  @DisplayName(
      "Test getServiceNameFromBasePath(String); when '/keyauth'; then return 'KEY_MANAGER'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ServiceEnum ApiClientFactory.getServiceNameFromBasePath(String)"})
  void testGetServiceNameFromBasePath_whenKeyauth_thenReturnKeyManager() {
    // Arrange, Act and Assert
    assertEquals(ServiceEnum.KEY_MANAGER, ApiClientFactory.getServiceNameFromBasePath("/keyauth"));
  }

  /**
   * Test {@link ApiClientFactory#getServiceNameFromBasePath(String)}.
   *
   * <ul>
   *   <li>When {@code /relay}.
   *   <li>Then return {@code KEY_MANAGER}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientFactory#getServiceNameFromBasePath(String)}
   */
  @Test
  @DisplayName("Test getServiceNameFromBasePath(String); when '/relay'; then return 'KEY_MANAGER'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ServiceEnum ApiClientFactory.getServiceNameFromBasePath(String)"})
  void testGetServiceNameFromBasePath_whenRelay_thenReturnKeyManager() {
    // Arrange, Act and Assert
    assertEquals(ServiceEnum.KEY_MANAGER, ApiClientFactory.getServiceNameFromBasePath("/relay"));
  }

  /**
   * Test {@link ApiClientFactory#getServiceNameFromBasePath(String)}.
   *
   * <ul>
   *   <li>When {@code /sessionauth}.
   *   <li>Then return {@code SESSION_AUTH}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientFactory#getServiceNameFromBasePath(String)}
   */
  @Test
  @DisplayName(
      "Test getServiceNameFromBasePath(String); when '/sessionauth'; then return 'SESSION_AUTH'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ServiceEnum ApiClientFactory.getServiceNameFromBasePath(String)"})
  void testGetServiceNameFromBasePath_whenSessionauth_thenReturnSessionAuth() {
    // Arrange, Act and Assert
    assertEquals(
        ServiceEnum.SESSION_AUTH, ApiClientFactory.getServiceNameFromBasePath("/sessionauth"));
  }
}
