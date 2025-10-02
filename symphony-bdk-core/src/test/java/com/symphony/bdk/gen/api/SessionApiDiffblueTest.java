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

class SessionApiDiffblueTest {
  /**
   * Test {@link SessionApi#v1SessioninfoGet(String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SessionApi#v1SessioninfoGet(String)}
   */
  @Test
  @DisplayName("Test v1SessioninfoGet(String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.SessionInfo SessionApi.v1SessioninfoGet(String)"
  })
  void testV1SessioninfoGet_thenThrowApiException() throws ApiException {
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
    assertThrows(ApiException.class, () -> new SessionApi(apiClient).v1SessioninfoGet(null));
  }

  /**
   * Test {@link SessionApi#v1SessioninfoGetWithHttpInfo(String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SessionApi#v1SessioninfoGetWithHttpInfo(String)}
   */
  @Test
  @DisplayName("Test v1SessioninfoGetWithHttpInfo(String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse SessionApi.v1SessioninfoGetWithHttpInfo(String)"
  })
  void testV1SessioninfoGetWithHttpInfo_thenThrowApiException() throws ApiException {
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
        ApiException.class, () -> new SessionApi(apiClient).v1SessioninfoGetWithHttpInfo(null));
  }

  /**
   * Test {@link SessionApi#v2SessioninfoGet(String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SessionApi#v2SessioninfoGet(String)}
   */
  @Test
  @DisplayName("Test v2SessioninfoGet(String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.symphony.bdk.gen.api.model.UserV2 SessionApi.v2SessioninfoGet(String)"})
  void testV2SessioninfoGet_thenThrowApiException() throws ApiException {
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
    assertThrows(ApiException.class, () -> new SessionApi(apiClient).v2SessioninfoGet(null));
  }

  /**
   * Test {@link SessionApi#v2SessioninfoGetWithHttpInfo(String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link SessionApi#v2SessioninfoGetWithHttpInfo(String)}
   */
  @Test
  @DisplayName("Test v2SessioninfoGetWithHttpInfo(String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse SessionApi.v2SessioninfoGetWithHttpInfo(String)"
  })
  void testV2SessioninfoGetWithHttpInfo_thenThrowApiException() throws ApiException {
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
        ApiException.class, () -> new SessionApi(apiClient).v2SessioninfoGetWithHttpInfo(null));
  }
}
