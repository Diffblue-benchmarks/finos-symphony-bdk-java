package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.UserSystemInfo.StatusEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserSystemInfoDiffblueTest {
  /**
   * Test {@link UserSystemInfo#equals(Object)}, and {@link UserSystemInfo#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserSystemInfo#equals(Object)}
   *   <li>{@link UserSystemInfo#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSystemInfo.equals(Object)", "int UserSystemInfo.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserSystemInfo userSystemInfo = new UserSystemInfo();
    UserSystemInfo userSystemInfo2 = new UserSystemInfo();

    // Act and Assert
    assertEquals(userSystemInfo, userSystemInfo2);
    int expectedHashCodeResult = userSystemInfo.hashCode();
    assertEquals(expectedHashCodeResult, userSystemInfo2.hashCode());
  }

  /**
   * Test {@link UserSystemInfo#equals(Object)}, and {@link UserSystemInfo#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserSystemInfo#equals(Object)}
   *   <li>{@link UserSystemInfo#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSystemInfo.equals(Object)", "int UserSystemInfo.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserSystemInfo userSystemInfo = new UserSystemInfo();

    // Act and Assert
    assertEquals(userSystemInfo, userSystemInfo);
    int expectedHashCodeResult = userSystemInfo.hashCode();
    assertEquals(expectedHashCodeResult, userSystemInfo.hashCode());
  }

  /**
   * Test {@link UserSystemInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSystemInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSystemInfo.equals(Object)", "int UserSystemInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserSystemInfo(), 1);
  }

  /**
   * Test {@link UserSystemInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSystemInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSystemInfo.equals(Object)", "int UserSystemInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserSystemInfo userSystemInfo = new UserSystemInfo();
    userSystemInfo.id(1L);

    // Act and Assert
    assertNotEquals(userSystemInfo, new UserSystemInfo());
  }

  /**
   * Test {@link UserSystemInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSystemInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSystemInfo.equals(Object)", "int UserSystemInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserSystemInfo userSystemInfo = new UserSystemInfo();
    userSystemInfo.status(StatusEnum.ENABLED);

    // Act and Assert
    assertNotEquals(userSystemInfo, new UserSystemInfo());
  }

  /**
   * Test {@link UserSystemInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSystemInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSystemInfo.equals(Object)", "int UserSystemInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    UserSystemInfo userSystemInfo = new UserSystemInfo();
    userSystemInfo.suspended(true);

    // Act and Assert
    assertNotEquals(userSystemInfo, new UserSystemInfo());
  }

  /**
   * Test {@link UserSystemInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSystemInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSystemInfo.equals(Object)", "int UserSystemInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    UserSystemInfo userSystemInfo = new UserSystemInfo();
    userSystemInfo.suspendedUntil(1L);

    // Act and Assert
    assertNotEquals(userSystemInfo, new UserSystemInfo());
  }

  /**
   * Test {@link UserSystemInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSystemInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSystemInfo.equals(Object)", "int UserSystemInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    UserSystemInfo userSystemInfo = new UserSystemInfo();
    userSystemInfo.suspensionReason("Just cause");

    // Act and Assert
    assertNotEquals(userSystemInfo, new UserSystemInfo());
  }

  /**
   * Test {@link UserSystemInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSystemInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSystemInfo.equals(Object)", "int UserSystemInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    UserSystemInfo userSystemInfo = new UserSystemInfo();
    userSystemInfo.createdDate(1L);

    // Act and Assert
    assertNotEquals(userSystemInfo, new UserSystemInfo());
  }

  /**
   * Test {@link UserSystemInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSystemInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSystemInfo.equals(Object)", "int UserSystemInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    UserSystemInfo userSystemInfo = new UserSystemInfo();
    userSystemInfo.createdBy("Jan 1, 2020 8:00am GMT+0100");

    // Act and Assert
    assertNotEquals(userSystemInfo, new UserSystemInfo());
  }

  /**
   * Test {@link UserSystemInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSystemInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSystemInfo.equals(Object)", "int UserSystemInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    UserSystemInfo userSystemInfo = new UserSystemInfo();
    userSystemInfo.lastUpdatedDate(1L);

    // Act and Assert
    assertNotEquals(userSystemInfo, new UserSystemInfo());
  }

  /**
   * Test {@link UserSystemInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSystemInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSystemInfo.equals(Object)", "int UserSystemInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual10() {
    // Arrange
    UserSystemInfo userSystemInfo = new UserSystemInfo();
    userSystemInfo.lastLoginDate(1L);

    // Act and Assert
    assertNotEquals(userSystemInfo, new UserSystemInfo());
  }

  /**
   * Test {@link UserSystemInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSystemInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSystemInfo.equals(Object)", "int UserSystemInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual11() {
    // Arrange
    UserSystemInfo userSystemInfo = new UserSystemInfo();
    userSystemInfo.lastPasswordReset(1L);

    // Act and Assert
    assertNotEquals(userSystemInfo, new UserSystemInfo());
  }

  /**
   * Test {@link UserSystemInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSystemInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSystemInfo.equals(Object)", "int UserSystemInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual12() {
    // Arrange
    UserSystemInfo userSystemInfo = new UserSystemInfo();
    userSystemInfo.deactivatedDate(1L);

    // Act and Assert
    assertNotEquals(userSystemInfo, new UserSystemInfo());
  }

  /**
   * Test {@link UserSystemInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSystemInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSystemInfo.equals(Object)", "int UserSystemInfo.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserSystemInfo(), null);
  }

  /**
   * Test {@link UserSystemInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSystemInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSystemInfo.equals(Object)", "int UserSystemInfo.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserSystemInfo(), "Different type to UserSystemInfo");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UserSystemInfo}
   *   <li>{@link UserSystemInfo#createdBy(String)}
   *   <li>{@link UserSystemInfo#createdDate(Long)}
   *   <li>{@link UserSystemInfo#deactivatedDate(Long)}
   *   <li>{@link UserSystemInfo#id(Long)}
   *   <li>{@link UserSystemInfo#lastLoginDate(Long)}
   *   <li>{@link UserSystemInfo#lastPasswordReset(Long)}
   *   <li>{@link UserSystemInfo#lastUpdatedDate(Long)}
   *   <li>{@link UserSystemInfo#setCreatedBy(String)}
   *   <li>{@link UserSystemInfo#setCreatedDate(Long)}
   *   <li>{@link UserSystemInfo#setDeactivatedDate(Long)}
   *   <li>{@link UserSystemInfo#setId(Long)}
   *   <li>{@link UserSystemInfo#setLastLoginDate(Long)}
   *   <li>{@link UserSystemInfo#setLastPasswordReset(Long)}
   *   <li>{@link UserSystemInfo#setLastUpdatedDate(Long)}
   *   <li>{@link UserSystemInfo#setStatus(StatusEnum)}
   *   <li>{@link UserSystemInfo#setSuspended(Boolean)}
   *   <li>{@link UserSystemInfo#setSuspendedUntil(Long)}
   *   <li>{@link UserSystemInfo#setSuspensionReason(String)}
   *   <li>{@link UserSystemInfo#status(StatusEnum)}
   *   <li>{@link UserSystemInfo#suspended(Boolean)}
   *   <li>{@link UserSystemInfo#suspendedUntil(Long)}
   *   <li>{@link UserSystemInfo#suspensionReason(String)}
   *   <li>{@link UserSystemInfo#toString()}
   *   <li>{@link UserSystemInfo#getCreatedBy()}
   *   <li>{@link UserSystemInfo#getCreatedDate()}
   *   <li>{@link UserSystemInfo#getDeactivatedDate()}
   *   <li>{@link UserSystemInfo#getId()}
   *   <li>{@link UserSystemInfo#getLastLoginDate()}
   *   <li>{@link UserSystemInfo#getLastPasswordReset()}
   *   <li>{@link UserSystemInfo#getLastUpdatedDate()}
   *   <li>{@link UserSystemInfo#getStatus()}
   *   <li>{@link UserSystemInfo#getSuspended()}
   *   <li>{@link UserSystemInfo#getSuspendedUntil()}
   *   <li>{@link UserSystemInfo#getSuspensionReason()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserSystemInfo.<init>()",
    "UserSystemInfo UserSystemInfo.createdBy(String)",
    "UserSystemInfo UserSystemInfo.createdDate(Long)",
    "UserSystemInfo UserSystemInfo.deactivatedDate(Long)",
    "String UserSystemInfo.getCreatedBy()",
    "Long UserSystemInfo.getCreatedDate()",
    "Long UserSystemInfo.getDeactivatedDate()",
    "Long UserSystemInfo.getId()",
    "Long UserSystemInfo.getLastLoginDate()",
    "Long UserSystemInfo.getLastPasswordReset()",
    "Long UserSystemInfo.getLastUpdatedDate()",
    "StatusEnum UserSystemInfo.getStatus()",
    "Boolean UserSystemInfo.getSuspended()",
    "Long UserSystemInfo.getSuspendedUntil()",
    "String UserSystemInfo.getSuspensionReason()",
    "UserSystemInfo UserSystemInfo.id(Long)",
    "UserSystemInfo UserSystemInfo.lastLoginDate(Long)",
    "UserSystemInfo UserSystemInfo.lastPasswordReset(Long)",
    "UserSystemInfo UserSystemInfo.lastUpdatedDate(Long)",
    "void UserSystemInfo.setCreatedBy(String)",
    "void UserSystemInfo.setCreatedDate(Long)",
    "void UserSystemInfo.setDeactivatedDate(Long)",
    "void UserSystemInfo.setId(Long)",
    "void UserSystemInfo.setLastLoginDate(Long)",
    "void UserSystemInfo.setLastPasswordReset(Long)",
    "void UserSystemInfo.setLastUpdatedDate(Long)",
    "void UserSystemInfo.setStatus(StatusEnum)",
    "void UserSystemInfo.setSuspended(Boolean)",
    "void UserSystemInfo.setSuspendedUntil(Long)",
    "void UserSystemInfo.setSuspensionReason(String)",
    "UserSystemInfo UserSystemInfo.status(StatusEnum)",
    "UserSystemInfo UserSystemInfo.suspended(Boolean)",
    "UserSystemInfo UserSystemInfo.suspendedUntil(Long)",
    "UserSystemInfo UserSystemInfo.suspensionReason(String)",
    "String UserSystemInfo.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    UserSystemInfo actualUserSystemInfo = new UserSystemInfo();
    UserSystemInfo actualCreatedByResult =
        actualUserSystemInfo.createdBy("Jan 1, 2020 8:00am GMT+0100");
    UserSystemInfo actualCreatedDateResult = actualUserSystemInfo.createdDate(1L);
    UserSystemInfo actualDeactivatedDateResult = actualUserSystemInfo.deactivatedDate(1L);
    UserSystemInfo actualIdResult = actualUserSystemInfo.id(1L);
    UserSystemInfo actualLastLoginDateResult = actualUserSystemInfo.lastLoginDate(1L);
    UserSystemInfo actualLastPasswordResetResult = actualUserSystemInfo.lastPasswordReset(1L);
    UserSystemInfo actualLastUpdatedDateResult = actualUserSystemInfo.lastUpdatedDate(1L);
    actualUserSystemInfo.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
    actualUserSystemInfo.setCreatedDate(1L);
    actualUserSystemInfo.setDeactivatedDate(1L);
    actualUserSystemInfo.setId(1L);
    actualUserSystemInfo.setLastLoginDate(1L);
    actualUserSystemInfo.setLastPasswordReset(1L);
    actualUserSystemInfo.setLastUpdatedDate(1L);
    actualUserSystemInfo.setStatus(StatusEnum.ENABLED);
    actualUserSystemInfo.setSuspended(true);
    actualUserSystemInfo.setSuspendedUntil(1L);
    actualUserSystemInfo.setSuspensionReason("Just cause");
    UserSystemInfo actualStatusResult = actualUserSystemInfo.status(StatusEnum.ENABLED);
    UserSystemInfo actualSuspendedResult = actualUserSystemInfo.suspended(true);
    UserSystemInfo actualSuspendedUntilResult = actualUserSystemInfo.suspendedUntil(1L);
    UserSystemInfo actualSuspensionReasonResult =
        actualUserSystemInfo.suspensionReason("Just cause");
    String actualToStringResult = actualUserSystemInfo.toString();
    String actualCreatedBy = actualUserSystemInfo.getCreatedBy();
    Long actualCreatedDate = actualUserSystemInfo.getCreatedDate();
    Long actualDeactivatedDate = actualUserSystemInfo.getDeactivatedDate();
    Long actualId = actualUserSystemInfo.getId();
    Long actualLastLoginDate = actualUserSystemInfo.getLastLoginDate();
    Long actualLastPasswordReset = actualUserSystemInfo.getLastPasswordReset();
    Long actualLastUpdatedDate = actualUserSystemInfo.getLastUpdatedDate();
    StatusEnum actualStatus = actualUserSystemInfo.getStatus();
    Boolean actualSuspended = actualUserSystemInfo.getSuspended();
    Long actualSuspendedUntil = actualUserSystemInfo.getSuspendedUntil();

    // Assert
    assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
    assertEquals("Just cause", actualUserSystemInfo.getSuspensionReason());
    assertEquals(
        "class UserSystemInfo {\n"
            + "    id: 1\n"
            + "    status: ENABLED\n"
            + "    suspended: true\n"
            + "    suspendedUntil: 1\n"
            + "    suspensionReason: Just cause\n"
            + "    createdDate: 1\n"
            + "    createdBy: Jan 1, 2020 8:00am GMT+0100\n"
            + "    lastUpdatedDate: 1\n"
            + "    lastLoginDate: 1\n"
            + "    lastPasswordReset: 1\n"
            + "    deactivatedDate: 1\n"
            + "}",
        actualToStringResult);
    assertEquals(1L, actualCreatedDate.longValue());
    assertEquals(1L, actualDeactivatedDate.longValue());
    assertEquals(1L, actualId.longValue());
    assertEquals(1L, actualLastLoginDate.longValue());
    assertEquals(1L, actualLastPasswordReset.longValue());
    assertEquals(1L, actualLastUpdatedDate.longValue());
    assertEquals(1L, actualSuspendedUntil.longValue());
    assertEquals(StatusEnum.ENABLED, actualStatus);
    assertTrue(actualSuspended);
    assertSame(actualUserSystemInfo, actualCreatedByResult);
    assertSame(actualUserSystemInfo, actualCreatedDateResult);
    assertSame(actualUserSystemInfo, actualDeactivatedDateResult);
    assertSame(actualUserSystemInfo, actualIdResult);
    assertSame(actualUserSystemInfo, actualLastLoginDateResult);
    assertSame(actualUserSystemInfo, actualLastPasswordResetResult);
    assertSame(actualUserSystemInfo, actualLastUpdatedDateResult);
    assertSame(actualUserSystemInfo, actualStatusResult);
    assertSame(actualUserSystemInfo, actualSuspendedResult);
    assertSame(actualUserSystemInfo, actualSuspendedUntilResult);
    assertSame(actualUserSystemInfo, actualSuspensionReasonResult);
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
