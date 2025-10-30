package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V2UserDetailDiffblueTest {
  /**
   * Test {@link V2UserDetail#addFeaturesItem(Long)}.
   * <ul>
   *   <li>Given {@link V2UserDetail} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link V2UserDetail#addFeaturesItem(Long)}
   */
  @Test
  @DisplayName("Test addFeaturesItem(Long); given V2UserDetail (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V2UserDetail V2UserDetail.addFeaturesItem(Long)"})
  void testAddFeaturesItem_givenV2UserDetail() {
    // Arrange
    V2UserDetail v2UserDetail = new V2UserDetail();

    // Act and Assert
    assertSame(v2UserDetail, v2UserDetail.addFeaturesItem(1L));
  }

  /**
   * Test {@link V2UserDetail#addFeaturesItem(Long)}.
   * <ul>
   *   <li>Given {@link V2UserDetail} (default constructor) features {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2UserDetail#addFeaturesItem(Long)}
   */
  @Test
  @DisplayName("Test addFeaturesItem(Long); given V2UserDetail (default constructor) features ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V2UserDetail V2UserDetail.addFeaturesItem(Long)"})
  void testAddFeaturesItem_givenV2UserDetailFeaturesArrayList() {
    // Arrange
    V2UserDetail v2UserDetail = new V2UserDetail();
    v2UserDetail.features(new ArrayList<>());

    // Act and Assert
    assertSame(v2UserDetail, v2UserDetail.addFeaturesItem(1L));
  }

  /**
   * Test {@link V2UserDetail#addAppsItem(Long)}.
   * <ul>
   *   <li>Given {@link V2UserDetail} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link V2UserDetail#addAppsItem(Long)}
   */
  @Test
  @DisplayName("Test addAppsItem(Long); given V2UserDetail (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V2UserDetail V2UserDetail.addAppsItem(Long)"})
  void testAddAppsItem_givenV2UserDetail() {
    // Arrange
    V2UserDetail v2UserDetail = new V2UserDetail();

    // Act and Assert
    assertSame(v2UserDetail, v2UserDetail.addAppsItem(1L));
  }

  /**
   * Test {@link V2UserDetail#addAppsItem(Long)}.
   * <ul>
   *   <li>Given {@link V2UserDetail} (default constructor) apps {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2UserDetail#addAppsItem(Long)}
   */
  @Test
  @DisplayName("Test addAppsItem(Long); given V2UserDetail (default constructor) apps ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V2UserDetail V2UserDetail.addAppsItem(Long)"})
  void testAddAppsItem_givenV2UserDetailAppsArrayList() {
    // Arrange
    V2UserDetail v2UserDetail = new V2UserDetail();
    v2UserDetail.apps(new ArrayList<>());

    // Act and Assert
    assertSame(v2UserDetail, v2UserDetail.addAppsItem(1L));
  }

  /**
   * Test {@link V2UserDetail#addGroupsItem(Long)}.
   * <ul>
   *   <li>Given {@link V2UserDetail} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link V2UserDetail#addGroupsItem(Long)}
   */
  @Test
  @DisplayName("Test addGroupsItem(Long); given V2UserDetail (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V2UserDetail V2UserDetail.addGroupsItem(Long)"})
  void testAddGroupsItem_givenV2UserDetail() {
    // Arrange
    V2UserDetail v2UserDetail = new V2UserDetail();

    // Act and Assert
    assertSame(v2UserDetail, v2UserDetail.addGroupsItem(1L));
  }

  /**
   * Test {@link V2UserDetail#addGroupsItem(Long)}.
   * <ul>
   *   <li>Given {@link V2UserDetail} (default constructor) groups {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2UserDetail#addGroupsItem(Long)}
   */
  @Test
  @DisplayName("Test addGroupsItem(Long); given V2UserDetail (default constructor) groups ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V2UserDetail V2UserDetail.addGroupsItem(Long)"})
  void testAddGroupsItem_givenV2UserDetailGroupsArrayList() {
    // Arrange
    V2UserDetail v2UserDetail = new V2UserDetail();
    v2UserDetail.groups(new ArrayList<>());

    // Act and Assert
    assertSame(v2UserDetail, v2UserDetail.addGroupsItem(1L));
  }

  /**
   * Test {@link V2UserDetail#addRolesItem(String)}.
   * <ul>
   *   <li>Given {@link V2UserDetail} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link V2UserDetail#addRolesItem(String)}
   */
  @Test
  @DisplayName("Test addRolesItem(String); given V2UserDetail (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V2UserDetail V2UserDetail.addRolesItem(String)"})
  void testAddRolesItem_givenV2UserDetail() {
    // Arrange
    V2UserDetail v2UserDetail = new V2UserDetail();

    // Act and Assert
    assertSame(v2UserDetail, v2UserDetail.addRolesItem("Roles Item"));
  }

  /**
   * Test {@link V2UserDetail#addRolesItem(String)}.
   * <ul>
   *   <li>Given {@link V2UserDetail} (default constructor) roles {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2UserDetail#addRolesItem(String)}
   */
  @Test
  @DisplayName("Test addRolesItem(String); given V2UserDetail (default constructor) roles ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V2UserDetail V2UserDetail.addRolesItem(String)"})
  void testAddRolesItem_givenV2UserDetailRolesArrayList() {
    // Arrange
    V2UserDetail v2UserDetail = new V2UserDetail();
    v2UserDetail.roles(new ArrayList<>());

    // Act and Assert
    assertSame(v2UserDetail, v2UserDetail.addRolesItem("Roles Item"));
  }

  /**
   * Test {@link V2UserDetail#addDisclaimersItem(Long)}.
   * <ul>
   *   <li>Given {@link V2UserDetail} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link V2UserDetail#addDisclaimersItem(Long)}
   */
  @Test
  @DisplayName("Test addDisclaimersItem(Long); given V2UserDetail (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V2UserDetail V2UserDetail.addDisclaimersItem(Long)"})
  void testAddDisclaimersItem_givenV2UserDetail() {
    // Arrange
    V2UserDetail v2UserDetail = new V2UserDetail();

    // Act and Assert
    assertSame(v2UserDetail, v2UserDetail.addDisclaimersItem(1L));
  }

  /**
   * Test {@link V2UserDetail#addDisclaimersItem(Long)}.
   * <ul>
   *   <li>Given {@link V2UserDetail} (default constructor) disclaimers {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2UserDetail#addDisclaimersItem(Long)}
   */
  @Test
  @DisplayName("Test addDisclaimersItem(Long); given V2UserDetail (default constructor) disclaimers ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V2UserDetail V2UserDetail.addDisclaimersItem(Long)"})
  void testAddDisclaimersItem_givenV2UserDetailDisclaimersArrayList() {
    // Arrange
    V2UserDetail v2UserDetail = new V2UserDetail();
    v2UserDetail.disclaimers(new ArrayList<>());

    // Act and Assert
    assertSame(v2UserDetail, v2UserDetail.addDisclaimersItem(1L));
  }

  /**
   * Test {@link V2UserDetail#equals(Object)}, and {@link V2UserDetail#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V2UserDetail#equals(Object)}
   *   <li>{@link V2UserDetail#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2UserDetail.equals(Object)", "int V2UserDetail.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2UserDetail v2UserDetail = new V2UserDetail();
    V2UserDetail v2UserDetail2 = new V2UserDetail();

    // Act and Assert
    assertEquals(v2UserDetail, v2UserDetail2);
    int expectedHashCodeResult = v2UserDetail.hashCode();
    assertEquals(expectedHashCodeResult, v2UserDetail2.hashCode());
  }

  /**
   * Test {@link V2UserDetail#equals(Object)}, and {@link V2UserDetail#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V2UserDetail#equals(Object)}
   *   <li>{@link V2UserDetail#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2UserDetail.equals(Object)", "int V2UserDetail.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2UserDetail v2UserDetail = new V2UserDetail();

    // Act and Assert
    assertEquals(v2UserDetail, v2UserDetail);
    int expectedHashCodeResult = v2UserDetail.hashCode();
    assertEquals(expectedHashCodeResult, v2UserDetail.hashCode());
  }

  /**
   * Test {@link V2UserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2UserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2UserDetail.equals(Object)", "int V2UserDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V2UserDetail v2UserDetail = new V2UserDetail();
    v2UserDetail.addFeaturesItem(1L);

    // Act and Assert
    assertNotEquals(v2UserDetail, new V2UserDetail());
  }

  /**
   * Test {@link V2UserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2UserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2UserDetail.equals(Object)", "int V2UserDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V2UserDetail v2UserDetail = new V2UserDetail();
    v2UserDetail.userAttributes(new V2UserAttributes());
    v2UserDetail.addFeaturesItem(1L);

    // Act and Assert
    assertNotEquals(v2UserDetail, new V2UserDetail());
  }

  /**
   * Test {@link V2UserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2UserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2UserDetail.equals(Object)", "int V2UserDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V2UserDetail v2UserDetail = new V2UserDetail();
    v2UserDetail.userSystemInfo(new UserSystemInfo());
    v2UserDetail.addFeaturesItem(1L);

    // Act and Assert
    assertNotEquals(v2UserDetail, new V2UserDetail());
  }

  /**
   * Test {@link V2UserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2UserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2UserDetail.equals(Object)", "int V2UserDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V2UserDetail v2UserDetail = new V2UserDetail();
    v2UserDetail.addAppsItem(1L);

    // Act and Assert
    assertNotEquals(v2UserDetail, new V2UserDetail());
  }

  /**
   * Test {@link V2UserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2UserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2UserDetail.equals(Object)", "int V2UserDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V2UserDetail v2UserDetail = new V2UserDetail();
    v2UserDetail.addGroupsItem(1L);

    // Act and Assert
    assertNotEquals(v2UserDetail, new V2UserDetail());
  }

  /**
   * Test {@link V2UserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2UserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2UserDetail.equals(Object)", "int V2UserDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    V2UserDetail v2UserDetail = new V2UserDetail();
    v2UserDetail.addRolesItem("Roles Item");

    // Act and Assert
    assertNotEquals(v2UserDetail, new V2UserDetail());
  }

  /**
   * Test {@link V2UserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2UserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2UserDetail.equals(Object)", "int V2UserDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    V2UserDetail v2UserDetail = new V2UserDetail();
    v2UserDetail.addDisclaimersItem(1L);

    // Act and Assert
    assertNotEquals(v2UserDetail, new V2UserDetail());
  }

  /**
   * Test {@link V2UserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2UserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2UserDetail.equals(Object)", "int V2UserDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    V2UserDetail v2UserDetail = new V2UserDetail();
    v2UserDetail.avatar(new Avatar());

    // Act and Assert
    assertNotEquals(v2UserDetail, new V2UserDetail());
  }

  /**
   * Test {@link V2UserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2UserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2UserDetail.equals(Object)", "int V2UserDetail.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2UserDetail(), null);
  }

  /**
   * Test {@link V2UserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2UserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2UserDetail.equals(Object)", "int V2UserDetail.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2UserDetail(), "Different type to V2UserDetail");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V2UserDetail}
   *   <li>{@link V2UserDetail#apps(List)}
   *   <li>{@link V2UserDetail#avatar(Avatar)}
   *   <li>{@link V2UserDetail#disclaimers(List)}
   *   <li>{@link V2UserDetail#features(List)}
   *   <li>{@link V2UserDetail#groups(List)}
   *   <li>{@link V2UserDetail#roles(List)}
   *   <li>{@link V2UserDetail#setApps(List)}
   *   <li>{@link V2UserDetail#setAvatar(Avatar)}
   *   <li>{@link V2UserDetail#setDisclaimers(List)}
   *   <li>{@link V2UserDetail#setFeatures(List)}
   *   <li>{@link V2UserDetail#setGroups(List)}
   *   <li>{@link V2UserDetail#setRoles(List)}
   *   <li>{@link V2UserDetail#setUserAttributes(V2UserAttributes)}
   *   <li>{@link V2UserDetail#setUserSystemInfo(UserSystemInfo)}
   *   <li>{@link V2UserDetail#userAttributes(V2UserAttributes)}
   *   <li>{@link V2UserDetail#userSystemInfo(UserSystemInfo)}
   *   <li>{@link V2UserDetail#toString()}
   *   <li>{@link V2UserDetail#getApps()}
   *   <li>{@link V2UserDetail#getAvatar()}
   *   <li>{@link V2UserDetail#getDisclaimers()}
   *   <li>{@link V2UserDetail#getFeatures()}
   *   <li>{@link V2UserDetail#getGroups()}
   *   <li>{@link V2UserDetail#getRoles()}
   *   <li>{@link V2UserDetail#getUserAttributes()}
   *   <li>{@link V2UserDetail#getUserSystemInfo()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V2UserDetail.<init>()", "V2UserDetail V2UserDetail.apps(List)",
      "V2UserDetail V2UserDetail.avatar(Avatar)", "V2UserDetail V2UserDetail.disclaimers(List)",
      "V2UserDetail V2UserDetail.features(List)", "List V2UserDetail.getApps()", "Avatar V2UserDetail.getAvatar()",
      "List V2UserDetail.getDisclaimers()", "List V2UserDetail.getFeatures()", "List V2UserDetail.getGroups()",
      "List V2UserDetail.getRoles()", "V2UserAttributes V2UserDetail.getUserAttributes()",
      "UserSystemInfo V2UserDetail.getUserSystemInfo()", "V2UserDetail V2UserDetail.groups(List)",
      "V2UserDetail V2UserDetail.roles(List)", "void V2UserDetail.setApps(List)", "void V2UserDetail.setAvatar(Avatar)",
      "void V2UserDetail.setDisclaimers(List)", "void V2UserDetail.setFeatures(List)",
      "void V2UserDetail.setGroups(List)", "void V2UserDetail.setRoles(List)",
      "void V2UserDetail.setUserAttributes(V2UserAttributes)", "void V2UserDetail.setUserSystemInfo(UserSystemInfo)",
      "String V2UserDetail.toString()", "V2UserDetail V2UserDetail.userAttributes(V2UserAttributes)",
      "V2UserDetail V2UserDetail.userSystemInfo(UserSystemInfo)"})
  void testGettersAndSetters() {
    // Arrange and Act
    V2UserDetail actualV2UserDetail = new V2UserDetail();
    V2UserDetail actualAppsResult = actualV2UserDetail.apps(new ArrayList<>());
    V2UserDetail actualAvatarResult = actualV2UserDetail.avatar(new Avatar());
    V2UserDetail actualDisclaimersResult = actualV2UserDetail.disclaimers(new ArrayList<>());
    V2UserDetail actualFeaturesResult = actualV2UserDetail.features(new ArrayList<>());
    V2UserDetail actualGroupsResult = actualV2UserDetail.groups(new ArrayList<>());
    V2UserDetail actualRolesResult = actualV2UserDetail.roles(new ArrayList<>());
    ArrayList<Long> apps = new ArrayList<>();
    actualV2UserDetail.setApps(apps);
    Avatar avatar = new Avatar();
    actualV2UserDetail.setAvatar(avatar);
    ArrayList<Long> disclaimers = new ArrayList<>();
    actualV2UserDetail.setDisclaimers(disclaimers);
    ArrayList<Long> features = new ArrayList<>();
    actualV2UserDetail.setFeatures(features);
    ArrayList<Long> groups = new ArrayList<>();
    actualV2UserDetail.setGroups(groups);
    ArrayList<String> roles = new ArrayList<>();
    actualV2UserDetail.setRoles(roles);
    actualV2UserDetail.setUserAttributes(new V2UserAttributes());
    actualV2UserDetail.setUserSystemInfo(new UserSystemInfo());
    V2UserAttributes userAttributes = new V2UserAttributes();
    V2UserDetail actualUserAttributesResult = actualV2UserDetail.userAttributes(userAttributes);
    UserSystemInfo userSystemInfo = new UserSystemInfo();
    V2UserDetail actualUserSystemInfoResult = actualV2UserDetail.userSystemInfo(userSystemInfo);
    String actualToStringResult = actualV2UserDetail.toString();
    List<Long> actualApps = actualV2UserDetail.getApps();
    Avatar actualAvatar = actualV2UserDetail.getAvatar();
    List<Long> actualDisclaimers = actualV2UserDetail.getDisclaimers();
    List<Long> actualFeatures = actualV2UserDetail.getFeatures();
    List<Long> actualGroups = actualV2UserDetail.getGroups();
    List<String> actualRoles = actualV2UserDetail.getRoles();
    V2UserAttributes actualUserAttributes = actualV2UserDetail.getUserAttributes();
    UserSystemInfo actualUserSystemInfo = actualV2UserDetail.getUserSystemInfo();

    // Assert
    assertEquals("class V2UserDetail {\n" + "    userAttributes: class V2UserAttributes {\n"
        + "        emailAddress: null\n" + "        firstName: null\n" + "        lastName: null\n"
        + "        userName: null\n" + "        displayName: null\n" + "        companyName: null\n"
        + "        department: null\n" + "        division: null\n" + "        title: null\n"
        + "        workPhoneNumber: null\n" + "        mobilePhoneNumber: null\n" + "        twoFactorAuthPhone: null\n"
        + "        smsNumber: null\n" + "        accountType: null\n" + "        location: null\n"
        + "        recommendedLanguage: null\n" + "        jobFunction: null\n" + "        assetClasses: null\n"
        + "        industries: null\n" + "        marketCoverage: null\n" + "        responsibility: null\n"
        + "        function: null\n" + "        instrument: null\n" + "        currentKey: null\n"
        + "        previousKey: null\n" + "    }\n" + "    userSystemInfo: class UserSystemInfo {\n"
        + "        id: null\n" + "        status: null\n" + "        suspended: null\n"
        + "        suspendedUntil: null\n" + "        suspensionReason: null\n" + "        createdDate: null\n"
        + "        createdBy: null\n" + "        lastUpdatedDate: null\n" + "        lastLoginDate: null\n"
        + "        lastPasswordReset: null\n" + "        deactivatedDate: null\n" + "    }\n" + "    features: []\n"
        + "    apps: []\n" + "    groups: []\n" + "    roles: []\n" + "    disclaimers: []\n"
        + "    avatar: class Avatar {\n" + "        size: null\n" + "        url: null\n" + "    }\n" + "}",
        actualToStringResult);
    assertTrue(actualApps.isEmpty());
    assertTrue(actualDisclaimers.isEmpty());
    assertTrue(actualFeatures.isEmpty());
    assertTrue(actualGroups.isEmpty());
    assertTrue(actualRoles.isEmpty());
    assertSame(avatar, actualAvatar);
    assertSame(userSystemInfo, actualUserSystemInfo);
    assertSame(userAttributes, actualUserAttributes);
    assertSame(actualV2UserDetail, actualAppsResult);
    assertSame(actualV2UserDetail, actualAvatarResult);
    assertSame(actualV2UserDetail, actualDisclaimersResult);
    assertSame(actualV2UserDetail, actualFeaturesResult);
    assertSame(actualV2UserDetail, actualGroupsResult);
    assertSame(actualV2UserDetail, actualRolesResult);
    assertSame(actualV2UserDetail, actualUserAttributesResult);
    assertSame(actualV2UserDetail, actualUserSystemInfoResult);
    assertSame(apps, actualApps);
    assertSame(disclaimers, actualDisclaimers);
    assertSame(features, actualFeatures);
    assertSame(groups, actualGroups);
    assertSame(roles, actualRoles);
  }
}
