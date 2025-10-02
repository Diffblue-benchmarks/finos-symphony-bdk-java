package com.symphony.bdk.core.service;

import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.AuthSession;
import com.symphony.bdk.core.retry.RetryWithRecoveryBuilder;
import com.symphony.bdk.core.service.connection.ConnectionService;
import com.symphony.bdk.gen.api.ConnectionApi;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class OboServiceDiffblueTest {
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
