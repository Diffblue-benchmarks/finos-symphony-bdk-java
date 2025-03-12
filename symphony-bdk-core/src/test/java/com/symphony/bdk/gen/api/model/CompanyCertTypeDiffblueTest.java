package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.CompanyCertType.TypeEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CompanyCertTypeDiffblueTest {
  /**
   * Test {@link CompanyCertType#equals(Object)}, and {@link CompanyCertType#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link CompanyCertType#equals(Object)}
   *   <li>{@link CompanyCertType#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCertType.equals(Object)", "int CompanyCertType.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CompanyCertType companyCertType = new CompanyCertType();
    CompanyCertType companyCertType2 = new CompanyCertType();

    // Act and Assert
    assertEquals(companyCertType, companyCertType2);
    int expectedHashCodeResult = companyCertType.hashCode();
    assertEquals(expectedHashCodeResult, companyCertType2.hashCode());
  }

  /**
   * Test {@link CompanyCertType#equals(Object)}, and {@link CompanyCertType#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link CompanyCertType#equals(Object)}
   *   <li>{@link CompanyCertType#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCertType.equals(Object)", "int CompanyCertType.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CompanyCertType companyCertType = new CompanyCertType();

    // Act and Assert
    assertEquals(companyCertType, companyCertType);
    int expectedHashCodeResult = companyCertType.hashCode();
    assertEquals(expectedHashCodeResult, companyCertType.hashCode());
  }

  /**
   * Test {@link CompanyCertType#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertType#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCertType.equals(Object)", "int CompanyCertType.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CompanyCertType(), null);
  }

  /**
   * Test {@link CompanyCertType#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertType#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCertType.equals(Object)", "int CompanyCertType.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CompanyCertType(), null);
  }

  /**
   * Test {@link CompanyCertType#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertType#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCertType.equals(Object)", "int CompanyCertType.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CompanyCertType(), "Different type to CompanyCertType");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link CompanyCertType}
   *   <li>{@link CompanyCertType#setType(TypeEnum)}
   *   <li>{@link CompanyCertType#type(TypeEnum)}
   *   <li>{@link CompanyCertType#toString()}
   *   <li>{@link CompanyCertType#getType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompanyCertType.<init>()", "TypeEnum CompanyCertType.getType()",
      "void CompanyCertType.setType(TypeEnum)", "String CompanyCertType.toString()",
      "CompanyCertType CompanyCertType.type(TypeEnum)"})
  void testGettersAndSetters() {
    // Arrange and Act
    CompanyCertType actualCompanyCertType = new CompanyCertType();
    actualCompanyCertType.setType(TypeEnum.USERSIGNING);
    CompanyCertType actualTypeResult = actualCompanyCertType.type(TypeEnum.USERSIGNING);
    String actualToStringResult = actualCompanyCertType.toString();

    // Assert
    assertEquals("class CompanyCertType {\n    type: USERSIGNING\n}", actualToStringResult);
    assertEquals(TypeEnum.USERSIGNING, actualCompanyCertType.getType());
    assertSame(actualCompanyCertType, actualTypeResult);
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
   *   <li>When {@code USERSIGNING}.</li>
   *   <li>Then return {@code USERSIGNING}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TypeEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test TypeEnum fromValue(String); when 'USERSIGNING'; then return 'USERSIGNING'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TypeEnum TypeEnum.fromValue(String)"})
  void testTypeEnumFromValue_whenUsersigning_thenReturnUsersigning() {
    // Arrange, Act and Assert
    assertEquals(TypeEnum.USERSIGNING, TypeEnum.fromValue("USERSIGNING"));
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
    TypeEnum valueOfResult = TypeEnum.valueOf("USERSIGNING");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("USERSIGNING", valueOfResult.getValue());
    assertEquals("USERSIGNING", actualToStringResult);
  }
}
