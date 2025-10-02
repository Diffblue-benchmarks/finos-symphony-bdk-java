package com.symphony.bdk.core.config.model;

import static org.junit.jupiter.api.Assertions.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkRsaKeyConfigDiffblueTest {
  /**
   * Test new {@link BdkRsaKeyConfig} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link BdkRsaKeyConfig}
   */
  @Test
  @DisplayName("Test new BdkRsaKeyConfig (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BdkRsaKeyConfig.<init>()"})
  void testNewBdkRsaKeyConfig() {
    // Arrange and Act
    BdkRsaKeyConfig actualBdkRsaKeyConfig = new BdkRsaKeyConfig();

    // Assert
    assertNull(actualBdkRsaKeyConfig.getContent());
    assertNull(actualBdkRsaKeyConfig.getPath());
  }
}
