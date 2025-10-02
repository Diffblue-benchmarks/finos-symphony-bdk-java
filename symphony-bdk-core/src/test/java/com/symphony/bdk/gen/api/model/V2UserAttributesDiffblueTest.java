package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.V2UserAttributes.AccountTypeEnum;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V2UserAttributesDiffblueTest {
  /**
   * Test AccountTypeEnum {@link AccountTypeEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AccountTypeEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test AccountTypeEnum fromValue(String); when '42'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AccountTypeEnum AccountTypeEnum.fromValue(String)"})
  void testAccountTypeEnumFromValue_when42_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(AccountTypeEnum.fromValue("42"));
  }

  /**
   * Test AccountTypeEnum {@link AccountTypeEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code NORMAL}.
   *   <li>Then return {@code NORMAL}.
   * </ul>
   *
   * <p>Method under test: {@link AccountTypeEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test AccountTypeEnum fromValue(String); when 'NORMAL'; then return 'NORMAL'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AccountTypeEnum AccountTypeEnum.fromValue(String)"})
  void testAccountTypeEnumFromValue_whenNormal_thenReturnNormal() {
    // Arrange, Act and Assert
    assertEquals(AccountTypeEnum.NORMAL, AccountTypeEnum.fromValue("NORMAL"));
  }

  /**
   * Test AccountTypeEnum getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AccountTypeEnum#toString()}
   *   <li>{@link AccountTypeEnum#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test AccountTypeEnum getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String AccountTypeEnum.getValue()", "String AccountTypeEnum.toString()"})
  void testAccountTypeEnumGettersAndSetters() {
    // Arrange
    AccountTypeEnum valueOfResult = AccountTypeEnum.valueOf("NORMAL");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("NORMAL", valueOfResult.getValue());
    assertEquals("NORMAL", actualToStringResult);
  }

  /**
   * Test {@link V2UserAttributes#addAssetClassesItem(String)}.
   *
   * <ul>
   *   <li>Given {@link V2UserAttributes} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#addAssetClassesItem(String)}
   */
  @Test
  @DisplayName("Test addAssetClassesItem(String); given V2UserAttributes (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserAttributes V2UserAttributes.addAssetClassesItem(String)"})
  void testAddAssetClassesItem_givenV2UserAttributes() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();

    // Act
    V2UserAttributes actualAddAssetClassesItemResult =
        v2UserAttributes.addAssetClassesItem("Asset Classes Item");

    // Assert
    assertSame(v2UserAttributes, actualAddAssetClassesItemResult);
  }

  /**
   * Test {@link V2UserAttributes#addAssetClassesItem(String)}.
   *
   * <ul>
   *   <li>Given {@link V2UserAttributes} (default constructor) assetClasses {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#addAssetClassesItem(String)}
   */
  @Test
  @DisplayName(
      "Test addAssetClassesItem(String); given V2UserAttributes (default constructor) assetClasses ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserAttributes V2UserAttributes.addAssetClassesItem(String)"})
  void testAddAssetClassesItem_givenV2UserAttributesAssetClassesArrayList() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();
    v2UserAttributes.assetClasses(new ArrayList<>());

    // Act
    V2UserAttributes actualAddAssetClassesItemResult =
        v2UserAttributes.addAssetClassesItem("Asset Classes Item");

    // Assert
    assertSame(v2UserAttributes, actualAddAssetClassesItemResult);
  }

  /**
   * Test {@link V2UserAttributes#addIndustriesItem(String)}.
   *
   * <ul>
   *   <li>Given {@link V2UserAttributes} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#addIndustriesItem(String)}
   */
  @Test
  @DisplayName("Test addIndustriesItem(String); given V2UserAttributes (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserAttributes V2UserAttributes.addIndustriesItem(String)"})
  void testAddIndustriesItem_givenV2UserAttributes() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();

    // Act
    V2UserAttributes actualAddIndustriesItemResult =
        v2UserAttributes.addIndustriesItem("Industries Item");

    // Assert
    assertSame(v2UserAttributes, actualAddIndustriesItemResult);
  }

  /**
   * Test {@link V2UserAttributes#addIndustriesItem(String)}.
   *
   * <ul>
   *   <li>Given {@link V2UserAttributes} (default constructor) industries {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#addIndustriesItem(String)}
   */
  @Test
  @DisplayName(
      "Test addIndustriesItem(String); given V2UserAttributes (default constructor) industries ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserAttributes V2UserAttributes.addIndustriesItem(String)"})
  void testAddIndustriesItem_givenV2UserAttributesIndustriesArrayList() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();
    v2UserAttributes.industries(new ArrayList<>());

    // Act
    V2UserAttributes actualAddIndustriesItemResult =
        v2UserAttributes.addIndustriesItem("Industries Item");

    // Assert
    assertSame(v2UserAttributes, actualAddIndustriesItemResult);
  }

  /**
   * Test {@link V2UserAttributes#addMarketCoverageItem(String)}.
   *
   * <ul>
   *   <li>Given {@link V2UserAttributes} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#addMarketCoverageItem(String)}
   */
  @Test
  @DisplayName("Test addMarketCoverageItem(String); given V2UserAttributes (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserAttributes V2UserAttributes.addMarketCoverageItem(String)"})
  void testAddMarketCoverageItem_givenV2UserAttributes() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();

    // Act
    V2UserAttributes actualAddMarketCoverageItemResult =
        v2UserAttributes.addMarketCoverageItem("Market Coverage Item");

    // Assert
    assertSame(v2UserAttributes, actualAddMarketCoverageItemResult);
  }

  /**
   * Test {@link V2UserAttributes#addMarketCoverageItem(String)}.
   *
   * <ul>
   *   <li>Given {@link V2UserAttributes} (default constructor) marketCoverage {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#addMarketCoverageItem(String)}
   */
  @Test
  @DisplayName(
      "Test addMarketCoverageItem(String); given V2UserAttributes (default constructor) marketCoverage ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserAttributes V2UserAttributes.addMarketCoverageItem(String)"})
  void testAddMarketCoverageItem_givenV2UserAttributesMarketCoverageArrayList() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();
    v2UserAttributes.marketCoverage(new ArrayList<>());

    // Act
    V2UserAttributes actualAddMarketCoverageItemResult =
        v2UserAttributes.addMarketCoverageItem("Market Coverage Item");

    // Assert
    assertSame(v2UserAttributes, actualAddMarketCoverageItemResult);
  }

  /**
   * Test {@link V2UserAttributes#addResponsibilityItem(String)}.
   *
   * <ul>
   *   <li>Given {@link V2UserAttributes} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#addResponsibilityItem(String)}
   */
  @Test
  @DisplayName("Test addResponsibilityItem(String); given V2UserAttributes (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserAttributes V2UserAttributes.addResponsibilityItem(String)"})
  void testAddResponsibilityItem_givenV2UserAttributes() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();

    // Act
    V2UserAttributes actualAddResponsibilityItemResult =
        v2UserAttributes.addResponsibilityItem("Responsibility Item");

    // Assert
    assertSame(v2UserAttributes, actualAddResponsibilityItemResult);
  }

  /**
   * Test {@link V2UserAttributes#addResponsibilityItem(String)}.
   *
   * <ul>
   *   <li>Given {@link V2UserAttributes} (default constructor) responsibility {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#addResponsibilityItem(String)}
   */
  @Test
  @DisplayName(
      "Test addResponsibilityItem(String); given V2UserAttributes (default constructor) responsibility ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserAttributes V2UserAttributes.addResponsibilityItem(String)"})
  void testAddResponsibilityItem_givenV2UserAttributesResponsibilityArrayList() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();
    v2UserAttributes.responsibility(new ArrayList<>());

    // Act
    V2UserAttributes actualAddResponsibilityItemResult =
        v2UserAttributes.addResponsibilityItem("Responsibility Item");

    // Assert
    assertSame(v2UserAttributes, actualAddResponsibilityItemResult);
  }

  /**
   * Test {@link V2UserAttributes#addFunctionItem(String)}.
   *
   * <ul>
   *   <li>Given {@link V2UserAttributes} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#addFunctionItem(String)}
   */
  @Test
  @DisplayName("Test addFunctionItem(String); given V2UserAttributes (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserAttributes V2UserAttributes.addFunctionItem(String)"})
  void testAddFunctionItem_givenV2UserAttributes() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();

    // Act
    V2UserAttributes actualAddFunctionItemResult =
        v2UserAttributes.addFunctionItem("Function Item");

    // Assert
    assertSame(v2UserAttributes, actualAddFunctionItemResult);
  }

  /**
   * Test {@link V2UserAttributes#addFunctionItem(String)}.
   *
   * <ul>
   *   <li>Given {@link V2UserAttributes} (default constructor) function {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#addFunctionItem(String)}
   */
  @Test
  @DisplayName(
      "Test addFunctionItem(String); given V2UserAttributes (default constructor) function ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserAttributes V2UserAttributes.addFunctionItem(String)"})
  void testAddFunctionItem_givenV2UserAttributesFunctionArrayList() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();
    v2UserAttributes.function(new ArrayList<>());

    // Act
    V2UserAttributes actualAddFunctionItemResult =
        v2UserAttributes.addFunctionItem("Function Item");

    // Assert
    assertSame(v2UserAttributes, actualAddFunctionItemResult);
  }

  /**
   * Test {@link V2UserAttributes#addInstrumentItem(String)}.
   *
   * <ul>
   *   <li>Given {@link V2UserAttributes} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#addInstrumentItem(String)}
   */
  @Test
  @DisplayName("Test addInstrumentItem(String); given V2UserAttributes (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserAttributes V2UserAttributes.addInstrumentItem(String)"})
  void testAddInstrumentItem_givenV2UserAttributes() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();

    // Act
    V2UserAttributes actualAddInstrumentItemResult =
        v2UserAttributes.addInstrumentItem("Instrument Item");

    // Assert
    assertSame(v2UserAttributes, actualAddInstrumentItemResult);
  }

  /**
   * Test {@link V2UserAttributes#addInstrumentItem(String)}.
   *
   * <ul>
   *   <li>Given {@link V2UserAttributes} (default constructor) instrument {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#addInstrumentItem(String)}
   */
  @Test
  @DisplayName(
      "Test addInstrumentItem(String); given V2UserAttributes (default constructor) instrument ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserAttributes V2UserAttributes.addInstrumentItem(String)"})
  void testAddInstrumentItem_givenV2UserAttributesInstrumentArrayList() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();
    v2UserAttributes.instrument(new ArrayList<>());

    // Act
    V2UserAttributes actualAddInstrumentItemResult =
        v2UserAttributes.addInstrumentItem("Instrument Item");

    // Assert
    assertSame(v2UserAttributes, actualAddInstrumentItemResult);
  }

  /**
   * Test {@link V2UserAttributes#equals(Object)}, and {@link V2UserAttributes#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2UserAttributes#equals(Object)}
   *   <li>{@link V2UserAttributes#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserAttributes.equals(Object)", "int V2UserAttributes.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();
    V2UserAttributes v2UserAttributes2 = new V2UserAttributes();

    // Act and Assert
    assertEquals(v2UserAttributes, v2UserAttributes2);
    assertEquals(v2UserAttributes.hashCode(), v2UserAttributes2.hashCode());
  }

  /**
   * Test {@link V2UserAttributes#equals(Object)}, and {@link V2UserAttributes#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2UserAttributes#equals(Object)}
   *   <li>{@link V2UserAttributes#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserAttributes.equals(Object)", "int V2UserAttributes.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();

    // Act and Assert
    assertEquals(v2UserAttributes, v2UserAttributes);
    int expectedHashCodeResult = v2UserAttributes.hashCode();
    assertEquals(expectedHashCodeResult, v2UserAttributes.hashCode());
  }

  /**
   * Test {@link V2UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserAttributes.equals(Object)", "int V2UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();
    v2UserAttributes.addAssetClassesItem("Asset Classes Item");

    // Act and Assert
    assertNotEquals(v2UserAttributes, new V2UserAttributes());
  }

  /**
   * Test {@link V2UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserAttributes.equals(Object)", "int V2UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();
    v2UserAttributes.emailAddress("42 Main St");
    v2UserAttributes.addAssetClassesItem("Asset Classes Item");

    // Act and Assert
    assertNotEquals(v2UserAttributes, new V2UserAttributes());
  }

  /**
   * Test {@link V2UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserAttributes.equals(Object)", "int V2UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();
    v2UserAttributes.firstName("Jane");
    v2UserAttributes.addAssetClassesItem("Asset Classes Item");

    // Act and Assert
    assertNotEquals(v2UserAttributes, new V2UserAttributes());
  }

  /**
   * Test {@link V2UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserAttributes.equals(Object)", "int V2UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();
    v2UserAttributes.lastName("Doe");
    v2UserAttributes.addAssetClassesItem("Asset Classes Item");

    // Act and Assert
    assertNotEquals(v2UserAttributes, new V2UserAttributes());
  }

  /**
   * Test {@link V2UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserAttributes.equals(Object)", "int V2UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();
    v2UserAttributes.userName("janedoe");
    v2UserAttributes.addAssetClassesItem("Asset Classes Item");

    // Act and Assert
    assertNotEquals(v2UserAttributes, new V2UserAttributes());
  }

  /**
   * Test {@link V2UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserAttributes.equals(Object)", "int V2UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();
    v2UserAttributes.displayName("Display Name");
    v2UserAttributes.addAssetClassesItem("Asset Classes Item");

    // Act and Assert
    assertNotEquals(v2UserAttributes, new V2UserAttributes());
  }

  /**
   * Test {@link V2UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserAttributes.equals(Object)", "int V2UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();
    v2UserAttributes.companyName("Company Name");
    v2UserAttributes.addAssetClassesItem("Asset Classes Item");

    // Act and Assert
    assertNotEquals(v2UserAttributes, new V2UserAttributes());
  }

  /**
   * Test {@link V2UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserAttributes.equals(Object)", "int V2UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();
    v2UserAttributes.department("Department");
    v2UserAttributes.addAssetClassesItem("Asset Classes Item");

    // Act and Assert
    assertNotEquals(v2UserAttributes, new V2UserAttributes());
  }

  /**
   * Test {@link V2UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserAttributes.equals(Object)", "int V2UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();
    v2UserAttributes.division("Division");
    v2UserAttributes.addAssetClassesItem("Asset Classes Item");

    // Act and Assert
    assertNotEquals(v2UserAttributes, new V2UserAttributes());
  }

  /**
   * Test {@link V2UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserAttributes.equals(Object)", "int V2UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual10() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();
    v2UserAttributes.title("Dr");
    v2UserAttributes.addAssetClassesItem("Asset Classes Item");

    // Act and Assert
    assertNotEquals(v2UserAttributes, new V2UserAttributes());
  }

  /**
   * Test {@link V2UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserAttributes.equals(Object)", "int V2UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual11() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();
    v2UserAttributes.workPhoneNumber("6625550144");
    v2UserAttributes.addAssetClassesItem("Asset Classes Item");

    // Act and Assert
    assertNotEquals(v2UserAttributes, new V2UserAttributes());
  }

  /**
   * Test {@link V2UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserAttributes.equals(Object)", "int V2UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual12() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();
    v2UserAttributes.mobilePhoneNumber("6625550144");
    v2UserAttributes.addAssetClassesItem("Asset Classes Item");

    // Act and Assert
    assertNotEquals(v2UserAttributes, new V2UserAttributes());
  }

  /**
   * Test {@link V2UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserAttributes.equals(Object)", "int V2UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual13() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();
    v2UserAttributes.twoFactorAuthPhone("6625550144");
    v2UserAttributes.addAssetClassesItem("Asset Classes Item");

    // Act and Assert
    assertNotEquals(v2UserAttributes, new V2UserAttributes());
  }

  /**
   * Test {@link V2UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserAttributes.equals(Object)", "int V2UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual14() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();
    v2UserAttributes.smsNumber("42");
    v2UserAttributes.addAssetClassesItem("Asset Classes Item");

    // Act and Assert
    assertNotEquals(v2UserAttributes, new V2UserAttributes());
  }

  /**
   * Test {@link V2UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserAttributes.equals(Object)", "int V2UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual15() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();
    v2UserAttributes.accountType(AccountTypeEnum.NORMAL);
    v2UserAttributes.addAssetClassesItem("Asset Classes Item");

    // Act and Assert
    assertNotEquals(v2UserAttributes, new V2UserAttributes());
  }

  /**
   * Test {@link V2UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserAttributes.equals(Object)", "int V2UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual16() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();
    v2UserAttributes.location("Location");
    v2UserAttributes.addAssetClassesItem("Asset Classes Item");

    // Act and Assert
    assertNotEquals(v2UserAttributes, new V2UserAttributes());
  }

  /**
   * Test {@link V2UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserAttributes.equals(Object)", "int V2UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual17() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();
    v2UserAttributes.recommendedLanguage("en");
    v2UserAttributes.addAssetClassesItem("Asset Classes Item");

    // Act and Assert
    assertNotEquals(v2UserAttributes, new V2UserAttributes());
  }

  /**
   * Test {@link V2UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserAttributes.equals(Object)", "int V2UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual18() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();
    v2UserAttributes.jobFunction("Job Function");
    v2UserAttributes.addAssetClassesItem("Asset Classes Item");

    // Act and Assert
    assertNotEquals(v2UserAttributes, new V2UserAttributes());
  }

  /**
   * Test {@link V2UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserAttributes.equals(Object)", "int V2UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual19() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();
    v2UserAttributes.addIndustriesItem("Industries Item");

    // Act and Assert
    assertNotEquals(v2UserAttributes, new V2UserAttributes());
  }

  /**
   * Test {@link V2UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserAttributes.equals(Object)", "int V2UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual20() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();
    v2UserAttributes.addMarketCoverageItem("Market Coverage Item");

    // Act and Assert
    assertNotEquals(v2UserAttributes, new V2UserAttributes());
  }

  /**
   * Test {@link V2UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserAttributes.equals(Object)", "int V2UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual21() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();
    v2UserAttributes.addResponsibilityItem("Responsibility Item");

    // Act and Assert
    assertNotEquals(v2UserAttributes, new V2UserAttributes());
  }

  /**
   * Test {@link V2UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserAttributes.equals(Object)", "int V2UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual22() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();
    v2UserAttributes.addFunctionItem("Function Item");

    // Act and Assert
    assertNotEquals(v2UserAttributes, new V2UserAttributes());
  }

  /**
   * Test {@link V2UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserAttributes.equals(Object)", "int V2UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual23() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();
    v2UserAttributes.addInstrumentItem("Instrument Item");

    // Act and Assert
    assertNotEquals(v2UserAttributes, new V2UserAttributes());
  }

  /**
   * Test {@link V2UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserAttributes.equals(Object)", "int V2UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual24() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();
    v2UserAttributes.currentKey(new V2UserKeyRequest());

    // Act and Assert
    assertNotEquals(v2UserAttributes, new V2UserAttributes());
  }

  /**
   * Test {@link V2UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserAttributes.equals(Object)", "int V2UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual25() {
    // Arrange
    V2UserAttributes v2UserAttributes = new V2UserAttributes();
    v2UserAttributes.previousKey(new V2UserKeyRequest());

    // Act and Assert
    assertNotEquals(v2UserAttributes, new V2UserAttributes());
  }

  /**
   * Test {@link V2UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserAttributes.equals(Object)", "int V2UserAttributes.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2UserAttributes(), null);
  }

  /**
   * Test {@link V2UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserAttributes.equals(Object)", "int V2UserAttributes.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2UserAttributes(), "Different type to V2UserAttributes");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V2UserAttributes}
   *   <li>{@link V2UserAttributes#accountType(AccountTypeEnum)}
   *   <li>{@link V2UserAttributes#assetClasses(List)}
   *   <li>{@link V2UserAttributes#companyName(String)}
   *   <li>{@link V2UserAttributes#currentKey(V2UserKeyRequest)}
   *   <li>{@link V2UserAttributes#department(String)}
   *   <li>{@link V2UserAttributes#displayName(String)}
   *   <li>{@link V2UserAttributes#division(String)}
   *   <li>{@link V2UserAttributes#emailAddress(String)}
   *   <li>{@link V2UserAttributes#firstName(String)}
   *   <li>{@link V2UserAttributes#function(List)}
   *   <li>{@link V2UserAttributes#industries(List)}
   *   <li>{@link V2UserAttributes#instrument(List)}
   *   <li>{@link V2UserAttributes#jobFunction(String)}
   *   <li>{@link V2UserAttributes#lastName(String)}
   *   <li>{@link V2UserAttributes#location(String)}
   *   <li>{@link V2UserAttributes#marketCoverage(List)}
   *   <li>{@link V2UserAttributes#mobilePhoneNumber(String)}
   *   <li>{@link V2UserAttributes#previousKey(V2UserKeyRequest)}
   *   <li>{@link V2UserAttributes#recommendedLanguage(String)}
   *   <li>{@link V2UserAttributes#responsibility(List)}
   *   <li>{@link V2UserAttributes#setAccountType(AccountTypeEnum)}
   *   <li>{@link V2UserAttributes#setAssetClasses(List)}
   *   <li>{@link V2UserAttributes#setCompanyName(String)}
   *   <li>{@link V2UserAttributes#setCurrentKey(V2UserKeyRequest)}
   *   <li>{@link V2UserAttributes#setDepartment(String)}
   *   <li>{@link V2UserAttributes#setDisplayName(String)}
   *   <li>{@link V2UserAttributes#setDivision(String)}
   *   <li>{@link V2UserAttributes#setEmailAddress(String)}
   *   <li>{@link V2UserAttributes#setFirstName(String)}
   *   <li>{@link V2UserAttributes#setFunction(List)}
   *   <li>{@link V2UserAttributes#setIndustries(List)}
   *   <li>{@link V2UserAttributes#setInstrument(List)}
   *   <li>{@link V2UserAttributes#setJobFunction(String)}
   *   <li>{@link V2UserAttributes#setLastName(String)}
   *   <li>{@link V2UserAttributes#setLocation(String)}
   *   <li>{@link V2UserAttributes#setMarketCoverage(List)}
   *   <li>{@link V2UserAttributes#setMobilePhoneNumber(String)}
   *   <li>{@link V2UserAttributes#setPreviousKey(V2UserKeyRequest)}
   *   <li>{@link V2UserAttributes#setRecommendedLanguage(String)}
   *   <li>{@link V2UserAttributes#setResponsibility(List)}
   *   <li>{@link V2UserAttributes#setSmsNumber(String)}
   *   <li>{@link V2UserAttributes#setTitle(String)}
   *   <li>{@link V2UserAttributes#setTwoFactorAuthPhone(String)}
   *   <li>{@link V2UserAttributes#setUserName(String)}
   *   <li>{@link V2UserAttributes#setWorkPhoneNumber(String)}
   *   <li>{@link V2UserAttributes#smsNumber(String)}
   *   <li>{@link V2UserAttributes#title(String)}
   *   <li>{@link V2UserAttributes#twoFactorAuthPhone(String)}
   *   <li>{@link V2UserAttributes#userName(String)}
   *   <li>{@link V2UserAttributes#workPhoneNumber(String)}
   *   <li>{@link V2UserAttributes#toString()}
   *   <li>{@link V2UserAttributes#getAccountType()}
   *   <li>{@link V2UserAttributes#getAssetClasses()}
   *   <li>{@link V2UserAttributes#getCompanyName()}
   *   <li>{@link V2UserAttributes#getCurrentKey()}
   *   <li>{@link V2UserAttributes#getDepartment()}
   *   <li>{@link V2UserAttributes#getDisplayName()}
   *   <li>{@link V2UserAttributes#getDivision()}
   *   <li>{@link V2UserAttributes#getEmailAddress()}
   *   <li>{@link V2UserAttributes#getFirstName()}
   *   <li>{@link V2UserAttributes#getFunction()}
   *   <li>{@link V2UserAttributes#getIndustries()}
   *   <li>{@link V2UserAttributes#getInstrument()}
   *   <li>{@link V2UserAttributes#getJobFunction()}
   *   <li>{@link V2UserAttributes#getLastName()}
   *   <li>{@link V2UserAttributes#getLocation()}
   *   <li>{@link V2UserAttributes#getMarketCoverage()}
   *   <li>{@link V2UserAttributes#getMobilePhoneNumber()}
   *   <li>{@link V2UserAttributes#getPreviousKey()}
   *   <li>{@link V2UserAttributes#getRecommendedLanguage()}
   *   <li>{@link V2UserAttributes#getResponsibility()}
   *   <li>{@link V2UserAttributes#getSmsNumber()}
   *   <li>{@link V2UserAttributes#getTitle()}
   *   <li>{@link V2UserAttributes#getTwoFactorAuthPhone()}
   *   <li>{@link V2UserAttributes#getUserName()}
   *   <li>{@link V2UserAttributes#getWorkPhoneNumber()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V2UserAttributes.<init>()",
    "V2UserAttributes V2UserAttributes.accountType(AccountTypeEnum)",
    "V2UserAttributes V2UserAttributes.assetClasses(List)",
    "V2UserAttributes V2UserAttributes.companyName(String)",
    "V2UserAttributes V2UserAttributes.currentKey(V2UserKeyRequest)",
    "V2UserAttributes V2UserAttributes.department(String)",
    "V2UserAttributes V2UserAttributes.displayName(String)",
    "V2UserAttributes V2UserAttributes.division(String)",
    "V2UserAttributes V2UserAttributes.emailAddress(String)",
    "V2UserAttributes V2UserAttributes.firstName(String)",
    "V2UserAttributes V2UserAttributes.function(List)",
    "AccountTypeEnum V2UserAttributes.getAccountType()",
    "List V2UserAttributes.getAssetClasses()",
    "String V2UserAttributes.getCompanyName()",
    "V2UserKeyRequest V2UserAttributes.getCurrentKey()",
    "String V2UserAttributes.getDepartment()",
    "String V2UserAttributes.getDisplayName()",
    "String V2UserAttributes.getDivision()",
    "String V2UserAttributes.getEmailAddress()",
    "String V2UserAttributes.getFirstName()",
    "List V2UserAttributes.getFunction()",
    "List V2UserAttributes.getIndustries()",
    "List V2UserAttributes.getInstrument()",
    "String V2UserAttributes.getJobFunction()",
    "String V2UserAttributes.getLastName()",
    "String V2UserAttributes.getLocation()",
    "List V2UserAttributes.getMarketCoverage()",
    "String V2UserAttributes.getMobilePhoneNumber()",
    "V2UserKeyRequest V2UserAttributes.getPreviousKey()",
    "String V2UserAttributes.getRecommendedLanguage()",
    "List V2UserAttributes.getResponsibility()",
    "String V2UserAttributes.getSmsNumber()",
    "String V2UserAttributes.getTitle()",
    "String V2UserAttributes.getTwoFactorAuthPhone()",
    "String V2UserAttributes.getUserName()",
    "String V2UserAttributes.getWorkPhoneNumber()",
    "V2UserAttributes V2UserAttributes.industries(List)",
    "V2UserAttributes V2UserAttributes.instrument(List)",
    "V2UserAttributes V2UserAttributes.jobFunction(String)",
    "V2UserAttributes V2UserAttributes.lastName(String)",
    "V2UserAttributes V2UserAttributes.location(String)",
    "V2UserAttributes V2UserAttributes.marketCoverage(List)",
    "V2UserAttributes V2UserAttributes.mobilePhoneNumber(String)",
    "V2UserAttributes V2UserAttributes.previousKey(V2UserKeyRequest)",
    "V2UserAttributes V2UserAttributes.recommendedLanguage(String)",
    "V2UserAttributes V2UserAttributes.responsibility(List)",
    "void V2UserAttributes.setAccountType(AccountTypeEnum)",
    "void V2UserAttributes.setAssetClasses(List)",
    "void V2UserAttributes.setCompanyName(String)",
    "void V2UserAttributes.setCurrentKey(V2UserKeyRequest)",
    "void V2UserAttributes.setDepartment(String)",
    "void V2UserAttributes.setDisplayName(String)",
    "void V2UserAttributes.setDivision(String)",
    "void V2UserAttributes.setEmailAddress(String)",
    "void V2UserAttributes.setFirstName(String)",
    "void V2UserAttributes.setFunction(List)",
    "void V2UserAttributes.setIndustries(List)",
    "void V2UserAttributes.setInstrument(List)",
    "void V2UserAttributes.setJobFunction(String)",
    "void V2UserAttributes.setLastName(String)",
    "void V2UserAttributes.setLocation(String)",
    "void V2UserAttributes.setMarketCoverage(List)",
    "void V2UserAttributes.setMobilePhoneNumber(String)",
    "void V2UserAttributes.setPreviousKey(V2UserKeyRequest)",
    "void V2UserAttributes.setRecommendedLanguage(String)",
    "void V2UserAttributes.setResponsibility(List)",
    "void V2UserAttributes.setSmsNumber(String)",
    "void V2UserAttributes.setTitle(String)",
    "void V2UserAttributes.setTwoFactorAuthPhone(String)",
    "void V2UserAttributes.setUserName(String)",
    "void V2UserAttributes.setWorkPhoneNumber(String)",
    "V2UserAttributes V2UserAttributes.smsNumber(String)",
    "V2UserAttributes V2UserAttributes.title(String)",
    "String V2UserAttributes.toString()",
    "V2UserAttributes V2UserAttributes.twoFactorAuthPhone(String)",
    "V2UserAttributes V2UserAttributes.userName(String)",
    "V2UserAttributes V2UserAttributes.workPhoneNumber(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V2UserAttributes actualV2UserAttributes = new V2UserAttributes();
    V2UserAttributes actualAccountTypeResult =
        actualV2UserAttributes.accountType(AccountTypeEnum.NORMAL);
    V2UserAttributes actualAssetClassesResult =
        actualV2UserAttributes.assetClasses(new ArrayList<>());
    V2UserAttributes actualCompanyNameResult = actualV2UserAttributes.companyName("Company Name");
    V2UserAttributes actualCurrentKeyResult =
        actualV2UserAttributes.currentKey(new V2UserKeyRequest());
    V2UserAttributes actualDepartmentResult = actualV2UserAttributes.department("Department");
    V2UserAttributes actualDisplayNameResult = actualV2UserAttributes.displayName("Display Name");
    V2UserAttributes actualDivisionResult = actualV2UserAttributes.division("Division");
    V2UserAttributes actualEmailAddressResult = actualV2UserAttributes.emailAddress("42 Main St");
    V2UserAttributes actualFirstNameResult = actualV2UserAttributes.firstName("Jane");
    V2UserAttributes actualFunctionResult = actualV2UserAttributes.function(new ArrayList<>());
    V2UserAttributes actualIndustriesResult = actualV2UserAttributes.industries(new ArrayList<>());
    V2UserAttributes actualInstrumentResult = actualV2UserAttributes.instrument(new ArrayList<>());
    V2UserAttributes actualJobFunctionResult = actualV2UserAttributes.jobFunction("Job Function");
    V2UserAttributes actualLastNameResult = actualV2UserAttributes.lastName("Doe");
    V2UserAttributes actualLocationResult = actualV2UserAttributes.location("Location");
    V2UserAttributes actualMarketCoverageResult =
        actualV2UserAttributes.marketCoverage(new ArrayList<>());
    V2UserAttributes actualMobilePhoneNumberResult =
        actualV2UserAttributes.mobilePhoneNumber("6625550144");
    V2UserAttributes actualPreviousKeyResult =
        actualV2UserAttributes.previousKey(new V2UserKeyRequest());
    V2UserAttributes actualRecommendedLanguageResult =
        actualV2UserAttributes.recommendedLanguage("en");
    V2UserAttributes actualResponsibilityResult =
        actualV2UserAttributes.responsibility(new ArrayList<>());
    actualV2UserAttributes.setAccountType(AccountTypeEnum.NORMAL);
    ArrayList<String> assetClasses = new ArrayList<>();
    actualV2UserAttributes.setAssetClasses(assetClasses);
    actualV2UserAttributes.setCompanyName("Company Name");
    V2UserKeyRequest currentKey = new V2UserKeyRequest();
    actualV2UserAttributes.setCurrentKey(currentKey);
    actualV2UserAttributes.setDepartment("Department");
    actualV2UserAttributes.setDisplayName("Display Name");
    actualV2UserAttributes.setDivision("Division");
    actualV2UserAttributes.setEmailAddress("42 Main St");
    actualV2UserAttributes.setFirstName("Jane");
    ArrayList<String> function = new ArrayList<>();
    actualV2UserAttributes.setFunction(function);
    ArrayList<String> industries = new ArrayList<>();
    actualV2UserAttributes.setIndustries(industries);
    ArrayList<String> instrument = new ArrayList<>();
    actualV2UserAttributes.setInstrument(instrument);
    actualV2UserAttributes.setJobFunction("Job Function");
    actualV2UserAttributes.setLastName("Doe");
    actualV2UserAttributes.setLocation("Location");
    ArrayList<String> marketCoverage = new ArrayList<>();
    actualV2UserAttributes.setMarketCoverage(marketCoverage);
    actualV2UserAttributes.setMobilePhoneNumber("6625550144");
    V2UserKeyRequest previousKey = new V2UserKeyRequest();
    actualV2UserAttributes.setPreviousKey(previousKey);
    actualV2UserAttributes.setRecommendedLanguage("en");
    ArrayList<String> responsibility = new ArrayList<>();
    actualV2UserAttributes.setResponsibility(responsibility);
    actualV2UserAttributes.setSmsNumber("42");
    actualV2UserAttributes.setTitle("Dr");
    actualV2UserAttributes.setTwoFactorAuthPhone("6625550144");
    actualV2UserAttributes.setUserName("janedoe");
    actualV2UserAttributes.setWorkPhoneNumber("6625550144");
    V2UserAttributes actualSmsNumberResult = actualV2UserAttributes.smsNumber("42");
    V2UserAttributes actualTitleResult = actualV2UserAttributes.title("Dr");
    V2UserAttributes actualTwoFactorAuthPhoneResult =
        actualV2UserAttributes.twoFactorAuthPhone("6625550144");
    V2UserAttributes actualUserNameResult = actualV2UserAttributes.userName("janedoe");
    V2UserAttributes actualWorkPhoneNumberResult =
        actualV2UserAttributes.workPhoneNumber("6625550144");
    String actualToStringResult = actualV2UserAttributes.toString();
    AccountTypeEnum actualAccountType = actualV2UserAttributes.getAccountType();
    List<String> actualAssetClasses = actualV2UserAttributes.getAssetClasses();
    String actualCompanyName = actualV2UserAttributes.getCompanyName();
    V2UserKeyRequest actualCurrentKey = actualV2UserAttributes.getCurrentKey();
    String actualDepartment = actualV2UserAttributes.getDepartment();
    String actualDisplayName = actualV2UserAttributes.getDisplayName();
    String actualDivision = actualV2UserAttributes.getDivision();
    String actualEmailAddress = actualV2UserAttributes.getEmailAddress();
    String actualFirstName = actualV2UserAttributes.getFirstName();
    List<String> actualFunction = actualV2UserAttributes.getFunction();
    List<String> actualIndustries = actualV2UserAttributes.getIndustries();
    List<String> actualInstrument = actualV2UserAttributes.getInstrument();
    String actualJobFunction = actualV2UserAttributes.getJobFunction();
    String actualLastName = actualV2UserAttributes.getLastName();
    String actualLocation = actualV2UserAttributes.getLocation();
    List<String> actualMarketCoverage = actualV2UserAttributes.getMarketCoverage();
    String actualMobilePhoneNumber = actualV2UserAttributes.getMobilePhoneNumber();
    V2UserKeyRequest actualPreviousKey = actualV2UserAttributes.getPreviousKey();
    String actualRecommendedLanguage = actualV2UserAttributes.getRecommendedLanguage();
    List<String> actualResponsibility = actualV2UserAttributes.getResponsibility();
    String actualSmsNumber = actualV2UserAttributes.getSmsNumber();
    String actualTitle = actualV2UserAttributes.getTitle();
    String actualTwoFactorAuthPhone = actualV2UserAttributes.getTwoFactorAuthPhone();
    String actualUserName = actualV2UserAttributes.getUserName();

    // Assert
    assertEquals("42 Main St", actualEmailAddress);
    assertEquals("42", actualSmsNumber);
    assertEquals("6625550144", actualMobilePhoneNumber);
    assertEquals("6625550144", actualTwoFactorAuthPhone);
    assertEquals("6625550144", actualV2UserAttributes.getWorkPhoneNumber());
    assertEquals("Company Name", actualCompanyName);
    assertEquals("Department", actualDepartment);
    assertEquals("Display Name", actualDisplayName);
    assertEquals("Division", actualDivision);
    assertEquals("Doe", actualLastName);
    assertEquals("Dr", actualTitle);
    assertEquals("Jane", actualFirstName);
    assertEquals("Job Function", actualJobFunction);
    assertEquals("Location", actualLocation);
    assertEquals(
        "class V2UserAttributes {\n"
            + "    emailAddress: 42 Main St\n"
            + "    firstName: Jane\n"
            + "    lastName: Doe\n"
            + "    userName: janedoe\n"
            + "    displayName: Display Name\n"
            + "    companyName: Company Name\n"
            + "    department: Department\n"
            + "    division: Division\n"
            + "    title: Dr\n"
            + "    workPhoneNumber: 6625550144\n"
            + "    mobilePhoneNumber: 6625550144\n"
            + "    twoFactorAuthPhone: 6625550144\n"
            + "    smsNumber: 42\n"
            + "    accountType: NORMAL\n"
            + "    location: Location\n"
            + "    recommendedLanguage: en\n"
            + "    jobFunction: Job Function\n"
            + "    assetClasses: []\n"
            + "    industries: []\n"
            + "    marketCoverage: []\n"
            + "    responsibility: []\n"
            + "    function: []\n"
            + "    instrument: []\n"
            + "    currentKey: class V2UserKeyRequest {\n"
            + "        key: null\n"
            + "        expirationDate: null\n"
            + "        action: null\n"
            + "    }\n"
            + "    previousKey: class V2UserKeyRequest {\n"
            + "        key: null\n"
            + "        expirationDate: null\n"
            + "        action: null\n"
            + "    }\n"
            + "}",
        actualToStringResult);
    assertEquals("en", actualRecommendedLanguage);
    assertEquals("janedoe", actualUserName);
    assertEquals(AccountTypeEnum.NORMAL, actualAccountType);
    assertTrue(actualAssetClasses.isEmpty());
    assertTrue(actualFunction.isEmpty());
    assertTrue(actualIndustries.isEmpty());
    assertTrue(actualInstrument.isEmpty());
    assertTrue(actualMarketCoverage.isEmpty());
    assertTrue(actualResponsibility.isEmpty());
    assertSame(actualV2UserAttributes, actualAccountTypeResult);
    assertSame(actualV2UserAttributes, actualAssetClassesResult);
    assertSame(actualV2UserAttributes, actualCompanyNameResult);
    assertSame(actualV2UserAttributes, actualCurrentKeyResult);
    assertSame(actualV2UserAttributes, actualDepartmentResult);
    assertSame(actualV2UserAttributes, actualDisplayNameResult);
    assertSame(actualV2UserAttributes, actualDivisionResult);
    assertSame(actualV2UserAttributes, actualEmailAddressResult);
    assertSame(actualV2UserAttributes, actualFirstNameResult);
    assertSame(actualV2UserAttributes, actualFunctionResult);
    assertSame(actualV2UserAttributes, actualIndustriesResult);
    assertSame(actualV2UserAttributes, actualInstrumentResult);
    assertSame(actualV2UserAttributes, actualJobFunctionResult);
    assertSame(actualV2UserAttributes, actualLastNameResult);
    assertSame(actualV2UserAttributes, actualLocationResult);
    assertSame(actualV2UserAttributes, actualMarketCoverageResult);
    assertSame(actualV2UserAttributes, actualMobilePhoneNumberResult);
    assertSame(actualV2UserAttributes, actualPreviousKeyResult);
    assertSame(actualV2UserAttributes, actualRecommendedLanguageResult);
    assertSame(actualV2UserAttributes, actualResponsibilityResult);
    assertSame(actualV2UserAttributes, actualSmsNumberResult);
    assertSame(actualV2UserAttributes, actualTitleResult);
    assertSame(actualV2UserAttributes, actualTwoFactorAuthPhoneResult);
    assertSame(actualV2UserAttributes, actualUserNameResult);
    assertSame(actualV2UserAttributes, actualWorkPhoneNumberResult);
    assertSame(currentKey, actualCurrentKey);
    assertSame(previousKey, actualPreviousKey);
    assertSame(assetClasses, actualAssetClasses);
    assertSame(function, actualFunction);
    assertSame(industries, actualIndustries);
    assertSame(instrument, actualInstrument);
    assertSame(marketCoverage, actualMarketCoverage);
    assertSame(responsibility, actualResponsibility);
  }
}
