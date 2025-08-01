package com.symphony.bdk.app.spring.config;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.AuthSession;
import com.symphony.bdk.core.service.health.HealthService;
import com.symphony.bdk.gen.api.SignalsApi;
import com.symphony.bdk.gen.api.SystemApi;
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
   * <p>Method under test: {@link
   * BdkHealthIndicatorConfig#symphonyBdkHealthIndicator(HealthService)}
   */
  @Test
  @DisplayName("Test symphonyBdkHealthIndicator(HealthService)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.app.spring.service.SymphonyBdkHealthIndicator BdkHealthIndicatorConfig.symphonyBdkHealthIndicator(HealthService)"
  })
  void testSymphonyBdkHealthIndicator() {
    // Arrange
    BdkHealthIndicatorConfig bdkHealthIndicatorConfig = new BdkHealthIndicatorConfig();

    // Act and Assert
    Health healthResult =
        bdkHealthIndicatorConfig
            .symphonyBdkHealthIndicator(
                new HealthService(
                    mock(SystemApi.class), mock(SignalsApi.class), mock(AuthSession.class)))
            .health();
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
  }
}
