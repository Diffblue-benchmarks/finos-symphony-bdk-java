package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.CompanyCertStatus.TypeEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CompanyCertStatusDiffblueTest {
  /**
   * Test {@link CompanyCertStatus#equals(Object)}, and {@link CompanyCertStatus#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link CompanyCertStatus#equals(Object)}
   *   <li>{@link CompanyCertStatus#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCertStatus.equals(Object)", "int CompanyCertStatus.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CompanyCertStatus companyCertStatus = new CompanyCertStatus();
    CompanyCertStatus companyCertStatus2 = new CompanyCertStatus();

    // Act and Assert
    assertEquals(companyCertStatus, companyCertStatus2);
    int expectedHashCodeResult = companyCertStatus.hashCode();
    assertEquals(expectedHashCodeResult, companyCertStatus2.hashCode());
  }

  /**
   * Test {@link CompanyCertStatus#equals(Object)}, and {@link CompanyCertStatus#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link CompanyCertStatus#equals(Object)}
   *   <li>{@link CompanyCertStatus#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCertStatus.equals(Object)", "int CompanyCertStatus.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CompanyCertStatus companyCertStatus = new CompanyCertStatus();

    // Act and Assert
    assertEquals(companyCertStatus, companyCertStatus);
    int expectedHashCodeResult = companyCertStatus.hashCode();
    assertEquals(expectedHashCodeResult, companyCertStatus.hashCode());
  }

  /**
   * Test {@link CompanyCertStatus#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertStatus#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCertStatus.equals(Object)", "int CompanyCertStatus.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CompanyCertStatus(), null);
  }

  /**
   * Test {@link CompanyCertStatus#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertStatus#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCertStatus.equals(Object)", "int CompanyCertStatus.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CompanyCertStatus(), null);
  }

  /**
   * Test {@link CompanyCertStatus#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertStatus#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompanyCertStatus.equals(Object)", "int CompanyCertStatus.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CompanyCertStatus(), "Different type to CompanyCertStatus");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link CompanyCertStatus}
   *   <li>{@link CompanyCertStatus#setType(TypeEnum)}
   *   <li>{@link CompanyCertStatus#type(TypeEnum)}
   *   <li>{@link CompanyCertStatus#toString()}
   *   <li>{@link CompanyCertStatus#getType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompanyCertStatus.<init>()", "TypeEnum CompanyCertStatus.getType()",
      "void CompanyCertStatus.setType(TypeEnum)", "String CompanyCertStatus.toString()",
      "CompanyCertStatus CompanyCertStatus.type(TypeEnum)"})
  void testGettersAndSetters() {
    // Arrange and Act
    CompanyCertStatus actualCompanyCertStatus = new CompanyCertStatus();
    actualCompanyCertStatus.setType(TypeEnum.TRUSTED);
    CompanyCertStatus actualTypeResult = actualCompanyCertStatus.type(TypeEnum.TRUSTED);
    String actualToStringResult = actualCompanyCertStatus.toString();

    // Assert
    assertEquals("class CompanyCertStatus {\n    type: TRUSTED\n}", actualToStringResult);
    assertEquals(TypeEnum.TRUSTED, actualCompanyCertStatus.getType());
    assertSame(actualCompanyCertStatus, actualTypeResult);
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
   *   <li>When {@code TRUSTED}.</li>
   *   <li>Then return {@code TRUSTED}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TypeEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test TypeEnum fromValue(String); when 'TRUSTED'; then return 'TRUSTED'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TypeEnum TypeEnum.fromValue(String)"})
  void testTypeEnumFromValue_whenTrusted_thenReturnTrusted() {
    // Arrange, Act and Assert
    assertEquals(TypeEnum.TRUSTED, TypeEnum.fromValue("TRUSTED"));
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
    TypeEnum valueOfResult = TypeEnum.valueOf("TRUSTED");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("TRUSTED", valueOfResult.getValue());
    assertEquals("TRUSTED", actualToStringResult);
  }
}
