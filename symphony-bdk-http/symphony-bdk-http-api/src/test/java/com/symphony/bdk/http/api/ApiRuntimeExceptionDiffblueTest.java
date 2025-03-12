package com.symphony.bdk.http.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ApiRuntimeExceptionDiffblueTest {
  /**
   * Test {@link ApiRuntimeException#ApiRuntimeException(ApiException)}.
   * <ul>
   *   <li>Then Cause return {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiRuntimeException#ApiRuntimeException(ApiException)}
   */
  @Test
  @DisplayName("Test new ApiRuntimeException(ApiException); then Cause return ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ApiRuntimeException.<init>(ApiException)"})
  void testNewApiRuntimeException_thenCauseReturnApiException() {
    // Arrange
    ApiException source = new ApiException(1, "https://example.org/example");

    // Act
    ApiRuntimeException actualApiRuntimeException = new ApiRuntimeException(source);

    // Assert
    Throwable cause = actualApiRuntimeException.getCause();
    assertTrue(cause instanceof ApiException);
    assertEquals("com.symphony.bdk.http.api.ApiException: https://example.org/example",
        actualApiRuntimeException.getLocalizedMessage());
    assertEquals("com.symphony.bdk.http.api.ApiException: https://example.org/example",
        actualApiRuntimeException.getMessage());
    assertNull(actualApiRuntimeException.getResponseBody());
    assertNull(actualApiRuntimeException.getResponseHeaders());
    assertEquals(0, actualApiRuntimeException.getSuppressed().length);
    assertEquals(1, actualApiRuntimeException.getCode());
    assertSame(source, cause);
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ApiRuntimeException#getCode()}
   *   <li>{@link ApiRuntimeException#getResponseBody()}
   *   <li>{@link ApiRuntimeException#getResponseHeaders()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int ApiRuntimeException.getCode()", "String ApiRuntimeException.getResponseBody()",
      "java.util.Map ApiRuntimeException.getResponseHeaders()"})
  void testGettersAndSetters() {
    // Arrange
    ApiRuntimeException apiRuntimeException = new ApiRuntimeException(
        new ApiException(1, "https://example.org/example"));

    // Act
    int actualCode = apiRuntimeException.getCode();
    String actualResponseBody = apiRuntimeException.getResponseBody();

    // Assert
    assertNull(actualResponseBody);
    assertNull(apiRuntimeException.getResponseHeaders());
    assertEquals(1, actualCode);
  }
}
