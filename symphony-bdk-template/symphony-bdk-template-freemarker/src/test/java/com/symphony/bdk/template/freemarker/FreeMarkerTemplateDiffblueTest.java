package com.symphony.bdk.template.freemarker;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.template.api.TemplateException;
import freemarker.template.SimpleHash;
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
   * <p>Method under test: {@link FreeMarkerTemplate#process(Object)}
   */
  @Test
  @DisplayName("Test process(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String FreeMarkerTemplate.process(Object)"})
  void testProcess() throws IOException {
    // Arrange
    Template template = new Template("Name", new StringReader("foo"));
    template.addAutoInclude("Template Name");
    FreeMarkerTemplate freeMarkerTemplate = new FreeMarkerTemplate(template);

    // Act and Assert
    assertThrows(TemplateException.class, () -> freeMarkerTemplate.process(new SimpleHash()));
  }

  /**
   * Test {@link FreeMarkerTemplate#process(Object)}.
   *
   * <p>Method under test: {@link FreeMarkerTemplate#process(Object)}
   */
  @Test
  @DisplayName("Test process(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String FreeMarkerTemplate.process(Object)"})
  void testProcess2() throws IOException {
    // Arrange
    Template template = new Template("Name", new StringReader("foo"));
    template.setCustomLookupCondition("Custom Lookup Condition");
    template.addAutoImport("Namespace Var Name", "Template Name");
    FreeMarkerTemplate freeMarkerTemplate = new FreeMarkerTemplate(template);

    // Act and Assert
    assertThrows(TemplateException.class, () -> freeMarkerTemplate.process(new SimpleHash()));
  }

  /**
   * Test {@link FreeMarkerTemplate#process(Object)}.
   *
   * <p>Method under test: {@link FreeMarkerTemplate#process(Object)}
   */
  @Test
  @DisplayName("Test process(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String FreeMarkerTemplate.process(Object)"})
  void testProcess3() throws IOException {
    // Arrange
    Template template = new Template("Name", new StringReader("foo"));
    template.addAutoImport("", "");
    template.setLazyImports(true);
    template.addAutoImport("Namespace Var Name", "Template Name");
    FreeMarkerTemplate freeMarkerTemplate = new FreeMarkerTemplate(template);

    // Act and Assert
    assertEquals("foo", freeMarkerTemplate.process(new SimpleHash()));
  }

  /**
   * Test {@link FreeMarkerTemplate#process(Object)}.
   *
   * <p>Method under test: {@link FreeMarkerTemplate#process(Object)}
   */
  @Test
  @DisplayName("Test process(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String FreeMarkerTemplate.process(Object)"})
  void testProcess4() throws IOException {
    // Arrange
    Template template = new Template("Name", new StringReader("foo"));
    template.addAutoImport("", "Template Name");
    template.setLazyImports(true);
    template.addAutoImport("Namespace Var Name", "Template Name");
    FreeMarkerTemplate freeMarkerTemplate = new FreeMarkerTemplate(template);

    // Act and Assert
    assertEquals("foo", freeMarkerTemplate.process(new SimpleHash()));
  }

  /**
   * Test {@link FreeMarkerTemplate#process(Object)}.
   *
   * <ul>
   *   <li>Given {@link Template#Template(String, Reader)} with {@code Name} and reader is {@link
   *       StringReader#StringReader(String)} Encoding is {@code UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link FreeMarkerTemplate#process(Object)}
   */
  @Test
  @DisplayName(
      "Test process(Object); given Template(String, Reader) with 'Name' and reader is StringReader(String) Encoding is 'UTF-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String FreeMarkerTemplate.process(Object)"})
  void testProcess_givenTemplateWithNameAndReaderIsStringReaderEncodingIsUtf8() throws IOException {
    // Arrange
    Template template = new Template("Name", new StringReader("foo"));
    template.setEncoding("UTF-8");
    template.addAutoImport("Namespace Var Name", "Template Name");
    FreeMarkerTemplate freeMarkerTemplate = new FreeMarkerTemplate(template);

    // Act and Assert
    assertThrows(TemplateException.class, () -> freeMarkerTemplate.process(new SimpleHash()));
  }

  /**
   * Test {@link FreeMarkerTemplate#process(Object)}.
   *
   * <ul>
   *   <li>Given {@link Template#Template(String, Reader)} with {@code Name} and reader is {@link
   *       StringReader#StringReader(String)} LazyImports is {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link FreeMarkerTemplate#process(Object)}
   */
  @Test
  @DisplayName(
      "Test process(Object); given Template(String, Reader) with 'Name' and reader is StringReader(String) LazyImports is 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String FreeMarkerTemplate.process(Object)"})
  void testProcess_givenTemplateWithNameAndReaderIsStringReaderLazyImportsIsTrue()
      throws IOException {
    // Arrange
    Template template = new Template("Name", new StringReader("foo"));
    template.setLazyImports(true);
    template.addAutoImport("Namespace Var Name", "Template Name");
    FreeMarkerTemplate freeMarkerTemplate = new FreeMarkerTemplate(template);

    // Act and Assert
    assertEquals("foo", freeMarkerTemplate.process(new SimpleHash()));
  }

  /**
   * Test {@link FreeMarkerTemplate#process(Object)}.
   *
   * <ul>
   *   <li>Given {@link Template#Template(String, Reader)} with {@code Name} and reader is {@link
   *       StringReader#StringReader(String)}.
   *   <li>Then return {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link FreeMarkerTemplate#process(Object)}
   */
  @Test
  @DisplayName(
      "Test process(Object); given Template(String, Reader) with 'Name' and reader is StringReader(String); then return 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String FreeMarkerTemplate.process(Object)"})
  void testProcess_givenTemplateWithNameAndReaderIsStringReader_thenReturnFoo() throws IOException {
    // Arrange
    Template template = new Template("Name", new StringReader("foo"));
    FreeMarkerTemplate freeMarkerTemplate = new FreeMarkerTemplate(template);

    // Act and Assert
    assertEquals("foo", freeMarkerTemplate.process(new SimpleHash()));
  }

  /**
   * Test {@link FreeMarkerTemplate#process(Object)}.
   *
   * <ul>
   *   <li>Given {@link Template#Template(String, Reader)} with {@code Name} and reader is {@link
   *       StringReader#StringReader(String)}.
   *   <li>When {@code null}.
   *   <li>Then return {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link FreeMarkerTemplate#process(Object)}
   */
  @Test
  @DisplayName(
      "Test process(Object); given Template(String, Reader) with 'Name' and reader is StringReader(String); when 'null'; then return 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String FreeMarkerTemplate.process(Object)"})
  void testProcess_givenTemplateWithNameAndReaderIsStringReader_whenNull_thenReturnFoo()
      throws IOException {
    // Arrange
    Template template = new Template("Name", new StringReader("foo"));

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
    Template template = new Template("Name", new StringReader("foo"));
    template.addAutoImport("Namespace Var Name", "Template Name");
    FreeMarkerTemplate freeMarkerTemplate = new FreeMarkerTemplate(template);

    // Act and Assert
    assertThrows(TemplateException.class, () -> freeMarkerTemplate.process(new SimpleHash()));
  }
}
