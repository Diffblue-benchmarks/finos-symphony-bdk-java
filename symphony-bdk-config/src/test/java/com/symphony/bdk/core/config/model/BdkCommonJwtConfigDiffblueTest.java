package com.symphony.bdk.core.config.model;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkCommonJwtConfigDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link BdkCommonJwtConfig}
   *   <li>{@link BdkCommonJwtConfig#setEnabled(Boolean)}
   *   <li>{@link BdkCommonJwtConfig#getEnabled()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BdkCommonJwtConfig.<init>()", "Boolean BdkCommonJwtConfig.getEnabled()",
      "void BdkCommonJwtConfig.setEnabled(Boolean)"})
  void testGettersAndSetters() {
    // Arrange and Act
    BdkCommonJwtConfig actualBdkCommonJwtConfig = new BdkCommonJwtConfig();
    actualBdkCommonJwtConfig.setEnabled(true);

    // Assert
    assertTrue(actualBdkCommonJwtConfig.getEnabled());
  }
}
