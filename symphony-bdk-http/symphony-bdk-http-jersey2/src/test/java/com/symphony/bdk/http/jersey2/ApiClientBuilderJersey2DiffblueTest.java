package com.symphony.bdk.http.jersey2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.http.api.ApiClient;
import com.symphony.bdk.http.api.ApiClientBuilder;
import com.symphony.bdk.http.api.auth.Authentication;
import jakarta.ws.rs.RuntimeType;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLContext;
import org.glassfish.jersey.apache.connector.ApacheConnectorProvider;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.JerseyClient;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ApiClientBuilderJersey2DiffblueTest {
  /**
   * Test new {@link ApiClientBuilderJersey2} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link ApiClientBuilderJersey2}
   */
  @Test
  @DisplayName("Test new ApiClientBuilderJersey2 (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiClientBuilderJersey2.<init>()"})
  void testNewApiClientBuilderJersey2() {
    // Arrange and Act
    ApiClientBuilderJersey2 actualApiClientBuilderJersey2 = new ApiClientBuilderJersey2();

    // Assert
    assertEquals("https://acme.symphony.com", actualApiClientBuilderJersey2.basePath);
    assertNull(actualApiClientBuilderJersey2.keyStoreBytes);
    assertNull(actualApiClientBuilderJersey2.trustStoreBytes);
    assertNull(actualApiClientBuilderJersey2.keyStorePassword);
    assertNull(actualApiClientBuilderJersey2.proxyPassword);
    assertNull(actualApiClientBuilderJersey2.proxyUrl);
    assertNull(actualApiClientBuilderJersey2.proxyUser);
    assertNull(actualApiClientBuilderJersey2.temporaryFolderPath);
    assertNull(actualApiClientBuilderJersey2.trustStorePassword);
    Map<String, String> stringStringMap = actualApiClientBuilderJersey2.defaultHeaders;
    assertEquals(1, stringStringMap.size());
    assertEquals(15000, actualApiClientBuilderJersey2.connectionTimeout);
    assertEquals(20, actualApiClientBuilderJersey2.connectionPoolMax);
    assertEquals(20, actualApiClientBuilderJersey2.connectionPoolPerRoute);
    assertEquals(60000, actualApiClientBuilderJersey2.readTimeout);
    assertTrue(stringStringMap.containsKey("User-Agent"));
    assertTrue(actualApiClientBuilderJersey2.authentications.isEmpty());
  }

  /**
   * Test {@link ApiClientBuilderJersey2#build()}.
   *
   * <p>Method under test: {@link ApiClientBuilderJersey2#build()}
   */
  @Test
  @DisplayName("Test build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiClient ApiClientBuilderJersey2.build()",
    "ApiClientBuilder ApiClientBuilderJersey2.withBasePath(String)",
    "ApiClientBuilder ApiClientBuilderJersey2.withTemporaryFolderPath(String)"
  })
  void testBuild() {
    // Arrange and Act
    ApiClient actualApiClient = new ApiClientBuilderJersey2().build();

    // Assert
    assertTrue(actualApiClient instanceof ApiClientJersey2);
    assertTrue(((ApiClientJersey2) actualApiClient).httpClient instanceof JerseyClient);
    assertNull(((ApiClientJersey2) actualApiClient).tempFolderPath);
    Map<String, String> stringStringMap = ((ApiClientJersey2) actualApiClient).defaultHeaderMap;
    assertEquals(1, stringStringMap.size());
    assertTrue(((ApiClientJersey2) actualApiClient).enforcedAuthenticationSchemes.isEmpty());
    String expectedGetResult =
        String.join("", "Symphony-BDK-Java/3.1.1 Java/", System.getProperty("java.version"));
    assertEquals(expectedGetResult, stringStringMap.get("User-Agent"));
  }

  /**
   * Test {@link ApiClientBuilderJersey2#withUserAgent(String)}.
   *
   * <p>Method under test: {@link ApiClientBuilderJersey2#withUserAgent(String)}
   */
  @Test
  @DisplayName("Test withUserAgent(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiClientBuilder ApiClientBuilderJersey2.withUserAgent(String)"})
  void testWithUserAgent() {
    // Arrange
    ApiClientBuilderJersey2 apiClientBuilderJersey2 = new ApiClientBuilderJersey2();

    // Act
    ApiClientBuilder actualWithUserAgentResult =
        apiClientBuilderJersey2.withUserAgent("https://example.org/example");

    // Assert
    assertSame(apiClientBuilderJersey2, actualWithUserAgentResult);
  }

  /**
   * Test {@link ApiClientBuilderJersey2#withKeyStore(byte[], String)}.
   *
   * <p>Method under test: {@link ApiClientBuilderJersey2#withKeyStore(byte[], String)}
   */
  @Test
  @DisplayName("Test withKeyStore(byte[], String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiClientBuilder ApiClientBuilderJersey2.withKeyStore(byte[], String)"})
  void testWithKeyStore() throws UnsupportedEncodingException {
    // Arrange
    ApiClientBuilderJersey2 apiClientBuilderJersey2 = new ApiClientBuilderJersey2();

    // Act
    ApiClientBuilder actualWithKeyStoreResult =
        apiClientBuilderJersey2.withKeyStore(
            "AXAXAXAX".getBytes("UTF-8"), "https://example.org/example");

    // Assert
    assertEquals("https://example.org/example", apiClientBuilderJersey2.keyStorePassword);
    assertSame(apiClientBuilderJersey2, actualWithKeyStoreResult);
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), apiClientBuilderJersey2.keyStoreBytes);
  }

  /**
   * Test {@link ApiClientBuilderJersey2#withTrustStore(byte[], String)}.
   *
   * <p>Method under test: {@link ApiClientBuilderJersey2#withTrustStore(byte[], String)}
   */
  @Test
  @DisplayName("Test withTrustStore(byte[], String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiClientBuilder ApiClientBuilderJersey2.withTrustStore(byte[], String)"})
  void testWithTrustStore() throws UnsupportedEncodingException {
    // Arrange
    ApiClientBuilderJersey2 apiClientBuilderJersey2 = new ApiClientBuilderJersey2();

    // Act
    ApiClientBuilder actualWithTrustStoreResult =
        apiClientBuilderJersey2.withTrustStore(
            "AXAXAXAX".getBytes("UTF-8"), "https://example.org/example");

    // Assert
    assertEquals("https://example.org/example", apiClientBuilderJersey2.trustStorePassword);
    assertSame(apiClientBuilderJersey2, actualWithTrustStoreResult);
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), apiClientBuilderJersey2.trustStoreBytes);
  }

  /**
   * Test {@link ApiClientBuilderJersey2#withDefaultHeader(String, String)}.
   *
   * <p>Method under test: {@link ApiClientBuilderJersey2#withDefaultHeader(String, String)}
   */
  @Test
  @DisplayName("Test withDefaultHeader(String, String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiClientBuilder ApiClientBuilderJersey2.withDefaultHeader(String, String)"})
  void testWithDefaultHeader() {
    // Arrange
    ApiClientBuilderJersey2 apiClientBuilderJersey2 = new ApiClientBuilderJersey2();

    // Act
    ApiClientBuilder actualWithDefaultHeaderResult =
        apiClientBuilderJersey2.withDefaultHeader(
            "https://example.org/example", "https://example.org/example");

    // Assert
    Map<String, String> stringStringMap = apiClientBuilderJersey2.defaultHeaders;
    assertEquals(2, stringStringMap.size());
    assertTrue(stringStringMap.containsKey("User-Agent"));
    assertTrue(stringStringMap.containsKey("https://example.org/example"));
    assertSame(apiClientBuilderJersey2, actualWithDefaultHeaderResult);
  }

  /**
   * Test {@link ApiClientBuilderJersey2#withConnectionTimeout(Integer)}.
   *
   * <ul>
   *   <li>Then {@link ApiClientBuilderJersey2} (default constructor) {@link
   *       ApiClientBuilderJersey2#connectionTimeout} is {@code 15000}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientBuilderJersey2#withConnectionTimeout(Integer)}
   */
  @Test
  @DisplayName(
      "Test withConnectionTimeout(Integer); then ApiClientBuilderJersey2 (default constructor) connectionTimeout is '15000'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiClientBuilder ApiClientBuilderJersey2.withConnectionTimeout(Integer)"})
  void testWithConnectionTimeout_thenApiClientBuilderJersey2ConnectionTimeoutIs15000() {
    // Arrange
    ApiClientBuilderJersey2 apiClientBuilderJersey2 = new ApiClientBuilderJersey2();

    // Act
    ApiClientBuilder actualWithConnectionTimeoutResult =
        apiClientBuilderJersey2.withConnectionTimeout(null);

    // Assert
    assertEquals(15000, apiClientBuilderJersey2.connectionTimeout);
    assertSame(apiClientBuilderJersey2, actualWithConnectionTimeoutResult);
  }

  /**
   * Test {@link ApiClientBuilderJersey2#withConnectionTimeout(Integer)}.
   *
   * <ul>
   *   <li>Then {@link ApiClientBuilderJersey2} (default constructor) {@link
   *       ApiClientBuilderJersey2#connectionTimeout} is ten.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientBuilderJersey2#withConnectionTimeout(Integer)}
   */
  @Test
  @DisplayName(
      "Test withConnectionTimeout(Integer); then ApiClientBuilderJersey2 (default constructor) connectionTimeout is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiClientBuilder ApiClientBuilderJersey2.withConnectionTimeout(Integer)"})
  void testWithConnectionTimeout_thenApiClientBuilderJersey2ConnectionTimeoutIsTen() {
    // Arrange
    ApiClientBuilderJersey2 apiClientBuilderJersey2 = new ApiClientBuilderJersey2();

    // Act
    ApiClientBuilder actualWithConnectionTimeoutResult =
        apiClientBuilderJersey2.withConnectionTimeout(10);

    // Assert
    assertEquals(10, apiClientBuilderJersey2.connectionTimeout);
    assertSame(apiClientBuilderJersey2, actualWithConnectionTimeoutResult);
  }

  /**
   * Test {@link ApiClientBuilderJersey2#withReadTimeout(Integer)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link ApiClientBuilderJersey2} (default constructor) {@link
   *       ApiClientBuilderJersey2#readTimeout} is {@code 60000}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientBuilderJersey2#withReadTimeout(Integer)}
   */
  @Test
  @DisplayName(
      "Test withReadTimeout(Integer); when 'null'; then ApiClientBuilderJersey2 (default constructor) readTimeout is '60000'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiClientBuilder ApiClientBuilderJersey2.withReadTimeout(Integer)"})
  void testWithReadTimeout_whenNull_thenApiClientBuilderJersey2ReadTimeoutIs60000() {
    // Arrange
    ApiClientBuilderJersey2 apiClientBuilderJersey2 = new ApiClientBuilderJersey2();

    // Act
    ApiClientBuilder actualWithReadTimeoutResult = apiClientBuilderJersey2.withReadTimeout(null);

    // Assert
    assertEquals(60000, apiClientBuilderJersey2.readTimeout);
    assertSame(apiClientBuilderJersey2, actualWithReadTimeoutResult);
  }

  /**
   * Test {@link ApiClientBuilderJersey2#withReadTimeout(Integer)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then {@link ApiClientBuilderJersey2} (default constructor) {@link
   *       ApiClientBuilderJersey2#readTimeout} is ten.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientBuilderJersey2#withReadTimeout(Integer)}
   */
  @Test
  @DisplayName(
      "Test withReadTimeout(Integer); when ten; then ApiClientBuilderJersey2 (default constructor) readTimeout is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiClientBuilder ApiClientBuilderJersey2.withReadTimeout(Integer)"})
  void testWithReadTimeout_whenTen_thenApiClientBuilderJersey2ReadTimeoutIsTen() {
    // Arrange
    ApiClientBuilderJersey2 apiClientBuilderJersey2 = new ApiClientBuilderJersey2();

    // Act
    ApiClientBuilder actualWithReadTimeoutResult = apiClientBuilderJersey2.withReadTimeout(10);

    // Assert
    assertEquals(10, apiClientBuilderJersey2.readTimeout);
    assertSame(apiClientBuilderJersey2, actualWithReadTimeoutResult);
  }

  /**
   * Test {@link ApiClientBuilderJersey2#withConnectionPoolMax(Integer)}.
   *
   * <ul>
   *   <li>Then {@link ApiClientBuilderJersey2} (default constructor) {@link
   *       ApiClientBuilderJersey2#connectionPoolMax} is one.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientBuilderJersey2#withConnectionPoolMax(Integer)}
   */
  @Test
  @DisplayName(
      "Test withConnectionPoolMax(Integer); then ApiClientBuilderJersey2 (default constructor) connectionPoolMax is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiClientBuilder ApiClientBuilderJersey2.withConnectionPoolMax(Integer)"})
  void testWithConnectionPoolMax_thenApiClientBuilderJersey2ConnectionPoolMaxIsOne() {
    // Arrange
    ApiClientBuilderJersey2 apiClientBuilderJersey2 = new ApiClientBuilderJersey2();

    // Act
    ApiClientBuilder actualWithConnectionPoolMaxResult =
        apiClientBuilderJersey2.withConnectionPoolMax(1);

    // Assert
    assertEquals(1, apiClientBuilderJersey2.connectionPoolMax);
    assertSame(apiClientBuilderJersey2, actualWithConnectionPoolMaxResult);
  }

  /**
   * Test {@link ApiClientBuilderJersey2#withConnectionPoolMax(Integer)}.
   *
   * <ul>
   *   <li>Then {@link ApiClientBuilderJersey2} (default constructor) {@link
   *       ApiClientBuilderJersey2#connectionPoolMax} is twenty.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientBuilderJersey2#withConnectionPoolMax(Integer)}
   */
  @Test
  @DisplayName(
      "Test withConnectionPoolMax(Integer); then ApiClientBuilderJersey2 (default constructor) connectionPoolMax is twenty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiClientBuilder ApiClientBuilderJersey2.withConnectionPoolMax(Integer)"})
  void testWithConnectionPoolMax_thenApiClientBuilderJersey2ConnectionPoolMaxIsTwenty() {
    // Arrange
    ApiClientBuilderJersey2 apiClientBuilderJersey2 = new ApiClientBuilderJersey2();

    // Act
    ApiClientBuilder actualWithConnectionPoolMaxResult =
        apiClientBuilderJersey2.withConnectionPoolMax(null);

    // Assert
    assertEquals(20, apiClientBuilderJersey2.connectionPoolMax);
    assertSame(apiClientBuilderJersey2, actualWithConnectionPoolMaxResult);
  }

  /**
   * Test {@link ApiClientBuilderJersey2#withConnectionPoolPerRoute(Integer)}.
   *
   * <p>Method under test: {@link ApiClientBuilderJersey2#withConnectionPoolPerRoute(Integer)}
   */
  @Test
  @DisplayName("Test withConnectionPoolPerRoute(Integer)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiClientBuilder ApiClientBuilderJersey2.withConnectionPoolPerRoute(Integer)"
  })
  void testWithConnectionPoolPerRoute() {
    // Arrange
    ApiClientBuilderJersey2 apiClientBuilderJersey2 = new ApiClientBuilderJersey2();

    // Act
    ApiClientBuilder actualWithConnectionPoolPerRouteResult =
        apiClientBuilderJersey2.withConnectionPoolPerRoute(1);

    // Assert
    assertEquals(1, apiClientBuilderJersey2.connectionPoolPerRoute);
    assertSame(apiClientBuilderJersey2, actualWithConnectionPoolPerRouteResult);
  }

  /**
   * Test {@link ApiClientBuilderJersey2#withConnectionPoolPerRoute(Integer)}.
   *
   * <p>Method under test: {@link ApiClientBuilderJersey2#withConnectionPoolPerRoute(Integer)}
   */
  @Test
  @DisplayName("Test withConnectionPoolPerRoute(Integer)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiClientBuilder ApiClientBuilderJersey2.withConnectionPoolPerRoute(Integer)"
  })
  void testWithConnectionPoolPerRoute2() {
    // Arrange
    ApiClientBuilderJersey2 apiClientBuilderJersey2 = new ApiClientBuilderJersey2();

    // Act
    ApiClientBuilder actualWithConnectionPoolPerRouteResult =
        apiClientBuilderJersey2.withConnectionPoolPerRoute(null);

    // Assert
    assertEquals(20, apiClientBuilderJersey2.connectionPoolPerRoute);
    assertSame(apiClientBuilderJersey2, actualWithConnectionPoolPerRouteResult);
  }

  /**
   * Test {@link ApiClientBuilderJersey2#withProxy(String, int)}.
   *
   * <p>Method under test: {@link ApiClientBuilderJersey2#withProxy(String, int)}
   */
  @Test
  @DisplayName("Test withProxy(String, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiClientBuilder ApiClientBuilderJersey2.withProxy(String, int)"})
  void testWithProxy() {
    // Arrange
    ApiClientBuilderJersey2 apiClientBuilderJersey2 = new ApiClientBuilderJersey2();

    // Act
    ApiClientBuilder actualWithProxyResult =
        apiClientBuilderJersey2.withProxy("https://example.org/example", 8080);

    // Assert
    assertEquals("http://https://example.org/example:8080", apiClientBuilderJersey2.proxyUrl);
    assertSame(apiClientBuilderJersey2, actualWithProxyResult);
  }

  /**
   * Test {@link ApiClientBuilderJersey2#withProxy(String, int)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link ApiClientBuilderJersey2} (default constructor) {@link
   *       ApiClientBuilderJersey2#proxyUrl} is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientBuilderJersey2#withProxy(String, int)}
   */
  @Test
  @DisplayName(
      "Test withProxy(String, int); when 'null'; then ApiClientBuilderJersey2 (default constructor) proxyUrl is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiClientBuilder ApiClientBuilderJersey2.withProxy(String, int)"})
  void testWithProxy_whenNull_thenApiClientBuilderJersey2ProxyUrlIsNull() {
    // Arrange
    ApiClientBuilderJersey2 apiClientBuilderJersey2 = new ApiClientBuilderJersey2();

    // Act
    ApiClientBuilder actualWithProxyResult = apiClientBuilderJersey2.withProxy(null, 8080);

    // Assert
    assertNull(apiClientBuilderJersey2.proxyUrl);
    assertSame(apiClientBuilderJersey2, actualWithProxyResult);
  }

  /**
   * Test {@link ApiClientBuilderJersey2#withProxyCredentials(String, String)}.
   *
   * <p>Method under test: {@link ApiClientBuilderJersey2#withProxyCredentials(String, String)}
   */
  @Test
  @DisplayName("Test withProxyCredentials(String, String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiClientBuilder ApiClientBuilderJersey2.withProxyCredentials(String, String)"
  })
  void testWithProxyCredentials() {
    // Arrange
    ApiClientBuilderJersey2 apiClientBuilderJersey2 = new ApiClientBuilderJersey2();

    // Act
    ApiClientBuilder actualWithProxyCredentialsResult =
        apiClientBuilderJersey2.withProxyCredentials(
            "https://example.org/example", "https://example.org/example");

    // Assert
    assertEquals("https://example.org/example", apiClientBuilderJersey2.proxyPassword);
    assertEquals("https://example.org/example", apiClientBuilderJersey2.proxyUser);
    assertSame(apiClientBuilderJersey2, actualWithProxyCredentialsResult);
  }

  /**
   * Test {@link ApiClientBuilderJersey2#withAuthentication(String, Authentication)}.
   *
   * <p>Method under test: {@link ApiClientBuilderJersey2#withAuthentication(String,
   * Authentication)}
   */
  @Test
  @DisplayName("Test withAuthentication(String, Authentication)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiClientBuilder ApiClientBuilderJersey2.withAuthentication(String, Authentication)"
  })
  void testWithAuthentication() {
    // Arrange
    ApiClientBuilderJersey2 apiClientBuilderJersey2 = new ApiClientBuilderJersey2();

    // Act
    ApiClientBuilder actualWithAuthenticationResult =
        apiClientBuilderJersey2.withAuthentication(
            "https://example.org/example", mock(Authentication.class));

    // Assert
    Map<String, Authentication> stringAuthenticationMap = apiClientBuilderJersey2.authentications;
    assertEquals(1, stringAuthenticationMap.size());
    assertTrue(stringAuthenticationMap.containsKey("https://example.org/example"));
    assertSame(apiClientBuilderJersey2, actualWithAuthenticationResult);
  }

  /**
   * Test {@link ApiClientBuilderJersey2#createClientConfig(SSLContext)}.
   *
   * <p>Method under test: {@link ApiClientBuilderJersey2#createClientConfig(SSLContext)}
   */
  @Test
  @DisplayName("Test createClientConfig(SSLContext)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ClientConfig ApiClientBuilderJersey2.createClientConfig(SSLContext)"})
  void testCreateClientConfig() throws NoSuchAlgorithmException {
    // Arrange
    ApiClientBuilderJersey2 apiClientBuilderJersey2 = new ApiClientBuilderJersey2();
    apiClientBuilderJersey2.withProxy("https://example.org/example", 8080);

    // Act
    ClientConfig actualCreateClientConfigResult =
        apiClientBuilderJersey2.createClientConfig(SSLContext.getDefault());

    // Assert
    Map<String, Object> properties = actualCreateClientConfigResult.getProperties();
    assertEquals(4, properties.size());
    assertEquals(
        "http://https://example.org/example:8080",
        properties.get("jersey.config.client.proxy.uri"));
    assertEquals(4, actualCreateClientConfigResult.getPropertyNames().size());
    assertTrue(properties.containsKey("jersey.config.apache.client.connectionManager"));
    assertTrue(
        properties.containsKey("jersey.config.client.httpUrlConnection.setMethodWorkaround"));
    assertTrue(properties.containsKey("jersey.config.client.suppressHttpComplianceValidation"));
  }

  /**
   * Test {@link ApiClientBuilderJersey2#createClientConfig(SSLContext)}.
   *
   * <p>Method under test: {@link ApiClientBuilderJersey2#createClientConfig(SSLContext)}
   */
  @Test
  @DisplayName("Test createClientConfig(SSLContext)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ClientConfig ApiClientBuilderJersey2.createClientConfig(SSLContext)"})
  void testCreateClientConfig2() throws NoSuchAlgorithmException {
    // Arrange
    ApiClientBuilderJersey2 apiClientBuilderJersey2 = new ApiClientBuilderJersey2();
    apiClientBuilderJersey2.withConnectionTimeout(10);
    apiClientBuilderJersey2.withProxy("jersey.config.client.proxy.username", 8080);

    // Act
    ClientConfig actualCreateClientConfigResult =
        apiClientBuilderJersey2.createClientConfig(SSLContext.getDefault());

    // Assert
    Map<String, Object> properties = actualCreateClientConfigResult.getProperties();
    assertEquals(4, properties.size());
    assertEquals(
        "http://jersey.config.client.proxy.username:8080",
        properties.get("jersey.config.client.proxy.uri"));
    assertEquals(4, actualCreateClientConfigResult.getPropertyNames().size());
    assertTrue(properties.containsKey("jersey.config.apache.client.connectionManager"));
    assertTrue(
        properties.containsKey("jersey.config.client.httpUrlConnection.setMethodWorkaround"));
    assertTrue(properties.containsKey("jersey.config.client.suppressHttpComplianceValidation"));
  }

  /**
   * Test {@link ApiClientBuilderJersey2#createClientConfig(SSLContext)}.
   *
   * <ul>
   *   <li>Then ConnectorProvider return {@link ApacheConnectorProvider}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientBuilderJersey2#createClientConfig(SSLContext)}
   */
  @Test
  @DisplayName(
      "Test createClientConfig(SSLContext); then ConnectorProvider return ApacheConnectorProvider")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ClientConfig ApiClientBuilderJersey2.createClientConfig(SSLContext)"})
  void testCreateClientConfig_thenConnectorProviderReturnApacheConnectorProvider()
      throws NoSuchAlgorithmException {
    // Arrange and Act
    ClientConfig actualCreateClientConfigResult =
        new ApiClientBuilderJersey2().createClientConfig(SSLContext.getDefault());

    // Assert
    assertTrue(
        actualCreateClientConfigResult.getConnectorProvider() instanceof ApacheConnectorProvider);
    assertNull(actualCreateClientConfigResult.getExecutorService());
    assertNull(actualCreateClientConfigResult.getScheduledExecutorService());
    assertNull(actualCreateClientConfigResult.getClient());
    assertNull(actualCreateClientConfigResult.getConnector());
    assertEquals(1, actualCreateClientConfigResult.getInstances().size());
    assertEquals(3, actualCreateClientConfigResult.getPropertyNames().size());
    Map<String, Object> properties = actualCreateClientConfigResult.getProperties();
    assertEquals(3, properties.size());
    assertEquals(3, actualCreateClientConfigResult.getClasses().size());
    assertEquals(RuntimeType.CLIENT, actualCreateClientConfigResult.getRuntimeType());
    assertTrue(properties.containsKey("jersey.config.apache.client.connectionManager"));
    assertTrue(
        properties.containsKey("jersey.config.client.httpUrlConnection.setMethodWorkaround"));
    assertTrue(properties.containsKey("jersey.config.client.suppressHttpComplianceValidation"));
  }

  /**
   * Test {@link ApiClientBuilderJersey2#configureJackson(ClientConfig)}.
   *
   * <ul>
   *   <li>When {@link ClientConfig#ClientConfig()}.
   *   <li>Then {@link ClientConfig#ClientConfig()} Classes size is one.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientBuilderJersey2#configureJackson(ClientConfig)}
   */
  @Test
  @DisplayName(
      "Test configureJackson(ClientConfig); when ClientConfig(); then ClientConfig() Classes size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiClientBuilderJersey2.configureJackson(ClientConfig)"})
  void testConfigureJackson_whenClientConfig_thenClientConfigClassesSizeIsOne() {
    // Arrange
    ApiClientBuilderJersey2 apiClientBuilderJersey2 = new ApiClientBuilderJersey2();
    ClientConfig clientConfig = new ClientConfig();

    // Act
    apiClientBuilderJersey2.configureJackson(clientConfig);

    // Assert
    Set<Class<?>> classes = clientConfig.getClasses();
    assertEquals(1, classes.size());
    assertEquals(1, clientConfig.getInstances().size());
    assertTrue(classes.contains(JacksonFeature.class));
  }

  /**
   * Test {@link ApiClientBuilderJersey2#configureProxy(ClientConfig)}.
   *
   * <ul>
   *   <li>Given {@link ClientConfig#ClientConfig()}.
   *   <li>Then calls {@link ClientConfig#property(String, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientBuilderJersey2#configureProxy(ClientConfig)}
   */
  @Test
  @DisplayName(
      "Test configureProxy(ClientConfig); given ClientConfig(); then calls property(String, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiClientBuilderJersey2.configureProxy(ClientConfig)"})
  void testConfigureProxy_givenClientConfig_thenCallsProperty() {
    // Arrange
    ApiClientBuilderJersey2 apiClientBuilderJersey2 = new ApiClientBuilderJersey2();

    ClientConfig clientConfig = mock(ClientConfig.class);
    when(clientConfig.property(Mockito.<String>any(), Mockito.<Object>any()))
        .thenReturn(new ClientConfig());

    // Act
    apiClientBuilderJersey2.configureProxy(clientConfig);

    // Assert
    verify(clientConfig, atLeast(1)).property(Mockito.<String>any(), isNull());
  }

  /**
   * Test {@link ApiClientBuilderJersey2#createSSLContext()}.
   *
   * <p>Method under test: {@link ApiClientBuilderJersey2#createSSLContext()}
   */
  @Test
  @DisplayName("Test createSSLContext()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SSLContext ApiClientBuilderJersey2.createSSLContext()"})
  void testCreateSSLContext() {
    // Arrange and Act
    SSLContext actualCreateSSLContextResult = new ApiClientBuilderJersey2().createSSLContext();

    // Assert
    assertEquals("TLS", actualCreateSSLContextResult.getProtocol());
    Provider provider = actualCreateSSLContextResult.getProvider();
    assertEquals(25, provider.size());
    assertTrue(provider.containsKey("Alg.Alias.SSLContext.SSL"));
    assertTrue(provider.containsKey("Alg.Alias.SSLContext.SSLv3"));
    assertTrue(provider.containsKey("Alg.Alias.TrustManagerFactory.X.509"));
    assertTrue(provider.containsKey("KeyManagerFactory.NewSunX509"));
    assertTrue(provider.containsKey("Provider.id version"));
    assertTrue(provider.containsKey("SSLContext.DTLS"));
  }
}
