package com.symphony.bdk.http.webclient;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
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
   * Test new {@link ApiClientBuilderWebClient} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link ApiClientBuilderWebClient}
   */
  @Test
  @DisplayName("Test new ApiClientBuilderWebClient (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiClientBuilderWebClient.<init>()"})
  void testNewApiClientBuilderWebClient() {
    // Arrange and Act
    ApiClientBuilderWebClient actualApiClientBuilderWebClient = new ApiClientBuilderWebClient();

    // Assert
    assertEquals("", actualApiClientBuilderWebClient.basePath);
    assertNull(actualApiClientBuilderWebClient.keyStoreBytes);
    assertNull(actualApiClientBuilderWebClient.trustStoreBytes);
    assertNull(actualApiClientBuilderWebClient.keyStorePassword);
    assertNull(actualApiClientBuilderWebClient.proxyHost);
    assertNull(actualApiClientBuilderWebClient.proxyPassword);
    assertNull(actualApiClientBuilderWebClient.proxyUser);
    assertNull(actualApiClientBuilderWebClient.trustStorePassword);
    assertEquals(-1, actualApiClientBuilderWebClient.proxyPort);
    Map<String, String> stringStringMap = actualApiClientBuilderWebClient.defaultHeaders;
    assertEquals(1, stringStringMap.size());
    assertEquals(15000, actualApiClientBuilderWebClient.connectionTimeout);
    assertEquals(60000, actualApiClientBuilderWebClient.readTimeout);
    assertTrue(stringStringMap.containsKey("User-Agent"));
    assertTrue(actualApiClientBuilderWebClient.authentications.isEmpty());
  }

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
    ApiClient actualBuildResult = new ApiClientBuilderWebClient().build();

    // Assert
    assertTrue(actualBuildResult instanceof ApiClientWebClient);
    Map<String, String> stringStringMap = ((ApiClientWebClient) actualBuildResult).defaultHeaderMap;
    assertEquals(1, stringStringMap.size());
    assertTrue(((ApiClientWebClient) actualBuildResult).enforcedAuthenticationSchemes.isEmpty());
    String expectedGetResult =
        String.join("", "Symphony-BDK-Java/3.0.0 Java/", System.getProperty("java.version"));
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

    // Act and Assert
    assertSame(
        apiClientBuilderWebClient,
        apiClientBuilderWebClient.withUserAgent("https://example.org/example"));
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

    // Act and Assert
    assertSame(
        apiClientBuilderWebClient,
        apiClientBuilderWebClient.withTemporaryFolderPath("https://example.org/example"));
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

    // Act and Assert
    assertEquals(15000, apiClientBuilderWebClient.connectionTimeout);
    assertSame(apiClientBuilderWebClient, apiClientBuilderWebClient.withConnectionTimeout(null));
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

    // Act and Assert
    assertEquals(60000, apiClientBuilderWebClient.readTimeout);
    assertSame(apiClientBuilderWebClient, apiClientBuilderWebClient.withReadTimeout(null));
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
