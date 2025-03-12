package com.symphony.bdk.app.spring.properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AppAuthPropertiesDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AppAuthProperties#setEnabled(Boolean)}
   *   <li>{@link AppAuthProperties#setJwtCookie(JwtCookieProperties)}
   *   <li>{@link AppAuthProperties#getEnabled()}
   *   <li>{@link AppAuthProperties#getJwtCookie()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Boolean AppAuthProperties.getEnabled()", "JwtCookieProperties AppAuthProperties.getJwtCookie()",
      "void AppAuthProperties.setEnabled(Boolean)", "void AppAuthProperties.setJwtCookie(JwtCookieProperties)"})
  void testGettersAndSetters() {
    // Arrange
    AppAuthProperties appAuthProperties = new AppAuthProperties();

    // Act
    appAuthProperties.setEnabled(true);
    JwtCookieProperties jwtCookie = new JwtCookieProperties();
    jwtCookie.setEnabled(true);
    jwtCookie.setSameSite("Same Site");
    appAuthProperties.setJwtCookie(jwtCookie);
    Boolean actualEnabled = appAuthProperties.getEnabled();

    // Assert
    assertTrue(actualEnabled);
    assertSame(jwtCookie, appAuthProperties.getJwtCookie());
  }

  /**
   * Test new {@link AppAuthProperties} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link AppAuthProperties}
   */
  @Test
  @DisplayName("Test new AppAuthProperties (default constructor)")
  @Tag("MaintainedByDiffblue")
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
