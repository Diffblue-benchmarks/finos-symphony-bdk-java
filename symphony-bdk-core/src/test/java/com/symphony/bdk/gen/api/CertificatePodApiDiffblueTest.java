package com.symphony.bdk.gen.api;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.PodCertificate;
import com.symphony.bdk.http.api.ApiClient;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.api.ApiResponse;
import com.symphony.bdk.http.api.Pair;
import com.symphony.bdk.http.api.util.TypeReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CertificatePodApiDiffblueTest {
  /**
   * Test {@link CertificatePodApi#v1AppPodCertificateGet()}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CertificatePodApi#v1AppPodCertificateGet()}
   */
  @Test
  @DisplayName("Test v1AppPodCertificateGet(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PodCertificate CertificatePodApi.v1AppPodCertificateGet()"})
  void testV1AppPodCertificateGet_thenReturnNull() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    ApiResponse<Object> apiResponse = new ApiResponse<>(1, new HashMap<>());
    when(apiClient.invokeAPI(
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<List<Pair>>any(),
            Mockito.<Object>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, Object>>any(),
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<String[]>any(),
            Mockito.<TypeReference<Object>>any()))
        .thenReturn(apiResponse);
    when(apiClient.selectHeaderAccept(isA(String[].class)))
        .thenReturn("https://example.org/example");
    when(apiClient.selectHeaderContentType(isA(String[].class))).thenReturn("text/plain");

    // Act
    PodCertificate actualV1AppPodCertificateGetResult =
        new CertificatePodApi(apiClient).v1AppPodCertificateGet();

    // Assert
    verify(apiClient)
        .invokeAPI(
            eq("/v1/app/pod/certificate"),
            eq("GET"),
            isA(List.class),
            isNull(),
            isA(Map.class),
            isA(Map.class),
            isA(Map.class),
            eq("https://example.org/example"),
            eq("text/plain"),
            isA(String[].class),
            isA(TypeReference.class));
    verify(apiClient).selectHeaderAccept(isA(String[].class));
    verify(apiClient).selectHeaderContentType(isA(String[].class));
    assertNull(actualV1AppPodCertificateGetResult);
  }

  /**
   * Test {@link CertificatePodApi#v1AppPodCertificateGetWithHttpInfo()}.
   *
   * <p>Method under test: {@link CertificatePodApi#v1AppPodCertificateGetWithHttpInfo()}
   */
  @Test
  @DisplayName("Test v1AppPodCertificateGetWithHttpInfo()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiResponse CertificatePodApi.v1AppPodCertificateGetWithHttpInfo()"})
  void testV1AppPodCertificateGetWithHttpInfo() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    ApiResponse<Object> apiResponse = new ApiResponse<>(1, new HashMap<>());
    when(apiClient.invokeAPI(
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<List<Pair>>any(),
            Mockito.<Object>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, Object>>any(),
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<String[]>any(),
            Mockito.<TypeReference<Object>>any()))
        .thenReturn(apiResponse);
    when(apiClient.selectHeaderAccept(isA(String[].class)))
        .thenReturn("https://example.org/example");
    when(apiClient.selectHeaderContentType(isA(String[].class))).thenReturn("text/plain");

    // Act
    ApiResponse<PodCertificate> actualV1AppPodCertificateGetWithHttpInfoResult =
        new CertificatePodApi(apiClient).v1AppPodCertificateGetWithHttpInfo();

    // Assert
    verify(apiClient)
        .invokeAPI(
            eq("/v1/app/pod/certificate"),
            eq("GET"),
            isA(List.class),
            isNull(),
            isA(Map.class),
            isA(Map.class),
            isA(Map.class),
            eq("https://example.org/example"),
            eq("text/plain"),
            isA(String[].class),
            isA(TypeReference.class));
    verify(apiClient).selectHeaderAccept(isA(String[].class));
    verify(apiClient).selectHeaderContentType(isA(String[].class));
    assertSame(apiResponse, actualV1AppPodCertificateGetWithHttpInfoResult);
  }
}
