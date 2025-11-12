package com.symphony.bdk.core.client;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.client.exception.ApiClientInitializationException;
import com.symphony.bdk.core.config.model.BdkConfig;
import com.symphony.bdk.core.config.model.BdkProxyConfig;
import com.symphony.bdk.http.api.ApiClientBuilder;
import com.symphony.bdk.http.jersey2.ApiClientBuilderJersey2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ApiClientFactoryDiffblueTest {
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

  /**
   * Test {@link ApiClientFactory#configureProxy(BdkProxyConfig, ApiClientBuilder)}.
   *
   * <ul>
   *   <li>When {@link BdkProxyConfig#BdkProxyConfig()}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientFactory#configureProxy(BdkProxyConfig, ApiClientBuilder)}
   */
  @Test
  @DisplayName(
      "Test configureProxy(BdkProxyConfig, ApiClientBuilder); when BdkProxyConfig(); then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiClientFactory.configureProxy(BdkProxyConfig, ApiClientBuilder)"})
  void testConfigureProxy_whenBdkProxyConfig_thenDoesNotThrow() {
    // Arrange
    ApiClientFactory apiClientFactory = new ApiClientFactory(mock(BdkConfig.class));
    BdkProxyConfig proxyConfig = new BdkProxyConfig();

    // Act and Assert
    assertDoesNotThrow(
        () -> apiClientFactory.configureProxy(proxyConfig, new ApiClientBuilderJersey2()));
  }

  /**
   * Test {@link ApiClientFactory#configureProxy(BdkProxyConfig, ApiClientBuilder)}.
   *
   * <ul>
   *   <li>When {@link BdkProxyConfig#BdkProxyConfig()}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientFactory#configureProxy(BdkProxyConfig, ApiClientBuilder)}
   */
  @Test
  @DisplayName(
      "Test configureProxy(BdkProxyConfig, ApiClientBuilder); when BdkProxyConfig(); then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiClientFactory.configureProxy(BdkProxyConfig, ApiClientBuilder)"})
  void testConfigureProxy_whenBdkProxyConfig_thenDoesNotThrow2() {
    // Arrange
    ApiClientFactory apiClientFactory = new ApiClientFactory(mock(BdkConfig.class));
    BdkProxyConfig proxyConfig = new BdkProxyConfig();

    // Act and Assert
    assertDoesNotThrow(
        () -> apiClientFactory.configureProxy(proxyConfig, new ApiClientBuilderJersey2()));
  }

  /**
   * Test {@link ApiClientFactory#configureProxy(BdkProxyConfig, ApiClientBuilder)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientFactory#configureProxy(BdkProxyConfig, ApiClientBuilder)}
   */
  @Test
  @DisplayName(
      "Test configureProxy(BdkProxyConfig, ApiClientBuilder); when 'null'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiClientFactory.configureProxy(BdkProxyConfig, ApiClientBuilder)"})
  void testConfigureProxy_whenNull_thenDoesNotThrow() {
    // Arrange
    ApiClientFactory apiClientFactory = new ApiClientFactory(mock(BdkConfig.class));

    // Act and Assert
    assertDoesNotThrow(() -> apiClientFactory.configureProxy(null, new ApiClientBuilderJersey2()));
  }

  /**
   * Test {@link ApiClientFactory#configureProxy(BdkProxyConfig, ApiClientBuilder)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientFactory#configureProxy(BdkProxyConfig, ApiClientBuilder)}
   */
  @Test
  @DisplayName(
      "Test configureProxy(BdkProxyConfig, ApiClientBuilder); when 'null'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiClientFactory.configureProxy(BdkProxyConfig, ApiClientBuilder)"})
  void testConfigureProxy_whenNull_thenDoesNotThrow2() {
    // Arrange
    ApiClientFactory apiClientFactory = new ApiClientFactory(mock(BdkConfig.class));

    // Act and Assert
    assertDoesNotThrow(() -> apiClientFactory.configureProxy(null, new ApiClientBuilderJersey2()));
  }
}
