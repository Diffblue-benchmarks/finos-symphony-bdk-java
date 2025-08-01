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

class SignalDiffblueTest {
  /**
   * Test {@link Signal#equals(Object)}, and {@link Signal#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Signal#equals(Object)}
   *   <li>{@link Signal#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Signal.equals(Object)", "int Signal.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Signal signal = new Signal();
    Signal signal2 = new Signal();

    // Act and Assert
    assertEquals(signal, signal2);
    int expectedHashCodeResult = signal.hashCode();
    assertEquals(expectedHashCodeResult, signal2.hashCode());
  }

  /**
   * Test {@link Signal#equals(Object)}, and {@link Signal#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Signal#equals(Object)}
   *   <li>{@link Signal#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Signal.equals(Object)", "int Signal.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Signal signal = new Signal();

    // Act and Assert
    assertEquals(signal, signal);
    int expectedHashCodeResult = signal.hashCode();
    assertEquals(expectedHashCodeResult, signal.hashCode());
  }

  /**
   * Test {@link Signal#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Signal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Signal.equals(Object)", "int Signal.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Signal(), 1);
  }

  /**
   * Test {@link Signal#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Signal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Signal.equals(Object)", "int Signal.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Signal signal = new Signal();
    signal.name("Name");

    // Act and Assert
    assertNotEquals(signal, new Signal());
  }

  /**
   * Test {@link Signal#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Signal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Signal.equals(Object)", "int Signal.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Signal signal = new Signal();
    signal.query("Query");

    // Act and Assert
    assertNotEquals(signal, new Signal());
  }

  /**
   * Test {@link Signal#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Signal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Signal.equals(Object)", "int Signal.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    Signal signal = new Signal();
    signal.visibleOnProfile(true);

    // Act and Assert
    assertNotEquals(signal, new Signal());
  }

  /**
   * Test {@link Signal#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Signal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Signal.equals(Object)", "int Signal.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    Signal signal = new Signal();
    signal.companyWide(true);

    // Act and Assert
    assertNotEquals(signal, new Signal());
  }

  /**
   * Test {@link Signal#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Signal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Signal.equals(Object)", "int Signal.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    Signal signal = new Signal();
    signal.id("42");

    // Act and Assert
    assertNotEquals(signal, new Signal());
  }

  /**
   * Test {@link Signal#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Signal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Signal.equals(Object)", "int Signal.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    Signal signal = new Signal();
    signal.timestamp(10L);

    // Act and Assert
    assertNotEquals(signal, new Signal());
  }

  /**
   * Test {@link Signal#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Signal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Signal.equals(Object)", "int Signal.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Signal(), null);
  }

  /**
   * Test {@link Signal#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Signal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Signal.equals(Object)", "int Signal.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Signal(), "Different type to Signal");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link Signal}
   *   <li>{@link Signal#companyWide(Boolean)}
   *   <li>{@link Signal#id(String)}
   *   <li>{@link Signal#name(String)}
   *   <li>{@link Signal#query(String)}
   *   <li>{@link Signal#setCompanyWide(Boolean)}
   *   <li>{@link Signal#setId(String)}
   *   <li>{@link Signal#setName(String)}
   *   <li>{@link Signal#setQuery(String)}
   *   <li>{@link Signal#setTimestamp(Long)}
   *   <li>{@link Signal#setVisibleOnProfile(Boolean)}
   *   <li>{@link Signal#timestamp(Long)}
   *   <li>{@link Signal#visibleOnProfile(Boolean)}
   *   <li>{@link Signal#toString()}
   *   <li>{@link Signal#getCompanyWide()}
   *   <li>{@link Signal#getId()}
   *   <li>{@link Signal#getName()}
   *   <li>{@link Signal#getQuery()}
   *   <li>{@link Signal#getTimestamp()}
   *   <li>{@link Signal#getVisibleOnProfile()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Signal.<init>()",
    "Signal Signal.companyWide(Boolean)",
    "Boolean Signal.getCompanyWide()",
    "String Signal.getId()",
    "String Signal.getName()",
    "String Signal.getQuery()",
    "Long Signal.getTimestamp()",
    "Boolean Signal.getVisibleOnProfile()",
    "Signal Signal.id(String)",
    "Signal Signal.name(String)",
    "Signal Signal.query(String)",
    "void Signal.setCompanyWide(Boolean)",
    "void Signal.setId(String)",
    "void Signal.setName(String)",
    "void Signal.setQuery(String)",
    "void Signal.setTimestamp(Long)",
    "void Signal.setVisibleOnProfile(Boolean)",
    "Signal Signal.timestamp(Long)",
    "String Signal.toString()",
    "Signal Signal.visibleOnProfile(Boolean)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    Signal actualSignal = new Signal();
    Signal actualCompanyWideResult = actualSignal.companyWide(true);
    Signal actualIdResult = actualSignal.id("42");
    Signal actualNameResult = actualSignal.name("Name");
    Signal actualQueryResult = actualSignal.query("Query");
    actualSignal.setCompanyWide(true);
    actualSignal.setId("42");
    actualSignal.setName("Name");
    actualSignal.setQuery("Query");
    actualSignal.setTimestamp(10L);
    actualSignal.setVisibleOnProfile(true);
    Signal actualTimestampResult = actualSignal.timestamp(10L);
    Signal actualVisibleOnProfileResult = actualSignal.visibleOnProfile(true);
    String actualToStringResult = actualSignal.toString();
    Boolean actualCompanyWide = actualSignal.getCompanyWide();
    String actualId = actualSignal.getId();
    String actualName = actualSignal.getName();
    String actualQuery = actualSignal.getQuery();
    Long actualTimestamp = actualSignal.getTimestamp();
    Boolean actualVisibleOnProfile = actualSignal.getVisibleOnProfile();

    // Assert
    assertEquals("42", actualId);
    assertEquals("Name", actualName);
    assertEquals("Query", actualQuery);
    assertEquals(
        "class Signal {\n"
            + "    name: Name\n"
            + "    query: Query\n"
            + "    visibleOnProfile: true\n"
            + "    companyWide: true\n"
            + "    id: 42\n"
            + "    timestamp: 10\n"
            + "}",
        actualToStringResult);
    assertEquals(10L, actualTimestamp.longValue());
    assertTrue(actualCompanyWide);
    assertTrue(actualVisibleOnProfile);
    assertSame(actualSignal, actualCompanyWideResult);
    assertSame(actualSignal, actualIdResult);
    assertSame(actualSignal, actualNameResult);
    assertSame(actualSignal, actualQueryResult);
    assertSame(actualSignal, actualTimestampResult);
    assertSame(actualSignal, actualVisibleOnProfileResult);
  }
}
