package com.symphony.bdk.gen.api;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.V1HealthCheckResponse;
import com.symphony.bdk.gen.api.model.V2HealthCheckResponse;
import com.symphony.bdk.gen.api.model.V3Health;
import com.symphony.bdk.http.api.ApiClient;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.api.ApiResponse;
import com.symphony.bdk.http.api.Pair;
import com.symphony.bdk.http.api.util.TypeReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SystemApiDiffblueTest {
  /**
   * Test {@link SystemApi#v1HealthCheckGet()}.
   * <ul>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SystemApi#v1HealthCheckGet()}
   */
  @Test
  @DisplayName("Test v1HealthCheckGet(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V1HealthCheckResponse SystemApi.v1HealthCheckGet()"})
  void testV1HealthCheckGet_thenReturnNull() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    when(apiClient.invokeAPI(Mockito.<String>any(), Mockito.<String>any(), Mockito.<List<Pair>>any(),
        Mockito.<Object>any(), Mockito.<Map<String, String>>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, Object>>any(), Mockito.<String>any(), Mockito.<String>any(), Mockito.<String[]>any(),
        Mockito.<TypeReference<Object>>any())).thenReturn(new ApiResponse<>(1, new HashMap<>()));
    when(apiClient.selectHeaderAccept(isA(String[].class))).thenReturn("https://example.org/example");
    when(apiClient.selectHeaderContentType(isA(String[].class))).thenReturn("text/plain");

    // Act
    V1HealthCheckResponse actualV1HealthCheckGetResult = (new SystemApi(apiClient)).v1HealthCheckGet();

    // Assert
    verify(apiClient).invokeAPI(eq("/v1/HealthCheck"), eq("GET"), isA(List.class), isNull(), isA(Map.class),
        isA(Map.class), isA(Map.class), eq("https://example.org/example"), eq("text/plain"), isA(String[].class),
        isA(TypeReference.class));
    verify(apiClient).selectHeaderAccept(isA(String[].class));
    verify(apiClient).selectHeaderContentType(isA(String[].class));
    assertNull(actualV1HealthCheckGetResult);
  }

  /**
   * Test {@link SystemApi#v1HealthCheckGetWithHttpInfo()}.
   * <p>
   * Method under test: {@link SystemApi#v1HealthCheckGetWithHttpInfo()}
   */
  @Test
  @DisplayName("Test v1HealthCheckGetWithHttpInfo()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiResponse SystemApi.v1HealthCheckGetWithHttpInfo()"})
  void testV1HealthCheckGetWithHttpInfo() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    ApiResponse<Object> apiResponse = new ApiResponse<>(1, new HashMap<>());

    when(apiClient.invokeAPI(Mockito.<String>any(), Mockito.<String>any(), Mockito.<List<Pair>>any(),
        Mockito.<Object>any(), Mockito.<Map<String, String>>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, Object>>any(), Mockito.<String>any(), Mockito.<String>any(), Mockito.<String[]>any(),
        Mockito.<TypeReference<Object>>any())).thenReturn(apiResponse);
    when(apiClient.selectHeaderAccept(isA(String[].class))).thenReturn("https://example.org/example");
    when(apiClient.selectHeaderContentType(isA(String[].class))).thenReturn("text/plain");

    // Act
    ApiResponse<V1HealthCheckResponse> actualV1HealthCheckGetWithHttpInfoResult = (new SystemApi(apiClient))
        .v1HealthCheckGetWithHttpInfo();

    // Assert
    verify(apiClient).invokeAPI(eq("/v1/HealthCheck"), eq("GET"), isA(List.class), isNull(), isA(Map.class),
        isA(Map.class), isA(Map.class), eq("https://example.org/example"), eq("text/plain"), isA(String[].class),
        isA(TypeReference.class));
    verify(apiClient).selectHeaderAccept(isA(String[].class));
    verify(apiClient).selectHeaderContentType(isA(String[].class));
    assertSame(apiResponse, actualV1HealthCheckGetWithHttpInfoResult);
  }

  /**
   * Test {@link SystemApi#v2HealthCheckGet(Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, String, String)}.
   * <ul>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SystemApi#v2HealthCheckGet(Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, String, String)}
   */
  @Test
  @DisplayName("Test v2HealthCheckGet(Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, String, String); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "V2HealthCheckResponse SystemApi.v2HealthCheckGet(Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, String, String)"})
  void testV2HealthCheckGet_thenReturnNull() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    when(apiClient.invokeAPI(Mockito.<String>any(), Mockito.<String>any(), Mockito.<List<Pair>>any(),
        Mockito.<Object>any(), Mockito.<Map<String, String>>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, Object>>any(), Mockito.<String>any(), Mockito.<String>any(), Mockito.<String[]>any(),
        Mockito.<TypeReference<Object>>any())).thenReturn(new ApiResponse<>(1, new HashMap<>()));
    when(apiClient.parameterToString(Mockito.<Object>any())).thenReturn("https://example.org/example");
    when(apiClient.selectHeaderAccept(isA(String[].class))).thenReturn("https://example.org/example");
    when(apiClient.selectHeaderContentType(isA(String[].class))).thenReturn("text/plain");
    when(apiClient.parameterToPairs(Mockito.<String>any(), Mockito.<String>any(), Mockito.<Object>any()))
        .thenReturn(new ArrayList<>());

    // Act
    V2HealthCheckResponse actualV2HealthCheckGetResult = (new SystemApi(apiClient)).v2HealthCheckGet(true, true, true,
        true, true, true, true, true, "ABC123", "ABC123");

    // Assert
    verify(apiClient).invokeAPI(eq("/v2/HealthCheck"), eq("GET"), isA(List.class), isNull(), isA(Map.class),
        isA(Map.class), isA(Map.class), eq("https://example.org/example"), eq("text/plain"), isA(String[].class),
        isA(TypeReference.class));
    verify(apiClient, atLeast(1)).parameterToPairs(eq(""), Mockito.<String>any(), isA(Object.class));
    verify(apiClient, atLeast(1)).parameterToString(isA(Object.class));
    verify(apiClient).selectHeaderAccept(isA(String[].class));
    verify(apiClient).selectHeaderContentType(isA(String[].class));
    assertNull(actualV2HealthCheckGetResult);
  }

  /**
   * Test {@link SystemApi#v2HealthCheckGetWithHttpInfo(Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, String, String)}.
   * <p>
   * Method under test: {@link SystemApi#v2HealthCheckGetWithHttpInfo(Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, String, String)}
   */
  @Test
  @DisplayName("Test v2HealthCheckGetWithHttpInfo(Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, String, String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "ApiResponse SystemApi.v2HealthCheckGetWithHttpInfo(Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, String, String)"})
  void testV2HealthCheckGetWithHttpInfo() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    ApiResponse<Object> apiResponse = new ApiResponse<>(1, new HashMap<>());

    when(apiClient.invokeAPI(Mockito.<String>any(), Mockito.<String>any(), Mockito.<List<Pair>>any(),
        Mockito.<Object>any(), Mockito.<Map<String, String>>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, Object>>any(), Mockito.<String>any(), Mockito.<String>any(), Mockito.<String[]>any(),
        Mockito.<TypeReference<Object>>any())).thenReturn(apiResponse);
    when(apiClient.parameterToString(Mockito.<Object>any())).thenReturn("https://example.org/example");
    when(apiClient.selectHeaderAccept(isA(String[].class))).thenReturn("https://example.org/example");
    when(apiClient.selectHeaderContentType(isA(String[].class))).thenReturn("text/plain");
    when(apiClient.parameterToPairs(Mockito.<String>any(), Mockito.<String>any(), Mockito.<Object>any()))
        .thenReturn(new ArrayList<>());

    // Act
    ApiResponse<V2HealthCheckResponse> actualV2HealthCheckGetWithHttpInfoResult = (new SystemApi(apiClient))
        .v2HealthCheckGetWithHttpInfo(true, true, true, true, true, true, true, true, "https://example.org/example",
            "https://example.org/example");

    // Assert
    verify(apiClient).invokeAPI(eq("/v2/HealthCheck"), eq("GET"), isA(List.class), isNull(), isA(Map.class),
        isA(Map.class), isA(Map.class), eq("https://example.org/example"), eq("text/plain"), isA(String[].class),
        isA(TypeReference.class));
    verify(apiClient, atLeast(1)).parameterToPairs(eq(""), Mockito.<String>any(), isA(Object.class));
    verify(apiClient, atLeast(1)).parameterToString(isA(Object.class));
    verify(apiClient).selectHeaderAccept(isA(String[].class));
    verify(apiClient).selectHeaderContentType(isA(String[].class));
    assertSame(apiResponse, actualV2HealthCheckGetWithHttpInfoResult);
  }

  /**
   * Test {@link SystemApi#v2HealthCheckGetWithHttpInfo(Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, String, String)}.
   * <p>
   * Method under test: {@link SystemApi#v2HealthCheckGetWithHttpInfo(Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, String, String)}
   */
  @Test
  @DisplayName("Test v2HealthCheckGetWithHttpInfo(Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, String, String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "ApiResponse SystemApi.v2HealthCheckGetWithHttpInfo(Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, String, String)"})
  void testV2HealthCheckGetWithHttpInfo2() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    ApiResponse<Object> apiResponse = new ApiResponse<>(1, new HashMap<>());

    when(apiClient.invokeAPI(Mockito.<String>any(), Mockito.<String>any(), Mockito.<List<Pair>>any(),
        Mockito.<Object>any(), Mockito.<Map<String, String>>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, Object>>any(), Mockito.<String>any(), Mockito.<String>any(), Mockito.<String[]>any(),
        Mockito.<TypeReference<Object>>any())).thenReturn(apiResponse);
    when(apiClient.parameterToString(Mockito.<Object>any())).thenReturn("https://example.org/example");
    when(apiClient.selectHeaderAccept(isA(String[].class))).thenReturn("https://example.org/example");
    when(apiClient.selectHeaderContentType(isA(String[].class))).thenReturn("text/plain");
    when(apiClient.parameterToPairs(Mockito.<String>any(), Mockito.<String>any(), Mockito.<Object>any()))
        .thenReturn(new ArrayList<>());

    // Act
    ApiResponse<V2HealthCheckResponse> actualV2HealthCheckGetWithHttpInfoResult = (new SystemApi(apiClient))
        .v2HealthCheckGetWithHttpInfo(true, true, true, true, true, true, true, true, null,
            "https://example.org/example");

    // Assert
    verify(apiClient).invokeAPI(eq("/v2/HealthCheck"), eq("GET"), isA(List.class), isNull(), isA(Map.class),
        isA(Map.class), isA(Map.class), eq("https://example.org/example"), eq("text/plain"), isA(String[].class),
        isA(TypeReference.class));
    verify(apiClient, atLeast(1)).parameterToPairs(eq(""), Mockito.<String>any(), isA(Object.class));
    verify(apiClient).parameterToString(isA(Object.class));
    verify(apiClient).selectHeaderAccept(isA(String[].class));
    verify(apiClient).selectHeaderContentType(isA(String[].class));
    assertSame(apiResponse, actualV2HealthCheckGetWithHttpInfoResult);
  }

  /**
   * Test {@link SystemApi#v2HealthCheckGetWithHttpInfo(Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, String, String)}.
   * <p>
   * Method under test: {@link SystemApi#v2HealthCheckGetWithHttpInfo(Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, String, String)}
   */
  @Test
  @DisplayName("Test v2HealthCheckGetWithHttpInfo(Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, String, String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "ApiResponse SystemApi.v2HealthCheckGetWithHttpInfo(Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, String, String)"})
  void testV2HealthCheckGetWithHttpInfo3() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    ApiResponse<Object> apiResponse = new ApiResponse<>(1, new HashMap<>());

    when(apiClient.invokeAPI(Mockito.<String>any(), Mockito.<String>any(), Mockito.<List<Pair>>any(),
        Mockito.<Object>any(), Mockito.<Map<String, String>>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, Object>>any(), Mockito.<String>any(), Mockito.<String>any(), Mockito.<String[]>any(),
        Mockito.<TypeReference<Object>>any())).thenReturn(apiResponse);
    when(apiClient.parameterToString(Mockito.<Object>any())).thenReturn("https://example.org/example");
    when(apiClient.selectHeaderAccept(isA(String[].class))).thenReturn("https://example.org/example");
    when(apiClient.selectHeaderContentType(isA(String[].class))).thenReturn("text/plain");
    when(apiClient.parameterToPairs(Mockito.<String>any(), Mockito.<String>any(), Mockito.<Object>any()))
        .thenReturn(new ArrayList<>());

    // Act
    ApiResponse<V2HealthCheckResponse> actualV2HealthCheckGetWithHttpInfoResult = (new SystemApi(apiClient))
        .v2HealthCheckGetWithHttpInfo(true, true, true, true, true, true, true, true, "https://example.org/example",
            null);

    // Assert
    verify(apiClient).invokeAPI(eq("/v2/HealthCheck"), eq("GET"), isA(List.class), isNull(), isA(Map.class),
        isA(Map.class), isA(Map.class), eq("https://example.org/example"), eq("text/plain"), isA(String[].class),
        isA(TypeReference.class));
    verify(apiClient, atLeast(1)).parameterToPairs(eq(""), Mockito.<String>any(), isA(Object.class));
    verify(apiClient).parameterToString(isA(Object.class));
    verify(apiClient).selectHeaderAccept(isA(String[].class));
    verify(apiClient).selectHeaderContentType(isA(String[].class));
    assertSame(apiResponse, actualV2HealthCheckGetWithHttpInfoResult);
  }

  /**
   * Test {@link SystemApi#v3ExtendedHealth()}.
   * <ul>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SystemApi#v3ExtendedHealth()}
   */
  @Test
  @DisplayName("Test v3ExtendedHealth(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V3Health SystemApi.v3ExtendedHealth()"})
  void testV3ExtendedHealth_thenReturnNull() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    when(apiClient.invokeAPI(Mockito.<String>any(), Mockito.<String>any(), Mockito.<List<Pair>>any(),
        Mockito.<Object>any(), Mockito.<Map<String, String>>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, Object>>any(), Mockito.<String>any(), Mockito.<String>any(), Mockito.<String[]>any(),
        Mockito.<TypeReference<Object>>any())).thenReturn(new ApiResponse<>(1, new HashMap<>()));
    when(apiClient.selectHeaderAccept(isA(String[].class))).thenReturn("https://example.org/example");
    when(apiClient.selectHeaderContentType(isA(String[].class))).thenReturn("text/plain");

    // Act
    V3Health actualV3ExtendedHealthResult = (new SystemApi(apiClient)).v3ExtendedHealth();

    // Assert
    verify(apiClient).invokeAPI(eq("/v3/health/extended"), eq("GET"), isA(List.class), isNull(), isA(Map.class),
        isA(Map.class), isA(Map.class), eq("https://example.org/example"), eq("text/plain"), isA(String[].class),
        isA(TypeReference.class));
    verify(apiClient).selectHeaderAccept(isA(String[].class));
    verify(apiClient).selectHeaderContentType(isA(String[].class));
    assertNull(actualV3ExtendedHealthResult);
  }

  /**
   * Test {@link SystemApi#v3ExtendedHealthWithHttpInfo()}.
   * <p>
   * Method under test: {@link SystemApi#v3ExtendedHealthWithHttpInfo()}
   */
  @Test
  @DisplayName("Test v3ExtendedHealthWithHttpInfo()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiResponse SystemApi.v3ExtendedHealthWithHttpInfo()"})
  void testV3ExtendedHealthWithHttpInfo() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    ApiResponse<Object> apiResponse = new ApiResponse<>(1, new HashMap<>());

    when(apiClient.invokeAPI(Mockito.<String>any(), Mockito.<String>any(), Mockito.<List<Pair>>any(),
        Mockito.<Object>any(), Mockito.<Map<String, String>>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, Object>>any(), Mockito.<String>any(), Mockito.<String>any(), Mockito.<String[]>any(),
        Mockito.<TypeReference<Object>>any())).thenReturn(apiResponse);
    when(apiClient.selectHeaderAccept(isA(String[].class))).thenReturn("https://example.org/example");
    when(apiClient.selectHeaderContentType(isA(String[].class))).thenReturn("text/plain");

    // Act
    ApiResponse<V3Health> actualV3ExtendedHealthWithHttpInfoResult = (new SystemApi(apiClient))
        .v3ExtendedHealthWithHttpInfo();

    // Assert
    verify(apiClient).invokeAPI(eq("/v3/health/extended"), eq("GET"), isA(List.class), isNull(), isA(Map.class),
        isA(Map.class), isA(Map.class), eq("https://example.org/example"), eq("text/plain"), isA(String[].class),
        isA(TypeReference.class));
    verify(apiClient).selectHeaderAccept(isA(String[].class));
    verify(apiClient).selectHeaderContentType(isA(String[].class));
    assertSame(apiResponse, actualV3ExtendedHealthWithHttpInfoResult);
  }

  /**
   * Test {@link SystemApi#v3Health()}.
   * <ul>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SystemApi#v3Health()}
   */
  @Test
  @DisplayName("Test v3Health(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V3Health SystemApi.v3Health()"})
  void testV3Health_thenReturnNull() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    when(apiClient.invokeAPI(Mockito.<String>any(), Mockito.<String>any(), Mockito.<List<Pair>>any(),
        Mockito.<Object>any(), Mockito.<Map<String, String>>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, Object>>any(), Mockito.<String>any(), Mockito.<String>any(), Mockito.<String[]>any(),
        Mockito.<TypeReference<Object>>any())).thenReturn(new ApiResponse<>(1, new HashMap<>()));
    when(apiClient.selectHeaderAccept(isA(String[].class))).thenReturn("https://example.org/example");
    when(apiClient.selectHeaderContentType(isA(String[].class))).thenReturn("text/plain");

    // Act
    V3Health actualV3HealthResult = (new SystemApi(apiClient)).v3Health();

    // Assert
    verify(apiClient).invokeAPI(eq("/v3/health"), eq("GET"), isA(List.class), isNull(), isA(Map.class), isA(Map.class),
        isA(Map.class), eq("https://example.org/example"), eq("text/plain"), isA(String[].class),
        isA(TypeReference.class));
    verify(apiClient).selectHeaderAccept(isA(String[].class));
    verify(apiClient).selectHeaderContentType(isA(String[].class));
    assertNull(actualV3HealthResult);
  }

  /**
   * Test {@link SystemApi#v3HealthWithHttpInfo()}.
   * <p>
   * Method under test: {@link SystemApi#v3HealthWithHttpInfo()}
   */
  @Test
  @DisplayName("Test v3HealthWithHttpInfo()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiResponse SystemApi.v3HealthWithHttpInfo()"})
  void testV3HealthWithHttpInfo() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    ApiResponse<Object> apiResponse = new ApiResponse<>(1, new HashMap<>());

    when(apiClient.invokeAPI(Mockito.<String>any(), Mockito.<String>any(), Mockito.<List<Pair>>any(),
        Mockito.<Object>any(), Mockito.<Map<String, String>>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, Object>>any(), Mockito.<String>any(), Mockito.<String>any(), Mockito.<String[]>any(),
        Mockito.<TypeReference<Object>>any())).thenReturn(apiResponse);
    when(apiClient.selectHeaderAccept(isA(String[].class))).thenReturn("https://example.org/example");
    when(apiClient.selectHeaderContentType(isA(String[].class))).thenReturn("text/plain");

    // Act
    ApiResponse<V3Health> actualV3HealthWithHttpInfoResult = (new SystemApi(apiClient)).v3HealthWithHttpInfo();

    // Assert
    verify(apiClient).invokeAPI(eq("/v3/health"), eq("GET"), isA(List.class), isNull(), isA(Map.class), isA(Map.class),
        isA(Map.class), eq("https://example.org/example"), eq("text/plain"), isA(String[].class),
        isA(TypeReference.class));
    verify(apiClient).selectHeaderAccept(isA(String[].class));
    verify(apiClient).selectHeaderContentType(isA(String[].class));
    assertSame(apiResponse, actualV3HealthWithHttpInfoResult);
  }
}
