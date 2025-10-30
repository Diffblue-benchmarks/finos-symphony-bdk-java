package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V1DLPViolationMessageDiffblueTest {
  /**
   * Test {@link V1DLPViolationMessage#equals(Object)}, and {@link V1DLPViolationMessage#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V1DLPViolationMessage#equals(Object)}
   *   <li>{@link V1DLPViolationMessage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPViolationMessage.equals(Object)", "int V1DLPViolationMessage.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V1DLPViolationMessage v1dlpViolationMessage = new V1DLPViolationMessage();
    V1DLPViolationMessage v1dlpViolationMessage2 = new V1DLPViolationMessage();

    // Act and Assert
    assertEquals(v1dlpViolationMessage, v1dlpViolationMessage2);
    int expectedHashCodeResult = v1dlpViolationMessage.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpViolationMessage2.hashCode());
  }

  /**
   * Test {@link V1DLPViolationMessage#equals(Object)}, and {@link V1DLPViolationMessage#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V1DLPViolationMessage#equals(Object)}
   *   <li>{@link V1DLPViolationMessage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPViolationMessage.equals(Object)", "int V1DLPViolationMessage.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V1DLPViolationMessage v1dlpViolationMessage = new V1DLPViolationMessage();

    // Act and Assert
    assertEquals(v1dlpViolationMessage, v1dlpViolationMessage);
    int expectedHashCodeResult = v1dlpViolationMessage.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpViolationMessage.hashCode());
  }

  /**
   * Test {@link V1DLPViolationMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPViolationMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPViolationMessage.equals(Object)", "int V1DLPViolationMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPViolationMessage(), 1);
  }

  /**
   * Test {@link V1DLPViolationMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPViolationMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPViolationMessage.equals(Object)", "int V1DLPViolationMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V1DLPViolationMessage v1dlpViolationMessage = new V1DLPViolationMessage();
    v1dlpViolationMessage.violation(new V1DLPViolation());

    // Act and Assert
    assertNotEquals(v1dlpViolationMessage, new V1DLPViolationMessage());
  }

  /**
   * Test {@link V1DLPViolationMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPViolationMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPViolationMessage.equals(Object)", "int V1DLPViolationMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V1DLPViolationMessage v1dlpViolationMessage = new V1DLPViolationMessage();
    v1dlpViolationMessage.message(new V4Message());

    // Act and Assert
    assertNotEquals(v1dlpViolationMessage, new V1DLPViolationMessage());
  }

  /**
   * Test {@link V1DLPViolationMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPViolationMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPViolationMessage.equals(Object)", "int V1DLPViolationMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V1DLPViolationMessage v1dlpViolationMessage = new V1DLPViolationMessage();
    v1dlpViolationMessage.diagnostic("Diagnostic");

    // Act and Assert
    assertNotEquals(v1dlpViolationMessage, new V1DLPViolationMessage());
  }

  /**
   * Test {@link V1DLPViolationMessage#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPViolationMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPViolationMessage.equals(Object)", "int V1DLPViolationMessage.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPViolationMessage(), null);
  }

  /**
   * Test {@link V1DLPViolationMessage#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPViolationMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPViolationMessage.equals(Object)", "int V1DLPViolationMessage.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPViolationMessage(), "Different type to V1DLPViolationMessage");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V1DLPViolationMessage}
   *   <li>{@link V1DLPViolationMessage#diagnostic(String)}
   *   <li>{@link V1DLPViolationMessage#message(V4Message)}
   *   <li>{@link V1DLPViolationMessage#setDiagnostic(String)}
   *   <li>{@link V1DLPViolationMessage#setMessage(V4Message)}
   *   <li>{@link V1DLPViolationMessage#setViolation(V1DLPViolation)}
   *   <li>{@link V1DLPViolationMessage#violation(V1DLPViolation)}
   *   <li>{@link V1DLPViolationMessage#toString()}
   *   <li>{@link V1DLPViolationMessage#getDiagnostic()}
   *   <li>{@link V1DLPViolationMessage#getMessage()}
   *   <li>{@link V1DLPViolationMessage#getViolation()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V1DLPViolationMessage.<init>()",
      "V1DLPViolationMessage V1DLPViolationMessage.diagnostic(String)", "String V1DLPViolationMessage.getDiagnostic()",
      "V4Message V1DLPViolationMessage.getMessage()", "V1DLPViolation V1DLPViolationMessage.getViolation()",
      "V1DLPViolationMessage V1DLPViolationMessage.message(V4Message)",
      "void V1DLPViolationMessage.setDiagnostic(String)", "void V1DLPViolationMessage.setMessage(V4Message)",
      "void V1DLPViolationMessage.setViolation(V1DLPViolation)", "String V1DLPViolationMessage.toString()",
      "V1DLPViolationMessage V1DLPViolationMessage.violation(V1DLPViolation)"})
  void testGettersAndSetters() {
    // Arrange and Act
    V1DLPViolationMessage actualV1dlpViolationMessage = new V1DLPViolationMessage();
    V1DLPViolationMessage actualDiagnosticResult = actualV1dlpViolationMessage.diagnostic("Diagnostic");
    V1DLPViolationMessage actualMessageResult = actualV1dlpViolationMessage.message(new V4Message());
    actualV1dlpViolationMessage.setDiagnostic("Diagnostic");
    V4Message message = new V4Message();
    actualV1dlpViolationMessage.setMessage(message);
    actualV1dlpViolationMessage.setViolation(new V1DLPViolation());
    V1DLPViolation violation = new V1DLPViolation();
    V1DLPViolationMessage actualViolationResult = actualV1dlpViolationMessage.violation(violation);
    String actualToStringResult = actualV1dlpViolationMessage.toString();
    String actualDiagnostic = actualV1dlpViolationMessage.getDiagnostic();
    V4Message actualMessage = actualV1dlpViolationMessage.getMessage();

    // Assert
    assertEquals("Diagnostic", actualDiagnostic);
    assertEquals("class V1DLPViolationMessage {\n" + "    violation: class V1DLPViolation {\n"
        + "        enforcementEventID: null\n" + "        entityID: null\n" + "        createTime: null\n"
        + "        lastModified: null\n" + "        requesterId: null\n" + "        matchedPolicies: null\n"
        + "        action: null\n" + "        outcome: null\n" + "        contentType: null\n"
        + "        version: null\n" + "        ignoreDLPwarning: null\n" + "    }\n"
        + "    message: class V4Message {\n" + "        messageId: null\n" + "        parentMessageId: null\n"
        + "        timestamp: null\n" + "        message: null\n" + "        sharedMessage: null\n"
        + "        data: null\n" + "        attachments: null\n" + "        user: null\n" + "        stream: null\n"
        + "        externalRecipients: null\n" + "        diagnostic: null\n" + "        userAgent: null\n"
        + "        originalFormat: null\n" + "        disclaimer: null\n" + "        sid: null\n"
        + "        replacing: null\n" + "        replacedBy: null\n" + "        initialTimestamp: null\n"
        + "        initialMessageId: null\n" + "        silent: null\n" + "    }\n" + "    diagnostic: Diagnostic\n"
        + "}", actualToStringResult);
    assertSame(violation, actualV1dlpViolationMessage.getViolation());
    assertSame(actualV1dlpViolationMessage, actualDiagnosticResult);
    assertSame(actualV1dlpViolationMessage, actualMessageResult);
    assertSame(actualV1dlpViolationMessage, actualViolationResult);
    assertSame(message, actualMessage);
  }
}
