package com.symphony.bdk.ext.group.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BaseProfileDiffblueTest {
  /**
   * Test {@link BaseProfile#addIndustryOfInterestItem(String)}.
   *
   * <ul>
   *   <li>Given {@link BaseProfile} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link BaseProfile#addIndustryOfInterestItem(String)}
   */
  @Test
  @DisplayName("Test addIndustryOfInterestItem(String); given BaseProfile (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BaseProfile BaseProfile.addIndustryOfInterestItem(String)"})
  void testAddIndustryOfInterestItem_givenBaseProfile() {
    // Arrange
    BaseProfile baseProfile = new BaseProfile();

    // Act
    BaseProfile actualAddIndustryOfInterestItemResult =
        baseProfile.addIndustryOfInterestItem("Industry Of Interest Item");

    // Assert
    assertSame(baseProfile, actualAddIndustryOfInterestItemResult);
  }

  /**
   * Test {@link BaseProfile#addIndustryOfInterestItem(String)}.
   *
   * <ul>
   *   <li>Given {@link BaseProfile} (default constructor) industryOfInterest {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link BaseProfile#addIndustryOfInterestItem(String)}
   */
  @Test
  @DisplayName(
      "Test addIndustryOfInterestItem(String); given BaseProfile (default constructor) industryOfInterest ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BaseProfile BaseProfile.addIndustryOfInterestItem(String)"})
  void testAddIndustryOfInterestItem_givenBaseProfileIndustryOfInterestArrayList() {
    // Arrange
    BaseProfile baseProfile = new BaseProfile();
    baseProfile.industryOfInterest(new ArrayList<>());

    // Act
    BaseProfile actualAddIndustryOfInterestItemResult =
        baseProfile.addIndustryOfInterestItem("Industry Of Interest Item");

    // Assert
    assertSame(baseProfile, actualAddIndustryOfInterestItemResult);
  }

  /**
   * Test {@link BaseProfile#addAssetClassesOfInterestItem(String)}.
   *
   * <p>Method under test: {@link BaseProfile#addAssetClassesOfInterestItem(String)}
   */
  @Test
  @DisplayName("Test addAssetClassesOfInterestItem(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BaseProfile BaseProfile.addAssetClassesOfInterestItem(String)"})
  void testAddAssetClassesOfInterestItem() {
    // Arrange
    BaseProfile baseProfile = new BaseProfile();
    baseProfile.assetClassesOfInterest(new ArrayList<>());

    // Act
    BaseProfile actualAddAssetClassesOfInterestItemResult =
        baseProfile.addAssetClassesOfInterestItem("Asset Classes Of Interest Item");

    // Assert
    assertSame(baseProfile, actualAddAssetClassesOfInterestItemResult);
  }

  /**
   * Test {@link BaseProfile#addAssetClassesOfInterestItem(String)}.
   *
   * <ul>
   *   <li>Given {@link BaseProfile} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link BaseProfile#addAssetClassesOfInterestItem(String)}
   */
  @Test
  @DisplayName(
      "Test addAssetClassesOfInterestItem(String); given BaseProfile (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BaseProfile BaseProfile.addAssetClassesOfInterestItem(String)"})
  void testAddAssetClassesOfInterestItem_givenBaseProfile() {
    // Arrange
    BaseProfile baseProfile = new BaseProfile();

    // Act
    BaseProfile actualAddAssetClassesOfInterestItemResult =
        baseProfile.addAssetClassesOfInterestItem("Asset Classes Of Interest Item");

    // Assert
    assertSame(baseProfile, actualAddAssetClassesOfInterestItemResult);
  }

  /**
   * Test {@link BaseProfile#addMarketCoverageItem(String)}.
   *
   * <ul>
   *   <li>Given {@link BaseProfile} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link BaseProfile#addMarketCoverageItem(String)}
   */
  @Test
  @DisplayName("Test addMarketCoverageItem(String); given BaseProfile (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BaseProfile BaseProfile.addMarketCoverageItem(String)"})
  void testAddMarketCoverageItem_givenBaseProfile() {
    // Arrange
    BaseProfile baseProfile = new BaseProfile();

    // Act
    BaseProfile actualAddMarketCoverageItemResult =
        baseProfile.addMarketCoverageItem("Market Coverage Item");

    // Assert
    assertSame(baseProfile, actualAddMarketCoverageItemResult);
  }

  /**
   * Test {@link BaseProfile#addMarketCoverageItem(String)}.
   *
   * <ul>
   *   <li>Given {@link BaseProfile} (default constructor) marketCoverage {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link BaseProfile#addMarketCoverageItem(String)}
   */
  @Test
  @DisplayName(
      "Test addMarketCoverageItem(String); given BaseProfile (default constructor) marketCoverage HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BaseProfile BaseProfile.addMarketCoverageItem(String)"})
  void testAddMarketCoverageItem_givenBaseProfileMarketCoverageHashSet() {
    // Arrange
    BaseProfile baseProfile = new BaseProfile();
    baseProfile.marketCoverage(new HashSet<>());

    // Act
    BaseProfile actualAddMarketCoverageItemResult =
        baseProfile.addMarketCoverageItem("Market Coverage Item");

    // Assert
    assertSame(baseProfile, actualAddMarketCoverageItemResult);
  }

  /**
   * Test {@link BaseProfile#addResponsibilityItem(String)}.
   *
   * <ul>
   *   <li>Given {@link BaseProfile} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link BaseProfile#addResponsibilityItem(String)}
   */
  @Test
  @DisplayName("Test addResponsibilityItem(String); given BaseProfile (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BaseProfile BaseProfile.addResponsibilityItem(String)"})
  void testAddResponsibilityItem_givenBaseProfile() {
    // Arrange
    BaseProfile baseProfile = new BaseProfile();

    // Act
    BaseProfile actualAddResponsibilityItemResult =
        baseProfile.addResponsibilityItem("Responsibility Item");

    // Assert
    assertSame(baseProfile, actualAddResponsibilityItemResult);
  }

  /**
   * Test {@link BaseProfile#addResponsibilityItem(String)}.
   *
   * <ul>
   *   <li>Given {@link BaseProfile} (default constructor) responsibility {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link BaseProfile#addResponsibilityItem(String)}
   */
  @Test
  @DisplayName(
      "Test addResponsibilityItem(String); given BaseProfile (default constructor) responsibility HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BaseProfile BaseProfile.addResponsibilityItem(String)"})
  void testAddResponsibilityItem_givenBaseProfileResponsibilityHashSet() {
    // Arrange
    BaseProfile baseProfile = new BaseProfile();
    baseProfile.responsibility(new HashSet<>());

    // Act
    BaseProfile actualAddResponsibilityItemResult =
        baseProfile.addResponsibilityItem("Responsibility Item");

    // Assert
    assertSame(baseProfile, actualAddResponsibilityItemResult);
  }

  /**
   * Test {@link BaseProfile#addFunctionItem(String)}.
   *
   * <ul>
   *   <li>Given {@link BaseProfile} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link BaseProfile#addFunctionItem(String)}
   */
  @Test
  @DisplayName("Test addFunctionItem(String); given BaseProfile (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BaseProfile BaseProfile.addFunctionItem(String)"})
  void testAddFunctionItem_givenBaseProfile() {
    // Arrange
    BaseProfile baseProfile = new BaseProfile();

    // Act
    BaseProfile actualAddFunctionItemResult = baseProfile.addFunctionItem("Function Item");

    // Assert
    assertSame(baseProfile, actualAddFunctionItemResult);
  }

  /**
   * Test {@link BaseProfile#addFunctionItem(String)}.
   *
   * <ul>
   *   <li>Given {@link BaseProfile} (default constructor) function {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link BaseProfile#addFunctionItem(String)}
   */
  @Test
  @DisplayName(
      "Test addFunctionItem(String); given BaseProfile (default constructor) function HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BaseProfile BaseProfile.addFunctionItem(String)"})
  void testAddFunctionItem_givenBaseProfileFunctionHashSet() {
    // Arrange
    BaseProfile baseProfile = new BaseProfile();
    baseProfile.function(new HashSet<>());

    // Act
    BaseProfile actualAddFunctionItemResult = baseProfile.addFunctionItem("Function Item");

    // Assert
    assertSame(baseProfile, actualAddFunctionItemResult);
  }

  /**
   * Test {@link BaseProfile#addInstrumentItem(String)}.
   *
   * <ul>
   *   <li>Given {@link BaseProfile} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link BaseProfile#addInstrumentItem(String)}
   */
  @Test
  @DisplayName("Test addInstrumentItem(String); given BaseProfile (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BaseProfile BaseProfile.addInstrumentItem(String)"})
  void testAddInstrumentItem_givenBaseProfile() {
    // Arrange
    BaseProfile baseProfile = new BaseProfile();

    // Act
    BaseProfile actualAddInstrumentItemResult = baseProfile.addInstrumentItem("Instrument Item");

    // Assert
    assertSame(baseProfile, actualAddInstrumentItemResult);
  }

  /**
   * Test {@link BaseProfile#addInstrumentItem(String)}.
   *
   * <ul>
   *   <li>Given {@link BaseProfile} (default constructor) instrument {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link BaseProfile#addInstrumentItem(String)}
   */
  @Test
  @DisplayName(
      "Test addInstrumentItem(String); given BaseProfile (default constructor) instrument HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BaseProfile BaseProfile.addInstrumentItem(String)"})
  void testAddInstrumentItem_givenBaseProfileInstrumentHashSet() {
    // Arrange
    BaseProfile baseProfile = new BaseProfile();
    baseProfile.instrument(new HashSet<>());

    // Act
    BaseProfile actualAddInstrumentItemResult = baseProfile.addInstrumentItem("Instrument Item");

    // Assert
    assertSame(baseProfile, actualAddInstrumentItemResult);
  }

  /**
   * Test {@link BaseProfile#equals(Object)}, and {@link BaseProfile#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BaseProfile#equals(Object)}
   *   <li>{@link BaseProfile#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseProfile.equals(Object)", "int BaseProfile.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    BaseProfile baseProfile = new BaseProfile();
    BaseProfile baseProfile2 = new BaseProfile();

    // Act and Assert
    assertEquals(baseProfile, baseProfile2);
    assertEquals(baseProfile.hashCode(), baseProfile2.hashCode());
  }

  /**
   * Test {@link BaseProfile#equals(Object)}, and {@link BaseProfile#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BaseProfile#equals(Object)}
   *   <li>{@link BaseProfile#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseProfile.equals(Object)", "int BaseProfile.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    BaseProfile baseProfile = new BaseProfile();

    // Act and Assert
    assertEquals(baseProfile, baseProfile);
    int expectedHashCodeResult = baseProfile.hashCode();
    assertEquals(expectedHashCodeResult, baseProfile.hashCode());
  }

  /**
   * Test {@link BaseProfile#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BaseProfile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseProfile.equals(Object)", "int BaseProfile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    BaseProfile baseProfile = new BaseProfile();
    baseProfile.addIndustryOfInterestItem("Industry Of Interest Item");

    // Act and Assert
    assertNotEquals(baseProfile, new BaseProfile());
  }

  /**
   * Test {@link BaseProfile#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BaseProfile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseProfile.equals(Object)", "int BaseProfile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    BaseProfile baseProfile = new BaseProfile();
    baseProfile.displayName("Display Name");
    baseProfile.addIndustryOfInterestItem("Industry Of Interest Item");

    // Act and Assert
    assertNotEquals(baseProfile, new BaseProfile());
  }

  /**
   * Test {@link BaseProfile#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BaseProfile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseProfile.equals(Object)", "int BaseProfile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    BaseProfile baseProfile = new BaseProfile();
    baseProfile.companyName("Company Name");
    baseProfile.addIndustryOfInterestItem("Industry Of Interest Item");

    // Act and Assert
    assertNotEquals(baseProfile, new BaseProfile());
  }

  /**
   * Test {@link BaseProfile#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BaseProfile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseProfile.equals(Object)", "int BaseProfile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    BaseProfile baseProfile = new BaseProfile();
    baseProfile.email("jane.doe@example.org");
    baseProfile.addIndustryOfInterestItem("Industry Of Interest Item");

    // Act and Assert
    assertNotEquals(baseProfile, new BaseProfile());
  }

  /**
   * Test {@link BaseProfile#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BaseProfile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseProfile.equals(Object)", "int BaseProfile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    BaseProfile baseProfile = new BaseProfile();
    baseProfile.mobile("Mobile");
    baseProfile.addIndustryOfInterestItem("Industry Of Interest Item");

    // Act and Assert
    assertNotEquals(baseProfile, new BaseProfile());
  }

  /**
   * Test {@link BaseProfile#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BaseProfile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseProfile.equals(Object)", "int BaseProfile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    BaseProfile baseProfile = new BaseProfile();
    baseProfile.jobTitle("Dr");
    baseProfile.addIndustryOfInterestItem("Industry Of Interest Item");

    // Act and Assert
    assertNotEquals(baseProfile, new BaseProfile());
  }

  /**
   * Test {@link BaseProfile#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BaseProfile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseProfile.equals(Object)", "int BaseProfile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    BaseProfile baseProfile = new BaseProfile();
    baseProfile.jobRole("Job Role");
    baseProfile.addIndustryOfInterestItem("Industry Of Interest Item");

    // Act and Assert
    assertNotEquals(baseProfile, new BaseProfile());
  }

  /**
   * Test {@link BaseProfile#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BaseProfile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseProfile.equals(Object)", "int BaseProfile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    BaseProfile baseProfile = new BaseProfile();
    baseProfile.jobDepartment("Job Department");
    baseProfile.addIndustryOfInterestItem("Industry Of Interest Item");

    // Act and Assert
    assertNotEquals(baseProfile, new BaseProfile());
  }

  /**
   * Test {@link BaseProfile#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BaseProfile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseProfile.equals(Object)", "int BaseProfile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    BaseProfile baseProfile = new BaseProfile();
    baseProfile.jobDivision("Job Division");
    baseProfile.addIndustryOfInterestItem("Industry Of Interest Item");

    // Act and Assert
    assertNotEquals(baseProfile, new BaseProfile());
  }

  /**
   * Test {@link BaseProfile#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BaseProfile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseProfile.equals(Object)", "int BaseProfile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual10() {
    // Arrange
    BaseProfile baseProfile = new BaseProfile();
    baseProfile.jobPhone("6625550144");
    baseProfile.addIndustryOfInterestItem("Industry Of Interest Item");

    // Act and Assert
    assertNotEquals(baseProfile, new BaseProfile());
  }

  /**
   * Test {@link BaseProfile#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BaseProfile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseProfile.equals(Object)", "int BaseProfile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual11() {
    // Arrange
    BaseProfile baseProfile = new BaseProfile();
    baseProfile.jobCity("Job City");
    baseProfile.addIndustryOfInterestItem("Industry Of Interest Item");

    // Act and Assert
    assertNotEquals(baseProfile, new BaseProfile());
  }

  /**
   * Test {@link BaseProfile#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BaseProfile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseProfile.equals(Object)", "int BaseProfile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual12() {
    // Arrange
    BaseProfile baseProfile = new BaseProfile();
    baseProfile.addAssetClassesOfInterestItem("Asset Classes Of Interest Item");

    // Act and Assert
    assertNotEquals(baseProfile, new BaseProfile());
  }

  /**
   * Test {@link BaseProfile#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BaseProfile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseProfile.equals(Object)", "int BaseProfile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual13() {
    // Arrange
    BaseProfile baseProfile = new BaseProfile();
    baseProfile.addMarketCoverageItem("Market Coverage Item");

    // Act and Assert
    assertNotEquals(baseProfile, new BaseProfile());
  }

  /**
   * Test {@link BaseProfile#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BaseProfile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseProfile.equals(Object)", "int BaseProfile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual14() {
    // Arrange
    BaseProfile baseProfile = new BaseProfile();
    baseProfile.addResponsibilityItem("Responsibility Item");

    // Act and Assert
    assertNotEquals(baseProfile, new BaseProfile());
  }

  /**
   * Test {@link BaseProfile#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BaseProfile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseProfile.equals(Object)", "int BaseProfile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual15() {
    // Arrange
    BaseProfile baseProfile = new BaseProfile();
    baseProfile.addFunctionItem("Function Item");

    // Act and Assert
    assertNotEquals(baseProfile, new BaseProfile());
  }

  /**
   * Test {@link BaseProfile#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BaseProfile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseProfile.equals(Object)", "int BaseProfile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual16() {
    // Arrange
    BaseProfile baseProfile = new BaseProfile();
    baseProfile.addInstrumentItem("Instrument Item");

    // Act and Assert
    assertNotEquals(baseProfile, new BaseProfile());
  }

  /**
   * Test {@link BaseProfile#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BaseProfile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseProfile.equals(Object)", "int BaseProfile.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new BaseProfile(), null);
  }

  /**
   * Test {@link BaseProfile#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BaseProfile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseProfile.equals(Object)", "int BaseProfile.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new BaseProfile(), "Different type to BaseProfile");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link BaseProfile}
   *   <li>{@link BaseProfile#assetClassesOfInterest(List)}
   *   <li>{@link BaseProfile#companyName(String)}
   *   <li>{@link BaseProfile#displayName(String)}
   *   <li>{@link BaseProfile#email(String)}
   *   <li>{@link BaseProfile#function(Set)}
   *   <li>{@link BaseProfile#industryOfInterest(List)}
   *   <li>{@link BaseProfile#instrument(Set)}
   *   <li>{@link BaseProfile#jobCity(String)}
   *   <li>{@link BaseProfile#jobDepartment(String)}
   *   <li>{@link BaseProfile#jobDivision(String)}
   *   <li>{@link BaseProfile#jobPhone(String)}
   *   <li>{@link BaseProfile#jobRole(String)}
   *   <li>{@link BaseProfile#jobTitle(String)}
   *   <li>{@link BaseProfile#marketCoverage(Set)}
   *   <li>{@link BaseProfile#mobile(String)}
   *   <li>{@link BaseProfile#responsibility(Set)}
   *   <li>{@link BaseProfile#setAssetClassesOfInterest(List)}
   *   <li>{@link BaseProfile#setCompanyName(String)}
   *   <li>{@link BaseProfile#setDisplayName(String)}
   *   <li>{@link BaseProfile#setEmail(String)}
   *   <li>{@link BaseProfile#setFunction(Set)}
   *   <li>{@link BaseProfile#setIndustryOfInterest(List)}
   *   <li>{@link BaseProfile#setInstrument(Set)}
   *   <li>{@link BaseProfile#setJobCity(String)}
   *   <li>{@link BaseProfile#setJobDepartment(String)}
   *   <li>{@link BaseProfile#setJobDivision(String)}
   *   <li>{@link BaseProfile#setJobPhone(String)}
   *   <li>{@link BaseProfile#setJobRole(String)}
   *   <li>{@link BaseProfile#setJobTitle(String)}
   *   <li>{@link BaseProfile#setMarketCoverage(Set)}
   *   <li>{@link BaseProfile#setMobile(String)}
   *   <li>{@link BaseProfile#setResponsibility(Set)}
   *   <li>{@link BaseProfile#toString()}
   *   <li>{@link BaseProfile#getAssetClassesOfInterest()}
   *   <li>{@link BaseProfile#getCompanyName()}
   *   <li>{@link BaseProfile#getDisplayName()}
   *   <li>{@link BaseProfile#getEmail()}
   *   <li>{@link BaseProfile#getFunction()}
   *   <li>{@link BaseProfile#getIndustryOfInterest()}
   *   <li>{@link BaseProfile#getInstrument()}
   *   <li>{@link BaseProfile#getJobCity()}
   *   <li>{@link BaseProfile#getJobDepartment()}
   *   <li>{@link BaseProfile#getJobDivision()}
   *   <li>{@link BaseProfile#getJobPhone()}
   *   <li>{@link BaseProfile#getJobRole()}
   *   <li>{@link BaseProfile#getJobTitle()}
   *   <li>{@link BaseProfile#getMarketCoverage()}
   *   <li>{@link BaseProfile#getMobile()}
   *   <li>{@link BaseProfile#getResponsibility()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void BaseProfile.<init>()",
    "BaseProfile BaseProfile.assetClassesOfInterest(List)",
    "BaseProfile BaseProfile.companyName(String)",
    "BaseProfile BaseProfile.displayName(String)",
    "BaseProfile BaseProfile.email(String)",
    "BaseProfile BaseProfile.function(Set)",
    "List BaseProfile.getAssetClassesOfInterest()",
    "String BaseProfile.getCompanyName()",
    "String BaseProfile.getDisplayName()",
    "String BaseProfile.getEmail()",
    "Set BaseProfile.getFunction()",
    "List BaseProfile.getIndustryOfInterest()",
    "Set BaseProfile.getInstrument()",
    "String BaseProfile.getJobCity()",
    "String BaseProfile.getJobDepartment()",
    "String BaseProfile.getJobDivision()",
    "String BaseProfile.getJobPhone()",
    "String BaseProfile.getJobRole()",
    "String BaseProfile.getJobTitle()",
    "Set BaseProfile.getMarketCoverage()",
    "String BaseProfile.getMobile()",
    "Set BaseProfile.getResponsibility()",
    "BaseProfile BaseProfile.industryOfInterest(List)",
    "BaseProfile BaseProfile.instrument(Set)",
    "BaseProfile BaseProfile.jobCity(String)",
    "BaseProfile BaseProfile.jobDepartment(String)",
    "BaseProfile BaseProfile.jobDivision(String)",
    "BaseProfile BaseProfile.jobPhone(String)",
    "BaseProfile BaseProfile.jobRole(String)",
    "BaseProfile BaseProfile.jobTitle(String)",
    "BaseProfile BaseProfile.marketCoverage(Set)",
    "BaseProfile BaseProfile.mobile(String)",
    "BaseProfile BaseProfile.responsibility(Set)",
    "void BaseProfile.setAssetClassesOfInterest(List)",
    "void BaseProfile.setCompanyName(String)",
    "void BaseProfile.setDisplayName(String)",
    "void BaseProfile.setEmail(String)",
    "void BaseProfile.setFunction(Set)",
    "void BaseProfile.setIndustryOfInterest(List)",
    "void BaseProfile.setInstrument(Set)",
    "void BaseProfile.setJobCity(String)",
    "void BaseProfile.setJobDepartment(String)",
    "void BaseProfile.setJobDivision(String)",
    "void BaseProfile.setJobPhone(String)",
    "void BaseProfile.setJobRole(String)",
    "void BaseProfile.setJobTitle(String)",
    "void BaseProfile.setMarketCoverage(Set)",
    "void BaseProfile.setMobile(String)",
    "void BaseProfile.setResponsibility(Set)",
    "String BaseProfile.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    BaseProfile actualBaseProfile = new BaseProfile();
    BaseProfile actualAssetClassesOfInterestResult =
        actualBaseProfile.assetClassesOfInterest(new ArrayList<>());
    BaseProfile actualCompanyNameResult = actualBaseProfile.companyName("Company Name");
    BaseProfile actualDisplayNameResult = actualBaseProfile.displayName("Display Name");
    BaseProfile actualEmailResult = actualBaseProfile.email("jane.doe@example.org");
    BaseProfile actualFunctionResult = actualBaseProfile.function(new HashSet<>());
    BaseProfile actualIndustryOfInterestResult =
        actualBaseProfile.industryOfInterest(new ArrayList<>());
    BaseProfile actualInstrumentResult = actualBaseProfile.instrument(new HashSet<>());
    BaseProfile actualJobCityResult = actualBaseProfile.jobCity("Job City");
    BaseProfile actualJobDepartmentResult = actualBaseProfile.jobDepartment("Job Department");
    BaseProfile actualJobDivisionResult = actualBaseProfile.jobDivision("Job Division");
    BaseProfile actualJobPhoneResult = actualBaseProfile.jobPhone("6625550144");
    BaseProfile actualJobRoleResult = actualBaseProfile.jobRole("Job Role");
    BaseProfile actualJobTitleResult = actualBaseProfile.jobTitle("Dr");
    BaseProfile actualMarketCoverageResult = actualBaseProfile.marketCoverage(new HashSet<>());
    BaseProfile actualMobileResult = actualBaseProfile.mobile("Mobile");
    BaseProfile actualResponsibilityResult = actualBaseProfile.responsibility(new HashSet<>());
    ArrayList<String> assetClassesOfInterest = new ArrayList<>();
    actualBaseProfile.setAssetClassesOfInterest(assetClassesOfInterest);
    actualBaseProfile.setCompanyName("Company Name");
    actualBaseProfile.setDisplayName("Display Name");
    actualBaseProfile.setEmail("jane.doe@example.org");
    HashSet<String> function = new HashSet<>();
    actualBaseProfile.setFunction(function);
    ArrayList<String> industryOfInterest = new ArrayList<>();
    actualBaseProfile.setIndustryOfInterest(industryOfInterest);
    HashSet<String> instrument = new HashSet<>();
    actualBaseProfile.setInstrument(instrument);
    actualBaseProfile.setJobCity("Job City");
    actualBaseProfile.setJobDepartment("Job Department");
    actualBaseProfile.setJobDivision("Job Division");
    actualBaseProfile.setJobPhone("6625550144");
    actualBaseProfile.setJobRole("Job Role");
    actualBaseProfile.setJobTitle("Dr");
    HashSet<String> marketCoverage = new HashSet<>();
    actualBaseProfile.setMarketCoverage(marketCoverage);
    actualBaseProfile.setMobile("Mobile");
    HashSet<String> responsibility = new HashSet<>();
    actualBaseProfile.setResponsibility(responsibility);
    String actualToStringResult = actualBaseProfile.toString();
    List<String> actualAssetClassesOfInterest = actualBaseProfile.getAssetClassesOfInterest();
    String actualCompanyName = actualBaseProfile.getCompanyName();
    String actualDisplayName = actualBaseProfile.getDisplayName();
    String actualEmail = actualBaseProfile.getEmail();
    Set<String> actualFunction = actualBaseProfile.getFunction();
    List<String> actualIndustryOfInterest = actualBaseProfile.getIndustryOfInterest();
    Set<String> actualInstrument = actualBaseProfile.getInstrument();
    String actualJobCity = actualBaseProfile.getJobCity();
    String actualJobDepartment = actualBaseProfile.getJobDepartment();
    String actualJobDivision = actualBaseProfile.getJobDivision();
    String actualJobPhone = actualBaseProfile.getJobPhone();
    String actualJobRole = actualBaseProfile.getJobRole();
    String actualJobTitle = actualBaseProfile.getJobTitle();
    Set<String> actualMarketCoverage = actualBaseProfile.getMarketCoverage();
    String actualMobile = actualBaseProfile.getMobile();
    Set<String> actualResponsibility = actualBaseProfile.getResponsibility();

    // Assert
    assertEquals("6625550144", actualJobPhone);
    assertEquals("Company Name", actualCompanyName);
    assertEquals("Display Name", actualDisplayName);
    assertEquals("Dr", actualJobTitle);
    assertEquals("Job City", actualJobCity);
    assertEquals("Job Department", actualJobDepartment);
    assertEquals("Job Division", actualJobDivision);
    assertEquals("Job Role", actualJobRole);
    assertEquals("Mobile", actualMobile);
    assertEquals(
        "class BaseProfile {\n"
            + "    displayName: Display Name\n"
            + "    companyName: Company Name\n"
            + "    email: jane.doe@example.org\n"
            + "    mobile: Mobile\n"
            + "    jobTitle: Dr\n"
            + "    jobRole: Job Role\n"
            + "    jobDepartment: Job Department\n"
            + "    jobDivision: Job Division\n"
            + "    jobPhone: 6625550144\n"
            + "    jobCity: Job City\n"
            + "    industryOfInterest: []\n"
            + "    assetClassesOfInterest: []\n"
            + "    marketCoverage: []\n"
            + "    responsibility: []\n"
            + "    function: []\n"
            + "    instrument: []\n"
            + "}",
        actualToStringResult);
    assertEquals("jane.doe@example.org", actualEmail);
    assertTrue(actualAssetClassesOfInterest.isEmpty());
    assertTrue(actualIndustryOfInterest.isEmpty());
    assertTrue(actualFunction.isEmpty());
    assertTrue(actualInstrument.isEmpty());
    assertTrue(actualMarketCoverage.isEmpty());
    assertTrue(actualResponsibility.isEmpty());
    assertSame(actualBaseProfile, actualAssetClassesOfInterestResult);
    assertSame(actualBaseProfile, actualCompanyNameResult);
    assertSame(actualBaseProfile, actualDisplayNameResult);
    assertSame(actualBaseProfile, actualEmailResult);
    assertSame(actualBaseProfile, actualFunctionResult);
    assertSame(actualBaseProfile, actualIndustryOfInterestResult);
    assertSame(actualBaseProfile, actualInstrumentResult);
    assertSame(actualBaseProfile, actualJobCityResult);
    assertSame(actualBaseProfile, actualJobDepartmentResult);
    assertSame(actualBaseProfile, actualJobDivisionResult);
    assertSame(actualBaseProfile, actualJobPhoneResult);
    assertSame(actualBaseProfile, actualJobRoleResult);
    assertSame(actualBaseProfile, actualJobTitleResult);
    assertSame(actualBaseProfile, actualMarketCoverageResult);
    assertSame(actualBaseProfile, actualMobileResult);
    assertSame(actualBaseProfile, actualResponsibilityResult);
    assertSame(assetClassesOfInterest, actualAssetClassesOfInterest);
    assertSame(industryOfInterest, actualIndustryOfInterest);
    assertSame(function, actualFunction);
    assertSame(instrument, actualInstrument);
    assertSame(marketCoverage, actualMarketCoverage);
    assertSame(responsibility, actualResponsibility);
  }
}
