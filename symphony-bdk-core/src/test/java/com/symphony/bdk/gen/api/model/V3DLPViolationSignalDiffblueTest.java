package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V3DLPViolationSignalDiffblueTest {
  /**
   * Test {@link V3DLPViolationSignal#equals(Object)}, and {@link V3DLPViolationSignal#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V3DLPViolationSignal#equals(Object)}
   *   <li>{@link V3DLPViolationSignal#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPViolationSignal.equals(Object)", "int V3DLPViolationSignal.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V3DLPViolationSignal v3dlpViolationSignal = new V3DLPViolationSignal();
    V3DLPViolationSignal v3dlpViolationSignal2 = new V3DLPViolationSignal();

    // Act and Assert
    assertEquals(v3dlpViolationSignal, v3dlpViolationSignal2);
    int expectedHashCodeResult = v3dlpViolationSignal.hashCode();
    assertEquals(expectedHashCodeResult, v3dlpViolationSignal2.hashCode());
  }

  /**
   * Test {@link V3DLPViolationSignal#equals(Object)}, and {@link V3DLPViolationSignal#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V3DLPViolationSignal#equals(Object)}
   *   <li>{@link V3DLPViolationSignal#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPViolationSignal.equals(Object)", "int V3DLPViolationSignal.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V3DLPViolationSignal v3dlpViolationSignal = new V3DLPViolationSignal();

    // Act and Assert
    assertEquals(v3dlpViolationSignal, v3dlpViolationSignal);
    int expectedHashCodeResult = v3dlpViolationSignal.hashCode();
    assertEquals(expectedHashCodeResult, v3dlpViolationSignal.hashCode());
  }

  /**
   * Test {@link V3DLPViolationSignal#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3DLPViolationSignal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPViolationSignal.equals(Object)", "int V3DLPViolationSignal.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPViolationSignal(), 1);
  }

  /**
   * Test {@link V3DLPViolationSignal#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3DLPViolationSignal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPViolationSignal.equals(Object)", "int V3DLPViolationSignal.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V3DLPViolationSignal v3dlpViolationSignal = new V3DLPViolationSignal();
    v3dlpViolationSignal.violation(new V3DLPViolation());

    // Act and Assert
    assertNotEquals(v3dlpViolationSignal, new V3DLPViolationSignal());
  }

  /**
   * Test {@link V3DLPViolationSignal#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3DLPViolationSignal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPViolationSignal.equals(Object)", "int V3DLPViolationSignal.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V3DLPViolationSignal v3dlpViolationSignal = new V3DLPViolationSignal();
    v3dlpViolationSignal.signal(new V1DLPSignal());

    // Act and Assert
    assertNotEquals(v3dlpViolationSignal, new V3DLPViolationSignal());
  }

  /**
   * Test {@link V3DLPViolationSignal#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3DLPViolationSignal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPViolationSignal.equals(Object)", "int V3DLPViolationSignal.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPViolationSignal(), null);
  }

  /**
   * Test {@link V3DLPViolationSignal#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3DLPViolationSignal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPViolationSignal.equals(Object)", "int V3DLPViolationSignal.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPViolationSignal(), "Different type to V3DLPViolationSignal");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V3DLPViolationSignal}
   *   <li>{@link V3DLPViolationSignal#setSignal(V1DLPSignal)}
   *   <li>{@link V3DLPViolationSignal#setViolation(V3DLPViolation)}
   *   <li>{@link V3DLPViolationSignal#signal(V1DLPSignal)}
   *   <li>{@link V3DLPViolationSignal#violation(V3DLPViolation)}
   *   <li>{@link V3DLPViolationSignal#toString()}
   *   <li>{@link V3DLPViolationSignal#getSignal()}
   *   <li>{@link V3DLPViolationSignal#getViolation()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V3DLPViolationSignal.<init>()", "V1DLPSignal V3DLPViolationSignal.getSignal()",
      "V3DLPViolation V3DLPViolationSignal.getViolation()", "void V3DLPViolationSignal.setSignal(V1DLPSignal)",
      "void V3DLPViolationSignal.setViolation(V3DLPViolation)",
      "V3DLPViolationSignal V3DLPViolationSignal.signal(V1DLPSignal)", "String V3DLPViolationSignal.toString()",
      "V3DLPViolationSignal V3DLPViolationSignal.violation(V3DLPViolation)"})
  void testGettersAndSetters() {
    // Arrange and Act
    V3DLPViolationSignal actualV3dlpViolationSignal = new V3DLPViolationSignal();
    actualV3dlpViolationSignal.setSignal(new V1DLPSignal());
    actualV3dlpViolationSignal.setViolation(new V3DLPViolation());
    V1DLPSignal signal = new V1DLPSignal();
    V3DLPViolationSignal actualSignalResult = actualV3dlpViolationSignal.signal(signal);
    V3DLPViolation violation = new V3DLPViolation();
    V3DLPViolationSignal actualViolationResult = actualV3dlpViolationSignal.violation(violation);
    String actualToStringResult = actualV3dlpViolationSignal.toString();
    V1DLPSignal actualSignal = actualV3dlpViolationSignal.getSignal();

    // Assert
    assertEquals("class V3DLPViolationSignal {\n" + "    violation: class V3DLPViolation {\n"
        + "        enforcementEventID: null\n" + "        entityID: null\n" + "        createTime: null\n"
        + "        lastModified: null\n" + "        requesterId: null\n" + "        details: null\n"
        + "        action: null\n" + "        outcome: null\n" + "        version: null\n"
        + "        ignoreDLPwarning: null\n" + "    }\n" + "    signal: class V1DLPSignal {\n" + "        id: null\n"
        + "        name: null\n" + "        rules: null\n" + "        diagnostic: null\n" + "    }\n" + "}",
        actualToStringResult);
    assertSame(signal, actualSignal);
    assertSame(violation, actualV3dlpViolationSignal.getViolation());
    assertSame(actualV3dlpViolationSignal, actualSignalResult);
    assertSame(actualV3dlpViolationSignal, actualViolationResult);
  }
}
