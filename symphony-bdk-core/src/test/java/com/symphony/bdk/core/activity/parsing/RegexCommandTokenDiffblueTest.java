package com.symphony.bdk.core.activity.parsing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class RegexCommandTokenDiffblueTest {
  /**
   * Test {@link RegexCommandToken#matches(Object)}.
   * <ul>
   *   <li>Given {@link RegexCommandToken} {@link RegexCommandToken#matches(Object)} return {@code true}.</li>
   *   <li>When {@code ABC123}.</li>
   *   <li>Then calls {@link RegexCommandToken#matches(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RegexCommandToken#matches(Object)}
   */
  @Test
  @DisplayName("Test matches(Object); given RegexCommandToken matches(Object) return 'true'; when 'ABC123'; then calls matches(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RegexCommandToken.matches(Object)"})
  void testMatches_givenRegexCommandTokenMatchesReturnTrue_whenAbc123_thenCallsMatches() {
    // Arrange
    RegexCommandToken regexCommandToken = mock(RegexCommandToken.class);
    when(regexCommandToken.matches(Mockito.<Object>any())).thenReturn(true);

    // Act
    regexCommandToken.matches("ABC123");

    // Assert
    verify(regexCommandToken).matches(isA(Object.class));
  }

  /**
   * Test {@link RegexCommandToken#matches(Object)}.
   * <ul>
   *   <li>Given {@link StaticCommandToken#StaticCommandToken(String)} with {@code Pattern}.</li>
   *   <li>When {@code Input Token}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RegexCommandToken#matches(Object)}
   */
  @Test
  @DisplayName("Test matches(Object); given StaticCommandToken(String) with 'Pattern'; when 'Input Token'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RegexCommandToken.matches(Object)"})
  void testMatches_givenStaticCommandTokenWithPattern_whenInputToken_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new StaticCommandToken("Pattern")).matches("Input Token"));
  }

  /**
   * Test {@link RegexCommandToken#matches(Object)}.
   * <ul>
   *   <li>Given {@link StaticCommandToken#StaticCommandToken(String)} with {@code Pattern}.</li>
   *   <li>When one.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RegexCommandToken#matches(Object)}
   */
  @Test
  @DisplayName("Test matches(Object); given StaticCommandToken(String) with 'Pattern'; when one; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RegexCommandToken.matches(Object)"})
  void testMatches_givenStaticCommandTokenWithPattern_whenOne_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new StaticCommandToken("Pattern")).matches(1));
  }

  /**
   * Test {@link RegexCommandToken#matches(Object)}.
   * <ul>
   *   <li>Given {@link StaticCommandToken#StaticCommandToken(String)} with {@code Pattern}.</li>
   *   <li>When {@code Pattern}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RegexCommandToken#matches(Object)}
   */
  @Test
  @DisplayName("Test matches(Object); given StaticCommandToken(String) with 'Pattern'; when 'Pattern'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RegexCommandToken.matches(Object)"})
  void testMatches_givenStaticCommandTokenWithPattern_whenPattern_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new StaticCommandToken("Pattern")).matches("Pattern"));
  }

  /**
   * Test {@link RegexCommandToken#getTokenType()}.
   * <p>
   * Method under test: {@link RegexCommandToken#getTokenType()}
   */
  @Test
  @DisplayName("Test getTokenType()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Class RegexCommandToken.getTokenType()"})
  void testGetTokenType() {
    // Arrange and Act
    Class<?> actualTokenType = (new StaticCommandToken("Pattern")).getTokenType();

    // Assert
    Class<String> expectedTokenType = String.class;
    assertEquals(expectedTokenType, actualTokenType);
  }
}
