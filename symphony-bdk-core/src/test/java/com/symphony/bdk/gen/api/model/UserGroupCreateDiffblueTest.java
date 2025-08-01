package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserGroupCreateDiffblueTest {
  /**
   * Test {@link UserGroupCreate#equals(Object)}, and {@link UserGroupCreate#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserGroupCreate#equals(Object)}
   *   <li>{@link UserGroupCreate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserGroupCreate.equals(Object)", "int UserGroupCreate.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserGroupCreate userGroupCreate = new UserGroupCreate();
    UserGroupCreate userGroupCreate2 = new UserGroupCreate();

    // Act and Assert
    assertEquals(userGroupCreate, userGroupCreate2);
    int expectedHashCodeResult = userGroupCreate.hashCode();
    assertEquals(expectedHashCodeResult, userGroupCreate2.hashCode());
  }

  /**
   * Test {@link UserGroupCreate#equals(Object)}, and {@link UserGroupCreate#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserGroupCreate#equals(Object)}
   *   <li>{@link UserGroupCreate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserGroupCreate.equals(Object)", "int UserGroupCreate.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserGroupCreate userGroupCreate = new UserGroupCreate();

    // Act and Assert
    assertEquals(userGroupCreate, userGroupCreate);
    int expectedHashCodeResult = userGroupCreate.hashCode();
    assertEquals(expectedHashCodeResult, userGroupCreate.hashCode());
  }

  /**
   * Test {@link UserGroupCreate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupCreate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserGroupCreate.equals(Object)", "int UserGroupCreate.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserGroupCreate(), 1);
  }

  /**
   * Test {@link UserGroupCreate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupCreate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserGroupCreate.equals(Object)", "int UserGroupCreate.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserGroupCreate userGroupCreate = new UserGroupCreate();
    userGroupCreate.name("Name");

    // Act and Assert
    assertNotEquals(userGroupCreate, new UserGroupCreate());
  }

  /**
   * Test {@link UserGroupCreate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupCreate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserGroupCreate.equals(Object)", "int UserGroupCreate.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserGroupCreate userGroupCreate = new UserGroupCreate();
    userGroupCreate.area("Area");

    // Act and Assert
    assertNotEquals(userGroupCreate, new UserGroupCreate());
  }

  /**
   * Test {@link UserGroupCreate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupCreate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserGroupCreate.equals(Object)", "int UserGroupCreate.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    UserGroupCreate userGroupCreate = new UserGroupCreate();
    userGroupCreate.description("The characteristics of someone or something");

    // Act and Assert
    assertNotEquals(userGroupCreate, new UserGroupCreate());
  }

  /**
   * Test {@link UserGroupCreate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupCreate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserGroupCreate.equals(Object)", "int UserGroupCreate.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    UserGroupCreate userGroupCreate = new UserGroupCreate();
    userGroupCreate.type("Type");

    // Act and Assert
    assertNotEquals(userGroupCreate, new UserGroupCreate());
  }

  /**
   * Test {@link UserGroupCreate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupCreate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserGroupCreate.equals(Object)", "int UserGroupCreate.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserGroupCreate(), null);
  }

  /**
   * Test {@link UserGroupCreate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupCreate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserGroupCreate.equals(Object)", "int UserGroupCreate.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserGroupCreate(), "Different type to UserGroupCreate");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UserGroupCreate}
   *   <li>{@link UserGroupCreate#area(String)}
   *   <li>{@link UserGroupCreate#description(String)}
   *   <li>{@link UserGroupCreate#name(String)}
   *   <li>{@link UserGroupCreate#setArea(String)}
   *   <li>{@link UserGroupCreate#setDescription(String)}
   *   <li>{@link UserGroupCreate#setName(String)}
   *   <li>{@link UserGroupCreate#setType(String)}
   *   <li>{@link UserGroupCreate#type(String)}
   *   <li>{@link UserGroupCreate#toString()}
   *   <li>{@link UserGroupCreate#getArea()}
   *   <li>{@link UserGroupCreate#getDescription()}
   *   <li>{@link UserGroupCreate#getName()}
   *   <li>{@link UserGroupCreate#getType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserGroupCreate.<init>()",
    "UserGroupCreate UserGroupCreate.area(String)",
    "UserGroupCreate UserGroupCreate.description(String)",
    "String UserGroupCreate.getArea()",
    "String UserGroupCreate.getDescription()",
    "String UserGroupCreate.getName()",
    "String UserGroupCreate.getType()",
    "UserGroupCreate UserGroupCreate.name(String)",
    "void UserGroupCreate.setArea(String)",
    "void UserGroupCreate.setDescription(String)",
    "void UserGroupCreate.setName(String)",
    "void UserGroupCreate.setType(String)",
    "String UserGroupCreate.toString()",
    "UserGroupCreate UserGroupCreate.type(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    UserGroupCreate actualUserGroupCreate = new UserGroupCreate();
    UserGroupCreate actualAreaResult = actualUserGroupCreate.area("Area");
    UserGroupCreate actualDescriptionResult =
        actualUserGroupCreate.description("The characteristics of someone or something");
    UserGroupCreate actualNameResult = actualUserGroupCreate.name("Name");
    actualUserGroupCreate.setArea("Area");
    actualUserGroupCreate.setDescription("The characteristics of someone or something");
    actualUserGroupCreate.setName("Name");
    actualUserGroupCreate.setType("Type");
    UserGroupCreate actualTypeResult = actualUserGroupCreate.type("Type");
    String actualToStringResult = actualUserGroupCreate.toString();
    String actualArea = actualUserGroupCreate.getArea();
    String actualDescription = actualUserGroupCreate.getDescription();
    String actualName = actualUserGroupCreate.getName();

    // Assert
    assertEquals("Area", actualArea);
    assertEquals("Name", actualName);
    assertEquals("The characteristics of someone or something", actualDescription);
    assertEquals("Type", actualUserGroupCreate.getType());
    assertEquals(
        "class UserGroupCreate {\n"
            + "    name: Name\n"
            + "    area: Area\n"
            + "    description: The characteristics of someone or something\n"
            + "    type: Type\n"
            + "}",
        actualToStringResult);
    assertSame(actualUserGroupCreate, actualAreaResult);
    assertSame(actualUserGroupCreate, actualDescriptionResult);
    assertSame(actualUserGroupCreate, actualNameResult);
    assertSame(actualUserGroupCreate, actualTypeResult);
  }
}
