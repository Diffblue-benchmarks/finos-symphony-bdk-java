package com.symphony.bdk.core.config.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkLoadBalancingModeDiffblueTest {
  /**
   * Test {@link BdkLoadBalancingMode#getName()}.
   * <p>
   * Method under test: {@link BdkLoadBalancingMode#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.String BdkLoadBalancingMode.getName()"})
  void testGetName() {
    // Arrange, Act and Assert
    assertEquals("external", BdkLoadBalancingMode.valueOf("EXTERNAL").getName());
  }
}
