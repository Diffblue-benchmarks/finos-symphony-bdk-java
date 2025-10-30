package com.symphony.bdk.template.handlebars;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.template.api.Template;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class HandlebarsEngineDiffblueTest {
  /**
   * Test {@link HandlebarsEngine#newTemplateFromString(String)}.
   * <p>
   * Method under test: {@link HandlebarsEngine#newTemplateFromString(String)}
   */
  @Test
  @DisplayName("Test newTemplateFromString(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Template HandlebarsEngine.newTemplateFromString(String)"})
  void testNewTemplateFromString() {
    // Arrange and Act
    Template actualNewTemplateFromStringResult = (new HandlebarsEngine()).newTemplateFromString("Template");
    String actualProcessResult = actualNewTemplateFromStringResult.process("Parameters");

    // Assert
    assertTrue(actualNewTemplateFromStringResult instanceof HandlebarsTemplate);
    assertEquals("Template", actualNewTemplateFromStringResult.process("Parameters"));
    assertEquals("Template", actualProcessResult);
  }
}
