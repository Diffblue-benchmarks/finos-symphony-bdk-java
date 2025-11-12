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

class V1DLPViolationMessageResponseDiffblueTest {
  /**
   * Test {@link V1DLPViolationMessageResponse#addViolationsItem(V1DLPViolationMessage)}.
   *
   * <p>Method under test: {@link
   * V1DLPViolationMessageResponse#addViolationsItem(V1DLPViolationMessage)}
   */
  @Test
  @DisplayName("Test addViolationsItem(V1DLPViolationMessage)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "V1DLPViolationMessageResponse V1DLPViolationMessageResponse.addViolationsItem(V1DLPViolationMessage)"
  })
  void testAddViolationsItem() {
    // Arrange
    V1DLPViolationMessageResponse v1dlpViolationMessageResponse =
        new V1DLPViolationMessageResponse();

    // Act
    V1DLPViolationMessageResponse actualAddViolationsItemResult =
        v1dlpViolationMessageResponse.addViolationsItem(new V1DLPViolationMessage());

    // Assert
    assertSame(v1dlpViolationMessageResponse, actualAddViolationsItemResult);
  }

  /**
   * Test {@link V1DLPViolationMessageResponse#equals(Object)}, and {@link
   * V1DLPViolationMessageResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V1DLPViolationMessageResponse#equals(Object)}
   *   <li>{@link V1DLPViolationMessageResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPViolationMessageResponse.equals(Object)",
    "int V1DLPViolationMessageResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V1DLPViolationMessageResponse v1dlpViolationMessageResponse =
        new V1DLPViolationMessageResponse();
    V1DLPViolationMessageResponse v1dlpViolationMessageResponse2 =
        new V1DLPViolationMessageResponse();

    // Act and Assert
    assertEquals(v1dlpViolationMessageResponse, v1dlpViolationMessageResponse2);
    assertEquals(
        v1dlpViolationMessageResponse.hashCode(), v1dlpViolationMessageResponse2.hashCode());
  }

  /**
   * Test {@link V1DLPViolationMessageResponse#equals(Object)}, and {@link
   * V1DLPViolationMessageResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V1DLPViolationMessageResponse#equals(Object)}
   *   <li>{@link V1DLPViolationMessageResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPViolationMessageResponse.equals(Object)",
    "int V1DLPViolationMessageResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V1DLPViolationMessageResponse v1dlpViolationMessageResponse =
        new V1DLPViolationMessageResponse();

    // Act and Assert
    assertEquals(v1dlpViolationMessageResponse, v1dlpViolationMessageResponse);
    int expectedHashCodeResult = v1dlpViolationMessageResponse.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpViolationMessageResponse.hashCode());
  }

  /**
   * Test {@link V1DLPViolationMessageResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPViolationMessageResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPViolationMessageResponse.equals(Object)",
    "int V1DLPViolationMessageResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V1DLPViolationMessageResponse v1dlpViolationMessageResponse =
        new V1DLPViolationMessageResponse();
    v1dlpViolationMessageResponse.addViolationsItem(new V1DLPViolationMessage());

    // Act and Assert
    assertNotEquals(v1dlpViolationMessageResponse, new V1DLPViolationMessageResponse());
  }

  /**
   * Test {@link V1DLPViolationMessageResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPViolationMessageResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPViolationMessageResponse.equals(Object)",
    "int V1DLPViolationMessageResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V1DLPViolationMessageResponse v1dlpViolationMessageResponse =
        new V1DLPViolationMessageResponse();
    v1dlpViolationMessageResponse.nextOffset("Next Offset");

    // Act and Assert
    assertNotEquals(v1dlpViolationMessageResponse, new V1DLPViolationMessageResponse());
  }

  /**
   * Test {@link V1DLPViolationMessageResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPViolationMessageResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPViolationMessageResponse.equals(Object)",
    "int V1DLPViolationMessageResponse.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPViolationMessageResponse(), null);
  }

  /**
   * Test {@link V1DLPViolationMessageResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPViolationMessageResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPViolationMessageResponse.equals(Object)",
    "int V1DLPViolationMessageResponse.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new V1DLPViolationMessageResponse(), "Different type to V1DLPViolationMessageResponse");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V1DLPViolationMessageResponse}
   *   <li>{@link V1DLPViolationMessageResponse#nextOffset(String)}
   *   <li>{@link V1DLPViolationMessageResponse#setNextOffset(String)}
   *   <li>{@link V1DLPViolationMessageResponse#setViolations(List)}
   *   <li>{@link V1DLPViolationMessageResponse#violations(List)}
   *   <li>{@link V1DLPViolationMessageResponse#toString()}
   *   <li>{@link V1DLPViolationMessageResponse#getNextOffset()}
   *   <li>{@link V1DLPViolationMessageResponse#getViolations()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V1DLPViolationMessageResponse.<init>()",
    "String V1DLPViolationMessageResponse.getNextOffset()",
    "List V1DLPViolationMessageResponse.getViolations()",
    "V1DLPViolationMessageResponse V1DLPViolationMessageResponse.nextOffset(String)",
    "void V1DLPViolationMessageResponse.setNextOffset(String)",
    "void V1DLPViolationMessageResponse.setViolations(List)",
    "String V1DLPViolationMessageResponse.toString()",
    "V1DLPViolationMessageResponse V1DLPViolationMessageResponse.violations(List)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V1DLPViolationMessageResponse actualV1dlpViolationMessageResponse =
        new V1DLPViolationMessageResponse();
    V1DLPViolationMessageResponse actualNextOffsetResult =
        actualV1dlpViolationMessageResponse.nextOffset("Next Offset");
    actualV1dlpViolationMessageResponse.setNextOffset("Next Offset");
    actualV1dlpViolationMessageResponse.setViolations(new ArrayList<>());
    ArrayList<V1DLPViolationMessage> violations = new ArrayList<>();
    V1DLPViolationMessageResponse actualViolationsResult =
        actualV1dlpViolationMessageResponse.violations(violations);
    String actualToStringResult = actualV1dlpViolationMessageResponse.toString();
    String actualNextOffset = actualV1dlpViolationMessageResponse.getNextOffset();
    List<V1DLPViolationMessage> actualViolations =
        actualV1dlpViolationMessageResponse.getViolations();

    // Assert
    assertEquals("Next Offset", actualNextOffset);
    assertEquals(
        "class V1DLPViolationMessageResponse {\n    violations: []\n    nextOffset: Next Offset\n}",
        actualToStringResult);
    assertTrue(actualViolations.isEmpty());
    assertSame(actualV1dlpViolationMessageResponse, actualNextOffsetResult);
    assertSame(actualV1dlpViolationMessageResponse, actualViolationsResult);
    assertSame(violations, actualViolations);
  }
}
