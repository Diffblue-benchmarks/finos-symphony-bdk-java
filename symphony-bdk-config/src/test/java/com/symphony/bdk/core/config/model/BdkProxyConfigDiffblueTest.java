package com.symphony.bdk.core.config.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkProxyConfigDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BdkProxyConfig#BdkProxyConfig()}
   *   <li>{@link BdkProxyConfig#setHost(String)}
   *   <li>{@link BdkProxyConfig#setPassword(String)}
   *   <li>{@link BdkProxyConfig#setPort(int)}
   *   <li>{@link BdkProxyConfig#setUsername(String)}
   *   <li>{@link BdkProxyConfig#getHost()}
   *   <li>{@link BdkProxyConfig#getPassword()}
   *   <li>{@link BdkProxyConfig#getPort()}
   *   <li>{@link BdkProxyConfig#getUsername()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BdkProxyConfig.<init>()", "void BdkProxyConfig.<init>(String, int, String, String)",
      "String BdkProxyConfig.getHost()", "String BdkProxyConfig.getPassword()", "int BdkProxyConfig.getPort()",
      "String BdkProxyConfig.getUsername()", "void BdkProxyConfig.setHost(String)",
      "void BdkProxyConfig.setPassword(String)", "void BdkProxyConfig.setPort(int)",
      "void BdkProxyConfig.setUsername(String)"})
  void testGettersAndSetters() {
    // Arrange and Act
    BdkProxyConfig actualBdkProxyConfig = new BdkProxyConfig();
    actualBdkProxyConfig.setHost("localhost");
    actualBdkProxyConfig.setPassword("iloveyou");
    actualBdkProxyConfig.setPort(8080);
    actualBdkProxyConfig.setUsername("janedoe");
    String actualHost = actualBdkProxyConfig.getHost();
    String actualPassword = actualBdkProxyConfig.getPassword();
    int actualPort = actualBdkProxyConfig.getPort();

    // Assert
    assertEquals("iloveyou", actualPassword);
    assertEquals("janedoe", actualBdkProxyConfig.getUsername());
    assertEquals("localhost", actualHost);
    assertEquals(8080, actualPort);
  }

  /**
   * Test getters and setters.
   * <ul>
   *   <li>When {@code localhost}.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BdkProxyConfig#BdkProxyConfig(String, int, String, String)}
   *   <li>{@link BdkProxyConfig#setHost(String)}
   *   <li>{@link BdkProxyConfig#setPassword(String)}
   *   <li>{@link BdkProxyConfig#setPort(int)}
   *   <li>{@link BdkProxyConfig#setUsername(String)}
   *   <li>{@link BdkProxyConfig#getHost()}
   *   <li>{@link BdkProxyConfig#getPassword()}
   *   <li>{@link BdkProxyConfig#getPort()}
   *   <li>{@link BdkProxyConfig#getUsername()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters; when 'localhost'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BdkProxyConfig.<init>()", "void BdkProxyConfig.<init>(String, int, String, String)",
      "String BdkProxyConfig.getHost()", "String BdkProxyConfig.getPassword()", "int BdkProxyConfig.getPort()",
      "String BdkProxyConfig.getUsername()", "void BdkProxyConfig.setHost(String)",
      "void BdkProxyConfig.setPassword(String)", "void BdkProxyConfig.setPort(int)",
      "void BdkProxyConfig.setUsername(String)"})
  void testGettersAndSetters_whenLocalhost() {
    // Arrange and Act
    BdkProxyConfig actualBdkProxyConfig = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");
    actualBdkProxyConfig.setHost("localhost");
    actualBdkProxyConfig.setPassword("iloveyou");
    actualBdkProxyConfig.setPort(8080);
    actualBdkProxyConfig.setUsername("janedoe");
    String actualHost = actualBdkProxyConfig.getHost();
    String actualPassword = actualBdkProxyConfig.getPassword();
    int actualPort = actualBdkProxyConfig.getPort();

    // Assert
    assertEquals("iloveyou", actualPassword);
    assertEquals("janedoe", actualBdkProxyConfig.getUsername());
    assertEquals("localhost", actualHost);
    assertEquals(8080, actualPort);
  }
}
