package com.symphony.bdk.core.config.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkConfigFormatExceptionDiffblueTest {
  /**
   * Test {@link BdkConfigFormatException#BdkConfigFormatException(String)}.
   * <p>
   * Method under test: {@link BdkConfigFormatException#BdkConfigFormatException(String)}
   */
  @Test
  @DisplayName("Test new BdkConfigFormatException(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BdkConfigFormatException.<init>(String)"})
  void testNewBdkConfigFormatException() {
    // Arrange and Act
    BdkConfigFormatException actualBdkConfigFormatException = new BdkConfigFormatException("An error occurred");

    // Assert
    assertEquals("An error occurred", actualBdkConfigFormatException.getMessage());
    assertNull(actualBdkConfigFormatException.getCause());
    assertEquals(0, actualBdkConfigFormatException.getSuppressed().length);
  }
}
