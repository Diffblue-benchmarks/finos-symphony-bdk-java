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

class MessageReceiptDetailResponseDiffblueTest {
  /**
   * Test {@link
   * MessageReceiptDetailResponse#addDownloadReceiptCountsItem(MessageDownloadReceiptCount)}.
   *
   * <p>Method under test: {@link
   * MessageReceiptDetailResponse#addDownloadReceiptCountsItem(MessageDownloadReceiptCount)}
   */
  @Test
  @DisplayName("Test addDownloadReceiptCountsItem(MessageDownloadReceiptCount)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MessageReceiptDetailResponse MessageReceiptDetailResponse.addDownloadReceiptCountsItem(MessageDownloadReceiptCount)"
  })
  void testAddDownloadReceiptCountsItem() {
    // Arrange
    MessageReceiptDetailResponse messageReceiptDetailResponse = new MessageReceiptDetailResponse();
    messageReceiptDetailResponse.downloadReceiptCounts(new ArrayList<>());

    // Act and Assert
    assertSame(
        messageReceiptDetailResponse,
        messageReceiptDetailResponse.addDownloadReceiptCountsItem(
            new MessageDownloadReceiptCount()));
  }

  /**
   * Test {@link
   * MessageReceiptDetailResponse#addDownloadReceiptCountsItem(MessageDownloadReceiptCount)}.
   *
   * <ul>
   *   <li>Given {@link MessageReceiptDetailResponse} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link
   * MessageReceiptDetailResponse#addDownloadReceiptCountsItem(MessageDownloadReceiptCount)}
   */
  @Test
  @DisplayName(
      "Test addDownloadReceiptCountsItem(MessageDownloadReceiptCount); given MessageReceiptDetailResponse (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MessageReceiptDetailResponse MessageReceiptDetailResponse.addDownloadReceiptCountsItem(MessageDownloadReceiptCount)"
  })
  void testAddDownloadReceiptCountsItem_givenMessageReceiptDetailResponse() {
    // Arrange
    MessageReceiptDetailResponse messageReceiptDetailResponse = new MessageReceiptDetailResponse();

    // Act and Assert
    assertSame(
        messageReceiptDetailResponse,
        messageReceiptDetailResponse.addDownloadReceiptCountsItem(
            new MessageDownloadReceiptCount()));
  }

  /**
   * Test {@link MessageReceiptDetailResponse#addMessageReceiptDetailItem(MessageReceiptDetail)}.
   *
   * <p>Method under test: {@link
   * MessageReceiptDetailResponse#addMessageReceiptDetailItem(MessageReceiptDetail)}
   */
  @Test
  @DisplayName("Test addMessageReceiptDetailItem(MessageReceiptDetail)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MessageReceiptDetailResponse MessageReceiptDetailResponse.addMessageReceiptDetailItem(MessageReceiptDetail)"
  })
  void testAddMessageReceiptDetailItem() {
    // Arrange
    MessageReceiptDetailResponse messageReceiptDetailResponse = new MessageReceiptDetailResponse();
    messageReceiptDetailResponse.messageReceiptDetail(new ArrayList<>());

    // Act and Assert
    assertSame(
        messageReceiptDetailResponse,
        messageReceiptDetailResponse.addMessageReceiptDetailItem(new MessageReceiptDetail()));
  }

  /**
   * Test {@link MessageReceiptDetailResponse#addMessageReceiptDetailItem(MessageReceiptDetail)}.
   *
   * <ul>
   *   <li>Given {@link MessageReceiptDetailResponse} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link
   * MessageReceiptDetailResponse#addMessageReceiptDetailItem(MessageReceiptDetail)}
   */
  @Test
  @DisplayName(
      "Test addMessageReceiptDetailItem(MessageReceiptDetail); given MessageReceiptDetailResponse (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MessageReceiptDetailResponse MessageReceiptDetailResponse.addMessageReceiptDetailItem(MessageReceiptDetail)"
  })
  void testAddMessageReceiptDetailItem_givenMessageReceiptDetailResponse() {
    // Arrange
    MessageReceiptDetailResponse messageReceiptDetailResponse = new MessageReceiptDetailResponse();

    // Act and Assert
    assertSame(
        messageReceiptDetailResponse,
        messageReceiptDetailResponse.addMessageReceiptDetailItem(new MessageReceiptDetail()));
  }

  /**
   * Test {@link MessageReceiptDetailResponse#equals(Object)}, and {@link
   * MessageReceiptDetailResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MessageReceiptDetailResponse#equals(Object)}
   *   <li>{@link MessageReceiptDetailResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageReceiptDetailResponse.equals(Object)",
    "int MessageReceiptDetailResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MessageReceiptDetailResponse messageReceiptDetailResponse = new MessageReceiptDetailResponse();
    MessageReceiptDetailResponse messageReceiptDetailResponse2 = new MessageReceiptDetailResponse();

    // Act and Assert
    assertEquals(messageReceiptDetailResponse, messageReceiptDetailResponse2);
    int expectedHashCodeResult = messageReceiptDetailResponse.hashCode();
    assertEquals(expectedHashCodeResult, messageReceiptDetailResponse2.hashCode());
  }

  /**
   * Test {@link MessageReceiptDetailResponse#equals(Object)}, and {@link
   * MessageReceiptDetailResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MessageReceiptDetailResponse#equals(Object)}
   *   <li>{@link MessageReceiptDetailResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageReceiptDetailResponse.equals(Object)",
    "int MessageReceiptDetailResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MessageReceiptDetailResponse messageReceiptDetailResponse = new MessageReceiptDetailResponse();

    // Act and Assert
    assertEquals(messageReceiptDetailResponse, messageReceiptDetailResponse);
    int expectedHashCodeResult = messageReceiptDetailResponse.hashCode();
    assertEquals(expectedHashCodeResult, messageReceiptDetailResponse.hashCode());
  }

  /**
   * Test {@link MessageReceiptDetailResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageReceiptDetailResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageReceiptDetailResponse.equals(Object)",
    "int MessageReceiptDetailResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    MessageReceiptDetailResponse messageReceiptDetailResponse = new MessageReceiptDetailResponse();
    messageReceiptDetailResponse.addDownloadReceiptCountsItem(new MessageDownloadReceiptCount());

    // Act and Assert
    assertNotEquals(messageReceiptDetailResponse, new MessageReceiptDetailResponse());
  }

  /**
   * Test {@link MessageReceiptDetailResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageReceiptDetailResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageReceiptDetailResponse.equals(Object)",
    "int MessageReceiptDetailResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    MessageReceiptDetailResponse messageReceiptDetailResponse = new MessageReceiptDetailResponse();
    messageReceiptDetailResponse.creator(new MessageUser());
    messageReceiptDetailResponse.addDownloadReceiptCountsItem(new MessageDownloadReceiptCount());

    // Act and Assert
    assertNotEquals(messageReceiptDetailResponse, new MessageReceiptDetailResponse());
  }

  /**
   * Test {@link MessageReceiptDetailResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageReceiptDetailResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageReceiptDetailResponse.equals(Object)",
    "int MessageReceiptDetailResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    MessageReceiptDetailResponse messageReceiptDetailResponse = new MessageReceiptDetailResponse();
    messageReceiptDetailResponse.onBehalfOfUser(new MessageUser());
    messageReceiptDetailResponse.addDownloadReceiptCountsItem(new MessageDownloadReceiptCount());

    // Act and Assert
    assertNotEquals(messageReceiptDetailResponse, new MessageReceiptDetailResponse());
  }

  /**
   * Test {@link MessageReceiptDetailResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageReceiptDetailResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageReceiptDetailResponse.equals(Object)",
    "int MessageReceiptDetailResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    MessageReceiptDetailResponse messageReceiptDetailResponse = new MessageReceiptDetailResponse();
    messageReceiptDetailResponse.stream(new MessageStream());
    messageReceiptDetailResponse.addDownloadReceiptCountsItem(new MessageDownloadReceiptCount());

    // Act and Assert
    assertNotEquals(messageReceiptDetailResponse, new MessageReceiptDetailResponse());
  }

  /**
   * Test {@link MessageReceiptDetailResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageReceiptDetailResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageReceiptDetailResponse.equals(Object)",
    "int MessageReceiptDetailResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    MessageReceiptDetailResponse messageReceiptDetailResponse = new MessageReceiptDetailResponse();
    messageReceiptDetailResponse.creationDate(1L);
    messageReceiptDetailResponse.addDownloadReceiptCountsItem(new MessageDownloadReceiptCount());

    // Act and Assert
    assertNotEquals(messageReceiptDetailResponse, new MessageReceiptDetailResponse());
  }

  /**
   * Test {@link MessageReceiptDetailResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageReceiptDetailResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageReceiptDetailResponse.equals(Object)",
    "int MessageReceiptDetailResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    MessageReceiptDetailResponse messageReceiptDetailResponse = new MessageReceiptDetailResponse();
    messageReceiptDetailResponse.deliveryReceiptCount(3);
    messageReceiptDetailResponse.addDownloadReceiptCountsItem(new MessageDownloadReceiptCount());

    // Act and Assert
    assertNotEquals(messageReceiptDetailResponse, new MessageReceiptDetailResponse());
  }

  /**
   * Test {@link MessageReceiptDetailResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageReceiptDetailResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageReceiptDetailResponse.equals(Object)",
    "int MessageReceiptDetailResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    MessageReceiptDetailResponse messageReceiptDetailResponse = new MessageReceiptDetailResponse();
    messageReceiptDetailResponse.readReceiptCount(3);
    messageReceiptDetailResponse.addDownloadReceiptCountsItem(new MessageDownloadReceiptCount());

    // Act and Assert
    assertNotEquals(messageReceiptDetailResponse, new MessageReceiptDetailResponse());
  }

  /**
   * Test {@link MessageReceiptDetailResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageReceiptDetailResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageReceiptDetailResponse.equals(Object)",
    "int MessageReceiptDetailResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    MessageReceiptDetailResponse messageReceiptDetailResponse = new MessageReceiptDetailResponse();
    messageReceiptDetailResponse.emailNotificationCount(3);
    messageReceiptDetailResponse.addDownloadReceiptCountsItem(new MessageDownloadReceiptCount());

    // Act and Assert
    assertNotEquals(messageReceiptDetailResponse, new MessageReceiptDetailResponse());
  }

  /**
   * Test {@link MessageReceiptDetailResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageReceiptDetailResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageReceiptDetailResponse.equals(Object)",
    "int MessageReceiptDetailResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    MessageReceiptDetailResponse messageReceiptDetailResponse = new MessageReceiptDetailResponse();
    messageReceiptDetailResponse.addMessageReceiptDetailItem(new MessageReceiptDetail());

    // Act and Assert
    assertNotEquals(messageReceiptDetailResponse, new MessageReceiptDetailResponse());
  }

  /**
   * Test {@link MessageReceiptDetailResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageReceiptDetailResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageReceiptDetailResponse.equals(Object)",
    "int MessageReceiptDetailResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual10() {
    // Arrange
    MessageReceiptDetailResponse messageReceiptDetailResponse = new MessageReceiptDetailResponse();
    messageReceiptDetailResponse.pagination(new Pagination());

    // Act and Assert
    assertNotEquals(messageReceiptDetailResponse, new MessageReceiptDetailResponse());
  }

  /**
   * Test {@link MessageReceiptDetailResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageReceiptDetailResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageReceiptDetailResponse.equals(Object)",
    "int MessageReceiptDetailResponse.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageReceiptDetailResponse(), null);
  }

  /**
   * Test {@link MessageReceiptDetailResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageReceiptDetailResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageReceiptDetailResponse.equals(Object)",
    "int MessageReceiptDetailResponse.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new MessageReceiptDetailResponse(), "Different type to MessageReceiptDetailResponse");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link MessageReceiptDetailResponse}
   *   <li>{@link MessageReceiptDetailResponse#creationDate(Long)}
   *   <li>{@link MessageReceiptDetailResponse#creator(MessageUser)}
   *   <li>{@link MessageReceiptDetailResponse#deliveryReceiptCount(Integer)}
   *   <li>{@link MessageReceiptDetailResponse#downloadReceiptCounts(List)}
   *   <li>{@link MessageReceiptDetailResponse#emailNotificationCount(Integer)}
   *   <li>{@link MessageReceiptDetailResponse#messageReceiptDetail(List)}
   *   <li>{@link MessageReceiptDetailResponse#onBehalfOfUser(MessageUser)}
   *   <li>{@link MessageReceiptDetailResponse#pagination(Pagination)}
   *   <li>{@link MessageReceiptDetailResponse#readReceiptCount(Integer)}
   *   <li>{@link MessageReceiptDetailResponse#setCreationDate(Long)}
   *   <li>{@link MessageReceiptDetailResponse#setCreator(MessageUser)}
   *   <li>{@link MessageReceiptDetailResponse#setDeliveryReceiptCount(Integer)}
   *   <li>{@link MessageReceiptDetailResponse#setDownloadReceiptCounts(List)}
   *   <li>{@link MessageReceiptDetailResponse#setEmailNotificationCount(Integer)}
   *   <li>{@link MessageReceiptDetailResponse#setMessageReceiptDetail(List)}
   *   <li>{@link MessageReceiptDetailResponse#setOnBehalfOfUser(MessageUser)}
   *   <li>{@link MessageReceiptDetailResponse#setPagination(Pagination)}
   *   <li>{@link MessageReceiptDetailResponse#setReadReceiptCount(Integer)}
   *   <li>{@link MessageReceiptDetailResponse#setStream(MessageStream)}
   *   <li>{@link MessageReceiptDetailResponse#stream(MessageStream)}
   *   <li>{@link MessageReceiptDetailResponse#toString()}
   *   <li>{@link MessageReceiptDetailResponse#getCreationDate()}
   *   <li>{@link MessageReceiptDetailResponse#getCreator()}
   *   <li>{@link MessageReceiptDetailResponse#getDeliveryReceiptCount()}
   *   <li>{@link MessageReceiptDetailResponse#getDownloadReceiptCounts()}
   *   <li>{@link MessageReceiptDetailResponse#getEmailNotificationCount()}
   *   <li>{@link MessageReceiptDetailResponse#getMessageReceiptDetail()}
   *   <li>{@link MessageReceiptDetailResponse#getOnBehalfOfUser()}
   *   <li>{@link MessageReceiptDetailResponse#getPagination()}
   *   <li>{@link MessageReceiptDetailResponse#getReadReceiptCount()}
   *   <li>{@link MessageReceiptDetailResponse#getStream()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void MessageReceiptDetailResponse.<init>()",
    "MessageReceiptDetailResponse MessageReceiptDetailResponse.creationDate(Long)",
    "MessageReceiptDetailResponse MessageReceiptDetailResponse.creator(MessageUser)",
    "MessageReceiptDetailResponse MessageReceiptDetailResponse.deliveryReceiptCount(Integer)",
    "MessageReceiptDetailResponse MessageReceiptDetailResponse.downloadReceiptCounts(List)",
    "MessageReceiptDetailResponse MessageReceiptDetailResponse.emailNotificationCount(Integer)",
    "Long MessageReceiptDetailResponse.getCreationDate()",
    "MessageUser MessageReceiptDetailResponse.getCreator()",
    "Integer MessageReceiptDetailResponse.getDeliveryReceiptCount()",
    "List MessageReceiptDetailResponse.getDownloadReceiptCounts()",
    "Integer MessageReceiptDetailResponse.getEmailNotificationCount()",
    "List MessageReceiptDetailResponse.getMessageReceiptDetail()",
    "MessageUser MessageReceiptDetailResponse.getOnBehalfOfUser()",
    "Pagination MessageReceiptDetailResponse.getPagination()",
    "Integer MessageReceiptDetailResponse.getReadReceiptCount()",
    "MessageStream MessageReceiptDetailResponse.getStream()",
    "MessageReceiptDetailResponse MessageReceiptDetailResponse.messageReceiptDetail(List)",
    "MessageReceiptDetailResponse MessageReceiptDetailResponse.onBehalfOfUser(MessageUser)",
    "MessageReceiptDetailResponse MessageReceiptDetailResponse.pagination(Pagination)",
    "MessageReceiptDetailResponse MessageReceiptDetailResponse.readReceiptCount(Integer)",
    "void MessageReceiptDetailResponse.setCreationDate(Long)",
    "void MessageReceiptDetailResponse.setCreator(MessageUser)",
    "void MessageReceiptDetailResponse.setDeliveryReceiptCount(Integer)",
    "void MessageReceiptDetailResponse.setDownloadReceiptCounts(List)",
    "void MessageReceiptDetailResponse.setEmailNotificationCount(Integer)",
    "void MessageReceiptDetailResponse.setMessageReceiptDetail(List)",
    "void MessageReceiptDetailResponse.setOnBehalfOfUser(MessageUser)",
    "void MessageReceiptDetailResponse.setPagination(Pagination)",
    "void MessageReceiptDetailResponse.setReadReceiptCount(Integer)",
    "void MessageReceiptDetailResponse.setStream(MessageStream)",
    "MessageReceiptDetailResponse MessageReceiptDetailResponse.stream(MessageStream)",
    "String MessageReceiptDetailResponse.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    MessageReceiptDetailResponse actualMessageReceiptDetailResponse =
        new MessageReceiptDetailResponse();
    MessageReceiptDetailResponse actualCreationDateResult =
        actualMessageReceiptDetailResponse.creationDate(1L);
    MessageReceiptDetailResponse actualCreatorResult =
        actualMessageReceiptDetailResponse.creator(new MessageUser());
    MessageReceiptDetailResponse actualDeliveryReceiptCountResult =
        actualMessageReceiptDetailResponse.deliveryReceiptCount(3);
    MessageReceiptDetailResponse actualDownloadReceiptCountsResult =
        actualMessageReceiptDetailResponse.downloadReceiptCounts(new ArrayList<>());
    MessageReceiptDetailResponse actualEmailNotificationCountResult =
        actualMessageReceiptDetailResponse.emailNotificationCount(3);
    MessageReceiptDetailResponse actualMessageReceiptDetailResult =
        actualMessageReceiptDetailResponse.messageReceiptDetail(new ArrayList<>());
    MessageReceiptDetailResponse actualOnBehalfOfUserResult =
        actualMessageReceiptDetailResponse.onBehalfOfUser(new MessageUser());
    MessageReceiptDetailResponse actualPaginationResult =
        actualMessageReceiptDetailResponse.pagination(new Pagination());
    MessageReceiptDetailResponse actualReadReceiptCountResult =
        actualMessageReceiptDetailResponse.readReceiptCount(3);
    actualMessageReceiptDetailResponse.setCreationDate(1L);
    MessageUser creator = new MessageUser();
    actualMessageReceiptDetailResponse.setCreator(creator);
    actualMessageReceiptDetailResponse.setDeliveryReceiptCount(3);
    ArrayList<MessageDownloadReceiptCount> downloadReceiptCounts = new ArrayList<>();
    actualMessageReceiptDetailResponse.setDownloadReceiptCounts(downloadReceiptCounts);
    actualMessageReceiptDetailResponse.setEmailNotificationCount(3);
    ArrayList<MessageReceiptDetail> messageReceiptDetail = new ArrayList<>();
    actualMessageReceiptDetailResponse.setMessageReceiptDetail(messageReceiptDetail);
    MessageUser onBehalfOfUser = new MessageUser();
    actualMessageReceiptDetailResponse.setOnBehalfOfUser(onBehalfOfUser);
    Pagination pagination = new Pagination();
    actualMessageReceiptDetailResponse.setPagination(pagination);
    actualMessageReceiptDetailResponse.setReadReceiptCount(3);
    actualMessageReceiptDetailResponse.setStream(new MessageStream());
    MessageStream stream = new MessageStream();
    MessageReceiptDetailResponse actualStreamResult =
        actualMessageReceiptDetailResponse.stream(stream);
    String actualToStringResult = actualMessageReceiptDetailResponse.toString();
    Long actualCreationDate = actualMessageReceiptDetailResponse.getCreationDate();
    MessageUser actualCreator = actualMessageReceiptDetailResponse.getCreator();
    Integer actualDeliveryReceiptCount =
        actualMessageReceiptDetailResponse.getDeliveryReceiptCount();
    List<MessageDownloadReceiptCount> actualDownloadReceiptCounts =
        actualMessageReceiptDetailResponse.getDownloadReceiptCounts();
    Integer actualEmailNotificationCount =
        actualMessageReceiptDetailResponse.getEmailNotificationCount();
    List<MessageReceiptDetail> actualMessageReceiptDetail =
        actualMessageReceiptDetailResponse.getMessageReceiptDetail();
    MessageUser actualOnBehalfOfUser = actualMessageReceiptDetailResponse.getOnBehalfOfUser();
    Pagination actualPagination = actualMessageReceiptDetailResponse.getPagination();
    Integer actualReadReceiptCount = actualMessageReceiptDetailResponse.getReadReceiptCount();
    MessageStream actualStream = actualMessageReceiptDetailResponse.getStream();

    // Assert
    assertEquals(
        "class MessageReceiptDetailResponse {\n"
            + "    creator: class MessageUser {\n"
            + "        id: null\n"
            + "        name: null\n"
            + "    }\n"
            + "    onBehalfOfUser: class MessageUser {\n"
            + "        id: null\n"
            + "        name: null\n"
            + "    }\n"
            + "    stream: class MessageStream {\n"
            + "        id: null\n"
            + "        name: null\n"
            + "        streamType: null\n"
            + "    }\n"
            + "    creationDate: 1\n"
            + "    deliveryReceiptCount: 3\n"
            + "    readReceiptCount: 3\n"
            + "    emailNotificationCount: 3\n"
            + "    downloadReceiptCounts: []\n"
            + "    messageReceiptDetail: []\n"
            + "    pagination: class Pagination {\n"
            + "        cursors: null\n"
            + "        previous: null\n"
            + "        next: null\n"
            + "    }\n"
            + "}",
        actualToStringResult);
    assertEquals(1L, actualCreationDate.longValue());
    assertEquals(3, actualDeliveryReceiptCount.intValue());
    assertEquals(3, actualEmailNotificationCount.intValue());
    assertEquals(3, actualReadReceiptCount.intValue());
    assertTrue(actualDownloadReceiptCounts.isEmpty());
    assertTrue(actualMessageReceiptDetail.isEmpty());
    assertSame(actualMessageReceiptDetailResponse, actualCreationDateResult);
    assertSame(actualMessageReceiptDetailResponse, actualCreatorResult);
    assertSame(actualMessageReceiptDetailResponse, actualDeliveryReceiptCountResult);
    assertSame(actualMessageReceiptDetailResponse, actualDownloadReceiptCountsResult);
    assertSame(actualMessageReceiptDetailResponse, actualEmailNotificationCountResult);
    assertSame(actualMessageReceiptDetailResponse, actualMessageReceiptDetailResult);
    assertSame(actualMessageReceiptDetailResponse, actualOnBehalfOfUserResult);
    assertSame(actualMessageReceiptDetailResponse, actualPaginationResult);
    assertSame(actualMessageReceiptDetailResponse, actualReadReceiptCountResult);
    assertSame(actualMessageReceiptDetailResponse, actualStreamResult);
    assertSame(stream, actualStream);
    assertSame(creator, actualCreator);
    assertSame(onBehalfOfUser, actualOnBehalfOfUser);
    assertSame(pagination, actualPagination);
    assertSame(downloadReceiptCounts, actualDownloadReceiptCounts);
    assertSame(messageReceiptDetail, actualMessageReceiptDetail);
  }
}
