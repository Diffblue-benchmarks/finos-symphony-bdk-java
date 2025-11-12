package com.symphony.bdk.app.spring.properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CorsPropertiesDiffblueTest {
  /**
   * Test new {@link CorsProperties} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link CorsProperties}
   */
  @Test
  @DisplayName("Test new CorsProperties (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CorsProperties.<init>()"})
  void testNewCorsProperties() {
    // Arrange and Act
    CorsProperties actualCorsProperties = new CorsProperties();

    // Assert
    List<String> allowedOrigins = actualCorsProperties.getAllowedOrigins();
    assertEquals(1, allowedOrigins.size());
    assertEquals("/**", allowedOrigins.get(0));
    assertFalse(actualCorsProperties.getAllowCredentials());
    List<String> allowedHeaders = actualCorsProperties.getAllowedHeaders();
    assertTrue(allowedHeaders.isEmpty());
    assertSame(allowedHeaders, actualCorsProperties.getAllowedMethods());
    assertSame(allowedHeaders, actualCorsProperties.getExposedHeaders());
  }
}
