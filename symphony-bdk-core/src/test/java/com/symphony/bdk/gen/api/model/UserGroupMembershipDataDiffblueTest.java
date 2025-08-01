package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserGroupMembershipDataDiffblueTest {
  /**
   * Test {@link UserGroupMembershipData#equals(Object)}, and {@link
   * UserGroupMembershipData#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserGroupMembershipData#equals(Object)}
   *   <li>{@link UserGroupMembershipData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupMembershipData.equals(Object)",
    "int UserGroupMembershipData.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserGroupMembershipData userGroupMembershipData = new UserGroupMembershipData();
    UserGroupMembershipData userGroupMembershipData2 = new UserGroupMembershipData();

    // Act and Assert
    assertEquals(userGroupMembershipData, userGroupMembershipData2);
    int expectedHashCodeResult = userGroupMembershipData.hashCode();
    assertEquals(expectedHashCodeResult, userGroupMembershipData2.hashCode());
  }

  /**
   * Test {@link UserGroupMembershipData#equals(Object)}, and {@link
   * UserGroupMembershipData#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserGroupMembershipData#equals(Object)}
   *   <li>{@link UserGroupMembershipData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupMembershipData.equals(Object)",
    "int UserGroupMembershipData.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserGroupMembershipData userGroupMembershipData = new UserGroupMembershipData();

    // Act and Assert
    assertEquals(userGroupMembershipData, userGroupMembershipData);
    int expectedHashCodeResult = userGroupMembershipData.hashCode();
    assertEquals(expectedHashCodeResult, userGroupMembershipData.hashCode());
  }

  /**
   * Test {@link UserGroupMembershipData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupMembershipData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupMembershipData.equals(Object)",
    "int UserGroupMembershipData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserGroupMembershipData(), 1);
  }

  /**
   * Test {@link UserGroupMembershipData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupMembershipData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupMembershipData.equals(Object)",
    "int UserGroupMembershipData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserGroupMembershipData userGroupMembershipData = new UserGroupMembershipData();
    userGroupMembershipData.id("42");

    // Act and Assert
    assertNotEquals(userGroupMembershipData, new UserGroupMembershipData());
  }

  /**
   * Test {@link UserGroupMembershipData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupMembershipData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupMembershipData.equals(Object)",
    "int UserGroupMembershipData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserGroupMembershipData userGroupMembershipData = new UserGroupMembershipData();
    userGroupMembershipData.groupId("42");

    // Act and Assert
    assertNotEquals(userGroupMembershipData, new UserGroupMembershipData());
  }

  /**
   * Test {@link UserGroupMembershipData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupMembershipData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupMembershipData.equals(Object)",
    "int UserGroupMembershipData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    UserGroupMembershipData userGroupMembershipData = new UserGroupMembershipData();
    userGroupMembershipData.userId(1L);

    // Act and Assert
    assertNotEquals(userGroupMembershipData, new UserGroupMembershipData());
  }

  /**
   * Test {@link UserGroupMembershipData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupMembershipData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupMembershipData.equals(Object)",
    "int UserGroupMembershipData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    UserGroupMembershipData userGroupMembershipData = new UserGroupMembershipData();
    userGroupMembershipData.group(new UserGroupData());

    // Act and Assert
    assertNotEquals(userGroupMembershipData, new UserGroupMembershipData());
  }

  /**
   * Test {@link UserGroupMembershipData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupMembershipData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupMembershipData.equals(Object)",
    "int UserGroupMembershipData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    UserGroupMembershipData userGroupMembershipData = new UserGroupMembershipData();
    userGroupMembershipData.user(new MembershipData());

    // Act and Assert
    assertNotEquals(userGroupMembershipData, new UserGroupMembershipData());
  }

  /**
   * Test {@link UserGroupMembershipData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupMembershipData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupMembershipData.equals(Object)",
    "int UserGroupMembershipData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    UserGroupMembershipData userGroupMembershipData = new UserGroupMembershipData();
    userGroupMembershipData.active(true);

    // Act and Assert
    assertNotEquals(userGroupMembershipData, new UserGroupMembershipData());
  }

  /**
   * Test {@link UserGroupMembershipData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupMembershipData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupMembershipData.equals(Object)",
    "int UserGroupMembershipData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    UserGroupMembershipData userGroupMembershipData = new UserGroupMembershipData();
    userGroupMembershipData.lastAddedDate(1L);

    // Act and Assert
    assertNotEquals(userGroupMembershipData, new UserGroupMembershipData());
  }

  /**
   * Test {@link UserGroupMembershipData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupMembershipData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupMembershipData.equals(Object)",
    "int UserGroupMembershipData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    UserGroupMembershipData userGroupMembershipData = new UserGroupMembershipData();
    userGroupMembershipData.lastRemovedDate(1L);

    // Act and Assert
    assertNotEquals(userGroupMembershipData, new UserGroupMembershipData());
  }

  /**
   * Test {@link UserGroupMembershipData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupMembershipData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupMembershipData.equals(Object)",
    "int UserGroupMembershipData.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserGroupMembershipData(), null);
  }

  /**
   * Test {@link UserGroupMembershipData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupMembershipData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupMembershipData.equals(Object)",
    "int UserGroupMembershipData.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserGroupMembershipData(), "Different type to UserGroupMembershipData");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UserGroupMembershipData}
   *   <li>{@link UserGroupMembershipData#active(Boolean)}
   *   <li>{@link UserGroupMembershipData#group(UserGroupData)}
   *   <li>{@link UserGroupMembershipData#groupId(String)}
   *   <li>{@link UserGroupMembershipData#id(String)}
   *   <li>{@link UserGroupMembershipData#lastAddedDate(Long)}
   *   <li>{@link UserGroupMembershipData#lastRemovedDate(Long)}
   *   <li>{@link UserGroupMembershipData#setActive(Boolean)}
   *   <li>{@link UserGroupMembershipData#setGroup(UserGroupData)}
   *   <li>{@link UserGroupMembershipData#setGroupId(String)}
   *   <li>{@link UserGroupMembershipData#setId(String)}
   *   <li>{@link UserGroupMembershipData#setLastAddedDate(Long)}
   *   <li>{@link UserGroupMembershipData#setLastRemovedDate(Long)}
   *   <li>{@link UserGroupMembershipData#setUser(MembershipData)}
   *   <li>{@link UserGroupMembershipData#setUserId(Long)}
   *   <li>{@link UserGroupMembershipData#user(MembershipData)}
   *   <li>{@link UserGroupMembershipData#userId(Long)}
   *   <li>{@link UserGroupMembershipData#toString()}
   *   <li>{@link UserGroupMembershipData#getActive()}
   *   <li>{@link UserGroupMembershipData#getGroup()}
   *   <li>{@link UserGroupMembershipData#getGroupId()}
   *   <li>{@link UserGroupMembershipData#getId()}
   *   <li>{@link UserGroupMembershipData#getLastAddedDate()}
   *   <li>{@link UserGroupMembershipData#getLastRemovedDate()}
   *   <li>{@link UserGroupMembershipData#getUser()}
   *   <li>{@link UserGroupMembershipData#getUserId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserGroupMembershipData.<init>()",
    "UserGroupMembershipData UserGroupMembershipData.active(Boolean)",
    "Boolean UserGroupMembershipData.getActive()",
    "UserGroupData UserGroupMembershipData.getGroup()",
    "String UserGroupMembershipData.getGroupId()",
    "String UserGroupMembershipData.getId()",
    "Long UserGroupMembershipData.getLastAddedDate()",
    "Long UserGroupMembershipData.getLastRemovedDate()",
    "MembershipData UserGroupMembershipData.getUser()",
    "Long UserGroupMembershipData.getUserId()",
    "UserGroupMembershipData UserGroupMembershipData.group(UserGroupData)",
    "UserGroupMembershipData UserGroupMembershipData.groupId(String)",
    "UserGroupMembershipData UserGroupMembershipData.id(String)",
    "UserGroupMembershipData UserGroupMembershipData.lastAddedDate(Long)",
    "UserGroupMembershipData UserGroupMembershipData.lastRemovedDate(Long)",
    "void UserGroupMembershipData.setActive(Boolean)",
    "void UserGroupMembershipData.setGroup(UserGroupData)",
    "void UserGroupMembershipData.setGroupId(String)",
    "void UserGroupMembershipData.setId(String)",
    "void UserGroupMembershipData.setLastAddedDate(Long)",
    "void UserGroupMembershipData.setLastRemovedDate(Long)",
    "void UserGroupMembershipData.setUser(MembershipData)",
    "void UserGroupMembershipData.setUserId(Long)",
    "String UserGroupMembershipData.toString()",
    "UserGroupMembershipData UserGroupMembershipData.user(MembershipData)",
    "UserGroupMembershipData UserGroupMembershipData.userId(Long)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    UserGroupMembershipData actualUserGroupMembershipData = new UserGroupMembershipData();
    UserGroupMembershipData actualActiveResult = actualUserGroupMembershipData.active(true);
    UserGroupMembershipData actualGroupResult =
        actualUserGroupMembershipData.group(new UserGroupData());
    UserGroupMembershipData actualGroupIdResult = actualUserGroupMembershipData.groupId("42");
    UserGroupMembershipData actualIdResult = actualUserGroupMembershipData.id("42");
    UserGroupMembershipData actualLastAddedDateResult =
        actualUserGroupMembershipData.lastAddedDate(1L);
    UserGroupMembershipData actualLastRemovedDateResult =
        actualUserGroupMembershipData.lastRemovedDate(1L);
    actualUserGroupMembershipData.setActive(true);
    UserGroupData group = new UserGroupData();
    actualUserGroupMembershipData.setGroup(group);
    actualUserGroupMembershipData.setGroupId("42");
    actualUserGroupMembershipData.setId("42");
    actualUserGroupMembershipData.setLastAddedDate(1L);
    actualUserGroupMembershipData.setLastRemovedDate(1L);
    actualUserGroupMembershipData.setUser(new MembershipData());
    actualUserGroupMembershipData.setUserId(1L);
    MembershipData user = new MembershipData();
    UserGroupMembershipData actualUserResult = actualUserGroupMembershipData.user(user);
    UserGroupMembershipData actualUserIdResult = actualUserGroupMembershipData.userId(1L);
    String actualToStringResult = actualUserGroupMembershipData.toString();
    Boolean actualActive = actualUserGroupMembershipData.getActive();
    UserGroupData actualGroup = actualUserGroupMembershipData.getGroup();
    String actualGroupId = actualUserGroupMembershipData.getGroupId();
    String actualId = actualUserGroupMembershipData.getId();
    Long actualLastAddedDate = actualUserGroupMembershipData.getLastAddedDate();
    Long actualLastRemovedDate = actualUserGroupMembershipData.getLastRemovedDate();
    MembershipData actualUser = actualUserGroupMembershipData.getUser();
    Long actualUserId = actualUserGroupMembershipData.getUserId();

    // Assert
    assertEquals("42", actualGroupId);
    assertEquals("42", actualId);
    assertEquals(
        "class UserGroupMembershipData {\n"
            + "    id: 42\n"
            + "    groupId: 42\n"
            + "    userId: 1\n"
            + "    group: class UserGroupData {\n"
            + "        id: null\n"
            + "        name: null\n"
            + "        area: null\n"
            + "        type: null\n"
            + "        active: null\n"
            + "    }\n"
            + "    user: class MembershipData {\n"
            + "        id: null\n"
            + "        userName: null\n"
            + "        firstName: null\n"
            + "        lastName: null\n"
            + "        emailAddress: null\n"
            + "    }\n"
            + "    active: true\n"
            + "    lastAddedDate: 1\n"
            + "    lastRemovedDate: 1\n"
            + "}",
        actualToStringResult);
    assertEquals(1L, actualLastAddedDate.longValue());
    assertEquals(1L, actualLastRemovedDate.longValue());
    assertEquals(1L, actualUserId.longValue());
    assertTrue(actualActive);
    assertSame(user, actualUser);
    assertSame(group, actualGroup);
    assertSame(actualUserGroupMembershipData, actualActiveResult);
    assertSame(actualUserGroupMembershipData, actualGroupResult);
    assertSame(actualUserGroupMembershipData, actualGroupIdResult);
    assertSame(actualUserGroupMembershipData, actualIdResult);
    assertSame(actualUserGroupMembershipData, actualLastAddedDateResult);
    assertSame(actualUserGroupMembershipData, actualLastRemovedDateResult);
    assertSame(actualUserGroupMembershipData, actualUserResult);
    assertSame(actualUserGroupMembershipData, actualUserIdResult);
  }
}
