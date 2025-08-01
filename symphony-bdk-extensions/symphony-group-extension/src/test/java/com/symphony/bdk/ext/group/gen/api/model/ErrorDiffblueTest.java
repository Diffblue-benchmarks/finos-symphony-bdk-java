package com.symphony.bdk.ext.group.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ErrorDiffblueTest {
  /**
   * Test {@link Error#putContextItem(String, String)}.
   *
   * <ul>
   *   <li>Given {@link Error} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link Error#putContextItem(String, String)}
   */
  @Test
  @DisplayName("Test putContextItem(String, String); given Error (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Error Error.putContextItem(String, String)"})
  void testPutContextItem_givenError() {
    // Arrange
    Error error = new Error();

    // Act and Assert
    assertSame(error, error.putContextItem("Key", "Context Item"));
  }

  /**
   * Test {@link Error#putContextItem(String, String)}.
   *
   * <ul>
   *   <li>Given {@link Error} (default constructor) context {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link Error#putContextItem(String, String)}
   */
  @Test
  @DisplayName(
      "Test putContextItem(String, String); given Error (default constructor) context HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Error Error.putContextItem(String, String)"})
  void testPutContextItem_givenErrorContextHashMap() {
    // Arrange
    Error error = new Error();
    error.context(new HashMap<>());

    // Act and Assert
    assertSame(error, error.putContextItem("Key", "Context Item"));
  }

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
    int expectedHashCodeResult = error.hashCode();
    assertEquals(expectedHashCodeResult, error2.hashCode());
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
    // Arrange
    Error error = new Error();
    error.putContextItem("Key", "Context Item");

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
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Error error = new Error();
    error.code("Code");
    error.putContextItem("Key", "Context Item");

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
    error.putContextItem("Key", "Context Item");

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
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    Error error = new Error();
    error.details("Details");

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
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    Error error = new Error();
    error.details(new Error());

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
   *   <li>{@link Error#code(String)}
   *   <li>{@link Error#context(Map)}
   *   <li>{@link Error#details(Object)}
   *   <li>{@link Error#message(String)}
   *   <li>{@link Error#setCode(String)}
   *   <li>{@link Error#setContext(Map)}
   *   <li>{@link Error#setDetails(Object)}
   *   <li>{@link Error#setMessage(String)}
   *   <li>{@link Error#toString()}
   *   <li>{@link Error#getCode()}
   *   <li>{@link Error#getContext()}
   *   <li>{@link Error#getDetails()}
   *   <li>{@link Error#getMessage()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Error.<init>()",
    "Error Error.code(String)",
    "Error Error.context(Map)",
    "Error Error.details(Object)",
    "String Error.getCode()",
    "Map Error.getContext()",
    "Object Error.getDetails()",
    "String Error.getMessage()",
    "Error Error.message(String)",
    "void Error.setCode(String)",
    "void Error.setContext(Map)",
    "void Error.setDetails(Object)",
    "void Error.setMessage(String)",
    "String Error.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    Error actualError = new Error();
    Error actualCodeResult = actualError.code("Code");
    Error actualContextResult = actualError.context(new HashMap<>());
    Error actualDetailsResult = actualError.details("Details");
    Error actualMessageResult = actualError.message("Not all who wander are lost");
    actualError.setCode("Code");
    HashMap<String, String> context = new HashMap<>();
    actualError.setContext(context);
    actualError.setDetails("Details");
    actualError.setMessage("Not all who wander are lost");
    String actualToStringResult = actualError.toString();
    String actualCode = actualError.getCode();
    Map<String, String> actualContext = actualError.getContext();
    Object actualDetails = actualError.getDetails();

    // Assert
    assertEquals("Code", actualCode);
    assertEquals("Details", actualDetails);
    assertEquals("Not all who wander are lost", actualError.getMessage());
    assertEquals(
        "class Error {\n"
            + "    code: Code\n"
            + "    message: Not all who wander are lost\n"
            + "    context: {}\n"
            + "    details: Details\n"
            + "}",
        actualToStringResult);
    assertTrue(actualContext.isEmpty());
    assertSame(actualError, actualCodeResult);
    assertSame(actualError, actualContextResult);
    assertSame(actualError, actualDetailsResult);
    assertSame(actualError, actualMessageResult);
    assertSame(context, actualContext);
  }
}
