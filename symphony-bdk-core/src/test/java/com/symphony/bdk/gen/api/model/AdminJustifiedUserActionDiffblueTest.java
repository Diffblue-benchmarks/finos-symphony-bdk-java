package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AdminJustifiedUserActionDiffblueTest {
  /**
   * Test {@link AdminJustifiedUserAction#equals(Object)}, and {@link
   * AdminJustifiedUserAction#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AdminJustifiedUserAction#equals(Object)}
   *   <li>{@link AdminJustifiedUserAction#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminJustifiedUserAction.equals(Object)",
    "int AdminJustifiedUserAction.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AdminJustifiedUserAction adminJustifiedUserAction = new AdminJustifiedUserAction();
    AdminJustifiedUserAction adminJustifiedUserAction2 = new AdminJustifiedUserAction();

    // Act and Assert
    assertEquals(adminJustifiedUserAction, adminJustifiedUserAction2);
    assertEquals(adminJustifiedUserAction.hashCode(), adminJustifiedUserAction2.hashCode());
  }

  /**
   * Test {@link AdminJustifiedUserAction#equals(Object)}, and {@link
   * AdminJustifiedUserAction#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AdminJustifiedUserAction#equals(Object)}
   *   <li>{@link AdminJustifiedUserAction#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminJustifiedUserAction.equals(Object)",
    "int AdminJustifiedUserAction.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AdminJustifiedUserAction adminJustifiedUserAction = new AdminJustifiedUserAction();

    // Act and Assert
    assertEquals(adminJustifiedUserAction, adminJustifiedUserAction);
    int expectedHashCodeResult = adminJustifiedUserAction.hashCode();
    assertEquals(expectedHashCodeResult, adminJustifiedUserAction.hashCode());
  }

  /**
   * Test {@link AdminJustifiedUserAction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminJustifiedUserAction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminJustifiedUserAction.equals(Object)",
    "int AdminJustifiedUserAction.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AdminJustifiedUserAction(), 1);
  }

  /**
   * Test {@link AdminJustifiedUserAction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminJustifiedUserAction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminJustifiedUserAction.equals(Object)",
    "int AdminJustifiedUserAction.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    AdminJustifiedUserAction adminJustifiedUserAction = new AdminJustifiedUserAction();
    adminJustifiedUserAction.userId(1L);

    // Act and Assert
    assertNotEquals(adminJustifiedUserAction, new AdminJustifiedUserAction());
  }

  /**
   * Test {@link AdminJustifiedUserAction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminJustifiedUserAction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminJustifiedUserAction.equals(Object)",
    "int AdminJustifiedUserAction.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    AdminJustifiedUserAction adminJustifiedUserAction = new AdminJustifiedUserAction();
    adminJustifiedUserAction.justification("Justification");

    // Act and Assert
    assertNotEquals(adminJustifiedUserAction, new AdminJustifiedUserAction());
  }

  /**
   * Test {@link AdminJustifiedUserAction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminJustifiedUserAction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminJustifiedUserAction.equals(Object)",
    "int AdminJustifiedUserAction.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AdminJustifiedUserAction(), null);
  }

  /**
   * Test {@link AdminJustifiedUserAction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminJustifiedUserAction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminJustifiedUserAction.equals(Object)",
    "int AdminJustifiedUserAction.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AdminJustifiedUserAction(), "Different type to AdminJustifiedUserAction");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link AdminJustifiedUserAction}
   *   <li>{@link AdminJustifiedUserAction#justification(String)}
   *   <li>{@link AdminJustifiedUserAction#setJustification(String)}
   *   <li>{@link AdminJustifiedUserAction#setUserId(Long)}
   *   <li>{@link AdminJustifiedUserAction#userId(Long)}
   *   <li>{@link AdminJustifiedUserAction#toString()}
   *   <li>{@link AdminJustifiedUserAction#getJustification()}
   *   <li>{@link AdminJustifiedUserAction#getUserId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AdminJustifiedUserAction.<init>()",
    "String AdminJustifiedUserAction.getJustification()",
    "Long AdminJustifiedUserAction.getUserId()",
    "AdminJustifiedUserAction AdminJustifiedUserAction.justification(String)",
    "void AdminJustifiedUserAction.setJustification(String)",
    "void AdminJustifiedUserAction.setUserId(Long)",
    "String AdminJustifiedUserAction.toString()",
    "AdminJustifiedUserAction AdminJustifiedUserAction.userId(Long)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    AdminJustifiedUserAction actualAdminJustifiedUserAction = new AdminJustifiedUserAction();
    AdminJustifiedUserAction actualJustificationResult =
        actualAdminJustifiedUserAction.justification("Justification");
    actualAdminJustifiedUserAction.setJustification("Justification");
    actualAdminJustifiedUserAction.setUserId(1L);
    AdminJustifiedUserAction actualUserIdResult = actualAdminJustifiedUserAction.userId(1L);
    String actualToStringResult = actualAdminJustifiedUserAction.toString();
    String actualJustification = actualAdminJustifiedUserAction.getJustification();

    // Assert
    assertEquals("Justification", actualJustification);
    assertEquals(
        "class AdminJustifiedUserAction {\n    userId: 1\n    justification: Justification\n}",
        actualToStringResult);
    assertEquals(1L, actualAdminJustifiedUserAction.getUserId().longValue());
    assertSame(actualAdminJustifiedUserAction, actualJustificationResult);
    assertSame(actualAdminJustifiedUserAction, actualUserIdResult);
  }
}
