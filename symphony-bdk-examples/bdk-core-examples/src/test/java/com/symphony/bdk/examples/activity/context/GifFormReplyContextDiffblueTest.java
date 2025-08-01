package com.symphony.bdk.examples.activity.context;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.V4Initiator;
import com.symphony.bdk.gen.api.model.V4SymphonyElementsAction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class GifFormReplyContextDiffblueTest {
  /**
   * Test {@link GifFormReplyContext#GifFormReplyContext(V4Initiator, V4SymphonyElementsAction)}.
   *
   * <ul>
   *   <li>Then return FormValues is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link GifFormReplyContext#GifFormReplyContext(V4Initiator,
   * V4SymphonyElementsAction)}
   */
  @Test
  @DisplayName(
      "Test new GifFormReplyContext(V4Initiator, V4SymphonyElementsAction); then return FormValues is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GifFormReplyContext.<init>(V4Initiator, V4SymphonyElementsAction)"})
  void testNewGifFormReplyContext_thenReturnFormValuesIsNull() {
    // Arrange
    V4Initiator initiator = new V4Initiator();
    V4SymphonyElementsAction eventSource = new V4SymphonyElementsAction();

    // Act
    GifFormReplyContext actualGifFormReplyContext = new GifFormReplyContext(initiator, eventSource);

    // Assert
    assertNull(actualGifFormReplyContext.getFormValues());
    assertNull(actualGifFormReplyContext.getEventTimestamp());
    assertNull(actualGifFormReplyContext.getFormId());
    assertNull(actualGifFormReplyContext.getFormMessageId());
    assertNull(actualGifFormReplyContext.getStreamId());
    assertNull(actualGifFormReplyContext.getCategory());
    assertSame(initiator, actualGifFormReplyContext.getInitiator());
    assertSame(eventSource, actualGifFormReplyContext.getSourceEvent());
  }
}
