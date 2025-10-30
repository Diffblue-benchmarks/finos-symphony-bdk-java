package com.symphony.bdk.core.activity;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.activity.command.CommandContext;
import com.symphony.bdk.gen.api.model.V4Initiator;
import com.symphony.bdk.gen.api.model.V4Message;
import com.symphony.bdk.gen.api.model.V4MessageSent;
import com.symphony.bdk.gen.api.model.V4Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ActivityContextDiffblueTest {
  /**
   * Test {@link ActivityContext#getEventTimestamp()}.
   * <ul>
   *   <li>Given {@link V4Message} (default constructor) stream {@link V4Stream} (default constructor).</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ActivityContext#getEventTimestamp()}
   */
  @Test
  @DisplayName("Test getEventTimestamp(); given V4Message (default constructor) stream V4Stream (default constructor); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.Long ActivityContext.getEventTimestamp()"})
  void testGetEventTimestamp_givenV4MessageStreamV4Stream_thenReturnNull() {
    // Arrange
    V4Message message = new V4Message();
    message.stream(new V4Stream());

    V4MessageSent eventSource = new V4MessageSent();
    eventSource.message(message);

    // Act and Assert
    assertNull((new CommandContext(new V4Initiator(), eventSource)).getEventTimestamp());
  }

  /**
   * Test {@link ActivityContext#getInitiator()}.
   * <ul>
   *   <li>Given {@link V4Message} (default constructor) stream {@link V4Stream} (default constructor).</li>
   *   <li>Then return User is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ActivityContext#getInitiator()}
   */
  @Test
  @DisplayName("Test getInitiator(); given V4Message (default constructor) stream V4Stream (default constructor); then return User is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V4Initiator ActivityContext.getInitiator()"})
  void testGetInitiator_givenV4MessageStreamV4Stream_thenReturnUserIsNull() {
    // Arrange
    V4Message message = new V4Message();
    message.stream(new V4Stream());

    V4MessageSent eventSource = new V4MessageSent();
    eventSource.message(message);
    V4Initiator initiator = new V4Initiator();

    // Act
    V4Initiator actualInitiator = (new CommandContext(initiator, eventSource)).getInitiator();

    // Assert
    assertNull(actualInitiator.getUser());
    assertSame(initiator, actualInitiator);
  }

  /**
   * Test {@link ActivityContext#getSourceEvent()}.
   * <ul>
   *   <li>Given {@link V4Message} (default constructor) stream {@link V4Stream} (default constructor).</li>
   *   <li>Then return Message is {@link V4Message} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link ActivityContext#getSourceEvent()}
   */
  @Test
  @DisplayName("Test getSourceEvent(); given V4Message (default constructor) stream V4Stream (default constructor); then return Message is V4Message (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.Object ActivityContext.getSourceEvent()"})
  void testGetSourceEvent_givenV4MessageStreamV4Stream_thenReturnMessageIsV4Message() {
    // Arrange
    V4Message message = new V4Message();
    message.stream(new V4Stream());

    V4MessageSent eventSource = new V4MessageSent();
    eventSource.message(message);

    // Act
    V4MessageSent actualSourceEvent = (new CommandContext(new V4Initiator(), eventSource)).getSourceEvent();

    // Assert
    assertSame(message, actualSourceEvent.getMessage());
    assertSame(eventSource, actualSourceEvent);
  }
}
