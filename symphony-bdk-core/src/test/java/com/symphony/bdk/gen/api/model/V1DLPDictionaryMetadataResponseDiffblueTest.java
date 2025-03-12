package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V1DLPDictionaryMetadataResponseDiffblueTest {
  /**
   * Test {@link V1DLPDictionaryMetadataResponse#equals(Object)}, and {@link V1DLPDictionaryMetadataResponse#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V1DLPDictionaryMetadataResponse#equals(Object)}
   *   <li>{@link V1DLPDictionaryMetadataResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPDictionaryMetadataResponse.equals(Object)",
      "int V1DLPDictionaryMetadataResponse.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V1DLPDictionaryMetadataResponse v1dlpDictionaryMetadataResponse = new V1DLPDictionaryMetadataResponse();
    V1DLPDictionaryMetadataResponse v1dlpDictionaryMetadataResponse2 = new V1DLPDictionaryMetadataResponse();

    // Act and Assert
    assertEquals(v1dlpDictionaryMetadataResponse, v1dlpDictionaryMetadataResponse2);
    int expectedHashCodeResult = v1dlpDictionaryMetadataResponse.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpDictionaryMetadataResponse2.hashCode());
  }

  /**
   * Test {@link V1DLPDictionaryMetadataResponse#equals(Object)}, and {@link V1DLPDictionaryMetadataResponse#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V1DLPDictionaryMetadataResponse#equals(Object)}
   *   <li>{@link V1DLPDictionaryMetadataResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPDictionaryMetadataResponse.equals(Object)",
      "int V1DLPDictionaryMetadataResponse.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V1DLPDictionaryMetadataResponse v1dlpDictionaryMetadataResponse = new V1DLPDictionaryMetadataResponse();

    // Act and Assert
    assertEquals(v1dlpDictionaryMetadataResponse, v1dlpDictionaryMetadataResponse);
    int expectedHashCodeResult = v1dlpDictionaryMetadataResponse.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpDictionaryMetadataResponse.hashCode());
  }

  /**
   * Test {@link V1DLPDictionaryMetadataResponse#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPDictionaryMetadataResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPDictionaryMetadataResponse.equals(Object)",
      "int V1DLPDictionaryMetadataResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPDictionaryMetadataResponse(), null);
  }

  /**
   * Test {@link V1DLPDictionaryMetadataResponse#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPDictionaryMetadataResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPDictionaryMetadataResponse.equals(Object)",
      "int V1DLPDictionaryMetadataResponse.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPDictionaryMetadataResponse(), null);
  }

  /**
   * Test {@link V1DLPDictionaryMetadataResponse#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPDictionaryMetadataResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPDictionaryMetadataResponse.equals(Object)",
      "int V1DLPDictionaryMetadataResponse.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPDictionaryMetadataResponse(), "Different type to V1DLPDictionaryMetadataResponse");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V1DLPDictionaryMetadataResponse}
   *   <li>{@link V1DLPDictionaryMetadataResponse#data(V1DLPDictionaryMetadata)}
   *   <li>{@link V1DLPDictionaryMetadataResponse#setData(V1DLPDictionaryMetadata)}
   *   <li>{@link V1DLPDictionaryMetadataResponse#toString()}
   *   <li>{@link V1DLPDictionaryMetadataResponse#getData()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V1DLPDictionaryMetadataResponse.<init>()",
      "V1DLPDictionaryMetadataResponse V1DLPDictionaryMetadataResponse.data(V1DLPDictionaryMetadata)",
      "V1DLPDictionaryMetadata V1DLPDictionaryMetadataResponse.getData()",
      "void V1DLPDictionaryMetadataResponse.setData(V1DLPDictionaryMetadata)",
      "String V1DLPDictionaryMetadataResponse.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    V1DLPDictionaryMetadataResponse actualV1dlpDictionaryMetadataResponse = new V1DLPDictionaryMetadataResponse();
    V1DLPDictionaryMetadataResponse actualDataResult = actualV1dlpDictionaryMetadataResponse
        .data(new V1DLPDictionaryMetadata());
    V1DLPDictionaryMetadata data = new V1DLPDictionaryMetadata();
    actualV1dlpDictionaryMetadataResponse.setData(data);
    String actualToStringResult = actualV1dlpDictionaryMetadataResponse.toString();

    // Assert
    assertEquals("class V1DLPDictionaryMetadataResponse {\n" + "    data: class V1DLPDictionaryMetadata {\n"
        + "        creationDate: null\n" + "        creatorId: null\n" + "        dictRef: null\n"
        + "        lastUpdatedDate: null\n" + "        type: null\n" + "    }\n" + "}", actualToStringResult);
    assertSame(data, actualV1dlpDictionaryMetadataResponse.getData());
    assertSame(actualV1dlpDictionaryMetadataResponse, actualDataResult);
  }
}
