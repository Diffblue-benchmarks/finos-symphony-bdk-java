package com.symphony.bdk.ext.group.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class InteractionControlDiffblueTest {
  /**
   * Test {@link InteractionControl#equals(Object)}, and {@link InteractionControl#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link InteractionControl#equals(Object)}
   *   <li>{@link InteractionControl#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean InteractionControl.equals(Object)",
    "int InteractionControl.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    InteractionControl interactionControl = new InteractionControl();
    InteractionControl interactionControl2 = new InteractionControl();

    // Act and Assert
    assertEquals(interactionControl, interactionControl2);
    int expectedHashCodeResult = interactionControl.hashCode();
    assertEquals(expectedHashCodeResult, interactionControl2.hashCode());
  }

  /**
   * Test {@link InteractionControl#equals(Object)}, and {@link InteractionControl#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link InteractionControl#equals(Object)}
   *   <li>{@link InteractionControl#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean InteractionControl.equals(Object)",
    "int InteractionControl.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    InteractionControl interactionControl = new InteractionControl();

    // Act and Assert
    assertEquals(interactionControl, interactionControl);
    int expectedHashCodeResult = interactionControl.hashCode();
    assertEquals(expectedHashCodeResult, interactionControl.hashCode());
  }

  /**
   * Test {@link InteractionControl#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link InteractionControl#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean InteractionControl.equals(Object)",
    "int InteractionControl.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new InteractionControl(), 1);
  }

  /**
   * Test {@link InteractionControl#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link InteractionControl#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean InteractionControl.equals(Object)",
    "int InteractionControl.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    InteractionControl interactionControl = new InteractionControl();
    interactionControl.allowIMs(true);

    // Act and Assert
    assertNotEquals(interactionControl, new InteractionControl());
  }

  /**
   * Test {@link InteractionControl#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link InteractionControl#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean InteractionControl.equals(Object)",
    "int InteractionControl.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    InteractionControl interactionControl = new InteractionControl();
    interactionControl.allowRooms(true);

    // Act and Assert
    assertNotEquals(interactionControl, new InteractionControl());
  }

  /**
   * Test {@link InteractionControl#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link InteractionControl#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean InteractionControl.equals(Object)",
    "int InteractionControl.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    InteractionControl interactionControl = new InteractionControl();
    interactionControl.interactionTransfer(new InteractionTransfer());

    // Act and Assert
    assertNotEquals(interactionControl, new InteractionControl());
  }

  /**
   * Test {@link InteractionControl#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link InteractionControl#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean InteractionControl.equals(Object)",
    "int InteractionControl.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    InteractionControl interactionControl = new InteractionControl();
    interactionControl.tagStream("Tag Stream");

    // Act and Assert
    assertNotEquals(interactionControl, new InteractionControl());
  }

  /**
   * Test {@link InteractionControl#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link InteractionControl#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean InteractionControl.equals(Object)",
    "int InteractionControl.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    InteractionControl interactionControl = new InteractionControl();
    interactionControl.canHaveInteraction(false);

    // Act and Assert
    assertNotEquals(interactionControl, new InteractionControl());
  }

  /**
   * Test {@link InteractionControl#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link InteractionControl#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean InteractionControl.equals(Object)",
    "int InteractionControl.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new InteractionControl(), null);
  }

  /**
   * Test {@link InteractionControl#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link InteractionControl#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean InteractionControl.equals(Object)",
    "int InteractionControl.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new InteractionControl(), "Different type to InteractionControl");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link InteractionControl}
   *   <li>{@link InteractionControl#allowIMs(Boolean)}
   *   <li>{@link InteractionControl#allowRooms(Boolean)}
   *   <li>{@link InteractionControl#canHaveInteraction(Boolean)}
   *   <li>{@link InteractionControl#interactionTransfer(InteractionTransfer)}
   *   <li>{@link InteractionControl#setAllowIMs(Boolean)}
   *   <li>{@link InteractionControl#setAllowRooms(Boolean)}
   *   <li>{@link InteractionControl#setCanHaveInteraction(Boolean)}
   *   <li>{@link InteractionControl#setInteractionTransfer(InteractionTransfer)}
   *   <li>{@link InteractionControl#setTagStream(String)}
   *   <li>{@link InteractionControl#tagStream(String)}
   *   <li>{@link InteractionControl#toString()}
   *   <li>{@link InteractionControl#getAllowIMs()}
   *   <li>{@link InteractionControl#getAllowRooms()}
   *   <li>{@link InteractionControl#getCanHaveInteraction()}
   *   <li>{@link InteractionControl#getInteractionTransfer()}
   *   <li>{@link InteractionControl#getTagStream()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void InteractionControl.<init>()",
    "InteractionControl InteractionControl.allowIMs(Boolean)",
    "InteractionControl InteractionControl.allowRooms(Boolean)",
    "InteractionControl InteractionControl.canHaveInteraction(Boolean)",
    "Boolean InteractionControl.getAllowIMs()",
    "Boolean InteractionControl.getAllowRooms()",
    "Boolean InteractionControl.getCanHaveInteraction()",
    "InteractionTransfer InteractionControl.getInteractionTransfer()",
    "String InteractionControl.getTagStream()",
    "InteractionControl InteractionControl.interactionTransfer(InteractionTransfer)",
    "void InteractionControl.setAllowIMs(Boolean)",
    "void InteractionControl.setAllowRooms(Boolean)",
    "void InteractionControl.setCanHaveInteraction(Boolean)",
    "void InteractionControl.setInteractionTransfer(InteractionTransfer)",
    "void InteractionControl.setTagStream(String)",
    "InteractionControl InteractionControl.tagStream(String)",
    "String InteractionControl.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    InteractionControl actualInteractionControl = new InteractionControl();
    InteractionControl actualAllowIMsResult = actualInteractionControl.allowIMs(true);
    InteractionControl actualAllowRoomsResult = actualInteractionControl.allowRooms(true);
    InteractionControl actualCanHaveInteractionResult =
        actualInteractionControl.canHaveInteraction(true);
    InteractionControl actualInteractionTransferResult =
        actualInteractionControl.interactionTransfer(new InteractionTransfer());
    actualInteractionControl.setAllowIMs(true);
    actualInteractionControl.setAllowRooms(true);
    actualInteractionControl.setCanHaveInteraction(true);
    InteractionTransfer interactionTransfer = new InteractionTransfer();
    actualInteractionControl.setInteractionTransfer(interactionTransfer);
    actualInteractionControl.setTagStream("Tag Stream");
    InteractionControl actualTagStreamResult = actualInteractionControl.tagStream("Tag Stream");
    String actualToStringResult = actualInteractionControl.toString();
    Boolean actualAllowIMs = actualInteractionControl.getAllowIMs();
    Boolean actualAllowRooms = actualInteractionControl.getAllowRooms();
    Boolean actualCanHaveInteraction = actualInteractionControl.getCanHaveInteraction();
    InteractionTransfer actualInteractionTransfer =
        actualInteractionControl.getInteractionTransfer();

    // Assert
    assertEquals("Tag Stream", actualInteractionControl.getTagStream());
    assertEquals(
        "class InteractionControl {\n"
            + "    allowIMs: true\n"
            + "    allowRooms: true\n"
            + "    interactionTransfer: class InteractionTransfer {\n"
            + "        target: null\n"
            + "        updateInteractionOngroupUpdate: null\n"
            + "        systemMessageOnInteraction: null\n"
            + "        transferView: null\n"
            + "        auditTransfer: null\n"
            + "    }\n"
            + "    tagStream: Tag Stream\n"
            + "    canHaveInteraction: true\n"
            + "}",
        actualToStringResult);
    assertTrue(actualAllowIMs);
    assertTrue(actualAllowRooms);
    assertTrue(actualCanHaveInteraction);
    assertSame(actualInteractionControl, actualAllowIMsResult);
    assertSame(actualInteractionControl, actualAllowRoomsResult);
    assertSame(actualInteractionControl, actualCanHaveInteractionResult);
    assertSame(actualInteractionControl, actualInteractionTransferResult);
    assertSame(actualInteractionControl, actualTagStreamResult);
    assertSame(interactionTransfer, actualInteractionTransfer);
  }
}
