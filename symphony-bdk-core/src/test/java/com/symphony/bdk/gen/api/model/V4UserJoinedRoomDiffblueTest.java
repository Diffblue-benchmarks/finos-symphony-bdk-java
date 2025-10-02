package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V4UserJoinedRoomDiffblueTest {
  /**
   * Test {@link V4UserJoinedRoom#equals(Object)}, and {@link V4UserJoinedRoom#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4UserJoinedRoom#equals(Object)}
   *   <li>{@link V4UserJoinedRoom#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4UserJoinedRoom.equals(Object)", "int V4UserJoinedRoom.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4UserJoinedRoom v4UserJoinedRoom = new V4UserJoinedRoom();
    V4UserJoinedRoom v4UserJoinedRoom2 = new V4UserJoinedRoom();

    // Act and Assert
    assertEquals(v4UserJoinedRoom, v4UserJoinedRoom2);
    assertEquals(v4UserJoinedRoom.hashCode(), v4UserJoinedRoom2.hashCode());
  }

  /**
   * Test {@link V4UserJoinedRoom#equals(Object)}, and {@link V4UserJoinedRoom#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4UserJoinedRoom#equals(Object)}
   *   <li>{@link V4UserJoinedRoom#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4UserJoinedRoom.equals(Object)", "int V4UserJoinedRoom.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4UserJoinedRoom v4UserJoinedRoom = new V4UserJoinedRoom();

    // Act and Assert
    assertEquals(v4UserJoinedRoom, v4UserJoinedRoom);
    int expectedHashCodeResult = v4UserJoinedRoom.hashCode();
    assertEquals(expectedHashCodeResult, v4UserJoinedRoom.hashCode());
  }

  /**
   * Test {@link V4UserJoinedRoom#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4UserJoinedRoom#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4UserJoinedRoom.equals(Object)", "int V4UserJoinedRoom.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4UserJoinedRoom(), 1);
  }

  /**
   * Test {@link V4UserJoinedRoom#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4UserJoinedRoom#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4UserJoinedRoom.equals(Object)", "int V4UserJoinedRoom.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V4UserJoinedRoom v4UserJoinedRoom = new V4UserJoinedRoom();
    v4UserJoinedRoom.stream(new V4Stream());

    // Act and Assert
    assertNotEquals(v4UserJoinedRoom, new V4UserJoinedRoom());
  }

  /**
   * Test {@link V4UserJoinedRoom#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4UserJoinedRoom#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4UserJoinedRoom.equals(Object)", "int V4UserJoinedRoom.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V4UserJoinedRoom v4UserJoinedRoom = new V4UserJoinedRoom();
    v4UserJoinedRoom.affectedUser(new V4User());

    // Act and Assert
    assertNotEquals(v4UserJoinedRoom, new V4UserJoinedRoom());
  }

  /**
   * Test {@link V4UserJoinedRoom#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4UserJoinedRoom#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4UserJoinedRoom.equals(Object)", "int V4UserJoinedRoom.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4UserJoinedRoom(), null);
  }

  /**
   * Test {@link V4UserJoinedRoom#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4UserJoinedRoom#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4UserJoinedRoom.equals(Object)", "int V4UserJoinedRoom.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4UserJoinedRoom(), "Different type to V4UserJoinedRoom");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V4UserJoinedRoom}
   *   <li>{@link V4UserJoinedRoom#affectedUser(V4User)}
   *   <li>{@link V4UserJoinedRoom#setAffectedUser(V4User)}
   *   <li>{@link V4UserJoinedRoom#setStream(V4Stream)}
   *   <li>{@link V4UserJoinedRoom#stream(V4Stream)}
   *   <li>{@link V4UserJoinedRoom#toString()}
   *   <li>{@link V4UserJoinedRoom#getAffectedUser()}
   *   <li>{@link V4UserJoinedRoom#getStream()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V4UserJoinedRoom.<init>()",
    "V4UserJoinedRoom V4UserJoinedRoom.affectedUser(V4User)",
    "V4User V4UserJoinedRoom.getAffectedUser()",
    "V4Stream V4UserJoinedRoom.getStream()",
    "void V4UserJoinedRoom.setAffectedUser(V4User)",
    "void V4UserJoinedRoom.setStream(V4Stream)",
    "V4UserJoinedRoom V4UserJoinedRoom.stream(V4Stream)",
    "String V4UserJoinedRoom.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V4UserJoinedRoom actualV4UserJoinedRoom = new V4UserJoinedRoom();
    V4UserJoinedRoom actualAffectedUserResult = actualV4UserJoinedRoom.affectedUser(new V4User());
    V4User affectedUser = new V4User();
    actualV4UserJoinedRoom.setAffectedUser(affectedUser);
    actualV4UserJoinedRoom.setStream(new V4Stream());
    V4Stream stream = new V4Stream();
    V4UserJoinedRoom actualStreamResult = actualV4UserJoinedRoom.stream(stream);
    String actualToStringResult = actualV4UserJoinedRoom.toString();
    V4User actualAffectedUser = actualV4UserJoinedRoom.getAffectedUser();

    // Assert
    assertEquals(
        "class V4UserJoinedRoom {\n"
            + "    stream: class V4Stream {\n"
            + "        streamId: null\n"
            + "        streamType: null\n"
            + "        roomName: null\n"
            + "        members: null\n"
            + "        external: null\n"
            + "        crossPod: null\n"
            + "        recipientTenantIds: null\n"
            + "    }\n"
            + "    affectedUser: class V4User {\n"
            + "        userId: null\n"
            + "        firstName: null\n"
            + "        lastName: null\n"
            + "        displayName: null\n"
            + "        email: null\n"
            + "        username: null\n"
            + "    }\n"
            + "}",
        actualToStringResult);
    assertSame(stream, actualV4UserJoinedRoom.getStream());
    assertSame(affectedUser, actualAffectedUser);
    assertSame(actualV4UserJoinedRoom, actualAffectedUserResult);
    assertSame(actualV4UserJoinedRoom, actualStreamResult);
  }
}
