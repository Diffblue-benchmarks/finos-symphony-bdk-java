package com.symphony.bdk.template.freemarker;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.template.api.TemplateException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FreeMarkerEngineDiffblueTest {
  /**
   * Test {@link FreeMarkerEngine#newTemplateFromFile(String)}.
   *
   * <ul>
   *   <li>When {@code 42Template Path}.
   *   <li>Then throw {@link TemplateException}.
   * </ul>
   *
   * <p>Method under test: {@link FreeMarkerEngine#newTemplateFromFile(String)}
   */
  @Test
  @DisplayName(
      "Test newTemplateFromFile(String); when '42Template Path'; then throw TemplateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.template.api.Template FreeMarkerEngine.newTemplateFromFile(String)"
  })
  void testNewTemplateFromFile_when42TemplatePath_thenThrowTemplateException() {
    // Arrange, Act and Assert
    assertThrows(
        TemplateException.class,
        () -> new FreeMarkerEngine().newTemplateFromFile("42Template Path"));
  }

  /**
   * Test {@link FreeMarkerEngine#newTemplateFromClasspath(String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then return {@link FreeMarkerTemplate}.
   * </ul>
   *
   * <p>Method under test: {@link FreeMarkerEngine#newTemplateFromClasspath(String)}
   */
  @Test
  @DisplayName(
      "Test newTemplateFromClasspath(String); when empty string; then return FreeMarkerTemplate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.template.api.Template FreeMarkerEngine.newTemplateFromClasspath(String)"
  })
  void testNewTemplateFromClasspath_whenEmptyString_thenReturnFreeMarkerTemplate() {
    // Arrange, Act and Assert
    assertTrue(new FreeMarkerEngine().newTemplateFromClasspath("") instanceof FreeMarkerTemplate);
  }

  /**
   * Test {@link FreeMarkerEngine#newTemplateFromClasspath(String)}.
   *
   * <ul>
   *   <li>When {@code Template Path}.
   *   <li>Then throw {@link TemplateException}.
   * </ul>
   *
   * <p>Method under test: {@link FreeMarkerEngine#newTemplateFromClasspath(String)}
   */
  @Test
  @DisplayName(
      "Test newTemplateFromClasspath(String); when 'Template Path'; then throw TemplateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.template.api.Template FreeMarkerEngine.newTemplateFromClasspath(String)"
  })
  void testNewTemplateFromClasspath_whenTemplatePath_thenThrowTemplateException() {
    // Arrange, Act and Assert
    assertThrows(
        TemplateException.class,
        () -> new FreeMarkerEngine().newTemplateFromClasspath("Template Path"));
  }

  /**
   * Test {@link FreeMarkerEngine#newTemplateFromClasspath(String)}.
   *
   * <ul>
   *   <li>When {@code /UTF-8}.
   *   <li>Then throw {@link TemplateException}.
   * </ul>
   *
   * <p>Method under test: {@link FreeMarkerEngine#newTemplateFromClasspath(String)}
   */
  @Test
  @DisplayName("Test newTemplateFromClasspath(String); when '/UTF-8'; then throw TemplateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.template.api.Template FreeMarkerEngine.newTemplateFromClasspath(String)"
  })
  void testNewTemplateFromClasspath_whenUtf8_thenThrowTemplateException() {
    // Arrange, Act and Assert
    assertThrows(
        TemplateException.class, () -> new FreeMarkerEngine().newTemplateFromClasspath("/UTF-8"));
  }

  /**
   * Test {@link FreeMarkerEngine#newTemplateFromString(String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then return {@link FreeMarkerTemplate}.
   * </ul>
   *
   * <p>Method under test: {@link FreeMarkerEngine#newTemplateFromString(String)}
   */
  @Test
  @DisplayName(
      "Test newTemplateFromString(String); when empty string; then return FreeMarkerTemplate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.template.api.Template FreeMarkerEngine.newTemplateFromString(String)"
  })
  void testNewTemplateFromString_whenEmptyString_thenReturnFreeMarkerTemplate() {
    // Arrange, Act and Assert
    assertTrue(new FreeMarkerEngine().newTemplateFromString("") instanceof FreeMarkerTemplate);
  }

  /**
   * Test {@link FreeMarkerEngine#newTemplateFromString(String)}.
   *
   * <ul>
   *   <li>When {@code Template}.
   *   <li>Then return {@link FreeMarkerTemplate}.
   * </ul>
   *
   * <p>Method under test: {@link FreeMarkerEngine#newTemplateFromString(String)}
   */
  @Test
  @DisplayName(
      "Test newTemplateFromString(String); when 'Template'; then return FreeMarkerTemplate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.template.api.Template FreeMarkerEngine.newTemplateFromString(String)"
  })
  void testNewTemplateFromString_whenTemplate_thenReturnFreeMarkerTemplate() {
    // Arrange, Act and Assert
    assertTrue(
        new FreeMarkerEngine().newTemplateFromString("Template") instanceof FreeMarkerTemplate);
  }
}
