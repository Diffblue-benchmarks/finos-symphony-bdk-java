package com.symphony.bdk.http.api;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.http.api.HttpClient.Builder;
import com.symphony.bdk.http.api.util.TypeReference;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class HttpClientDiffblueTest {
  /**
   * Test {@link HttpClient#builder(ApiClientBuilderProvider)}.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link HttpClient#builder(ApiClientBuilderProvider)}
   *   <li>{@link HttpClient#basePath(String)}
   * </ul>
   */
  @Test
  @DisplayName("Test builder(ApiClientBuilderProvider)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.basePath(String)", "HttpClient Builder.build()"})
  void testBuilder() {
    // Arrange and Act
    Builder actualBuilderResult = HttpClient.builder(mock(ApiClientBuilderProvider.class));
    Builder actualBasePathResult = actualBuilderResult.basePath("https://example.org/example");

    // Assert
    assertSame(actualBuilderResult, actualBasePathResult);
  }

  /**
   * Test Builder {@link Builder#cookie(String, String)}.
   *
   * <p>Method under test: {@link Builder#cookie(String, String)}
   */
  @Test
  @DisplayName("Test Builder cookie(String, String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.cookie(String, String)"})
  void testBuilderCookie() {
    // Arrange
    Builder builderResult = HttpClient.builder(mock(ApiClientBuilderProvider.class));

    // Act
    Builder actualCookieResult =
        builderResult.cookie("https://example.org/example", "https://example.org/example");

    // Assert
    assertSame(builderResult, actualCookieResult);
  }

  /**
   * Test Builder {@link Builder#header(String, String)}.
   *
   * <p>Method under test: {@link Builder#header(String, String)}
   */
  @Test
  @DisplayName("Test Builder header(String, String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.header(String, String)"})
  void testBuilderHeader() {
    // Arrange
    Builder builderResult = HttpClient.builder(mock(ApiClientBuilderProvider.class));

    // Act
    Builder actualHeaderResult =
        builderResult.header("https://example.org/example", "https://example.org/example");

    // Assert
    assertSame(builderResult, actualHeaderResult);
  }

  /**
   * Test Builder {@link Builder#keyStore(byte[], String)}.
   *
   * <p>Method under test: {@link Builder#keyStore(byte[], String)}
   */
  @Test
  @DisplayName("Test Builder keyStore(byte[], String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.keyStore(byte[], String)"})
  void testBuilderKeyStore() throws UnsupportedEncodingException {
    // Arrange
    Builder builderResult = HttpClient.builder(mock(ApiClientBuilderProvider.class));

    // Act
    Builder actualKeyStoreResult =
        builderResult.keyStore("AXAXAXAX".getBytes("UTF-8"), "https://example.org/example");

    // Assert
    assertSame(builderResult, actualKeyStoreResult);
  }

  /**
   * Test Builder {@link Builder#proxy(String, int)}.
   *
   * <p>Method under test: {@link Builder#proxy(String, int)}
   */
  @Test
  @DisplayName("Test Builder proxy(String, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.proxy(String, int)"})
  void testBuilderProxy() {
    // Arrange
    Builder builderResult = HttpClient.builder(mock(ApiClientBuilderProvider.class));

    // Act
    Builder actualProxyResult = builderResult.proxy("https://example.org/example", 8080);

    // Assert
    assertSame(builderResult, actualProxyResult);
  }

  /**
   * Test Builder {@link Builder#proxyCredentials(String, String)}.
   *
   * <p>Method under test: {@link Builder#proxyCredentials(String, String)}
   */
  @Test
  @DisplayName("Test Builder proxyCredentials(String, String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.proxyCredentials(String, String)"})
  void testBuilderProxyCredentials() {
    // Arrange
    Builder builderResult = HttpClient.builder(mock(ApiClientBuilderProvider.class));

    // Act
    Builder actualProxyCredentialsResult =
        builderResult.proxyCredentials(
            "https://example.org/example", "https://example.org/example");

    // Assert
    assertSame(builderResult, actualProxyCredentialsResult);
  }

  /**
   * Test Builder {@link Builder#trustStore(byte[], String)}.
   *
   * <p>Method under test: {@link Builder#trustStore(byte[], String)}
   */
  @Test
  @DisplayName("Test Builder trustStore(byte[], String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.trustStore(byte[], String)"})
  void testBuilderTrustStore() throws UnsupportedEncodingException {
    // Arrange
    Builder builderResult = HttpClient.builder(mock(ApiClientBuilderProvider.class));

    // Act
    Builder actualTrustStoreResult =
        builderResult.trustStore("AXAXAXAX".getBytes("UTF-8"), "https://example.org/example");

    // Assert
    assertSame(builderResult, actualTrustStoreResult);
  }

  /**
   * Test {@link HttpClient#method(String, TypeReference)}.
   *
   * <p>Method under test: {@link HttpClient#method(String, TypeReference)}
   */
  @Test
  @DisplayName("Test method(String, TypeReference)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object HttpClient.method(String, TypeReference)"})
  void testMethod() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    ApiResponse<Object> apiResponse = new ApiResponse<>(1, new HashMap<>());
    when(apiClient.invokeAPI(
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<List<Pair>>any(),
            Mockito.<Object>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, Object>>any(),
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<String[]>any(),
            Mockito.<TypeReference<Object>>any()))
        .thenReturn(apiResponse);

    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(apiClient);
    when(apiClientBuilder.withBasePath(Mockito.<String>any()))
        .thenReturn(mock(ApiClientBuilder.class));

    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);

    // Act
    Object actualMethodResult =
        HttpClient.builder(provider)
            .basePath("https://example.org/example")
            .build()
            .method("https://example.org/example", mock(TypeReference.class));

    // Assert
    verify(apiClient)
        .invokeAPI(
            isNull(),
            eq("https://example.org/example"),
            isNull(),
            isNull(),
            isA(Map.class),
            isA(Map.class),
            isA(Map.class),
            isNull(),
            eq("application/json"),
            isA(String[].class),
            isA(TypeReference.class));
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath("https://example.org/example");
    verify(provider).newInstance();
    assertNull(actualMethodResult);
  }

  /**
   * Test {@link HttpClient#method(String, TypeReference)}.
   *
   * <ul>
   *   <li>Given {@link ApiClient} {@link ApiClient#invokeAPI(String, String, List, Object, Map,
   *       Map, Map, String, String, String[], TypeReference)} return {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link HttpClient#method(String, TypeReference)}
   */
  @Test
  @DisplayName(
      "Test method(String, TypeReference); given ApiClient invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference) return 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object HttpClient.method(String, TypeReference)"})
  void testMethod_givenApiClientInvokeAPIReturnNull_thenReturnNull() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    when(apiClient.invokeAPI(
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<List<Pair>>any(),
            Mockito.<Object>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, Object>>any(),
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<String[]>any(),
            Mockito.<TypeReference<Object>>any()))
        .thenReturn(null);

    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(apiClient);
    when(apiClientBuilder.withBasePath(Mockito.<String>any()))
        .thenReturn(mock(ApiClientBuilder.class));

    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);

    // Act
    Object actualMethodResult =
        HttpClient.builder(provider)
            .basePath("https://example.org/example")
            .build()
            .method("https://example.org/example", mock(TypeReference.class));

    // Assert
    verify(apiClient)
        .invokeAPI(
            isNull(),
            eq("https://example.org/example"),
            isNull(),
            isNull(),
            isA(Map.class),
            isA(Map.class),
            isA(Map.class),
            isNull(),
            eq("application/json"),
            isA(String[].class),
            isA(TypeReference.class));
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath("https://example.org/example");
    verify(provider).newInstance();
    assertNull(actualMethodResult);
  }

  /**
   * Test {@link HttpClient#method(String, TypeReference)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link HttpClient#method(String, TypeReference)}
   */
  @Test
  @DisplayName("Test method(String, TypeReference); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object HttpClient.method(String, TypeReference)"})
  void testMethod_thenThrowApiException() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    when(apiClient.invokeAPI(
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<List<Pair>>any(),
            Mockito.<Object>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, Object>>any(),
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<String[]>any(),
            Mockito.<TypeReference<Object>>any()))
        .thenThrow(new ApiException(11, "https://example.org/example"));

    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(apiClient);
    when(apiClientBuilder.withBasePath(Mockito.<String>any()))
        .thenReturn(mock(ApiClientBuilder.class));

    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            HttpClient.builder(provider)
                .basePath("https://example.org/example")
                .build()
                .method("https://example.org/example", mock(TypeReference.class)));
    verify(apiClient)
        .invokeAPI(
            isNull(),
            eq("https://example.org/example"),
            isNull(),
            isNull(),
            isA(Map.class),
            isA(Map.class),
            isA(Map.class),
            isNull(),
            eq("application/json"),
            isA(String[].class),
            isA(TypeReference.class));
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath("https://example.org/example");
    verify(provider).newInstance();
  }

  /**
   * Test {@link HttpClient#get(TypeReference)}.
   *
   * <p>Method under test: {@link HttpClient#get(TypeReference)}
   */
  @Test
  @DisplayName("Test get(TypeReference)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object HttpClient.get(TypeReference)"})
  void testGet() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    ApiResponse<Object> apiResponse = new ApiResponse<>(1, new HashMap<>());
    when(apiClient.invokeAPI(
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<List<Pair>>any(),
            Mockito.<Object>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, Object>>any(),
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<String[]>any(),
            Mockito.<TypeReference<Object>>any()))
        .thenReturn(apiResponse);

    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(apiClient);
    when(apiClientBuilder.withBasePath(Mockito.<String>any()))
        .thenReturn(mock(ApiClientBuilder.class));

    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);

    // Act
    Object actualGetResult =
        HttpClient.builder(provider)
            .basePath("https://example.org/example")
            .build()
            .get(mock(TypeReference.class));

    // Assert
    verify(apiClient)
        .invokeAPI(
            isNull(),
            eq("GET"),
            isNull(),
            isNull(),
            isA(Map.class),
            isA(Map.class),
            isA(Map.class),
            isNull(),
            eq("application/json"),
            isA(String[].class),
            isA(TypeReference.class));
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath("https://example.org/example");
    verify(provider).newInstance();
    assertNull(actualGetResult);
  }

  /**
   * Test {@link HttpClient#get(TypeReference)}.
   *
   * <ul>
   *   <li>Given {@link ApiClient} {@link ApiClient#invokeAPI(String, String, List, Object, Map,
   *       Map, Map, String, String, String[], TypeReference)} return {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link HttpClient#get(TypeReference)}
   */
  @Test
  @DisplayName(
      "Test get(TypeReference); given ApiClient invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference) return 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object HttpClient.get(TypeReference)"})
  void testGet_givenApiClientInvokeAPIReturnNull_thenReturnNull() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    when(apiClient.invokeAPI(
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<List<Pair>>any(),
            Mockito.<Object>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, Object>>any(),
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<String[]>any(),
            Mockito.<TypeReference<Object>>any()))
        .thenReturn(null);

    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(apiClient);
    when(apiClientBuilder.withBasePath(Mockito.<String>any()))
        .thenReturn(mock(ApiClientBuilder.class));

    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);

    // Act
    Object actualGetResult =
        HttpClient.builder(provider)
            .basePath("https://example.org/example")
            .build()
            .get(mock(TypeReference.class));

    // Assert
    verify(apiClient)
        .invokeAPI(
            isNull(),
            eq("GET"),
            isNull(),
            isNull(),
            isA(Map.class),
            isA(Map.class),
            isA(Map.class),
            isNull(),
            eq("application/json"),
            isA(String[].class),
            isA(TypeReference.class));
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath("https://example.org/example");
    verify(provider).newInstance();
    assertNull(actualGetResult);
  }

  /**
   * Test {@link HttpClient#get(TypeReference)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link HttpClient#get(TypeReference)}
   */
  @Test
  @DisplayName("Test get(TypeReference); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object HttpClient.get(TypeReference)"})
  void testGet_thenThrowApiException() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    when(apiClient.invokeAPI(
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<List<Pair>>any(),
            Mockito.<Object>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, Object>>any(),
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<String[]>any(),
            Mockito.<TypeReference<Object>>any()))
        .thenThrow(new ApiException(11, "https://example.org/example"));

    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(apiClient);
    when(apiClientBuilder.withBasePath(Mockito.<String>any()))
        .thenReturn(mock(ApiClientBuilder.class));

    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            HttpClient.builder(provider)
                .basePath("https://example.org/example")
                .build()
                .get(mock(TypeReference.class)));
    verify(apiClient)
        .invokeAPI(
            isNull(),
            eq("GET"),
            isNull(),
            isNull(),
            isA(Map.class),
            isA(Map.class),
            isA(Map.class),
            isNull(),
            eq("application/json"),
            isA(String[].class),
            isA(TypeReference.class));
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath("https://example.org/example");
    verify(provider).newInstance();
  }

  /**
   * Test {@link HttpClient#post(TypeReference)}.
   *
   * <p>Method under test: {@link HttpClient#post(TypeReference)}
   */
  @Test
  @DisplayName("Test post(TypeReference)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object HttpClient.post(TypeReference)"})
  void testPost() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    ApiResponse<Object> apiResponse = new ApiResponse<>(1, new HashMap<>());
    when(apiClient.invokeAPI(
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<List<Pair>>any(),
            Mockito.<Object>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, Object>>any(),
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<String[]>any(),
            Mockito.<TypeReference<Object>>any()))
        .thenReturn(apiResponse);

    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(apiClient);
    when(apiClientBuilder.withBasePath(Mockito.<String>any()))
        .thenReturn(mock(ApiClientBuilder.class));

    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);

    // Act
    Object actualPostResult =
        HttpClient.builder(provider)
            .basePath("https://example.org/example")
            .build()
            .post(mock(TypeReference.class));

    // Assert
    verify(apiClient)
        .invokeAPI(
            isNull(),
            eq("POST"),
            isNull(),
            isNull(),
            isA(Map.class),
            isA(Map.class),
            isA(Map.class),
            isNull(),
            eq("application/json"),
            isA(String[].class),
            isA(TypeReference.class));
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath("https://example.org/example");
    verify(provider).newInstance();
    assertNull(actualPostResult);
  }

  /**
   * Test {@link HttpClient#post(TypeReference)}.
   *
   * <ul>
   *   <li>Given {@link ApiClient} {@link ApiClient#invokeAPI(String, String, List, Object, Map,
   *       Map, Map, String, String, String[], TypeReference)} return {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link HttpClient#post(TypeReference)}
   */
  @Test
  @DisplayName(
      "Test post(TypeReference); given ApiClient invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference) return 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object HttpClient.post(TypeReference)"})
  void testPost_givenApiClientInvokeAPIReturnNull_thenReturnNull() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    when(apiClient.invokeAPI(
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<List<Pair>>any(),
            Mockito.<Object>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, Object>>any(),
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<String[]>any(),
            Mockito.<TypeReference<Object>>any()))
        .thenReturn(null);

    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(apiClient);
    when(apiClientBuilder.withBasePath(Mockito.<String>any()))
        .thenReturn(mock(ApiClientBuilder.class));

    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);

    // Act
    Object actualPostResult =
        HttpClient.builder(provider)
            .basePath("https://example.org/example")
            .build()
            .post(mock(TypeReference.class));

    // Assert
    verify(apiClient)
        .invokeAPI(
            isNull(),
            eq("POST"),
            isNull(),
            isNull(),
            isA(Map.class),
            isA(Map.class),
            isA(Map.class),
            isNull(),
            eq("application/json"),
            isA(String[].class),
            isA(TypeReference.class));
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath("https://example.org/example");
    verify(provider).newInstance();
    assertNull(actualPostResult);
  }

  /**
   * Test {@link HttpClient#post(TypeReference)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link HttpClient#post(TypeReference)}
   */
  @Test
  @DisplayName("Test post(TypeReference); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object HttpClient.post(TypeReference)"})
  void testPost_thenThrowApiException() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    when(apiClient.invokeAPI(
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<List<Pair>>any(),
            Mockito.<Object>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, Object>>any(),
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<String[]>any(),
            Mockito.<TypeReference<Object>>any()))
        .thenThrow(new ApiException(11, "https://example.org/example"));

    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(apiClient);
    when(apiClientBuilder.withBasePath(Mockito.<String>any()))
        .thenReturn(mock(ApiClientBuilder.class));

    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            HttpClient.builder(provider)
                .basePath("https://example.org/example")
                .build()
                .post(mock(TypeReference.class)));
    verify(apiClient)
        .invokeAPI(
            isNull(),
            eq("POST"),
            isNull(),
            isNull(),
            isA(Map.class),
            isA(Map.class),
            isA(Map.class),
            isNull(),
            eq("application/json"),
            isA(String[].class),
            isA(TypeReference.class));
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath("https://example.org/example");
    verify(provider).newInstance();
  }

  /**
   * Test {@link HttpClient#put(TypeReference)}.
   *
   * <p>Method under test: {@link HttpClient#put(TypeReference)}
   */
  @Test
  @DisplayName("Test put(TypeReference)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object HttpClient.put(TypeReference)"})
  void testPut() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    ApiResponse<Object> apiResponse = new ApiResponse<>(1, new HashMap<>());
    when(apiClient.invokeAPI(
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<List<Pair>>any(),
            Mockito.<Object>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, Object>>any(),
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<String[]>any(),
            Mockito.<TypeReference<Object>>any()))
        .thenReturn(apiResponse);

    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(apiClient);
    when(apiClientBuilder.withBasePath(Mockito.<String>any()))
        .thenReturn(mock(ApiClientBuilder.class));

    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);

    // Act
    Object actualPutResult =
        HttpClient.builder(provider)
            .basePath("https://example.org/example")
            .build()
            .put(mock(TypeReference.class));

    // Assert
    verify(apiClient)
        .invokeAPI(
            isNull(),
            eq("PUT"),
            isNull(),
            isNull(),
            isA(Map.class),
            isA(Map.class),
            isA(Map.class),
            isNull(),
            eq("application/json"),
            isA(String[].class),
            isA(TypeReference.class));
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath("https://example.org/example");
    verify(provider).newInstance();
    assertNull(actualPutResult);
  }

  /**
   * Test {@link HttpClient#put(TypeReference)}.
   *
   * <ul>
   *   <li>Given {@link ApiClient} {@link ApiClient#invokeAPI(String, String, List, Object, Map,
   *       Map, Map, String, String, String[], TypeReference)} return {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link HttpClient#put(TypeReference)}
   */
  @Test
  @DisplayName(
      "Test put(TypeReference); given ApiClient invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference) return 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object HttpClient.put(TypeReference)"})
  void testPut_givenApiClientInvokeAPIReturnNull_thenReturnNull() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    when(apiClient.invokeAPI(
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<List<Pair>>any(),
            Mockito.<Object>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, Object>>any(),
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<String[]>any(),
            Mockito.<TypeReference<Object>>any()))
        .thenReturn(null);

    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(apiClient);
    when(apiClientBuilder.withBasePath(Mockito.<String>any()))
        .thenReturn(mock(ApiClientBuilder.class));

    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);

    // Act
    Object actualPutResult =
        HttpClient.builder(provider)
            .basePath("https://example.org/example")
            .build()
            .put(mock(TypeReference.class));

    // Assert
    verify(apiClient)
        .invokeAPI(
            isNull(),
            eq("PUT"),
            isNull(),
            isNull(),
            isA(Map.class),
            isA(Map.class),
            isA(Map.class),
            isNull(),
            eq("application/json"),
            isA(String[].class),
            isA(TypeReference.class));
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath("https://example.org/example");
    verify(provider).newInstance();
    assertNull(actualPutResult);
  }

  /**
   * Test {@link HttpClient#put(TypeReference)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link HttpClient#put(TypeReference)}
   */
  @Test
  @DisplayName("Test put(TypeReference); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object HttpClient.put(TypeReference)"})
  void testPut_thenThrowApiException() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    when(apiClient.invokeAPI(
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<List<Pair>>any(),
            Mockito.<Object>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, Object>>any(),
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<String[]>any(),
            Mockito.<TypeReference<Object>>any()))
        .thenThrow(new ApiException(11, "https://example.org/example"));

    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(apiClient);
    when(apiClientBuilder.withBasePath(Mockito.<String>any()))
        .thenReturn(mock(ApiClientBuilder.class));

    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            HttpClient.builder(provider)
                .basePath("https://example.org/example")
                .build()
                .put(mock(TypeReference.class)));
    verify(apiClient)
        .invokeAPI(
            isNull(),
            eq("PUT"),
            isNull(),
            isNull(),
            isA(Map.class),
            isA(Map.class),
            isA(Map.class),
            isNull(),
            eq("application/json"),
            isA(String[].class),
            isA(TypeReference.class));
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath("https://example.org/example");
    verify(provider).newInstance();
  }

  /**
   * Test {@link HttpClient#patch(TypeReference)}.
   *
   * <p>Method under test: {@link HttpClient#patch(TypeReference)}
   */
  @Test
  @DisplayName("Test patch(TypeReference)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object HttpClient.patch(TypeReference)"})
  void testPatch() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    ApiResponse<Object> apiResponse = new ApiResponse<>(1, new HashMap<>());
    when(apiClient.invokeAPI(
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<List<Pair>>any(),
            Mockito.<Object>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, Object>>any(),
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<String[]>any(),
            Mockito.<TypeReference<Object>>any()))
        .thenReturn(apiResponse);

    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(apiClient);
    when(apiClientBuilder.withBasePath(Mockito.<String>any()))
        .thenReturn(mock(ApiClientBuilder.class));

    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);

    // Act
    Object actualPatchResult =
        HttpClient.builder(provider)
            .basePath("https://example.org/example")
            .build()
            .patch(mock(TypeReference.class));

    // Assert
    verify(apiClient)
        .invokeAPI(
            isNull(),
            eq("PATCH"),
            isNull(),
            isNull(),
            isA(Map.class),
            isA(Map.class),
            isA(Map.class),
            isNull(),
            eq("application/json"),
            isA(String[].class),
            isA(TypeReference.class));
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath("https://example.org/example");
    verify(provider).newInstance();
    assertNull(actualPatchResult);
  }

  /**
   * Test {@link HttpClient#patch(TypeReference)}.
   *
   * <ul>
   *   <li>Given {@link ApiClient} {@link ApiClient#invokeAPI(String, String, List, Object, Map,
   *       Map, Map, String, String, String[], TypeReference)} return {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link HttpClient#patch(TypeReference)}
   */
  @Test
  @DisplayName(
      "Test patch(TypeReference); given ApiClient invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference) return 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object HttpClient.patch(TypeReference)"})
  void testPatch_givenApiClientInvokeAPIReturnNull_thenReturnNull() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    when(apiClient.invokeAPI(
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<List<Pair>>any(),
            Mockito.<Object>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, Object>>any(),
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<String[]>any(),
            Mockito.<TypeReference<Object>>any()))
        .thenReturn(null);

    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(apiClient);
    when(apiClientBuilder.withBasePath(Mockito.<String>any()))
        .thenReturn(mock(ApiClientBuilder.class));

    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);

    // Act
    Object actualPatchResult =
        HttpClient.builder(provider)
            .basePath("https://example.org/example")
            .build()
            .patch(mock(TypeReference.class));

    // Assert
    verify(apiClient)
        .invokeAPI(
            isNull(),
            eq("PATCH"),
            isNull(),
            isNull(),
            isA(Map.class),
            isA(Map.class),
            isA(Map.class),
            isNull(),
            eq("application/json"),
            isA(String[].class),
            isA(TypeReference.class));
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath("https://example.org/example");
    verify(provider).newInstance();
    assertNull(actualPatchResult);
  }

  /**
   * Test {@link HttpClient#patch(TypeReference)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link HttpClient#patch(TypeReference)}
   */
  @Test
  @DisplayName("Test patch(TypeReference); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object HttpClient.patch(TypeReference)"})
  void testPatch_thenThrowApiException() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    when(apiClient.invokeAPI(
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<List<Pair>>any(),
            Mockito.<Object>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, Object>>any(),
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<String[]>any(),
            Mockito.<TypeReference<Object>>any()))
        .thenThrow(new ApiException(11, "https://example.org/example"));

    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(apiClient);
    when(apiClientBuilder.withBasePath(Mockito.<String>any()))
        .thenReturn(mock(ApiClientBuilder.class));

    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            HttpClient.builder(provider)
                .basePath("https://example.org/example")
                .build()
                .patch(mock(TypeReference.class)));
    verify(apiClient)
        .invokeAPI(
            isNull(),
            eq("PATCH"),
            isNull(),
            isNull(),
            isA(Map.class),
            isA(Map.class),
            isA(Map.class),
            isNull(),
            eq("application/json"),
            isA(String[].class),
            isA(TypeReference.class));
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath("https://example.org/example");
    verify(provider).newInstance();
  }

  /**
   * Test {@link HttpClient#delete(TypeReference)}.
   *
   * <p>Method under test: {@link HttpClient#delete(TypeReference)}
   */
  @Test
  @DisplayName("Test delete(TypeReference)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object HttpClient.delete(TypeReference)"})
  void testDelete() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    ApiResponse<Object> apiResponse = new ApiResponse<>(1, new HashMap<>());
    when(apiClient.invokeAPI(
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<List<Pair>>any(),
            Mockito.<Object>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, Object>>any(),
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<String[]>any(),
            Mockito.<TypeReference<Object>>any()))
        .thenReturn(apiResponse);

    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(apiClient);
    when(apiClientBuilder.withBasePath(Mockito.<String>any()))
        .thenReturn(mock(ApiClientBuilder.class));

    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);

    // Act
    Object actualDeleteResult =
        HttpClient.builder(provider)
            .basePath("https://example.org/example")
            .build()
            .delete(mock(TypeReference.class));

    // Assert
    verify(apiClient)
        .invokeAPI(
            isNull(),
            eq("DELETE"),
            isNull(),
            isNull(),
            isA(Map.class),
            isA(Map.class),
            isA(Map.class),
            isNull(),
            eq("application/json"),
            isA(String[].class),
            isA(TypeReference.class));
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath("https://example.org/example");
    verify(provider).newInstance();
    assertNull(actualDeleteResult);
  }

  /**
   * Test {@link HttpClient#delete(TypeReference)}.
   *
   * <ul>
   *   <li>Given {@link ApiClient} {@link ApiClient#invokeAPI(String, String, List, Object, Map,
   *       Map, Map, String, String, String[], TypeReference)} return {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link HttpClient#delete(TypeReference)}
   */
  @Test
  @DisplayName(
      "Test delete(TypeReference); given ApiClient invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference) return 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object HttpClient.delete(TypeReference)"})
  void testDelete_givenApiClientInvokeAPIReturnNull_thenReturnNull() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    when(apiClient.invokeAPI(
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<List<Pair>>any(),
            Mockito.<Object>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, Object>>any(),
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<String[]>any(),
            Mockito.<TypeReference<Object>>any()))
        .thenReturn(null);

    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(apiClient);
    when(apiClientBuilder.withBasePath(Mockito.<String>any()))
        .thenReturn(mock(ApiClientBuilder.class));

    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);

    // Act
    Object actualDeleteResult =
        HttpClient.builder(provider)
            .basePath("https://example.org/example")
            .build()
            .delete(mock(TypeReference.class));

    // Assert
    verify(apiClient)
        .invokeAPI(
            isNull(),
            eq("DELETE"),
            isNull(),
            isNull(),
            isA(Map.class),
            isA(Map.class),
            isA(Map.class),
            isNull(),
            eq("application/json"),
            isA(String[].class),
            isA(TypeReference.class));
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath("https://example.org/example");
    verify(provider).newInstance();
    assertNull(actualDeleteResult);
  }

  /**
   * Test {@link HttpClient#delete(TypeReference)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link HttpClient#delete(TypeReference)}
   */
  @Test
  @DisplayName("Test delete(TypeReference); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object HttpClient.delete(TypeReference)"})
  void testDelete_thenThrowApiException() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    when(apiClient.invokeAPI(
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<List<Pair>>any(),
            Mockito.<Object>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, Object>>any(),
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<String[]>any(),
            Mockito.<TypeReference<Object>>any()))
        .thenThrow(new ApiException(11, "https://example.org/example"));

    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(apiClient);
    when(apiClientBuilder.withBasePath(Mockito.<String>any()))
        .thenReturn(mock(ApiClientBuilder.class));

    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            HttpClient.builder(provider)
                .basePath("https://example.org/example")
                .build()
                .delete(mock(TypeReference.class)));
    verify(apiClient)
        .invokeAPI(
            isNull(),
            eq("DELETE"),
            isNull(),
            isNull(),
            isA(Map.class),
            isA(Map.class),
            isA(Map.class),
            isNull(),
            eq("application/json"),
            isA(String[].class),
            isA(TypeReference.class));
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath("https://example.org/example");
    verify(provider).newInstance();
  }

  /**
   * Test {@link HttpClient#path(String)}.
   *
   * <ul>
   *   <li>Given {@link ApiClientBuilder} {@link ApiClientBuilder#build()} return {@link ApiClient}.
   *   <li>Then calls {@link ApiClientBuilder#build()}.
   * </ul>
   *
   * <p>Method under test: {@link HttpClient#path(String)}
   */
  @Test
  @DisplayName(
      "Test path(String); given ApiClientBuilder build() return ApiClient; then calls build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HttpClient HttpClient.path(String)"})
  void testPath_givenApiClientBuilderBuildReturnApiClient_thenCallsBuild() {
    // Arrange
    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(mock(ApiClient.class));
    when(apiClientBuilder.withBasePath(Mockito.<String>any()))
        .thenReturn(mock(ApiClientBuilder.class));

    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);

    // Act
    HttpClient.builder(provider)
        .basePath("https://example.org/example")
        .build()
        .path("https://example.org/example");

    // Assert
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath("https://example.org/example");
    verify(provider).newInstance();
  }

  /**
   * Test {@link HttpClient#path(String)}.
   *
   * <ul>
   *   <li>Given {@link ApiClientBuilder} {@link ApiClientBuilder#build()} return {@link ApiClient}.
   *   <li>When {@code null}.
   *   <li>Then calls {@link ApiClientBuilder#build()}.
   * </ul>
   *
   * <p>Method under test: {@link HttpClient#path(String)}
   */
  @Test
  @DisplayName(
      "Test path(String); given ApiClientBuilder build() return ApiClient; when 'null'; then calls build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HttpClient HttpClient.path(String)"})
  void testPath_givenApiClientBuilderBuildReturnApiClient_whenNull_thenCallsBuild() {
    // Arrange
    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(mock(ApiClient.class));
    when(apiClientBuilder.withBasePath(Mockito.<String>any()))
        .thenReturn(mock(ApiClientBuilder.class));

    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);

    // Act
    HttpClient.builder(provider).basePath("https://example.org/example").build().path(null);

    // Assert
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath("https://example.org/example");
    verify(provider).newInstance();
  }

  /**
   * Test {@link HttpClient#header(String, String)}.
   *
   * <ul>
   *   <li>Given {@link ApiClientBuilder} {@link ApiClientBuilder#build()} return {@link ApiClient}.
   *   <li>Then calls {@link ApiClientBuilder#build()}.
   * </ul>
   *
   * <p>Method under test: {@link HttpClient#header(String, String)}
   */
  @Test
  @DisplayName(
      "Test header(String, String); given ApiClientBuilder build() return ApiClient; then calls build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HttpClient HttpClient.header(String, String)"})
  void testHeader_givenApiClientBuilderBuildReturnApiClient_thenCallsBuild() {
    // Arrange
    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(mock(ApiClient.class));
    when(apiClientBuilder.withBasePath(Mockito.<String>any()))
        .thenReturn(mock(ApiClientBuilder.class));

    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);

    // Act
    HttpClient.builder(provider)
        .basePath("https://example.org/example")
        .build()
        .header("https://example.org/example", "https://example.org/example");

    // Assert
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath("https://example.org/example");
    verify(provider).newInstance();
  }

  /**
   * Test {@link HttpClient#cookie(String, String)}.
   *
   * <ul>
   *   <li>Given {@link ApiClientBuilder} {@link ApiClientBuilder#build()} return {@link ApiClient}.
   *   <li>Then calls {@link ApiClientBuilder#build()}.
   * </ul>
   *
   * <p>Method under test: {@link HttpClient#cookie(String, String)}
   */
  @Test
  @DisplayName(
      "Test cookie(String, String); given ApiClientBuilder build() return ApiClient; then calls build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HttpClient HttpClient.cookie(String, String)"})
  void testCookie_givenApiClientBuilderBuildReturnApiClient_thenCallsBuild() {
    // Arrange
    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(mock(ApiClient.class));
    when(apiClientBuilder.withBasePath(Mockito.<String>any()))
        .thenReturn(mock(ApiClientBuilder.class));

    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);

    // Act
    HttpClient.builder(provider)
        .basePath("https://example.org/example")
        .build()
        .cookie("https://example.org/example", "https://example.org/example");

    // Assert
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath("https://example.org/example");
    verify(provider).newInstance();
  }

  /**
   * Test {@link HttpClient#queryParam(String, String)}.
   *
   * <ul>
   *   <li>Given {@link ApiClientBuilder} {@link ApiClientBuilder#build()} return {@link ApiClient}.
   *   <li>Then calls {@link ApiClientBuilder#build()}.
   * </ul>
   *
   * <p>Method under test: {@link HttpClient#queryParam(String, String)}
   */
  @Test
  @DisplayName(
      "Test queryParam(String, String); given ApiClientBuilder build() return ApiClient; then calls build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HttpClient HttpClient.queryParam(String, String)"})
  void testQueryParam_givenApiClientBuilderBuildReturnApiClient_thenCallsBuild() {
    // Arrange
    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(mock(ApiClient.class));
    when(apiClientBuilder.withBasePath(Mockito.<String>any()))
        .thenReturn(mock(ApiClientBuilder.class));

    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);

    // Act
    HttpClient.builder(provider)
        .basePath("https://example.org/example")
        .build()
        .queryParam("https://example.org/example", null);

    // Assert
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath("https://example.org/example");
    verify(provider).newInstance();
  }

  /**
   * Test {@link HttpClient#queryParam(String, String)}.
   *
   * <ul>
   *   <li>Given {@link ApiClientBuilder} {@link ApiClientBuilder#build()} return {@link ApiClient}.
   *   <li>Then calls {@link ApiClientBuilder#build()}.
   * </ul>
   *
   * <p>Method under test: {@link HttpClient#queryParam(String, String)}
   */
  @Test
  @DisplayName(
      "Test queryParam(String, String); given ApiClientBuilder build() return ApiClient; then calls build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HttpClient HttpClient.queryParam(String, String)"})
  void testQueryParam_givenApiClientBuilderBuildReturnApiClient_thenCallsBuild2() {
    // Arrange
    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(mock(ApiClient.class));
    when(apiClientBuilder.withBasePath(Mockito.<String>any()))
        .thenReturn(mock(ApiClientBuilder.class));

    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);

    // Act
    HttpClient.builder(provider)
        .basePath("https://example.org/example")
        .build()
        .queryParam(null, "https://example.org/example");

    // Assert
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath("https://example.org/example");
    verify(provider).newInstance();
  }

  /**
   * Test {@link HttpClient#queryParam(String, String)}.
   *
   * <ul>
   *   <li>Given {@link ApiClientBuilder} {@link ApiClientBuilder#build()} return {@link ApiClient}.
   *   <li>When {@code null}.
   *   <li>Then calls {@link ApiClientBuilder#build()}.
   * </ul>
   *
   * <p>Method under test: {@link HttpClient#queryParam(String, String)}
   */
  @Test
  @DisplayName(
      "Test queryParam(String, String); given ApiClientBuilder build() return ApiClient; when 'null'; then calls build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HttpClient HttpClient.queryParam(String, String)"})
  void testQueryParam_givenApiClientBuilderBuildReturnApiClient_whenNull_thenCallsBuild() {
    // Arrange
    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(mock(ApiClient.class));
    when(apiClientBuilder.withBasePath(Mockito.<String>any()))
        .thenReturn(mock(ApiClientBuilder.class));

    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);

    // Act
    HttpClient.builder(provider)
        .basePath("https://example.org/example")
        .build()
        .queryParam(null, null);

    // Assert
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath("https://example.org/example");
    verify(provider).newInstance();
  }

  /**
   * Test {@link HttpClient#queryParam(String, String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then calls {@link ApiClientBuilder#build()}.
   * </ul>
   *
   * <p>Method under test: {@link HttpClient#queryParam(String, String)}
   */
  @Test
  @DisplayName("Test queryParam(String, String); when empty string; then calls build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HttpClient HttpClient.queryParam(String, String)"})
  void testQueryParam_whenEmptyString_thenCallsBuild() {
    // Arrange
    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(mock(ApiClient.class));
    when(apiClientBuilder.withBasePath(Mockito.<String>any()))
        .thenReturn(mock(ApiClientBuilder.class));

    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);

    // Act
    HttpClient.builder(provider)
        .basePath("https://example.org/example")
        .build()
        .queryParam("", null);

    // Assert
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath("https://example.org/example");
    verify(provider).newInstance();
  }

  /**
   * Test {@link HttpClient#formParam(String, Object)}.
   *
   * <ul>
   *   <li>Given {@link ApiClientBuilder} {@link ApiClientBuilder#build()} return {@link ApiClient}.
   *   <li>Then calls {@link ApiClientBuilder#build()}.
   * </ul>
   *
   * <p>Method under test: {@link HttpClient#formParam(String, Object)}
   */
  @Test
  @DisplayName(
      "Test formParam(String, Object); given ApiClientBuilder build() return ApiClient; then calls build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HttpClient HttpClient.formParam(String, Object)"})
  void testFormParam_givenApiClientBuilderBuildReturnApiClient_thenCallsBuild() {
    // Arrange
    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(mock(ApiClient.class));
    when(apiClientBuilder.withBasePath(Mockito.<String>any()))
        .thenReturn(mock(ApiClientBuilder.class));

    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);

    // Act
    HttpClient.builder(provider)
        .basePath("https://example.org/example")
        .build()
        .formParam("https://example.org/example", "Value");

    // Assert
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath("https://example.org/example");
    verify(provider).newInstance();
  }

  /**
   * Test {@link HttpClient#body(Object)}.
   *
   * <ul>
   *   <li>Given {@link ApiClientBuilder} {@link ApiClientBuilder#build()} return {@link ApiClient}.
   *   <li>When {@code Body}.
   *   <li>Then calls {@link ApiClientBuilder#build()}.
   * </ul>
   *
   * <p>Method under test: {@link HttpClient#body(Object)}
   */
  @Test
  @DisplayName(
      "Test body(Object); given ApiClientBuilder build() return ApiClient; when 'Body'; then calls build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HttpClient HttpClient.body(Object)"})
  void testBody_givenApiClientBuilderBuildReturnApiClient_whenBody_thenCallsBuild() {
    // Arrange
    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(mock(ApiClient.class));
    when(apiClientBuilder.withBasePath(Mockito.<String>any()))
        .thenReturn(mock(ApiClientBuilder.class));

    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);

    // Act
    HttpClient.builder(provider).basePath("https://example.org/example").build().body("Body");

    // Assert
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath("https://example.org/example");
    verify(provider).newInstance();
  }

  /**
   * Test {@link HttpClient#body(Object)}.
   *
   * <ul>
   *   <li>Given {@link ApiClientBuilder} {@link ApiClientBuilder#build()} return {@link ApiClient}.
   *   <li>When {@code null}.
   *   <li>Then calls {@link ApiClientBuilder#build()}.
   * </ul>
   *
   * <p>Method under test: {@link HttpClient#body(Object)}
   */
  @Test
  @DisplayName(
      "Test body(Object); given ApiClientBuilder build() return ApiClient; when 'null'; then calls build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HttpClient HttpClient.body(Object)"})
  void testBody_givenApiClientBuilderBuildReturnApiClient_whenNull_thenCallsBuild() {
    // Arrange
    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(mock(ApiClient.class));
    when(apiClientBuilder.withBasePath(Mockito.<String>any()))
        .thenReturn(mock(ApiClientBuilder.class));

    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);

    // Act
    HttpClient.builder(provider).basePath("https://example.org/example").build().body(null);

    // Assert
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath("https://example.org/example");
    verify(provider).newInstance();
  }

  /**
   * Test {@link HttpClient#accept(String)}.
   *
   * <ul>
   *   <li>Given {@link ApiClientBuilder} {@link ApiClientBuilder#build()} return {@link ApiClient}.
   *   <li>Then calls {@link ApiClientBuilder#build()}.
   * </ul>
   *
   * <p>Method under test: {@link HttpClient#accept(String)}
   */
  @Test
  @DisplayName(
      "Test accept(String); given ApiClientBuilder build() return ApiClient; then calls build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HttpClient HttpClient.accept(String)"})
  void testAccept_givenApiClientBuilderBuildReturnApiClient_thenCallsBuild() {
    // Arrange
    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(mock(ApiClient.class));
    when(apiClientBuilder.withBasePath(Mockito.<String>any()))
        .thenReturn(mock(ApiClientBuilder.class));

    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);

    // Act
    HttpClient.builder(provider)
        .basePath("https://example.org/example")
        .build()
        .accept("https://example.org/example");

    // Assert
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath("https://example.org/example");
    verify(provider).newInstance();
  }

  /**
   * Test {@link HttpClient#accept(String)}.
   *
   * <ul>
   *   <li>Given {@link ApiClientBuilder} {@link ApiClientBuilder#build()} return {@link ApiClient}.
   *   <li>When {@code null}.
   *   <li>Then calls {@link ApiClientBuilder#build()}.
   * </ul>
   *
   * <p>Method under test: {@link HttpClient#accept(String)}
   */
  @Test
  @DisplayName(
      "Test accept(String); given ApiClientBuilder build() return ApiClient; when 'null'; then calls build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HttpClient HttpClient.accept(String)"})
  void testAccept_givenApiClientBuilderBuildReturnApiClient_whenNull_thenCallsBuild() {
    // Arrange
    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(mock(ApiClient.class));
    when(apiClientBuilder.withBasePath(Mockito.<String>any()))
        .thenReturn(mock(ApiClientBuilder.class));

    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);

    // Act
    HttpClient.builder(provider).basePath("https://example.org/example").build().accept(null);

    // Assert
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath("https://example.org/example");
    verify(provider).newInstance();
  }

  /**
   * Test {@link HttpClient#contentType(String)}.
   *
   * <ul>
   *   <li>Given {@link ApiClientBuilder} {@link ApiClientBuilder#build()} return {@link ApiClient}.
   *   <li>Then calls {@link ApiClientBuilder#build()}.
   * </ul>
   *
   * <p>Method under test: {@link HttpClient#contentType(String)}
   */
  @Test
  @DisplayName(
      "Test contentType(String); given ApiClientBuilder build() return ApiClient; then calls build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HttpClient HttpClient.contentType(String)"})
  void testContentType_givenApiClientBuilderBuildReturnApiClient_thenCallsBuild() {
    // Arrange
    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(mock(ApiClient.class));
    when(apiClientBuilder.withBasePath(Mockito.<String>any()))
        .thenReturn(mock(ApiClientBuilder.class));

    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);

    // Act
    HttpClient.builder(provider)
        .basePath("https://example.org/example")
        .build()
        .contentType("text/plain");

    // Assert
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath("https://example.org/example");
    verify(provider).newInstance();
  }

  /**
   * Test {@link HttpClient#contentType(String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then calls {@link ApiClientBuilder#build()}.
   * </ul>
   *
   * <p>Method under test: {@link HttpClient#contentType(String)}
   */
  @Test
  @DisplayName("Test contentType(String); when 'null'; then calls build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HttpClient HttpClient.contentType(String)"})
  void testContentType_whenNull_thenCallsBuild() {
    // Arrange
    ApiClientBuilder apiClientBuilder = mock(ApiClientBuilder.class);
    when(apiClientBuilder.build()).thenReturn(mock(ApiClient.class));
    when(apiClientBuilder.withBasePath(Mockito.<String>any()))
        .thenReturn(mock(ApiClientBuilder.class));

    ApiClientBuilderProvider provider = mock(ApiClientBuilderProvider.class);
    when(provider.newInstance()).thenReturn(apiClientBuilder);

    // Act
    HttpClient.builder(provider).basePath("https://example.org/example").build().contentType(null);

    // Assert
    verify(apiClientBuilder).build();
    verify(apiClientBuilder).withBasePath("https://example.org/example");
    verify(provider).newInstance();
  }
}
