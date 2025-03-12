package com.symphony.bdk.app.spring.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.service.health.HealthService;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Status;

class SymphonyBdkHealthIndicatorDiffblueTest {
  /**
   * Test {@link SymphonyBdkHealthIndicator#SymphonyBdkHealthIndicator(HealthService)}.
   * <ul>
   *   <li>Then return health Status Description is empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link SymphonyBdkHealthIndicator#SymphonyBdkHealthIndicator(HealthService)}
   */
  @Test
  @DisplayName("Test new SymphonyBdkHealthIndicator(HealthService); then return health Status Description is empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SymphonyBdkHealthIndicator.<init>(HealthService)"})
  void testNewSymphonyBdkHealthIndicator_thenReturnHealthStatusDescriptionIsEmptyString() {
    // Arrange and Act
    Health actualHealthResult = (new SymphonyBdkHealthIndicator(null)).health();

    // Assert
    Status status = actualHealthResult.getStatus();
    assertEquals("", status.getDescription());
    Map<String, Object> details = actualHealthResult.getDetails();
    assertEquals(1, details.size());
    assertEquals("java.lang.NullPointerException: Cannot invoke \"com.symphony.bdk.core.service.health.HealthService"
        + ".healthCheckExtended()\" because \"this.healthService\" is null", details.get("error"));
    assertEquals(SymphonyBdkHealthIndicator.DOWN, status.getCode());
    assertEquals(SymphonyBdkHealthIndicator.DOWN, status.toString());
  }
}
