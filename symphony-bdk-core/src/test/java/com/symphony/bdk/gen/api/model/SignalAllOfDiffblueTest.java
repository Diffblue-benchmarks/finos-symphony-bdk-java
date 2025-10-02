package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SignalAllOfDiffblueTest {
  /**
   * Test {@link SignalAllOf#equals(Object)}, and {@link SignalAllOf#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SignalAllOf#equals(Object)}
   *   <li>{@link SignalAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SignalAllOf.equals(Object)", "int SignalAllOf.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    SignalAllOf signalAllOf = new SignalAllOf();
    SignalAllOf signalAllOf2 = new SignalAllOf();

    // Act and Assert
    assertEquals(signalAllOf, signalAllOf2);
    assertEquals(signalAllOf.hashCode(), signalAllOf2.hashCode());
  }

  /**
   * Test {@link SignalAllOf#equals(Object)}, and {@link SignalAllOf#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SignalAllOf#equals(Object)}
   *   <li>{@link SignalAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SignalAllOf.equals(Object)", "int SignalAllOf.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    SignalAllOf signalAllOf = new SignalAllOf();

    // Act and Assert
    assertEquals(signalAllOf, signalAllOf);
    int expectedHashCodeResult = signalAllOf.hashCode();
    assertEquals(expectedHashCodeResult, signalAllOf.hashCode());
  }

  /**
   * Test {@link SignalAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SignalAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SignalAllOf.equals(Object)", "int SignalAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new SignalAllOf(), 1);
  }

  /**
   * Test {@link SignalAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SignalAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SignalAllOf.equals(Object)", "int SignalAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    SignalAllOf signalAllOf = new SignalAllOf();
    signalAllOf.id("42");

    // Act and Assert
    assertNotEquals(signalAllOf, new SignalAllOf());
  }

  /**
   * Test {@link SignalAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SignalAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SignalAllOf.equals(Object)", "int SignalAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    SignalAllOf signalAllOf = new SignalAllOf();
    signalAllOf.timestamp(10L);

    // Act and Assert
    assertNotEquals(signalAllOf, new SignalAllOf());
  }

  /**
   * Test {@link SignalAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SignalAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SignalAllOf.equals(Object)", "int SignalAllOf.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new SignalAllOf(), null);
  }

  /**
   * Test {@link SignalAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SignalAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SignalAllOf.equals(Object)", "int SignalAllOf.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new SignalAllOf(), "Different type to SignalAllOf");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link SignalAllOf}
   *   <li>{@link SignalAllOf#id(String)}
   *   <li>{@link SignalAllOf#setId(String)}
   *   <li>{@link SignalAllOf#setTimestamp(Long)}
   *   <li>{@link SignalAllOf#timestamp(Long)}
   *   <li>{@link SignalAllOf#toString()}
   *   <li>{@link SignalAllOf#getId()}
   *   <li>{@link SignalAllOf#getTimestamp()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SignalAllOf.<init>()",
    "String SignalAllOf.getId()",
    "Long SignalAllOf.getTimestamp()",
    "SignalAllOf SignalAllOf.id(String)",
    "void SignalAllOf.setId(String)",
    "void SignalAllOf.setTimestamp(Long)",
    "SignalAllOf SignalAllOf.timestamp(Long)",
    "String SignalAllOf.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    SignalAllOf actualSignalAllOf = new SignalAllOf();
    SignalAllOf actualIdResult = actualSignalAllOf.id("42");
    actualSignalAllOf.setId("42");
    actualSignalAllOf.setTimestamp(10L);
    SignalAllOf actualTimestampResult = actualSignalAllOf.timestamp(10L);
    String actualToStringResult = actualSignalAllOf.toString();
    String actualId = actualSignalAllOf.getId();

    // Assert
    assertEquals("42", actualId);
    assertEquals("class SignalAllOf {\n    id: 42\n    timestamp: 10\n}", actualToStringResult);
    assertEquals(10L, actualSignalAllOf.getTimestamp().longValue());
    assertSame(actualSignalAllOf, actualIdResult);
    assertSame(actualSignalAllOf, actualTimestampResult);
  }
}
