package com.symphony.bdk.http.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ApiExceptionDiffblueTest {
  /**
   * Test {@link ApiException#ApiException(int, String, Map, String)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return ResponseBody is {@code https://example.org/example}.
   * </ul>
   *
   * <p>Method under test: {@link ApiException#ApiException(int, String, Map, String)}
   */
  @Test
  @DisplayName(
      "Test new ApiException(int, String, Map, String); when HashMap(); then return ResponseBody is 'https://example.org/example'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ApiException.<init>(int, String)",
    "void ApiException.<init>(int, String, Map, String)",
    "void ApiException.<init>(int, Throwable)",
    "void ApiException.<init>(String, Throwable)"
  })
  void testNewApiException_whenHashMap_thenReturnResponseBodyIsHttpsExampleOrgExample() {
    // Arrange
    HashMap<String, List<String>> responseHeaders = new HashMap<>();

    // Act
    ApiException actualApiException =
        new ApiException(
            1, "https://example.org/example", responseHeaders, "https://example.org/example");

    // Assert
    assertEquals("https://example.org/example", actualApiException.getResponseBody());
    assertEquals("https://example.org/example", actualApiException.getMessage());
    assertNull(actualApiException.getCause());
    assertEquals(0, actualApiException.getSuppressed().length);
    assertEquals(1, actualApiException.getCode());
    Map<String, List<String>> responseHeaders2 = actualApiException.getResponseHeaders();
    assertTrue(responseHeaders2.isEmpty());
    assertSame(responseHeaders, responseHeaders2);
  }

  /**
   * Test {@link ApiException#ApiException(int, String)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return Cause is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ApiException#ApiException(int, String)}
   */
  @Test
  @DisplayName("Test new ApiException(int, String); when one; then return Cause is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ApiException.<init>(int, String)",
    "void ApiException.<init>(int, String, Map, String)",
    "void ApiException.<init>(int, Throwable)",
    "void ApiException.<init>(String, Throwable)"
  })
  void testNewApiException_whenOne_thenReturnCauseIsNull() {
    // Arrange and Act
    ApiException actualApiException = new ApiException(1, "https://example.org/example");

    // Assert
    assertEquals("https://example.org/example", actualApiException.getMessage());
    assertNull(actualApiException.getResponseBody());
    assertNull(actualApiException.getCause());
    assertNull(actualApiException.getResponseHeaders());
    assertEquals(0, actualApiException.getSuppressed().length);
    assertEquals(1, actualApiException.getCode());
  }

  /**
   * Test {@link ApiException#ApiException(String, Throwable)}.
   *
   * <ul>
   *   <li>When {@link Throwable#Throwable()}.
   *   <li>Then return Code is zero.
   * </ul>
   *
   * <p>Method under test: {@link ApiException#ApiException(String, Throwable)}
   */
  @Test
  @DisplayName(
      "Test new ApiException(String, Throwable); when Throwable(); then return Code is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ApiException.<init>(int, String)",
    "void ApiException.<init>(int, String, Map, String)",
    "void ApiException.<init>(int, Throwable)",
    "void ApiException.<init>(String, Throwable)"
  })
  void testNewApiException_whenThrowable_thenReturnCodeIsZero() {
    // Arrange
    Throwable throwable = new Throwable();

    // Act
    ApiException actualApiException = new ApiException("https://example.org/example", throwable);

    // Assert
    assertEquals("https://example.org/example", actualApiException.getMessage());
    assertNull(actualApiException.getResponseBody());
    assertNull(actualApiException.getResponseHeaders());
    assertEquals(0, actualApiException.getCode());
    assertEquals(0, actualApiException.getSuppressed().length);
    assertSame(throwable, actualApiException.getCause());
  }

  /**
   * Test {@link ApiException#ApiException(int, Throwable)}.
   *
   * <ul>
   *   <li>When {@link Throwable#Throwable()}.
   *   <li>Then return Message is {@code Throwable}.
   * </ul>
   *
   * <p>Method under test: {@link ApiException#ApiException(int, Throwable)}
   */
  @Test
  @DisplayName(
      "Test new ApiException(int, Throwable); when Throwable(); then return Message is 'java.lang.Throwable'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ApiException.<init>(int, String)",
    "void ApiException.<init>(int, String, Map, String)",
    "void ApiException.<init>(int, Throwable)",
    "void ApiException.<init>(String, Throwable)"
  })
  void testNewApiException_whenThrowable_thenReturnMessageIsJavaLangThrowable() {
    // Arrange
    Throwable throwable = new Throwable();

    // Act
    ApiException actualApiException = new ApiException(1, throwable);

    // Assert
    assertEquals("java.lang.Throwable", actualApiException.getMessage());
    assertNull(actualApiException.getResponseBody());
    assertNull(actualApiException.getResponseHeaders());
    assertEquals(0, actualApiException.getSuppressed().length);
    assertEquals(1, actualApiException.getCode());
    assertSame(throwable, actualApiException.getCause());
  }

  /**
   * Test {@link ApiException#isUnauthorized()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ApiException#isUnauthorized()}
   */
  @Test
  @DisplayName("Test isUnauthorized(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ApiException.isUnauthorized()"})
  void testIsUnauthorized_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(new ApiException(1, "https://example.org/example").isUnauthorized());
  }

  /**
   * Test {@link ApiException#isUnauthorized()}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ApiException#isUnauthorized()}
   */
  @Test
  @DisplayName("Test isUnauthorized(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ApiException.isUnauthorized()"})
  void testIsUnauthorized_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(new ApiException(401, "https://example.org/example").isUnauthorized());
  }

  /**
   * Test {@link ApiException#isClientError()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ApiException#isClientError()}
   */
  @Test
  @DisplayName("Test isClientError(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ApiException.isClientError()"})
  void testIsClientError_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(new ApiException(1, "https://example.org/example").isClientError());
  }

  /**
   * Test {@link ApiException#isClientError()}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ApiException#isClientError()}
   */
  @Test
  @DisplayName("Test isClientError(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ApiException.isClientError()"})
  void testIsClientError_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(new ApiException(400, "https://example.org/example").isClientError());
  }

  /**
   * Test {@link ApiException#isServerError()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ApiException#isServerError()}
   */
  @Test
  @DisplayName("Test isServerError(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ApiException.isServerError()"})
  void testIsServerError_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(new ApiException(1, "https://example.org/example").isServerError());
  }

  /**
   * Test {@link ApiException#isServerError()}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ApiException#isServerError()}
   */
  @Test
  @DisplayName("Test isServerError(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ApiException.isServerError()"})
  void testIsServerError_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(new ApiException(500, "https://example.org/example").isServerError());
  }

  /**
   * Test {@link ApiException#isTooManyRequestsError()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ApiException#isTooManyRequestsError()}
   */
  @Test
  @DisplayName("Test isTooManyRequestsError(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ApiException.isTooManyRequestsError()"})
  void testIsTooManyRequestsError_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(new ApiException(1, "https://example.org/example").isTooManyRequestsError());
  }

  /**
   * Test {@link ApiException#isTooManyRequestsError()}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ApiException#isTooManyRequestsError()}
   */
  @Test
  @DisplayName("Test isTooManyRequestsError(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ApiException.isTooManyRequestsError()"})
  void testIsTooManyRequestsError_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(new ApiException(429, "https://example.org/example").isTooManyRequestsError());
  }
}
