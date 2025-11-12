package com.symphony.bdk.gen.api;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.AdminStreamFilter;
import com.symphony.bdk.gen.api.model.RoomAttributes;
import com.symphony.bdk.gen.api.model.RoomCreate;
import com.symphony.bdk.gen.api.model.RoomSearchCriteria;
import com.symphony.bdk.gen.api.model.StreamFilter;
import com.symphony.bdk.gen.api.model.V1IMAttributes;
import com.symphony.bdk.gen.api.model.V2AdminStreamFilter;
import com.symphony.bdk.gen.api.model.V2RoomAttributes;
import com.symphony.bdk.gen.api.model.V2RoomSearchCriteria;
import com.symphony.bdk.gen.api.model.V3RoomAttributes;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import jakarta.ws.rs.client.Client;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class StreamsApiDiffblueTest {
  /**
   * Test {@link StreamsApi#v1AdminImCreatePost(String, List)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1AdminImCreatePost(String, List)}
   */
  @Test
  @DisplayName("Test v1AdminImCreatePost(String, List); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.Stream StreamsApi.v1AdminImCreatePost(String, List)"
  })
  void testV1AdminImCreatePost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(ApiException.class, () -> streamsApi.v1AdminImCreatePost(null, new ArrayList<>()));
  }

  /**
   * Test {@link StreamsApi#v1AdminImCreatePost(String, List)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1AdminImCreatePost(String, List)}
   */
  @Test
  @DisplayName("Test v1AdminImCreatePost(String, List); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.Stream StreamsApi.v1AdminImCreatePost(String, List)"
  })
  void testV1AdminImCreatePost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(
        ApiException.class, () -> new StreamsApi(null).v1AdminImCreatePost("ABC123", null));
  }

  /**
   * Test {@link StreamsApi#v1AdminImCreatePostWithHttpInfo(String, List)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1AdminImCreatePostWithHttpInfo(String, List)}
   */
  @Test
  @DisplayName("Test v1AdminImCreatePostWithHttpInfo(String, List); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v1AdminImCreatePostWithHttpInfo(String, List)"
  })
  void testV1AdminImCreatePostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> streamsApi.v1AdminImCreatePostWithHttpInfo(null, new ArrayList<>()));
  }

  /**
   * Test {@link StreamsApi#v1AdminImCreatePostWithHttpInfo(String, List)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1AdminImCreatePostWithHttpInfo(String, List)}
   */
  @Test
  @DisplayName(
      "Test v1AdminImCreatePostWithHttpInfo(String, List); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v1AdminImCreatePostWithHttpInfo(String, List)"
  })
  void testV1AdminImCreatePostWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new StreamsApi(null)
                .v1AdminImCreatePostWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link StreamsApi#v1AdminRoomIdSetActivePost(String, Boolean, String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1AdminRoomIdSetActivePost(String, Boolean, String)}
   */
  @Test
  @DisplayName(
      "Test v1AdminRoomIdSetActivePost(String, Boolean, String); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.RoomDetail StreamsApi.v1AdminRoomIdSetActivePost(String, Boolean, String)"
  })
  void testV1AdminRoomIdSetActivePost_when42_thenThrowApiException() throws ApiException {
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
        () -> new StreamsApi(apiClient).v1AdminRoomIdSetActivePost("42", null, "ABC123"));
  }

  /**
   * Test {@link StreamsApi#v1AdminRoomIdSetActivePost(String, Boolean, String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1AdminRoomIdSetActivePost(String, Boolean, String)}
   */
  @Test
  @DisplayName(
      "Test v1AdminRoomIdSetActivePost(String, Boolean, String); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.RoomDetail StreamsApi.v1AdminRoomIdSetActivePost(String, Boolean, String)"
  })
  void testV1AdminRoomIdSetActivePost_when42_thenThrowApiException2() throws ApiException {
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
        () -> new StreamsApi(apiClient).v1AdminRoomIdSetActivePost("42", true, null));
  }

  /**
   * Test {@link StreamsApi#v1AdminRoomIdSetActivePost(String, Boolean, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1AdminRoomIdSetActivePost(String, Boolean, String)}
   */
  @Test
  @DisplayName(
      "Test v1AdminRoomIdSetActivePost(String, Boolean, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.RoomDetail StreamsApi.v1AdminRoomIdSetActivePost(String, Boolean, String)"
  })
  void testV1AdminRoomIdSetActivePost_whenNull_thenThrowApiException() throws ApiException {
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
        () -> new StreamsApi(apiClient).v1AdminRoomIdSetActivePost(null, true, "ABC123"));
  }

  /**
   * Test {@link StreamsApi#v1AdminRoomIdSetActivePostWithHttpInfo(String, Boolean, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1AdminRoomIdSetActivePostWithHttpInfo(String, Boolean,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v1AdminRoomIdSetActivePostWithHttpInfo(String, Boolean, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v1AdminRoomIdSetActivePostWithHttpInfo(String, Boolean, String)"
  })
  void testV1AdminRoomIdSetActivePostWithHttpInfo_whenNull_thenThrowApiException()
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
            new StreamsApi(apiClient)
                .v1AdminRoomIdSetActivePostWithHttpInfo(null, true, "https://example.org/example"));
  }

  /**
   * Test {@link StreamsApi#v1AdminRoomIdSetActivePostWithHttpInfo(String, Boolean, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1AdminRoomIdSetActivePostWithHttpInfo(String, Boolean,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v1AdminRoomIdSetActivePostWithHttpInfo(String, Boolean, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v1AdminRoomIdSetActivePostWithHttpInfo(String, Boolean, String)"
  })
  void testV1AdminRoomIdSetActivePostWithHttpInfo_whenNull_thenThrowApiException2()
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
            new StreamsApi(apiClient)
                .v1AdminRoomIdSetActivePostWithHttpInfo(
                    "https://example.org/example", null, "https://example.org/example"));
  }

  /**
   * Test {@link StreamsApi#v1AdminRoomIdSetActivePostWithHttpInfo(String, Boolean, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1AdminRoomIdSetActivePostWithHttpInfo(String, Boolean,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v1AdminRoomIdSetActivePostWithHttpInfo(String, Boolean, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v1AdminRoomIdSetActivePostWithHttpInfo(String, Boolean, String)"
  })
  void testV1AdminRoomIdSetActivePostWithHttpInfo_whenNull_thenThrowApiException3()
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
            new StreamsApi(apiClient)
                .v1AdminRoomIdSetActivePostWithHttpInfo("https://example.org/example", true, null));
  }

  /**
   * Test {@link StreamsApi#v1AdminStreamIdMembershipListGet(String, String, Integer, Integer)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1AdminStreamIdMembershipListGet(String, String,
   * Integer, Integer)}
   */
  @Test
  @DisplayName(
      "Test v1AdminStreamIdMembershipListGet(String, String, Integer, Integer); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V2MembershipList StreamsApi.v1AdminStreamIdMembershipListGet(String, String, Integer, Integer)"
  })
  void testV1AdminStreamIdMembershipListGet_when42_thenThrowApiException() throws ApiException {
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
        () -> new StreamsApi(apiClient).v1AdminStreamIdMembershipListGet("42", null, 1, 1));
  }

  /**
   * Test {@link StreamsApi#v1AdminStreamIdMembershipListGet(String, String, Integer, Integer)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1AdminStreamIdMembershipListGet(String, String,
   * Integer, Integer)}
   */
  @Test
  @DisplayName(
      "Test v1AdminStreamIdMembershipListGet(String, String, Integer, Integer); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V2MembershipList StreamsApi.v1AdminStreamIdMembershipListGet(String, String, Integer, Integer)"
  })
  void testV1AdminStreamIdMembershipListGet_whenNull_thenThrowApiException() throws ApiException {
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
        () -> new StreamsApi(apiClient).v1AdminStreamIdMembershipListGet(null, "ABC123", 1, 1));
  }

  /**
   * Test {@link StreamsApi#v1AdminStreamIdMembershipListGetWithHttpInfo(String, String, Integer,
   * Integer)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1AdminStreamIdMembershipListGetWithHttpInfo(String,
   * String, Integer, Integer)}
   */
  @Test
  @DisplayName(
      "Test v1AdminStreamIdMembershipListGetWithHttpInfo(String, String, Integer, Integer); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v1AdminStreamIdMembershipListGetWithHttpInfo(String, String, Integer, Integer)"
  })
  void testV1AdminStreamIdMembershipListGetWithHttpInfo_whenNull_thenThrowApiException()
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
            new StreamsApi(apiClient)
                .v1AdminStreamIdMembershipListGetWithHttpInfo(
                    null, "https://example.org/example", 1, 1));
  }

  /**
   * Test {@link StreamsApi#v1AdminStreamIdMembershipListGetWithHttpInfo(String, String, Integer,
   * Integer)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1AdminStreamIdMembershipListGetWithHttpInfo(String,
   * String, Integer, Integer)}
   */
  @Test
  @DisplayName(
      "Test v1AdminStreamIdMembershipListGetWithHttpInfo(String, String, Integer, Integer); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v1AdminStreamIdMembershipListGetWithHttpInfo(String, String, Integer, Integer)"
  })
  void testV1AdminStreamIdMembershipListGetWithHttpInfo_whenNull_thenThrowApiException2()
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
            new StreamsApi(apiClient)
                .v1AdminStreamIdMembershipListGetWithHttpInfo(
                    "https://example.org/example", null, 1, 1));
  }

  /**
   * Test {@link StreamsApi#v1AdminStreamsListPost(String, Integer, Integer, AdminStreamFilter)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1AdminStreamsListPost(String, Integer, Integer,
   * AdminStreamFilter)}
   */
  @Test
  @DisplayName(
      "Test v1AdminStreamsListPost(String, Integer, Integer, AdminStreamFilter); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.AdminStreamList StreamsApi.v1AdminStreamsListPost(String, Integer, Integer, AdminStreamFilter)"
  })
  void testV1AdminStreamsListPost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> streamsApi.v1AdminStreamsListPost(null, 1, 1, new AdminStreamFilter()));
  }

  /**
   * Test {@link StreamsApi#v1AdminStreamsListPostWithHttpInfo(String, Integer, Integer,
   * AdminStreamFilter)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1AdminStreamsListPostWithHttpInfo(String, Integer,
   * Integer, AdminStreamFilter)}
   */
  @Test
  @DisplayName(
      "Test v1AdminStreamsListPostWithHttpInfo(String, Integer, Integer, AdminStreamFilter); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v1AdminStreamsListPostWithHttpInfo(String, Integer, Integer, AdminStreamFilter)"
  })
  void testV1AdminStreamsListPostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> streamsApi.v1AdminStreamsListPostWithHttpInfo(null, 1, 1, new AdminStreamFilter()));
  }

  /**
   * Test {@link StreamsApi#v1ImCreatePost(String, List)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1ImCreatePost(String, List)}
   */
  @Test
  @DisplayName("Test v1ImCreatePost(String, List); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.Stream StreamsApi.v1ImCreatePost(String, List)"
  })
  void testV1ImCreatePost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(ApiException.class, () -> streamsApi.v1ImCreatePost(null, new ArrayList<>()));
  }

  /**
   * Test {@link StreamsApi#v1ImCreatePost(String, List)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1ImCreatePost(String, List)}
   */
  @Test
  @DisplayName("Test v1ImCreatePost(String, List); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.Stream StreamsApi.v1ImCreatePost(String, List)"
  })
  void testV1ImCreatePost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class, () -> new StreamsApi(null).v1ImCreatePost("ABC123", null));
  }

  /**
   * Test {@link StreamsApi#v1ImCreatePostWithHttpInfo(String, List)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1ImCreatePostWithHttpInfo(String, List)}
   */
  @Test
  @DisplayName("Test v1ImCreatePostWithHttpInfo(String, List); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v1ImCreatePostWithHttpInfo(String, List)"
  })
  void testV1ImCreatePostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class, () -> streamsApi.v1ImCreatePostWithHttpInfo(null, new ArrayList<>()));
  }

  /**
   * Test {@link StreamsApi#v1ImCreatePostWithHttpInfo(String, List)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1ImCreatePostWithHttpInfo(String, List)}
   */
  @Test
  @DisplayName(
      "Test v1ImCreatePostWithHttpInfo(String, List); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v1ImCreatePostWithHttpInfo(String, List)"
  })
  void testV1ImCreatePostWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(
        ApiException.class,
        () -> new StreamsApi(null).v1ImCreatePostWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link StreamsApi#v1ImIdInfoGet(String, String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1ImIdInfoGet(String, String)}
   */
  @Test
  @DisplayName("Test v1ImIdInfoGet(String, String); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V1IMDetail StreamsApi.v1ImIdInfoGet(String, String)"
  })
  void testV1ImIdInfoGet_when42_thenThrowApiException() throws ApiException {
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
    assertThrows(ApiException.class, () -> new StreamsApi(apiClient).v1ImIdInfoGet("42", null));
  }

  /**
   * Test {@link StreamsApi#v1ImIdInfoGet(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1ImIdInfoGet(String, String)}
   */
  @Test
  @DisplayName("Test v1ImIdInfoGet(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V1IMDetail StreamsApi.v1ImIdInfoGet(String, String)"
  })
  void testV1ImIdInfoGet_whenNull_thenThrowApiException() throws ApiException {
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
    assertThrows(ApiException.class, () -> new StreamsApi(apiClient).v1ImIdInfoGet(null, "ABC123"));
  }

  /**
   * Test {@link StreamsApi#v1ImIdInfoGetWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1ImIdInfoGetWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1ImIdInfoGetWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v1ImIdInfoGetWithHttpInfo(String, String)"
  })
  void testV1ImIdInfoGetWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
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
            new StreamsApi(apiClient)
                .v1ImIdInfoGetWithHttpInfo(null, "https://example.org/example"));
  }

  /**
   * Test {@link StreamsApi#v1ImIdInfoGetWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1ImIdInfoGetWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1ImIdInfoGetWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v1ImIdInfoGetWithHttpInfo(String, String)"
  })
  void testV1ImIdInfoGetWithHttpInfo_whenNull_thenThrowApiException2() throws ApiException {
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
            new StreamsApi(apiClient)
                .v1ImIdInfoGetWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link StreamsApi#v1ImIdUpdatePost(String, String, V1IMAttributes)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1ImIdUpdatePost(String, String, V1IMAttributes)}
   */
  @Test
  @DisplayName(
      "Test v1ImIdUpdatePost(String, String, V1IMAttributes); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V1IMDetail StreamsApi.v1ImIdUpdatePost(String, String, V1IMAttributes)"
  })
  void testV1ImIdUpdatePost_when42_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class, () -> streamsApi.v1ImIdUpdatePost("42", null, new V1IMAttributes()));
  }

  /**
   * Test {@link StreamsApi#v1ImIdUpdatePost(String, String, V1IMAttributes)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1ImIdUpdatePost(String, String, V1IMAttributes)}
   */
  @Test
  @DisplayName(
      "Test v1ImIdUpdatePost(String, String, V1IMAttributes); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V1IMDetail StreamsApi.v1ImIdUpdatePost(String, String, V1IMAttributes)"
  })
  void testV1ImIdUpdatePost_when42_thenThrowApiException2() throws ApiException {
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
        ApiException.class, () -> new StreamsApi(apiClient).v1ImIdUpdatePost("42", "ABC123", null));
  }

  /**
   * Test {@link StreamsApi#v1ImIdUpdatePost(String, String, V1IMAttributes)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1ImIdUpdatePost(String, String, V1IMAttributes)}
   */
  @Test
  @DisplayName(
      "Test v1ImIdUpdatePost(String, String, V1IMAttributes); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V1IMDetail StreamsApi.v1ImIdUpdatePost(String, String, V1IMAttributes)"
  })
  void testV1ImIdUpdatePost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> streamsApi.v1ImIdUpdatePost(null, "ABC123", new V1IMAttributes()));
  }

  /**
   * Test {@link StreamsApi#v1ImIdUpdatePostWithHttpInfo(String, String, V1IMAttributes)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1ImIdUpdatePostWithHttpInfo(String, String,
   * V1IMAttributes)}
   */
  @Test
  @DisplayName(
      "Test v1ImIdUpdatePostWithHttpInfo(String, String, V1IMAttributes); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v1ImIdUpdatePostWithHttpInfo(String, String, V1IMAttributes)"
  })
  void testV1ImIdUpdatePostWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            streamsApi.v1ImIdUpdatePostWithHttpInfo(
                null, "https://example.org/example", new V1IMAttributes()));
  }

  /**
   * Test {@link StreamsApi#v1ImIdUpdatePostWithHttpInfo(String, String, V1IMAttributes)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1ImIdUpdatePostWithHttpInfo(String, String,
   * V1IMAttributes)}
   */
  @Test
  @DisplayName(
      "Test v1ImIdUpdatePostWithHttpInfo(String, String, V1IMAttributes); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v1ImIdUpdatePostWithHttpInfo(String, String, V1IMAttributes)"
  })
  void testV1ImIdUpdatePostWithHttpInfo_whenNull_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            streamsApi.v1ImIdUpdatePostWithHttpInfo(
                "https://example.org/example", null, new V1IMAttributes()));
  }

  /**
   * Test {@link StreamsApi#v1ImIdUpdatePostWithHttpInfo(String, String, V1IMAttributes)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1ImIdUpdatePostWithHttpInfo(String, String,
   * V1IMAttributes)}
   */
  @Test
  @DisplayName(
      "Test v1ImIdUpdatePostWithHttpInfo(String, String, V1IMAttributes); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v1ImIdUpdatePostWithHttpInfo(String, String, V1IMAttributes)"
  })
  void testV1ImIdUpdatePostWithHttpInfo_whenNull_thenThrowApiException3() throws ApiException {
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
            new StreamsApi(apiClient)
                .v1ImIdUpdatePostWithHttpInfo(
                    "https://example.org/example", "https://example.org/example", null));
  }

  /**
   * Test {@link StreamsApi#v1RoomCreatePost(String, RoomCreate)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1RoomCreatePost(String, RoomCreate)}
   */
  @Test
  @DisplayName("Test v1RoomCreatePost(String, RoomCreate); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.RoomDetail StreamsApi.v1RoomCreatePost(String, RoomCreate)"
  })
  void testV1RoomCreatePost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(ApiException.class, () -> streamsApi.v1RoomCreatePost(null, new RoomCreate()));
  }

  /**
   * Test {@link StreamsApi#v1RoomCreatePost(String, RoomCreate)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1RoomCreatePost(String, RoomCreate)}
   */
  @Test
  @DisplayName("Test v1RoomCreatePost(String, RoomCreate); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.RoomDetail StreamsApi.v1RoomCreatePost(String, RoomCreate)"
  })
  void testV1RoomCreatePost_thenThrowApiException2() throws ApiException {
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
        ApiException.class, () -> new StreamsApi(apiClient).v1RoomCreatePost("ABC123", null));
  }

  /**
   * Test {@link StreamsApi#v1RoomCreatePostWithHttpInfo(String, RoomCreate)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1RoomCreatePostWithHttpInfo(String, RoomCreate)}
   */
  @Test
  @DisplayName("Test v1RoomCreatePostWithHttpInfo(String, RoomCreate); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v1RoomCreatePostWithHttpInfo(String, RoomCreate)"
  })
  void testV1RoomCreatePostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class, () -> streamsApi.v1RoomCreatePostWithHttpInfo(null, new RoomCreate()));
  }

  /**
   * Test {@link StreamsApi#v1RoomCreatePostWithHttpInfo(String, RoomCreate)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1RoomCreatePostWithHttpInfo(String, RoomCreate)}
   */
  @Test
  @DisplayName("Test v1RoomCreatePostWithHttpInfo(String, RoomCreate); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v1RoomCreatePostWithHttpInfo(String, RoomCreate)"
  })
  void testV1RoomCreatePostWithHttpInfo_thenThrowApiException2() throws ApiException {
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
            new StreamsApi(apiClient)
                .v1RoomCreatePostWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link StreamsApi#v1RoomIdInfoGet(String, String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1RoomIdInfoGet(String, String)}
   */
  @Test
  @DisplayName("Test v1RoomIdInfoGet(String, String); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.RoomDetail StreamsApi.v1RoomIdInfoGet(String, String)"
  })
  void testV1RoomIdInfoGet_when42_thenThrowApiException() throws ApiException {
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
    assertThrows(ApiException.class, () -> new StreamsApi(apiClient).v1RoomIdInfoGet("42", null));
  }

  /**
   * Test {@link StreamsApi#v1RoomIdInfoGet(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1RoomIdInfoGet(String, String)}
   */
  @Test
  @DisplayName("Test v1RoomIdInfoGet(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.RoomDetail StreamsApi.v1RoomIdInfoGet(String, String)"
  })
  void testV1RoomIdInfoGet_whenNull_thenThrowApiException() throws ApiException {
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
        ApiException.class, () -> new StreamsApi(apiClient).v1RoomIdInfoGet(null, "ABC123"));
  }

  /**
   * Test {@link StreamsApi#v1RoomIdInfoGetWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1RoomIdInfoGetWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdInfoGetWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v1RoomIdInfoGetWithHttpInfo(String, String)"
  })
  void testV1RoomIdInfoGetWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
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
            new StreamsApi(apiClient)
                .v1RoomIdInfoGetWithHttpInfo(null, "https://example.org/example"));
  }

  /**
   * Test {@link StreamsApi#v1RoomIdInfoGetWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1RoomIdInfoGetWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdInfoGetWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v1RoomIdInfoGetWithHttpInfo(String, String)"
  })
  void testV1RoomIdInfoGetWithHttpInfo_whenNull_thenThrowApiException2() throws ApiException {
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
            new StreamsApi(apiClient)
                .v1RoomIdInfoGetWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link StreamsApi#v1RoomIdSetActivePost(String, Boolean, String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1RoomIdSetActivePost(String, Boolean, String)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdSetActivePost(String, Boolean, String); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.RoomDetail StreamsApi.v1RoomIdSetActivePost(String, Boolean, String)"
  })
  void testV1RoomIdSetActivePost_when42_thenThrowApiException() throws ApiException {
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
        () -> new StreamsApi(apiClient).v1RoomIdSetActivePost("42", null, "ABC123"));
  }

  /**
   * Test {@link StreamsApi#v1RoomIdSetActivePost(String, Boolean, String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1RoomIdSetActivePost(String, Boolean, String)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdSetActivePost(String, Boolean, String); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.RoomDetail StreamsApi.v1RoomIdSetActivePost(String, Boolean, String)"
  })
  void testV1RoomIdSetActivePost_when42_thenThrowApiException2() throws ApiException {
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
        () -> new StreamsApi(apiClient).v1RoomIdSetActivePost("42", true, null));
  }

  /**
   * Test {@link StreamsApi#v1RoomIdSetActivePost(String, Boolean, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1RoomIdSetActivePost(String, Boolean, String)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdSetActivePost(String, Boolean, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.RoomDetail StreamsApi.v1RoomIdSetActivePost(String, Boolean, String)"
  })
  void testV1RoomIdSetActivePost_whenNull_thenThrowApiException() throws ApiException {
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
        () -> new StreamsApi(apiClient).v1RoomIdSetActivePost(null, true, "ABC123"));
  }

  /**
   * Test {@link StreamsApi#v1RoomIdSetActivePostWithHttpInfo(String, Boolean, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1RoomIdSetActivePostWithHttpInfo(String, Boolean,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdSetActivePostWithHttpInfo(String, Boolean, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v1RoomIdSetActivePostWithHttpInfo(String, Boolean, String)"
  })
  void testV1RoomIdSetActivePostWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
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
            new StreamsApi(apiClient)
                .v1RoomIdSetActivePostWithHttpInfo(null, true, "https://example.org/example"));
  }

  /**
   * Test {@link StreamsApi#v1RoomIdSetActivePostWithHttpInfo(String, Boolean, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1RoomIdSetActivePostWithHttpInfo(String, Boolean,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdSetActivePostWithHttpInfo(String, Boolean, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v1RoomIdSetActivePostWithHttpInfo(String, Boolean, String)"
  })
  void testV1RoomIdSetActivePostWithHttpInfo_whenNull_thenThrowApiException2() throws ApiException {
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
            new StreamsApi(apiClient)
                .v1RoomIdSetActivePostWithHttpInfo(
                    "https://example.org/example", null, "https://example.org/example"));
  }

  /**
   * Test {@link StreamsApi#v1RoomIdSetActivePostWithHttpInfo(String, Boolean, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1RoomIdSetActivePostWithHttpInfo(String, Boolean,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdSetActivePostWithHttpInfo(String, Boolean, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v1RoomIdSetActivePostWithHttpInfo(String, Boolean, String)"
  })
  void testV1RoomIdSetActivePostWithHttpInfo_whenNull_thenThrowApiException3() throws ApiException {
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
            new StreamsApi(apiClient)
                .v1RoomIdSetActivePostWithHttpInfo("https://example.org/example", true, null));
  }

  /**
   * Test {@link StreamsApi#v1RoomIdUpdatePost(String, String, RoomAttributes)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1RoomIdUpdatePost(String, String, RoomAttributes)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdUpdatePost(String, String, RoomAttributes); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.RoomDetail StreamsApi.v1RoomIdUpdatePost(String, String, RoomAttributes)"
  })
  void testV1RoomIdUpdatePost_when42_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class, () -> streamsApi.v1RoomIdUpdatePost("42", null, new RoomAttributes()));
  }

  /**
   * Test {@link StreamsApi#v1RoomIdUpdatePost(String, String, RoomAttributes)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1RoomIdUpdatePost(String, String, RoomAttributes)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdUpdatePost(String, String, RoomAttributes); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.RoomDetail StreamsApi.v1RoomIdUpdatePost(String, String, RoomAttributes)"
  })
  void testV1RoomIdUpdatePost_when42_thenThrowApiException2() throws ApiException {
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
        () -> new StreamsApi(apiClient).v1RoomIdUpdatePost("42", "ABC123", null));
  }

  /**
   * Test {@link StreamsApi#v1RoomIdUpdatePost(String, String, RoomAttributes)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1RoomIdUpdatePost(String, String, RoomAttributes)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdUpdatePost(String, String, RoomAttributes); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.RoomDetail StreamsApi.v1RoomIdUpdatePost(String, String, RoomAttributes)"
  })
  void testV1RoomIdUpdatePost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> streamsApi.v1RoomIdUpdatePost(null, "ABC123", new RoomAttributes()));
  }

  /**
   * Test {@link StreamsApi#v1RoomIdUpdatePostWithHttpInfo(String, String, RoomAttributes)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1RoomIdUpdatePostWithHttpInfo(String, String,
   * RoomAttributes)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdUpdatePostWithHttpInfo(String, String, RoomAttributes); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v1RoomIdUpdatePostWithHttpInfo(String, String, RoomAttributes)"
  })
  void testV1RoomIdUpdatePostWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            streamsApi.v1RoomIdUpdatePostWithHttpInfo(
                null, "https://example.org/example", new RoomAttributes()));
  }

  /**
   * Test {@link StreamsApi#v1RoomIdUpdatePostWithHttpInfo(String, String, RoomAttributes)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1RoomIdUpdatePostWithHttpInfo(String, String,
   * RoomAttributes)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdUpdatePostWithHttpInfo(String, String, RoomAttributes); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v1RoomIdUpdatePostWithHttpInfo(String, String, RoomAttributes)"
  })
  void testV1RoomIdUpdatePostWithHttpInfo_whenNull_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            streamsApi.v1RoomIdUpdatePostWithHttpInfo(
                "https://example.org/example", null, new RoomAttributes()));
  }

  /**
   * Test {@link StreamsApi#v1RoomIdUpdatePostWithHttpInfo(String, String, RoomAttributes)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1RoomIdUpdatePostWithHttpInfo(String, String,
   * RoomAttributes)}
   */
  @Test
  @DisplayName(
      "Test v1RoomIdUpdatePostWithHttpInfo(String, String, RoomAttributes); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v1RoomIdUpdatePostWithHttpInfo(String, String, RoomAttributes)"
  })
  void testV1RoomIdUpdatePostWithHttpInfo_whenNull_thenThrowApiException3() throws ApiException {
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
            new StreamsApi(apiClient)
                .v1RoomIdUpdatePostWithHttpInfo(
                    "https://example.org/example", "https://example.org/example", null));
  }

  /**
   * Test {@link StreamsApi#v1StreamsListPost(String, Integer, Integer, StreamFilter)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1StreamsListPost(String, Integer, Integer,
   * StreamFilter)}
   */
  @Test
  @DisplayName(
      "Test v1StreamsListPost(String, Integer, Integer, StreamFilter); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List StreamsApi.v1StreamsListPost(String, Integer, Integer, StreamFilter)"})
  void testV1StreamsListPost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class, () -> streamsApi.v1StreamsListPost(null, 1, 1, new StreamFilter()));
  }

  /**
   * Test {@link StreamsApi#v1StreamsListPostWithHttpInfo(String, Integer, Integer, StreamFilter)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1StreamsListPostWithHttpInfo(String, Integer, Integer,
   * StreamFilter)}
   */
  @Test
  @DisplayName(
      "Test v1StreamsListPostWithHttpInfo(String, Integer, Integer, StreamFilter); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v1StreamsListPostWithHttpInfo(String, Integer, Integer, StreamFilter)"
  })
  void testV1StreamsListPostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> streamsApi.v1StreamsListPostWithHttpInfo(null, 1, 1, new StreamFilter()));
  }

  /**
   * Test {@link StreamsApi#v1StreamsSidAttachmentsGet(String, Long, Long, Integer, String,
   * String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1StreamsSidAttachmentsGet(String, Long, Long, Integer,
   * String, String)}
   */
  @Test
  @DisplayName(
      "Test v1StreamsSidAttachmentsGet(String, Long, Long, Integer, String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "List StreamsApi.v1StreamsSidAttachmentsGet(String, Long, Long, Integer, String, String)"
  })
  void testV1StreamsSidAttachmentsGet_whenNull_thenThrowApiException() throws ApiException {
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
            new StreamsApi(apiClient)
                .v1StreamsSidAttachmentsGet(null, 1L, 1L, 1, "Sort Dir", "ABC123"));
  }

  /**
   * Test {@link StreamsApi#v1StreamsSidAttachmentsGet(String, Long, Long, Integer, String,
   * String)}.
   *
   * <ul>
   *   <li>When {@code Sid}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1StreamsSidAttachmentsGet(String, Long, Long, Integer,
   * String, String)}
   */
  @Test
  @DisplayName(
      "Test v1StreamsSidAttachmentsGet(String, Long, Long, Integer, String, String); when 'Sid'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "List StreamsApi.v1StreamsSidAttachmentsGet(String, Long, Long, Integer, String, String)"
  })
  void testV1StreamsSidAttachmentsGet_whenSid_thenThrowApiException() throws ApiException {
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
            new StreamsApi(apiClient)
                .v1StreamsSidAttachmentsGet("Sid", 1L, 1L, 1, "Sort Dir", null));
  }

  /**
   * Test {@link StreamsApi#v1StreamsSidAttachmentsGetWithHttpInfo(String, Long, Long, Integer,
   * String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1StreamsSidAttachmentsGetWithHttpInfo(String, Long,
   * Long, Integer, String, String)}
   */
  @Test
  @DisplayName(
      "Test v1StreamsSidAttachmentsGetWithHttpInfo(String, Long, Long, Integer, String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v1StreamsSidAttachmentsGetWithHttpInfo(String, Long, Long, Integer, String, String)"
  })
  void testV1StreamsSidAttachmentsGetWithHttpInfo_whenNull_thenThrowApiException()
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
            new StreamsApi(apiClient)
                .v1StreamsSidAttachmentsGetWithHttpInfo(
                    null, 1L, 1L, 1, "https://example.org/example", "https://example.org/example"));
  }

  /**
   * Test {@link StreamsApi#v1StreamsSidAttachmentsGetWithHttpInfo(String, Long, Long, Integer,
   * String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1StreamsSidAttachmentsGetWithHttpInfo(String, Long,
   * Long, Integer, String, String)}
   */
  @Test
  @DisplayName(
      "Test v1StreamsSidAttachmentsGetWithHttpInfo(String, Long, Long, Integer, String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v1StreamsSidAttachmentsGetWithHttpInfo(String, Long, Long, Integer, String, String)"
  })
  void testV1StreamsSidAttachmentsGetWithHttpInfo_whenNull_thenThrowApiException2()
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
            new StreamsApi(apiClient)
                .v1StreamsSidAttachmentsGetWithHttpInfo(
                    "https://example.org/example", 1L, 1L, 1, "https://example.org/example", null));
  }

  /**
   * Test {@link StreamsApi#v1StreamsSidInfoGet(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1StreamsSidInfoGet(String, String)}
   */
  @Test
  @DisplayName("Test v1StreamsSidInfoGet(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.StreamAttributes StreamsApi.v1StreamsSidInfoGet(String, String)"
  })
  void testV1StreamsSidInfoGet_whenNull_thenThrowApiException() throws ApiException {
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
        ApiException.class, () -> new StreamsApi(apiClient).v1StreamsSidInfoGet(null, "ABC123"));
  }

  /**
   * Test {@link StreamsApi#v1StreamsSidInfoGet(String, String)}.
   *
   * <ul>
   *   <li>When {@code Sid}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1StreamsSidInfoGet(String, String)}
   */
  @Test
  @DisplayName("Test v1StreamsSidInfoGet(String, String); when 'Sid'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.StreamAttributes StreamsApi.v1StreamsSidInfoGet(String, String)"
  })
  void testV1StreamsSidInfoGet_whenSid_thenThrowApiException() throws ApiException {
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
        ApiException.class, () -> new StreamsApi(apiClient).v1StreamsSidInfoGet("Sid", null));
  }

  /**
   * Test {@link StreamsApi#v1StreamsSidInfoGetWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1StreamsSidInfoGetWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1StreamsSidInfoGetWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v1StreamsSidInfoGetWithHttpInfo(String, String)"
  })
  void testV1StreamsSidInfoGetWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
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
            new StreamsApi(apiClient)
                .v1StreamsSidInfoGetWithHttpInfo(null, "https://example.org/example"));
  }

  /**
   * Test {@link StreamsApi#v1StreamsSidInfoGetWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v1StreamsSidInfoGetWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1StreamsSidInfoGetWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v1StreamsSidInfoGetWithHttpInfo(String, String)"
  })
  void testV1StreamsSidInfoGetWithHttpInfo_whenNull_thenThrowApiException2() throws ApiException {
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
            new StreamsApi(apiClient)
                .v1StreamsSidInfoGetWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link StreamsApi#v2AdminStreamsListPost(String, Integer, Integer, V2AdminStreamFilter)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v2AdminStreamsListPost(String, Integer, Integer,
   * V2AdminStreamFilter)}
   */
  @Test
  @DisplayName(
      "Test v2AdminStreamsListPost(String, Integer, Integer, V2AdminStreamFilter); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V2AdminStreamList StreamsApi.v2AdminStreamsListPost(String, Integer, Integer, V2AdminStreamFilter)"
  })
  void testV2AdminStreamsListPost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> streamsApi.v2AdminStreamsListPost(null, 1, 1, new V2AdminStreamFilter()));
  }

  /**
   * Test {@link StreamsApi#v2AdminStreamsListPostWithHttpInfo(String, Integer, Integer,
   * V2AdminStreamFilter)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v2AdminStreamsListPostWithHttpInfo(String, Integer,
   * Integer, V2AdminStreamFilter)}
   */
  @Test
  @DisplayName(
      "Test v2AdminStreamsListPostWithHttpInfo(String, Integer, Integer, V2AdminStreamFilter); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v2AdminStreamsListPostWithHttpInfo(String, Integer, Integer, V2AdminStreamFilter)"
  })
  void testV2AdminStreamsListPostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> streamsApi.v2AdminStreamsListPostWithHttpInfo(null, 1, 1, new V2AdminStreamFilter()));
  }

  /**
   * Test {@link StreamsApi#v2RoomCreatePost(String, V2RoomAttributes)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v2RoomCreatePost(String, V2RoomAttributes)}
   */
  @Test
  @DisplayName("Test v2RoomCreatePost(String, V2RoomAttributes); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V2RoomDetail StreamsApi.v2RoomCreatePost(String, V2RoomAttributes)"
  })
  void testV2RoomCreatePost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class, () -> streamsApi.v2RoomCreatePost(null, new V2RoomAttributes()));
  }

  /**
   * Test {@link StreamsApi#v2RoomCreatePost(String, V2RoomAttributes)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v2RoomCreatePost(String, V2RoomAttributes)}
   */
  @Test
  @DisplayName("Test v2RoomCreatePost(String, V2RoomAttributes); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V2RoomDetail StreamsApi.v2RoomCreatePost(String, V2RoomAttributes)"
  })
  void testV2RoomCreatePost_thenThrowApiException2() throws ApiException {
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
        ApiException.class, () -> new StreamsApi(apiClient).v2RoomCreatePost("ABC123", null));
  }

  /**
   * Test {@link StreamsApi#v2RoomCreatePostWithHttpInfo(String, V2RoomAttributes)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v2RoomCreatePostWithHttpInfo(String, V2RoomAttributes)}
   */
  @Test
  @DisplayName(
      "Test v2RoomCreatePostWithHttpInfo(String, V2RoomAttributes); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v2RoomCreatePostWithHttpInfo(String, V2RoomAttributes)"
  })
  void testV2RoomCreatePostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> streamsApi.v2RoomCreatePostWithHttpInfo(null, new V2RoomAttributes()));
  }

  /**
   * Test {@link StreamsApi#v2RoomCreatePostWithHttpInfo(String, V2RoomAttributes)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v2RoomCreatePostWithHttpInfo(String, V2RoomAttributes)}
   */
  @Test
  @DisplayName(
      "Test v2RoomCreatePostWithHttpInfo(String, V2RoomAttributes); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v2RoomCreatePostWithHttpInfo(String, V2RoomAttributes)"
  })
  void testV2RoomCreatePostWithHttpInfo_thenThrowApiException2() throws ApiException {
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
            new StreamsApi(apiClient)
                .v2RoomCreatePostWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link StreamsApi#v2RoomIdInfoGet(String, String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v2RoomIdInfoGet(String, String)}
   */
  @Test
  @DisplayName("Test v2RoomIdInfoGet(String, String); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V2RoomDetail StreamsApi.v2RoomIdInfoGet(String, String)"
  })
  void testV2RoomIdInfoGet_when42_thenThrowApiException() throws ApiException {
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
    assertThrows(ApiException.class, () -> new StreamsApi(apiClient).v2RoomIdInfoGet("42", null));
  }

  /**
   * Test {@link StreamsApi#v2RoomIdInfoGet(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v2RoomIdInfoGet(String, String)}
   */
  @Test
  @DisplayName("Test v2RoomIdInfoGet(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V2RoomDetail StreamsApi.v2RoomIdInfoGet(String, String)"
  })
  void testV2RoomIdInfoGet_whenNull_thenThrowApiException() throws ApiException {
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
        ApiException.class, () -> new StreamsApi(apiClient).v2RoomIdInfoGet(null, "ABC123"));
  }

  /**
   * Test {@link StreamsApi#v2RoomIdInfoGetWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v2RoomIdInfoGetWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test v2RoomIdInfoGetWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v2RoomIdInfoGetWithHttpInfo(String, String)"
  })
  void testV2RoomIdInfoGetWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
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
            new StreamsApi(apiClient)
                .v2RoomIdInfoGetWithHttpInfo(null, "https://example.org/example"));
  }

  /**
   * Test {@link StreamsApi#v2RoomIdInfoGetWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v2RoomIdInfoGetWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test v2RoomIdInfoGetWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v2RoomIdInfoGetWithHttpInfo(String, String)"
  })
  void testV2RoomIdInfoGetWithHttpInfo_whenNull_thenThrowApiException2() throws ApiException {
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
            new StreamsApi(apiClient)
                .v2RoomIdInfoGetWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link StreamsApi#v2RoomIdUpdatePost(String, String, V2RoomAttributes)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v2RoomIdUpdatePost(String, String, V2RoomAttributes)}
   */
  @Test
  @DisplayName(
      "Test v2RoomIdUpdatePost(String, String, V2RoomAttributes); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V2RoomDetail StreamsApi.v2RoomIdUpdatePost(String, String, V2RoomAttributes)"
  })
  void testV2RoomIdUpdatePost_when42_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> streamsApi.v2RoomIdUpdatePost("42", null, new V2RoomAttributes()));
  }

  /**
   * Test {@link StreamsApi#v2RoomIdUpdatePost(String, String, V2RoomAttributes)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v2RoomIdUpdatePost(String, String, V2RoomAttributes)}
   */
  @Test
  @DisplayName(
      "Test v2RoomIdUpdatePost(String, String, V2RoomAttributes); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V2RoomDetail StreamsApi.v2RoomIdUpdatePost(String, String, V2RoomAttributes)"
  })
  void testV2RoomIdUpdatePost_when42_thenThrowApiException2() throws ApiException {
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
        () -> new StreamsApi(apiClient).v2RoomIdUpdatePost("42", "ABC123", null));
  }

  /**
   * Test {@link StreamsApi#v2RoomIdUpdatePost(String, String, V2RoomAttributes)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v2RoomIdUpdatePost(String, String, V2RoomAttributes)}
   */
  @Test
  @DisplayName(
      "Test v2RoomIdUpdatePost(String, String, V2RoomAttributes); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V2RoomDetail StreamsApi.v2RoomIdUpdatePost(String, String, V2RoomAttributes)"
  })
  void testV2RoomIdUpdatePost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> streamsApi.v2RoomIdUpdatePost(null, "ABC123", new V2RoomAttributes()));
  }

  /**
   * Test {@link StreamsApi#v2RoomIdUpdatePostWithHttpInfo(String, String, V2RoomAttributes)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v2RoomIdUpdatePostWithHttpInfo(String, String,
   * V2RoomAttributes)}
   */
  @Test
  @DisplayName(
      "Test v2RoomIdUpdatePostWithHttpInfo(String, String, V2RoomAttributes); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v2RoomIdUpdatePostWithHttpInfo(String, String, V2RoomAttributes)"
  })
  void testV2RoomIdUpdatePostWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            streamsApi.v2RoomIdUpdatePostWithHttpInfo(
                null, "https://example.org/example", new V2RoomAttributes()));
  }

  /**
   * Test {@link StreamsApi#v2RoomIdUpdatePostWithHttpInfo(String, String, V2RoomAttributes)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v2RoomIdUpdatePostWithHttpInfo(String, String,
   * V2RoomAttributes)}
   */
  @Test
  @DisplayName(
      "Test v2RoomIdUpdatePostWithHttpInfo(String, String, V2RoomAttributes); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v2RoomIdUpdatePostWithHttpInfo(String, String, V2RoomAttributes)"
  })
  void testV2RoomIdUpdatePostWithHttpInfo_whenNull_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            streamsApi.v2RoomIdUpdatePostWithHttpInfo(
                "https://example.org/example", null, new V2RoomAttributes()));
  }

  /**
   * Test {@link StreamsApi#v2RoomIdUpdatePostWithHttpInfo(String, String, V2RoomAttributes)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v2RoomIdUpdatePostWithHttpInfo(String, String,
   * V2RoomAttributes)}
   */
  @Test
  @DisplayName(
      "Test v2RoomIdUpdatePostWithHttpInfo(String, String, V2RoomAttributes); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v2RoomIdUpdatePostWithHttpInfo(String, String, V2RoomAttributes)"
  })
  void testV2RoomIdUpdatePostWithHttpInfo_whenNull_thenThrowApiException3() throws ApiException {
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
            new StreamsApi(apiClient)
                .v2RoomIdUpdatePostWithHttpInfo(
                    "https://example.org/example", "https://example.org/example", null));
  }

  /**
   * Test {@link StreamsApi#v2RoomSearchPost(String, Integer, Integer, RoomSearchCriteria)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v2RoomSearchPost(String, Integer, Integer,
   * RoomSearchCriteria)}
   */
  @Test
  @DisplayName(
      "Test v2RoomSearchPost(String, Integer, Integer, RoomSearchCriteria); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.RoomSearchResults StreamsApi.v2RoomSearchPost(String, Integer, Integer, RoomSearchCriteria)"
  })
  void testV2RoomSearchPost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> streamsApi.v2RoomSearchPost(null, 1, 1, new RoomSearchCriteria()));
  }

  /**
   * Test {@link StreamsApi#v2RoomSearchPost(String, Integer, Integer, RoomSearchCriteria)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v2RoomSearchPost(String, Integer, Integer,
   * RoomSearchCriteria)}
   */
  @Test
  @DisplayName(
      "Test v2RoomSearchPost(String, Integer, Integer, RoomSearchCriteria); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.RoomSearchResults StreamsApi.v2RoomSearchPost(String, Integer, Integer, RoomSearchCriteria)"
  })
  void testV2RoomSearchPost_thenThrowApiException2() throws ApiException {
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
        ApiException.class, () -> new StreamsApi(apiClient).v2RoomSearchPost("ABC123", 1, 1, null));
  }

  /**
   * Test {@link StreamsApi#v2RoomSearchPostWithHttpInfo(String, Integer, Integer,
   * RoomSearchCriteria)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v2RoomSearchPostWithHttpInfo(String, Integer, Integer,
   * RoomSearchCriteria)}
   */
  @Test
  @DisplayName(
      "Test v2RoomSearchPostWithHttpInfo(String, Integer, Integer, RoomSearchCriteria); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v2RoomSearchPostWithHttpInfo(String, Integer, Integer, RoomSearchCriteria)"
  })
  void testV2RoomSearchPostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> streamsApi.v2RoomSearchPostWithHttpInfo(null, 1, 1, new RoomSearchCriteria()));
  }

  /**
   * Test {@link StreamsApi#v2RoomSearchPostWithHttpInfo(String, Integer, Integer,
   * RoomSearchCriteria)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v2RoomSearchPostWithHttpInfo(String, Integer, Integer,
   * RoomSearchCriteria)}
   */
  @Test
  @DisplayName(
      "Test v2RoomSearchPostWithHttpInfo(String, Integer, Integer, RoomSearchCriteria); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v2RoomSearchPostWithHttpInfo(String, Integer, Integer, RoomSearchCriteria)"
  })
  void testV2RoomSearchPostWithHttpInfo_thenThrowApiException2() throws ApiException {
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
            new StreamsApi(apiClient)
                .v2RoomSearchPostWithHttpInfo("https://example.org/example", 1, 1, null));
  }

  /**
   * Test {@link StreamsApi#v2StreamsSidInfoGet(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v2StreamsSidInfoGet(String, String)}
   */
  @Test
  @DisplayName("Test v2StreamsSidInfoGet(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V2StreamAttributes StreamsApi.v2StreamsSidInfoGet(String, String)"
  })
  void testV2StreamsSidInfoGet_whenNull_thenThrowApiException() throws ApiException {
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
        ApiException.class, () -> new StreamsApi(apiClient).v2StreamsSidInfoGet(null, "ABC123"));
  }

  /**
   * Test {@link StreamsApi#v2StreamsSidInfoGet(String, String)}.
   *
   * <ul>
   *   <li>When {@code Sid}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v2StreamsSidInfoGet(String, String)}
   */
  @Test
  @DisplayName("Test v2StreamsSidInfoGet(String, String); when 'Sid'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V2StreamAttributes StreamsApi.v2StreamsSidInfoGet(String, String)"
  })
  void testV2StreamsSidInfoGet_whenSid_thenThrowApiException() throws ApiException {
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
        ApiException.class, () -> new StreamsApi(apiClient).v2StreamsSidInfoGet("Sid", null));
  }

  /**
   * Test {@link StreamsApi#v2StreamsSidInfoGetWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v2StreamsSidInfoGetWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test v2StreamsSidInfoGetWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v2StreamsSidInfoGetWithHttpInfo(String, String)"
  })
  void testV2StreamsSidInfoGetWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
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
            new StreamsApi(apiClient)
                .v2StreamsSidInfoGetWithHttpInfo(null, "https://example.org/example"));
  }

  /**
   * Test {@link StreamsApi#v2StreamsSidInfoGetWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v2StreamsSidInfoGetWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test v2StreamsSidInfoGetWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v2StreamsSidInfoGetWithHttpInfo(String, String)"
  })
  void testV2StreamsSidInfoGetWithHttpInfo_whenNull_thenThrowApiException2() throws ApiException {
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
            new StreamsApi(apiClient)
                .v2StreamsSidInfoGetWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link StreamsApi#v3RoomCreatePost(String, V3RoomAttributes)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v3RoomCreatePost(String, V3RoomAttributes)}
   */
  @Test
  @DisplayName("Test v3RoomCreatePost(String, V3RoomAttributes); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V3RoomDetail StreamsApi.v3RoomCreatePost(String, V3RoomAttributes)"
  })
  void testV3RoomCreatePost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class, () -> streamsApi.v3RoomCreatePost(null, new V3RoomAttributes()));
  }

  /**
   * Test {@link StreamsApi#v3RoomCreatePost(String, V3RoomAttributes)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v3RoomCreatePost(String, V3RoomAttributes)}
   */
  @Test
  @DisplayName("Test v3RoomCreatePost(String, V3RoomAttributes); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V3RoomDetail StreamsApi.v3RoomCreatePost(String, V3RoomAttributes)"
  })
  void testV3RoomCreatePost_thenThrowApiException2() throws ApiException {
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
        ApiException.class, () -> new StreamsApi(apiClient).v3RoomCreatePost("ABC123", null));
  }

  /**
   * Test {@link StreamsApi#v3RoomCreatePostWithHttpInfo(String, V3RoomAttributes)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v3RoomCreatePostWithHttpInfo(String, V3RoomAttributes)}
   */
  @Test
  @DisplayName(
      "Test v3RoomCreatePostWithHttpInfo(String, V3RoomAttributes); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v3RoomCreatePostWithHttpInfo(String, V3RoomAttributes)"
  })
  void testV3RoomCreatePostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> streamsApi.v3RoomCreatePostWithHttpInfo(null, new V3RoomAttributes()));
  }

  /**
   * Test {@link StreamsApi#v3RoomCreatePostWithHttpInfo(String, V3RoomAttributes)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v3RoomCreatePostWithHttpInfo(String, V3RoomAttributes)}
   */
  @Test
  @DisplayName(
      "Test v3RoomCreatePostWithHttpInfo(String, V3RoomAttributes); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v3RoomCreatePostWithHttpInfo(String, V3RoomAttributes)"
  })
  void testV3RoomCreatePostWithHttpInfo_thenThrowApiException2() throws ApiException {
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
            new StreamsApi(apiClient)
                .v3RoomCreatePostWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link StreamsApi#v3RoomIdInfoGet(String, String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v3RoomIdInfoGet(String, String)}
   */
  @Test
  @DisplayName("Test v3RoomIdInfoGet(String, String); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V3RoomDetail StreamsApi.v3RoomIdInfoGet(String, String)"
  })
  void testV3RoomIdInfoGet_when42_thenThrowApiException() throws ApiException {
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
    assertThrows(ApiException.class, () -> new StreamsApi(apiClient).v3RoomIdInfoGet("42", null));
  }

  /**
   * Test {@link StreamsApi#v3RoomIdInfoGet(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v3RoomIdInfoGet(String, String)}
   */
  @Test
  @DisplayName("Test v3RoomIdInfoGet(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V3RoomDetail StreamsApi.v3RoomIdInfoGet(String, String)"
  })
  void testV3RoomIdInfoGet_whenNull_thenThrowApiException() throws ApiException {
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
        ApiException.class, () -> new StreamsApi(apiClient).v3RoomIdInfoGet(null, "ABC123"));
  }

  /**
   * Test {@link StreamsApi#v3RoomIdInfoGetWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v3RoomIdInfoGetWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test v3RoomIdInfoGetWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v3RoomIdInfoGetWithHttpInfo(String, String)"
  })
  void testV3RoomIdInfoGetWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
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
            new StreamsApi(apiClient)
                .v3RoomIdInfoGetWithHttpInfo(null, "https://example.org/example"));
  }

  /**
   * Test {@link StreamsApi#v3RoomIdInfoGetWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v3RoomIdInfoGetWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test v3RoomIdInfoGetWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v3RoomIdInfoGetWithHttpInfo(String, String)"
  })
  void testV3RoomIdInfoGetWithHttpInfo_whenNull_thenThrowApiException2() throws ApiException {
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
            new StreamsApi(apiClient)
                .v3RoomIdInfoGetWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link StreamsApi#v3RoomIdUpdatePost(String, String, V3RoomAttributes)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v3RoomIdUpdatePost(String, String, V3RoomAttributes)}
   */
  @Test
  @DisplayName(
      "Test v3RoomIdUpdatePost(String, String, V3RoomAttributes); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V3RoomDetail StreamsApi.v3RoomIdUpdatePost(String, String, V3RoomAttributes)"
  })
  void testV3RoomIdUpdatePost_when42_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> streamsApi.v3RoomIdUpdatePost("42", null, new V3RoomAttributes()));
  }

  /**
   * Test {@link StreamsApi#v3RoomIdUpdatePost(String, String, V3RoomAttributes)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v3RoomIdUpdatePost(String, String, V3RoomAttributes)}
   */
  @Test
  @DisplayName(
      "Test v3RoomIdUpdatePost(String, String, V3RoomAttributes); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V3RoomDetail StreamsApi.v3RoomIdUpdatePost(String, String, V3RoomAttributes)"
  })
  void testV3RoomIdUpdatePost_when42_thenThrowApiException2() throws ApiException {
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
        () -> new StreamsApi(apiClient).v3RoomIdUpdatePost("42", "ABC123", null));
  }

  /**
   * Test {@link StreamsApi#v3RoomIdUpdatePost(String, String, V3RoomAttributes)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v3RoomIdUpdatePost(String, String, V3RoomAttributes)}
   */
  @Test
  @DisplayName(
      "Test v3RoomIdUpdatePost(String, String, V3RoomAttributes); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V3RoomDetail StreamsApi.v3RoomIdUpdatePost(String, String, V3RoomAttributes)"
  })
  void testV3RoomIdUpdatePost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> streamsApi.v3RoomIdUpdatePost(null, "ABC123", new V3RoomAttributes()));
  }

  /**
   * Test {@link StreamsApi#v3RoomIdUpdatePostWithHttpInfo(String, String, V3RoomAttributes)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v3RoomIdUpdatePostWithHttpInfo(String, String,
   * V3RoomAttributes)}
   */
  @Test
  @DisplayName(
      "Test v3RoomIdUpdatePostWithHttpInfo(String, String, V3RoomAttributes); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v3RoomIdUpdatePostWithHttpInfo(String, String, V3RoomAttributes)"
  })
  void testV3RoomIdUpdatePostWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            streamsApi.v3RoomIdUpdatePostWithHttpInfo(
                null, "https://example.org/example", new V3RoomAttributes()));
  }

  /**
   * Test {@link StreamsApi#v3RoomIdUpdatePostWithHttpInfo(String, String, V3RoomAttributes)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v3RoomIdUpdatePostWithHttpInfo(String, String,
   * V3RoomAttributes)}
   */
  @Test
  @DisplayName(
      "Test v3RoomIdUpdatePostWithHttpInfo(String, String, V3RoomAttributes); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v3RoomIdUpdatePostWithHttpInfo(String, String, V3RoomAttributes)"
  })
  void testV3RoomIdUpdatePostWithHttpInfo_whenNull_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            streamsApi.v3RoomIdUpdatePostWithHttpInfo(
                "https://example.org/example", null, new V3RoomAttributes()));
  }

  /**
   * Test {@link StreamsApi#v3RoomIdUpdatePostWithHttpInfo(String, String, V3RoomAttributes)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v3RoomIdUpdatePostWithHttpInfo(String, String,
   * V3RoomAttributes)}
   */
  @Test
  @DisplayName(
      "Test v3RoomIdUpdatePostWithHttpInfo(String, String, V3RoomAttributes); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v3RoomIdUpdatePostWithHttpInfo(String, String, V3RoomAttributes)"
  })
  void testV3RoomIdUpdatePostWithHttpInfo_whenNull_thenThrowApiException3() throws ApiException {
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
            new StreamsApi(apiClient)
                .v3RoomIdUpdatePostWithHttpInfo(
                    "https://example.org/example", "https://example.org/example", null));
  }

  /**
   * Test {@link StreamsApi#v3RoomSearchPost(String, Integer, Integer, V2RoomSearchCriteria)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v3RoomSearchPost(String, Integer, Integer,
   * V2RoomSearchCriteria)}
   */
  @Test
  @DisplayName(
      "Test v3RoomSearchPost(String, Integer, Integer, V2RoomSearchCriteria); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V3RoomSearchResults StreamsApi.v3RoomSearchPost(String, Integer, Integer, V2RoomSearchCriteria)"
  })
  void testV3RoomSearchPost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> streamsApi.v3RoomSearchPost(null, 1, 1, new V2RoomSearchCriteria()));
  }

  /**
   * Test {@link StreamsApi#v3RoomSearchPost(String, Integer, Integer, V2RoomSearchCriteria)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v3RoomSearchPost(String, Integer, Integer,
   * V2RoomSearchCriteria)}
   */
  @Test
  @DisplayName(
      "Test v3RoomSearchPost(String, Integer, Integer, V2RoomSearchCriteria); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V3RoomSearchResults StreamsApi.v3RoomSearchPost(String, Integer, Integer, V2RoomSearchCriteria)"
  })
  void testV3RoomSearchPost_thenThrowApiException2() throws ApiException {
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
        ApiException.class, () -> new StreamsApi(apiClient).v3RoomSearchPost("ABC123", 1, 1, null));
  }

  /**
   * Test {@link StreamsApi#v3RoomSearchPostWithHttpInfo(String, Integer, Integer,
   * V2RoomSearchCriteria)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v3RoomSearchPostWithHttpInfo(String, Integer, Integer,
   * V2RoomSearchCriteria)}
   */
  @Test
  @DisplayName(
      "Test v3RoomSearchPostWithHttpInfo(String, Integer, Integer, V2RoomSearchCriteria); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v3RoomSearchPostWithHttpInfo(String, Integer, Integer, V2RoomSearchCriteria)"
  })
  void testV3RoomSearchPostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    StreamsApi streamsApi = new StreamsApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> streamsApi.v3RoomSearchPostWithHttpInfo(null, 1, 1, new V2RoomSearchCriteria()));
  }

  /**
   * Test {@link StreamsApi#v3RoomSearchPostWithHttpInfo(String, Integer, Integer,
   * V2RoomSearchCriteria)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link StreamsApi#v3RoomSearchPostWithHttpInfo(String, Integer, Integer,
   * V2RoomSearchCriteria)}
   */
  @Test
  @DisplayName(
      "Test v3RoomSearchPostWithHttpInfo(String, Integer, Integer, V2RoomSearchCriteria); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse StreamsApi.v3RoomSearchPostWithHttpInfo(String, Integer, Integer, V2RoomSearchCriteria)"
  })
  void testV3RoomSearchPostWithHttpInfo_thenThrowApiException2() throws ApiException {
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
            new StreamsApi(apiClient)
                .v3RoomSearchPostWithHttpInfo("https://example.org/example", 1, 1, null));
  }
}
