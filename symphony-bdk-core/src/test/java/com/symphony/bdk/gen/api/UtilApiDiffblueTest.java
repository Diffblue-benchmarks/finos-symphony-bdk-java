package com.symphony.bdk.gen.api;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.SimpleMessage;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import jakarta.ws.rs.client.Client;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UtilApiDiffblueTest {
  /**
   * Test {@link UtilApi#v1UtilEchoPost(String, String, SimpleMessage)}.
   * <ul>
   *   <li>Given {@link UtilApi#UtilApi(ApiClient)} with apiClient is {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UtilApi#v1UtilEchoPost(String, String, SimpleMessage)}
   */
  @Test
  @DisplayName("Test v1UtilEchoPost(String, String, SimpleMessage); given UtilApi(ApiClient) with apiClient is 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SimpleMessage UtilApi.v1UtilEchoPost(String, String, SimpleMessage)"})
  void testV1UtilEchoPost_givenUtilApiWithApiClientIsNull_thenThrowApiException() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class, () -> (new UtilApi(null)).v1UtilEchoPost("ABC123", null, null));
  }

  /**
   * Test {@link UtilApi#v1UtilEchoPost(String, String, SimpleMessage)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UtilApi#v1UtilEchoPost(String, String, SimpleMessage)}
   */
  @Test
  @DisplayName("Test v1UtilEchoPost(String, String, SimpleMessage); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SimpleMessage UtilApi.v1UtilEchoPost(String, String, SimpleMessage)"})
  void testV1UtilEchoPost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("application/json ;U", "application/json ;U");
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UtilApi utilApi = new UtilApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> utilApi.v1UtilEchoPost(null, "ABC123", new SimpleMessage()));
  }

  /**
   * Test {@link UtilApi#v1UtilEchoPostWithHttpInfo(String, String, SimpleMessage)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UtilApi#v1UtilEchoPostWithHttpInfo(String, String, SimpleMessage)}
   */
  @Test
  @DisplayName("Test v1UtilEchoPostWithHttpInfo(String, String, SimpleMessage); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UtilApi.v1UtilEchoPostWithHttpInfo(String, String, SimpleMessage)"})
  void testV1UtilEchoPostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UtilApi utilApi = new UtilApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> utilApi.v1UtilEchoPostWithHttpInfo(null, "https://example.org/example", new SimpleMessage()));
  }

  /**
   * Test {@link UtilApi#v1UtilEchoPostWithHttpInfo(String, String, SimpleMessage)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UtilApi#v1UtilEchoPostWithHttpInfo(String, String, SimpleMessage)}
   */
  @Test
  @DisplayName("Test v1UtilEchoPostWithHttpInfo(String, String, SimpleMessage); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UtilApi.v1UtilEchoPostWithHttpInfo(String, String, SimpleMessage)"})
  void testV1UtilEchoPostWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UtilApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1UtilEchoPostWithHttpInfo("https://example.org/example", null, null));
  }

  /**
   * Test {@link UtilApi#v1UtilObsoletePost(String, String, SimpleMessage)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UtilApi#v1UtilObsoletePost(String, String, SimpleMessage)}
   */
  @Test
  @DisplayName("Test v1UtilObsoletePost(String, String, SimpleMessage); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SimpleMessage UtilApi.v1UtilObsoletePost(String, String, SimpleMessage)"})
  void testV1UtilObsoletePost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UtilApi utilApi = new UtilApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> utilApi.v1UtilObsoletePost(null, "ABC123", new SimpleMessage()));
  }

  /**
   * Test {@link UtilApi#v1UtilObsoletePost(String, String, SimpleMessage)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UtilApi#v1UtilObsoletePost(String, String, SimpleMessage)}
   */
  @Test
  @DisplayName("Test v1UtilObsoletePost(String, String, SimpleMessage); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SimpleMessage UtilApi.v1UtilObsoletePost(String, String, SimpleMessage)"})
  void testV1UtilObsoletePost_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UtilApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1UtilObsoletePost("ABC123", null, null));
  }

  /**
   * Test {@link UtilApi#v1UtilObsoletePostWithHttpInfo(String, String, SimpleMessage)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UtilApi#v1UtilObsoletePostWithHttpInfo(String, String, SimpleMessage)}
   */
  @Test
  @DisplayName("Test v1UtilObsoletePostWithHttpInfo(String, String, SimpleMessage); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UtilApi.v1UtilObsoletePostWithHttpInfo(String, String, SimpleMessage)"})
  void testV1UtilObsoletePostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UtilApi utilApi = new UtilApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> utilApi.v1UtilObsoletePostWithHttpInfo(null, "https://example.org/example", new SimpleMessage()));
  }

  /**
   * Test {@link UtilApi#v1UtilObsoletePostWithHttpInfo(String, String, SimpleMessage)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UtilApi#v1UtilObsoletePostWithHttpInfo(String, String, SimpleMessage)}
   */
  @Test
  @DisplayName("Test v1UtilObsoletePostWithHttpInfo(String, String, SimpleMessage); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UtilApi.v1UtilObsoletePostWithHttpInfo(String, String, SimpleMessage)"})
  void testV1UtilObsoletePostWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UtilApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1UtilObsoletePostWithHttpInfo("https://example.org/example", null, null));
  }
}
