package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AttachmentPreviewDiffblueTest {
  /**
   * Test {@link AttachmentPreview#equals(Object)}, and {@link AttachmentPreview#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AttachmentPreview#equals(Object)}
   *   <li>{@link AttachmentPreview#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AttachmentPreview.equals(Object)", "int AttachmentPreview.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AttachmentPreview attachmentPreview = new AttachmentPreview();
    AttachmentPreview attachmentPreview2 = new AttachmentPreview();

    // Act and Assert
    assertEquals(attachmentPreview, attachmentPreview2);
    int expectedHashCodeResult = attachmentPreview.hashCode();
    assertEquals(expectedHashCodeResult, attachmentPreview2.hashCode());
  }

  /**
   * Test {@link AttachmentPreview#equals(Object)}, and {@link AttachmentPreview#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AttachmentPreview#equals(Object)}
   *   <li>{@link AttachmentPreview#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AttachmentPreview.equals(Object)", "int AttachmentPreview.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AttachmentPreview attachmentPreview = new AttachmentPreview();

    // Act and Assert
    assertEquals(attachmentPreview, attachmentPreview);
    int expectedHashCodeResult = attachmentPreview.hashCode();
    assertEquals(expectedHashCodeResult, attachmentPreview.hashCode());
  }

  /**
   * Test {@link AttachmentPreview#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AttachmentPreview#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AttachmentPreview.equals(Object)", "int AttachmentPreview.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AttachmentPreview(), 1);
  }

  /**
   * Test {@link AttachmentPreview#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AttachmentPreview#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AttachmentPreview.equals(Object)", "int AttachmentPreview.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    AttachmentPreview attachmentPreview = new AttachmentPreview();
    attachmentPreview.fileId("42");

    // Act and Assert
    assertNotEquals(attachmentPreview, new AttachmentPreview());
  }

  /**
   * Test {@link AttachmentPreview#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AttachmentPreview#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AttachmentPreview.equals(Object)", "int AttachmentPreview.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    AttachmentPreview attachmentPreview = new AttachmentPreview();
    attachmentPreview.width(1);

    // Act and Assert
    assertNotEquals(attachmentPreview, new AttachmentPreview());
  }

  /**
   * Test {@link AttachmentPreview#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AttachmentPreview#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AttachmentPreview.equals(Object)", "int AttachmentPreview.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AttachmentPreview(), null);
  }

  /**
   * Test {@link AttachmentPreview#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AttachmentPreview#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AttachmentPreview.equals(Object)", "int AttachmentPreview.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AttachmentPreview(), "Different type to AttachmentPreview");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link AttachmentPreview}
   *   <li>{@link AttachmentPreview#fileId(String)}
   *   <li>{@link AttachmentPreview#setFileId(String)}
   *   <li>{@link AttachmentPreview#setWidth(Integer)}
   *   <li>{@link AttachmentPreview#width(Integer)}
   *   <li>{@link AttachmentPreview#toString()}
   *   <li>{@link AttachmentPreview#getFileId()}
   *   <li>{@link AttachmentPreview#getWidth()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AttachmentPreview.<init>()", "AttachmentPreview AttachmentPreview.fileId(String)",
      "String AttachmentPreview.getFileId()", "Integer AttachmentPreview.getWidth()",
      "void AttachmentPreview.setFileId(String)", "void AttachmentPreview.setWidth(Integer)",
      "String AttachmentPreview.toString()", "AttachmentPreview AttachmentPreview.width(Integer)"})
  void testGettersAndSetters() {
    // Arrange and Act
    AttachmentPreview actualAttachmentPreview = new AttachmentPreview();
    AttachmentPreview actualFileIdResult = actualAttachmentPreview.fileId("42");
    actualAttachmentPreview.setFileId("42");
    actualAttachmentPreview.setWidth(1);
    AttachmentPreview actualWidthResult = actualAttachmentPreview.width(1);
    String actualToStringResult = actualAttachmentPreview.toString();
    String actualFileId = actualAttachmentPreview.getFileId();

    // Assert
    assertEquals("42", actualFileId);
    assertEquals("class AttachmentPreview {\n    fileId: 42\n    width: 1\n}", actualToStringResult);
    assertEquals(1, actualAttachmentPreview.getWidth().intValue());
    assertSame(actualAttachmentPreview, actualFileIdResult);
    assertSame(actualAttachmentPreview, actualWidthResult);
  }
}
