package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V4SharedPostDiffblueTest {
  /**
   * Test {@link V4SharedPost#equals(Object)}, and {@link V4SharedPost#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4SharedPost#equals(Object)}
   *   <li>{@link V4SharedPost#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4SharedPost.equals(Object)", "int V4SharedPost.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4SharedPost v4SharedPost = new V4SharedPost();
    V4SharedPost v4SharedPost2 = new V4SharedPost();

    // Act and Assert
    assertEquals(v4SharedPost, v4SharedPost2);
    int expectedHashCodeResult = v4SharedPost.hashCode();
    assertEquals(expectedHashCodeResult, v4SharedPost2.hashCode());
  }

  /**
   * Test {@link V4SharedPost#equals(Object)}, and {@link V4SharedPost#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4SharedPost#equals(Object)}
   *   <li>{@link V4SharedPost#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4SharedPost.equals(Object)", "int V4SharedPost.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4SharedPost v4SharedPost = new V4SharedPost();

    // Act and Assert
    assertEquals(v4SharedPost, v4SharedPost);
    int expectedHashCodeResult = v4SharedPost.hashCode();
    assertEquals(expectedHashCodeResult, v4SharedPost.hashCode());
  }

  /**
   * Test {@link V4SharedPost#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4SharedPost#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4SharedPost.equals(Object)", "int V4SharedPost.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4SharedPost(), 1);
  }

  /**
   * Test {@link V4SharedPost#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4SharedPost#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4SharedPost.equals(Object)", "int V4SharedPost.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V4SharedPost v4SharedPost = new V4SharedPost();
    v4SharedPost.message(new V4Message());

    // Act and Assert
    assertNotEquals(v4SharedPost, new V4SharedPost());
  }

  /**
   * Test {@link V4SharedPost#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4SharedPost#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4SharedPost.equals(Object)", "int V4SharedPost.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V4SharedPost v4SharedPost = new V4SharedPost();
    v4SharedPost.sharedMessage(new V4Message());

    // Act and Assert
    assertNotEquals(v4SharedPost, new V4SharedPost());
  }

  /**
   * Test {@link V4SharedPost#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4SharedPost#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4SharedPost.equals(Object)", "int V4SharedPost.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4SharedPost(), null);
  }

  /**
   * Test {@link V4SharedPost#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4SharedPost#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4SharedPost.equals(Object)", "int V4SharedPost.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4SharedPost(), "Different type to V4SharedPost");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V4SharedPost}
   *   <li>{@link V4SharedPost#message(V4Message)}
   *   <li>{@link V4SharedPost#setMessage(V4Message)}
   *   <li>{@link V4SharedPost#setSharedMessage(V4Message)}
   *   <li>{@link V4SharedPost#sharedMessage(V4Message)}
   *   <li>{@link V4SharedPost#toString()}
   *   <li>{@link V4SharedPost#getMessage()}
   *   <li>{@link V4SharedPost#getSharedMessage()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V4SharedPost.<init>()",
    "V4Message V4SharedPost.getMessage()",
    "V4Message V4SharedPost.getSharedMessage()",
    "V4SharedPost V4SharedPost.message(V4Message)",
    "void V4SharedPost.setMessage(V4Message)",
    "void V4SharedPost.setSharedMessage(V4Message)",
    "V4SharedPost V4SharedPost.sharedMessage(V4Message)",
    "String V4SharedPost.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V4SharedPost actualV4SharedPost = new V4SharedPost();
    V4SharedPost actualMessageResult = actualV4SharedPost.message(new V4Message());
    V4Message message = new V4Message();
    actualV4SharedPost.setMessage(message);
    actualV4SharedPost.setSharedMessage(new V4Message());
    V4Message sharedMessage = new V4Message();
    V4SharedPost actualSharedMessageResult = actualV4SharedPost.sharedMessage(sharedMessage);
    String actualToStringResult = actualV4SharedPost.toString();
    V4Message actualMessage = actualV4SharedPost.getMessage();

    // Assert
    assertEquals(
        "class V4SharedPost {\n"
            + "    message: class V4Message {\n"
            + "        messageId: null\n"
            + "        parentMessageId: null\n"
            + "        timestamp: null\n"
            + "        message: null\n"
            + "        sharedMessage: null\n"
            + "        data: null\n"
            + "        attachments: null\n"
            + "        user: null\n"
            + "        stream: null\n"
            + "        externalRecipients: null\n"
            + "        diagnostic: null\n"
            + "        userAgent: null\n"
            + "        originalFormat: null\n"
            + "        disclaimer: null\n"
            + "        sid: null\n"
            + "        replacing: null\n"
            + "        replacedBy: null\n"
            + "        initialTimestamp: null\n"
            + "        initialMessageId: null\n"
            + "        silent: null\n"
            + "    }\n"
            + "    sharedMessage: class V4Message {\n"
            + "        messageId: null\n"
            + "        parentMessageId: null\n"
            + "        timestamp: null\n"
            + "        message: null\n"
            + "        sharedMessage: null\n"
            + "        data: null\n"
            + "        attachments: null\n"
            + "        user: null\n"
            + "        stream: null\n"
            + "        externalRecipients: null\n"
            + "        diagnostic: null\n"
            + "        userAgent: null\n"
            + "        originalFormat: null\n"
            + "        disclaimer: null\n"
            + "        sid: null\n"
            + "        replacing: null\n"
            + "        replacedBy: null\n"
            + "        initialTimestamp: null\n"
            + "        initialMessageId: null\n"
            + "        silent: null\n"
            + "    }\n"
            + "}",
        actualToStringResult);
    assertSame(message, actualMessage);
    assertSame(sharedMessage, actualV4SharedPost.getSharedMessage());
    assertSame(actualV4SharedPost, actualMessageResult);
    assertSame(actualV4SharedPost, actualSharedMessageResult);
  }
}
