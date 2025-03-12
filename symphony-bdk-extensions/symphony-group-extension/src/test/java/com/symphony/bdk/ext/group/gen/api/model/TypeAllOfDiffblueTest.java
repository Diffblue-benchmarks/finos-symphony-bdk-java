package com.symphony.bdk.ext.group.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TypeAllOfDiffblueTest {
  /**
   * Test {@link TypeAllOf#equals(Object)}, and {@link TypeAllOf#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link TypeAllOf#equals(Object)}
   *   <li>{@link TypeAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TypeAllOf.equals(Object)", "int TypeAllOf.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    TypeAllOf typeAllOf = new TypeAllOf();
    TypeAllOf typeAllOf2 = new TypeAllOf();

    // Act and Assert
    assertEquals(typeAllOf, typeAllOf2);
    int expectedHashCodeResult = typeAllOf.hashCode();
    assertEquals(expectedHashCodeResult, typeAllOf2.hashCode());
  }

  /**
   * Test {@link TypeAllOf#equals(Object)}, and {@link TypeAllOf#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link TypeAllOf#equals(Object)}
   *   <li>{@link TypeAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TypeAllOf.equals(Object)", "int TypeAllOf.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    TypeAllOf typeAllOf = new TypeAllOf();

    // Act and Assert
    assertEquals(typeAllOf, typeAllOf);
    int expectedHashCodeResult = typeAllOf.hashCode();
    assertEquals(expectedHashCodeResult, typeAllOf.hashCode());
  }

  /**
   * Test {@link TypeAllOf#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link TypeAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TypeAllOf.equals(Object)", "int TypeAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new TypeAllOf(), 1);
  }

  /**
   * Test {@link TypeAllOf#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link TypeAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TypeAllOf.equals(Object)", "int TypeAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    TypeAllOf typeAllOf = new TypeAllOf();
    typeAllOf.profileControl(new ProfileControl());

    // Act and Assert
    assertNotEquals(typeAllOf, new TypeAllOf());
  }

  /**
   * Test {@link TypeAllOf#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link TypeAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TypeAllOf.equals(Object)", "int TypeAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    TypeAllOf typeAllOf = new TypeAllOf();
    typeAllOf.membershipControl(new MembershipControl());

    // Act and Assert
    assertNotEquals(typeAllOf, new TypeAllOf());
  }

  /**
   * Test {@link TypeAllOf#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link TypeAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TypeAllOf.equals(Object)", "int TypeAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    TypeAllOf typeAllOf = new TypeAllOf();
    typeAllOf.interactionControl(new InteractionControl());

    // Act and Assert
    assertNotEquals(typeAllOf, new TypeAllOf());
  }

  /**
   * Test {@link TypeAllOf#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link TypeAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TypeAllOf.equals(Object)", "int TypeAllOf.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new TypeAllOf(), null);
  }

  /**
   * Test {@link TypeAllOf#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link TypeAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TypeAllOf.equals(Object)", "int TypeAllOf.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new TypeAllOf(), "Different type to TypeAllOf");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link TypeAllOf}
   *   <li>{@link TypeAllOf#interactionControl(InteractionControl)}
   *   <li>{@link TypeAllOf#membershipControl(MembershipControl)}
   *   <li>{@link TypeAllOf#profileControl(ProfileControl)}
   *   <li>{@link TypeAllOf#setInteractionControl(InteractionControl)}
   *   <li>{@link TypeAllOf#setMembershipControl(MembershipControl)}
   *   <li>{@link TypeAllOf#setProfileControl(ProfileControl)}
   *   <li>{@link TypeAllOf#toString()}
   *   <li>{@link TypeAllOf#getInteractionControl()}
   *   <li>{@link TypeAllOf#getMembershipControl()}
   *   <li>{@link TypeAllOf#getProfileControl()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void TypeAllOf.<init>()", "InteractionControl TypeAllOf.getInteractionControl()",
      "MembershipControl TypeAllOf.getMembershipControl()", "ProfileControl TypeAllOf.getProfileControl()",
      "TypeAllOf TypeAllOf.interactionControl(InteractionControl)",
      "TypeAllOf TypeAllOf.membershipControl(MembershipControl)", "TypeAllOf TypeAllOf.profileControl(ProfileControl)",
      "void TypeAllOf.setInteractionControl(InteractionControl)",
      "void TypeAllOf.setMembershipControl(MembershipControl)", "void TypeAllOf.setProfileControl(ProfileControl)",
      "String TypeAllOf.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    TypeAllOf actualTypeAllOf = new TypeAllOf();
    TypeAllOf actualInteractionControlResult = actualTypeAllOf.interactionControl(new InteractionControl());
    TypeAllOf actualMembershipControlResult = actualTypeAllOf.membershipControl(new MembershipControl());
    TypeAllOf actualProfileControlResult = actualTypeAllOf.profileControl(new ProfileControl());
    InteractionControl interactionControl = new InteractionControl();
    actualTypeAllOf.setInteractionControl(interactionControl);
    MembershipControl membershipControl = new MembershipControl();
    actualTypeAllOf.setMembershipControl(membershipControl);
    ProfileControl profileControl = new ProfileControl();
    actualTypeAllOf.setProfileControl(profileControl);
    String actualToStringResult = actualTypeAllOf.toString();
    InteractionControl actualInteractionControl = actualTypeAllOf.getInteractionControl();
    MembershipControl actualMembershipControl = actualTypeAllOf.getMembershipControl();

    // Assert
    assertEquals("class TypeAllOf {\n" + "    profileControl: class ProfileControl {\n"
        + "        visibilityRestriction: null\n" + "        implicitConnection: null\n" + "        wallSupport: null\n"
        + "        profileFields: null\n" + "        searchFields: null\n" + "        canHavePublicProfile: true\n"
        + "    }\n" + "    membershipControl: class MembershipControl {\n" + "        entitlements: null\n"
        + "        manualMembership: null\n" + "        ruleMembership: null\n"
        + "        updateMembershipOnRuleUpdate: null\n" + "        notifyMembersOnUpdate: null\n"
        + "        canBelongToMultipleGroup: true\n" + "    }\n"
        + "    interactionControl: class InteractionControl {\n" + "        allowIMs: null\n"
        + "        allowRooms: null\n" + "        interactionTransfer: null\n" + "        tagStream: null\n"
        + "        canHaveInteraction: true\n" + "    }\n" + "}", actualToStringResult);
    assertSame(interactionControl, actualInteractionControl);
    assertSame(membershipControl, actualMembershipControl);
    assertSame(profileControl, actualTypeAllOf.getProfileControl());
    assertSame(actualTypeAllOf, actualInteractionControlResult);
    assertSame(actualTypeAllOf, actualMembershipControlResult);
    assertSame(actualTypeAllOf, actualProfileControlResult);
  }
}
