package com.symphony.bdk.core.activity.parsing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class StaticCommandTokenDiffblueTest {
  /**
   * Test {@link StaticCommandToken#StaticCommandToken(String)}.
   *
   * <p>Method under test: {@link StaticCommandToken#StaticCommandToken(String)}
   */
  @Test
  @DisplayName("Test new StaticCommandToken(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void StaticCommandToken.<init>(String)"})
  void testNewStaticCommandToken() {
    // Arrange and Act
    StaticCommandToken actualStaticCommandToken = new StaticCommandToken("Pattern");

    // Assert
    assertEquals("^Pattern$", actualStaticCommandToken.getRegexPattern().pattern());
    Class<String> expectedTokenType = String.class;
    assertEquals(expectedTokenType, actualStaticCommandToken.getTokenType());
  }

  /**
   * Test {@link StaticCommandToken#getRegexPattern()}.
   *
   * <p>Method under test: {@link StaticCommandToken#getRegexPattern()}
   */
  @Test
  @DisplayName("Test getRegexPattern()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.regex.Pattern StaticCommandToken.getRegexPattern()"})
  void testGetRegexPattern() {
    // Arrange, Act and Assert
    assertEquals("^Pattern$", new StaticCommandToken("Pattern").getRegexPattern().pattern());
  }
}
