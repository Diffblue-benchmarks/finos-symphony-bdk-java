package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MessageAllOfDiffblueTest {
  /**
   * Test {@link MessageAllOf#equals(Object)}, and {@link MessageAllOf#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MessageAllOf#equals(Object)}
   *   <li>{@link MessageAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageAllOf.equals(Object)", "int MessageAllOf.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MessageAllOf messageAllOf = new MessageAllOf();
    MessageAllOf messageAllOf2 = new MessageAllOf();

    // Act and Assert
    assertEquals(messageAllOf, messageAllOf2);
    assertEquals(messageAllOf.hashCode(), messageAllOf2.hashCode());
  }

  /**
   * Test {@link MessageAllOf#equals(Object)}, and {@link MessageAllOf#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MessageAllOf#equals(Object)}
   *   <li>{@link MessageAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageAllOf.equals(Object)", "int MessageAllOf.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MessageAllOf messageAllOf = new MessageAllOf();

    // Act and Assert
    assertEquals(messageAllOf, messageAllOf);
    int expectedHashCodeResult = messageAllOf.hashCode();
    assertEquals(expectedHashCodeResult, messageAllOf.hashCode());
  }

  /**
   * Test {@link MessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageAllOf.equals(Object)", "int MessageAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageAllOf(), 1);
  }

  /**
   * Test {@link MessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageAllOf.equals(Object)", "int MessageAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    MessageAllOf messageAllOf = new MessageAllOf();
    messageAllOf.message("Not all who wander are lost");

    // Act and Assert
    assertNotEquals(messageAllOf, new MessageAllOf());
  }

  /**
   * Test {@link MessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageAllOf.equals(Object)", "int MessageAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    MessageAllOf messageAllOf = new MessageAllOf();
    messageAllOf.fromUserId(1L);

    // Act and Assert
    assertNotEquals(messageAllOf, new MessageAllOf());
  }

  /**
   * Test {@link MessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageAllOf.equals(Object)", "int MessageAllOf.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageAllOf(), null);
  }

  /**
   * Test {@link MessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageAllOf.equals(Object)", "int MessageAllOf.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageAllOf(), "Different type to MessageAllOf");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link MessageAllOf}
   *   <li>{@link MessageAllOf#fromUserId(Long)}
   *   <li>{@link MessageAllOf#message(String)}
   *   <li>{@link MessageAllOf#setFromUserId(Long)}
   *   <li>{@link MessageAllOf#setMessage(String)}
   *   <li>{@link MessageAllOf#toString()}
   *   <li>{@link MessageAllOf#getFromUserId()}
   *   <li>{@link MessageAllOf#getMessage()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void MessageAllOf.<init>()",
    "MessageAllOf MessageAllOf.fromUserId(Long)",
    "Long MessageAllOf.getFromUserId()",
    "String MessageAllOf.getMessage()",
    "MessageAllOf MessageAllOf.message(String)",
    "void MessageAllOf.setFromUserId(Long)",
    "void MessageAllOf.setMessage(String)",
    "String MessageAllOf.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    MessageAllOf actualMessageAllOf = new MessageAllOf();
    MessageAllOf actualFromUserIdResult = actualMessageAllOf.fromUserId(1L);
    MessageAllOf actualMessageResult = actualMessageAllOf.message("Not all who wander are lost");
    actualMessageAllOf.setFromUserId(1L);
    actualMessageAllOf.setMessage("Not all who wander are lost");
    String actualToStringResult = actualMessageAllOf.toString();
    Long actualFromUserId = actualMessageAllOf.getFromUserId();

    // Assert
    assertEquals("Not all who wander are lost", actualMessageAllOf.getMessage());
    assertEquals(
        "class MessageAllOf {\n    message: Not all who wander are lost\n    fromUserId: 1\n}",
        actualToStringResult);
    assertEquals(1L, actualFromUserId.longValue());
    assertSame(actualMessageAllOf, actualFromUserIdResult);
    assertSame(actualMessageAllOf, actualMessageResult);
  }
}
