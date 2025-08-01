package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V2PresenceAllOfDiffblueTest {
  /**
   * Test {@link V2PresenceAllOf#equals(Object)}, and {@link V2PresenceAllOf#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2PresenceAllOf#equals(Object)}
   *   <li>{@link V2PresenceAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2PresenceAllOf.equals(Object)", "int V2PresenceAllOf.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2PresenceAllOf v2PresenceAllOf = new V2PresenceAllOf();
    V2PresenceAllOf v2PresenceAllOf2 = new V2PresenceAllOf();

    // Act and Assert
    assertEquals(v2PresenceAllOf, v2PresenceAllOf2);
    int expectedHashCodeResult = v2PresenceAllOf.hashCode();
    assertEquals(expectedHashCodeResult, v2PresenceAllOf2.hashCode());
  }

  /**
   * Test {@link V2PresenceAllOf#equals(Object)}, and {@link V2PresenceAllOf#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2PresenceAllOf#equals(Object)}
   *   <li>{@link V2PresenceAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2PresenceAllOf.equals(Object)", "int V2PresenceAllOf.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2PresenceAllOf v2PresenceAllOf = new V2PresenceAllOf();

    // Act and Assert
    assertEquals(v2PresenceAllOf, v2PresenceAllOf);
    int expectedHashCodeResult = v2PresenceAllOf.hashCode();
    assertEquals(expectedHashCodeResult, v2PresenceAllOf.hashCode());
  }

  /**
   * Test {@link V2PresenceAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2PresenceAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2PresenceAllOf.equals(Object)", "int V2PresenceAllOf.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2PresenceAllOf(), null);
  }

  /**
   * Test {@link V2PresenceAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2PresenceAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2PresenceAllOf.equals(Object)", "int V2PresenceAllOf.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2PresenceAllOf(), "Different type to V2PresenceAllOf");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V2PresenceAllOf}
   *   <li>{@link V2PresenceAllOf#setTimestamp(Long)}
   *   <li>{@link V2PresenceAllOf#timestamp(Long)}
   *   <li>{@link V2PresenceAllOf#toString()}
   *   <li>{@link V2PresenceAllOf#getTimestamp()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V2PresenceAllOf.<init>()",
    "Long V2PresenceAllOf.getTimestamp()",
    "void V2PresenceAllOf.setTimestamp(Long)",
    "V2PresenceAllOf V2PresenceAllOf.timestamp(Long)",
    "String V2PresenceAllOf.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V2PresenceAllOf actualV2PresenceAllOf = new V2PresenceAllOf();
    actualV2PresenceAllOf.setTimestamp(10L);
    V2PresenceAllOf actualTimestampResult = actualV2PresenceAllOf.timestamp(10L);
    String actualToStringResult = actualV2PresenceAllOf.toString();

    // Assert
    assertEquals("class V2PresenceAllOf {\n    timestamp: 10\n}", actualToStringResult);
    assertEquals(10L, actualV2PresenceAllOf.getTimestamp().longValue());
    assertSame(actualV2PresenceAllOf, actualTimestampResult);
  }
}
