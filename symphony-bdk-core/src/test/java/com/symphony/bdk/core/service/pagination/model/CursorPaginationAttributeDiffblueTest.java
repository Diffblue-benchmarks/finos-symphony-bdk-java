package com.symphony.bdk.core.service.pagination.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CursorPaginationAttributeDiffblueTest {
  /**
   * Test {@link CursorPaginationAttribute#CursorPaginationAttribute(Integer, Integer, Integer)}.
   *
   * <p>Method under test: {@link CursorPaginationAttribute#CursorPaginationAttribute(Integer,
   * Integer, Integer)}
   */
  @Test
  @DisplayName("Test new CursorPaginationAttribute(Integer, Integer, Integer)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CursorPaginationAttribute.<init>(Integer, Integer, Integer)"})
  void testNewCursorPaginationAttribute() {
    // Arrange and Act
    CursorPaginationAttribute actualCursorPaginationAttribute =
        new CursorPaginationAttribute(1, 1, 1);

    // Assert
    assertEquals(1, actualCursorPaginationAttribute.getAfter().intValue());
    assertEquals(1, actualCursorPaginationAttribute.getBefore().intValue());
    assertEquals(1, actualCursorPaginationAttribute.getLimit().intValue());
  }
}
