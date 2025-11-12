package com.symphony.bdk.ext.group.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.ext.group.gen.api.model.CreateGroup.SubTypeEnum;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CreateGroupDiffblueTest {
  /**
   * Test {@link CreateGroup#addMembersItem(Member)}.
   *
   * <ul>
   *   <li>Given {@link CreateGroup} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link CreateGroup#addMembersItem(Member)}
   */
  @Test
  @DisplayName("Test addMembersItem(Member); given CreateGroup (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CreateGroup CreateGroup.addMembersItem(Member)"})
  void testAddMembersItem_givenCreateGroup() {
    // Arrange
    CreateGroup createGroup = new CreateGroup();

    // Act
    CreateGroup actualAddMembersItemResult = createGroup.addMembersItem(new Member());

    // Assert
    assertSame(createGroup, actualAddMembersItemResult);
  }

  /**
   * Test {@link CreateGroup#addMembersItem(Member)}.
   *
   * <ul>
   *   <li>Given {@link CreateGroup} (default constructor) members {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CreateGroup#addMembersItem(Member)}
   */
  @Test
  @DisplayName(
      "Test addMembersItem(Member); given CreateGroup (default constructor) members ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CreateGroup CreateGroup.addMembersItem(Member)"})
  void testAddMembersItem_givenCreateGroupMembersArrayList() {
    // Arrange
    CreateGroup createGroup = new CreateGroup();
    createGroup.members(new ArrayList<>());

    // Act
    CreateGroup actualAddMembersItemResult = createGroup.addMembersItem(new Member());

    // Assert
    assertSame(createGroup, actualAddMembersItemResult);
  }

  /**
   * Test {@link CreateGroup#equals(Object)}, and {@link CreateGroup#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CreateGroup#equals(Object)}
   *   <li>{@link CreateGroup#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CreateGroup.equals(Object)", "int CreateGroup.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CreateGroup createGroup = new CreateGroup();
    CreateGroup createGroup2 = new CreateGroup();

    // Act and Assert
    assertEquals(createGroup, createGroup2);
    assertEquals(createGroup.hashCode(), createGroup2.hashCode());
  }

  /**
   * Test {@link CreateGroup#equals(Object)}, and {@link CreateGroup#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CreateGroup#equals(Object)}
   *   <li>{@link CreateGroup#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CreateGroup.equals(Object)", "int CreateGroup.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CreateGroup createGroup = new CreateGroup();

    // Act and Assert
    assertEquals(createGroup, createGroup);
    int expectedHashCodeResult = createGroup.hashCode();
    assertEquals(expectedHashCodeResult, createGroup.hashCode());
  }

  /**
   * Test {@link CreateGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CreateGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CreateGroup.equals(Object)", "int CreateGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    CreateGroup createGroup = new CreateGroup();
    createGroup.addMembersItem(new Member());

    // Act and Assert
    assertNotEquals(createGroup, new CreateGroup());
  }

  /**
   * Test {@link CreateGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CreateGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CreateGroup.equals(Object)", "int CreateGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    CreateGroup createGroup = new CreateGroup();
    createGroup.type("Type");
    createGroup.addMembersItem(new Member());

    // Act and Assert
    assertNotEquals(createGroup, new CreateGroup());
  }

  /**
   * Test {@link CreateGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CreateGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CreateGroup.equals(Object)", "int CreateGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    CreateGroup createGroup = new CreateGroup();
    createGroup.ownerType(Owner.PLATFORM);
    createGroup.addMembersItem(new Member());

    // Act and Assert
    assertNotEquals(createGroup, new CreateGroup());
  }

  /**
   * Test {@link CreateGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CreateGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CreateGroup.equals(Object)", "int CreateGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    CreateGroup createGroup = new CreateGroup();
    createGroup.ownerId(1L);
    createGroup.addMembersItem(new Member());

    // Act and Assert
    assertNotEquals(createGroup, new CreateGroup());
  }

  /**
   * Test {@link CreateGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CreateGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CreateGroup.equals(Object)", "int CreateGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    CreateGroup createGroup = new CreateGroup();
    createGroup.name("Name");
    createGroup.addMembersItem(new Member());

    // Act and Assert
    assertNotEquals(createGroup, new CreateGroup());
  }

  /**
   * Test {@link CreateGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CreateGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CreateGroup.equals(Object)", "int CreateGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    CreateGroup createGroup = new CreateGroup();
    createGroup.subType(SubTypeEnum.COMMUNITY);
    createGroup.addMembersItem(new Member());

    // Act and Assert
    assertNotEquals(createGroup, new CreateGroup());
  }

  /**
   * Test {@link CreateGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CreateGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CreateGroup.equals(Object)", "int CreateGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    CreateGroup createGroup = new CreateGroup();
    createGroup.referrer("Referrer");
    createGroup.addMembersItem(new Member());

    // Act and Assert
    assertNotEquals(createGroup, new CreateGroup());
  }

  /**
   * Test {@link CreateGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CreateGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CreateGroup.equals(Object)", "int CreateGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    CreateGroup createGroup = new CreateGroup();
    createGroup.profile(new BaseProfile());

    // Act and Assert
    assertNotEquals(createGroup, new CreateGroup());
  }

  /**
   * Test {@link CreateGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CreateGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CreateGroup.equals(Object)", "int CreateGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    CreateGroup createGroup = new CreateGroup();
    createGroup.visibilityRestriction(new GroupVisibilityRestriction());

    // Act and Assert
    assertNotEquals(createGroup, new CreateGroup());
  }

  /**
   * Test {@link CreateGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CreateGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CreateGroup.equals(Object)", "int CreateGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual10() {
    // Arrange
    CreateGroup createGroup = new CreateGroup();
    createGroup.implicitConnection(new GroupImplicitConnection());

    // Act and Assert
    assertNotEquals(createGroup, new CreateGroup());
  }

  /**
   * Test {@link CreateGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CreateGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CreateGroup.equals(Object)", "int CreateGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual11() {
    // Arrange
    CreateGroup createGroup = new CreateGroup();
    createGroup.interactionTransfer(new GroupInteractionTransfer());

    // Act and Assert
    assertNotEquals(createGroup, new CreateGroup());
  }

  /**
   * Test {@link CreateGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CreateGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CreateGroup.equals(Object)", "int CreateGroup.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CreateGroup(), null);
  }

  /**
   * Test {@link CreateGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CreateGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CreateGroup.equals(Object)", "int CreateGroup.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CreateGroup(), "Different type to CreateGroup");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link CreateGroup}
   *   <li>{@link CreateGroup#implicitConnection(GroupImplicitConnection)}
   *   <li>{@link CreateGroup#interactionTransfer(GroupInteractionTransfer)}
   *   <li>{@link CreateGroup#members(List)}
   *   <li>{@link CreateGroup#name(String)}
   *   <li>{@link CreateGroup#ownerId(Long)}
   *   <li>{@link CreateGroup#ownerType(Owner)}
   *   <li>{@link CreateGroup#profile(BaseProfile)}
   *   <li>{@link CreateGroup#referrer(String)}
   *   <li>{@link CreateGroup#setImplicitConnection(GroupImplicitConnection)}
   *   <li>{@link CreateGroup#setInteractionTransfer(GroupInteractionTransfer)}
   *   <li>{@link CreateGroup#setMembers(List)}
   *   <li>{@link CreateGroup#setName(String)}
   *   <li>{@link CreateGroup#setOwnerId(Long)}
   *   <li>{@link CreateGroup#setOwnerType(Owner)}
   *   <li>{@link CreateGroup#setProfile(BaseProfile)}
   *   <li>{@link CreateGroup#setReferrer(String)}
   *   <li>{@link CreateGroup#setSubType(SubTypeEnum)}
   *   <li>{@link CreateGroup#setType(String)}
   *   <li>{@link CreateGroup#setVisibilityRestriction(GroupVisibilityRestriction)}
   *   <li>{@link CreateGroup#subType(SubTypeEnum)}
   *   <li>{@link CreateGroup#type(String)}
   *   <li>{@link CreateGroup#visibilityRestriction(GroupVisibilityRestriction)}
   *   <li>{@link CreateGroup#toString()}
   *   <li>{@link CreateGroup#getImplicitConnection()}
   *   <li>{@link CreateGroup#getInteractionTransfer()}
   *   <li>{@link CreateGroup#getMembers()}
   *   <li>{@link CreateGroup#getName()}
   *   <li>{@link CreateGroup#getOwnerId()}
   *   <li>{@link CreateGroup#getOwnerType()}
   *   <li>{@link CreateGroup#getProfile()}
   *   <li>{@link CreateGroup#getReferrer()}
   *   <li>{@link CreateGroup#getSubType()}
   *   <li>{@link CreateGroup#getType()}
   *   <li>{@link CreateGroup#getVisibilityRestriction()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void CreateGroup.<init>()",
    "GroupImplicitConnection CreateGroup.getImplicitConnection()",
    "GroupInteractionTransfer CreateGroup.getInteractionTransfer()",
    "List CreateGroup.getMembers()",
    "String CreateGroup.getName()",
    "Long CreateGroup.getOwnerId()",
    "Owner CreateGroup.getOwnerType()",
    "BaseProfile CreateGroup.getProfile()",
    "String CreateGroup.getReferrer()",
    "SubTypeEnum CreateGroup.getSubType()",
    "String CreateGroup.getType()",
    "GroupVisibilityRestriction CreateGroup.getVisibilityRestriction()",
    "CreateGroup CreateGroup.implicitConnection(GroupImplicitConnection)",
    "CreateGroup CreateGroup.interactionTransfer(GroupInteractionTransfer)",
    "CreateGroup CreateGroup.members(List)",
    "CreateGroup CreateGroup.name(String)",
    "CreateGroup CreateGroup.ownerId(Long)",
    "CreateGroup CreateGroup.ownerType(Owner)",
    "CreateGroup CreateGroup.profile(BaseProfile)",
    "CreateGroup CreateGroup.referrer(String)",
    "void CreateGroup.setImplicitConnection(GroupImplicitConnection)",
    "void CreateGroup.setInteractionTransfer(GroupInteractionTransfer)",
    "void CreateGroup.setMembers(List)",
    "void CreateGroup.setName(String)",
    "void CreateGroup.setOwnerId(Long)",
    "void CreateGroup.setOwnerType(Owner)",
    "void CreateGroup.setProfile(BaseProfile)",
    "void CreateGroup.setReferrer(String)",
    "void CreateGroup.setSubType(SubTypeEnum)",
    "void CreateGroup.setType(String)",
    "void CreateGroup.setVisibilityRestriction(GroupVisibilityRestriction)",
    "CreateGroup CreateGroup.subType(SubTypeEnum)",
    "String CreateGroup.toString()",
    "CreateGroup CreateGroup.type(String)",
    "CreateGroup CreateGroup.visibilityRestriction(GroupVisibilityRestriction)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    CreateGroup actualCreateGroup = new CreateGroup();
    CreateGroup actualImplicitConnectionResult =
        actualCreateGroup.implicitConnection(new GroupImplicitConnection());
    CreateGroup actualInteractionTransferResult =
        actualCreateGroup.interactionTransfer(new GroupInteractionTransfer());
    CreateGroup actualMembersResult = actualCreateGroup.members(new ArrayList<>());
    CreateGroup actualNameResult = actualCreateGroup.name("Name");
    CreateGroup actualOwnerIdResult = actualCreateGroup.ownerId(1L);
    CreateGroup actualOwnerTypeResult = actualCreateGroup.ownerType(Owner.PLATFORM);
    CreateGroup actualProfileResult = actualCreateGroup.profile(new BaseProfile());
    CreateGroup actualReferrerResult = actualCreateGroup.referrer("Referrer");
    GroupImplicitConnection implicitConnection = new GroupImplicitConnection();
    actualCreateGroup.setImplicitConnection(implicitConnection);
    GroupInteractionTransfer interactionTransfer = new GroupInteractionTransfer();
    actualCreateGroup.setInteractionTransfer(interactionTransfer);
    ArrayList<Member> members = new ArrayList<>();
    actualCreateGroup.setMembers(members);
    actualCreateGroup.setName("Name");
    actualCreateGroup.setOwnerId(1L);
    actualCreateGroup.setOwnerType(Owner.PLATFORM);
    BaseProfile profile = new BaseProfile();
    actualCreateGroup.setProfile(profile);
    actualCreateGroup.setReferrer("Referrer");
    actualCreateGroup.setSubType(SubTypeEnum.COMMUNITY);
    actualCreateGroup.setType("Type");
    actualCreateGroup.setVisibilityRestriction(new GroupVisibilityRestriction());
    CreateGroup actualSubTypeResult = actualCreateGroup.subType(SubTypeEnum.COMMUNITY);
    CreateGroup actualTypeResult = actualCreateGroup.type("Type");
    GroupVisibilityRestriction visibilityRestriction = new GroupVisibilityRestriction();
    CreateGroup actualVisibilityRestrictionResult =
        actualCreateGroup.visibilityRestriction(visibilityRestriction);
    String actualToStringResult = actualCreateGroup.toString();
    GroupImplicitConnection actualImplicitConnection = actualCreateGroup.getImplicitConnection();
    GroupInteractionTransfer actualInteractionTransfer = actualCreateGroup.getInteractionTransfer();
    List<Member> actualMembers = actualCreateGroup.getMembers();
    String actualName = actualCreateGroup.getName();
    Long actualOwnerId = actualCreateGroup.getOwnerId();
    Owner actualOwnerType = actualCreateGroup.getOwnerType();
    BaseProfile actualProfile = actualCreateGroup.getProfile();
    String actualReferrer = actualCreateGroup.getReferrer();
    SubTypeEnum actualSubType = actualCreateGroup.getSubType();
    String actualType = actualCreateGroup.getType();
    GroupVisibilityRestriction actualVisibilityRestriction =
        actualCreateGroup.getVisibilityRestriction();

    // Assert
    assertEquals("Name", actualName);
    assertEquals("Referrer", actualReferrer);
    assertEquals("Type", actualType);
    assertEquals(
        "class CreateGroup {\n"
            + "    type: Type\n"
            + "    ownerType: PLATFORM\n"
            + "    ownerId: 1\n"
            + "    name: Name\n"
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
    assertEquals(1L, actualOwnerId.longValue());
    assertEquals(SubTypeEnum.COMMUNITY, actualSubType);
    assertEquals(Owner.PLATFORM, actualOwnerType);
    assertTrue(actualMembers.isEmpty());
    assertSame(profile, actualProfile);
    assertSame(actualCreateGroup, actualImplicitConnectionResult);
    assertSame(actualCreateGroup, actualInteractionTransferResult);
    assertSame(actualCreateGroup, actualMembersResult);
    assertSame(actualCreateGroup, actualNameResult);
    assertSame(actualCreateGroup, actualOwnerIdResult);
    assertSame(actualCreateGroup, actualOwnerTypeResult);
    assertSame(actualCreateGroup, actualProfileResult);
    assertSame(actualCreateGroup, actualReferrerResult);
    assertSame(actualCreateGroup, actualSubTypeResult);
    assertSame(actualCreateGroup, actualTypeResult);
    assertSame(actualCreateGroup, actualVisibilityRestrictionResult);
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
