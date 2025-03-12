package com.symphony.bdk.http.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ApiResponseDiffblueTest {
  /**
   * Test getters and setters.
   * <ul>
   *   <li>When {@code Data}.</li>
   *   <li>Then return {@code Data}.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ApiResponse#ApiResponse(int, Map, Object)}
   *   <li>{@link ApiResponse#getData()}
   *   <li>{@link ApiResponse#getHeaders()}
   *   <li>{@link ApiResponse#getStatusCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters; when 'Data'; then return 'Data'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ApiResponse.<init>(int, Map)", "void ApiResponse.<init>(int, Map, Object)",
      "Object ApiResponse.getData()", "Map ApiResponse.getHeaders()", "int ApiResponse.getStatusCode()"})
  void testGettersAndSetters_whenData_thenReturnData() {
    // Arrange
    HashMap<String, List<String>> headers = new HashMap<>();

    // Act
    ApiResponse<Object> actualApiResponse = new ApiResponse<>(1, headers, "Data");
    Object actualData = actualApiResponse.getData();
    Map<String, List<String>> actualHeaders = actualApiResponse.getHeaders();

    // Assert
    assertEquals("Data", actualData);
    assertEquals(1, actualApiResponse.getStatusCode());
    assertTrue(actualHeaders.isEmpty());
    assertSame(headers, actualHeaders);
  }

  /**
   * Test getters and setters.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return Data is {@code null}.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ApiResponse#ApiResponse(int, Map)}
   *   <li>{@link ApiResponse#getData()}
   *   <li>{@link ApiResponse#getHeaders()}
   *   <li>{@link ApiResponse#getStatusCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters; when HashMap(); then return Data is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ApiResponse.<init>(int, Map)", "void ApiResponse.<init>(int, Map, Object)",
      "Object ApiResponse.getData()", "Map ApiResponse.getHeaders()", "int ApiResponse.getStatusCode()"})
  void testGettersAndSetters_whenHashMap_thenReturnDataIsNull() {
    // Arrange
    HashMap<String, List<String>> headers = new HashMap<>();

    // Act
    ApiResponse<Object> actualApiResponse = new ApiResponse<>(1, headers);
    Object actualData = actualApiResponse.getData();
    Map<String, List<String>> actualHeaders = actualApiResponse.getHeaders();

    // Assert
    assertNull(actualData);
    assertEquals(1, actualApiResponse.getStatusCode());
    assertTrue(actualHeaders.isEmpty());
    assertSame(headers, actualHeaders);
  }
}
