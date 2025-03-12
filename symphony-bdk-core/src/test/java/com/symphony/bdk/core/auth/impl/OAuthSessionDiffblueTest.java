package com.symphony.bdk.core.auth.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.exception.AuthUnauthorizedException;
import com.symphony.bdk.http.api.ApiException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class OAuthSessionDiffblueTest {
  /**
   * Test {@link OAuthSession#getBearerToken()}.
   * <ul>
   *   <li>Then return {@code ABC123}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OAuthSession#getBearerToken()}
   */
  @Test
  @DisplayName("Test getBearerToken(); then return 'ABC123'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OAuthSession.getBearerToken()"})
  void testGetBearerToken_thenReturnAbc123() throws AuthUnauthorizedException, ApiException {
    // Arrange
    AuthSessionImpl authSession = mock(AuthSessionImpl.class);
    when(authSession.getAuthorizationToken()).thenReturn("ABC123");

    // Act
    String actualBearerToken = (new OAuthSession(authSession)).getBearerToken();

    // Assert
    verify(authSession).getAuthorizationToken();
    assertEquals("ABC123", actualBearerToken);
  }

  /**
   * Test {@link OAuthSession#getBearerToken()}.
   * <ul>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OAuthSession#getBearerToken()}
   */
  @Test
  @DisplayName("Test getBearerToken(); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OAuthSession.getBearerToken()"})
  void testGetBearerToken_thenThrowApiException() throws AuthUnauthorizedException, ApiException {
    // Arrange
    AuthSessionImpl authSession = mock(AuthSessionImpl.class);
    when(authSession.getAuthorizationToken()).thenThrow(new AuthUnauthorizedException("An error occurred"));

    // Act and Assert
    assertThrows(ApiException.class, () -> (new OAuthSession(authSession)).getBearerToken());
    verify(authSession).getAuthorizationToken();
  }
}
