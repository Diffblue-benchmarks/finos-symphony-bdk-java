package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V1DLPViolationDiffblueTest {
  /**
   * Test {@link V1DLPViolation#addMatchedPoliciesItem(V1DLPMatchedPolicy)}.
   *
   * <ul>
   *   <li>Given {@link V1DLPViolation} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link V1DLPViolation#addMatchedPoliciesItem(V1DLPMatchedPolicy)}
   */
  @Test
  @DisplayName(
      "Test addMatchedPoliciesItem(V1DLPMatchedPolicy); given V1DLPViolation (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V1DLPViolation V1DLPViolation.addMatchedPoliciesItem(V1DLPMatchedPolicy)"})
  void testAddMatchedPoliciesItem_givenV1DLPViolation() {
    // Arrange
    V1DLPViolation v1dlpViolation = new V1DLPViolation();

    // Act
    V1DLPViolation actualAddMatchedPoliciesItemResult =
        v1dlpViolation.addMatchedPoliciesItem(new V1DLPMatchedPolicy());

    // Assert
    assertSame(v1dlpViolation, actualAddMatchedPoliciesItemResult);
  }

  /**
   * Test {@link V1DLPViolation#addMatchedPoliciesItem(V1DLPMatchedPolicy)}.
   *
   * <ul>
   *   <li>Given {@link V1DLPViolation} (default constructor) matchedPolicies {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPViolation#addMatchedPoliciesItem(V1DLPMatchedPolicy)}
   */
  @Test
  @DisplayName(
      "Test addMatchedPoliciesItem(V1DLPMatchedPolicy); given V1DLPViolation (default constructor) matchedPolicies ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V1DLPViolation V1DLPViolation.addMatchedPoliciesItem(V1DLPMatchedPolicy)"})
  void testAddMatchedPoliciesItem_givenV1DLPViolationMatchedPoliciesArrayList() {
    // Arrange
    V1DLPViolation v1dlpViolation = new V1DLPViolation();
    v1dlpViolation.matchedPolicies(new ArrayList<>());

    // Act
    V1DLPViolation actualAddMatchedPoliciesItemResult =
        v1dlpViolation.addMatchedPoliciesItem(new V1DLPMatchedPolicy());

    // Assert
    assertSame(v1dlpViolation, actualAddMatchedPoliciesItemResult);
  }

  /**
   * Test {@link V1DLPViolation#equals(Object)}, and {@link V1DLPViolation#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V1DLPViolation#equals(Object)}
   *   <li>{@link V1DLPViolation#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPViolation.equals(Object)", "int V1DLPViolation.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V1DLPViolation v1dlpViolation = new V1DLPViolation();
    V1DLPViolation v1dlpViolation2 = new V1DLPViolation();

    // Act and Assert
    assertEquals(v1dlpViolation, v1dlpViolation2);
    assertEquals(v1dlpViolation.hashCode(), v1dlpViolation2.hashCode());
  }

  /**
   * Test {@link V1DLPViolation#equals(Object)}, and {@link V1DLPViolation#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V1DLPViolation#equals(Object)}
   *   <li>{@link V1DLPViolation#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPViolation.equals(Object)", "int V1DLPViolation.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V1DLPViolation v1dlpViolation = new V1DLPViolation();

    // Act and Assert
    assertEquals(v1dlpViolation, v1dlpViolation);
    int expectedHashCodeResult = v1dlpViolation.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpViolation.hashCode());
  }

  /**
   * Test {@link V1DLPViolation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPViolation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPViolation.equals(Object)", "int V1DLPViolation.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V1DLPViolation v1dlpViolation = new V1DLPViolation();
    v1dlpViolation.addMatchedPoliciesItem(new V1DLPMatchedPolicy());

    // Act and Assert
    assertNotEquals(v1dlpViolation, new V1DLPViolation());
  }

  /**
   * Test {@link V1DLPViolation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPViolation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPViolation.equals(Object)", "int V1DLPViolation.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V1DLPViolation v1dlpViolation = new V1DLPViolation();
    v1dlpViolation.enforcementEventID("Enforcement Event ID");
    v1dlpViolation.addMatchedPoliciesItem(new V1DLPMatchedPolicy());

    // Act and Assert
    assertNotEquals(v1dlpViolation, new V1DLPViolation());
  }

  /**
   * Test {@link V1DLPViolation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPViolation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPViolation.equals(Object)", "int V1DLPViolation.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V1DLPViolation v1dlpViolation = new V1DLPViolation();
    v1dlpViolation.entityID("Entity ID");
    v1dlpViolation.addMatchedPoliciesItem(new V1DLPMatchedPolicy());

    // Act and Assert
    assertNotEquals(v1dlpViolation, new V1DLPViolation());
  }

  /**
   * Test {@link V1DLPViolation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPViolation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPViolation.equals(Object)", "int V1DLPViolation.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V1DLPViolation v1dlpViolation = new V1DLPViolation();
    v1dlpViolation.createTime(1L);
    v1dlpViolation.addMatchedPoliciesItem(new V1DLPMatchedPolicy());

    // Act and Assert
    assertNotEquals(v1dlpViolation, new V1DLPViolation());
  }

  /**
   * Test {@link V1DLPViolation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPViolation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPViolation.equals(Object)", "int V1DLPViolation.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V1DLPViolation v1dlpViolation = new V1DLPViolation();
    v1dlpViolation.lastModified(1L);
    v1dlpViolation.addMatchedPoliciesItem(new V1DLPMatchedPolicy());

    // Act and Assert
    assertNotEquals(v1dlpViolation, new V1DLPViolation());
  }

  /**
   * Test {@link V1DLPViolation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPViolation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPViolation.equals(Object)", "int V1DLPViolation.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    V1DLPViolation v1dlpViolation = new V1DLPViolation();
    v1dlpViolation.requesterId(1L);
    v1dlpViolation.addMatchedPoliciesItem(new V1DLPMatchedPolicy());

    // Act and Assert
    assertNotEquals(v1dlpViolation, new V1DLPViolation());
  }

  /**
   * Test {@link V1DLPViolation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPViolation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPViolation.equals(Object)", "int V1DLPViolation.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    V1DLPViolation v1dlpViolation = new V1DLPViolation();
    v1dlpViolation.action("Action");

    // Act and Assert
    assertNotEquals(v1dlpViolation, new V1DLPViolation());
  }

  /**
   * Test {@link V1DLPViolation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPViolation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPViolation.equals(Object)", "int V1DLPViolation.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    V1DLPViolation v1dlpViolation = new V1DLPViolation();
    v1dlpViolation.outcome(new V1DLPOutcome());

    // Act and Assert
    assertNotEquals(v1dlpViolation, new V1DLPViolation());
  }

  /**
   * Test {@link V1DLPViolation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPViolation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPViolation.equals(Object)", "int V1DLPViolation.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    V1DLPViolation v1dlpViolation = new V1DLPViolation();
    v1dlpViolation.contentType(new V1DLPContentType());

    // Act and Assert
    assertNotEquals(v1dlpViolation, new V1DLPViolation());
  }

  /**
   * Test {@link V1DLPViolation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPViolation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPViolation.equals(Object)", "int V1DLPViolation.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual10() {
    // Arrange
    V1DLPViolation v1dlpViolation = new V1DLPViolation();
    v1dlpViolation.version("1.0.2");

    // Act and Assert
    assertNotEquals(v1dlpViolation, new V1DLPViolation());
  }

  /**
   * Test {@link V1DLPViolation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPViolation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPViolation.equals(Object)", "int V1DLPViolation.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual11() {
    // Arrange
    V1DLPViolation v1dlpViolation = new V1DLPViolation();
    v1dlpViolation.ignoreDLPwarning(true);

    // Act and Assert
    assertNotEquals(v1dlpViolation, new V1DLPViolation());
  }

  /**
   * Test {@link V1DLPViolation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPViolation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPViolation.equals(Object)", "int V1DLPViolation.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPViolation(), null);
  }

  /**
   * Test {@link V1DLPViolation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPViolation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V1DLPViolation.equals(Object)", "int V1DLPViolation.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPViolation(), "Different type to V1DLPViolation");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V1DLPViolation}
   *   <li>{@link V1DLPViolation#action(String)}
   *   <li>{@link V1DLPViolation#contentType(V1DLPContentType)}
   *   <li>{@link V1DLPViolation#createTime(Long)}
   *   <li>{@link V1DLPViolation#enforcementEventID(String)}
   *   <li>{@link V1DLPViolation#entityID(String)}
   *   <li>{@link V1DLPViolation#ignoreDLPwarning(Boolean)}
   *   <li>{@link V1DLPViolation#lastModified(Long)}
   *   <li>{@link V1DLPViolation#matchedPolicies(List)}
   *   <li>{@link V1DLPViolation#outcome(V1DLPOutcome)}
   *   <li>{@link V1DLPViolation#requesterId(Long)}
   *   <li>{@link V1DLPViolation#setAction(String)}
   *   <li>{@link V1DLPViolation#setContentType(V1DLPContentType)}
   *   <li>{@link V1DLPViolation#setCreateTime(Long)}
   *   <li>{@link V1DLPViolation#setEnforcementEventID(String)}
   *   <li>{@link V1DLPViolation#setEntityID(String)}
   *   <li>{@link V1DLPViolation#setIgnoreDLPwarning(Boolean)}
   *   <li>{@link V1DLPViolation#setLastModified(Long)}
   *   <li>{@link V1DLPViolation#setMatchedPolicies(List)}
   *   <li>{@link V1DLPViolation#setOutcome(V1DLPOutcome)}
   *   <li>{@link V1DLPViolation#setRequesterId(Long)}
   *   <li>{@link V1DLPViolation#setVersion(String)}
   *   <li>{@link V1DLPViolation#version(String)}
   *   <li>{@link V1DLPViolation#toString()}
   *   <li>{@link V1DLPViolation#getAction()}
   *   <li>{@link V1DLPViolation#getContentType()}
   *   <li>{@link V1DLPViolation#getCreateTime()}
   *   <li>{@link V1DLPViolation#getEnforcementEventID()}
   *   <li>{@link V1DLPViolation#getEntityID()}
   *   <li>{@link V1DLPViolation#getIgnoreDLPwarning()}
   *   <li>{@link V1DLPViolation#getLastModified()}
   *   <li>{@link V1DLPViolation#getMatchedPolicies()}
   *   <li>{@link V1DLPViolation#getOutcome()}
   *   <li>{@link V1DLPViolation#getRequesterId()}
   *   <li>{@link V1DLPViolation#getVersion()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V1DLPViolation.<init>()",
    "V1DLPViolation V1DLPViolation.action(String)",
    "V1DLPViolation V1DLPViolation.contentType(V1DLPContentType)",
    "V1DLPViolation V1DLPViolation.createTime(Long)",
    "V1DLPViolation V1DLPViolation.enforcementEventID(String)",
    "V1DLPViolation V1DLPViolation.entityID(String)",
    "String V1DLPViolation.getAction()",
    "V1DLPContentType V1DLPViolation.getContentType()",
    "Long V1DLPViolation.getCreateTime()",
    "String V1DLPViolation.getEnforcementEventID()",
    "String V1DLPViolation.getEntityID()",
    "Boolean V1DLPViolation.getIgnoreDLPwarning()",
    "Long V1DLPViolation.getLastModified()",
    "List V1DLPViolation.getMatchedPolicies()",
    "V1DLPOutcome V1DLPViolation.getOutcome()",
    "Long V1DLPViolation.getRequesterId()",
    "String V1DLPViolation.getVersion()",
    "V1DLPViolation V1DLPViolation.ignoreDLPwarning(Boolean)",
    "V1DLPViolation V1DLPViolation.lastModified(Long)",
    "V1DLPViolation V1DLPViolation.matchedPolicies(List)",
    "V1DLPViolation V1DLPViolation.outcome(V1DLPOutcome)",
    "V1DLPViolation V1DLPViolation.requesterId(Long)",
    "void V1DLPViolation.setAction(String)",
    "void V1DLPViolation.setContentType(V1DLPContentType)",
    "void V1DLPViolation.setCreateTime(Long)",
    "void V1DLPViolation.setEnforcementEventID(String)",
    "void V1DLPViolation.setEntityID(String)",
    "void V1DLPViolation.setIgnoreDLPwarning(Boolean)",
    "void V1DLPViolation.setLastModified(Long)",
    "void V1DLPViolation.setMatchedPolicies(List)",
    "void V1DLPViolation.setOutcome(V1DLPOutcome)",
    "void V1DLPViolation.setRequesterId(Long)",
    "void V1DLPViolation.setVersion(String)",
    "String V1DLPViolation.toString()",
    "V1DLPViolation V1DLPViolation.version(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V1DLPViolation actualV1dlpViolation = new V1DLPViolation();
    V1DLPViolation actualActionResult = actualV1dlpViolation.action("Action");
    V1DLPViolation actualContentTypeResult =
        actualV1dlpViolation.contentType(new V1DLPContentType());
    V1DLPViolation actualCreateTimeResult = actualV1dlpViolation.createTime(1L);
    V1DLPViolation actualEnforcementEventIDResult =
        actualV1dlpViolation.enforcementEventID("Enforcement Event ID");
    V1DLPViolation actualEntityIDResult = actualV1dlpViolation.entityID("Entity ID");
    V1DLPViolation actualIgnoreDLPwarningResult = actualV1dlpViolation.ignoreDLPwarning(true);
    V1DLPViolation actualLastModifiedResult = actualV1dlpViolation.lastModified(1L);
    V1DLPViolation actualMatchedPoliciesResult =
        actualV1dlpViolation.matchedPolicies(new ArrayList<>());
    V1DLPViolation actualOutcomeResult = actualV1dlpViolation.outcome(new V1DLPOutcome());
    V1DLPViolation actualRequesterIdResult = actualV1dlpViolation.requesterId(1L);
    actualV1dlpViolation.setAction("Action");
    V1DLPContentType contentType = new V1DLPContentType();
    actualV1dlpViolation.setContentType(contentType);
    actualV1dlpViolation.setCreateTime(1L);
    actualV1dlpViolation.setEnforcementEventID("Enforcement Event ID");
    actualV1dlpViolation.setEntityID("Entity ID");
    actualV1dlpViolation.setIgnoreDLPwarning(true);
    actualV1dlpViolation.setLastModified(1L);
    ArrayList<V1DLPMatchedPolicy> matchedPolicies = new ArrayList<>();
    actualV1dlpViolation.setMatchedPolicies(matchedPolicies);
    V1DLPOutcome outcome = new V1DLPOutcome();
    actualV1dlpViolation.setOutcome(outcome);
    actualV1dlpViolation.setRequesterId(1L);
    actualV1dlpViolation.setVersion("1.0.2");
    V1DLPViolation actualVersionResult = actualV1dlpViolation.version("1.0.2");
    String actualToStringResult = actualV1dlpViolation.toString();
    String actualAction = actualV1dlpViolation.getAction();
    V1DLPContentType actualContentType = actualV1dlpViolation.getContentType();
    Long actualCreateTime = actualV1dlpViolation.getCreateTime();
    String actualEnforcementEventID = actualV1dlpViolation.getEnforcementEventID();
    String actualEntityID = actualV1dlpViolation.getEntityID();
    Boolean actualIgnoreDLPwarning = actualV1dlpViolation.getIgnoreDLPwarning();
    Long actualLastModified = actualV1dlpViolation.getLastModified();
    List<V1DLPMatchedPolicy> actualMatchedPolicies = actualV1dlpViolation.getMatchedPolicies();
    V1DLPOutcome actualOutcome = actualV1dlpViolation.getOutcome();
    Long actualRequesterId = actualV1dlpViolation.getRequesterId();

    // Assert
    assertEquals("1.0.2", actualV1dlpViolation.getVersion());
    assertEquals("Action", actualAction);
    assertEquals("Enforcement Event ID", actualEnforcementEventID);
    assertEquals("Entity ID", actualEntityID);
    assertEquals(
        "class V1DLPViolation {\n"
            + "    enforcementEventID: Enforcement Event ID\n"
            + "    entityID: Entity ID\n"
            + "    createTime: 1\n"
            + "    lastModified: 1\n"
            + "    requesterId: 1\n"
            + "    matchedPolicies: []\n"
            + "    action: Action\n"
            + "    outcome: class V1DLPOutcome {\n"
            + "        type: null\n"
            + "    }\n"
            + "    contentType: class V1DLPContentType {\n"
            + "        type: null\n"
            + "    }\n"
            + "    version: 1.0.2\n"
            + "    ignoreDLPwarning: true\n"
            + "}",
        actualToStringResult);
    assertNull(actualContentType.getType());
    assertNull(actualOutcome.getType());
    assertEquals(1L, actualCreateTime.longValue());
    assertEquals(1L, actualLastModified.longValue());
    assertEquals(1L, actualRequesterId.longValue());
    assertTrue(actualIgnoreDLPwarning);
    assertTrue(actualMatchedPolicies.isEmpty());
    assertSame(contentType, actualContentType);
    assertSame(outcome, actualOutcome);
    assertSame(actualV1dlpViolation, actualActionResult);
    assertSame(actualV1dlpViolation, actualContentTypeResult);
    assertSame(actualV1dlpViolation, actualCreateTimeResult);
    assertSame(actualV1dlpViolation, actualEnforcementEventIDResult);
    assertSame(actualV1dlpViolation, actualEntityIDResult);
    assertSame(actualV1dlpViolation, actualIgnoreDLPwarningResult);
    assertSame(actualV1dlpViolation, actualLastModifiedResult);
    assertSame(actualV1dlpViolation, actualMatchedPoliciesResult);
    assertSame(actualV1dlpViolation, actualOutcomeResult);
    assertSame(actualV1dlpViolation, actualRequesterIdResult);
    assertSame(actualV1dlpViolation, actualVersionResult);
    assertSame(matchedPolicies, actualMatchedPolicies);
  }
}
