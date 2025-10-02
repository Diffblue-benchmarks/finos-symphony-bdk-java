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

class V3DLPPolicyAppliesToDiffblueTest {
  /**
   * Test {@link V3DLPPolicyAppliesTo#addRulesItem(V3DLPRule)}.
   *
   * <p>Method under test: {@link V3DLPPolicyAppliesTo#addRulesItem(V3DLPRule)}
   */
  @Test
  @DisplayName("Test addRulesItem(V3DLPRule)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V3DLPPolicyAppliesTo V3DLPPolicyAppliesTo.addRulesItem(V3DLPRule)"})
  void testAddRulesItem() {
    // Arrange
    V3DLPPolicyAppliesTo v3dlpPolicyAppliesTo = new V3DLPPolicyAppliesTo();

    // Act
    V3DLPPolicyAppliesTo actualAddRulesItemResult =
        v3dlpPolicyAppliesTo.addRulesItem(new V3DLPRule());

    // Assert
    assertSame(v3dlpPolicyAppliesTo, actualAddRulesItemResult);
  }

  /**
   * Test {@link V3DLPPolicyAppliesTo#equals(Object)}, and {@link V3DLPPolicyAppliesTo#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3DLPPolicyAppliesTo#equals(Object)}
   *   <li>{@link V3DLPPolicyAppliesTo#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPPolicyAppliesTo.equals(Object)",
    "int V3DLPPolicyAppliesTo.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V3DLPPolicyAppliesTo v3dlpPolicyAppliesTo = new V3DLPPolicyAppliesTo();
    V3DLPPolicyAppliesTo v3dlpPolicyAppliesTo2 = new V3DLPPolicyAppliesTo();

    // Act and Assert
    assertEquals(v3dlpPolicyAppliesTo, v3dlpPolicyAppliesTo2);
    assertEquals(v3dlpPolicyAppliesTo.hashCode(), v3dlpPolicyAppliesTo2.hashCode());
  }

  /**
   * Test {@link V3DLPPolicyAppliesTo#equals(Object)}, and {@link V3DLPPolicyAppliesTo#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3DLPPolicyAppliesTo#equals(Object)}
   *   <li>{@link V3DLPPolicyAppliesTo#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPPolicyAppliesTo.equals(Object)",
    "int V3DLPPolicyAppliesTo.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V3DLPPolicyAppliesTo v3dlpPolicyAppliesTo = new V3DLPPolicyAppliesTo();

    // Act and Assert
    assertEquals(v3dlpPolicyAppliesTo, v3dlpPolicyAppliesTo);
    int expectedHashCodeResult = v3dlpPolicyAppliesTo.hashCode();
    assertEquals(expectedHashCodeResult, v3dlpPolicyAppliesTo.hashCode());
  }

  /**
   * Test {@link V3DLPPolicyAppliesTo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPPolicyAppliesTo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPPolicyAppliesTo.equals(Object)",
    "int V3DLPPolicyAppliesTo.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V3DLPPolicyAppliesTo v3dlpPolicyAppliesTo = new V3DLPPolicyAppliesTo();
    v3dlpPolicyAppliesTo.addRulesItem(new V3DLPRule());

    // Act and Assert
    assertNotEquals(v3dlpPolicyAppliesTo, new V3DLPPolicyAppliesTo());
  }

  /**
   * Test {@link V3DLPPolicyAppliesTo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPPolicyAppliesTo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPPolicyAppliesTo.equals(Object)",
    "int V3DLPPolicyAppliesTo.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V3DLPPolicyAppliesTo v3dlpPolicyAppliesTo = new V3DLPPolicyAppliesTo();
    v3dlpPolicyAppliesTo.dataType("Data Type");
    v3dlpPolicyAppliesTo.addRulesItem(new V3DLPRule());

    // Act and Assert
    assertNotEquals(v3dlpPolicyAppliesTo, new V3DLPPolicyAppliesTo());
  }

  /**
   * Test {@link V3DLPPolicyAppliesTo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPPolicyAppliesTo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPPolicyAppliesTo.equals(Object)",
    "int V3DLPPolicyAppliesTo.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V3DLPPolicyAppliesTo v3dlpPolicyAppliesTo = new V3DLPPolicyAppliesTo();
    v3dlpPolicyAppliesTo.action("Action");
    v3dlpPolicyAppliesTo.addRulesItem(new V3DLPRule());

    // Act and Assert
    assertNotEquals(v3dlpPolicyAppliesTo, new V3DLPPolicyAppliesTo());
  }

  /**
   * Test {@link V3DLPPolicyAppliesTo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPPolicyAppliesTo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPPolicyAppliesTo.equals(Object)",
    "int V3DLPPolicyAppliesTo.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPPolicyAppliesTo(), null);
  }

  /**
   * Test {@link V3DLPPolicyAppliesTo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPPolicyAppliesTo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPPolicyAppliesTo.equals(Object)",
    "int V3DLPPolicyAppliesTo.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPPolicyAppliesTo(), "Different type to V3DLPPolicyAppliesTo");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V3DLPPolicyAppliesTo}
   *   <li>{@link V3DLPPolicyAppliesTo#action(String)}
   *   <li>{@link V3DLPPolicyAppliesTo#dataType(String)}
   *   <li>{@link V3DLPPolicyAppliesTo#rules(List)}
   *   <li>{@link V3DLPPolicyAppliesTo#setAction(String)}
   *   <li>{@link V3DLPPolicyAppliesTo#setDataType(String)}
   *   <li>{@link V3DLPPolicyAppliesTo#setRules(List)}
   *   <li>{@link V3DLPPolicyAppliesTo#toString()}
   *   <li>{@link V3DLPPolicyAppliesTo#getAction()}
   *   <li>{@link V3DLPPolicyAppliesTo#getDataType()}
   *   <li>{@link V3DLPPolicyAppliesTo#getRules()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V3DLPPolicyAppliesTo.<init>()",
    "V3DLPPolicyAppliesTo V3DLPPolicyAppliesTo.action(String)",
    "V3DLPPolicyAppliesTo V3DLPPolicyAppliesTo.dataType(String)",
    "String V3DLPPolicyAppliesTo.getAction()",
    "String V3DLPPolicyAppliesTo.getDataType()",
    "List V3DLPPolicyAppliesTo.getRules()",
    "V3DLPPolicyAppliesTo V3DLPPolicyAppliesTo.rules(List)",
    "void V3DLPPolicyAppliesTo.setAction(String)",
    "void V3DLPPolicyAppliesTo.setDataType(String)",
    "void V3DLPPolicyAppliesTo.setRules(List)",
    "String V3DLPPolicyAppliesTo.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V3DLPPolicyAppliesTo actualV3dlpPolicyAppliesTo = new V3DLPPolicyAppliesTo();
    V3DLPPolicyAppliesTo actualActionResult = actualV3dlpPolicyAppliesTo.action("Action");
    V3DLPPolicyAppliesTo actualDataTypeResult = actualV3dlpPolicyAppliesTo.dataType("Data Type");
    V3DLPPolicyAppliesTo actualRulesResult = actualV3dlpPolicyAppliesTo.rules(new ArrayList<>());
    actualV3dlpPolicyAppliesTo.setAction("Action");
    actualV3dlpPolicyAppliesTo.setDataType("Data Type");
    ArrayList<V3DLPRule> rules = new ArrayList<>();
    actualV3dlpPolicyAppliesTo.setRules(rules);
    String actualToStringResult = actualV3dlpPolicyAppliesTo.toString();
    String actualAction = actualV3dlpPolicyAppliesTo.getAction();
    String actualDataType = actualV3dlpPolicyAppliesTo.getDataType();
    List<V3DLPRule> actualRules = actualV3dlpPolicyAppliesTo.getRules();

    // Assert
    assertEquals("Action", actualAction);
    assertEquals("Data Type", actualDataType);
    assertEquals(
        "class V3DLPPolicyAppliesTo {\n    dataType: Data Type\n    action: Action\n    rules: []\n}",
        actualToStringResult);
    assertTrue(actualRules.isEmpty());
    assertSame(actualV3dlpPolicyAppliesTo, actualActionResult);
    assertSame(actualV3dlpPolicyAppliesTo, actualDataTypeResult);
    assertSame(actualV3dlpPolicyAppliesTo, actualRulesResult);
    assertSame(rules, actualRules);
  }
}
