package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.DelegateAction.ActionEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DelegateActionDiffblueTest {
  /**
   * Test ActionEnum {@link ActionEnum#fromValue(String)}.
   * <ul>
   *   <li>When {@code 42}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ActionEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test ActionEnum fromValue(String); when '42'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ActionEnum ActionEnum.fromValue(String)"})
  void testActionEnumFromValue_when42_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ActionEnum.fromValue("42"));
  }

  /**
   * Test ActionEnum {@link ActionEnum#fromValue(String)}.
   * <ul>
   *   <li>When {@code ADD}.</li>
   *   <li>Then return {@code ADD}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ActionEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test ActionEnum fromValue(String); when 'ADD'; then return 'ADD'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ActionEnum ActionEnum.fromValue(String)"})
  void testActionEnumFromValue_whenAdd_thenReturnAdd() {
    // Arrange, Act and Assert
    assertEquals(ActionEnum.ADD, ActionEnum.fromValue("ADD"));
  }

  /**
   * Test ActionEnum getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ActionEnum#toString()}
   *   <li>{@link ActionEnum#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test ActionEnum getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ActionEnum.getValue()", "String ActionEnum.toString()"})
  void testActionEnumGettersAndSetters() {
    // Arrange
    ActionEnum valueOfResult = ActionEnum.valueOf("ADD");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("ADD", valueOfResult.getValue());
    assertEquals("ADD", actualToStringResult);
  }

  /**
   * Test {@link DelegateAction#equals(Object)}, and {@link DelegateAction#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link DelegateAction#equals(Object)}
   *   <li>{@link DelegateAction#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean DelegateAction.equals(Object)", "int DelegateAction.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DelegateAction delegateAction = new DelegateAction();
    DelegateAction delegateAction2 = new DelegateAction();

    // Act and Assert
    assertEquals(delegateAction, delegateAction2);
    int expectedHashCodeResult = delegateAction.hashCode();
    assertEquals(expectedHashCodeResult, delegateAction2.hashCode());
  }

  /**
   * Test {@link DelegateAction#equals(Object)}, and {@link DelegateAction#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link DelegateAction#equals(Object)}
   *   <li>{@link DelegateAction#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean DelegateAction.equals(Object)", "int DelegateAction.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DelegateAction delegateAction = new DelegateAction();

    // Act and Assert
    assertEquals(delegateAction, delegateAction);
    int expectedHashCodeResult = delegateAction.hashCode();
    assertEquals(expectedHashCodeResult, delegateAction.hashCode());
  }

  /**
   * Test {@link DelegateAction#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link DelegateAction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean DelegateAction.equals(Object)", "int DelegateAction.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new DelegateAction(), 1);
  }

  /**
   * Test {@link DelegateAction#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link DelegateAction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean DelegateAction.equals(Object)", "int DelegateAction.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    DelegateAction delegateAction = new DelegateAction();
    delegateAction.userId(1L);

    // Act and Assert
    assertNotEquals(delegateAction, new DelegateAction());
  }

  /**
   * Test {@link DelegateAction#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link DelegateAction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean DelegateAction.equals(Object)", "int DelegateAction.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    DelegateAction delegateAction = new DelegateAction();
    delegateAction.action(ActionEnum.ADD);

    // Act and Assert
    assertNotEquals(delegateAction, new DelegateAction());
  }

  /**
   * Test {@link DelegateAction#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link DelegateAction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean DelegateAction.equals(Object)", "int DelegateAction.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new DelegateAction(), null);
  }

  /**
   * Test {@link DelegateAction#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link DelegateAction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean DelegateAction.equals(Object)", "int DelegateAction.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new DelegateAction(), "Different type to DelegateAction");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link DelegateAction}
   *   <li>{@link DelegateAction#action(ActionEnum)}
   *   <li>{@link DelegateAction#setAction(ActionEnum)}
   *   <li>{@link DelegateAction#setUserId(Long)}
   *   <li>{@link DelegateAction#userId(Long)}
   *   <li>{@link DelegateAction#toString()}
   *   <li>{@link DelegateAction#getAction()}
   *   <li>{@link DelegateAction#getUserId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void DelegateAction.<init>()", "DelegateAction DelegateAction.action(ActionEnum)",
      "ActionEnum DelegateAction.getAction()", "Long DelegateAction.getUserId()",
      "void DelegateAction.setAction(ActionEnum)", "void DelegateAction.setUserId(Long)",
      "String DelegateAction.toString()", "DelegateAction DelegateAction.userId(Long)"})
  void testGettersAndSetters() {
    // Arrange and Act
    DelegateAction actualDelegateAction = new DelegateAction();
    DelegateAction actualActionResult = actualDelegateAction.action(ActionEnum.ADD);
    actualDelegateAction.setAction(ActionEnum.ADD);
    actualDelegateAction.setUserId(1L);
    DelegateAction actualUserIdResult = actualDelegateAction.userId(1L);
    String actualToStringResult = actualDelegateAction.toString();
    ActionEnum actualAction = actualDelegateAction.getAction();

    // Assert
    assertEquals("class DelegateAction {\n    userId: 1\n    action: ADD\n}", actualToStringResult);
    assertEquals(1L, actualDelegateAction.getUserId().longValue());
    assertEquals(ActionEnum.ADD, actualAction);
    assertSame(actualDelegateAction, actualActionResult);
    assertSame(actualDelegateAction, actualUserIdResult);
  }
}
