package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.MessageMetadataResponseParent.RelationshipTypeEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MessageMetadataResponseParentDiffblueTest {
  /**
   * Test {@link MessageMetadataResponseParent#equals(Object)}, and {@link
   * MessageMetadataResponseParent#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MessageMetadataResponseParent#equals(Object)}
   *   <li>{@link MessageMetadataResponseParent#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageMetadataResponseParent.equals(Object)",
    "int MessageMetadataResponseParent.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MessageMetadataResponseParent messageMetadataResponseParent =
        new MessageMetadataResponseParent();
    MessageMetadataResponseParent messageMetadataResponseParent2 =
        new MessageMetadataResponseParent();

    // Act and Assert
    assertEquals(messageMetadataResponseParent, messageMetadataResponseParent2);
    assertEquals(
        messageMetadataResponseParent.hashCode(), messageMetadataResponseParent2.hashCode());
  }

  /**
   * Test {@link MessageMetadataResponseParent#equals(Object)}, and {@link
   * MessageMetadataResponseParent#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MessageMetadataResponseParent#equals(Object)}
   *   <li>{@link MessageMetadataResponseParent#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageMetadataResponseParent.equals(Object)",
    "int MessageMetadataResponseParent.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MessageMetadataResponseParent messageMetadataResponseParent =
        new MessageMetadataResponseParent();

    // Act and Assert
    assertEquals(messageMetadataResponseParent, messageMetadataResponseParent);
    int expectedHashCodeResult = messageMetadataResponseParent.hashCode();
    assertEquals(expectedHashCodeResult, messageMetadataResponseParent.hashCode());
  }

  /**
   * Test {@link MessageMetadataResponseParent#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageMetadataResponseParent#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageMetadataResponseParent.equals(Object)",
    "int MessageMetadataResponseParent.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageMetadataResponseParent(), 1);
  }

  /**
   * Test {@link MessageMetadataResponseParent#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageMetadataResponseParent#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageMetadataResponseParent.equals(Object)",
    "int MessageMetadataResponseParent.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    MessageMetadataResponseParent messageMetadataResponseParent =
        new MessageMetadataResponseParent();
    messageMetadataResponseParent.messageId("42");

    // Act and Assert
    assertNotEquals(messageMetadataResponseParent, new MessageMetadataResponseParent());
  }

  /**
   * Test {@link MessageMetadataResponseParent#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageMetadataResponseParent#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageMetadataResponseParent.equals(Object)",
    "int MessageMetadataResponseParent.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    MessageMetadataResponseParent messageMetadataResponseParent =
        new MessageMetadataResponseParent();
    messageMetadataResponseParent.relationshipType(RelationshipTypeEnum.REPLY_FORM);

    // Act and Assert
    assertNotEquals(messageMetadataResponseParent, new MessageMetadataResponseParent());
  }

  /**
   * Test {@link MessageMetadataResponseParent#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageMetadataResponseParent#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageMetadataResponseParent.equals(Object)",
    "int MessageMetadataResponseParent.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageMetadataResponseParent(), null);
  }

  /**
   * Test {@link MessageMetadataResponseParent#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageMetadataResponseParent#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageMetadataResponseParent.equals(Object)",
    "int MessageMetadataResponseParent.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new MessageMetadataResponseParent(), "Different type to MessageMetadataResponseParent");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link MessageMetadataResponseParent}
   *   <li>{@link MessageMetadataResponseParent#messageId(String)}
   *   <li>{@link MessageMetadataResponseParent#relationshipType(RelationshipTypeEnum)}
   *   <li>{@link MessageMetadataResponseParent#setMessageId(String)}
   *   <li>{@link MessageMetadataResponseParent#setRelationshipType(RelationshipTypeEnum)}
   *   <li>{@link MessageMetadataResponseParent#toString()}
   *   <li>{@link MessageMetadataResponseParent#getMessageId()}
   *   <li>{@link MessageMetadataResponseParent#getRelationshipType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void MessageMetadataResponseParent.<init>()",
    "String MessageMetadataResponseParent.getMessageId()",
    "RelationshipTypeEnum MessageMetadataResponseParent.getRelationshipType()",
    "MessageMetadataResponseParent MessageMetadataResponseParent.messageId(String)",
    "MessageMetadataResponseParent MessageMetadataResponseParent.relationshipType(RelationshipTypeEnum)",
    "void MessageMetadataResponseParent.setMessageId(String)",
    "void MessageMetadataResponseParent.setRelationshipType(RelationshipTypeEnum)",
    "String MessageMetadataResponseParent.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    MessageMetadataResponseParent actualMessageMetadataResponseParent =
        new MessageMetadataResponseParent();
    MessageMetadataResponseParent actualMessageIdResult =
        actualMessageMetadataResponseParent.messageId("42");
    MessageMetadataResponseParent actualRelationshipTypeResult =
        actualMessageMetadataResponseParent.relationshipType(RelationshipTypeEnum.REPLY_FORM);
    actualMessageMetadataResponseParent.setMessageId("42");
    actualMessageMetadataResponseParent.setRelationshipType(RelationshipTypeEnum.REPLY_FORM);
    String actualToStringResult = actualMessageMetadataResponseParent.toString();
    String actualMessageId = actualMessageMetadataResponseParent.getMessageId();

    // Assert
    assertEquals("42", actualMessageId);
    assertEquals(
        "class MessageMetadataResponseParent {\n    messageId: 42\n    relationshipType: REPLY_FORM\n}",
        actualToStringResult);
    assertEquals(
        RelationshipTypeEnum.REPLY_FORM, actualMessageMetadataResponseParent.getRelationshipType());
    assertSame(actualMessageMetadataResponseParent, actualMessageIdResult);
    assertSame(actualMessageMetadataResponseParent, actualRelationshipTypeResult);
  }

  /**
   * Test RelationshipTypeEnum {@link RelationshipTypeEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link RelationshipTypeEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test RelationshipTypeEnum fromValue(String); when '42'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RelationshipTypeEnum RelationshipTypeEnum.fromValue(String)"})
  void testRelationshipTypeEnumFromValue_when42_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(RelationshipTypeEnum.fromValue("42"));
  }

  /**
   * Test RelationshipTypeEnum {@link RelationshipTypeEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code REPLY_FORM}.
   *   <li>Then return {@code REPLY_FORM}.
   * </ul>
   *
   * <p>Method under test: {@link RelationshipTypeEnum#fromValue(String)}
   */
  @Test
  @DisplayName(
      "Test RelationshipTypeEnum fromValue(String); when 'REPLY_FORM'; then return 'REPLY_FORM'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RelationshipTypeEnum RelationshipTypeEnum.fromValue(String)"})
  void testRelationshipTypeEnumFromValue_whenReplyForm_thenReturnReplyForm() {
    // Arrange, Act and Assert
    assertEquals(RelationshipTypeEnum.REPLY_FORM, RelationshipTypeEnum.fromValue("REPLY_FORM"));
  }

  /**
   * Test RelationshipTypeEnum getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RelationshipTypeEnum#toString()}
   *   <li>{@link RelationshipTypeEnum#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test RelationshipTypeEnum getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String RelationshipTypeEnum.getValue()",
    "String RelationshipTypeEnum.toString()"
  })
  void testRelationshipTypeEnumGettersAndSetters() {
    // Arrange
    RelationshipTypeEnum valueOfResult = RelationshipTypeEnum.valueOf("REPLY_FORM");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("REPLY_FORM", valueOfResult.getValue());
    assertEquals("REPLY_FORM", actualToStringResult);
  }
}
