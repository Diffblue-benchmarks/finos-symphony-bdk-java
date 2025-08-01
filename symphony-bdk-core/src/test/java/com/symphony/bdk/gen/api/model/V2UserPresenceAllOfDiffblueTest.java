package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V2UserPresenceAllOfDiffblueTest {
  /**
   * Test {@link V2UserPresenceAllOf#equals(Object)}, and {@link V2UserPresenceAllOf#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2UserPresenceAllOf#equals(Object)}
   *   <li>{@link V2UserPresenceAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2UserPresenceAllOf.equals(Object)",
    "int V2UserPresenceAllOf.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2UserPresenceAllOf v2UserPresenceAllOf = new V2UserPresenceAllOf();
    V2UserPresenceAllOf v2UserPresenceAllOf2 = new V2UserPresenceAllOf();

    // Act and Assert
    assertEquals(v2UserPresenceAllOf, v2UserPresenceAllOf2);
    int expectedHashCodeResult = v2UserPresenceAllOf.hashCode();
    assertEquals(expectedHashCodeResult, v2UserPresenceAllOf2.hashCode());
  }

  /**
   * Test {@link V2UserPresenceAllOf#equals(Object)}, and {@link V2UserPresenceAllOf#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2UserPresenceAllOf#equals(Object)}
   *   <li>{@link V2UserPresenceAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2UserPresenceAllOf.equals(Object)",
    "int V2UserPresenceAllOf.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2UserPresenceAllOf v2UserPresenceAllOf = new V2UserPresenceAllOf();

    // Act and Assert
    assertEquals(v2UserPresenceAllOf, v2UserPresenceAllOf);
    int expectedHashCodeResult = v2UserPresenceAllOf.hashCode();
    assertEquals(expectedHashCodeResult, v2UserPresenceAllOf.hashCode());
  }

  /**
   * Test {@link V2UserPresenceAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserPresenceAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2UserPresenceAllOf.equals(Object)",
    "int V2UserPresenceAllOf.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2UserPresenceAllOf(), null);
  }

  /**
   * Test {@link V2UserPresenceAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserPresenceAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2UserPresenceAllOf.equals(Object)",
    "int V2UserPresenceAllOf.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2UserPresenceAllOf(), "Different type to V2UserPresenceAllOf");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V2UserPresenceAllOf}
   *   <li>{@link V2UserPresenceAllOf#setUserId(Long)}
   *   <li>{@link V2UserPresenceAllOf#userId(Long)}
   *   <li>{@link V2UserPresenceAllOf#toString()}
   *   <li>{@link V2UserPresenceAllOf#getUserId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V2UserPresenceAllOf.<init>()",
    "Long V2UserPresenceAllOf.getUserId()",
    "void V2UserPresenceAllOf.setUserId(Long)",
    "String V2UserPresenceAllOf.toString()",
    "V2UserPresenceAllOf V2UserPresenceAllOf.userId(Long)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V2UserPresenceAllOf actualV2UserPresenceAllOf = new V2UserPresenceAllOf();
    actualV2UserPresenceAllOf.setUserId(1L);
    V2UserPresenceAllOf actualUserIdResult = actualV2UserPresenceAllOf.userId(1L);
    String actualToStringResult = actualV2UserPresenceAllOf.toString();

    // Assert
    assertEquals("class V2UserPresenceAllOf {\n    userId: 1\n}", actualToStringResult);
    assertEquals(1L, actualV2UserPresenceAllOf.getUserId().longValue());
    assertSame(actualV2UserPresenceAllOf, actualUserIdResult);
  }
}
