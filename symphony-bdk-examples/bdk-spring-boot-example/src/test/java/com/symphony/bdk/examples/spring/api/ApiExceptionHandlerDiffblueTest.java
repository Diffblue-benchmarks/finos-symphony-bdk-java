package com.symphony.bdk.examples.spring.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.examples.spring.api.ApiExceptionHandler.ErrorMessage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ApiExceptionHandlerDiffblueTest {
  /**
   * Test ErrorMessage {@link ErrorMessage#equals(Object)}, and {@link ErrorMessage#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ErrorMessage#equals(Object)}
   *   <li>{@link ErrorMessage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test ErrorMessage equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ErrorMessage.equals(Object)", "int ErrorMessage.hashCode()"})
  void testErrorMessageEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ErrorMessage errorMessage = new ErrorMessage();
    errorMessage.setCode("Code");
    errorMessage.setMessage("An error occurred");

    ErrorMessage errorMessage2 = new ErrorMessage();
    errorMessage2.setCode("Code");
    errorMessage2.setMessage("An error occurred");

    // Act and Assert
    assertEquals(errorMessage, errorMessage2);
    int expectedHashCodeResult = errorMessage.hashCode();
    assertEquals(expectedHashCodeResult, errorMessage2.hashCode());
  }

  /**
   * Test ErrorMessage {@link ErrorMessage#equals(Object)}, and {@link ErrorMessage#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ErrorMessage#equals(Object)}
   *   <li>{@link ErrorMessage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test ErrorMessage equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ErrorMessage.equals(Object)", "int ErrorMessage.hashCode()"})
  void testErrorMessageEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    ErrorMessage errorMessage = new ErrorMessage();
    errorMessage.setCode(null);
    errorMessage.setMessage("An error occurred");

    ErrorMessage errorMessage2 = new ErrorMessage();
    errorMessage2.setCode(null);
    errorMessage2.setMessage("An error occurred");

    // Act and Assert
    assertEquals(errorMessage, errorMessage2);
    int expectedHashCodeResult = errorMessage.hashCode();
    assertEquals(expectedHashCodeResult, errorMessage2.hashCode());
  }

  /**
   * Test ErrorMessage {@link ErrorMessage#equals(Object)}, and {@link ErrorMessage#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ErrorMessage#equals(Object)}
   *   <li>{@link ErrorMessage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test ErrorMessage equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ErrorMessage.equals(Object)", "int ErrorMessage.hashCode()"})
  void testErrorMessageEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual3() {
    // Arrange
    ErrorMessage errorMessage = new ErrorMessage();
    errorMessage.setCode("Code");
    errorMessage.setMessage(null);

    ErrorMessage errorMessage2 = new ErrorMessage();
    errorMessage2.setCode("Code");
    errorMessage2.setMessage(null);

    // Act and Assert
    assertEquals(errorMessage, errorMessage2);
    int expectedHashCodeResult = errorMessage.hashCode();
    assertEquals(expectedHashCodeResult, errorMessage2.hashCode());
  }

  /**
   * Test ErrorMessage {@link ErrorMessage#equals(Object)}, and {@link ErrorMessage#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ErrorMessage#equals(Object)}
   *   <li>{@link ErrorMessage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test ErrorMessage equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ErrorMessage.equals(Object)", "int ErrorMessage.hashCode()"})
  void testErrorMessageEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ErrorMessage errorMessage = new ErrorMessage();
    errorMessage.setCode("Code");
    errorMessage.setMessage("An error occurred");

    // Act and Assert
    assertEquals(errorMessage, errorMessage);
    int expectedHashCodeResult = errorMessage.hashCode();
    assertEquals(expectedHashCodeResult, errorMessage.hashCode());
  }

  /**
   * Test ErrorMessage {@link ErrorMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ErrorMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test ErrorMessage equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ErrorMessage.equals(Object)", "int ErrorMessage.hashCode()"})
  void testErrorMessageEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ErrorMessage errorMessage = new ErrorMessage();
    errorMessage.setCode("An error occurred");
    errorMessage.setMessage("An error occurred");

    ErrorMessage errorMessage2 = new ErrorMessage();
    errorMessage2.setCode("Code");
    errorMessage2.setMessage("An error occurred");

    // Act and Assert
    assertNotEquals(errorMessage, errorMessage2);
  }

  /**
   * Test ErrorMessage {@link ErrorMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ErrorMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test ErrorMessage equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ErrorMessage.equals(Object)", "int ErrorMessage.hashCode()"})
  void testErrorMessageEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ErrorMessage errorMessage = new ErrorMessage();
    errorMessage.setCode(null);
    errorMessage.setMessage("An error occurred");

    ErrorMessage errorMessage2 = new ErrorMessage();
    errorMessage2.setCode("Code");
    errorMessage2.setMessage("An error occurred");

    // Act and Assert
    assertNotEquals(errorMessage, errorMessage2);
  }

  /**
   * Test ErrorMessage {@link ErrorMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ErrorMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test ErrorMessage equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ErrorMessage.equals(Object)", "int ErrorMessage.hashCode()"})
  void testErrorMessageEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ErrorMessage errorMessage = new ErrorMessage();
    errorMessage.setCode("Code");
    errorMessage.setMessage("Not all who wander are lost");

    ErrorMessage errorMessage2 = new ErrorMessage();
    errorMessage2.setCode("Code");
    errorMessage2.setMessage("An error occurred");

    // Act and Assert
    assertNotEquals(errorMessage, errorMessage2);
  }

  /**
   * Test ErrorMessage {@link ErrorMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ErrorMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test ErrorMessage equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ErrorMessage.equals(Object)", "int ErrorMessage.hashCode()"})
  void testErrorMessageEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    ErrorMessage errorMessage = new ErrorMessage();
    errorMessage.setCode("Code");
    errorMessage.setMessage(null);

    ErrorMessage errorMessage2 = new ErrorMessage();
    errorMessage2.setCode("Code");
    errorMessage2.setMessage("An error occurred");

    // Act and Assert
    assertNotEquals(errorMessage, errorMessage2);
  }

  /**
   * Test ErrorMessage {@link ErrorMessage#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ErrorMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test ErrorMessage equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ErrorMessage.equals(Object)", "int ErrorMessage.hashCode()"})
  void testErrorMessageEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    ErrorMessage errorMessage = new ErrorMessage();
    errorMessage.setCode("Code");
    errorMessage.setMessage("An error occurred");

    // Act and Assert
    assertNotEquals(errorMessage, null);
  }

  /**
   * Test ErrorMessage {@link ErrorMessage#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ErrorMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test ErrorMessage equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ErrorMessage.equals(Object)", "int ErrorMessage.hashCode()"})
  void testErrorMessageEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    ErrorMessage errorMessage = new ErrorMessage();
    errorMessage.setCode("Code");
    errorMessage.setMessage("An error occurred");

    // Act and Assert
    assertNotEquals(errorMessage, "Different type to ErrorMessage");
  }

  /**
   * Test ErrorMessage getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link ErrorMessage}
   *   <li>{@link ErrorMessage#setCode(String)}
   *   <li>{@link ErrorMessage#setMessage(String)}
   *   <li>{@link ErrorMessage#toString()}
   *   <li>{@link ErrorMessage#getCode()}
   *   <li>{@link ErrorMessage#getMessage()}
   * </ul>
   */
  @Test
  @DisplayName("Test ErrorMessage getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ErrorMessage.<init>()", "String ErrorMessage.getCode()", "String ErrorMessage.getMessage()",
      "void ErrorMessage.setCode(String)", "void ErrorMessage.setMessage(String)", "String ErrorMessage.toString()"})
  void testErrorMessageGettersAndSetters() {
    // Arrange and Act
    ErrorMessage actualErrorMessage = new ErrorMessage();
    actualErrorMessage.setCode("Code");
    actualErrorMessage.setMessage("An error occurred");
    String actualToStringResult = actualErrorMessage.toString();
    String actualCode = actualErrorMessage.getCode();

    // Assert
    assertEquals("An error occurred", actualErrorMessage.getMessage());
    assertEquals("ApiExceptionHandler.ErrorMessage(code=Code, message=An error occurred)", actualToStringResult);
    assertEquals("Code", actualCode);
  }
}
