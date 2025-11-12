package com.symphony.bdk.http.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ApiResponseDiffblueTest {
  /**
   * Test {@link ApiResponse#ApiResponse(int, Map, Object)}.
   *
   * <ul>
   *   <li>When {@code Data}.
   *   <li>Then return {@code Data}.
   * </ul>
   *
   * <p>Method under test: {@link ApiResponse#ApiResponse(int, Map, Object)}
   */
  @Test
  @DisplayName("Test new ApiResponse(int, Map, Object); when 'Data'; then return 'Data'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ApiResponse.<init>(int, Map)",
    "void ApiResponse.<init>(int, Map, Object)"
  })
  void testNewApiResponse_whenData_thenReturnData() {
    // Arrange
    HashMap<String, List<String>> headers = new HashMap<>();

    // Act
    ApiResponse<Object> actualApiResponse = new ApiResponse<>(1, headers, "Data");

    // Assert
    assertEquals("Data", actualApiResponse.getData());
    assertEquals(1, actualApiResponse.getStatusCode());
    Map<String, List<String>> headers2 = actualApiResponse.getHeaders();
    assertTrue(headers2.isEmpty());
    assertSame(headers, headers2);
  }

  /**
   * Test {@link ApiResponse#ApiResponse(int, Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return Data is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ApiResponse#ApiResponse(int, Map)}
   */
  @Test
  @DisplayName("Test new ApiResponse(int, Map); when HashMap(); then return Data is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ApiResponse.<init>(int, Map)",
    "void ApiResponse.<init>(int, Map, Object)"
  })
  void testNewApiResponse_whenHashMap_thenReturnDataIsNull() {
    // Arrange
    HashMap<String, List<String>> headers = new HashMap<>();

    // Act
    ApiResponse<Object> actualApiResponse = new ApiResponse<>(1, headers);

    // Assert
    assertNull(actualApiResponse.getData());
    assertEquals(1, actualApiResponse.getStatusCode());
    Map<String, List<String>> headers2 = actualApiResponse.getHeaders();
    assertTrue(headers2.isEmpty());
    assertSame(headers, headers2);
  }
}
