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
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.api.Pair;
import com.symphony.bdk.http.api.auth.Authentication;
import com.symphony.bdk.http.api.util.TypeReference;
import jakarta.ws.rs.ProcessingException;
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
   * <p>
   * Method under test: {@link ApiClientJersey2#ApiClientJersey2(Client, String, Map, String)}
   */
  @Test
  @DisplayName("Test new ApiClientJersey2(Client, String, Map, String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ApiClientJersey2.<init>(Client, String, Map, String)"})
  void testNewApiClientJersey2() {
    // Arrange
    Client httpClient = mock(Client.class);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act
    ApiClientJersey2 actualApiClientJersey2 = new ApiClientJersey2(httpClient, "https://example.org/example",
        defaultHeaders, "https://example.org/example");

    // Assert
    assertEquals("https://example.org/example", actualApiClientJersey2.getBasePath());
    assertEquals("https://example.org/example", actualApiClientJersey2.tempFolderPath);
    assertTrue(actualApiClientJersey2.enforcedAuthenticationSchemes.isEmpty());
    assertTrue(actualApiClientJersey2.getAuthentications().isEmpty());
    assertEquals(defaultHeaders, actualApiClientJersey2.defaultHeaderMap);
  }

  /**
   * Test {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)}.
   * <p>
   * Method under test: {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName("Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse ApiClientJersey2.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"})
  void testInvokeAPI() throws ApiException {
    // Arrange
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(mock(WebTarget.class));

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    ApiClientJersey2 apiClientJersey2 = new ApiClientJersey2(httpClient, "https://example.org/example", defaultHeaders,
        "https://example.org/example");
    apiClientJersey2.addEnforcedAuthenticationScheme("X-Trace-Id");
    ArrayList<Pair> queryParams = new ArrayList<>();
    HashMap<String, String> headerParams = new HashMap<>();
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(RuntimeException.class,
        () -> apiClientJersey2.<Object>invokeAPI("https://example.org/example", "https://example.org/example",
            queryParams, "Body", headerParams, cookieParams, new HashMap<>(), "https://example.org/example",
            "https://example.org/example", null, mock(TypeReference.class)));
    verify(httpClient).target(eq("https://example.org/examplehttps://example.org/example"));
  }

  /**
   * Test {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)}.
   * <ul>
   *   <li>Given {@link Invocation.Builder} {@link Invocation.Builder#accept(String[])} throw {@link RuntimeException#RuntimeException(String)} with {@code X-Trace-Id}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName("Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference); given Builder accept(String[]) throw RuntimeException(String) with 'X-Trace-Id'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse ApiClientJersey2.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"})
  void testInvokeAPI_givenBuilderAcceptThrowRuntimeExceptionWithXTraceId() throws ApiException {
    // Arrange
    Builder builder = mock(Builder.class);
    when(builder.accept(isA(String[].class))).thenReturn(mock(Builder.class));
    Builder builder2 = mock(Builder.class);
    when(builder2.accept(isA(String[].class))).thenReturn(mock(Builder.class));
    Builder builder3 = mock(Builder.class);
    when(builder3.accept(isA(String[].class))).thenReturn(mock(Builder.class));
    Builder builder4 = mock(Builder.class);
    when(builder4.accept(isA(String[].class))).thenThrow(new RuntimeException("X-Trace-Id"));
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder4);
    WebTarget webTarget2 = mock(WebTarget.class);
    when(webTarget2.queryParam(Mockito.<String>any(), isA(Object[].class))).thenReturn(webTarget);
    when(webTarget2.request()).thenReturn(builder3);
    WebTarget webTarget3 = mock(WebTarget.class);
    when(webTarget3.queryParam(Mockito.<String>any(), isA(Object[].class))).thenReturn(webTarget2);
    when(webTarget3.request()).thenReturn(builder2);
    WebTarget webTarget4 = mock(WebTarget.class);
    when(webTarget4.queryParam(Mockito.<String>any(), isA(Object[].class))).thenReturn(webTarget3);
    when(webTarget4.request()).thenReturn(builder);
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget4);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 = new ApiClientJersey2(httpClient, "https://example.org/example", defaultHeaders,
        "https://example.org/example");

    ArrayList<Pair> queryParams = new ArrayList<>();
    queryParams.add(Pair.pair("https://example.org/example", "https://example.org/example"));
    queryParams.add(Pair.pair("https://example.org/example", "https://example.org/example"));
    queryParams.add(Pair.pair("https://example.org/example", "https://example.org/example"));
    HashMap<String, String> headerParams = new HashMap<>();
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(RuntimeException.class,
        () -> apiClientJersey2.<Object>invokeAPI("https://example.org/example", "https://example.org/example",
            queryParams, "Body", headerParams, cookieParams, new HashMap<>(), "https://example.org/example",
            "https://example.org/example", null, mock(TypeReference.class)));
    verify(httpClient).target(eq("https://example.org/examplehttps://example.org/example"));
    verify(builder4).accept(isA(String[].class));
    verify(webTarget4).queryParam(eq("https://example.org/example"), isA(Object[].class));
    verify(webTarget3).queryParam(eq("https://example.org/example"), isA(Object[].class));
    verify(webTarget2).queryParam(eq("https://example.org/example"), isA(Object[].class));
    verify(webTarget).request();
  }

  /**
   * Test {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)}.
   * <ul>
   *   <li>Given {@link WebTarget} {@link WebTarget#queryParam(String, Object[])} throw {@link RuntimeException#RuntimeException(String)} with {@code +}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName("Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference); given WebTarget queryParam(String, Object[]) throw RuntimeException(String) with '+'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse ApiClientJersey2.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"})
  void testInvokeAPI_givenWebTargetQueryParamThrowRuntimeExceptionWithPlusSign() throws ApiException {
    // Arrange
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.queryParam(Mockito.<String>any(), isA(Object[].class))).thenThrow(new RuntimeException("+"));
    WebTarget webTarget2 = mock(WebTarget.class);
    when(webTarget2.queryParam(Mockito.<String>any(), isA(Object[].class))).thenReturn(webTarget);
    WebTarget webTarget3 = mock(WebTarget.class);
    when(webTarget3.queryParam(Mockito.<String>any(), isA(Object[].class))).thenReturn(webTarget2);
    WebTarget webTarget4 = mock(WebTarget.class);
    when(webTarget4.queryParam(Mockito.<String>any(), isA(Object[].class))).thenReturn(webTarget3);
    WebTarget webTarget5 = mock(WebTarget.class);
    when(webTarget5.queryParam(Mockito.<String>any(), isA(Object[].class))).thenReturn(webTarget4);
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget5);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 = new ApiClientJersey2(httpClient, "https://example.org/example", defaultHeaders,
        "https://example.org/example");

    ArrayList<Pair> queryParams = new ArrayList<>();
    queryParams.add(Pair.pair("https://example.org/example", "https://example.org/example"));
    queryParams.add(Pair.pair("https://example.org/example", "https://example.org/example"));
    queryParams.add(Pair.pair("https://example.org/example", "https://example.org/example"));
    queryParams.add(Pair.pair("https://example.org/example", "https://example.org/example"));
    queryParams.add(Pair.pair("https://example.org/example", "https://example.org/example"));
    HashMap<String, String> headerParams = new HashMap<>();
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(RuntimeException.class,
        () -> apiClientJersey2.<Object>invokeAPI("https://example.org/example", "https://example.org/example",
            queryParams, "Body", headerParams, cookieParams, new HashMap<>(), "https://example.org/example",
            "https://example.org/example", null, mock(TypeReference.class)));
    verify(httpClient).target(eq("https://example.org/examplehttps://example.org/example"));
    verify(webTarget5).queryParam(eq("https://example.org/example"), isA(Object[].class));
    verify(webTarget4).queryParam(eq("https://example.org/example"), isA(Object[].class));
    verify(webTarget3).queryParam(eq("https://example.org/example"), isA(Object[].class));
    verify(webTarget2).queryParam(eq("https://example.org/example"), isA(Object[].class));
    verify(webTarget).queryParam(eq("https://example.org/example"), isA(Object[].class));
  }

  /**
   * Test {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)}.
   * <ul>
   *   <li>Given {@link WebTarget} {@link WebTarget#request()} throw {@link RuntimeException#RuntimeException(String)} with {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName("Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference); given WebTarget request() throw RuntimeException(String) with 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse ApiClientJersey2.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"})
  void testInvokeAPI_givenWebTargetRequestThrowRuntimeExceptionWithFoo() throws ApiException {
    // Arrange
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenThrow(new RuntimeException("foo"));
    WebTarget webTarget2 = mock(WebTarget.class);
    when(webTarget2.queryParam(Mockito.<String>any(), isA(Object[].class))).thenReturn(webTarget);
    when(webTarget2.request()).thenReturn(mock(Builder.class));
    WebTarget webTarget3 = mock(WebTarget.class);
    when(webTarget3.queryParam(Mockito.<String>any(), isA(Object[].class))).thenReturn(webTarget2);
    when(webTarget3.request()).thenReturn(mock(Builder.class));
    WebTarget webTarget4 = mock(WebTarget.class);
    when(webTarget4.queryParam(Mockito.<String>any(), isA(Object[].class))).thenReturn(webTarget3);
    when(webTarget4.request()).thenReturn(mock(Builder.class));
    WebTarget webTarget5 = mock(WebTarget.class);
    when(webTarget5.queryParam(Mockito.<String>any(), isA(Object[].class))).thenReturn(webTarget4);
    when(webTarget5.request()).thenReturn(mock(Builder.class));
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget5);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 = new ApiClientJersey2(httpClient, "https://example.org/example", defaultHeaders,
        "https://example.org/example");

    ArrayList<Pair> queryParams = new ArrayList<>();
    queryParams.add(Pair.pair("https://example.org/example", "https://example.org/example"));
    queryParams.add(Pair.pair("https://example.org/example", "https://example.org/example"));
    queryParams.add(Pair.pair("https://example.org/example", "https://example.org/example"));
    queryParams.add(Pair.pair("https://example.org/example", "https://example.org/example"));
    HashMap<String, String> headerParams = new HashMap<>();
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(RuntimeException.class,
        () -> apiClientJersey2.<Object>invokeAPI("https://example.org/example", "https://example.org/example",
            queryParams, "Body", headerParams, cookieParams, new HashMap<>(), "https://example.org/example",
            "https://example.org/example", null, mock(TypeReference.class)));
    verify(httpClient).target(eq("https://example.org/examplehttps://example.org/example"));
    verify(webTarget5).queryParam(eq("https://example.org/example"), isA(Object[].class));
    verify(webTarget4).queryParam(eq("https://example.org/example"), isA(Object[].class));
    verify(webTarget3).queryParam(eq("https://example.org/example"), isA(Object[].class));
    verify(webTarget2).queryParam(eq("https://example.org/example"), isA(Object[].class));
    verify(webTarget).request();
  }

  /**
   * Test {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)}.
   * <ul>
   *   <li>Then calls {@link Invocation.Builder#header(String, Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName("Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference); then calls header(String, Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse ApiClientJersey2.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"})
  void testInvokeAPI_thenCallsHeader() throws ApiException {
    // Arrange
    Builder builder = mock(Builder.class);
    when(builder.header(Mockito.<String>any(), Mockito.<Object>any())).thenThrow(new RuntimeException("X-Trace-Id"));
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
    ApiClientJersey2 apiClientJersey2 = new ApiClientJersey2(httpClient, "https://example.org/example", defaultHeaders,
        "https://example.org/example");
    ArrayList<Pair> queryParams = new ArrayList<>();
    HashMap<String, String> headerParams = new HashMap<>();
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(RuntimeException.class,
        () -> apiClientJersey2.<Object>invokeAPI("https://example.org/example", "https://example.org/example",
            queryParams, "Body", headerParams, cookieParams, new HashMap<>(), "https://example.org/example",
            "https://example.org/example", null, mock(TypeReference.class)));
    verify(httpClient).target(eq("https://example.org/examplehttps://example.org/example"));
    verify(builder3).accept(isA(String[].class));
    verify(builder).header(eq("Delivered-To"), isA(Object.class));
    verify(builder2).header(eq("X-Trace-Id"), isA(Object.class));
    verify(webTarget).request();
  }

  /**
   * Test {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)}.
   * <ul>
   *   <li>Then calls {@link Invocation.Builder#header(String, Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName("Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference); then calls header(String, Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse ApiClientJersey2.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"})
  void testInvokeAPI_thenCallsHeader2() throws ApiException {
    // Arrange
    Builder builder = mock(Builder.class);
    when(builder.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(mock(Builder.class));
    Builder builder2 = mock(Builder.class);
    when(builder2.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder);
    Builder builder3 = mock(Builder.class);
    when(builder3.accept(isA(String[].class))).thenReturn(builder2);
    Builder builder4 = mock(Builder.class);
    when(builder4.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(mock(Builder.class));
    Builder builder5 = mock(Builder.class);
    when(builder5.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder4);
    Builder builder6 = mock(Builder.class);
    when(builder6.accept(isA(String[].class))).thenReturn(builder5);
    Builder builder7 = mock(Builder.class);
    when(builder7.header(Mockito.<String>any(), Mockito.<Object>any())).thenThrow(new RuntimeException("X-Trace-Id"));
    Builder builder8 = mock(Builder.class);
    when(builder8.accept(isA(String[].class))).thenReturn(builder7);
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder8);
    WebTarget webTarget2 = mock(WebTarget.class);
    when(webTarget2.queryParam(Mockito.<String>any(), isA(Object[].class))).thenReturn(webTarget);
    when(webTarget2.request()).thenReturn(builder6);
    WebTarget webTarget3 = mock(WebTarget.class);
    when(webTarget3.queryParam(Mockito.<String>any(), isA(Object[].class))).thenReturn(webTarget2);
    when(webTarget3.request()).thenReturn(builder3);
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget3);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 = new ApiClientJersey2(httpClient, "https://example.org/example", defaultHeaders,
        "https://example.org/example");

    ArrayList<Pair> queryParams = new ArrayList<>();
    queryParams.add(Pair.pair("https://example.org/example", "https://example.org/example"));
    queryParams.add(Pair.pair("https://example.org/example", "https://example.org/example"));
    HashMap<String, String> headerParams = new HashMap<>();
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(RuntimeException.class,
        () -> apiClientJersey2.<Object>invokeAPI("https://example.org/example", "https://example.org/example",
            queryParams, "Body", headerParams, cookieParams, new HashMap<>(), "https://example.org/example",
            "https://example.org/example", null, mock(TypeReference.class)));
    verify(httpClient).target(eq("https://example.org/examplehttps://example.org/example"));
    verify(builder8).accept(isA(String[].class));
    verify(builder7).header(eq("X-Trace-Id"), isA(Object.class));
    verify(webTarget3).queryParam(eq("https://example.org/example"), isA(Object[].class));
    verify(webTarget2).queryParam(eq("https://example.org/example"), isA(Object[].class));
    verify(webTarget).request();
  }

  /**
   * Test {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)}.
   * <ul>
   *   <li>Then throw {@link ProcessingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName("Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference); then throw ProcessingException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse ApiClientJersey2.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"})
  void testInvokeAPI_thenThrowProcessingException() throws ApiException {
    // Arrange
    Builder builder = mock(Builder.class);
    when(builder.header(Mockito.<String>any(), Mockito.<Object>any()))
        .thenThrow(new ProcessingException("An error occurred"));
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
    ApiClientJersey2 apiClientJersey2 = new ApiClientJersey2(httpClient, "https://example.org/example", defaultHeaders,
        "https://example.org/example");
    ArrayList<Pair> queryParams = new ArrayList<>();
    HashMap<String, String> headerParams = new HashMap<>();
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(ProcessingException.class,
        () -> apiClientJersey2.<Object>invokeAPI("https://example.org/example", "https://example.org/example",
            queryParams, "Body", headerParams, cookieParams, new HashMap<>(), "https://example.org/example",
            "https://example.org/example", null, mock(TypeReference.class)));
    verify(httpClient).target(eq("https://example.org/examplehttps://example.org/example"));
    verify(builder3).accept(isA(String[].class));
    verify(builder).header(eq("Delivered-To"), isA(Object.class));
    verify(builder2).header(eq("X-Trace-Id"), isA(Object.class));
    verify(webTarget).request();
  }

  /**
   * Test {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)}.
   * <ul>
   *   <li>When array of {@link String} with {@code https://example.org/example}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName("Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference); when array of String with 'https://example.org/example'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse ApiClientJersey2.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"})
  void testInvokeAPI_whenArrayOfStringWithHttpsExampleOrgExample() throws ApiException {
    // Arrange
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(mock(WebTarget.class));

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 = new ApiClientJersey2(httpClient, "https://example.org/example", defaultHeaders,
        "https://example.org/example");
    ArrayList<Pair> queryParams = new ArrayList<>();
    HashMap<String, String> headerParams = new HashMap<>();
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(RuntimeException.class,
        () -> apiClientJersey2.<Object>invokeAPI("https://example.org/example", "https://example.org/example",
            queryParams, "Body", headerParams, cookieParams, new HashMap<>(), "https://example.org/example",
            "https://example.org/example", new String[]{"https://example.org/example"}, mock(TypeReference.class)));
    verify(httpClient).target(eq("https://example.org/examplehttps://example.org/example"));
  }

  /**
   * Test {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)}.
   * <ul>
   *   <li>When array of {@link String} with {@code https://example.org/example}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName("Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference); when array of String with 'https://example.org/example'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse ApiClientJersey2.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"})
  void testInvokeAPI_whenArrayOfStringWithHttpsExampleOrgExample2() throws ApiException {
    // Arrange
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(mock(WebTarget.class));

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 = new ApiClientJersey2(httpClient, "https://example.org/example", defaultHeaders,
        "https://example.org/example");

    ArrayList<Pair> queryParams = new ArrayList<>();
    queryParams.add(Pair.pair("https://example.org/example", "https://example.org/example"));
    HashMap<String, String> headerParams = new HashMap<>();
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(RuntimeException.class,
        () -> apiClientJersey2.<Object>invokeAPI("https://example.org/example", "https://example.org/example",
            queryParams, "Body", headerParams, cookieParams, new HashMap<>(), "https://example.org/example",
            "https://example.org/example", new String[]{"https://example.org/example"}, mock(TypeReference.class)));
    verify(httpClient).target(eq("https://example.org/examplehttps://example.org/example"));
  }

  /**
   * Test {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)}.
   * <ul>
   *   <li>When array of {@link String} with {@code https://example.org/example}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName("Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference); when array of String with 'https://example.org/example'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse ApiClientJersey2.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"})
  void testInvokeAPI_whenArrayOfStringWithHttpsExampleOrgExample3() throws ApiException {
    // Arrange
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(mock(WebTarget.class));

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 = new ApiClientJersey2(httpClient, "https://example.org/example", defaultHeaders,
        "https://example.org/example");

    ArrayList<Pair> queryParams = new ArrayList<>();
    queryParams.add(Pair.pair("https://example.org/example", "https://example.org/example"));
    queryParams.add(Pair.pair("https://example.org/example", "https://example.org/example"));
    HashMap<String, String> headerParams = new HashMap<>();
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(RuntimeException.class,
        () -> apiClientJersey2.<Object>invokeAPI("https://example.org/example", "https://example.org/example",
            queryParams, "Body", headerParams, cookieParams, new HashMap<>(), "https://example.org/example",
            "https://example.org/example", new String[]{"https://example.org/example"}, mock(TypeReference.class)));
    verify(httpClient).target(eq("https://example.org/examplehttps://example.org/example"));
  }

  /**
   * Test {@link ApiClientJersey2#parameterToString(Object)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#parameterToString(Object)}
   */
  @Test
  @DisplayName("Test parameterToString(Object); given '42'; when ArrayList() add '42'; then return '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ApiClientJersey2.parameterToString(Object)"})
  void testParameterToString_given42_whenArrayListAdd42_thenReturn42() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 = new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example");

    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    // Act and Assert
    assertEquals("42", apiClientJersey2.parameterToString(objectList));
  }

  /**
   * Test {@link ApiClientJersey2#parameterToString(Object)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42,42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#parameterToString(Object)}
   */
  @Test
  @DisplayName("Test parameterToString(Object); given '42'; when ArrayList() add '42'; then return '42,42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ApiClientJersey2.parameterToString(Object)"})
  void testParameterToString_given42_whenArrayListAdd42_thenReturn4242() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 = new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example");

    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");

    // Act and Assert
    assertEquals("42,42", apiClientJersey2.parameterToString(objectList));
  }

  /**
   * Test {@link ApiClientJersey2#parameterToString(Object)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#parameterToString(Object)}
   */
  @Test
  @DisplayName("Test parameterToString(Object); when ArrayList(); then return empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ApiClientJersey2.parameterToString(Object)"})
  void testParameterToString_whenArrayList_thenReturnEmptyString() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 = new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example");

    // Act and Assert
    assertEquals("", apiClientJersey2.parameterToString(new ArrayList<>()));
  }

  /**
   * Test {@link ApiClientJersey2#parameterToString(Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#parameterToString(Object)}
   */
  @Test
  @DisplayName("Test parameterToString(Object); when 'null'; then return empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ApiClientJersey2.parameterToString(Object)"})
  void testParameterToString_whenNull_thenReturnEmptyString() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertEquals("", (new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
        "https://example.org/example")).parameterToString(null));
  }

  /**
   * Test {@link ApiClientJersey2#parameterToString(Object)}.
   * <ul>
   *   <li>When {@code Param}.</li>
   *   <li>Then return {@code Param}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#parameterToString(Object)}
   */
  @Test
  @DisplayName("Test parameterToString(Object); when 'Param'; then return 'Param'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ApiClientJersey2.parameterToString(Object)"})
  void testParameterToString_whenParam_thenReturnParam() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertEquals("Param", (new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
        "https://example.org/example")).parameterToString("Param"));
  }

  /**
   * Test {@link ApiClientJersey2#parameterToPairs(String, String, Object)}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()}.</li>
   *   <li>When {@link LinkedHashSet#LinkedHashSet()} add {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName("Test parameterToPairs(String, String, Object); given ArrayList(); when LinkedHashSet() add ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List ApiClientJersey2.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_givenArrayList_whenLinkedHashSetAddArrayList() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 = new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example");

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(new ArrayList<>());

    // Act
    List<Pair> actualParameterToPairsResult = apiClientJersey2.parameterToPairs(null, "https://example.org/example",
        objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("", getResult.getValue());
    assertEquals("https://example.org/example", getResult.getName());
  }

  /**
   * Test {@link ApiClientJersey2#parameterToPairs(String, String, Object)}.
   * <ul>
   *   <li>Given {@code null}.</li>
   *   <li>When empty string.</li>
   *   <li>Then return first Value is empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName("Test parameterToPairs(String, String, Object); given 'null'; when empty string; then return first Value is empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List ApiClientJersey2.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_givenNull_whenEmptyString_thenReturnFirstValueIsEmptyString() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 = new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example");

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(null);

    // Act
    List<Pair> actualParameterToPairsResult = apiClientJersey2.parameterToPairs("", "https://example.org/example",
        objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("", getResult.getValue());
    assertEquals("https://example.org/example", getResult.getName());
  }

  /**
   * Test {@link ApiClientJersey2#parameterToPairs(String, String, Object)}.
   * <ul>
   *   <li>Given {@code null}.</li>
   *   <li>When {@link LinkedHashSet#LinkedHashSet()} add {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName("Test parameterToPairs(String, String, Object); given 'null'; when LinkedHashSet() add 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List ApiClientJersey2.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_givenNull_whenLinkedHashSetAddNull() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 = new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example");

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(null);

    // Act
    List<Pair> actualParameterToPairsResult = apiClientJersey2.parameterToPairs(null, "https://example.org/example",
        objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("", getResult.getValue());
    assertEquals("https://example.org/example", getResult.getName());
  }

  /**
   * Test {@link ApiClientJersey2#parameterToPairs(String, String, Object)}.
   * <ul>
   *   <li>Given {@code null}.</li>
   *   <li>When {@link LinkedHashSet#LinkedHashSet()} add {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName("Test parameterToPairs(String, String, Object); given 'null'; when LinkedHashSet() add 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List ApiClientJersey2.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_givenNull_whenLinkedHashSetAddNull2() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 = new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example");

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(null);

    // Act
    List<Pair> actualParameterToPairsResult = apiClientJersey2.parameterToPairs("https://example.org/example",
        "https://example.org/example", objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("", getResult.getValue());
    assertEquals("https://example.org/example", getResult.getName());
  }

  /**
   * Test {@link ApiClientJersey2#parameterToPairs(String, String, Object)}.
   * <ul>
   *   <li>Given {@code null}.</li>
   *   <li>When {@code multi}.</li>
   *   <li>Then return first Value is empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName("Test parameterToPairs(String, String, Object); given 'null'; when 'multi'; then return first Value is empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List ApiClientJersey2.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_givenNull_whenMulti_thenReturnFirstValueIsEmptyString() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 = new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example");

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(null);

    // Act
    List<Pair> actualParameterToPairsResult = apiClientJersey2.parameterToPairs("multi", "https://example.org/example",
        objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("", getResult.getValue());
    assertEquals("https://example.org/example", getResult.getName());
  }

  /**
   * Test {@link ApiClientJersey2#parameterToPairs(String, String, Object)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName("Test parameterToPairs(String, String, Object); when ArrayList(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List ApiClientJersey2.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_whenArrayList_thenReturnEmpty() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 = new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example");

    // Act and Assert
    assertTrue(apiClientJersey2
        .parameterToPairs("https://example.org/example", "https://example.org/example", new ArrayList<>())
        .isEmpty());
  }

  /**
   * Test {@link ApiClientJersey2#parameterToPairs(String, String, Object)}.
   * <ul>
   *   <li>When empty string.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName("Test parameterToPairs(String, String, Object); when empty string; then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List ApiClientJersey2.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_whenEmptyString_thenReturnEmpty() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertTrue((new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
        "https://example.org/example")).parameterToPairs(null, "", null).isEmpty());
  }

  /**
   * Test {@link ApiClientJersey2#parameterToPairs(String, String, Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName("Test parameterToPairs(String, String, Object); when 'null'; then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List ApiClientJersey2.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_whenNull_thenReturnEmpty() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertTrue((new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
        "https://example.org/example")).parameterToPairs(null, null, null).isEmpty());
  }

  /**
   * Test {@link ApiClientJersey2#parameterToPairs(String, String, Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName("Test parameterToPairs(String, String, Object); when 'null'; then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List ApiClientJersey2.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_whenNull_thenReturnEmpty2() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertTrue((new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
        "https://example.org/example")).parameterToPairs(null, "https://example.org/example", null).isEmpty());
  }

  /**
   * Test {@link ApiClientJersey2#parameterToPairs(String, String, Object)}.
   * <ul>
   *   <li>When {@code Value}.</li>
   *   <li>Then return first Value is {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName("Test parameterToPairs(String, String, Object); when 'Value'; then return first Value is 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List ApiClientJersey2.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_whenValue_thenReturnFirstValueIsValue() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act
    List<Pair> actualParameterToPairsResult = (new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"))
        .parameterToPairs("https://example.org/example", "https://example.org/example", "Value");

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("Value", getResult.getValue());
    assertEquals("https://example.org/example", getResult.getName());
  }

  /**
   * Test {@link ApiClientJersey2#selectHeaderAccept(String[])}.
   * <ul>
   *   <li>Then return {@code application/json ;U}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#selectHeaderAccept(String[])}
   */
  @Test
  @DisplayName("Test selectHeaderAccept(String[]); then return 'application/json ;U'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ApiClientJersey2.selectHeaderAccept(String[])"})
  void testSelectHeaderAccept_thenReturnApplicationJsonU() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertEquals("application/json ;U", (new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example")).selectHeaderAccept(new String[]{"application/json ;U"}));
  }

  /**
   * Test {@link ApiClientJersey2#selectHeaderAccept(String[])}.
   * <ul>
   *   <li>Then return {@code * /*}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#selectHeaderAccept(String[])}
   */
  @Test
  @DisplayName("Test selectHeaderAccept(String[]); then return '*/*'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ApiClientJersey2.selectHeaderAccept(String[])"})
  void testSelectHeaderAccept_thenReturnAsteriskSlashAsterisk() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertEquals("*/*", (new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
        "https://example.org/example")).selectHeaderAccept(new String[]{"*/*"}));
  }

  /**
   * Test {@link ApiClientJersey2#selectHeaderAccept(String[])}.
   * <ul>
   *   <li>Then return {@code https://example.org/example}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#selectHeaderAccept(String[])}
   */
  @Test
  @DisplayName("Test selectHeaderAccept(String[]); then return 'https://example.org/example'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ApiClientJersey2.selectHeaderAccept(String[])"})
  void testSelectHeaderAccept_thenReturnHttpsExampleOrgExample() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertEquals("https://example.org/example",
        (new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example")).selectHeaderAccept(new String[]{"https://example.org/example"}));
  }

  /**
   * Test {@link ApiClientJersey2#selectHeaderAccept(String[])}.
   * <ul>
   *   <li>When array of {@link String} with {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#selectHeaderAccept(String[])}
   */
  @Test
  @DisplayName("Test selectHeaderAccept(String[]); when array of String with 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ApiClientJersey2.selectHeaderAccept(String[])"})
  void testSelectHeaderAccept_whenArrayOfStringWithNull_thenReturnNull() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertEquals("null", (new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
        "https://example.org/example")).selectHeaderAccept(new String[]{null}));
  }

  /**
   * Test {@link ApiClientJersey2#selectHeaderAccept(String[])}.
   * <ul>
   *   <li>When empty array of {@link String}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#selectHeaderAccept(String[])}
   */
  @Test
  @DisplayName("Test selectHeaderAccept(String[]); when empty array of String; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ApiClientJersey2.selectHeaderAccept(String[])"})
  void testSelectHeaderAccept_whenEmptyArrayOfString_thenReturnNull() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertNull((new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
        "https://example.org/example")).selectHeaderAccept(new String[]{}));
  }

  /**
   * Test {@link ApiClientJersey2#selectHeaderContentType(String[])}.
   * <ul>
   *   <li>Then return {@code application/json ;U}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#selectHeaderContentType(String[])}
   */
  @Test
  @DisplayName("Test selectHeaderContentType(String[]); then return 'application/json ;U'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ApiClientJersey2.selectHeaderContentType(String[])"})
  void testSelectHeaderContentType_thenReturnApplicationJsonU() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertEquals("application/json ;U", (new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example")).selectHeaderContentType(new String[]{"application/json ;U"}));
  }

  /**
   * Test {@link ApiClientJersey2#selectHeaderContentType(String[])}.
   * <ul>
   *   <li>Then return {@code * /*}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#selectHeaderContentType(String[])}
   */
  @Test
  @DisplayName("Test selectHeaderContentType(String[]); then return '*/*'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ApiClientJersey2.selectHeaderContentType(String[])"})
  void testSelectHeaderContentType_thenReturnAsteriskSlashAsterisk() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertEquals("*/*", (new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
        "https://example.org/example")).selectHeaderContentType(new String[]{"*/*"}));
  }

  /**
   * Test {@link ApiClientJersey2#selectHeaderContentType(String[])}.
   * <ul>
   *   <li>When array of {@link String} with {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#selectHeaderContentType(String[])}
   */
  @Test
  @DisplayName("Test selectHeaderContentType(String[]); when array of String with 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ApiClientJersey2.selectHeaderContentType(String[])"})
  void testSelectHeaderContentType_whenArrayOfStringWithNull_thenReturnNull() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertNull((new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
        "https://example.org/example")).selectHeaderContentType(new String[]{null}));
  }

  /**
   * Test {@link ApiClientJersey2#selectHeaderContentType(String[])}.
   * <ul>
   *   <li>When array of {@link String} with {@code text/plain}.</li>
   *   <li>Then return {@code text/plain}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#selectHeaderContentType(String[])}
   */
  @Test
  @DisplayName("Test selectHeaderContentType(String[]); when array of String with 'text/plain'; then return 'text/plain'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ApiClientJersey2.selectHeaderContentType(String[])"})
  void testSelectHeaderContentType_whenArrayOfStringWithTextPlain_thenReturnTextPlain() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertEquals("text/plain", (new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
        "https://example.org/example")).selectHeaderContentType(new String[]{"text/plain"}));
  }

  /**
   * Test {@link ApiClientJersey2#selectHeaderContentType(String[])}.
   * <ul>
   *   <li>When empty array of {@link String}.</li>
   *   <li>Then return {@code application/json}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#selectHeaderContentType(String[])}
   */
  @Test
  @DisplayName("Test selectHeaderContentType(String[]); when empty array of String; then return 'application/json'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ApiClientJersey2.selectHeaderContentType(String[])"})
  void testSelectHeaderContentType_whenEmptyArrayOfString_thenReturnApplicationJson() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertEquals("application/json", (new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example")).selectHeaderContentType(new String[]{}));
  }

  /**
   * Test {@link ApiClientJersey2#escapeString(String)}.
   * <p>
   * Method under test: {@link ApiClientJersey2#escapeString(String)}
   */
  @Test
  @DisplayName("Test escapeString(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ApiClientJersey2.escapeString(String)"})
  void testEscapeString() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertEquals("https%3A%2F%2Fexample.org%2Fexample",
        (new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example")).escapeString("https://example.org/example"));
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ApiClientJersey2#getAuthentications()}
   *   <li>{@link ApiClientJersey2#getBasePath()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Map ApiClientJersey2.getAuthentications()", "String ApiClientJersey2.getBasePath()"})
  void testGettersAndSetters() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 = new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example");

    // Act
    Map<String, Authentication> actualAuthentications = apiClientJersey2.getAuthentications();

    // Assert
    assertEquals("https://example.org/example", apiClientJersey2.getBasePath());
    assertTrue(actualAuthentications.isEmpty());
  }

  /**
   * Test {@link ApiClientJersey2#addEnforcedAuthenticationScheme(String)}.
   * <p>
   * Method under test: {@link ApiClientJersey2#addEnforcedAuthenticationScheme(String)}
   */
  @Test
  @DisplayName("Test addEnforcedAuthenticationScheme(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ApiClientJersey2.addEnforcedAuthenticationScheme(String)"})
  void testAddEnforcedAuthenticationScheme() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 = new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example");

    // Act
    apiClientJersey2.addEnforcedAuthenticationScheme("https://example.org/example");

    // Assert
    List<String> stringList = apiClientJersey2.enforcedAuthenticationSchemes;
    assertEquals(1, stringList.size());
    assertEquals("https://example.org/example", stringList.get(0));
  }

  /**
   * Test {@link ApiClientJersey2#isJsonMime(String)}.
   * <ul>
   *   <li>When {@code application/json ;U}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#isJsonMime(String)}
   */
  @Test
  @DisplayName("Test isJsonMime(String); when 'application/json ;U'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApiClientJersey2.isJsonMime(String)"})
  void testIsJsonMime_whenApplicationJsonU_thenReturnTrue() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertTrue((new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
        "https://example.org/example")).isJsonMime("application/json ;U"));
  }

  /**
   * Test {@link ApiClientJersey2#isJsonMime(String)}.
   * <ul>
   *   <li>When {@code * /*}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#isJsonMime(String)}
   */
  @Test
  @DisplayName("Test isJsonMime(String); when '*/*'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApiClientJersey2.isJsonMime(String)"})
  void testIsJsonMime_whenAsteriskSlashAsterisk_thenReturnTrue() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertTrue((new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
        "https://example.org/example")).isJsonMime("*/*"));
  }

  /**
   * Test {@link ApiClientJersey2#isJsonMime(String)}.
   * <ul>
   *   <li>When {@code https://example.org/example}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#isJsonMime(String)}
   */
  @Test
  @DisplayName("Test isJsonMime(String); when 'https://example.org/example'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApiClientJersey2.isJsonMime(String)"})
  void testIsJsonMime_whenHttpsExampleOrgExample_thenReturnFalse() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertFalse((new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
        "https://example.org/example")).isJsonMime("https://example.org/example"));
  }

  /**
   * Test {@link ApiClientJersey2#isJsonMime(String)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#isJsonMime(String)}
   */
  @Test
  @DisplayName("Test isJsonMime(String); when 'null'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApiClientJersey2.isJsonMime(String)"})
  void testIsJsonMime_whenNull_thenReturnFalse() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertFalse((new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
        "https://example.org/example")).isJsonMime(null));
  }

  /**
   * Test {@link ApiClientJersey2#deserialize(Response, GenericType)}.
   * <ul>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#deserialize(Response, GenericType)}
   */
  @Test
  @DisplayName("Test deserialize(Response, GenericType); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ApiClientJersey2.deserialize(Response, GenericType)"})
  void testDeserialize_thenReturnNull() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 = new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example");
    StatusType status = mock(StatusType.class);

    // Act and Assert
    assertNull(apiClientJersey2.deserialize(new OutboundJaxrsResponse(status, new OutboundMessageContext()), null));
  }

  /**
   * Test {@link ApiClientJersey2#deserialize(Response, GenericType)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#deserialize(Response, GenericType)}
   */
  @Test
  @DisplayName("Test deserialize(Response, GenericType); when 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ApiClientJersey2.deserialize(Response, GenericType)"})
  void testDeserialize_whenNull_thenReturnNull() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertNull((new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
        "https://example.org/example")).deserialize(null, null));
  }

  /**
   * Test {@link ApiClientJersey2#downloadFileFromResponse(Response)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#downloadFileFromResponse(Response)}
   */
  @Test
  @DisplayName("Test downloadFileFromResponse(Response); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"File ApiClientJersey2.downloadFileFromResponse(Response)"})
  void testDownloadFileFromResponse_thenThrowApiException() throws ApiException, IOException {
    try (MockedStatic<File> mockFile = mockStatic(File.class)) {

      // Arrange
      mockFile.when(() -> File.createTempFile(Mockito.<String>any(), Mockito.<String>any()))
          .thenThrow(new ConnectTimeoutException("https://example.org/example"));
      mockFile.when(() -> File.createTempFile(Mockito.<String>any(), Mockito.<String>any(), Mockito.<File>any()))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());

      HashMap<String, String> defaultHeaders = new HashMap<>();
      defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
      ApiClientJersey2 apiClientJersey2 = new ApiClientJersey2(mock(Client.class), "https://example.org/example",
          defaultHeaders, null);
      StatusType status = mock(StatusType.class);

      // Act and Assert
      assertThrows(ApiException.class, () -> apiClientJersey2
          .downloadFileFromResponse(new OutboundJaxrsResponse(status, new OutboundMessageContext())));
      mockFile.verify(() -> File.createTempFile(Mockito.<String>any(), Mockito.<String>any()));
    }
  }

  /**
   * Test {@link ApiClientJersey2#downloadFileFromResponse(Response)}.
   * <ul>
   *   <li>Then throw {@link RuntimeException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#downloadFileFromResponse(Response)}
   */
  @Test
  @DisplayName("Test downloadFileFromResponse(Response); then throw RuntimeException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"File ApiClientJersey2.downloadFileFromResponse(Response)"})
  void testDownloadFileFromResponse_thenThrowRuntimeException() throws ApiException, IOException {
    try (MockedStatic<File> mockFile = mockStatic(File.class)) {

      // Arrange
      mockFile.when(() -> File.createTempFile(Mockito.<String>any(), Mockito.<String>any()))
          .thenThrow(new RuntimeException("Content-Disposition"));
      mockFile.when(() -> File.createTempFile(Mockito.<String>any(), Mockito.<String>any(), Mockito.<File>any()))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());

      HashMap<String, String> defaultHeaders = new HashMap<>();
      defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
      ApiClientJersey2 apiClientJersey2 = new ApiClientJersey2(mock(Client.class), "https://example.org/example",
          defaultHeaders, null);
      StatusType status = mock(StatusType.class);

      // Act and Assert
      assertThrows(RuntimeException.class, () -> apiClientJersey2
          .downloadFileFromResponse(new OutboundJaxrsResponse(status, new OutboundMessageContext())));
      mockFile.verify(() -> File.createTempFile(Mockito.<String>any(), Mockito.<String>any()));
    }
  }

  /**
   * Test {@link ApiClientJersey2#buildResponseHeaders(Response)}.
   * <ul>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#buildResponseHeaders(Response)}
   */
  @Test
  @DisplayName("Test buildResponseHeaders(Response); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Map ApiClientJersey2.buildResponseHeaders(Response)"})
  void testBuildResponseHeaders_thenReturnEmpty() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 = new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example");
    StatusType status = mock(StatusType.class);

    // Act and Assert
    assertTrue(apiClientJersey2.buildResponseHeaders(new OutboundJaxrsResponse(status, new OutboundMessageContext()))
        .isEmpty());
  }

  /**
   * Test {@link ApiClientJersey2#updateParamsForAuth(String[], Map)}.
   * <p>
   * Method under test: {@link ApiClientJersey2#updateParamsForAuth(String[], Map)}
   */
  @Test
  @DisplayName("Test updateParamsForAuth(String[], Map)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ApiClientJersey2.updateParamsForAuth(String[], Map)"})
  void testUpdateParamsForAuth() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    ApiClientJersey2 apiClientJersey2 = new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example");
    apiClientJersey2.addEnforcedAuthenticationScheme("Name");

    // Act and Assert
    assertThrows(RuntimeException.class, () -> apiClientJersey2.updateParamsForAuth(null, new HashMap<>()));
  }

  /**
   * Test {@link ApiClientJersey2#updateParamsForAuth(String[], Map)}.
   * <ul>
   *   <li>When array of {@link String} with {@code https://example.org/example}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientJersey2#updateParamsForAuth(String[], Map)}
   */
  @Test
  @DisplayName("Test updateParamsForAuth(String[], Map); when array of String with 'https://example.org/example'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ApiClientJersey2.updateParamsForAuth(String[], Map)"})
  void testUpdateParamsForAuth_whenArrayOfStringWithHttpsExampleOrgExample() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 = new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example");

    // Act and Assert
    assertThrows(RuntimeException.class,
        () -> apiClientJersey2.updateParamsForAuth(new String[]{"https://example.org/example"}, new HashMap<>()));
  }
}
