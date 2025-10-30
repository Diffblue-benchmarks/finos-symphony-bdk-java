package com.symphony.bdk.core.activity.form;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.MissingNode;
import com.symphony.bdk.gen.api.model.V4Initiator;
import com.symphony.bdk.gen.api.model.V4SymphonyElementsAction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FormReplyContextDiffblueTest {
  /**
   * Test {@link FormReplyContext#FormReplyContext(V4Initiator, V4SymphonyElementsAction)}.
   * <ul>
   *   <li>When {@link V4SymphonyElementsAction} (default constructor).</li>
   *   <li>Then return FormValues is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FormReplyContext#FormReplyContext(V4Initiator, V4SymphonyElementsAction)}
   */
  @Test
  @DisplayName("Test new FormReplyContext(V4Initiator, V4SymphonyElementsAction); when V4SymphonyElementsAction (default constructor); then return FormValues is 'null'")
  @Tag("MaintainedByDiffblue")
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
   * <p>
   * Method under test: {@link FormReplyContext#getFormValue(String)}
   */
  @Test
  @DisplayName("Test getFormValue(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String FormReplyContext.getFormValue(String)"})
  void testGetFormValue() {
    // Arrange
    V4Initiator initiator = new V4Initiator();

    FormReplyContext formReplyContext = new FormReplyContext(initiator, new V4SymphonyElementsAction());
    formReplyContext.setFormValues(MissingNode.getInstance());

    // Act and Assert
    assertNull(formReplyContext.getFormValue("Field Name"));
  }

  /**
   * Test {@link FormReplyContext#getFormValue(String)}.
   * <p>
   * Method under test: {@link FormReplyContext#getFormValue(String)}
   */
  @Test
  @DisplayName("Test getFormValue(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String FormReplyContext.getFormValue(String)"})
  void testGetFormValue2() {
    // Arrange
    V4Initiator initiator = new V4Initiator();

    FormReplyContext formReplyContext = new FormReplyContext(initiator, new V4SymphonyElementsAction());
    formReplyContext.setFormValues(new ArrayNode(JsonNodeFactory.withExactBigDecimals(true)));

    // Act and Assert
    assertNull(formReplyContext.getFormValue("Field Name"));
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link FormReplyContext#setFormId(String)}
   *   <li>{@link FormReplyContext#setFormMessageId(String)}
   *   <li>{@link FormReplyContext#setFormValues(JsonNode)}
   *   <li>{@link FormReplyContext#setStreamId(String)}
   *   <li>{@link FormReplyContext#getFormId()}
   *   <li>{@link FormReplyContext#getFormMessageId()}
   *   <li>{@link FormReplyContext#getFormValues()}
   *   <li>{@link FormReplyContext#getStreamId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String FormReplyContext.getFormId()", "String FormReplyContext.getFormMessageId()",
      "JsonNode FormReplyContext.getFormValues()", "String FormReplyContext.getStreamId()",
      "void FormReplyContext.setFormId(String)", "void FormReplyContext.setFormMessageId(String)",
      "void FormReplyContext.setFormValues(JsonNode)", "void FormReplyContext.setStreamId(String)"})
  void testGettersAndSetters() {
    // Arrange
    V4Initiator initiator = new V4Initiator();
    FormReplyContext formReplyContext = new FormReplyContext(initiator, new V4SymphonyElementsAction());

    // Act
    formReplyContext.setFormId("42");
    formReplyContext.setFormMessageId("42");
    MissingNode formValues = MissingNode.getInstance();
    formReplyContext.setFormValues(formValues);
    formReplyContext.setStreamId("42");
    String actualFormId = formReplyContext.getFormId();
    String actualFormMessageId = formReplyContext.getFormMessageId();
    JsonNode actualFormValues = formReplyContext.getFormValues();

    // Assert
    assertEquals("42", actualFormId);
    assertEquals("42", actualFormMessageId);
    assertEquals("42", formReplyContext.getStreamId());
    assertSame(formValues, actualFormValues);
  }
}
