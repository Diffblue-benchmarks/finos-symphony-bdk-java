package com.symphony.bdk.core.activity.command;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.activity.ActivityMatcher;
import com.symphony.bdk.core.activity.command.PatternCommandActivityTest.ConcretePatternActivity;
import com.symphony.bdk.core.activity.exception.FatalActivityExecutionException;
import com.symphony.bdk.core.service.datafeed.EventException;
import com.symphony.bdk.gen.api.model.V4Initiator;
import com.symphony.bdk.gen.api.model.V4Message;
import com.symphony.bdk.gen.api.model.V4MessageSent;
import com.symphony.bdk.gen.api.model.V4Stream;
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
    message.stream(new V4Stream());

    V4MessageSent eventSource = new V4MessageSent();
    eventSource.setMessage(new V4Message());
    eventSource.message(message);
    CommandContext commandContext = new CommandContext(new V4Initiator(), eventSource);

    // Act and Assert
    assertThrows(
        FatalActivityExecutionException.class,
        () -> concretePatternActivity.beforeMatcher(commandContext));
  }

  /**
   * Test {@link PatternCommandActivity#matcher()}.
   *
   * <p>Method under test: {@link PatternCommandActivity#matcher()}
   */
  @Test
  @DisplayName("Test matcher()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ActivityMatcher PatternCommandActivity.matcher()"})
  void testMatcher() throws EventException {
    // Arrange
    ConcretePatternActivity concretePatternActivity = new ConcretePatternActivity("Pattern");

    // Act
    ActivityMatcher<CommandContext> actualMatcherResult = concretePatternActivity.matcher();
    V4Message message = new V4Message();
    message.stream(new V4Stream());
    V4MessageSent eventSource = new V4MessageSent();
    eventSource.message(message);
    V4Initiator initiator = new V4Initiator();
    CommandContext commandContext = new CommandContext(initiator, eventSource);
    commandContext.setTextContent("Not all who wander are lost");
    boolean actualMatchesResult = actualMatcherResult.matches(commandContext);

    // Assert
    assertEquals("Not all who wander are lost", commandContext.getTextContent());
    assertNull(concretePatternActivity.getInfo());
    assertNull(concretePatternActivity.info());
    assertNull(commandContext.getEventTimestamp());
    assertNull(concretePatternActivity.getBotUserId());
    assertNull(concretePatternActivity.getBotDisplayName());
    assertNull(commandContext.getMessageId());
    assertNull(commandContext.getStreamId());
    assertFalse(actualMatchesResult);
    assertSame(initiator, commandContext.getInitiator());
    assertSame(eventSource, commandContext.getSourceEvent());
  }

  /**
   * Test {@link PatternCommandActivity#matcher()}.
   *
   * <p>Method under test: {@link PatternCommandActivity#matcher()}
   */
  @Test
  @DisplayName("Test matcher()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ActivityMatcher PatternCommandActivity.matcher()"})
  void testMatcher2() throws EventException {
    // Arrange
    ConcretePatternActivity concretePatternActivity = new ConcretePatternActivity("Pattern");

    // Act
    ActivityMatcher<CommandContext> actualMatcherResult = concretePatternActivity.matcher();
    V4Message message = new V4Message();
    message.stream(new V4Stream());
    V4MessageSent eventSource = new V4MessageSent();
    eventSource.message(message);
    V4Initiator initiator = new V4Initiator();
    CommandContext commandContext = new CommandContext(initiator, eventSource);
    commandContext.setTextContent("Pattern");
    boolean actualMatchesResult = actualMatcherResult.matches(commandContext);

    // Assert
    assertEquals("Pattern", commandContext.getTextContent());
    assertNull(concretePatternActivity.getInfo());
    assertNull(concretePatternActivity.info());
    assertNull(commandContext.getEventTimestamp());
    assertNull(concretePatternActivity.getBotUserId());
    assertNull(concretePatternActivity.getBotDisplayName());
    assertNull(commandContext.getMessageId());
    assertNull(commandContext.getStreamId());
    assertTrue(actualMatchesResult);
    assertSame(initiator, commandContext.getInitiator());
    assertSame(eventSource, commandContext.getSourceEvent());
  }

  /**
   * Test {@link PatternCommandActivity#matcher()}.
   *
   * <ul>
   *   <li>Then {@link ConcretePatternActivity#ConcretePatternActivity(String)} with {@code Pattern}
   *       pattern pattern is {@code Pattern}.
   * </ul>
   *
   * <p>Method under test: {@link PatternCommandActivity#matcher()}
   */
  @Test
  @DisplayName(
      "Test matcher(); then ConcretePatternActivity(String) with 'Pattern' pattern pattern is 'Pattern'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ActivityMatcher PatternCommandActivity.matcher()"})
  void testMatcher_thenConcretePatternActivityWithPatternPatternPatternIsPattern() {
    // Arrange
    ConcretePatternActivity concretePatternActivity = new ConcretePatternActivity("Pattern");

    // Act
    concretePatternActivity.matcher();

    // Assert that nothing has changed
    assertEquals("Pattern", concretePatternActivity.pattern().pattern());
  }
}
