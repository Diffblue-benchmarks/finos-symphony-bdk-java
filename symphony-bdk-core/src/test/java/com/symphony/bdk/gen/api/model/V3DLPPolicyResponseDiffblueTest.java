package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V3DLPPolicyResponseDiffblueTest {
  /**
   * Test {@link V3DLPPolicyResponse#equals(Object)}, and {@link V3DLPPolicyResponse#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V3DLPPolicyResponse#equals(Object)}
   *   <li>{@link V3DLPPolicyResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPPolicyResponse.equals(Object)", "int V3DLPPolicyResponse.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V3DLPPolicyResponse v3dlpPolicyResponse = new V3DLPPolicyResponse();
    V3DLPPolicyResponse v3dlpPolicyResponse2 = new V3DLPPolicyResponse();

    // Act and Assert
    assertEquals(v3dlpPolicyResponse, v3dlpPolicyResponse2);
    int expectedHashCodeResult = v3dlpPolicyResponse.hashCode();
    assertEquals(expectedHashCodeResult, v3dlpPolicyResponse2.hashCode());
  }

  /**
   * Test {@link V3DLPPolicyResponse#equals(Object)}, and {@link V3DLPPolicyResponse#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V3DLPPolicyResponse#equals(Object)}
   *   <li>{@link V3DLPPolicyResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPPolicyResponse.equals(Object)", "int V3DLPPolicyResponse.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V3DLPPolicyResponse v3dlpPolicyResponse = new V3DLPPolicyResponse();

    // Act and Assert
    assertEquals(v3dlpPolicyResponse, v3dlpPolicyResponse);
    int expectedHashCodeResult = v3dlpPolicyResponse.hashCode();
    assertEquals(expectedHashCodeResult, v3dlpPolicyResponse.hashCode());
  }

  /**
   * Test {@link V3DLPPolicyResponse#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3DLPPolicyResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPPolicyResponse.equals(Object)", "int V3DLPPolicyResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPPolicyResponse(), null);
  }

  /**
   * Test {@link V3DLPPolicyResponse#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3DLPPolicyResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPPolicyResponse.equals(Object)", "int V3DLPPolicyResponse.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPPolicyResponse(), null);
  }

  /**
   * Test {@link V3DLPPolicyResponse#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3DLPPolicyResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPPolicyResponse.equals(Object)", "int V3DLPPolicyResponse.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPPolicyResponse(), "Different type to V3DLPPolicyResponse");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V3DLPPolicyResponse}
   *   <li>{@link V3DLPPolicyResponse#data(V3DLPPolicy)}
   *   <li>{@link V3DLPPolicyResponse#setData(V3DLPPolicy)}
   *   <li>{@link V3DLPPolicyResponse#toString()}
   *   <li>{@link V3DLPPolicyResponse#getData()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V3DLPPolicyResponse.<init>()", "V3DLPPolicyResponse V3DLPPolicyResponse.data(V3DLPPolicy)",
      "V3DLPPolicy V3DLPPolicyResponse.getData()", "void V3DLPPolicyResponse.setData(V3DLPPolicy)",
      "String V3DLPPolicyResponse.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    V3DLPPolicyResponse actualV3dlpPolicyResponse = new V3DLPPolicyResponse();
    V3DLPPolicyResponse actualDataResult = actualV3dlpPolicyResponse.data(new V3DLPPolicy());
    V3DLPPolicy data = new V3DLPPolicy();
    actualV3dlpPolicyResponse.setData(data);
    String actualToStringResult = actualV3dlpPolicyResponse.toString();

    // Assert
    assertEquals("class V3DLPPolicyResponse {\n" + "    data: class V3DLPPolicy {\n" + "        id: null\n"
        + "        policyId: null\n" + "        version: null\n" + "        name: null\n" + "        creatorId: null\n"
        + "        scopes: null\n" + "        appliesTo: []\n" + "        active: null\n" + "        deleted: null\n"
        + "        creationDate: null\n" + "        lastUpdatedDate: null\n" + "        lastDisabledDate: null\n"
        + "        systemPolicy: null\n" + "    }\n" + "}", actualToStringResult);
    assertSame(data, actualV3dlpPolicyResponse.getData());
    assertSame(actualV3dlpPolicyResponse, actualDataResult);
  }
}
