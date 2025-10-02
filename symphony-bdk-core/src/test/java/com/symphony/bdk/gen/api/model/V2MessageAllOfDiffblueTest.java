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

class V2MessageAllOfDiffblueTest {
  /**
   * Test {@link V2MessageAllOf#addAttachmentsItem(AttachmentInfo)}.
   *
   * <ul>
   *   <li>Given {@link V2MessageAllOf} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link V2MessageAllOf#addAttachmentsItem(AttachmentInfo)}
   */
  @Test
  @DisplayName(
      "Test addAttachmentsItem(AttachmentInfo); given V2MessageAllOf (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2MessageAllOf V2MessageAllOf.addAttachmentsItem(AttachmentInfo)"})
  void testAddAttachmentsItem_givenV2MessageAllOf() {
    // Arrange
    V2MessageAllOf v2MessageAllOf = new V2MessageAllOf();

    // Act
    V2MessageAllOf actualAddAttachmentsItemResult =
        v2MessageAllOf.addAttachmentsItem(new AttachmentInfo());

    // Assert
    assertSame(v2MessageAllOf, actualAddAttachmentsItemResult);
  }

  /**
   * Test {@link V2MessageAllOf#addAttachmentsItem(AttachmentInfo)}.
   *
   * <ul>
   *   <li>Given {@link V2MessageAllOf} (default constructor) attachments {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link V2MessageAllOf#addAttachmentsItem(AttachmentInfo)}
   */
  @Test
  @DisplayName(
      "Test addAttachmentsItem(AttachmentInfo); given V2MessageAllOf (default constructor) attachments ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2MessageAllOf V2MessageAllOf.addAttachmentsItem(AttachmentInfo)"})
  void testAddAttachmentsItem_givenV2MessageAllOfAttachmentsArrayList() {
    // Arrange
    V2MessageAllOf v2MessageAllOf = new V2MessageAllOf();
    v2MessageAllOf.attachments(new ArrayList<>());

    // Act
    V2MessageAllOf actualAddAttachmentsItemResult =
        v2MessageAllOf.addAttachmentsItem(new AttachmentInfo());

    // Assert
    assertSame(v2MessageAllOf, actualAddAttachmentsItemResult);
  }

  /**
   * Test {@link V2MessageAllOf#equals(Object)}, and {@link V2MessageAllOf#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2MessageAllOf#equals(Object)}
   *   <li>{@link V2MessageAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2MessageAllOf.equals(Object)", "int V2MessageAllOf.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2MessageAllOf v2MessageAllOf = new V2MessageAllOf();
    V2MessageAllOf v2MessageAllOf2 = new V2MessageAllOf();

    // Act and Assert
    assertEquals(v2MessageAllOf, v2MessageAllOf2);
    assertEquals(v2MessageAllOf.hashCode(), v2MessageAllOf2.hashCode());
  }

  /**
   * Test {@link V2MessageAllOf#equals(Object)}, and {@link V2MessageAllOf#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2MessageAllOf#equals(Object)}
   *   <li>{@link V2MessageAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2MessageAllOf.equals(Object)", "int V2MessageAllOf.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2MessageAllOf v2MessageAllOf = new V2MessageAllOf();

    // Act and Assert
    assertEquals(v2MessageAllOf, v2MessageAllOf);
    int expectedHashCodeResult = v2MessageAllOf.hashCode();
    assertEquals(expectedHashCodeResult, v2MessageAllOf.hashCode());
  }

  /**
   * Test {@link V2MessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2MessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2MessageAllOf.equals(Object)", "int V2MessageAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V2MessageAllOf v2MessageAllOf = new V2MessageAllOf();
    v2MessageAllOf.addAttachmentsItem(new AttachmentInfo());

    // Act and Assert
    assertNotEquals(v2MessageAllOf, new V2MessageAllOf());
  }

  /**
   * Test {@link V2MessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2MessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2MessageAllOf.equals(Object)", "int V2MessageAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V2MessageAllOf v2MessageAllOf = new V2MessageAllOf();
    v2MessageAllOf.message("Not all who wander are lost");
    v2MessageAllOf.addAttachmentsItem(new AttachmentInfo());

    // Act and Assert
    assertNotEquals(v2MessageAllOf, new V2MessageAllOf());
  }

  /**
   * Test {@link V2MessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2MessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2MessageAllOf.equals(Object)", "int V2MessageAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V2MessageAllOf v2MessageAllOf = new V2MessageAllOf();
    v2MessageAllOf.fromUserId(1L);
    v2MessageAllOf.addAttachmentsItem(new AttachmentInfo());

    // Act and Assert
    assertNotEquals(v2MessageAllOf, new V2MessageAllOf());
  }

  /**
   * Test {@link V2MessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2MessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2MessageAllOf.equals(Object)", "int V2MessageAllOf.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2MessageAllOf(), null);
  }

  /**
   * Test {@link V2MessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2MessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2MessageAllOf.equals(Object)", "int V2MessageAllOf.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2MessageAllOf(), "Different type to V2MessageAllOf");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V2MessageAllOf}
   *   <li>{@link V2MessageAllOf#attachments(List)}
   *   <li>{@link V2MessageAllOf#fromUserId(Long)}
   *   <li>{@link V2MessageAllOf#message(String)}
   *   <li>{@link V2MessageAllOf#setAttachments(List)}
   *   <li>{@link V2MessageAllOf#setFromUserId(Long)}
   *   <li>{@link V2MessageAllOf#setMessage(String)}
   *   <li>{@link V2MessageAllOf#toString()}
   *   <li>{@link V2MessageAllOf#getAttachments()}
   *   <li>{@link V2MessageAllOf#getFromUserId()}
   *   <li>{@link V2MessageAllOf#getMessage()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V2MessageAllOf.<init>()",
    "V2MessageAllOf V2MessageAllOf.attachments(List)",
    "V2MessageAllOf V2MessageAllOf.fromUserId(Long)",
    "List V2MessageAllOf.getAttachments()",
    "Long V2MessageAllOf.getFromUserId()",
    "String V2MessageAllOf.getMessage()",
    "V2MessageAllOf V2MessageAllOf.message(String)",
    "void V2MessageAllOf.setAttachments(List)",
    "void V2MessageAllOf.setFromUserId(Long)",
    "void V2MessageAllOf.setMessage(String)",
    "String V2MessageAllOf.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V2MessageAllOf actualV2MessageAllOf = new V2MessageAllOf();
    V2MessageAllOf actualAttachmentsResult = actualV2MessageAllOf.attachments(new ArrayList<>());
    V2MessageAllOf actualFromUserIdResult = actualV2MessageAllOf.fromUserId(1L);
    V2MessageAllOf actualMessageResult =
        actualV2MessageAllOf.message("Not all who wander are lost");
    ArrayList<AttachmentInfo> attachments = new ArrayList<>();
    actualV2MessageAllOf.setAttachments(attachments);
    actualV2MessageAllOf.setFromUserId(1L);
    actualV2MessageAllOf.setMessage("Not all who wander are lost");
    String actualToStringResult = actualV2MessageAllOf.toString();
    List<AttachmentInfo> actualAttachments = actualV2MessageAllOf.getAttachments();
    Long actualFromUserId = actualV2MessageAllOf.getFromUserId();

    // Assert
    assertEquals("Not all who wander are lost", actualV2MessageAllOf.getMessage());
    assertEquals(
        "class V2MessageAllOf {\n"
            + "    message: Not all who wander are lost\n"
            + "    fromUserId: 1\n"
            + "    attachments: []\n"
            + "}",
        actualToStringResult);
    assertEquals(1L, actualFromUserId.longValue());
    assertTrue(actualAttachments.isEmpty());
    assertSame(actualV2MessageAllOf, actualAttachmentsResult);
    assertSame(actualV2MessageAllOf, actualFromUserIdResult);
    assertSame(actualV2MessageAllOf, actualMessageResult);
    assertSame(attachments, actualAttachments);
  }
}
