package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AppPropertyDiffblueTest {
  /**
   * Test {@link AppProperty#equals(Object)}, and {@link AppProperty#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AppProperty#equals(Object)}
   *   <li>{@link AppProperty#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AppProperty.equals(Object)", "int AppProperty.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AppProperty appProperty = new AppProperty();
    AppProperty appProperty2 = new AppProperty();

    // Act and Assert
    assertEquals(appProperty, appProperty2);
    assertEquals(appProperty.hashCode(), appProperty2.hashCode());
  }

  /**
   * Test {@link AppProperty#equals(Object)}, and {@link AppProperty#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AppProperty#equals(Object)}
   *   <li>{@link AppProperty#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AppProperty.equals(Object)", "int AppProperty.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AppProperty appProperty = new AppProperty();

    // Act and Assert
    assertEquals(appProperty, appProperty);
    int expectedHashCodeResult = appProperty.hashCode();
    assertEquals(expectedHashCodeResult, appProperty.hashCode());
  }

  /**
   * Test {@link AppProperty#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AppProperty#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AppProperty.equals(Object)", "int AppProperty.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AppProperty(), 1);
  }

  /**
   * Test {@link AppProperty#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AppProperty#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AppProperty.equals(Object)", "int AppProperty.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    AppProperty appProperty = new AppProperty();
    appProperty.key("Key");

    // Act and Assert
    assertNotEquals(appProperty, new AppProperty());
  }

  /**
   * Test {@link AppProperty#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AppProperty#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AppProperty.equals(Object)", "int AppProperty.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    AppProperty appProperty = new AppProperty();
    appProperty.value("42");

    // Act and Assert
    assertNotEquals(appProperty, new AppProperty());
  }

  /**
   * Test {@link AppProperty#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AppProperty#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AppProperty.equals(Object)", "int AppProperty.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AppProperty(), null);
  }

  /**
   * Test {@link AppProperty#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AppProperty#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AppProperty.equals(Object)", "int AppProperty.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AppProperty(), "Different type to AppProperty");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link AppProperty}
   *   <li>{@link AppProperty#key(String)}
   *   <li>{@link AppProperty#setKey(String)}
   *   <li>{@link AppProperty#setValue(String)}
   *   <li>{@link AppProperty#value(String)}
   *   <li>{@link AppProperty#toString()}
   *   <li>{@link AppProperty#getKey()}
   *   <li>{@link AppProperty#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AppProperty.<init>()",
    "String AppProperty.getKey()",
    "String AppProperty.getValue()",
    "AppProperty AppProperty.key(String)",
    "void AppProperty.setKey(String)",
    "void AppProperty.setValue(String)",
    "String AppProperty.toString()",
    "AppProperty AppProperty.value(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    AppProperty actualAppProperty = new AppProperty();
    AppProperty actualKeyResult = actualAppProperty.key("Key");
    actualAppProperty.setKey("Key");
    actualAppProperty.setValue("42");
    AppProperty actualValueResult = actualAppProperty.value("42");
    String actualToStringResult = actualAppProperty.toString();
    String actualKey = actualAppProperty.getKey();

    // Assert
    assertEquals("42", actualAppProperty.getValue());
    assertEquals("Key", actualKey);
    assertEquals("class AppProperty {\n    key: Key\n    value: 42\n}", actualToStringResult);
    assertSame(actualAppProperty, actualKeyResult);
    assertSame(actualAppProperty, actualValueResult);
  }
}
