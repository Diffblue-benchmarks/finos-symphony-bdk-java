package com.symphony.bdk.core.activity.form;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.IntNode;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;
import com.symphony.bdk.core.service.datafeed.RealTimeEventListener;
import com.symphony.bdk.gen.api.model.V4Initiator;
import com.symphony.bdk.gen.api.model.V4Stream;
import com.symphony.bdk.gen.api.model.V4SymphonyElementsAction;
import com.symphony.bdk.gen.api.model.V4User;
import java.util.Iterator;
import java.util.function.Consumer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class FormReplyActivityDiffblueTest {
  /**
   * Test {@link FormReplyActivity#bindToRealTimeEventsSource(Consumer)}.
   *
   * <ul>
   *   <li>When {@link Consumer} {@link Consumer#accept(Object)} does nothing.
   *   <li>Then calls {@link Consumer#accept(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link FormReplyActivity#bindToRealTimeEventsSource(Consumer)}
   */
  @Test
  @DisplayName(
      "Test bindToRealTimeEventsSource(Consumer); when Consumer accept(Object) does nothing; then calls accept(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FormReplyActivity.bindToRealTimeEventsSource(Consumer)"})
  void testBindToRealTimeEventsSource_whenConsumerAcceptDoesNothing_thenCallsAccept() {
    // Arrange
    TestFormReplyActivity testFormReplyActivity = new TestFormReplyActivity();
    Consumer<RealTimeEventListener> realTimeEventsSource = mock(Consumer.class);
    doNothing().when(realTimeEventsSource).accept(Mockito.<RealTimeEventListener>any());

    // Act
    testFormReplyActivity.bindToRealTimeEventsSource(realTimeEventsSource);

    // Assert
    verify(realTimeEventsSource).accept(isA(RealTimeEventListener.class));
  }

  /**
   * Test {@link FormReplyActivity#beforeMatcher(FormReplyContext)} with {@code FormReplyContext}.
   *
   * <p>Method under test: {@link FormReplyActivity#beforeMatcher(FormReplyContext)}
   */
  @Test
  @DisplayName("Test beforeMatcher(FormReplyContext) with 'FormReplyContext'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FormReplyActivity.beforeMatcher(FormReplyContext)"})
  void testBeforeMatcherWithFormReplyContext() {
    // Arrange
    TestFormReplyActivity testFormReplyActivity = new TestFormReplyActivity();

    V4SymphonyElementsAction eventSource = new V4SymphonyElementsAction();
    eventSource.stream(new V4Stream());
    FormReplyContext context = new FormReplyContext(new V4Initiator(), eventSource);

    // Act
    testFormReplyActivity.beforeMatcher(context);

    // Assert
    JsonNode formValues = context.getFormValues();
    assertTrue(formValues instanceof NullNode);
    assertEquals("null", formValues.toPrettyString());
    assertEquals(JsonNodeType.NULL, formValues.getNodeType());
    assertTrue(formValues.isNull());
  }

  /**
   * Test {@link FormReplyActivity#beforeMatcher(FormReplyContext)} with {@code FormReplyContext}.
   *
   * <p>Method under test: {@link FormReplyActivity#beforeMatcher(FormReplyContext)}
   */
  @Test
  @DisplayName("Test beforeMatcher(FormReplyContext) with 'FormReplyContext'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FormReplyActivity.beforeMatcher(FormReplyContext)"})
  void testBeforeMatcherWithFormReplyContext2() {
    // Arrange
    TestFormReplyActivity testFormReplyActivity = new TestFormReplyActivity();

    V4SymphonyElementsAction eventSource = new V4SymphonyElementsAction();
    eventSource.formValues("Form Values");
    eventSource.stream(new V4Stream());
    FormReplyContext context = new FormReplyContext(new V4Initiator(), eventSource);

    // Act
    testFormReplyActivity.beforeMatcher(context);

    // Assert
    JsonNode formValues = context.getFormValues();
    assertTrue(formValues instanceof TextNode);
    assertEquals("\"Form Values\"", formValues.toPrettyString());
    assertEquals(JsonNodeType.STRING, formValues.getNodeType());
    assertTrue(formValues.isTextual());
  }

  /**
   * Test {@link FormReplyActivity#beforeMatcher(FormReplyContext)} with {@code FormReplyContext}.
   *
   * <p>Method under test: {@link FormReplyActivity#beforeMatcher(FormReplyContext)}
   */
  @Test
  @DisplayName("Test beforeMatcher(FormReplyContext) with 'FormReplyContext'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FormReplyActivity.beforeMatcher(FormReplyContext)"})
  void testBeforeMatcherWithFormReplyContext3() {
    // Arrange
    TestFormReplyActivity testFormReplyActivity = new TestFormReplyActivity();

    V4SymphonyElementsAction eventSource = new V4SymphonyElementsAction();
    eventSource.setFormValues("Form Values");
    eventSource.stream(new V4Stream());
    FormReplyContext context = new FormReplyContext(new V4Initiator(), eventSource);

    // Act
    testFormReplyActivity.beforeMatcher(context);

    // Assert
    JsonNode formValues = context.getFormValues();
    assertTrue(formValues instanceof TextNode);
    assertEquals("\"Form Values\"", formValues.toPrettyString());
    assertEquals(JsonNodeType.STRING, formValues.getNodeType());
    assertTrue(formValues.isTextual());
  }

  /**
   * Test {@link FormReplyActivity#beforeMatcher(FormReplyContext)} with {@code FormReplyContext}.
   *
   * <p>Method under test: {@link FormReplyActivity#beforeMatcher(FormReplyContext)}
   */
  @Test
  @DisplayName("Test beforeMatcher(FormReplyContext) with 'FormReplyContext'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FormReplyActivity.beforeMatcher(FormReplyContext)"})
  void testBeforeMatcherWithFormReplyContext4() {
    // Arrange
    TestFormReplyActivity testFormReplyActivity = new TestFormReplyActivity();

    V4SymphonyElementsAction eventSource = new V4SymphonyElementsAction();
    eventSource.formValues(42);
    eventSource.stream(new V4Stream());
    FormReplyContext context = new FormReplyContext(new V4Initiator(), eventSource);

    // Act
    testFormReplyActivity.beforeMatcher(context);

    // Assert
    JsonNode formValues = context.getFormValues();
    assertTrue(formValues instanceof IntNode);
    assertEquals("42", formValues.toPrettyString());
    assertEquals(JsonNodeType.NUMBER, formValues.getNodeType());
    assertFalse(((IntNode) formValues).isNaN());
    assertTrue(formValues.isInt());
    assertTrue(formValues.isIntegralNumber());
    assertTrue(formValues.isNumber());
  }

  /**
   * Test {@link FormReplyActivity#beforeMatcher(FormReplyContext)} with {@code FormReplyContext}.
   *
   * <p>Method under test: {@link FormReplyActivity#beforeMatcher(FormReplyContext)}
   */
  @Test
  @DisplayName("Test beforeMatcher(FormReplyContext) with 'FormReplyContext'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FormReplyActivity.beforeMatcher(FormReplyContext)"})
  void testBeforeMatcherWithFormReplyContext5() {
    // Arrange
    TestFormReplyActivity testFormReplyActivity = new TestFormReplyActivity();

    V4SymphonyElementsAction eventSource = new V4SymphonyElementsAction();
    eventSource.formValues(new V4SymphonyElementsAction());
    eventSource.stream(new V4Stream());
    FormReplyContext context = new FormReplyContext(new V4Initiator(), eventSource);

    // Act
    testFormReplyActivity.beforeMatcher(context);

    // Assert
    JsonNode formValues = context.getFormValues();
    Iterator<JsonNode> iteratorResult = formValues.iterator();
    JsonNode nextResult = iteratorResult.next();
    assertTrue(nextResult instanceof NullNode);
    assertTrue(formValues instanceof ObjectNode);
    assertEquals("null", nextResult.toPrettyString());
    assertEquals(
        "{\n  \"stream\" : null,\n  \"formMessageId\" : null,\n  \"formId\" : null,\n  \"formValues\" : null\n}",
        formValues.toPrettyString());
    assertEquals(0, nextResult.size());
    assertEquals(JsonNodeType.NULL, nextResult.getNodeType());
    assertFalse(nextResult.isContainerNode());
    assertFalse(nextResult.isObject());
    assertFalse(nextResult.iterator().hasNext());
    assertTrue(nextResult.isEmpty());
    assertTrue(nextResult.isNull());
    assertTrue(nextResult.isValueNode());
    assertTrue(iteratorResult.hasNext());
  }

  /**
   * Test {@link FormReplyActivity#beforeMatcher(FormReplyContext)} with {@code FormReplyContext}.
   *
   * <p>Method under test: {@link FormReplyActivity#beforeMatcher(FormReplyContext)}
   */
  @Test
  @DisplayName("Test beforeMatcher(FormReplyContext) with 'FormReplyContext'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FormReplyActivity.beforeMatcher(FormReplyContext)"})
  void testBeforeMatcherWithFormReplyContext6() {
    // Arrange
    TestFormReplyActivity testFormReplyActivity = new TestFormReplyActivity();

    V4SymphonyElementsAction v4SymphonyElementsAction = new V4SymphonyElementsAction();
    v4SymphonyElementsAction.stream(new V4Stream());

    V4SymphonyElementsAction eventSource = new V4SymphonyElementsAction();
    eventSource.formValues(v4SymphonyElementsAction);
    eventSource.stream(new V4Stream());
    FormReplyContext context = new FormReplyContext(new V4Initiator(), eventSource);

    // Act
    testFormReplyActivity.beforeMatcher(context);

    // Assert
    JsonNode formValues = context.getFormValues();
    assertTrue(formValues instanceof ObjectNode);
    Iterator<JsonNode> iteratorResult = formValues.iterator();
    assertTrue(iteratorResult.hasNext());
    assertTrue(iteratorResult.next() instanceof ObjectNode);
    JsonNode nextResult = iteratorResult.next();
    assertTrue(nextResult instanceof NullNode);
    assertSame(nextResult, iteratorResult.next());
    assertEquals(
        "{\n"
            + "  \"stream\" : {\n"
            + "    \"streamId\" : null,\n"
            + "    \"streamType\" : null,\n"
            + "    \"roomName\" : null,\n"
            + "    \"members\" : null,\n"
            + "    \"external\" : null,\n"
            + "    \"crossPod\" : null,\n"
            + "    \"recipientTenantIds\" : null\n"
            + "  },\n"
            + "  \"formMessageId\" : null,\n"
            + "  \"formId\" : null,\n"
            + "  \"formValues\" : null\n"
            + "}",
        formValues.toPrettyString());
  }

  /**
   * Test {@link FormReplyActivity#beforeMatcher(FormReplyContext)} with {@code FormReplyContext}.
   *
   * <ul>
   *   <li>Given {@link V4Stream} (default constructor) addMembersItem {@link V4User} (default
   *       constructor).
   * </ul>
   *
   * <p>Method under test: {@link FormReplyActivity#beforeMatcher(FormReplyContext)}
   */
  @Test
  @DisplayName(
      "Test beforeMatcher(FormReplyContext) with 'FormReplyContext'; given V4Stream (default constructor) addMembersItem V4User (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FormReplyActivity.beforeMatcher(FormReplyContext)"})
  void testBeforeMatcherWithFormReplyContext_givenV4StreamAddMembersItemV4User() {
    // Arrange
    TestFormReplyActivity testFormReplyActivity = new TestFormReplyActivity();

    V4Stream stream = new V4Stream();
    stream.addMembersItem(new V4User());

    V4SymphonyElementsAction v4SymphonyElementsAction = new V4SymphonyElementsAction();
    v4SymphonyElementsAction.stream(stream);

    V4SymphonyElementsAction eventSource = new V4SymphonyElementsAction();
    eventSource.formValues(v4SymphonyElementsAction);
    eventSource.stream(new V4Stream());
    FormReplyContext context = new FormReplyContext(new V4Initiator(), eventSource);

    // Act
    testFormReplyActivity.beforeMatcher(context);

    // Assert
    JsonNode formValues = context.getFormValues();
    assertTrue(formValues instanceof ObjectNode);
    Iterator<JsonNode> iteratorResult = formValues.iterator();
    assertTrue(iteratorResult.hasNext());
    assertTrue(iteratorResult.next() instanceof ObjectNode);
    JsonNode nextResult = iteratorResult.next();
    assertTrue(nextResult instanceof NullNode);
    assertSame(nextResult, iteratorResult.next());
    assertEquals(
        "{\n"
            + "  \"stream\" : {\n"
            + "    \"streamId\" : null,\n"
            + "    \"streamType\" : null,\n"
            + "    \"roomName\" : null,\n"
            + "    \"members\" : [ {\n"
            + "      \"userId\" : null,\n"
            + "      \"firstName\" : null,\n"
            + "      \"lastName\" : null,\n"
            + "      \"displayName\" : null,\n"
            + "      \"email\" : null,\n"
            + "      \"username\" : null\n"
            + "    } ],\n"
            + "    \"external\" : null,\n"
            + "    \"crossPod\" : null,\n"
            + "    \"recipientTenantIds\" : null\n"
            + "  },\n"
            + "  \"formMessageId\" : null,\n"
            + "  \"formId\" : null,\n"
            + "  \"formValues\" : null\n"
            + "}",
        formValues.toPrettyString());
  }

  /**
   * Test {@link FormReplyActivity#beforeMatcher(FormReplyContext)} with {@code FormReplyContext}.
   *
   * <ul>
   *   <li>Given {@link V4Stream} (default constructor) addRecipientTenantIdsItem one.
   * </ul>
   *
   * <p>Method under test: {@link FormReplyActivity#beforeMatcher(FormReplyContext)}
   */
  @Test
  @DisplayName(
      "Test beforeMatcher(FormReplyContext) with 'FormReplyContext'; given V4Stream (default constructor) addRecipientTenantIdsItem one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FormReplyActivity.beforeMatcher(FormReplyContext)"})
  void testBeforeMatcherWithFormReplyContext_givenV4StreamAddRecipientTenantIdsItemOne() {
    // Arrange
    TestFormReplyActivity testFormReplyActivity = new TestFormReplyActivity();

    V4Stream stream = new V4Stream();
    stream.addRecipientTenantIdsItem(1);

    V4SymphonyElementsAction v4SymphonyElementsAction = new V4SymphonyElementsAction();
    v4SymphonyElementsAction.stream(stream);

    V4SymphonyElementsAction eventSource = new V4SymphonyElementsAction();
    eventSource.formValues(v4SymphonyElementsAction);
    eventSource.stream(new V4Stream());
    FormReplyContext context = new FormReplyContext(new V4Initiator(), eventSource);

    // Act
    testFormReplyActivity.beforeMatcher(context);

    // Assert
    JsonNode formValues = context.getFormValues();
    assertTrue(formValues instanceof ObjectNode);
    Iterator<JsonNode> iteratorResult = formValues.iterator();
    assertTrue(iteratorResult.hasNext());
    assertTrue(iteratorResult.next() instanceof ObjectNode);
    JsonNode nextResult = iteratorResult.next();
    assertTrue(nextResult instanceof NullNode);
    assertSame(nextResult, iteratorResult.next());
    assertEquals(
        "{\n"
            + "  \"stream\" : {\n"
            + "    \"streamId\" : null,\n"
            + "    \"streamType\" : null,\n"
            + "    \"roomName\" : null,\n"
            + "    \"members\" : null,\n"
            + "    \"external\" : null,\n"
            + "    \"crossPod\" : null,\n"
            + "    \"recipientTenantIds\" : [ 1 ]\n"
            + "  },\n"
            + "  \"formMessageId\" : null,\n"
            + "  \"formId\" : null,\n"
            + "  \"formValues\" : null\n"
            + "}",
        formValues.toPrettyString());
  }

  /**
   * Test {@link FormReplyActivity#beforeMatcher(FormReplyContext)} with {@code FormReplyContext}.
   *
   * <ul>
   *   <li>Given {@link V4Stream} (default constructor) addRecipientTenantIdsItem two.
   * </ul>
   *
   * <p>Method under test: {@link FormReplyActivity#beforeMatcher(FormReplyContext)}
   */
  @Test
  @DisplayName(
      "Test beforeMatcher(FormReplyContext) with 'FormReplyContext'; given V4Stream (default constructor) addRecipientTenantIdsItem two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FormReplyActivity.beforeMatcher(FormReplyContext)"})
  void testBeforeMatcherWithFormReplyContext_givenV4StreamAddRecipientTenantIdsItemTwo() {
    // Arrange
    TestFormReplyActivity testFormReplyActivity = new TestFormReplyActivity();

    V4Stream stream = new V4Stream();
    stream.addRecipientTenantIdsItem(2);
    stream.addMembersItem(new V4User());

    V4SymphonyElementsAction v4SymphonyElementsAction = new V4SymphonyElementsAction();
    v4SymphonyElementsAction.stream(stream);

    V4SymphonyElementsAction eventSource = new V4SymphonyElementsAction();
    eventSource.formValues(v4SymphonyElementsAction);
    eventSource.stream(new V4Stream());
    FormReplyContext context = new FormReplyContext(new V4Initiator(), eventSource);

    // Act
    testFormReplyActivity.beforeMatcher(context);

    // Assert
    JsonNode formValues = context.getFormValues();
    assertTrue(formValues instanceof ObjectNode);
    Iterator<JsonNode> iteratorResult = formValues.iterator();
    assertTrue(iteratorResult.hasNext());
    assertTrue(iteratorResult.next() instanceof ObjectNode);
    JsonNode nextResult = iteratorResult.next();
    assertTrue(nextResult instanceof NullNode);
    assertSame(nextResult, iteratorResult.next());
    assertEquals(
        "{\n"
            + "  \"stream\" : {\n"
            + "    \"streamId\" : null,\n"
            + "    \"streamType\" : null,\n"
            + "    \"roomName\" : null,\n"
            + "    \"members\" : [ {\n"
            + "      \"userId\" : null,\n"
            + "      \"firstName\" : null,\n"
            + "      \"lastName\" : null,\n"
            + "      \"displayName\" : null,\n"
            + "      \"email\" : null,\n"
            + "      \"username\" : null\n"
            + "    } ],\n"
            + "    \"external\" : null,\n"
            + "    \"crossPod\" : null,\n"
            + "    \"recipientTenantIds\" : [ 2 ]\n"
            + "  },\n"
            + "  \"formMessageId\" : null,\n"
            + "  \"formId\" : null,\n"
            + "  \"formValues\" : null\n"
            + "}",
        formValues.toPrettyString());
  }

  /**
   * Test {@link FormReplyActivity#beforeMatcher(FormReplyContext)} with {@code FormReplyContext}.
   *
   * <ul>
   *   <li>Given {@link V4Stream} (default constructor) external {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link FormReplyActivity#beforeMatcher(FormReplyContext)}
   */
  @Test
  @DisplayName(
      "Test beforeMatcher(FormReplyContext) with 'FormReplyContext'; given V4Stream (default constructor) external 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FormReplyActivity.beforeMatcher(FormReplyContext)"})
  void testBeforeMatcherWithFormReplyContext_givenV4StreamExternalFalse() {
    // Arrange
    TestFormReplyActivity testFormReplyActivity = new TestFormReplyActivity();

    V4Stream stream = new V4Stream();
    stream.external(false);
    stream.addMembersItem(new V4User());

    V4SymphonyElementsAction v4SymphonyElementsAction = new V4SymphonyElementsAction();
    v4SymphonyElementsAction.stream(stream);

    V4SymphonyElementsAction eventSource = new V4SymphonyElementsAction();
    eventSource.formValues(v4SymphonyElementsAction);
    eventSource.stream(new V4Stream());
    FormReplyContext context = new FormReplyContext(new V4Initiator(), eventSource);

    // Act
    testFormReplyActivity.beforeMatcher(context);

    // Assert
    JsonNode formValues = context.getFormValues();
    assertTrue(formValues instanceof ObjectNode);
    Iterator<JsonNode> iteratorResult = formValues.iterator();
    assertTrue(iteratorResult.hasNext());
    assertTrue(iteratorResult.next() instanceof ObjectNode);
    JsonNode nextResult = iteratorResult.next();
    assertTrue(nextResult instanceof NullNode);
    assertSame(nextResult, iteratorResult.next());
    assertEquals(
        "{\n"
            + "  \"stream\" : {\n"
            + "    \"streamId\" : null,\n"
            + "    \"streamType\" : null,\n"
            + "    \"roomName\" : null,\n"
            + "    \"members\" : [ {\n"
            + "      \"userId\" : null,\n"
            + "      \"firstName\" : null,\n"
            + "      \"lastName\" : null,\n"
            + "      \"displayName\" : null,\n"
            + "      \"email\" : null,\n"
            + "      \"username\" : null\n"
            + "    } ],\n"
            + "    \"external\" : false,\n"
            + "    \"crossPod\" : null,\n"
            + "    \"recipientTenantIds\" : null\n"
            + "  },\n"
            + "  \"formMessageId\" : null,\n"
            + "  \"formId\" : null,\n"
            + "  \"formValues\" : null\n"
            + "}",
        formValues.toPrettyString());
  }

  /**
   * Test {@link FormReplyActivity#beforeMatcher(FormReplyContext)} with {@code FormReplyContext}.
   *
   * <ul>
   *   <li>Given {@link V4Stream} (default constructor) external {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link FormReplyActivity#beforeMatcher(FormReplyContext)}
   */
  @Test
  @DisplayName(
      "Test beforeMatcher(FormReplyContext) with 'FormReplyContext'; given V4Stream (default constructor) external 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FormReplyActivity.beforeMatcher(FormReplyContext)"})
  void testBeforeMatcherWithFormReplyContext_givenV4StreamExternalTrue() {
    // Arrange
    TestFormReplyActivity testFormReplyActivity = new TestFormReplyActivity();

    V4Stream stream = new V4Stream();
    stream.external(true);
    stream.addMembersItem(new V4User());

    V4SymphonyElementsAction v4SymphonyElementsAction = new V4SymphonyElementsAction();
    v4SymphonyElementsAction.stream(stream);

    V4SymphonyElementsAction eventSource = new V4SymphonyElementsAction();
    eventSource.formValues(v4SymphonyElementsAction);
    eventSource.stream(new V4Stream());
    FormReplyContext context = new FormReplyContext(new V4Initiator(), eventSource);

    // Act
    testFormReplyActivity.beforeMatcher(context);

    // Assert
    JsonNode formValues = context.getFormValues();
    assertTrue(formValues instanceof ObjectNode);
    Iterator<JsonNode> iteratorResult = formValues.iterator();
    assertTrue(iteratorResult.hasNext());
    assertTrue(iteratorResult.next() instanceof ObjectNode);
    JsonNode nextResult = iteratorResult.next();
    assertTrue(nextResult instanceof NullNode);
    assertSame(nextResult, iteratorResult.next());
    assertEquals(
        "{\n"
            + "  \"stream\" : {\n"
            + "    \"streamId\" : null,\n"
            + "    \"streamType\" : null,\n"
            + "    \"roomName\" : null,\n"
            + "    \"members\" : [ {\n"
            + "      \"userId\" : null,\n"
            + "      \"firstName\" : null,\n"
            + "      \"lastName\" : null,\n"
            + "      \"displayName\" : null,\n"
            + "      \"email\" : null,\n"
            + "      \"username\" : null\n"
            + "    } ],\n"
            + "    \"external\" : true,\n"
            + "    \"crossPod\" : null,\n"
            + "    \"recipientTenantIds\" : null\n"
            + "  },\n"
            + "  \"formMessageId\" : null,\n"
            + "  \"formId\" : null,\n"
            + "  \"formValues\" : null\n"
            + "}",
        formValues.toPrettyString());
  }

  /**
   * Test {@link FormReplyActivity#beforeMatcher(FormReplyContext)} with {@code FormReplyContext}.
   *
   * <ul>
   *   <li>Given {@link V4User} (default constructor) userId one.
   * </ul>
   *
   * <p>Method under test: {@link FormReplyActivity#beforeMatcher(FormReplyContext)}
   */
  @Test
  @DisplayName(
      "Test beforeMatcher(FormReplyContext) with 'FormReplyContext'; given V4User (default constructor) userId one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FormReplyActivity.beforeMatcher(FormReplyContext)"})
  void testBeforeMatcherWithFormReplyContext_givenV4UserUserIdOne() {
    // Arrange
    TestFormReplyActivity testFormReplyActivity = new TestFormReplyActivity();

    V4User membersItem = new V4User();
    membersItem.userId(1L);

    V4Stream stream = new V4Stream();
    stream.addMembersItem(membersItem);

    V4SymphonyElementsAction v4SymphonyElementsAction = new V4SymphonyElementsAction();
    v4SymphonyElementsAction.stream(stream);

    V4SymphonyElementsAction eventSource = new V4SymphonyElementsAction();
    eventSource.formValues(v4SymphonyElementsAction);
    eventSource.stream(new V4Stream());
    FormReplyContext context = new FormReplyContext(new V4Initiator(), eventSource);

    // Act
    testFormReplyActivity.beforeMatcher(context);

    // Assert
    JsonNode formValues = context.getFormValues();
    assertTrue(formValues instanceof ObjectNode);
    Iterator<JsonNode> iteratorResult = formValues.iterator();
    assertTrue(iteratorResult.hasNext());
    assertTrue(iteratorResult.next() instanceof ObjectNode);
    JsonNode nextResult = iteratorResult.next();
    assertTrue(nextResult instanceof NullNode);
    assertSame(nextResult, iteratorResult.next());
    assertEquals(
        "{\n"
            + "  \"stream\" : {\n"
            + "    \"streamId\" : null,\n"
            + "    \"streamType\" : null,\n"
            + "    \"roomName\" : null,\n"
            + "    \"members\" : [ {\n"
            + "      \"userId\" : 1,\n"
            + "      \"firstName\" : null,\n"
            + "      \"lastName\" : null,\n"
            + "      \"displayName\" : null,\n"
            + "      \"email\" : null,\n"
            + "      \"username\" : null\n"
            + "    } ],\n"
            + "    \"external\" : null,\n"
            + "    \"crossPod\" : null,\n"
            + "    \"recipientTenantIds\" : null\n"
            + "  },\n"
            + "  \"formMessageId\" : null,\n"
            + "  \"formId\" : null,\n"
            + "  \"formValues\" : null\n"
            + "}",
        formValues.toPrettyString());
  }
}
