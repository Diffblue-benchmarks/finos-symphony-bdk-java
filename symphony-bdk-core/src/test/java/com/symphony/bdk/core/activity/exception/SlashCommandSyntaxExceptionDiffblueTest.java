package com.symphony.bdk.core.activity.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SlashCommandSyntaxExceptionDiffblueTest {
  /**
   * Test {@link SlashCommandSyntaxException#SlashCommandSyntaxException(String)}.
   *
   * <ul>
   *   <li>When {@code An error occurred}.
   *   <li>Then return Cause is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link SlashCommandSyntaxException#SlashCommandSyntaxException(String)}
   */
  @Test
  @DisplayName(
      "Test new SlashCommandSyntaxException(String); when 'An error occurred'; then return Cause is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SlashCommandSyntaxException.<init>(String)",
    "void SlashCommandSyntaxException.<init>(String, Throwable)"
  })
  void testNewSlashCommandSyntaxException_whenAnErrorOccurred_thenReturnCauseIsNull() {
    // Arrange and Act
    SlashCommandSyntaxException actualSlashCommandSyntaxException =
        new SlashCommandSyntaxException("An error occurred");

    // Assert
    assertEquals("An error occurred", actualSlashCommandSyntaxException.getMessage());
    assertNull(actualSlashCommandSyntaxException.getCause());
    assertEquals(0, actualSlashCommandSyntaxException.getSuppressed().length);
  }

  /**
   * Test {@link SlashCommandSyntaxException#SlashCommandSyntaxException(String, Throwable)}.
   *
   * <ul>
   *   <li>When {@link Throwable#Throwable()}.
   *   <li>Then return Cause is {@link Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link SlashCommandSyntaxException#SlashCommandSyntaxException(String,
   * Throwable)}
   */
  @Test
  @DisplayName(
      "Test new SlashCommandSyntaxException(String, Throwable); when Throwable(); then return Cause is Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SlashCommandSyntaxException.<init>(String)",
    "void SlashCommandSyntaxException.<init>(String, Throwable)"
  })
  void testNewSlashCommandSyntaxException_whenThrowable_thenReturnCauseIsThrowable() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SlashCommandSyntaxException actualSlashCommandSyntaxException =
        new SlashCommandSyntaxException("An error occurred", cause);

    // Assert
    assertEquals("An error occurred", actualSlashCommandSyntaxException.getMessage());
    assertEquals(0, actualSlashCommandSyntaxException.getSuppressed().length);
    assertSame(cause, actualSlashCommandSyntaxException.getCause());
  }
}
