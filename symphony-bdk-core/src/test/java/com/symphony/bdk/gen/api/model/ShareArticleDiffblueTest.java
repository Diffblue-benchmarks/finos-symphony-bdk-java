package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ShareArticleDiffblueTest {
  /**
   * Test {@link ShareArticle#equals(Object)}, and {@link ShareArticle#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ShareArticle#equals(Object)}
   *   <li>{@link ShareArticle#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ShareArticle.equals(Object)", "int ShareArticle.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ShareArticle shareArticle = new ShareArticle();
    ShareArticle shareArticle2 = new ShareArticle();

    // Act and Assert
    assertEquals(shareArticle, shareArticle2);
    int expectedHashCodeResult = shareArticle.hashCode();
    assertEquals(expectedHashCodeResult, shareArticle2.hashCode());
  }

  /**
   * Test {@link ShareArticle#equals(Object)}, and {@link ShareArticle#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ShareArticle#equals(Object)}
   *   <li>{@link ShareArticle#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ShareArticle.equals(Object)", "int ShareArticle.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ShareArticle shareArticle = new ShareArticle();

    // Act and Assert
    assertEquals(shareArticle, shareArticle);
    int expectedHashCodeResult = shareArticle.hashCode();
    assertEquals(expectedHashCodeResult, shareArticle.hashCode());
  }

  /**
   * Test {@link ShareArticle#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ShareArticle#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ShareArticle.equals(Object)", "int ShareArticle.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ShareArticle(), 1);
  }

  /**
   * Test {@link ShareArticle#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ShareArticle#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ShareArticle.equals(Object)", "int ShareArticle.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ShareArticle shareArticle = new ShareArticle();
    shareArticle.articleId("42");

    // Act and Assert
    assertNotEquals(shareArticle, new ShareArticle());
  }

  /**
   * Test {@link ShareArticle#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ShareArticle#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ShareArticle.equals(Object)", "int ShareArticle.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ShareArticle shareArticle = new ShareArticle();
    shareArticle.title("Dr");

    // Act and Assert
    assertNotEquals(shareArticle, new ShareArticle());
  }

  /**
   * Test {@link ShareArticle#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ShareArticle#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ShareArticle.equals(Object)", "int ShareArticle.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    ShareArticle shareArticle = new ShareArticle();
    shareArticle.subTitle("Dr");

    // Act and Assert
    assertNotEquals(shareArticle, new ShareArticle());
  }

  /**
   * Test {@link ShareArticle#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ShareArticle#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ShareArticle.equals(Object)", "int ShareArticle.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    ShareArticle shareArticle = new ShareArticle();
    shareArticle.message("Not all who wander are lost");

    // Act and Assert
    assertNotEquals(shareArticle, new ShareArticle());
  }

  /**
   * Test {@link ShareArticle#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ShareArticle#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ShareArticle.equals(Object)", "int ShareArticle.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    ShareArticle shareArticle = new ShareArticle();
    shareArticle.publisher("Publisher");

    // Act and Assert
    assertNotEquals(shareArticle, new ShareArticle());
  }

  /**
   * Test {@link ShareArticle#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ShareArticle#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ShareArticle.equals(Object)", "int ShareArticle.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    ShareArticle shareArticle = new ShareArticle();
    shareArticle.publishDate(1L);

    // Act and Assert
    assertNotEquals(shareArticle, new ShareArticle());
  }

  /**
   * Test {@link ShareArticle#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ShareArticle#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ShareArticle.equals(Object)", "int ShareArticle.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    ShareArticle shareArticle = new ShareArticle();
    shareArticle.thumbnailUrl("https://example.org/example");

    // Act and Assert
    assertNotEquals(shareArticle, new ShareArticle());
  }

  /**
   * Test {@link ShareArticle#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ShareArticle#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ShareArticle.equals(Object)", "int ShareArticle.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    ShareArticle shareArticle = new ShareArticle();
    shareArticle.author("JaneDoe");

    // Act and Assert
    assertNotEquals(shareArticle, new ShareArticle());
  }

  /**
   * Test {@link ShareArticle#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ShareArticle#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ShareArticle.equals(Object)", "int ShareArticle.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual10() {
    // Arrange
    ShareArticle shareArticle = new ShareArticle();
    shareArticle.articleUrl("https://example.org/example");

    // Act and Assert
    assertNotEquals(shareArticle, new ShareArticle());
  }

  /**
   * Test {@link ShareArticle#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ShareArticle#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ShareArticle.equals(Object)", "int ShareArticle.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual11() {
    // Arrange
    ShareArticle shareArticle = new ShareArticle();
    shareArticle.summary("Summary");

    // Act and Assert
    assertNotEquals(shareArticle, new ShareArticle());
  }

  /**
   * Test {@link ShareArticle#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ShareArticle#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ShareArticle.equals(Object)", "int ShareArticle.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual12() {
    // Arrange
    ShareArticle shareArticle = new ShareArticle();
    shareArticle.appId("42");

    // Act and Assert
    assertNotEquals(shareArticle, new ShareArticle());
  }

  /**
   * Test {@link ShareArticle#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ShareArticle#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ShareArticle.equals(Object)", "int ShareArticle.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual13() {
    // Arrange
    ShareArticle shareArticle = new ShareArticle();
    shareArticle.appName("App Name");

    // Act and Assert
    assertNotEquals(shareArticle, new ShareArticle());
  }

  /**
   * Test {@link ShareArticle#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ShareArticle#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ShareArticle.equals(Object)", "int ShareArticle.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual14() {
    // Arrange
    ShareArticle shareArticle = new ShareArticle();
    shareArticle.appIconUrl("https://example.org/example");

    // Act and Assert
    assertNotEquals(shareArticle, new ShareArticle());
  }

  /**
   * Test {@link ShareArticle#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ShareArticle#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ShareArticle.equals(Object)", "int ShareArticle.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ShareArticle(), null);
  }

  /**
   * Test {@link ShareArticle#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ShareArticle#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ShareArticle.equals(Object)", "int ShareArticle.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ShareArticle(), "Different type to ShareArticle");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link ShareArticle}
   *   <li>{@link ShareArticle#appIconUrl(String)}
   *   <li>{@link ShareArticle#appId(String)}
   *   <li>{@link ShareArticle#appName(String)}
   *   <li>{@link ShareArticle#articleId(String)}
   *   <li>{@link ShareArticle#articleUrl(String)}
   *   <li>{@link ShareArticle#author(String)}
   *   <li>{@link ShareArticle#message(String)}
   *   <li>{@link ShareArticle#publishDate(Long)}
   *   <li>{@link ShareArticle#publisher(String)}
   *   <li>{@link ShareArticle#setAppIconUrl(String)}
   *   <li>{@link ShareArticle#setAppId(String)}
   *   <li>{@link ShareArticle#setAppName(String)}
   *   <li>{@link ShareArticle#setArticleId(String)}
   *   <li>{@link ShareArticle#setArticleUrl(String)}
   *   <li>{@link ShareArticle#setAuthor(String)}
   *   <li>{@link ShareArticle#setMessage(String)}
   *   <li>{@link ShareArticle#setPublishDate(Long)}
   *   <li>{@link ShareArticle#setPublisher(String)}
   *   <li>{@link ShareArticle#setSubTitle(String)}
   *   <li>{@link ShareArticle#setSummary(String)}
   *   <li>{@link ShareArticle#setThumbnailUrl(String)}
   *   <li>{@link ShareArticle#setTitle(String)}
   *   <li>{@link ShareArticle#subTitle(String)}
   *   <li>{@link ShareArticle#summary(String)}
   *   <li>{@link ShareArticle#thumbnailUrl(String)}
   *   <li>{@link ShareArticle#title(String)}
   *   <li>{@link ShareArticle#toString()}
   *   <li>{@link ShareArticle#getAppIconUrl()}
   *   <li>{@link ShareArticle#getAppId()}
   *   <li>{@link ShareArticle#getAppName()}
   *   <li>{@link ShareArticle#getArticleId()}
   *   <li>{@link ShareArticle#getArticleUrl()}
   *   <li>{@link ShareArticle#getAuthor()}
   *   <li>{@link ShareArticle#getMessage()}
   *   <li>{@link ShareArticle#getPublishDate()}
   *   <li>{@link ShareArticle#getPublisher()}
   *   <li>{@link ShareArticle#getSubTitle()}
   *   <li>{@link ShareArticle#getSummary()}
   *   <li>{@link ShareArticle#getThumbnailUrl()}
   *   <li>{@link ShareArticle#getTitle()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ShareArticle.<init>()", "ShareArticle ShareArticle.appIconUrl(String)",
      "ShareArticle ShareArticle.appId(String)", "ShareArticle ShareArticle.appName(String)",
      "ShareArticle ShareArticle.articleId(String)", "ShareArticle ShareArticle.articleUrl(String)",
      "ShareArticle ShareArticle.author(String)", "String ShareArticle.getAppIconUrl()",
      "String ShareArticle.getAppId()", "String ShareArticle.getAppName()", "String ShareArticle.getArticleId()",
      "String ShareArticle.getArticleUrl()", "String ShareArticle.getAuthor()", "String ShareArticle.getMessage()",
      "Long ShareArticle.getPublishDate()", "String ShareArticle.getPublisher()", "String ShareArticle.getSubTitle()",
      "String ShareArticle.getSummary()", "String ShareArticle.getThumbnailUrl()", "String ShareArticle.getTitle()",
      "ShareArticle ShareArticle.message(String)", "ShareArticle ShareArticle.publishDate(Long)",
      "ShareArticle ShareArticle.publisher(String)", "void ShareArticle.setAppIconUrl(String)",
      "void ShareArticle.setAppId(String)", "void ShareArticle.setAppName(String)",
      "void ShareArticle.setArticleId(String)", "void ShareArticle.setArticleUrl(String)",
      "void ShareArticle.setAuthor(String)", "void ShareArticle.setMessage(String)",
      "void ShareArticle.setPublishDate(Long)", "void ShareArticle.setPublisher(String)",
      "void ShareArticle.setSubTitle(String)", "void ShareArticle.setSummary(String)",
      "void ShareArticle.setThumbnailUrl(String)", "void ShareArticle.setTitle(String)",
      "ShareArticle ShareArticle.subTitle(String)", "ShareArticle ShareArticle.summary(String)",
      "ShareArticle ShareArticle.thumbnailUrl(String)", "ShareArticle ShareArticle.title(String)",
      "String ShareArticle.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    ShareArticle actualShareArticle = new ShareArticle();
    ShareArticle actualAppIconUrlResult = actualShareArticle.appIconUrl("https://example.org/example");
    ShareArticle actualAppIdResult = actualShareArticle.appId("42");
    ShareArticle actualAppNameResult = actualShareArticle.appName("App Name");
    ShareArticle actualArticleIdResult = actualShareArticle.articleId("42");
    ShareArticle actualArticleUrlResult = actualShareArticle.articleUrl("https://example.org/example");
    ShareArticle actualAuthorResult = actualShareArticle.author("JaneDoe");
    ShareArticle actualMessageResult = actualShareArticle.message("Not all who wander are lost");
    ShareArticle actualPublishDateResult = actualShareArticle.publishDate(1L);
    ShareArticle actualPublisherResult = actualShareArticle.publisher("Publisher");
    actualShareArticle.setAppIconUrl("https://example.org/example");
    actualShareArticle.setAppId("42");
    actualShareArticle.setAppName("App Name");
    actualShareArticle.setArticleId("42");
    actualShareArticle.setArticleUrl("https://example.org/example");
    actualShareArticle.setAuthor("JaneDoe");
    actualShareArticle.setMessage("Not all who wander are lost");
    actualShareArticle.setPublishDate(1L);
    actualShareArticle.setPublisher("Publisher");
    actualShareArticle.setSubTitle("Dr");
    actualShareArticle.setSummary("Summary");
    actualShareArticle.setThumbnailUrl("https://example.org/example");
    actualShareArticle.setTitle("Dr");
    ShareArticle actualSubTitleResult = actualShareArticle.subTitle("Dr");
    ShareArticle actualSummaryResult = actualShareArticle.summary("Summary");
    ShareArticle actualThumbnailUrlResult = actualShareArticle.thumbnailUrl("https://example.org/example");
    ShareArticle actualTitleResult = actualShareArticle.title("Dr");
    String actualToStringResult = actualShareArticle.toString();
    String actualAppIconUrl = actualShareArticle.getAppIconUrl();
    String actualAppId = actualShareArticle.getAppId();
    String actualAppName = actualShareArticle.getAppName();
    String actualArticleId = actualShareArticle.getArticleId();
    String actualArticleUrl = actualShareArticle.getArticleUrl();
    String actualAuthor = actualShareArticle.getAuthor();
    String actualMessage = actualShareArticle.getMessage();
    Long actualPublishDate = actualShareArticle.getPublishDate();
    String actualPublisher = actualShareArticle.getPublisher();
    String actualSubTitle = actualShareArticle.getSubTitle();
    String actualSummary = actualShareArticle.getSummary();
    String actualThumbnailUrl = actualShareArticle.getThumbnailUrl();

    // Assert
    assertEquals("42", actualAppId);
    assertEquals("42", actualArticleId);
    assertEquals("App Name", actualAppName);
    assertEquals("Dr", actualSubTitle);
    assertEquals("Dr", actualShareArticle.getTitle());
    assertEquals("JaneDoe", actualAuthor);
    assertEquals("Not all who wander are lost", actualMessage);
    assertEquals("Publisher", actualPublisher);
    assertEquals("Summary", actualSummary);
    assertEquals("class ShareArticle {\n" + "    articleId: 42\n" + "    title: Dr\n" + "    subTitle: Dr\n"
        + "    message: Not all who wander are lost\n" + "    publisher: Publisher\n" + "    publishDate: 1\n"
        + "    thumbnailUrl: https://example.org/example\n" + "    author: JaneDoe\n"
        + "    articleUrl: https://example.org/example\n" + "    summary: Summary\n" + "    appId: 42\n"
        + "    appName: App Name\n" + "    appIconUrl: https://example.org/example\n" + "}", actualToStringResult);
    assertEquals("https://example.org/example", actualAppIconUrl);
    assertEquals("https://example.org/example", actualArticleUrl);
    assertEquals("https://example.org/example", actualThumbnailUrl);
    assertEquals(1L, actualPublishDate.longValue());
    assertSame(actualShareArticle, actualAppIconUrlResult);
    assertSame(actualShareArticle, actualAppIdResult);
    assertSame(actualShareArticle, actualAppNameResult);
    assertSame(actualShareArticle, actualArticleIdResult);
    assertSame(actualShareArticle, actualArticleUrlResult);
    assertSame(actualShareArticle, actualAuthorResult);
    assertSame(actualShareArticle, actualMessageResult);
    assertSame(actualShareArticle, actualPublishDateResult);
    assertSame(actualShareArticle, actualPublisherResult);
    assertSame(actualShareArticle, actualSubTitleResult);
    assertSame(actualShareArticle, actualSummaryResult);
    assertSame(actualShareArticle, actualThumbnailUrlResult);
    assertSame(actualShareArticle, actualTitleResult);
  }
}
