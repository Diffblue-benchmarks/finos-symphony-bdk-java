package com.symphony.bdk.http.webclient;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.api.Pair;
import com.symphony.bdk.http.api.auth.Authentication;
import com.symphony.bdk.http.api.util.TypeReference;
import java.net.URI;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.client.reactive.ClientHttpRequest;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.RequestBodySpec;
import org.springframework.web.reactive.function.client.WebClient.RequestBodyUriSpec;
import org.springframework.web.reactive.function.client.WebClient.RequestHeadersSpec;
import org.springframework.web.reactive.function.client.WebClientRequestException;
import org.springframework.web.util.UriBuilder;

class ApiClientWebClientDiffblueTest {
  /**
   * Test {@link ApiClientWebClient#ApiClientWebClient(WebClient, String, Map)}.
   *
   * <p>Method under test: {@link ApiClientWebClient#ApiClientWebClient(WebClient, String, Map)}
   */
  @Test
  @DisplayName("Test new ApiClientWebClient(WebClient, String, Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiClientWebClient.<init>(WebClient, String, Map)"})
  void testNewApiClientWebClient() {
    // Arrange
    WebClient webClient = mock(WebClient.class);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act
    ApiClientWebClient actualApiClientWebClient =
        new ApiClientWebClient(webClient, "https://example.org/example", defaultHeaders);

    // Assert
    assertEquals("https://example.org/example", actualApiClientWebClient.getBasePath());
    assertTrue(actualApiClientWebClient.enforcedAuthenticationSchemes.isEmpty());
    assertTrue(actualApiClientWebClient.getAuthentications().isEmpty());
    assertEquals(defaultHeaders, actualApiClientWebClient.defaultHeaderMap);
  }

  /**
   * Test {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map, Map, Map, String,
   * String, String[], TypeReference)}.
   *
   * <p>Method under test: {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map,
   * Map, Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName(
      "Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ApiClientWebClient.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"
  })
  void testInvokeAPI() throws ApiException {
    // Arrange
    WebClient webClient = mock(WebClient.class);
    Throwable ex = new Throwable();
    HttpMethod method = HttpMethod.valueOf("https://example.org/example");
    URI uri = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri();

    WebClientRequestException webClientRequestException =
        new WebClientRequestException(ex, method, uri, new HttpHeaders());
    when(webClient.method(Mockito.<HttpMethod>any())).thenThrow(webClientRequestException);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(webClient, "https://example.org/example", defaultHeaders);
    ArrayList<Pair> queryParams = new ArrayList<>();
    HashMap<String, String> headerParams = new HashMap<>();
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(
        WebClientRequestException.class,
        () ->
            apiClientWebClient.invokeAPI(
                "https://example.org/example",
                "GET",
                queryParams,
                "Body",
                headerParams,
                cookieParams,
                new HashMap<>(),
                "https://example.org/example",
                "https://example.org/example",
                null,
                mock(TypeReference.class)));
    verify(webClient).method(isA(HttpMethod.class));
  }

  /**
   * Test {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map, Map, Map, String,
   * String, String[], TypeReference)}.
   *
   * <p>Method under test: {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map,
   * Map, Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName(
      "Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ApiClientWebClient.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"
  })
  void testInvokeAPI2() throws ApiException {
    // Arrange
    RequestBodyUriSpec requestBodyUriSpec = mock(RequestBodyUriSpec.class);
    Throwable ex = new Throwable();
    HttpMethod method = HttpMethod.valueOf("https://example.org/example");
    URI uri = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri();

    WebClientRequestException webClientRequestException =
        new WebClientRequestException(ex, method, uri, new HttpHeaders());
    when(requestBodyUriSpec.uri(Mockito.<Function<UriBuilder, URI>>any()))
        .thenThrow(webClientRequestException);

    WebClient webClient = mock(WebClient.class);
    when(webClient.method(Mockito.<HttpMethod>any())).thenReturn(requestBodyUriSpec);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(webClient, "https://example.org/example", defaultHeaders);
    ArrayList<Pair> queryParams = new ArrayList<>();
    HashMap<String, String> headerParams = new HashMap<>();
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(
        WebClientRequestException.class,
        () ->
            apiClientWebClient.invokeAPI(
                "https://example.org/example",
                "GET",
                queryParams,
                "Body",
                headerParams,
                cookieParams,
                new HashMap<>(),
                "https://example.org/example",
                "https://example.org/example",
                null,
                mock(TypeReference.class)));
    verify(webClient).method(isA(HttpMethod.class));
    verify(requestBodyUriSpec).uri(isA(Function.class));
  }

  /**
   * Test {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map, Map, Map, String,
   * String, String[], TypeReference)}.
   *
   * <p>Method under test: {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map,
   * Map, Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName(
      "Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ApiClientWebClient.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"
  })
  void testInvokeAPI3() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);
    apiClientWebClient.addEnforcedAuthenticationScheme("HEAD");
    ArrayList<Pair> queryParams = new ArrayList<>();
    HashMap<String, String> headerParams = new HashMap<>();
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(
        RuntimeException.class,
        () ->
            apiClientWebClient.invokeAPI(
                "https://example.org/example",
                "GET",
                queryParams,
                "Body",
                headerParams,
                cookieParams,
                new HashMap<>(),
                "https://example.org/example",
                "https://example.org/example",
                null,
                mock(TypeReference.class)));
  }

  /**
   * Test {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map, Map, Map, String,
   * String, String[], TypeReference)}.
   *
   * <p>Method under test: {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map,
   * Map, Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName(
      "Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ApiClientWebClient.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"
  })
  void testInvokeAPI4() throws ApiException {
    // Arrange
    RequestBodySpec requestBodySpec = mock(RequestBodySpec.class);
    Throwable ex = new Throwable();
    HttpMethod method = HttpMethod.valueOf("https://example.org/example");
    URI uri = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri();

    WebClientRequestException webClientRequestException =
        new WebClientRequestException(ex, method, uri, new HttpHeaders());
    when(requestBodySpec.contentType(Mockito.<MediaType>any()))
        .thenThrow(webClientRequestException);

    RequestBodyUriSpec requestBodyUriSpec = mock(RequestBodyUriSpec.class);
    when(requestBodyUriSpec.uri(Mockito.<Function<UriBuilder, URI>>any()))
        .thenReturn(requestBodySpec);

    WebClient webClient = mock(WebClient.class);
    when(webClient.method(Mockito.<HttpMethod>any())).thenReturn(requestBodyUriSpec);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(webClient, "https://example.org/example", defaultHeaders);
    ArrayList<Pair> queryParams = new ArrayList<>();
    HashMap<String, String> headerParams = new HashMap<>();
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(
        WebClientRequestException.class,
        () ->
            apiClientWebClient.invokeAPI(
                "https://example.org/example",
                "GET",
                queryParams,
                "Body",
                headerParams,
                cookieParams,
                new HashMap<>(),
                "https://example.org/example",
                "text/plain",
                null,
                mock(TypeReference.class)));
    verify(webClient).method(isA(HttpMethod.class));
    verify(requestBodySpec).contentType(isA(MediaType.class));
    verify(requestBodyUriSpec).uri(isA(Function.class));
  }

  /**
   * Test {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map, Map, Map, String,
   * String, String[], TypeReference)}.
   *
   * <p>Method under test: {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map,
   * Map, Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName(
      "Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ApiClientWebClient.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"
  })
  void testInvokeAPI5() throws ApiException {
    // Arrange
    RequestBodySpec requestBodySpec = mock(RequestBodySpec.class);
    Throwable ex = new Throwable();
    HttpMethod method = HttpMethod.valueOf("https://example.org/example");
    URI uri = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri();

    WebClientRequestException webClientRequestException =
        new WebClientRequestException(ex, method, uri, new HttpHeaders());
    when(requestBodySpec.header(Mockito.<String>any(), isA(String[].class)))
        .thenThrow(webClientRequestException);

    RequestBodySpec requestBodySpec2 = mock(RequestBodySpec.class);
    when(requestBodySpec2.contentType(Mockito.<MediaType>any())).thenReturn(requestBodySpec);

    RequestBodyUriSpec requestBodyUriSpec = mock(RequestBodyUriSpec.class);
    when(requestBodyUriSpec.uri(Mockito.<Function<UriBuilder, URI>>any()))
        .thenReturn(requestBodySpec2);

    WebClient webClient = mock(WebClient.class);
    when(webClient.method(Mockito.<HttpMethod>any())).thenReturn(requestBodyUriSpec);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(webClient, "https://example.org/example", defaultHeaders);
    ArrayList<Pair> queryParams = new ArrayList<>();
    HashMap<String, String> headerParams = new HashMap<>();
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(
        WebClientRequestException.class,
        () ->
            apiClientWebClient.invokeAPI(
                "https://example.org/example",
                "GET",
                queryParams,
                "Body",
                headerParams,
                cookieParams,
                new HashMap<>(),
                null,
                "text/plain",
                null,
                mock(TypeReference.class)));
    verify(webClient).method(isA(HttpMethod.class));
    verify(requestBodySpec2).contentType(isA(MediaType.class));
    verify(requestBodySpec).header(eq("X-Trace-Id"), isA(String[].class));
    verify(requestBodyUriSpec).uri(isA(Function.class));
  }

  /**
   * Test {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map, Map, Map, String,
   * String, String[], TypeReference)}.
   *
   * <p>Method under test: {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map,
   * Map, Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName(
      "Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ApiClientWebClient.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"
  })
  void testInvokeAPI6() throws ApiException {
    // Arrange
    RequestBodySpec requestBodySpec = mock(RequestBodySpec.class);
    Throwable ex = new Throwable();
    HttpMethod method = HttpMethod.valueOf("https://example.org/example");
    URI uri = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri();

    WebClientRequestException webClientRequestException =
        new WebClientRequestException(ex, method, uri, new HttpHeaders());
    when(requestBodySpec.header(Mockito.<String>any(), isA(String[].class)))
        .thenThrow(webClientRequestException);

    RequestBodySpec requestBodySpec2 = mock(RequestBodySpec.class);
    when(requestBodySpec2.header(Mockito.<String>any(), isA(String[].class)))
        .thenReturn(requestBodySpec);

    RequestBodySpec requestBodySpec3 = mock(RequestBodySpec.class);
    when(requestBodySpec3.contentType(Mockito.<MediaType>any())).thenReturn(requestBodySpec2);

    RequestBodyUriSpec requestBodyUriSpec = mock(RequestBodyUriSpec.class);
    when(requestBodyUriSpec.uri(Mockito.<Function<UriBuilder, URI>>any()))
        .thenReturn(requestBodySpec3);

    WebClient webClient = mock(WebClient.class);
    when(webClient.method(Mockito.<HttpMethod>any())).thenReturn(requestBodyUriSpec);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(webClient, "https://example.org/example", defaultHeaders);
    ArrayList<Pair> queryParams = new ArrayList<>();
    HashMap<String, String> headerParams = new HashMap<>();
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(
        WebClientRequestException.class,
        () ->
            apiClientWebClient.invokeAPI(
                "https://example.org/example",
                "GET",
                queryParams,
                "Body",
                headerParams,
                cookieParams,
                new HashMap<>(),
                null,
                "text/plain",
                null,
                mock(TypeReference.class)));
    verify(webClient).method(isA(HttpMethod.class));
    verify(requestBodySpec3).contentType(isA(MediaType.class));
    verify(requestBodySpec).header(eq("Delivered-To"), isA(String[].class));
    verify(requestBodySpec2).header(eq("X-Trace-Id"), isA(String[].class));
    verify(requestBodyUriSpec).uri(isA(Function.class));
  }

  /**
   * Test {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map, Map, Map, String,
   * String, String[], TypeReference)}.
   *
   * <p>Method under test: {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map,
   * Map, Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName(
      "Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ApiClientWebClient.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"
  })
  void testInvokeAPI7() throws ApiException {
    // Arrange
    RequestBodySpec requestBodySpec = mock(RequestBodySpec.class);
    Throwable ex = new Throwable();
    HttpMethod method = HttpMethod.valueOf("https://example.org/example");
    URI uri = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri();

    WebClientRequestException webClientRequestException =
        new WebClientRequestException(ex, method, uri, new HttpHeaders());
    when(requestBodySpec.cookie(Mockito.<String>any(), Mockito.<String>any()))
        .thenThrow(webClientRequestException);

    RequestBodySpec requestBodySpec2 = mock(RequestBodySpec.class);
    when(requestBodySpec2.header(Mockito.<String>any(), isA(String[].class)))
        .thenReturn(requestBodySpec);

    RequestBodySpec requestBodySpec3 = mock(RequestBodySpec.class);
    when(requestBodySpec3.header(Mockito.<String>any(), isA(String[].class)))
        .thenReturn(requestBodySpec2);

    RequestBodySpec requestBodySpec4 = mock(RequestBodySpec.class);
    when(requestBodySpec4.contentType(Mockito.<MediaType>any())).thenReturn(requestBodySpec3);

    RequestBodyUriSpec requestBodyUriSpec = mock(RequestBodyUriSpec.class);
    when(requestBodyUriSpec.uri(Mockito.<Function<UriBuilder, URI>>any()))
        .thenReturn(requestBodySpec4);

    WebClient webClient = mock(WebClient.class);
    when(webClient.method(Mockito.<HttpMethod>any())).thenReturn(requestBodyUriSpec);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(webClient, "https://example.org/example", defaultHeaders);
    ArrayList<Pair> queryParams = new ArrayList<>();

    HashMap<String, String> headerParams = new HashMap<>();
    headerParams.put("POST", "POST");

    HashMap<String, String> cookieParams = new HashMap<>();
    cookieParams.put("POST", "POST");

    // Act and Assert
    assertThrows(
        WebClientRequestException.class,
        () ->
            apiClientWebClient.invokeAPI(
                "https://example.org/example",
                "GET",
                queryParams,
                "Body",
                headerParams,
                cookieParams,
                new HashMap<>(),
                null,
                "text/plain",
                null,
                mock(TypeReference.class)));
    verify(webClient).method(isA(HttpMethod.class));
    verify(requestBodySpec4).contentType(isA(MediaType.class));
    verify(requestBodySpec).cookie("POST", "POST");
    verify(requestBodySpec2).header(eq("POST"), isA(String[].class));
    verify(requestBodySpec3).header(eq("X-Trace-Id"), isA(String[].class));
    verify(requestBodyUriSpec).uri(isA(Function.class));
  }

  /**
   * Test {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map, Map, Map, String,
   * String, String[], TypeReference)}.
   *
   * <ul>
   *   <li>Given {@code POST}.
   *   <li>When {@link HashMap#HashMap()} {@code POST} is {@code POST}.
   *   <li>Then calls {@link RequestBodySpec#header(String, String[])}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map,
   * Map, Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName(
      "Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference); given 'POST'; when HashMap() 'POST' is 'POST'; then calls header(String, String[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ApiClientWebClient.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"
  })
  void testInvokeAPI_givenPost_whenHashMapPostIsPost_thenCallsHeader() throws ApiException {
    // Arrange
    RequestBodySpec requestBodySpec = mock(RequestBodySpec.class);
    Throwable ex = new Throwable();
    HttpMethod method = HttpMethod.valueOf("https://example.org/example");
    URI uri = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri();

    WebClientRequestException webClientRequestException =
        new WebClientRequestException(ex, method, uri, new HttpHeaders());
    when(requestBodySpec.header(Mockito.<String>any(), isA(String[].class)))
        .thenThrow(webClientRequestException);

    RequestBodySpec requestBodySpec2 = mock(RequestBodySpec.class);
    when(requestBodySpec2.header(Mockito.<String>any(), isA(String[].class)))
        .thenReturn(requestBodySpec);

    RequestBodySpec requestBodySpec3 = mock(RequestBodySpec.class);
    when(requestBodySpec3.header(Mockito.<String>any(), isA(String[].class)))
        .thenReturn(requestBodySpec2);

    RequestBodySpec requestBodySpec4 = mock(RequestBodySpec.class);
    when(requestBodySpec4.contentType(Mockito.<MediaType>any())).thenReturn(requestBodySpec3);

    RequestBodyUriSpec requestBodyUriSpec = mock(RequestBodyUriSpec.class);
    when(requestBodyUriSpec.uri(Mockito.<Function<UriBuilder, URI>>any()))
        .thenReturn(requestBodySpec4);

    WebClient webClient = mock(WebClient.class);
    when(webClient.method(Mockito.<HttpMethod>any())).thenReturn(requestBodyUriSpec);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(webClient, "https://example.org/example", defaultHeaders);
    ArrayList<Pair> queryParams = new ArrayList<>();

    HashMap<String, String> headerParams = new HashMap<>();
    headerParams.put("POST", "POST");
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(
        WebClientRequestException.class,
        () ->
            apiClientWebClient.invokeAPI(
                "https://example.org/example",
                "GET",
                queryParams,
                "Body",
                headerParams,
                cookieParams,
                new HashMap<>(),
                null,
                "text/plain",
                null,
                mock(TypeReference.class)));
    verify(webClient).method(isA(HttpMethod.class));
    verify(requestBodySpec4).contentType(isA(MediaType.class));
    verify(requestBodySpec).header(eq("Delivered-To"), isA(String[].class));
    verify(requestBodySpec2).header(eq("POST"), isA(String[].class));
    verify(requestBodySpec3).header(eq("X-Trace-Id"), isA(String[].class));
    verify(requestBodyUriSpec).uri(isA(Function.class));
  }

  /**
   * Test {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map, Map, Map, String,
   * String, String[], TypeReference)}.
   *
   * <ul>
   *   <li>Given {@link RequestBodySpec} {@link RequestBodySpec#cookie(String, String)} return
   *       {@link RequestBodySpec}.
   *   <li>Then calls {@link RequestBodySpec#cookie(String, String)}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map,
   * Map, Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName(
      "Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference); given RequestBodySpec cookie(String, String) return RequestBodySpec; then calls cookie(String, String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ApiClientWebClient.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"
  })
  void testInvokeAPI_givenRequestBodySpecCookieReturnRequestBodySpec_thenCallsCookie()
      throws ApiException {
    // Arrange
    RequestBodySpec requestBodySpec = mock(RequestBodySpec.class);
    Throwable ex = new Throwable();
    HttpMethod method = HttpMethod.valueOf("https://example.org/example");
    URI uri = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri();

    WebClientRequestException webClientRequestException =
        new WebClientRequestException(ex, method, uri, new HttpHeaders());
    when(requestBodySpec.header(Mockito.<String>any(), isA(String[].class)))
        .thenThrow(webClientRequestException);

    RequestBodySpec requestBodySpec2 = mock(RequestBodySpec.class);
    when(requestBodySpec2.cookie(Mockito.<String>any(), Mockito.<String>any()))
        .thenReturn(requestBodySpec);

    RequestBodySpec requestBodySpec3 = mock(RequestBodySpec.class);
    when(requestBodySpec3.header(Mockito.<String>any(), isA(String[].class)))
        .thenReturn(requestBodySpec2);

    RequestBodySpec requestBodySpec4 = mock(RequestBodySpec.class);
    when(requestBodySpec4.header(Mockito.<String>any(), isA(String[].class)))
        .thenReturn(requestBodySpec3);

    RequestBodySpec requestBodySpec5 = mock(RequestBodySpec.class);
    when(requestBodySpec5.contentType(Mockito.<MediaType>any())).thenReturn(requestBodySpec4);

    RequestBodyUriSpec requestBodyUriSpec = mock(RequestBodyUriSpec.class);
    when(requestBodyUriSpec.uri(Mockito.<Function<UriBuilder, URI>>any()))
        .thenReturn(requestBodySpec5);

    WebClient webClient = mock(WebClient.class);
    when(webClient.method(Mockito.<HttpMethod>any())).thenReturn(requestBodyUriSpec);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(webClient, "https://example.org/example", defaultHeaders);
    ArrayList<Pair> queryParams = new ArrayList<>();

    HashMap<String, String> headerParams = new HashMap<>();
    headerParams.put("POST", "POST");

    HashMap<String, String> cookieParams = new HashMap<>();
    cookieParams.put("POST", "POST");

    // Act and Assert
    assertThrows(
        WebClientRequestException.class,
        () ->
            apiClientWebClient.invokeAPI(
                "https://example.org/example",
                "GET",
                queryParams,
                "Body",
                headerParams,
                cookieParams,
                new HashMap<>(),
                null,
                "text/plain",
                null,
                mock(TypeReference.class)));
    verify(webClient).method(isA(HttpMethod.class));
    verify(requestBodySpec5).contentType(isA(MediaType.class));
    verify(requestBodySpec2).cookie("POST", "POST");
    verify(requestBodySpec).header(eq("Delivered-To"), isA(String[].class));
    verify(requestBodySpec3).header(eq("POST"), isA(String[].class));
    verify(requestBodySpec4).header(eq("X-Trace-Id"), isA(String[].class));
    verify(requestBodyUriSpec).uri(isA(Function.class));
  }

  /**
   * Test {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map, Map, Map, String,
   * String, String[], TypeReference)}.
   *
   * <ul>
   *   <li>Then calls {@link RequestBodySpec#body(BodyInserter)}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map,
   * Map, Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName(
      "Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference); then calls body(BodyInserter)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ApiClientWebClient.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"
  })
  void testInvokeAPI_thenCallsBody() throws ApiException {
    // Arrange
    Throwable ex = new Throwable();
    HttpMethod method = HttpMethod.valueOf("https://example.org/example");
    URI uri = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri();

    new WebClientRequestException(ex, method, uri, new HttpHeaders());

    RequestBodySpec requestBodySpec = mock(RequestBodySpec.class);
    Throwable ex2 = new Throwable();
    HttpMethod method2 = HttpMethod.valueOf("https://example.org/example");
    URI uri2 = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri();

    WebClientRequestException webClientRequestException =
        new WebClientRequestException(ex2, method2, uri2, new HttpHeaders());
    Mockito.<RequestHeadersSpec<?>>when(
            requestBodySpec.body(Mockito.<BodyInserter<Object, ClientHttpRequest>>any()))
        .thenThrow(webClientRequestException);

    RequestBodySpec requestBodySpec2 = mock(RequestBodySpec.class);
    when(requestBodySpec2.header(Mockito.<String>any(), isA(String[].class)))
        .thenReturn(requestBodySpec);

    RequestBodySpec requestBodySpec3 = mock(RequestBodySpec.class);
    when(requestBodySpec3.header(Mockito.<String>any(), isA(String[].class)))
        .thenReturn(requestBodySpec2);

    RequestBodySpec requestBodySpec4 = mock(RequestBodySpec.class);
    when(requestBodySpec4.contentType(Mockito.<MediaType>any())).thenReturn(requestBodySpec3);

    RequestBodyUriSpec requestBodyUriSpec = mock(RequestBodyUriSpec.class);
    when(requestBodyUriSpec.uri(Mockito.<Function<UriBuilder, URI>>any()))
        .thenReturn(requestBodySpec4);

    WebClient webClient = mock(WebClient.class);
    when(webClient.method(Mockito.<HttpMethod>any())).thenReturn(requestBodyUriSpec);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(webClient, "https://example.org/example", defaultHeaders);
    ArrayList<Pair> queryParams = new ArrayList<>();
    HashMap<String, String> headerParams = new HashMap<>();
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(
        WebClientRequestException.class,
        () ->
            apiClientWebClient.invokeAPI(
                "https://example.org/example",
                "GET",
                queryParams,
                "Body",
                headerParams,
                cookieParams,
                new HashMap<>(),
                null,
                "text/plain",
                null,
                mock(TypeReference.class)));
    verify(webClient).method(isA(HttpMethod.class));
    verify(requestBodySpec).body(isA(BodyInserter.class));
    verify(requestBodySpec4).contentType(isA(MediaType.class));
    verify(requestBodySpec2).header(eq("Delivered-To"), isA(String[].class));
    verify(requestBodySpec3).header(eq("X-Trace-Id"), isA(String[].class));
    verify(requestBodyUriSpec).uri(isA(Function.class));
  }

  /**
   * Test {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map, Map, Map, String,
   * String, String[], TypeReference)}.
   *
   * <ul>
   *   <li>Then throw {@link RuntimeException}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map,
   * Map, Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName(
      "Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference); then throw RuntimeException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ApiClientWebClient.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"
  })
  void testInvokeAPI_thenThrowRuntimeException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);
    ArrayList<Pair> queryParams = new ArrayList<>();
    HashMap<String, String> headerParams = new HashMap<>();
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(
        RuntimeException.class,
        () ->
            apiClientWebClient.invokeAPI(
                "https://example.org/example",
                "GET",
                queryParams,
                "Body",
                headerParams,
                cookieParams,
                new HashMap<>(),
                "https://example.org/example",
                "https://example.org/example",
                new String[] {"https://example.org/example"},
                mock(TypeReference.class)));
  }

  /**
   * Test {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map, Map, Map, String,
   * String, String[], TypeReference)}.
   *
   * <ul>
   *   <li>When array of {@link String} with {@code https://example.org/example}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map,
   * Map, Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName(
      "Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference); when array of String with 'https://example.org/example'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ApiClientWebClient.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"
  })
  void testInvokeAPI_whenArrayOfStringWithHttpsExampleOrgExample_thenThrowApiException()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);
    ArrayList<Pair> queryParams = new ArrayList<>();
    HashMap<String, String> headerParams = new HashMap<>();
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            apiClientWebClient.invokeAPI(
                "https://example.org/example",
                "https://example.org/example",
                queryParams,
                "Body",
                headerParams,
                cookieParams,
                new HashMap<>(),
                "https://example.org/example",
                "https://example.org/example",
                new String[] {"https://example.org/example"},
                mock(TypeReference.class)));
  }

  /**
   * Test {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map, Map, Map, String,
   * String, String[], TypeReference)}.
   *
   * <ul>
   *   <li>When array of {@link String} with {@code https://example.org/example}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map,
   * Map, Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName(
      "Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference); when array of String with 'https://example.org/example'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ApiClientWebClient.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"
  })
  void testInvokeAPI_whenArrayOfStringWithHttpsExampleOrgExample_thenThrowApiException2()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);
    ArrayList<Pair> queryParams = new ArrayList<>();
    HashMap<String, String> headerParams = new HashMap<>();
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            apiClientWebClient.invokeAPI(
                "https://example.org/example",
                null,
                queryParams,
                "Body",
                headerParams,
                cookieParams,
                new HashMap<>(),
                "https://example.org/example",
                "https://example.org/example",
                new String[] {"https://example.org/example"},
                mock(TypeReference.class)));
  }

  /**
   * Test {@link ApiClientWebClient#parameterToString(Object)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#parameterToString(Object)}
   */
  @Test
  @DisplayName(
      "Test parameterToString(Object); given '42'; when ArrayList() add '42'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClientWebClient.parameterToString(Object)"})
  void testParameterToString_given42_whenArrayListAdd42_thenReturn42() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);

    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    // Act and Assert
    assertEquals("42", apiClientWebClient.parameterToString(objectList));
  }

  /**
   * Test {@link ApiClientWebClient#parameterToString(Object)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 42,42}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#parameterToString(Object)}
   */
  @Test
  @DisplayName(
      "Test parameterToString(Object); given '42'; when ArrayList() add '42'; then return '42,42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClientWebClient.parameterToString(Object)"})
  void testParameterToString_given42_whenArrayListAdd42_thenReturn4242() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);

    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");

    // Act and Assert
    assertEquals("42,42", apiClientWebClient.parameterToString(objectList));
  }

  /**
   * Test {@link ApiClientWebClient#parameterToString(Object)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#parameterToString(Object)}
   */
  @Test
  @DisplayName("Test parameterToString(Object); when ArrayList(); then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClientWebClient.parameterToString(Object)"})
  void testParameterToString_whenArrayList_thenReturnEmptyString() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);

    // Act and Assert
    assertEquals("", apiClientWebClient.parameterToString(new ArrayList<>()));
  }

  /**
   * Test {@link ApiClientWebClient#parameterToString(Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#parameterToString(Object)}
   */
  @Test
  @DisplayName("Test parameterToString(Object); when 'null'; then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClientWebClient.parameterToString(Object)"})
  void testParameterToString_whenNull_thenReturnEmptyString() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);

    // Act and Assert
    assertEquals("", apiClientWebClient.parameterToString(null));
  }

  /**
   * Test {@link ApiClientWebClient#parameterToString(Object)}.
   *
   * <ul>
   *   <li>When {@code Param}.
   *   <li>Then return {@code Param}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#parameterToString(Object)}
   */
  @Test
  @DisplayName("Test parameterToString(Object); when 'Param'; then return 'Param'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClientWebClient.parameterToString(Object)"})
  void testParameterToString_whenParam_thenReturnParam() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);

    // Act and Assert
    assertEquals("Param", apiClientWebClient.parameterToString("Param"));
  }

  /**
   * Test {@link ApiClientWebClient#parameterToPairs(String, String, Object)}.
   *
   * <p>Method under test: {@link ApiClientWebClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName("Test parameterToPairs(String, String, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClientWebClient.parameterToPairs(String, String, Object)"})
  void testParameterToPairs() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);

    ArrayList<Pair> pairList = new ArrayList<>();
    pairList.add(Pair.pair("https://example.org/example", "https://example.org/example"));

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(pairList);

    // Act
    List<Pair> actualParameterToPairsResult =
        apiClientWebClient.parameterToPairs(null, "https://example.org/example", objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    assertEquals("https://example.org/example", actualParameterToPairsResult.get(0).getName());
  }

  /**
   * Test {@link ApiClientWebClient#parameterToPairs(String, String, Object)}.
   *
   * <p>Method under test: {@link ApiClientWebClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName("Test parameterToPairs(String, String, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClientWebClient.parameterToPairs(String, String, Object)"})
  void testParameterToPairs2() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);

    ArrayList<Pair> pairList = new ArrayList<>();
    pairList.add(Pair.pair("https://example.org/example", "https://example.org/example"));
    pairList.add(Pair.pair("https://example.org/example", "https://example.org/example"));

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(pairList);

    // Act
    List<Pair> actualParameterToPairsResult =
        apiClientWebClient.parameterToPairs(null, "https://example.org/example", objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    assertEquals("https://example.org/example", actualParameterToPairsResult.get(0).getName());
  }

  /**
   * Test {@link ApiClientWebClient#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code null}.
   *   <li>Then return first Value is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName(
      "Test parameterToPairs(String, String, Object); given ArrayList() add 'null'; then return first Value is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClientWebClient.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_givenArrayListAddNull_thenReturnFirstValueIsNull() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);

    ArrayList<Pair> pairList = new ArrayList<>();
    pairList.add(null);

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(pairList);

    // Act
    List<Pair> actualParameterToPairsResult =
        apiClientWebClient.parameterToPairs(null, "https://example.org/example", objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("https://example.org/example", getResult.getName());
    assertEquals("null", getResult.getValue());
  }

  /**
   * Test {@link ApiClientWebClient#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()}.
   *   <li>Then return first Value is empty string.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName(
      "Test parameterToPairs(String, String, Object); given ArrayList(); then return first Value is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClientWebClient.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_givenArrayList_thenReturnFirstValueIsEmptyString() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(new ArrayList<>());

    // Act
    List<Pair> actualParameterToPairsResult =
        apiClientWebClient.parameterToPairs(null, "https://example.org/example", objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("", getResult.getValue());
    assertEquals("https://example.org/example", getResult.getName());
  }

  /**
   * Test {@link ApiClientWebClient#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When empty string.
   *   <li>Then return first Value is empty string.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName(
      "Test parameterToPairs(String, String, Object); given 'null'; when empty string; then return first Value is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClientWebClient.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_givenNull_whenEmptyString_thenReturnFirstValueIsEmptyString() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(null);

    // Act
    List<Pair> actualParameterToPairsResult =
        apiClientWebClient.parameterToPairs("", "https://example.org/example", objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("", getResult.getValue());
    assertEquals("https://example.org/example", getResult.getName());
  }

  /**
   * Test {@link ApiClientWebClient#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link LinkedHashSet#LinkedHashSet()} add {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName(
      "Test parameterToPairs(String, String, Object); given 'null'; when LinkedHashSet() add 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClientWebClient.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_givenNull_whenLinkedHashSetAddNull() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(null);

    // Act
    List<Pair> actualParameterToPairsResult =
        apiClientWebClient.parameterToPairs(null, "https://example.org/example", objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("", getResult.getValue());
    assertEquals("https://example.org/example", getResult.getName());
  }

  /**
   * Test {@link ApiClientWebClient#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@code multi}.
   *   <li>Then return first Value is empty string.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName(
      "Test parameterToPairs(String, String, Object); given 'null'; when 'multi'; then return first Value is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClientWebClient.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_givenNull_whenMulti_thenReturnFirstValueIsEmptyString() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(null);

    // Act
    List<Pair> actualParameterToPairsResult =
        apiClientWebClient.parameterToPairs("multi", "https://example.org/example", objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("", getResult.getValue());
    assertEquals("https://example.org/example", getResult.getName());
  }

  /**
   * Test {@link ApiClientWebClient#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>Given pair {@code https://example.org/example} and {@code https://example.org/example}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName(
      "Test parameterToPairs(String, String, Object); given pair 'https://example.org/example' and 'https://example.org/example'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClientWebClient.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_givenPairHttpsExampleOrgExampleAndHttpsExampleOrgExample() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);

    ArrayList<Pair> pairList = new ArrayList<>();
    pairList.add(Pair.pair("https://example.org/example", "https://example.org/example"));

    // Act
    List<Pair> actualParameterToPairsResult =
        apiClientWebClient.parameterToPairs(
            "https://example.org/example", "https://example.org/example", pairList);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    assertEquals("https://example.org/example", actualParameterToPairsResult.get(0).getName());
  }

  /**
   * Test {@link ApiClientWebClient#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName("Test parameterToPairs(String, String, Object); when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClientWebClient.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_whenArrayList_thenReturnEmpty() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);

    // Act and Assert
    assertTrue(
        apiClientWebClient
            .parameterToPairs(
                "https://example.org/example", "https://example.org/example", new ArrayList<>())
            .isEmpty());
  }

  /**
   * Test {@link ApiClientWebClient#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName(
      "Test parameterToPairs(String, String, Object); when empty string; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClientWebClient.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_whenEmptyString_thenReturnEmpty() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);

    // Act and Assert
    assertTrue(apiClientWebClient.parameterToPairs(null, "", null).isEmpty());
  }

  /**
   * Test {@link ApiClientWebClient#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName("Test parameterToPairs(String, String, Object); when 'null'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClientWebClient.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_whenNull_thenReturnEmpty() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);

    // Act and Assert
    assertTrue(apiClientWebClient.parameterToPairs(null, null, null).isEmpty());
  }

  /**
   * Test {@link ApiClientWebClient#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName("Test parameterToPairs(String, String, Object); when 'null'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClientWebClient.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_whenNull_thenReturnEmpty2() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);

    // Act and Assert
    assertTrue(
        apiClientWebClient.parameterToPairs(null, "https://example.org/example", null).isEmpty());
  }

  /**
   * Test {@link ApiClientWebClient#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>When {@code Value}.
   *   <li>Then return first Value is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName(
      "Test parameterToPairs(String, String, Object); when 'Value'; then return first Value is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClientWebClient.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_whenValue_thenReturnFirstValueIsValue() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);

    // Act
    List<Pair> actualParameterToPairsResult =
        apiClientWebClient.parameterToPairs(
            "https://example.org/example", "https://example.org/example", "Value");

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("Value", getResult.getValue());
    assertEquals("https://example.org/example", getResult.getName());
  }

  /**
   * Test {@link ApiClientWebClient#selectHeaderAccept(String[])}.
   *
   * <ul>
   *   <li>Then return {@code application/json ;U}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#selectHeaderAccept(String[])}
   */
  @Test
  @DisplayName("Test selectHeaderAccept(String[]); then return 'application/json ;U'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClientWebClient.selectHeaderAccept(String[])"})
  void testSelectHeaderAccept_thenReturnApplicationJsonU() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);

    // Act
    String actualSelectHeaderAcceptResult =
        apiClientWebClient.selectHeaderAccept(
            new String[] {"https://example.org/example", "application/json ;U"});

    // Assert
    assertEquals("application/json ;U", actualSelectHeaderAcceptResult);
  }

  /**
   * Test {@link ApiClientWebClient#selectHeaderAccept(String[])}.
   *
   * <ul>
   *   <li>Then return {@code * /*}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#selectHeaderAccept(String[])}
   */
  @Test
  @DisplayName("Test selectHeaderAccept(String[]); then return '*/*'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClientWebClient.selectHeaderAccept(String[])"})
  void testSelectHeaderAccept_thenReturnAsteriskSlashAsterisk() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);

    // Act
    String actualSelectHeaderAcceptResult =
        apiClientWebClient.selectHeaderAccept(new String[] {"*/*"});

    // Assert
    assertEquals("*/*", actualSelectHeaderAcceptResult);
  }

  /**
   * Test {@link ApiClientWebClient#selectHeaderAccept(String[])}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#selectHeaderAccept(String[])}
   */
  @Test
  @DisplayName("Test selectHeaderAccept(String[]); then return 'https://example.org/example'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClientWebClient.selectHeaderAccept(String[])"})
  void testSelectHeaderAccept_thenReturnHttpsExampleOrgExample() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);

    // Act
    String actualSelectHeaderAcceptResult =
        apiClientWebClient.selectHeaderAccept(new String[] {"https://example.org/example"});

    // Assert
    assertEquals("https://example.org/example", actualSelectHeaderAcceptResult);
  }

  /**
   * Test {@link ApiClientWebClient#selectHeaderAccept(String[])}.
   *
   * <ul>
   *   <li>When array of {@link String} with {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#selectHeaderAccept(String[])}
   */
  @Test
  @DisplayName(
      "Test selectHeaderAccept(String[]); when array of String with 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClientWebClient.selectHeaderAccept(String[])"})
  void testSelectHeaderAccept_whenArrayOfStringWithNull_thenReturnNull() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);

    // Act
    String actualSelectHeaderAcceptResult =
        apiClientWebClient.selectHeaderAccept(new String[] {null});

    // Assert
    assertEquals("null", actualSelectHeaderAcceptResult);
  }

  /**
   * Test {@link ApiClientWebClient#selectHeaderAccept(String[])}.
   *
   * <ul>
   *   <li>When empty array of {@link String}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#selectHeaderAccept(String[])}
   */
  @Test
  @DisplayName("Test selectHeaderAccept(String[]); when empty array of String; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClientWebClient.selectHeaderAccept(String[])"})
  void testSelectHeaderAccept_whenEmptyArrayOfString_thenReturnNull() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);

    // Act
    String actualSelectHeaderAcceptResult = apiClientWebClient.selectHeaderAccept(new String[] {});

    // Assert
    assertNull(actualSelectHeaderAcceptResult);
  }

  /**
   * Test {@link ApiClientWebClient#isJsonMime(String)}.
   *
   * <ul>
   *   <li>When {@code application/json ;U}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#isJsonMime(String)}
   */
  @Test
  @DisplayName("Test isJsonMime(String); when 'application/json ;U'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ApiClientWebClient.isJsonMime(String)"})
  void testIsJsonMime_whenApplicationJsonU_thenReturnTrue() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);

    // Act and Assert
    assertTrue(apiClientWebClient.isJsonMime("application/json ;U"));
  }

  /**
   * Test {@link ApiClientWebClient#isJsonMime(String)}.
   *
   * <ul>
   *   <li>When {@code * /*}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#isJsonMime(String)}
   */
  @Test
  @DisplayName("Test isJsonMime(String); when '*/*'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ApiClientWebClient.isJsonMime(String)"})
  void testIsJsonMime_whenAsteriskSlashAsterisk_thenReturnTrue() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);

    // Act and Assert
    assertTrue(apiClientWebClient.isJsonMime("*/*"));
  }

  /**
   * Test {@link ApiClientWebClient#isJsonMime(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#isJsonMime(String)}
   */
  @Test
  @DisplayName("Test isJsonMime(String); when 'https://example.org/example'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ApiClientWebClient.isJsonMime(String)"})
  void testIsJsonMime_whenHttpsExampleOrgExample_thenReturnFalse() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);

    // Act and Assert
    assertFalse(apiClientWebClient.isJsonMime("https://example.org/example"));
  }

  /**
   * Test {@link ApiClientWebClient#isJsonMime(String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#isJsonMime(String)}
   */
  @Test
  @DisplayName("Test isJsonMime(String); when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ApiClientWebClient.isJsonMime(String)"})
  void testIsJsonMime_whenNull_thenReturnFalse() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);

    // Act and Assert
    assertFalse(apiClientWebClient.isJsonMime(null));
  }

  /**
   * Test {@link ApiClientWebClient#selectHeaderContentType(String[])}.
   *
   * <ul>
   *   <li>Then return {@code application/json ;U}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#selectHeaderContentType(String[])}
   */
  @Test
  @DisplayName("Test selectHeaderContentType(String[]); then return 'application/json ;U'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClientWebClient.selectHeaderContentType(String[])"})
  void testSelectHeaderContentType_thenReturnApplicationJsonU() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);

    // Act
    String actualSelectHeaderContentTypeResult =
        apiClientWebClient.selectHeaderContentType(new String[] {"application/json ;U"});

    // Assert
    assertEquals("application/json ;U", actualSelectHeaderContentTypeResult);
  }

  /**
   * Test {@link ApiClientWebClient#selectHeaderContentType(String[])}.
   *
   * <ul>
   *   <li>Then return {@code * /*}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#selectHeaderContentType(String[])}
   */
  @Test
  @DisplayName("Test selectHeaderContentType(String[]); then return '*/*'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClientWebClient.selectHeaderContentType(String[])"})
  void testSelectHeaderContentType_thenReturnAsteriskSlashAsterisk() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);

    // Act
    String actualSelectHeaderContentTypeResult =
        apiClientWebClient.selectHeaderContentType(new String[] {"*/*"});

    // Assert
    assertEquals("*/*", actualSelectHeaderContentTypeResult);
  }

  /**
   * Test {@link ApiClientWebClient#selectHeaderContentType(String[])}.
   *
   * <ul>
   *   <li>When array of {@link String} with {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#selectHeaderContentType(String[])}
   */
  @Test
  @DisplayName(
      "Test selectHeaderContentType(String[]); when array of String with 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClientWebClient.selectHeaderContentType(String[])"})
  void testSelectHeaderContentType_whenArrayOfStringWithNull_thenReturnNull() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);

    // Act
    String actualSelectHeaderContentTypeResult =
        apiClientWebClient.selectHeaderContentType(new String[] {null});

    // Assert
    assertNull(actualSelectHeaderContentTypeResult);
  }

  /**
   * Test {@link ApiClientWebClient#selectHeaderContentType(String[])}.
   *
   * <ul>
   *   <li>When array of {@link String} with {@code text/plain}.
   *   <li>Then return {@code text/plain}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#selectHeaderContentType(String[])}
   */
  @Test
  @DisplayName(
      "Test selectHeaderContentType(String[]); when array of String with 'text/plain'; then return 'text/plain'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClientWebClient.selectHeaderContentType(String[])"})
  void testSelectHeaderContentType_whenArrayOfStringWithTextPlain_thenReturnTextPlain() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);

    // Act
    String actualSelectHeaderContentTypeResult =
        apiClientWebClient.selectHeaderContentType(new String[] {"text/plain"});

    // Assert
    assertEquals("text/plain", actualSelectHeaderContentTypeResult);
  }

  /**
   * Test {@link ApiClientWebClient#selectHeaderContentType(String[])}.
   *
   * <ul>
   *   <li>When empty array of {@link String}.
   *   <li>Then return {@code application/json}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientWebClient#selectHeaderContentType(String[])}
   */
  @Test
  @DisplayName(
      "Test selectHeaderContentType(String[]); when empty array of String; then return 'application/json'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClientWebClient.selectHeaderContentType(String[])"})
  void testSelectHeaderContentType_whenEmptyArrayOfString_thenReturnApplicationJson() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);

    // Act
    String actualSelectHeaderContentTypeResult =
        apiClientWebClient.selectHeaderContentType(new String[] {});

    // Assert
    assertEquals("application/json", actualSelectHeaderContentTypeResult);
  }

  /**
   * Test {@link ApiClientWebClient#escapeString(String)}.
   *
   * <p>Method under test: {@link ApiClientWebClient#escapeString(String)}
   */
  @Test
  @DisplayName("Test escapeString(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClientWebClient.escapeString(String)"})
  void testEscapeString() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);

    // Act and Assert
    assertEquals(
        "https://example.org/example",
        apiClientWebClient.escapeString("https://example.org/example"));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ApiClientWebClient#getAuthentications()}
   *   <li>{@link ApiClientWebClient#getBasePath()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Map ApiClientWebClient.getAuthentications()",
    "String ApiClientWebClient.getBasePath()"
  })
  void testGettersAndSetters() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);

    // Act
    Map<String, Authentication> actualAuthentications = apiClientWebClient.getAuthentications();

    // Assert
    assertEquals("https://example.org/example", apiClientWebClient.getBasePath());
    assertTrue(actualAuthentications.isEmpty());
  }

  /**
   * Test {@link ApiClientWebClient#addEnforcedAuthenticationScheme(String)}.
   *
   * <p>Method under test: {@link ApiClientWebClient#addEnforcedAuthenticationScheme(String)}
   */
  @Test
  @DisplayName("Test addEnforcedAuthenticationScheme(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiClientWebClient.addEnforcedAuthenticationScheme(String)"})
  void testAddEnforcedAuthenticationScheme() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient =
        new ApiClientWebClient(
            mock(WebClient.class), "https://example.org/example", defaultHeaders);

    // Act
    apiClientWebClient.addEnforcedAuthenticationScheme("https://example.org/example");

    // Assert
    List<String> stringList = apiClientWebClient.enforcedAuthenticationSchemes;
    assertEquals(1, stringList.size());
    assertEquals("https://example.org/example", stringList.get(0));
  }
}
