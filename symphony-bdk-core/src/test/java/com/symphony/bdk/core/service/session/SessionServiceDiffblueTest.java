package com.symphony.bdk.core.service.session;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.AuthSession;
import com.symphony.bdk.core.auth.impl.AuthSessionImpl;
import com.symphony.bdk.core.auth.impl.BotAuthenticatorCertImpl;
import com.symphony.bdk.core.config.model.BdkCommonJwtConfig;
import com.symphony.bdk.core.config.model.BdkRetryConfig;
import com.symphony.bdk.core.retry.RetryWithRecoveryBuilder;
import com.symphony.bdk.core.service.version.AgentVersionService;
import com.symphony.bdk.gen.api.SessionApi;
import com.symphony.bdk.gen.api.model.UserV2;
import com.symphony.bdk.http.api.ApiClient;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import jakarta.ws.rs.client.Client;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SessionServiceDiffblueTest {
  /**
   * Test {@link SessionService#obo(AuthSession)}.
   *
   * <ul>
   *   <li>Given {@link SessionApi} {@link SessionApi#v2SessioninfoGet(String)} return {@link
   *       UserV2} (default constructor).
   *   <li>Then return {@link SessionService}.
   * </ul>
   *
   * <p>Method under test: {@link SessionService#obo(AuthSession)}
   */
  @Test
  @DisplayName(
      "Test obo(AuthSession); given SessionApi v2SessioninfoGet(String) return UserV2 (default constructor); then return SessionService")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"OboSessionService SessionService.obo(AuthSession)"})
  void testObo_givenSessionApiV2SessioninfoGetReturnUserV2_thenReturnSessionService()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    SessionApi sessionApi = mock(SessionApi.class);
    UserV2 userV2 = new UserV2();
    when(sessionApi.v2SessioninfoGet(Mockito.<String>any())).thenReturn(userV2);
    when(sessionApi.getApiClient()).thenReturn(apiClientJersey2);
    SessionService sessionService =
        new SessionService(sessionApi, new RetryWithRecoveryBuilder<>());
    BotAuthenticatorCertImpl authenticator =
        new BotAuthenticatorCertImpl(
            mock(BdkRetryConfig.class),
            "janedoe",
            mock(BdkCommonJwtConfig.class),
            mock(ApiClient.class),
            mock(ApiClient.class),
            mock(ApiClient.class),
            mock(AgentVersionService.class));

    // Act
    OboSessionService actualOboResult = sessionService.obo(new AuthSessionImpl(authenticator));
    UserV2 actualSession = actualOboResult.getSession();

    // Assert
    verify(sessionApi).getApiClient();
    verify(sessionApi).v2SessioninfoGet(null);
    assertTrue(actualOboResult instanceof SessionService);
    assertSame(userV2, actualOboResult.getSession());
    assertSame(userV2, actualSession);
  }
}
