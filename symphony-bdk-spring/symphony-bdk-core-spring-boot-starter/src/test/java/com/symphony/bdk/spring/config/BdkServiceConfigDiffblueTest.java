package com.symphony.bdk.spring.config;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.AuthSession;
import com.symphony.bdk.core.config.model.BdkConfig;
import com.symphony.bdk.core.config.model.BdkRetryConfig;
import com.symphony.bdk.core.service.message.MessageService;
import com.symphony.bdk.core.service.session.SessionService;
import com.symphony.bdk.gen.api.AppEntitlementApi;
import com.symphony.bdk.gen.api.ApplicationApi;
import com.symphony.bdk.gen.api.AttachmentsApi;
import com.symphony.bdk.gen.api.ConnectionApi;
import com.symphony.bdk.gen.api.DefaultApi;
import com.symphony.bdk.gen.api.DisclaimerApi;
import com.symphony.bdk.gen.api.MessageApi;
import com.symphony.bdk.gen.api.MessageSuppressionApi;
import com.symphony.bdk.gen.api.MessagesApi;
import com.symphony.bdk.gen.api.PodApi;
import com.symphony.bdk.gen.api.PresenceApi;
import com.symphony.bdk.gen.api.RoomMembershipApi;
import com.symphony.bdk.gen.api.SessionApi;
import com.symphony.bdk.gen.api.ShareApi;
import com.symphony.bdk.gen.api.StreamsApi;
import com.symphony.bdk.gen.api.model.UserV2;
import com.symphony.bdk.spring.service.BotInfoService;
import com.symphony.bdk.template.api.TemplateEngine;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkServiceConfigDiffblueTest {
  /**
   * Test {@link BdkServiceConfig#sessionService(SessionApi, AuthSession, BdkConfig)}.
   *
   * <p>Method under test: {@link BdkServiceConfig#sessionService(SessionApi, AuthSession,
   * BdkConfig)}
   */
  @Test
  @DisplayName("Test sessionService(SessionApi, AuthSession, BdkConfig)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SessionService BdkServiceConfig.sessionService(SessionApi, AuthSession, BdkConfig)"
  })
  void testSessionService() {
    // Arrange
    BdkServiceConfig bdkServiceConfig = new BdkServiceConfig();
    SessionApi sessionApi = mock(SessionApi.class);
    AuthSession botSession = mock(AuthSession.class);
    BdkConfig config = mock(BdkConfig.class);
    when(config.getRetry()).thenReturn(new BdkRetryConfig());

    // Act
    bdkServiceConfig.sessionService(sessionApi, botSession, config);

    // Assert
    verify(config).getRetry();
  }

  /**
   * Test {@link BdkServiceConfig#streamService(StreamsApi, RoomMembershipApi, ShareApi,
   * AuthSession, BdkConfig)}.
   *
   * <p>Method under test: {@link BdkServiceConfig#streamService(StreamsApi, RoomMembershipApi,
   * ShareApi, AuthSession, BdkConfig)}
   */
  @Test
  @DisplayName(
      "Test streamService(StreamsApi, RoomMembershipApi, ShareApi, AuthSession, BdkConfig)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.core.service.stream.StreamService BdkServiceConfig.streamService(StreamsApi, RoomMembershipApi, ShareApi, AuthSession, BdkConfig)"
  })
  void testStreamService() {
    // Arrange
    BdkServiceConfig bdkServiceConfig = new BdkServiceConfig();
    StreamsApi streamsApi = mock(StreamsApi.class);
    RoomMembershipApi roomMembershipApi = mock(RoomMembershipApi.class);
    ShareApi shareApi = mock(ShareApi.class);
    AuthSession botSession = mock(AuthSession.class);
    BdkConfig config = mock(BdkConfig.class);
    when(config.getRetry()).thenReturn(new BdkRetryConfig());

    // Act
    bdkServiceConfig.streamService(streamsApi, roomMembershipApi, shareApi, botSession, config);

    // Assert
    verify(config).getRetry();
  }

  /**
   * Test {@link BdkServiceConfig#disclaimerService(DisclaimerApi, AuthSession, BdkConfig)}.
   *
   * <p>Method under test: {@link BdkServiceConfig#disclaimerService(DisclaimerApi, AuthSession,
   * BdkConfig)}
   */
  @Test
  @DisplayName("Test disclaimerService(DisclaimerApi, AuthSession, BdkConfig)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.core.service.disclaimer.DisclaimerService BdkServiceConfig.disclaimerService(DisclaimerApi, AuthSession, BdkConfig)"
  })
  void testDisclaimerService() {
    // Arrange
    BdkServiceConfig bdkServiceConfig = new BdkServiceConfig();
    DisclaimerApi disclaimerApi = mock(DisclaimerApi.class);
    AuthSession botSession = mock(AuthSession.class);
    BdkConfig config = mock(BdkConfig.class);
    when(config.getRetry()).thenReturn(new BdkRetryConfig());

    // Act
    bdkServiceConfig.disclaimerService(disclaimerApi, botSession, config);

    // Assert
    verify(config).getRetry();
  }

  /**
   * Test {@link BdkServiceConfig#presenceService(PresenceApi, AuthSession, BdkConfig)}.
   *
   * <p>Method under test: {@link BdkServiceConfig#presenceService(PresenceApi, AuthSession,
   * BdkConfig)}
   */
  @Test
  @DisplayName("Test presenceService(PresenceApi, AuthSession, BdkConfig)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.core.service.presence.PresenceService BdkServiceConfig.presenceService(PresenceApi, AuthSession, BdkConfig)"
  })
  void testPresenceService() {
    // Arrange
    BdkServiceConfig bdkServiceConfig = new BdkServiceConfig();
    PresenceApi presenceApi = mock(PresenceApi.class);
    AuthSession botSession = mock(AuthSession.class);
    BdkConfig config = mock(BdkConfig.class);
    when(config.getRetry()).thenReturn(new BdkRetryConfig());

    // Act
    bdkServiceConfig.presenceService(presenceApi, botSession, config);

    // Assert
    verify(config).getRetry();
  }

  /**
   * Test {@link BdkServiceConfig#connectionService(ConnectionApi, AuthSession, BdkConfig)}.
   *
   * <p>Method under test: {@link BdkServiceConfig#connectionService(ConnectionApi, AuthSession,
   * BdkConfig)}
   */
  @Test
  @DisplayName("Test connectionService(ConnectionApi, AuthSession, BdkConfig)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.core.service.connection.ConnectionService BdkServiceConfig.connectionService(ConnectionApi, AuthSession, BdkConfig)"
  })
  void testConnectionService() {
    // Arrange
    BdkServiceConfig bdkServiceConfig = new BdkServiceConfig();
    ConnectionApi connectionApi = mock(ConnectionApi.class);
    AuthSession botSession = mock(AuthSession.class);
    BdkConfig config = mock(BdkConfig.class);
    when(config.getRetry()).thenReturn(new BdkRetryConfig());

    // Act
    bdkServiceConfig.connectionService(connectionApi, botSession, config);

    // Assert
    verify(config).getRetry();
  }

  /**
   * Test {@link BdkServiceConfig#applicationService(ApplicationApi, AppEntitlementApi, AuthSession,
   * BdkConfig)}.
   *
   * <p>Method under test: {@link BdkServiceConfig#applicationService(ApplicationApi,
   * AppEntitlementApi, AuthSession, BdkConfig)}
   */
  @Test
  @DisplayName("Test applicationService(ApplicationApi, AppEntitlementApi, AuthSession, BdkConfig)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.core.service.application.ApplicationService BdkServiceConfig.applicationService(ApplicationApi, AppEntitlementApi, AuthSession, BdkConfig)"
  })
  void testApplicationService() {
    // Arrange
    BdkServiceConfig bdkServiceConfig = new BdkServiceConfig();
    ApplicationApi applicationApi = mock(ApplicationApi.class);
    AppEntitlementApi appEntitlementApi = mock(AppEntitlementApi.class);
    AuthSession botSession = mock(AuthSession.class);
    BdkConfig config = mock(BdkConfig.class);
    when(config.getRetry()).thenReturn(new BdkRetryConfig());

    // Act
    bdkServiceConfig.applicationService(applicationApi, appEntitlementApi, botSession, config);

    // Assert
    verify(config).getRetry();
  }

  /**
   * Test {@link BdkServiceConfig#messageService(MessagesApi, MessageApi, MessageSuppressionApi,
   * StreamsApi, PodApi, AttachmentsApi, DefaultApi, AuthSession, TemplateEngine, BdkConfig)}.
   *
   * <p>Method under test: {@link BdkServiceConfig#messageService(MessagesApi, MessageApi,
   * MessageSuppressionApi, StreamsApi, PodApi, AttachmentsApi, DefaultApi, AuthSession,
   * TemplateEngine, BdkConfig)}
   */
  @Test
  @DisplayName(
      "Test messageService(MessagesApi, MessageApi, MessageSuppressionApi, StreamsApi, PodApi, AttachmentsApi, DefaultApi, AuthSession, TemplateEngine, BdkConfig)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MessageService BdkServiceConfig.messageService(MessagesApi, MessageApi, MessageSuppressionApi, StreamsApi, PodApi, AttachmentsApi, DefaultApi, AuthSession, TemplateEngine, BdkConfig)"
  })
  void testMessageService() {
    // Arrange
    BdkServiceConfig bdkServiceConfig = new BdkServiceConfig();
    MessagesApi messagesApi = mock(MessagesApi.class);
    MessageApi messageApi = mock(MessageApi.class);
    MessageSuppressionApi messageSuppressionApi = mock(MessageSuppressionApi.class);
    StreamsApi streamsApi = mock(StreamsApi.class);
    PodApi podApi = mock(PodApi.class);
    AttachmentsApi attachmentsApi = mock(AttachmentsApi.class);
    DefaultApi defaultApi = mock(DefaultApi.class);
    AuthSession botSession = mock(AuthSession.class);
    TemplateEngine templateEngine = mock(TemplateEngine.class);
    BdkConfig config = mock(BdkConfig.class);
    when(config.getRetry()).thenReturn(new BdkRetryConfig());

    // Act
    MessageService actualMessageServiceResult =
        bdkServiceConfig.messageService(
            messagesApi,
            messageApi,
            messageSuppressionApi,
            streamsApi,
            podApi,
            attachmentsApi,
            defaultApi,
            botSession,
            templateEngine,
            config);

    // Assert
    verify(config).getRetry();
    assertSame(templateEngine, actualMessageServiceResult.templates());
  }

  /**
   * Test {@link BdkServiceConfig#botInfoService(SessionService)}.
   *
   * <ul>
   *   <li>Given {@link UserV2} (default constructor).
   *   <li>Then return BotInfo is {@link UserV2} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link BdkServiceConfig#botInfoService(SessionService)}
   */
  @Test
  @DisplayName(
      "Test botInfoService(SessionService); given UserV2 (default constructor); then return BotInfo is UserV2 (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BotInfoService BdkServiceConfig.botInfoService(SessionService)"})
  void testBotInfoService_givenUserV2_thenReturnBotInfoIsUserV2() {
    // Arrange
    BdkServiceConfig bdkServiceConfig = new BdkServiceConfig();
    SessionService sessionService = mock(SessionService.class);
    UserV2 userV2 = new UserV2();
    when(sessionService.getSession()).thenReturn(userV2);

    // Act
    BotInfoService actualBotInfoServiceResult = bdkServiceConfig.botInfoService(sessionService);

    // Assert
    verify(sessionService).getSession();
    assertSame(userV2, actualBotInfoServiceResult.getBotInfo());
  }
}
