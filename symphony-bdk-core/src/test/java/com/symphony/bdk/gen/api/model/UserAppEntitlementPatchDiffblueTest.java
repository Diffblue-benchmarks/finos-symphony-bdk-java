package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.UserAppEntitlementPatch.InstallEnum;
import com.symphony.bdk.gen.api.model.UserAppEntitlementPatch.ListedEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserAppEntitlementPatchDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserAppEntitlementPatch#appId(String)}
   *   <li>{@link UserAppEntitlementPatch#install(InstallEnum)}
   *   <li>{@link UserAppEntitlementPatch#listed(ListedEnum)}
   *   <li>{@link UserAppEntitlementPatch#product(Product)}
   *   <li>{@link UserAppEntitlementPatch#setAppId(String)}
   *   <li>{@link UserAppEntitlementPatch#setInstall(InstallEnum)}
   *   <li>{@link UserAppEntitlementPatch#setListed(ListedEnum)}
   *   <li>{@link UserAppEntitlementPatch#setProduct(Product)}
   *   <li>{@link UserAppEntitlementPatch#toString()}
   *   <li>{@link UserAppEntitlementPatch#getAppId()}
   *   <li>{@link UserAppEntitlementPatch#getInstall()}
   *   <li>{@link UserAppEntitlementPatch#getListed()}
   *   <li>{@link UserAppEntitlementPatch#getProduct()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UserAppEntitlementPatch UserAppEntitlementPatch.appId(String)",
    "String UserAppEntitlementPatch.getAppId()",
    "InstallEnum UserAppEntitlementPatch.getInstall()",
    "ListedEnum UserAppEntitlementPatch.getListed()",
    "Product UserAppEntitlementPatch.getProduct()",
    "UserAppEntitlementPatch UserAppEntitlementPatch.install(InstallEnum)",
    "UserAppEntitlementPatch UserAppEntitlementPatch.listed(ListedEnum)",
    "UserAppEntitlementPatch UserAppEntitlementPatch.product(Product)",
    "void UserAppEntitlementPatch.setAppId(String)",
    "void UserAppEntitlementPatch.setInstall(InstallEnum)",
    "void UserAppEntitlementPatch.setListed(ListedEnum)",
    "void UserAppEntitlementPatch.setProduct(Product)",
    "String UserAppEntitlementPatch.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    UserAppEntitlementPatch userAppEntitlementPatch = new UserAppEntitlementPatch();

    // Act
    UserAppEntitlementPatch actualAppIdResult = userAppEntitlementPatch.appId("42");
    UserAppEntitlementPatch actualInstallResult = userAppEntitlementPatch.install(InstallEnum.TRUE);
    UserAppEntitlementPatch actualListedResult = userAppEntitlementPatch.listed(ListedEnum.TRUE);
    UserAppEntitlementPatch actualProductResult = userAppEntitlementPatch.product(new Product());
    userAppEntitlementPatch.setAppId("42");
    userAppEntitlementPatch.setInstall(InstallEnum.TRUE);
    userAppEntitlementPatch.setListed(ListedEnum.TRUE);
    Product product = new Product();
    userAppEntitlementPatch.setProduct(product);
    String actualToStringResult = userAppEntitlementPatch.toString();
    String actualAppId = userAppEntitlementPatch.getAppId();
    InstallEnum actualInstall = userAppEntitlementPatch.getInstall();
    ListedEnum actualListed = userAppEntitlementPatch.getListed();

    // Assert
    assertEquals("42", actualAppId);
    assertEquals(
        "class UserAppEntitlementPatch {\n"
            + "    appId: 42\n"
            + "    listed: TRUE\n"
            + "    install: TRUE\n"
            + "    product: class Product {\n"
            + "        appId: null\n"
            + "        name: null\n"
            + "        sku: null\n"
            + "        subscribed: null\n"
            + "        type: null\n"
            + "    }\n"
            + "}",
        actualToStringResult);
    assertEquals(InstallEnum.TRUE, actualInstall);
    assertEquals(ListedEnum.TRUE, actualListed);
    assertSame(product, userAppEntitlementPatch.getProduct());
    assertSame(userAppEntitlementPatch, actualAppIdResult);
    assertSame(userAppEntitlementPatch, actualInstallResult);
    assertSame(userAppEntitlementPatch, actualListedResult);
    assertSame(userAppEntitlementPatch, actualProductResult);
  }

  /**
   * Test {@link UserAppEntitlementPatch#equals(Object)}, and {@link
   * UserAppEntitlementPatch#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserAppEntitlementPatch#equals(Object)}
   *   <li>{@link UserAppEntitlementPatch#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserAppEntitlementPatch.equals(Object)",
    "int UserAppEntitlementPatch.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserAppEntitlementPatch userAppEntitlementPatch = new UserAppEntitlementPatch();
    UserAppEntitlementPatch userAppEntitlementPatch2 = new UserAppEntitlementPatch();

    // Act and Assert
    assertEquals(userAppEntitlementPatch, userAppEntitlementPatch2);
    assertEquals(userAppEntitlementPatch.hashCode(), userAppEntitlementPatch2.hashCode());
  }

  /**
   * Test {@link UserAppEntitlementPatch#equals(Object)}, and {@link
   * UserAppEntitlementPatch#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserAppEntitlementPatch#equals(Object)}
   *   <li>{@link UserAppEntitlementPatch#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserAppEntitlementPatch.equals(Object)",
    "int UserAppEntitlementPatch.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserAppEntitlementPatch userAppEntitlementPatch = new UserAppEntitlementPatch();

    // Act and Assert
    assertEquals(userAppEntitlementPatch, userAppEntitlementPatch);
    int expectedHashCodeResult = userAppEntitlementPatch.hashCode();
    assertEquals(expectedHashCodeResult, userAppEntitlementPatch.hashCode());
  }

  /**
   * Test {@link UserAppEntitlementPatch#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAppEntitlementPatch#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserAppEntitlementPatch.equals(Object)",
    "int UserAppEntitlementPatch.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserAppEntitlementPatch(), 1);
  }

  /**
   * Test {@link UserAppEntitlementPatch#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAppEntitlementPatch#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserAppEntitlementPatch.equals(Object)",
    "int UserAppEntitlementPatch.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserAppEntitlementPatch userAppEntitlementPatch = new UserAppEntitlementPatch();
    userAppEntitlementPatch.appId("42");

    // Act and Assert
    assertNotEquals(userAppEntitlementPatch, new UserAppEntitlementPatch());
  }

  /**
   * Test {@link UserAppEntitlementPatch#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAppEntitlementPatch#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserAppEntitlementPatch.equals(Object)",
    "int UserAppEntitlementPatch.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserAppEntitlementPatch userAppEntitlementPatch = new UserAppEntitlementPatch();
    userAppEntitlementPatch.listed(ListedEnum.TRUE);

    // Act and Assert
    assertNotEquals(userAppEntitlementPatch, new UserAppEntitlementPatch());
  }

  /**
   * Test {@link UserAppEntitlementPatch#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAppEntitlementPatch#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserAppEntitlementPatch.equals(Object)",
    "int UserAppEntitlementPatch.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    UserAppEntitlementPatch userAppEntitlementPatch = new UserAppEntitlementPatch();
    userAppEntitlementPatch.install(InstallEnum.TRUE);

    // Act and Assert
    assertNotEquals(userAppEntitlementPatch, new UserAppEntitlementPatch());
  }

  /**
   * Test {@link UserAppEntitlementPatch#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAppEntitlementPatch#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserAppEntitlementPatch.equals(Object)",
    "int UserAppEntitlementPatch.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    UserAppEntitlementPatch userAppEntitlementPatch = new UserAppEntitlementPatch();
    userAppEntitlementPatch.product(new Product());

    // Act and Assert
    assertNotEquals(userAppEntitlementPatch, new UserAppEntitlementPatch());
  }

  /**
   * Test {@link UserAppEntitlementPatch#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAppEntitlementPatch#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserAppEntitlementPatch.equals(Object)",
    "int UserAppEntitlementPatch.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserAppEntitlementPatch(), null);
  }

  /**
   * Test {@link UserAppEntitlementPatch#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAppEntitlementPatch#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserAppEntitlementPatch.equals(Object)",
    "int UserAppEntitlementPatch.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserAppEntitlementPatch(), "Different type to UserAppEntitlementPatch");
  }

  /**
   * Test InstallEnum {@link InstallEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link InstallEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test InstallEnum fromValue(String); when '42'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"InstallEnum InstallEnum.fromValue(String)"})
  void testInstallEnumFromValue_when42_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(InstallEnum.fromValue("42"));
  }

  /**
   * Test InstallEnum {@link InstallEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code TRUE}.
   *   <li>Then return {@code TRUE}.
   * </ul>
   *
   * <p>Method under test: {@link InstallEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test InstallEnum fromValue(String); when 'TRUE'; then return 'TRUE'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"InstallEnum InstallEnum.fromValue(String)"})
  void testInstallEnumFromValue_whenTrue_thenReturnTrue() {
    // Arrange, Act and Assert
    assertEquals(InstallEnum.TRUE, InstallEnum.fromValue("TRUE"));
  }

  /**
   * Test InstallEnum getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link InstallEnum#toString()}
   *   <li>{@link InstallEnum#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test InstallEnum getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String InstallEnum.getValue()", "String InstallEnum.toString()"})
  void testInstallEnumGettersAndSetters() {
    // Arrange
    InstallEnum valueOfResult = InstallEnum.valueOf("TRUE");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("TRUE", valueOfResult.getValue());
    assertEquals("TRUE", actualToStringResult);
  }

  /**
   * Test ListedEnum {@link ListedEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ListedEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test ListedEnum fromValue(String); when '42'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ListedEnum ListedEnum.fromValue(String)"})
  void testListedEnumFromValue_when42_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ListedEnum.fromValue("42"));
  }

  /**
   * Test ListedEnum {@link ListedEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code TRUE}.
   *   <li>Then return {@code TRUE}.
   * </ul>
   *
   * <p>Method under test: {@link ListedEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test ListedEnum fromValue(String); when 'TRUE'; then return 'TRUE'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ListedEnum ListedEnum.fromValue(String)"})
  void testListedEnumFromValue_whenTrue_thenReturnTrue() {
    // Arrange, Act and Assert
    assertEquals(ListedEnum.TRUE, ListedEnum.fromValue("TRUE"));
  }

  /**
   * Test ListedEnum getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ListedEnum#toString()}
   *   <li>{@link ListedEnum#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test ListedEnum getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ListedEnum.getValue()", "String ListedEnum.toString()"})
  void testListedEnumGettersAndSetters() {
    // Arrange
    ListedEnum valueOfResult = ListedEnum.valueOf("TRUE");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("TRUE", valueOfResult.getValue());
    assertEquals("TRUE", actualToStringResult);
  }

  /**
   * Test new {@link UserAppEntitlementPatch} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link UserAppEntitlementPatch}
   */
  @Test
  @DisplayName("Test new UserAppEntitlementPatch (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void UserAppEntitlementPatch.<init>()"})
  void testNewUserAppEntitlementPatch() {
    // Arrange and Act
    UserAppEntitlementPatch actualUserAppEntitlementPatch = new UserAppEntitlementPatch();

    // Assert
    assertNull(actualUserAppEntitlementPatch.getProduct());
    assertNull(actualUserAppEntitlementPatch.getAppId());
    assertEquals(InstallEnum.KEEP, actualUserAppEntitlementPatch.getInstall());
    assertEquals(ListedEnum.KEEP, actualUserAppEntitlementPatch.getListed());
  }
}
