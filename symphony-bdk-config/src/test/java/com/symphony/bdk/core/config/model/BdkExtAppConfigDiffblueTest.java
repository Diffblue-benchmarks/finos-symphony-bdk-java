package com.symphony.bdk.core.config.model;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkExtAppConfigDiffblueTest {
  /**
   * Test new {@link BdkExtAppConfig} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link BdkExtAppConfig}
   */
  @Test
  @DisplayName("Test new BdkExtAppConfig (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BdkExtAppConfig.<init>()"})
  void testNewBdkExtAppConfig() {
    // Arrange and Act
    BdkExtAppConfig actualBdkExtAppConfig = new BdkExtAppConfig();

    // Assert
    assertNull(actualBdkExtAppConfig.getCertificateContent());
    assertNull(actualBdkExtAppConfig.getPrivateKeyContent());
    assertNull(actualBdkExtAppConfig.getCertificatePassword());
    assertNull(actualBdkExtAppConfig.getCertificatePath());
    assertNull(actualBdkExtAppConfig.getPrivateKeyPath());
    assertNull(actualBdkExtAppConfig.getAppId());
    assertFalse(actualBdkExtAppConfig.isBothCertificateAndRsaConfigured());
    assertFalse(actualBdkExtAppConfig.isCertificateAuthenticationConfigured());
    assertFalse(actualBdkExtAppConfig.isRsaAuthenticationConfigured());
    assertFalse(actualBdkExtAppConfig.isConfigured());
    assertTrue(actualBdkExtAppConfig.isCertificateConfigurationValid());
    assertTrue(actualBdkExtAppConfig.isRsaConfigurationValid());
  }
}
