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

class V3DLPViolationMessageResponseDiffblueTest {
  /**
   * Test {@link V3DLPViolationMessageResponse#addViolationsItem(V3DLPViolationMessage)}.
   *
   * <p>Method under test: {@link
   * V3DLPViolationMessageResponse#addViolationsItem(V3DLPViolationMessage)}
   */
  @Test
  @DisplayName("Test addViolationsItem(V3DLPViolationMessage)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "V3DLPViolationMessageResponse V3DLPViolationMessageResponse.addViolationsItem(V3DLPViolationMessage)"
  })
  void testAddViolationsItem() {
    // Arrange
    V3DLPViolationMessageResponse v3dlpViolationMessageResponse =
        new V3DLPViolationMessageResponse();

    // Act and Assert
    assertSame(
        v3dlpViolationMessageResponse,
        v3dlpViolationMessageResponse.addViolationsItem(new V3DLPViolationMessage()));
  }

  /**
   * Test {@link V3DLPViolationMessageResponse#equals(Object)}, and {@link
   * V3DLPViolationMessageResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3DLPViolationMessageResponse#equals(Object)}
   *   <li>{@link V3DLPViolationMessageResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPViolationMessageResponse.equals(Object)",
    "int V3DLPViolationMessageResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V3DLPViolationMessageResponse v3dlpViolationMessageResponse =
        new V3DLPViolationMessageResponse();
    V3DLPViolationMessageResponse v3dlpViolationMessageResponse2 =
        new V3DLPViolationMessageResponse();

    // Act and Assert
    assertEquals(v3dlpViolationMessageResponse, v3dlpViolationMessageResponse2);
    int expectedHashCodeResult = v3dlpViolationMessageResponse.hashCode();
    assertEquals(expectedHashCodeResult, v3dlpViolationMessageResponse2.hashCode());
  }

  /**
   * Test {@link V3DLPViolationMessageResponse#equals(Object)}, and {@link
   * V3DLPViolationMessageResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3DLPViolationMessageResponse#equals(Object)}
   *   <li>{@link V3DLPViolationMessageResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPViolationMessageResponse.equals(Object)",
    "int V3DLPViolationMessageResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V3DLPViolationMessageResponse v3dlpViolationMessageResponse =
        new V3DLPViolationMessageResponse();

    // Act and Assert
    assertEquals(v3dlpViolationMessageResponse, v3dlpViolationMessageResponse);
    int expectedHashCodeResult = v3dlpViolationMessageResponse.hashCode();
    assertEquals(expectedHashCodeResult, v3dlpViolationMessageResponse.hashCode());
  }

  /**
   * Test {@link V3DLPViolationMessageResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPViolationMessageResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPViolationMessageResponse.equals(Object)",
    "int V3DLPViolationMessageResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V3DLPViolationMessageResponse v3dlpViolationMessageResponse =
        new V3DLPViolationMessageResponse();
    v3dlpViolationMessageResponse.addViolationsItem(new V3DLPViolationMessage());

    // Act and Assert
    assertNotEquals(v3dlpViolationMessageResponse, new V3DLPViolationMessageResponse());
  }

  /**
   * Test {@link V3DLPViolationMessageResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPViolationMessageResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPViolationMessageResponse.equals(Object)",
    "int V3DLPViolationMessageResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V3DLPViolationMessageResponse v3dlpViolationMessageResponse =
        new V3DLPViolationMessageResponse();
    v3dlpViolationMessageResponse.nextOffset("Next Offset");

    // Act and Assert
    assertNotEquals(v3dlpViolationMessageResponse, new V3DLPViolationMessageResponse());
  }

  /**
   * Test {@link V3DLPViolationMessageResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPViolationMessageResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPViolationMessageResponse.equals(Object)",
    "int V3DLPViolationMessageResponse.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPViolationMessageResponse(), null);
  }

  /**
   * Test {@link V3DLPViolationMessageResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPViolationMessageResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPViolationMessageResponse.equals(Object)",
    "int V3DLPViolationMessageResponse.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new V3DLPViolationMessageResponse(), "Different type to V3DLPViolationMessageResponse");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V3DLPViolationMessageResponse}
   *   <li>{@link V3DLPViolationMessageResponse#nextOffset(String)}
   *   <li>{@link V3DLPViolationMessageResponse#setNextOffset(String)}
   *   <li>{@link V3DLPViolationMessageResponse#setViolations(List)}
   *   <li>{@link V3DLPViolationMessageResponse#violations(List)}
   *   <li>{@link V3DLPViolationMessageResponse#toString()}
   *   <li>{@link V3DLPViolationMessageResponse#getNextOffset()}
   *   <li>{@link V3DLPViolationMessageResponse#getViolations()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V3DLPViolationMessageResponse.<init>()",
    "String V3DLPViolationMessageResponse.getNextOffset()",
    "List V3DLPViolationMessageResponse.getViolations()",
    "V3DLPViolationMessageResponse V3DLPViolationMessageResponse.nextOffset(String)",
    "void V3DLPViolationMessageResponse.setNextOffset(String)",
    "void V3DLPViolationMessageResponse.setViolations(List)",
    "String V3DLPViolationMessageResponse.toString()",
    "V3DLPViolationMessageResponse V3DLPViolationMessageResponse.violations(List)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V3DLPViolationMessageResponse actualV3dlpViolationMessageResponse =
        new V3DLPViolationMessageResponse();
    V3DLPViolationMessageResponse actualNextOffsetResult =
        actualV3dlpViolationMessageResponse.nextOffset("Next Offset");
    actualV3dlpViolationMessageResponse.setNextOffset("Next Offset");
    actualV3dlpViolationMessageResponse.setViolations(new ArrayList<>());
    ArrayList<V3DLPViolationMessage> violations = new ArrayList<>();
    V3DLPViolationMessageResponse actualViolationsResult =
        actualV3dlpViolationMessageResponse.violations(violations);
    String actualToStringResult = actualV3dlpViolationMessageResponse.toString();
    String actualNextOffset = actualV3dlpViolationMessageResponse.getNextOffset();
    List<V3DLPViolationMessage> actualViolations =
        actualV3dlpViolationMessageResponse.getViolations();

    // Assert
    assertEquals("Next Offset", actualNextOffset);
    assertEquals(
        "class V3DLPViolationMessageResponse {\n    violations: []\n    nextOffset: Next Offset\n}",
        actualToStringResult);
    assertTrue(actualViolations.isEmpty());
    assertSame(actualV3dlpViolationMessageResponse, actualNextOffsetResult);
    assertSame(actualV3dlpViolationMessageResponse, actualViolationsResult);
    assertSame(violations, actualViolations);
  }
}
