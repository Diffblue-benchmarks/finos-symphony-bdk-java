package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V1DLPPolicyResponseDiffblueTest {
  /**
   * Test {@link V1DLPPolicyResponse#equals(Object)}, and {@link V1DLPPolicyResponse#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V1DLPPolicyResponse#equals(Object)}
   *   <li>{@link V1DLPPolicyResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPPolicyResponse.equals(Object)", "int V1DLPPolicyResponse.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V1DLPPolicyResponse v1dlpPolicyResponse = new V1DLPPolicyResponse();
    V1DLPPolicyResponse v1dlpPolicyResponse2 = new V1DLPPolicyResponse();

    // Act and Assert
    assertEquals(v1dlpPolicyResponse, v1dlpPolicyResponse2);
    int expectedHashCodeResult = v1dlpPolicyResponse.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpPolicyResponse2.hashCode());
  }

  /**
   * Test {@link V1DLPPolicyResponse#equals(Object)}, and {@link V1DLPPolicyResponse#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V1DLPPolicyResponse#equals(Object)}
   *   <li>{@link V1DLPPolicyResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPPolicyResponse.equals(Object)", "int V1DLPPolicyResponse.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V1DLPPolicyResponse v1dlpPolicyResponse = new V1DLPPolicyResponse();

    // Act and Assert
    assertEquals(v1dlpPolicyResponse, v1dlpPolicyResponse);
    int expectedHashCodeResult = v1dlpPolicyResponse.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpPolicyResponse.hashCode());
  }

  /**
   * Test {@link V1DLPPolicyResponse#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPPolicyResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPPolicyResponse.equals(Object)", "int V1DLPPolicyResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPPolicyResponse(), null);
  }

  /**
   * Test {@link V1DLPPolicyResponse#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPPolicyResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPPolicyResponse.equals(Object)", "int V1DLPPolicyResponse.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPPolicyResponse(), null);
  }

  /**
   * Test {@link V1DLPPolicyResponse#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPPolicyResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPPolicyResponse.equals(Object)", "int V1DLPPolicyResponse.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPPolicyResponse(), "Different type to V1DLPPolicyResponse");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V1DLPPolicyResponse}
   *   <li>{@link V1DLPPolicyResponse#data(V1DLPPolicy)}
   *   <li>{@link V1DLPPolicyResponse#setData(V1DLPPolicy)}
   *   <li>{@link V1DLPPolicyResponse#toString()}
   *   <li>{@link V1DLPPolicyResponse#getData()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V1DLPPolicyResponse.<init>()", "V1DLPPolicyResponse V1DLPPolicyResponse.data(V1DLPPolicy)",
      "V1DLPPolicy V1DLPPolicyResponse.getData()", "void V1DLPPolicyResponse.setData(V1DLPPolicy)",
      "String V1DLPPolicyResponse.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    V1DLPPolicyResponse actualV1dlpPolicyResponse = new V1DLPPolicyResponse();
    V1DLPPolicyResponse actualDataResult = actualV1dlpPolicyResponse.data(new V1DLPPolicy());
    V1DLPPolicy data = new V1DLPPolicy();
    actualV1dlpPolicyResponse.setData(data);
    String actualToStringResult = actualV1dlpPolicyResponse.toString();

    // Assert
    assertEquals("class V1DLPPolicyResponse {\n" + "    data: class V1DLPPolicy {\n" + "        active: null\n"
        + "        contentTypes: []\n" + "        creationDate: null\n" + "        creatorId: null\n"
        + "        dictionaryRefs: []\n" + "        lastDisabledDate: null\n" + "        lastUpdatedDate: null\n"
        + "        name: null\n" + "        policyId: null\n" + "        scopes: []\n" + "        type: null\n"
        + "        version: null\n" + "    }\n" + "}", actualToStringResult);
    assertSame(data, actualV1dlpPolicyResponse.getData());
    assertSame(actualV1dlpPolicyResponse, actualDataResult);
  }
}
