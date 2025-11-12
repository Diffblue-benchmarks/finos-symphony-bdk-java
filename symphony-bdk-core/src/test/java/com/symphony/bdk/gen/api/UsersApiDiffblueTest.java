package com.symphony.bdk.gen.api;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.UserSearchQuery;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import jakarta.ws.rs.client.Client;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UsersApiDiffblueTest {
  /**
   * Test {@link UsersApi#v1UserGet(String, Boolean, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link UsersApi#v1UserGet(String, Boolean, String)}
   */
  @Test
  @DisplayName("Test v1UserGet(String, Boolean, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.User UsersApi.v1UserGet(String, Boolean, String)"
  })
  void testV1UserGet_thenThrowApiException() throws ApiException {
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
    assertThrows(ApiException.class, () -> new UsersApi(apiClient).v1UserGet(null, true, "ABC123"));
  }

  /**
   * Test {@link UsersApi#v1UserGet(String, Boolean, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link UsersApi#v1UserGet(String, Boolean, String)}
   */
  @Test
  @DisplayName("Test v1UserGet(String, Boolean, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.User UsersApi.v1UserGet(String, Boolean, String)"
  })
  void testV1UserGet_thenThrowApiException2() throws ApiException {
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
        () -> new UsersApi(apiClient).v1UserGet("jane.doe@example.org", true, null));
  }

  /**
   * Test {@link UsersApi#v1UserGetWithHttpInfo(String, Boolean, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link UsersApi#v1UserGetWithHttpInfo(String, Boolean, String)}
   */
  @Test
  @DisplayName("Test v1UserGetWithHttpInfo(String, Boolean, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse UsersApi.v1UserGetWithHttpInfo(String, Boolean, String)"
  })
  void testV1UserGetWithHttpInfo_thenThrowApiException() throws ApiException {
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
            new UsersApi(apiClient)
                .v1UserGetWithHttpInfo(null, true, "https://example.org/example"));
  }

  /**
   * Test {@link UsersApi#v1UserGetWithHttpInfo(String, Boolean, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link UsersApi#v1UserGetWithHttpInfo(String, Boolean, String)}
   */
  @Test
  @DisplayName("Test v1UserGetWithHttpInfo(String, Boolean, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse UsersApi.v1UserGetWithHttpInfo(String, Boolean, String)"
  })
  void testV1UserGetWithHttpInfo_thenThrowApiException2() throws ApiException {
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
            new UsersApi(apiClient)
                .v1UserGetWithHttpInfo("https://example.org/example", true, null));
  }

  /**
   * Test {@link UsersApi#v1UserNameUserNameGetGet(String, String)}.
   *
   * <ul>
   *   <li>When {@code janedoe}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link UsersApi#v1UserNameUserNameGetGet(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1UserNameUserNameGetGet(String, String); when 'janedoe'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.User UsersApi.v1UserNameUserNameGetGet(String, String)"
  })
  void testV1UserNameUserNameGetGet_whenJanedoe_thenThrowApiException() throws ApiException {
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
        () -> new UsersApi(apiClient).v1UserNameUserNameGetGet("janedoe", null));
  }

  /**
   * Test {@link UsersApi#v1UserNameUserNameGetGet(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link UsersApi#v1UserNameUserNameGetGet(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1UserNameUserNameGetGet(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.User UsersApi.v1UserNameUserNameGetGet(String, String)"
  })
  void testV1UserNameUserNameGetGet_whenNull_thenThrowApiException() throws ApiException {
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
        ApiException.class, () -> new UsersApi(apiClient).v1UserNameUserNameGetGet(null, "ABC123"));
  }

  /**
   * Test {@link UsersApi#v1UserNameUserNameGetGetWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code janedoe}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link UsersApi#v1UserNameUserNameGetGetWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1UserNameUserNameGetGetWithHttpInfo(String, String); when 'janedoe'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse UsersApi.v1UserNameUserNameGetGetWithHttpInfo(String, String)"
  })
  void testV1UserNameUserNameGetGetWithHttpInfo_whenJanedoe_thenThrowApiException()
      throws ApiException {
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
        () -> new UsersApi(apiClient).v1UserNameUserNameGetGetWithHttpInfo("janedoe", null));
  }

  /**
   * Test {@link UsersApi#v1UserNameUserNameGetGetWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link UsersApi#v1UserNameUserNameGetGetWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test v1UserNameUserNameGetGetWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse UsersApi.v1UserNameUserNameGetGetWithHttpInfo(String, String)"
  })
  void testV1UserNameUserNameGetGetWithHttpInfo_whenNull_thenThrowApiException()
      throws ApiException {
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
            new UsersApi(apiClient)
                .v1UserNameUserNameGetGetWithHttpInfo(null, "https://example.org/example"));
  }

  /**
   * Test {@link UsersApi#v1UserSearchPost(Integer, Integer, Boolean, String, UserSearchQuery)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link UsersApi#v1UserSearchPost(Integer, Integer, Boolean, String,
   * UserSearchQuery)}
   */
  @Test
  @DisplayName(
      "Test v1UserSearchPost(Integer, Integer, Boolean, String, UserSearchQuery); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.UserSearchResults UsersApi.v1UserSearchPost(Integer, Integer, Boolean, String, UserSearchQuery)"
  })
  void testV1UserSearchPost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    UsersApi usersApi = new UsersApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> usersApi.v1UserSearchPost(1, 1, true, null, new UserSearchQuery()));
  }

  /**
   * Test {@link UsersApi#v1UserSearchPost(Integer, Integer, Boolean, String, UserSearchQuery)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link UsersApi#v1UserSearchPost(Integer, Integer, Boolean, String,
   * UserSearchQuery)}
   */
  @Test
  @DisplayName(
      "Test v1UserSearchPost(Integer, Integer, Boolean, String, UserSearchQuery); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.UserSearchResults UsersApi.v1UserSearchPost(Integer, Integer, Boolean, String, UserSearchQuery)"
  })
  void testV1UserSearchPost_thenThrowApiException2() throws ApiException {
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
        () -> new UsersApi(apiClient).v1UserSearchPost(1, 1, true, "ABC123", null));
  }

  /**
   * Test {@link UsersApi#v1UserSearchPostWithHttpInfo(Integer, Integer, Boolean, String,
   * UserSearchQuery)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link UsersApi#v1UserSearchPostWithHttpInfo(Integer, Integer, Boolean,
   * String, UserSearchQuery)}
   */
  @Test
  @DisplayName(
      "Test v1UserSearchPostWithHttpInfo(Integer, Integer, Boolean, String, UserSearchQuery); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse UsersApi.v1UserSearchPostWithHttpInfo(Integer, Integer, Boolean, String, UserSearchQuery)"
  })
  void testV1UserSearchPostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    UsersApi usersApi = new UsersApi(apiClient);

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> usersApi.v1UserSearchPostWithHttpInfo(1, 1, true, null, new UserSearchQuery()));
  }

  /**
   * Test {@link UsersApi#v1UserSearchPostWithHttpInfo(Integer, Integer, Boolean, String,
   * UserSearchQuery)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link UsersApi#v1UserSearchPostWithHttpInfo(Integer, Integer, Boolean,
   * String, UserSearchQuery)}
   */
  @Test
  @DisplayName(
      "Test v1UserSearchPostWithHttpInfo(Integer, Integer, Boolean, String, UserSearchQuery); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse UsersApi.v1UserSearchPostWithHttpInfo(Integer, Integer, Boolean, String, UserSearchQuery)"
  })
  void testV1UserSearchPostWithHttpInfo_thenThrowApiException2() throws ApiException {
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
            new UsersApi(apiClient)
                .v1UserSearchPostWithHttpInfo(1, 1, true, "https://example.org/example", null));
  }

  /**
   * Test {@link UsersApi#v2UserGet(Long, String, String, Boolean, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link UsersApi#v2UserGet(Long, String, String, Boolean, String)}
   */
  @Test
  @DisplayName(
      "Test v2UserGet(Long, String, String, Boolean, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.UserV2 UsersApi.v2UserGet(Long, String, String, Boolean, String)"
  })
  void testV2UserGet_whenNull_thenThrowApiException() throws ApiException {
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
        () -> new UsersApi(apiClient).v2UserGet(1L, "jane.doe@example.org", "janedoe", true, null));
  }

  /**
   * Test {@link UsersApi#v2UserGetWithHttpInfo(Long, String, String, Boolean, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link UsersApi#v2UserGetWithHttpInfo(Long, String, String, Boolean,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v2UserGetWithHttpInfo(Long, String, String, Boolean, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse UsersApi.v2UserGetWithHttpInfo(Long, String, String, Boolean, String)"
  })
  void testV2UserGetWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
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
            new UsersApi(apiClient)
                .v2UserGetWithHttpInfo(1L, "https://example.org/example", "janedoe", true, null));
  }

  /**
   * Test {@link UsersApi#v3UsersGet(String, String, String, Boolean, Boolean, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link UsersApi#v3UsersGet(String, String, String, Boolean, Boolean,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v3UsersGet(String, String, String, Boolean, Boolean, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V2UserList UsersApi.v3UsersGet(String, String, String, Boolean, Boolean, String)"
  })
  void testV3UsersGet_whenNull_thenThrowApiException() throws ApiException {
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
            new UsersApi(apiClient)
                .v3UsersGet("1234", "jane.doe@example.org", "janedoe", true, true, null));
  }

  /**
   * Test {@link UsersApi#v3UsersGetWithHttpInfo(String, String, String, Boolean, Boolean, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link UsersApi#v3UsersGetWithHttpInfo(String, String, String, Boolean,
   * Boolean, String)}
   */
  @Test
  @DisplayName(
      "Test v3UsersGetWithHttpInfo(String, String, String, Boolean, Boolean, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse UsersApi.v3UsersGetWithHttpInfo(String, String, String, Boolean, Boolean, String)"
  })
  void testV3UsersGetWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
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
            new UsersApi(apiClient)
                .v3UsersGetWithHttpInfo(
                    "https://example.org/example",
                    "https://example.org/example",
                    "janedoe",
                    true,
                    true,
                    null));
  }
}
