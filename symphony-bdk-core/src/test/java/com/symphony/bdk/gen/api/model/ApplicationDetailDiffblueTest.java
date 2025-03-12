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

class ApplicationDetailDiffblueTest {
  /**
   * Test {@link ApplicationDetail#addPermissionsItem(String)}.
   * <ul>
   *   <li>Given {@link ApplicationDetail} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link ApplicationDetail#addPermissionsItem(String)}
   */
  @Test
  @DisplayName("Test addPermissionsItem(String); given ApplicationDetail (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApplicationDetail ApplicationDetail.addPermissionsItem(String)"})
  void testAddPermissionsItem_givenApplicationDetail() {
    // Arrange
    ApplicationDetail applicationDetail = new ApplicationDetail();

    // Act and Assert
    assertSame(applicationDetail, applicationDetail.addPermissionsItem("Permissions Item"));
  }

  /**
   * Test {@link ApplicationDetail#addPermissionsItem(String)}.
   * <ul>
   *   <li>Given {@link ApplicationDetail} (default constructor) permissions {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApplicationDetail#addPermissionsItem(String)}
   */
  @Test
  @DisplayName("Test addPermissionsItem(String); given ApplicationDetail (default constructor) permissions ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApplicationDetail ApplicationDetail.addPermissionsItem(String)"})
  void testAddPermissionsItem_givenApplicationDetailPermissionsArrayList() {
    // Arrange
    ApplicationDetail applicationDetail = new ApplicationDetail();
    applicationDetail.permissions(new ArrayList<>());

    // Act and Assert
    assertSame(applicationDetail, applicationDetail.addPermissionsItem("Permissions Item"));
  }

  /**
   * Test {@link ApplicationDetail#addPropertiesItem(AppProperty)}.
   * <ul>
   *   <li>Given {@link ApplicationDetail} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link ApplicationDetail#addPropertiesItem(AppProperty)}
   */
  @Test
  @DisplayName("Test addPropertiesItem(AppProperty); given ApplicationDetail (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApplicationDetail ApplicationDetail.addPropertiesItem(AppProperty)"})
  void testAddPropertiesItem_givenApplicationDetail() {
    // Arrange
    ApplicationDetail applicationDetail = new ApplicationDetail();

    // Act and Assert
    assertSame(applicationDetail, applicationDetail.addPropertiesItem(new AppProperty()));
  }

  /**
   * Test {@link ApplicationDetail#addPropertiesItem(AppProperty)}.
   * <ul>
   *   <li>Given {@link ApplicationDetail} (default constructor) properties {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApplicationDetail#addPropertiesItem(AppProperty)}
   */
  @Test
  @DisplayName("Test addPropertiesItem(AppProperty); given ApplicationDetail (default constructor) properties ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApplicationDetail ApplicationDetail.addPropertiesItem(AppProperty)"})
  void testAddPropertiesItem_givenApplicationDetailPropertiesArrayList() {
    // Arrange
    ApplicationDetail applicationDetail = new ApplicationDetail();
    applicationDetail.properties(new ArrayList<>());

    // Act and Assert
    assertSame(applicationDetail, applicationDetail.addPropertiesItem(new AppProperty()));
  }

  /**
   * Test {@link ApplicationDetail#equals(Object)}, and {@link ApplicationDetail#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ApplicationDetail#equals(Object)}
   *   <li>{@link ApplicationDetail#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApplicationDetail.equals(Object)", "int ApplicationDetail.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ApplicationDetail applicationDetail = new ApplicationDetail();
    ApplicationDetail applicationDetail2 = new ApplicationDetail();

    // Act and Assert
    assertEquals(applicationDetail, applicationDetail2);
    int expectedHashCodeResult = applicationDetail.hashCode();
    assertEquals(expectedHashCodeResult, applicationDetail2.hashCode());
  }

  /**
   * Test {@link ApplicationDetail#equals(Object)}, and {@link ApplicationDetail#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ApplicationDetail#equals(Object)}
   *   <li>{@link ApplicationDetail#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApplicationDetail.equals(Object)", "int ApplicationDetail.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ApplicationDetail applicationDetail = new ApplicationDetail();

    // Act and Assert
    assertEquals(applicationDetail, applicationDetail);
    int expectedHashCodeResult = applicationDetail.hashCode();
    assertEquals(expectedHashCodeResult, applicationDetail.hashCode());
  }

  /**
   * Test {@link ApplicationDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApplicationDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApplicationDetail.equals(Object)", "int ApplicationDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ApplicationDetail applicationDetail = new ApplicationDetail();
    applicationDetail.addPermissionsItem("Permissions Item");

    // Act and Assert
    assertNotEquals(applicationDetail, new ApplicationDetail());
  }

  /**
   * Test {@link ApplicationDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApplicationDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApplicationDetail.equals(Object)", "int ApplicationDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ApplicationDetail applicationDetail = new ApplicationDetail();
    applicationDetail.applicationInfo(new ApplicationInfo());
    applicationDetail.addPermissionsItem("Permissions Item");

    // Act and Assert
    assertNotEquals(applicationDetail, new ApplicationDetail());
  }

  /**
   * Test {@link ApplicationDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApplicationDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApplicationDetail.equals(Object)", "int ApplicationDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ApplicationDetail applicationDetail = new ApplicationDetail();
    applicationDetail.iconUrl("https://example.org/example");
    applicationDetail.addPermissionsItem("Permissions Item");

    // Act and Assert
    assertNotEquals(applicationDetail, new ApplicationDetail());
  }

  /**
   * Test {@link ApplicationDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApplicationDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApplicationDetail.equals(Object)", "int ApplicationDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    ApplicationDetail applicationDetail = new ApplicationDetail();
    applicationDetail.description("The characteristics of someone or something");
    applicationDetail.addPermissionsItem("Permissions Item");

    // Act and Assert
    assertNotEquals(applicationDetail, new ApplicationDetail());
  }

  /**
   * Test {@link ApplicationDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApplicationDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApplicationDetail.equals(Object)", "int ApplicationDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    ApplicationDetail applicationDetail = new ApplicationDetail();
    applicationDetail.allowOrigins("Allow Origins");
    applicationDetail.addPermissionsItem("Permissions Item");

    // Act and Assert
    assertNotEquals(applicationDetail, new ApplicationDetail());
  }

  /**
   * Test {@link ApplicationDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApplicationDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApplicationDetail.equals(Object)", "int ApplicationDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    ApplicationDetail applicationDetail = new ApplicationDetail();
    applicationDetail.addPropertiesItem(new AppProperty());

    // Act and Assert
    assertNotEquals(applicationDetail, new ApplicationDetail());
  }

  /**
   * Test {@link ApplicationDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApplicationDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApplicationDetail.equals(Object)", "int ApplicationDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    ApplicationDetail applicationDetail = new ApplicationDetail();
    applicationDetail.cert("Cert");
    applicationDetail.addPropertiesItem(new AppProperty());

    // Act and Assert
    assertNotEquals(applicationDetail, new ApplicationDetail());
  }

  /**
   * Test {@link ApplicationDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApplicationDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApplicationDetail.equals(Object)", "int ApplicationDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    ApplicationDetail applicationDetail = new ApplicationDetail();
    applicationDetail.authenticationKeys(new AppAuthenticationKeys());
    applicationDetail.addPropertiesItem(new AppProperty());

    // Act and Assert
    assertNotEquals(applicationDetail, new ApplicationDetail());
  }

  /**
   * Test {@link ApplicationDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApplicationDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApplicationDetail.equals(Object)", "int ApplicationDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    ApplicationDetail applicationDetail = new ApplicationDetail();
    applicationDetail.notification(new AppNotification());
    applicationDetail.addPropertiesItem(new AppProperty());

    // Act and Assert
    assertNotEquals(applicationDetail, new ApplicationDetail());
  }

  /**
   * Test {@link ApplicationDetail#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApplicationDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApplicationDetail.equals(Object)", "int ApplicationDetail.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ApplicationDetail(), null);
  }

  /**
   * Test {@link ApplicationDetail#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApplicationDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApplicationDetail.equals(Object)", "int ApplicationDetail.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ApplicationDetail(), "Different type to ApplicationDetail");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link ApplicationDetail}
   *   <li>{@link ApplicationDetail#allowOrigins(String)}
   *   <li>{@link ApplicationDetail#applicationInfo(ApplicationInfo)}
   *   <li>{@link ApplicationDetail#authenticationKeys(AppAuthenticationKeys)}
   *   <li>{@link ApplicationDetail#cert(String)}
   *   <li>{@link ApplicationDetail#description(String)}
   *   <li>{@link ApplicationDetail#iconUrl(String)}
   *   <li>{@link ApplicationDetail#notification(AppNotification)}
   *   <li>{@link ApplicationDetail#permissions(List)}
   *   <li>{@link ApplicationDetail#properties(List)}
   *   <li>{@link ApplicationDetail#setAllowOrigins(String)}
   *   <li>{@link ApplicationDetail#setApplicationInfo(ApplicationInfo)}
   *   <li>{@link ApplicationDetail#setAuthenticationKeys(AppAuthenticationKeys)}
   *   <li>{@link ApplicationDetail#setCert(String)}
   *   <li>{@link ApplicationDetail#setDescription(String)}
   *   <li>{@link ApplicationDetail#setIconUrl(String)}
   *   <li>{@link ApplicationDetail#setNotification(AppNotification)}
   *   <li>{@link ApplicationDetail#setPermissions(List)}
   *   <li>{@link ApplicationDetail#setProperties(List)}
   *   <li>{@link ApplicationDetail#toString()}
   *   <li>{@link ApplicationDetail#getAllowOrigins()}
   *   <li>{@link ApplicationDetail#getApplicationInfo()}
   *   <li>{@link ApplicationDetail#getAuthenticationKeys()}
   *   <li>{@link ApplicationDetail#getCert()}
   *   <li>{@link ApplicationDetail#getDescription()}
   *   <li>{@link ApplicationDetail#getIconUrl()}
   *   <li>{@link ApplicationDetail#getNotification()}
   *   <li>{@link ApplicationDetail#getPermissions()}
   *   <li>{@link ApplicationDetail#getProperties()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ApplicationDetail.<init>()", "ApplicationDetail ApplicationDetail.allowOrigins(String)",
      "ApplicationDetail ApplicationDetail.applicationInfo(ApplicationInfo)",
      "ApplicationDetail ApplicationDetail.authenticationKeys(AppAuthenticationKeys)",
      "ApplicationDetail ApplicationDetail.cert(String)", "ApplicationDetail ApplicationDetail.description(String)",
      "String ApplicationDetail.getAllowOrigins()", "ApplicationInfo ApplicationDetail.getApplicationInfo()",
      "AppAuthenticationKeys ApplicationDetail.getAuthenticationKeys()", "String ApplicationDetail.getCert()",
      "String ApplicationDetail.getDescription()", "String ApplicationDetail.getIconUrl()",
      "AppNotification ApplicationDetail.getNotification()", "List ApplicationDetail.getPermissions()",
      "List ApplicationDetail.getProperties()", "ApplicationDetail ApplicationDetail.iconUrl(String)",
      "ApplicationDetail ApplicationDetail.notification(AppNotification)",
      "ApplicationDetail ApplicationDetail.permissions(List)", "ApplicationDetail ApplicationDetail.properties(List)",
      "void ApplicationDetail.setAllowOrigins(String)", "void ApplicationDetail.setApplicationInfo(ApplicationInfo)",
      "void ApplicationDetail.setAuthenticationKeys(AppAuthenticationKeys)", "void ApplicationDetail.setCert(String)",
      "void ApplicationDetail.setDescription(String)", "void ApplicationDetail.setIconUrl(String)",
      "void ApplicationDetail.setNotification(AppNotification)", "void ApplicationDetail.setPermissions(List)",
      "void ApplicationDetail.setProperties(List)", "String ApplicationDetail.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    ApplicationDetail actualApplicationDetail = new ApplicationDetail();
    ApplicationDetail actualAllowOriginsResult = actualApplicationDetail.allowOrigins("Allow Origins");
    ApplicationDetail actualApplicationInfoResult = actualApplicationDetail.applicationInfo(new ApplicationInfo());
    ApplicationDetail actualAuthenticationKeysResult = actualApplicationDetail
        .authenticationKeys(new AppAuthenticationKeys());
    ApplicationDetail actualCertResult = actualApplicationDetail.cert("Cert");
    ApplicationDetail actualDescriptionResult = actualApplicationDetail
        .description("The characteristics of someone or something");
    ApplicationDetail actualIconUrlResult = actualApplicationDetail.iconUrl("https://example.org/example");
    ApplicationDetail actualNotificationResult = actualApplicationDetail.notification(new AppNotification());
    ApplicationDetail actualPermissionsResult = actualApplicationDetail.permissions(new ArrayList<>());
    ApplicationDetail actualPropertiesResult = actualApplicationDetail.properties(new ArrayList<>());
    actualApplicationDetail.setAllowOrigins("Allow Origins");
    ApplicationInfo applicationInfo = new ApplicationInfo();
    actualApplicationDetail.setApplicationInfo(applicationInfo);
    AppAuthenticationKeys authenticationKeys = new AppAuthenticationKeys();
    actualApplicationDetail.setAuthenticationKeys(authenticationKeys);
    actualApplicationDetail.setCert("Cert");
    actualApplicationDetail.setDescription("The characteristics of someone or something");
    actualApplicationDetail.setIconUrl("https://example.org/example");
    AppNotification notification = new AppNotification();
    actualApplicationDetail.setNotification(notification);
    ArrayList<String> permissions = new ArrayList<>();
    actualApplicationDetail.setPermissions(permissions);
    ArrayList<AppProperty> properties = new ArrayList<>();
    actualApplicationDetail.setProperties(properties);
    String actualToStringResult = actualApplicationDetail.toString();
    String actualAllowOrigins = actualApplicationDetail.getAllowOrigins();
    ApplicationInfo actualApplicationInfo = actualApplicationDetail.getApplicationInfo();
    AppAuthenticationKeys actualAuthenticationKeys = actualApplicationDetail.getAuthenticationKeys();
    String actualCert = actualApplicationDetail.getCert();
    String actualDescription = actualApplicationDetail.getDescription();
    String actualIconUrl = actualApplicationDetail.getIconUrl();
    AppNotification actualNotification = actualApplicationDetail.getNotification();
    List<String> actualPermissions = actualApplicationDetail.getPermissions();
    List<AppProperty> actualProperties = actualApplicationDetail.getProperties();

    // Assert
    assertEquals("Allow Origins", actualAllowOrigins);
    assertEquals("Cert", actualCert);
    assertEquals("The characteristics of someone or something", actualDescription);
    assertEquals("class ApplicationDetail {\n" + "    applicationInfo: class ApplicationInfo {\n"
        + "        appId: null\n" + "        name: null\n" + "        appUrl: null\n" + "        domain: null\n"
        + "        publisher: null\n" + "    }\n" + "    iconUrl: https://example.org/example\n"
        + "    description: The characteristics of someone or something\n" + "    allowOrigins: Allow Origins\n"
        + "    permissions: []\n" + "    cert: Cert\n" + "    authenticationKeys: class AppAuthenticationKeys {\n"
        + "        current: null\n" + "        previous: null\n" + "    }\n"
        + "    notification: class AppNotification {\n" + "        url: null\n" + "        apiKey: null\n" + "    }\n"
        + "    properties: []\n" + "}", actualToStringResult);
    assertEquals("https://example.org/example", actualIconUrl);
    assertTrue(actualPermissions.isEmpty());
    assertTrue(actualProperties.isEmpty());
    assertSame(authenticationKeys, actualAuthenticationKeys);
    assertSame(notification, actualNotification);
    assertSame(actualApplicationDetail, actualAllowOriginsResult);
    assertSame(actualApplicationDetail, actualApplicationInfoResult);
    assertSame(actualApplicationDetail, actualAuthenticationKeysResult);
    assertSame(actualApplicationDetail, actualCertResult);
    assertSame(actualApplicationDetail, actualDescriptionResult);
    assertSame(actualApplicationDetail, actualIconUrlResult);
    assertSame(actualApplicationDetail, actualNotificationResult);
    assertSame(actualApplicationDetail, actualPermissionsResult);
    assertSame(actualApplicationDetail, actualPropertiesResult);
    assertSame(applicationInfo, actualApplicationInfo);
    assertSame(permissions, actualPermissions);
    assertSame(properties, actualProperties);
  }
}
