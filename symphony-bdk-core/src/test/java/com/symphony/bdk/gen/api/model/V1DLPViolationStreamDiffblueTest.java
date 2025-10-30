package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V1DLPViolationStreamDiffblueTest {
  /**
   * Test {@link V1DLPViolationStream#equals(Object)}, and {@link V1DLPViolationStream#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V1DLPViolationStream#equals(Object)}
   *   <li>{@link V1DLPViolationStream#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPViolationStream.equals(Object)", "int V1DLPViolationStream.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V1DLPViolationStream v1dlpViolationStream = new V1DLPViolationStream();
    V1DLPViolationStream v1dlpViolationStream2 = new V1DLPViolationStream();

    // Act and Assert
    assertEquals(v1dlpViolationStream, v1dlpViolationStream2);
    int expectedHashCodeResult = v1dlpViolationStream.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpViolationStream2.hashCode());
  }

  /**
   * Test {@link V1DLPViolationStream#equals(Object)}, and {@link V1DLPViolationStream#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V1DLPViolationStream#equals(Object)}
   *   <li>{@link V1DLPViolationStream#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPViolationStream.equals(Object)", "int V1DLPViolationStream.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V1DLPViolationStream v1dlpViolationStream = new V1DLPViolationStream();

    // Act and Assert
    assertEquals(v1dlpViolationStream, v1dlpViolationStream);
    int expectedHashCodeResult = v1dlpViolationStream.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpViolationStream.hashCode());
  }

  /**
   * Test {@link V1DLPViolationStream#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPViolationStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPViolationStream.equals(Object)", "int V1DLPViolationStream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPViolationStream(), 1);
  }

  /**
   * Test {@link V1DLPViolationStream#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPViolationStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPViolationStream.equals(Object)", "int V1DLPViolationStream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V1DLPViolationStream v1dlpViolationStream = new V1DLPViolationStream();
    v1dlpViolationStream.violation(new V1DLPViolation());

    // Act and Assert
    assertNotEquals(v1dlpViolationStream, new V1DLPViolationStream());
  }

  /**
   * Test {@link V1DLPViolationStream#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPViolationStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPViolationStream.equals(Object)", "int V1DLPViolationStream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V1DLPViolationStream v1dlpViolationStream = new V1DLPViolationStream();
    v1dlpViolationStream.stream(new V1DLPStream());

    // Act and Assert
    assertNotEquals(v1dlpViolationStream, new V1DLPViolationStream());
  }

  /**
   * Test {@link V1DLPViolationStream#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPViolationStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPViolationStream.equals(Object)", "int V1DLPViolationStream.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPViolationStream(), null);
  }

  /**
   * Test {@link V1DLPViolationStream#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPViolationStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPViolationStream.equals(Object)", "int V1DLPViolationStream.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPViolationStream(), "Different type to V1DLPViolationStream");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V1DLPViolationStream}
   *   <li>{@link V1DLPViolationStream#setStream(V1DLPStream)}
   *   <li>{@link V1DLPViolationStream#setViolation(V1DLPViolation)}
   *   <li>{@link V1DLPViolationStream#stream(V1DLPStream)}
   *   <li>{@link V1DLPViolationStream#violation(V1DLPViolation)}
   *   <li>{@link V1DLPViolationStream#toString()}
   *   <li>{@link V1DLPViolationStream#getStream()}
   *   <li>{@link V1DLPViolationStream#getViolation()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V1DLPViolationStream.<init>()", "V1DLPStream V1DLPViolationStream.getStream()",
      "V1DLPViolation V1DLPViolationStream.getViolation()", "void V1DLPViolationStream.setStream(V1DLPStream)",
      "void V1DLPViolationStream.setViolation(V1DLPViolation)",
      "V1DLPViolationStream V1DLPViolationStream.stream(V1DLPStream)", "String V1DLPViolationStream.toString()",
      "V1DLPViolationStream V1DLPViolationStream.violation(V1DLPViolation)"})
  void testGettersAndSetters() {
    // Arrange and Act
    V1DLPViolationStream actualV1dlpViolationStream = new V1DLPViolationStream();
    actualV1dlpViolationStream.setStream(new V1DLPStream());
    actualV1dlpViolationStream.setViolation(new V1DLPViolation());
    V1DLPStream stream = new V1DLPStream();
    V1DLPViolationStream actualStreamResult = actualV1dlpViolationStream.stream(stream);
    V1DLPViolation violation = new V1DLPViolation();
    V1DLPViolationStream actualViolationResult = actualV1dlpViolationStream.violation(violation);
    String actualToStringResult = actualV1dlpViolationStream.toString();
    V1DLPStream actualStream = actualV1dlpViolationStream.getStream();

    // Assert
    assertEquals(
        "class V1DLPViolationStream {\n" + "    violation: class V1DLPViolation {\n"
            + "        enforcementEventID: null\n" + "        entityID: null\n" + "        createTime: null\n"
            + "        lastModified: null\n" + "        requesterId: null\n" + "        matchedPolicies: null\n"
            + "        action: null\n" + "        outcome: null\n" + "        contentType: null\n"
            + "        version: null\n" + "        ignoreDLPwarning: null\n" + "    }\n"
            + "    stream: class V1DLPStream {\n" + "        name: null\n" + "        creatorPrettyName: null\n"
            + "        publicRoom: null\n" + "        crossPod: null\n" + "        allowExternal: null\n"
            + "        creatorId: null\n" + "        roomDescription: null\n" + "        streamId: null\n"
            + "        state: null\n" + "        type: null\n" + "        lastDisabled: null\n"
            + "        memberAddUserEnabled: null\n" + "        active: null\n" + "        discoverable: null\n"
            + "        readOnly: null\n" + "        copyDisabled: null\n" + "        externalOwned: null\n"
            + "        sendMessageDisabled: null\n" + "        moderated: null\n"
            + "        shareHistoryEnabled: null\n" + "        diagnostic: null\n" + "    }\n" + "}",
        actualToStringResult);
    assertSame(stream, actualStream);
    assertSame(violation, actualV1dlpViolationStream.getViolation());
    assertSame(actualV1dlpViolationStream, actualStreamResult);
    assertSame(actualV1dlpViolationStream, actualViolationResult);
  }
}
