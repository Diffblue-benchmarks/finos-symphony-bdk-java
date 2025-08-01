package com.symphony.bdk.app.spring.properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class JwtCookiePropertiesDiffblueTest {
  /**
   * Test new {@link JwtCookieProperties} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link JwtCookieProperties}
   */
  @Test
  @DisplayName("Test new JwtCookieProperties (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void JwtCookieProperties.<init>()"})
  void testNewJwtCookieProperties() {
    // Arrange and Act
    JwtCookieProperties actualJwtCookieProperties = new JwtCookieProperties();

    // Assert
    assertEquals("Strict", actualJwtCookieProperties.getSameSite());
    assertEquals(86400000000000L, actualJwtCookieProperties.getMaxAge().toNanos());
    assertFalse(actualJwtCookieProperties.getEnabled());
  }
}
