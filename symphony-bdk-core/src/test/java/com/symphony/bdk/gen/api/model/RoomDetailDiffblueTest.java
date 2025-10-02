package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RoomDetailDiffblueTest {
  /**
   * Test {@link RoomDetail#equals(Object)}, and {@link RoomDetail#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RoomDetail#equals(Object)}
   *   <li>{@link RoomDetail#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RoomDetail.equals(Object)", "int RoomDetail.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    RoomDetail roomDetail = new RoomDetail();
    RoomDetail roomDetail2 = new RoomDetail();

    // Act and Assert
    assertEquals(roomDetail, roomDetail2);
    assertEquals(roomDetail.hashCode(), roomDetail2.hashCode());
  }

  /**
   * Test {@link RoomDetail#equals(Object)}, and {@link RoomDetail#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RoomDetail#equals(Object)}
   *   <li>{@link RoomDetail#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RoomDetail.equals(Object)", "int RoomDetail.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    RoomDetail roomDetail = new RoomDetail();

    // Act and Assert
    assertEquals(roomDetail, roomDetail);
    int expectedHashCodeResult = roomDetail.hashCode();
    assertEquals(expectedHashCodeResult, roomDetail.hashCode());
  }

  /**
   * Test {@link RoomDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RoomDetail.equals(Object)", "int RoomDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomDetail(), 1);
  }

  /**
   * Test {@link RoomDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RoomDetail.equals(Object)", "int RoomDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    RoomDetail roomDetail = new RoomDetail();
    roomDetail.roomAttributes(new RoomAttributes());

    // Act and Assert
    assertNotEquals(roomDetail, new RoomDetail());
  }

  /**
   * Test {@link RoomDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RoomDetail.equals(Object)", "int RoomDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    RoomDetail roomDetail = new RoomDetail();
    roomDetail.roomSystemInfo(new RoomSystemInfo());

    // Act and Assert
    assertNotEquals(roomDetail, new RoomDetail());
  }

  /**
   * Test {@link RoomDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RoomDetail.equals(Object)", "int RoomDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    RoomDetail roomDetail = new RoomDetail();
    roomDetail.immutableRoomAttributes(new ImmutableRoomAttributes());

    // Act and Assert
    assertNotEquals(roomDetail, new RoomDetail());
  }

  /**
   * Test {@link RoomDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RoomDetail.equals(Object)", "int RoomDetail.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomDetail(), null);
  }

  /**
   * Test {@link RoomDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RoomDetail.equals(Object)", "int RoomDetail.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomDetail(), "Different type to RoomDetail");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link RoomDetail}
   *   <li>{@link RoomDetail#immutableRoomAttributes(ImmutableRoomAttributes)}
   *   <li>{@link RoomDetail#roomAttributes(RoomAttributes)}
   *   <li>{@link RoomDetail#roomSystemInfo(RoomSystemInfo)}
   *   <li>{@link RoomDetail#setImmutableRoomAttributes(ImmutableRoomAttributes)}
   *   <li>{@link RoomDetail#setRoomAttributes(RoomAttributes)}
   *   <li>{@link RoomDetail#setRoomSystemInfo(RoomSystemInfo)}
   *   <li>{@link RoomDetail#toString()}
   *   <li>{@link RoomDetail#getImmutableRoomAttributes()}
   *   <li>{@link RoomDetail#getRoomAttributes()}
   *   <li>{@link RoomDetail#getRoomSystemInfo()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RoomDetail.<init>()",
    "ImmutableRoomAttributes RoomDetail.getImmutableRoomAttributes()",
    "RoomAttributes RoomDetail.getRoomAttributes()",
    "RoomSystemInfo RoomDetail.getRoomSystemInfo()",
    "RoomDetail RoomDetail.immutableRoomAttributes(ImmutableRoomAttributes)",
    "RoomDetail RoomDetail.roomAttributes(RoomAttributes)",
    "RoomDetail RoomDetail.roomSystemInfo(RoomSystemInfo)",
    "void RoomDetail.setImmutableRoomAttributes(ImmutableRoomAttributes)",
    "void RoomDetail.setRoomAttributes(RoomAttributes)",
    "void RoomDetail.setRoomSystemInfo(RoomSystemInfo)",
    "String RoomDetail.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    RoomDetail actualRoomDetail = new RoomDetail();
    RoomDetail actualImmutableRoomAttributesResult =
        actualRoomDetail.immutableRoomAttributes(new ImmutableRoomAttributes());
    RoomDetail actualRoomAttributesResult = actualRoomDetail.roomAttributes(new RoomAttributes());
    RoomDetail actualRoomSystemInfoResult = actualRoomDetail.roomSystemInfo(new RoomSystemInfo());
    ImmutableRoomAttributes immutableRoomAttributes = new ImmutableRoomAttributes();
    actualRoomDetail.setImmutableRoomAttributes(immutableRoomAttributes);
    RoomAttributes roomAttributes = new RoomAttributes();
    actualRoomDetail.setRoomAttributes(roomAttributes);
    RoomSystemInfo roomSystemInfo = new RoomSystemInfo();
    actualRoomDetail.setRoomSystemInfo(roomSystemInfo);
    String actualToStringResult = actualRoomDetail.toString();
    ImmutableRoomAttributes actualImmutableRoomAttributes =
        actualRoomDetail.getImmutableRoomAttributes();
    RoomAttributes actualRoomAttributes = actualRoomDetail.getRoomAttributes();
    RoomSystemInfo actualRoomSystemInfo = actualRoomDetail.getRoomSystemInfo();

    // Assert
    assertEquals(
        "class RoomDetail {\n"
            + "    roomAttributes: class RoomAttributes {\n"
            + "        name: null\n"
            + "        description: null\n"
            + "        membersCanInvite: null\n"
            + "        discoverable: null\n"
            + "    }\n"
            + "    roomSystemInfo: class RoomSystemInfo {\n"
            + "        id: null\n"
            + "        creationDate: null\n"
            + "        createdByUserId: null\n"
            + "        active: null\n"
            + "    }\n"
            + "    immutableRoomAttributes: class ImmutableRoomAttributes {\n"
            + "        _public: null\n"
            + "        readOnly: null\n"
            + "        copyProtected: null\n"
            + "    }\n"
            + "}",
        actualToStringResult);
    assertSame(immutableRoomAttributes, actualImmutableRoomAttributes);
    assertSame(roomAttributes, actualRoomAttributes);
    assertSame(actualRoomDetail, actualImmutableRoomAttributesResult);
    assertSame(actualRoomDetail, actualRoomAttributesResult);
    assertSame(actualRoomDetail, actualRoomSystemInfoResult);
    assertSame(roomSystemInfo, actualRoomSystemInfo);
  }
}
