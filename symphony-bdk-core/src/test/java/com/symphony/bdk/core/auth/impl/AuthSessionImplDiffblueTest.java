package com.symphony.bdk.core.auth.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.exception.AuthUnauthorizedException;
import com.symphony.bdk.core.service.version.AgentVersionService;
import com.symphony.bdk.core.service.version.model.AgentVersion;
import com.symphony.bdk.gen.api.SignalsApi;
import com.symphony.bdk.gen.api.model.AgentInfo;
import com.symphony.bdk.gen.api.model.Token;
import com.symphony.bdk.http.api.ApiException;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class AuthSessionImplDiffblueTest {
  /**
   * Test {@link AuthSessionImpl#getAuthorizationToken()}.
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuthSessionImpl#getAuthorizationToken()}
   */
  @Test
  @DisplayName("Test getAuthorizationToken(); then throw UnsupportedOperationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.String AuthSessionImpl.getAuthorizationToken()"})
  void testGetAuthorizationToken_thenThrowUnsupportedOperationException() throws AuthUnauthorizedException {
    // Arrange, Act and Assert
    assertThrows(UnsupportedOperationException.class,
        () -> (new AuthSessionImpl(mock(BotAuthenticatorCertImpl.class))).getAuthorizationToken());
  }

  /**
   * Test {@link AuthSessionImpl#refresh()}.
   * <p>
   * Method under test: {@link AuthSessionImpl#refresh()}
   */
  @Test
  @DisplayName("Test refresh()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AuthSessionImpl.refresh()"})
  void testRefresh() throws AuthUnauthorizedException {
    // Arrange
    BotAuthenticatorCertImpl authenticator = mock(BotAuthenticatorCertImpl.class);
    when(authenticator.retrieveKeyManagerToken()).thenReturn("ABC123");
    when(authenticator.retrieveSessionToken()).thenReturn(new Token());
    AuthSessionImpl authSessionImpl = new AuthSessionImpl(authenticator);

    // Act
    authSessionImpl.refresh();

    // Assert
    verify(authenticator).retrieveKeyManagerToken();
    verify(authenticator).retrieveSessionToken();
    assertEquals("ABC123", authSessionImpl.getKeyManagerToken());
    assertNull(authSessionImpl.getSessionToken());
  }

  /**
   * Test {@link AuthSessionImpl#refresh()}.
   * <p>
   * Method under test: {@link AuthSessionImpl#refresh()}
   */
  @Test
  @DisplayName("Test refresh()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AuthSessionImpl.refresh()"})
  void testRefresh2() throws AuthUnauthorizedException {
    // Arrange
    Token token = mock(Token.class);
    when(token.getAuthorizationToken()).thenReturn(null);
    when(token.getToken()).thenReturn("ABC123");
    BotAuthenticatorCertImpl authenticator = mock(BotAuthenticatorCertImpl.class);
    when(authenticator.retrieveKeyManagerToken()).thenReturn("ABC123");
    when(authenticator.retrieveSessionToken()).thenReturn(token);
    AuthSessionImpl authSessionImpl = new AuthSessionImpl(authenticator);

    // Act
    authSessionImpl.refresh();

    // Assert
    verify(authenticator).retrieveKeyManagerToken();
    verify(authenticator).retrieveSessionToken();
    verify(token).getAuthorizationToken();
    verify(token).getToken();
    assertEquals("ABC123", authSessionImpl.getKeyManagerToken());
    assertEquals("ABC123", authSessionImpl.getSessionToken());
  }

  /**
   * Test {@link AuthSessionImpl#refresh()}.
   * <p>
   * Method under test: {@link AuthSessionImpl#refresh()}
   */
  @Test
  @DisplayName("Test refresh()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AuthSessionImpl.refresh()"})
  void testRefresh3() throws AuthUnauthorizedException {
    // Arrange
    Token token = mock(Token.class);
    when(token.getAuthorizationToken()).thenReturn(null);
    when(token.getToken()).thenReturn("com.symphony.bdk.gen.api.model.Token");
    BotAuthenticatorCertImpl authenticator = mock(BotAuthenticatorCertImpl.class);
    when(authenticator.retrieveKeyManagerToken()).thenReturn("ABC123");
    when(authenticator.retrieveSessionToken()).thenReturn(token);
    AuthSessionImpl authSessionImpl = new AuthSessionImpl(authenticator);

    // Act
    authSessionImpl.refresh();

    // Assert
    verify(authenticator).retrieveKeyManagerToken();
    verify(authenticator).retrieveSessionToken();
    verify(token).getAuthorizationToken();
    verify(token).getToken();
    assertEquals("ABC123", authSessionImpl.getKeyManagerToken());
    assertEquals("com.symphony.bdk.gen.api.model.Token", authSessionImpl.getSessionToken());
  }

  /**
   * Test {@link AuthSessionImpl#refresh()}.
   * <ul>
   *   <li>Given {@link Token} {@link Token#getAuthorizationToken()} return {@code ABC123}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuthSessionImpl#refresh()}
   */
  @Test
  @DisplayName("Test refresh(); given Token getAuthorizationToken() return 'ABC123'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AuthSessionImpl.refresh()"})
  void testRefresh_givenTokenGetAuthorizationTokenReturnAbc123() throws AuthUnauthorizedException {
    // Arrange
    Token token = mock(Token.class);
    when(token.getAuthorizationToken()).thenReturn("ABC123");
    when(token.getToken()).thenReturn("ABC123");
    BotAuthenticatorCertImpl authenticator = mock(BotAuthenticatorCertImpl.class);
    when(authenticator.retrieveSessionToken()).thenReturn(token);

    // Act and Assert
    assertThrows(AuthUnauthorizedException.class, () -> (new AuthSessionImpl(authenticator)).refresh());
    verify(authenticator).retrieveSessionToken();
    verify(token).getAuthorizationToken();
    verify(token).getToken();
  }

  /**
   * Test {@link AuthSessionImpl#refresh()}.
   * <ul>
   *   <li>Given {@link Token} {@link Token#getAuthorizationToken()} return {@code Token}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuthSessionImpl#refresh()}
   */
  @Test
  @DisplayName("Test refresh(); given Token getAuthorizationToken() return 'com.symphony.bdk.gen.api.model.Token'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AuthSessionImpl.refresh()"})
  void testRefresh_givenTokenGetAuthorizationTokenReturnComSymphonyBdkGenApiModelToken()
      throws AuthUnauthorizedException {
    // Arrange
    Token token = mock(Token.class);
    when(token.getAuthorizationToken()).thenReturn("com.symphony.bdk.gen.api.model.Token");
    when(token.getToken()).thenReturn("ABC123");
    BotAuthenticatorCertImpl authenticator = mock(BotAuthenticatorCertImpl.class);
    when(authenticator.retrieveSessionToken()).thenReturn(token);

    // Act and Assert
    assertThrows(AuthUnauthorizedException.class, () -> (new AuthSessionImpl(authenticator)).refresh());
    verify(authenticator).retrieveSessionToken();
    verify(token).getAuthorizationToken();
    verify(token).getToken();
  }

  /**
   * Test {@link AuthSessionImpl#refresh()}.
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuthSessionImpl#refresh()}
   */
  @Test
  @DisplayName("Test refresh(); then throw UnsupportedOperationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AuthSessionImpl.refresh()"})
  void testRefresh_thenThrowUnsupportedOperationException() throws AuthUnauthorizedException {
    // Arrange
    BotAuthenticatorCertImpl authenticator = mock(BotAuthenticatorCertImpl.class);
    when(authenticator.retrieveKeyManagerToken()).thenThrow(new UnsupportedOperationException("Bearer "));
    when(authenticator.retrieveSessionToken()).thenReturn(new Token());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> (new AuthSessionImpl(authenticator)).refresh());
    verify(authenticator).retrieveKeyManagerToken();
    verify(authenticator).retrieveSessionToken();
  }

  /**
   * Test {@link AuthSessionImpl#isSkdSupported()}.
   * <p>
   * Method under test: {@link AuthSessionImpl#isSkdSupported()}
   */
  @Test
  @DisplayName("Test isSkdSupported()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AuthSessionImpl.isSkdSupported()"})
  void testIsSkdSupported() {
    // Arrange
    AgentVersionService agentVersionService = mock(AgentVersionService.class);
    Optional<AgentVersion> ofResult = Optional.of(AgentVersion.AGENT_24_12);
    when(agentVersionService.retrieveAgentVersion()).thenReturn(ofResult);
    BotAuthenticatorCertImpl authenticator = mock(BotAuthenticatorCertImpl.class);
    when(authenticator.getAgentVersionService()).thenReturn(agentVersionService);

    // Act
    boolean actualIsSkdSupportedResult = (new AuthSessionImpl(authenticator)).isSkdSupported();

    // Assert
    verify(authenticator).getAgentVersionService();
    verify(agentVersionService).retrieveAgentVersion();
    assertTrue(actualIsSkdSupportedResult);
  }

  /**
   * Test {@link AuthSessionImpl#isSkdSupported()}.
   * <ul>
   *   <li>Given {@link AgentInfo} (default constructor) version {@code 1.0.2}.</li>
   *   <li>Then calls {@link SignalsApi#v1InfoGet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuthSessionImpl#isSkdSupported()}
   */
  @Test
  @DisplayName("Test isSkdSupported(); given AgentInfo (default constructor) version '1.0.2'; then calls v1InfoGet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AuthSessionImpl.isSkdSupported()"})
  void testIsSkdSupported_givenAgentInfoVersion102_thenCallsV1InfoGet() throws ApiException {
    // Arrange
    AgentInfo agentInfo = new AgentInfo();
    agentInfo.version("1.0.2");
    SignalsApi signalsApi = mock(SignalsApi.class);
    when(signalsApi.v1InfoGet()).thenReturn(agentInfo);
    BotAuthenticatorCertImpl authenticator = mock(BotAuthenticatorCertImpl.class);
    when(authenticator.getAgentVersionService()).thenReturn(new AgentVersionService(signalsApi));

    // Act
    boolean actualIsSkdSupportedResult = (new AuthSessionImpl(authenticator)).isSkdSupported();

    // Assert
    verify(authenticator).getAgentVersionService();
    verify(signalsApi).v1InfoGet();
    assertFalse(actualIsSkdSupportedResult);
  }

  /**
   * Test {@link AuthSessionImpl#isSkdSupported()}.
   * <ul>
   *   <li>Given {@link AgentVersion} {@link AgentVersion#isHigher(AgentVersion)} return {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuthSessionImpl#isSkdSupported()}
   */
  @Test
  @DisplayName("Test isSkdSupported(); given AgentVersion isHigher(AgentVersion) return 'true'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AuthSessionImpl.isSkdSupported()"})
  void testIsSkdSupported_givenAgentVersionIsHigherReturnTrue_thenReturnTrue() {
    // Arrange
    AgentVersion agentVersion = mock(AgentVersion.class);
    when(agentVersion.isHigher(Mockito.<AgentVersion>any())).thenReturn(true);
    Optional<AgentVersion> ofResult = Optional.of(agentVersion);
    AgentVersionService agentVersionService = mock(AgentVersionService.class);
    when(agentVersionService.retrieveAgentVersion()).thenReturn(ofResult);
    BotAuthenticatorCertImpl authenticator = mock(BotAuthenticatorCertImpl.class);
    when(authenticator.getAgentVersionService()).thenReturn(agentVersionService);

    // Act
    boolean actualIsSkdSupportedResult = (new AuthSessionImpl(authenticator)).isSkdSupported();

    // Assert
    verify(authenticator).getAgentVersionService();
    verify(agentVersionService).retrieveAgentVersion();
    verify(agentVersion).isHigher(isA(AgentVersion.class));
    assertTrue(actualIsSkdSupportedResult);
  }

  /**
   * Test {@link AuthSessionImpl#isSkdSupported()}.
   * <ul>
   *   <li>Given {@link AgentVersion#AgentVersion(int, int)} with major is twelve and minor is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuthSessionImpl#isSkdSupported()}
   */
  @Test
  @DisplayName("Test isSkdSupported(); given AgentVersion(int, int) with major is twelve and minor is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AuthSessionImpl.isSkdSupported()"})
  void testIsSkdSupported_givenAgentVersionWithMajorIsTwelveAndMinorIsOne() {
    // Arrange
    AgentVersionService agentVersionService = mock(AgentVersionService.class);
    Optional<AgentVersion> ofResult = Optional.of(new AgentVersion(12, 1));
    when(agentVersionService.retrieveAgentVersion()).thenReturn(ofResult);
    BotAuthenticatorCertImpl authenticator = mock(BotAuthenticatorCertImpl.class);
    when(authenticator.getAgentVersionService()).thenReturn(agentVersionService);

    // Act
    boolean actualIsSkdSupportedResult = (new AuthSessionImpl(authenticator)).isSkdSupported();

    // Assert
    verify(authenticator).getAgentVersionService();
    verify(agentVersionService).retrieveAgentVersion();
    assertFalse(actualIsSkdSupportedResult);
  }

  /**
   * Test {@link AuthSessionImpl#isSkdSupported()}.
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuthSessionImpl#isSkdSupported()}
   */
  @Test
  @DisplayName("Test isSkdSupported(); then throw UnsupportedOperationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AuthSessionImpl.isSkdSupported()"})
  void testIsSkdSupported_thenThrowUnsupportedOperationException() {
    // Arrange
    AgentVersion agentVersion = mock(AgentVersion.class);
    when(agentVersion.isHigher(Mockito.<AgentVersion>any())).thenThrow(new UnsupportedOperationException("foo"));
    Optional<AgentVersion> ofResult = Optional.of(agentVersion);
    AgentVersionService agentVersionService = mock(AgentVersionService.class);
    when(agentVersionService.retrieveAgentVersion()).thenReturn(ofResult);
    BotAuthenticatorCertImpl authenticator = mock(BotAuthenticatorCertImpl.class);
    when(authenticator.getAgentVersionService()).thenReturn(agentVersionService);

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> (new AuthSessionImpl(authenticator)).isSkdSupported());
    verify(authenticator).getAgentVersionService();
    verify(agentVersionService).retrieveAgentVersion();
    verify(agentVersion).isHigher(isA(AgentVersion.class));
  }
}
