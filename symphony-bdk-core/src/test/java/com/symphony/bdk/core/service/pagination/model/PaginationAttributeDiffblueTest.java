package com.symphony.bdk.core.service.pagination.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PaginationAttributeDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link PaginationAttribute#PaginationAttribute(Integer, Integer)}
   *   <li>{@link PaginationAttribute#getLimit()}
   *   <li>{@link PaginationAttribute#getSkip()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PaginationAttribute.<init>(Integer, Integer)", "Integer PaginationAttribute.getLimit()",
      "Integer PaginationAttribute.getSkip()"})
  void testGettersAndSetters() {
    // Arrange and Act
    PaginationAttribute actualPaginationAttribute = new PaginationAttribute(1, 1);
    Integer actualLimit = actualPaginationAttribute.getLimit();
    Integer actualSkip = actualPaginationAttribute.getSkip();

    // Assert
    assertEquals(1, actualLimit.intValue());
    assertEquals(1, actualSkip.intValue());
  }
}
