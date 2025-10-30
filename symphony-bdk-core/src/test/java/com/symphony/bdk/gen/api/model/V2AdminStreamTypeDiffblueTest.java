package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V2AdminStreamTypeDiffblueTest {
  /**
   * Test {@link V2AdminStreamType#equals(Object)}, and {@link V2AdminStreamType#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V2AdminStreamType#equals(Object)}
   *   <li>{@link V2AdminStreamType#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2AdminStreamType.equals(Object)", "int V2AdminStreamType.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2AdminStreamType v2AdminStreamType = new V2AdminStreamType();
    V2AdminStreamType v2AdminStreamType2 = new V2AdminStreamType();

    // Act and Assert
    assertEquals(v2AdminStreamType, v2AdminStreamType2);
    int expectedHashCodeResult = v2AdminStreamType.hashCode();
    assertEquals(expectedHashCodeResult, v2AdminStreamType2.hashCode());
  }

  /**
   * Test {@link V2AdminStreamType#equals(Object)}, and {@link V2AdminStreamType#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V2AdminStreamType#equals(Object)}
   *   <li>{@link V2AdminStreamType#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2AdminStreamType.equals(Object)", "int V2AdminStreamType.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2AdminStreamType v2AdminStreamType = new V2AdminStreamType();

    // Act and Assert
    assertEquals(v2AdminStreamType, v2AdminStreamType);
    int expectedHashCodeResult = v2AdminStreamType.hashCode();
    assertEquals(expectedHashCodeResult, v2AdminStreamType.hashCode());
  }

  /**
   * Test {@link V2AdminStreamType#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2AdminStreamType#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2AdminStreamType.equals(Object)", "int V2AdminStreamType.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2AdminStreamType(), null);
  }

  /**
   * Test {@link V2AdminStreamType#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2AdminStreamType#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2AdminStreamType.equals(Object)", "int V2AdminStreamType.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2AdminStreamType(), null);
  }

  /**
   * Test {@link V2AdminStreamType#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2AdminStreamType#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2AdminStreamType.equals(Object)", "int V2AdminStreamType.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2AdminStreamType(), "Different type to V2AdminStreamType");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V2AdminStreamType}
   *   <li>{@link V2AdminStreamType#setType(String)}
   *   <li>{@link V2AdminStreamType#type(String)}
   *   <li>{@link V2AdminStreamType#toString()}
   *   <li>{@link V2AdminStreamType#getType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V2AdminStreamType.<init>()", "String V2AdminStreamType.getType()",
      "void V2AdminStreamType.setType(String)", "String V2AdminStreamType.toString()",
      "V2AdminStreamType V2AdminStreamType.type(String)"})
  void testGettersAndSetters() {
    // Arrange and Act
    V2AdminStreamType actualV2AdminStreamType = new V2AdminStreamType();
    actualV2AdminStreamType.setType("Type");
    V2AdminStreamType actualTypeResult = actualV2AdminStreamType.type("Type");
    String actualToStringResult = actualV2AdminStreamType.toString();

    // Assert
    assertEquals("Type", actualV2AdminStreamType.getType());
    assertEquals("class V2AdminStreamType {\n    type: Type\n}", actualToStringResult);
    assertSame(actualV2AdminStreamType, actualTypeResult);
  }
}
