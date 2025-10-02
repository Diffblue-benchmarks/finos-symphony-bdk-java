package com.symphony.bdk.template.freemarker;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.template.api.TemplateException;
import freemarker.template.Configuration;
import freemarker.template.Template;
import java.io.IOException;
import java.io.StringReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FreeMarkerTemplateDiffblueTest {
  /**
   * Test {@link FreeMarkerTemplate#process(Object)}.
   *
   * <ul>
   *   <li>Then return {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link FreeMarkerTemplate#process(Object)}
   */
  @Test
  @DisplayName("Test process(Object); then return 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String FreeMarkerTemplate.process(Object)"})
  void testProcess_thenReturnFoo() throws IOException {
    // Arrange
    StringReader reader = new StringReader("foo");
    Template template = new Template("Name", reader, new Configuration(Configuration.getVersion()));

    // Act and Assert
    assertEquals("foo", new FreeMarkerTemplate(template).process(null));
  }

  /**
   * Test {@link FreeMarkerTemplate#process(Object)}.
   *
   * <ul>
   *   <li>Then throw {@link TemplateException}.
   * </ul>
   *
   * <p>Method under test: {@link FreeMarkerTemplate#process(Object)}
   */
  @Test
  @DisplayName("Test process(Object); then throw TemplateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String FreeMarkerTemplate.process(Object)"})
  void testProcess_thenThrowTemplateException() throws IOException {
    // Arrange
    Configuration cfg = new Configuration(Configuration.getVersion());
    cfg.addAutoImport("Namespace Var Name", "Template Name");
    Template template = new Template("Name", new StringReader("foo"), cfg);

    // Act and Assert
    assertThrows(TemplateException.class, () -> new FreeMarkerTemplate(template).process(null));
  }
}
