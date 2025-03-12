package com.symphony.bdk.core.auth.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.http.api.ApiException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AuthUnauthorizedExceptionDiffblueTest {
  /**
   * Test {@link AuthUnauthorizedException#AuthUnauthorizedException(String, ApiException)}.
   * <p>
   * Method under test: {@link AuthUnauthorizedException#AuthUnauthorizedException(String, ApiException)}
   */
  @Test
  @DisplayName("Test new AuthUnauthorizedException(String, ApiException)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AuthUnauthorizedException.<init>(String)",
      "void AuthUnauthorizedException.<init>(String, ApiException)"})
  void testNewAuthUnauthorizedException() {
    // Arrange
    ApiException source = new ApiException(1, "https://example.org/example");

    // Act
    AuthUnauthorizedException actualAuthUnauthorizedException = new AuthUnauthorizedException("An error occurred",
        source);

    // Assert
    assertEquals("An error occurred", actualAuthUnauthorizedException.getMessage());
    assertEquals(0, actualAuthUnauthorizedException.getSuppressed().length);
    assertSame(source, actualAuthUnauthorizedException.getCause());
  }

  /**
   * Test {@link AuthUnauthorizedException#AuthUnauthorizedException(String)}.
   * <ul>
   *   <li>When {@code An error occurred}.</li>
   *   <li>Then return Cause is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuthUnauthorizedException#AuthUnauthorizedException(String)}
   */
  @Test
  @DisplayName("Test new AuthUnauthorizedException(String); when 'An error occurred'; then return Cause is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AuthUnauthorizedException.<init>(String)",
      "void AuthUnauthorizedException.<init>(String, ApiException)"})
  void testNewAuthUnauthorizedException_whenAnErrorOccurred_thenReturnCauseIsNull() {
    // Arrange and Act
    AuthUnauthorizedException actualAuthUnauthorizedException = new AuthUnauthorizedException("An error occurred");

    // Assert
    assertEquals("An error occurred", actualAuthUnauthorizedException.getMessage());
    assertNull(actualAuthUnauthorizedException.getCause());
    assertEquals(0, actualAuthUnauthorizedException.getSuppressed().length);
  }
}
