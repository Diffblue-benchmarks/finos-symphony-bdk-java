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

class UserAppEntitlementDiffblueTest {
  /**
   * Test {@link UserAppEntitlement#addProductsItem(Product)}.
   *
   * <ul>
   *   <li>Given {@link UserAppEntitlement} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link UserAppEntitlement#addProductsItem(Product)}
   */
  @Test
  @DisplayName("Test addProductsItem(Product); given UserAppEntitlement (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UserAppEntitlement UserAppEntitlement.addProductsItem(Product)"})
  void testAddProductsItem_givenUserAppEntitlement() {
    // Arrange
    UserAppEntitlement userAppEntitlement = new UserAppEntitlement();

    // Act and Assert
    assertSame(userAppEntitlement, userAppEntitlement.addProductsItem(new Product()));
  }

  /**
   * Test {@link UserAppEntitlement#addProductsItem(Product)}.
   *
   * <ul>
   *   <li>Given {@link UserAppEntitlement} (default constructor) products {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link UserAppEntitlement#addProductsItem(Product)}
   */
  @Test
  @DisplayName(
      "Test addProductsItem(Product); given UserAppEntitlement (default constructor) products ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UserAppEntitlement UserAppEntitlement.addProductsItem(Product)"})
  void testAddProductsItem_givenUserAppEntitlementProductsArrayList() {
    // Arrange
    UserAppEntitlement userAppEntitlement = new UserAppEntitlement();
    userAppEntitlement.products(new ArrayList<>());

    // Act and Assert
    assertSame(userAppEntitlement, userAppEntitlement.addProductsItem(new Product()));
  }

  /**
   * Test {@link UserAppEntitlement#equals(Object)}, and {@link UserAppEntitlement#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserAppEntitlement#equals(Object)}
   *   <li>{@link UserAppEntitlement#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserAppEntitlement.equals(Object)",
    "int UserAppEntitlement.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserAppEntitlement userAppEntitlement = new UserAppEntitlement();
    UserAppEntitlement userAppEntitlement2 = new UserAppEntitlement();

    // Act and Assert
    assertEquals(userAppEntitlement, userAppEntitlement2);
    int expectedHashCodeResult = userAppEntitlement.hashCode();
    assertEquals(expectedHashCodeResult, userAppEntitlement2.hashCode());
  }

  /**
   * Test {@link UserAppEntitlement#equals(Object)}, and {@link UserAppEntitlement#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserAppEntitlement#equals(Object)}
   *   <li>{@link UserAppEntitlement#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserAppEntitlement.equals(Object)",
    "int UserAppEntitlement.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserAppEntitlement userAppEntitlement = new UserAppEntitlement();

    // Act and Assert
    assertEquals(userAppEntitlement, userAppEntitlement);
    int expectedHashCodeResult = userAppEntitlement.hashCode();
    assertEquals(expectedHashCodeResult, userAppEntitlement.hashCode());
  }

  /**
   * Test {@link UserAppEntitlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAppEntitlement#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserAppEntitlement.equals(Object)",
    "int UserAppEntitlement.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    UserAppEntitlement userAppEntitlement = new UserAppEntitlement();
    userAppEntitlement.addProductsItem(new Product());

    // Act and Assert
    assertNotEquals(userAppEntitlement, new UserAppEntitlement());
  }

  /**
   * Test {@link UserAppEntitlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAppEntitlement#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserAppEntitlement.equals(Object)",
    "int UserAppEntitlement.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserAppEntitlement userAppEntitlement = new UserAppEntitlement();
    userAppEntitlement.appId("42");
    userAppEntitlement.addProductsItem(new Product());

    // Act and Assert
    assertNotEquals(userAppEntitlement, new UserAppEntitlement());
  }

  /**
   * Test {@link UserAppEntitlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAppEntitlement#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserAppEntitlement.equals(Object)",
    "int UserAppEntitlement.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserAppEntitlement userAppEntitlement = new UserAppEntitlement();
    userAppEntitlement.appName("App Name");
    userAppEntitlement.addProductsItem(new Product());

    // Act and Assert
    assertNotEquals(userAppEntitlement, new UserAppEntitlement());
  }

  /**
   * Test {@link UserAppEntitlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAppEntitlement#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserAppEntitlement.equals(Object)",
    "int UserAppEntitlement.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    UserAppEntitlement userAppEntitlement = new UserAppEntitlement();
    userAppEntitlement.listed(true);
    userAppEntitlement.addProductsItem(new Product());

    // Act and Assert
    assertNotEquals(userAppEntitlement, new UserAppEntitlement());
  }

  /**
   * Test {@link UserAppEntitlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAppEntitlement#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserAppEntitlement.equals(Object)",
    "int UserAppEntitlement.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    UserAppEntitlement userAppEntitlement = new UserAppEntitlement();
    userAppEntitlement.install(true);
    userAppEntitlement.addProductsItem(new Product());

    // Act and Assert
    assertNotEquals(userAppEntitlement, new UserAppEntitlement());
  }

  /**
   * Test {@link UserAppEntitlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAppEntitlement#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserAppEntitlement.equals(Object)",
    "int UserAppEntitlement.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserAppEntitlement(), null);
  }

  /**
   * Test {@link UserAppEntitlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAppEntitlement#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserAppEntitlement.equals(Object)",
    "int UserAppEntitlement.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserAppEntitlement(), "Different type to UserAppEntitlement");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UserAppEntitlement}
   *   <li>{@link UserAppEntitlement#appId(String)}
   *   <li>{@link UserAppEntitlement#appName(String)}
   *   <li>{@link UserAppEntitlement#install(Boolean)}
   *   <li>{@link UserAppEntitlement#listed(Boolean)}
   *   <li>{@link UserAppEntitlement#products(List)}
   *   <li>{@link UserAppEntitlement#setAppId(String)}
   *   <li>{@link UserAppEntitlement#setAppName(String)}
   *   <li>{@link UserAppEntitlement#setInstall(Boolean)}
   *   <li>{@link UserAppEntitlement#setListed(Boolean)}
   *   <li>{@link UserAppEntitlement#setProducts(List)}
   *   <li>{@link UserAppEntitlement#toString()}
   *   <li>{@link UserAppEntitlement#getAppId()}
   *   <li>{@link UserAppEntitlement#getAppName()}
   *   <li>{@link UserAppEntitlement#getInstall()}
   *   <li>{@link UserAppEntitlement#getListed()}
   *   <li>{@link UserAppEntitlement#getProducts()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserAppEntitlement.<init>()",
    "UserAppEntitlement UserAppEntitlement.appId(String)",
    "UserAppEntitlement UserAppEntitlement.appName(String)",
    "String UserAppEntitlement.getAppId()",
    "String UserAppEntitlement.getAppName()",
    "Boolean UserAppEntitlement.getInstall()",
    "Boolean UserAppEntitlement.getListed()",
    "List UserAppEntitlement.getProducts()",
    "UserAppEntitlement UserAppEntitlement.install(Boolean)",
    "UserAppEntitlement UserAppEntitlement.listed(Boolean)",
    "UserAppEntitlement UserAppEntitlement.products(List)",
    "void UserAppEntitlement.setAppId(String)",
    "void UserAppEntitlement.setAppName(String)",
    "void UserAppEntitlement.setInstall(Boolean)",
    "void UserAppEntitlement.setListed(Boolean)",
    "void UserAppEntitlement.setProducts(List)",
    "String UserAppEntitlement.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    UserAppEntitlement actualUserAppEntitlement = new UserAppEntitlement();
    UserAppEntitlement actualAppIdResult = actualUserAppEntitlement.appId("42");
    UserAppEntitlement actualAppNameResult = actualUserAppEntitlement.appName("App Name");
    UserAppEntitlement actualInstallResult = actualUserAppEntitlement.install(true);
    UserAppEntitlement actualListedResult = actualUserAppEntitlement.listed(true);
    UserAppEntitlement actualProductsResult = actualUserAppEntitlement.products(new ArrayList<>());
    actualUserAppEntitlement.setAppId("42");
    actualUserAppEntitlement.setAppName("App Name");
    actualUserAppEntitlement.setInstall(true);
    actualUserAppEntitlement.setListed(true);
    ArrayList<Product> products = new ArrayList<>();
    actualUserAppEntitlement.setProducts(products);
    String actualToStringResult = actualUserAppEntitlement.toString();
    String actualAppId = actualUserAppEntitlement.getAppId();
    String actualAppName = actualUserAppEntitlement.getAppName();
    Boolean actualInstall = actualUserAppEntitlement.getInstall();
    Boolean actualListed = actualUserAppEntitlement.getListed();
    List<Product> actualProducts = actualUserAppEntitlement.getProducts();

    // Assert
    assertEquals("42", actualAppId);
    assertEquals("App Name", actualAppName);
    assertEquals(
        "class UserAppEntitlement {\n"
            + "    appId: 42\n"
            + "    appName: App Name\n"
            + "    listed: true\n"
            + "    install: true\n"
            + "    products: []\n"
            + "}",
        actualToStringResult);
    assertTrue(actualInstall);
    assertTrue(actualListed);
    assertTrue(actualProducts.isEmpty());
    assertSame(actualUserAppEntitlement, actualAppIdResult);
    assertSame(actualUserAppEntitlement, actualAppNameResult);
    assertSame(actualUserAppEntitlement, actualInstallResult);
    assertSame(actualUserAppEntitlement, actualListedResult);
    assertSame(actualUserAppEntitlement, actualProductsResult);
    assertSame(products, actualProducts);
  }
}
