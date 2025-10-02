package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V2MessageDiffblueTest {
  /**
   * Test {@link V2Message#addAttachmentsItem(AttachmentInfo)}.
   *
   * <ul>
   *   <li>Given {@link V2Message} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link V2Message#addAttachmentsItem(AttachmentInfo)}
   */
  @Test
  @DisplayName("Test addAttachmentsItem(AttachmentInfo); given V2Message (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2Message V2Message.addAttachmentsItem(AttachmentInfo)"})
  void testAddAttachmentsItem_givenV2Message() {
    // Arrange
    V2Message v2Message = new V2Message();

    // Act
    V2Message actualAddAttachmentsItemResult = v2Message.addAttachmentsItem(new AttachmentInfo());

    // Assert
    assertSame(v2Message, actualAddAttachmentsItemResult);
  }

  /**
   * Test {@link V2Message#addAttachmentsItem(AttachmentInfo)}.
   *
   * <ul>
   *   <li>Given {@link V2Message} (default constructor) attachments {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link V2Message#addAttachmentsItem(AttachmentInfo)}
   */
  @Test
  @DisplayName(
      "Test addAttachmentsItem(AttachmentInfo); given V2Message (default constructor) attachments ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2Message V2Message.addAttachmentsItem(AttachmentInfo)"})
  void testAddAttachmentsItem_givenV2MessageAttachmentsArrayList() {
    // Arrange
    V2Message v2Message = new V2Message();
    v2Message.attachments(new ArrayList<>());

    // Act
    V2Message actualAddAttachmentsItemResult = v2Message.addAttachmentsItem(new AttachmentInfo());

    // Assert
    assertSame(v2Message, actualAddAttachmentsItemResult);
  }

  /**
   * Test {@link V2Message#equals(Object)}, and {@link V2Message#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2Message#equals(Object)}
   *   <li>{@link V2Message#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2Message.equals(Object)", "int V2Message.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2Message v2Message = new V2Message();
    V2Message v2Message2 = new V2Message();

    // Act and Assert
    assertEquals(v2Message, v2Message2);
    assertEquals(v2Message.hashCode(), v2Message2.hashCode());
  }

  /**
   * Test {@link V2Message#equals(Object)}, and {@link V2Message#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2Message#equals(Object)}
   *   <li>{@link V2Message#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2Message.equals(Object)", "int V2Message.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2Message v2Message = new V2Message();

    // Act and Assert
    assertEquals(v2Message, v2Message);
    int expectedHashCodeResult = v2Message.hashCode();
    assertEquals(expectedHashCodeResult, v2Message.hashCode());
  }

  /**
   * Test {@link V2Message#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2Message#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2Message.equals(Object)", "int V2Message.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V2Message v2Message = new V2Message();
    v2Message.addAttachmentsItem(new AttachmentInfo());

    // Act and Assert
    assertNotEquals(v2Message, new V2Message());
  }

  /**
   * Test {@link V2Message#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2Message#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2Message.equals(Object)", "int V2Message.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V2Message v2Message = new V2Message();
    v2Message.message("Not all who wander are lost");
    v2Message.addAttachmentsItem(new AttachmentInfo());

    // Act and Assert
    assertNotEquals(v2Message, new V2Message());
  }

  /**
   * Test {@link V2Message#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2Message#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2Message.equals(Object)", "int V2Message.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V2Message v2Message = new V2Message();
    v2Message.fromUserId(1L);
    v2Message.addAttachmentsItem(new AttachmentInfo());

    // Act and Assert
    assertNotEquals(v2Message, new V2Message());
  }

  /**
   * Test {@link V2Message#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2Message#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2Message.equals(Object)", "int V2Message.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V2Message v2Message = new V2Message();
    v2Message.id("42");

    // Act and Assert
    assertNotEquals(v2Message, new V2Message());
  }

  /**
   * Test {@link V2Message#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2Message#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2Message.equals(Object)", "int V2Message.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2Message(), null);
  }

  /**
   * Test {@link V2Message#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2Message#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2Message.equals(Object)", "int V2Message.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2Message(), "Different type to V2Message");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V2Message}
   *   <li>{@link V2Message#attachments(List)}
   *   <li>{@link V2Message#fromUserId(Long)}
   *   <li>{@link V2Message#message(String)}
   *   <li>{@link V2Message#setAttachments(List)}
   *   <li>{@link V2Message#setFromUserId(Long)}
   *   <li>{@link V2Message#setMessage(String)}
   *   <li>{@link V2Message#toString()}
   *   <li>{@link V2Message#getAttachments()}
   *   <li>{@link V2Message#getFromUserId()}
   *   <li>{@link V2Message#getMessage()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V2Message.<init>()",
    "V2Message V2Message.attachments(List)",
    "V2Message V2Message.fromUserId(Long)",
    "List V2Message.getAttachments()",
    "Long V2Message.getFromUserId()",
    "String V2Message.getMessage()",
    "V2Message V2Message.message(String)",
    "void V2Message.setAttachments(List)",
    "void V2Message.setFromUserId(Long)",
    "void V2Message.setMessage(String)",
    "String V2Message.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V2Message actualV2Message = new V2Message();
    V2Message actualAttachmentsResult = actualV2Message.attachments(new ArrayList<>());
    V2Message actualFromUserIdResult = actualV2Message.fromUserId(1L);
    V2Message actualMessageResult = actualV2Message.message("Not all who wander are lost");
    ArrayList<AttachmentInfo> attachments = new ArrayList<>();
    actualV2Message.setAttachments(attachments);
    actualV2Message.setFromUserId(1L);
    actualV2Message.setMessage("Not all who wander are lost");
    String actualToStringResult = actualV2Message.toString();
    List<AttachmentInfo> actualAttachments = actualV2Message.getAttachments();
    Long actualFromUserId = actualV2Message.getFromUserId();

    // Assert
    assertEquals("Not all who wander are lost", actualV2Message.getMessage());
    assertEquals(
        "class V2Message {\n"
            + "    class V2BaseMessage {\n"
            + "        id: null\n"
            + "        timestamp: null\n"
            + "        v2messageType: null\n"
            + "        streamId: null\n"
            + "    }\n"
            + "    message: Not all who wander are lost\n"
            + "    fromUserId: 1\n"
            + "    attachments: []\n"
            + "}",
        actualToStringResult);
    assertNull(actualV2Message.getId());
    assertNull(actualV2Message.getStreamId());
    assertNull(actualV2Message.getTimestamp());
    assertNull(actualV2Message.getV2messageType());
    assertEquals(1L, actualFromUserId.longValue());
    assertTrue(actualAttachments.isEmpty());
    assertSame(actualV2Message, actualAttachmentsResult);
    assertSame(actualV2Message, actualFromUserIdResult);
    assertSame(actualV2Message, actualMessageResult);
    assertSame(attachments, actualAttachments);
  }
}
