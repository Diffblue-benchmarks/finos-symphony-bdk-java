package com.symphony.bdk.core.client.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ApiClientInitializationExceptionDiffblueTest {
  /**
   * Test {@link ApiClientInitializationException#ApiClientInitializationException(String)}.
   *
   * <p>Method under test: {@link
   * ApiClientInitializationException#ApiClientInitializationException(String)}
   */
  @Test
  @DisplayName("Test new ApiClientInitializationException(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiClientInitializationException.<init>(String)"})
  void testNewApiClientInitializationException() {
    // Arrange and Act
    ApiClientInitializationException actualApiClientInitializationException =
        new ApiClientInitializationException("An error occurred");

    // Assert
    assertEquals("An error occurred", actualApiClientInitializationException.getMessage());
    assertNull(actualApiClientInitializationException.getCause());
    assertEquals(0, actualApiClientInitializationException.getSuppressed().length);
  }
}
