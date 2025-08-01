package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserGroupDataDiffblueTest {
  /**
   * Test {@link UserGroupData#equals(Object)}, and {@link UserGroupData#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserGroupData#equals(Object)}
   *   <li>{@link UserGroupData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserGroupData.equals(Object)", "int UserGroupData.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserGroupData userGroupData = new UserGroupData();
    UserGroupData userGroupData2 = new UserGroupData();

    // Act and Assert
    assertEquals(userGroupData, userGroupData2);
    int expectedHashCodeResult = userGroupData.hashCode();
    assertEquals(expectedHashCodeResult, userGroupData2.hashCode());
  }

  /**
   * Test {@link UserGroupData#equals(Object)}, and {@link UserGroupData#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserGroupData#equals(Object)}
   *   <li>{@link UserGroupData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserGroupData.equals(Object)", "int UserGroupData.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserGroupData userGroupData = new UserGroupData();

    // Act and Assert
    assertEquals(userGroupData, userGroupData);
    int expectedHashCodeResult = userGroupData.hashCode();
    assertEquals(expectedHashCodeResult, userGroupData.hashCode());
  }

  /**
   * Test {@link UserGroupData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserGroupData.equals(Object)", "int UserGroupData.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserGroupData(), 1);
  }

  /**
   * Test {@link UserGroupData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserGroupData.equals(Object)", "int UserGroupData.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserGroupData userGroupData = new UserGroupData();
    userGroupData.id("42");

    // Act and Assert
    assertNotEquals(userGroupData, new UserGroupData());
  }

  /**
   * Test {@link UserGroupData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserGroupData.equals(Object)", "int UserGroupData.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserGroupData userGroupData = new UserGroupData();
    userGroupData.name("Name");

    // Act and Assert
    assertNotEquals(userGroupData, new UserGroupData());
  }

  /**
   * Test {@link UserGroupData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserGroupData.equals(Object)", "int UserGroupData.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    UserGroupData userGroupData = new UserGroupData();
    userGroupData.area("Area");

    // Act and Assert
    assertNotEquals(userGroupData, new UserGroupData());
  }

  /**
   * Test {@link UserGroupData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserGroupData.equals(Object)", "int UserGroupData.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    UserGroupData userGroupData = new UserGroupData();
    userGroupData.type("Type");

    // Act and Assert
    assertNotEquals(userGroupData, new UserGroupData());
  }

  /**
   * Test {@link UserGroupData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserGroupData.equals(Object)", "int UserGroupData.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    UserGroupData userGroupData = new UserGroupData();
    userGroupData.active(true);

    // Act and Assert
    assertNotEquals(userGroupData, new UserGroupData());
  }

  /**
   * Test {@link UserGroupData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserGroupData.equals(Object)", "int UserGroupData.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserGroupData(), null);
  }

  /**
   * Test {@link UserGroupData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserGroupData.equals(Object)", "int UserGroupData.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserGroupData(), "Different type to UserGroupData");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UserGroupData}
   *   <li>{@link UserGroupData#active(Boolean)}
   *   <li>{@link UserGroupData#area(String)}
   *   <li>{@link UserGroupData#id(String)}
   *   <li>{@link UserGroupData#name(String)}
   *   <li>{@link UserGroupData#setActive(Boolean)}
   *   <li>{@link UserGroupData#setArea(String)}
   *   <li>{@link UserGroupData#setId(String)}
   *   <li>{@link UserGroupData#setName(String)}
   *   <li>{@link UserGroupData#setType(String)}
   *   <li>{@link UserGroupData#type(String)}
   *   <li>{@link UserGroupData#toString()}
   *   <li>{@link UserGroupData#getActive()}
   *   <li>{@link UserGroupData#getArea()}
   *   <li>{@link UserGroupData#getId()}
   *   <li>{@link UserGroupData#getName()}
   *   <li>{@link UserGroupData#getType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserGroupData.<init>()",
    "UserGroupData UserGroupData.active(Boolean)",
    "UserGroupData UserGroupData.area(String)",
    "Boolean UserGroupData.getActive()",
    "String UserGroupData.getArea()",
    "String UserGroupData.getId()",
    "String UserGroupData.getName()",
    "String UserGroupData.getType()",
    "UserGroupData UserGroupData.id(String)",
    "UserGroupData UserGroupData.name(String)",
    "void UserGroupData.setActive(Boolean)",
    "void UserGroupData.setArea(String)",
    "void UserGroupData.setId(String)",
    "void UserGroupData.setName(String)",
    "void UserGroupData.setType(String)",
    "String UserGroupData.toString()",
    "UserGroupData UserGroupData.type(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    UserGroupData actualUserGroupData = new UserGroupData();
    UserGroupData actualActiveResult = actualUserGroupData.active(true);
    UserGroupData actualAreaResult = actualUserGroupData.area("Area");
    UserGroupData actualIdResult = actualUserGroupData.id("42");
    UserGroupData actualNameResult = actualUserGroupData.name("Name");
    actualUserGroupData.setActive(true);
    actualUserGroupData.setArea("Area");
    actualUserGroupData.setId("42");
    actualUserGroupData.setName("Name");
    actualUserGroupData.setType("Type");
    UserGroupData actualTypeResult = actualUserGroupData.type("Type");
    String actualToStringResult = actualUserGroupData.toString();
    Boolean actualActive = actualUserGroupData.getActive();
    String actualArea = actualUserGroupData.getArea();
    String actualId = actualUserGroupData.getId();
    String actualName = actualUserGroupData.getName();

    // Assert
    assertEquals("42", actualId);
    assertEquals("Area", actualArea);
    assertEquals("Name", actualName);
    assertEquals("Type", actualUserGroupData.getType());
    assertEquals(
        "class UserGroupData {\n    id: 42\n    name: Name\n    area: Area\n    type: Type\n    active: true\n}",
        actualToStringResult);
    assertTrue(actualActive);
    assertSame(actualUserGroupData, actualActiveResult);
    assertSame(actualUserGroupData, actualAreaResult);
    assertSame(actualUserGroupData, actualIdResult);
    assertSame(actualUserGroupData, actualNameResult);
    assertSame(actualUserGroupData, actualTypeResult);
  }
}
