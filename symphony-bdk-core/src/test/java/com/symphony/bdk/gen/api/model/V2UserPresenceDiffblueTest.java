package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V2UserPresenceDiffblueTest {
  /**
   * Test {@link V2UserPresence#equals(Object)}, and {@link V2UserPresence#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2UserPresence#equals(Object)}
   *   <li>{@link V2UserPresence#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserPresence.equals(Object)", "int V2UserPresence.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2UserPresence v2UserPresence = new V2UserPresence();
    V2UserPresence v2UserPresence2 = new V2UserPresence();

    // Act and Assert
    assertEquals(v2UserPresence, v2UserPresence2);
    int expectedHashCodeResult = v2UserPresence.hashCode();
    assertEquals(expectedHashCodeResult, v2UserPresence2.hashCode());
  }

  /**
   * Test {@link V2UserPresence#equals(Object)}, and {@link V2UserPresence#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2UserPresence#equals(Object)}
   *   <li>{@link V2UserPresence#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserPresence.equals(Object)", "int V2UserPresence.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2UserPresence v2UserPresence = new V2UserPresence();

    // Act and Assert
    assertEquals(v2UserPresence, v2UserPresence);
    int expectedHashCodeResult = v2UserPresence.hashCode();
    assertEquals(expectedHashCodeResult, v2UserPresence.hashCode());
  }

  /**
   * Test {@link V2UserPresence#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserPresence#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserPresence.equals(Object)", "int V2UserPresence.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2UserPresence(), 1);
  }

  /**
   * Test {@link V2UserPresence#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserPresence#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserPresence.equals(Object)", "int V2UserPresence.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V2UserPresence v2UserPresence = new V2UserPresence();
    v2UserPresence.category("Category");

    // Act and Assert
    assertNotEquals(v2UserPresence, new V2UserPresence());
  }

  /**
   * Test {@link V2UserPresence#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserPresence#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserPresence.equals(Object)", "int V2UserPresence.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V2UserPresence v2UserPresence = new V2UserPresence();
    v2UserPresence.userId(1L);

    // Act and Assert
    assertNotEquals(v2UserPresence, new V2UserPresence());
  }

  /**
   * Test {@link V2UserPresence#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserPresence#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserPresence.equals(Object)", "int V2UserPresence.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2UserPresence(), null);
  }

  /**
   * Test {@link V2UserPresence#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserPresence#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserPresence.equals(Object)", "int V2UserPresence.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2UserPresence(), "Different type to V2UserPresence");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V2UserPresence}
   *   <li>{@link V2UserPresence#category(String)}
   *   <li>{@link V2UserPresence#setCategory(String)}
   *   <li>{@link V2UserPresence#setUserId(Long)}
   *   <li>{@link V2UserPresence#userId(Long)}
   *   <li>{@link V2UserPresence#toString()}
   *   <li>{@link V2UserPresence#getCategory()}
   *   <li>{@link V2UserPresence#getUserId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V2UserPresence.<init>()",
    "V2UserPresence V2UserPresence.category(String)",
    "String V2UserPresence.getCategory()",
    "Long V2UserPresence.getUserId()",
    "void V2UserPresence.setCategory(String)",
    "void V2UserPresence.setUserId(Long)",
    "String V2UserPresence.toString()",
    "V2UserPresence V2UserPresence.userId(Long)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V2UserPresence actualV2UserPresence = new V2UserPresence();
    V2UserPresence actualCategoryResult = actualV2UserPresence.category("Category");
    actualV2UserPresence.setCategory("Category");
    actualV2UserPresence.setUserId(1L);
    V2UserPresence actualUserIdResult = actualV2UserPresence.userId(1L);
    String actualToStringResult = actualV2UserPresence.toString();
    String actualCategory = actualV2UserPresence.getCategory();

    // Assert
    assertEquals("Category", actualCategory);
    assertEquals(
        "class V2UserPresence {\n    category: Category\n    userId: 1\n}", actualToStringResult);
    assertEquals(1L, actualV2UserPresence.getUserId().longValue());
    assertSame(actualV2UserPresence, actualCategoryResult);
    assertSame(actualV2UserPresence, actualUserIdResult);
  }
}
