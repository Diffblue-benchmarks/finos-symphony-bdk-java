package com.symphony.bdk.app.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.app.spring.properties.AppAuthProperties;
import com.symphony.bdk.app.spring.properties.JwtCookieProperties;
import com.symphony.bdk.app.spring.properties.TracingProperties;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SymphonyBdkAppPropertiesDiffblueTest {
  /**
   * Test new {@link SymphonyBdkAppProperties} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link SymphonyBdkAppProperties}
   */
  @Test
  @DisplayName("Test new SymphonyBdkAppProperties (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SymphonyBdkAppProperties.<init>()"})
  void testNewSymphonyBdkAppProperties() {
    // Arrange and Act
    SymphonyBdkAppProperties actualSymphonyBdkAppProperties = new SymphonyBdkAppProperties();

    // Assert
    TracingProperties tracing = actualSymphonyBdkAppProperties.getTracing();
    List<String> urlPatterns = tracing.getUrlPatterns();
    assertEquals(1, urlPatterns.size());
    assertEquals("/*", urlPatterns.get(0));
    AppAuthProperties auth = actualSymphonyBdkAppProperties.getAuth();
    JwtCookieProperties jwtCookie = auth.getJwtCookie();
    assertEquals("Strict", jwtCookie.getSameSite());
    assertEquals(86400000000000L, jwtCookie.getMaxAge().toNanos());
    assertFalse(jwtCookie.getEnabled());
    assertTrue(auth.getEnabled());
    assertTrue(tracing.getEnabled());
    assertTrue(actualSymphonyBdkAppProperties.getCors().isEmpty());
  }
}
