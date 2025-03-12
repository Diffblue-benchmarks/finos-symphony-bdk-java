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

class V1DLPViolationStreamResponseDiffblueTest {
  /**
   * Test {@link V1DLPViolationStreamResponse#addViolationsItem(V1DLPViolationStream)}.
   * <p>
   * Method under test: {@link V1DLPViolationStreamResponse#addViolationsItem(V1DLPViolationStream)}
   */
  @Test
  @DisplayName("Test addViolationsItem(V1DLPViolationStream)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "V1DLPViolationStreamResponse V1DLPViolationStreamResponse.addViolationsItem(V1DLPViolationStream)"})
  void testAddViolationsItem() {
    // Arrange
    V1DLPViolationStreamResponse v1dlpViolationStreamResponse = new V1DLPViolationStreamResponse();

    // Act and Assert
    assertSame(v1dlpViolationStreamResponse,
        v1dlpViolationStreamResponse.addViolationsItem(new V1DLPViolationStream()));
  }

  /**
   * Test {@link V1DLPViolationStreamResponse#equals(Object)}, and {@link V1DLPViolationStreamResponse#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V1DLPViolationStreamResponse#equals(Object)}
   *   <li>{@link V1DLPViolationStreamResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPViolationStreamResponse.equals(Object)",
      "int V1DLPViolationStreamResponse.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V1DLPViolationStreamResponse v1dlpViolationStreamResponse = new V1DLPViolationStreamResponse();
    V1DLPViolationStreamResponse v1dlpViolationStreamResponse2 = new V1DLPViolationStreamResponse();

    // Act and Assert
    assertEquals(v1dlpViolationStreamResponse, v1dlpViolationStreamResponse2);
    int expectedHashCodeResult = v1dlpViolationStreamResponse.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpViolationStreamResponse2.hashCode());
  }

  /**
   * Test {@link V1DLPViolationStreamResponse#equals(Object)}, and {@link V1DLPViolationStreamResponse#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V1DLPViolationStreamResponse#equals(Object)}
   *   <li>{@link V1DLPViolationStreamResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPViolationStreamResponse.equals(Object)",
      "int V1DLPViolationStreamResponse.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V1DLPViolationStreamResponse v1dlpViolationStreamResponse = new V1DLPViolationStreamResponse();

    // Act and Assert
    assertEquals(v1dlpViolationStreamResponse, v1dlpViolationStreamResponse);
    int expectedHashCodeResult = v1dlpViolationStreamResponse.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpViolationStreamResponse.hashCode());
  }

  /**
   * Test {@link V1DLPViolationStreamResponse#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPViolationStreamResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPViolationStreamResponse.equals(Object)",
      "int V1DLPViolationStreamResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V1DLPViolationStreamResponse v1dlpViolationStreamResponse = new V1DLPViolationStreamResponse();
    v1dlpViolationStreamResponse.addViolationsItem(new V1DLPViolationStream());

    // Act and Assert
    assertNotEquals(v1dlpViolationStreamResponse, new V1DLPViolationStreamResponse());
  }

  /**
   * Test {@link V1DLPViolationStreamResponse#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPViolationStreamResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPViolationStreamResponse.equals(Object)",
      "int V1DLPViolationStreamResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V1DLPViolationStreamResponse v1dlpViolationStreamResponse = new V1DLPViolationStreamResponse();
    v1dlpViolationStreamResponse.nextOffset("Next Offset");

    // Act and Assert
    assertNotEquals(v1dlpViolationStreamResponse, new V1DLPViolationStreamResponse());
  }

  /**
   * Test {@link V1DLPViolationStreamResponse#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPViolationStreamResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPViolationStreamResponse.equals(Object)",
      "int V1DLPViolationStreamResponse.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPViolationStreamResponse(), null);
  }

  /**
   * Test {@link V1DLPViolationStreamResponse#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPViolationStreamResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPViolationStreamResponse.equals(Object)",
      "int V1DLPViolationStreamResponse.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPViolationStreamResponse(), "Different type to V1DLPViolationStreamResponse");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V1DLPViolationStreamResponse}
   *   <li>{@link V1DLPViolationStreamResponse#nextOffset(String)}
   *   <li>{@link V1DLPViolationStreamResponse#setNextOffset(String)}
   *   <li>{@link V1DLPViolationStreamResponse#setViolations(List)}
   *   <li>{@link V1DLPViolationStreamResponse#violations(List)}
   *   <li>{@link V1DLPViolationStreamResponse#toString()}
   *   <li>{@link V1DLPViolationStreamResponse#getNextOffset()}
   *   <li>{@link V1DLPViolationStreamResponse#getViolations()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V1DLPViolationStreamResponse.<init>()",
      "String V1DLPViolationStreamResponse.getNextOffset()", "List V1DLPViolationStreamResponse.getViolations()",
      "V1DLPViolationStreamResponse V1DLPViolationStreamResponse.nextOffset(String)",
      "void V1DLPViolationStreamResponse.setNextOffset(String)",
      "void V1DLPViolationStreamResponse.setViolations(List)", "String V1DLPViolationStreamResponse.toString()",
      "V1DLPViolationStreamResponse V1DLPViolationStreamResponse.violations(List)"})
  void testGettersAndSetters() {
    // Arrange and Act
    V1DLPViolationStreamResponse actualV1dlpViolationStreamResponse = new V1DLPViolationStreamResponse();
    V1DLPViolationStreamResponse actualNextOffsetResult = actualV1dlpViolationStreamResponse.nextOffset("Next Offset");
    actualV1dlpViolationStreamResponse.setNextOffset("Next Offset");
    actualV1dlpViolationStreamResponse.setViolations(new ArrayList<>());
    ArrayList<V1DLPViolationStream> violations = new ArrayList<>();
    V1DLPViolationStreamResponse actualViolationsResult = actualV1dlpViolationStreamResponse.violations(violations);
    String actualToStringResult = actualV1dlpViolationStreamResponse.toString();
    String actualNextOffset = actualV1dlpViolationStreamResponse.getNextOffset();
    List<V1DLPViolationStream> actualViolations = actualV1dlpViolationStreamResponse.getViolations();

    // Assert
    assertEquals("Next Offset", actualNextOffset);
    assertEquals("class V1DLPViolationStreamResponse {\n    violations: []\n    nextOffset: Next Offset\n}",
        actualToStringResult);
    assertTrue(actualViolations.isEmpty());
    assertSame(actualV1dlpViolationStreamResponse, actualNextOffsetResult);
    assertSame(actualV1dlpViolationStreamResponse, actualViolationsResult);
    assertSame(violations, actualViolations);
  }
}
