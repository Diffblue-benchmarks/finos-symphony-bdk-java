package com.symphony.bdk.core.service.pagination.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PaginationAttributeDiffblueTest {
  /**
   * Test {@link PaginationAttribute#PaginationAttribute(Integer, Integer)}.
   *
   * <p>Method under test: {@link PaginationAttribute#PaginationAttribute(Integer, Integer)}
   */
  @Test
  @DisplayName("Test new PaginationAttribute(Integer, Integer)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PaginationAttribute.<init>(Integer, Integer)"})
  void testNewPaginationAttribute() {
    // Arrange and Act
    PaginationAttribute actualPaginationAttribute = new PaginationAttribute(1, 1);

    // Assert
    assertEquals(1, actualPaginationAttribute.getLimit().intValue());
    assertEquals(1, actualPaginationAttribute.getSkip().intValue());
  }
}
