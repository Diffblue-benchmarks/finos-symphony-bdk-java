package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V1DLPSignalDiffblueTest {
  /**
   * Test {@link V1DLPSignal#equals(Object)}, and {@link V1DLPSignal#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V1DLPSignal#equals(Object)}
   *   <li>{@link V1DLPSignal#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPSignal.equals(Object)", "int V1DLPSignal.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V1DLPSignal v1dlpSignal = new V1DLPSignal();
    V1DLPSignal v1dlpSignal2 = new V1DLPSignal();

    // Act and Assert
    assertEquals(v1dlpSignal, v1dlpSignal2);
    int expectedHashCodeResult = v1dlpSignal.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpSignal2.hashCode());
  }

  /**
   * Test {@link V1DLPSignal#equals(Object)}, and {@link V1DLPSignal#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V1DLPSignal#equals(Object)}
   *   <li>{@link V1DLPSignal#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPSignal.equals(Object)", "int V1DLPSignal.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V1DLPSignal v1dlpSignal = new V1DLPSignal();

    // Act and Assert
    assertEquals(v1dlpSignal, v1dlpSignal);
    int expectedHashCodeResult = v1dlpSignal.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpSignal.hashCode());
  }

  /**
   * Test {@link V1DLPSignal#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPSignal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPSignal.equals(Object)", "int V1DLPSignal.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPSignal(), 1);
  }

  /**
   * Test {@link V1DLPSignal#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPSignal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPSignal.equals(Object)", "int V1DLPSignal.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V1DLPSignal v1dlpSignal = new V1DLPSignal();
    v1dlpSignal.id("42");

    // Act and Assert
    assertNotEquals(v1dlpSignal, new V1DLPSignal());
  }

  /**
   * Test {@link V1DLPSignal#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPSignal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPSignal.equals(Object)", "int V1DLPSignal.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V1DLPSignal v1dlpSignal = new V1DLPSignal();
    v1dlpSignal.name("Name");

    // Act and Assert
    assertNotEquals(v1dlpSignal, new V1DLPSignal());
  }

  /**
   * Test {@link V1DLPSignal#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPSignal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPSignal.equals(Object)", "int V1DLPSignal.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V1DLPSignal v1dlpSignal = new V1DLPSignal();
    v1dlpSignal.rules("Rules");

    // Act and Assert
    assertNotEquals(v1dlpSignal, new V1DLPSignal());
  }

  /**
   * Test {@link V1DLPSignal#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPSignal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPSignal.equals(Object)", "int V1DLPSignal.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V1DLPSignal v1dlpSignal = new V1DLPSignal();
    v1dlpSignal.diagnostic("Diagnostic");

    // Act and Assert
    assertNotEquals(v1dlpSignal, new V1DLPSignal());
  }

  /**
   * Test {@link V1DLPSignal#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPSignal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPSignal.equals(Object)", "int V1DLPSignal.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPSignal(), null);
  }

  /**
   * Test {@link V1DLPSignal#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPSignal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPSignal.equals(Object)", "int V1DLPSignal.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPSignal(), "Different type to V1DLPSignal");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V1DLPSignal}
   *   <li>{@link V1DLPSignal#diagnostic(String)}
   *   <li>{@link V1DLPSignal#id(String)}
   *   <li>{@link V1DLPSignal#name(String)}
   *   <li>{@link V1DLPSignal#rules(String)}
   *   <li>{@link V1DLPSignal#setDiagnostic(String)}
   *   <li>{@link V1DLPSignal#setId(String)}
   *   <li>{@link V1DLPSignal#setName(String)}
   *   <li>{@link V1DLPSignal#setRules(String)}
   *   <li>{@link V1DLPSignal#toString()}
   *   <li>{@link V1DLPSignal#getDiagnostic()}
   *   <li>{@link V1DLPSignal#getId()}
   *   <li>{@link V1DLPSignal#getName()}
   *   <li>{@link V1DLPSignal#getRules()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V1DLPSignal.<init>()",
    "V1DLPSignal V1DLPSignal.diagnostic(String)",
    "String V1DLPSignal.getDiagnostic()",
    "String V1DLPSignal.getId()",
    "String V1DLPSignal.getName()",
    "String V1DLPSignal.getRules()",
    "V1DLPSignal V1DLPSignal.id(String)",
    "V1DLPSignal V1DLPSignal.name(String)",
    "V1DLPSignal V1DLPSignal.rules(String)",
    "void V1DLPSignal.setDiagnostic(String)",
    "void V1DLPSignal.setId(String)",
    "void V1DLPSignal.setName(String)",
    "void V1DLPSignal.setRules(String)",
    "String V1DLPSignal.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V1DLPSignal actualV1dlpSignal = new V1DLPSignal();
    V1DLPSignal actualDiagnosticResult = actualV1dlpSignal.diagnostic("Diagnostic");
    V1DLPSignal actualIdResult = actualV1dlpSignal.id("42");
    V1DLPSignal actualNameResult = actualV1dlpSignal.name("Name");
    V1DLPSignal actualRulesResult = actualV1dlpSignal.rules("Rules");
    actualV1dlpSignal.setDiagnostic("Diagnostic");
    actualV1dlpSignal.setId("42");
    actualV1dlpSignal.setName("Name");
    actualV1dlpSignal.setRules("Rules");
    String actualToStringResult = actualV1dlpSignal.toString();
    String actualDiagnostic = actualV1dlpSignal.getDiagnostic();
    String actualId = actualV1dlpSignal.getId();
    String actualName = actualV1dlpSignal.getName();

    // Assert
    assertEquals("42", actualId);
    assertEquals("Diagnostic", actualDiagnostic);
    assertEquals("Name", actualName);
    assertEquals("Rules", actualV1dlpSignal.getRules());
    assertEquals(
        "class V1DLPSignal {\n    id: 42\n    name: Name\n    rules: Rules\n    diagnostic: Diagnostic\n}",
        actualToStringResult);
    assertSame(actualV1dlpSignal, actualDiagnosticResult);
    assertSame(actualV1dlpSignal, actualIdResult);
    assertSame(actualV1dlpSignal, actualNameResult);
    assertSame(actualV1dlpSignal, actualRulesResult);
  }
}
