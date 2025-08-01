package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V4RoomUpdatedDiffblueTest {
  /**
   * Test {@link V4RoomUpdated#equals(Object)}, and {@link V4RoomUpdated#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4RoomUpdated#equals(Object)}
   *   <li>{@link V4RoomUpdated#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4RoomUpdated.equals(Object)", "int V4RoomUpdated.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4RoomUpdated v4RoomUpdated = new V4RoomUpdated();
    V4RoomUpdated v4RoomUpdated2 = new V4RoomUpdated();

    // Act and Assert
    assertEquals(v4RoomUpdated, v4RoomUpdated2);
    int expectedHashCodeResult = v4RoomUpdated.hashCode();
    assertEquals(expectedHashCodeResult, v4RoomUpdated2.hashCode());
  }

  /**
   * Test {@link V4RoomUpdated#equals(Object)}, and {@link V4RoomUpdated#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4RoomUpdated#equals(Object)}
   *   <li>{@link V4RoomUpdated#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4RoomUpdated.equals(Object)", "int V4RoomUpdated.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4RoomUpdated v4RoomUpdated = new V4RoomUpdated();

    // Act and Assert
    assertEquals(v4RoomUpdated, v4RoomUpdated);
    int expectedHashCodeResult = v4RoomUpdated.hashCode();
    assertEquals(expectedHashCodeResult, v4RoomUpdated.hashCode());
  }

  /**
   * Test {@link V4RoomUpdated#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4RoomUpdated#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4RoomUpdated.equals(Object)", "int V4RoomUpdated.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4RoomUpdated(), 1);
  }

  /**
   * Test {@link V4RoomUpdated#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4RoomUpdated#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4RoomUpdated.equals(Object)", "int V4RoomUpdated.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V4RoomUpdated v4RoomUpdated = new V4RoomUpdated();
    v4RoomUpdated.stream(new V4Stream());

    // Act and Assert
    assertNotEquals(v4RoomUpdated, new V4RoomUpdated());
  }

  /**
   * Test {@link V4RoomUpdated#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4RoomUpdated#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4RoomUpdated.equals(Object)", "int V4RoomUpdated.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V4RoomUpdated v4RoomUpdated = new V4RoomUpdated();
    v4RoomUpdated.newRoomProperties(new V4RoomProperties());

    // Act and Assert
    assertNotEquals(v4RoomUpdated, new V4RoomUpdated());
  }

  /**
   * Test {@link V4RoomUpdated#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4RoomUpdated#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4RoomUpdated.equals(Object)", "int V4RoomUpdated.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4RoomUpdated(), null);
  }

  /**
   * Test {@link V4RoomUpdated#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4RoomUpdated#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4RoomUpdated.equals(Object)", "int V4RoomUpdated.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4RoomUpdated(), "Different type to V4RoomUpdated");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V4RoomUpdated}
   *   <li>{@link V4RoomUpdated#newRoomProperties(V4RoomProperties)}
   *   <li>{@link V4RoomUpdated#setNewRoomProperties(V4RoomProperties)}
   *   <li>{@link V4RoomUpdated#setStream(V4Stream)}
   *   <li>{@link V4RoomUpdated#stream(V4Stream)}
   *   <li>{@link V4RoomUpdated#toString()}
   *   <li>{@link V4RoomUpdated#getNewRoomProperties()}
   *   <li>{@link V4RoomUpdated#getStream()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V4RoomUpdated.<init>()",
    "V4RoomProperties V4RoomUpdated.getNewRoomProperties()",
    "V4Stream V4RoomUpdated.getStream()",
    "V4RoomUpdated V4RoomUpdated.newRoomProperties(V4RoomProperties)",
    "void V4RoomUpdated.setNewRoomProperties(V4RoomProperties)",
    "void V4RoomUpdated.setStream(V4Stream)",
    "V4RoomUpdated V4RoomUpdated.stream(V4Stream)",
    "String V4RoomUpdated.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V4RoomUpdated actualV4RoomUpdated = new V4RoomUpdated();
    V4RoomUpdated actualNewRoomPropertiesResult =
        actualV4RoomUpdated.newRoomProperties(new V4RoomProperties());
    V4RoomProperties newRoomProperties = new V4RoomProperties();
    actualV4RoomUpdated.setNewRoomProperties(newRoomProperties);
    actualV4RoomUpdated.setStream(new V4Stream());
    V4Stream stream = new V4Stream();
    V4RoomUpdated actualStreamResult = actualV4RoomUpdated.stream(stream);
    String actualToStringResult = actualV4RoomUpdated.toString();
    V4RoomProperties actualNewRoomProperties = actualV4RoomUpdated.getNewRoomProperties();

    // Assert
    assertEquals(
        "class V4RoomUpdated {\n"
            + "    stream: class V4Stream {\n"
            + "        streamId: null\n"
            + "        streamType: null\n"
            + "        roomName: null\n"
            + "        members: null\n"
            + "        external: null\n"
            + "        crossPod: null\n"
            + "        recipientTenantIds: null\n"
            + "    }\n"
            + "    newRoomProperties: class V4RoomProperties {\n"
            + "        name: null\n"
            + "        description: null\n"
            + "        creatorUser: null\n"
            + "        createdDate: null\n"
            + "        external: null\n"
            + "        crossPod: null\n"
            + "        _public: null\n"
            + "        copyProtected: null\n"
            + "        readOnly: null\n"
            + "        discoverable: null\n"
            + "        membersCanInvite: null\n"
            + "        keywords: null\n"
            + "        canViewHistory: null\n"
            + "    }\n"
            + "}",
        actualToStringResult);
    assertSame(newRoomProperties, actualNewRoomProperties);
    assertSame(actualV4RoomUpdated, actualNewRoomPropertiesResult);
    assertSame(actualV4RoomUpdated, actualStreamResult);
    assertSame(stream, actualV4RoomUpdated.getStream());
  }
}
