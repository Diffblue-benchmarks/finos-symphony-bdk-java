package com.symphony.bdk.gen.api;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.Languages;
import com.symphony.bdk.gen.api.model.PodCertificate;
import com.symphony.bdk.http.api.ApiClient;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.api.ApiResponse;
import com.symphony.bdk.http.api.Pair;
import com.symphony.bdk.http.api.util.TypeReference;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import jakarta.ws.rs.client.Client;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PodApiDiffblueTest {
  /**
   * Test {@link PodApi#v1FilesAllowedTypesGet(String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PodApi#v1FilesAllowedTypesGet(String)}
   */
  @Test
  @DisplayName("Test v1FilesAllowedTypesGet(String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List PodApi.v1FilesAllowedTypesGet(String)"})
  void testV1FilesAllowedTypesGet_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class, () -> (new PodApi(new ApiClientJersey2(mock(Client.class),
        "https://example.org/example", defaultHeaders, "https://example.org/example"))).v1FilesAllowedTypesGet(null));
  }

  /**
   * Test {@link PodApi#v1FilesAllowedTypesGetWithHttpInfo(String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PodApi#v1FilesAllowedTypesGetWithHttpInfo(String)}
   */
  @Test
  @DisplayName("Test v1FilesAllowedTypesGetWithHttpInfo(String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiResponse PodApi.v1FilesAllowedTypesGetWithHttpInfo(String)"})
  void testV1FilesAllowedTypesGetWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new PodApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1FilesAllowedTypesGetWithHttpInfo(null));
  }

  /**
   * Test {@link PodApi#v1LanguagesGet()}.
   * <ul>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PodApi#v1LanguagesGet()}
   */
  @Test
  @DisplayName("Test v1LanguagesGet(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Languages PodApi.v1LanguagesGet()"})
  void testV1LanguagesGet_thenReturnNull() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    when(apiClient.invokeAPI(Mockito.<String>any(), Mockito.<String>any(), Mockito.<List<Pair>>any(),
        Mockito.<Object>any(), Mockito.<Map<String, String>>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, Object>>any(), Mockito.<String>any(), Mockito.<String>any(), Mockito.<String[]>any(),
        Mockito.<TypeReference<Object>>any())).thenReturn(new ApiResponse<>(1, new HashMap<>()));
    when(apiClient.selectHeaderAccept(isA(String[].class))).thenReturn("https://example.org/example");
    when(apiClient.selectHeaderContentType(isA(String[].class))).thenReturn("text/plain");

    // Act
    Languages actualV1LanguagesGetResult = (new PodApi(apiClient)).v1LanguagesGet();

    // Assert
    verify(apiClient).invokeAPI(eq("/v1/languages"), eq("GET"), isA(List.class), isNull(), isA(Map.class),
        isA(Map.class), isA(Map.class), eq("https://example.org/example"), eq("text/plain"), isA(String[].class),
        isA(TypeReference.class));
    verify(apiClient).selectHeaderAccept(isA(String[].class));
    verify(apiClient).selectHeaderContentType(isA(String[].class));
    assertNull(actualV1LanguagesGetResult);
  }

  /**
   * Test {@link PodApi#v1LanguagesGetWithHttpInfo()}.
   * <p>
   * Method under test: {@link PodApi#v1LanguagesGetWithHttpInfo()}
   */
  @Test
  @DisplayName("Test v1LanguagesGetWithHttpInfo()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiResponse PodApi.v1LanguagesGetWithHttpInfo()"})
  void testV1LanguagesGetWithHttpInfo() throws ApiException {
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
    ApiResponse<Languages> actualV1LanguagesGetWithHttpInfoResult = (new PodApi(apiClient))
        .v1LanguagesGetWithHttpInfo();

    // Assert
    verify(apiClient).invokeAPI(eq("/v1/languages"), eq("GET"), isA(List.class), isNull(), isA(Map.class),
        isA(Map.class), isA(Map.class), eq("https://example.org/example"), eq("text/plain"), isA(String[].class),
        isA(TypeReference.class));
    verify(apiClient).selectHeaderAccept(isA(String[].class));
    verify(apiClient).selectHeaderContentType(isA(String[].class));
    assertSame(apiResponse, actualV1LanguagesGetWithHttpInfoResult);
  }

  /**
   * Test {@link PodApi#v1PodcertGet()}.
   * <ul>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PodApi#v1PodcertGet()}
   */
  @Test
  @DisplayName("Test v1PodcertGet(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"PodCertificate PodApi.v1PodcertGet()"})
  void testV1PodcertGet_thenReturnNull() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    when(apiClient.invokeAPI(Mockito.<String>any(), Mockito.<String>any(), Mockito.<List<Pair>>any(),
        Mockito.<Object>any(), Mockito.<Map<String, String>>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, Object>>any(), Mockito.<String>any(), Mockito.<String>any(), Mockito.<String[]>any(),
        Mockito.<TypeReference<Object>>any())).thenReturn(new ApiResponse<>(1, new HashMap<>()));
    when(apiClient.selectHeaderAccept(isA(String[].class))).thenReturn("https://example.org/example");
    when(apiClient.selectHeaderContentType(isA(String[].class))).thenReturn("text/plain");

    // Act
    PodCertificate actualV1PodcertGetResult = (new PodApi(apiClient)).v1PodcertGet();

    // Assert
    verify(apiClient).invokeAPI(eq("/v1/podcert"), eq("GET"), isA(List.class), isNull(), isA(Map.class), isA(Map.class),
        isA(Map.class), eq("https://example.org/example"), eq("text/plain"), isA(String[].class),
        isA(TypeReference.class));
    verify(apiClient).selectHeaderAccept(isA(String[].class));
    verify(apiClient).selectHeaderContentType(isA(String[].class));
    assertNull(actualV1PodcertGetResult);
  }

  /**
   * Test {@link PodApi#v1PodcertGetWithHttpInfo()}.
   * <p>
   * Method under test: {@link PodApi#v1PodcertGetWithHttpInfo()}
   */
  @Test
  @DisplayName("Test v1PodcertGetWithHttpInfo()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiResponse PodApi.v1PodcertGetWithHttpInfo()"})
  void testV1PodcertGetWithHttpInfo() throws ApiException {
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
    ApiResponse<PodCertificate> actualV1PodcertGetWithHttpInfoResult = (new PodApi(apiClient))
        .v1PodcertGetWithHttpInfo();

    // Assert
    verify(apiClient).invokeAPI(eq("/v1/podcert"), eq("GET"), isA(List.class), isNull(), isA(Map.class), isA(Map.class),
        isA(Map.class), eq("https://example.org/example"), eq("text/plain"), isA(String[].class),
        isA(TypeReference.class));
    verify(apiClient).selectHeaderAccept(isA(String[].class));
    verify(apiClient).selectHeaderContentType(isA(String[].class));
    assertSame(apiResponse, actualV1PodcertGetWithHttpInfoResult);
  }
}
