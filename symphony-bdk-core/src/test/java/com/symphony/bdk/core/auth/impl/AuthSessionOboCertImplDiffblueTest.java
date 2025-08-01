package com.symphony.bdk.core.auth.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.exception.AuthUnauthorizedException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class AuthSessionOboCertImplDiffblueTest {
  /**
   * Test {@link AuthSessionOboCertImpl#refresh()}.
   *
   * <p>Method under test: {@link AuthSessionOboCertImpl#refresh()}
   */
  @Test
  @DisplayName("Test refresh()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AuthSessionOboCertImpl.refresh()"})
  void testRefresh() throws AuthUnauthorizedException {
    // Arrange
    OboAuthenticatorCertImpl authenticator = mock(OboAuthenticatorCertImpl.class);
    when(authenticator.retrieveOboSessionTokenByUserId(Mockito.<Long>any())).thenReturn("42");
    AuthSessionOboCertImpl authSessionOboCertImpl = new AuthSessionOboCertImpl(authenticator, 1L);

    // Act
    authSessionOboCertImpl.refresh();

    // Assert
    verify(authenticator).retrieveOboSessionTokenByUserId(1L);
    assertEquals("42", authSessionOboCertImpl.getSessionToken());
  }

  /**
   * Test {@link AuthSessionOboCertImpl#refresh()}.
   *
   * <p>Method under test: {@link AuthSessionOboCertImpl#refresh()}
   */
  @Test
  @DisplayName("Test refresh()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AuthSessionOboCertImpl.refresh()"})
  void testRefresh2() throws AuthUnauthorizedException {
    // Arrange
    OboAuthenticatorCertImpl authenticator = mock(OboAuthenticatorCertImpl.class);
    when(authenticator.retrieveOboSessionTokenByUsername(Mockito.<String>any()))
        .thenReturn("janedoe");
    AuthSessionOboCertImpl authSessionOboCertImpl =
        new AuthSessionOboCertImpl(authenticator, "janedoe");

    // Act
    authSessionOboCertImpl.refresh();

    // Assert
    verify(authenticator).retrieveOboSessionTokenByUsername("janedoe");
    assertEquals("janedoe", authSessionOboCertImpl.getSessionToken());
  }
}
