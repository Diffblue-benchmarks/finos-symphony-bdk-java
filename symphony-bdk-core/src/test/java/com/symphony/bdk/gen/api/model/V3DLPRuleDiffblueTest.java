package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V3DLPRuleDiffblueTest {
  /**
   * Test {@link V3DLPRule#equals(Object)}, and {@link V3DLPRule#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3DLPRule#equals(Object)}
   *   <li>{@link V3DLPRule#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3DLPRule.equals(Object)", "int V3DLPRule.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V3DLPRule v3dlpRule = new V3DLPRule();
    V3DLPRule v3dlpRule2 = new V3DLPRule();

    // Act and Assert
    assertEquals(v3dlpRule, v3dlpRule2);
    assertEquals(v3dlpRule.hashCode(), v3dlpRule2.hashCode());
  }

  /**
   * Test {@link V3DLPRule#equals(Object)}, and {@link V3DLPRule#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3DLPRule#equals(Object)}
   *   <li>{@link V3DLPRule#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3DLPRule.equals(Object)", "int V3DLPRule.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V3DLPRule v3dlpRule = new V3DLPRule();

    // Act and Assert
    assertEquals(v3dlpRule, v3dlpRule);
    int expectedHashCodeResult = v3dlpRule.hashCode();
    assertEquals(expectedHashCodeResult, v3dlpRule.hashCode());
  }

  /**
   * Test {@link V3DLPRule#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPRule#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3DLPRule.equals(Object)", "int V3DLPRule.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPRule(), 1);
  }

  /**
   * Test {@link V3DLPRule#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPRule#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3DLPRule.equals(Object)", "int V3DLPRule.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V3DLPRule v3dlpRule = new V3DLPRule();
    v3dlpRule.id("42");

    // Act and Assert
    assertNotEquals(v3dlpRule, new V3DLPRule());
  }

  /**
   * Test {@link V3DLPRule#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPRule#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3DLPRule.equals(Object)", "int V3DLPRule.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V3DLPRule v3dlpRule = new V3DLPRule();
    v3dlpRule.type("Type");

    // Act and Assert
    assertNotEquals(v3dlpRule, new V3DLPRule());
  }

  /**
   * Test {@link V3DLPRule#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPRule#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3DLPRule.equals(Object)", "int V3DLPRule.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V3DLPRule v3dlpRule = new V3DLPRule();
    v3dlpRule.name("Name");

    // Act and Assert
    assertNotEquals(v3dlpRule, new V3DLPRule());
  }

  /**
   * Test {@link V3DLPRule#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPRule#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3DLPRule.equals(Object)", "int V3DLPRule.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V3DLPRule v3dlpRule = new V3DLPRule();
    v3dlpRule.textMatchConfig(new V3DLPTextMatchConfig());

    // Act and Assert
    assertNotEquals(v3dlpRule, new V3DLPRule());
  }

  /**
   * Test {@link V3DLPRule#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPRule#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3DLPRule.equals(Object)", "int V3DLPRule.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    V3DLPRule v3dlpRule = new V3DLPRule();
    v3dlpRule.fileSizeConfig(new V3DLPFileSizeConfig());

    // Act and Assert
    assertNotEquals(v3dlpRule, new V3DLPRule());
  }

  /**
   * Test {@link V3DLPRule#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPRule#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3DLPRule.equals(Object)", "int V3DLPRule.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    V3DLPRule v3dlpRule = new V3DLPRule();
    v3dlpRule.fileExtensionConfig(new V3DLPFileExtensionConfig());

    // Act and Assert
    assertNotEquals(v3dlpRule, new V3DLPRule());
  }

  /**
   * Test {@link V3DLPRule#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPRule#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3DLPRule.equals(Object)", "int V3DLPRule.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    V3DLPRule v3dlpRule = new V3DLPRule();
    v3dlpRule.filePasswordConfig(new V3DLPFilePasswordConfig());

    // Act and Assert
    assertNotEquals(v3dlpRule, new V3DLPRule());
  }

  /**
   * Test {@link V3DLPRule#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPRule#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3DLPRule.equals(Object)", "int V3DLPRule.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    V3DLPRule v3dlpRule = new V3DLPRule();
    v3dlpRule.fileClassifierConfig(new V3DLPFileClassifierConfig());

    // Act and Assert
    assertNotEquals(v3dlpRule, new V3DLPRule());
  }

  /**
   * Test {@link V3DLPRule#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPRule#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3DLPRule.equals(Object)", "int V3DLPRule.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPRule(), null);
  }

  /**
   * Test {@link V3DLPRule#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPRule#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3DLPRule.equals(Object)", "int V3DLPRule.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPRule(), "Different type to V3DLPRule");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V3DLPRule}
   *   <li>{@link V3DLPRule#fileClassifierConfig(V3DLPFileClassifierConfig)}
   *   <li>{@link V3DLPRule#fileExtensionConfig(V3DLPFileExtensionConfig)}
   *   <li>{@link V3DLPRule#filePasswordConfig(V3DLPFilePasswordConfig)}
   *   <li>{@link V3DLPRule#fileSizeConfig(V3DLPFileSizeConfig)}
   *   <li>{@link V3DLPRule#id(String)}
   *   <li>{@link V3DLPRule#name(String)}
   *   <li>{@link V3DLPRule#setFileClassifierConfig(V3DLPFileClassifierConfig)}
   *   <li>{@link V3DLPRule#setFileExtensionConfig(V3DLPFileExtensionConfig)}
   *   <li>{@link V3DLPRule#setFilePasswordConfig(V3DLPFilePasswordConfig)}
   *   <li>{@link V3DLPRule#setFileSizeConfig(V3DLPFileSizeConfig)}
   *   <li>{@link V3DLPRule#setId(String)}
   *   <li>{@link V3DLPRule#setName(String)}
   *   <li>{@link V3DLPRule#setTextMatchConfig(V3DLPTextMatchConfig)}
   *   <li>{@link V3DLPRule#setType(String)}
   *   <li>{@link V3DLPRule#textMatchConfig(V3DLPTextMatchConfig)}
   *   <li>{@link V3DLPRule#type(String)}
   *   <li>{@link V3DLPRule#toString()}
   *   <li>{@link V3DLPRule#getFileClassifierConfig()}
   *   <li>{@link V3DLPRule#getFileExtensionConfig()}
   *   <li>{@link V3DLPRule#getFilePasswordConfig()}
   *   <li>{@link V3DLPRule#getFileSizeConfig()}
   *   <li>{@link V3DLPRule#getId()}
   *   <li>{@link V3DLPRule#getName()}
   *   <li>{@link V3DLPRule#getTextMatchConfig()}
   *   <li>{@link V3DLPRule#getType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V3DLPRule.<init>()",
    "V3DLPRule V3DLPRule.fileClassifierConfig(V3DLPFileClassifierConfig)",
    "V3DLPRule V3DLPRule.fileExtensionConfig(V3DLPFileExtensionConfig)",
    "V3DLPRule V3DLPRule.filePasswordConfig(V3DLPFilePasswordConfig)",
    "V3DLPRule V3DLPRule.fileSizeConfig(V3DLPFileSizeConfig)",
    "V3DLPFileClassifierConfig V3DLPRule.getFileClassifierConfig()",
    "V3DLPFileExtensionConfig V3DLPRule.getFileExtensionConfig()",
    "V3DLPFilePasswordConfig V3DLPRule.getFilePasswordConfig()",
    "V3DLPFileSizeConfig V3DLPRule.getFileSizeConfig()",
    "String V3DLPRule.getId()",
    "String V3DLPRule.getName()",
    "V3DLPTextMatchConfig V3DLPRule.getTextMatchConfig()",
    "String V3DLPRule.getType()",
    "V3DLPRule V3DLPRule.id(String)",
    "V3DLPRule V3DLPRule.name(String)",
    "void V3DLPRule.setFileClassifierConfig(V3DLPFileClassifierConfig)",
    "void V3DLPRule.setFileExtensionConfig(V3DLPFileExtensionConfig)",
    "void V3DLPRule.setFilePasswordConfig(V3DLPFilePasswordConfig)",
    "void V3DLPRule.setFileSizeConfig(V3DLPFileSizeConfig)",
    "void V3DLPRule.setId(String)",
    "void V3DLPRule.setName(String)",
    "void V3DLPRule.setTextMatchConfig(V3DLPTextMatchConfig)",
    "void V3DLPRule.setType(String)",
    "V3DLPRule V3DLPRule.textMatchConfig(V3DLPTextMatchConfig)",
    "String V3DLPRule.toString()",
    "V3DLPRule V3DLPRule.type(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V3DLPRule actualV3dlpRule = new V3DLPRule();
    V3DLPRule actualFileClassifierConfigResult =
        actualV3dlpRule.fileClassifierConfig(new V3DLPFileClassifierConfig());
    V3DLPRule actualFileExtensionConfigResult =
        actualV3dlpRule.fileExtensionConfig(new V3DLPFileExtensionConfig());
    V3DLPRule actualFilePasswordConfigResult =
        actualV3dlpRule.filePasswordConfig(new V3DLPFilePasswordConfig());
    V3DLPRule actualFileSizeConfigResult =
        actualV3dlpRule.fileSizeConfig(new V3DLPFileSizeConfig());
    V3DLPRule actualIdResult = actualV3dlpRule.id("42");
    V3DLPRule actualNameResult = actualV3dlpRule.name("Name");
    V3DLPFileClassifierConfig fileClassifierConfig = new V3DLPFileClassifierConfig();
    actualV3dlpRule.setFileClassifierConfig(fileClassifierConfig);
    V3DLPFileExtensionConfig fileExtensionConfig = new V3DLPFileExtensionConfig();
    actualV3dlpRule.setFileExtensionConfig(fileExtensionConfig);
    V3DLPFilePasswordConfig filePasswordConfig = new V3DLPFilePasswordConfig();
    actualV3dlpRule.setFilePasswordConfig(filePasswordConfig);
    V3DLPFileSizeConfig fileSizeConfig = new V3DLPFileSizeConfig();
    actualV3dlpRule.setFileSizeConfig(fileSizeConfig);
    actualV3dlpRule.setId("42");
    actualV3dlpRule.setName("Name");
    actualV3dlpRule.setTextMatchConfig(new V3DLPTextMatchConfig());
    actualV3dlpRule.setType("Type");
    V3DLPTextMatchConfig textMatchConfig = new V3DLPTextMatchConfig();
    V3DLPRule actualTextMatchConfigResult = actualV3dlpRule.textMatchConfig(textMatchConfig);
    V3DLPRule actualTypeResult = actualV3dlpRule.type("Type");
    String actualToStringResult = actualV3dlpRule.toString();
    V3DLPFileClassifierConfig actualFileClassifierConfig =
        actualV3dlpRule.getFileClassifierConfig();
    V3DLPFileExtensionConfig actualFileExtensionConfig = actualV3dlpRule.getFileExtensionConfig();
    V3DLPFilePasswordConfig actualFilePasswordConfig = actualV3dlpRule.getFilePasswordConfig();
    V3DLPFileSizeConfig actualFileSizeConfig = actualV3dlpRule.getFileSizeConfig();
    String actualId = actualV3dlpRule.getId();
    String actualName = actualV3dlpRule.getName();
    V3DLPTextMatchConfig actualTextMatchConfig = actualV3dlpRule.getTextMatchConfig();

    // Assert
    assertEquals("42", actualId);
    assertEquals("Name", actualName);
    assertEquals("Type", actualV3dlpRule.getType());
    assertEquals(
        "class V3DLPRule {\n"
            + "    id: 42\n"
            + "    type: Type\n"
            + "    name: Name\n"
            + "    textMatchConfig: class V3DLPTextMatchConfig {\n"
            + "        dictionaries: []\n"
            + "        countUniqueOccurrences: null\n"
            + "        applicableFileTypes: []\n"
            + "    }\n"
            + "    fileSizeConfig: class V3DLPFileSizeConfig {\n"
            + "        sizeLimit: null\n"
            + "    }\n"
            + "    fileExtensionConfig: class V3DLPFileExtensionConfig {\n"
            + "        allowLists: []\n"
            + "        blockLists: []\n"
            + "    }\n"
            + "    filePasswordConfig: class V3DLPFilePasswordConfig {\n"
            + "        applicableFileTypes: []\n"
            + "        matchCriteria: null\n"
            + "    }\n"
            + "    fileClassifierConfig: class V3DLPFileClassifierConfig {\n"
            + "        classifiers: {}\n"
            + "        applicableFileTypes: []\n"
            + "    }\n"
            + "}",
        actualToStringResult);
    assertNull(actualFileSizeConfig.getSizeLimit());
    assertSame(fileClassifierConfig, actualFileClassifierConfig);
    assertSame(fileExtensionConfig, actualFileExtensionConfig);
    assertSame(filePasswordConfig, actualFilePasswordConfig);
    assertSame(fileSizeConfig, actualFileSizeConfig);
    assertSame(actualV3dlpRule, actualFileClassifierConfigResult);
    assertSame(actualV3dlpRule, actualFileExtensionConfigResult);
    assertSame(actualV3dlpRule, actualFilePasswordConfigResult);
    assertSame(actualV3dlpRule, actualFileSizeConfigResult);
    assertSame(actualV3dlpRule, actualIdResult);
    assertSame(actualV3dlpRule, actualNameResult);
    assertSame(actualV3dlpRule, actualTextMatchConfigResult);
    assertSame(actualV3dlpRule, actualTypeResult);
    assertSame(textMatchConfig, actualTextMatchConfig);
  }
}
