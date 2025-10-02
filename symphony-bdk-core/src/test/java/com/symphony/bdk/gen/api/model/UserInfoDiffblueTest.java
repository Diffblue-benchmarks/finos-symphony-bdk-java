package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserInfoDiffblueTest {
  /**
   * Test {@link UserInfo#equals(Object)}, and {@link UserInfo#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserInfo#equals(Object)}
   *   <li>{@link UserInfo#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserInfo.equals(Object)", "int UserInfo.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserInfo userInfo = new UserInfo();
    UserInfo userInfo2 = new UserInfo();

    // Act and Assert
    assertEquals(userInfo, userInfo2);
    assertEquals(userInfo.hashCode(), userInfo2.hashCode());
  }

  /**
   * Test {@link UserInfo#equals(Object)}, and {@link UserInfo#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserInfo#equals(Object)}
   *   <li>{@link UserInfo#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserInfo.equals(Object)", "int UserInfo.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserInfo userInfo = new UserInfo();

    // Act and Assert
    assertEquals(userInfo, userInfo);
    int expectedHashCodeResult = userInfo.hashCode();
    assertEquals(expectedHashCodeResult, userInfo.hashCode());
  }

  /**
   * Test {@link UserInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserInfo.equals(Object)", "int UserInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserInfo(), 1);
  }

  /**
   * Test {@link UserInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserInfo.equals(Object)", "int UserInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserInfo userInfo = new UserInfo();
    userInfo.user(new UserAttributes());

    // Act and Assert
    assertNotEquals(userInfo, new UserInfo());
  }

  /**
   * Test {@link UserInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserInfo.equals(Object)", "int UserInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserInfo userInfo = new UserInfo();
    userInfo.userSystemInfo(new UserSystemInfo());

    // Act and Assert
    assertNotEquals(userInfo, new UserInfo());
  }

  /**
   * Test {@link UserInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserInfo.equals(Object)", "int UserInfo.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserInfo(), null);
  }

  /**
   * Test {@link UserInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserInfo.equals(Object)", "int UserInfo.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserInfo(), "Different type to UserInfo");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UserInfo}
   *   <li>{@link UserInfo#setUser(UserAttributes)}
   *   <li>{@link UserInfo#setUserSystemInfo(UserSystemInfo)}
   *   <li>{@link UserInfo#user(UserAttributes)}
   *   <li>{@link UserInfo#userSystemInfo(UserSystemInfo)}
   *   <li>{@link UserInfo#toString()}
   *   <li>{@link UserInfo#getUser()}
   *   <li>{@link UserInfo#getUserSystemInfo()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserInfo.<init>()",
    "UserAttributes UserInfo.getUser()",
    "UserSystemInfo UserInfo.getUserSystemInfo()",
    "void UserInfo.setUser(UserAttributes)",
    "void UserInfo.setUserSystemInfo(UserSystemInfo)",
    "String UserInfo.toString()",
    "UserInfo UserInfo.user(UserAttributes)",
    "UserInfo UserInfo.userSystemInfo(UserSystemInfo)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    UserInfo actualUserInfo = new UserInfo();
    actualUserInfo.setUser(new UserAttributes());
    actualUserInfo.setUserSystemInfo(new UserSystemInfo());
    UserAttributes user = new UserAttributes();
    UserInfo actualUserResult = actualUserInfo.user(user);
    UserSystemInfo userSystemInfo = new UserSystemInfo();
    UserInfo actualUserSystemInfoResult = actualUserInfo.userSystemInfo(userSystemInfo);
    String actualToStringResult = actualUserInfo.toString();
    UserAttributes actualUser = actualUserInfo.getUser();
    UserSystemInfo actualUserSystemInfo = actualUserInfo.getUserSystemInfo();

    // Assert
    assertEquals(
        "class UserInfo {\n"
            + "    user: class UserAttributes {\n"
            + "        emailAddress: null\n"
            + "        firstName: null\n"
            + "        lastName: null\n"
            + "        userName: null\n"
            + "        displayName: null\n"
            + "        companyName: null\n"
            + "        department: null\n"
            + "        division: null\n"
            + "        title: null\n"
            + "        workPhoneNumber: null\n"
            + "        mobilePhoneNumber: null\n"
            + "        smsNumber: null\n"
            + "        accountType: null\n"
            + "        location: null\n"
            + "        jobFunction: null\n"
            + "        assetClasses: null\n"
            + "        industries: null\n"
            + "    }\n"
            + "    userSystemInfo: class UserSystemInfo {\n"
            + "        id: null\n"
            + "        status: null\n"
            + "        suspended: null\n"
            + "        suspendedUntil: null\n"
            + "        suspensionReason: null\n"
            + "        createdDate: null\n"
            + "        createdBy: null\n"
            + "        lastUpdatedDate: null\n"
            + "        lastLoginDate: null\n"
            + "        lastPasswordReset: null\n"
            + "        deactivatedDate: null\n"
            + "    }\n"
            + "}",
        actualToStringResult);
    assertSame(user, actualUser);
    assertSame(actualUserInfo, actualUserResult);
    assertSame(actualUserInfo, actualUserSystemInfoResult);
    assertSame(userSystemInfo, actualUserSystemInfo);
  }
}
