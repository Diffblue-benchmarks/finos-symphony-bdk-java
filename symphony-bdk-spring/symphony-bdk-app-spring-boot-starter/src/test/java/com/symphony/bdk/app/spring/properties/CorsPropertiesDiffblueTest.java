package com.symphony.bdk.app.spring.properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CorsPropertiesDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link CorsProperties#setAllowCredentials(Boolean)}
   *   <li>{@link CorsProperties#setAllowedHeaders(List)}
   *   <li>{@link CorsProperties#setAllowedMethods(List)}
   *   <li>{@link CorsProperties#setAllowedOrigins(List)}
   *   <li>{@link CorsProperties#setExposedHeaders(List)}
   *   <li>{@link CorsProperties#getAllowCredentials()}
   *   <li>{@link CorsProperties#getAllowedHeaders()}
   *   <li>{@link CorsProperties#getAllowedMethods()}
   *   <li>{@link CorsProperties#getAllowedOrigins()}
   *   <li>{@link CorsProperties#getExposedHeaders()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Boolean CorsProperties.getAllowCredentials()", "List CorsProperties.getAllowedHeaders()",
      "List CorsProperties.getAllowedMethods()", "List CorsProperties.getAllowedOrigins()",
      "List CorsProperties.getExposedHeaders()", "void CorsProperties.setAllowCredentials(Boolean)",
      "void CorsProperties.setAllowedHeaders(List)", "void CorsProperties.setAllowedMethods(List)",
      "void CorsProperties.setAllowedOrigins(List)", "void CorsProperties.setExposedHeaders(List)"})
  void testGettersAndSetters() {
    // Arrange
    CorsProperties corsProperties = new CorsProperties();

    // Act
    corsProperties.setAllowCredentials(true);
    ArrayList<String> allowedHeaders = new ArrayList<>();
    corsProperties.setAllowedHeaders(allowedHeaders);
    ArrayList<String> allowedMethods = new ArrayList<>();
    corsProperties.setAllowedMethods(allowedMethods);
    ArrayList<String> allowedOrigins = new ArrayList<>();
    corsProperties.setAllowedOrigins(allowedOrigins);
    ArrayList<String> exposedHeaders = new ArrayList<>();
    corsProperties.setExposedHeaders(exposedHeaders);
    Boolean actualAllowCredentials = corsProperties.getAllowCredentials();
    List<String> actualAllowedHeaders = corsProperties.getAllowedHeaders();
    List<String> actualAllowedMethods = corsProperties.getAllowedMethods();
    List<String> actualAllowedOrigins = corsProperties.getAllowedOrigins();
    List<String> actualExposedHeaders = corsProperties.getExposedHeaders();

    // Assert
    assertTrue(actualAllowCredentials);
    assertTrue(actualAllowedHeaders.isEmpty());
    assertTrue(actualAllowedMethods.isEmpty());
    assertTrue(actualAllowedOrigins.isEmpty());
    assertTrue(actualExposedHeaders.isEmpty());
    assertSame(allowedHeaders, actualAllowedHeaders);
    assertSame(allowedMethods, actualAllowedMethods);
    assertSame(allowedOrigins, actualAllowedOrigins);
    assertSame(exposedHeaders, actualExposedHeaders);
  }

  /**
   * Test new {@link CorsProperties} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link CorsProperties}
   */
  @Test
  @DisplayName("Test new CorsProperties (default constructor)")
  @Tag("MaintainedByDiffblue")
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
