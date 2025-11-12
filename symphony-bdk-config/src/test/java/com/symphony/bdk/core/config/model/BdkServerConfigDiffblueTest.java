package com.symphony.bdk.core.config.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkServerConfigDiffblueTest {
  /**
   * Test {@link BdkServerConfig#getBasePath()}.
   *
   * <ul>
   *   <li>Given {@link BdkServerConfig} (default constructor) Context is {@code null}.
   *   <li>Then return {@code Scheme://localhost:1}.
   * </ul>
   *
   * <p>Method under test: {@link BdkServerConfig#getBasePath()}
   */
  @Test
  @DisplayName(
      "Test getBasePath(); given BdkServerConfig (default constructor) Context is 'null'; then return 'Scheme://localhost:1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BdkServerConfig.getBasePath()"})
  void testGetBasePath_givenBdkServerConfigContextIsNull_thenReturnSchemeLocalhost1() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkServerConfig bdkServerConfig = new BdkServerConfig();
    bdkServerConfig.setConnectionPoolMax(1);
    bdkServerConfig.setConnectionPoolPerRoute(1);
    bdkServerConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkServerConfig.setDefaultHeaders(defaultHeaders);
    bdkServerConfig.setHost("localhost");
    BdkProxyConfig proxy = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");
    bdkServerConfig.setProxy(proxy);
    bdkServerConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkServerConfig.setScheme("Scheme");
    bdkServerConfig.setPort(1);
    bdkServerConfig.setContext(null);

    // Act and Assert
    assertEquals("Scheme://localhost:1", bdkServerConfig.getBasePath());
  }

  /**
   * Test {@link BdkServerConfig#getBasePath()}.
   *
   * <ul>
   *   <li>Given {@link BdkServerConfig} (default constructor) Context is {@code /}.
   *   <li>Then return {@code Scheme://localhost:1}.
   * </ul>
   *
   * <p>Method under test: {@link BdkServerConfig#getBasePath()}
   */
  @Test
  @DisplayName(
      "Test getBasePath(); given BdkServerConfig (default constructor) Context is '/'; then return 'Scheme://localhost:1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BdkServerConfig.getBasePath()"})
  void testGetBasePath_givenBdkServerConfigContextIsSlash_thenReturnSchemeLocalhost1() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkServerConfig bdkServerConfig = new BdkServerConfig();
    bdkServerConfig.setConnectionPoolMax(1);
    bdkServerConfig.setConnectionPoolPerRoute(1);
    bdkServerConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkServerConfig.setDefaultHeaders(defaultHeaders);
    bdkServerConfig.setHost("localhost");
    BdkProxyConfig proxy = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");
    bdkServerConfig.setProxy(proxy);
    bdkServerConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkServerConfig.setScheme("Scheme");
    bdkServerConfig.setPort(1);
    bdkServerConfig.setContext("/");

    // Act and Assert
    assertEquals("Scheme://localhost:1", bdkServerConfig.getBasePath());
  }

  /**
   * Test {@link BdkServerConfig#getBasePath()}.
   *
   * <ul>
   *   <li>Given {@link BdkServerConfig} (default constructor) Port is {@code null}.
   *   <li>Then return {@code Scheme://localhost}.
   * </ul>
   *
   * <p>Method under test: {@link BdkServerConfig#getBasePath()}
   */
  @Test
  @DisplayName(
      "Test getBasePath(); given BdkServerConfig (default constructor) Port is 'null'; then return 'Scheme://localhost'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BdkServerConfig.getBasePath()"})
  void testGetBasePath_givenBdkServerConfigPortIsNull_thenReturnSchemeLocalhost() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkServerConfig bdkServerConfig = new BdkServerConfig();
    bdkServerConfig.setConnectionPoolMax(1);
    bdkServerConfig.setConnectionPoolPerRoute(1);
    bdkServerConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkServerConfig.setDefaultHeaders(defaultHeaders);
    bdkServerConfig.setHost("localhost");
    BdkProxyConfig proxy = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");
    bdkServerConfig.setProxy(proxy);
    bdkServerConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkServerConfig.setScheme("Scheme");
    bdkServerConfig.setPort(null);
    bdkServerConfig.setContext("");

    // Act and Assert
    assertEquals("Scheme://localhost", bdkServerConfig.getBasePath());
  }

  /**
   * Test {@link BdkServerConfig#getBasePath()}.
   *
   * <ul>
   *   <li>Given {@link BdkServerConfig} (default constructor).
   *   <li>Then return {@code https://null:443}.
   * </ul>
   *
   * <p>Method under test: {@link BdkServerConfig#getBasePath()}
   */
  @Test
  @DisplayName(
      "Test getBasePath(); given BdkServerConfig (default constructor); then return 'https://null:443'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BdkServerConfig.getBasePath()"})
  void testGetBasePath_givenBdkServerConfig_thenReturnHttpsNull443() {
    // Arrange, Act and Assert
    assertEquals("https://null:443", new BdkServerConfig().getBasePath());
  }

  /**
   * Test {@link BdkServerConfig#getBasePath()}.
   *
   * <ul>
   *   <li>Then return {@code Scheme://localhost:1/}.
   * </ul>
   *
   * <p>Method under test: {@link BdkServerConfig#getBasePath()}
   */
  @Test
  @DisplayName("Test getBasePath(); then return 'Scheme://localhost:1/'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BdkServerConfig.getBasePath()"})
  void testGetBasePath_thenReturnSchemeLocalhost1() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkServerConfig bdkServerConfig = new BdkServerConfig();
    bdkServerConfig.setConnectionPoolMax(1);
    bdkServerConfig.setConnectionPoolPerRoute(1);
    bdkServerConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkServerConfig.setDefaultHeaders(defaultHeaders);
    bdkServerConfig.setHost("localhost");
    BdkProxyConfig proxy = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");
    bdkServerConfig.setProxy(proxy);
    bdkServerConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkServerConfig.setScheme("Scheme");
    bdkServerConfig.setPort(1);
    bdkServerConfig.setContext("  ");

    // Act and Assert
    assertEquals("Scheme://localhost:1/  ", bdkServerConfig.getBasePath());
  }

  /**
   * Test {@link BdkServerConfig#getFormattedContext()}.
   *
   * <ul>
   *   <li>Given {@link BdkServerConfig} (default constructor) Context is {@code /Context}.
   *   <li>Then return {@code /Context}.
   * </ul>
   *
   * <p>Method under test: {@link BdkServerConfig#getFormattedContext()}
   */
  @Test
  @DisplayName(
      "Test getFormattedContext(); given BdkServerConfig (default constructor) Context is '/Context'; then return '/Context'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BdkServerConfig.getFormattedContext()"})
  void testGetFormattedContext_givenBdkServerConfigContextIsContext_thenReturnContext() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkServerConfig bdkServerConfig = new BdkServerConfig();
    bdkServerConfig.setConnectionPoolMax(1);
    bdkServerConfig.setConnectionPoolPerRoute(1);
    bdkServerConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkServerConfig.setDefaultHeaders(defaultHeaders);
    bdkServerConfig.setHost("localhost");
    bdkServerConfig.setPort(8080);
    BdkProxyConfig proxy = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");
    bdkServerConfig.setProxy(proxy);
    bdkServerConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkServerConfig.setScheme("Scheme");
    bdkServerConfig.setContext("/Context");

    // Act and Assert
    assertEquals("/Context", bdkServerConfig.getFormattedContext());
  }

  /**
   * Test {@link BdkServerConfig#getFormattedContext()}.
   *
   * <ul>
   *   <li>Given {@link BdkServerConfig} (default constructor) Context is {@code null}.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link BdkServerConfig#getFormattedContext()}
   */
  @Test
  @DisplayName(
      "Test getFormattedContext(); given BdkServerConfig (default constructor) Context is 'null'; then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BdkServerConfig.getFormattedContext()"})
  void testGetFormattedContext_givenBdkServerConfigContextIsNull_thenReturnEmptyString() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkServerConfig bdkServerConfig = new BdkServerConfig();
    bdkServerConfig.setConnectionPoolMax(1);
    bdkServerConfig.setConnectionPoolPerRoute(1);
    bdkServerConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkServerConfig.setDefaultHeaders(defaultHeaders);
    bdkServerConfig.setHost("localhost");
    bdkServerConfig.setPort(8080);
    BdkProxyConfig proxy = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");
    bdkServerConfig.setProxy(proxy);
    bdkServerConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkServerConfig.setScheme("Scheme");
    bdkServerConfig.setContext(null);

    // Act and Assert
    assertEquals("", bdkServerConfig.getFormattedContext());
  }

  /**
   * Test {@link BdkServerConfig#getFormattedContext()}.
   *
   * <ul>
   *   <li>Given {@link BdkServerConfig} (default constructor) Context is {@code /}.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link BdkServerConfig#getFormattedContext()}
   */
  @Test
  @DisplayName(
      "Test getFormattedContext(); given BdkServerConfig (default constructor) Context is '/'; then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BdkServerConfig.getFormattedContext()"})
  void testGetFormattedContext_givenBdkServerConfigContextIsSlash_thenReturnEmptyString() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkServerConfig bdkServerConfig = new BdkServerConfig();
    bdkServerConfig.setConnectionPoolMax(1);
    bdkServerConfig.setConnectionPoolPerRoute(1);
    bdkServerConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkServerConfig.setDefaultHeaders(defaultHeaders);
    bdkServerConfig.setHost("localhost");
    bdkServerConfig.setPort(8080);
    BdkProxyConfig proxy = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");
    bdkServerConfig.setProxy(proxy);
    bdkServerConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkServerConfig.setScheme("Scheme");
    bdkServerConfig.setContext("/");

    // Act and Assert
    assertEquals("", bdkServerConfig.getFormattedContext());
  }

  /**
   * Test {@link BdkServerConfig#getFormattedContext()}.
   *
   * <ul>
   *   <li>Given {@link BdkServerConfig} (default constructor) Context is space space.
   *   <li>Then return {@code /}.
   * </ul>
   *
   * <p>Method under test: {@link BdkServerConfig#getFormattedContext()}
   */
  @Test
  @DisplayName(
      "Test getFormattedContext(); given BdkServerConfig (default constructor) Context is space space; then return '/'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BdkServerConfig.getFormattedContext()"})
  void testGetFormattedContext_givenBdkServerConfigContextIsSpaceSpace_thenReturnSlash() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkServerConfig bdkServerConfig = new BdkServerConfig();
    bdkServerConfig.setConnectionPoolMax(1);
    bdkServerConfig.setConnectionPoolPerRoute(1);
    bdkServerConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkServerConfig.setDefaultHeaders(defaultHeaders);
    bdkServerConfig.setHost("localhost");
    bdkServerConfig.setPort(8080);
    BdkProxyConfig proxy = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");
    bdkServerConfig.setProxy(proxy);
    bdkServerConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkServerConfig.setScheme("Scheme");
    bdkServerConfig.setContext("  ");

    // Act and Assert
    assertEquals("/  ", bdkServerConfig.getFormattedContext());
  }

  /**
   * Test {@link BdkServerConfig#getFormattedContext()}.
   *
   * <ul>
   *   <li>Given {@link BdkServerConfig} (default constructor).
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link BdkServerConfig#getFormattedContext()}
   */
  @Test
  @DisplayName(
      "Test getFormattedContext(); given BdkServerConfig (default constructor); then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BdkServerConfig.getFormattedContext()"})
  void testGetFormattedContext_givenBdkServerConfig_thenReturnEmptyString() {
    // Arrange, Act and Assert
    assertEquals("", new BdkServerConfig().getFormattedContext());
  }

  /**
   * Test new {@link BdkServerConfig} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link BdkServerConfig}
   */
  @Test
  @DisplayName("Test new BdkServerConfig (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BdkServerConfig.<init>()"})
  void testNewBdkServerConfig() {
    // Arrange and Act
    BdkServerConfig actualBdkServerConfig = new BdkServerConfig();

    // Assert
    assertEquals("", actualBdkServerConfig.getContext());
    assertEquals("https", actualBdkServerConfig.getScheme());
    assertNull(actualBdkServerConfig.getProxy());
    assertNull(actualBdkServerConfig.getConnectionPoolMax());
    assertNull(actualBdkServerConfig.getConnectionPoolPerRoute());
    assertNull(actualBdkServerConfig.getConnectionTimeout());
    assertNull(actualBdkServerConfig.getReadTimeout());
    assertNull(actualBdkServerConfig.getHost());
    assertNull(actualBdkServerConfig.getDefaultHeaders());
    assertEquals(443, actualBdkServerConfig.getPort().intValue());
  }
}
