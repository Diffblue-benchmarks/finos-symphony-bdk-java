package com.symphony.bdk.ext.group.gen.api;

import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.ext.group.gen.api.model.AddMember;
import com.symphony.bdk.ext.group.gen.api.model.CreateGroup;
import com.symphony.bdk.ext.group.gen.api.model.SortOrder;
import com.symphony.bdk.ext.group.gen.api.model.Status;
import com.symphony.bdk.ext.group.gen.api.model.UpdateGroup;
import com.symphony.bdk.ext.group.gen.api.model.UploadAvatar;
import com.symphony.bdk.http.api.ApiException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class GroupApiDiffblueTest {
  /**
   * Test {@link GroupApi#addMemberToGroup(String, String, AddMember)}.
   * <ul>
   *   <li>Given {@link GroupApi#GroupApi(ApiClient)} with apiClient is {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupApi#addMemberToGroup(String, String, AddMember)}
   */
  @Test
  @DisplayName("Test addMemberToGroup(String, String, AddMember); given GroupApi(ApiClient) with apiClient is 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.ext.group.gen.api.model.ReadGroup GroupApi.addMemberToGroup(String, String, AddMember)"})
  void testAddMemberToGroup_givenGroupApiWithApiClientIsNull_thenThrowApiException() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class, () -> (new GroupApi(null)).addMemberToGroup("localhost", "42", null));
  }

  /**
   * Test {@link GroupApi#addMemberToGroup(String, String, AddMember)}.
   * <ul>
   *   <li>Given {@link GroupApi#GroupApi(ApiClient)} with apiClient is {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupApi#addMemberToGroup(String, String, AddMember)}
   */
  @Test
  @DisplayName("Test addMemberToGroup(String, String, AddMember); given GroupApi(ApiClient) with apiClient is 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.ext.group.gen.api.model.ReadGroup GroupApi.addMemberToGroup(String, String, AddMember)"})
  void testAddMemberToGroup_givenGroupApiWithApiClientIsNull_thenThrowApiException2() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class, () -> (new GroupApi(null)).addMemberToGroup(null, null, null));
  }

  /**
   * Test {@link GroupApi#addMemberToGroup(String, String, AddMember)}.
   * <ul>
   *   <li>Given {@link GroupApi#GroupApi(ApiClient)} with apiClient is {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupApi#addMemberToGroup(String, String, AddMember)}
   */
  @Test
  @DisplayName("Test addMemberToGroup(String, String, AddMember); given GroupApi(ApiClient) with apiClient is 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.ext.group.gen.api.model.ReadGroup GroupApi.addMemberToGroup(String, String, AddMember)"})
  void testAddMemberToGroup_givenGroupApiWithApiClientIsNull_thenThrowApiException3() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class, () -> (new GroupApi(null)).addMemberToGroup("localhost", null, null));
  }

  /**
   * Test {@link GroupApi#addMemberToGroupWithHttpInfo(String, String, AddMember)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupApi#addMemberToGroupWithHttpInfo(String, String, AddMember)}
   */
  @Test
  @DisplayName("Test addMemberToGroupWithHttpInfo(String, String, AddMember); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse GroupApi.addMemberToGroupWithHttpInfo(String, String, AddMember)"})
  void testAddMemberToGroupWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class, () -> (new GroupApi(null))
        .addMemberToGroupWithHttpInfo("https://example.org/example", "https://example.org/example", null));
  }

  /**
   * Test {@link GroupApi#addMemberToGroupWithHttpInfo(String, String, AddMember)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupApi#addMemberToGroupWithHttpInfo(String, String, AddMember)}
   */
  @Test
  @DisplayName("Test addMemberToGroupWithHttpInfo(String, String, AddMember); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse GroupApi.addMemberToGroupWithHttpInfo(String, String, AddMember)"})
  void testAddMemberToGroupWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class, () -> (new GroupApi(null)).addMemberToGroupWithHttpInfo(null, null, null));
  }

  /**
   * Test {@link GroupApi#addMemberToGroupWithHttpInfo(String, String, AddMember)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupApi#addMemberToGroupWithHttpInfo(String, String, AddMember)}
   */
  @Test
  @DisplayName("Test addMemberToGroupWithHttpInfo(String, String, AddMember); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse GroupApi.addMemberToGroupWithHttpInfo(String, String, AddMember)"})
  void testAddMemberToGroupWithHttpInfo_thenThrowApiException3() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class,
        () -> (new GroupApi(null)).addMemberToGroupWithHttpInfo("https://example.org/example", null, null));
  }

  /**
   * Test {@link GroupApi#deleteAllGroups(String)}.
   * <ul>
   *   <li>Given {@link GroupApi#GroupApi(ApiClient)} with apiClient is {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupApi#deleteAllGroups(String)}
   */
  @Test
  @DisplayName("Test deleteAllGroups(String); given GroupApi(ApiClient) with apiClient is 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.ext.group.gen.api.model.GroupList GroupApi.deleteAllGroups(String)"})
  void testDeleteAllGroups_givenGroupApiWithApiClientIsNull_thenThrowApiException() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class, () -> (new GroupApi(null)).deleteAllGroups(null));
  }

  /**
   * Test {@link GroupApi#deleteAllGroupsWithHttpInfo(String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupApi#deleteAllGroupsWithHttpInfo(String)}
   */
  @Test
  @DisplayName("Test deleteAllGroupsWithHttpInfo(String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.http.api.ApiResponse GroupApi.deleteAllGroupsWithHttpInfo(String)"})
  void testDeleteAllGroupsWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class, () -> (new GroupApi(null)).deleteAllGroupsWithHttpInfo(null));
  }

  /**
   * Test {@link GroupApi#getGroup(String, String)}.
   * <ul>
   *   <li>Given {@link GroupApi#GroupApi(ApiClient)} with apiClient is {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupApi#getGroup(String, String)}
   */
  @Test
  @DisplayName("Test getGroup(String, String); given GroupApi(ApiClient) with apiClient is 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.ext.group.gen.api.model.ReadGroup GroupApi.getGroup(String, String)"})
  void testGetGroup_givenGroupApiWithApiClientIsNull_thenThrowApiException() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class, () -> (new GroupApi(null)).getGroup("localhost", null));
  }

  /**
   * Test {@link GroupApi#getGroup(String, String)}.
   * <ul>
   *   <li>Given {@link GroupApi#GroupApi(ApiClient)} with apiClient is {@code null}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupApi#getGroup(String, String)}
   */
  @Test
  @DisplayName("Test getGroup(String, String); given GroupApi(ApiClient) with apiClient is 'null'; when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.ext.group.gen.api.model.ReadGroup GroupApi.getGroup(String, String)"})
  void testGetGroup_givenGroupApiWithApiClientIsNull_whenNull_thenThrowApiException() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class, () -> (new GroupApi(null)).getGroup(null, null));
  }

  /**
   * Test {@link GroupApi#getGroupWithHttpInfo(String, String)}.
   * <ul>
   *   <li>Given {@link GroupApi#GroupApi(ApiClient)} with apiClient is {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupApi#getGroupWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName("Test getGroupWithHttpInfo(String, String); given GroupApi(ApiClient) with apiClient is 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.http.api.ApiResponse GroupApi.getGroupWithHttpInfo(String, String)"})
  void testGetGroupWithHttpInfo_givenGroupApiWithApiClientIsNull_thenThrowApiException() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class, () -> (new GroupApi(null)).getGroupWithHttpInfo(null, null));
  }

  /**
   * Test {@link GroupApi#getGroupWithHttpInfo(String, String)}.
   * <ul>
   *   <li>Given {@link GroupApi#GroupApi(ApiClient)} with apiClient is {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupApi#getGroupWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName("Test getGroupWithHttpInfo(String, String); given GroupApi(ApiClient) with apiClient is 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.http.api.ApiResponse GroupApi.getGroupWithHttpInfo(String, String)"})
  void testGetGroupWithHttpInfo_givenGroupApiWithApiClientIsNull_thenThrowApiException2() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class,
        () -> (new GroupApi(null)).getGroupWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link GroupApi#insertGroup(String, CreateGroup)}.
   * <ul>
   *   <li>Given {@link GroupApi#GroupApi(ApiClient)} with apiClient is {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupApi#insertGroup(String, CreateGroup)}
   */
  @Test
  @DisplayName("Test insertGroup(String, CreateGroup); given GroupApi(ApiClient) with apiClient is 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.ext.group.gen.api.model.ReadGroup GroupApi.insertGroup(String, CreateGroup)"})
  void testInsertGroup_givenGroupApiWithApiClientIsNull_thenThrowApiException() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class, () -> (new GroupApi(null)).insertGroup("localhost", null));
  }

  /**
   * Test {@link GroupApi#insertGroup(String, CreateGroup)}.
   * <ul>
   *   <li>Given {@link GroupApi#GroupApi(ApiClient)} with apiClient is {@code null}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupApi#insertGroup(String, CreateGroup)}
   */
  @Test
  @DisplayName("Test insertGroup(String, CreateGroup); given GroupApi(ApiClient) with apiClient is 'null'; when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.ext.group.gen.api.model.ReadGroup GroupApi.insertGroup(String, CreateGroup)"})
  void testInsertGroup_givenGroupApiWithApiClientIsNull_whenNull_thenThrowApiException() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class, () -> (new GroupApi(null)).insertGroup(null, null));
  }

  /**
   * Test {@link GroupApi#insertGroupWithHttpInfo(String, CreateGroup)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupApi#insertGroupWithHttpInfo(String, CreateGroup)}
   */
  @Test
  @DisplayName("Test insertGroupWithHttpInfo(String, CreateGroup); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.http.api.ApiResponse GroupApi.insertGroupWithHttpInfo(String, CreateGroup)"})
  void testInsertGroupWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class,
        () -> (new GroupApi(null)).insertGroupWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link GroupApi#insertGroupWithHttpInfo(String, CreateGroup)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupApi#insertGroupWithHttpInfo(String, CreateGroup)}
   */
  @Test
  @DisplayName("Test insertGroupWithHttpInfo(String, CreateGroup); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.http.api.ApiResponse GroupApi.insertGroupWithHttpInfo(String, CreateGroup)"})
  void testInsertGroupWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class, () -> (new GroupApi(null)).insertGroupWithHttpInfo(null, null));
  }

  /**
   * Test {@link GroupApi#listGroups(String, String, Status, String, String, Integer, SortOrder)}.
   * <ul>
   *   <li>Given {@link GroupApi#GroupApi(ApiClient)} with apiClient is {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupApi#listGroups(String, String, Status, String, String, Integer, SortOrder)}
   */
  @Test
  @DisplayName("Test listGroups(String, String, Status, String, String, Integer, SortOrder); given GroupApi(ApiClient) with apiClient is 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.ext.group.gen.api.model.GroupList GroupApi.listGroups(String, String, Status, String, String, Integer, SortOrder)"})
  void testListGroups_givenGroupApiWithApiClientIsNull_thenThrowApiException() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class,
        () -> (new GroupApi(null)).listGroups("localhost", null, Status.ACTIVE, "Before", "After", 1, SortOrder.ASC));
  }

  /**
   * Test {@link GroupApi#listGroups(String, String, Status, String, String, Integer, SortOrder)}.
   * <ul>
   *   <li>Given {@link GroupApi#GroupApi(ApiClient)} with apiClient is {@code null}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupApi#listGroups(String, String, Status, String, String, Integer, SortOrder)}
   */
  @Test
  @DisplayName("Test listGroups(String, String, Status, String, String, Integer, SortOrder); given GroupApi(ApiClient) with apiClient is 'null'; when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.ext.group.gen.api.model.GroupList GroupApi.listGroups(String, String, Status, String, String, Integer, SortOrder)"})
  void testListGroups_givenGroupApiWithApiClientIsNull_whenNull_thenThrowApiException() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class,
        () -> (new GroupApi(null)).listGroups(null, null, Status.ACTIVE, "Before", "After", 1, SortOrder.ASC));
  }

  /**
   * Test {@link GroupApi#listGroupsWithHttpInfo(String, String, Status, String, String, Integer, SortOrder)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupApi#listGroupsWithHttpInfo(String, String, Status, String, String, Integer, SortOrder)}
   */
  @Test
  @DisplayName("Test listGroupsWithHttpInfo(String, String, Status, String, String, Integer, SortOrder); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse GroupApi.listGroupsWithHttpInfo(String, String, Status, String, String, Integer, SortOrder)"})
  void testListGroupsWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class, () -> (new GroupApi(null)).listGroupsWithHttpInfo(null, null, Status.ACTIVE,
        "https://example.org/example", "https://example.org/example", 1, SortOrder.ASC));
  }

  /**
   * Test {@link GroupApi#listGroupsWithHttpInfo(String, String, Status, String, String, Integer, SortOrder)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupApi#listGroupsWithHttpInfo(String, String, Status, String, String, Integer, SortOrder)}
   */
  @Test
  @DisplayName("Test listGroupsWithHttpInfo(String, String, Status, String, String, Integer, SortOrder); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse GroupApi.listGroupsWithHttpInfo(String, String, Status, String, String, Integer, SortOrder)"})
  void testListGroupsWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class, () -> (new GroupApi(null)).listGroupsWithHttpInfo("https://example.org/example",
        null, Status.ACTIVE, "https://example.org/example", "https://example.org/example", 1, SortOrder.ASC));
  }

  /**
   * Test {@link GroupApi#updateAvatar(String, String, UploadAvatar)}.
   * <ul>
   *   <li>Given {@link GroupApi#GroupApi(ApiClient)} with apiClient is {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupApi#updateAvatar(String, String, UploadAvatar)}
   */
  @Test
  @DisplayName("Test updateAvatar(String, String, UploadAvatar); given GroupApi(ApiClient) with apiClient is 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.ext.group.gen.api.model.ReadGroup GroupApi.updateAvatar(String, String, UploadAvatar)"})
  void testUpdateAvatar_givenGroupApiWithApiClientIsNull_thenThrowApiException() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class, () -> (new GroupApi(null)).updateAvatar("localhost", null, null));
  }

  /**
   * Test {@link GroupApi#updateAvatar(String, String, UploadAvatar)}.
   * <ul>
   *   <li>Given {@link GroupApi#GroupApi(ApiClient)} with apiClient is {@code null}.</li>
   *   <li>When {@code 42}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupApi#updateAvatar(String, String, UploadAvatar)}
   */
  @Test
  @DisplayName("Test updateAvatar(String, String, UploadAvatar); given GroupApi(ApiClient) with apiClient is 'null'; when '42'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.ext.group.gen.api.model.ReadGroup GroupApi.updateAvatar(String, String, UploadAvatar)"})
  void testUpdateAvatar_givenGroupApiWithApiClientIsNull_when42_thenThrowApiException() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class, () -> (new GroupApi(null)).updateAvatar("localhost", "42", null));
  }

  /**
   * Test {@link GroupApi#updateAvatar(String, String, UploadAvatar)}.
   * <ul>
   *   <li>Given {@link GroupApi#GroupApi(ApiClient)} with apiClient is {@code null}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupApi#updateAvatar(String, String, UploadAvatar)}
   */
  @Test
  @DisplayName("Test updateAvatar(String, String, UploadAvatar); given GroupApi(ApiClient) with apiClient is 'null'; when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.ext.group.gen.api.model.ReadGroup GroupApi.updateAvatar(String, String, UploadAvatar)"})
  void testUpdateAvatar_givenGroupApiWithApiClientIsNull_whenNull_thenThrowApiException() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class, () -> (new GroupApi(null)).updateAvatar(null, null, null));
  }

  /**
   * Test {@link GroupApi#updateAvatarWithHttpInfo(String, String, UploadAvatar)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupApi#updateAvatarWithHttpInfo(String, String, UploadAvatar)}
   */
  @Test
  @DisplayName("Test updateAvatarWithHttpInfo(String, String, UploadAvatar); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse GroupApi.updateAvatarWithHttpInfo(String, String, UploadAvatar)"})
  void testUpdateAvatarWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class, () -> (new GroupApi(null)).updateAvatarWithHttpInfo("https://example.org/example",
        "https://example.org/example", null));
  }

  /**
   * Test {@link GroupApi#updateAvatarWithHttpInfo(String, String, UploadAvatar)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupApi#updateAvatarWithHttpInfo(String, String, UploadAvatar)}
   */
  @Test
  @DisplayName("Test updateAvatarWithHttpInfo(String, String, UploadAvatar); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse GroupApi.updateAvatarWithHttpInfo(String, String, UploadAvatar)"})
  void testUpdateAvatarWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class, () -> (new GroupApi(null)).updateAvatarWithHttpInfo(null, null, null));
  }

  /**
   * Test {@link GroupApi#updateAvatarWithHttpInfo(String, String, UploadAvatar)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupApi#updateAvatarWithHttpInfo(String, String, UploadAvatar)}
   */
  @Test
  @DisplayName("Test updateAvatarWithHttpInfo(String, String, UploadAvatar); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse GroupApi.updateAvatarWithHttpInfo(String, String, UploadAvatar)"})
  void testUpdateAvatarWithHttpInfo_thenThrowApiException3() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class,
        () -> (new GroupApi(null)).updateAvatarWithHttpInfo("https://example.org/example", null, null));
  }

  /**
   * Test {@link GroupApi#updateGroup(String, String, String, UpdateGroup)}.
   * <ul>
   *   <li>Given {@link GroupApi#GroupApi(ApiClient)} with apiClient is {@code null}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupApi#updateGroup(String, String, String, UpdateGroup)}
   */
  @Test
  @DisplayName("Test updateGroup(String, String, String, UpdateGroup); given GroupApi(ApiClient) with apiClient is 'null'; when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.ext.group.gen.api.model.ReadGroup GroupApi.updateGroup(String, String, String, UpdateGroup)"})
  void testUpdateGroup_givenGroupApiWithApiClientIsNull_whenNull_thenThrowApiException() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class, () -> (new GroupApi(null)).updateGroup(null, null, null, null));
  }

  /**
   * Test {@link GroupApi#updateGroupWithHttpInfo(String, String, String, UpdateGroup)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupApi#updateGroupWithHttpInfo(String, String, String, UpdateGroup)}
   */
  @Test
  @DisplayName("Test updateGroupWithHttpInfo(String, String, String, UpdateGroup); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse GroupApi.updateGroupWithHttpInfo(String, String, String, UpdateGroup)"})
  void testUpdateGroupWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class, () -> (new GroupApi(null)).updateGroupWithHttpInfo(null, null, null, null));
  }
}
