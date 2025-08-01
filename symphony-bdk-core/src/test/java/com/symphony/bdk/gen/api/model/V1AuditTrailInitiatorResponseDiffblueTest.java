package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V1AuditTrailInitiatorResponseDiffblueTest {
  /**
   * Test {@link V1AuditTrailInitiatorResponse#equals(Object)}, and {@link
   * V1AuditTrailInitiatorResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V1AuditTrailInitiatorResponse#equals(Object)}
   *   <li>{@link V1AuditTrailInitiatorResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1AuditTrailInitiatorResponse.equals(Object)",
    "int V1AuditTrailInitiatorResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V1AuditTrailInitiatorResponse v1AuditTrailInitiatorResponse =
        new V1AuditTrailInitiatorResponse();
    V1AuditTrailInitiatorResponse v1AuditTrailInitiatorResponse2 =
        new V1AuditTrailInitiatorResponse();

    // Act and Assert
    assertEquals(v1AuditTrailInitiatorResponse, v1AuditTrailInitiatorResponse2);
    int expectedHashCodeResult = v1AuditTrailInitiatorResponse.hashCode();
    assertEquals(expectedHashCodeResult, v1AuditTrailInitiatorResponse2.hashCode());
  }

  /**
   * Test {@link V1AuditTrailInitiatorResponse#equals(Object)}, and {@link
   * V1AuditTrailInitiatorResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V1AuditTrailInitiatorResponse#equals(Object)}
   *   <li>{@link V1AuditTrailInitiatorResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1AuditTrailInitiatorResponse.equals(Object)",
    "int V1AuditTrailInitiatorResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V1AuditTrailInitiatorResponse v1AuditTrailInitiatorResponse =
        new V1AuditTrailInitiatorResponse();

    // Act and Assert
    assertEquals(v1AuditTrailInitiatorResponse, v1AuditTrailInitiatorResponse);
    int expectedHashCodeResult = v1AuditTrailInitiatorResponse.hashCode();
    assertEquals(expectedHashCodeResult, v1AuditTrailInitiatorResponse.hashCode());
  }

  /**
   * Test {@link V1AuditTrailInitiatorResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1AuditTrailInitiatorResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1AuditTrailInitiatorResponse.equals(Object)",
    "int V1AuditTrailInitiatorResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1AuditTrailInitiatorResponse(), 1);
  }

  /**
   * Test {@link V1AuditTrailInitiatorResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1AuditTrailInitiatorResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1AuditTrailInitiatorResponse.equals(Object)",
    "int V1AuditTrailInitiatorResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V1AuditTrailInitiatorResponse v1AuditTrailInitiatorResponse =
        new V1AuditTrailInitiatorResponse();
    v1AuditTrailInitiatorResponse.action("Action");

    // Act and Assert
    assertNotEquals(v1AuditTrailInitiatorResponse, new V1AuditTrailInitiatorResponse());
  }

  /**
   * Test {@link V1AuditTrailInitiatorResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1AuditTrailInitiatorResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1AuditTrailInitiatorResponse.equals(Object)",
    "int V1AuditTrailInitiatorResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V1AuditTrailInitiatorResponse v1AuditTrailInitiatorResponse =
        new V1AuditTrailInitiatorResponse();
    v1AuditTrailInitiatorResponse.actionName("Action Name");

    // Act and Assert
    assertNotEquals(v1AuditTrailInitiatorResponse, new V1AuditTrailInitiatorResponse());
  }

  /**
   * Test {@link V1AuditTrailInitiatorResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1AuditTrailInitiatorResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1AuditTrailInitiatorResponse.equals(Object)",
    "int V1AuditTrailInitiatorResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V1AuditTrailInitiatorResponse v1AuditTrailInitiatorResponse =
        new V1AuditTrailInitiatorResponse();
    v1AuditTrailInitiatorResponse.timestamp("Timestamp");

    // Act and Assert
    assertNotEquals(v1AuditTrailInitiatorResponse, new V1AuditTrailInitiatorResponse());
  }

  /**
   * Test {@link V1AuditTrailInitiatorResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1AuditTrailInitiatorResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1AuditTrailInitiatorResponse.equals(Object)",
    "int V1AuditTrailInitiatorResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V1AuditTrailInitiatorResponse v1AuditTrailInitiatorResponse =
        new V1AuditTrailInitiatorResponse();
    v1AuditTrailInitiatorResponse.initiatorId("42");

    // Act and Assert
    assertNotEquals(v1AuditTrailInitiatorResponse, new V1AuditTrailInitiatorResponse());
  }

  /**
   * Test {@link V1AuditTrailInitiatorResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1AuditTrailInitiatorResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1AuditTrailInitiatorResponse.equals(Object)",
    "int V1AuditTrailInitiatorResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    V1AuditTrailInitiatorResponse v1AuditTrailInitiatorResponse =
        new V1AuditTrailInitiatorResponse();
    v1AuditTrailInitiatorResponse.initiatorUsername("janedoe");

    // Act and Assert
    assertNotEquals(v1AuditTrailInitiatorResponse, new V1AuditTrailInitiatorResponse());
  }

  /**
   * Test {@link V1AuditTrailInitiatorResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1AuditTrailInitiatorResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1AuditTrailInitiatorResponse.equals(Object)",
    "int V1AuditTrailInitiatorResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    V1AuditTrailInitiatorResponse v1AuditTrailInitiatorResponse =
        new V1AuditTrailInitiatorResponse();
    v1AuditTrailInitiatorResponse.initiatorEmailAddress("42 Main St");

    // Act and Assert
    assertNotEquals(v1AuditTrailInitiatorResponse, new V1AuditTrailInitiatorResponse());
  }

  /**
   * Test {@link V1AuditTrailInitiatorResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1AuditTrailInitiatorResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1AuditTrailInitiatorResponse.equals(Object)",
    "int V1AuditTrailInitiatorResponse.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1AuditTrailInitiatorResponse(), null);
  }

  /**
   * Test {@link V1AuditTrailInitiatorResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1AuditTrailInitiatorResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1AuditTrailInitiatorResponse.equals(Object)",
    "int V1AuditTrailInitiatorResponse.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new V1AuditTrailInitiatorResponse(), "Different type to V1AuditTrailInitiatorResponse");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V1AuditTrailInitiatorResponse}
   *   <li>{@link V1AuditTrailInitiatorResponse#action(String)}
   *   <li>{@link V1AuditTrailInitiatorResponse#actionName(String)}
   *   <li>{@link V1AuditTrailInitiatorResponse#initiatorEmailAddress(String)}
   *   <li>{@link V1AuditTrailInitiatorResponse#initiatorId(String)}
   *   <li>{@link V1AuditTrailInitiatorResponse#initiatorUsername(String)}
   *   <li>{@link V1AuditTrailInitiatorResponse#setAction(String)}
   *   <li>{@link V1AuditTrailInitiatorResponse#setActionName(String)}
   *   <li>{@link V1AuditTrailInitiatorResponse#setInitiatorEmailAddress(String)}
   *   <li>{@link V1AuditTrailInitiatorResponse#setInitiatorId(String)}
   *   <li>{@link V1AuditTrailInitiatorResponse#setInitiatorUsername(String)}
   *   <li>{@link V1AuditTrailInitiatorResponse#setTimestamp(String)}
   *   <li>{@link V1AuditTrailInitiatorResponse#timestamp(String)}
   *   <li>{@link V1AuditTrailInitiatorResponse#toString()}
   *   <li>{@link V1AuditTrailInitiatorResponse#getAction()}
   *   <li>{@link V1AuditTrailInitiatorResponse#getActionName()}
   *   <li>{@link V1AuditTrailInitiatorResponse#getInitiatorEmailAddress()}
   *   <li>{@link V1AuditTrailInitiatorResponse#getInitiatorId()}
   *   <li>{@link V1AuditTrailInitiatorResponse#getInitiatorUsername()}
   *   <li>{@link V1AuditTrailInitiatorResponse#getTimestamp()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V1AuditTrailInitiatorResponse.<init>()",
    "V1AuditTrailInitiatorResponse V1AuditTrailInitiatorResponse.action(String)",
    "V1AuditTrailInitiatorResponse V1AuditTrailInitiatorResponse.actionName(String)",
    "String V1AuditTrailInitiatorResponse.getAction()",
    "String V1AuditTrailInitiatorResponse.getActionName()",
    "String V1AuditTrailInitiatorResponse.getInitiatorEmailAddress()",
    "String V1AuditTrailInitiatorResponse.getInitiatorId()",
    "String V1AuditTrailInitiatorResponse.getInitiatorUsername()",
    "String V1AuditTrailInitiatorResponse.getTimestamp()",
    "V1AuditTrailInitiatorResponse V1AuditTrailInitiatorResponse.initiatorEmailAddress(String)",
    "V1AuditTrailInitiatorResponse V1AuditTrailInitiatorResponse.initiatorId(String)",
    "V1AuditTrailInitiatorResponse V1AuditTrailInitiatorResponse.initiatorUsername(String)",
    "void V1AuditTrailInitiatorResponse.setAction(String)",
    "void V1AuditTrailInitiatorResponse.setActionName(String)",
    "void V1AuditTrailInitiatorResponse.setInitiatorEmailAddress(String)",
    "void V1AuditTrailInitiatorResponse.setInitiatorId(String)",
    "void V1AuditTrailInitiatorResponse.setInitiatorUsername(String)",
    "void V1AuditTrailInitiatorResponse.setTimestamp(String)",
    "V1AuditTrailInitiatorResponse V1AuditTrailInitiatorResponse.timestamp(String)",
    "String V1AuditTrailInitiatorResponse.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V1AuditTrailInitiatorResponse actualV1AuditTrailInitiatorResponse =
        new V1AuditTrailInitiatorResponse();
    V1AuditTrailInitiatorResponse actualActionResult =
        actualV1AuditTrailInitiatorResponse.action("Action");
    V1AuditTrailInitiatorResponse actualActionNameResult =
        actualV1AuditTrailInitiatorResponse.actionName("Action Name");
    V1AuditTrailInitiatorResponse actualInitiatorEmailAddressResult =
        actualV1AuditTrailInitiatorResponse.initiatorEmailAddress("42 Main St");
    V1AuditTrailInitiatorResponse actualInitiatorIdResult =
        actualV1AuditTrailInitiatorResponse.initiatorId("42");
    V1AuditTrailInitiatorResponse actualInitiatorUsernameResult =
        actualV1AuditTrailInitiatorResponse.initiatorUsername("janedoe");
    actualV1AuditTrailInitiatorResponse.setAction("Action");
    actualV1AuditTrailInitiatorResponse.setActionName("Action Name");
    actualV1AuditTrailInitiatorResponse.setInitiatorEmailAddress("42 Main St");
    actualV1AuditTrailInitiatorResponse.setInitiatorId("42");
    actualV1AuditTrailInitiatorResponse.setInitiatorUsername("janedoe");
    actualV1AuditTrailInitiatorResponse.setTimestamp("Timestamp");
    V1AuditTrailInitiatorResponse actualTimestampResult =
        actualV1AuditTrailInitiatorResponse.timestamp("Timestamp");
    String actualToStringResult = actualV1AuditTrailInitiatorResponse.toString();
    String actualAction = actualV1AuditTrailInitiatorResponse.getAction();
    String actualActionName = actualV1AuditTrailInitiatorResponse.getActionName();
    String actualInitiatorEmailAddress =
        actualV1AuditTrailInitiatorResponse.getInitiatorEmailAddress();
    String actualInitiatorId = actualV1AuditTrailInitiatorResponse.getInitiatorId();
    String actualInitiatorUsername = actualV1AuditTrailInitiatorResponse.getInitiatorUsername();

    // Assert
    assertEquals("42 Main St", actualInitiatorEmailAddress);
    assertEquals("42", actualInitiatorId);
    assertEquals("Action Name", actualActionName);
    assertEquals("Action", actualAction);
    assertEquals("Timestamp", actualV1AuditTrailInitiatorResponse.getTimestamp());
    assertEquals(
        "class V1AuditTrailInitiatorResponse {\n"
            + "    action: Action\n"
            + "    actionName: Action Name\n"
            + "    timestamp: Timestamp\n"
            + "    initiatorId: 42\n"
            + "    initiatorUsername: janedoe\n"
            + "    initiatorEmailAddress: 42 Main St\n"
            + "}",
        actualToStringResult);
    assertEquals("janedoe", actualInitiatorUsername);
    assertSame(actualV1AuditTrailInitiatorResponse, actualActionResult);
    assertSame(actualV1AuditTrailInitiatorResponse, actualActionNameResult);
    assertSame(actualV1AuditTrailInitiatorResponse, actualInitiatorEmailAddressResult);
    assertSame(actualV1AuditTrailInitiatorResponse, actualInitiatorIdResult);
    assertSame(actualV1AuditTrailInitiatorResponse, actualInitiatorUsernameResult);
    assertSame(actualV1AuditTrailInitiatorResponse, actualTimestampResult);
  }
}
