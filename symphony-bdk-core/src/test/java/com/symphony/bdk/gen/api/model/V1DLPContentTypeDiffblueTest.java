package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V1DLPContentTypeDiffblueTest {
  /**
   * Test {@link V1DLPContentType#equals(Object)}, and {@link V1DLPContentType#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V1DLPContentType#equals(Object)}
   *   <li>{@link V1DLPContentType#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPContentType.equals(Object)", "int V1DLPContentType.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V1DLPContentType v1dlpContentType = new V1DLPContentType();
    V1DLPContentType v1dlpContentType2 = new V1DLPContentType();

    // Act and Assert
    assertEquals(v1dlpContentType, v1dlpContentType2);
    int expectedHashCodeResult = v1dlpContentType.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpContentType2.hashCode());
  }

  /**
   * Test {@link V1DLPContentType#equals(Object)}, and {@link V1DLPContentType#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V1DLPContentType#equals(Object)}
   *   <li>{@link V1DLPContentType#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPContentType.equals(Object)", "int V1DLPContentType.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V1DLPContentType v1dlpContentType = new V1DLPContentType();

    // Act and Assert
    assertEquals(v1dlpContentType, v1dlpContentType);
    int expectedHashCodeResult = v1dlpContentType.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpContentType.hashCode());
  }

  /**
   * Test {@link V1DLPContentType#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPContentType#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPContentType.equals(Object)", "int V1DLPContentType.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPContentType(), null);
  }

  /**
   * Test {@link V1DLPContentType#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPContentType#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPContentType.equals(Object)", "int V1DLPContentType.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPContentType(), "Different type to V1DLPContentType");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V1DLPContentType}
   *   <li>{@link V1DLPContentType#setType(String)}
   *   <li>{@link V1DLPContentType#type(String)}
   *   <li>{@link V1DLPContentType#toString()}
   *   <li>{@link V1DLPContentType#getType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V1DLPContentType.<init>()",
    "String V1DLPContentType.getType()",
    "void V1DLPContentType.setType(String)",
    "String V1DLPContentType.toString()",
    "V1DLPContentType V1DLPContentType.type(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V1DLPContentType actualV1dlpContentType = new V1DLPContentType();
    actualV1dlpContentType.setType("Type");
    V1DLPContentType actualTypeResult = actualV1dlpContentType.type("Type");
    String actualToStringResult = actualV1dlpContentType.toString();

    // Assert
    assertEquals("Type", actualV1dlpContentType.getType());
    assertEquals("class V1DLPContentType {\n    type: Type\n}", actualToStringResult);
    assertSame(actualV1dlpContentType, actualTypeResult);
  }
}
