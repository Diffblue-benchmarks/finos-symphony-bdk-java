package com.symphony.bdk.core.activity.command;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.activity.ActivityMatcher;
import com.symphony.bdk.core.activity.command.PatternCommandActivityTest.ConcretePatternActivity;
import com.symphony.bdk.core.service.datafeed.EventException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PatternCommandActivityDiffblueTest {
  /**
   * Test {@link PatternCommandActivity#matcher()}.
   * <ul>
   *   <li>Then return matches {@link CommandContext}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PatternCommandActivity#matcher()}
   */
  @Test
  @DisplayName("Test matcher(); then return matches CommandContext")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ActivityMatcher PatternCommandActivity.matcher()"})
  void testMatcher_thenReturnMatchesCommandContext() throws EventException {
    // Arrange and Act
    ActivityMatcher<CommandContext> actualMatcherResult = (new ConcretePatternActivity("Pattern")).matcher();
    CommandContext commandContext = mock(CommandContext.class);
    when(commandContext.getTextContent()).thenReturn("Pattern");
    boolean actualMatchesResult = actualMatcherResult.matches(commandContext);

    // Assert
    verify(commandContext).getTextContent();
    assertTrue(actualMatchesResult);
  }

  /**
   * Test {@link PatternCommandActivity#matcher()}.
   * <ul>
   *   <li>Then return not matches {@link CommandContext}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PatternCommandActivity#matcher()}
   */
  @Test
  @DisplayName("Test matcher(); then return not matches CommandContext")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ActivityMatcher PatternCommandActivity.matcher()"})
  void testMatcher_thenReturnNotMatchesCommandContext() throws EventException {
    // Arrange and Act
    ActivityMatcher<CommandContext> actualMatcherResult = (new ConcretePatternActivity("Pattern")).matcher();
    CommandContext commandContext = mock(CommandContext.class);
    when(commandContext.getTextContent()).thenReturn("Not all who wander are lost");
    boolean actualMatchesResult = actualMatcherResult.matches(commandContext);

    // Assert
    verify(commandContext).getTextContent();
    assertFalse(actualMatchesResult);
  }
}
