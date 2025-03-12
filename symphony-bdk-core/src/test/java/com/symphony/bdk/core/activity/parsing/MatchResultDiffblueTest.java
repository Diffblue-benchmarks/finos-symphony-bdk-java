package com.symphony.bdk.core.activity.parsing;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MatchResultDiffblueTest {
  /**
   * Test {@link MatchResult#MatchResult(boolean)}.
   * <p>
   * Method under test: {@link MatchResult#MatchResult(boolean)}
   */
  @Test
  @DisplayName("Test new MatchResult(boolean)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void MatchResult.<init>(boolean)"})
  void testNewMatchResult() {
    // Arrange and Act
    MatchResult actualMatchResult = new MatchResult(true);

    // Assert
    assertTrue(actualMatchResult.isMatching());
    assertTrue(actualMatchResult.getArguments().getArgumentNames().isEmpty());
  }

  /**
   * Test {@link MatchResult#MatchResult(boolean, Map)}.
   * <p>
   * Method under test: {@link MatchResult#MatchResult(boolean, Map)}
   */
  @Test
  @DisplayName("Test new MatchResult(boolean, Map)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void MatchResult.<init>(boolean, Map)"})
  void testNewMatchResult2() {
    // Arrange and Act
    MatchResult actualMatchResult = new MatchResult(true, new HashMap<>());

    // Assert
    assertTrue(actualMatchResult.isMatching());
    assertTrue(actualMatchResult.getArguments().getArgumentNames().isEmpty());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link MatchResult#getArguments()}
   *   <li>{@link MatchResult#isMatching()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Arguments MatchResult.getArguments()", "boolean MatchResult.isMatching()"})
  void testGettersAndSetters() {
    // Arrange
    MatchResult matchResult = new MatchResult(true);

    // Act
    Arguments actualArguments = matchResult.getArguments();

    // Assert
    assertTrue(matchResult.isMatching());
    assertTrue(actualArguments.getArgumentNames().isEmpty());
  }
}
