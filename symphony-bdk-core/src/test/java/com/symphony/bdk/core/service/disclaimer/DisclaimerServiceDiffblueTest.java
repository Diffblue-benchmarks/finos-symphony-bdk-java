package com.symphony.bdk.core.service.disclaimer;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.AuthSession;
import com.symphony.bdk.core.retry.RetryWithRecoveryBuilder;
import com.symphony.bdk.gen.api.DisclaimerApi;
import com.symphony.bdk.gen.api.model.Disclaimer;
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

class DisclaimerServiceDiffblueTest {
  /**
   * Test {@link DisclaimerService#getDisclaimer(String)}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DisclaimerService#getDisclaimer(String)}
   */
  @Test
  @DisplayName("Test getDisclaimer(String); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Disclaimer DisclaimerService.getDisclaimer(String)"})
  void testGetDisclaimer_thenReturnNull() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
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
        .thenReturn(new ApiResponse<>(1, new HashMap<>()));
    when(apiClient.parameterToString(Mockito.<Object>any()))
        .thenReturn("https://example.org/example");
    when(apiClient.selectHeaderAccept(isA(String[].class)))
        .thenReturn("https://example.org/example");
    when(apiClient.selectHeaderContentType(isA(String[].class))).thenReturn("text/plain");
    when(apiClient.escapeString(Mockito.<String>any())).thenReturn("https://example.org/example");
    when(apiClient.getBasePath()).thenReturn("https://example.org/example");
    DisclaimerApi disclaimerApi = new DisclaimerApi(apiClient);
    AuthSession authSession = mock(AuthSession.class);
    when(authSession.getSessionToken()).thenReturn("ABC123");

    // Act
    Disclaimer actualDisclaimer =
        new DisclaimerService(disclaimerApi, authSession, new RetryWithRecoveryBuilder<>())
            .getDisclaimer("42");

    // Assert
    verify(authSession).getSessionToken();
    verify(apiClient).escapeString("42");
    verify(apiClient).getBasePath();
    verify(apiClient)
        .invokeAPI(
            eq("/v1/admin/disclaimer/https://example.org/example"),
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
    verify(apiClient).parameterToString(isA(Object.class));
    verify(apiClient).selectHeaderAccept(isA(String[].class));
    verify(apiClient).selectHeaderContentType(isA(String[].class));
    assertNull(actualDisclaimer);
  }

  /**
   * Test {@link DisclaimerService#listDisclaimers()}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DisclaimerService#listDisclaimers()}
   */
  @Test
  @DisplayName("Test listDisclaimers(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List DisclaimerService.listDisclaimers()"})
  void testListDisclaimers_thenReturnNull() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
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
        .thenReturn(new ApiResponse<>(1, new HashMap<>()));
    when(apiClient.getBasePath()).thenReturn("https://example.org/example");
    when(apiClient.parameterToString(Mockito.<Object>any()))
        .thenReturn("https://example.org/example");
    when(apiClient.selectHeaderAccept(isA(String[].class)))
        .thenReturn("https://example.org/example");
    when(apiClient.selectHeaderContentType(isA(String[].class))).thenReturn("text/plain");
    DisclaimerApi disclaimerApi = new DisclaimerApi(apiClient);
    AuthSession authSession = mock(AuthSession.class);
    when(authSession.getSessionToken()).thenReturn("ABC123");

    // Act
    List<Disclaimer> actualListDisclaimersResult =
        new DisclaimerService(disclaimerApi, authSession, new RetryWithRecoveryBuilder<>())
            .listDisclaimers();

    // Assert
    verify(authSession).getSessionToken();
    verify(apiClient).getBasePath();
    verify(apiClient)
        .invokeAPI(
            eq("/v1/admin/disclaimer/list"),
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
    verify(apiClient).parameterToString(isA(Object.class));
    verify(apiClient).selectHeaderAccept(isA(String[].class));
    verify(apiClient).selectHeaderContentType(isA(String[].class));
    assertNull(actualListDisclaimersResult);
  }

  /**
   * Test {@link DisclaimerService#listDisclaimerUsers(String)}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DisclaimerService#listDisclaimerUsers(String)}
   */
  @Test
  @DisplayName("Test listDisclaimerUsers(String); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List DisclaimerService.listDisclaimerUsers(String)"})
  void testListDisclaimerUsers_thenReturnNull() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
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
        .thenReturn(new ApiResponse<>(1, new HashMap<>()));
    when(apiClient.parameterToString(Mockito.<Object>any()))
        .thenReturn("https://example.org/example");
    when(apiClient.selectHeaderAccept(isA(String[].class)))
        .thenReturn("https://example.org/example");
    when(apiClient.selectHeaderContentType(isA(String[].class))).thenReturn("text/plain");
    when(apiClient.escapeString(Mockito.<String>any())).thenReturn("https://example.org/example");
    when(apiClient.getBasePath()).thenReturn("https://example.org/example");
    DisclaimerApi disclaimerApi = new DisclaimerApi(apiClient);
    AuthSession authSession = mock(AuthSession.class);
    when(authSession.getSessionToken()).thenReturn("ABC123");

    // Act
    List<Long> actualListDisclaimerUsersResult =
        new DisclaimerService(disclaimerApi, authSession, new RetryWithRecoveryBuilder<>())
            .listDisclaimerUsers("42");

    // Assert
    verify(authSession).getSessionToken();
    verify(apiClient).escapeString("42");
    verify(apiClient).getBasePath();
    verify(apiClient)
        .invokeAPI(
            eq("/v1/admin/disclaimer/https://example.org/example/users"),
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
    verify(apiClient).parameterToString(isA(Object.class));
    verify(apiClient).selectHeaderAccept(isA(String[].class));
    verify(apiClient).selectHeaderContentType(isA(String[].class));
    assertNull(actualListDisclaimerUsersResult);
  }
}
