package com.symphony.bdk.core.auth.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.AppAuthSession;
import com.symphony.bdk.core.auth.ExtensionAppTokensRepository;
import com.symphony.bdk.core.auth.exception.AuthUnauthorizedException;
import com.symphony.bdk.core.config.model.BdkRetryConfig;
import com.symphony.bdk.core.test.BdkRetryConfigTestHelper;
import com.symphony.bdk.gen.api.model.ExtensionAppTokens;
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

class ExtensionAppAuthenticatorCertImplDiffblueTest {
  /**
   * Test {@link ExtensionAppAuthenticatorCertImpl#ExtensionAppAuthenticatorCertImpl(BdkRetryConfig,
   * String, ApiClient)}.
   *
   * <p>Method under test: {@link
   * ExtensionAppAuthenticatorCertImpl#ExtensionAppAuthenticatorCertImpl(BdkRetryConfig, String,
   * ApiClient)}
   */
  @Test
  @DisplayName("Test new ExtensionAppAuthenticatorCertImpl(BdkRetryConfig, String, ApiClient)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ExtensionAppAuthenticatorCertImpl.<init>(BdkRetryConfig, String, ApiClient)"
  })
  void testNewExtensionAppAuthenticatorCertImpl() {
    // Arrange
    BdkRetryConfig retryConfig = BdkRetryConfigTestHelper.ofMinimalInterval(3);

    // Act
    ExtensionAppAuthenticatorCertImpl actualExtensionAppAuthenticatorCertImpl =
        new ExtensionAppAuthenticatorCertImpl(retryConfig, "42", null);

    // Assert
    assertTrue(
        actualExtensionAppAuthenticatorCertImpl.tokensRepository
            instanceof InMemoryTokensRepository);
    assertEquals("42", actualExtensionAppAuthenticatorCertImpl.appId);
  }

  /**
   * Test {@link ExtensionAppAuthenticatorCertImpl#ExtensionAppAuthenticatorCertImpl(BdkRetryConfig,
   * String, ApiClient, ExtensionAppTokensRepository)}.
   *
   * <p>Method under test: {@link
   * ExtensionAppAuthenticatorCertImpl#ExtensionAppAuthenticatorCertImpl(BdkRetryConfig, String,
   * ApiClient, ExtensionAppTokensRepository)}
   */
  @Test
  @DisplayName(
      "Test new ExtensionAppAuthenticatorCertImpl(BdkRetryConfig, String, ApiClient, ExtensionAppTokensRepository)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ExtensionAppAuthenticatorCertImpl.<init>(BdkRetryConfig, String, ApiClient, ExtensionAppTokensRepository)"
  })
  void testNewExtensionAppAuthenticatorCertImpl2() {
    // Arrange
    BdkRetryConfig retryConfig = BdkRetryConfigTestHelper.ofMinimalInterval(3);

    // Act
    ExtensionAppAuthenticatorCertImpl actualExtensionAppAuthenticatorCertImpl =
        new ExtensionAppAuthenticatorCertImpl(
            retryConfig, "42", null, new InMemoryTokensRepository());

    // Assert
    assertTrue(
        actualExtensionAppAuthenticatorCertImpl.tokensRepository
            instanceof InMemoryTokensRepository);
    assertEquals("42", actualExtensionAppAuthenticatorCertImpl.appId);
  }

  /**
   * Test {@link ExtensionAppAuthenticatorCertImpl#authenticateExtensionApp(String)}.
   *
   * <ul>
   *   <li>Then return {@link AppAuthSessionCertImpl}.
   * </ul>
   *
   * <p>Method under test: {@link
   * ExtensionAppAuthenticatorCertImpl#authenticateExtensionApp(String)}
   */
  @Test
  @DisplayName("Test authenticateExtensionApp(String); then return AppAuthSessionCertImpl")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "AppAuthSession ExtensionAppAuthenticatorCertImpl.authenticateExtensionApp(String)"
  })
  void testAuthenticateExtensionApp_thenReturnAppAuthSessionCertImpl()
      throws AuthUnauthorizedException, ApiException {
    // Arrange
    ExtensionAppTokens extensionAppTokens = mock(ExtensionAppTokens.class);
    when(extensionAppTokens.getExpireAt()).thenReturn(1L);
    when(extensionAppTokens.getAppToken()).thenReturn("ABC123");
    when(extensionAppTokens.getSymphonyToken()).thenReturn("ABC123");

    ApiResponse<Object> apiResponse = mock(ApiResponse.class);
    when(apiResponse.getData()).thenReturn(extensionAppTokens);

    ApiClient sessionAuthClient = mock(ApiClient.class);
    when(sessionAuthClient.invokeAPI(
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
    when(sessionAuthClient.getBasePath()).thenReturn("https://example.org/example");
    when(sessionAuthClient.selectHeaderAccept(isA(String[].class)))
        .thenReturn("https://example.org/example");
    when(sessionAuthClient.selectHeaderContentType(isA(String[].class))).thenReturn("text/plain");
    BdkRetryConfig retryConfig = BdkRetryConfigTestHelper.ofMinimalInterval(3);

    ExtensionAppAuthenticatorCertImpl extensionAppAuthenticatorCertImpl =
        new ExtensionAppAuthenticatorCertImpl(retryConfig, "42", sessionAuthClient);

    // Act
    AppAuthSession actualAuthenticateExtensionAppResult =
        extensionAppAuthenticatorCertImpl.authenticateExtensionApp("ABC123");

    // Assert
    verify(extensionAppTokens).getAppToken();
    verify(extensionAppTokens).getExpireAt();
    verify(extensionAppTokens, atLeast(1)).getSymphonyToken();
    verify(sessionAuthClient).getBasePath();
    verify(sessionAuthClient)
        .invokeAPI(
            eq("/v1/authenticate/extensionApp"),
            eq("POST"),
            isA(List.class),
            isA(Object.class),
            isA(Map.class),
            isA(Map.class),
            isA(Map.class),
            eq("https://example.org/example"),
            eq("text/plain"),
            isA(String[].class),
            isA(TypeReference.class));
    verify(sessionAuthClient).selectHeaderAccept(isA(String[].class));
    verify(sessionAuthClient).selectHeaderContentType(isA(String[].class));
    verify(apiResponse).getData();
    assertTrue(actualAuthenticateExtensionAppResult instanceof AppAuthSessionCertImpl);
    assertEquals("ABC123", actualAuthenticateExtensionAppResult.getAppToken());
    assertEquals("ABC123", actualAuthenticateExtensionAppResult.getSymphonyToken());
    assertEquals(1L, actualAuthenticateExtensionAppResult.expireAt().longValue());
    assertSame(
        extensionAppAuthenticatorCertImpl,
        ((AppAuthSessionCertImpl) actualAuthenticateExtensionAppResult).getAuthenticator());
  }

  /**
   * Test {@link ExtensionAppAuthenticatorCertImpl#authenticateAndRetrieveTokens(String)}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * ExtensionAppAuthenticatorCertImpl#authenticateAndRetrieveTokens(String)}
   */
  @Test
  @DisplayName("Test authenticateAndRetrieveTokens(String); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ExtensionAppTokens ExtensionAppAuthenticatorCertImpl.authenticateAndRetrieveTokens(String)"
  })
  void testAuthenticateAndRetrieveTokens_thenReturnNull() throws ApiException {
    // Arrange
    ApiClient sessionAuthClient = mock(ApiClient.class);
    ApiResponse<Object> apiResponse = new ApiResponse<>(1, new HashMap<>());
    when(sessionAuthClient.invokeAPI(
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
    when(sessionAuthClient.selectHeaderAccept(isA(String[].class)))
        .thenReturn("https://example.org/example");
    when(sessionAuthClient.selectHeaderContentType(isA(String[].class))).thenReturn("text/plain");
    BdkRetryConfig retryConfig = BdkRetryConfigTestHelper.ofMinimalInterval(3);

    ExtensionAppAuthenticatorCertImpl extensionAppAuthenticatorCertImpl =
        new ExtensionAppAuthenticatorCertImpl(retryConfig, "42", sessionAuthClient);

    // Act
    ExtensionAppTokens actualAuthenticateAndRetrieveTokensResult =
        extensionAppAuthenticatorCertImpl.authenticateAndRetrieveTokens("ABC123");

    // Assert
    verify(sessionAuthClient)
        .invokeAPI(
            eq("/v1/authenticate/extensionApp"),
            eq("POST"),
            isA(List.class),
            isA(Object.class),
            isA(Map.class),
            isA(Map.class),
            isA(Map.class),
            eq("https://example.org/example"),
            eq("text/plain"),
            isA(String[].class),
            isA(TypeReference.class));
    verify(sessionAuthClient).selectHeaderAccept(isA(String[].class));
    verify(sessionAuthClient).selectHeaderContentType(isA(String[].class));
    assertNull(actualAuthenticateAndRetrieveTokensResult);
  }

  /**
   * Test {@link ExtensionAppAuthenticatorCertImpl#callGetPodCertificate()}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ExtensionAppAuthenticatorCertImpl#callGetPodCertificate()}
   */
  @Test
  @DisplayName("Test callGetPodCertificate(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PodCertificate ExtensionAppAuthenticatorCertImpl.callGetPodCertificate()"})
  void testCallGetPodCertificate_thenReturnNull() throws ApiException {
    // Arrange
    ApiClient sessionAuthClient = mock(ApiClient.class);
    ApiResponse<Object> apiResponse = new ApiResponse<>(1, new HashMap<>());
    when(sessionAuthClient.invokeAPI(
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
    when(sessionAuthClient.selectHeaderAccept(isA(String[].class)))
        .thenReturn("https://example.org/example");
    when(sessionAuthClient.selectHeaderContentType(isA(String[].class))).thenReturn("text/plain");
    BdkRetryConfig retryConfig = BdkRetryConfigTestHelper.ofMinimalInterval(3);

    ExtensionAppAuthenticatorCertImpl extensionAppAuthenticatorCertImpl =
        new ExtensionAppAuthenticatorCertImpl(retryConfig, "42", sessionAuthClient);

    // Act
    PodCertificate actualCallGetPodCertificateResult =
        extensionAppAuthenticatorCertImpl.callGetPodCertificate();

    // Assert
    verify(sessionAuthClient)
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
    verify(sessionAuthClient).selectHeaderAccept(isA(String[].class));
    verify(sessionAuthClient).selectHeaderContentType(isA(String[].class));
    assertNull(actualCallGetPodCertificateResult);
  }

  /**
   * Test {@link ExtensionAppAuthenticatorCertImpl#getPodCertificateBasePath()}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example}.
   * </ul>
   *
   * <p>Method under test: {@link ExtensionAppAuthenticatorCertImpl#getPodCertificateBasePath()}
   */
  @Test
  @DisplayName("Test getPodCertificateBasePath(); then return 'https://example.org/example'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ExtensionAppAuthenticatorCertImpl.getPodCertificateBasePath()"})
  void testGetPodCertificateBasePath_thenReturnHttpsExampleOrgExample() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 sessionAuthClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    BdkRetryConfig retryConfig = BdkRetryConfigTestHelper.ofMinimalInterval(3);

    ExtensionAppAuthenticatorCertImpl extensionAppAuthenticatorCertImpl =
        new ExtensionAppAuthenticatorCertImpl(retryConfig, "42", sessionAuthClient);

    // Act and Assert
    assertEquals(
        "https://example.org/example",
        extensionAppAuthenticatorCertImpl.getPodCertificateBasePath());
  }

  /**
   * Test {@link ExtensionAppAuthenticatorCertImpl#getAuthenticationBasePath()}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example}.
   * </ul>
   *
   * <p>Method under test: {@link ExtensionAppAuthenticatorCertImpl#getAuthenticationBasePath()}
   */
  @Test
  @DisplayName("Test getAuthenticationBasePath(); then return 'https://example.org/example'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ExtensionAppAuthenticatorCertImpl.getAuthenticationBasePath()"})
  void testGetAuthenticationBasePath_thenReturnHttpsExampleOrgExample() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 sessionAuthClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    BdkRetryConfig retryConfig = BdkRetryConfigTestHelper.ofMinimalInterval(3);

    ExtensionAppAuthenticatorCertImpl extensionAppAuthenticatorCertImpl =
        new ExtensionAppAuthenticatorCertImpl(retryConfig, "42", sessionAuthClient);

    // Act and Assert
    assertEquals(
        "https://example.org/example",
        extensionAppAuthenticatorCertImpl.getAuthenticationBasePath());
  }
}
