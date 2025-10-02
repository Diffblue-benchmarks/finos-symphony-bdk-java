package com.symphony.bdk.core.service.message.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MessageUtilDiffblueTest {
  /**
   * Test {@link MessageUtil#escapeSpecialChars(String)}.
   *
   * <ul>
   *   <li>When {@code &}.
   *   <li>Then return {@code &amp;}.
   * </ul>
   *
   * <p>Method under test: {@link MessageUtil#escapeSpecialChars(String)}
   */
  @Test
  @DisplayName("Test escapeSpecialChars(String); when '&'; then return '&amp;'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String MessageUtil.escapeSpecialChars(String)"})
  void testEscapeSpecialChars_whenAmpersand_thenReturnAmp() {
    // Arrange, Act and Assert
    assertEquals("&amp;", MessageUtil.escapeSpecialChars("&"));
  }

  /**
   * Test {@link MessageUtil#escapeSpecialChars(String)}.
   *
   * <ul>
   *   <li>When {@code Raw Text}.
   *   <li>Then return {@code Raw Text}.
   * </ul>
   *
   * <p>Method under test: {@link MessageUtil#escapeSpecialChars(String)}
   */
  @Test
  @DisplayName("Test escapeSpecialChars(String); when 'Raw Text'; then return 'Raw Text'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String MessageUtil.escapeSpecialChars(String)"})
  void testEscapeSpecialChars_whenRawText_thenReturnRawText() {
    // Arrange, Act and Assert
    assertEquals("Raw Text", MessageUtil.escapeSpecialChars("Raw Text"));
  }
}
