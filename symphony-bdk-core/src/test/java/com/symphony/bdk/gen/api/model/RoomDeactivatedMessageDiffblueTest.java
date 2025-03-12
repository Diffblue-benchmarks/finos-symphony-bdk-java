package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RoomDeactivatedMessageDiffblueTest {
  /**
   * Test {@link RoomDeactivatedMessage#equals(Object)}, and {@link RoomDeactivatedMessage#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link RoomDeactivatedMessage#equals(Object)}
   *   <li>{@link RoomDeactivatedMessage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomDeactivatedMessage.equals(Object)", "int RoomDeactivatedMessage.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    RoomDeactivatedMessage roomDeactivatedMessage = new RoomDeactivatedMessage();
    RoomDeactivatedMessage roomDeactivatedMessage2 = new RoomDeactivatedMessage();

    // Act and Assert
    assertEquals(roomDeactivatedMessage, roomDeactivatedMessage2);
    int expectedHashCodeResult = roomDeactivatedMessage.hashCode();
    assertEquals(expectedHashCodeResult, roomDeactivatedMessage2.hashCode());
  }

  /**
   * Test {@link RoomDeactivatedMessage#equals(Object)}, and {@link RoomDeactivatedMessage#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link RoomDeactivatedMessage#equals(Object)}
   *   <li>{@link RoomDeactivatedMessage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomDeactivatedMessage.equals(Object)", "int RoomDeactivatedMessage.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    RoomDeactivatedMessage roomDeactivatedMessage = new RoomDeactivatedMessage();

    // Act and Assert
    assertEquals(roomDeactivatedMessage, roomDeactivatedMessage);
    int expectedHashCodeResult = roomDeactivatedMessage.hashCode();
    assertEquals(expectedHashCodeResult, roomDeactivatedMessage.hashCode());
  }

  /**
   * Test {@link RoomDeactivatedMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomDeactivatedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomDeactivatedMessage.equals(Object)", "int RoomDeactivatedMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomDeactivatedMessage(), 1);
  }

  /**
   * Test {@link RoomDeactivatedMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomDeactivatedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomDeactivatedMessage.equals(Object)", "int RoomDeactivatedMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    RoomDeactivatedMessage roomDeactivatedMessage = new RoomDeactivatedMessage();
    roomDeactivatedMessage.deactivatedByUserId(1L);

    // Act and Assert
    assertNotEquals(roomDeactivatedMessage, new RoomDeactivatedMessage());
  }

  /**
   * Test {@link RoomDeactivatedMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomDeactivatedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomDeactivatedMessage.equals(Object)", "int RoomDeactivatedMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    RoomDeactivatedMessage roomDeactivatedMessage = new RoomDeactivatedMessage();
    roomDeactivatedMessage.id("42");

    // Act and Assert
    assertNotEquals(roomDeactivatedMessage, new RoomDeactivatedMessage());
  }

  /**
   * Test {@link RoomDeactivatedMessage#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomDeactivatedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomDeactivatedMessage.equals(Object)", "int RoomDeactivatedMessage.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomDeactivatedMessage(), null);
  }

  /**
   * Test {@link RoomDeactivatedMessage#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomDeactivatedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomDeactivatedMessage.equals(Object)", "int RoomDeactivatedMessage.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomDeactivatedMessage(), "Different type to RoomDeactivatedMessage");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link RoomDeactivatedMessage}
   *   <li>{@link RoomDeactivatedMessage#deactivatedByUserId(Long)}
   *   <li>{@link RoomDeactivatedMessage#setDeactivatedByUserId(Long)}
   *   <li>{@link RoomDeactivatedMessage#toString()}
   *   <li>{@link RoomDeactivatedMessage#getDeactivatedByUserId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void RoomDeactivatedMessage.<init>()",
      "RoomDeactivatedMessage RoomDeactivatedMessage.deactivatedByUserId(Long)",
      "Long RoomDeactivatedMessage.getDeactivatedByUserId()",
      "void RoomDeactivatedMessage.setDeactivatedByUserId(Long)", "String RoomDeactivatedMessage.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    RoomDeactivatedMessage actualRoomDeactivatedMessage = new RoomDeactivatedMessage();
    RoomDeactivatedMessage actualDeactivatedByUserIdResult = actualRoomDeactivatedMessage.deactivatedByUserId(1L);
    actualRoomDeactivatedMessage.setDeactivatedByUserId(1L);
    String actualToStringResult = actualRoomDeactivatedMessage.toString();
    Long actualDeactivatedByUserId = actualRoomDeactivatedMessage.getDeactivatedByUserId();

    // Assert
    assertEquals("class RoomDeactivatedMessage {\n" + "    class V2BaseMessage {\n" + "        id: null\n"
        + "        timestamp: null\n" + "        v2messageType: null\n" + "        streamId: null\n" + "    }\n"
        + "    deactivatedByUserId: 1\n" + "}", actualToStringResult);
    assertNull(actualRoomDeactivatedMessage.getId());
    assertNull(actualRoomDeactivatedMessage.getStreamId());
    assertNull(actualRoomDeactivatedMessage.getTimestamp());
    assertNull(actualRoomDeactivatedMessage.getV2messageType());
    assertEquals(1L, actualDeactivatedByUserId.longValue());
    assertSame(actualRoomDeactivatedMessage, actualDeactivatedByUserIdResult);
  }
}
