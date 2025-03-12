package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.PasswordReset.TypeEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PasswordResetDiffblueTest {
  /**
   * Test {@link PasswordReset#equals(Object)}, and {@link PasswordReset#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link PasswordReset#equals(Object)}
   *   <li>{@link PasswordReset#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean PasswordReset.equals(Object)", "int PasswordReset.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    PasswordReset passwordReset = new PasswordReset();
    PasswordReset passwordReset2 = new PasswordReset();

    // Act and Assert
    assertEquals(passwordReset, passwordReset2);
    int expectedHashCodeResult = passwordReset.hashCode();
    assertEquals(expectedHashCodeResult, passwordReset2.hashCode());
  }

  /**
   * Test {@link PasswordReset#equals(Object)}, and {@link PasswordReset#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link PasswordReset#equals(Object)}
   *   <li>{@link PasswordReset#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean PasswordReset.equals(Object)", "int PasswordReset.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    PasswordReset passwordReset = new PasswordReset();

    // Act and Assert
    assertEquals(passwordReset, passwordReset);
    int expectedHashCodeResult = passwordReset.hashCode();
    assertEquals(expectedHashCodeResult, passwordReset.hashCode());
  }

  /**
   * Test {@link PasswordReset#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link PasswordReset#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean PasswordReset.equals(Object)", "int PasswordReset.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new PasswordReset(), null);
  }

  /**
   * Test {@link PasswordReset#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link PasswordReset#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean PasswordReset.equals(Object)", "int PasswordReset.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new PasswordReset(), null);
  }

  /**
   * Test {@link PasswordReset#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link PasswordReset#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean PasswordReset.equals(Object)", "int PasswordReset.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new PasswordReset(), "Different type to PasswordReset");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link PasswordReset}
   *   <li>{@link PasswordReset#setType(TypeEnum)}
   *   <li>{@link PasswordReset#type(TypeEnum)}
   *   <li>{@link PasswordReset#toString()}
   *   <li>{@link PasswordReset#getType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PasswordReset.<init>()", "TypeEnum PasswordReset.getType()",
      "void PasswordReset.setType(TypeEnum)", "String PasswordReset.toString()",
      "PasswordReset PasswordReset.type(TypeEnum)"})
  void testGettersAndSetters() {
    // Arrange and Act
    PasswordReset actualPasswordReset = new PasswordReset();
    actualPasswordReset.setType(TypeEnum.EMAIL);
    PasswordReset actualTypeResult = actualPasswordReset.type(TypeEnum.EMAIL);
    String actualToStringResult = actualPasswordReset.toString();

    // Assert
    assertEquals("class PasswordReset {\n    type: EMAIL\n}", actualToStringResult);
    assertEquals(TypeEnum.EMAIL, actualPasswordReset.getType());
    assertSame(actualPasswordReset, actualTypeResult);
  }

  /**
   * Test TypeEnum {@link TypeEnum#fromValue(String)}.
   * <ul>
   *   <li>When {@code 42}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TypeEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test TypeEnum fromValue(String); when '42'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TypeEnum TypeEnum.fromValue(String)"})
  void testTypeEnumFromValue_when42_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(TypeEnum.fromValue("42"));
  }

  /**
   * Test TypeEnum {@link TypeEnum#fromValue(String)}.
   * <ul>
   *   <li>When {@code EMAIL}.</li>
   *   <li>Then return {@code EMAIL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TypeEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test TypeEnum fromValue(String); when 'EMAIL'; then return 'EMAIL'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TypeEnum TypeEnum.fromValue(String)"})
  void testTypeEnumFromValue_whenEmail_thenReturnEmail() {
    // Arrange, Act and Assert
    assertEquals(TypeEnum.EMAIL, TypeEnum.fromValue("EMAIL"));
  }

  /**
   * Test TypeEnum getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link TypeEnum#toString()}
   *   <li>{@link TypeEnum#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test TypeEnum getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String TypeEnum.getValue()", "String TypeEnum.toString()"})
  void testTypeEnumGettersAndSetters() {
    // Arrange
    TypeEnum valueOfResult = TypeEnum.valueOf("EMAIL");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("EMAIL", valueOfResult.getValue());
    assertEquals("EMAIL", actualToStringResult);
  }
}
