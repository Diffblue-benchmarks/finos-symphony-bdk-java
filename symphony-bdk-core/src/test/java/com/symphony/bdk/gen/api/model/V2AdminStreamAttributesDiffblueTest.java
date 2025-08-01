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

class V2AdminStreamAttributesDiffblueTest {
  /**
   * Test {@link V2AdminStreamAttributes#addMembersItem(Long)}.
   *
   * <ul>
   *   <li>Given {@link V2AdminStreamAttributes} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link V2AdminStreamAttributes#addMembersItem(Long)}
   */
  @Test
  @DisplayName("Test addMembersItem(Long); given V2AdminStreamAttributes (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2AdminStreamAttributes V2AdminStreamAttributes.addMembersItem(Long)"})
  void testAddMembersItem_givenV2AdminStreamAttributes() {
    // Arrange
    V2AdminStreamAttributes v2AdminStreamAttributes = new V2AdminStreamAttributes();

    // Act and Assert
    assertSame(v2AdminStreamAttributes, v2AdminStreamAttributes.addMembersItem(1L));
  }

  /**
   * Test {@link V2AdminStreamAttributes#addMembersItem(Long)}.
   *
   * <ul>
   *   <li>Given {@link V2AdminStreamAttributes} (default constructor) members {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link V2AdminStreamAttributes#addMembersItem(Long)}
   */
  @Test
  @DisplayName(
      "Test addMembersItem(Long); given V2AdminStreamAttributes (default constructor) members ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2AdminStreamAttributes V2AdminStreamAttributes.addMembersItem(Long)"})
  void testAddMembersItem_givenV2AdminStreamAttributesMembersArrayList() {
    // Arrange
    V2AdminStreamAttributes v2AdminStreamAttributes = new V2AdminStreamAttributes();
    v2AdminStreamAttributes.members(new ArrayList<>());

    // Act and Assert
    assertSame(v2AdminStreamAttributes, v2AdminStreamAttributes.addMembersItem(1L));
  }

  /**
   * Test {@link V2AdminStreamAttributes#equals(Object)}, and {@link
   * V2AdminStreamAttributes#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2AdminStreamAttributes#equals(Object)}
   *   <li>{@link V2AdminStreamAttributes#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2AdminStreamAttributes.equals(Object)",
    "int V2AdminStreamAttributes.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2AdminStreamAttributes v2AdminStreamAttributes = new V2AdminStreamAttributes();
    V2AdminStreamAttributes v2AdminStreamAttributes2 = new V2AdminStreamAttributes();

    // Act and Assert
    assertEquals(v2AdminStreamAttributes, v2AdminStreamAttributes2);
    int expectedHashCodeResult = v2AdminStreamAttributes.hashCode();
    assertEquals(expectedHashCodeResult, v2AdminStreamAttributes2.hashCode());
  }

  /**
   * Test {@link V2AdminStreamAttributes#equals(Object)}, and {@link
   * V2AdminStreamAttributes#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2AdminStreamAttributes#equals(Object)}
   *   <li>{@link V2AdminStreamAttributes#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2AdminStreamAttributes.equals(Object)",
    "int V2AdminStreamAttributes.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2AdminStreamAttributes v2AdminStreamAttributes = new V2AdminStreamAttributes();

    // Act and Assert
    assertEquals(v2AdminStreamAttributes, v2AdminStreamAttributes);
    int expectedHashCodeResult = v2AdminStreamAttributes.hashCode();
    assertEquals(expectedHashCodeResult, v2AdminStreamAttributes.hashCode());
  }

  /**
   * Test {@link V2AdminStreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2AdminStreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2AdminStreamAttributes.equals(Object)",
    "int V2AdminStreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V2AdminStreamAttributes v2AdminStreamAttributes = new V2AdminStreamAttributes();
    v2AdminStreamAttributes.addMembersItem(1L);

    // Act and Assert
    assertNotEquals(v2AdminStreamAttributes, new V2AdminStreamAttributes());
  }

  /**
   * Test {@link V2AdminStreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2AdminStreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2AdminStreamAttributes.equals(Object)",
    "int V2AdminStreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V2AdminStreamAttributes v2AdminStreamAttributes = new V2AdminStreamAttributes();
    v2AdminStreamAttributes.roomName("Room Name");
    v2AdminStreamAttributes.addMembersItem(1L);

    // Act and Assert
    assertNotEquals(v2AdminStreamAttributes, new V2AdminStreamAttributes());
  }

  /**
   * Test {@link V2AdminStreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2AdminStreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2AdminStreamAttributes.equals(Object)",
    "int V2AdminStreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V2AdminStreamAttributes v2AdminStreamAttributes = new V2AdminStreamAttributes();
    v2AdminStreamAttributes.roomDescription("Room Description");
    v2AdminStreamAttributes.addMembersItem(1L);

    // Act and Assert
    assertNotEquals(v2AdminStreamAttributes, new V2AdminStreamAttributes());
  }

  /**
   * Test {@link V2AdminStreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2AdminStreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2AdminStreamAttributes.equals(Object)",
    "int V2AdminStreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V2AdminStreamAttributes v2AdminStreamAttributes = new V2AdminStreamAttributes();
    v2AdminStreamAttributes.createdByUserId(1L);

    // Act and Assert
    assertNotEquals(v2AdminStreamAttributes, new V2AdminStreamAttributes());
  }

  /**
   * Test {@link V2AdminStreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2AdminStreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2AdminStreamAttributes.equals(Object)",
    "int V2AdminStreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V2AdminStreamAttributes v2AdminStreamAttributes = new V2AdminStreamAttributes();
    v2AdminStreamAttributes.createdDate(1L);

    // Act and Assert
    assertNotEquals(v2AdminStreamAttributes, new V2AdminStreamAttributes());
  }

  /**
   * Test {@link V2AdminStreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2AdminStreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2AdminStreamAttributes.equals(Object)",
    "int V2AdminStreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    V2AdminStreamAttributes v2AdminStreamAttributes = new V2AdminStreamAttributes();
    v2AdminStreamAttributes.lastModifiedDate(1L);

    // Act and Assert
    assertNotEquals(v2AdminStreamAttributes, new V2AdminStreamAttributes());
  }

  /**
   * Test {@link V2AdminStreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2AdminStreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2AdminStreamAttributes.equals(Object)",
    "int V2AdminStreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    V2AdminStreamAttributes v2AdminStreamAttributes = new V2AdminStreamAttributes();
    v2AdminStreamAttributes.originCompany("Origin Company");

    // Act and Assert
    assertNotEquals(v2AdminStreamAttributes, new V2AdminStreamAttributes());
  }

  /**
   * Test {@link V2AdminStreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2AdminStreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2AdminStreamAttributes.equals(Object)",
    "int V2AdminStreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    V2AdminStreamAttributes v2AdminStreamAttributes = new V2AdminStreamAttributes();
    v2AdminStreamAttributes.originCompanyId(1);

    // Act and Assert
    assertNotEquals(v2AdminStreamAttributes, new V2AdminStreamAttributes());
  }

  /**
   * Test {@link V2AdminStreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2AdminStreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2AdminStreamAttributes.equals(Object)",
    "int V2AdminStreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    V2AdminStreamAttributes v2AdminStreamAttributes = new V2AdminStreamAttributes();
    v2AdminStreamAttributes.membersCount(3);

    // Act and Assert
    assertNotEquals(v2AdminStreamAttributes, new V2AdminStreamAttributes());
  }

  /**
   * Test {@link V2AdminStreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2AdminStreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2AdminStreamAttributes.equals(Object)",
    "int V2AdminStreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual10() {
    // Arrange
    V2AdminStreamAttributes v2AdminStreamAttributes = new V2AdminStreamAttributes();
    v2AdminStreamAttributes.lastMessageDate(1L);

    // Act and Assert
    assertNotEquals(v2AdminStreamAttributes, new V2AdminStreamAttributes());
  }

  /**
   * Test {@link V2AdminStreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2AdminStreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2AdminStreamAttributes.equals(Object)",
    "int V2AdminStreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2AdminStreamAttributes(), null);
  }

  /**
   * Test {@link V2AdminStreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2AdminStreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2AdminStreamAttributes.equals(Object)",
    "int V2AdminStreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2AdminStreamAttributes(), "Different type to V2AdminStreamAttributes");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V2AdminStreamAttributes}
   *   <li>{@link V2AdminStreamAttributes#createdByUserId(Long)}
   *   <li>{@link V2AdminStreamAttributes#createdDate(Long)}
   *   <li>{@link V2AdminStreamAttributes#lastMessageDate(Long)}
   *   <li>{@link V2AdminStreamAttributes#lastModifiedDate(Long)}
   *   <li>{@link V2AdminStreamAttributes#members(List)}
   *   <li>{@link V2AdminStreamAttributes#membersCount(Integer)}
   *   <li>{@link V2AdminStreamAttributes#originCompany(String)}
   *   <li>{@link V2AdminStreamAttributes#originCompanyId(Integer)}
   *   <li>{@link V2AdminStreamAttributes#roomDescription(String)}
   *   <li>{@link V2AdminStreamAttributes#roomName(String)}
   *   <li>{@link V2AdminStreamAttributes#setCreatedByUserId(Long)}
   *   <li>{@link V2AdminStreamAttributes#setCreatedDate(Long)}
   *   <li>{@link V2AdminStreamAttributes#setLastMessageDate(Long)}
   *   <li>{@link V2AdminStreamAttributes#setLastModifiedDate(Long)}
   *   <li>{@link V2AdminStreamAttributes#setMembers(List)}
   *   <li>{@link V2AdminStreamAttributes#setMembersCount(Integer)}
   *   <li>{@link V2AdminStreamAttributes#setOriginCompany(String)}
   *   <li>{@link V2AdminStreamAttributes#setOriginCompanyId(Integer)}
   *   <li>{@link V2AdminStreamAttributes#setRoomDescription(String)}
   *   <li>{@link V2AdminStreamAttributes#setRoomName(String)}
   *   <li>{@link V2AdminStreamAttributes#toString()}
   *   <li>{@link V2AdminStreamAttributes#getCreatedByUserId()}
   *   <li>{@link V2AdminStreamAttributes#getCreatedDate()}
   *   <li>{@link V2AdminStreamAttributes#getLastMessageDate()}
   *   <li>{@link V2AdminStreamAttributes#getLastModifiedDate()}
   *   <li>{@link V2AdminStreamAttributes#getMembers()}
   *   <li>{@link V2AdminStreamAttributes#getMembersCount()}
   *   <li>{@link V2AdminStreamAttributes#getOriginCompany()}
   *   <li>{@link V2AdminStreamAttributes#getOriginCompanyId()}
   *   <li>{@link V2AdminStreamAttributes#getRoomDescription()}
   *   <li>{@link V2AdminStreamAttributes#getRoomName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V2AdminStreamAttributes.<init>()",
    "V2AdminStreamAttributes V2AdminStreamAttributes.createdByUserId(Long)",
    "V2AdminStreamAttributes V2AdminStreamAttributes.createdDate(Long)",
    "Long V2AdminStreamAttributes.getCreatedByUserId()",
    "Long V2AdminStreamAttributes.getCreatedDate()",
    "Long V2AdminStreamAttributes.getLastMessageDate()",
    "Long V2AdminStreamAttributes.getLastModifiedDate()",
    "List V2AdminStreamAttributes.getMembers()",
    "Integer V2AdminStreamAttributes.getMembersCount()",
    "String V2AdminStreamAttributes.getOriginCompany()",
    "Integer V2AdminStreamAttributes.getOriginCompanyId()",
    "String V2AdminStreamAttributes.getRoomDescription()",
    "String V2AdminStreamAttributes.getRoomName()",
    "V2AdminStreamAttributes V2AdminStreamAttributes.lastMessageDate(Long)",
    "V2AdminStreamAttributes V2AdminStreamAttributes.lastModifiedDate(Long)",
    "V2AdminStreamAttributes V2AdminStreamAttributes.members(List)",
    "V2AdminStreamAttributes V2AdminStreamAttributes.membersCount(Integer)",
    "V2AdminStreamAttributes V2AdminStreamAttributes.originCompany(String)",
    "V2AdminStreamAttributes V2AdminStreamAttributes.originCompanyId(Integer)",
    "V2AdminStreamAttributes V2AdminStreamAttributes.roomDescription(String)",
    "V2AdminStreamAttributes V2AdminStreamAttributes.roomName(String)",
    "void V2AdminStreamAttributes.setCreatedByUserId(Long)",
    "void V2AdminStreamAttributes.setCreatedDate(Long)",
    "void V2AdminStreamAttributes.setLastMessageDate(Long)",
    "void V2AdminStreamAttributes.setLastModifiedDate(Long)",
    "void V2AdminStreamAttributes.setMembers(List)",
    "void V2AdminStreamAttributes.setMembersCount(Integer)",
    "void V2AdminStreamAttributes.setOriginCompany(String)",
    "void V2AdminStreamAttributes.setOriginCompanyId(Integer)",
    "void V2AdminStreamAttributes.setRoomDescription(String)",
    "void V2AdminStreamAttributes.setRoomName(String)",
    "String V2AdminStreamAttributes.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V2AdminStreamAttributes actualV2AdminStreamAttributes = new V2AdminStreamAttributes();
    V2AdminStreamAttributes actualCreatedByUserIdResult =
        actualV2AdminStreamAttributes.createdByUserId(1L);
    V2AdminStreamAttributes actualCreatedDateResult = actualV2AdminStreamAttributes.createdDate(1L);
    V2AdminStreamAttributes actualLastMessageDateResult =
        actualV2AdminStreamAttributes.lastMessageDate(1L);
    V2AdminStreamAttributes actualLastModifiedDateResult =
        actualV2AdminStreamAttributes.lastModifiedDate(1L);
    V2AdminStreamAttributes actualMembersResult =
        actualV2AdminStreamAttributes.members(new ArrayList<>());
    V2AdminStreamAttributes actualMembersCountResult =
        actualV2AdminStreamAttributes.membersCount(3);
    V2AdminStreamAttributes actualOriginCompanyResult =
        actualV2AdminStreamAttributes.originCompany("Origin Company");
    V2AdminStreamAttributes actualOriginCompanyIdResult =
        actualV2AdminStreamAttributes.originCompanyId(1);
    V2AdminStreamAttributes actualRoomDescriptionResult =
        actualV2AdminStreamAttributes.roomDescription("Room Description");
    V2AdminStreamAttributes actualRoomNameResult =
        actualV2AdminStreamAttributes.roomName("Room Name");
    actualV2AdminStreamAttributes.setCreatedByUserId(1L);
    actualV2AdminStreamAttributes.setCreatedDate(1L);
    actualV2AdminStreamAttributes.setLastMessageDate(1L);
    actualV2AdminStreamAttributes.setLastModifiedDate(1L);
    ArrayList<Long> members = new ArrayList<>();
    actualV2AdminStreamAttributes.setMembers(members);
    actualV2AdminStreamAttributes.setMembersCount(3);
    actualV2AdminStreamAttributes.setOriginCompany("Origin Company");
    actualV2AdminStreamAttributes.setOriginCompanyId(1);
    actualV2AdminStreamAttributes.setRoomDescription("Room Description");
    actualV2AdminStreamAttributes.setRoomName("Room Name");
    String actualToStringResult = actualV2AdminStreamAttributes.toString();
    Long actualCreatedByUserId = actualV2AdminStreamAttributes.getCreatedByUserId();
    Long actualCreatedDate = actualV2AdminStreamAttributes.getCreatedDate();
    Long actualLastMessageDate = actualV2AdminStreamAttributes.getLastMessageDate();
    Long actualLastModifiedDate = actualV2AdminStreamAttributes.getLastModifiedDate();
    List<Long> actualMembers = actualV2AdminStreamAttributes.getMembers();
    Integer actualMembersCount = actualV2AdminStreamAttributes.getMembersCount();
    String actualOriginCompany = actualV2AdminStreamAttributes.getOriginCompany();
    Integer actualOriginCompanyId = actualV2AdminStreamAttributes.getOriginCompanyId();
    String actualRoomDescription = actualV2AdminStreamAttributes.getRoomDescription();

    // Assert
    assertEquals("Origin Company", actualOriginCompany);
    assertEquals("Room Description", actualRoomDescription);
    assertEquals("Room Name", actualV2AdminStreamAttributes.getRoomName());
    assertEquals(
        "class V2AdminStreamAttributes {\n"
            + "    roomName: Room Name\n"
            + "    roomDescription: Room Description\n"
            + "    members: []\n"
            + "    createdByUserId: 1\n"
            + "    createdDate: 1\n"
            + "    lastModifiedDate: 1\n"
            + "    originCompany: Origin Company\n"
            + "    originCompanyId: 1\n"
            + "    membersCount: 3\n"
            + "    lastMessageDate: 1\n"
            + "}",
        actualToStringResult);
    assertEquals(1, actualOriginCompanyId.intValue());
    assertEquals(1L, actualCreatedByUserId.longValue());
    assertEquals(1L, actualCreatedDate.longValue());
    assertEquals(1L, actualLastMessageDate.longValue());
    assertEquals(1L, actualLastModifiedDate.longValue());
    assertEquals(3, actualMembersCount.intValue());
    assertTrue(actualMembers.isEmpty());
    assertSame(actualV2AdminStreamAttributes, actualCreatedByUserIdResult);
    assertSame(actualV2AdminStreamAttributes, actualCreatedDateResult);
    assertSame(actualV2AdminStreamAttributes, actualLastMessageDateResult);
    assertSame(actualV2AdminStreamAttributes, actualLastModifiedDateResult);
    assertSame(actualV2AdminStreamAttributes, actualMembersResult);
    assertSame(actualV2AdminStreamAttributes, actualMembersCountResult);
    assertSame(actualV2AdminStreamAttributes, actualOriginCompanyResult);
    assertSame(actualV2AdminStreamAttributes, actualOriginCompanyIdResult);
    assertSame(actualV2AdminStreamAttributes, actualRoomDescriptionResult);
    assertSame(actualV2AdminStreamAttributes, actualRoomNameResult);
    assertSame(members, actualMembers);
  }
}
