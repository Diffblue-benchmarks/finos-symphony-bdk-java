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

class V3DLPPolicyRequestDiffblueTest {
  /**
   * Test {@link V3DLPPolicyRequest#addScopesItem(String)}.
   *
   * <p>Method under test: {@link V3DLPPolicyRequest#addScopesItem(String)}
   */
  @Test
  @DisplayName("Test addScopesItem(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V3DLPPolicyRequest V3DLPPolicyRequest.addScopesItem(String)"})
  void testAddScopesItem() {
    // Arrange
    V3DLPPolicyRequest v3dlpPolicyRequest = new V3DLPPolicyRequest();

    // Act
    V3DLPPolicyRequest actualAddScopesItemResult = v3dlpPolicyRequest.addScopesItem("Scopes Item");

    // Assert
    assertSame(v3dlpPolicyRequest, actualAddScopesItemResult);
  }

  /**
   * Test {@link V3DLPPolicyRequest#addAppliesToItem(V3DLPPolicyAppliesTo)}.
   *
   * <p>Method under test: {@link V3DLPPolicyRequest#addAppliesToItem(V3DLPPolicyAppliesTo)}
   */
  @Test
  @DisplayName("Test addAppliesToItem(V3DLPPolicyAppliesTo)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "V3DLPPolicyRequest V3DLPPolicyRequest.addAppliesToItem(V3DLPPolicyAppliesTo)"
  })
  void testAddAppliesToItem() {
    // Arrange
    V3DLPPolicyRequest v3dlpPolicyRequest = new V3DLPPolicyRequest();

    // Act
    V3DLPPolicyRequest actualAddAppliesToItemResult =
        v3dlpPolicyRequest.addAppliesToItem(new V3DLPPolicyAppliesTo());

    // Assert
    assertSame(v3dlpPolicyRequest, actualAddAppliesToItemResult);
  }

  /**
   * Test {@link V3DLPPolicyRequest#equals(Object)}, and {@link V3DLPPolicyRequest#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3DLPPolicyRequest#equals(Object)}
   *   <li>{@link V3DLPPolicyRequest#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPPolicyRequest.equals(Object)",
    "int V3DLPPolicyRequest.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V3DLPPolicyRequest v3dlpPolicyRequest = new V3DLPPolicyRequest();
    V3DLPPolicyRequest v3dlpPolicyRequest2 = new V3DLPPolicyRequest();

    // Act and Assert
    assertEquals(v3dlpPolicyRequest, v3dlpPolicyRequest2);
    assertEquals(v3dlpPolicyRequest.hashCode(), v3dlpPolicyRequest2.hashCode());
  }

  /**
   * Test {@link V3DLPPolicyRequest#equals(Object)}, and {@link V3DLPPolicyRequest#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3DLPPolicyRequest#equals(Object)}
   *   <li>{@link V3DLPPolicyRequest#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPPolicyRequest.equals(Object)",
    "int V3DLPPolicyRequest.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V3DLPPolicyRequest v3dlpPolicyRequest = new V3DLPPolicyRequest();

    // Act and Assert
    assertEquals(v3dlpPolicyRequest, v3dlpPolicyRequest);
    int expectedHashCodeResult = v3dlpPolicyRequest.hashCode();
    assertEquals(expectedHashCodeResult, v3dlpPolicyRequest.hashCode());
  }

  /**
   * Test {@link V3DLPPolicyRequest#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPPolicyRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPPolicyRequest.equals(Object)",
    "int V3DLPPolicyRequest.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V3DLPPolicyRequest v3dlpPolicyRequest = new V3DLPPolicyRequest();
    v3dlpPolicyRequest.addScopesItem("Scopes Item");

    // Act and Assert
    assertNotEquals(v3dlpPolicyRequest, new V3DLPPolicyRequest());
  }

  /**
   * Test {@link V3DLPPolicyRequest#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPPolicyRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPPolicyRequest.equals(Object)",
    "int V3DLPPolicyRequest.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V3DLPPolicyRequest v3dlpPolicyRequest = new V3DLPPolicyRequest();
    v3dlpPolicyRequest.name("Name");
    v3dlpPolicyRequest.addScopesItem("Scopes Item");

    // Act and Assert
    assertNotEquals(v3dlpPolicyRequest, new V3DLPPolicyRequest());
  }

  /**
   * Test {@link V3DLPPolicyRequest#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPPolicyRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPPolicyRequest.equals(Object)",
    "int V3DLPPolicyRequest.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V3DLPPolicyRequest v3dlpPolicyRequest = new V3DLPPolicyRequest();
    v3dlpPolicyRequest.addAppliesToItem(new V3DLPPolicyAppliesTo());

    // Act and Assert
    assertNotEquals(v3dlpPolicyRequest, new V3DLPPolicyRequest());
  }

  /**
   * Test {@link V3DLPPolicyRequest#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPPolicyRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPPolicyRequest.equals(Object)",
    "int V3DLPPolicyRequest.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPPolicyRequest(), null);
  }

  /**
   * Test {@link V3DLPPolicyRequest#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPPolicyRequest#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPPolicyRequest.equals(Object)",
    "int V3DLPPolicyRequest.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPPolicyRequest(), "Different type to V3DLPPolicyRequest");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V3DLPPolicyRequest}
   *   <li>{@link V3DLPPolicyRequest#appliesTo(List)}
   *   <li>{@link V3DLPPolicyRequest#name(String)}
   *   <li>{@link V3DLPPolicyRequest#scopes(List)}
   *   <li>{@link V3DLPPolicyRequest#setAppliesTo(List)}
   *   <li>{@link V3DLPPolicyRequest#setName(String)}
   *   <li>{@link V3DLPPolicyRequest#setScopes(List)}
   *   <li>{@link V3DLPPolicyRequest#toString()}
   *   <li>{@link V3DLPPolicyRequest#getAppliesTo()}
   *   <li>{@link V3DLPPolicyRequest#getName()}
   *   <li>{@link V3DLPPolicyRequest#getScopes()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V3DLPPolicyRequest.<init>()",
    "V3DLPPolicyRequest V3DLPPolicyRequest.appliesTo(List)",
    "List V3DLPPolicyRequest.getAppliesTo()",
    "String V3DLPPolicyRequest.getName()",
    "List V3DLPPolicyRequest.getScopes()",
    "V3DLPPolicyRequest V3DLPPolicyRequest.name(String)",
    "V3DLPPolicyRequest V3DLPPolicyRequest.scopes(List)",
    "void V3DLPPolicyRequest.setAppliesTo(List)",
    "void V3DLPPolicyRequest.setName(String)",
    "void V3DLPPolicyRequest.setScopes(List)",
    "String V3DLPPolicyRequest.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V3DLPPolicyRequest actualV3dlpPolicyRequest = new V3DLPPolicyRequest();
    V3DLPPolicyRequest actualAppliesToResult =
        actualV3dlpPolicyRequest.appliesTo(new ArrayList<>());
    V3DLPPolicyRequest actualNameResult = actualV3dlpPolicyRequest.name("Name");
    V3DLPPolicyRequest actualScopesResult = actualV3dlpPolicyRequest.scopes(new ArrayList<>());
    ArrayList<V3DLPPolicyAppliesTo> appliesTo = new ArrayList<>();
    actualV3dlpPolicyRequest.setAppliesTo(appliesTo);
    actualV3dlpPolicyRequest.setName("Name");
    ArrayList<String> scopes = new ArrayList<>();
    actualV3dlpPolicyRequest.setScopes(scopes);
    String actualToStringResult = actualV3dlpPolicyRequest.toString();
    List<V3DLPPolicyAppliesTo> actualAppliesTo = actualV3dlpPolicyRequest.getAppliesTo();
    String actualName = actualV3dlpPolicyRequest.getName();
    List<String> actualScopes = actualV3dlpPolicyRequest.getScopes();

    // Assert
    assertEquals("Name", actualName);
    assertEquals(
        "class V3DLPPolicyRequest {\n    name: Name\n    scopes: []\n    appliesTo: []\n}",
        actualToStringResult);
    assertTrue(actualAppliesTo.isEmpty());
    assertTrue(actualScopes.isEmpty());
    assertSame(actualV3dlpPolicyRequest, actualAppliesToResult);
    assertSame(actualV3dlpPolicyRequest, actualNameResult);
    assertSame(actualV3dlpPolicyRequest, actualScopesResult);
    assertSame(appliesTo, actualAppliesTo);
    assertSame(scopes, actualScopes);
  }
}
