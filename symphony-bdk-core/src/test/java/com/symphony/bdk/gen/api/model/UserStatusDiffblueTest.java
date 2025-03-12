package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.UserStatus.StatusEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserStatusDiffblueTest {
  /**
   * Test {@link UserStatus#equals(Object)}, and {@link UserStatus#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserStatus#equals(Object)}
   *   <li>{@link UserStatus#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserStatus.equals(Object)", "int UserStatus.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserStatus userStatus = new UserStatus();
    UserStatus userStatus2 = new UserStatus();

    // Act and Assert
    assertEquals(userStatus, userStatus2);
    int expectedHashCodeResult = userStatus.hashCode();
    assertEquals(expectedHashCodeResult, userStatus2.hashCode());
  }

  /**
   * Test {@link UserStatus#equals(Object)}, and {@link UserStatus#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserStatus#equals(Object)}
   *   <li>{@link UserStatus#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserStatus.equals(Object)", "int UserStatus.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserStatus userStatus = new UserStatus();

    // Act and Assert
    assertEquals(userStatus, userStatus);
    int expectedHashCodeResult = userStatus.hashCode();
    assertEquals(expectedHashCodeResult, userStatus.hashCode());
  }

  /**
   * Test {@link UserStatus#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserStatus#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserStatus.equals(Object)", "int UserStatus.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserStatus(), 1);
  }

  /**
   * Test {@link UserStatus#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserStatus#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserStatus.equals(Object)", "int UserStatus.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserStatus userStatus = new UserStatus();
    userStatus.status(StatusEnum.ENABLED);

    // Act and Assert
    assertNotEquals(userStatus, new UserStatus());
  }

  /**
   * Test {@link UserStatus#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserStatus#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserStatus.equals(Object)", "int UserStatus.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserStatus userStatus = new UserStatus();
    userStatus.suspended(true);

    // Act and Assert
    assertNotEquals(userStatus, new UserStatus());
  }

  /**
   * Test {@link UserStatus#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserStatus#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserStatus.equals(Object)", "int UserStatus.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    UserStatus userStatus = new UserStatus();
    userStatus.suspendedUntil(1L);

    // Act and Assert
    assertNotEquals(userStatus, new UserStatus());
  }

  /**
   * Test {@link UserStatus#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserStatus#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserStatus.equals(Object)", "int UserStatus.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    UserStatus userStatus = new UserStatus();
    userStatus.suspensionReason("Just cause");

    // Act and Assert
    assertNotEquals(userStatus, new UserStatus());
  }

  /**
   * Test {@link UserStatus#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserStatus#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserStatus.equals(Object)", "int UserStatus.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserStatus(), null);
  }

  /**
   * Test {@link UserStatus#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserStatus#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserStatus.equals(Object)", "int UserStatus.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserStatus(), "Different type to UserStatus");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link UserStatus}
   *   <li>{@link UserStatus#setStatus(StatusEnum)}
   *   <li>{@link UserStatus#setSuspended(Boolean)}
   *   <li>{@link UserStatus#setSuspendedUntil(Long)}
   *   <li>{@link UserStatus#setSuspensionReason(String)}
   *   <li>{@link UserStatus#status(StatusEnum)}
   *   <li>{@link UserStatus#suspended(Boolean)}
   *   <li>{@link UserStatus#suspendedUntil(Long)}
   *   <li>{@link UserStatus#suspensionReason(String)}
   *   <li>{@link UserStatus#toString()}
   *   <li>{@link UserStatus#getStatus()}
   *   <li>{@link UserStatus#getSuspended()}
   *   <li>{@link UserStatus#getSuspendedUntil()}
   *   <li>{@link UserStatus#getSuspensionReason()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void UserStatus.<init>()", "StatusEnum UserStatus.getStatus()",
      "Boolean UserStatus.getSuspended()", "Long UserStatus.getSuspendedUntil()",
      "String UserStatus.getSuspensionReason()", "void UserStatus.setStatus(StatusEnum)",
      "void UserStatus.setSuspended(Boolean)", "void UserStatus.setSuspendedUntil(Long)",
      "void UserStatus.setSuspensionReason(String)", "UserStatus UserStatus.status(StatusEnum)",
      "UserStatus UserStatus.suspended(Boolean)", "UserStatus UserStatus.suspendedUntil(Long)",
      "UserStatus UserStatus.suspensionReason(String)", "String UserStatus.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    UserStatus actualUserStatus = new UserStatus();
    actualUserStatus.setStatus(StatusEnum.ENABLED);
    actualUserStatus.setSuspended(true);
    actualUserStatus.setSuspendedUntil(1L);
    actualUserStatus.setSuspensionReason("Just cause");
    UserStatus actualStatusResult = actualUserStatus.status(StatusEnum.ENABLED);
    UserStatus actualSuspendedResult = actualUserStatus.suspended(true);
    UserStatus actualSuspendedUntilResult = actualUserStatus.suspendedUntil(1L);
    UserStatus actualSuspensionReasonResult = actualUserStatus.suspensionReason("Just cause");
    String actualToStringResult = actualUserStatus.toString();
    StatusEnum actualStatus = actualUserStatus.getStatus();
    Boolean actualSuspended = actualUserStatus.getSuspended();
    Long actualSuspendedUntil = actualUserStatus.getSuspendedUntil();

    // Assert
    assertEquals("Just cause", actualUserStatus.getSuspensionReason());
    assertEquals("class UserStatus {\n" + "    status: ENABLED\n" + "    suspended: true\n" + "    suspendedUntil: 1\n"
        + "    suspensionReason: Just cause\n" + "}", actualToStringResult);
    assertEquals(1L, actualSuspendedUntil.longValue());
    assertEquals(StatusEnum.ENABLED, actualStatus);
    assertTrue(actualSuspended);
    assertSame(actualUserStatus, actualStatusResult);
    assertSame(actualUserStatus, actualSuspendedResult);
    assertSame(actualUserStatus, actualSuspendedUntilResult);
    assertSame(actualUserStatus, actualSuspensionReasonResult);
  }

  /**
   * Test StatusEnum {@link StatusEnum#fromValue(String)}.
   * <ul>
   *   <li>When {@code 42}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StatusEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test StatusEnum fromValue(String); when '42'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"StatusEnum StatusEnum.fromValue(String)"})
  void testStatusEnumFromValue_when42_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(StatusEnum.fromValue("42"));
  }

  /**
   * Test StatusEnum {@link StatusEnum#fromValue(String)}.
   * <ul>
   *   <li>When {@code ENABLED}.</li>
   *   <li>Then return {@code ENABLED}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StatusEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test StatusEnum fromValue(String); when 'ENABLED'; then return 'ENABLED'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"StatusEnum StatusEnum.fromValue(String)"})
  void testStatusEnumFromValue_whenEnabled_thenReturnEnabled() {
    // Arrange, Act and Assert
    assertEquals(StatusEnum.ENABLED, StatusEnum.fromValue("ENABLED"));
  }

  /**
   * Test StatusEnum getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link StatusEnum#toString()}
   *   <li>{@link StatusEnum#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test StatusEnum getters and setters")
  @Tag("MaintainedByDiffblue")
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
