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

class AppAuthSessionRsaImplDiffblueTest {
  /**
   * Test {@link AppAuthSessionRsaImpl#refresh()}.
   *
   * <p>Method under test: {@link AppAuthSessionRsaImpl#refresh()}
   */
  @Test
  @DisplayName("Test refresh()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AppAuthSessionRsaImpl.refresh()"})
  void testRefresh() throws AuthUnauthorizedException {
    // Arrange
    ExtensionAppAuthenticatorRsaImpl authenticator = mock(ExtensionAppAuthenticatorRsaImpl.class);
    when(authenticator.retrieveExtensionAppSession(Mockito.<String>any()))
        .thenReturn(new ExtensionAppTokens());
    AppAuthSessionRsaImpl appAuthSessionRsaImpl =
        new AppAuthSessionRsaImpl(authenticator, "ABC123");

    // Act
    appAuthSessionRsaImpl.refresh();

    // Assert
    verify(authenticator).retrieveExtensionAppSession("ABC123");
    assertNull(appAuthSessionRsaImpl.getAppToken());
  }
}
