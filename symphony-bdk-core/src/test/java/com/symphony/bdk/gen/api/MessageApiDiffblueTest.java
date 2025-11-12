package com.symphony.bdk.gen.api;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import jakarta.ws.rs.client.Client;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MessageApiDiffblueTest {
  /**
   * Test {@link MessageApi#v1MessageMidStatusGet(String, String)}.
   *
   * <ul>
   *   <li>When {@code Mid}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link MessageApi#v1MessageMidStatusGet(String, String)}
   */
  @Test
  @DisplayName("Test v1MessageMidStatusGet(String, String); when 'Mid'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.MessageStatus MessageApi.v1MessageMidStatusGet(String, String)"
  })
  void testV1MessageMidStatusGet_whenMid_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act and Assert
    assertThrows(
        ApiException.class, () -> new MessageApi(apiClient).v1MessageMidStatusGet("Mid", null));
  }

  /**
   * Test {@link MessageApi#v1MessageMidStatusGet(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link MessageApi#v1MessageMidStatusGet(String, String)}
   */
  @Test
  @DisplayName("Test v1MessageMidStatusGet(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.MessageStatus MessageApi.v1MessageMidStatusGet(String, String)"
  })
  void testV1MessageMidStatusGet_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act and Assert
    assertThrows(
        ApiException.class, () -> new MessageApi(apiClient).v1MessageMidStatusGet(null, "ABC123"));
  }

  /**
   * Test {@link MessageApi#v1MessageMidStatusGetWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link MessageApi#v1MessageMidStatusGetWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1MessageMidStatusGetWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse MessageApi.v1MessageMidStatusGetWithHttpInfo(String, String)"
  })
  void testV1MessageMidStatusGetWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new MessageApi(apiClient)
                .v1MessageMidStatusGetWithHttpInfo(null, "https://example.org/example"));
  }

  /**
   * Test {@link MessageApi#v1MessageMidStatusGetWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link MessageApi#v1MessageMidStatusGetWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1MessageMidStatusGetWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse MessageApi.v1MessageMidStatusGetWithHttpInfo(String, String)"
  })
  void testV1MessageMidStatusGetWithHttpInfo_whenNull_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new MessageApi(apiClient)
                .v1MessageMidStatusGetWithHttpInfo("https://example.org/example", null));
  }
}
