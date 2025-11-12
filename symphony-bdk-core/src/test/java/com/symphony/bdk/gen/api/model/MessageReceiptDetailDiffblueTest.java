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

class MessageReceiptDetailDiffblueTest {
  /**
   * Test {@link MessageReceiptDetail#addDownloadReceiptCountsItem(DownloadReceiptCount)}.
   *
   * <p>Method under test: {@link
   * MessageReceiptDetail#addDownloadReceiptCountsItem(DownloadReceiptCount)}
   */
  @Test
  @DisplayName("Test addDownloadReceiptCountsItem(DownloadReceiptCount)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MessageReceiptDetail MessageReceiptDetail.addDownloadReceiptCountsItem(DownloadReceiptCount)"
  })
  void testAddDownloadReceiptCountsItem() {
    // Arrange
    MessageReceiptDetail messageReceiptDetail = new MessageReceiptDetail();
    messageReceiptDetail.downloadReceiptCounts(new ArrayList<>());

    // Act
    MessageReceiptDetail actualAddDownloadReceiptCountsItemResult =
        messageReceiptDetail.addDownloadReceiptCountsItem(new DownloadReceiptCount());

    // Assert
    assertSame(messageReceiptDetail, actualAddDownloadReceiptCountsItemResult);
  }

  /**
   * Test {@link MessageReceiptDetail#addDownloadReceiptCountsItem(DownloadReceiptCount)}.
   *
   * <ul>
   *   <li>Given {@link MessageReceiptDetail} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link
   * MessageReceiptDetail#addDownloadReceiptCountsItem(DownloadReceiptCount)}
   */
  @Test
  @DisplayName(
      "Test addDownloadReceiptCountsItem(DownloadReceiptCount); given MessageReceiptDetail (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MessageReceiptDetail MessageReceiptDetail.addDownloadReceiptCountsItem(DownloadReceiptCount)"
  })
  void testAddDownloadReceiptCountsItem_givenMessageReceiptDetail() {
    // Arrange
    MessageReceiptDetail messageReceiptDetail = new MessageReceiptDetail();

    // Act
    MessageReceiptDetail actualAddDownloadReceiptCountsItemResult =
        messageReceiptDetail.addDownloadReceiptCountsItem(new DownloadReceiptCount());

    // Assert
    assertSame(messageReceiptDetail, actualAddDownloadReceiptCountsItemResult);
  }

  /**
   * Test {@link MessageReceiptDetail#equals(Object)}, and {@link MessageReceiptDetail#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MessageReceiptDetail#equals(Object)}
   *   <li>{@link MessageReceiptDetail#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageReceiptDetail.equals(Object)",
    "int MessageReceiptDetail.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MessageReceiptDetail messageReceiptDetail = new MessageReceiptDetail();
    MessageReceiptDetail messageReceiptDetail2 = new MessageReceiptDetail();

    // Act and Assert
    assertEquals(messageReceiptDetail, messageReceiptDetail2);
    assertEquals(messageReceiptDetail.hashCode(), messageReceiptDetail2.hashCode());
  }

  /**
   * Test {@link MessageReceiptDetail#equals(Object)}, and {@link MessageReceiptDetail#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MessageReceiptDetail#equals(Object)}
   *   <li>{@link MessageReceiptDetail#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageReceiptDetail.equals(Object)",
    "int MessageReceiptDetail.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MessageReceiptDetail messageReceiptDetail = new MessageReceiptDetail();

    // Act and Assert
    assertEquals(messageReceiptDetail, messageReceiptDetail);
    int expectedHashCodeResult = messageReceiptDetail.hashCode();
    assertEquals(expectedHashCodeResult, messageReceiptDetail.hashCode());
  }

  /**
   * Test {@link MessageReceiptDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageReceiptDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageReceiptDetail.equals(Object)",
    "int MessageReceiptDetail.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    MessageReceiptDetail messageReceiptDetail = new MessageReceiptDetail();
    messageReceiptDetail.addDownloadReceiptCountsItem(new DownloadReceiptCount());

    // Act and Assert
    assertNotEquals(messageReceiptDetail, new MessageReceiptDetail());
  }

  /**
   * Test {@link MessageReceiptDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageReceiptDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageReceiptDetail.equals(Object)",
    "int MessageReceiptDetail.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    MessageReceiptDetail messageReceiptDetail = new MessageReceiptDetail();
    messageReceiptDetail.user(new UserCompp());
    messageReceiptDetail.addDownloadReceiptCountsItem(new DownloadReceiptCount());

    // Act and Assert
    assertNotEquals(messageReceiptDetail, new MessageReceiptDetail());
  }

  /**
   * Test {@link MessageReceiptDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageReceiptDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageReceiptDetail.equals(Object)",
    "int MessageReceiptDetail.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    MessageReceiptDetail messageReceiptDetail = new MessageReceiptDetail();
    messageReceiptDetail.deliveryReceiptTimestamp(1L);
    messageReceiptDetail.addDownloadReceiptCountsItem(new DownloadReceiptCount());

    // Act and Assert
    assertNotEquals(messageReceiptDetail, new MessageReceiptDetail());
  }

  /**
   * Test {@link MessageReceiptDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageReceiptDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageReceiptDetail.equals(Object)",
    "int MessageReceiptDetail.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    MessageReceiptDetail messageReceiptDetail = new MessageReceiptDetail();
    messageReceiptDetail.readReceiptTimestamp(1L);
    messageReceiptDetail.addDownloadReceiptCountsItem(new DownloadReceiptCount());

    // Act and Assert
    assertNotEquals(messageReceiptDetail, new MessageReceiptDetail());
  }

  /**
   * Test {@link MessageReceiptDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageReceiptDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageReceiptDetail.equals(Object)",
    "int MessageReceiptDetail.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    MessageReceiptDetail messageReceiptDetail = new MessageReceiptDetail();
    messageReceiptDetail.emailNotificationTimestamp(1L);
    messageReceiptDetail.addDownloadReceiptCountsItem(new DownloadReceiptCount());

    // Act and Assert
    assertNotEquals(messageReceiptDetail, new MessageReceiptDetail());
  }

  /**
   * Test {@link MessageReceiptDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageReceiptDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageReceiptDetail.equals(Object)",
    "int MessageReceiptDetail.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageReceiptDetail(), null);
  }

  /**
   * Test {@link MessageReceiptDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageReceiptDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageReceiptDetail.equals(Object)",
    "int MessageReceiptDetail.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageReceiptDetail(), "Different type to MessageReceiptDetail");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link MessageReceiptDetail}
   *   <li>{@link MessageReceiptDetail#deliveryReceiptTimestamp(Long)}
   *   <li>{@link MessageReceiptDetail#downloadReceiptCounts(List)}
   *   <li>{@link MessageReceiptDetail#emailNotificationTimestamp(Long)}
   *   <li>{@link MessageReceiptDetail#readReceiptTimestamp(Long)}
   *   <li>{@link MessageReceiptDetail#setDeliveryReceiptTimestamp(Long)}
   *   <li>{@link MessageReceiptDetail#setDownloadReceiptCounts(List)}
   *   <li>{@link MessageReceiptDetail#setEmailNotificationTimestamp(Long)}
   *   <li>{@link MessageReceiptDetail#setReadReceiptTimestamp(Long)}
   *   <li>{@link MessageReceiptDetail#setUser(UserCompp)}
   *   <li>{@link MessageReceiptDetail#user(UserCompp)}
   *   <li>{@link MessageReceiptDetail#toString()}
   *   <li>{@link MessageReceiptDetail#getDeliveryReceiptTimestamp()}
   *   <li>{@link MessageReceiptDetail#getDownloadReceiptCounts()}
   *   <li>{@link MessageReceiptDetail#getEmailNotificationTimestamp()}
   *   <li>{@link MessageReceiptDetail#getReadReceiptTimestamp()}
   *   <li>{@link MessageReceiptDetail#getUser()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void MessageReceiptDetail.<init>()",
    "MessageReceiptDetail MessageReceiptDetail.deliveryReceiptTimestamp(Long)",
    "MessageReceiptDetail MessageReceiptDetail.downloadReceiptCounts(List)",
    "MessageReceiptDetail MessageReceiptDetail.emailNotificationTimestamp(Long)",
    "Long MessageReceiptDetail.getDeliveryReceiptTimestamp()",
    "List MessageReceiptDetail.getDownloadReceiptCounts()",
    "Long MessageReceiptDetail.getEmailNotificationTimestamp()",
    "Long MessageReceiptDetail.getReadReceiptTimestamp()",
    "UserCompp MessageReceiptDetail.getUser()",
    "MessageReceiptDetail MessageReceiptDetail.readReceiptTimestamp(Long)",
    "void MessageReceiptDetail.setDeliveryReceiptTimestamp(Long)",
    "void MessageReceiptDetail.setDownloadReceiptCounts(List)",
    "void MessageReceiptDetail.setEmailNotificationTimestamp(Long)",
    "void MessageReceiptDetail.setReadReceiptTimestamp(Long)",
    "void MessageReceiptDetail.setUser(UserCompp)",
    "String MessageReceiptDetail.toString()",
    "MessageReceiptDetail MessageReceiptDetail.user(UserCompp)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    MessageReceiptDetail actualMessageReceiptDetail = new MessageReceiptDetail();
    MessageReceiptDetail actualDeliveryReceiptTimestampResult =
        actualMessageReceiptDetail.deliveryReceiptTimestamp(1L);
    MessageReceiptDetail actualDownloadReceiptCountsResult =
        actualMessageReceiptDetail.downloadReceiptCounts(new ArrayList<>());
    MessageReceiptDetail actualEmailNotificationTimestampResult =
        actualMessageReceiptDetail.emailNotificationTimestamp(1L);
    MessageReceiptDetail actualReadReceiptTimestampResult =
        actualMessageReceiptDetail.readReceiptTimestamp(1L);
    actualMessageReceiptDetail.setDeliveryReceiptTimestamp(1L);
    ArrayList<DownloadReceiptCount> downloadReceiptCounts = new ArrayList<>();
    actualMessageReceiptDetail.setDownloadReceiptCounts(downloadReceiptCounts);
    actualMessageReceiptDetail.setEmailNotificationTimestamp(1L);
    actualMessageReceiptDetail.setReadReceiptTimestamp(1L);
    actualMessageReceiptDetail.setUser(new UserCompp());
    UserCompp user = new UserCompp();
    MessageReceiptDetail actualUserResult = actualMessageReceiptDetail.user(user);
    String actualToStringResult = actualMessageReceiptDetail.toString();
    Long actualDeliveryReceiptTimestamp = actualMessageReceiptDetail.getDeliveryReceiptTimestamp();
    List<DownloadReceiptCount> actualDownloadReceiptCounts =
        actualMessageReceiptDetail.getDownloadReceiptCounts();
    Long actualEmailNotificationTimestamp =
        actualMessageReceiptDetail.getEmailNotificationTimestamp();
    Long actualReadReceiptTimestamp = actualMessageReceiptDetail.getReadReceiptTimestamp();
    UserCompp actualUser = actualMessageReceiptDetail.getUser();

    // Assert
    assertEquals(
        "class MessageReceiptDetail {\n"
            + "    user: class UserCompp {\n"
            + "        id: null\n"
            + "        username: null\n"
            + "        firstName: null\n"
            + "        lastName: null\n"
            + "        emailAddress: null\n"
            + "    }\n"
            + "    deliveryReceiptTimestamp: 1\n"
            + "    readReceiptTimestamp: 1\n"
            + "    emailNotificationTimestamp: 1\n"
            + "    downloadReceiptCounts: []\n"
            + "}",
        actualToStringResult);
    assertEquals(1L, actualDeliveryReceiptTimestamp.longValue());
    assertEquals(1L, actualEmailNotificationTimestamp.longValue());
    assertEquals(1L, actualReadReceiptTimestamp.longValue());
    assertTrue(actualDownloadReceiptCounts.isEmpty());
    assertSame(actualMessageReceiptDetail, actualDeliveryReceiptTimestampResult);
    assertSame(actualMessageReceiptDetail, actualDownloadReceiptCountsResult);
    assertSame(actualMessageReceiptDetail, actualEmailNotificationTimestampResult);
    assertSame(actualMessageReceiptDetail, actualReadReceiptTimestampResult);
    assertSame(actualMessageReceiptDetail, actualUserResult);
    assertSame(user, actualUser);
    assertSame(downloadReceiptCounts, actualDownloadReceiptCounts);
  }
}
