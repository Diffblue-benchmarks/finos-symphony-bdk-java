package com.symphony.bdk.core.auth.impl;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.exception.AuthUnauthorizedException;
import com.symphony.bdk.core.test.BdkRetryConfigTestHelper;
import com.symphony.bdk.gen.api.model.ExtensionAppTokens;
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

class AbstractExtensionAppAuthenticatorDiffblueTest {
  /**
   * Test {@link AbstractExtensionAppAuthenticator#validateTokens(String, String)}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractExtensionAppAuthenticator#validateTokens(String, String)}
   */
  @Test
  @DisplayName("Test validateTokens(String, String); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractExtensionAppAuthenticator.validateTokens(String, String)"})
  void testValidateTokens_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(
        new ExtensionAppAuthenticatorCertImpl(
                BdkRetryConfigTestHelper.ofMinimalInterval(3), "42", null)
            .validateTokens("ABC123", "ABC123"));
  }

  /**
   * Test {@link AbstractExtensionAppAuthenticator#getPodCertificate()}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractExtensionAppAuthenticator#getPodCertificate()}
   */
  @Test
  @DisplayName("Test getPodCertificate(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PodCertificate AbstractExtensionAppAuthenticator.getPodCertificate()"})
  void testGetPodCertificate_thenReturnNull() throws ApiException {
    // Arrange
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
        .thenReturn(new ApiResponse<>(1, new HashMap<>()));
    when(sessionAuthClient.getBasePath()).thenReturn("https://example.org/example");
    when(sessionAuthClient.selectHeaderAccept(isA(String[].class)))
        .thenReturn("https://example.org/example");
    when(sessionAuthClient.selectHeaderContentType(isA(String[].class))).thenReturn("text/plain");

    // Act
    PodCertificate actualPodCertificate =
        new ExtensionAppAuthenticatorCertImpl(
                BdkRetryConfigTestHelper.ofMinimalInterval(3), "42", sessionAuthClient)
            .getPodCertificate();

    // Assert
    verify(sessionAuthClient).getBasePath();
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
    assertNull(actualPodCertificate);
  }

  /**
   * Test {@link AbstractExtensionAppAuthenticator#retrieveExtAppTokens(String)}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractExtensionAppAuthenticator#retrieveExtAppTokens(String)}
   */
  @Test
  @DisplayName("Test retrieveExtAppTokens(String); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ExtensionAppTokens AbstractExtensionAppAuthenticator.retrieveExtAppTokens(String)"
  })
  void testRetrieveExtAppTokens_thenReturnNull() throws AuthUnauthorizedException, ApiException {
    // Arrange
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
        .thenReturn(new ApiResponse<>(1, new HashMap<>()));
    when(sessionAuthClient.getBasePath()).thenReturn("https://example.org/example");
    when(sessionAuthClient.selectHeaderAccept(isA(String[].class)))
        .thenReturn("https://example.org/example");
    when(sessionAuthClient.selectHeaderContentType(isA(String[].class))).thenReturn("text/plain");

    // Act
    ExtensionAppTokens actualRetrieveExtAppTokensResult =
        new ExtensionAppAuthenticatorCertImpl(
                BdkRetryConfigTestHelper.ofMinimalInterval(3), "42", sessionAuthClient)
            .retrieveExtAppTokens("ABC123");

    // Assert
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
    assertNull(actualRetrieveExtAppTokensResult);
  }
}
