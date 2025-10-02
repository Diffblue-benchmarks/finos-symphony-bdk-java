package com.symphony.bdk.gen.api;

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
import com.symphony.bdk.gen.api.model.AgentInfo;
import com.symphony.bdk.gen.api.model.BaseSignal;
import com.symphony.bdk.http.api.ApiClient;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.api.ApiResponse;
import com.symphony.bdk.http.api.Pair;
import com.symphony.bdk.http.api.util.TypeReference;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import jakarta.ws.rs.client.Client;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SignalsApiDiffblueTest {
  /**
   * Test {@link SignalsApi#v1InfoGet()}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link SignalsApi#v1InfoGet()}
   */
  @Test
  @DisplayName("Test v1InfoGet(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AgentInfo SignalsApi.v1InfoGet()"})
  void testV1InfoGet_thenReturnNull() throws ApiException {
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
    when(apiClient.selectHeaderAccept(isA(String[].class)))
        .thenReturn("https://example.org/example");
    when(apiClient.selectHeaderContentType(isA(String[].class))).thenReturn("text/plain");

    // Act
    AgentInfo actualV1InfoGetResult = new SignalsApi(apiClient).v1InfoGet();

    // Assert
    verify(apiClient)
        .invokeAPI(
            eq("/v1/info"),
            eq("GET"),
            isA(List.class),
            isNull(),
            isA(Map.class),
            isA(Map.class),
            isA(Map.class),
            eq("https://example.org/example"),
            eq("text/plain"),
            isA(String[].class),
            isA(TypeReference.class));
    verify(apiClient).selectHeaderAccept(isA(String[].class));
    verify(apiClient).selectHeaderContentType(isA(String[].class));
    assertNull(actualV1InfoGetResult);
  }

  /**
   * Test {@link SignalsApi#v1InfoGetWithHttpInfo()}.
   *
   * <p>Method under test: {@link SignalsApi#v1InfoGetWithHttpInfo()}
   */
  @Test
  @DisplayName("Test v1InfoGetWithHttpInfo()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiResponse SignalsApi.v1InfoGetWithHttpInfo()"})
  void testV1InfoGetWithHttpInfo() throws ApiException {
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
    when(apiClient.selectHeaderAccept(isA(String[].class)))
        .thenReturn("https://example.org/example");
    when(apiClient.selectHeaderContentType(isA(String[].class))).thenReturn("text/plain");

    // Act
    ApiResponse<AgentInfo> actualV1InfoGetWithHttpInfoResult =
        new SignalsApi(apiClient).v1InfoGetWithHttpInfo();

    // Assert
    verify(apiClient)
        .invokeAPI(
            eq("/v1/info"),
            eq("GET"),
            isA(List.class),
            isNull(),
            isA(Map.class),
            isA(Map.class),
            isA(Map.class),
            eq("https://example.org/example"),
            eq("text/plain"),
            isA(String[].class),
            isA(TypeReference.class));
    verify(apiClient).selectHeaderAccept(isA(String[].class));
    verify(apiClient).selectHeaderContentType(isA(String[].class));
    assertSame(apiResponse, actualV1InfoGetWithHttpInfoResult);
  }

  /**
   * Test {@link SignalsApi#v1SignalsCreatePost(String, String, BaseSignal)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SignalsApi#v1SignalsCreatePost(String, String, BaseSignal)}
   */
  @Test
  @DisplayName("Test v1SignalsCreatePost(String, String, BaseSignal); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.Signal SignalsApi.v1SignalsCreatePost(String, String, BaseSignal)"
  })
  void testV1SignalsCreatePost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    SignalsApi signalsApi = new SignalsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class, () -> signalsApi.v1SignalsCreatePost(null, "ABC123", new BaseSignal()));
  }

  /**
   * Test {@link SignalsApi#v1SignalsCreatePost(String, String, BaseSignal)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SignalsApi#v1SignalsCreatePost(String, String, BaseSignal)}
   */
  @Test
  @DisplayName("Test v1SignalsCreatePost(String, String, BaseSignal); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.Signal SignalsApi.v1SignalsCreatePost(String, String, BaseSignal)"
  })
  void testV1SignalsCreatePost_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> new SignalsApi(apiClient).v1SignalsCreatePost("ABC123", null, null));
  }

  /**
   * Test {@link SignalsApi#v1SignalsCreatePostWithHttpInfo(String, String, BaseSignal)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SignalsApi#v1SignalsCreatePostWithHttpInfo(String, String,
   * BaseSignal)}
   */
  @Test
  @DisplayName(
      "Test v1SignalsCreatePostWithHttpInfo(String, String, BaseSignal); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse SignalsApi.v1SignalsCreatePostWithHttpInfo(String, String, BaseSignal)"
  })
  void testV1SignalsCreatePostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    SignalsApi signalsApi = new SignalsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            signalsApi.v1SignalsCreatePostWithHttpInfo(
                null, "https://example.org/example", new BaseSignal()));
  }

  /**
   * Test {@link SignalsApi#v1SignalsCreatePostWithHttpInfo(String, String, BaseSignal)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SignalsApi#v1SignalsCreatePostWithHttpInfo(String, String,
   * BaseSignal)}
   */
  @Test
  @DisplayName(
      "Test v1SignalsCreatePostWithHttpInfo(String, String, BaseSignal); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse SignalsApi.v1SignalsCreatePostWithHttpInfo(String, String, BaseSignal)"
  })
  void testV1SignalsCreatePostWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new SignalsApi(apiClient)
                .v1SignalsCreatePostWithHttpInfo("https://example.org/example", null, null));
  }

  /**
   * Test {@link SignalsApi#v1SignalsIdDeletePost(String, String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SignalsApi#v1SignalsIdDeletePost(String, String, String)}
   */
  @Test
  @DisplayName("Test v1SignalsIdDeletePost(String, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.SuccessResponse SignalsApi.v1SignalsIdDeletePost(String, String, String)"
  })
  void testV1SignalsIdDeletePost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> new SignalsApi(apiClient).v1SignalsIdDeletePost("ABC123", null, null));
  }

  /**
   * Test {@link SignalsApi#v1SignalsIdDeletePost(String, String, String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SignalsApi#v1SignalsIdDeletePost(String, String, String)}
   */
  @Test
  @DisplayName(
      "Test v1SignalsIdDeletePost(String, String, String); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.SuccessResponse SignalsApi.v1SignalsIdDeletePost(String, String, String)"
  })
  void testV1SignalsIdDeletePost_when42_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> new SignalsApi(apiClient).v1SignalsIdDeletePost(null, "ABC123", "42"));
  }

  /**
   * Test {@link SignalsApi#v1SignalsIdDeletePostWithHttpInfo(String, String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SignalsApi#v1SignalsIdDeletePostWithHttpInfo(String, String,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v1SignalsIdDeletePostWithHttpInfo(String, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse SignalsApi.v1SignalsIdDeletePostWithHttpInfo(String, String, String)"
  })
  void testV1SignalsIdDeletePostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new SignalsApi(apiClient)
                .v1SignalsIdDeletePostWithHttpInfo(
                    null, "https://example.org/example", "https://example.org/example"));
  }

  /**
   * Test {@link SignalsApi#v1SignalsIdDeletePostWithHttpInfo(String, String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SignalsApi#v1SignalsIdDeletePostWithHttpInfo(String, String,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v1SignalsIdDeletePostWithHttpInfo(String, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse SignalsApi.v1SignalsIdDeletePostWithHttpInfo(String, String, String)"
  })
  void testV1SignalsIdDeletePostWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new SignalsApi(apiClient)
                .v1SignalsIdDeletePostWithHttpInfo("https://example.org/example", null, null));
  }

  /**
   * Test {@link SignalsApi#v1SignalsIdGetGet(String, String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SignalsApi#v1SignalsIdGetGet(String, String, String)}
   */
  @Test
  @DisplayName("Test v1SignalsIdGetGet(String, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.Signal SignalsApi.v1SignalsIdGetGet(String, String, String)"
  })
  void testV1SignalsIdGetGet_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> new SignalsApi(apiClient).v1SignalsIdGetGet("ABC123", null, null));
  }

  /**
   * Test {@link SignalsApi#v1SignalsIdGetGet(String, String, String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SignalsApi#v1SignalsIdGetGet(String, String, String)}
   */
  @Test
  @DisplayName("Test v1SignalsIdGetGet(String, String, String); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.Signal SignalsApi.v1SignalsIdGetGet(String, String, String)"
  })
  void testV1SignalsIdGetGet_when42_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> new SignalsApi(apiClient).v1SignalsIdGetGet(null, "ABC123", "42"));
  }

  /**
   * Test {@link SignalsApi#v1SignalsIdGetGetWithHttpInfo(String, String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SignalsApi#v1SignalsIdGetGetWithHttpInfo(String, String, String)}
   */
  @Test
  @DisplayName(
      "Test v1SignalsIdGetGetWithHttpInfo(String, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse SignalsApi.v1SignalsIdGetGetWithHttpInfo(String, String, String)"
  })
  void testV1SignalsIdGetGetWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new SignalsApi(apiClient)
                .v1SignalsIdGetGetWithHttpInfo(
                    null, "https://example.org/example", "https://example.org/example"));
  }

  /**
   * Test {@link SignalsApi#v1SignalsIdGetGetWithHttpInfo(String, String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SignalsApi#v1SignalsIdGetGetWithHttpInfo(String, String, String)}
   */
  @Test
  @DisplayName(
      "Test v1SignalsIdGetGetWithHttpInfo(String, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse SignalsApi.v1SignalsIdGetGetWithHttpInfo(String, String, String)"
  })
  void testV1SignalsIdGetGetWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new SignalsApi(apiClient)
                .v1SignalsIdGetGetWithHttpInfo("https://example.org/example", null, null));
  }

  /**
   * Test {@link SignalsApi#v1SignalsIdSubscribePost(String, String, String, Boolean, List)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SignalsApi#v1SignalsIdSubscribePost(String, String, String,
   * Boolean, List)}
   */
  @Test
  @DisplayName(
      "Test v1SignalsIdSubscribePost(String, String, String, Boolean, List); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.ChannelSubscriptionResponse SignalsApi.v1SignalsIdSubscribePost(String, String, String, Boolean, List)"
  })
  void testV1SignalsIdSubscribePost_when42_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    SignalsApi signalsApi = new SignalsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> signalsApi.v1SignalsIdSubscribePost(null, "ABC123", "42", true, new ArrayList<>()));
  }

  /**
   * Test {@link SignalsApi#v1SignalsIdSubscribePost(String, String, String, Boolean, List)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SignalsApi#v1SignalsIdSubscribePost(String, String, String,
   * Boolean, List)}
   */
  @Test
  @DisplayName(
      "Test v1SignalsIdSubscribePost(String, String, String, Boolean, List); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.ChannelSubscriptionResponse SignalsApi.v1SignalsIdSubscribePost(String, String, String, Boolean, List)"
  })
  void testV1SignalsIdSubscribePost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    SignalsApi signalsApi = new SignalsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> signalsApi.v1SignalsIdSubscribePost("ABC123", null, null, true, new ArrayList<>()));
  }

  /**
   * Test {@link SignalsApi#v1SignalsIdSubscribePostWithHttpInfo(String, String, String, Boolean,
   * List)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SignalsApi#v1SignalsIdSubscribePostWithHttpInfo(String, String,
   * String, Boolean, List)}
   */
  @Test
  @DisplayName(
      "Test v1SignalsIdSubscribePostWithHttpInfo(String, String, String, Boolean, List); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse SignalsApi.v1SignalsIdSubscribePostWithHttpInfo(String, String, String, Boolean, List)"
  })
  void testV1SignalsIdSubscribePostWithHttpInfo_whenNull_thenThrowApiException()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    SignalsApi signalsApi = new SignalsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            signalsApi.v1SignalsIdSubscribePostWithHttpInfo(
                null,
                "https://example.org/example",
                "https://example.org/example",
                true,
                new ArrayList<>()));
  }

  /**
   * Test {@link SignalsApi#v1SignalsIdSubscribePostWithHttpInfo(String, String, String, Boolean,
   * List)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SignalsApi#v1SignalsIdSubscribePostWithHttpInfo(String, String,
   * String, Boolean, List)}
   */
  @Test
  @DisplayName(
      "Test v1SignalsIdSubscribePostWithHttpInfo(String, String, String, Boolean, List); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse SignalsApi.v1SignalsIdSubscribePostWithHttpInfo(String, String, String, Boolean, List)"
  })
  void testV1SignalsIdSubscribePostWithHttpInfo_whenNull_thenThrowApiException2()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    SignalsApi signalsApi = new SignalsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            signalsApi.v1SignalsIdSubscribePostWithHttpInfo(
                "https://example.org/example", null, null, true, new ArrayList<>()));
  }

  /**
   * Test {@link SignalsApi#v1SignalsIdSubscribersGet(String, String, String, Integer, Integer)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SignalsApi#v1SignalsIdSubscribersGet(String, String, String,
   * Integer, Integer)}
   */
  @Test
  @DisplayName(
      "Test v1SignalsIdSubscribersGet(String, String, String, Integer, Integer); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.ChannelSubscriberResponse SignalsApi.v1SignalsIdSubscribersGet(String, String, String, Integer, Integer)"
  })
  void testV1SignalsIdSubscribersGet_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> new SignalsApi(apiClient).v1SignalsIdSubscribersGet("ABC123", null, null, 1, 1));
  }

  /**
   * Test {@link SignalsApi#v1SignalsIdSubscribersGet(String, String, String, Integer, Integer)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SignalsApi#v1SignalsIdSubscribersGet(String, String, String,
   * Integer, Integer)}
   */
  @Test
  @DisplayName(
      "Test v1SignalsIdSubscribersGet(String, String, String, Integer, Integer); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.ChannelSubscriberResponse SignalsApi.v1SignalsIdSubscribersGet(String, String, String, Integer, Integer)"
  })
  void testV1SignalsIdSubscribersGet_when42_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> new SignalsApi(apiClient).v1SignalsIdSubscribersGet(null, "ABC123", "42", 1, 1));
  }

  /**
   * Test {@link SignalsApi#v1SignalsIdSubscribersGetWithHttpInfo(String, String, String, Integer,
   * Integer)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SignalsApi#v1SignalsIdSubscribersGetWithHttpInfo(String, String,
   * String, Integer, Integer)}
   */
  @Test
  @DisplayName(
      "Test v1SignalsIdSubscribersGetWithHttpInfo(String, String, String, Integer, Integer); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse SignalsApi.v1SignalsIdSubscribersGetWithHttpInfo(String, String, String, Integer, Integer)"
  })
  void testV1SignalsIdSubscribersGetWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new SignalsApi(apiClient)
                .v1SignalsIdSubscribersGetWithHttpInfo(
                    null, "https://example.org/example", "https://example.org/example", 1, 1));
  }

  /**
   * Test {@link SignalsApi#v1SignalsIdSubscribersGetWithHttpInfo(String, String, String, Integer,
   * Integer)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SignalsApi#v1SignalsIdSubscribersGetWithHttpInfo(String, String,
   * String, Integer, Integer)}
   */
  @Test
  @DisplayName(
      "Test v1SignalsIdSubscribersGetWithHttpInfo(String, String, String, Integer, Integer); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse SignalsApi.v1SignalsIdSubscribersGetWithHttpInfo(String, String, String, Integer, Integer)"
  })
  void testV1SignalsIdSubscribersGetWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new SignalsApi(apiClient)
                .v1SignalsIdSubscribersGetWithHttpInfo(
                    "https://example.org/example", null, null, 1, 1));
  }

  /**
   * Test {@link SignalsApi#v1SignalsIdUnsubscribePost(String, String, String, List)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SignalsApi#v1SignalsIdUnsubscribePost(String, String, String,
   * List)}
   */
  @Test
  @DisplayName(
      "Test v1SignalsIdUnsubscribePost(String, String, String, List); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.ChannelSubscriptionResponse SignalsApi.v1SignalsIdUnsubscribePost(String, String, String, List)"
  })
  void testV1SignalsIdUnsubscribePost_when42_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    SignalsApi signalsApi = new SignalsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> signalsApi.v1SignalsIdUnsubscribePost(null, "ABC123", "42", new ArrayList<>()));
  }

  /**
   * Test {@link SignalsApi#v1SignalsIdUnsubscribePost(String, String, String, List)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SignalsApi#v1SignalsIdUnsubscribePost(String, String, String,
   * List)}
   */
  @Test
  @DisplayName(
      "Test v1SignalsIdUnsubscribePost(String, String, String, List); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.ChannelSubscriptionResponse SignalsApi.v1SignalsIdUnsubscribePost(String, String, String, List)"
  })
  void testV1SignalsIdUnsubscribePost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    SignalsApi signalsApi = new SignalsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> signalsApi.v1SignalsIdUnsubscribePost("ABC123", null, null, new ArrayList<>()));
  }

  /**
   * Test {@link SignalsApi#v1SignalsIdUnsubscribePostWithHttpInfo(String, String, String, List)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SignalsApi#v1SignalsIdUnsubscribePostWithHttpInfo(String, String,
   * String, List)}
   */
  @Test
  @DisplayName(
      "Test v1SignalsIdUnsubscribePostWithHttpInfo(String, String, String, List); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse SignalsApi.v1SignalsIdUnsubscribePostWithHttpInfo(String, String, String, List)"
  })
  void testV1SignalsIdUnsubscribePostWithHttpInfo_whenNull_thenThrowApiException()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    SignalsApi signalsApi = new SignalsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            signalsApi.v1SignalsIdUnsubscribePostWithHttpInfo(
                null,
                "https://example.org/example",
                "https://example.org/example",
                new ArrayList<>()));
  }

  /**
   * Test {@link SignalsApi#v1SignalsIdUnsubscribePostWithHttpInfo(String, String, String, List)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SignalsApi#v1SignalsIdUnsubscribePostWithHttpInfo(String, String,
   * String, List)}
   */
  @Test
  @DisplayName(
      "Test v1SignalsIdUnsubscribePostWithHttpInfo(String, String, String, List); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse SignalsApi.v1SignalsIdUnsubscribePostWithHttpInfo(String, String, String, List)"
  })
  void testV1SignalsIdUnsubscribePostWithHttpInfo_whenNull_thenThrowApiException2()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    SignalsApi signalsApi = new SignalsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            signalsApi.v1SignalsIdUnsubscribePostWithHttpInfo(
                "https://example.org/example", null, null, new ArrayList<>()));
  }

  /**
   * Test {@link SignalsApi#v1SignalsIdUpdatePost(String, String, String, BaseSignal)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SignalsApi#v1SignalsIdUpdatePost(String, String, String,
   * BaseSignal)}
   */
  @Test
  @DisplayName(
      "Test v1SignalsIdUpdatePost(String, String, String, BaseSignal); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.Signal SignalsApi.v1SignalsIdUpdatePost(String, String, String, BaseSignal)"
  })
  void testV1SignalsIdUpdatePost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    SignalsApi signalsApi = new SignalsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> signalsApi.v1SignalsIdUpdatePost(null, "ABC123", "42", new BaseSignal()));
  }

  /**
   * Test {@link SignalsApi#v1SignalsIdUpdatePost(String, String, String, BaseSignal)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SignalsApi#v1SignalsIdUpdatePost(String, String, String,
   * BaseSignal)}
   */
  @Test
  @DisplayName(
      "Test v1SignalsIdUpdatePost(String, String, String, BaseSignal); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.Signal SignalsApi.v1SignalsIdUpdatePost(String, String, String, BaseSignal)"
  })
  void testV1SignalsIdUpdatePost_thenThrowApiException2() throws ApiException {
    // Arrange
    SignalsApi signalsApi = new SignalsApi(null);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> signalsApi.v1SignalsIdUpdatePost("ABC123", null, null, new BaseSignal()));
  }

  /**
   * Test {@link SignalsApi#v1SignalsIdUpdatePost(String, String, String, BaseSignal)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SignalsApi#v1SignalsIdUpdatePost(String, String, String,
   * BaseSignal)}
   */
  @Test
  @DisplayName(
      "Test v1SignalsIdUpdatePost(String, String, String, BaseSignal); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.Signal SignalsApi.v1SignalsIdUpdatePost(String, String, String, BaseSignal)"
  })
  void testV1SignalsIdUpdatePost_thenThrowApiException3() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(
        ApiException.class,
        () -> new SignalsApi(null).v1SignalsIdUpdatePost("ABC123", null, "42", null));
  }

  /**
   * Test {@link SignalsApi#v1SignalsIdUpdatePostWithHttpInfo(String, String, String, BaseSignal)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SignalsApi#v1SignalsIdUpdatePostWithHttpInfo(String, String,
   * String, BaseSignal)}
   */
  @Test
  @DisplayName(
      "Test v1SignalsIdUpdatePostWithHttpInfo(String, String, String, BaseSignal); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse SignalsApi.v1SignalsIdUpdatePostWithHttpInfo(String, String, String, BaseSignal)"
  })
  void testV1SignalsIdUpdatePostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    SignalsApi signalsApi = new SignalsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            signalsApi.v1SignalsIdUpdatePostWithHttpInfo(
                null,
                "https://example.org/example",
                "https://example.org/example",
                new BaseSignal()));
  }

  /**
   * Test {@link SignalsApi#v1SignalsIdUpdatePostWithHttpInfo(String, String, String, BaseSignal)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SignalsApi#v1SignalsIdUpdatePostWithHttpInfo(String, String,
   * String, BaseSignal)}
   */
  @Test
  @DisplayName(
      "Test v1SignalsIdUpdatePostWithHttpInfo(String, String, String, BaseSignal); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse SignalsApi.v1SignalsIdUpdatePostWithHttpInfo(String, String, String, BaseSignal)"
  })
  void testV1SignalsIdUpdatePostWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    SignalsApi signalsApi = new SignalsApi(null);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            signalsApi.v1SignalsIdUpdatePostWithHttpInfo(
                "https://example.org/example", null, null, new BaseSignal()));
  }

  /**
   * Test {@link SignalsApi#v1SignalsIdUpdatePostWithHttpInfo(String, String, String, BaseSignal)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SignalsApi#v1SignalsIdUpdatePostWithHttpInfo(String, String,
   * String, BaseSignal)}
   */
  @Test
  @DisplayName(
      "Test v1SignalsIdUpdatePostWithHttpInfo(String, String, String, BaseSignal); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse SignalsApi.v1SignalsIdUpdatePostWithHttpInfo(String, String, String, BaseSignal)"
  })
  void testV1SignalsIdUpdatePostWithHttpInfo_thenThrowApiException3() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new SignalsApi(null)
                .v1SignalsIdUpdatePostWithHttpInfo(
                    "https://example.org/example", null, "https://example.org/example", null));
  }

  /**
   * Test {@link SignalsApi#v1SignalsListGet(String, String, Integer, Integer)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SignalsApi#v1SignalsListGet(String, String, Integer, Integer)}
   */
  @Test
  @DisplayName("Test v1SignalsListGet(String, String, Integer, Integer); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List SignalsApi.v1SignalsListGet(String, String, Integer, Integer)"})
  void testV1SignalsListGet_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act and Assert
    assertThrows(
        ApiException.class, () -> new SignalsApi(apiClient).v1SignalsListGet(null, "ABC123", 1, 1));
  }

  /**
   * Test {@link SignalsApi#v1SignalsListGetWithHttpInfo(String, String, Integer, Integer)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SignalsApi#v1SignalsListGetWithHttpInfo(String, String, Integer,
   * Integer)}
   */
  @Test
  @DisplayName(
      "Test v1SignalsListGetWithHttpInfo(String, String, Integer, Integer); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse SignalsApi.v1SignalsListGetWithHttpInfo(String, String, Integer, Integer)"
  })
  void testV1SignalsListGetWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new SignalsApi(apiClient)
                .v1SignalsListGetWithHttpInfo(null, "https://example.org/example", 1, 1));
  }
}
