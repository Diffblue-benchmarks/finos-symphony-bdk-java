package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DownloadReceiptCountDiffblueTest {
  /**
   * Test {@link DownloadReceiptCount#equals(Object)}, and {@link DownloadReceiptCount#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DownloadReceiptCount#equals(Object)}
   *   <li>{@link DownloadReceiptCount#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DownloadReceiptCount.equals(Object)",
    "int DownloadReceiptCount.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DownloadReceiptCount downloadReceiptCount = new DownloadReceiptCount();
    DownloadReceiptCount downloadReceiptCount2 = new DownloadReceiptCount();

    // Act and Assert
    assertEquals(downloadReceiptCount, downloadReceiptCount2);
    int expectedHashCodeResult = downloadReceiptCount.hashCode();
    assertEquals(expectedHashCodeResult, downloadReceiptCount2.hashCode());
  }

  /**
   * Test {@link DownloadReceiptCount#equals(Object)}, and {@link DownloadReceiptCount#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DownloadReceiptCount#equals(Object)}
   *   <li>{@link DownloadReceiptCount#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DownloadReceiptCount.equals(Object)",
    "int DownloadReceiptCount.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DownloadReceiptCount downloadReceiptCount = new DownloadReceiptCount();

    // Act and Assert
    assertEquals(downloadReceiptCount, downloadReceiptCount);
    int expectedHashCodeResult = downloadReceiptCount.hashCode();
    assertEquals(expectedHashCodeResult, downloadReceiptCount.hashCode());
  }

  /**
   * Test {@link DownloadReceiptCount#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DownloadReceiptCount#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DownloadReceiptCount.equals(Object)",
    "int DownloadReceiptCount.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new DownloadReceiptCount(), 1);
  }

  /**
   * Test {@link DownloadReceiptCount#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DownloadReceiptCount#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DownloadReceiptCount.equals(Object)",
    "int DownloadReceiptCount.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    DownloadReceiptCount downloadReceiptCount = new DownloadReceiptCount();
    downloadReceiptCount.fileName("foo.txt");

    // Act and Assert
    assertNotEquals(downloadReceiptCount, new DownloadReceiptCount());
  }

  /**
   * Test {@link DownloadReceiptCount#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DownloadReceiptCount#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DownloadReceiptCount.equals(Object)",
    "int DownloadReceiptCount.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    DownloadReceiptCount downloadReceiptCount = new DownloadReceiptCount();
    downloadReceiptCount.timestamp(10L);

    // Act and Assert
    assertNotEquals(downloadReceiptCount, new DownloadReceiptCount());
  }

  /**
   * Test {@link DownloadReceiptCount#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DownloadReceiptCount#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DownloadReceiptCount.equals(Object)",
    "int DownloadReceiptCount.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new DownloadReceiptCount(), null);
  }

  /**
   * Test {@link DownloadReceiptCount#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DownloadReceiptCount#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DownloadReceiptCount.equals(Object)",
    "int DownloadReceiptCount.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new DownloadReceiptCount(), "Different type to DownloadReceiptCount");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link DownloadReceiptCount}
   *   <li>{@link DownloadReceiptCount#fileName(String)}
   *   <li>{@link DownloadReceiptCount#setFileName(String)}
   *   <li>{@link DownloadReceiptCount#setTimestamp(Long)}
   *   <li>{@link DownloadReceiptCount#timestamp(Long)}
   *   <li>{@link DownloadReceiptCount#toString()}
   *   <li>{@link DownloadReceiptCount#getFileName()}
   *   <li>{@link DownloadReceiptCount#getTimestamp()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DownloadReceiptCount.<init>()",
    "DownloadReceiptCount DownloadReceiptCount.fileName(String)",
    "String DownloadReceiptCount.getFileName()",
    "Long DownloadReceiptCount.getTimestamp()",
    "void DownloadReceiptCount.setFileName(String)",
    "void DownloadReceiptCount.setTimestamp(Long)",
    "DownloadReceiptCount DownloadReceiptCount.timestamp(Long)",
    "String DownloadReceiptCount.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    DownloadReceiptCount actualDownloadReceiptCount = new DownloadReceiptCount();
    DownloadReceiptCount actualFileNameResult = actualDownloadReceiptCount.fileName("foo.txt");
    actualDownloadReceiptCount.setFileName("foo.txt");
    actualDownloadReceiptCount.setTimestamp(10L);
    DownloadReceiptCount actualTimestampResult = actualDownloadReceiptCount.timestamp(10L);
    String actualToStringResult = actualDownloadReceiptCount.toString();
    String actualFileName = actualDownloadReceiptCount.getFileName();

    // Assert
    assertEquals(
        "class DownloadReceiptCount {\n    fileName: foo.txt\n    timestamp: 10\n}",
        actualToStringResult);
    assertEquals("foo.txt", actualFileName);
    assertEquals(10L, actualDownloadReceiptCount.getTimestamp().longValue());
    assertSame(actualDownloadReceiptCount, actualFileNameResult);
    assertSame(actualDownloadReceiptCount, actualTimestampResult);
  }
}
