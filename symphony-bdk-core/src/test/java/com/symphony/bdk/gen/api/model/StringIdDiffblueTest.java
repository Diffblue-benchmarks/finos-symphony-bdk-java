package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class StringIdDiffblueTest {
  /**
   * Test {@link StringId#equals(Object)}, and {@link StringId#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link StringId#equals(Object)}
   *   <li>{@link StringId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StringId.equals(Object)", "int StringId.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    StringId stringId = new StringId();
    StringId stringId2 = new StringId();

    // Act and Assert
    assertEquals(stringId, stringId2);
    int expectedHashCodeResult = stringId.hashCode();
    assertEquals(expectedHashCodeResult, stringId2.hashCode());
  }

  /**
   * Test {@link StringId#equals(Object)}, and {@link StringId#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link StringId#equals(Object)}
   *   <li>{@link StringId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StringId.equals(Object)", "int StringId.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    StringId stringId = new StringId();

    // Act and Assert
    assertEquals(stringId, stringId);
    int expectedHashCodeResult = stringId.hashCode();
    assertEquals(expectedHashCodeResult, stringId.hashCode());
  }

  /**
   * Test {@link StringId#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StringId.equals(Object)", "int StringId.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new StringId(), null);
  }

  /**
   * Test {@link StringId#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StringId.equals(Object)", "int StringId.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new StringId(), null);
  }

  /**
   * Test {@link StringId#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StringId.equals(Object)", "int StringId.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new StringId(), "Different type to StringId");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link StringId}
   *   <li>{@link StringId#id(String)}
   *   <li>{@link StringId#setId(String)}
   *   <li>{@link StringId#toString()}
   *   <li>{@link StringId#getId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void StringId.<init>()", "String StringId.getId()", "StringId StringId.id(String)",
      "void StringId.setId(String)", "String StringId.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    StringId actualStringId = new StringId();
    StringId actualIdResult = actualStringId.id("42");
    actualStringId.setId("42");
    String actualToStringResult = actualStringId.toString();

    // Assert
    assertEquals("42", actualStringId.getId());
    assertEquals("class StringId {\n    id: 42\n}", actualToStringResult);
    assertSame(actualStringId, actualIdResult);
  }
}
