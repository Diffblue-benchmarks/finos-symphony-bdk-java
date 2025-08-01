package com.symphony.bdk.ext.group.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.ext.group.gen.api.model.ReadMember.StatusEnum;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ReadMemberDiffblueTest {
  /**
   * Test {@link ReadMember#equals(Object)}, and {@link ReadMember#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ReadMember#equals(Object)}
   *   <li>{@link ReadMember#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadMember.equals(Object)", "int ReadMember.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ReadMember readMember = new ReadMember();
    ReadMember readMember2 = new ReadMember();

    // Act and Assert
    assertEquals(readMember, readMember2);
    int expectedHashCodeResult = readMember.hashCode();
    assertEquals(expectedHashCodeResult, readMember2.hashCode());
  }

  /**
   * Test {@link ReadMember#equals(Object)}, and {@link ReadMember#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ReadMember#equals(Object)}
   *   <li>{@link ReadMember#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadMember.equals(Object)", "int ReadMember.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ReadMember readMember = new ReadMember();

    // Act and Assert
    assertEquals(readMember, readMember);
    int expectedHashCodeResult = readMember.hashCode();
    assertEquals(expectedHashCodeResult, readMember.hashCode());
  }

  /**
   * Test {@link ReadMember#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadMember#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadMember.equals(Object)", "int ReadMember.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ReadMember readMember = new ReadMember();
    readMember.addedDate(
        OffsetDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.MIDNIGHT, ZoneOffset.UTC));

    // Act and Assert
    assertNotEquals(readMember, new ReadMember());
  }

  /**
   * Test {@link ReadMember#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadMember#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadMember.equals(Object)", "int ReadMember.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ReadMember readMember = new ReadMember();
    readMember.memberTenant(1);
    readMember.addedDate(
        OffsetDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.MIDNIGHT, ZoneOffset.UTC));

    // Act and Assert
    assertNotEquals(readMember, new ReadMember());
  }

  /**
   * Test {@link ReadMember#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadMember#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadMember.equals(Object)", "int ReadMember.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ReadMember readMember = new ReadMember();
    readMember.memberId(1L);
    readMember.addedDate(
        OffsetDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.MIDNIGHT, ZoneOffset.UTC));

    // Act and Assert
    assertNotEquals(readMember, new ReadMember());
  }

  /**
   * Test {@link ReadMember#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadMember#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadMember.equals(Object)", "int ReadMember.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    ReadMember readMember = new ReadMember();
    readMember.status(StatusEnum.ENABLED);

    // Act and Assert
    assertNotEquals(readMember, new ReadMember());
  }

  /**
   * Test {@link ReadMember#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadMember#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadMember.equals(Object)", "int ReadMember.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ReadMember(), null);
  }

  /**
   * Test {@link ReadMember#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReadMember#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReadMember.equals(Object)", "int ReadMember.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ReadMember(), "Different type to ReadMember");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link ReadMember}
   *   <li>{@link ReadMember#memberId(Long)}
   *   <li>{@link ReadMember#memberTenant(Integer)}
   *   <li>{@link ReadMember#setAddedDate(OffsetDateTime)}
   *   <li>{@link ReadMember#setMemberId(Long)}
   *   <li>{@link ReadMember#setMemberTenant(Integer)}
   *   <li>{@link ReadMember#setStatus(StatusEnum)}
   *   <li>{@link ReadMember#status(StatusEnum)}
   *   <li>{@link ReadMember#addedDate(OffsetDateTime)}
   *   <li>{@link ReadMember#toString()}
   *   <li>{@link ReadMember#getAddedDate()}
   *   <li>{@link ReadMember#getMemberId()}
   *   <li>{@link ReadMember#getMemberTenant()}
   *   <li>{@link ReadMember#getStatus()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ReadMember.<init>()",
    "ReadMember ReadMember.addedDate(OffsetDateTime)",
    "OffsetDateTime ReadMember.getAddedDate()",
    "Long ReadMember.getMemberId()",
    "Integer ReadMember.getMemberTenant()",
    "StatusEnum ReadMember.getStatus()",
    "ReadMember ReadMember.memberId(Long)",
    "ReadMember ReadMember.memberTenant(Integer)",
    "void ReadMember.setAddedDate(OffsetDateTime)",
    "void ReadMember.setMemberId(Long)",
    "void ReadMember.setMemberTenant(Integer)",
    "void ReadMember.setStatus(StatusEnum)",
    "ReadMember ReadMember.status(StatusEnum)",
    "String ReadMember.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    ReadMember actualReadMember = new ReadMember();
    ReadMember actualMemberIdResult = actualReadMember.memberId(1L);
    ReadMember actualMemberTenantResult = actualReadMember.memberTenant(1);
    actualReadMember.setAddedDate(
        OffsetDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.MIDNIGHT, ZoneOffset.UTC));
    actualReadMember.setMemberId(1L);
    actualReadMember.setMemberTenant(1);
    actualReadMember.setStatus(StatusEnum.ENABLED);
    ReadMember actualStatusResult = actualReadMember.status(StatusEnum.ENABLED);
    OffsetDateTime addedDate =
        OffsetDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.MIDNIGHT, ZoneOffset.UTC);
    ReadMember actualAddedDateResult = actualReadMember.addedDate(addedDate);
    String actualToStringResult = actualReadMember.toString();
    OffsetDateTime actualAddedDate = actualReadMember.getAddedDate();
    Long actualMemberId = actualReadMember.getMemberId();
    Integer actualMemberTenant = actualReadMember.getMemberTenant();
    StatusEnum actualStatus = actualReadMember.getStatus();

    // Assert
    assertEquals(
        "class ReadMember {\n"
            + "    memberTenant: 1\n"
            + "    memberId: 1\n"
            + "    addedDate: 1970-01-01T00:00Z\n"
            + "    status: ENABLED\n"
            + "}",
        actualToStringResult);
    assertEquals(1, actualMemberTenant.intValue());
    assertEquals(1L, actualMemberId.longValue());
    assertEquals(StatusEnum.ENABLED, actualStatus);
    assertSame(actualReadMember, actualAddedDateResult);
    assertSame(actualReadMember, actualMemberIdResult);
    assertSame(actualReadMember, actualMemberTenantResult);
    assertSame(actualReadMember, actualStatusResult);
    assertSame(addedDate, actualAddedDate);
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
