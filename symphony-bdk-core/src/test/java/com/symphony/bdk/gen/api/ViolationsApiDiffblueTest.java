package com.symphony.bdk.gen.api;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import jakarta.ws.rs.client.Client;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ViolationsApiDiffblueTest {
  /**
   * Test {@link ViolationsApi#v1DlpViolationsMessageGet(Long, Long, String, Integer, String,
   * String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ViolationsApi#v1DlpViolationsMessageGet(Long, Long, String,
   * Integer, String, String)}
   */
  @Test
  @DisplayName(
      "Test v1DlpViolationsMessageGet(Long, Long, String, Integer, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V1DLPViolationMessageResponse ViolationsApi.v1DlpViolationsMessageGet(Long, Long, String, Integer, String, String)"
  })
  void testV1DlpViolationsMessageGet_thenThrowApiException() throws ApiException {
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
            new ViolationsApi(apiClient)
                .v1DlpViolationsMessageGet(null, 1L, "Next", 1, "ABC123", "ABC123"));
  }

  /**
   * Test {@link ViolationsApi#v1DlpViolationsMessageGet(Long, Long, String, Integer, String,
   * String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ViolationsApi#v1DlpViolationsMessageGet(Long, Long, String,
   * Integer, String, String)}
   */
  @Test
  @DisplayName(
      "Test v1DlpViolationsMessageGet(Long, Long, String, Integer, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V1DLPViolationMessageResponse ViolationsApi.v1DlpViolationsMessageGet(Long, Long, String, Integer, String, String)"
  })
  void testV1DlpViolationsMessageGet_thenThrowApiException2() throws ApiException {
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
            new ViolationsApi(apiClient)
                .v1DlpViolationsMessageGet(1L, 1L, "Next", 1, null, "ABC123"));
  }

  /**
   * Test {@link ViolationsApi#v1DlpViolationsMessageGetWithHttpInfo(Long, Long, String, Integer,
   * String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ViolationsApi#v1DlpViolationsMessageGetWithHttpInfo(Long, Long,
   * String, Integer, String, String)}
   */
  @Test
  @DisplayName(
      "Test v1DlpViolationsMessageGetWithHttpInfo(Long, Long, String, Integer, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ViolationsApi.v1DlpViolationsMessageGetWithHttpInfo(Long, Long, String, Integer, String, String)"
  })
  void testV1DlpViolationsMessageGetWithHttpInfo_thenThrowApiException() throws ApiException {
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
            new ViolationsApi(apiClient)
                .v1DlpViolationsMessageGetWithHttpInfo(
                    null,
                    1L,
                    "https://example.org/example",
                    1,
                    "https://example.org/example",
                    "https://example.org/example"));
  }

  /**
   * Test {@link ViolationsApi#v1DlpViolationsMessageGetWithHttpInfo(Long, Long, String, Integer,
   * String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ViolationsApi#v1DlpViolationsMessageGetWithHttpInfo(Long, Long,
   * String, Integer, String, String)}
   */
  @Test
  @DisplayName(
      "Test v1DlpViolationsMessageGetWithHttpInfo(Long, Long, String, Integer, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ViolationsApi.v1DlpViolationsMessageGetWithHttpInfo(Long, Long, String, Integer, String, String)"
  })
  void testV1DlpViolationsMessageGetWithHttpInfo_thenThrowApiException2() throws ApiException {
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
            new ViolationsApi(apiClient)
                .v1DlpViolationsMessageGetWithHttpInfo(
                    1L, 1L, "https://example.org/example", 1, null, "https://example.org/example"));
  }

  /**
   * Test {@link ViolationsApi#v1DlpViolationsSignalGet(Long, Long, String, Integer, String,
   * String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ViolationsApi#v1DlpViolationsSignalGet(Long, Long, String,
   * Integer, String, String)}
   */
  @Test
  @DisplayName(
      "Test v1DlpViolationsSignalGet(Long, Long, String, Integer, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V1DLPViolationSignalResponse ViolationsApi.v1DlpViolationsSignalGet(Long, Long, String, Integer, String, String)"
  })
  void testV1DlpViolationsSignalGet_thenThrowApiException() throws ApiException {
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
            new ViolationsApi(apiClient)
                .v1DlpViolationsSignalGet(null, 1L, "Next", 1, "ABC123", "ABC123"));
  }

  /**
   * Test {@link ViolationsApi#v1DlpViolationsSignalGet(Long, Long, String, Integer, String,
   * String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ViolationsApi#v1DlpViolationsSignalGet(Long, Long, String,
   * Integer, String, String)}
   */
  @Test
  @DisplayName(
      "Test v1DlpViolationsSignalGet(Long, Long, String, Integer, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V1DLPViolationSignalResponse ViolationsApi.v1DlpViolationsSignalGet(Long, Long, String, Integer, String, String)"
  })
  void testV1DlpViolationsSignalGet_thenThrowApiException2() throws ApiException {
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
            new ViolationsApi(apiClient)
                .v1DlpViolationsSignalGet(1L, 1L, "Next", 1, null, "ABC123"));
  }

  /**
   * Test {@link ViolationsApi#v1DlpViolationsSignalGetWithHttpInfo(Long, Long, String, Integer,
   * String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ViolationsApi#v1DlpViolationsSignalGetWithHttpInfo(Long, Long,
   * String, Integer, String, String)}
   */
  @Test
  @DisplayName(
      "Test v1DlpViolationsSignalGetWithHttpInfo(Long, Long, String, Integer, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ViolationsApi.v1DlpViolationsSignalGetWithHttpInfo(Long, Long, String, Integer, String, String)"
  })
  void testV1DlpViolationsSignalGetWithHttpInfo_thenThrowApiException() throws ApiException {
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
            new ViolationsApi(apiClient)
                .v1DlpViolationsSignalGetWithHttpInfo(
                    null,
                    1L,
                    "https://example.org/example",
                    1,
                    "https://example.org/example",
                    "https://example.org/example"));
  }

  /**
   * Test {@link ViolationsApi#v1DlpViolationsSignalGetWithHttpInfo(Long, Long, String, Integer,
   * String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ViolationsApi#v1DlpViolationsSignalGetWithHttpInfo(Long, Long,
   * String, Integer, String, String)}
   */
  @Test
  @DisplayName(
      "Test v1DlpViolationsSignalGetWithHttpInfo(Long, Long, String, Integer, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ViolationsApi.v1DlpViolationsSignalGetWithHttpInfo(Long, Long, String, Integer, String, String)"
  })
  void testV1DlpViolationsSignalGetWithHttpInfo_thenThrowApiException2() throws ApiException {
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
            new ViolationsApi(apiClient)
                .v1DlpViolationsSignalGetWithHttpInfo(
                    1L, 1L, "https://example.org/example", 1, null, "https://example.org/example"));
  }

  /**
   * Test {@link ViolationsApi#v1DlpViolationsStreamGet(Long, Long, String, Integer, String,
   * String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ViolationsApi#v1DlpViolationsStreamGet(Long, Long, String,
   * Integer, String, String)}
   */
  @Test
  @DisplayName(
      "Test v1DlpViolationsStreamGet(Long, Long, String, Integer, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V1DLPViolationStreamResponse ViolationsApi.v1DlpViolationsStreamGet(Long, Long, String, Integer, String, String)"
  })
  void testV1DlpViolationsStreamGet_thenThrowApiException() throws ApiException {
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
            new ViolationsApi(apiClient)
                .v1DlpViolationsStreamGet(null, 1L, "Next", 1, "ABC123", "ABC123"));
  }

  /**
   * Test {@link ViolationsApi#v1DlpViolationsStreamGet(Long, Long, String, Integer, String,
   * String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ViolationsApi#v1DlpViolationsStreamGet(Long, Long, String,
   * Integer, String, String)}
   */
  @Test
  @DisplayName(
      "Test v1DlpViolationsStreamGet(Long, Long, String, Integer, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V1DLPViolationStreamResponse ViolationsApi.v1DlpViolationsStreamGet(Long, Long, String, Integer, String, String)"
  })
  void testV1DlpViolationsStreamGet_thenThrowApiException2() throws ApiException {
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
            new ViolationsApi(apiClient)
                .v1DlpViolationsStreamGet(1L, 1L, "Next", 1, null, "ABC123"));
  }

  /**
   * Test {@link ViolationsApi#v1DlpViolationsStreamGetWithHttpInfo(Long, Long, String, Integer,
   * String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ViolationsApi#v1DlpViolationsStreamGetWithHttpInfo(Long, Long,
   * String, Integer, String, String)}
   */
  @Test
  @DisplayName(
      "Test v1DlpViolationsStreamGetWithHttpInfo(Long, Long, String, Integer, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ViolationsApi.v1DlpViolationsStreamGetWithHttpInfo(Long, Long, String, Integer, String, String)"
  })
  void testV1DlpViolationsStreamGetWithHttpInfo_thenThrowApiException() throws ApiException {
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
            new ViolationsApi(apiClient)
                .v1DlpViolationsStreamGetWithHttpInfo(
                    null,
                    1L,
                    "https://example.org/example",
                    1,
                    "https://example.org/example",
                    "https://example.org/example"));
  }

  /**
   * Test {@link ViolationsApi#v1DlpViolationsStreamGetWithHttpInfo(Long, Long, String, Integer,
   * String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ViolationsApi#v1DlpViolationsStreamGetWithHttpInfo(Long, Long,
   * String, Integer, String, String)}
   */
  @Test
  @DisplayName(
      "Test v1DlpViolationsStreamGetWithHttpInfo(Long, Long, String, Integer, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ViolationsApi.v1DlpViolationsStreamGetWithHttpInfo(Long, Long, String, Integer, String, String)"
  })
  void testV1DlpViolationsStreamGetWithHttpInfo_thenThrowApiException2() throws ApiException {
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
            new ViolationsApi(apiClient)
                .v1DlpViolationsStreamGetWithHttpInfo(
                    1L, 1L, "https://example.org/example", 1, null, "https://example.org/example"));
  }

  /**
   * Test {@link ViolationsApi#v3DlpViolationAttachmentGet(String, String, String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ViolationsApi#v3DlpViolationAttachmentGet(String, String, String,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v3DlpViolationAttachmentGet(String, String, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "byte[] ViolationsApi.v3DlpViolationAttachmentGet(String, String, String, String)"
  })
  void testV3DlpViolationAttachmentGet_thenThrowApiException() throws ApiException {
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
            new ViolationsApi(apiClient)
                .v3DlpViolationAttachmentGet(null, "42", "ABC123", "ABC123"));
  }

  /**
   * Test {@link ViolationsApi#v3DlpViolationAttachmentGet(String, String, String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ViolationsApi#v3DlpViolationAttachmentGet(String, String, String,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v3DlpViolationAttachmentGet(String, String, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "byte[] ViolationsApi.v3DlpViolationAttachmentGet(String, String, String, String)"
  })
  void testV3DlpViolationAttachmentGet_thenThrowApiException2() throws ApiException {
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
            new ViolationsApi(apiClient)
                .v3DlpViolationAttachmentGet("42", null, "ABC123", "ABC123"));
  }

  /**
   * Test {@link ViolationsApi#v3DlpViolationAttachmentGet(String, String, String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ViolationsApi#v3DlpViolationAttachmentGet(String, String, String,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v3DlpViolationAttachmentGet(String, String, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "byte[] ViolationsApi.v3DlpViolationAttachmentGet(String, String, String, String)"
  })
  void testV3DlpViolationAttachmentGet_thenThrowApiException3() throws ApiException {
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
        () -> new ViolationsApi(apiClient).v3DlpViolationAttachmentGet("42", "42", null, "ABC123"));
  }

  /**
   * Test {@link ViolationsApi#v3DlpViolationAttachmentGetWithHttpInfo(String, String, String,
   * String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ViolationsApi#v3DlpViolationAttachmentGetWithHttpInfo(String,
   * String, String, String)}
   */
  @Test
  @DisplayName(
      "Test v3DlpViolationAttachmentGetWithHttpInfo(String, String, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ViolationsApi.v3DlpViolationAttachmentGetWithHttpInfo(String, String, String, String)"
  })
  void testV3DlpViolationAttachmentGetWithHttpInfo_thenThrowApiException() throws ApiException {
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
            new ViolationsApi(apiClient)
                .v3DlpViolationAttachmentGetWithHttpInfo(
                    null,
                    "https://example.org/example",
                    "https://example.org/example",
                    "https://example.org/example"));
  }

  /**
   * Test {@link ViolationsApi#v3DlpViolationAttachmentGetWithHttpInfo(String, String, String,
   * String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ViolationsApi#v3DlpViolationAttachmentGetWithHttpInfo(String,
   * String, String, String)}
   */
  @Test
  @DisplayName(
      "Test v3DlpViolationAttachmentGetWithHttpInfo(String, String, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ViolationsApi.v3DlpViolationAttachmentGetWithHttpInfo(String, String, String, String)"
  })
  void testV3DlpViolationAttachmentGetWithHttpInfo_thenThrowApiException2() throws ApiException {
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
            new ViolationsApi(apiClient)
                .v3DlpViolationAttachmentGetWithHttpInfo(
                    "https://example.org/example",
                    null,
                    "https://example.org/example",
                    "https://example.org/example"));
  }

  /**
   * Test {@link ViolationsApi#v3DlpViolationAttachmentGetWithHttpInfo(String, String, String,
   * String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ViolationsApi#v3DlpViolationAttachmentGetWithHttpInfo(String,
   * String, String, String)}
   */
  @Test
  @DisplayName(
      "Test v3DlpViolationAttachmentGetWithHttpInfo(String, String, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ViolationsApi.v3DlpViolationAttachmentGetWithHttpInfo(String, String, String, String)"
  })
  void testV3DlpViolationAttachmentGetWithHttpInfo_thenThrowApiException3() throws ApiException {
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
            new ViolationsApi(apiClient)
                .v3DlpViolationAttachmentGetWithHttpInfo(
                    "https://example.org/example",
                    "https://example.org/example",
                    null,
                    "https://example.org/example"));
  }

  /**
   * Test {@link ViolationsApi#v3DlpViolationsMessageGet(Long, Long, String, Integer, String,
   * String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ViolationsApi#v3DlpViolationsMessageGet(Long, Long, String,
   * Integer, String, String)}
   */
  @Test
  @DisplayName(
      "Test v3DlpViolationsMessageGet(Long, Long, String, Integer, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V3DLPViolationMessageResponse ViolationsApi.v3DlpViolationsMessageGet(Long, Long, String, Integer, String, String)"
  })
  void testV3DlpViolationsMessageGet_thenThrowApiException() throws ApiException {
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
            new ViolationsApi(apiClient)
                .v3DlpViolationsMessageGet(null, 1L, "Next", 1, "ABC123", "ABC123"));
  }

  /**
   * Test {@link ViolationsApi#v3DlpViolationsMessageGet(Long, Long, String, Integer, String,
   * String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ViolationsApi#v3DlpViolationsMessageGet(Long, Long, String,
   * Integer, String, String)}
   */
  @Test
  @DisplayName(
      "Test v3DlpViolationsMessageGet(Long, Long, String, Integer, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V3DLPViolationMessageResponse ViolationsApi.v3DlpViolationsMessageGet(Long, Long, String, Integer, String, String)"
  })
  void testV3DlpViolationsMessageGet_thenThrowApiException2() throws ApiException {
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
            new ViolationsApi(apiClient)
                .v3DlpViolationsMessageGet(1L, 1L, "Next", 1, null, "ABC123"));
  }

  /**
   * Test {@link ViolationsApi#v3DlpViolationsMessageGetWithHttpInfo(Long, Long, String, Integer,
   * String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ViolationsApi#v3DlpViolationsMessageGetWithHttpInfo(Long, Long,
   * String, Integer, String, String)}
   */
  @Test
  @DisplayName(
      "Test v3DlpViolationsMessageGetWithHttpInfo(Long, Long, String, Integer, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ViolationsApi.v3DlpViolationsMessageGetWithHttpInfo(Long, Long, String, Integer, String, String)"
  })
  void testV3DlpViolationsMessageGetWithHttpInfo_thenThrowApiException() throws ApiException {
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
            new ViolationsApi(apiClient)
                .v3DlpViolationsMessageGetWithHttpInfo(
                    null,
                    1L,
                    "https://example.org/example",
                    1,
                    "https://example.org/example",
                    "https://example.org/example"));
  }

  /**
   * Test {@link ViolationsApi#v3DlpViolationsMessageGetWithHttpInfo(Long, Long, String, Integer,
   * String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ViolationsApi#v3DlpViolationsMessageGetWithHttpInfo(Long, Long,
   * String, Integer, String, String)}
   */
  @Test
  @DisplayName(
      "Test v3DlpViolationsMessageGetWithHttpInfo(Long, Long, String, Integer, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ViolationsApi.v3DlpViolationsMessageGetWithHttpInfo(Long, Long, String, Integer, String, String)"
  })
  void testV3DlpViolationsMessageGetWithHttpInfo_thenThrowApiException2() throws ApiException {
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
            new ViolationsApi(apiClient)
                .v3DlpViolationsMessageGetWithHttpInfo(
                    1L, 1L, "https://example.org/example", 1, null, "https://example.org/example"));
  }

  /**
   * Test {@link ViolationsApi#v3DlpViolationsSignalGet(Long, Long, String, Integer, String,
   * String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ViolationsApi#v3DlpViolationsSignalGet(Long, Long, String,
   * Integer, String, String)}
   */
  @Test
  @DisplayName(
      "Test v3DlpViolationsSignalGet(Long, Long, String, Integer, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V3DLPViolationSignalResponse ViolationsApi.v3DlpViolationsSignalGet(Long, Long, String, Integer, String, String)"
  })
  void testV3DlpViolationsSignalGet_thenThrowApiException() throws ApiException {
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
            new ViolationsApi(apiClient)
                .v3DlpViolationsSignalGet(null, 1L, "Next", 1, "ABC123", "ABC123"));
  }

  /**
   * Test {@link ViolationsApi#v3DlpViolationsSignalGet(Long, Long, String, Integer, String,
   * String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ViolationsApi#v3DlpViolationsSignalGet(Long, Long, String,
   * Integer, String, String)}
   */
  @Test
  @DisplayName(
      "Test v3DlpViolationsSignalGet(Long, Long, String, Integer, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V3DLPViolationSignalResponse ViolationsApi.v3DlpViolationsSignalGet(Long, Long, String, Integer, String, String)"
  })
  void testV3DlpViolationsSignalGet_thenThrowApiException2() throws ApiException {
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
            new ViolationsApi(apiClient)
                .v3DlpViolationsSignalGet(1L, 1L, "Next", 1, null, "ABC123"));
  }

  /**
   * Test {@link ViolationsApi#v3DlpViolationsSignalGetWithHttpInfo(Long, Long, String, Integer,
   * String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ViolationsApi#v3DlpViolationsSignalGetWithHttpInfo(Long, Long,
   * String, Integer, String, String)}
   */
  @Test
  @DisplayName(
      "Test v3DlpViolationsSignalGetWithHttpInfo(Long, Long, String, Integer, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ViolationsApi.v3DlpViolationsSignalGetWithHttpInfo(Long, Long, String, Integer, String, String)"
  })
  void testV3DlpViolationsSignalGetWithHttpInfo_thenThrowApiException() throws ApiException {
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
            new ViolationsApi(apiClient)
                .v3DlpViolationsSignalGetWithHttpInfo(
                    null,
                    1L,
                    "https://example.org/example",
                    1,
                    "https://example.org/example",
                    "https://example.org/example"));
  }

  /**
   * Test {@link ViolationsApi#v3DlpViolationsSignalGetWithHttpInfo(Long, Long, String, Integer,
   * String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ViolationsApi#v3DlpViolationsSignalGetWithHttpInfo(Long, Long,
   * String, Integer, String, String)}
   */
  @Test
  @DisplayName(
      "Test v3DlpViolationsSignalGetWithHttpInfo(Long, Long, String, Integer, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ViolationsApi.v3DlpViolationsSignalGetWithHttpInfo(Long, Long, String, Integer, String, String)"
  })
  void testV3DlpViolationsSignalGetWithHttpInfo_thenThrowApiException2() throws ApiException {
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
            new ViolationsApi(apiClient)
                .v3DlpViolationsSignalGetWithHttpInfo(
                    1L, 1L, "https://example.org/example", 1, null, "https://example.org/example"));
  }

  /**
   * Test {@link ViolationsApi#v3DlpViolationsStreamGet(Long, Long, String, Integer, String,
   * String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ViolationsApi#v3DlpViolationsStreamGet(Long, Long, String,
   * Integer, String, String)}
   */
  @Test
  @DisplayName(
      "Test v3DlpViolationsStreamGet(Long, Long, String, Integer, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V3DLPViolationStreamResponse ViolationsApi.v3DlpViolationsStreamGet(Long, Long, String, Integer, String, String)"
  })
  void testV3DlpViolationsStreamGet_thenThrowApiException() throws ApiException {
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
            new ViolationsApi(apiClient)
                .v3DlpViolationsStreamGet(null, 1L, "Next", 1, "ABC123", "ABC123"));
  }

  /**
   * Test {@link ViolationsApi#v3DlpViolationsStreamGet(Long, Long, String, Integer, String,
   * String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ViolationsApi#v3DlpViolationsStreamGet(Long, Long, String,
   * Integer, String, String)}
   */
  @Test
  @DisplayName(
      "Test v3DlpViolationsStreamGet(Long, Long, String, Integer, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V3DLPViolationStreamResponse ViolationsApi.v3DlpViolationsStreamGet(Long, Long, String, Integer, String, String)"
  })
  void testV3DlpViolationsStreamGet_thenThrowApiException2() throws ApiException {
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
            new ViolationsApi(apiClient)
                .v3DlpViolationsStreamGet(1L, 1L, "Next", 1, null, "ABC123"));
  }

  /**
   * Test {@link ViolationsApi#v3DlpViolationsStreamGetWithHttpInfo(Long, Long, String, Integer,
   * String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ViolationsApi#v3DlpViolationsStreamGetWithHttpInfo(Long, Long,
   * String, Integer, String, String)}
   */
  @Test
  @DisplayName(
      "Test v3DlpViolationsStreamGetWithHttpInfo(Long, Long, String, Integer, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ViolationsApi.v3DlpViolationsStreamGetWithHttpInfo(Long, Long, String, Integer, String, String)"
  })
  void testV3DlpViolationsStreamGetWithHttpInfo_thenThrowApiException() throws ApiException {
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
            new ViolationsApi(apiClient)
                .v3DlpViolationsStreamGetWithHttpInfo(
                    null,
                    1L,
                    "https://example.org/example",
                    1,
                    "https://example.org/example",
                    "https://example.org/example"));
  }

  /**
   * Test {@link ViolationsApi#v3DlpViolationsStreamGetWithHttpInfo(Long, Long, String, Integer,
   * String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ViolationsApi#v3DlpViolationsStreamGetWithHttpInfo(Long, Long,
   * String, Integer, String, String)}
   */
  @Test
  @DisplayName(
      "Test v3DlpViolationsStreamGetWithHttpInfo(Long, Long, String, Integer, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse ViolationsApi.v3DlpViolationsStreamGetWithHttpInfo(Long, Long, String, Integer, String, String)"
  })
  void testV3DlpViolationsStreamGetWithHttpInfo_thenThrowApiException2() throws ApiException {
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
            new ViolationsApi(apiClient)
                .v3DlpViolationsStreamGetWithHttpInfo(
                    1L, 1L, "https://example.org/example", 1, null, "https://example.org/example"));
  }
}
