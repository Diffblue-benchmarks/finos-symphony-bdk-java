package com.symphony.bdk.core.activity.parsing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.activity.exception.SlashCommandSyntaxException;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SlashCommandPatternDiffblueTest {
  /**
   * Test {@link SlashCommandPattern#SlashCommandPattern(String)}.
   * <ul>
   *   <li>Then throw {@link SlashCommandSyntaxException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SlashCommandPattern#SlashCommandPattern(String)}
   */
  @Test
  @DisplayName("Test new SlashCommandPattern(String); then throw SlashCommandSyntaxException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SlashCommandPattern.<init>(String)"})
  void testNewSlashCommandPattern_thenThrowSlashCommandSyntaxException() {
    // Arrange, Act and Assert
    assertThrows(SlashCommandSyntaxException.class, () -> new SlashCommandPattern("{#"));
  }

  /**
   * Test {@link SlashCommandPattern#SlashCommandPattern(String)}.
   * <ul>
   *   <li>Then Tokens first return {@link StringArgumentCommandToken}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SlashCommandPattern#SlashCommandPattern(String)}
   */
  @Test
  @DisplayName("Test new SlashCommandPattern(String); then Tokens first return StringArgumentCommandToken")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SlashCommandPattern.<init>(String)"})
  void testNewSlashCommandPattern_thenTokensFirstReturnStringArgumentCommandToken() {
    // Arrange and Act
    SlashCommandPattern actualSlashCommandPattern = new SlashCommandPattern("{UU}");

    // Assert
    List<CommandToken> tokens = actualSlashCommandPattern.getTokens();
    assertEquals(1, tokens.size());
    CommandToken getResult = tokens.get(0);
    assertTrue(getResult instanceof StringArgumentCommandToken);
    assertEquals("UU", ((StringArgumentCommandToken) getResult).getArgumentName());
    Map<String, ? extends Class<?>> argumentDefinitions = actualSlashCommandPattern.getArgumentDefinitions();
    assertEquals(1, argumentDefinitions.size());
    Class<String> expectedGetResult = String.class;
    Class<?> getResult2 = argumentDefinitions.get("UU");
    assertEquals(expectedGetResult, getResult2);
    assertEquals(StringArgumentCommandToken.ARGUMENT_VALUE_REGEX,
        ((StringArgumentCommandToken) getResult).getRegexPattern().pattern());
    assertSame(getResult2, getResult.getTokenType());
  }

  /**
   * Test {@link SlashCommandPattern#SlashCommandPattern(String)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return Tokens Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link SlashCommandPattern#SlashCommandPattern(String)}
   */
  @Test
  @DisplayName("Test new SlashCommandPattern(String); when 'null'; then return Tokens Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SlashCommandPattern.<init>(String)"})
  void testNewSlashCommandPattern_whenNull_thenReturnTokensEmpty() {
    // Arrange and Act
    SlashCommandPattern actualSlashCommandPattern = new SlashCommandPattern(null);

    // Assert
    assertTrue(actualSlashCommandPattern.getTokens().isEmpty());
    assertTrue(actualSlashCommandPattern.getArgumentDefinitions().isEmpty());
  }

  /**
   * Test {@link SlashCommandPattern#SlashCommandPattern(String)}.
   * <ul>
   *   <li>When {@code Pattern}.</li>
   *   <li>Then Tokens first return {@link StaticCommandToken}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SlashCommandPattern#SlashCommandPattern(String)}
   */
  @Test
  @DisplayName("Test new SlashCommandPattern(String); when 'Pattern'; then Tokens first return StaticCommandToken")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SlashCommandPattern.<init>(String)"})
  void testNewSlashCommandPattern_whenPattern_thenTokensFirstReturnStaticCommandToken() {
    // Arrange and Act
    SlashCommandPattern actualSlashCommandPattern = new SlashCommandPattern("Pattern");

    // Assert
    List<CommandToken> tokens = actualSlashCommandPattern.getTokens();
    assertEquals(1, tokens.size());
    CommandToken getResult = tokens.get(0);
    assertTrue(getResult instanceof StaticCommandToken);
    assertEquals("^Pattern$", ((StaticCommandToken) getResult).getRegexPattern().pattern());
    assertTrue(actualSlashCommandPattern.getArgumentDefinitions().isEmpty());
    Class<String> expectedTokenType = String.class;
    assertEquals(expectedTokenType, getResult.getTokenType());
  }

  /**
   * Test {@link SlashCommandPattern#SlashCommandPattern(String)}.
   * <ul>
   *   <li>When {@code {#UU}}.</li>
   *   <li>Then Tokens first return {@link TypedArgumentToken}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SlashCommandPattern#SlashCommandPattern(String)}
   */
  @Test
  @DisplayName("Test new SlashCommandPattern(String); when '{#UU}'; then Tokens first return TypedArgumentToken")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SlashCommandPattern.<init>(String)"})
  void testNewSlashCommandPattern_whenUu_thenTokensFirstReturnTypedArgumentToken() {
    // Arrange and Act
    SlashCommandPattern actualSlashCommandPattern = new SlashCommandPattern("{#UU}");

    // Assert
    List<CommandToken> tokens = actualSlashCommandPattern.getTokens();
    assertEquals(1, tokens.size());
    CommandToken getResult = tokens.get(0);
    assertTrue(getResult instanceof TypedArgumentToken);
    assertEquals("UU", ((TypedArgumentToken<Object>) getResult).getArgumentName());
    Map<String, ? extends Class<?>> argumentDefinitions = actualSlashCommandPattern.getArgumentDefinitions();
    assertEquals(1, argumentDefinitions.size());
    Class<Hashtag> expectedGetResult = Hashtag.class;
    Class<?> getResult2 = argumentDefinitions.get("UU");
    assertEquals(expectedGetResult, getResult2);
    assertSame(getResult2, getResult.getTokenType());
  }

  /**
   * Test {@link SlashCommandPattern#getTokens()}.
   * <p>
   * Method under test: {@link SlashCommandPattern#getTokens()}
   */
  @Test
  @DisplayName("Test getTokens()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List SlashCommandPattern.getTokens()"})
  void testGetTokens() {
    // Arrange and Act
    List<CommandToken> actualTokens = (new SlashCommandPattern("Pattern")).getTokens();

    // Assert
    assertEquals(1, actualTokens.size());
    assertTrue(actualTokens.get(0) instanceof StaticCommandToken);
  }

  /**
   * Test {@link SlashCommandPattern#prependToken(CommandToken)}.
   * <p>
   * Method under test: {@link SlashCommandPattern#prependToken(CommandToken)}
   */
  @Test
  @DisplayName("Test prependToken(CommandToken)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SlashCommandPattern.prependToken(CommandToken)"})
  void testPrependToken() {
    // Arrange
    SlashCommandPattern slashCommandPattern = new SlashCommandPattern("Pattern");
    StaticCommandToken token = new StaticCommandToken("Pattern");

    // Act
    slashCommandPattern.prependToken(token);

    // Assert
    List<CommandToken> tokens = slashCommandPattern.getTokens();
    assertEquals(2, tokens.size());
    CommandToken getResult = tokens.get(1);
    assertTrue(getResult instanceof StaticCommandToken);
    assertEquals("^Pattern$", ((StaticCommandToken) getResult).getRegexPattern().pattern());
    assertSame(token, tokens.get(0));
  }

  /**
   * Test {@link SlashCommandPattern#getArgumentDefinitions()}.
   * <ul>
   *   <li>Given {@link SlashCommandPattern#SlashCommandPattern(String)} with {@code Pattern}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SlashCommandPattern#getArgumentDefinitions()}
   */
  @Test
  @DisplayName("Test getArgumentDefinitions(); given SlashCommandPattern(String) with 'Pattern'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Map SlashCommandPattern.getArgumentDefinitions()"})
  void testGetArgumentDefinitions_givenSlashCommandPatternWithPattern() {
    // Arrange, Act and Assert
    assertTrue((new SlashCommandPattern("Pattern")).getArgumentDefinitions().isEmpty());
  }

  /**
   * Test {@link SlashCommandPattern#getArgumentDefinitions()}.
   * <ul>
   *   <li>Given {@link SlashCommandPattern#SlashCommandPattern(String)} with pattern is empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link SlashCommandPattern#getArgumentDefinitions()}
   */
  @Test
  @DisplayName("Test getArgumentDefinitions(); given SlashCommandPattern(String) with pattern is empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Map SlashCommandPattern.getArgumentDefinitions()"})
  void testGetArgumentDefinitions_givenSlashCommandPatternWithPatternIsEmptyString() {
    // Arrange, Act and Assert
    assertTrue((new SlashCommandPattern("")).getArgumentDefinitions().isEmpty());
  }
}
