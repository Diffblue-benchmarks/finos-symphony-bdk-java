package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V5DatafeedDiffblueTest {
  /**
   * Test {@link V5Datafeed#equals(Object)}, and {@link V5Datafeed#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V5Datafeed#equals(Object)}
   *   <li>{@link V5Datafeed#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V5Datafeed.equals(Object)", "int V5Datafeed.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V5Datafeed v5Datafeed = new V5Datafeed();
    V5Datafeed v5Datafeed2 = new V5Datafeed();

    // Act and Assert
    assertEquals(v5Datafeed, v5Datafeed2);
    int expectedHashCodeResult = v5Datafeed.hashCode();
    assertEquals(expectedHashCodeResult, v5Datafeed2.hashCode());
  }

  /**
   * Test {@link V5Datafeed#equals(Object)}, and {@link V5Datafeed#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V5Datafeed#equals(Object)}
   *   <li>{@link V5Datafeed#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V5Datafeed.equals(Object)", "int V5Datafeed.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V5Datafeed v5Datafeed = new V5Datafeed();

    // Act and Assert
    assertEquals(v5Datafeed, v5Datafeed);
    int expectedHashCodeResult = v5Datafeed.hashCode();
    assertEquals(expectedHashCodeResult, v5Datafeed.hashCode());
  }

  /**
   * Test {@link V5Datafeed#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V5Datafeed#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V5Datafeed.equals(Object)", "int V5Datafeed.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V5Datafeed(), 1);
  }

  /**
   * Test {@link V5Datafeed#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V5Datafeed#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V5Datafeed.equals(Object)", "int V5Datafeed.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V5Datafeed v5Datafeed = new V5Datafeed();
    v5Datafeed.id("42");

    // Act and Assert
    assertNotEquals(v5Datafeed, new V5Datafeed());
  }

  /**
   * Test {@link V5Datafeed#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V5Datafeed#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V5Datafeed.equals(Object)", "int V5Datafeed.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V5Datafeed v5Datafeed = new V5Datafeed();
    v5Datafeed.createdAt(1L);

    // Act and Assert
    assertNotEquals(v5Datafeed, new V5Datafeed());
  }

  /**
   * Test {@link V5Datafeed#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V5Datafeed#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V5Datafeed.equals(Object)", "int V5Datafeed.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V5Datafeed v5Datafeed = new V5Datafeed();
    v5Datafeed.type("Type");

    // Act and Assert
    assertNotEquals(v5Datafeed, new V5Datafeed());
  }

  /**
   * Test {@link V5Datafeed#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V5Datafeed#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V5Datafeed.equals(Object)", "int V5Datafeed.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V5Datafeed(), null);
  }

  /**
   * Test {@link V5Datafeed#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V5Datafeed#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V5Datafeed.equals(Object)", "int V5Datafeed.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V5Datafeed(), "Different type to V5Datafeed");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V5Datafeed}
   *   <li>{@link V5Datafeed#createdAt(Long)}
   *   <li>{@link V5Datafeed#id(String)}
   *   <li>{@link V5Datafeed#setCreatedAt(Long)}
   *   <li>{@link V5Datafeed#setId(String)}
   *   <li>{@link V5Datafeed#setType(String)}
   *   <li>{@link V5Datafeed#type(String)}
   *   <li>{@link V5Datafeed#toString()}
   *   <li>{@link V5Datafeed#getCreatedAt()}
   *   <li>{@link V5Datafeed#getId()}
   *   <li>{@link V5Datafeed#getType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V5Datafeed.<init>()",
    "V5Datafeed V5Datafeed.createdAt(Long)",
    "Long V5Datafeed.getCreatedAt()",
    "String V5Datafeed.getId()",
    "String V5Datafeed.getType()",
    "V5Datafeed V5Datafeed.id(String)",
    "void V5Datafeed.setCreatedAt(Long)",
    "void V5Datafeed.setId(String)",
    "void V5Datafeed.setType(String)",
    "String V5Datafeed.toString()",
    "V5Datafeed V5Datafeed.type(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V5Datafeed actualV5Datafeed = new V5Datafeed();
    V5Datafeed actualCreatedAtResult = actualV5Datafeed.createdAt(1L);
    V5Datafeed actualIdResult = actualV5Datafeed.id("42");
    actualV5Datafeed.setCreatedAt(1L);
    actualV5Datafeed.setId("42");
    actualV5Datafeed.setType("Type");
    V5Datafeed actualTypeResult = actualV5Datafeed.type("Type");
    String actualToStringResult = actualV5Datafeed.toString();
    Long actualCreatedAt = actualV5Datafeed.getCreatedAt();
    String actualId = actualV5Datafeed.getId();

    // Assert
    assertEquals("42", actualId);
    assertEquals("Type", actualV5Datafeed.getType());
    assertEquals(
        "class V5Datafeed {\n    id: 42\n    createdAt: 1\n    type: Type\n}",
        actualToStringResult);
    assertEquals(1L, actualCreatedAt.longValue());
    assertSame(actualV5Datafeed, actualCreatedAtResult);
    assertSame(actualV5Datafeed, actualIdResult);
    assertSame(actualV5Datafeed, actualTypeResult);
  }
}
