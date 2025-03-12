package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserErrorDiffblueTest {
  /**
   * Test {@link UserError#equals(Object)}, and {@link UserError#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserError#equals(Object)}
   *   <li>{@link UserError#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserError.equals(Object)", "int UserError.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserError userError = new UserError();
    UserError userError2 = new UserError();

    // Act and Assert
    assertEquals(userError, userError2);
    int expectedHashCodeResult = userError.hashCode();
    assertEquals(expectedHashCodeResult, userError2.hashCode());
  }

  /**
   * Test {@link UserError#equals(Object)}, and {@link UserError#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserError#equals(Object)}
   *   <li>{@link UserError#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserError.equals(Object)", "int UserError.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserError userError = new UserError();

    // Act and Assert
    assertEquals(userError, userError);
    int expectedHashCodeResult = userError.hashCode();
    assertEquals(expectedHashCodeResult, userError.hashCode());
  }

  /**
   * Test {@link UserError#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserError#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserError.equals(Object)", "int UserError.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserError(), 1);
  }

  /**
   * Test {@link UserError#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserError#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserError.equals(Object)", "int UserError.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserError userError = new UserError();
    userError.error("An error occurred");

    // Act and Assert
    assertNotEquals(userError, new UserError());
  }

  /**
   * Test {@link UserError#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserError#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserError.equals(Object)", "int UserError.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserError userError = new UserError();
    userError.email("jane.doe@example.org");

    // Act and Assert
    assertNotEquals(userError, new UserError());
  }

  /**
   * Test {@link UserError#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserError#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserError.equals(Object)", "int UserError.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    UserError userError = new UserError();
    userError.id("42");

    // Act and Assert
    assertNotEquals(userError, new UserError());
  }

  /**
   * Test {@link UserError#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserError#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserError.equals(Object)", "int UserError.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserError(), null);
  }

  /**
   * Test {@link UserError#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserError#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserError.equals(Object)", "int UserError.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserError(), "Different type to UserError");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link UserError}
   *   <li>{@link UserError#email(String)}
   *   <li>{@link UserError#error(String)}
   *   <li>{@link UserError#id(String)}
   *   <li>{@link UserError#setEmail(String)}
   *   <li>{@link UserError#setError(String)}
   *   <li>{@link UserError#setId(String)}
   *   <li>{@link UserError#toString()}
   *   <li>{@link UserError#getEmail()}
   *   <li>{@link UserError#getError()}
   *   <li>{@link UserError#getId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void UserError.<init>()", "UserError UserError.email(String)",
      "UserError UserError.error(String)", "String UserError.getEmail()", "String UserError.getError()",
      "String UserError.getId()", "UserError UserError.id(String)", "void UserError.setEmail(String)",
      "void UserError.setError(String)", "void UserError.setId(String)", "String UserError.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    UserError actualUserError = new UserError();
    UserError actualEmailResult = actualUserError.email("jane.doe@example.org");
    UserError actualErrorResult = actualUserError.error("An error occurred");
    UserError actualIdResult = actualUserError.id("42");
    actualUserError.setEmail("jane.doe@example.org");
    actualUserError.setError("An error occurred");
    actualUserError.setId("42");
    String actualToStringResult = actualUserError.toString();
    String actualEmail = actualUserError.getEmail();
    String actualError = actualUserError.getError();

    // Assert
    assertEquals("42", actualUserError.getId());
    assertEquals("An error occurred", actualError);
    assertEquals("class UserError {\n    error: An error occurred\n    email: jane.doe@example.org\n    id: 42\n}",
        actualToStringResult);
    assertEquals("jane.doe@example.org", actualEmail);
    assertSame(actualUserError, actualEmailResult);
    assertSame(actualUserError, actualErrorResult);
    assertSame(actualUserError, actualIdResult);
  }
}
