package com.symphony.bdk.ext.group.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class OwnerDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Owner#toString()}
   *   <li>{@link Owner#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String Owner.getValue()", "String Owner.toString()"})
  void testGettersAndSetters() {
    // Arrange
    Owner valueOfResult = Owner.valueOf("PLATFORM");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("PLATFORM", valueOfResult.getValue());
    assertEquals("PLATFORM", actualToStringResult);
  }

  /**
   * Test {@link Owner#fromValue(String)}.
   * <ul>
   *   <li>When {@code 42}.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Owner#fromValue(String)}
   */
  @Test
  @DisplayName("Test fromValue(String); when '42'; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Owner Owner.fromValue(String)"})
  void testFromValue_when42_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Owner.fromValue("42"));
  }

  /**
   * Test {@link Owner#fromValue(String)}.
   * <ul>
   *   <li>When {@code PLATFORM}.</li>
   *   <li>Then return {@code PLATFORM}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Owner#fromValue(String)}
   */
  @Test
  @DisplayName("Test fromValue(String); when 'PLATFORM'; then return 'PLATFORM'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Owner Owner.fromValue(String)"})
  void testFromValue_whenPlatform_thenReturnPlatform() {
    // Arrange, Act and Assert
    assertEquals(Owner.PLATFORM, Owner.fromValue("PLATFORM"));
  }
}
