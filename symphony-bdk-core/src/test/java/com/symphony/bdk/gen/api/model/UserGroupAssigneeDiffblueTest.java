package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserGroupAssigneeDiffblueTest {
  /**
   * Test {@link UserGroupAssignee#addUserRolesItem(String)}.
   * <ul>
   *   <li>Given {@link UserGroupAssignee} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupAssignee#addUserRolesItem(String)}
   */
  @Test
  @DisplayName("Test addUserRolesItem(String); given UserGroupAssignee (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"UserGroupAssignee UserGroupAssignee.addUserRolesItem(String)"})
  void testAddUserRolesItem_givenUserGroupAssignee() {
    // Arrange
    UserGroupAssignee userGroupAssignee = new UserGroupAssignee();

    // Act and Assert
    assertSame(userGroupAssignee, userGroupAssignee.addUserRolesItem("User Roles Item"));
  }

  /**
   * Test {@link UserGroupAssignee#addUserRolesItem(String)}.
   * <ul>
   *   <li>Given {@link UserGroupAssignee} (default constructor) userRoles {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupAssignee#addUserRolesItem(String)}
   */
  @Test
  @DisplayName("Test addUserRolesItem(String); given UserGroupAssignee (default constructor) userRoles ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"UserGroupAssignee UserGroupAssignee.addUserRolesItem(String)"})
  void testAddUserRolesItem_givenUserGroupAssigneeUserRolesArrayList() {
    // Arrange
    UserGroupAssignee userGroupAssignee = new UserGroupAssignee();
    userGroupAssignee.userRoles(new ArrayList<>());

    // Act and Assert
    assertSame(userGroupAssignee, userGroupAssignee.addUserRolesItem("User Roles Item"));
  }

  /**
   * Test {@link UserGroupAssignee#equals(Object)}, and {@link UserGroupAssignee#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserGroupAssignee#equals(Object)}
   *   <li>{@link UserGroupAssignee#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupAssignee.equals(Object)", "int UserGroupAssignee.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserGroupAssignee userGroupAssignee = new UserGroupAssignee();
    UserGroupAssignee userGroupAssignee2 = new UserGroupAssignee();

    // Act and Assert
    assertEquals(userGroupAssignee, userGroupAssignee2);
    int expectedHashCodeResult = userGroupAssignee.hashCode();
    assertEquals(expectedHashCodeResult, userGroupAssignee2.hashCode());
  }

  /**
   * Test {@link UserGroupAssignee#equals(Object)}, and {@link UserGroupAssignee#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserGroupAssignee#equals(Object)}
   *   <li>{@link UserGroupAssignee#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupAssignee.equals(Object)", "int UserGroupAssignee.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserGroupAssignee userGroupAssignee = new UserGroupAssignee();

    // Act and Assert
    assertEquals(userGroupAssignee, userGroupAssignee);
    int expectedHashCodeResult = userGroupAssignee.hashCode();
    assertEquals(expectedHashCodeResult, userGroupAssignee.hashCode());
  }

  /**
   * Test {@link UserGroupAssignee#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupAssignee#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupAssignee.equals(Object)", "int UserGroupAssignee.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    UserGroupAssignee userGroupAssignee = new UserGroupAssignee();
    userGroupAssignee.addUserRolesItem("User Roles Item");

    // Act and Assert
    assertNotEquals(userGroupAssignee, new UserGroupAssignee());
  }

  /**
   * Test {@link UserGroupAssignee#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupAssignee#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupAssignee.equals(Object)", "int UserGroupAssignee.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserGroupAssignee userGroupAssignee = new UserGroupAssignee();
    userGroupAssignee.id("42");
    userGroupAssignee.addUserRolesItem("User Roles Item");

    // Act and Assert
    assertNotEquals(userGroupAssignee, new UserGroupAssignee());
  }

  /**
   * Test {@link UserGroupAssignee#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupAssignee#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupAssignee.equals(Object)", "int UserGroupAssignee.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserGroupAssignee userGroupAssignee = new UserGroupAssignee();
    userGroupAssignee.groupId("42");
    userGroupAssignee.addUserRolesItem("User Roles Item");

    // Act and Assert
    assertNotEquals(userGroupAssignee, new UserGroupAssignee());
  }

  /**
   * Test {@link UserGroupAssignee#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupAssignee#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupAssignee.equals(Object)", "int UserGroupAssignee.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    UserGroupAssignee userGroupAssignee = new UserGroupAssignee();
    userGroupAssignee.group(new GroupRoleScope());
    userGroupAssignee.addUserRolesItem("User Roles Item");

    // Act and Assert
    assertNotEquals(userGroupAssignee, new UserGroupAssignee());
  }

  /**
   * Test {@link UserGroupAssignee#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupAssignee#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupAssignee.equals(Object)", "int UserGroupAssignee.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    UserGroupAssignee userGroupAssignee = new UserGroupAssignee();
    userGroupAssignee.userId(1L);
    userGroupAssignee.addUserRolesItem("User Roles Item");

    // Act and Assert
    assertNotEquals(userGroupAssignee, new UserGroupAssignee());
  }

  /**
   * Test {@link UserGroupAssignee#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupAssignee#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupAssignee.equals(Object)", "int UserGroupAssignee.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    UserGroupAssignee userGroupAssignee = new UserGroupAssignee();
    userGroupAssignee.user(new UserCompp());
    userGroupAssignee.addUserRolesItem("User Roles Item");

    // Act and Assert
    assertNotEquals(userGroupAssignee, new UserGroupAssignee());
  }

  /**
   * Test {@link UserGroupAssignee#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupAssignee#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupAssignee.equals(Object)", "int UserGroupAssignee.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    UserGroupAssignee userGroupAssignee = new UserGroupAssignee();
    userGroupAssignee.active(true);

    // Act and Assert
    assertNotEquals(userGroupAssignee, new UserGroupAssignee());
  }

  /**
   * Test {@link UserGroupAssignee#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupAssignee#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupAssignee.equals(Object)", "int UserGroupAssignee.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    UserGroupAssignee userGroupAssignee = new UserGroupAssignee();
    userGroupAssignee.lastAddedDate(1L);

    // Act and Assert
    assertNotEquals(userGroupAssignee, new UserGroupAssignee());
  }

  /**
   * Test {@link UserGroupAssignee#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupAssignee#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupAssignee.equals(Object)", "int UserGroupAssignee.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    UserGroupAssignee userGroupAssignee = new UserGroupAssignee();
    userGroupAssignee.lastRemovedDate(1L);

    // Act and Assert
    assertNotEquals(userGroupAssignee, new UserGroupAssignee());
  }

  /**
   * Test {@link UserGroupAssignee#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupAssignee#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupAssignee.equals(Object)", "int UserGroupAssignee.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserGroupAssignee(), null);
  }

  /**
   * Test {@link UserGroupAssignee#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupAssignee#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupAssignee.equals(Object)", "int UserGroupAssignee.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserGroupAssignee(), "Different type to UserGroupAssignee");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link UserGroupAssignee}
   *   <li>{@link UserGroupAssignee#active(Boolean)}
   *   <li>{@link UserGroupAssignee#group(GroupRoleScope)}
   *   <li>{@link UserGroupAssignee#groupId(String)}
   *   <li>{@link UserGroupAssignee#id(String)}
   *   <li>{@link UserGroupAssignee#lastAddedDate(Long)}
   *   <li>{@link UserGroupAssignee#lastRemovedDate(Long)}
   *   <li>{@link UserGroupAssignee#setActive(Boolean)}
   *   <li>{@link UserGroupAssignee#setGroup(GroupRoleScope)}
   *   <li>{@link UserGroupAssignee#setGroupId(String)}
   *   <li>{@link UserGroupAssignee#setId(String)}
   *   <li>{@link UserGroupAssignee#setLastAddedDate(Long)}
   *   <li>{@link UserGroupAssignee#setLastRemovedDate(Long)}
   *   <li>{@link UserGroupAssignee#setUser(UserCompp)}
   *   <li>{@link UserGroupAssignee#setUserId(Long)}
   *   <li>{@link UserGroupAssignee#setUserRoles(List)}
   *   <li>{@link UserGroupAssignee#user(UserCompp)}
   *   <li>{@link UserGroupAssignee#userId(Long)}
   *   <li>{@link UserGroupAssignee#userRoles(List)}
   *   <li>{@link UserGroupAssignee#toString()}
   *   <li>{@link UserGroupAssignee#getActive()}
   *   <li>{@link UserGroupAssignee#getGroup()}
   *   <li>{@link UserGroupAssignee#getGroupId()}
   *   <li>{@link UserGroupAssignee#getId()}
   *   <li>{@link UserGroupAssignee#getLastAddedDate()}
   *   <li>{@link UserGroupAssignee#getLastRemovedDate()}
   *   <li>{@link UserGroupAssignee#getUser()}
   *   <li>{@link UserGroupAssignee#getUserId()}
   *   <li>{@link UserGroupAssignee#getUserRoles()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void UserGroupAssignee.<init>()", "UserGroupAssignee UserGroupAssignee.active(Boolean)",
      "Boolean UserGroupAssignee.getActive()", "GroupRoleScope UserGroupAssignee.getGroup()",
      "String UserGroupAssignee.getGroupId()", "String UserGroupAssignee.getId()",
      "Long UserGroupAssignee.getLastAddedDate()", "Long UserGroupAssignee.getLastRemovedDate()",
      "UserCompp UserGroupAssignee.getUser()", "Long UserGroupAssignee.getUserId()",
      "List UserGroupAssignee.getUserRoles()", "UserGroupAssignee UserGroupAssignee.group(GroupRoleScope)",
      "UserGroupAssignee UserGroupAssignee.groupId(String)", "UserGroupAssignee UserGroupAssignee.id(String)",
      "UserGroupAssignee UserGroupAssignee.lastAddedDate(Long)",
      "UserGroupAssignee UserGroupAssignee.lastRemovedDate(Long)", "void UserGroupAssignee.setActive(Boolean)",
      "void UserGroupAssignee.setGroup(GroupRoleScope)", "void UserGroupAssignee.setGroupId(String)",
      "void UserGroupAssignee.setId(String)", "void UserGroupAssignee.setLastAddedDate(Long)",
      "void UserGroupAssignee.setLastRemovedDate(Long)", "void UserGroupAssignee.setUser(UserCompp)",
      "void UserGroupAssignee.setUserId(Long)", "void UserGroupAssignee.setUserRoles(List)",
      "String UserGroupAssignee.toString()", "UserGroupAssignee UserGroupAssignee.user(UserCompp)",
      "UserGroupAssignee UserGroupAssignee.userId(Long)", "UserGroupAssignee UserGroupAssignee.userRoles(List)"})
  void testGettersAndSetters() {
    // Arrange and Act
    UserGroupAssignee actualUserGroupAssignee = new UserGroupAssignee();
    UserGroupAssignee actualActiveResult = actualUserGroupAssignee.active(true);
    UserGroupAssignee actualGroupResult = actualUserGroupAssignee.group(new GroupRoleScope());
    UserGroupAssignee actualGroupIdResult = actualUserGroupAssignee.groupId("42");
    UserGroupAssignee actualIdResult = actualUserGroupAssignee.id("42");
    UserGroupAssignee actualLastAddedDateResult = actualUserGroupAssignee.lastAddedDate(1L);
    UserGroupAssignee actualLastRemovedDateResult = actualUserGroupAssignee.lastRemovedDate(1L);
    actualUserGroupAssignee.setActive(true);
    GroupRoleScope group = new GroupRoleScope();
    actualUserGroupAssignee.setGroup(group);
    actualUserGroupAssignee.setGroupId("42");
    actualUserGroupAssignee.setId("42");
    actualUserGroupAssignee.setLastAddedDate(1L);
    actualUserGroupAssignee.setLastRemovedDate(1L);
    actualUserGroupAssignee.setUser(new UserCompp());
    actualUserGroupAssignee.setUserId(1L);
    actualUserGroupAssignee.setUserRoles(new ArrayList<>());
    UserCompp user = new UserCompp();
    UserGroupAssignee actualUserResult = actualUserGroupAssignee.user(user);
    UserGroupAssignee actualUserIdResult = actualUserGroupAssignee.userId(1L);
    ArrayList<String> userRoles = new ArrayList<>();
    UserGroupAssignee actualUserRolesResult = actualUserGroupAssignee.userRoles(userRoles);
    String actualToStringResult = actualUserGroupAssignee.toString();
    Boolean actualActive = actualUserGroupAssignee.getActive();
    GroupRoleScope actualGroup = actualUserGroupAssignee.getGroup();
    String actualGroupId = actualUserGroupAssignee.getGroupId();
    String actualId = actualUserGroupAssignee.getId();
    Long actualLastAddedDate = actualUserGroupAssignee.getLastAddedDate();
    Long actualLastRemovedDate = actualUserGroupAssignee.getLastRemovedDate();
    UserCompp actualUser = actualUserGroupAssignee.getUser();
    Long actualUserId = actualUserGroupAssignee.getUserId();
    List<String> actualUserRoles = actualUserGroupAssignee.getUserRoles();

    // Assert
    assertEquals("42", actualGroupId);
    assertEquals("42", actualId);
    assertEquals("class UserGroupAssignee {\n" + "    id: 42\n" + "    groupId: 42\n"
        + "    group: class GroupRoleScope {\n" + "        id: null\n" + "        name: null\n" + "        area: null\n"
        + "        type: null\n" + "        active: null\n" + "    }\n" + "    userId: 1\n"
        + "    user: class UserCompp {\n" + "        id: null\n" + "        username: null\n"
        + "        firstName: null\n" + "        lastName: null\n" + "        emailAddress: null\n" + "    }\n"
        + "    userRoles: []\n" + "    active: true\n" + "    lastAddedDate: 1\n" + "    lastRemovedDate: 1\n" + "}",
        actualToStringResult);
    assertEquals(1L, actualLastAddedDate.longValue());
    assertEquals(1L, actualLastRemovedDate.longValue());
    assertEquals(1L, actualUserId.longValue());
    assertTrue(actualActive);
    assertTrue(actualUserRoles.isEmpty());
    assertSame(group, actualGroup);
    assertSame(user, actualUser);
    assertSame(actualUserGroupAssignee, actualActiveResult);
    assertSame(actualUserGroupAssignee, actualGroupResult);
    assertSame(actualUserGroupAssignee, actualGroupIdResult);
    assertSame(actualUserGroupAssignee, actualIdResult);
    assertSame(actualUserGroupAssignee, actualLastAddedDateResult);
    assertSame(actualUserGroupAssignee, actualLastRemovedDateResult);
    assertSame(actualUserGroupAssignee, actualUserResult);
    assertSame(actualUserGroupAssignee, actualUserIdResult);
    assertSame(actualUserGroupAssignee, actualUserRolesResult);
    assertSame(userRoles, actualUserRoles);
  }
}
