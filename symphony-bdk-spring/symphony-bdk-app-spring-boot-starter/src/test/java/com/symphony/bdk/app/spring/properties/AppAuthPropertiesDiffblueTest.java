package com.symphony.bdk.app.spring.properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AppAuthPropertiesDiffblueTest {
  /**
   * Test new {@link AppAuthProperties} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link AppAuthProperties}
   */
  @Test
  @DisplayName("Test new AppAuthProperties (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AppAuthProperties.<init>()"})
  void testNewAppAuthProperties() {
    // Arrange and Act
    AppAuthProperties actualAppAuthProperties = new AppAuthProperties();

    // Assert
    JwtCookieProperties jwtCookie = actualAppAuthProperties.getJwtCookie();
    assertEquals("Strict", jwtCookie.getSameSite());
    assertEquals(86400000000000L, jwtCookie.getMaxAge().toNanos());
    assertFalse(jwtCookie.getEnabled());
    assertTrue(actualAppAuthProperties.getEnabled());
  }
}
