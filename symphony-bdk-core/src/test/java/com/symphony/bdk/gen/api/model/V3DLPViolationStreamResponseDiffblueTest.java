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

class V3DLPViolationStreamResponseDiffblueTest {
  /**
   * Test {@link V3DLPViolationStreamResponse#addViolationsItem(V3DLPViolationStream)}.
   *
   * <p>Method under test: {@link
   * V3DLPViolationStreamResponse#addViolationsItem(V3DLPViolationStream)}
   */
  @Test
  @DisplayName("Test addViolationsItem(V3DLPViolationStream)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "V3DLPViolationStreamResponse V3DLPViolationStreamResponse.addViolationsItem(V3DLPViolationStream)"
  })
  void testAddViolationsItem() {
    // Arrange
    V3DLPViolationStreamResponse v3dlpViolationStreamResponse = new V3DLPViolationStreamResponse();

    // Act and Assert
    assertSame(
        v3dlpViolationStreamResponse,
        v3dlpViolationStreamResponse.addViolationsItem(new V3DLPViolationStream()));
  }

  /**
   * Test {@link V3DLPViolationStreamResponse#equals(Object)}, and {@link
   * V3DLPViolationStreamResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3DLPViolationStreamResponse#equals(Object)}
   *   <li>{@link V3DLPViolationStreamResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPViolationStreamResponse.equals(Object)",
    "int V3DLPViolationStreamResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V3DLPViolationStreamResponse v3dlpViolationStreamResponse = new V3DLPViolationStreamResponse();
    V3DLPViolationStreamResponse v3dlpViolationStreamResponse2 = new V3DLPViolationStreamResponse();

    // Act and Assert
    assertEquals(v3dlpViolationStreamResponse, v3dlpViolationStreamResponse2);
    int expectedHashCodeResult = v3dlpViolationStreamResponse.hashCode();
    assertEquals(expectedHashCodeResult, v3dlpViolationStreamResponse2.hashCode());
  }

  /**
   * Test {@link V3DLPViolationStreamResponse#equals(Object)}, and {@link
   * V3DLPViolationStreamResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3DLPViolationStreamResponse#equals(Object)}
   *   <li>{@link V3DLPViolationStreamResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPViolationStreamResponse.equals(Object)",
    "int V3DLPViolationStreamResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V3DLPViolationStreamResponse v3dlpViolationStreamResponse = new V3DLPViolationStreamResponse();

    // Act and Assert
    assertEquals(v3dlpViolationStreamResponse, v3dlpViolationStreamResponse);
    int expectedHashCodeResult = v3dlpViolationStreamResponse.hashCode();
    assertEquals(expectedHashCodeResult, v3dlpViolationStreamResponse.hashCode());
  }

  /**
   * Test {@link V3DLPViolationStreamResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPViolationStreamResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPViolationStreamResponse.equals(Object)",
    "int V3DLPViolationStreamResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V3DLPViolationStreamResponse v3dlpViolationStreamResponse = new V3DLPViolationStreamResponse();
    v3dlpViolationStreamResponse.addViolationsItem(new V3DLPViolationStream());

    // Act and Assert
    assertNotEquals(v3dlpViolationStreamResponse, new V3DLPViolationStreamResponse());
  }

  /**
   * Test {@link V3DLPViolationStreamResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPViolationStreamResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPViolationStreamResponse.equals(Object)",
    "int V3DLPViolationStreamResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V3DLPViolationStreamResponse v3dlpViolationStreamResponse = new V3DLPViolationStreamResponse();
    v3dlpViolationStreamResponse.nextOffset("Next Offset");

    // Act and Assert
    assertNotEquals(v3dlpViolationStreamResponse, new V3DLPViolationStreamResponse());
  }

  /**
   * Test {@link V3DLPViolationStreamResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPViolationStreamResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPViolationStreamResponse.equals(Object)",
    "int V3DLPViolationStreamResponse.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPViolationStreamResponse(), null);
  }

  /**
   * Test {@link V3DLPViolationStreamResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPViolationStreamResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPViolationStreamResponse.equals(Object)",
    "int V3DLPViolationStreamResponse.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new V3DLPViolationStreamResponse(), "Different type to V3DLPViolationStreamResponse");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V3DLPViolationStreamResponse}
   *   <li>{@link V3DLPViolationStreamResponse#nextOffset(String)}
   *   <li>{@link V3DLPViolationStreamResponse#setNextOffset(String)}
   *   <li>{@link V3DLPViolationStreamResponse#setViolations(List)}
   *   <li>{@link V3DLPViolationStreamResponse#violations(List)}
   *   <li>{@link V3DLPViolationStreamResponse#toString()}
   *   <li>{@link V3DLPViolationStreamResponse#getNextOffset()}
   *   <li>{@link V3DLPViolationStreamResponse#getViolations()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V3DLPViolationStreamResponse.<init>()",
    "String V3DLPViolationStreamResponse.getNextOffset()",
    "List V3DLPViolationStreamResponse.getViolations()",
    "V3DLPViolationStreamResponse V3DLPViolationStreamResponse.nextOffset(String)",
    "void V3DLPViolationStreamResponse.setNextOffset(String)",
    "void V3DLPViolationStreamResponse.setViolations(List)",
    "String V3DLPViolationStreamResponse.toString()",
    "V3DLPViolationStreamResponse V3DLPViolationStreamResponse.violations(List)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V3DLPViolationStreamResponse actualV3dlpViolationStreamResponse =
        new V3DLPViolationStreamResponse();
    V3DLPViolationStreamResponse actualNextOffsetResult =
        actualV3dlpViolationStreamResponse.nextOffset("Next Offset");
    actualV3dlpViolationStreamResponse.setNextOffset("Next Offset");
    actualV3dlpViolationStreamResponse.setViolations(new ArrayList<>());
    ArrayList<V3DLPViolationStream> violations = new ArrayList<>();
    V3DLPViolationStreamResponse actualViolationsResult =
        actualV3dlpViolationStreamResponse.violations(violations);
    String actualToStringResult = actualV3dlpViolationStreamResponse.toString();
    String actualNextOffset = actualV3dlpViolationStreamResponse.getNextOffset();
    List<V3DLPViolationStream> actualViolations =
        actualV3dlpViolationStreamResponse.getViolations();

    // Assert
    assertEquals("Next Offset", actualNextOffset);
    assertEquals(
        "class V3DLPViolationStreamResponse {\n    violations: []\n    nextOffset: Next Offset\n}",
        actualToStringResult);
    assertTrue(actualViolations.isEmpty());
    assertSame(actualV3dlpViolationStreamResponse, actualNextOffsetResult);
    assertSame(actualV3dlpViolationStreamResponse, actualViolationsResult);
    assertSame(violations, actualViolations);
  }
}
