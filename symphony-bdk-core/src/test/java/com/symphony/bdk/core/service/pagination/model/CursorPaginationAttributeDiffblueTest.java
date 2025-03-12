package com.symphony.bdk.core.service.pagination.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CursorPaginationAttributeDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link CursorPaginationAttribute#CursorPaginationAttribute(Integer, Integer, Integer)}
   *   <li>{@link CursorPaginationAttribute#getAfter()}
   *   <li>{@link CursorPaginationAttribute#getBefore()}
   *   <li>{@link CursorPaginationAttribute#getLimit()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CursorPaginationAttribute.<init>(Integer, Integer, Integer)",
      "Integer CursorPaginationAttribute.getAfter()", "Integer CursorPaginationAttribute.getBefore()",
      "Integer CursorPaginationAttribute.getLimit()"})
  void testGettersAndSetters() {
    // Arrange and Act
    CursorPaginationAttribute actualCursorPaginationAttribute = new CursorPaginationAttribute(1, 1, 1);
    Integer actualAfter = actualCursorPaginationAttribute.getAfter();
    Integer actualBefore = actualCursorPaginationAttribute.getBefore();
    Integer actualLimit = actualCursorPaginationAttribute.getLimit();

    // Assert
    assertEquals(1, actualAfter.intValue());
    assertEquals(1, actualBefore.intValue());
    assertEquals(1, actualLimit.intValue());
  }
}
