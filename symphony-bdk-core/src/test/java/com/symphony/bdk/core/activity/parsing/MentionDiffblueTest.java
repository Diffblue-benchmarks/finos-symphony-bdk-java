package com.symphony.bdk.core.activity.parsing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MentionDiffblueTest {
  /**
   * Test {@link Mention#Mention(String, Long)}.
   *
   * <ul>
   *   <li>When {@code Text}.
   *   <li>Then return {@code Text}.
   * </ul>
   *
   * <p>Method under test: {@link Mention#Mention(String, Long)}
   */
  @Test
  @DisplayName("Test new Mention(String, Long); when 'Text'; then return 'Text'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Mention.<init>(String, Long)"})
  void testNewMention_whenText_thenReturnText() {
    // Arrange and Act
    Mention actualMention = new Mention("Text", 1L);

    // Assert
    assertEquals("Text", actualMention.getText());
    assertEquals("Text", actualMention.toString());
    assertEquals("ext", actualMention.getUserDisplayName());
    assertEquals(1L, actualMention.getUserId().longValue());
  }

  /**
   * Test {@link Mention#toString()}.
   *
   * <p>Method under test: {@link Mention#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Mention.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("Text", new Mention("Text", 1L).toString());
  }
}
