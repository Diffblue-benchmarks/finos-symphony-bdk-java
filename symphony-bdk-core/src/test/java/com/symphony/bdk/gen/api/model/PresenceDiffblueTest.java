package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.Presence.CategoryEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PresenceDiffblueTest {
  /**
   * Test CategoryEnum {@link CategoryEnum#fromValue(String)}.
   * <ul>
   *   <li>When {@code 42}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CategoryEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test CategoryEnum fromValue(String); when '42'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"CategoryEnum CategoryEnum.fromValue(String)"})
  void testCategoryEnumFromValue_when42_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(CategoryEnum.fromValue("42"));
  }

  /**
   * Test CategoryEnum {@link CategoryEnum#fromValue(String)}.
   * <ul>
   *   <li>When {@code UNDEFINED}.</li>
   *   <li>Then return {@code UNDEFINED}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CategoryEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test CategoryEnum fromValue(String); when 'UNDEFINED'; then return 'UNDEFINED'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"CategoryEnum CategoryEnum.fromValue(String)"})
  void testCategoryEnumFromValue_whenUndefined_thenReturnUndefined() {
    // Arrange, Act and Assert
    assertEquals(CategoryEnum.UNDEFINED, CategoryEnum.fromValue("UNDEFINED"));
  }

  /**
   * Test CategoryEnum getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link CategoryEnum#toString()}
   *   <li>{@link CategoryEnum#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test CategoryEnum getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String CategoryEnum.getValue()", "String CategoryEnum.toString()"})
  void testCategoryEnumGettersAndSetters() {
    // Arrange
    CategoryEnum valueOfResult = CategoryEnum.valueOf("UNDEFINED");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("UNDEFINED", valueOfResult.getValue());
    assertEquals("UNDEFINED", actualToStringResult);
  }

  /**
   * Test {@link Presence#equals(Object)}, and {@link Presence#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Presence#equals(Object)}
   *   <li>{@link Presence#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Presence.equals(Object)", "int Presence.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Presence presence = new Presence();
    Presence presence2 = new Presence();

    // Act and Assert
    assertEquals(presence, presence2);
    int expectedHashCodeResult = presence.hashCode();
    assertEquals(expectedHashCodeResult, presence2.hashCode());
  }

  /**
   * Test {@link Presence#equals(Object)}, and {@link Presence#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Presence#equals(Object)}
   *   <li>{@link Presence#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Presence.equals(Object)", "int Presence.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Presence presence = new Presence();

    // Act and Assert
    assertEquals(presence, presence);
    int expectedHashCodeResult = presence.hashCode();
    assertEquals(expectedHashCodeResult, presence.hashCode());
  }

  /**
   * Test {@link Presence#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Presence#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Presence.equals(Object)", "int Presence.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Presence(), null);
  }

  /**
   * Test {@link Presence#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Presence#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Presence.equals(Object)", "int Presence.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Presence(), null);
  }

  /**
   * Test {@link Presence#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Presence#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Presence.equals(Object)", "int Presence.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Presence(), "Different type to Presence");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link Presence}
   *   <li>{@link Presence#category(CategoryEnum)}
   *   <li>{@link Presence#setCategory(CategoryEnum)}
   *   <li>{@link Presence#toString()}
   *   <li>{@link Presence#getCategory()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void Presence.<init>()", "Presence Presence.category(CategoryEnum)",
      "CategoryEnum Presence.getCategory()", "void Presence.setCategory(CategoryEnum)", "String Presence.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    Presence actualPresence = new Presence();
    Presence actualCategoryResult = actualPresence.category(CategoryEnum.UNDEFINED);
    actualPresence.setCategory(CategoryEnum.UNDEFINED);
    String actualToStringResult = actualPresence.toString();

    // Assert
    assertEquals("class Presence {\n    category: UNDEFINED\n}", actualToStringResult);
    assertEquals(CategoryEnum.UNDEFINED, actualPresence.getCategory());
    assertSame(actualPresence, actualCategoryResult);
  }
}
