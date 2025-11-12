package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V3DLPViolationStreamDiffblueTest {
  /**
   * Test {@link V3DLPViolationStream#equals(Object)}, and {@link V3DLPViolationStream#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3DLPViolationStream#equals(Object)}
   *   <li>{@link V3DLPViolationStream#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPViolationStream.equals(Object)",
    "int V3DLPViolationStream.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V3DLPViolationStream v3dlpViolationStream = new V3DLPViolationStream();
    V3DLPViolationStream v3dlpViolationStream2 = new V3DLPViolationStream();

    // Act and Assert
    assertEquals(v3dlpViolationStream, v3dlpViolationStream2);
    assertEquals(v3dlpViolationStream.hashCode(), v3dlpViolationStream2.hashCode());
  }

  /**
   * Test {@link V3DLPViolationStream#equals(Object)}, and {@link V3DLPViolationStream#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3DLPViolationStream#equals(Object)}
   *   <li>{@link V3DLPViolationStream#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPViolationStream.equals(Object)",
    "int V3DLPViolationStream.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V3DLPViolationStream v3dlpViolationStream = new V3DLPViolationStream();

    // Act and Assert
    assertEquals(v3dlpViolationStream, v3dlpViolationStream);
    int expectedHashCodeResult = v3dlpViolationStream.hashCode();
    assertEquals(expectedHashCodeResult, v3dlpViolationStream.hashCode());
  }

  /**
   * Test {@link V3DLPViolationStream#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPViolationStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPViolationStream.equals(Object)",
    "int V3DLPViolationStream.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPViolationStream(), 1);
  }

  /**
   * Test {@link V3DLPViolationStream#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPViolationStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPViolationStream.equals(Object)",
    "int V3DLPViolationStream.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V3DLPViolationStream v3dlpViolationStream = new V3DLPViolationStream();
    v3dlpViolationStream.violation(new V3DLPViolation());

    // Act and Assert
    assertNotEquals(v3dlpViolationStream, new V3DLPViolationStream());
  }

  /**
   * Test {@link V3DLPViolationStream#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPViolationStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPViolationStream.equals(Object)",
    "int V3DLPViolationStream.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V3DLPViolationStream v3dlpViolationStream = new V3DLPViolationStream();
    v3dlpViolationStream.stream(new V1DLPStream());

    // Act and Assert
    assertNotEquals(v3dlpViolationStream, new V3DLPViolationStream());
  }

  /**
   * Test {@link V3DLPViolationStream#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPViolationStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPViolationStream.equals(Object)",
    "int V3DLPViolationStream.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPViolationStream(), null);
  }

  /**
   * Test {@link V3DLPViolationStream#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPViolationStream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPViolationStream.equals(Object)",
    "int V3DLPViolationStream.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPViolationStream(), "Different type to V3DLPViolationStream");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V3DLPViolationStream}
   *   <li>{@link V3DLPViolationStream#setStream(V1DLPStream)}
   *   <li>{@link V3DLPViolationStream#setViolation(V3DLPViolation)}
   *   <li>{@link V3DLPViolationStream#stream(V1DLPStream)}
   *   <li>{@link V3DLPViolationStream#violation(V3DLPViolation)}
   *   <li>{@link V3DLPViolationStream#toString()}
   *   <li>{@link V3DLPViolationStream#getStream()}
   *   <li>{@link V3DLPViolationStream#getViolation()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V3DLPViolationStream.<init>()",
    "V1DLPStream V3DLPViolationStream.getStream()",
    "V3DLPViolation V3DLPViolationStream.getViolation()",
    "void V3DLPViolationStream.setStream(V1DLPStream)",
    "void V3DLPViolationStream.setViolation(V3DLPViolation)",
    "V3DLPViolationStream V3DLPViolationStream.stream(V1DLPStream)",
    "String V3DLPViolationStream.toString()",
    "V3DLPViolationStream V3DLPViolationStream.violation(V3DLPViolation)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V3DLPViolationStream actualV3dlpViolationStream = new V3DLPViolationStream();
    actualV3dlpViolationStream.setStream(new V1DLPStream());
    actualV3dlpViolationStream.setViolation(new V3DLPViolation());
    V1DLPStream stream = new V1DLPStream();
    V3DLPViolationStream actualStreamResult = actualV3dlpViolationStream.stream(stream);
    V3DLPViolation violation = new V3DLPViolation();
    V3DLPViolationStream actualViolationResult = actualV3dlpViolationStream.violation(violation);
    String actualToStringResult = actualV3dlpViolationStream.toString();
    V1DLPStream actualStream = actualV3dlpViolationStream.getStream();

    // Assert
    assertEquals(
        "class V3DLPViolationStream {\n"
            + "    violation: class V3DLPViolation {\n"
            + "        enforcementEventID: null\n"
            + "        entityID: null\n"
            + "        createTime: null\n"
            + "        lastModified: null\n"
            + "        requesterId: null\n"
            + "        details: null\n"
            + "        action: null\n"
            + "        outcome: null\n"
            + "        version: null\n"
            + "        ignoreDLPwarning: null\n"
            + "    }\n"
            + "    stream: class V1DLPStream {\n"
            + "        name: null\n"
            + "        creatorPrettyName: null\n"
            + "        publicRoom: null\n"
            + "        crossPod: null\n"
            + "        allowExternal: null\n"
            + "        creatorId: null\n"
            + "        roomDescription: null\n"
            + "        streamId: null\n"
            + "        state: null\n"
            + "        type: null\n"
            + "        lastDisabled: null\n"
            + "        memberAddUserEnabled: null\n"
            + "        active: null\n"
            + "        discoverable: null\n"
            + "        readOnly: null\n"
            + "        copyDisabled: null\n"
            + "        externalOwned: null\n"
            + "        sendMessageDisabled: null\n"
            + "        moderated: null\n"
            + "        shareHistoryEnabled: null\n"
            + "        diagnostic: null\n"
            + "    }\n"
            + "}",
        actualToStringResult);
    assertSame(stream, actualStream);
    assertSame(violation, actualV3dlpViolationStream.getViolation());
    assertSame(actualV3dlpViolationStream, actualStreamResult);
    assertSame(actualV3dlpViolationStream, actualViolationResult);
  }
}
