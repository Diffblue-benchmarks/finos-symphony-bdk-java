package com.symphony.bdk.app.spring.properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TracingPropertiesDiffblueTest {
  /**
   * Test new {@link TracingProperties} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link TracingProperties}
   */
  @Test
  @DisplayName("Test new TracingProperties (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
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
