package com.symphony.bdk.core.activity.form;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.DoubleNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.symphony.bdk.gen.api.model.V4Initiator;
import com.symphony.bdk.gen.api.model.V4SymphonyElementsAction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FormReplyContextDiffblueTest {
  /**
   * Test {@link FormReplyContext#FormReplyContext(V4Initiator, V4SymphonyElementsAction)}.
   *
   * <ul>
   *   <li>When {@link V4SymphonyElementsAction} (default constructor).
   *   <li>Then return FormValues is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link FormReplyContext#FormReplyContext(V4Initiator,
   * V4SymphonyElementsAction)}
   */
  @Test
  @DisplayName(
      "Test new FormReplyContext(V4Initiator, V4SymphonyElementsAction); when V4SymphonyElementsAction (default constructor); then return FormValues is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FormReplyContext.<init>(V4Initiator, V4SymphonyElementsAction)"})
  void testNewFormReplyContext_whenV4SymphonyElementsAction_thenReturnFormValuesIsNull() {
    // Arrange
    V4Initiator initiator = new V4Initiator();
    V4SymphonyElementsAction eventSource = new V4SymphonyElementsAction();

    // Act
    FormReplyContext actualFormReplyContext = new FormReplyContext(initiator, eventSource);

    // Assert
    assertNull(actualFormReplyContext.getFormValues());
    assertNull(actualFormReplyContext.getEventTimestamp());
    assertNull(actualFormReplyContext.getFormId());
    assertNull(actualFormReplyContext.getFormMessageId());
    assertNull(actualFormReplyContext.getStreamId());
    assertSame(initiator, actualFormReplyContext.getInitiator());
    assertSame(eventSource, actualFormReplyContext.getSourceEvent());
  }

  /**
   * Test {@link FormReplyContext#getFormValue(String)}.
   *
   * <p>Method under test: {@link FormReplyContext#getFormValue(String)}
   */
  @Test
  @DisplayName("Test getFormValue(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FormReplyContext.getFormValue(String)"})
  void testGetFormValue() {
    // Arrange
    V4Initiator initiator = new V4Initiator();

    FormReplyContext formReplyContext =
        new FormReplyContext(initiator, new V4SymphonyElementsAction());
    formReplyContext.setFormValues(DoubleNode.valueOf(10.0d));

    // Act and Assert
    assertNull(formReplyContext.getFormValue("Field Name"));
  }

  /**
   * Test {@link FormReplyContext#getFormValue(String)}.
   *
   * <p>Method under test: {@link FormReplyContext#getFormValue(String)}
   */
  @Test
  @DisplayName("Test getFormValue(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FormReplyContext.getFormValue(String)"})
  void testGetFormValue2() {
    // Arrange
    V4Initiator initiator = new V4Initiator();

    FormReplyContext formReplyContext =
        new FormReplyContext(initiator, new V4SymphonyElementsAction());
    formReplyContext.setFormValues(new ArrayNode(JsonNodeFactory.withExactBigDecimals(true)));

    // Act and Assert
    assertNull(formReplyContext.getFormValue("Field Name"));
  }
}
