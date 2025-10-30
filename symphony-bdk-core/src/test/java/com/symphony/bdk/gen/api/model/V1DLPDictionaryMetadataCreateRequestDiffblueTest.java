package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V1DLPDictionaryMetadataCreateRequestDiffblueTest {
  /**
   * Test {@link V1DLPDictionaryMetadataCreateRequest#equals(Object)}, and {@link V1DLPDictionaryMetadataCreateRequest#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V1DLPDictionaryMetadataCreateRequest#equals(Object)}
   *   <li>{@link V1DLPDictionaryMetadataCreateRequest#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPDictionaryMetadataCreateRequest.equals(Object)",
      "int V1DLPDictionaryMetadataCreateRequest.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V1DLPDictionaryMetadataCreateRequest v1dlpDictionaryMetadataCreateRequest = new V1DLPDictionaryMetadataCreateRequest();
    V1DLPDictionaryMetadataCreateRequest v1dlpDictionaryMetadataCreateRequest2 = new V1DLPDictionaryMetadataCreateRequest();

    // Act and Assert
    assertEquals(v1dlpDictionaryMetadataCreateRequest, v1dlpDictionaryMetadataCreateRequest2);
    int expectedHashCodeResult = v1dlpDictionaryMetadataCreateRequest.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpDictionaryMetadataCreateRequest2.hashCode());
  }

  /**
   * Test {@link V1DLPDictionaryMetadataCreateRequest#equals(Object)}, and {@link V1DLPDictionaryMetadataCreateRequest#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V1DLPDictionaryMetadataCreateRequest#equals(Object)}
   *   <li>{@link V1DLPDictionaryMetadataCreateRequest#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPDictionaryMetadataCreateRequest.equals(Object)",
      "int V1DLPDictionaryMetadataCreateRequest.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V1DLPDictionaryMetadataCreateRequest v1dlpDictionaryMetadataCreateRequest = new V1DLPDictionaryMetadataCreateRequest();

    // Act and Assert
    assertEquals(v1dlpDictionaryMetadataCreateRequest, v1dlpDictionaryMetadataCreateRequest);
    int expectedHashCodeResult = v1dlpDictionaryMetadataCreateRequest.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpDictionaryMetadataCreateRequest.hashCode());
  }

  /**
   * Test {@link V1DLPDictionaryMetadataCreateRequest#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPDictionaryMetadataCreateRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPDictionaryMetadataCreateRequest.equals(Object)",
      "int V1DLPDictionaryMetadataCreateRequest.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPDictionaryMetadataCreateRequest(), 1);
  }

  /**
   * Test {@link V1DLPDictionaryMetadataCreateRequest#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPDictionaryMetadataCreateRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPDictionaryMetadataCreateRequest.equals(Object)",
      "int V1DLPDictionaryMetadataCreateRequest.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V1DLPDictionaryMetadataCreateRequest v1dlpDictionaryMetadataCreateRequest = new V1DLPDictionaryMetadataCreateRequest();
    v1dlpDictionaryMetadataCreateRequest.name("Name");

    // Act and Assert
    assertNotEquals(v1dlpDictionaryMetadataCreateRequest, new V1DLPDictionaryMetadataCreateRequest());
  }

  /**
   * Test {@link V1DLPDictionaryMetadataCreateRequest#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPDictionaryMetadataCreateRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPDictionaryMetadataCreateRequest.equals(Object)",
      "int V1DLPDictionaryMetadataCreateRequest.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V1DLPDictionaryMetadataCreateRequest v1dlpDictionaryMetadataCreateRequest = new V1DLPDictionaryMetadataCreateRequest();
    v1dlpDictionaryMetadataCreateRequest.type("Type");

    // Act and Assert
    assertNotEquals(v1dlpDictionaryMetadataCreateRequest, new V1DLPDictionaryMetadataCreateRequest());
  }

  /**
   * Test {@link V1DLPDictionaryMetadataCreateRequest#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPDictionaryMetadataCreateRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPDictionaryMetadataCreateRequest.equals(Object)",
      "int V1DLPDictionaryMetadataCreateRequest.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPDictionaryMetadataCreateRequest(), null);
  }

  /**
   * Test {@link V1DLPDictionaryMetadataCreateRequest#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPDictionaryMetadataCreateRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPDictionaryMetadataCreateRequest.equals(Object)",
      "int V1DLPDictionaryMetadataCreateRequest.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPDictionaryMetadataCreateRequest(),
        "Different type to V1DLPDictionaryMetadataCreateRequest");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V1DLPDictionaryMetadataCreateRequest}
   *   <li>{@link V1DLPDictionaryMetadataCreateRequest#name(String)}
   *   <li>{@link V1DLPDictionaryMetadataCreateRequest#setName(String)}
   *   <li>{@link V1DLPDictionaryMetadataCreateRequest#setType(String)}
   *   <li>{@link V1DLPDictionaryMetadataCreateRequest#type(String)}
   *   <li>{@link V1DLPDictionaryMetadataCreateRequest#toString()}
   *   <li>{@link V1DLPDictionaryMetadataCreateRequest#getName()}
   *   <li>{@link V1DLPDictionaryMetadataCreateRequest#getType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V1DLPDictionaryMetadataCreateRequest.<init>()",
      "String V1DLPDictionaryMetadataCreateRequest.getName()", "String V1DLPDictionaryMetadataCreateRequest.getType()",
      "V1DLPDictionaryMetadataCreateRequest V1DLPDictionaryMetadataCreateRequest.name(String)",
      "void V1DLPDictionaryMetadataCreateRequest.setName(String)",
      "void V1DLPDictionaryMetadataCreateRequest.setType(String)",
      "String V1DLPDictionaryMetadataCreateRequest.toString()",
      "V1DLPDictionaryMetadataCreateRequest V1DLPDictionaryMetadataCreateRequest.type(String)"})
  void testGettersAndSetters() {
    // Arrange and Act
    V1DLPDictionaryMetadataCreateRequest actualV1dlpDictionaryMetadataCreateRequest = new V1DLPDictionaryMetadataCreateRequest();
    V1DLPDictionaryMetadataCreateRequest actualNameResult = actualV1dlpDictionaryMetadataCreateRequest.name("Name");
    actualV1dlpDictionaryMetadataCreateRequest.setName("Name");
    actualV1dlpDictionaryMetadataCreateRequest.setType("Type");
    V1DLPDictionaryMetadataCreateRequest actualTypeResult = actualV1dlpDictionaryMetadataCreateRequest.type("Type");
    String actualToStringResult = actualV1dlpDictionaryMetadataCreateRequest.toString();
    String actualName = actualV1dlpDictionaryMetadataCreateRequest.getName();

    // Assert
    assertEquals("Name", actualName);
    assertEquals("Type", actualV1dlpDictionaryMetadataCreateRequest.getType());
    assertEquals("class V1DLPDictionaryMetadataCreateRequest {\n    name: Name\n    type: Type\n}",
        actualToStringResult);
    assertSame(actualV1dlpDictionaryMetadataCreateRequest, actualNameResult);
    assertSame(actualV1dlpDictionaryMetadataCreateRequest, actualTypeResult);
  }
}
