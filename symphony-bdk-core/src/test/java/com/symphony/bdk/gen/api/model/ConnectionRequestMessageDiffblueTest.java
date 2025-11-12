package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ConnectionRequestMessageDiffblueTest {
  /**
   * Test {@link ConnectionRequestMessage#equals(Object)}, and {@link
   * ConnectionRequestMessage#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ConnectionRequestMessage#equals(Object)}
   *   <li>{@link ConnectionRequestMessage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConnectionRequestMessage.equals(Object)",
    "int ConnectionRequestMessage.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ConnectionRequestMessage connectionRequestMessage = new ConnectionRequestMessage();
    ConnectionRequestMessage connectionRequestMessage2 = new ConnectionRequestMessage();

    // Act and Assert
    assertEquals(connectionRequestMessage, connectionRequestMessage2);
    assertEquals(connectionRequestMessage.hashCode(), connectionRequestMessage2.hashCode());
  }

  /**
   * Test {@link ConnectionRequestMessage#equals(Object)}, and {@link
   * ConnectionRequestMessage#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ConnectionRequestMessage#equals(Object)}
   *   <li>{@link ConnectionRequestMessage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConnectionRequestMessage.equals(Object)",
    "int ConnectionRequestMessage.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ConnectionRequestMessage connectionRequestMessage = new ConnectionRequestMessage();

    // Act and Assert
    assertEquals(connectionRequestMessage, connectionRequestMessage);
    int expectedHashCodeResult = connectionRequestMessage.hashCode();
    assertEquals(expectedHashCodeResult, connectionRequestMessage.hashCode());
  }

  /**
   * Test {@link ConnectionRequestMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionRequestMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConnectionRequestMessage.equals(Object)",
    "int ConnectionRequestMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ConnectionRequestMessage(), 1);
  }

  /**
   * Test {@link ConnectionRequestMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionRequestMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConnectionRequestMessage.equals(Object)",
    "int ConnectionRequestMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ConnectionRequestMessage connectionRequestMessage = new ConnectionRequestMessage();
    connectionRequestMessage.requestingUserId(1L);

    // Act and Assert
    assertNotEquals(connectionRequestMessage, new ConnectionRequestMessage());
  }

  /**
   * Test {@link ConnectionRequestMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionRequestMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConnectionRequestMessage.equals(Object)",
    "int ConnectionRequestMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ConnectionRequestMessage connectionRequestMessage = new ConnectionRequestMessage();
    connectionRequestMessage.targetUserId(1L);

    // Act and Assert
    assertNotEquals(connectionRequestMessage, new ConnectionRequestMessage());
  }

  /**
   * Test {@link ConnectionRequestMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionRequestMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConnectionRequestMessage.equals(Object)",
    "int ConnectionRequestMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    ConnectionRequestMessage connectionRequestMessage = new ConnectionRequestMessage();
    connectionRequestMessage.firstRequestedAt(1L);

    // Act and Assert
    assertNotEquals(connectionRequestMessage, new ConnectionRequestMessage());
  }

  /**
   * Test {@link ConnectionRequestMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionRequestMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConnectionRequestMessage.equals(Object)",
    "int ConnectionRequestMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    ConnectionRequestMessage connectionRequestMessage = new ConnectionRequestMessage();
    connectionRequestMessage.updatedAt(1L);

    // Act and Assert
    assertNotEquals(connectionRequestMessage, new ConnectionRequestMessage());
  }

  /**
   * Test {@link ConnectionRequestMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionRequestMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConnectionRequestMessage.equals(Object)",
    "int ConnectionRequestMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    ConnectionRequestMessage connectionRequestMessage = new ConnectionRequestMessage();
    connectionRequestMessage.requestCounter(3);

    // Act and Assert
    assertNotEquals(connectionRequestMessage, new ConnectionRequestMessage());
  }

  /**
   * Test {@link ConnectionRequestMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionRequestMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConnectionRequestMessage.equals(Object)",
    "int ConnectionRequestMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    ConnectionRequestMessage connectionRequestMessage = new ConnectionRequestMessage();
    connectionRequestMessage.status("Status");

    // Act and Assert
    assertNotEquals(connectionRequestMessage, new ConnectionRequestMessage());
  }

  /**
   * Test {@link ConnectionRequestMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionRequestMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConnectionRequestMessage.equals(Object)",
    "int ConnectionRequestMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    ConnectionRequestMessage connectionRequestMessage = new ConnectionRequestMessage();
    connectionRequestMessage.id("42");

    // Act and Assert
    assertNotEquals(connectionRequestMessage, new ConnectionRequestMessage());
  }

  /**
   * Test {@link ConnectionRequestMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionRequestMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConnectionRequestMessage.equals(Object)",
    "int ConnectionRequestMessage.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ConnectionRequestMessage(), null);
  }

  /**
   * Test {@link ConnectionRequestMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionRequestMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConnectionRequestMessage.equals(Object)",
    "int ConnectionRequestMessage.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ConnectionRequestMessage(), "Different type to ConnectionRequestMessage");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link ConnectionRequestMessage}
   *   <li>{@link ConnectionRequestMessage#firstRequestedAt(Long)}
   *   <li>{@link ConnectionRequestMessage#requestCounter(Integer)}
   *   <li>{@link ConnectionRequestMessage#requestingUserId(Long)}
   *   <li>{@link ConnectionRequestMessage#setFirstRequestedAt(Long)}
   *   <li>{@link ConnectionRequestMessage#setRequestCounter(Integer)}
   *   <li>{@link ConnectionRequestMessage#setRequestingUserId(Long)}
   *   <li>{@link ConnectionRequestMessage#setStatus(String)}
   *   <li>{@link ConnectionRequestMessage#setTargetUserId(Long)}
   *   <li>{@link ConnectionRequestMessage#setUpdatedAt(Long)}
   *   <li>{@link ConnectionRequestMessage#status(String)}
   *   <li>{@link ConnectionRequestMessage#targetUserId(Long)}
   *   <li>{@link ConnectionRequestMessage#updatedAt(Long)}
   *   <li>{@link ConnectionRequestMessage#toString()}
   *   <li>{@link ConnectionRequestMessage#getFirstRequestedAt()}
   *   <li>{@link ConnectionRequestMessage#getRequestCounter()}
   *   <li>{@link ConnectionRequestMessage#getRequestingUserId()}
   *   <li>{@link ConnectionRequestMessage#getStatus()}
   *   <li>{@link ConnectionRequestMessage#getTargetUserId()}
   *   <li>{@link ConnectionRequestMessage#getUpdatedAt()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ConnectionRequestMessage.<init>()",
    "ConnectionRequestMessage ConnectionRequestMessage.firstRequestedAt(Long)",
    "Long ConnectionRequestMessage.getFirstRequestedAt()",
    "Integer ConnectionRequestMessage.getRequestCounter()",
    "Long ConnectionRequestMessage.getRequestingUserId()",
    "String ConnectionRequestMessage.getStatus()",
    "Long ConnectionRequestMessage.getTargetUserId()",
    "Long ConnectionRequestMessage.getUpdatedAt()",
    "ConnectionRequestMessage ConnectionRequestMessage.requestCounter(Integer)",
    "ConnectionRequestMessage ConnectionRequestMessage.requestingUserId(Long)",
    "void ConnectionRequestMessage.setFirstRequestedAt(Long)",
    "void ConnectionRequestMessage.setRequestCounter(Integer)",
    "void ConnectionRequestMessage.setRequestingUserId(Long)",
    "void ConnectionRequestMessage.setStatus(String)",
    "void ConnectionRequestMessage.setTargetUserId(Long)",
    "void ConnectionRequestMessage.setUpdatedAt(Long)",
    "ConnectionRequestMessage ConnectionRequestMessage.status(String)",
    "ConnectionRequestMessage ConnectionRequestMessage.targetUserId(Long)",
    "String ConnectionRequestMessage.toString()",
    "ConnectionRequestMessage ConnectionRequestMessage.updatedAt(Long)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    ConnectionRequestMessage actualConnectionRequestMessage = new ConnectionRequestMessage();
    ConnectionRequestMessage actualFirstRequestedAtResult =
        actualConnectionRequestMessage.firstRequestedAt(1L);
    ConnectionRequestMessage actualRequestCounterResult =
        actualConnectionRequestMessage.requestCounter(3);
    ConnectionRequestMessage actualRequestingUserIdResult =
        actualConnectionRequestMessage.requestingUserId(1L);
    actualConnectionRequestMessage.setFirstRequestedAt(1L);
    actualConnectionRequestMessage.setRequestCounter(3);
    actualConnectionRequestMessage.setRequestingUserId(1L);
    actualConnectionRequestMessage.setStatus("Status");
    actualConnectionRequestMessage.setTargetUserId(1L);
    actualConnectionRequestMessage.setUpdatedAt(1L);
    ConnectionRequestMessage actualStatusResult = actualConnectionRequestMessage.status("Status");
    ConnectionRequestMessage actualTargetUserIdResult =
        actualConnectionRequestMessage.targetUserId(1L);
    ConnectionRequestMessage actualUpdatedAtResult = actualConnectionRequestMessage.updatedAt(1L);
    String actualToStringResult = actualConnectionRequestMessage.toString();
    Long actualFirstRequestedAt = actualConnectionRequestMessage.getFirstRequestedAt();
    Integer actualRequestCounter = actualConnectionRequestMessage.getRequestCounter();
    Long actualRequestingUserId = actualConnectionRequestMessage.getRequestingUserId();
    String actualStatus = actualConnectionRequestMessage.getStatus();
    Long actualTargetUserId = actualConnectionRequestMessage.getTargetUserId();
    Long actualUpdatedAt = actualConnectionRequestMessage.getUpdatedAt();

    // Assert
    assertEquals("Status", actualStatus);
    assertEquals(
        "class ConnectionRequestMessage {\n"
            + "    class V2BaseMessage {\n"
            + "        id: null\n"
            + "        timestamp: null\n"
            + "        v2messageType: null\n"
            + "        streamId: null\n"
            + "    }\n"
            + "    requestingUserId: 1\n"
            + "    targetUserId: 1\n"
            + "    firstRequestedAt: 1\n"
            + "    updatedAt: 1\n"
            + "    requestCounter: 3\n"
            + "    status: Status\n"
            + "}",
        actualToStringResult);
    assertNull(actualConnectionRequestMessage.getId());
    assertNull(actualConnectionRequestMessage.getStreamId());
    assertNull(actualConnectionRequestMessage.getTimestamp());
    assertNull(actualConnectionRequestMessage.getV2messageType());
    assertEquals(1L, actualFirstRequestedAt.longValue());
    assertEquals(1L, actualRequestingUserId.longValue());
    assertEquals(1L, actualTargetUserId.longValue());
    assertEquals(1L, actualUpdatedAt.longValue());
    assertEquals(3, actualRequestCounter.intValue());
    assertSame(actualConnectionRequestMessage, actualFirstRequestedAtResult);
    assertSame(actualConnectionRequestMessage, actualRequestCounterResult);
    assertSame(actualConnectionRequestMessage, actualRequestingUserIdResult);
    assertSame(actualConnectionRequestMessage, actualStatusResult);
    assertSame(actualConnectionRequestMessage, actualTargetUserIdResult);
    assertSame(actualConnectionRequestMessage, actualUpdatedAtResult);
  }
}
