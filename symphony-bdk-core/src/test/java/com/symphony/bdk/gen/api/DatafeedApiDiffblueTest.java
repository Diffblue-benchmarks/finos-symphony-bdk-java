package com.symphony.bdk.gen.api;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.AckId;
import com.symphony.bdk.gen.api.model.V5DatafeedCreateBody;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import jakarta.ws.rs.client.Client;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DatafeedApiDiffblueTest {
  /**
   * Test {@link DatafeedApi#createDatafeed(String, String, V5DatafeedCreateBody)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedApi#createDatafeed(String, String, V5DatafeedCreateBody)}
   */
  @Test
  @DisplayName("Test createDatafeed(String, String, V5DatafeedCreateBody); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V5Datafeed DatafeedApi.createDatafeed(String, String, V5DatafeedCreateBody)"
  })
  void testCreateDatafeed_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    DatafeedApi datafeedApi = new DatafeedApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> datafeedApi.createDatafeed(null, "ABC123", new V5DatafeedCreateBody()));
  }

  /**
   * Test {@link DatafeedApi#createDatafeedWithHttpInfo(String, String, V5DatafeedCreateBody)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedApi#createDatafeedWithHttpInfo(String, String,
   * V5DatafeedCreateBody)}
   */
  @Test
  @DisplayName(
      "Test createDatafeedWithHttpInfo(String, String, V5DatafeedCreateBody); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse DatafeedApi.createDatafeedWithHttpInfo(String, String, V5DatafeedCreateBody)"
  })
  void testCreateDatafeedWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    DatafeedApi datafeedApi = new DatafeedApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            datafeedApi.createDatafeedWithHttpInfo(
                null, "https://example.org/example", new V5DatafeedCreateBody()));
  }

  /**
   * Test {@link DatafeedApi#deleteDatafeed(String, String, String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedApi#deleteDatafeed(String, String, String)}
   */
  @Test
  @DisplayName("Test deleteDatafeed(String, String, String); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V2Error DatafeedApi.deleteDatafeed(String, String, String)"
  })
  void testDeleteDatafeed_when42_thenThrowApiException() throws ApiException {
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
        ApiException.class, () -> new DatafeedApi(apiClient).deleteDatafeed("42", null, "ABC123"));
  }

  /**
   * Test {@link DatafeedApi#deleteDatafeed(String, String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedApi#deleteDatafeed(String, String, String)}
   */
  @Test
  @DisplayName("Test deleteDatafeed(String, String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V2Error DatafeedApi.deleteDatafeed(String, String, String)"
  })
  void testDeleteDatafeed_whenNull_thenThrowApiException() throws ApiException {
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
        () -> new DatafeedApi(apiClient).deleteDatafeed(null, "ABC123", "ABC123"));
  }

  /**
   * Test {@link DatafeedApi#deleteDatafeedWithHttpInfo(String, String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedApi#deleteDatafeedWithHttpInfo(String, String, String)}
   */
  @Test
  @DisplayName(
      "Test deleteDatafeedWithHttpInfo(String, String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse DatafeedApi.deleteDatafeedWithHttpInfo(String, String, String)"
  })
  void testDeleteDatafeedWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
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
            new DatafeedApi(apiClient)
                .deleteDatafeedWithHttpInfo(
                    null, "https://example.org/example", "https://example.org/example"));
  }

  /**
   * Test {@link DatafeedApi#deleteDatafeedWithHttpInfo(String, String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedApi#deleteDatafeedWithHttpInfo(String, String, String)}
   */
  @Test
  @DisplayName(
      "Test deleteDatafeedWithHttpInfo(String, String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse DatafeedApi.deleteDatafeedWithHttpInfo(String, String, String)"
  })
  void testDeleteDatafeedWithHttpInfo_whenNull_thenThrowApiException2() throws ApiException {
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
            new DatafeedApi(apiClient)
                .deleteDatafeedWithHttpInfo(
                    "https://example.org/example", null, "https://example.org/example"));
  }

  /**
   * Test {@link DatafeedApi#listDatafeed(String, String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedApi#listDatafeed(String, String, String)}
   */
  @Test
  @DisplayName("Test listDatafeed(String, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.List DatafeedApi.listDatafeed(String, String, String)"})
  void testListDatafeed_thenThrowApiException() throws ApiException {
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
        ApiException.class, () -> new DatafeedApi(apiClient).listDatafeed(null, "ABC123", "Tag"));
  }

  /**
   * Test {@link DatafeedApi#listDatafeedWithHttpInfo(String, String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedApi#listDatafeedWithHttpInfo(String, String, String)}
   */
  @Test
  @DisplayName("Test listDatafeedWithHttpInfo(String, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse DatafeedApi.listDatafeedWithHttpInfo(String, String, String)"
  })
  void testListDatafeedWithHttpInfo_thenThrowApiException() throws ApiException {
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
            new DatafeedApi(apiClient)
                .listDatafeedWithHttpInfo(
                    null, "https://example.org/example", "https://example.org/example"));
  }

  /**
   * Test {@link DatafeedApi#readDatafeed(String, String, String, AckId)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedApi#readDatafeed(String, String, String, AckId)}
   */
  @Test
  @DisplayName(
      "Test readDatafeed(String, String, String, AckId); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V5EventList DatafeedApi.readDatafeed(String, String, String, AckId)"
  })
  void testReadDatafeed_when42_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    DatafeedApi datafeedApi = new DatafeedApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class, () -> datafeedApi.readDatafeed("42", null, "ABC123", new AckId()));
  }

  /**
   * Test {@link DatafeedApi#readDatafeed(String, String, String, AckId)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedApi#readDatafeed(String, String, String, AckId)}
   */
  @Test
  @DisplayName(
      "Test readDatafeed(String, String, String, AckId); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V5EventList DatafeedApi.readDatafeed(String, String, String, AckId)"
  })
  void testReadDatafeed_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    DatafeedApi datafeedApi = new DatafeedApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class, () -> datafeedApi.readDatafeed(null, "ABC123", "ABC123", new AckId()));
  }

  /**
   * Test {@link DatafeedApi#readDatafeedWithHttpInfo(String, String, String, AckId)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedApi#readDatafeedWithHttpInfo(String, String, String,
   * AckId)}
   */
  @Test
  @DisplayName(
      "Test readDatafeedWithHttpInfo(String, String, String, AckId); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse DatafeedApi.readDatafeedWithHttpInfo(String, String, String, AckId)"
  })
  void testReadDatafeedWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    DatafeedApi datafeedApi = new DatafeedApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            datafeedApi.readDatafeedWithHttpInfo(
                null, "https://example.org/example", "https://example.org/example", new AckId()));
  }

  /**
   * Test {@link DatafeedApi#readDatafeedWithHttpInfo(String, String, String, AckId)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedApi#readDatafeedWithHttpInfo(String, String, String,
   * AckId)}
   */
  @Test
  @DisplayName(
      "Test readDatafeedWithHttpInfo(String, String, String, AckId); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse DatafeedApi.readDatafeedWithHttpInfo(String, String, String, AckId)"
  })
  void testReadDatafeedWithHttpInfo_whenNull_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    DatafeedApi datafeedApi = new DatafeedApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            datafeedApi.readDatafeedWithHttpInfo(
                "https://example.org/example", null, "https://example.org/example", new AckId()));
  }

  /**
   * Test {@link DatafeedApi#v1DatafeedCreatePost(String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedApi#v1DatafeedCreatePost(String, String)}
   */
  @Test
  @DisplayName("Test v1DatafeedCreatePost(String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.Datafeed DatafeedApi.v1DatafeedCreatePost(String, String)"
  })
  void testV1DatafeedCreatePost_thenThrowApiException() throws ApiException {
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
        ApiException.class, () -> new DatafeedApi(apiClient).v1DatafeedCreatePost(null, "ABC123"));
  }

  /**
   * Test {@link DatafeedApi#v1DatafeedCreatePostWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedApi#v1DatafeedCreatePostWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName("Test v1DatafeedCreatePostWithHttpInfo(String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse DatafeedApi.v1DatafeedCreatePostWithHttpInfo(String, String)"
  })
  void testV1DatafeedCreatePostWithHttpInfo_thenThrowApiException() throws ApiException {
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
            new DatafeedApi(apiClient)
                .v1DatafeedCreatePostWithHttpInfo(null, "https://example.org/example"));
  }

  /**
   * Test {@link DatafeedApi#v1DatafeedIdReadGet(String, Integer, String, String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedApi#v1DatafeedIdReadGet(String, Integer, String, String)}
   */
  @Test
  @DisplayName(
      "Test v1DatafeedIdReadGet(String, Integer, String, String); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.List DatafeedApi.v1DatafeedIdReadGet(String, Integer, String, String)"
  })
  void testV1DatafeedIdReadGet_when42_thenThrowApiException() throws ApiException {
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
        () -> new DatafeedApi(apiClient).v1DatafeedIdReadGet("42", 3, null, "ABC123"));
  }

  /**
   * Test {@link DatafeedApi#v1DatafeedIdReadGet(String, Integer, String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedApi#v1DatafeedIdReadGet(String, Integer, String, String)}
   */
  @Test
  @DisplayName(
      "Test v1DatafeedIdReadGet(String, Integer, String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.List DatafeedApi.v1DatafeedIdReadGet(String, Integer, String, String)"
  })
  void testV1DatafeedIdReadGet_whenNull_thenThrowApiException() throws ApiException {
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
        () -> new DatafeedApi(apiClient).v1DatafeedIdReadGet(null, 3, "ABC123", "ABC123"));
  }

  /**
   * Test {@link DatafeedApi#v1DatafeedIdReadGetWithHttpInfo(String, Integer, String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedApi#v1DatafeedIdReadGetWithHttpInfo(String, Integer,
   * String, String)}
   */
  @Test
  @DisplayName(
      "Test v1DatafeedIdReadGetWithHttpInfo(String, Integer, String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse DatafeedApi.v1DatafeedIdReadGetWithHttpInfo(String, Integer, String, String)"
  })
  void testV1DatafeedIdReadGetWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
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
            new DatafeedApi(apiClient)
                .v1DatafeedIdReadGetWithHttpInfo(
                    null, 3, "https://example.org/example", "https://example.org/example"));
  }

  /**
   * Test {@link DatafeedApi#v1DatafeedIdReadGetWithHttpInfo(String, Integer, String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedApi#v1DatafeedIdReadGetWithHttpInfo(String, Integer,
   * String, String)}
   */
  @Test
  @DisplayName(
      "Test v1DatafeedIdReadGetWithHttpInfo(String, Integer, String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse DatafeedApi.v1DatafeedIdReadGetWithHttpInfo(String, Integer, String, String)"
  })
  void testV1DatafeedIdReadGetWithHttpInfo_whenNull_thenThrowApiException2() throws ApiException {
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
            new DatafeedApi(apiClient)
                .v1DatafeedIdReadGetWithHttpInfo(
                    "https://example.org/example", 3, null, "https://example.org/example"));
  }

  /**
   * Test {@link DatafeedApi#v2DatafeedIdReadGet(String, Integer, String, String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedApi#v2DatafeedIdReadGet(String, Integer, String, String)}
   */
  @Test
  @DisplayName(
      "Test v2DatafeedIdReadGet(String, Integer, String, String); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.List DatafeedApi.v2DatafeedIdReadGet(String, Integer, String, String)"
  })
  void testV2DatafeedIdReadGet_when42_thenThrowApiException() throws ApiException {
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
        () -> new DatafeedApi(apiClient).v2DatafeedIdReadGet("42", 3, null, "ABC123"));
  }

  /**
   * Test {@link DatafeedApi#v2DatafeedIdReadGet(String, Integer, String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedApi#v2DatafeedIdReadGet(String, Integer, String, String)}
   */
  @Test
  @DisplayName(
      "Test v2DatafeedIdReadGet(String, Integer, String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.List DatafeedApi.v2DatafeedIdReadGet(String, Integer, String, String)"
  })
  void testV2DatafeedIdReadGet_whenNull_thenThrowApiException() throws ApiException {
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
        () -> new DatafeedApi(apiClient).v2DatafeedIdReadGet(null, 3, "ABC123", "ABC123"));
  }

  /**
   * Test {@link DatafeedApi#v2DatafeedIdReadGetWithHttpInfo(String, Integer, String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedApi#v2DatafeedIdReadGetWithHttpInfo(String, Integer,
   * String, String)}
   */
  @Test
  @DisplayName(
      "Test v2DatafeedIdReadGetWithHttpInfo(String, Integer, String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse DatafeedApi.v2DatafeedIdReadGetWithHttpInfo(String, Integer, String, String)"
  })
  void testV2DatafeedIdReadGetWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
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
            new DatafeedApi(apiClient)
                .v2DatafeedIdReadGetWithHttpInfo(
                    null, 3, "https://example.org/example", "https://example.org/example"));
  }

  /**
   * Test {@link DatafeedApi#v2DatafeedIdReadGetWithHttpInfo(String, Integer, String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedApi#v2DatafeedIdReadGetWithHttpInfo(String, Integer,
   * String, String)}
   */
  @Test
  @DisplayName(
      "Test v2DatafeedIdReadGetWithHttpInfo(String, Integer, String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse DatafeedApi.v2DatafeedIdReadGetWithHttpInfo(String, Integer, String, String)"
  })
  void testV2DatafeedIdReadGetWithHttpInfo_whenNull_thenThrowApiException2() throws ApiException {
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
            new DatafeedApi(apiClient)
                .v2DatafeedIdReadGetWithHttpInfo(
                    "https://example.org/example", 3, null, "https://example.org/example"));
  }

  /**
   * Test {@link DatafeedApi#v4DatafeedCreatePost(String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedApi#v4DatafeedCreatePost(String, String)}
   */
  @Test
  @DisplayName("Test v4DatafeedCreatePost(String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.Datafeed DatafeedApi.v4DatafeedCreatePost(String, String)"
  })
  void testV4DatafeedCreatePost_thenThrowApiException() throws ApiException {
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
        ApiException.class, () -> new DatafeedApi(apiClient).v4DatafeedCreatePost(null, "ABC123"));
  }

  /**
   * Test {@link DatafeedApi#v4DatafeedCreatePostWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedApi#v4DatafeedCreatePostWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName("Test v4DatafeedCreatePostWithHttpInfo(String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse DatafeedApi.v4DatafeedCreatePostWithHttpInfo(String, String)"
  })
  void testV4DatafeedCreatePostWithHttpInfo_thenThrowApiException() throws ApiException {
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
            new DatafeedApi(apiClient)
                .v4DatafeedCreatePostWithHttpInfo(null, "https://example.org/example"));
  }

  /**
   * Test {@link DatafeedApi#v4DatafeedIdReadGet(String, Integer, String, String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedApi#v4DatafeedIdReadGet(String, Integer, String, String)}
   */
  @Test
  @DisplayName(
      "Test v4DatafeedIdReadGet(String, Integer, String, String); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.List DatafeedApi.v4DatafeedIdReadGet(String, Integer, String, String)"
  })
  void testV4DatafeedIdReadGet_when42_thenThrowApiException() throws ApiException {
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
        () -> new DatafeedApi(apiClient).v4DatafeedIdReadGet("42", 1, null, "ABC123"));
  }

  /**
   * Test {@link DatafeedApi#v4DatafeedIdReadGet(String, Integer, String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedApi#v4DatafeedIdReadGet(String, Integer, String, String)}
   */
  @Test
  @DisplayName(
      "Test v4DatafeedIdReadGet(String, Integer, String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.List DatafeedApi.v4DatafeedIdReadGet(String, Integer, String, String)"
  })
  void testV4DatafeedIdReadGet_whenNull_thenThrowApiException() throws ApiException {
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
        () -> new DatafeedApi(apiClient).v4DatafeedIdReadGet(null, 1, "ABC123", "ABC123"));
  }

  /**
   * Test {@link DatafeedApi#v4DatafeedIdReadGetWithHttpInfo(String, Integer, String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedApi#v4DatafeedIdReadGetWithHttpInfo(String, Integer,
   * String, String)}
   */
  @Test
  @DisplayName(
      "Test v4DatafeedIdReadGetWithHttpInfo(String, Integer, String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse DatafeedApi.v4DatafeedIdReadGetWithHttpInfo(String, Integer, String, String)"
  })
  void testV4DatafeedIdReadGetWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
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
            new DatafeedApi(apiClient)
                .v4DatafeedIdReadGetWithHttpInfo(
                    null, 1, "https://example.org/example", "https://example.org/example"));
  }

  /**
   * Test {@link DatafeedApi#v4DatafeedIdReadGetWithHttpInfo(String, Integer, String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedApi#v4DatafeedIdReadGetWithHttpInfo(String, Integer,
   * String, String)}
   */
  @Test
  @DisplayName(
      "Test v4DatafeedIdReadGetWithHttpInfo(String, Integer, String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse DatafeedApi.v4DatafeedIdReadGetWithHttpInfo(String, Integer, String, String)"
  })
  void testV4DatafeedIdReadGetWithHttpInfo_whenNull_thenThrowApiException2() throws ApiException {
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
            new DatafeedApi(apiClient)
                .v4DatafeedIdReadGetWithHttpInfo(
                    "https://example.org/example", 1, null, "https://example.org/example"));
  }
}
