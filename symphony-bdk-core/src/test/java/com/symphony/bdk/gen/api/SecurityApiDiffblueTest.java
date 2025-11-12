package com.symphony.bdk.gen.api;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.CompanyCert;
import com.symphony.bdk.gen.api.model.CompanyCertAttributes;
import com.symphony.bdk.gen.api.model.StringId;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import jakarta.ws.rs.client.Client;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SecurityApiDiffblueTest {
  /**
   * Test {@link SecurityApi#v1CompanycertCreatePost(String, CompanyCert)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityApi#v1CompanycertCreatePost(String, CompanyCert)}
   */
  @Test
  @DisplayName("Test v1CompanycertCreatePost(String, CompanyCert); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.SuccessResponse SecurityApi.v1CompanycertCreatePost(String, CompanyCert)"
  })
  void testV1CompanycertCreatePost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    SecurityApi securityApi = new SecurityApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class, () -> securityApi.v1CompanycertCreatePost(null, new CompanyCert()));
  }

  /**
   * Test {@link SecurityApi#v1CompanycertCreatePost(String, CompanyCert)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityApi#v1CompanycertCreatePost(String, CompanyCert)}
   */
  @Test
  @DisplayName("Test v1CompanycertCreatePost(String, CompanyCert); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.SuccessResponse SecurityApi.v1CompanycertCreatePost(String, CompanyCert)"
  })
  void testV1CompanycertCreatePost_thenThrowApiException2() throws ApiException {
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
        () -> new SecurityApi(apiClient).v1CompanycertCreatePost("ABC123", null));
  }

  /**
   * Test {@link SecurityApi#v1CompanycertCreatePostWithHttpInfo(String, CompanyCert)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityApi#v1CompanycertCreatePostWithHttpInfo(String,
   * CompanyCert)}
   */
  @Test
  @DisplayName(
      "Test v1CompanycertCreatePostWithHttpInfo(String, CompanyCert); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse SecurityApi.v1CompanycertCreatePostWithHttpInfo(String, CompanyCert)"
  })
  void testV1CompanycertCreatePostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    SecurityApi securityApi = new SecurityApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> securityApi.v1CompanycertCreatePostWithHttpInfo(null, new CompanyCert()));
  }

  /**
   * Test {@link SecurityApi#v1CompanycertCreatePostWithHttpInfo(String, CompanyCert)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityApi#v1CompanycertCreatePostWithHttpInfo(String,
   * CompanyCert)}
   */
  @Test
  @DisplayName(
      "Test v1CompanycertCreatePostWithHttpInfo(String, CompanyCert); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse SecurityApi.v1CompanycertCreatePostWithHttpInfo(String, CompanyCert)"
  })
  void testV1CompanycertCreatePostWithHttpInfo_thenThrowApiException2() throws ApiException {
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
            new SecurityApi(apiClient)
                .v1CompanycertCreatePostWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link SecurityApi#v1CompanycertDeletePost(String, StringId)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityApi#v1CompanycertDeletePost(String, StringId)}
   */
  @Test
  @DisplayName("Test v1CompanycertDeletePost(String, StringId); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.SuccessResponse SecurityApi.v1CompanycertDeletePost(String, StringId)"
  })
  void testV1CompanycertDeletePost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    SecurityApi securityApi = new SecurityApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class, () -> securityApi.v1CompanycertDeletePost(null, new StringId()));
  }

  /**
   * Test {@link SecurityApi#v1CompanycertDeletePost(String, StringId)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityApi#v1CompanycertDeletePost(String, StringId)}
   */
  @Test
  @DisplayName("Test v1CompanycertDeletePost(String, StringId); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.SuccessResponse SecurityApi.v1CompanycertDeletePost(String, StringId)"
  })
  void testV1CompanycertDeletePost_thenThrowApiException2() throws ApiException {
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
        () -> new SecurityApi(apiClient).v1CompanycertDeletePost("ABC123", null));
  }

  /**
   * Test {@link SecurityApi#v1CompanycertDeletePostWithHttpInfo(String, StringId)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityApi#v1CompanycertDeletePostWithHttpInfo(String, StringId)}
   */
  @Test
  @DisplayName(
      "Test v1CompanycertDeletePostWithHttpInfo(String, StringId); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse SecurityApi.v1CompanycertDeletePostWithHttpInfo(String, StringId)"
  })
  void testV1CompanycertDeletePostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    SecurityApi securityApi = new SecurityApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> securityApi.v1CompanycertDeletePostWithHttpInfo(null, new StringId()));
  }

  /**
   * Test {@link SecurityApi#v1CompanycertDeletePostWithHttpInfo(String, StringId)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityApi#v1CompanycertDeletePostWithHttpInfo(String, StringId)}
   */
  @Test
  @DisplayName(
      "Test v1CompanycertDeletePostWithHttpInfo(String, StringId); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse SecurityApi.v1CompanycertDeletePostWithHttpInfo(String, StringId)"
  })
  void testV1CompanycertDeletePostWithHttpInfo_thenThrowApiException2() throws ApiException {
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
            new SecurityApi(apiClient)
                .v1CompanycertDeletePostWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link SecurityApi#v1CompanycertFingerPrintGetGet(String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityApi#v1CompanycertFingerPrintGetGet(String, String)}
   */
  @Test
  @DisplayName("Test v1CompanycertFingerPrintGetGet(String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CompanyCertDetail SecurityApi.v1CompanycertFingerPrintGetGet(String, String)"
  })
  void testV1CompanycertFingerPrintGetGet_thenThrowApiException() throws ApiException {
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
            new SecurityApi(apiClient)
                .v1CompanycertFingerPrintGetGet(
                    "b6:03:0e:39:97:9e:d0:e7:24:ce:a3:77:3e:01:42:09", null));
  }

  /**
   * Test {@link SecurityApi#v1CompanycertFingerPrintGetGet(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityApi#v1CompanycertFingerPrintGetGet(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1CompanycertFingerPrintGetGet(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CompanyCertDetail SecurityApi.v1CompanycertFingerPrintGetGet(String, String)"
  })
  void testV1CompanycertFingerPrintGetGet_whenNull_thenThrowApiException() throws ApiException {
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
        () -> new SecurityApi(apiClient).v1CompanycertFingerPrintGetGet(null, "ABC123"));
  }

  /**
   * Test {@link SecurityApi#v1CompanycertFingerPrintGetGetWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityApi#v1CompanycertFingerPrintGetGetWithHttpInfo(String,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v1CompanycertFingerPrintGetGetWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse SecurityApi.v1CompanycertFingerPrintGetGetWithHttpInfo(String, String)"
  })
  void testV1CompanycertFingerPrintGetGetWithHttpInfo_whenNull_thenThrowApiException()
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
            new SecurityApi(apiClient)
                .v1CompanycertFingerPrintGetGetWithHttpInfo(null, "https://example.org/example"));
  }

  /**
   * Test {@link SecurityApi#v1CompanycertFingerPrintGetGetWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityApi#v1CompanycertFingerPrintGetGetWithHttpInfo(String,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v1CompanycertFingerPrintGetGetWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse SecurityApi.v1CompanycertFingerPrintGetGetWithHttpInfo(String, String)"
  })
  void testV1CompanycertFingerPrintGetGetWithHttpInfo_whenNull_thenThrowApiException2()
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
            new SecurityApi(apiClient)
                .v1CompanycertFingerPrintGetGetWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link SecurityApi#v1CompanycertFingerPrintIssuedByGet(String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityApi#v1CompanycertFingerPrintIssuedByGet(String, String)}
   */
  @Test
  @DisplayName("Test v1CompanycertFingerPrintIssuedByGet(String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List SecurityApi.v1CompanycertFingerPrintIssuedByGet(String, String)"})
  void testV1CompanycertFingerPrintIssuedByGet_thenThrowApiException() throws ApiException {
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
            new SecurityApi(apiClient)
                .v1CompanycertFingerPrintIssuedByGet(
                    "b6:03:0e:39:97:9e:d0:e7:24:ce:a3:77:3e:01:42:09", null));
  }

  /**
   * Test {@link SecurityApi#v1CompanycertFingerPrintIssuedByGet(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityApi#v1CompanycertFingerPrintIssuedByGet(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1CompanycertFingerPrintIssuedByGet(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List SecurityApi.v1CompanycertFingerPrintIssuedByGet(String, String)"})
  void testV1CompanycertFingerPrintIssuedByGet_whenNull_thenThrowApiException()
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
        () -> new SecurityApi(apiClient).v1CompanycertFingerPrintIssuedByGet(null, "ABC123"));
  }

  /**
   * Test {@link SecurityApi#v1CompanycertFingerPrintIssuedByGetWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * SecurityApi#v1CompanycertFingerPrintIssuedByGetWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1CompanycertFingerPrintIssuedByGetWithHttpInfo(String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse SecurityApi.v1CompanycertFingerPrintIssuedByGetWithHttpInfo(String, String)"
  })
  void testV1CompanycertFingerPrintIssuedByGetWithHttpInfo_thenThrowApiException()
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
            new SecurityApi(apiClient)
                .v1CompanycertFingerPrintIssuedByGetWithHttpInfo(
                    null, "https://example.org/example"));
  }

  /**
   * Test {@link SecurityApi#v1CompanycertFingerPrintIssuedByGetWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * SecurityApi#v1CompanycertFingerPrintIssuedByGetWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1CompanycertFingerPrintIssuedByGetWithHttpInfo(String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse SecurityApi.v1CompanycertFingerPrintIssuedByGetWithHttpInfo(String, String)"
  })
  void testV1CompanycertFingerPrintIssuedByGetWithHttpInfo_thenThrowApiException2()
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
            new SecurityApi(apiClient)
                .v1CompanycertFingerPrintIssuedByGetWithHttpInfo(
                    "https://example.org/example", null));
  }

  /**
   * Test {@link SecurityApi#v1CompanycertFingerPrintUpdatePost(String, String,
   * CompanyCertAttributes)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityApi#v1CompanycertFingerPrintUpdatePost(String, String,
   * CompanyCertAttributes)}
   */
  @Test
  @DisplayName(
      "Test v1CompanycertFingerPrintUpdatePost(String, String, CompanyCertAttributes); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.SuccessResponse SecurityApi.v1CompanycertFingerPrintUpdatePost(String, String, CompanyCertAttributes)"
  })
  void testV1CompanycertFingerPrintUpdatePost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    SecurityApi securityApi = new SecurityApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            securityApi.v1CompanycertFingerPrintUpdatePost(
                "b6:03:0e:39:97:9e:d0:e7:24:ce:a3:77:3e:01:42:09",
                null,
                new CompanyCertAttributes()));
  }

  /**
   * Test {@link SecurityApi#v1CompanycertFingerPrintUpdatePost(String, String,
   * CompanyCertAttributes)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityApi#v1CompanycertFingerPrintUpdatePost(String, String,
   * CompanyCertAttributes)}
   */
  @Test
  @DisplayName(
      "Test v1CompanycertFingerPrintUpdatePost(String, String, CompanyCertAttributes); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.SuccessResponse SecurityApi.v1CompanycertFingerPrintUpdatePost(String, String, CompanyCertAttributes)"
  })
  void testV1CompanycertFingerPrintUpdatePost_thenThrowApiException2() throws ApiException {
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
            new SecurityApi(apiClient)
                .v1CompanycertFingerPrintUpdatePost(
                    "b6:03:0e:39:97:9e:d0:e7:24:ce:a3:77:3e:01:42:09", "ABC123", null));
  }

  /**
   * Test {@link SecurityApi#v1CompanycertFingerPrintUpdatePost(String, String,
   * CompanyCertAttributes)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityApi#v1CompanycertFingerPrintUpdatePost(String, String,
   * CompanyCertAttributes)}
   */
  @Test
  @DisplayName(
      "Test v1CompanycertFingerPrintUpdatePost(String, String, CompanyCertAttributes); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.SuccessResponse SecurityApi.v1CompanycertFingerPrintUpdatePost(String, String, CompanyCertAttributes)"
  })
  void testV1CompanycertFingerPrintUpdatePost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    SecurityApi securityApi = new SecurityApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            securityApi.v1CompanycertFingerPrintUpdatePost(
                null, "ABC123", new CompanyCertAttributes()));
  }

  /**
   * Test {@link SecurityApi#v1CompanycertFingerPrintUpdatePostWithHttpInfo(String, String,
   * CompanyCertAttributes)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityApi#v1CompanycertFingerPrintUpdatePostWithHttpInfo(String,
   * String, CompanyCertAttributes)}
   */
  @Test
  @DisplayName(
      "Test v1CompanycertFingerPrintUpdatePostWithHttpInfo(String, String, CompanyCertAttributes); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse SecurityApi.v1CompanycertFingerPrintUpdatePostWithHttpInfo(String, String, CompanyCertAttributes)"
  })
  void testV1CompanycertFingerPrintUpdatePostWithHttpInfo_thenThrowApiException()
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
    SecurityApi securityApi = new SecurityApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            securityApi.v1CompanycertFingerPrintUpdatePostWithHttpInfo(
                null, "https://example.org/example", new CompanyCertAttributes()));
  }

  /**
   * Test {@link SecurityApi#v1CompanycertFingerPrintUpdatePostWithHttpInfo(String, String,
   * CompanyCertAttributes)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityApi#v1CompanycertFingerPrintUpdatePostWithHttpInfo(String,
   * String, CompanyCertAttributes)}
   */
  @Test
  @DisplayName(
      "Test v1CompanycertFingerPrintUpdatePostWithHttpInfo(String, String, CompanyCertAttributes); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse SecurityApi.v1CompanycertFingerPrintUpdatePostWithHttpInfo(String, String, CompanyCertAttributes)"
  })
  void testV1CompanycertFingerPrintUpdatePostWithHttpInfo_thenThrowApiException2()
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
    SecurityApi securityApi = new SecurityApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            securityApi.v1CompanycertFingerPrintUpdatePostWithHttpInfo(
                "https://example.org/example", null, new CompanyCertAttributes()));
  }

  /**
   * Test {@link SecurityApi#v1CompanycertFingerPrintUpdatePostWithHttpInfo(String, String,
   * CompanyCertAttributes)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityApi#v1CompanycertFingerPrintUpdatePostWithHttpInfo(String,
   * String, CompanyCertAttributes)}
   */
  @Test
  @DisplayName(
      "Test v1CompanycertFingerPrintUpdatePostWithHttpInfo(String, String, CompanyCertAttributes); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse SecurityApi.v1CompanycertFingerPrintUpdatePostWithHttpInfo(String, String, CompanyCertAttributes)"
  })
  void testV1CompanycertFingerPrintUpdatePostWithHttpInfo_thenThrowApiException3()
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
            new SecurityApi(apiClient)
                .v1CompanycertFingerPrintUpdatePostWithHttpInfo(
                    "https://example.org/example", "https://example.org/example", null));
  }

  /**
   * Test {@link SecurityApi#v1CompanycertListGet(String, Integer, Integer)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityApi#v1CompanycertListGet(String, Integer, Integer)}
   */
  @Test
  @DisplayName("Test v1CompanycertListGet(String, Integer, Integer); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List SecurityApi.v1CompanycertListGet(String, Integer, Integer)"})
  void testV1CompanycertListGet_thenThrowApiException() throws ApiException {
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
        ApiException.class, () -> new SecurityApi(apiClient).v1CompanycertListGet(null, 1, 1));
  }

  /**
   * Test {@link SecurityApi#v1CompanycertListGetWithHttpInfo(String, Integer, Integer)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityApi#v1CompanycertListGetWithHttpInfo(String, Integer,
   * Integer)}
   */
  @Test
  @DisplayName(
      "Test v1CompanycertListGetWithHttpInfo(String, Integer, Integer); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse SecurityApi.v1CompanycertListGetWithHttpInfo(String, Integer, Integer)"
  })
  void testV1CompanycertListGetWithHttpInfo_thenThrowApiException() throws ApiException {
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
        () -> new SecurityApi(apiClient).v1CompanycertListGetWithHttpInfo(null, 1, 1));
  }

  /**
   * Test {@link SecurityApi#v1CompanycertPodmanagedListGet(String, Integer, Integer)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityApi#v1CompanycertPodmanagedListGet(String, Integer,
   * Integer)}
   */
  @Test
  @DisplayName(
      "Test v1CompanycertPodmanagedListGet(String, Integer, Integer); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List SecurityApi.v1CompanycertPodmanagedListGet(String, Integer, Integer)"})
  void testV1CompanycertPodmanagedListGet_thenThrowApiException() throws ApiException {
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
        () -> new SecurityApi(apiClient).v1CompanycertPodmanagedListGet(null, 1, 1));
  }

  /**
   * Test {@link SecurityApi#v1CompanycertPodmanagedListGetWithHttpInfo(String, Integer, Integer)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityApi#v1CompanycertPodmanagedListGetWithHttpInfo(String,
   * Integer, Integer)}
   */
  @Test
  @DisplayName(
      "Test v1CompanycertPodmanagedListGetWithHttpInfo(String, Integer, Integer); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse SecurityApi.v1CompanycertPodmanagedListGetWithHttpInfo(String, Integer, Integer)"
  })
  void testV1CompanycertPodmanagedListGetWithHttpInfo_thenThrowApiException() throws ApiException {
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
        () -> new SecurityApi(apiClient).v1CompanycertPodmanagedListGetWithHttpInfo(null, 1, 1));
  }

  /**
   * Test {@link SecurityApi#v1CompanycertTypeListPost(String, Integer, Integer, List)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityApi#v1CompanycertTypeListPost(String, Integer, Integer,
   * List)}
   */
  @Test
  @DisplayName(
      "Test v1CompanycertTypeListPost(String, Integer, Integer, List); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List SecurityApi.v1CompanycertTypeListPost(String, Integer, Integer, List)"})
  void testV1CompanycertTypeListPost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    SecurityApi securityApi = new SecurityApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> securityApi.v1CompanycertTypeListPost(null, 1, 1, new ArrayList<>()));
  }

  /**
   * Test {@link SecurityApi#v1CompanycertTypeListPost(String, Integer, Integer, List)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityApi#v1CompanycertTypeListPost(String, Integer, Integer,
   * List)}
   */
  @Test
  @DisplayName(
      "Test v1CompanycertTypeListPost(String, Integer, Integer, List); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List SecurityApi.v1CompanycertTypeListPost(String, Integer, Integer, List)"})
  void testV1CompanycertTypeListPost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(
        ApiException.class,
        () -> new SecurityApi(null).v1CompanycertTypeListPost("ABC123", 1, 1, null));
  }

  /**
   * Test {@link SecurityApi#v1CompanycertTypeListPostWithHttpInfo(String, Integer, Integer, List)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityApi#v1CompanycertTypeListPostWithHttpInfo(String, Integer,
   * Integer, List)}
   */
  @Test
  @DisplayName(
      "Test v1CompanycertTypeListPostWithHttpInfo(String, Integer, Integer, List); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse SecurityApi.v1CompanycertTypeListPostWithHttpInfo(String, Integer, Integer, List)"
  })
  void testV1CompanycertTypeListPostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    SecurityApi securityApi = new SecurityApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> securityApi.v1CompanycertTypeListPostWithHttpInfo(null, 1, 1, new ArrayList<>()));
  }

  /**
   * Test {@link SecurityApi#v1CompanycertTypeListPostWithHttpInfo(String, Integer, Integer, List)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityApi#v1CompanycertTypeListPostWithHttpInfo(String, Integer,
   * Integer, List)}
   */
  @Test
  @DisplayName(
      "Test v1CompanycertTypeListPostWithHttpInfo(String, Integer, Integer, List); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse SecurityApi.v1CompanycertTypeListPostWithHttpInfo(String, Integer, Integer, List)"
  })
  void testV1CompanycertTypeListPostWithHttpInfo_whenNull_thenThrowApiException()
      throws ApiException {
    // Arrange, Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new SecurityApi(null)
                .v1CompanycertTypeListPostWithHttpInfo("https://example.org/example", 1, 1, null));
  }

  /**
   * Test {@link SecurityApi#v2CompanycertCreatePost(String, CompanyCert)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityApi#v2CompanycertCreatePost(String, CompanyCert)}
   */
  @Test
  @DisplayName("Test v2CompanycertCreatePost(String, CompanyCert); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CompanyCertDetail SecurityApi.v2CompanycertCreatePost(String, CompanyCert)"})
  void testV2CompanycertCreatePost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    SecurityApi securityApi = new SecurityApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class, () -> securityApi.v2CompanycertCreatePost(null, new CompanyCert()));
  }

  /**
   * Test {@link SecurityApi#v2CompanycertCreatePost(String, CompanyCert)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityApi#v2CompanycertCreatePost(String, CompanyCert)}
   */
  @Test
  @DisplayName("Test v2CompanycertCreatePost(String, CompanyCert); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CompanyCertDetail SecurityApi.v2CompanycertCreatePost(String, CompanyCert)"})
  void testV2CompanycertCreatePost_thenThrowApiException2() throws ApiException {
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
        () -> new SecurityApi(apiClient).v2CompanycertCreatePost("ABC123", null));
  }

  /**
   * Test {@link SecurityApi#v2CompanycertCreatePostWithHttpInfo(String, CompanyCert)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityApi#v2CompanycertCreatePostWithHttpInfo(String,
   * CompanyCert)}
   */
  @Test
  @DisplayName(
      "Test v2CompanycertCreatePostWithHttpInfo(String, CompanyCert); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse SecurityApi.v2CompanycertCreatePostWithHttpInfo(String, CompanyCert)"
  })
  void testV2CompanycertCreatePostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    SecurityApi securityApi = new SecurityApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> securityApi.v2CompanycertCreatePostWithHttpInfo(null, new CompanyCert()));
  }

  /**
   * Test {@link SecurityApi#v2CompanycertCreatePostWithHttpInfo(String, CompanyCert)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityApi#v2CompanycertCreatePostWithHttpInfo(String,
   * CompanyCert)}
   */
  @Test
  @DisplayName(
      "Test v2CompanycertCreatePostWithHttpInfo(String, CompanyCert); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse SecurityApi.v2CompanycertCreatePostWithHttpInfo(String, CompanyCert)"
  })
  void testV2CompanycertCreatePostWithHttpInfo_thenThrowApiException2() throws ApiException {
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
            new SecurityApi(apiClient)
                .v2CompanycertCreatePostWithHttpInfo("https://example.org/example", null));
  }
}
