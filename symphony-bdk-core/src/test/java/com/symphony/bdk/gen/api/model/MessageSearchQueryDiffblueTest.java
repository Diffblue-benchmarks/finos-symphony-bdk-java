package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MessageSearchQueryDiffblueTest {
  /**
   * Test {@link MessageSearchQuery#equals(Object)}, and {@link MessageSearchQuery#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link MessageSearchQuery#equals(Object)}
   *   <li>{@link MessageSearchQuery#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MessageSearchQuery.equals(Object)", "int MessageSearchQuery.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MessageSearchQuery messageSearchQuery = new MessageSearchQuery();
    MessageSearchQuery messageSearchQuery2 = new MessageSearchQuery();

    // Act and Assert
    assertEquals(messageSearchQuery, messageSearchQuery2);
    int expectedHashCodeResult = messageSearchQuery.hashCode();
    assertEquals(expectedHashCodeResult, messageSearchQuery2.hashCode());
  }

  /**
   * Test {@link MessageSearchQuery#equals(Object)}, and {@link MessageSearchQuery#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link MessageSearchQuery#equals(Object)}
   *   <li>{@link MessageSearchQuery#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MessageSearchQuery.equals(Object)", "int MessageSearchQuery.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MessageSearchQuery messageSearchQuery = new MessageSearchQuery();

    // Act and Assert
    assertEquals(messageSearchQuery, messageSearchQuery);
    int expectedHashCodeResult = messageSearchQuery.hashCode();
    assertEquals(expectedHashCodeResult, messageSearchQuery.hashCode());
  }

  /**
   * Test {@link MessageSearchQuery#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageSearchQuery#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MessageSearchQuery.equals(Object)", "int MessageSearchQuery.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageSearchQuery(), 1);
  }

  /**
   * Test {@link MessageSearchQuery#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageSearchQuery#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MessageSearchQuery.equals(Object)", "int MessageSearchQuery.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    MessageSearchQuery messageSearchQuery = new MessageSearchQuery();
    messageSearchQuery.text("Text");

    // Act and Assert
    assertNotEquals(messageSearchQuery, new MessageSearchQuery());
  }

  /**
   * Test {@link MessageSearchQuery#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageSearchQuery#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MessageSearchQuery.equals(Object)", "int MessageSearchQuery.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    MessageSearchQuery messageSearchQuery = new MessageSearchQuery();
    messageSearchQuery.streamId("42");

    // Act and Assert
    assertNotEquals(messageSearchQuery, new MessageSearchQuery());
  }

  /**
   * Test {@link MessageSearchQuery#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageSearchQuery#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MessageSearchQuery.equals(Object)", "int MessageSearchQuery.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    MessageSearchQuery messageSearchQuery = new MessageSearchQuery();
    messageSearchQuery.streamType("Stream Type");

    // Act and Assert
    assertNotEquals(messageSearchQuery, new MessageSearchQuery());
  }

  /**
   * Test {@link MessageSearchQuery#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageSearchQuery#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MessageSearchQuery.equals(Object)", "int MessageSearchQuery.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    MessageSearchQuery messageSearchQuery = new MessageSearchQuery();
    messageSearchQuery.author(1L);

    // Act and Assert
    assertNotEquals(messageSearchQuery, new MessageSearchQuery());
  }

  /**
   * Test {@link MessageSearchQuery#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageSearchQuery#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MessageSearchQuery.equals(Object)", "int MessageSearchQuery.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    MessageSearchQuery messageSearchQuery = new MessageSearchQuery();
    messageSearchQuery.setHashtag("Hashtag");

    // Act and Assert
    assertNotEquals(messageSearchQuery, new MessageSearchQuery());
  }

  /**
   * Test {@link MessageSearchQuery#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageSearchQuery#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MessageSearchQuery.equals(Object)", "int MessageSearchQuery.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    MessageSearchQuery messageSearchQuery = new MessageSearchQuery();
    messageSearchQuery.cashtag("Cashtag");

    // Act and Assert
    assertNotEquals(messageSearchQuery, new MessageSearchQuery());
  }

  /**
   * Test {@link MessageSearchQuery#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageSearchQuery#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MessageSearchQuery.equals(Object)", "int MessageSearchQuery.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    MessageSearchQuery messageSearchQuery = new MessageSearchQuery();
    messageSearchQuery.mention(1L);

    // Act and Assert
    assertNotEquals(messageSearchQuery, new MessageSearchQuery());
  }

  /**
   * Test {@link MessageSearchQuery#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageSearchQuery#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MessageSearchQuery.equals(Object)", "int MessageSearchQuery.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    MessageSearchQuery messageSearchQuery = new MessageSearchQuery();
    messageSearchQuery.signal("Signal");

    // Act and Assert
    assertNotEquals(messageSearchQuery, new MessageSearchQuery());
  }

  /**
   * Test {@link MessageSearchQuery#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageSearchQuery#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MessageSearchQuery.equals(Object)", "int MessageSearchQuery.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual10() {
    // Arrange
    MessageSearchQuery messageSearchQuery = new MessageSearchQuery();
    messageSearchQuery.fromDate(1L);

    // Act and Assert
    assertNotEquals(messageSearchQuery, new MessageSearchQuery());
  }

  /**
   * Test {@link MessageSearchQuery#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageSearchQuery#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MessageSearchQuery.equals(Object)", "int MessageSearchQuery.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual11() {
    // Arrange
    MessageSearchQuery messageSearchQuery = new MessageSearchQuery();
    messageSearchQuery.setToDate(1L);

    // Act and Assert
    assertNotEquals(messageSearchQuery, new MessageSearchQuery());
  }

  /**
   * Test {@link MessageSearchQuery#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageSearchQuery#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MessageSearchQuery.equals(Object)", "int MessageSearchQuery.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageSearchQuery(), null);
  }

  /**
   * Test {@link MessageSearchQuery#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageSearchQuery#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MessageSearchQuery.equals(Object)", "int MessageSearchQuery.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageSearchQuery(), "Different type to MessageSearchQuery");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link MessageSearchQuery}
   *   <li>{@link MessageSearchQuery#author(Long)}
   *   <li>{@link MessageSearchQuery#cashtag(String)}
   *   <li>{@link MessageSearchQuery#fromDate(Long)}
   *   <li>{@link MessageSearchQuery#mention(Long)}
   *   <li>{@link MessageSearchQuery#setAuthor(Long)}
   *   <li>{@link MessageSearchQuery#setCashtag(String)}
   *   <li>{@link MessageSearchQuery#setFromDate(Long)}
   *   <li>{@link MessageSearchQuery#setHashtag(String)}
   *   <li>{@link MessageSearchQuery#setMention(Long)}
   *   <li>{@link MessageSearchQuery#setSignal(String)}
   *   <li>{@link MessageSearchQuery#setStreamId(String)}
   *   <li>{@link MessageSearchQuery#setStreamType(String)}
   *   <li>{@link MessageSearchQuery#setText(String)}
   *   <li>{@link MessageSearchQuery#setToDate(Long)}
   *   <li>{@link MessageSearchQuery#signal(String)}
   *   <li>{@link MessageSearchQuery#streamId(String)}
   *   <li>{@link MessageSearchQuery#streamType(String)}
   *   <li>{@link MessageSearchQuery#text(String)}
   *   <li>{@link MessageSearchQuery#hashtag(String)}
   *   <li>{@link MessageSearchQuery#toDate(Long)}
   *   <li>{@link MessageSearchQuery#toString()}
   *   <li>{@link MessageSearchQuery#getAuthor()}
   *   <li>{@link MessageSearchQuery#getCashtag()}
   *   <li>{@link MessageSearchQuery#getFromDate()}
   *   <li>{@link MessageSearchQuery#getHashtag()}
   *   <li>{@link MessageSearchQuery#getMention()}
   *   <li>{@link MessageSearchQuery#getSignal()}
   *   <li>{@link MessageSearchQuery#getStreamId()}
   *   <li>{@link MessageSearchQuery#getStreamType()}
   *   <li>{@link MessageSearchQuery#getText()}
   *   <li>{@link MessageSearchQuery#getToDate()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void MessageSearchQuery.<init>()", "MessageSearchQuery MessageSearchQuery.author(Long)",
      "MessageSearchQuery MessageSearchQuery.cashtag(String)", "MessageSearchQuery MessageSearchQuery.fromDate(Long)",
      "Long MessageSearchQuery.getAuthor()", "String MessageSearchQuery.getCashtag()",
      "Long MessageSearchQuery.getFromDate()", "String MessageSearchQuery.getHashtag()",
      "Long MessageSearchQuery.getMention()", "String MessageSearchQuery.getSignal()",
      "String MessageSearchQuery.getStreamId()", "String MessageSearchQuery.getStreamType()",
      "String MessageSearchQuery.getText()", "Long MessageSearchQuery.getToDate()",
      "MessageSearchQuery MessageSearchQuery.hashtag(String)", "MessageSearchQuery MessageSearchQuery.mention(Long)",
      "void MessageSearchQuery.setAuthor(Long)", "void MessageSearchQuery.setCashtag(String)",
      "void MessageSearchQuery.setFromDate(Long)", "void MessageSearchQuery.setHashtag(String)",
      "void MessageSearchQuery.setMention(Long)", "void MessageSearchQuery.setSignal(String)",
      "void MessageSearchQuery.setStreamId(String)", "void MessageSearchQuery.setStreamType(String)",
      "void MessageSearchQuery.setText(String)", "void MessageSearchQuery.setToDate(Long)",
      "MessageSearchQuery MessageSearchQuery.signal(String)", "MessageSearchQuery MessageSearchQuery.streamId(String)",
      "MessageSearchQuery MessageSearchQuery.streamType(String)", "MessageSearchQuery MessageSearchQuery.text(String)",
      "MessageSearchQuery MessageSearchQuery.toDate(Long)", "String MessageSearchQuery.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    MessageSearchQuery actualMessageSearchQuery = new MessageSearchQuery();
    MessageSearchQuery actualAuthorResult = actualMessageSearchQuery.author(1L);
    MessageSearchQuery actualCashtagResult = actualMessageSearchQuery.cashtag("Cashtag");
    MessageSearchQuery actualFromDateResult = actualMessageSearchQuery.fromDate(1L);
    MessageSearchQuery actualMentionResult = actualMessageSearchQuery.mention(1L);
    actualMessageSearchQuery.setAuthor(1L);
    actualMessageSearchQuery.setCashtag("Cashtag");
    actualMessageSearchQuery.setFromDate(1L);
    actualMessageSearchQuery.setHashtag("Hashtag");
    actualMessageSearchQuery.setMention(1L);
    actualMessageSearchQuery.setSignal("Signal");
    actualMessageSearchQuery.setStreamId("42");
    actualMessageSearchQuery.setStreamType("Stream Type");
    actualMessageSearchQuery.setText("Text");
    actualMessageSearchQuery.setToDate(1L);
    MessageSearchQuery actualSignalResult = actualMessageSearchQuery.signal("Signal");
    MessageSearchQuery actualStreamIdResult = actualMessageSearchQuery.streamId("42");
    MessageSearchQuery actualStreamTypeResult = actualMessageSearchQuery.streamType("Stream Type");
    MessageSearchQuery actualTextResult = actualMessageSearchQuery.text("Text");
    MessageSearchQuery actualHashtagResult = actualMessageSearchQuery.hashtag("Hashtag");
    MessageSearchQuery actualToDateResult = actualMessageSearchQuery.toDate(1L);
    String actualToStringResult = actualMessageSearchQuery.toString();
    Long actualAuthor = actualMessageSearchQuery.getAuthor();
    String actualCashtag = actualMessageSearchQuery.getCashtag();
    Long actualFromDate = actualMessageSearchQuery.getFromDate();
    String actualHashtag = actualMessageSearchQuery.getHashtag();
    Long actualMention = actualMessageSearchQuery.getMention();
    String actualSignal = actualMessageSearchQuery.getSignal();
    String actualStreamId = actualMessageSearchQuery.getStreamId();
    String actualStreamType = actualMessageSearchQuery.getStreamType();
    String actualText = actualMessageSearchQuery.getText();
    Long actualToDate = actualMessageSearchQuery.getToDate();

    // Assert
    assertEquals("42", actualStreamId);
    assertEquals("Cashtag", actualCashtag);
    assertEquals("Hashtag", actualHashtag);
    assertEquals("Signal", actualSignal);
    assertEquals("Stream Type", actualStreamType);
    assertEquals("Text", actualText);
    assertEquals("class MessageSearchQuery {\n" + "    text: Text\n" + "    streamId: 42\n"
        + "    streamType: Stream Type\n" + "    author: 1\n" + "    hashtag: Hashtag\n" + "    cashtag: Cashtag\n"
        + "    mention: 1\n" + "    signal: Signal\n" + "    fromDate: 1\n" + "    toDate: 1\n" + "}",
        actualToStringResult);
    assertEquals(1L, actualAuthor.longValue());
    assertEquals(1L, actualFromDate.longValue());
    assertEquals(1L, actualMention.longValue());
    assertEquals(1L, actualToDate.longValue());
    assertSame(actualMessageSearchQuery, actualAuthorResult);
    assertSame(actualMessageSearchQuery, actualCashtagResult);
    assertSame(actualMessageSearchQuery, actualFromDateResult);
    assertSame(actualMessageSearchQuery, actualHashtagResult);
    assertSame(actualMessageSearchQuery, actualMentionResult);
    assertSame(actualMessageSearchQuery, actualSignalResult);
    assertSame(actualMessageSearchQuery, actualStreamIdResult);
    assertSame(actualMessageSearchQuery, actualStreamTypeResult);
    assertSame(actualMessageSearchQuery, actualTextResult);
    assertSame(actualMessageSearchQuery, actualToDateResult);
  }
}
