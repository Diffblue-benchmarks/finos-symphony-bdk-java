package com.symphony.bdk.core.auth.impl;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.exception.AuthUnauthorizedException;
import com.symphony.bdk.gen.api.model.ExtensionAppTokens;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;

@DirtiesContext(classMode = ClassMode.AFTER_EACH_TEST_METHOD)
@ExtendWith(MockitoExtension.class)
class AppAuthSessionRsaImplDiffblueTest {
  @InjectMocks private AppAuthSessionRsaImpl appAuthSessionRsaImpl;

  @Mock private ExtensionAppAuthenticatorRsaImpl extensionAppAuthenticatorRsaImpl;

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
    when(extensionAppAuthenticatorRsaImpl.retrieveExtensionAppSession(Mockito.<String>any()))
        .thenReturn(new ExtensionAppTokens());

    // Act
    appAuthSessionRsaImpl.refresh();

    // Assert
    verify(extensionAppAuthenticatorRsaImpl).retrieveExtensionAppSession(null);
  }

  /**
   * Test {@link AppAuthSessionRsaImpl#refresh()}.
   *
   * <ul>
   *   <li>Then throw {@link AuthUnauthorizedException}.
   * </ul>
   *
   * <p>Method under test: {@link AppAuthSessionRsaImpl#refresh()}
   */
  @Test
  @DisplayName("Test refresh(); then throw AuthUnauthorizedException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AppAuthSessionRsaImpl.refresh()"})
  void testRefresh_thenThrowAuthUnauthorizedException() throws AuthUnauthorizedException {
    // Arrange
    when(extensionAppAuthenticatorRsaImpl.retrieveExtensionAppSession(Mockito.<String>any()))
        .thenThrow(new AuthUnauthorizedException("An error occurred"));

    // Act and Assert
    assertThrows(AuthUnauthorizedException.class, () -> appAuthSessionRsaImpl.refresh());
    verify(extensionAppAuthenticatorRsaImpl).retrieveExtensionAppSession(null);
  }
}
