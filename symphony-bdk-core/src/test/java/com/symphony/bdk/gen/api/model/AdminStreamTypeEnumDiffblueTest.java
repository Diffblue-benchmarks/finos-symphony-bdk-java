package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.AdminStreamTypeEnum.TypeEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AdminStreamTypeEnumDiffblueTest {
  /**
   * Test {@link AdminStreamTypeEnum#equals(Object)}, and {@link AdminStreamTypeEnum#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AdminStreamTypeEnum#equals(Object)}
   *   <li>{@link AdminStreamTypeEnum#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamTypeEnum.equals(Object)",
    "int AdminStreamTypeEnum.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AdminStreamTypeEnum adminStreamTypeEnum = new AdminStreamTypeEnum();
    AdminStreamTypeEnum adminStreamTypeEnum2 = new AdminStreamTypeEnum();

    // Act and Assert
    assertEquals(adminStreamTypeEnum, adminStreamTypeEnum2);
    assertEquals(adminStreamTypeEnum.hashCode(), adminStreamTypeEnum2.hashCode());
  }

  /**
   * Test {@link AdminStreamTypeEnum#equals(Object)}, and {@link AdminStreamTypeEnum#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AdminStreamTypeEnum#equals(Object)}
   *   <li>{@link AdminStreamTypeEnum#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamTypeEnum.equals(Object)",
    "int AdminStreamTypeEnum.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AdminStreamTypeEnum adminStreamTypeEnum = new AdminStreamTypeEnum();

    // Act and Assert
    assertEquals(adminStreamTypeEnum, adminStreamTypeEnum);
    int expectedHashCodeResult = adminStreamTypeEnum.hashCode();
    assertEquals(expectedHashCodeResult, adminStreamTypeEnum.hashCode());
  }

  /**
   * Test {@link AdminStreamTypeEnum#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamTypeEnum#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamTypeEnum.equals(Object)",
    "int AdminStreamTypeEnum.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AdminStreamTypeEnum(), null);
  }

  /**
   * Test {@link AdminStreamTypeEnum#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamTypeEnum#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamTypeEnum.equals(Object)",
    "int AdminStreamTypeEnum.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AdminStreamTypeEnum(), "Different type to AdminStreamTypeEnum");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link AdminStreamTypeEnum}
   *   <li>{@link AdminStreamTypeEnum#setType(TypeEnum)}
   *   <li>{@link AdminStreamTypeEnum#type(TypeEnum)}
   *   <li>{@link AdminStreamTypeEnum#toString()}
   *   <li>{@link AdminStreamTypeEnum#getType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AdminStreamTypeEnum.<init>()",
    "TypeEnum AdminStreamTypeEnum.getType()",
    "void AdminStreamTypeEnum.setType(TypeEnum)",
    "String AdminStreamTypeEnum.toString()",
    "AdminStreamTypeEnum AdminStreamTypeEnum.type(TypeEnum)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    AdminStreamTypeEnum actualAdminStreamTypeEnum = new AdminStreamTypeEnum();
    actualAdminStreamTypeEnum.setType(TypeEnum.IM);
    AdminStreamTypeEnum actualTypeResult = actualAdminStreamTypeEnum.type(TypeEnum.IM);
    String actualToStringResult = actualAdminStreamTypeEnum.toString();

    // Assert
    assertEquals("class AdminStreamTypeEnum {\n    type: IM\n}", actualToStringResult);
    assertEquals(TypeEnum.IM, actualAdminStreamTypeEnum.getType());
    assertSame(actualAdminStreamTypeEnum, actualTypeResult);
  }

  /**
   * Test TypeEnum {@link TypeEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link TypeEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test TypeEnum fromValue(String); when '42'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypeEnum TypeEnum.fromValue(String)"})
  void testTypeEnumFromValue_when42_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(TypeEnum.fromValue("42"));
  }

  /**
   * Test TypeEnum {@link TypeEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code IM}.
   *   <li>Then return {@code IM}.
   * </ul>
   *
   * <p>Method under test: {@link TypeEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test TypeEnum fromValue(String); when 'IM'; then return 'IM'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypeEnum TypeEnum.fromValue(String)"})
  void testTypeEnumFromValue_whenIm_thenReturnIm() {
    // Arrange, Act and Assert
    assertEquals(TypeEnum.IM, TypeEnum.fromValue("IM"));
  }

  /**
   * Test TypeEnum getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TypeEnum#toString()}
   *   <li>{@link TypeEnum#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test TypeEnum getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String TypeEnum.getValue()", "String TypeEnum.toString()"})
  void testTypeEnumGettersAndSetters() {
    // Arrange
    TypeEnum valueOfResult = TypeEnum.valueOf("IM");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("IM", valueOfResult.getValue());
    assertEquals("IM", actualToStringResult);
  }
}
