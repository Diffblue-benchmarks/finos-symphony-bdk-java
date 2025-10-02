package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MessageMetadataResponseDiffblueTest {
  /**
   * Test {@link MessageMetadataResponse#addRepliesItem(String)}.
   *
   * <ul>
   *   <li>Given {@link MessageMetadataResponse} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link MessageMetadataResponse#addRepliesItem(String)}
   */
  @Test
  @DisplayName("Test addRepliesItem(String); given MessageMetadataResponse (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MessageMetadataResponse MessageMetadataResponse.addRepliesItem(String)"})
  void testAddRepliesItem_givenMessageMetadataResponse() {
    // Arrange
    MessageMetadataResponse messageMetadataResponse = new MessageMetadataResponse();

    // Act
    MessageMetadataResponse actualAddRepliesItemResult =
        messageMetadataResponse.addRepliesItem("Replies Item");

    // Assert
    assertSame(messageMetadataResponse, actualAddRepliesItemResult);
  }

  /**
   * Test {@link MessageMetadataResponse#addRepliesItem(String)}.
   *
   * <ul>
   *   <li>Given {@link MessageMetadataResponse} (default constructor) replies {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link MessageMetadataResponse#addRepliesItem(String)}
   */
  @Test
  @DisplayName(
      "Test addRepliesItem(String); given MessageMetadataResponse (default constructor) replies ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MessageMetadataResponse MessageMetadataResponse.addRepliesItem(String)"})
  void testAddRepliesItem_givenMessageMetadataResponseRepliesArrayList() {
    // Arrange
    MessageMetadataResponse messageMetadataResponse = new MessageMetadataResponse();
    messageMetadataResponse.replies(new ArrayList<>());

    // Act
    MessageMetadataResponse actualAddRepliesItemResult =
        messageMetadataResponse.addRepliesItem("Replies Item");

    // Assert
    assertSame(messageMetadataResponse, actualAddRepliesItemResult);
  }

  /**
   * Test {@link MessageMetadataResponse#addForwardsItem(String)}.
   *
   * <ul>
   *   <li>Given {@link MessageMetadataResponse} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link MessageMetadataResponse#addForwardsItem(String)}
   */
  @Test
  @DisplayName("Test addForwardsItem(String); given MessageMetadataResponse (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MessageMetadataResponse MessageMetadataResponse.addForwardsItem(String)"})
  void testAddForwardsItem_givenMessageMetadataResponse() {
    // Arrange
    MessageMetadataResponse messageMetadataResponse = new MessageMetadataResponse();

    // Act
    MessageMetadataResponse actualAddForwardsItemResult =
        messageMetadataResponse.addForwardsItem("Forwards Item");

    // Assert
    assertSame(messageMetadataResponse, actualAddForwardsItemResult);
  }

  /**
   * Test {@link MessageMetadataResponse#addForwardsItem(String)}.
   *
   * <ul>
   *   <li>Given {@link MessageMetadataResponse} (default constructor) forwards {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link MessageMetadataResponse#addForwardsItem(String)}
   */
  @Test
  @DisplayName(
      "Test addForwardsItem(String); given MessageMetadataResponse (default constructor) forwards ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MessageMetadataResponse MessageMetadataResponse.addForwardsItem(String)"})
  void testAddForwardsItem_givenMessageMetadataResponseForwardsArrayList() {
    // Arrange
    MessageMetadataResponse messageMetadataResponse = new MessageMetadataResponse();
    messageMetadataResponse.forwards(new ArrayList<>());

    // Act
    MessageMetadataResponse actualAddForwardsItemResult =
        messageMetadataResponse.addForwardsItem("Forwards Item");

    // Assert
    assertSame(messageMetadataResponse, actualAddForwardsItemResult);
  }

  /**
   * Test {@link MessageMetadataResponse#addFormRepliesItem(String)}.
   *
   * <ul>
   *   <li>Given {@link MessageMetadataResponse} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link MessageMetadataResponse#addFormRepliesItem(String)}
   */
  @Test
  @DisplayName(
      "Test addFormRepliesItem(String); given MessageMetadataResponse (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MessageMetadataResponse MessageMetadataResponse.addFormRepliesItem(String)"})
  void testAddFormRepliesItem_givenMessageMetadataResponse() {
    // Arrange
    MessageMetadataResponse messageMetadataResponse = new MessageMetadataResponse();

    // Act
    MessageMetadataResponse actualAddFormRepliesItemResult =
        messageMetadataResponse.addFormRepliesItem("Form Replies Item");

    // Assert
    assertSame(messageMetadataResponse, actualAddFormRepliesItemResult);
  }

  /**
   * Test {@link MessageMetadataResponse#addFormRepliesItem(String)}.
   *
   * <ul>
   *   <li>Given {@link MessageMetadataResponse} (default constructor) formReplies {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link MessageMetadataResponse#addFormRepliesItem(String)}
   */
  @Test
  @DisplayName(
      "Test addFormRepliesItem(String); given MessageMetadataResponse (default constructor) formReplies ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MessageMetadataResponse MessageMetadataResponse.addFormRepliesItem(String)"})
  void testAddFormRepliesItem_givenMessageMetadataResponseFormRepliesArrayList() {
    // Arrange
    MessageMetadataResponse messageMetadataResponse = new MessageMetadataResponse();
    messageMetadataResponse.formReplies(new ArrayList<>());

    // Act
    MessageMetadataResponse actualAddFormRepliesItemResult =
        messageMetadataResponse.addFormRepliesItem("Form Replies Item");

    // Assert
    assertSame(messageMetadataResponse, actualAddFormRepliesItemResult);
  }

  /**
   * Test {@link MessageMetadataResponse#equals(Object)}, and {@link
   * MessageMetadataResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MessageMetadataResponse#equals(Object)}
   *   <li>{@link MessageMetadataResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageMetadataResponse.equals(Object)",
    "int MessageMetadataResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MessageMetadataResponse messageMetadataResponse = new MessageMetadataResponse();
    MessageMetadataResponse messageMetadataResponse2 = new MessageMetadataResponse();

    // Act and Assert
    assertEquals(messageMetadataResponse, messageMetadataResponse2);
    assertEquals(messageMetadataResponse.hashCode(), messageMetadataResponse2.hashCode());
  }

  /**
   * Test {@link MessageMetadataResponse#equals(Object)}, and {@link
   * MessageMetadataResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MessageMetadataResponse#equals(Object)}
   *   <li>{@link MessageMetadataResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageMetadataResponse.equals(Object)",
    "int MessageMetadataResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MessageMetadataResponse messageMetadataResponse = new MessageMetadataResponse();

    // Act and Assert
    assertEquals(messageMetadataResponse, messageMetadataResponse);
    int expectedHashCodeResult = messageMetadataResponse.hashCode();
    assertEquals(expectedHashCodeResult, messageMetadataResponse.hashCode());
  }

  /**
   * Test {@link MessageMetadataResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageMetadataResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageMetadataResponse.equals(Object)",
    "int MessageMetadataResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    MessageMetadataResponse messageMetadataResponse = new MessageMetadataResponse();
    messageMetadataResponse.addRepliesItem("Replies Item");

    // Act and Assert
    assertNotEquals(messageMetadataResponse, new MessageMetadataResponse());
  }

  /**
   * Test {@link MessageMetadataResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageMetadataResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageMetadataResponse.equals(Object)",
    "int MessageMetadataResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    MessageMetadataResponse messageMetadataResponse = new MessageMetadataResponse();
    messageMetadataResponse.messageId("42");
    messageMetadataResponse.addRepliesItem("Replies Item");

    // Act and Assert
    assertNotEquals(messageMetadataResponse, new MessageMetadataResponse());
  }

  /**
   * Test {@link MessageMetadataResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageMetadataResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageMetadataResponse.equals(Object)",
    "int MessageMetadataResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    MessageMetadataResponse messageMetadataResponse = new MessageMetadataResponse();
    messageMetadataResponse.parent(new MessageMetadataResponseParent());
    messageMetadataResponse.addRepliesItem("Replies Item");

    // Act and Assert
    assertNotEquals(messageMetadataResponse, new MessageMetadataResponse());
  }

  /**
   * Test {@link MessageMetadataResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageMetadataResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageMetadataResponse.equals(Object)",
    "int MessageMetadataResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    MessageMetadataResponse messageMetadataResponse = new MessageMetadataResponse();
    messageMetadataResponse.addForwardsItem("Forwards Item");

    // Act and Assert
    assertNotEquals(messageMetadataResponse, new MessageMetadataResponse());
  }

  /**
   * Test {@link MessageMetadataResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageMetadataResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageMetadataResponse.equals(Object)",
    "int MessageMetadataResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    MessageMetadataResponse messageMetadataResponse = new MessageMetadataResponse();
    messageMetadataResponse.addFormRepliesItem("Form Replies Item");

    // Act and Assert
    assertNotEquals(messageMetadataResponse, new MessageMetadataResponse());
  }

  /**
   * Test {@link MessageMetadataResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageMetadataResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageMetadataResponse.equals(Object)",
    "int MessageMetadataResponse.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageMetadataResponse(), null);
  }

  /**
   * Test {@link MessageMetadataResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageMetadataResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageMetadataResponse.equals(Object)",
    "int MessageMetadataResponse.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageMetadataResponse(), "Different type to MessageMetadataResponse");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link MessageMetadataResponse}
   *   <li>{@link MessageMetadataResponse#formReplies(List)}
   *   <li>{@link MessageMetadataResponse#forwards(List)}
   *   <li>{@link MessageMetadataResponse#messageId(String)}
   *   <li>{@link MessageMetadataResponse#parent(MessageMetadataResponseParent)}
   *   <li>{@link MessageMetadataResponse#replies(List)}
   *   <li>{@link MessageMetadataResponse#setFormReplies(List)}
   *   <li>{@link MessageMetadataResponse#setForwards(List)}
   *   <li>{@link MessageMetadataResponse#setMessageId(String)}
   *   <li>{@link MessageMetadataResponse#setParent(MessageMetadataResponseParent)}
   *   <li>{@link MessageMetadataResponse#setReplies(List)}
   *   <li>{@link MessageMetadataResponse#toString()}
   *   <li>{@link MessageMetadataResponse#getFormReplies()}
   *   <li>{@link MessageMetadataResponse#getForwards()}
   *   <li>{@link MessageMetadataResponse#getMessageId()}
   *   <li>{@link MessageMetadataResponse#getParent()}
   *   <li>{@link MessageMetadataResponse#getReplies()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void MessageMetadataResponse.<init>()",
    "MessageMetadataResponse MessageMetadataResponse.formReplies(List)",
    "MessageMetadataResponse MessageMetadataResponse.forwards(List)",
    "List MessageMetadataResponse.getFormReplies()",
    "List MessageMetadataResponse.getForwards()",
    "String MessageMetadataResponse.getMessageId()",
    "MessageMetadataResponseParent MessageMetadataResponse.getParent()",
    "List MessageMetadataResponse.getReplies()",
    "MessageMetadataResponse MessageMetadataResponse.messageId(String)",
    "MessageMetadataResponse MessageMetadataResponse.parent(MessageMetadataResponseParent)",
    "MessageMetadataResponse MessageMetadataResponse.replies(List)",
    "void MessageMetadataResponse.setFormReplies(List)",
    "void MessageMetadataResponse.setForwards(List)",
    "void MessageMetadataResponse.setMessageId(String)",
    "void MessageMetadataResponse.setParent(MessageMetadataResponseParent)",
    "void MessageMetadataResponse.setReplies(List)",
    "String MessageMetadataResponse.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    MessageMetadataResponse actualMessageMetadataResponse = new MessageMetadataResponse();
    MessageMetadataResponse actualFormRepliesResult =
        actualMessageMetadataResponse.formReplies(new ArrayList<>());
    MessageMetadataResponse actualForwardsResult =
        actualMessageMetadataResponse.forwards(new ArrayList<>());
    MessageMetadataResponse actualMessageIdResult = actualMessageMetadataResponse.messageId("42");
    MessageMetadataResponse actualParentResult =
        actualMessageMetadataResponse.parent(new MessageMetadataResponseParent());
    MessageMetadataResponse actualRepliesResult =
        actualMessageMetadataResponse.replies(new ArrayList<>());
    ArrayList<String> formReplies = new ArrayList<>();
    actualMessageMetadataResponse.setFormReplies(formReplies);
    ArrayList<String> forwards = new ArrayList<>();
    actualMessageMetadataResponse.setForwards(forwards);
    actualMessageMetadataResponse.setMessageId("42");
    MessageMetadataResponseParent parent = new MessageMetadataResponseParent();
    actualMessageMetadataResponse.setParent(parent);
    ArrayList<String> replies = new ArrayList<>();
    actualMessageMetadataResponse.setReplies(replies);
    String actualToStringResult = actualMessageMetadataResponse.toString();
    List<String> actualFormReplies = actualMessageMetadataResponse.getFormReplies();
    List<String> actualForwards = actualMessageMetadataResponse.getForwards();
    String actualMessageId = actualMessageMetadataResponse.getMessageId();
    MessageMetadataResponseParent actualParent = actualMessageMetadataResponse.getParent();
    List<String> actualReplies = actualMessageMetadataResponse.getReplies();

    // Assert
    assertEquals("42", actualMessageId);
    assertEquals(
        "class MessageMetadataResponse {\n"
            + "    messageId: 42\n"
            + "    parent: class MessageMetadataResponseParent {\n"
            + "        messageId: null\n"
            + "        relationshipType: null\n"
            + "    }\n"
            + "    replies: []\n"
            + "    forwards: []\n"
            + "    formReplies: []\n"
            + "}",
        actualToStringResult);
    assertTrue(actualFormReplies.isEmpty());
    assertTrue(actualForwards.isEmpty());
    assertTrue(actualReplies.isEmpty());
    assertSame(actualMessageMetadataResponse, actualFormRepliesResult);
    assertSame(actualMessageMetadataResponse, actualForwardsResult);
    assertSame(actualMessageMetadataResponse, actualMessageIdResult);
    assertSame(actualMessageMetadataResponse, actualParentResult);
    assertSame(actualMessageMetadataResponse, actualRepliesResult);
    assertSame(parent, actualParent);
    assertSame(formReplies, actualFormReplies);
    assertSame(forwards, actualForwards);
    assertSame(replies, actualReplies);
  }
}
