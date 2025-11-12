package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V3DLPTextMatchConfigDiffblueTest {
  /**
   * Test {@link V3DLPTextMatchConfig#addDictionariesItem(V3DLPDictionaryMeta)}.
   *
   * <p>Method under test: {@link V3DLPTextMatchConfig#addDictionariesItem(V3DLPDictionaryMeta)}
   */
  @Test
  @DisplayName("Test addDictionariesItem(V3DLPDictionaryMeta)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "V3DLPTextMatchConfig V3DLPTextMatchConfig.addDictionariesItem(V3DLPDictionaryMeta)"
  })
  void testAddDictionariesItem() {
    // Arrange
    V3DLPTextMatchConfig v3dlpTextMatchConfig = new V3DLPTextMatchConfig();

    // Act
    V3DLPTextMatchConfig actualAddDictionariesItemResult =
        v3dlpTextMatchConfig.addDictionariesItem(new V3DLPDictionaryMeta());

    // Assert
    assertSame(v3dlpTextMatchConfig, actualAddDictionariesItemResult);
  }

  /**
   * Test {@link V3DLPTextMatchConfig#addApplicableFileTypesItem(String)}.
   *
   * <p>Method under test: {@link V3DLPTextMatchConfig#addApplicableFileTypesItem(String)}
   */
  @Test
  @DisplayName("Test addApplicableFileTypesItem(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "V3DLPTextMatchConfig V3DLPTextMatchConfig.addApplicableFileTypesItem(String)"
  })
  void testAddApplicableFileTypesItem() {
    // Arrange
    V3DLPTextMatchConfig v3dlpTextMatchConfig = new V3DLPTextMatchConfig();

    // Act
    V3DLPTextMatchConfig actualAddApplicableFileTypesItemResult =
        v3dlpTextMatchConfig.addApplicableFileTypesItem("Applicable File Types Item");

    // Assert
    assertSame(v3dlpTextMatchConfig, actualAddApplicableFileTypesItemResult);
  }

  /**
   * Test {@link V3DLPTextMatchConfig#equals(Object)}, and {@link V3DLPTextMatchConfig#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3DLPTextMatchConfig#equals(Object)}
   *   <li>{@link V3DLPTextMatchConfig#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPTextMatchConfig.equals(Object)",
    "int V3DLPTextMatchConfig.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V3DLPTextMatchConfig v3dlpTextMatchConfig = new V3DLPTextMatchConfig();
    V3DLPTextMatchConfig v3dlpTextMatchConfig2 = new V3DLPTextMatchConfig();

    // Act and Assert
    assertEquals(v3dlpTextMatchConfig, v3dlpTextMatchConfig2);
    assertEquals(v3dlpTextMatchConfig.hashCode(), v3dlpTextMatchConfig2.hashCode());
  }

  /**
   * Test {@link V3DLPTextMatchConfig#equals(Object)}, and {@link V3DLPTextMatchConfig#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3DLPTextMatchConfig#equals(Object)}
   *   <li>{@link V3DLPTextMatchConfig#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPTextMatchConfig.equals(Object)",
    "int V3DLPTextMatchConfig.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V3DLPTextMatchConfig v3dlpTextMatchConfig = new V3DLPTextMatchConfig();

    // Act and Assert
    assertEquals(v3dlpTextMatchConfig, v3dlpTextMatchConfig);
    int expectedHashCodeResult = v3dlpTextMatchConfig.hashCode();
    assertEquals(expectedHashCodeResult, v3dlpTextMatchConfig.hashCode());
  }

  /**
   * Test {@link V3DLPTextMatchConfig#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPTextMatchConfig#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPTextMatchConfig.equals(Object)",
    "int V3DLPTextMatchConfig.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V3DLPTextMatchConfig v3dlpTextMatchConfig = new V3DLPTextMatchConfig();
    v3dlpTextMatchConfig.addDictionariesItem(new V3DLPDictionaryMeta());

    // Act and Assert
    assertNotEquals(v3dlpTextMatchConfig, new V3DLPTextMatchConfig());
  }

  /**
   * Test {@link V3DLPTextMatchConfig#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPTextMatchConfig#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPTextMatchConfig.equals(Object)",
    "int V3DLPTextMatchConfig.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V3DLPTextMatchConfig v3dlpTextMatchConfig = new V3DLPTextMatchConfig();
    v3dlpTextMatchConfig.addApplicableFileTypesItem("Applicable File Types Item");

    // Act and Assert
    assertNotEquals(v3dlpTextMatchConfig, new V3DLPTextMatchConfig());
  }

  /**
   * Test {@link V3DLPTextMatchConfig#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPTextMatchConfig#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPTextMatchConfig.equals(Object)",
    "int V3DLPTextMatchConfig.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V3DLPTextMatchConfig v3dlpTextMatchConfig = new V3DLPTextMatchConfig();
    v3dlpTextMatchConfig.countUniqueOccurrences(3);
    v3dlpTextMatchConfig.addApplicableFileTypesItem("Applicable File Types Item");

    // Act and Assert
    assertNotEquals(v3dlpTextMatchConfig, new V3DLPTextMatchConfig());
  }

  /**
   * Test {@link V3DLPTextMatchConfig#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPTextMatchConfig#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPTextMatchConfig.equals(Object)",
    "int V3DLPTextMatchConfig.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPTextMatchConfig(), null);
  }

  /**
   * Test {@link V3DLPTextMatchConfig#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPTextMatchConfig#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPTextMatchConfig.equals(Object)",
    "int V3DLPTextMatchConfig.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPTextMatchConfig(), "Different type to V3DLPTextMatchConfig");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V3DLPTextMatchConfig}
   *   <li>{@link V3DLPTextMatchConfig#applicableFileTypes(List)}
   *   <li>{@link V3DLPTextMatchConfig#countUniqueOccurrences(Integer)}
   *   <li>{@link V3DLPTextMatchConfig#dictionaries(List)}
   *   <li>{@link V3DLPTextMatchConfig#setApplicableFileTypes(List)}
   *   <li>{@link V3DLPTextMatchConfig#setCountUniqueOccurrences(Integer)}
   *   <li>{@link V3DLPTextMatchConfig#setDictionaries(List)}
   *   <li>{@link V3DLPTextMatchConfig#toString()}
   *   <li>{@link V3DLPTextMatchConfig#getApplicableFileTypes()}
   *   <li>{@link V3DLPTextMatchConfig#getCountUniqueOccurrences()}
   *   <li>{@link V3DLPTextMatchConfig#getDictionaries()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V3DLPTextMatchConfig.<init>()",
    "V3DLPTextMatchConfig V3DLPTextMatchConfig.applicableFileTypes(List)",
    "V3DLPTextMatchConfig V3DLPTextMatchConfig.countUniqueOccurrences(Integer)",
    "V3DLPTextMatchConfig V3DLPTextMatchConfig.dictionaries(List)",
    "List V3DLPTextMatchConfig.getApplicableFileTypes()",
    "Integer V3DLPTextMatchConfig.getCountUniqueOccurrences()",
    "List V3DLPTextMatchConfig.getDictionaries()",
    "void V3DLPTextMatchConfig.setApplicableFileTypes(List)",
    "void V3DLPTextMatchConfig.setCountUniqueOccurrences(Integer)",
    "void V3DLPTextMatchConfig.setDictionaries(List)",
    "String V3DLPTextMatchConfig.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V3DLPTextMatchConfig actualV3dlpTextMatchConfig = new V3DLPTextMatchConfig();
    V3DLPTextMatchConfig actualApplicableFileTypesResult =
        actualV3dlpTextMatchConfig.applicableFileTypes(new ArrayList<>());
    V3DLPTextMatchConfig actualCountUniqueOccurrencesResult =
        actualV3dlpTextMatchConfig.countUniqueOccurrences(3);
    V3DLPTextMatchConfig actualDictionariesResult =
        actualV3dlpTextMatchConfig.dictionaries(new ArrayList<>());
    ArrayList<String> applicableFileTypes = new ArrayList<>();
    actualV3dlpTextMatchConfig.setApplicableFileTypes(applicableFileTypes);
    actualV3dlpTextMatchConfig.setCountUniqueOccurrences(3);
    ArrayList<V3DLPDictionaryMeta> dictionaries = new ArrayList<>();
    actualV3dlpTextMatchConfig.setDictionaries(dictionaries);
    String actualToStringResult = actualV3dlpTextMatchConfig.toString();
    List<String> actualApplicableFileTypes = actualV3dlpTextMatchConfig.getApplicableFileTypes();
    Integer actualCountUniqueOccurrences = actualV3dlpTextMatchConfig.getCountUniqueOccurrences();
    List<V3DLPDictionaryMeta> actualDictionaries = actualV3dlpTextMatchConfig.getDictionaries();

    // Assert
    assertEquals(
        "class V3DLPTextMatchConfig {\n"
            + "    dictionaries: []\n"
            + "    countUniqueOccurrences: 3\n"
            + "    applicableFileTypes: []\n"
            + "}",
        actualToStringResult);
    assertEquals(3, actualCountUniqueOccurrences.intValue());
    assertTrue(actualApplicableFileTypes.isEmpty());
    assertTrue(actualDictionaries.isEmpty());
    assertSame(actualV3dlpTextMatchConfig, actualApplicableFileTypesResult);
    assertSame(actualV3dlpTextMatchConfig, actualCountUniqueOccurrencesResult);
    assertSame(actualV3dlpTextMatchConfig, actualDictionariesResult);
    assertSame(applicableFileTypes, actualApplicableFileTypes);
    assertSame(dictionaries, actualDictionaries);
  }
}
