package com.symphony.bdk.template.handlebars;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.template.api.Template;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class HandlebarsEngineDiffblueTest {
  /**
   * Test {@link HandlebarsEngine#newTemplateFromString(String)}.
   *
   * <ul>
   *   <li>Then return process {@code Parameters} is empty string.
   * </ul>
   *
   * <p>Method under test: {@link HandlebarsEngine#newTemplateFromString(String)}
   */
  @Test
  @DisplayName(
      "Test newTemplateFromString(String); then return process 'Parameters' is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Template HandlebarsEngine.newTemplateFromString(String)"})
  void testNewTemplateFromString_thenReturnProcessParametersIsEmptyString() {
    // Arrange and Act
    Template actualNewTemplateFromStringResult = new HandlebarsEngine().newTemplateFromString("");
    String actualProcessResult = actualNewTemplateFromStringResult.process("Parameters");

    // Assert
    assertTrue(actualNewTemplateFromStringResult instanceof HandlebarsTemplate);
    assertEquals("", actualNewTemplateFromStringResult.process("Parameters"));
    assertEquals("", actualProcessResult);
  }

  /**
   * Test {@link HandlebarsEngine#newTemplateFromString(String)}.
   *
   * <ul>
   *   <li>When {@code Template}.
   *   <li>Then return process {@code Parameters} is {@code Template}.
   * </ul>
   *
   * <p>Method under test: {@link HandlebarsEngine#newTemplateFromString(String)}
   */
  @Test
  @DisplayName(
      "Test newTemplateFromString(String); when 'Template'; then return process 'Parameters' is 'Template'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Template HandlebarsEngine.newTemplateFromString(String)"})
  void testNewTemplateFromString_whenTemplate_thenReturnProcessParametersIsTemplate() {
    // Arrange and Act
    Template actualNewTemplateFromStringResult =
        new HandlebarsEngine().newTemplateFromString("Template");
    String actualProcessResult = actualNewTemplateFromStringResult.process("Parameters");

    // Assert
    assertTrue(actualNewTemplateFromStringResult instanceof HandlebarsTemplate);
    assertEquals("Template", actualNewTemplateFromStringResult.process("Parameters"));
    assertEquals("Template", actualProcessResult);
  }
}
