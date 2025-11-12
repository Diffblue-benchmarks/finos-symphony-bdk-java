package com.symphony.bdk.core.service;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.AuthSession;
import com.symphony.bdk.core.auth.impl.AuthSessionImpl;
import com.symphony.bdk.core.auth.impl.BotAuthenticatorCertImpl;
import com.symphony.bdk.core.config.model.BdkCommonJwtConfig;
import com.symphony.bdk.core.config.model.BdkRetryConfig;
import com.symphony.bdk.core.retry.RetryWithRecoveryBuilder;
import com.symphony.bdk.core.service.connection.ConnectionService;
import com.symphony.bdk.core.service.version.AgentVersionService;
import com.symphony.bdk.gen.api.ConnectionApi;
import com.symphony.bdk.http.api.ApiClient;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class OboServiceDiffblueTest {
  /**
   * Test {@link OboService#checkAuthSession(AuthSession)}.
   *
   * <ul>
   *   <li>Given {@link ConnectionApi#ConnectionApi(ApiClient)} with apiClient is {@code null}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link OboService#checkAuthSession(AuthSession)}
   */
  @Test
  @DisplayName(
      "Test checkAuthSession(AuthSession); given ConnectionApi(ApiClient) with apiClient is 'null'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void OboService.checkAuthSession(AuthSession)"})
  void testCheckAuthSession_givenConnectionApiWithApiClientIsNull_thenDoesNotThrow() {
    // Arrange
    ConnectionApi connectionApi = new ConnectionApi(null);
    ConnectionService connectionService =
        new ConnectionService(connectionApi, new RetryWithRecoveryBuilder<>());
    BotAuthenticatorCertImpl authenticator =
        new BotAuthenticatorCertImpl(
            mock(BdkRetryConfig.class),
            "janedoe",
            mock(BdkCommonJwtConfig.class),
            mock(ApiClient.class),
            mock(ApiClient.class),
            mock(ApiClient.class),
            mock(AgentVersionService.class));

    // Act and Assert
    assertDoesNotThrow(
        () -> connectionService.checkAuthSession(new AuthSessionImpl(authenticator)));
  }

  /**
   * Test {@link OboService#checkAuthSession(AuthSession)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link OboService#checkAuthSession(AuthSession)}
   */
  @Test
  @DisplayName("Test checkAuthSession(AuthSession); when 'null'; then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void OboService.checkAuthSession(AuthSession)"})
  void testCheckAuthSession_whenNull_thenThrowIllegalStateException() {
    // Arrange
    ConnectionApi connectionApi = new ConnectionApi(null);
    ConnectionService connectionService =
        new ConnectionService(connectionApi, new RetryWithRecoveryBuilder<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> connectionService.checkAuthSession(null));
  }
}
