package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RoomReactivatedMessageAllOfDiffblueTest {
  /**
   * Test {@link RoomReactivatedMessageAllOf#equals(Object)}, and {@link
   * RoomReactivatedMessageAllOf#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RoomReactivatedMessageAllOf#equals(Object)}
   *   <li>{@link RoomReactivatedMessageAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomReactivatedMessageAllOf.equals(Object)",
    "int RoomReactivatedMessageAllOf.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    RoomReactivatedMessageAllOf roomReactivatedMessageAllOf = new RoomReactivatedMessageAllOf();
    RoomReactivatedMessageAllOf roomReactivatedMessageAllOf2 = new RoomReactivatedMessageAllOf();

    // Act and Assert
    assertEquals(roomReactivatedMessageAllOf, roomReactivatedMessageAllOf2);
    int expectedHashCodeResult = roomReactivatedMessageAllOf.hashCode();
    assertEquals(expectedHashCodeResult, roomReactivatedMessageAllOf2.hashCode());
  }

  /**
   * Test {@link RoomReactivatedMessageAllOf#equals(Object)}, and {@link
   * RoomReactivatedMessageAllOf#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RoomReactivatedMessageAllOf#equals(Object)}
   *   <li>{@link RoomReactivatedMessageAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomReactivatedMessageAllOf.equals(Object)",
    "int RoomReactivatedMessageAllOf.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    RoomReactivatedMessageAllOf roomReactivatedMessageAllOf = new RoomReactivatedMessageAllOf();

    // Act and Assert
    assertEquals(roomReactivatedMessageAllOf, roomReactivatedMessageAllOf);
    int expectedHashCodeResult = roomReactivatedMessageAllOf.hashCode();
    assertEquals(expectedHashCodeResult, roomReactivatedMessageAllOf.hashCode());
  }

  /**
   * Test {@link RoomReactivatedMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomReactivatedMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomReactivatedMessageAllOf.equals(Object)",
    "int RoomReactivatedMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomReactivatedMessageAllOf(), null);
  }

  /**
   * Test {@link RoomReactivatedMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomReactivatedMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomReactivatedMessageAllOf.equals(Object)",
    "int RoomReactivatedMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new RoomReactivatedMessageAllOf(), "Different type to RoomReactivatedMessageAllOf");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link RoomReactivatedMessageAllOf}
   *   <li>{@link RoomReactivatedMessageAllOf#reactivatedByUserId(Long)}
   *   <li>{@link RoomReactivatedMessageAllOf#setReactivatedByUserId(Long)}
   *   <li>{@link RoomReactivatedMessageAllOf#toString()}
   *   <li>{@link RoomReactivatedMessageAllOf#getReactivatedByUserId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RoomReactivatedMessageAllOf.<init>()",
    "Long RoomReactivatedMessageAllOf.getReactivatedByUserId()",
    "RoomReactivatedMessageAllOf RoomReactivatedMessageAllOf.reactivatedByUserId(Long)",
    "void RoomReactivatedMessageAllOf.setReactivatedByUserId(Long)",
    "String RoomReactivatedMessageAllOf.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    RoomReactivatedMessageAllOf actualRoomReactivatedMessageAllOf =
        new RoomReactivatedMessageAllOf();
    RoomReactivatedMessageAllOf actualReactivatedByUserIdResult =
        actualRoomReactivatedMessageAllOf.reactivatedByUserId(1L);
    actualRoomReactivatedMessageAllOf.setReactivatedByUserId(1L);
    String actualToStringResult = actualRoomReactivatedMessageAllOf.toString();

    // Assert
    assertEquals(
        "class RoomReactivatedMessageAllOf {\n    reactivatedByUserId: 1\n}", actualToStringResult);
    assertEquals(1L, actualRoomReactivatedMessageAllOf.getReactivatedByUserId().longValue());
    assertSame(actualRoomReactivatedMessageAllOf, actualReactivatedByUserIdResult);
  }
}
