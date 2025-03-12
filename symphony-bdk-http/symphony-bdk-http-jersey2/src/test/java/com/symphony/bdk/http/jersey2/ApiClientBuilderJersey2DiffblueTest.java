package com.symphony.bdk.http.jersey2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.http.api.ApiClient;
import com.symphony.bdk.http.api.ApiClientBuilder;
import com.symphony.bdk.http.api.auth.Authentication;
import jakarta.ws.rs.RuntimeType;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Map;
import javax.net.ssl.SSLContext;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.glassfish.jersey.apache.connector.ApacheConnectorProvider;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.JerseyClient;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ApiClientBuilderJersey2DiffblueTest {
  /**
   * Test new {@link ApiClientBuilderJersey2} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link ApiClientBuilderJersey2}
   */
  @Test
  @DisplayName("Test new ApiClientBuilderJersey2 (default constructor)")
  @Tag("MaintainedByDiffblue")
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
   * <p>
   * Method under test: {@link ApiClientBuilderJersey2#build()}
   */
  @Test
  @DisplayName("Test build()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientBuilderJersey2.build()",
      "ApiClientBuilder ApiClientBuilderJersey2.withBasePath(String)",
      "ApiClientBuilder ApiClientBuilderJersey2.withTemporaryFolderPath(String)"})
  void testBuild() {
    // Arrange and Act
    ApiClient actualBuildResult = (new ApiClientBuilderJersey2()).build();

    // Assert
    assertTrue(actualBuildResult instanceof ApiClientJersey2);
    assertTrue(((ApiClientJersey2) actualBuildResult).httpClient instanceof JerseyClient);
    assertNull(((ApiClientJersey2) actualBuildResult).tempFolderPath);
    Map<String, String> stringStringMap = ((ApiClientJersey2) actualBuildResult).defaultHeaderMap;
    assertEquals(1, stringStringMap.size());
    assertTrue(((ApiClientJersey2) actualBuildResult).enforcedAuthenticationSchemes.isEmpty());
    String expectedGetResult = String.join("", "Symphony-BDK-Java/3.0.0 Java/", System.getProperty("java.version"));
    assertEquals(expectedGetResult, stringStringMap.get("User-Agent"));
  }

  /**
   * Test {@link ApiClientBuilderJersey2#withUserAgent(String)}.
   * <p>
   * Method under test: {@link ApiClientBuilderJersey2#withUserAgent(String)}
   */
  @Test
  @DisplayName("Test withUserAgent(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClientBuilder ApiClientBuilderJersey2.withUserAgent(String)"})
  void testWithUserAgent() {
    // Arrange
    ApiClientBuilderJersey2 apiClientBuilderJersey2 = new ApiClientBuilderJersey2();

    // Act and Assert
    assertSame(apiClientBuilderJersey2, apiClientBuilderJersey2.withUserAgent("https://example.org/example"));
  }

  /**
   * Test {@link ApiClientBuilderJersey2#withDefaultHeader(String, String)}.
   * <p>
   * Method under test: {@link ApiClientBuilderJersey2#withDefaultHeader(String, String)}
   */
  @Test
  @DisplayName("Test withDefaultHeader(String, String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClientBuilder ApiClientBuilderJersey2.withDefaultHeader(String, String)"})
  void testWithDefaultHeader() {
    // Arrange
    ApiClientBuilderJersey2 apiClientBuilderJersey2 = new ApiClientBuilderJersey2();

    // Act
    ApiClientBuilder actualWithDefaultHeaderResult = apiClientBuilderJersey2
        .withDefaultHeader("https://example.org/example", "https://example.org/example");

    // Assert
    Map<String, String> stringStringMap = apiClientBuilderJersey2.defaultHeaders;
    assertEquals(2, stringStringMap.size());
    assertTrue(stringStringMap.containsKey("User-Agent"));
    assertTrue(stringStringMap.containsKey("https://example.org/example"));
    assertSame(apiClientBuilderJersey2, actualWithDefaultHeaderResult);
  }

  /**
   * Test {@link ApiClientBuilderJersey2#withConnectionTimeout(Integer)}.
   * <ul>
   *   <li>Then {@link ApiClientBuilderJersey2} (default constructor) {@link ApiClientBuilderJersey2#connectionTimeout} is {@code 15000}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientBuilderJersey2#withConnectionTimeout(Integer)}
   */
  @Test
  @DisplayName("Test withConnectionTimeout(Integer); then ApiClientBuilderJersey2 (default constructor) connectionTimeout is '15000'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClientBuilder ApiClientBuilderJersey2.withConnectionTimeout(Integer)"})
  void testWithConnectionTimeout_thenApiClientBuilderJersey2ConnectionTimeoutIs15000() {
    // Arrange
    ApiClientBuilderJersey2 apiClientBuilderJersey2 = new ApiClientBuilderJersey2();

    // Act and Assert
    assertEquals(15000, apiClientBuilderJersey2.connectionTimeout);
    assertSame(apiClientBuilderJersey2, apiClientBuilderJersey2.withConnectionTimeout(null));
  }

  /**
   * Test {@link ApiClientBuilderJersey2#withReadTimeout(Integer)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then {@link ApiClientBuilderJersey2} (default constructor) {@link ApiClientBuilderJersey2#readTimeout} is {@code 60000}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientBuilderJersey2#withReadTimeout(Integer)}
   */
  @Test
  @DisplayName("Test withReadTimeout(Integer); when 'null'; then ApiClientBuilderJersey2 (default constructor) readTimeout is '60000'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClientBuilder ApiClientBuilderJersey2.withReadTimeout(Integer)"})
  void testWithReadTimeout_whenNull_thenApiClientBuilderJersey2ReadTimeoutIs60000() {
    // Arrange
    ApiClientBuilderJersey2 apiClientBuilderJersey2 = new ApiClientBuilderJersey2();

    // Act and Assert
    assertEquals(60000, apiClientBuilderJersey2.readTimeout);
    assertSame(apiClientBuilderJersey2, apiClientBuilderJersey2.withReadTimeout(null));
  }

  /**
   * Test {@link ApiClientBuilderJersey2#withConnectionPoolMax(Integer)}.
   * <ul>
   *   <li>Then {@link ApiClientBuilderJersey2} (default constructor) {@link ApiClientBuilderJersey2#connectionPoolMax} is twenty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientBuilderJersey2#withConnectionPoolMax(Integer)}
   */
  @Test
  @DisplayName("Test withConnectionPoolMax(Integer); then ApiClientBuilderJersey2 (default constructor) connectionPoolMax is twenty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClientBuilder ApiClientBuilderJersey2.withConnectionPoolMax(Integer)"})
  void testWithConnectionPoolMax_thenApiClientBuilderJersey2ConnectionPoolMaxIsTwenty() {
    // Arrange
    ApiClientBuilderJersey2 apiClientBuilderJersey2 = new ApiClientBuilderJersey2();

    // Act and Assert
    assertEquals(20, apiClientBuilderJersey2.connectionPoolMax);
    assertSame(apiClientBuilderJersey2, apiClientBuilderJersey2.withConnectionPoolMax(null));
  }

  /**
   * Test {@link ApiClientBuilderJersey2#withConnectionPoolPerRoute(Integer)}.
   * <p>
   * Method under test: {@link ApiClientBuilderJersey2#withConnectionPoolPerRoute(Integer)}
   */
  @Test
  @DisplayName("Test withConnectionPoolPerRoute(Integer)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClientBuilder ApiClientBuilderJersey2.withConnectionPoolPerRoute(Integer)"})
  void testWithConnectionPoolPerRoute() {
    // Arrange
    ApiClientBuilderJersey2 apiClientBuilderJersey2 = new ApiClientBuilderJersey2();

    // Act and Assert
    assertEquals(20, apiClientBuilderJersey2.connectionPoolPerRoute);
    assertSame(apiClientBuilderJersey2, apiClientBuilderJersey2.withConnectionPoolPerRoute(null));
  }

  /**
   * Test {@link ApiClientBuilderJersey2#withProxy(String, int)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then {@link ApiClientBuilderJersey2} (default constructor) {@link ApiClientBuilderJersey2#proxyUrl} is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientBuilderJersey2#withProxy(String, int)}
   */
  @Test
  @DisplayName("Test withProxy(String, int); when 'null'; then ApiClientBuilderJersey2 (default constructor) proxyUrl is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClientBuilder ApiClientBuilderJersey2.withProxy(String, int)"})
  void testWithProxy_whenNull_thenApiClientBuilderJersey2ProxyUrlIsNull() {
    // Arrange
    ApiClientBuilderJersey2 apiClientBuilderJersey2 = new ApiClientBuilderJersey2();

    // Act and Assert
    assertNull(apiClientBuilderJersey2.proxyUrl);
    assertSame(apiClientBuilderJersey2, apiClientBuilderJersey2.withProxy(null, 8080));
  }

  /**
   * Test {@link ApiClientBuilderJersey2#withAuthentication(String, Authentication)}.
   * <p>
   * Method under test: {@link ApiClientBuilderJersey2#withAuthentication(String, Authentication)}
   */
  @Test
  @DisplayName("Test withAuthentication(String, Authentication)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClientBuilder ApiClientBuilderJersey2.withAuthentication(String, Authentication)"})
  void testWithAuthentication() {
    // Arrange
    ApiClientBuilderJersey2 apiClientBuilderJersey2 = new ApiClientBuilderJersey2();

    // Act
    ApiClientBuilder actualWithAuthenticationResult = apiClientBuilderJersey2
        .withAuthentication("https://example.org/example", mock(Authentication.class));

    // Assert
    Map<String, Authentication> stringAuthenticationMap = apiClientBuilderJersey2.authentications;
    assertEquals(1, stringAuthenticationMap.size());
    assertTrue(stringAuthenticationMap.containsKey("https://example.org/example"));
    assertSame(apiClientBuilderJersey2, actualWithAuthenticationResult);
  }

  /**
   * Test {@link ApiClientBuilderJersey2#createClientConfig(SSLContext)}.
   * <p>
   * Method under test: {@link ApiClientBuilderJersey2#createClientConfig(SSLContext)}
   */
  @Test
  @DisplayName("Test createClientConfig(SSLContext)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ClientConfig ApiClientBuilderJersey2.createClientConfig(SSLContext)"})
  void testCreateClientConfig() throws NoSuchAlgorithmException {
    // Arrange
    ApiClientBuilderJersey2 apiClientBuilderJersey2 = new ApiClientBuilderJersey2();
    apiClientBuilderJersey2.withProxy("https://example.org/example", 8080);

    // Act
    ClientConfig actualCreateClientConfigResult = apiClientBuilderJersey2.createClientConfig(SSLContext.getDefault());

    // Assert
    Map<String, Object> properties = actualCreateClientConfigResult.getProperties();
    assertEquals(4, properties.size());
    assertEquals("http://https://example.org/example:8080", properties.get("jersey.config.client.proxy.uri"));
    assertEquals(4, actualCreateClientConfigResult.getPropertyNames().size());
    assertTrue(properties.containsKey("jersey.config.apache.client.connectionManager"));
    assertTrue(properties.containsKey("jersey.config.client.httpUrlConnection.setMethodWorkaround"));
    assertTrue(properties.containsKey("jersey.config.client.suppressHttpComplianceValidation"));
  }

  /**
   * Test {@link ApiClientBuilderJersey2#createClientConfig(SSLContext)}.
   * <ul>
   *   <li>Then return Properties {@code jersey.config.client.proxy.uri} is {@code http://http:-1}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientBuilderJersey2#createClientConfig(SSLContext)}
   */
  @Test
  @DisplayName("Test createClientConfig(SSLContext); then return Properties 'jersey.config.client.proxy.uri' is 'http://http:-1'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ClientConfig ApiClientBuilderJersey2.createClientConfig(SSLContext)"})
  void testCreateClientConfig_thenReturnPropertiesJerseyConfigClientProxyUriIsHttpHttp1()
      throws NoSuchAlgorithmException {
    // Arrange
    ApiClientBuilderJersey2 apiClientBuilderJersey2 = new ApiClientBuilderJersey2();
    apiClientBuilderJersey2.withProxy("http", -1);

    // Act
    ClientConfig actualCreateClientConfigResult = apiClientBuilderJersey2.createClientConfig(SSLContext.getDefault());

    // Assert
    Map<String, Object> properties = actualCreateClientConfigResult.getProperties();
    assertEquals(4, properties.size());
    assertEquals("http://http:-1", properties.get("jersey.config.client.proxy.uri"));
    assertEquals(4, actualCreateClientConfigResult.getPropertyNames().size());
    assertTrue(properties.containsKey("jersey.config.apache.client.connectionManager"));
    assertTrue(properties.containsKey("jersey.config.client.httpUrlConnection.setMethodWorkaround"));
    assertTrue(properties.containsKey("jersey.config.client.suppressHttpComplianceValidation"));
  }

  /**
   * Test {@link ApiClientBuilderJersey2#createClientConfig(SSLContext)}.
   * <ul>
   *   <li>Then return Properties size is three.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientBuilderJersey2#createClientConfig(SSLContext)}
   */
  @Test
  @DisplayName("Test createClientConfig(SSLContext); then return Properties size is three")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ClientConfig ApiClientBuilderJersey2.createClientConfig(SSLContext)"})
  void testCreateClientConfig_thenReturnPropertiesSizeIsThree() throws NoSuchAlgorithmException {
    // Arrange
    ApiClientBuilderJersey2 apiClientBuilderJersey2 = new ApiClientBuilderJersey2();

    // Act
    ClientConfig actualCreateClientConfigResult = apiClientBuilderJersey2.createClientConfig(SSLContext.getDefault());

    // Assert
    Map<String, Object> properties = actualCreateClientConfigResult.getProperties();
    assertEquals(3, properties.size());
    assertTrue(
        properties.get("jersey.config.apache.client.connectionManager") instanceof PoolingHttpClientConnectionManager);
    assertTrue(actualCreateClientConfigResult.getConnectorProvider() instanceof ApacheConnectorProvider);
    assertNull(actualCreateClientConfigResult.getExecutorService());
    assertNull(actualCreateClientConfigResult.getScheduledExecutorService());
    assertNull(actualCreateClientConfigResult.getClient());
    assertNull(actualCreateClientConfigResult.getConnector());
    assertEquals(1, actualCreateClientConfigResult.getInstances().size());
    assertEquals(3, actualCreateClientConfigResult.getPropertyNames().size());
    assertEquals(3, actualCreateClientConfigResult.getClasses().size());
    assertEquals(RuntimeType.CLIENT, actualCreateClientConfigResult.getRuntimeType());
    assertTrue((Boolean) properties.get("jersey.config.client.httpUrlConnection.setMethodWorkaround"));
    assertTrue((Boolean) properties.get("jersey.config.client.suppressHttpComplianceValidation"));
  }

  /**
   * Test {@link ApiClientBuilderJersey2#configureJackson(ClientConfig)}.
   * <ul>
   *   <li>When {@link ClientConfig#ClientConfig()}.</li>
   *   <li>Then {@link ClientConfig#ClientConfig()} Classes size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientBuilderJersey2#configureJackson(ClientConfig)}
   */
  @Test
  @DisplayName("Test configureJackson(ClientConfig); when ClientConfig(); then ClientConfig() Classes size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ApiClientBuilderJersey2.configureJackson(ClientConfig)"})
  void testConfigureJackson_whenClientConfig_thenClientConfigClassesSizeIsOne() {
    // Arrange
    ApiClientBuilderJersey2 apiClientBuilderJersey2 = new ApiClientBuilderJersey2();
    ClientConfig clientConfig = new ClientConfig();

    // Act
    apiClientBuilderJersey2.configureJackson(clientConfig);

    // Assert
    assertEquals(1, clientConfig.getClasses().size());
    assertEquals(1, clientConfig.getInstances().size());
  }

  /**
   * Test {@link ApiClientBuilderJersey2#configureProxy(ClientConfig)}.
   * <ul>
   *   <li>Given {@link ClientConfig#ClientConfig()}.</li>
   *   <li>Then calls {@link ClientConfig#property(String, Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientBuilderJersey2#configureProxy(ClientConfig)}
   */
  @Test
  @DisplayName("Test configureProxy(ClientConfig); given ClientConfig(); then calls property(String, Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ApiClientBuilderJersey2.configureProxy(ClientConfig)"})
  void testConfigureProxy_givenClientConfig_thenCallsProperty() {
    // Arrange
    ApiClientBuilderJersey2 apiClientBuilderJersey2 = new ApiClientBuilderJersey2();
    ClientConfig clientConfig = mock(ClientConfig.class);
    when(clientConfig.property(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(new ClientConfig());

    // Act
    apiClientBuilderJersey2.configureProxy(clientConfig);

    // Assert
    verify(clientConfig, atLeast(1)).property(Mockito.<String>any(), isNull());
  }

  /**
   * Test {@link ApiClientBuilderJersey2#createSSLContext()}.
   * <p>
   * Method under test: {@link ApiClientBuilderJersey2#createSSLContext()}
   */
  @Test
  @DisplayName("Test createSSLContext()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SSLContext ApiClientBuilderJersey2.createSSLContext()"})
  void testCreateSSLContext() {
    // Arrange and Act
    SSLContext actualCreateSSLContextResult = (new ApiClientBuilderJersey2()).createSSLContext();

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
