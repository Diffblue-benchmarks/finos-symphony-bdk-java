package com.symphony.bdk.core.auth.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.exception.AuthUnauthorizedException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class AuthSessionOboImplDiffblueTest {
  /**
   * Test {@link AuthSessionOboImpl#refresh()}.
   * <p>
   * Method under test: {@link AuthSessionOboImpl#refresh()}
   */
  @Test
  @DisplayName("Test refresh()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AuthSessionOboImpl.refresh()"})
  void testRefresh() throws AuthUnauthorizedException {
    // Arrange
    OboAuthenticatorRsaImpl authenticator = mock(OboAuthenticatorRsaImpl.class);
    when(authenticator.retrieveOboSessionTokenByUserId(Mockito.<Long>any())).thenReturn("42");
    AuthSessionOboImpl authSessionOboImpl = new AuthSessionOboImpl(authenticator, 1L);

    // Act
    authSessionOboImpl.refresh();

    // Assert
    verify(authenticator).retrieveOboSessionTokenByUserId(eq(1L));
    assertEquals("42", authSessionOboImpl.getSessionToken());
  }

  /**
   * Test {@link AuthSessionOboImpl#refresh()}.
   * <p>
   * Method under test: {@link AuthSessionOboImpl#refresh()}
   */
  @Test
  @DisplayName("Test refresh()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AuthSessionOboImpl.refresh()"})
  void testRefresh2() throws AuthUnauthorizedException {
    // Arrange
    OboAuthenticatorRsaImpl authenticator = mock(OboAuthenticatorRsaImpl.class);
    when(authenticator.retrieveOboSessionTokenByUsername(Mockito.<String>any())).thenReturn("janedoe");
    AuthSessionOboImpl authSessionOboImpl = new AuthSessionOboImpl(authenticator, "janedoe");

    // Act
    authSessionOboImpl.refresh();

    // Assert
    verify(authenticator).retrieveOboSessionTokenByUsername(eq("janedoe"));
    assertEquals("janedoe", authSessionOboImpl.getSessionToken());
  }
}
