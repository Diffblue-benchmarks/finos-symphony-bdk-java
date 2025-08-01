package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserJoinedRoomMessageAllOfDiffblueTest {
  /**
   * Test {@link UserJoinedRoomMessageAllOf#equals(Object)}, and {@link
   * UserJoinedRoomMessageAllOf#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserJoinedRoomMessageAllOf#equals(Object)}
   *   <li>{@link UserJoinedRoomMessageAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserJoinedRoomMessageAllOf.equals(Object)",
    "int UserJoinedRoomMessageAllOf.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserJoinedRoomMessageAllOf userJoinedRoomMessageAllOf = new UserJoinedRoomMessageAllOf();
    UserJoinedRoomMessageAllOf userJoinedRoomMessageAllOf2 = new UserJoinedRoomMessageAllOf();

    // Act and Assert
    assertEquals(userJoinedRoomMessageAllOf, userJoinedRoomMessageAllOf2);
    int expectedHashCodeResult = userJoinedRoomMessageAllOf.hashCode();
    assertEquals(expectedHashCodeResult, userJoinedRoomMessageAllOf2.hashCode());
  }

  /**
   * Test {@link UserJoinedRoomMessageAllOf#equals(Object)}, and {@link
   * UserJoinedRoomMessageAllOf#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserJoinedRoomMessageAllOf#equals(Object)}
   *   <li>{@link UserJoinedRoomMessageAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserJoinedRoomMessageAllOf.equals(Object)",
    "int UserJoinedRoomMessageAllOf.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserJoinedRoomMessageAllOf userJoinedRoomMessageAllOf = new UserJoinedRoomMessageAllOf();

    // Act and Assert
    assertEquals(userJoinedRoomMessageAllOf, userJoinedRoomMessageAllOf);
    int expectedHashCodeResult = userJoinedRoomMessageAllOf.hashCode();
    assertEquals(expectedHashCodeResult, userJoinedRoomMessageAllOf.hashCode());
  }

  /**
   * Test {@link UserJoinedRoomMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserJoinedRoomMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserJoinedRoomMessageAllOf.equals(Object)",
    "int UserJoinedRoomMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    UserJoinedRoomMessageAllOf userJoinedRoomMessageAllOf = new UserJoinedRoomMessageAllOf();
    userJoinedRoomMessageAllOf.addedByUserId(1L);

    // Act and Assert
    assertNotEquals(userJoinedRoomMessageAllOf, new UserJoinedRoomMessageAllOf());
  }

  /**
   * Test {@link UserJoinedRoomMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserJoinedRoomMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserJoinedRoomMessageAllOf.equals(Object)",
    "int UserJoinedRoomMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserJoinedRoomMessageAllOf userJoinedRoomMessageAllOf = new UserJoinedRoomMessageAllOf();
    userJoinedRoomMessageAllOf.memberAddedUserId(1L);

    // Act and Assert
    assertNotEquals(userJoinedRoomMessageAllOf, new UserJoinedRoomMessageAllOf());
  }

  /**
   * Test {@link UserJoinedRoomMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserJoinedRoomMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserJoinedRoomMessageAllOf.equals(Object)",
    "int UserJoinedRoomMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserJoinedRoomMessageAllOf(), null);
  }

  /**
   * Test {@link UserJoinedRoomMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserJoinedRoomMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserJoinedRoomMessageAllOf.equals(Object)",
    "int UserJoinedRoomMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new UserJoinedRoomMessageAllOf(), "Different type to UserJoinedRoomMessageAllOf");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UserJoinedRoomMessageAllOf}
   *   <li>{@link UserJoinedRoomMessageAllOf#memberAddedUserId(Long)}
   *   <li>{@link UserJoinedRoomMessageAllOf#setAddedByUserId(Long)}
   *   <li>{@link UserJoinedRoomMessageAllOf#setMemberAddedUserId(Long)}
   *   <li>{@link UserJoinedRoomMessageAllOf#addedByUserId(Long)}
   *   <li>{@link UserJoinedRoomMessageAllOf#toString()}
   *   <li>{@link UserJoinedRoomMessageAllOf#getAddedByUserId()}
   *   <li>{@link UserJoinedRoomMessageAllOf#getMemberAddedUserId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserJoinedRoomMessageAllOf.<init>()",
    "UserJoinedRoomMessageAllOf UserJoinedRoomMessageAllOf.addedByUserId(Long)",
    "Long UserJoinedRoomMessageAllOf.getAddedByUserId()",
    "Long UserJoinedRoomMessageAllOf.getMemberAddedUserId()",
    "UserJoinedRoomMessageAllOf UserJoinedRoomMessageAllOf.memberAddedUserId(Long)",
    "void UserJoinedRoomMessageAllOf.setAddedByUserId(Long)",
    "void UserJoinedRoomMessageAllOf.setMemberAddedUserId(Long)",
    "String UserJoinedRoomMessageAllOf.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    UserJoinedRoomMessageAllOf actualUserJoinedRoomMessageAllOf = new UserJoinedRoomMessageAllOf();
    UserJoinedRoomMessageAllOf actualMemberAddedUserIdResult =
        actualUserJoinedRoomMessageAllOf.memberAddedUserId(1L);
    actualUserJoinedRoomMessageAllOf.setAddedByUserId(1L);
    actualUserJoinedRoomMessageAllOf.setMemberAddedUserId(1L);
    UserJoinedRoomMessageAllOf actualAddedByUserIdResult =
        actualUserJoinedRoomMessageAllOf.addedByUserId(1L);
    String actualToStringResult = actualUserJoinedRoomMessageAllOf.toString();
    Long actualAddedByUserId = actualUserJoinedRoomMessageAllOf.getAddedByUserId();
    Long actualMemberAddedUserId = actualUserJoinedRoomMessageAllOf.getMemberAddedUserId();

    // Assert
    assertEquals(
        "class UserJoinedRoomMessageAllOf {\n    addedByUserId: 1\n    memberAddedUserId: 1\n}",
        actualToStringResult);
    assertEquals(1L, actualAddedByUserId.longValue());
    assertEquals(1L, actualMemberAddedUserId.longValue());
    assertSame(actualUserJoinedRoomMessageAllOf, actualAddedByUserIdResult);
    assertSame(actualUserJoinedRoomMessageAllOf, actualMemberAddedUserIdResult);
  }
}
