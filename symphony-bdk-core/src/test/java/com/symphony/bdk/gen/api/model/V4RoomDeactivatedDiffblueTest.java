package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V4RoomDeactivatedDiffblueTest {
  /**
   * Test {@link V4RoomDeactivated#equals(Object)}, and {@link V4RoomDeactivated#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4RoomDeactivated#equals(Object)}
   *   <li>{@link V4RoomDeactivated#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4RoomDeactivated.equals(Object)",
    "int V4RoomDeactivated.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4RoomDeactivated v4RoomDeactivated = new V4RoomDeactivated();
    V4RoomDeactivated v4RoomDeactivated2 = new V4RoomDeactivated();

    // Act and Assert
    assertEquals(v4RoomDeactivated, v4RoomDeactivated2);
    int expectedHashCodeResult = v4RoomDeactivated.hashCode();
    assertEquals(expectedHashCodeResult, v4RoomDeactivated2.hashCode());
  }

  /**
   * Test {@link V4RoomDeactivated#equals(Object)}, and {@link V4RoomDeactivated#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4RoomDeactivated#equals(Object)}
   *   <li>{@link V4RoomDeactivated#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4RoomDeactivated.equals(Object)",
    "int V4RoomDeactivated.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4RoomDeactivated v4RoomDeactivated = new V4RoomDeactivated();

    // Act and Assert
    assertEquals(v4RoomDeactivated, v4RoomDeactivated);
    int expectedHashCodeResult = v4RoomDeactivated.hashCode();
    assertEquals(expectedHashCodeResult, v4RoomDeactivated.hashCode());
  }

  /**
   * Test {@link V4RoomDeactivated#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4RoomDeactivated#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4RoomDeactivated.equals(Object)",
    "int V4RoomDeactivated.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4RoomDeactivated(), null);
  }

  /**
   * Test {@link V4RoomDeactivated#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4RoomDeactivated#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4RoomDeactivated.equals(Object)",
    "int V4RoomDeactivated.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4RoomDeactivated(), "Different type to V4RoomDeactivated");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V4RoomDeactivated}
   *   <li>{@link V4RoomDeactivated#setStream(V4Stream)}
   *   <li>{@link V4RoomDeactivated#stream(V4Stream)}
   *   <li>{@link V4RoomDeactivated#toString()}
   *   <li>{@link V4RoomDeactivated#getStream()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V4RoomDeactivated.<init>()",
    "V4Stream V4RoomDeactivated.getStream()",
    "void V4RoomDeactivated.setStream(V4Stream)",
    "V4RoomDeactivated V4RoomDeactivated.stream(V4Stream)",
    "String V4RoomDeactivated.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V4RoomDeactivated actualV4RoomDeactivated = new V4RoomDeactivated();
    actualV4RoomDeactivated.setStream(new V4Stream());
    V4Stream stream = new V4Stream();
    V4RoomDeactivated actualStreamResult = actualV4RoomDeactivated.stream(stream);
    String actualToStringResult = actualV4RoomDeactivated.toString();

    // Assert
    assertEquals(
        "class V4RoomDeactivated {\n"
            + "    stream: class V4Stream {\n"
            + "        streamId: null\n"
            + "        streamType: null\n"
            + "        roomName: null\n"
            + "        members: null\n"
            + "        external: null\n"
            + "        crossPod: null\n"
            + "        recipientTenantIds: null\n"
            + "    }\n"
            + "}",
        actualToStringResult);
    assertSame(actualV4RoomDeactivated, actualStreamResult);
    assertSame(stream, actualV4RoomDeactivated.getStream());
  }
}
