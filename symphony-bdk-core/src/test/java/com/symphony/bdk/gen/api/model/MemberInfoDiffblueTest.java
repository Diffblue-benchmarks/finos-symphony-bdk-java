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

class MemberInfoDiffblueTest {
  /**
   * Test {@link MemberInfo#addAddedThroughGroupsItem(Long)}.
   *
   * <ul>
   *   <li>Given {@link MemberInfo} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link MemberInfo#addAddedThroughGroupsItem(Long)}
   */
  @Test
  @DisplayName("Test addAddedThroughGroupsItem(Long); given MemberInfo (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MemberInfo MemberInfo.addAddedThroughGroupsItem(Long)"})
  void testAddAddedThroughGroupsItem_givenMemberInfo() {
    // Arrange
    MemberInfo memberInfo = new MemberInfo();

    // Act and Assert
    assertSame(memberInfo, memberInfo.addAddedThroughGroupsItem(1L));
  }

  /**
   * Test {@link MemberInfo#addAddedThroughGroupsItem(Long)}.
   *
   * <ul>
   *   <li>Given {@link MemberInfo} (default constructor) AddedThroughGroups is {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link MemberInfo#addAddedThroughGroupsItem(Long)}
   */
  @Test
  @DisplayName(
      "Test addAddedThroughGroupsItem(Long); given MemberInfo (default constructor) AddedThroughGroups is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MemberInfo MemberInfo.addAddedThroughGroupsItem(Long)"})
  void testAddAddedThroughGroupsItem_givenMemberInfoAddedThroughGroupsIsArrayList() {
    // Arrange
    MemberInfo memberInfo = new MemberInfo();
    memberInfo.setAddedThroughGroups(new ArrayList<>());

    // Act and Assert
    assertSame(memberInfo, memberInfo.addAddedThroughGroupsItem(1L));
  }

  /**
   * Test {@link MemberInfo#equals(Object)}, and {@link MemberInfo#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MemberInfo#equals(Object)}
   *   <li>{@link MemberInfo#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MemberInfo.equals(Object)", "int MemberInfo.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MemberInfo memberInfo = new MemberInfo();
    MemberInfo memberInfo2 = new MemberInfo();

    // Act and Assert
    assertEquals(memberInfo, memberInfo2);
    int expectedHashCodeResult = memberInfo.hashCode();
    assertEquals(expectedHashCodeResult, memberInfo2.hashCode());
  }

  /**
   * Test {@link MemberInfo#equals(Object)}, and {@link MemberInfo#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MemberInfo#equals(Object)}
   *   <li>{@link MemberInfo#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MemberInfo.equals(Object)", "int MemberInfo.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MemberInfo memberInfo = new MemberInfo();

    // Act and Assert
    assertEquals(memberInfo, memberInfo);
    int expectedHashCodeResult = memberInfo.hashCode();
    assertEquals(expectedHashCodeResult, memberInfo.hashCode());
  }

  /**
   * Test {@link MemberInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MemberInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MemberInfo.equals(Object)", "int MemberInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    MemberInfo memberInfo = new MemberInfo();
    memberInfo.addedThroughGroups(new ArrayList<>());

    // Act and Assert
    assertNotEquals(memberInfo, new MemberInfo());
  }

  /**
   * Test {@link MemberInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MemberInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MemberInfo.equals(Object)", "int MemberInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    MemberInfo memberInfo = new MemberInfo();
    memberInfo.id(1L);
    memberInfo.addedThroughGroups(new ArrayList<>());

    // Act and Assert
    assertNotEquals(memberInfo, new MemberInfo());
  }

  /**
   * Test {@link MemberInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MemberInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MemberInfo.equals(Object)", "int MemberInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    MemberInfo memberInfo = new MemberInfo();
    memberInfo.owner(true);
    memberInfo.addedThroughGroups(new ArrayList<>());

    // Act and Assert
    assertNotEquals(memberInfo, new MemberInfo());
  }

  /**
   * Test {@link MemberInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MemberInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MemberInfo.equals(Object)", "int MemberInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    MemberInfo memberInfo = new MemberInfo();
    memberInfo.joinDate(1L);
    memberInfo.addedThroughGroups(new ArrayList<>());

    // Act and Assert
    assertNotEquals(memberInfo, new MemberInfo());
  }

  /**
   * Test {@link MemberInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MemberInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MemberInfo.equals(Object)", "int MemberInfo.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MemberInfo(), null);
  }

  /**
   * Test {@link MemberInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MemberInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MemberInfo.equals(Object)", "int MemberInfo.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MemberInfo(), "Different type to MemberInfo");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link MemberInfo}
   *   <li>{@link MemberInfo#id(Long)}
   *   <li>{@link MemberInfo#joinDate(Long)}
   *   <li>{@link MemberInfo#owner(Boolean)}
   *   <li>{@link MemberInfo#setAddedThroughGroups(List)}
   *   <li>{@link MemberInfo#setId(Long)}
   *   <li>{@link MemberInfo#setJoinDate(Long)}
   *   <li>{@link MemberInfo#setOwner(Boolean)}
   *   <li>{@link MemberInfo#addedThroughGroups(List)}
   *   <li>{@link MemberInfo#toString()}
   *   <li>{@link MemberInfo#getAddedThroughGroups()}
   *   <li>{@link MemberInfo#getId()}
   *   <li>{@link MemberInfo#getJoinDate()}
   *   <li>{@link MemberInfo#getOwner()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void MemberInfo.<init>()",
    "MemberInfo MemberInfo.addedThroughGroups(List)",
    "List MemberInfo.getAddedThroughGroups()",
    "Long MemberInfo.getId()",
    "Long MemberInfo.getJoinDate()",
    "Boolean MemberInfo.getOwner()",
    "MemberInfo MemberInfo.id(Long)",
    "MemberInfo MemberInfo.joinDate(Long)",
    "MemberInfo MemberInfo.owner(Boolean)",
    "void MemberInfo.setAddedThroughGroups(List)",
    "void MemberInfo.setId(Long)",
    "void MemberInfo.setJoinDate(Long)",
    "void MemberInfo.setOwner(Boolean)",
    "String MemberInfo.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    MemberInfo actualMemberInfo = new MemberInfo();
    MemberInfo actualIdResult = actualMemberInfo.id(1L);
    MemberInfo actualJoinDateResult = actualMemberInfo.joinDate(1L);
    MemberInfo actualOwnerResult = actualMemberInfo.owner(true);
    actualMemberInfo.setAddedThroughGroups(new ArrayList<>());
    actualMemberInfo.setId(1L);
    actualMemberInfo.setJoinDate(1L);
    actualMemberInfo.setOwner(true);
    ArrayList<Long> addedThroughGroups = new ArrayList<>();
    MemberInfo actualAddedThroughGroupsResult =
        actualMemberInfo.addedThroughGroups(addedThroughGroups);
    String actualToStringResult = actualMemberInfo.toString();
    List<Long> actualAddedThroughGroups = actualMemberInfo.getAddedThroughGroups();
    Long actualId = actualMemberInfo.getId();
    Long actualJoinDate = actualMemberInfo.getJoinDate();
    Boolean actualOwner = actualMemberInfo.getOwner();

    // Assert
    assertEquals(
        "class MemberInfo {\n    id: 1\n    owner: true\n    joinDate: 1\n    addedThroughGroups: []\n}",
        actualToStringResult);
    assertEquals(1L, actualId.longValue());
    assertEquals(1L, actualJoinDate.longValue());
    assertTrue(actualOwner);
    assertTrue(actualAddedThroughGroups.isEmpty());
    assertSame(actualMemberInfo, actualAddedThroughGroupsResult);
    assertSame(actualMemberInfo, actualIdResult);
    assertSame(actualMemberInfo, actualJoinDateResult);
    assertSame(actualMemberInfo, actualOwnerResult);
    assertSame(addedThroughGroups, actualAddedThroughGroups);
  }
}
