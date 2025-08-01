package com.symphony.bdk.examples.activity.context;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.V4Initiator;
import com.symphony.bdk.gen.api.model.V4Message;
import com.symphony.bdk.gen.api.model.V4MessageSent;
import com.symphony.bdk.gen.api.model.V4Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class GifCommandContextDiffblueTest {
  /**
   * Test {@link GifCommandContext#GifCommandContext(V4Initiator, V4MessageSent)}.
   *
   * <ul>
   *   <li>Then return EventTimestamp is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link GifCommandContext#GifCommandContext(V4Initiator, V4MessageSent)}
   */
  @Test
  @DisplayName(
      "Test new GifCommandContext(V4Initiator, V4MessageSent); then return EventTimestamp is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GifCommandContext.<init>(V4Initiator, V4MessageSent)"})
  void testNewGifCommandContext_thenReturnEventTimestampIsNull() {
    // Arrange
    V4Initiator initiator = new V4Initiator();

    V4Message message = new V4Message();
    message.stream(new V4Stream());

    V4MessageSent eventSource = new V4MessageSent();
    eventSource.message(message);

    // Act
    GifCommandContext actualGifCommandContext = new GifCommandContext(initiator, eventSource);

    // Assert
    assertNull(actualGifCommandContext.getEventTimestamp());
    assertNull(actualGifCommandContext.getMessageId());
    assertNull(actualGifCommandContext.getStreamId());
    assertNull(actualGifCommandContext.getTextContent());
    assertNull(actualGifCommandContext.getCategory());
    assertTrue(actualGifCommandContext.getArguments().getArgumentNames().isEmpty());
    assertSame(initiator, actualGifCommandContext.getInitiator());
    V4MessageSent sourceEvent = actualGifCommandContext.getSourceEvent();
    assertSame(message, sourceEvent.getMessage());
    assertSame(eventSource, sourceEvent);
  }
}
