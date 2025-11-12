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

class MessageIdsDiffblueTest {
  /**
   * Test {@link MessageIds#addMessageIdsItem(String)}.
   *
   * <ul>
   *   <li>Given {@link MessageIds} (default constructor) messageIds {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link MessageIds#addMessageIdsItem(String)}
   */
  @Test
  @DisplayName(
      "Test addMessageIdsItem(String); given MessageIds (default constructor) messageIds ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MessageIds MessageIds.addMessageIdsItem(String)"})
  void testAddMessageIdsItem_givenMessageIdsMessageIdsArrayList() {
    // Arrange
    MessageIds messageIds = new MessageIds();
    messageIds.messageIds(new ArrayList<>());

    // Act
    MessageIds actualAddMessageIdsItemResult = messageIds.addMessageIdsItem("Message Ids Item");

    // Assert
    assertSame(messageIds, actualAddMessageIdsItemResult);
  }

  /**
   * Test {@link MessageIds#addMessageIdsItem(String)}.
   *
   * <ul>
   *   <li>Given {@link MessageIds} (default constructor).
   *   <li>Then return MessageIds size is one.
   * </ul>
   *
   * <p>Method under test: {@link MessageIds#addMessageIdsItem(String)}
   */
  @Test
  @DisplayName(
      "Test addMessageIdsItem(String); given MessageIds (default constructor); then return MessageIds size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MessageIds MessageIds.addMessageIdsItem(String)"})
  void testAddMessageIdsItem_givenMessageIds_thenReturnMessageIdsSizeIsOne() {
    // Arrange
    MessageIds messageIds = new MessageIds();

    // Act
    MessageIds actualAddMessageIdsItemResult = messageIds.addMessageIdsItem("Message Ids Item");

    // Assert
    List<String> messageIds2 = actualAddMessageIdsItemResult.getMessageIds();
    assertEquals(1, messageIds2.size());
    assertEquals("Message Ids Item", messageIds2.get(0));
    assertSame(messageIds, actualAddMessageIdsItemResult);
  }

  /**
   * Test {@link MessageIds#equals(Object)}, and {@link MessageIds#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MessageIds#equals(Object)}
   *   <li>{@link MessageIds#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageIds.equals(Object)", "int MessageIds.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MessageIds messageIds = new MessageIds();
    MessageIds messageIds2 = new MessageIds();

    // Act and Assert
    assertEquals(messageIds, messageIds2);
    assertEquals(messageIds.hashCode(), messageIds2.hashCode());
  }

  /**
   * Test {@link MessageIds#equals(Object)}, and {@link MessageIds#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MessageIds#equals(Object)}
   *   <li>{@link MessageIds#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageIds.equals(Object)", "int MessageIds.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MessageIds messageIds = new MessageIds();

    // Act and Assert
    assertEquals(messageIds, messageIds);
    int expectedHashCodeResult = messageIds.hashCode();
    assertEquals(expectedHashCodeResult, messageIds.hashCode());
  }

  /**
   * Test {@link MessageIds#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageIds#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageIds.equals(Object)", "int MessageIds.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    MessageIds messageIds = new MessageIds();
    messageIds.addMessageIdsItem("Message Ids Item");

    // Act and Assert
    assertNotEquals(messageIds, new MessageIds());
  }

  /**
   * Test {@link MessageIds#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageIds#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageIds.equals(Object)", "int MessageIds.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageIds(), null);
  }

  /**
   * Test {@link MessageIds#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageIds#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageIds.equals(Object)", "int MessageIds.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageIds(), "Different type to MessageIds");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link MessageIds}
   *   <li>{@link MessageIds#messageIds(List)}
   *   <li>{@link MessageIds#setMessageIds(List)}
   *   <li>{@link MessageIds#toString()}
   *   <li>{@link MessageIds#getMessageIds()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void MessageIds.<init>()",
    "List MessageIds.getMessageIds()",
    "MessageIds MessageIds.messageIds(List)",
    "void MessageIds.setMessageIds(List)",
    "String MessageIds.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    MessageIds actualMessageIds = new MessageIds();
    MessageIds actualMessageIdsResult = actualMessageIds.messageIds(new ArrayList<>());
    ArrayList<String> messageIds = new ArrayList<>();
    actualMessageIds.setMessageIds(messageIds);
    String actualToStringResult = actualMessageIds.toString();
    List<String> actualMessageIds2 = actualMessageIds.getMessageIds();

    // Assert
    assertEquals("class MessageIds {\n    messageIds: []\n}", actualToStringResult);
    assertTrue(actualMessageIds2.isEmpty());
    assertSame(actualMessageIds, actualMessageIdsResult);
    assertSame(messageIds, actualMessageIds2);
  }
}
