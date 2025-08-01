package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V3RoomDetailDiffblueTest {
  /**
   * Test {@link V3RoomDetail#addGroupsItem(GroupItem)}.
   *
   * <ul>
   *   <li>Given {@link V3RoomDetail} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link V3RoomDetail#addGroupsItem(GroupItem)}
   */
  @Test
  @DisplayName("Test addGroupsItem(GroupItem); given V3RoomDetail (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V3RoomDetail V3RoomDetail.addGroupsItem(GroupItem)"})
  void testAddGroupsItem_givenV3RoomDetail() {
    // Arrange
    V3RoomDetail v3RoomDetail = new V3RoomDetail();

    // Act and Assert
    assertSame(v3RoomDetail, v3RoomDetail.addGroupsItem(new GroupItem()));
  }

  /**
   * Test {@link V3RoomDetail#addGroupsItem(GroupItem)}.
   *
   * <ul>
   *   <li>Given {@link V3RoomDetail} (default constructor) groups {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link V3RoomDetail#addGroupsItem(GroupItem)}
   */
  @Test
  @DisplayName(
      "Test addGroupsItem(GroupItem); given V3RoomDetail (default constructor) groups ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V3RoomDetail V3RoomDetail.addGroupsItem(GroupItem)"})
  void testAddGroupsItem_givenV3RoomDetailGroupsArrayList() {
    // Arrange
    V3RoomDetail v3RoomDetail = new V3RoomDetail();
    v3RoomDetail.groups(new ArrayList<>());

    // Act and Assert
    assertSame(v3RoomDetail, v3RoomDetail.addGroupsItem(new GroupItem()));
  }

  /**
   * Test {@link V3RoomDetail#equals(Object)}, and {@link V3RoomDetail#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3RoomDetail#equals(Object)}
   *   <li>{@link V3RoomDetail#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3RoomDetail.equals(Object)", "int V3RoomDetail.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V3RoomDetail v3RoomDetail = new V3RoomDetail();
    V3RoomDetail v3RoomDetail2 = new V3RoomDetail();

    // Act and Assert
    assertEquals(v3RoomDetail, v3RoomDetail2);
    int expectedHashCodeResult = v3RoomDetail.hashCode();
    assertEquals(expectedHashCodeResult, v3RoomDetail2.hashCode());
  }

  /**
   * Test {@link V3RoomDetail#equals(Object)}, and {@link V3RoomDetail#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3RoomDetail#equals(Object)}
   *   <li>{@link V3RoomDetail#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3RoomDetail.equals(Object)", "int V3RoomDetail.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V3RoomDetail v3RoomDetail = new V3RoomDetail();

    // Act and Assert
    assertEquals(v3RoomDetail, v3RoomDetail);
    int expectedHashCodeResult = v3RoomDetail.hashCode();
    assertEquals(expectedHashCodeResult, v3RoomDetail.hashCode());
  }

  /**
   * Test {@link V3RoomDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3RoomDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3RoomDetail.equals(Object)", "int V3RoomDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V3RoomDetail v3RoomDetail = new V3RoomDetail();
    v3RoomDetail.addGroupsItem(new GroupItem());

    // Act and Assert
    assertNotEquals(v3RoomDetail, new V3RoomDetail());
  }

  /**
   * Test {@link V3RoomDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3RoomDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3RoomDetail.equals(Object)", "int V3RoomDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V3RoomDetail v3RoomDetail = new V3RoomDetail();
    v3RoomDetail.roomAttributes(new V3RoomAttributes());
    v3RoomDetail.addGroupsItem(new GroupItem());

    // Act and Assert
    assertNotEquals(v3RoomDetail, new V3RoomDetail());
  }

  /**
   * Test {@link V3RoomDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3RoomDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3RoomDetail.equals(Object)", "int V3RoomDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V3RoomDetail v3RoomDetail = new V3RoomDetail();
    v3RoomDetail.roomSystemInfo(new RoomSystemInfo());
    v3RoomDetail.addGroupsItem(new GroupItem());

    // Act and Assert
    assertNotEquals(v3RoomDetail, new V3RoomDetail());
  }

  /**
   * Test {@link V3RoomDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3RoomDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3RoomDetail.equals(Object)", "int V3RoomDetail.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3RoomDetail(), null);
  }

  /**
   * Test {@link V3RoomDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3RoomDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3RoomDetail.equals(Object)", "int V3RoomDetail.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3RoomDetail(), "Different type to V3RoomDetail");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V3RoomDetail}
   *   <li>{@link V3RoomDetail#groups(List)}
   *   <li>{@link V3RoomDetail#roomAttributes(V3RoomAttributes)}
   *   <li>{@link V3RoomDetail#roomSystemInfo(RoomSystemInfo)}
   *   <li>{@link V3RoomDetail#setGroups(List)}
   *   <li>{@link V3RoomDetail#setRoomAttributes(V3RoomAttributes)}
   *   <li>{@link V3RoomDetail#setRoomSystemInfo(RoomSystemInfo)}
   *   <li>{@link V3RoomDetail#toString()}
   *   <li>{@link V3RoomDetail#getGroups()}
   *   <li>{@link V3RoomDetail#getRoomAttributes()}
   *   <li>{@link V3RoomDetail#getRoomSystemInfo()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V3RoomDetail.<init>()",
    "List V3RoomDetail.getGroups()",
    "V3RoomAttributes V3RoomDetail.getRoomAttributes()",
    "RoomSystemInfo V3RoomDetail.getRoomSystemInfo()",
    "V3RoomDetail V3RoomDetail.groups(List)",
    "V3RoomDetail V3RoomDetail.roomAttributes(V3RoomAttributes)",
    "V3RoomDetail V3RoomDetail.roomSystemInfo(RoomSystemInfo)",
    "void V3RoomDetail.setGroups(List)",
    "void V3RoomDetail.setRoomAttributes(V3RoomAttributes)",
    "void V3RoomDetail.setRoomSystemInfo(RoomSystemInfo)",
    "String V3RoomDetail.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V3RoomDetail actualV3RoomDetail = new V3RoomDetail();
    V3RoomDetail actualGroupsResult = actualV3RoomDetail.groups(new ArrayList<>());
    V3RoomDetail actualRoomAttributesResult =
        actualV3RoomDetail.roomAttributes(new V3RoomAttributes());
    V3RoomDetail actualRoomSystemInfoResult =
        actualV3RoomDetail.roomSystemInfo(new RoomSystemInfo());
    ArrayList<GroupItem> groups = new ArrayList<>();
    actualV3RoomDetail.setGroups(groups);
    V3RoomAttributes roomAttributes = new V3RoomAttributes();
    actualV3RoomDetail.setRoomAttributes(roomAttributes);
    RoomSystemInfo roomSystemInfo = new RoomSystemInfo();
    actualV3RoomDetail.setRoomSystemInfo(roomSystemInfo);
    String actualToStringResult = actualV3RoomDetail.toString();
    List<GroupItem> actualGroups = actualV3RoomDetail.getGroups();
    V3RoomAttributes actualRoomAttributes = actualV3RoomDetail.getRoomAttributes();
    RoomSystemInfo actualRoomSystemInfo = actualV3RoomDetail.getRoomSystemInfo();

    // Assert
    assertEquals(
        "class V3RoomDetail {\n"
            + "    roomAttributes: class V3RoomAttributes {\n"
            + "        name: null\n"
            + "        keywords: null\n"
            + "        description: null\n"
            + "        membersCanInvite: null\n"
            + "        discoverable: null\n"
            + "        _public: null\n"
            + "        readOnly: null\n"
            + "        copyProtected: null\n"
            + "        crossPod: null\n"
            + "        viewHistory: null\n"
            + "        multiLateralRoom: null\n"
            + "        scheduledMeeting: null\n"
            + "        subType: null\n"
            + "        pinnedMessageId: null\n"
            + "    }\n"
            + "    roomSystemInfo: class RoomSystemInfo {\n"
            + "        id: null\n"
            + "        creationDate: null\n"
            + "        createdByUserId: null\n"
            + "        active: null\n"
            + "    }\n"
            + "    groups: []\n"
            + "}",
        actualToStringResult);
    assertTrue(actualGroups.isEmpty());
    assertSame(roomSystemInfo, actualRoomSystemInfo);
    assertSame(roomAttributes, actualRoomAttributes);
    assertSame(actualV3RoomDetail, actualGroupsResult);
    assertSame(actualV3RoomDetail, actualRoomAttributesResult);
    assertSame(actualV3RoomDetail, actualRoomSystemInfoResult);
    assertSame(groups, actualGroups);
  }
}
