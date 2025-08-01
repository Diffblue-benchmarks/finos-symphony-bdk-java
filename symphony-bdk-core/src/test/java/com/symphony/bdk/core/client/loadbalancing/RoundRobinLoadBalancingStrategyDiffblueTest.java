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

class RoundRobinLoadBalancingStrategyDiffblueTest {
  /**
   * Test {@link RoundRobinLoadBalancingStrategy#RoundRobinLoadBalancingStrategy(List)}.
   *
   * <p>Method under test: {@link
   * RoundRobinLoadBalancingStrategy#RoundRobinLoadBalancingStrategy(List)}
   */
  @Test
  @DisplayName("Test new RoundRobinLoadBalancingStrategy(List)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RoundRobinLoadBalancingStrategy.<init>(List)"})
  void testNewRoundRobinLoadBalancingStrategy() {
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
    bdkServerConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    bdkServerConfig.setReadTimeout(10);
    bdkServerConfig.setScheme("Scheme");

    ArrayList<BdkServerConfig> nodes = new ArrayList<>();
    nodes.add(bdkServerConfig);

    // Act and Assert
    assertEquals(
        "Scheme://localhost:8080/Context",
        new RoundRobinLoadBalancingStrategy(nodes).getNewBasePath());
    assertEquals(1, nodes.size());
    assertSame(bdkServerConfig, nodes.get(0));
  }

  /**
   * Test {@link RoundRobinLoadBalancingStrategy#RoundRobinLoadBalancingStrategy(List)}.
   *
   * <ul>
   *   <li>Then return NewBasePath is {@code Scheme://Context:1}.
   * </ul>
   *
   * <p>Method under test: {@link
   * RoundRobinLoadBalancingStrategy#RoundRobinLoadBalancingStrategy(List)}
   */
  @Test
  @DisplayName(
      "Test new RoundRobinLoadBalancingStrategy(List); then return NewBasePath is 'Scheme://Context:1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RoundRobinLoadBalancingStrategy.<init>(List)"})
  void testNewRoundRobinLoadBalancingStrategy_thenReturnNewBasePathIsSchemeContext1() {
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
    bdkServerConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    bdkServerConfig.setReadTimeout(10);
    bdkServerConfig.setScheme("Scheme");

    HashMap<String, String> defaultHeaders2 = new HashMap<>();
    defaultHeaders2.put("Delivered-To", "alice.liddell@example.org");

    BdkServerConfig bdkServerConfig2 = new BdkServerConfig();
    bdkServerConfig2.setConnectionPoolMax(47);
    bdkServerConfig2.setConnectionPoolPerRoute(47);
    bdkServerConfig2.setConnectionTimeout(1);
    bdkServerConfig2.setContext("");
    bdkServerConfig2.setDefaultHeaders(defaultHeaders2);
    bdkServerConfig2.setHost("Context");
    bdkServerConfig2.setPort(1);
    bdkServerConfig2.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    bdkServerConfig2.setReadTimeout(1);
    bdkServerConfig2.setScheme("Scheme");

    ArrayList<BdkServerConfig> nodes = new ArrayList<>();
    nodes.add(bdkServerConfig2);
    nodes.add(bdkServerConfig);

    // Act and Assert
    assertEquals("Scheme://Context:1", new RoundRobinLoadBalancingStrategy(nodes).getNewBasePath());
    assertEquals(2, nodes.size());
    assertSame(bdkServerConfig2, nodes.get(0));
    assertSame(bdkServerConfig, nodes.get(1));
  }

  /**
   * Test {@link RoundRobinLoadBalancingStrategy#RoundRobinLoadBalancingStrategy(List)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then {@link ArrayList#ArrayList()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * RoundRobinLoadBalancingStrategy#RoundRobinLoadBalancingStrategy(List)}
   */
  @Test
  @DisplayName(
      "Test new RoundRobinLoadBalancingStrategy(List); when ArrayList(); then ArrayList() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RoundRobinLoadBalancingStrategy.<init>(List)"})
  void testNewRoundRobinLoadBalancingStrategy_whenArrayList_thenArrayListEmpty() {
    // Arrange
    ArrayList<BdkServerConfig> nodes = new ArrayList<>();

    // Act
    new RoundRobinLoadBalancingStrategy(nodes);

    // Assert that nothing has changed
    assertTrue(nodes.isEmpty());
  }

  /**
   * Test {@link RoundRobinLoadBalancingStrategy#getNewBasePath()}.
   *
   * <ul>
   *   <li>Then return {@code Scheme://localhost:8080/Context}.
   * </ul>
   *
   * <p>Method under test: {@link RoundRobinLoadBalancingStrategy#getNewBasePath()}
   */
  @Test
  @DisplayName("Test getNewBasePath(); then return 'Scheme://localhost:8080/Context'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String RoundRobinLoadBalancingStrategy.getNewBasePath()"})
  void testGetNewBasePath_thenReturnSchemeLocalhost8080Context() {
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
    bdkServerConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    bdkServerConfig.setReadTimeout(10);
    bdkServerConfig.setScheme("Scheme");

    ArrayList<BdkServerConfig> nodes = new ArrayList<>();
    nodes.add(bdkServerConfig);

    // Act and Assert
    assertEquals(
        "Scheme://localhost:8080/Context",
        new RoundRobinLoadBalancingStrategy(nodes).getNewBasePath());
  }
}
