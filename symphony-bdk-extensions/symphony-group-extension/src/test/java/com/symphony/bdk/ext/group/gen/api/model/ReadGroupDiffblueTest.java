package com.symphony.bdk.ext.group.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.ext.group.gen.api.model.ReadGroup.SubTypeEnum;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ReadGroupDiffblueTest {
  /**
   * Test {@link ReadGroup#geteTag()}.
   *
   * <p>Method under test: {@link ReadGroup#geteTag()}
   */
  @Test
  @DisplayName("Test geteTag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ReadGroup.geteTag()"})
  void testGeteTag() {
    // Arrange, Act and Assert
    assertNull(new ReadGroup().geteTag());
  }

  /**
   * Test {@link ReadGroup#addMembersItem(ReadMember)}.
   *
   * <ul>
   *   <li>Given {@link ReadGroup} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link ReadGroup#addMembersItem(ReadMember)}
   */
  @Test
  @DisplayName("Test addMembersItem(ReadMember); given ReadGroup (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReadGroup ReadGroup.addMembersItem(ReadMember)"})
  void testAddMembersItem_givenReadGroup() {
    // Arrange
    ReadGroup readGroup = new ReadGroup();

    // Act
    ReadGroup actualAddMembersItemResult = readGroup.addMembersItem(new ReadMember());

    // Assert
    assertSame(readGroup, actualAddMembersItemResult);
  }

  /**
   * Test {@link ReadGroup#addMembersItem(ReadMember)}.
   *
   * <ul>
   *   <li>Given {@link ReadGroup} (default constructor) members {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroup#addMembersItem(ReadMember)}
   */
  @Test
  @DisplayName(
      "Test addMembersItem(ReadMember); given ReadGroup (default constructor) members ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReadGroup ReadGroup.addMembersItem(ReadMember)"})
  void testAddMembersItem_givenReadGroupMembersArrayList() {
    // Arrange
    ReadGroup readGroup = new ReadGroup();
    readGroup.members(new ArrayList<>());

    // Act
    ReadGroup actualAddMembersItemResult = readGroup.addMembersItem(new ReadMember());

    // Assert
    assertSame(readGroup, actualAddMembersItemResult);
  }

  /**
   * Test {@link ReadGroup#equals(Object)}, and {@link ReadGroup#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ReadGroup#equals(Object)}
   *   <li>{@link ReadGroup#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroup.equals(Object)", "int ReadGroup.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ReadGroup readGroup = new ReadGroup();
    ReadGroup readGroup2 = new ReadGroup();

    // Act and Assert
    assertEquals(readGroup, readGroup2);
    assertEquals(readGroup.hashCode(), readGroup2.hashCode());
  }

  /**
   * Test {@link ReadGroup#equals(Object)}, and {@link ReadGroup#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ReadGroup#equals(Object)}
   *   <li>{@link ReadGroup#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroup.equals(Object)", "int ReadGroup.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ReadGroup readGroup = new ReadGroup();

    // Act and Assert
    assertEquals(readGroup, readGroup);
    int expectedHashCodeResult = readGroup.hashCode();
    assertEquals(expectedHashCodeResult, readGroup.hashCode());
  }

  /**
   * Test {@link ReadGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroup.equals(Object)", "int ReadGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ReadGroup readGroup = new ReadGroup();
    readGroup.addMembersItem(new ReadMember());

    // Act and Assert
    assertNotEquals(readGroup, new ReadGroup());
  }

  /**
   * Test {@link ReadGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroup.equals(Object)", "int ReadGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ReadGroup readGroup = new ReadGroup();
    readGroup.type("Type");
    readGroup.addMembersItem(new ReadMember());

    // Act and Assert
    assertNotEquals(readGroup, new ReadGroup());
  }

  /**
   * Test {@link ReadGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroup.equals(Object)", "int ReadGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ReadGroup readGroup = new ReadGroup();
    readGroup.ownerType(Owner.PLATFORM);
    readGroup.addMembersItem(new ReadMember());

    // Act and Assert
    assertNotEquals(readGroup, new ReadGroup());
  }

  /**
   * Test {@link ReadGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroup.equals(Object)", "int ReadGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    ReadGroup readGroup = new ReadGroup();
    readGroup.ownerId(1L);
    readGroup.addMembersItem(new ReadMember());

    // Act and Assert
    assertNotEquals(readGroup, new ReadGroup());
  }

  /**
   * Test {@link ReadGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroup.equals(Object)", "int ReadGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    ReadGroup readGroup = new ReadGroup();
    readGroup.name("Name");
    readGroup.addMembersItem(new ReadMember());

    // Act and Assert
    assertNotEquals(readGroup, new ReadGroup());
  }

  /**
   * Test {@link ReadGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroup.equals(Object)", "int ReadGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    ReadGroup readGroup = new ReadGroup();
    readGroup.id("42");
    readGroup.addMembersItem(new ReadMember());

    // Act and Assert
    assertNotEquals(readGroup, new ReadGroup());
  }

  /**
   * Test {@link ReadGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroup.equals(Object)", "int ReadGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    ReadGroup readGroup = new ReadGroup();
    OffsetDateTime createdDate =
        OffsetDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.MIDNIGHT, ZoneOffset.UTC);
    readGroup.createdDate(createdDate);
    readGroup.addMembersItem(new ReadMember());

    // Act and Assert
    assertNotEquals(readGroup, new ReadGroup());
  }

  /**
   * Test {@link ReadGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroup.equals(Object)", "int ReadGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    ReadGroup readGroup = new ReadGroup();
    readGroup.createdBy("Jan 1, 2020 8:00am GMT+0100");
    readGroup.addMembersItem(new ReadMember());

    // Act and Assert
    assertNotEquals(readGroup, new ReadGroup());
  }

  /**
   * Test {@link ReadGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroup.equals(Object)", "int ReadGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    ReadGroup readGroup = new ReadGroup();
    OffsetDateTime updatedDate =
        OffsetDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.MIDNIGHT, ZoneOffset.UTC);
    readGroup.updatedDate(updatedDate);
    readGroup.addMembersItem(new ReadMember());

    // Act and Assert
    assertNotEquals(readGroup, new ReadGroup());
  }

  /**
   * Test {@link ReadGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroup.equals(Object)", "int ReadGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual10() {
    // Arrange
    ReadGroup readGroup = new ReadGroup();
    readGroup.updatedBy("2020-03-01");
    readGroup.addMembersItem(new ReadMember());

    // Act and Assert
    assertNotEquals(readGroup, new ReadGroup());
  }

  /**
   * Test {@link ReadGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroup.equals(Object)", "int ReadGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual11() {
    // Arrange
    ReadGroup readGroup = new ReadGroup();
    readGroup.status(Status.ACTIVE);
    readGroup.addMembersItem(new ReadMember());

    // Act and Assert
    assertNotEquals(readGroup, new ReadGroup());
  }

  /**
   * Test {@link ReadGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroup.equals(Object)", "int ReadGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual12() {
    // Arrange
    ReadGroup readGroup = new ReadGroup();
    readGroup.eTag("E Tag");
    readGroup.addMembersItem(new ReadMember());

    // Act and Assert
    assertNotEquals(readGroup, new ReadGroup());
  }

  /**
   * Test {@link ReadGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroup.equals(Object)", "int ReadGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual13() {
    // Arrange
    ReadGroup readGroup = new ReadGroup();
    readGroup.subType(SubTypeEnum.COMMUNITY);
    readGroup.addMembersItem(new ReadMember());

    // Act and Assert
    assertNotEquals(readGroup, new ReadGroup());
  }

  /**
   * Test {@link ReadGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroup.equals(Object)", "int ReadGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual14() {
    // Arrange
    ReadGroup readGroup = new ReadGroup();
    readGroup.referrer("Referrer");
    readGroup.addMembersItem(new ReadMember());

    // Act and Assert
    assertNotEquals(readGroup, new ReadGroup());
  }

  /**
   * Test {@link ReadGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroup.equals(Object)", "int ReadGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual15() {
    // Arrange
    ReadGroup readGroup = new ReadGroup();
    readGroup.profile(new Profile());

    // Act and Assert
    assertNotEquals(readGroup, new ReadGroup());
  }

  /**
   * Test {@link ReadGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroup.equals(Object)", "int ReadGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual16() {
    // Arrange
    ReadGroup readGroup = new ReadGroup();
    readGroup.visibilityRestriction(new GroupVisibilityRestriction());

    // Act and Assert
    assertNotEquals(readGroup, new ReadGroup());
  }

  /**
   * Test {@link ReadGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroup.equals(Object)", "int ReadGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual17() {
    // Arrange
    ReadGroup readGroup = new ReadGroup();
    readGroup.implicitConnection(new GroupImplicitConnection());

    // Act and Assert
    assertNotEquals(readGroup, new ReadGroup());
  }

  /**
   * Test {@link ReadGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroup.equals(Object)", "int ReadGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual18() {
    // Arrange
    ReadGroup readGroup = new ReadGroup();
    readGroup.interactionTransfer(new GroupInteractionTransfer());

    // Act and Assert
    assertNotEquals(readGroup, new ReadGroup());
  }

  /**
   * Test {@link ReadGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroup.equals(Object)", "int ReadGroup.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ReadGroup(), null);
  }

  /**
   * Test {@link ReadGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroup.equals(Object)", "int ReadGroup.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ReadGroup(), "Different type to ReadGroup");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link ReadGroup}
   *   <li>{@link ReadGroup#createdBy(String)}
   *   <li>{@link ReadGroup#createdDate(OffsetDateTime)}
   *   <li>{@link ReadGroup#eTag(String)}
   *   <li>{@link ReadGroup#id(String)}
   *   <li>{@link ReadGroup#implicitConnection(GroupImplicitConnection)}
   *   <li>{@link ReadGroup#interactionTransfer(GroupInteractionTransfer)}
   *   <li>{@link ReadGroup#members(List)}
   *   <li>{@link ReadGroup#name(String)}
   *   <li>{@link ReadGroup#ownerId(Long)}
   *   <li>{@link ReadGroup#ownerType(Owner)}
   *   <li>{@link ReadGroup#profile(Profile)}
   *   <li>{@link ReadGroup#referrer(String)}
   *   <li>{@link ReadGroup#setCreatedBy(String)}
   *   <li>{@link ReadGroup#setCreatedDate(OffsetDateTime)}
   *   <li>{@link ReadGroup#setId(String)}
   *   <li>{@link ReadGroup#setImplicitConnection(GroupImplicitConnection)}
   *   <li>{@link ReadGroup#setInteractionTransfer(GroupInteractionTransfer)}
   *   <li>{@link ReadGroup#setMembers(List)}
   *   <li>{@link ReadGroup#setName(String)}
   *   <li>{@link ReadGroup#setOwnerId(Long)}
   *   <li>{@link ReadGroup#setOwnerType(Owner)}
   *   <li>{@link ReadGroup#setProfile(Profile)}
   *   <li>{@link ReadGroup#setReferrer(String)}
   *   <li>{@link ReadGroup#setStatus(Status)}
   *   <li>{@link ReadGroup#setSubType(SubTypeEnum)}
   *   <li>{@link ReadGroup#setType(String)}
   *   <li>{@link ReadGroup#setUpdatedBy(String)}
   *   <li>{@link ReadGroup#setUpdatedDate(OffsetDateTime)}
   *   <li>{@link ReadGroup#setVisibilityRestriction(GroupVisibilityRestriction)}
   *   <li>{@link ReadGroup#seteTag(String)}
   *   <li>{@link ReadGroup#status(Status)}
   *   <li>{@link ReadGroup#subType(SubTypeEnum)}
   *   <li>{@link ReadGroup#type(String)}
   *   <li>{@link ReadGroup#updatedBy(String)}
   *   <li>{@link ReadGroup#updatedDate(OffsetDateTime)}
   *   <li>{@link ReadGroup#visibilityRestriction(GroupVisibilityRestriction)}
   *   <li>{@link ReadGroup#toString()}
   *   <li>{@link ReadGroup#getCreatedBy()}
   *   <li>{@link ReadGroup#getCreatedDate()}
   *   <li>{@link ReadGroup#getId()}
   *   <li>{@link ReadGroup#getImplicitConnection()}
   *   <li>{@link ReadGroup#getInteractionTransfer()}
   *   <li>{@link ReadGroup#getMembers()}
   *   <li>{@link ReadGroup#getName()}
   *   <li>{@link ReadGroup#getOwnerId()}
   *   <li>{@link ReadGroup#getOwnerType()}
   *   <li>{@link ReadGroup#getProfile()}
   *   <li>{@link ReadGroup#getReferrer()}
   *   <li>{@link ReadGroup#getStatus()}
   *   <li>{@link ReadGroup#getSubType()}
   *   <li>{@link ReadGroup#getType()}
   *   <li>{@link ReadGroup#getUpdatedBy()}
   *   <li>{@link ReadGroup#getUpdatedDate()}
   *   <li>{@link ReadGroup#getVisibilityRestriction()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ReadGroup.<init>()",
    "ReadGroup ReadGroup.createdBy(String)",
    "ReadGroup ReadGroup.createdDate(OffsetDateTime)",
    "ReadGroup ReadGroup.eTag(String)",
    "String ReadGroup.getCreatedBy()",
    "OffsetDateTime ReadGroup.getCreatedDate()",
    "String ReadGroup.getId()",
    "GroupImplicitConnection ReadGroup.getImplicitConnection()",
    "GroupInteractionTransfer ReadGroup.getInteractionTransfer()",
    "List ReadGroup.getMembers()",
    "String ReadGroup.getName()",
    "Long ReadGroup.getOwnerId()",
    "Owner ReadGroup.getOwnerType()",
    "Profile ReadGroup.getProfile()",
    "String ReadGroup.getReferrer()",
    "Status ReadGroup.getStatus()",
    "SubTypeEnum ReadGroup.getSubType()",
    "String ReadGroup.getType()",
    "String ReadGroup.getUpdatedBy()",
    "OffsetDateTime ReadGroup.getUpdatedDate()",
    "GroupVisibilityRestriction ReadGroup.getVisibilityRestriction()",
    "ReadGroup ReadGroup.id(String)",
    "ReadGroup ReadGroup.implicitConnection(GroupImplicitConnection)",
    "ReadGroup ReadGroup.interactionTransfer(GroupInteractionTransfer)",
    "ReadGroup ReadGroup.members(List)",
    "ReadGroup ReadGroup.name(String)",
    "ReadGroup ReadGroup.ownerId(Long)",
    "ReadGroup ReadGroup.ownerType(Owner)",
    "ReadGroup ReadGroup.profile(Profile)",
    "ReadGroup ReadGroup.referrer(String)",
    "void ReadGroup.setCreatedBy(String)",
    "void ReadGroup.setCreatedDate(OffsetDateTime)",
    "void ReadGroup.setId(String)",
    "void ReadGroup.setImplicitConnection(GroupImplicitConnection)",
    "void ReadGroup.setInteractionTransfer(GroupInteractionTransfer)",
    "void ReadGroup.setMembers(List)",
    "void ReadGroup.setName(String)",
    "void ReadGroup.setOwnerId(Long)",
    "void ReadGroup.setOwnerType(Owner)",
    "void ReadGroup.setProfile(Profile)",
    "void ReadGroup.setReferrer(String)",
    "void ReadGroup.setStatus(Status)",
    "void ReadGroup.setSubType(SubTypeEnum)",
    "void ReadGroup.setType(String)",
    "void ReadGroup.setUpdatedBy(String)",
    "void ReadGroup.setUpdatedDate(OffsetDateTime)",
    "void ReadGroup.setVisibilityRestriction(GroupVisibilityRestriction)",
    "void ReadGroup.seteTag(String)",
    "ReadGroup ReadGroup.status(Status)",
    "ReadGroup ReadGroup.subType(SubTypeEnum)",
    "String ReadGroup.toString()",
    "ReadGroup ReadGroup.type(String)",
    "ReadGroup ReadGroup.updatedBy(String)",
    "ReadGroup ReadGroup.updatedDate(OffsetDateTime)",
    "ReadGroup ReadGroup.visibilityRestriction(GroupVisibilityRestriction)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    ReadGroup actualReadGroup = new ReadGroup();
    ReadGroup actualCreatedByResult = actualReadGroup.createdBy("Jan 1, 2020 8:00am GMT+0100");
    OffsetDateTime createdDate =
        OffsetDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.MIDNIGHT, ZoneOffset.UTC);
    ReadGroup actualCreatedDateResult = actualReadGroup.createdDate(createdDate);
    ReadGroup actualETagResult = actualReadGroup.eTag("E Tag");
    ReadGroup actualIdResult = actualReadGroup.id("42");
    ReadGroup actualImplicitConnectionResult =
        actualReadGroup.implicitConnection(new GroupImplicitConnection());
    ReadGroup actualInteractionTransferResult =
        actualReadGroup.interactionTransfer(new GroupInteractionTransfer());
    ReadGroup actualMembersResult = actualReadGroup.members(new ArrayList<>());
    ReadGroup actualNameResult = actualReadGroup.name("Name");
    ReadGroup actualOwnerIdResult = actualReadGroup.ownerId(1L);
    ReadGroup actualOwnerTypeResult = actualReadGroup.ownerType(Owner.PLATFORM);
    ReadGroup actualProfileResult = actualReadGroup.profile(new Profile());
    ReadGroup actualReferrerResult = actualReadGroup.referrer("Referrer");
    actualReadGroup.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
    OffsetDateTime createdDate2 =
        OffsetDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.MIDNIGHT, ZoneOffset.UTC);
    actualReadGroup.setCreatedDate(createdDate2);
    actualReadGroup.setId("42");
    GroupImplicitConnection implicitConnection = new GroupImplicitConnection();
    actualReadGroup.setImplicitConnection(implicitConnection);
    GroupInteractionTransfer interactionTransfer = new GroupInteractionTransfer();
    actualReadGroup.setInteractionTransfer(interactionTransfer);
    ArrayList<ReadMember> members = new ArrayList<>();
    actualReadGroup.setMembers(members);
    actualReadGroup.setName("Name");
    actualReadGroup.setOwnerId(1L);
    actualReadGroup.setOwnerType(Owner.PLATFORM);
    Profile profile = new Profile();
    actualReadGroup.setProfile(profile);
    actualReadGroup.setReferrer("Referrer");
    actualReadGroup.setStatus(Status.ACTIVE);
    actualReadGroup.setSubType(SubTypeEnum.COMMUNITY);
    actualReadGroup.setType("Type");
    actualReadGroup.setUpdatedBy("2020-03-01");
    OffsetDateTime updatedDate =
        OffsetDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.MIDNIGHT, ZoneOffset.UTC);
    actualReadGroup.setUpdatedDate(updatedDate);
    actualReadGroup.setVisibilityRestriction(new GroupVisibilityRestriction());
    actualReadGroup.seteTag("E Tag");
    ReadGroup actualStatusResult = actualReadGroup.status(Status.ACTIVE);
    ReadGroup actualSubTypeResult = actualReadGroup.subType(SubTypeEnum.COMMUNITY);
    ReadGroup actualTypeResult = actualReadGroup.type("Type");
    ReadGroup actualUpdatedByResult = actualReadGroup.updatedBy("2020-03-01");
    OffsetDateTime updatedDate2 =
        OffsetDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.MIDNIGHT, ZoneOffset.UTC);
    ReadGroup actualUpdatedDateResult = actualReadGroup.updatedDate(updatedDate2);
    GroupVisibilityRestriction visibilityRestriction = new GroupVisibilityRestriction();
    ReadGroup actualVisibilityRestrictionResult =
        actualReadGroup.visibilityRestriction(visibilityRestriction);
    String actualToStringResult = actualReadGroup.toString();
    String actualCreatedBy = actualReadGroup.getCreatedBy();
    OffsetDateTime actualCreatedDate = actualReadGroup.getCreatedDate();
    String actualId = actualReadGroup.getId();
    GroupImplicitConnection actualImplicitConnection = actualReadGroup.getImplicitConnection();
    GroupInteractionTransfer actualInteractionTransfer = actualReadGroup.getInteractionTransfer();
    List<ReadMember> actualMembers = actualReadGroup.getMembers();
    String actualName = actualReadGroup.getName();
    Long actualOwnerId = actualReadGroup.getOwnerId();
    Owner actualOwnerType = actualReadGroup.getOwnerType();
    Profile actualProfile = actualReadGroup.getProfile();
    String actualReferrer = actualReadGroup.getReferrer();
    Status actualStatus = actualReadGroup.getStatus();
    SubTypeEnum actualSubType = actualReadGroup.getSubType();
    String actualType = actualReadGroup.getType();
    String actualUpdatedBy = actualReadGroup.getUpdatedBy();
    OffsetDateTime actualUpdatedDate = actualReadGroup.getUpdatedDate();
    GroupVisibilityRestriction actualVisibilityRestriction =
        actualReadGroup.getVisibilityRestriction();

    // Assert
    assertEquals("2020-03-01", actualUpdatedBy);
    assertEquals("42", actualId);
    assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
    assertEquals("Name", actualName);
    assertEquals("Referrer", actualReferrer);
    assertEquals("Type", actualType);
    assertEquals(
        "class ReadGroup {\n"
            + "    type: Type\n"
            + "    ownerType: PLATFORM\n"
            + "    ownerId: 1\n"
            + "    name: Name\n"
            + "    id: 42\n"
            + "    createdDate: 1970-01-01T00:00Z\n"
            + "    createdBy: Jan 1, 2020 8:00am GMT+0100\n"
            + "    updatedDate: 1970-01-01T00:00Z\n"
            + "    updatedBy: 2020-03-01\n"
            + "    status: ACTIVE\n"
            + "    eTag: E Tag\n"
            + "    subType: COMMUNITY\n"
            + "    referrer: Referrer\n"
            + "    members: []\n"
            + "    profile: class Profile {\n"
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
            + "        id: null\n"
            + "        avatars: null\n"
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
    assertEquals(Owner.PLATFORM, actualOwnerType);
    assertEquals(SubTypeEnum.COMMUNITY, actualSubType);
    assertEquals(Status.ACTIVE, actualStatus);
    assertTrue(actualMembers.isEmpty());
    assertSame(implicitConnection, actualImplicitConnection);
    assertSame(interactionTransfer, actualInteractionTransfer);
    assertSame(visibilityRestriction, actualVisibilityRestriction);
    assertSame(profile, actualProfile);
    assertSame(actualReadGroup, actualCreatedByResult);
    assertSame(actualReadGroup, actualCreatedDateResult);
    assertSame(actualReadGroup, actualETagResult);
    assertSame(actualReadGroup, actualIdResult);
    assertSame(actualReadGroup, actualImplicitConnectionResult);
    assertSame(actualReadGroup, actualInteractionTransferResult);
    assertSame(actualReadGroup, actualMembersResult);
    assertSame(actualReadGroup, actualNameResult);
    assertSame(actualReadGroup, actualOwnerIdResult);
    assertSame(actualReadGroup, actualOwnerTypeResult);
    assertSame(actualReadGroup, actualProfileResult);
    assertSame(actualReadGroup, actualReferrerResult);
    assertSame(actualReadGroup, actualStatusResult);
    assertSame(actualReadGroup, actualSubTypeResult);
    assertSame(actualReadGroup, actualTypeResult);
    assertSame(actualReadGroup, actualUpdatedByResult);
    assertSame(actualReadGroup, actualUpdatedDateResult);
    assertSame(actualReadGroup, actualVisibilityRestrictionResult);
    assertSame(members, actualMembers);
    assertSame(createdDate2, actualCreatedDate);
    assertSame(updatedDate2, actualUpdatedDate);
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
