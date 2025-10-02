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

class V4AttachmentInfoDiffblueTest {
  /**
   * Test {@link V4AttachmentInfo#addImagesItem(V4ThumbnailInfo)}.
   *
   * <p>Method under test: {@link V4AttachmentInfo#addImagesItem(V4ThumbnailInfo)}
   */
  @Test
  @DisplayName("Test addImagesItem(V4ThumbnailInfo)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V4AttachmentInfo V4AttachmentInfo.addImagesItem(V4ThumbnailInfo)"})
  void testAddImagesItem() {
    // Arrange
    V4AttachmentInfo v4AttachmentInfo = new V4AttachmentInfo();

    // Act
    V4AttachmentInfo actualAddImagesItemResult =
        v4AttachmentInfo.addImagesItem(new V4ThumbnailInfo());

    // Assert
    assertSame(v4AttachmentInfo, actualAddImagesItemResult);
  }

  /**
   * Test {@link V4AttachmentInfo#equals(Object)}, and {@link V4AttachmentInfo#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4AttachmentInfo#equals(Object)}
   *   <li>{@link V4AttachmentInfo#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4AttachmentInfo.equals(Object)", "int V4AttachmentInfo.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4AttachmentInfo v4AttachmentInfo = new V4AttachmentInfo();
    V4AttachmentInfo v4AttachmentInfo2 = new V4AttachmentInfo();

    // Act and Assert
    assertEquals(v4AttachmentInfo, v4AttachmentInfo2);
    assertEquals(v4AttachmentInfo.hashCode(), v4AttachmentInfo2.hashCode());
  }

  /**
   * Test {@link V4AttachmentInfo#equals(Object)}, and {@link V4AttachmentInfo#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4AttachmentInfo#equals(Object)}
   *   <li>{@link V4AttachmentInfo#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4AttachmentInfo.equals(Object)", "int V4AttachmentInfo.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4AttachmentInfo v4AttachmentInfo = new V4AttachmentInfo();

    // Act and Assert
    assertEquals(v4AttachmentInfo, v4AttachmentInfo);
    int expectedHashCodeResult = v4AttachmentInfo.hashCode();
    assertEquals(expectedHashCodeResult, v4AttachmentInfo.hashCode());
  }

  /**
   * Test {@link V4AttachmentInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4AttachmentInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4AttachmentInfo.equals(Object)", "int V4AttachmentInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V4AttachmentInfo v4AttachmentInfo = new V4AttachmentInfo();
    v4AttachmentInfo.addImagesItem(new V4ThumbnailInfo());

    // Act and Assert
    assertNotEquals(v4AttachmentInfo, new V4AttachmentInfo());
  }

  /**
   * Test {@link V4AttachmentInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4AttachmentInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4AttachmentInfo.equals(Object)", "int V4AttachmentInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V4AttachmentInfo v4AttachmentInfo = new V4AttachmentInfo();
    v4AttachmentInfo.id("42");
    v4AttachmentInfo.addImagesItem(new V4ThumbnailInfo());

    // Act and Assert
    assertNotEquals(v4AttachmentInfo, new V4AttachmentInfo());
  }

  /**
   * Test {@link V4AttachmentInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4AttachmentInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4AttachmentInfo.equals(Object)", "int V4AttachmentInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V4AttachmentInfo v4AttachmentInfo = new V4AttachmentInfo();
    v4AttachmentInfo.name("Name");
    v4AttachmentInfo.addImagesItem(new V4ThumbnailInfo());

    // Act and Assert
    assertNotEquals(v4AttachmentInfo, new V4AttachmentInfo());
  }

  /**
   * Test {@link V4AttachmentInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4AttachmentInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4AttachmentInfo.equals(Object)", "int V4AttachmentInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V4AttachmentInfo v4AttachmentInfo = new V4AttachmentInfo();
    v4AttachmentInfo.size(3L);
    v4AttachmentInfo.addImagesItem(new V4ThumbnailInfo());

    // Act and Assert
    assertNotEquals(v4AttachmentInfo, new V4AttachmentInfo());
  }

  /**
   * Test {@link V4AttachmentInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4AttachmentInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4AttachmentInfo.equals(Object)", "int V4AttachmentInfo.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4AttachmentInfo(), null);
  }

  /**
   * Test {@link V4AttachmentInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4AttachmentInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4AttachmentInfo.equals(Object)", "int V4AttachmentInfo.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4AttachmentInfo(), "Different type to V4AttachmentInfo");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V4AttachmentInfo}
   *   <li>{@link V4AttachmentInfo#id(String)}
   *   <li>{@link V4AttachmentInfo#images(List)}
   *   <li>{@link V4AttachmentInfo#name(String)}
   *   <li>{@link V4AttachmentInfo#setId(String)}
   *   <li>{@link V4AttachmentInfo#setImages(List)}
   *   <li>{@link V4AttachmentInfo#setName(String)}
   *   <li>{@link V4AttachmentInfo#setSize(Long)}
   *   <li>{@link V4AttachmentInfo#size(Long)}
   *   <li>{@link V4AttachmentInfo#toString()}
   *   <li>{@link V4AttachmentInfo#getId()}
   *   <li>{@link V4AttachmentInfo#getImages()}
   *   <li>{@link V4AttachmentInfo#getName()}
   *   <li>{@link V4AttachmentInfo#getSize()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V4AttachmentInfo.<init>()",
    "String V4AttachmentInfo.getId()",
    "List V4AttachmentInfo.getImages()",
    "String V4AttachmentInfo.getName()",
    "Long V4AttachmentInfo.getSize()",
    "V4AttachmentInfo V4AttachmentInfo.id(String)",
    "V4AttachmentInfo V4AttachmentInfo.images(List)",
    "V4AttachmentInfo V4AttachmentInfo.name(String)",
    "void V4AttachmentInfo.setId(String)",
    "void V4AttachmentInfo.setImages(List)",
    "void V4AttachmentInfo.setName(String)",
    "void V4AttachmentInfo.setSize(Long)",
    "V4AttachmentInfo V4AttachmentInfo.size(Long)",
    "String V4AttachmentInfo.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V4AttachmentInfo actualV4AttachmentInfo = new V4AttachmentInfo();
    V4AttachmentInfo actualIdResult = actualV4AttachmentInfo.id("42");
    V4AttachmentInfo actualImagesResult = actualV4AttachmentInfo.images(new ArrayList<>());
    V4AttachmentInfo actualNameResult = actualV4AttachmentInfo.name("Name");
    actualV4AttachmentInfo.setId("42");
    ArrayList<V4ThumbnailInfo> images = new ArrayList<>();
    actualV4AttachmentInfo.setImages(images);
    actualV4AttachmentInfo.setName("Name");
    actualV4AttachmentInfo.setSize(3L);
    V4AttachmentInfo actualSizeResult = actualV4AttachmentInfo.size(3L);
    String actualToStringResult = actualV4AttachmentInfo.toString();
    String actualId = actualV4AttachmentInfo.getId();
    List<V4ThumbnailInfo> actualImages = actualV4AttachmentInfo.getImages();
    String actualName = actualV4AttachmentInfo.getName();

    // Assert
    assertEquals("42", actualId);
    assertEquals("Name", actualName);
    assertEquals(
        "class V4AttachmentInfo {\n    id: 42\n    name: Name\n    size: 3\n    images: []\n}",
        actualToStringResult);
    assertEquals(3L, actualV4AttachmentInfo.getSize().longValue());
    assertTrue(actualImages.isEmpty());
    assertSame(actualV4AttachmentInfo, actualIdResult);
    assertSame(actualV4AttachmentInfo, actualImagesResult);
    assertSame(actualV4AttachmentInfo, actualNameResult);
    assertSame(actualV4AttachmentInfo, actualSizeResult);
    assertSame(images, actualImages);
  }
}
