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

class V3DLPFilePasswordConfigDiffblueTest {
  /**
   * Test {@link V3DLPFilePasswordConfig#addApplicableFileTypesItem(String)}.
   *
   * <p>Method under test: {@link V3DLPFilePasswordConfig#addApplicableFileTypesItem(String)}
   */
  @Test
  @DisplayName("Test addApplicableFileTypesItem(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "V3DLPFilePasswordConfig V3DLPFilePasswordConfig.addApplicableFileTypesItem(String)"
  })
  void testAddApplicableFileTypesItem() {
    // Arrange
    V3DLPFilePasswordConfig v3dlpFilePasswordConfig = new V3DLPFilePasswordConfig();

    // Act
    V3DLPFilePasswordConfig actualAddApplicableFileTypesItemResult =
        v3dlpFilePasswordConfig.addApplicableFileTypesItem("Applicable File Types Item");

    // Assert
    assertSame(v3dlpFilePasswordConfig, actualAddApplicableFileTypesItemResult);
  }

  /**
   * Test {@link V3DLPFilePasswordConfig#equals(Object)}, and {@link
   * V3DLPFilePasswordConfig#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3DLPFilePasswordConfig#equals(Object)}
   *   <li>{@link V3DLPFilePasswordConfig#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPFilePasswordConfig.equals(Object)",
    "int V3DLPFilePasswordConfig.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V3DLPFilePasswordConfig v3dlpFilePasswordConfig = new V3DLPFilePasswordConfig();
    V3DLPFilePasswordConfig v3dlpFilePasswordConfig2 = new V3DLPFilePasswordConfig();

    // Act and Assert
    assertEquals(v3dlpFilePasswordConfig, v3dlpFilePasswordConfig2);
    assertEquals(v3dlpFilePasswordConfig.hashCode(), v3dlpFilePasswordConfig2.hashCode());
  }

  /**
   * Test {@link V3DLPFilePasswordConfig#equals(Object)}, and {@link
   * V3DLPFilePasswordConfig#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3DLPFilePasswordConfig#equals(Object)}
   *   <li>{@link V3DLPFilePasswordConfig#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPFilePasswordConfig.equals(Object)",
    "int V3DLPFilePasswordConfig.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V3DLPFilePasswordConfig v3dlpFilePasswordConfig = new V3DLPFilePasswordConfig();

    // Act and Assert
    assertEquals(v3dlpFilePasswordConfig, v3dlpFilePasswordConfig);
    int expectedHashCodeResult = v3dlpFilePasswordConfig.hashCode();
    assertEquals(expectedHashCodeResult, v3dlpFilePasswordConfig.hashCode());
  }

  /**
   * Test {@link V3DLPFilePasswordConfig#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPFilePasswordConfig#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPFilePasswordConfig.equals(Object)",
    "int V3DLPFilePasswordConfig.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V3DLPFilePasswordConfig v3dlpFilePasswordConfig = new V3DLPFilePasswordConfig();
    v3dlpFilePasswordConfig.addApplicableFileTypesItem("Applicable File Types Item");

    // Act and Assert
    assertNotEquals(v3dlpFilePasswordConfig, new V3DLPFilePasswordConfig());
  }

  /**
   * Test {@link V3DLPFilePasswordConfig#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPFilePasswordConfig#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPFilePasswordConfig.equals(Object)",
    "int V3DLPFilePasswordConfig.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V3DLPFilePasswordConfig v3dlpFilePasswordConfig = new V3DLPFilePasswordConfig();
    v3dlpFilePasswordConfig.matchCriteria("Match Criteria");

    // Act and Assert
    assertNotEquals(v3dlpFilePasswordConfig, new V3DLPFilePasswordConfig());
  }

  /**
   * Test {@link V3DLPFilePasswordConfig#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPFilePasswordConfig#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPFilePasswordConfig.equals(Object)",
    "int V3DLPFilePasswordConfig.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPFilePasswordConfig(), null);
  }

  /**
   * Test {@link V3DLPFilePasswordConfig#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPFilePasswordConfig#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPFilePasswordConfig.equals(Object)",
    "int V3DLPFilePasswordConfig.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPFilePasswordConfig(), "Different type to V3DLPFilePasswordConfig");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V3DLPFilePasswordConfig}
   *   <li>{@link V3DLPFilePasswordConfig#applicableFileTypes(List)}
   *   <li>{@link V3DLPFilePasswordConfig#matchCriteria(String)}
   *   <li>{@link V3DLPFilePasswordConfig#setApplicableFileTypes(List)}
   *   <li>{@link V3DLPFilePasswordConfig#setMatchCriteria(String)}
   *   <li>{@link V3DLPFilePasswordConfig#toString()}
   *   <li>{@link V3DLPFilePasswordConfig#getApplicableFileTypes()}
   *   <li>{@link V3DLPFilePasswordConfig#getMatchCriteria()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V3DLPFilePasswordConfig.<init>()",
    "V3DLPFilePasswordConfig V3DLPFilePasswordConfig.applicableFileTypes(List)",
    "List V3DLPFilePasswordConfig.getApplicableFileTypes()",
    "String V3DLPFilePasswordConfig.getMatchCriteria()",
    "V3DLPFilePasswordConfig V3DLPFilePasswordConfig.matchCriteria(String)",
    "void V3DLPFilePasswordConfig.setApplicableFileTypes(List)",
    "void V3DLPFilePasswordConfig.setMatchCriteria(String)",
    "String V3DLPFilePasswordConfig.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V3DLPFilePasswordConfig actualV3dlpFilePasswordConfig = new V3DLPFilePasswordConfig();
    V3DLPFilePasswordConfig actualApplicableFileTypesResult =
        actualV3dlpFilePasswordConfig.applicableFileTypes(new ArrayList<>());
    V3DLPFilePasswordConfig actualMatchCriteriaResult =
        actualV3dlpFilePasswordConfig.matchCriteria("Match Criteria");
    ArrayList<String> applicableFileTypes = new ArrayList<>();
    actualV3dlpFilePasswordConfig.setApplicableFileTypes(applicableFileTypes);
    actualV3dlpFilePasswordConfig.setMatchCriteria("Match Criteria");
    String actualToStringResult = actualV3dlpFilePasswordConfig.toString();
    List<String> actualApplicableFileTypes = actualV3dlpFilePasswordConfig.getApplicableFileTypes();

    // Assert
    assertEquals("Match Criteria", actualV3dlpFilePasswordConfig.getMatchCriteria());
    assertEquals(
        "class V3DLPFilePasswordConfig {\n    applicableFileTypes: []\n    matchCriteria: Match Criteria\n}",
        actualToStringResult);
    assertTrue(actualApplicableFileTypes.isEmpty());
    assertSame(actualV3dlpFilePasswordConfig, actualApplicableFileTypesResult);
    assertSame(actualV3dlpFilePasswordConfig, actualMatchCriteriaResult);
    assertSame(applicableFileTypes, actualApplicableFileTypes);
  }
}
