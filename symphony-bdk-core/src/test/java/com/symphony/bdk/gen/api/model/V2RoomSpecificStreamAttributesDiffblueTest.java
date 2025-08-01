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

class V2RoomSpecificStreamAttributesDiffblueTest {
  /**
   * Test {@link V2RoomSpecificStreamAttributes#addGroupsItem(GroupItem)}.
   *
   * <ul>
   *   <li>Given {@link V2RoomSpecificStreamAttributes} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link V2RoomSpecificStreamAttributes#addGroupsItem(GroupItem)}
   */
  @Test
  @DisplayName(
      "Test addGroupsItem(GroupItem); given V2RoomSpecificStreamAttributes (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "V2RoomSpecificStreamAttributes V2RoomSpecificStreamAttributes.addGroupsItem(GroupItem)"
  })
  void testAddGroupsItem_givenV2RoomSpecificStreamAttributes() {
    // Arrange
    V2RoomSpecificStreamAttributes v2RoomSpecificStreamAttributes =
        new V2RoomSpecificStreamAttributes();

    // Act and Assert
    assertSame(
        v2RoomSpecificStreamAttributes,
        v2RoomSpecificStreamAttributes.addGroupsItem(new GroupItem()));
  }

  /**
   * Test {@link V2RoomSpecificStreamAttributes#addGroupsItem(GroupItem)}.
   *
   * <ul>
   *   <li>Given {@link V2RoomSpecificStreamAttributes} (default constructor) groups {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link V2RoomSpecificStreamAttributes#addGroupsItem(GroupItem)}
   */
  @Test
  @DisplayName(
      "Test addGroupsItem(GroupItem); given V2RoomSpecificStreamAttributes (default constructor) groups ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "V2RoomSpecificStreamAttributes V2RoomSpecificStreamAttributes.addGroupsItem(GroupItem)"
  })
  void testAddGroupsItem_givenV2RoomSpecificStreamAttributesGroupsArrayList() {
    // Arrange
    V2RoomSpecificStreamAttributes v2RoomSpecificStreamAttributes =
        new V2RoomSpecificStreamAttributes();
    v2RoomSpecificStreamAttributes.groups(new ArrayList<>());

    // Act and Assert
    assertSame(
        v2RoomSpecificStreamAttributes,
        v2RoomSpecificStreamAttributes.addGroupsItem(new GroupItem()));
  }

  /**
   * Test {@link V2RoomSpecificStreamAttributes#equals(Object)}, and {@link
   * V2RoomSpecificStreamAttributes#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2RoomSpecificStreamAttributes#equals(Object)}
   *   <li>{@link V2RoomSpecificStreamAttributes#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2RoomSpecificStreamAttributes.equals(Object)",
    "int V2RoomSpecificStreamAttributes.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2RoomSpecificStreamAttributes v2RoomSpecificStreamAttributes =
        new V2RoomSpecificStreamAttributes();
    V2RoomSpecificStreamAttributes v2RoomSpecificStreamAttributes2 =
        new V2RoomSpecificStreamAttributes();

    // Act and Assert
    assertEquals(v2RoomSpecificStreamAttributes, v2RoomSpecificStreamAttributes2);
    int expectedHashCodeResult = v2RoomSpecificStreamAttributes.hashCode();
    assertEquals(expectedHashCodeResult, v2RoomSpecificStreamAttributes2.hashCode());
  }

  /**
   * Test {@link V2RoomSpecificStreamAttributes#equals(Object)}, and {@link
   * V2RoomSpecificStreamAttributes#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2RoomSpecificStreamAttributes#equals(Object)}
   *   <li>{@link V2RoomSpecificStreamAttributes#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2RoomSpecificStreamAttributes.equals(Object)",
    "int V2RoomSpecificStreamAttributes.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2RoomSpecificStreamAttributes v2RoomSpecificStreamAttributes =
        new V2RoomSpecificStreamAttributes();

    // Act and Assert
    assertEquals(v2RoomSpecificStreamAttributes, v2RoomSpecificStreamAttributes);
    int expectedHashCodeResult = v2RoomSpecificStreamAttributes.hashCode();
    assertEquals(expectedHashCodeResult, v2RoomSpecificStreamAttributes.hashCode());
  }

  /**
   * Test {@link V2RoomSpecificStreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2RoomSpecificStreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2RoomSpecificStreamAttributes.equals(Object)",
    "int V2RoomSpecificStreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V2RoomSpecificStreamAttributes v2RoomSpecificStreamAttributes =
        new V2RoomSpecificStreamAttributes();
    v2RoomSpecificStreamAttributes.addGroupsItem(new GroupItem());

    // Act and Assert
    assertNotEquals(v2RoomSpecificStreamAttributes, new V2RoomSpecificStreamAttributes());
  }

  /**
   * Test {@link V2RoomSpecificStreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2RoomSpecificStreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2RoomSpecificStreamAttributes.equals(Object)",
    "int V2RoomSpecificStreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V2RoomSpecificStreamAttributes v2RoomSpecificStreamAttributes =
        new V2RoomSpecificStreamAttributes();
    v2RoomSpecificStreamAttributes.name("Name");
    v2RoomSpecificStreamAttributes.addGroupsItem(new GroupItem());

    // Act and Assert
    assertNotEquals(v2RoomSpecificStreamAttributes, new V2RoomSpecificStreamAttributes());
  }

  /**
   * Test {@link V2RoomSpecificStreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2RoomSpecificStreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2RoomSpecificStreamAttributes.equals(Object)",
    "int V2RoomSpecificStreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2RoomSpecificStreamAttributes(), null);
  }

  /**
   * Test {@link V2RoomSpecificStreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2RoomSpecificStreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2RoomSpecificStreamAttributes.equals(Object)",
    "int V2RoomSpecificStreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new V2RoomSpecificStreamAttributes(), "Different type to V2RoomSpecificStreamAttributes");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V2RoomSpecificStreamAttributes}
   *   <li>{@link V2RoomSpecificStreamAttributes#groups(List)}
   *   <li>{@link V2RoomSpecificStreamAttributes#name(String)}
   *   <li>{@link V2RoomSpecificStreamAttributes#setGroups(List)}
   *   <li>{@link V2RoomSpecificStreamAttributes#setName(String)}
   *   <li>{@link V2RoomSpecificStreamAttributes#toString()}
   *   <li>{@link V2RoomSpecificStreamAttributes#getGroups()}
   *   <li>{@link V2RoomSpecificStreamAttributes#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V2RoomSpecificStreamAttributes.<init>()",
    "List V2RoomSpecificStreamAttributes.getGroups()",
    "String V2RoomSpecificStreamAttributes.getName()",
    "V2RoomSpecificStreamAttributes V2RoomSpecificStreamAttributes.groups(List)",
    "V2RoomSpecificStreamAttributes V2RoomSpecificStreamAttributes.name(String)",
    "void V2RoomSpecificStreamAttributes.setGroups(List)",
    "void V2RoomSpecificStreamAttributes.setName(String)",
    "String V2RoomSpecificStreamAttributes.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V2RoomSpecificStreamAttributes actualV2RoomSpecificStreamAttributes =
        new V2RoomSpecificStreamAttributes();
    V2RoomSpecificStreamAttributes actualGroupsResult =
        actualV2RoomSpecificStreamAttributes.groups(new ArrayList<>());
    V2RoomSpecificStreamAttributes actualNameResult =
        actualV2RoomSpecificStreamAttributes.name("Name");
    ArrayList<GroupItem> groups = new ArrayList<>();
    actualV2RoomSpecificStreamAttributes.setGroups(groups);
    actualV2RoomSpecificStreamAttributes.setName("Name");
    String actualToStringResult = actualV2RoomSpecificStreamAttributes.toString();
    List<GroupItem> actualGroups = actualV2RoomSpecificStreamAttributes.getGroups();

    // Assert
    assertEquals("Name", actualV2RoomSpecificStreamAttributes.getName());
    assertEquals(
        "class V2RoomSpecificStreamAttributes {\n    name: Name\n    groups: []\n}",
        actualToStringResult);
    assertTrue(actualGroups.isEmpty());
    assertSame(actualV2RoomSpecificStreamAttributes, actualGroupsResult);
    assertSame(actualV2RoomSpecificStreamAttributes, actualNameResult);
    assertSame(groups, actualGroups);
  }
}
