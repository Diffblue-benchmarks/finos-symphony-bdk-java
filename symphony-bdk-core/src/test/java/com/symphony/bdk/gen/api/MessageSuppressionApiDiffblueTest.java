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

class MessageSuppressionApiDiffblueTest {
  /**
   * Test {@link MessageSuppressionApi#v1AdminMessagesuppressionIdSuppressPost(String, String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * MessageSuppressionApi#v1AdminMessagesuppressionIdSuppressPost(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1AdminMessagesuppressionIdSuppressPost(String, String); when '42'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.MessageSuppressionResponse MessageSuppressionApi.v1AdminMessagesuppressionIdSuppressPost(String, String)"
  })
  void testV1AdminMessagesuppressionIdSuppressPost_when42_thenThrowApiException()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new MessageSuppressionApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminMessagesuppressionIdSuppressPost("42", null));
  }

  /**
   * Test {@link MessageSuppressionApi#v1AdminMessagesuppressionIdSuppressPost(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * MessageSuppressionApi#v1AdminMessagesuppressionIdSuppressPost(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1AdminMessagesuppressionIdSuppressPost(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.MessageSuppressionResponse MessageSuppressionApi.v1AdminMessagesuppressionIdSuppressPost(String, String)"
  })
  void testV1AdminMessagesuppressionIdSuppressPost_whenNull_thenThrowApiException()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new MessageSuppressionApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminMessagesuppressionIdSuppressPost(null, "ABC123"));
  }

  /**
   * Test {@link MessageSuppressionApi#v1AdminMessagesuppressionIdSuppressPostWithHttpInfo(String,
   * String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * MessageSuppressionApi#v1AdminMessagesuppressionIdSuppressPostWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1AdminMessagesuppressionIdSuppressPostWithHttpInfo(String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse MessageSuppressionApi.v1AdminMessagesuppressionIdSuppressPostWithHttpInfo(String, String)"
  })
  void testV1AdminMessagesuppressionIdSuppressPostWithHttpInfo_thenThrowApiException()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new MessageSuppressionApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminMessagesuppressionIdSuppressPostWithHttpInfo(
                    null, "https://example.org/example"));
  }

  /**
   * Test {@link MessageSuppressionApi#v1AdminMessagesuppressionIdSuppressPostWithHttpInfo(String,
   * String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * MessageSuppressionApi#v1AdminMessagesuppressionIdSuppressPostWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1AdminMessagesuppressionIdSuppressPostWithHttpInfo(String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse MessageSuppressionApi.v1AdminMessagesuppressionIdSuppressPostWithHttpInfo(String, String)"
  })
  void testV1AdminMessagesuppressionIdSuppressPostWithHttpInfo_thenThrowApiException2()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new MessageSuppressionApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminMessagesuppressionIdSuppressPostWithHttpInfo(
                    "https://example.org/example", null));
  }
}
