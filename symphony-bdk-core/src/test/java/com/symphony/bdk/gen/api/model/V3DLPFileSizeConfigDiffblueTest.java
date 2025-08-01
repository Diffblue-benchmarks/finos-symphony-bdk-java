package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V3DLPFileSizeConfigDiffblueTest {
  /**
   * Test {@link V3DLPFileSizeConfig#equals(Object)}, and {@link V3DLPFileSizeConfig#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3DLPFileSizeConfig#equals(Object)}
   *   <li>{@link V3DLPFileSizeConfig#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPFileSizeConfig.equals(Object)",
    "int V3DLPFileSizeConfig.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V3DLPFileSizeConfig v3dlpFileSizeConfig = new V3DLPFileSizeConfig();
    V3DLPFileSizeConfig v3dlpFileSizeConfig2 = new V3DLPFileSizeConfig();

    // Act and Assert
    assertEquals(v3dlpFileSizeConfig, v3dlpFileSizeConfig2);
    int expectedHashCodeResult = v3dlpFileSizeConfig.hashCode();
    assertEquals(expectedHashCodeResult, v3dlpFileSizeConfig2.hashCode());
  }

  /**
   * Test {@link V3DLPFileSizeConfig#equals(Object)}, and {@link V3DLPFileSizeConfig#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3DLPFileSizeConfig#equals(Object)}
   *   <li>{@link V3DLPFileSizeConfig#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPFileSizeConfig.equals(Object)",
    "int V3DLPFileSizeConfig.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V3DLPFileSizeConfig v3dlpFileSizeConfig = new V3DLPFileSizeConfig();

    // Act and Assert
    assertEquals(v3dlpFileSizeConfig, v3dlpFileSizeConfig);
    int expectedHashCodeResult = v3dlpFileSizeConfig.hashCode();
    assertEquals(expectedHashCodeResult, v3dlpFileSizeConfig.hashCode());
  }

  /**
   * Test {@link V3DLPFileSizeConfig#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPFileSizeConfig#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPFileSizeConfig.equals(Object)",
    "int V3DLPFileSizeConfig.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPFileSizeConfig(), null);
  }

  /**
   * Test {@link V3DLPFileSizeConfig#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPFileSizeConfig#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPFileSizeConfig.equals(Object)",
    "int V3DLPFileSizeConfig.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPFileSizeConfig(), "Different type to V3DLPFileSizeConfig");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V3DLPFileSizeConfig}
   *   <li>{@link V3DLPFileSizeConfig#setSizeLimit(Integer)}
   *   <li>{@link V3DLPFileSizeConfig#sizeLimit(Integer)}
   *   <li>{@link V3DLPFileSizeConfig#toString()}
   *   <li>{@link V3DLPFileSizeConfig#getSizeLimit()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V3DLPFileSizeConfig.<init>()",
    "Integer V3DLPFileSizeConfig.getSizeLimit()",
    "void V3DLPFileSizeConfig.setSizeLimit(Integer)",
    "V3DLPFileSizeConfig V3DLPFileSizeConfig.sizeLimit(Integer)",
    "String V3DLPFileSizeConfig.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V3DLPFileSizeConfig actualV3dlpFileSizeConfig = new V3DLPFileSizeConfig();
    actualV3dlpFileSizeConfig.setSizeLimit(3);
    V3DLPFileSizeConfig actualSizeLimitResult = actualV3dlpFileSizeConfig.sizeLimit(3);
    String actualToStringResult = actualV3dlpFileSizeConfig.toString();

    // Assert
    assertEquals("class V3DLPFileSizeConfig {\n    sizeLimit: 3\n}", actualToStringResult);
    assertEquals(3, actualV3dlpFileSizeConfig.getSizeLimit().intValue());
    assertSame(actualV3dlpFileSizeConfig, actualSizeLimitResult);
  }
}
