package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.UserAppEntitlementPatchEnum.TypeEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserAppEntitlementPatchEnumDiffblueTest {
  /**
   * Test {@link UserAppEntitlementPatchEnum#equals(Object)}, and {@link UserAppEntitlementPatchEnum#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserAppEntitlementPatchEnum#equals(Object)}
   *   <li>{@link UserAppEntitlementPatchEnum#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserAppEntitlementPatchEnum.equals(Object)",
      "int UserAppEntitlementPatchEnum.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserAppEntitlementPatchEnum userAppEntitlementPatchEnum = new UserAppEntitlementPatchEnum();
    UserAppEntitlementPatchEnum userAppEntitlementPatchEnum2 = new UserAppEntitlementPatchEnum();

    // Act and Assert
    assertEquals(userAppEntitlementPatchEnum, userAppEntitlementPatchEnum2);
    int expectedHashCodeResult = userAppEntitlementPatchEnum.hashCode();
    assertEquals(expectedHashCodeResult, userAppEntitlementPatchEnum2.hashCode());
  }

  /**
   * Test {@link UserAppEntitlementPatchEnum#equals(Object)}, and {@link UserAppEntitlementPatchEnum#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserAppEntitlementPatchEnum#equals(Object)}
   *   <li>{@link UserAppEntitlementPatchEnum#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserAppEntitlementPatchEnum.equals(Object)",
      "int UserAppEntitlementPatchEnum.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserAppEntitlementPatchEnum userAppEntitlementPatchEnum = new UserAppEntitlementPatchEnum();

    // Act and Assert
    assertEquals(userAppEntitlementPatchEnum, userAppEntitlementPatchEnum);
    int expectedHashCodeResult = userAppEntitlementPatchEnum.hashCode();
    assertEquals(expectedHashCodeResult, userAppEntitlementPatchEnum.hashCode());
  }

  /**
   * Test {@link UserAppEntitlementPatchEnum#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserAppEntitlementPatchEnum#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserAppEntitlementPatchEnum.equals(Object)",
      "int UserAppEntitlementPatchEnum.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserAppEntitlementPatchEnum(), null);
  }

  /**
   * Test {@link UserAppEntitlementPatchEnum#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserAppEntitlementPatchEnum#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserAppEntitlementPatchEnum.equals(Object)",
      "int UserAppEntitlementPatchEnum.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserAppEntitlementPatchEnum(), null);
  }

  /**
   * Test {@link UserAppEntitlementPatchEnum#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserAppEntitlementPatchEnum#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserAppEntitlementPatchEnum.equals(Object)",
      "int UserAppEntitlementPatchEnum.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserAppEntitlementPatchEnum(), "Different type to UserAppEntitlementPatchEnum");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link UserAppEntitlementPatchEnum}
   *   <li>{@link UserAppEntitlementPatchEnum#setType(TypeEnum)}
   *   <li>{@link UserAppEntitlementPatchEnum#type(TypeEnum)}
   *   <li>{@link UserAppEntitlementPatchEnum#toString()}
   *   <li>{@link UserAppEntitlementPatchEnum#getType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void UserAppEntitlementPatchEnum.<init>()", "TypeEnum UserAppEntitlementPatchEnum.getType()",
      "void UserAppEntitlementPatchEnum.setType(TypeEnum)", "String UserAppEntitlementPatchEnum.toString()",
      "UserAppEntitlementPatchEnum UserAppEntitlementPatchEnum.type(TypeEnum)"})
  void testGettersAndSetters() {
    // Arrange and Act
    UserAppEntitlementPatchEnum actualUserAppEntitlementPatchEnum = new UserAppEntitlementPatchEnum();
    actualUserAppEntitlementPatchEnum.setType(TypeEnum.TRUE);
    UserAppEntitlementPatchEnum actualTypeResult = actualUserAppEntitlementPatchEnum.type(TypeEnum.TRUE);
    String actualToStringResult = actualUserAppEntitlementPatchEnum.toString();

    // Assert
    assertEquals("class UserAppEntitlementPatchEnum {\n    type: TRUE\n}", actualToStringResult);
    assertEquals(TypeEnum.TRUE, actualUserAppEntitlementPatchEnum.getType());
    assertSame(actualUserAppEntitlementPatchEnum, actualTypeResult);
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
   *   <li>When {@code TRUE}.</li>
   *   <li>Then return {@code TRUE}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TypeEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test TypeEnum fromValue(String); when 'TRUE'; then return 'TRUE'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TypeEnum TypeEnum.fromValue(String)"})
  void testTypeEnumFromValue_whenTrue_thenReturnTrue() {
    // Arrange, Act and Assert
    assertEquals(TypeEnum.TRUE, TypeEnum.fromValue("TRUE"));
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
    TypeEnum valueOfResult = TypeEnum.valueOf("TRUE");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("TRUE", valueOfResult.getValue());
    assertEquals("TRUE", actualToStringResult);
  }
}
