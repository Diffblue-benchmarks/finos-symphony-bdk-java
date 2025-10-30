package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V2RoomSearchCriteriaAllOfDiffblueTest {
  /**
   * Test {@link V2RoomSearchCriteriaAllOf#equals(Object)}, and {@link V2RoomSearchCriteriaAllOf#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V2RoomSearchCriteriaAllOf#equals(Object)}
   *   <li>{@link V2RoomSearchCriteriaAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2RoomSearchCriteriaAllOf.equals(Object)", "int V2RoomSearchCriteriaAllOf.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2RoomSearchCriteriaAllOf v2RoomSearchCriteriaAllOf = new V2RoomSearchCriteriaAllOf();
    V2RoomSearchCriteriaAllOf v2RoomSearchCriteriaAllOf2 = new V2RoomSearchCriteriaAllOf();

    // Act and Assert
    assertEquals(v2RoomSearchCriteriaAllOf, v2RoomSearchCriteriaAllOf2);
    int expectedHashCodeResult = v2RoomSearchCriteriaAllOf.hashCode();
    assertEquals(expectedHashCodeResult, v2RoomSearchCriteriaAllOf2.hashCode());
  }

  /**
   * Test {@link V2RoomSearchCriteriaAllOf#equals(Object)}, and {@link V2RoomSearchCriteriaAllOf#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V2RoomSearchCriteriaAllOf#equals(Object)}
   *   <li>{@link V2RoomSearchCriteriaAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2RoomSearchCriteriaAllOf.equals(Object)", "int V2RoomSearchCriteriaAllOf.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2RoomSearchCriteriaAllOf v2RoomSearchCriteriaAllOf = new V2RoomSearchCriteriaAllOf();

    // Act and Assert
    assertEquals(v2RoomSearchCriteriaAllOf, v2RoomSearchCriteriaAllOf);
    int expectedHashCodeResult = v2RoomSearchCriteriaAllOf.hashCode();
    assertEquals(expectedHashCodeResult, v2RoomSearchCriteriaAllOf.hashCode());
  }

  /**
   * Test {@link V2RoomSearchCriteriaAllOf#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2RoomSearchCriteriaAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2RoomSearchCriteriaAllOf.equals(Object)", "int V2RoomSearchCriteriaAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2RoomSearchCriteriaAllOf(), null);
  }

  /**
   * Test {@link V2RoomSearchCriteriaAllOf#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2RoomSearchCriteriaAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2RoomSearchCriteriaAllOf.equals(Object)", "int V2RoomSearchCriteriaAllOf.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2RoomSearchCriteriaAllOf(), null);
  }

  /**
   * Test {@link V2RoomSearchCriteriaAllOf#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2RoomSearchCriteriaAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2RoomSearchCriteriaAllOf.equals(Object)", "int V2RoomSearchCriteriaAllOf.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2RoomSearchCriteriaAllOf(), "Different type to V2RoomSearchCriteriaAllOf");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V2RoomSearchCriteriaAllOf}
   *   <li>{@link V2RoomSearchCriteriaAllOf#setSubType(String)}
   *   <li>{@link V2RoomSearchCriteriaAllOf#subType(String)}
   *   <li>{@link V2RoomSearchCriteriaAllOf#toString()}
   *   <li>{@link V2RoomSearchCriteriaAllOf#getSubType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V2RoomSearchCriteriaAllOf.<init>()", "String V2RoomSearchCriteriaAllOf.getSubType()",
      "void V2RoomSearchCriteriaAllOf.setSubType(String)",
      "V2RoomSearchCriteriaAllOf V2RoomSearchCriteriaAllOf.subType(String)",
      "String V2RoomSearchCriteriaAllOf.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    V2RoomSearchCriteriaAllOf actualV2RoomSearchCriteriaAllOf = new V2RoomSearchCriteriaAllOf();
    actualV2RoomSearchCriteriaAllOf.setSubType("Sub Type");
    V2RoomSearchCriteriaAllOf actualSubTypeResult = actualV2RoomSearchCriteriaAllOf.subType("Sub Type");
    String actualToStringResult = actualV2RoomSearchCriteriaAllOf.toString();

    // Assert
    assertEquals("Sub Type", actualV2RoomSearchCriteriaAllOf.getSubType());
    assertEquals("class V2RoomSearchCriteriaAllOf {\n    subType: Sub Type\n}", actualToStringResult);
    assertSame(actualV2RoomSearchCriteriaAllOf, actualSubTypeResult);
  }
}
