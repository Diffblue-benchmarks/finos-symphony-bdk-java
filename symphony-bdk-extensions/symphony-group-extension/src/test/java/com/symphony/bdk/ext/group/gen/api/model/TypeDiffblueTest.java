package com.symphony.bdk.ext.group.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TypeDiffblueTest {
  /**
   * Test {@link Type#equals(Object)}, and {@link Type#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Type#equals(Object)}
   *   <li>{@link Type#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Type.equals(Object)", "int Type.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Type type = new Type();
    Type type2 = new Type();

    // Act and Assert
    assertEquals(type, type2);
    int expectedHashCodeResult = type.hashCode();
    assertEquals(expectedHashCodeResult, type2.hashCode());
  }

  /**
   * Test {@link Type#equals(Object)}, and {@link Type#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Type#equals(Object)}
   *   <li>{@link Type#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Type.equals(Object)", "int Type.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Type type = new Type();

    // Act and Assert
    assertEquals(type, type);
    int expectedHashCodeResult = type.hashCode();
    assertEquals(expectedHashCodeResult, type.hashCode());
  }

  /**
   * Test {@link Type#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Type#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Type.equals(Object)", "int Type.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Type(), 1);
  }

  /**
   * Test {@link Type#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Type#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Type.equals(Object)", "int Type.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Type type = new Type();
    type.id("42");

    // Act and Assert
    assertNotEquals(type, new Type());
  }

  /**
   * Test {@link Type#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Type#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Type.equals(Object)", "int Type.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Type type = new Type();
    type.ownerType(Owner.PLATFORM);

    // Act and Assert
    assertNotEquals(type, new Type());
  }

  /**
   * Test {@link Type#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Type#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Type.equals(Object)", "int Type.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    Type type = new Type();
    type.name("Name");

    // Act and Assert
    assertNotEquals(type, new Type());
  }

  /**
   * Test {@link Type#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Type#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Type.equals(Object)", "int Type.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    Type type = new Type();
    type.status(Status.ACTIVE);

    // Act and Assert
    assertNotEquals(type, new Type());
  }

  /**
   * Test {@link Type#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Type#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Type.equals(Object)", "int Type.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    Type type = new Type();
    type.profileControl(new ProfileControl());

    // Act and Assert
    assertNotEquals(type, new Type());
  }

  /**
   * Test {@link Type#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Type#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Type.equals(Object)", "int Type.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    Type type = new Type();
    type.membershipControl(new MembershipControl());

    // Act and Assert
    assertNotEquals(type, new Type());
  }

  /**
   * Test {@link Type#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Type#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Type.equals(Object)", "int Type.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    Type type = new Type();
    type.interactionControl(new InteractionControl());

    // Act and Assert
    assertNotEquals(type, new Type());
  }

  /**
   * Test {@link Type#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Type#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Type.equals(Object)", "int Type.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Type(), null);
  }

  /**
   * Test {@link Type#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Type#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Type.equals(Object)", "int Type.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Type(), "Different type to Type");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link Type}
   *   <li>{@link Type#id(String)}
   *   <li>{@link Type#interactionControl(InteractionControl)}
   *   <li>{@link Type#membershipControl(MembershipControl)}
   *   <li>{@link Type#name(String)}
   *   <li>{@link Type#ownerType(Owner)}
   *   <li>{@link Type#profileControl(ProfileControl)}
   *   <li>{@link Type#setId(String)}
   *   <li>{@link Type#setInteractionControl(InteractionControl)}
   *   <li>{@link Type#setMembershipControl(MembershipControl)}
   *   <li>{@link Type#setName(String)}
   *   <li>{@link Type#setOwnerType(Owner)}
   *   <li>{@link Type#setProfileControl(ProfileControl)}
   *   <li>{@link Type#setStatus(Status)}
   *   <li>{@link Type#status(Status)}
   *   <li>{@link Type#toString()}
   *   <li>{@link Type#getId()}
   *   <li>{@link Type#getInteractionControl()}
   *   <li>{@link Type#getMembershipControl()}
   *   <li>{@link Type#getName()}
   *   <li>{@link Type#getOwnerType()}
   *   <li>{@link Type#getProfileControl()}
   *   <li>{@link Type#getStatus()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Type.<init>()",
    "String Type.getId()",
    "InteractionControl Type.getInteractionControl()",
    "MembershipControl Type.getMembershipControl()",
    "String Type.getName()",
    "Owner Type.getOwnerType()",
    "ProfileControl Type.getProfileControl()",
    "Status Type.getStatus()",
    "Type Type.id(String)",
    "Type Type.interactionControl(InteractionControl)",
    "Type Type.membershipControl(MembershipControl)",
    "Type Type.name(String)",
    "Type Type.ownerType(Owner)",
    "Type Type.profileControl(ProfileControl)",
    "void Type.setId(String)",
    "void Type.setInteractionControl(InteractionControl)",
    "void Type.setMembershipControl(MembershipControl)",
    "void Type.setName(String)",
    "void Type.setOwnerType(Owner)",
    "void Type.setProfileControl(ProfileControl)",
    "void Type.setStatus(Status)",
    "Type Type.status(Status)",
    "String Type.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    Type actualType = new Type();
    Type actualIdResult = actualType.id("42");
    Type actualInteractionControlResult = actualType.interactionControl(new InteractionControl());
    Type actualMembershipControlResult = actualType.membershipControl(new MembershipControl());
    Type actualNameResult = actualType.name("Name");
    Type actualOwnerTypeResult = actualType.ownerType(Owner.PLATFORM);
    Type actualProfileControlResult = actualType.profileControl(new ProfileControl());
    actualType.setId("42");
    InteractionControl interactionControl = new InteractionControl();
    actualType.setInteractionControl(interactionControl);
    MembershipControl membershipControl = new MembershipControl();
    actualType.setMembershipControl(membershipControl);
    actualType.setName("Name");
    actualType.setOwnerType(Owner.PLATFORM);
    ProfileControl profileControl = new ProfileControl();
    actualType.setProfileControl(profileControl);
    actualType.setStatus(Status.ACTIVE);
    Type actualStatusResult = actualType.status(Status.ACTIVE);
    String actualToStringResult = actualType.toString();
    String actualId = actualType.getId();
    InteractionControl actualInteractionControl = actualType.getInteractionControl();
    MembershipControl actualMembershipControl = actualType.getMembershipControl();
    String actualName = actualType.getName();
    Owner actualOwnerType = actualType.getOwnerType();
    ProfileControl actualProfileControl = actualType.getProfileControl();

    // Assert
    assertEquals("42", actualId);
    assertEquals("Name", actualName);
    assertEquals(
        "class Type {\n"
            + "    id: 42\n"
            + "    ownerType: PLATFORM\n"
            + "    name: Name\n"
            + "    status: ACTIVE\n"
            + "    profileControl: class ProfileControl {\n"
            + "        visibilityRestriction: null\n"
            + "        implicitConnection: null\n"
            + "        wallSupport: null\n"
            + "        profileFields: null\n"
            + "        searchFields: null\n"
            + "        canHavePublicProfile: true\n"
            + "    }\n"
            + "    membershipControl: class MembershipControl {\n"
            + "        entitlements: null\n"
            + "        manualMembership: null\n"
            + "        ruleMembership: null\n"
            + "        updateMembershipOnRuleUpdate: null\n"
            + "        notifyMembersOnUpdate: null\n"
            + "        canBelongToMultipleGroup: true\n"
            + "    }\n"
            + "    interactionControl: class InteractionControl {\n"
            + "        allowIMs: null\n"
            + "        allowRooms: null\n"
            + "        interactionTransfer: null\n"
            + "        tagStream: null\n"
            + "        canHaveInteraction: true\n"
            + "    }\n"
            + "}",
        actualToStringResult);
    assertEquals(Owner.PLATFORM, actualOwnerType);
    assertEquals(Status.ACTIVE, actualType.getStatus());
    assertSame(interactionControl, actualInteractionControl);
    assertSame(membershipControl, actualMembershipControl);
    assertSame(profileControl, actualProfileControl);
    assertSame(actualType, actualIdResult);
    assertSame(actualType, actualInteractionControlResult);
    assertSame(actualType, actualMembershipControlResult);
    assertSame(actualType, actualNameResult);
    assertSame(actualType, actualOwnerTypeResult);
    assertSame(actualType, actualProfileControlResult);
    assertSame(actualType, actualStatusResult);
  }
}
