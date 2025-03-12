package com.symphony.bdk.http.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PairDiffblueTest {
  /**
   * Test {@link Pair#Pair(String, String)}.
   * <ul>
   *   <li>When empty string.</li>
   *   <li>Then return Name is empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link Pair#Pair(String, String)}
   */
  @Test
  @DisplayName("Test new Pair(String, String); when empty string; then return Name is empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void Pair.<init>(String, String)"})
  void testNewPair_whenEmptyString_thenReturnNameIsEmptyString() {
    // Arrange and Act
    Pair actualPair = new Pair("", "https://example.org/example");

    // Assert
    assertEquals("", actualPair.getName());
    assertEquals("https://example.org/example", actualPair.getValue());
  }

  /**
   * Test {@link Pair#Pair(String, String)}.
   * <ul>
   *   <li>When {@code https://example.org/example}.</li>
   *   <li>Then return Name is {@code https://example.org/example}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Pair#Pair(String, String)}
   */
  @Test
  @DisplayName("Test new Pair(String, String); when 'https://example.org/example'; then return Name is 'https://example.org/example'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void Pair.<init>(String, String)"})
  void testNewPair_whenHttpsExampleOrgExample_thenReturnNameIsHttpsExampleOrgExample() {
    // Arrange and Act
    Pair actualPair = new Pair("https://example.org/example", "https://example.org/example");

    // Assert
    assertEquals("https://example.org/example", actualPair.getName());
    assertEquals("https://example.org/example", actualPair.getValue());
  }

  /**
   * Test {@link Pair#Pair(String, String)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return Value is empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link Pair#Pair(String, String)}
   */
  @Test
  @DisplayName("Test new Pair(String, String); when 'null'; then return Value is empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void Pair.<init>(String, String)"})
  void testNewPair_whenNull_thenReturnValueIsEmptyString() {
    // Arrange and Act
    Pair actualPair = new Pair(null, null);

    // Assert
    assertEquals("", actualPair.getName());
    assertEquals("", actualPair.getValue());
  }

  /**
   * Test {@link Pair#pair(String, String)}.
   * <ul>
   *   <li>When empty string.</li>
   *   <li>Then return Name is empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link Pair#pair(String, String)}
   */
  @Test
  @DisplayName("Test pair(String, String); when empty string; then return Name is empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Pair Pair.pair(String, String)"})
  void testPair_whenEmptyString_thenReturnNameIsEmptyString() {
    // Arrange and Act
    Pair actualPairResult = Pair.pair("", "https://example.org/example");

    // Assert
    assertEquals("", actualPairResult.getName());
    assertEquals("https://example.org/example", actualPairResult.getValue());
  }

  /**
   * Test {@link Pair#pair(String, String)}.
   * <ul>
   *   <li>When {@code https://example.org/example}.</li>
   *   <li>Then return Name is {@code https://example.org/example}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Pair#pair(String, String)}
   */
  @Test
  @DisplayName("Test pair(String, String); when 'https://example.org/example'; then return Name is 'https://example.org/example'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Pair Pair.pair(String, String)"})
  void testPair_whenHttpsExampleOrgExample_thenReturnNameIsHttpsExampleOrgExample() {
    // Arrange and Act
    Pair actualPairResult = Pair.pair("https://example.org/example", "https://example.org/example");

    // Assert
    assertEquals("https://example.org/example", actualPairResult.getName());
    assertEquals("https://example.org/example", actualPairResult.getValue());
  }

  /**
   * Test {@link Pair#pair(String, String)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return Value is empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link Pair#pair(String, String)}
   */
  @Test
  @DisplayName("Test pair(String, String); when 'null'; then return Value is empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Pair Pair.pair(String, String)"})
  void testPair_whenNull_thenReturnValueIsEmptyString() {
    // Arrange and Act
    Pair actualPairResult = Pair.pair(null, null);

    // Assert
    assertEquals("", actualPairResult.getName());
    assertEquals("", actualPairResult.getValue());
  }

  /**
   * Test {@link Pair#equals(Object)}, and {@link Pair#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Pair#equals(Object)}
   *   <li>{@link Pair#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Pair.equals(Object)", "int Pair.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Pair pairResult = Pair.pair("https://example.org/example", "https://example.org/example");
    Pair pairResult2 = Pair.pair("https://example.org/example", "https://example.org/example");

    // Act and Assert
    assertEquals(pairResult, pairResult2);
    int expectedHashCodeResult = pairResult.hashCode();
    assertEquals(expectedHashCodeResult, pairResult2.hashCode());
  }

  /**
   * Test {@link Pair#equals(Object)}, and {@link Pair#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Pair#equals(Object)}
   *   <li>{@link Pair#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Pair.equals(Object)", "int Pair.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Pair pairResult = Pair.pair("https://example.org/example", "https://example.org/example");

    // Act and Assert
    assertEquals(pairResult, pairResult);
    int expectedHashCodeResult = pairResult.hashCode();
    assertEquals(expectedHashCodeResult, pairResult.hashCode());
  }

  /**
   * Test {@link Pair#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Pair#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Pair.equals(Object)", "int Pair.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Pair pairResult = Pair.pair("Name", "https://example.org/example");

    // Act and Assert
    assertNotEquals(pairResult, Pair.pair("https://example.org/example", "https://example.org/example"));
  }

  /**
   * Test {@link Pair#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Pair#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Pair.equals(Object)", "int Pair.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Pair pairResult = Pair.pair("https://example.org/example", "42");

    // Act and Assert
    assertNotEquals(pairResult, Pair.pair("https://example.org/example", "https://example.org/example"));
  }

  /**
   * Test {@link Pair#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Pair#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Pair.equals(Object)", "int Pair.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(Pair.pair("https://example.org/example", "https://example.org/example"), null);
  }

  /**
   * Test {@link Pair#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Pair#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Pair.equals(Object)", "int Pair.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(Pair.pair("https://example.org/example", "https://example.org/example"), "Different type to Pair");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Pair#getName()}
   *   <li>{@link Pair#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String Pair.getName()", "String Pair.getValue()"})
  void testGettersAndSetters() {
    // Arrange
    Pair pairResult = Pair.pair("https://example.org/example", "https://example.org/example");

    // Act
    String actualName = pairResult.getName();

    // Assert
    assertEquals("https://example.org/example", actualName);
    assertEquals("https://example.org/example", pairResult.getValue());
  }
}
