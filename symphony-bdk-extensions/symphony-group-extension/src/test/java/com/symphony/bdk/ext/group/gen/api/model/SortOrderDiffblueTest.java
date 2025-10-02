package com.symphony.bdk.ext.group.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SortOrderDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SortOrder#toString()}
   *   <li>{@link SortOrder#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String SortOrder.getValue()", "String SortOrder.toString()"})
  void testGettersAndSetters() {
    // Arrange
    SortOrder valueOfResult = SortOrder.valueOf("ASC");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("ASC", valueOfResult.getValue());
    assertEquals("ASC", actualToStringResult);
  }

  /**
   * Test {@link SortOrder#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link SortOrder#fromValue(String)}
   */
  @Test
  @DisplayName("Test fromValue(String); when '42'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortOrder SortOrder.fromValue(String)"})
  void testFromValue_when42_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> SortOrder.fromValue("42"));
  }

  /**
   * Test {@link SortOrder#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code ASC}.
   *   <li>Then return {@code ASC}.
   * </ul>
   *
   * <p>Method under test: {@link SortOrder#fromValue(String)}
   */
  @Test
  @DisplayName("Test fromValue(String); when 'ASC'; then return 'ASC'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortOrder SortOrder.fromValue(String)"})
  void testFromValue_whenAsc_thenReturnAsc() {
    // Arrange, Act and Assert
    assertEquals(SortOrder.ASC, SortOrder.fromValue("ASC"));
  }
}
