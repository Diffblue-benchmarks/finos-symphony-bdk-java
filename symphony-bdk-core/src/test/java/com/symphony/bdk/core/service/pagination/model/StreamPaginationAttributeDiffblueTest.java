package com.symphony.bdk.core.service.pagination.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class StreamPaginationAttributeDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link StreamPaginationAttribute#StreamPaginationAttribute(Integer, Integer)}
   *   <li>{@link StreamPaginationAttribute#getChunkSize()}
   *   <li>{@link StreamPaginationAttribute#getTotalSize()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void StreamPaginationAttribute.<init>(Integer, Integer)",
      "Integer StreamPaginationAttribute.getChunkSize()", "Integer StreamPaginationAttribute.getTotalSize()"})
  void testGettersAndSetters() {
    // Arrange and Act
    StreamPaginationAttribute actualStreamPaginationAttribute = new StreamPaginationAttribute(3, 3);
    Integer actualChunkSize = actualStreamPaginationAttribute.getChunkSize();
    Integer actualTotalSize = actualStreamPaginationAttribute.getTotalSize();

    // Assert
    assertEquals(3, actualChunkSize.intValue());
    assertEquals(3, actualTotalSize.intValue());
  }
}
