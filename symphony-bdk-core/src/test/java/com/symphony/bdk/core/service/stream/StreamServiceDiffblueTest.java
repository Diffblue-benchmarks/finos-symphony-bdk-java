package com.symphony.bdk.core.service.stream;

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
import com.symphony.bdk.gen.api.RoomMembershipApi;
import com.symphony.bdk.gen.api.ShareApi;
import com.symphony.bdk.gen.api.StreamsApi;
import com.symphony.bdk.http.api.ApiClient;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class StreamServiceDiffblueTest {
  /**
   * Test {@link StreamService#obo(AuthSession)}.
   *
   * <ul>
   *   <li>Then return {@link StreamService}.
   * </ul>
   *
   * <p>Method under test: {@link StreamService#obo(AuthSession)}
   */
  @Test
  @DisplayName("Test obo(AuthSession); then return StreamService")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"OboStreamService StreamService.obo(AuthSession)"})
  void testObo_thenReturnStreamService() {
    // Arrange
    StreamService streamService =
        new StreamService(
            mock(StreamsApi.class),
            mock(RoomMembershipApi.class),
            mock(ShareApi.class),
            mock(RetryWithRecoveryBuilder.class));
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
    OboStreamService actualOboResult = streamService.obo(new AuthSessionImpl(authenticator));

    // Assert
    assertTrue(actualOboResult instanceof StreamService);
  }
}
