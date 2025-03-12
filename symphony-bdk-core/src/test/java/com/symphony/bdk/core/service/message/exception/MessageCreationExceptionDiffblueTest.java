package com.symphony.bdk.core.service.message.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MessageCreationExceptionDiffblueTest {
  /**
   * Test {@link MessageCreationException#MessageCreationException(String, Exception)}.
   * <ul>
   *   <li>Then return Cause is {@link Exception#Exception(String)} with {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageCreationException#MessageCreationException(String, Exception)}
   */
  @Test
  @DisplayName("Test new MessageCreationException(String, Exception); then return Cause is Exception(String) with 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void MessageCreationException.<init>(String)",
      "void MessageCreationException.<init>(String, Exception)"})
  void testNewMessageCreationException_thenReturnCauseIsExceptionWithFoo() {
    // Arrange
    Exception e = new Exception("foo");

    // Act
    MessageCreationException actualMessageCreationException = new MessageCreationException("An error occurred", e);

    // Assert
    assertEquals("An error occurred", actualMessageCreationException.getMessage());
    assertEquals(0, actualMessageCreationException.getSuppressed().length);
    assertSame(e, actualMessageCreationException.getCause());
  }

  /**
   * Test {@link MessageCreationException#MessageCreationException(String)}.
   * <ul>
   *   <li>When {@code An error occurred}.</li>
   *   <li>Then return Cause is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageCreationException#MessageCreationException(String)}
   */
  @Test
  @DisplayName("Test new MessageCreationException(String); when 'An error occurred'; then return Cause is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void MessageCreationException.<init>(String)",
      "void MessageCreationException.<init>(String, Exception)"})
  void testNewMessageCreationException_whenAnErrorOccurred_thenReturnCauseIsNull() {
    // Arrange and Act
    MessageCreationException actualMessageCreationException = new MessageCreationException("An error occurred");

    // Assert
    assertEquals("An error occurred", actualMessageCreationException.getMessage());
    assertNull(actualMessageCreationException.getCause());
    assertEquals(0, actualMessageCreationException.getSuppressed().length);
  }
}
