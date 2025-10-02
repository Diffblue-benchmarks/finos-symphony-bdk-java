package com.symphony.bdk.http.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PairDiffblueTest {
  /**
   * Test {@link Pair#Pair(String, String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then return Name is empty string.
   * </ul>
   *
   * <p>Method under test: {@link Pair#Pair(String, String)}
   */
  @Test
  @DisplayName("Test new Pair(String, String); when empty string; then return Name is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
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
   *
   * <ul>
   *   <li>When {@code https://example.org/example}.
   *   <li>Then return Name is {@code https://example.org/example}.
   * </ul>
   *
   * <p>Method under test: {@link Pair#Pair(String, String)}
   */
  @Test
  @DisplayName(
      "Test new Pair(String, String); when 'https://example.org/example'; then return Name is 'https://example.org/example'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
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
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return Value is empty string.
   * </ul>
   *
   * <p>Method under test: {@link Pair#Pair(String, String)}
   */
  @Test
  @DisplayName("Test new Pair(String, String); when 'null'; then return Value is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
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
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then return Name is empty string.
   * </ul>
   *
   * <p>Method under test: {@link Pair#pair(String, String)}
   */
  @Test
  @DisplayName("Test pair(String, String); when empty string; then return Name is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
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
   *
   * <ul>
   *   <li>When {@code https://example.org/example}.
   *   <li>Then return Name is {@code https://example.org/example}.
   * </ul>
   *
   * <p>Method under test: {@link Pair#pair(String, String)}
   */
  @Test
  @DisplayName(
      "Test pair(String, String); when 'https://example.org/example'; then return Name is 'https://example.org/example'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
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
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return Value is empty string.
   * </ul>
   *
   * <p>Method under test: {@link Pair#pair(String, String)}
   */
  @Test
  @DisplayName("Test pair(String, String); when 'null'; then return Value is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Pair Pair.pair(String, String)"})
  void testPair_whenNull_thenReturnValueIsEmptyString() {
    // Arrange and Act
    Pair actualPairResult = Pair.pair(null, null);

    // Assert
    assertEquals("", actualPairResult.getName());
    assertEquals("", actualPairResult.getValue());
  }
}
