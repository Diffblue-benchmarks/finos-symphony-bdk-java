package com.symphony.bdk.core.config.model;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkBotConfigDiffblueTest {
  /**
   * Test new {@link BdkBotConfig} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link BdkBotConfig}
   */
  @Test
  @DisplayName("Test new BdkBotConfig (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BdkBotConfig.<init>()"})
  void testNewBdkBotConfig() {
    // Arrange and Act
    BdkBotConfig actualBdkBotConfig = new BdkBotConfig();

    // Assert
    assertNull(actualBdkBotConfig.getCertificateContent());
    assertNull(actualBdkBotConfig.getPrivateKeyContent());
    assertNull(actualBdkBotConfig.getCertificatePassword());
    assertNull(actualBdkBotConfig.getCertificatePath());
    assertNull(actualBdkBotConfig.getPrivateKeyPath());
    assertNull(actualBdkBotConfig.getUsername());
    assertFalse(actualBdkBotConfig.isBothCertificateAndRsaConfigured());
    assertFalse(actualBdkBotConfig.isCertificateAuthenticationConfigured());
    assertFalse(actualBdkBotConfig.isRsaAuthenticationConfigured());
    assertTrue(actualBdkBotConfig.isCertificateConfigurationValid());
    assertTrue(actualBdkBotConfig.isRsaConfigurationValid());
  }
}
