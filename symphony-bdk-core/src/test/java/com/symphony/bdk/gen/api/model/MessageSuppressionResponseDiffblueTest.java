package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MessageSuppressionResponseDiffblueTest {
  /**
   * Test {@link MessageSuppressionResponse#equals(Object)}, and {@link
   * MessageSuppressionResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MessageSuppressionResponse#equals(Object)}
   *   <li>{@link MessageSuppressionResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageSuppressionResponse.equals(Object)",
    "int MessageSuppressionResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MessageSuppressionResponse messageSuppressionResponse = new MessageSuppressionResponse();
    MessageSuppressionResponse messageSuppressionResponse2 = new MessageSuppressionResponse();

    // Act and Assert
    assertEquals(messageSuppressionResponse, messageSuppressionResponse2);
    int expectedHashCodeResult = messageSuppressionResponse.hashCode();
    assertEquals(expectedHashCodeResult, messageSuppressionResponse2.hashCode());
  }

  /**
   * Test {@link MessageSuppressionResponse#equals(Object)}, and {@link
   * MessageSuppressionResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MessageSuppressionResponse#equals(Object)}
   *   <li>{@link MessageSuppressionResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageSuppressionResponse.equals(Object)",
    "int MessageSuppressionResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MessageSuppressionResponse messageSuppressionResponse = new MessageSuppressionResponse();

    // Act and Assert
    assertEquals(messageSuppressionResponse, messageSuppressionResponse);
    int expectedHashCodeResult = messageSuppressionResponse.hashCode();
    assertEquals(expectedHashCodeResult, messageSuppressionResponse.hashCode());
  }

  /**
   * Test {@link MessageSuppressionResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageSuppressionResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageSuppressionResponse.equals(Object)",
    "int MessageSuppressionResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageSuppressionResponse(), 1);
  }

  /**
   * Test {@link MessageSuppressionResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageSuppressionResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageSuppressionResponse.equals(Object)",
    "int MessageSuppressionResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    MessageSuppressionResponse messageSuppressionResponse = new MessageSuppressionResponse();
    messageSuppressionResponse.messageId("42");

    // Act and Assert
    assertNotEquals(messageSuppressionResponse, new MessageSuppressionResponse());
  }

  /**
   * Test {@link MessageSuppressionResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageSuppressionResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageSuppressionResponse.equals(Object)",
    "int MessageSuppressionResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    MessageSuppressionResponse messageSuppressionResponse = new MessageSuppressionResponse();
    messageSuppressionResponse.suppressed(true);

    // Act and Assert
    assertNotEquals(messageSuppressionResponse, new MessageSuppressionResponse());
  }

  /**
   * Test {@link MessageSuppressionResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageSuppressionResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageSuppressionResponse.equals(Object)",
    "int MessageSuppressionResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    MessageSuppressionResponse messageSuppressionResponse = new MessageSuppressionResponse();
    messageSuppressionResponse.suppressionDate(1L);

    // Act and Assert
    assertNotEquals(messageSuppressionResponse, new MessageSuppressionResponse());
  }

  /**
   * Test {@link MessageSuppressionResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageSuppressionResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageSuppressionResponse.equals(Object)",
    "int MessageSuppressionResponse.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageSuppressionResponse(), null);
  }

  /**
   * Test {@link MessageSuppressionResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageSuppressionResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageSuppressionResponse.equals(Object)",
    "int MessageSuppressionResponse.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new MessageSuppressionResponse(), "Different type to MessageSuppressionResponse");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link MessageSuppressionResponse}
   *   <li>{@link MessageSuppressionResponse#messageId(String)}
   *   <li>{@link MessageSuppressionResponse#setMessageId(String)}
   *   <li>{@link MessageSuppressionResponse#setSuppressed(Boolean)}
   *   <li>{@link MessageSuppressionResponse#setSuppressionDate(Long)}
   *   <li>{@link MessageSuppressionResponse#suppressed(Boolean)}
   *   <li>{@link MessageSuppressionResponse#suppressionDate(Long)}
   *   <li>{@link MessageSuppressionResponse#toString()}
   *   <li>{@link MessageSuppressionResponse#getMessageId()}
   *   <li>{@link MessageSuppressionResponse#getSuppressed()}
   *   <li>{@link MessageSuppressionResponse#getSuppressionDate()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void MessageSuppressionResponse.<init>()",
    "String MessageSuppressionResponse.getMessageId()",
    "Boolean MessageSuppressionResponse.getSuppressed()",
    "Long MessageSuppressionResponse.getSuppressionDate()",
    "MessageSuppressionResponse MessageSuppressionResponse.messageId(String)",
    "void MessageSuppressionResponse.setMessageId(String)",
    "void MessageSuppressionResponse.setSuppressed(Boolean)",
    "void MessageSuppressionResponse.setSuppressionDate(Long)",
    "MessageSuppressionResponse MessageSuppressionResponse.suppressed(Boolean)",
    "MessageSuppressionResponse MessageSuppressionResponse.suppressionDate(Long)",
    "String MessageSuppressionResponse.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    MessageSuppressionResponse actualMessageSuppressionResponse = new MessageSuppressionResponse();
    MessageSuppressionResponse actualMessageIdResult =
        actualMessageSuppressionResponse.messageId("42");
    actualMessageSuppressionResponse.setMessageId("42");
    actualMessageSuppressionResponse.setSuppressed(true);
    actualMessageSuppressionResponse.setSuppressionDate(1L);
    MessageSuppressionResponse actualSuppressedResult =
        actualMessageSuppressionResponse.suppressed(true);
    MessageSuppressionResponse actualSuppressionDateResult =
        actualMessageSuppressionResponse.suppressionDate(1L);
    String actualToStringResult = actualMessageSuppressionResponse.toString();
    String actualMessageId = actualMessageSuppressionResponse.getMessageId();
    Boolean actualSuppressed = actualMessageSuppressionResponse.getSuppressed();

    // Assert
    assertEquals("42", actualMessageId);
    assertEquals(
        "class MessageSuppressionResponse {\n    messageId: 42\n    suppressed: true\n    suppressionDate: 1\n}",
        actualToStringResult);
    assertEquals(1L, actualMessageSuppressionResponse.getSuppressionDate().longValue());
    assertTrue(actualSuppressed);
    assertSame(actualMessageSuppressionResponse, actualMessageIdResult);
    assertSame(actualMessageSuppressionResponse, actualSuppressedResult);
    assertSame(actualMessageSuppressionResponse, actualSuppressionDateResult);
  }
}
