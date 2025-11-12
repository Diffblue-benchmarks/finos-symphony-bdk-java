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

class V2MembershipListDiffblueTest {
  /**
   * Test {@link V2MembershipList#addMembersItem(V2MemberInfo)}.
   *
   * <ul>
   *   <li>Given {@link V2MembershipList} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link V2MembershipList#addMembersItem(V2MemberInfo)}
   */
  @Test
  @DisplayName("Test addMembersItem(V2MemberInfo); given V2MembershipList (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2MembershipList V2MembershipList.addMembersItem(V2MemberInfo)"})
  void testAddMembersItem_givenV2MembershipList() {
    // Arrange
    V2MembershipList v2MembershipList = new V2MembershipList();

    // Act
    V2MembershipList actualAddMembersItemResult =
        v2MembershipList.addMembersItem(new V2MemberInfo());

    // Assert
    assertSame(v2MembershipList, actualAddMembersItemResult);
  }

  /**
   * Test {@link V2MembershipList#addMembersItem(V2MemberInfo)}.
   *
   * <ul>
   *   <li>Given {@link V2MembershipList} (default constructor) members {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link V2MembershipList#addMembersItem(V2MemberInfo)}
   */
  @Test
  @DisplayName(
      "Test addMembersItem(V2MemberInfo); given V2MembershipList (default constructor) members ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2MembershipList V2MembershipList.addMembersItem(V2MemberInfo)"})
  void testAddMembersItem_givenV2MembershipListMembersArrayList() {
    // Arrange
    V2MembershipList v2MembershipList = new V2MembershipList();
    v2MembershipList.members(new ArrayList<>());

    // Act
    V2MembershipList actualAddMembersItemResult =
        v2MembershipList.addMembersItem(new V2MemberInfo());

    // Assert
    assertSame(v2MembershipList, actualAddMembersItemResult);
  }

  /**
   * Test {@link V2MembershipList#equals(Object)}, and {@link V2MembershipList#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2MembershipList#equals(Object)}
   *   <li>{@link V2MembershipList#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2MembershipList.equals(Object)", "int V2MembershipList.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2MembershipList v2MembershipList = new V2MembershipList();
    V2MembershipList v2MembershipList2 = new V2MembershipList();

    // Act and Assert
    assertEquals(v2MembershipList, v2MembershipList2);
    assertEquals(v2MembershipList.hashCode(), v2MembershipList2.hashCode());
  }

  /**
   * Test {@link V2MembershipList#equals(Object)}, and {@link V2MembershipList#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2MembershipList#equals(Object)}
   *   <li>{@link V2MembershipList#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2MembershipList.equals(Object)", "int V2MembershipList.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2MembershipList v2MembershipList = new V2MembershipList();

    // Act and Assert
    assertEquals(v2MembershipList, v2MembershipList);
    int expectedHashCodeResult = v2MembershipList.hashCode();
    assertEquals(expectedHashCodeResult, v2MembershipList.hashCode());
  }

  /**
   * Test {@link V2MembershipList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2MembershipList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2MembershipList.equals(Object)", "int V2MembershipList.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V2MembershipList v2MembershipList = new V2MembershipList();
    v2MembershipList.addMembersItem(new V2MemberInfo());

    // Act and Assert
    assertNotEquals(v2MembershipList, new V2MembershipList());
  }

  /**
   * Test {@link V2MembershipList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2MembershipList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2MembershipList.equals(Object)", "int V2MembershipList.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V2MembershipList v2MembershipList = new V2MembershipList();
    v2MembershipList.count(3);
    v2MembershipList.addMembersItem(new V2MemberInfo());

    // Act and Assert
    assertNotEquals(v2MembershipList, new V2MembershipList());
  }

  /**
   * Test {@link V2MembershipList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2MembershipList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2MembershipList.equals(Object)", "int V2MembershipList.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V2MembershipList v2MembershipList = new V2MembershipList();
    v2MembershipList.skip(1);
    v2MembershipList.addMembersItem(new V2MemberInfo());

    // Act and Assert
    assertNotEquals(v2MembershipList, new V2MembershipList());
  }

  /**
   * Test {@link V2MembershipList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2MembershipList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2MembershipList.equals(Object)", "int V2MembershipList.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V2MembershipList v2MembershipList = new V2MembershipList();
    v2MembershipList.limit(1);
    v2MembershipList.addMembersItem(new V2MemberInfo());

    // Act and Assert
    assertNotEquals(v2MembershipList, new V2MembershipList());
  }

  /**
   * Test {@link V2MembershipList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2MembershipList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2MembershipList.equals(Object)", "int V2MembershipList.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2MembershipList(), null);
  }

  /**
   * Test {@link V2MembershipList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2MembershipList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2MembershipList.equals(Object)", "int V2MembershipList.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2MembershipList(), "Different type to V2MembershipList");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V2MembershipList}
   *   <li>{@link V2MembershipList#count(Integer)}
   *   <li>{@link V2MembershipList#limit(Integer)}
   *   <li>{@link V2MembershipList#members(List)}
   *   <li>{@link V2MembershipList#setCount(Integer)}
   *   <li>{@link V2MembershipList#setLimit(Integer)}
   *   <li>{@link V2MembershipList#setMembers(List)}
   *   <li>{@link V2MembershipList#setSkip(Integer)}
   *   <li>{@link V2MembershipList#skip(Integer)}
   *   <li>{@link V2MembershipList#toString()}
   *   <li>{@link V2MembershipList#getCount()}
   *   <li>{@link V2MembershipList#getLimit()}
   *   <li>{@link V2MembershipList#getMembers()}
   *   <li>{@link V2MembershipList#getSkip()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V2MembershipList.<init>()",
    "V2MembershipList V2MembershipList.count(Integer)",
    "Integer V2MembershipList.getCount()",
    "Integer V2MembershipList.getLimit()",
    "List V2MembershipList.getMembers()",
    "Integer V2MembershipList.getSkip()",
    "V2MembershipList V2MembershipList.limit(Integer)",
    "V2MembershipList V2MembershipList.members(List)",
    "void V2MembershipList.setCount(Integer)",
    "void V2MembershipList.setLimit(Integer)",
    "void V2MembershipList.setMembers(List)",
    "void V2MembershipList.setSkip(Integer)",
    "V2MembershipList V2MembershipList.skip(Integer)",
    "String V2MembershipList.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V2MembershipList actualV2MembershipList = new V2MembershipList();
    V2MembershipList actualCountResult = actualV2MembershipList.count(3);
    V2MembershipList actualLimitResult = actualV2MembershipList.limit(1);
    V2MembershipList actualMembersResult = actualV2MembershipList.members(new ArrayList<>());
    actualV2MembershipList.setCount(3);
    actualV2MembershipList.setLimit(1);
    ArrayList<V2MemberInfo> members = new ArrayList<>();
    actualV2MembershipList.setMembers(members);
    actualV2MembershipList.setSkip(1);
    V2MembershipList actualSkipResult = actualV2MembershipList.skip(1);
    String actualToStringResult = actualV2MembershipList.toString();
    Integer actualCount = actualV2MembershipList.getCount();
    Integer actualLimit = actualV2MembershipList.getLimit();
    List<V2MemberInfo> actualMembers = actualV2MembershipList.getMembers();
    Integer actualSkip = actualV2MembershipList.getSkip();

    // Assert
    assertEquals(
        "class V2MembershipList {\n    count: 3\n    skip: 1\n    limit: 1\n    members: []\n}",
        actualToStringResult);
    assertEquals(1, actualLimit.intValue());
    assertEquals(1, actualSkip.intValue());
    assertEquals(3, actualCount.intValue());
    assertTrue(actualMembers.isEmpty());
    assertSame(actualV2MembershipList, actualCountResult);
    assertSame(actualV2MembershipList, actualLimitResult);
    assertSame(actualV2MembershipList, actualMembersResult);
    assertSame(actualV2MembershipList, actualSkipResult);
    assertSame(members, actualMembers);
  }
}
