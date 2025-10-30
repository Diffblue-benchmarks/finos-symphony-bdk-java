package com.symphony.bdk.http.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ApiExceptionDiffblueTest {
  /**
   * Test getters and setters.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return ResponseBody is {@code https://example.org/example}.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ApiException#ApiException(int, String, Map, String)}
   *   <li>{@link ApiException#getCode()}
   *   <li>{@link ApiException#getResponseBody()}
   *   <li>{@link ApiException#getResponseHeaders()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters; when HashMap(); then return ResponseBody is 'https://example.org/example'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ApiException.<init>(int, String)", "void ApiException.<init>(int, String, Map, String)",
      "void ApiException.<init>(int, Throwable)", "void ApiException.<init>(String, Throwable)",
      "int ApiException.getCode()", "String ApiException.getResponseBody()", "Map ApiException.getResponseHeaders()"})
  void testGettersAndSetters_whenHashMap_thenReturnResponseBodyIsHttpsExampleOrgExample() {
    // Arrange
    HashMap<String, List<String>> responseHeaders = new HashMap<>();

    // Act
    ApiException actualApiException = new ApiException(1, "https://example.org/example", responseHeaders,
        "https://example.org/example");
    int actualCode = actualApiException.getCode();
    String actualResponseBody = actualApiException.getResponseBody();
    Map<String, List<String>> actualResponseHeaders = actualApiException.getResponseHeaders();

    // Assert
    assertEquals("https://example.org/example", actualResponseBody);
    assertEquals("https://example.org/example", actualApiException.getMessage());
    assertNull(actualApiException.getCause());
    assertEquals(0, actualApiException.getSuppressed().length);
    assertEquals(1, actualCode);
    assertTrue(actualResponseHeaders.isEmpty());
    assertSame(responseHeaders, actualResponseHeaders);
  }

  /**
   * Test getters and setters.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then return Cause is {@code null}.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ApiException#ApiException(int, String)}
   *   <li>{@link ApiException#getCode()}
   *   <li>{@link ApiException#getResponseBody()}
   *   <li>{@link ApiException#getResponseHeaders()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters; when one; then return Cause is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ApiException.<init>(int, String)", "void ApiException.<init>(int, String, Map, String)",
      "void ApiException.<init>(int, Throwable)", "void ApiException.<init>(String, Throwable)",
      "int ApiException.getCode()", "String ApiException.getResponseBody()", "Map ApiException.getResponseHeaders()"})
  void testGettersAndSetters_whenOne_thenReturnCauseIsNull() {
    // Arrange and Act
    ApiException actualApiException = new ApiException(1, "https://example.org/example");
    int actualCode = actualApiException.getCode();
    String actualResponseBody = actualApiException.getResponseBody();

    // Assert
    assertEquals("https://example.org/example", actualApiException.getMessage());
    assertNull(actualResponseBody);
    assertNull(actualApiException.getCause());
    assertNull(actualApiException.getResponseHeaders());
    assertEquals(0, actualApiException.getSuppressed().length);
    assertEquals(1, actualCode);
  }

  /**
   * Test getters and setters.
   * <ul>
   *   <li>When {@link Throwable#Throwable()}.</li>
   *   <li>Then return Code is zero.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ApiException#ApiException(String, Throwable)}
   *   <li>{@link ApiException#getCode()}
   *   <li>{@link ApiException#getResponseBody()}
   *   <li>{@link ApiException#getResponseHeaders()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters; when Throwable(); then return Code is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ApiException.<init>(int, String)", "void ApiException.<init>(int, String, Map, String)",
      "void ApiException.<init>(int, Throwable)", "void ApiException.<init>(String, Throwable)",
      "int ApiException.getCode()", "String ApiException.getResponseBody()", "Map ApiException.getResponseHeaders()"})
  void testGettersAndSetters_whenThrowable_thenReturnCodeIsZero() {
    // Arrange
    Throwable throwable = new Throwable();

    // Act
    ApiException actualApiException = new ApiException("https://example.org/example", throwable);
    int actualCode = actualApiException.getCode();
    String actualResponseBody = actualApiException.getResponseBody();

    // Assert
    assertEquals("https://example.org/example", actualApiException.getMessage());
    assertNull(actualResponseBody);
    assertNull(actualApiException.getResponseHeaders());
    assertEquals(0, actualCode);
    assertEquals(0, actualApiException.getSuppressed().length);
    assertSame(throwable, actualApiException.getCause());
  }

  /**
   * Test getters and setters.
   * <ul>
   *   <li>When {@link Throwable#Throwable()}.</li>
   *   <li>Then return Message is {@code Throwable}.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ApiException#ApiException(int, Throwable)}
   *   <li>{@link ApiException#getCode()}
   *   <li>{@link ApiException#getResponseBody()}
   *   <li>{@link ApiException#getResponseHeaders()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters; when Throwable(); then return Message is 'java.lang.Throwable'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ApiException.<init>(int, String)", "void ApiException.<init>(int, String, Map, String)",
      "void ApiException.<init>(int, Throwable)", "void ApiException.<init>(String, Throwable)",
      "int ApiException.getCode()", "String ApiException.getResponseBody()", "Map ApiException.getResponseHeaders()"})
  void testGettersAndSetters_whenThrowable_thenReturnMessageIsJavaLangThrowable() {
    // Arrange
    Throwable throwable = new Throwable();

    // Act
    ApiException actualApiException = new ApiException(1, throwable);
    int actualCode = actualApiException.getCode();
    String actualResponseBody = actualApiException.getResponseBody();

    // Assert
    assertEquals("java.lang.Throwable", actualApiException.getMessage());
    assertNull(actualResponseBody);
    assertNull(actualApiException.getResponseHeaders());
    assertEquals(0, actualApiException.getSuppressed().length);
    assertEquals(1, actualCode);
    assertSame(throwable, actualApiException.getCause());
  }

  /**
   * Test {@link ApiException#isUnauthorized()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiException#isUnauthorized()}
   */
  @Test
  @DisplayName("Test isUnauthorized(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApiException.isUnauthorized()"})
  void testIsUnauthorized_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new ApiException(1, "https://example.org/example")).isUnauthorized());
  }

  /**
   * Test {@link ApiException#isUnauthorized()}.
   * <ul>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiException#isUnauthorized()}
   */
  @Test
  @DisplayName("Test isUnauthorized(); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApiException.isUnauthorized()"})
  void testIsUnauthorized_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new ApiException(401, "https://example.org/example")).isUnauthorized());
  }

  /**
   * Test {@link ApiException#isClientError()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiException#isClientError()}
   */
  @Test
  @DisplayName("Test isClientError(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApiException.isClientError()"})
  void testIsClientError_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new ApiException(1, "https://example.org/example")).isClientError());
  }

  /**
   * Test {@link ApiException#isClientError()}.
   * <ul>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiException#isClientError()}
   */
  @Test
  @DisplayName("Test isClientError(); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApiException.isClientError()"})
  void testIsClientError_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new ApiException(400, "https://example.org/example")).isClientError());
  }

  /**
   * Test {@link ApiException#isServerError()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiException#isServerError()}
   */
  @Test
  @DisplayName("Test isServerError(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApiException.isServerError()"})
  void testIsServerError_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new ApiException(1, "https://example.org/example")).isServerError());
  }

  /**
   * Test {@link ApiException#isServerError()}.
   * <ul>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiException#isServerError()}
   */
  @Test
  @DisplayName("Test isServerError(); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApiException.isServerError()"})
  void testIsServerError_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new ApiException(500, "https://example.org/example")).isServerError());
  }

  /**
   * Test {@link ApiException#isTooManyRequestsError()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiException#isTooManyRequestsError()}
   */
  @Test
  @DisplayName("Test isTooManyRequestsError(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApiException.isTooManyRequestsError()"})
  void testIsTooManyRequestsError_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new ApiException(1, "https://example.org/example")).isTooManyRequestsError());
  }

  /**
   * Test {@link ApiException#isTooManyRequestsError()}.
   * <ul>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiException#isTooManyRequestsError()}
   */
  @Test
  @DisplayName("Test isTooManyRequestsError(); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApiException.isTooManyRequestsError()"})
  void testIsTooManyRequestsError_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new ApiException(429, "https://example.org/example")).isTooManyRequestsError());
  }
}
