package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RoomMemberPromotedToOwnerMessageDiffblueTest {
  /**
   * Test {@link RoomMemberPromotedToOwnerMessage#equals(Object)}, and {@link
   * RoomMemberPromotedToOwnerMessage#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RoomMemberPromotedToOwnerMessage#equals(Object)}
   *   <li>{@link RoomMemberPromotedToOwnerMessage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomMemberPromotedToOwnerMessage.equals(Object)",
    "int RoomMemberPromotedToOwnerMessage.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    RoomMemberPromotedToOwnerMessage roomMemberPromotedToOwnerMessage =
        new RoomMemberPromotedToOwnerMessage();
    RoomMemberPromotedToOwnerMessage roomMemberPromotedToOwnerMessage2 =
        new RoomMemberPromotedToOwnerMessage();

    // Act and Assert
    assertEquals(roomMemberPromotedToOwnerMessage, roomMemberPromotedToOwnerMessage2);
    int expectedHashCodeResult = roomMemberPromotedToOwnerMessage.hashCode();
    assertEquals(expectedHashCodeResult, roomMemberPromotedToOwnerMessage2.hashCode());
  }

  /**
   * Test {@link RoomMemberPromotedToOwnerMessage#equals(Object)}, and {@link
   * RoomMemberPromotedToOwnerMessage#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RoomMemberPromotedToOwnerMessage#equals(Object)}
   *   <li>{@link RoomMemberPromotedToOwnerMessage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomMemberPromotedToOwnerMessage.equals(Object)",
    "int RoomMemberPromotedToOwnerMessage.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    RoomMemberPromotedToOwnerMessage roomMemberPromotedToOwnerMessage =
        new RoomMemberPromotedToOwnerMessage();

    // Act and Assert
    assertEquals(roomMemberPromotedToOwnerMessage, roomMemberPromotedToOwnerMessage);
    int expectedHashCodeResult = roomMemberPromotedToOwnerMessage.hashCode();
    assertEquals(expectedHashCodeResult, roomMemberPromotedToOwnerMessage.hashCode());
  }

  /**
   * Test {@link RoomMemberPromotedToOwnerMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomMemberPromotedToOwnerMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomMemberPromotedToOwnerMessage.equals(Object)",
    "int RoomMemberPromotedToOwnerMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomMemberPromotedToOwnerMessage(), 1);
  }

  /**
   * Test {@link RoomMemberPromotedToOwnerMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomMemberPromotedToOwnerMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomMemberPromotedToOwnerMessage.equals(Object)",
    "int RoomMemberPromotedToOwnerMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    RoomMemberPromotedToOwnerMessage roomMemberPromotedToOwnerMessage =
        new RoomMemberPromotedToOwnerMessage();
    roomMemberPromotedToOwnerMessage.promotedByUserId(1L);

    // Act and Assert
    assertNotEquals(roomMemberPromotedToOwnerMessage, new RoomMemberPromotedToOwnerMessage());
  }

  /**
   * Test {@link RoomMemberPromotedToOwnerMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomMemberPromotedToOwnerMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomMemberPromotedToOwnerMessage.equals(Object)",
    "int RoomMemberPromotedToOwnerMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    RoomMemberPromotedToOwnerMessage roomMemberPromotedToOwnerMessage =
        new RoomMemberPromotedToOwnerMessage();
    roomMemberPromotedToOwnerMessage.promotedUserId(1L);

    // Act and Assert
    assertNotEquals(roomMemberPromotedToOwnerMessage, new RoomMemberPromotedToOwnerMessage());
  }

  /**
   * Test {@link RoomMemberPromotedToOwnerMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomMemberPromotedToOwnerMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomMemberPromotedToOwnerMessage.equals(Object)",
    "int RoomMemberPromotedToOwnerMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    RoomMemberPromotedToOwnerMessage roomMemberPromotedToOwnerMessage =
        new RoomMemberPromotedToOwnerMessage();
    roomMemberPromotedToOwnerMessage.id("42");

    // Act and Assert
    assertNotEquals(roomMemberPromotedToOwnerMessage, new RoomMemberPromotedToOwnerMessage());
  }

  /**
   * Test {@link RoomMemberPromotedToOwnerMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomMemberPromotedToOwnerMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomMemberPromotedToOwnerMessage.equals(Object)",
    "int RoomMemberPromotedToOwnerMessage.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomMemberPromotedToOwnerMessage(), null);
  }

  /**
   * Test {@link RoomMemberPromotedToOwnerMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomMemberPromotedToOwnerMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomMemberPromotedToOwnerMessage.equals(Object)",
    "int RoomMemberPromotedToOwnerMessage.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new RoomMemberPromotedToOwnerMessage(),
        "Different type to RoomMemberPromotedToOwnerMessage");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link RoomMemberPromotedToOwnerMessage}
   *   <li>{@link RoomMemberPromotedToOwnerMessage#promotedByUserId(Long)}
   *   <li>{@link RoomMemberPromotedToOwnerMessage#promotedUserId(Long)}
   *   <li>{@link RoomMemberPromotedToOwnerMessage#setPromotedByUserId(Long)}
   *   <li>{@link RoomMemberPromotedToOwnerMessage#setPromotedUserId(Long)}
   *   <li>{@link RoomMemberPromotedToOwnerMessage#toString()}
   *   <li>{@link RoomMemberPromotedToOwnerMessage#getPromotedByUserId()}
   *   <li>{@link RoomMemberPromotedToOwnerMessage#getPromotedUserId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RoomMemberPromotedToOwnerMessage.<init>()",
    "Long RoomMemberPromotedToOwnerMessage.getPromotedByUserId()",
    "Long RoomMemberPromotedToOwnerMessage.getPromotedUserId()",
    "RoomMemberPromotedToOwnerMessage RoomMemberPromotedToOwnerMessage.promotedByUserId(Long)",
    "RoomMemberPromotedToOwnerMessage RoomMemberPromotedToOwnerMessage.promotedUserId(Long)",
    "void RoomMemberPromotedToOwnerMessage.setPromotedByUserId(Long)",
    "void RoomMemberPromotedToOwnerMessage.setPromotedUserId(Long)",
    "String RoomMemberPromotedToOwnerMessage.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    RoomMemberPromotedToOwnerMessage actualRoomMemberPromotedToOwnerMessage =
        new RoomMemberPromotedToOwnerMessage();
    RoomMemberPromotedToOwnerMessage actualPromotedByUserIdResult =
        actualRoomMemberPromotedToOwnerMessage.promotedByUserId(1L);
    RoomMemberPromotedToOwnerMessage actualPromotedUserIdResult =
        actualRoomMemberPromotedToOwnerMessage.promotedUserId(1L);
    actualRoomMemberPromotedToOwnerMessage.setPromotedByUserId(1L);
    actualRoomMemberPromotedToOwnerMessage.setPromotedUserId(1L);
    String actualToStringResult = actualRoomMemberPromotedToOwnerMessage.toString();
    Long actualPromotedByUserId = actualRoomMemberPromotedToOwnerMessage.getPromotedByUserId();
    Long actualPromotedUserId = actualRoomMemberPromotedToOwnerMessage.getPromotedUserId();

    // Assert
    assertEquals(
        "class RoomMemberPromotedToOwnerMessage {\n"
            + "    class V2BaseMessage {\n"
            + "        id: null\n"
            + "        timestamp: null\n"
            + "        v2messageType: null\n"
            + "        streamId: null\n"
            + "    }\n"
            + "    promotedByUserId: 1\n"
            + "    promotedUserId: 1\n"
            + "}",
        actualToStringResult);
    assertNull(actualRoomMemberPromotedToOwnerMessage.getId());
    assertNull(actualRoomMemberPromotedToOwnerMessage.getStreamId());
    assertNull(actualRoomMemberPromotedToOwnerMessage.getTimestamp());
    assertNull(actualRoomMemberPromotedToOwnerMessage.getV2messageType());
    assertEquals(1L, actualPromotedByUserId.longValue());
    assertEquals(1L, actualPromotedUserId.longValue());
    assertSame(actualRoomMemberPromotedToOwnerMessage, actualPromotedByUserIdResult);
    assertSame(actualRoomMemberPromotedToOwnerMessage, actualPromotedUserIdResult);
  }
}
