package com.symphony.bdk.core.auth;

import static org.junit.jupiter.api.Assertions.assertNull;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.exception.AuthUnauthorizedException;
import com.symphony.bdk.core.auth.impl.AuthSessionOboCertImpl;
import com.symphony.bdk.core.auth.impl.OboAuthenticatorCertImpl;
import com.symphony.bdk.core.config.model.BdkRetryConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AuthSessionDiffblueTest {
  /**
   * Test {@link AuthSession#getAuthorizationToken()}.
   * <ul>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuthSession#getAuthorizationToken()}
   */
  @Test
  @DisplayName("Test getAuthorizationToken(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.String AuthSession.getAuthorizationToken()"})
  void testGetAuthorizationToken_thenReturnNull() throws AuthUnauthorizedException {
    // Arrange, Act and Assert
    assertNull((new AuthSessionOboCertImpl(new OboAuthenticatorCertImpl(new BdkRetryConfig(), "42", null), 1L))
        .getAuthorizationToken());
  }
}
