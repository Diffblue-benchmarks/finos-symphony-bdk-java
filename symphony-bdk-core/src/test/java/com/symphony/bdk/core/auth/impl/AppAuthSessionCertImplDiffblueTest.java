package com.symphony.bdk.core.auth.impl;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.exception.AuthUnauthorizedException;
import com.symphony.bdk.gen.api.model.ExtensionAppTokens;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class AppAuthSessionCertImplDiffblueTest {
  /**
   * Test {@link AppAuthSessionCertImpl#refresh()}.
   *
   * <p>Method under test: {@link AppAuthSessionCertImpl#refresh()}
   */
  @Test
  @DisplayName("Test refresh()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AppAuthSessionCertImpl.refresh()"})
  void testRefresh() throws AuthUnauthorizedException {
    // Arrange
    ExtensionAppAuthenticatorCertImpl authenticator = mock(ExtensionAppAuthenticatorCertImpl.class);
    when(authenticator.retrieveExtensionAppSession(Mockito.<String>any()))
        .thenReturn(new ExtensionAppTokens());
    AppAuthSessionCertImpl appAuthSessionCertImpl =
        new AppAuthSessionCertImpl(authenticator, "ABC123");

    // Act
    appAuthSessionCertImpl.refresh();

    // Assert
    verify(authenticator).retrieveExtensionAppSession("ABC123");
    assertNull(appAuthSessionCertImpl.getAppToken());
  }
}
