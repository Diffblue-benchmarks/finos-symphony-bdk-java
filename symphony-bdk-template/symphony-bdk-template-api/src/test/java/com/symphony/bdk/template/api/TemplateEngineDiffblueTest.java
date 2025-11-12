package com.symphony.bdk.template.api;

import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TemplateEngineDiffblueTest {
  /**
   * Test {@link TemplateEngine#getDefaultImplementation()}.
   *
   * <p>Method under test: {@link TemplateEngine#getDefaultImplementation()}
   */
  @Test
  @DisplayName("Test getDefaultImplementation()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TemplateEngine TemplateEngine.getDefaultImplementation()"})
  void testGetDefaultImplementation() {
    // Arrange, Act and Assert
    assertThrows(IllegalStateException.class, () -> TemplateEngine.getDefaultImplementation());
  }
}
