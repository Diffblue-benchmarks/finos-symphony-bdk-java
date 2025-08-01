package com.symphony.bdk.ext.group.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.ext.group.gen.api.model.ReadGroupAllOf.SubTypeEnum;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ReadGroupAllOfDiffblueTest {
  /**
   * Test {@link ReadGroupAllOf#geteTag()}.
   *
   * <p>Method under test: {@link ReadGroupAllOf#geteTag()}
   */
  @Test
  @DisplayName("Test geteTag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ReadGroupAllOf.geteTag()"})
  void testGeteTag() {
    // Arrange, Act and Assert
    assertNull(new ReadGroupAllOf().geteTag());
  }

  /**
   * Test {@link ReadGroupAllOf#addMembersItem(ReadMember)}.
   *
   * <ul>
   *   <li>Given {@link ReadGroupAllOf} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link ReadGroupAllOf#addMembersItem(ReadMember)}
   */
  @Test
  @DisplayName("Test addMembersItem(ReadMember); given ReadGroupAllOf (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReadGroupAllOf ReadGroupAllOf.addMembersItem(ReadMember)"})
  void testAddMembersItem_givenReadGroupAllOf() {
    // Arrange
    ReadGroupAllOf readGroupAllOf = new ReadGroupAllOf();

    // Act and Assert
    assertSame(readGroupAllOf, readGroupAllOf.addMembersItem(new ReadMember()));
  }

  /**
   * Test {@link ReadGroupAllOf#addMembersItem(ReadMember)}.
   *
   * <ul>
   *   <li>Given {@link ReadGroupAllOf} (default constructor) members {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroupAllOf#addMembersItem(ReadMember)}
   */
  @Test
  @DisplayName(
      "Test addMembersItem(ReadMember); given ReadGroupAllOf (default constructor) members ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReadGroupAllOf ReadGroupAllOf.addMembersItem(ReadMember)"})
  void testAddMembersItem_givenReadGroupAllOfMembersArrayList() {
    // Arrange
    ReadGroupAllOf readGroupAllOf = new ReadGroupAllOf();
    readGroupAllOf.members(new ArrayList<>());

    // Act and Assert
    assertSame(readGroupAllOf, readGroupAllOf.addMembersItem(new ReadMember()));
  }

  /**
   * Test {@link ReadGroupAllOf#equals(Object)}, and {@link ReadGroupAllOf#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ReadGroupAllOf#equals(Object)}
   *   <li>{@link ReadGroupAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroupAllOf.equals(Object)", "int ReadGroupAllOf.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ReadGroupAllOf readGroupAllOf = new ReadGroupAllOf();
    ReadGroupAllOf readGroupAllOf2 = new ReadGroupAllOf();

    // Act and Assert
    assertEquals(readGroupAllOf, readGroupAllOf2);
    int expectedHashCodeResult = readGroupAllOf.hashCode();
    assertEquals(expectedHashCodeResult, readGroupAllOf2.hashCode());
  }

  /**
   * Test {@link ReadGroupAllOf#equals(Object)}, and {@link ReadGroupAllOf#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ReadGroupAllOf#equals(Object)}
   *   <li>{@link ReadGroupAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroupAllOf.equals(Object)", "int ReadGroupAllOf.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ReadGroupAllOf readGroupAllOf = new ReadGroupAllOf();

    // Act and Assert
    assertEquals(readGroupAllOf, readGroupAllOf);
    int expectedHashCodeResult = readGroupAllOf.hashCode();
    assertEquals(expectedHashCodeResult, readGroupAllOf.hashCode());
  }

  /**
   * Test {@link ReadGroupAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroupAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroupAllOf.equals(Object)", "int ReadGroupAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ReadGroupAllOf readGroupAllOf = new ReadGroupAllOf();
    readGroupAllOf.addMembersItem(new ReadMember());

    // Act and Assert
    assertNotEquals(readGroupAllOf, new ReadGroupAllOf());
  }

  /**
   * Test {@link ReadGroupAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroupAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroupAllOf.equals(Object)", "int ReadGroupAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ReadGroupAllOf readGroupAllOf = new ReadGroupAllOf();
    readGroupAllOf.id("42");
    readGroupAllOf.addMembersItem(new ReadMember());

    // Act and Assert
    assertNotEquals(readGroupAllOf, new ReadGroupAllOf());
  }

  /**
   * Test {@link ReadGroupAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroupAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroupAllOf.equals(Object)", "int ReadGroupAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ReadGroupAllOf readGroupAllOf = new ReadGroupAllOf();
    readGroupAllOf.createdDate(
        OffsetDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.MIDNIGHT, ZoneOffset.UTC));
    readGroupAllOf.addMembersItem(new ReadMember());

    // Act and Assert
    assertNotEquals(readGroupAllOf, new ReadGroupAllOf());
  }

  /**
   * Test {@link ReadGroupAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroupAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroupAllOf.equals(Object)", "int ReadGroupAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    ReadGroupAllOf readGroupAllOf = new ReadGroupAllOf();
    readGroupAllOf.createdBy("Jan 1, 2020 8:00am GMT+0100");
    readGroupAllOf.addMembersItem(new ReadMember());

    // Act and Assert
    assertNotEquals(readGroupAllOf, new ReadGroupAllOf());
  }

  /**
   * Test {@link ReadGroupAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroupAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroupAllOf.equals(Object)", "int ReadGroupAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    ReadGroupAllOf readGroupAllOf = new ReadGroupAllOf();
    readGroupAllOf.updatedDate(
        OffsetDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.MIDNIGHT, ZoneOffset.UTC));
    readGroupAllOf.addMembersItem(new ReadMember());

    // Act and Assert
    assertNotEquals(readGroupAllOf, new ReadGroupAllOf());
  }

  /**
   * Test {@link ReadGroupAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroupAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroupAllOf.equals(Object)", "int ReadGroupAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    ReadGroupAllOf readGroupAllOf = new ReadGroupAllOf();
    readGroupAllOf.updatedBy("2020-03-01");
    readGroupAllOf.addMembersItem(new ReadMember());

    // Act and Assert
    assertNotEquals(readGroupAllOf, new ReadGroupAllOf());
  }

  /**
   * Test {@link ReadGroupAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroupAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroupAllOf.equals(Object)", "int ReadGroupAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    ReadGroupAllOf readGroupAllOf = new ReadGroupAllOf();
    readGroupAllOf.status(Status.ACTIVE);
    readGroupAllOf.addMembersItem(new ReadMember());

    // Act and Assert
    assertNotEquals(readGroupAllOf, new ReadGroupAllOf());
  }

  /**
   * Test {@link ReadGroupAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroupAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroupAllOf.equals(Object)", "int ReadGroupAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    ReadGroupAllOf readGroupAllOf = new ReadGroupAllOf();
    readGroupAllOf.eTag("E Tag");
    readGroupAllOf.addMembersItem(new ReadMember());

    // Act and Assert
    assertNotEquals(readGroupAllOf, new ReadGroupAllOf());
  }

  /**
   * Test {@link ReadGroupAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroupAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroupAllOf.equals(Object)", "int ReadGroupAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    ReadGroupAllOf readGroupAllOf = new ReadGroupAllOf();
    readGroupAllOf.subType(SubTypeEnum.COMMUNITY);
    readGroupAllOf.addMembersItem(new ReadMember());

    // Act and Assert
    assertNotEquals(readGroupAllOf, new ReadGroupAllOf());
  }

  /**
   * Test {@link ReadGroupAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroupAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroupAllOf.equals(Object)", "int ReadGroupAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual10() {
    // Arrange
    ReadGroupAllOf readGroupAllOf = new ReadGroupAllOf();
    readGroupAllOf.referrer("Referrer");
    readGroupAllOf.addMembersItem(new ReadMember());

    // Act and Assert
    assertNotEquals(readGroupAllOf, new ReadGroupAllOf());
  }

  /**
   * Test {@link ReadGroupAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroupAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroupAllOf.equals(Object)", "int ReadGroupAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual11() {
    // Arrange
    ReadGroupAllOf readGroupAllOf = new ReadGroupAllOf();
    readGroupAllOf.profile(new Profile());

    // Act and Assert
    assertNotEquals(readGroupAllOf, new ReadGroupAllOf());
  }

  /**
   * Test {@link ReadGroupAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroupAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroupAllOf.equals(Object)", "int ReadGroupAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual12() {
    // Arrange
    ReadGroupAllOf readGroupAllOf = new ReadGroupAllOf();
    readGroupAllOf.visibilityRestriction(new GroupVisibilityRestriction());

    // Act and Assert
    assertNotEquals(readGroupAllOf, new ReadGroupAllOf());
  }

  /**
   * Test {@link ReadGroupAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroupAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroupAllOf.equals(Object)", "int ReadGroupAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual13() {
    // Arrange
    ReadGroupAllOf readGroupAllOf = new ReadGroupAllOf();
    readGroupAllOf.implicitConnection(new GroupImplicitConnection());

    // Act and Assert
    assertNotEquals(readGroupAllOf, new ReadGroupAllOf());
  }

  /**
   * Test {@link ReadGroupAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroupAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroupAllOf.equals(Object)", "int ReadGroupAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual14() {
    // Arrange
    ReadGroupAllOf readGroupAllOf = new ReadGroupAllOf();
    readGroupAllOf.interactionTransfer(new GroupInteractionTransfer());

    // Act and Assert
    assertNotEquals(readGroupAllOf, new ReadGroupAllOf());
  }

  /**
   * Test {@link ReadGroupAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroupAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroupAllOf.equals(Object)", "int ReadGroupAllOf.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ReadGroupAllOf(), null);
  }

  /**
   * Test {@link ReadGroupAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadGroupAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadGroupAllOf.equals(Object)", "int ReadGroupAllOf.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ReadGroupAllOf(), "Different type to ReadGroupAllOf");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link ReadGroupAllOf}
   *   <li>{@link ReadGroupAllOf#createdBy(String)}
   *   <li>{@link ReadGroupAllOf#createdDate(OffsetDateTime)}
   *   <li>{@link ReadGroupAllOf#eTag(String)}
   *   <li>{@link ReadGroupAllOf#id(String)}
   *   <li>{@link ReadGroupAllOf#implicitConnection(GroupImplicitConnection)}
   *   <li>{@link ReadGroupAllOf#interactionTransfer(GroupInteractionTransfer)}
   *   <li>{@link ReadGroupAllOf#members(List)}
   *   <li>{@link ReadGroupAllOf#profile(Profile)}
   *   <li>{@link ReadGroupAllOf#referrer(String)}
   *   <li>{@link ReadGroupAllOf#setCreatedBy(String)}
   *   <li>{@link ReadGroupAllOf#setCreatedDate(OffsetDateTime)}
   *   <li>{@link ReadGroupAllOf#setId(String)}
   *   <li>{@link ReadGroupAllOf#setImplicitConnection(GroupImplicitConnection)}
   *   <li>{@link ReadGroupAllOf#setInteractionTransfer(GroupInteractionTransfer)}
   *   <li>{@link ReadGroupAllOf#setMembers(List)}
   *   <li>{@link ReadGroupAllOf#setProfile(Profile)}
   *   <li>{@link ReadGroupAllOf#setReferrer(String)}
   *   <li>{@link ReadGroupAllOf#setStatus(Status)}
   *   <li>{@link ReadGroupAllOf#setSubType(SubTypeEnum)}
   *   <li>{@link ReadGroupAllOf#setUpdatedBy(String)}
   *   <li>{@link ReadGroupAllOf#setUpdatedDate(OffsetDateTime)}
   *   <li>{@link ReadGroupAllOf#setVisibilityRestriction(GroupVisibilityRestriction)}
   *   <li>{@link ReadGroupAllOf#seteTag(String)}
   *   <li>{@link ReadGroupAllOf#status(Status)}
   *   <li>{@link ReadGroupAllOf#subType(SubTypeEnum)}
   *   <li>{@link ReadGroupAllOf#updatedBy(String)}
   *   <li>{@link ReadGroupAllOf#updatedDate(OffsetDateTime)}
   *   <li>{@link ReadGroupAllOf#visibilityRestriction(GroupVisibilityRestriction)}
   *   <li>{@link ReadGroupAllOf#toString()}
   *   <li>{@link ReadGroupAllOf#getCreatedBy()}
   *   <li>{@link ReadGroupAllOf#getCreatedDate()}
   *   <li>{@link ReadGroupAllOf#getId()}
   *   <li>{@link ReadGroupAllOf#getImplicitConnection()}
   *   <li>{@link ReadGroupAllOf#getInteractionTransfer()}
   *   <li>{@link ReadGroupAllOf#getMembers()}
   *   <li>{@link ReadGroupAllOf#getProfile()}
   *   <li>{@link ReadGroupAllOf#getReferrer()}
   *   <li>{@link ReadGroupAllOf#getStatus()}
   *   <li>{@link ReadGroupAllOf#getSubType()}
   *   <li>{@link ReadGroupAllOf#getUpdatedBy()}
   *   <li>{@link ReadGroupAllOf#getUpdatedDate()}
   *   <li>{@link ReadGroupAllOf#getVisibilityRestriction()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ReadGroupAllOf.<init>()",
    "ReadGroupAllOf ReadGroupAllOf.createdBy(String)",
    "ReadGroupAllOf ReadGroupAllOf.createdDate(OffsetDateTime)",
    "ReadGroupAllOf ReadGroupAllOf.eTag(String)",
    "String ReadGroupAllOf.getCreatedBy()",
    "OffsetDateTime ReadGroupAllOf.getCreatedDate()",
    "String ReadGroupAllOf.getId()",
    "GroupImplicitConnection ReadGroupAllOf.getImplicitConnection()",
    "GroupInteractionTransfer ReadGroupAllOf.getInteractionTransfer()",
    "List ReadGroupAllOf.getMembers()",
    "Profile ReadGroupAllOf.getProfile()",
    "String ReadGroupAllOf.getReferrer()",
    "Status ReadGroupAllOf.getStatus()",
    "SubTypeEnum ReadGroupAllOf.getSubType()",
    "String ReadGroupAllOf.getUpdatedBy()",
    "OffsetDateTime ReadGroupAllOf.getUpdatedDate()",
    "GroupVisibilityRestriction ReadGroupAllOf.getVisibilityRestriction()",
    "ReadGroupAllOf ReadGroupAllOf.id(String)",
    "ReadGroupAllOf ReadGroupAllOf.implicitConnection(GroupImplicitConnection)",
    "ReadGroupAllOf ReadGroupAllOf.interactionTransfer(GroupInteractionTransfer)",
    "ReadGroupAllOf ReadGroupAllOf.members(List)",
    "ReadGroupAllOf ReadGroupAllOf.profile(Profile)",
    "ReadGroupAllOf ReadGroupAllOf.referrer(String)",
    "void ReadGroupAllOf.setCreatedBy(String)",
    "void ReadGroupAllOf.setCreatedDate(OffsetDateTime)",
    "void ReadGroupAllOf.setId(String)",
    "void ReadGroupAllOf.setImplicitConnection(GroupImplicitConnection)",
    "void ReadGroupAllOf.setInteractionTransfer(GroupInteractionTransfer)",
    "void ReadGroupAllOf.setMembers(List)",
    "void ReadGroupAllOf.setProfile(Profile)",
    "void ReadGroupAllOf.setReferrer(String)",
    "void ReadGroupAllOf.setStatus(Status)",
    "void ReadGroupAllOf.setSubType(SubTypeEnum)",
    "void ReadGroupAllOf.setUpdatedBy(String)",
    "void ReadGroupAllOf.setUpdatedDate(OffsetDateTime)",
    "void ReadGroupAllOf.setVisibilityRestriction(GroupVisibilityRestriction)",
    "void ReadGroupAllOf.seteTag(String)",
    "ReadGroupAllOf ReadGroupAllOf.status(Status)",
    "ReadGroupAllOf ReadGroupAllOf.subType(SubTypeEnum)",
    "String ReadGroupAllOf.toString()",
    "ReadGroupAllOf ReadGroupAllOf.updatedBy(String)",
    "ReadGroupAllOf ReadGroupAllOf.updatedDate(OffsetDateTime)",
    "ReadGroupAllOf ReadGroupAllOf.visibilityRestriction(GroupVisibilityRestriction)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    ReadGroupAllOf actualReadGroupAllOf = new ReadGroupAllOf();
    ReadGroupAllOf actualCreatedByResult =
        actualReadGroupAllOf.createdBy("Jan 1, 2020 8:00am GMT+0100");
    ReadGroupAllOf actualCreatedDateResult =
        actualReadGroupAllOf.createdDate(
            OffsetDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.MIDNIGHT, ZoneOffset.UTC));
    ReadGroupAllOf actualETagResult = actualReadGroupAllOf.eTag("E Tag");
    ReadGroupAllOf actualIdResult = actualReadGroupAllOf.id("42");
    ReadGroupAllOf actualImplicitConnectionResult =
        actualReadGroupAllOf.implicitConnection(new GroupImplicitConnection());
    ReadGroupAllOf actualInteractionTransferResult =
        actualReadGroupAllOf.interactionTransfer(new GroupInteractionTransfer());
    ReadGroupAllOf actualMembersResult = actualReadGroupAllOf.members(new ArrayList<>());
    ReadGroupAllOf actualProfileResult = actualReadGroupAllOf.profile(new Profile());
    ReadGroupAllOf actualReferrerResult = actualReadGroupAllOf.referrer("Referrer");
    actualReadGroupAllOf.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
    OffsetDateTime createdDate =
        OffsetDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.MIDNIGHT, ZoneOffset.UTC);
    actualReadGroupAllOf.setCreatedDate(createdDate);
    actualReadGroupAllOf.setId("42");
    GroupImplicitConnection implicitConnection = new GroupImplicitConnection();
    actualReadGroupAllOf.setImplicitConnection(implicitConnection);
    GroupInteractionTransfer interactionTransfer = new GroupInteractionTransfer();
    actualReadGroupAllOf.setInteractionTransfer(interactionTransfer);
    ArrayList<ReadMember> members = new ArrayList<>();
    actualReadGroupAllOf.setMembers(members);
    Profile profile = new Profile();
    actualReadGroupAllOf.setProfile(profile);
    actualReadGroupAllOf.setReferrer("Referrer");
    actualReadGroupAllOf.setStatus(Status.ACTIVE);
    actualReadGroupAllOf.setSubType(SubTypeEnum.COMMUNITY);
    actualReadGroupAllOf.setUpdatedBy("2020-03-01");
    actualReadGroupAllOf.setUpdatedDate(
        OffsetDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.MIDNIGHT, ZoneOffset.UTC));
    actualReadGroupAllOf.setVisibilityRestriction(new GroupVisibilityRestriction());
    actualReadGroupAllOf.seteTag("E Tag");
    ReadGroupAllOf actualStatusResult = actualReadGroupAllOf.status(Status.ACTIVE);
    ReadGroupAllOf actualSubTypeResult = actualReadGroupAllOf.subType(SubTypeEnum.COMMUNITY);
    ReadGroupAllOf actualUpdatedByResult = actualReadGroupAllOf.updatedBy("2020-03-01");
    OffsetDateTime updatedDate =
        OffsetDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.MIDNIGHT, ZoneOffset.UTC);
    ReadGroupAllOf actualUpdatedDateResult = actualReadGroupAllOf.updatedDate(updatedDate);
    GroupVisibilityRestriction visibilityRestriction = new GroupVisibilityRestriction();
    ReadGroupAllOf actualVisibilityRestrictionResult =
        actualReadGroupAllOf.visibilityRestriction(visibilityRestriction);
    String actualToStringResult = actualReadGroupAllOf.toString();
    String actualCreatedBy = actualReadGroupAllOf.getCreatedBy();
    OffsetDateTime actualCreatedDate = actualReadGroupAllOf.getCreatedDate();
    String actualId = actualReadGroupAllOf.getId();
    GroupImplicitConnection actualImplicitConnection = actualReadGroupAllOf.getImplicitConnection();
    GroupInteractionTransfer actualInteractionTransfer =
        actualReadGroupAllOf.getInteractionTransfer();
    List<ReadMember> actualMembers = actualReadGroupAllOf.getMembers();
    Profile actualProfile = actualReadGroupAllOf.getProfile();
    String actualReferrer = actualReadGroupAllOf.getReferrer();
    Status actualStatus = actualReadGroupAllOf.getStatus();
    SubTypeEnum actualSubType = actualReadGroupAllOf.getSubType();
    String actualUpdatedBy = actualReadGroupAllOf.getUpdatedBy();
    OffsetDateTime actualUpdatedDate = actualReadGroupAllOf.getUpdatedDate();
    GroupVisibilityRestriction actualVisibilityRestriction =
        actualReadGroupAllOf.getVisibilityRestriction();

    // Assert
    assertEquals("2020-03-01", actualUpdatedBy);
    assertEquals("42", actualId);
    assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
    assertEquals("Referrer", actualReferrer);
    assertEquals(
        "class ReadGroupAllOf {\n"
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
    assertEquals(SubTypeEnum.COMMUNITY, actualSubType);
    assertEquals(Status.ACTIVE, actualStatus);
    assertTrue(actualMembers.isEmpty());
    assertSame(implicitConnection, actualImplicitConnection);
    assertSame(interactionTransfer, actualInteractionTransfer);
    assertSame(visibilityRestriction, actualVisibilityRestriction);
    assertSame(profile, actualProfile);
    assertSame(actualReadGroupAllOf, actualCreatedByResult);
    assertSame(actualReadGroupAllOf, actualCreatedDateResult);
    assertSame(actualReadGroupAllOf, actualETagResult);
    assertSame(actualReadGroupAllOf, actualIdResult);
    assertSame(actualReadGroupAllOf, actualImplicitConnectionResult);
    assertSame(actualReadGroupAllOf, actualInteractionTransferResult);
    assertSame(actualReadGroupAllOf, actualMembersResult);
    assertSame(actualReadGroupAllOf, actualProfileResult);
    assertSame(actualReadGroupAllOf, actualReferrerResult);
    assertSame(actualReadGroupAllOf, actualStatusResult);
    assertSame(actualReadGroupAllOf, actualSubTypeResult);
    assertSame(actualReadGroupAllOf, actualUpdatedByResult);
    assertSame(actualReadGroupAllOf, actualUpdatedDateResult);
    assertSame(actualReadGroupAllOf, actualVisibilityRestrictionResult);
    assertSame(members, actualMembers);
    assertSame(createdDate, actualCreatedDate);
    assertSame(updatedDate, actualUpdatedDate);
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
