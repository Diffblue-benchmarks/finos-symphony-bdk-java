package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ProductDiffblueTest {
  /**
   * Test {@link Product#equals(Object)}, and {@link Product#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Product#equals(Object)}
   *   <li>{@link Product#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Product.equals(Object)", "int Product.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Product product = new Product();
    Product product2 = new Product();

    // Act and Assert
    assertEquals(product, product2);
    int expectedHashCodeResult = product.hashCode();
    assertEquals(expectedHashCodeResult, product2.hashCode());
  }

  /**
   * Test {@link Product#equals(Object)}, and {@link Product#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Product#equals(Object)}
   *   <li>{@link Product#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Product.equals(Object)", "int Product.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Product product = new Product();

    // Act and Assert
    assertEquals(product, product);
    int expectedHashCodeResult = product.hashCode();
    assertEquals(expectedHashCodeResult, product.hashCode());
  }

  /**
   * Test {@link Product#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Product#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Product.equals(Object)", "int Product.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Product(), 1);
  }

  /**
   * Test {@link Product#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Product#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Product.equals(Object)", "int Product.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Product product = new Product();
    product.appId("42");

    // Act and Assert
    assertNotEquals(product, new Product());
  }

  /**
   * Test {@link Product#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Product#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Product.equals(Object)", "int Product.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Product product = new Product();
    product.name("Name");

    // Act and Assert
    assertNotEquals(product, new Product());
  }

  /**
   * Test {@link Product#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Product#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Product.equals(Object)", "int Product.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    Product product = new Product();
    product.sku("Sku");

    // Act and Assert
    assertNotEquals(product, new Product());
  }

  /**
   * Test {@link Product#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Product#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Product.equals(Object)", "int Product.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    Product product = new Product();
    product.subscribed(true);

    // Act and Assert
    assertNotEquals(product, new Product());
  }

  /**
   * Test {@link Product#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Product#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Product.equals(Object)", "int Product.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    Product product = new Product();
    product.type("Type");

    // Act and Assert
    assertNotEquals(product, new Product());
  }

  /**
   * Test {@link Product#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Product#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Product.equals(Object)", "int Product.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Product(), null);
  }

  /**
   * Test {@link Product#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Product#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Product.equals(Object)", "int Product.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Product(), "Different type to Product");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link Product}
   *   <li>{@link Product#appId(String)}
   *   <li>{@link Product#name(String)}
   *   <li>{@link Product#setAppId(String)}
   *   <li>{@link Product#setName(String)}
   *   <li>{@link Product#setSku(String)}
   *   <li>{@link Product#setSubscribed(Boolean)}
   *   <li>{@link Product#setType(String)}
   *   <li>{@link Product#sku(String)}
   *   <li>{@link Product#subscribed(Boolean)}
   *   <li>{@link Product#type(String)}
   *   <li>{@link Product#toString()}
   *   <li>{@link Product#getAppId()}
   *   <li>{@link Product#getName()}
   *   <li>{@link Product#getSku()}
   *   <li>{@link Product#getSubscribed()}
   *   <li>{@link Product#getType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Product.<init>()",
    "Product Product.appId(String)",
    "String Product.getAppId()",
    "String Product.getName()",
    "String Product.getSku()",
    "Boolean Product.getSubscribed()",
    "String Product.getType()",
    "Product Product.name(String)",
    "void Product.setAppId(String)",
    "void Product.setName(String)",
    "void Product.setSku(String)",
    "void Product.setSubscribed(Boolean)",
    "void Product.setType(String)",
    "Product Product.sku(String)",
    "Product Product.subscribed(Boolean)",
    "String Product.toString()",
    "Product Product.type(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    Product actualProduct = new Product();
    Product actualAppIdResult = actualProduct.appId("42");
    Product actualNameResult = actualProduct.name("Name");
    actualProduct.setAppId("42");
    actualProduct.setName("Name");
    actualProduct.setSku("Sku");
    actualProduct.setSubscribed(true);
    actualProduct.setType("Type");
    Product actualSkuResult = actualProduct.sku("Sku");
    Product actualSubscribedResult = actualProduct.subscribed(true);
    Product actualTypeResult = actualProduct.type("Type");
    String actualToStringResult = actualProduct.toString();
    String actualAppId = actualProduct.getAppId();
    String actualName = actualProduct.getName();
    String actualSku = actualProduct.getSku();
    Boolean actualSubscribed = actualProduct.getSubscribed();

    // Assert
    assertEquals("42", actualAppId);
    assertEquals("Name", actualName);
    assertEquals("Sku", actualSku);
    assertEquals("Type", actualProduct.getType());
    assertEquals(
        "class Product {\n    appId: 42\n    name: Name\n    sku: Sku\n    subscribed: true\n    type: Type\n}",
        actualToStringResult);
    assertTrue(actualSubscribed);
    assertSame(actualProduct, actualAppIdResult);
    assertSame(actualProduct, actualNameResult);
    assertSame(actualProduct, actualSkuResult);
    assertSame(actualProduct, actualSubscribedResult);
    assertSame(actualProduct, actualTypeResult);
  }
}
