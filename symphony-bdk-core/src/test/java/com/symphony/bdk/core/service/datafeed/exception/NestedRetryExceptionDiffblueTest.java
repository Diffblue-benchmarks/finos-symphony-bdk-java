package com.symphony.bdk.core.service.datafeed.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class NestedRetryExceptionDiffblueTest {
  /**
   * Test {@link NestedRetryException#NestedRetryException(String, Throwable)}.
   * <p>
   * Method under test: {@link NestedRetryException#NestedRetryException(String, Throwable)}
   */
  @Test
  @DisplayName("Test new NestedRetryException(String, Throwable)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void NestedRetryException.<init>(String, Throwable)"})
  void testNewNestedRetryException() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    NestedRetryException actualNestedRetryException = new NestedRetryException("An error occurred", cause);

    // Assert
    assertEquals("An error occurred", actualNestedRetryException.getMessage());
    assertEquals(0, actualNestedRetryException.getSuppressed().length);
    assertSame(cause, actualNestedRetryException.getCause());
  }
}
