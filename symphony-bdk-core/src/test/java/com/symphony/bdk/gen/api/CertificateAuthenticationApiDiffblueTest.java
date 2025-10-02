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
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.ExtensionAppAuthenticateRequest;
import com.symphony.bdk.gen.api.model.Token;
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

class CertificateAuthenticationApiDiffblueTest {
  /**
   * Test {@link CertificateAuthenticationApi#v1AppAuthenticatePost()}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CertificateAuthenticationApi#v1AppAuthenticatePost()}
   */
  @Test
  @DisplayName("Test v1AppAuthenticatePost(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Token CertificateAuthenticationApi.v1AppAuthenticatePost()"})
  void testV1AppAuthenticatePost_thenReturnNull() throws ApiException {
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
    Token actualV1AppAuthenticatePostResult =
        new CertificateAuthenticationApi(apiClient).v1AppAuthenticatePost();

    // Assert
    verify(apiClient)
        .invokeAPI(
            eq("/v1/app/authenticate"),
            eq("POST"),
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
    assertNull(actualV1AppAuthenticatePostResult);
  }

  /**
   * Test {@link CertificateAuthenticationApi#v1AppAuthenticatePostWithHttpInfo()}.
   *
   * <p>Method under test: {@link CertificateAuthenticationApi#v1AppAuthenticatePostWithHttpInfo()}
   */
  @Test
  @DisplayName("Test v1AppAuthenticatePostWithHttpInfo()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse CertificateAuthenticationApi.v1AppAuthenticatePostWithHttpInfo()"
  })
  void testV1AppAuthenticatePostWithHttpInfo() throws ApiException {
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
    ApiResponse<Token> actualV1AppAuthenticatePostWithHttpInfoResult =
        new CertificateAuthenticationApi(apiClient).v1AppAuthenticatePostWithHttpInfo();

    // Assert
    verify(apiClient)
        .invokeAPI(
            eq("/v1/app/authenticate"),
            eq("POST"),
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
    assertSame(apiResponse, actualV1AppAuthenticatePostWithHttpInfoResult);
  }

  /**
   * Test {@link CertificateAuthenticationApi#v1AppUserUidAuthenticatePost(Long, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link CertificateAuthenticationApi#v1AppUserUidAuthenticatePost(Long,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v1AppUserUidAuthenticatePost(Long, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.OboAuthResponse CertificateAuthenticationApi.v1AppUserUidAuthenticatePost(Long, String)"
  })
  void testV1AppUserUidAuthenticatePost_whenNull_thenThrowApiException() throws ApiException {
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
            new CertificateAuthenticationApi(apiClient)
                .v1AppUserUidAuthenticatePost(null, "ABC123"));
  }

  /**
   * Test {@link CertificateAuthenticationApi#v1AppUserUidAuthenticatePost(Long, String)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link CertificateAuthenticationApi#v1AppUserUidAuthenticatePost(Long,
   * String)}
   */
  @Test
  @DisplayName("Test v1AppUserUidAuthenticatePost(Long, String); when one; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.OboAuthResponse CertificateAuthenticationApi.v1AppUserUidAuthenticatePost(Long, String)"
  })
  void testV1AppUserUidAuthenticatePost_whenOne_thenThrowApiException() throws ApiException {
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
        () -> new CertificateAuthenticationApi(apiClient).v1AppUserUidAuthenticatePost(1L, null));
  }

  /**
   * Test {@link CertificateAuthenticationApi#v1AppUserUidAuthenticatePostWithHttpInfo(Long,
   * String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * CertificateAuthenticationApi#v1AppUserUidAuthenticatePostWithHttpInfo(Long, String)}
   */
  @Test
  @DisplayName(
      "Test v1AppUserUidAuthenticatePostWithHttpInfo(Long, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse CertificateAuthenticationApi.v1AppUserUidAuthenticatePostWithHttpInfo(Long, String)"
  })
  void testV1AppUserUidAuthenticatePostWithHttpInfo_whenNull_thenThrowApiException()
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
            new CertificateAuthenticationApi(apiClient)
                .v1AppUserUidAuthenticatePostWithHttpInfo(null, "https://example.org/example"));
  }

  /**
   * Test {@link CertificateAuthenticationApi#v1AppUserUidAuthenticatePostWithHttpInfo(Long,
   * String)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * CertificateAuthenticationApi#v1AppUserUidAuthenticatePostWithHttpInfo(Long, String)}
   */
  @Test
  @DisplayName(
      "Test v1AppUserUidAuthenticatePostWithHttpInfo(Long, String); when one; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse CertificateAuthenticationApi.v1AppUserUidAuthenticatePostWithHttpInfo(Long, String)"
  })
  void testV1AppUserUidAuthenticatePostWithHttpInfo_whenOne_thenThrowApiException()
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
            new CertificateAuthenticationApi(apiClient)
                .v1AppUserUidAuthenticatePostWithHttpInfo(1L, null));
  }

  /**
   * Test {@link CertificateAuthenticationApi#v1AppUsernameUsernameAuthenticatePost(String,
   * String)}.
   *
   * <ul>
   *   <li>When {@code janedoe}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * CertificateAuthenticationApi#v1AppUsernameUsernameAuthenticatePost(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1AppUsernameUsernameAuthenticatePost(String, String); when 'janedoe'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.OboAuthResponse CertificateAuthenticationApi.v1AppUsernameUsernameAuthenticatePost(String, String)"
  })
  void testV1AppUsernameUsernameAuthenticatePost_whenJanedoe_thenThrowApiException()
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
            new CertificateAuthenticationApi(apiClient)
                .v1AppUsernameUsernameAuthenticatePost("janedoe", null));
  }

  /**
   * Test {@link CertificateAuthenticationApi#v1AppUsernameUsernameAuthenticatePost(String,
   * String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * CertificateAuthenticationApi#v1AppUsernameUsernameAuthenticatePost(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1AppUsernameUsernameAuthenticatePost(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.OboAuthResponse CertificateAuthenticationApi.v1AppUsernameUsernameAuthenticatePost(String, String)"
  })
  void testV1AppUsernameUsernameAuthenticatePost_whenNull_thenThrowApiException()
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
            new CertificateAuthenticationApi(apiClient)
                .v1AppUsernameUsernameAuthenticatePost(null, "ABC123"));
  }

  /**
   * Test {@link
   * CertificateAuthenticationApi#v1AppUsernameUsernameAuthenticatePostWithHttpInfo(String,
   * String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * CertificateAuthenticationApi#v1AppUsernameUsernameAuthenticatePostWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1AppUsernameUsernameAuthenticatePostWithHttpInfo(String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse CertificateAuthenticationApi.v1AppUsernameUsernameAuthenticatePostWithHttpInfo(String, String)"
  })
  void testV1AppUsernameUsernameAuthenticatePostWithHttpInfo_thenThrowApiException()
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
            new CertificateAuthenticationApi(apiClient)
                .v1AppUsernameUsernameAuthenticatePostWithHttpInfo(
                    null, "https://example.org/example"));
  }

  /**
   * Test {@link
   * CertificateAuthenticationApi#v1AppUsernameUsernameAuthenticatePostWithHttpInfo(String,
   * String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * CertificateAuthenticationApi#v1AppUsernameUsernameAuthenticatePostWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1AppUsernameUsernameAuthenticatePostWithHttpInfo(String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse CertificateAuthenticationApi.v1AppUsernameUsernameAuthenticatePostWithHttpInfo(String, String)"
  })
  void testV1AppUsernameUsernameAuthenticatePostWithHttpInfo_thenThrowApiException2()
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
            new CertificateAuthenticationApi(apiClient)
                .v1AppUsernameUsernameAuthenticatePostWithHttpInfo("janedoe", null));
  }

  /**
   * Test {@link
   * CertificateAuthenticationApi#v1AuthenticateExtensionAppPost(ExtensionAppAuthenticateRequest)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * CertificateAuthenticationApi#v1AuthenticateExtensionAppPost(ExtensionAppAuthenticateRequest)}
   */
  @Test
  @DisplayName(
      "Test v1AuthenticateExtensionAppPost(ExtensionAppAuthenticateRequest); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.ExtensionAppTokens CertificateAuthenticationApi.v1AuthenticateExtensionAppPost(ExtensionAppAuthenticateRequest)"
  })
  void testV1AuthenticateExtensionAppPost_thenThrowApiException() throws ApiException {
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
        () -> new CertificateAuthenticationApi(apiClient).v1AuthenticateExtensionAppPost(null));
  }

  /**
   * Test {@link
   * CertificateAuthenticationApi#v1AuthenticateExtensionAppPostWithHttpInfo(ExtensionAppAuthenticateRequest)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * CertificateAuthenticationApi#v1AuthenticateExtensionAppPostWithHttpInfo(ExtensionAppAuthenticateRequest)}
   */
  @Test
  @DisplayName(
      "Test v1AuthenticateExtensionAppPostWithHttpInfo(ExtensionAppAuthenticateRequest); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse CertificateAuthenticationApi.v1AuthenticateExtensionAppPostWithHttpInfo(ExtensionAppAuthenticateRequest)"
  })
  void testV1AuthenticateExtensionAppPostWithHttpInfo_thenThrowApiException() throws ApiException {
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
            new CertificateAuthenticationApi(apiClient)
                .v1AuthenticateExtensionAppPostWithHttpInfo(null));
  }

  /**
   * Test {@link CertificateAuthenticationApi#v1AuthenticatePost()}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CertificateAuthenticationApi#v1AuthenticatePost()}
   */
  @Test
  @DisplayName("Test v1AuthenticatePost(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Token CertificateAuthenticationApi.v1AuthenticatePost()"})
  void testV1AuthenticatePost_thenReturnNull() throws ApiException {
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
    Token actualV1AuthenticatePostResult =
        new CertificateAuthenticationApi(apiClient).v1AuthenticatePost();

    // Assert
    verify(apiClient)
        .invokeAPI(
            eq("/v1/authenticate"),
            eq("POST"),
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
    assertNull(actualV1AuthenticatePostResult);
  }

  /**
   * Test {@link CertificateAuthenticationApi#v1AuthenticatePostWithHttpInfo()}.
   *
   * <p>Method under test: {@link CertificateAuthenticationApi#v1AuthenticatePostWithHttpInfo()}
   */
  @Test
  @DisplayName("Test v1AuthenticatePostWithHttpInfo()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiResponse CertificateAuthenticationApi.v1AuthenticatePostWithHttpInfo()"})
  void testV1AuthenticatePostWithHttpInfo() throws ApiException {
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
    ApiResponse<Token> actualV1AuthenticatePostWithHttpInfoResult =
        new CertificateAuthenticationApi(apiClient).v1AuthenticatePostWithHttpInfo();

    // Assert
    verify(apiClient)
        .invokeAPI(
            eq("/v1/authenticate"),
            eq("POST"),
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
    assertSame(apiResponse, actualV1AuthenticatePostWithHttpInfoResult);
  }

  /**
   * Test {@link CertificateAuthenticationApi#v1LogoutPost(String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link CertificateAuthenticationApi#v1LogoutPost(String)}
   */
  @Test
  @DisplayName("Test v1LogoutPost(String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.SuccessResponse CertificateAuthenticationApi.v1LogoutPost(String)"
  })
  void testV1LogoutPost_thenThrowApiException() throws ApiException {
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
        ApiException.class, () -> new CertificateAuthenticationApi(apiClient).v1LogoutPost(null));
  }

  /**
   * Test {@link CertificateAuthenticationApi#v1LogoutPostWithHttpInfo(String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link CertificateAuthenticationApi#v1LogoutPostWithHttpInfo(String)}
   */
  @Test
  @DisplayName("Test v1LogoutPostWithHttpInfo(String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiResponse CertificateAuthenticationApi.v1LogoutPostWithHttpInfo(String)"})
  void testV1LogoutPostWithHttpInfo_thenThrowApiException() throws ApiException {
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
        () -> new CertificateAuthenticationApi(apiClient).v1LogoutPostWithHttpInfo(null));
  }
}
