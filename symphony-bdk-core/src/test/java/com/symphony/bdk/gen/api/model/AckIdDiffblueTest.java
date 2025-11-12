package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AckIdDiffblueTest {
  /**
   * Test {@link AckId#equals(Object)}, and {@link AckId#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AckId#equals(Object)}
   *   <li>{@link AckId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AckId.equals(Object)", "int AckId.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AckId ackId = new AckId();
    AckId ackId2 = new AckId();

    // Act and Assert
    assertEquals(ackId, ackId2);
    assertEquals(ackId.hashCode(), ackId2.hashCode());
  }

  /**
   * Test {@link AckId#equals(Object)}, and {@link AckId#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AckId#equals(Object)}
   *   <li>{@link AckId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AckId.equals(Object)", "int AckId.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AckId ackId = new AckId();

    // Act and Assert
    assertEquals(ackId, ackId);
    int expectedHashCodeResult = ackId.hashCode();
    assertEquals(expectedHashCodeResult, ackId.hashCode());
  }

  /**
   * Test {@link AckId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AckId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AckId.equals(Object)", "int AckId.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AckId(), 1);
  }

  /**
   * Test {@link AckId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AckId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AckId.equals(Object)", "int AckId.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    AckId ackId = new AckId();
    ackId.ackId("42");

    // Act and Assert
    assertNotEquals(ackId, new AckId());
  }

  /**
   * Test {@link AckId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AckId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AckId.equals(Object)", "int AckId.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    AckId ackId = new AckId();
    ackId.updatePresence(false);

    // Act and Assert
    assertNotEquals(ackId, new AckId());
  }

  /**
   * Test {@link AckId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AckId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AckId.equals(Object)", "int AckId.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AckId(), null);
  }

  /**
   * Test {@link AckId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AckId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AckId.equals(Object)", "int AckId.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AckId(), "Different type to AckId");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link AckId}
   *   <li>{@link AckId#ackId(String)}
   *   <li>{@link AckId#setAckId(String)}
   *   <li>{@link AckId#setUpdatePresence(Boolean)}
   *   <li>{@link AckId#updatePresence(Boolean)}
   *   <li>{@link AckId#toString()}
   *   <li>{@link AckId#getAckId()}
   *   <li>{@link AckId#getUpdatePresence()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AckId.<init>()",
    "AckId AckId.ackId(String)",
    "String AckId.getAckId()",
    "Boolean AckId.getUpdatePresence()",
    "void AckId.setAckId(String)",
    "void AckId.setUpdatePresence(Boolean)",
    "String AckId.toString()",
    "AckId AckId.updatePresence(Boolean)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    AckId actualAckId = new AckId();
    AckId actualAckIdResult = actualAckId.ackId("42");
    actualAckId.setAckId("42");
    actualAckId.setUpdatePresence(true);
    AckId actualUpdatePresenceResult = actualAckId.updatePresence(true);
    String actualToStringResult = actualAckId.toString();
    String actualAckId2 = actualAckId.getAckId();

    // Assert
    assertEquals("42", actualAckId2);
    assertEquals("class AckId {\n    ackId: 42\n    updatePresence: true\n}", actualToStringResult);
    assertTrue(actualAckId.getUpdatePresence());
    assertSame(actualAckId, actualAckIdResult);
    assertSame(actualAckId, actualUpdatePresenceResult);
  }
}
