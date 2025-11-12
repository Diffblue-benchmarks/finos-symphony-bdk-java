package com.symphony.bdk.gen.api;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.ShareContent;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import jakarta.ws.rs.client.Client;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ShareApiDiffblueTest {
  /**
   * Test {@link ShareApi#v1StreamSidSharePost(String, String, String, ShareContent)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ShareApi#v1StreamSidSharePost(String, String, String,
   * ShareContent)}
   */
  @Test
  @DisplayName(
      "Test v1StreamSidSharePost(String, String, String, ShareContent); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V2Message ShareApi.v1StreamSidSharePost(String, String, String, ShareContent)"
  })
  void testV1StreamSidSharePost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    ShareApi shareApi = new ShareApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> shareApi.v1StreamSidSharePost(null, "ABC123", "ABC123", new ShareContent()));
  }

  /**
   * Test {@link ShareApi#v1StreamSidSharePost(String, String, String, ShareContent)}.
   *
   * <ul>
   *   <li>When {@code Sid}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ShareApi#v1StreamSidSharePost(String, String, String,
   * ShareContent)}
   */
  @Test
  @DisplayName(
      "Test v1StreamSidSharePost(String, String, String, ShareContent); when 'Sid'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V2Message ShareApi.v1StreamSidSharePost(String, String, String, ShareContent)"
  })
  void testV1StreamSidSharePost_whenSid_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    ShareApi shareApi = new ShareApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> shareApi.v1StreamSidSharePost("Sid", null, "ABC123", new ShareContent()));
  }

  /**
   * Test {@link ShareApi#v1StreamSidSharePost(String, String, String, ShareContent)}.
   *
   * <ul>
   *   <li>When {@code Sid}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ShareApi#v1StreamSidSharePost(String, String, String,
   * ShareContent)}
   */
  @Test
  @DisplayName(
      "Test v1StreamSidSharePost(String, String, String, ShareContent); when 'Sid'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V2Message ShareApi.v1StreamSidSharePost(String, String, String, ShareContent)"
  })
  void testV1StreamSidSharePost_whenSid_thenThrowApiException2() throws ApiException {
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
        () -> new ShareApi(apiClient).v1StreamSidSharePost("Sid", "ABC123", null, null));
  }

  /**
   * Test {@link ShareApi#v1StreamSidSharePostWithHttpInfo(String, String, String, ShareContent)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ShareApi#v1StreamSidSharePostWithHttpInfo(String, String, String,
   * ShareContent)}
   */
  @Test
  @DisplayName(
      "Test v1StreamSidSharePostWithHttpInfo(String, String, String, ShareContent); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ShareApi.v1StreamSidSharePostWithHttpInfo(String, String, String, ShareContent)"
  })
  void testV1StreamSidSharePostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    ShareApi shareApi = new ShareApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            shareApi.v1StreamSidSharePostWithHttpInfo(
                null,
                "https://example.org/example",
                "https://example.org/example",
                new ShareContent()));
  }

  /**
   * Test {@link ShareApi#v1StreamSidSharePostWithHttpInfo(String, String, String, ShareContent)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ShareApi#v1StreamSidSharePostWithHttpInfo(String, String, String,
   * ShareContent)}
   */
  @Test
  @DisplayName(
      "Test v1StreamSidSharePostWithHttpInfo(String, String, String, ShareContent); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ShareApi.v1StreamSidSharePostWithHttpInfo(String, String, String, ShareContent)"
  })
  void testV1StreamSidSharePostWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    ShareApi shareApi = new ShareApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            shareApi.v1StreamSidSharePostWithHttpInfo(
                "https://example.org/example",
                null,
                "https://example.org/example",
                new ShareContent()));
  }

  /**
   * Test {@link ShareApi#v1StreamSidSharePostWithHttpInfo(String, String, String, ShareContent)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ShareApi#v1StreamSidSharePostWithHttpInfo(String, String, String,
   * ShareContent)}
   */
  @Test
  @DisplayName(
      "Test v1StreamSidSharePostWithHttpInfo(String, String, String, ShareContent); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ShareApi.v1StreamSidSharePostWithHttpInfo(String, String, String, ShareContent)"
  })
  void testV1StreamSidSharePostWithHttpInfo_thenThrowApiException3() throws ApiException {
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
            new ShareApi(apiClient)
                .v1StreamSidSharePostWithHttpInfo(
                    "https://example.org/example", "https://example.org/example", null, null));
  }

  /**
   * Test {@link ShareApi#v3StreamSidSharePost(String, String, String, ShareContent)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ShareApi#v3StreamSidSharePost(String, String, String,
   * ShareContent)}
   */
  @Test
  @DisplayName(
      "Test v3StreamSidSharePost(String, String, String, ShareContent); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V2Message ShareApi.v3StreamSidSharePost(String, String, String, ShareContent)"
  })
  void testV3StreamSidSharePost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    ShareApi shareApi = new ShareApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> shareApi.v3StreamSidSharePost(null, "ABC123", "ABC123", new ShareContent()));
  }

  /**
   * Test {@link ShareApi#v3StreamSidSharePost(String, String, String, ShareContent)}.
   *
   * <ul>
   *   <li>When {@code Sid}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ShareApi#v3StreamSidSharePost(String, String, String,
   * ShareContent)}
   */
  @Test
  @DisplayName(
      "Test v3StreamSidSharePost(String, String, String, ShareContent); when 'Sid'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V2Message ShareApi.v3StreamSidSharePost(String, String, String, ShareContent)"
  })
  void testV3StreamSidSharePost_whenSid_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    ShareApi shareApi = new ShareApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> shareApi.v3StreamSidSharePost("Sid", null, "ABC123", new ShareContent()));
  }

  /**
   * Test {@link ShareApi#v3StreamSidSharePost(String, String, String, ShareContent)}.
   *
   * <ul>
   *   <li>When {@code Sid}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ShareApi#v3StreamSidSharePost(String, String, String,
   * ShareContent)}
   */
  @Test
  @DisplayName(
      "Test v3StreamSidSharePost(String, String, String, ShareContent); when 'Sid'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V2Message ShareApi.v3StreamSidSharePost(String, String, String, ShareContent)"
  })
  void testV3StreamSidSharePost_whenSid_thenThrowApiException2() throws ApiException {
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
        () -> new ShareApi(apiClient).v3StreamSidSharePost("Sid", "ABC123", null, null));
  }

  /**
   * Test {@link ShareApi#v3StreamSidSharePostWithHttpInfo(String, String, String, ShareContent)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ShareApi#v3StreamSidSharePostWithHttpInfo(String, String, String,
   * ShareContent)}
   */
  @Test
  @DisplayName(
      "Test v3StreamSidSharePostWithHttpInfo(String, String, String, ShareContent); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ShareApi.v3StreamSidSharePostWithHttpInfo(String, String, String, ShareContent)"
  })
  void testV3StreamSidSharePostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    ShareApi shareApi = new ShareApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            shareApi.v3StreamSidSharePostWithHttpInfo(
                null,
                "https://example.org/example",
                "https://example.org/example",
                new ShareContent()));
  }

  /**
   * Test {@link ShareApi#v3StreamSidSharePostWithHttpInfo(String, String, String, ShareContent)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ShareApi#v3StreamSidSharePostWithHttpInfo(String, String, String,
   * ShareContent)}
   */
  @Test
  @DisplayName(
      "Test v3StreamSidSharePostWithHttpInfo(String, String, String, ShareContent); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ShareApi.v3StreamSidSharePostWithHttpInfo(String, String, String, ShareContent)"
  })
  void testV3StreamSidSharePostWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    ShareApi shareApi = new ShareApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            shareApi.v3StreamSidSharePostWithHttpInfo(
                "https://example.org/example",
                null,
                "https://example.org/example",
                new ShareContent()));
  }

  /**
   * Test {@link ShareApi#v3StreamSidSharePostWithHttpInfo(String, String, String, ShareContent)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ShareApi#v3StreamSidSharePostWithHttpInfo(String, String, String,
   * ShareContent)}
   */
  @Test
  @DisplayName(
      "Test v3StreamSidSharePostWithHttpInfo(String, String, String, ShareContent); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ShareApi.v3StreamSidSharePostWithHttpInfo(String, String, String, ShareContent)"
  })
  void testV3StreamSidSharePostWithHttpInfo_thenThrowApiException3() throws ApiException {
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
            new ShareApi(apiClient)
                .v3StreamSidSharePostWithHttpInfo(
                    "https://example.org/example", "https://example.org/example", null, null));
  }
}
