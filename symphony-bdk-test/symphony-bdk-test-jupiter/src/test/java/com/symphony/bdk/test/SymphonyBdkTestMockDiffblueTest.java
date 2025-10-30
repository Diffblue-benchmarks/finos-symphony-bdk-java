package com.symphony.bdk.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SymphonyBdkTestMockDiffblueTest {
  /**
   * Test {@link SymphonyBdkTestMock#equals(Object)}, and {@link SymphonyBdkTestMock#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link SymphonyBdkTestMock#equals(Object)}
   *   <li>{@link SymphonyBdkTestMock#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SymphonyBdkTestMock.equals(Object)", "int SymphonyBdkTestMock.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    SymphonyBdkTestMock symphonyBdkTestMock = new SymphonyBdkTestMock();

    // Act and Assert
    assertEquals(symphonyBdkTestMock, symphonyBdkTestMock);
    int expectedHashCodeResult = symphonyBdkTestMock.hashCode();
    assertEquals(expectedHashCodeResult, symphonyBdkTestMock.hashCode());
  }

  /**
   * Test {@link SymphonyBdkTestMock#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link SymphonyBdkTestMock#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SymphonyBdkTestMock.equals(Object)", "int SymphonyBdkTestMock.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    SymphonyBdkTestMock symphonyBdkTestMock = new SymphonyBdkTestMock();

    // Act and Assert
    assertNotEquals(symphonyBdkTestMock, new SymphonyBdkTestMock());
  }

  /**
   * Test {@link SymphonyBdkTestMock#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link SymphonyBdkTestMock#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SymphonyBdkTestMock.equals(Object)", "int SymphonyBdkTestMock.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new SymphonyBdkTestMock(), null);
  }

  /**
   * Test {@link SymphonyBdkTestMock#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link SymphonyBdkTestMock#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SymphonyBdkTestMock.equals(Object)", "int SymphonyBdkTestMock.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new SymphonyBdkTestMock(), "Different type to SymphonyBdkTestMock");
  }
}
