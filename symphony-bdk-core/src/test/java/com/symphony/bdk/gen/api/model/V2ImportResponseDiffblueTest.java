package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V2ImportResponseDiffblueTest {
  /**
   * Test {@link V2ImportResponse#equals(Object)}, and {@link V2ImportResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2ImportResponse#equals(Object)}
   *   <li>{@link V2ImportResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2ImportResponse.equals(Object)", "int V2ImportResponse.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2ImportResponse v2ImportResponse = new V2ImportResponse();
    V2ImportResponse v2ImportResponse2 = new V2ImportResponse();

    // Act and Assert
    assertEquals(v2ImportResponse, v2ImportResponse2);
    int expectedHashCodeResult = v2ImportResponse.hashCode();
    assertEquals(expectedHashCodeResult, v2ImportResponse2.hashCode());
  }

  /**
   * Test {@link V2ImportResponse#equals(Object)}, and {@link V2ImportResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2ImportResponse#equals(Object)}
   *   <li>{@link V2ImportResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2ImportResponse.equals(Object)", "int V2ImportResponse.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2ImportResponse v2ImportResponse = new V2ImportResponse();

    // Act and Assert
    assertEquals(v2ImportResponse, v2ImportResponse);
    int expectedHashCodeResult = v2ImportResponse.hashCode();
    assertEquals(expectedHashCodeResult, v2ImportResponse.hashCode());
  }

  /**
   * Test {@link V2ImportResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2ImportResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2ImportResponse.equals(Object)", "int V2ImportResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2ImportResponse(), 1);
  }

  /**
   * Test {@link V2ImportResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2ImportResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2ImportResponse.equals(Object)", "int V2ImportResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V2ImportResponse v2ImportResponse = new V2ImportResponse();
    v2ImportResponse.messageId("42");

    // Act and Assert
    assertNotEquals(v2ImportResponse, new V2ImportResponse());
  }

  /**
   * Test {@link V2ImportResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2ImportResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2ImportResponse.equals(Object)", "int V2ImportResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V2ImportResponse v2ImportResponse = new V2ImportResponse();
    v2ImportResponse.originatingSystemId("42");

    // Act and Assert
    assertNotEquals(v2ImportResponse, new V2ImportResponse());
  }

  /**
   * Test {@link V2ImportResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2ImportResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2ImportResponse.equals(Object)", "int V2ImportResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V2ImportResponse v2ImportResponse = new V2ImportResponse();
    v2ImportResponse.originalMessageId("42");

    // Act and Assert
    assertNotEquals(v2ImportResponse, new V2ImportResponse());
  }

  /**
   * Test {@link V2ImportResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2ImportResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2ImportResponse.equals(Object)", "int V2ImportResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V2ImportResponse v2ImportResponse = new V2ImportResponse();
    v2ImportResponse.diagnostic("Diagnostic");

    // Act and Assert
    assertNotEquals(v2ImportResponse, new V2ImportResponse());
  }

  /**
   * Test {@link V2ImportResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2ImportResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2ImportResponse.equals(Object)", "int V2ImportResponse.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2ImportResponse(), null);
  }

  /**
   * Test {@link V2ImportResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2ImportResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2ImportResponse.equals(Object)", "int V2ImportResponse.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2ImportResponse(), "Different type to V2ImportResponse");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V2ImportResponse}
   *   <li>{@link V2ImportResponse#diagnostic(String)}
   *   <li>{@link V2ImportResponse#messageId(String)}
   *   <li>{@link V2ImportResponse#originalMessageId(String)}
   *   <li>{@link V2ImportResponse#originatingSystemId(String)}
   *   <li>{@link V2ImportResponse#setDiagnostic(String)}
   *   <li>{@link V2ImportResponse#setMessageId(String)}
   *   <li>{@link V2ImportResponse#setOriginalMessageId(String)}
   *   <li>{@link V2ImportResponse#setOriginatingSystemId(String)}
   *   <li>{@link V2ImportResponse#toString()}
   *   <li>{@link V2ImportResponse#getDiagnostic()}
   *   <li>{@link V2ImportResponse#getMessageId()}
   *   <li>{@link V2ImportResponse#getOriginalMessageId()}
   *   <li>{@link V2ImportResponse#getOriginatingSystemId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V2ImportResponse.<init>()",
    "V2ImportResponse V2ImportResponse.diagnostic(String)",
    "String V2ImportResponse.getDiagnostic()",
    "String V2ImportResponse.getMessageId()",
    "String V2ImportResponse.getOriginalMessageId()",
    "String V2ImportResponse.getOriginatingSystemId()",
    "V2ImportResponse V2ImportResponse.messageId(String)",
    "V2ImportResponse V2ImportResponse.originalMessageId(String)",
    "V2ImportResponse V2ImportResponse.originatingSystemId(String)",
    "void V2ImportResponse.setDiagnostic(String)",
    "void V2ImportResponse.setMessageId(String)",
    "void V2ImportResponse.setOriginalMessageId(String)",
    "void V2ImportResponse.setOriginatingSystemId(String)",
    "String V2ImportResponse.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V2ImportResponse actualV2ImportResponse = new V2ImportResponse();
    V2ImportResponse actualDiagnosticResult = actualV2ImportResponse.diagnostic("Diagnostic");
    V2ImportResponse actualMessageIdResult = actualV2ImportResponse.messageId("42");
    V2ImportResponse actualOriginalMessageIdResult = actualV2ImportResponse.originalMessageId("42");
    V2ImportResponse actualOriginatingSystemIdResult =
        actualV2ImportResponse.originatingSystemId("42");
    actualV2ImportResponse.setDiagnostic("Diagnostic");
    actualV2ImportResponse.setMessageId("42");
    actualV2ImportResponse.setOriginalMessageId("42");
    actualV2ImportResponse.setOriginatingSystemId("42");
    String actualToStringResult = actualV2ImportResponse.toString();
    String actualDiagnostic = actualV2ImportResponse.getDiagnostic();
    String actualMessageId = actualV2ImportResponse.getMessageId();
    String actualOriginalMessageId = actualV2ImportResponse.getOriginalMessageId();

    // Assert
    assertEquals("42", actualMessageId);
    assertEquals("42", actualOriginalMessageId);
    assertEquals("42", actualV2ImportResponse.getOriginatingSystemId());
    assertEquals("Diagnostic", actualDiagnostic);
    assertEquals(
        "class V2ImportResponse {\n"
            + "    messageId: 42\n"
            + "    originatingSystemId: 42\n"
            + "    originalMessageId: 42\n"
            + "    diagnostic: Diagnostic\n"
            + "}",
        actualToStringResult);
    assertSame(actualV2ImportResponse, actualDiagnosticResult);
    assertSame(actualV2ImportResponse, actualMessageIdResult);
    assertSame(actualV2ImportResponse, actualOriginalMessageIdResult);
    assertSame(actualV2ImportResponse, actualOriginatingSystemIdResult);
  }
}
