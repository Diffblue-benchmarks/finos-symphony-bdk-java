package com.symphony.bdk.spring.config;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.AuthenticatorFactory;
import com.symphony.bdk.core.client.ApiClientFactory;
import com.symphony.bdk.core.config.model.BdkConfig;
import com.symphony.bdk.core.config.model.BdkRetryConfig;
import com.symphony.bdk.core.service.message.MessageService;
import com.symphony.bdk.gen.api.AttachmentsApi;
import com.symphony.bdk.gen.api.AuditTrailApi;
import com.symphony.bdk.gen.api.ConnectionApi;
import com.symphony.bdk.gen.api.DefaultApi;
import com.symphony.bdk.gen.api.MessageApi;
import com.symphony.bdk.gen.api.MessageSuppressionApi;
import com.symphony.bdk.gen.api.MessagesApi;
import com.symphony.bdk.gen.api.PodApi;
import com.symphony.bdk.gen.api.PresenceApi;
import com.symphony.bdk.gen.api.RoomMembershipApi;
import com.symphony.bdk.gen.api.SessionApi;
import com.symphony.bdk.gen.api.ShareApi;
import com.symphony.bdk.gen.api.SignalsApi;
import com.symphony.bdk.gen.api.StreamsApi;
import com.symphony.bdk.gen.api.UserApi;
import com.symphony.bdk.gen.api.UsersApi;
import com.symphony.bdk.template.api.TemplateEngine;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanInitializationException;

class BdkOboServiceConfigDiffblueTest {
  /**
   * Test {@link BdkOboServiceConfig#extensionAppAuthenticator(AuthenticatorFactory)}.
   * <ul>
   *   <li>Then throw {@link BeanInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkOboServiceConfig#extensionAppAuthenticator(AuthenticatorFactory)}
   */
  @Test
  @DisplayName("Test extensionAppAuthenticator(AuthenticatorFactory); then throw BeanInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.core.auth.ExtensionAppAuthenticator BdkOboServiceConfig.extensionAppAuthenticator(AuthenticatorFactory)"})
  void testExtensionAppAuthenticator_thenThrowBeanInitializationException() {
    // Arrange
    BdkOboServiceConfig bdkOboServiceConfig = new BdkOboServiceConfig();
    BdkConfig bdkConfig = new BdkConfig();

    // Act and Assert
    assertThrows(BeanInitializationException.class, () -> bdkOboServiceConfig
        .extensionAppAuthenticator(new AuthenticatorFactory(bdkConfig, new ApiClientFactory(new BdkConfig()))));
  }

  /**
   * Test {@link BdkOboServiceConfig#oboAuthenticator(AuthenticatorFactory)}.
   * <ul>
   *   <li>Then throw {@link BeanInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkOboServiceConfig#oboAuthenticator(AuthenticatorFactory)}
   */
  @Test
  @DisplayName("Test oboAuthenticator(AuthenticatorFactory); then throw BeanInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.core.auth.OboAuthenticator BdkOboServiceConfig.oboAuthenticator(AuthenticatorFactory)"})
  void testOboAuthenticator_thenThrowBeanInitializationException() {
    // Arrange
    BdkOboServiceConfig bdkOboServiceConfig = new BdkOboServiceConfig();
    BdkConfig bdkConfig = new BdkConfig();

    // Act and Assert
    assertThrows(BeanInitializationException.class, () -> bdkOboServiceConfig
        .oboAuthenticator(new AuthenticatorFactory(bdkConfig, new ApiClientFactory(new BdkConfig()))));
  }

  /**
   * Test {@link BdkOboServiceConfig#oboSessionService(SessionApi, BdkConfig)}.
   * <ul>
   *   <li>Given {@link BdkRetryConfig#BdkRetryConfig()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkOboServiceConfig#oboSessionService(SessionApi, BdkConfig)}
   */
  @Test
  @DisplayName("Test oboSessionService(SessionApi, BdkConfig); given BdkRetryConfig()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.core.service.session.SessionService BdkOboServiceConfig.oboSessionService(SessionApi, BdkConfig)"})
  void testOboSessionService_givenBdkRetryConfig() {
    // Arrange
    BdkOboServiceConfig bdkOboServiceConfig = new BdkOboServiceConfig();
    SessionApi sessionApi = mock(SessionApi.class);
    BdkConfig config = mock(BdkConfig.class);
    when(config.getRetry()).thenReturn(new BdkRetryConfig());

    // Act
    bdkOboServiceConfig.oboSessionService(sessionApi, config);

    // Assert
    verify(config).getRetry();
  }

  /**
   * Test {@link BdkOboServiceConfig#oboSessionService(SessionApi, BdkConfig)}.
   * <ul>
   *   <li>Then throw {@link BeanInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkOboServiceConfig#oboSessionService(SessionApi, BdkConfig)}
   */
  @Test
  @DisplayName("Test oboSessionService(SessionApi, BdkConfig); then throw BeanInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.core.service.session.SessionService BdkOboServiceConfig.oboSessionService(SessionApi, BdkConfig)"})
  void testOboSessionService_thenThrowBeanInitializationException() {
    // Arrange
    BdkOboServiceConfig bdkOboServiceConfig = new BdkOboServiceConfig();
    SessionApi sessionApi = mock(SessionApi.class);
    BdkConfig config = mock(BdkConfig.class);
    when(config.getRetry()).thenThrow(new BeanInitializationException("Msg"));

    // Act and Assert
    assertThrows(BeanInitializationException.class, () -> bdkOboServiceConfig.oboSessionService(sessionApi, config));
    verify(config).getRetry();
  }

  /**
   * Test {@link BdkOboServiceConfig#oboStreamService(StreamsApi, RoomMembershipApi, ShareApi, BdkConfig)}.
   * <ul>
   *   <li>Given {@link BdkRetryConfig#BdkRetryConfig()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkOboServiceConfig#oboStreamService(StreamsApi, RoomMembershipApi, ShareApi, BdkConfig)}
   */
  @Test
  @DisplayName("Test oboStreamService(StreamsApi, RoomMembershipApi, ShareApi, BdkConfig); given BdkRetryConfig()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.core.service.stream.StreamService BdkOboServiceConfig.oboStreamService(StreamsApi, RoomMembershipApi, ShareApi, BdkConfig)"})
  void testOboStreamService_givenBdkRetryConfig() {
    // Arrange
    BdkOboServiceConfig bdkOboServiceConfig = new BdkOboServiceConfig();
    StreamsApi streamsApi = mock(StreamsApi.class);
    RoomMembershipApi roomMembershipApi = mock(RoomMembershipApi.class);
    ShareApi shareApi = mock(ShareApi.class);
    BdkConfig config = mock(BdkConfig.class);
    when(config.getRetry()).thenReturn(new BdkRetryConfig());

    // Act
    bdkOboServiceConfig.oboStreamService(streamsApi, roomMembershipApi, shareApi, config);

    // Assert
    verify(config).getRetry();
  }

  /**
   * Test {@link BdkOboServiceConfig#oboStreamService(StreamsApi, RoomMembershipApi, ShareApi, BdkConfig)}.
   * <ul>
   *   <li>Then throw {@link BeanInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkOboServiceConfig#oboStreamService(StreamsApi, RoomMembershipApi, ShareApi, BdkConfig)}
   */
  @Test
  @DisplayName("Test oboStreamService(StreamsApi, RoomMembershipApi, ShareApi, BdkConfig); then throw BeanInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.core.service.stream.StreamService BdkOboServiceConfig.oboStreamService(StreamsApi, RoomMembershipApi, ShareApi, BdkConfig)"})
  void testOboStreamService_thenThrowBeanInitializationException() {
    // Arrange
    BdkOboServiceConfig bdkOboServiceConfig = new BdkOboServiceConfig();
    StreamsApi streamsApi = mock(StreamsApi.class);
    RoomMembershipApi roomMembershipApi = mock(RoomMembershipApi.class);
    ShareApi shareApi = mock(ShareApi.class);
    BdkConfig config = mock(BdkConfig.class);
    when(config.getRetry()).thenThrow(new BeanInitializationException("Msg"));

    // Act and Assert
    assertThrows(BeanInitializationException.class,
        () -> bdkOboServiceConfig.oboStreamService(streamsApi, roomMembershipApi, shareApi, config));
    verify(config).getRetry();
  }

  /**
   * Test {@link BdkOboServiceConfig#oboUserService(UserApi, UsersApi, AuditTrailApi, BdkConfig)}.
   * <ul>
   *   <li>Given {@link BdkRetryConfig#BdkRetryConfig()}.</li>
   *   <li>When {@link BdkConfig} {@link BdkConfig#getRetry()} return {@link BdkRetryConfig#BdkRetryConfig()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkOboServiceConfig#oboUserService(UserApi, UsersApi, AuditTrailApi, BdkConfig)}
   */
  @Test
  @DisplayName("Test oboUserService(UserApi, UsersApi, AuditTrailApi, BdkConfig); given BdkRetryConfig(); when BdkConfig getRetry() return BdkRetryConfig()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.core.service.user.UserService BdkOboServiceConfig.oboUserService(UserApi, UsersApi, AuditTrailApi, BdkConfig)"})
  void testOboUserService_givenBdkRetryConfig_whenBdkConfigGetRetryReturnBdkRetryConfig() {
    // Arrange
    BdkOboServiceConfig bdkOboServiceConfig = new BdkOboServiceConfig();
    UserApi userApi = mock(UserApi.class);
    UsersApi usersApi = mock(UsersApi.class);
    AuditTrailApi auditTrailApi = mock(AuditTrailApi.class);
    BdkConfig config = mock(BdkConfig.class);
    when(config.getRetry()).thenReturn(new BdkRetryConfig());

    // Act
    bdkOboServiceConfig.oboUserService(userApi, usersApi, auditTrailApi, config);

    // Assert
    verify(config).getRetry();
  }

  /**
   * Test {@link BdkOboServiceConfig#oboUserService(UserApi, UsersApi, AuditTrailApi, BdkConfig)}.
   * <ul>
   *   <li>Then throw {@link BeanInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkOboServiceConfig#oboUserService(UserApi, UsersApi, AuditTrailApi, BdkConfig)}
   */
  @Test
  @DisplayName("Test oboUserService(UserApi, UsersApi, AuditTrailApi, BdkConfig); then throw BeanInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.core.service.user.UserService BdkOboServiceConfig.oboUserService(UserApi, UsersApi, AuditTrailApi, BdkConfig)"})
  void testOboUserService_thenThrowBeanInitializationException() {
    // Arrange
    BdkOboServiceConfig bdkOboServiceConfig = new BdkOboServiceConfig();
    UserApi userApi = mock(UserApi.class);
    UsersApi usersApi = mock(UsersApi.class);
    AuditTrailApi auditTrailApi = mock(AuditTrailApi.class);
    BdkConfig config = mock(BdkConfig.class);
    when(config.getRetry()).thenThrow(new BeanInitializationException("Msg"));

    // Act and Assert
    assertThrows(BeanInitializationException.class,
        () -> bdkOboServiceConfig.oboUserService(userApi, usersApi, auditTrailApi, config));
    verify(config).getRetry();
  }

  /**
   * Test {@link BdkOboServiceConfig#oboPresenceService(PresenceApi, BdkConfig)}.
   * <ul>
   *   <li>Given {@link BdkRetryConfig#BdkRetryConfig()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkOboServiceConfig#oboPresenceService(PresenceApi, BdkConfig)}
   */
  @Test
  @DisplayName("Test oboPresenceService(PresenceApi, BdkConfig); given BdkRetryConfig()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.core.service.presence.PresenceService BdkOboServiceConfig.oboPresenceService(PresenceApi, BdkConfig)"})
  void testOboPresenceService_givenBdkRetryConfig() {
    // Arrange
    BdkOboServiceConfig bdkOboServiceConfig = new BdkOboServiceConfig();
    PresenceApi presenceApi = mock(PresenceApi.class);
    BdkConfig config = mock(BdkConfig.class);
    when(config.getRetry()).thenReturn(new BdkRetryConfig());

    // Act
    bdkOboServiceConfig.oboPresenceService(presenceApi, config);

    // Assert
    verify(config).getRetry();
  }

  /**
   * Test {@link BdkOboServiceConfig#oboPresenceService(PresenceApi, BdkConfig)}.
   * <ul>
   *   <li>Then throw {@link BeanInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkOboServiceConfig#oboPresenceService(PresenceApi, BdkConfig)}
   */
  @Test
  @DisplayName("Test oboPresenceService(PresenceApi, BdkConfig); then throw BeanInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.core.service.presence.PresenceService BdkOboServiceConfig.oboPresenceService(PresenceApi, BdkConfig)"})
  void testOboPresenceService_thenThrowBeanInitializationException() {
    // Arrange
    BdkOboServiceConfig bdkOboServiceConfig = new BdkOboServiceConfig();
    PresenceApi presenceApi = mock(PresenceApi.class);
    BdkConfig config = mock(BdkConfig.class);
    when(config.getRetry()).thenThrow(new BeanInitializationException("Msg"));

    // Act and Assert
    assertThrows(BeanInitializationException.class, () -> bdkOboServiceConfig.oboPresenceService(presenceApi, config));
    verify(config).getRetry();
  }

  /**
   * Test {@link BdkOboServiceConfig#oboConnectionService(ConnectionApi, BdkConfig)}.
   * <ul>
   *   <li>Given {@link BdkRetryConfig#BdkRetryConfig()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkOboServiceConfig#oboConnectionService(ConnectionApi, BdkConfig)}
   */
  @Test
  @DisplayName("Test oboConnectionService(ConnectionApi, BdkConfig); given BdkRetryConfig()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.core.service.connection.ConnectionService BdkOboServiceConfig.oboConnectionService(ConnectionApi, BdkConfig)"})
  void testOboConnectionService_givenBdkRetryConfig() {
    // Arrange
    BdkOboServiceConfig bdkOboServiceConfig = new BdkOboServiceConfig();
    ConnectionApi connectionApi = mock(ConnectionApi.class);
    BdkConfig config = mock(BdkConfig.class);
    when(config.getRetry()).thenReturn(new BdkRetryConfig());

    // Act
    bdkOboServiceConfig.oboConnectionService(connectionApi, config);

    // Assert
    verify(config).getRetry();
  }

  /**
   * Test {@link BdkOboServiceConfig#oboConnectionService(ConnectionApi, BdkConfig)}.
   * <ul>
   *   <li>Then throw {@link BeanInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkOboServiceConfig#oboConnectionService(ConnectionApi, BdkConfig)}
   */
  @Test
  @DisplayName("Test oboConnectionService(ConnectionApi, BdkConfig); then throw BeanInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.core.service.connection.ConnectionService BdkOboServiceConfig.oboConnectionService(ConnectionApi, BdkConfig)"})
  void testOboConnectionService_thenThrowBeanInitializationException() {
    // Arrange
    BdkOboServiceConfig bdkOboServiceConfig = new BdkOboServiceConfig();
    ConnectionApi connectionApi = mock(ConnectionApi.class);
    BdkConfig config = mock(BdkConfig.class);
    when(config.getRetry()).thenThrow(new BeanInitializationException("Msg"));

    // Act and Assert
    assertThrows(BeanInitializationException.class,
        () -> bdkOboServiceConfig.oboConnectionService(connectionApi, config));
    verify(config).getRetry();
  }

  /**
   * Test {@link BdkOboServiceConfig#oboSignalService(SignalsApi, BdkConfig)}.
   * <ul>
   *   <li>Given {@link BdkRetryConfig#BdkRetryConfig()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkOboServiceConfig#oboSignalService(SignalsApi, BdkConfig)}
   */
  @Test
  @DisplayName("Test oboSignalService(SignalsApi, BdkConfig); given BdkRetryConfig()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.core.service.signal.SignalService BdkOboServiceConfig.oboSignalService(SignalsApi, BdkConfig)"})
  void testOboSignalService_givenBdkRetryConfig() {
    // Arrange
    BdkOboServiceConfig bdkOboServiceConfig = new BdkOboServiceConfig();
    SignalsApi signalsApi = mock(SignalsApi.class);
    BdkConfig config = mock(BdkConfig.class);
    when(config.getRetry()).thenReturn(new BdkRetryConfig());

    // Act
    bdkOboServiceConfig.oboSignalService(signalsApi, config);

    // Assert
    verify(config).getRetry();
  }

  /**
   * Test {@link BdkOboServiceConfig#oboSignalService(SignalsApi, BdkConfig)}.
   * <ul>
   *   <li>Then throw {@link BeanInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkOboServiceConfig#oboSignalService(SignalsApi, BdkConfig)}
   */
  @Test
  @DisplayName("Test oboSignalService(SignalsApi, BdkConfig); then throw BeanInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.core.service.signal.SignalService BdkOboServiceConfig.oboSignalService(SignalsApi, BdkConfig)"})
  void testOboSignalService_thenThrowBeanInitializationException() {
    // Arrange
    BdkOboServiceConfig bdkOboServiceConfig = new BdkOboServiceConfig();
    SignalsApi signalsApi = mock(SignalsApi.class);
    BdkConfig config = mock(BdkConfig.class);
    when(config.getRetry()).thenThrow(new BeanInitializationException("Msg"));

    // Act and Assert
    assertThrows(BeanInitializationException.class, () -> bdkOboServiceConfig.oboSignalService(signalsApi, config));
    verify(config).getRetry();
  }

  /**
   * Test {@link BdkOboServiceConfig#oboMessageService(MessagesApi, MessageApi, MessageSuppressionApi, StreamsApi, PodApi, AttachmentsApi, DefaultApi, TemplateEngine, BdkConfig)}.
   * <ul>
   *   <li>Given {@link BdkRetryConfig#BdkRetryConfig()}.</li>
   *   <li>Then return templates is {@link TemplateEngine}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkOboServiceConfig#oboMessageService(MessagesApi, MessageApi, MessageSuppressionApi, StreamsApi, PodApi, AttachmentsApi, DefaultApi, TemplateEngine, BdkConfig)}
   */
  @Test
  @DisplayName("Test oboMessageService(MessagesApi, MessageApi, MessageSuppressionApi, StreamsApi, PodApi, AttachmentsApi, DefaultApi, TemplateEngine, BdkConfig); given BdkRetryConfig(); then return templates is TemplateEngine")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "MessageService BdkOboServiceConfig.oboMessageService(MessagesApi, MessageApi, MessageSuppressionApi, StreamsApi, PodApi, AttachmentsApi, DefaultApi, TemplateEngine, BdkConfig)"})
  void testOboMessageService_givenBdkRetryConfig_thenReturnTemplatesIsTemplateEngine() {
    // Arrange
    BdkOboServiceConfig bdkOboServiceConfig = new BdkOboServiceConfig();
    MessagesApi messagesApi = mock(MessagesApi.class);
    MessageApi messageApi = mock(MessageApi.class);
    MessageSuppressionApi messageSuppressionApi = mock(MessageSuppressionApi.class);
    StreamsApi streamsApi = mock(StreamsApi.class);
    PodApi podApi = mock(PodApi.class);
    AttachmentsApi attachmentsApi = mock(AttachmentsApi.class);
    DefaultApi defaultApi = mock(DefaultApi.class);
    TemplateEngine templateEngine = mock(TemplateEngine.class);
    BdkConfig config = mock(BdkConfig.class);
    when(config.getRetry()).thenReturn(new BdkRetryConfig());

    // Act
    MessageService actualOboMessageServiceResult = bdkOboServiceConfig.oboMessageService(messagesApi, messageApi,
        messageSuppressionApi, streamsApi, podApi, attachmentsApi, defaultApi, templateEngine, config);

    // Assert
    verify(config).getRetry();
    assertSame(templateEngine, actualOboMessageServiceResult.templates());
  }

  /**
   * Test {@link BdkOboServiceConfig#oboMessageService(MessagesApi, MessageApi, MessageSuppressionApi, StreamsApi, PodApi, AttachmentsApi, DefaultApi, TemplateEngine, BdkConfig)}.
   * <ul>
   *   <li>Then throw {@link BeanInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkOboServiceConfig#oboMessageService(MessagesApi, MessageApi, MessageSuppressionApi, StreamsApi, PodApi, AttachmentsApi, DefaultApi, TemplateEngine, BdkConfig)}
   */
  @Test
  @DisplayName("Test oboMessageService(MessagesApi, MessageApi, MessageSuppressionApi, StreamsApi, PodApi, AttachmentsApi, DefaultApi, TemplateEngine, BdkConfig); then throw BeanInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "MessageService BdkOboServiceConfig.oboMessageService(MessagesApi, MessageApi, MessageSuppressionApi, StreamsApi, PodApi, AttachmentsApi, DefaultApi, TemplateEngine, BdkConfig)"})
  void testOboMessageService_thenThrowBeanInitializationException() {
    // Arrange
    BdkOboServiceConfig bdkOboServiceConfig = new BdkOboServiceConfig();
    MessagesApi messagesApi = mock(MessagesApi.class);
    MessageApi messageApi = mock(MessageApi.class);
    MessageSuppressionApi messageSuppressionApi = mock(MessageSuppressionApi.class);
    StreamsApi streamsApi = mock(StreamsApi.class);
    PodApi podApi = mock(PodApi.class);
    AttachmentsApi attachmentsApi = mock(AttachmentsApi.class);
    DefaultApi defaultApi = mock(DefaultApi.class);
    TemplateEngine templateEngine = mock(TemplateEngine.class);
    BdkConfig config = mock(BdkConfig.class);
    when(config.getRetry()).thenThrow(new BeanInitializationException("Msg"));

    // Act and Assert
    assertThrows(BeanInitializationException.class, () -> bdkOboServiceConfig.oboMessageService(messagesApi, messageApi,
        messageSuppressionApi, streamsApi, podApi, attachmentsApi, defaultApi, templateEngine, config));
    verify(config).getRetry();
  }
}
