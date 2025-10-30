package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V2RoomDetailDiffblueTest {
  /**
   * Test {@link V2RoomDetail#equals(Object)}, and {@link V2RoomDetail#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V2RoomDetail#equals(Object)}
   *   <li>{@link V2RoomDetail#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2RoomDetail.equals(Object)", "int V2RoomDetail.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2RoomDetail v2RoomDetail = new V2RoomDetail();
    V2RoomDetail v2RoomDetail2 = new V2RoomDetail();

    // Act and Assert
    assertEquals(v2RoomDetail, v2RoomDetail2);
    int expectedHashCodeResult = v2RoomDetail.hashCode();
    assertEquals(expectedHashCodeResult, v2RoomDetail2.hashCode());
  }

  /**
   * Test {@link V2RoomDetail#equals(Object)}, and {@link V2RoomDetail#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V2RoomDetail#equals(Object)}
   *   <li>{@link V2RoomDetail#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2RoomDetail.equals(Object)", "int V2RoomDetail.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2RoomDetail v2RoomDetail = new V2RoomDetail();

    // Act and Assert
    assertEquals(v2RoomDetail, v2RoomDetail);
    int expectedHashCodeResult = v2RoomDetail.hashCode();
    assertEquals(expectedHashCodeResult, v2RoomDetail.hashCode());
  }

  /**
   * Test {@link V2RoomDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2RoomDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2RoomDetail.equals(Object)", "int V2RoomDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2RoomDetail(), 1);
  }

  /**
   * Test {@link V2RoomDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2RoomDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2RoomDetail.equals(Object)", "int V2RoomDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V2RoomDetail v2RoomDetail = new V2RoomDetail();
    v2RoomDetail.roomAttributes(new V2RoomAttributes());

    // Act and Assert
    assertNotEquals(v2RoomDetail, new V2RoomDetail());
  }

  /**
   * Test {@link V2RoomDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2RoomDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2RoomDetail.equals(Object)", "int V2RoomDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V2RoomDetail v2RoomDetail = new V2RoomDetail();
    v2RoomDetail.roomSystemInfo(new RoomSystemInfo());

    // Act and Assert
    assertNotEquals(v2RoomDetail, new V2RoomDetail());
  }

  /**
   * Test {@link V2RoomDetail#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2RoomDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2RoomDetail.equals(Object)", "int V2RoomDetail.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2RoomDetail(), null);
  }

  /**
   * Test {@link V2RoomDetail#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2RoomDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2RoomDetail.equals(Object)", "int V2RoomDetail.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2RoomDetail(), "Different type to V2RoomDetail");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V2RoomDetail}
   *   <li>{@link V2RoomDetail#roomAttributes(V2RoomAttributes)}
   *   <li>{@link V2RoomDetail#roomSystemInfo(RoomSystemInfo)}
   *   <li>{@link V2RoomDetail#setRoomAttributes(V2RoomAttributes)}
   *   <li>{@link V2RoomDetail#setRoomSystemInfo(RoomSystemInfo)}
   *   <li>{@link V2RoomDetail#toString()}
   *   <li>{@link V2RoomDetail#getRoomAttributes()}
   *   <li>{@link V2RoomDetail#getRoomSystemInfo()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V2RoomDetail.<init>()", "V2RoomAttributes V2RoomDetail.getRoomAttributes()",
      "RoomSystemInfo V2RoomDetail.getRoomSystemInfo()", "V2RoomDetail V2RoomDetail.roomAttributes(V2RoomAttributes)",
      "V2RoomDetail V2RoomDetail.roomSystemInfo(RoomSystemInfo)",
      "void V2RoomDetail.setRoomAttributes(V2RoomAttributes)", "void V2RoomDetail.setRoomSystemInfo(RoomSystemInfo)",
      "String V2RoomDetail.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    V2RoomDetail actualV2RoomDetail = new V2RoomDetail();
    V2RoomDetail actualRoomAttributesResult = actualV2RoomDetail.roomAttributes(new V2RoomAttributes());
    V2RoomDetail actualRoomSystemInfoResult = actualV2RoomDetail.roomSystemInfo(new RoomSystemInfo());
    V2RoomAttributes roomAttributes = new V2RoomAttributes();
    actualV2RoomDetail.setRoomAttributes(roomAttributes);
    RoomSystemInfo roomSystemInfo = new RoomSystemInfo();
    actualV2RoomDetail.setRoomSystemInfo(roomSystemInfo);
    String actualToStringResult = actualV2RoomDetail.toString();
    V2RoomAttributes actualRoomAttributes = actualV2RoomDetail.getRoomAttributes();

    // Assert
    assertEquals("class V2RoomDetail {\n" + "    roomAttributes: class V2RoomAttributes {\n" + "        name: null\n"
        + "        keywords: null\n" + "        description: null\n" + "        membersCanInvite: null\n"
        + "        discoverable: null\n" + "        _public: null\n" + "        readOnly: null\n"
        + "        copyProtected: null\n" + "    }\n" + "    roomSystemInfo: class RoomSystemInfo {\n"
        + "        id: null\n" + "        creationDate: null\n" + "        createdByUserId: null\n"
        + "        active: null\n" + "    }\n" + "}", actualToStringResult);
    assertSame(roomSystemInfo, actualV2RoomDetail.getRoomSystemInfo());
    assertSame(roomAttributes, actualRoomAttributes);
    assertSame(actualV2RoomDetail, actualRoomAttributesResult);
    assertSame(actualV2RoomDetail, actualRoomSystemInfoResult);
  }
}
