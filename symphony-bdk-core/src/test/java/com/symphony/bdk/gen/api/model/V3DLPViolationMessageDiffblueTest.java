package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V3DLPViolationMessageDiffblueTest {
  /**
   * Test {@link V3DLPViolationMessage#equals(Object)}, and {@link V3DLPViolationMessage#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V3DLPViolationMessage#equals(Object)}
   *   <li>{@link V3DLPViolationMessage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPViolationMessage.equals(Object)", "int V3DLPViolationMessage.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V3DLPViolationMessage v3dlpViolationMessage = new V3DLPViolationMessage();
    V3DLPViolationMessage v3dlpViolationMessage2 = new V3DLPViolationMessage();

    // Act and Assert
    assertEquals(v3dlpViolationMessage, v3dlpViolationMessage2);
    int expectedHashCodeResult = v3dlpViolationMessage.hashCode();
    assertEquals(expectedHashCodeResult, v3dlpViolationMessage2.hashCode());
  }

  /**
   * Test {@link V3DLPViolationMessage#equals(Object)}, and {@link V3DLPViolationMessage#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V3DLPViolationMessage#equals(Object)}
   *   <li>{@link V3DLPViolationMessage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPViolationMessage.equals(Object)", "int V3DLPViolationMessage.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V3DLPViolationMessage v3dlpViolationMessage = new V3DLPViolationMessage();

    // Act and Assert
    assertEquals(v3dlpViolationMessage, v3dlpViolationMessage);
    int expectedHashCodeResult = v3dlpViolationMessage.hashCode();
    assertEquals(expectedHashCodeResult, v3dlpViolationMessage.hashCode());
  }

  /**
   * Test {@link V3DLPViolationMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3DLPViolationMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPViolationMessage.equals(Object)", "int V3DLPViolationMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPViolationMessage(), 1);
  }

  /**
   * Test {@link V3DLPViolationMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3DLPViolationMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPViolationMessage.equals(Object)", "int V3DLPViolationMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V3DLPViolationMessage v3dlpViolationMessage = new V3DLPViolationMessage();
    v3dlpViolationMessage.violation(new V3DLPViolation());

    // Act and Assert
    assertNotEquals(v3dlpViolationMessage, new V3DLPViolationMessage());
  }

  /**
   * Test {@link V3DLPViolationMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3DLPViolationMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPViolationMessage.equals(Object)", "int V3DLPViolationMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V3DLPViolationMessage v3dlpViolationMessage = new V3DLPViolationMessage();
    v3dlpViolationMessage.message(new V4Message());

    // Act and Assert
    assertNotEquals(v3dlpViolationMessage, new V3DLPViolationMessage());
  }

  /**
   * Test {@link V3DLPViolationMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3DLPViolationMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPViolationMessage.equals(Object)", "int V3DLPViolationMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V3DLPViolationMessage v3dlpViolationMessage = new V3DLPViolationMessage();
    v3dlpViolationMessage.sharedMessage(new V4Message());

    // Act and Assert
    assertNotEquals(v3dlpViolationMessage, new V3DLPViolationMessage());
  }

  /**
   * Test {@link V3DLPViolationMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3DLPViolationMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPViolationMessage.equals(Object)", "int V3DLPViolationMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V3DLPViolationMessage v3dlpViolationMessage = new V3DLPViolationMessage();
    v3dlpViolationMessage.diagnostic("Diagnostic");

    // Act and Assert
    assertNotEquals(v3dlpViolationMessage, new V3DLPViolationMessage());
  }

  /**
   * Test {@link V3DLPViolationMessage#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3DLPViolationMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPViolationMessage.equals(Object)", "int V3DLPViolationMessage.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPViolationMessage(), null);
  }

  /**
   * Test {@link V3DLPViolationMessage#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3DLPViolationMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPViolationMessage.equals(Object)", "int V3DLPViolationMessage.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPViolationMessage(), "Different type to V3DLPViolationMessage");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V3DLPViolationMessage}
   *   <li>{@link V3DLPViolationMessage#diagnostic(String)}
   *   <li>{@link V3DLPViolationMessage#message(V4Message)}
   *   <li>{@link V3DLPViolationMessage#setDiagnostic(String)}
   *   <li>{@link V3DLPViolationMessage#setMessage(V4Message)}
   *   <li>{@link V3DLPViolationMessage#setSharedMessage(V4Message)}
   *   <li>{@link V3DLPViolationMessage#setViolation(V3DLPViolation)}
   *   <li>{@link V3DLPViolationMessage#sharedMessage(V4Message)}
   *   <li>{@link V3DLPViolationMessage#violation(V3DLPViolation)}
   *   <li>{@link V3DLPViolationMessage#toString()}
   *   <li>{@link V3DLPViolationMessage#getDiagnostic()}
   *   <li>{@link V3DLPViolationMessage#getMessage()}
   *   <li>{@link V3DLPViolationMessage#getSharedMessage()}
   *   <li>{@link V3DLPViolationMessage#getViolation()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V3DLPViolationMessage.<init>()",
      "V3DLPViolationMessage V3DLPViolationMessage.diagnostic(String)", "String V3DLPViolationMessage.getDiagnostic()",
      "V4Message V3DLPViolationMessage.getMessage()", "V4Message V3DLPViolationMessage.getSharedMessage()",
      "V3DLPViolation V3DLPViolationMessage.getViolation()",
      "V3DLPViolationMessage V3DLPViolationMessage.message(V4Message)",
      "void V3DLPViolationMessage.setDiagnostic(String)", "void V3DLPViolationMessage.setMessage(V4Message)",
      "void V3DLPViolationMessage.setSharedMessage(V4Message)",
      "void V3DLPViolationMessage.setViolation(V3DLPViolation)",
      "V3DLPViolationMessage V3DLPViolationMessage.sharedMessage(V4Message)", "String V3DLPViolationMessage.toString()",
      "V3DLPViolationMessage V3DLPViolationMessage.violation(V3DLPViolation)"})
  void testGettersAndSetters() {
    // Arrange and Act
    V3DLPViolationMessage actualV3dlpViolationMessage = new V3DLPViolationMessage();
    V3DLPViolationMessage actualDiagnosticResult = actualV3dlpViolationMessage.diagnostic("Diagnostic");
    V3DLPViolationMessage actualMessageResult = actualV3dlpViolationMessage.message(new V4Message());
    actualV3dlpViolationMessage.setDiagnostic("Diagnostic");
    V4Message message = new V4Message();
    actualV3dlpViolationMessage.setMessage(message);
    actualV3dlpViolationMessage.setSharedMessage(new V4Message());
    actualV3dlpViolationMessage.setViolation(new V3DLPViolation());
    V4Message sharedMessage = new V4Message();
    V3DLPViolationMessage actualSharedMessageResult = actualV3dlpViolationMessage.sharedMessage(sharedMessage);
    V3DLPViolation violation = new V3DLPViolation();
    V3DLPViolationMessage actualViolationResult = actualV3dlpViolationMessage.violation(violation);
    String actualToStringResult = actualV3dlpViolationMessage.toString();
    String actualDiagnostic = actualV3dlpViolationMessage.getDiagnostic();
    V4Message actualMessage = actualV3dlpViolationMessage.getMessage();
    V4Message actualSharedMessage = actualV3dlpViolationMessage.getSharedMessage();

    // Assert
    assertEquals("Diagnostic", actualDiagnostic);
    assertEquals("class V3DLPViolationMessage {\n" + "    violation: class V3DLPViolation {\n"
        + "        enforcementEventID: null\n" + "        entityID: null\n" + "        createTime: null\n"
        + "        lastModified: null\n" + "        requesterId: null\n" + "        details: null\n"
        + "        action: null\n" + "        outcome: null\n" + "        version: null\n"
        + "        ignoreDLPwarning: null\n" + "    }\n" + "    message: class V4Message {\n"
        + "        messageId: null\n" + "        parentMessageId: null\n" + "        timestamp: null\n"
        + "        message: null\n" + "        sharedMessage: null\n" + "        data: null\n"
        + "        attachments: null\n" + "        user: null\n" + "        stream: null\n"
        + "        externalRecipients: null\n" + "        diagnostic: null\n" + "        userAgent: null\n"
        + "        originalFormat: null\n" + "        disclaimer: null\n" + "        sid: null\n"
        + "        replacing: null\n" + "        replacedBy: null\n" + "        initialTimestamp: null\n"
        + "        initialMessageId: null\n" + "        silent: null\n" + "    }\n"
        + "    sharedMessage: class V4Message {\n" + "        messageId: null\n" + "        parentMessageId: null\n"
        + "        timestamp: null\n" + "        message: null\n" + "        sharedMessage: null\n"
        + "        data: null\n" + "        attachments: null\n" + "        user: null\n" + "        stream: null\n"
        + "        externalRecipients: null\n" + "        diagnostic: null\n" + "        userAgent: null\n"
        + "        originalFormat: null\n" + "        disclaimer: null\n" + "        sid: null\n"
        + "        replacing: null\n" + "        replacedBy: null\n" + "        initialTimestamp: null\n"
        + "        initialMessageId: null\n" + "        silent: null\n" + "    }\n" + "    diagnostic: Diagnostic\n"
        + "}", actualToStringResult);
    assertSame(violation, actualV3dlpViolationMessage.getViolation());
    assertSame(actualV3dlpViolationMessage, actualDiagnosticResult);
    assertSame(actualV3dlpViolationMessage, actualMessageResult);
    assertSame(actualV3dlpViolationMessage, actualSharedMessageResult);
    assertSame(actualV3dlpViolationMessage, actualViolationResult);
    assertSame(message, actualMessage);
    assertSame(sharedMessage, actualSharedMessage);
  }
}
