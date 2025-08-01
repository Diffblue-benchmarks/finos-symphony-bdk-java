package com.symphony.bdk.core.config.model;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkAuthenticationConfigDiffblueTest {
  /**
   * Test new {@link BdkAuthenticationConfig} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link BdkAuthenticationConfig}
   */
  @Test
  @DisplayName("Test new BdkAuthenticationConfig (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BdkAuthenticationConfig.<init>()"})
  void testNewBdkAuthenticationConfig() {
    // Arrange and Act
    BdkAuthenticationConfig actualBdkAuthenticationConfig = new BdkAuthenticationConfig();

    // Assert
    assertNull(actualBdkAuthenticationConfig.getCertificateContent());
    assertNull(actualBdkAuthenticationConfig.getPrivateKeyContent());
    assertNull(actualBdkAuthenticationConfig.getCertificatePassword());
    assertNull(actualBdkAuthenticationConfig.getCertificatePath());
    assertNull(actualBdkAuthenticationConfig.getPrivateKeyPath());
    assertFalse(actualBdkAuthenticationConfig.isBothCertificateAndRsaConfigured());
    assertFalse(actualBdkAuthenticationConfig.isCertificateAuthenticationConfigured());
    assertFalse(actualBdkAuthenticationConfig.isRsaAuthenticationConfigured());
    assertTrue(actualBdkAuthenticationConfig.isCertificateConfigurationValid());
    assertTrue(actualBdkAuthenticationConfig.isRsaConfigurationValid());
  }
}
