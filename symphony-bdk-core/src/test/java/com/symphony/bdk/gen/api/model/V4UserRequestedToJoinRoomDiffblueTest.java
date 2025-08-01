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

class V4UserRequestedToJoinRoomDiffblueTest {
  /**
   * Test {@link V4UserRequestedToJoinRoom#addAffectedUsersItem(V4User)}.
   *
   * <ul>
   *   <li>Given {@link V4UserRequestedToJoinRoom} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link V4UserRequestedToJoinRoom#addAffectedUsersItem(V4User)}
   */
  @Test
  @DisplayName(
      "Test addAffectedUsersItem(V4User); given V4UserRequestedToJoinRoom (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "V4UserRequestedToJoinRoom V4UserRequestedToJoinRoom.addAffectedUsersItem(V4User)"
  })
  void testAddAffectedUsersItem_givenV4UserRequestedToJoinRoom() {
    // Arrange
    V4UserRequestedToJoinRoom v4UserRequestedToJoinRoom = new V4UserRequestedToJoinRoom();

    // Act and Assert
    assertSame(
        v4UserRequestedToJoinRoom, v4UserRequestedToJoinRoom.addAffectedUsersItem(new V4User()));
  }

  /**
   * Test {@link V4UserRequestedToJoinRoom#addAffectedUsersItem(V4User)}.
   *
   * <ul>
   *   <li>Given {@link V4UserRequestedToJoinRoom} (default constructor) affectedUsers {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link V4UserRequestedToJoinRoom#addAffectedUsersItem(V4User)}
   */
  @Test
  @DisplayName(
      "Test addAffectedUsersItem(V4User); given V4UserRequestedToJoinRoom (default constructor) affectedUsers ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "V4UserRequestedToJoinRoom V4UserRequestedToJoinRoom.addAffectedUsersItem(V4User)"
  })
  void testAddAffectedUsersItem_givenV4UserRequestedToJoinRoomAffectedUsersArrayList() {
    // Arrange
    V4UserRequestedToJoinRoom v4UserRequestedToJoinRoom = new V4UserRequestedToJoinRoom();
    v4UserRequestedToJoinRoom.affectedUsers(new ArrayList<>());

    // Act and Assert
    assertSame(
        v4UserRequestedToJoinRoom, v4UserRequestedToJoinRoom.addAffectedUsersItem(new V4User()));
  }

  /**
   * Test {@link V4UserRequestedToJoinRoom#equals(Object)}, and {@link
   * V4UserRequestedToJoinRoom#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4UserRequestedToJoinRoom#equals(Object)}
   *   <li>{@link V4UserRequestedToJoinRoom#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4UserRequestedToJoinRoom.equals(Object)",
    "int V4UserRequestedToJoinRoom.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4UserRequestedToJoinRoom v4UserRequestedToJoinRoom = new V4UserRequestedToJoinRoom();
    V4UserRequestedToJoinRoom v4UserRequestedToJoinRoom2 = new V4UserRequestedToJoinRoom();

    // Act and Assert
    assertEquals(v4UserRequestedToJoinRoom, v4UserRequestedToJoinRoom2);
    int expectedHashCodeResult = v4UserRequestedToJoinRoom.hashCode();
    assertEquals(expectedHashCodeResult, v4UserRequestedToJoinRoom2.hashCode());
  }

  /**
   * Test {@link V4UserRequestedToJoinRoom#equals(Object)}, and {@link
   * V4UserRequestedToJoinRoom#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4UserRequestedToJoinRoom#equals(Object)}
   *   <li>{@link V4UserRequestedToJoinRoom#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4UserRequestedToJoinRoom.equals(Object)",
    "int V4UserRequestedToJoinRoom.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4UserRequestedToJoinRoom v4UserRequestedToJoinRoom = new V4UserRequestedToJoinRoom();

    // Act and Assert
    assertEquals(v4UserRequestedToJoinRoom, v4UserRequestedToJoinRoom);
    int expectedHashCodeResult = v4UserRequestedToJoinRoom.hashCode();
    assertEquals(expectedHashCodeResult, v4UserRequestedToJoinRoom.hashCode());
  }

  /**
   * Test {@link V4UserRequestedToJoinRoom#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4UserRequestedToJoinRoom#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4UserRequestedToJoinRoom.equals(Object)",
    "int V4UserRequestedToJoinRoom.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V4UserRequestedToJoinRoom v4UserRequestedToJoinRoom = new V4UserRequestedToJoinRoom();
    v4UserRequestedToJoinRoom.addAffectedUsersItem(new V4User());

    // Act and Assert
    assertNotEquals(v4UserRequestedToJoinRoom, new V4UserRequestedToJoinRoom());
  }

  /**
   * Test {@link V4UserRequestedToJoinRoom#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4UserRequestedToJoinRoom#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4UserRequestedToJoinRoom.equals(Object)",
    "int V4UserRequestedToJoinRoom.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V4UserRequestedToJoinRoom v4UserRequestedToJoinRoom = new V4UserRequestedToJoinRoom();
    v4UserRequestedToJoinRoom.stream(new V4Stream());
    v4UserRequestedToJoinRoom.addAffectedUsersItem(new V4User());

    // Act and Assert
    assertNotEquals(v4UserRequestedToJoinRoom, new V4UserRequestedToJoinRoom());
  }

  /**
   * Test {@link V4UserRequestedToJoinRoom#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4UserRequestedToJoinRoom#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4UserRequestedToJoinRoom.equals(Object)",
    "int V4UserRequestedToJoinRoom.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4UserRequestedToJoinRoom(), null);
  }

  /**
   * Test {@link V4UserRequestedToJoinRoom#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4UserRequestedToJoinRoom#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4UserRequestedToJoinRoom.equals(Object)",
    "int V4UserRequestedToJoinRoom.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4UserRequestedToJoinRoom(), "Different type to V4UserRequestedToJoinRoom");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V4UserRequestedToJoinRoom}
   *   <li>{@link V4UserRequestedToJoinRoom#affectedUsers(List)}
   *   <li>{@link V4UserRequestedToJoinRoom#setAffectedUsers(List)}
   *   <li>{@link V4UserRequestedToJoinRoom#setStream(V4Stream)}
   *   <li>{@link V4UserRequestedToJoinRoom#stream(V4Stream)}
   *   <li>{@link V4UserRequestedToJoinRoom#toString()}
   *   <li>{@link V4UserRequestedToJoinRoom#getAffectedUsers()}
   *   <li>{@link V4UserRequestedToJoinRoom#getStream()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V4UserRequestedToJoinRoom.<init>()",
    "V4UserRequestedToJoinRoom V4UserRequestedToJoinRoom.affectedUsers(List)",
    "List V4UserRequestedToJoinRoom.getAffectedUsers()",
    "V4Stream V4UserRequestedToJoinRoom.getStream()",
    "void V4UserRequestedToJoinRoom.setAffectedUsers(List)",
    "void V4UserRequestedToJoinRoom.setStream(V4Stream)",
    "V4UserRequestedToJoinRoom V4UserRequestedToJoinRoom.stream(V4Stream)",
    "String V4UserRequestedToJoinRoom.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V4UserRequestedToJoinRoom actualV4UserRequestedToJoinRoom = new V4UserRequestedToJoinRoom();
    V4UserRequestedToJoinRoom actualAffectedUsersResult =
        actualV4UserRequestedToJoinRoom.affectedUsers(new ArrayList<>());
    ArrayList<V4User> affectedUsers = new ArrayList<>();
    actualV4UserRequestedToJoinRoom.setAffectedUsers(affectedUsers);
    actualV4UserRequestedToJoinRoom.setStream(new V4Stream());
    V4Stream stream = new V4Stream();
    V4UserRequestedToJoinRoom actualStreamResult = actualV4UserRequestedToJoinRoom.stream(stream);
    String actualToStringResult = actualV4UserRequestedToJoinRoom.toString();
    List<V4User> actualAffectedUsers = actualV4UserRequestedToJoinRoom.getAffectedUsers();
    V4Stream actualStream = actualV4UserRequestedToJoinRoom.getStream();

    // Assert
    assertEquals(
        "class V4UserRequestedToJoinRoom {\n"
            + "    stream: class V4Stream {\n"
            + "        streamId: null\n"
            + "        streamType: null\n"
            + "        roomName: null\n"
            + "        members: null\n"
            + "        external: null\n"
            + "        crossPod: null\n"
            + "        recipientTenantIds: null\n"
            + "    }\n"
            + "    affectedUsers: []\n"
            + "}",
        actualToStringResult);
    assertTrue(actualAffectedUsers.isEmpty());
    assertSame(stream, actualStream);
    assertSame(actualV4UserRequestedToJoinRoom, actualAffectedUsersResult);
    assertSame(actualV4UserRequestedToJoinRoom, actualStreamResult);
    assertSame(affectedUsers, actualAffectedUsers);
  }
}
