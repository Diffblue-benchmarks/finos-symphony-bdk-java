package com.symphony.bdk.core.activity.command;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.activity.model.ActivityInfo;
import com.symphony.bdk.core.activity.model.ActivityType;
import java.util.function.Consumer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SlashCommandDiffblueTest {
  /**
   * Test {@link SlashCommand#SlashCommand(String, boolean, boolean, Consumer, String)}.
   *
   * <p>Method under test: {@link SlashCommand#SlashCommand(String, boolean, boolean, Consumer,
   * String)}
   */
  @Test
  @DisplayName("Test new SlashCommand(String, boolean, boolean, Consumer, String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SlashCommand.<init>(String, boolean, boolean, Consumer, String)"})
  void testNewSlashCommand() {
    // Arrange and Act
    SlashCommand actualSlashCommand =
        new SlashCommand(
            "Slash Command Pattern",
            false,
            true,
            mock(Consumer.class),
            "The characteristics of someone or something");

    // Assert
    assertEquals("Slash Command Pattern", actualSlashCommand.getSlashCommandName());
    ActivityInfo info = actualSlashCommand.getInfo();
    assertEquals("Slash Command Pattern", info.name());
    assertEquals(
        "The characteristics of someone or something (mention not required)", info.description());
    assertNull(actualSlashCommand.getBotUserId());
    assertNull(actualSlashCommand.getBotDisplayName());
    assertEquals(ActivityType.COMMAND, info.type());
    assertTrue(actualSlashCommand.isAsynchronous());
  }

  /**
   * Test {@link SlashCommand#SlashCommand(String, boolean, boolean, Consumer, String)}.
   *
   * <ul>
   *   <li>Then return SlashCommandName is {@code Slash Command Pattern}.
   * </ul>
   *
   * <p>Method under test: {@link SlashCommand#SlashCommand(String, boolean, boolean, Consumer,
   * String)}
   */
  @Test
  @DisplayName(
      "Test new SlashCommand(String, boolean, boolean, Consumer, String); then return SlashCommandName is 'Slash Command Pattern'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SlashCommand.<init>(String, boolean, boolean, Consumer, String)"})
  void testNewSlashCommand_thenReturnSlashCommandNameIsSlashCommandPattern() {
    // Arrange and Act
    SlashCommand actualSlashCommand =
        new SlashCommand(
            "Slash Command Pattern",
            true,
            true,
            mock(Consumer.class),
            "The characteristics of someone or something");

    // Assert
    assertEquals("Slash Command Pattern", actualSlashCommand.getSlashCommandName());
    ActivityInfo info = actualSlashCommand.getInfo();
    assertEquals("Slash Command Pattern", info.name());
    assertEquals(
        "The characteristics of someone or something (mention required)", info.description());
    assertNull(actualSlashCommand.getBotUserId());
    assertNull(actualSlashCommand.getBotDisplayName());
    assertEquals(ActivityType.COMMAND, info.type());
    assertTrue(actualSlashCommand.isAsynchronous());
  }

  /**
   * Test {@link SlashCommand#SlashCommand(String, boolean, boolean, Consumer, String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then return SlashCommandName is empty string.
   * </ul>
   *
   * <p>Method under test: {@link SlashCommand#SlashCommand(String, boolean, boolean, Consumer,
   * String)}
   */
  @Test
  @DisplayName(
      "Test new SlashCommand(String, boolean, boolean, Consumer, String); when empty string; then return SlashCommandName is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SlashCommand.<init>(String, boolean, boolean, Consumer, String)"})
  void testNewSlashCommand_whenEmptyString_thenReturnSlashCommandNameIsEmptyString() {
    // Arrange and Act
    SlashCommand actualSlashCommand =
        new SlashCommand(
            "", true, true, mock(Consumer.class), "The characteristics of someone or something");

    // Assert
    assertEquals("", actualSlashCommand.getSlashCommandName());
    ActivityInfo info = actualSlashCommand.getInfo();
    assertEquals("", info.name());
    assertEquals(
        "The characteristics of someone or something (mention required)", info.description());
    assertNull(actualSlashCommand.getBotUserId());
    assertNull(actualSlashCommand.getBotDisplayName());
    assertEquals(ActivityType.COMMAND, info.type());
    assertTrue(actualSlashCommand.isAsynchronous());
  }

  /**
   * Test {@link SlashCommand#SlashCommand(String, boolean, boolean, Consumer, String)}.
   *
   * <ul>
   *   <li>When {@code {#UU}}.
   *   <li>Then return SlashCommandName is {@code {#UU}}.
   * </ul>
   *
   * <p>Method under test: {@link SlashCommand#SlashCommand(String, boolean, boolean, Consumer,
   * String)}
   */
  @Test
  @DisplayName(
      "Test new SlashCommand(String, boolean, boolean, Consumer, String); when '{#UU}'; then return SlashCommandName is '{#UU}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SlashCommand.<init>(String, boolean, boolean, Consumer, String)"})
  void testNewSlashCommand_whenUu_thenReturnSlashCommandNameIsUu() {
    // Arrange and Act
    SlashCommand actualSlashCommand =
        new SlashCommand(
            "{#UU}",
            true,
            true,
            mock(Consumer.class),
            "The characteristics of someone or something");

    // Assert
    ActivityInfo info = actualSlashCommand.getInfo();
    assertEquals(
        "The characteristics of someone or something (mention required)", info.description());
    assertEquals("{#UU}", actualSlashCommand.getSlashCommandName());
    assertEquals("{#UU}", info.name());
    assertNull(actualSlashCommand.getBotUserId());
    assertNull(actualSlashCommand.getBotDisplayName());
    assertEquals(ActivityType.COMMAND, info.type());
    assertTrue(actualSlashCommand.isAsynchronous());
  }

  /**
   * Test {@link SlashCommand#SlashCommand(String, boolean, boolean, Consumer, String)}.
   *
   * <ul>
   *   <li>When {@code {UU}}.
   *   <li>Then return SlashCommandName is {@code {UU}}.
   * </ul>
   *
   * <p>Method under test: {@link SlashCommand#SlashCommand(String, boolean, boolean, Consumer,
   * String)}
   */
  @Test
  @DisplayName(
      "Test new SlashCommand(String, boolean, boolean, Consumer, String); when '{UU}'; then return SlashCommandName is '{UU}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SlashCommand.<init>(String, boolean, boolean, Consumer, String)"})
  void testNewSlashCommand_whenUu_thenReturnSlashCommandNameIsUu2() {
    // Arrange and Act
    SlashCommand actualSlashCommand =
        new SlashCommand(
            "{UU}",
            true,
            true,
            mock(Consumer.class),
            "The characteristics of someone or something");

    // Assert
    ActivityInfo info = actualSlashCommand.getInfo();
    assertEquals(
        "The characteristics of someone or something (mention required)", info.description());
    assertEquals("{UU}", actualSlashCommand.getSlashCommandName());
    assertEquals("{UU}", info.name());
    assertNull(actualSlashCommand.getBotUserId());
    assertNull(actualSlashCommand.getBotDisplayName());
    assertEquals(ActivityType.COMMAND, info.type());
    assertTrue(actualSlashCommand.isAsynchronous());
  }

  /**
   * Test {@link SlashCommand#isAsynchronous()}.
   *
   * <p>Method under test: {@link SlashCommand#isAsynchronous()}
   */
  @Test
  @DisplayName("Test isAsynchronous()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SlashCommand.isAsynchronous()"})
  void testIsAsynchronous() {
    // Arrange, Act and Assert
    assertFalse(
        SlashCommand.slash("Slash Command Pattern", true, mock(Consumer.class)).isAsynchronous());
  }
}
