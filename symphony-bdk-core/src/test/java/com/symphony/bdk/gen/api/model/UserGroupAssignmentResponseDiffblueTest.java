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

class UserGroupAssignmentResponseDiffblueTest {
  /**
   * Test {@link UserGroupAssignmentResponse#addUserRolesItem(String)}.
   *
   * <ul>
   *   <li>Given {@link UserGroupAssignmentResponse} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link UserGroupAssignmentResponse#addUserRolesItem(String)}
   */
  @Test
  @DisplayName(
      "Test addUserRolesItem(String); given UserGroupAssignmentResponse (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UserGroupAssignmentResponse UserGroupAssignmentResponse.addUserRolesItem(String)"
  })
  void testAddUserRolesItem_givenUserGroupAssignmentResponse() {
    // Arrange
    UserGroupAssignmentResponse userGroupAssignmentResponse = new UserGroupAssignmentResponse();

    // Act and Assert
    assertSame(
        userGroupAssignmentResponse,
        userGroupAssignmentResponse.addUserRolesItem("User Roles Item"));
  }

  /**
   * Test {@link UserGroupAssignmentResponse#addUserRolesItem(String)}.
   *
   * <ul>
   *   <li>Given {@link UserGroupAssignmentResponse} (default constructor) userRoles {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupAssignmentResponse#addUserRolesItem(String)}
   */
  @Test
  @DisplayName(
      "Test addUserRolesItem(String); given UserGroupAssignmentResponse (default constructor) userRoles ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UserGroupAssignmentResponse UserGroupAssignmentResponse.addUserRolesItem(String)"
  })
  void testAddUserRolesItem_givenUserGroupAssignmentResponseUserRolesArrayList() {
    // Arrange
    UserGroupAssignmentResponse userGroupAssignmentResponse = new UserGroupAssignmentResponse();
    userGroupAssignmentResponse.userRoles(new ArrayList<>());

    // Act and Assert
    assertSame(
        userGroupAssignmentResponse,
        userGroupAssignmentResponse.addUserRolesItem("User Roles Item"));
  }

  /**
   * Test {@link UserGroupAssignmentResponse#equals(Object)}, and {@link
   * UserGroupAssignmentResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserGroupAssignmentResponse#equals(Object)}
   *   <li>{@link UserGroupAssignmentResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupAssignmentResponse.equals(Object)",
    "int UserGroupAssignmentResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserGroupAssignmentResponse userGroupAssignmentResponse = new UserGroupAssignmentResponse();
    UserGroupAssignmentResponse userGroupAssignmentResponse2 = new UserGroupAssignmentResponse();

    // Act and Assert
    assertEquals(userGroupAssignmentResponse, userGroupAssignmentResponse2);
    int expectedHashCodeResult = userGroupAssignmentResponse.hashCode();
    assertEquals(expectedHashCodeResult, userGroupAssignmentResponse2.hashCode());
  }

  /**
   * Test {@link UserGroupAssignmentResponse#equals(Object)}, and {@link
   * UserGroupAssignmentResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserGroupAssignmentResponse#equals(Object)}
   *   <li>{@link UserGroupAssignmentResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupAssignmentResponse.equals(Object)",
    "int UserGroupAssignmentResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserGroupAssignmentResponse userGroupAssignmentResponse = new UserGroupAssignmentResponse();

    // Act and Assert
    assertEquals(userGroupAssignmentResponse, userGroupAssignmentResponse);
    int expectedHashCodeResult = userGroupAssignmentResponse.hashCode();
    assertEquals(expectedHashCodeResult, userGroupAssignmentResponse.hashCode());
  }

  /**
   * Test {@link UserGroupAssignmentResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupAssignmentResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupAssignmentResponse.equals(Object)",
    "int UserGroupAssignmentResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    UserGroupAssignmentResponse userGroupAssignmentResponse = new UserGroupAssignmentResponse();
    userGroupAssignmentResponse.addUserRolesItem("User Roles Item");

    // Act and Assert
    assertNotEquals(userGroupAssignmentResponse, new UserGroupAssignmentResponse());
  }

  /**
   * Test {@link UserGroupAssignmentResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupAssignmentResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupAssignmentResponse.equals(Object)",
    "int UserGroupAssignmentResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserGroupAssignmentResponse userGroupAssignmentResponse = new UserGroupAssignmentResponse();
    userGroupAssignmentResponse.id("42");
    userGroupAssignmentResponse.addUserRolesItem("User Roles Item");

    // Act and Assert
    assertNotEquals(userGroupAssignmentResponse, new UserGroupAssignmentResponse());
  }

  /**
   * Test {@link UserGroupAssignmentResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupAssignmentResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupAssignmentResponse.equals(Object)",
    "int UserGroupAssignmentResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserGroupAssignmentResponse userGroupAssignmentResponse = new UserGroupAssignmentResponse();
    userGroupAssignmentResponse.groupId("42");
    userGroupAssignmentResponse.addUserRolesItem("User Roles Item");

    // Act and Assert
    assertNotEquals(userGroupAssignmentResponse, new UserGroupAssignmentResponse());
  }

  /**
   * Test {@link UserGroupAssignmentResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupAssignmentResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupAssignmentResponse.equals(Object)",
    "int UserGroupAssignmentResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    UserGroupAssignmentResponse userGroupAssignmentResponse = new UserGroupAssignmentResponse();
    userGroupAssignmentResponse.group(new GroupRoleScope());
    userGroupAssignmentResponse.addUserRolesItem("User Roles Item");

    // Act and Assert
    assertNotEquals(userGroupAssignmentResponse, new UserGroupAssignmentResponse());
  }

  /**
   * Test {@link UserGroupAssignmentResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupAssignmentResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupAssignmentResponse.equals(Object)",
    "int UserGroupAssignmentResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    UserGroupAssignmentResponse userGroupAssignmentResponse = new UserGroupAssignmentResponse();
    userGroupAssignmentResponse.userId(1L);
    userGroupAssignmentResponse.addUserRolesItem("User Roles Item");

    // Act and Assert
    assertNotEquals(userGroupAssignmentResponse, new UserGroupAssignmentResponse());
  }

  /**
   * Test {@link UserGroupAssignmentResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupAssignmentResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupAssignmentResponse.equals(Object)",
    "int UserGroupAssignmentResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    UserGroupAssignmentResponse userGroupAssignmentResponse = new UserGroupAssignmentResponse();
    userGroupAssignmentResponse.user(new UserCompp());
    userGroupAssignmentResponse.addUserRolesItem("User Roles Item");

    // Act and Assert
    assertNotEquals(userGroupAssignmentResponse, new UserGroupAssignmentResponse());
  }

  /**
   * Test {@link UserGroupAssignmentResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupAssignmentResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupAssignmentResponse.equals(Object)",
    "int UserGroupAssignmentResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    UserGroupAssignmentResponse userGroupAssignmentResponse = new UserGroupAssignmentResponse();
    userGroupAssignmentResponse.active(true);

    // Act and Assert
    assertNotEquals(userGroupAssignmentResponse, new UserGroupAssignmentResponse());
  }

  /**
   * Test {@link UserGroupAssignmentResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupAssignmentResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupAssignmentResponse.equals(Object)",
    "int UserGroupAssignmentResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    UserGroupAssignmentResponse userGroupAssignmentResponse = new UserGroupAssignmentResponse();
    userGroupAssignmentResponse.lastAddedDate(1L);

    // Act and Assert
    assertNotEquals(userGroupAssignmentResponse, new UserGroupAssignmentResponse());
  }

  /**
   * Test {@link UserGroupAssignmentResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupAssignmentResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupAssignmentResponse.equals(Object)",
    "int UserGroupAssignmentResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    UserGroupAssignmentResponse userGroupAssignmentResponse = new UserGroupAssignmentResponse();
    userGroupAssignmentResponse.lastRemovedDate(1L);

    // Act and Assert
    assertNotEquals(userGroupAssignmentResponse, new UserGroupAssignmentResponse());
  }

  /**
   * Test {@link UserGroupAssignmentResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupAssignmentResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupAssignmentResponse.equals(Object)",
    "int UserGroupAssignmentResponse.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserGroupAssignmentResponse(), null);
  }

  /**
   * Test {@link UserGroupAssignmentResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupAssignmentResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupAssignmentResponse.equals(Object)",
    "int UserGroupAssignmentResponse.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new UserGroupAssignmentResponse(), "Different type to UserGroupAssignmentResponse");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UserGroupAssignmentResponse}
   *   <li>{@link UserGroupAssignmentResponse#active(Boolean)}
   *   <li>{@link UserGroupAssignmentResponse#group(GroupRoleScope)}
   *   <li>{@link UserGroupAssignmentResponse#groupId(String)}
   *   <li>{@link UserGroupAssignmentResponse#id(String)}
   *   <li>{@link UserGroupAssignmentResponse#lastAddedDate(Long)}
   *   <li>{@link UserGroupAssignmentResponse#lastRemovedDate(Long)}
   *   <li>{@link UserGroupAssignmentResponse#setActive(Boolean)}
   *   <li>{@link UserGroupAssignmentResponse#setGroup(GroupRoleScope)}
   *   <li>{@link UserGroupAssignmentResponse#setGroupId(String)}
   *   <li>{@link UserGroupAssignmentResponse#setId(String)}
   *   <li>{@link UserGroupAssignmentResponse#setLastAddedDate(Long)}
   *   <li>{@link UserGroupAssignmentResponse#setLastRemovedDate(Long)}
   *   <li>{@link UserGroupAssignmentResponse#setUser(UserCompp)}
   *   <li>{@link UserGroupAssignmentResponse#setUserId(Long)}
   *   <li>{@link UserGroupAssignmentResponse#setUserRoles(List)}
   *   <li>{@link UserGroupAssignmentResponse#user(UserCompp)}
   *   <li>{@link UserGroupAssignmentResponse#userId(Long)}
   *   <li>{@link UserGroupAssignmentResponse#userRoles(List)}
   *   <li>{@link UserGroupAssignmentResponse#toString()}
   *   <li>{@link UserGroupAssignmentResponse#getActive()}
   *   <li>{@link UserGroupAssignmentResponse#getGroup()}
   *   <li>{@link UserGroupAssignmentResponse#getGroupId()}
   *   <li>{@link UserGroupAssignmentResponse#getId()}
   *   <li>{@link UserGroupAssignmentResponse#getLastAddedDate()}
   *   <li>{@link UserGroupAssignmentResponse#getLastRemovedDate()}
   *   <li>{@link UserGroupAssignmentResponse#getUser()}
   *   <li>{@link UserGroupAssignmentResponse#getUserId()}
   *   <li>{@link UserGroupAssignmentResponse#getUserRoles()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserGroupAssignmentResponse.<init>()",
    "UserGroupAssignmentResponse UserGroupAssignmentResponse.active(Boolean)",
    "Boolean UserGroupAssignmentResponse.getActive()",
    "GroupRoleScope UserGroupAssignmentResponse.getGroup()",
    "String UserGroupAssignmentResponse.getGroupId()",
    "String UserGroupAssignmentResponse.getId()",
    "Long UserGroupAssignmentResponse.getLastAddedDate()",
    "Long UserGroupAssignmentResponse.getLastRemovedDate()",
    "UserCompp UserGroupAssignmentResponse.getUser()",
    "Long UserGroupAssignmentResponse.getUserId()",
    "List UserGroupAssignmentResponse.getUserRoles()",
    "UserGroupAssignmentResponse UserGroupAssignmentResponse.group(GroupRoleScope)",
    "UserGroupAssignmentResponse UserGroupAssignmentResponse.groupId(String)",
    "UserGroupAssignmentResponse UserGroupAssignmentResponse.id(String)",
    "UserGroupAssignmentResponse UserGroupAssignmentResponse.lastAddedDate(Long)",
    "UserGroupAssignmentResponse UserGroupAssignmentResponse.lastRemovedDate(Long)",
    "void UserGroupAssignmentResponse.setActive(Boolean)",
    "void UserGroupAssignmentResponse.setGroup(GroupRoleScope)",
    "void UserGroupAssignmentResponse.setGroupId(String)",
    "void UserGroupAssignmentResponse.setId(String)",
    "void UserGroupAssignmentResponse.setLastAddedDate(Long)",
    "void UserGroupAssignmentResponse.setLastRemovedDate(Long)",
    "void UserGroupAssignmentResponse.setUser(UserCompp)",
    "void UserGroupAssignmentResponse.setUserId(Long)",
    "void UserGroupAssignmentResponse.setUserRoles(List)",
    "String UserGroupAssignmentResponse.toString()",
    "UserGroupAssignmentResponse UserGroupAssignmentResponse.user(UserCompp)",
    "UserGroupAssignmentResponse UserGroupAssignmentResponse.userId(Long)",
    "UserGroupAssignmentResponse UserGroupAssignmentResponse.userRoles(List)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    UserGroupAssignmentResponse actualUserGroupAssignmentResponse =
        new UserGroupAssignmentResponse();
    UserGroupAssignmentResponse actualActiveResult = actualUserGroupAssignmentResponse.active(true);
    UserGroupAssignmentResponse actualGroupResult =
        actualUserGroupAssignmentResponse.group(new GroupRoleScope());
    UserGroupAssignmentResponse actualGroupIdResult =
        actualUserGroupAssignmentResponse.groupId("42");
    UserGroupAssignmentResponse actualIdResult = actualUserGroupAssignmentResponse.id("42");
    UserGroupAssignmentResponse actualLastAddedDateResult =
        actualUserGroupAssignmentResponse.lastAddedDate(1L);
    UserGroupAssignmentResponse actualLastRemovedDateResult =
        actualUserGroupAssignmentResponse.lastRemovedDate(1L);
    actualUserGroupAssignmentResponse.setActive(true);
    GroupRoleScope group = new GroupRoleScope();
    actualUserGroupAssignmentResponse.setGroup(group);
    actualUserGroupAssignmentResponse.setGroupId("42");
    actualUserGroupAssignmentResponse.setId("42");
    actualUserGroupAssignmentResponse.setLastAddedDate(1L);
    actualUserGroupAssignmentResponse.setLastRemovedDate(1L);
    actualUserGroupAssignmentResponse.setUser(new UserCompp());
    actualUserGroupAssignmentResponse.setUserId(1L);
    actualUserGroupAssignmentResponse.setUserRoles(new ArrayList<>());
    UserCompp user = new UserCompp();
    UserGroupAssignmentResponse actualUserResult = actualUserGroupAssignmentResponse.user(user);
    UserGroupAssignmentResponse actualUserIdResult = actualUserGroupAssignmentResponse.userId(1L);
    ArrayList<String> userRoles = new ArrayList<>();
    UserGroupAssignmentResponse actualUserRolesResult =
        actualUserGroupAssignmentResponse.userRoles(userRoles);
    String actualToStringResult = actualUserGroupAssignmentResponse.toString();
    Boolean actualActive = actualUserGroupAssignmentResponse.getActive();
    GroupRoleScope actualGroup = actualUserGroupAssignmentResponse.getGroup();
    String actualGroupId = actualUserGroupAssignmentResponse.getGroupId();
    String actualId = actualUserGroupAssignmentResponse.getId();
    Long actualLastAddedDate = actualUserGroupAssignmentResponse.getLastAddedDate();
    Long actualLastRemovedDate = actualUserGroupAssignmentResponse.getLastRemovedDate();
    UserCompp actualUser = actualUserGroupAssignmentResponse.getUser();
    Long actualUserId = actualUserGroupAssignmentResponse.getUserId();
    List<String> actualUserRoles = actualUserGroupAssignmentResponse.getUserRoles();

    // Assert
    assertEquals("42", actualGroupId);
    assertEquals("42", actualId);
    assertEquals(
        "class UserGroupAssignmentResponse {\n"
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
            + "    userRoles: []\n"
            + "    active: true\n"
            + "    lastAddedDate: 1\n"
            + "    lastRemovedDate: 1\n"
            + "}",
        actualToStringResult);
    assertEquals(1L, actualLastAddedDate.longValue());
    assertEquals(1L, actualLastRemovedDate.longValue());
    assertEquals(1L, actualUserId.longValue());
    assertTrue(actualActive);
    assertTrue(actualUserRoles.isEmpty());
    assertSame(group, actualGroup);
    assertSame(user, actualUser);
    assertSame(actualUserGroupAssignmentResponse, actualActiveResult);
    assertSame(actualUserGroupAssignmentResponse, actualGroupResult);
    assertSame(actualUserGroupAssignmentResponse, actualGroupIdResult);
    assertSame(actualUserGroupAssignmentResponse, actualIdResult);
    assertSame(actualUserGroupAssignmentResponse, actualLastAddedDateResult);
    assertSame(actualUserGroupAssignmentResponse, actualLastRemovedDateResult);
    assertSame(actualUserGroupAssignmentResponse, actualUserResult);
    assertSame(actualUserGroupAssignmentResponse, actualUserIdResult);
    assertSame(actualUserGroupAssignmentResponse, actualUserRolesResult);
    assertSame(userRoles, actualUserRoles);
  }
}
