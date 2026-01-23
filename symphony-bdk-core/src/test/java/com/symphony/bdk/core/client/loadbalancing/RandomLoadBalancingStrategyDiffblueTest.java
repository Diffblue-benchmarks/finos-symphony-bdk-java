package com.symphony.bdk.core.client.loadbalancing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.config.model.BdkProxyConfig;
import com.symphony.bdk.core.config.model.BdkServerConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RandomLoadBalancingStrategyDiffblueTest {
  /**
   * Test {@link RandomLoadBalancingStrategy#RandomLoadBalancingStrategy(List)}.
   *
   * <p>Method under test: {@link RandomLoadBalancingStrategy#RandomLoadBalancingStrategy(List)}
   */
  @Test
  @DisplayName("Test new RandomLoadBalancingStrategy(List)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RandomLoadBalancingStrategy.<init>(List)"})
  void testNewRandomLoadBalancingStrategy() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkServerConfig bdkServerConfig = new BdkServerConfig();
    bdkServerConfig.setConnectionPoolMax(1);
    bdkServerConfig.setConnectionPoolPerRoute(1);
    bdkServerConfig.setConnectionTimeout(10);
    bdkServerConfig.setContext("Context");
    bdkServerConfig.setDefaultHeaders(defaultHeaders);
    bdkServerConfig.setHost("localhost");
    bdkServerConfig.setPort(8080);
    bdkServerConfig.setProxy(new BdkProxyConfig());
    bdkServerConfig.setReadTimeout(10);
    bdkServerConfig.setScheme("Scheme");

    ArrayList<BdkServerConfig> nodes = new ArrayList<>();
    nodes.add(bdkServerConfig);

    // Act and Assert
    assertEquals(
        "Scheme://localhost:8080/Context", new RandomLoadBalancingStrategy(nodes).getNewBasePath());
    assertEquals(1, nodes.size());
    assertSame(bdkServerConfig, nodes.get(0));
  }

  /**
   * Test {@link RandomLoadBalancingStrategy#RandomLoadBalancingStrategy(List)}.
   *
   * <ul>
   *   <li>Then {@link ArrayList#ArrayList()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link RandomLoadBalancingStrategy#RandomLoadBalancingStrategy(List)}
   */
  @Test
  @DisplayName("Test new RandomLoadBalancingStrategy(List); then ArrayList() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RandomLoadBalancingStrategy.<init>(List)"})
  void testNewRandomLoadBalancingStrategy_thenArrayListSizeIsTwo() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkServerConfig bdkServerConfig = new BdkServerConfig();
    bdkServerConfig.setConnectionPoolMax(1);
    bdkServerConfig.setConnectionPoolPerRoute(1);
    bdkServerConfig.setConnectionTimeout(10);
    bdkServerConfig.setContext("Context");
    bdkServerConfig.setDefaultHeaders(defaultHeaders);
    bdkServerConfig.setHost("localhost");
    bdkServerConfig.setPort(8080);
    bdkServerConfig.setProxy(new BdkProxyConfig());
    bdkServerConfig.setReadTimeout(10);
    bdkServerConfig.setScheme("Scheme");

    HashMap<String, String> defaultHeaders2 = new HashMap<>();
    defaultHeaders2.put("Delivered-To", "alice.liddell@example.org");

    BdkServerConfig bdkServerConfig2 = new BdkServerConfig();
    bdkServerConfig2.setConnectionPoolMax(67);
    bdkServerConfig2.setConnectionPoolPerRoute(67);
    bdkServerConfig2.setConnectionTimeout(47);
    bdkServerConfig2.setContext("");
    bdkServerConfig2.setDefaultHeaders(defaultHeaders2);
    bdkServerConfig2.setHost("Context");
    bdkServerConfig2.setPort(47);
    bdkServerConfig2.setProxy(new BdkProxyConfig());
    bdkServerConfig2.setReadTimeout(47);
    bdkServerConfig2.setScheme("Scheme");

    ArrayList<BdkServerConfig> nodes = new ArrayList<>();
    nodes.add(bdkServerConfig2);
    nodes.add(bdkServerConfig);

    // Act
    new RandomLoadBalancingStrategy(nodes).getNewBasePath();

    // Assert that nothing has changed
    assertEquals(2, nodes.size());
    assertSame(bdkServerConfig2, nodes.get(0));
    assertSame(bdkServerConfig, nodes.get(1));
  }

  /**
   * Test {@link RandomLoadBalancingStrategy#RandomLoadBalancingStrategy(List)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then {@link ArrayList#ArrayList()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link RandomLoadBalancingStrategy#RandomLoadBalancingStrategy(List)}
   */
  @Test
  @DisplayName(
      "Test new RandomLoadBalancingStrategy(List); when ArrayList(); then ArrayList() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RandomLoadBalancingStrategy.<init>(List)"})
  void testNewRandomLoadBalancingStrategy_whenArrayList_thenArrayListEmpty() {
    // Arrange
    ArrayList<BdkServerConfig> nodes = new ArrayList<>();

    // Act
    new RandomLoadBalancingStrategy(nodes);

    // Assert that nothing has changed
    assertTrue(nodes.isEmpty());
  }
}
