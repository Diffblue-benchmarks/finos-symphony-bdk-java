package com.symphony.bdk.core.service.message.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EntityTypeEnumDiffblueTest {
  /**
   * Test {@link EntityTypeEnum#getValue()}.
   * <p>
   * Method under test: {@link EntityTypeEnum#getValue()}
   */
  @Test
  @DisplayName("Test getValue()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.String EntityTypeEnum.getValue()"})
  void testGetValue() {
    // Arrange, Act and Assert
    assertEquals("org.symphonyoss.taxonomy", EntityTypeEnum.valueOf("HASHTAG").getValue());
  }
}
