package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ConversationSpecificStreamAttributesDiffblueTest {
  /**
   * Test {@link ConversationSpecificStreamAttributes#addMembersItem(Long)}.
   * <ul>
   *   <li>Given {@link ConversationSpecificStreamAttributes} (default constructor) members {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ConversationSpecificStreamAttributes#addMembersItem(Long)}
   */
  @Test
  @DisplayName("Test addMembersItem(Long); given ConversationSpecificStreamAttributes (default constructor) members ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ConversationSpecificStreamAttributes ConversationSpecificStreamAttributes.addMembersItem(Long)"})
  void testAddMembersItem_givenConversationSpecificStreamAttributesMembersArrayList() {
    // Arrange
    ConversationSpecificStreamAttributes conversationSpecificStreamAttributes = new ConversationSpecificStreamAttributes();
    conversationSpecificStreamAttributes.members(new ArrayList<>());

    // Act and Assert
    assertSame(conversationSpecificStreamAttributes, conversationSpecificStreamAttributes.addMembersItem(1L));
  }

  /**
   * Test {@link ConversationSpecificStreamAttributes#addMembersItem(Long)}.
   * <ul>
   *   <li>Then return Members size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ConversationSpecificStreamAttributes#addMembersItem(Long)}
   */
  @Test
  @DisplayName("Test addMembersItem(Long); then return Members size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ConversationSpecificStreamAttributes ConversationSpecificStreamAttributes.addMembersItem(Long)"})
  void testAddMembersItem_thenReturnMembersSizeIsOne() {
    // Arrange
    ConversationSpecificStreamAttributes conversationSpecificStreamAttributes = new ConversationSpecificStreamAttributes();

    // Act
    ConversationSpecificStreamAttributes actualAddMembersItemResult = conversationSpecificStreamAttributes
        .addMembersItem(1L);

    // Assert
    List<Long> members = actualAddMembersItemResult.getMembers();
    assertEquals(1, members.size());
    assertEquals(1L, members.get(0).longValue());
    assertSame(conversationSpecificStreamAttributes, actualAddMembersItemResult);
  }

  /**
   * Test {@link ConversationSpecificStreamAttributes#equals(Object)}, and {@link ConversationSpecificStreamAttributes#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ConversationSpecificStreamAttributes#equals(Object)}
   *   <li>{@link ConversationSpecificStreamAttributes#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ConversationSpecificStreamAttributes.equals(Object)",
      "int ConversationSpecificStreamAttributes.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ConversationSpecificStreamAttributes conversationSpecificStreamAttributes = new ConversationSpecificStreamAttributes();
    ConversationSpecificStreamAttributes conversationSpecificStreamAttributes2 = new ConversationSpecificStreamAttributes();

    // Act and Assert
    assertEquals(conversationSpecificStreamAttributes, conversationSpecificStreamAttributes2);
    int expectedHashCodeResult = conversationSpecificStreamAttributes.hashCode();
    assertEquals(expectedHashCodeResult, conversationSpecificStreamAttributes2.hashCode());
  }

  /**
   * Test {@link ConversationSpecificStreamAttributes#equals(Object)}, and {@link ConversationSpecificStreamAttributes#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ConversationSpecificStreamAttributes#equals(Object)}
   *   <li>{@link ConversationSpecificStreamAttributes#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ConversationSpecificStreamAttributes.equals(Object)",
      "int ConversationSpecificStreamAttributes.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ConversationSpecificStreamAttributes conversationSpecificStreamAttributes = new ConversationSpecificStreamAttributes();

    // Act and Assert
    assertEquals(conversationSpecificStreamAttributes, conversationSpecificStreamAttributes);
    int expectedHashCodeResult = conversationSpecificStreamAttributes.hashCode();
    assertEquals(expectedHashCodeResult, conversationSpecificStreamAttributes.hashCode());
  }

  /**
   * Test {@link ConversationSpecificStreamAttributes#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ConversationSpecificStreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ConversationSpecificStreamAttributes.equals(Object)",
      "int ConversationSpecificStreamAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ConversationSpecificStreamAttributes conversationSpecificStreamAttributes = new ConversationSpecificStreamAttributes();
    conversationSpecificStreamAttributes.addMembersItem(1L);

    // Act and Assert
    assertNotEquals(conversationSpecificStreamAttributes, new ConversationSpecificStreamAttributes());
  }

  /**
   * Test {@link ConversationSpecificStreamAttributes#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ConversationSpecificStreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ConversationSpecificStreamAttributes.equals(Object)",
      "int ConversationSpecificStreamAttributes.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ConversationSpecificStreamAttributes(), null);
  }

  /**
   * Test {@link ConversationSpecificStreamAttributes#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ConversationSpecificStreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ConversationSpecificStreamAttributes.equals(Object)",
      "int ConversationSpecificStreamAttributes.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ConversationSpecificStreamAttributes(),
        "Different type to ConversationSpecificStreamAttributes");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link ConversationSpecificStreamAttributes}
   *   <li>{@link ConversationSpecificStreamAttributes#members(List)}
   *   <li>{@link ConversationSpecificStreamAttributes#setMembers(List)}
   *   <li>{@link ConversationSpecificStreamAttributes#toString()}
   *   <li>{@link ConversationSpecificStreamAttributes#getMembers()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ConversationSpecificStreamAttributes.<init>()",
      "List ConversationSpecificStreamAttributes.getMembers()",
      "ConversationSpecificStreamAttributes ConversationSpecificStreamAttributes.members(List)",
      "void ConversationSpecificStreamAttributes.setMembers(List)",
      "String ConversationSpecificStreamAttributes.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    ConversationSpecificStreamAttributes actualConversationSpecificStreamAttributes = new ConversationSpecificStreamAttributes();
    ConversationSpecificStreamAttributes actualMembersResult = actualConversationSpecificStreamAttributes
        .members(new ArrayList<>());
    ArrayList<Long> members = new ArrayList<>();
    actualConversationSpecificStreamAttributes.setMembers(members);
    String actualToStringResult = actualConversationSpecificStreamAttributes.toString();
    List<Long> actualMembers = actualConversationSpecificStreamAttributes.getMembers();

    // Assert
    assertEquals("class ConversationSpecificStreamAttributes {\n    members: []\n}", actualToStringResult);
    assertTrue(actualMembers.isEmpty());
    assertSame(actualConversationSpecificStreamAttributes, actualMembersResult);
    assertSame(members, actualMembers);
  }
}
