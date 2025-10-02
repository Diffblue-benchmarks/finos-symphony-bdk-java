package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserJoinedRoomMessageDiffblueTest {
  /**
   * Test {@link UserJoinedRoomMessage#equals(Object)}, and {@link
   * UserJoinedRoomMessage#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserJoinedRoomMessage#equals(Object)}
   *   <li>{@link UserJoinedRoomMessage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserJoinedRoomMessage.equals(Object)",
    "int UserJoinedRoomMessage.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserJoinedRoomMessage userJoinedRoomMessage = new UserJoinedRoomMessage();
    UserJoinedRoomMessage userJoinedRoomMessage2 = new UserJoinedRoomMessage();

    // Act and Assert
    assertEquals(userJoinedRoomMessage, userJoinedRoomMessage2);
    assertEquals(userJoinedRoomMessage.hashCode(), userJoinedRoomMessage2.hashCode());
  }

  /**
   * Test {@link UserJoinedRoomMessage#equals(Object)}, and {@link
   * UserJoinedRoomMessage#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserJoinedRoomMessage#equals(Object)}
   *   <li>{@link UserJoinedRoomMessage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserJoinedRoomMessage.equals(Object)",
    "int UserJoinedRoomMessage.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserJoinedRoomMessage userJoinedRoomMessage = new UserJoinedRoomMessage();

    // Act and Assert
    assertEquals(userJoinedRoomMessage, userJoinedRoomMessage);
    int expectedHashCodeResult = userJoinedRoomMessage.hashCode();
    assertEquals(expectedHashCodeResult, userJoinedRoomMessage.hashCode());
  }

  /**
   * Test {@link UserJoinedRoomMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserJoinedRoomMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserJoinedRoomMessage.equals(Object)",
    "int UserJoinedRoomMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    UserJoinedRoomMessage userJoinedRoomMessage = new UserJoinedRoomMessage();
    userJoinedRoomMessage.addedByUserId(1L);

    // Act and Assert
    assertNotEquals(userJoinedRoomMessage, new UserJoinedRoomMessage());
  }

  /**
   * Test {@link UserJoinedRoomMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserJoinedRoomMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserJoinedRoomMessage.equals(Object)",
    "int UserJoinedRoomMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserJoinedRoomMessage userJoinedRoomMessage = new UserJoinedRoomMessage();
    userJoinedRoomMessage.memberAddedUserId(1L);

    // Act and Assert
    assertNotEquals(userJoinedRoomMessage, new UserJoinedRoomMessage());
  }

  /**
   * Test {@link UserJoinedRoomMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserJoinedRoomMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserJoinedRoomMessage.equals(Object)",
    "int UserJoinedRoomMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserJoinedRoomMessage userJoinedRoomMessage = new UserJoinedRoomMessage();
    userJoinedRoomMessage.id("42");

    // Act and Assert
    assertNotEquals(userJoinedRoomMessage, new UserJoinedRoomMessage());
  }

  /**
   * Test {@link UserJoinedRoomMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserJoinedRoomMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserJoinedRoomMessage.equals(Object)",
    "int UserJoinedRoomMessage.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserJoinedRoomMessage(), null);
  }

  /**
   * Test {@link UserJoinedRoomMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserJoinedRoomMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserJoinedRoomMessage.equals(Object)",
    "int UserJoinedRoomMessage.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserJoinedRoomMessage(), "Different type to UserJoinedRoomMessage");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UserJoinedRoomMessage}
   *   <li>{@link UserJoinedRoomMessage#memberAddedUserId(Long)}
   *   <li>{@link UserJoinedRoomMessage#setAddedByUserId(Long)}
   *   <li>{@link UserJoinedRoomMessage#setMemberAddedUserId(Long)}
   *   <li>{@link UserJoinedRoomMessage#addedByUserId(Long)}
   *   <li>{@link UserJoinedRoomMessage#toString()}
   *   <li>{@link UserJoinedRoomMessage#getAddedByUserId()}
   *   <li>{@link UserJoinedRoomMessage#getMemberAddedUserId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserJoinedRoomMessage.<init>()",
    "UserJoinedRoomMessage UserJoinedRoomMessage.addedByUserId(Long)",
    "Long UserJoinedRoomMessage.getAddedByUserId()",
    "Long UserJoinedRoomMessage.getMemberAddedUserId()",
    "UserJoinedRoomMessage UserJoinedRoomMessage.memberAddedUserId(Long)",
    "void UserJoinedRoomMessage.setAddedByUserId(Long)",
    "void UserJoinedRoomMessage.setMemberAddedUserId(Long)",
    "String UserJoinedRoomMessage.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    UserJoinedRoomMessage actualUserJoinedRoomMessage = new UserJoinedRoomMessage();
    UserJoinedRoomMessage actualMemberAddedUserIdResult =
        actualUserJoinedRoomMessage.memberAddedUserId(1L);
    actualUserJoinedRoomMessage.setAddedByUserId(1L);
    actualUserJoinedRoomMessage.setMemberAddedUserId(1L);
    UserJoinedRoomMessage actualAddedByUserIdResult = actualUserJoinedRoomMessage.addedByUserId(1L);
    String actualToStringResult = actualUserJoinedRoomMessage.toString();
    Long actualAddedByUserId = actualUserJoinedRoomMessage.getAddedByUserId();
    Long actualMemberAddedUserId = actualUserJoinedRoomMessage.getMemberAddedUserId();

    // Assert
    assertEquals(
        "class UserJoinedRoomMessage {\n"
            + "    class V2BaseMessage {\n"
            + "        id: null\n"
            + "        timestamp: null\n"
            + "        v2messageType: null\n"
            + "        streamId: null\n"
            + "    }\n"
            + "    addedByUserId: 1\n"
            + "    memberAddedUserId: 1\n"
            + "}",
        actualToStringResult);
    assertNull(actualUserJoinedRoomMessage.getId());
    assertNull(actualUserJoinedRoomMessage.getStreamId());
    assertNull(actualUserJoinedRoomMessage.getTimestamp());
    assertNull(actualUserJoinedRoomMessage.getV2messageType());
    assertEquals(1L, actualAddedByUserId.longValue());
    assertEquals(1L, actualMemberAddedUserId.longValue());
    assertSame(actualUserJoinedRoomMessage, actualAddedByUserIdResult);
    assertSame(actualUserJoinedRoomMessage, actualMemberAddedUserIdResult);
  }
}
