package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V4RoomCreatedDiffblueTest {
  /**
   * Test {@link V4RoomCreated#equals(Object)}, and {@link V4RoomCreated#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4RoomCreated#equals(Object)}
   *   <li>{@link V4RoomCreated#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4RoomCreated.equals(Object)", "int V4RoomCreated.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4RoomCreated v4RoomCreated = new V4RoomCreated();
    V4RoomCreated v4RoomCreated2 = new V4RoomCreated();

    // Act and Assert
    assertEquals(v4RoomCreated, v4RoomCreated2);
    int expectedHashCodeResult = v4RoomCreated.hashCode();
    assertEquals(expectedHashCodeResult, v4RoomCreated2.hashCode());
  }

  /**
   * Test {@link V4RoomCreated#equals(Object)}, and {@link V4RoomCreated#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4RoomCreated#equals(Object)}
   *   <li>{@link V4RoomCreated#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4RoomCreated.equals(Object)", "int V4RoomCreated.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4RoomCreated v4RoomCreated = new V4RoomCreated();

    // Act and Assert
    assertEquals(v4RoomCreated, v4RoomCreated);
    int expectedHashCodeResult = v4RoomCreated.hashCode();
    assertEquals(expectedHashCodeResult, v4RoomCreated.hashCode());
  }

  /**
   * Test {@link V4RoomCreated#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4RoomCreated#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4RoomCreated.equals(Object)", "int V4RoomCreated.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4RoomCreated(), 1);
  }

  /**
   * Test {@link V4RoomCreated#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4RoomCreated#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4RoomCreated.equals(Object)", "int V4RoomCreated.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V4RoomCreated v4RoomCreated = new V4RoomCreated();
    v4RoomCreated.stream(new V4Stream());

    // Act and Assert
    assertNotEquals(v4RoomCreated, new V4RoomCreated());
  }

  /**
   * Test {@link V4RoomCreated#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4RoomCreated#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4RoomCreated.equals(Object)", "int V4RoomCreated.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V4RoomCreated v4RoomCreated = new V4RoomCreated();
    v4RoomCreated.roomProperties(new V4RoomProperties());

    // Act and Assert
    assertNotEquals(v4RoomCreated, new V4RoomCreated());
  }

  /**
   * Test {@link V4RoomCreated#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4RoomCreated#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4RoomCreated.equals(Object)", "int V4RoomCreated.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4RoomCreated(), null);
  }

  /**
   * Test {@link V4RoomCreated#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4RoomCreated#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4RoomCreated.equals(Object)", "int V4RoomCreated.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4RoomCreated(), "Different type to V4RoomCreated");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V4RoomCreated}
   *   <li>{@link V4RoomCreated#roomProperties(V4RoomProperties)}
   *   <li>{@link V4RoomCreated#setRoomProperties(V4RoomProperties)}
   *   <li>{@link V4RoomCreated#setStream(V4Stream)}
   *   <li>{@link V4RoomCreated#stream(V4Stream)}
   *   <li>{@link V4RoomCreated#toString()}
   *   <li>{@link V4RoomCreated#getRoomProperties()}
   *   <li>{@link V4RoomCreated#getStream()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V4RoomCreated.<init>()", "V4RoomProperties V4RoomCreated.getRoomProperties()",
      "V4Stream V4RoomCreated.getStream()", "V4RoomCreated V4RoomCreated.roomProperties(V4RoomProperties)",
      "void V4RoomCreated.setRoomProperties(V4RoomProperties)", "void V4RoomCreated.setStream(V4Stream)",
      "V4RoomCreated V4RoomCreated.stream(V4Stream)", "String V4RoomCreated.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    V4RoomCreated actualV4RoomCreated = new V4RoomCreated();
    V4RoomCreated actualRoomPropertiesResult = actualV4RoomCreated.roomProperties(new V4RoomProperties());
    V4RoomProperties roomProperties = new V4RoomProperties();
    actualV4RoomCreated.setRoomProperties(roomProperties);
    actualV4RoomCreated.setStream(new V4Stream());
    V4Stream stream = new V4Stream();
    V4RoomCreated actualStreamResult = actualV4RoomCreated.stream(stream);
    String actualToStringResult = actualV4RoomCreated.toString();
    V4RoomProperties actualRoomProperties = actualV4RoomCreated.getRoomProperties();

    // Assert
    assertEquals("class V4RoomCreated {\n" + "    stream: class V4Stream {\n" + "        streamId: null\n"
        + "        streamType: null\n" + "        roomName: null\n" + "        members: null\n"
        + "        external: null\n" + "        crossPod: null\n" + "        recipientTenantIds: null\n" + "    }\n"
        + "    roomProperties: class V4RoomProperties {\n" + "        name: null\n" + "        description: null\n"
        + "        creatorUser: null\n" + "        createdDate: null\n" + "        external: null\n"
        + "        crossPod: null\n" + "        _public: null\n" + "        copyProtected: null\n"
        + "        readOnly: null\n" + "        discoverable: null\n" + "        membersCanInvite: null\n"
        + "        keywords: null\n" + "        canViewHistory: null\n" + "    }\n" + "}", actualToStringResult);
    assertSame(actualV4RoomCreated, actualRoomPropertiesResult);
    assertSame(actualV4RoomCreated, actualStreamResult);
    assertSame(roomProperties, actualRoomProperties);
    assertSame(stream, actualV4RoomCreated.getStream());
  }
}
