package com.symphony.bdk.core.client.loadbalancing;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
   * <p>
   * Method under test: {@link RandomLoadBalancingStrategy#RandomLoadBalancingStrategy(List)}
   */
  @Test
  @DisplayName("Test new RandomLoadBalancingStrategy(List)")
  @Tag("MaintainedByDiffblue")
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
    bdkServerConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    bdkServerConfig.setReadTimeout(10);
    bdkServerConfig.setScheme("Scheme");

    ArrayList<BdkServerConfig> nodes = new ArrayList<>();
    nodes.add(bdkServerConfig);

    // Act and Assert
    assertEquals("Scheme://localhost:8080/Context", (new RandomLoadBalancingStrategy(nodes)).getNewBasePath());
  }

  /**
   * Test {@link RandomLoadBalancingStrategy#getNewBasePath()}.
   * <ul>
   *   <li>Then return {@code Scheme://localhost:8080/Context}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RandomLoadBalancingStrategy#getNewBasePath()}
   */
  @Test
  @DisplayName("Test getNewBasePath(); then return 'Scheme://localhost:8080/Context'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String RandomLoadBalancingStrategy.getNewBasePath()"})
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
    assertEquals("Scheme://localhost:8080/Context", (new RandomLoadBalancingStrategy(nodes)).getNewBasePath());
  }
}
