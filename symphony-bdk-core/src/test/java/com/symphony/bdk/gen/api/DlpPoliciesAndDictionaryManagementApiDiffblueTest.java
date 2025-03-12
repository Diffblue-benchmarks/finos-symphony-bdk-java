package com.symphony.bdk.gen.api;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.V1DLPDictionaryMetadataCreateRequest;
import com.symphony.bdk.gen.api.model.V1DLPDictionaryMetadataUpdateRequest;
import com.symphony.bdk.gen.api.model.V1DLPPolicyRequest;
import com.symphony.bdk.gen.api.model.V3DLPPolicyRequest;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import jakarta.ws.rs.client.Client;
import java.io.File;
import java.nio.file.Paths;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DlpPoliciesAndDictionaryManagementApiDiffblueTest {
  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesDictIdDataDownloadGet(String, String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesDictIdDataDownloadGet(String, String, String, String)}
   */
  @Test
  @DisplayName("Test v1DlpDictionariesDictIdDataDownloadGet(String, String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "byte[] DlpPoliciesAndDictionaryManagementApi.v1DlpDictionariesDictIdDataDownloadGet(String, String, String, String)"})
  void testV1DlpDictionariesDictIdDataDownloadGet_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpDictionariesDictIdDataDownloadGet("ABC123", null, null, "1.0.2"));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesDictIdDataDownloadGet(String, String, String, String)}.
   * <ul>
   *   <li>When {@code 42}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesDictIdDataDownloadGet(String, String, String, String)}
   */
  @Test
  @DisplayName("Test v1DlpDictionariesDictIdDataDownloadGet(String, String, String, String); when '42'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "byte[] DlpPoliciesAndDictionaryManagementApi.v1DlpDictionariesDictIdDataDownloadGet(String, String, String, String)"})
  void testV1DlpDictionariesDictIdDataDownloadGet_when42_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpDictionariesDictIdDataDownloadGet(null, "ABC123", "42", "1.0.2"));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesDictIdDataDownloadGetWithHttpInfo(String, String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesDictIdDataDownloadGetWithHttpInfo(String, String, String, String)}
   */
  @Test
  @DisplayName("Test v1DlpDictionariesDictIdDataDownloadGetWithHttpInfo(String, String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse DlpPoliciesAndDictionaryManagementApi.v1DlpDictionariesDictIdDataDownloadGetWithHttpInfo(String, String, String, String)"})
  void testV1DlpDictionariesDictIdDataDownloadGetWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpDictionariesDictIdDataDownloadGetWithHttpInfo(null, "https://example.org/example",
                "https://example.org/example", "https://example.org/example"));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesDictIdDataDownloadGetWithHttpInfo(String, String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesDictIdDataDownloadGetWithHttpInfo(String, String, String, String)}
   */
  @Test
  @DisplayName("Test v1DlpDictionariesDictIdDataDownloadGetWithHttpInfo(String, String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse DlpPoliciesAndDictionaryManagementApi.v1DlpDictionariesDictIdDataDownloadGetWithHttpInfo(String, String, String, String)"})
  void testV1DlpDictionariesDictIdDataDownloadGetWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpDictionariesDictIdDataDownloadGetWithHttpInfo("https://example.org/example", null, null,
                "https://example.org/example"));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesDictIdDataUploadPost(String, String, String, File)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesDictIdDataUploadPost(String, String, String, File)}
   */
  @Test
  @DisplayName("Test v1DlpDictionariesDictIdDataUploadPost(String, String, String, File); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V1DLPDictionaryMetadataResponse DlpPoliciesAndDictionaryManagementApi.v1DlpDictionariesDictIdDataUploadPost(String, String, String, File)"})
  void testV1DlpDictionariesDictIdDataUploadPost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    DlpPoliciesAndDictionaryManagementApi dlpPoliciesAndDictionaryManagementApi = new DlpPoliciesAndDictionaryManagementApi(
        new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> dlpPoliciesAndDictionaryManagementApi.v1DlpDictionariesDictIdDataUploadPost(null, "ABC123", "42",
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile()));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesDictIdDataUploadPostWithHttpInfo(String, String, String, File)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesDictIdDataUploadPostWithHttpInfo(String, String, String, File)}
   */
  @Test
  @DisplayName("Test v1DlpDictionariesDictIdDataUploadPostWithHttpInfo(String, String, String, File); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse DlpPoliciesAndDictionaryManagementApi.v1DlpDictionariesDictIdDataUploadPostWithHttpInfo(String, String, String, File)"})
  void testV1DlpDictionariesDictIdDataUploadPostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    DlpPoliciesAndDictionaryManagementApi dlpPoliciesAndDictionaryManagementApi = new DlpPoliciesAndDictionaryManagementApi(
        new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> dlpPoliciesAndDictionaryManagementApi.v1DlpDictionariesDictIdDataUploadPostWithHttpInfo(null,
            "https://example.org/example", "https://example.org/example",
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile()));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesDictIdDelete(String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesDictIdDelete(String, String, String)}
   */
  @Test
  @DisplayName("Test v1DlpDictionariesDictIdDelete(String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V1DLPDictionaryMetadataResponse DlpPoliciesAndDictionaryManagementApi.v1DlpDictionariesDictIdDelete(String, String, String)"})
  void testV1DlpDictionariesDictIdDelete_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpDictionariesDictIdDelete("ABC123", null, null));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesDictIdDelete(String, String, String)}.
   * <ul>
   *   <li>When {@code 42}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesDictIdDelete(String, String, String)}
   */
  @Test
  @DisplayName("Test v1DlpDictionariesDictIdDelete(String, String, String); when '42'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V1DLPDictionaryMetadataResponse DlpPoliciesAndDictionaryManagementApi.v1DlpDictionariesDictIdDelete(String, String, String)"})
  void testV1DlpDictionariesDictIdDelete_when42_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpDictionariesDictIdDelete(null, "ABC123", "42"));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesDictIdDeleteWithHttpInfo(String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesDictIdDeleteWithHttpInfo(String, String, String)}
   */
  @Test
  @DisplayName("Test v1DlpDictionariesDictIdDeleteWithHttpInfo(String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse DlpPoliciesAndDictionaryManagementApi.v1DlpDictionariesDictIdDeleteWithHttpInfo(String, String, String)"})
  void testV1DlpDictionariesDictIdDeleteWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpDictionariesDictIdDeleteWithHttpInfo(null, "https://example.org/example",
                "https://example.org/example"));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesDictIdDeleteWithHttpInfo(String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesDictIdDeleteWithHttpInfo(String, String, String)}
   */
  @Test
  @DisplayName("Test v1DlpDictionariesDictIdDeleteWithHttpInfo(String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse DlpPoliciesAndDictionaryManagementApi.v1DlpDictionariesDictIdDeleteWithHttpInfo(String, String, String)"})
  void testV1DlpDictionariesDictIdDeleteWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpDictionariesDictIdDeleteWithHttpInfo("https://example.org/example", null, null));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesDictIdGet(String, String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesDictIdGet(String, String, String, String)}
   */
  @Test
  @DisplayName("Test v1DlpDictionariesDictIdGet(String, String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V1DLPDictionaryMetadataResponse DlpPoliciesAndDictionaryManagementApi.v1DlpDictionariesDictIdGet(String, String, String, String)"})
  void testV1DlpDictionariesDictIdGet_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpDictionariesDictIdGet("ABC123", null, null, "1.0.2"));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesDictIdGet(String, String, String, String)}.
   * <ul>
   *   <li>When {@code 42}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesDictIdGet(String, String, String, String)}
   */
  @Test
  @DisplayName("Test v1DlpDictionariesDictIdGet(String, String, String, String); when '42'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V1DLPDictionaryMetadataResponse DlpPoliciesAndDictionaryManagementApi.v1DlpDictionariesDictIdGet(String, String, String, String)"})
  void testV1DlpDictionariesDictIdGet_when42_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpDictionariesDictIdGet(null, "ABC123", "42", "1.0.2"));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesDictIdGetWithHttpInfo(String, String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesDictIdGetWithHttpInfo(String, String, String, String)}
   */
  @Test
  @DisplayName("Test v1DlpDictionariesDictIdGetWithHttpInfo(String, String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse DlpPoliciesAndDictionaryManagementApi.v1DlpDictionariesDictIdGetWithHttpInfo(String, String, String, String)"})
  void testV1DlpDictionariesDictIdGetWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpDictionariesDictIdGetWithHttpInfo(null, "https://example.org/example", "https://example.org/example",
                "https://example.org/example"));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesDictIdGetWithHttpInfo(String, String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesDictIdGetWithHttpInfo(String, String, String, String)}
   */
  @Test
  @DisplayName("Test v1DlpDictionariesDictIdGetWithHttpInfo(String, String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse DlpPoliciesAndDictionaryManagementApi.v1DlpDictionariesDictIdGetWithHttpInfo(String, String, String, String)"})
  void testV1DlpDictionariesDictIdGetWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpDictionariesDictIdGetWithHttpInfo("https://example.org/example", null, null,
                "https://example.org/example"));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesDictIdPut(String, String, String, V1DLPDictionaryMetadataUpdateRequest)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesDictIdPut(String, String, String, V1DLPDictionaryMetadataUpdateRequest)}
   */
  @Test
  @DisplayName("Test v1DlpDictionariesDictIdPut(String, String, String, V1DLPDictionaryMetadataUpdateRequest); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V1DLPDictionaryMetadataResponse DlpPoliciesAndDictionaryManagementApi.v1DlpDictionariesDictIdPut(String, String, String, V1DLPDictionaryMetadataUpdateRequest)"})
  void testV1DlpDictionariesDictIdPut_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    DlpPoliciesAndDictionaryManagementApi dlpPoliciesAndDictionaryManagementApi = new DlpPoliciesAndDictionaryManagementApi(
        new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> dlpPoliciesAndDictionaryManagementApi.v1DlpDictionariesDictIdPut(null,
        "ABC123", "42", new V1DLPDictionaryMetadataUpdateRequest()));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesDictIdPutWithHttpInfo(String, String, String, V1DLPDictionaryMetadataUpdateRequest)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesDictIdPutWithHttpInfo(String, String, String, V1DLPDictionaryMetadataUpdateRequest)}
   */
  @Test
  @DisplayName("Test v1DlpDictionariesDictIdPutWithHttpInfo(String, String, String, V1DLPDictionaryMetadataUpdateRequest); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse DlpPoliciesAndDictionaryManagementApi.v1DlpDictionariesDictIdPutWithHttpInfo(String, String, String, V1DLPDictionaryMetadataUpdateRequest)"})
  void testV1DlpDictionariesDictIdPutWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    DlpPoliciesAndDictionaryManagementApi dlpPoliciesAndDictionaryManagementApi = new DlpPoliciesAndDictionaryManagementApi(
        new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> dlpPoliciesAndDictionaryManagementApi.v1DlpDictionariesDictIdPutWithHttpInfo(null,
            "https://example.org/example", "https://example.org/example", new V1DLPDictionaryMetadataUpdateRequest()));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesGet(String, String, Integer, Integer)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesGet(String, String, Integer, Integer)}
   */
  @Test
  @DisplayName("Test v1DlpDictionariesGet(String, String, Integer, Integer); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V1DLPDictionaryMetadataCollectionResponse DlpPoliciesAndDictionaryManagementApi.v1DlpDictionariesGet(String, String, Integer, Integer)"})
  void testV1DlpDictionariesGet_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpDictionariesGet(null, "ABC123", 1, 1));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesGetWithHttpInfo(String, String, Integer, Integer)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesGetWithHttpInfo(String, String, Integer, Integer)}
   */
  @Test
  @DisplayName("Test v1DlpDictionariesGetWithHttpInfo(String, String, Integer, Integer); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse DlpPoliciesAndDictionaryManagementApi.v1DlpDictionariesGetWithHttpInfo(String, String, Integer, Integer)"})
  void testV1DlpDictionariesGetWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpDictionariesGetWithHttpInfo(null, "https://example.org/example", 1, 1));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesPost(String, String, V1DLPDictionaryMetadataCreateRequest)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesPost(String, String, V1DLPDictionaryMetadataCreateRequest)}
   */
  @Test
  @DisplayName("Test v1DlpDictionariesPost(String, String, V1DLPDictionaryMetadataCreateRequest); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V1DLPDictionaryMetadataResponse DlpPoliciesAndDictionaryManagementApi.v1DlpDictionariesPost(String, String, V1DLPDictionaryMetadataCreateRequest)"})
  void testV1DlpDictionariesPost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    DlpPoliciesAndDictionaryManagementApi dlpPoliciesAndDictionaryManagementApi = new DlpPoliciesAndDictionaryManagementApi(
        new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> dlpPoliciesAndDictionaryManagementApi.v1DlpDictionariesPost(null, "ABC123",
        new V1DLPDictionaryMetadataCreateRequest()));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesPost(String, String, V1DLPDictionaryMetadataCreateRequest)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesPost(String, String, V1DLPDictionaryMetadataCreateRequest)}
   */
  @Test
  @DisplayName("Test v1DlpDictionariesPost(String, String, V1DLPDictionaryMetadataCreateRequest); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V1DLPDictionaryMetadataResponse DlpPoliciesAndDictionaryManagementApi.v1DlpDictionariesPost(String, String, V1DLPDictionaryMetadataCreateRequest)"})
  void testV1DlpDictionariesPost_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpDictionariesPost("ABC123", null, null));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesPostWithHttpInfo(String, String, V1DLPDictionaryMetadataCreateRequest)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesPostWithHttpInfo(String, String, V1DLPDictionaryMetadataCreateRequest)}
   */
  @Test
  @DisplayName("Test v1DlpDictionariesPostWithHttpInfo(String, String, V1DLPDictionaryMetadataCreateRequest); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse DlpPoliciesAndDictionaryManagementApi.v1DlpDictionariesPostWithHttpInfo(String, String, V1DLPDictionaryMetadataCreateRequest)"})
  void testV1DlpDictionariesPostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    DlpPoliciesAndDictionaryManagementApi dlpPoliciesAndDictionaryManagementApi = new DlpPoliciesAndDictionaryManagementApi(
        new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> dlpPoliciesAndDictionaryManagementApi.v1DlpDictionariesPostWithHttpInfo(null,
        "https://example.org/example", new V1DLPDictionaryMetadataCreateRequest()));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesPostWithHttpInfo(String, String, V1DLPDictionaryMetadataCreateRequest)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpDictionariesPostWithHttpInfo(String, String, V1DLPDictionaryMetadataCreateRequest)}
   */
  @Test
  @DisplayName("Test v1DlpDictionariesPostWithHttpInfo(String, String, V1DLPDictionaryMetadataCreateRequest); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse DlpPoliciesAndDictionaryManagementApi.v1DlpDictionariesPostWithHttpInfo(String, String, V1DLPDictionaryMetadataCreateRequest)"})
  void testV1DlpDictionariesPostWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpDictionariesPostWithHttpInfo("https://example.org/example", null, null));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesGet(String, String, Integer, Integer)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesGet(String, String, Integer, Integer)}
   */
  @Test
  @DisplayName("Test v1DlpPoliciesGet(String, String, Integer, Integer); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V1DLPPoliciesCollectionResponse DlpPoliciesAndDictionaryManagementApi.v1DlpPoliciesGet(String, String, Integer, Integer)"})
  void testV1DlpPoliciesGet_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpPoliciesGet(null, "ABC123", 1, 1));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesGetWithHttpInfo(String, String, Integer, Integer)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesGetWithHttpInfo(String, String, Integer, Integer)}
   */
  @Test
  @DisplayName("Test v1DlpPoliciesGetWithHttpInfo(String, String, Integer, Integer); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse DlpPoliciesAndDictionaryManagementApi.v1DlpPoliciesGetWithHttpInfo(String, String, Integer, Integer)"})
  void testV1DlpPoliciesGetWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpPoliciesGetWithHttpInfo(null, "https://example.org/example", 1, 1));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdDelete(String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdDelete(String, String, String)}
   */
  @Test
  @DisplayName("Test v1DlpPoliciesPolicyIdDelete(String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V1DLPPolicyResponse DlpPoliciesAndDictionaryManagementApi.v1DlpPoliciesPolicyIdDelete(String, String, String)"})
  void testV1DlpPoliciesPolicyIdDelete_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpPoliciesPolicyIdDelete("ABC123", null, null));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdDelete(String, String, String)}.
   * <ul>
   *   <li>When {@code 42}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdDelete(String, String, String)}
   */
  @Test
  @DisplayName("Test v1DlpPoliciesPolicyIdDelete(String, String, String); when '42'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V1DLPPolicyResponse DlpPoliciesAndDictionaryManagementApi.v1DlpPoliciesPolicyIdDelete(String, String, String)"})
  void testV1DlpPoliciesPolicyIdDelete_when42_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpPoliciesPolicyIdDelete(null, "ABC123", "42"));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdDeleteWithHttpInfo(String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdDeleteWithHttpInfo(String, String, String)}
   */
  @Test
  @DisplayName("Test v1DlpPoliciesPolicyIdDeleteWithHttpInfo(String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse DlpPoliciesAndDictionaryManagementApi.v1DlpPoliciesPolicyIdDeleteWithHttpInfo(String, String, String)"})
  void testV1DlpPoliciesPolicyIdDeleteWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpPoliciesPolicyIdDeleteWithHttpInfo(null, "https://example.org/example",
                "https://example.org/example"));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdDeleteWithHttpInfo(String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdDeleteWithHttpInfo(String, String, String)}
   */
  @Test
  @DisplayName("Test v1DlpPoliciesPolicyIdDeleteWithHttpInfo(String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse DlpPoliciesAndDictionaryManagementApi.v1DlpPoliciesPolicyIdDeleteWithHttpInfo(String, String, String)"})
  void testV1DlpPoliciesPolicyIdDeleteWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpPoliciesPolicyIdDeleteWithHttpInfo("https://example.org/example", null, null));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdDisablePost(String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdDisablePost(String, String, String)}
   */
  @Test
  @DisplayName("Test v1DlpPoliciesPolicyIdDisablePost(String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V1DLPPolicyResponse DlpPoliciesAndDictionaryManagementApi.v1DlpPoliciesPolicyIdDisablePost(String, String, String)"})
  void testV1DlpPoliciesPolicyIdDisablePost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpPoliciesPolicyIdDisablePost("ABC123", null, null));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdDisablePost(String, String, String)}.
   * <ul>
   *   <li>When {@code 42}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdDisablePost(String, String, String)}
   */
  @Test
  @DisplayName("Test v1DlpPoliciesPolicyIdDisablePost(String, String, String); when '42'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V1DLPPolicyResponse DlpPoliciesAndDictionaryManagementApi.v1DlpPoliciesPolicyIdDisablePost(String, String, String)"})
  void testV1DlpPoliciesPolicyIdDisablePost_when42_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpPoliciesPolicyIdDisablePost(null, "ABC123", "42"));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdDisablePostWithHttpInfo(String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdDisablePostWithHttpInfo(String, String, String)}
   */
  @Test
  @DisplayName("Test v1DlpPoliciesPolicyIdDisablePostWithHttpInfo(String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse DlpPoliciesAndDictionaryManagementApi.v1DlpPoliciesPolicyIdDisablePostWithHttpInfo(String, String, String)"})
  void testV1DlpPoliciesPolicyIdDisablePostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpPoliciesPolicyIdDisablePostWithHttpInfo(null, "https://example.org/example",
                "https://example.org/example"));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdDisablePostWithHttpInfo(String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdDisablePostWithHttpInfo(String, String, String)}
   */
  @Test
  @DisplayName("Test v1DlpPoliciesPolicyIdDisablePostWithHttpInfo(String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse DlpPoliciesAndDictionaryManagementApi.v1DlpPoliciesPolicyIdDisablePostWithHttpInfo(String, String, String)"})
  void testV1DlpPoliciesPolicyIdDisablePostWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpPoliciesPolicyIdDisablePostWithHttpInfo("https://example.org/example", null, null));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdEnablePost(String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdEnablePost(String, String, String)}
   */
  @Test
  @DisplayName("Test v1DlpPoliciesPolicyIdEnablePost(String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V1DLPPolicyResponse DlpPoliciesAndDictionaryManagementApi.v1DlpPoliciesPolicyIdEnablePost(String, String, String)"})
  void testV1DlpPoliciesPolicyIdEnablePost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpPoliciesPolicyIdEnablePost("ABC123", null, null));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdEnablePost(String, String, String)}.
   * <ul>
   *   <li>When {@code 42}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdEnablePost(String, String, String)}
   */
  @Test
  @DisplayName("Test v1DlpPoliciesPolicyIdEnablePost(String, String, String); when '42'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V1DLPPolicyResponse DlpPoliciesAndDictionaryManagementApi.v1DlpPoliciesPolicyIdEnablePost(String, String, String)"})
  void testV1DlpPoliciesPolicyIdEnablePost_when42_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpPoliciesPolicyIdEnablePost(null, "ABC123", "42"));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdEnablePostWithHttpInfo(String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdEnablePostWithHttpInfo(String, String, String)}
   */
  @Test
  @DisplayName("Test v1DlpPoliciesPolicyIdEnablePostWithHttpInfo(String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse DlpPoliciesAndDictionaryManagementApi.v1DlpPoliciesPolicyIdEnablePostWithHttpInfo(String, String, String)"})
  void testV1DlpPoliciesPolicyIdEnablePostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpPoliciesPolicyIdEnablePostWithHttpInfo(null, "https://example.org/example",
                "https://example.org/example"));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdEnablePostWithHttpInfo(String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdEnablePostWithHttpInfo(String, String, String)}
   */
  @Test
  @DisplayName("Test v1DlpPoliciesPolicyIdEnablePostWithHttpInfo(String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse DlpPoliciesAndDictionaryManagementApi.v1DlpPoliciesPolicyIdEnablePostWithHttpInfo(String, String, String)"})
  void testV1DlpPoliciesPolicyIdEnablePostWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpPoliciesPolicyIdEnablePostWithHttpInfo("https://example.org/example", null, null));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdGet(String, String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdGet(String, String, String, String)}
   */
  @Test
  @DisplayName("Test v1DlpPoliciesPolicyIdGet(String, String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V1DLPPolicyResponse DlpPoliciesAndDictionaryManagementApi.v1DlpPoliciesPolicyIdGet(String, String, String, String)"})
  void testV1DlpPoliciesPolicyIdGet_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpPoliciesPolicyIdGet("ABC123", null, null, "1.0.2"));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdGet(String, String, String, String)}.
   * <ul>
   *   <li>When {@code 42}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdGet(String, String, String, String)}
   */
  @Test
  @DisplayName("Test v1DlpPoliciesPolicyIdGet(String, String, String, String); when '42'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V1DLPPolicyResponse DlpPoliciesAndDictionaryManagementApi.v1DlpPoliciesPolicyIdGet(String, String, String, String)"})
  void testV1DlpPoliciesPolicyIdGet_when42_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpPoliciesPolicyIdGet(null, "ABC123", "42", "1.0.2"));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdGetWithHttpInfo(String, String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdGetWithHttpInfo(String, String, String, String)}
   */
  @Test
  @DisplayName("Test v1DlpPoliciesPolicyIdGetWithHttpInfo(String, String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse DlpPoliciesAndDictionaryManagementApi.v1DlpPoliciesPolicyIdGetWithHttpInfo(String, String, String, String)"})
  void testV1DlpPoliciesPolicyIdGetWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpPoliciesPolicyIdGetWithHttpInfo(null, "https://example.org/example", "https://example.org/example",
                "https://example.org/example"));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdGetWithHttpInfo(String, String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdGetWithHttpInfo(String, String, String, String)}
   */
  @Test
  @DisplayName("Test v1DlpPoliciesPolicyIdGetWithHttpInfo(String, String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse DlpPoliciesAndDictionaryManagementApi.v1DlpPoliciesPolicyIdGetWithHttpInfo(String, String, String, String)"})
  void testV1DlpPoliciesPolicyIdGetWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpPoliciesPolicyIdGetWithHttpInfo("https://example.org/example", null, null,
                "https://example.org/example"));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdPut(String, String, String, V1DLPPolicyRequest)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdPut(String, String, String, V1DLPPolicyRequest)}
   */
  @Test
  @DisplayName("Test v1DlpPoliciesPolicyIdPut(String, String, String, V1DLPPolicyRequest); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V1DLPPolicyResponse DlpPoliciesAndDictionaryManagementApi.v1DlpPoliciesPolicyIdPut(String, String, String, V1DLPPolicyRequest)"})
  void testV1DlpPoliciesPolicyIdPut_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    DlpPoliciesAndDictionaryManagementApi dlpPoliciesAndDictionaryManagementApi = new DlpPoliciesAndDictionaryManagementApi(
        new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> dlpPoliciesAndDictionaryManagementApi.v1DlpPoliciesPolicyIdPut(null,
        "ABC123", "42", new V1DLPPolicyRequest()));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdPutWithHttpInfo(String, String, String, V1DLPPolicyRequest)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPolicyIdPutWithHttpInfo(String, String, String, V1DLPPolicyRequest)}
   */
  @Test
  @DisplayName("Test v1DlpPoliciesPolicyIdPutWithHttpInfo(String, String, String, V1DLPPolicyRequest); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse DlpPoliciesAndDictionaryManagementApi.v1DlpPoliciesPolicyIdPutWithHttpInfo(String, String, String, V1DLPPolicyRequest)"})
  void testV1DlpPoliciesPolicyIdPutWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    DlpPoliciesAndDictionaryManagementApi dlpPoliciesAndDictionaryManagementApi = new DlpPoliciesAndDictionaryManagementApi(
        new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> dlpPoliciesAndDictionaryManagementApi.v1DlpPoliciesPolicyIdPutWithHttpInfo(null,
            "https://example.org/example", "https://example.org/example", new V1DLPPolicyRequest()));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPost(String, String, V1DLPPolicyRequest)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPost(String, String, V1DLPPolicyRequest)}
   */
  @Test
  @DisplayName("Test v1DlpPoliciesPost(String, String, V1DLPPolicyRequest); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V1DLPPolicyResponse DlpPoliciesAndDictionaryManagementApi.v1DlpPoliciesPost(String, String, V1DLPPolicyRequest)"})
  void testV1DlpPoliciesPost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    DlpPoliciesAndDictionaryManagementApi dlpPoliciesAndDictionaryManagementApi = new DlpPoliciesAndDictionaryManagementApi(
        new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> dlpPoliciesAndDictionaryManagementApi.v1DlpPoliciesPost(null, "ABC123", new V1DLPPolicyRequest()));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPost(String, String, V1DLPPolicyRequest)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPost(String, String, V1DLPPolicyRequest)}
   */
  @Test
  @DisplayName("Test v1DlpPoliciesPost(String, String, V1DLPPolicyRequest); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V1DLPPolicyResponse DlpPoliciesAndDictionaryManagementApi.v1DlpPoliciesPost(String, String, V1DLPPolicyRequest)"})
  void testV1DlpPoliciesPost_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpPoliciesPost("ABC123", null, null));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPostWithHttpInfo(String, String, V1DLPPolicyRequest)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPostWithHttpInfo(String, String, V1DLPPolicyRequest)}
   */
  @Test
  @DisplayName("Test v1DlpPoliciesPostWithHttpInfo(String, String, V1DLPPolicyRequest); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse DlpPoliciesAndDictionaryManagementApi.v1DlpPoliciesPostWithHttpInfo(String, String, V1DLPPolicyRequest)"})
  void testV1DlpPoliciesPostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    DlpPoliciesAndDictionaryManagementApi dlpPoliciesAndDictionaryManagementApi = new DlpPoliciesAndDictionaryManagementApi(
        new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> dlpPoliciesAndDictionaryManagementApi.v1DlpPoliciesPostWithHttpInfo(null,
        "https://example.org/example", new V1DLPPolicyRequest()));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPostWithHttpInfo(String, String, V1DLPPolicyRequest)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v1DlpPoliciesPostWithHttpInfo(String, String, V1DLPPolicyRequest)}
   */
  @Test
  @DisplayName("Test v1DlpPoliciesPostWithHttpInfo(String, String, V1DLPPolicyRequest); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse DlpPoliciesAndDictionaryManagementApi.v1DlpPoliciesPostWithHttpInfo(String, String, V1DLPPolicyRequest)"})
  void testV1DlpPoliciesPostWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v1DlpPoliciesPostWithHttpInfo("https://example.org/example", null, null));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesGet(String, String, Integer, Integer)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesGet(String, String, Integer, Integer)}
   */
  @Test
  @DisplayName("Test v3DlpPoliciesGet(String, String, Integer, Integer); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V3DLPPoliciesCollectionResponse DlpPoliciesAndDictionaryManagementApi.v3DlpPoliciesGet(String, String, Integer, Integer)"})
  void testV3DlpPoliciesGet_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v3DlpPoliciesGet(null, "ABC123", 1, 1));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesGetWithHttpInfo(String, String, Integer, Integer)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesGetWithHttpInfo(String, String, Integer, Integer)}
   */
  @Test
  @DisplayName("Test v3DlpPoliciesGetWithHttpInfo(String, String, Integer, Integer); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse DlpPoliciesAndDictionaryManagementApi.v3DlpPoliciesGetWithHttpInfo(String, String, Integer, Integer)"})
  void testV3DlpPoliciesGetWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v3DlpPoliciesGetWithHttpInfo(null, "https://example.org/example", 1, 1));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdDeletePost(String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdDeletePost(String, String, String)}
   */
  @Test
  @DisplayName("Test v3DlpPoliciesPolicyIdDeletePost(String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V3DLPPolicyResponse DlpPoliciesAndDictionaryManagementApi.v3DlpPoliciesPolicyIdDeletePost(String, String, String)"})
  void testV3DlpPoliciesPolicyIdDeletePost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v3DlpPoliciesPolicyIdDeletePost("ABC123", null, null));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdDeletePost(String, String, String)}.
   * <ul>
   *   <li>When {@code 42}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdDeletePost(String, String, String)}
   */
  @Test
  @DisplayName("Test v3DlpPoliciesPolicyIdDeletePost(String, String, String); when '42'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V3DLPPolicyResponse DlpPoliciesAndDictionaryManagementApi.v3DlpPoliciesPolicyIdDeletePost(String, String, String)"})
  void testV3DlpPoliciesPolicyIdDeletePost_when42_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v3DlpPoliciesPolicyIdDeletePost(null, "ABC123", "42"));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdDeletePostWithHttpInfo(String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdDeletePostWithHttpInfo(String, String, String)}
   */
  @Test
  @DisplayName("Test v3DlpPoliciesPolicyIdDeletePostWithHttpInfo(String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse DlpPoliciesAndDictionaryManagementApi.v3DlpPoliciesPolicyIdDeletePostWithHttpInfo(String, String, String)"})
  void testV3DlpPoliciesPolicyIdDeletePostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v3DlpPoliciesPolicyIdDeletePostWithHttpInfo(null, "https://example.org/example",
                "https://example.org/example"));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdDeletePostWithHttpInfo(String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdDeletePostWithHttpInfo(String, String, String)}
   */
  @Test
  @DisplayName("Test v3DlpPoliciesPolicyIdDeletePostWithHttpInfo(String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse DlpPoliciesAndDictionaryManagementApi.v3DlpPoliciesPolicyIdDeletePostWithHttpInfo(String, String, String)"})
  void testV3DlpPoliciesPolicyIdDeletePostWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v3DlpPoliciesPolicyIdDeletePostWithHttpInfo("https://example.org/example", null, null));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdDisablePost(String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdDisablePost(String, String, String)}
   */
  @Test
  @DisplayName("Test v3DlpPoliciesPolicyIdDisablePost(String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V3DLPPolicyResponse DlpPoliciesAndDictionaryManagementApi.v3DlpPoliciesPolicyIdDisablePost(String, String, String)"})
  void testV3DlpPoliciesPolicyIdDisablePost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v3DlpPoliciesPolicyIdDisablePost("ABC123", null, null));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdDisablePost(String, String, String)}.
   * <ul>
   *   <li>When {@code 42}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdDisablePost(String, String, String)}
   */
  @Test
  @DisplayName("Test v3DlpPoliciesPolicyIdDisablePost(String, String, String); when '42'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V3DLPPolicyResponse DlpPoliciesAndDictionaryManagementApi.v3DlpPoliciesPolicyIdDisablePost(String, String, String)"})
  void testV3DlpPoliciesPolicyIdDisablePost_when42_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v3DlpPoliciesPolicyIdDisablePost(null, "ABC123", "42"));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdDisablePostWithHttpInfo(String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdDisablePostWithHttpInfo(String, String, String)}
   */
  @Test
  @DisplayName("Test v3DlpPoliciesPolicyIdDisablePostWithHttpInfo(String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse DlpPoliciesAndDictionaryManagementApi.v3DlpPoliciesPolicyIdDisablePostWithHttpInfo(String, String, String)"})
  void testV3DlpPoliciesPolicyIdDisablePostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v3DlpPoliciesPolicyIdDisablePostWithHttpInfo(null, "https://example.org/example",
                "https://example.org/example"));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdDisablePostWithHttpInfo(String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdDisablePostWithHttpInfo(String, String, String)}
   */
  @Test
  @DisplayName("Test v3DlpPoliciesPolicyIdDisablePostWithHttpInfo(String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse DlpPoliciesAndDictionaryManagementApi.v3DlpPoliciesPolicyIdDisablePostWithHttpInfo(String, String, String)"})
  void testV3DlpPoliciesPolicyIdDisablePostWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v3DlpPoliciesPolicyIdDisablePostWithHttpInfo("https://example.org/example", null, null));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdEnablePost(String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdEnablePost(String, String, String)}
   */
  @Test
  @DisplayName("Test v3DlpPoliciesPolicyIdEnablePost(String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V3DLPPolicyResponse DlpPoliciesAndDictionaryManagementApi.v3DlpPoliciesPolicyIdEnablePost(String, String, String)"})
  void testV3DlpPoliciesPolicyIdEnablePost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v3DlpPoliciesPolicyIdEnablePost("ABC123", null, null));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdEnablePost(String, String, String)}.
   * <ul>
   *   <li>When {@code 42}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdEnablePost(String, String, String)}
   */
  @Test
  @DisplayName("Test v3DlpPoliciesPolicyIdEnablePost(String, String, String); when '42'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V3DLPPolicyResponse DlpPoliciesAndDictionaryManagementApi.v3DlpPoliciesPolicyIdEnablePost(String, String, String)"})
  void testV3DlpPoliciesPolicyIdEnablePost_when42_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v3DlpPoliciesPolicyIdEnablePost(null, "ABC123", "42"));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdEnablePostWithHttpInfo(String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdEnablePostWithHttpInfo(String, String, String)}
   */
  @Test
  @DisplayName("Test v3DlpPoliciesPolicyIdEnablePostWithHttpInfo(String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse DlpPoliciesAndDictionaryManagementApi.v3DlpPoliciesPolicyIdEnablePostWithHttpInfo(String, String, String)"})
  void testV3DlpPoliciesPolicyIdEnablePostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v3DlpPoliciesPolicyIdEnablePostWithHttpInfo(null, "https://example.org/example",
                "https://example.org/example"));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdEnablePostWithHttpInfo(String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdEnablePostWithHttpInfo(String, String, String)}
   */
  @Test
  @DisplayName("Test v3DlpPoliciesPolicyIdEnablePostWithHttpInfo(String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse DlpPoliciesAndDictionaryManagementApi.v3DlpPoliciesPolicyIdEnablePostWithHttpInfo(String, String, String)"})
  void testV3DlpPoliciesPolicyIdEnablePostWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v3DlpPoliciesPolicyIdEnablePostWithHttpInfo("https://example.org/example", null, null));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdGet(String, String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdGet(String, String, String, String)}
   */
  @Test
  @DisplayName("Test v3DlpPoliciesPolicyIdGet(String, String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V3DLPPolicyResponse DlpPoliciesAndDictionaryManagementApi.v3DlpPoliciesPolicyIdGet(String, String, String, String)"})
  void testV3DlpPoliciesPolicyIdGet_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v3DlpPoliciesPolicyIdGet("ABC123", null, null, "1.0.2"));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdGet(String, String, String, String)}.
   * <ul>
   *   <li>When {@code 42}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdGet(String, String, String, String)}
   */
  @Test
  @DisplayName("Test v3DlpPoliciesPolicyIdGet(String, String, String, String); when '42'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V3DLPPolicyResponse DlpPoliciesAndDictionaryManagementApi.v3DlpPoliciesPolicyIdGet(String, String, String, String)"})
  void testV3DlpPoliciesPolicyIdGet_when42_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v3DlpPoliciesPolicyIdGet(null, "ABC123", "42", "1.0.2"));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdGetWithHttpInfo(String, String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdGetWithHttpInfo(String, String, String, String)}
   */
  @Test
  @DisplayName("Test v3DlpPoliciesPolicyIdGetWithHttpInfo(String, String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse DlpPoliciesAndDictionaryManagementApi.v3DlpPoliciesPolicyIdGetWithHttpInfo(String, String, String, String)"})
  void testV3DlpPoliciesPolicyIdGetWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v3DlpPoliciesPolicyIdGetWithHttpInfo(null, "https://example.org/example", "https://example.org/example",
                "https://example.org/example"));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdGetWithHttpInfo(String, String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdGetWithHttpInfo(String, String, String, String)}
   */
  @Test
  @DisplayName("Test v3DlpPoliciesPolicyIdGetWithHttpInfo(String, String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse DlpPoliciesAndDictionaryManagementApi.v3DlpPoliciesPolicyIdGetWithHttpInfo(String, String, String, String)"})
  void testV3DlpPoliciesPolicyIdGetWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v3DlpPoliciesPolicyIdGetWithHttpInfo("https://example.org/example", null, null,
                "https://example.org/example"));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdUpdatePost(String, String, String, V3DLPPolicyRequest)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdUpdatePost(String, String, String, V3DLPPolicyRequest)}
   */
  @Test
  @DisplayName("Test v3DlpPoliciesPolicyIdUpdatePost(String, String, String, V3DLPPolicyRequest); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V3DLPPolicyResponse DlpPoliciesAndDictionaryManagementApi.v3DlpPoliciesPolicyIdUpdatePost(String, String, String, V3DLPPolicyRequest)"})
  void testV3DlpPoliciesPolicyIdUpdatePost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    DlpPoliciesAndDictionaryManagementApi dlpPoliciesAndDictionaryManagementApi = new DlpPoliciesAndDictionaryManagementApi(
        new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> dlpPoliciesAndDictionaryManagementApi.v3DlpPoliciesPolicyIdUpdatePost(null,
        "ABC123", "42", new V3DLPPolicyRequest()));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdUpdatePostWithHttpInfo(String, String, String, V3DLPPolicyRequest)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPolicyIdUpdatePostWithHttpInfo(String, String, String, V3DLPPolicyRequest)}
   */
  @Test
  @DisplayName("Test v3DlpPoliciesPolicyIdUpdatePostWithHttpInfo(String, String, String, V3DLPPolicyRequest); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse DlpPoliciesAndDictionaryManagementApi.v3DlpPoliciesPolicyIdUpdatePostWithHttpInfo(String, String, String, V3DLPPolicyRequest)"})
  void testV3DlpPoliciesPolicyIdUpdatePostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    DlpPoliciesAndDictionaryManagementApi dlpPoliciesAndDictionaryManagementApi = new DlpPoliciesAndDictionaryManagementApi(
        new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> dlpPoliciesAndDictionaryManagementApi.v3DlpPoliciesPolicyIdUpdatePostWithHttpInfo(null,
            "https://example.org/example", "https://example.org/example", new V3DLPPolicyRequest()));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPost(String, String, V3DLPPolicyRequest)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPost(String, String, V3DLPPolicyRequest)}
   */
  @Test
  @DisplayName("Test v3DlpPoliciesPost(String, String, V3DLPPolicyRequest); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V3DLPPolicyResponse DlpPoliciesAndDictionaryManagementApi.v3DlpPoliciesPost(String, String, V3DLPPolicyRequest)"})
  void testV3DlpPoliciesPost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    DlpPoliciesAndDictionaryManagementApi dlpPoliciesAndDictionaryManagementApi = new DlpPoliciesAndDictionaryManagementApi(
        new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> dlpPoliciesAndDictionaryManagementApi.v3DlpPoliciesPost(null, "ABC123", new V3DLPPolicyRequest()));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPost(String, String, V3DLPPolicyRequest)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPost(String, String, V3DLPPolicyRequest)}
   */
  @Test
  @DisplayName("Test v3DlpPoliciesPost(String, String, V3DLPPolicyRequest); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V3DLPPolicyResponse DlpPoliciesAndDictionaryManagementApi.v3DlpPoliciesPost(String, String, V3DLPPolicyRequest)"})
  void testV3DlpPoliciesPost_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v3DlpPoliciesPost("ABC123", null, null));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPostWithHttpInfo(String, String, V3DLPPolicyRequest)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPostWithHttpInfo(String, String, V3DLPPolicyRequest)}
   */
  @Test
  @DisplayName("Test v3DlpPoliciesPostWithHttpInfo(String, String, V3DLPPolicyRequest); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse DlpPoliciesAndDictionaryManagementApi.v3DlpPoliciesPostWithHttpInfo(String, String, V3DLPPolicyRequest)"})
  void testV3DlpPoliciesPostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    DlpPoliciesAndDictionaryManagementApi dlpPoliciesAndDictionaryManagementApi = new DlpPoliciesAndDictionaryManagementApi(
        new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> dlpPoliciesAndDictionaryManagementApi.v3DlpPoliciesPostWithHttpInfo(null,
        "https://example.org/example", new V3DLPPolicyRequest()));
  }

  /**
   * Test {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPostWithHttpInfo(String, String, V3DLPPolicyRequest)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DlpPoliciesAndDictionaryManagementApi#v3DlpPoliciesPostWithHttpInfo(String, String, V3DLPPolicyRequest)}
   */
  @Test
  @DisplayName("Test v3DlpPoliciesPostWithHttpInfo(String, String, V3DLPPolicyRequest); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse DlpPoliciesAndDictionaryManagementApi.v3DlpPoliciesPostWithHttpInfo(String, String, V3DLPPolicyRequest)"})
  void testV3DlpPoliciesPostWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new DlpPoliciesAndDictionaryManagementApi(new ApiClientJersey2(mock(Client.class),
            "https://example.org/example", defaultHeaders, "https://example.org/example")))
            .v3DlpPoliciesPostWithHttpInfo("https://example.org/example", null, null));
  }
}
