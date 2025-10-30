package com.symphony.bdk.gen.api;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.MessageSearchQuery;
import com.symphony.bdk.gen.api.model.MessageSubmission;
import com.symphony.bdk.gen.api.model.V2MessageSubmission;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import jakarta.ws.rs.client.Client;
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MessagesApiDiffblueTest {
  /**
   * Test {@link MessagesApi#v1MessageIdGet(String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v1MessageIdGet(String, String, String)}
   */
  @Test
  @DisplayName("Test v1MessageIdGet(String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.gen.api.model.V4Message MessagesApi.v1MessageIdGet(String, String, String)"})
  void testV1MessageIdGet_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1MessageIdGet("ABC123", null, null));
  }

  /**
   * Test {@link MessagesApi#v1MessageIdGet(String, String, String)}.
   * <ul>
   *   <li>When {@code 42}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v1MessageIdGet(String, String, String)}
   */
  @Test
  @DisplayName("Test v1MessageIdGet(String, String, String); when '42'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.gen.api.model.V4Message MessagesApi.v1MessageIdGet(String, String, String)"})
  void testV1MessageIdGet_when42_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1MessageIdGet(null, "ABC123", "42"));
  }

  /**
   * Test {@link MessagesApi#v1MessageIdGetWithHttpInfo(String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v1MessageIdGetWithHttpInfo(String, String, String)}
   */
  @Test
  @DisplayName("Test v1MessageIdGetWithHttpInfo(String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse MessagesApi.v1MessageIdGetWithHttpInfo(String, String, String)"})
  void testV1MessageIdGetWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example")))
            .v1MessageIdGetWithHttpInfo(null, "https://example.org/example", "https://example.org/example"));
  }

  /**
   * Test {@link MessagesApi#v1MessageIdGetWithHttpInfo(String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v1MessageIdGetWithHttpInfo(String, String, String)}
   */
  @Test
  @DisplayName("Test v1MessageIdGetWithHttpInfo(String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse MessagesApi.v1MessageIdGetWithHttpInfo(String, String, String)"})
  void testV1MessageIdGetWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1MessageIdGetWithHttpInfo("https://example.org/example", null, null));
  }

  /**
   * Test {@link MessagesApi#v1MessageImportPost(String, String, List)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v1MessageImportPost(String, String, List)}
   */
  @Test
  @DisplayName("Test v1MessageImportPost(String, String, List); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List MessagesApi.v1MessageImportPost(String, String, List)"})
  void testV1MessageImportPost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    MessagesApi messagesApi = new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> messagesApi.v1MessageImportPost(null, "ABC123", new ArrayList<>()));
  }

  /**
   * Test {@link MessagesApi#v1MessageImportPostWithHttpInfo(String, String, List)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v1MessageImportPostWithHttpInfo(String, String, List)}
   */
  @Test
  @DisplayName("Test v1MessageImportPostWithHttpInfo(String, String, List); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse MessagesApi.v1MessageImportPostWithHttpInfo(String, String, List)"})
  void testV1MessageImportPostWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    MessagesApi messagesApi = new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> messagesApi.v1MessageImportPostWithHttpInfo(null, "https://example.org/example", new ArrayList<>()));
  }

  /**
   * Test {@link MessagesApi#v1MessageSearchGet(String, Integer, Integer, String, String, String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v1MessageSearchGet(String, Integer, Integer, String, String, String, String, String)}
   */
  @Test
  @DisplayName("Test v1MessageSearchGet(String, Integer, Integer, String, String, String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "List MessagesApi.v1MessageSearchGet(String, Integer, Integer, String, String, String, String, String)"})
  void testV1MessageSearchGet_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example")))
            .v1MessageSearchGet(null, 1, 1, "Scope", "Sort Dir", "Tier", "ABC123", "ABC123"));
  }

  /**
   * Test {@link MessagesApi#v1MessageSearchGet(String, Integer, Integer, String, String, String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v1MessageSearchGet(String, Integer, Integer, String, String, String, String, String)}
   */
  @Test
  @DisplayName("Test v1MessageSearchGet(String, Integer, Integer, String, String, String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "List MessagesApi.v1MessageSearchGet(String, Integer, Integer, String, String, String, String, String)"})
  void testV1MessageSearchGet_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example")))
            .v1MessageSearchGet("Query", 1, 1, "Scope", "Sort Dir", "Tier", null, "ABC123"));
  }

  /**
   * Test {@link MessagesApi#v1MessageSearchGetWithHttpInfo(String, Integer, Integer, String, String, String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v1MessageSearchGetWithHttpInfo(String, Integer, Integer, String, String, String, String, String)}
   */
  @Test
  @DisplayName("Test v1MessageSearchGetWithHttpInfo(String, Integer, Integer, String, String, String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse MessagesApi.v1MessageSearchGetWithHttpInfo(String, Integer, Integer, String, String, String, String, String)"})
  void testV1MessageSearchGetWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1MessageSearchGetWithHttpInfo(null, 1, 1, "https://example.org/example",
                "https://example.org/example", "https://example.org/example", "https://example.org/example",
                "https://example.org/example"));
  }

  /**
   * Test {@link MessagesApi#v1MessageSearchGetWithHttpInfo(String, Integer, Integer, String, String, String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v1MessageSearchGetWithHttpInfo(String, Integer, Integer, String, String, String, String, String)}
   */
  @Test
  @DisplayName("Test v1MessageSearchGetWithHttpInfo(String, Integer, Integer, String, String, String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse MessagesApi.v1MessageSearchGetWithHttpInfo(String, Integer, Integer, String, String, String, String, String)"})
  void testV1MessageSearchGetWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1MessageSearchGetWithHttpInfo("https://example.org/example", 1, 1,
                "https://example.org/example", "https://example.org/example", "https://example.org/example", null,
                "https://example.org/example"));
  }

  /**
   * Test {@link MessagesApi#v1MessageSearchPost(Integer, Integer, String, String, String, String, String, MessageSearchQuery)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v1MessageSearchPost(Integer, Integer, String, String, String, String, String, MessageSearchQuery)}
   */
  @Test
  @DisplayName("Test v1MessageSearchPost(Integer, Integer, String, String, String, String, String, MessageSearchQuery); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "List MessagesApi.v1MessageSearchPost(Integer, Integer, String, String, String, String, String, MessageSearchQuery)"})
  void testV1MessageSearchPost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    MessagesApi messagesApi = new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> messagesApi.v1MessageSearchPost(1, 1, "Scope", "Sort Dir", "Tier", null,
        "ABC123", new MessageSearchQuery()));
  }

  /**
   * Test {@link MessagesApi#v1MessageSearchPostWithHttpInfo(Integer, Integer, String, String, String, String, String, MessageSearchQuery)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v1MessageSearchPostWithHttpInfo(Integer, Integer, String, String, String, String, String, MessageSearchQuery)}
   */
  @Test
  @DisplayName("Test v1MessageSearchPostWithHttpInfo(Integer, Integer, String, String, String, String, String, MessageSearchQuery); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse MessagesApi.v1MessageSearchPostWithHttpInfo(Integer, Integer, String, String, String, String, String, MessageSearchQuery)"})
  void testV1MessageSearchPostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    MessagesApi messagesApi = new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> messagesApi.v1MessageSearchPostWithHttpInfo(1, 1, "https://example.org/example",
            "https://example.org/example", "https://example.org/example", null, "https://example.org/example",
            new MessageSearchQuery()));
  }

  /**
   * Test {@link MessagesApi#v1StreamSidMessageCreatePost(String, String, String, MessageSubmission)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v1StreamSidMessageCreatePost(String, String, String, MessageSubmission)}
   */
  @Test
  @DisplayName("Test v1StreamSidMessageCreatePost(String, String, String, MessageSubmission); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.Message MessagesApi.v1StreamSidMessageCreatePost(String, String, String, MessageSubmission)"})
  void testV1StreamSidMessageCreatePost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    MessagesApi messagesApi = new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> messagesApi.v1StreamSidMessageCreatePost(null, "ABC123", "ABC123", new MessageSubmission()));
  }

  /**
   * Test {@link MessagesApi#v1StreamSidMessageCreatePost(String, String, String, MessageSubmission)}.
   * <ul>
   *   <li>When {@code Sid}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v1StreamSidMessageCreatePost(String, String, String, MessageSubmission)}
   */
  @Test
  @DisplayName("Test v1StreamSidMessageCreatePost(String, String, String, MessageSubmission); when 'Sid'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.Message MessagesApi.v1StreamSidMessageCreatePost(String, String, String, MessageSubmission)"})
  void testV1StreamSidMessageCreatePost_whenSid_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    MessagesApi messagesApi = new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> messagesApi.v1StreamSidMessageCreatePost("Sid", null, "ABC123", new MessageSubmission()));
  }

  /**
   * Test {@link MessagesApi#v1StreamSidMessageCreatePost(String, String, String, MessageSubmission)}.
   * <ul>
   *   <li>When {@code Sid}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v1StreamSidMessageCreatePost(String, String, String, MessageSubmission)}
   */
  @Test
  @DisplayName("Test v1StreamSidMessageCreatePost(String, String, String, MessageSubmission); when 'Sid'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.Message MessagesApi.v1StreamSidMessageCreatePost(String, String, String, MessageSubmission)"})
  void testV1StreamSidMessageCreatePost_whenSid_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1StreamSidMessageCreatePost("Sid", "ABC123", null, null));
  }

  /**
   * Test {@link MessagesApi#v1StreamSidMessageCreatePostWithHttpInfo(String, String, String, MessageSubmission)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v1StreamSidMessageCreatePostWithHttpInfo(String, String, String, MessageSubmission)}
   */
  @Test
  @DisplayName("Test v1StreamSidMessageCreatePostWithHttpInfo(String, String, String, MessageSubmission); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse MessagesApi.v1StreamSidMessageCreatePostWithHttpInfo(String, String, String, MessageSubmission)"})
  void testV1StreamSidMessageCreatePostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    MessagesApi messagesApi = new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> messagesApi.v1StreamSidMessageCreatePostWithHttpInfo(null,
        "https://example.org/example", "https://example.org/example", new MessageSubmission()));
  }

  /**
   * Test {@link MessagesApi#v1StreamSidMessageCreatePostWithHttpInfo(String, String, String, MessageSubmission)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v1StreamSidMessageCreatePostWithHttpInfo(String, String, String, MessageSubmission)}
   */
  @Test
  @DisplayName("Test v1StreamSidMessageCreatePostWithHttpInfo(String, String, String, MessageSubmission); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse MessagesApi.v1StreamSidMessageCreatePostWithHttpInfo(String, String, String, MessageSubmission)"})
  void testV1StreamSidMessageCreatePostWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    MessagesApi messagesApi = new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> messagesApi.v1StreamSidMessageCreatePostWithHttpInfo("https://example.org/example", null,
            "https://example.org/example", new MessageSubmission()));
  }

  /**
   * Test {@link MessagesApi#v1StreamSidMessageCreatePostWithHttpInfo(String, String, String, MessageSubmission)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v1StreamSidMessageCreatePostWithHttpInfo(String, String, String, MessageSubmission)}
   */
  @Test
  @DisplayName("Test v1StreamSidMessageCreatePostWithHttpInfo(String, String, String, MessageSubmission); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse MessagesApi.v1StreamSidMessageCreatePostWithHttpInfo(String, String, String, MessageSubmission)"})
  void testV1StreamSidMessageCreatePostWithHttpInfo_thenThrowApiException3() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1StreamSidMessageCreatePostWithHttpInfo("https://example.org/example",
                "https://example.org/example", null, null));
  }

  /**
   * Test {@link MessagesApi#v1StreamSidMessageGet(String, Long, Integer, Integer, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v1StreamSidMessageGet(String, Long, Integer, Integer, String, String)}
   */
  @Test
  @DisplayName("Test v1StreamSidMessageGet(String, Long, Integer, Integer, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List MessagesApi.v1StreamSidMessageGet(String, Long, Integer, Integer, String, String)"})
  void testV1StreamSidMessageGet_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1StreamSidMessageGet(null, 1L, 2, 3, "ABC123", "ABC123"));
  }

  /**
   * Test {@link MessagesApi#v1StreamSidMessageGet(String, Long, Integer, Integer, String, String)}.
   * <ul>
   *   <li>When {@code Sid}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v1StreamSidMessageGet(String, Long, Integer, Integer, String, String)}
   */
  @Test
  @DisplayName("Test v1StreamSidMessageGet(String, Long, Integer, Integer, String, String); when 'Sid'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List MessagesApi.v1StreamSidMessageGet(String, Long, Integer, Integer, String, String)"})
  void testV1StreamSidMessageGet_whenSid_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1StreamSidMessageGet("Sid", null, 2, 3, "ABC123", "ABC123"));
  }

  /**
   * Test {@link MessagesApi#v1StreamSidMessageGet(String, Long, Integer, Integer, String, String)}.
   * <ul>
   *   <li>When {@code Sid}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v1StreamSidMessageGet(String, Long, Integer, Integer, String, String)}
   */
  @Test
  @DisplayName("Test v1StreamSidMessageGet(String, Long, Integer, Integer, String, String); when 'Sid'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List MessagesApi.v1StreamSidMessageGet(String, Long, Integer, Integer, String, String)"})
  void testV1StreamSidMessageGet_whenSid_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1StreamSidMessageGet("Sid", 1L, 2, 3, null, "ABC123"));
  }

  /**
   * Test {@link MessagesApi#v1StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v1StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String)}
   */
  @Test
  @DisplayName("Test v1StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse MessagesApi.v1StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String)"})
  void testV1StreamSidMessageGetWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1StreamSidMessageGetWithHttpInfo(null, 1L, 2, 3,
                "https://example.org/example", "https://example.org/example"));
  }

  /**
   * Test {@link MessagesApi#v1StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v1StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String)}
   */
  @Test
  @DisplayName("Test v1StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse MessagesApi.v1StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String)"})
  void testV1StreamSidMessageGetWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1StreamSidMessageGetWithHttpInfo("https://example.org/example", null, 2,
                3, "https://example.org/example", "https://example.org/example"));
  }

  /**
   * Test {@link MessagesApi#v1StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v1StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String)}
   */
  @Test
  @DisplayName("Test v1StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse MessagesApi.v1StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String)"})
  void testV1StreamSidMessageGetWithHttpInfo_thenThrowApiException3() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1StreamSidMessageGetWithHttpInfo("https://example.org/example", 1L, 2, 3,
                null, "https://example.org/example"));
  }

  /**
   * Test {@link MessagesApi#v2MessageImportPost(String, String, List)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v2MessageImportPost(String, String, List)}
   */
  @Test
  @DisplayName("Test v2MessageImportPost(String, String, List); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List MessagesApi.v2MessageImportPost(String, String, List)"})
  void testV2MessageImportPost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    MessagesApi messagesApi = new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> messagesApi.v2MessageImportPost(null, "ABC123", new ArrayList<>()));
  }

  /**
   * Test {@link MessagesApi#v2MessageImportPostWithHttpInfo(String, String, List)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v2MessageImportPostWithHttpInfo(String, String, List)}
   */
  @Test
  @DisplayName("Test v2MessageImportPostWithHttpInfo(String, String, List); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse MessagesApi.v2MessageImportPostWithHttpInfo(String, String, List)"})
  void testV2MessageImportPostWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    MessagesApi messagesApi = new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> messagesApi.v2MessageImportPostWithHttpInfo(null, "https://example.org/example", new ArrayList<>()));
  }

  /**
   * Test {@link MessagesApi#v2StreamSidMessageCreatePost(String, String, String, V2MessageSubmission)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v2StreamSidMessageCreatePost(String, String, String, V2MessageSubmission)}
   */
  @Test
  @DisplayName("Test v2StreamSidMessageCreatePost(String, String, String, V2MessageSubmission); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V2Message MessagesApi.v2StreamSidMessageCreatePost(String, String, String, V2MessageSubmission)"})
  void testV2StreamSidMessageCreatePost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    MessagesApi messagesApi = new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> messagesApi.v2StreamSidMessageCreatePost(null, "ABC123", "ABC123", new V2MessageSubmission()));
  }

  /**
   * Test {@link MessagesApi#v2StreamSidMessageCreatePost(String, String, String, V2MessageSubmission)}.
   * <ul>
   *   <li>When {@code Sid}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v2StreamSidMessageCreatePost(String, String, String, V2MessageSubmission)}
   */
  @Test
  @DisplayName("Test v2StreamSidMessageCreatePost(String, String, String, V2MessageSubmission); when 'Sid'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V2Message MessagesApi.v2StreamSidMessageCreatePost(String, String, String, V2MessageSubmission)"})
  void testV2StreamSidMessageCreatePost_whenSid_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    MessagesApi messagesApi = new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> messagesApi.v2StreamSidMessageCreatePost("Sid", null, "ABC123", new V2MessageSubmission()));
  }

  /**
   * Test {@link MessagesApi#v2StreamSidMessageCreatePost(String, String, String, V2MessageSubmission)}.
   * <ul>
   *   <li>When {@code Sid}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v2StreamSidMessageCreatePost(String, String, String, V2MessageSubmission)}
   */
  @Test
  @DisplayName("Test v2StreamSidMessageCreatePost(String, String, String, V2MessageSubmission); when 'Sid'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V2Message MessagesApi.v2StreamSidMessageCreatePost(String, String, String, V2MessageSubmission)"})
  void testV2StreamSidMessageCreatePost_whenSid_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v2StreamSidMessageCreatePost("Sid", "ABC123", null, null));
  }

  /**
   * Test {@link MessagesApi#v2StreamSidMessageCreatePostWithHttpInfo(String, String, String, V2MessageSubmission)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v2StreamSidMessageCreatePostWithHttpInfo(String, String, String, V2MessageSubmission)}
   */
  @Test
  @DisplayName("Test v2StreamSidMessageCreatePostWithHttpInfo(String, String, String, V2MessageSubmission); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse MessagesApi.v2StreamSidMessageCreatePostWithHttpInfo(String, String, String, V2MessageSubmission)"})
  void testV2StreamSidMessageCreatePostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    MessagesApi messagesApi = new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> messagesApi.v2StreamSidMessageCreatePostWithHttpInfo(null,
        "https://example.org/example", "https://example.org/example", new V2MessageSubmission()));
  }

  /**
   * Test {@link MessagesApi#v2StreamSidMessageCreatePostWithHttpInfo(String, String, String, V2MessageSubmission)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v2StreamSidMessageCreatePostWithHttpInfo(String, String, String, V2MessageSubmission)}
   */
  @Test
  @DisplayName("Test v2StreamSidMessageCreatePostWithHttpInfo(String, String, String, V2MessageSubmission); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse MessagesApi.v2StreamSidMessageCreatePostWithHttpInfo(String, String, String, V2MessageSubmission)"})
  void testV2StreamSidMessageCreatePostWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    MessagesApi messagesApi = new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> messagesApi.v2StreamSidMessageCreatePostWithHttpInfo("https://example.org/example", null,
            "https://example.org/example", new V2MessageSubmission()));
  }

  /**
   * Test {@link MessagesApi#v2StreamSidMessageCreatePostWithHttpInfo(String, String, String, V2MessageSubmission)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v2StreamSidMessageCreatePostWithHttpInfo(String, String, String, V2MessageSubmission)}
   */
  @Test
  @DisplayName("Test v2StreamSidMessageCreatePostWithHttpInfo(String, String, String, V2MessageSubmission); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse MessagesApi.v2StreamSidMessageCreatePostWithHttpInfo(String, String, String, V2MessageSubmission)"})
  void testV2StreamSidMessageCreatePostWithHttpInfo_thenThrowApiException3() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v2StreamSidMessageCreatePostWithHttpInfo("https://example.org/example",
                "https://example.org/example", null, null));
  }

  /**
   * Test {@link MessagesApi#v2StreamSidMessageGet(String, Long, Integer, Integer, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v2StreamSidMessageGet(String, Long, Integer, Integer, String, String)}
   */
  @Test
  @DisplayName("Test v2StreamSidMessageGet(String, Long, Integer, Integer, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List MessagesApi.v2StreamSidMessageGet(String, Long, Integer, Integer, String, String)"})
  void testV2StreamSidMessageGet_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v2StreamSidMessageGet(null, 1L, 2, 1, "ABC123", "ABC123"));
  }

  /**
   * Test {@link MessagesApi#v2StreamSidMessageGet(String, Long, Integer, Integer, String, String)}.
   * <ul>
   *   <li>When {@code Sid}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v2StreamSidMessageGet(String, Long, Integer, Integer, String, String)}
   */
  @Test
  @DisplayName("Test v2StreamSidMessageGet(String, Long, Integer, Integer, String, String); when 'Sid'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List MessagesApi.v2StreamSidMessageGet(String, Long, Integer, Integer, String, String)"})
  void testV2StreamSidMessageGet_whenSid_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v2StreamSidMessageGet("Sid", null, 2, 1, "ABC123", "ABC123"));
  }

  /**
   * Test {@link MessagesApi#v2StreamSidMessageGet(String, Long, Integer, Integer, String, String)}.
   * <ul>
   *   <li>When {@code Sid}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v2StreamSidMessageGet(String, Long, Integer, Integer, String, String)}
   */
  @Test
  @DisplayName("Test v2StreamSidMessageGet(String, Long, Integer, Integer, String, String); when 'Sid'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List MessagesApi.v2StreamSidMessageGet(String, Long, Integer, Integer, String, String)"})
  void testV2StreamSidMessageGet_whenSid_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v2StreamSidMessageGet("Sid", 1L, 2, 1, null, "ABC123"));
  }

  /**
   * Test {@link MessagesApi#v2StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v2StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String)}
   */
  @Test
  @DisplayName("Test v2StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse MessagesApi.v2StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String)"})
  void testV2StreamSidMessageGetWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v2StreamSidMessageGetWithHttpInfo(null, 1L, 2, 1,
                "https://example.org/example", "https://example.org/example"));
  }

  /**
   * Test {@link MessagesApi#v2StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v2StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String)}
   */
  @Test
  @DisplayName("Test v2StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse MessagesApi.v2StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String)"})
  void testV2StreamSidMessageGetWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v2StreamSidMessageGetWithHttpInfo("https://example.org/example", null, 2,
                1, "https://example.org/example", "https://example.org/example"));
  }

  /**
   * Test {@link MessagesApi#v2StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v2StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String)}
   */
  @Test
  @DisplayName("Test v2StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse MessagesApi.v2StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String)"})
  void testV2StreamSidMessageGetWithHttpInfo_thenThrowApiException3() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v2StreamSidMessageGetWithHttpInfo("https://example.org/example", 1L, 2, 1,
                null, "https://example.org/example"));
  }

  /**
   * Test {@link MessagesApi#v3StreamSidMessageCreatePost(String, String, String, V2MessageSubmission)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v3StreamSidMessageCreatePost(String, String, String, V2MessageSubmission)}
   */
  @Test
  @DisplayName("Test v3StreamSidMessageCreatePost(String, String, String, V2MessageSubmission); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V2Message MessagesApi.v3StreamSidMessageCreatePost(String, String, String, V2MessageSubmission)"})
  void testV3StreamSidMessageCreatePost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    MessagesApi messagesApi = new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> messagesApi.v3StreamSidMessageCreatePost(null, "ABC123", "ABC123", new V2MessageSubmission()));
  }

  /**
   * Test {@link MessagesApi#v3StreamSidMessageCreatePost(String, String, String, V2MessageSubmission)}.
   * <ul>
   *   <li>When {@code Sid}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v3StreamSidMessageCreatePost(String, String, String, V2MessageSubmission)}
   */
  @Test
  @DisplayName("Test v3StreamSidMessageCreatePost(String, String, String, V2MessageSubmission); when 'Sid'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V2Message MessagesApi.v3StreamSidMessageCreatePost(String, String, String, V2MessageSubmission)"})
  void testV3StreamSidMessageCreatePost_whenSid_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    MessagesApi messagesApi = new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> messagesApi.v3StreamSidMessageCreatePost("Sid", null, "ABC123", new V2MessageSubmission()));
  }

  /**
   * Test {@link MessagesApi#v3StreamSidMessageCreatePost(String, String, String, V2MessageSubmission)}.
   * <ul>
   *   <li>When {@code Sid}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v3StreamSidMessageCreatePost(String, String, String, V2MessageSubmission)}
   */
  @Test
  @DisplayName("Test v3StreamSidMessageCreatePost(String, String, String, V2MessageSubmission); when 'Sid'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V2Message MessagesApi.v3StreamSidMessageCreatePost(String, String, String, V2MessageSubmission)"})
  void testV3StreamSidMessageCreatePost_whenSid_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v3StreamSidMessageCreatePost("Sid", "ABC123", null, null));
  }

  /**
   * Test {@link MessagesApi#v3StreamSidMessageCreatePostWithHttpInfo(String, String, String, V2MessageSubmission)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v3StreamSidMessageCreatePostWithHttpInfo(String, String, String, V2MessageSubmission)}
   */
  @Test
  @DisplayName("Test v3StreamSidMessageCreatePostWithHttpInfo(String, String, String, V2MessageSubmission); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse MessagesApi.v3StreamSidMessageCreatePostWithHttpInfo(String, String, String, V2MessageSubmission)"})
  void testV3StreamSidMessageCreatePostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    MessagesApi messagesApi = new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> messagesApi.v3StreamSidMessageCreatePostWithHttpInfo(null,
        "https://example.org/example", "https://example.org/example", new V2MessageSubmission()));
  }

  /**
   * Test {@link MessagesApi#v3StreamSidMessageCreatePostWithHttpInfo(String, String, String, V2MessageSubmission)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v3StreamSidMessageCreatePostWithHttpInfo(String, String, String, V2MessageSubmission)}
   */
  @Test
  @DisplayName("Test v3StreamSidMessageCreatePostWithHttpInfo(String, String, String, V2MessageSubmission); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse MessagesApi.v3StreamSidMessageCreatePostWithHttpInfo(String, String, String, V2MessageSubmission)"})
  void testV3StreamSidMessageCreatePostWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    MessagesApi messagesApi = new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> messagesApi.v3StreamSidMessageCreatePostWithHttpInfo("https://example.org/example", null,
            "https://example.org/example", new V2MessageSubmission()));
  }

  /**
   * Test {@link MessagesApi#v3StreamSidMessageCreatePostWithHttpInfo(String, String, String, V2MessageSubmission)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v3StreamSidMessageCreatePostWithHttpInfo(String, String, String, V2MessageSubmission)}
   */
  @Test
  @DisplayName("Test v3StreamSidMessageCreatePostWithHttpInfo(String, String, String, V2MessageSubmission); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse MessagesApi.v3StreamSidMessageCreatePostWithHttpInfo(String, String, String, V2MessageSubmission)"})
  void testV3StreamSidMessageCreatePostWithHttpInfo_thenThrowApiException3() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v3StreamSidMessageCreatePostWithHttpInfo("https://example.org/example",
                "https://example.org/example", null, null));
  }

  /**
   * Test {@link MessagesApi#v4MessageBlastPost(String, String, List, String, String, String, File, File)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v4MessageBlastPost(String, String, List, String, String, String, File, File)}
   */
  @Test
  @DisplayName("Test v4MessageBlastPost(String, String, List, String, String, String, File, File); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V4MessageBlastResponse MessagesApi.v4MessageBlastPost(String, String, List, String, String, String, File, File)"})
  void testV4MessageBlastPost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    MessagesApi messagesApi = new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));
    ArrayList<String> sids = new ArrayList<>();
    File attachment = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile();

    // Act and Assert
    assertThrows(ApiException.class,
        () -> messagesApi.v4MessageBlastPost(null, "ABC123", sids, "Not all who wander are lost", "Data", "1.0.2",
            attachment, Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile()));
  }

  /**
   * Test {@link MessagesApi#v4MessageBlastPostWithHttpInfo(String, String, List, String, String, String, File, File)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v4MessageBlastPostWithHttpInfo(String, String, List, String, String, String, File, File)}
   */
  @Test
  @DisplayName("Test v4MessageBlastPostWithHttpInfo(String, String, List, String, String, String, File, File); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse MessagesApi.v4MessageBlastPostWithHttpInfo(String, String, List, String, String, String, File, File)"})
  void testV4MessageBlastPostWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    MessagesApi messagesApi = new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));
    ArrayList<String> sids = new ArrayList<>();
    File attachment = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile();

    // Act and Assert
    assertThrows(ApiException.class,
        () -> messagesApi.v4MessageBlastPostWithHttpInfo(null, "https://example.org/example", sids,
            "https://example.org/example", "https://example.org/example", "https://example.org/example", attachment,
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile()));
  }

  /**
   * Test {@link MessagesApi#v4MessageImportPost(String, String, List)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v4MessageImportPost(String, String, List)}
   */
  @Test
  @DisplayName("Test v4MessageImportPost(String, String, List); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List MessagesApi.v4MessageImportPost(String, String, List)"})
  void testV4MessageImportPost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class, () -> (new MessagesApi(null)).v4MessageImportPost(null, null, null));
  }

  /**
   * Test {@link MessagesApi#v4MessageImportPost(String, String, List)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v4MessageImportPost(String, String, List)}
   */
  @Test
  @DisplayName("Test v4MessageImportPost(String, String, List); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List MessagesApi.v4MessageImportPost(String, String, List)"})
  void testV4MessageImportPost_whenNull_thenThrowApiException2() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class, () -> (new MessagesApi(null)).v4MessageImportPost("ABC123", null, null));
  }

  /**
   * Test {@link MessagesApi#v4MessageImportPostWithHttpInfo(String, String, List)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v4MessageImportPostWithHttpInfo(String, String, List)}
   */
  @Test
  @DisplayName("Test v4MessageImportPostWithHttpInfo(String, String, List); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse MessagesApi.v4MessageImportPostWithHttpInfo(String, String, List)"})
  void testV4MessageImportPostWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class, () -> (new MessagesApi(null)).v4MessageImportPostWithHttpInfo(null, null, null));
  }

  /**
   * Test {@link MessagesApi#v4MessageImportPostWithHttpInfo(String, String, List)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v4MessageImportPostWithHttpInfo(String, String, List)}
   */
  @Test
  @DisplayName("Test v4MessageImportPostWithHttpInfo(String, String, List); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse MessagesApi.v4MessageImportPostWithHttpInfo(String, String, List)"})
  void testV4MessageImportPostWithHttpInfo_whenNull_thenThrowApiException2() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class,
        () -> (new MessagesApi(null)).v4MessageImportPostWithHttpInfo("https://example.org/example", null, null));
  }

  /**
   * Test {@link MessagesApi#v4StreamSidMessageCreatePost(String, String, String, String, String, String, File, File)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v4StreamSidMessageCreatePost(String, String, String, String, String, String, File, File)}
   */
  @Test
  @DisplayName("Test v4StreamSidMessageCreatePost(String, String, String, String, String, String, File, File); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V4Message MessagesApi.v4StreamSidMessageCreatePost(String, String, String, String, String, String, File, File)"})
  void testV4StreamSidMessageCreatePost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    MessagesApi messagesApi = new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));
    File attachment = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile();

    // Act and Assert
    assertThrows(ApiException.class,
        () -> messagesApi.v4StreamSidMessageCreatePost(null, "ABC123", "ABC123", "Not all who wander are lost", "Data",
            "1.0.2", attachment, Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile()));
  }

  /**
   * Test {@link MessagesApi#v4StreamSidMessageCreatePost(String, String, String, String, String, String, File, File)}.
   * <ul>
   *   <li>When {@code Sid}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v4StreamSidMessageCreatePost(String, String, String, String, String, String, File, File)}
   */
  @Test
  @DisplayName("Test v4StreamSidMessageCreatePost(String, String, String, String, String, String, File, File); when 'Sid'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V4Message MessagesApi.v4StreamSidMessageCreatePost(String, String, String, String, String, String, File, File)"})
  void testV4StreamSidMessageCreatePost_whenSid_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    MessagesApi messagesApi = new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));
    File attachment = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile();

    // Act and Assert
    assertThrows(ApiException.class,
        () -> messagesApi.v4StreamSidMessageCreatePost("Sid", null, "ABC123", "Not all who wander are lost", "Data",
            "1.0.2", attachment, Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile()));
  }

  /**
   * Test {@link MessagesApi#v4StreamSidMessageCreatePostWithHttpInfo(String, String, String, String, String, String, File, File)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v4StreamSidMessageCreatePostWithHttpInfo(String, String, String, String, String, String, File, File)}
   */
  @Test
  @DisplayName("Test v4StreamSidMessageCreatePostWithHttpInfo(String, String, String, String, String, String, File, File); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse MessagesApi.v4StreamSidMessageCreatePostWithHttpInfo(String, String, String, String, String, String, File, File)"})
  void testV4StreamSidMessageCreatePostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    MessagesApi messagesApi = new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));
    File attachment = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile();

    // Act and Assert
    assertThrows(ApiException.class,
        () -> messagesApi.v4StreamSidMessageCreatePostWithHttpInfo(null, "https://example.org/example",
            "https://example.org/example", "https://example.org/example", "https://example.org/example",
            "https://example.org/example", attachment,
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile()));
  }

  /**
   * Test {@link MessagesApi#v4StreamSidMessageCreatePostWithHttpInfo(String, String, String, String, String, String, File, File)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v4StreamSidMessageCreatePostWithHttpInfo(String, String, String, String, String, String, File, File)}
   */
  @Test
  @DisplayName("Test v4StreamSidMessageCreatePostWithHttpInfo(String, String, String, String, String, String, File, File); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse MessagesApi.v4StreamSidMessageCreatePostWithHttpInfo(String, String, String, String, String, String, File, File)"})
  void testV4StreamSidMessageCreatePostWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    MessagesApi messagesApi = new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));
    File attachment = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile();

    // Act and Assert
    assertThrows(ApiException.class,
        () -> messagesApi.v4StreamSidMessageCreatePostWithHttpInfo("https://example.org/example", null,
            "https://example.org/example", "https://example.org/example", "https://example.org/example",
            "https://example.org/example", attachment,
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile()));
  }

  /**
   * Test {@link MessagesApi#v4StreamSidMessageGet(String, Long, Integer, Integer, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v4StreamSidMessageGet(String, Long, Integer, Integer, String, String)}
   */
  @Test
  @DisplayName("Test v4StreamSidMessageGet(String, Long, Integer, Integer, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List MessagesApi.v4StreamSidMessageGet(String, Long, Integer, Integer, String, String)"})
  void testV4StreamSidMessageGet_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v4StreamSidMessageGet(null, 1L, 1, 1, "ABC123", "ABC123"));
  }

  /**
   * Test {@link MessagesApi#v4StreamSidMessageGet(String, Long, Integer, Integer, String, String)}.
   * <ul>
   *   <li>When {@code Sid}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v4StreamSidMessageGet(String, Long, Integer, Integer, String, String)}
   */
  @Test
  @DisplayName("Test v4StreamSidMessageGet(String, Long, Integer, Integer, String, String); when 'Sid'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List MessagesApi.v4StreamSidMessageGet(String, Long, Integer, Integer, String, String)"})
  void testV4StreamSidMessageGet_whenSid_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v4StreamSidMessageGet("Sid", null, 1, 1, "ABC123", "ABC123"));
  }

  /**
   * Test {@link MessagesApi#v4StreamSidMessageGet(String, Long, Integer, Integer, String, String)}.
   * <ul>
   *   <li>When {@code Sid}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v4StreamSidMessageGet(String, Long, Integer, Integer, String, String)}
   */
  @Test
  @DisplayName("Test v4StreamSidMessageGet(String, Long, Integer, Integer, String, String); when 'Sid'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List MessagesApi.v4StreamSidMessageGet(String, Long, Integer, Integer, String, String)"})
  void testV4StreamSidMessageGet_whenSid_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v4StreamSidMessageGet("Sid", 1L, 1, 1, null, "ABC123"));
  }

  /**
   * Test {@link MessagesApi#v4StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v4StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String)}
   */
  @Test
  @DisplayName("Test v4StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse MessagesApi.v4StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String)"})
  void testV4StreamSidMessageGetWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v4StreamSidMessageGetWithHttpInfo(null, 1L, 1, 1,
                "https://example.org/example", "https://example.org/example"));
  }

  /**
   * Test {@link MessagesApi#v4StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v4StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String)}
   */
  @Test
  @DisplayName("Test v4StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse MessagesApi.v4StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String)"})
  void testV4StreamSidMessageGetWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v4StreamSidMessageGetWithHttpInfo("https://example.org/example", null, 1,
                1, "https://example.org/example", "https://example.org/example"));
  }

  /**
   * Test {@link MessagesApi#v4StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v4StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String)}
   */
  @Test
  @DisplayName("Test v4StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse MessagesApi.v4StreamSidMessageGetWithHttpInfo(String, Long, Integer, Integer, String, String)"})
  void testV4StreamSidMessageGetWithHttpInfo_thenThrowApiException3() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v4StreamSidMessageGetWithHttpInfo("https://example.org/example", 1L, 1, 1,
                null, "https://example.org/example"));
  }

  /**
   * Test {@link MessagesApi#v4StreamSidMessageMidUpdatePost(String, String, String, String, String, String, String, File, File, String)}.
   * <ul>
   *   <li>When {@code Mid}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v4StreamSidMessageMidUpdatePost(String, String, String, String, String, String, String, File, File, String)}
   */
  @Test
  @DisplayName("Test v4StreamSidMessageMidUpdatePost(String, String, String, String, String, String, String, File, File, String); when 'Mid'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V4Message MessagesApi.v4StreamSidMessageMidUpdatePost(String, String, String, String, String, String, String, File, File, String)"})
  void testV4StreamSidMessageMidUpdatePost_whenMid_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    MessagesApi messagesApi = new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));
    File attachment = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile();

    // Act and Assert
    assertThrows(ApiException.class,
        () -> messagesApi.v4StreamSidMessageMidUpdatePost(null, "Mid", "ABC123", "ABC123",
            "Not all who wander are lost", "Data", "1.0.2", attachment,
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), "Silent"));
  }

  /**
   * Test {@link MessagesApi#v4StreamSidMessageMidUpdatePost(String, String, String, String, String, String, String, File, File, String)}.
   * <ul>
   *   <li>When {@code Sid}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v4StreamSidMessageMidUpdatePost(String, String, String, String, String, String, String, File, File, String)}
   */
  @Test
  @DisplayName("Test v4StreamSidMessageMidUpdatePost(String, String, String, String, String, String, String, File, File, String); when 'Sid'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V4Message MessagesApi.v4StreamSidMessageMidUpdatePost(String, String, String, String, String, String, String, File, File, String)"})
  void testV4StreamSidMessageMidUpdatePost_whenSid_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    MessagesApi messagesApi = new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));
    File attachment = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile();

    // Act and Assert
    assertThrows(ApiException.class,
        () -> messagesApi.v4StreamSidMessageMidUpdatePost("Sid", null, "ABC123", "ABC123",
            "Not all who wander are lost", "Data", "1.0.2", attachment,
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), "Silent"));
  }

  /**
   * Test {@link MessagesApi#v4StreamSidMessageMidUpdatePost(String, String, String, String, String, String, String, File, File, String)}.
   * <ul>
   *   <li>When {@code Sid}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v4StreamSidMessageMidUpdatePost(String, String, String, String, String, String, String, File, File, String)}
   */
  @Test
  @DisplayName("Test v4StreamSidMessageMidUpdatePost(String, String, String, String, String, String, String, File, File, String); when 'Sid'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V4Message MessagesApi.v4StreamSidMessageMidUpdatePost(String, String, String, String, String, String, String, File, File, String)"})
  void testV4StreamSidMessageMidUpdatePost_whenSid_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    MessagesApi messagesApi = new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));
    File attachment = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile();

    // Act and Assert
    assertThrows(ApiException.class,
        () -> messagesApi.v4StreamSidMessageMidUpdatePost("Sid", "Mid", null, "ABC123", "Not all who wander are lost",
            "Data", "1.0.2", attachment, Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(),
            "Silent"));
  }

  /**
   * Test {@link MessagesApi#v4StreamSidMessageMidUpdatePostWithHttpInfo(String, String, String, String, String, String, String, File, File, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v4StreamSidMessageMidUpdatePostWithHttpInfo(String, String, String, String, String, String, String, File, File, String)}
   */
  @Test
  @DisplayName("Test v4StreamSidMessageMidUpdatePostWithHttpInfo(String, String, String, String, String, String, String, File, File, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse MessagesApi.v4StreamSidMessageMidUpdatePostWithHttpInfo(String, String, String, String, String, String, String, File, File, String)"})
  void testV4StreamSidMessageMidUpdatePostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    MessagesApi messagesApi = new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));
    File attachment = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile();

    // Act and Assert
    assertThrows(ApiException.class,
        () -> messagesApi.v4StreamSidMessageMidUpdatePostWithHttpInfo(null, "https://example.org/example",
            "https://example.org/example", "https://example.org/example", "https://example.org/example",
            "https://example.org/example", "https://example.org/example", attachment,
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), "https://example.org/example"));
  }

  /**
   * Test {@link MessagesApi#v4StreamSidMessageMidUpdatePostWithHttpInfo(String, String, String, String, String, String, String, File, File, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v4StreamSidMessageMidUpdatePostWithHttpInfo(String, String, String, String, String, String, String, File, File, String)}
   */
  @Test
  @DisplayName("Test v4StreamSidMessageMidUpdatePostWithHttpInfo(String, String, String, String, String, String, String, File, File, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse MessagesApi.v4StreamSidMessageMidUpdatePostWithHttpInfo(String, String, String, String, String, String, String, File, File, String)"})
  void testV4StreamSidMessageMidUpdatePostWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    MessagesApi messagesApi = new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));
    File attachment = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile();

    // Act and Assert
    assertThrows(ApiException.class,
        () -> messagesApi.v4StreamSidMessageMidUpdatePostWithHttpInfo("https://example.org/example", null,
            "https://example.org/example", "https://example.org/example", "https://example.org/example",
            "https://example.org/example", "https://example.org/example", attachment,
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), "https://example.org/example"));
  }

  /**
   * Test {@link MessagesApi#v4StreamSidMessageMidUpdatePostWithHttpInfo(String, String, String, String, String, String, String, File, File, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessagesApi#v4StreamSidMessageMidUpdatePostWithHttpInfo(String, String, String, String, String, String, String, File, File, String)}
   */
  @Test
  @DisplayName("Test v4StreamSidMessageMidUpdatePostWithHttpInfo(String, String, String, String, String, String, String, File, File, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse MessagesApi.v4StreamSidMessageMidUpdatePostWithHttpInfo(String, String, String, String, String, String, String, File, File, String)"})
  void testV4StreamSidMessageMidUpdatePostWithHttpInfo_thenThrowApiException3() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    MessagesApi messagesApi = new MessagesApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));
    File attachment = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile();

    // Act and Assert
    assertThrows(ApiException.class,
        () -> messagesApi.v4StreamSidMessageMidUpdatePostWithHttpInfo("https://example.org/example",
            "https://example.org/example", null, "https://example.org/example", "https://example.org/example",
            "https://example.org/example", "https://example.org/example", attachment,
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), "https://example.org/example"));
  }
}
