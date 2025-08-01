package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V4ImportedMessageAttachmentDiffblueTest {
  /**
   * Test {@link V4ImportedMessageAttachment#equals(Object)}, and {@link
   * V4ImportedMessageAttachment#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4ImportedMessageAttachment#equals(Object)}
   *   <li>{@link V4ImportedMessageAttachment#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4ImportedMessageAttachment.equals(Object)",
    "int V4ImportedMessageAttachment.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4ImportedMessageAttachment v4ImportedMessageAttachment = new V4ImportedMessageAttachment();
    V4ImportedMessageAttachment v4ImportedMessageAttachment2 = new V4ImportedMessageAttachment();

    // Act and Assert
    assertEquals(v4ImportedMessageAttachment, v4ImportedMessageAttachment2);
    int expectedHashCodeResult = v4ImportedMessageAttachment.hashCode();
    assertEquals(expectedHashCodeResult, v4ImportedMessageAttachment2.hashCode());
  }

  /**
   * Test {@link V4ImportedMessageAttachment#equals(Object)}, and {@link
   * V4ImportedMessageAttachment#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4ImportedMessageAttachment#equals(Object)}
   *   <li>{@link V4ImportedMessageAttachment#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4ImportedMessageAttachment.equals(Object)",
    "int V4ImportedMessageAttachment.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4ImportedMessageAttachment v4ImportedMessageAttachment = new V4ImportedMessageAttachment();

    // Act and Assert
    assertEquals(v4ImportedMessageAttachment, v4ImportedMessageAttachment);
    int expectedHashCodeResult = v4ImportedMessageAttachment.hashCode();
    assertEquals(expectedHashCodeResult, v4ImportedMessageAttachment.hashCode());
  }

  /**
   * Test {@link V4ImportedMessageAttachment#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4ImportedMessageAttachment#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4ImportedMessageAttachment.equals(Object)",
    "int V4ImportedMessageAttachment.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4ImportedMessageAttachment(), 1);
  }

  /**
   * Test {@link V4ImportedMessageAttachment#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4ImportedMessageAttachment#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4ImportedMessageAttachment.equals(Object)",
    "int V4ImportedMessageAttachment.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V4ImportedMessageAttachment v4ImportedMessageAttachment = new V4ImportedMessageAttachment();
    v4ImportedMessageAttachment.filename("foo.txt");

    // Act and Assert
    assertNotEquals(v4ImportedMessageAttachment, new V4ImportedMessageAttachment());
  }

  /**
   * Test {@link V4ImportedMessageAttachment#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4ImportedMessageAttachment#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4ImportedMessageAttachment.equals(Object)",
    "int V4ImportedMessageAttachment.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V4ImportedMessageAttachment v4ImportedMessageAttachment = new V4ImportedMessageAttachment();
    v4ImportedMessageAttachment.content("Not all who wander are lost");

    // Act and Assert
    assertNotEquals(v4ImportedMessageAttachment, new V4ImportedMessageAttachment());
  }

  /**
   * Test {@link V4ImportedMessageAttachment#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4ImportedMessageAttachment#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4ImportedMessageAttachment.equals(Object)",
    "int V4ImportedMessageAttachment.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4ImportedMessageAttachment(), null);
  }

  /**
   * Test {@link V4ImportedMessageAttachment#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4ImportedMessageAttachment#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4ImportedMessageAttachment.equals(Object)",
    "int V4ImportedMessageAttachment.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new V4ImportedMessageAttachment(), "Different type to V4ImportedMessageAttachment");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V4ImportedMessageAttachment}
   *   <li>{@link V4ImportedMessageAttachment#content(String)}
   *   <li>{@link V4ImportedMessageAttachment#filename(String)}
   *   <li>{@link V4ImportedMessageAttachment#setContent(String)}
   *   <li>{@link V4ImportedMessageAttachment#setFilename(String)}
   *   <li>{@link V4ImportedMessageAttachment#toString()}
   *   <li>{@link V4ImportedMessageAttachment#getContent()}
   *   <li>{@link V4ImportedMessageAttachment#getFilename()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V4ImportedMessageAttachment.<init>()",
    "V4ImportedMessageAttachment V4ImportedMessageAttachment.content(String)",
    "V4ImportedMessageAttachment V4ImportedMessageAttachment.filename(String)",
    "String V4ImportedMessageAttachment.getContent()",
    "String V4ImportedMessageAttachment.getFilename()",
    "void V4ImportedMessageAttachment.setContent(String)",
    "void V4ImportedMessageAttachment.setFilename(String)",
    "String V4ImportedMessageAttachment.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V4ImportedMessageAttachment actualV4ImportedMessageAttachment =
        new V4ImportedMessageAttachment();
    V4ImportedMessageAttachment actualContentResult =
        actualV4ImportedMessageAttachment.content("Not all who wander are lost");
    V4ImportedMessageAttachment actualFilenameResult =
        actualV4ImportedMessageAttachment.filename("foo.txt");
    actualV4ImportedMessageAttachment.setContent("Not all who wander are lost");
    actualV4ImportedMessageAttachment.setFilename("foo.txt");
    String actualToStringResult = actualV4ImportedMessageAttachment.toString();
    String actualContent = actualV4ImportedMessageAttachment.getContent();

    // Assert
    assertEquals("Not all who wander are lost", actualContent);
    assertEquals(
        "class V4ImportedMessageAttachment {\n    filename: foo.txt\n    content: Not all who wander are lost\n}",
        actualToStringResult);
    assertEquals("foo.txt", actualV4ImportedMessageAttachment.getFilename());
    assertSame(actualV4ImportedMessageAttachment, actualContentResult);
    assertSame(actualV4ImportedMessageAttachment, actualFilenameResult);
  }
}
