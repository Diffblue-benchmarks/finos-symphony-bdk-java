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

class InfoBarriersApiDiffblueTest {
  /**
   * Test {@link InfoBarriersApi#v1AdminGroupGidMembershipAddPost(String, String, List)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link InfoBarriersApi#v1AdminGroupGidMembershipAddPost(String, String,
   * List)}
   */
  @Test
  @DisplayName(
      "Test v1AdminGroupGidMembershipAddPost(String, String, List); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.BulkActionResult InfoBarriersApi.v1AdminGroupGidMembershipAddPost(String, String, List)"
  })
  void testV1AdminGroupGidMembershipAddPost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    InfoBarriersApi infoBarriersApi =
        new InfoBarriersApi(
            new ApiClientJersey2(
                mock(Client.class),
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"));

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> infoBarriersApi.v1AdminGroupGidMembershipAddPost(null, "ABC123", new ArrayList<>()));
  }

  /**
   * Test {@link InfoBarriersApi#v1AdminGroupGidMembershipAddPost(String, String, List)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link InfoBarriersApi#v1AdminGroupGidMembershipAddPost(String, String,
   * List)}
   */
  @Test
  @DisplayName(
      "Test v1AdminGroupGidMembershipAddPost(String, String, List); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.BulkActionResult InfoBarriersApi.v1AdminGroupGidMembershipAddPost(String, String, List)"
  })
  void testV1AdminGroupGidMembershipAddPost_whenNull_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    InfoBarriersApi infoBarriersApi =
        new InfoBarriersApi(
            new ApiClientJersey2(
                mock(Client.class),
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"));

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> infoBarriersApi.v1AdminGroupGidMembershipAddPost("Gid", null, new ArrayList<>()));
  }

  /**
   * Test {@link InfoBarriersApi#v1AdminGroupGidMembershipAddPostWithHttpInfo(String, String,
   * List)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * InfoBarriersApi#v1AdminGroupGidMembershipAddPostWithHttpInfo(String, String, List)}
   */
  @Test
  @DisplayName(
      "Test v1AdminGroupGidMembershipAddPostWithHttpInfo(String, String, List); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse InfoBarriersApi.v1AdminGroupGidMembershipAddPostWithHttpInfo(String, String, List)"
  })
  void testV1AdminGroupGidMembershipAddPostWithHttpInfo_whenNull_thenThrowApiException()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    InfoBarriersApi infoBarriersApi =
        new InfoBarriersApi(
            new ApiClientJersey2(
                mock(Client.class),
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"));

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            infoBarriersApi.v1AdminGroupGidMembershipAddPostWithHttpInfo(
                null, "https://example.org/example", new ArrayList<>()));
  }

  /**
   * Test {@link InfoBarriersApi#v1AdminGroupGidMembershipAddPostWithHttpInfo(String, String,
   * List)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * InfoBarriersApi#v1AdminGroupGidMembershipAddPostWithHttpInfo(String, String, List)}
   */
  @Test
  @DisplayName(
      "Test v1AdminGroupGidMembershipAddPostWithHttpInfo(String, String, List); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse InfoBarriersApi.v1AdminGroupGidMembershipAddPostWithHttpInfo(String, String, List)"
  })
  void testV1AdminGroupGidMembershipAddPostWithHttpInfo_whenNull_thenThrowApiException2()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    InfoBarriersApi infoBarriersApi =
        new InfoBarriersApi(
            new ApiClientJersey2(
                mock(Client.class),
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"));

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            infoBarriersApi.v1AdminGroupGidMembershipAddPostWithHttpInfo(
                "https://example.org/example", null, new ArrayList<>()));
  }

  /**
   * Test {@link InfoBarriersApi#v1AdminGroupGidMembershipListGet(String, String, Integer,
   * Integer)}.
   *
   * <ul>
   *   <li>When {@code Gid}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link InfoBarriersApi#v1AdminGroupGidMembershipListGet(String, String,
   * Integer, Integer)}
   */
  @Test
  @DisplayName(
      "Test v1AdminGroupGidMembershipListGet(String, String, Integer, Integer); when 'Gid'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "List InfoBarriersApi.v1AdminGroupGidMembershipListGet(String, String, Integer, Integer)"
  })
  void testV1AdminGroupGidMembershipListGet_whenGid_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new InfoBarriersApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminGroupGidMembershipListGet("Gid", null, 1, 1));
  }

  /**
   * Test {@link InfoBarriersApi#v1AdminGroupGidMembershipListGet(String, String, Integer,
   * Integer)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link InfoBarriersApi#v1AdminGroupGidMembershipListGet(String, String,
   * Integer, Integer)}
   */
  @Test
  @DisplayName(
      "Test v1AdminGroupGidMembershipListGet(String, String, Integer, Integer); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "List InfoBarriersApi.v1AdminGroupGidMembershipListGet(String, String, Integer, Integer)"
  })
  void testV1AdminGroupGidMembershipListGet_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new InfoBarriersApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminGroupGidMembershipListGet(null, "ABC123", 1, 1));
  }

  /**
   * Test {@link InfoBarriersApi#v1AdminGroupGidMembershipListGetWithHttpInfo(String, String,
   * Integer, Integer)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * InfoBarriersApi#v1AdminGroupGidMembershipListGetWithHttpInfo(String, String, Integer, Integer)}
   */
  @Test
  @DisplayName(
      "Test v1AdminGroupGidMembershipListGetWithHttpInfo(String, String, Integer, Integer); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse InfoBarriersApi.v1AdminGroupGidMembershipListGetWithHttpInfo(String, String, Integer, Integer)"
  })
  void testV1AdminGroupGidMembershipListGetWithHttpInfo_whenNull_thenThrowApiException()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new InfoBarriersApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminGroupGidMembershipListGetWithHttpInfo(
                    null, "https://example.org/example", 1, 1));
  }

  /**
   * Test {@link InfoBarriersApi#v1AdminGroupGidMembershipListGetWithHttpInfo(String, String,
   * Integer, Integer)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * InfoBarriersApi#v1AdminGroupGidMembershipListGetWithHttpInfo(String, String, Integer, Integer)}
   */
  @Test
  @DisplayName(
      "Test v1AdminGroupGidMembershipListGetWithHttpInfo(String, String, Integer, Integer); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse InfoBarriersApi.v1AdminGroupGidMembershipListGetWithHttpInfo(String, String, Integer, Integer)"
  })
  void testV1AdminGroupGidMembershipListGetWithHttpInfo_whenNull_thenThrowApiException2()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new InfoBarriersApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminGroupGidMembershipListGetWithHttpInfo(
                    "https://example.org/example", null, 1, 1));
  }

  /**
   * Test {@link InfoBarriersApi#v1AdminGroupGidMembershipRemovePost(String, String, List)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link InfoBarriersApi#v1AdminGroupGidMembershipRemovePost(String,
   * String, List)}
   */
  @Test
  @DisplayName(
      "Test v1AdminGroupGidMembershipRemovePost(String, String, List); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.BulkActionResult InfoBarriersApi.v1AdminGroupGidMembershipRemovePost(String, String, List)"
  })
  void testV1AdminGroupGidMembershipRemovePost_whenNull_thenThrowApiException()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    InfoBarriersApi infoBarriersApi =
        new InfoBarriersApi(
            new ApiClientJersey2(
                mock(Client.class),
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"));

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            infoBarriersApi.v1AdminGroupGidMembershipRemovePost(null, "ABC123", new ArrayList<>()));
  }

  /**
   * Test {@link InfoBarriersApi#v1AdminGroupGidMembershipRemovePost(String, String, List)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link InfoBarriersApi#v1AdminGroupGidMembershipRemovePost(String,
   * String, List)}
   */
  @Test
  @DisplayName(
      "Test v1AdminGroupGidMembershipRemovePost(String, String, List); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.BulkActionResult InfoBarriersApi.v1AdminGroupGidMembershipRemovePost(String, String, List)"
  })
  void testV1AdminGroupGidMembershipRemovePost_whenNull_thenThrowApiException2()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    InfoBarriersApi infoBarriersApi =
        new InfoBarriersApi(
            new ApiClientJersey2(
                mock(Client.class),
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"));

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> infoBarriersApi.v1AdminGroupGidMembershipRemovePost("Gid", null, new ArrayList<>()));
  }

  /**
   * Test {@link InfoBarriersApi#v1AdminGroupGidMembershipRemovePostWithHttpInfo(String, String,
   * List)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * InfoBarriersApi#v1AdminGroupGidMembershipRemovePostWithHttpInfo(String, String, List)}
   */
  @Test
  @DisplayName(
      "Test v1AdminGroupGidMembershipRemovePostWithHttpInfo(String, String, List); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse InfoBarriersApi.v1AdminGroupGidMembershipRemovePostWithHttpInfo(String, String, List)"
  })
  void testV1AdminGroupGidMembershipRemovePostWithHttpInfo_thenThrowApiException()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    InfoBarriersApi infoBarriersApi =
        new InfoBarriersApi(
            new ApiClientJersey2(
                mock(Client.class),
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"));

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            infoBarriersApi.v1AdminGroupGidMembershipRemovePostWithHttpInfo(
                null, "https://example.org/example", new ArrayList<>()));
  }

  /**
   * Test {@link InfoBarriersApi#v1AdminGroupGidMembershipRemovePostWithHttpInfo(String, String,
   * List)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * InfoBarriersApi#v1AdminGroupGidMembershipRemovePostWithHttpInfo(String, String, List)}
   */
  @Test
  @DisplayName(
      "Test v1AdminGroupGidMembershipRemovePostWithHttpInfo(String, String, List); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse InfoBarriersApi.v1AdminGroupGidMembershipRemovePostWithHttpInfo(String, String, List)"
  })
  void testV1AdminGroupGidMembershipRemovePostWithHttpInfo_thenThrowApiException2()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    InfoBarriersApi infoBarriersApi =
        new InfoBarriersApi(
            new ApiClientJersey2(
                mock(Client.class),
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"));

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            infoBarriersApi.v1AdminGroupGidMembershipRemovePostWithHttpInfo(
                "https://example.org/example", null, new ArrayList<>()));
  }

  /**
   * Test {@link InfoBarriersApi#v1AdminGroupListGet(String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link InfoBarriersApi#v1AdminGroupListGet(String)}
   */
  @Test
  @DisplayName("Test v1AdminGroupListGet(String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List InfoBarriersApi.v1AdminGroupListGet(String)"})
  void testV1AdminGroupListGet_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new InfoBarriersApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminGroupListGet(null));
  }

  /**
   * Test {@link InfoBarriersApi#v1AdminGroupListGetWithHttpInfo(String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link InfoBarriersApi#v1AdminGroupListGetWithHttpInfo(String)}
   */
  @Test
  @DisplayName("Test v1AdminGroupListGetWithHttpInfo(String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse InfoBarriersApi.v1AdminGroupListGetWithHttpInfo(String)"
  })
  void testV1AdminGroupListGetWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new InfoBarriersApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminGroupListGetWithHttpInfo(null));
  }

  /**
   * Test {@link InfoBarriersApi#v1AdminPolicyListGet(String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link InfoBarriersApi#v1AdminPolicyListGet(String)}
   */
  @Test
  @DisplayName("Test v1AdminPolicyListGet(String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List InfoBarriersApi.v1AdminPolicyListGet(String)"})
  void testV1AdminPolicyListGet_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new InfoBarriersApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminPolicyListGet(null));
  }

  /**
   * Test {@link InfoBarriersApi#v1AdminPolicyListGetWithHttpInfo(String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link InfoBarriersApi#v1AdminPolicyListGetWithHttpInfo(String)}
   */
  @Test
  @DisplayName("Test v1AdminPolicyListGetWithHttpInfo(String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse InfoBarriersApi.v1AdminPolicyListGetWithHttpInfo(String)"
  })
  void testV1AdminPolicyListGetWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new InfoBarriersApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminPolicyListGetWithHttpInfo(null));
  }
}
