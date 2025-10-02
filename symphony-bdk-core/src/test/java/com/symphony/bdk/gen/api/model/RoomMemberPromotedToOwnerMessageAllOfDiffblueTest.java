package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RoomMemberPromotedToOwnerMessageAllOfDiffblueTest {
  /**
   * Test {@link RoomMemberPromotedToOwnerMessageAllOf#equals(Object)}, and {@link
   * RoomMemberPromotedToOwnerMessageAllOf#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RoomMemberPromotedToOwnerMessageAllOf#equals(Object)}
   *   <li>{@link RoomMemberPromotedToOwnerMessageAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomMemberPromotedToOwnerMessageAllOf.equals(Object)",
    "int RoomMemberPromotedToOwnerMessageAllOf.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    RoomMemberPromotedToOwnerMessageAllOf roomMemberPromotedToOwnerMessageAllOf =
        new RoomMemberPromotedToOwnerMessageAllOf();
    RoomMemberPromotedToOwnerMessageAllOf roomMemberPromotedToOwnerMessageAllOf2 =
        new RoomMemberPromotedToOwnerMessageAllOf();

    // Act and Assert
    assertEquals(roomMemberPromotedToOwnerMessageAllOf, roomMemberPromotedToOwnerMessageAllOf2);
    assertEquals(
        roomMemberPromotedToOwnerMessageAllOf.hashCode(),
        roomMemberPromotedToOwnerMessageAllOf2.hashCode());
  }

  /**
   * Test {@link RoomMemberPromotedToOwnerMessageAllOf#equals(Object)}, and {@link
   * RoomMemberPromotedToOwnerMessageAllOf#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RoomMemberPromotedToOwnerMessageAllOf#equals(Object)}
   *   <li>{@link RoomMemberPromotedToOwnerMessageAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomMemberPromotedToOwnerMessageAllOf.equals(Object)",
    "int RoomMemberPromotedToOwnerMessageAllOf.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    RoomMemberPromotedToOwnerMessageAllOf roomMemberPromotedToOwnerMessageAllOf =
        new RoomMemberPromotedToOwnerMessageAllOf();

    // Act and Assert
    assertEquals(roomMemberPromotedToOwnerMessageAllOf, roomMemberPromotedToOwnerMessageAllOf);
    int expectedHashCodeResult = roomMemberPromotedToOwnerMessageAllOf.hashCode();
    assertEquals(expectedHashCodeResult, roomMemberPromotedToOwnerMessageAllOf.hashCode());
  }

  /**
   * Test {@link RoomMemberPromotedToOwnerMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomMemberPromotedToOwnerMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomMemberPromotedToOwnerMessageAllOf.equals(Object)",
    "int RoomMemberPromotedToOwnerMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomMemberPromotedToOwnerMessageAllOf(), 1);
  }

  /**
   * Test {@link RoomMemberPromotedToOwnerMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomMemberPromotedToOwnerMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomMemberPromotedToOwnerMessageAllOf.equals(Object)",
    "int RoomMemberPromotedToOwnerMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    RoomMemberPromotedToOwnerMessageAllOf roomMemberPromotedToOwnerMessageAllOf =
        new RoomMemberPromotedToOwnerMessageAllOf();
    roomMemberPromotedToOwnerMessageAllOf.promotedByUserId(1L);

    // Act and Assert
    assertNotEquals(
        roomMemberPromotedToOwnerMessageAllOf, new RoomMemberPromotedToOwnerMessageAllOf());
  }

  /**
   * Test {@link RoomMemberPromotedToOwnerMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomMemberPromotedToOwnerMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomMemberPromotedToOwnerMessageAllOf.equals(Object)",
    "int RoomMemberPromotedToOwnerMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    RoomMemberPromotedToOwnerMessageAllOf roomMemberPromotedToOwnerMessageAllOf =
        new RoomMemberPromotedToOwnerMessageAllOf();
    roomMemberPromotedToOwnerMessageAllOf.promotedUserId(1L);

    // Act and Assert
    assertNotEquals(
        roomMemberPromotedToOwnerMessageAllOf, new RoomMemberPromotedToOwnerMessageAllOf());
  }

  /**
   * Test {@link RoomMemberPromotedToOwnerMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomMemberPromotedToOwnerMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomMemberPromotedToOwnerMessageAllOf.equals(Object)",
    "int RoomMemberPromotedToOwnerMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomMemberPromotedToOwnerMessageAllOf(), null);
  }

  /**
   * Test {@link RoomMemberPromotedToOwnerMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomMemberPromotedToOwnerMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomMemberPromotedToOwnerMessageAllOf.equals(Object)",
    "int RoomMemberPromotedToOwnerMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new RoomMemberPromotedToOwnerMessageAllOf(),
        "Different type to RoomMemberPromotedToOwnerMessageAllOf");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link RoomMemberPromotedToOwnerMessageAllOf}
   *   <li>{@link RoomMemberPromotedToOwnerMessageAllOf#promotedByUserId(Long)}
   *   <li>{@link RoomMemberPromotedToOwnerMessageAllOf#promotedUserId(Long)}
   *   <li>{@link RoomMemberPromotedToOwnerMessageAllOf#setPromotedByUserId(Long)}
   *   <li>{@link RoomMemberPromotedToOwnerMessageAllOf#setPromotedUserId(Long)}
   *   <li>{@link RoomMemberPromotedToOwnerMessageAllOf#toString()}
   *   <li>{@link RoomMemberPromotedToOwnerMessageAllOf#getPromotedByUserId()}
   *   <li>{@link RoomMemberPromotedToOwnerMessageAllOf#getPromotedUserId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RoomMemberPromotedToOwnerMessageAllOf.<init>()",
    "Long RoomMemberPromotedToOwnerMessageAllOf.getPromotedByUserId()",
    "Long RoomMemberPromotedToOwnerMessageAllOf.getPromotedUserId()",
    "RoomMemberPromotedToOwnerMessageAllOf RoomMemberPromotedToOwnerMessageAllOf.promotedByUserId(Long)",
    "RoomMemberPromotedToOwnerMessageAllOf RoomMemberPromotedToOwnerMessageAllOf.promotedUserId(Long)",
    "void RoomMemberPromotedToOwnerMessageAllOf.setPromotedByUserId(Long)",
    "void RoomMemberPromotedToOwnerMessageAllOf.setPromotedUserId(Long)",
    "String RoomMemberPromotedToOwnerMessageAllOf.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    RoomMemberPromotedToOwnerMessageAllOf actualRoomMemberPromotedToOwnerMessageAllOf =
        new RoomMemberPromotedToOwnerMessageAllOf();
    RoomMemberPromotedToOwnerMessageAllOf actualPromotedByUserIdResult =
        actualRoomMemberPromotedToOwnerMessageAllOf.promotedByUserId(1L);
    RoomMemberPromotedToOwnerMessageAllOf actualPromotedUserIdResult =
        actualRoomMemberPromotedToOwnerMessageAllOf.promotedUserId(1L);
    actualRoomMemberPromotedToOwnerMessageAllOf.setPromotedByUserId(1L);
    actualRoomMemberPromotedToOwnerMessageAllOf.setPromotedUserId(1L);
    String actualToStringResult = actualRoomMemberPromotedToOwnerMessageAllOf.toString();
    Long actualPromotedByUserId = actualRoomMemberPromotedToOwnerMessageAllOf.getPromotedByUserId();
    Long actualPromotedUserId = actualRoomMemberPromotedToOwnerMessageAllOf.getPromotedUserId();

    // Assert
    assertEquals(
        "class RoomMemberPromotedToOwnerMessageAllOf {\n    promotedByUserId: 1\n    promotedUserId: 1\n}",
        actualToStringResult);
    assertEquals(1L, actualPromotedByUserId.longValue());
    assertEquals(1L, actualPromotedUserId.longValue());
    assertSame(actualRoomMemberPromotedToOwnerMessageAllOf, actualPromotedByUserIdResult);
    assertSame(actualRoomMemberPromotedToOwnerMessageAllOf, actualPromotedUserIdResult);
  }
}
