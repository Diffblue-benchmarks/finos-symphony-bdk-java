package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V3DLPDictionaryMetaDiffblueTest {
  /**
   * Test {@link V3DLPDictionaryMeta#equals(Object)}, and {@link V3DLPDictionaryMeta#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3DLPDictionaryMeta#equals(Object)}
   *   <li>{@link V3DLPDictionaryMeta#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPDictionaryMeta.equals(Object)",
    "int V3DLPDictionaryMeta.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V3DLPDictionaryMeta v3dlpDictionaryMeta = new V3DLPDictionaryMeta();
    V3DLPDictionaryMeta v3dlpDictionaryMeta2 = new V3DLPDictionaryMeta();

    // Act and Assert
    assertEquals(v3dlpDictionaryMeta, v3dlpDictionaryMeta2);
    int expectedHashCodeResult = v3dlpDictionaryMeta.hashCode();
    assertEquals(expectedHashCodeResult, v3dlpDictionaryMeta2.hashCode());
  }

  /**
   * Test {@link V3DLPDictionaryMeta#equals(Object)}, and {@link V3DLPDictionaryMeta#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3DLPDictionaryMeta#equals(Object)}
   *   <li>{@link V3DLPDictionaryMeta#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPDictionaryMeta.equals(Object)",
    "int V3DLPDictionaryMeta.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V3DLPDictionaryMeta v3dlpDictionaryMeta = new V3DLPDictionaryMeta();

    // Act and Assert
    assertEquals(v3dlpDictionaryMeta, v3dlpDictionaryMeta);
    int expectedHashCodeResult = v3dlpDictionaryMeta.hashCode();
    assertEquals(expectedHashCodeResult, v3dlpDictionaryMeta.hashCode());
  }

  /**
   * Test {@link V3DLPDictionaryMeta#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPDictionaryMeta#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPDictionaryMeta.equals(Object)",
    "int V3DLPDictionaryMeta.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPDictionaryMeta(), 1);
  }

  /**
   * Test {@link V3DLPDictionaryMeta#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPDictionaryMeta#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPDictionaryMeta.equals(Object)",
    "int V3DLPDictionaryMeta.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V3DLPDictionaryMeta v3dlpDictionaryMeta = new V3DLPDictionaryMeta();
    v3dlpDictionaryMeta.dictId("42");

    // Act and Assert
    assertNotEquals(v3dlpDictionaryMeta, new V3DLPDictionaryMeta());
  }

  /**
   * Test {@link V3DLPDictionaryMeta#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPDictionaryMeta#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPDictionaryMeta.equals(Object)",
    "int V3DLPDictionaryMeta.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V3DLPDictionaryMeta v3dlpDictionaryMeta = new V3DLPDictionaryMeta();
    v3dlpDictionaryMeta.version("1.0.2");

    // Act and Assert
    assertNotEquals(v3dlpDictionaryMeta, new V3DLPDictionaryMeta());
  }

  /**
   * Test {@link V3DLPDictionaryMeta#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPDictionaryMeta#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPDictionaryMeta.equals(Object)",
    "int V3DLPDictionaryMeta.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V3DLPDictionaryMeta v3dlpDictionaryMeta = new V3DLPDictionaryMeta();
    v3dlpDictionaryMeta.name("Name");

    // Act and Assert
    assertNotEquals(v3dlpDictionaryMeta, new V3DLPDictionaryMeta());
  }

  /**
   * Test {@link V3DLPDictionaryMeta#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPDictionaryMeta#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPDictionaryMeta.equals(Object)",
    "int V3DLPDictionaryMeta.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPDictionaryMeta(), null);
  }

  /**
   * Test {@link V3DLPDictionaryMeta#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3DLPDictionaryMeta#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3DLPDictionaryMeta.equals(Object)",
    "int V3DLPDictionaryMeta.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPDictionaryMeta(), "Different type to V3DLPDictionaryMeta");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V3DLPDictionaryMeta}
   *   <li>{@link V3DLPDictionaryMeta#dictId(String)}
   *   <li>{@link V3DLPDictionaryMeta#name(String)}
   *   <li>{@link V3DLPDictionaryMeta#setDictId(String)}
   *   <li>{@link V3DLPDictionaryMeta#setName(String)}
   *   <li>{@link V3DLPDictionaryMeta#setVersion(String)}
   *   <li>{@link V3DLPDictionaryMeta#version(String)}
   *   <li>{@link V3DLPDictionaryMeta#toString()}
   *   <li>{@link V3DLPDictionaryMeta#getDictId()}
   *   <li>{@link V3DLPDictionaryMeta#getName()}
   *   <li>{@link V3DLPDictionaryMeta#getVersion()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V3DLPDictionaryMeta.<init>()",
    "V3DLPDictionaryMeta V3DLPDictionaryMeta.dictId(String)",
    "String V3DLPDictionaryMeta.getDictId()",
    "String V3DLPDictionaryMeta.getName()",
    "String V3DLPDictionaryMeta.getVersion()",
    "V3DLPDictionaryMeta V3DLPDictionaryMeta.name(String)",
    "void V3DLPDictionaryMeta.setDictId(String)",
    "void V3DLPDictionaryMeta.setName(String)",
    "void V3DLPDictionaryMeta.setVersion(String)",
    "String V3DLPDictionaryMeta.toString()",
    "V3DLPDictionaryMeta V3DLPDictionaryMeta.version(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V3DLPDictionaryMeta actualV3dlpDictionaryMeta = new V3DLPDictionaryMeta();
    V3DLPDictionaryMeta actualDictIdResult = actualV3dlpDictionaryMeta.dictId("42");
    V3DLPDictionaryMeta actualNameResult = actualV3dlpDictionaryMeta.name("Name");
    actualV3dlpDictionaryMeta.setDictId("42");
    actualV3dlpDictionaryMeta.setName("Name");
    actualV3dlpDictionaryMeta.setVersion("1.0.2");
    V3DLPDictionaryMeta actualVersionResult = actualV3dlpDictionaryMeta.version("1.0.2");
    String actualToStringResult = actualV3dlpDictionaryMeta.toString();
    String actualDictId = actualV3dlpDictionaryMeta.getDictId();
    String actualName = actualV3dlpDictionaryMeta.getName();

    // Assert
    assertEquals("1.0.2", actualV3dlpDictionaryMeta.getVersion());
    assertEquals("42", actualDictId);
    assertEquals("Name", actualName);
    assertEquals(
        "class V3DLPDictionaryMeta {\n    dictId: 42\n    version: 1.0.2\n    name: Name\n}",
        actualToStringResult);
    assertSame(actualV3dlpDictionaryMeta, actualDictIdResult);
    assertSame(actualV3dlpDictionaryMeta, actualNameResult);
    assertSame(actualV3dlpDictionaryMeta, actualVersionResult);
  }
}
