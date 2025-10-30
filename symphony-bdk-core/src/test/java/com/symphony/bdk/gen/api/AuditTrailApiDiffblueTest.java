package com.symphony.bdk.gen.api;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import jakarta.ws.rs.client.Client;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AuditTrailApiDiffblueTest {
  /**
   * Test {@link AuditTrailApi#v1AudittrailPrivilegeduserGet(String, String, Long, Long, String, String, Integer, Long, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuditTrailApi#v1AudittrailPrivilegeduserGet(String, String, Long, Long, String, String, Integer, Long, String)}
   */
  @Test
  @DisplayName("Test v1AudittrailPrivilegeduserGet(String, String, Long, Long, String, String, Integer, Long, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V1AuditTrailInitiatorList AuditTrailApi.v1AudittrailPrivilegeduserGet(String, String, Long, Long, String, String, Integer, Long, String)"})
  void testV1AudittrailPrivilegeduserGet_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new AuditTrailApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example")))
            .v1AudittrailPrivilegeduserGet(null, "ABC123", 1L, 1L, "Before", "After", 1, 1L, "Role"));
  }

  /**
   * Test {@link AuditTrailApi#v1AudittrailPrivilegeduserGet(String, String, Long, Long, String, String, Integer, Long, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuditTrailApi#v1AudittrailPrivilegeduserGet(String, String, Long, Long, String, String, Integer, Long, String)}
   */
  @Test
  @DisplayName("Test v1AudittrailPrivilegeduserGet(String, String, Long, Long, String, String, Integer, Long, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.gen.api.model.V1AuditTrailInitiatorList AuditTrailApi.v1AudittrailPrivilegeduserGet(String, String, Long, Long, String, String, Integer, Long, String)"})
  void testV1AudittrailPrivilegeduserGet_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new AuditTrailApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example")))
            .v1AudittrailPrivilegeduserGet("ABC123", null, null, 1L, "Before", "After", 1, 1L, "Role"));
  }

  /**
   * Test {@link AuditTrailApi#v1AudittrailPrivilegeduserGetWithHttpInfo(String, String, Long, Long, String, String, Integer, Long, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuditTrailApi#v1AudittrailPrivilegeduserGetWithHttpInfo(String, String, Long, Long, String, String, Integer, Long, String)}
   */
  @Test
  @DisplayName("Test v1AudittrailPrivilegeduserGetWithHttpInfo(String, String, Long, Long, String, String, Integer, Long, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse AuditTrailApi.v1AudittrailPrivilegeduserGetWithHttpInfo(String, String, Long, Long, String, String, Integer, Long, String)"})
  void testV1AudittrailPrivilegeduserGetWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new AuditTrailApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AudittrailPrivilegeduserGetWithHttpInfo(null,
                "https://example.org/example", 1L, 1L, "https://example.org/example", "https://example.org/example", 1,
                1L, "https://example.org/example"));
  }

  /**
   * Test {@link AuditTrailApi#v1AudittrailPrivilegeduserGetWithHttpInfo(String, String, Long, Long, String, String, Integer, Long, String)}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuditTrailApi#v1AudittrailPrivilegeduserGetWithHttpInfo(String, String, Long, Long, String, String, Integer, Long, String)}
   */
  @Test
  @DisplayName("Test v1AudittrailPrivilegeduserGetWithHttpInfo(String, String, Long, Long, String, String, Integer, Long, String); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse AuditTrailApi.v1AudittrailPrivilegeduserGetWithHttpInfo(String, String, Long, Long, String, String, Integer, Long, String)"})
  void testV1AudittrailPrivilegeduserGetWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(ApiException.class,
        () -> (new AuditTrailApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example", defaultHeaders,
            "https://example.org/example"))).v1AudittrailPrivilegeduserGetWithHttpInfo("https://example.org/example",
                null, null, 1L, "https://example.org/example", "https://example.org/example", 1, 1L,
                "https://example.org/example"));
  }
}
