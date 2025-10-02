package com.symphony.bdk.core.activity.parsing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TypedArgumentTokenDiffblueTest {
  /**
   * Test {@link TypedArgumentToken#newInstance(Class, String)}.
   *
   * <ul>
   *   <li>When {@code Pattern}.
   *   <li>Then return ArgumentName is {@code tter}.
   * </ul>
   *
   * <p>Method under test: {@link TypedArgumentToken#newInstance(Class, String)}
   */
  @Test
  @DisplayName(
      "Test newInstance(Class, String); when 'Pattern'; then return ArgumentName is 'tter'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedArgumentToken TypedArgumentToken.newInstance(Class, String)"})
  void testNewInstance_whenPattern_thenReturnArgumentNameIsTter() {
    // Arrange
    Class<Object> type = Object.class;

    // Act
    TypedArgumentToken<Object> actualNewInstanceResult =
        TypedArgumentToken.newInstance(type, "Pattern");

    // Assert
    assertEquals("tter", actualNewInstanceResult.getArgumentName());
    Class<Object> expectedTokenType = Object.class;
    assertEquals(expectedTokenType, actualNewInstanceResult.getTokenType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TypedArgumentToken#getArgumentName()}
   *   <li>{@link TypedArgumentToken#getTokenType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String TypedArgumentToken.getArgumentName()",
    "Class TypedArgumentToken.getTokenType()"
  })
  void testGettersAndSetters() {
    // Arrange
    Class<Object> type = Object.class;
    TypedArgumentToken<Object> newInstanceResult = TypedArgumentToken.newInstance(type, "Pattern");

    // Act
    String actualArgumentName = newInstanceResult.getArgumentName();
    Class<?> actualTokenType = newInstanceResult.getTokenType();

    // Assert
    assertEquals("tter", actualArgumentName);
    Class<Object> expectedTokenType = Object.class;
    assertEquals(expectedTokenType, actualTokenType);
    assertSame(type, actualTokenType);
  }

  /**
   * Test {@link TypedArgumentToken#matches(Object)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link TypedArgumentToken#matches(Object)}
   */
  @Test
  @DisplayName("Test matches(Object); given 'java.lang.Object'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TypedArgumentToken.matches(Object)"})
  void testMatches_givenJavaLangObject_thenReturnTrue() {
    // Arrange
    Class<Object> type = Object.class;
    TypedArgumentToken<Object> newInstanceResult = TypedArgumentToken.newInstance(type, "Pattern");

    // Act and Assert
    assertTrue(newInstanceResult.matches("Input Token"));
  }
}
