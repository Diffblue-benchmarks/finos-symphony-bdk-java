package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RoomDeactivatedMessageAllOfDiffblueTest {
  /**
   * Test {@link RoomDeactivatedMessageAllOf#equals(Object)}, and {@link
   * RoomDeactivatedMessageAllOf#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RoomDeactivatedMessageAllOf#equals(Object)}
   *   <li>{@link RoomDeactivatedMessageAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomDeactivatedMessageAllOf.equals(Object)",
    "int RoomDeactivatedMessageAllOf.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    RoomDeactivatedMessageAllOf roomDeactivatedMessageAllOf = new RoomDeactivatedMessageAllOf();
    RoomDeactivatedMessageAllOf roomDeactivatedMessageAllOf2 = new RoomDeactivatedMessageAllOf();

    // Act and Assert
    assertEquals(roomDeactivatedMessageAllOf, roomDeactivatedMessageAllOf2);
    assertEquals(roomDeactivatedMessageAllOf.hashCode(), roomDeactivatedMessageAllOf2.hashCode());
  }

  /**
   * Test {@link RoomDeactivatedMessageAllOf#equals(Object)}, and {@link
   * RoomDeactivatedMessageAllOf#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RoomDeactivatedMessageAllOf#equals(Object)}
   *   <li>{@link RoomDeactivatedMessageAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomDeactivatedMessageAllOf.equals(Object)",
    "int RoomDeactivatedMessageAllOf.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    RoomDeactivatedMessageAllOf roomDeactivatedMessageAllOf = new RoomDeactivatedMessageAllOf();

    // Act and Assert
    assertEquals(roomDeactivatedMessageAllOf, roomDeactivatedMessageAllOf);
    int expectedHashCodeResult = roomDeactivatedMessageAllOf.hashCode();
    assertEquals(expectedHashCodeResult, roomDeactivatedMessageAllOf.hashCode());
  }

  /**
   * Test {@link RoomDeactivatedMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomDeactivatedMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomDeactivatedMessageAllOf.equals(Object)",
    "int RoomDeactivatedMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomDeactivatedMessageAllOf(), null);
  }

  /**
   * Test {@link RoomDeactivatedMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomDeactivatedMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomDeactivatedMessageAllOf.equals(Object)",
    "int RoomDeactivatedMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new RoomDeactivatedMessageAllOf(), "Different type to RoomDeactivatedMessageAllOf");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link RoomDeactivatedMessageAllOf}
   *   <li>{@link RoomDeactivatedMessageAllOf#deactivatedByUserId(Long)}
   *   <li>{@link RoomDeactivatedMessageAllOf#setDeactivatedByUserId(Long)}
   *   <li>{@link RoomDeactivatedMessageAllOf#toString()}
   *   <li>{@link RoomDeactivatedMessageAllOf#getDeactivatedByUserId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RoomDeactivatedMessageAllOf.<init>()",
    "RoomDeactivatedMessageAllOf RoomDeactivatedMessageAllOf.deactivatedByUserId(Long)",
    "Long RoomDeactivatedMessageAllOf.getDeactivatedByUserId()",
    "void RoomDeactivatedMessageAllOf.setDeactivatedByUserId(Long)",
    "String RoomDeactivatedMessageAllOf.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    RoomDeactivatedMessageAllOf actualRoomDeactivatedMessageAllOf =
        new RoomDeactivatedMessageAllOf();
    RoomDeactivatedMessageAllOf actualDeactivatedByUserIdResult =
        actualRoomDeactivatedMessageAllOf.deactivatedByUserId(1L);
    actualRoomDeactivatedMessageAllOf.setDeactivatedByUserId(1L);
    String actualToStringResult = actualRoomDeactivatedMessageAllOf.toString();

    // Assert
    assertEquals(
        "class RoomDeactivatedMessageAllOf {\n    deactivatedByUserId: 1\n}", actualToStringResult);
    assertEquals(1L, actualRoomDeactivatedMessageAllOf.getDeactivatedByUserId().longValue());
    assertSame(actualRoomDeactivatedMessageAllOf, actualDeactivatedByUserIdResult);
  }
}
