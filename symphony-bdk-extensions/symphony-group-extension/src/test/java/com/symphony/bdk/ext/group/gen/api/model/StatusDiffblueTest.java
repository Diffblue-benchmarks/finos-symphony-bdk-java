package com.symphony.bdk.ext.group.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class StatusDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Status#toString()}
   *   <li>{@link Status#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Status.getValue()", "String Status.toString()"})
  void testGettersAndSetters() {
    // Arrange
    Status valueOfResult = Status.valueOf("ACTIVE");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("ACTIVE", valueOfResult.getValue());
    assertEquals("ACTIVE", actualToStringResult);
  }

  /**
   * Test {@link Status#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Status#fromValue(String)}
   */
  @Test
  @DisplayName("Test fromValue(String); when '42'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Status Status.fromValue(String)"})
  void testFromValue_when42_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Status.fromValue("42"));
  }

  /**
   * Test {@link Status#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code ACTIVE}.
   *   <li>Then return {@code ACTIVE}.
   * </ul>
   *
   * <p>Method under test: {@link Status#fromValue(String)}
   */
  @Test
  @DisplayName("Test fromValue(String); when 'ACTIVE'; then return 'ACTIVE'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Status Status.fromValue(String)"})
  void testFromValue_whenActive_thenReturnActive() {
    // Arrange, Act and Assert
    assertEquals(Status.ACTIVE, Status.fromValue("ACTIVE"));
  }
}
