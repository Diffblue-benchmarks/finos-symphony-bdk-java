package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MessageDownloadReceiptCountDiffblueTest {
  /**
   * Test {@link MessageDownloadReceiptCount#equals(Object)}, and {@link
   * MessageDownloadReceiptCount#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MessageDownloadReceiptCount#equals(Object)}
   *   <li>{@link MessageDownloadReceiptCount#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageDownloadReceiptCount.equals(Object)",
    "int MessageDownloadReceiptCount.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MessageDownloadReceiptCount messageDownloadReceiptCount = new MessageDownloadReceiptCount();
    MessageDownloadReceiptCount messageDownloadReceiptCount2 = new MessageDownloadReceiptCount();

    // Act and Assert
    assertEquals(messageDownloadReceiptCount, messageDownloadReceiptCount2);
    assertEquals(messageDownloadReceiptCount.hashCode(), messageDownloadReceiptCount2.hashCode());
  }

  /**
   * Test {@link MessageDownloadReceiptCount#equals(Object)}, and {@link
   * MessageDownloadReceiptCount#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MessageDownloadReceiptCount#equals(Object)}
   *   <li>{@link MessageDownloadReceiptCount#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageDownloadReceiptCount.equals(Object)",
    "int MessageDownloadReceiptCount.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MessageDownloadReceiptCount messageDownloadReceiptCount = new MessageDownloadReceiptCount();

    // Act and Assert
    assertEquals(messageDownloadReceiptCount, messageDownloadReceiptCount);
    int expectedHashCodeResult = messageDownloadReceiptCount.hashCode();
    assertEquals(expectedHashCodeResult, messageDownloadReceiptCount.hashCode());
  }

  /**
   * Test {@link MessageDownloadReceiptCount#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageDownloadReceiptCount#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageDownloadReceiptCount.equals(Object)",
    "int MessageDownloadReceiptCount.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageDownloadReceiptCount(), 1);
  }

  /**
   * Test {@link MessageDownloadReceiptCount#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageDownloadReceiptCount#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageDownloadReceiptCount.equals(Object)",
    "int MessageDownloadReceiptCount.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    MessageDownloadReceiptCount messageDownloadReceiptCount = new MessageDownloadReceiptCount();
    messageDownloadReceiptCount.fileName("foo.txt");

    // Act and Assert
    assertNotEquals(messageDownloadReceiptCount, new MessageDownloadReceiptCount());
  }

  /**
   * Test {@link MessageDownloadReceiptCount#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageDownloadReceiptCount#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageDownloadReceiptCount.equals(Object)",
    "int MessageDownloadReceiptCount.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    MessageDownloadReceiptCount messageDownloadReceiptCount = new MessageDownloadReceiptCount();
    messageDownloadReceiptCount.count(3L);

    // Act and Assert
    assertNotEquals(messageDownloadReceiptCount, new MessageDownloadReceiptCount());
  }

  /**
   * Test {@link MessageDownloadReceiptCount#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageDownloadReceiptCount#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageDownloadReceiptCount.equals(Object)",
    "int MessageDownloadReceiptCount.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageDownloadReceiptCount(), null);
  }

  /**
   * Test {@link MessageDownloadReceiptCount#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageDownloadReceiptCount#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageDownloadReceiptCount.equals(Object)",
    "int MessageDownloadReceiptCount.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new MessageDownloadReceiptCount(), "Different type to MessageDownloadReceiptCount");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link MessageDownloadReceiptCount}
   *   <li>{@link MessageDownloadReceiptCount#count(Long)}
   *   <li>{@link MessageDownloadReceiptCount#fileName(String)}
   *   <li>{@link MessageDownloadReceiptCount#setCount(Long)}
   *   <li>{@link MessageDownloadReceiptCount#setFileName(String)}
   *   <li>{@link MessageDownloadReceiptCount#toString()}
   *   <li>{@link MessageDownloadReceiptCount#getCount()}
   *   <li>{@link MessageDownloadReceiptCount#getFileName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void MessageDownloadReceiptCount.<init>()",
    "MessageDownloadReceiptCount MessageDownloadReceiptCount.count(Long)",
    "MessageDownloadReceiptCount MessageDownloadReceiptCount.fileName(String)",
    "Long MessageDownloadReceiptCount.getCount()",
    "String MessageDownloadReceiptCount.getFileName()",
    "void MessageDownloadReceiptCount.setCount(Long)",
    "void MessageDownloadReceiptCount.setFileName(String)",
    "String MessageDownloadReceiptCount.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    MessageDownloadReceiptCount actualMessageDownloadReceiptCount =
        new MessageDownloadReceiptCount();
    MessageDownloadReceiptCount actualCountResult = actualMessageDownloadReceiptCount.count(3L);
    MessageDownloadReceiptCount actualFileNameResult =
        actualMessageDownloadReceiptCount.fileName("foo.txt");
    actualMessageDownloadReceiptCount.setCount(3L);
    actualMessageDownloadReceiptCount.setFileName("foo.txt");
    String actualToStringResult = actualMessageDownloadReceiptCount.toString();
    Long actualCount = actualMessageDownloadReceiptCount.getCount();

    // Assert
    assertEquals(
        "class MessageDownloadReceiptCount {\n    fileName: foo.txt\n    count: 3\n}",
        actualToStringResult);
    assertEquals("foo.txt", actualMessageDownloadReceiptCount.getFileName());
    assertEquals(3L, actualCount.longValue());
    assertSame(actualMessageDownloadReceiptCount, actualCountResult);
    assertSame(actualMessageDownloadReceiptCount, actualFileNameResult);
  }
}
