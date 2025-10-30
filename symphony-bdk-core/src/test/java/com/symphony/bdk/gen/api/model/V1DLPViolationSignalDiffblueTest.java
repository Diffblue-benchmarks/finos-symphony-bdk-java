package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V1DLPViolationSignalDiffblueTest {
  /**
   * Test {@link V1DLPViolationSignal#equals(Object)}, and {@link V1DLPViolationSignal#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V1DLPViolationSignal#equals(Object)}
   *   <li>{@link V1DLPViolationSignal#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPViolationSignal.equals(Object)", "int V1DLPViolationSignal.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V1DLPViolationSignal v1dlpViolationSignal = new V1DLPViolationSignal();
    V1DLPViolationSignal v1dlpViolationSignal2 = new V1DLPViolationSignal();

    // Act and Assert
    assertEquals(v1dlpViolationSignal, v1dlpViolationSignal2);
    int expectedHashCodeResult = v1dlpViolationSignal.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpViolationSignal2.hashCode());
  }

  /**
   * Test {@link V1DLPViolationSignal#equals(Object)}, and {@link V1DLPViolationSignal#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V1DLPViolationSignal#equals(Object)}
   *   <li>{@link V1DLPViolationSignal#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPViolationSignal.equals(Object)", "int V1DLPViolationSignal.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V1DLPViolationSignal v1dlpViolationSignal = new V1DLPViolationSignal();

    // Act and Assert
    assertEquals(v1dlpViolationSignal, v1dlpViolationSignal);
    int expectedHashCodeResult = v1dlpViolationSignal.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpViolationSignal.hashCode());
  }

  /**
   * Test {@link V1DLPViolationSignal#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPViolationSignal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPViolationSignal.equals(Object)", "int V1DLPViolationSignal.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPViolationSignal(), 1);
  }

  /**
   * Test {@link V1DLPViolationSignal#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPViolationSignal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPViolationSignal.equals(Object)", "int V1DLPViolationSignal.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V1DLPViolationSignal v1dlpViolationSignal = new V1DLPViolationSignal();
    v1dlpViolationSignal.violation(new V1DLPViolation());

    // Act and Assert
    assertNotEquals(v1dlpViolationSignal, new V1DLPViolationSignal());
  }

  /**
   * Test {@link V1DLPViolationSignal#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPViolationSignal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPViolationSignal.equals(Object)", "int V1DLPViolationSignal.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V1DLPViolationSignal v1dlpViolationSignal = new V1DLPViolationSignal();
    v1dlpViolationSignal.signal(new V1DLPSignal());

    // Act and Assert
    assertNotEquals(v1dlpViolationSignal, new V1DLPViolationSignal());
  }

  /**
   * Test {@link V1DLPViolationSignal#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPViolationSignal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPViolationSignal.equals(Object)", "int V1DLPViolationSignal.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPViolationSignal(), null);
  }

  /**
   * Test {@link V1DLPViolationSignal#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1DLPViolationSignal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1DLPViolationSignal.equals(Object)", "int V1DLPViolationSignal.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPViolationSignal(), "Different type to V1DLPViolationSignal");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V1DLPViolationSignal}
   *   <li>{@link V1DLPViolationSignal#setSignal(V1DLPSignal)}
   *   <li>{@link V1DLPViolationSignal#setViolation(V1DLPViolation)}
   *   <li>{@link V1DLPViolationSignal#signal(V1DLPSignal)}
   *   <li>{@link V1DLPViolationSignal#violation(V1DLPViolation)}
   *   <li>{@link V1DLPViolationSignal#toString()}
   *   <li>{@link V1DLPViolationSignal#getSignal()}
   *   <li>{@link V1DLPViolationSignal#getViolation()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V1DLPViolationSignal.<init>()", "V1DLPSignal V1DLPViolationSignal.getSignal()",
      "V1DLPViolation V1DLPViolationSignal.getViolation()", "void V1DLPViolationSignal.setSignal(V1DLPSignal)",
      "void V1DLPViolationSignal.setViolation(V1DLPViolation)",
      "V1DLPViolationSignal V1DLPViolationSignal.signal(V1DLPSignal)", "String V1DLPViolationSignal.toString()",
      "V1DLPViolationSignal V1DLPViolationSignal.violation(V1DLPViolation)"})
  void testGettersAndSetters() {
    // Arrange and Act
    V1DLPViolationSignal actualV1dlpViolationSignal = new V1DLPViolationSignal();
    actualV1dlpViolationSignal.setSignal(new V1DLPSignal());
    actualV1dlpViolationSignal.setViolation(new V1DLPViolation());
    V1DLPSignal signal = new V1DLPSignal();
    V1DLPViolationSignal actualSignalResult = actualV1dlpViolationSignal.signal(signal);
    V1DLPViolation violation = new V1DLPViolation();
    V1DLPViolationSignal actualViolationResult = actualV1dlpViolationSignal.violation(violation);
    String actualToStringResult = actualV1dlpViolationSignal.toString();
    V1DLPSignal actualSignal = actualV1dlpViolationSignal.getSignal();

    // Assert
    assertEquals("class V1DLPViolationSignal {\n" + "    violation: class V1DLPViolation {\n"
        + "        enforcementEventID: null\n" + "        entityID: null\n" + "        createTime: null\n"
        + "        lastModified: null\n" + "        requesterId: null\n" + "        matchedPolicies: null\n"
        + "        action: null\n" + "        outcome: null\n" + "        contentType: null\n"
        + "        version: null\n" + "        ignoreDLPwarning: null\n" + "    }\n"
        + "    signal: class V1DLPSignal {\n" + "        id: null\n" + "        name: null\n" + "        rules: null\n"
        + "        diagnostic: null\n" + "    }\n" + "}", actualToStringResult);
    assertSame(signal, actualSignal);
    assertSame(violation, actualV1dlpViolationSignal.getViolation());
    assertSame(actualV1dlpViolationSignal, actualSignalResult);
    assertSame(actualV1dlpViolationSignal, actualViolationResult);
  }
}
