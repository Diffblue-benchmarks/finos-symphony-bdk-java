package com.symphony.bdk.core.config.model;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkSslConfigDiffblueTest {
  /**
   * Test new {@link BdkSslConfig} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link BdkSslConfig}
   */
  @Test
  @DisplayName("Test new BdkSslConfig (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BdkSslConfig.<init>()"})
  void testNewBdkSslConfig() {
    // Arrange and Act
    BdkSslConfig actualBdkSslConfig = new BdkSslConfig();

    // Assert
    BdkCertificateConfig certificateConfig = actualBdkSslConfig.getCertificateConfig();
    assertNull(certificateConfig.getContent());
    BdkCertificateConfig trustStore = actualBdkSslConfig.getTrustStore();
    assertNull(trustStore.getContent());
    assertNull(certificateConfig.getPassword());
    assertNull(trustStore.getPassword());
    assertNull(certificateConfig.getPath());
    assertNull(trustStore.getPath());
    assertNull(actualBdkSslConfig.getTrustStorePassword());
    assertNull(actualBdkSslConfig.getTrustStorePath());
    assertFalse(certificateConfig.isConfigured());
    assertFalse(trustStore.isConfigured());
    assertTrue(certificateConfig.isValid());
    assertTrue(trustStore.isValid());
    assertTrue(actualBdkSslConfig.isValid());
  }
}
