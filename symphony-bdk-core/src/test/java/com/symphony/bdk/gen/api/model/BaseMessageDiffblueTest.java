package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BaseMessageDiffblueTest {
  /**
   * Test {@link BaseMessage#equals(Object)}, and {@link BaseMessage#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BaseMessage#equals(Object)}
   *   <li>{@link BaseMessage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseMessage.equals(Object)", "int BaseMessage.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    BaseMessage baseMessage = new BaseMessage();
    BaseMessage baseMessage2 = new BaseMessage();

    // Act and Assert
    assertEquals(baseMessage, baseMessage2);
    assertEquals(baseMessage.hashCode(), baseMessage2.hashCode());
  }

  /**
   * Test {@link BaseMessage#equals(Object)}, and {@link BaseMessage#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BaseMessage#equals(Object)}
   *   <li>{@link BaseMessage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseMessage.equals(Object)", "int BaseMessage.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    BaseMessage baseMessage = new BaseMessage();

    // Act and Assert
    assertEquals(baseMessage, baseMessage);
    int expectedHashCodeResult = baseMessage.hashCode();
    assertEquals(expectedHashCodeResult, baseMessage.hashCode());
  }

  /**
   * Test {@link BaseMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BaseMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseMessage.equals(Object)", "int BaseMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Message message = new Message();

    // Act and Assert
    assertNotEquals(message, new BaseMessage());
  }

  /**
   * Test {@link BaseMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BaseMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseMessage.equals(Object)", "int BaseMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    BaseMessage baseMessage = new BaseMessage();
    baseMessage.id("42");

    // Act and Assert
    assertNotEquals(baseMessage, new BaseMessage());
  }

  /**
   * Test {@link BaseMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BaseMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseMessage.equals(Object)", "int BaseMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    BaseMessage baseMessage = new BaseMessage();
    baseMessage.timestamp("Timestamp");

    // Act and Assert
    assertNotEquals(baseMessage, new BaseMessage());
  }

  /**
   * Test {@link BaseMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BaseMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseMessage.equals(Object)", "int BaseMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    BaseMessage baseMessage = new BaseMessage();
    baseMessage.messageType("Message Type");

    // Act and Assert
    assertNotEquals(baseMessage, new BaseMessage());
  }

  /**
   * Test {@link BaseMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BaseMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseMessage.equals(Object)", "int BaseMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    BaseMessage baseMessage = new BaseMessage();
    baseMessage.streamId("42");

    // Act and Assert
    assertNotEquals(baseMessage, new BaseMessage());
  }

  /**
   * Test {@link BaseMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BaseMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseMessage.equals(Object)", "int BaseMessage.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new BaseMessage(), null);
  }

  /**
   * Test {@link BaseMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BaseMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseMessage.equals(Object)", "int BaseMessage.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new BaseMessage(), "Different type to BaseMessage");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link BaseMessage}
   *   <li>{@link BaseMessage#id(String)}
   *   <li>{@link BaseMessage#messageType(String)}
   *   <li>{@link BaseMessage#setId(String)}
   *   <li>{@link BaseMessage#setMessageType(String)}
   *   <li>{@link BaseMessage#setStreamId(String)}
   *   <li>{@link BaseMessage#setTimestamp(String)}
   *   <li>{@link BaseMessage#streamId(String)}
   *   <li>{@link BaseMessage#timestamp(String)}
   *   <li>{@link BaseMessage#toString()}
   *   <li>{@link BaseMessage#getId()}
   *   <li>{@link BaseMessage#getMessageType()}
   *   <li>{@link BaseMessage#getStreamId()}
   *   <li>{@link BaseMessage#getTimestamp()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void BaseMessage.<init>()",
    "String BaseMessage.getId()",
    "String BaseMessage.getMessageType()",
    "String BaseMessage.getStreamId()",
    "String BaseMessage.getTimestamp()",
    "BaseMessage BaseMessage.id(String)",
    "BaseMessage BaseMessage.messageType(String)",
    "void BaseMessage.setId(String)",
    "void BaseMessage.setMessageType(String)",
    "void BaseMessage.setStreamId(String)",
    "void BaseMessage.setTimestamp(String)",
    "BaseMessage BaseMessage.streamId(String)",
    "BaseMessage BaseMessage.timestamp(String)",
    "String BaseMessage.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    BaseMessage actualBaseMessage = new BaseMessage();
    BaseMessage actualIdResult = actualBaseMessage.id("42");
    BaseMessage actualMessageTypeResult = actualBaseMessage.messageType("Message Type");
    actualBaseMessage.setId("42");
    actualBaseMessage.setMessageType("Message Type");
    actualBaseMessage.setStreamId("42");
    actualBaseMessage.setTimestamp("Timestamp");
    BaseMessage actualStreamIdResult = actualBaseMessage.streamId("42");
    BaseMessage actualTimestampResult = actualBaseMessage.timestamp("Timestamp");
    String actualToStringResult = actualBaseMessage.toString();
    String actualId = actualBaseMessage.getId();
    String actualMessageType = actualBaseMessage.getMessageType();
    String actualStreamId = actualBaseMessage.getStreamId();

    // Assert
    assertEquals("42", actualId);
    assertEquals("42", actualStreamId);
    assertEquals("Message Type", actualMessageType);
    assertEquals("Timestamp", actualBaseMessage.getTimestamp());
    assertEquals(
        "class BaseMessage {\n"
            + "    id: 42\n"
            + "    timestamp: Timestamp\n"
            + "    messageType: Message Type\n"
            + "    streamId: 42\n"
            + "}",
        actualToStringResult);
    assertSame(actualBaseMessage, actualIdResult);
    assertSame(actualBaseMessage, actualMessageTypeResult);
    assertSame(actualBaseMessage, actualStreamIdResult);
    assertSame(actualBaseMessage, actualTimestampResult);
  }
}
