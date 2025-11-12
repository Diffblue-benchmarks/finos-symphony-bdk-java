package com.symphony.bdk.core.activity;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.activity.AbstractActivityTest.V4SymphonyElementsActionEvent;
import com.symphony.bdk.core.activity.form.FormReplyContext;
import com.symphony.bdk.core.activity.form.TestFormReplyActivity;
import com.symphony.bdk.core.activity.room.TestUserJoinedRoomActivity;
import com.symphony.bdk.gen.api.model.V4Initiator;
import com.symphony.bdk.gen.api.model.V4SymphonyElementsAction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AbstractActivityDiffblueTest {
  /**
   * Test {@link AbstractActivity#isAsynchronous()}.
   *
   * <p>Method under test: {@link AbstractActivity#isAsynchronous()}
   */
  @Test
  @DisplayName("Test isAsynchronous()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractActivity.isAsynchronous()"})
  void testIsAsynchronous() {
    // Arrange, Act and Assert
    assertFalse(new TestUserJoinedRoomActivity().isAsynchronous());
  }

  /**
   * Test {@link AbstractActivity#createContextInstance(V4Initiator, Object)}.
   *
   * <ul>
   *   <li>Then return FormValues is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractActivity#createContextInstance(V4Initiator, Object)}
   */
  @Test
  @DisplayName("Test createContextInstance(V4Initiator, Object); then return FormValues is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.core.activity.ActivityContext AbstractActivity.createContextInstance(V4Initiator, Object)"
  })
  void testCreateContextInstance_thenReturnFormValuesIsNull() {
    // Arrange
    TestFormReplyActivity testFormReplyActivity = new TestFormReplyActivity();
    V4Initiator initiator = new V4Initiator();
    V4SymphonyElementsAction v4SymphonyElementsAction = new V4SymphonyElementsAction();

    // Act
    FormReplyContext actualCreateContextInstanceResult =
        testFormReplyActivity.createContextInstance(initiator, v4SymphonyElementsAction);

    // Assert
    assertNull(actualCreateContextInstanceResult.getFormValues());
    assertNull(actualCreateContextInstanceResult.getEventTimestamp());
    assertNull(actualCreateContextInstanceResult.getFormId());
    assertNull(actualCreateContextInstanceResult.getFormMessageId());
    assertNull(actualCreateContextInstanceResult.getStreamId());
    assertSame(initiator, actualCreateContextInstanceResult.getInitiator());
    assertSame(v4SymphonyElementsAction, actualCreateContextInstanceResult.getSourceEvent());
  }

  /**
   * Test {@link AbstractActivity#createContextInstance(V4Initiator, Object)}.
   *
   * <ul>
   *   <li>Then return Initiator is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractActivity#createContextInstance(V4Initiator, Object)}
   */
  @Test
  @DisplayName("Test createContextInstance(V4Initiator, Object); then return Initiator is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.core.activity.ActivityContext AbstractActivity.createContextInstance(V4Initiator, Object)"
  })
  void testCreateContextInstance_thenReturnInitiatorIsNull() {
    // Arrange
    TestFormReplyActivity testFormReplyActivity = new TestFormReplyActivity();
    V4SymphonyElementsActionEvent v4SymphonyElementsActionEvent =
        new V4SymphonyElementsActionEvent(new V4SymphonyElementsAction());

    // Act
    FormReplyContext actualCreateContextInstanceResult =
        testFormReplyActivity.createContextInstance(null, v4SymphonyElementsActionEvent);

    // Assert
    assertNull(actualCreateContextInstanceResult.getInitiator());
    assertSame(v4SymphonyElementsActionEvent, actualCreateContextInstanceResult.getSourceEvent());
  }
}
