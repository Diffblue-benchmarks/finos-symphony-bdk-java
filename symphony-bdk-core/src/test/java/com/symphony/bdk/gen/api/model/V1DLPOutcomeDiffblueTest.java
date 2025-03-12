package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V1DLPOutcomeDiffblueTest {
  /**
   * Test {@link V1DLPOutcome#equals(Object)}, and {@link V1DLPOutcome#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V1DLPOutcome#equals(Object)}
   *   <li>{@link V1DLPOutcome#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPOutcome.equals(Object)", "int V1DLPOutcome.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V1DLPOutcome v1dlpOutcome = new V1DLPOutcome();
    V1DLPOutcome v1dlpOutcome2 = new V1DLPOutcome();

    // Act and Assert
    assertEquals(v1dlpOutcome, v1dlpOutcome2);
    int expectedHashCodeResult = v1dlpOutcome.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpOutcome2.hashCode());
  }

  /**
   * Test {@link V1DLPOutcome#equals(Object)}, and {@link V1DLPOutcome#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V1DLPOutcome#equals(Object)}
   *   <li>{@link V1DLPOutcome#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPOutcome.equals(Object)", "int V1DLPOutcome.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V1DLPOutcome v1dlpOutcome = new V1DLPOutcome();

    // Act and Assert
    assertEquals(v1dlpOutcome, v1dlpOutcome);
    int expectedHashCodeResult = v1dlpOutcome.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpOutcome.hashCode());
  }

  /**
   * Test {@link V1DLPOutcome#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPOutcome#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPOutcome.equals(Object)", "int V1DLPOutcome.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPOutcome(), null);
  }

  /**
   * Test {@link V1DLPOutcome#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPOutcome#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPOutcome.equals(Object)", "int V1DLPOutcome.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPOutcome(), null);
  }

  /**
   * Test {@link V1DLPOutcome#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPOutcome#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPOutcome.equals(Object)", "int V1DLPOutcome.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPOutcome(), "Different type to V1DLPOutcome");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V1DLPOutcome}
   *   <li>{@link V1DLPOutcome#setType(String)}
   *   <li>{@link V1DLPOutcome#type(String)}
   *   <li>{@link V1DLPOutcome#toString()}
   *   <li>{@link V1DLPOutcome#getType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V1DLPOutcome.<init>()", "String V1DLPOutcome.getType()", "void V1DLPOutcome.setType(String)",
      "String V1DLPOutcome.toString()", "V1DLPOutcome V1DLPOutcome.type(String)"})
  void testGettersAndSetters() {
    // Arrange and Act
    V1DLPOutcome actualV1dlpOutcome = new V1DLPOutcome();
    actualV1dlpOutcome.setType("Type");
    V1DLPOutcome actualTypeResult = actualV1dlpOutcome.type("Type");
    String actualToStringResult = actualV1dlpOutcome.toString();

    // Assert
    assertEquals("Type", actualV1dlpOutcome.getType());
    assertEquals("class V1DLPOutcome {\n    type: Type\n}", actualToStringResult);
    assertSame(actualV1dlpOutcome, actualTypeResult);
  }
}
