package com.symphony.bdk.app.spring.config;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.app.spring.SymphonyBdkAppProperties;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkExtAppSecurityConfigDiffblueTest {
  /**
   * Test {@link BdkExtAppSecurityConfig#corsFilters()}.
   * <ul>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkExtAppSecurityConfig#corsFilters()}
   */
  @Test
  @DisplayName("Test corsFilters(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.util.List BdkExtAppSecurityConfig.corsFilters()"})
  void testCorsFilters_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertTrue((new BdkExtAppSecurityConfig(new SymphonyBdkAppProperties())).corsFilters().isEmpty());
  }
}
