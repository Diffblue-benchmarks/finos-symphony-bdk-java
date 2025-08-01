package com.symphony.bdk.examples.app.spring;

import static org.junit.jupiter.api.Assertions.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SecurityConfigDiffblueTest {
  /**
   * Test {@link SecurityConfig#webSecurityCustomizer()}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityConfig#webSecurityCustomizer()}
   */
  @Test
  @DisplayName("Test webSecurityCustomizer(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer SecurityConfig.webSecurityCustomizer()"
  })
  void testWebSecurityCustomizer_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(new SecurityConfig().webSecurityCustomizer());
  }
}
