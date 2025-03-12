package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.UserConnection.StatusEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserConnectionDiffblueTest {
  /**
   * Test {@link UserConnection#equals(Object)}, and {@link UserConnection#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserConnection#equals(Object)}
   *   <li>{@link UserConnection#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserConnection.equals(Object)", "int UserConnection.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserConnection userConnection = new UserConnection();
    UserConnection userConnection2 = new UserConnection();

    // Act and Assert
    assertEquals(userConnection, userConnection2);
    int expectedHashCodeResult = userConnection.hashCode();
    assertEquals(expectedHashCodeResult, userConnection2.hashCode());
  }

  /**
   * Test {@link UserConnection#equals(Object)}, and {@link UserConnection#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserConnection#equals(Object)}
   *   <li>{@link UserConnection#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserConnection.equals(Object)", "int UserConnection.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserConnection userConnection = new UserConnection();

    // Act and Assert
    assertEquals(userConnection, userConnection);
    int expectedHashCodeResult = userConnection.hashCode();
    assertEquals(expectedHashCodeResult, userConnection.hashCode());
  }

  /**
   * Test {@link UserConnection#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserConnection#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserConnection.equals(Object)", "int UserConnection.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserConnection(), 1);
  }

  /**
   * Test {@link UserConnection#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserConnection#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserConnection.equals(Object)", "int UserConnection.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserConnection userConnection = new UserConnection();
    userConnection.userId(1L);

    // Act and Assert
    assertNotEquals(userConnection, new UserConnection());
  }

  /**
   * Test {@link UserConnection#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserConnection#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserConnection.equals(Object)", "int UserConnection.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserConnection userConnection = new UserConnection();
    userConnection.status(StatusEnum.PENDING_INCOMING);

    // Act and Assert
    assertNotEquals(userConnection, new UserConnection());
  }

  /**
   * Test {@link UserConnection#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserConnection#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserConnection.equals(Object)", "int UserConnection.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    UserConnection userConnection = new UserConnection();
    userConnection.firstRequestedAt(1L);

    // Act and Assert
    assertNotEquals(userConnection, new UserConnection());
  }

  /**
   * Test {@link UserConnection#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserConnection#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserConnection.equals(Object)", "int UserConnection.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    UserConnection userConnection = new UserConnection();
    userConnection.updatedAt(1L);

    // Act and Assert
    assertNotEquals(userConnection, new UserConnection());
  }

  /**
   * Test {@link UserConnection#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserConnection#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserConnection.equals(Object)", "int UserConnection.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    UserConnection userConnection = new UserConnection();
    userConnection.requestCounter(3);

    // Act and Assert
    assertNotEquals(userConnection, new UserConnection());
  }

  /**
   * Test {@link UserConnection#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserConnection#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserConnection.equals(Object)", "int UserConnection.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserConnection(), null);
  }

  /**
   * Test {@link UserConnection#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserConnection#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserConnection.equals(Object)", "int UserConnection.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserConnection(), "Different type to UserConnection");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link UserConnection}
   *   <li>{@link UserConnection#firstRequestedAt(Long)}
   *   <li>{@link UserConnection#requestCounter(Integer)}
   *   <li>{@link UserConnection#setFirstRequestedAt(Long)}
   *   <li>{@link UserConnection#setRequestCounter(Integer)}
   *   <li>{@link UserConnection#setStatus(StatusEnum)}
   *   <li>{@link UserConnection#setUpdatedAt(Long)}
   *   <li>{@link UserConnection#setUserId(Long)}
   *   <li>{@link UserConnection#status(StatusEnum)}
   *   <li>{@link UserConnection#updatedAt(Long)}
   *   <li>{@link UserConnection#userId(Long)}
   *   <li>{@link UserConnection#toString()}
   *   <li>{@link UserConnection#getFirstRequestedAt()}
   *   <li>{@link UserConnection#getRequestCounter()}
   *   <li>{@link UserConnection#getStatus()}
   *   <li>{@link UserConnection#getUpdatedAt()}
   *   <li>{@link UserConnection#getUserId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void UserConnection.<init>()", "UserConnection UserConnection.firstRequestedAt(Long)",
      "Long UserConnection.getFirstRequestedAt()", "Integer UserConnection.getRequestCounter()",
      "StatusEnum UserConnection.getStatus()", "Long UserConnection.getUpdatedAt()", "Long UserConnection.getUserId()",
      "UserConnection UserConnection.requestCounter(Integer)", "void UserConnection.setFirstRequestedAt(Long)",
      "void UserConnection.setRequestCounter(Integer)", "void UserConnection.setStatus(StatusEnum)",
      "void UserConnection.setUpdatedAt(Long)", "void UserConnection.setUserId(Long)",
      "UserConnection UserConnection.status(StatusEnum)", "String UserConnection.toString()",
      "UserConnection UserConnection.updatedAt(Long)", "UserConnection UserConnection.userId(Long)"})
  void testGettersAndSetters() {
    // Arrange and Act
    UserConnection actualUserConnection = new UserConnection();
    UserConnection actualFirstRequestedAtResult = actualUserConnection.firstRequestedAt(1L);
    UserConnection actualRequestCounterResult = actualUserConnection.requestCounter(3);
    actualUserConnection.setFirstRequestedAt(1L);
    actualUserConnection.setRequestCounter(3);
    actualUserConnection.setStatus(StatusEnum.PENDING_INCOMING);
    actualUserConnection.setUpdatedAt(1L);
    actualUserConnection.setUserId(1L);
    UserConnection actualStatusResult = actualUserConnection.status(StatusEnum.PENDING_INCOMING);
    UserConnection actualUpdatedAtResult = actualUserConnection.updatedAt(1L);
    UserConnection actualUserIdResult = actualUserConnection.userId(1L);
    String actualToStringResult = actualUserConnection.toString();
    Long actualFirstRequestedAt = actualUserConnection.getFirstRequestedAt();
    Integer actualRequestCounter = actualUserConnection.getRequestCounter();
    StatusEnum actualStatus = actualUserConnection.getStatus();
    Long actualUpdatedAt = actualUserConnection.getUpdatedAt();
    Long actualUserId = actualUserConnection.getUserId();

    // Assert
    assertEquals("class UserConnection {\n" + "    userId: 1\n" + "    status: PENDING_INCOMING\n"
        + "    firstRequestedAt: 1\n" + "    updatedAt: 1\n" + "    requestCounter: 3\n" + "}", actualToStringResult);
    assertEquals(1L, actualFirstRequestedAt.longValue());
    assertEquals(1L, actualUpdatedAt.longValue());
    assertEquals(1L, actualUserId.longValue());
    assertEquals(3, actualRequestCounter.intValue());
    assertEquals(StatusEnum.PENDING_INCOMING, actualStatus);
    assertSame(actualUserConnection, actualFirstRequestedAtResult);
    assertSame(actualUserConnection, actualRequestCounterResult);
    assertSame(actualUserConnection, actualStatusResult);
    assertSame(actualUserConnection, actualUpdatedAtResult);
    assertSame(actualUserConnection, actualUserIdResult);
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
   *   <li>When {@code PENDING_INCOMING}.</li>
   *   <li>Then return {@code PENDING_INCOMING}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StatusEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test StatusEnum fromValue(String); when 'PENDING_INCOMING'; then return 'PENDING_INCOMING'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"StatusEnum StatusEnum.fromValue(String)"})
  void testStatusEnumFromValue_whenPendingIncoming_thenReturnPendingIncoming() {
    // Arrange, Act and Assert
    assertEquals(StatusEnum.PENDING_INCOMING, StatusEnum.fromValue("PENDING_INCOMING"));
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
    StatusEnum valueOfResult = StatusEnum.valueOf("PENDING_INCOMING");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("PENDING_INCOMING", valueOfResult.getValue());
    assertEquals("PENDING_INCOMING", actualToStringResult);
  }
}
