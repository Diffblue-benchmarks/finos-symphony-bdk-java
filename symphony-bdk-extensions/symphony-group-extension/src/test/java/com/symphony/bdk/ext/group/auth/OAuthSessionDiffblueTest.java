package com.symphony.bdk.ext.group.auth;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.AuthSession;
import com.symphony.bdk.core.auth.impl.AuthSessionImpl;
import com.symphony.bdk.core.auth.impl.BotAuthenticatorCertImpl;
import com.symphony.bdk.core.client.loadbalancing.DatafeedLoadBalancedApiClient;
import com.symphony.bdk.core.config.model.BdkCommonJwtConfig;
import com.symphony.bdk.core.config.model.BdkRetryConfig;
import com.symphony.bdk.core.retry.RetryWithRecoveryBuilder;
import com.symphony.bdk.core.service.version.AgentVersionService;
import com.symphony.bdk.ext.group.auth.OAuthSession.TokenResponse;
import com.symphony.bdk.http.api.ApiClient;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class OAuthSessionDiffblueTest {
  /**
   * Test {@link OAuthSession#OAuthSession(ApiClient, AuthSession, RetryWithRecoveryBuilder)}.
   *
   * <ul>
   *   <li>Then return BearerToken is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link OAuthSession#OAuthSession(ApiClient, AuthSession,
   * RetryWithRecoveryBuilder)}
   */
  @Test
  @DisplayName(
      "Test new OAuthSession(ApiClient, AuthSession, RetryWithRecoveryBuilder); then return BearerToken is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void OAuthSession.<init>(ApiClient, AuthSession, RetryWithRecoveryBuilder)"})
  void testNewOAuthSession_thenReturnBearerTokenIsNull() {
    // Arrange
    DatafeedLoadBalancedApiClient loginClient = mock(DatafeedLoadBalancedApiClient.class);
    BotAuthenticatorCertImpl authenticator =
        new BotAuthenticatorCertImpl(
            mock(BdkRetryConfig.class),
            "janedoe",
            mock(BdkCommonJwtConfig.class),
            mock(ApiClient.class),
            mock(ApiClient.class),
            mock(ApiClient.class),
            mock(AgentVersionService.class));
    AuthSessionImpl session = new AuthSessionImpl(authenticator);

    // Act
    OAuthSession actualOAuthSession =
        new OAuthSession(loginClient, session, new RetryWithRecoveryBuilder<>());

    // Assert
    assertNull(actualOAuthSession.getBearerToken());
  }

  /**
   * Test TokenResponse new {@link TokenResponse} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link TokenResponse}
   */
  @Test
  @DisplayName("Test TokenResponse new TokenResponse (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TokenResponse.<init>()"})
  void testTokenResponseNewTokenResponse() {
    // Arrange, Act and Assert
    assertNull(new TokenResponse().getToken());
  }
}
