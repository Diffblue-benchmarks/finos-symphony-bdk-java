package com.symphony.bdk.core.auth;

import static org.junit.jupiter.api.Assertions.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.exception.AuthUnauthorizedException;
import com.symphony.bdk.core.auth.impl.AuthSessionOboCertImpl;
import com.symphony.bdk.core.auth.impl.OboAuthenticatorCertImpl;
import com.symphony.bdk.core.config.model.BdkRetryConfig;
import com.symphony.bdk.core.test.BdkRetryConfigTestHelper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AuthSessionDiffblueTest {
  /**
   * Test {@link AuthSession#getAuthorizationToken()}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AuthSession#getAuthorizationToken()}
   */
  @Test
  @DisplayName("Test getAuthorizationToken(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String AuthSession.getAuthorizationToken()"})
  void testGetAuthorizationToken_thenReturnNull() throws AuthUnauthorizedException {
    // Arrange
    BdkRetryConfig retryConfig = BdkRetryConfigTestHelper.ofMinimalInterval(3);
    OboAuthenticatorCertImpl authenticator = new OboAuthenticatorCertImpl(retryConfig, "42", null);

    // Act and Assert
    assertNull(new AuthSessionOboCertImpl(authenticator, 1L).getAuthorizationToken());
  }
}
