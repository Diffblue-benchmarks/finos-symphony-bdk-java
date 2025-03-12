package com.symphony.bdk.core.activity.command;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.V4Initiator;
import com.symphony.bdk.gen.api.model.V4Message;
import com.symphony.bdk.gen.api.model.V4MessageSent;
import com.symphony.bdk.gen.api.model.V4Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CommandContextDiffblueTest {
  /**
   * Test {@link CommandContext#CommandContext(V4Initiator, V4MessageSent)}.
   * <ul>
   *   <li>Then return EventTimestamp is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CommandContext#CommandContext(V4Initiator, V4MessageSent)}
   */
  @Test
  @DisplayName("Test new CommandContext(V4Initiator, V4MessageSent); then return EventTimestamp is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CommandContext.<init>(V4Initiator, V4MessageSent)"})
  void testNewCommandContext_thenReturnEventTimestampIsNull() {
    // Arrange
    V4Initiator initiator = new V4Initiator();

    V4Message message = new V4Message();
    message.stream(new V4Stream());

    V4MessageSent eventSource = new V4MessageSent();
    eventSource.message(message);

    // Act
    CommandContext actualCommandContext = new CommandContext(initiator, eventSource);

    // Assert
    assertNull(actualCommandContext.getEventTimestamp());
    assertNull(actualCommandContext.getMessageId());
    assertNull(actualCommandContext.getStreamId());
    assertNull(actualCommandContext.getTextContent());
    assertTrue(actualCommandContext.getArguments().getArgumentNames().isEmpty());
    assertSame(initiator, actualCommandContext.getInitiator());
    V4MessageSent sourceEvent = actualCommandContext.getSourceEvent();
    assertSame(message, sourceEvent.getMessage());
    assertSame(eventSource, sourceEvent);
  }
}
