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

class V2ConversationSpecificStreamAttributesDiffblueTest {
  /**
   * Test {@link V2ConversationSpecificStreamAttributes#addMembersItem(Long)}.
   *
   * <ul>
   *   <li>Given {@link V2ConversationSpecificStreamAttributes} (default constructor) members {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link V2ConversationSpecificStreamAttributes#addMembersItem(Long)}
   */
  @Test
  @DisplayName(
      "Test addMembersItem(Long); given V2ConversationSpecificStreamAttributes (default constructor) members ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "V2ConversationSpecificStreamAttributes V2ConversationSpecificStreamAttributes.addMembersItem(Long)"
  })
  void testAddMembersItem_givenV2ConversationSpecificStreamAttributesMembersArrayList() {
    // Arrange
    V2ConversationSpecificStreamAttributes v2ConversationSpecificStreamAttributes =
        new V2ConversationSpecificStreamAttributes();
    v2ConversationSpecificStreamAttributes.members(new ArrayList<>());

    // Act
    V2ConversationSpecificStreamAttributes actualAddMembersItemResult =
        v2ConversationSpecificStreamAttributes.addMembersItem(1L);

    // Assert
    assertSame(v2ConversationSpecificStreamAttributes, actualAddMembersItemResult);
  }

  /**
   * Test {@link V2ConversationSpecificStreamAttributes#addMembersItem(Long)}.
   *
   * <ul>
   *   <li>Then return Members size is one.
   * </ul>
   *
   * <p>Method under test: {@link V2ConversationSpecificStreamAttributes#addMembersItem(Long)}
   */
  @Test
  @DisplayName("Test addMembersItem(Long); then return Members size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "V2ConversationSpecificStreamAttributes V2ConversationSpecificStreamAttributes.addMembersItem(Long)"
  })
  void testAddMembersItem_thenReturnMembersSizeIsOne() {
    // Arrange
    V2ConversationSpecificStreamAttributes v2ConversationSpecificStreamAttributes =
        new V2ConversationSpecificStreamAttributes();

    // Act
    V2ConversationSpecificStreamAttributes actualAddMembersItemResult =
        v2ConversationSpecificStreamAttributes.addMembersItem(1L);

    // Assert
    List<Long> members = actualAddMembersItemResult.getMembers();
    assertEquals(1, members.size());
    assertEquals(1L, members.get(0).longValue());
    assertSame(v2ConversationSpecificStreamAttributes, actualAddMembersItemResult);
  }

  /**
   * Test {@link V2ConversationSpecificStreamAttributes#equals(Object)}, and {@link
   * V2ConversationSpecificStreamAttributes#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2ConversationSpecificStreamAttributes#equals(Object)}
   *   <li>{@link V2ConversationSpecificStreamAttributes#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2ConversationSpecificStreamAttributes.equals(Object)",
    "int V2ConversationSpecificStreamAttributes.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2ConversationSpecificStreamAttributes v2ConversationSpecificStreamAttributes =
        new V2ConversationSpecificStreamAttributes();
    V2ConversationSpecificStreamAttributes v2ConversationSpecificStreamAttributes2 =
        new V2ConversationSpecificStreamAttributes();

    // Act and Assert
    assertEquals(v2ConversationSpecificStreamAttributes, v2ConversationSpecificStreamAttributes2);
    assertEquals(
        v2ConversationSpecificStreamAttributes.hashCode(),
        v2ConversationSpecificStreamAttributes2.hashCode());
  }

  /**
   * Test {@link V2ConversationSpecificStreamAttributes#equals(Object)}, and {@link
   * V2ConversationSpecificStreamAttributes#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2ConversationSpecificStreamAttributes#equals(Object)}
   *   <li>{@link V2ConversationSpecificStreamAttributes#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2ConversationSpecificStreamAttributes.equals(Object)",
    "int V2ConversationSpecificStreamAttributes.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2ConversationSpecificStreamAttributes v2ConversationSpecificStreamAttributes =
        new V2ConversationSpecificStreamAttributes();

    // Act and Assert
    assertEquals(v2ConversationSpecificStreamAttributes, v2ConversationSpecificStreamAttributes);
    int expectedHashCodeResult = v2ConversationSpecificStreamAttributes.hashCode();
    assertEquals(expectedHashCodeResult, v2ConversationSpecificStreamAttributes.hashCode());
  }

  /**
   * Test {@link V2ConversationSpecificStreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2ConversationSpecificStreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2ConversationSpecificStreamAttributes.equals(Object)",
    "int V2ConversationSpecificStreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V2ConversationSpecificStreamAttributes v2ConversationSpecificStreamAttributes =
        new V2ConversationSpecificStreamAttributes();
    v2ConversationSpecificStreamAttributes.addMembersItem(1L);

    // Act and Assert
    assertNotEquals(
        v2ConversationSpecificStreamAttributes, new V2ConversationSpecificStreamAttributes());
  }

  /**
   * Test {@link V2ConversationSpecificStreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2ConversationSpecificStreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2ConversationSpecificStreamAttributes.equals(Object)",
    "int V2ConversationSpecificStreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2ConversationSpecificStreamAttributes(), null);
  }

  /**
   * Test {@link V2ConversationSpecificStreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2ConversationSpecificStreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2ConversationSpecificStreamAttributes.equals(Object)",
    "int V2ConversationSpecificStreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new V2ConversationSpecificStreamAttributes(),
        "Different type to V2ConversationSpecificStreamAttributes");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V2ConversationSpecificStreamAttributes}
   *   <li>{@link V2ConversationSpecificStreamAttributes#members(List)}
   *   <li>{@link V2ConversationSpecificStreamAttributes#setMembers(List)}
   *   <li>{@link V2ConversationSpecificStreamAttributes#toString()}
   *   <li>{@link V2ConversationSpecificStreamAttributes#getMembers()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V2ConversationSpecificStreamAttributes.<init>()",
    "List V2ConversationSpecificStreamAttributes.getMembers()",
    "V2ConversationSpecificStreamAttributes V2ConversationSpecificStreamAttributes.members(List)",
    "void V2ConversationSpecificStreamAttributes.setMembers(List)",
    "String V2ConversationSpecificStreamAttributes.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V2ConversationSpecificStreamAttributes actualV2ConversationSpecificStreamAttributes =
        new V2ConversationSpecificStreamAttributes();
    V2ConversationSpecificStreamAttributes actualMembersResult =
        actualV2ConversationSpecificStreamAttributes.members(new ArrayList<>());
    ArrayList<Long> members = new ArrayList<>();
    actualV2ConversationSpecificStreamAttributes.setMembers(members);
    String actualToStringResult = actualV2ConversationSpecificStreamAttributes.toString();
    List<Long> actualMembers = actualV2ConversationSpecificStreamAttributes.getMembers();

    // Assert
    assertEquals(
        "class V2ConversationSpecificStreamAttributes {\n    members: []\n}", actualToStringResult);
    assertTrue(actualMembers.isEmpty());
    assertSame(actualV2ConversationSpecificStreamAttributes, actualMembersResult);
    assertSame(members, actualMembers);
  }
}
