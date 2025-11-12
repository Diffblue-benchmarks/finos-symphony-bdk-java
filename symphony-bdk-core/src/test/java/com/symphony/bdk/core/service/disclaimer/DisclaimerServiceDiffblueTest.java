package com.symphony.bdk.core.service.disclaimer;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.impl.AuthSessionImpl;
import com.symphony.bdk.core.auth.impl.BotAuthenticatorCertImpl;
import com.symphony.bdk.core.config.model.BdkCommonJwtConfig;
import com.symphony.bdk.core.config.model.BdkRetryConfig;
import com.symphony.bdk.core.retry.RetryWithRecoveryBuilder;
import com.symphony.bdk.core.service.version.AgentVersionService;
import com.symphony.bdk.gen.api.DisclaimerApi;
import com.symphony.bdk.gen.api.model.Disclaimer;
import com.symphony.bdk.http.api.ApiClient;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import jakarta.ws.rs.client.Client;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class DisclaimerServiceDiffblueTest {
  /**
   * Test {@link DisclaimerService#getDisclaimer(String)}.
   *
   * <ul>
   *   <li>Then return {@link Disclaimer} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link DisclaimerService#getDisclaimer(String)}
   */
  @Test
  @DisplayName("Test getDisclaimer(String); then return Disclaimer (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Disclaimer DisclaimerService.getDisclaimer(String)"})
  void testGetDisclaimer_thenReturnDisclaimer() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    DisclaimerApi disclaimerApi = mock(DisclaimerApi.class);
    Disclaimer disclaimer = new Disclaimer();
    when(disclaimerApi.v1AdminDisclaimerDidGet(Mockito.<String>any(), Mockito.<String>any()))
        .thenReturn(disclaimer);
    when(disclaimerApi.getApiClient()).thenReturn(apiClientJersey2);
    BotAuthenticatorCertImpl authenticator =
        new BotAuthenticatorCertImpl(
            mock(BdkRetryConfig.class),
            "janedoe",
            mock(BdkCommonJwtConfig.class),
            mock(ApiClient.class),
            mock(ApiClient.class),
            mock(ApiClient.class),
            mock(AgentVersionService.class));
    AuthSessionImpl authSession = new AuthSessionImpl(authenticator);

    DisclaimerService disclaimerService =
        new DisclaimerService(disclaimerApi, authSession, new RetryWithRecoveryBuilder<>());

    // Act
    Disclaimer actualDisclaimer = disclaimerService.getDisclaimer("42");

    // Assert
    verify(disclaimerApi).getApiClient();
    verify(disclaimerApi).v1AdminDisclaimerDidGet(null, "42");
    assertSame(disclaimer, actualDisclaimer);
  }

  /**
   * Test {@link DisclaimerService#listDisclaimers()}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link DisclaimerService#listDisclaimers()}
   */
  @Test
  @DisplayName("Test listDisclaimers(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List DisclaimerService.listDisclaimers()"})
  void testListDisclaimers_thenReturnEmpty() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    DisclaimerApi disclaimerApi = mock(DisclaimerApi.class);
    when(disclaimerApi.v1AdminDisclaimerListGet(Mockito.<String>any()))
        .thenReturn(new ArrayList<>());
    when(disclaimerApi.getApiClient()).thenReturn(apiClientJersey2);
    BotAuthenticatorCertImpl authenticator =
        new BotAuthenticatorCertImpl(
            mock(BdkRetryConfig.class),
            "janedoe",
            mock(BdkCommonJwtConfig.class),
            mock(ApiClient.class),
            mock(ApiClient.class),
            mock(ApiClient.class),
            mock(AgentVersionService.class));
    AuthSessionImpl authSession = new AuthSessionImpl(authenticator);

    DisclaimerService disclaimerService =
        new DisclaimerService(disclaimerApi, authSession, new RetryWithRecoveryBuilder<>());

    // Act
    List<Disclaimer> actualListDisclaimersResult = disclaimerService.listDisclaimers();

    // Assert
    verify(disclaimerApi).getApiClient();
    verify(disclaimerApi).v1AdminDisclaimerListGet(null);
    assertTrue(actualListDisclaimersResult.isEmpty());
  }

  /**
   * Test {@link DisclaimerService#listDisclaimerUsers(String)}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link DisclaimerService#listDisclaimerUsers(String)}
   */
  @Test
  @DisplayName("Test listDisclaimerUsers(String); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List DisclaimerService.listDisclaimerUsers(String)"})
  void testListDisclaimerUsers_thenReturnEmpty() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    DisclaimerApi disclaimerApi = mock(DisclaimerApi.class);
    when(disclaimerApi.v1AdminDisclaimerDidUsersGet(Mockito.<String>any(), Mockito.<String>any()))
        .thenReturn(new ArrayList<>());
    when(disclaimerApi.getApiClient()).thenReturn(apiClientJersey2);
    BotAuthenticatorCertImpl authenticator =
        new BotAuthenticatorCertImpl(
            mock(BdkRetryConfig.class),
            "janedoe",
            mock(BdkCommonJwtConfig.class),
            mock(ApiClient.class),
            mock(ApiClient.class),
            mock(ApiClient.class),
            mock(AgentVersionService.class));
    AuthSessionImpl authSession = new AuthSessionImpl(authenticator);

    DisclaimerService disclaimerService =
        new DisclaimerService(disclaimerApi, authSession, new RetryWithRecoveryBuilder<>());

    // Act
    List<Long> actualListDisclaimerUsersResult = disclaimerService.listDisclaimerUsers("42");

    // Assert
    verify(disclaimerApi).getApiClient();
    verify(disclaimerApi).v1AdminDisclaimerDidUsersGet(null, "42");
    assertTrue(actualListDisclaimerUsersResult.isEmpty());
  }
}
