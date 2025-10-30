package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RoomReactivatedMessageDiffblueTest {
  /**
   * Test {@link RoomReactivatedMessage#equals(Object)}, and {@link RoomReactivatedMessage#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link RoomReactivatedMessage#equals(Object)}
   *   <li>{@link RoomReactivatedMessage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomReactivatedMessage.equals(Object)", "int RoomReactivatedMessage.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    RoomReactivatedMessage roomReactivatedMessage = new RoomReactivatedMessage();
    RoomReactivatedMessage roomReactivatedMessage2 = new RoomReactivatedMessage();

    // Act and Assert
    assertEquals(roomReactivatedMessage, roomReactivatedMessage2);
    int expectedHashCodeResult = roomReactivatedMessage.hashCode();
    assertEquals(expectedHashCodeResult, roomReactivatedMessage2.hashCode());
  }

  /**
   * Test {@link RoomReactivatedMessage#equals(Object)}, and {@link RoomReactivatedMessage#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link RoomReactivatedMessage#equals(Object)}
   *   <li>{@link RoomReactivatedMessage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomReactivatedMessage.equals(Object)", "int RoomReactivatedMessage.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    RoomReactivatedMessage roomReactivatedMessage = new RoomReactivatedMessage();

    // Act and Assert
    assertEquals(roomReactivatedMessage, roomReactivatedMessage);
    int expectedHashCodeResult = roomReactivatedMessage.hashCode();
    assertEquals(expectedHashCodeResult, roomReactivatedMessage.hashCode());
  }

  /**
   * Test {@link RoomReactivatedMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomReactivatedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomReactivatedMessage.equals(Object)", "int RoomReactivatedMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomReactivatedMessage(), 1);
  }

  /**
   * Test {@link RoomReactivatedMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomReactivatedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomReactivatedMessage.equals(Object)", "int RoomReactivatedMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    RoomReactivatedMessage roomReactivatedMessage = new RoomReactivatedMessage();
    roomReactivatedMessage.reactivatedByUserId(1L);

    // Act and Assert
    assertNotEquals(roomReactivatedMessage, new RoomReactivatedMessage());
  }

  /**
   * Test {@link RoomReactivatedMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomReactivatedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomReactivatedMessage.equals(Object)", "int RoomReactivatedMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    RoomReactivatedMessage roomReactivatedMessage = new RoomReactivatedMessage();
    roomReactivatedMessage.id("42");

    // Act and Assert
    assertNotEquals(roomReactivatedMessage, new RoomReactivatedMessage());
  }

  /**
   * Test {@link RoomReactivatedMessage#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomReactivatedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomReactivatedMessage.equals(Object)", "int RoomReactivatedMessage.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomReactivatedMessage(), null);
  }

  /**
   * Test {@link RoomReactivatedMessage#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomReactivatedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomReactivatedMessage.equals(Object)", "int RoomReactivatedMessage.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomReactivatedMessage(), "Different type to RoomReactivatedMessage");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link RoomReactivatedMessage}
   *   <li>{@link RoomReactivatedMessage#reactivatedByUserId(Long)}
   *   <li>{@link RoomReactivatedMessage#setReactivatedByUserId(Long)}
   *   <li>{@link RoomReactivatedMessage#toString()}
   *   <li>{@link RoomReactivatedMessage#getReactivatedByUserId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void RoomReactivatedMessage.<init>()", "Long RoomReactivatedMessage.getReactivatedByUserId()",
      "RoomReactivatedMessage RoomReactivatedMessage.reactivatedByUserId(Long)",
      "void RoomReactivatedMessage.setReactivatedByUserId(Long)", "String RoomReactivatedMessage.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    RoomReactivatedMessage actualRoomReactivatedMessage = new RoomReactivatedMessage();
    RoomReactivatedMessage actualReactivatedByUserIdResult = actualRoomReactivatedMessage.reactivatedByUserId(1L);
    actualRoomReactivatedMessage.setReactivatedByUserId(1L);
    String actualToStringResult = actualRoomReactivatedMessage.toString();
    Long actualReactivatedByUserId = actualRoomReactivatedMessage.getReactivatedByUserId();

    // Assert
    assertEquals("class RoomReactivatedMessage {\n" + "    class V2BaseMessage {\n" + "        id: null\n"
        + "        timestamp: null\n" + "        v2messageType: null\n" + "        streamId: null\n" + "    }\n"
        + "    reactivatedByUserId: 1\n" + "}", actualToStringResult);
    assertNull(actualRoomReactivatedMessage.getId());
    assertNull(actualRoomReactivatedMessage.getStreamId());
    assertNull(actualRoomReactivatedMessage.getTimestamp());
    assertNull(actualRoomReactivatedMessage.getV2messageType());
    assertEquals(1L, actualReactivatedByUserId.longValue());
    assertSame(actualRoomReactivatedMessage, actualReactivatedByUserIdResult);
  }
}
