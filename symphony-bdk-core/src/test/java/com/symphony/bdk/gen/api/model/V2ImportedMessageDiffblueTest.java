package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.V2ImportedMessage.FormatEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V2ImportedMessageDiffblueTest {
  /**
   * Test {@link V2ImportedMessage#equals(Object)}, and {@link V2ImportedMessage#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2ImportedMessage#equals(Object)}
   *   <li>{@link V2ImportedMessage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2ImportedMessage.equals(Object)",
    "int V2ImportedMessage.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2ImportedMessage v2ImportedMessage = new V2ImportedMessage();
    V2ImportedMessage v2ImportedMessage2 = new V2ImportedMessage();

    // Act and Assert
    assertEquals(v2ImportedMessage, v2ImportedMessage2);
    int expectedHashCodeResult = v2ImportedMessage.hashCode();
    assertEquals(expectedHashCodeResult, v2ImportedMessage2.hashCode());
  }

  /**
   * Test {@link V2ImportedMessage#equals(Object)}, and {@link V2ImportedMessage#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2ImportedMessage#equals(Object)}
   *   <li>{@link V2ImportedMessage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2ImportedMessage.equals(Object)",
    "int V2ImportedMessage.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2ImportedMessage v2ImportedMessage = new V2ImportedMessage();

    // Act and Assert
    assertEquals(v2ImportedMessage, v2ImportedMessage);
    int expectedHashCodeResult = v2ImportedMessage.hashCode();
    assertEquals(expectedHashCodeResult, v2ImportedMessage.hashCode());
  }

  /**
   * Test {@link V2ImportedMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2ImportedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2ImportedMessage.equals(Object)",
    "int V2ImportedMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2ImportedMessage(), 1);
  }

  /**
   * Test {@link V2ImportedMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2ImportedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2ImportedMessage.equals(Object)",
    "int V2ImportedMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V2ImportedMessage v2ImportedMessage = new V2ImportedMessage();
    v2ImportedMessage.message("Not all who wander are lost");

    // Act and Assert
    assertNotEquals(v2ImportedMessage, new V2ImportedMessage());
  }

  /**
   * Test {@link V2ImportedMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2ImportedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2ImportedMessage.equals(Object)",
    "int V2ImportedMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V2ImportedMessage v2ImportedMessage = new V2ImportedMessage();
    v2ImportedMessage.format(FormatEnum.TEXT);

    // Act and Assert
    assertNotEquals(v2ImportedMessage, new V2ImportedMessage());
  }

  /**
   * Test {@link V2ImportedMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2ImportedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2ImportedMessage.equals(Object)",
    "int V2ImportedMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V2ImportedMessage v2ImportedMessage = new V2ImportedMessage();
    v2ImportedMessage.intendedMessageTimestamp(1L);

    // Act and Assert
    assertNotEquals(v2ImportedMessage, new V2ImportedMessage());
  }

  /**
   * Test {@link V2ImportedMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2ImportedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2ImportedMessage.equals(Object)",
    "int V2ImportedMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V2ImportedMessage v2ImportedMessage = new V2ImportedMessage();
    v2ImportedMessage.intendedMessageFromUserId(1L);

    // Act and Assert
    assertNotEquals(v2ImportedMessage, new V2ImportedMessage());
  }

  /**
   * Test {@link V2ImportedMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2ImportedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2ImportedMessage.equals(Object)",
    "int V2ImportedMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    V2ImportedMessage v2ImportedMessage = new V2ImportedMessage();
    v2ImportedMessage.originatingSystemId("42");

    // Act and Assert
    assertNotEquals(v2ImportedMessage, new V2ImportedMessage());
  }

  /**
   * Test {@link V2ImportedMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2ImportedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2ImportedMessage.equals(Object)",
    "int V2ImportedMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    V2ImportedMessage v2ImportedMessage = new V2ImportedMessage();
    v2ImportedMessage.originalMessageId("42");

    // Act and Assert
    assertNotEquals(v2ImportedMessage, new V2ImportedMessage());
  }

  /**
   * Test {@link V2ImportedMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2ImportedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2ImportedMessage.equals(Object)",
    "int V2ImportedMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    V2ImportedMessage v2ImportedMessage = new V2ImportedMessage();
    v2ImportedMessage.streamId("42");

    // Act and Assert
    assertNotEquals(v2ImportedMessage, new V2ImportedMessage());
  }

  /**
   * Test {@link V2ImportedMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2ImportedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2ImportedMessage.equals(Object)",
    "int V2ImportedMessage.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2ImportedMessage(), null);
  }

  /**
   * Test {@link V2ImportedMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2ImportedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2ImportedMessage.equals(Object)",
    "int V2ImportedMessage.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2ImportedMessage(), "Different type to V2ImportedMessage");
  }

  /**
   * Test FormatEnum {@link FormatEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link FormatEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test FormatEnum fromValue(String); when '42'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FormatEnum FormatEnum.fromValue(String)"})
  void testFormatEnumFromValue_when42_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(FormatEnum.fromValue("42"));
  }

  /**
   * Test FormatEnum {@link FormatEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code TEXT}.
   *   <li>Then return {@code TEXT}.
   * </ul>
   *
   * <p>Method under test: {@link FormatEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test FormatEnum fromValue(String); when 'TEXT'; then return 'TEXT'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FormatEnum FormatEnum.fromValue(String)"})
  void testFormatEnumFromValue_whenText_thenReturnText() {
    // Arrange, Act and Assert
    assertEquals(FormatEnum.TEXT, FormatEnum.fromValue("TEXT"));
  }

  /**
   * Test FormatEnum getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FormatEnum#toString()}
   *   <li>{@link FormatEnum#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test FormatEnum getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FormatEnum.getValue()", "String FormatEnum.toString()"})
  void testFormatEnumGettersAndSetters() {
    // Arrange
    FormatEnum valueOfResult = FormatEnum.valueOf("TEXT");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("TEXT", valueOfResult.getValue());
    assertEquals("TEXT", actualToStringResult);
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V2ImportedMessage}
   *   <li>{@link V2ImportedMessage#format(FormatEnum)}
   *   <li>{@link V2ImportedMessage#intendedMessageFromUserId(Long)}
   *   <li>{@link V2ImportedMessage#intendedMessageTimestamp(Long)}
   *   <li>{@link V2ImportedMessage#message(String)}
   *   <li>{@link V2ImportedMessage#originalMessageId(String)}
   *   <li>{@link V2ImportedMessage#originatingSystemId(String)}
   *   <li>{@link V2ImportedMessage#setFormat(FormatEnum)}
   *   <li>{@link V2ImportedMessage#setIntendedMessageFromUserId(Long)}
   *   <li>{@link V2ImportedMessage#setIntendedMessageTimestamp(Long)}
   *   <li>{@link V2ImportedMessage#setMessage(String)}
   *   <li>{@link V2ImportedMessage#setOriginalMessageId(String)}
   *   <li>{@link V2ImportedMessage#setOriginatingSystemId(String)}
   *   <li>{@link V2ImportedMessage#setStreamId(String)}
   *   <li>{@link V2ImportedMessage#streamId(String)}
   *   <li>{@link V2ImportedMessage#toString()}
   *   <li>{@link V2ImportedMessage#getFormat()}
   *   <li>{@link V2ImportedMessage#getIntendedMessageFromUserId()}
   *   <li>{@link V2ImportedMessage#getIntendedMessageTimestamp()}
   *   <li>{@link V2ImportedMessage#getMessage()}
   *   <li>{@link V2ImportedMessage#getOriginalMessageId()}
   *   <li>{@link V2ImportedMessage#getOriginatingSystemId()}
   *   <li>{@link V2ImportedMessage#getStreamId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V2ImportedMessage.<init>()",
    "V2ImportedMessage V2ImportedMessage.format(FormatEnum)",
    "FormatEnum V2ImportedMessage.getFormat()",
    "Long V2ImportedMessage.getIntendedMessageFromUserId()",
    "Long V2ImportedMessage.getIntendedMessageTimestamp()",
    "String V2ImportedMessage.getMessage()",
    "String V2ImportedMessage.getOriginalMessageId()",
    "String V2ImportedMessage.getOriginatingSystemId()",
    "String V2ImportedMessage.getStreamId()",
    "V2ImportedMessage V2ImportedMessage.intendedMessageFromUserId(Long)",
    "V2ImportedMessage V2ImportedMessage.intendedMessageTimestamp(Long)",
    "V2ImportedMessage V2ImportedMessage.message(String)",
    "V2ImportedMessage V2ImportedMessage.originalMessageId(String)",
    "V2ImportedMessage V2ImportedMessage.originatingSystemId(String)",
    "void V2ImportedMessage.setFormat(FormatEnum)",
    "void V2ImportedMessage.setIntendedMessageFromUserId(Long)",
    "void V2ImportedMessage.setIntendedMessageTimestamp(Long)",
    "void V2ImportedMessage.setMessage(String)",
    "void V2ImportedMessage.setOriginalMessageId(String)",
    "void V2ImportedMessage.setOriginatingSystemId(String)",
    "void V2ImportedMessage.setStreamId(String)",
    "V2ImportedMessage V2ImportedMessage.streamId(String)",
    "String V2ImportedMessage.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V2ImportedMessage actualV2ImportedMessage = new V2ImportedMessage();
    V2ImportedMessage actualFormatResult = actualV2ImportedMessage.format(FormatEnum.TEXT);
    V2ImportedMessage actualIntendedMessageFromUserIdResult =
        actualV2ImportedMessage.intendedMessageFromUserId(1L);
    V2ImportedMessage actualIntendedMessageTimestampResult =
        actualV2ImportedMessage.intendedMessageTimestamp(1L);
    V2ImportedMessage actualMessageResult =
        actualV2ImportedMessage.message("Not all who wander are lost");
    V2ImportedMessage actualOriginalMessageIdResult =
        actualV2ImportedMessage.originalMessageId("42");
    V2ImportedMessage actualOriginatingSystemIdResult =
        actualV2ImportedMessage.originatingSystemId("42");
    actualV2ImportedMessage.setFormat(FormatEnum.TEXT);
    actualV2ImportedMessage.setIntendedMessageFromUserId(1L);
    actualV2ImportedMessage.setIntendedMessageTimestamp(1L);
    actualV2ImportedMessage.setMessage("Not all who wander are lost");
    actualV2ImportedMessage.setOriginalMessageId("42");
    actualV2ImportedMessage.setOriginatingSystemId("42");
    actualV2ImportedMessage.setStreamId("42");
    V2ImportedMessage actualStreamIdResult = actualV2ImportedMessage.streamId("42");
    String actualToStringResult = actualV2ImportedMessage.toString();
    FormatEnum actualFormat = actualV2ImportedMessage.getFormat();
    Long actualIntendedMessageFromUserId = actualV2ImportedMessage.getIntendedMessageFromUserId();
    Long actualIntendedMessageTimestamp = actualV2ImportedMessage.getIntendedMessageTimestamp();
    String actualMessage = actualV2ImportedMessage.getMessage();
    String actualOriginalMessageId = actualV2ImportedMessage.getOriginalMessageId();
    String actualOriginatingSystemId = actualV2ImportedMessage.getOriginatingSystemId();

    // Assert
    assertEquals("42", actualOriginalMessageId);
    assertEquals("42", actualOriginatingSystemId);
    assertEquals("42", actualV2ImportedMessage.getStreamId());
    assertEquals("Not all who wander are lost", actualMessage);
    assertEquals(
        "class V2ImportedMessage {\n"
            + "    message: Not all who wander are lost\n"
            + "    format: TEXT\n"
            + "    intendedMessageTimestamp: 1\n"
            + "    intendedMessageFromUserId: 1\n"
            + "    originatingSystemId: 42\n"
            + "    originalMessageId: 42\n"
            + "    streamId: 42\n"
            + "}",
        actualToStringResult);
    assertEquals(1L, actualIntendedMessageFromUserId.longValue());
    assertEquals(1L, actualIntendedMessageTimestamp.longValue());
    assertEquals(FormatEnum.TEXT, actualFormat);
    assertSame(actualV2ImportedMessage, actualFormatResult);
    assertSame(actualV2ImportedMessage, actualIntendedMessageFromUserIdResult);
    assertSame(actualV2ImportedMessage, actualIntendedMessageTimestampResult);
    assertSame(actualV2ImportedMessage, actualMessageResult);
    assertSame(actualV2ImportedMessage, actualOriginalMessageIdResult);
    assertSame(actualV2ImportedMessage, actualOriginatingSystemIdResult);
    assertSame(actualV2ImportedMessage, actualStreamIdResult);
  }
}
