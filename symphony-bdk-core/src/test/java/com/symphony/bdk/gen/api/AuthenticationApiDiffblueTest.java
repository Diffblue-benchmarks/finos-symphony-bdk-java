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
import com.symphony.bdk.gen.api.model.AuthenticateExtensionAppRequest;
import com.symphony.bdk.gen.api.model.AuthenticateRequest;
import com.symphony.bdk.gen.api.model.Jwks;
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

class AuthenticationApiDiffblueTest {
  /**
   * Test {@link AuthenticationApi#idmKeysGet()}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticationApi#idmKeysGet()}
   */
  @Test
  @DisplayName("Test idmKeysGet(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Jwks AuthenticationApi.idmKeysGet()"})
  void testIdmKeysGet_thenReturnNull() throws ApiException {
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
    Jwks actualIdmKeysGetResult = new AuthenticationApi(apiClient).idmKeysGet();

    // Assert
    verify(apiClient)
        .invokeAPI(
            eq("/idm/keys"),
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
    assertNull(actualIdmKeysGetResult);
  }

  /**
   * Test {@link AuthenticationApi#idmKeysGetWithHttpInfo()}.
   *
   * <p>Method under test: {@link AuthenticationApi#idmKeysGetWithHttpInfo()}
   */
  @Test
  @DisplayName("Test idmKeysGetWithHttpInfo()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiResponse AuthenticationApi.idmKeysGetWithHttpInfo()"})
  void testIdmKeysGetWithHttpInfo() throws ApiException {
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
    ApiResponse<Jwks> actualIdmKeysGetWithHttpInfoResult =
        new AuthenticationApi(apiClient).idmKeysGetWithHttpInfo();

    // Assert
    verify(apiClient)
        .invokeAPI(
            eq("/idm/keys"),
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
    assertSame(apiResponse, actualIdmKeysGetWithHttpInfoResult);
  }

  /**
   * Test {@link AuthenticationApi#idmTokensPost(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticationApi#idmTokensPost(String, String)}
   */
  @Test
  @DisplayName("Test idmTokensPost(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.JwtToken AuthenticationApi.idmTokensPost(String, String)"
  })
  void testIdmTokensPost_whenNull_thenThrowApiException() throws ApiException {
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
        ApiException.class, () -> new AuthenticationApi(apiClient).idmTokensPost(null, "Scope"));
  }

  /**
   * Test {@link AuthenticationApi#idmTokensPostWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticationApi#idmTokensPostWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test idmTokensPostWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiResponse AuthenticationApi.idmTokensPostWithHttpInfo(String, String)"})
  void testIdmTokensPostWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
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
            new AuthenticationApi(apiClient)
                .idmTokensPostWithHttpInfo(null, "https://example.org/example"));
  }

  /**
   * Test {@link AuthenticationApi#pubkeyAppAuthenticatePost(AuthenticateRequest)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticationApi#pubkeyAppAuthenticatePost(AuthenticateRequest)}
   */
  @Test
  @DisplayName("Test pubkeyAppAuthenticatePost(AuthenticateRequest); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.Token AuthenticationApi.pubkeyAppAuthenticatePost(AuthenticateRequest)"
  })
  void testPubkeyAppAuthenticatePost_thenThrowApiException() throws ApiException {
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
        ApiException.class, () -> new AuthenticationApi(apiClient).pubkeyAppAuthenticatePost(null));
  }

  /**
   * Test {@link AuthenticationApi#pubkeyAppAuthenticatePostWithHttpInfo(AuthenticateRequest)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * AuthenticationApi#pubkeyAppAuthenticatePostWithHttpInfo(AuthenticateRequest)}
   */
  @Test
  @DisplayName(
      "Test pubkeyAppAuthenticatePostWithHttpInfo(AuthenticateRequest); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse AuthenticationApi.pubkeyAppAuthenticatePostWithHttpInfo(AuthenticateRequest)"
  })
  void testPubkeyAppAuthenticatePostWithHttpInfo_thenThrowApiException() throws ApiException {
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
        () -> new AuthenticationApi(apiClient).pubkeyAppAuthenticatePostWithHttpInfo(null));
  }

  /**
   * Test {@link AuthenticationApi#pubkeyAppUserUserIdAuthenticatePost(String, Long)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticationApi#pubkeyAppUserUserIdAuthenticatePost(String,
   * Long)}
   */
  @Test
  @DisplayName(
      "Test pubkeyAppUserUserIdAuthenticatePost(String, Long); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.Token AuthenticationApi.pubkeyAppUserUserIdAuthenticatePost(String, Long)"
  })
  void testPubkeyAppUserUserIdAuthenticatePost_whenNull_thenThrowApiException()
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
        () -> new AuthenticationApi(apiClient).pubkeyAppUserUserIdAuthenticatePost(null, 1L));
  }

  /**
   * Test {@link AuthenticationApi#pubkeyAppUserUserIdAuthenticatePost(String, Long)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticationApi#pubkeyAppUserUserIdAuthenticatePost(String,
   * Long)}
   */
  @Test
  @DisplayName(
      "Test pubkeyAppUserUserIdAuthenticatePost(String, Long); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.Token AuthenticationApi.pubkeyAppUserUserIdAuthenticatePost(String, Long)"
  })
  void testPubkeyAppUserUserIdAuthenticatePost_whenNull_thenThrowApiException2()
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
        () -> new AuthenticationApi(apiClient).pubkeyAppUserUserIdAuthenticatePost("ABC123", null));
  }

  /**
   * Test {@link AuthenticationApi#pubkeyAppUserUserIdAuthenticatePostWithHttpInfo(String, Long)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * AuthenticationApi#pubkeyAppUserUserIdAuthenticatePostWithHttpInfo(String, Long)}
   */
  @Test
  @DisplayName(
      "Test pubkeyAppUserUserIdAuthenticatePostWithHttpInfo(String, Long); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse AuthenticationApi.pubkeyAppUserUserIdAuthenticatePostWithHttpInfo(String, Long)"
  })
  void testPubkeyAppUserUserIdAuthenticatePostWithHttpInfo_thenThrowApiException()
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
            new AuthenticationApi(apiClient)
                .pubkeyAppUserUserIdAuthenticatePostWithHttpInfo(null, 1L));
  }

  /**
   * Test {@link AuthenticationApi#pubkeyAppUserUserIdAuthenticatePostWithHttpInfo(String, Long)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * AuthenticationApi#pubkeyAppUserUserIdAuthenticatePostWithHttpInfo(String, Long)}
   */
  @Test
  @DisplayName(
      "Test pubkeyAppUserUserIdAuthenticatePostWithHttpInfo(String, Long); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse AuthenticationApi.pubkeyAppUserUserIdAuthenticatePostWithHttpInfo(String, Long)"
  })
  void testPubkeyAppUserUserIdAuthenticatePostWithHttpInfo_thenThrowApiException2()
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
            new AuthenticationApi(apiClient)
                .pubkeyAppUserUserIdAuthenticatePostWithHttpInfo(
                    "https://example.org/example", null));
  }

  /**
   * Test {@link AuthenticationApi#pubkeyAppUsernameUsernameAuthenticatePost(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * AuthenticationApi#pubkeyAppUsernameUsernameAuthenticatePost(String, String)}
   */
  @Test
  @DisplayName(
      "Test pubkeyAppUsernameUsernameAuthenticatePost(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.Token AuthenticationApi.pubkeyAppUsernameUsernameAuthenticatePost(String, String)"
  })
  void testPubkeyAppUsernameUsernameAuthenticatePost_whenNull_thenThrowApiException()
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
            new AuthenticationApi(apiClient)
                .pubkeyAppUsernameUsernameAuthenticatePost(null, "janedoe"));
  }

  /**
   * Test {@link AuthenticationApi#pubkeyAppUsernameUsernameAuthenticatePost(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * AuthenticationApi#pubkeyAppUsernameUsernameAuthenticatePost(String, String)}
   */
  @Test
  @DisplayName(
      "Test pubkeyAppUsernameUsernameAuthenticatePost(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.Token AuthenticationApi.pubkeyAppUsernameUsernameAuthenticatePost(String, String)"
  })
  void testPubkeyAppUsernameUsernameAuthenticatePost_whenNull_thenThrowApiException2()
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
            new AuthenticationApi(apiClient)
                .pubkeyAppUsernameUsernameAuthenticatePost("ABC123", null));
  }

  /**
   * Test {@link AuthenticationApi#pubkeyAppUsernameUsernameAuthenticatePostWithHttpInfo(String,
   * String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * AuthenticationApi#pubkeyAppUsernameUsernameAuthenticatePostWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test pubkeyAppUsernameUsernameAuthenticatePostWithHttpInfo(String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse AuthenticationApi.pubkeyAppUsernameUsernameAuthenticatePostWithHttpInfo(String, String)"
  })
  void testPubkeyAppUsernameUsernameAuthenticatePostWithHttpInfo_thenThrowApiException()
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
            new AuthenticationApi(apiClient)
                .pubkeyAppUsernameUsernameAuthenticatePostWithHttpInfo(null, "janedoe"));
  }

  /**
   * Test {@link AuthenticationApi#pubkeyAppUsernameUsernameAuthenticatePostWithHttpInfo(String,
   * String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * AuthenticationApi#pubkeyAppUsernameUsernameAuthenticatePostWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test pubkeyAppUsernameUsernameAuthenticatePostWithHttpInfo(String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse AuthenticationApi.pubkeyAppUsernameUsernameAuthenticatePostWithHttpInfo(String, String)"
  })
  void testPubkeyAppUsernameUsernameAuthenticatePostWithHttpInfo_thenThrowApiException2()
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
            new AuthenticationApi(apiClient)
                .pubkeyAppUsernameUsernameAuthenticatePostWithHttpInfo(
                    "https://example.org/example", null));
  }

  /**
   * Test {@link AuthenticationApi#pubkeyAuthenticatePost(AuthenticateRequest)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticationApi#pubkeyAuthenticatePost(AuthenticateRequest)}
   */
  @Test
  @DisplayName("Test pubkeyAuthenticatePost(AuthenticateRequest); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.Token AuthenticationApi.pubkeyAuthenticatePost(AuthenticateRequest)"
  })
  void testPubkeyAuthenticatePost_thenThrowApiException() throws ApiException {
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
        ApiException.class, () -> new AuthenticationApi(apiClient).pubkeyAuthenticatePost(null));
  }

  /**
   * Test {@link AuthenticationApi#pubkeyAuthenticatePostWithHttpInfo(AuthenticateRequest)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * AuthenticationApi#pubkeyAuthenticatePostWithHttpInfo(AuthenticateRequest)}
   */
  @Test
  @DisplayName(
      "Test pubkeyAuthenticatePostWithHttpInfo(AuthenticateRequest); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse AuthenticationApi.pubkeyAuthenticatePostWithHttpInfo(AuthenticateRequest)"
  })
  void testPubkeyAuthenticatePostWithHttpInfo_thenThrowApiException() throws ApiException {
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
        () -> new AuthenticationApi(apiClient).pubkeyAuthenticatePostWithHttpInfo(null));
  }

  /**
   * Test {@link
   * AuthenticationApi#v1PubkeyAppAuthenticateExtensionAppPost(AuthenticateExtensionAppRequest)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * AuthenticationApi#v1PubkeyAppAuthenticateExtensionAppPost(AuthenticateExtensionAppRequest)}
   */
  @Test
  @DisplayName(
      "Test v1PubkeyAppAuthenticateExtensionAppPost(AuthenticateExtensionAppRequest); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.ExtensionAppTokens AuthenticationApi.v1PubkeyAppAuthenticateExtensionAppPost(AuthenticateExtensionAppRequest)"
  })
  void testV1PubkeyAppAuthenticateExtensionAppPost_thenThrowApiException() throws ApiException {
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
        () -> new AuthenticationApi(apiClient).v1PubkeyAppAuthenticateExtensionAppPost(null));
  }

  /**
   * Test {@link
   * AuthenticationApi#v1PubkeyAppAuthenticateExtensionAppPostWithHttpInfo(AuthenticateExtensionAppRequest)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * AuthenticationApi#v1PubkeyAppAuthenticateExtensionAppPostWithHttpInfo(AuthenticateExtensionAppRequest)}
   */
  @Test
  @DisplayName(
      "Test v1PubkeyAppAuthenticateExtensionAppPostWithHttpInfo(AuthenticateExtensionAppRequest); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse AuthenticationApi.v1PubkeyAppAuthenticateExtensionAppPostWithHttpInfo(AuthenticateExtensionAppRequest)"
  })
  void testV1PubkeyAppAuthenticateExtensionAppPostWithHttpInfo_thenThrowApiException()
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
            new AuthenticationApi(apiClient)
                .v1PubkeyAppAuthenticateExtensionAppPostWithHttpInfo(null));
  }
}
