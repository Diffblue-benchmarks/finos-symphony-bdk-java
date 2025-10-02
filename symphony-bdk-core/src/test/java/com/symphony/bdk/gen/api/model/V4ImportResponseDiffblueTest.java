package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V4ImportResponseDiffblueTest {
  /**
   * Test {@link V4ImportResponse#equals(Object)}, and {@link V4ImportResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4ImportResponse#equals(Object)}
   *   <li>{@link V4ImportResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4ImportResponse.equals(Object)", "int V4ImportResponse.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4ImportResponse v4ImportResponse = new V4ImportResponse();
    V4ImportResponse v4ImportResponse2 = new V4ImportResponse();

    // Act and Assert
    assertEquals(v4ImportResponse, v4ImportResponse2);
    assertEquals(v4ImportResponse.hashCode(), v4ImportResponse2.hashCode());
  }

  /**
   * Test {@link V4ImportResponse#equals(Object)}, and {@link V4ImportResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4ImportResponse#equals(Object)}
   *   <li>{@link V4ImportResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4ImportResponse.equals(Object)", "int V4ImportResponse.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4ImportResponse v4ImportResponse = new V4ImportResponse();

    // Act and Assert
    assertEquals(v4ImportResponse, v4ImportResponse);
    int expectedHashCodeResult = v4ImportResponse.hashCode();
    assertEquals(expectedHashCodeResult, v4ImportResponse.hashCode());
  }

  /**
   * Test {@link V4ImportResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4ImportResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4ImportResponse.equals(Object)", "int V4ImportResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4ImportResponse(), 1);
  }

  /**
   * Test {@link V4ImportResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4ImportResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4ImportResponse.equals(Object)", "int V4ImportResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V4ImportResponse v4ImportResponse = new V4ImportResponse();
    v4ImportResponse.messageId("42");

    // Act and Assert
    assertNotEquals(v4ImportResponse, new V4ImportResponse());
  }

  /**
   * Test {@link V4ImportResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4ImportResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4ImportResponse.equals(Object)", "int V4ImportResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V4ImportResponse v4ImportResponse = new V4ImportResponse();
    v4ImportResponse.originatingSystemId("42");

    // Act and Assert
    assertNotEquals(v4ImportResponse, new V4ImportResponse());
  }

  /**
   * Test {@link V4ImportResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4ImportResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4ImportResponse.equals(Object)", "int V4ImportResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V4ImportResponse v4ImportResponse = new V4ImportResponse();
    v4ImportResponse.originalMessageId("42");

    // Act and Assert
    assertNotEquals(v4ImportResponse, new V4ImportResponse());
  }

  /**
   * Test {@link V4ImportResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4ImportResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4ImportResponse.equals(Object)", "int V4ImportResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V4ImportResponse v4ImportResponse = new V4ImportResponse();
    v4ImportResponse.diagnostic("Diagnostic");

    // Act and Assert
    assertNotEquals(v4ImportResponse, new V4ImportResponse());
  }

  /**
   * Test {@link V4ImportResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4ImportResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4ImportResponse.equals(Object)", "int V4ImportResponse.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4ImportResponse(), null);
  }

  /**
   * Test {@link V4ImportResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4ImportResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4ImportResponse.equals(Object)", "int V4ImportResponse.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4ImportResponse(), "Different type to V4ImportResponse");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V4ImportResponse}
   *   <li>{@link V4ImportResponse#diagnostic(String)}
   *   <li>{@link V4ImportResponse#messageId(String)}
   *   <li>{@link V4ImportResponse#originalMessageId(String)}
   *   <li>{@link V4ImportResponse#originatingSystemId(String)}
   *   <li>{@link V4ImportResponse#setDiagnostic(String)}
   *   <li>{@link V4ImportResponse#setMessageId(String)}
   *   <li>{@link V4ImportResponse#setOriginalMessageId(String)}
   *   <li>{@link V4ImportResponse#setOriginatingSystemId(String)}
   *   <li>{@link V4ImportResponse#toString()}
   *   <li>{@link V4ImportResponse#getDiagnostic()}
   *   <li>{@link V4ImportResponse#getMessageId()}
   *   <li>{@link V4ImportResponse#getOriginalMessageId()}
   *   <li>{@link V4ImportResponse#getOriginatingSystemId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V4ImportResponse.<init>()",
    "V4ImportResponse V4ImportResponse.diagnostic(String)",
    "String V4ImportResponse.getDiagnostic()",
    "String V4ImportResponse.getMessageId()",
    "String V4ImportResponse.getOriginalMessageId()",
    "String V4ImportResponse.getOriginatingSystemId()",
    "V4ImportResponse V4ImportResponse.messageId(String)",
    "V4ImportResponse V4ImportResponse.originalMessageId(String)",
    "V4ImportResponse V4ImportResponse.originatingSystemId(String)",
    "void V4ImportResponse.setDiagnostic(String)",
    "void V4ImportResponse.setMessageId(String)",
    "void V4ImportResponse.setOriginalMessageId(String)",
    "void V4ImportResponse.setOriginatingSystemId(String)",
    "String V4ImportResponse.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V4ImportResponse actualV4ImportResponse = new V4ImportResponse();
    V4ImportResponse actualDiagnosticResult = actualV4ImportResponse.diagnostic("Diagnostic");
    V4ImportResponse actualMessageIdResult = actualV4ImportResponse.messageId("42");
    V4ImportResponse actualOriginalMessageIdResult = actualV4ImportResponse.originalMessageId("42");
    V4ImportResponse actualOriginatingSystemIdResult =
        actualV4ImportResponse.originatingSystemId("42");
    actualV4ImportResponse.setDiagnostic("Diagnostic");
    actualV4ImportResponse.setMessageId("42");
    actualV4ImportResponse.setOriginalMessageId("42");
    actualV4ImportResponse.setOriginatingSystemId("42");
    String actualToStringResult = actualV4ImportResponse.toString();
    String actualDiagnostic = actualV4ImportResponse.getDiagnostic();
    String actualMessageId = actualV4ImportResponse.getMessageId();
    String actualOriginalMessageId = actualV4ImportResponse.getOriginalMessageId();

    // Assert
    assertEquals("42", actualMessageId);
    assertEquals("42", actualOriginalMessageId);
    assertEquals("42", actualV4ImportResponse.getOriginatingSystemId());
    assertEquals("Diagnostic", actualDiagnostic);
    assertEquals(
        "class V4ImportResponse {\n"
            + "    messageId: 42\n"
            + "    originatingSystemId: 42\n"
            + "    originalMessageId: 42\n"
            + "    diagnostic: Diagnostic\n"
            + "}",
        actualToStringResult);
    assertSame(actualV4ImportResponse, actualDiagnosticResult);
    assertSame(actualV4ImportResponse, actualMessageIdResult);
    assertSame(actualV4ImportResponse, actualOriginalMessageIdResult);
    assertSame(actualV4ImportResponse, actualOriginatingSystemIdResult);
  }
}
