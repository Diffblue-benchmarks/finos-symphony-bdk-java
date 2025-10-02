package com.symphony.bdk.http.jersey2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.api.Pair;
import com.symphony.bdk.http.api.auth.Authentication;
import com.symphony.bdk.http.api.util.TypeReference;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.Invocation.Builder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.StatusType;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.apache.http.conn.ConnectTimeoutException;
import org.glassfish.jersey.message.internal.OutboundJaxrsResponse;
import org.glassfish.jersey.message.internal.OutboundMessageContext;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

class ApiClientJersey2DiffblueTest {
  /**
   * Test {@link ApiClientJersey2#ApiClientJersey2(Client, String, Map, String)}.
   *
   * <p>Method under test: {@link ApiClientJersey2#ApiClientJersey2(Client, String, Map, String)}
   */
  @Test
  @DisplayName("Test new ApiClientJersey2(Client, String, Map, String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiClientJersey2.<init>(Client, String, Map, String)"})
  void testNewApiClientJersey2() {
    // Arrange
    Client httpClient = mock(Client.class);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act
    ApiClientJersey2 actualApiClientJersey2 =
        new ApiClientJersey2(
            httpClient,
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Assert
    assertEquals("https://example.org/example", actualApiClientJersey2.getBasePath());
    assertEquals("https://example.org/example", actualApiClientJersey2.tempFolderPath);
    assertTrue(actualApiClientJersey2.enforcedAuthenticationSchemes.isEmpty());
    assertTrue(actualApiClientJersey2.getAuthentications().isEmpty());
    assertEquals(defaultHeaders, actualApiClientJersey2.defaultHeaderMap);
  }

  /**
   * Test {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map, Map, String,
   * String, String[], TypeReference)}.
   *
   * <p>Method under test: {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map,
   * Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName(
      "Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ApiClientJersey2.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"
  })
  void testInvokeAPI() throws ApiException {
    // Arrange
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(mock(WebTarget.class));

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            httpClient,
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    apiClientJersey2.addEnforcedAuthenticationScheme("X-Trace-Id");
    ArrayList<Pair> queryParams = new ArrayList<>();
    HashMap<String, String> headerParams = new HashMap<>();
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(
        RuntimeException.class,
        () ->
            apiClientJersey2.invokeAPI(
                "https://example.org/example",
                "https://example.org/example",
                queryParams,
                "Body",
                headerParams,
                cookieParams,
                new HashMap<>(),
                "https://example.org/example",
                "https://example.org/example",
                null,
                mock(TypeReference.class)));
    verify(httpClient).target("https://example.org/examplehttps://example.org/example");
  }

  /**
   * Test {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map, Map, String,
   * String, String[], TypeReference)}.
   *
   * <ul>
   *   <li>Given {@link Invocation.Builder} {@link Invocation.Builder#accept(String[])} throw {@link
   *       RuntimeException#RuntimeException()}.
   *   <li>Then calls {@link Invocation.Builder#accept(String[])}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map,
   * Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName(
      "Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference); given Builder accept(String[]) throw RuntimeException(); then calls accept(String[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ApiClientJersey2.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"
  })
  void testInvokeAPI_givenBuilderAcceptThrowRuntimeException_thenCallsAccept() throws ApiException {
    // Arrange
    Builder builder = mock(Builder.class);
    when(builder.accept(isA(String[].class))).thenThrow(new RuntimeException());

    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder);

    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            httpClient,
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    ArrayList<Pair> queryParams = new ArrayList<>();
    HashMap<String, String> headerParams = new HashMap<>();
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(
        RuntimeException.class,
        () ->
            apiClientJersey2.invokeAPI(
                "https://example.org/example",
                "https://example.org/example",
                queryParams,
                "Body",
                headerParams,
                cookieParams,
                new HashMap<>(),
                "https://example.org/example",
                "https://example.org/example",
                null,
                mock(TypeReference.class)));
    verify(httpClient).target("https://example.org/examplehttps://example.org/example");
    verify(builder).accept(isA(String[].class));
    verify(webTarget).request();
  }

  /**
   * Test {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map, Map, String,
   * String, String[], TypeReference)}.
   *
   * <ul>
   *   <li>Given {@link Invocation.Builder} {@link Invocation.Builder#header(String, Object)} throw
   *       {@link RuntimeException#RuntimeException()}.
   *   <li>Then calls {@link Invocation.Builder#header(String, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map,
   * Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName(
      "Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference); given Builder header(String, Object) throw RuntimeException(); then calls header(String, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ApiClientJersey2.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"
  })
  void testInvokeAPI_givenBuilderHeaderThrowRuntimeException_thenCallsHeader() throws ApiException {
    // Arrange
    Builder builder = mock(Builder.class);
    when(builder.header(Mockito.<String>any(), Mockito.<Object>any()))
        .thenThrow(new RuntimeException());

    Builder builder2 = mock(Builder.class);
    when(builder2.accept(isA(String[].class))).thenReturn(builder);

    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder2);

    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            httpClient,
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    ArrayList<Pair> queryParams = new ArrayList<>();
    HashMap<String, String> headerParams = new HashMap<>();
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(
        RuntimeException.class,
        () ->
            apiClientJersey2.invokeAPI(
                "https://example.org/example",
                "https://example.org/example",
                queryParams,
                "Body",
                headerParams,
                cookieParams,
                new HashMap<>(),
                "https://example.org/example",
                "https://example.org/example",
                null,
                mock(TypeReference.class)));
    verify(httpClient).target("https://example.org/examplehttps://example.org/example");
    verify(builder2).accept(isA(String[].class));
    verify(builder).header(eq("X-Trace-Id"), isA(Object.class));
    verify(webTarget).request();
  }

  /**
   * Test {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map, Map, String,
   * String, String[], TypeReference)}.
   *
   * <ul>
   *   <li>Given {@link Invocation.Builder} {@link Invocation.Builder#header(String, Object)} throw
   *       {@link RuntimeException#RuntimeException()}.
   *   <li>Then calls {@link Invocation.Builder#header(String, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map,
   * Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName(
      "Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference); given Builder header(String, Object) throw RuntimeException(); then calls header(String, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ApiClientJersey2.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"
  })
  void testInvokeAPI_givenBuilderHeaderThrowRuntimeException_thenCallsHeader2()
      throws ApiException {
    // Arrange
    Builder builder = mock(Builder.class);
    when(builder.header(Mockito.<String>any(), Mockito.<Object>any()))
        .thenThrow(new RuntimeException());

    Builder builder2 = mock(Builder.class);
    when(builder2.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder);

    Builder builder3 = mock(Builder.class);
    when(builder3.accept(isA(String[].class))).thenReturn(builder2);

    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder3);

    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            httpClient,
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    ArrayList<Pair> queryParams = new ArrayList<>();
    HashMap<String, String> headerParams = new HashMap<>();
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(
        RuntimeException.class,
        () ->
            apiClientJersey2.invokeAPI(
                "https://example.org/example",
                "https://example.org/example",
                queryParams,
                "Body",
                headerParams,
                cookieParams,
                new HashMap<>(),
                "https://example.org/example",
                "https://example.org/example",
                null,
                mock(TypeReference.class)));
    verify(httpClient).target("https://example.org/examplehttps://example.org/example");
    verify(builder3).accept(isA(String[].class));
    verify(builder).header(eq("Delivered-To"), isA(Object.class));
    verify(builder2).header(eq("X-Trace-Id"), isA(Object.class));
    verify(webTarget).request();
  }

  /**
   * Test {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map, Map, String,
   * String, String[], TypeReference)}.
   *
   * <ul>
   *   <li>Given {@link Client} {@link Client#target(String)} throw {@link
   *       RuntimeException#RuntimeException()}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map,
   * Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName(
      "Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference); given Client target(String) throw RuntimeException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ApiClientJersey2.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"
  })
  void testInvokeAPI_givenClientTargetThrowRuntimeException() throws ApiException {
    // Arrange
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenThrow(new RuntimeException());

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            httpClient,
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    ArrayList<Pair> queryParams = new ArrayList<>();
    HashMap<String, String> headerParams = new HashMap<>();
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(
        RuntimeException.class,
        () ->
            apiClientJersey2.invokeAPI(
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
    verify(httpClient).target("https://example.org/examplehttps://example.org/example");
  }

  /**
   * Test {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map, Map, String,
   * String, String[], TypeReference)}.
   *
   * <ul>
   *   <li>Given {@link WebTarget} {@link WebTarget#queryParam(String, Object[])} throw {@link
   *       RuntimeException#RuntimeException()}.
   *   <li>Then calls {@link WebTarget#queryParam(String, Object[])}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map,
   * Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName(
      "Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference); given WebTarget queryParam(String, Object[]) throw RuntimeException(); then calls queryParam(String, Object[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ApiClientJersey2.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"
  })
  void testInvokeAPI_givenWebTargetQueryParamThrowRuntimeException_thenCallsQueryParam()
      throws ApiException {
    // Arrange
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.queryParam(Mockito.<String>any(), isA(Object[].class)))
        .thenThrow(new RuntimeException());

    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            httpClient,
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    ArrayList<Pair> queryParams = new ArrayList<>();
    queryParams.add(Pair.pair("https://example.org/example", "https://example.org/example"));
    HashMap<String, String> headerParams = new HashMap<>();
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(
        RuntimeException.class,
        () ->
            apiClientJersey2.invokeAPI(
                "https://example.org/example",
                "https://example.org/example",
                queryParams,
                "Body",
                headerParams,
                cookieParams,
                new HashMap<>(),
                "https://example.org/example",
                "https://example.org/example",
                null,
                mock(TypeReference.class)));
    verify(httpClient).target("https://example.org/examplehttps://example.org/example");
    verify(webTarget).queryParam(eq("https://example.org/example"), isA(Object[].class));
  }

  /**
   * Test {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map, Map, String,
   * String, String[], TypeReference)}.
   *
   * <ul>
   *   <li>Given {@link WebTarget} {@link WebTarget#request()} throw {@link
   *       RuntimeException#RuntimeException()}.
   *   <li>Then calls {@link WebTarget#queryParam(String, Object[])}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map,
   * Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName(
      "Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference); given WebTarget request() throw RuntimeException(); then calls queryParam(String, Object[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ApiClientJersey2.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"
  })
  void testInvokeAPI_givenWebTargetRequestThrowRuntimeException_thenCallsQueryParam()
      throws ApiException {
    // Arrange
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenThrow(new RuntimeException());

    WebTarget webTarget2 = mock(WebTarget.class);
    when(webTarget2.queryParam(Mockito.<String>any(), isA(Object[].class))).thenReturn(webTarget);

    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget2);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            httpClient,
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    ArrayList<Pair> queryParams = new ArrayList<>();
    queryParams.add(Pair.pair("https://example.org/example", "https://example.org/example"));
    HashMap<String, String> headerParams = new HashMap<>();
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(
        RuntimeException.class,
        () ->
            apiClientJersey2.invokeAPI(
                "https://example.org/example",
                "https://example.org/example",
                queryParams,
                "Body",
                headerParams,
                cookieParams,
                new HashMap<>(),
                "https://example.org/example",
                "https://example.org/example",
                null,
                mock(TypeReference.class)));
    verify(httpClient).target("https://example.org/examplehttps://example.org/example");
    verify(webTarget2).queryParam(eq("https://example.org/example"), isA(Object[].class));
    verify(webTarget).request();
  }

  /**
   * Test {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map, Map, String,
   * String, String[], TypeReference)}.
   *
   * <ul>
   *   <li>Given {@link WebTarget} {@link WebTarget#request()} throw {@link
   *       RuntimeException#RuntimeException()}.
   *   <li>Then calls {@link WebTarget#request()}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map,
   * Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName(
      "Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference); given WebTarget request() throw RuntimeException(); then calls request()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ApiClientJersey2.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"
  })
  void testInvokeAPI_givenWebTargetRequestThrowRuntimeException_thenCallsRequest()
      throws ApiException {
    // Arrange
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenThrow(new RuntimeException());

    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            httpClient,
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    ArrayList<Pair> queryParams = new ArrayList<>();
    HashMap<String, String> headerParams = new HashMap<>();
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(
        RuntimeException.class,
        () ->
            apiClientJersey2.invokeAPI(
                "https://example.org/example",
                "https://example.org/example",
                queryParams,
                "Body",
                headerParams,
                cookieParams,
                new HashMap<>(),
                "https://example.org/example",
                "https://example.org/example",
                null,
                mock(TypeReference.class)));
    verify(httpClient).target("https://example.org/examplehttps://example.org/example");
    verify(webTarget).request();
  }

  /**
   * Test {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map, Map, String,
   * String, String[], TypeReference)}.
   *
   * <ul>
   *   <li>When array of {@link String} with {@code https://example.org/example}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map,
   * Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName(
      "Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference); when array of String with 'https://example.org/example'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ApiClientJersey2.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"
  })
  void testInvokeAPI_whenArrayOfStringWithHttpsExampleOrgExample() throws ApiException {
    // Arrange
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(mock(WebTarget.class));

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            httpClient,
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    ArrayList<Pair> queryParams = new ArrayList<>();
    HashMap<String, String> headerParams = new HashMap<>();
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(
        RuntimeException.class,
        () ->
            apiClientJersey2.invokeAPI(
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
    verify(httpClient).target("https://example.org/examplehttps://example.org/example");
  }

  /**
   * Test {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map, Map, String,
   * String, String[], TypeReference)}.
   *
   * <ul>
   *   <li>When empty array of {@link String}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map,
   * Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName(
      "Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference); when empty array of String")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ApiClientJersey2.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"
  })
  void testInvokeAPI_whenEmptyArrayOfString() throws ApiException {
    // Arrange
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.queryParam(Mockito.<String>any(), isA(Object[].class)))
        .thenThrow(new RuntimeException());

    WebTarget webTarget2 = mock(WebTarget.class);
    when(webTarget2.queryParam(Mockito.<String>any(), isA(Object[].class))).thenReturn(webTarget);

    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget2);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            httpClient,
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    ArrayList<Pair> queryParams = new ArrayList<>();
    queryParams.add(Pair.pair("https://example.org/example", "https://example.org/example"));
    queryParams.add(Pair.pair("https://example.org/example", "https://example.org/example"));
    HashMap<String, String> headerParams = new HashMap<>();
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(
        RuntimeException.class,
        () ->
            apiClientJersey2.invokeAPI(
                "https://example.org/example",
                "https://example.org/example",
                queryParams,
                "Body",
                headerParams,
                cookieParams,
                new HashMap<>(),
                "https://example.org/example",
                "https://example.org/example",
                new String[] {},
                mock(TypeReference.class)));
    verify(httpClient).target("https://example.org/examplehttps://example.org/example");
    verify(webTarget2).queryParam(eq("https://example.org/example"), isA(Object[].class));
    verify(webTarget).queryParam(eq("https://example.org/example"), isA(Object[].class));
  }

  /**
   * Test {@link ApiClientJersey2#parameterToString(Object)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#parameterToString(Object)}
   */
  @Test
  @DisplayName(
      "Test parameterToString(Object); given '42'; when ArrayList() add '42'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClientJersey2.parameterToString(Object)"})
  void testParameterToString_given42_whenArrayListAdd42_thenReturn42() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    // Act and Assert
    assertEquals("42", apiClientJersey2.parameterToString(objectList));
  }

  /**
   * Test {@link ApiClientJersey2#parameterToString(Object)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 42,42}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#parameterToString(Object)}
   */
  @Test
  @DisplayName(
      "Test parameterToString(Object); given '42'; when ArrayList() add '42'; then return '42,42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClientJersey2.parameterToString(Object)"})
  void testParameterToString_given42_whenArrayListAdd42_thenReturn4242() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");

    // Act and Assert
    assertEquals("42,42", apiClientJersey2.parameterToString(objectList));
  }

  /**
   * Test {@link ApiClientJersey2#parameterToString(Object)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#parameterToString(Object)}
   */
  @Test
  @DisplayName("Test parameterToString(Object); when ArrayList(); then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClientJersey2.parameterToString(Object)"})
  void testParameterToString_whenArrayList_thenReturnEmptyString() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act and Assert
    assertEquals("", apiClientJersey2.parameterToString(new ArrayList<>()));
  }

  /**
   * Test {@link ApiClientJersey2#parameterToString(Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#parameterToString(Object)}
   */
  @Test
  @DisplayName("Test parameterToString(Object); when 'null'; then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClientJersey2.parameterToString(Object)"})
  void testParameterToString_whenNull_thenReturnEmptyString() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act and Assert
    assertEquals("", apiClientJersey2.parameterToString(null));
  }

  /**
   * Test {@link ApiClientJersey2#parameterToString(Object)}.
   *
   * <ul>
   *   <li>When {@code Param}.
   *   <li>Then return {@code Param}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#parameterToString(Object)}
   */
  @Test
  @DisplayName("Test parameterToString(Object); when 'Param'; then return 'Param'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClientJersey2.parameterToString(Object)"})
  void testParameterToString_whenParam_thenReturnParam() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act and Assert
    assertEquals("Param", apiClientJersey2.parameterToString("Param"));
  }

  /**
   * Test {@link ApiClientJersey2#parameterToPairs(String, String, Object)}.
   *
   * <p>Method under test: {@link ApiClientJersey2#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName("Test parameterToPairs(String, String, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClientJersey2.parameterToPairs(String, String, Object)"})
  void testParameterToPairs() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    ArrayList<Pair> pairList = new ArrayList<>();
    pairList.add(Pair.pair("https://example.org/example", "https://example.org/example"));

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(pairList);

    // Act
    List<Pair> actualParameterToPairsResult =
        apiClientJersey2.parameterToPairs(null, "https://example.org/example", objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    assertEquals("https://example.org/example", actualParameterToPairsResult.get(0).getName());
  }

  /**
   * Test {@link ApiClientJersey2#parameterToPairs(String, String, Object)}.
   *
   * <p>Method under test: {@link ApiClientJersey2#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName("Test parameterToPairs(String, String, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClientJersey2.parameterToPairs(String, String, Object)"})
  void testParameterToPairs2() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    ArrayList<Pair> pairList = new ArrayList<>();
    pairList.add(Pair.pair("https://example.org/example", "https://example.org/example"));
    pairList.add(Pair.pair("https://example.org/example", "https://example.org/example"));

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(pairList);

    // Act
    List<Pair> actualParameterToPairsResult =
        apiClientJersey2.parameterToPairs(null, "https://example.org/example", objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    assertEquals("https://example.org/example", actualParameterToPairsResult.get(0).getName());
  }

  /**
   * Test {@link ApiClientJersey2#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code null}.
   *   <li>Then return first Value is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName(
      "Test parameterToPairs(String, String, Object); given ArrayList() add 'null'; then return first Value is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClientJersey2.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_givenArrayListAddNull_thenReturnFirstValueIsNull() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    ArrayList<Pair> pairList = new ArrayList<>();
    pairList.add(null);

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(pairList);

    // Act
    List<Pair> actualParameterToPairsResult =
        apiClientJersey2.parameterToPairs(null, "https://example.org/example", objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("https://example.org/example", getResult.getName());
    assertEquals("null", getResult.getValue());
  }

  /**
   * Test {@link ApiClientJersey2#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()}.
   *   <li>Then return first Value is empty string.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName(
      "Test parameterToPairs(String, String, Object); given ArrayList(); then return first Value is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClientJersey2.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_givenArrayList_thenReturnFirstValueIsEmptyString() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(new ArrayList<>());

    // Act
    List<Pair> actualParameterToPairsResult =
        apiClientJersey2.parameterToPairs(null, "https://example.org/example", objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("", getResult.getValue());
    assertEquals("https://example.org/example", getResult.getName());
  }

  /**
   * Test {@link ApiClientJersey2#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When empty string.
   *   <li>Then return first Value is empty string.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName(
      "Test parameterToPairs(String, String, Object); given 'null'; when empty string; then return first Value is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClientJersey2.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_givenNull_whenEmptyString_thenReturnFirstValueIsEmptyString() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(null);

    // Act
    List<Pair> actualParameterToPairsResult =
        apiClientJersey2.parameterToPairs("", "https://example.org/example", objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("", getResult.getValue());
    assertEquals("https://example.org/example", getResult.getName());
  }

  /**
   * Test {@link ApiClientJersey2#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link LinkedHashSet#LinkedHashSet()} add {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName(
      "Test parameterToPairs(String, String, Object); given 'null'; when LinkedHashSet() add 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClientJersey2.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_givenNull_whenLinkedHashSetAddNull() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(null);

    // Act
    List<Pair> actualParameterToPairsResult =
        apiClientJersey2.parameterToPairs(null, "https://example.org/example", objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("", getResult.getValue());
    assertEquals("https://example.org/example", getResult.getName());
  }

  /**
   * Test {@link ApiClientJersey2#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@code multi}.
   *   <li>Then return first Value is empty string.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName(
      "Test parameterToPairs(String, String, Object); given 'null'; when 'multi'; then return first Value is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClientJersey2.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_givenNull_whenMulti_thenReturnFirstValueIsEmptyString() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(null);

    // Act
    List<Pair> actualParameterToPairsResult =
        apiClientJersey2.parameterToPairs("multi", "https://example.org/example", objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("", getResult.getValue());
    assertEquals("https://example.org/example", getResult.getName());
  }

  /**
   * Test {@link ApiClientJersey2#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>Given pair {@code https://example.org/example} and {@code https://example.org/example}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName(
      "Test parameterToPairs(String, String, Object); given pair 'https://example.org/example' and 'https://example.org/example'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClientJersey2.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_givenPairHttpsExampleOrgExampleAndHttpsExampleOrgExample() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    ArrayList<Pair> pairList = new ArrayList<>();
    pairList.add(Pair.pair("https://example.org/example", "https://example.org/example"));

    // Act
    List<Pair> actualParameterToPairsResult =
        apiClientJersey2.parameterToPairs(
            "https://example.org/example", "https://example.org/example", pairList);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    assertEquals("https://example.org/example", actualParameterToPairsResult.get(0).getName());
  }

  /**
   * Test {@link ApiClientJersey2#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName("Test parameterToPairs(String, String, Object); when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClientJersey2.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_whenArrayList_thenReturnEmpty() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act and Assert
    assertTrue(
        apiClientJersey2
            .parameterToPairs(
                "https://example.org/example", "https://example.org/example", new ArrayList<>())
            .isEmpty());
  }

  /**
   * Test {@link ApiClientJersey2#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName(
      "Test parameterToPairs(String, String, Object); when empty string; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClientJersey2.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_whenEmptyString_thenReturnEmpty() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act and Assert
    assertTrue(apiClientJersey2.parameterToPairs(null, "", null).isEmpty());
  }

  /**
   * Test {@link ApiClientJersey2#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName("Test parameterToPairs(String, String, Object); when 'null'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClientJersey2.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_whenNull_thenReturnEmpty() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act and Assert
    assertTrue(apiClientJersey2.parameterToPairs(null, null, null).isEmpty());
  }

  /**
   * Test {@link ApiClientJersey2#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName("Test parameterToPairs(String, String, Object); when 'null'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClientJersey2.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_whenNull_thenReturnEmpty2() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act and Assert
    assertTrue(
        apiClientJersey2.parameterToPairs(null, "https://example.org/example", null).isEmpty());
  }

  /**
   * Test {@link ApiClientJersey2#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>When {@code Value}.
   *   <li>Then return first Value is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName(
      "Test parameterToPairs(String, String, Object); when 'Value'; then return first Value is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClientJersey2.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_whenValue_thenReturnFirstValueIsValue() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act
    List<Pair> actualParameterToPairsResult =
        apiClientJersey2.parameterToPairs(
            "https://example.org/example", "https://example.org/example", "Value");

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("Value", getResult.getValue());
    assertEquals("https://example.org/example", getResult.getName());
  }

  /**
   * Test {@link ApiClientJersey2#selectHeaderAccept(String[])}.
   *
   * <ul>
   *   <li>Then return {@code application/json ;U}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#selectHeaderAccept(String[])}
   */
  @Test
  @DisplayName("Test selectHeaderAccept(String[]); then return 'application/json ;U'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClientJersey2.selectHeaderAccept(String[])"})
  void testSelectHeaderAccept_thenReturnApplicationJsonU() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act
    String actualSelectHeaderAcceptResult =
        apiClientJersey2.selectHeaderAccept(
            new String[] {"https://example.org/example", "application/json ;U"});

    // Assert
    assertEquals("application/json ;U", actualSelectHeaderAcceptResult);
  }

  /**
   * Test {@link ApiClientJersey2#selectHeaderAccept(String[])}.
   *
   * <ul>
   *   <li>Then return {@code * /*}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#selectHeaderAccept(String[])}
   */
  @Test
  @DisplayName("Test selectHeaderAccept(String[]); then return '*/*'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClientJersey2.selectHeaderAccept(String[])"})
  void testSelectHeaderAccept_thenReturnAsteriskSlashAsterisk() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act
    String actualSelectHeaderAcceptResult =
        apiClientJersey2.selectHeaderAccept(new String[] {"*/*"});

    // Assert
    assertEquals("*/*", actualSelectHeaderAcceptResult);
  }

  /**
   * Test {@link ApiClientJersey2#selectHeaderAccept(String[])}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#selectHeaderAccept(String[])}
   */
  @Test
  @DisplayName("Test selectHeaderAccept(String[]); then return 'https://example.org/example'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClientJersey2.selectHeaderAccept(String[])"})
  void testSelectHeaderAccept_thenReturnHttpsExampleOrgExample() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act
    String actualSelectHeaderAcceptResult =
        apiClientJersey2.selectHeaderAccept(new String[] {"https://example.org/example"});

    // Assert
    assertEquals("https://example.org/example", actualSelectHeaderAcceptResult);
  }

  /**
   * Test {@link ApiClientJersey2#selectHeaderAccept(String[])}.
   *
   * <ul>
   *   <li>When array of {@link String} with {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#selectHeaderAccept(String[])}
   */
  @Test
  @DisplayName(
      "Test selectHeaderAccept(String[]); when array of String with 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClientJersey2.selectHeaderAccept(String[])"})
  void testSelectHeaderAccept_whenArrayOfStringWithNull_thenReturnNull() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act
    String actualSelectHeaderAcceptResult =
        apiClientJersey2.selectHeaderAccept(new String[] {null});

    // Assert
    assertEquals("null", actualSelectHeaderAcceptResult);
  }

  /**
   * Test {@link ApiClientJersey2#selectHeaderAccept(String[])}.
   *
   * <ul>
   *   <li>When empty array of {@link String}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#selectHeaderAccept(String[])}
   */
  @Test
  @DisplayName("Test selectHeaderAccept(String[]); when empty array of String; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClientJersey2.selectHeaderAccept(String[])"})
  void testSelectHeaderAccept_whenEmptyArrayOfString_thenReturnNull() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act
    String actualSelectHeaderAcceptResult = apiClientJersey2.selectHeaderAccept(new String[] {});

    // Assert
    assertNull(actualSelectHeaderAcceptResult);
  }

  /**
   * Test {@link ApiClientJersey2#selectHeaderContentType(String[])}.
   *
   * <ul>
   *   <li>Then return {@code application/json ;U}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#selectHeaderContentType(String[])}
   */
  @Test
  @DisplayName("Test selectHeaderContentType(String[]); then return 'application/json ;U'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClientJersey2.selectHeaderContentType(String[])"})
  void testSelectHeaderContentType_thenReturnApplicationJsonU() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act
    String actualSelectHeaderContentTypeResult =
        apiClientJersey2.selectHeaderContentType(new String[] {"application/json ;U"});

    // Assert
    assertEquals("application/json ;U", actualSelectHeaderContentTypeResult);
  }

  /**
   * Test {@link ApiClientJersey2#selectHeaderContentType(String[])}.
   *
   * <ul>
   *   <li>Then return {@code * /*}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#selectHeaderContentType(String[])}
   */
  @Test
  @DisplayName("Test selectHeaderContentType(String[]); then return '*/*'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClientJersey2.selectHeaderContentType(String[])"})
  void testSelectHeaderContentType_thenReturnAsteriskSlashAsterisk() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act
    String actualSelectHeaderContentTypeResult =
        apiClientJersey2.selectHeaderContentType(new String[] {"*/*"});

    // Assert
    assertEquals("*/*", actualSelectHeaderContentTypeResult);
  }

  /**
   * Test {@link ApiClientJersey2#selectHeaderContentType(String[])}.
   *
   * <ul>
   *   <li>When array of {@link String} with {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#selectHeaderContentType(String[])}
   */
  @Test
  @DisplayName(
      "Test selectHeaderContentType(String[]); when array of String with 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClientJersey2.selectHeaderContentType(String[])"})
  void testSelectHeaderContentType_whenArrayOfStringWithNull_thenReturnNull() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act
    String actualSelectHeaderContentTypeResult =
        apiClientJersey2.selectHeaderContentType(new String[] {null});

    // Assert
    assertNull(actualSelectHeaderContentTypeResult);
  }

  /**
   * Test {@link ApiClientJersey2#selectHeaderContentType(String[])}.
   *
   * <ul>
   *   <li>When array of {@link String} with {@code text/plain}.
   *   <li>Then return {@code text/plain}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#selectHeaderContentType(String[])}
   */
  @Test
  @DisplayName(
      "Test selectHeaderContentType(String[]); when array of String with 'text/plain'; then return 'text/plain'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClientJersey2.selectHeaderContentType(String[])"})
  void testSelectHeaderContentType_whenArrayOfStringWithTextPlain_thenReturnTextPlain() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act
    String actualSelectHeaderContentTypeResult =
        apiClientJersey2.selectHeaderContentType(new String[] {"text/plain"});

    // Assert
    assertEquals("text/plain", actualSelectHeaderContentTypeResult);
  }

  /**
   * Test {@link ApiClientJersey2#selectHeaderContentType(String[])}.
   *
   * <ul>
   *   <li>When empty array of {@link String}.
   *   <li>Then return {@code application/json}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#selectHeaderContentType(String[])}
   */
  @Test
  @DisplayName(
      "Test selectHeaderContentType(String[]); when empty array of String; then return 'application/json'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClientJersey2.selectHeaderContentType(String[])"})
  void testSelectHeaderContentType_whenEmptyArrayOfString_thenReturnApplicationJson() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act
    String actualSelectHeaderContentTypeResult =
        apiClientJersey2.selectHeaderContentType(new String[] {});

    // Assert
    assertEquals("application/json", actualSelectHeaderContentTypeResult);
  }

  /**
   * Test {@link ApiClientJersey2#escapeString(String)}.
   *
   * <p>Method under test: {@link ApiClientJersey2#escapeString(String)}
   */
  @Test
  @DisplayName("Test escapeString(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClientJersey2.escapeString(String)"})
  void testEscapeString() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act and Assert
    assertEquals(
        "https%3A%2F%2Fexample.org%2Fexample",
        apiClientJersey2.escapeString("https://example.org/example"));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ApiClientJersey2#getAuthentications()}
   *   <li>{@link ApiClientJersey2#getBasePath()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Map ApiClientJersey2.getAuthentications()",
    "String ApiClientJersey2.getBasePath()"
  })
  void testGettersAndSetters() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act
    Map<String, Authentication> actualAuthentications = apiClientJersey2.getAuthentications();

    // Assert
    assertEquals("https://example.org/example", apiClientJersey2.getBasePath());
    assertTrue(actualAuthentications.isEmpty());
  }

  /**
   * Test {@link ApiClientJersey2#addEnforcedAuthenticationScheme(String)}.
   *
   * <p>Method under test: {@link ApiClientJersey2#addEnforcedAuthenticationScheme(String)}
   */
  @Test
  @DisplayName("Test addEnforcedAuthenticationScheme(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiClientJersey2.addEnforcedAuthenticationScheme(String)"})
  void testAddEnforcedAuthenticationScheme() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act
    apiClientJersey2.addEnforcedAuthenticationScheme("https://example.org/example");

    // Assert
    List<String> stringList = apiClientJersey2.enforcedAuthenticationSchemes;
    assertEquals(1, stringList.size());
    assertEquals("https://example.org/example", stringList.get(0));
  }

  /**
   * Test {@link ApiClientJersey2#isJsonMime(String)}.
   *
   * <ul>
   *   <li>When {@code application/json ;U}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#isJsonMime(String)}
   */
  @Test
  @DisplayName("Test isJsonMime(String); when 'application/json ;U'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ApiClientJersey2.isJsonMime(String)"})
  void testIsJsonMime_whenApplicationJsonU_thenReturnTrue() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act and Assert
    assertTrue(apiClientJersey2.isJsonMime("application/json ;U"));
  }

  /**
   * Test {@link ApiClientJersey2#isJsonMime(String)}.
   *
   * <ul>
   *   <li>When {@code * /*}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#isJsonMime(String)}
   */
  @Test
  @DisplayName("Test isJsonMime(String); when '*/*'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ApiClientJersey2.isJsonMime(String)"})
  void testIsJsonMime_whenAsteriskSlashAsterisk_thenReturnTrue() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act and Assert
    assertTrue(apiClientJersey2.isJsonMime("*/*"));
  }

  /**
   * Test {@link ApiClientJersey2#isJsonMime(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#isJsonMime(String)}
   */
  @Test
  @DisplayName("Test isJsonMime(String); when 'https://example.org/example'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ApiClientJersey2.isJsonMime(String)"})
  void testIsJsonMime_whenHttpsExampleOrgExample_thenReturnFalse() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act and Assert
    assertFalse(apiClientJersey2.isJsonMime("https://example.org/example"));
  }

  /**
   * Test {@link ApiClientJersey2#isJsonMime(String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#isJsonMime(String)}
   */
  @Test
  @DisplayName("Test isJsonMime(String); when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ApiClientJersey2.isJsonMime(String)"})
  void testIsJsonMime_whenNull_thenReturnFalse() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act and Assert
    assertFalse(apiClientJersey2.isJsonMime(null));
  }

  /**
   * Test {@link ApiClientJersey2#deserialize(Response, GenericType)}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#deserialize(Response, GenericType)}
   */
  @Test
  @DisplayName("Test deserialize(Response, GenericType); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ApiClientJersey2.deserialize(Response, GenericType)"})
  void testDeserialize_thenReturnNull() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class), "https://example.org/example", defaultHeaders, null);

    // Act and Assert
    assertNull(apiClientJersey2.deserialize(null, null));
  }

  /**
   * Test {@link ApiClientJersey2#deserialize(Response, GenericType)}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#deserialize(Response, GenericType)}
   */
  @Test
  @DisplayName("Test deserialize(Response, GenericType); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ApiClientJersey2.deserialize(Response, GenericType)"})
  void testDeserialize_thenReturnNull2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class), "https://example.org/example", defaultHeaders, null);
    StatusType status = mock(StatusType.class);
    OutboundJaxrsResponse response =
        new OutboundJaxrsResponse(status, new OutboundMessageContext());

    // Act and Assert
    assertNull(apiClientJersey2.deserialize(response, null));
  }

  /**
   * Test {@link ApiClientJersey2#downloadFileFromResponse(Response)}.
   *
   * <ul>
   *   <li>Given {@link File} {@link File#createTempFile(String, String, File)} throw {@link
   *       RuntimeException#RuntimeException()}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#downloadFileFromResponse(Response)}
   */
  @Test
  @DisplayName(
      "Test downloadFileFromResponse(Response); given File createTempFile(String, String, File) throw RuntimeException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"File ApiClientJersey2.downloadFileFromResponse(Response)"})
  void testDownloadFileFromResponse_givenFileCreateTempFileThrowRuntimeException()
      throws ApiException, IOException {
    // Arrange
    try (MockedStatic<File> mockFile = mockStatic(File.class)) {
      mockFile
          .when(
              () ->
                  File.createTempFile(
                      Mockito.<String>any(), Mockito.<String>any(), Mockito.<File>any()))
          .thenThrow(new RuntimeException());

      HashMap<String, String> defaultHeaders = new HashMap<>();
      defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
      ApiClientJersey2 apiClientJersey2 =
          new ApiClientJersey2(
              mock(Client.class),
              "https://example.org/example",
              defaultHeaders,
              "https://example.org/example");
      StatusType status = mock(StatusType.class);
      OutboundJaxrsResponse response =
          new OutboundJaxrsResponse(status, new OutboundMessageContext());

      // Act and Assert
      assertThrows(
          RuntimeException.class, () -> apiClientJersey2.downloadFileFromResponse(response));
      mockFile.verify(
          () ->
              File.createTempFile(
                  Mockito.<String>any(), Mockito.<String>any(), Mockito.<File>any()));
    }
  }

  /**
   * Test {@link ApiClientJersey2#downloadFileFromResponse(Response)}.
   *
   * <ul>
   *   <li>Then calls {@link File#createTempFile(String, String)}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#downloadFileFromResponse(Response)}
   */
  @Test
  @DisplayName("Test downloadFileFromResponse(Response); then calls createTempFile(String, String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"File ApiClientJersey2.downloadFileFromResponse(Response)"})
  void testDownloadFileFromResponse_thenCallsCreateTempFile() throws ApiException, IOException {
    // Arrange
    try (MockedStatic<File> mockFile = mockStatic(File.class)) {
      mockFile
          .when(() -> File.createTempFile(Mockito.<String>any(), Mockito.<String>any()))
          .thenThrow(new RuntimeException());
      mockFile
          .when(
              () ->
                  File.createTempFile(
                      Mockito.<String>any(), Mockito.<String>any(), Mockito.<File>any()))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());

      HashMap<String, String> defaultHeaders = new HashMap<>();
      defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
      ApiClientJersey2 apiClientJersey2 =
          new ApiClientJersey2(
              mock(Client.class), "https://example.org/example", defaultHeaders, null);
      StatusType status = mock(StatusType.class);
      OutboundJaxrsResponse response =
          new OutboundJaxrsResponse(status, new OutboundMessageContext());

      // Act and Assert
      assertThrows(
          RuntimeException.class, () -> apiClientJersey2.downloadFileFromResponse(response));
      mockFile.verify(() -> File.createTempFile(Mockito.<String>any(), Mockito.<String>any()));
    }
  }

  /**
   * Test {@link ApiClientJersey2#downloadFileFromResponse(Response)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#downloadFileFromResponse(Response)}
   */
  @Test
  @DisplayName("Test downloadFileFromResponse(Response); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"File ApiClientJersey2.downloadFileFromResponse(Response)"})
  void testDownloadFileFromResponse_thenThrowApiException() throws ApiException, IOException {
    // Arrange
    try (MockedStatic<File> mockFile = mockStatic(File.class)) {
      mockFile
          .when(
              () ->
                  File.createTempFile(
                      Mockito.<String>any(), Mockito.<String>any(), Mockito.<File>any()))
          .thenThrow(new ConnectTimeoutException("https://example.org/example"));

      HashMap<String, String> defaultHeaders = new HashMap<>();
      defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
      ApiClientJersey2 apiClientJersey2 =
          new ApiClientJersey2(
              mock(Client.class),
              "https://example.org/example",
              defaultHeaders,
              "https://example.org/example");
      StatusType status = mock(StatusType.class);
      OutboundJaxrsResponse response =
          new OutboundJaxrsResponse(status, new OutboundMessageContext());

      // Act and Assert
      assertThrows(ApiException.class, () -> apiClientJersey2.downloadFileFromResponse(response));
      mockFile.verify(
          () ->
              File.createTempFile(
                  Mockito.<String>any(), Mockito.<String>any(), Mockito.<File>any()));
    }
  }

  /**
   * Test {@link ApiClientJersey2#buildResponseHeaders(Response)}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#buildResponseHeaders(Response)}
   */
  @Test
  @DisplayName("Test buildResponseHeaders(Response); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map ApiClientJersey2.buildResponseHeaders(Response)"})
  void testBuildResponseHeaders_thenReturnEmpty() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StatusType status = mock(StatusType.class);
    OutboundJaxrsResponse response =
        new OutboundJaxrsResponse(status, new OutboundMessageContext());

    // Act
    Map<String, List<String>> actualBuildResponseHeadersResult =
        apiClientJersey2.buildResponseHeaders(response);

    // Assert
    assertTrue(actualBuildResponseHeadersResult.isEmpty());
  }

  /**
   * Test {@link ApiClientJersey2#updateParamsForAuth(String[], Map)}.
   *
   * <p>Method under test: {@link ApiClientJersey2#updateParamsForAuth(String[], Map)}
   */
  @Test
  @DisplayName("Test updateParamsForAuth(String[], Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiClientJersey2.updateParamsForAuth(String[], Map)"})
  void testUpdateParamsForAuth() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    apiClientJersey2.addEnforcedAuthenticationScheme("https://example.org/example");

    // Act and Assert
    assertThrows(
        RuntimeException.class, () -> apiClientJersey2.updateParamsForAuth(null, new HashMap<>()));
  }

  /**
   * Test {@link ApiClientJersey2#updateParamsForAuth(String[], Map)}.
   *
   * <ul>
   *   <li>When array of {@link String} with {@code https://example.org/example}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClientJersey2#updateParamsForAuth(String[], Map)}
   */
  @Test
  @DisplayName(
      "Test updateParamsForAuth(String[], Map); when array of String with 'https://example.org/example'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiClientJersey2.updateParamsForAuth(String[], Map)"})
  void testUpdateParamsForAuth_whenArrayOfStringWithHttpsExampleOrgExample() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act and Assert
    assertThrows(
        RuntimeException.class,
        () ->
            apiClientJersey2.updateParamsForAuth(
                new String[] {"https://example.org/example"}, new HashMap<>()));
  }
}
