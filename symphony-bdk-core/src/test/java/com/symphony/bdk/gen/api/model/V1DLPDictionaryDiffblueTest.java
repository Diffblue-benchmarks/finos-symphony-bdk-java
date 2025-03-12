package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V1DLPDictionaryDiffblueTest {
  /**
   * Test {@link V1DLPDictionary#equals(Object)}, and {@link V1DLPDictionary#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V1DLPDictionary#equals(Object)}
   *   <li>{@link V1DLPDictionary#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPDictionary.equals(Object)", "int V1DLPDictionary.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V1DLPDictionary v1dlpDictionary = new V1DLPDictionary();
    V1DLPDictionary v1dlpDictionary2 = new V1DLPDictionary();

    // Act and Assert
    assertEquals(v1dlpDictionary, v1dlpDictionary2);
    int expectedHashCodeResult = v1dlpDictionary.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpDictionary2.hashCode());
  }

  /**
   * Test {@link V1DLPDictionary#equals(Object)}, and {@link V1DLPDictionary#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V1DLPDictionary#equals(Object)}
   *   <li>{@link V1DLPDictionary#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPDictionary.equals(Object)", "int V1DLPDictionary.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V1DLPDictionary v1dlpDictionary = new V1DLPDictionary();

    // Act and Assert
    assertEquals(v1dlpDictionary, v1dlpDictionary);
    int expectedHashCodeResult = v1dlpDictionary.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpDictionary.hashCode());
  }

  /**
   * Test {@link V1DLPDictionary#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPDictionary#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPDictionary.equals(Object)", "int V1DLPDictionary.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPDictionary(), 1);
  }

  /**
   * Test {@link V1DLPDictionary#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPDictionary#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPDictionary.equals(Object)", "int V1DLPDictionary.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V1DLPDictionary v1dlpDictionary = new V1DLPDictionary();
    v1dlpDictionary.content(new V1DLPDictionaryContent());

    // Act and Assert
    assertNotEquals(v1dlpDictionary, new V1DLPDictionary());
  }

  /**
   * Test {@link V1DLPDictionary#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPDictionary#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPDictionary.equals(Object)", "int V1DLPDictionary.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V1DLPDictionary v1dlpDictionary = new V1DLPDictionary();
    v1dlpDictionary.dictionaryMetadata(new V1DLPDictionaryMetadata());

    // Act and Assert
    assertNotEquals(v1dlpDictionary, new V1DLPDictionary());
  }

  /**
   * Test {@link V1DLPDictionary#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPDictionary#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPDictionary.equals(Object)", "int V1DLPDictionary.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPDictionary(), null);
  }

  /**
   * Test {@link V1DLPDictionary#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPDictionary#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPDictionary.equals(Object)", "int V1DLPDictionary.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPDictionary(), "Different type to V1DLPDictionary");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V1DLPDictionary}
   *   <li>{@link V1DLPDictionary#content(V1DLPDictionaryContent)}
   *   <li>{@link V1DLPDictionary#dictionaryMetadata(V1DLPDictionaryMetadata)}
   *   <li>{@link V1DLPDictionary#setContent(V1DLPDictionaryContent)}
   *   <li>{@link V1DLPDictionary#setDictionaryMetadata(V1DLPDictionaryMetadata)}
   *   <li>{@link V1DLPDictionary#toString()}
   *   <li>{@link V1DLPDictionary#getContent()}
   *   <li>{@link V1DLPDictionary#getDictionaryMetadata()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V1DLPDictionary.<init>()", "V1DLPDictionary V1DLPDictionary.content(V1DLPDictionaryContent)",
      "V1DLPDictionary V1DLPDictionary.dictionaryMetadata(V1DLPDictionaryMetadata)",
      "V1DLPDictionaryContent V1DLPDictionary.getContent()",
      "V1DLPDictionaryMetadata V1DLPDictionary.getDictionaryMetadata()",
      "void V1DLPDictionary.setContent(V1DLPDictionaryContent)",
      "void V1DLPDictionary.setDictionaryMetadata(V1DLPDictionaryMetadata)", "String V1DLPDictionary.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    V1DLPDictionary actualV1dlpDictionary = new V1DLPDictionary();
    V1DLPDictionary actualContentResult = actualV1dlpDictionary.content(new V1DLPDictionaryContent());
    V1DLPDictionary actualDictionaryMetadataResult = actualV1dlpDictionary
        .dictionaryMetadata(new V1DLPDictionaryMetadata());
    V1DLPDictionaryContent content = new V1DLPDictionaryContent();
    actualV1dlpDictionary.setContent(content);
    V1DLPDictionaryMetadata dictionaryMetadata = new V1DLPDictionaryMetadata();
    actualV1dlpDictionary.setDictionaryMetadata(dictionaryMetadata);
    String actualToStringResult = actualV1dlpDictionary.toString();
    V1DLPDictionaryContent actualContent = actualV1dlpDictionary.getContent();

    // Assert
    assertEquals("class V1DLPDictionary {\n" + "    content: class V1DLPDictionaryContent {\n" + "        data: null\n"
        + "        numKeywords: null\n" + "        md5: null\n" + "    }\n"
        + "    dictionaryMetadata: class V1DLPDictionaryMetadata {\n" + "        creationDate: null\n"
        + "        creatorId: null\n" + "        dictRef: null\n" + "        lastUpdatedDate: null\n"
        + "        type: null\n" + "    }\n" + "}", actualToStringResult);
    assertSame(actualV1dlpDictionary, actualContentResult);
    assertSame(actualV1dlpDictionary, actualDictionaryMetadataResult);
    assertSame(content, actualContent);
    assertSame(dictionaryMetadata, actualV1dlpDictionary.getDictionaryMetadata());
  }
}
