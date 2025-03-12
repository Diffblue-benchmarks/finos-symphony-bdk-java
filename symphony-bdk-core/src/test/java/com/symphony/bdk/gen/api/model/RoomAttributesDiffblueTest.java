package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RoomAttributesDiffblueTest {
  /**
   * Test {@link RoomAttributes#equals(Object)}, and {@link RoomAttributes#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link RoomAttributes#equals(Object)}
   *   <li>{@link RoomAttributes#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomAttributes.equals(Object)", "int RoomAttributes.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    RoomAttributes roomAttributes = new RoomAttributes();
    RoomAttributes roomAttributes2 = new RoomAttributes();

    // Act and Assert
    assertEquals(roomAttributes, roomAttributes2);
    int expectedHashCodeResult = roomAttributes.hashCode();
    assertEquals(expectedHashCodeResult, roomAttributes2.hashCode());
  }

  /**
   * Test {@link RoomAttributes#equals(Object)}, and {@link RoomAttributes#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link RoomAttributes#equals(Object)}
   *   <li>{@link RoomAttributes#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomAttributes.equals(Object)", "int RoomAttributes.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    RoomAttributes roomAttributes = new RoomAttributes();

    // Act and Assert
    assertEquals(roomAttributes, roomAttributes);
    int expectedHashCodeResult = roomAttributes.hashCode();
    assertEquals(expectedHashCodeResult, roomAttributes.hashCode());
  }

  /**
   * Test {@link RoomAttributes#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomAttributes.equals(Object)", "int RoomAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomAttributes(), 1);
  }

  /**
   * Test {@link RoomAttributes#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomAttributes.equals(Object)", "int RoomAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    RoomAttributes roomAttributes = new RoomAttributes();
    roomAttributes.name("Name");

    // Act and Assert
    assertNotEquals(roomAttributes, new RoomAttributes());
  }

  /**
   * Test {@link RoomAttributes#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomAttributes.equals(Object)", "int RoomAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    RoomAttributes roomAttributes = new RoomAttributes();
    roomAttributes.description("The characteristics of someone or something");

    // Act and Assert
    assertNotEquals(roomAttributes, new RoomAttributes());
  }

  /**
   * Test {@link RoomAttributes#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomAttributes.equals(Object)", "int RoomAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    RoomAttributes roomAttributes = new RoomAttributes();
    roomAttributes.membersCanInvite(true);

    // Act and Assert
    assertNotEquals(roomAttributes, new RoomAttributes());
  }

  /**
   * Test {@link RoomAttributes#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomAttributes.equals(Object)", "int RoomAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    RoomAttributes roomAttributes = new RoomAttributes();
    roomAttributes.discoverable(true);

    // Act and Assert
    assertNotEquals(roomAttributes, new RoomAttributes());
  }

  /**
   * Test {@link RoomAttributes#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomAttributes.equals(Object)", "int RoomAttributes.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomAttributes(), null);
  }

  /**
   * Test {@link RoomAttributes#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomAttributes.equals(Object)", "int RoomAttributes.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomAttributes(), "Different type to RoomAttributes");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link RoomAttributes}
   *   <li>{@link RoomAttributes#description(String)}
   *   <li>{@link RoomAttributes#discoverable(Boolean)}
   *   <li>{@link RoomAttributes#membersCanInvite(Boolean)}
   *   <li>{@link RoomAttributes#name(String)}
   *   <li>{@link RoomAttributes#setDescription(String)}
   *   <li>{@link RoomAttributes#setDiscoverable(Boolean)}
   *   <li>{@link RoomAttributes#setMembersCanInvite(Boolean)}
   *   <li>{@link RoomAttributes#setName(String)}
   *   <li>{@link RoomAttributes#toString()}
   *   <li>{@link RoomAttributes#getDescription()}
   *   <li>{@link RoomAttributes#getDiscoverable()}
   *   <li>{@link RoomAttributes#getMembersCanInvite()}
   *   <li>{@link RoomAttributes#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void RoomAttributes.<init>()", "RoomAttributes RoomAttributes.description(String)",
      "RoomAttributes RoomAttributes.discoverable(Boolean)", "String RoomAttributes.getDescription()",
      "Boolean RoomAttributes.getDiscoverable()", "Boolean RoomAttributes.getMembersCanInvite()",
      "String RoomAttributes.getName()", "RoomAttributes RoomAttributes.membersCanInvite(Boolean)",
      "RoomAttributes RoomAttributes.name(String)", "void RoomAttributes.setDescription(String)",
      "void RoomAttributes.setDiscoverable(Boolean)", "void RoomAttributes.setMembersCanInvite(Boolean)",
      "void RoomAttributes.setName(String)", "String RoomAttributes.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    RoomAttributes actualRoomAttributes = new RoomAttributes();
    RoomAttributes actualDescriptionResult = actualRoomAttributes
        .description("The characteristics of someone or something");
    RoomAttributes actualDiscoverableResult = actualRoomAttributes.discoverable(true);
    RoomAttributes actualMembersCanInviteResult = actualRoomAttributes.membersCanInvite(true);
    RoomAttributes actualNameResult = actualRoomAttributes.name("Name");
    actualRoomAttributes.setDescription("The characteristics of someone or something");
    actualRoomAttributes.setDiscoverable(true);
    actualRoomAttributes.setMembersCanInvite(true);
    actualRoomAttributes.setName("Name");
    String actualToStringResult = actualRoomAttributes.toString();
    String actualDescription = actualRoomAttributes.getDescription();
    Boolean actualDiscoverable = actualRoomAttributes.getDiscoverable();
    Boolean actualMembersCanInvite = actualRoomAttributes.getMembersCanInvite();

    // Assert
    assertEquals("Name", actualRoomAttributes.getName());
    assertEquals("The characteristics of someone or something", actualDescription);
    assertEquals("class RoomAttributes {\n" + "    name: Name\n"
        + "    description: The characteristics of someone or something\n" + "    membersCanInvite: true\n"
        + "    discoverable: true\n" + "}", actualToStringResult);
    assertTrue(actualDiscoverable);
    assertTrue(actualMembersCanInvite);
    assertSame(actualRoomAttributes, actualDescriptionResult);
    assertSame(actualRoomAttributes, actualDiscoverableResult);
    assertSame(actualRoomAttributes, actualMembersCanInviteResult);
    assertSame(actualRoomAttributes, actualNameResult);
  }
}
