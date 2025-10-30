package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserGroupUpdateDiffblueTest {
  /**
   * Test {@link UserGroupUpdate#equals(Object)}, and {@link UserGroupUpdate#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserGroupUpdate#equals(Object)}
   *   <li>{@link UserGroupUpdate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupUpdate.equals(Object)", "int UserGroupUpdate.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserGroupUpdate userGroupUpdate = new UserGroupUpdate();
    UserGroupUpdate userGroupUpdate2 = new UserGroupUpdate();

    // Act and Assert
    assertEquals(userGroupUpdate, userGroupUpdate2);
    int expectedHashCodeResult = userGroupUpdate.hashCode();
    assertEquals(expectedHashCodeResult, userGroupUpdate2.hashCode());
  }

  /**
   * Test {@link UserGroupUpdate#equals(Object)}, and {@link UserGroupUpdate#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserGroupUpdate#equals(Object)}
   *   <li>{@link UserGroupUpdate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupUpdate.equals(Object)", "int UserGroupUpdate.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserGroupUpdate userGroupUpdate = new UserGroupUpdate();

    // Act and Assert
    assertEquals(userGroupUpdate, userGroupUpdate);
    int expectedHashCodeResult = userGroupUpdate.hashCode();
    assertEquals(expectedHashCodeResult, userGroupUpdate.hashCode());
  }

  /**
   * Test {@link UserGroupUpdate#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupUpdate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupUpdate.equals(Object)", "int UserGroupUpdate.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserGroupUpdate(), 1);
  }

  /**
   * Test {@link UserGroupUpdate#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupUpdate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupUpdate.equals(Object)", "int UserGroupUpdate.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserGroupUpdate userGroupUpdate = new UserGroupUpdate();
    userGroupUpdate.name("Name");

    // Act and Assert
    assertNotEquals(userGroupUpdate, new UserGroupUpdate());
  }

  /**
   * Test {@link UserGroupUpdate#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupUpdate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupUpdate.equals(Object)", "int UserGroupUpdate.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserGroupUpdate userGroupUpdate = new UserGroupUpdate();
    userGroupUpdate.area("Area");

    // Act and Assert
    assertNotEquals(userGroupUpdate, new UserGroupUpdate());
  }

  /**
   * Test {@link UserGroupUpdate#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupUpdate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupUpdate.equals(Object)", "int UserGroupUpdate.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    UserGroupUpdate userGroupUpdate = new UserGroupUpdate();
    userGroupUpdate.description("The characteristics of someone or something");

    // Act and Assert
    assertNotEquals(userGroupUpdate, new UserGroupUpdate());
  }

  /**
   * Test {@link UserGroupUpdate#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupUpdate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupUpdate.equals(Object)", "int UserGroupUpdate.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    UserGroupUpdate userGroupUpdate = new UserGroupUpdate();
    userGroupUpdate.active(true);

    // Act and Assert
    assertNotEquals(userGroupUpdate, new UserGroupUpdate());
  }

  /**
   * Test {@link UserGroupUpdate#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupUpdate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupUpdate.equals(Object)", "int UserGroupUpdate.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserGroupUpdate(), null);
  }

  /**
   * Test {@link UserGroupUpdate#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserGroupUpdate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserGroupUpdate.equals(Object)", "int UserGroupUpdate.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserGroupUpdate(), "Different type to UserGroupUpdate");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link UserGroupUpdate}
   *   <li>{@link UserGroupUpdate#active(Boolean)}
   *   <li>{@link UserGroupUpdate#area(String)}
   *   <li>{@link UserGroupUpdate#description(String)}
   *   <li>{@link UserGroupUpdate#name(String)}
   *   <li>{@link UserGroupUpdate#setActive(Boolean)}
   *   <li>{@link UserGroupUpdate#setArea(String)}
   *   <li>{@link UserGroupUpdate#setDescription(String)}
   *   <li>{@link UserGroupUpdate#setName(String)}
   *   <li>{@link UserGroupUpdate#toString()}
   *   <li>{@link UserGroupUpdate#getActive()}
   *   <li>{@link UserGroupUpdate#getArea()}
   *   <li>{@link UserGroupUpdate#getDescription()}
   *   <li>{@link UserGroupUpdate#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void UserGroupUpdate.<init>()", "UserGroupUpdate UserGroupUpdate.active(Boolean)",
      "UserGroupUpdate UserGroupUpdate.area(String)", "UserGroupUpdate UserGroupUpdate.description(String)",
      "Boolean UserGroupUpdate.getActive()", "String UserGroupUpdate.getArea()",
      "String UserGroupUpdate.getDescription()", "String UserGroupUpdate.getName()",
      "UserGroupUpdate UserGroupUpdate.name(String)", "void UserGroupUpdate.setActive(Boolean)",
      "void UserGroupUpdate.setArea(String)", "void UserGroupUpdate.setDescription(String)",
      "void UserGroupUpdate.setName(String)", "String UserGroupUpdate.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    UserGroupUpdate actualUserGroupUpdate = new UserGroupUpdate();
    UserGroupUpdate actualActiveResult = actualUserGroupUpdate.active(true);
    UserGroupUpdate actualAreaResult = actualUserGroupUpdate.area("Area");
    UserGroupUpdate actualDescriptionResult = actualUserGroupUpdate
        .description("The characteristics of someone or something");
    UserGroupUpdate actualNameResult = actualUserGroupUpdate.name("Name");
    actualUserGroupUpdate.setActive(true);
    actualUserGroupUpdate.setArea("Area");
    actualUserGroupUpdate.setDescription("The characteristics of someone or something");
    actualUserGroupUpdate.setName("Name");
    String actualToStringResult = actualUserGroupUpdate.toString();
    Boolean actualActive = actualUserGroupUpdate.getActive();
    String actualArea = actualUserGroupUpdate.getArea();
    String actualDescription = actualUserGroupUpdate.getDescription();

    // Assert
    assertEquals("Area", actualArea);
    assertEquals("Name", actualUserGroupUpdate.getName());
    assertEquals("The characteristics of someone or something", actualDescription);
    assertEquals(
        "class UserGroupUpdate {\n" + "    name: Name\n" + "    area: Area\n"
            + "    description: The characteristics of someone or something\n" + "    active: true\n" + "}",
        actualToStringResult);
    assertTrue(actualActive);
    assertSame(actualUserGroupUpdate, actualActiveResult);
    assertSame(actualUserGroupUpdate, actualAreaResult);
    assertSame(actualUserGroupUpdate, actualDescriptionResult);
    assertSame(actualUserGroupUpdate, actualNameResult);
  }
}
