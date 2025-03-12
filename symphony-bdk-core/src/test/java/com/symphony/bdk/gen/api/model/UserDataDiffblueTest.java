package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserDataDiffblueTest {
  /**
   * Test {@link UserData#equals(Object)}, and {@link UserData#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserData#equals(Object)}
   *   <li>{@link UserData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserData.equals(Object)", "int UserData.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserData userData = new UserData();
    UserData userData2 = new UserData();

    // Act and Assert
    assertEquals(userData, userData2);
    int expectedHashCodeResult = userData.hashCode();
    assertEquals(expectedHashCodeResult, userData2.hashCode());
  }

  /**
   * Test {@link UserData#equals(Object)}, and {@link UserData#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserData#equals(Object)}
   *   <li>{@link UserData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserData.equals(Object)", "int UserData.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserData userData = new UserData();

    // Act and Assert
    assertEquals(userData, userData);
    int expectedHashCodeResult = userData.hashCode();
    assertEquals(expectedHashCodeResult, userData.hashCode());
  }

  /**
   * Test {@link UserData#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserData.equals(Object)", "int UserData.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserData(), 1);
  }

  /**
   * Test {@link UserData#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserData.equals(Object)", "int UserData.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserData userData = new UserData();
    userData.id(1L);

    // Act and Assert
    assertNotEquals(userData, new UserData());
  }

  /**
   * Test {@link UserData#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserData.equals(Object)", "int UserData.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserData userData = new UserData();
    userData.username("janedoe");

    // Act and Assert
    assertNotEquals(userData, new UserData());
  }

  /**
   * Test {@link UserData#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserData.equals(Object)", "int UserData.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    UserData userData = new UserData();
    userData.firstName("Jane");

    // Act and Assert
    assertNotEquals(userData, new UserData());
  }

  /**
   * Test {@link UserData#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserData.equals(Object)", "int UserData.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    UserData userData = new UserData();
    userData.lastName("Doe");

    // Act and Assert
    assertNotEquals(userData, new UserData());
  }

  /**
   * Test {@link UserData#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserData.equals(Object)", "int UserData.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    UserData userData = new UserData();
    userData.emailAddress("42 Main St");

    // Act and Assert
    assertNotEquals(userData, new UserData());
  }

  /**
   * Test {@link UserData#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserData.equals(Object)", "int UserData.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserData(), null);
  }

  /**
   * Test {@link UserData#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UserData.equals(Object)", "int UserData.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserData(), "Different type to UserData");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link UserData}
   *   <li>{@link UserData#emailAddress(String)}
   *   <li>{@link UserData#firstName(String)}
   *   <li>{@link UserData#id(Long)}
   *   <li>{@link UserData#lastName(String)}
   *   <li>{@link UserData#setEmailAddress(String)}
   *   <li>{@link UserData#setFirstName(String)}
   *   <li>{@link UserData#setId(Long)}
   *   <li>{@link UserData#setLastName(String)}
   *   <li>{@link UserData#setUsername(String)}
   *   <li>{@link UserData#username(String)}
   *   <li>{@link UserData#toString()}
   *   <li>{@link UserData#getEmailAddress()}
   *   <li>{@link UserData#getFirstName()}
   *   <li>{@link UserData#getId()}
   *   <li>{@link UserData#getLastName()}
   *   <li>{@link UserData#getUsername()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void UserData.<init>()", "UserData UserData.emailAddress(String)",
      "UserData UserData.firstName(String)", "String UserData.getEmailAddress()", "String UserData.getFirstName()",
      "Long UserData.getId()", "String UserData.getLastName()", "String UserData.getUsername()",
      "UserData UserData.id(Long)", "UserData UserData.lastName(String)", "void UserData.setEmailAddress(String)",
      "void UserData.setFirstName(String)", "void UserData.setId(Long)", "void UserData.setLastName(String)",
      "void UserData.setUsername(String)", "String UserData.toString()", "UserData UserData.username(String)"})
  void testGettersAndSetters() {
    // Arrange and Act
    UserData actualUserData = new UserData();
    UserData actualEmailAddressResult = actualUserData.emailAddress("42 Main St");
    UserData actualFirstNameResult = actualUserData.firstName("Jane");
    UserData actualIdResult = actualUserData.id(1L);
    UserData actualLastNameResult = actualUserData.lastName("Doe");
    actualUserData.setEmailAddress("42 Main St");
    actualUserData.setFirstName("Jane");
    actualUserData.setId(1L);
    actualUserData.setLastName("Doe");
    actualUserData.setUsername("janedoe");
    UserData actualUsernameResult = actualUserData.username("janedoe");
    String actualToStringResult = actualUserData.toString();
    String actualEmailAddress = actualUserData.getEmailAddress();
    String actualFirstName = actualUserData.getFirstName();
    Long actualId = actualUserData.getId();
    String actualLastName = actualUserData.getLastName();

    // Assert
    assertEquals("42 Main St", actualEmailAddress);
    assertEquals("Doe", actualLastName);
    assertEquals("Jane", actualFirstName);
    assertEquals("class UserData {\n" + "    id: 1\n" + "    username: janedoe\n" + "    firstName: Jane\n"
        + "    lastName: Doe\n" + "    emailAddress: 42 Main St\n" + "}", actualToStringResult);
    assertEquals("janedoe", actualUserData.getUsername());
    assertEquals(1L, actualId.longValue());
    assertSame(actualUserData, actualEmailAddressResult);
    assertSame(actualUserData, actualFirstNameResult);
    assertSame(actualUserData, actualIdResult);
    assertSame(actualUserData, actualLastNameResult);
    assertSame(actualUserData, actualUsernameResult);
  }
}
