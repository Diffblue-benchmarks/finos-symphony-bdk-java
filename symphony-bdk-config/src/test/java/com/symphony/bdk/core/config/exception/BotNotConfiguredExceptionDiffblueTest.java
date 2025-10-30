package com.symphony.bdk.core.config.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BotNotConfiguredExceptionDiffblueTest {
  /**
   * Test new {@link BotNotConfiguredException} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link BotNotConfiguredException}
   */
  @Test
  @DisplayName("Test new BotNotConfiguredException (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BotNotConfiguredException.<init>()"})
  void testNewBotNotConfiguredException() {
    // Arrange and Act
    BotNotConfiguredException actualBotNotConfiguredException = new BotNotConfiguredException();

    // Assert
    assertEquals("Bot (service account) credentials have not been configured. You can however use services in OBO mode"
        + " if app authentication is configured.", actualBotNotConfiguredException.getMessage());
    assertNull(actualBotNotConfiguredException.getCause());
    assertEquals(0, actualBotNotConfiguredException.getSuppressed().length);
  }
}
