package com.symphony.bdk.http.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ApiRuntimeExceptionDiffblueTest {
  /**
   * Test {@link ApiRuntimeException#ApiRuntimeException(ApiException)}.
   *
   * <p>Method under test: {@link ApiRuntimeException#ApiRuntimeException(ApiException)}
   */
  @Test
  @DisplayName("Test new ApiRuntimeException(ApiException)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiRuntimeException.<init>(ApiException)"})
  void testNewApiRuntimeException() {
    // Arrange
    ApiException source = new ApiException(1, "https://example.org/example");

    // Act
    ApiRuntimeException actualApiRuntimeException = new ApiRuntimeException(source);

    // Assert
    Throwable cause = actualApiRuntimeException.getCause();
    assertTrue(cause instanceof ApiException);
    assertEquals(
        "com.symphony.bdk.http.api.ApiException: https://example.org/example",
        actualApiRuntimeException.getLocalizedMessage());
    assertEquals(
        "com.symphony.bdk.http.api.ApiException: https://example.org/example",
        actualApiRuntimeException.getMessage());
    assertNull(actualApiRuntimeException.getResponseBody());
    assertNull(actualApiRuntimeException.getResponseHeaders());
    assertEquals(0, actualApiRuntimeException.getSuppressed().length);
    assertEquals(1, actualApiRuntimeException.getCode());
    assertSame(source, cause);
  }
}
