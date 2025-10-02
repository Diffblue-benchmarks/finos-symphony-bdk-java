package com.symphony.bdk.examples.activity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.activity.model.ActivityInfo;
import com.symphony.bdk.core.activity.model.ActivityType;
import com.symphony.bdk.examples.activity.context.GifCommandContext;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class GifCommandDiffblueTest {
  /**
   * Test {@link GifCommand#pattern()}.
   *
   * <p>Method under test: {@link GifCommand#pattern()}
   */
  @Test
  @DisplayName("Test pattern()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.regex.Pattern GifCommand.pattern()"})
  void testPattern() {
    // Arrange, Act and Assert
    assertEquals("^@null /gif ([a-zA-Z]+).*$", new GifCommand().pattern().pattern());
  }

  /**
   * Test {@link GifCommand#onActivity(GifCommandContext)} with {@code GifCommandContext}.
   *
   * <ul>
   *   <li>Given {@code Category}.
   *   <li>Then calls {@link GifCommandContext#getCategory()}.
   * </ul>
   *
   * <p>Method under test: {@link GifCommand#onActivity(GifCommandContext)}
   */
  @Test
  @DisplayName(
      "Test onActivity(GifCommandContext) with 'GifCommandContext'; given 'Category'; then calls getCategory()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GifCommand.onActivity(GifCommandContext)"})
  void testOnActivityWithGifCommandContext_givenCategory_thenCallsGetCategory() {
    // Arrange
    GifCommand gifCommand = new GifCommand();

    GifCommandContext context = mock(GifCommandContext.class);
    when(context.getCategory()).thenReturn("Category");

    // Act
    gifCommand.onActivity(context);

    // Assert
    verify(context).getCategory();
  }

  /**
   * Test {@link GifCommand#info()}.
   *
   * <p>Method under test: {@link GifCommand#info()}
   */
  @Test
  @DisplayName("Test info()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ActivityInfo GifCommand.info()"})
  void testInfo() {
    // Arrange and Act
    ActivityInfo actualInfoResult = new GifCommand().info();

    // Assert
    assertEquals("Gif Random by Category command", actualInfoResult.name());
    assertEquals("Usage: @BotMention /gif {category}", actualInfoResult.description());
    assertEquals(ActivityType.COMMAND, actualInfoResult.type());
  }

  /**
   * Test new {@link GifCommand} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link GifCommand}
   */
  @Test
  @DisplayName("Test new GifCommand (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GifCommand.<init>()"})
  void testNewGifCommand() {
    // Arrange and Act
    GifCommand actualGifCommand = new GifCommand();

    // Assert
    ActivityInfo info = actualGifCommand.getInfo();
    assertEquals("Gif Random by Category command", info.name());
    assertEquals("Usage: @BotMention /gif {category}", info.description());
    assertNull(actualGifCommand.getBotUserId());
    assertNull(actualGifCommand.getBotDisplayName());
    assertEquals(ActivityType.COMMAND, info.type());
  }
}
