package com.symphony.bdk.ext.group.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MembershipControlDiffblueTest {
  /**
   * Test {@link MembershipControl#addEntitlementsItem(String)}.
   *
   * <ul>
   *   <li>Given {@link MembershipControl} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link MembershipControl#addEntitlementsItem(String)}
   */
  @Test
  @DisplayName("Test addEntitlementsItem(String); given MembershipControl (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MembershipControl MembershipControl.addEntitlementsItem(String)"})
  void testAddEntitlementsItem_givenMembershipControl() {
    // Arrange
    MembershipControl membershipControl = new MembershipControl();

    // Act and Assert
    assertSame(membershipControl, membershipControl.addEntitlementsItem("Dr"));
  }

  /**
   * Test {@link MembershipControl#addEntitlementsItem(String)}.
   *
   * <ul>
   *   <li>Given {@link MembershipControl} (default constructor) entitlements {@link
   *       HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link MembershipControl#addEntitlementsItem(String)}
   */
  @Test
  @DisplayName(
      "Test addEntitlementsItem(String); given MembershipControl (default constructor) entitlements HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MembershipControl MembershipControl.addEntitlementsItem(String)"})
  void testAddEntitlementsItem_givenMembershipControlEntitlementsHashSet() {
    // Arrange
    MembershipControl membershipControl = new MembershipControl();
    membershipControl.entitlements(new HashSet<>());

    // Act and Assert
    assertSame(membershipControl, membershipControl.addEntitlementsItem("Dr"));
  }

  /**
   * Test {@link MembershipControl#equals(Object)}, and {@link MembershipControl#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MembershipControl#equals(Object)}
   *   <li>{@link MembershipControl#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MembershipControl.equals(Object)",
    "int MembershipControl.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MembershipControl membershipControl = new MembershipControl();
    MembershipControl membershipControl2 = new MembershipControl();

    // Act and Assert
    assertEquals(membershipControl, membershipControl2);
    int expectedHashCodeResult = membershipControl.hashCode();
    assertEquals(expectedHashCodeResult, membershipControl2.hashCode());
  }

  /**
   * Test {@link MembershipControl#equals(Object)}, and {@link MembershipControl#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MembershipControl#equals(Object)}
   *   <li>{@link MembershipControl#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MembershipControl.equals(Object)",
    "int MembershipControl.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MembershipControl membershipControl = new MembershipControl();

    // Act and Assert
    assertEquals(membershipControl, membershipControl);
    int expectedHashCodeResult = membershipControl.hashCode();
    assertEquals(expectedHashCodeResult, membershipControl.hashCode());
  }

  /**
   * Test {@link MembershipControl#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MembershipControl#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MembershipControl.equals(Object)",
    "int MembershipControl.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    MembershipControl membershipControl = new MembershipControl();
    membershipControl.addEntitlementsItem("Dr");

    // Act and Assert
    assertNotEquals(membershipControl, new MembershipControl());
  }

  /**
   * Test {@link MembershipControl#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MembershipControl#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MembershipControl.equals(Object)",
    "int MembershipControl.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    MembershipControl membershipControl = new MembershipControl();
    membershipControl.manualMembership(true);

    // Act and Assert
    assertNotEquals(membershipControl, new MembershipControl());
  }

  /**
   * Test {@link MembershipControl#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MembershipControl#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MembershipControl.equals(Object)",
    "int MembershipControl.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    MembershipControl membershipControl = new MembershipControl();
    membershipControl.ruleMembership(true);

    // Act and Assert
    assertNotEquals(membershipControl, new MembershipControl());
  }

  /**
   * Test {@link MembershipControl#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MembershipControl#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MembershipControl.equals(Object)",
    "int MembershipControl.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    MembershipControl membershipControl = new MembershipControl();
    membershipControl.updateMembershipOnRuleUpdate(true);

    // Act and Assert
    assertNotEquals(membershipControl, new MembershipControl());
  }

  /**
   * Test {@link MembershipControl#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MembershipControl#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MembershipControl.equals(Object)",
    "int MembershipControl.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    MembershipControl membershipControl = new MembershipControl();
    membershipControl.notifyMembersOnUpdate(true);

    // Act and Assert
    assertNotEquals(membershipControl, new MembershipControl());
  }

  /**
   * Test {@link MembershipControl#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MembershipControl#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MembershipControl.equals(Object)",
    "int MembershipControl.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MembershipControl(), null);
  }

  /**
   * Test {@link MembershipControl#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MembershipControl#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MembershipControl.equals(Object)",
    "int MembershipControl.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MembershipControl(), "Different type to MembershipControl");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link MembershipControl}
   *   <li>{@link MembershipControl#canBelongToMultipleGroup(Boolean)}
   *   <li>{@link MembershipControl#entitlements(Set)}
   *   <li>{@link MembershipControl#manualMembership(Boolean)}
   *   <li>{@link MembershipControl#notifyMembersOnUpdate(Boolean)}
   *   <li>{@link MembershipControl#ruleMembership(Boolean)}
   *   <li>{@link MembershipControl#setCanBelongToMultipleGroup(Boolean)}
   *   <li>{@link MembershipControl#setEntitlements(Set)}
   *   <li>{@link MembershipControl#setManualMembership(Boolean)}
   *   <li>{@link MembershipControl#setNotifyMembersOnUpdate(Boolean)}
   *   <li>{@link MembershipControl#setRuleMembership(Boolean)}
   *   <li>{@link MembershipControl#setUpdateMembershipOnRuleUpdate(Boolean)}
   *   <li>{@link MembershipControl#updateMembershipOnRuleUpdate(Boolean)}
   *   <li>{@link MembershipControl#toString()}
   *   <li>{@link MembershipControl#getCanBelongToMultipleGroup()}
   *   <li>{@link MembershipControl#getEntitlements()}
   *   <li>{@link MembershipControl#getManualMembership()}
   *   <li>{@link MembershipControl#getNotifyMembersOnUpdate()}
   *   <li>{@link MembershipControl#getRuleMembership()}
   *   <li>{@link MembershipControl#getUpdateMembershipOnRuleUpdate()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void MembershipControl.<init>()",
    "MembershipControl MembershipControl.canBelongToMultipleGroup(Boolean)",
    "MembershipControl MembershipControl.entitlements(Set)",
    "Boolean MembershipControl.getCanBelongToMultipleGroup()",
    "Set MembershipControl.getEntitlements()",
    "Boolean MembershipControl.getManualMembership()",
    "Boolean MembershipControl.getNotifyMembersOnUpdate()",
    "Boolean MembershipControl.getRuleMembership()",
    "Boolean MembershipControl.getUpdateMembershipOnRuleUpdate()",
    "MembershipControl MembershipControl.manualMembership(Boolean)",
    "MembershipControl MembershipControl.notifyMembersOnUpdate(Boolean)",
    "MembershipControl MembershipControl.ruleMembership(Boolean)",
    "void MembershipControl.setCanBelongToMultipleGroup(Boolean)",
    "void MembershipControl.setEntitlements(Set)",
    "void MembershipControl.setManualMembership(Boolean)",
    "void MembershipControl.setNotifyMembersOnUpdate(Boolean)",
    "void MembershipControl.setRuleMembership(Boolean)",
    "void MembershipControl.setUpdateMembershipOnRuleUpdate(Boolean)",
    "String MembershipControl.toString()",
    "MembershipControl MembershipControl.updateMembershipOnRuleUpdate(Boolean)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    MembershipControl actualMembershipControl = new MembershipControl();
    MembershipControl actualCanBelongToMultipleGroupResult =
        actualMembershipControl.canBelongToMultipleGroup(true);
    MembershipControl actualEntitlementsResult =
        actualMembershipControl.entitlements(new HashSet<>());
    MembershipControl actualManualMembershipResult = actualMembershipControl.manualMembership(true);
    MembershipControl actualNotifyMembersOnUpdateResult =
        actualMembershipControl.notifyMembersOnUpdate(true);
    MembershipControl actualRuleMembershipResult = actualMembershipControl.ruleMembership(true);
    actualMembershipControl.setCanBelongToMultipleGroup(true);
    HashSet<String> entitlements = new HashSet<>();
    actualMembershipControl.setEntitlements(entitlements);
    actualMembershipControl.setManualMembership(true);
    actualMembershipControl.setNotifyMembersOnUpdate(true);
    actualMembershipControl.setRuleMembership(true);
    actualMembershipControl.setUpdateMembershipOnRuleUpdate(true);
    MembershipControl actualUpdateMembershipOnRuleUpdateResult =
        actualMembershipControl.updateMembershipOnRuleUpdate(true);
    String actualToStringResult = actualMembershipControl.toString();
    Boolean actualCanBelongToMultipleGroup = actualMembershipControl.getCanBelongToMultipleGroup();
    Set<String> actualEntitlements = actualMembershipControl.getEntitlements();
    Boolean actualManualMembership = actualMembershipControl.getManualMembership();
    Boolean actualNotifyMembersOnUpdate = actualMembershipControl.getNotifyMembersOnUpdate();
    Boolean actualRuleMembership = actualMembershipControl.getRuleMembership();

    // Assert
    assertEquals(
        "class MembershipControl {\n"
            + "    entitlements: []\n"
            + "    manualMembership: true\n"
            + "    ruleMembership: true\n"
            + "    updateMembershipOnRuleUpdate: true\n"
            + "    notifyMembersOnUpdate: true\n"
            + "    canBelongToMultipleGroup: true\n"
            + "}",
        actualToStringResult);
    assertTrue(actualCanBelongToMultipleGroup);
    assertTrue(actualManualMembership);
    assertTrue(actualNotifyMembersOnUpdate);
    assertTrue(actualRuleMembership);
    assertTrue(actualMembershipControl.getUpdateMembershipOnRuleUpdate());
    assertTrue(actualEntitlements.isEmpty());
    assertSame(actualMembershipControl, actualCanBelongToMultipleGroupResult);
    assertSame(actualMembershipControl, actualEntitlementsResult);
    assertSame(actualMembershipControl, actualManualMembershipResult);
    assertSame(actualMembershipControl, actualNotifyMembersOnUpdateResult);
    assertSame(actualMembershipControl, actualRuleMembershipResult);
    assertSame(actualMembershipControl, actualUpdateMembershipOnRuleUpdateResult);
    assertSame(entitlements, actualEntitlements);
  }
}
