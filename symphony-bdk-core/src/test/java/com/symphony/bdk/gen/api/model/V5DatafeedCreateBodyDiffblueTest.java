package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V5DatafeedCreateBodyDiffblueTest {
  /**
   * Test {@link V5DatafeedCreateBody#equals(Object)}, and {@link V5DatafeedCreateBody#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V5DatafeedCreateBody#equals(Object)}
   *   <li>{@link V5DatafeedCreateBody#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V5DatafeedCreateBody.equals(Object)",
    "int V5DatafeedCreateBody.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V5DatafeedCreateBody v5DatafeedCreateBody = new V5DatafeedCreateBody();
    V5DatafeedCreateBody v5DatafeedCreateBody2 = new V5DatafeedCreateBody();

    // Act and Assert
    assertEquals(v5DatafeedCreateBody, v5DatafeedCreateBody2);
    assertEquals(v5DatafeedCreateBody.hashCode(), v5DatafeedCreateBody2.hashCode());
  }

  /**
   * Test {@link V5DatafeedCreateBody#equals(Object)}, and {@link V5DatafeedCreateBody#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V5DatafeedCreateBody#equals(Object)}
   *   <li>{@link V5DatafeedCreateBody#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V5DatafeedCreateBody.equals(Object)",
    "int V5DatafeedCreateBody.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V5DatafeedCreateBody v5DatafeedCreateBody = new V5DatafeedCreateBody();

    // Act and Assert
    assertEquals(v5DatafeedCreateBody, v5DatafeedCreateBody);
    int expectedHashCodeResult = v5DatafeedCreateBody.hashCode();
    assertEquals(expectedHashCodeResult, v5DatafeedCreateBody.hashCode());
  }

  /**
   * Test {@link V5DatafeedCreateBody#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V5DatafeedCreateBody#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V5DatafeedCreateBody.equals(Object)",
    "int V5DatafeedCreateBody.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V5DatafeedCreateBody(), null);
  }

  /**
   * Test {@link V5DatafeedCreateBody#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V5DatafeedCreateBody#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V5DatafeedCreateBody.equals(Object)",
    "int V5DatafeedCreateBody.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V5DatafeedCreateBody(), "Different type to V5DatafeedCreateBody");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V5DatafeedCreateBody}
   *   <li>{@link V5DatafeedCreateBody#setTag(String)}
   *   <li>{@link V5DatafeedCreateBody#tag(String)}
   *   <li>{@link V5DatafeedCreateBody#toString()}
   *   <li>{@link V5DatafeedCreateBody#getTag()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V5DatafeedCreateBody.<init>()",
    "String V5DatafeedCreateBody.getTag()",
    "void V5DatafeedCreateBody.setTag(String)",
    "V5DatafeedCreateBody V5DatafeedCreateBody.tag(String)",
    "String V5DatafeedCreateBody.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V5DatafeedCreateBody actualV5DatafeedCreateBody = new V5DatafeedCreateBody();
    actualV5DatafeedCreateBody.setTag("Tag");
    V5DatafeedCreateBody actualTagResult = actualV5DatafeedCreateBody.tag("Tag");
    String actualToStringResult = actualV5DatafeedCreateBody.toString();

    // Assert
    assertEquals("Tag", actualV5DatafeedCreateBody.getTag());
    assertEquals("class V5DatafeedCreateBody {\n    tag: Tag\n}", actualToStringResult);
    assertSame(actualV5DatafeedCreateBody, actualTagResult);
  }
}
