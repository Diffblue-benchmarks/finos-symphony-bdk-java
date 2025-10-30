package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V4EventDiffblueTest {
  /**
   * Test {@link V4Event#equals(Object)}, and {@link V4Event#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4Event#equals(Object)}
   *   <li>{@link V4Event#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4Event.equals(Object)", "int V4Event.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4Event v4Event = new V4Event();
    V4Event v4Event2 = new V4Event();

    // Act and Assert
    assertEquals(v4Event, v4Event2);
    int expectedHashCodeResult = v4Event.hashCode();
    assertEquals(expectedHashCodeResult, v4Event2.hashCode());
  }

  /**
   * Test {@link V4Event#equals(Object)}, and {@link V4Event#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4Event#equals(Object)}
   *   <li>{@link V4Event#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4Event.equals(Object)", "int V4Event.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4Event v4Event = new V4Event();

    // Act and Assert
    assertEquals(v4Event, v4Event);
    int expectedHashCodeResult = v4Event.hashCode();
    assertEquals(expectedHashCodeResult, v4Event.hashCode());
  }

  /**
   * Test {@link V4Event#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Event#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4Event.equals(Object)", "int V4Event.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4Event(), 1);
  }

  /**
   * Test {@link V4Event#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Event#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4Event.equals(Object)", "int V4Event.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V4Event v4Event = new V4Event();
    v4Event.id("42");

    // Act and Assert
    assertNotEquals(v4Event, new V4Event());
  }

  /**
   * Test {@link V4Event#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Event#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4Event.equals(Object)", "int V4Event.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V4Event v4Event = new V4Event();
    v4Event.messageId("42");

    // Act and Assert
    assertNotEquals(v4Event, new V4Event());
  }

  /**
   * Test {@link V4Event#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Event#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4Event.equals(Object)", "int V4Event.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V4Event v4Event = new V4Event();
    v4Event.timestamp(10L);

    // Act and Assert
    assertNotEquals(v4Event, new V4Event());
  }

  /**
   * Test {@link V4Event#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Event#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4Event.equals(Object)", "int V4Event.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V4Event v4Event = new V4Event();
    v4Event.type("Type");

    // Act and Assert
    assertNotEquals(v4Event, new V4Event());
  }

  /**
   * Test {@link V4Event#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Event#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4Event.equals(Object)", "int V4Event.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    V4Event v4Event = new V4Event();
    v4Event.diagnostic("Diagnostic");

    // Act and Assert
    assertNotEquals(v4Event, new V4Event());
  }

  /**
   * Test {@link V4Event#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Event#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4Event.equals(Object)", "int V4Event.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    V4Event v4Event = new V4Event();
    v4Event.initiator(new V4Initiator());

    // Act and Assert
    assertNotEquals(v4Event, new V4Event());
  }

  /**
   * Test {@link V4Event#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Event#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4Event.equals(Object)", "int V4Event.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    V4Event v4Event = new V4Event();
    v4Event.payload(new V4Payload());

    // Act and Assert
    assertNotEquals(v4Event, new V4Event());
  }

  /**
   * Test {@link V4Event#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Event#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4Event.equals(Object)", "int V4Event.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4Event(), null);
  }

  /**
   * Test {@link V4Event#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Event#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4Event.equals(Object)", "int V4Event.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4Event(), "Different type to V4Event");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V4Event}
   *   <li>{@link V4Event#diagnostic(String)}
   *   <li>{@link V4Event#id(String)}
   *   <li>{@link V4Event#initiator(V4Initiator)}
   *   <li>{@link V4Event#messageId(String)}
   *   <li>{@link V4Event#payload(V4Payload)}
   *   <li>{@link V4Event#setDiagnostic(String)}
   *   <li>{@link V4Event#setId(String)}
   *   <li>{@link V4Event#setInitiator(V4Initiator)}
   *   <li>{@link V4Event#setMessageId(String)}
   *   <li>{@link V4Event#setPayload(V4Payload)}
   *   <li>{@link V4Event#setTimestamp(Long)}
   *   <li>{@link V4Event#setType(String)}
   *   <li>{@link V4Event#timestamp(Long)}
   *   <li>{@link V4Event#type(String)}
   *   <li>{@link V4Event#toString()}
   *   <li>{@link V4Event#getDiagnostic()}
   *   <li>{@link V4Event#getId()}
   *   <li>{@link V4Event#getInitiator()}
   *   <li>{@link V4Event#getMessageId()}
   *   <li>{@link V4Event#getPayload()}
   *   <li>{@link V4Event#getTimestamp()}
   *   <li>{@link V4Event#getType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V4Event.<init>()", "V4Event V4Event.diagnostic(String)", "String V4Event.getDiagnostic()",
      "String V4Event.getId()", "V4Initiator V4Event.getInitiator()", "String V4Event.getMessageId()",
      "V4Payload V4Event.getPayload()", "Long V4Event.getTimestamp()", "String V4Event.getType()",
      "V4Event V4Event.id(String)", "V4Event V4Event.initiator(V4Initiator)", "V4Event V4Event.messageId(String)",
      "V4Event V4Event.payload(V4Payload)", "void V4Event.setDiagnostic(String)", "void V4Event.setId(String)",
      "void V4Event.setInitiator(V4Initiator)", "void V4Event.setMessageId(String)",
      "void V4Event.setPayload(V4Payload)", "void V4Event.setTimestamp(Long)", "void V4Event.setType(String)",
      "V4Event V4Event.timestamp(Long)", "String V4Event.toString()", "V4Event V4Event.type(String)"})
  void testGettersAndSetters() {
    // Arrange and Act
    V4Event actualV4Event = new V4Event();
    V4Event actualDiagnosticResult = actualV4Event.diagnostic("Diagnostic");
    V4Event actualIdResult = actualV4Event.id("42");
    V4Event actualInitiatorResult = actualV4Event.initiator(new V4Initiator());
    V4Event actualMessageIdResult = actualV4Event.messageId("42");
    V4Event actualPayloadResult = actualV4Event.payload(new V4Payload());
    actualV4Event.setDiagnostic("Diagnostic");
    actualV4Event.setId("42");
    V4Initiator initiator = new V4Initiator();
    actualV4Event.setInitiator(initiator);
    actualV4Event.setMessageId("42");
    V4Payload payload = new V4Payload();
    actualV4Event.setPayload(payload);
    actualV4Event.setTimestamp(10L);
    actualV4Event.setType("Type");
    V4Event actualTimestampResult = actualV4Event.timestamp(10L);
    V4Event actualTypeResult = actualV4Event.type("Type");
    String actualToStringResult = actualV4Event.toString();
    String actualDiagnostic = actualV4Event.getDiagnostic();
    String actualId = actualV4Event.getId();
    V4Initiator actualInitiator = actualV4Event.getInitiator();
    String actualMessageId = actualV4Event.getMessageId();
    V4Payload actualPayload = actualV4Event.getPayload();
    Long actualTimestamp = actualV4Event.getTimestamp();

    // Assert
    assertEquals("42", actualId);
    assertEquals("42", actualMessageId);
    assertEquals("Diagnostic", actualDiagnostic);
    assertEquals("Type", actualV4Event.getType());
    assertEquals(
        "class V4Event {\n" + "    id: 42\n" + "    messageId: 42\n" + "    timestamp: 10\n" + "    type: Type\n"
            + "    diagnostic: Diagnostic\n" + "    initiator: class V4Initiator {\n" + "        user: null\n"
            + "    }\n" + "    payload: class V4Payload {\n" + "        messageSent: null\n"
            + "        sharedPost: null\n" + "        instantMessageCreated: null\n" + "        roomCreated: null\n"
            + "        roomUpdated: null\n" + "        roomDeactivated: null\n" + "        roomReactivated: null\n"
            + "        userJoinedRoom: null\n" + "        userLeftRoom: null\n"
            + "        roomMemberPromotedToOwner: null\n" + "        roomMemberDemotedFromOwner: null\n"
            + "        connectionRequested: null\n" + "        connectionAccepted: null\n"
            + "        messageSuppressed: null\n" + "        symphonyElementsAction: null\n"
            + "        userRequestedToJoinRoom: null\n" + "        genericSystemEvent: null\n" + "    }\n" + "}",
        actualToStringResult);
    assertNull(actualInitiator.getUser());
    assertEquals(10L, actualTimestamp.longValue());
    assertSame(actualV4Event, actualDiagnosticResult);
    assertSame(actualV4Event, actualIdResult);
    assertSame(actualV4Event, actualInitiatorResult);
    assertSame(actualV4Event, actualMessageIdResult);
    assertSame(actualV4Event, actualPayloadResult);
    assertSame(actualV4Event, actualTimestampResult);
    assertSame(actualV4Event, actualTypeResult);
    assertSame(initiator, actualInitiator);
    assertSame(payload, actualPayload);
  }
}
