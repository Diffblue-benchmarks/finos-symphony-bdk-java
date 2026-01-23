package com.symphony.bdk.http.webclient;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.http.api.ApiClient;
import com.symphony.bdk.http.api.ApiClientBuilder;
import com.symphony.bdk.http.api.auth.Authentication;
import io.netty.handler.ssl.JdkSslClientContext;
import io.netty.handler.ssl.SslContext;
import io.netty.util.DefaultAttributeMap;
import java.io.UnsupportedEncodingException;
import java.security.Provider;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import javax.net.ssl.SSLContext;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import reactor.netty.http.client.HttpClient;
import reactor.netty.transport.ProxyProvider;
import reactor.netty.transport.ProxyProvider.TypeSpec;

class ApiClientBuilderWebClientDiffblueTest {
  /**
   * Test {@link ApiClientBuilderWebClient#build()}.
   *
   * <p>Method under test: {@link ApiClientBuilderWebClient#build()}
   */
  @Test
  @DisplayName("Test build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiClient ApiClientBuilderWebClient.build()",
    "ApiClientBuilder ApiClientBuilderWebClient.withBasePath(String)"
  })
  void testBuild() {
    // Arrange and Act
    ApiClient actualApiClient = new ApiClientBuilderWebClient().build();

    // Assert
    assertTrue(actualApiClient instanceof ApiClientWebClient);
    Map<String, String> stringStringMap = ((ApiClientWebClient) actualApiClient).defaultHeaderMap;
    assertEquals(1, stringStringMap.size());
    assertTrue(((ApiClientWebClient) actualApiClient).enforcedAuthenticationSchemes.isEmpty());
    String expectedGetResult =
        String.join("", "Symphony-BDK-Java/3.1.1 Java/", System.getProperty("java.version"));
    assertEquals(expectedGetResult, stringStringMap.get("User-Agent"));
  }

  /**
   * Test {@link ApiClientBuilderWebClient#withUserAgent(String)}.
   *
   * <p>Method under test: {@link ApiClientBuilderWebClient#withUserAgent(String)}
   */
  @Test
  @DisplayName("Test withUserAgent(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiClientBuilder ApiClientBuilderWebClient.withUserAgent(String)"})
  void testWithUserAgent() {
    // Arrange
    ApiClientBuilderWebClient apiClientBuilderWebClient = new ApiClientBuilderWebClient();

    // Act
    ApiClientBuilder actualWithUserAgentResult =
        apiClientBuilderWebClient.withUserAgent("https://example.org/example");

    // Assert
    assertSame(apiClientBuilderWebClient, actualWithUserAgentResult);
  }

  /**
   * Test {@link ApiClientBuilderWebClient#withKeyStore(byte[], String)}.
   *
   * <p>Method under test: {@link ApiClientBuilderWebClient#withKeyStore(byte[], String)}
   */
  @Test
  @DisplayName("Test withKeyStore(byte[], String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiClientBuilder ApiClientBuilderWebClient.withKeyStore(byte[], String)"})
  void testWithKeyStore() throws UnsupportedEncodingException {
    // Arrange
    ApiClientBuilderWebClient apiClientBuilderWebClient = new ApiClientBuilderWebClient();

    // Act
    ApiClientBuilder actualWithKeyStoreResult =
        apiClientBuilderWebClient.withKeyStore(
            "AXAXAXAX".getBytes("UTF-8"), "https://example.org/example");

    // Assert
    assertEquals("https://example.org/example", apiClientBuilderWebClient.keyStorePassword);
    assertSame(apiClientBuilderWebClient, actualWithKeyStoreResult);
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), apiClientBuilderWebClient.keyStoreBytes);
  }

  /**
   * Test {@link ApiClientBuilderWebClient#withTrustStore(byte[], String)}.
   *
   * <p>Method under test: {@link ApiClientBuilderWebClient#withTrustStore(byte[], String)}
   */
  @Test
  @DisplayName("Test withTrustStore(byte[], String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiClientBuilder ApiClientBuilderWebClient.withTrustStore(byte[], String)"})
  void testWithTrustStore() throws UnsupportedEncodingException {
    // Arrange
    ApiClientBuilderWebClient apiClientBuilderWebClient = new ApiClientBuilderWebClient();

    // Act
    ApiClientBuilder actualWithTrustStoreResult =
        apiClientBuilderWebClient.withTrustStore(
            "AXAXAXAX".getBytes("UTF-8"), "https://example.org/example");

    // Assert
    assertEquals("https://example.org/example", apiClientBuilderWebClient.trustStorePassword);
    assertSame(apiClientBuilderWebClient, actualWithTrustStoreResult);
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), apiClientBuilderWebClient.trustStoreBytes);
  }

  /**
   * Test {@link ApiClientBuilderWebClient#withDefaultHeader(String, String)}.
   *
   * <p>Method under test: {@link ApiClientBuilderWebClient#withDefaultHeader(String, String)}
   */
  @Test
  @DisplayName("Test withDefaultHeader(String, String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiClientBuilder ApiClientBuilderWebClient.withDefaultHeader(String, String)"
  })
  void testWithDefaultHeader() {
    // Arrange
    ApiClientBuilderWebClient apiClientBuilderWebClient = new ApiClientBuilderWebClient();

    // Act
    ApiClientBuilder actualWithDefaultHeaderResult =
        apiClientBuilderWebClient.withDefaultHeader(
            "https://example.org/example", "https://example.org/example");

    // Assert
    Map<String, String> stringStringMap = apiClientBuilderWebClient.defaultHeaders;
    assertEquals(2, stringStringMap.size());
    assertTrue(stringStringMap.containsKey("User-Agent"));
    assertTrue(stringStringMap.containsKey("https://example.org/example"));
    assertSame(apiClientBuilderWebClient, actualWithDefaultHeaderResult);
  }

  /**
   * Test {@link ApiClientBuilderWebClient#withTemporaryFolderPath(String)}.
   *
   * <p>Method under test: {@link ApiClientBuilderWebClient#withTemporaryFolderPath(String)}
   */
  @Test
  @DisplayName("Test withTemporaryFolderPath(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiClientBuilder ApiClientBuilderWebClient.withTemporaryFolderPath(String)"})
  void testWithTemporaryFolderPath() {
    // Arrange
    ApiClientBuilderWebClient apiClientBuilderWebClient = new ApiClientBuilderWebClient();

    // Act
    ApiClientBuilder actualWithTemporaryFolderPathResult =
        apiClientBuilderWebClient.withTemporaryFolderPath("https://example.org/example");

    // Assert
    assertSame(apiClientBuilderWebClient, actualWithTemporaryFolderPathResult);
  }

  /**
   * Test {@link ApiClientBuilderWebClient#withConnectionTimeout(Integer)}.
   *
   * <ul>
   *   <li>Then {@link ApiClientBuilderWebClient} (default constructor) {@link
   *       ApiClientBuilderWebClient#connectionTimeout} is {@code 15000}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientBuilderWebClient#withConnectionTimeout(Integer)}
   */
  @Test
  @DisplayName(
      "Test withConnectionTimeout(Integer); then ApiClientBuilderWebClient (default constructor) connectionTimeout is '15000'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiClientBuilder ApiClientBuilderWebClient.withConnectionTimeout(Integer)"})
  void testWithConnectionTimeout_thenApiClientBuilderWebClientConnectionTimeoutIs15000() {
    // Arrange
    ApiClientBuilderWebClient apiClientBuilderWebClient = new ApiClientBuilderWebClient();

    // Act
    ApiClientBuilder actualWithConnectionTimeoutResult =
        apiClientBuilderWebClient.withConnectionTimeout(null);

    // Assert
    assertEquals(15000, apiClientBuilderWebClient.connectionTimeout);
    assertSame(apiClientBuilderWebClient, actualWithConnectionTimeoutResult);
  }

  /**
   * Test {@link ApiClientBuilderWebClient#withConnectionTimeout(Integer)}.
   *
   * <ul>
   *   <li>Then {@link ApiClientBuilderWebClient} (default constructor) {@link
   *       ApiClientBuilderWebClient#connectionTimeout} is ten.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientBuilderWebClient#withConnectionTimeout(Integer)}
   */
  @Test
  @DisplayName(
      "Test withConnectionTimeout(Integer); then ApiClientBuilderWebClient (default constructor) connectionTimeout is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiClientBuilder ApiClientBuilderWebClient.withConnectionTimeout(Integer)"})
  void testWithConnectionTimeout_thenApiClientBuilderWebClientConnectionTimeoutIsTen() {
    // Arrange
    ApiClientBuilderWebClient apiClientBuilderWebClient = new ApiClientBuilderWebClient();

    // Act
    ApiClientBuilder actualWithConnectionTimeoutResult =
        apiClientBuilderWebClient.withConnectionTimeout(10);

    // Assert
    assertEquals(10, apiClientBuilderWebClient.connectionTimeout);
    assertSame(apiClientBuilderWebClient, actualWithConnectionTimeoutResult);
  }

  /**
   * Test {@link ApiClientBuilderWebClient#withReadTimeout(Integer)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link ApiClientBuilderWebClient} (default constructor) {@link
   *       ApiClientBuilderWebClient#readTimeout} is {@code 60000}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientBuilderWebClient#withReadTimeout(Integer)}
   */
  @Test
  @DisplayName(
      "Test withReadTimeout(Integer); when 'null'; then ApiClientBuilderWebClient (default constructor) readTimeout is '60000'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiClientBuilder ApiClientBuilderWebClient.withReadTimeout(Integer)"})
  void testWithReadTimeout_whenNull_thenApiClientBuilderWebClientReadTimeoutIs60000() {
    // Arrange
    ApiClientBuilderWebClient apiClientBuilderWebClient = new ApiClientBuilderWebClient();

    // Act
    ApiClientBuilder actualWithReadTimeoutResult = apiClientBuilderWebClient.withReadTimeout(null);

    // Assert
    assertEquals(60000, apiClientBuilderWebClient.readTimeout);
    assertSame(apiClientBuilderWebClient, actualWithReadTimeoutResult);
  }

  /**
   * Test {@link ApiClientBuilderWebClient#withReadTimeout(Integer)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then {@link ApiClientBuilderWebClient} (default constructor) {@link
   *       ApiClientBuilderWebClient#readTimeout} is ten.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientBuilderWebClient#withReadTimeout(Integer)}
   */
  @Test
  @DisplayName(
      "Test withReadTimeout(Integer); when ten; then ApiClientBuilderWebClient (default constructor) readTimeout is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiClientBuilder ApiClientBuilderWebClient.withReadTimeout(Integer)"})
  void testWithReadTimeout_whenTen_thenApiClientBuilderWebClientReadTimeoutIsTen() {
    // Arrange
    ApiClientBuilderWebClient apiClientBuilderWebClient = new ApiClientBuilderWebClient();

    // Act
    ApiClientBuilder actualWithReadTimeoutResult = apiClientBuilderWebClient.withReadTimeout(10);

    // Assert
    assertEquals(10, apiClientBuilderWebClient.readTimeout);
    assertSame(apiClientBuilderWebClient, actualWithReadTimeoutResult);
  }

  /**
   * Test {@link ApiClientBuilderWebClient#withProxy(String, int)}.
   *
   * <p>Method under test: {@link ApiClientBuilderWebClient#withProxy(String, int)}
   */
  @Test
  @DisplayName("Test withProxy(String, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiClientBuilder ApiClientBuilderWebClient.withProxy(String, int)"})
  void testWithProxy() {
    // Arrange
    ApiClientBuilderWebClient apiClientBuilderWebClient = new ApiClientBuilderWebClient();

    // Act
    ApiClientBuilder actualWithProxyResult =
        apiClientBuilderWebClient.withProxy("https://example.org/example", 8080);

    // Assert
    assertEquals("https://example.org/example", apiClientBuilderWebClient.proxyHost);
    assertEquals(8080, apiClientBuilderWebClient.proxyPort);
    assertSame(apiClientBuilderWebClient, actualWithProxyResult);
  }

  /**
   * Test {@link ApiClientBuilderWebClient#withProxyCredentials(String, String)}.
   *
   * <p>Method under test: {@link ApiClientBuilderWebClient#withProxyCredentials(String, String)}
   */
  @Test
  @DisplayName("Test withProxyCredentials(String, String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiClientBuilder ApiClientBuilderWebClient.withProxyCredentials(String, String)"
  })
  void testWithProxyCredentials() {
    // Arrange
    ApiClientBuilderWebClient apiClientBuilderWebClient = new ApiClientBuilderWebClient();

    // Act
    ApiClientBuilder actualWithProxyCredentialsResult =
        apiClientBuilderWebClient.withProxyCredentials(
            "https://example.org/example", "https://example.org/example");

    // Assert
    assertEquals("https://example.org/example", apiClientBuilderWebClient.proxyPassword);
    assertEquals("https://example.org/example", apiClientBuilderWebClient.proxyUser);
    assertSame(apiClientBuilderWebClient, actualWithProxyCredentialsResult);
  }

  /**
   * Test {@link ApiClientBuilderWebClient#withAuthentication(String, Authentication)}.
   *
   * <p>Method under test: {@link ApiClientBuilderWebClient#withAuthentication(String,
   * Authentication)}
   */
  @Test
  @DisplayName("Test withAuthentication(String, Authentication)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiClientBuilder ApiClientBuilderWebClient.withAuthentication(String, Authentication)"
  })
  void testWithAuthentication() {
    // Arrange
    ApiClientBuilderWebClient apiClientBuilderWebClient = new ApiClientBuilderWebClient();

    // Act
    ApiClientBuilder actualWithAuthenticationResult =
        apiClientBuilderWebClient.withAuthentication(
            "https://example.org/example", mock(Authentication.class));

    // Assert
    Map<String, Authentication> stringAuthenticationMap = apiClientBuilderWebClient.authentications;
    assertEquals(1, stringAuthenticationMap.size());
    assertTrue(stringAuthenticationMap.containsKey("https://example.org/example"));
    assertSame(apiClientBuilderWebClient, actualWithAuthenticationResult);
  }

  /**
   * Test {@link ApiClientBuilderWebClient#createSSLContext()}.
   *
   * <p>Method under test: {@link ApiClientBuilderWebClient#createSSLContext()}
   */
  @Test
  @DisplayName("Test createSSLContext()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SslContext ApiClientBuilderWebClient.createSSLContext()"})
  void testCreateSSLContext() {
    // Arrange and Act
    SslContext actualCreateSSLContextResult = new ApiClientBuilderWebClient().createSSLContext();

    // Assert
    assertTrue(actualCreateSSLContextResult instanceof JdkSslClientContext);
    assertTrue(actualCreateSSLContextResult.attributes() instanceof DefaultAttributeMap);
    SSLContext contextResult = ((JdkSslClientContext) actualCreateSSLContextResult).context();
    assertEquals("TLS", contextResult.getProtocol());
    List<String> cipherSuitesResult = actualCreateSSLContextResult.cipherSuites();
    assertEquals(11, cipherSuitesResult.size());
    assertEquals("TLS_AES_128_GCM_SHA256", cipherSuitesResult.get(9));
    assertEquals("TLS_AES_256_GCM_SHA384", cipherSuitesResult.get(10));
    assertEquals("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", cipherSuitesResult.get(1));
    assertEquals("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", cipherSuitesResult.get(0));
    assertEquals("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", cipherSuitesResult.get(2));
    assertEquals("TLS_RSA_WITH_AES_256_CBC_SHA", cipherSuitesResult.get(8));
    Provider provider = contextResult.getProvider();
    assertEquals(25, provider.size());
    assertFalse(actualCreateSSLContextResult.isServer());
    assertTrue(actualCreateSSLContextResult.isClient());
    assertTrue(provider.containsKey("Alg.Alias.SSLContext.SSL"));
    assertTrue(provider.containsKey("Alg.Alias.SSLContext.SSLv3"));
    assertTrue(provider.containsKey("Alg.Alias.TrustManagerFactory.X.509"));
    assertTrue(provider.containsKey("KeyManagerFactory.NewSunX509"));
  }

  /**
   * Test {@link ApiClientBuilderWebClient#configureProxy(HttpClient)}.
   *
   * <ul>
   *   <li>Given {@link HttpClient}.
   *   <li>When {@link HttpClient} {@link HttpClient#proxy(Consumer)} return {@link HttpClient}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientBuilderWebClient#configureProxy(HttpClient)}
   */
  @Test
  @DisplayName(
      "Test configureProxy(HttpClient); given HttpClient; when HttpClient proxy(Consumer) return HttpClient")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HttpClient ApiClientBuilderWebClient.configureProxy(HttpClient)"})
  void testConfigureProxy_givenHttpClient_whenHttpClientProxyReturnHttpClient() {
    // Arrange
    ApiClientBuilderWebClient apiClientBuilderWebClient = new ApiClientBuilderWebClient();

    HttpClient httpClient = mock(HttpClient.class);
    when(httpClient.proxy(Mockito.<Consumer<TypeSpec>>any())).thenReturn(mock(HttpClient.class));

    // Act
    apiClientBuilderWebClient.configureProxy(httpClient);

    // Assert
    verify(httpClient).proxy(isA(Consumer.class));
  }

  /**
   * Test {@link ApiClientBuilderWebClient#configureProxy(HttpClient)}.
   *
   * <ul>
   *   <li>Given {@link RuntimeException#RuntimeException()}.
   *   <li>Then throw {@link RuntimeException}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientBuilderWebClient#configureProxy(HttpClient)}
   */
  @Test
  @DisplayName(
      "Test configureProxy(HttpClient); given RuntimeException(); then throw RuntimeException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HttpClient ApiClientBuilderWebClient.configureProxy(HttpClient)"})
  void testConfigureProxy_givenRuntimeException_thenThrowRuntimeException() {
    // Arrange
    ApiClientBuilderWebClient apiClientBuilderWebClient = new ApiClientBuilderWebClient();

    HttpClient httpClient = mock(HttpClient.class);
    when(httpClient.proxy(Mockito.<Consumer<TypeSpec>>any())).thenThrow(new RuntimeException());

    // Act and Assert
    assertThrows(
        RuntimeException.class, () -> apiClientBuilderWebClient.configureProxy(httpClient));
    verify(httpClient).proxy(isA(Consumer.class));
  }
}
