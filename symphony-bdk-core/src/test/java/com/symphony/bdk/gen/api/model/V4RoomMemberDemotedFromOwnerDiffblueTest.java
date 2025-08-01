package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V4RoomMemberDemotedFromOwnerDiffblueTest {
  /**
   * Test {@link V4RoomMemberDemotedFromOwner#equals(Object)}, and {@link
   * V4RoomMemberDemotedFromOwner#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4RoomMemberDemotedFromOwner#equals(Object)}
   *   <li>{@link V4RoomMemberDemotedFromOwner#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4RoomMemberDemotedFromOwner.equals(Object)",
    "int V4RoomMemberDemotedFromOwner.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4RoomMemberDemotedFromOwner v4RoomMemberDemotedFromOwner = new V4RoomMemberDemotedFromOwner();
    V4RoomMemberDemotedFromOwner v4RoomMemberDemotedFromOwner2 = new V4RoomMemberDemotedFromOwner();

    // Act and Assert
    assertEquals(v4RoomMemberDemotedFromOwner, v4RoomMemberDemotedFromOwner2);
    int expectedHashCodeResult = v4RoomMemberDemotedFromOwner.hashCode();
    assertEquals(expectedHashCodeResult, v4RoomMemberDemotedFromOwner2.hashCode());
  }

  /**
   * Test {@link V4RoomMemberDemotedFromOwner#equals(Object)}, and {@link
   * V4RoomMemberDemotedFromOwner#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4RoomMemberDemotedFromOwner#equals(Object)}
   *   <li>{@link V4RoomMemberDemotedFromOwner#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4RoomMemberDemotedFromOwner.equals(Object)",
    "int V4RoomMemberDemotedFromOwner.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4RoomMemberDemotedFromOwner v4RoomMemberDemotedFromOwner = new V4RoomMemberDemotedFromOwner();

    // Act and Assert
    assertEquals(v4RoomMemberDemotedFromOwner, v4RoomMemberDemotedFromOwner);
    int expectedHashCodeResult = v4RoomMemberDemotedFromOwner.hashCode();
    assertEquals(expectedHashCodeResult, v4RoomMemberDemotedFromOwner.hashCode());
  }

  /**
   * Test {@link V4RoomMemberDemotedFromOwner#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4RoomMemberDemotedFromOwner#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4RoomMemberDemotedFromOwner.equals(Object)",
    "int V4RoomMemberDemotedFromOwner.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4RoomMemberDemotedFromOwner(), 1);
  }

  /**
   * Test {@link V4RoomMemberDemotedFromOwner#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4RoomMemberDemotedFromOwner#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4RoomMemberDemotedFromOwner.equals(Object)",
    "int V4RoomMemberDemotedFromOwner.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V4RoomMemberDemotedFromOwner v4RoomMemberDemotedFromOwner = new V4RoomMemberDemotedFromOwner();
    v4RoomMemberDemotedFromOwner.stream(new V4Stream());

    // Act and Assert
    assertNotEquals(v4RoomMemberDemotedFromOwner, new V4RoomMemberDemotedFromOwner());
  }

  /**
   * Test {@link V4RoomMemberDemotedFromOwner#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4RoomMemberDemotedFromOwner#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4RoomMemberDemotedFromOwner.equals(Object)",
    "int V4RoomMemberDemotedFromOwner.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V4RoomMemberDemotedFromOwner v4RoomMemberDemotedFromOwner = new V4RoomMemberDemotedFromOwner();
    v4RoomMemberDemotedFromOwner.affectedUser(new V4User());

    // Act and Assert
    assertNotEquals(v4RoomMemberDemotedFromOwner, new V4RoomMemberDemotedFromOwner());
  }

  /**
   * Test {@link V4RoomMemberDemotedFromOwner#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4RoomMemberDemotedFromOwner#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4RoomMemberDemotedFromOwner.equals(Object)",
    "int V4RoomMemberDemotedFromOwner.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4RoomMemberDemotedFromOwner(), null);
  }

  /**
   * Test {@link V4RoomMemberDemotedFromOwner#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4RoomMemberDemotedFromOwner#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4RoomMemberDemotedFromOwner.equals(Object)",
    "int V4RoomMemberDemotedFromOwner.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new V4RoomMemberDemotedFromOwner(), "Different type to V4RoomMemberDemotedFromOwner");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V4RoomMemberDemotedFromOwner}
   *   <li>{@link V4RoomMemberDemotedFromOwner#affectedUser(V4User)}
   *   <li>{@link V4RoomMemberDemotedFromOwner#setAffectedUser(V4User)}
   *   <li>{@link V4RoomMemberDemotedFromOwner#setStream(V4Stream)}
   *   <li>{@link V4RoomMemberDemotedFromOwner#stream(V4Stream)}
   *   <li>{@link V4RoomMemberDemotedFromOwner#toString()}
   *   <li>{@link V4RoomMemberDemotedFromOwner#getAffectedUser()}
   *   <li>{@link V4RoomMemberDemotedFromOwner#getStream()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V4RoomMemberDemotedFromOwner.<init>()",
    "V4RoomMemberDemotedFromOwner V4RoomMemberDemotedFromOwner.affectedUser(V4User)",
    "V4User V4RoomMemberDemotedFromOwner.getAffectedUser()",
    "V4Stream V4RoomMemberDemotedFromOwner.getStream()",
    "void V4RoomMemberDemotedFromOwner.setAffectedUser(V4User)",
    "void V4RoomMemberDemotedFromOwner.setStream(V4Stream)",
    "V4RoomMemberDemotedFromOwner V4RoomMemberDemotedFromOwner.stream(V4Stream)",
    "String V4RoomMemberDemotedFromOwner.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V4RoomMemberDemotedFromOwner actualV4RoomMemberDemotedFromOwner =
        new V4RoomMemberDemotedFromOwner();
    V4RoomMemberDemotedFromOwner actualAffectedUserResult =
        actualV4RoomMemberDemotedFromOwner.affectedUser(new V4User());
    V4User affectedUser = new V4User();
    actualV4RoomMemberDemotedFromOwner.setAffectedUser(affectedUser);
    actualV4RoomMemberDemotedFromOwner.setStream(new V4Stream());
    V4Stream stream = new V4Stream();
    V4RoomMemberDemotedFromOwner actualStreamResult =
        actualV4RoomMemberDemotedFromOwner.stream(stream);
    String actualToStringResult = actualV4RoomMemberDemotedFromOwner.toString();
    V4User actualAffectedUser = actualV4RoomMemberDemotedFromOwner.getAffectedUser();

    // Assert
    assertEquals(
        "class V4RoomMemberDemotedFromOwner {\n"
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
    assertSame(actualV4RoomMemberDemotedFromOwner, actualAffectedUserResult);
    assertSame(actualV4RoomMemberDemotedFromOwner, actualStreamResult);
    assertSame(stream, actualV4RoomMemberDemotedFromOwner.getStream());
    assertSame(affectedUser, actualAffectedUser);
  }
}
