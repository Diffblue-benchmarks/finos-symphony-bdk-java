package com.symphony.bdk.core.service.message.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MessageParserExceptionDiffblueTest {
  /**
   * Test {@link MessageParserException#MessageParserException(String, Exception)}.
   * <p>
   * Method under test: {@link MessageParserException#MessageParserException(String, Exception)}
   */
  @Test
  @DisplayName("Test new MessageParserException(String, Exception)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void MessageParserException.<init>(String, Exception)"})
  void testNewMessageParserException() {
    // Arrange
    Exception e = new Exception("foo");

    // Act
    MessageParserException actualMessageParserException = new MessageParserException("An error occurred", e);

    // Assert
    assertEquals("An error occurred", actualMessageParserException.getMessage());
    assertEquals(0, actualMessageParserException.getSuppressed().length);
    assertSame(e, actualMessageParserException.getCause());
  }
}
