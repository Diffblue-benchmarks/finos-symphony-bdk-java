package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V2StreamAttributesDiffblueTest {
  /**
   * Test {@link V2StreamAttributes#equals(Object)}, and {@link V2StreamAttributes#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2StreamAttributes#equals(Object)}
   *   <li>{@link V2StreamAttributes#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2StreamAttributes.equals(Object)",
    "int V2StreamAttributes.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2StreamAttributes v2StreamAttributes = new V2StreamAttributes();
    V2StreamAttributes v2StreamAttributes2 = new V2StreamAttributes();

    // Act and Assert
    assertEquals(v2StreamAttributes, v2StreamAttributes2);
    assertEquals(v2StreamAttributes.hashCode(), v2StreamAttributes2.hashCode());
  }

  /**
   * Test {@link V2StreamAttributes#equals(Object)}, and {@link V2StreamAttributes#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2StreamAttributes#equals(Object)}
   *   <li>{@link V2StreamAttributes#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2StreamAttributes.equals(Object)",
    "int V2StreamAttributes.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2StreamAttributes v2StreamAttributes = new V2StreamAttributes();

    // Act and Assert
    assertEquals(v2StreamAttributes, v2StreamAttributes);
    int expectedHashCodeResult = v2StreamAttributes.hashCode();
    assertEquals(expectedHashCodeResult, v2StreamAttributes.hashCode());
  }

  /**
   * Test {@link V2StreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2StreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2StreamAttributes.equals(Object)",
    "int V2StreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2StreamAttributes(), 1);
  }

  /**
   * Test {@link V2StreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2StreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2StreamAttributes.equals(Object)",
    "int V2StreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V2StreamAttributes v2StreamAttributes = new V2StreamAttributes();
    v2StreamAttributes.id("42");

    // Act and Assert
    assertNotEquals(v2StreamAttributes, new V2StreamAttributes());
  }

  /**
   * Test {@link V2StreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2StreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2StreamAttributes.equals(Object)",
    "int V2StreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V2StreamAttributes v2StreamAttributes = new V2StreamAttributes();
    v2StreamAttributes.crossPod(true);

    // Act and Assert
    assertNotEquals(v2StreamAttributes, new V2StreamAttributes());
  }

  /**
   * Test {@link V2StreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2StreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2StreamAttributes.equals(Object)",
    "int V2StreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V2StreamAttributes v2StreamAttributes = new V2StreamAttributes();
    v2StreamAttributes.origin("Origin");

    // Act and Assert
    assertNotEquals(v2StreamAttributes, new V2StreamAttributes());
  }

  /**
   * Test {@link V2StreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2StreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2StreamAttributes.equals(Object)",
    "int V2StreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V2StreamAttributes v2StreamAttributes = new V2StreamAttributes();
    v2StreamAttributes.active(true);

    // Act and Assert
    assertNotEquals(v2StreamAttributes, new V2StreamAttributes());
  }

  /**
   * Test {@link V2StreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2StreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2StreamAttributes.equals(Object)",
    "int V2StreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    V2StreamAttributes v2StreamAttributes = new V2StreamAttributes();
    v2StreamAttributes.lastMessageDate(1L);

    // Act and Assert
    assertNotEquals(v2StreamAttributes, new V2StreamAttributes());
  }

  /**
   * Test {@link V2StreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2StreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2StreamAttributes.equals(Object)",
    "int V2StreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    V2StreamAttributes v2StreamAttributes = new V2StreamAttributes();
    v2StreamAttributes.streamType(new V2StreamType());

    // Act and Assert
    assertNotEquals(v2StreamAttributes, new V2StreamAttributes());
  }

  /**
   * Test {@link V2StreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2StreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2StreamAttributes.equals(Object)",
    "int V2StreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    V2StreamAttributes v2StreamAttributes = new V2StreamAttributes();
    v2StreamAttributes.streamAttributes(new V2ConversationSpecificStreamAttributes());

    // Act and Assert
    assertNotEquals(v2StreamAttributes, new V2StreamAttributes());
  }

  /**
   * Test {@link V2StreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2StreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2StreamAttributes.equals(Object)",
    "int V2StreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    V2StreamAttributes v2StreamAttributes = new V2StreamAttributes();
    v2StreamAttributes.roomAttributes(new V2RoomSpecificStreamAttributes());

    // Act and Assert
    assertNotEquals(v2StreamAttributes, new V2StreamAttributes());
  }

  /**
   * Test {@link V2StreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2StreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2StreamAttributes.equals(Object)",
    "int V2StreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2StreamAttributes(), null);
  }

  /**
   * Test {@link V2StreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2StreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2StreamAttributes.equals(Object)",
    "int V2StreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2StreamAttributes(), "Different type to V2StreamAttributes");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V2StreamAttributes}
   *   <li>{@link V2StreamAttributes#active(Boolean)}
   *   <li>{@link V2StreamAttributes#crossPod(Boolean)}
   *   <li>{@link V2StreamAttributes#id(String)}
   *   <li>{@link V2StreamAttributes#lastMessageDate(Long)}
   *   <li>{@link V2StreamAttributes#origin(String)}
   *   <li>{@link V2StreamAttributes#roomAttributes(V2RoomSpecificStreamAttributes)}
   *   <li>{@link V2StreamAttributes#setActive(Boolean)}
   *   <li>{@link V2StreamAttributes#setCrossPod(Boolean)}
   *   <li>{@link V2StreamAttributes#setId(String)}
   *   <li>{@link V2StreamAttributes#setLastMessageDate(Long)}
   *   <li>{@link V2StreamAttributes#setOrigin(String)}
   *   <li>{@link V2StreamAttributes#setRoomAttributes(V2RoomSpecificStreamAttributes)}
   *   <li>{@link V2StreamAttributes#setStreamAttributes(V2ConversationSpecificStreamAttributes)}
   *   <li>{@link V2StreamAttributes#setStreamType(V2StreamType)}
   *   <li>{@link V2StreamAttributes#streamAttributes(V2ConversationSpecificStreamAttributes)}
   *   <li>{@link V2StreamAttributes#streamType(V2StreamType)}
   *   <li>{@link V2StreamAttributes#toString()}
   *   <li>{@link V2StreamAttributes#getActive()}
   *   <li>{@link V2StreamAttributes#getCrossPod()}
   *   <li>{@link V2StreamAttributes#getId()}
   *   <li>{@link V2StreamAttributes#getLastMessageDate()}
   *   <li>{@link V2StreamAttributes#getOrigin()}
   *   <li>{@link V2StreamAttributes#getRoomAttributes()}
   *   <li>{@link V2StreamAttributes#getStreamAttributes()}
   *   <li>{@link V2StreamAttributes#getStreamType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V2StreamAttributes.<init>()",
    "V2StreamAttributes V2StreamAttributes.active(Boolean)",
    "V2StreamAttributes V2StreamAttributes.crossPod(Boolean)",
    "Boolean V2StreamAttributes.getActive()",
    "Boolean V2StreamAttributes.getCrossPod()",
    "String V2StreamAttributes.getId()",
    "Long V2StreamAttributes.getLastMessageDate()",
    "String V2StreamAttributes.getOrigin()",
    "V2RoomSpecificStreamAttributes V2StreamAttributes.getRoomAttributes()",
    "V2ConversationSpecificStreamAttributes V2StreamAttributes.getStreamAttributes()",
    "V2StreamType V2StreamAttributes.getStreamType()",
    "V2StreamAttributes V2StreamAttributes.id(String)",
    "V2StreamAttributes V2StreamAttributes.lastMessageDate(Long)",
    "V2StreamAttributes V2StreamAttributes.origin(String)",
    "V2StreamAttributes V2StreamAttributes.roomAttributes(V2RoomSpecificStreamAttributes)",
    "void V2StreamAttributes.setActive(Boolean)",
    "void V2StreamAttributes.setCrossPod(Boolean)",
    "void V2StreamAttributes.setId(String)",
    "void V2StreamAttributes.setLastMessageDate(Long)",
    "void V2StreamAttributes.setOrigin(String)",
    "void V2StreamAttributes.setRoomAttributes(V2RoomSpecificStreamAttributes)",
    "void V2StreamAttributes.setStreamAttributes(V2ConversationSpecificStreamAttributes)",
    "void V2StreamAttributes.setStreamType(V2StreamType)",
    "V2StreamAttributes V2StreamAttributes.streamAttributes(V2ConversationSpecificStreamAttributes)",
    "V2StreamAttributes V2StreamAttributes.streamType(V2StreamType)",
    "String V2StreamAttributes.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V2StreamAttributes actualV2StreamAttributes = new V2StreamAttributes();
    V2StreamAttributes actualActiveResult = actualV2StreamAttributes.active(true);
    V2StreamAttributes actualCrossPodResult = actualV2StreamAttributes.crossPod(true);
    V2StreamAttributes actualIdResult = actualV2StreamAttributes.id("42");
    V2StreamAttributes actualLastMessageDateResult = actualV2StreamAttributes.lastMessageDate(1L);
    V2StreamAttributes actualOriginResult = actualV2StreamAttributes.origin("Origin");
    V2StreamAttributes actualRoomAttributesResult =
        actualV2StreamAttributes.roomAttributes(new V2RoomSpecificStreamAttributes());
    actualV2StreamAttributes.setActive(true);
    actualV2StreamAttributes.setCrossPod(true);
    actualV2StreamAttributes.setId("42");
    actualV2StreamAttributes.setLastMessageDate(1L);
    actualV2StreamAttributes.setOrigin("Origin");
    V2RoomSpecificStreamAttributes roomAttributes = new V2RoomSpecificStreamAttributes();
    actualV2StreamAttributes.setRoomAttributes(roomAttributes);
    actualV2StreamAttributes.setStreamAttributes(new V2ConversationSpecificStreamAttributes());
    actualV2StreamAttributes.setStreamType(new V2StreamType());
    V2ConversationSpecificStreamAttributes streamAttributes =
        new V2ConversationSpecificStreamAttributes();
    V2StreamAttributes actualStreamAttributesResult =
        actualV2StreamAttributes.streamAttributes(streamAttributes);
    V2StreamType streamType = new V2StreamType();
    V2StreamAttributes actualStreamTypeResult = actualV2StreamAttributes.streamType(streamType);
    String actualToStringResult = actualV2StreamAttributes.toString();
    Boolean actualActive = actualV2StreamAttributes.getActive();
    Boolean actualCrossPod = actualV2StreamAttributes.getCrossPod();
    String actualId = actualV2StreamAttributes.getId();
    Long actualLastMessageDate = actualV2StreamAttributes.getLastMessageDate();
    String actualOrigin = actualV2StreamAttributes.getOrigin();
    V2RoomSpecificStreamAttributes actualRoomAttributes =
        actualV2StreamAttributes.getRoomAttributes();
    V2ConversationSpecificStreamAttributes actualStreamAttributes =
        actualV2StreamAttributes.getStreamAttributes();
    V2StreamType actualStreamType = actualV2StreamAttributes.getStreamType();

    // Assert
    assertEquals("42", actualId);
    assertEquals("Origin", actualOrigin);
    assertEquals(
        "class V2StreamAttributes {\n"
            + "    id: 42\n"
            + "    crossPod: true\n"
            + "    origin: Origin\n"
            + "    active: true\n"
            + "    lastMessageDate: 1\n"
            + "    streamType: class V2StreamType {\n"
            + "        type: null\n"
            + "    }\n"
            + "    streamAttributes: class V2ConversationSpecificStreamAttributes {\n"
            + "        members: null\n"
            + "    }\n"
            + "    roomAttributes: class V2RoomSpecificStreamAttributes {\n"
            + "        name: null\n"
            + "        groups: null\n"
            + "    }\n"
            + "}",
        actualToStringResult);
    assertNull(actualStreamType.getType());
    assertNull(actualStreamAttributes.getMembers());
    assertEquals(1L, actualLastMessageDate.longValue());
    assertTrue(actualActive);
    assertTrue(actualCrossPod);
    assertSame(streamAttributes, actualStreamAttributes);
    assertSame(roomAttributes, actualRoomAttributes);
    assertSame(actualV2StreamAttributes, actualActiveResult);
    assertSame(actualV2StreamAttributes, actualCrossPodResult);
    assertSame(actualV2StreamAttributes, actualIdResult);
    assertSame(actualV2StreamAttributes, actualLastMessageDateResult);
    assertSame(actualV2StreamAttributes, actualOriginResult);
    assertSame(actualV2StreamAttributes, actualRoomAttributesResult);
    assertSame(actualV2StreamAttributes, actualStreamAttributesResult);
    assertSame(actualV2StreamAttributes, actualStreamTypeResult);
    assertSame(streamType, actualStreamType);
  }
}
