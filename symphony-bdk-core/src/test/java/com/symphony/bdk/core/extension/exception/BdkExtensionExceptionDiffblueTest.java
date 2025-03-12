package com.symphony.bdk.core.extension.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkExtensionExceptionDiffblueTest {
  /**
   * Test {@link BdkExtensionException#BdkExtensionException(String, Throwable)}.
   * <p>
   * Method under test: {@link BdkExtensionException#BdkExtensionException(String, Throwable)}
   */
  @Test
  @DisplayName("Test new BdkExtensionException(String, Throwable)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BdkExtensionException.<init>(String, Throwable)"})
  void testNewBdkExtensionException() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    BdkExtensionException actualBdkExtensionException = new BdkExtensionException("An error occurred", cause);

    // Assert
    assertEquals("An error occurred", actualBdkExtensionException.getMessage());
    assertEquals(0, actualBdkExtensionException.getSuppressed().length);
    assertSame(cause, actualBdkExtensionException.getCause());
  }
}
