package com.symphony.bdk.core.service.message.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PresentationMLParserExceptionDiffblueTest {
  /**
   * Test {@link PresentationMLParserException#PresentationMLParserException(String, String,
   * Exception)}.
   *
   * <p>Method under test: {@link
   * PresentationMLParserException#PresentationMLParserException(String, String, Exception)}
   */
  @Test
  @DisplayName("Test new PresentationMLParserException(String, String, Exception)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PresentationMLParserException.<init>(String, String, Exception)"})
  void testNewPresentationMLParserException() {
    // Arrange
    Exception e = new Exception();

    // Act
    PresentationMLParserException actualPresentationMLParserException =
        new PresentationMLParserException("Presentation ML", "An error occurred", e);

    // Assert
    assertEquals("An error occurred", actualPresentationMLParserException.getMessage());
    assertEquals("Presentation ML", actualPresentationMLParserException.getPresentationML());
    assertEquals(0, actualPresentationMLParserException.getSuppressed().length);
    assertSame(e, actualPresentationMLParserException.getCause());
  }
}
