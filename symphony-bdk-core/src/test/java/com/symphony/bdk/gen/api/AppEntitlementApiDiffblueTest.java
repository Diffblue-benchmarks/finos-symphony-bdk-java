package com.symphony.bdk.gen.api;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import jakarta.ws.rs.client.Client;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AppEntitlementApiDiffblueTest {
  /**
   * Test {@link AppEntitlementApi#v1AdminAppEntitlementListGet(String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link AppEntitlementApi#v1AdminAppEntitlementListGet(String)}
   */
  @Test
  @DisplayName("Test v1AdminAppEntitlementListGet(String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List AppEntitlementApi.v1AdminAppEntitlementListGet(String)"})
  void testV1AdminAppEntitlementListGet_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new AppEntitlementApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminAppEntitlementListGet(null));
  }

  /**
   * Test {@link AppEntitlementApi#v1AdminAppEntitlementListGetWithHttpInfo(String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * AppEntitlementApi#v1AdminAppEntitlementListGetWithHttpInfo(String)}
   */
  @Test
  @DisplayName("Test v1AdminAppEntitlementListGetWithHttpInfo(String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse AppEntitlementApi.v1AdminAppEntitlementListGetWithHttpInfo(String)"
  })
  void testV1AdminAppEntitlementListGetWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new AppEntitlementApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminAppEntitlementListGetWithHttpInfo(null));
  }

  /**
   * Test {@link AppEntitlementApi#v1AdminAppEntitlementListPost(String, List)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link AppEntitlementApi#v1AdminAppEntitlementListPost(String, List)}
   */
  @Test
  @DisplayName("Test v1AdminAppEntitlementListPost(String, List); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List AppEntitlementApi.v1AdminAppEntitlementListPost(String, List)"})
  void testV1AdminAppEntitlementListPost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    AppEntitlementApi appEntitlementApi =
        new AppEntitlementApi(
            new ApiClientJersey2(
                mock(Client.class),
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"));

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> appEntitlementApi.v1AdminAppEntitlementListPost(null, new ArrayList<>()));
  }

  /**
   * Test {@link AppEntitlementApi#v1AdminAppEntitlementListPost(String, List)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link AppEntitlementApi#v1AdminAppEntitlementListPost(String, List)}
   */
  @Test
  @DisplayName(
      "Test v1AdminAppEntitlementListPost(String, List); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List AppEntitlementApi.v1AdminAppEntitlementListPost(String, List)"})
  void testV1AdminAppEntitlementListPost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(
        ApiException.class,
        () -> new AppEntitlementApi(null).v1AdminAppEntitlementListPost("ABC123", null));
  }

  /**
   * Test {@link AppEntitlementApi#v1AdminAppEntitlementListPostWithHttpInfo(String, List)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * AppEntitlementApi#v1AdminAppEntitlementListPostWithHttpInfo(String, List)}
   */
  @Test
  @DisplayName(
      "Test v1AdminAppEntitlementListPostWithHttpInfo(String, List); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse AppEntitlementApi.v1AdminAppEntitlementListPostWithHttpInfo(String, List)"
  })
  void testV1AdminAppEntitlementListPostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    AppEntitlementApi appEntitlementApi =
        new AppEntitlementApi(
            new ApiClientJersey2(
                mock(Client.class),
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"));

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> appEntitlementApi.v1AdminAppEntitlementListPostWithHttpInfo(null, new ArrayList<>()));
  }

  /**
   * Test {@link AppEntitlementApi#v1AdminAppEntitlementListPostWithHttpInfo(String, List)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * AppEntitlementApi#v1AdminAppEntitlementListPostWithHttpInfo(String, List)}
   */
  @Test
  @DisplayName(
      "Test v1AdminAppEntitlementListPostWithHttpInfo(String, List); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse AppEntitlementApi.v1AdminAppEntitlementListPostWithHttpInfo(String, List)"
  })
  void testV1AdminAppEntitlementListPostWithHttpInfo_whenNull_thenThrowApiException()
      throws ApiException {
    // Arrange, Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new AppEntitlementApi(null)
                .v1AdminAppEntitlementListPostWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link AppEntitlementApi#v1AdminUserUidAppEntitlementListGet(String, Long)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link AppEntitlementApi#v1AdminUserUidAppEntitlementListGet(String,
   * Long)}
   */
  @Test
  @DisplayName(
      "Test v1AdminUserUidAppEntitlementListGet(String, Long); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List AppEntitlementApi.v1AdminUserUidAppEntitlementListGet(String, Long)"})
  void testV1AdminUserUidAppEntitlementListGet_whenNull_thenThrowApiException()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new AppEntitlementApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminUserUidAppEntitlementListGet(null, 1L));
  }

  /**
   * Test {@link AppEntitlementApi#v1AdminUserUidAppEntitlementListGet(String, Long)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link AppEntitlementApi#v1AdminUserUidAppEntitlementListGet(String,
   * Long)}
   */
  @Test
  @DisplayName(
      "Test v1AdminUserUidAppEntitlementListGet(String, Long); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List AppEntitlementApi.v1AdminUserUidAppEntitlementListGet(String, Long)"})
  void testV1AdminUserUidAppEntitlementListGet_whenNull_thenThrowApiException2()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new AppEntitlementApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminUserUidAppEntitlementListGet("ABC123", null));
  }

  /**
   * Test {@link AppEntitlementApi#v1AdminUserUidAppEntitlementListGetWithHttpInfo(String, Long)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * AppEntitlementApi#v1AdminUserUidAppEntitlementListGetWithHttpInfo(String, Long)}
   */
  @Test
  @DisplayName(
      "Test v1AdminUserUidAppEntitlementListGetWithHttpInfo(String, Long); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse AppEntitlementApi.v1AdminUserUidAppEntitlementListGetWithHttpInfo(String, Long)"
  })
  void testV1AdminUserUidAppEntitlementListGetWithHttpInfo_thenThrowApiException()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new AppEntitlementApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminUserUidAppEntitlementListGetWithHttpInfo(null, 1L));
  }

  /**
   * Test {@link AppEntitlementApi#v1AdminUserUidAppEntitlementListGetWithHttpInfo(String, Long)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * AppEntitlementApi#v1AdminUserUidAppEntitlementListGetWithHttpInfo(String, Long)}
   */
  @Test
  @DisplayName(
      "Test v1AdminUserUidAppEntitlementListGetWithHttpInfo(String, Long); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse AppEntitlementApi.v1AdminUserUidAppEntitlementListGetWithHttpInfo(String, Long)"
  })
  void testV1AdminUserUidAppEntitlementListGetWithHttpInfo_thenThrowApiException2()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new AppEntitlementApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminUserUidAppEntitlementListGetWithHttpInfo(
                    "https://example.org/example", null));
  }

  /**
   * Test {@link AppEntitlementApi#v1AdminUserUidAppEntitlementListPatch(String, Long, List)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link AppEntitlementApi#v1AdminUserUidAppEntitlementListPatch(String,
   * Long, List)}
   */
  @Test
  @DisplayName(
      "Test v1AdminUserUidAppEntitlementListPatch(String, Long, List); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "List AppEntitlementApi.v1AdminUserUidAppEntitlementListPatch(String, Long, List)"
  })
  void testV1AdminUserUidAppEntitlementListPatch_whenNull_thenThrowApiException()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    AppEntitlementApi appEntitlementApi =
        new AppEntitlementApi(
            new ApiClientJersey2(
                mock(Client.class),
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"));

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> appEntitlementApi.v1AdminUserUidAppEntitlementListPatch(null, 1L, new ArrayList<>()));
  }

  /**
   * Test {@link AppEntitlementApi#v1AdminUserUidAppEntitlementListPatch(String, Long, List)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link AppEntitlementApi#v1AdminUserUidAppEntitlementListPatch(String,
   * Long, List)}
   */
  @Test
  @DisplayName(
      "Test v1AdminUserUidAppEntitlementListPatch(String, Long, List); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "List AppEntitlementApi.v1AdminUserUidAppEntitlementListPatch(String, Long, List)"
  })
  void testV1AdminUserUidAppEntitlementListPatch_whenNull_thenThrowApiException2()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    AppEntitlementApi appEntitlementApi =
        new AppEntitlementApi(
            new ApiClientJersey2(
                mock(Client.class),
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"));

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            appEntitlementApi.v1AdminUserUidAppEntitlementListPatch(
                "ABC123", null, new ArrayList<>()));
  }

  /**
   * Test {@link AppEntitlementApi#v1AdminUserUidAppEntitlementListPatchWithHttpInfo(String, Long,
   * List)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * AppEntitlementApi#v1AdminUserUidAppEntitlementListPatchWithHttpInfo(String, Long, List)}
   */
  @Test
  @DisplayName(
      "Test v1AdminUserUidAppEntitlementListPatchWithHttpInfo(String, Long, List); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse AppEntitlementApi.v1AdminUserUidAppEntitlementListPatchWithHttpInfo(String, Long, List)"
  })
  void testV1AdminUserUidAppEntitlementListPatchWithHttpInfo_thenThrowApiException()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    AppEntitlementApi appEntitlementApi =
        new AppEntitlementApi(
            new ApiClientJersey2(
                mock(Client.class),
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"));

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            appEntitlementApi.v1AdminUserUidAppEntitlementListPatchWithHttpInfo(
                null, 1L, new ArrayList<>()));
  }

  /**
   * Test {@link AppEntitlementApi#v1AdminUserUidAppEntitlementListPatchWithHttpInfo(String, Long,
   * List)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * AppEntitlementApi#v1AdminUserUidAppEntitlementListPatchWithHttpInfo(String, Long, List)}
   */
  @Test
  @DisplayName(
      "Test v1AdminUserUidAppEntitlementListPatchWithHttpInfo(String, Long, List); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse AppEntitlementApi.v1AdminUserUidAppEntitlementListPatchWithHttpInfo(String, Long, List)"
  })
  void testV1AdminUserUidAppEntitlementListPatchWithHttpInfo_thenThrowApiException2()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    AppEntitlementApi appEntitlementApi =
        new AppEntitlementApi(
            new ApiClientJersey2(
                mock(Client.class),
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"));

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            appEntitlementApi.v1AdminUserUidAppEntitlementListPatchWithHttpInfo(
                "https://example.org/example", null, new ArrayList<>()));
  }

  /**
   * Test {@link AppEntitlementApi#v1AdminUserUidAppEntitlementListPost(String, Long, List)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link AppEntitlementApi#v1AdminUserUidAppEntitlementListPost(String,
   * Long, List)}
   */
  @Test
  @DisplayName(
      "Test v1AdminUserUidAppEntitlementListPost(String, Long, List); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "List AppEntitlementApi.v1AdminUserUidAppEntitlementListPost(String, Long, List)"
  })
  void testV1AdminUserUidAppEntitlementListPost_whenNull_thenThrowApiException()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    AppEntitlementApi appEntitlementApi =
        new AppEntitlementApi(
            new ApiClientJersey2(
                mock(Client.class),
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"));

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> appEntitlementApi.v1AdminUserUidAppEntitlementListPost(null, 1L, new ArrayList<>()));
  }

  /**
   * Test {@link AppEntitlementApi#v1AdminUserUidAppEntitlementListPost(String, Long, List)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link AppEntitlementApi#v1AdminUserUidAppEntitlementListPost(String,
   * Long, List)}
   */
  @Test
  @DisplayName(
      "Test v1AdminUserUidAppEntitlementListPost(String, Long, List); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "List AppEntitlementApi.v1AdminUserUidAppEntitlementListPost(String, Long, List)"
  })
  void testV1AdminUserUidAppEntitlementListPost_whenNull_thenThrowApiException2()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    AppEntitlementApi appEntitlementApi =
        new AppEntitlementApi(
            new ApiClientJersey2(
                mock(Client.class),
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"));

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            appEntitlementApi.v1AdminUserUidAppEntitlementListPost(
                "ABC123", null, new ArrayList<>()));
  }

  /**
   * Test {@link AppEntitlementApi#v1AdminUserUidAppEntitlementListPostWithHttpInfo(String, Long,
   * List)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * AppEntitlementApi#v1AdminUserUidAppEntitlementListPostWithHttpInfo(String, Long, List)}
   */
  @Test
  @DisplayName(
      "Test v1AdminUserUidAppEntitlementListPostWithHttpInfo(String, Long, List); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse AppEntitlementApi.v1AdminUserUidAppEntitlementListPostWithHttpInfo(String, Long, List)"
  })
  void testV1AdminUserUidAppEntitlementListPostWithHttpInfo_thenThrowApiException()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    AppEntitlementApi appEntitlementApi =
        new AppEntitlementApi(
            new ApiClientJersey2(
                mock(Client.class),
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"));

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            appEntitlementApi.v1AdminUserUidAppEntitlementListPostWithHttpInfo(
                null, 1L, new ArrayList<>()));
  }

  /**
   * Test {@link AppEntitlementApi#v1AdminUserUidAppEntitlementListPostWithHttpInfo(String, Long,
   * List)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * AppEntitlementApi#v1AdminUserUidAppEntitlementListPostWithHttpInfo(String, Long, List)}
   */
  @Test
  @DisplayName(
      "Test v1AdminUserUidAppEntitlementListPostWithHttpInfo(String, Long, List); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse AppEntitlementApi.v1AdminUserUidAppEntitlementListPostWithHttpInfo(String, Long, List)"
  })
  void testV1AdminUserUidAppEntitlementListPostWithHttpInfo_thenThrowApiException2()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    AppEntitlementApi appEntitlementApi =
        new AppEntitlementApi(
            new ApiClientJersey2(
                mock(Client.class),
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"));

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            appEntitlementApi.v1AdminUserUidAppEntitlementListPostWithHttpInfo(
                "https://example.org/example", null, new ArrayList<>()));
  }
}
