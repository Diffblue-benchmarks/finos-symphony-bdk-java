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

class UserGroupAssigneeUpdateDiffblueTest {
  /**
   * Test {@link UserGroupAssigneeUpdate#equals(Object)}, and {@link
   * UserGroupAssigneeUpdate#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserGroupAssigneeUpdate#equals(Object)}
   *   <li>{@link UserGroupAssigneeUpdate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupAssigneeUpdate.equals(Object)",
    "int UserGroupAssigneeUpdate.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserGroupAssigneeUpdate userGroupAssigneeUpdate = new UserGroupAssigneeUpdate();
    UserGroupAssigneeUpdate userGroupAssigneeUpdate2 = new UserGroupAssigneeUpdate();

    // Act and Assert
    assertEquals(userGroupAssigneeUpdate, userGroupAssigneeUpdate2);
    assertEquals(userGroupAssigneeUpdate.hashCode(), userGroupAssigneeUpdate2.hashCode());
  }

  /**
   * Test {@link UserGroupAssigneeUpdate#equals(Object)}, and {@link
   * UserGroupAssigneeUpdate#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserGroupAssigneeUpdate#equals(Object)}
   *   <li>{@link UserGroupAssigneeUpdate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupAssigneeUpdate.equals(Object)",
    "int UserGroupAssigneeUpdate.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserGroupAssigneeUpdate userGroupAssigneeUpdate = new UserGroupAssigneeUpdate();

    // Act and Assert
    assertEquals(userGroupAssigneeUpdate, userGroupAssigneeUpdate);
    int expectedHashCodeResult = userGroupAssigneeUpdate.hashCode();
    assertEquals(expectedHashCodeResult, userGroupAssigneeUpdate.hashCode());
  }

  /**
   * Test {@link UserGroupAssigneeUpdate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupAssigneeUpdate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupAssigneeUpdate.equals(Object)",
    "int UserGroupAssigneeUpdate.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserGroupAssigneeUpdate(), null);
  }

  /**
   * Test {@link UserGroupAssigneeUpdate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupAssigneeUpdate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupAssigneeUpdate.equals(Object)",
    "int UserGroupAssigneeUpdate.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserGroupAssigneeUpdate(), "Different type to UserGroupAssigneeUpdate");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UserGroupAssigneeUpdate}
   *   <li>{@link UserGroupAssigneeUpdate#current(Boolean)}
   *   <li>{@link UserGroupAssigneeUpdate#setCurrent(Boolean)}
   *   <li>{@link UserGroupAssigneeUpdate#toString()}
   *   <li>{@link UserGroupAssigneeUpdate#getCurrent()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserGroupAssigneeUpdate.<init>()",
    "UserGroupAssigneeUpdate UserGroupAssigneeUpdate.current(Boolean)",
    "Boolean UserGroupAssigneeUpdate.getCurrent()",
    "void UserGroupAssigneeUpdate.setCurrent(Boolean)",
    "String UserGroupAssigneeUpdate.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    UserGroupAssigneeUpdate actualUserGroupAssigneeUpdate = new UserGroupAssigneeUpdate();
    UserGroupAssigneeUpdate actualCurrentResult = actualUserGroupAssigneeUpdate.current(true);
    actualUserGroupAssigneeUpdate.setCurrent(true);
    String actualToStringResult = actualUserGroupAssigneeUpdate.toString();

    // Assert
    assertEquals("class UserGroupAssigneeUpdate {\n    current: true\n}", actualToStringResult);
    assertTrue(actualUserGroupAssigneeUpdate.getCurrent());
    assertSame(actualUserGroupAssigneeUpdate, actualCurrentResult);
  }
}
