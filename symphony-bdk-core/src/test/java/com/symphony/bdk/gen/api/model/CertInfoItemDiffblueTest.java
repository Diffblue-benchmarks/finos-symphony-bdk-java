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

class CertInfoItemDiffblueTest {
  /**
   * Test {@link CertInfoItem#addAttributesItem(NameValuePair)}.
   *
   * <ul>
   *   <li>Given {@link CertInfoItem} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link CertInfoItem#addAttributesItem(NameValuePair)}
   */
  @Test
  @DisplayName("Test addAttributesItem(NameValuePair); given CertInfoItem (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CertInfoItem CertInfoItem.addAttributesItem(NameValuePair)"})
  void testAddAttributesItem_givenCertInfoItem() {
    // Arrange
    CertInfoItem certInfoItem = new CertInfoItem();

    // Act
    CertInfoItem actualAddAttributesItemResult =
        certInfoItem.addAttributesItem(new NameValuePair());

    // Assert
    assertSame(certInfoItem, actualAddAttributesItemResult);
  }

  /**
   * Test {@link CertInfoItem#addAttributesItem(NameValuePair)}.
   *
   * <ul>
   *   <li>Given {@link CertInfoItem} (default constructor) attributes {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CertInfoItem#addAttributesItem(NameValuePair)}
   */
  @Test
  @DisplayName(
      "Test addAttributesItem(NameValuePair); given CertInfoItem (default constructor) attributes ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CertInfoItem CertInfoItem.addAttributesItem(NameValuePair)"})
  void testAddAttributesItem_givenCertInfoItemAttributesArrayList() {
    // Arrange
    CertInfoItem certInfoItem = new CertInfoItem();
    certInfoItem.attributes(new ArrayList<>());

    // Act
    CertInfoItem actualAddAttributesItemResult =
        certInfoItem.addAttributesItem(new NameValuePair());

    // Assert
    assertSame(certInfoItem, actualAddAttributesItemResult);
  }

  /**
   * Test {@link CertInfoItem#equals(Object)}, and {@link CertInfoItem#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CertInfoItem#equals(Object)}
   *   <li>{@link CertInfoItem#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CertInfoItem.equals(Object)", "int CertInfoItem.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CertInfoItem certInfoItem = new CertInfoItem();
    CertInfoItem certInfoItem2 = new CertInfoItem();

    // Act and Assert
    assertEquals(certInfoItem, certInfoItem2);
    assertEquals(certInfoItem.hashCode(), certInfoItem2.hashCode());
  }

  /**
   * Test {@link CertInfoItem#equals(Object)}, and {@link CertInfoItem#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CertInfoItem#equals(Object)}
   *   <li>{@link CertInfoItem#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CertInfoItem.equals(Object)", "int CertInfoItem.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CertInfoItem certInfoItem = new CertInfoItem();

    // Act and Assert
    assertEquals(certInfoItem, certInfoItem);
    int expectedHashCodeResult = certInfoItem.hashCode();
    assertEquals(expectedHashCodeResult, certInfoItem.hashCode());
  }

  /**
   * Test {@link CertInfoItem#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CertInfoItem#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CertInfoItem.equals(Object)", "int CertInfoItem.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    CertInfoItem certInfoItem = new CertInfoItem();
    certInfoItem.addAttributesItem(new NameValuePair());

    // Act and Assert
    assertNotEquals(certInfoItem, new CertInfoItem());
  }

  /**
   * Test {@link CertInfoItem#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CertInfoItem#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CertInfoItem.equals(Object)", "int CertInfoItem.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    CertInfoItem certInfoItem = new CertInfoItem();
    certInfoItem.name("Name");
    certInfoItem.addAttributesItem(new NameValuePair());

    // Act and Assert
    assertNotEquals(certInfoItem, new CertInfoItem());
  }

  /**
   * Test {@link CertInfoItem#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CertInfoItem#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CertInfoItem.equals(Object)", "int CertInfoItem.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CertInfoItem(), null);
  }

  /**
   * Test {@link CertInfoItem#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CertInfoItem#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CertInfoItem.equals(Object)", "int CertInfoItem.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CertInfoItem(), "Different type to CertInfoItem");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link CertInfoItem}
   *   <li>{@link CertInfoItem#attributes(List)}
   *   <li>{@link CertInfoItem#name(String)}
   *   <li>{@link CertInfoItem#setAttributes(List)}
   *   <li>{@link CertInfoItem#setName(String)}
   *   <li>{@link CertInfoItem#toString()}
   *   <li>{@link CertInfoItem#getAttributes()}
   *   <li>{@link CertInfoItem#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void CertInfoItem.<init>()",
    "CertInfoItem CertInfoItem.attributes(List)",
    "List CertInfoItem.getAttributes()",
    "String CertInfoItem.getName()",
    "CertInfoItem CertInfoItem.name(String)",
    "void CertInfoItem.setAttributes(List)",
    "void CertInfoItem.setName(String)",
    "String CertInfoItem.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    CertInfoItem actualCertInfoItem = new CertInfoItem();
    CertInfoItem actualAttributesResult = actualCertInfoItem.attributes(new ArrayList<>());
    CertInfoItem actualNameResult = actualCertInfoItem.name("Name");
    ArrayList<NameValuePair> attributes = new ArrayList<>();
    actualCertInfoItem.setAttributes(attributes);
    actualCertInfoItem.setName("Name");
    String actualToStringResult = actualCertInfoItem.toString();
    List<NameValuePair> actualAttributes = actualCertInfoItem.getAttributes();

    // Assert
    assertEquals("Name", actualCertInfoItem.getName());
    assertEquals(
        "class CertInfoItem {\n    name: Name\n    attributes: []\n}", actualToStringResult);
    assertTrue(actualAttributes.isEmpty());
    assertSame(actualCertInfoItem, actualAttributesResult);
    assertSame(actualCertInfoItem, actualNameResult);
    assertSame(attributes, actualAttributes);
  }
}
