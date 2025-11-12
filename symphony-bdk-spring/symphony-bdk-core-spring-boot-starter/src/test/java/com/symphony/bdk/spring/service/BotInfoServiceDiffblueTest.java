package com.symphony.bdk.spring.service;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.service.session.SessionService;
import com.symphony.bdk.gen.api.model.UserV2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BotInfoServiceDiffblueTest {
  /**
   * Test {@link BotInfoService#BotInfoService(SessionService)}.
   *
   * <ul>
   *   <li>Given {@link UserV2} (default constructor).
   *   <li>Then return BotInfo is {@link UserV2} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link BotInfoService#BotInfoService(SessionService)}
   */
  @Test
  @DisplayName(
      "Test new BotInfoService(SessionService); given UserV2 (default constructor); then return BotInfo is UserV2 (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BotInfoService.<init>(SessionService)"})
  void testNewBotInfoService_givenUserV2_thenReturnBotInfoIsUserV2() {
    // Arrange
    SessionService sessionService = mock(SessionService.class);
    UserV2 userV2 = new UserV2();
    when(sessionService.getSession()).thenReturn(userV2);

    // Act
    BotInfoService actualBotInfoService = new BotInfoService(sessionService);

    // Assert
    verify(sessionService).getSession();
    assertSame(userV2, actualBotInfoService.getBotInfo());
  }
}
