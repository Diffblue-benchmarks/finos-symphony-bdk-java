package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MessageUserDiffblueTest {
  /**
   * Test {@link MessageUser#equals(Object)}, and {@link MessageUser#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MessageUser#equals(Object)}
   *   <li>{@link MessageUser#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageUser.equals(Object)", "int MessageUser.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MessageUser messageUser = new MessageUser();
    MessageUser messageUser2 = new MessageUser();

    // Act and Assert
    assertEquals(messageUser, messageUser2);
    int expectedHashCodeResult = messageUser.hashCode();
    assertEquals(expectedHashCodeResult, messageUser2.hashCode());
  }

  /**
   * Test {@link MessageUser#equals(Object)}, and {@link MessageUser#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MessageUser#equals(Object)}
   *   <li>{@link MessageUser#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageUser.equals(Object)", "int MessageUser.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MessageUser messageUser = new MessageUser();

    // Act and Assert
    assertEquals(messageUser, messageUser);
    int expectedHashCodeResult = messageUser.hashCode();
    assertEquals(expectedHashCodeResult, messageUser.hashCode());
  }

  /**
   * Test {@link MessageUser#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageUser#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageUser.equals(Object)", "int MessageUser.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageUser(), 1);
  }

  /**
   * Test {@link MessageUser#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageUser#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageUser.equals(Object)", "int MessageUser.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    MessageUser messageUser = new MessageUser();
    messageUser.id(1L);

    // Act and Assert
    assertNotEquals(messageUser, new MessageUser());
  }

  /**
   * Test {@link MessageUser#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageUser#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageUser.equals(Object)", "int MessageUser.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    MessageUser messageUser = new MessageUser();
    messageUser.name("Name");

    // Act and Assert
    assertNotEquals(messageUser, new MessageUser());
  }

  /**
   * Test {@link MessageUser#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageUser#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageUser.equals(Object)", "int MessageUser.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageUser(), null);
  }

  /**
   * Test {@link MessageUser#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageUser#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageUser.equals(Object)", "int MessageUser.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageUser(), "Different type to MessageUser");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link MessageUser}
   *   <li>{@link MessageUser#id(Long)}
   *   <li>{@link MessageUser#name(String)}
   *   <li>{@link MessageUser#setId(Long)}
   *   <li>{@link MessageUser#setName(String)}
   *   <li>{@link MessageUser#toString()}
   *   <li>{@link MessageUser#getId()}
   *   <li>{@link MessageUser#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void MessageUser.<init>()",
    "Long MessageUser.getId()",
    "String MessageUser.getName()",
    "MessageUser MessageUser.id(Long)",
    "MessageUser MessageUser.name(String)",
    "void MessageUser.setId(Long)",
    "void MessageUser.setName(String)",
    "String MessageUser.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    MessageUser actualMessageUser = new MessageUser();
    MessageUser actualIdResult = actualMessageUser.id(1L);
    MessageUser actualNameResult = actualMessageUser.name("Name");
    actualMessageUser.setId(1L);
    actualMessageUser.setName("Name");
    String actualToStringResult = actualMessageUser.toString();
    Long actualId = actualMessageUser.getId();

    // Assert
    assertEquals("Name", actualMessageUser.getName());
    assertEquals("class MessageUser {\n    id: 1\n    name: Name\n}", actualToStringResult);
    assertEquals(1L, actualId.longValue());
    assertSame(actualMessageUser, actualIdResult);
    assertSame(actualMessageUser, actualNameResult);
  }
}
