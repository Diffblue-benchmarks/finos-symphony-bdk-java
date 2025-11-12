package com.symphony.bdk.core.activity.parsing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.function.Supplier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MatchingUserIdMentionTokenDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MatchingUserIdMentionToken#MatchingUserIdMentionToken(Supplier)}
   *   <li>{@link MatchingUserIdMentionToken#getTokenType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void MatchingUserIdMentionToken.<init>(Supplier)",
    "Class MatchingUserIdMentionToken.getTokenType()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    Class<?> actualTokenType = new MatchingUserIdMentionToken(mock(Supplier.class)).getTokenType();

    // Assert
    Class<Mention> expectedTokenType = Mention.class;
    assertEquals(expectedTokenType, actualTokenType);
  }

  /**
   * Test {@link MatchingUserIdMentionToken#matches(Object)}.
   *
   * <ul>
   *   <li>When {@code Input Token}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MatchingUserIdMentionToken#matches(Object)}
   */
  @Test
  @DisplayName("Test matches(Object); when 'Input Token'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MatchingUserIdMentionToken.matches(Object)"})
  void testMatches_whenInputToken_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(new MatchingUserIdMentionToken(mock(Supplier.class)).matches("Input Token"));
  }

  /**
   * Test {@link MatchingUserIdMentionToken#matches(Object)}.
   *
   * <ul>
   *   <li>When {@link Mention#Mention(String, Long)} with {@code Text} and userId is one.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MatchingUserIdMentionToken#matches(Object)}
   */
  @Test
  @DisplayName(
      "Test matches(Object); when Mention(String, Long) with 'Text' and userId is one; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MatchingUserIdMentionToken.matches(Object)"})
  void testMatches_whenMentionWithTextAndUserIdIsOne_thenReturnTrue() {
    // Arrange
    Supplier<Long> matchingUserId = mock(Supplier.class);
    when(matchingUserId.get()).thenReturn(1L);
    MatchingUserIdMentionToken matchingUserIdMentionToken =
        new MatchingUserIdMentionToken(matchingUserId);

    // Act
    boolean actualMatchesResult = matchingUserIdMentionToken.matches(new Mention("Text", 1L));

    // Assert
    verify(matchingUserId).get();
    assertTrue(actualMatchesResult);
  }

  /**
   * Test {@link MatchingUserIdMentionToken#matches(Object)}.
   *
   * <ul>
   *   <li>When {@link Mention#Mention(String, Long)} with {@code Text} and userId is two.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MatchingUserIdMentionToken#matches(Object)}
   */
  @Test
  @DisplayName(
      "Test matches(Object); when Mention(String, Long) with 'Text' and userId is two; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MatchingUserIdMentionToken.matches(Object)"})
  void testMatches_whenMentionWithTextAndUserIdIsTwo_thenReturnFalse() {
    // Arrange
    Supplier<Long> matchingUserId = mock(Supplier.class);
    when(matchingUserId.get()).thenReturn(1L);
    MatchingUserIdMentionToken matchingUserIdMentionToken =
        new MatchingUserIdMentionToken(matchingUserId);

    // Act
    boolean actualMatchesResult = matchingUserIdMentionToken.matches(new Mention("Text", 2L));

    // Assert
    verify(matchingUserId).get();
    assertFalse(actualMatchesResult);
  }
}
