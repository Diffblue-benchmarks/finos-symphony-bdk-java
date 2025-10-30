package com.symphony.bdk.core.activity.parsing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MentionDiffblueTest {
  /**
   * Test {@link Mention#Mention(String, Long)}.
   * <ul>
   *   <li>When {@code Text}.</li>
   *   <li>Then return {@code Text}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Mention#Mention(String, Long)}
   */
  @Test
  @DisplayName("Test new Mention(String, Long); when 'Text'; then return 'Text'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void Mention.<init>(String, Long)"})
  void testNewMention_whenText_thenReturnText() {
    // Arrange and Act
    Mention actualMention = new Mention("Text", 1L);

    // Assert
    assertEquals("Text", actualMention.getText());
    assertEquals("Text", actualMention.toString());
    assertEquals("ext", actualMention.getUserDisplayName());
    assertEquals(1L, actualMention.getUserId().longValue());
  }

  /**
   * Test {@link Mention#equals(Object)}, and {@link Mention#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Mention#equals(Object)}
   *   <li>{@link Mention#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Mention.equals(Object)", "int Mention.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Mention mention = new Mention("Text", 1L);
    Mention mention2 = new Mention("Text", 1L);

    // Act and Assert
    assertEquals(mention, mention2);
    int expectedHashCodeResult = mention.hashCode();
    assertEquals(expectedHashCodeResult, mention2.hashCode());
  }

  /**
   * Test {@link Mention#equals(Object)}, and {@link Mention#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Mention#equals(Object)}
   *   <li>{@link Mention#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Mention.equals(Object)", "int Mention.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    Mention mention = new Mention("Text", null);
    Mention mention2 = new Mention("Text", null);

    // Act and Assert
    assertEquals(mention, mention2);
    int expectedHashCodeResult = mention.hashCode();
    assertEquals(expectedHashCodeResult, mention2.hashCode());
  }

  /**
   * Test {@link Mention#equals(Object)}, and {@link Mention#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Mention#equals(Object)}
   *   <li>{@link Mention#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Mention.equals(Object)", "int Mention.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Mention mention = new Mention("Text", 1L);

    // Act and Assert
    assertEquals(mention, mention);
    int expectedHashCodeResult = mention.hashCode();
    assertEquals(expectedHashCodeResult, mention.hashCode());
  }

  /**
   * Test {@link Mention#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Mention#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Mention.equals(Object)", "int Mention.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Mention mention = new Mention("ext", 1L);

    // Act and Assert
    assertNotEquals(mention, new Mention("Text", 1L));
  }

  /**
   * Test {@link Mention#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Mention#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Mention.equals(Object)", "int Mention.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Mention mention = new Mention("Text", 2L);

    // Act and Assert
    assertNotEquals(mention, new Mention("Text", 1L));
  }

  /**
   * Test {@link Mention#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Mention#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Mention.equals(Object)", "int Mention.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Mention mention = new Mention("Text", null);

    // Act and Assert
    assertNotEquals(mention, new Mention("Text", 1L));
  }

  /**
   * Test {@link Mention#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Mention#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Mention.equals(Object)", "int Mention.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Mention("Text", 1L), null);
  }

  /**
   * Test {@link Mention#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Mention#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Mention.equals(Object)", "int Mention.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Mention("Text", 1L), "Different type to Mention");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Mention#getText()}
   *   <li>{@link Mention#getUserDisplayName()}
   *   <li>{@link Mention#getUserId()}
   *   <li>{@link Mention#toString()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String Mention.getText()", "String Mention.getUserDisplayName()", "Long Mention.getUserId()",
      "String Mention.toString()"})
  void testGettersAndSetters() {
    // Arrange
    Mention mention = new Mention("Text", 1L);

    // Act
    String actualText = mention.getText();
    String actualUserDisplayName = mention.getUserDisplayName();
    Long actualUserId = mention.getUserId();

    // Assert
    assertEquals("Text", actualText);
    assertEquals("Text", mention.toString());
    assertEquals("ext", actualUserDisplayName);
    assertEquals(1L, actualUserId.longValue());
  }
}
