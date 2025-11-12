package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ConnectionRequestMessageAllOfDiffblueTest {
  /**
   * Test {@link ConnectionRequestMessageAllOf#equals(Object)}, and {@link
   * ConnectionRequestMessageAllOf#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ConnectionRequestMessageAllOf#equals(Object)}
   *   <li>{@link ConnectionRequestMessageAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConnectionRequestMessageAllOf.equals(Object)",
    "int ConnectionRequestMessageAllOf.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ConnectionRequestMessageAllOf connectionRequestMessageAllOf =
        new ConnectionRequestMessageAllOf();
    ConnectionRequestMessageAllOf connectionRequestMessageAllOf2 =
        new ConnectionRequestMessageAllOf();

    // Act and Assert
    assertEquals(connectionRequestMessageAllOf, connectionRequestMessageAllOf2);
    assertEquals(
        connectionRequestMessageAllOf.hashCode(), connectionRequestMessageAllOf2.hashCode());
  }

  /**
   * Test {@link ConnectionRequestMessageAllOf#equals(Object)}, and {@link
   * ConnectionRequestMessageAllOf#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ConnectionRequestMessageAllOf#equals(Object)}
   *   <li>{@link ConnectionRequestMessageAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConnectionRequestMessageAllOf.equals(Object)",
    "int ConnectionRequestMessageAllOf.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ConnectionRequestMessageAllOf connectionRequestMessageAllOf =
        new ConnectionRequestMessageAllOf();

    // Act and Assert
    assertEquals(connectionRequestMessageAllOf, connectionRequestMessageAllOf);
    int expectedHashCodeResult = connectionRequestMessageAllOf.hashCode();
    assertEquals(expectedHashCodeResult, connectionRequestMessageAllOf.hashCode());
  }

  /**
   * Test {@link ConnectionRequestMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionRequestMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConnectionRequestMessageAllOf.equals(Object)",
    "int ConnectionRequestMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ConnectionRequestMessageAllOf(), 1);
  }

  /**
   * Test {@link ConnectionRequestMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionRequestMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConnectionRequestMessageAllOf.equals(Object)",
    "int ConnectionRequestMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ConnectionRequestMessageAllOf connectionRequestMessageAllOf =
        new ConnectionRequestMessageAllOf();
    connectionRequestMessageAllOf.requestingUserId(1L);

    // Act and Assert
    assertNotEquals(connectionRequestMessageAllOf, new ConnectionRequestMessageAllOf());
  }

  /**
   * Test {@link ConnectionRequestMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionRequestMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConnectionRequestMessageAllOf.equals(Object)",
    "int ConnectionRequestMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ConnectionRequestMessageAllOf connectionRequestMessageAllOf =
        new ConnectionRequestMessageAllOf();
    connectionRequestMessageAllOf.targetUserId(1L);

    // Act and Assert
    assertNotEquals(connectionRequestMessageAllOf, new ConnectionRequestMessageAllOf());
  }

  /**
   * Test {@link ConnectionRequestMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionRequestMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConnectionRequestMessageAllOf.equals(Object)",
    "int ConnectionRequestMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    ConnectionRequestMessageAllOf connectionRequestMessageAllOf =
        new ConnectionRequestMessageAllOf();
    connectionRequestMessageAllOf.firstRequestedAt(1L);

    // Act and Assert
    assertNotEquals(connectionRequestMessageAllOf, new ConnectionRequestMessageAllOf());
  }

  /**
   * Test {@link ConnectionRequestMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionRequestMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConnectionRequestMessageAllOf.equals(Object)",
    "int ConnectionRequestMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    ConnectionRequestMessageAllOf connectionRequestMessageAllOf =
        new ConnectionRequestMessageAllOf();
    connectionRequestMessageAllOf.updatedAt(1L);

    // Act and Assert
    assertNotEquals(connectionRequestMessageAllOf, new ConnectionRequestMessageAllOf());
  }

  /**
   * Test {@link ConnectionRequestMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionRequestMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConnectionRequestMessageAllOf.equals(Object)",
    "int ConnectionRequestMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    ConnectionRequestMessageAllOf connectionRequestMessageAllOf =
        new ConnectionRequestMessageAllOf();
    connectionRequestMessageAllOf.requestCounter(3);

    // Act and Assert
    assertNotEquals(connectionRequestMessageAllOf, new ConnectionRequestMessageAllOf());
  }

  /**
   * Test {@link ConnectionRequestMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionRequestMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConnectionRequestMessageAllOf.equals(Object)",
    "int ConnectionRequestMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    ConnectionRequestMessageAllOf connectionRequestMessageAllOf =
        new ConnectionRequestMessageAllOf();
    connectionRequestMessageAllOf.status("Status");

    // Act and Assert
    assertNotEquals(connectionRequestMessageAllOf, new ConnectionRequestMessageAllOf());
  }

  /**
   * Test {@link ConnectionRequestMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionRequestMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConnectionRequestMessageAllOf.equals(Object)",
    "int ConnectionRequestMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ConnectionRequestMessageAllOf(), null);
  }

  /**
   * Test {@link ConnectionRequestMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConnectionRequestMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConnectionRequestMessageAllOf.equals(Object)",
    "int ConnectionRequestMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new ConnectionRequestMessageAllOf(), "Different type to ConnectionRequestMessageAllOf");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link ConnectionRequestMessageAllOf}
   *   <li>{@link ConnectionRequestMessageAllOf#firstRequestedAt(Long)}
   *   <li>{@link ConnectionRequestMessageAllOf#requestCounter(Integer)}
   *   <li>{@link ConnectionRequestMessageAllOf#requestingUserId(Long)}
   *   <li>{@link ConnectionRequestMessageAllOf#setFirstRequestedAt(Long)}
   *   <li>{@link ConnectionRequestMessageAllOf#setRequestCounter(Integer)}
   *   <li>{@link ConnectionRequestMessageAllOf#setRequestingUserId(Long)}
   *   <li>{@link ConnectionRequestMessageAllOf#setStatus(String)}
   *   <li>{@link ConnectionRequestMessageAllOf#setTargetUserId(Long)}
   *   <li>{@link ConnectionRequestMessageAllOf#setUpdatedAt(Long)}
   *   <li>{@link ConnectionRequestMessageAllOf#status(String)}
   *   <li>{@link ConnectionRequestMessageAllOf#targetUserId(Long)}
   *   <li>{@link ConnectionRequestMessageAllOf#updatedAt(Long)}
   *   <li>{@link ConnectionRequestMessageAllOf#toString()}
   *   <li>{@link ConnectionRequestMessageAllOf#getFirstRequestedAt()}
   *   <li>{@link ConnectionRequestMessageAllOf#getRequestCounter()}
   *   <li>{@link ConnectionRequestMessageAllOf#getRequestingUserId()}
   *   <li>{@link ConnectionRequestMessageAllOf#getStatus()}
   *   <li>{@link ConnectionRequestMessageAllOf#getTargetUserId()}
   *   <li>{@link ConnectionRequestMessageAllOf#getUpdatedAt()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ConnectionRequestMessageAllOf.<init>()",
    "ConnectionRequestMessageAllOf ConnectionRequestMessageAllOf.firstRequestedAt(Long)",
    "Long ConnectionRequestMessageAllOf.getFirstRequestedAt()",
    "Integer ConnectionRequestMessageAllOf.getRequestCounter()",
    "Long ConnectionRequestMessageAllOf.getRequestingUserId()",
    "String ConnectionRequestMessageAllOf.getStatus()",
    "Long ConnectionRequestMessageAllOf.getTargetUserId()",
    "Long ConnectionRequestMessageAllOf.getUpdatedAt()",
    "ConnectionRequestMessageAllOf ConnectionRequestMessageAllOf.requestCounter(Integer)",
    "ConnectionRequestMessageAllOf ConnectionRequestMessageAllOf.requestingUserId(Long)",
    "void ConnectionRequestMessageAllOf.setFirstRequestedAt(Long)",
    "void ConnectionRequestMessageAllOf.setRequestCounter(Integer)",
    "void ConnectionRequestMessageAllOf.setRequestingUserId(Long)",
    "void ConnectionRequestMessageAllOf.setStatus(String)",
    "void ConnectionRequestMessageAllOf.setTargetUserId(Long)",
    "void ConnectionRequestMessageAllOf.setUpdatedAt(Long)",
    "ConnectionRequestMessageAllOf ConnectionRequestMessageAllOf.status(String)",
    "ConnectionRequestMessageAllOf ConnectionRequestMessageAllOf.targetUserId(Long)",
    "String ConnectionRequestMessageAllOf.toString()",
    "ConnectionRequestMessageAllOf ConnectionRequestMessageAllOf.updatedAt(Long)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    ConnectionRequestMessageAllOf actualConnectionRequestMessageAllOf =
        new ConnectionRequestMessageAllOf();
    ConnectionRequestMessageAllOf actualFirstRequestedAtResult =
        actualConnectionRequestMessageAllOf.firstRequestedAt(1L);
    ConnectionRequestMessageAllOf actualRequestCounterResult =
        actualConnectionRequestMessageAllOf.requestCounter(3);
    ConnectionRequestMessageAllOf actualRequestingUserIdResult =
        actualConnectionRequestMessageAllOf.requestingUserId(1L);
    actualConnectionRequestMessageAllOf.setFirstRequestedAt(1L);
    actualConnectionRequestMessageAllOf.setRequestCounter(3);
    actualConnectionRequestMessageAllOf.setRequestingUserId(1L);
    actualConnectionRequestMessageAllOf.setStatus("Status");
    actualConnectionRequestMessageAllOf.setTargetUserId(1L);
    actualConnectionRequestMessageAllOf.setUpdatedAt(1L);
    ConnectionRequestMessageAllOf actualStatusResult =
        actualConnectionRequestMessageAllOf.status("Status");
    ConnectionRequestMessageAllOf actualTargetUserIdResult =
        actualConnectionRequestMessageAllOf.targetUserId(1L);
    ConnectionRequestMessageAllOf actualUpdatedAtResult =
        actualConnectionRequestMessageAllOf.updatedAt(1L);
    String actualToStringResult = actualConnectionRequestMessageAllOf.toString();
    Long actualFirstRequestedAt = actualConnectionRequestMessageAllOf.getFirstRequestedAt();
    Integer actualRequestCounter = actualConnectionRequestMessageAllOf.getRequestCounter();
    Long actualRequestingUserId = actualConnectionRequestMessageAllOf.getRequestingUserId();
    String actualStatus = actualConnectionRequestMessageAllOf.getStatus();
    Long actualTargetUserId = actualConnectionRequestMessageAllOf.getTargetUserId();
    Long actualUpdatedAt = actualConnectionRequestMessageAllOf.getUpdatedAt();

    // Assert
    assertEquals("Status", actualStatus);
    assertEquals(
        "class ConnectionRequestMessageAllOf {\n"
            + "    requestingUserId: 1\n"
            + "    targetUserId: 1\n"
            + "    firstRequestedAt: 1\n"
            + "    updatedAt: 1\n"
            + "    requestCounter: 3\n"
            + "    status: Status\n"
            + "}",
        actualToStringResult);
    assertEquals(1L, actualFirstRequestedAt.longValue());
    assertEquals(1L, actualRequestingUserId.longValue());
    assertEquals(1L, actualTargetUserId.longValue());
    assertEquals(1L, actualUpdatedAt.longValue());
    assertEquals(3, actualRequestCounter.intValue());
    assertSame(actualConnectionRequestMessageAllOf, actualFirstRequestedAtResult);
    assertSame(actualConnectionRequestMessageAllOf, actualRequestCounterResult);
    assertSame(actualConnectionRequestMessageAllOf, actualRequestingUserIdResult);
    assertSame(actualConnectionRequestMessageAllOf, actualStatusResult);
    assertSame(actualConnectionRequestMessageAllOf, actualTargetUserIdResult);
    assertSame(actualConnectionRequestMessageAllOf, actualUpdatedAtResult);
  }
}
