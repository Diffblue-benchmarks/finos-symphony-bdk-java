package com.symphony.bdk.core.activity.command;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.activity.AbstractActivity;
import com.symphony.bdk.core.activity.ActivityRegistry;
import com.symphony.bdk.core.activity.model.ActivityInfo;
import com.symphony.bdk.core.activity.model.ActivityType;
import com.symphony.bdk.core.activity.room.TestUserJoinedRoomActivity;
import com.symphony.bdk.core.auth.AuthSession;
import com.symphony.bdk.core.auth.impl.AbstractBotAuthenticator;
import com.symphony.bdk.core.auth.impl.AuthSessionImpl;
import com.symphony.bdk.core.config.model.BdkAgentConfig;
import com.symphony.bdk.core.config.model.BdkBotConfig;
import com.symphony.bdk.core.config.model.BdkClientConfig;
import com.symphony.bdk.core.config.model.BdkCommonJwtConfig;
import com.symphony.bdk.core.config.model.BdkConfig;
import com.symphony.bdk.core.config.model.BdkDatafeedConfig;
import com.symphony.bdk.core.config.model.BdkDatahoseConfig;
import com.symphony.bdk.core.config.model.BdkExtAppConfig;
import com.symphony.bdk.core.config.model.BdkProxyConfig;
import com.symphony.bdk.core.config.model.BdkRetryConfig;
import com.symphony.bdk.core.config.model.BdkSslConfig;
import com.symphony.bdk.core.retry.RetryWithRecoveryBuilder;
import com.symphony.bdk.core.service.datafeed.EventException;
import com.symphony.bdk.core.service.datafeed.impl.DatafeedLoopV1;
import com.symphony.bdk.core.service.message.MessageService;
import com.symphony.bdk.gen.api.AttachmentsApi;
import com.symphony.bdk.gen.api.DatafeedApi;
import com.symphony.bdk.gen.api.DefaultApi;
import com.symphony.bdk.gen.api.MessageApi;
import com.symphony.bdk.gen.api.MessageSuppressionApi;
import com.symphony.bdk.gen.api.MessagesApi;
import com.symphony.bdk.gen.api.PodApi;
import com.symphony.bdk.gen.api.StreamsApi;
import com.symphony.bdk.gen.api.model.UserV2;
import com.symphony.bdk.http.api.ApiClient;
import com.symphony.bdk.template.api.TemplateEngine;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class HelpCommandDiffblueTest {
  @Mock private ActivityRegistry activityRegistry;

  @InjectMocks private HelpCommand helpCommand;

  /**
   * Test {@link HelpCommand#HelpCommand(ActivityRegistry, MessageService)}.
   *
   * <p>Method under test: {@link HelpCommand#HelpCommand(ActivityRegistry, MessageService)}
   */
  @Test
  @DisplayName("Test new HelpCommand(ActivityRegistry, MessageService)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void HelpCommand.<init>(ActivityRegistry, MessageService)"})
  void testNewHelpCommand() {
    // Arrange
    ActivityRegistry activityRegistry = new ActivityRegistry(new UserV2(), null);
    MessageService messageService =
        new MessageService(
            mock(MessagesApi.class),
            mock(MessageApi.class),
            mock(MessageSuppressionApi.class),
            mock(StreamsApi.class),
            mock(PodApi.class),
            mock(AttachmentsApi.class),
            mock(DefaultApi.class),
            mock(TemplateEngine.class),
            mock(RetryWithRecoveryBuilder.class));

    // Act
    HelpCommand actualHelpCommand = new HelpCommand(activityRegistry, messageService);

    // Assert
    assertEquals("/help", actualHelpCommand.getSlashCommandName());
    ActivityInfo info = actualHelpCommand.getInfo();
    assertEquals("/help", info.name());
    assertEquals("List available commands (mention required)", info.description());
    assertNull(actualHelpCommand.getBotUserId());
    assertNull(actualHelpCommand.getBotDisplayName());
    assertEquals(ActivityType.COMMAND, info.type());
    assertFalse(actualHelpCommand.isAsynchronous());
  }

  /**
   * Test {@link HelpCommand#onActivity(CommandContext)} with {@code CommandContext}.
   *
   * <p>Method under test: {@link HelpCommand#onActivity(CommandContext)}
   */
  @Test
  @DisplayName("Test onActivity(CommandContext) with 'CommandContext'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void HelpCommand.onActivity(CommandContext)"})
  void testOnActivityWithCommandContext() {
    // Arrange
    TestUserJoinedRoomActivity testUserJoinedRoomActivity = new TestUserJoinedRoomActivity();
    testUserJoinedRoomActivity.setBeforeMatcher(mock(Consumer.class));
    testUserJoinedRoomActivity.setMatcher(mock(Function.class));
    testUserJoinedRoomActivity.setOnActivity(mock(Consumer.class));

    ArrayList<AbstractActivity<?, ?>> abstractActivityList = new ArrayList<>();
    abstractActivityList.add(testUserJoinedRoomActivity);
    org.mockito.Mockito.<List<AbstractActivity<?, ?>>>when(activityRegistry.getActivityList())
        .thenReturn(abstractActivityList);

    // Act
    helpCommand.onActivity(null);

    // Assert
    verify(activityRegistry).getActivityList();
  }

  /**
   * Test {@link HelpCommand#onActivity(CommandContext)} with {@code CommandContext}.
   *
   * <p>Method under test: {@link HelpCommand#onActivity(CommandContext)}
   */
  @Test
  @DisplayName("Test onActivity(CommandContext) with 'CommandContext'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void HelpCommand.onActivity(CommandContext)"})
  void testOnActivityWithCommandContext2() {
    // Arrange
    TestUserJoinedRoomActivity testUserJoinedRoomActivity = new TestUserJoinedRoomActivity();
    testUserJoinedRoomActivity.setBeforeMatcher(mock(Consumer.class));
    testUserJoinedRoomActivity.setMatcher(mock(Function.class));
    testUserJoinedRoomActivity.setOnActivity(mock(Consumer.class));

    TestUserJoinedRoomActivity testUserJoinedRoomActivity2 = new TestUserJoinedRoomActivity();
    testUserJoinedRoomActivity2.setBeforeMatcher(mock(Consumer.class));
    testUserJoinedRoomActivity2.setMatcher(mock(Function.class));
    testUserJoinedRoomActivity2.setOnActivity(mock(Consumer.class));

    ArrayList<AbstractActivity<?, ?>> abstractActivityList = new ArrayList<>();
    abstractActivityList.add(testUserJoinedRoomActivity2);
    abstractActivityList.add(testUserJoinedRoomActivity);
    org.mockito.Mockito.<List<AbstractActivity<?, ?>>>when(activityRegistry.getActivityList())
        .thenReturn(abstractActivityList);

    // Act
    helpCommand.onActivity(null);

    // Assert
    verify(activityRegistry).getActivityList();
  }

  /**
   * Test {@link HelpCommand#onActivity(CommandContext)} with {@code CommandContext}.
   *
   * <ul>
   *   <li>Then calls {@link ActivityRegistry#getActivityList()}.
   * </ul>
   *
   * <p>Method under test: {@link HelpCommand#onActivity(CommandContext)}
   */
  @Test
  @DisplayName(
      "Test onActivity(CommandContext) with 'CommandContext'; then calls getActivityList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void HelpCommand.onActivity(CommandContext)"})
  void testOnActivityWithCommandContext_thenCallsGetActivityList() {
    // Arrange
    org.mockito.Mockito.<List<AbstractActivity<?, ?>>>when(activityRegistry.getActivityList())
        .thenReturn(new ArrayList<>());

    // Act
    helpCommand.onActivity(null);

    // Assert
    verify(activityRegistry).getActivityList();
  }

  /**
   * Test {@link HelpCommand#onActivity(CommandContext)} with {@code CommandContext}.
   *
   * <ul>
   *   <li>Then throw {@link EventException}.
   * </ul>
   *
   * <p>Method under test: {@link HelpCommand#onActivity(CommandContext)}
   */
  @Test
  @DisplayName("Test onActivity(CommandContext) with 'CommandContext'; then throw EventException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void HelpCommand.onActivity(CommandContext)"})
  void testOnActivityWithCommandContext_thenThrowEventException() {
    // Arrange
    org.mockito.Mockito.<List<AbstractActivity<?, ?>>>when(activityRegistry.getActivityList())
        .thenThrow(new EventException("An error occurred"));

    // Act and Assert
    assertThrows(EventException.class, () -> helpCommand.onActivity(null));
    verify(activityRegistry).getActivityList();
  }

  /**
   * Test {@link HelpCommand#info()}.
   *
   * <p>Method under test: {@link HelpCommand#info()}
   */
  @Test
  @DisplayName("Test info()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ActivityInfo HelpCommand.info()"})
  void testInfo() {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    when(apiClient.getBasePath()).thenReturn("https://example.org/example");
    DatafeedApi datafeedApi = new DatafeedApi(apiClient);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkConfig config = new BdkConfig();
    config.setAgent(new BdkAgentConfig());
    config.setApp(new BdkExtAppConfig());
    config.setBot(new BdkBotConfig());
    config.setCommonJwt(new BdkCommonJwtConfig());
    config.setConnectionPoolMax(1);
    config.setConnectionPoolPerRoute(1);
    config.setConnectionTimeout(10);
    config.setContext("Context");
    config.setDatafeed(new BdkDatafeedConfig());
    config.setDatahose(new BdkDatahoseConfig());
    config.setDefaultHeaders(defaultHeaders);
    config.setHost("localhost");
    config.setKeyManager(new BdkClientConfig());
    config.setPod(new BdkClientConfig());
    config.setPort(8080);
    config.setProxy(new BdkProxyConfig());
    config.setReadTimeout(10);
    config.setRetry(new BdkRetryConfig());
    config.setScheme("Scheme");
    config.setSessionAuth(new BdkClientConfig());
    config.setSsl(new BdkSslConfig());
    AuthSessionImpl authSession = new AuthSessionImpl(mock(AbstractBotAuthenticator.class));

    DatafeedLoopV1 datafeedLoop =
        new DatafeedLoopV1(datafeedApi, authSession, config, new UserV2());
    ActivityRegistry activityRegistry = new ActivityRegistry(new UserV2(), datafeedLoop);
    MessageService messageService =
        new MessageService(
            mock(MessagesApi.class),
            mock(MessageApi.class),
            mock(MessageSuppressionApi.class),
            mock(StreamsApi.class),
            mock(PodApi.class),
            mock(AttachmentsApi.class),
            mock(DefaultApi.class),
            mock(AuthSession.class),
            mock(TemplateEngine.class),
            mock(RetryWithRecoveryBuilder.class));

    HelpCommand helpCommand = new HelpCommand(activityRegistry, messageService);

    // Act
    ActivityInfo actualInfoResult = helpCommand.info();

    // Assert
    verify(apiClient).getBasePath();
    assertEquals("/help", actualInfoResult.name());
    assertEquals("List available commands (mention required)", actualInfoResult.description());
    assertEquals(ActivityType.COMMAND, actualInfoResult.type());
  }
}
