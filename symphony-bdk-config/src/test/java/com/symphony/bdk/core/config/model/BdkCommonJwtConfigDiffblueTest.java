package com.symphony.bdk.core.config.model;

import static org.junit.jupiter.api.Assertions.assertFalse;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkCommonJwtConfigDiffblueTest {
  /**
   * Test new {@link BdkCommonJwtConfig} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link BdkCommonJwtConfig}
   */
  @Test
  @DisplayName("Test new BdkCommonJwtConfig (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BdkCommonJwtConfig.<init>()"})
  void testNewBdkCommonJwtConfig() {
    // Arrange, Act and Assert
    assertFalse(new BdkCommonJwtConfig().getEnabled());
  }
}
