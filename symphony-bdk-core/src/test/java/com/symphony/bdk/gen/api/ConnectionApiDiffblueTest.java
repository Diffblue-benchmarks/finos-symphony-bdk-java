package com.symphony.bdk.gen.api;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.UserConnectionRequest;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import jakarta.ws.rs.client.Client;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ConnectionApiDiffblueTest {
  /**
   * Test {@link ConnectionApi#v1ConnectionAcceptPost(String, UserConnectionRequest)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionApi#v1ConnectionAcceptPost(String,
   * UserConnectionRequest)}
   */
  @Test
  @DisplayName(
      "Test v1ConnectionAcceptPost(String, UserConnectionRequest); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.UserConnection ConnectionApi.v1ConnectionAcceptPost(String, UserConnectionRequest)"
  })
  void testV1ConnectionAcceptPost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    ConnectionApi connectionApi = new ConnectionApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> connectionApi.v1ConnectionAcceptPost(null, new UserConnectionRequest()));
  }

  /**
   * Test {@link ConnectionApi#v1ConnectionAcceptPost(String, UserConnectionRequest)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionApi#v1ConnectionAcceptPost(String,
   * UserConnectionRequest)}
   */
  @Test
  @DisplayName(
      "Test v1ConnectionAcceptPost(String, UserConnectionRequest); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.UserConnection ConnectionApi.v1ConnectionAcceptPost(String, UserConnectionRequest)"
  })
  void testV1ConnectionAcceptPost_thenThrowApiException2() throws ApiException {
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
        () -> new ConnectionApi(apiClient).v1ConnectionAcceptPost("ABC123", null));
  }

  /**
   * Test {@link ConnectionApi#v1ConnectionAcceptPostWithHttpInfo(String, UserConnectionRequest)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionApi#v1ConnectionAcceptPostWithHttpInfo(String,
   * UserConnectionRequest)}
   */
  @Test
  @DisplayName(
      "Test v1ConnectionAcceptPostWithHttpInfo(String, UserConnectionRequest); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ConnectionApi.v1ConnectionAcceptPostWithHttpInfo(String, UserConnectionRequest)"
  })
  void testV1ConnectionAcceptPostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    ConnectionApi connectionApi = new ConnectionApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> connectionApi.v1ConnectionAcceptPostWithHttpInfo(null, new UserConnectionRequest()));
  }

  /**
   * Test {@link ConnectionApi#v1ConnectionAcceptPostWithHttpInfo(String, UserConnectionRequest)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionApi#v1ConnectionAcceptPostWithHttpInfo(String,
   * UserConnectionRequest)}
   */
  @Test
  @DisplayName(
      "Test v1ConnectionAcceptPostWithHttpInfo(String, UserConnectionRequest); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ConnectionApi.v1ConnectionAcceptPostWithHttpInfo(String, UserConnectionRequest)"
  })
  void testV1ConnectionAcceptPostWithHttpInfo_thenThrowApiException2() throws ApiException {
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
            new ConnectionApi(apiClient)
                .v1ConnectionAcceptPostWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link ConnectionApi#v1ConnectionCreatePost(String, UserConnectionRequest)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionApi#v1ConnectionCreatePost(String,
   * UserConnectionRequest)}
   */
  @Test
  @DisplayName(
      "Test v1ConnectionCreatePost(String, UserConnectionRequest); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.UserConnection ConnectionApi.v1ConnectionCreatePost(String, UserConnectionRequest)"
  })
  void testV1ConnectionCreatePost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    ConnectionApi connectionApi = new ConnectionApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> connectionApi.v1ConnectionCreatePost(null, new UserConnectionRequest()));
  }

  /**
   * Test {@link ConnectionApi#v1ConnectionCreatePost(String, UserConnectionRequest)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionApi#v1ConnectionCreatePost(String,
   * UserConnectionRequest)}
   */
  @Test
  @DisplayName(
      "Test v1ConnectionCreatePost(String, UserConnectionRequest); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.UserConnection ConnectionApi.v1ConnectionCreatePost(String, UserConnectionRequest)"
  })
  void testV1ConnectionCreatePost_thenThrowApiException2() throws ApiException {
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
        () -> new ConnectionApi(apiClient).v1ConnectionCreatePost("ABC123", null));
  }

  /**
   * Test {@link ConnectionApi#v1ConnectionCreatePostWithHttpInfo(String, UserConnectionRequest)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionApi#v1ConnectionCreatePostWithHttpInfo(String,
   * UserConnectionRequest)}
   */
  @Test
  @DisplayName(
      "Test v1ConnectionCreatePostWithHttpInfo(String, UserConnectionRequest); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ConnectionApi.v1ConnectionCreatePostWithHttpInfo(String, UserConnectionRequest)"
  })
  void testV1ConnectionCreatePostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    ConnectionApi connectionApi = new ConnectionApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> connectionApi.v1ConnectionCreatePostWithHttpInfo(null, new UserConnectionRequest()));
  }

  /**
   * Test {@link ConnectionApi#v1ConnectionCreatePostWithHttpInfo(String, UserConnectionRequest)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionApi#v1ConnectionCreatePostWithHttpInfo(String,
   * UserConnectionRequest)}
   */
  @Test
  @DisplayName(
      "Test v1ConnectionCreatePostWithHttpInfo(String, UserConnectionRequest); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ConnectionApi.v1ConnectionCreatePostWithHttpInfo(String, UserConnectionRequest)"
  })
  void testV1ConnectionCreatePostWithHttpInfo_thenThrowApiException2() throws ApiException {
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
            new ConnectionApi(apiClient)
                .v1ConnectionCreatePostWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link ConnectionApi#v1ConnectionListGet(String, String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionApi#v1ConnectionListGet(String, String, String)}
   */
  @Test
  @DisplayName(
      "Test v1ConnectionListGet(String, String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.List ConnectionApi.v1ConnectionListGet(String, String, String)"})
  void testV1ConnectionListGet_whenNull_thenThrowApiException() throws ApiException {
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
        () -> new ConnectionApi(apiClient).v1ConnectionListGet(null, "Status", "User Ids"));
  }

  /**
   * Test {@link ConnectionApi#v1ConnectionListGetWithHttpInfo(String, String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionApi#v1ConnectionListGetWithHttpInfo(String, String,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v1ConnectionListGetWithHttpInfo(String, String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ConnectionApi.v1ConnectionListGetWithHttpInfo(String, String, String)"
  })
  void testV1ConnectionListGetWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
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
            new ConnectionApi(apiClient)
                .v1ConnectionListGetWithHttpInfo(
                    null, "https://example.org/example", "https://example.org/example"));
  }

  /**
   * Test {@link ConnectionApi#v1ConnectionRejectPost(String, UserConnectionRequest)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionApi#v1ConnectionRejectPost(String,
   * UserConnectionRequest)}
   */
  @Test
  @DisplayName(
      "Test v1ConnectionRejectPost(String, UserConnectionRequest); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.UserConnection ConnectionApi.v1ConnectionRejectPost(String, UserConnectionRequest)"
  })
  void testV1ConnectionRejectPost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    ConnectionApi connectionApi = new ConnectionApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> connectionApi.v1ConnectionRejectPost(null, new UserConnectionRequest()));
  }

  /**
   * Test {@link ConnectionApi#v1ConnectionRejectPost(String, UserConnectionRequest)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionApi#v1ConnectionRejectPost(String,
   * UserConnectionRequest)}
   */
  @Test
  @DisplayName(
      "Test v1ConnectionRejectPost(String, UserConnectionRequest); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.UserConnection ConnectionApi.v1ConnectionRejectPost(String, UserConnectionRequest)"
  })
  void testV1ConnectionRejectPost_thenThrowApiException2() throws ApiException {
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
        () -> new ConnectionApi(apiClient).v1ConnectionRejectPost("ABC123", null));
  }

  /**
   * Test {@link ConnectionApi#v1ConnectionRejectPostWithHttpInfo(String, UserConnectionRequest)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionApi#v1ConnectionRejectPostWithHttpInfo(String,
   * UserConnectionRequest)}
   */
  @Test
  @DisplayName(
      "Test v1ConnectionRejectPostWithHttpInfo(String, UserConnectionRequest); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ConnectionApi.v1ConnectionRejectPostWithHttpInfo(String, UserConnectionRequest)"
  })
  void testV1ConnectionRejectPostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    ConnectionApi connectionApi = new ConnectionApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> connectionApi.v1ConnectionRejectPostWithHttpInfo(null, new UserConnectionRequest()));
  }

  /**
   * Test {@link ConnectionApi#v1ConnectionRejectPostWithHttpInfo(String, UserConnectionRequest)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionApi#v1ConnectionRejectPostWithHttpInfo(String,
   * UserConnectionRequest)}
   */
  @Test
  @DisplayName(
      "Test v1ConnectionRejectPostWithHttpInfo(String, UserConnectionRequest); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ConnectionApi.v1ConnectionRejectPostWithHttpInfo(String, UserConnectionRequest)"
  })
  void testV1ConnectionRejectPostWithHttpInfo_thenThrowApiException2() throws ApiException {
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
            new ConnectionApi(apiClient)
                .v1ConnectionRejectPostWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link ConnectionApi#v1ConnectionUserUidRemovePost(String, Long)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionApi#v1ConnectionUserUidRemovePost(String, Long)}
   */
  @Test
  @DisplayName(
      "Test v1ConnectionUserUidRemovePost(String, Long); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.SuccessResponse ConnectionApi.v1ConnectionUserUidRemovePost(String, Long)"
  })
  void testV1ConnectionUserUidRemovePost_whenNull_thenThrowApiException() throws ApiException {
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
        () -> new ConnectionApi(apiClient).v1ConnectionUserUidRemovePost(null, 1L));
  }

  /**
   * Test {@link ConnectionApi#v1ConnectionUserUidRemovePost(String, Long)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionApi#v1ConnectionUserUidRemovePost(String, Long)}
   */
  @Test
  @DisplayName(
      "Test v1ConnectionUserUidRemovePost(String, Long); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.SuccessResponse ConnectionApi.v1ConnectionUserUidRemovePost(String, Long)"
  })
  void testV1ConnectionUserUidRemovePost_whenNull_thenThrowApiException2() throws ApiException {
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
        () -> new ConnectionApi(apiClient).v1ConnectionUserUidRemovePost("ABC123", null));
  }

  /**
   * Test {@link ConnectionApi#v1ConnectionUserUidRemovePostWithHttpInfo(String, Long)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionApi#v1ConnectionUserUidRemovePostWithHttpInfo(String,
   * Long)}
   */
  @Test
  @DisplayName(
      "Test v1ConnectionUserUidRemovePostWithHttpInfo(String, Long); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ConnectionApi.v1ConnectionUserUidRemovePostWithHttpInfo(String, Long)"
  })
  void testV1ConnectionUserUidRemovePostWithHttpInfo_whenNull_thenThrowApiException()
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

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> new ConnectionApi(apiClient).v1ConnectionUserUidRemovePostWithHttpInfo(null, 1L));
  }

  /**
   * Test {@link ConnectionApi#v1ConnectionUserUidRemovePostWithHttpInfo(String, Long)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionApi#v1ConnectionUserUidRemovePostWithHttpInfo(String,
   * Long)}
   */
  @Test
  @DisplayName(
      "Test v1ConnectionUserUidRemovePostWithHttpInfo(String, Long); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ConnectionApi.v1ConnectionUserUidRemovePostWithHttpInfo(String, Long)"
  })
  void testV1ConnectionUserUidRemovePostWithHttpInfo_whenNull_thenThrowApiException2()
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

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new ConnectionApi(apiClient)
                .v1ConnectionUserUidRemovePostWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link ConnectionApi#v1ConnectionUserUserIdInfoGet(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionApi#v1ConnectionUserUserIdInfoGet(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1ConnectionUserUserIdInfoGet(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.UserConnection ConnectionApi.v1ConnectionUserUserIdInfoGet(String, String)"
  })
  void testV1ConnectionUserUserIdInfoGet_whenNull_thenThrowApiException() throws ApiException {
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
        () -> new ConnectionApi(apiClient).v1ConnectionUserUserIdInfoGet(null, "42"));
  }

  /**
   * Test {@link ConnectionApi#v1ConnectionUserUserIdInfoGet(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionApi#v1ConnectionUserUserIdInfoGet(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1ConnectionUserUserIdInfoGet(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.UserConnection ConnectionApi.v1ConnectionUserUserIdInfoGet(String, String)"
  })
  void testV1ConnectionUserUserIdInfoGet_whenNull_thenThrowApiException2() throws ApiException {
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
        () -> new ConnectionApi(apiClient).v1ConnectionUserUserIdInfoGet("ABC123", null));
  }

  /**
   * Test {@link ConnectionApi#v1ConnectionUserUserIdInfoGetWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionApi#v1ConnectionUserUserIdInfoGetWithHttpInfo(String,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v1ConnectionUserUserIdInfoGetWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ConnectionApi.v1ConnectionUserUserIdInfoGetWithHttpInfo(String, String)"
  })
  void testV1ConnectionUserUserIdInfoGetWithHttpInfo_whenNull_thenThrowApiException()
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

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new ConnectionApi(apiClient)
                .v1ConnectionUserUserIdInfoGetWithHttpInfo(null, "https://example.org/example"));
  }

  /**
   * Test {@link ConnectionApi#v1ConnectionUserUserIdInfoGetWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionApi#v1ConnectionUserUserIdInfoGetWithHttpInfo(String,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v1ConnectionUserUserIdInfoGetWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ConnectionApi.v1ConnectionUserUserIdInfoGetWithHttpInfo(String, String)"
  })
  void testV1ConnectionUserUserIdInfoGetWithHttpInfo_whenNull_thenThrowApiException2()
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

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new ConnectionApi(apiClient)
                .v1ConnectionUserUserIdInfoGetWithHttpInfo("https://example.org/example", null));
  }
}
