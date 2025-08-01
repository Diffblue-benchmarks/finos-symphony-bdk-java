package com.symphony.bdk.gen.api;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.AgentInfo;
import com.symphony.bdk.http.api.ApiClient;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.api.ApiResponse;
import com.symphony.bdk.http.api.Pair;
import com.symphony.bdk.http.api.util.TypeReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SignalsApiDiffblueTest {
  /**
   * Test {@link SignalsApi#v1InfoGet()}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link SignalsApi#v1InfoGet()}
   */
  @Test
  @DisplayName("Test v1InfoGet(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AgentInfo SignalsApi.v1InfoGet()"})
  void testV1InfoGet_thenReturnNull() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    when(apiClient.invokeAPI(
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<List<Pair>>any(),
            Mockito.<Object>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, Object>>any(),
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<String[]>any(),
            Mockito.<TypeReference<Object>>any()))
        .thenReturn(new ApiResponse<>(1, new HashMap<>()));
    when(apiClient.selectHeaderAccept(isA(String[].class)))
        .thenReturn("https://example.org/example");
    when(apiClient.selectHeaderContentType(isA(String[].class))).thenReturn("text/plain");

    // Act
    AgentInfo actualV1InfoGetResult = new SignalsApi(apiClient).v1InfoGet();

    // Assert
    verify(apiClient)
        .invokeAPI(
            eq("/v1/info"),
            eq("GET"),
            isA(List.class),
            isNull(),
            isA(Map.class),
            isA(Map.class),
            isA(Map.class),
            eq("https://example.org/example"),
            eq("text/plain"),
            isA(String[].class),
            isA(TypeReference.class));
    verify(apiClient).selectHeaderAccept(isA(String[].class));
    verify(apiClient).selectHeaderContentType(isA(String[].class));
    assertNull(actualV1InfoGetResult);
  }
}
