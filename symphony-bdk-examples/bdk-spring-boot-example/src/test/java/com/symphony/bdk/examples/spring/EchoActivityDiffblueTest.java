package com.symphony.bdk.examples.spring;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.activity.command.CommandContext;
import com.symphony.bdk.core.activity.parsing.Cashtag;
import com.symphony.bdk.core.activity.parsing.Hashtag;
import com.symphony.bdk.core.activity.parsing.Mention;
import com.symphony.bdk.core.service.message.MessageService;
import com.symphony.bdk.gen.api.model.V4Message;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.aot.DisabledInAotMode;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {EchoActivity.class})
@DisabledInAotMode
@ExtendWith(SpringExtension.class)
class EchoActivityDiffblueTest {
  @Autowired private EchoActivity echoActivity;

  @MockBean private MessageService messageService;

  /**
   * Test {@link EchoActivity#echo(CommandContext, String, Cashtag)} with {@code context}, {@code
   * argument}, {@code cashtag}.
   *
   * <ul>
   *   <li>Then calls {@link CommandContext#getStreamId()}.
   * </ul>
   *
   * <p>Method under test: {@link EchoActivity#echo(CommandContext, String, Cashtag)}
   */
  @Test
  @DisplayName(
      "Test echo(CommandContext, String, Cashtag) with 'context', 'argument', 'cashtag'; then calls getStreamId()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void EchoActivity.echo(CommandContext, String, Cashtag)"})
  void testEchoWithContextArgumentCashtag_thenCallsGetStreamId() {
    // Arrange
    when(messageService.send(Mockito.<String>any(), Mockito.<String>any()))
        .thenReturn(new V4Message());
    CommandContext context = mock(CommandContext.class);
    when(context.getStreamId()).thenReturn("42");

    // Act
    echoActivity.echo(context, "Argument", new Cashtag("Text", "42"));

    // Assert
    verify(context).getStreamId();
    verify(messageService).send("42", "Received argument: Argument and cashtag: 42");
  }

  /**
   * Test {@link EchoActivity#echo(CommandContext, String)} with {@code context}, {@code argument}.
   *
   * <ul>
   *   <li>Then calls {@link CommandContext#getEventTimestamp()}.
   * </ul>
   *
   * <p>Method under test: {@link EchoActivity#echo(CommandContext, String)}
   */
  @Test
  @DisplayName(
      "Test echo(CommandContext, String) with 'context', 'argument'; then calls getEventTimestamp()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void EchoActivity.echo(CommandContext, String)"})
  void testEchoWithContextArgument_thenCallsGetEventTimestamp() {
    // Arrange
    when(messageService.send(Mockito.<String>any(), Mockito.<String>any()))
        .thenReturn(new V4Message());
    CommandContext context = mock(CommandContext.class);
    when(context.getEventTimestamp()).thenReturn(1L);
    when(context.getStreamId()).thenReturn("42");

    // Act
    echoActivity.echo(context, "Argument");

    // Assert
    verify(context).getEventTimestamp();
    verify(context).getStreamId();
    verify(messageService).send("42", "Received argument: Argument at 1970-01-01T00:00:00.001Z");
  }

  /**
   * Test {@link EchoActivity#echo(CommandContext, Cashtag)} with {@code context}, {@code cashtag}.
   *
   * <ul>
   *   <li>Then calls {@link CommandContext#getStreamId()}.
   * </ul>
   *
   * <p>Method under test: {@link EchoActivity#echo(CommandContext, Cashtag)}
   */
  @Test
  @DisplayName(
      "Test echo(CommandContext, Cashtag) with 'context', 'cashtag'; then calls getStreamId()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void EchoActivity.echo(CommandContext, Cashtag)"})
  void testEchoWithContextCashtag_thenCallsGetStreamId() {
    // Arrange
    when(messageService.send(Mockito.<String>any(), Mockito.<String>any()))
        .thenReturn(new V4Message());
    CommandContext context = mock(CommandContext.class);
    when(context.getStreamId()).thenReturn("42");

    // Act
    echoActivity.echo(context, new Cashtag("Text", "42"));

    // Assert
    verify(context).getStreamId();
    verify(messageService).send("42", "Received cashtag: 42");
  }

  /**
   * Test {@link EchoActivity#echo(CommandContext, Hashtag)} with {@code context}, {@code hashtag}.
   *
   * <ul>
   *   <li>Then calls {@link CommandContext#getStreamId()}.
   * </ul>
   *
   * <p>Method under test: {@link EchoActivity#echo(CommandContext, Hashtag)}
   */
  @Test
  @DisplayName(
      "Test echo(CommandContext, Hashtag) with 'context', 'hashtag'; then calls getStreamId()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void EchoActivity.echo(CommandContext, Hashtag)"})
  void testEchoWithContextHashtag_thenCallsGetStreamId() {
    // Arrange
    when(messageService.send(Mockito.<String>any(), Mockito.<String>any()))
        .thenReturn(new V4Message());
    CommandContext context = mock(CommandContext.class);
    when(context.getStreamId()).thenReturn("42");

    // Act
    echoActivity.echo(context, new Hashtag("Text", "42"));

    // Assert
    verify(context).getStreamId();
    verify(messageService).send("42", "Received hashtag: 42");
  }

  /**
   * Test {@link EchoActivity#echo(CommandContext, Mention)} with {@code context}, {@code mention}.
   *
   * <ul>
   *   <li>Then calls {@link CommandContext#getStreamId()}.
   * </ul>
   *
   * <p>Method under test: {@link EchoActivity#echo(CommandContext, Mention)}
   */
  @Test
  @DisplayName(
      "Test echo(CommandContext, Mention) with 'context', 'mention'; then calls getStreamId()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void EchoActivity.echo(CommandContext, Mention)"})
  void testEchoWithContextMention_thenCallsGetStreamId() {
    // Arrange
    when(messageService.send(Mockito.<String>any(), Mockito.<String>any()))
        .thenReturn(new V4Message());
    CommandContext context = mock(CommandContext.class);
    when(context.getStreamId()).thenReturn("42");

    // Act
    echoActivity.echo(context, new Mention("Text", 1L));

    // Assert
    verify(context).getStreamId();
    verify(messageService).send("42", "Received mention: ext of id: 1");
  }
}
