package com.symphony.bdk.ext.group.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.ext.group.gen.api.model.CreateGroupAllOf.SubTypeEnum;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CreateGroupAllOfDiffblueTest {
  /**
   * Test {@link CreateGroupAllOf#addMembersItem(Member)}.
   *
   * <ul>
   *   <li>Given {@link CreateGroupAllOf} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link CreateGroupAllOf#addMembersItem(Member)}
   */
  @Test
  @DisplayName("Test addMembersItem(Member); given CreateGroupAllOf (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CreateGroupAllOf CreateGroupAllOf.addMembersItem(Member)"})
  void testAddMembersItem_givenCreateGroupAllOf() {
    // Arrange
    CreateGroupAllOf createGroupAllOf = new CreateGroupAllOf();

    // Act
    CreateGroupAllOf actualAddMembersItemResult = createGroupAllOf.addMembersItem(new Member());

    // Assert
    assertSame(createGroupAllOf, actualAddMembersItemResult);
  }

  /**
   * Test {@link CreateGroupAllOf#addMembersItem(Member)}.
   *
   * <ul>
   *   <li>Given {@link CreateGroupAllOf} (default constructor) members {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CreateGroupAllOf#addMembersItem(Member)}
   */
  @Test
  @DisplayName(
      "Test addMembersItem(Member); given CreateGroupAllOf (default constructor) members ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CreateGroupAllOf CreateGroupAllOf.addMembersItem(Member)"})
  void testAddMembersItem_givenCreateGroupAllOfMembersArrayList() {
    // Arrange
    CreateGroupAllOf createGroupAllOf = new CreateGroupAllOf();
    createGroupAllOf.members(new ArrayList<>());

    // Act
    CreateGroupAllOf actualAddMembersItemResult = createGroupAllOf.addMembersItem(new Member());

    // Assert
    assertSame(createGroupAllOf, actualAddMembersItemResult);
  }

  /**
   * Test {@link CreateGroupAllOf#equals(Object)}, and {@link CreateGroupAllOf#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CreateGroupAllOf#equals(Object)}
   *   <li>{@link CreateGroupAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CreateGroupAllOf.equals(Object)", "int CreateGroupAllOf.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CreateGroupAllOf createGroupAllOf = new CreateGroupAllOf();
    CreateGroupAllOf createGroupAllOf2 = new CreateGroupAllOf();

    // Act and Assert
    assertEquals(createGroupAllOf, createGroupAllOf2);
    assertEquals(createGroupAllOf.hashCode(), createGroupAllOf2.hashCode());
  }

  /**
   * Test {@link CreateGroupAllOf#equals(Object)}, and {@link CreateGroupAllOf#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CreateGroupAllOf#equals(Object)}
   *   <li>{@link CreateGroupAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CreateGroupAllOf.equals(Object)", "int CreateGroupAllOf.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CreateGroupAllOf createGroupAllOf = new CreateGroupAllOf();

    // Act and Assert
    assertEquals(createGroupAllOf, createGroupAllOf);
    int expectedHashCodeResult = createGroupAllOf.hashCode();
    assertEquals(expectedHashCodeResult, createGroupAllOf.hashCode());
  }

  /**
   * Test {@link CreateGroupAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CreateGroupAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CreateGroupAllOf.equals(Object)", "int CreateGroupAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    CreateGroupAllOf createGroupAllOf = new CreateGroupAllOf();
    createGroupAllOf.addMembersItem(new Member());

    // Act and Assert
    assertNotEquals(createGroupAllOf, new CreateGroupAllOf());
  }

  /**
   * Test {@link CreateGroupAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CreateGroupAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CreateGroupAllOf.equals(Object)", "int CreateGroupAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    CreateGroupAllOf createGroupAllOf = new CreateGroupAllOf();
    createGroupAllOf.subType(SubTypeEnum.COMMUNITY);
    createGroupAllOf.addMembersItem(new Member());

    // Act and Assert
    assertNotEquals(createGroupAllOf, new CreateGroupAllOf());
  }

  /**
   * Test {@link CreateGroupAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CreateGroupAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CreateGroupAllOf.equals(Object)", "int CreateGroupAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    CreateGroupAllOf createGroupAllOf = new CreateGroupAllOf();
    createGroupAllOf.referrer("Referrer");
    createGroupAllOf.addMembersItem(new Member());

    // Act and Assert
    assertNotEquals(createGroupAllOf, new CreateGroupAllOf());
  }

  /**
   * Test {@link CreateGroupAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CreateGroupAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CreateGroupAllOf.equals(Object)", "int CreateGroupAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    CreateGroupAllOf createGroupAllOf = new CreateGroupAllOf();
    createGroupAllOf.profile(new BaseProfile());

    // Act and Assert
    assertNotEquals(createGroupAllOf, new CreateGroupAllOf());
  }

  /**
   * Test {@link CreateGroupAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CreateGroupAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CreateGroupAllOf.equals(Object)", "int CreateGroupAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    CreateGroupAllOf createGroupAllOf = new CreateGroupAllOf();
    createGroupAllOf.visibilityRestriction(new GroupVisibilityRestriction());

    // Act and Assert
    assertNotEquals(createGroupAllOf, new CreateGroupAllOf());
  }

  /**
   * Test {@link CreateGroupAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CreateGroupAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CreateGroupAllOf.equals(Object)", "int CreateGroupAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    CreateGroupAllOf createGroupAllOf = new CreateGroupAllOf();
    createGroupAllOf.implicitConnection(new GroupImplicitConnection());

    // Act and Assert
    assertNotEquals(createGroupAllOf, new CreateGroupAllOf());
  }

  /**
   * Test {@link CreateGroupAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CreateGroupAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CreateGroupAllOf.equals(Object)", "int CreateGroupAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    CreateGroupAllOf createGroupAllOf = new CreateGroupAllOf();
    createGroupAllOf.interactionTransfer(new GroupInteractionTransfer());

    // Act and Assert
    assertNotEquals(createGroupAllOf, new CreateGroupAllOf());
  }

  /**
   * Test {@link CreateGroupAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CreateGroupAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CreateGroupAllOf.equals(Object)", "int CreateGroupAllOf.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CreateGroupAllOf(), null);
  }

  /**
   * Test {@link CreateGroupAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CreateGroupAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CreateGroupAllOf.equals(Object)", "int CreateGroupAllOf.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CreateGroupAllOf(), "Different type to CreateGroupAllOf");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link CreateGroupAllOf}
   *   <li>{@link CreateGroupAllOf#implicitConnection(GroupImplicitConnection)}
   *   <li>{@link CreateGroupAllOf#interactionTransfer(GroupInteractionTransfer)}
   *   <li>{@link CreateGroupAllOf#members(List)}
   *   <li>{@link CreateGroupAllOf#profile(BaseProfile)}
   *   <li>{@link CreateGroupAllOf#referrer(String)}
   *   <li>{@link CreateGroupAllOf#setImplicitConnection(GroupImplicitConnection)}
   *   <li>{@link CreateGroupAllOf#setInteractionTransfer(GroupInteractionTransfer)}
   *   <li>{@link CreateGroupAllOf#setMembers(List)}
   *   <li>{@link CreateGroupAllOf#setProfile(BaseProfile)}
   *   <li>{@link CreateGroupAllOf#setReferrer(String)}
   *   <li>{@link CreateGroupAllOf#setSubType(SubTypeEnum)}
   *   <li>{@link CreateGroupAllOf#setVisibilityRestriction(GroupVisibilityRestriction)}
   *   <li>{@link CreateGroupAllOf#subType(SubTypeEnum)}
   *   <li>{@link CreateGroupAllOf#visibilityRestriction(GroupVisibilityRestriction)}
   *   <li>{@link CreateGroupAllOf#toString()}
   *   <li>{@link CreateGroupAllOf#getImplicitConnection()}
   *   <li>{@link CreateGroupAllOf#getInteractionTransfer()}
   *   <li>{@link CreateGroupAllOf#getMembers()}
   *   <li>{@link CreateGroupAllOf#getProfile()}
   *   <li>{@link CreateGroupAllOf#getReferrer()}
   *   <li>{@link CreateGroupAllOf#getSubType()}
   *   <li>{@link CreateGroupAllOf#getVisibilityRestriction()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void CreateGroupAllOf.<init>()",
    "GroupImplicitConnection CreateGroupAllOf.getImplicitConnection()",
    "GroupInteractionTransfer CreateGroupAllOf.getInteractionTransfer()",
    "List CreateGroupAllOf.getMembers()",
    "BaseProfile CreateGroupAllOf.getProfile()",
    "String CreateGroupAllOf.getReferrer()",
    "SubTypeEnum CreateGroupAllOf.getSubType()",
    "GroupVisibilityRestriction CreateGroupAllOf.getVisibilityRestriction()",
    "CreateGroupAllOf CreateGroupAllOf.implicitConnection(GroupImplicitConnection)",
    "CreateGroupAllOf CreateGroupAllOf.interactionTransfer(GroupInteractionTransfer)",
    "CreateGroupAllOf CreateGroupAllOf.members(List)",
    "CreateGroupAllOf CreateGroupAllOf.profile(BaseProfile)",
    "CreateGroupAllOf CreateGroupAllOf.referrer(String)",
    "void CreateGroupAllOf.setImplicitConnection(GroupImplicitConnection)",
    "void CreateGroupAllOf.setInteractionTransfer(GroupInteractionTransfer)",
    "void CreateGroupAllOf.setMembers(List)",
    "void CreateGroupAllOf.setProfile(BaseProfile)",
    "void CreateGroupAllOf.setReferrer(String)",
    "void CreateGroupAllOf.setSubType(SubTypeEnum)",
    "void CreateGroupAllOf.setVisibilityRestriction(GroupVisibilityRestriction)",
    "CreateGroupAllOf CreateGroupAllOf.subType(SubTypeEnum)",
    "String CreateGroupAllOf.toString()",
    "CreateGroupAllOf CreateGroupAllOf.visibilityRestriction(GroupVisibilityRestriction)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    CreateGroupAllOf actualCreateGroupAllOf = new CreateGroupAllOf();
    CreateGroupAllOf actualImplicitConnectionResult =
        actualCreateGroupAllOf.implicitConnection(new GroupImplicitConnection());
    CreateGroupAllOf actualInteractionTransferResult =
        actualCreateGroupAllOf.interactionTransfer(new GroupInteractionTransfer());
    CreateGroupAllOf actualMembersResult = actualCreateGroupAllOf.members(new ArrayList<>());
    CreateGroupAllOf actualProfileResult = actualCreateGroupAllOf.profile(new BaseProfile());
    CreateGroupAllOf actualReferrerResult = actualCreateGroupAllOf.referrer("Referrer");
    GroupImplicitConnection implicitConnection = new GroupImplicitConnection();
    actualCreateGroupAllOf.setImplicitConnection(implicitConnection);
    GroupInteractionTransfer interactionTransfer = new GroupInteractionTransfer();
    actualCreateGroupAllOf.setInteractionTransfer(interactionTransfer);
    ArrayList<Member> members = new ArrayList<>();
    actualCreateGroupAllOf.setMembers(members);
    BaseProfile profile = new BaseProfile();
    actualCreateGroupAllOf.setProfile(profile);
    actualCreateGroupAllOf.setReferrer("Referrer");
    actualCreateGroupAllOf.setSubType(SubTypeEnum.COMMUNITY);
    actualCreateGroupAllOf.setVisibilityRestriction(new GroupVisibilityRestriction());
    CreateGroupAllOf actualSubTypeResult = actualCreateGroupAllOf.subType(SubTypeEnum.COMMUNITY);
    GroupVisibilityRestriction visibilityRestriction = new GroupVisibilityRestriction();
    CreateGroupAllOf actualVisibilityRestrictionResult =
        actualCreateGroupAllOf.visibilityRestriction(visibilityRestriction);
    String actualToStringResult = actualCreateGroupAllOf.toString();
    GroupImplicitConnection actualImplicitConnection =
        actualCreateGroupAllOf.getImplicitConnection();
    GroupInteractionTransfer actualInteractionTransfer =
        actualCreateGroupAllOf.getInteractionTransfer();
    List<Member> actualMembers = actualCreateGroupAllOf.getMembers();
    BaseProfile actualProfile = actualCreateGroupAllOf.getProfile();
    String actualReferrer = actualCreateGroupAllOf.getReferrer();
    SubTypeEnum actualSubType = actualCreateGroupAllOf.getSubType();
    GroupVisibilityRestriction actualVisibilityRestriction =
        actualCreateGroupAllOf.getVisibilityRestriction();

    // Assert
    assertEquals("Referrer", actualReferrer);
    assertEquals(
        "class CreateGroupAllOf {\n"
            + "    subType: COMMUNITY\n"
            + "    referrer: Referrer\n"
            + "    members: []\n"
            + "    profile: class BaseProfile {\n"
            + "        displayName: null\n"
            + "        companyName: null\n"
            + "        email: null\n"
            + "        mobile: null\n"
            + "        jobTitle: null\n"
            + "        jobRole: null\n"
            + "        jobDepartment: null\n"
            + "        jobDivision: null\n"
            + "        jobPhone: null\n"
            + "        jobCity: null\n"
            + "        industryOfInterest: null\n"
            + "        assetClassesOfInterest: null\n"
            + "        marketCoverage: null\n"
            + "        responsibility: null\n"
            + "        function: null\n"
            + "        instrument: null\n"
            + "    }\n"
            + "    visibilityRestriction: class GroupVisibilityRestriction {\n"
            + "        restrictedTenantsList: null\n"
            + "        restrictedUsersList: null\n"
            + "    }\n"
            + "    implicitConnection: class GroupImplicitConnection {\n"
            + "        connectedTenantsList: null\n"
            + "        connectedUsersList: null\n"
            + "    }\n"
            + "    interactionTransfer: class GroupInteractionTransfer {\n"
            + "        restrictedTenantsList: null\n"
            + "        restrictedUsersList: null\n"
            + "    }\n"
            + "}",
        actualToStringResult);
    assertEquals(SubTypeEnum.COMMUNITY, actualSubType);
    assertTrue(actualMembers.isEmpty());
    assertSame(profile, actualProfile);
    assertSame(actualCreateGroupAllOf, actualImplicitConnectionResult);
    assertSame(actualCreateGroupAllOf, actualInteractionTransferResult);
    assertSame(actualCreateGroupAllOf, actualMembersResult);
    assertSame(actualCreateGroupAllOf, actualProfileResult);
    assertSame(actualCreateGroupAllOf, actualReferrerResult);
    assertSame(actualCreateGroupAllOf, actualSubTypeResult);
    assertSame(actualCreateGroupAllOf, actualVisibilityRestrictionResult);
    assertSame(implicitConnection, actualImplicitConnection);
    assertSame(interactionTransfer, actualInteractionTransfer);
    assertSame(visibilityRestriction, actualVisibilityRestriction);
    assertSame(members, actualMembers);
  }

  /**
   * Test SubTypeEnum {@link SubTypeEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link SubTypeEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test SubTypeEnum fromValue(String); when '42'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SubTypeEnum SubTypeEnum.fromValue(String)"})
  void testSubTypeEnumFromValue_when42_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(SubTypeEnum.fromValue("42"));
  }

  /**
   * Test SubTypeEnum {@link SubTypeEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code COMMUNITY}.
   *   <li>Then return {@code COMMUNITY}.
   * </ul>
   *
   * <p>Method under test: {@link SubTypeEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test SubTypeEnum fromValue(String); when 'COMMUNITY'; then return 'COMMUNITY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SubTypeEnum SubTypeEnum.fromValue(String)"})
  void testSubTypeEnumFromValue_whenCommunity_thenReturnCommunity() {
    // Arrange, Act and Assert
    assertEquals(SubTypeEnum.COMMUNITY, SubTypeEnum.fromValue("COMMUNITY"));
  }

  /**
   * Test SubTypeEnum getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SubTypeEnum#toString()}
   *   <li>{@link SubTypeEnum#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test SubTypeEnum getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String SubTypeEnum.getValue()", "String SubTypeEnum.toString()"})
  void testSubTypeEnumGettersAndSetters() {
    // Arrange
    SubTypeEnum valueOfResult = SubTypeEnum.valueOf("COMMUNITY");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("COMMUNITY", valueOfResult.getValue());
    assertEquals("COMMUNITY", actualToStringResult);
  }
}
