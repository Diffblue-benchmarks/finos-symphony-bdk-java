package com.symphony.bdk.template.freemarker;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.template.api.TemplateException;
import freemarker.template.Template;
import java.io.IOException;
import java.io.StringReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FreeMarkerTemplateDiffblueTest {
  /**
   * Test {@link FreeMarkerTemplate#process(Object)}.
   * <ul>
   *   <li>Given {@link Template#Template(String, Reader)} with {@code Name} and reader is {@link StringReader#StringReader(String)} Encoding is {@code UTF-8}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FreeMarkerTemplate#process(Object)}
   */
  @Test
  @DisplayName("Test process(Object); given Template(String, Reader) with 'Name' and reader is StringReader(String) Encoding is 'UTF-8'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.String FreeMarkerTemplate.process(Object)"})
  void testProcess_givenTemplateWithNameAndReaderIsStringReaderEncodingIsUtf8() throws IOException {
    // Arrange
    Template template = new Template("Name", new StringReader("foo"));
    template.setEncoding("UTF-8");
    template.addAutoImport("Namespace Var Name", "Template Name");

    // Act and Assert
    assertThrows(TemplateException.class, () -> (new FreeMarkerTemplate(template)).process(null));
  }

  /**
   * Test {@link FreeMarkerTemplate#process(Object)}.
   * <ul>
   *   <li>Given {@link Template#Template(String, Reader)} with {@code Name} and reader is {@link StringReader#StringReader(String)} LazyImports is {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FreeMarkerTemplate#process(Object)}
   */
  @Test
  @DisplayName("Test process(Object); given Template(String, Reader) with 'Name' and reader is StringReader(String) LazyImports is 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.String FreeMarkerTemplate.process(Object)"})
  void testProcess_givenTemplateWithNameAndReaderIsStringReaderLazyImportsIsTrue() throws IOException {
    // Arrange
    Template template = new Template("Name", new StringReader("foo"));
    template.setLazyImports(true);
    template.addAutoImport("Namespace Var Name", "Template Name");

    // Act and Assert
    assertEquals("foo", (new FreeMarkerTemplate(template)).process(null));
  }

  /**
   * Test {@link FreeMarkerTemplate#process(Object)}.
   * <ul>
   *   <li>Given {@link Template#Template(String, Reader)} with {@code Name} and reader is {@link StringReader#StringReader(String)}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FreeMarkerTemplate#process(Object)}
   */
  @Test
  @DisplayName("Test process(Object); given Template(String, Reader) with 'Name' and reader is StringReader(String); when 'null'; then return 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.String FreeMarkerTemplate.process(Object)"})
  void testProcess_givenTemplateWithNameAndReaderIsStringReader_whenNull_thenReturnFoo() throws IOException {
    // Arrange, Act and Assert
    assertEquals("foo", (new FreeMarkerTemplate(new Template("Name", new StringReader("foo")))).process(null));
  }

  /**
   * Test {@link FreeMarkerTemplate#process(Object)}.
   * <ul>
   *   <li>Given {@link Template#Template(String, Reader)} with name is {@code 42} and reader is {@link StringReader#StringReader(String)}.</li>
   *   <li>Then return {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FreeMarkerTemplate#process(Object)}
   */
  @Test
  @DisplayName("Test process(Object); given Template(String, Reader) with name is '42' and reader is StringReader(String); then return 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.String FreeMarkerTemplate.process(Object)"})
  void testProcess_givenTemplateWithNameIs42AndReaderIsStringReader_thenReturnFoo() throws IOException {
    // Arrange, Act and Assert
    assertEquals("foo", (new FreeMarkerTemplate(new Template("42", new StringReader("foo")))).process(null));
  }

  /**
   * Test {@link FreeMarkerTemplate#process(Object)}.
   * <ul>
   *   <li>Then throw {@link TemplateException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FreeMarkerTemplate#process(Object)}
   */
  @Test
  @DisplayName("Test process(Object); then throw TemplateException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.String FreeMarkerTemplate.process(Object)"})
  void testProcess_thenThrowTemplateException() throws IOException {
    // Arrange
    Template template = new Template("Name", new StringReader("foo"));
    template.addAutoImport("Namespace Var Name", "Template Name");

    // Act and Assert
    assertThrows(TemplateException.class, () -> (new FreeMarkerTemplate(template)).process(null));
  }
}
