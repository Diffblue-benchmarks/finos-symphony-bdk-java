package com.symphony.bdk.app.spring.auth.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.app.spring.auth.model.TokenPair;
import com.symphony.bdk.app.spring.auth.model.UserId;
import com.symphony.bdk.app.spring.exception.BdkAppErrorCode;
import com.symphony.bdk.app.spring.exception.BdkAppException;
import com.symphony.bdk.core.auth.ExtensionAppAuthenticator;
import com.symphony.bdk.core.auth.exception.AuthInitializationException;
import com.symphony.bdk.core.auth.jwt.UserClaim;
import com.symphony.bdk.spring.SymphonyBdkCoreProperties;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.aot.DisabledInAotMode;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {CircleOfTrustService.class, SymphonyBdkCoreProperties.class})
@DisabledInAotMode
@ExtendWith(SpringExtension.class)
class CircleOfTrustServiceDiffblueTest {
  @Autowired private CircleOfTrustService circleOfTrustService;

  @MockBean private ExtensionAppAuthenticator extensionAppAuthenticator;

  @Autowired private SymphonyBdkCoreProperties symphonyBdkCoreProperties;

  /**
   * Test {@link CircleOfTrustService#validateTokens(TokenPair)}.
   *
   * <p>Method under test: {@link CircleOfTrustService#validateTokens(TokenPair)}
   */
  @Test
  @DisplayName("Test validateTokens(TokenPair)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CircleOfTrustService.validateTokens(TokenPair)"})
  void testValidateTokens() {
    // Arrange
    when(extensionAppAuthenticator.validateTokens(Mockito.<String>any(), Mockito.<String>any()))
        .thenThrow(new BdkAppException(BdkAppErrorCode.AUTH_FAILURE, "An error occurred"));

    // Act and Assert
    assertThrows(
        BdkAppException.class,
        () -> circleOfTrustService.validateTokens(new TokenPair("ABC123", "ABC123")));
    verify(extensionAppAuthenticator).validateTokens("ABC123", "ABC123");
  }

  /**
   * Test {@link CircleOfTrustService#validateTokens(TokenPair)}.
   *
   * <ul>
   *   <li>Given {@link ExtensionAppAuthenticator} {@link
   *       ExtensionAppAuthenticator#validateTokens(String, String)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CircleOfTrustService#validateTokens(TokenPair)}
   */
  @Test
  @DisplayName(
      "Test validateTokens(TokenPair); given ExtensionAppAuthenticator validateTokens(String, String) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CircleOfTrustService.validateTokens(TokenPair)"})
  void testValidateTokens_givenExtensionAppAuthenticatorValidateTokensReturnFalse() {
    // Arrange
    when(extensionAppAuthenticator.validateTokens(Mockito.<String>any(), Mockito.<String>any()))
        .thenReturn(false);

    // Act and Assert
    assertThrows(
        BdkAppException.class,
        () -> circleOfTrustService.validateTokens(new TokenPair("ABC123", "ABC123")));
    verify(extensionAppAuthenticator).validateTokens("ABC123", "ABC123");
  }

  /**
   * Test {@link CircleOfTrustService#validateTokens(TokenPair)}.
   *
   * <ul>
   *   <li>Given {@link ExtensionAppAuthenticator} {@link
   *       ExtensionAppAuthenticator#validateTokens(String, String)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CircleOfTrustService#validateTokens(TokenPair)}
   */
  @Test
  @DisplayName(
      "Test validateTokens(TokenPair); given ExtensionAppAuthenticator validateTokens(String, String) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CircleOfTrustService.validateTokens(TokenPair)"})
  void testValidateTokens_givenExtensionAppAuthenticatorValidateTokensReturnTrue() {
    // Arrange
    when(extensionAppAuthenticator.validateTokens(Mockito.<String>any(), Mockito.<String>any()))
        .thenReturn(true);

    // Act
    circleOfTrustService.validateTokens(new TokenPair("ABC123", "ABC123"));

    // Assert
    verify(extensionAppAuthenticator).validateTokens("ABC123", "ABC123");
  }

  /**
   * Test {@link CircleOfTrustService#validateJwt(String)}.
   *
   * <p>Method under test: {@link CircleOfTrustService#validateJwt(String)}
   */
  @Test
  @DisplayName("Test validateJwt(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UserId CircleOfTrustService.validateJwt(String)"})
  void testValidateJwt() throws AuthInitializationException {
    // Arrange
    when(extensionAppAuthenticator.validateJwt(Mockito.<String>any()))
        .thenThrow(new BdkAppException(BdkAppErrorCode.AUTH_FAILURE, "An error occurred"));

    // Act and Assert
    assertThrows(BdkAppException.class, () -> circleOfTrustService.validateJwt("Jwt"));
    verify(extensionAppAuthenticator).validateJwt("Jwt");
  }

  /**
   * Test {@link CircleOfTrustService#validateJwt(String)}.
   *
   * <p>Method under test: {@link CircleOfTrustService#validateJwt(String)}
   */
  @Test
  @DisplayName("Test validateJwt(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UserId CircleOfTrustService.validateJwt(String)"})
  void testValidateJwt2() throws AuthInitializationException {
    // Arrange
    when(extensionAppAuthenticator.validateJwt(Mockito.<String>any()))
        .thenThrow(new AuthInitializationException("An error occurred"));

    // Act and Assert
    assertThrows(BdkAppException.class, () -> circleOfTrustService.validateJwt("Jwt"));
    verify(extensionAppAuthenticator).validateJwt("Jwt");
  }

  /**
   * Test {@link CircleOfTrustService#validateJwt(String)}.
   *
   * <ul>
   *   <li>Then return userId longValue is one.
   * </ul>
   *
   * <p>Method under test: {@link CircleOfTrustService#validateJwt(String)}
   */
  @Test
  @DisplayName("Test validateJwt(String); then return userId longValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UserId CircleOfTrustService.validateJwt(String)"})
  void testValidateJwt_thenReturnUserIdLongValueIsOne() throws AuthInitializationException {
    // Arrange
    UserClaim userClaim = new UserClaim();
    userClaim.setAvatarSmallUrl("https://example.org/example");
    userClaim.setAvatarUrl("https://example.org/example");
    userClaim.setCompany("Company");
    userClaim.setCompanyId("42");
    userClaim.setDisplayName("Display Name");
    userClaim.setEmailAddress("42 Main St");
    userClaim.setFirstName("Jane");
    userClaim.setId(1L);
    userClaim.setLastName("Doe");
    userClaim.setLocation("Location");
    userClaim.setTitle("Dr");
    userClaim.setUsername("janedoe");
    when(extensionAppAuthenticator.validateJwt(Mockito.<String>any())).thenReturn(userClaim);

    // Act
    UserId actualValidateJwtResult = circleOfTrustService.validateJwt("Jwt");

    // Assert
    verify(extensionAppAuthenticator).validateJwt("Jwt");
    assertEquals(1L, actualValidateJwtResult.userId().longValue());
  }
}
