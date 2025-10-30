package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserGroupMembershipUpdateDiffblueTest {
  /**
   * Test {@link UserGroupMembershipUpdate#equals(Object)}, and {@link UserGroupMembershipUpdate#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserGroupMembershipUpdate#equals(Object)}
   *   <li>{@link UserGroupMembershipUpdate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupMembershipUpdate.equals(Object)", "int UserGroupMembershipUpdate.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserGroupMembershipUpdate userGroupMembershipUpdate = new UserGroupMembershipUpdate();
    UserGroupMembershipUpdate userGroupMembershipUpdate2 = new UserGroupMembershipUpdate();

    // Act and Assert
    assertEquals(userGroupMembershipUpdate, userGroupMembershipUpdate2);
    int expectedHashCodeResult = userGroupMembershipUpdate.hashCode();
    assertEquals(expectedHashCodeResult, userGroupMembershipUpdate2.hashCode());
  }

  /**
   * Test {@link UserGroupMembershipUpdate#equals(Object)}, and {@link UserGroupMembershipUpdate#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserGroupMembershipUpdate#equals(Object)}
   *   <li>{@link UserGroupMembershipUpdate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupMembershipUpdate.equals(Object)", "int UserGroupMembershipUpdate.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserGroupMembershipUpdate userGroupMembershipUpdate = new UserGroupMembershipUpdate();

    // Act and Assert
    assertEquals(userGroupMembershipUpdate, userGroupMembershipUpdate);
    int expectedHashCodeResult = userGroupMembershipUpdate.hashCode();
    assertEquals(expectedHashCodeResult, userGroupMembershipUpdate.hashCode());
  }

  /**
   * Test {@link UserGroupMembershipUpdate#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupMembershipUpdate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupMembershipUpdate.equals(Object)", "int UserGroupMembershipUpdate.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserGroupMembershipUpdate(), null);
  }

  /**
   * Test {@link UserGroupMembershipUpdate#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupMembershipUpdate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupMembershipUpdate.equals(Object)", "int UserGroupMembershipUpdate.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserGroupMembershipUpdate(), null);
  }

  /**
   * Test {@link UserGroupMembershipUpdate#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupMembershipUpdate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupMembershipUpdate.equals(Object)", "int UserGroupMembershipUpdate.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserGroupMembershipUpdate(), "Different type to UserGroupMembershipUpdate");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link UserGroupMembershipUpdate}
   *   <li>{@link UserGroupMembershipUpdate#active(Boolean)}
   *   <li>{@link UserGroupMembershipUpdate#setActive(Boolean)}
   *   <li>{@link UserGroupMembershipUpdate#toString()}
   *   <li>{@link UserGroupMembershipUpdate#getActive()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void UserGroupMembershipUpdate.<init>()",
      "UserGroupMembershipUpdate UserGroupMembershipUpdate.active(Boolean)",
      "Boolean UserGroupMembershipUpdate.getActive()", "void UserGroupMembershipUpdate.setActive(Boolean)",
      "String UserGroupMembershipUpdate.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    UserGroupMembershipUpdate actualUserGroupMembershipUpdate = new UserGroupMembershipUpdate();
    UserGroupMembershipUpdate actualActiveResult = actualUserGroupMembershipUpdate.active(true);
    actualUserGroupMembershipUpdate.setActive(true);
    String actualToStringResult = actualUserGroupMembershipUpdate.toString();

    // Assert
    assertEquals("class UserGroupMembershipUpdate {\n    active: true\n}", actualToStringResult);
    assertTrue(actualUserGroupMembershipUpdate.getActive());
    assertSame(actualUserGroupMembershipUpdate, actualActiveResult);
  }
}
