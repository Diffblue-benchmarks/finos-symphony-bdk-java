package com.symphony.bdk.gen.api;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.Presence;
import com.symphony.bdk.gen.api.model.V2PresenceStatus;
import com.symphony.bdk.gen.api.model.V2UserPresence;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import jakarta.ws.rs.client.Client;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PresenceApiDiffblueTest {
  /**
   * Test {@link PresenceApi#v1PresenceFeedCreatePost(String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v1PresenceFeedCreatePost(String)}
   */
  @Test
  @DisplayName("Test v1PresenceFeedCreatePost(String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.StringId PresenceApi.v1PresenceFeedCreatePost(String)"
  })
  void testV1PresenceFeedCreatePost_thenThrowApiException() throws ApiException {
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
        ApiException.class, () -> new PresenceApi(apiClient).v1PresenceFeedCreatePost(null));
  }

  /**
   * Test {@link PresenceApi#v1PresenceFeedCreatePostWithHttpInfo(String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v1PresenceFeedCreatePostWithHttpInfo(String)}
   */
  @Test
  @DisplayName("Test v1PresenceFeedCreatePostWithHttpInfo(String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse PresenceApi.v1PresenceFeedCreatePostWithHttpInfo(String)"
  })
  void testV1PresenceFeedCreatePostWithHttpInfo_thenThrowApiException() throws ApiException {
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
        () -> new PresenceApi(apiClient).v1PresenceFeedCreatePostWithHttpInfo(null));
  }

  /**
   * Test {@link PresenceApi#v1PresenceFeedFeedIdDeletePost(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v1PresenceFeedFeedIdDeletePost(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1PresenceFeedFeedIdDeletePost(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.StringId PresenceApi.v1PresenceFeedFeedIdDeletePost(String, String)"
  })
  void testV1PresenceFeedFeedIdDeletePost_whenNull_thenThrowApiException() throws ApiException {
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
        () -> new PresenceApi(apiClient).v1PresenceFeedFeedIdDeletePost(null, "42"));
  }

  /**
   * Test {@link PresenceApi#v1PresenceFeedFeedIdDeletePost(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v1PresenceFeedFeedIdDeletePost(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1PresenceFeedFeedIdDeletePost(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.StringId PresenceApi.v1PresenceFeedFeedIdDeletePost(String, String)"
  })
  void testV1PresenceFeedFeedIdDeletePost_whenNull_thenThrowApiException2() throws ApiException {
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
        () -> new PresenceApi(apiClient).v1PresenceFeedFeedIdDeletePost("ABC123", null));
  }

  /**
   * Test {@link PresenceApi#v1PresenceFeedFeedIdDeletePostWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v1PresenceFeedFeedIdDeletePostWithHttpInfo(String,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v1PresenceFeedFeedIdDeletePostWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse PresenceApi.v1PresenceFeedFeedIdDeletePostWithHttpInfo(String, String)"
  })
  void testV1PresenceFeedFeedIdDeletePostWithHttpInfo_whenNull_thenThrowApiException()
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
            new PresenceApi(apiClient)
                .v1PresenceFeedFeedIdDeletePostWithHttpInfo(null, "https://example.org/example"));
  }

  /**
   * Test {@link PresenceApi#v1PresenceFeedFeedIdDeletePostWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v1PresenceFeedFeedIdDeletePostWithHttpInfo(String,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v1PresenceFeedFeedIdDeletePostWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse PresenceApi.v1PresenceFeedFeedIdDeletePostWithHttpInfo(String, String)"
  })
  void testV1PresenceFeedFeedIdDeletePostWithHttpInfo_whenNull_thenThrowApiException2()
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
            new PresenceApi(apiClient)
                .v1PresenceFeedFeedIdDeletePostWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link PresenceApi#v1PresenceFeedFeedIdReadGet(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v1PresenceFeedFeedIdReadGet(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1PresenceFeedFeedIdReadGet(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List PresenceApi.v1PresenceFeedFeedIdReadGet(String, String)"})
  void testV1PresenceFeedFeedIdReadGet_whenNull_thenThrowApiException() throws ApiException {
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
        () -> new PresenceApi(apiClient).v1PresenceFeedFeedIdReadGet(null, "42"));
  }

  /**
   * Test {@link PresenceApi#v1PresenceFeedFeedIdReadGet(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v1PresenceFeedFeedIdReadGet(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1PresenceFeedFeedIdReadGet(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List PresenceApi.v1PresenceFeedFeedIdReadGet(String, String)"})
  void testV1PresenceFeedFeedIdReadGet_whenNull_thenThrowApiException2() throws ApiException {
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
        () -> new PresenceApi(apiClient).v1PresenceFeedFeedIdReadGet("ABC123", null));
  }

  /**
   * Test {@link PresenceApi#v1PresenceFeedFeedIdReadGetWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v1PresenceFeedFeedIdReadGetWithHttpInfo(String,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v1PresenceFeedFeedIdReadGetWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse PresenceApi.v1PresenceFeedFeedIdReadGetWithHttpInfo(String, String)"
  })
  void testV1PresenceFeedFeedIdReadGetWithHttpInfo_whenNull_thenThrowApiException()
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
            new PresenceApi(apiClient)
                .v1PresenceFeedFeedIdReadGetWithHttpInfo(null, "https://example.org/example"));
  }

  /**
   * Test {@link PresenceApi#v1PresenceFeedFeedIdReadGetWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v1PresenceFeedFeedIdReadGetWithHttpInfo(String,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v1PresenceFeedFeedIdReadGetWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse PresenceApi.v1PresenceFeedFeedIdReadGetWithHttpInfo(String, String)"
  })
  void testV1PresenceFeedFeedIdReadGetWithHttpInfo_whenNull_thenThrowApiException2()
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
            new PresenceApi(apiClient)
                .v1PresenceFeedFeedIdReadGetWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link PresenceApi#v1UserPresenceGet(String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v1UserPresenceGet(String)}
   */
  @Test
  @DisplayName("Test v1UserPresenceGet(String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Presence PresenceApi.v1UserPresenceGet(String)"})
  void testV1UserPresenceGet_thenThrowApiException() throws ApiException {
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
    assertThrows(ApiException.class, () -> new PresenceApi(apiClient).v1UserPresenceGet(null));
  }

  /**
   * Test {@link PresenceApi#v1UserPresenceGetWithHttpInfo(String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v1UserPresenceGetWithHttpInfo(String)}
   */
  @Test
  @DisplayName("Test v1UserPresenceGetWithHttpInfo(String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse PresenceApi.v1UserPresenceGetWithHttpInfo(String)"
  })
  void testV1UserPresenceGetWithHttpInfo_thenThrowApiException() throws ApiException {
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
        ApiException.class, () -> new PresenceApi(apiClient).v1UserPresenceGetWithHttpInfo(null));
  }

  /**
   * Test {@link PresenceApi#v1UserPresencePost(String, Presence)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v1UserPresencePost(String, Presence)}
   */
  @Test
  @DisplayName("Test v1UserPresencePost(String, Presence); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Presence PresenceApi.v1UserPresencePost(String, Presence)"})
  void testV1UserPresencePost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    PresenceApi presenceApi = new PresenceApi(apiClient);

    // Act and Assert
    assertThrows(ApiException.class, () -> presenceApi.v1UserPresencePost(null, new Presence()));
  }

  /**
   * Test {@link PresenceApi#v1UserPresencePost(String, Presence)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v1UserPresencePost(String, Presence)}
   */
  @Test
  @DisplayName("Test v1UserPresencePost(String, Presence); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Presence PresenceApi.v1UserPresencePost(String, Presence)"})
  void testV1UserPresencePost_thenThrowApiException2() throws ApiException {
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
        ApiException.class, () -> new PresenceApi(apiClient).v1UserPresencePost("ABC123", null));
  }

  /**
   * Test {@link PresenceApi#v1UserPresencePostWithHttpInfo(String, Presence)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v1UserPresencePostWithHttpInfo(String, Presence)}
   */
  @Test
  @DisplayName("Test v1UserPresencePostWithHttpInfo(String, Presence); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse PresenceApi.v1UserPresencePostWithHttpInfo(String, Presence)"
  })
  void testV1UserPresencePostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    PresenceApi presenceApi = new PresenceApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class, () -> presenceApi.v1UserPresencePostWithHttpInfo(null, new Presence()));
  }

  /**
   * Test {@link PresenceApi#v1UserPresencePostWithHttpInfo(String, Presence)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v1UserPresencePostWithHttpInfo(String, Presence)}
   */
  @Test
  @DisplayName("Test v1UserPresencePostWithHttpInfo(String, Presence); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse PresenceApi.v1UserPresencePostWithHttpInfo(String, Presence)"
  })
  void testV1UserPresencePostWithHttpInfo_thenThrowApiException2() throws ApiException {
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
            new PresenceApi(apiClient)
                .v1UserPresencePostWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link PresenceApi#v1UserPresenceRegisterPost(String, List)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v1UserPresenceRegisterPost(String, List)}
   */
  @Test
  @DisplayName("Test v1UserPresenceRegisterPost(String, List); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.SuccessResponse PresenceApi.v1UserPresenceRegisterPost(String, List)"
  })
  void testV1UserPresenceRegisterPost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    PresenceApi presenceApi = new PresenceApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class, () -> presenceApi.v1UserPresenceRegisterPost(null, new ArrayList<>()));
  }

  /**
   * Test {@link PresenceApi#v1UserPresenceRegisterPost(String, List)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v1UserPresenceRegisterPost(String, List)}
   */
  @Test
  @DisplayName(
      "Test v1UserPresenceRegisterPost(String, List); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.SuccessResponse PresenceApi.v1UserPresenceRegisterPost(String, List)"
  })
  void testV1UserPresenceRegisterPost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(
        ApiException.class, () -> new PresenceApi(null).v1UserPresenceRegisterPost("ABC123", null));
  }

  /**
   * Test {@link PresenceApi#v1UserPresenceRegisterPostWithHttpInfo(String, List)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v1UserPresenceRegisterPostWithHttpInfo(String, List)}
   */
  @Test
  @DisplayName("Test v1UserPresenceRegisterPostWithHttpInfo(String, List); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse PresenceApi.v1UserPresenceRegisterPostWithHttpInfo(String, List)"
  })
  void testV1UserPresenceRegisterPostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    PresenceApi presenceApi = new PresenceApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> presenceApi.v1UserPresenceRegisterPostWithHttpInfo(null, new ArrayList<>()));
  }

  /**
   * Test {@link PresenceApi#v1UserPresenceRegisterPostWithHttpInfo(String, List)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v1UserPresenceRegisterPostWithHttpInfo(String, List)}
   */
  @Test
  @DisplayName(
      "Test v1UserPresenceRegisterPostWithHttpInfo(String, List); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse PresenceApi.v1UserPresenceRegisterPostWithHttpInfo(String, List)"
  })
  void testV1UserPresenceRegisterPostWithHttpInfo_whenNull_thenThrowApiException()
      throws ApiException {
    // Arrange, Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new PresenceApi(null)
                .v1UserPresenceRegisterPostWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link PresenceApi#v1UserUidPresenceGet(Long, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v1UserUidPresenceGet(Long, String)}
   */
  @Test
  @DisplayName("Test v1UserUidPresenceGet(Long, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Presence PresenceApi.v1UserUidPresenceGet(Long, String)"})
  void testV1UserUidPresenceGet_whenNull_thenThrowApiException() throws ApiException {
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
        ApiException.class, () -> new PresenceApi(apiClient).v1UserUidPresenceGet(null, "ABC123"));
  }

  /**
   * Test {@link PresenceApi#v1UserUidPresenceGet(Long, String)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v1UserUidPresenceGet(Long, String)}
   */
  @Test
  @DisplayName("Test v1UserUidPresenceGet(Long, String); when one; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Presence PresenceApi.v1UserUidPresenceGet(Long, String)"})
  void testV1UserUidPresenceGet_whenOne_thenThrowApiException() throws ApiException {
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
        ApiException.class, () -> new PresenceApi(apiClient).v1UserUidPresenceGet(1L, null));
  }

  /**
   * Test {@link PresenceApi#v1UserUidPresenceGetWithHttpInfo(Long, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v1UserUidPresenceGetWithHttpInfo(Long, String)}
   */
  @Test
  @DisplayName(
      "Test v1UserUidPresenceGetWithHttpInfo(Long, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse PresenceApi.v1UserUidPresenceGetWithHttpInfo(Long, String)"
  })
  void testV1UserUidPresenceGetWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
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
            new PresenceApi(apiClient)
                .v1UserUidPresenceGetWithHttpInfo(null, "https://example.org/example"));
  }

  /**
   * Test {@link PresenceApi#v1UserUidPresenceGetWithHttpInfo(Long, String)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v1UserUidPresenceGetWithHttpInfo(Long, String)}
   */
  @Test
  @DisplayName(
      "Test v1UserUidPresenceGetWithHttpInfo(Long, String); when one; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse PresenceApi.v1UserUidPresenceGetWithHttpInfo(Long, String)"
  })
  void testV1UserUidPresenceGetWithHttpInfo_whenOne_thenThrowApiException() throws ApiException {
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
        () -> new PresenceApi(apiClient).v1UserUidPresenceGetWithHttpInfo(1L, null));
  }

  /**
   * Test {@link PresenceApi#v1UserUidPresencePost(Long, String, Presence)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v1UserUidPresencePost(Long, String, Presence)}
   */
  @Test
  @DisplayName(
      "Test v1UserUidPresencePost(Long, String, Presence); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Presence PresenceApi.v1UserUidPresencePost(Long, String, Presence)"})
  void testV1UserUidPresencePost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    PresenceApi presenceApi = new PresenceApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> presenceApi.v1UserUidPresencePost(null, "ABC123", new Presence()));
  }

  /**
   * Test {@link PresenceApi#v1UserUidPresencePost(Long, String, Presence)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v1UserUidPresencePost(Long, String, Presence)}
   */
  @Test
  @DisplayName(
      "Test v1UserUidPresencePost(Long, String, Presence); when one; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Presence PresenceApi.v1UserUidPresencePost(Long, String, Presence)"})
  void testV1UserUidPresencePost_whenOne_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    PresenceApi presenceApi = new PresenceApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class, () -> presenceApi.v1UserUidPresencePost(1L, null, new Presence()));
  }

  /**
   * Test {@link PresenceApi#v1UserUidPresencePost(Long, String, Presence)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v1UserUidPresencePost(Long, String, Presence)}
   */
  @Test
  @DisplayName(
      "Test v1UserUidPresencePost(Long, String, Presence); when one; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Presence PresenceApi.v1UserUidPresencePost(Long, String, Presence)"})
  void testV1UserUidPresencePost_whenOne_thenThrowApiException2() throws ApiException {
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
        () -> new PresenceApi(apiClient).v1UserUidPresencePost(1L, "ABC123", null));
  }

  /**
   * Test {@link PresenceApi#v1UserUidPresencePostWithHttpInfo(Long, String, Presence)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v1UserUidPresencePostWithHttpInfo(Long, String,
   * Presence)}
   */
  @Test
  @DisplayName(
      "Test v1UserUidPresencePostWithHttpInfo(Long, String, Presence); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse PresenceApi.v1UserUidPresencePostWithHttpInfo(Long, String, Presence)"
  })
  void testV1UserUidPresencePostWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    PresenceApi presenceApi = new PresenceApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            presenceApi.v1UserUidPresencePostWithHttpInfo(
                null, "https://example.org/example", new Presence()));
  }

  /**
   * Test {@link PresenceApi#v1UserUidPresencePostWithHttpInfo(Long, String, Presence)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v1UserUidPresencePostWithHttpInfo(Long, String,
   * Presence)}
   */
  @Test
  @DisplayName(
      "Test v1UserUidPresencePostWithHttpInfo(Long, String, Presence); when one; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse PresenceApi.v1UserUidPresencePostWithHttpInfo(Long, String, Presence)"
  })
  void testV1UserUidPresencePostWithHttpInfo_whenOne_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    PresenceApi presenceApi = new PresenceApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> presenceApi.v1UserUidPresencePostWithHttpInfo(1L, null, new Presence()));
  }

  /**
   * Test {@link PresenceApi#v1UserUidPresencePostWithHttpInfo(Long, String, Presence)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v1UserUidPresencePostWithHttpInfo(Long, String,
   * Presence)}
   */
  @Test
  @DisplayName(
      "Test v1UserUidPresencePostWithHttpInfo(Long, String, Presence); when one; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse PresenceApi.v1UserUidPresencePostWithHttpInfo(Long, String, Presence)"
  })
  void testV1UserUidPresencePostWithHttpInfo_whenOne_thenThrowApiException2() throws ApiException {
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
            new PresenceApi(apiClient)
                .v1UserUidPresencePostWithHttpInfo(1L, "https://example.org/example", null));
  }

  /**
   * Test {@link PresenceApi#v2UserPresenceGet(String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v2UserPresenceGet(String)}
   */
  @Test
  @DisplayName("Test v2UserPresenceGet(String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V2Presence PresenceApi.v2UserPresenceGet(String)"
  })
  void testV2UserPresenceGet_thenThrowApiException() throws ApiException {
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
    assertThrows(ApiException.class, () -> new PresenceApi(apiClient).v2UserPresenceGet(null));
  }

  /**
   * Test {@link PresenceApi#v2UserPresenceGetWithHttpInfo(String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v2UserPresenceGetWithHttpInfo(String)}
   */
  @Test
  @DisplayName("Test v2UserPresenceGetWithHttpInfo(String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse PresenceApi.v2UserPresenceGetWithHttpInfo(String)"
  })
  void testV2UserPresenceGetWithHttpInfo_thenThrowApiException() throws ApiException {
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
        ApiException.class, () -> new PresenceApi(apiClient).v2UserPresenceGetWithHttpInfo(null));
  }

  /**
   * Test {@link PresenceApi#v2UserPresencePost(String, Boolean, V2PresenceStatus)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v2UserPresencePost(String, Boolean, V2PresenceStatus)}
   */
  @Test
  @DisplayName(
      "Test v2UserPresencePost(String, Boolean, V2PresenceStatus); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V2Presence PresenceApi.v2UserPresencePost(String, Boolean, V2PresenceStatus)"
  })
  void testV2UserPresencePost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    PresenceApi presenceApi = new PresenceApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> presenceApi.v2UserPresencePost(null, true, new V2PresenceStatus()));
  }

  /**
   * Test {@link PresenceApi#v2UserPresencePost(String, Boolean, V2PresenceStatus)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v2UserPresencePost(String, Boolean, V2PresenceStatus)}
   */
  @Test
  @DisplayName(
      "Test v2UserPresencePost(String, Boolean, V2PresenceStatus); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V2Presence PresenceApi.v2UserPresencePost(String, Boolean, V2PresenceStatus)"
  })
  void testV2UserPresencePost_thenThrowApiException2() throws ApiException {
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
        () -> new PresenceApi(apiClient).v2UserPresencePost("ABC123", true, null));
  }

  /**
   * Test {@link PresenceApi#v2UserPresencePostWithHttpInfo(String, Boolean, V2PresenceStatus)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v2UserPresencePostWithHttpInfo(String, Boolean,
   * V2PresenceStatus)}
   */
  @Test
  @DisplayName(
      "Test v2UserPresencePostWithHttpInfo(String, Boolean, V2PresenceStatus); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse PresenceApi.v2UserPresencePostWithHttpInfo(String, Boolean, V2PresenceStatus)"
  })
  void testV2UserPresencePostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    PresenceApi presenceApi = new PresenceApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> presenceApi.v2UserPresencePostWithHttpInfo(null, true, new V2PresenceStatus()));
  }

  /**
   * Test {@link PresenceApi#v2UserPresencePostWithHttpInfo(String, Boolean, V2PresenceStatus)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v2UserPresencePostWithHttpInfo(String, Boolean,
   * V2PresenceStatus)}
   */
  @Test
  @DisplayName(
      "Test v2UserPresencePostWithHttpInfo(String, Boolean, V2PresenceStatus); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse PresenceApi.v2UserPresencePostWithHttpInfo(String, Boolean, V2PresenceStatus)"
  })
  void testV2UserPresencePostWithHttpInfo_thenThrowApiException2() throws ApiException {
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
            new PresenceApi(apiClient)
                .v2UserPresencePostWithHttpInfo("https://example.org/example", true, null));
  }

  /**
   * Test {@link PresenceApi#v2UserUidPresenceGet(Long, Boolean, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v2UserUidPresenceGet(Long, Boolean, String)}
   */
  @Test
  @DisplayName(
      "Test v2UserUidPresenceGet(Long, Boolean, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Presence PresenceApi.v2UserUidPresenceGet(Long, Boolean, String)"})
  void testV2UserUidPresenceGet_whenNull_thenThrowApiException() throws ApiException {
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
        () -> new PresenceApi(apiClient).v2UserUidPresenceGet(null, true, "ABC123"));
  }

  /**
   * Test {@link PresenceApi#v2UserUidPresenceGet(Long, Boolean, String)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v2UserUidPresenceGet(Long, Boolean, String)}
   */
  @Test
  @DisplayName(
      "Test v2UserUidPresenceGet(Long, Boolean, String); when one; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Presence PresenceApi.v2UserUidPresenceGet(Long, Boolean, String)"})
  void testV2UserUidPresenceGet_whenOne_thenThrowApiException() throws ApiException {
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
        ApiException.class, () -> new PresenceApi(apiClient).v2UserUidPresenceGet(1L, true, null));
  }

  /**
   * Test {@link PresenceApi#v2UserUidPresenceGetWithHttpInfo(Long, Boolean, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v2UserUidPresenceGetWithHttpInfo(Long, Boolean,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v2UserUidPresenceGetWithHttpInfo(Long, Boolean, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse PresenceApi.v2UserUidPresenceGetWithHttpInfo(Long, Boolean, String)"
  })
  void testV2UserUidPresenceGetWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
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
            new PresenceApi(apiClient)
                .v2UserUidPresenceGetWithHttpInfo(null, true, "https://example.org/example"));
  }

  /**
   * Test {@link PresenceApi#v2UserUidPresenceGetWithHttpInfo(Long, Boolean, String)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v2UserUidPresenceGetWithHttpInfo(Long, Boolean,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v2UserUidPresenceGetWithHttpInfo(Long, Boolean, String); when one; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse PresenceApi.v2UserUidPresenceGetWithHttpInfo(Long, Boolean, String)"
  })
  void testV2UserUidPresenceGetWithHttpInfo_whenOne_thenThrowApiException() throws ApiException {
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
        () -> new PresenceApi(apiClient).v2UserUidPresenceGetWithHttpInfo(1L, true, null));
  }

  /**
   * Test {@link PresenceApi#v2UsersPresenceGet(String, Long, Integer)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v2UsersPresenceGet(String, Long, Integer)}
   */
  @Test
  @DisplayName("Test v2UsersPresenceGet(String, Long, Integer); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List PresenceApi.v2UsersPresenceGet(String, Long, Integer)"})
  void testV2UsersPresenceGet_thenThrowApiException() throws ApiException {
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
        ApiException.class, () -> new PresenceApi(apiClient).v2UsersPresenceGet(null, 1L, 1));
  }

  /**
   * Test {@link PresenceApi#v2UsersPresenceGetWithHttpInfo(String, Long, Integer)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v2UsersPresenceGetWithHttpInfo(String, Long, Integer)}
   */
  @Test
  @DisplayName(
      "Test v2UsersPresenceGetWithHttpInfo(String, Long, Integer); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse PresenceApi.v2UsersPresenceGetWithHttpInfo(String, Long, Integer)"
  })
  void testV2UsersPresenceGetWithHttpInfo_thenThrowApiException() throws ApiException {
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
        () -> new PresenceApi(apiClient).v2UsersPresenceGetWithHttpInfo(null, 1L, 1));
  }

  /**
   * Test {@link PresenceApi#v3UserPresencePost(String, Boolean, V2UserPresence)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v3UserPresencePost(String, Boolean, V2UserPresence)}
   */
  @Test
  @DisplayName("Test v3UserPresencePost(String, Boolean, V2UserPresence); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V2Presence PresenceApi.v3UserPresencePost(String, Boolean, V2UserPresence)"
  })
  void testV3UserPresencePost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    PresenceApi presenceApi = new PresenceApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class, () -> presenceApi.v3UserPresencePost(null, true, new V2UserPresence()));
  }

  /**
   * Test {@link PresenceApi#v3UserPresencePost(String, Boolean, V2UserPresence)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v3UserPresencePost(String, Boolean, V2UserPresence)}
   */
  @Test
  @DisplayName("Test v3UserPresencePost(String, Boolean, V2UserPresence); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V2Presence PresenceApi.v3UserPresencePost(String, Boolean, V2UserPresence)"
  })
  void testV3UserPresencePost_thenThrowApiException2() throws ApiException {
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
        () -> new PresenceApi(apiClient).v3UserPresencePost("ABC123", true, null));
  }

  /**
   * Test {@link PresenceApi#v3UserPresencePostWithHttpInfo(String, Boolean, V2UserPresence)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v3UserPresencePostWithHttpInfo(String, Boolean,
   * V2UserPresence)}
   */
  @Test
  @DisplayName(
      "Test v3UserPresencePostWithHttpInfo(String, Boolean, V2UserPresence); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse PresenceApi.v3UserPresencePostWithHttpInfo(String, Boolean, V2UserPresence)"
  })
  void testV3UserPresencePostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    PresenceApi presenceApi = new PresenceApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> presenceApi.v3UserPresencePostWithHttpInfo(null, true, new V2UserPresence()));
  }

  /**
   * Test {@link PresenceApi#v3UserPresencePostWithHttpInfo(String, Boolean, V2UserPresence)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v3UserPresencePostWithHttpInfo(String, Boolean,
   * V2UserPresence)}
   */
  @Test
  @DisplayName(
      "Test v3UserPresencePostWithHttpInfo(String, Boolean, V2UserPresence); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse PresenceApi.v3UserPresencePostWithHttpInfo(String, Boolean, V2UserPresence)"
  })
  void testV3UserPresencePostWithHttpInfo_thenThrowApiException2() throws ApiException {
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
            new PresenceApi(apiClient)
                .v3UserPresencePostWithHttpInfo("https://example.org/example", true, null));
  }

  /**
   * Test {@link PresenceApi#v3UserUidPresenceGet(Long, Boolean, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v3UserUidPresenceGet(Long, Boolean, String)}
   */
  @Test
  @DisplayName(
      "Test v3UserUidPresenceGet(Long, Boolean, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V2Presence PresenceApi.v3UserUidPresenceGet(Long, Boolean, String)"
  })
  void testV3UserUidPresenceGet_whenNull_thenThrowApiException() throws ApiException {
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
        () -> new PresenceApi(apiClient).v3UserUidPresenceGet(null, true, "ABC123"));
  }

  /**
   * Test {@link PresenceApi#v3UserUidPresenceGet(Long, Boolean, String)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v3UserUidPresenceGet(Long, Boolean, String)}
   */
  @Test
  @DisplayName(
      "Test v3UserUidPresenceGet(Long, Boolean, String); when one; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V2Presence PresenceApi.v3UserUidPresenceGet(Long, Boolean, String)"
  })
  void testV3UserUidPresenceGet_whenOne_thenThrowApiException() throws ApiException {
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
        ApiException.class, () -> new PresenceApi(apiClient).v3UserUidPresenceGet(1L, true, null));
  }

  /**
   * Test {@link PresenceApi#v3UserUidPresenceGetWithHttpInfo(Long, Boolean, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v3UserUidPresenceGetWithHttpInfo(Long, Boolean,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v3UserUidPresenceGetWithHttpInfo(Long, Boolean, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse PresenceApi.v3UserUidPresenceGetWithHttpInfo(Long, Boolean, String)"
  })
  void testV3UserUidPresenceGetWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
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
            new PresenceApi(apiClient)
                .v3UserUidPresenceGetWithHttpInfo(null, true, "https://example.org/example"));
  }

  /**
   * Test {@link PresenceApi#v3UserUidPresenceGetWithHttpInfo(Long, Boolean, String)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceApi#v3UserUidPresenceGetWithHttpInfo(Long, Boolean,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v3UserUidPresenceGetWithHttpInfo(Long, Boolean, String); when one; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse PresenceApi.v3UserUidPresenceGetWithHttpInfo(Long, Boolean, String)"
  })
  void testV3UserUidPresenceGetWithHttpInfo_whenOne_thenThrowApiException() throws ApiException {
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
        () -> new PresenceApi(apiClient).v3UserUidPresenceGetWithHttpInfo(1L, true, null));
  }
}
