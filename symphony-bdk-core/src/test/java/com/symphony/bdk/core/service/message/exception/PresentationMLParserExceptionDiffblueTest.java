package com.symphony.bdk.core.service.message.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PresentationMLParserExceptionDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link PresentationMLParserException#PresentationMLParserException(String, String, Exception)}
   *   <li>{@link PresentationMLParserException#getPresentationML()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PresentationMLParserException.<init>(String, String, Exception)",
      "String PresentationMLParserException.getPresentationML()"})
  void testGettersAndSetters() {
    // Arrange
    Exception e = new Exception("foo");

    // Act
    PresentationMLParserException actualPresentationMLParserException = new PresentationMLParserException(
        "Presentation ML", "An error occurred", e);

    // Assert
    assertEquals("An error occurred", actualPresentationMLParserException.getMessage());
    assertEquals("Presentation ML", actualPresentationMLParserException.getPresentationML());
    assertEquals(0, actualPresentationMLParserException.getSuppressed().length);
    assertSame(e, actualPresentationMLParserException.getCause());
  }
}
