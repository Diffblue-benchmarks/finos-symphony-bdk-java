package com.symphony.bdk.app.spring.config;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.app.spring.SymphonyBdkAppProperties;
import com.symphony.bdk.app.spring.properties.AppAuthProperties;
import com.symphony.bdk.app.spring.properties.JwtCookieProperties;
import com.symphony.bdk.app.spring.properties.TracingProperties;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkExtAppSecurityConfigDiffblueTest {
  /**
   * Test {@link BdkExtAppSecurityConfig#corsFilters()}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link BdkExtAppSecurityConfig#corsFilters()}
   */
  @Test
  @DisplayName("Test corsFilters(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.List BdkExtAppSecurityConfig.corsFilters()"})
  void testCorsFilters_thenReturnEmpty() {
    // Arrange
    JwtCookieProperties jwtCookie = new JwtCookieProperties();
    jwtCookie.setEnabled(true);
    jwtCookie.setMaxAge(Duration.ofSeconds(1L));
    jwtCookie.setSameSite("Same Site");

    AppAuthProperties auth = new AppAuthProperties();
    auth.setEnabled(true);
    auth.setJwtCookie(jwtCookie);

    TracingProperties tracing = new TracingProperties();
    tracing.setEnabled(true);
    tracing.setUrlPatterns(new ArrayList<>());

    SymphonyBdkAppProperties properties = new SymphonyBdkAppProperties();
    properties.setAuth(auth);
    properties.setCors(new HashMap<>());
    properties.setTracing(tracing);

    // Act and Assert
    assertTrue(new BdkExtAppSecurityConfig(properties).corsFilters().isEmpty());
  }
}
