package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DatafeedDiffblueTest {
  /**
   * Test {@link Datafeed#equals(Object)}, and {@link Datafeed#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Datafeed#equals(Object)}
   *   <li>{@link Datafeed#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Datafeed.equals(Object)", "int Datafeed.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Datafeed datafeed = new Datafeed();
    Datafeed datafeed2 = new Datafeed();

    // Act and Assert
    assertEquals(datafeed, datafeed2);
    assertEquals(datafeed.hashCode(), datafeed2.hashCode());
  }

  /**
   * Test {@link Datafeed#equals(Object)}, and {@link Datafeed#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Datafeed#equals(Object)}
   *   <li>{@link Datafeed#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Datafeed.equals(Object)", "int Datafeed.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Datafeed datafeed = new Datafeed();

    // Act and Assert
    assertEquals(datafeed, datafeed);
    int expectedHashCodeResult = datafeed.hashCode();
    assertEquals(expectedHashCodeResult, datafeed.hashCode());
  }

  /**
   * Test {@link Datafeed#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Datafeed#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Datafeed.equals(Object)", "int Datafeed.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Datafeed(), null);
  }

  /**
   * Test {@link Datafeed#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Datafeed#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Datafeed.equals(Object)", "int Datafeed.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Datafeed(), "Different type to Datafeed");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link Datafeed}
   *   <li>{@link Datafeed#id(String)}
   *   <li>{@link Datafeed#setId(String)}
   *   <li>{@link Datafeed#toString()}
   *   <li>{@link Datafeed#getId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Datafeed.<init>()",
    "String Datafeed.getId()",
    "Datafeed Datafeed.id(String)",
    "void Datafeed.setId(String)",
    "String Datafeed.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    Datafeed actualDatafeed = new Datafeed();
    Datafeed actualIdResult = actualDatafeed.id("42");
    actualDatafeed.setId("42");
    String actualToStringResult = actualDatafeed.toString();

    // Assert
    assertEquals("42", actualDatafeed.getId());
    assertEquals("class Datafeed {\n    id: 42\n}", actualToStringResult);
    assertSame(actualDatafeed, actualIdResult);
  }
}
