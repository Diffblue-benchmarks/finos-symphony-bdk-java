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

class AdminStreamAttributesDiffblueTest {
  /**
   * Test {@link AdminStreamAttributes#addMembersItem(Long)}.
   *
   * <ul>
   *   <li>Given {@link AdminStreamAttributes} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamAttributes#addMembersItem(Long)}
   */
  @Test
  @DisplayName("Test addMembersItem(Long); given AdminStreamAttributes (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AdminStreamAttributes AdminStreamAttributes.addMembersItem(Long)"})
  void testAddMembersItem_givenAdminStreamAttributes() {
    // Arrange
    AdminStreamAttributes adminStreamAttributes = new AdminStreamAttributes();

    // Act and Assert
    assertSame(adminStreamAttributes, adminStreamAttributes.addMembersItem(1L));
  }

  /**
   * Test {@link AdminStreamAttributes#addMembersItem(Long)}.
   *
   * <ul>
   *   <li>Given {@link AdminStreamAttributes} (default constructor) members {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamAttributes#addMembersItem(Long)}
   */
  @Test
  @DisplayName(
      "Test addMembersItem(Long); given AdminStreamAttributes (default constructor) members ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AdminStreamAttributes AdminStreamAttributes.addMembersItem(Long)"})
  void testAddMembersItem_givenAdminStreamAttributesMembersArrayList() {
    // Arrange
    AdminStreamAttributes adminStreamAttributes = new AdminStreamAttributes();
    adminStreamAttributes.members(new ArrayList<>());

    // Act and Assert
    assertSame(adminStreamAttributes, adminStreamAttributes.addMembersItem(1L));
  }

  /**
   * Test {@link AdminStreamAttributes#equals(Object)}, and {@link
   * AdminStreamAttributes#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AdminStreamAttributes#equals(Object)}
   *   <li>{@link AdminStreamAttributes#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamAttributes.equals(Object)",
    "int AdminStreamAttributes.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AdminStreamAttributes adminStreamAttributes = new AdminStreamAttributes();
    AdminStreamAttributes adminStreamAttributes2 = new AdminStreamAttributes();

    // Act and Assert
    assertEquals(adminStreamAttributes, adminStreamAttributes2);
    int expectedHashCodeResult = adminStreamAttributes.hashCode();
    assertEquals(expectedHashCodeResult, adminStreamAttributes2.hashCode());
  }

  /**
   * Test {@link AdminStreamAttributes#equals(Object)}, and {@link
   * AdminStreamAttributes#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AdminStreamAttributes#equals(Object)}
   *   <li>{@link AdminStreamAttributes#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamAttributes.equals(Object)",
    "int AdminStreamAttributes.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AdminStreamAttributes adminStreamAttributes = new AdminStreamAttributes();

    // Act and Assert
    assertEquals(adminStreamAttributes, adminStreamAttributes);
    int expectedHashCodeResult = adminStreamAttributes.hashCode();
    assertEquals(expectedHashCodeResult, adminStreamAttributes.hashCode());
  }

  /**
   * Test {@link AdminStreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamAttributes.equals(Object)",
    "int AdminStreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    AdminStreamAttributes adminStreamAttributes = new AdminStreamAttributes();
    adminStreamAttributes.addMembersItem(1L);

    // Act and Assert
    assertNotEquals(adminStreamAttributes, new AdminStreamAttributes());
  }

  /**
   * Test {@link AdminStreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamAttributes.equals(Object)",
    "int AdminStreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    AdminStreamAttributes adminStreamAttributes = new AdminStreamAttributes();
    adminStreamAttributes.roomName("Room Name");
    adminStreamAttributes.addMembersItem(1L);

    // Act and Assert
    assertNotEquals(adminStreamAttributes, new AdminStreamAttributes());
  }

  /**
   * Test {@link AdminStreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamAttributes.equals(Object)",
    "int AdminStreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    AdminStreamAttributes adminStreamAttributes = new AdminStreamAttributes();
    adminStreamAttributes.roomDescription("Room Description");
    adminStreamAttributes.addMembersItem(1L);

    // Act and Assert
    assertNotEquals(adminStreamAttributes, new AdminStreamAttributes());
  }

  /**
   * Test {@link AdminStreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamAttributes.equals(Object)",
    "int AdminStreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    AdminStreamAttributes adminStreamAttributes = new AdminStreamAttributes();
    adminStreamAttributes.createdByUserId(1L);

    // Act and Assert
    assertNotEquals(adminStreamAttributes, new AdminStreamAttributes());
  }

  /**
   * Test {@link AdminStreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamAttributes.equals(Object)",
    "int AdminStreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    AdminStreamAttributes adminStreamAttributes = new AdminStreamAttributes();
    adminStreamAttributes.createdDate(1L);

    // Act and Assert
    assertNotEquals(adminStreamAttributes, new AdminStreamAttributes());
  }

  /**
   * Test {@link AdminStreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamAttributes.equals(Object)",
    "int AdminStreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    AdminStreamAttributes adminStreamAttributes = new AdminStreamAttributes();
    adminStreamAttributes.lastModifiedDate(1L);

    // Act and Assert
    assertNotEquals(adminStreamAttributes, new AdminStreamAttributes());
  }

  /**
   * Test {@link AdminStreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamAttributes.equals(Object)",
    "int AdminStreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    AdminStreamAttributes adminStreamAttributes = new AdminStreamAttributes();
    adminStreamAttributes.originCompany("Origin Company");

    // Act and Assert
    assertNotEquals(adminStreamAttributes, new AdminStreamAttributes());
  }

  /**
   * Test {@link AdminStreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamAttributes.equals(Object)",
    "int AdminStreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    AdminStreamAttributes adminStreamAttributes = new AdminStreamAttributes();
    adminStreamAttributes.originCompanyId(1);

    // Act and Assert
    assertNotEquals(adminStreamAttributes, new AdminStreamAttributes());
  }

  /**
   * Test {@link AdminStreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamAttributes.equals(Object)",
    "int AdminStreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    AdminStreamAttributes adminStreamAttributes = new AdminStreamAttributes();
    adminStreamAttributes.membersCount(3);

    // Act and Assert
    assertNotEquals(adminStreamAttributes, new AdminStreamAttributes());
  }

  /**
   * Test {@link AdminStreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamAttributes.equals(Object)",
    "int AdminStreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AdminStreamAttributes(), null);
  }

  /**
   * Test {@link AdminStreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamAttributes.equals(Object)",
    "int AdminStreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AdminStreamAttributes(), "Different type to AdminStreamAttributes");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link AdminStreamAttributes}
   *   <li>{@link AdminStreamAttributes#createdByUserId(Long)}
   *   <li>{@link AdminStreamAttributes#createdDate(Long)}
   *   <li>{@link AdminStreamAttributes#lastModifiedDate(Long)}
   *   <li>{@link AdminStreamAttributes#members(List)}
   *   <li>{@link AdminStreamAttributes#membersCount(Integer)}
   *   <li>{@link AdminStreamAttributes#originCompany(String)}
   *   <li>{@link AdminStreamAttributes#originCompanyId(Integer)}
   *   <li>{@link AdminStreamAttributes#roomDescription(String)}
   *   <li>{@link AdminStreamAttributes#roomName(String)}
   *   <li>{@link AdminStreamAttributes#setCreatedByUserId(Long)}
   *   <li>{@link AdminStreamAttributes#setCreatedDate(Long)}
   *   <li>{@link AdminStreamAttributes#setLastModifiedDate(Long)}
   *   <li>{@link AdminStreamAttributes#setMembers(List)}
   *   <li>{@link AdminStreamAttributes#setMembersCount(Integer)}
   *   <li>{@link AdminStreamAttributes#setOriginCompany(String)}
   *   <li>{@link AdminStreamAttributes#setOriginCompanyId(Integer)}
   *   <li>{@link AdminStreamAttributes#setRoomDescription(String)}
   *   <li>{@link AdminStreamAttributes#setRoomName(String)}
   *   <li>{@link AdminStreamAttributes#toString()}
   *   <li>{@link AdminStreamAttributes#getCreatedByUserId()}
   *   <li>{@link AdminStreamAttributes#getCreatedDate()}
   *   <li>{@link AdminStreamAttributes#getLastModifiedDate()}
   *   <li>{@link AdminStreamAttributes#getMembers()}
   *   <li>{@link AdminStreamAttributes#getMembersCount()}
   *   <li>{@link AdminStreamAttributes#getOriginCompany()}
   *   <li>{@link AdminStreamAttributes#getOriginCompanyId()}
   *   <li>{@link AdminStreamAttributes#getRoomDescription()}
   *   <li>{@link AdminStreamAttributes#getRoomName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AdminStreamAttributes.<init>()",
    "AdminStreamAttributes AdminStreamAttributes.createdByUserId(Long)",
    "AdminStreamAttributes AdminStreamAttributes.createdDate(Long)",
    "Long AdminStreamAttributes.getCreatedByUserId()",
    "Long AdminStreamAttributes.getCreatedDate()",
    "Long AdminStreamAttributes.getLastModifiedDate()",
    "List AdminStreamAttributes.getMembers()",
    "Integer AdminStreamAttributes.getMembersCount()",
    "String AdminStreamAttributes.getOriginCompany()",
    "Integer AdminStreamAttributes.getOriginCompanyId()",
    "String AdminStreamAttributes.getRoomDescription()",
    "String AdminStreamAttributes.getRoomName()",
    "AdminStreamAttributes AdminStreamAttributes.lastModifiedDate(Long)",
    "AdminStreamAttributes AdminStreamAttributes.members(List)",
    "AdminStreamAttributes AdminStreamAttributes.membersCount(Integer)",
    "AdminStreamAttributes AdminStreamAttributes.originCompany(String)",
    "AdminStreamAttributes AdminStreamAttributes.originCompanyId(Integer)",
    "AdminStreamAttributes AdminStreamAttributes.roomDescription(String)",
    "AdminStreamAttributes AdminStreamAttributes.roomName(String)",
    "void AdminStreamAttributes.setCreatedByUserId(Long)",
    "void AdminStreamAttributes.setCreatedDate(Long)",
    "void AdminStreamAttributes.setLastModifiedDate(Long)",
    "void AdminStreamAttributes.setMembers(List)",
    "void AdminStreamAttributes.setMembersCount(Integer)",
    "void AdminStreamAttributes.setOriginCompany(String)",
    "void AdminStreamAttributes.setOriginCompanyId(Integer)",
    "void AdminStreamAttributes.setRoomDescription(String)",
    "void AdminStreamAttributes.setRoomName(String)",
    "String AdminStreamAttributes.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    AdminStreamAttributes actualAdminStreamAttributes = new AdminStreamAttributes();
    AdminStreamAttributes actualCreatedByUserIdResult =
        actualAdminStreamAttributes.createdByUserId(1L);
    AdminStreamAttributes actualCreatedDateResult = actualAdminStreamAttributes.createdDate(1L);
    AdminStreamAttributes actualLastModifiedDateResult =
        actualAdminStreamAttributes.lastModifiedDate(1L);
    AdminStreamAttributes actualMembersResult =
        actualAdminStreamAttributes.members(new ArrayList<>());
    AdminStreamAttributes actualMembersCountResult = actualAdminStreamAttributes.membersCount(3);
    AdminStreamAttributes actualOriginCompanyResult =
        actualAdminStreamAttributes.originCompany("Origin Company");
    AdminStreamAttributes actualOriginCompanyIdResult =
        actualAdminStreamAttributes.originCompanyId(1);
    AdminStreamAttributes actualRoomDescriptionResult =
        actualAdminStreamAttributes.roomDescription("Room Description");
    AdminStreamAttributes actualRoomNameResult = actualAdminStreamAttributes.roomName("Room Name");
    actualAdminStreamAttributes.setCreatedByUserId(1L);
    actualAdminStreamAttributes.setCreatedDate(1L);
    actualAdminStreamAttributes.setLastModifiedDate(1L);
    ArrayList<Long> members = new ArrayList<>();
    actualAdminStreamAttributes.setMembers(members);
    actualAdminStreamAttributes.setMembersCount(3);
    actualAdminStreamAttributes.setOriginCompany("Origin Company");
    actualAdminStreamAttributes.setOriginCompanyId(1);
    actualAdminStreamAttributes.setRoomDescription("Room Description");
    actualAdminStreamAttributes.setRoomName("Room Name");
    String actualToStringResult = actualAdminStreamAttributes.toString();
    Long actualCreatedByUserId = actualAdminStreamAttributes.getCreatedByUserId();
    Long actualCreatedDate = actualAdminStreamAttributes.getCreatedDate();
    Long actualLastModifiedDate = actualAdminStreamAttributes.getLastModifiedDate();
    List<Long> actualMembers = actualAdminStreamAttributes.getMembers();
    Integer actualMembersCount = actualAdminStreamAttributes.getMembersCount();
    String actualOriginCompany = actualAdminStreamAttributes.getOriginCompany();
    Integer actualOriginCompanyId = actualAdminStreamAttributes.getOriginCompanyId();
    String actualRoomDescription = actualAdminStreamAttributes.getRoomDescription();

    // Assert
    assertEquals("Origin Company", actualOriginCompany);
    assertEquals("Room Description", actualRoomDescription);
    assertEquals("Room Name", actualAdminStreamAttributes.getRoomName());
    assertEquals(
        "class AdminStreamAttributes {\n"
            + "    roomName: Room Name\n"
            + "    roomDescription: Room Description\n"
            + "    members: []\n"
            + "    createdByUserId: 1\n"
            + "    createdDate: 1\n"
            + "    lastModifiedDate: 1\n"
            + "    originCompany: Origin Company\n"
            + "    originCompanyId: 1\n"
            + "    membersCount: 3\n"
            + "}",
        actualToStringResult);
    assertEquals(1, actualOriginCompanyId.intValue());
    assertEquals(1L, actualCreatedByUserId.longValue());
    assertEquals(1L, actualCreatedDate.longValue());
    assertEquals(1L, actualLastModifiedDate.longValue());
    assertEquals(3, actualMembersCount.intValue());
    assertTrue(actualMembers.isEmpty());
    assertSame(actualAdminStreamAttributes, actualCreatedByUserIdResult);
    assertSame(actualAdminStreamAttributes, actualCreatedDateResult);
    assertSame(actualAdminStreamAttributes, actualLastModifiedDateResult);
    assertSame(actualAdminStreamAttributes, actualMembersResult);
    assertSame(actualAdminStreamAttributes, actualMembersCountResult);
    assertSame(actualAdminStreamAttributes, actualOriginCompanyResult);
    assertSame(actualAdminStreamAttributes, actualOriginCompanyIdResult);
    assertSame(actualAdminStreamAttributes, actualRoomDescriptionResult);
    assertSame(actualAdminStreamAttributes, actualRoomNameResult);
    assertSame(members, actualMembers);
  }
}
