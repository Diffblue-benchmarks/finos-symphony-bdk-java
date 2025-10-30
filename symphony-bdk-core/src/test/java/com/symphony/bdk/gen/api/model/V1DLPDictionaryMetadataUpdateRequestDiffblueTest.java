package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V1DLPDictionaryMetadataUpdateRequestDiffblueTest {
  /**
   * Test {@link V1DLPDictionaryMetadataUpdateRequest#equals(Object)}, and {@link V1DLPDictionaryMetadataUpdateRequest#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V1DLPDictionaryMetadataUpdateRequest#equals(Object)}
   *   <li>{@link V1DLPDictionaryMetadataUpdateRequest#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPDictionaryMetadataUpdateRequest.equals(Object)",
      "int V1DLPDictionaryMetadataUpdateRequest.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V1DLPDictionaryMetadataUpdateRequest v1dlpDictionaryMetadataUpdateRequest = new V1DLPDictionaryMetadataUpdateRequest();
    V1DLPDictionaryMetadataUpdateRequest v1dlpDictionaryMetadataUpdateRequest2 = new V1DLPDictionaryMetadataUpdateRequest();

    // Act and Assert
    assertEquals(v1dlpDictionaryMetadataUpdateRequest, v1dlpDictionaryMetadataUpdateRequest2);
    int expectedHashCodeResult = v1dlpDictionaryMetadataUpdateRequest.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpDictionaryMetadataUpdateRequest2.hashCode());
  }

  /**
   * Test {@link V1DLPDictionaryMetadataUpdateRequest#equals(Object)}, and {@link V1DLPDictionaryMetadataUpdateRequest#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V1DLPDictionaryMetadataUpdateRequest#equals(Object)}
   *   <li>{@link V1DLPDictionaryMetadataUpdateRequest#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPDictionaryMetadataUpdateRequest.equals(Object)",
      "int V1DLPDictionaryMetadataUpdateRequest.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V1DLPDictionaryMetadataUpdateRequest v1dlpDictionaryMetadataUpdateRequest = new V1DLPDictionaryMetadataUpdateRequest();

    // Act and Assert
    assertEquals(v1dlpDictionaryMetadataUpdateRequest, v1dlpDictionaryMetadataUpdateRequest);
    int expectedHashCodeResult = v1dlpDictionaryMetadataUpdateRequest.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpDictionaryMetadataUpdateRequest.hashCode());
  }

  /**
   * Test {@link V1DLPDictionaryMetadataUpdateRequest#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPDictionaryMetadataUpdateRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPDictionaryMetadataUpdateRequest.equals(Object)",
      "int V1DLPDictionaryMetadataUpdateRequest.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPDictionaryMetadataUpdateRequest(), null);
  }

  /**
   * Test {@link V1DLPDictionaryMetadataUpdateRequest#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPDictionaryMetadataUpdateRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPDictionaryMetadataUpdateRequest.equals(Object)",
      "int V1DLPDictionaryMetadataUpdateRequest.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPDictionaryMetadataUpdateRequest(), null);
  }

  /**
   * Test {@link V1DLPDictionaryMetadataUpdateRequest#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPDictionaryMetadataUpdateRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPDictionaryMetadataUpdateRequest.equals(Object)",
      "int V1DLPDictionaryMetadataUpdateRequest.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPDictionaryMetadataUpdateRequest(),
        "Different type to V1DLPDictionaryMetadataUpdateRequest");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V1DLPDictionaryMetadataUpdateRequest}
   *   <li>{@link V1DLPDictionaryMetadataUpdateRequest#name(String)}
   *   <li>{@link V1DLPDictionaryMetadataUpdateRequest#setName(String)}
   *   <li>{@link V1DLPDictionaryMetadataUpdateRequest#toString()}
   *   <li>{@link V1DLPDictionaryMetadataUpdateRequest#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V1DLPDictionaryMetadataUpdateRequest.<init>()",
      "String V1DLPDictionaryMetadataUpdateRequest.getName()",
      "V1DLPDictionaryMetadataUpdateRequest V1DLPDictionaryMetadataUpdateRequest.name(String)",
      "void V1DLPDictionaryMetadataUpdateRequest.setName(String)",
      "String V1DLPDictionaryMetadataUpdateRequest.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    V1DLPDictionaryMetadataUpdateRequest actualV1dlpDictionaryMetadataUpdateRequest = new V1DLPDictionaryMetadataUpdateRequest();
    V1DLPDictionaryMetadataUpdateRequest actualNameResult = actualV1dlpDictionaryMetadataUpdateRequest.name("Name");
    actualV1dlpDictionaryMetadataUpdateRequest.setName("Name");
    String actualToStringResult = actualV1dlpDictionaryMetadataUpdateRequest.toString();

    // Assert
    assertEquals("Name", actualV1dlpDictionaryMetadataUpdateRequest.getName());
    assertEquals("class V1DLPDictionaryMetadataUpdateRequest {\n    name: Name\n}", actualToStringResult);
    assertSame(actualV1dlpDictionaryMetadataUpdateRequest, actualNameResult);
  }
}
