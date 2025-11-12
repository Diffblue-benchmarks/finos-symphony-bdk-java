package com.symphony.bdk.core.service.pagination;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class OffsetBasedPaginatedServiceDiffblueTest {
  /**
   * Test {@link OffsetBasedPaginatedService#OffsetBasedPaginatedService(OffsetBasedPaginatedApi,
   * Integer, Integer)}.
   *
   * <p>Method under test: {@link
   * OffsetBasedPaginatedService#OffsetBasedPaginatedService(OffsetBasedPaginatedApi, Integer,
   * Integer)}
   */
  @Test
  @DisplayName("Test new OffsetBasedPaginatedService(OffsetBasedPaginatedApi, Integer, Integer)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void OffsetBasedPaginatedService.<init>(OffsetBasedPaginatedApi, Integer, Integer)"
  })
  void testNewOffsetBasedPaginatedService() {
    // Arrange and Act
    OffsetBasedPaginatedService<Object> actualOffsetBasedPaginatedService =
        new OffsetBasedPaginatedService<>(mock(OffsetBasedPaginatedApi.class), 3, null);

    // Assert
    assertEquals(3, actualOffsetBasedPaginatedService.chunkSize);
    assertEquals(
        PaginatedService.DEFAULT_PAGINATION_CHUNK_SIZE, actualOffsetBasedPaginatedService.maxSize);
  }

  /**
   * Test {@link OffsetBasedPaginatedService#OffsetBasedPaginatedService(OffsetBasedPaginatedApi,
   * Integer, Integer)}.
   *
   * <p>Method under test: {@link
   * OffsetBasedPaginatedService#OffsetBasedPaginatedService(OffsetBasedPaginatedApi, Integer,
   * Integer)}
   */
  @Test
  @DisplayName("Test new OffsetBasedPaginatedService(OffsetBasedPaginatedApi, Integer, Integer)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void OffsetBasedPaginatedService.<init>(OffsetBasedPaginatedApi, Integer, Integer)"
  })
  void testNewOffsetBasedPaginatedService2() {
    // Arrange and Act
    OffsetBasedPaginatedService<Object> actualOffsetBasedPaginatedService =
        new OffsetBasedPaginatedService<>(mock(OffsetBasedPaginatedApi.class), null, 3);

    // Assert
    assertEquals(3, actualOffsetBasedPaginatedService.maxSize);
    assertEquals(
        PaginatedService.DEFAULT_PAGINATION_CHUNK_SIZE,
        actualOffsetBasedPaginatedService.chunkSize);
  }

  /**
   * Test {@link OffsetBasedPaginatedService#OffsetBasedPaginatedService(OffsetBasedPaginatedApi,
   * Integer, Integer)}.
   *
   * <ul>
   *   <li>Then return {@link PaginatedService#chunkSize} is three.
   * </ul>
   *
   * <p>Method under test: {@link
   * OffsetBasedPaginatedService#OffsetBasedPaginatedService(OffsetBasedPaginatedApi, Integer,
   * Integer)}
   */
  @Test
  @DisplayName(
      "Test new OffsetBasedPaginatedService(OffsetBasedPaginatedApi, Integer, Integer); then return chunkSize is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void OffsetBasedPaginatedService.<init>(OffsetBasedPaginatedApi, Integer, Integer)"
  })
  void testNewOffsetBasedPaginatedService_thenReturnChunkSizeIsThree() {
    // Arrange and Act
    OffsetBasedPaginatedService<Object> actualOffsetBasedPaginatedService =
        new OffsetBasedPaginatedService<>(mock(OffsetBasedPaginatedApi.class), 3, 3);

    // Assert
    assertEquals(3, actualOffsetBasedPaginatedService.chunkSize);
    assertEquals(3, actualOffsetBasedPaginatedService.maxSize);
  }

  /**
   * Test {@link OffsetBasedPaginatedService#OffsetBasedPaginatedService(OffsetBasedPaginatedApi,
   * Integer, Integer)}.
   *
   * <ul>
   *   <li>When minus one.
   * </ul>
   *
   * <p>Method under test: {@link
   * OffsetBasedPaginatedService#OffsetBasedPaginatedService(OffsetBasedPaginatedApi, Integer,
   * Integer)}
   */
  @Test
  @DisplayName(
      "Test new OffsetBasedPaginatedService(OffsetBasedPaginatedApi, Integer, Integer); when minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void OffsetBasedPaginatedService.<init>(OffsetBasedPaginatedApi, Integer, Integer)"
  })
  void testNewOffsetBasedPaginatedService_whenMinusOne() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new OffsetBasedPaginatedService<>(mock(OffsetBasedPaginatedApi.class), 3, -1));
  }

  /**
   * Test {@link OffsetBasedPaginatedService#OffsetBasedPaginatedService(OffsetBasedPaginatedApi,
   * Integer, Integer)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * OffsetBasedPaginatedService#OffsetBasedPaginatedService(OffsetBasedPaginatedApi, Integer,
   * Integer)}
   */
  @Test
  @DisplayName(
      "Test new OffsetBasedPaginatedService(OffsetBasedPaginatedApi, Integer, Integer); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void OffsetBasedPaginatedService.<init>(OffsetBasedPaginatedApi, Integer, Integer)"
  })
  void testNewOffsetBasedPaginatedService_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new OffsetBasedPaginatedService<>(mock(OffsetBasedPaginatedApi.class), 0, 3));
  }

  /**
   * Test {@link OffsetBasedPaginatedService#stream()}.
   *
   * <p>Method under test: {@link OffsetBasedPaginatedService#stream()}
   */
  @Test
  @DisplayName("Test stream()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream OffsetBasedPaginatedService.stream()"})
  void testStream() {
    // Arrange
    OffsetBasedPaginatedService<Object> offsetBasedPaginatedService =
        new OffsetBasedPaginatedService<>(mock(OffsetBasedPaginatedApi.class), 3, 3);

    // Act
    Stream<Object> actualStreamResult = offsetBasedPaginatedService.stream();

    // Assert
    assertTrue(actualStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }
}
