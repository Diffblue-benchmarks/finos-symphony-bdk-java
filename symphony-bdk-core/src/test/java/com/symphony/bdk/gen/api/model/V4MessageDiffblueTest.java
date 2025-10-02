package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V4MessageDiffblueTest {
  /**
   * Test {@link V4Message#addAttachmentsItem(V4AttachmentInfo)}.
   *
   * <ul>
   *   <li>Given {@link V4Message} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link V4Message#addAttachmentsItem(V4AttachmentInfo)}
   */
  @Test
  @DisplayName("Test addAttachmentsItem(V4AttachmentInfo); given V4Message (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V4Message V4Message.addAttachmentsItem(V4AttachmentInfo)"})
  void testAddAttachmentsItem_givenV4Message() {
    // Arrange
    V4Message v4Message = new V4Message();

    // Act
    V4Message actualAddAttachmentsItemResult = v4Message.addAttachmentsItem(new V4AttachmentInfo());

    // Assert
    assertSame(v4Message, actualAddAttachmentsItemResult);
  }

  /**
   * Test {@link V4Message#addAttachmentsItem(V4AttachmentInfo)}.
   *
   * <ul>
   *   <li>Given {@link V4Message} (default constructor) attachments {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link V4Message#addAttachmentsItem(V4AttachmentInfo)}
   */
  @Test
  @DisplayName(
      "Test addAttachmentsItem(V4AttachmentInfo); given V4Message (default constructor) attachments ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V4Message V4Message.addAttachmentsItem(V4AttachmentInfo)"})
  void testAddAttachmentsItem_givenV4MessageAttachmentsArrayList() {
    // Arrange
    V4Message v4Message = new V4Message();
    v4Message.attachments(new ArrayList<>());

    // Act
    V4Message actualAddAttachmentsItemResult = v4Message.addAttachmentsItem(new V4AttachmentInfo());

    // Assert
    assertSame(v4Message, actualAddAttachmentsItemResult);
  }

  /**
   * Test {@link V4Message#equals(Object)}, and {@link V4Message#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4Message#equals(Object)}
   *   <li>{@link V4Message#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4Message v4Message = new V4Message();
    V4Message v4Message2 = new V4Message();

    // Act and Assert
    assertEquals(v4Message, v4Message2);
    assertEquals(v4Message.hashCode(), v4Message2.hashCode());
  }

  /**
   * Test {@link V4Message#equals(Object)}, and {@link V4Message#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4Message#equals(Object)}
   *   <li>{@link V4Message#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4Message v4Message = new V4Message();

    // Act and Assert
    assertEquals(v4Message, v4Message);
    int expectedHashCodeResult = v4Message.hashCode();
    assertEquals(expectedHashCodeResult, v4Message.hashCode());
  }

  /**
   * Test {@link V4Message#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Message#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V4Message v4Message = new V4Message();
    v4Message.addAttachmentsItem(new V4AttachmentInfo());

    // Act and Assert
    assertNotEquals(v4Message, new V4Message());
  }

  /**
   * Test {@link V4Message#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Message#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V4Message v4Message = new V4Message();
    v4Message.messageId("42");
    v4Message.addAttachmentsItem(new V4AttachmentInfo());

    // Act and Assert
    assertNotEquals(v4Message, new V4Message());
  }

  /**
   * Test {@link V4Message#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Message#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V4Message v4Message = new V4Message();
    v4Message.parentMessageId("42");
    v4Message.addAttachmentsItem(new V4AttachmentInfo());

    // Act and Assert
    assertNotEquals(v4Message, new V4Message());
  }

  /**
   * Test {@link V4Message#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Message#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V4Message v4Message = new V4Message();
    v4Message.timestamp(10L);
    v4Message.addAttachmentsItem(new V4AttachmentInfo());

    // Act and Assert
    assertNotEquals(v4Message, new V4Message());
  }

  /**
   * Test {@link V4Message#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Message#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V4Message v4Message = new V4Message();
    v4Message.message("Not all who wander are lost");
    v4Message.addAttachmentsItem(new V4AttachmentInfo());

    // Act and Assert
    assertNotEquals(v4Message, new V4Message());
  }

  /**
   * Test {@link V4Message#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Message#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    V4Message v4Message = new V4Message();
    v4Message.sharedMessage(new V4Message());
    v4Message.addAttachmentsItem(new V4AttachmentInfo());

    // Act and Assert
    assertNotEquals(v4Message, new V4Message());
  }

  /**
   * Test {@link V4Message#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Message#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    V4Message v4Message = new V4Message();
    v4Message.data(MessageIdsFromStream.JSON_PROPERTY_DATA);
    v4Message.addAttachmentsItem(new V4AttachmentInfo());

    // Act and Assert
    assertNotEquals(v4Message, new V4Message());
  }

  /**
   * Test {@link V4Message#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Message#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    V4Message v4Message = new V4Message();
    v4Message.user(new V4User());

    // Act and Assert
    assertNotEquals(v4Message, new V4Message());
  }

  /**
   * Test {@link V4Message#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Message#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    V4Message v4Message = new V4Message();
    v4Message.stream(new V4Stream());

    // Act and Assert
    assertNotEquals(v4Message, new V4Message());
  }

  /**
   * Test {@link V4Message#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Message#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual10() {
    // Arrange
    V4Message v4Message = new V4Message();
    v4Message.externalRecipients(true);

    // Act and Assert
    assertNotEquals(v4Message, new V4Message());
  }

  /**
   * Test {@link V4Message#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Message#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual11() {
    // Arrange
    V4Message v4Message = new V4Message();
    v4Message.diagnostic("Diagnostic");

    // Act and Assert
    assertNotEquals(v4Message, new V4Message());
  }

  /**
   * Test {@link V4Message#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Message#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual12() {
    // Arrange
    V4Message v4Message = new V4Message();
    v4Message.userAgent("User Agent");

    // Act and Assert
    assertNotEquals(v4Message, new V4Message());
  }

  /**
   * Test {@link V4Message#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Message#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual13() {
    // Arrange
    V4Message v4Message = new V4Message();
    v4Message.originalFormat("Original Format");

    // Act and Assert
    assertNotEquals(v4Message, new V4Message());
  }

  /**
   * Test {@link V4Message#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Message#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual14() {
    // Arrange
    V4Message v4Message = new V4Message();
    v4Message.disclaimer("Disclaimer");

    // Act and Assert
    assertNotEquals(v4Message, new V4Message());
  }

  /**
   * Test {@link V4Message#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Message#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual15() {
    // Arrange
    V4Message v4Message = new V4Message();
    v4Message.sid("Sid");

    // Act and Assert
    assertNotEquals(v4Message, new V4Message());
  }

  /**
   * Test {@link V4Message#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Message#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual16() {
    // Arrange
    V4Message v4Message = new V4Message();
    v4Message.replacing("Replacing");

    // Act and Assert
    assertNotEquals(v4Message, new V4Message());
  }

  /**
   * Test {@link V4Message#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Message#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual17() {
    // Arrange
    V4Message v4Message = new V4Message();
    v4Message.replacedBy("Replaced By");

    // Act and Assert
    assertNotEquals(v4Message, new V4Message());
  }

  /**
   * Test {@link V4Message#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Message#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual18() {
    // Arrange
    V4Message v4Message = new V4Message();
    v4Message.initialTimestamp(1L);

    // Act and Assert
    assertNotEquals(v4Message, new V4Message());
  }

  /**
   * Test {@link V4Message#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Message#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual19() {
    // Arrange
    V4Message v4Message = new V4Message();
    v4Message.initialMessageId("42");

    // Act and Assert
    assertNotEquals(v4Message, new V4Message());
  }

  /**
   * Test {@link V4Message#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Message#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual20() {
    // Arrange
    V4Message v4Message = new V4Message();
    v4Message.silent(true);

    // Act and Assert
    assertNotEquals(v4Message, new V4Message());
  }

  /**
   * Test {@link V4Message#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Message#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4Message(), null);
  }

  /**
   * Test {@link V4Message#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Message#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4Message(), "Different type to V4Message");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V4Message}
   *   <li>{@link V4Message#attachments(List)}
   *   <li>{@link V4Message#data(String)}
   *   <li>{@link V4Message#diagnostic(String)}
   *   <li>{@link V4Message#disclaimer(String)}
   *   <li>{@link V4Message#externalRecipients(Boolean)}
   *   <li>{@link V4Message#initialMessageId(String)}
   *   <li>{@link V4Message#initialTimestamp(Long)}
   *   <li>{@link V4Message#message(String)}
   *   <li>{@link V4Message#messageId(String)}
   *   <li>{@link V4Message#originalFormat(String)}
   *   <li>{@link V4Message#parentMessageId(String)}
   *   <li>{@link V4Message#replacedBy(String)}
   *   <li>{@link V4Message#replacing(String)}
   *   <li>{@link V4Message#setAttachments(List)}
   *   <li>{@link V4Message#setData(String)}
   *   <li>{@link V4Message#setDiagnostic(String)}
   *   <li>{@link V4Message#setDisclaimer(String)}
   *   <li>{@link V4Message#setExternalRecipients(Boolean)}
   *   <li>{@link V4Message#setInitialMessageId(String)}
   *   <li>{@link V4Message#setInitialTimestamp(Long)}
   *   <li>{@link V4Message#setMessage(String)}
   *   <li>{@link V4Message#setMessageId(String)}
   *   <li>{@link V4Message#setOriginalFormat(String)}
   *   <li>{@link V4Message#setParentMessageId(String)}
   *   <li>{@link V4Message#setReplacedBy(String)}
   *   <li>{@link V4Message#setReplacing(String)}
   *   <li>{@link V4Message#setSharedMessage(V4Message)}
   *   <li>{@link V4Message#setSid(String)}
   *   <li>{@link V4Message#setSilent(Boolean)}
   *   <li>{@link V4Message#setStream(V4Stream)}
   *   <li>{@link V4Message#setTimestamp(Long)}
   *   <li>{@link V4Message#setUser(V4User)}
   *   <li>{@link V4Message#setUserAgent(String)}
   *   <li>{@link V4Message#sharedMessage(V4Message)}
   *   <li>{@link V4Message#sid(String)}
   *   <li>{@link V4Message#silent(Boolean)}
   *   <li>{@link V4Message#stream(V4Stream)}
   *   <li>{@link V4Message#timestamp(Long)}
   *   <li>{@link V4Message#user(V4User)}
   *   <li>{@link V4Message#userAgent(String)}
   *   <li>{@link V4Message#toString()}
   *   <li>{@link V4Message#getAttachments()}
   *   <li>{@link V4Message#getData()}
   *   <li>{@link V4Message#getDiagnostic()}
   *   <li>{@link V4Message#getDisclaimer()}
   *   <li>{@link V4Message#getExternalRecipients()}
   *   <li>{@link V4Message#getInitialMessageId()}
   *   <li>{@link V4Message#getInitialTimestamp()}
   *   <li>{@link V4Message#getMessage()}
   *   <li>{@link V4Message#getMessageId()}
   *   <li>{@link V4Message#getOriginalFormat()}
   *   <li>{@link V4Message#getParentMessageId()}
   *   <li>{@link V4Message#getReplacedBy()}
   *   <li>{@link V4Message#getReplacing()}
   *   <li>{@link V4Message#getSharedMessage()}
   *   <li>{@link V4Message#getSid()}
   *   <li>{@link V4Message#getSilent()}
   *   <li>{@link V4Message#getStream()}
   *   <li>{@link V4Message#getTimestamp()}
   *   <li>{@link V4Message#getUser()}
   *   <li>{@link V4Message#getUserAgent()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V4Message.<init>()",
    "V4Message V4Message.attachments(List)",
    "V4Message V4Message.data(String)",
    "V4Message V4Message.diagnostic(String)",
    "V4Message V4Message.disclaimer(String)",
    "V4Message V4Message.externalRecipients(Boolean)",
    "List V4Message.getAttachments()",
    "String V4Message.getData()",
    "String V4Message.getDiagnostic()",
    "String V4Message.getDisclaimer()",
    "Boolean V4Message.getExternalRecipients()",
    "String V4Message.getInitialMessageId()",
    "Long V4Message.getInitialTimestamp()",
    "String V4Message.getMessage()",
    "String V4Message.getMessageId()",
    "String V4Message.getOriginalFormat()",
    "String V4Message.getParentMessageId()",
    "String V4Message.getReplacedBy()",
    "String V4Message.getReplacing()",
    "V4Message V4Message.getSharedMessage()",
    "String V4Message.getSid()",
    "Boolean V4Message.getSilent()",
    "V4Stream V4Message.getStream()",
    "Long V4Message.getTimestamp()",
    "V4User V4Message.getUser()",
    "String V4Message.getUserAgent()",
    "V4Message V4Message.initialMessageId(String)",
    "V4Message V4Message.initialTimestamp(Long)",
    "V4Message V4Message.message(String)",
    "V4Message V4Message.messageId(String)",
    "V4Message V4Message.originalFormat(String)",
    "V4Message V4Message.parentMessageId(String)",
    "V4Message V4Message.replacedBy(String)",
    "V4Message V4Message.replacing(String)",
    "void V4Message.setAttachments(List)",
    "void V4Message.setData(String)",
    "void V4Message.setDiagnostic(String)",
    "void V4Message.setDisclaimer(String)",
    "void V4Message.setExternalRecipients(Boolean)",
    "void V4Message.setInitialMessageId(String)",
    "void V4Message.setInitialTimestamp(Long)",
    "void V4Message.setMessage(String)",
    "void V4Message.setMessageId(String)",
    "void V4Message.setOriginalFormat(String)",
    "void V4Message.setParentMessageId(String)",
    "void V4Message.setReplacedBy(String)",
    "void V4Message.setReplacing(String)",
    "void V4Message.setSharedMessage(V4Message)",
    "void V4Message.setSid(String)",
    "void V4Message.setSilent(Boolean)",
    "void V4Message.setStream(V4Stream)",
    "void V4Message.setTimestamp(Long)",
    "void V4Message.setUser(V4User)",
    "void V4Message.setUserAgent(String)",
    "V4Message V4Message.sharedMessage(V4Message)",
    "V4Message V4Message.sid(String)",
    "V4Message V4Message.silent(Boolean)",
    "V4Message V4Message.stream(V4Stream)",
    "V4Message V4Message.timestamp(Long)",
    "String V4Message.toString()",
    "V4Message V4Message.user(V4User)",
    "V4Message V4Message.userAgent(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V4Message actualV4Message = new V4Message();
    V4Message actualAttachmentsResult = actualV4Message.attachments(new ArrayList<>());
    V4Message actualDataResult = actualV4Message.data(MessageIdsFromStream.JSON_PROPERTY_DATA);
    V4Message actualDiagnosticResult = actualV4Message.diagnostic("Diagnostic");
    V4Message actualDisclaimerResult = actualV4Message.disclaimer("Disclaimer");
    V4Message actualExternalRecipientsResult = actualV4Message.externalRecipients(true);
    V4Message actualInitialMessageIdResult = actualV4Message.initialMessageId("42");
    V4Message actualInitialTimestampResult = actualV4Message.initialTimestamp(1L);
    V4Message actualMessageResult = actualV4Message.message("Not all who wander are lost");
    V4Message actualMessageIdResult = actualV4Message.messageId("42");
    V4Message actualOriginalFormatResult = actualV4Message.originalFormat("Original Format");
    V4Message actualParentMessageIdResult = actualV4Message.parentMessageId("42");
    V4Message actualReplacedByResult = actualV4Message.replacedBy("Replaced By");
    V4Message actualReplacingResult = actualV4Message.replacing("Replacing");
    ArrayList<V4AttachmentInfo> attachments = new ArrayList<>();
    actualV4Message.setAttachments(attachments);
    actualV4Message.setData(MessageIdsFromStream.JSON_PROPERTY_DATA);
    actualV4Message.setDiagnostic("Diagnostic");
    actualV4Message.setDisclaimer("Disclaimer");
    actualV4Message.setExternalRecipients(true);
    actualV4Message.setInitialMessageId("42");
    actualV4Message.setInitialTimestamp(1L);
    actualV4Message.setMessage("Not all who wander are lost");
    actualV4Message.setMessageId("42");
    actualV4Message.setOriginalFormat("Original Format");
    actualV4Message.setParentMessageId("42");
    actualV4Message.setReplacedBy("Replaced By");
    actualV4Message.setReplacing("Replacing");
    actualV4Message.setSharedMessage(new V4Message());
    actualV4Message.setSid("Sid");
    actualV4Message.setSilent(true);
    actualV4Message.setStream(new V4Stream());
    actualV4Message.setTimestamp(10L);
    actualV4Message.setUser(new V4User());
    actualV4Message.setUserAgent("User Agent");
    V4Message sharedMessage = new V4Message();
    V4Message actualSharedMessageResult = actualV4Message.sharedMessage(sharedMessage);
    V4Message actualSidResult = actualV4Message.sid("Sid");
    V4Message actualSilentResult = actualV4Message.silent(true);
    V4Stream stream = new V4Stream();
    V4Message actualStreamResult = actualV4Message.stream(stream);
    V4Message actualTimestampResult = actualV4Message.timestamp(10L);
    V4User user = new V4User();
    V4Message actualUserResult = actualV4Message.user(user);
    V4Message actualUserAgentResult = actualV4Message.userAgent("User Agent");
    String actualToStringResult = actualV4Message.toString();
    List<V4AttachmentInfo> actualAttachments = actualV4Message.getAttachments();
    String actualData = actualV4Message.getData();
    String actualDiagnostic = actualV4Message.getDiagnostic();
    String actualDisclaimer = actualV4Message.getDisclaimer();
    Boolean actualExternalRecipients = actualV4Message.getExternalRecipients();
    String actualInitialMessageId = actualV4Message.getInitialMessageId();
    Long actualInitialTimestamp = actualV4Message.getInitialTimestamp();
    String actualMessage = actualV4Message.getMessage();
    String actualMessageId = actualV4Message.getMessageId();
    String actualOriginalFormat = actualV4Message.getOriginalFormat();
    String actualParentMessageId = actualV4Message.getParentMessageId();
    String actualReplacedBy = actualV4Message.getReplacedBy();
    String actualReplacing = actualV4Message.getReplacing();
    V4Message actualSharedMessage = actualV4Message.getSharedMessage();
    String actualSid = actualV4Message.getSid();
    Boolean actualSilent = actualV4Message.getSilent();
    V4Stream actualStream = actualV4Message.getStream();
    Long actualTimestamp = actualV4Message.getTimestamp();
    V4User actualUser = actualV4Message.getUser();

    // Assert
    assertEquals("42", actualInitialMessageId);
    assertEquals("42", actualMessageId);
    assertEquals("42", actualParentMessageId);
    assertEquals("Diagnostic", actualDiagnostic);
    assertEquals("Disclaimer", actualDisclaimer);
    assertEquals("Not all who wander are lost", actualMessage);
    assertEquals("Original Format", actualOriginalFormat);
    assertEquals("Replaced By", actualReplacedBy);
    assertEquals("Replacing", actualReplacing);
    assertEquals("Sid", actualSid);
    assertEquals("User Agent", actualV4Message.getUserAgent());
    assertEquals(
        "class V4Message {\n"
            + "    messageId: 42\n"
            + "    parentMessageId: 42\n"
            + "    timestamp: 10\n"
            + "    message: Not all who wander are lost\n"
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
            + "    data: Data\n"
            + "    attachments: []\n"
            + "    user: class V4User {\n"
            + "        userId: null\n"
            + "        firstName: null\n"
            + "        lastName: null\n"
            + "        displayName: null\n"
            + "        email: null\n"
            + "        username: null\n"
            + "    }\n"
            + "    stream: class V4Stream {\n"
            + "        streamId: null\n"
            + "        streamType: null\n"
            + "        roomName: null\n"
            + "        members: null\n"
            + "        external: null\n"
            + "        crossPod: null\n"
            + "        recipientTenantIds: null\n"
            + "    }\n"
            + "    externalRecipients: true\n"
            + "    diagnostic: Diagnostic\n"
            + "    userAgent: User Agent\n"
            + "    originalFormat: Original Format\n"
            + "    disclaimer: Disclaimer\n"
            + "    sid: Sid\n"
            + "    replacing: Replacing\n"
            + "    replacedBy: Replaced By\n"
            + "    initialTimestamp: 1\n"
            + "    initialMessageId: 42\n"
            + "    silent: true\n"
            + "}",
        actualToStringResult);
    assertEquals(10L, actualTimestamp.longValue());
    assertEquals(1L, actualInitialTimestamp.longValue());
    assertTrue(actualExternalRecipients);
    assertTrue(actualSilent);
    assertTrue(actualAttachments.isEmpty());
    assertEquals(MessageIdsFromStream.JSON_PROPERTY_DATA, actualData);
    assertSame(actualV4Message, actualAttachmentsResult);
    assertSame(actualV4Message, actualDataResult);
    assertSame(actualV4Message, actualDiagnosticResult);
    assertSame(actualV4Message, actualDisclaimerResult);
    assertSame(actualV4Message, actualExternalRecipientsResult);
    assertSame(sharedMessage, actualSharedMessage);
    assertSame(actualV4Message, actualInitialMessageIdResult);
    assertSame(actualV4Message, actualInitialTimestampResult);
    assertSame(actualV4Message, actualMessageResult);
    assertSame(actualV4Message, actualMessageIdResult);
    assertSame(actualV4Message, actualOriginalFormatResult);
    assertSame(actualV4Message, actualParentMessageIdResult);
    assertSame(actualV4Message, actualReplacedByResult);
    assertSame(actualV4Message, actualReplacingResult);
    assertSame(actualV4Message, actualSharedMessageResult);
    assertSame(actualV4Message, actualSidResult);
    assertSame(actualV4Message, actualSilentResult);
    assertSame(actualV4Message, actualStreamResult);
    assertSame(actualV4Message, actualTimestampResult);
    assertSame(actualV4Message, actualUserResult);
    assertSame(actualV4Message, actualUserAgentResult);
    assertSame(stream, actualStream);
    assertSame(user, actualUser);
    assertSame(attachments, actualAttachments);
  }
}
