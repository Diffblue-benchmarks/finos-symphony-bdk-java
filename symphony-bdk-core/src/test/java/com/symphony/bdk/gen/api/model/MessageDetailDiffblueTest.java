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

class MessageDetailDiffblueTest {
  /**
   * Test {@link MessageDetail#addDownloadReceiptCountsItem(MessageDownloadReceiptCount)}.
   * <p>
   * Method under test: {@link MessageDetail#addDownloadReceiptCountsItem(MessageDownloadReceiptCount)}
   */
  @Test
  @DisplayName("Test addDownloadReceiptCountsItem(MessageDownloadReceiptCount)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"MessageDetail MessageDetail.addDownloadReceiptCountsItem(MessageDownloadReceiptCount)"})
  void testAddDownloadReceiptCountsItem() {
    // Arrange
    MessageDetail messageDetail = new MessageDetail();
    messageDetail.downloadReceiptCounts(new ArrayList<>());

    // Act and Assert
    assertSame(messageDetail, messageDetail.addDownloadReceiptCountsItem(new MessageDownloadReceiptCount()));
  }

  /**
   * Test {@link MessageDetail#addDownloadReceiptCountsItem(MessageDownloadReceiptCount)}.
   * <ul>
   *   <li>Given {@link MessageDetail} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageDetail#addDownloadReceiptCountsItem(MessageDownloadReceiptCount)}
   */
  @Test
  @DisplayName("Test addDownloadReceiptCountsItem(MessageDownloadReceiptCount); given MessageDetail (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"MessageDetail MessageDetail.addDownloadReceiptCountsItem(MessageDownloadReceiptCount)"})
  void testAddDownloadReceiptCountsItem_givenMessageDetail() {
    // Arrange
    MessageDetail messageDetail = new MessageDetail();

    // Act and Assert
    assertSame(messageDetail, messageDetail.addDownloadReceiptCountsItem(new MessageDownloadReceiptCount()));
  }

  /**
   * Test {@link MessageDetail#equals(Object)}, and {@link MessageDetail#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link MessageDetail#equals(Object)}
   *   <li>{@link MessageDetail#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MessageDetail.equals(Object)", "int MessageDetail.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MessageDetail messageDetail = new MessageDetail();
    MessageDetail messageDetail2 = new MessageDetail();

    // Act and Assert
    assertEquals(messageDetail, messageDetail2);
    int expectedHashCodeResult = messageDetail.hashCode();
    assertEquals(expectedHashCodeResult, messageDetail2.hashCode());
  }

  /**
   * Test {@link MessageDetail#equals(Object)}, and {@link MessageDetail#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link MessageDetail#equals(Object)}
   *   <li>{@link MessageDetail#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MessageDetail.equals(Object)", "int MessageDetail.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MessageDetail messageDetail = new MessageDetail();

    // Act and Assert
    assertEquals(messageDetail, messageDetail);
    int expectedHashCodeResult = messageDetail.hashCode();
    assertEquals(expectedHashCodeResult, messageDetail.hashCode());
  }

  /**
   * Test {@link MessageDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MessageDetail.equals(Object)", "int MessageDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    MessageDetail messageDetail = new MessageDetail();
    messageDetail.addDownloadReceiptCountsItem(new MessageDownloadReceiptCount());

    // Act and Assert
    assertNotEquals(messageDetail, new MessageDetail());
  }

  /**
   * Test {@link MessageDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MessageDetail.equals(Object)", "int MessageDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    MessageDetail messageDetail = new MessageDetail();
    messageDetail.messageId("42");
    messageDetail.addDownloadReceiptCountsItem(new MessageDownloadReceiptCount());

    // Act and Assert
    assertNotEquals(messageDetail, new MessageDetail());
  }

  /**
   * Test {@link MessageDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MessageDetail.equals(Object)", "int MessageDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    MessageDetail messageDetail = new MessageDetail();
    messageDetail.creator(new MessageUser());
    messageDetail.addDownloadReceiptCountsItem(new MessageDownloadReceiptCount());

    // Act and Assert
    assertNotEquals(messageDetail, new MessageDetail());
  }

  /**
   * Test {@link MessageDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MessageDetail.equals(Object)", "int MessageDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    MessageDetail messageDetail = new MessageDetail();
    messageDetail.onBehalfOfUser(new MessageUser());
    messageDetail.addDownloadReceiptCountsItem(new MessageDownloadReceiptCount());

    // Act and Assert
    assertNotEquals(messageDetail, new MessageDetail());
  }

  /**
   * Test {@link MessageDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MessageDetail.equals(Object)", "int MessageDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    MessageDetail messageDetail = new MessageDetail();
    messageDetail.stream(new MessageStream());
    messageDetail.addDownloadReceiptCountsItem(new MessageDownloadReceiptCount());

    // Act and Assert
    assertNotEquals(messageDetail, new MessageDetail());
  }

  /**
   * Test {@link MessageDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MessageDetail.equals(Object)", "int MessageDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    MessageDetail messageDetail = new MessageDetail();
    messageDetail.creationDate(1L);
    messageDetail.addDownloadReceiptCountsItem(new MessageDownloadReceiptCount());

    // Act and Assert
    assertNotEquals(messageDetail, new MessageDetail());
  }

  /**
   * Test {@link MessageDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MessageDetail.equals(Object)", "int MessageDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    MessageDetail messageDetail = new MessageDetail();
    messageDetail.deliveryReceiptCount(3L);
    messageDetail.addDownloadReceiptCountsItem(new MessageDownloadReceiptCount());

    // Act and Assert
    assertNotEquals(messageDetail, new MessageDetail());
  }

  /**
   * Test {@link MessageDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MessageDetail.equals(Object)", "int MessageDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    MessageDetail messageDetail = new MessageDetail();
    messageDetail.readReceiptCount(3L);
    messageDetail.addDownloadReceiptCountsItem(new MessageDownloadReceiptCount());

    // Act and Assert
    assertNotEquals(messageDetail, new MessageDetail());
  }

  /**
   * Test {@link MessageDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MessageDetail.equals(Object)", "int MessageDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    MessageDetail messageDetail = new MessageDetail();
    messageDetail.emailNotificationCount(3L);
    messageDetail.addDownloadReceiptCountsItem(new MessageDownloadReceiptCount());

    // Act and Assert
    assertNotEquals(messageDetail, new MessageDetail());
  }

  /**
   * Test {@link MessageDetail#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MessageDetail.equals(Object)", "int MessageDetail.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageDetail(), null);
  }

  /**
   * Test {@link MessageDetail#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MessageDetail.equals(Object)", "int MessageDetail.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageDetail(), "Different type to MessageDetail");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link MessageDetail}
   *   <li>{@link MessageDetail#creationDate(Long)}
   *   <li>{@link MessageDetail#creator(MessageUser)}
   *   <li>{@link MessageDetail#deliveryReceiptCount(Long)}
   *   <li>{@link MessageDetail#downloadReceiptCounts(List)}
   *   <li>{@link MessageDetail#emailNotificationCount(Long)}
   *   <li>{@link MessageDetail#messageId(String)}
   *   <li>{@link MessageDetail#onBehalfOfUser(MessageUser)}
   *   <li>{@link MessageDetail#readReceiptCount(Long)}
   *   <li>{@link MessageDetail#setCreationDate(Long)}
   *   <li>{@link MessageDetail#setCreator(MessageUser)}
   *   <li>{@link MessageDetail#setDeliveryReceiptCount(Long)}
   *   <li>{@link MessageDetail#setDownloadReceiptCounts(List)}
   *   <li>{@link MessageDetail#setEmailNotificationCount(Long)}
   *   <li>{@link MessageDetail#setMessageId(String)}
   *   <li>{@link MessageDetail#setOnBehalfOfUser(MessageUser)}
   *   <li>{@link MessageDetail#setReadReceiptCount(Long)}
   *   <li>{@link MessageDetail#setStream(MessageStream)}
   *   <li>{@link MessageDetail#stream(MessageStream)}
   *   <li>{@link MessageDetail#toString()}
   *   <li>{@link MessageDetail#getCreationDate()}
   *   <li>{@link MessageDetail#getCreator()}
   *   <li>{@link MessageDetail#getDeliveryReceiptCount()}
   *   <li>{@link MessageDetail#getDownloadReceiptCounts()}
   *   <li>{@link MessageDetail#getEmailNotificationCount()}
   *   <li>{@link MessageDetail#getMessageId()}
   *   <li>{@link MessageDetail#getOnBehalfOfUser()}
   *   <li>{@link MessageDetail#getReadReceiptCount()}
   *   <li>{@link MessageDetail#getStream()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void MessageDetail.<init>()", "MessageDetail MessageDetail.creationDate(Long)",
      "MessageDetail MessageDetail.creator(MessageUser)", "MessageDetail MessageDetail.deliveryReceiptCount(Long)",
      "MessageDetail MessageDetail.downloadReceiptCounts(List)",
      "MessageDetail MessageDetail.emailNotificationCount(Long)", "Long MessageDetail.getCreationDate()",
      "MessageUser MessageDetail.getCreator()", "Long MessageDetail.getDeliveryReceiptCount()",
      "List MessageDetail.getDownloadReceiptCounts()", "Long MessageDetail.getEmailNotificationCount()",
      "String MessageDetail.getMessageId()", "MessageUser MessageDetail.getOnBehalfOfUser()",
      "Long MessageDetail.getReadReceiptCount()", "MessageStream MessageDetail.getStream()",
      "MessageDetail MessageDetail.messageId(String)", "MessageDetail MessageDetail.onBehalfOfUser(MessageUser)",
      "MessageDetail MessageDetail.readReceiptCount(Long)", "void MessageDetail.setCreationDate(Long)",
      "void MessageDetail.setCreator(MessageUser)", "void MessageDetail.setDeliveryReceiptCount(Long)",
      "void MessageDetail.setDownloadReceiptCounts(List)", "void MessageDetail.setEmailNotificationCount(Long)",
      "void MessageDetail.setMessageId(String)", "void MessageDetail.setOnBehalfOfUser(MessageUser)",
      "void MessageDetail.setReadReceiptCount(Long)", "void MessageDetail.setStream(MessageStream)",
      "MessageDetail MessageDetail.stream(MessageStream)", "String MessageDetail.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    MessageDetail actualMessageDetail = new MessageDetail();
    MessageDetail actualCreationDateResult = actualMessageDetail.creationDate(1L);
    MessageDetail actualCreatorResult = actualMessageDetail.creator(new MessageUser());
    MessageDetail actualDeliveryReceiptCountResult = actualMessageDetail.deliveryReceiptCount(3L);
    MessageDetail actualDownloadReceiptCountsResult = actualMessageDetail.downloadReceiptCounts(new ArrayList<>());
    MessageDetail actualEmailNotificationCountResult = actualMessageDetail.emailNotificationCount(3L);
    MessageDetail actualMessageIdResult = actualMessageDetail.messageId("42");
    MessageDetail actualOnBehalfOfUserResult = actualMessageDetail.onBehalfOfUser(new MessageUser());
    MessageDetail actualReadReceiptCountResult = actualMessageDetail.readReceiptCount(3L);
    actualMessageDetail.setCreationDate(1L);
    MessageUser creator = new MessageUser();
    actualMessageDetail.setCreator(creator);
    actualMessageDetail.setDeliveryReceiptCount(3L);
    ArrayList<MessageDownloadReceiptCount> downloadReceiptCounts = new ArrayList<>();
    actualMessageDetail.setDownloadReceiptCounts(downloadReceiptCounts);
    actualMessageDetail.setEmailNotificationCount(3L);
    actualMessageDetail.setMessageId("42");
    MessageUser onBehalfOfUser = new MessageUser();
    actualMessageDetail.setOnBehalfOfUser(onBehalfOfUser);
    actualMessageDetail.setReadReceiptCount(3L);
    actualMessageDetail.setStream(new MessageStream());
    MessageStream stream = new MessageStream();
    MessageDetail actualStreamResult = actualMessageDetail.stream(stream);
    String actualToStringResult = actualMessageDetail.toString();
    Long actualCreationDate = actualMessageDetail.getCreationDate();
    MessageUser actualCreator = actualMessageDetail.getCreator();
    Long actualDeliveryReceiptCount = actualMessageDetail.getDeliveryReceiptCount();
    List<MessageDownloadReceiptCount> actualDownloadReceiptCounts = actualMessageDetail.getDownloadReceiptCounts();
    Long actualEmailNotificationCount = actualMessageDetail.getEmailNotificationCount();
    String actualMessageId = actualMessageDetail.getMessageId();
    MessageUser actualOnBehalfOfUser = actualMessageDetail.getOnBehalfOfUser();
    Long actualReadReceiptCount = actualMessageDetail.getReadReceiptCount();
    MessageStream actualStream = actualMessageDetail.getStream();

    // Assert
    assertEquals("42", actualMessageId);
    assertEquals("class MessageDetail {\n" + "    messageId: 42\n" + "    creator: class MessageUser {\n"
        + "        id: null\n" + "        name: null\n" + "    }\n" + "    onBehalfOfUser: class MessageUser {\n"
        + "        id: null\n" + "        name: null\n" + "    }\n" + "    stream: class MessageStream {\n"
        + "        id: null\n" + "        name: null\n" + "        streamType: null\n" + "    }\n"
        + "    creationDate: 1\n" + "    deliveryReceiptCount: 3\n" + "    readReceiptCount: 3\n"
        + "    emailNotificationCount: 3\n" + "    downloadReceiptCounts: []\n" + "}", actualToStringResult);
    assertEquals(1L, actualCreationDate.longValue());
    assertEquals(3L, actualDeliveryReceiptCount.longValue());
    assertEquals(3L, actualEmailNotificationCount.longValue());
    assertEquals(3L, actualReadReceiptCount.longValue());
    assertTrue(actualDownloadReceiptCounts.isEmpty());
    assertSame(actualMessageDetail, actualCreationDateResult);
    assertSame(actualMessageDetail, actualCreatorResult);
    assertSame(actualMessageDetail, actualDeliveryReceiptCountResult);
    assertSame(actualMessageDetail, actualDownloadReceiptCountsResult);
    assertSame(actualMessageDetail, actualEmailNotificationCountResult);
    assertSame(actualMessageDetail, actualMessageIdResult);
    assertSame(actualMessageDetail, actualOnBehalfOfUserResult);
    assertSame(actualMessageDetail, actualReadReceiptCountResult);
    assertSame(actualMessageDetail, actualStreamResult);
    assertSame(stream, actualStream);
    assertSame(creator, actualCreator);
    assertSame(onBehalfOfUser, actualOnBehalfOfUser);
    assertSame(downloadReceiptCounts, actualDownloadReceiptCounts);
  }
}
