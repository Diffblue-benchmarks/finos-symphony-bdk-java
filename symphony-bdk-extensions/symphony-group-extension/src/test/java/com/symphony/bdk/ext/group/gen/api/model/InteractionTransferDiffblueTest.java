package com.symphony.bdk.ext.group.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.ext.group.gen.api.model.InteractionTransfer.TargetEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class InteractionTransferDiffblueTest {
  /**
   * Test {@link InteractionTransfer#equals(Object)}, and {@link InteractionTransfer#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link InteractionTransfer#equals(Object)}
   *   <li>{@link InteractionTransfer#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean InteractionTransfer.equals(Object)",
    "int InteractionTransfer.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    InteractionTransfer interactionTransfer = new InteractionTransfer();
    InteractionTransfer interactionTransfer2 = new InteractionTransfer();

    // Act and Assert
    assertEquals(interactionTransfer, interactionTransfer2);
    assertEquals(interactionTransfer.hashCode(), interactionTransfer2.hashCode());
  }

  /**
   * Test {@link InteractionTransfer#equals(Object)}, and {@link InteractionTransfer#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link InteractionTransfer#equals(Object)}
   *   <li>{@link InteractionTransfer#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean InteractionTransfer.equals(Object)",
    "int InteractionTransfer.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    InteractionTransfer interactionTransfer = new InteractionTransfer();

    // Act and Assert
    assertEquals(interactionTransfer, interactionTransfer);
    int expectedHashCodeResult = interactionTransfer.hashCode();
    assertEquals(expectedHashCodeResult, interactionTransfer.hashCode());
  }

  /**
   * Test {@link InteractionTransfer#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link InteractionTransfer#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean InteractionTransfer.equals(Object)",
    "int InteractionTransfer.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new InteractionTransfer(), 1);
  }

  /**
   * Test {@link InteractionTransfer#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link InteractionTransfer#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean InteractionTransfer.equals(Object)",
    "int InteractionTransfer.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    InteractionTransfer interactionTransfer = new InteractionTransfer();
    interactionTransfer.target(TargetEnum.TO_USER);

    // Act and Assert
    assertNotEquals(interactionTransfer, new InteractionTransfer());
  }

  /**
   * Test {@link InteractionTransfer#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link InteractionTransfer#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean InteractionTransfer.equals(Object)",
    "int InteractionTransfer.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    InteractionTransfer interactionTransfer = new InteractionTransfer();
    interactionTransfer.updateInteractionOngroupUpdate(true);

    // Act and Assert
    assertNotEquals(interactionTransfer, new InteractionTransfer());
  }

  /**
   * Test {@link InteractionTransfer#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link InteractionTransfer#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean InteractionTransfer.equals(Object)",
    "int InteractionTransfer.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    InteractionTransfer interactionTransfer = new InteractionTransfer();
    interactionTransfer.systemMessageOnInteraction(true);

    // Act and Assert
    assertNotEquals(interactionTransfer, new InteractionTransfer());
  }

  /**
   * Test {@link InteractionTransfer#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link InteractionTransfer#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean InteractionTransfer.equals(Object)",
    "int InteractionTransfer.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    InteractionTransfer interactionTransfer = new InteractionTransfer();
    interactionTransfer.transferView(new TransferView());

    // Act and Assert
    assertNotEquals(interactionTransfer, new InteractionTransfer());
  }

  /**
   * Test {@link InteractionTransfer#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link InteractionTransfer#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean InteractionTransfer.equals(Object)",
    "int InteractionTransfer.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    InteractionTransfer interactionTransfer = new InteractionTransfer();
    interactionTransfer.auditTransfer(true);

    // Act and Assert
    assertNotEquals(interactionTransfer, new InteractionTransfer());
  }

  /**
   * Test {@link InteractionTransfer#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link InteractionTransfer#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean InteractionTransfer.equals(Object)",
    "int InteractionTransfer.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new InteractionTransfer(), null);
  }

  /**
   * Test {@link InteractionTransfer#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link InteractionTransfer#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean InteractionTransfer.equals(Object)",
    "int InteractionTransfer.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new InteractionTransfer(), "Different type to InteractionTransfer");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link InteractionTransfer}
   *   <li>{@link InteractionTransfer#auditTransfer(Boolean)}
   *   <li>{@link InteractionTransfer#setAuditTransfer(Boolean)}
   *   <li>{@link InteractionTransfer#setSystemMessageOnInteraction(Boolean)}
   *   <li>{@link InteractionTransfer#setTarget(TargetEnum)}
   *   <li>{@link InteractionTransfer#setTransferView(TransferView)}
   *   <li>{@link InteractionTransfer#setUpdateInteractionOngroupUpdate(Boolean)}
   *   <li>{@link InteractionTransfer#systemMessageOnInteraction(Boolean)}
   *   <li>{@link InteractionTransfer#target(TargetEnum)}
   *   <li>{@link InteractionTransfer#transferView(TransferView)}
   *   <li>{@link InteractionTransfer#updateInteractionOngroupUpdate(Boolean)}
   *   <li>{@link InteractionTransfer#toString()}
   *   <li>{@link InteractionTransfer#getAuditTransfer()}
   *   <li>{@link InteractionTransfer#getSystemMessageOnInteraction()}
   *   <li>{@link InteractionTransfer#getTarget()}
   *   <li>{@link InteractionTransfer#getTransferView()}
   *   <li>{@link InteractionTransfer#getUpdateInteractionOngroupUpdate()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void InteractionTransfer.<init>()",
    "InteractionTransfer InteractionTransfer.auditTransfer(Boolean)",
    "Boolean InteractionTransfer.getAuditTransfer()",
    "Boolean InteractionTransfer.getSystemMessageOnInteraction()",
    "TargetEnum InteractionTransfer.getTarget()",
    "TransferView InteractionTransfer.getTransferView()",
    "Boolean InteractionTransfer.getUpdateInteractionOngroupUpdate()",
    "void InteractionTransfer.setAuditTransfer(Boolean)",
    "void InteractionTransfer.setSystemMessageOnInteraction(Boolean)",
    "void InteractionTransfer.setTarget(TargetEnum)",
    "void InteractionTransfer.setTransferView(TransferView)",
    "void InteractionTransfer.setUpdateInteractionOngroupUpdate(Boolean)",
    "InteractionTransfer InteractionTransfer.systemMessageOnInteraction(Boolean)",
    "InteractionTransfer InteractionTransfer.target(TargetEnum)",
    "String InteractionTransfer.toString()",
    "InteractionTransfer InteractionTransfer.transferView(TransferView)",
    "InteractionTransfer InteractionTransfer.updateInteractionOngroupUpdate(Boolean)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    InteractionTransfer actualInteractionTransfer = new InteractionTransfer();
    InteractionTransfer actualAuditTransferResult = actualInteractionTransfer.auditTransfer(true);
    actualInteractionTransfer.setAuditTransfer(true);
    actualInteractionTransfer.setSystemMessageOnInteraction(true);
    actualInteractionTransfer.setTarget(TargetEnum.TO_USER);
    actualInteractionTransfer.setTransferView(new TransferView());
    actualInteractionTransfer.setUpdateInteractionOngroupUpdate(true);
    InteractionTransfer actualSystemMessageOnInteractionResult =
        actualInteractionTransfer.systemMessageOnInteraction(true);
    InteractionTransfer actualTargetResult = actualInteractionTransfer.target(TargetEnum.TO_USER);
    TransferView transferView = new TransferView();
    InteractionTransfer actualTransferViewResult =
        actualInteractionTransfer.transferView(transferView);
    InteractionTransfer actualUpdateInteractionOngroupUpdateResult =
        actualInteractionTransfer.updateInteractionOngroupUpdate(true);
    String actualToStringResult = actualInteractionTransfer.toString();
    Boolean actualAuditTransfer = actualInteractionTransfer.getAuditTransfer();
    Boolean actualSystemMessageOnInteraction =
        actualInteractionTransfer.getSystemMessageOnInteraction();
    TargetEnum actualTarget = actualInteractionTransfer.getTarget();
    TransferView actualTransferView = actualInteractionTransfer.getTransferView();

    // Assert
    assertEquals(
        "class InteractionTransfer {\n"
            + "    target: TO_USER\n"
            + "    updateInteractionOngroupUpdate: true\n"
            + "    systemMessageOnInteraction: true\n"
            + "    transferView: class TransferView {\n"
            + "        visible: null\n"
            + "        restrictToTenants: null\n"
            + "        restrictToUsers: null\n"
            + "    }\n"
            + "    auditTransfer: true\n"
            + "}",
        actualToStringResult);
    assertEquals(TargetEnum.TO_USER, actualTarget);
    assertTrue(actualAuditTransfer);
    assertTrue(actualSystemMessageOnInteraction);
    assertTrue(actualInteractionTransfer.getUpdateInteractionOngroupUpdate());
    assertSame(actualInteractionTransfer, actualAuditTransferResult);
    assertSame(actualInteractionTransfer, actualSystemMessageOnInteractionResult);
    assertSame(actualInteractionTransfer, actualTargetResult);
    assertSame(actualInteractionTransfer, actualTransferViewResult);
    assertSame(actualInteractionTransfer, actualUpdateInteractionOngroupUpdateResult);
    assertSame(transferView, actualTransferView);
  }

  /**
   * Test TargetEnum {@link TargetEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link TargetEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test TargetEnum fromValue(String); when '42'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TargetEnum TargetEnum.fromValue(String)"})
  void testTargetEnumFromValue_when42_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(TargetEnum.fromValue("42"));
  }

  /**
   * Test TargetEnum {@link TargetEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code TO_USER}.
   *   <li>Then return {@code TO_USER}.
   * </ul>
   *
   * <p>Method under test: {@link TargetEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test TargetEnum fromValue(String); when 'TO_USER'; then return 'TO_USER'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TargetEnum TargetEnum.fromValue(String)"})
  void testTargetEnumFromValue_whenToUser_thenReturnToUser() {
    // Arrange, Act and Assert
    assertEquals(TargetEnum.TO_USER, TargetEnum.fromValue("TO_USER"));
  }

  /**
   * Test TargetEnum getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TargetEnum#toString()}
   *   <li>{@link TargetEnum#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test TargetEnum getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String TargetEnum.getValue()", "String TargetEnum.toString()"})
  void testTargetEnumGettersAndSetters() {
    // Arrange
    TargetEnum valueOfResult = TargetEnum.valueOf("TO_USER");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("TO_USER", valueOfResult.getValue());
    assertEquals("TO_USER", actualToStringResult);
  }
}
