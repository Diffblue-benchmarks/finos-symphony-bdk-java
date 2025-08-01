package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.ImportedMessage.FormatEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ImportedMessageDiffblueTest {
  /**
   * Test {@link ImportedMessage#equals(Object)}, and {@link ImportedMessage#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ImportedMessage#equals(Object)}
   *   <li>{@link ImportedMessage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImportedMessage.equals(Object)", "int ImportedMessage.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ImportedMessage importedMessage = new ImportedMessage();
    ImportedMessage importedMessage2 = new ImportedMessage();

    // Act and Assert
    assertEquals(importedMessage, importedMessage2);
    int expectedHashCodeResult = importedMessage.hashCode();
    assertEquals(expectedHashCodeResult, importedMessage2.hashCode());
  }

  /**
   * Test {@link ImportedMessage#equals(Object)}, and {@link ImportedMessage#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ImportedMessage#equals(Object)}
   *   <li>{@link ImportedMessage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImportedMessage.equals(Object)", "int ImportedMessage.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ImportedMessage importedMessage = new ImportedMessage();

    // Act and Assert
    assertEquals(importedMessage, importedMessage);
    int expectedHashCodeResult = importedMessage.hashCode();
    assertEquals(expectedHashCodeResult, importedMessage.hashCode());
  }

  /**
   * Test {@link ImportedMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImportedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImportedMessage.equals(Object)", "int ImportedMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ImportedMessage(), 1);
  }

  /**
   * Test {@link ImportedMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImportedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImportedMessage.equals(Object)", "int ImportedMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ImportedMessage importedMessage = new ImportedMessage();
    importedMessage.message("Not all who wander are lost");

    // Act and Assert
    assertNotEquals(importedMessage, new ImportedMessage());
  }

  /**
   * Test {@link ImportedMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImportedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImportedMessage.equals(Object)", "int ImportedMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ImportedMessage importedMessage = new ImportedMessage();
    importedMessage.format(FormatEnum.TEXT);

    // Act and Assert
    assertNotEquals(importedMessage, new ImportedMessage());
  }

  /**
   * Test {@link ImportedMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImportedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImportedMessage.equals(Object)", "int ImportedMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    ImportedMessage importedMessage = new ImportedMessage();
    importedMessage.intendedMessageTimestamp(1L);

    // Act and Assert
    assertNotEquals(importedMessage, new ImportedMessage());
  }

  /**
   * Test {@link ImportedMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImportedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImportedMessage.equals(Object)", "int ImportedMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    ImportedMessage importedMessage = new ImportedMessage();
    importedMessage.intendedMessageFromUserId(1L);

    // Act and Assert
    assertNotEquals(importedMessage, new ImportedMessage());
  }

  /**
   * Test {@link ImportedMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImportedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImportedMessage.equals(Object)", "int ImportedMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    ImportedMessage importedMessage = new ImportedMessage();
    importedMessage.originatingSystemId("42");

    // Act and Assert
    assertNotEquals(importedMessage, new ImportedMessage());
  }

  /**
   * Test {@link ImportedMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImportedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImportedMessage.equals(Object)", "int ImportedMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    ImportedMessage importedMessage = new ImportedMessage();
    importedMessage.streamId("42");

    // Act and Assert
    assertNotEquals(importedMessage, new ImportedMessage());
  }

  /**
   * Test {@link ImportedMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImportedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImportedMessage.equals(Object)", "int ImportedMessage.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ImportedMessage(), null);
  }

  /**
   * Test {@link ImportedMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImportedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImportedMessage.equals(Object)", "int ImportedMessage.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ImportedMessage(), "Different type to ImportedMessage");
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
   *   <li>default or parameterless constructor of {@link ImportedMessage}
   *   <li>{@link ImportedMessage#format(FormatEnum)}
   *   <li>{@link ImportedMessage#intendedMessageFromUserId(Long)}
   *   <li>{@link ImportedMessage#intendedMessageTimestamp(Long)}
   *   <li>{@link ImportedMessage#message(String)}
   *   <li>{@link ImportedMessage#originatingSystemId(String)}
   *   <li>{@link ImportedMessage#setFormat(FormatEnum)}
   *   <li>{@link ImportedMessage#setIntendedMessageFromUserId(Long)}
   *   <li>{@link ImportedMessage#setIntendedMessageTimestamp(Long)}
   *   <li>{@link ImportedMessage#setMessage(String)}
   *   <li>{@link ImportedMessage#setOriginatingSystemId(String)}
   *   <li>{@link ImportedMessage#setStreamId(String)}
   *   <li>{@link ImportedMessage#streamId(String)}
   *   <li>{@link ImportedMessage#toString()}
   *   <li>{@link ImportedMessage#getFormat()}
   *   <li>{@link ImportedMessage#getIntendedMessageFromUserId()}
   *   <li>{@link ImportedMessage#getIntendedMessageTimestamp()}
   *   <li>{@link ImportedMessage#getMessage()}
   *   <li>{@link ImportedMessage#getOriginatingSystemId()}
   *   <li>{@link ImportedMessage#getStreamId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ImportedMessage.<init>()",
    "ImportedMessage ImportedMessage.format(FormatEnum)",
    "FormatEnum ImportedMessage.getFormat()",
    "Long ImportedMessage.getIntendedMessageFromUserId()",
    "Long ImportedMessage.getIntendedMessageTimestamp()",
    "String ImportedMessage.getMessage()",
    "String ImportedMessage.getOriginatingSystemId()",
    "String ImportedMessage.getStreamId()",
    "ImportedMessage ImportedMessage.intendedMessageFromUserId(Long)",
    "ImportedMessage ImportedMessage.intendedMessageTimestamp(Long)",
    "ImportedMessage ImportedMessage.message(String)",
    "ImportedMessage ImportedMessage.originatingSystemId(String)",
    "void ImportedMessage.setFormat(FormatEnum)",
    "void ImportedMessage.setIntendedMessageFromUserId(Long)",
    "void ImportedMessage.setIntendedMessageTimestamp(Long)",
    "void ImportedMessage.setMessage(String)",
    "void ImportedMessage.setOriginatingSystemId(String)",
    "void ImportedMessage.setStreamId(String)",
    "ImportedMessage ImportedMessage.streamId(String)",
    "String ImportedMessage.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    ImportedMessage actualImportedMessage = new ImportedMessage();
    ImportedMessage actualFormatResult = actualImportedMessage.format(FormatEnum.TEXT);
    ImportedMessage actualIntendedMessageFromUserIdResult =
        actualImportedMessage.intendedMessageFromUserId(1L);
    ImportedMessage actualIntendedMessageTimestampResult =
        actualImportedMessage.intendedMessageTimestamp(1L);
    ImportedMessage actualMessageResult =
        actualImportedMessage.message("Not all who wander are lost");
    ImportedMessage actualOriginatingSystemIdResult =
        actualImportedMessage.originatingSystemId("42");
    actualImportedMessage.setFormat(FormatEnum.TEXT);
    actualImportedMessage.setIntendedMessageFromUserId(1L);
    actualImportedMessage.setIntendedMessageTimestamp(1L);
    actualImportedMessage.setMessage("Not all who wander are lost");
    actualImportedMessage.setOriginatingSystemId("42");
    actualImportedMessage.setStreamId("42");
    ImportedMessage actualStreamIdResult = actualImportedMessage.streamId("42");
    String actualToStringResult = actualImportedMessage.toString();
    FormatEnum actualFormat = actualImportedMessage.getFormat();
    Long actualIntendedMessageFromUserId = actualImportedMessage.getIntendedMessageFromUserId();
    Long actualIntendedMessageTimestamp = actualImportedMessage.getIntendedMessageTimestamp();
    String actualMessage = actualImportedMessage.getMessage();
    String actualOriginatingSystemId = actualImportedMessage.getOriginatingSystemId();

    // Assert
    assertEquals("42", actualOriginatingSystemId);
    assertEquals("42", actualImportedMessage.getStreamId());
    assertEquals("Not all who wander are lost", actualMessage);
    assertEquals(
        "class ImportedMessage {\n"
            + "    message: Not all who wander are lost\n"
            + "    format: TEXT\n"
            + "    intendedMessageTimestamp: 1\n"
            + "    intendedMessageFromUserId: 1\n"
            + "    originatingSystemId: 42\n"
            + "    streamId: 42\n"
            + "}",
        actualToStringResult);
    assertEquals(1L, actualIntendedMessageFromUserId.longValue());
    assertEquals(1L, actualIntendedMessageTimestamp.longValue());
    assertEquals(FormatEnum.TEXT, actualFormat);
    assertSame(actualImportedMessage, actualFormatResult);
    assertSame(actualImportedMessage, actualIntendedMessageFromUserIdResult);
    assertSame(actualImportedMessage, actualIntendedMessageTimestampResult);
    assertSame(actualImportedMessage, actualMessageResult);
    assertSame(actualImportedMessage, actualOriginatingSystemIdResult);
    assertSame(actualImportedMessage, actualStreamIdResult);
  }
}
