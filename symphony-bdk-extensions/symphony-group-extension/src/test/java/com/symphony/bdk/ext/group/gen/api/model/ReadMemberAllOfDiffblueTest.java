package com.symphony.bdk.ext.group.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.ext.group.gen.api.model.ReadMemberAllOf.StatusEnum;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ReadMemberAllOfDiffblueTest {
  /**
   * Test {@link ReadMemberAllOf#equals(Object)}, and {@link ReadMemberAllOf#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ReadMemberAllOf#equals(Object)}
   *   <li>{@link ReadMemberAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadMemberAllOf.equals(Object)", "int ReadMemberAllOf.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ReadMemberAllOf readMemberAllOf = new ReadMemberAllOf();
    ReadMemberAllOf readMemberAllOf2 = new ReadMemberAllOf();

    // Act and Assert
    assertEquals(readMemberAllOf, readMemberAllOf2);
    assertEquals(readMemberAllOf.hashCode(), readMemberAllOf2.hashCode());
  }

  /**
   * Test {@link ReadMemberAllOf#equals(Object)}, and {@link ReadMemberAllOf#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ReadMemberAllOf#equals(Object)}
   *   <li>{@link ReadMemberAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadMemberAllOf.equals(Object)", "int ReadMemberAllOf.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ReadMemberAllOf readMemberAllOf = new ReadMemberAllOf();

    // Act and Assert
    assertEquals(readMemberAllOf, readMemberAllOf);
    int expectedHashCodeResult = readMemberAllOf.hashCode();
    assertEquals(expectedHashCodeResult, readMemberAllOf.hashCode());
  }

  /**
   * Test {@link ReadMemberAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadMemberAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadMemberAllOf.equals(Object)", "int ReadMemberAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ReadMemberAllOf readMemberAllOf = new ReadMemberAllOf();
    OffsetDateTime addedDate =
        OffsetDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.MIDNIGHT, ZoneOffset.UTC);
    readMemberAllOf.addedDate(addedDate);

    // Act and Assert
    assertNotEquals(readMemberAllOf, new ReadMemberAllOf());
  }

  /**
   * Test {@link ReadMemberAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadMemberAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadMemberAllOf.equals(Object)", "int ReadMemberAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ReadMemberAllOf readMemberAllOf = new ReadMemberAllOf();
    readMemberAllOf.status(StatusEnum.ENABLED);

    // Act and Assert
    assertNotEquals(readMemberAllOf, new ReadMemberAllOf());
  }

  /**
   * Test {@link ReadMemberAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadMemberAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadMemberAllOf.equals(Object)", "int ReadMemberAllOf.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ReadMemberAllOf(), null);
  }

  /**
   * Test {@link ReadMemberAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadMemberAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadMemberAllOf.equals(Object)", "int ReadMemberAllOf.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ReadMemberAllOf(), "Different type to ReadMemberAllOf");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link ReadMemberAllOf}
   *   <li>{@link ReadMemberAllOf#setAddedDate(OffsetDateTime)}
   *   <li>{@link ReadMemberAllOf#setStatus(StatusEnum)}
   *   <li>{@link ReadMemberAllOf#status(StatusEnum)}
   *   <li>{@link ReadMemberAllOf#addedDate(OffsetDateTime)}
   *   <li>{@link ReadMemberAllOf#toString()}
   *   <li>{@link ReadMemberAllOf#getAddedDate()}
   *   <li>{@link ReadMemberAllOf#getStatus()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ReadMemberAllOf.<init>()",
    "ReadMemberAllOf ReadMemberAllOf.addedDate(OffsetDateTime)",
    "OffsetDateTime ReadMemberAllOf.getAddedDate()",
    "StatusEnum ReadMemberAllOf.getStatus()",
    "void ReadMemberAllOf.setAddedDate(OffsetDateTime)",
    "void ReadMemberAllOf.setStatus(StatusEnum)",
    "ReadMemberAllOf ReadMemberAllOf.status(StatusEnum)",
    "String ReadMemberAllOf.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    ReadMemberAllOf actualReadMemberAllOf = new ReadMemberAllOf();
    OffsetDateTime addedDate =
        OffsetDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.MIDNIGHT, ZoneOffset.UTC);
    actualReadMemberAllOf.setAddedDate(addedDate);
    actualReadMemberAllOf.setStatus(StatusEnum.ENABLED);
    ReadMemberAllOf actualStatusResult = actualReadMemberAllOf.status(StatusEnum.ENABLED);
    OffsetDateTime addedDate2 =
        OffsetDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.MIDNIGHT, ZoneOffset.UTC);
    ReadMemberAllOf actualAddedDateResult = actualReadMemberAllOf.addedDate(addedDate2);
    String actualToStringResult = actualReadMemberAllOf.toString();
    OffsetDateTime actualAddedDate = actualReadMemberAllOf.getAddedDate();

    // Assert
    assertEquals(
        "class ReadMemberAllOf {\n    addedDate: 1970-01-01T00:00Z\n    status: ENABLED\n}",
        actualToStringResult);
    assertEquals(StatusEnum.ENABLED, actualReadMemberAllOf.getStatus());
    assertSame(actualReadMemberAllOf, actualAddedDateResult);
    assertSame(actualReadMemberAllOf, actualStatusResult);
    assertSame(addedDate2, actualAddedDate);
  }

  /**
   * Test StatusEnum {@link StatusEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link StatusEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test StatusEnum fromValue(String); when '42'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StatusEnum StatusEnum.fromValue(String)"})
  void testStatusEnumFromValue_when42_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(StatusEnum.fromValue("42"));
  }

  /**
   * Test StatusEnum {@link StatusEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code ENABLED}.
   *   <li>Then return {@code ENABLED}.
   * </ul>
   *
   * <p>Method under test: {@link StatusEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test StatusEnum fromValue(String); when 'ENABLED'; then return 'ENABLED'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StatusEnum StatusEnum.fromValue(String)"})
  void testStatusEnumFromValue_whenEnabled_thenReturnEnabled() {
    // Arrange, Act and Assert
    assertEquals(StatusEnum.ENABLED, StatusEnum.fromValue("ENABLED"));
  }

  /**
   * Test StatusEnum getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link StatusEnum#toString()}
   *   <li>{@link StatusEnum#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test StatusEnum getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String StatusEnum.getValue()", "String StatusEnum.toString()"})
  void testStatusEnumGettersAndSetters() {
    // Arrange
    StatusEnum valueOfResult = StatusEnum.valueOf("ENABLED");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("ENABLED", valueOfResult.getValue());
    assertEquals("ENABLED", actualToStringResult);
  }
}
