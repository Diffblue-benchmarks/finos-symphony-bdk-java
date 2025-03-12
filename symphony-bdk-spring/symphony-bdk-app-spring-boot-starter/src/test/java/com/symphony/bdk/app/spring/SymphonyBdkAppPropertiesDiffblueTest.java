package com.symphony.bdk.app.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.app.spring.properties.AppAuthProperties;
import com.symphony.bdk.app.spring.properties.CorsProperties;
import com.symphony.bdk.app.spring.properties.JwtCookieProperties;
import com.symphony.bdk.app.spring.properties.TracingProperties;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SymphonyBdkAppPropertiesDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link SymphonyBdkAppProperties#setAuth(AppAuthProperties)}
   *   <li>{@link SymphonyBdkAppProperties#setCors(Map)}
   *   <li>{@link SymphonyBdkAppProperties#setTracing(TracingProperties)}
   *   <li>{@link SymphonyBdkAppProperties#getAuth()}
   *   <li>{@link SymphonyBdkAppProperties#getCors()}
   *   <li>{@link SymphonyBdkAppProperties#getTracing()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"AppAuthProperties SymphonyBdkAppProperties.getAuth()", "Map SymphonyBdkAppProperties.getCors()",
      "TracingProperties SymphonyBdkAppProperties.getTracing()",
      "void SymphonyBdkAppProperties.setAuth(AppAuthProperties)", "void SymphonyBdkAppProperties.setCors(Map)",
      "void SymphonyBdkAppProperties.setTracing(TracingProperties)"})
  void testGettersAndSetters() {
    // Arrange
    SymphonyBdkAppProperties symphonyBdkAppProperties = new SymphonyBdkAppProperties();

    JwtCookieProperties jwtCookie = new JwtCookieProperties();
    jwtCookie.setEnabled(true);
    jwtCookie.setSameSite("Same Site");

    AppAuthProperties auth = new AppAuthProperties();
    auth.setEnabled(true);
    auth.setJwtCookie(jwtCookie);

    // Act
    symphonyBdkAppProperties.setAuth(auth);
    HashMap<String, CorsProperties> cors = new HashMap<>();
    symphonyBdkAppProperties.setCors(cors);
    TracingProperties tracing = new TracingProperties();
    tracing.setEnabled(true);
    tracing.setUrlPatterns(new ArrayList<>());
    symphonyBdkAppProperties.setTracing(tracing);
    AppAuthProperties actualAuth = symphonyBdkAppProperties.getAuth();
    Map<String, CorsProperties> actualCors = symphonyBdkAppProperties.getCors();
    TracingProperties actualTracing = symphonyBdkAppProperties.getTracing();

    // Assert
    assertTrue(actualCors.isEmpty());
    assertSame(auth, actualAuth);
    assertSame(tracing, actualTracing);
    assertSame(cors, actualCors);
  }

  /**
   * Test new {@link SymphonyBdkAppProperties} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link SymphonyBdkAppProperties}
   */
  @Test
  @DisplayName("Test new SymphonyBdkAppProperties (default constructor)")
  @Tag("MaintainedByDiffblue")
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
