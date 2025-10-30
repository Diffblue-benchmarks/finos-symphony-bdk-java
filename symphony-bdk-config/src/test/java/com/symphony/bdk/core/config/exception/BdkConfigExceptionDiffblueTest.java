package com.symphony.bdk.core.config.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkConfigExceptionDiffblueTest {
  /**
   * Test {@link BdkConfigException#BdkConfigException(String)}.
   * <ul>
   *   <li>When {@code An error occurred}.</li>
   *   <li>Then return Cause is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkConfigException#BdkConfigException(String)}
   */
  @Test
  @DisplayName("Test new BdkConfigException(String); when 'An error occurred'; then return Cause is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BdkConfigException.<init>(String)", "void BdkConfigException.<init>(String, Throwable)"})
  void testNewBdkConfigException_whenAnErrorOccurred_thenReturnCauseIsNull() {
    // Arrange and Act
    BdkConfigException actualBdkConfigException = new BdkConfigException("An error occurred");

    // Assert
    assertEquals("An error occurred", actualBdkConfigException.getMessage());
    assertNull(actualBdkConfigException.getCause());
    assertEquals(0, actualBdkConfigException.getSuppressed().length);
  }

  /**
   * Test {@link BdkConfigException#BdkConfigException(String, Throwable)}.
   * <ul>
   *   <li>When {@link Throwable#Throwable()}.</li>
   *   <li>Then return Cause is {@link Throwable#Throwable()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkConfigException#BdkConfigException(String, Throwable)}
   */
  @Test
  @DisplayName("Test new BdkConfigException(String, Throwable); when Throwable(); then return Cause is Throwable()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BdkConfigException.<init>(String)", "void BdkConfigException.<init>(String, Throwable)"})
  void testNewBdkConfigException_whenThrowable_thenReturnCauseIsThrowable() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    BdkConfigException actualBdkConfigException = new BdkConfigException("An error occurred", cause);

    // Assert
    assertEquals("An error occurred", actualBdkConfigException.getMessage());
    assertEquals(0, actualBdkConfigException.getSuppressed().length);
    assertSame(cause, actualBdkConfigException.getCause());
  }
}
