package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserNameDiffblueTest {
  /**
   * Test {@link UserName#equals(Object)}, and {@link UserName#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserName#equals(Object)}
   *   <li>{@link UserName#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserName.equals(Object)", "int UserName.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserName userName = new UserName();
    UserName userName2 = new UserName();

    // Act and Assert
    assertEquals(userName, userName2);
    int expectedHashCodeResult = userName.hashCode();
    assertEquals(expectedHashCodeResult, userName2.hashCode());
  }

  /**
   * Test {@link UserName#equals(Object)}, and {@link UserName#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserName#equals(Object)}
   *   <li>{@link UserName#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserName.equals(Object)", "int UserName.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserName userName = new UserName();

    // Act and Assert
    assertEquals(userName, userName);
    int expectedHashCodeResult = userName.hashCode();
    assertEquals(expectedHashCodeResult, userName.hashCode());
  }

  /**
   * Test {@link UserName#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserName#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserName.equals(Object)", "int UserName.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserName(), null);
  }

  /**
   * Test {@link UserName#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserName#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserName.equals(Object)", "int UserName.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserName(), "Different type to UserName");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UserName}
   *   <li>{@link UserName#setUsername(String)}
   *   <li>{@link UserName#username(String)}
   *   <li>{@link UserName#toString()}
   *   <li>{@link UserName#getUsername()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserName.<init>()",
    "String UserName.getUsername()",
    "void UserName.setUsername(String)",
    "String UserName.toString()",
    "UserName UserName.username(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    UserName actualUserName = new UserName();
    actualUserName.setUsername("janedoe");
    UserName actualUsernameResult = actualUserName.username("janedoe");
    String actualToStringResult = actualUserName.toString();

    // Assert
    assertEquals("class UserName {\n    username: janedoe\n}", actualToStringResult);
    assertEquals("janedoe", actualUserName.getUsername());
    assertSame(actualUserName, actualUsernameResult);
  }
}
