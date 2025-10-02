package com.symphony.bdk.gen.api;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.UserId;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import jakarta.ws.rs.client.Client;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RoomMembershipApiDiffblueTest {
  /**
   * Test {@link RoomMembershipApi#v1AdminRoomIdMembershipAddPost(String, String, UserId)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link RoomMembershipApi#v1AdminRoomIdMembershipAddPost(String, String,
   * UserId)}
   */
  @Test
  @DisplayName(
      "Test v1AdminRoomIdMembershipAddPost(String, String, UserId); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.SuccessResponse RoomMembershipApi.v1AdminRoomIdMembershipAddPost(String, String, UserId)"
  })
  void testV1AdminRoomIdMembershipAddPost_when42_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    RoomMembershipApi roomMembershipApi = new RoomMembershipApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> roomMembershipApi.v1AdminRoomIdMembershipAddPost("42", null, new UserId()));
  }

  /**
   * Test {@link RoomMembershipApi#v1AdminRoomIdMembershipAddPost(String, String, UserId)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link RoomMembershipApi#v1AdminRoomIdMembershipAddPost(String, String,
   * UserId)}
   */
  @Test
  @DisplayName(
      "Test v1AdminRoomIdMembershipAddPost(String, String, UserId); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.SuccessResponse RoomMembershipApi.v1AdminRoomIdMembershipAddPost(String, String, UserId)"
  })
  void testV1AdminRoomIdMembershipAddPost_when42_thenThrowApiException2() throws ApiException {
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
            new RoomMembershipApi(apiClient).v1AdminRoomIdMembershipAddPost("42", "ABC123", null));
  }

  /**
   * Test {@link RoomMembershipApi#v1AdminRoomIdMembershipAddPost(String, String, UserId)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link RoomMembershipApi#v1AdminRoomIdMembershipAddPost(String, String,
   * UserId)}
   */
  @Test
  @DisplayName(
      "Test v1AdminRoomIdMembershipAddPost(String, String, UserId); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.SuccessResponse RoomMembershipApi.v1AdminRoomIdMembershipAddPost(String, String, UserId)"
  })
  void testV1AdminRoomIdMembershipAddPost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    RoomMembershipApi roomMembershipApi = new RoomMembershipApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> roomMembershipApi.v1AdminRoomIdMembershipAddPost(null, "ABC123", new UserId()));
  }

  /**
   * Test {@link RoomMembershipApi#v1AdminRoomIdMembershipAddPostWithHttpInfo(String, String,
   * UserId)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * RoomMembershipApi#v1AdminRoomIdMembershipAddPostWithHttpInfo(String, String, UserId)}
   */
  @Test
  @DisplayName(
      "Test v1AdminRoomIdMembershipAddPostWithHttpInfo(String, String, UserId); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse RoomMembershipApi.v1AdminRoomIdMembershipAddPostWithHttpInfo(String, String, UserId)"
  })
  void testV1AdminRoomIdMembershipAddPostWithHttpInfo_whenNull_thenThrowApiException()
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
    RoomMembershipApi roomMembershipApi = new RoomMembershipApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            roomMembershipApi.v1AdminRoomIdMembershipAddPostWithHttpInfo(
                null, "https://example.org/example", new UserId()));
  }

  /**
   * Test {@link RoomMembershipApi#v1AdminRoomIdMembershipAddPostWithHttpInfo(String, String,
   * UserId)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * RoomMembershipApi#v1AdminRoomIdMembershipAddPostWithHttpInfo(String, String, UserId)}
   */
  @Test
  @DisplayName(
      "Test v1AdminRoomIdMembershipAddPostWithHttpInfo(String, String, UserId); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse RoomMembershipApi.v1AdminRoomIdMembershipAddPostWithHttpInfo(String, String, UserId)"
  })
  void testV1AdminRoomIdMembershipAddPostWithHttpInfo_whenNull_thenThrowApiException2()
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
    RoomMembershipApi roomMembershipApi = new RoomMembershipApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            roomMembershipApi.v1AdminRoomIdMembershipAddPostWithHttpInfo(
                "https://example.org/example", null, new UserId()));
  }

  /**
   * Test {@link RoomMembershipApi#v1AdminRoomIdMembershipAddPostWithHttpInfo(String, String,
   * UserId)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * RoomMembershipApi#v1AdminRoomIdMembershipAddPostWithHttpInfo(String, String, UserId)}
   */
  @Test
  @DisplayName(
      "Test v1AdminRoomIdMembershipAddPostWithHttpInfo(String, String, UserId); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse RoomMembershipApi.v1AdminRoomIdMembershipAddPostWithHttpInfo(String, String, UserId)"
  })
  void testV1AdminRoomIdMembershipAddPostWithHttpInfo_whenNull_thenThrowApiException3()
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
            new RoomMembershipApi(apiClient)
                .v1AdminRoomIdMembershipAddPostWithHttpInfo(
                    "https://example.org/example", "https://example.org/example", null));
  }

  /**
   * Test {@link RoomMembershipApi#v1AdminRoomIdMembershipListGet(String, String, Boolean)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link RoomMembershipApi#v1AdminRoomIdMembershipListGet(String, String,
   * Boolean)}
   */
  @Test
  @DisplayName(
      "Test v1AdminRoomIdMembershipListGet(String, String, Boolean); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.List RoomMembershipApi.v1AdminRoomIdMembershipListGet(String, String, Boolean)"
  })
  void testV1AdminRoomIdMembershipListGet_when42_thenThrowApiException() throws ApiException {
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
        () -> new RoomMembershipApi(apiClient).v1AdminRoomIdMembershipListGet("42", null, true));
  }

  /**
   * Test {@link RoomMembershipApi#v1AdminRoomIdMembershipListGet(String, String, Boolean)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link RoomMembershipApi#v1AdminRoomIdMembershipListGet(String, String,
   * Boolean)}
   */
  @Test
  @DisplayName(
      "Test v1AdminRoomIdMembershipListGet(String, String, Boolean); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.List RoomMembershipApi.v1AdminRoomIdMembershipListGet(String, String, Boolean)"
  })
  void testV1AdminRoomIdMembershipListGet_whenNull_thenThrowApiException() throws ApiException {
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
            new RoomMembershipApi(apiClient).v1AdminRoomIdMembershipListGet(null, "ABC123", true));
  }

  /**
   * Test {@link RoomMembershipApi#v1AdminRoomIdMembershipListGetWithHttpInfo(String, String,
   * Boolean)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * RoomMembershipApi#v1AdminRoomIdMembershipListGetWithHttpInfo(String, String, Boolean)}
   */
  @Test
  @DisplayName(
      "Test v1AdminRoomIdMembershipListGetWithHttpInfo(String, String, Boolean); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse RoomMembershipApi.v1AdminRoomIdMembershipListGetWithHttpInfo(String, String, Boolean)"
  })
  void testV1AdminRoomIdMembershipListGetWithHttpInfo_whenNull_thenThrowApiException()
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
            new RoomMembershipApi(apiClient)
                .v1AdminRoomIdMembershipListGetWithHttpInfo(
                    null, "https://example.org/example", true));
  }

  /**
   * Test {@link RoomMembershipApi#v1AdminRoomIdMembershipListGetWithHttpInfo(String, String,
   * Boolean)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * RoomMembershipApi#v1AdminRoomIdMembershipListGetWithHttpInfo(String, String, Boolean)}
   */
  @Test
  @DisplayName(
      "Test v1AdminRoomIdMembershipListGetWithHttpInfo(String, String, Boolean); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse RoomMembershipApi.v1AdminRoomIdMembershipListGetWithHttpInfo(String, String, Boolean)"
  })
  void testV1AdminRoomIdMembershipListGetWithHttpInfo_whenNull_thenThrowApiException2()
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
            new RoomMembershipApi(apiClient)
                .v1AdminRoomIdMembershipListGetWithHttpInfo(
                    "https://example.org/example", null, true));
  }

  /**
   * Test {@link RoomMembershipApi#v1AdminRoomIdMembershipRemovePost(String, String, UserId)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link RoomMembershipApi#v1AdminRoomIdMembershipRemovePost(String,
   * String, UserId)}
   */
  @Test
  @DisplayName(
      "Test v1AdminRoomIdMembershipRemovePost(String, String, UserId); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.SuccessResponse RoomMembershipApi.v1AdminRoomIdMembershipRemovePost(String, String, UserId)"
  })
  void testV1AdminRoomIdMembershipRemovePost_when42_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    RoomMembershipApi roomMembershipApi = new RoomMembershipApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> roomMembershipApi.v1AdminRoomIdMembershipRemovePost("42", null, new UserId()));
  }

  /**
   * Test {@link RoomMembershipApi#v1AdminRoomIdMembershipRemovePost(String, String, UserId)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link RoomMembershipApi#v1AdminRoomIdMembershipRemovePost(String,
   * String, UserId)}
   */
  @Test
  @DisplayName(
      "Test v1AdminRoomIdMembershipRemovePost(String, String, UserId); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.SuccessResponse RoomMembershipApi.v1AdminRoomIdMembershipRemovePost(String, String, UserId)"
  })
  void testV1AdminRoomIdMembershipRemovePost_when42_thenThrowApiException2() throws ApiException {
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
            new RoomMembershipApi(apiClient)
                .v1AdminRoomIdMembershipRemovePost("42", "ABC123", null));
  }

  /**
   * Test {@link RoomMembershipApi#v1AdminRoomIdMembershipRemovePost(String, String, UserId)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link RoomMembershipApi#v1AdminRoomIdMembershipRemovePost(String,
   * String, UserId)}
   */
  @Test
  @DisplayName(
      "Test v1AdminRoomIdMembershipRemovePost(String, String, UserId); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.SuccessResponse RoomMembershipApi.v1AdminRoomIdMembershipRemovePost(String, String, UserId)"
  })
  void testV1AdminRoomIdMembershipRemovePost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    RoomMembershipApi roomMembershipApi = new RoomMembershipApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> roomMembershipApi.v1AdminRoomIdMembershipRemovePost(null, "ABC123", new UserId()));
  }

  /**
   * Test {@link RoomMembershipApi#v1AdminRoomIdMembershipRemovePostWithHttpInfo(String, String,
   * UserId)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * RoomMembershipApi#v1AdminRoomIdMembershipRemovePostWithHttpInfo(String, String, UserId)}
   */
  @Test
  @DisplayName(
      "Test v1AdminRoomIdMembershipRemovePostWithHttpInfo(String, String, UserId); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse RoomMembershipApi.v1AdminRoomIdMembershipRemovePostWithHttpInfo(String, String, UserId)"
  })
  void testV1AdminRoomIdMembershipRemovePostWithHttpInfo_whenNull_thenThrowApiException()
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
    RoomMembershipApi roomMembershipApi = new RoomMembershipApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            roomMembershipApi.v1AdminRoomIdMembershipRemovePostWithHttpInfo(
                null, "https://example.org/example", new UserId()));
  }

  /**
   * Test {@link RoomMembershipApi#v1AdminRoomIdMembershipRemovePostWithHttpInfo(String, String,
   * UserId)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * RoomMembershipApi#v1AdminRoomIdMembershipRemovePostWithHttpInfo(String, String, UserId)}
   */
  @Test
  @DisplayName(
      "Test v1AdminRoomIdMembershipRemovePostWithHttpInfo(String, String, UserId); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse RoomMembershipApi.v1AdminRoomIdMembershipRemovePostWithHttpInfo(String, String, UserId)"
  })
  void testV1AdminRoomIdMembershipRemovePostWithHttpInfo_whenNull_thenThrowApiException2()
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
    RoomMembershipApi roomMembershipApi = new RoomMembershipApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            roomMembershipApi.v1AdminRoomIdMembershipRemovePostWithHttpInfo(
                "https://example.org/example", null, new UserId()));
  }

  /**
   * Test {@link RoomMembershipApi#v1AdminRoomIdMembershipRemovePostWithHttpInfo(String, String,
   * UserId)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * RoomMembershipApi#v1AdminRoomIdMembershipRemovePostWithHttpInfo(String, String, UserId)}
   */
  @Test
  @DisplayName(
      "Test v1AdminRoomIdMembershipRemovePostWithHttpInfo(String, String, UserId); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse RoomMembershipApi.v1AdminRoomIdMembershipRemovePostWithHttpInfo(String, String, UserId)"
  })
  void testV1AdminRoomIdMembershipRemovePostWithHttpInfo_whenNull_thenThrowApiException3()
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
            new RoomMembershipApi(apiClient)
                .v1AdminRoomIdMembershipRemovePostWithHttpInfo(
                    "https://example.org/example", "https://example.org/example", null));
  }

  /**
   * Test {@link RoomMembershipApi#v1RoomIdMembershipAddPost(String, String, UserId)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link RoomMembershipApi#v1RoomIdMembershipAddPost(String, String,
   * UserId)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdMembershipAddPost(String, String, UserId); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.SuccessResponse RoomMembershipApi.v1RoomIdMembershipAddPost(String, String, UserId)"
  })
  void testV1RoomIdMembershipAddPost_when42_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    RoomMembershipApi roomMembershipApi = new RoomMembershipApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> roomMembershipApi.v1RoomIdMembershipAddPost("42", null, new UserId()));
  }

  /**
   * Test {@link RoomMembershipApi#v1RoomIdMembershipAddPost(String, String, UserId)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link RoomMembershipApi#v1RoomIdMembershipAddPost(String, String,
   * UserId)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdMembershipAddPost(String, String, UserId); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.SuccessResponse RoomMembershipApi.v1RoomIdMembershipAddPost(String, String, UserId)"
  })
  void testV1RoomIdMembershipAddPost_when42_thenThrowApiException2() throws ApiException {
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
        () -> new RoomMembershipApi(apiClient).v1RoomIdMembershipAddPost("42", "ABC123", null));
  }

  /**
   * Test {@link RoomMembershipApi#v1RoomIdMembershipAddPost(String, String, UserId)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link RoomMembershipApi#v1RoomIdMembershipAddPost(String, String,
   * UserId)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdMembershipAddPost(String, String, UserId); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.SuccessResponse RoomMembershipApi.v1RoomIdMembershipAddPost(String, String, UserId)"
  })
  void testV1RoomIdMembershipAddPost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    RoomMembershipApi roomMembershipApi = new RoomMembershipApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> roomMembershipApi.v1RoomIdMembershipAddPost(null, "ABC123", new UserId()));
  }

  /**
   * Test {@link RoomMembershipApi#v1RoomIdMembershipAddPostWithHttpInfo(String, String, UserId)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link RoomMembershipApi#v1RoomIdMembershipAddPostWithHttpInfo(String,
   * String, UserId)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdMembershipAddPostWithHttpInfo(String, String, UserId); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse RoomMembershipApi.v1RoomIdMembershipAddPostWithHttpInfo(String, String, UserId)"
  })
  void testV1RoomIdMembershipAddPostWithHttpInfo_whenNull_thenThrowApiException()
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
    RoomMembershipApi roomMembershipApi = new RoomMembershipApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            roomMembershipApi.v1RoomIdMembershipAddPostWithHttpInfo(
                null, "https://example.org/example", new UserId()));
  }

  /**
   * Test {@link RoomMembershipApi#v1RoomIdMembershipAddPostWithHttpInfo(String, String, UserId)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link RoomMembershipApi#v1RoomIdMembershipAddPostWithHttpInfo(String,
   * String, UserId)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdMembershipAddPostWithHttpInfo(String, String, UserId); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse RoomMembershipApi.v1RoomIdMembershipAddPostWithHttpInfo(String, String, UserId)"
  })
  void testV1RoomIdMembershipAddPostWithHttpInfo_whenNull_thenThrowApiException2()
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
    RoomMembershipApi roomMembershipApi = new RoomMembershipApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            roomMembershipApi.v1RoomIdMembershipAddPostWithHttpInfo(
                "https://example.org/example", null, new UserId()));
  }

  /**
   * Test {@link RoomMembershipApi#v1RoomIdMembershipAddPostWithHttpInfo(String, String, UserId)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link RoomMembershipApi#v1RoomIdMembershipAddPostWithHttpInfo(String,
   * String, UserId)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdMembershipAddPostWithHttpInfo(String, String, UserId); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse RoomMembershipApi.v1RoomIdMembershipAddPostWithHttpInfo(String, String, UserId)"
  })
  void testV1RoomIdMembershipAddPostWithHttpInfo_whenNull_thenThrowApiException3()
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
            new RoomMembershipApi(apiClient)
                .v1RoomIdMembershipAddPostWithHttpInfo(
                    "https://example.org/example", "https://example.org/example", null));
  }

  /**
   * Test {@link RoomMembershipApi#v1RoomIdMembershipDemoteOwnerPost(String, String, UserId)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link RoomMembershipApi#v1RoomIdMembershipDemoteOwnerPost(String,
   * String, UserId)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdMembershipDemoteOwnerPost(String, String, UserId); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.SuccessResponse RoomMembershipApi.v1RoomIdMembershipDemoteOwnerPost(String, String, UserId)"
  })
  void testV1RoomIdMembershipDemoteOwnerPost_when42_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    RoomMembershipApi roomMembershipApi = new RoomMembershipApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> roomMembershipApi.v1RoomIdMembershipDemoteOwnerPost("42", null, new UserId()));
  }

  /**
   * Test {@link RoomMembershipApi#v1RoomIdMembershipDemoteOwnerPost(String, String, UserId)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link RoomMembershipApi#v1RoomIdMembershipDemoteOwnerPost(String,
   * String, UserId)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdMembershipDemoteOwnerPost(String, String, UserId); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.SuccessResponse RoomMembershipApi.v1RoomIdMembershipDemoteOwnerPost(String, String, UserId)"
  })
  void testV1RoomIdMembershipDemoteOwnerPost_when42_thenThrowApiException2() throws ApiException {
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
            new RoomMembershipApi(apiClient)
                .v1RoomIdMembershipDemoteOwnerPost("42", "ABC123", null));
  }

  /**
   * Test {@link RoomMembershipApi#v1RoomIdMembershipDemoteOwnerPost(String, String, UserId)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link RoomMembershipApi#v1RoomIdMembershipDemoteOwnerPost(String,
   * String, UserId)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdMembershipDemoteOwnerPost(String, String, UserId); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.SuccessResponse RoomMembershipApi.v1RoomIdMembershipDemoteOwnerPost(String, String, UserId)"
  })
  void testV1RoomIdMembershipDemoteOwnerPost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    RoomMembershipApi roomMembershipApi = new RoomMembershipApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> roomMembershipApi.v1RoomIdMembershipDemoteOwnerPost(null, "ABC123", new UserId()));
  }

  /**
   * Test {@link RoomMembershipApi#v1RoomIdMembershipDemoteOwnerPostWithHttpInfo(String, String,
   * UserId)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * RoomMembershipApi#v1RoomIdMembershipDemoteOwnerPostWithHttpInfo(String, String, UserId)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdMembershipDemoteOwnerPostWithHttpInfo(String, String, UserId); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse RoomMembershipApi.v1RoomIdMembershipDemoteOwnerPostWithHttpInfo(String, String, UserId)"
  })
  void testV1RoomIdMembershipDemoteOwnerPostWithHttpInfo_whenNull_thenThrowApiException()
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
    RoomMembershipApi roomMembershipApi = new RoomMembershipApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            roomMembershipApi.v1RoomIdMembershipDemoteOwnerPostWithHttpInfo(
                null, "https://example.org/example", new UserId()));
  }

  /**
   * Test {@link RoomMembershipApi#v1RoomIdMembershipDemoteOwnerPostWithHttpInfo(String, String,
   * UserId)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * RoomMembershipApi#v1RoomIdMembershipDemoteOwnerPostWithHttpInfo(String, String, UserId)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdMembershipDemoteOwnerPostWithHttpInfo(String, String, UserId); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse RoomMembershipApi.v1RoomIdMembershipDemoteOwnerPostWithHttpInfo(String, String, UserId)"
  })
  void testV1RoomIdMembershipDemoteOwnerPostWithHttpInfo_whenNull_thenThrowApiException2()
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
    RoomMembershipApi roomMembershipApi = new RoomMembershipApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            roomMembershipApi.v1RoomIdMembershipDemoteOwnerPostWithHttpInfo(
                "https://example.org/example", null, new UserId()));
  }

  /**
   * Test {@link RoomMembershipApi#v1RoomIdMembershipDemoteOwnerPostWithHttpInfo(String, String,
   * UserId)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * RoomMembershipApi#v1RoomIdMembershipDemoteOwnerPostWithHttpInfo(String, String, UserId)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdMembershipDemoteOwnerPostWithHttpInfo(String, String, UserId); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse RoomMembershipApi.v1RoomIdMembershipDemoteOwnerPostWithHttpInfo(String, String, UserId)"
  })
  void testV1RoomIdMembershipDemoteOwnerPostWithHttpInfo_whenNull_thenThrowApiException3()
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
            new RoomMembershipApi(apiClient)
                .v1RoomIdMembershipDemoteOwnerPostWithHttpInfo(
                    "https://example.org/example", "https://example.org/example", null));
  }

  /**
   * Test {@link RoomMembershipApi#v1RoomIdMembershipListGet(String, String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link RoomMembershipApi#v1RoomIdMembershipListGet(String, String)}
   */
  @Test
  @DisplayName("Test v1RoomIdMembershipListGet(String, String); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.List RoomMembershipApi.v1RoomIdMembershipListGet(String, String)"})
  void testV1RoomIdMembershipListGet_when42_thenThrowApiException() throws ApiException {
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
        () -> new RoomMembershipApi(apiClient).v1RoomIdMembershipListGet("42", null));
  }

  /**
   * Test {@link RoomMembershipApi#v1RoomIdMembershipListGet(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link RoomMembershipApi#v1RoomIdMembershipListGet(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdMembershipListGet(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.List RoomMembershipApi.v1RoomIdMembershipListGet(String, String)"})
  void testV1RoomIdMembershipListGet_whenNull_thenThrowApiException() throws ApiException {
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
        () -> new RoomMembershipApi(apiClient).v1RoomIdMembershipListGet(null, "ABC123"));
  }

  /**
   * Test {@link RoomMembershipApi#v1RoomIdMembershipListGetWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link RoomMembershipApi#v1RoomIdMembershipListGetWithHttpInfo(String,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdMembershipListGetWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse RoomMembershipApi.v1RoomIdMembershipListGetWithHttpInfo(String, String)"
  })
  void testV1RoomIdMembershipListGetWithHttpInfo_whenNull_thenThrowApiException()
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
            new RoomMembershipApi(apiClient)
                .v1RoomIdMembershipListGetWithHttpInfo(null, "https://example.org/example"));
  }

  /**
   * Test {@link RoomMembershipApi#v1RoomIdMembershipListGetWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link RoomMembershipApi#v1RoomIdMembershipListGetWithHttpInfo(String,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdMembershipListGetWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse RoomMembershipApi.v1RoomIdMembershipListGetWithHttpInfo(String, String)"
  })
  void testV1RoomIdMembershipListGetWithHttpInfo_whenNull_thenThrowApiException2()
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
            new RoomMembershipApi(apiClient)
                .v1RoomIdMembershipListGetWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link RoomMembershipApi#v1RoomIdMembershipPromoteOwnerPost(String, String, UserId)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link RoomMembershipApi#v1RoomIdMembershipPromoteOwnerPost(String,
   * String, UserId)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdMembershipPromoteOwnerPost(String, String, UserId); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.SuccessResponse RoomMembershipApi.v1RoomIdMembershipPromoteOwnerPost(String, String, UserId)"
  })
  void testV1RoomIdMembershipPromoteOwnerPost_when42_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    RoomMembershipApi roomMembershipApi = new RoomMembershipApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> roomMembershipApi.v1RoomIdMembershipPromoteOwnerPost("42", null, new UserId()));
  }

  /**
   * Test {@link RoomMembershipApi#v1RoomIdMembershipPromoteOwnerPost(String, String, UserId)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link RoomMembershipApi#v1RoomIdMembershipPromoteOwnerPost(String,
   * String, UserId)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdMembershipPromoteOwnerPost(String, String, UserId); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.SuccessResponse RoomMembershipApi.v1RoomIdMembershipPromoteOwnerPost(String, String, UserId)"
  })
  void testV1RoomIdMembershipPromoteOwnerPost_when42_thenThrowApiException2() throws ApiException {
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
            new RoomMembershipApi(apiClient)
                .v1RoomIdMembershipPromoteOwnerPost("42", "ABC123", null));
  }

  /**
   * Test {@link RoomMembershipApi#v1RoomIdMembershipPromoteOwnerPost(String, String, UserId)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link RoomMembershipApi#v1RoomIdMembershipPromoteOwnerPost(String,
   * String, UserId)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdMembershipPromoteOwnerPost(String, String, UserId); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.SuccessResponse RoomMembershipApi.v1RoomIdMembershipPromoteOwnerPost(String, String, UserId)"
  })
  void testV1RoomIdMembershipPromoteOwnerPost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    RoomMembershipApi roomMembershipApi = new RoomMembershipApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> roomMembershipApi.v1RoomIdMembershipPromoteOwnerPost(null, "ABC123", new UserId()));
  }

  /**
   * Test {@link RoomMembershipApi#v1RoomIdMembershipPromoteOwnerPostWithHttpInfo(String, String,
   * UserId)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * RoomMembershipApi#v1RoomIdMembershipPromoteOwnerPostWithHttpInfo(String, String, UserId)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdMembershipPromoteOwnerPostWithHttpInfo(String, String, UserId); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse RoomMembershipApi.v1RoomIdMembershipPromoteOwnerPostWithHttpInfo(String, String, UserId)"
  })
  void testV1RoomIdMembershipPromoteOwnerPostWithHttpInfo_thenThrowApiException()
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
    RoomMembershipApi roomMembershipApi = new RoomMembershipApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            roomMembershipApi.v1RoomIdMembershipPromoteOwnerPostWithHttpInfo(
                null, "https://example.org/example", new UserId()));
  }

  /**
   * Test {@link RoomMembershipApi#v1RoomIdMembershipPromoteOwnerPostWithHttpInfo(String, String,
   * UserId)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * RoomMembershipApi#v1RoomIdMembershipPromoteOwnerPostWithHttpInfo(String, String, UserId)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdMembershipPromoteOwnerPostWithHttpInfo(String, String, UserId); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse RoomMembershipApi.v1RoomIdMembershipPromoteOwnerPostWithHttpInfo(String, String, UserId)"
  })
  void testV1RoomIdMembershipPromoteOwnerPostWithHttpInfo_thenThrowApiException2()
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
    RoomMembershipApi roomMembershipApi = new RoomMembershipApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            roomMembershipApi.v1RoomIdMembershipPromoteOwnerPostWithHttpInfo(
                "https://example.org/example", null, new UserId()));
  }

  /**
   * Test {@link RoomMembershipApi#v1RoomIdMembershipPromoteOwnerPostWithHttpInfo(String, String,
   * UserId)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * RoomMembershipApi#v1RoomIdMembershipPromoteOwnerPostWithHttpInfo(String, String, UserId)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdMembershipPromoteOwnerPostWithHttpInfo(String, String, UserId); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse RoomMembershipApi.v1RoomIdMembershipPromoteOwnerPostWithHttpInfo(String, String, UserId)"
  })
  void testV1RoomIdMembershipPromoteOwnerPostWithHttpInfo_thenThrowApiException3()
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
            new RoomMembershipApi(apiClient)
                .v1RoomIdMembershipPromoteOwnerPostWithHttpInfo(
                    "https://example.org/example", "https://example.org/example", null));
  }

  /**
   * Test {@link RoomMembershipApi#v1RoomIdMembershipRemovePost(String, String, UserId)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link RoomMembershipApi#v1RoomIdMembershipRemovePost(String, String,
   * UserId)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdMembershipRemovePost(String, String, UserId); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.SuccessResponse RoomMembershipApi.v1RoomIdMembershipRemovePost(String, String, UserId)"
  })
  void testV1RoomIdMembershipRemovePost_when42_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    RoomMembershipApi roomMembershipApi = new RoomMembershipApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> roomMembershipApi.v1RoomIdMembershipRemovePost("42", null, new UserId()));
  }

  /**
   * Test {@link RoomMembershipApi#v1RoomIdMembershipRemovePost(String, String, UserId)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link RoomMembershipApi#v1RoomIdMembershipRemovePost(String, String,
   * UserId)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdMembershipRemovePost(String, String, UserId); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.SuccessResponse RoomMembershipApi.v1RoomIdMembershipRemovePost(String, String, UserId)"
  })
  void testV1RoomIdMembershipRemovePost_when42_thenThrowApiException2() throws ApiException {
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
        () -> new RoomMembershipApi(apiClient).v1RoomIdMembershipRemovePost("42", "ABC123", null));
  }

  /**
   * Test {@link RoomMembershipApi#v1RoomIdMembershipRemovePost(String, String, UserId)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link RoomMembershipApi#v1RoomIdMembershipRemovePost(String, String,
   * UserId)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdMembershipRemovePost(String, String, UserId); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.SuccessResponse RoomMembershipApi.v1RoomIdMembershipRemovePost(String, String, UserId)"
  })
  void testV1RoomIdMembershipRemovePost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    RoomMembershipApi roomMembershipApi = new RoomMembershipApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> roomMembershipApi.v1RoomIdMembershipRemovePost(null, "ABC123", new UserId()));
  }

  /**
   * Test {@link RoomMembershipApi#v1RoomIdMembershipRemovePostWithHttpInfo(String, String,
   * UserId)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link RoomMembershipApi#v1RoomIdMembershipRemovePostWithHttpInfo(String,
   * String, UserId)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdMembershipRemovePostWithHttpInfo(String, String, UserId); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse RoomMembershipApi.v1RoomIdMembershipRemovePostWithHttpInfo(String, String, UserId)"
  })
  void testV1RoomIdMembershipRemovePostWithHttpInfo_whenNull_thenThrowApiException()
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
    RoomMembershipApi roomMembershipApi = new RoomMembershipApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            roomMembershipApi.v1RoomIdMembershipRemovePostWithHttpInfo(
                null, "https://example.org/example", new UserId()));
  }

  /**
   * Test {@link RoomMembershipApi#v1RoomIdMembershipRemovePostWithHttpInfo(String, String,
   * UserId)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link RoomMembershipApi#v1RoomIdMembershipRemovePostWithHttpInfo(String,
   * String, UserId)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdMembershipRemovePostWithHttpInfo(String, String, UserId); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse RoomMembershipApi.v1RoomIdMembershipRemovePostWithHttpInfo(String, String, UserId)"
  })
  void testV1RoomIdMembershipRemovePostWithHttpInfo_whenNull_thenThrowApiException2()
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
    RoomMembershipApi roomMembershipApi = new RoomMembershipApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            roomMembershipApi.v1RoomIdMembershipRemovePostWithHttpInfo(
                "https://example.org/example", null, new UserId()));
  }

  /**
   * Test {@link RoomMembershipApi#v1RoomIdMembershipRemovePostWithHttpInfo(String, String,
   * UserId)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link RoomMembershipApi#v1RoomIdMembershipRemovePostWithHttpInfo(String,
   * String, UserId)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdMembershipRemovePostWithHttpInfo(String, String, UserId); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse RoomMembershipApi.v1RoomIdMembershipRemovePostWithHttpInfo(String, String, UserId)"
  })
  void testV1RoomIdMembershipRemovePostWithHttpInfo_whenNull_thenThrowApiException3()
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
            new RoomMembershipApi(apiClient)
                .v1RoomIdMembershipRemovePostWithHttpInfo(
                    "https://example.org/example", "https://example.org/example", null));
  }

  /**
   * Test {@link RoomMembershipApi#v2RoomIdMembershipListGet(String, String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link RoomMembershipApi#v2RoomIdMembershipListGet(String, String)}
   */
  @Test
  @DisplayName("Test v2RoomIdMembershipListGet(String, String); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.List RoomMembershipApi.v2RoomIdMembershipListGet(String, String)"})
  void testV2RoomIdMembershipListGet_when42_thenThrowApiException() throws ApiException {
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
        () -> new RoomMembershipApi(apiClient).v2RoomIdMembershipListGet("42", null));
  }

  /**
   * Test {@link RoomMembershipApi#v2RoomIdMembershipListGet(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link RoomMembershipApi#v2RoomIdMembershipListGet(String, String)}
   */
  @Test
  @DisplayName(
      "Test v2RoomIdMembershipListGet(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.List RoomMembershipApi.v2RoomIdMembershipListGet(String, String)"})
  void testV2RoomIdMembershipListGet_whenNull_thenThrowApiException() throws ApiException {
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
        () -> new RoomMembershipApi(apiClient).v2RoomIdMembershipListGet(null, "ABC123"));
  }

  /**
   * Test {@link RoomMembershipApi#v2RoomIdMembershipListGetWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link RoomMembershipApi#v2RoomIdMembershipListGetWithHttpInfo(String,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v2RoomIdMembershipListGetWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse RoomMembershipApi.v2RoomIdMembershipListGetWithHttpInfo(String, String)"
  })
  void testV2RoomIdMembershipListGetWithHttpInfo_whenNull_thenThrowApiException()
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
            new RoomMembershipApi(apiClient)
                .v2RoomIdMembershipListGetWithHttpInfo(null, "https://example.org/example"));
  }

  /**
   * Test {@link RoomMembershipApi#v2RoomIdMembershipListGetWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link RoomMembershipApi#v2RoomIdMembershipListGetWithHttpInfo(String,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v2RoomIdMembershipListGetWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse RoomMembershipApi.v2RoomIdMembershipListGetWithHttpInfo(String, String)"
  })
  void testV2RoomIdMembershipListGetWithHttpInfo_whenNull_thenThrowApiException2()
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
            new RoomMembershipApi(apiClient)
                .v2RoomIdMembershipListGetWithHttpInfo("https://example.org/example", null));
  }
}
