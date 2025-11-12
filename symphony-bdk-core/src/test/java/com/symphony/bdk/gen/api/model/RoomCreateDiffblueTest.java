package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RoomCreateDiffblueTest {
  /**
   * Test {@link RoomCreate#equals(Object)}, and {@link RoomCreate#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RoomCreate#equals(Object)}
   *   <li>{@link RoomCreate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RoomCreate.equals(Object)", "int RoomCreate.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    RoomCreate roomCreate = new RoomCreate();
    RoomCreate roomCreate2 = new RoomCreate();

    // Act and Assert
    assertEquals(roomCreate, roomCreate2);
    assertEquals(roomCreate.hashCode(), roomCreate2.hashCode());
  }

  /**
   * Test {@link RoomCreate#equals(Object)}, and {@link RoomCreate#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RoomCreate#equals(Object)}
   *   <li>{@link RoomCreate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RoomCreate.equals(Object)", "int RoomCreate.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    RoomCreate roomCreate = new RoomCreate();

    // Act and Assert
    assertEquals(roomCreate, roomCreate);
    int expectedHashCodeResult = roomCreate.hashCode();
    assertEquals(expectedHashCodeResult, roomCreate.hashCode());
  }

  /**
   * Test {@link RoomCreate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomCreate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RoomCreate.equals(Object)", "int RoomCreate.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomCreate(), 1);
  }

  /**
   * Test {@link RoomCreate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomCreate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RoomCreate.equals(Object)", "int RoomCreate.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    RoomCreate roomCreate = new RoomCreate();
    roomCreate.roomAttributes(new RoomAttributes());

    // Act and Assert
    assertNotEquals(roomCreate, new RoomCreate());
  }

  /**
   * Test {@link RoomCreate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomCreate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RoomCreate.equals(Object)", "int RoomCreate.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    RoomCreate roomCreate = new RoomCreate();
    roomCreate.immutableRoomAttributes(new ImmutableRoomAttributes());

    // Act and Assert
    assertNotEquals(roomCreate, new RoomCreate());
  }

  /**
   * Test {@link RoomCreate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomCreate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RoomCreate.equals(Object)", "int RoomCreate.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomCreate(), null);
  }

  /**
   * Test {@link RoomCreate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomCreate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RoomCreate.equals(Object)", "int RoomCreate.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomCreate(), "Different type to RoomCreate");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link RoomCreate}
   *   <li>{@link RoomCreate#immutableRoomAttributes(ImmutableRoomAttributes)}
   *   <li>{@link RoomCreate#roomAttributes(RoomAttributes)}
   *   <li>{@link RoomCreate#setImmutableRoomAttributes(ImmutableRoomAttributes)}
   *   <li>{@link RoomCreate#setRoomAttributes(RoomAttributes)}
   *   <li>{@link RoomCreate#toString()}
   *   <li>{@link RoomCreate#getImmutableRoomAttributes()}
   *   <li>{@link RoomCreate#getRoomAttributes()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RoomCreate.<init>()",
    "ImmutableRoomAttributes RoomCreate.getImmutableRoomAttributes()",
    "RoomAttributes RoomCreate.getRoomAttributes()",
    "RoomCreate RoomCreate.immutableRoomAttributes(ImmutableRoomAttributes)",
    "RoomCreate RoomCreate.roomAttributes(RoomAttributes)",
    "void RoomCreate.setImmutableRoomAttributes(ImmutableRoomAttributes)",
    "void RoomCreate.setRoomAttributes(RoomAttributes)",
    "String RoomCreate.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    RoomCreate actualRoomCreate = new RoomCreate();
    RoomCreate actualImmutableRoomAttributesResult =
        actualRoomCreate.immutableRoomAttributes(new ImmutableRoomAttributes());
    RoomCreate actualRoomAttributesResult = actualRoomCreate.roomAttributes(new RoomAttributes());
    ImmutableRoomAttributes immutableRoomAttributes = new ImmutableRoomAttributes();
    actualRoomCreate.setImmutableRoomAttributes(immutableRoomAttributes);
    RoomAttributes roomAttributes = new RoomAttributes();
    actualRoomCreate.setRoomAttributes(roomAttributes);
    String actualToStringResult = actualRoomCreate.toString();
    ImmutableRoomAttributes actualImmutableRoomAttributes =
        actualRoomCreate.getImmutableRoomAttributes();

    // Assert
    assertEquals(
        "class RoomCreate {\n"
            + "    roomAttributes: class RoomAttributes {\n"
            + "        name: null\n"
            + "        description: null\n"
            + "        membersCanInvite: null\n"
            + "        discoverable: null\n"
            + "    }\n"
            + "    immutableRoomAttributes: class ImmutableRoomAttributes {\n"
            + "        _public: null\n"
            + "        readOnly: null\n"
            + "        copyProtected: null\n"
            + "    }\n"
            + "}",
        actualToStringResult);
    assertSame(immutableRoomAttributes, actualImmutableRoomAttributes);
    assertSame(roomAttributes, actualRoomCreate.getRoomAttributes());
    assertSame(actualRoomCreate, actualImmutableRoomAttributesResult);
    assertSame(actualRoomCreate, actualRoomAttributesResult);
  }
}
