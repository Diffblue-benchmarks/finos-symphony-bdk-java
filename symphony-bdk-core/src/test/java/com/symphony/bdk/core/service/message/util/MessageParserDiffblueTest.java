package com.symphony.bdk.core.service.message.util;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.service.message.exception.MessageParserException;
import com.symphony.bdk.gen.api.model.V4Message;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MessageParserDiffblueTest {
  /**
   * Test {@link MessageParser#getMentions(V4Message)}.
   *
   * <ul>
   *   <li>Given {@code 42Data}.
   *   <li>When {@link V4Message} (default constructor) data {@code 42Data}.
   * </ul>
   *
   * <p>Method under test: {@link MessageParser#getMentions(V4Message)}
   */
  @Test
  @DisplayName(
      "Test getMentions(V4Message); given '42Data'; when V4Message (default constructor) data '42Data'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List MessageParser.getMentions(V4Message)"})
  void testGetMentions_given42Data_whenV4MessageData42Data() throws MessageParserException {
    // Arrange
    V4Message message = new V4Message();
    message.data("42Data");

    // Act and Assert
    assertThrows(MessageParserException.class, () -> MessageParser.getMentions(message));
  }

  /**
   * Test {@link MessageParser#getMentions(V4Message)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link V4Message} (default constructor) data {@code 42}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link MessageParser#getMentions(V4Message)}
   */
  @Test
  @DisplayName(
      "Test getMentions(V4Message); given '42'; when V4Message (default constructor) data '42'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List MessageParser.getMentions(V4Message)"})
  void testGetMentions_given42_whenV4MessageData42_thenReturnEmpty() throws MessageParserException {
    // Arrange
    V4Message message = new V4Message();
    message.data("42");

    // Act
    List<Long> actualMentions = MessageParser.getMentions(message);

    // Assert
    assertTrue(actualMentions.isEmpty());
  }

  /**
   * Test {@link MessageParser#getMentions(V4Message)}.
   *
   * <ul>
   *   <li>Given empty string.
   *   <li>When {@link V4Message} (default constructor) data empty string.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link MessageParser#getMentions(V4Message)}
   */
  @Test
  @DisplayName(
      "Test getMentions(V4Message); given empty string; when V4Message (default constructor) data empty string; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List MessageParser.getMentions(V4Message)"})
  void testGetMentions_givenEmptyString_whenV4MessageDataEmptyString_thenReturnEmpty()
      throws MessageParserException {
    // Arrange
    V4Message message = new V4Message();
    message.data("");

    // Act
    List<Long> actualMentions = MessageParser.getMentions(message);

    // Assert
    assertTrue(actualMentions.isEmpty());
  }

  /**
   * Test {@link MessageParser#getMentions(V4Message)}.
   *
   * <ul>
   *   <li>Given {@code Not all who wander are lost}.
   * </ul>
   *
   * <p>Method under test: {@link MessageParser#getMentions(V4Message)}
   */
  @Test
  @DisplayName("Test getMentions(V4Message); given 'Not all who wander are lost'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List MessageParser.getMentions(V4Message)"})
  void testGetMentions_givenNotAllWhoWanderAreLost() throws MessageParserException {
    // Arrange
    V4Message message = new V4Message();
    message.data("Not all who wander are lost");

    // Act and Assert
    assertThrows(MessageParserException.class, () -> MessageParser.getMentions(message));
  }

  /**
   * Test {@link MessageParser#getMentions(V4Message)}.
   *
   * <ul>
   *   <li>When {@link V4Message} (default constructor).
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link MessageParser#getMentions(V4Message)}
   */
  @Test
  @DisplayName(
      "Test getMentions(V4Message); when V4Message (default constructor); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List MessageParser.getMentions(V4Message)"})
  void testGetMentions_whenV4Message_thenReturnEmpty() throws MessageParserException {
    // Arrange and Act
    List<Long> actualMentions = MessageParser.getMentions(new V4Message());

    // Assert
    assertTrue(actualMentions.isEmpty());
  }

  /**
   * Test {@link MessageParser#getHashtags(V4Message)}.
   *
   * <ul>
   *   <li>Given {@code 42Data}.
   *   <li>When {@link V4Message} (default constructor) data {@code 42Data}.
   * </ul>
   *
   * <p>Method under test: {@link MessageParser#getHashtags(V4Message)}
   */
  @Test
  @DisplayName(
      "Test getHashtags(V4Message); given '42Data'; when V4Message (default constructor) data '42Data'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List MessageParser.getHashtags(V4Message)"})
  void testGetHashtags_given42Data_whenV4MessageData42Data() throws MessageParserException {
    // Arrange
    V4Message message = new V4Message();
    message.data("42Data");

    // Act and Assert
    assertThrows(MessageParserException.class, () -> MessageParser.getHashtags(message));
  }

  /**
   * Test {@link MessageParser#getHashtags(V4Message)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link V4Message} (default constructor) data {@code 42}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link MessageParser#getHashtags(V4Message)}
   */
  @Test
  @DisplayName(
      "Test getHashtags(V4Message); given '42'; when V4Message (default constructor) data '42'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List MessageParser.getHashtags(V4Message)"})
  void testGetHashtags_given42_whenV4MessageData42_thenReturnEmpty() throws MessageParserException {
    // Arrange
    V4Message message = new V4Message();
    message.data("42");

    // Act
    List<String> actualHashtags = MessageParser.getHashtags(message);

    // Assert
    assertTrue(actualHashtags.isEmpty());
  }

  /**
   * Test {@link MessageParser#getHashtags(V4Message)}.
   *
   * <ul>
   *   <li>Given empty string.
   *   <li>When {@link V4Message} (default constructor) data empty string.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link MessageParser#getHashtags(V4Message)}
   */
  @Test
  @DisplayName(
      "Test getHashtags(V4Message); given empty string; when V4Message (default constructor) data empty string; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List MessageParser.getHashtags(V4Message)"})
  void testGetHashtags_givenEmptyString_whenV4MessageDataEmptyString_thenReturnEmpty()
      throws MessageParserException {
    // Arrange
    V4Message message = new V4Message();
    message.data("");

    // Act
    List<String> actualHashtags = MessageParser.getHashtags(message);

    // Assert
    assertTrue(actualHashtags.isEmpty());
  }

  /**
   * Test {@link MessageParser#getHashtags(V4Message)}.
   *
   * <ul>
   *   <li>Given {@code Not all who wander are lost}.
   * </ul>
   *
   * <p>Method under test: {@link MessageParser#getHashtags(V4Message)}
   */
  @Test
  @DisplayName("Test getHashtags(V4Message); given 'Not all who wander are lost'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List MessageParser.getHashtags(V4Message)"})
  void testGetHashtags_givenNotAllWhoWanderAreLost() throws MessageParserException {
    // Arrange
    V4Message message = new V4Message();
    message.data("Not all who wander are lost");

    // Act and Assert
    assertThrows(MessageParserException.class, () -> MessageParser.getHashtags(message));
  }

  /**
   * Test {@link MessageParser#getHashtags(V4Message)}.
   *
   * <ul>
   *   <li>When {@link V4Message} (default constructor).
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link MessageParser#getHashtags(V4Message)}
   */
  @Test
  @DisplayName(
      "Test getHashtags(V4Message); when V4Message (default constructor); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List MessageParser.getHashtags(V4Message)"})
  void testGetHashtags_whenV4Message_thenReturnEmpty() throws MessageParserException {
    // Arrange and Act
    List<String> actualHashtags = MessageParser.getHashtags(new V4Message());

    // Assert
    assertTrue(actualHashtags.isEmpty());
  }

  /**
   * Test {@link MessageParser#getCashtags(V4Message)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link V4Message} (default constructor) data {@code 42}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link MessageParser#getCashtags(V4Message)}
   */
  @Test
  @DisplayName(
      "Test getCashtags(V4Message); given '42'; when V4Message (default constructor) data '42'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List MessageParser.getCashtags(V4Message)"})
  void testGetCashtags_given42_whenV4MessageData42_thenReturnEmpty() throws MessageParserException {
    // Arrange
    V4Message message = new V4Message();
    message.data("42");

    // Act
    List<String> actualCashtags = MessageParser.getCashtags(message);

    // Assert
    assertTrue(actualCashtags.isEmpty());
  }

  /**
   * Test {@link MessageParser#getCashtags(V4Message)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link V4Message} (default constructor) Data is {@code 42}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link MessageParser#getCashtags(V4Message)}
   */
  @Test
  @DisplayName(
      "Test getCashtags(V4Message); given '42'; when V4Message (default constructor) Data is '42'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List MessageParser.getCashtags(V4Message)"})
  void testGetCashtags_given42_whenV4MessageDataIs42_thenReturnEmpty()
      throws MessageParserException {
    // Arrange
    V4Message message = new V4Message();
    message.setData("42");

    // Act
    List<String> actualCashtags = MessageParser.getCashtags(message);

    // Assert
    assertTrue(actualCashtags.isEmpty());
  }

  /**
   * Test {@link MessageParser#getCashtags(V4Message)}.
   *
   * <ul>
   *   <li>Given {@code Data}.
   *   <li>When {@link V4Message} (default constructor) data {@code Data}.
   *   <li>Then throw {@link MessageParserException}.
   * </ul>
   *
   * <p>Method under test: {@link MessageParser#getCashtags(V4Message)}
   */
  @Test
  @DisplayName(
      "Test getCashtags(V4Message); given 'Data'; when V4Message (default constructor) data 'Data'; then throw MessageParserException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List MessageParser.getCashtags(V4Message)"})
  void testGetCashtags_givenData_whenV4MessageDataData_thenThrowMessageParserException()
      throws MessageParserException {
    // Arrange
    V4Message message = new V4Message();
    message.data("Data");

    // Act and Assert
    assertThrows(MessageParserException.class, () -> MessageParser.getCashtags(message));
  }

  /**
   * Test {@link MessageParser#getCashtags(V4Message)}.
   *
   * <ul>
   *   <li>Given empty string.
   *   <li>When {@link V4Message} (default constructor) data empty string.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link MessageParser#getCashtags(V4Message)}
   */
  @Test
  @DisplayName(
      "Test getCashtags(V4Message); given empty string; when V4Message (default constructor) data empty string; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List MessageParser.getCashtags(V4Message)"})
  void testGetCashtags_givenEmptyString_whenV4MessageDataEmptyString_thenReturnEmpty()
      throws MessageParserException {
    // Arrange
    V4Message message = new V4Message();
    message.data("");

    // Act
    List<String> actualCashtags = MessageParser.getCashtags(message);

    // Assert
    assertTrue(actualCashtags.isEmpty());
  }

  /**
   * Test {@link MessageParser#getCashtags(V4Message)}.
   *
   * <ul>
   *   <li>When {@link V4Message} (default constructor) Data is {@code Data}.
   *   <li>Then throw {@link MessageParserException}.
   * </ul>
   *
   * <p>Method under test: {@link MessageParser#getCashtags(V4Message)}
   */
  @Test
  @DisplayName(
      "Test getCashtags(V4Message); when V4Message (default constructor) Data is 'Data'; then throw MessageParserException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List MessageParser.getCashtags(V4Message)"})
  void testGetCashtags_whenV4MessageDataIsData_thenThrowMessageParserException()
      throws MessageParserException {
    // Arrange
    V4Message message = new V4Message();
    message.setData("Data");

    // Act and Assert
    assertThrows(MessageParserException.class, () -> MessageParser.getCashtags(message));
  }

  /**
   * Test {@link MessageParser#getCashtags(V4Message)}.
   *
   * <ul>
   *   <li>When {@link V4Message} (default constructor).
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link MessageParser#getCashtags(V4Message)}
   */
  @Test
  @DisplayName(
      "Test getCashtags(V4Message); when V4Message (default constructor); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List MessageParser.getCashtags(V4Message)"})
  void testGetCashtags_whenV4Message_thenReturnEmpty() throws MessageParserException {
    // Arrange and Act
    List<String> actualCashtags = MessageParser.getCashtags(new V4Message());

    // Assert
    assertTrue(actualCashtags.isEmpty());
  }

  /**
   * Test {@link MessageParser#getEmojis(V4Message)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link V4Message} (default constructor) data {@code 42}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link MessageParser#getEmojis(V4Message)}
   */
  @Test
  @DisplayName(
      "Test getEmojis(V4Message); given '42'; when V4Message (default constructor) data '42'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map MessageParser.getEmojis(V4Message)"})
  void testGetEmojis_given42_whenV4MessageData42_thenReturnEmpty() throws MessageParserException {
    // Arrange
    V4Message message = new V4Message();
    message.data("42");

    // Act
    Map<String, String> actualEmojis = MessageParser.getEmojis(message);

    // Assert
    assertTrue(actualEmojis.isEmpty());
  }

  /**
   * Test {@link MessageParser#getEmojis(V4Message)}.
   *
   * <ul>
   *   <li>Given {@code Data}.
   *   <li>When {@link V4Message} (default constructor) data {@code Data}.
   *   <li>Then throw {@link MessageParserException}.
   * </ul>
   *
   * <p>Method under test: {@link MessageParser#getEmojis(V4Message)}
   */
  @Test
  @DisplayName(
      "Test getEmojis(V4Message); given 'Data'; when V4Message (default constructor) data 'Data'; then throw MessageParserException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map MessageParser.getEmojis(V4Message)"})
  void testGetEmojis_givenData_whenV4MessageDataData_thenThrowMessageParserException()
      throws MessageParserException {
    // Arrange
    V4Message message = new V4Message();
    message.data("Data");

    // Act and Assert
    assertThrows(MessageParserException.class, () -> MessageParser.getEmojis(message));
  }

  /**
   * Test {@link MessageParser#getEmojis(V4Message)}.
   *
   * <ul>
   *   <li>Given empty string.
   *   <li>When {@link V4Message} (default constructor) data empty string.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link MessageParser#getEmojis(V4Message)}
   */
  @Test
  @DisplayName(
      "Test getEmojis(V4Message); given empty string; when V4Message (default constructor) data empty string; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map MessageParser.getEmojis(V4Message)"})
  void testGetEmojis_givenEmptyString_whenV4MessageDataEmptyString_thenReturnEmpty()
      throws MessageParserException {
    // Arrange
    V4Message message = new V4Message();
    message.data("");

    // Act
    Map<String, String> actualEmojis = MessageParser.getEmojis(message);

    // Assert
    assertTrue(actualEmojis.isEmpty());
  }

  /**
   * Test {@link MessageParser#getEmojis(V4Message)}.
   *
   * <ul>
   *   <li>When {@link V4Message} (default constructor).
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link MessageParser#getEmojis(V4Message)}
   */
  @Test
  @DisplayName("Test getEmojis(V4Message); when V4Message (default constructor); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map MessageParser.getEmojis(V4Message)"})
  void testGetEmojis_whenV4Message_thenReturnEmpty() throws MessageParserException {
    // Arrange and Act
    Map<String, String> actualEmojis = MessageParser.getEmojis(new V4Message());

    // Assert
    assertTrue(actualEmojis.isEmpty());
  }
}
