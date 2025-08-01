package com.symphony.bdk.ext.group.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.ext.group.gen.api.model.UpdateGroup.SubTypeEnum;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UpdateGroupDiffblueTest {
  /**
   * Test {@link UpdateGroup#addMembersItem(Member)}.
   *
   * <ul>
   *   <li>Given {@link UpdateGroup} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link UpdateGroup#addMembersItem(Member)}
   */
  @Test
  @DisplayName("Test addMembersItem(Member); given UpdateGroup (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UpdateGroup UpdateGroup.addMembersItem(Member)"})
  void testAddMembersItem_givenUpdateGroup() {
    // Arrange
    UpdateGroup updateGroup = new UpdateGroup();

    // Act and Assert
    assertSame(updateGroup, updateGroup.addMembersItem(new Member()));
  }

  /**
   * Test {@link UpdateGroup#addMembersItem(Member)}.
   *
   * <ul>
   *   <li>Given {@link UpdateGroup} (default constructor) members {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link UpdateGroup#addMembersItem(Member)}
   */
  @Test
  @DisplayName(
      "Test addMembersItem(Member); given UpdateGroup (default constructor) members ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UpdateGroup UpdateGroup.addMembersItem(Member)"})
  void testAddMembersItem_givenUpdateGroupMembersArrayList() {
    // Arrange
    UpdateGroup updateGroup = new UpdateGroup();
    updateGroup.members(new ArrayList<>());

    // Act and Assert
    assertSame(updateGroup, updateGroup.addMembersItem(new Member()));
  }

  /**
   * Test {@link UpdateGroup#geteTag()}.
   *
   * <p>Method under test: {@link UpdateGroup#geteTag()}
   */
  @Test
  @DisplayName("Test geteTag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String UpdateGroup.geteTag()"})
  void testGeteTag() {
    // Arrange, Act and Assert
    assertNull(new UpdateGroup().geteTag());
  }

  /**
   * Test {@link UpdateGroup#equals(Object)}, and {@link UpdateGroup#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UpdateGroup#equals(Object)}
   *   <li>{@link UpdateGroup#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UpdateGroup.equals(Object)", "int UpdateGroup.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UpdateGroup updateGroup = new UpdateGroup();
    UpdateGroup updateGroup2 = new UpdateGroup();

    // Act and Assert
    assertEquals(updateGroup, updateGroup2);
    int expectedHashCodeResult = updateGroup.hashCode();
    assertEquals(expectedHashCodeResult, updateGroup2.hashCode());
  }

  /**
   * Test {@link UpdateGroup#equals(Object)}, and {@link UpdateGroup#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UpdateGroup#equals(Object)}
   *   <li>{@link UpdateGroup#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UpdateGroup.equals(Object)", "int UpdateGroup.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UpdateGroup updateGroup = new UpdateGroup();

    // Act and Assert
    assertEquals(updateGroup, updateGroup);
    int expectedHashCodeResult = updateGroup.hashCode();
    assertEquals(expectedHashCodeResult, updateGroup.hashCode());
  }

  /**
   * Test {@link UpdateGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UpdateGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UpdateGroup.equals(Object)", "int UpdateGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    UpdateGroup updateGroup = new UpdateGroup();
    updateGroup.addMembersItem(new Member());

    // Act and Assert
    assertNotEquals(updateGroup, new UpdateGroup());
  }

  /**
   * Test {@link UpdateGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UpdateGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UpdateGroup.equals(Object)", "int UpdateGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UpdateGroup updateGroup = new UpdateGroup();
    updateGroup.type("Type");
    updateGroup.addMembersItem(new Member());

    // Act and Assert
    assertNotEquals(updateGroup, new UpdateGroup());
  }

  /**
   * Test {@link UpdateGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UpdateGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UpdateGroup.equals(Object)", "int UpdateGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UpdateGroup updateGroup = new UpdateGroup();
    updateGroup.ownerType(Owner.PLATFORM);
    updateGroup.addMembersItem(new Member());

    // Act and Assert
    assertNotEquals(updateGroup, new UpdateGroup());
  }

  /**
   * Test {@link UpdateGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UpdateGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UpdateGroup.equals(Object)", "int UpdateGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    UpdateGroup updateGroup = new UpdateGroup();
    updateGroup.ownerId(1L);
    updateGroup.addMembersItem(new Member());

    // Act and Assert
    assertNotEquals(updateGroup, new UpdateGroup());
  }

  /**
   * Test {@link UpdateGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UpdateGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UpdateGroup.equals(Object)", "int UpdateGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    UpdateGroup updateGroup = new UpdateGroup();
    updateGroup.name("Name");
    updateGroup.addMembersItem(new Member());

    // Act and Assert
    assertNotEquals(updateGroup, new UpdateGroup());
  }

  /**
   * Test {@link UpdateGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UpdateGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UpdateGroup.equals(Object)", "int UpdateGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    UpdateGroup updateGroup = new UpdateGroup();
    updateGroup.subType(SubTypeEnum.COMMUNITY);
    updateGroup.addMembersItem(new Member());

    // Act and Assert
    assertNotEquals(updateGroup, new UpdateGroup());
  }

  /**
   * Test {@link UpdateGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UpdateGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UpdateGroup.equals(Object)", "int UpdateGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    UpdateGroup updateGroup = new UpdateGroup();
    updateGroup.referrer("Referrer");
    updateGroup.addMembersItem(new Member());

    // Act and Assert
    assertNotEquals(updateGroup, new UpdateGroup());
  }

  /**
   * Test {@link UpdateGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UpdateGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UpdateGroup.equals(Object)", "int UpdateGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    UpdateGroup updateGroup = new UpdateGroup();
    updateGroup.profile(new BaseProfile());

    // Act and Assert
    assertNotEquals(updateGroup, new UpdateGroup());
  }

  /**
   * Test {@link UpdateGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UpdateGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UpdateGroup.equals(Object)", "int UpdateGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    UpdateGroup updateGroup = new UpdateGroup();
    updateGroup.visibilityRestriction(new GroupVisibilityRestriction());

    // Act and Assert
    assertNotEquals(updateGroup, new UpdateGroup());
  }

  /**
   * Test {@link UpdateGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UpdateGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UpdateGroup.equals(Object)", "int UpdateGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual10() {
    // Arrange
    UpdateGroup updateGroup = new UpdateGroup();
    updateGroup.implicitConnection(new GroupImplicitConnection());

    // Act and Assert
    assertNotEquals(updateGroup, new UpdateGroup());
  }

  /**
   * Test {@link UpdateGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UpdateGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UpdateGroup.equals(Object)", "int UpdateGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual11() {
    // Arrange
    UpdateGroup updateGroup = new UpdateGroup();
    updateGroup.interactionTransfer(new GroupInteractionTransfer());

    // Act and Assert
    assertNotEquals(updateGroup, new UpdateGroup());
  }

  /**
   * Test {@link UpdateGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UpdateGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UpdateGroup.equals(Object)", "int UpdateGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual12() {
    // Arrange
    UpdateGroup updateGroup = new UpdateGroup();
    updateGroup.id("42");

    // Act and Assert
    assertNotEquals(updateGroup, new UpdateGroup());
  }

  /**
   * Test {@link UpdateGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UpdateGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UpdateGroup.equals(Object)", "int UpdateGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual13() {
    // Arrange
    UpdateGroup updateGroup = new UpdateGroup();
    updateGroup.status(Status.ACTIVE);

    // Act and Assert
    assertNotEquals(updateGroup, new UpdateGroup());
  }

  /**
   * Test {@link UpdateGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UpdateGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UpdateGroup.equals(Object)", "int UpdateGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual14() {
    // Arrange
    UpdateGroup updateGroup = new UpdateGroup();
    updateGroup.eTag("E Tag");

    // Act and Assert
    assertNotEquals(updateGroup, new UpdateGroup());
  }

  /**
   * Test {@link UpdateGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UpdateGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UpdateGroup.equals(Object)", "int UpdateGroup.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UpdateGroup(), null);
  }

  /**
   * Test {@link UpdateGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UpdateGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UpdateGroup.equals(Object)", "int UpdateGroup.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UpdateGroup(), "Different type to UpdateGroup");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UpdateGroup}
   *   <li>{@link UpdateGroup#eTag(String)}
   *   <li>{@link UpdateGroup#id(String)}
   *   <li>{@link UpdateGroup#implicitConnection(GroupImplicitConnection)}
   *   <li>{@link UpdateGroup#interactionTransfer(GroupInteractionTransfer)}
   *   <li>{@link UpdateGroup#members(List)}
   *   <li>{@link UpdateGroup#name(String)}
   *   <li>{@link UpdateGroup#ownerId(Long)}
   *   <li>{@link UpdateGroup#ownerType(Owner)}
   *   <li>{@link UpdateGroup#profile(BaseProfile)}
   *   <li>{@link UpdateGroup#referrer(String)}
   *   <li>{@link UpdateGroup#setId(String)}
   *   <li>{@link UpdateGroup#setImplicitConnection(GroupImplicitConnection)}
   *   <li>{@link UpdateGroup#setInteractionTransfer(GroupInteractionTransfer)}
   *   <li>{@link UpdateGroup#setMembers(List)}
   *   <li>{@link UpdateGroup#setName(String)}
   *   <li>{@link UpdateGroup#setOwnerId(Long)}
   *   <li>{@link UpdateGroup#setOwnerType(Owner)}
   *   <li>{@link UpdateGroup#setProfile(BaseProfile)}
   *   <li>{@link UpdateGroup#setReferrer(String)}
   *   <li>{@link UpdateGroup#setStatus(Status)}
   *   <li>{@link UpdateGroup#setSubType(SubTypeEnum)}
   *   <li>{@link UpdateGroup#setType(String)}
   *   <li>{@link UpdateGroup#setVisibilityRestriction(GroupVisibilityRestriction)}
   *   <li>{@link UpdateGroup#seteTag(String)}
   *   <li>{@link UpdateGroup#status(Status)}
   *   <li>{@link UpdateGroup#subType(SubTypeEnum)}
   *   <li>{@link UpdateGroup#type(String)}
   *   <li>{@link UpdateGroup#visibilityRestriction(GroupVisibilityRestriction)}
   *   <li>{@link UpdateGroup#toString()}
   *   <li>{@link UpdateGroup#getId()}
   *   <li>{@link UpdateGroup#getImplicitConnection()}
   *   <li>{@link UpdateGroup#getInteractionTransfer()}
   *   <li>{@link UpdateGroup#getMembers()}
   *   <li>{@link UpdateGroup#getName()}
   *   <li>{@link UpdateGroup#getOwnerId()}
   *   <li>{@link UpdateGroup#getOwnerType()}
   *   <li>{@link UpdateGroup#getProfile()}
   *   <li>{@link UpdateGroup#getReferrer()}
   *   <li>{@link UpdateGroup#getStatus()}
   *   <li>{@link UpdateGroup#getSubType()}
   *   <li>{@link UpdateGroup#getType()}
   *   <li>{@link UpdateGroup#getVisibilityRestriction()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UpdateGroup.<init>()",
    "UpdateGroup UpdateGroup.eTag(String)",
    "String UpdateGroup.getId()",
    "GroupImplicitConnection UpdateGroup.getImplicitConnection()",
    "GroupInteractionTransfer UpdateGroup.getInteractionTransfer()",
    "List UpdateGroup.getMembers()",
    "String UpdateGroup.getName()",
    "Long UpdateGroup.getOwnerId()",
    "Owner UpdateGroup.getOwnerType()",
    "BaseProfile UpdateGroup.getProfile()",
    "String UpdateGroup.getReferrer()",
    "Status UpdateGroup.getStatus()",
    "SubTypeEnum UpdateGroup.getSubType()",
    "String UpdateGroup.getType()",
    "GroupVisibilityRestriction UpdateGroup.getVisibilityRestriction()",
    "UpdateGroup UpdateGroup.id(String)",
    "UpdateGroup UpdateGroup.implicitConnection(GroupImplicitConnection)",
    "UpdateGroup UpdateGroup.interactionTransfer(GroupInteractionTransfer)",
    "UpdateGroup UpdateGroup.members(List)",
    "UpdateGroup UpdateGroup.name(String)",
    "UpdateGroup UpdateGroup.ownerId(Long)",
    "UpdateGroup UpdateGroup.ownerType(Owner)",
    "UpdateGroup UpdateGroup.profile(BaseProfile)",
    "UpdateGroup UpdateGroup.referrer(String)",
    "void UpdateGroup.setId(String)",
    "void UpdateGroup.setImplicitConnection(GroupImplicitConnection)",
    "void UpdateGroup.setInteractionTransfer(GroupInteractionTransfer)",
    "void UpdateGroup.setMembers(List)",
    "void UpdateGroup.setName(String)",
    "void UpdateGroup.setOwnerId(Long)",
    "void UpdateGroup.setOwnerType(Owner)",
    "void UpdateGroup.setProfile(BaseProfile)",
    "void UpdateGroup.setReferrer(String)",
    "void UpdateGroup.setStatus(Status)",
    "void UpdateGroup.setSubType(SubTypeEnum)",
    "void UpdateGroup.setType(String)",
    "void UpdateGroup.setVisibilityRestriction(GroupVisibilityRestriction)",
    "void UpdateGroup.seteTag(String)",
    "UpdateGroup UpdateGroup.status(Status)",
    "UpdateGroup UpdateGroup.subType(SubTypeEnum)",
    "String UpdateGroup.toString()",
    "UpdateGroup UpdateGroup.type(String)",
    "UpdateGroup UpdateGroup.visibilityRestriction(GroupVisibilityRestriction)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    UpdateGroup actualUpdateGroup = new UpdateGroup();
    UpdateGroup actualETagResult = actualUpdateGroup.eTag("E Tag");
    UpdateGroup actualIdResult = actualUpdateGroup.id("42");
    UpdateGroup actualImplicitConnectionResult =
        actualUpdateGroup.implicitConnection(new GroupImplicitConnection());
    UpdateGroup actualInteractionTransferResult =
        actualUpdateGroup.interactionTransfer(new GroupInteractionTransfer());
    UpdateGroup actualMembersResult = actualUpdateGroup.members(new ArrayList<>());
    UpdateGroup actualNameResult = actualUpdateGroup.name("Name");
    UpdateGroup actualOwnerIdResult = actualUpdateGroup.ownerId(1L);
    UpdateGroup actualOwnerTypeResult = actualUpdateGroup.ownerType(Owner.PLATFORM);
    UpdateGroup actualProfileResult = actualUpdateGroup.profile(new BaseProfile());
    UpdateGroup actualReferrerResult = actualUpdateGroup.referrer("Referrer");
    actualUpdateGroup.setId("42");
    GroupImplicitConnection implicitConnection = new GroupImplicitConnection();
    actualUpdateGroup.setImplicitConnection(implicitConnection);
    GroupInteractionTransfer interactionTransfer = new GroupInteractionTransfer();
    actualUpdateGroup.setInteractionTransfer(interactionTransfer);
    ArrayList<Member> members = new ArrayList<>();
    actualUpdateGroup.setMembers(members);
    actualUpdateGroup.setName("Name");
    actualUpdateGroup.setOwnerId(1L);
    actualUpdateGroup.setOwnerType(Owner.PLATFORM);
    BaseProfile profile = new BaseProfile();
    actualUpdateGroup.setProfile(profile);
    actualUpdateGroup.setReferrer("Referrer");
    actualUpdateGroup.setStatus(Status.ACTIVE);
    actualUpdateGroup.setSubType(SubTypeEnum.COMMUNITY);
    actualUpdateGroup.setType("Type");
    actualUpdateGroup.setVisibilityRestriction(new GroupVisibilityRestriction());
    actualUpdateGroup.seteTag("E Tag");
    UpdateGroup actualStatusResult = actualUpdateGroup.status(Status.ACTIVE);
    UpdateGroup actualSubTypeResult = actualUpdateGroup.subType(SubTypeEnum.COMMUNITY);
    UpdateGroup actualTypeResult = actualUpdateGroup.type("Type");
    GroupVisibilityRestriction visibilityRestriction = new GroupVisibilityRestriction();
    UpdateGroup actualVisibilityRestrictionResult =
        actualUpdateGroup.visibilityRestriction(visibilityRestriction);
    String actualToStringResult = actualUpdateGroup.toString();
    String actualId = actualUpdateGroup.getId();
    GroupImplicitConnection actualImplicitConnection = actualUpdateGroup.getImplicitConnection();
    GroupInteractionTransfer actualInteractionTransfer = actualUpdateGroup.getInteractionTransfer();
    List<Member> actualMembers = actualUpdateGroup.getMembers();
    String actualName = actualUpdateGroup.getName();
    Long actualOwnerId = actualUpdateGroup.getOwnerId();
    Owner actualOwnerType = actualUpdateGroup.getOwnerType();
    BaseProfile actualProfile = actualUpdateGroup.getProfile();
    String actualReferrer = actualUpdateGroup.getReferrer();
    Status actualStatus = actualUpdateGroup.getStatus();
    SubTypeEnum actualSubType = actualUpdateGroup.getSubType();
    String actualType = actualUpdateGroup.getType();
    GroupVisibilityRestriction actualVisibilityRestriction =
        actualUpdateGroup.getVisibilityRestriction();

    // Assert
    assertEquals("42", actualId);
    assertEquals("Name", actualName);
    assertEquals("Referrer", actualReferrer);
    assertEquals("Type", actualType);
    assertEquals(
        "class UpdateGroup {\n"
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
            + "    id: 42\n"
            + "    status: ACTIVE\n"
            + "    eTag: E Tag\n"
            + "}",
        actualToStringResult);
    assertEquals(1L, actualOwnerId.longValue());
    assertEquals(Owner.PLATFORM, actualOwnerType);
    assertEquals(Status.ACTIVE, actualStatus);
    assertEquals(SubTypeEnum.COMMUNITY, actualSubType);
    assertTrue(actualMembers.isEmpty());
    assertSame(profile, actualProfile);
    assertSame(implicitConnection, actualImplicitConnection);
    assertSame(interactionTransfer, actualInteractionTransfer);
    assertSame(visibilityRestriction, actualVisibilityRestriction);
    assertSame(actualUpdateGroup, actualETagResult);
    assertSame(actualUpdateGroup, actualIdResult);
    assertSame(actualUpdateGroup, actualImplicitConnectionResult);
    assertSame(actualUpdateGroup, actualInteractionTransferResult);
    assertSame(actualUpdateGroup, actualMembersResult);
    assertSame(actualUpdateGroup, actualNameResult);
    assertSame(actualUpdateGroup, actualOwnerIdResult);
    assertSame(actualUpdateGroup, actualOwnerTypeResult);
    assertSame(actualUpdateGroup, actualProfileResult);
    assertSame(actualUpdateGroup, actualReferrerResult);
    assertSame(actualUpdateGroup, actualStatusResult);
    assertSame(actualUpdateGroup, actualSubTypeResult);
    assertSame(actualUpdateGroup, actualTypeResult);
    assertSame(actualUpdateGroup, actualVisibilityRestrictionResult);
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
