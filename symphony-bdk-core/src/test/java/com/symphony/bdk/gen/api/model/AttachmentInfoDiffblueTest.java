package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AttachmentInfoDiffblueTest {
  /**
   * Test {@link AttachmentInfo#equals(Object)}, and {@link AttachmentInfo#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AttachmentInfo#equals(Object)}
   *   <li>{@link AttachmentInfo#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AttachmentInfo.equals(Object)", "int AttachmentInfo.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AttachmentInfo attachmentInfo = new AttachmentInfo();
    AttachmentInfo attachmentInfo2 = new AttachmentInfo();

    // Act and Assert
    assertEquals(attachmentInfo, attachmentInfo2);
    assertEquals(attachmentInfo.hashCode(), attachmentInfo2.hashCode());
  }

  /**
   * Test {@link AttachmentInfo#equals(Object)}, and {@link AttachmentInfo#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AttachmentInfo#equals(Object)}
   *   <li>{@link AttachmentInfo#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AttachmentInfo.equals(Object)", "int AttachmentInfo.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AttachmentInfo attachmentInfo = new AttachmentInfo();

    // Act and Assert
    assertEquals(attachmentInfo, attachmentInfo);
    int expectedHashCodeResult = attachmentInfo.hashCode();
    assertEquals(expectedHashCodeResult, attachmentInfo.hashCode());
  }

  /**
   * Test {@link AttachmentInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AttachmentInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AttachmentInfo.equals(Object)", "int AttachmentInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AttachmentInfo(), 1);
  }

  /**
   * Test {@link AttachmentInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AttachmentInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AttachmentInfo.equals(Object)", "int AttachmentInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    AttachmentInfo attachmentInfo = new AttachmentInfo();
    attachmentInfo.id("42");

    // Act and Assert
    assertNotEquals(attachmentInfo, new AttachmentInfo());
  }

  /**
   * Test {@link AttachmentInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AttachmentInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AttachmentInfo.equals(Object)", "int AttachmentInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    AttachmentInfo attachmentInfo = new AttachmentInfo();
    attachmentInfo.name("Name");

    // Act and Assert
    assertNotEquals(attachmentInfo, new AttachmentInfo());
  }

  /**
   * Test {@link AttachmentInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AttachmentInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AttachmentInfo.equals(Object)", "int AttachmentInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    AttachmentInfo attachmentInfo = new AttachmentInfo();
    attachmentInfo.size(3L);

    // Act and Assert
    assertNotEquals(attachmentInfo, new AttachmentInfo());
  }

  /**
   * Test {@link AttachmentInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AttachmentInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AttachmentInfo.equals(Object)", "int AttachmentInfo.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AttachmentInfo(), null);
  }

  /**
   * Test {@link AttachmentInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AttachmentInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AttachmentInfo.equals(Object)", "int AttachmentInfo.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AttachmentInfo(), "Different type to AttachmentInfo");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link AttachmentInfo}
   *   <li>{@link AttachmentInfo#id(String)}
   *   <li>{@link AttachmentInfo#name(String)}
   *   <li>{@link AttachmentInfo#setId(String)}
   *   <li>{@link AttachmentInfo#setName(String)}
   *   <li>{@link AttachmentInfo#setSize(Long)}
   *   <li>{@link AttachmentInfo#size(Long)}
   *   <li>{@link AttachmentInfo#toString()}
   *   <li>{@link AttachmentInfo#getId()}
   *   <li>{@link AttachmentInfo#getName()}
   *   <li>{@link AttachmentInfo#getSize()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AttachmentInfo.<init>()",
    "String AttachmentInfo.getId()",
    "String AttachmentInfo.getName()",
    "Long AttachmentInfo.getSize()",
    "AttachmentInfo AttachmentInfo.id(String)",
    "AttachmentInfo AttachmentInfo.name(String)",
    "void AttachmentInfo.setId(String)",
    "void AttachmentInfo.setName(String)",
    "void AttachmentInfo.setSize(Long)",
    "AttachmentInfo AttachmentInfo.size(Long)",
    "String AttachmentInfo.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    AttachmentInfo actualAttachmentInfo = new AttachmentInfo();
    AttachmentInfo actualIdResult = actualAttachmentInfo.id("42");
    AttachmentInfo actualNameResult = actualAttachmentInfo.name("Name");
    actualAttachmentInfo.setId("42");
    actualAttachmentInfo.setName("Name");
    actualAttachmentInfo.setSize(3L);
    AttachmentInfo actualSizeResult = actualAttachmentInfo.size(3L);
    String actualToStringResult = actualAttachmentInfo.toString();
    String actualId = actualAttachmentInfo.getId();
    String actualName = actualAttachmentInfo.getName();

    // Assert
    assertEquals("42", actualId);
    assertEquals("Name", actualName);
    assertEquals(
        "class AttachmentInfo {\n    id: 42\n    name: Name\n    size: 3\n}", actualToStringResult);
    assertEquals(3L, actualAttachmentInfo.getSize().longValue());
    assertSame(actualAttachmentInfo, actualIdResult);
    assertSame(actualAttachmentInfo, actualNameResult);
    assertSame(actualAttachmentInfo, actualSizeResult);
  }
}
