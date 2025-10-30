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

class V3UserDetailDiffblueTest {
  /**
   * Test {@link V3UserDetail#addFeaturesItem(Feature)}.
   * <ul>
   *   <li>Given {@link V3UserDetail} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link V3UserDetail#addFeaturesItem(Feature)}
   */
  @Test
  @DisplayName("Test addFeaturesItem(Feature); given V3UserDetail (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V3UserDetail V3UserDetail.addFeaturesItem(Feature)"})
  void testAddFeaturesItem_givenV3UserDetail() {
    // Arrange
    V3UserDetail v3UserDetail = new V3UserDetail();

    // Act and Assert
    assertSame(v3UserDetail, v3UserDetail.addFeaturesItem(new Feature()));
  }

  /**
   * Test {@link V3UserDetail#addFeaturesItem(Feature)}.
   * <ul>
   *   <li>Given {@link V3UserDetail} (default constructor) features {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3UserDetail#addFeaturesItem(Feature)}
   */
  @Test
  @DisplayName("Test addFeaturesItem(Feature); given V3UserDetail (default constructor) features ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V3UserDetail V3UserDetail.addFeaturesItem(Feature)"})
  void testAddFeaturesItem_givenV3UserDetailFeaturesArrayList() {
    // Arrange
    V3UserDetail v3UserDetail = new V3UserDetail();
    v3UserDetail.features(new ArrayList<>());

    // Act and Assert
    assertSame(v3UserDetail, v3UserDetail.addFeaturesItem(new Feature()));
  }

  /**
   * Test {@link V3UserDetail#addRolesItem(String)}.
   * <ul>
   *   <li>Given {@link V3UserDetail} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link V3UserDetail#addRolesItem(String)}
   */
  @Test
  @DisplayName("Test addRolesItem(String); given V3UserDetail (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V3UserDetail V3UserDetail.addRolesItem(String)"})
  void testAddRolesItem_givenV3UserDetail() {
    // Arrange
    V3UserDetail v3UserDetail = new V3UserDetail();

    // Act and Assert
    assertSame(v3UserDetail, v3UserDetail.addRolesItem("Roles Item"));
  }

  /**
   * Test {@link V3UserDetail#addRolesItem(String)}.
   * <ul>
   *   <li>Given {@link V3UserDetail} (default constructor) roles {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3UserDetail#addRolesItem(String)}
   */
  @Test
  @DisplayName("Test addRolesItem(String); given V3UserDetail (default constructor) roles ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V3UserDetail V3UserDetail.addRolesItem(String)"})
  void testAddRolesItem_givenV3UserDetailRolesArrayList() {
    // Arrange
    V3UserDetail v3UserDetail = new V3UserDetail();
    v3UserDetail.roles(new ArrayList<>());

    // Act and Assert
    assertSame(v3UserDetail, v3UserDetail.addRolesItem("Roles Item"));
  }

  /**
   * Test {@link V3UserDetail#equals(Object)}, and {@link V3UserDetail#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V3UserDetail#equals(Object)}
   *   <li>{@link V3UserDetail#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3UserDetail.equals(Object)", "int V3UserDetail.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V3UserDetail v3UserDetail = new V3UserDetail();
    V3UserDetail v3UserDetail2 = new V3UserDetail();

    // Act and Assert
    assertEquals(v3UserDetail, v3UserDetail2);
    int expectedHashCodeResult = v3UserDetail.hashCode();
    assertEquals(expectedHashCodeResult, v3UserDetail2.hashCode());
  }

  /**
   * Test {@link V3UserDetail#equals(Object)}, and {@link V3UserDetail#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V3UserDetail#equals(Object)}
   *   <li>{@link V3UserDetail#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3UserDetail.equals(Object)", "int V3UserDetail.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V3UserDetail v3UserDetail = new V3UserDetail();

    // Act and Assert
    assertEquals(v3UserDetail, v3UserDetail);
    int expectedHashCodeResult = v3UserDetail.hashCode();
    assertEquals(expectedHashCodeResult, v3UserDetail.hashCode());
  }

  /**
   * Test {@link V3UserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3UserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3UserDetail.equals(Object)", "int V3UserDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V3UserDetail v3UserDetail = new V3UserDetail();
    v3UserDetail.addFeaturesItem(new Feature());

    // Act and Assert
    assertNotEquals(v3UserDetail, new V3UserDetail());
  }

  /**
   * Test {@link V3UserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3UserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3UserDetail.equals(Object)", "int V3UserDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V3UserDetail v3UserDetail = new V3UserDetail();
    v3UserDetail.userAttributes(new V2UserAttributes());
    v3UserDetail.addFeaturesItem(new Feature());

    // Act and Assert
    assertNotEquals(v3UserDetail, new V3UserDetail());
  }

  /**
   * Test {@link V3UserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3UserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3UserDetail.equals(Object)", "int V3UserDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V3UserDetail v3UserDetail = new V3UserDetail();
    v3UserDetail.userSystemInfo(new UserSystemInfo());
    v3UserDetail.addFeaturesItem(new Feature());

    // Act and Assert
    assertNotEquals(v3UserDetail, new V3UserDetail());
  }

  /**
   * Test {@link V3UserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3UserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3UserDetail.equals(Object)", "int V3UserDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V3UserDetail v3UserDetail = new V3UserDetail();
    v3UserDetail.addRolesItem("Roles Item");

    // Act and Assert
    assertNotEquals(v3UserDetail, new V3UserDetail());
  }

  /**
   * Test {@link V3UserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3UserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3UserDetail.equals(Object)", "int V3UserDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V3UserDetail v3UserDetail = new V3UserDetail();
    v3UserDetail.avatar(new Avatar());

    // Act and Assert
    assertNotEquals(v3UserDetail, new V3UserDetail());
  }

  /**
   * Test {@link V3UserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3UserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3UserDetail.equals(Object)", "int V3UserDetail.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3UserDetail(), null);
  }

  /**
   * Test {@link V3UserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3UserDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3UserDetail.equals(Object)", "int V3UserDetail.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3UserDetail(), "Different type to V3UserDetail");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V3UserDetail}
   *   <li>{@link V3UserDetail#avatar(Avatar)}
   *   <li>{@link V3UserDetail#features(List)}
   *   <li>{@link V3UserDetail#roles(List)}
   *   <li>{@link V3UserDetail#setAvatar(Avatar)}
   *   <li>{@link V3UserDetail#setFeatures(List)}
   *   <li>{@link V3UserDetail#setRoles(List)}
   *   <li>{@link V3UserDetail#setUserAttributes(V2UserAttributes)}
   *   <li>{@link V3UserDetail#setUserSystemInfo(UserSystemInfo)}
   *   <li>{@link V3UserDetail#userAttributes(V2UserAttributes)}
   *   <li>{@link V3UserDetail#userSystemInfo(UserSystemInfo)}
   *   <li>{@link V3UserDetail#toString()}
   *   <li>{@link V3UserDetail#getAvatar()}
   *   <li>{@link V3UserDetail#getFeatures()}
   *   <li>{@link V3UserDetail#getRoles()}
   *   <li>{@link V3UserDetail#getUserAttributes()}
   *   <li>{@link V3UserDetail#getUserSystemInfo()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V3UserDetail.<init>()", "V3UserDetail V3UserDetail.avatar(Avatar)",
      "V3UserDetail V3UserDetail.features(List)", "Avatar V3UserDetail.getAvatar()", "List V3UserDetail.getFeatures()",
      "List V3UserDetail.getRoles()", "V2UserAttributes V3UserDetail.getUserAttributes()",
      "UserSystemInfo V3UserDetail.getUserSystemInfo()", "V3UserDetail V3UserDetail.roles(List)",
      "void V3UserDetail.setAvatar(Avatar)", "void V3UserDetail.setFeatures(List)", "void V3UserDetail.setRoles(List)",
      "void V3UserDetail.setUserAttributes(V2UserAttributes)", "void V3UserDetail.setUserSystemInfo(UserSystemInfo)",
      "String V3UserDetail.toString()", "V3UserDetail V3UserDetail.userAttributes(V2UserAttributes)",
      "V3UserDetail V3UserDetail.userSystemInfo(UserSystemInfo)"})
  void testGettersAndSetters() {
    // Arrange and Act
    V3UserDetail actualV3UserDetail = new V3UserDetail();
    V3UserDetail actualAvatarResult = actualV3UserDetail.avatar(new Avatar());
    V3UserDetail actualFeaturesResult = actualV3UserDetail.features(new ArrayList<>());
    V3UserDetail actualRolesResult = actualV3UserDetail.roles(new ArrayList<>());
    Avatar avatar = new Avatar();
    actualV3UserDetail.setAvatar(avatar);
    ArrayList<Feature> features = new ArrayList<>();
    actualV3UserDetail.setFeatures(features);
    ArrayList<String> roles = new ArrayList<>();
    actualV3UserDetail.setRoles(roles);
    actualV3UserDetail.setUserAttributes(new V2UserAttributes());
    actualV3UserDetail.setUserSystemInfo(new UserSystemInfo());
    V2UserAttributes userAttributes = new V2UserAttributes();
    V3UserDetail actualUserAttributesResult = actualV3UserDetail.userAttributes(userAttributes);
    UserSystemInfo userSystemInfo = new UserSystemInfo();
    V3UserDetail actualUserSystemInfoResult = actualV3UserDetail.userSystemInfo(userSystemInfo);
    String actualToStringResult = actualV3UserDetail.toString();
    Avatar actualAvatar = actualV3UserDetail.getAvatar();
    List<Feature> actualFeatures = actualV3UserDetail.getFeatures();
    List<String> actualRoles = actualV3UserDetail.getRoles();
    V2UserAttributes actualUserAttributes = actualV3UserDetail.getUserAttributes();
    UserSystemInfo actualUserSystemInfo = actualV3UserDetail.getUserSystemInfo();

    // Assert
    assertEquals(
        "class V3UserDetail {\n" + "    userAttributes: class V2UserAttributes {\n" + "        emailAddress: null\n"
            + "        firstName: null\n" + "        lastName: null\n" + "        userName: null\n"
            + "        displayName: null\n" + "        companyName: null\n" + "        department: null\n"
            + "        division: null\n" + "        title: null\n" + "        workPhoneNumber: null\n"
            + "        mobilePhoneNumber: null\n" + "        twoFactorAuthPhone: null\n" + "        smsNumber: null\n"
            + "        accountType: null\n" + "        location: null\n" + "        recommendedLanguage: null\n"
            + "        jobFunction: null\n" + "        assetClasses: null\n" + "        industries: null\n"
            + "        marketCoverage: null\n" + "        responsibility: null\n" + "        function: null\n"
            + "        instrument: null\n" + "        currentKey: null\n" + "        previousKey: null\n" + "    }\n"
            + "    userSystemInfo: class UserSystemInfo {\n" + "        id: null\n" + "        status: null\n"
            + "        suspended: null\n" + "        suspendedUntil: null\n" + "        suspensionReason: null\n"
            + "        createdDate: null\n" + "        createdBy: null\n" + "        lastUpdatedDate: null\n"
            + "        lastLoginDate: null\n" + "        lastPasswordReset: null\n" + "        deactivatedDate: null\n"
            + "    }\n" + "    features: []\n" + "    roles: []\n" + "    avatar: class Avatar {\n"
            + "        size: null\n" + "        url: null\n" + "    }\n" + "}",
        actualToStringResult);
    assertTrue(actualFeatures.isEmpty());
    assertTrue(actualRoles.isEmpty());
    assertSame(avatar, actualAvatar);
    assertSame(userSystemInfo, actualUserSystemInfo);
    assertSame(userAttributes, actualUserAttributes);
    assertSame(actualV3UserDetail, actualAvatarResult);
    assertSame(actualV3UserDetail, actualFeaturesResult);
    assertSame(actualV3UserDetail, actualRolesResult);
    assertSame(actualV3UserDetail, actualUserAttributesResult);
    assertSame(actualV3UserDetail, actualUserSystemInfoResult);
    assertSame(features, actualFeatures);
    assertSame(roles, actualRoles);
  }
}
