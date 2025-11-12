package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V1DLPMatchedPolicyDiffblueTest {
  /**
   * Test {@link V1DLPMatchedPolicy#equals(Object)}, and {@link V1DLPMatchedPolicy#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V1DLPMatchedPolicy#equals(Object)}
   *   <li>{@link V1DLPMatchedPolicy#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPMatchedPolicy.equals(Object)",
    "int V1DLPMatchedPolicy.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V1DLPMatchedPolicy v1dlpMatchedPolicy = new V1DLPMatchedPolicy();
    V1DLPMatchedPolicy v1dlpMatchedPolicy2 = new V1DLPMatchedPolicy();

    // Act and Assert
    assertEquals(v1dlpMatchedPolicy, v1dlpMatchedPolicy2);
    assertEquals(v1dlpMatchedPolicy.hashCode(), v1dlpMatchedPolicy2.hashCode());
  }

  /**
   * Test {@link V1DLPMatchedPolicy#equals(Object)}, and {@link V1DLPMatchedPolicy#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V1DLPMatchedPolicy#equals(Object)}
   *   <li>{@link V1DLPMatchedPolicy#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPMatchedPolicy.equals(Object)",
    "int V1DLPMatchedPolicy.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V1DLPMatchedPolicy v1dlpMatchedPolicy = new V1DLPMatchedPolicy();

    // Act and Assert
    assertEquals(v1dlpMatchedPolicy, v1dlpMatchedPolicy);
    int expectedHashCodeResult = v1dlpMatchedPolicy.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpMatchedPolicy.hashCode());
  }

  /**
   * Test {@link V1DLPMatchedPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPMatchedPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPMatchedPolicy.equals(Object)",
    "int V1DLPMatchedPolicy.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPMatchedPolicy(), 1);
  }

  /**
   * Test {@link V1DLPMatchedPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPMatchedPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPMatchedPolicy.equals(Object)",
    "int V1DLPMatchedPolicy.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V1DLPMatchedPolicy v1dlpMatchedPolicy = new V1DLPMatchedPolicy();
    v1dlpMatchedPolicy.id("42");

    // Act and Assert
    assertNotEquals(v1dlpMatchedPolicy, new V1DLPMatchedPolicy());
  }

  /**
   * Test {@link V1DLPMatchedPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPMatchedPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPMatchedPolicy.equals(Object)",
    "int V1DLPMatchedPolicy.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V1DLPMatchedPolicy v1dlpMatchedPolicy = new V1DLPMatchedPolicy();
    v1dlpMatchedPolicy.version("1.0.2");

    // Act and Assert
    assertNotEquals(v1dlpMatchedPolicy, new V1DLPMatchedPolicy());
  }

  /**
   * Test {@link V1DLPMatchedPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPMatchedPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPMatchedPolicy.equals(Object)",
    "int V1DLPMatchedPolicy.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V1DLPMatchedPolicy v1dlpMatchedPolicy = new V1DLPMatchedPolicy();
    v1dlpMatchedPolicy.policyName("Policy Name");

    // Act and Assert
    assertNotEquals(v1dlpMatchedPolicy, new V1DLPMatchedPolicy());
  }

  /**
   * Test {@link V1DLPMatchedPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPMatchedPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPMatchedPolicy.equals(Object)",
    "int V1DLPMatchedPolicy.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V1DLPMatchedPolicy v1dlpMatchedPolicy = new V1DLPMatchedPolicy();
    v1dlpMatchedPolicy.type("Type");

    // Act and Assert
    assertNotEquals(v1dlpMatchedPolicy, new V1DLPMatchedPolicy());
  }

  /**
   * Test {@link V1DLPMatchedPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPMatchedPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPMatchedPolicy.equals(Object)",
    "int V1DLPMatchedPolicy.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    V1DLPMatchedPolicy v1dlpMatchedPolicy = new V1DLPMatchedPolicy();
    v1dlpMatchedPolicy.terms("Terms");

    // Act and Assert
    assertNotEquals(v1dlpMatchedPolicy, new V1DLPMatchedPolicy());
  }

  /**
   * Test {@link V1DLPMatchedPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPMatchedPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPMatchedPolicy.equals(Object)",
    "int V1DLPMatchedPolicy.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    V1DLPMatchedPolicy v1dlpMatchedPolicy = new V1DLPMatchedPolicy();
    v1dlpMatchedPolicy.diagnostic("Diagnostic");

    // Act and Assert
    assertNotEquals(v1dlpMatchedPolicy, new V1DLPMatchedPolicy());
  }

  /**
   * Test {@link V1DLPMatchedPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPMatchedPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPMatchedPolicy.equals(Object)",
    "int V1DLPMatchedPolicy.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPMatchedPolicy(), null);
  }

  /**
   * Test {@link V1DLPMatchedPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPMatchedPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPMatchedPolicy.equals(Object)",
    "int V1DLPMatchedPolicy.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPMatchedPolicy(), "Different type to V1DLPMatchedPolicy");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V1DLPMatchedPolicy}
   *   <li>{@link V1DLPMatchedPolicy#diagnostic(String)}
   *   <li>{@link V1DLPMatchedPolicy#id(String)}
   *   <li>{@link V1DLPMatchedPolicy#policyName(String)}
   *   <li>{@link V1DLPMatchedPolicy#setDiagnostic(String)}
   *   <li>{@link V1DLPMatchedPolicy#setId(String)}
   *   <li>{@link V1DLPMatchedPolicy#setPolicyName(String)}
   *   <li>{@link V1DLPMatchedPolicy#setTerms(String)}
   *   <li>{@link V1DLPMatchedPolicy#setType(String)}
   *   <li>{@link V1DLPMatchedPolicy#setVersion(String)}
   *   <li>{@link V1DLPMatchedPolicy#terms(String)}
   *   <li>{@link V1DLPMatchedPolicy#type(String)}
   *   <li>{@link V1DLPMatchedPolicy#version(String)}
   *   <li>{@link V1DLPMatchedPolicy#toString()}
   *   <li>{@link V1DLPMatchedPolicy#getDiagnostic()}
   *   <li>{@link V1DLPMatchedPolicy#getId()}
   *   <li>{@link V1DLPMatchedPolicy#getPolicyName()}
   *   <li>{@link V1DLPMatchedPolicy#getTerms()}
   *   <li>{@link V1DLPMatchedPolicy#getType()}
   *   <li>{@link V1DLPMatchedPolicy#getVersion()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V1DLPMatchedPolicy.<init>()",
    "V1DLPMatchedPolicy V1DLPMatchedPolicy.diagnostic(String)",
    "String V1DLPMatchedPolicy.getDiagnostic()",
    "String V1DLPMatchedPolicy.getId()",
    "String V1DLPMatchedPolicy.getPolicyName()",
    "String V1DLPMatchedPolicy.getTerms()",
    "String V1DLPMatchedPolicy.getType()",
    "String V1DLPMatchedPolicy.getVersion()",
    "V1DLPMatchedPolicy V1DLPMatchedPolicy.id(String)",
    "V1DLPMatchedPolicy V1DLPMatchedPolicy.policyName(String)",
    "void V1DLPMatchedPolicy.setDiagnostic(String)",
    "void V1DLPMatchedPolicy.setId(String)",
    "void V1DLPMatchedPolicy.setPolicyName(String)",
    "void V1DLPMatchedPolicy.setTerms(String)",
    "void V1DLPMatchedPolicy.setType(String)",
    "void V1DLPMatchedPolicy.setVersion(String)",
    "V1DLPMatchedPolicy V1DLPMatchedPolicy.terms(String)",
    "String V1DLPMatchedPolicy.toString()",
    "V1DLPMatchedPolicy V1DLPMatchedPolicy.type(String)",
    "V1DLPMatchedPolicy V1DLPMatchedPolicy.version(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V1DLPMatchedPolicy actualV1dlpMatchedPolicy = new V1DLPMatchedPolicy();
    V1DLPMatchedPolicy actualDiagnosticResult = actualV1dlpMatchedPolicy.diagnostic("Diagnostic");
    V1DLPMatchedPolicy actualIdResult = actualV1dlpMatchedPolicy.id("42");
    V1DLPMatchedPolicy actualPolicyNameResult = actualV1dlpMatchedPolicy.policyName("Policy Name");
    actualV1dlpMatchedPolicy.setDiagnostic("Diagnostic");
    actualV1dlpMatchedPolicy.setId("42");
    actualV1dlpMatchedPolicy.setPolicyName("Policy Name");
    actualV1dlpMatchedPolicy.setTerms("Terms");
    actualV1dlpMatchedPolicy.setType("Type");
    actualV1dlpMatchedPolicy.setVersion("1.0.2");
    V1DLPMatchedPolicy actualTermsResult = actualV1dlpMatchedPolicy.terms("Terms");
    V1DLPMatchedPolicy actualTypeResult = actualV1dlpMatchedPolicy.type("Type");
    V1DLPMatchedPolicy actualVersionResult = actualV1dlpMatchedPolicy.version("1.0.2");
    String actualToStringResult = actualV1dlpMatchedPolicy.toString();
    String actualDiagnostic = actualV1dlpMatchedPolicy.getDiagnostic();
    String actualId = actualV1dlpMatchedPolicy.getId();
    String actualPolicyName = actualV1dlpMatchedPolicy.getPolicyName();
    String actualTerms = actualV1dlpMatchedPolicy.getTerms();
    String actualType = actualV1dlpMatchedPolicy.getType();

    // Assert
    assertEquals("1.0.2", actualV1dlpMatchedPolicy.getVersion());
    assertEquals("42", actualId);
    assertEquals("Diagnostic", actualDiagnostic);
    assertEquals("Policy Name", actualPolicyName);
    assertEquals("Terms", actualTerms);
    assertEquals("Type", actualType);
    assertEquals(
        "class V1DLPMatchedPolicy {\n"
            + "    id: 42\n"
            + "    version: 1.0.2\n"
            + "    policyName: Policy Name\n"
            + "    type: Type\n"
            + "    terms: Terms\n"
            + "    diagnostic: Diagnostic\n"
            + "}",
        actualToStringResult);
    assertSame(actualV1dlpMatchedPolicy, actualDiagnosticResult);
    assertSame(actualV1dlpMatchedPolicy, actualIdResult);
    assertSame(actualV1dlpMatchedPolicy, actualPolicyNameResult);
    assertSame(actualV1dlpMatchedPolicy, actualTermsResult);
    assertSame(actualV1dlpMatchedPolicy, actualTypeResult);
    assertSame(actualV1dlpMatchedPolicy, actualVersionResult);
  }
}
