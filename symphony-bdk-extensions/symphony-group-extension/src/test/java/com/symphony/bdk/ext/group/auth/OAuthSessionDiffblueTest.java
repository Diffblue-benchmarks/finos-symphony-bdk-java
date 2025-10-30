package com.symphony.bdk.ext.group.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.ext.group.auth.OAuthSession.TokenResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class OAuthSessionDiffblueTest {
  /**
   * Test TokenResponse getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link TokenResponse}
   *   <li>{@link TokenResponse#setToken(String)}
   *   <li>{@link TokenResponse#getToken()}
   * </ul>
   */
  @Test
  @DisplayName("Test TokenResponse getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void TokenResponse.<init>()", "String TokenResponse.getToken()",
      "void TokenResponse.setToken(String)"})
  void testTokenResponseGettersAndSetters() {
    // Arrange and Act
    TokenResponse actualTokenResponse = new TokenResponse();
    actualTokenResponse.setToken("ABC123");

    // Assert
    assertEquals("ABC123", actualTokenResponse.getToken());
  }
}
