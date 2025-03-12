package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MessageDiffblueTest {
  /**
   * Test {@link Message#equals(Object)}, and {@link Message#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Message#equals(Object)}
   *   <li>{@link Message#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Message.equals(Object)", "int Message.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Message message = new Message();
    Message message2 = new Message();

    // Act and Assert
    assertEquals(message, message2);
    int expectedHashCodeResult = message.hashCode();
    assertEquals(expectedHashCodeResult, message2.hashCode());
  }

  /**
   * Test {@link Message#equals(Object)}, and {@link Message#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Message#equals(Object)}
   *   <li>{@link Message#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Message.equals(Object)", "int Message.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Message message = new Message();

    // Act and Assert
    assertEquals(message, message);
    int expectedHashCodeResult = message.hashCode();
    assertEquals(expectedHashCodeResult, message.hashCode());
  }

  /**
   * Test {@link Message#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Message#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Message.equals(Object)", "int Message.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Message(), 1);
  }

  /**
   * Test {@link Message#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Message#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Message.equals(Object)", "int Message.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Message message = new Message();
    message.message("Not all who wander are lost");

    // Act and Assert
    assertNotEquals(message, new Message());
  }

  /**
   * Test {@link Message#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Message#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Message.equals(Object)", "int Message.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Message message = new Message();
    message.fromUserId(1L);

    // Act and Assert
    assertNotEquals(message, new Message());
  }

  /**
   * Test {@link Message#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Message#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Message.equals(Object)", "int Message.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    Message message = new Message();
    message.id("42");

    // Act and Assert
    assertNotEquals(message, new Message());
  }

  /**
   * Test {@link Message#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Message#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Message.equals(Object)", "int Message.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Message(), null);
  }

  /**
   * Test {@link Message#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Message#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Message.equals(Object)", "int Message.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Message(), "Different type to Message");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link Message}
   *   <li>{@link Message#fromUserId(Long)}
   *   <li>{@link Message#message(String)}
   *   <li>{@link Message#setFromUserId(Long)}
   *   <li>{@link Message#setMessage(String)}
   *   <li>{@link Message#toString()}
   *   <li>{@link Message#getFromUserId()}
   *   <li>{@link Message#getMessage()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void Message.<init>()", "Message Message.fromUserId(Long)", "Long Message.getFromUserId()",
      "String Message.getMessage()", "Message Message.message(String)", "void Message.setFromUserId(Long)",
      "void Message.setMessage(String)", "String Message.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    Message actualMessage = new Message();
    Message actualFromUserIdResult = actualMessage.fromUserId(1L);
    Message actualMessageResult = actualMessage.message("Not all who wander are lost");
    actualMessage.setFromUserId(1L);
    actualMessage.setMessage("Not all who wander are lost");
    String actualToStringResult = actualMessage.toString();
    Long actualFromUserId = actualMessage.getFromUserId();

    // Assert
    assertEquals("Not all who wander are lost", actualMessage.getMessage());
    assertEquals("class Message {\n" + "    class BaseMessage {\n" + "        id: null\n" + "        timestamp: null\n"
        + "        messageType: null\n" + "        streamId: null\n" + "    }\n"
        + "    message: Not all who wander are lost\n" + "    fromUserId: 1\n" + "}", actualToStringResult);
    assertNull(actualMessage.getId());
    assertNull(actualMessage.getMessageType());
    assertNull(actualMessage.getStreamId());
    assertNull(actualMessage.getTimestamp());
    assertEquals(1L, actualFromUserId.longValue());
    assertSame(actualMessage, actualFromUserIdResult);
    assertSame(actualMessage, actualMessageResult);
  }
}
