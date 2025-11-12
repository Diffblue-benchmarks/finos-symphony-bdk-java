package com.symphony.bdk.core.service.message.util;

import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.service.message.exception.PresentationMLParserException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PresentationMLParserDiffblueTest {
  /**
   * Test {@link PresentationMLParser#getTextContent(String)} with {@code presentationML}.
   *
   * <p>Method under test: {@link PresentationMLParser#getTextContent(String)}
   */
  @Test
  @DisplayName("Test getTextContent(String) with 'presentationML'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String PresentationMLParser.getTextContent(String)"})
  void testGetTextContentWithPresentationML() throws PresentationMLParserException {
    // Arrange, Act and Assert
    assertThrows(
        PresentationMLParserException.class,
        () ->
            PresentationMLParser.getTextContent(
                "http://apache.org/xml/features/disallow-doctype-decl"));
  }

  /**
   * Test {@link PresentationMLParser#getTextContent(String, Boolean)} with {@code presentationML},
   * {@code trim}.
   *
   * <p>Method under test: {@link PresentationMLParser#getTextContent(String, Boolean)}
   */
  @Test
  @DisplayName("Test getTextContent(String, Boolean) with 'presentationML', 'trim'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String PresentationMLParser.getTextContent(String, Boolean)"})
  void testGetTextContentWithPresentationMLTrim() throws PresentationMLParserException {
    // Arrange, Act and Assert
    assertThrows(
        PresentationMLParserException.class,
        () -> PresentationMLParser.getTextContent("Presentation ML", true));
  }

  /**
   * Test {@link PresentationMLParser#getTextContent(String)} with {@code presentationML}.
   *
   * <ul>
   *   <li>When {@code Presentation ML}.
   * </ul>
   *
   * <p>Method under test: {@link PresentationMLParser#getTextContent(String)}
   */
  @Test
  @DisplayName("Test getTextContent(String) with 'presentationML'; when 'Presentation ML'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String PresentationMLParser.getTextContent(String)"})
  void testGetTextContentWithPresentationML_whenPresentationMl()
      throws PresentationMLParserException {
    // Arrange, Act and Assert
    assertThrows(
        PresentationMLParserException.class,
        () -> PresentationMLParser.getTextContent("Presentation ML"));
  }
}
