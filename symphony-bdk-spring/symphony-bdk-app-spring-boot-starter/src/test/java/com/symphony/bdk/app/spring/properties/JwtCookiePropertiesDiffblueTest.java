package com.symphony.bdk.app.spring.properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.time.Duration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class JwtCookiePropertiesDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link JwtCookieProperties#setEnabled(Boolean)}
   *   <li>{@link JwtCookieProperties#setMaxAge(Duration)}
   *   <li>{@link JwtCookieProperties#setSameSite(String)}
   *   <li>{@link JwtCookieProperties#getEnabled()}
   *   <li>{@link JwtCookieProperties#getMaxAge()}
   *   <li>{@link JwtCookieProperties#getSameSite()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Boolean JwtCookieProperties.getEnabled()", "Duration JwtCookieProperties.getMaxAge()",
      "String JwtCookieProperties.getSameSite()", "void JwtCookieProperties.setEnabled(Boolean)",
      "void JwtCookieProperties.setMaxAge(Duration)", "void JwtCookieProperties.setSameSite(String)"})
  void testGettersAndSetters() {
    // Arrange
    JwtCookieProperties jwtCookieProperties = new JwtCookieProperties();

    // Act
    jwtCookieProperties.setEnabled(true);
    jwtCookieProperties.setMaxAge(null);
    jwtCookieProperties.setSameSite("Same Site");
    Boolean actualEnabled = jwtCookieProperties.getEnabled();
    Duration actualMaxAge = jwtCookieProperties.getMaxAge();

    // Assert
    assertEquals("Same Site", jwtCookieProperties.getSameSite());
    assertNull(actualMaxAge);
    assertTrue(actualEnabled);
  }

  /**
   * Test new {@link JwtCookieProperties} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link JwtCookieProperties}
   */
  @Test
  @DisplayName("Test new JwtCookieProperties (default constructor)")
  @Tag("MaintainedByDiffblue")
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
