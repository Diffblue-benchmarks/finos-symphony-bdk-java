package com.symphony.bdk.core.activity.parsing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class HashtagDiffblueTest {
  /**
   * Test {@link Hashtag#equals(Object)}, and {@link Hashtag#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Hashtag#equals(Object)}
   *   <li>{@link Hashtag#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Hashtag.equals(Object)", "int Hashtag.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Hashtag hashtag = new Hashtag("Text", "42");
    Hashtag hashtag2 = new Hashtag("Text", "42");

    // Act and Assert
    assertEquals(hashtag, hashtag2);
    int expectedHashCodeResult = hashtag.hashCode();
    assertEquals(expectedHashCodeResult, hashtag2.hashCode());
  }

  /**
   * Test {@link Hashtag#equals(Object)}, and {@link Hashtag#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Hashtag#equals(Object)}
   *   <li>{@link Hashtag#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Hashtag.equals(Object)", "int Hashtag.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    Hashtag hashtag = new Hashtag(null, "42");
    Hashtag hashtag2 = new Hashtag(null, "42");

    // Act and Assert
    assertEquals(hashtag, hashtag2);
    int expectedHashCodeResult = hashtag.hashCode();
    assertEquals(expectedHashCodeResult, hashtag2.hashCode());
  }

  /**
   * Test {@link Hashtag#equals(Object)}, and {@link Hashtag#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Hashtag#equals(Object)}
   *   <li>{@link Hashtag#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Hashtag.equals(Object)", "int Hashtag.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual3() {
    // Arrange
    Hashtag hashtag = new Hashtag("Text", null);
    Hashtag hashtag2 = new Hashtag("Text", null);

    // Act and Assert
    assertEquals(hashtag, hashtag2);
    int expectedHashCodeResult = hashtag.hashCode();
    assertEquals(expectedHashCodeResult, hashtag2.hashCode());
  }

  /**
   * Test {@link Hashtag#equals(Object)}, and {@link Hashtag#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Hashtag#equals(Object)}
   *   <li>{@link Hashtag#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Hashtag.equals(Object)", "int Hashtag.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Hashtag hashtag = new Hashtag("Text", "42");

    // Act and Assert
    assertEquals(hashtag, hashtag);
    int expectedHashCodeResult = hashtag.hashCode();
    assertEquals(expectedHashCodeResult, hashtag.hashCode());
  }

  /**
   * Test {@link Hashtag#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Hashtag#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Hashtag.equals(Object)", "int Hashtag.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Hashtag hashtag = new Hashtag("42", "42");

    // Act and Assert
    assertNotEquals(hashtag, new Hashtag("Text", "42"));
  }

  /**
   * Test {@link Hashtag#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Hashtag#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Hashtag.equals(Object)", "int Hashtag.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Hashtag hashtag = new Hashtag(null, "42");

    // Act and Assert
    assertNotEquals(hashtag, new Hashtag("Text", "42"));
  }

  /**
   * Test {@link Hashtag#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Hashtag#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Hashtag.equals(Object)", "int Hashtag.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Hashtag hashtag = new Hashtag("Text", "Text");

    // Act and Assert
    assertNotEquals(hashtag, new Hashtag("Text", "42"));
  }

  /**
   * Test {@link Hashtag#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Hashtag#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Hashtag.equals(Object)", "int Hashtag.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    Hashtag hashtag = new Hashtag("Text", null);

    // Act and Assert
    assertNotEquals(hashtag, new Hashtag("Text", "42"));
  }

  /**
   * Test {@link Hashtag#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Hashtag#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Hashtag.equals(Object)", "int Hashtag.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Hashtag("Text", "42"), null);
  }

  /**
   * Test {@link Hashtag#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Hashtag#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Hashtag.equals(Object)", "int Hashtag.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Hashtag("Text", "42"), "Different type to Hashtag");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Hashtag#Hashtag(String, String)}
   *   <li>{@link Hashtag#getText()}
   *   <li>{@link Hashtag#getValue()}
   *   <li>{@link Hashtag#toString()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void Hashtag.<init>(String, String)", "String Hashtag.getText()", "String Hashtag.getValue()",
      "String Hashtag.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    Hashtag actualHashtag = new Hashtag("Text", "42");
    String actualText = actualHashtag.getText();
    String actualValue = actualHashtag.getValue();

    // Assert
    assertEquals("42", actualValue);
    assertEquals("Text", actualText);
    assertEquals("Text", actualHashtag.toString());
  }
}
