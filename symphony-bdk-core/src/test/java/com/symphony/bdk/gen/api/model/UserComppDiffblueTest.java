package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserComppDiffblueTest {
  /**
   * Test {@link UserCompp#equals(Object)}, and {@link UserCompp#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserCompp#equals(Object)}
   *   <li>{@link UserCompp#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserCompp.equals(Object)", "int UserCompp.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserCompp userCompp = new UserCompp();
    UserCompp userCompp2 = new UserCompp();

    // Act and Assert
    assertEquals(userCompp, userCompp2);
    int expectedHashCodeResult = userCompp.hashCode();
    assertEquals(expectedHashCodeResult, userCompp2.hashCode());
  }

  /**
   * Test {@link UserCompp#equals(Object)}, and {@link UserCompp#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserCompp#equals(Object)}
   *   <li>{@link UserCompp#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserCompp.equals(Object)", "int UserCompp.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserCompp userCompp = new UserCompp();

    // Act and Assert
    assertEquals(userCompp, userCompp);
    int expectedHashCodeResult = userCompp.hashCode();
    assertEquals(expectedHashCodeResult, userCompp.hashCode());
  }

  /**
   * Test {@link UserCompp#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserCompp#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserCompp.equals(Object)", "int UserCompp.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserCompp(), 1);
  }

  /**
   * Test {@link UserCompp#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserCompp#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserCompp.equals(Object)", "int UserCompp.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserCompp userCompp = new UserCompp();
    userCompp.id(1L);

    // Act and Assert
    assertNotEquals(userCompp, new UserCompp());
  }

  /**
   * Test {@link UserCompp#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserCompp#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserCompp.equals(Object)", "int UserCompp.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserCompp userCompp = new UserCompp();
    userCompp.username("janedoe");

    // Act and Assert
    assertNotEquals(userCompp, new UserCompp());
  }

  /**
   * Test {@link UserCompp#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserCompp#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserCompp.equals(Object)", "int UserCompp.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    UserCompp userCompp = new UserCompp();
    userCompp.firstName("Jane");

    // Act and Assert
    assertNotEquals(userCompp, new UserCompp());
  }

  /**
   * Test {@link UserCompp#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserCompp#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserCompp.equals(Object)", "int UserCompp.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    UserCompp userCompp = new UserCompp();
    userCompp.lastName("Doe");

    // Act and Assert
    assertNotEquals(userCompp, new UserCompp());
  }

  /**
   * Test {@link UserCompp#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserCompp#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserCompp.equals(Object)", "int UserCompp.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    UserCompp userCompp = new UserCompp();
    userCompp.emailAddress("42 Main St");

    // Act and Assert
    assertNotEquals(userCompp, new UserCompp());
  }

  /**
   * Test {@link UserCompp#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserCompp#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserCompp.equals(Object)", "int UserCompp.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserCompp(), null);
  }

  /**
   * Test {@link UserCompp#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserCompp#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserCompp.equals(Object)", "int UserCompp.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserCompp(), "Different type to UserCompp");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UserCompp}
   *   <li>{@link UserCompp#emailAddress(String)}
   *   <li>{@link UserCompp#firstName(String)}
   *   <li>{@link UserCompp#id(Long)}
   *   <li>{@link UserCompp#lastName(String)}
   *   <li>{@link UserCompp#setEmailAddress(String)}
   *   <li>{@link UserCompp#setFirstName(String)}
   *   <li>{@link UserCompp#setId(Long)}
   *   <li>{@link UserCompp#setLastName(String)}
   *   <li>{@link UserCompp#setUsername(String)}
   *   <li>{@link UserCompp#username(String)}
   *   <li>{@link UserCompp#toString()}
   *   <li>{@link UserCompp#getEmailAddress()}
   *   <li>{@link UserCompp#getFirstName()}
   *   <li>{@link UserCompp#getId()}
   *   <li>{@link UserCompp#getLastName()}
   *   <li>{@link UserCompp#getUsername()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserCompp.<init>()",
    "UserCompp UserCompp.emailAddress(String)",
    "UserCompp UserCompp.firstName(String)",
    "String UserCompp.getEmailAddress()",
    "String UserCompp.getFirstName()",
    "Long UserCompp.getId()",
    "String UserCompp.getLastName()",
    "String UserCompp.getUsername()",
    "UserCompp UserCompp.id(Long)",
    "UserCompp UserCompp.lastName(String)",
    "void UserCompp.setEmailAddress(String)",
    "void UserCompp.setFirstName(String)",
    "void UserCompp.setId(Long)",
    "void UserCompp.setLastName(String)",
    "void UserCompp.setUsername(String)",
    "String UserCompp.toString()",
    "UserCompp UserCompp.username(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    UserCompp actualUserCompp = new UserCompp();
    UserCompp actualEmailAddressResult = actualUserCompp.emailAddress("42 Main St");
    UserCompp actualFirstNameResult = actualUserCompp.firstName("Jane");
    UserCompp actualIdResult = actualUserCompp.id(1L);
    UserCompp actualLastNameResult = actualUserCompp.lastName("Doe");
    actualUserCompp.setEmailAddress("42 Main St");
    actualUserCompp.setFirstName("Jane");
    actualUserCompp.setId(1L);
    actualUserCompp.setLastName("Doe");
    actualUserCompp.setUsername("janedoe");
    UserCompp actualUsernameResult = actualUserCompp.username("janedoe");
    String actualToStringResult = actualUserCompp.toString();
    String actualEmailAddress = actualUserCompp.getEmailAddress();
    String actualFirstName = actualUserCompp.getFirstName();
    Long actualId = actualUserCompp.getId();
    String actualLastName = actualUserCompp.getLastName();

    // Assert
    assertEquals("42 Main St", actualEmailAddress);
    assertEquals("Doe", actualLastName);
    assertEquals("Jane", actualFirstName);
    assertEquals(
        "class UserCompp {\n"
            + "    id: 1\n"
            + "    username: janedoe\n"
            + "    firstName: Jane\n"
            + "    lastName: Doe\n"
            + "    emailAddress: 42 Main St\n"
            + "}",
        actualToStringResult);
    assertEquals("janedoe", actualUserCompp.getUsername());
    assertEquals(1L, actualId.longValue());
    assertSame(actualUserCompp, actualEmailAddressResult);
    assertSame(actualUserCompp, actualFirstNameResult);
    assertSame(actualUserCompp, actualIdResult);
    assertSame(actualUserCompp, actualLastNameResult);
    assertSame(actualUserCompp, actualUsernameResult);
  }
}
