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

class V3DLPPolicyDiffblueTest {
  /**
   * Test {@link V3DLPPolicy#addScopesItem(String)}.
   *
   * <ul>
   *   <li>Given {@link V3DLPPolicy} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link V3DLPPolicy#addScopesItem(String)}
   */
  @Test
  @DisplayName("Test addScopesItem(String); given V3DLPPolicy (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V3DLPPolicy V3DLPPolicy.addScopesItem(String)"})
  void testAddScopesItem_givenV3DLPPolicy() {
    // Arrange
    V3DLPPolicy v3dlpPolicy = new V3DLPPolicy();

    // Act
    V3DLPPolicy actualAddScopesItemResult = v3dlpPolicy.addScopesItem("Scopes Item");

    // Assert
    assertSame(v3dlpPolicy, actualAddScopesItemResult);
  }

  /**
   * Test {@link V3DLPPolicy#addScopesItem(String)}.
   *
   * <ul>
   *   <li>Given {@link V3DLPPolicy} (default constructor) scopes {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPPolicy#addScopesItem(String)}
   */
  @Test
  @DisplayName(
      "Test addScopesItem(String); given V3DLPPolicy (default constructor) scopes ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V3DLPPolicy V3DLPPolicy.addScopesItem(String)"})
  void testAddScopesItem_givenV3DLPPolicyScopesArrayList() {
    // Arrange
    V3DLPPolicy v3dlpPolicy = new V3DLPPolicy();
    v3dlpPolicy.scopes(new ArrayList<>());

    // Act
    V3DLPPolicy actualAddScopesItemResult = v3dlpPolicy.addScopesItem("Scopes Item");

    // Assert
    assertSame(v3dlpPolicy, actualAddScopesItemResult);
  }

  /**
   * Test {@link V3DLPPolicy#addAppliesToItem(V3DLPPolicyAppliesTo)}.
   *
   * <p>Method under test: {@link V3DLPPolicy#addAppliesToItem(V3DLPPolicyAppliesTo)}
   */
  @Test
  @DisplayName("Test addAppliesToItem(V3DLPPolicyAppliesTo)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V3DLPPolicy V3DLPPolicy.addAppliesToItem(V3DLPPolicyAppliesTo)"})
  void testAddAppliesToItem() {
    // Arrange
    V3DLPPolicy v3dlpPolicy = new V3DLPPolicy();

    // Act
    V3DLPPolicy actualAddAppliesToItemResult =
        v3dlpPolicy.addAppliesToItem(new V3DLPPolicyAppliesTo());

    // Assert
    assertSame(v3dlpPolicy, actualAddAppliesToItemResult);
  }

  /**
   * Test {@link V3DLPPolicy#equals(Object)}, and {@link V3DLPPolicy#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3DLPPolicy#equals(Object)}
   *   <li>{@link V3DLPPolicy#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3DLPPolicy.equals(Object)", "int V3DLPPolicy.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V3DLPPolicy v3dlpPolicy = new V3DLPPolicy();
    V3DLPPolicy v3dlpPolicy2 = new V3DLPPolicy();

    // Act and Assert
    assertEquals(v3dlpPolicy, v3dlpPolicy2);
    assertEquals(v3dlpPolicy.hashCode(), v3dlpPolicy2.hashCode());
  }

  /**
   * Test {@link V3DLPPolicy#equals(Object)}, and {@link V3DLPPolicy#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3DLPPolicy#equals(Object)}
   *   <li>{@link V3DLPPolicy#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3DLPPolicy.equals(Object)", "int V3DLPPolicy.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V3DLPPolicy v3dlpPolicy = new V3DLPPolicy();

    // Act and Assert
    assertEquals(v3dlpPolicy, v3dlpPolicy);
    int expectedHashCodeResult = v3dlpPolicy.hashCode();
    assertEquals(expectedHashCodeResult, v3dlpPolicy.hashCode());
  }

  /**
   * Test {@link V3DLPPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3DLPPolicy.equals(Object)", "int V3DLPPolicy.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V3DLPPolicy v3dlpPolicy = new V3DLPPolicy();
    v3dlpPolicy.addScopesItem("Scopes Item");

    // Act and Assert
    assertNotEquals(v3dlpPolicy, new V3DLPPolicy());
  }

  /**
   * Test {@link V3DLPPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3DLPPolicy.equals(Object)", "int V3DLPPolicy.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V3DLPPolicy v3dlpPolicy = new V3DLPPolicy();
    v3dlpPolicy.id("42");
    v3dlpPolicy.addScopesItem("Scopes Item");

    // Act and Assert
    assertNotEquals(v3dlpPolicy, new V3DLPPolicy());
  }

  /**
   * Test {@link V3DLPPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3DLPPolicy.equals(Object)", "int V3DLPPolicy.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V3DLPPolicy v3dlpPolicy = new V3DLPPolicy();
    v3dlpPolicy.policyId("42");
    v3dlpPolicy.addScopesItem("Scopes Item");

    // Act and Assert
    assertNotEquals(v3dlpPolicy, new V3DLPPolicy());
  }

  /**
   * Test {@link V3DLPPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3DLPPolicy.equals(Object)", "int V3DLPPolicy.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V3DLPPolicy v3dlpPolicy = new V3DLPPolicy();
    v3dlpPolicy.version("1.0.2");
    v3dlpPolicy.addScopesItem("Scopes Item");

    // Act and Assert
    assertNotEquals(v3dlpPolicy, new V3DLPPolicy());
  }

  /**
   * Test {@link V3DLPPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3DLPPolicy.equals(Object)", "int V3DLPPolicy.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V3DLPPolicy v3dlpPolicy = new V3DLPPolicy();
    v3dlpPolicy.name("Name");
    v3dlpPolicy.addScopesItem("Scopes Item");

    // Act and Assert
    assertNotEquals(v3dlpPolicy, new V3DLPPolicy());
  }

  /**
   * Test {@link V3DLPPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3DLPPolicy.equals(Object)", "int V3DLPPolicy.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    V3DLPPolicy v3dlpPolicy = new V3DLPPolicy();
    v3dlpPolicy.creatorId(1L);
    v3dlpPolicy.addScopesItem("Scopes Item");

    // Act and Assert
    assertNotEquals(v3dlpPolicy, new V3DLPPolicy());
  }

  /**
   * Test {@link V3DLPPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3DLPPolicy.equals(Object)", "int V3DLPPolicy.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    V3DLPPolicy v3dlpPolicy = new V3DLPPolicy();
    v3dlpPolicy.addAppliesToItem(new V3DLPPolicyAppliesTo());

    // Act and Assert
    assertNotEquals(v3dlpPolicy, new V3DLPPolicy());
  }

  /**
   * Test {@link V3DLPPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3DLPPolicy.equals(Object)", "int V3DLPPolicy.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    V3DLPPolicy v3dlpPolicy = new V3DLPPolicy();
    v3dlpPolicy.active(true);

    // Act and Assert
    assertNotEquals(v3dlpPolicy, new V3DLPPolicy());
  }

  /**
   * Test {@link V3DLPPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3DLPPolicy.equals(Object)", "int V3DLPPolicy.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    V3DLPPolicy v3dlpPolicy = new V3DLPPolicy();
    v3dlpPolicy.deleted(true);

    // Act and Assert
    assertNotEquals(v3dlpPolicy, new V3DLPPolicy());
  }

  /**
   * Test {@link V3DLPPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3DLPPolicy.equals(Object)", "int V3DLPPolicy.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual10() {
    // Arrange
    V3DLPPolicy v3dlpPolicy = new V3DLPPolicy();
    v3dlpPolicy.creationDate(1L);

    // Act and Assert
    assertNotEquals(v3dlpPolicy, new V3DLPPolicy());
  }

  /**
   * Test {@link V3DLPPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3DLPPolicy.equals(Object)", "int V3DLPPolicy.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual11() {
    // Arrange
    V3DLPPolicy v3dlpPolicy = new V3DLPPolicy();
    v3dlpPolicy.lastUpdatedDate(1L);

    // Act and Assert
    assertNotEquals(v3dlpPolicy, new V3DLPPolicy());
  }

  /**
   * Test {@link V3DLPPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3DLPPolicy.equals(Object)", "int V3DLPPolicy.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual12() {
    // Arrange
    V3DLPPolicy v3dlpPolicy = new V3DLPPolicy();
    v3dlpPolicy.lastDisabledDate(1L);

    // Act and Assert
    assertNotEquals(v3dlpPolicy, new V3DLPPolicy());
  }

  /**
   * Test {@link V3DLPPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3DLPPolicy.equals(Object)", "int V3DLPPolicy.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual13() {
    // Arrange
    V3DLPPolicy v3dlpPolicy = new V3DLPPolicy();
    v3dlpPolicy.systemPolicy(true);

    // Act and Assert
    assertNotEquals(v3dlpPolicy, new V3DLPPolicy());
  }

  /**
   * Test {@link V3DLPPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3DLPPolicy.equals(Object)", "int V3DLPPolicy.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPPolicy(), null);
  }

  /**
   * Test {@link V3DLPPolicy#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPPolicy#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3DLPPolicy.equals(Object)", "int V3DLPPolicy.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPPolicy(), "Different type to V3DLPPolicy");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V3DLPPolicy}
   *   <li>{@link V3DLPPolicy#active(Boolean)}
   *   <li>{@link V3DLPPolicy#appliesTo(List)}
   *   <li>{@link V3DLPPolicy#creationDate(Long)}
   *   <li>{@link V3DLPPolicy#creatorId(Long)}
   *   <li>{@link V3DLPPolicy#deleted(Boolean)}
   *   <li>{@link V3DLPPolicy#id(String)}
   *   <li>{@link V3DLPPolicy#lastDisabledDate(Long)}
   *   <li>{@link V3DLPPolicy#lastUpdatedDate(Long)}
   *   <li>{@link V3DLPPolicy#name(String)}
   *   <li>{@link V3DLPPolicy#policyId(String)}
   *   <li>{@link V3DLPPolicy#scopes(List)}
   *   <li>{@link V3DLPPolicy#setActive(Boolean)}
   *   <li>{@link V3DLPPolicy#setAppliesTo(List)}
   *   <li>{@link V3DLPPolicy#setCreationDate(Long)}
   *   <li>{@link V3DLPPolicy#setCreatorId(Long)}
   *   <li>{@link V3DLPPolicy#setDeleted(Boolean)}
   *   <li>{@link V3DLPPolicy#setId(String)}
   *   <li>{@link V3DLPPolicy#setLastDisabledDate(Long)}
   *   <li>{@link V3DLPPolicy#setLastUpdatedDate(Long)}
   *   <li>{@link V3DLPPolicy#setName(String)}
   *   <li>{@link V3DLPPolicy#setPolicyId(String)}
   *   <li>{@link V3DLPPolicy#setScopes(List)}
   *   <li>{@link V3DLPPolicy#setSystemPolicy(Boolean)}
   *   <li>{@link V3DLPPolicy#setVersion(String)}
   *   <li>{@link V3DLPPolicy#systemPolicy(Boolean)}
   *   <li>{@link V3DLPPolicy#version(String)}
   *   <li>{@link V3DLPPolicy#toString()}
   *   <li>{@link V3DLPPolicy#getActive()}
   *   <li>{@link V3DLPPolicy#getAppliesTo()}
   *   <li>{@link V3DLPPolicy#getCreationDate()}
   *   <li>{@link V3DLPPolicy#getCreatorId()}
   *   <li>{@link V3DLPPolicy#getDeleted()}
   *   <li>{@link V3DLPPolicy#getId()}
   *   <li>{@link V3DLPPolicy#getLastDisabledDate()}
   *   <li>{@link V3DLPPolicy#getLastUpdatedDate()}
   *   <li>{@link V3DLPPolicy#getName()}
   *   <li>{@link V3DLPPolicy#getPolicyId()}
   *   <li>{@link V3DLPPolicy#getScopes()}
   *   <li>{@link V3DLPPolicy#getSystemPolicy()}
   *   <li>{@link V3DLPPolicy#getVersion()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V3DLPPolicy.<init>()",
    "V3DLPPolicy V3DLPPolicy.active(Boolean)",
    "V3DLPPolicy V3DLPPolicy.appliesTo(List)",
    "V3DLPPolicy V3DLPPolicy.creationDate(Long)",
    "V3DLPPolicy V3DLPPolicy.creatorId(Long)",
    "V3DLPPolicy V3DLPPolicy.deleted(Boolean)",
    "Boolean V3DLPPolicy.getActive()",
    "List V3DLPPolicy.getAppliesTo()",
    "Long V3DLPPolicy.getCreationDate()",
    "Long V3DLPPolicy.getCreatorId()",
    "Boolean V3DLPPolicy.getDeleted()",
    "String V3DLPPolicy.getId()",
    "Long V3DLPPolicy.getLastDisabledDate()",
    "Long V3DLPPolicy.getLastUpdatedDate()",
    "String V3DLPPolicy.getName()",
    "String V3DLPPolicy.getPolicyId()",
    "List V3DLPPolicy.getScopes()",
    "Boolean V3DLPPolicy.getSystemPolicy()",
    "String V3DLPPolicy.getVersion()",
    "V3DLPPolicy V3DLPPolicy.id(String)",
    "V3DLPPolicy V3DLPPolicy.lastDisabledDate(Long)",
    "V3DLPPolicy V3DLPPolicy.lastUpdatedDate(Long)",
    "V3DLPPolicy V3DLPPolicy.name(String)",
    "V3DLPPolicy V3DLPPolicy.policyId(String)",
    "V3DLPPolicy V3DLPPolicy.scopes(List)",
    "void V3DLPPolicy.setActive(Boolean)",
    "void V3DLPPolicy.setAppliesTo(List)",
    "void V3DLPPolicy.setCreationDate(Long)",
    "void V3DLPPolicy.setCreatorId(Long)",
    "void V3DLPPolicy.setDeleted(Boolean)",
    "void V3DLPPolicy.setId(String)",
    "void V3DLPPolicy.setLastDisabledDate(Long)",
    "void V3DLPPolicy.setLastUpdatedDate(Long)",
    "void V3DLPPolicy.setName(String)",
    "void V3DLPPolicy.setPolicyId(String)",
    "void V3DLPPolicy.setScopes(List)",
    "void V3DLPPolicy.setSystemPolicy(Boolean)",
    "void V3DLPPolicy.setVersion(String)",
    "V3DLPPolicy V3DLPPolicy.systemPolicy(Boolean)",
    "String V3DLPPolicy.toString()",
    "V3DLPPolicy V3DLPPolicy.version(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V3DLPPolicy actualV3dlpPolicy = new V3DLPPolicy();
    V3DLPPolicy actualActiveResult = actualV3dlpPolicy.active(true);
    V3DLPPolicy actualAppliesToResult = actualV3dlpPolicy.appliesTo(new ArrayList<>());
    V3DLPPolicy actualCreationDateResult = actualV3dlpPolicy.creationDate(1L);
    V3DLPPolicy actualCreatorIdResult = actualV3dlpPolicy.creatorId(1L);
    V3DLPPolicy actualDeletedResult = actualV3dlpPolicy.deleted(true);
    V3DLPPolicy actualIdResult = actualV3dlpPolicy.id("42");
    V3DLPPolicy actualLastDisabledDateResult = actualV3dlpPolicy.lastDisabledDate(1L);
    V3DLPPolicy actualLastUpdatedDateResult = actualV3dlpPolicy.lastUpdatedDate(1L);
    V3DLPPolicy actualNameResult = actualV3dlpPolicy.name("Name");
    V3DLPPolicy actualPolicyIdResult = actualV3dlpPolicy.policyId("42");
    V3DLPPolicy actualScopesResult = actualV3dlpPolicy.scopes(new ArrayList<>());
    actualV3dlpPolicy.setActive(true);
    ArrayList<V3DLPPolicyAppliesTo> appliesTo = new ArrayList<>();
    actualV3dlpPolicy.setAppliesTo(appliesTo);
    actualV3dlpPolicy.setCreationDate(1L);
    actualV3dlpPolicy.setCreatorId(1L);
    actualV3dlpPolicy.setDeleted(true);
    actualV3dlpPolicy.setId("42");
    actualV3dlpPolicy.setLastDisabledDate(1L);
    actualV3dlpPolicy.setLastUpdatedDate(1L);
    actualV3dlpPolicy.setName("Name");
    actualV3dlpPolicy.setPolicyId("42");
    ArrayList<String> scopes = new ArrayList<>();
    actualV3dlpPolicy.setScopes(scopes);
    actualV3dlpPolicy.setSystemPolicy(true);
    actualV3dlpPolicy.setVersion("1.0.2");
    V3DLPPolicy actualSystemPolicyResult = actualV3dlpPolicy.systemPolicy(true);
    V3DLPPolicy actualVersionResult = actualV3dlpPolicy.version("1.0.2");
    String actualToStringResult = actualV3dlpPolicy.toString();
    Boolean actualActive = actualV3dlpPolicy.getActive();
    List<V3DLPPolicyAppliesTo> actualAppliesTo = actualV3dlpPolicy.getAppliesTo();
    Long actualCreationDate = actualV3dlpPolicy.getCreationDate();
    Long actualCreatorId = actualV3dlpPolicy.getCreatorId();
    Boolean actualDeleted = actualV3dlpPolicy.getDeleted();
    String actualId = actualV3dlpPolicy.getId();
    Long actualLastDisabledDate = actualV3dlpPolicy.getLastDisabledDate();
    Long actualLastUpdatedDate = actualV3dlpPolicy.getLastUpdatedDate();
    String actualName = actualV3dlpPolicy.getName();
    String actualPolicyId = actualV3dlpPolicy.getPolicyId();
    List<String> actualScopes = actualV3dlpPolicy.getScopes();
    Boolean actualSystemPolicy = actualV3dlpPolicy.getSystemPolicy();

    // Assert
    assertEquals("1.0.2", actualV3dlpPolicy.getVersion());
    assertEquals("42", actualId);
    assertEquals("42", actualPolicyId);
    assertEquals("Name", actualName);
    assertEquals(
        "class V3DLPPolicy {\n"
            + "    id: 42\n"
            + "    policyId: 42\n"
            + "    version: 1.0.2\n"
            + "    name: Name\n"
            + "    creatorId: 1\n"
            + "    scopes: []\n"
            + "    appliesTo: []\n"
            + "    active: true\n"
            + "    deleted: true\n"
            + "    creationDate: 1\n"
            + "    lastUpdatedDate: 1\n"
            + "    lastDisabledDate: 1\n"
            + "    systemPolicy: true\n"
            + "}",
        actualToStringResult);
    assertEquals(1L, actualCreationDate.longValue());
    assertEquals(1L, actualCreatorId.longValue());
    assertEquals(1L, actualLastDisabledDate.longValue());
    assertEquals(1L, actualLastUpdatedDate.longValue());
    assertTrue(actualActive);
    assertTrue(actualDeleted);
    assertTrue(actualSystemPolicy);
    assertTrue(actualAppliesTo.isEmpty());
    assertTrue(actualScopes.isEmpty());
    assertSame(actualV3dlpPolicy, actualActiveResult);
    assertSame(actualV3dlpPolicy, actualAppliesToResult);
    assertSame(actualV3dlpPolicy, actualCreationDateResult);
    assertSame(actualV3dlpPolicy, actualCreatorIdResult);
    assertSame(actualV3dlpPolicy, actualDeletedResult);
    assertSame(actualV3dlpPolicy, actualIdResult);
    assertSame(actualV3dlpPolicy, actualLastDisabledDateResult);
    assertSame(actualV3dlpPolicy, actualLastUpdatedDateResult);
    assertSame(actualV3dlpPolicy, actualNameResult);
    assertSame(actualV3dlpPolicy, actualPolicyIdResult);
    assertSame(actualV3dlpPolicy, actualScopesResult);
    assertSame(actualV3dlpPolicy, actualSystemPolicyResult);
    assertSame(actualV3dlpPolicy, actualVersionResult);
    assertSame(appliesTo, actualAppliesTo);
    assertSame(scopes, actualScopes);
  }
}
