package com.symphony.bdk.template.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TemplateExceptionDiffblueTest {
  /**
   * Test {@link TemplateException#TemplateException(String)}.
   * <ul>
   *   <li>When {@code An error occurred}.</li>
   *   <li>Then return Cause is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TemplateException#TemplateException(String)}
   */
  @Test
  @DisplayName("Test new TemplateException(String); when 'An error occurred'; then return Cause is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void TemplateException.<init>(String)", "void TemplateException.<init>(String, Throwable)"})
  void testNewTemplateException_whenAnErrorOccurred_thenReturnCauseIsNull() {
    // Arrange and Act
    TemplateException actualTemplateException = new TemplateException("An error occurred");

    // Assert
    assertEquals("An error occurred", actualTemplateException.getMessage());
    assertNull(actualTemplateException.getCause());
    assertEquals(0, actualTemplateException.getSuppressed().length);
  }

  /**
   * Test {@link TemplateException#TemplateException(String, Throwable)}.
   * <ul>
   *   <li>When {@link Throwable#Throwable()}.</li>
   *   <li>Then return Cause is {@link Throwable#Throwable()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TemplateException#TemplateException(String, Throwable)}
   */
  @Test
  @DisplayName("Test new TemplateException(String, Throwable); when Throwable(); then return Cause is Throwable()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void TemplateException.<init>(String)", "void TemplateException.<init>(String, Throwable)"})
  void testNewTemplateException_whenThrowable_thenReturnCauseIsThrowable() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    TemplateException actualTemplateException = new TemplateException("An error occurred", cause);

    // Assert
    assertEquals("An error occurred", actualTemplateException.getMessage());
    assertEquals(0, actualTemplateException.getSuppressed().length);
    assertSame(cause, actualTemplateException.getCause());
  }
}
