package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V4UserLeftRoomDiffblueTest {
  /**
   * Test {@link V4UserLeftRoom#equals(Object)}, and {@link V4UserLeftRoom#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4UserLeftRoom#equals(Object)}
   *   <li>{@link V4UserLeftRoom#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4UserLeftRoom.equals(Object)", "int V4UserLeftRoom.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4UserLeftRoom v4UserLeftRoom = new V4UserLeftRoom();
    V4UserLeftRoom v4UserLeftRoom2 = new V4UserLeftRoom();

    // Act and Assert
    assertEquals(v4UserLeftRoom, v4UserLeftRoom2);
    int expectedHashCodeResult = v4UserLeftRoom.hashCode();
    assertEquals(expectedHashCodeResult, v4UserLeftRoom2.hashCode());
  }

  /**
   * Test {@link V4UserLeftRoom#equals(Object)}, and {@link V4UserLeftRoom#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4UserLeftRoom#equals(Object)}
   *   <li>{@link V4UserLeftRoom#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4UserLeftRoom.equals(Object)", "int V4UserLeftRoom.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4UserLeftRoom v4UserLeftRoom = new V4UserLeftRoom();

    // Act and Assert
    assertEquals(v4UserLeftRoom, v4UserLeftRoom);
    int expectedHashCodeResult = v4UserLeftRoom.hashCode();
    assertEquals(expectedHashCodeResult, v4UserLeftRoom.hashCode());
  }

  /**
   * Test {@link V4UserLeftRoom#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4UserLeftRoom#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4UserLeftRoom.equals(Object)", "int V4UserLeftRoom.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4UserLeftRoom(), 1);
  }

  /**
   * Test {@link V4UserLeftRoom#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4UserLeftRoom#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4UserLeftRoom.equals(Object)", "int V4UserLeftRoom.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V4UserLeftRoom v4UserLeftRoom = new V4UserLeftRoom();
    v4UserLeftRoom.stream(new V4Stream());

    // Act and Assert
    assertNotEquals(v4UserLeftRoom, new V4UserLeftRoom());
  }

  /**
   * Test {@link V4UserLeftRoom#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4UserLeftRoom#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4UserLeftRoom.equals(Object)", "int V4UserLeftRoom.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V4UserLeftRoom v4UserLeftRoom = new V4UserLeftRoom();
    v4UserLeftRoom.affectedUser(new V4User());

    // Act and Assert
    assertNotEquals(v4UserLeftRoom, new V4UserLeftRoom());
  }

  /**
   * Test {@link V4UserLeftRoom#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4UserLeftRoom#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4UserLeftRoom.equals(Object)", "int V4UserLeftRoom.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4UserLeftRoom(), null);
  }

  /**
   * Test {@link V4UserLeftRoom#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4UserLeftRoom#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4UserLeftRoom.equals(Object)", "int V4UserLeftRoom.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4UserLeftRoom(), "Different type to V4UserLeftRoom");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V4UserLeftRoom}
   *   <li>{@link V4UserLeftRoom#affectedUser(V4User)}
   *   <li>{@link V4UserLeftRoom#setAffectedUser(V4User)}
   *   <li>{@link V4UserLeftRoom#setStream(V4Stream)}
   *   <li>{@link V4UserLeftRoom#stream(V4Stream)}
   *   <li>{@link V4UserLeftRoom#toString()}
   *   <li>{@link V4UserLeftRoom#getAffectedUser()}
   *   <li>{@link V4UserLeftRoom#getStream()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V4UserLeftRoom.<init>()", "V4UserLeftRoom V4UserLeftRoom.affectedUser(V4User)",
      "V4User V4UserLeftRoom.getAffectedUser()", "V4Stream V4UserLeftRoom.getStream()",
      "void V4UserLeftRoom.setAffectedUser(V4User)", "void V4UserLeftRoom.setStream(V4Stream)",
      "V4UserLeftRoom V4UserLeftRoom.stream(V4Stream)", "String V4UserLeftRoom.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    V4UserLeftRoom actualV4UserLeftRoom = new V4UserLeftRoom();
    V4UserLeftRoom actualAffectedUserResult = actualV4UserLeftRoom.affectedUser(new V4User());
    V4User affectedUser = new V4User();
    actualV4UserLeftRoom.setAffectedUser(affectedUser);
    actualV4UserLeftRoom.setStream(new V4Stream());
    V4Stream stream = new V4Stream();
    V4UserLeftRoom actualStreamResult = actualV4UserLeftRoom.stream(stream);
    String actualToStringResult = actualV4UserLeftRoom.toString();
    V4User actualAffectedUser = actualV4UserLeftRoom.getAffectedUser();

    // Assert
    assertEquals("class V4UserLeftRoom {\n" + "    stream: class V4Stream {\n" + "        streamId: null\n"
        + "        streamType: null\n" + "        roomName: null\n" + "        members: null\n"
        + "        external: null\n" + "        crossPod: null\n" + "        recipientTenantIds: null\n" + "    }\n"
        + "    affectedUser: class V4User {\n" + "        userId: null\n" + "        firstName: null\n"
        + "        lastName: null\n" + "        displayName: null\n" + "        email: null\n"
        + "        username: null\n" + "    }\n" + "}", actualToStringResult);
    assertSame(stream, actualV4UserLeftRoom.getStream());
    assertSame(affectedUser, actualAffectedUser);
    assertSame(actualV4UserLeftRoom, actualAffectedUserResult);
    assertSame(actualV4UserLeftRoom, actualStreamResult);
  }
}
