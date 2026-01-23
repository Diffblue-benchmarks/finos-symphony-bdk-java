package com.symphony.bdk.core.auth.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.exception.AuthUnauthorizedException;
import com.symphony.bdk.core.config.model.BdkCommonJwtConfig;
import com.symphony.bdk.core.config.model.BdkRetryConfig;
import com.symphony.bdk.core.service.version.AgentVersionService;
import com.symphony.bdk.core.service.version.model.AgentVersion;
import com.symphony.bdk.gen.api.model.Token;
import com.symphony.bdk.http.api.ApiClient;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;

@DirtiesContext(classMode = ClassMode.AFTER_EACH_TEST_METHOD)
@ExtendWith(MockitoExtension.class)
class AuthSessionImplDiffblueTest {
  @Mock private AbstractBotAuthenticator abstractBotAuthenticator;

  @InjectMocks private AuthSessionImpl authSessionImpl;

  /**
   * Test {@link AuthSessionImpl#getAuthorizationToken()}.
   *
   * <p>Method under test: {@link AuthSessionImpl#getAuthorizationToken()}
   */
  @Test
  @DisplayName("Test getAuthorizationToken()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String AuthSessionImpl.getAuthorizationToken()"})
  void testGetAuthorizationToken() throws AuthUnauthorizedException {
    // Arrange
    BotAuthenticatorCertImpl authenticator =
        new BotAuthenticatorCertImpl(
            mock(BdkRetryConfig.class),
            "janedoe",
            mock(BdkCommonJwtConfig.class),
            mock(ApiClient.class),
            mock(ApiClient.class),
            mock(ApiClient.class),
            mock(AgentVersionService.class));

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> new AuthSessionImpl(authenticator).getAuthorizationToken());
  }

  /**
   * Test {@link AuthSessionImpl#refresh()}.
   *
   * <p>Method under test: {@link AuthSessionImpl#refresh()}
   */
  @Test
  @DisplayName("Test refresh()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AuthSessionImpl.refresh()"})
  void testRefresh() throws AuthUnauthorizedException {
    // Arrange
    when(abstractBotAuthenticator.retrieveKeyManagerToken())
        .thenThrow(new UnsupportedOperationException());
    when(abstractBotAuthenticator.retrieveSessionToken()).thenReturn(new Token());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> authSessionImpl.refresh());
    verify(abstractBotAuthenticator).retrieveKeyManagerToken();
    verify(abstractBotAuthenticator).retrieveSessionToken();
  }

  /**
   * Test {@link AuthSessionImpl#refresh()}.
   *
   * <ul>
   *   <li>Given {@link Token} (default constructor) authorizationToken {@code ABC123}.
   * </ul>
   *
   * <p>Method under test: {@link AuthSessionImpl#refresh()}
   */
  @Test
  @DisplayName("Test refresh(); given Token (default constructor) authorizationToken 'ABC123'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AuthSessionImpl.refresh()"})
  void testRefresh_givenTokenAuthorizationTokenAbc123() throws AuthUnauthorizedException {
    // Arrange
    Token token = new Token();
    token.authorizationToken("ABC123");
    when(abstractBotAuthenticator.retrieveSessionToken()).thenReturn(token);

    // Act and Assert
    assertThrows(AuthUnauthorizedException.class, () -> authSessionImpl.refresh());
    verify(abstractBotAuthenticator).retrieveSessionToken();
  }

  /**
   * Test {@link AuthSessionImpl#refresh()}.
   *
   * <ul>
   *   <li>Given {@link Token} (default constructor) authorizationToken {@code Token}.
   * </ul>
   *
   * <p>Method under test: {@link AuthSessionImpl#refresh()}
   */
  @Test
  @DisplayName(
      "Test refresh(); given Token (default constructor) authorizationToken 'com.symphony.bdk.gen.api.model.Token'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AuthSessionImpl.refresh()"})
  void testRefresh_givenTokenAuthorizationTokenComSymphonyBdkGenApiModelToken()
      throws AuthUnauthorizedException {
    // Arrange
    Token token = new Token();
    token.authorizationToken("com.symphony.bdk.gen.api.model.Token");
    when(abstractBotAuthenticator.retrieveSessionToken()).thenReturn(token);

    // Act and Assert
    assertThrows(AuthUnauthorizedException.class, () -> authSessionImpl.refresh());
    verify(abstractBotAuthenticator).retrieveSessionToken();
  }

  /**
   * Test {@link AuthSessionImpl#refresh()}.
   *
   * <ul>
   *   <li>Given {@link Token} (default constructor) token {@code ABC123}.
   *   <li>Then {@link AuthSessionImpl} SessionToken is {@code ABC123}.
   * </ul>
   *
   * <p>Method under test: {@link AuthSessionImpl#refresh()}
   */
  @Test
  @DisplayName(
      "Test refresh(); given Token (default constructor) token 'ABC123'; then AuthSessionImpl SessionToken is 'ABC123'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AuthSessionImpl.refresh()"})
  void testRefresh_givenTokenTokenAbc123_thenAuthSessionImplSessionTokenIsAbc123()
      throws AuthUnauthorizedException {
    // Arrange
    Token token = new Token();
    token.token("ABC123");
    when(abstractBotAuthenticator.retrieveKeyManagerToken()).thenReturn("ABC123");
    when(abstractBotAuthenticator.retrieveSessionToken()).thenReturn(token);

    // Act
    authSessionImpl.refresh();

    // Assert
    verify(abstractBotAuthenticator).retrieveKeyManagerToken();
    verify(abstractBotAuthenticator).retrieveSessionToken();
    assertEquals("ABC123", authSessionImpl.getKeyManagerToken());
    assertEquals("ABC123", authSessionImpl.getSessionToken());
  }

  /**
   * Test {@link AuthSessionImpl#refresh()}.
   *
   * <ul>
   *   <li>Then {@link AuthSessionImpl} SessionToken is {@code Token}.
   * </ul>
   *
   * <p>Method under test: {@link AuthSessionImpl#refresh()}
   */
  @Test
  @DisplayName(
      "Test refresh(); then AuthSessionImpl SessionToken is 'com.symphony.bdk.gen.api.model.Token'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AuthSessionImpl.refresh()"})
  void testRefresh_thenAuthSessionImplSessionTokenIsComSymphonyBdkGenApiModelToken()
      throws AuthUnauthorizedException {
    // Arrange
    Token token = new Token();
    token.token("com.symphony.bdk.gen.api.model.Token");
    when(abstractBotAuthenticator.retrieveKeyManagerToken()).thenReturn("ABC123");
    when(abstractBotAuthenticator.retrieveSessionToken()).thenReturn(token);

    // Act
    authSessionImpl.refresh();

    // Assert
    verify(abstractBotAuthenticator).retrieveKeyManagerToken();
    verify(abstractBotAuthenticator).retrieveSessionToken();
    assertEquals("ABC123", authSessionImpl.getKeyManagerToken());
    assertEquals("com.symphony.bdk.gen.api.model.Token", authSessionImpl.getSessionToken());
  }

  /**
   * Test {@link AuthSessionImpl#refresh()}.
   *
   * <ul>
   *   <li>Then {@link AuthSessionImpl} SessionToken is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AuthSessionImpl#refresh()}
   */
  @Test
  @DisplayName("Test refresh(); then AuthSessionImpl SessionToken is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AuthSessionImpl.refresh()"})
  void testRefresh_thenAuthSessionImplSessionTokenIsNull() throws AuthUnauthorizedException {
    // Arrange
    when(abstractBotAuthenticator.retrieveKeyManagerToken()).thenReturn("ABC123");
    when(abstractBotAuthenticator.retrieveSessionToken()).thenReturn(new Token());

    // Act
    authSessionImpl.refresh();

    // Assert
    verify(abstractBotAuthenticator).retrieveKeyManagerToken();
    verify(abstractBotAuthenticator).retrieveSessionToken();
    assertEquals("ABC123", authSessionImpl.getKeyManagerToken());
    assertNull(authSessionImpl.getSessionToken());
  }

  /**
   * Test {@link AuthSessionImpl#refresh()}.
   *
   * <ul>
   *   <li>Then calls {@link BdkRetryConfig#getMaxAttempts()}.
   * </ul>
   *
   * <p>Method under test: {@link AuthSessionImpl#refresh()}
   */
  @Test
  @DisplayName("Test refresh(); then calls getMaxAttempts()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AuthSessionImpl.refresh()"})
  void testRefresh_thenCallsGetMaxAttempts() throws AuthUnauthorizedException {
    // Arrange
    BdkRetryConfig retryConfig = mock(BdkRetryConfig.class);
    when(retryConfig.getMaxAttempts()).thenThrow(new UnsupportedOperationException());

    ApiClient sessionAuthClient = mock(ApiClient.class);
    when(sessionAuthClient.getBasePath()).thenReturn("https://example.org/example");

    BotAuthenticatorCertImpl authenticator =
        new BotAuthenticatorCertImpl(
            retryConfig,
            "janedoe",
            mock(BdkCommonJwtConfig.class),
            mock(ApiClient.class),
            sessionAuthClient,
            mock(ApiClient.class),
            mock(AgentVersionService.class));

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class, () -> new AuthSessionImpl(authenticator).refresh());
    verify(retryConfig).getMaxAttempts();
    verify(sessionAuthClient).getBasePath();
  }

  /**
   * Test {@link AuthSessionImpl#isSkdSupported()}.
   *
   * <p>Method under test: {@link AuthSessionImpl#isSkdSupported()}
   */
  @Test
  @DisplayName("Test isSkdSupported()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AuthSessionImpl.isSkdSupported()"})
  void testIsSkdSupported() {
    // Arrange
    AgentVersionService agentVersionService = mock(AgentVersionService.class);
    when(agentVersionService.retrieveAgentVersion()).thenThrow(new UnsupportedOperationException());
    BotAuthenticatorCertImpl authenticator =
        new BotAuthenticatorCertImpl(
            mock(BdkRetryConfig.class),
            "janedoe",
            mock(BdkCommonJwtConfig.class),
            mock(ApiClient.class),
            mock(ApiClient.class),
            mock(ApiClient.class),
            agentVersionService);

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> new AuthSessionImpl(authenticator).isSkdSupported());
    verify(agentVersionService).retrieveAgentVersion();
  }

  /**
   * Test {@link AuthSessionImpl#isSkdSupported()}.
   *
   * <p>Method under test: {@link AuthSessionImpl#isSkdSupported()}
   */
  @Test
  @DisplayName("Test isSkdSupported()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AuthSessionImpl.isSkdSupported()"})
  void testIsSkdSupported2() {
    // Arrange
    AgentVersionService agentVersionService = mock(AgentVersionService.class);
    Optional<AgentVersion> ofResult = Optional.of(new AgentVersion(24, 1));
    when(agentVersionService.retrieveAgentVersion()).thenReturn(ofResult);
    BotAuthenticatorCertImpl authenticator =
        new BotAuthenticatorCertImpl(
            mock(BdkRetryConfig.class),
            "janedoe",
            mock(BdkCommonJwtConfig.class),
            mock(ApiClient.class),
            mock(ApiClient.class),
            mock(ApiClient.class),
            agentVersionService);

    // Act
    boolean actualIsSkdSupportedResult = new AuthSessionImpl(authenticator).isSkdSupported();

    // Assert
    verify(agentVersionService).retrieveAgentVersion();
    assertFalse(actualIsSkdSupportedResult);
  }

  /**
   * Test {@link AuthSessionImpl#isSkdSupported()}.
   *
   * <p>Method under test: {@link AuthSessionImpl#isSkdSupported()}
   */
  @Test
  @DisplayName("Test isSkdSupported()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AuthSessionImpl.isSkdSupported()"})
  void testIsSkdSupported3() {
    // Arrange
    AgentVersionService agentVersionService = mock(AgentVersionService.class);
    Optional<AgentVersion> ofResult = Optional.of(new AgentVersion(12, 1));
    when(agentVersionService.retrieveAgentVersion()).thenReturn(ofResult);
    BotAuthenticatorCertImpl authenticator =
        new BotAuthenticatorCertImpl(
            mock(BdkRetryConfig.class),
            "janedoe",
            mock(BdkCommonJwtConfig.class),
            mock(ApiClient.class),
            mock(ApiClient.class),
            mock(ApiClient.class),
            agentVersionService);

    // Act
    boolean actualIsSkdSupportedResult = new AuthSessionImpl(authenticator).isSkdSupported();

    // Assert
    verify(agentVersionService).retrieveAgentVersion();
    assertFalse(actualIsSkdSupportedResult);
  }

  /**
   * Test {@link AuthSessionImpl#isSkdSupported()}.
   *
   * <ul>
   *   <li>Given {@link AgentVersionService} {@link AgentVersionService#retrieveAgentVersion()}
   *       return empty.
   * </ul>
   *
   * <p>Method under test: {@link AuthSessionImpl#isSkdSupported()}
   */
  @Test
  @DisplayName(
      "Test isSkdSupported(); given AgentVersionService retrieveAgentVersion() return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AuthSessionImpl.isSkdSupported()"})
  void testIsSkdSupported_givenAgentVersionServiceRetrieveAgentVersionReturnEmpty() {
    // Arrange
    AgentVersionService agentVersionService = mock(AgentVersionService.class);
    Optional<AgentVersion> emptyResult = Optional.empty();
    when(agentVersionService.retrieveAgentVersion()).thenReturn(emptyResult);
    BotAuthenticatorCertImpl authenticator =
        new BotAuthenticatorCertImpl(
            mock(BdkRetryConfig.class),
            "janedoe",
            mock(BdkCommonJwtConfig.class),
            mock(ApiClient.class),
            mock(ApiClient.class),
            mock(ApiClient.class),
            agentVersionService);

    // Act
    boolean actualIsSkdSupportedResult = new AuthSessionImpl(authenticator).isSkdSupported();

    // Assert
    verify(agentVersionService).retrieveAgentVersion();
    assertFalse(actualIsSkdSupportedResult);
  }

  /**
   * Test {@link AuthSessionImpl#isSkdSupported()}.
   *
   * <ul>
   *   <li>Then calls {@link AbstractBotAuthenticator#getAgentVersionService()}.
   * </ul>
   *
   * <p>Method under test: {@link AuthSessionImpl#isSkdSupported()}
   */
  @Test
  @DisplayName("Test isSkdSupported(); then calls getAgentVersionService()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AuthSessionImpl.isSkdSupported()"})
  void testIsSkdSupported_thenCallsGetAgentVersionService() {
    // Arrange
    when(abstractBotAuthenticator.getAgentVersionService())
        .thenThrow(new UnsupportedOperationException());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> authSessionImpl.isSkdSupported());
    verify(abstractBotAuthenticator).getAgentVersionService();
  }

  /**
   * Test {@link AuthSessionImpl#isSkdSupported()}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AuthSessionImpl#isSkdSupported()}
   */
  @Test
  @DisplayName("Test isSkdSupported(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AuthSessionImpl.isSkdSupported()"})
  void testIsSkdSupported_thenReturnTrue() {
    // Arrange
    AgentVersionService agentVersionService = mock(AgentVersionService.class);
    Optional<AgentVersion> ofResult = Optional.of(AgentVersion.AGENT_24_12);
    when(agentVersionService.retrieveAgentVersion()).thenReturn(ofResult);
    BotAuthenticatorCertImpl authenticator =
        new BotAuthenticatorCertImpl(
            mock(BdkRetryConfig.class),
            "janedoe",
            mock(BdkCommonJwtConfig.class),
            mock(ApiClient.class),
            mock(ApiClient.class),
            mock(ApiClient.class),
            agentVersionService);

    // Act
    boolean actualIsSkdSupportedResult = new AuthSessionImpl(authenticator).isSkdSupported();

    // Assert
    verify(agentVersionService).retrieveAgentVersion();
    assertTrue(actualIsSkdSupportedResult);
  }
}
