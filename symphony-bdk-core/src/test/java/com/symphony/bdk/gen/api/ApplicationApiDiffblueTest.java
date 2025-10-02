package com.symphony.bdk.gen.api;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.ApplicationDetail;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import jakarta.ws.rs.client.Client;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ApplicationApiDiffblueTest {
  /**
   * Test {@link ApplicationApi#v1AdminAppCreatePost(String, ApplicationDetail)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ApplicationApi#v1AdminAppCreatePost(String, ApplicationDetail)}
   */
  @Test
  @DisplayName("Test v1AdminAppCreatePost(String, ApplicationDetail); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApplicationDetail ApplicationApi.v1AdminAppCreatePost(String, ApplicationDetail)"
  })
  void testV1AdminAppCreatePost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    ApplicationApi applicationApi = new ApplicationApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> applicationApi.v1AdminAppCreatePost(null, new ApplicationDetail()));
  }

  /**
   * Test {@link ApplicationApi#v1AdminAppCreatePost(String, ApplicationDetail)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ApplicationApi#v1AdminAppCreatePost(String, ApplicationDetail)}
   */
  @Test
  @DisplayName("Test v1AdminAppCreatePost(String, ApplicationDetail); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApplicationDetail ApplicationApi.v1AdminAppCreatePost(String, ApplicationDetail)"
  })
  void testV1AdminAppCreatePost_thenThrowApiException2() throws ApiException {
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
        () -> new ApplicationApi(apiClient).v1AdminAppCreatePost("ABC123", null));
  }

  /**
   * Test {@link ApplicationApi#v1AdminAppCreatePostWithHttpInfo(String, ApplicationDetail)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ApplicationApi#v1AdminAppCreatePostWithHttpInfo(String,
   * ApplicationDetail)}
   */
  @Test
  @DisplayName(
      "Test v1AdminAppCreatePostWithHttpInfo(String, ApplicationDetail); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ApplicationApi.v1AdminAppCreatePostWithHttpInfo(String, ApplicationDetail)"
  })
  void testV1AdminAppCreatePostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    ApplicationApi applicationApi = new ApplicationApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> applicationApi.v1AdminAppCreatePostWithHttpInfo(null, new ApplicationDetail()));
  }

  /**
   * Test {@link ApplicationApi#v1AdminAppCreatePostWithHttpInfo(String, ApplicationDetail)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ApplicationApi#v1AdminAppCreatePostWithHttpInfo(String,
   * ApplicationDetail)}
   */
  @Test
  @DisplayName(
      "Test v1AdminAppCreatePostWithHttpInfo(String, ApplicationDetail); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ApplicationApi.v1AdminAppCreatePostWithHttpInfo(String, ApplicationDetail)"
  })
  void testV1AdminAppCreatePostWithHttpInfo_thenThrowApiException2() throws ApiException {
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
            new ApplicationApi(apiClient)
                .v1AdminAppCreatePostWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link ApplicationApi#v1AdminAppIdDeletePost(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ApplicationApi#v1AdminAppIdDeletePost(String, String)}
   */
  @Test
  @DisplayName("Test v1AdminAppIdDeletePost(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.SuccessResponse ApplicationApi.v1AdminAppIdDeletePost(String, String)"
  })
  void testV1AdminAppIdDeletePost_whenNull_thenThrowApiException() throws ApiException {
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
        ApiException.class, () -> new ApplicationApi(apiClient).v1AdminAppIdDeletePost(null, "42"));
  }

  /**
   * Test {@link ApplicationApi#v1AdminAppIdDeletePost(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ApplicationApi#v1AdminAppIdDeletePost(String, String)}
   */
  @Test
  @DisplayName("Test v1AdminAppIdDeletePost(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.SuccessResponse ApplicationApi.v1AdminAppIdDeletePost(String, String)"
  })
  void testV1AdminAppIdDeletePost_whenNull_thenThrowApiException2() throws ApiException {
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
        () -> new ApplicationApi(apiClient).v1AdminAppIdDeletePost("ABC123", null));
  }

  /**
   * Test {@link ApplicationApi#v1AdminAppIdDeletePostWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ApplicationApi#v1AdminAppIdDeletePostWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1AdminAppIdDeletePostWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ApplicationApi.v1AdminAppIdDeletePostWithHttpInfo(String, String)"
  })
  void testV1AdminAppIdDeletePostWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
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
            new ApplicationApi(apiClient)
                .v1AdminAppIdDeletePostWithHttpInfo(null, "https://example.org/example"));
  }

  /**
   * Test {@link ApplicationApi#v1AdminAppIdDeletePostWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ApplicationApi#v1AdminAppIdDeletePostWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1AdminAppIdDeletePostWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ApplicationApi.v1AdminAppIdDeletePostWithHttpInfo(String, String)"
  })
  void testV1AdminAppIdDeletePostWithHttpInfo_whenNull_thenThrowApiException2()
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
            new ApplicationApi(apiClient)
                .v1AdminAppIdDeletePostWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link ApplicationApi#v1AdminAppIdGetGet(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ApplicationApi#v1AdminAppIdGetGet(String, String)}
   */
  @Test
  @DisplayName("Test v1AdminAppIdGetGet(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApplicationDetail ApplicationApi.v1AdminAppIdGetGet(String, String)"})
  void testV1AdminAppIdGetGet_whenNull_thenThrowApiException() throws ApiException {
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
        ApiException.class, () -> new ApplicationApi(apiClient).v1AdminAppIdGetGet(null, "42"));
  }

  /**
   * Test {@link ApplicationApi#v1AdminAppIdGetGet(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ApplicationApi#v1AdminAppIdGetGet(String, String)}
   */
  @Test
  @DisplayName("Test v1AdminAppIdGetGet(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApplicationDetail ApplicationApi.v1AdminAppIdGetGet(String, String)"})
  void testV1AdminAppIdGetGet_whenNull_thenThrowApiException2() throws ApiException {
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
        ApiException.class, () -> new ApplicationApi(apiClient).v1AdminAppIdGetGet("ABC123", null));
  }

  /**
   * Test {@link ApplicationApi#v1AdminAppIdGetGetWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ApplicationApi#v1AdminAppIdGetGetWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1AdminAppIdGetGetWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ApplicationApi.v1AdminAppIdGetGetWithHttpInfo(String, String)"
  })
  void testV1AdminAppIdGetGetWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
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
            new ApplicationApi(apiClient)
                .v1AdminAppIdGetGetWithHttpInfo(null, "https://example.org/example"));
  }

  /**
   * Test {@link ApplicationApi#v1AdminAppIdGetGetWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ApplicationApi#v1AdminAppIdGetGetWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1AdminAppIdGetGetWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ApplicationApi.v1AdminAppIdGetGetWithHttpInfo(String, String)"
  })
  void testV1AdminAppIdGetGetWithHttpInfo_whenNull_thenThrowApiException2() throws ApiException {
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
            new ApplicationApi(apiClient)
                .v1AdminAppIdGetGetWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link ApplicationApi#v1AdminAppIdUpdatePost(String, String, ApplicationDetail)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ApplicationApi#v1AdminAppIdUpdatePost(String, String,
   * ApplicationDetail)}
   */
  @Test
  @DisplayName(
      "Test v1AdminAppIdUpdatePost(String, String, ApplicationDetail); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApplicationDetail ApplicationApi.v1AdminAppIdUpdatePost(String, String, ApplicationDetail)"
  })
  void testV1AdminAppIdUpdatePost_when42_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    ApplicationApi applicationApi = new ApplicationApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> applicationApi.v1AdminAppIdUpdatePost(null, "42", new ApplicationDetail()));
  }

  /**
   * Test {@link ApplicationApi#v1AdminAppIdUpdatePost(String, String, ApplicationDetail)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ApplicationApi#v1AdminAppIdUpdatePost(String, String,
   * ApplicationDetail)}
   */
  @Test
  @DisplayName(
      "Test v1AdminAppIdUpdatePost(String, String, ApplicationDetail); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApplicationDetail ApplicationApi.v1AdminAppIdUpdatePost(String, String, ApplicationDetail)"
  })
  void testV1AdminAppIdUpdatePost_when42_thenThrowApiException2() throws ApiException {
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
        () -> new ApplicationApi(apiClient).v1AdminAppIdUpdatePost("ABC123", "42", null));
  }

  /**
   * Test {@link ApplicationApi#v1AdminAppIdUpdatePost(String, String, ApplicationDetail)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ApplicationApi#v1AdminAppIdUpdatePost(String, String,
   * ApplicationDetail)}
   */
  @Test
  @DisplayName(
      "Test v1AdminAppIdUpdatePost(String, String, ApplicationDetail); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApplicationDetail ApplicationApi.v1AdminAppIdUpdatePost(String, String, ApplicationDetail)"
  })
  void testV1AdminAppIdUpdatePost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    ApplicationApi applicationApi = new ApplicationApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> applicationApi.v1AdminAppIdUpdatePost("ABC123", null, new ApplicationDetail()));
  }

  /**
   * Test {@link ApplicationApi#v1AdminAppIdUpdatePostWithHttpInfo(String, String,
   * ApplicationDetail)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ApplicationApi#v1AdminAppIdUpdatePostWithHttpInfo(String, String,
   * ApplicationDetail)}
   */
  @Test
  @DisplayName(
      "Test v1AdminAppIdUpdatePostWithHttpInfo(String, String, ApplicationDetail); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ApplicationApi.v1AdminAppIdUpdatePostWithHttpInfo(String, String, ApplicationDetail)"
  })
  void testV1AdminAppIdUpdatePostWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    ApplicationApi applicationApi = new ApplicationApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            applicationApi.v1AdminAppIdUpdatePostWithHttpInfo(
                null, "https://example.org/example", new ApplicationDetail()));
  }

  /**
   * Test {@link ApplicationApi#v1AdminAppIdUpdatePostWithHttpInfo(String, String,
   * ApplicationDetail)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ApplicationApi#v1AdminAppIdUpdatePostWithHttpInfo(String, String,
   * ApplicationDetail)}
   */
  @Test
  @DisplayName(
      "Test v1AdminAppIdUpdatePostWithHttpInfo(String, String, ApplicationDetail); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ApplicationApi.v1AdminAppIdUpdatePostWithHttpInfo(String, String, ApplicationDetail)"
  })
  void testV1AdminAppIdUpdatePostWithHttpInfo_whenNull_thenThrowApiException2()
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
    ApplicationApi applicationApi = new ApplicationApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            applicationApi.v1AdminAppIdUpdatePostWithHttpInfo(
                "https://example.org/example", null, new ApplicationDetail()));
  }

  /**
   * Test {@link ApplicationApi#v1AdminAppIdUpdatePostWithHttpInfo(String, String,
   * ApplicationDetail)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ApplicationApi#v1AdminAppIdUpdatePostWithHttpInfo(String, String,
   * ApplicationDetail)}
   */
  @Test
  @DisplayName(
      "Test v1AdminAppIdUpdatePostWithHttpInfo(String, String, ApplicationDetail); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ApplicationApi.v1AdminAppIdUpdatePostWithHttpInfo(String, String, ApplicationDetail)"
  })
  void testV1AdminAppIdUpdatePostWithHttpInfo_whenNull_thenThrowApiException3()
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
            new ApplicationApi(apiClient)
                .v1AdminAppIdUpdatePostWithHttpInfo(
                    "https://example.org/example", "https://example.org/example", null));
  }
}
