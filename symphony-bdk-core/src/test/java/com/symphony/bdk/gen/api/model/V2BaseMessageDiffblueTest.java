package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V2BaseMessageDiffblueTest {
  /**
   * Test {@link V2BaseMessage#equals(Object)}, and {@link V2BaseMessage#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2BaseMessage#equals(Object)}
   *   <li>{@link V2BaseMessage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2BaseMessage.equals(Object)", "int V2BaseMessage.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2BaseMessage v2BaseMessage = new V2BaseMessage();
    V2BaseMessage v2BaseMessage2 = new V2BaseMessage();

    // Act and Assert
    assertEquals(v2BaseMessage, v2BaseMessage2);
    assertEquals(v2BaseMessage.hashCode(), v2BaseMessage2.hashCode());
  }

  /**
   * Test {@link V2BaseMessage#equals(Object)}, and {@link V2BaseMessage#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2BaseMessage#equals(Object)}
   *   <li>{@link V2BaseMessage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2BaseMessage.equals(Object)", "int V2BaseMessage.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2BaseMessage v2BaseMessage = new V2BaseMessage();

    // Act and Assert
    assertEquals(v2BaseMessage, v2BaseMessage);
    int expectedHashCodeResult = v2BaseMessage.hashCode();
    assertEquals(expectedHashCodeResult, v2BaseMessage.hashCode());
  }

  /**
   * Test {@link V2BaseMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2BaseMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2BaseMessage.equals(Object)", "int V2BaseMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ConnectionRequestMessage connectionRequestMessage = new ConnectionRequestMessage();

    // Act and Assert
    assertNotEquals(connectionRequestMessage, new V2BaseMessage());
  }

  /**
   * Test {@link V2BaseMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2BaseMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2BaseMessage.equals(Object)", "int V2BaseMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V2BaseMessage v2BaseMessage = new V2BaseMessage();
    v2BaseMessage.id("42");

    // Act and Assert
    assertNotEquals(v2BaseMessage, new V2BaseMessage());
  }

  /**
   * Test {@link V2BaseMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2BaseMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2BaseMessage.equals(Object)", "int V2BaseMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V2BaseMessage v2BaseMessage = new V2BaseMessage();
    v2BaseMessage.timestamp("Timestamp");

    // Act and Assert
    assertNotEquals(v2BaseMessage, new V2BaseMessage());
  }

  /**
   * Test {@link V2BaseMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2BaseMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2BaseMessage.equals(Object)", "int V2BaseMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V2BaseMessage v2BaseMessage = new V2BaseMessage();
    v2BaseMessage.v2messageType("V2message Type");

    // Act and Assert
    assertNotEquals(v2BaseMessage, new V2BaseMessage());
  }

  /**
   * Test {@link V2BaseMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2BaseMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2BaseMessage.equals(Object)", "int V2BaseMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V2BaseMessage v2BaseMessage = new V2BaseMessage();
    v2BaseMessage.streamId("42");

    // Act and Assert
    assertNotEquals(v2BaseMessage, new V2BaseMessage());
  }

  /**
   * Test {@link V2BaseMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2BaseMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2BaseMessage.equals(Object)", "int V2BaseMessage.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2BaseMessage(), null);
  }

  /**
   * Test {@link V2BaseMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2BaseMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2BaseMessage.equals(Object)", "int V2BaseMessage.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2BaseMessage(), "Different type to V2BaseMessage");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V2BaseMessage}
   *   <li>{@link V2BaseMessage#id(String)}
   *   <li>{@link V2BaseMessage#setId(String)}
   *   <li>{@link V2BaseMessage#setStreamId(String)}
   *   <li>{@link V2BaseMessage#setTimestamp(String)}
   *   <li>{@link V2BaseMessage#setV2messageType(String)}
   *   <li>{@link V2BaseMessage#streamId(String)}
   *   <li>{@link V2BaseMessage#timestamp(String)}
   *   <li>{@link V2BaseMessage#v2messageType(String)}
   *   <li>{@link V2BaseMessage#toString()}
   *   <li>{@link V2BaseMessage#getId()}
   *   <li>{@link V2BaseMessage#getStreamId()}
   *   <li>{@link V2BaseMessage#getTimestamp()}
   *   <li>{@link V2BaseMessage#getV2messageType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V2BaseMessage.<init>()",
    "String V2BaseMessage.getId()",
    "String V2BaseMessage.getStreamId()",
    "String V2BaseMessage.getTimestamp()",
    "String V2BaseMessage.getV2messageType()",
    "V2BaseMessage V2BaseMessage.id(String)",
    "void V2BaseMessage.setId(String)",
    "void V2BaseMessage.setStreamId(String)",
    "void V2BaseMessage.setTimestamp(String)",
    "void V2BaseMessage.setV2messageType(String)",
    "V2BaseMessage V2BaseMessage.streamId(String)",
    "V2BaseMessage V2BaseMessage.timestamp(String)",
    "String V2BaseMessage.toString()",
    "V2BaseMessage V2BaseMessage.v2messageType(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V2BaseMessage actualV2BaseMessage = new V2BaseMessage();
    V2BaseMessage actualIdResult = actualV2BaseMessage.id("42");
    actualV2BaseMessage.setId("42");
    actualV2BaseMessage.setStreamId("42");
    actualV2BaseMessage.setTimestamp("Timestamp");
    actualV2BaseMessage.setV2messageType("V2message Type");
    V2BaseMessage actualStreamIdResult = actualV2BaseMessage.streamId("42");
    V2BaseMessage actualTimestampResult = actualV2BaseMessage.timestamp("Timestamp");
    V2BaseMessage actualV2messageTypeResult = actualV2BaseMessage.v2messageType("V2message Type");
    String actualToStringResult = actualV2BaseMessage.toString();
    String actualId = actualV2BaseMessage.getId();
    String actualStreamId = actualV2BaseMessage.getStreamId();
    String actualTimestamp = actualV2BaseMessage.getTimestamp();

    // Assert
    assertEquals("42", actualId);
    assertEquals("42", actualStreamId);
    assertEquals("Timestamp", actualTimestamp);
    assertEquals("V2message Type", actualV2BaseMessage.getV2messageType());
    assertEquals(
        "class V2BaseMessage {\n"
            + "    id: 42\n"
            + "    timestamp: Timestamp\n"
            + "    v2messageType: V2message Type\n"
            + "    streamId: 42\n"
            + "}",
        actualToStringResult);
    assertSame(actualV2BaseMessage, actualIdResult);
    assertSame(actualV2BaseMessage, actualStreamIdResult);
    assertSame(actualV2BaseMessage, actualTimestampResult);
    assertSame(actualV2BaseMessage, actualV2messageTypeResult);
  }
}
