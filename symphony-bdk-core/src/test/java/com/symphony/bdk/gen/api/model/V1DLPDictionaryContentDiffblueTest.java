package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V1DLPDictionaryContentDiffblueTest {
  /**
   * Test {@link V1DLPDictionaryContent#equals(Object)}, and {@link
   * V1DLPDictionaryContent#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V1DLPDictionaryContent#equals(Object)}
   *   <li>{@link V1DLPDictionaryContent#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPDictionaryContent.equals(Object)",
    "int V1DLPDictionaryContent.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V1DLPDictionaryContent v1dlpDictionaryContent = new V1DLPDictionaryContent();
    V1DLPDictionaryContent v1dlpDictionaryContent2 = new V1DLPDictionaryContent();

    // Act and Assert
    assertEquals(v1dlpDictionaryContent, v1dlpDictionaryContent2);
    int expectedHashCodeResult = v1dlpDictionaryContent.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpDictionaryContent2.hashCode());
  }

  /**
   * Test {@link V1DLPDictionaryContent#equals(Object)}, and {@link
   * V1DLPDictionaryContent#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V1DLPDictionaryContent#equals(Object)}
   *   <li>{@link V1DLPDictionaryContent#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPDictionaryContent.equals(Object)",
    "int V1DLPDictionaryContent.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V1DLPDictionaryContent v1dlpDictionaryContent = new V1DLPDictionaryContent();

    // Act and Assert
    assertEquals(v1dlpDictionaryContent, v1dlpDictionaryContent);
    int expectedHashCodeResult = v1dlpDictionaryContent.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpDictionaryContent.hashCode());
  }

  /**
   * Test {@link V1DLPDictionaryContent#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPDictionaryContent#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPDictionaryContent.equals(Object)",
    "int V1DLPDictionaryContent.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPDictionaryContent(), 1);
  }

  /**
   * Test {@link V1DLPDictionaryContent#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPDictionaryContent#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPDictionaryContent.equals(Object)",
    "int V1DLPDictionaryContent.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V1DLPDictionaryContent v1dlpDictionaryContent = new V1DLPDictionaryContent();
    v1dlpDictionaryContent.data(MessageIdsFromStream.JSON_PROPERTY_DATA);

    // Act and Assert
    assertNotEquals(v1dlpDictionaryContent, new V1DLPDictionaryContent());
  }

  /**
   * Test {@link V1DLPDictionaryContent#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPDictionaryContent#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPDictionaryContent.equals(Object)",
    "int V1DLPDictionaryContent.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V1DLPDictionaryContent v1dlpDictionaryContent = new V1DLPDictionaryContent();
    v1dlpDictionaryContent.numKeywords(10);

    // Act and Assert
    assertNotEquals(v1dlpDictionaryContent, new V1DLPDictionaryContent());
  }

  /**
   * Test {@link V1DLPDictionaryContent#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPDictionaryContent#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPDictionaryContent.equals(Object)",
    "int V1DLPDictionaryContent.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V1DLPDictionaryContent v1dlpDictionaryContent = new V1DLPDictionaryContent();
    v1dlpDictionaryContent.md5("27c7cf400229103e00c6d8830029e29b");

    // Act and Assert
    assertNotEquals(v1dlpDictionaryContent, new V1DLPDictionaryContent());
  }

  /**
   * Test {@link V1DLPDictionaryContent#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPDictionaryContent#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPDictionaryContent.equals(Object)",
    "int V1DLPDictionaryContent.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPDictionaryContent(), null);
  }

  /**
   * Test {@link V1DLPDictionaryContent#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPDictionaryContent#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPDictionaryContent.equals(Object)",
    "int V1DLPDictionaryContent.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPDictionaryContent(), "Different type to V1DLPDictionaryContent");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V1DLPDictionaryContent}
   *   <li>{@link V1DLPDictionaryContent#data(String)}
   *   <li>{@link V1DLPDictionaryContent#md5(String)}
   *   <li>{@link V1DLPDictionaryContent#numKeywords(Integer)}
   *   <li>{@link V1DLPDictionaryContent#setData(String)}
   *   <li>{@link V1DLPDictionaryContent#setMd5(String)}
   *   <li>{@link V1DLPDictionaryContent#setNumKeywords(Integer)}
   *   <li>{@link V1DLPDictionaryContent#toString()}
   *   <li>{@link V1DLPDictionaryContent#getData()}
   *   <li>{@link V1DLPDictionaryContent#getMd5()}
   *   <li>{@link V1DLPDictionaryContent#getNumKeywords()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V1DLPDictionaryContent.<init>()",
    "V1DLPDictionaryContent V1DLPDictionaryContent.data(String)",
    "String V1DLPDictionaryContent.getData()",
    "String V1DLPDictionaryContent.getMd5()",
    "Integer V1DLPDictionaryContent.getNumKeywords()",
    "V1DLPDictionaryContent V1DLPDictionaryContent.md5(String)",
    "V1DLPDictionaryContent V1DLPDictionaryContent.numKeywords(Integer)",
    "void V1DLPDictionaryContent.setData(String)",
    "void V1DLPDictionaryContent.setMd5(String)",
    "void V1DLPDictionaryContent.setNumKeywords(Integer)",
    "String V1DLPDictionaryContent.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V1DLPDictionaryContent actualV1dlpDictionaryContent = new V1DLPDictionaryContent();
    V1DLPDictionaryContent actualDataResult =
        actualV1dlpDictionaryContent.data(MessageIdsFromStream.JSON_PROPERTY_DATA);
    V1DLPDictionaryContent actualMd5Result =
        actualV1dlpDictionaryContent.md5("27c7cf400229103e00c6d8830029e29b");
    V1DLPDictionaryContent actualNumKeywordsResult = actualV1dlpDictionaryContent.numKeywords(10);
    actualV1dlpDictionaryContent.setData(MessageIdsFromStream.JSON_PROPERTY_DATA);
    actualV1dlpDictionaryContent.setMd5("27c7cf400229103e00c6d8830029e29b");
    actualV1dlpDictionaryContent.setNumKeywords(10);
    String actualToStringResult = actualV1dlpDictionaryContent.toString();
    String actualData = actualV1dlpDictionaryContent.getData();
    String actualMd5 = actualV1dlpDictionaryContent.getMd5();

    // Assert
    assertEquals("27c7cf400229103e00c6d8830029e29b", actualMd5);
    assertEquals(
        "class V1DLPDictionaryContent {\n"
            + "    data: Data\n"
            + "    numKeywords: 10\n"
            + "    md5: 27c7cf400229103e00c6d8830029e29b\n"
            + "}",
        actualToStringResult);
    assertEquals(10, actualV1dlpDictionaryContent.getNumKeywords().intValue());
    assertEquals(MessageIdsFromStream.JSON_PROPERTY_DATA, actualData);
    assertSame(actualV1dlpDictionaryContent, actualDataResult);
    assertSame(actualV1dlpDictionaryContent, actualMd5Result);
    assertSame(actualV1dlpDictionaryContent, actualNumKeywordsResult);
  }
}
