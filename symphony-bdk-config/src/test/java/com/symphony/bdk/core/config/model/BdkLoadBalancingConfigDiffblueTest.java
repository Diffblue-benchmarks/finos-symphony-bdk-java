package com.symphony.bdk.core.config.model;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkLoadBalancingConfigDiffblueTest {
  /**
   * Test new {@link BdkLoadBalancingConfig} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link BdkLoadBalancingConfig}
   */
  @Test
  @DisplayName("Test new BdkLoadBalancingConfig (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BdkLoadBalancingConfig.<init>()"})
  void testNewBdkLoadBalancingConfig() {
    // Arrange and Act
    BdkLoadBalancingConfig actualBdkLoadBalancingConfig = new BdkLoadBalancingConfig();

    // Assert
    assertNull(actualBdkLoadBalancingConfig.getMode());
    assertNull(actualBdkLoadBalancingConfig.getNodes());
    assertTrue(actualBdkLoadBalancingConfig.isStickiness());
  }
}
