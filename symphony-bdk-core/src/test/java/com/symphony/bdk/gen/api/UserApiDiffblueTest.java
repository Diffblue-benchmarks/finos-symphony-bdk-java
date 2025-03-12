package com.symphony.bdk.gen.api;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.AvatarUpdate;
import com.symphony.bdk.gen.api.model.DelegateAction;
import com.symphony.bdk.gen.api.model.FollowersList;
import com.symphony.bdk.gen.api.model.StringId;
import com.symphony.bdk.gen.api.model.UserAttributes;
import com.symphony.bdk.gen.api.model.UserCreate;
import com.symphony.bdk.gen.api.model.UserFilter;
import com.symphony.bdk.gen.api.model.UserStatus;
import com.symphony.bdk.gen.api.model.UserSuspension;
import com.symphony.bdk.gen.api.model.V2UserAttributes;
import com.symphony.bdk.gen.api.model.V2UserCreate;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import jakarta.ws.rs.client.Client;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserApiDiffblueTest {
  /**
   * Test {@link UserApi#v1AdminSystemRolesListGet(String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminSystemRolesListGet(String)}
   */
  @Test
  @DisplayName("Test v1AdminSystemRolesListGet(String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List UserApi.v1AdminSystemRolesListGet(String)"})
  void testV1AdminSystemRolesListGet_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminSystemRolesListGet(null));
  }

  /**
   * Test {@link UserApi#v1AdminSystemRolesListGetWithHttpInfo(String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminSystemRolesListGetWithHttpInfo(String)}
   */
  @Test
  @DisplayName("Test v1AdminSystemRolesListGetWithHttpInfo(String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminSystemRolesListGetWithHttpInfo(String)"})
  void testV1AdminSystemRolesListGetWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminSystemRolesListGetWithHttpInfo(null));
  }

  /**
   * Test {@link UserApi#v1AdminUserCreatePost(String, UserCreate)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserCreatePost(String, UserCreate)}
   */
  @Test
  @DisplayName("Test v1AdminUserCreatePost(String, UserCreate); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.gen.api.model.UserDetail UserApi.v1AdminUserCreatePost(String, UserCreate)"})
  void testV1AdminUserCreatePost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi.v1AdminUserCreatePost(null, new UserCreate()));
  }

  /**
   * Test {@link UserApi#v1AdminUserCreatePost(String, UserCreate)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserCreatePost(String, UserCreate)}
   */
  @Test
  @DisplayName("Test v1AdminUserCreatePost(String, UserCreate); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.gen.api.model.UserDetail UserApi.v1AdminUserCreatePost(String, UserCreate)"})
  void testV1AdminUserCreatePost_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminUserCreatePost("ABC123", null));
  }

  /**
   * Test {@link UserApi#v1AdminUserCreatePostWithHttpInfo(String, UserCreate)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserCreatePostWithHttpInfo(String, UserCreate)}
   */
  @Test
  @DisplayName("Test v1AdminUserCreatePostWithHttpInfo(String, UserCreate); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserCreatePostWithHttpInfo(String, UserCreate)"})
  void testV1AdminUserCreatePostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi.v1AdminUserCreatePostWithHttpInfo(null, new UserCreate()));
  }

  /**
   * Test {@link UserApi#v1AdminUserCreatePostWithHttpInfo(String, UserCreate)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserCreatePostWithHttpInfo(String, UserCreate)}
   */
  @Test
  @DisplayName("Test v1AdminUserCreatePostWithHttpInfo(String, UserCreate); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserCreatePostWithHttpInfo(String, UserCreate)"})
  void testV1AdminUserCreatePostWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminUserCreatePostWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link UserApi#v1AdminUserFindPost(String, Integer, Integer, UserFilter)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserFindPost(String, Integer, Integer, UserFilter)}
   */
  @Test
  @DisplayName("Test v1AdminUserFindPost(String, Integer, Integer, UserFilter); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List UserApi.v1AdminUserFindPost(String, Integer, Integer, UserFilter)"})
  void testV1AdminUserFindPost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi.v1AdminUserFindPost(null, 1, 1, new UserFilter()));
  }

  /**
   * Test {@link UserApi#v1AdminUserFindPost(String, Integer, Integer, UserFilter)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserFindPost(String, Integer, Integer, UserFilter)}
   */
  @Test
  @DisplayName("Test v1AdminUserFindPost(String, Integer, Integer, UserFilter); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List UserApi.v1AdminUserFindPost(String, Integer, Integer, UserFilter)"})
  void testV1AdminUserFindPost_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminUserFindPost("ABC123", 1, 1, null));
  }

  /**
   * Test {@link UserApi#v1AdminUserFindPostWithHttpInfo(String, Integer, Integer, UserFilter)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserFindPostWithHttpInfo(String, Integer, Integer, UserFilter)}
   */
  @Test
  @DisplayName("Test v1AdminUserFindPostWithHttpInfo(String, Integer, Integer, UserFilter); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserFindPostWithHttpInfo(String, Integer, Integer, UserFilter)"})
  void testV1AdminUserFindPostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi.v1AdminUserFindPostWithHttpInfo(null, 1, 1, new UserFilter()));
  }

  /**
   * Test {@link UserApi#v1AdminUserFindPostWithHttpInfo(String, Integer, Integer, UserFilter)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserFindPostWithHttpInfo(String, Integer, Integer, UserFilter)}
   */
  @Test
  @DisplayName("Test v1AdminUserFindPostWithHttpInfo(String, Integer, Integer, UserFilter); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserFindPostWithHttpInfo(String, Integer, Integer, UserFilter)"})
  void testV1AdminUserFindPostWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example")))
            .v1AdminUserFindPostWithHttpInfo("https://example.org/example", 1, 1, null));
  }

  /**
   * Test {@link UserApi#v1AdminUserListGet(String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserListGet(String)}
   */
  @Test
  @DisplayName("Test v1AdminUserListGet(String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List UserApi.v1AdminUserListGet(String)"})
  void testV1AdminUserListGet_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class, () -> (new UserApi(new ApiClientJersey2(mock(Client.class),
        "https://example.org/example", defaultHeaders, "https://example.org/example"))).v1AdminUserListGet(null));
  }

  /**
   * Test {@link UserApi#v1AdminUserListGetWithHttpInfo(String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserListGetWithHttpInfo(String)}
   */
  @Test
  @DisplayName("Test v1AdminUserListGetWithHttpInfo(String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserListGetWithHttpInfo(String)"})
  void testV1AdminUserListGetWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminUserListGetWithHttpInfo(null));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidAvatarGet(String, Long)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidAvatarGet(String, Long)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidAvatarGet(String, Long); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List UserApi.v1AdminUserUidAvatarGet(String, Long)"})
  void testV1AdminUserUidAvatarGet_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminUserUidAvatarGet(null, 1L));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidAvatarGet(String, Long)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidAvatarGet(String, Long)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidAvatarGet(String, Long); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List UserApi.v1AdminUserUidAvatarGet(String, Long)"})
  void testV1AdminUserUidAvatarGet_whenNull_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminUserUidAvatarGet("ABC123", null));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidAvatarGetWithHttpInfo(String, Long)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidAvatarGetWithHttpInfo(String, Long)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidAvatarGetWithHttpInfo(String, Long); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidAvatarGetWithHttpInfo(String, Long)"})
  void testV1AdminUserUidAvatarGetWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminUserUidAvatarGetWithHttpInfo(null, 1L));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidAvatarGetWithHttpInfo(String, Long)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidAvatarGetWithHttpInfo(String, Long)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidAvatarGetWithHttpInfo(String, Long); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidAvatarGetWithHttpInfo(String, Long)"})
  void testV1AdminUserUidAvatarGetWithHttpInfo_whenNull_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminUserUidAvatarGetWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidAvatarUpdatePost(String, Long, AvatarUpdate)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidAvatarUpdatePost(String, Long, AvatarUpdate)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidAvatarUpdatePost(String, Long, AvatarUpdate); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.SuccessResponse UserApi.v1AdminUserUidAvatarUpdatePost(String, Long, AvatarUpdate)"})
  void testV1AdminUserUidAvatarUpdatePost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi.v1AdminUserUidAvatarUpdatePost("ABC123", null, new AvatarUpdate()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidAvatarUpdatePost(String, Long, AvatarUpdate)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidAvatarUpdatePost(String, Long, AvatarUpdate)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidAvatarUpdatePost(String, Long, AvatarUpdate); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.SuccessResponse UserApi.v1AdminUserUidAvatarUpdatePost(String, Long, AvatarUpdate)"})
  void testV1AdminUserUidAvatarUpdatePost_whenOne_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi.v1AdminUserUidAvatarUpdatePost(null, 1L, new AvatarUpdate()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidAvatarUpdatePost(String, Long, AvatarUpdate)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidAvatarUpdatePost(String, Long, AvatarUpdate)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidAvatarUpdatePost(String, Long, AvatarUpdate); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.SuccessResponse UserApi.v1AdminUserUidAvatarUpdatePost(String, Long, AvatarUpdate)"})
  void testV1AdminUserUidAvatarUpdatePost_whenOne_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminUserUidAvatarUpdatePost("ABC123", 1L, null));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidAvatarUpdatePostWithHttpInfo(String, Long, AvatarUpdate)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidAvatarUpdatePostWithHttpInfo(String, Long, AvatarUpdate)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidAvatarUpdatePostWithHttpInfo(String, Long, AvatarUpdate); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidAvatarUpdatePostWithHttpInfo(String, Long, AvatarUpdate)"})
  void testV1AdminUserUidAvatarUpdatePostWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi
        .v1AdminUserUidAvatarUpdatePostWithHttpInfo("https://example.org/example", null, new AvatarUpdate()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidAvatarUpdatePostWithHttpInfo(String, Long, AvatarUpdate)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidAvatarUpdatePostWithHttpInfo(String, Long, AvatarUpdate)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidAvatarUpdatePostWithHttpInfo(String, Long, AvatarUpdate); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidAvatarUpdatePostWithHttpInfo(String, Long, AvatarUpdate)"})
  void testV1AdminUserUidAvatarUpdatePostWithHttpInfo_whenOne_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> userApi.v1AdminUserUidAvatarUpdatePostWithHttpInfo(null, 1L, new AvatarUpdate()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidAvatarUpdatePostWithHttpInfo(String, Long, AvatarUpdate)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidAvatarUpdatePostWithHttpInfo(String, Long, AvatarUpdate)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidAvatarUpdatePostWithHttpInfo(String, Long, AvatarUpdate); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidAvatarUpdatePostWithHttpInfo(String, Long, AvatarUpdate)"})
  void testV1AdminUserUidAvatarUpdatePostWithHttpInfo_whenOne_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example")))
            .v1AdminUserUidAvatarUpdatePostWithHttpInfo("https://example.org/example", 1L, null));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidDelegatesGet(String, Long)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidDelegatesGet(String, Long)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidDelegatesGet(String, Long); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List UserApi.v1AdminUserUidDelegatesGet(String, Long)"})
  void testV1AdminUserUidDelegatesGet_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminUserUidDelegatesGet(null, 1L));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidDelegatesGet(String, Long)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidDelegatesGet(String, Long)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidDelegatesGet(String, Long); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List UserApi.v1AdminUserUidDelegatesGet(String, Long)"})
  void testV1AdminUserUidDelegatesGet_whenNull_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminUserUidDelegatesGet("ABC123", null));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidDelegatesGetWithHttpInfo(String, Long)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidDelegatesGetWithHttpInfo(String, Long)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidDelegatesGetWithHttpInfo(String, Long); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidDelegatesGetWithHttpInfo(String, Long)"})
  void testV1AdminUserUidDelegatesGetWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminUserUidDelegatesGetWithHttpInfo(null, 1L));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidDelegatesGetWithHttpInfo(String, Long)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidDelegatesGetWithHttpInfo(String, Long)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidDelegatesGetWithHttpInfo(String, Long); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidDelegatesGetWithHttpInfo(String, Long)"})
  void testV1AdminUserUidDelegatesGetWithHttpInfo_whenNull_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example")))
            .v1AdminUserUidDelegatesGetWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidDelegatesUpdatePost(String, Long, DelegateAction)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidDelegatesUpdatePost(String, Long, DelegateAction)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidDelegatesUpdatePost(String, Long, DelegateAction); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.SuccessResponse UserApi.v1AdminUserUidDelegatesUpdatePost(String, Long, DelegateAction)"})
  void testV1AdminUserUidDelegatesUpdatePost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> userApi.v1AdminUserUidDelegatesUpdatePost("ABC123", null, new DelegateAction()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidDelegatesUpdatePost(String, Long, DelegateAction)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidDelegatesUpdatePost(String, Long, DelegateAction)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidDelegatesUpdatePost(String, Long, DelegateAction); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.SuccessResponse UserApi.v1AdminUserUidDelegatesUpdatePost(String, Long, DelegateAction)"})
  void testV1AdminUserUidDelegatesUpdatePost_whenOne_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi.v1AdminUserUidDelegatesUpdatePost(null, 1L, new DelegateAction()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidDelegatesUpdatePost(String, Long, DelegateAction)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidDelegatesUpdatePost(String, Long, DelegateAction)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidDelegatesUpdatePost(String, Long, DelegateAction); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.SuccessResponse UserApi.v1AdminUserUidDelegatesUpdatePost(String, Long, DelegateAction)"})
  void testV1AdminUserUidDelegatesUpdatePost_whenOne_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminUserUidDelegatesUpdatePost("ABC123", 1L, null));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidDelegatesUpdatePostWithHttpInfo(String, Long, DelegateAction)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidDelegatesUpdatePostWithHttpInfo(String, Long, DelegateAction)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidDelegatesUpdatePostWithHttpInfo(String, Long, DelegateAction); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidDelegatesUpdatePostWithHttpInfo(String, Long, DelegateAction)"})
  void testV1AdminUserUidDelegatesUpdatePostWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi
        .v1AdminUserUidDelegatesUpdatePostWithHttpInfo("https://example.org/example", null, new DelegateAction()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidDelegatesUpdatePostWithHttpInfo(String, Long, DelegateAction)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidDelegatesUpdatePostWithHttpInfo(String, Long, DelegateAction)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidDelegatesUpdatePostWithHttpInfo(String, Long, DelegateAction); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidDelegatesUpdatePostWithHttpInfo(String, Long, DelegateAction)"})
  void testV1AdminUserUidDelegatesUpdatePostWithHttpInfo_whenOne_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> userApi.v1AdminUserUidDelegatesUpdatePostWithHttpInfo(null, 1L, new DelegateAction()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidDelegatesUpdatePostWithHttpInfo(String, Long, DelegateAction)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidDelegatesUpdatePostWithHttpInfo(String, Long, DelegateAction)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidDelegatesUpdatePostWithHttpInfo(String, Long, DelegateAction); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidDelegatesUpdatePostWithHttpInfo(String, Long, DelegateAction)"})
  void testV1AdminUserUidDelegatesUpdatePostWithHttpInfo_whenOne_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example")))
            .v1AdminUserUidDelegatesUpdatePostWithHttpInfo("https://example.org/example", 1L, null));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidDisclaimerDelete(String, Long)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidDisclaimerDelete(String, Long)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidDisclaimerDelete(String, Long); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.SuccessResponse UserApi.v1AdminUserUidDisclaimerDelete(String, Long)"})
  void testV1AdminUserUidDisclaimerDelete_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminUserUidDisclaimerDelete(null, 1L));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidDisclaimerDelete(String, Long)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidDisclaimerDelete(String, Long)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidDisclaimerDelete(String, Long); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.SuccessResponse UserApi.v1AdminUserUidDisclaimerDelete(String, Long)"})
  void testV1AdminUserUidDisclaimerDelete_whenNull_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminUserUidDisclaimerDelete("ABC123", null));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidDisclaimerDeleteWithHttpInfo(String, Long)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidDisclaimerDeleteWithHttpInfo(String, Long)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidDisclaimerDeleteWithHttpInfo(String, Long); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidDisclaimerDeleteWithHttpInfo(String, Long)"})
  void testV1AdminUserUidDisclaimerDeleteWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminUserUidDisclaimerDeleteWithHttpInfo(null, 1L));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidDisclaimerDeleteWithHttpInfo(String, Long)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidDisclaimerDeleteWithHttpInfo(String, Long)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidDisclaimerDeleteWithHttpInfo(String, Long); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidDisclaimerDeleteWithHttpInfo(String, Long)"})
  void testV1AdminUserUidDisclaimerDeleteWithHttpInfo_whenNull_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example")))
            .v1AdminUserUidDisclaimerDeleteWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidDisclaimerGet(String, Long)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidDisclaimerGet(String, Long)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidDisclaimerGet(String, Long); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.gen.api.model.Disclaimer UserApi.v1AdminUserUidDisclaimerGet(String, Long)"})
  void testV1AdminUserUidDisclaimerGet_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminUserUidDisclaimerGet(null, 1L));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidDisclaimerGet(String, Long)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidDisclaimerGet(String, Long)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidDisclaimerGet(String, Long); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.gen.api.model.Disclaimer UserApi.v1AdminUserUidDisclaimerGet(String, Long)"})
  void testV1AdminUserUidDisclaimerGet_whenNull_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminUserUidDisclaimerGet("ABC123", null));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidDisclaimerGetWithHttpInfo(String, Long)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidDisclaimerGetWithHttpInfo(String, Long)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidDisclaimerGetWithHttpInfo(String, Long); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidDisclaimerGetWithHttpInfo(String, Long)"})
  void testV1AdminUserUidDisclaimerGetWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminUserUidDisclaimerGetWithHttpInfo(null, 1L));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidDisclaimerGetWithHttpInfo(String, Long)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidDisclaimerGetWithHttpInfo(String, Long)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidDisclaimerGetWithHttpInfo(String, Long); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidDisclaimerGetWithHttpInfo(String, Long)"})
  void testV1AdminUserUidDisclaimerGetWithHttpInfo_whenNull_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example")))
            .v1AdminUserUidDisclaimerGetWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidDisclaimerUpdatePost(String, Long, StringId)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidDisclaimerUpdatePost(String, Long, StringId)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidDisclaimerUpdatePost(String, Long, StringId); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.SuccessResponse UserApi.v1AdminUserUidDisclaimerUpdatePost(String, Long, StringId)"})
  void testV1AdminUserUidDisclaimerUpdatePost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi.v1AdminUserUidDisclaimerUpdatePost("ABC123", null, new StringId()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidDisclaimerUpdatePost(String, Long, StringId)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidDisclaimerUpdatePost(String, Long, StringId)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidDisclaimerUpdatePost(String, Long, StringId); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.SuccessResponse UserApi.v1AdminUserUidDisclaimerUpdatePost(String, Long, StringId)"})
  void testV1AdminUserUidDisclaimerUpdatePost_whenOne_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi.v1AdminUserUidDisclaimerUpdatePost(null, 1L, new StringId()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidDisclaimerUpdatePost(String, Long, StringId)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidDisclaimerUpdatePost(String, Long, StringId)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidDisclaimerUpdatePost(String, Long, StringId); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.SuccessResponse UserApi.v1AdminUserUidDisclaimerUpdatePost(String, Long, StringId)"})
  void testV1AdminUserUidDisclaimerUpdatePost_whenOne_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminUserUidDisclaimerUpdatePost("ABC123", 1L, null));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidDisclaimerUpdatePostWithHttpInfo(String, Long, StringId)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidDisclaimerUpdatePostWithHttpInfo(String, Long, StringId)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidDisclaimerUpdatePostWithHttpInfo(String, Long, StringId); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidDisclaimerUpdatePostWithHttpInfo(String, Long, StringId)"})
  void testV1AdminUserUidDisclaimerUpdatePostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi
        .v1AdminUserUidDisclaimerUpdatePostWithHttpInfo("https://example.org/example", null, new StringId()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidDisclaimerUpdatePostWithHttpInfo(String, Long, StringId)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidDisclaimerUpdatePostWithHttpInfo(String, Long, StringId)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidDisclaimerUpdatePostWithHttpInfo(String, Long, StringId); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidDisclaimerUpdatePostWithHttpInfo(String, Long, StringId)"})
  void testV1AdminUserUidDisclaimerUpdatePostWithHttpInfo_whenOne_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> userApi.v1AdminUserUidDisclaimerUpdatePostWithHttpInfo(null, 1L, new StringId()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidDisclaimerUpdatePostWithHttpInfo(String, Long, StringId)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidDisclaimerUpdatePostWithHttpInfo(String, Long, StringId)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidDisclaimerUpdatePostWithHttpInfo(String, Long, StringId); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidDisclaimerUpdatePostWithHttpInfo(String, Long, StringId)"})
  void testV1AdminUserUidDisclaimerUpdatePostWithHttpInfo_whenOne_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example")))
            .v1AdminUserUidDisclaimerUpdatePostWithHttpInfo("https://example.org/example", 1L, null));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidFeaturesGet(String, Long)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidFeaturesGet(String, Long)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidFeaturesGet(String, Long); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List UserApi.v1AdminUserUidFeaturesGet(String, Long)"})
  void testV1AdminUserUidFeaturesGet_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminUserUidFeaturesGet(null, 1L));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidFeaturesGet(String, Long)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidFeaturesGet(String, Long)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidFeaturesGet(String, Long); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List UserApi.v1AdminUserUidFeaturesGet(String, Long)"})
  void testV1AdminUserUidFeaturesGet_whenNull_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminUserUidFeaturesGet("ABC123", null));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidFeaturesGetWithHttpInfo(String, Long)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidFeaturesGetWithHttpInfo(String, Long)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidFeaturesGetWithHttpInfo(String, Long); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidFeaturesGetWithHttpInfo(String, Long)"})
  void testV1AdminUserUidFeaturesGetWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminUserUidFeaturesGetWithHttpInfo(null, 1L));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidFeaturesGetWithHttpInfo(String, Long)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidFeaturesGetWithHttpInfo(String, Long)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidFeaturesGetWithHttpInfo(String, Long); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidFeaturesGetWithHttpInfo(String, Long)"})
  void testV1AdminUserUidFeaturesGetWithHttpInfo_whenNull_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example")))
            .v1AdminUserUidFeaturesGetWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidFeaturesUpdatePost(String, Long, List)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidFeaturesUpdatePost(String, Long, List)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidFeaturesUpdatePost(String, Long, List); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.SuccessResponse UserApi.v1AdminUserUidFeaturesUpdatePost(String, Long, List)"})
  void testV1AdminUserUidFeaturesUpdatePost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi.v1AdminUserUidFeaturesUpdatePost(null, 1L, new ArrayList<>()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidFeaturesUpdatePost(String, Long, List)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidFeaturesUpdatePost(String, Long, List)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidFeaturesUpdatePost(String, Long, List); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.SuccessResponse UserApi.v1AdminUserUidFeaturesUpdatePost(String, Long, List)"})
  void testV1AdminUserUidFeaturesUpdatePost_whenNull_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi.v1AdminUserUidFeaturesUpdatePost("ABC123", null, new ArrayList<>()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidFeaturesUpdatePostWithHttpInfo(String, Long, List)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidFeaturesUpdatePostWithHttpInfo(String, Long, List)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidFeaturesUpdatePostWithHttpInfo(String, Long, List); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidFeaturesUpdatePostWithHttpInfo(String, Long, List)"})
  void testV1AdminUserUidFeaturesUpdatePostWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> userApi.v1AdminUserUidFeaturesUpdatePostWithHttpInfo(null, 1L, new ArrayList<>()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidFeaturesUpdatePostWithHttpInfo(String, Long, List)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidFeaturesUpdatePostWithHttpInfo(String, Long, List)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidFeaturesUpdatePostWithHttpInfo(String, Long, List); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidFeaturesUpdatePostWithHttpInfo(String, Long, List)"})
  void testV1AdminUserUidFeaturesUpdatePostWithHttpInfo_whenNull_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi
        .v1AdminUserUidFeaturesUpdatePostWithHttpInfo("https://example.org/example", null, new ArrayList<>()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidGet(String, Long)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidGet(String, Long)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidGet(String, Long); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.gen.api.model.UserDetail UserApi.v1AdminUserUidGet(String, Long)"})
  void testV1AdminUserUidGet_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class, () -> (new UserApi(new ApiClientJersey2(mock(Client.class),
        "https://example.org/example", defaultHeaders, "https://example.org/example"))).v1AdminUserUidGet(null, 1L));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidGet(String, Long)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidGet(String, Long)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidGet(String, Long); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.gen.api.model.UserDetail UserApi.v1AdminUserUidGet(String, Long)"})
  void testV1AdminUserUidGet_whenNull_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminUserUidGet("ABC123", null));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidGetWithHttpInfo(String, Long)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidGetWithHttpInfo(String, Long)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidGetWithHttpInfo(String, Long); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidGetWithHttpInfo(String, Long)"})
  void testV1AdminUserUidGetWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminUserUidGetWithHttpInfo(null, 1L));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidGetWithHttpInfo(String, Long)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidGetWithHttpInfo(String, Long)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidGetWithHttpInfo(String, Long); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidGetWithHttpInfo(String, Long)"})
  void testV1AdminUserUidGetWithHttpInfo_whenNull_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminUserUidGetWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidRolesAddPost(String, Long, StringId)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidRolesAddPost(String, Long, StringId)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidRolesAddPost(String, Long, StringId); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.SuccessResponse UserApi.v1AdminUserUidRolesAddPost(String, Long, StringId)"})
  void testV1AdminUserUidRolesAddPost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi.v1AdminUserUidRolesAddPost("ABC123", null, new StringId()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidRolesAddPost(String, Long, StringId)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidRolesAddPost(String, Long, StringId)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidRolesAddPost(String, Long, StringId); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.SuccessResponse UserApi.v1AdminUserUidRolesAddPost(String, Long, StringId)"})
  void testV1AdminUserUidRolesAddPost_whenOne_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi.v1AdminUserUidRolesAddPost(null, 1L, new StringId()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidRolesAddPost(String, Long, StringId)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidRolesAddPost(String, Long, StringId)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidRolesAddPost(String, Long, StringId); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.SuccessResponse UserApi.v1AdminUserUidRolesAddPost(String, Long, StringId)"})
  void testV1AdminUserUidRolesAddPost_whenOne_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminUserUidRolesAddPost("ABC123", 1L, null));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidRolesAddPostWithHttpInfo(String, Long, StringId)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidRolesAddPostWithHttpInfo(String, Long, StringId)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidRolesAddPostWithHttpInfo(String, Long, StringId); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidRolesAddPostWithHttpInfo(String, Long, StringId)"})
  void testV1AdminUserUidRolesAddPostWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> userApi.v1AdminUserUidRolesAddPostWithHttpInfo("https://example.org/example", null, new StringId()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidRolesAddPostWithHttpInfo(String, Long, StringId)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidRolesAddPostWithHttpInfo(String, Long, StringId)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidRolesAddPostWithHttpInfo(String, Long, StringId); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidRolesAddPostWithHttpInfo(String, Long, StringId)"})
  void testV1AdminUserUidRolesAddPostWithHttpInfo_whenOne_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi.v1AdminUserUidRolesAddPostWithHttpInfo(null, 1L, new StringId()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidRolesAddPostWithHttpInfo(String, Long, StringId)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidRolesAddPostWithHttpInfo(String, Long, StringId)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidRolesAddPostWithHttpInfo(String, Long, StringId); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidRolesAddPostWithHttpInfo(String, Long, StringId)"})
  void testV1AdminUserUidRolesAddPostWithHttpInfo_whenOne_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example")))
            .v1AdminUserUidRolesAddPostWithHttpInfo("https://example.org/example", 1L, null));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidRolesRemovePost(String, Long, StringId)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidRolesRemovePost(String, Long, StringId)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidRolesRemovePost(String, Long, StringId); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.SuccessResponse UserApi.v1AdminUserUidRolesRemovePost(String, Long, StringId)"})
  void testV1AdminUserUidRolesRemovePost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi.v1AdminUserUidRolesRemovePost("ABC123", null, new StringId()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidRolesRemovePost(String, Long, StringId)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidRolesRemovePost(String, Long, StringId)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidRolesRemovePost(String, Long, StringId); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.SuccessResponse UserApi.v1AdminUserUidRolesRemovePost(String, Long, StringId)"})
  void testV1AdminUserUidRolesRemovePost_whenOne_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi.v1AdminUserUidRolesRemovePost(null, 1L, new StringId()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidRolesRemovePost(String, Long, StringId)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidRolesRemovePost(String, Long, StringId)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidRolesRemovePost(String, Long, StringId); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.SuccessResponse UserApi.v1AdminUserUidRolesRemovePost(String, Long, StringId)"})
  void testV1AdminUserUidRolesRemovePost_whenOne_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminUserUidRolesRemovePost("ABC123", 1L, null));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidRolesRemovePostWithHttpInfo(String, Long, StringId)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidRolesRemovePostWithHttpInfo(String, Long, StringId)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidRolesRemovePostWithHttpInfo(String, Long, StringId); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidRolesRemovePostWithHttpInfo(String, Long, StringId)"})
  void testV1AdminUserUidRolesRemovePostWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> userApi.v1AdminUserUidRolesRemovePostWithHttpInfo("https://example.org/example", null, new StringId()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidRolesRemovePostWithHttpInfo(String, Long, StringId)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidRolesRemovePostWithHttpInfo(String, Long, StringId)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidRolesRemovePostWithHttpInfo(String, Long, StringId); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidRolesRemovePostWithHttpInfo(String, Long, StringId)"})
  void testV1AdminUserUidRolesRemovePostWithHttpInfo_whenOne_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi.v1AdminUserUidRolesRemovePostWithHttpInfo(null, 1L, new StringId()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidRolesRemovePostWithHttpInfo(String, Long, StringId)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidRolesRemovePostWithHttpInfo(String, Long, StringId)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidRolesRemovePostWithHttpInfo(String, Long, StringId); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidRolesRemovePostWithHttpInfo(String, Long, StringId)"})
  void testV1AdminUserUidRolesRemovePostWithHttpInfo_whenOne_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example")))
            .v1AdminUserUidRolesRemovePostWithHttpInfo("https://example.org/example", 1L, null));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidStatusGet(String, Long)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidStatusGet(String, Long)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidStatusGet(String, Long); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"UserStatus UserApi.v1AdminUserUidStatusGet(String, Long)"})
  void testV1AdminUserUidStatusGet_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminUserUidStatusGet(null, 1L));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidStatusGet(String, Long)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidStatusGet(String, Long)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidStatusGet(String, Long); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"UserStatus UserApi.v1AdminUserUidStatusGet(String, Long)"})
  void testV1AdminUserUidStatusGet_whenNull_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminUserUidStatusGet("ABC123", null));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidStatusGetWithHttpInfo(String, Long)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidStatusGetWithHttpInfo(String, Long)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidStatusGetWithHttpInfo(String, Long); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidStatusGetWithHttpInfo(String, Long)"})
  void testV1AdminUserUidStatusGetWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminUserUidStatusGetWithHttpInfo(null, 1L));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidStatusGetWithHttpInfo(String, Long)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidStatusGetWithHttpInfo(String, Long)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidStatusGetWithHttpInfo(String, Long); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidStatusGetWithHttpInfo(String, Long)"})
  void testV1AdminUserUidStatusGetWithHttpInfo_whenNull_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminUserUidStatusGetWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidStatusUpdatePost(String, Long, UserStatus)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidStatusUpdatePost(String, Long, UserStatus)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidStatusUpdatePost(String, Long, UserStatus); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.SuccessResponse UserApi.v1AdminUserUidStatusUpdatePost(String, Long, UserStatus)"})
  void testV1AdminUserUidStatusUpdatePost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi.v1AdminUserUidStatusUpdatePost("ABC123", null, new UserStatus()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidStatusUpdatePost(String, Long, UserStatus)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidStatusUpdatePost(String, Long, UserStatus)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidStatusUpdatePost(String, Long, UserStatus); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.SuccessResponse UserApi.v1AdminUserUidStatusUpdatePost(String, Long, UserStatus)"})
  void testV1AdminUserUidStatusUpdatePost_whenOne_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi.v1AdminUserUidStatusUpdatePost(null, 1L, new UserStatus()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidStatusUpdatePost(String, Long, UserStatus)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidStatusUpdatePost(String, Long, UserStatus)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidStatusUpdatePost(String, Long, UserStatus); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.SuccessResponse UserApi.v1AdminUserUidStatusUpdatePost(String, Long, UserStatus)"})
  void testV1AdminUserUidStatusUpdatePost_whenOne_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminUserUidStatusUpdatePost("ABC123", 1L, null));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidStatusUpdatePostWithHttpInfo(String, Long, UserStatus)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidStatusUpdatePostWithHttpInfo(String, Long, UserStatus)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidStatusUpdatePostWithHttpInfo(String, Long, UserStatus); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidStatusUpdatePostWithHttpInfo(String, Long, UserStatus)"})
  void testV1AdminUserUidStatusUpdatePostWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi
        .v1AdminUserUidStatusUpdatePostWithHttpInfo("https://example.org/example", null, new UserStatus()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidStatusUpdatePostWithHttpInfo(String, Long, UserStatus)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidStatusUpdatePostWithHttpInfo(String, Long, UserStatus)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidStatusUpdatePostWithHttpInfo(String, Long, UserStatus); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidStatusUpdatePostWithHttpInfo(String, Long, UserStatus)"})
  void testV1AdminUserUidStatusUpdatePostWithHttpInfo_whenOne_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> userApi.v1AdminUserUidStatusUpdatePostWithHttpInfo(null, 1L, new UserStatus()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidStatusUpdatePostWithHttpInfo(String, Long, UserStatus)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidStatusUpdatePostWithHttpInfo(String, Long, UserStatus)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidStatusUpdatePostWithHttpInfo(String, Long, UserStatus); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidStatusUpdatePostWithHttpInfo(String, Long, UserStatus)"})
  void testV1AdminUserUidStatusUpdatePostWithHttpInfo_whenOne_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example")))
            .v1AdminUserUidStatusUpdatePostWithHttpInfo("https://example.org/example", 1L, null));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidUpdatePost(String, Long, UserAttributes)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidUpdatePost(String, Long, UserAttributes)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidUpdatePost(String, Long, UserAttributes); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.UserDetail UserApi.v1AdminUserUidUpdatePost(String, Long, UserAttributes)"})
  void testV1AdminUserUidUpdatePost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi.v1AdminUserUidUpdatePost("ABC123", null, new UserAttributes()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidUpdatePost(String, Long, UserAttributes)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidUpdatePost(String, Long, UserAttributes)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidUpdatePost(String, Long, UserAttributes); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.UserDetail UserApi.v1AdminUserUidUpdatePost(String, Long, UserAttributes)"})
  void testV1AdminUserUidUpdatePost_whenOne_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi.v1AdminUserUidUpdatePost(null, 1L, new UserAttributes()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidUpdatePost(String, Long, UserAttributes)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidUpdatePost(String, Long, UserAttributes)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidUpdatePost(String, Long, UserAttributes); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.UserDetail UserApi.v1AdminUserUidUpdatePost(String, Long, UserAttributes)"})
  void testV1AdminUserUidUpdatePost_whenOne_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminUserUidUpdatePost("ABC123", 1L, null));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidUpdatePostWithHttpInfo(String, Long, UserAttributes)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidUpdatePostWithHttpInfo(String, Long, UserAttributes)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidUpdatePostWithHttpInfo(String, Long, UserAttributes); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidUpdatePostWithHttpInfo(String, Long, UserAttributes)"})
  void testV1AdminUserUidUpdatePostWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> userApi.v1AdminUserUidUpdatePostWithHttpInfo("https://example.org/example", null, new UserAttributes()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidUpdatePostWithHttpInfo(String, Long, UserAttributes)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidUpdatePostWithHttpInfo(String, Long, UserAttributes)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidUpdatePostWithHttpInfo(String, Long, UserAttributes); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidUpdatePostWithHttpInfo(String, Long, UserAttributes)"})
  void testV1AdminUserUidUpdatePostWithHttpInfo_whenOne_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> userApi.v1AdminUserUidUpdatePostWithHttpInfo(null, 1L, new UserAttributes()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUidUpdatePostWithHttpInfo(String, Long, UserAttributes)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUidUpdatePostWithHttpInfo(String, Long, UserAttributes)}
   */
  @Test
  @DisplayName("Test v1AdminUserUidUpdatePostWithHttpInfo(String, Long, UserAttributes); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUidUpdatePostWithHttpInfo(String, Long, UserAttributes)"})
  void testV1AdminUserUidUpdatePostWithHttpInfo_whenOne_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example")))
            .v1AdminUserUidUpdatePostWithHttpInfo("https://example.org/example", 1L, null));
  }

  /**
   * Test {@link UserApi#v1AdminUserUserIdSuspensionUpdatePut(String, Long, UserSuspension)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUserIdSuspensionUpdatePut(String, Long, UserSuspension)}
   */
  @Test
  @DisplayName("Test v1AdminUserUserIdSuspensionUpdatePut(String, Long, UserSuspension); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.SuccessResponse UserApi.v1AdminUserUserIdSuspensionUpdatePut(String, Long, UserSuspension)"})
  void testV1AdminUserUserIdSuspensionUpdatePut_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> userApi.v1AdminUserUserIdSuspensionUpdatePut("ABC123", null, new UserSuspension()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUserIdSuspensionUpdatePut(String, Long, UserSuspension)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUserIdSuspensionUpdatePut(String, Long, UserSuspension)}
   */
  @Test
  @DisplayName("Test v1AdminUserUserIdSuspensionUpdatePut(String, Long, UserSuspension); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.SuccessResponse UserApi.v1AdminUserUserIdSuspensionUpdatePut(String, Long, UserSuspension)"})
  void testV1AdminUserUserIdSuspensionUpdatePut_whenOne_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> userApi.v1AdminUserUserIdSuspensionUpdatePut(null, 1L, new UserSuspension()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUserIdSuspensionUpdatePut(String, Long, UserSuspension)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUserIdSuspensionUpdatePut(String, Long, UserSuspension)}
   */
  @Test
  @DisplayName("Test v1AdminUserUserIdSuspensionUpdatePut(String, Long, UserSuspension); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.SuccessResponse UserApi.v1AdminUserUserIdSuspensionUpdatePut(String, Long, UserSuspension)"})
  void testV1AdminUserUserIdSuspensionUpdatePut_whenOne_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AdminUserUserIdSuspensionUpdatePut("ABC123", 1L, null));
  }

  /**
   * Test {@link UserApi#v1AdminUserUserIdSuspensionUpdatePutWithHttpInfo(String, Long, UserSuspension)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUserIdSuspensionUpdatePutWithHttpInfo(String, Long, UserSuspension)}
   */
  @Test
  @DisplayName("Test v1AdminUserUserIdSuspensionUpdatePutWithHttpInfo(String, Long, UserSuspension); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUserIdSuspensionUpdatePutWithHttpInfo(String, Long, UserSuspension)"})
  void testV1AdminUserUserIdSuspensionUpdatePutWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> userApi.v1AdminUserUserIdSuspensionUpdatePutWithHttpInfo(null, 1L, new UserSuspension()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUserIdSuspensionUpdatePutWithHttpInfo(String, Long, UserSuspension)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUserIdSuspensionUpdatePutWithHttpInfo(String, Long, UserSuspension)}
   */
  @Test
  @DisplayName("Test v1AdminUserUserIdSuspensionUpdatePutWithHttpInfo(String, Long, UserSuspension); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUserIdSuspensionUpdatePutWithHttpInfo(String, Long, UserSuspension)"})
  void testV1AdminUserUserIdSuspensionUpdatePutWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi
        .v1AdminUserUserIdSuspensionUpdatePutWithHttpInfo("https://example.org/example", null, new UserSuspension()));
  }

  /**
   * Test {@link UserApi#v1AdminUserUserIdSuspensionUpdatePutWithHttpInfo(String, Long, UserSuspension)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1AdminUserUserIdSuspensionUpdatePutWithHttpInfo(String, Long, UserSuspension)}
   */
  @Test
  @DisplayName("Test v1AdminUserUserIdSuspensionUpdatePutWithHttpInfo(String, Long, UserSuspension); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1AdminUserUserIdSuspensionUpdatePutWithHttpInfo(String, Long, UserSuspension)"})
  void testV1AdminUserUserIdSuspensionUpdatePutWithHttpInfo_thenThrowApiException3() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example")))
            .v1AdminUserUserIdSuspensionUpdatePutWithHttpInfo("https://example.org/example", 1L, null));
  }

  /**
   * Test {@link UserApi#v1UserUidFollowPost(String, Long, FollowersList)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1UserUidFollowPost(String, Long, FollowersList)}
   */
  @Test
  @DisplayName("Test v1UserUidFollowPost(String, Long, FollowersList); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.SuccessResponse UserApi.v1UserUidFollowPost(String, Long, FollowersList)"})
  void testV1UserUidFollowPost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi.v1UserUidFollowPost("ABC123", null, new FollowersList()));
  }

  /**
   * Test {@link UserApi#v1UserUidFollowPost(String, Long, FollowersList)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1UserUidFollowPost(String, Long, FollowersList)}
   */
  @Test
  @DisplayName("Test v1UserUidFollowPost(String, Long, FollowersList); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.SuccessResponse UserApi.v1UserUidFollowPost(String, Long, FollowersList)"})
  void testV1UserUidFollowPost_whenOne_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi.v1UserUidFollowPost(null, 1L, new FollowersList()));
  }

  /**
   * Test {@link UserApi#v1UserUidFollowPost(String, Long, FollowersList)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1UserUidFollowPost(String, Long, FollowersList)}
   */
  @Test
  @DisplayName("Test v1UserUidFollowPost(String, Long, FollowersList); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.SuccessResponse UserApi.v1UserUidFollowPost(String, Long, FollowersList)"})
  void testV1UserUidFollowPost_whenOne_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1UserUidFollowPost("ABC123", 1L, null));
  }

  /**
   * Test {@link UserApi#v1UserUidFollowPostWithHttpInfo(String, Long, FollowersList)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1UserUidFollowPostWithHttpInfo(String, Long, FollowersList)}
   */
  @Test
  @DisplayName("Test v1UserUidFollowPostWithHttpInfo(String, Long, FollowersList); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1UserUidFollowPostWithHttpInfo(String, Long, FollowersList)"})
  void testV1UserUidFollowPostWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> userApi.v1UserUidFollowPostWithHttpInfo("https://example.org/example", null, new FollowersList()));
  }

  /**
   * Test {@link UserApi#v1UserUidFollowPostWithHttpInfo(String, Long, FollowersList)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1UserUidFollowPostWithHttpInfo(String, Long, FollowersList)}
   */
  @Test
  @DisplayName("Test v1UserUidFollowPostWithHttpInfo(String, Long, FollowersList); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1UserUidFollowPostWithHttpInfo(String, Long, FollowersList)"})
  void testV1UserUidFollowPostWithHttpInfo_whenOne_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi.v1UserUidFollowPostWithHttpInfo(null, 1L, new FollowersList()));
  }

  /**
   * Test {@link UserApi#v1UserUidFollowPostWithHttpInfo(String, Long, FollowersList)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1UserUidFollowPostWithHttpInfo(String, Long, FollowersList)}
   */
  @Test
  @DisplayName("Test v1UserUidFollowPostWithHttpInfo(String, Long, FollowersList); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1UserUidFollowPostWithHttpInfo(String, Long, FollowersList)"})
  void testV1UserUidFollowPostWithHttpInfo_whenOne_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1UserUidFollowPostWithHttpInfo("https://example.org/example", 1L, null));
  }

  /**
   * Test {@link UserApi#v1UserUidFollowersGet(String, Long, Integer, String, String)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1UserUidFollowersGet(String, Long, Integer, String, String)}
   */
  @Test
  @DisplayName("Test v1UserUidFollowersGet(String, Long, Integer, String, String); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"FollowersListResponse UserApi.v1UserUidFollowersGet(String, Long, Integer, String, String)"})
  void testV1UserUidFollowersGet_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1UserUidFollowersGet(null, 1L, 1, "Before", "After"));
  }

  /**
   * Test {@link UserApi#v1UserUidFollowersGet(String, Long, Integer, String, String)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1UserUidFollowersGet(String, Long, Integer, String, String)}
   */
  @Test
  @DisplayName("Test v1UserUidFollowersGet(String, Long, Integer, String, String); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"FollowersListResponse UserApi.v1UserUidFollowersGet(String, Long, Integer, String, String)"})
  void testV1UserUidFollowersGet_whenNull_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1UserUidFollowersGet("ABC123", null, 1, "Before", "After"));
  }

  /**
   * Test {@link UserApi#v1UserUidFollowersGetWithHttpInfo(String, Long, Integer, String, String)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1UserUidFollowersGetWithHttpInfo(String, Long, Integer, String, String)}
   */
  @Test
  @DisplayName("Test v1UserUidFollowersGetWithHttpInfo(String, Long, Integer, String, String); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1UserUidFollowersGetWithHttpInfo(String, Long, Integer, String, String)"})
  void testV1UserUidFollowersGetWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1UserUidFollowersGetWithHttpInfo(null, 1L, 1,
                "https://example.org/example", "https://example.org/example"));
  }

  /**
   * Test {@link UserApi#v1UserUidFollowersGetWithHttpInfo(String, Long, Integer, String, String)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1UserUidFollowersGetWithHttpInfo(String, Long, Integer, String, String)}
   */
  @Test
  @DisplayName("Test v1UserUidFollowersGetWithHttpInfo(String, Long, Integer, String, String); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1UserUidFollowersGetWithHttpInfo(String, Long, Integer, String, String)"})
  void testV1UserUidFollowersGetWithHttpInfo_whenNull_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1UserUidFollowersGetWithHttpInfo("https://example.org/example", null, 1,
                "https://example.org/example", "https://example.org/example"));
  }

  /**
   * Test {@link UserApi#v1UserUidFollowingGet(String, Long, Integer, String, String)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1UserUidFollowingGet(String, Long, Integer, String, String)}
   */
  @Test
  @DisplayName("Test v1UserUidFollowingGet(String, Long, Integer, String, String); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.FollowingListResponse UserApi.v1UserUidFollowingGet(String, Long, Integer, String, String)"})
  void testV1UserUidFollowingGet_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1UserUidFollowingGet(null, 1L, 1, "Before", "After"));
  }

  /**
   * Test {@link UserApi#v1UserUidFollowingGet(String, Long, Integer, String, String)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1UserUidFollowingGet(String, Long, Integer, String, String)}
   */
  @Test
  @DisplayName("Test v1UserUidFollowingGet(String, Long, Integer, String, String); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.FollowingListResponse UserApi.v1UserUidFollowingGet(String, Long, Integer, String, String)"})
  void testV1UserUidFollowingGet_whenNull_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1UserUidFollowingGet("ABC123", null, 1, "Before", "After"));
  }

  /**
   * Test {@link UserApi#v1UserUidFollowingGetWithHttpInfo(String, Long, Integer, String, String)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1UserUidFollowingGetWithHttpInfo(String, Long, Integer, String, String)}
   */
  @Test
  @DisplayName("Test v1UserUidFollowingGetWithHttpInfo(String, Long, Integer, String, String); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1UserUidFollowingGetWithHttpInfo(String, Long, Integer, String, String)"})
  void testV1UserUidFollowingGetWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1UserUidFollowingGetWithHttpInfo(null, 1L, 1,
                "https://example.org/example", "https://example.org/example"));
  }

  /**
   * Test {@link UserApi#v1UserUidFollowingGetWithHttpInfo(String, Long, Integer, String, String)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1UserUidFollowingGetWithHttpInfo(String, Long, Integer, String, String)}
   */
  @Test
  @DisplayName("Test v1UserUidFollowingGetWithHttpInfo(String, Long, Integer, String, String); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1UserUidFollowingGetWithHttpInfo(String, Long, Integer, String, String)"})
  void testV1UserUidFollowingGetWithHttpInfo_whenNull_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1UserUidFollowingGetWithHttpInfo("https://example.org/example", null, 1,
                "https://example.org/example", "https://example.org/example"));
  }

  /**
   * Test {@link UserApi#v1UserUidUnfollowPost(String, Long, FollowersList)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1UserUidUnfollowPost(String, Long, FollowersList)}
   */
  @Test
  @DisplayName("Test v1UserUidUnfollowPost(String, Long, FollowersList); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.SuccessResponse UserApi.v1UserUidUnfollowPost(String, Long, FollowersList)"})
  void testV1UserUidUnfollowPost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi.v1UserUidUnfollowPost("ABC123", null, new FollowersList()));
  }

  /**
   * Test {@link UserApi#v1UserUidUnfollowPost(String, Long, FollowersList)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1UserUidUnfollowPost(String, Long, FollowersList)}
   */
  @Test
  @DisplayName("Test v1UserUidUnfollowPost(String, Long, FollowersList); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.SuccessResponse UserApi.v1UserUidUnfollowPost(String, Long, FollowersList)"})
  void testV1UserUidUnfollowPost_whenOne_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi.v1UserUidUnfollowPost(null, 1L, new FollowersList()));
  }

  /**
   * Test {@link UserApi#v1UserUidUnfollowPost(String, Long, FollowersList)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1UserUidUnfollowPost(String, Long, FollowersList)}
   */
  @Test
  @DisplayName("Test v1UserUidUnfollowPost(String, Long, FollowersList); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.SuccessResponse UserApi.v1UserUidUnfollowPost(String, Long, FollowersList)"})
  void testV1UserUidUnfollowPost_whenOne_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1UserUidUnfollowPost("ABC123", 1L, null));
  }

  /**
   * Test {@link UserApi#v1UserUidUnfollowPostWithHttpInfo(String, Long, FollowersList)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1UserUidUnfollowPostWithHttpInfo(String, Long, FollowersList)}
   */
  @Test
  @DisplayName("Test v1UserUidUnfollowPostWithHttpInfo(String, Long, FollowersList); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1UserUidUnfollowPostWithHttpInfo(String, Long, FollowersList)"})
  void testV1UserUidUnfollowPostWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> userApi.v1UserUidUnfollowPostWithHttpInfo("https://example.org/example", null, new FollowersList()));
  }

  /**
   * Test {@link UserApi#v1UserUidUnfollowPostWithHttpInfo(String, Long, FollowersList)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1UserUidUnfollowPostWithHttpInfo(String, Long, FollowersList)}
   */
  @Test
  @DisplayName("Test v1UserUidUnfollowPostWithHttpInfo(String, Long, FollowersList); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1UserUidUnfollowPostWithHttpInfo(String, Long, FollowersList)"})
  void testV1UserUidUnfollowPostWithHttpInfo_whenOne_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi.v1UserUidUnfollowPostWithHttpInfo(null, 1L, new FollowersList()));
  }

  /**
   * Test {@link UserApi#v1UserUidUnfollowPostWithHttpInfo(String, Long, FollowersList)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v1UserUidUnfollowPostWithHttpInfo(String, Long, FollowersList)}
   */
  @Test
  @DisplayName("Test v1UserUidUnfollowPostWithHttpInfo(String, Long, FollowersList); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v1UserUidUnfollowPostWithHttpInfo(String, Long, FollowersList)"})
  void testV1UserUidUnfollowPostWithHttpInfo_whenOne_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example")))
            .v1UserUidUnfollowPostWithHttpInfo("https://example.org/example", 1L, null));
  }

  /**
   * Test {@link UserApi#v2AdminUserCreatePost(String, V2UserCreate)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v2AdminUserCreatePost(String, V2UserCreate)}
   */
  @Test
  @DisplayName("Test v2AdminUserCreatePost(String, V2UserCreate); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.gen.api.model.V2UserDetail UserApi.v2AdminUserCreatePost(String, V2UserCreate)"})
  void testV2AdminUserCreatePost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi.v2AdminUserCreatePost(null, new V2UserCreate()));
  }

  /**
   * Test {@link UserApi#v2AdminUserCreatePost(String, V2UserCreate)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v2AdminUserCreatePost(String, V2UserCreate)}
   */
  @Test
  @DisplayName("Test v2AdminUserCreatePost(String, V2UserCreate); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.gen.api.model.V2UserDetail UserApi.v2AdminUserCreatePost(String, V2UserCreate)"})
  void testV2AdminUserCreatePost_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v2AdminUserCreatePost("ABC123", null));
  }

  /**
   * Test {@link UserApi#v2AdminUserCreatePostWithHttpInfo(String, V2UserCreate)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v2AdminUserCreatePostWithHttpInfo(String, V2UserCreate)}
   */
  @Test
  @DisplayName("Test v2AdminUserCreatePostWithHttpInfo(String, V2UserCreate); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v2AdminUserCreatePostWithHttpInfo(String, V2UserCreate)"})
  void testV2AdminUserCreatePostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi.v2AdminUserCreatePostWithHttpInfo(null, new V2UserCreate()));
  }

  /**
   * Test {@link UserApi#v2AdminUserCreatePostWithHttpInfo(String, V2UserCreate)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v2AdminUserCreatePostWithHttpInfo(String, V2UserCreate)}
   */
  @Test
  @DisplayName("Test v2AdminUserCreatePostWithHttpInfo(String, V2UserCreate); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v2AdminUserCreatePostWithHttpInfo(String, V2UserCreate)"})
  void testV2AdminUserCreatePostWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v2AdminUserCreatePostWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link UserApi#v2AdminUserListGet(String, Integer, Integer)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v2AdminUserListGet(String, Integer, Integer)}
   */
  @Test
  @DisplayName("Test v2AdminUserListGet(String, Integer, Integer); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List UserApi.v2AdminUserListGet(String, Integer, Integer)"})
  void testV2AdminUserListGet_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class, () -> (new UserApi(new ApiClientJersey2(mock(Client.class),
        "https://example.org/example", defaultHeaders, "https://example.org/example"))).v2AdminUserListGet(null, 1, 1));
  }

  /**
   * Test {@link UserApi#v2AdminUserListGetWithHttpInfo(String, Integer, Integer)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v2AdminUserListGetWithHttpInfo(String, Integer, Integer)}
   */
  @Test
  @DisplayName("Test v2AdminUserListGetWithHttpInfo(String, Integer, Integer); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v2AdminUserListGetWithHttpInfo(String, Integer, Integer)"})
  void testV2AdminUserListGetWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v2AdminUserListGetWithHttpInfo(null, 1, 1));
  }

  /**
   * Test {@link UserApi#v2AdminUserUidGet(String, Long)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v2AdminUserUidGet(String, Long)}
   */
  @Test
  @DisplayName("Test v2AdminUserUidGet(String, Long); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.gen.api.model.V2UserDetail UserApi.v2AdminUserUidGet(String, Long)"})
  void testV2AdminUserUidGet_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class, () -> (new UserApi(new ApiClientJersey2(mock(Client.class),
        "https://example.org/example", defaultHeaders, "https://example.org/example"))).v2AdminUserUidGet(null, 1L));
  }

  /**
   * Test {@link UserApi#v2AdminUserUidGet(String, Long)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v2AdminUserUidGet(String, Long)}
   */
  @Test
  @DisplayName("Test v2AdminUserUidGet(String, Long); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.gen.api.model.V2UserDetail UserApi.v2AdminUserUidGet(String, Long)"})
  void testV2AdminUserUidGet_whenNull_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v2AdminUserUidGet("ABC123", null));
  }

  /**
   * Test {@link UserApi#v2AdminUserUidGetWithHttpInfo(String, Long)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v2AdminUserUidGetWithHttpInfo(String, Long)}
   */
  @Test
  @DisplayName("Test v2AdminUserUidGetWithHttpInfo(String, Long); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.http.api.ApiResponse UserApi.v2AdminUserUidGetWithHttpInfo(String, Long)"})
  void testV2AdminUserUidGetWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v2AdminUserUidGetWithHttpInfo(null, 1L));
  }

  /**
   * Test {@link UserApi#v2AdminUserUidGetWithHttpInfo(String, Long)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v2AdminUserUidGetWithHttpInfo(String, Long)}
   */
  @Test
  @DisplayName("Test v2AdminUserUidGetWithHttpInfo(String, Long); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.http.api.ApiResponse UserApi.v2AdminUserUidGetWithHttpInfo(String, Long)"})
  void testV2AdminUserUidGetWithHttpInfo_whenNull_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v2AdminUserUidGetWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link UserApi#v2AdminUserUidUpdatePost(String, Long, V2UserAttributes)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v2AdminUserUidUpdatePost(String, Long, V2UserAttributes)}
   */
  @Test
  @DisplayName("Test v2AdminUserUidUpdatePost(String, Long, V2UserAttributes); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V2UserDetail UserApi.v2AdminUserUidUpdatePost(String, Long, V2UserAttributes)"})
  void testV2AdminUserUidUpdatePost_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi.v2AdminUserUidUpdatePost("ABC123", null, new V2UserAttributes()));
  }

  /**
   * Test {@link UserApi#v2AdminUserUidUpdatePost(String, Long, V2UserAttributes)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v2AdminUserUidUpdatePost(String, Long, V2UserAttributes)}
   */
  @Test
  @DisplayName("Test v2AdminUserUidUpdatePost(String, Long, V2UserAttributes); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V2UserDetail UserApi.v2AdminUserUidUpdatePost(String, Long, V2UserAttributes)"})
  void testV2AdminUserUidUpdatePost_whenOne_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi.v2AdminUserUidUpdatePost(null, 1L, new V2UserAttributes()));
  }

  /**
   * Test {@link UserApi#v2AdminUserUidUpdatePost(String, Long, V2UserAttributes)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v2AdminUserUidUpdatePost(String, Long, V2UserAttributes)}
   */
  @Test
  @DisplayName("Test v2AdminUserUidUpdatePost(String, Long, V2UserAttributes); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V2UserDetail UserApi.v2AdminUserUidUpdatePost(String, Long, V2UserAttributes)"})
  void testV2AdminUserUidUpdatePost_whenOne_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v2AdminUserUidUpdatePost("ABC123", 1L, null));
  }

  /**
   * Test {@link UserApi#v2AdminUserUidUpdatePostWithHttpInfo(String, Long, V2UserAttributes)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v2AdminUserUidUpdatePostWithHttpInfo(String, Long, V2UserAttributes)}
   */
  @Test
  @DisplayName("Test v2AdminUserUidUpdatePostWithHttpInfo(String, Long, V2UserAttributes); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v2AdminUserUidUpdatePostWithHttpInfo(String, Long, V2UserAttributes)"})
  void testV2AdminUserUidUpdatePostWithHttpInfo_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> userApi.v2AdminUserUidUpdatePostWithHttpInfo("https://example.org/example",
        null, new V2UserAttributes()));
  }

  /**
   * Test {@link UserApi#v2AdminUserUidUpdatePostWithHttpInfo(String, Long, V2UserAttributes)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v2AdminUserUidUpdatePostWithHttpInfo(String, Long, V2UserAttributes)}
   */
  @Test
  @DisplayName("Test v2AdminUserUidUpdatePostWithHttpInfo(String, Long, V2UserAttributes); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v2AdminUserUidUpdatePostWithHttpInfo(String, Long, V2UserAttributes)"})
  void testV2AdminUserUidUpdatePostWithHttpInfo_whenOne_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    UserApi userApi = new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class,
        () -> userApi.v2AdminUserUidUpdatePostWithHttpInfo(null, 1L, new V2UserAttributes()));
  }

  /**
   * Test {@link UserApi#v2AdminUserUidUpdatePostWithHttpInfo(String, Long, V2UserAttributes)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v2AdminUserUidUpdatePostWithHttpInfo(String, Long, V2UserAttributes)}
   */
  @Test
  @DisplayName("Test v2AdminUserUidUpdatePostWithHttpInfo(String, Long, V2UserAttributes); when one; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v2AdminUserUidUpdatePostWithHttpInfo(String, Long, V2UserAttributes)"})
  void testV2AdminUserUidUpdatePostWithHttpInfo_whenOne_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example")))
            .v2AdminUserUidUpdatePostWithHttpInfo("https://example.org/example", 1L, null));
  }

  /**
   * Test {@link UserApi#v3AdminUserListGet(String, Integer, Integer, Boolean)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v3AdminUserListGet(String, Integer, Integer, Boolean)}
   */
  @Test
  @DisplayName("Test v3AdminUserListGet(String, Integer, Integer, Boolean); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List UserApi.v3AdminUserListGet(String, Integer, Integer, Boolean)"})
  void testV3AdminUserListGet_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v3AdminUserListGet(null, 1, 1, true));
  }

  /**
   * Test {@link UserApi#v3AdminUserListGetWithHttpInfo(String, Integer, Integer, Boolean)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserApi#v3AdminUserListGetWithHttpInfo(String, Integer, Integer, Boolean)}
   */
  @Test
  @DisplayName("Test v3AdminUserListGetWithHttpInfo(String, Integer, Integer, Boolean); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse UserApi.v3AdminUserListGetWithHttpInfo(String, Integer, Integer, Boolean)"})
  void testV3AdminUserListGetWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new UserApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v3AdminUserListGetWithHttpInfo(null, 1, 1, true));
  }
}
