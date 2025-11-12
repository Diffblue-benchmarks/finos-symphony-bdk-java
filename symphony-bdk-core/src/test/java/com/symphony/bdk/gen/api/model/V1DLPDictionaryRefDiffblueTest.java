package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V1DLPDictionaryRefDiffblueTest {
  /**
   * Test {@link V1DLPDictionaryRef#equals(Object)}, and {@link V1DLPDictionaryRef#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V1DLPDictionaryRef#equals(Object)}
   *   <li>{@link V1DLPDictionaryRef#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPDictionaryRef.equals(Object)",
    "int V1DLPDictionaryRef.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V1DLPDictionaryRef v1dlpDictionaryRef = new V1DLPDictionaryRef();
    V1DLPDictionaryRef v1dlpDictionaryRef2 = new V1DLPDictionaryRef();

    // Act and Assert
    assertEquals(v1dlpDictionaryRef, v1dlpDictionaryRef2);
    assertEquals(v1dlpDictionaryRef.hashCode(), v1dlpDictionaryRef2.hashCode());
  }

  /**
   * Test {@link V1DLPDictionaryRef#equals(Object)}, and {@link V1DLPDictionaryRef#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V1DLPDictionaryRef#equals(Object)}
   *   <li>{@link V1DLPDictionaryRef#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPDictionaryRef.equals(Object)",
    "int V1DLPDictionaryRef.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V1DLPDictionaryRef v1dlpDictionaryRef = new V1DLPDictionaryRef();

    // Act and Assert
    assertEquals(v1dlpDictionaryRef, v1dlpDictionaryRef);
    int expectedHashCodeResult = v1dlpDictionaryRef.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpDictionaryRef.hashCode());
  }

  /**
   * Test {@link V1DLPDictionaryRef#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPDictionaryRef#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPDictionaryRef.equals(Object)",
    "int V1DLPDictionaryRef.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPDictionaryRef(), 1);
  }

  /**
   * Test {@link V1DLPDictionaryRef#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPDictionaryRef#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPDictionaryRef.equals(Object)",
    "int V1DLPDictionaryRef.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V1DLPDictionaryRef v1dlpDictionaryRef = new V1DLPDictionaryRef();
    v1dlpDictionaryRef.dictId("42");

    // Act and Assert
    assertNotEquals(v1dlpDictionaryRef, new V1DLPDictionaryRef());
  }

  /**
   * Test {@link V1DLPDictionaryRef#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPDictionaryRef#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPDictionaryRef.equals(Object)",
    "int V1DLPDictionaryRef.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V1DLPDictionaryRef v1dlpDictionaryRef = new V1DLPDictionaryRef();
    v1dlpDictionaryRef.name("Name");

    // Act and Assert
    assertNotEquals(v1dlpDictionaryRef, new V1DLPDictionaryRef());
  }

  /**
   * Test {@link V1DLPDictionaryRef#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPDictionaryRef#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPDictionaryRef.equals(Object)",
    "int V1DLPDictionaryRef.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V1DLPDictionaryRef v1dlpDictionaryRef = new V1DLPDictionaryRef();
    v1dlpDictionaryRef.version("1.0.2");

    // Act and Assert
    assertNotEquals(v1dlpDictionaryRef, new V1DLPDictionaryRef());
  }

  /**
   * Test {@link V1DLPDictionaryRef#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPDictionaryRef#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPDictionaryRef.equals(Object)",
    "int V1DLPDictionaryRef.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPDictionaryRef(), null);
  }

  /**
   * Test {@link V1DLPDictionaryRef#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPDictionaryRef#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPDictionaryRef.equals(Object)",
    "int V1DLPDictionaryRef.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPDictionaryRef(), "Different type to V1DLPDictionaryRef");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V1DLPDictionaryRef}
   *   <li>{@link V1DLPDictionaryRef#dictId(String)}
   *   <li>{@link V1DLPDictionaryRef#name(String)}
   *   <li>{@link V1DLPDictionaryRef#setDictId(String)}
   *   <li>{@link V1DLPDictionaryRef#setName(String)}
   *   <li>{@link V1DLPDictionaryRef#setVersion(String)}
   *   <li>{@link V1DLPDictionaryRef#version(String)}
   *   <li>{@link V1DLPDictionaryRef#toString()}
   *   <li>{@link V1DLPDictionaryRef#getDictId()}
   *   <li>{@link V1DLPDictionaryRef#getName()}
   *   <li>{@link V1DLPDictionaryRef#getVersion()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V1DLPDictionaryRef.<init>()",
    "V1DLPDictionaryRef V1DLPDictionaryRef.dictId(String)",
    "String V1DLPDictionaryRef.getDictId()",
    "String V1DLPDictionaryRef.getName()",
    "String V1DLPDictionaryRef.getVersion()",
    "V1DLPDictionaryRef V1DLPDictionaryRef.name(String)",
    "void V1DLPDictionaryRef.setDictId(String)",
    "void V1DLPDictionaryRef.setName(String)",
    "void V1DLPDictionaryRef.setVersion(String)",
    "String V1DLPDictionaryRef.toString()",
    "V1DLPDictionaryRef V1DLPDictionaryRef.version(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V1DLPDictionaryRef actualV1dlpDictionaryRef = new V1DLPDictionaryRef();
    V1DLPDictionaryRef actualDictIdResult = actualV1dlpDictionaryRef.dictId("42");
    V1DLPDictionaryRef actualNameResult = actualV1dlpDictionaryRef.name("Name");
    actualV1dlpDictionaryRef.setDictId("42");
    actualV1dlpDictionaryRef.setName("Name");
    actualV1dlpDictionaryRef.setVersion("1.0.2");
    V1DLPDictionaryRef actualVersionResult = actualV1dlpDictionaryRef.version("1.0.2");
    String actualToStringResult = actualV1dlpDictionaryRef.toString();
    String actualDictId = actualV1dlpDictionaryRef.getDictId();
    String actualName = actualV1dlpDictionaryRef.getName();

    // Assert
    assertEquals("1.0.2", actualV1dlpDictionaryRef.getVersion());
    assertEquals("42", actualDictId);
    assertEquals("Name", actualName);
    assertEquals(
        "class V1DLPDictionaryRef {\n    dictId: 42\n    name: Name\n    version: 1.0.2\n}",
        actualToStringResult);
    assertSame(actualV1dlpDictionaryRef, actualDictIdResult);
    assertSame(actualV1dlpDictionaryRef, actualNameResult);
    assertSame(actualV1dlpDictionaryRef, actualVersionResult);
  }
}
