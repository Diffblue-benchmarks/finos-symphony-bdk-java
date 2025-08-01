package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V1DLPViolationSignalResponseDiffblueTest {
  /**
   * Test {@link V1DLPViolationSignalResponse#addViolationsItem(V1DLPViolationSignal)}.
   *
   * <p>Method under test: {@link
   * V1DLPViolationSignalResponse#addViolationsItem(V1DLPViolationSignal)}
   */
  @Test
  @DisplayName("Test addViolationsItem(V1DLPViolationSignal)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "V1DLPViolationSignalResponse V1DLPViolationSignalResponse.addViolationsItem(V1DLPViolationSignal)"
  })
  void testAddViolationsItem() {
    // Arrange
    V1DLPViolationSignalResponse v1dlpViolationSignalResponse = new V1DLPViolationSignalResponse();

    // Act and Assert
    assertSame(
        v1dlpViolationSignalResponse,
        v1dlpViolationSignalResponse.addViolationsItem(new V1DLPViolationSignal()));
  }

  /**
   * Test {@link V1DLPViolationSignalResponse#equals(Object)}, and {@link
   * V1DLPViolationSignalResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V1DLPViolationSignalResponse#equals(Object)}
   *   <li>{@link V1DLPViolationSignalResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPViolationSignalResponse.equals(Object)",
    "int V1DLPViolationSignalResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V1DLPViolationSignalResponse v1dlpViolationSignalResponse = new V1DLPViolationSignalResponse();
    V1DLPViolationSignalResponse v1dlpViolationSignalResponse2 = new V1DLPViolationSignalResponse();

    // Act and Assert
    assertEquals(v1dlpViolationSignalResponse, v1dlpViolationSignalResponse2);
    int expectedHashCodeResult = v1dlpViolationSignalResponse.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpViolationSignalResponse2.hashCode());
  }

  /**
   * Test {@link V1DLPViolationSignalResponse#equals(Object)}, and {@link
   * V1DLPViolationSignalResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V1DLPViolationSignalResponse#equals(Object)}
   *   <li>{@link V1DLPViolationSignalResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPViolationSignalResponse.equals(Object)",
    "int V1DLPViolationSignalResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V1DLPViolationSignalResponse v1dlpViolationSignalResponse = new V1DLPViolationSignalResponse();

    // Act and Assert
    assertEquals(v1dlpViolationSignalResponse, v1dlpViolationSignalResponse);
    int expectedHashCodeResult = v1dlpViolationSignalResponse.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpViolationSignalResponse.hashCode());
  }

  /**
   * Test {@link V1DLPViolationSignalResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPViolationSignalResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPViolationSignalResponse.equals(Object)",
    "int V1DLPViolationSignalResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V1DLPViolationSignalResponse v1dlpViolationSignalResponse = new V1DLPViolationSignalResponse();
    v1dlpViolationSignalResponse.addViolationsItem(new V1DLPViolationSignal());

    // Act and Assert
    assertNotEquals(v1dlpViolationSignalResponse, new V1DLPViolationSignalResponse());
  }

  /**
   * Test {@link V1DLPViolationSignalResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPViolationSignalResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPViolationSignalResponse.equals(Object)",
    "int V1DLPViolationSignalResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V1DLPViolationSignalResponse v1dlpViolationSignalResponse = new V1DLPViolationSignalResponse();
    v1dlpViolationSignalResponse.nextOffset("Next Offset");

    // Act and Assert
    assertNotEquals(v1dlpViolationSignalResponse, new V1DLPViolationSignalResponse());
  }

  /**
   * Test {@link V1DLPViolationSignalResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPViolationSignalResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPViolationSignalResponse.equals(Object)",
    "int V1DLPViolationSignalResponse.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPViolationSignalResponse(), null);
  }

  /**
   * Test {@link V1DLPViolationSignalResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPViolationSignalResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPViolationSignalResponse.equals(Object)",
    "int V1DLPViolationSignalResponse.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new V1DLPViolationSignalResponse(), "Different type to V1DLPViolationSignalResponse");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V1DLPViolationSignalResponse}
   *   <li>{@link V1DLPViolationSignalResponse#nextOffset(String)}
   *   <li>{@link V1DLPViolationSignalResponse#setNextOffset(String)}
   *   <li>{@link V1DLPViolationSignalResponse#setViolations(List)}
   *   <li>{@link V1DLPViolationSignalResponse#violations(List)}
   *   <li>{@link V1DLPViolationSignalResponse#toString()}
   *   <li>{@link V1DLPViolationSignalResponse#getNextOffset()}
   *   <li>{@link V1DLPViolationSignalResponse#getViolations()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V1DLPViolationSignalResponse.<init>()",
    "String V1DLPViolationSignalResponse.getNextOffset()",
    "List V1DLPViolationSignalResponse.getViolations()",
    "V1DLPViolationSignalResponse V1DLPViolationSignalResponse.nextOffset(String)",
    "void V1DLPViolationSignalResponse.setNextOffset(String)",
    "void V1DLPViolationSignalResponse.setViolations(List)",
    "String V1DLPViolationSignalResponse.toString()",
    "V1DLPViolationSignalResponse V1DLPViolationSignalResponse.violations(List)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V1DLPViolationSignalResponse actualV1dlpViolationSignalResponse =
        new V1DLPViolationSignalResponse();
    V1DLPViolationSignalResponse actualNextOffsetResult =
        actualV1dlpViolationSignalResponse.nextOffset("Next Offset");
    actualV1dlpViolationSignalResponse.setNextOffset("Next Offset");
    actualV1dlpViolationSignalResponse.setViolations(new ArrayList<>());
    ArrayList<V1DLPViolationSignal> violations = new ArrayList<>();
    V1DLPViolationSignalResponse actualViolationsResult =
        actualV1dlpViolationSignalResponse.violations(violations);
    String actualToStringResult = actualV1dlpViolationSignalResponse.toString();
    String actualNextOffset = actualV1dlpViolationSignalResponse.getNextOffset();
    List<V1DLPViolationSignal> actualViolations =
        actualV1dlpViolationSignalResponse.getViolations();

    // Assert
    assertEquals("Next Offset", actualNextOffset);
    assertEquals(
        "class V1DLPViolationSignalResponse {\n    violations: []\n    nextOffset: Next Offset\n}",
        actualToStringResult);
    assertTrue(actualViolations.isEmpty());
    assertSame(actualV1dlpViolationSignalResponse, actualNextOffsetResult);
    assertSame(actualV1dlpViolationSignalResponse, actualViolationsResult);
    assertSame(violations, actualViolations);
  }
}
