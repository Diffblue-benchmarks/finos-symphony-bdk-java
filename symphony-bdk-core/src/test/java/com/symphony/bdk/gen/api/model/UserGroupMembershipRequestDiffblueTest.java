package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserGroupMembershipRequestDiffblueTest {
  /**
   * Test {@link UserGroupMembershipRequest#equals(Object)}, and {@link UserGroupMembershipRequest#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserGroupMembershipRequest#equals(Object)}
   *   <li>{@link UserGroupMembershipRequest#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupMembershipRequest.equals(Object)", "int UserGroupMembershipRequest.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserGroupMembershipRequest userGroupMembershipRequest = new UserGroupMembershipRequest();
    UserGroupMembershipRequest userGroupMembershipRequest2 = new UserGroupMembershipRequest();

    // Act and Assert
    assertEquals(userGroupMembershipRequest, userGroupMembershipRequest2);
    int expectedHashCodeResult = userGroupMembershipRequest.hashCode();
    assertEquals(expectedHashCodeResult, userGroupMembershipRequest2.hashCode());
  }

  /**
   * Test {@link UserGroupMembershipRequest#equals(Object)}, and {@link UserGroupMembershipRequest#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserGroupMembershipRequest#equals(Object)}
   *   <li>{@link UserGroupMembershipRequest#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupMembershipRequest.equals(Object)", "int UserGroupMembershipRequest.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserGroupMembershipRequest userGroupMembershipRequest = new UserGroupMembershipRequest();

    // Act and Assert
    assertEquals(userGroupMembershipRequest, userGroupMembershipRequest);
    int expectedHashCodeResult = userGroupMembershipRequest.hashCode();
    assertEquals(expectedHashCodeResult, userGroupMembershipRequest.hashCode());
  }

  /**
   * Test {@link UserGroupMembershipRequest#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupMembershipRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupMembershipRequest.equals(Object)", "int UserGroupMembershipRequest.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserGroupMembershipRequest(), null);
  }

  /**
   * Test {@link UserGroupMembershipRequest#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupMembershipRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupMembershipRequest.equals(Object)", "int UserGroupMembershipRequest.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserGroupMembershipRequest(), null);
  }

  /**
   * Test {@link UserGroupMembershipRequest#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupMembershipRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupMembershipRequest.equals(Object)", "int UserGroupMembershipRequest.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserGroupMembershipRequest(), "Different type to UserGroupMembershipRequest");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link UserGroupMembershipRequest}
   *   <li>{@link UserGroupMembershipRequest#active(Boolean)}
   *   <li>{@link UserGroupMembershipRequest#setActive(Boolean)}
   *   <li>{@link UserGroupMembershipRequest#toString()}
   *   <li>{@link UserGroupMembershipRequest#getActive()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void UserGroupMembershipRequest.<init>()",
      "UserGroupMembershipRequest UserGroupMembershipRequest.active(Boolean)",
      "Boolean UserGroupMembershipRequest.getActive()", "void UserGroupMembershipRequest.setActive(Boolean)",
      "String UserGroupMembershipRequest.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    UserGroupMembershipRequest actualUserGroupMembershipRequest = new UserGroupMembershipRequest();
    UserGroupMembershipRequest actualActiveResult = actualUserGroupMembershipRequest.active(true);
    actualUserGroupMembershipRequest.setActive(true);
    String actualToStringResult = actualUserGroupMembershipRequest.toString();

    // Assert
    assertEquals("class UserGroupMembershipRequest {\n    active: true\n}", actualToStringResult);
    assertTrue(actualUserGroupMembershipRequest.getActive());
    assertSame(actualUserGroupMembershipRequest, actualActiveResult);
  }
}
