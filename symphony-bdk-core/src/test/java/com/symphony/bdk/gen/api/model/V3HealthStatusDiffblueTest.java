package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V3HealthStatusDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3HealthStatus#toString()}
   *   <li>{@link V3HealthStatus#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String V3HealthStatus.getValue()", "String V3HealthStatus.toString()"})
  void testGettersAndSetters() {
    // Arrange
    V3HealthStatus valueOfResult = V3HealthStatus.valueOf("UP");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("UP", valueOfResult.getValue());
    assertEquals("UP", actualToStringResult);
  }

  /**
   * Test {@link V3HealthStatus#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link V3HealthStatus#fromValue(String)}
   */
  @Test
  @DisplayName("Test fromValue(String); when '42'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V3HealthStatus V3HealthStatus.fromValue(String)"})
  void testFromValue_when42_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> V3HealthStatus.fromValue("42"));
  }

  /**
   * Test {@link V3HealthStatus#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code UP}.
   *   <li>Then return {@code UP}.
   * </ul>
   *
   * <p>Method under test: {@link V3HealthStatus#fromValue(String)}
   */
  @Test
  @DisplayName("Test fromValue(String); when 'UP'; then return 'UP'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V3HealthStatus V3HealthStatus.fromValue(String)"})
  void testFromValue_whenUp_thenReturnUp() {
    // Arrange, Act and Assert
    assertEquals(V3HealthStatus.UP, V3HealthStatus.fromValue("UP"));
  }
}
