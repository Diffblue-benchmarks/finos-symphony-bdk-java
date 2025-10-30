package com.symphony.bdk.core.service.pagination;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CursorBasedPaginatedServiceDiffblueTest {
  /**
   * Test {@link CursorBasedPaginatedService#CursorBasedPaginatedService(CursorBasedPaginatedApi, Integer, Integer)}.
   * <p>
   * Method under test: {@link CursorBasedPaginatedService#CursorBasedPaginatedService(CursorBasedPaginatedApi, Integer, Integer)}
   */
  @Test
  @DisplayName("Test new CursorBasedPaginatedService(CursorBasedPaginatedApi, Integer, Integer)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CursorBasedPaginatedService.<init>(CursorBasedPaginatedApi, Integer, Integer)"})
  void testNewCursorBasedPaginatedService() {
    // Arrange and Act
    CursorBasedPaginatedService<Object> actualCursorBasedPaginatedService = new CursorBasedPaginatedService<>(
        mock(CursorBasedPaginatedApi.class), null, null);

    // Assert
    assertEquals(PaginatedService.DEFAULT_PAGINATION_CHUNK_SIZE, actualCursorBasedPaginatedService.chunkSize);
    assertEquals(PaginatedService.DEFAULT_PAGINATION_CHUNK_SIZE, actualCursorBasedPaginatedService.maxSize);
  }

  /**
   * Test {@link CursorBasedPaginatedService#CursorBasedPaginatedService(CursorBasedPaginatedApi, Integer, Integer)}.
   * <ul>
   *   <li>When three.</li>
   *   <li>Then return {@link PaginatedService#chunkSize} is three.</li>
   * </ul>
   * <p>
   * Method under test: {@link CursorBasedPaginatedService#CursorBasedPaginatedService(CursorBasedPaginatedApi, Integer, Integer)}
   */
  @Test
  @DisplayName("Test new CursorBasedPaginatedService(CursorBasedPaginatedApi, Integer, Integer); when three; then return chunkSize is three")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CursorBasedPaginatedService.<init>(CursorBasedPaginatedApi, Integer, Integer)"})
  void testNewCursorBasedPaginatedService_whenThree_thenReturnChunkSizeIsThree() {
    // Arrange and Act
    CursorBasedPaginatedService<Object> actualCursorBasedPaginatedService = new CursorBasedPaginatedService<>(
        mock(CursorBasedPaginatedApi.class), 3, 3);

    // Assert
    assertEquals(3, actualCursorBasedPaginatedService.chunkSize);
    assertEquals(3, actualCursorBasedPaginatedService.maxSize);
  }
}
