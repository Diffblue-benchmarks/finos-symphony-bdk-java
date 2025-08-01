package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RoomMemberDemotedFromOwnerMessageAllOfDiffblueTest {
  /**
   * Test {@link RoomMemberDemotedFromOwnerMessageAllOf#equals(Object)}, and {@link
   * RoomMemberDemotedFromOwnerMessageAllOf#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RoomMemberDemotedFromOwnerMessageAllOf#equals(Object)}
   *   <li>{@link RoomMemberDemotedFromOwnerMessageAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomMemberDemotedFromOwnerMessageAllOf.equals(Object)",
    "int RoomMemberDemotedFromOwnerMessageAllOf.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    RoomMemberDemotedFromOwnerMessageAllOf roomMemberDemotedFromOwnerMessageAllOf =
        new RoomMemberDemotedFromOwnerMessageAllOf();
    RoomMemberDemotedFromOwnerMessageAllOf roomMemberDemotedFromOwnerMessageAllOf2 =
        new RoomMemberDemotedFromOwnerMessageAllOf();

    // Act and Assert
    assertEquals(roomMemberDemotedFromOwnerMessageAllOf, roomMemberDemotedFromOwnerMessageAllOf2);
    int expectedHashCodeResult = roomMemberDemotedFromOwnerMessageAllOf.hashCode();
    assertEquals(expectedHashCodeResult, roomMemberDemotedFromOwnerMessageAllOf2.hashCode());
  }

  /**
   * Test {@link RoomMemberDemotedFromOwnerMessageAllOf#equals(Object)}, and {@link
   * RoomMemberDemotedFromOwnerMessageAllOf#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RoomMemberDemotedFromOwnerMessageAllOf#equals(Object)}
   *   <li>{@link RoomMemberDemotedFromOwnerMessageAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomMemberDemotedFromOwnerMessageAllOf.equals(Object)",
    "int RoomMemberDemotedFromOwnerMessageAllOf.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    RoomMemberDemotedFromOwnerMessageAllOf roomMemberDemotedFromOwnerMessageAllOf =
        new RoomMemberDemotedFromOwnerMessageAllOf();

    // Act and Assert
    assertEquals(roomMemberDemotedFromOwnerMessageAllOf, roomMemberDemotedFromOwnerMessageAllOf);
    int expectedHashCodeResult = roomMemberDemotedFromOwnerMessageAllOf.hashCode();
    assertEquals(expectedHashCodeResult, roomMemberDemotedFromOwnerMessageAllOf.hashCode());
  }

  /**
   * Test {@link RoomMemberDemotedFromOwnerMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomMemberDemotedFromOwnerMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomMemberDemotedFromOwnerMessageAllOf.equals(Object)",
    "int RoomMemberDemotedFromOwnerMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomMemberDemotedFromOwnerMessageAllOf(), 1);
  }

  /**
   * Test {@link RoomMemberDemotedFromOwnerMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomMemberDemotedFromOwnerMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomMemberDemotedFromOwnerMessageAllOf.equals(Object)",
    "int RoomMemberDemotedFromOwnerMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    RoomMemberDemotedFromOwnerMessageAllOf roomMemberDemotedFromOwnerMessageAllOf =
        new RoomMemberDemotedFromOwnerMessageAllOf();
    roomMemberDemotedFromOwnerMessageAllOf.demotedByUserId(1L);

    // Act and Assert
    assertNotEquals(
        roomMemberDemotedFromOwnerMessageAllOf, new RoomMemberDemotedFromOwnerMessageAllOf());
  }

  /**
   * Test {@link RoomMemberDemotedFromOwnerMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomMemberDemotedFromOwnerMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomMemberDemotedFromOwnerMessageAllOf.equals(Object)",
    "int RoomMemberDemotedFromOwnerMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    RoomMemberDemotedFromOwnerMessageAllOf roomMemberDemotedFromOwnerMessageAllOf =
        new RoomMemberDemotedFromOwnerMessageAllOf();
    roomMemberDemotedFromOwnerMessageAllOf.demotedUserId(1L);

    // Act and Assert
    assertNotEquals(
        roomMemberDemotedFromOwnerMessageAllOf, new RoomMemberDemotedFromOwnerMessageAllOf());
  }

  /**
   * Test {@link RoomMemberDemotedFromOwnerMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomMemberDemotedFromOwnerMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomMemberDemotedFromOwnerMessageAllOf.equals(Object)",
    "int RoomMemberDemotedFromOwnerMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomMemberDemotedFromOwnerMessageAllOf(), null);
  }

  /**
   * Test {@link RoomMemberDemotedFromOwnerMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomMemberDemotedFromOwnerMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomMemberDemotedFromOwnerMessageAllOf.equals(Object)",
    "int RoomMemberDemotedFromOwnerMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new RoomMemberDemotedFromOwnerMessageAllOf(),
        "Different type to RoomMemberDemotedFromOwnerMessageAllOf");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link RoomMemberDemotedFromOwnerMessageAllOf}
   *   <li>{@link RoomMemberDemotedFromOwnerMessageAllOf#demotedByUserId(Long)}
   *   <li>{@link RoomMemberDemotedFromOwnerMessageAllOf#demotedUserId(Long)}
   *   <li>{@link RoomMemberDemotedFromOwnerMessageAllOf#setDemotedByUserId(Long)}
   *   <li>{@link RoomMemberDemotedFromOwnerMessageAllOf#setDemotedUserId(Long)}
   *   <li>{@link RoomMemberDemotedFromOwnerMessageAllOf#toString()}
   *   <li>{@link RoomMemberDemotedFromOwnerMessageAllOf#getDemotedByUserId()}
   *   <li>{@link RoomMemberDemotedFromOwnerMessageAllOf#getDemotedUserId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RoomMemberDemotedFromOwnerMessageAllOf.<init>()",
    "RoomMemberDemotedFromOwnerMessageAllOf RoomMemberDemotedFromOwnerMessageAllOf.demotedByUserId(Long)",
    "RoomMemberDemotedFromOwnerMessageAllOf RoomMemberDemotedFromOwnerMessageAllOf.demotedUserId(Long)",
    "Long RoomMemberDemotedFromOwnerMessageAllOf.getDemotedByUserId()",
    "Long RoomMemberDemotedFromOwnerMessageAllOf.getDemotedUserId()",
    "void RoomMemberDemotedFromOwnerMessageAllOf.setDemotedByUserId(Long)",
    "void RoomMemberDemotedFromOwnerMessageAllOf.setDemotedUserId(Long)",
    "String RoomMemberDemotedFromOwnerMessageAllOf.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    RoomMemberDemotedFromOwnerMessageAllOf actualRoomMemberDemotedFromOwnerMessageAllOf =
        new RoomMemberDemotedFromOwnerMessageAllOf();
    RoomMemberDemotedFromOwnerMessageAllOf actualDemotedByUserIdResult =
        actualRoomMemberDemotedFromOwnerMessageAllOf.demotedByUserId(1L);
    RoomMemberDemotedFromOwnerMessageAllOf actualDemotedUserIdResult =
        actualRoomMemberDemotedFromOwnerMessageAllOf.demotedUserId(1L);
    actualRoomMemberDemotedFromOwnerMessageAllOf.setDemotedByUserId(1L);
    actualRoomMemberDemotedFromOwnerMessageAllOf.setDemotedUserId(1L);
    String actualToStringResult = actualRoomMemberDemotedFromOwnerMessageAllOf.toString();
    Long actualDemotedByUserId = actualRoomMemberDemotedFromOwnerMessageAllOf.getDemotedByUserId();
    Long actualDemotedUserId = actualRoomMemberDemotedFromOwnerMessageAllOf.getDemotedUserId();

    // Assert
    assertEquals(
        "class RoomMemberDemotedFromOwnerMessageAllOf {\n    demotedByUserId: 1\n    demotedUserId: 1\n}",
        actualToStringResult);
    assertEquals(1L, actualDemotedByUserId.longValue());
    assertEquals(1L, actualDemotedUserId.longValue());
    assertSame(actualRoomMemberDemotedFromOwnerMessageAllOf, actualDemotedByUserIdResult);
    assertSame(actualRoomMemberDemotedFromOwnerMessageAllOf, actualDemotedUserIdResult);
  }
}
