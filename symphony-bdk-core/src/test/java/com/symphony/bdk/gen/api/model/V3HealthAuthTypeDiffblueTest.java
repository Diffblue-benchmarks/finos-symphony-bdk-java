package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V3HealthAuthTypeDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3HealthAuthType#toString()}
   *   <li>{@link V3HealthAuthType#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String V3HealthAuthType.getValue()", "String V3HealthAuthType.toString()"})
  void testGettersAndSetters() {
    // Arrange
    V3HealthAuthType valueOfResult = V3HealthAuthType.valueOf("RSA");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("RSA", valueOfResult.getValue());
    assertEquals("RSA", actualToStringResult);
  }

  /**
   * Test {@link V3HealthAuthType#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link V3HealthAuthType#fromValue(String)}
   */
  @Test
  @DisplayName("Test fromValue(String); when '42'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V3HealthAuthType V3HealthAuthType.fromValue(String)"})
  void testFromValue_when42_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> V3HealthAuthType.fromValue("42"));
  }

  /**
   * Test {@link V3HealthAuthType#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code RSA}.
   *   <li>Then return {@code RSA}.
   * </ul>
   *
   * <p>Method under test: {@link V3HealthAuthType#fromValue(String)}
   */
  @Test
  @DisplayName("Test fromValue(String); when 'RSA'; then return 'RSA'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V3HealthAuthType V3HealthAuthType.fromValue(String)"})
  void testFromValue_whenRsa_thenReturnRsa() {
    // Arrange, Act and Assert
    assertEquals(V3HealthAuthType.RSA, V3HealthAuthType.fromValue("RSA"));
  }
}
