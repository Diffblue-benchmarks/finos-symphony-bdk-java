package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V2PresenceDiffblueTest {
  /**
   * Test {@link V2Presence#equals(Object)}, and {@link V2Presence#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2Presence#equals(Object)}
   *   <li>{@link V2Presence#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2Presence.equals(Object)", "int V2Presence.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2Presence v2Presence = new V2Presence();
    V2Presence v2Presence2 = new V2Presence();

    // Act and Assert
    assertEquals(v2Presence, v2Presence2);
    assertEquals(v2Presence.hashCode(), v2Presence2.hashCode());
  }

  /**
   * Test {@link V2Presence#equals(Object)}, and {@link V2Presence#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2Presence#equals(Object)}
   *   <li>{@link V2Presence#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2Presence.equals(Object)", "int V2Presence.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2Presence v2Presence = new V2Presence();

    // Act and Assert
    assertEquals(v2Presence, v2Presence);
    int expectedHashCodeResult = v2Presence.hashCode();
    assertEquals(expectedHashCodeResult, v2Presence.hashCode());
  }

  /**
   * Test {@link V2Presence#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2Presence#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2Presence.equals(Object)", "int V2Presence.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2Presence(), 1);
  }

  /**
   * Test {@link V2Presence#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2Presence#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2Presence.equals(Object)", "int V2Presence.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V2Presence v2Presence = new V2Presence();
    v2Presence.category("Category");

    // Act and Assert
    assertNotEquals(v2Presence, new V2Presence());
  }

  /**
   * Test {@link V2Presence#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2Presence#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2Presence.equals(Object)", "int V2Presence.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V2Presence v2Presence = new V2Presence();
    v2Presence.userId(1L);

    // Act and Assert
    assertNotEquals(v2Presence, new V2Presence());
  }

  /**
   * Test {@link V2Presence#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2Presence#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2Presence.equals(Object)", "int V2Presence.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V2Presence v2Presence = new V2Presence();
    v2Presence.timestamp(10L);

    // Act and Assert
    assertNotEquals(v2Presence, new V2Presence());
  }

  /**
   * Test {@link V2Presence#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2Presence#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2Presence.equals(Object)", "int V2Presence.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2Presence(), null);
  }

  /**
   * Test {@link V2Presence#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2Presence#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2Presence.equals(Object)", "int V2Presence.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2Presence(), "Different type to V2Presence");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V2Presence}
   *   <li>{@link V2Presence#category(String)}
   *   <li>{@link V2Presence#setCategory(String)}
   *   <li>{@link V2Presence#setTimestamp(Long)}
   *   <li>{@link V2Presence#setUserId(Long)}
   *   <li>{@link V2Presence#timestamp(Long)}
   *   <li>{@link V2Presence#userId(Long)}
   *   <li>{@link V2Presence#toString()}
   *   <li>{@link V2Presence#getCategory()}
   *   <li>{@link V2Presence#getTimestamp()}
   *   <li>{@link V2Presence#getUserId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V2Presence.<init>()",
    "V2Presence V2Presence.category(String)",
    "String V2Presence.getCategory()",
    "Long V2Presence.getTimestamp()",
    "Long V2Presence.getUserId()",
    "void V2Presence.setCategory(String)",
    "void V2Presence.setTimestamp(Long)",
    "void V2Presence.setUserId(Long)",
    "V2Presence V2Presence.timestamp(Long)",
    "String V2Presence.toString()",
    "V2Presence V2Presence.userId(Long)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V2Presence actualV2Presence = new V2Presence();
    V2Presence actualCategoryResult = actualV2Presence.category("Category");
    actualV2Presence.setCategory("Category");
    actualV2Presence.setTimestamp(10L);
    actualV2Presence.setUserId(1L);
    V2Presence actualTimestampResult = actualV2Presence.timestamp(10L);
    V2Presence actualUserIdResult = actualV2Presence.userId(1L);
    String actualToStringResult = actualV2Presence.toString();
    String actualCategory = actualV2Presence.getCategory();
    Long actualTimestamp = actualV2Presence.getTimestamp();
    Long actualUserId = actualV2Presence.getUserId();

    // Assert
    assertEquals("Category", actualCategory);
    assertEquals(
        "class V2Presence {\n    category: Category\n    userId: 1\n    timestamp: 10\n}",
        actualToStringResult);
    assertEquals(10L, actualTimestamp.longValue());
    assertEquals(1L, actualUserId.longValue());
    assertSame(actualV2Presence, actualCategoryResult);
    assertSame(actualV2Presence, actualTimestampResult);
    assertSame(actualV2Presence, actualUserIdResult);
  }
}
