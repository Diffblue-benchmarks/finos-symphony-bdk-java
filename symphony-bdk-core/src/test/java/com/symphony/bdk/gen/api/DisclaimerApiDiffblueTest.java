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

class DisclaimerApiDiffblueTest {
  /**
   * Test {@link DisclaimerApi#v1AdminDisclaimerDidGet(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DisclaimerApi#v1AdminDisclaimerDidGet(String, String)}
   */
  @Test
  @DisplayName("Test v1AdminDisclaimerDidGet(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.Disclaimer DisclaimerApi.v1AdminDisclaimerDidGet(String, String)"
  })
  void testV1AdminDisclaimerDidGet_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new DisclaimerApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminDisclaimerDidGet(null, "Did"));
  }

  /**
   * Test {@link DisclaimerApi#v1AdminDisclaimerDidGet(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DisclaimerApi#v1AdminDisclaimerDidGet(String, String)}
   */
  @Test
  @DisplayName("Test v1AdminDisclaimerDidGet(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.Disclaimer DisclaimerApi.v1AdminDisclaimerDidGet(String, String)"
  })
  void testV1AdminDisclaimerDidGet_whenNull_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new DisclaimerApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminDisclaimerDidGet("ABC123", null));
  }

  /**
   * Test {@link DisclaimerApi#v1AdminDisclaimerDidGetWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DisclaimerApi#v1AdminDisclaimerDidGetWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1AdminDisclaimerDidGetWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse DisclaimerApi.v1AdminDisclaimerDidGetWithHttpInfo(String, String)"
  })
  void testV1AdminDisclaimerDidGetWithHttpInfo_whenNull_thenThrowApiException()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new DisclaimerApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminDisclaimerDidGetWithHttpInfo(null, "https://example.org/example"));
  }

  /**
   * Test {@link DisclaimerApi#v1AdminDisclaimerDidGetWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DisclaimerApi#v1AdminDisclaimerDidGetWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1AdminDisclaimerDidGetWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse DisclaimerApi.v1AdminDisclaimerDidGetWithHttpInfo(String, String)"
  })
  void testV1AdminDisclaimerDidGetWithHttpInfo_whenNull_thenThrowApiException2()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new DisclaimerApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminDisclaimerDidGetWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link DisclaimerApi#v1AdminDisclaimerDidUsersGet(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DisclaimerApi#v1AdminDisclaimerDidUsersGet(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1AdminDisclaimerDidUsersGet(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.List DisclaimerApi.v1AdminDisclaimerDidUsersGet(String, String)"})
  void testV1AdminDisclaimerDidUsersGet_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new DisclaimerApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminDisclaimerDidUsersGet(null, "Did"));
  }

  /**
   * Test {@link DisclaimerApi#v1AdminDisclaimerDidUsersGet(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DisclaimerApi#v1AdminDisclaimerDidUsersGet(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1AdminDisclaimerDidUsersGet(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.List DisclaimerApi.v1AdminDisclaimerDidUsersGet(String, String)"})
  void testV1AdminDisclaimerDidUsersGet_whenNull_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new DisclaimerApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminDisclaimerDidUsersGet("ABC123", null));
  }

  /**
   * Test {@link DisclaimerApi#v1AdminDisclaimerDidUsersGetWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DisclaimerApi#v1AdminDisclaimerDidUsersGetWithHttpInfo(String,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v1AdminDisclaimerDidUsersGetWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse DisclaimerApi.v1AdminDisclaimerDidUsersGetWithHttpInfo(String, String)"
  })
  void testV1AdminDisclaimerDidUsersGetWithHttpInfo_whenNull_thenThrowApiException()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new DisclaimerApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminDisclaimerDidUsersGetWithHttpInfo(null, "https://example.org/example"));
  }

  /**
   * Test {@link DisclaimerApi#v1AdminDisclaimerDidUsersGetWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DisclaimerApi#v1AdminDisclaimerDidUsersGetWithHttpInfo(String,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v1AdminDisclaimerDidUsersGetWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse DisclaimerApi.v1AdminDisclaimerDidUsersGetWithHttpInfo(String, String)"
  })
  void testV1AdminDisclaimerDidUsersGetWithHttpInfo_whenNull_thenThrowApiException2()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new DisclaimerApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminDisclaimerDidUsersGetWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link DisclaimerApi#v1AdminDisclaimerListGet(String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DisclaimerApi#v1AdminDisclaimerListGet(String)}
   */
  @Test
  @DisplayName("Test v1AdminDisclaimerListGet(String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.List DisclaimerApi.v1AdminDisclaimerListGet(String)"})
  void testV1AdminDisclaimerListGet_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new DisclaimerApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminDisclaimerListGet(null));
  }

  /**
   * Test {@link DisclaimerApi#v1AdminDisclaimerListGetWithHttpInfo(String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DisclaimerApi#v1AdminDisclaimerListGetWithHttpInfo(String)}
   */
  @Test
  @DisplayName("Test v1AdminDisclaimerListGetWithHttpInfo(String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse DisclaimerApi.v1AdminDisclaimerListGetWithHttpInfo(String)"
  })
  void testV1AdminDisclaimerListGetWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new DisclaimerApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminDisclaimerListGetWithHttpInfo(null));
  }
}
