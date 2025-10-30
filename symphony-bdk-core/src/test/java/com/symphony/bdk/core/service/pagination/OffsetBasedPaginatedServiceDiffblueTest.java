package com.symphony.bdk.core.service.pagination;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class OffsetBasedPaginatedServiceDiffblueTest {
  /**
   * Test {@link OffsetBasedPaginatedService#OffsetBasedPaginatedService(OffsetBasedPaginatedApi, Integer, Integer)}.
   * <p>
   * Method under test: {@link OffsetBasedPaginatedService#OffsetBasedPaginatedService(OffsetBasedPaginatedApi, Integer, Integer)}
   */
  @Test
  @DisplayName("Test new OffsetBasedPaginatedService(OffsetBasedPaginatedApi, Integer, Integer)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void OffsetBasedPaginatedService.<init>(OffsetBasedPaginatedApi, Integer, Integer)"})
  void testNewOffsetBasedPaginatedService() {
    // Arrange and Act
    OffsetBasedPaginatedService<Object> actualOffsetBasedPaginatedService = new OffsetBasedPaginatedService<>(
        mock(OffsetBasedPaginatedApi.class), null, null);

    // Assert
    assertEquals(PaginatedService.DEFAULT_PAGINATION_CHUNK_SIZE, actualOffsetBasedPaginatedService.chunkSize);
    assertEquals(PaginatedService.DEFAULT_PAGINATION_CHUNK_SIZE, actualOffsetBasedPaginatedService.maxSize);
  }

  /**
   * Test {@link OffsetBasedPaginatedService#OffsetBasedPaginatedService(OffsetBasedPaginatedApi, Integer, Integer)}.
   * <ul>
   *   <li>When three.</li>
   *   <li>Then return {@link PaginatedService#chunkSize} is three.</li>
   * </ul>
   * <p>
   * Method under test: {@link OffsetBasedPaginatedService#OffsetBasedPaginatedService(OffsetBasedPaginatedApi, Integer, Integer)}
   */
  @Test
  @DisplayName("Test new OffsetBasedPaginatedService(OffsetBasedPaginatedApi, Integer, Integer); when three; then return chunkSize is three")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void OffsetBasedPaginatedService.<init>(OffsetBasedPaginatedApi, Integer, Integer)"})
  void testNewOffsetBasedPaginatedService_whenThree_thenReturnChunkSizeIsThree() {
    // Arrange and Act
    OffsetBasedPaginatedService<Object> actualOffsetBasedPaginatedService = new OffsetBasedPaginatedService<>(
        mock(OffsetBasedPaginatedApi.class), 3, 3);

    // Assert
    assertEquals(3, actualOffsetBasedPaginatedService.chunkSize);
    assertEquals(3, actualOffsetBasedPaginatedService.maxSize);
  }

  /**
   * Test {@link OffsetBasedPaginatedService#stream()}.
   * <p>
   * Method under test: {@link OffsetBasedPaginatedService#stream()}
   */
  @Test
  @DisplayName("Test stream()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Stream OffsetBasedPaginatedService.stream()"})
  void testStream() {
    // Arrange
    OffsetBasedPaginatedService<Object> offsetBasedPaginatedService = new OffsetBasedPaginatedService<>(
        mock(OffsetBasedPaginatedApi.class), 3, 3);

    // Act
    Stream<Object> actualStreamResult = offsetBasedPaginatedService.stream();

    // Assert
    assertTrue(actualStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }
}
