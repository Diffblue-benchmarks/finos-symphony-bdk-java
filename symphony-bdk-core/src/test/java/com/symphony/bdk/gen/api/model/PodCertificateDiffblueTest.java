package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PodCertificateDiffblueTest {
  /**
   * Test {@link PodCertificate#equals(Object)}, and {@link PodCertificate#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link PodCertificate#equals(Object)}
   *   <li>{@link PodCertificate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean PodCertificate.equals(Object)", "int PodCertificate.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    PodCertificate podCertificate = new PodCertificate();
    PodCertificate podCertificate2 = new PodCertificate();

    // Act and Assert
    assertEquals(podCertificate, podCertificate2);
    int expectedHashCodeResult = podCertificate.hashCode();
    assertEquals(expectedHashCodeResult, podCertificate2.hashCode());
  }

  /**
   * Test {@link PodCertificate#equals(Object)}, and {@link PodCertificate#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link PodCertificate#equals(Object)}
   *   <li>{@link PodCertificate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean PodCertificate.equals(Object)", "int PodCertificate.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    PodCertificate podCertificate = new PodCertificate();

    // Act and Assert
    assertEquals(podCertificate, podCertificate);
    int expectedHashCodeResult = podCertificate.hashCode();
    assertEquals(expectedHashCodeResult, podCertificate.hashCode());
  }

  /**
   * Test {@link PodCertificate#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link PodCertificate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean PodCertificate.equals(Object)", "int PodCertificate.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new PodCertificate(), null);
  }

  /**
   * Test {@link PodCertificate#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link PodCertificate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean PodCertificate.equals(Object)", "int PodCertificate.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new PodCertificate(), null);
  }

  /**
   * Test {@link PodCertificate#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link PodCertificate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean PodCertificate.equals(Object)", "int PodCertificate.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new PodCertificate(), "Different type to PodCertificate");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link PodCertificate}
   *   <li>{@link PodCertificate#certificate(String)}
   *   <li>{@link PodCertificate#setCertificate(String)}
   *   <li>{@link PodCertificate#toString()}
   *   <li>{@link PodCertificate#getCertificate()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PodCertificate.<init>()", "PodCertificate PodCertificate.certificate(String)",
      "String PodCertificate.getCertificate()", "void PodCertificate.setCertificate(String)",
      "String PodCertificate.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    PodCertificate actualPodCertificate = new PodCertificate();
    PodCertificate actualCertificateResult = actualPodCertificate.certificate("Certificate");
    actualPodCertificate.setCertificate("Certificate");
    String actualToStringResult = actualPodCertificate.toString();

    // Assert
    assertEquals("Certificate", actualPodCertificate.getCertificate());
    assertEquals("class PodCertificate {\n    certificate: Certificate\n}", actualToStringResult);
    assertSame(actualPodCertificate, actualCertificateResult);
  }
}
