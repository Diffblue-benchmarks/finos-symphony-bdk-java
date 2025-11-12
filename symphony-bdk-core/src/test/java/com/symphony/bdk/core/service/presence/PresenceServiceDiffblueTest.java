package com.symphony.bdk.core.service.presence;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.AuthSession;
import com.symphony.bdk.core.auth.impl.AuthSessionImpl;
import com.symphony.bdk.core.auth.impl.BotAuthenticatorCertImpl;
import com.symphony.bdk.core.config.model.BdkCommonJwtConfig;
import com.symphony.bdk.core.config.model.BdkRetryConfig;
import com.symphony.bdk.core.retry.RetryWithRecoveryBuilder;
import com.symphony.bdk.core.service.version.AgentVersionService;
import com.symphony.bdk.gen.api.PresenceApi;
import com.symphony.bdk.http.api.ApiClient;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PresenceServiceDiffblueTest {
  /**
   * Test {@link PresenceService#obo(AuthSession)}.
   *
   * <ul>
   *   <li>Given {@link PresenceApi#PresenceApi(ApiClient)} with apiClient is {@code null}.
   *   <li>Then return {@link PresenceService}.
   * </ul>
   *
   * <p>Method under test: {@link PresenceService#obo(AuthSession)}
   */
  @Test
  @DisplayName(
      "Test obo(AuthSession); given PresenceApi(ApiClient) with apiClient is 'null'; then return PresenceService")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"OboPresenceService PresenceService.obo(AuthSession)"})
  void testObo_givenPresenceApiWithApiClientIsNull_thenReturnPresenceService() {
    // Arrange
    PresenceApi presenceApi = new PresenceApi(null);
    PresenceService presenceService =
        new PresenceService(presenceApi, new RetryWithRecoveryBuilder<>());
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
    OboPresenceService actualOboResult = presenceService.obo(new AuthSessionImpl(authenticator));

    // Assert
    assertTrue(actualOboResult instanceof PresenceService);
  }
}
