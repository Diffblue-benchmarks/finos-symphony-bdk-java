package com.symphony.bdk.core.service.connection;

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
import com.symphony.bdk.gen.api.ConnectionApi;
import com.symphony.bdk.http.api.ApiClient;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ConnectionServiceDiffblueTest {
  /**
   * Test {@link ConnectionService#obo(AuthSession)}.
   *
   * <ul>
   *   <li>Given {@link ConnectionApi#ConnectionApi(ApiClient)} with apiClient is {@code null}.
   *   <li>Then return {@link ConnectionService}.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionService#obo(AuthSession)}
   */
  @Test
  @DisplayName(
      "Test obo(AuthSession); given ConnectionApi(ApiClient) with apiClient is 'null'; then return ConnectionService")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.core.service.connection.OboConnectionService ConnectionService.obo(AuthSession)"
  })
  void testObo_givenConnectionApiWithApiClientIsNull_thenReturnConnectionService() {
    // Arrange
    ConnectionApi connectionApi = new ConnectionApi(null);
    ConnectionService connectionService =
        new ConnectionService(connectionApi, new RetryWithRecoveryBuilder<>());

    // Act and Assert
    assertTrue(
        connectionService.obo(
                new AuthSessionImpl(
                    new BotAuthenticatorCertImpl(
                        mock(BdkRetryConfig.class),
                        "janedoe",
                        mock(BdkCommonJwtConfig.class),
                        mock(ApiClient.class),
                        mock(ApiClient.class),
                        mock(ApiClient.class),
                        mock(AgentVersionService.class))))
            instanceof ConnectionService);
  }
}
