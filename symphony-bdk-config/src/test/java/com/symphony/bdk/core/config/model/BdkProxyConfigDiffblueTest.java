package com.symphony.bdk.core.config.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkProxyConfigDiffblueTest {
  /**
   * Test {@link BdkProxyConfig#BdkProxyConfig()}.
   *
   * <ul>
   *   <li>Then return Host is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkProxyConfig#BdkProxyConfig()}
   */
  @Test
  @DisplayName("Test new BdkProxyConfig(); then return Host is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void BdkProxyConfig.<init>()",
    "void BdkProxyConfig.<init>(String, int, String, String)"
  })
  void testNewBdkProxyConfig_thenReturnHostIsNull() {
    // Arrange and Act
    BdkProxyConfig actualBdkProxyConfig = new BdkProxyConfig();

    // Assert
    assertNull(actualBdkProxyConfig.getHost());
    assertNull(actualBdkProxyConfig.getPassword());
    assertNull(actualBdkProxyConfig.getUsername());
    assertEquals(0, actualBdkProxyConfig.getPort());
  }

  /**
   * Test {@link BdkProxyConfig#BdkProxyConfig(String, int, String, String)}.
   *
   * <ul>
   *   <li>When {@code localhost}.
   *   <li>Then return Password is {@code iloveyou}.
   * </ul>
   *
   * <p>Method under test: {@link BdkProxyConfig#BdkProxyConfig(String, int, String, String)}
   */
  @Test
  @DisplayName(
      "Test new BdkProxyConfig(String, int, String, String); when 'localhost'; then return Password is 'iloveyou'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void BdkProxyConfig.<init>()",
    "void BdkProxyConfig.<init>(String, int, String, String)"
  })
  void testNewBdkProxyConfig_whenLocalhost_thenReturnPasswordIsIloveyou() {
    // Arrange and Act
    BdkProxyConfig actualBdkProxyConfig =
        new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");

    // Assert
    assertEquals("iloveyou", actualBdkProxyConfig.getPassword());
    assertEquals("janedoe", actualBdkProxyConfig.getUsername());
    assertEquals("localhost", actualBdkProxyConfig.getHost());
    assertEquals(8080, actualBdkProxyConfig.getPort());
  }
}
