package com.symphony.bdk.gen.api;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import jakarta.ws.rs.client.Client;
import java.io.File;
import java.nio.file.Paths;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AttachmentsApiDiffblueTest {
  /**
   * Test {@link AttachmentsApi#v1StreamSidAttachmentCreatePost(String, String, String, File)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AttachmentsApi#v1StreamSidAttachmentCreatePost(String, String, String, File)}
   */
  @Test
  @DisplayName("Test v1StreamSidAttachmentCreatePost(String, String, String, File); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.AttachmentInfo AttachmentsApi.v1StreamSidAttachmentCreatePost(String, String, String, File)"})
  void testV1StreamSidAttachmentCreatePost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    AttachmentsApi attachmentsApi = new AttachmentsApi(new ApiClientJersey2(mock(Client.class),
        "https://example.org/example", defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> attachmentsApi.v1StreamSidAttachmentCreatePost(null, "ABC123", "ABC123",
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile()));
  }

  /**
   * Test {@link AttachmentsApi#v1StreamSidAttachmentCreatePost(String, String, String, File)}.
   * <ul>
   *   <li>When {@code Sid}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AttachmentsApi#v1StreamSidAttachmentCreatePost(String, String, String, File)}
   */
  @Test
  @DisplayName("Test v1StreamSidAttachmentCreatePost(String, String, String, File); when 'Sid'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.AttachmentInfo AttachmentsApi.v1StreamSidAttachmentCreatePost(String, String, String, File)"})
  void testV1StreamSidAttachmentCreatePost_whenSid_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    AttachmentsApi attachmentsApi = new AttachmentsApi(new ApiClientJersey2(mock(Client.class),
        "https://example.org/example", defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> attachmentsApi.v1StreamSidAttachmentCreatePost("Sid", null, "ABC123",
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile()));
  }

  /**
   * Test {@link AttachmentsApi#v1StreamSidAttachmentCreatePostWithHttpInfo(String, String, String, File)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AttachmentsApi#v1StreamSidAttachmentCreatePostWithHttpInfo(String, String, String, File)}
   */
  @Test
  @DisplayName("Test v1StreamSidAttachmentCreatePostWithHttpInfo(String, String, String, File); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse AttachmentsApi.v1StreamSidAttachmentCreatePostWithHttpInfo(String, String, String, File)"})
  void testV1StreamSidAttachmentCreatePostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    AttachmentsApi attachmentsApi = new AttachmentsApi(new ApiClientJersey2(mock(Client.class),
        "https://example.org/example", defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> attachmentsApi.v1StreamSidAttachmentCreatePostWithHttpInfo(null, "https://example.org/example",
            "https://example.org/example", Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile()));
  }

  /**
   * Test {@link AttachmentsApi#v1StreamSidAttachmentCreatePostWithHttpInfo(String, String, String, File)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AttachmentsApi#v1StreamSidAttachmentCreatePostWithHttpInfo(String, String, String, File)}
   */
  @Test
  @DisplayName("Test v1StreamSidAttachmentCreatePostWithHttpInfo(String, String, String, File); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse AttachmentsApi.v1StreamSidAttachmentCreatePostWithHttpInfo(String, String, String, File)"})
  void testV1StreamSidAttachmentCreatePostWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    AttachmentsApi attachmentsApi = new AttachmentsApi(new ApiClientJersey2(mock(Client.class),
        "https://example.org/example", defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> attachmentsApi.v1StreamSidAttachmentCreatePostWithHttpInfo("https://example.org/example", null,
            "https://example.org/example", Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile()));
  }

  /**
   * Test {@link AttachmentsApi#v1StreamSidAttachmentGet(String, String, String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AttachmentsApi#v1StreamSidAttachmentGet(String, String, String, String, String)}
   */
  @Test
  @DisplayName("Test v1StreamSidAttachmentGet(String, String, String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"byte[] AttachmentsApi.v1StreamSidAttachmentGet(String, String, String, String, String)"})
  void testV1StreamSidAttachmentGet_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new AttachmentsApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
            defaultHeaders, "https://example.org/example")))
            .v1StreamSidAttachmentGet(null, "42", "42", "ABC123", "ABC123"));
  }

  /**
   * Test {@link AttachmentsApi#v1StreamSidAttachmentGet(String, String, String, String, String)}.
   * <ul>
   *   <li>When {@code Sid}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AttachmentsApi#v1StreamSidAttachmentGet(String, String, String, String, String)}
   */
  @Test
  @DisplayName("Test v1StreamSidAttachmentGet(String, String, String, String, String); when 'Sid'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"byte[] AttachmentsApi.v1StreamSidAttachmentGet(String, String, String, String, String)"})
  void testV1StreamSidAttachmentGet_whenSid_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new AttachmentsApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
            defaultHeaders, "https://example.org/example")))
            .v1StreamSidAttachmentGet("Sid", null, "42", "ABC123", "ABC123"));
  }

  /**
   * Test {@link AttachmentsApi#v1StreamSidAttachmentGet(String, String, String, String, String)}.
   * <ul>
   *   <li>When {@code Sid}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AttachmentsApi#v1StreamSidAttachmentGet(String, String, String, String, String)}
   */
  @Test
  @DisplayName("Test v1StreamSidAttachmentGet(String, String, String, String, String); when 'Sid'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"byte[] AttachmentsApi.v1StreamSidAttachmentGet(String, String, String, String, String)"})
  void testV1StreamSidAttachmentGet_whenSid_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new AttachmentsApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
            defaultHeaders, "https://example.org/example")))
            .v1StreamSidAttachmentGet("Sid", "42", null, "ABC123", "ABC123"));
  }

  /**
   * Test {@link AttachmentsApi#v1StreamSidAttachmentGet(String, String, String, String, String)}.
   * <ul>
   *   <li>When {@code Sid}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AttachmentsApi#v1StreamSidAttachmentGet(String, String, String, String, String)}
   */
  @Test
  @DisplayName("Test v1StreamSidAttachmentGet(String, String, String, String, String); when 'Sid'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"byte[] AttachmentsApi.v1StreamSidAttachmentGet(String, String, String, String, String)"})
  void testV1StreamSidAttachmentGet_whenSid_thenThrowApiException3() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new AttachmentsApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
            defaultHeaders, "https://example.org/example")))
            .v1StreamSidAttachmentGet("Sid", "42", "42", null, "ABC123"));
  }

  /**
   * Test {@link AttachmentsApi#v1StreamSidAttachmentGetWithHttpInfo(String, String, String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AttachmentsApi#v1StreamSidAttachmentGetWithHttpInfo(String, String, String, String, String)}
   */
  @Test
  @DisplayName("Test v1StreamSidAttachmentGetWithHttpInfo(String, String, String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse AttachmentsApi.v1StreamSidAttachmentGetWithHttpInfo(String, String, String, String, String)"})
  void testV1StreamSidAttachmentGetWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new AttachmentsApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
            defaultHeaders, "https://example.org/example"))).v1StreamSidAttachmentGetWithHttpInfo(null,
                "https://example.org/example", "https://example.org/example", "https://example.org/example",
                "https://example.org/example"));
  }

  /**
   * Test {@link AttachmentsApi#v1StreamSidAttachmentGetWithHttpInfo(String, String, String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AttachmentsApi#v1StreamSidAttachmentGetWithHttpInfo(String, String, String, String, String)}
   */
  @Test
  @DisplayName("Test v1StreamSidAttachmentGetWithHttpInfo(String, String, String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse AttachmentsApi.v1StreamSidAttachmentGetWithHttpInfo(String, String, String, String, String)"})
  void testV1StreamSidAttachmentGetWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new AttachmentsApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
            defaultHeaders, "https://example.org/example")))
            .v1StreamSidAttachmentGetWithHttpInfo("https://example.org/example", null, "https://example.org/example",
                "https://example.org/example", "https://example.org/example"));
  }

  /**
   * Test {@link AttachmentsApi#v1StreamSidAttachmentGetWithHttpInfo(String, String, String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AttachmentsApi#v1StreamSidAttachmentGetWithHttpInfo(String, String, String, String, String)}
   */
  @Test
  @DisplayName("Test v1StreamSidAttachmentGetWithHttpInfo(String, String, String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse AttachmentsApi.v1StreamSidAttachmentGetWithHttpInfo(String, String, String, String, String)"})
  void testV1StreamSidAttachmentGetWithHttpInfo_thenThrowApiException3() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new AttachmentsApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
            defaultHeaders, "https://example.org/example")))
            .v1StreamSidAttachmentGetWithHttpInfo("https://example.org/example", "https://example.org/example", null,
                "https://example.org/example", "https://example.org/example"));
  }

  /**
   * Test {@link AttachmentsApi#v1StreamSidAttachmentGetWithHttpInfo(String, String, String, String, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AttachmentsApi#v1StreamSidAttachmentGetWithHttpInfo(String, String, String, String, String)}
   */
  @Test
  @DisplayName("Test v1StreamSidAttachmentGetWithHttpInfo(String, String, String, String, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse AttachmentsApi.v1StreamSidAttachmentGetWithHttpInfo(String, String, String, String, String)"})
  void testV1StreamSidAttachmentGetWithHttpInfo_thenThrowApiException4() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new AttachmentsApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
            defaultHeaders, "https://example.org/example")))
            .v1StreamSidAttachmentGetWithHttpInfo("https://example.org/example", "https://example.org/example",
                "https://example.org/example", null, "https://example.org/example"));
  }

  /**
   * Test {@link AttachmentsApi#v3StreamSidAttachmentCreatePost(String, String, String, File)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AttachmentsApi#v3StreamSidAttachmentCreatePost(String, String, String, File)}
   */
  @Test
  @DisplayName("Test v3StreamSidAttachmentCreatePost(String, String, String, File); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.AttachmentInfo AttachmentsApi.v3StreamSidAttachmentCreatePost(String, String, String, File)"})
  void testV3StreamSidAttachmentCreatePost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    AttachmentsApi attachmentsApi = new AttachmentsApi(new ApiClientJersey2(mock(Client.class),
        "https://example.org/example", defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> attachmentsApi.v3StreamSidAttachmentCreatePost(null, "ABC123", "ABC123",
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile()));
  }

  /**
   * Test {@link AttachmentsApi#v3StreamSidAttachmentCreatePost(String, String, String, File)}.
   * <ul>
   *   <li>When {@code Sid}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AttachmentsApi#v3StreamSidAttachmentCreatePost(String, String, String, File)}
   */
  @Test
  @DisplayName("Test v3StreamSidAttachmentCreatePost(String, String, String, File); when 'Sid'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.AttachmentInfo AttachmentsApi.v3StreamSidAttachmentCreatePost(String, String, String, File)"})
  void testV3StreamSidAttachmentCreatePost_whenSid_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    AttachmentsApi attachmentsApi = new AttachmentsApi(new ApiClientJersey2(mock(Client.class),
        "https://example.org/example", defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> attachmentsApi.v3StreamSidAttachmentCreatePost("Sid", null, "ABC123",
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile()));
  }

  /**
   * Test {@link AttachmentsApi#v3StreamSidAttachmentCreatePostWithHttpInfo(String, String, String, File)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AttachmentsApi#v3StreamSidAttachmentCreatePostWithHttpInfo(String, String, String, File)}
   */
  @Test
  @DisplayName("Test v3StreamSidAttachmentCreatePostWithHttpInfo(String, String, String, File); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse AttachmentsApi.v3StreamSidAttachmentCreatePostWithHttpInfo(String, String, String, File)"})
  void testV3StreamSidAttachmentCreatePostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    AttachmentsApi attachmentsApi = new AttachmentsApi(new ApiClientJersey2(mock(Client.class),
        "https://example.org/example", defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> attachmentsApi.v3StreamSidAttachmentCreatePostWithHttpInfo(null, "https://example.org/example",
            "https://example.org/example", Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile()));
  }

  /**
   * Test {@link AttachmentsApi#v3StreamSidAttachmentCreatePostWithHttpInfo(String, String, String, File)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AttachmentsApi#v3StreamSidAttachmentCreatePostWithHttpInfo(String, String, String, File)}
   */
  @Test
  @DisplayName("Test v3StreamSidAttachmentCreatePostWithHttpInfo(String, String, String, File); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse AttachmentsApi.v3StreamSidAttachmentCreatePostWithHttpInfo(String, String, String, File)"})
  void testV3StreamSidAttachmentCreatePostWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    AttachmentsApi attachmentsApi = new AttachmentsApi(new ApiClientJersey2(mock(Client.class),
        "https://example.org/example", defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> attachmentsApi.v3StreamSidAttachmentCreatePostWithHttpInfo("https://example.org/example", null,
            "https://example.org/example", Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile()));
  }
}
