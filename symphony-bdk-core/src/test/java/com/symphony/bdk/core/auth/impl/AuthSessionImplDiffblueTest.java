package com.symphony.bdk.core.auth.impl;

import static org.junit.jupiter.api.Assertions.assertFalse;
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
import com.symphony.bdk.http.api.ApiClient;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

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
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link AuthSessionImpl#refresh()}
   */
  @Test
  @DisplayName("Test refresh(); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AuthSessionImpl.refresh()"})
  void testRefresh_thenThrowUnsupportedOperationException() throws AuthUnauthorizedException {
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
