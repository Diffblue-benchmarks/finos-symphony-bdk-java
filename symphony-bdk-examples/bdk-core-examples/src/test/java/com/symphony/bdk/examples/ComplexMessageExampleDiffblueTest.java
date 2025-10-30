package com.symphony.bdk.examples;

import static org.junit.jupiter.api.Assertions.assertNull;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ComplexMessageExampleDiffblueTest {
  /**
   * Test {@link ComplexMessageExample#loadAttachment(String)}.
   * <p>
   * Method under test: {@link ComplexMessageExample#loadAttachment(String)}
   */
  @Test
  @DisplayName("Test loadAttachment(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.io.InputStream ComplexMessageExample.loadAttachment(String)"})
  void testLoadAttachment() {
    // Arrange, Act and Assert
    assertNull(ComplexMessageExample.loadAttachment("Path"));
  }
}
