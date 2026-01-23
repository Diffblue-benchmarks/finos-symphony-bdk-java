package com.symphony.bdk.app.spring.service;

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
import com.symphony.bdk.http.api.ApiRuntimeException;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Status;

class SymphonyBdkHealthIndicatorDiffblueTest {
  /**
   * Test {@link SymphonyBdkHealthIndicator#SymphonyBdkHealthIndicator(HealthService)}.
   *
   * <p>Method under test: {@link
   * SymphonyBdkHealthIndicator#SymphonyBdkHealthIndicator(HealthService)}
   */
  @Test
  @DisplayName("Test new SymphonyBdkHealthIndicator(HealthService)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SymphonyBdkHealthIndicator.<init>(HealthService)"})
  void testNewSymphonyBdkHealthIndicator() throws ApiException {
    // Arrange
    SystemApi systemApi = mock(SystemApi.class);
    when(systemApi.v3ExtendedHealth())
        .thenThrow(new ApiRuntimeException(new ApiException(1, "https://example.org/example")));
    HealthService healthService =
        new HealthService(systemApi, mock(SignalsApi.class), mock(AuthSession.class));

    // Act
    Health actualHealthResult = new SymphonyBdkHealthIndicator(healthService).health();

    // Assert
    verify(systemApi).v3ExtendedHealth();
    Status status = actualHealthResult.getStatus();
    assertEquals("", status.getDescription());
    Map<String, Object> details = actualHealthResult.getDetails();
    assertEquals(1, details.size());
    assertEquals(
        "java.lang.IllegalArgumentException: argument \"content\" is null", details.get("error"));
    assertNull(healthService.getAgentInfo());
    assertEquals(SymphonyBdkHealthIndicator.DOWN, status.getCode());
    assertEquals(SymphonyBdkHealthIndicator.DOWN, status.toString());
  }

  /**
   * Test {@link SymphonyBdkHealthIndicator#SymphonyBdkHealthIndicator(HealthService)}.
   *
   * <ul>
   *   <li>Then return health Details {@code error} is a string.
   * </ul>
   *
   * <p>Method under test: {@link
   * SymphonyBdkHealthIndicator#SymphonyBdkHealthIndicator(HealthService)}
   */
  @Test
  @DisplayName(
      "Test new SymphonyBdkHealthIndicator(HealthService); then return health Details 'error' is a string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SymphonyBdkHealthIndicator.<init>(HealthService)"})
  void testNewSymphonyBdkHealthIndicator_thenReturnHealthDetailsErrorIsAString() {
    // Arrange
    HealthService healthService =
        new HealthService(mock(SystemApi.class), mock(SignalsApi.class), mock(AuthSession.class));

    // Act and Assert
    Health healthResult = new SymphonyBdkHealthIndicator(healthService).health();
    Status status = healthResult.getStatus();
    assertEquals("", status.getDescription());
    Map<String, Object> details = healthResult.getDetails();
    assertEquals(1, details.size());
    assertEquals(
        "java.lang.NullPointerException: Cannot invoke \"com.symphony.bdk.gen.api.model.V3Health.getServices()\""
            + " because \"health\" is null",
        details.get("error"));
    assertNull(healthService.getAgentInfo());
    assertEquals(SymphonyBdkHealthIndicator.DOWN, status.getCode());
    assertEquals(SymphonyBdkHealthIndicator.DOWN, status.toString());
  }

  /**
   * Test {@link SymphonyBdkHealthIndicator#SymphonyBdkHealthIndicator(HealthService)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * SymphonyBdkHealthIndicator#SymphonyBdkHealthIndicator(HealthService)}
   */
  @Test
  @DisplayName("Test new SymphonyBdkHealthIndicator(HealthService); when 'null'; then 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SymphonyBdkHealthIndicator.<init>(HealthService)"})
  void testNewSymphonyBdkHealthIndicator_whenNull_thenNull() {
    // Arrange and Act
    Health actualHealthResult = new SymphonyBdkHealthIndicator(null).health();

    // Assert
    Status status = actualHealthResult.getStatus();
    assertEquals("", status.getDescription());
    Map<String, Object> details = actualHealthResult.getDetails();
    assertEquals(1, details.size());
    assertEquals(
        "java.lang.NullPointerException: Cannot invoke \"com.symphony.bdk.core.service.health.HealthService"
            + ".healthCheckExtended()\" because \"this.healthService\" is null",
        details.get("error"));
    assertNull(null);
    assertEquals(SymphonyBdkHealthIndicator.DOWN, status.getCode());
    assertEquals(SymphonyBdkHealthIndicator.DOWN, status.toString());
  }
}
