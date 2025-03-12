package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LanguagesDiffblueTest {
  /**
   * Test {@link Languages#addLanguagesItem(String)}.
   * <ul>
   *   <li>Given {@link Languages} (default constructor) languages {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Languages#addLanguagesItem(String)}
   */
  @Test
  @DisplayName("Test addLanguagesItem(String); given Languages (default constructor) languages ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Languages Languages.addLanguagesItem(String)"})
  void testAddLanguagesItem_givenLanguagesLanguagesArrayList() {
    // Arrange
    Languages languages = new Languages();
    languages.languages(new ArrayList<>());

    // Act and Assert
    assertSame(languages, languages.addLanguagesItem("en"));
  }

  /**
   * Test {@link Languages#addLanguagesItem(String)}.
   * <ul>
   *   <li>Given {@link Languages} (default constructor).</li>
   *   <li>Then return Languages size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link Languages#addLanguagesItem(String)}
   */
  @Test
  @DisplayName("Test addLanguagesItem(String); given Languages (default constructor); then return Languages size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Languages Languages.addLanguagesItem(String)"})
  void testAddLanguagesItem_givenLanguages_thenReturnLanguagesSizeIsOne() {
    // Arrange
    Languages languages = new Languages();

    // Act
    Languages actualAddLanguagesItemResult = languages.addLanguagesItem("en");

    // Assert
    List<String> languages2 = actualAddLanguagesItemResult.getLanguages();
    assertEquals(1, languages2.size());
    assertEquals("en", languages2.get(0));
    assertSame(languages, actualAddLanguagesItemResult);
  }

  /**
   * Test {@link Languages#equals(Object)}, and {@link Languages#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Languages#equals(Object)}
   *   <li>{@link Languages#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Languages.equals(Object)", "int Languages.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Languages languages = new Languages();
    Languages languages2 = new Languages();

    // Act and Assert
    assertEquals(languages, languages2);
    int expectedHashCodeResult = languages.hashCode();
    assertEquals(expectedHashCodeResult, languages2.hashCode());
  }

  /**
   * Test {@link Languages#equals(Object)}, and {@link Languages#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Languages#equals(Object)}
   *   <li>{@link Languages#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Languages.equals(Object)", "int Languages.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Languages languages = new Languages();

    // Act and Assert
    assertEquals(languages, languages);
    int expectedHashCodeResult = languages.hashCode();
    assertEquals(expectedHashCodeResult, languages.hashCode());
  }

  /**
   * Test {@link Languages#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Languages#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Languages.equals(Object)", "int Languages.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Languages languages = new Languages();
    languages.addLanguagesItem("en");

    // Act and Assert
    assertNotEquals(languages, new Languages());
  }

  /**
   * Test {@link Languages#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Languages#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Languages.equals(Object)", "int Languages.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Languages(), null);
  }

  /**
   * Test {@link Languages#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Languages#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Languages.equals(Object)", "int Languages.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Languages(), "Different type to Languages");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link Languages}
   *   <li>{@link Languages#languages(List)}
   *   <li>{@link Languages#setLanguages(List)}
   *   <li>{@link Languages#toString()}
   *   <li>{@link Languages#getLanguages()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void Languages.<init>()", "List Languages.getLanguages()", "Languages Languages.languages(List)",
      "void Languages.setLanguages(List)", "String Languages.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    Languages actualLanguages = new Languages();
    Languages actualLanguagesResult = actualLanguages.languages(new ArrayList<>());
    ArrayList<String> languages = new ArrayList<>();
    actualLanguages.setLanguages(languages);
    String actualToStringResult = actualLanguages.toString();
    List<String> actualLanguages2 = actualLanguages.getLanguages();

    // Assert
    assertEquals("class Languages {\n    languages: []\n}", actualToStringResult);
    assertTrue(actualLanguages2.isEmpty());
    assertSame(actualLanguages, actualLanguagesResult);
    assertSame(languages, actualLanguages2);
  }
}
