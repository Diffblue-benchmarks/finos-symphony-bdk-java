package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ErrorDiffblueTest {
  /**
   * Test {@link Error#equals(Object)}, and {@link Error#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Error#equals(Object)}
   *   <li>{@link Error#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Error.equals(Object)", "int Error.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Error error = new Error();
    Error error2 = new Error();

    // Act and Assert
    assertEquals(error, error2);
    assertEquals(error.hashCode(), error2.hashCode());
  }

  /**
   * Test {@link Error#equals(Object)}, and {@link Error#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Error#equals(Object)}
   *   <li>{@link Error#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Error.equals(Object)", "int Error.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Error error = new Error();

    // Act and Assert
    assertEquals(error, error);
    int expectedHashCodeResult = error.hashCode();
    assertEquals(expectedHashCodeResult, error.hashCode());
  }

  /**
   * Test {@link Error#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Error#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Error.equals(Object)", "int Error.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Error(), 1);
  }

  /**
   * Test {@link Error#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Error#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Error.equals(Object)", "int Error.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Error error = new Error();
    error.code(1);

    // Act and Assert
    assertNotEquals(error, new Error());
  }

  /**
   * Test {@link Error#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Error#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Error.equals(Object)", "int Error.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Error error = new Error();
    error.message("Not all who wander are lost");

    // Act and Assert
    assertNotEquals(error, new Error());
  }

  /**
   * Test {@link Error#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Error#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Error.equals(Object)", "int Error.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Error(), null);
  }

  /**
   * Test {@link Error#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Error#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Error.equals(Object)", "int Error.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Error(), "Different type to Error");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link Error}
   *   <li>{@link Error#code(Integer)}
   *   <li>{@link Error#message(String)}
   *   <li>{@link Error#setCode(Integer)}
   *   <li>{@link Error#setMessage(String)}
   *   <li>{@link Error#toString()}
   *   <li>{@link Error#getCode()}
   *   <li>{@link Error#getMessage()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Error.<init>()",
    "Error Error.code(Integer)",
    "Integer Error.getCode()",
    "String Error.getMessage()",
    "Error Error.message(String)",
    "void Error.setCode(Integer)",
    "void Error.setMessage(String)",
    "String Error.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    Error actualError = new Error();
    Error actualCodeResult = actualError.code(1);
    Error actualMessageResult = actualError.message("Not all who wander are lost");
    actualError.setCode(1);
    actualError.setMessage("Not all who wander are lost");
    String actualToStringResult = actualError.toString();
    Integer actualCode = actualError.getCode();

    // Assert
    assertEquals("Not all who wander are lost", actualError.getMessage());
    assertEquals(
        "class Error {\n    code: 1\n    message: Not all who wander are lost\n}",
        actualToStringResult);
    assertEquals(1, actualCode.intValue());
    assertSame(actualError, actualCodeResult);
    assertSame(actualError, actualMessageResult);
  }
}
