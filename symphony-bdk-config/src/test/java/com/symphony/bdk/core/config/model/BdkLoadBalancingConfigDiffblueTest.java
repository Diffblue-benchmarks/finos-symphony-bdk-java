package com.symphony.bdk.core.config.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkLoadBalancingConfigDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link BdkLoadBalancingConfig}
   *   <li>{@link BdkLoadBalancingConfig#setMode(BdkLoadBalancingMode)}
   *   <li>{@link BdkLoadBalancingConfig#setNodes(List)}
   *   <li>{@link BdkLoadBalancingConfig#setStickiness(boolean)}
   *   <li>{@link BdkLoadBalancingConfig#getMode()}
   *   <li>{@link BdkLoadBalancingConfig#getNodes()}
   *   <li>{@link BdkLoadBalancingConfig#isStickiness()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BdkLoadBalancingConfig.<init>()", "BdkLoadBalancingMode BdkLoadBalancingConfig.getMode()",
      "List BdkLoadBalancingConfig.getNodes()", "boolean BdkLoadBalancingConfig.isStickiness()",
      "void BdkLoadBalancingConfig.setMode(BdkLoadBalancingMode)", "void BdkLoadBalancingConfig.setNodes(List)",
      "void BdkLoadBalancingConfig.setStickiness(boolean)"})
  void testGettersAndSetters() {
    // Arrange and Act
    BdkLoadBalancingConfig actualBdkLoadBalancingConfig = new BdkLoadBalancingConfig();
    actualBdkLoadBalancingConfig.setMode(BdkLoadBalancingMode.EXTERNAL);
    ArrayList<BdkServerConfig> nodes = new ArrayList<>();
    actualBdkLoadBalancingConfig.setNodes(nodes);
    actualBdkLoadBalancingConfig.setStickiness(true);
    BdkLoadBalancingMode actualMode = actualBdkLoadBalancingConfig.getMode();
    List<BdkServerConfig> actualNodes = actualBdkLoadBalancingConfig.getNodes();

    // Assert
    assertEquals(BdkLoadBalancingMode.EXTERNAL, actualMode);
    assertTrue(actualBdkLoadBalancingConfig.isStickiness());
    assertTrue(actualNodes.isEmpty());
    assertSame(nodes, actualNodes);
  }
}
