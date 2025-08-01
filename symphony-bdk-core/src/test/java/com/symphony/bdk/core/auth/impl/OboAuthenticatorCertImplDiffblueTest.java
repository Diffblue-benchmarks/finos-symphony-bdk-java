package com.symphony.bdk.core.auth.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.config.model.BdkRetryConfig;
import com.symphony.bdk.core.test.BdkRetryConfigTestHelper;
import com.symphony.bdk.http.api.ApiClient;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import jakarta.ws.rs.client.Client;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class OboAuthenticatorCertImplDiffblueTest {
  /**
   * Test {@link OboAuthenticatorCertImpl#OboAuthenticatorCertImpl(BdkRetryConfig, String,
   * ApiClient)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@link AbstractOboAuthenticator#appId} is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link OboAuthenticatorCertImpl#OboAuthenticatorCertImpl(BdkRetryConfig,
   * String, ApiClient)}
   */
  @Test
  @DisplayName(
      "Test new OboAuthenticatorCertImpl(BdkRetryConfig, String, ApiClient); when 'null'; then return appId is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void OboAuthenticatorCertImpl.<init>(BdkRetryConfig, String, ApiClient)"})
  void testNewOboAuthenticatorCertImpl_whenNull_thenReturnAppIdIs42() {
    // Arrange, Act and Assert
    assertEquals(
        "42",
        new OboAuthenticatorCertImpl(BdkRetryConfigTestHelper.ofMinimalInterval(3), "42", null)
            .appId);
  }

  /**
   * Test {@link OboAuthenticatorCertImpl#OboAuthenticatorCertImpl(BdkRetryConfig, String,
   * ApiClient)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@link AbstractOboAuthenticator#appId} is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link OboAuthenticatorCertImpl#OboAuthenticatorCertImpl(BdkRetryConfig,
   * String, ApiClient)}
   */
  @Test
  @DisplayName(
      "Test new OboAuthenticatorCertImpl(BdkRetryConfig, String, ApiClient); when 'null'; then return appId is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void OboAuthenticatorCertImpl.<init>(BdkRetryConfig, String, ApiClient)"})
  void testNewOboAuthenticatorCertImpl_whenNull_thenReturnAppIdIs422() {
    // Arrange, Act and Assert
    assertEquals(
        "42",
        new OboAuthenticatorCertImpl(BdkRetryConfigTestHelper.ofMinimalInterval(3), "42", null)
            .appId);
  }

  /**
   * Test {@link OboAuthenticatorCertImpl#getBasePath()}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example}.
   * </ul>
   *
   * <p>Method under test: {@link OboAuthenticatorCertImpl#getBasePath()}
   */
  @Test
  @DisplayName("Test getBasePath(); then return 'https://example.org/example'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OboAuthenticatorCertImpl.getBasePath()"})
  void testGetBasePath_thenReturnHttpsExampleOrgExample() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 sessionAuthClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act and Assert
    assertEquals(
        "https://example.org/example",
        new OboAuthenticatorCertImpl(
                BdkRetryConfigTestHelper.ofMinimalInterval(3), "42", sessionAuthClient)
            .getBasePath());
  }
}
