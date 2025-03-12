package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserSuspensionDiffblueTest {
  /**
   * Test {@link UserSuspension#equals(Object)}, and {@link UserSuspension#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserSuspension#equals(Object)}
   *   <li>{@link UserSuspension#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserSuspension.equals(Object)", "int UserSuspension.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserSuspension userSuspension = new UserSuspension();
    UserSuspension userSuspension2 = new UserSuspension();

    // Act and Assert
    assertEquals(userSuspension, userSuspension2);
    int expectedHashCodeResult = userSuspension.hashCode();
    assertEquals(expectedHashCodeResult, userSuspension2.hashCode());
  }

  /**
   * Test {@link UserSuspension#equals(Object)}, and {@link UserSuspension#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserSuspension#equals(Object)}
   *   <li>{@link UserSuspension#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserSuspension.equals(Object)", "int UserSuspension.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserSuspension userSuspension = new UserSuspension();

    // Act and Assert
    assertEquals(userSuspension, userSuspension);
    int expectedHashCodeResult = userSuspension.hashCode();
    assertEquals(expectedHashCodeResult, userSuspension.hashCode());
  }

  /**
   * Test {@link UserSuspension#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserSuspension#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserSuspension.equals(Object)", "int UserSuspension.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserSuspension(), 1);
  }

  /**
   * Test {@link UserSuspension#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserSuspension#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserSuspension.equals(Object)", "int UserSuspension.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserSuspension userSuspension = new UserSuspension();
    userSuspension.suspended(true);

    // Act and Assert
    assertNotEquals(userSuspension, new UserSuspension());
  }

  /**
   * Test {@link UserSuspension#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserSuspension#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserSuspension.equals(Object)", "int UserSuspension.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserSuspension userSuspension = new UserSuspension();
    userSuspension.suspendedUntil(1L);

    // Act and Assert
    assertNotEquals(userSuspension, new UserSuspension());
  }

  /**
   * Test {@link UserSuspension#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserSuspension#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserSuspension.equals(Object)", "int UserSuspension.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    UserSuspension userSuspension = new UserSuspension();
    userSuspension.suspensionReason("Just cause");

    // Act and Assert
    assertNotEquals(userSuspension, new UserSuspension());
  }

  /**
   * Test {@link UserSuspension#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserSuspension#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserSuspension.equals(Object)", "int UserSuspension.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserSuspension(), null);
  }

  /**
   * Test {@link UserSuspension#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserSuspension#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserSuspension.equals(Object)", "int UserSuspension.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserSuspension(), "Different type to UserSuspension");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link UserSuspension}
   *   <li>{@link UserSuspension#setSuspended(Boolean)}
   *   <li>{@link UserSuspension#setSuspendedUntil(Long)}
   *   <li>{@link UserSuspension#setSuspensionReason(String)}
   *   <li>{@link UserSuspension#suspended(Boolean)}
   *   <li>{@link UserSuspension#suspendedUntil(Long)}
   *   <li>{@link UserSuspension#suspensionReason(String)}
   *   <li>{@link UserSuspension#toString()}
   *   <li>{@link UserSuspension#getSuspended()}
   *   <li>{@link UserSuspension#getSuspendedUntil()}
   *   <li>{@link UserSuspension#getSuspensionReason()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void UserSuspension.<init>()", "Boolean UserSuspension.getSuspended()",
      "Long UserSuspension.getSuspendedUntil()", "String UserSuspension.getSuspensionReason()",
      "void UserSuspension.setSuspended(Boolean)", "void UserSuspension.setSuspendedUntil(Long)",
      "void UserSuspension.setSuspensionReason(String)", "UserSuspension UserSuspension.suspended(Boolean)",
      "UserSuspension UserSuspension.suspendedUntil(Long)", "UserSuspension UserSuspension.suspensionReason(String)",
      "String UserSuspension.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    UserSuspension actualUserSuspension = new UserSuspension();
    actualUserSuspension.setSuspended(true);
    actualUserSuspension.setSuspendedUntil(1L);
    actualUserSuspension.setSuspensionReason("Just cause");
    UserSuspension actualSuspendedResult = actualUserSuspension.suspended(true);
    UserSuspension actualSuspendedUntilResult = actualUserSuspension.suspendedUntil(1L);
    UserSuspension actualSuspensionReasonResult = actualUserSuspension.suspensionReason("Just cause");
    String actualToStringResult = actualUserSuspension.toString();
    Boolean actualSuspended = actualUserSuspension.getSuspended();
    Long actualSuspendedUntil = actualUserSuspension.getSuspendedUntil();

    // Assert
    assertEquals("Just cause", actualUserSuspension.getSuspensionReason());
    assertEquals(
        "class UserSuspension {\n    suspended: true\n    suspendedUntil: 1\n    suspensionReason: Just cause\n}",
        actualToStringResult);
    assertEquals(1L, actualSuspendedUntil.longValue());
    assertTrue(actualSuspended);
    assertSame(actualUserSuspension, actualSuspendedResult);
    assertSame(actualUserSuspension, actualSuspendedUntilResult);
    assertSame(actualUserSuspension, actualSuspensionReasonResult);
  }
}
