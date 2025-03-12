package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V3DLPFileClassifierConfigDiffblueTest {
  /**
   * Test {@link V3DLPFileClassifierConfig#putClassifiersItem(String, String)}.
   * <p>
   * Method under test: {@link V3DLPFileClassifierConfig#putClassifiersItem(String, String)}
   */
  @Test
  @DisplayName("Test putClassifiersItem(String, String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V3DLPFileClassifierConfig V3DLPFileClassifierConfig.putClassifiersItem(String, String)"})
  void testPutClassifiersItem() {
    // Arrange
    V3DLPFileClassifierConfig v3dlpFileClassifierConfig = new V3DLPFileClassifierConfig();

    // Act and Assert
    assertSame(v3dlpFileClassifierConfig, v3dlpFileClassifierConfig.putClassifiersItem("Key", "Classifiers Item"));
  }

  /**
   * Test {@link V3DLPFileClassifierConfig#addApplicableFileTypesItem(String)}.
   * <p>
   * Method under test: {@link V3DLPFileClassifierConfig#addApplicableFileTypesItem(String)}
   */
  @Test
  @DisplayName("Test addApplicableFileTypesItem(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V3DLPFileClassifierConfig V3DLPFileClassifierConfig.addApplicableFileTypesItem(String)"})
  void testAddApplicableFileTypesItem() {
    // Arrange
    V3DLPFileClassifierConfig v3dlpFileClassifierConfig = new V3DLPFileClassifierConfig();

    // Act and Assert
    assertSame(v3dlpFileClassifierConfig,
        v3dlpFileClassifierConfig.addApplicableFileTypesItem("Applicable File Types Item"));
  }

  /**
   * Test {@link V3DLPFileClassifierConfig#equals(Object)}, and {@link V3DLPFileClassifierConfig#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V3DLPFileClassifierConfig#equals(Object)}
   *   <li>{@link V3DLPFileClassifierConfig#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPFileClassifierConfig.equals(Object)", "int V3DLPFileClassifierConfig.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V3DLPFileClassifierConfig v3dlpFileClassifierConfig = new V3DLPFileClassifierConfig();
    V3DLPFileClassifierConfig v3dlpFileClassifierConfig2 = new V3DLPFileClassifierConfig();

    // Act and Assert
    assertEquals(v3dlpFileClassifierConfig, v3dlpFileClassifierConfig2);
    int expectedHashCodeResult = v3dlpFileClassifierConfig.hashCode();
    assertEquals(expectedHashCodeResult, v3dlpFileClassifierConfig2.hashCode());
  }

  /**
   * Test {@link V3DLPFileClassifierConfig#equals(Object)}, and {@link V3DLPFileClassifierConfig#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V3DLPFileClassifierConfig#equals(Object)}
   *   <li>{@link V3DLPFileClassifierConfig#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPFileClassifierConfig.equals(Object)", "int V3DLPFileClassifierConfig.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V3DLPFileClassifierConfig v3dlpFileClassifierConfig = new V3DLPFileClassifierConfig();

    // Act and Assert
    assertEquals(v3dlpFileClassifierConfig, v3dlpFileClassifierConfig);
    int expectedHashCodeResult = v3dlpFileClassifierConfig.hashCode();
    assertEquals(expectedHashCodeResult, v3dlpFileClassifierConfig.hashCode());
  }

  /**
   * Test {@link V3DLPFileClassifierConfig#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3DLPFileClassifierConfig#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPFileClassifierConfig.equals(Object)", "int V3DLPFileClassifierConfig.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V3DLPFileClassifierConfig v3dlpFileClassifierConfig = new V3DLPFileClassifierConfig();
    v3dlpFileClassifierConfig.putClassifiersItem("Key", "Classifiers Item");

    // Act and Assert
    assertNotEquals(v3dlpFileClassifierConfig, new V3DLPFileClassifierConfig());
  }

  /**
   * Test {@link V3DLPFileClassifierConfig#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3DLPFileClassifierConfig#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPFileClassifierConfig.equals(Object)", "int V3DLPFileClassifierConfig.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V3DLPFileClassifierConfig v3dlpFileClassifierConfig = new V3DLPFileClassifierConfig();
    v3dlpFileClassifierConfig.addApplicableFileTypesItem("Applicable File Types Item");

    // Act and Assert
    assertNotEquals(v3dlpFileClassifierConfig, new V3DLPFileClassifierConfig());
  }

  /**
   * Test {@link V3DLPFileClassifierConfig#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3DLPFileClassifierConfig#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPFileClassifierConfig.equals(Object)", "int V3DLPFileClassifierConfig.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPFileClassifierConfig(), null);
  }

  /**
   * Test {@link V3DLPFileClassifierConfig#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3DLPFileClassifierConfig#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPFileClassifierConfig.equals(Object)", "int V3DLPFileClassifierConfig.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPFileClassifierConfig(), "Different type to V3DLPFileClassifierConfig");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V3DLPFileClassifierConfig}
   *   <li>{@link V3DLPFileClassifierConfig#applicableFileTypes(List)}
   *   <li>{@link V3DLPFileClassifierConfig#classifiers(Map)}
   *   <li>{@link V3DLPFileClassifierConfig#setApplicableFileTypes(List)}
   *   <li>{@link V3DLPFileClassifierConfig#setClassifiers(Map)}
   *   <li>{@link V3DLPFileClassifierConfig#toString()}
   *   <li>{@link V3DLPFileClassifierConfig#getApplicableFileTypes()}
   *   <li>{@link V3DLPFileClassifierConfig#getClassifiers()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V3DLPFileClassifierConfig.<init>()",
      "V3DLPFileClassifierConfig V3DLPFileClassifierConfig.applicableFileTypes(List)",
      "V3DLPFileClassifierConfig V3DLPFileClassifierConfig.classifiers(Map)",
      "List V3DLPFileClassifierConfig.getApplicableFileTypes()", "Map V3DLPFileClassifierConfig.getClassifiers()",
      "void V3DLPFileClassifierConfig.setApplicableFileTypes(List)",
      "void V3DLPFileClassifierConfig.setClassifiers(Map)", "String V3DLPFileClassifierConfig.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    V3DLPFileClassifierConfig actualV3dlpFileClassifierConfig = new V3DLPFileClassifierConfig();
    V3DLPFileClassifierConfig actualApplicableFileTypesResult = actualV3dlpFileClassifierConfig
        .applicableFileTypes(new ArrayList<>());
    V3DLPFileClassifierConfig actualClassifiersResult = actualV3dlpFileClassifierConfig.classifiers(new HashMap<>());
    ArrayList<String> applicableFileTypes = new ArrayList<>();
    actualV3dlpFileClassifierConfig.setApplicableFileTypes(applicableFileTypes);
    HashMap<String, String> classifiers = new HashMap<>();
    actualV3dlpFileClassifierConfig.setClassifiers(classifiers);
    String actualToStringResult = actualV3dlpFileClassifierConfig.toString();
    List<String> actualApplicableFileTypes = actualV3dlpFileClassifierConfig.getApplicableFileTypes();
    Map<String, String> actualClassifiers = actualV3dlpFileClassifierConfig.getClassifiers();

    // Assert
    assertEquals("class V3DLPFileClassifierConfig {\n    classifiers: {}\n    applicableFileTypes: []\n}",
        actualToStringResult);
    assertTrue(actualApplicableFileTypes.isEmpty());
    assertTrue(actualClassifiers.isEmpty());
    assertSame(actualV3dlpFileClassifierConfig, actualApplicableFileTypesResult);
    assertSame(actualV3dlpFileClassifierConfig, actualClassifiersResult);
    assertSame(applicableFileTypes, actualApplicableFileTypes);
    assertSame(classifiers, actualClassifiers);
  }
}
