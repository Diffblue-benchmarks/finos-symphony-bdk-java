package com.symphony.bdk.ext.group.gen.api;

import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.ext.group.gen.api.model.SortOrder;
import com.symphony.bdk.ext.group.gen.api.model.Status;
import com.symphony.bdk.http.api.ApiException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TypeApiDiffblueTest {
  /**
   * Test {@link TypeApi#getType(String, String)}.
   * <ul>
   *   <li>Given {@link TypeApi#TypeApi(ApiClient)} with apiClient is {@code null}.</li>
   *   <li>When {@code localhost}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TypeApi#getType(String, String)}
   */
  @Test
  @DisplayName("Test getType(String, String); given TypeApi(ApiClient) with apiClient is 'null'; when 'localhost'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.ext.group.gen.api.model.Type TypeApi.getType(String, String)"})
  void testGetType_givenTypeApiWithApiClientIsNull_whenLocalhost_thenThrowApiException() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class, () -> (new TypeApi(null)).getType("localhost", null));
  }

  /**
   * Test {@link TypeApi#getType(String, String)}.
   * <ul>
   *   <li>Given {@link TypeApi#TypeApi(ApiClient)} with apiClient is {@code null}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TypeApi#getType(String, String)}
   */
  @Test
  @DisplayName("Test getType(String, String); given TypeApi(ApiClient) with apiClient is 'null'; when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.ext.group.gen.api.model.Type TypeApi.getType(String, String)"})
  void testGetType_givenTypeApiWithApiClientIsNull_whenNull_thenThrowApiException() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class, () -> (new TypeApi(null)).getType(null, null));
  }

  /**
   * Test {@link TypeApi#getTypeWithHttpInfo(String, String)}.
   * <ul>
   *   <li>Given {@link TypeApi#TypeApi(ApiClient)} with apiClient is {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TypeApi#getTypeWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName("Test getTypeWithHttpInfo(String, String); given TypeApi(ApiClient) with apiClient is 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.http.api.ApiResponse TypeApi.getTypeWithHttpInfo(String, String)"})
  void testGetTypeWithHttpInfo_givenTypeApiWithApiClientIsNull_thenThrowApiException() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class, () -> (new TypeApi(null)).getTypeWithHttpInfo(null, null));
  }

  /**
   * Test {@link TypeApi#getTypeWithHttpInfo(String, String)}.
   * <ul>
   *   <li>Given {@link TypeApi#TypeApi(ApiClient)} with apiClient is {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TypeApi#getTypeWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName("Test getTypeWithHttpInfo(String, String); given TypeApi(ApiClient) with apiClient is 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.http.api.ApiResponse TypeApi.getTypeWithHttpInfo(String, String)"})
  void testGetTypeWithHttpInfo_givenTypeApiWithApiClientIsNull_thenThrowApiException2() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class,
        () -> (new TypeApi(null)).getTypeWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link TypeApi#listTypes(String, Status, String, String, Integer, SortOrder)}.
   * <ul>
   *   <li>Given {@link TypeApi#TypeApi(ApiClient)} with apiClient is {@code null}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TypeApi#listTypes(String, Status, String, String, Integer, SortOrder)}
   */
  @Test
  @DisplayName("Test listTypes(String, Status, String, String, Integer, SortOrder); given TypeApi(ApiClient) with apiClient is 'null'; when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.ext.group.gen.api.model.TypeList TypeApi.listTypes(String, Status, String, String, Integer, SortOrder)"})
  void testListTypes_givenTypeApiWithApiClientIsNull_whenNull_thenThrowApiException() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class,
        () -> (new TypeApi(null)).listTypes(null, Status.ACTIVE, "Before", "After", 1, SortOrder.ASC));
  }

  /**
   * Test {@link TypeApi#listTypesWithHttpInfo(String, Status, String, String, Integer, SortOrder)}.
   * <ul>
   *   <li>Given {@link TypeApi#TypeApi(ApiClient)} with apiClient is {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TypeApi#listTypesWithHttpInfo(String, Status, String, String, Integer, SortOrder)}
   */
  @Test
  @DisplayName("Test listTypesWithHttpInfo(String, Status, String, String, Integer, SortOrder); given TypeApi(ApiClient) with apiClient is 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse TypeApi.listTypesWithHttpInfo(String, Status, String, String, Integer, SortOrder)"})
  void testListTypesWithHttpInfo_givenTypeApiWithApiClientIsNull_thenThrowApiException() throws ApiException {
    // Arrange, Act and Assert
    assertThrows(ApiException.class, () -> (new TypeApi(null)).listTypesWithHttpInfo(null, Status.ACTIVE,
        "https://example.org/example", "https://example.org/example", 1, SortOrder.ASC));
  }
}
