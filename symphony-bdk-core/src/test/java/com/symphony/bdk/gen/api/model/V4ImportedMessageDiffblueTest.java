package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V4ImportedMessageDiffblueTest {
  /**
   * Test {@link V4ImportedMessage#addAttachmentsItem(V4ImportedMessageAttachment)}.
   * <ul>
   *   <li>Given {@link V4ImportedMessage} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link V4ImportedMessage#addAttachmentsItem(V4ImportedMessageAttachment)}
   */
  @Test
  @DisplayName("Test addAttachmentsItem(V4ImportedMessageAttachment); given V4ImportedMessage (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V4ImportedMessage V4ImportedMessage.addAttachmentsItem(V4ImportedMessageAttachment)"})
  void testAddAttachmentsItem_givenV4ImportedMessage() {
    // Arrange
    V4ImportedMessage v4ImportedMessage = new V4ImportedMessage();

    // Act and Assert
    assertSame(v4ImportedMessage, v4ImportedMessage.addAttachmentsItem(new V4ImportedMessageAttachment()));
  }

  /**
   * Test {@link V4ImportedMessage#addAttachmentsItem(V4ImportedMessageAttachment)}.
   * <ul>
   *   <li>Given {@link V4ImportedMessage} (default constructor) attachments {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4ImportedMessage#addAttachmentsItem(V4ImportedMessageAttachment)}
   */
  @Test
  @DisplayName("Test addAttachmentsItem(V4ImportedMessageAttachment); given V4ImportedMessage (default constructor) attachments ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V4ImportedMessage V4ImportedMessage.addAttachmentsItem(V4ImportedMessageAttachment)"})
  void testAddAttachmentsItem_givenV4ImportedMessageAttachmentsArrayList() {
    // Arrange
    V4ImportedMessage v4ImportedMessage = new V4ImportedMessage();
    v4ImportedMessage.attachments(new ArrayList<>());

    // Act and Assert
    assertSame(v4ImportedMessage, v4ImportedMessage.addAttachmentsItem(new V4ImportedMessageAttachment()));
  }

  /**
   * Test {@link V4ImportedMessage#addPreviewsItem(V4ImportedMessageAttachment)}.
   * <ul>
   *   <li>Given {@link V4ImportedMessage} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link V4ImportedMessage#addPreviewsItem(V4ImportedMessageAttachment)}
   */
  @Test
  @DisplayName("Test addPreviewsItem(V4ImportedMessageAttachment); given V4ImportedMessage (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V4ImportedMessage V4ImportedMessage.addPreviewsItem(V4ImportedMessageAttachment)"})
  void testAddPreviewsItem_givenV4ImportedMessage() {
    // Arrange
    V4ImportedMessage v4ImportedMessage = new V4ImportedMessage();

    // Act and Assert
    assertSame(v4ImportedMessage, v4ImportedMessage.addPreviewsItem(new V4ImportedMessageAttachment()));
  }

  /**
   * Test {@link V4ImportedMessage#addPreviewsItem(V4ImportedMessageAttachment)}.
   * <ul>
   *   <li>Given {@link V4ImportedMessage} (default constructor) previews {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4ImportedMessage#addPreviewsItem(V4ImportedMessageAttachment)}
   */
  @Test
  @DisplayName("Test addPreviewsItem(V4ImportedMessageAttachment); given V4ImportedMessage (default constructor) previews ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V4ImportedMessage V4ImportedMessage.addPreviewsItem(V4ImportedMessageAttachment)"})
  void testAddPreviewsItem_givenV4ImportedMessagePreviewsArrayList() {
    // Arrange
    V4ImportedMessage v4ImportedMessage = new V4ImportedMessage();
    v4ImportedMessage.previews(new ArrayList<>());

    // Act and Assert
    assertSame(v4ImportedMessage, v4ImportedMessage.addPreviewsItem(new V4ImportedMessageAttachment()));
  }

  /**
   * Test {@link V4ImportedMessage#equals(Object)}, and {@link V4ImportedMessage#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4ImportedMessage#equals(Object)}
   *   <li>{@link V4ImportedMessage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4ImportedMessage.equals(Object)", "int V4ImportedMessage.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4ImportedMessage v4ImportedMessage = new V4ImportedMessage();
    V4ImportedMessage v4ImportedMessage2 = new V4ImportedMessage();

    // Act and Assert
    assertEquals(v4ImportedMessage, v4ImportedMessage2);
    int expectedHashCodeResult = v4ImportedMessage.hashCode();
    assertEquals(expectedHashCodeResult, v4ImportedMessage2.hashCode());
  }

  /**
   * Test {@link V4ImportedMessage#equals(Object)}, and {@link V4ImportedMessage#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4ImportedMessage#equals(Object)}
   *   <li>{@link V4ImportedMessage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4ImportedMessage.equals(Object)", "int V4ImportedMessage.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4ImportedMessage v4ImportedMessage = new V4ImportedMessage();

    // Act and Assert
    assertEquals(v4ImportedMessage, v4ImportedMessage);
    int expectedHashCodeResult = v4ImportedMessage.hashCode();
    assertEquals(expectedHashCodeResult, v4ImportedMessage.hashCode());
  }

  /**
   * Test {@link V4ImportedMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4ImportedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4ImportedMessage.equals(Object)", "int V4ImportedMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V4ImportedMessage v4ImportedMessage = new V4ImportedMessage();
    v4ImportedMessage.addAttachmentsItem(new V4ImportedMessageAttachment());

    // Act and Assert
    assertNotEquals(v4ImportedMessage, new V4ImportedMessage());
  }

  /**
   * Test {@link V4ImportedMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4ImportedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4ImportedMessage.equals(Object)", "int V4ImportedMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V4ImportedMessage v4ImportedMessage = new V4ImportedMessage();
    v4ImportedMessage.message("Not all who wander are lost");
    v4ImportedMessage.addAttachmentsItem(new V4ImportedMessageAttachment());

    // Act and Assert
    assertNotEquals(v4ImportedMessage, new V4ImportedMessage());
  }

  /**
   * Test {@link V4ImportedMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4ImportedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4ImportedMessage.equals(Object)", "int V4ImportedMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V4ImportedMessage v4ImportedMessage = new V4ImportedMessage();
    v4ImportedMessage.data(MessageIdsFromStream.JSON_PROPERTY_DATA);
    v4ImportedMessage.addAttachmentsItem(new V4ImportedMessageAttachment());

    // Act and Assert
    assertNotEquals(v4ImportedMessage, new V4ImportedMessage());
  }

  /**
   * Test {@link V4ImportedMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4ImportedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4ImportedMessage.equals(Object)", "int V4ImportedMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V4ImportedMessage v4ImportedMessage = new V4ImportedMessage();
    v4ImportedMessage.intendedMessageTimestamp(1L);
    v4ImportedMessage.addAttachmentsItem(new V4ImportedMessageAttachment());

    // Act and Assert
    assertNotEquals(v4ImportedMessage, new V4ImportedMessage());
  }

  /**
   * Test {@link V4ImportedMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4ImportedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4ImportedMessage.equals(Object)", "int V4ImportedMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V4ImportedMessage v4ImportedMessage = new V4ImportedMessage();
    v4ImportedMessage.intendedMessageFromUserId(1L);
    v4ImportedMessage.addAttachmentsItem(new V4ImportedMessageAttachment());

    // Act and Assert
    assertNotEquals(v4ImportedMessage, new V4ImportedMessage());
  }

  /**
   * Test {@link V4ImportedMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4ImportedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4ImportedMessage.equals(Object)", "int V4ImportedMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    V4ImportedMessage v4ImportedMessage = new V4ImportedMessage();
    v4ImportedMessage.originatingSystemId("42");
    v4ImportedMessage.addAttachmentsItem(new V4ImportedMessageAttachment());

    // Act and Assert
    assertNotEquals(v4ImportedMessage, new V4ImportedMessage());
  }

  /**
   * Test {@link V4ImportedMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4ImportedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4ImportedMessage.equals(Object)", "int V4ImportedMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    V4ImportedMessage v4ImportedMessage = new V4ImportedMessage();
    v4ImportedMessage.originalMessageId("42");
    v4ImportedMessage.addAttachmentsItem(new V4ImportedMessageAttachment());

    // Act and Assert
    assertNotEquals(v4ImportedMessage, new V4ImportedMessage());
  }

  /**
   * Test {@link V4ImportedMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4ImportedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4ImportedMessage.equals(Object)", "int V4ImportedMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    V4ImportedMessage v4ImportedMessage = new V4ImportedMessage();
    v4ImportedMessage.streamId("42");
    v4ImportedMessage.addAttachmentsItem(new V4ImportedMessageAttachment());

    // Act and Assert
    assertNotEquals(v4ImportedMessage, new V4ImportedMessage());
  }

  /**
   * Test {@link V4ImportedMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4ImportedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4ImportedMessage.equals(Object)", "int V4ImportedMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    V4ImportedMessage v4ImportedMessage = new V4ImportedMessage();
    v4ImportedMessage.addPreviewsItem(new V4ImportedMessageAttachment());

    // Act and Assert
    assertNotEquals(v4ImportedMessage, new V4ImportedMessage());
  }

  /**
   * Test {@link V4ImportedMessage#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4ImportedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4ImportedMessage.equals(Object)", "int V4ImportedMessage.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4ImportedMessage(), null);
  }

  /**
   * Test {@link V4ImportedMessage#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4ImportedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4ImportedMessage.equals(Object)", "int V4ImportedMessage.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4ImportedMessage(), "Different type to V4ImportedMessage");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V4ImportedMessage}
   *   <li>{@link V4ImportedMessage#attachments(List)}
   *   <li>{@link V4ImportedMessage#data(String)}
   *   <li>{@link V4ImportedMessage#intendedMessageFromUserId(Long)}
   *   <li>{@link V4ImportedMessage#intendedMessageTimestamp(Long)}
   *   <li>{@link V4ImportedMessage#message(String)}
   *   <li>{@link V4ImportedMessage#originalMessageId(String)}
   *   <li>{@link V4ImportedMessage#originatingSystemId(String)}
   *   <li>{@link V4ImportedMessage#previews(List)}
   *   <li>{@link V4ImportedMessage#setAttachments(List)}
   *   <li>{@link V4ImportedMessage#setData(String)}
   *   <li>{@link V4ImportedMessage#setIntendedMessageFromUserId(Long)}
   *   <li>{@link V4ImportedMessage#setIntendedMessageTimestamp(Long)}
   *   <li>{@link V4ImportedMessage#setMessage(String)}
   *   <li>{@link V4ImportedMessage#setOriginalMessageId(String)}
   *   <li>{@link V4ImportedMessage#setOriginatingSystemId(String)}
   *   <li>{@link V4ImportedMessage#setPreviews(List)}
   *   <li>{@link V4ImportedMessage#setStreamId(String)}
   *   <li>{@link V4ImportedMessage#streamId(String)}
   *   <li>{@link V4ImportedMessage#toString()}
   *   <li>{@link V4ImportedMessage#getAttachments()}
   *   <li>{@link V4ImportedMessage#getData()}
   *   <li>{@link V4ImportedMessage#getIntendedMessageFromUserId()}
   *   <li>{@link V4ImportedMessage#getIntendedMessageTimestamp()}
   *   <li>{@link V4ImportedMessage#getMessage()}
   *   <li>{@link V4ImportedMessage#getOriginalMessageId()}
   *   <li>{@link V4ImportedMessage#getOriginatingSystemId()}
   *   <li>{@link V4ImportedMessage#getPreviews()}
   *   <li>{@link V4ImportedMessage#getStreamId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V4ImportedMessage.<init>()", "V4ImportedMessage V4ImportedMessage.attachments(List)",
      "V4ImportedMessage V4ImportedMessage.data(String)", "List V4ImportedMessage.getAttachments()",
      "String V4ImportedMessage.getData()", "Long V4ImportedMessage.getIntendedMessageFromUserId()",
      "Long V4ImportedMessage.getIntendedMessageTimestamp()", "String V4ImportedMessage.getMessage()",
      "String V4ImportedMessage.getOriginalMessageId()", "String V4ImportedMessage.getOriginatingSystemId()",
      "List V4ImportedMessage.getPreviews()", "String V4ImportedMessage.getStreamId()",
      "V4ImportedMessage V4ImportedMessage.intendedMessageFromUserId(Long)",
      "V4ImportedMessage V4ImportedMessage.intendedMessageTimestamp(Long)",
      "V4ImportedMessage V4ImportedMessage.message(String)",
      "V4ImportedMessage V4ImportedMessage.originalMessageId(String)",
      "V4ImportedMessage V4ImportedMessage.originatingSystemId(String)",
      "V4ImportedMessage V4ImportedMessage.previews(List)", "void V4ImportedMessage.setAttachments(List)",
      "void V4ImportedMessage.setData(String)", "void V4ImportedMessage.setIntendedMessageFromUserId(Long)",
      "void V4ImportedMessage.setIntendedMessageTimestamp(Long)", "void V4ImportedMessage.setMessage(String)",
      "void V4ImportedMessage.setOriginalMessageId(String)", "void V4ImportedMessage.setOriginatingSystemId(String)",
      "void V4ImportedMessage.setPreviews(List)", "void V4ImportedMessage.setStreamId(String)",
      "V4ImportedMessage V4ImportedMessage.streamId(String)", "String V4ImportedMessage.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    V4ImportedMessage actualV4ImportedMessage = new V4ImportedMessage();
    V4ImportedMessage actualAttachmentsResult = actualV4ImportedMessage.attachments(new ArrayList<>());
    V4ImportedMessage actualDataResult = actualV4ImportedMessage.data(MessageIdsFromStream.JSON_PROPERTY_DATA);
    V4ImportedMessage actualIntendedMessageFromUserIdResult = actualV4ImportedMessage.intendedMessageFromUserId(1L);
    V4ImportedMessage actualIntendedMessageTimestampResult = actualV4ImportedMessage.intendedMessageTimestamp(1L);
    V4ImportedMessage actualMessageResult = actualV4ImportedMessage.message("Not all who wander are lost");
    V4ImportedMessage actualOriginalMessageIdResult = actualV4ImportedMessage.originalMessageId("42");
    V4ImportedMessage actualOriginatingSystemIdResult = actualV4ImportedMessage.originatingSystemId("42");
    V4ImportedMessage actualPreviewsResult = actualV4ImportedMessage.previews(new ArrayList<>());
    ArrayList<V4ImportedMessageAttachment> attachments = new ArrayList<>();
    actualV4ImportedMessage.setAttachments(attachments);
    actualV4ImportedMessage.setData(MessageIdsFromStream.JSON_PROPERTY_DATA);
    actualV4ImportedMessage.setIntendedMessageFromUserId(1L);
    actualV4ImportedMessage.setIntendedMessageTimestamp(1L);
    actualV4ImportedMessage.setMessage("Not all who wander are lost");
    actualV4ImportedMessage.setOriginalMessageId("42");
    actualV4ImportedMessage.setOriginatingSystemId("42");
    ArrayList<V4ImportedMessageAttachment> previews = new ArrayList<>();
    actualV4ImportedMessage.setPreviews(previews);
    actualV4ImportedMessage.setStreamId("42");
    V4ImportedMessage actualStreamIdResult = actualV4ImportedMessage.streamId("42");
    String actualToStringResult = actualV4ImportedMessage.toString();
    List<V4ImportedMessageAttachment> actualAttachments = actualV4ImportedMessage.getAttachments();
    String actualData = actualV4ImportedMessage.getData();
    Long actualIntendedMessageFromUserId = actualV4ImportedMessage.getIntendedMessageFromUserId();
    Long actualIntendedMessageTimestamp = actualV4ImportedMessage.getIntendedMessageTimestamp();
    String actualMessage = actualV4ImportedMessage.getMessage();
    String actualOriginalMessageId = actualV4ImportedMessage.getOriginalMessageId();
    String actualOriginatingSystemId = actualV4ImportedMessage.getOriginatingSystemId();
    List<V4ImportedMessageAttachment> actualPreviews = actualV4ImportedMessage.getPreviews();

    // Assert
    assertEquals("42", actualOriginalMessageId);
    assertEquals("42", actualOriginatingSystemId);
    assertEquals("42", actualV4ImportedMessage.getStreamId());
    assertEquals("Not all who wander are lost", actualMessage);
    assertEquals("class V4ImportedMessage {\n" + "    message: Not all who wander are lost\n" + "    data: Data\n"
        + "    intendedMessageTimestamp: 1\n" + "    intendedMessageFromUserId: 1\n" + "    originatingSystemId: 42\n"
        + "    originalMessageId: 42\n" + "    streamId: 42\n" + "    attachments: []\n" + "    previews: []\n" + "}",
        actualToStringResult);
    assertEquals(1L, actualIntendedMessageFromUserId.longValue());
    assertEquals(1L, actualIntendedMessageTimestamp.longValue());
    assertTrue(actualAttachments.isEmpty());
    assertTrue(actualPreviews.isEmpty());
    assertEquals(MessageIdsFromStream.JSON_PROPERTY_DATA, actualData);
    assertSame(actualV4ImportedMessage, actualAttachmentsResult);
    assertSame(actualV4ImportedMessage, actualDataResult);
    assertSame(actualV4ImportedMessage, actualIntendedMessageFromUserIdResult);
    assertSame(actualV4ImportedMessage, actualIntendedMessageTimestampResult);
    assertSame(actualV4ImportedMessage, actualMessageResult);
    assertSame(actualV4ImportedMessage, actualOriginalMessageIdResult);
    assertSame(actualV4ImportedMessage, actualOriginatingSystemIdResult);
    assertSame(actualV4ImportedMessage, actualPreviewsResult);
    assertSame(actualV4ImportedMessage, actualStreamIdResult);
    assertSame(attachments, actualAttachments);
    assertSame(previews, actualPreviews);
  }
}
