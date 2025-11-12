package com.symphony.bdk.core.service.pagination;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CursorBasedPaginatedServiceDiffblueTest {
  /**
   * Test {@link CursorBasedPaginatedService#CursorBasedPaginatedService(CursorBasedPaginatedApi,
   * Integer, Integer)}.
   *
   * <p>Method under test: {@link
   * CursorBasedPaginatedService#CursorBasedPaginatedService(CursorBasedPaginatedApi, Integer,
   * Integer)}
   */
  @Test
  @DisplayName("Test new CursorBasedPaginatedService(CursorBasedPaginatedApi, Integer, Integer)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void CursorBasedPaginatedService.<init>(CursorBasedPaginatedApi, Integer, Integer)"
  })
  void testNewCursorBasedPaginatedService() {
    // Arrange and Act
    CursorBasedPaginatedService<Object> actualCursorBasedPaginatedService =
        new CursorBasedPaginatedService<>(mock(CursorBasedPaginatedApi.class), 3, null);

    // Assert
    assertEquals(3, actualCursorBasedPaginatedService.chunkSize);
    assertEquals(
        PaginatedService.DEFAULT_PAGINATION_CHUNK_SIZE, actualCursorBasedPaginatedService.maxSize);
  }

  /**
   * Test {@link CursorBasedPaginatedService#CursorBasedPaginatedService(CursorBasedPaginatedApi,
   * Integer, Integer)}.
   *
   * <p>Method under test: {@link
   * CursorBasedPaginatedService#CursorBasedPaginatedService(CursorBasedPaginatedApi, Integer,
   * Integer)}
   */
  @Test
  @DisplayName("Test new CursorBasedPaginatedService(CursorBasedPaginatedApi, Integer, Integer)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void CursorBasedPaginatedService.<init>(CursorBasedPaginatedApi, Integer, Integer)"
  })
  void testNewCursorBasedPaginatedService2() {
    // Arrange and Act
    CursorBasedPaginatedService<Object> actualCursorBasedPaginatedService =
        new CursorBasedPaginatedService<>(mock(CursorBasedPaginatedApi.class), null, 3);

    // Assert
    assertEquals(3, actualCursorBasedPaginatedService.maxSize);
    assertEquals(
        PaginatedService.DEFAULT_PAGINATION_CHUNK_SIZE,
        actualCursorBasedPaginatedService.chunkSize);
  }

  /**
   * Test {@link CursorBasedPaginatedService#CursorBasedPaginatedService(CursorBasedPaginatedApi,
   * Integer, Integer)}.
   *
   * <ul>
   *   <li>Then return {@link PaginatedService#chunkSize} is three.
   * </ul>
   *
   * <p>Method under test: {@link
   * CursorBasedPaginatedService#CursorBasedPaginatedService(CursorBasedPaginatedApi, Integer,
   * Integer)}
   */
  @Test
  @DisplayName(
      "Test new CursorBasedPaginatedService(CursorBasedPaginatedApi, Integer, Integer); then return chunkSize is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void CursorBasedPaginatedService.<init>(CursorBasedPaginatedApi, Integer, Integer)"
  })
  void testNewCursorBasedPaginatedService_thenReturnChunkSizeIsThree() {
    // Arrange and Act
    CursorBasedPaginatedService<Object> actualCursorBasedPaginatedService =
        new CursorBasedPaginatedService<>(mock(CursorBasedPaginatedApi.class), 3, 3);

    // Assert
    assertEquals(3, actualCursorBasedPaginatedService.chunkSize);
    assertEquals(3, actualCursorBasedPaginatedService.maxSize);
  }

  /**
   * Test {@link CursorBasedPaginatedService#CursorBasedPaginatedService(CursorBasedPaginatedApi,
   * Integer, Integer)}.
   *
   * <ul>
   *   <li>When minus one.
   * </ul>
   *
   * <p>Method under test: {@link
   * CursorBasedPaginatedService#CursorBasedPaginatedService(CursorBasedPaginatedApi, Integer,
   * Integer)}
   */
  @Test
  @DisplayName(
      "Test new CursorBasedPaginatedService(CursorBasedPaginatedApi, Integer, Integer); when minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void CursorBasedPaginatedService.<init>(CursorBasedPaginatedApi, Integer, Integer)"
  })
  void testNewCursorBasedPaginatedService_whenMinusOne() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new CursorBasedPaginatedService<>(mock(CursorBasedPaginatedApi.class), 3, -1));
  }

  /**
   * Test {@link CursorBasedPaginatedService#CursorBasedPaginatedService(CursorBasedPaginatedApi,
   * Integer, Integer)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * CursorBasedPaginatedService#CursorBasedPaginatedService(CursorBasedPaginatedApi, Integer,
   * Integer)}
   */
  @Test
  @DisplayName(
      "Test new CursorBasedPaginatedService(CursorBasedPaginatedApi, Integer, Integer); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void CursorBasedPaginatedService.<init>(CursorBasedPaginatedApi, Integer, Integer)"
  })
  void testNewCursorBasedPaginatedService_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new CursorBasedPaginatedService<>(mock(CursorBasedPaginatedApi.class), 0, 3));
  }
}
