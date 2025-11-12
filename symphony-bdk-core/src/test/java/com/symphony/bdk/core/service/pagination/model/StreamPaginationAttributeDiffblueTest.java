package com.symphony.bdk.core.service.pagination.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class StreamPaginationAttributeDiffblueTest {
  /**
   * Test {@link StreamPaginationAttribute#StreamPaginationAttribute(Integer, Integer)}.
   *
   * <p>Method under test: {@link StreamPaginationAttribute#StreamPaginationAttribute(Integer,
   * Integer)}
   */
  @Test
  @DisplayName("Test new StreamPaginationAttribute(Integer, Integer)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void StreamPaginationAttribute.<init>(Integer, Integer)"})
  void testNewStreamPaginationAttribute() {
    // Arrange and Act
    StreamPaginationAttribute actualStreamPaginationAttribute = new StreamPaginationAttribute(3, 3);

    // Assert
    assertEquals(3, actualStreamPaginationAttribute.getChunkSize().intValue());
    assertEquals(3, actualStreamPaginationAttribute.getTotalSize().intValue());
  }
}
