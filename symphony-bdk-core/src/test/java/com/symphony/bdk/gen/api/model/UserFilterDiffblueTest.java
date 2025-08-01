package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.UserFilter.StatusEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserFilterDiffblueTest {
  /**
   * Test {@link UserFilter#equals(Object)}, and {@link UserFilter#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserFilter#equals(Object)}
   *   <li>{@link UserFilter#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserFilter.equals(Object)", "int UserFilter.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserFilter userFilter = new UserFilter();
    UserFilter userFilter2 = new UserFilter();

    // Act and Assert
    assertEquals(userFilter, userFilter2);
    int expectedHashCodeResult = userFilter.hashCode();
    assertEquals(expectedHashCodeResult, userFilter2.hashCode());
  }

  /**
   * Test {@link UserFilter#equals(Object)}, and {@link UserFilter#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserFilter#equals(Object)}
   *   <li>{@link UserFilter#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserFilter.equals(Object)", "int UserFilter.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserFilter userFilter = new UserFilter();

    // Act and Assert
    assertEquals(userFilter, userFilter);
    int expectedHashCodeResult = userFilter.hashCode();
    assertEquals(expectedHashCodeResult, userFilter.hashCode());
  }

  /**
   * Test {@link UserFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserFilter.equals(Object)", "int UserFilter.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserFilter(), 1);
  }

  /**
   * Test {@link UserFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserFilter.equals(Object)", "int UserFilter.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserFilter userFilter = new UserFilter();
    userFilter.role("Role");

    // Act and Assert
    assertNotEquals(userFilter, new UserFilter());
  }

  /**
   * Test {@link UserFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserFilter.equals(Object)", "int UserFilter.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserFilter userFilter = new UserFilter();
    userFilter.feature("Feature");

    // Act and Assert
    assertNotEquals(userFilter, new UserFilter());
  }

  /**
   * Test {@link UserFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserFilter.equals(Object)", "int UserFilter.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    UserFilter userFilter = new UserFilter();
    userFilter.status(StatusEnum.ENABLED);

    // Act and Assert
    assertNotEquals(userFilter, new UserFilter());
  }

  /**
   * Test {@link UserFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserFilter.equals(Object)", "int UserFilter.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserFilter(), null);
  }

  /**
   * Test {@link UserFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserFilter.equals(Object)", "int UserFilter.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserFilter(), "Different type to UserFilter");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UserFilter}
   *   <li>{@link UserFilter#feature(String)}
   *   <li>{@link UserFilter#role(String)}
   *   <li>{@link UserFilter#setFeature(String)}
   *   <li>{@link UserFilter#setRole(String)}
   *   <li>{@link UserFilter#setStatus(StatusEnum)}
   *   <li>{@link UserFilter#status(StatusEnum)}
   *   <li>{@link UserFilter#toString()}
   *   <li>{@link UserFilter#getFeature()}
   *   <li>{@link UserFilter#getRole()}
   *   <li>{@link UserFilter#getStatus()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserFilter.<init>()",
    "UserFilter UserFilter.feature(String)",
    "String UserFilter.getFeature()",
    "String UserFilter.getRole()",
    "StatusEnum UserFilter.getStatus()",
    "UserFilter UserFilter.role(String)",
    "void UserFilter.setFeature(String)",
    "void UserFilter.setRole(String)",
    "void UserFilter.setStatus(StatusEnum)",
    "UserFilter UserFilter.status(StatusEnum)",
    "String UserFilter.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    UserFilter actualUserFilter = new UserFilter();
    UserFilter actualFeatureResult = actualUserFilter.feature("Feature");
    UserFilter actualRoleResult = actualUserFilter.role("Role");
    actualUserFilter.setFeature("Feature");
    actualUserFilter.setRole("Role");
    actualUserFilter.setStatus(StatusEnum.ENABLED);
    UserFilter actualStatusResult = actualUserFilter.status(StatusEnum.ENABLED);
    String actualToStringResult = actualUserFilter.toString();
    String actualFeature = actualUserFilter.getFeature();
    String actualRole = actualUserFilter.getRole();

    // Assert
    assertEquals("Feature", actualFeature);
    assertEquals("Role", actualRole);
    assertEquals(
        "class UserFilter {\n    role: Role\n    feature: Feature\n    status: ENABLED\n}",
        actualToStringResult);
    assertEquals(StatusEnum.ENABLED, actualUserFilter.getStatus());
    assertSame(actualUserFilter, actualFeatureResult);
    assertSame(actualUserFilter, actualRoleResult);
    assertSame(actualUserFilter, actualStatusResult);
  }

  /**
   * Test StatusEnum {@link StatusEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link StatusEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test StatusEnum fromValue(String); when '42'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StatusEnum StatusEnum.fromValue(String)"})
  void testStatusEnumFromValue_when42_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(StatusEnum.fromValue("42"));
  }

  /**
   * Test StatusEnum {@link StatusEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code ENABLED}.
   *   <li>Then return {@code ENABLED}.
   * </ul>
   *
   * <p>Method under test: {@link StatusEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test StatusEnum fromValue(String); when 'ENABLED'; then return 'ENABLED'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StatusEnum StatusEnum.fromValue(String)"})
  void testStatusEnumFromValue_whenEnabled_thenReturnEnabled() {
    // Arrange, Act and Assert
    assertEquals(StatusEnum.ENABLED, StatusEnum.fromValue("ENABLED"));
  }

  /**
   * Test StatusEnum getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link StatusEnum#toString()}
   *   <li>{@link StatusEnum#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test StatusEnum getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String StatusEnum.getValue()", "String StatusEnum.toString()"})
  void testStatusEnumGettersAndSetters() {
    // Arrange
    StatusEnum valueOfResult = StatusEnum.valueOf("ENABLED");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("ENABLED", valueOfResult.getValue());
    assertEquals("ENABLED", actualToStringResult);
  }
}
