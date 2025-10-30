package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V1IMAttributesDiffblueTest {
  /**
   * Test {@link V1IMAttributes#equals(Object)}, and {@link V1IMAttributes#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V1IMAttributes#equals(Object)}
   *   <li>{@link V1IMAttributes#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1IMAttributes.equals(Object)", "int V1IMAttributes.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V1IMAttributes v1imAttributes = new V1IMAttributes();
    V1IMAttributes v1imAttributes2 = new V1IMAttributes();

    // Act and Assert
    assertEquals(v1imAttributes, v1imAttributes2);
    int expectedHashCodeResult = v1imAttributes.hashCode();
    assertEquals(expectedHashCodeResult, v1imAttributes2.hashCode());
  }

  /**
   * Test {@link V1IMAttributes#equals(Object)}, and {@link V1IMAttributes#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V1IMAttributes#equals(Object)}
   *   <li>{@link V1IMAttributes#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1IMAttributes.equals(Object)", "int V1IMAttributes.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V1IMAttributes v1imAttributes = new V1IMAttributes();

    // Act and Assert
    assertEquals(v1imAttributes, v1imAttributes);
    int expectedHashCodeResult = v1imAttributes.hashCode();
    assertEquals(expectedHashCodeResult, v1imAttributes.hashCode());
  }

  /**
   * Test {@link V1IMAttributes#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1IMAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1IMAttributes.equals(Object)", "int V1IMAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1IMAttributes(), null);
  }

  /**
   * Test {@link V1IMAttributes#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1IMAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1IMAttributes.equals(Object)", "int V1IMAttributes.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1IMAttributes(), null);
  }

  /**
   * Test {@link V1IMAttributes#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1IMAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1IMAttributes.equals(Object)", "int V1IMAttributes.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1IMAttributes(), "Different type to V1IMAttributes");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V1IMAttributes}
   *   <li>{@link V1IMAttributes#pinnedMessageId(String)}
   *   <li>{@link V1IMAttributes#setPinnedMessageId(String)}
   *   <li>{@link V1IMAttributes#toString()}
   *   <li>{@link V1IMAttributes#getPinnedMessageId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V1IMAttributes.<init>()", "String V1IMAttributes.getPinnedMessageId()",
      "V1IMAttributes V1IMAttributes.pinnedMessageId(String)", "void V1IMAttributes.setPinnedMessageId(String)",
      "String V1IMAttributes.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    V1IMAttributes actualV1imAttributes = new V1IMAttributes();
    V1IMAttributes actualPinnedMessageIdResult = actualV1imAttributes.pinnedMessageId("42");
    actualV1imAttributes.setPinnedMessageId("42");
    String actualToStringResult = actualV1imAttributes.toString();

    // Assert
    assertEquals("42", actualV1imAttributes.getPinnedMessageId());
    assertEquals("class V1IMAttributes {\n    pinnedMessageId: 42\n}", actualToStringResult);
    assertSame(actualV1imAttributes, actualPinnedMessageIdResult);
  }
}
