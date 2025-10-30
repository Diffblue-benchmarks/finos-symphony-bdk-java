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

class StreamAttachmentItemDiffblueTest {
  /**
   * Test {@link StreamAttachmentItem#addPreviewsItem(AttachmentPreview)}.
   * <ul>
   *   <li>Given {@link StreamAttachmentItem} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link StreamAttachmentItem#addPreviewsItem(AttachmentPreview)}
   */
  @Test
  @DisplayName("Test addPreviewsItem(AttachmentPreview); given StreamAttachmentItem (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"StreamAttachmentItem StreamAttachmentItem.addPreviewsItem(AttachmentPreview)"})
  void testAddPreviewsItem_givenStreamAttachmentItem() {
    // Arrange
    StreamAttachmentItem streamAttachmentItem = new StreamAttachmentItem();

    // Act and Assert
    assertSame(streamAttachmentItem, streamAttachmentItem.addPreviewsItem(new AttachmentPreview()));
  }

  /**
   * Test {@link StreamAttachmentItem#addPreviewsItem(AttachmentPreview)}.
   * <ul>
   *   <li>Given {@link StreamAttachmentItem} (default constructor) previews {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StreamAttachmentItem#addPreviewsItem(AttachmentPreview)}
   */
  @Test
  @DisplayName("Test addPreviewsItem(AttachmentPreview); given StreamAttachmentItem (default constructor) previews ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"StreamAttachmentItem StreamAttachmentItem.addPreviewsItem(AttachmentPreview)"})
  void testAddPreviewsItem_givenStreamAttachmentItemPreviewsArrayList() {
    // Arrange
    StreamAttachmentItem streamAttachmentItem = new StreamAttachmentItem();
    streamAttachmentItem.previews(new ArrayList<>());

    // Act and Assert
    assertSame(streamAttachmentItem, streamAttachmentItem.addPreviewsItem(new AttachmentPreview()));
  }

  /**
   * Test {@link StreamAttachmentItem#equals(Object)}, and {@link StreamAttachmentItem#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link StreamAttachmentItem#equals(Object)}
   *   <li>{@link StreamAttachmentItem#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StreamAttachmentItem.equals(Object)", "int StreamAttachmentItem.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    StreamAttachmentItem streamAttachmentItem = new StreamAttachmentItem();
    StreamAttachmentItem streamAttachmentItem2 = new StreamAttachmentItem();

    // Act and Assert
    assertEquals(streamAttachmentItem, streamAttachmentItem2);
    int expectedHashCodeResult = streamAttachmentItem.hashCode();
    assertEquals(expectedHashCodeResult, streamAttachmentItem2.hashCode());
  }

  /**
   * Test {@link StreamAttachmentItem#equals(Object)}, and {@link StreamAttachmentItem#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link StreamAttachmentItem#equals(Object)}
   *   <li>{@link StreamAttachmentItem#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StreamAttachmentItem.equals(Object)", "int StreamAttachmentItem.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    StreamAttachmentItem streamAttachmentItem = new StreamAttachmentItem();

    // Act and Assert
    assertEquals(streamAttachmentItem, streamAttachmentItem);
    int expectedHashCodeResult = streamAttachmentItem.hashCode();
    assertEquals(expectedHashCodeResult, streamAttachmentItem.hashCode());
  }

  /**
   * Test {@link StreamAttachmentItem#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StreamAttachmentItem#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StreamAttachmentItem.equals(Object)", "int StreamAttachmentItem.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    StreamAttachmentItem streamAttachmentItem = new StreamAttachmentItem();
    streamAttachmentItem.addPreviewsItem(new AttachmentPreview());

    // Act and Assert
    assertNotEquals(streamAttachmentItem, new StreamAttachmentItem());
  }

  /**
   * Test {@link StreamAttachmentItem#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StreamAttachmentItem#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StreamAttachmentItem.equals(Object)", "int StreamAttachmentItem.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    StreamAttachmentItem streamAttachmentItem = new StreamAttachmentItem();
    streamAttachmentItem.messageId("42");
    streamAttachmentItem.addPreviewsItem(new AttachmentPreview());

    // Act and Assert
    assertNotEquals(streamAttachmentItem, new StreamAttachmentItem());
  }

  /**
   * Test {@link StreamAttachmentItem#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StreamAttachmentItem#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StreamAttachmentItem.equals(Object)", "int StreamAttachmentItem.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    StreamAttachmentItem streamAttachmentItem = new StreamAttachmentItem();
    streamAttachmentItem.ingestionDate(1L);
    streamAttachmentItem.addPreviewsItem(new AttachmentPreview());

    // Act and Assert
    assertNotEquals(streamAttachmentItem, new StreamAttachmentItem());
  }

  /**
   * Test {@link StreamAttachmentItem#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StreamAttachmentItem#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StreamAttachmentItem.equals(Object)", "int StreamAttachmentItem.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    StreamAttachmentItem streamAttachmentItem = new StreamAttachmentItem();
    streamAttachmentItem.userId(1L);
    streamAttachmentItem.addPreviewsItem(new AttachmentPreview());

    // Act and Assert
    assertNotEquals(streamAttachmentItem, new StreamAttachmentItem());
  }

  /**
   * Test {@link StreamAttachmentItem#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StreamAttachmentItem#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StreamAttachmentItem.equals(Object)", "int StreamAttachmentItem.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    StreamAttachmentItem streamAttachmentItem = new StreamAttachmentItem();
    streamAttachmentItem.fileId("42");
    streamAttachmentItem.addPreviewsItem(new AttachmentPreview());

    // Act and Assert
    assertNotEquals(streamAttachmentItem, new StreamAttachmentItem());
  }

  /**
   * Test {@link StreamAttachmentItem#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StreamAttachmentItem#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StreamAttachmentItem.equals(Object)", "int StreamAttachmentItem.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    StreamAttachmentItem streamAttachmentItem = new StreamAttachmentItem();
    streamAttachmentItem.name("Name");
    streamAttachmentItem.addPreviewsItem(new AttachmentPreview());

    // Act and Assert
    assertNotEquals(streamAttachmentItem, new StreamAttachmentItem());
  }

  /**
   * Test {@link StreamAttachmentItem#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StreamAttachmentItem#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StreamAttachmentItem.equals(Object)", "int StreamAttachmentItem.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    StreamAttachmentItem streamAttachmentItem = new StreamAttachmentItem();
    streamAttachmentItem.size(3L);
    streamAttachmentItem.addPreviewsItem(new AttachmentPreview());

    // Act and Assert
    assertNotEquals(streamAttachmentItem, new StreamAttachmentItem());
  }

  /**
   * Test {@link StreamAttachmentItem#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StreamAttachmentItem#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StreamAttachmentItem.equals(Object)", "int StreamAttachmentItem.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    StreamAttachmentItem streamAttachmentItem = new StreamAttachmentItem();
    streamAttachmentItem.contentType("text/plain");
    streamAttachmentItem.addPreviewsItem(new AttachmentPreview());

    // Act and Assert
    assertNotEquals(streamAttachmentItem, new StreamAttachmentItem());
  }

  /**
   * Test {@link StreamAttachmentItem#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StreamAttachmentItem#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StreamAttachmentItem.equals(Object)", "int StreamAttachmentItem.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new StreamAttachmentItem(), null);
  }

  /**
   * Test {@link StreamAttachmentItem#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StreamAttachmentItem#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StreamAttachmentItem.equals(Object)", "int StreamAttachmentItem.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new StreamAttachmentItem(), "Different type to StreamAttachmentItem");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link StreamAttachmentItem}
   *   <li>{@link StreamAttachmentItem#contentType(String)}
   *   <li>{@link StreamAttachmentItem#fileId(String)}
   *   <li>{@link StreamAttachmentItem#ingestionDate(Long)}
   *   <li>{@link StreamAttachmentItem#messageId(String)}
   *   <li>{@link StreamAttachmentItem#name(String)}
   *   <li>{@link StreamAttachmentItem#previews(List)}
   *   <li>{@link StreamAttachmentItem#setContentType(String)}
   *   <li>{@link StreamAttachmentItem#setFileId(String)}
   *   <li>{@link StreamAttachmentItem#setIngestionDate(Long)}
   *   <li>{@link StreamAttachmentItem#setMessageId(String)}
   *   <li>{@link StreamAttachmentItem#setName(String)}
   *   <li>{@link StreamAttachmentItem#setPreviews(List)}
   *   <li>{@link StreamAttachmentItem#setSize(Long)}
   *   <li>{@link StreamAttachmentItem#setUserId(Long)}
   *   <li>{@link StreamAttachmentItem#size(Long)}
   *   <li>{@link StreamAttachmentItem#userId(Long)}
   *   <li>{@link StreamAttachmentItem#toString()}
   *   <li>{@link StreamAttachmentItem#getContentType()}
   *   <li>{@link StreamAttachmentItem#getFileId()}
   *   <li>{@link StreamAttachmentItem#getIngestionDate()}
   *   <li>{@link StreamAttachmentItem#getMessageId()}
   *   <li>{@link StreamAttachmentItem#getName()}
   *   <li>{@link StreamAttachmentItem#getPreviews()}
   *   <li>{@link StreamAttachmentItem#getSize()}
   *   <li>{@link StreamAttachmentItem#getUserId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void StreamAttachmentItem.<init>()",
      "StreamAttachmentItem StreamAttachmentItem.contentType(String)",
      "StreamAttachmentItem StreamAttachmentItem.fileId(String)", "String StreamAttachmentItem.getContentType()",
      "String StreamAttachmentItem.getFileId()", "Long StreamAttachmentItem.getIngestionDate()",
      "String StreamAttachmentItem.getMessageId()", "String StreamAttachmentItem.getName()",
      "List StreamAttachmentItem.getPreviews()", "Long StreamAttachmentItem.getSize()",
      "Long StreamAttachmentItem.getUserId()", "StreamAttachmentItem StreamAttachmentItem.ingestionDate(Long)",
      "StreamAttachmentItem StreamAttachmentItem.messageId(String)",
      "StreamAttachmentItem StreamAttachmentItem.name(String)",
      "StreamAttachmentItem StreamAttachmentItem.previews(List)", "void StreamAttachmentItem.setContentType(String)",
      "void StreamAttachmentItem.setFileId(String)", "void StreamAttachmentItem.setIngestionDate(Long)",
      "void StreamAttachmentItem.setMessageId(String)", "void StreamAttachmentItem.setName(String)",
      "void StreamAttachmentItem.setPreviews(List)", "void StreamAttachmentItem.setSize(Long)",
      "void StreamAttachmentItem.setUserId(Long)", "StreamAttachmentItem StreamAttachmentItem.size(Long)",
      "String StreamAttachmentItem.toString()", "StreamAttachmentItem StreamAttachmentItem.userId(Long)"})
  void testGettersAndSetters() {
    // Arrange and Act
    StreamAttachmentItem actualStreamAttachmentItem = new StreamAttachmentItem();
    StreamAttachmentItem actualContentTypeResult = actualStreamAttachmentItem.contentType("text/plain");
    StreamAttachmentItem actualFileIdResult = actualStreamAttachmentItem.fileId("42");
    StreamAttachmentItem actualIngestionDateResult = actualStreamAttachmentItem.ingestionDate(1L);
    StreamAttachmentItem actualMessageIdResult = actualStreamAttachmentItem.messageId("42");
    StreamAttachmentItem actualNameResult = actualStreamAttachmentItem.name("Name");
    StreamAttachmentItem actualPreviewsResult = actualStreamAttachmentItem.previews(new ArrayList<>());
    actualStreamAttachmentItem.setContentType("text/plain");
    actualStreamAttachmentItem.setFileId("42");
    actualStreamAttachmentItem.setIngestionDate(1L);
    actualStreamAttachmentItem.setMessageId("42");
    actualStreamAttachmentItem.setName("Name");
    ArrayList<AttachmentPreview> previews = new ArrayList<>();
    actualStreamAttachmentItem.setPreviews(previews);
    actualStreamAttachmentItem.setSize(3L);
    actualStreamAttachmentItem.setUserId(1L);
    StreamAttachmentItem actualSizeResult = actualStreamAttachmentItem.size(3L);
    StreamAttachmentItem actualUserIdResult = actualStreamAttachmentItem.userId(1L);
    String actualToStringResult = actualStreamAttachmentItem.toString();
    String actualContentType = actualStreamAttachmentItem.getContentType();
    String actualFileId = actualStreamAttachmentItem.getFileId();
    Long actualIngestionDate = actualStreamAttachmentItem.getIngestionDate();
    String actualMessageId = actualStreamAttachmentItem.getMessageId();
    String actualName = actualStreamAttachmentItem.getName();
    List<AttachmentPreview> actualPreviews = actualStreamAttachmentItem.getPreviews();
    Long actualSize = actualStreamAttachmentItem.getSize();
    Long actualUserId = actualStreamAttachmentItem.getUserId();

    // Assert
    assertEquals("42", actualFileId);
    assertEquals("42", actualMessageId);
    assertEquals("Name", actualName);
    assertEquals("class StreamAttachmentItem {\n" + "    messageId: 42\n" + "    ingestionDate: 1\n" + "    userId: 1\n"
        + "    fileId: 42\n" + "    name: Name\n" + "    size: 3\n" + "    contentType: text/plain\n"
        + "    previews: []\n" + "}", actualToStringResult);
    assertEquals("text/plain", actualContentType);
    assertEquals(1L, actualIngestionDate.longValue());
    assertEquals(1L, actualUserId.longValue());
    assertEquals(3L, actualSize.longValue());
    assertTrue(actualPreviews.isEmpty());
    assertSame(actualStreamAttachmentItem, actualContentTypeResult);
    assertSame(actualStreamAttachmentItem, actualFileIdResult);
    assertSame(actualStreamAttachmentItem, actualIngestionDateResult);
    assertSame(actualStreamAttachmentItem, actualMessageIdResult);
    assertSame(actualStreamAttachmentItem, actualNameResult);
    assertSame(actualStreamAttachmentItem, actualPreviewsResult);
    assertSame(actualStreamAttachmentItem, actualSizeResult);
    assertSame(actualStreamAttachmentItem, actualUserIdResult);
    assertSame(previews, actualPreviews);
  }
}
