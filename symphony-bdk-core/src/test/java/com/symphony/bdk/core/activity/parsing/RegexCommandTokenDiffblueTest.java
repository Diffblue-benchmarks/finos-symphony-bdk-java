package com.symphony.bdk.core.activity.parsing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RegexCommandTokenDiffblueTest {
  /**
   * Test {@link RegexCommandToken#matches(Object)}.
   *
   * <ul>
   *   <li>Given {@link StaticCommandToken#StaticCommandToken(String)} with {@code Pattern}.
   *   <li>When {@code Input Token}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link RegexCommandToken#matches(Object)}
   */
  @Test
  @DisplayName(
      "Test matches(Object); given StaticCommandToken(String) with 'Pattern'; when 'Input Token'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RegexCommandToken.matches(Object)"})
  void testMatches_givenStaticCommandTokenWithPattern_whenInputToken_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(new StaticCommandToken("Pattern").matches("Input Token"));
  }

  /**
   * Test {@link RegexCommandToken#matches(Object)}.
   *
   * <ul>
   *   <li>Given {@link StaticCommandToken#StaticCommandToken(String)} with {@code Pattern}.
   *   <li>When one.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link RegexCommandToken#matches(Object)}
   */
  @Test
  @DisplayName(
      "Test matches(Object); given StaticCommandToken(String) with 'Pattern'; when one; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RegexCommandToken.matches(Object)"})
  void testMatches_givenStaticCommandTokenWithPattern_whenOne_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(new StaticCommandToken("Pattern").matches(1));
  }

  /**
   * Test {@link RegexCommandToken#matches(Object)}.
   *
   * <ul>
   *   <li>Given {@link StaticCommandToken#StaticCommandToken(String)} with {@code Pattern}.
   *   <li>When {@code Pattern}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link RegexCommandToken#matches(Object)}
   */
  @Test
  @DisplayName(
      "Test matches(Object); given StaticCommandToken(String) with 'Pattern'; when 'Pattern'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RegexCommandToken.matches(Object)"})
  void testMatches_givenStaticCommandTokenWithPattern_whenPattern_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(new StaticCommandToken("Pattern").matches("Pattern"));
  }

  /**
   * Test {@link RegexCommandToken#getTokenType()}.
   *
   * <p>Method under test: {@link RegexCommandToken#getTokenType()}
   */
  @Test
  @DisplayName("Test getTokenType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class RegexCommandToken.getTokenType()"})
  void testGetTokenType() {
    // Arrange and Act
    Class<?> actualTokenType = new StaticCommandToken("Pattern").getTokenType();

    // Assert
    Class<String> expectedTokenType = String.class;
    assertEquals(expectedTokenType, actualTokenType);
  }
}
