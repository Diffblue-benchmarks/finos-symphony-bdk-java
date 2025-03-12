package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class StreamAttributesDiffblueTest {
  /**
   * Test {@link StreamAttributes#equals(Object)}, and {@link StreamAttributes#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link StreamAttributes#equals(Object)}
   *   <li>{@link StreamAttributes#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StreamAttributes.equals(Object)", "int StreamAttributes.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    StreamAttributes streamAttributes = new StreamAttributes();
    StreamAttributes streamAttributes2 = new StreamAttributes();

    // Act and Assert
    assertEquals(streamAttributes, streamAttributes2);
    int expectedHashCodeResult = streamAttributes.hashCode();
    assertEquals(expectedHashCodeResult, streamAttributes2.hashCode());
  }

  /**
   * Test {@link StreamAttributes#equals(Object)}, and {@link StreamAttributes#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link StreamAttributes#equals(Object)}
   *   <li>{@link StreamAttributes#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StreamAttributes.equals(Object)", "int StreamAttributes.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    StreamAttributes streamAttributes = new StreamAttributes();

    // Act and Assert
    assertEquals(streamAttributes, streamAttributes);
    int expectedHashCodeResult = streamAttributes.hashCode();
    assertEquals(expectedHashCodeResult, streamAttributes.hashCode());
  }

  /**
   * Test {@link StreamAttributes#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StreamAttributes.equals(Object)", "int StreamAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new StreamAttributes(), 1);
  }

  /**
   * Test {@link StreamAttributes#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StreamAttributes.equals(Object)", "int StreamAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    StreamAttributes streamAttributes = new StreamAttributes();
    streamAttributes.id("42");

    // Act and Assert
    assertNotEquals(streamAttributes, new StreamAttributes());
  }

  /**
   * Test {@link StreamAttributes#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StreamAttributes.equals(Object)", "int StreamAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    StreamAttributes streamAttributes = new StreamAttributes();
    streamAttributes.crossPod(true);

    // Act and Assert
    assertNotEquals(streamAttributes, new StreamAttributes());
  }

  /**
   * Test {@link StreamAttributes#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StreamAttributes.equals(Object)", "int StreamAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    StreamAttributes streamAttributes = new StreamAttributes();
    streamAttributes.active(true);

    // Act and Assert
    assertNotEquals(streamAttributes, new StreamAttributes());
  }

  /**
   * Test {@link StreamAttributes#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StreamAttributes.equals(Object)", "int StreamAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    StreamAttributes streamAttributes = new StreamAttributes();
    streamAttributes.streamType(new StreamType());

    // Act and Assert
    assertNotEquals(streamAttributes, new StreamAttributes());
  }

  /**
   * Test {@link StreamAttributes#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StreamAttributes.equals(Object)", "int StreamAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    StreamAttributes streamAttributes = new StreamAttributes();
    streamAttributes.streamAttributes(new ConversationSpecificStreamAttributes());

    // Act and Assert
    assertNotEquals(streamAttributes, new StreamAttributes());
  }

  /**
   * Test {@link StreamAttributes#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StreamAttributes.equals(Object)", "int StreamAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    StreamAttributes streamAttributes = new StreamAttributes();
    streamAttributes.roomAttributes(new RoomSpecificStreamAttributes());

    // Act and Assert
    assertNotEquals(streamAttributes, new StreamAttributes());
  }

  /**
   * Test {@link StreamAttributes#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StreamAttributes.equals(Object)", "int StreamAttributes.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new StreamAttributes(), null);
  }

  /**
   * Test {@link StreamAttributes#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StreamAttributes.equals(Object)", "int StreamAttributes.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new StreamAttributes(), "Different type to StreamAttributes");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link StreamAttributes}
   *   <li>{@link StreamAttributes#active(Boolean)}
   *   <li>{@link StreamAttributes#crossPod(Boolean)}
   *   <li>{@link StreamAttributes#id(String)}
   *   <li>{@link StreamAttributes#roomAttributes(RoomSpecificStreamAttributes)}
   *   <li>{@link StreamAttributes#setActive(Boolean)}
   *   <li>{@link StreamAttributes#setCrossPod(Boolean)}
   *   <li>{@link StreamAttributes#setId(String)}
   *   <li>{@link StreamAttributes#setRoomAttributes(RoomSpecificStreamAttributes)}
   *   <li>{@link StreamAttributes#setStreamAttributes(ConversationSpecificStreamAttributes)}
   *   <li>{@link StreamAttributes#setStreamType(StreamType)}
   *   <li>{@link StreamAttributes#streamAttributes(ConversationSpecificStreamAttributes)}
   *   <li>{@link StreamAttributes#streamType(StreamType)}
   *   <li>{@link StreamAttributes#toString()}
   *   <li>{@link StreamAttributes#getActive()}
   *   <li>{@link StreamAttributes#getCrossPod()}
   *   <li>{@link StreamAttributes#getId()}
   *   <li>{@link StreamAttributes#getRoomAttributes()}
   *   <li>{@link StreamAttributes#getStreamAttributes()}
   *   <li>{@link StreamAttributes#getStreamType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void StreamAttributes.<init>()", "StreamAttributes StreamAttributes.active(Boolean)",
      "StreamAttributes StreamAttributes.crossPod(Boolean)", "Boolean StreamAttributes.getActive()",
      "Boolean StreamAttributes.getCrossPod()", "String StreamAttributes.getId()",
      "RoomSpecificStreamAttributes StreamAttributes.getRoomAttributes()",
      "ConversationSpecificStreamAttributes StreamAttributes.getStreamAttributes()",
      "StreamType StreamAttributes.getStreamType()", "StreamAttributes StreamAttributes.id(String)",
      "StreamAttributes StreamAttributes.roomAttributes(RoomSpecificStreamAttributes)",
      "void StreamAttributes.setActive(Boolean)", "void StreamAttributes.setCrossPod(Boolean)",
      "void StreamAttributes.setId(String)", "void StreamAttributes.setRoomAttributes(RoomSpecificStreamAttributes)",
      "void StreamAttributes.setStreamAttributes(ConversationSpecificStreamAttributes)",
      "void StreamAttributes.setStreamType(StreamType)",
      "StreamAttributes StreamAttributes.streamAttributes(ConversationSpecificStreamAttributes)",
      "StreamAttributes StreamAttributes.streamType(StreamType)", "String StreamAttributes.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    StreamAttributes actualStreamAttributes = new StreamAttributes();
    StreamAttributes actualActiveResult = actualStreamAttributes.active(true);
    StreamAttributes actualCrossPodResult = actualStreamAttributes.crossPod(true);
    StreamAttributes actualIdResult = actualStreamAttributes.id("42");
    StreamAttributes actualRoomAttributesResult = actualStreamAttributes
        .roomAttributes(new RoomSpecificStreamAttributes());
    actualStreamAttributes.setActive(true);
    actualStreamAttributes.setCrossPod(true);
    actualStreamAttributes.setId("42");
    RoomSpecificStreamAttributes roomAttributes = new RoomSpecificStreamAttributes();
    actualStreamAttributes.setRoomAttributes(roomAttributes);
    actualStreamAttributes.setStreamAttributes(new ConversationSpecificStreamAttributes());
    actualStreamAttributes.setStreamType(new StreamType());
    ConversationSpecificStreamAttributes streamAttributes = new ConversationSpecificStreamAttributes();
    StreamAttributes actualStreamAttributesResult = actualStreamAttributes.streamAttributes(streamAttributes);
    StreamType streamType = new StreamType();
    StreamAttributes actualStreamTypeResult = actualStreamAttributes.streamType(streamType);
    String actualToStringResult = actualStreamAttributes.toString();
    Boolean actualActive = actualStreamAttributes.getActive();
    Boolean actualCrossPod = actualStreamAttributes.getCrossPod();
    String actualId = actualStreamAttributes.getId();
    RoomSpecificStreamAttributes actualRoomAttributes = actualStreamAttributes.getRoomAttributes();
    ConversationSpecificStreamAttributes actualStreamAttributes2 = actualStreamAttributes.getStreamAttributes();
    StreamType actualStreamType = actualStreamAttributes.getStreamType();

    // Assert
    assertEquals("42", actualId);
    assertEquals("class StreamAttributes {\n" + "    id: 42\n" + "    crossPod: true\n" + "    active: true\n"
        + "    streamType: class StreamType {\n" + "        type: null\n" + "    }\n"
        + "    streamAttributes: class ConversationSpecificStreamAttributes {\n" + "        members: null\n" + "    }\n"
        + "    roomAttributes: class RoomSpecificStreamAttributes {\n" + "        name: null\n" + "    }\n" + "}",
        actualToStringResult);
    assertNull(actualStreamType.getType());
    assertNull(actualRoomAttributes.getName());
    assertNull(actualStreamAttributes2.getMembers());
    assertTrue(actualActive);
    assertTrue(actualCrossPod);
    assertSame(streamAttributes, actualStreamAttributes2);
    assertSame(roomAttributes, actualRoomAttributes);
    assertSame(actualStreamAttributes, actualActiveResult);
    assertSame(actualStreamAttributes, actualCrossPodResult);
    assertSame(actualStreamAttributes, actualIdResult);
    assertSame(actualStreamAttributes, actualRoomAttributesResult);
    assertSame(actualStreamAttributes, actualStreamAttributesResult);
    assertSame(actualStreamAttributes, actualStreamTypeResult);
    assertSame(streamType, actualStreamType);
  }
}
