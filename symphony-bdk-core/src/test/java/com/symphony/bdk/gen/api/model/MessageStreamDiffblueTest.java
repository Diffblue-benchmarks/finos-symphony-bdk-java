package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MessageStreamDiffblueTest {
  /**
   * Test {@link MessageStream#equals(Object)}, and {@link MessageStream#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MessageStream#equals(Object)}
   *   <li>{@link MessageStream#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageStream.equals(Object)", "int MessageStream.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MessageStream messageStream = new MessageStream();
    MessageStream messageStream2 = new MessageStream();

    // Act and Assert
    assertEquals(messageStream, messageStream2);
    assertEquals(messageStream.hashCode(), messageStream2.hashCode());
  }

  /**
   * Test {@link MessageStream#equals(Object)}, and {@link MessageStream#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MessageStream#equals(Object)}
   *   <li>{@link MessageStream#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageStream.equals(Object)", "int MessageStream.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MessageStream messageStream = new MessageStream();

    // Act and Assert
    assertEquals(messageStream, messageStream);
    int expectedHashCodeResult = messageStream.hashCode();
    assertEquals(expectedHashCodeResult, messageStream.hashCode());
  }

  /**
   * Test {@link MessageStream#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageStream.equals(Object)", "int MessageStream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageStream(), 1);
  }

  /**
   * Test {@link MessageStream#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageStream.equals(Object)", "int MessageStream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    MessageStream messageStream = new MessageStream();
    messageStream.id("42");

    // Act and Assert
    assertNotEquals(messageStream, new MessageStream());
  }

  /**
   * Test {@link MessageStream#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageStream.equals(Object)", "int MessageStream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    MessageStream messageStream = new MessageStream();
    messageStream.name("Name");

    // Act and Assert
    assertNotEquals(messageStream, new MessageStream());
  }

  /**
   * Test {@link MessageStream#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageStream.equals(Object)", "int MessageStream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    MessageStream messageStream = new MessageStream();
    messageStream.streamType("Stream Type");

    // Act and Assert
    assertNotEquals(messageStream, new MessageStream());
  }

  /**
   * Test {@link MessageStream#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageStream.equals(Object)", "int MessageStream.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageStream(), null);
  }

  /**
   * Test {@link MessageStream#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageStream.equals(Object)", "int MessageStream.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageStream(), "Different type to MessageStream");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link MessageStream}
   *   <li>{@link MessageStream#id(String)}
   *   <li>{@link MessageStream#name(String)}
   *   <li>{@link MessageStream#setId(String)}
   *   <li>{@link MessageStream#setName(String)}
   *   <li>{@link MessageStream#setStreamType(String)}
   *   <li>{@link MessageStream#streamType(String)}
   *   <li>{@link MessageStream#toString()}
   *   <li>{@link MessageStream#getId()}
   *   <li>{@link MessageStream#getName()}
   *   <li>{@link MessageStream#getStreamType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void MessageStream.<init>()",
    "String MessageStream.getId()",
    "String MessageStream.getName()",
    "String MessageStream.getStreamType()",
    "MessageStream MessageStream.id(String)",
    "MessageStream MessageStream.name(String)",
    "void MessageStream.setId(String)",
    "void MessageStream.setName(String)",
    "void MessageStream.setStreamType(String)",
    "MessageStream MessageStream.streamType(String)",
    "String MessageStream.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    MessageStream actualMessageStream = new MessageStream();
    MessageStream actualIdResult = actualMessageStream.id("42");
    MessageStream actualNameResult = actualMessageStream.name("Name");
    actualMessageStream.setId("42");
    actualMessageStream.setName("Name");
    actualMessageStream.setStreamType("Stream Type");
    MessageStream actualStreamTypeResult = actualMessageStream.streamType("Stream Type");
    String actualToStringResult = actualMessageStream.toString();
    String actualId = actualMessageStream.getId();
    String actualName = actualMessageStream.getName();

    // Assert
    assertEquals("42", actualId);
    assertEquals("Name", actualName);
    assertEquals("Stream Type", actualMessageStream.getStreamType());
    assertEquals(
        "class MessageStream {\n    id: 42\n    name: Name\n    streamType: Stream Type\n}",
        actualToStringResult);
    assertSame(actualMessageStream, actualIdResult);
    assertSame(actualMessageStream, actualNameResult);
    assertSame(actualMessageStream, actualStreamTypeResult);
  }
}
