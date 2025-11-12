package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RoomSpecificStreamAttributesDiffblueTest {
  /**
   * Test {@link RoomSpecificStreamAttributes#equals(Object)}, and {@link
   * RoomSpecificStreamAttributes#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RoomSpecificStreamAttributes#equals(Object)}
   *   <li>{@link RoomSpecificStreamAttributes#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomSpecificStreamAttributes.equals(Object)",
    "int RoomSpecificStreamAttributes.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    RoomSpecificStreamAttributes roomSpecificStreamAttributes = new RoomSpecificStreamAttributes();
    RoomSpecificStreamAttributes roomSpecificStreamAttributes2 = new RoomSpecificStreamAttributes();

    // Act and Assert
    assertEquals(roomSpecificStreamAttributes, roomSpecificStreamAttributes2);
    assertEquals(roomSpecificStreamAttributes.hashCode(), roomSpecificStreamAttributes2.hashCode());
  }

  /**
   * Test {@link RoomSpecificStreamAttributes#equals(Object)}, and {@link
   * RoomSpecificStreamAttributes#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RoomSpecificStreamAttributes#equals(Object)}
   *   <li>{@link RoomSpecificStreamAttributes#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomSpecificStreamAttributes.equals(Object)",
    "int RoomSpecificStreamAttributes.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    RoomSpecificStreamAttributes roomSpecificStreamAttributes = new RoomSpecificStreamAttributes();

    // Act and Assert
    assertEquals(roomSpecificStreamAttributes, roomSpecificStreamAttributes);
    int expectedHashCodeResult = roomSpecificStreamAttributes.hashCode();
    assertEquals(expectedHashCodeResult, roomSpecificStreamAttributes.hashCode());
  }

  /**
   * Test {@link RoomSpecificStreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomSpecificStreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomSpecificStreamAttributes.equals(Object)",
    "int RoomSpecificStreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomSpecificStreamAttributes(), null);
  }

  /**
   * Test {@link RoomSpecificStreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomSpecificStreamAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomSpecificStreamAttributes.equals(Object)",
    "int RoomSpecificStreamAttributes.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new RoomSpecificStreamAttributes(), "Different type to RoomSpecificStreamAttributes");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link RoomSpecificStreamAttributes}
   *   <li>{@link RoomSpecificStreamAttributes#name(String)}
   *   <li>{@link RoomSpecificStreamAttributes#setName(String)}
   *   <li>{@link RoomSpecificStreamAttributes#toString()}
   *   <li>{@link RoomSpecificStreamAttributes#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RoomSpecificStreamAttributes.<init>()",
    "String RoomSpecificStreamAttributes.getName()",
    "RoomSpecificStreamAttributes RoomSpecificStreamAttributes.name(String)",
    "void RoomSpecificStreamAttributes.setName(String)",
    "String RoomSpecificStreamAttributes.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    RoomSpecificStreamAttributes actualRoomSpecificStreamAttributes =
        new RoomSpecificStreamAttributes();
    RoomSpecificStreamAttributes actualNameResult = actualRoomSpecificStreamAttributes.name("Name");
    actualRoomSpecificStreamAttributes.setName("Name");
    String actualToStringResult = actualRoomSpecificStreamAttributes.toString();

    // Assert
    assertEquals("Name", actualRoomSpecificStreamAttributes.getName());
    assertEquals("class RoomSpecificStreamAttributes {\n    name: Name\n}", actualToStringResult);
    assertSame(actualRoomSpecificStreamAttributes, actualNameResult);
  }
}
