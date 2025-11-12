package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V4RoomMemberPromotedToOwnerDiffblueTest {
  /**
   * Test {@link V4RoomMemberPromotedToOwner#equals(Object)}, and {@link
   * V4RoomMemberPromotedToOwner#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4RoomMemberPromotedToOwner#equals(Object)}
   *   <li>{@link V4RoomMemberPromotedToOwner#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4RoomMemberPromotedToOwner.equals(Object)",
    "int V4RoomMemberPromotedToOwner.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4RoomMemberPromotedToOwner v4RoomMemberPromotedToOwner = new V4RoomMemberPromotedToOwner();
    V4RoomMemberPromotedToOwner v4RoomMemberPromotedToOwner2 = new V4RoomMemberPromotedToOwner();

    // Act and Assert
    assertEquals(v4RoomMemberPromotedToOwner, v4RoomMemberPromotedToOwner2);
    assertEquals(v4RoomMemberPromotedToOwner.hashCode(), v4RoomMemberPromotedToOwner2.hashCode());
  }

  /**
   * Test {@link V4RoomMemberPromotedToOwner#equals(Object)}, and {@link
   * V4RoomMemberPromotedToOwner#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4RoomMemberPromotedToOwner#equals(Object)}
   *   <li>{@link V4RoomMemberPromotedToOwner#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4RoomMemberPromotedToOwner.equals(Object)",
    "int V4RoomMemberPromotedToOwner.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4RoomMemberPromotedToOwner v4RoomMemberPromotedToOwner = new V4RoomMemberPromotedToOwner();

    // Act and Assert
    assertEquals(v4RoomMemberPromotedToOwner, v4RoomMemberPromotedToOwner);
    int expectedHashCodeResult = v4RoomMemberPromotedToOwner.hashCode();
    assertEquals(expectedHashCodeResult, v4RoomMemberPromotedToOwner.hashCode());
  }

  /**
   * Test {@link V4RoomMemberPromotedToOwner#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4RoomMemberPromotedToOwner#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4RoomMemberPromotedToOwner.equals(Object)",
    "int V4RoomMemberPromotedToOwner.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4RoomMemberPromotedToOwner(), 1);
  }

  /**
   * Test {@link V4RoomMemberPromotedToOwner#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4RoomMemberPromotedToOwner#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4RoomMemberPromotedToOwner.equals(Object)",
    "int V4RoomMemberPromotedToOwner.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V4RoomMemberPromotedToOwner v4RoomMemberPromotedToOwner = new V4RoomMemberPromotedToOwner();
    v4RoomMemberPromotedToOwner.stream(new V4Stream());

    // Act and Assert
    assertNotEquals(v4RoomMemberPromotedToOwner, new V4RoomMemberPromotedToOwner());
  }

  /**
   * Test {@link V4RoomMemberPromotedToOwner#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4RoomMemberPromotedToOwner#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4RoomMemberPromotedToOwner.equals(Object)",
    "int V4RoomMemberPromotedToOwner.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V4RoomMemberPromotedToOwner v4RoomMemberPromotedToOwner = new V4RoomMemberPromotedToOwner();
    v4RoomMemberPromotedToOwner.affectedUser(new V4User());

    // Act and Assert
    assertNotEquals(v4RoomMemberPromotedToOwner, new V4RoomMemberPromotedToOwner());
  }

  /**
   * Test {@link V4RoomMemberPromotedToOwner#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4RoomMemberPromotedToOwner#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4RoomMemberPromotedToOwner.equals(Object)",
    "int V4RoomMemberPromotedToOwner.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4RoomMemberPromotedToOwner(), null);
  }

  /**
   * Test {@link V4RoomMemberPromotedToOwner#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4RoomMemberPromotedToOwner#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4RoomMemberPromotedToOwner.equals(Object)",
    "int V4RoomMemberPromotedToOwner.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new V4RoomMemberPromotedToOwner(), "Different type to V4RoomMemberPromotedToOwner");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V4RoomMemberPromotedToOwner}
   *   <li>{@link V4RoomMemberPromotedToOwner#affectedUser(V4User)}
   *   <li>{@link V4RoomMemberPromotedToOwner#setAffectedUser(V4User)}
   *   <li>{@link V4RoomMemberPromotedToOwner#setStream(V4Stream)}
   *   <li>{@link V4RoomMemberPromotedToOwner#stream(V4Stream)}
   *   <li>{@link V4RoomMemberPromotedToOwner#toString()}
   *   <li>{@link V4RoomMemberPromotedToOwner#getAffectedUser()}
   *   <li>{@link V4RoomMemberPromotedToOwner#getStream()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V4RoomMemberPromotedToOwner.<init>()",
    "V4RoomMemberPromotedToOwner V4RoomMemberPromotedToOwner.affectedUser(V4User)",
    "V4User V4RoomMemberPromotedToOwner.getAffectedUser()",
    "V4Stream V4RoomMemberPromotedToOwner.getStream()",
    "void V4RoomMemberPromotedToOwner.setAffectedUser(V4User)",
    "void V4RoomMemberPromotedToOwner.setStream(V4Stream)",
    "V4RoomMemberPromotedToOwner V4RoomMemberPromotedToOwner.stream(V4Stream)",
    "String V4RoomMemberPromotedToOwner.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V4RoomMemberPromotedToOwner actualV4RoomMemberPromotedToOwner =
        new V4RoomMemberPromotedToOwner();
    V4RoomMemberPromotedToOwner actualAffectedUserResult =
        actualV4RoomMemberPromotedToOwner.affectedUser(new V4User());
    V4User affectedUser = new V4User();
    actualV4RoomMemberPromotedToOwner.setAffectedUser(affectedUser);
    actualV4RoomMemberPromotedToOwner.setStream(new V4Stream());
    V4Stream stream = new V4Stream();
    V4RoomMemberPromotedToOwner actualStreamResult =
        actualV4RoomMemberPromotedToOwner.stream(stream);
    String actualToStringResult = actualV4RoomMemberPromotedToOwner.toString();
    V4User actualAffectedUser = actualV4RoomMemberPromotedToOwner.getAffectedUser();
    V4Stream actualStream = actualV4RoomMemberPromotedToOwner.getStream();

    // Assert
    assertEquals(
        "class V4RoomMemberPromotedToOwner {\n"
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
    assertSame(actualV4RoomMemberPromotedToOwner, actualAffectedUserResult);
    assertSame(actualV4RoomMemberPromotedToOwner, actualStreamResult);
    assertSame(stream, actualStream);
    assertSame(affectedUser, actualAffectedUser);
  }
}
