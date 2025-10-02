package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ShareContentDiffblueTest {
  /**
   * Test {@link ShareContent#equals(Object)}, and {@link ShareContent#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ShareContent#equals(Object)}
   *   <li>{@link ShareContent#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ShareContent.equals(Object)", "int ShareContent.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ShareContent shareContent = new ShareContent();
    ShareContent shareContent2 = new ShareContent();

    // Act and Assert
    assertEquals(shareContent, shareContent2);
    assertEquals(shareContent.hashCode(), shareContent2.hashCode());
  }

  /**
   * Test {@link ShareContent#equals(Object)}, and {@link ShareContent#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ShareContent#equals(Object)}
   *   <li>{@link ShareContent#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ShareContent.equals(Object)", "int ShareContent.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ShareContent shareContent = new ShareContent();

    // Act and Assert
    assertEquals(shareContent, shareContent);
    int expectedHashCodeResult = shareContent.hashCode();
    assertEquals(expectedHashCodeResult, shareContent.hashCode());
  }

  /**
   * Test {@link ShareContent#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ShareContent#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ShareContent.equals(Object)", "int ShareContent.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ShareContent(), 1);
  }

  /**
   * Test {@link ShareContent#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ShareContent#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ShareContent.equals(Object)", "int ShareContent.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ShareContent shareContent = new ShareContent();
    shareContent.type("Type");

    // Act and Assert
    assertNotEquals(shareContent, new ShareContent());
  }

  /**
   * Test {@link ShareContent#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ShareContent#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ShareContent.equals(Object)", "int ShareContent.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ShareContent shareContent = new ShareContent();
    shareContent.content(new ShareArticle());

    // Act and Assert
    assertNotEquals(shareContent, new ShareContent());
  }

  /**
   * Test {@link ShareContent#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ShareContent#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ShareContent.equals(Object)", "int ShareContent.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ShareContent(), null);
  }

  /**
   * Test {@link ShareContent#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ShareContent#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ShareContent.equals(Object)", "int ShareContent.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ShareContent(), "Different type to ShareContent");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link ShareContent}
   *   <li>{@link ShareContent#content(ShareArticle)}
   *   <li>{@link ShareContent#setContent(ShareArticle)}
   *   <li>{@link ShareContent#setType(String)}
   *   <li>{@link ShareContent#type(String)}
   *   <li>{@link ShareContent#toString()}
   *   <li>{@link ShareContent#getContent()}
   *   <li>{@link ShareContent#getType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ShareContent.<init>()",
    "ShareContent ShareContent.content(ShareArticle)",
    "ShareArticle ShareContent.getContent()",
    "String ShareContent.getType()",
    "void ShareContent.setContent(ShareArticle)",
    "void ShareContent.setType(String)",
    "String ShareContent.toString()",
    "ShareContent ShareContent.type(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    ShareContent actualShareContent = new ShareContent();
    ShareContent actualContentResult = actualShareContent.content(new ShareArticle());
    ShareArticle content = new ShareArticle();
    actualShareContent.setContent(content);
    actualShareContent.setType("Type");
    ShareContent actualTypeResult = actualShareContent.type("Type");
    String actualToStringResult = actualShareContent.toString();
    ShareArticle actualContent = actualShareContent.getContent();

    // Assert
    assertEquals("Type", actualShareContent.getType());
    assertEquals(
        "class ShareContent {\n"
            + "    type: Type\n"
            + "    content: class ShareArticle {\n"
            + "        articleId: null\n"
            + "        title: null\n"
            + "        subTitle: null\n"
            + "        message: null\n"
            + "        publisher: null\n"
            + "        publishDate: null\n"
            + "        thumbnailUrl: null\n"
            + "        author: null\n"
            + "        articleUrl: null\n"
            + "        summary: null\n"
            + "        appId: null\n"
            + "        appName: null\n"
            + "        appIconUrl: null\n"
            + "    }\n"
            + "}",
        actualToStringResult);
    assertSame(content, actualContent);
    assertSame(actualShareContent, actualContentResult);
    assertSame(actualShareContent, actualTypeResult);
  }
}
