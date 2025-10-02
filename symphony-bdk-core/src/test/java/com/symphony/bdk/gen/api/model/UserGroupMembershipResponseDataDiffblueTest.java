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

class UserGroupMembershipResponseDataDiffblueTest {
  /**
   * Test {@link UserGroupMembershipResponseData#equals(Object)}, and {@link
   * UserGroupMembershipResponseData#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserGroupMembershipResponseData#equals(Object)}
   *   <li>{@link UserGroupMembershipResponseData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupMembershipResponseData.equals(Object)",
    "int UserGroupMembershipResponseData.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserGroupMembershipResponseData userGroupMembershipResponseData =
        new UserGroupMembershipResponseData();
    UserGroupMembershipResponseData userGroupMembershipResponseData2 =
        new UserGroupMembershipResponseData();

    // Act and Assert
    assertEquals(userGroupMembershipResponseData, userGroupMembershipResponseData2);
    assertEquals(
        userGroupMembershipResponseData.hashCode(), userGroupMembershipResponseData2.hashCode());
  }

  /**
   * Test {@link UserGroupMembershipResponseData#equals(Object)}, and {@link
   * UserGroupMembershipResponseData#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserGroupMembershipResponseData#equals(Object)}
   *   <li>{@link UserGroupMembershipResponseData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupMembershipResponseData.equals(Object)",
    "int UserGroupMembershipResponseData.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserGroupMembershipResponseData userGroupMembershipResponseData =
        new UserGroupMembershipResponseData();

    // Act and Assert
    assertEquals(userGroupMembershipResponseData, userGroupMembershipResponseData);
    int expectedHashCodeResult = userGroupMembershipResponseData.hashCode();
    assertEquals(expectedHashCodeResult, userGroupMembershipResponseData.hashCode());
  }

  /**
   * Test {@link UserGroupMembershipResponseData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupMembershipResponseData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupMembershipResponseData.equals(Object)",
    "int UserGroupMembershipResponseData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserGroupMembershipResponseData(), 1);
  }

  /**
   * Test {@link UserGroupMembershipResponseData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupMembershipResponseData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupMembershipResponseData.equals(Object)",
    "int UserGroupMembershipResponseData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserGroupMembershipResponseData userGroupMembershipResponseData =
        new UserGroupMembershipResponseData();
    userGroupMembershipResponseData.id("42");

    // Act and Assert
    assertNotEquals(userGroupMembershipResponseData, new UserGroupMembershipResponseData());
  }

  /**
   * Test {@link UserGroupMembershipResponseData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupMembershipResponseData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupMembershipResponseData.equals(Object)",
    "int UserGroupMembershipResponseData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserGroupMembershipResponseData userGroupMembershipResponseData =
        new UserGroupMembershipResponseData();
    userGroupMembershipResponseData.groupId("42");

    // Act and Assert
    assertNotEquals(userGroupMembershipResponseData, new UserGroupMembershipResponseData());
  }

  /**
   * Test {@link UserGroupMembershipResponseData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupMembershipResponseData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupMembershipResponseData.equals(Object)",
    "int UserGroupMembershipResponseData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    UserGroupMembershipResponseData userGroupMembershipResponseData =
        new UserGroupMembershipResponseData();
    userGroupMembershipResponseData.group(new GroupRoleScope());

    // Act and Assert
    assertNotEquals(userGroupMembershipResponseData, new UserGroupMembershipResponseData());
  }

  /**
   * Test {@link UserGroupMembershipResponseData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupMembershipResponseData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupMembershipResponseData.equals(Object)",
    "int UserGroupMembershipResponseData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    UserGroupMembershipResponseData userGroupMembershipResponseData =
        new UserGroupMembershipResponseData();
    userGroupMembershipResponseData.userId(1L);

    // Act and Assert
    assertNotEquals(userGroupMembershipResponseData, new UserGroupMembershipResponseData());
  }

  /**
   * Test {@link UserGroupMembershipResponseData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupMembershipResponseData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupMembershipResponseData.equals(Object)",
    "int UserGroupMembershipResponseData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    UserGroupMembershipResponseData userGroupMembershipResponseData =
        new UserGroupMembershipResponseData();
    userGroupMembershipResponseData.user(new UserCompp());

    // Act and Assert
    assertNotEquals(userGroupMembershipResponseData, new UserGroupMembershipResponseData());
  }

  /**
   * Test {@link UserGroupMembershipResponseData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupMembershipResponseData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupMembershipResponseData.equals(Object)",
    "int UserGroupMembershipResponseData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    UserGroupMembershipResponseData userGroupMembershipResponseData =
        new UserGroupMembershipResponseData();
    userGroupMembershipResponseData.active(true);

    // Act and Assert
    assertNotEquals(userGroupMembershipResponseData, new UserGroupMembershipResponseData());
  }

  /**
   * Test {@link UserGroupMembershipResponseData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupMembershipResponseData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupMembershipResponseData.equals(Object)",
    "int UserGroupMembershipResponseData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    UserGroupMembershipResponseData userGroupMembershipResponseData =
        new UserGroupMembershipResponseData();
    userGroupMembershipResponseData.lastAddedDate(1L);

    // Act and Assert
    assertNotEquals(userGroupMembershipResponseData, new UserGroupMembershipResponseData());
  }

  /**
   * Test {@link UserGroupMembershipResponseData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupMembershipResponseData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupMembershipResponseData.equals(Object)",
    "int UserGroupMembershipResponseData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    UserGroupMembershipResponseData userGroupMembershipResponseData =
        new UserGroupMembershipResponseData();
    userGroupMembershipResponseData.lastRemovedDate(1L);

    // Act and Assert
    assertNotEquals(userGroupMembershipResponseData, new UserGroupMembershipResponseData());
  }

  /**
   * Test {@link UserGroupMembershipResponseData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupMembershipResponseData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupMembershipResponseData.equals(Object)",
    "int UserGroupMembershipResponseData.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserGroupMembershipResponseData(), null);
  }

  /**
   * Test {@link UserGroupMembershipResponseData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupMembershipResponseData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupMembershipResponseData.equals(Object)",
    "int UserGroupMembershipResponseData.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new UserGroupMembershipResponseData(), "Different type to UserGroupMembershipResponseData");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UserGroupMembershipResponseData}
   *   <li>{@link UserGroupMembershipResponseData#active(Boolean)}
   *   <li>{@link UserGroupMembershipResponseData#group(GroupRoleScope)}
   *   <li>{@link UserGroupMembershipResponseData#groupId(String)}
   *   <li>{@link UserGroupMembershipResponseData#id(String)}
   *   <li>{@link UserGroupMembershipResponseData#lastAddedDate(Long)}
   *   <li>{@link UserGroupMembershipResponseData#lastRemovedDate(Long)}
   *   <li>{@link UserGroupMembershipResponseData#setActive(Boolean)}
   *   <li>{@link UserGroupMembershipResponseData#setGroup(GroupRoleScope)}
   *   <li>{@link UserGroupMembershipResponseData#setGroupId(String)}
   *   <li>{@link UserGroupMembershipResponseData#setId(String)}
   *   <li>{@link UserGroupMembershipResponseData#setLastAddedDate(Long)}
   *   <li>{@link UserGroupMembershipResponseData#setLastRemovedDate(Long)}
   *   <li>{@link UserGroupMembershipResponseData#setUser(UserCompp)}
   *   <li>{@link UserGroupMembershipResponseData#setUserId(Long)}
   *   <li>{@link UserGroupMembershipResponseData#user(UserCompp)}
   *   <li>{@link UserGroupMembershipResponseData#userId(Long)}
   *   <li>{@link UserGroupMembershipResponseData#toString()}
   *   <li>{@link UserGroupMembershipResponseData#getActive()}
   *   <li>{@link UserGroupMembershipResponseData#getGroup()}
   *   <li>{@link UserGroupMembershipResponseData#getGroupId()}
   *   <li>{@link UserGroupMembershipResponseData#getId()}
   *   <li>{@link UserGroupMembershipResponseData#getLastAddedDate()}
   *   <li>{@link UserGroupMembershipResponseData#getLastRemovedDate()}
   *   <li>{@link UserGroupMembershipResponseData#getUser()}
   *   <li>{@link UserGroupMembershipResponseData#getUserId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserGroupMembershipResponseData.<init>()",
    "UserGroupMembershipResponseData UserGroupMembershipResponseData.active(Boolean)",
    "Boolean UserGroupMembershipResponseData.getActive()",
    "GroupRoleScope UserGroupMembershipResponseData.getGroup()",
    "String UserGroupMembershipResponseData.getGroupId()",
    "String UserGroupMembershipResponseData.getId()",
    "Long UserGroupMembershipResponseData.getLastAddedDate()",
    "Long UserGroupMembershipResponseData.getLastRemovedDate()",
    "UserCompp UserGroupMembershipResponseData.getUser()",
    "Long UserGroupMembershipResponseData.getUserId()",
    "UserGroupMembershipResponseData UserGroupMembershipResponseData.group(GroupRoleScope)",
    "UserGroupMembershipResponseData UserGroupMembershipResponseData.groupId(String)",
    "UserGroupMembershipResponseData UserGroupMembershipResponseData.id(String)",
    "UserGroupMembershipResponseData UserGroupMembershipResponseData.lastAddedDate(Long)",
    "UserGroupMembershipResponseData UserGroupMembershipResponseData.lastRemovedDate(Long)",
    "void UserGroupMembershipResponseData.setActive(Boolean)",
    "void UserGroupMembershipResponseData.setGroup(GroupRoleScope)",
    "void UserGroupMembershipResponseData.setGroupId(String)",
    "void UserGroupMembershipResponseData.setId(String)",
    "void UserGroupMembershipResponseData.setLastAddedDate(Long)",
    "void UserGroupMembershipResponseData.setLastRemovedDate(Long)",
    "void UserGroupMembershipResponseData.setUser(UserCompp)",
    "void UserGroupMembershipResponseData.setUserId(Long)",
    "String UserGroupMembershipResponseData.toString()",
    "UserGroupMembershipResponseData UserGroupMembershipResponseData.user(UserCompp)",
    "UserGroupMembershipResponseData UserGroupMembershipResponseData.userId(Long)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    UserGroupMembershipResponseData actualUserGroupMembershipResponseData =
        new UserGroupMembershipResponseData();
    UserGroupMembershipResponseData actualActiveResult =
        actualUserGroupMembershipResponseData.active(true);
    UserGroupMembershipResponseData actualGroupResult =
        actualUserGroupMembershipResponseData.group(new GroupRoleScope());
    UserGroupMembershipResponseData actualGroupIdResult =
        actualUserGroupMembershipResponseData.groupId("42");
    UserGroupMembershipResponseData actualIdResult = actualUserGroupMembershipResponseData.id("42");
    UserGroupMembershipResponseData actualLastAddedDateResult =
        actualUserGroupMembershipResponseData.lastAddedDate(1L);
    UserGroupMembershipResponseData actualLastRemovedDateResult =
        actualUserGroupMembershipResponseData.lastRemovedDate(1L);
    actualUserGroupMembershipResponseData.setActive(true);
    GroupRoleScope group = new GroupRoleScope();
    actualUserGroupMembershipResponseData.setGroup(group);
    actualUserGroupMembershipResponseData.setGroupId("42");
    actualUserGroupMembershipResponseData.setId("42");
    actualUserGroupMembershipResponseData.setLastAddedDate(1L);
    actualUserGroupMembershipResponseData.setLastRemovedDate(1L);
    actualUserGroupMembershipResponseData.setUser(new UserCompp());
    actualUserGroupMembershipResponseData.setUserId(1L);
    UserCompp user = new UserCompp();
    UserGroupMembershipResponseData actualUserResult =
        actualUserGroupMembershipResponseData.user(user);
    UserGroupMembershipResponseData actualUserIdResult =
        actualUserGroupMembershipResponseData.userId(1L);
    String actualToStringResult = actualUserGroupMembershipResponseData.toString();
    Boolean actualActive = actualUserGroupMembershipResponseData.getActive();
    GroupRoleScope actualGroup = actualUserGroupMembershipResponseData.getGroup();
    String actualGroupId = actualUserGroupMembershipResponseData.getGroupId();
    String actualId = actualUserGroupMembershipResponseData.getId();
    Long actualLastAddedDate = actualUserGroupMembershipResponseData.getLastAddedDate();
    Long actualLastRemovedDate = actualUserGroupMembershipResponseData.getLastRemovedDate();
    UserCompp actualUser = actualUserGroupMembershipResponseData.getUser();
    Long actualUserId = actualUserGroupMembershipResponseData.getUserId();

    // Assert
    assertEquals("42", actualGroupId);
    assertEquals("42", actualId);
    assertEquals(
        "class UserGroupMembershipResponseData {\n"
            + "    id: 42\n"
            + "    groupId: 42\n"
            + "    group: class GroupRoleScope {\n"
            + "        id: null\n"
            + "        name: null\n"
            + "        area: null\n"
            + "        type: null\n"
            + "        active: null\n"
            + "    }\n"
            + "    userId: 1\n"
            + "    user: class UserCompp {\n"
            + "        id: null\n"
            + "        username: null\n"
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
    assertSame(group, actualGroup);
    assertSame(user, actualUser);
    assertSame(actualUserGroupMembershipResponseData, actualActiveResult);
    assertSame(actualUserGroupMembershipResponseData, actualGroupResult);
    assertSame(actualUserGroupMembershipResponseData, actualGroupIdResult);
    assertSame(actualUserGroupMembershipResponseData, actualIdResult);
    assertSame(actualUserGroupMembershipResponseData, actualLastAddedDateResult);
    assertSame(actualUserGroupMembershipResponseData, actualLastRemovedDateResult);
    assertSame(actualUserGroupMembershipResponseData, actualUserResult);
    assertSame(actualUserGroupMembershipResponseData, actualUserIdResult);
  }
}
