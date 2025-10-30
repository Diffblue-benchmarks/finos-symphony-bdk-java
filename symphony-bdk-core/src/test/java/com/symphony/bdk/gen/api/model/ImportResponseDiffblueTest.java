package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ImportResponseDiffblueTest {
  /**
   * Test {@link ImportResponse#equals(Object)}, and {@link ImportResponse#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ImportResponse#equals(Object)}
   *   <li>{@link ImportResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ImportResponse.equals(Object)", "int ImportResponse.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ImportResponse importResponse = new ImportResponse();
    ImportResponse importResponse2 = new ImportResponse();

    // Act and Assert
    assertEquals(importResponse, importResponse2);
    int expectedHashCodeResult = importResponse.hashCode();
    assertEquals(expectedHashCodeResult, importResponse2.hashCode());
  }

  /**
   * Test {@link ImportResponse#equals(Object)}, and {@link ImportResponse#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ImportResponse#equals(Object)}
   *   <li>{@link ImportResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ImportResponse.equals(Object)", "int ImportResponse.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ImportResponse importResponse = new ImportResponse();

    // Act and Assert
    assertEquals(importResponse, importResponse);
    int expectedHashCodeResult = importResponse.hashCode();
    assertEquals(expectedHashCodeResult, importResponse.hashCode());
  }

  /**
   * Test {@link ImportResponse#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ImportResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ImportResponse.equals(Object)", "int ImportResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ImportResponse(), 1);
  }

  /**
   * Test {@link ImportResponse#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ImportResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ImportResponse.equals(Object)", "int ImportResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ImportResponse importResponse = new ImportResponse();
    importResponse.messageId("42");

    // Act and Assert
    assertNotEquals(importResponse, new ImportResponse());
  }

  /**
   * Test {@link ImportResponse#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ImportResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ImportResponse.equals(Object)", "int ImportResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ImportResponse importResponse = new ImportResponse();
    importResponse.diagnostic("Diagnostic");

    // Act and Assert
    assertNotEquals(importResponse, new ImportResponse());
  }

  /**
   * Test {@link ImportResponse#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ImportResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ImportResponse.equals(Object)", "int ImportResponse.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ImportResponse(), null);
  }

  /**
   * Test {@link ImportResponse#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ImportResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ImportResponse.equals(Object)", "int ImportResponse.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ImportResponse(), "Different type to ImportResponse");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link ImportResponse}
   *   <li>{@link ImportResponse#diagnostic(String)}
   *   <li>{@link ImportResponse#messageId(String)}
   *   <li>{@link ImportResponse#setDiagnostic(String)}
   *   <li>{@link ImportResponse#setMessageId(String)}
   *   <li>{@link ImportResponse#toString()}
   *   <li>{@link ImportResponse#getDiagnostic()}
   *   <li>{@link ImportResponse#getMessageId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ImportResponse.<init>()", "ImportResponse ImportResponse.diagnostic(String)",
      "String ImportResponse.getDiagnostic()", "String ImportResponse.getMessageId()",
      "ImportResponse ImportResponse.messageId(String)", "void ImportResponse.setDiagnostic(String)",
      "void ImportResponse.setMessageId(String)", "String ImportResponse.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    ImportResponse actualImportResponse = new ImportResponse();
    ImportResponse actualDiagnosticResult = actualImportResponse.diagnostic("Diagnostic");
    ImportResponse actualMessageIdResult = actualImportResponse.messageId("42");
    actualImportResponse.setDiagnostic("Diagnostic");
    actualImportResponse.setMessageId("42");
    String actualToStringResult = actualImportResponse.toString();
    String actualDiagnostic = actualImportResponse.getDiagnostic();

    // Assert
    assertEquals("42", actualImportResponse.getMessageId());
    assertEquals("Diagnostic", actualDiagnostic);
    assertEquals("class ImportResponse {\n    messageId: 42\n    diagnostic: Diagnostic\n}", actualToStringResult);
    assertSame(actualImportResponse, actualDiagnosticResult);
    assertSame(actualImportResponse, actualMessageIdResult);
  }
}
