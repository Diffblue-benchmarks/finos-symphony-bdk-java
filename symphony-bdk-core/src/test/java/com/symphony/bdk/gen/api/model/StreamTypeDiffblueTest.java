package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.StreamType.TypeEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class StreamTypeDiffblueTest {
  /**
   * Test {@link StreamType#equals(Object)}, and {@link StreamType#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link StreamType#equals(Object)}
   *   <li>{@link StreamType#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StreamType.equals(Object)", "int StreamType.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    StreamType streamType = new StreamType();
    StreamType streamType2 = new StreamType();

    // Act and Assert
    assertEquals(streamType, streamType2);
    int expectedHashCodeResult = streamType.hashCode();
    assertEquals(expectedHashCodeResult, streamType2.hashCode());
  }

  /**
   * Test {@link StreamType#equals(Object)}, and {@link StreamType#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link StreamType#equals(Object)}
   *   <li>{@link StreamType#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StreamType.equals(Object)", "int StreamType.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    StreamType streamType = new StreamType();

    // Act and Assert
    assertEquals(streamType, streamType);
    int expectedHashCodeResult = streamType.hashCode();
    assertEquals(expectedHashCodeResult, streamType.hashCode());
  }

  /**
   * Test {@link StreamType#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StreamType#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StreamType.equals(Object)", "int StreamType.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new StreamType(), null);
  }

  /**
   * Test {@link StreamType#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StreamType#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StreamType.equals(Object)", "int StreamType.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new StreamType(), null);
  }

  /**
   * Test {@link StreamType#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StreamType#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StreamType.equals(Object)", "int StreamType.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new StreamType(), "Different type to StreamType");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link StreamType}
   *   <li>{@link StreamType#setType(TypeEnum)}
   *   <li>{@link StreamType#type(TypeEnum)}
   *   <li>{@link StreamType#toString()}
   *   <li>{@link StreamType#getType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void StreamType.<init>()", "TypeEnum StreamType.getType()", "void StreamType.setType(TypeEnum)",
      "String StreamType.toString()", "StreamType StreamType.type(TypeEnum)"})
  void testGettersAndSetters() {
    // Arrange and Act
    StreamType actualStreamType = new StreamType();
    actualStreamType.setType(TypeEnum.IM);
    StreamType actualTypeResult = actualStreamType.type(TypeEnum.IM);
    String actualToStringResult = actualStreamType.toString();

    // Assert
    assertEquals("class StreamType {\n    type: IM\n}", actualToStringResult);
    assertEquals(TypeEnum.IM, actualStreamType.getType());
    assertSame(actualStreamType, actualTypeResult);
  }

  /**
   * Test TypeEnum {@link TypeEnum#fromValue(String)}.
   * <ul>
   *   <li>When {@code 42}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TypeEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test TypeEnum fromValue(String); when '42'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TypeEnum TypeEnum.fromValue(String)"})
  void testTypeEnumFromValue_when42_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(TypeEnum.fromValue("42"));
  }

  /**
   * Test TypeEnum {@link TypeEnum#fromValue(String)}.
   * <ul>
   *   <li>When {@code IM}.</li>
   *   <li>Then return {@code IM}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TypeEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test TypeEnum fromValue(String); when 'IM'; then return 'IM'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TypeEnum TypeEnum.fromValue(String)"})
  void testTypeEnumFromValue_whenIm_thenReturnIm() {
    // Arrange, Act and Assert
    assertEquals(TypeEnum.IM, TypeEnum.fromValue("IM"));
  }

  /**
   * Test TypeEnum getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link TypeEnum#toString()}
   *   <li>{@link TypeEnum#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test TypeEnum getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String TypeEnum.getValue()", "String TypeEnum.toString()"})
  void testTypeEnumGettersAndSetters() {
    // Arrange
    TypeEnum valueOfResult = TypeEnum.valueOf("IM");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("IM", valueOfResult.getValue());
    assertEquals("IM", actualToStringResult);
  }
}
