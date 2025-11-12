package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V2StreamTypeDiffblueTest {
  /**
   * Test {@link V2StreamType#equals(Object)}, and {@link V2StreamType#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2StreamType#equals(Object)}
   *   <li>{@link V2StreamType#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2StreamType.equals(Object)", "int V2StreamType.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2StreamType v2StreamType = new V2StreamType();
    V2StreamType v2StreamType2 = new V2StreamType();

    // Act and Assert
    assertEquals(v2StreamType, v2StreamType2);
    assertEquals(v2StreamType.hashCode(), v2StreamType2.hashCode());
  }

  /**
   * Test {@link V2StreamType#equals(Object)}, and {@link V2StreamType#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2StreamType#equals(Object)}
   *   <li>{@link V2StreamType#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2StreamType.equals(Object)", "int V2StreamType.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2StreamType v2StreamType = new V2StreamType();

    // Act and Assert
    assertEquals(v2StreamType, v2StreamType);
    int expectedHashCodeResult = v2StreamType.hashCode();
    assertEquals(expectedHashCodeResult, v2StreamType.hashCode());
  }

  /**
   * Test {@link V2StreamType#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2StreamType#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2StreamType.equals(Object)", "int V2StreamType.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2StreamType(), null);
  }

  /**
   * Test {@link V2StreamType#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2StreamType#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2StreamType.equals(Object)", "int V2StreamType.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2StreamType(), "Different type to V2StreamType");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V2StreamType}
   *   <li>{@link V2StreamType#setType(String)}
   *   <li>{@link V2StreamType#type(String)}
   *   <li>{@link V2StreamType#toString()}
   *   <li>{@link V2StreamType#getType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V2StreamType.<init>()",
    "String V2StreamType.getType()",
    "void V2StreamType.setType(String)",
    "String V2StreamType.toString()",
    "V2StreamType V2StreamType.type(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V2StreamType actualV2StreamType = new V2StreamType();
    actualV2StreamType.setType("Type");
    V2StreamType actualTypeResult = actualV2StreamType.type("Type");
    String actualToStringResult = actualV2StreamType.toString();

    // Assert
    assertEquals("Type", actualV2StreamType.getType());
    assertEquals("class V2StreamType {\n    type: Type\n}", actualToStringResult);
    assertSame(actualV2StreamType, actualTypeResult);
  }
}
