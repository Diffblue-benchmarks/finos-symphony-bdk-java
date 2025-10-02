package com.symphony.bdk.core.activity.parsing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class StringArgumentCommandTokenDiffblueTest {
  /**
   * Test {@link StringArgumentCommandToken#newInstance(String)}.
   *
   * <ul>
   *   <li>When {@code Pattern}.
   *   <li>Then return ArgumentName is {@code atter}.
   * </ul>
   *
   * <p>Method under test: {@link StringArgumentCommandToken#newInstance(String)}
   */
  @Test
  @DisplayName("Test newInstance(String); when 'Pattern'; then return ArgumentName is 'atter'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StringArgumentCommandToken StringArgumentCommandToken.newInstance(String)"})
  void testNewInstance_whenPattern_thenReturnArgumentNameIsAtter() {
    // Arrange and Act
    StringArgumentCommandToken actualNewInstanceResult =
        StringArgumentCommandToken.newInstance("Pattern");

    // Assert
    assertEquals("atter", actualNewInstanceResult.getArgumentName());
    Class<String> expectedTokenType = String.class;
    assertEquals(expectedTokenType, actualNewInstanceResult.getTokenType());
    assertEquals(
        StringArgumentCommandToken.ARGUMENT_VALUE_REGEX,
        actualNewInstanceResult.getRegexPattern().pattern());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link StringArgumentCommandToken#StringArgumentCommandToken(String)}
   *   <li>{@link StringArgumentCommandToken#getArgumentName()}
   *   <li>{@link StringArgumentCommandToken#getRegexPattern()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void StringArgumentCommandToken.<init>(String)",
    "String StringArgumentCommandToken.getArgumentName()",
    "java.util.regex.Pattern StringArgumentCommandToken.getRegexPattern()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    StringArgumentCommandToken actualStringArgumentCommandToken =
        new StringArgumentCommandToken("Argument Name");
    String actualArgumentName = actualStringArgumentCommandToken.getArgumentName();

    // Assert
    assertEquals("Argument Name", actualArgumentName);
    assertEquals(
        StringArgumentCommandToken.ARGUMENT_VALUE_REGEX,
        actualStringArgumentCommandToken.getRegexPattern().pattern());
  }
}
