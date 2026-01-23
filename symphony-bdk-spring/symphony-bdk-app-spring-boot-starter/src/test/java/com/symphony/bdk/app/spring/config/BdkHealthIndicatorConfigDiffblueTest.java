package com.symphony.bdk.app.spring.config;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.AuthSession;
import com.symphony.bdk.core.service.health.HealthService;
import com.symphony.bdk.gen.api.SignalsApi;
import com.symphony.bdk.gen.api.SystemApi;
import com.symphony.bdk.gen.api.model.V3Health;
import com.symphony.bdk.gen.api.model.V3HealthComponent;
import com.symphony.bdk.http.api.ApiException;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Status;

class BdkHealthIndicatorConfigDiffblueTest {
  /**
   * Test {@link BdkHealthIndicatorConfig#symphonyBdkHealthIndicator(HealthService)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link SystemApi} {@link SystemApi#v3ExtendedHealth()} return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * BdkHealthIndicatorConfig#symphonyBdkHealthIndicator(HealthService)}
   */
  @Test
  @DisplayName(
      "Test symphonyBdkHealthIndicator(HealthService); given 'null'; when SystemApi v3ExtendedHealth() return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.app.spring.service.SymphonyBdkHealthIndicator BdkHealthIndicatorConfig.symphonyBdkHealthIndicator(HealthService)"
  })
  void testSymphonyBdkHealthIndicator_givenNull_whenSystemApiV3ExtendedHealthReturnNull()
      throws ApiException {
    // Arrange
    BdkHealthIndicatorConfig bdkHealthIndicatorConfig = new BdkHealthIndicatorConfig();

    SystemApi systemApi = mock(SystemApi.class);
    when(systemApi.v3ExtendedHealth()).thenReturn(null);
    HealthService healthService =
        new HealthService(systemApi, mock(SignalsApi.class), mock(AuthSession.class));

    // Act
    Health actualHealthResult =
        bdkHealthIndicatorConfig.symphonyBdkHealthIndicator(healthService).health();

    // Assert
    verify(systemApi).v3ExtendedHealth();
    Status status = actualHealthResult.getStatus();
    assertEquals("", status.getDescription());
    assertEquals("DOWN", status.getCode());
    assertEquals("DOWN", status.toString());
    Map<String, Object> details = actualHealthResult.getDetails();
    assertEquals(1, details.size());
    assertEquals(
        "java.lang.NullPointerException: Cannot invoke \"com.symphony.bdk.gen.api.model.V3Health.getServices()\""
            + " because \"health\" is null",
        details.get("error"));
    assertNull(healthService.getAgentInfo());
  }

  /**
   * Test {@link BdkHealthIndicatorConfig#symphonyBdkHealthIndicator(HealthService)}.
   *
   * <ul>
   *   <li>Then return health Details {@code error} is a string.
   * </ul>
   *
   * <p>Method under test: {@link
   * BdkHealthIndicatorConfig#symphonyBdkHealthIndicator(HealthService)}
   */
  @Test
  @DisplayName(
      "Test symphonyBdkHealthIndicator(HealthService); then return health Details 'error' is a string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.app.spring.service.SymphonyBdkHealthIndicator BdkHealthIndicatorConfig.symphonyBdkHealthIndicator(HealthService)"
  })
  void testSymphonyBdkHealthIndicator_thenReturnHealthDetailsErrorIsAString() {
    // Arrange
    BdkHealthIndicatorConfig bdkHealthIndicatorConfig = new BdkHealthIndicatorConfig();
    HealthService healthService =
        new HealthService(mock(SystemApi.class), mock(SignalsApi.class), mock(AuthSession.class));

    // Act and Assert
    Health healthResult =
        bdkHealthIndicatorConfig.symphonyBdkHealthIndicator(healthService).health();
    Status status = healthResult.getStatus();
    assertEquals("", status.getDescription());
    assertEquals("DOWN", status.getCode());
    assertEquals("DOWN", status.toString());
    Map<String, Object> details = healthResult.getDetails();
    assertEquals(1, details.size());
    assertEquals(
        "java.lang.NullPointerException: Cannot invoke \"com.symphony.bdk.gen.api.model.V3Health.getServices()\""
            + " because \"health\" is null",
        details.get("error"));
    assertNull(healthService.getAgentInfo());
  }

  /**
   * Test {@link BdkHealthIndicatorConfig#symphonyBdkHealthIndicator(HealthService)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * BdkHealthIndicatorConfig#symphonyBdkHealthIndicator(HealthService)}
   */
  @Test
  @DisplayName("Test symphonyBdkHealthIndicator(HealthService); when 'null'; then 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.app.spring.service.SymphonyBdkHealthIndicator BdkHealthIndicatorConfig.symphonyBdkHealthIndicator(HealthService)"
  })
  void testSymphonyBdkHealthIndicator_whenNull_thenNull() {
    // Arrange and Act
    Health actualHealthResult =
        new BdkHealthIndicatorConfig().symphonyBdkHealthIndicator(null).health();

    // Assert
    Status status = actualHealthResult.getStatus();
    assertEquals("", status.getDescription());
    assertEquals("DOWN", status.getCode());
    assertEquals("DOWN", status.toString());
    Map<String, Object> details = actualHealthResult.getDetails();
    assertEquals(1, details.size());
    assertEquals(
        "java.lang.NullPointerException: Cannot invoke \"com.symphony.bdk.core.service.health.HealthService"
            + ".healthCheckExtended()\" because \"this.healthService\" is null",
        details.get("error"));
    assertNull(null);
  }
}
