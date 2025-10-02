package com.symphony.bdk.core.activity.command;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.activity.ActivityMatcher;
import com.symphony.bdk.core.activity.command.PatternCommandActivityTest.ConcretePatternActivity;
import com.symphony.bdk.core.activity.exception.FatalActivityExecutionException;
import com.symphony.bdk.core.service.datafeed.EventException;
import com.symphony.bdk.gen.api.model.V4Message;
import com.symphony.bdk.gen.api.model.V4MessageSent;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PatternCommandActivityDiffblueTest {
  /**
   * Test {@link PatternCommandActivity#beforeMatcher(CommandContext)} with {@code CommandContext}.
   *
   * <ul>
   *   <li>Then throw {@link FatalActivityExecutionException}.
   * </ul>
   *
   * <p>Method under test: {@link PatternCommandActivity#beforeMatcher(CommandContext)}
   */
  @Test
  @DisplayName(
      "Test beforeMatcher(CommandContext) with 'CommandContext'; then throw FatalActivityExecutionException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PatternCommandActivity.beforeMatcher(CommandContext)"})
  void testBeforeMatcherWithCommandContext_thenThrowFatalActivityExecutionException() {
    // Arrange
    ConcretePatternActivity concretePatternActivity = new ConcretePatternActivity("Pattern");

    V4Message message = new V4Message();
    message.message("Not all who wander are lost");

    V4MessageSent v4MessageSent = new V4MessageSent();
    v4MessageSent.message(message);

    CommandContext commandContext = mock(CommandContext.class);
    when(commandContext.getSourceEvent()).thenReturn(v4MessageSent);

    // Act and Assert
    assertThrows(
        FatalActivityExecutionException.class,
        () -> concretePatternActivity.beforeMatcher(commandContext));
    verify(commandContext).getSourceEvent();
  }

  /**
   * Test {@link PatternCommandActivity#matcher()}.
   *
   * <ul>
   *   <li>Then {@link ConcretePatternActivity#ConcretePatternActivity(String)} with {@code Pattern}
   *       Info is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link PatternCommandActivity#matcher()}
   */
  @Test
  @DisplayName("Test matcher(); then ConcretePatternActivity(String) with 'Pattern' Info is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ActivityMatcher PatternCommandActivity.matcher()"})
  void testMatcher_thenConcretePatternActivityWithPatternInfoIsNull() {
    // Arrange
    ConcretePatternActivity concretePatternActivity = new ConcretePatternActivity("Pattern");

    // Act
    concretePatternActivity.matcher();

    // Assert that nothing has changed
    assertNull(concretePatternActivity.getInfo());
    assertNull(concretePatternActivity.getBotUserId());
    assertNull(concretePatternActivity.getBotDisplayName());
  }

  /**
   * Test {@link PatternCommandActivity#matcher()}.
   *
   * <ul>
   *   <li>Then return matches {@link CommandContext}.
   * </ul>
   *
   * <p>Method under test: {@link PatternCommandActivity#matcher()}
   */
  @Test
  @DisplayName("Test matcher(); then return matches CommandContext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ActivityMatcher PatternCommandActivity.matcher()"})
  void testMatcher_thenReturnMatchesCommandContext() throws EventException {
    // Arrange
    ConcretePatternActivity concretePatternActivity = new ConcretePatternActivity("Pattern");

    // Act
    ActivityMatcher<CommandContext> actualMatcherResult = concretePatternActivity.matcher();
    CommandContext commandContext = mock(CommandContext.class);
    when(commandContext.getTextContent()).thenReturn("Pattern");
    boolean actualMatchesResult = actualMatcherResult.matches(commandContext);

    // Assert
    verify(commandContext).getTextContent();
    assertNull(concretePatternActivity.getInfo());
    assertNull(concretePatternActivity.getBotUserId());
    assertNull(concretePatternActivity.getBotDisplayName());
    assertTrue(actualMatchesResult);
  }

  /**
   * Test {@link PatternCommandActivity#matcher()}.
   *
   * <ul>
   *   <li>Then return not matches {@link CommandContext}.
   * </ul>
   *
   * <p>Method under test: {@link PatternCommandActivity#matcher()}
   */
  @Test
  @DisplayName("Test matcher(); then return not matches CommandContext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ActivityMatcher PatternCommandActivity.matcher()"})
  void testMatcher_thenReturnNotMatchesCommandContext() throws EventException {
    // Arrange
    ConcretePatternActivity concretePatternActivity = new ConcretePatternActivity("Pattern");

    // Act
    ActivityMatcher<CommandContext> actualMatcherResult = concretePatternActivity.matcher();
    CommandContext commandContext = mock(CommandContext.class);
    when(commandContext.getTextContent()).thenReturn("Not all who wander are lost");
    boolean actualMatchesResult = actualMatcherResult.matches(commandContext);

    // Assert
    verify(commandContext).getTextContent();
    assertNull(concretePatternActivity.getInfo());
    assertNull(concretePatternActivity.getBotUserId());
    assertNull(concretePatternActivity.getBotDisplayName());
    assertFalse(actualMatchesResult);
  }
}
