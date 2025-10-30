package com.symphony.bdk.core.auth.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AuthInitializationExceptionDiffblueTest {
  /**
   * Test {@link AuthInitializationException#AuthInitializationException(String)}.
   * <ul>
   *   <li>When {@code An error occurred}.</li>
   *   <li>Then return Cause is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuthInitializationException#AuthInitializationException(String)}
   */
  @Test
  @DisplayName("Test new AuthInitializationException(String); when 'An error occurred'; then return Cause is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AuthInitializationException.<init>(String)",
      "void AuthInitializationException.<init>(String, Throwable)"})
  void testNewAuthInitializationException_whenAnErrorOccurred_thenReturnCauseIsNull() {
    // Arrange and Act
    AuthInitializationException actualAuthInitializationException = new AuthInitializationException(
        "An error occurred");

    // Assert
    assertEquals("An error occurred", actualAuthInitializationException.getMessage());
    assertNull(actualAuthInitializationException.getCause());
    assertEquals(0, actualAuthInitializationException.getSuppressed().length);
  }

  /**
   * Test {@link AuthInitializationException#AuthInitializationException(String, Throwable)}.
   * <ul>
   *   <li>When {@link Throwable#Throwable()}.</li>
   *   <li>Then return Cause is {@link Throwable#Throwable()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuthInitializationException#AuthInitializationException(String, Throwable)}
   */
  @Test
  @DisplayName("Test new AuthInitializationException(String, Throwable); when Throwable(); then return Cause is Throwable()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AuthInitializationException.<init>(String)",
      "void AuthInitializationException.<init>(String, Throwable)"})
  void testNewAuthInitializationException_whenThrowable_thenReturnCauseIsThrowable() {
    // Arrange
    Throwable source = new Throwable();

    // Act
    AuthInitializationException actualAuthInitializationException = new AuthInitializationException("An error occurred",
        source);

    // Assert
    assertEquals("An error occurred", actualAuthInitializationException.getMessage());
    assertEquals(0, actualAuthInitializationException.getSuppressed().length);
    assertSame(source, actualAuthInitializationException.getCause());
  }
}
