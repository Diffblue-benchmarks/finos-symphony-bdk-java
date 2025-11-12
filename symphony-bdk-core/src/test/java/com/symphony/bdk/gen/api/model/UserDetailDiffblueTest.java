package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserDetailDiffblueTest {
  /**
   * Test {@link UserDetail#addFeaturesItem(Long)}.
   *
   * <ul>
   *   <li>Given {@link UserDetail} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link UserDetail#addFeaturesItem(Long)}
   */
  @Test
  @DisplayName("Test addFeaturesItem(Long); given UserDetail (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UserDetail UserDetail.addFeaturesItem(Long)"})
  void testAddFeaturesItem_givenUserDetail() {
    // Arrange
    UserDetail userDetail = new UserDetail();

    // Act
    UserDetail actualAddFeaturesItemResult = userDetail.addFeaturesItem(1L);

    // Assert
    assertSame(userDetail, actualAddFeaturesItemResult);
  }

  /**
   * Test {@link UserDetail#addFeaturesItem(Long)}.
   *
   * <ul>
   *   <li>Given {@link UserDetail} (default constructor) features {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link UserDetail#addFeaturesItem(Long)}
   */
  @Test
  @DisplayName(
      "Test addFeaturesItem(Long); given UserDetail (default constructor) features ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UserDetail UserDetail.addFeaturesItem(Long)"})
  void testAddFeaturesItem_givenUserDetailFeaturesArrayList() {
    // Arrange
    UserDetail userDetail = new UserDetail();
    userDetail.features(new ArrayList<>());

    // Act
    UserDetail actualAddFeaturesItemResult = userDetail.addFeaturesItem(1L);

    // Assert
    assertSame(userDetail, actualAddFeaturesItemResult);
  }

  /**
   * Test {@link UserDetail#addAppsItem(Long)}.
   *
   * <ul>
   *   <li>Given {@link UserDetail} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link UserDetail#addAppsItem(Long)}
   */
  @Test
  @DisplayName("Test addAppsItem(Long); given UserDetail (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UserDetail UserDetail.addAppsItem(Long)"})
  void testAddAppsItem_givenUserDetail() {
    // Arrange
    UserDetail userDetail = new UserDetail();

    // Act
    UserDetail actualAddAppsItemResult = userDetail.addAppsItem(1L);

    // Assert
    assertSame(userDetail, actualAddAppsItemResult);
  }

  /**
   * Test {@link UserDetail#addAppsItem(Long)}.
   *
   * <ul>
   *   <li>Given {@link UserDetail} (default constructor) apps {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link UserDetail#addAppsItem(Long)}
   */
  @Test
  @DisplayName("Test addAppsItem(Long); given UserDetail (default constructor) apps ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UserDetail UserDetail.addAppsItem(Long)"})
  void testAddAppsItem_givenUserDetailAppsArrayList() {
    // Arrange
    UserDetail userDetail = new UserDetail();
    userDetail.apps(new ArrayList<>());

    // Act
    UserDetail actualAddAppsItemResult = userDetail.addAppsItem(1L);

    // Assert
    assertSame(userDetail, actualAddAppsItemResult);
  }

  /**
   * Test {@link UserDetail#addGroupsItem(Long)}.
   *
   * <ul>
   *   <li>Given {@link UserDetail} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link UserDetail#addGroupsItem(Long)}
   */
  @Test
  @DisplayName("Test addGroupsItem(Long); given UserDetail (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UserDetail UserDetail.addGroupsItem(Long)"})
  void testAddGroupsItem_givenUserDetail() {
    // Arrange
    UserDetail userDetail = new UserDetail();

    // Act
    UserDetail actualAddGroupsItemResult = userDetail.addGroupsItem(1L);

    // Assert
    assertSame(userDetail, actualAddGroupsItemResult);
  }

  /**
   * Test {@link UserDetail#addGroupsItem(Long)}.
   *
   * <ul>
   *   <li>Given {@link UserDetail} (default constructor) groups {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link UserDetail#addGroupsItem(Long)}
   */
  @Test
  @DisplayName(
      "Test addGroupsItem(Long); given UserDetail (default constructor) groups ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UserDetail UserDetail.addGroupsItem(Long)"})
  void testAddGroupsItem_givenUserDetailGroupsArrayList() {
    // Arrange
    UserDetail userDetail = new UserDetail();
    userDetail.groups(new ArrayList<>());

    // Act
    UserDetail actualAddGroupsItemResult = userDetail.addGroupsItem(1L);

    // Assert
    assertSame(userDetail, actualAddGroupsItemResult);
  }

  /**
   * Test {@link UserDetail#addRolesItem(String)}.
   *
   * <ul>
   *   <li>Given {@link UserDetail} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link UserDetail#addRolesItem(String)}
   */
  @Test
  @DisplayName("Test addRolesItem(String); given UserDetail (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UserDetail UserDetail.addRolesItem(String)"})
  void testAddRolesItem_givenUserDetail() {
    // Arrange
    UserDetail userDetail = new UserDetail();

    // Act
    UserDetail actualAddRolesItemResult = userDetail.addRolesItem("Roles Item");

    // Assert
    assertSame(userDetail, actualAddRolesItemResult);
  }

  /**
   * Test {@link UserDetail#addRolesItem(String)}.
   *
   * <ul>
   *   <li>Given {@link UserDetail} (default constructor) roles {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link UserDetail#addRolesItem(String)}
   */
  @Test
  @DisplayName(
      "Test addRolesItem(String); given UserDetail (default constructor) roles ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UserDetail UserDetail.addRolesItem(String)"})
  void testAddRolesItem_givenUserDetailRolesArrayList() {
    // Arrange
    UserDetail userDetail = new UserDetail();
    userDetail.roles(new ArrayList<>());

    // Act
    UserDetail actualAddRolesItemResult = userDetail.addRolesItem("Roles Item");

    // Assert
    assertSame(userDetail, actualAddRolesItemResult);
  }

  /**
   * Test {@link UserDetail#addDisclaimersItem(Long)}.
   *
   * <ul>
   *   <li>Given {@link UserDetail} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link UserDetail#addDisclaimersItem(Long)}
   */
  @Test
  @DisplayName("Test addDisclaimersItem(Long); given UserDetail (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UserDetail UserDetail.addDisclaimersItem(Long)"})
  void testAddDisclaimersItem_givenUserDetail() {
    // Arrange
    UserDetail userDetail = new UserDetail();

    // Act
    UserDetail actualAddDisclaimersItemResult = userDetail.addDisclaimersItem(1L);

    // Assert
    assertSame(userDetail, actualAddDisclaimersItemResult);
  }

  /**
   * Test {@link UserDetail#addDisclaimersItem(Long)}.
   *
   * <ul>
   *   <li>Given {@link UserDetail} (default constructor) disclaimers {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link UserDetail#addDisclaimersItem(Long)}
   */
  @Test
  @DisplayName(
      "Test addDisclaimersItem(Long); given UserDetail (default constructor) disclaimers ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UserDetail UserDetail.addDisclaimersItem(Long)"})
  void testAddDisclaimersItem_givenUserDetailDisclaimersArrayList() {
    // Arrange
    UserDetail userDetail = new UserDetail();
    userDetail.disclaimers(new ArrayList<>());

    // Act
    UserDetail actualAddDisclaimersItemResult = userDetail.addDisclaimersItem(1L);

    // Assert
    assertSame(userDetail, actualAddDisclaimersItemResult);
  }

  /**
   * Test {@link UserDetail#equals(Object)}, and {@link UserDetail#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserDetail#equals(Object)}
   *   <li>{@link UserDetail#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserDetail.equals(Object)", "int UserDetail.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserDetail userDetail = new UserDetail();
    UserDetail userDetail2 = new UserDetail();

    // Act and Assert
    assertEquals(userDetail, userDetail2);
    assertEquals(userDetail.hashCode(), userDetail2.hashCode());
  }

  /**
   * Test {@link UserDetail#equals(Object)}, and {@link UserDetail#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserDetail#equals(Object)}
   *   <li>{@link UserDetail#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserDetail.equals(Object)", "int UserDetail.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserDetail userDetail = new UserDetail();

    // Act and Assert
    assertEquals(userDetail, userDetail);
    int expectedHashCodeResult = userDetail.hashCode();
    assertEquals(expectedHashCodeResult, userDetail.hashCode());
  }

  /**
   * Test {@link UserDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserDetail.equals(Object)", "int UserDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    UserDetail userDetail = new UserDetail();
    userDetail.addFeaturesItem(1L);

    // Act and Assert
    assertNotEquals(userDetail, new UserDetail());
  }

  /**
   * Test {@link UserDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserDetail.equals(Object)", "int UserDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserDetail userDetail = new UserDetail();
    userDetail.userAttributes(new UserAttributes());
    userDetail.addFeaturesItem(1L);

    // Act and Assert
    assertNotEquals(userDetail, new UserDetail());
  }

  /**
   * Test {@link UserDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserDetail.equals(Object)", "int UserDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserDetail userDetail = new UserDetail();
    userDetail.userSystemInfo(new UserSystemInfo());
    userDetail.addFeaturesItem(1L);

    // Act and Assert
    assertNotEquals(userDetail, new UserDetail());
  }

  /**
   * Test {@link UserDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserDetail.equals(Object)", "int UserDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    UserDetail userDetail = new UserDetail();
    userDetail.addAppsItem(1L);

    // Act and Assert
    assertNotEquals(userDetail, new UserDetail());
  }

  /**
   * Test {@link UserDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserDetail.equals(Object)", "int UserDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    UserDetail userDetail = new UserDetail();
    userDetail.addGroupsItem(1L);

    // Act and Assert
    assertNotEquals(userDetail, new UserDetail());
  }

  /**
   * Test {@link UserDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserDetail.equals(Object)", "int UserDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    UserDetail userDetail = new UserDetail();
    userDetail.addRolesItem("Roles Item");

    // Act and Assert
    assertNotEquals(userDetail, new UserDetail());
  }

  /**
   * Test {@link UserDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserDetail.equals(Object)", "int UserDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    UserDetail userDetail = new UserDetail();
    userDetail.addDisclaimersItem(1L);

    // Act and Assert
    assertNotEquals(userDetail, new UserDetail());
  }

  /**
   * Test {@link UserDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserDetail.equals(Object)", "int UserDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    UserDetail userDetail = new UserDetail();
    userDetail.avatar(new Avatar());

    // Act and Assert
    assertNotEquals(userDetail, new UserDetail());
  }

  /**
   * Test {@link UserDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserDetail.equals(Object)", "int UserDetail.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserDetail(), null);
  }

  /**
   * Test {@link UserDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserDetail.equals(Object)", "int UserDetail.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserDetail(), "Different type to UserDetail");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UserDetail}
   *   <li>{@link UserDetail#apps(List)}
   *   <li>{@link UserDetail#avatar(Avatar)}
   *   <li>{@link UserDetail#disclaimers(List)}
   *   <li>{@link UserDetail#features(List)}
   *   <li>{@link UserDetail#groups(List)}
   *   <li>{@link UserDetail#roles(List)}
   *   <li>{@link UserDetail#setApps(List)}
   *   <li>{@link UserDetail#setAvatar(Avatar)}
   *   <li>{@link UserDetail#setDisclaimers(List)}
   *   <li>{@link UserDetail#setFeatures(List)}
   *   <li>{@link UserDetail#setGroups(List)}
   *   <li>{@link UserDetail#setRoles(List)}
   *   <li>{@link UserDetail#setUserAttributes(UserAttributes)}
   *   <li>{@link UserDetail#setUserSystemInfo(UserSystemInfo)}
   *   <li>{@link UserDetail#userAttributes(UserAttributes)}
   *   <li>{@link UserDetail#userSystemInfo(UserSystemInfo)}
   *   <li>{@link UserDetail#toString()}
   *   <li>{@link UserDetail#getApps()}
   *   <li>{@link UserDetail#getAvatar()}
   *   <li>{@link UserDetail#getDisclaimers()}
   *   <li>{@link UserDetail#getFeatures()}
   *   <li>{@link UserDetail#getGroups()}
   *   <li>{@link UserDetail#getRoles()}
   *   <li>{@link UserDetail#getUserAttributes()}
   *   <li>{@link UserDetail#getUserSystemInfo()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserDetail.<init>()",
    "UserDetail UserDetail.apps(List)",
    "UserDetail UserDetail.avatar(Avatar)",
    "UserDetail UserDetail.disclaimers(List)",
    "UserDetail UserDetail.features(List)",
    "List UserDetail.getApps()",
    "Avatar UserDetail.getAvatar()",
    "List UserDetail.getDisclaimers()",
    "List UserDetail.getFeatures()",
    "List UserDetail.getGroups()",
    "List UserDetail.getRoles()",
    "UserAttributes UserDetail.getUserAttributes()",
    "UserSystemInfo UserDetail.getUserSystemInfo()",
    "UserDetail UserDetail.groups(List)",
    "UserDetail UserDetail.roles(List)",
    "void UserDetail.setApps(List)",
    "void UserDetail.setAvatar(Avatar)",
    "void UserDetail.setDisclaimers(List)",
    "void UserDetail.setFeatures(List)",
    "void UserDetail.setGroups(List)",
    "void UserDetail.setRoles(List)",
    "void UserDetail.setUserAttributes(UserAttributes)",
    "void UserDetail.setUserSystemInfo(UserSystemInfo)",
    "String UserDetail.toString()",
    "UserDetail UserDetail.userAttributes(UserAttributes)",
    "UserDetail UserDetail.userSystemInfo(UserSystemInfo)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    UserDetail actualUserDetail = new UserDetail();
    UserDetail actualAppsResult = actualUserDetail.apps(new ArrayList<>());
    UserDetail actualAvatarResult = actualUserDetail.avatar(new Avatar());
    UserDetail actualDisclaimersResult = actualUserDetail.disclaimers(new ArrayList<>());
    UserDetail actualFeaturesResult = actualUserDetail.features(new ArrayList<>());
    UserDetail actualGroupsResult = actualUserDetail.groups(new ArrayList<>());
    UserDetail actualRolesResult = actualUserDetail.roles(new ArrayList<>());
    ArrayList<Long> apps = new ArrayList<>();
    actualUserDetail.setApps(apps);
    Avatar avatar = new Avatar();
    actualUserDetail.setAvatar(avatar);
    ArrayList<Long> disclaimers = new ArrayList<>();
    actualUserDetail.setDisclaimers(disclaimers);
    ArrayList<Long> features = new ArrayList<>();
    actualUserDetail.setFeatures(features);
    ArrayList<Long> groups = new ArrayList<>();
    actualUserDetail.setGroups(groups);
    ArrayList<String> roles = new ArrayList<>();
    actualUserDetail.setRoles(roles);
    actualUserDetail.setUserAttributes(new UserAttributes());
    actualUserDetail.setUserSystemInfo(new UserSystemInfo());
    UserAttributes userAttributes = new UserAttributes();
    UserDetail actualUserAttributesResult = actualUserDetail.userAttributes(userAttributes);
    UserSystemInfo userSystemInfo = new UserSystemInfo();
    UserDetail actualUserSystemInfoResult = actualUserDetail.userSystemInfo(userSystemInfo);
    String actualToStringResult = actualUserDetail.toString();
    List<Long> actualApps = actualUserDetail.getApps();
    Avatar actualAvatar = actualUserDetail.getAvatar();
    List<Long> actualDisclaimers = actualUserDetail.getDisclaimers();
    List<Long> actualFeatures = actualUserDetail.getFeatures();
    List<Long> actualGroups = actualUserDetail.getGroups();
    List<String> actualRoles = actualUserDetail.getRoles();
    UserAttributes actualUserAttributes = actualUserDetail.getUserAttributes();
    UserSystemInfo actualUserSystemInfo = actualUserDetail.getUserSystemInfo();

    // Assert
    assertEquals(
        "class UserDetail {\n"
            + "    userAttributes: class UserAttributes {\n"
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
            + "    features: []\n"
            + "    apps: []\n"
            + "    groups: []\n"
            + "    roles: []\n"
            + "    disclaimers: []\n"
            + "    avatar: class Avatar {\n"
            + "        size: null\n"
            + "        url: null\n"
            + "    }\n"
            + "}",
        actualToStringResult);
    assertTrue(actualApps.isEmpty());
    assertTrue(actualDisclaimers.isEmpty());
    assertTrue(actualFeatures.isEmpty());
    assertTrue(actualGroups.isEmpty());
    assertTrue(actualRoles.isEmpty());
    assertSame(avatar, actualAvatar);
    assertSame(userAttributes, actualUserAttributes);
    assertSame(actualUserDetail, actualAppsResult);
    assertSame(actualUserDetail, actualAvatarResult);
    assertSame(actualUserDetail, actualDisclaimersResult);
    assertSame(actualUserDetail, actualFeaturesResult);
    assertSame(actualUserDetail, actualGroupsResult);
    assertSame(actualUserDetail, actualRolesResult);
    assertSame(actualUserDetail, actualUserAttributesResult);
    assertSame(actualUserDetail, actualUserSystemInfoResult);
    assertSame(userSystemInfo, actualUserSystemInfo);
    assertSame(apps, actualApps);
    assertSame(disclaimers, actualDisclaimers);
    assertSame(features, actualFeatures);
    assertSame(groups, actualGroups);
    assertSame(roles, actualRoles);
  }
}
