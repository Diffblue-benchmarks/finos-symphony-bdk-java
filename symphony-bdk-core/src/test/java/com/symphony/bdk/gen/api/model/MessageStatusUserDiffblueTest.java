package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MessageStatusUserDiffblueTest {
  /**
   * Test {@link MessageStatusUser#equals(Object)}, and {@link MessageStatusUser#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MessageStatusUser#equals(Object)}
   *   <li>{@link MessageStatusUser#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageStatusUser.equals(Object)",
    "int MessageStatusUser.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MessageStatusUser messageStatusUser = new MessageStatusUser();
    MessageStatusUser messageStatusUser2 = new MessageStatusUser();

    // Act and Assert
    assertEquals(messageStatusUser, messageStatusUser2);
    int expectedHashCodeResult = messageStatusUser.hashCode();
    assertEquals(expectedHashCodeResult, messageStatusUser2.hashCode());
  }

  /**
   * Test {@link MessageStatusUser#equals(Object)}, and {@link MessageStatusUser#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MessageStatusUser#equals(Object)}
   *   <li>{@link MessageStatusUser#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageStatusUser.equals(Object)",
    "int MessageStatusUser.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MessageStatusUser messageStatusUser = new MessageStatusUser();

    // Act and Assert
    assertEquals(messageStatusUser, messageStatusUser);
    int expectedHashCodeResult = messageStatusUser.hashCode();
    assertEquals(expectedHashCodeResult, messageStatusUser.hashCode());
  }

  /**
   * Test {@link MessageStatusUser#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageStatusUser#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageStatusUser.equals(Object)",
    "int MessageStatusUser.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageStatusUser(), 1);
  }

  /**
   * Test {@link MessageStatusUser#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageStatusUser#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageStatusUser.equals(Object)",
    "int MessageStatusUser.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    MessageStatusUser messageStatusUser = new MessageStatusUser();
    messageStatusUser.userId("42");

    // Act and Assert
    assertNotEquals(messageStatusUser, new MessageStatusUser());
  }

  /**
   * Test {@link MessageStatusUser#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageStatusUser#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageStatusUser.equals(Object)",
    "int MessageStatusUser.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    MessageStatusUser messageStatusUser = new MessageStatusUser();
    messageStatusUser.firstName("Jane");

    // Act and Assert
    assertNotEquals(messageStatusUser, new MessageStatusUser());
  }

  /**
   * Test {@link MessageStatusUser#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageStatusUser#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageStatusUser.equals(Object)",
    "int MessageStatusUser.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    MessageStatusUser messageStatusUser = new MessageStatusUser();
    messageStatusUser.lastName("Doe");

    // Act and Assert
    assertNotEquals(messageStatusUser, new MessageStatusUser());
  }

  /**
   * Test {@link MessageStatusUser#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageStatusUser#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageStatusUser.equals(Object)",
    "int MessageStatusUser.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    MessageStatusUser messageStatusUser = new MessageStatusUser();
    messageStatusUser.displayName("Display Name");

    // Act and Assert
    assertNotEquals(messageStatusUser, new MessageStatusUser());
  }

  /**
   * Test {@link MessageStatusUser#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageStatusUser#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageStatusUser.equals(Object)",
    "int MessageStatusUser.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    MessageStatusUser messageStatusUser = new MessageStatusUser();
    messageStatusUser.email("jane.doe@example.org");

    // Act and Assert
    assertNotEquals(messageStatusUser, new MessageStatusUser());
  }

  /**
   * Test {@link MessageStatusUser#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageStatusUser#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageStatusUser.equals(Object)",
    "int MessageStatusUser.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    MessageStatusUser messageStatusUser = new MessageStatusUser();
    messageStatusUser.userName("janedoe");

    // Act and Assert
    assertNotEquals(messageStatusUser, new MessageStatusUser());
  }

  /**
   * Test {@link MessageStatusUser#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageStatusUser#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageStatusUser.equals(Object)",
    "int MessageStatusUser.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    MessageStatusUser messageStatusUser = new MessageStatusUser();
    messageStatusUser.timestamp("Timestamp");

    // Act and Assert
    assertNotEquals(messageStatusUser, new MessageStatusUser());
  }

  /**
   * Test {@link MessageStatusUser#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageStatusUser#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageStatusUser.equals(Object)",
    "int MessageStatusUser.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageStatusUser(), null);
  }

  /**
   * Test {@link MessageStatusUser#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageStatusUser#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageStatusUser.equals(Object)",
    "int MessageStatusUser.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageStatusUser(), "Different type to MessageStatusUser");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link MessageStatusUser}
   *   <li>{@link MessageStatusUser#displayName(String)}
   *   <li>{@link MessageStatusUser#email(String)}
   *   <li>{@link MessageStatusUser#firstName(String)}
   *   <li>{@link MessageStatusUser#lastName(String)}
   *   <li>{@link MessageStatusUser#setDisplayName(String)}
   *   <li>{@link MessageStatusUser#setEmail(String)}
   *   <li>{@link MessageStatusUser#setFirstName(String)}
   *   <li>{@link MessageStatusUser#setLastName(String)}
   *   <li>{@link MessageStatusUser#setTimestamp(String)}
   *   <li>{@link MessageStatusUser#setUserId(String)}
   *   <li>{@link MessageStatusUser#setUserName(String)}
   *   <li>{@link MessageStatusUser#timestamp(String)}
   *   <li>{@link MessageStatusUser#userId(String)}
   *   <li>{@link MessageStatusUser#userName(String)}
   *   <li>{@link MessageStatusUser#toString()}
   *   <li>{@link MessageStatusUser#getDisplayName()}
   *   <li>{@link MessageStatusUser#getEmail()}
   *   <li>{@link MessageStatusUser#getFirstName()}
   *   <li>{@link MessageStatusUser#getLastName()}
   *   <li>{@link MessageStatusUser#getTimestamp()}
   *   <li>{@link MessageStatusUser#getUserId()}
   *   <li>{@link MessageStatusUser#getUserName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void MessageStatusUser.<init>()",
    "MessageStatusUser MessageStatusUser.displayName(String)",
    "MessageStatusUser MessageStatusUser.email(String)",
    "MessageStatusUser MessageStatusUser.firstName(String)",
    "String MessageStatusUser.getDisplayName()",
    "String MessageStatusUser.getEmail()",
    "String MessageStatusUser.getFirstName()",
    "String MessageStatusUser.getLastName()",
    "String MessageStatusUser.getTimestamp()",
    "String MessageStatusUser.getUserId()",
    "String MessageStatusUser.getUserName()",
    "MessageStatusUser MessageStatusUser.lastName(String)",
    "void MessageStatusUser.setDisplayName(String)",
    "void MessageStatusUser.setEmail(String)",
    "void MessageStatusUser.setFirstName(String)",
    "void MessageStatusUser.setLastName(String)",
    "void MessageStatusUser.setTimestamp(String)",
    "void MessageStatusUser.setUserId(String)",
    "void MessageStatusUser.setUserName(String)",
    "MessageStatusUser MessageStatusUser.timestamp(String)",
    "String MessageStatusUser.toString()",
    "MessageStatusUser MessageStatusUser.userId(String)",
    "MessageStatusUser MessageStatusUser.userName(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    MessageStatusUser actualMessageStatusUser = new MessageStatusUser();
    MessageStatusUser actualDisplayNameResult = actualMessageStatusUser.displayName("Display Name");
    MessageStatusUser actualEmailResult = actualMessageStatusUser.email("jane.doe@example.org");
    MessageStatusUser actualFirstNameResult = actualMessageStatusUser.firstName("Jane");
    MessageStatusUser actualLastNameResult = actualMessageStatusUser.lastName("Doe");
    actualMessageStatusUser.setDisplayName("Display Name");
    actualMessageStatusUser.setEmail("jane.doe@example.org");
    actualMessageStatusUser.setFirstName("Jane");
    actualMessageStatusUser.setLastName("Doe");
    actualMessageStatusUser.setTimestamp("Timestamp");
    actualMessageStatusUser.setUserId("42");
    actualMessageStatusUser.setUserName("janedoe");
    MessageStatusUser actualTimestampResult = actualMessageStatusUser.timestamp("Timestamp");
    MessageStatusUser actualUserIdResult = actualMessageStatusUser.userId("42");
    MessageStatusUser actualUserNameResult = actualMessageStatusUser.userName("janedoe");
    String actualToStringResult = actualMessageStatusUser.toString();
    String actualDisplayName = actualMessageStatusUser.getDisplayName();
    String actualEmail = actualMessageStatusUser.getEmail();
    String actualFirstName = actualMessageStatusUser.getFirstName();
    String actualLastName = actualMessageStatusUser.getLastName();
    String actualTimestamp = actualMessageStatusUser.getTimestamp();
    String actualUserId = actualMessageStatusUser.getUserId();

    // Assert
    assertEquals("42", actualUserId);
    assertEquals("Display Name", actualDisplayName);
    assertEquals("Doe", actualLastName);
    assertEquals("Jane", actualFirstName);
    assertEquals("Timestamp", actualTimestamp);
    assertEquals(
        "class MessageStatusUser {\n"
            + "    userId: 42\n"
            + "    firstName: Jane\n"
            + "    lastName: Doe\n"
            + "    displayName: Display Name\n"
            + "    email: jane.doe@example.org\n"
            + "    userName: janedoe\n"
            + "    timestamp: Timestamp\n"
            + "}",
        actualToStringResult);
    assertEquals("jane.doe@example.org", actualEmail);
    assertEquals("janedoe", actualMessageStatusUser.getUserName());
    assertSame(actualMessageStatusUser, actualDisplayNameResult);
    assertSame(actualMessageStatusUser, actualEmailResult);
    assertSame(actualMessageStatusUser, actualFirstNameResult);
    assertSame(actualMessageStatusUser, actualLastNameResult);
    assertSame(actualMessageStatusUser, actualTimestampResult);
    assertSame(actualMessageStatusUser, actualUserIdResult);
    assertSame(actualMessageStatusUser, actualUserNameResult);
  }
}
