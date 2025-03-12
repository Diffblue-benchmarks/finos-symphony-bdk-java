package com.symphony.bdk.http.api;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.http.api.HttpClient.Builder;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class HttpClientDiffblueTest {
  /**
   * Test {@link HttpClient#builder(ApiClientBuilderProvider)}.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link HttpClient#builder(ApiClientBuilderProvider)}
   *   <li>{@link HttpClient#basePath(String)}
   * </ul>
   */
  @Test
  @DisplayName("Test builder(ApiClientBuilderProvider)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void Builder.<init>(ApiClientBuilderProvider)", "Builder Builder.basePath(String)",
      "HttpClient Builder.build()"})
  void testBuilder() {
    // Arrange and Act
    Builder actualBuilderResult = HttpClient.builder(mock(ApiClientBuilderProvider.class));

    // Assert
    assertSame(actualBuilderResult, actualBuilderResult.basePath("https://example.org/example"));
  }

  /**
   * Test Builder {@link Builder#cookie(String, String)}.
   * <p>
   * Method under test: {@link Builder#cookie(String, String)}
   */
  @Test
  @DisplayName("Test Builder cookie(String, String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Builder Builder.cookie(String, String)"})
  void testBuilderCookie() {
    // Arrange
    Builder builderResult = HttpClient.builder(mock(ApiClientBuilderProvider.class));

    // Act and Assert
    assertSame(builderResult, builderResult.cookie("https://example.org/example", "https://example.org/example"));
  }

  /**
   * Test Builder {@link Builder#header(String, String)}.
   * <p>
   * Method under test: {@link Builder#header(String, String)}
   */
  @Test
  @DisplayName("Test Builder header(String, String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Builder Builder.header(String, String)"})
  void testBuilderHeader() {
    // Arrange
    Builder builderResult = HttpClient.builder(mock(ApiClientBuilderProvider.class));

    // Act and Assert
    assertSame(builderResult, builderResult.header("https://example.org/example", "https://example.org/example"));
  }

  /**
   * Test Builder {@link Builder#keyStore(byte[], String)}.
   * <p>
   * Method under test: {@link Builder#keyStore(byte[], String)}
   */
  @Test
  @DisplayName("Test Builder keyStore(byte[], String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Builder Builder.keyStore(byte[], String)"})
  void testBuilderKeyStore() throws UnsupportedEncodingException {
    // Arrange
    Builder builderResult = HttpClient.builder(mock(ApiClientBuilderProvider.class));

    // Act and Assert
    assertSame(builderResult, builderResult.keyStore("AXAXAXAX".getBytes("UTF-8"), "https://example.org/example"));
  }

  /**
   * Test Builder {@link Builder#proxy(String, int)}.
   * <p>
   * Method under test: {@link Builder#proxy(String, int)}
   */
  @Test
  @DisplayName("Test Builder proxy(String, int)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Builder Builder.proxy(String, int)"})
  void testBuilderProxy() {
    // Arrange
    Builder builderResult = HttpClient.builder(mock(ApiClientBuilderProvider.class));

    // Act and Assert
    assertSame(builderResult, builderResult.proxy("https://example.org/example", 8080));
  }

  /**
   * Test Builder {@link Builder#proxyCredentials(String, String)}.
   * <p>
   * Method under test: {@link Builder#proxyCredentials(String, String)}
   */
  @Test
  @DisplayName("Test Builder proxyCredentials(String, String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Builder Builder.proxyCredentials(String, String)"})
  void testBuilderProxyCredentials() {
    // Arrange
    Builder builderResult = HttpClient.builder(mock(ApiClientBuilderProvider.class));

    // Act and Assert
    assertSame(builderResult,
        builderResult.proxyCredentials("https://example.org/example", "https://example.org/example"));
  }

  /**
   * Test Builder {@link Builder#trustStore(byte[], String)}.
   * <p>
   * Method under test: {@link Builder#trustStore(byte[], String)}
   */
  @Test
  @DisplayName("Test Builder trustStore(byte[], String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Builder Builder.trustStore(byte[], String)"})
  void testBuilderTrustStore() throws UnsupportedEncodingException {
    // Arrange
    Builder builderResult = HttpClient.builder(mock(ApiClientBuilderProvider.class));

    // Act and Assert
    assertSame(builderResult, builderResult.trustStore("AXAXAXAX".getBytes("UTF-8"), "https://example.org/example"));
  }

  /**
   * Test {@link HttpClient#path(String)}.
   * <ul>
   *   <li>Given {@link ApiClientBuilder} {@link ApiClientBuilder#build()} return {@link ApiClient}.</li>
   *   <li>Then calls {@link ApiClientBuilder#build()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link HttpClient#path(String)}
   */
  @Test
  @DisplayName("Test path(String); given ApiClientBuilder build() return ApiClient; then calls build()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"HttpClient HttpClient.path(String)"})
  void testPath_givenApiClientBuilderBuildReturnApiClient_thenCallsBuild() {
    // Arrange
    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(mock(ApiClient.class));
    when(apiClientBuilder.withBasePath(Mockito.<String>any())).thenReturn(mock(ApiClientBuilder.class));
    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);
    HttpClient buildResult = HttpClient.builder(provider).basePath("https://example.org/example").build();

    // Act
    buildResult.path("https://example.org/example");

    // Assert
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath(eq("https://example.org/example"));
    verify(provider).newInstance();
  }

  /**
   * Test {@link HttpClient#body(Object)}.
   * <ul>
   *   <li>Given {@link ApiClientBuilder} {@link ApiClientBuilder#build()} return {@link ApiClient}.</li>
   *   <li>Then calls {@link ApiClientBuilder#build()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link HttpClient#body(Object)}
   */
  @Test
  @DisplayName("Test body(Object); given ApiClientBuilder build() return ApiClient; then calls build()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"HttpClient HttpClient.body(Object)"})
  void testBody_givenApiClientBuilderBuildReturnApiClient_thenCallsBuild() {
    // Arrange
    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(mock(ApiClient.class));
    when(apiClientBuilder.withBasePath(Mockito.<String>any())).thenReturn(mock(ApiClientBuilder.class));
    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);
    HttpClient buildResult = HttpClient.builder(provider).basePath("https://example.org/example").build();

    // Act
    buildResult.body("Body");

    // Assert
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath(eq("https://example.org/example"));
    verify(provider).newInstance();
  }

  /**
   * Test {@link HttpClient#accept(String)}.
   * <ul>
   *   <li>Given {@link ApiClientBuilder} {@link ApiClientBuilder#build()} return {@link ApiClient}.</li>
   *   <li>Then calls {@link ApiClientBuilder#build()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link HttpClient#accept(String)}
   */
  @Test
  @DisplayName("Test accept(String); given ApiClientBuilder build() return ApiClient; then calls build()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"HttpClient HttpClient.accept(String)"})
  void testAccept_givenApiClientBuilderBuildReturnApiClient_thenCallsBuild() {
    // Arrange
    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(mock(ApiClient.class));
    when(apiClientBuilder.withBasePath(Mockito.<String>any())).thenReturn(mock(ApiClientBuilder.class));
    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);
    HttpClient buildResult = HttpClient.builder(provider).basePath("https://example.org/example").build();

    // Act
    buildResult.accept("https://example.org/example");

    // Assert
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath(eq("https://example.org/example"));
    verify(provider).newInstance();
  }

  /**
   * Test {@link HttpClient#contentType(String)}.
   * <ul>
   *   <li>Given {@link ApiClientBuilder} {@link ApiClientBuilder#build()} return {@link ApiClient}.</li>
   *   <li>Then calls {@link ApiClientBuilder#build()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link HttpClient#contentType(String)}
   */
  @Test
  @DisplayName("Test contentType(String); given ApiClientBuilder build() return ApiClient; then calls build()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"HttpClient HttpClient.contentType(String)"})
  void testContentType_givenApiClientBuilderBuildReturnApiClient_thenCallsBuild() {
    // Arrange
    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(mock(ApiClient.class));
    when(apiClientBuilder.withBasePath(Mockito.<String>any())).thenReturn(mock(ApiClientBuilder.class));
    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);
    HttpClient buildResult = HttpClient.builder(provider).basePath("https://example.org/example").build();

    // Act
    buildResult.contentType("text/plain");

    // Assert
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath(eq("https://example.org/example"));
    verify(provider).newInstance();
  }
}
