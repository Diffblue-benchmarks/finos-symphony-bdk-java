package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserLeftRoomMessageDiffblueTest {
  /**
   * Test {@link UserLeftRoomMessage#equals(Object)}, and {@link UserLeftRoomMessage#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserLeftRoomMessage#equals(Object)}
   *   <li>{@link UserLeftRoomMessage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserLeftRoomMessage.equals(Object)",
    "int UserLeftRoomMessage.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserLeftRoomMessage userLeftRoomMessage = new UserLeftRoomMessage();
    UserLeftRoomMessage userLeftRoomMessage2 = new UserLeftRoomMessage();

    // Act and Assert
    assertEquals(userLeftRoomMessage, userLeftRoomMessage2);
    int expectedHashCodeResult = userLeftRoomMessage.hashCode();
    assertEquals(expectedHashCodeResult, userLeftRoomMessage2.hashCode());
  }

  /**
   * Test {@link UserLeftRoomMessage#equals(Object)}, and {@link UserLeftRoomMessage#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserLeftRoomMessage#equals(Object)}
   *   <li>{@link UserLeftRoomMessage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserLeftRoomMessage.equals(Object)",
    "int UserLeftRoomMessage.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserLeftRoomMessage userLeftRoomMessage = new UserLeftRoomMessage();

    // Act and Assert
    assertEquals(userLeftRoomMessage, userLeftRoomMessage);
    int expectedHashCodeResult = userLeftRoomMessage.hashCode();
    assertEquals(expectedHashCodeResult, userLeftRoomMessage.hashCode());
  }

  /**
   * Test {@link UserLeftRoomMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserLeftRoomMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserLeftRoomMessage.equals(Object)",
    "int UserLeftRoomMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserLeftRoomMessage(), 1);
  }

  /**
   * Test {@link UserLeftRoomMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserLeftRoomMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserLeftRoomMessage.equals(Object)",
    "int UserLeftRoomMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserLeftRoomMessage userLeftRoomMessage = new UserLeftRoomMessage();
    userLeftRoomMessage.setRemovedByUserId(1L);

    // Act and Assert
    assertNotEquals(userLeftRoomMessage, new UserLeftRoomMessage());
  }

  /**
   * Test {@link UserLeftRoomMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserLeftRoomMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserLeftRoomMessage.equals(Object)",
    "int UserLeftRoomMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserLeftRoomMessage userLeftRoomMessage = new UserLeftRoomMessage();
    userLeftRoomMessage.memberLeftUserId(1L);

    // Act and Assert
    assertNotEquals(userLeftRoomMessage, new UserLeftRoomMessage());
  }

  /**
   * Test {@link UserLeftRoomMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserLeftRoomMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserLeftRoomMessage.equals(Object)",
    "int UserLeftRoomMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    UserLeftRoomMessage userLeftRoomMessage = new UserLeftRoomMessage();
    userLeftRoomMessage.informationBarrierRemediation(true);

    // Act and Assert
    assertNotEquals(userLeftRoomMessage, new UserLeftRoomMessage());
  }

  /**
   * Test {@link UserLeftRoomMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserLeftRoomMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserLeftRoomMessage.equals(Object)",
    "int UserLeftRoomMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    UserLeftRoomMessage userLeftRoomMessage = new UserLeftRoomMessage();
    userLeftRoomMessage.id("42");

    // Act and Assert
    assertNotEquals(userLeftRoomMessage, new UserLeftRoomMessage());
  }

  /**
   * Test {@link UserLeftRoomMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserLeftRoomMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserLeftRoomMessage.equals(Object)",
    "int UserLeftRoomMessage.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserLeftRoomMessage(), null);
  }

  /**
   * Test {@link UserLeftRoomMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserLeftRoomMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserLeftRoomMessage.equals(Object)",
    "int UserLeftRoomMessage.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserLeftRoomMessage(), "Different type to UserLeftRoomMessage");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UserLeftRoomMessage}
   *   <li>{@link UserLeftRoomMessage#informationBarrierRemediation(Boolean)}
   *   <li>{@link UserLeftRoomMessage#memberLeftUserId(Long)}
   *   <li>{@link UserLeftRoomMessage#setInformationBarrierRemediation(Boolean)}
   *   <li>{@link UserLeftRoomMessage#setMemberLeftUserId(Long)}
   *   <li>{@link UserLeftRoomMessage#setRemovedByUserId(Long)}
   *   <li>{@link UserLeftRoomMessage#removedByUserId(Long)}
   *   <li>{@link UserLeftRoomMessage#toString()}
   *   <li>{@link UserLeftRoomMessage#getInformationBarrierRemediation()}
   *   <li>{@link UserLeftRoomMessage#getMemberLeftUserId()}
   *   <li>{@link UserLeftRoomMessage#getRemovedByUserId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserLeftRoomMessage.<init>()",
    "Boolean UserLeftRoomMessage.getInformationBarrierRemediation()",
    "Long UserLeftRoomMessage.getMemberLeftUserId()",
    "Long UserLeftRoomMessage.getRemovedByUserId()",
    "UserLeftRoomMessage UserLeftRoomMessage.informationBarrierRemediation(Boolean)",
    "UserLeftRoomMessage UserLeftRoomMessage.memberLeftUserId(Long)",
    "UserLeftRoomMessage UserLeftRoomMessage.removedByUserId(Long)",
    "void UserLeftRoomMessage.setInformationBarrierRemediation(Boolean)",
    "void UserLeftRoomMessage.setMemberLeftUserId(Long)",
    "void UserLeftRoomMessage.setRemovedByUserId(Long)",
    "String UserLeftRoomMessage.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    UserLeftRoomMessage actualUserLeftRoomMessage = new UserLeftRoomMessage();
    UserLeftRoomMessage actualInformationBarrierRemediationResult =
        actualUserLeftRoomMessage.informationBarrierRemediation(true);
    UserLeftRoomMessage actualMemberLeftUserIdResult =
        actualUserLeftRoomMessage.memberLeftUserId(1L);
    actualUserLeftRoomMessage.setInformationBarrierRemediation(true);
    actualUserLeftRoomMessage.setMemberLeftUserId(1L);
    actualUserLeftRoomMessage.setRemovedByUserId(1L);
    UserLeftRoomMessage actualRemovedByUserIdResult = actualUserLeftRoomMessage.removedByUserId(1L);
    String actualToStringResult = actualUserLeftRoomMessage.toString();
    Boolean actualInformationBarrierRemediation =
        actualUserLeftRoomMessage.getInformationBarrierRemediation();
    Long actualMemberLeftUserId = actualUserLeftRoomMessage.getMemberLeftUserId();
    Long actualRemovedByUserId = actualUserLeftRoomMessage.getRemovedByUserId();

    // Assert
    assertEquals(
        "class UserLeftRoomMessage {\n"
            + "    class V2BaseMessage {\n"
            + "        id: null\n"
            + "        timestamp: null\n"
            + "        v2messageType: null\n"
            + "        streamId: null\n"
            + "    }\n"
            + "    removedByUserId: 1\n"
            + "    memberLeftUserId: 1\n"
            + "    informationBarrierRemediation: true\n"
            + "}",
        actualToStringResult);
    assertNull(actualUserLeftRoomMessage.getId());
    assertNull(actualUserLeftRoomMessage.getStreamId());
    assertNull(actualUserLeftRoomMessage.getTimestamp());
    assertNull(actualUserLeftRoomMessage.getV2messageType());
    assertEquals(1L, actualMemberLeftUserId.longValue());
    assertEquals(1L, actualRemovedByUserId.longValue());
    assertTrue(actualInformationBarrierRemediation);
    assertSame(actualUserLeftRoomMessage, actualInformationBarrierRemediationResult);
    assertSame(actualUserLeftRoomMessage, actualMemberLeftUserIdResult);
    assertSame(actualUserLeftRoomMessage, actualRemovedByUserIdResult);
  }
}
