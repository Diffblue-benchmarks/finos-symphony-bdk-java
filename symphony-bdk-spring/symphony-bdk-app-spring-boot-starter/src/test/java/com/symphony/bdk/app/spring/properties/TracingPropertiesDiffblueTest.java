package com.symphony.bdk.app.spring.properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TracingPropertiesDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link TracingProperties#setEnabled(Boolean)}
   *   <li>{@link TracingProperties#setUrlPatterns(List)}
   *   <li>{@link TracingProperties#getEnabled()}
   *   <li>{@link TracingProperties#getUrlPatterns()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Boolean TracingProperties.getEnabled()", "List TracingProperties.getUrlPatterns()",
      "void TracingProperties.setEnabled(Boolean)", "void TracingProperties.setUrlPatterns(List)"})
  void testGettersAndSetters() {
    // Arrange
    TracingProperties tracingProperties = new TracingProperties();

    // Act
    tracingProperties.setEnabled(true);
    ArrayList<String> urlPatterns = new ArrayList<>();
    tracingProperties.setUrlPatterns(urlPatterns);
    Boolean actualEnabled = tracingProperties.getEnabled();
    List<String> actualUrlPatterns = tracingProperties.getUrlPatterns();

    // Assert
    assertTrue(actualEnabled);
    assertTrue(actualUrlPatterns.isEmpty());
    assertSame(urlPatterns, actualUrlPatterns);
  }

  /**
   * Test new {@link TracingProperties} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link TracingProperties}
   */
  @Test
  @DisplayName("Test new TracingProperties (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void TracingProperties.<init>()"})
  void testNewTracingProperties() {
    // Arrange and Act
    TracingProperties actualTracingProperties = new TracingProperties();

    // Assert
    List<String> urlPatterns = actualTracingProperties.getUrlPatterns();
    assertEquals(1, urlPatterns.size());
    assertEquals("/*", urlPatterns.get(0));
    assertTrue(actualTracingProperties.getEnabled());
  }
}
