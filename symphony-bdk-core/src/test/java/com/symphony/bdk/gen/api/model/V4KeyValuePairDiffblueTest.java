package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V4KeyValuePairDiffblueTest {
  /**
   * Test {@link V4KeyValuePair#equals(Object)}, and {@link V4KeyValuePair#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4KeyValuePair#equals(Object)}
   *   <li>{@link V4KeyValuePair#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4KeyValuePair.equals(Object)", "int V4KeyValuePair.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4KeyValuePair v4KeyValuePair = new V4KeyValuePair();
    V4KeyValuePair v4KeyValuePair2 = new V4KeyValuePair();

    // Act and Assert
    assertEquals(v4KeyValuePair, v4KeyValuePair2);
    int expectedHashCodeResult = v4KeyValuePair.hashCode();
    assertEquals(expectedHashCodeResult, v4KeyValuePair2.hashCode());
  }

  /**
   * Test {@link V4KeyValuePair#equals(Object)}, and {@link V4KeyValuePair#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4KeyValuePair#equals(Object)}
   *   <li>{@link V4KeyValuePair#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4KeyValuePair.equals(Object)", "int V4KeyValuePair.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4KeyValuePair v4KeyValuePair = new V4KeyValuePair();

    // Act and Assert
    assertEquals(v4KeyValuePair, v4KeyValuePair);
    int expectedHashCodeResult = v4KeyValuePair.hashCode();
    assertEquals(expectedHashCodeResult, v4KeyValuePair.hashCode());
  }

  /**
   * Test {@link V4KeyValuePair#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4KeyValuePair#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4KeyValuePair.equals(Object)", "int V4KeyValuePair.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4KeyValuePair(), 1);
  }

  /**
   * Test {@link V4KeyValuePair#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4KeyValuePair#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4KeyValuePair.equals(Object)", "int V4KeyValuePair.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V4KeyValuePair v4KeyValuePair = new V4KeyValuePair();
    v4KeyValuePair.key("Key");

    // Act and Assert
    assertNotEquals(v4KeyValuePair, new V4KeyValuePair());
  }

  /**
   * Test {@link V4KeyValuePair#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4KeyValuePair#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4KeyValuePair.equals(Object)", "int V4KeyValuePair.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V4KeyValuePair v4KeyValuePair = new V4KeyValuePair();
    v4KeyValuePair.value("42");

    // Act and Assert
    assertNotEquals(v4KeyValuePair, new V4KeyValuePair());
  }

  /**
   * Test {@link V4KeyValuePair#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4KeyValuePair#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4KeyValuePair.equals(Object)", "int V4KeyValuePair.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4KeyValuePair(), null);
  }

  /**
   * Test {@link V4KeyValuePair#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4KeyValuePair#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4KeyValuePair.equals(Object)", "int V4KeyValuePair.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4KeyValuePair(), "Different type to V4KeyValuePair");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V4KeyValuePair}
   *   <li>{@link V4KeyValuePair#key(String)}
   *   <li>{@link V4KeyValuePair#setKey(String)}
   *   <li>{@link V4KeyValuePair#setValue(String)}
   *   <li>{@link V4KeyValuePair#value(String)}
   *   <li>{@link V4KeyValuePair#toString()}
   *   <li>{@link V4KeyValuePair#getKey()}
   *   <li>{@link V4KeyValuePair#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V4KeyValuePair.<init>()", "String V4KeyValuePair.getKey()",
      "String V4KeyValuePair.getValue()", "V4KeyValuePair V4KeyValuePair.key(String)",
      "void V4KeyValuePair.setKey(String)", "void V4KeyValuePair.setValue(String)", "String V4KeyValuePair.toString()",
      "V4KeyValuePair V4KeyValuePair.value(String)"})
  void testGettersAndSetters() {
    // Arrange and Act
    V4KeyValuePair actualV4KeyValuePair = new V4KeyValuePair();
    V4KeyValuePair actualKeyResult = actualV4KeyValuePair.key("Key");
    actualV4KeyValuePair.setKey("Key");
    actualV4KeyValuePair.setValue("42");
    V4KeyValuePair actualValueResult = actualV4KeyValuePair.value("42");
    String actualToStringResult = actualV4KeyValuePair.toString();
    String actualKey = actualV4KeyValuePair.getKey();

    // Assert
    assertEquals("42", actualV4KeyValuePair.getValue());
    assertEquals("Key", actualKey);
    assertEquals("class V4KeyValuePair {\n    key: Key\n    value: 42\n}", actualToStringResult);
    assertSame(actualV4KeyValuePair, actualKeyResult);
    assertSame(actualV4KeyValuePair, actualValueResult);
  }
}
