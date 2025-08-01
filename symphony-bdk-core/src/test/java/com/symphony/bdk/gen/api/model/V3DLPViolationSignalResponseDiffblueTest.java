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

class V3DLPViolationSignalResponseDiffblueTest {
  /**
   * Test {@link V3DLPViolationSignalResponse#addViolationsItem(V3DLPViolationSignal)}.
   *
   * <p>Method under test: {@link
   * V3DLPViolationSignalResponse#addViolationsItem(V3DLPViolationSignal)}
   */
  @Test
  @DisplayName("Test addViolationsItem(V3DLPViolationSignal)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "V3DLPViolationSignalResponse V3DLPViolationSignalResponse.addViolationsItem(V3DLPViolationSignal)"
  })
  void testAddViolationsItem() {
    // Arrange
    V3DLPViolationSignalResponse v3dlpViolationSignalResponse = new V3DLPViolationSignalResponse();

    // Act and Assert
    assertSame(
        v3dlpViolationSignalResponse,
        v3dlpViolationSignalResponse.addViolationsItem(new V3DLPViolationSignal()));
  }

  /**
   * Test {@link V3DLPViolationSignalResponse#equals(Object)}, and {@link
   * V3DLPViolationSignalResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3DLPViolationSignalResponse#equals(Object)}
   *   <li>{@link V3DLPViolationSignalResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPViolationSignalResponse.equals(Object)",
    "int V3DLPViolationSignalResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V3DLPViolationSignalResponse v3dlpViolationSignalResponse = new V3DLPViolationSignalResponse();
    V3DLPViolationSignalResponse v3dlpViolationSignalResponse2 = new V3DLPViolationSignalResponse();

    // Act and Assert
    assertEquals(v3dlpViolationSignalResponse, v3dlpViolationSignalResponse2);
    int expectedHashCodeResult = v3dlpViolationSignalResponse.hashCode();
    assertEquals(expectedHashCodeResult, v3dlpViolationSignalResponse2.hashCode());
  }

  /**
   * Test {@link V3DLPViolationSignalResponse#equals(Object)}, and {@link
   * V3DLPViolationSignalResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3DLPViolationSignalResponse#equals(Object)}
   *   <li>{@link V3DLPViolationSignalResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPViolationSignalResponse.equals(Object)",
    "int V3DLPViolationSignalResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V3DLPViolationSignalResponse v3dlpViolationSignalResponse = new V3DLPViolationSignalResponse();

    // Act and Assert
    assertEquals(v3dlpViolationSignalResponse, v3dlpViolationSignalResponse);
    int expectedHashCodeResult = v3dlpViolationSignalResponse.hashCode();
    assertEquals(expectedHashCodeResult, v3dlpViolationSignalResponse.hashCode());
  }

  /**
   * Test {@link V3DLPViolationSignalResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPViolationSignalResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPViolationSignalResponse.equals(Object)",
    "int V3DLPViolationSignalResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V3DLPViolationSignalResponse v3dlpViolationSignalResponse = new V3DLPViolationSignalResponse();
    v3dlpViolationSignalResponse.addViolationsItem(new V3DLPViolationSignal());

    // Act and Assert
    assertNotEquals(v3dlpViolationSignalResponse, new V3DLPViolationSignalResponse());
  }

  /**
   * Test {@link V3DLPViolationSignalResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPViolationSignalResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPViolationSignalResponse.equals(Object)",
    "int V3DLPViolationSignalResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V3DLPViolationSignalResponse v3dlpViolationSignalResponse = new V3DLPViolationSignalResponse();
    v3dlpViolationSignalResponse.nextOffset("Next Offset");

    // Act and Assert
    assertNotEquals(v3dlpViolationSignalResponse, new V3DLPViolationSignalResponse());
  }

  /**
   * Test {@link V3DLPViolationSignalResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPViolationSignalResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPViolationSignalResponse.equals(Object)",
    "int V3DLPViolationSignalResponse.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPViolationSignalResponse(), null);
  }

  /**
   * Test {@link V3DLPViolationSignalResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPViolationSignalResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPViolationSignalResponse.equals(Object)",
    "int V3DLPViolationSignalResponse.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new V3DLPViolationSignalResponse(), "Different type to V3DLPViolationSignalResponse");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V3DLPViolationSignalResponse}
   *   <li>{@link V3DLPViolationSignalResponse#nextOffset(String)}
   *   <li>{@link V3DLPViolationSignalResponse#setNextOffset(String)}
   *   <li>{@link V3DLPViolationSignalResponse#setViolations(List)}
   *   <li>{@link V3DLPViolationSignalResponse#violations(List)}
   *   <li>{@link V3DLPViolationSignalResponse#toString()}
   *   <li>{@link V3DLPViolationSignalResponse#getNextOffset()}
   *   <li>{@link V3DLPViolationSignalResponse#getViolations()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V3DLPViolationSignalResponse.<init>()",
    "String V3DLPViolationSignalResponse.getNextOffset()",
    "List V3DLPViolationSignalResponse.getViolations()",
    "V3DLPViolationSignalResponse V3DLPViolationSignalResponse.nextOffset(String)",
    "void V3DLPViolationSignalResponse.setNextOffset(String)",
    "void V3DLPViolationSignalResponse.setViolations(List)",
    "String V3DLPViolationSignalResponse.toString()",
    "V3DLPViolationSignalResponse V3DLPViolationSignalResponse.violations(List)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V3DLPViolationSignalResponse actualV3dlpViolationSignalResponse =
        new V3DLPViolationSignalResponse();
    V3DLPViolationSignalResponse actualNextOffsetResult =
        actualV3dlpViolationSignalResponse.nextOffset("Next Offset");
    actualV3dlpViolationSignalResponse.setNextOffset("Next Offset");
    actualV3dlpViolationSignalResponse.setViolations(new ArrayList<>());
    ArrayList<V3DLPViolationSignal> violations = new ArrayList<>();
    V3DLPViolationSignalResponse actualViolationsResult =
        actualV3dlpViolationSignalResponse.violations(violations);
    String actualToStringResult = actualV3dlpViolationSignalResponse.toString();
    String actualNextOffset = actualV3dlpViolationSignalResponse.getNextOffset();
    List<V3DLPViolationSignal> actualViolations =
        actualV3dlpViolationSignalResponse.getViolations();

    // Assert
    assertEquals("Next Offset", actualNextOffset);
    assertEquals(
        "class V3DLPViolationSignalResponse {\n    violations: []\n    nextOffset: Next Offset\n}",
        actualToStringResult);
    assertTrue(actualViolations.isEmpty());
    assertSame(actualV3dlpViolationSignalResponse, actualNextOffsetResult);
    assertSame(actualV3dlpViolationSignalResponse, actualViolationsResult);
    assertSame(violations, actualViolations);
  }
}
