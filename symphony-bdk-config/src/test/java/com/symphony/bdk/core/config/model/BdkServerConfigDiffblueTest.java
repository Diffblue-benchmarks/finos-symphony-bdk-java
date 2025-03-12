package com.symphony.bdk.core.config.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkServerConfigDiffblueTest {
  /**
   * Test {@link BdkServerConfig#getBasePath()}.
   * <ul>
   *   <li>Given {@link BdkAgentConfig#BdkAgentConfig(BdkConfig)} with parentConfig is {@link BdkConfig} (default constructor) Context is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkServerConfig#getBasePath()}
   */
  @Test
  @DisplayName("Test getBasePath(); given BdkAgentConfig(BdkConfig) with parentConfig is BdkConfig (default constructor) Context is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String BdkServerConfig.getBasePath()"})
  void testGetBasePath_givenBdkAgentConfigWithParentConfigIsBdkConfigContextIsNull() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkAgentConfig bdkAgentConfig = new BdkAgentConfig(new BdkConfig());
    bdkAgentConfig.setConnectionPoolMax(1);
    bdkAgentConfig.setConnectionPoolPerRoute(1);
    bdkAgentConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkAgentConfig.setDefaultHeaders(defaultHeaders);
    bdkAgentConfig.setHost("localhost");
    bdkAgentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    bdkAgentConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkAgentConfig.setScheme("Scheme");
    bdkAgentConfig.setContext(null);
    bdkAgentConfig.setPort(null);

    // Act and Assert
    assertEquals("Scheme://localhost:443", bdkAgentConfig.getBasePath());
  }

  /**
   * Test {@link BdkServerConfig#getBasePath()}.
   * <ul>
   *   <li>Given {@link BdkAgentConfig#BdkAgentConfig(BdkConfig)} with parentConfig is {@link BdkConfig} (default constructor) Context is {@code /}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkServerConfig#getBasePath()}
   */
  @Test
  @DisplayName("Test getBasePath(); given BdkAgentConfig(BdkConfig) with parentConfig is BdkConfig (default constructor) Context is '/'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String BdkServerConfig.getBasePath()"})
  void testGetBasePath_givenBdkAgentConfigWithParentConfigIsBdkConfigContextIsSlash() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkAgentConfig bdkAgentConfig = new BdkAgentConfig(new BdkConfig());
    bdkAgentConfig.setConnectionPoolMax(1);
    bdkAgentConfig.setConnectionPoolPerRoute(1);
    bdkAgentConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkAgentConfig.setDefaultHeaders(defaultHeaders);
    bdkAgentConfig.setHost("localhost");
    bdkAgentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    bdkAgentConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkAgentConfig.setScheme("Scheme");
    bdkAgentConfig.setContext("/");
    bdkAgentConfig.setPort(null);

    // Act and Assert
    assertEquals("Scheme://localhost:443", bdkAgentConfig.getBasePath());
  }

  /**
   * Test {@link BdkServerConfig#getBasePath()}.
   * <ul>
   *   <li>Given {@link BdkServerConfig} (default constructor) Context is {@code foo}.</li>
   *   <li>Then return {@code Scheme://localhost/foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkServerConfig#getBasePath()}
   */
  @Test
  @DisplayName("Test getBasePath(); given BdkServerConfig (default constructor) Context is 'foo'; then return 'Scheme://localhost/foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String BdkServerConfig.getBasePath()"})
  void testGetBasePath_givenBdkServerConfigContextIsFoo_thenReturnSchemeLocalhostFoo() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkServerConfig bdkServerConfig = new BdkServerConfig();
    bdkServerConfig.setConnectionPoolMax(1);
    bdkServerConfig.setConnectionPoolPerRoute(1);
    bdkServerConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkServerConfig.setDefaultHeaders(defaultHeaders);
    bdkServerConfig.setHost("localhost");
    bdkServerConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    bdkServerConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkServerConfig.setScheme("Scheme");
    bdkServerConfig.setContext("foo");
    bdkServerConfig.setPort(null);

    // Act and Assert
    assertEquals("Scheme://localhost/foo", bdkServerConfig.getBasePath());
  }

  /**
   * Test {@link BdkServerConfig#getBasePath()}.
   * <ul>
   *   <li>Given {@link BdkServerConfig} (default constructor) Context is {@code null}.</li>
   *   <li>Then return {@code Scheme://localhost}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkServerConfig#getBasePath()}
   */
  @Test
  @DisplayName("Test getBasePath(); given BdkServerConfig (default constructor) Context is 'null'; then return 'Scheme://localhost'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String BdkServerConfig.getBasePath()"})
  void testGetBasePath_givenBdkServerConfigContextIsNull_thenReturnSchemeLocalhost() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkServerConfig bdkServerConfig = new BdkServerConfig();
    bdkServerConfig.setConnectionPoolMax(1);
    bdkServerConfig.setConnectionPoolPerRoute(1);
    bdkServerConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkServerConfig.setDefaultHeaders(defaultHeaders);
    bdkServerConfig.setHost("localhost");
    bdkServerConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    bdkServerConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkServerConfig.setScheme("Scheme");
    bdkServerConfig.setContext(null);
    bdkServerConfig.setPort(null);

    // Act and Assert
    assertEquals("Scheme://localhost", bdkServerConfig.getBasePath());
  }

  /**
   * Test {@link BdkServerConfig#getBasePath()}.
   * <ul>
   *   <li>Given {@link BdkServerConfig} (default constructor) Context is {@code /}.</li>
   *   <li>Then return {@code Scheme://localhost}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkServerConfig#getBasePath()}
   */
  @Test
  @DisplayName("Test getBasePath(); given BdkServerConfig (default constructor) Context is '/'; then return 'Scheme://localhost'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String BdkServerConfig.getBasePath()"})
  void testGetBasePath_givenBdkServerConfigContextIsSlash_thenReturnSchemeLocalhost() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkServerConfig bdkServerConfig = new BdkServerConfig();
    bdkServerConfig.setConnectionPoolMax(1);
    bdkServerConfig.setConnectionPoolPerRoute(1);
    bdkServerConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkServerConfig.setDefaultHeaders(defaultHeaders);
    bdkServerConfig.setHost("localhost");
    bdkServerConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    bdkServerConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkServerConfig.setScheme("Scheme");
    bdkServerConfig.setContext("/");
    bdkServerConfig.setPort(null);

    // Act and Assert
    assertEquals("Scheme://localhost", bdkServerConfig.getBasePath());
  }

  /**
   * Test {@link BdkServerConfig#getBasePath()}.
   * <ul>
   *   <li>Given {@link BdkServerConfig} (default constructor).</li>
   *   <li>Then return {@code https://null:443}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkServerConfig#getBasePath()}
   */
  @Test
  @DisplayName("Test getBasePath(); given BdkServerConfig (default constructor); then return 'https://null:443'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String BdkServerConfig.getBasePath()"})
  void testGetBasePath_givenBdkServerConfig_thenReturnHttpsNull443() {
    // Arrange, Act and Assert
    assertEquals("https://null:443", (new BdkServerConfig()).getBasePath());
  }

  /**
   * Test {@link BdkServerConfig#getFormattedContext()}.
   * <p>
   * Method under test: {@link BdkServerConfig#getFormattedContext()}
   */
  @Test
  @DisplayName("Test getFormattedContext()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String BdkServerConfig.getFormattedContext()"})
  void testGetFormattedContext() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkAgentConfig bdkAgentConfig = new BdkAgentConfig(new BdkConfig());
    bdkAgentConfig.setConnectionPoolMax(1);
    bdkAgentConfig.setConnectionPoolPerRoute(1);
    bdkAgentConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkAgentConfig.setDefaultHeaders(defaultHeaders);
    bdkAgentConfig.setHost("localhost");
    bdkAgentConfig.setPort(8080);
    bdkAgentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    bdkAgentConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkAgentConfig.setScheme("Scheme");
    bdkAgentConfig.setContext("/");

    // Act and Assert
    assertEquals("", bdkAgentConfig.getFormattedContext());
  }

  /**
   * Test {@link BdkServerConfig#getFormattedContext()}.
   * <ul>
   *   <li>Given {@link BdkServerConfig} (default constructor) Context is {@code foo}.</li>
   *   <li>Then return {@code /foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkServerConfig#getFormattedContext()}
   */
  @Test
  @DisplayName("Test getFormattedContext(); given BdkServerConfig (default constructor) Context is 'foo'; then return '/foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String BdkServerConfig.getFormattedContext()"})
  void testGetFormattedContext_givenBdkServerConfigContextIsFoo_thenReturnFoo() {
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
    bdkServerConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    bdkServerConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkServerConfig.setScheme("Scheme");
    bdkServerConfig.setContext("foo");

    // Act and Assert
    assertEquals("/foo", bdkServerConfig.getFormattedContext());
  }

  /**
   * Test {@link BdkServerConfig#getFormattedContext()}.
   * <ul>
   *   <li>Given {@link BdkServerConfig} (default constructor) Context is {@code null}.</li>
   *   <li>Then return empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkServerConfig#getFormattedContext()}
   */
  @Test
  @DisplayName("Test getFormattedContext(); given BdkServerConfig (default constructor) Context is 'null'; then return empty string")
  @Tag("MaintainedByDiffblue")
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
    bdkServerConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    bdkServerConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkServerConfig.setScheme("Scheme");
    bdkServerConfig.setContext(null);

    // Act and Assert
    assertEquals("", bdkServerConfig.getFormattedContext());
  }

  /**
   * Test {@link BdkServerConfig#getFormattedContext()}.
   * <ul>
   *   <li>Given {@link BdkServerConfig} (default constructor) Context is {@code /}.</li>
   *   <li>Then return empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkServerConfig#getFormattedContext()}
   */
  @Test
  @DisplayName("Test getFormattedContext(); given BdkServerConfig (default constructor) Context is '/'; then return empty string")
  @Tag("MaintainedByDiffblue")
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
    bdkServerConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    bdkServerConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    bdkServerConfig.setScheme("Scheme");
    bdkServerConfig.setContext("/");

    // Act and Assert
    assertEquals("", bdkServerConfig.getFormattedContext());
  }

  /**
   * Test {@link BdkServerConfig#getFormattedContext()}.
   * <ul>
   *   <li>Given {@link BdkServerConfig} (default constructor).</li>
   *   <li>Then return empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkServerConfig#getFormattedContext()}
   */
  @Test
  @DisplayName("Test getFormattedContext(); given BdkServerConfig (default constructor); then return empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String BdkServerConfig.getFormattedContext()"})
  void testGetFormattedContext_givenBdkServerConfig_thenReturnEmptyString() {
    // Arrange, Act and Assert
    assertEquals("", (new BdkServerConfig()).getFormattedContext());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link BdkServerConfig}
   *   <li>{@link BdkServerConfig#setConnectionPoolMax(Integer)}
   *   <li>{@link BdkServerConfig#setConnectionPoolPerRoute(Integer)}
   *   <li>{@link BdkServerConfig#setConnectionTimeout(Integer)}
   *   <li>{@link BdkServerConfig#setContext(String)}
   *   <li>{@link BdkServerConfig#setDefaultHeaders(Map)}
   *   <li>{@link BdkServerConfig#setHost(String)}
   *   <li>{@link BdkServerConfig#setPort(Integer)}
   *   <li>{@link BdkServerConfig#setProxy(BdkProxyConfig)}
   *   <li>{@link BdkServerConfig#setReadTimeout(Integer)}
   *   <li>{@link BdkServerConfig#setScheme(String)}
   *   <li>{@link BdkServerConfig#getConnectionPoolMax()}
   *   <li>{@link BdkServerConfig#getConnectionPoolPerRoute()}
   *   <li>{@link BdkServerConfig#getConnectionTimeout()}
   *   <li>{@link BdkServerConfig#getContext()}
   *   <li>{@link BdkServerConfig#getDefaultHeaders()}
   *   <li>{@link BdkServerConfig#getHost()}
   *   <li>{@link BdkServerConfig#getPort()}
   *   <li>{@link BdkServerConfig#getProxy()}
   *   <li>{@link BdkServerConfig#getReadTimeout()}
   *   <li>{@link BdkServerConfig#getScheme()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BdkServerConfig.<init>()", "Integer BdkServerConfig.getConnectionPoolMax()",
      "Integer BdkServerConfig.getConnectionPoolPerRoute()", "Integer BdkServerConfig.getConnectionTimeout()",
      "String BdkServerConfig.getContext()", "Map BdkServerConfig.getDefaultHeaders()",
      "String BdkServerConfig.getHost()", "Integer BdkServerConfig.getPort()",
      "BdkProxyConfig BdkServerConfig.getProxy()", "Integer BdkServerConfig.getReadTimeout()",
      "String BdkServerConfig.getScheme()", "void BdkServerConfig.setConnectionPoolMax(Integer)",
      "void BdkServerConfig.setConnectionPoolPerRoute(Integer)", "void BdkServerConfig.setConnectionTimeout(Integer)",
      "void BdkServerConfig.setContext(String)", "void BdkServerConfig.setDefaultHeaders(Map)",
      "void BdkServerConfig.setHost(String)", "void BdkServerConfig.setPort(Integer)",
      "void BdkServerConfig.setProxy(BdkProxyConfig)", "void BdkServerConfig.setReadTimeout(Integer)",
      "void BdkServerConfig.setScheme(String)"})
  void testGettersAndSetters() {
    // Arrange and Act
    BdkServerConfig actualBdkServerConfig = new BdkServerConfig();
    actualBdkServerConfig.setConnectionPoolMax(1);
    actualBdkServerConfig.setConnectionPoolPerRoute(1);
    actualBdkServerConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    actualBdkServerConfig.setContext("Context");
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    actualBdkServerConfig.setDefaultHeaders(defaultHeaders);
    actualBdkServerConfig.setHost("localhost");
    actualBdkServerConfig.setPort(8080);
    BdkProxyConfig proxy = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");

    actualBdkServerConfig.setProxy(proxy);
    actualBdkServerConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    actualBdkServerConfig.setScheme("Scheme");
    Integer actualConnectionPoolMax = actualBdkServerConfig.getConnectionPoolMax();
    Integer actualConnectionPoolPerRoute = actualBdkServerConfig.getConnectionPoolPerRoute();
    Integer actualConnectionTimeout = actualBdkServerConfig.getConnectionTimeout();
    String actualContext = actualBdkServerConfig.getContext();
    Map<String, String> actualDefaultHeaders = actualBdkServerConfig.getDefaultHeaders();
    String actualHost = actualBdkServerConfig.getHost();
    Integer actualPort = actualBdkServerConfig.getPort();
    BdkProxyConfig actualProxy = actualBdkServerConfig.getProxy();
    Integer actualReadTimeout = actualBdkServerConfig.getReadTimeout();

    // Assert
    assertEquals("Context", actualContext);
    assertEquals("Scheme", actualBdkServerConfig.getScheme());
    assertEquals(1, actualDefaultHeaders.size());
    assertEquals("alice.liddell@example.org", actualDefaultHeaders.get("Delivered-To"));
    assertEquals("localhost", actualHost);
    assertEquals(1, actualConnectionPoolMax.intValue());
    assertEquals(1, actualConnectionPoolPerRoute.intValue());
    assertEquals(8080, actualPort.intValue());
    assertEquals(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS, actualConnectionTimeout.intValue());
    assertEquals(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS, actualReadTimeout.intValue());
    assertSame(proxy, actualProxy);
    assertSame(defaultHeaders, actualDefaultHeaders);
  }
}
