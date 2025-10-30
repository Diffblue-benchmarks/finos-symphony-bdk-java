package com.symphony.bdk.core.activity.parsing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CashtagDiffblueTest {
  /**
   * Test {@link Cashtag#equals(Object)}, and {@link Cashtag#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Cashtag#equals(Object)}
   *   <li>{@link Cashtag#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Cashtag.equals(Object)", "int Cashtag.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Cashtag cashtag = new Cashtag("Text", "42");
    Cashtag cashtag2 = new Cashtag("Text", "42");

    // Act and Assert
    assertEquals(cashtag, cashtag2);
    int expectedHashCodeResult = cashtag.hashCode();
    assertEquals(expectedHashCodeResult, cashtag2.hashCode());
  }

  /**
   * Test {@link Cashtag#equals(Object)}, and {@link Cashtag#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Cashtag#equals(Object)}
   *   <li>{@link Cashtag#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Cashtag.equals(Object)", "int Cashtag.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    Cashtag cashtag = new Cashtag(null, "42");
    Cashtag cashtag2 = new Cashtag(null, "42");

    // Act and Assert
    assertEquals(cashtag, cashtag2);
    int expectedHashCodeResult = cashtag.hashCode();
    assertEquals(expectedHashCodeResult, cashtag2.hashCode());
  }

  /**
   * Test {@link Cashtag#equals(Object)}, and {@link Cashtag#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Cashtag#equals(Object)}
   *   <li>{@link Cashtag#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Cashtag.equals(Object)", "int Cashtag.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual3() {
    // Arrange
    Cashtag cashtag = new Cashtag("Text", null);
    Cashtag cashtag2 = new Cashtag("Text", null);

    // Act and Assert
    assertEquals(cashtag, cashtag2);
    int expectedHashCodeResult = cashtag.hashCode();
    assertEquals(expectedHashCodeResult, cashtag2.hashCode());
  }

  /**
   * Test {@link Cashtag#equals(Object)}, and {@link Cashtag#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Cashtag#equals(Object)}
   *   <li>{@link Cashtag#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Cashtag.equals(Object)", "int Cashtag.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Cashtag cashtag = new Cashtag("Text", "42");

    // Act and Assert
    assertEquals(cashtag, cashtag);
    int expectedHashCodeResult = cashtag.hashCode();
    assertEquals(expectedHashCodeResult, cashtag.hashCode());
  }

  /**
   * Test {@link Cashtag#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Cashtag#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Cashtag.equals(Object)", "int Cashtag.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Cashtag cashtag = new Cashtag("42", "42");

    // Act and Assert
    assertNotEquals(cashtag, new Cashtag("Text", "42"));
  }

  /**
   * Test {@link Cashtag#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Cashtag#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Cashtag.equals(Object)", "int Cashtag.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Cashtag cashtag = new Cashtag(null, "42");

    // Act and Assert
    assertNotEquals(cashtag, new Cashtag("Text", "42"));
  }

  /**
   * Test {@link Cashtag#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Cashtag#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Cashtag.equals(Object)", "int Cashtag.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Cashtag cashtag = new Cashtag("Text", "Text");

    // Act and Assert
    assertNotEquals(cashtag, new Cashtag("Text", "42"));
  }

  /**
   * Test {@link Cashtag#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Cashtag#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Cashtag.equals(Object)", "int Cashtag.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    Cashtag cashtag = new Cashtag("Text", null);

    // Act and Assert
    assertNotEquals(cashtag, new Cashtag("Text", "42"));
  }

  /**
   * Test {@link Cashtag#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Cashtag#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Cashtag.equals(Object)", "int Cashtag.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Cashtag("Text", "42"), null);
  }

  /**
   * Test {@link Cashtag#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Cashtag#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Cashtag.equals(Object)", "int Cashtag.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Cashtag("Text", "42"), "Different type to Cashtag");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Cashtag#Cashtag(String, String)}
   *   <li>{@link Cashtag#getText()}
   *   <li>{@link Cashtag#getValue()}
   *   <li>{@link Cashtag#toString()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void Cashtag.<init>(String, String)", "String Cashtag.getText()", "String Cashtag.getValue()",
      "String Cashtag.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    Cashtag actualCashtag = new Cashtag("Text", "42");
    String actualText = actualCashtag.getText();
    String actualValue = actualCashtag.getValue();

    // Assert
    assertEquals("42", actualValue);
    assertEquals("Text", actualText);
    assertEquals("Text", actualCashtag.toString());
  }
}
