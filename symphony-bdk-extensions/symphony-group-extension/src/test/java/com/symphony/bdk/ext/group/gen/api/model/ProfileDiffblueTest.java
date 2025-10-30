package com.symphony.bdk.ext.group.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ProfileDiffblueTest {
  /**
   * Test {@link Profile#addIndustryOfInterestItem(String)}.
   * <ul>
   *   <li>Given {@link Profile} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link Profile#addIndustryOfInterestItem(String)}
   */
  @Test
  @DisplayName("Test addIndustryOfInterestItem(String); given Profile (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Profile Profile.addIndustryOfInterestItem(String)"})
  void testAddIndustryOfInterestItem_givenProfile() {
    // Arrange
    Profile profile = new Profile();

    // Act and Assert
    assertSame(profile, profile.addIndustryOfInterestItem("Industry Of Interest Item"));
  }

  /**
   * Test {@link Profile#addIndustryOfInterestItem(String)}.
   * <ul>
   *   <li>Given {@link Profile} (default constructor) industryOfInterest {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Profile#addIndustryOfInterestItem(String)}
   */
  @Test
  @DisplayName("Test addIndustryOfInterestItem(String); given Profile (default constructor) industryOfInterest ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Profile Profile.addIndustryOfInterestItem(String)"})
  void testAddIndustryOfInterestItem_givenProfileIndustryOfInterestArrayList() {
    // Arrange
    Profile profile = new Profile();
    profile.industryOfInterest(new ArrayList<>());

    // Act and Assert
    assertSame(profile, profile.addIndustryOfInterestItem("Industry Of Interest Item"));
  }

  /**
   * Test {@link Profile#addAssetClassesOfInterestItem(String)}.
   * <ul>
   *   <li>Given {@link Profile} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link Profile#addAssetClassesOfInterestItem(String)}
   */
  @Test
  @DisplayName("Test addAssetClassesOfInterestItem(String); given Profile (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Profile Profile.addAssetClassesOfInterestItem(String)"})
  void testAddAssetClassesOfInterestItem_givenProfile() {
    // Arrange
    Profile profile = new Profile();

    // Act and Assert
    assertSame(profile, profile.addAssetClassesOfInterestItem("Asset Classes Of Interest Item"));
  }

  /**
   * Test {@link Profile#addAssetClassesOfInterestItem(String)}.
   * <ul>
   *   <li>Given {@link Profile} (default constructor) assetClassesOfInterest {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Profile#addAssetClassesOfInterestItem(String)}
   */
  @Test
  @DisplayName("Test addAssetClassesOfInterestItem(String); given Profile (default constructor) assetClassesOfInterest ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Profile Profile.addAssetClassesOfInterestItem(String)"})
  void testAddAssetClassesOfInterestItem_givenProfileAssetClassesOfInterestArrayList() {
    // Arrange
    Profile profile = new Profile();
    profile.assetClassesOfInterest(new ArrayList<>());

    // Act and Assert
    assertSame(profile, profile.addAssetClassesOfInterestItem("Asset Classes Of Interest Item"));
  }

  /**
   * Test {@link Profile#addMarketCoverageItem(String)}.
   * <ul>
   *   <li>Given {@link Profile} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link Profile#addMarketCoverageItem(String)}
   */
  @Test
  @DisplayName("Test addMarketCoverageItem(String); given Profile (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Profile Profile.addMarketCoverageItem(String)"})
  void testAddMarketCoverageItem_givenProfile() {
    // Arrange
    Profile profile = new Profile();

    // Act and Assert
    assertSame(profile, profile.addMarketCoverageItem("Market Coverage Item"));
  }

  /**
   * Test {@link Profile#addMarketCoverageItem(String)}.
   * <ul>
   *   <li>Given {@link Profile} (default constructor) marketCoverage {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Profile#addMarketCoverageItem(String)}
   */
  @Test
  @DisplayName("Test addMarketCoverageItem(String); given Profile (default constructor) marketCoverage HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Profile Profile.addMarketCoverageItem(String)"})
  void testAddMarketCoverageItem_givenProfileMarketCoverageHashSet() {
    // Arrange
    Profile profile = new Profile();
    profile.marketCoverage(new HashSet<>());

    // Act and Assert
    assertSame(profile, profile.addMarketCoverageItem("Market Coverage Item"));
  }

  /**
   * Test {@link Profile#addResponsibilityItem(String)}.
   * <ul>
   *   <li>Given {@link Profile} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link Profile#addResponsibilityItem(String)}
   */
  @Test
  @DisplayName("Test addResponsibilityItem(String); given Profile (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Profile Profile.addResponsibilityItem(String)"})
  void testAddResponsibilityItem_givenProfile() {
    // Arrange
    Profile profile = new Profile();

    // Act and Assert
    assertSame(profile, profile.addResponsibilityItem("Responsibility Item"));
  }

  /**
   * Test {@link Profile#addResponsibilityItem(String)}.
   * <ul>
   *   <li>Given {@link Profile} (default constructor) responsibility {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Profile#addResponsibilityItem(String)}
   */
  @Test
  @DisplayName("Test addResponsibilityItem(String); given Profile (default constructor) responsibility HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Profile Profile.addResponsibilityItem(String)"})
  void testAddResponsibilityItem_givenProfileResponsibilityHashSet() {
    // Arrange
    Profile profile = new Profile();
    profile.responsibility(new HashSet<>());

    // Act and Assert
    assertSame(profile, profile.addResponsibilityItem("Responsibility Item"));
  }

  /**
   * Test {@link Profile#addFunctionItem(String)}.
   * <ul>
   *   <li>Given {@link Profile} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link Profile#addFunctionItem(String)}
   */
  @Test
  @DisplayName("Test addFunctionItem(String); given Profile (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Profile Profile.addFunctionItem(String)"})
  void testAddFunctionItem_givenProfile() {
    // Arrange
    Profile profile = new Profile();

    // Act and Assert
    assertSame(profile, profile.addFunctionItem("Function Item"));
  }

  /**
   * Test {@link Profile#addFunctionItem(String)}.
   * <ul>
   *   <li>Given {@link Profile} (default constructor) function {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Profile#addFunctionItem(String)}
   */
  @Test
  @DisplayName("Test addFunctionItem(String); given Profile (default constructor) function HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Profile Profile.addFunctionItem(String)"})
  void testAddFunctionItem_givenProfileFunctionHashSet() {
    // Arrange
    Profile profile = new Profile();
    profile.function(new HashSet<>());

    // Act and Assert
    assertSame(profile, profile.addFunctionItem("Function Item"));
  }

  /**
   * Test {@link Profile#addInstrumentItem(String)}.
   * <ul>
   *   <li>Given {@link Profile} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link Profile#addInstrumentItem(String)}
   */
  @Test
  @DisplayName("Test addInstrumentItem(String); given Profile (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Profile Profile.addInstrumentItem(String)"})
  void testAddInstrumentItem_givenProfile() {
    // Arrange
    Profile profile = new Profile();

    // Act and Assert
    assertSame(profile, profile.addInstrumentItem("Instrument Item"));
  }

  /**
   * Test {@link Profile#addInstrumentItem(String)}.
   * <ul>
   *   <li>Given {@link Profile} (default constructor) instrument {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Profile#addInstrumentItem(String)}
   */
  @Test
  @DisplayName("Test addInstrumentItem(String); given Profile (default constructor) instrument HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Profile Profile.addInstrumentItem(String)"})
  void testAddInstrumentItem_givenProfileInstrumentHashSet() {
    // Arrange
    Profile profile = new Profile();
    profile.instrument(new HashSet<>());

    // Act and Assert
    assertSame(profile, profile.addInstrumentItem("Instrument Item"));
  }

  /**
   * Test {@link Profile#addAvatarsItem(Avatar)}.
   * <ul>
   *   <li>Given {@link Profile} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link Profile#addAvatarsItem(Avatar)}
   */
  @Test
  @DisplayName("Test addAvatarsItem(Avatar); given Profile (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Profile Profile.addAvatarsItem(Avatar)"})
  void testAddAvatarsItem_givenProfile() {
    // Arrange
    Profile profile = new Profile();

    // Act and Assert
    assertSame(profile, profile.addAvatarsItem(new Avatar()));
  }

  /**
   * Test {@link Profile#addAvatarsItem(Avatar)}.
   * <ul>
   *   <li>Given {@link Profile} (default constructor) avatars {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Profile#addAvatarsItem(Avatar)}
   */
  @Test
  @DisplayName("Test addAvatarsItem(Avatar); given Profile (default constructor) avatars ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Profile Profile.addAvatarsItem(Avatar)"})
  void testAddAvatarsItem_givenProfileAvatarsArrayList() {
    // Arrange
    Profile profile = new Profile();
    profile.avatars(new ArrayList<>());

    // Act and Assert
    assertSame(profile, profile.addAvatarsItem(new Avatar()));
  }

  /**
   * Test {@link Profile#equals(Object)}, and {@link Profile#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Profile#equals(Object)}
   *   <li>{@link Profile#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Profile.equals(Object)", "int Profile.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Profile profile = new Profile();
    Profile profile2 = new Profile();

    // Act and Assert
    assertEquals(profile, profile2);
    int expectedHashCodeResult = profile.hashCode();
    assertEquals(expectedHashCodeResult, profile2.hashCode());
  }

  /**
   * Test {@link Profile#equals(Object)}, and {@link Profile#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Profile#equals(Object)}
   *   <li>{@link Profile#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Profile.equals(Object)", "int Profile.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Profile profile = new Profile();

    // Act and Assert
    assertEquals(profile, profile);
    int expectedHashCodeResult = profile.hashCode();
    assertEquals(expectedHashCodeResult, profile.hashCode());
  }

  /**
   * Test {@link Profile#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Profile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Profile.equals(Object)", "int Profile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Profile profile = new Profile();
    profile.addIndustryOfInterestItem("Industry Of Interest Item");

    // Act and Assert
    assertNotEquals(profile, new Profile());
  }

  /**
   * Test {@link Profile#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Profile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Profile.equals(Object)", "int Profile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Profile profile = new Profile();
    profile.displayName("Display Name");
    profile.addIndustryOfInterestItem("Industry Of Interest Item");

    // Act and Assert
    assertNotEquals(profile, new Profile());
  }

  /**
   * Test {@link Profile#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Profile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Profile.equals(Object)", "int Profile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Profile profile = new Profile();
    profile.companyName("Company Name");
    profile.addIndustryOfInterestItem("Industry Of Interest Item");

    // Act and Assert
    assertNotEquals(profile, new Profile());
  }

  /**
   * Test {@link Profile#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Profile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Profile.equals(Object)", "int Profile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    Profile profile = new Profile();
    profile.email("jane.doe@example.org");
    profile.addIndustryOfInterestItem("Industry Of Interest Item");

    // Act and Assert
    assertNotEquals(profile, new Profile());
  }

  /**
   * Test {@link Profile#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Profile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Profile.equals(Object)", "int Profile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    Profile profile = new Profile();
    profile.mobile("Mobile");
    profile.addIndustryOfInterestItem("Industry Of Interest Item");

    // Act and Assert
    assertNotEquals(profile, new Profile());
  }

  /**
   * Test {@link Profile#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Profile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Profile.equals(Object)", "int Profile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    Profile profile = new Profile();
    profile.jobTitle("Dr");
    profile.addIndustryOfInterestItem("Industry Of Interest Item");

    // Act and Assert
    assertNotEquals(profile, new Profile());
  }

  /**
   * Test {@link Profile#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Profile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Profile.equals(Object)", "int Profile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    Profile profile = new Profile();
    profile.jobRole("Job Role");
    profile.addIndustryOfInterestItem("Industry Of Interest Item");

    // Act and Assert
    assertNotEquals(profile, new Profile());
  }

  /**
   * Test {@link Profile#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Profile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Profile.equals(Object)", "int Profile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    Profile profile = new Profile();
    profile.jobDepartment("Job Department");
    profile.addIndustryOfInterestItem("Industry Of Interest Item");

    // Act and Assert
    assertNotEquals(profile, new Profile());
  }

  /**
   * Test {@link Profile#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Profile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Profile.equals(Object)", "int Profile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    Profile profile = new Profile();
    profile.jobDivision("Job Division");
    profile.addIndustryOfInterestItem("Industry Of Interest Item");

    // Act and Assert
    assertNotEquals(profile, new Profile());
  }

  /**
   * Test {@link Profile#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Profile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Profile.equals(Object)", "int Profile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual10() {
    // Arrange
    Profile profile = new Profile();
    profile.jobPhone("6625550144");
    profile.addIndustryOfInterestItem("Industry Of Interest Item");

    // Act and Assert
    assertNotEquals(profile, new Profile());
  }

  /**
   * Test {@link Profile#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Profile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Profile.equals(Object)", "int Profile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual11() {
    // Arrange
    Profile profile = new Profile();
    profile.jobCity("Job City");
    profile.addIndustryOfInterestItem("Industry Of Interest Item");

    // Act and Assert
    assertNotEquals(profile, new Profile());
  }

  /**
   * Test {@link Profile#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Profile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Profile.equals(Object)", "int Profile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual12() {
    // Arrange
    Profile profile = new Profile();
    profile.addAssetClassesOfInterestItem("Asset Classes Of Interest Item");

    // Act and Assert
    assertNotEquals(profile, new Profile());
  }

  /**
   * Test {@link Profile#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Profile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Profile.equals(Object)", "int Profile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual13() {
    // Arrange
    Profile profile = new Profile();
    profile.addMarketCoverageItem("Market Coverage Item");

    // Act and Assert
    assertNotEquals(profile, new Profile());
  }

  /**
   * Test {@link Profile#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Profile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Profile.equals(Object)", "int Profile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual14() {
    // Arrange
    Profile profile = new Profile();
    profile.addResponsibilityItem("Responsibility Item");

    // Act and Assert
    assertNotEquals(profile, new Profile());
  }

  /**
   * Test {@link Profile#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Profile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Profile.equals(Object)", "int Profile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual15() {
    // Arrange
    Profile profile = new Profile();
    profile.addFunctionItem("Function Item");

    // Act and Assert
    assertNotEquals(profile, new Profile());
  }

  /**
   * Test {@link Profile#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Profile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Profile.equals(Object)", "int Profile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual16() {
    // Arrange
    Profile profile = new Profile();
    profile.addInstrumentItem("Instrument Item");

    // Act and Assert
    assertNotEquals(profile, new Profile());
  }

  /**
   * Test {@link Profile#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Profile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Profile.equals(Object)", "int Profile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual17() {
    // Arrange
    Profile profile = new Profile();
    profile.addAvatarsItem(new Avatar());

    // Act and Assert
    assertNotEquals(profile, new Profile());
  }

  /**
   * Test {@link Profile#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Profile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Profile.equals(Object)", "int Profile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual18() {
    // Arrange
    Profile profile = new Profile();
    profile.id("42");
    profile.addAvatarsItem(new Avatar());

    // Act and Assert
    assertNotEquals(profile, new Profile());
  }

  /**
   * Test {@link Profile#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Profile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Profile.equals(Object)", "int Profile.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Profile(), null);
  }

  /**
   * Test {@link Profile#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Profile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Profile.equals(Object)", "int Profile.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Profile(), "Different type to Profile");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link Profile}
   *   <li>{@link Profile#assetClassesOfInterest(List)}
   *   <li>{@link Profile#avatars(List)}
   *   <li>{@link Profile#companyName(String)}
   *   <li>{@link Profile#displayName(String)}
   *   <li>{@link Profile#email(String)}
   *   <li>{@link Profile#function(Set)}
   *   <li>{@link Profile#id(String)}
   *   <li>{@link Profile#industryOfInterest(List)}
   *   <li>{@link Profile#instrument(Set)}
   *   <li>{@link Profile#jobCity(String)}
   *   <li>{@link Profile#jobDepartment(String)}
   *   <li>{@link Profile#jobDivision(String)}
   *   <li>{@link Profile#jobPhone(String)}
   *   <li>{@link Profile#jobRole(String)}
   *   <li>{@link Profile#jobTitle(String)}
   *   <li>{@link Profile#marketCoverage(Set)}
   *   <li>{@link Profile#mobile(String)}
   *   <li>{@link Profile#responsibility(Set)}
   *   <li>{@link Profile#setAssetClassesOfInterest(List)}
   *   <li>{@link Profile#setAvatars(List)}
   *   <li>{@link Profile#setCompanyName(String)}
   *   <li>{@link Profile#setDisplayName(String)}
   *   <li>{@link Profile#setEmail(String)}
   *   <li>{@link Profile#setFunction(Set)}
   *   <li>{@link Profile#setId(String)}
   *   <li>{@link Profile#setIndustryOfInterest(List)}
   *   <li>{@link Profile#setInstrument(Set)}
   *   <li>{@link Profile#setJobCity(String)}
   *   <li>{@link Profile#setJobDepartment(String)}
   *   <li>{@link Profile#setJobDivision(String)}
   *   <li>{@link Profile#setJobPhone(String)}
   *   <li>{@link Profile#setJobRole(String)}
   *   <li>{@link Profile#setJobTitle(String)}
   *   <li>{@link Profile#setMarketCoverage(Set)}
   *   <li>{@link Profile#setMobile(String)}
   *   <li>{@link Profile#setResponsibility(Set)}
   *   <li>{@link Profile#toString()}
   *   <li>{@link Profile#getAssetClassesOfInterest()}
   *   <li>{@link Profile#getAvatars()}
   *   <li>{@link Profile#getCompanyName()}
   *   <li>{@link Profile#getDisplayName()}
   *   <li>{@link Profile#getEmail()}
   *   <li>{@link Profile#getFunction()}
   *   <li>{@link Profile#getId()}
   *   <li>{@link Profile#getIndustryOfInterest()}
   *   <li>{@link Profile#getInstrument()}
   *   <li>{@link Profile#getJobCity()}
   *   <li>{@link Profile#getJobDepartment()}
   *   <li>{@link Profile#getJobDivision()}
   *   <li>{@link Profile#getJobPhone()}
   *   <li>{@link Profile#getJobRole()}
   *   <li>{@link Profile#getJobTitle()}
   *   <li>{@link Profile#getMarketCoverage()}
   *   <li>{@link Profile#getMobile()}
   *   <li>{@link Profile#getResponsibility()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void Profile.<init>()", "Profile Profile.assetClassesOfInterest(List)",
      "Profile Profile.avatars(List)", "Profile Profile.companyName(String)", "Profile Profile.displayName(String)",
      "Profile Profile.email(String)", "Profile Profile.function(Set)", "List Profile.getAssetClassesOfInterest()",
      "List Profile.getAvatars()", "String Profile.getCompanyName()", "String Profile.getDisplayName()",
      "String Profile.getEmail()", "Set Profile.getFunction()", "String Profile.getId()",
      "List Profile.getIndustryOfInterest()", "Set Profile.getInstrument()", "String Profile.getJobCity()",
      "String Profile.getJobDepartment()", "String Profile.getJobDivision()", "String Profile.getJobPhone()",
      "String Profile.getJobRole()", "String Profile.getJobTitle()", "Set Profile.getMarketCoverage()",
      "String Profile.getMobile()", "Set Profile.getResponsibility()", "Profile Profile.id(String)",
      "Profile Profile.industryOfInterest(List)", "Profile Profile.instrument(Set)", "Profile Profile.jobCity(String)",
      "Profile Profile.jobDepartment(String)", "Profile Profile.jobDivision(String)",
      "Profile Profile.jobPhone(String)", "Profile Profile.jobRole(String)", "Profile Profile.jobTitle(String)",
      "Profile Profile.marketCoverage(Set)", "Profile Profile.mobile(String)", "Profile Profile.responsibility(Set)",
      "void Profile.setAssetClassesOfInterest(List)", "void Profile.setAvatars(List)",
      "void Profile.setCompanyName(String)", "void Profile.setDisplayName(String)", "void Profile.setEmail(String)",
      "void Profile.setFunction(Set)", "void Profile.setId(String)", "void Profile.setIndustryOfInterest(List)",
      "void Profile.setInstrument(Set)", "void Profile.setJobCity(String)", "void Profile.setJobDepartment(String)",
      "void Profile.setJobDivision(String)", "void Profile.setJobPhone(String)", "void Profile.setJobRole(String)",
      "void Profile.setJobTitle(String)", "void Profile.setMarketCoverage(Set)", "void Profile.setMobile(String)",
      "void Profile.setResponsibility(Set)", "String Profile.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    Profile actualProfile = new Profile();
    Profile actualAssetClassesOfInterestResult = actualProfile.assetClassesOfInterest(new ArrayList<>());
    Profile actualAvatarsResult = actualProfile.avatars(new ArrayList<>());
    Profile actualCompanyNameResult = actualProfile.companyName("Company Name");
    Profile actualDisplayNameResult = actualProfile.displayName("Display Name");
    Profile actualEmailResult = actualProfile.email("jane.doe@example.org");
    Profile actualFunctionResult = actualProfile.function(new HashSet<>());
    Profile actualIdResult = actualProfile.id("42");
    Profile actualIndustryOfInterestResult = actualProfile.industryOfInterest(new ArrayList<>());
    Profile actualInstrumentResult = actualProfile.instrument(new HashSet<>());
    Profile actualJobCityResult = actualProfile.jobCity("Job City");
    Profile actualJobDepartmentResult = actualProfile.jobDepartment("Job Department");
    Profile actualJobDivisionResult = actualProfile.jobDivision("Job Division");
    Profile actualJobPhoneResult = actualProfile.jobPhone("6625550144");
    Profile actualJobRoleResult = actualProfile.jobRole("Job Role");
    Profile actualJobTitleResult = actualProfile.jobTitle("Dr");
    Profile actualMarketCoverageResult = actualProfile.marketCoverage(new HashSet<>());
    Profile actualMobileResult = actualProfile.mobile("Mobile");
    Profile actualResponsibilityResult = actualProfile.responsibility(new HashSet<>());
    ArrayList<String> assetClassesOfInterest = new ArrayList<>();
    actualProfile.setAssetClassesOfInterest(assetClassesOfInterest);
    ArrayList<Avatar> avatars = new ArrayList<>();
    actualProfile.setAvatars(avatars);
    actualProfile.setCompanyName("Company Name");
    actualProfile.setDisplayName("Display Name");
    actualProfile.setEmail("jane.doe@example.org");
    HashSet<String> function = new HashSet<>();
    actualProfile.setFunction(function);
    actualProfile.setId("42");
    ArrayList<String> industryOfInterest = new ArrayList<>();
    actualProfile.setIndustryOfInterest(industryOfInterest);
    HashSet<String> instrument = new HashSet<>();
    actualProfile.setInstrument(instrument);
    actualProfile.setJobCity("Job City");
    actualProfile.setJobDepartment("Job Department");
    actualProfile.setJobDivision("Job Division");
    actualProfile.setJobPhone("6625550144");
    actualProfile.setJobRole("Job Role");
    actualProfile.setJobTitle("Dr");
    HashSet<String> marketCoverage = new HashSet<>();
    actualProfile.setMarketCoverage(marketCoverage);
    actualProfile.setMobile("Mobile");
    HashSet<String> responsibility = new HashSet<>();
    actualProfile.setResponsibility(responsibility);
    String actualToStringResult = actualProfile.toString();
    List<String> actualAssetClassesOfInterest = actualProfile.getAssetClassesOfInterest();
    List<Avatar> actualAvatars = actualProfile.getAvatars();
    String actualCompanyName = actualProfile.getCompanyName();
    String actualDisplayName = actualProfile.getDisplayName();
    String actualEmail = actualProfile.getEmail();
    Set<String> actualFunction = actualProfile.getFunction();
    String actualId = actualProfile.getId();
    List<String> actualIndustryOfInterest = actualProfile.getIndustryOfInterest();
    Set<String> actualInstrument = actualProfile.getInstrument();
    String actualJobCity = actualProfile.getJobCity();
    String actualJobDepartment = actualProfile.getJobDepartment();
    String actualJobDivision = actualProfile.getJobDivision();
    String actualJobPhone = actualProfile.getJobPhone();
    String actualJobRole = actualProfile.getJobRole();
    String actualJobTitle = actualProfile.getJobTitle();
    Set<String> actualMarketCoverage = actualProfile.getMarketCoverage();
    String actualMobile = actualProfile.getMobile();
    Set<String> actualResponsibility = actualProfile.getResponsibility();

    // Assert
    assertEquals("42", actualId);
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
        "class Profile {\n" + "    displayName: Display Name\n" + "    companyName: Company Name\n"
            + "    email: jane.doe@example.org\n" + "    mobile: Mobile\n" + "    jobTitle: Dr\n"
            + "    jobRole: Job Role\n" + "    jobDepartment: Job Department\n" + "    jobDivision: Job Division\n"
            + "    jobPhone: 6625550144\n" + "    jobCity: Job City\n" + "    industryOfInterest: []\n"
            + "    assetClassesOfInterest: []\n" + "    marketCoverage: []\n" + "    responsibility: []\n"
            + "    function: []\n" + "    instrument: []\n" + "    id: 42\n" + "    avatars: []\n" + "}",
        actualToStringResult);
    assertEquals("jane.doe@example.org", actualEmail);
    assertTrue(actualAssetClassesOfInterest.isEmpty());
    assertTrue(actualAvatars.isEmpty());
    assertTrue(actualIndustryOfInterest.isEmpty());
    assertTrue(actualFunction.isEmpty());
    assertTrue(actualInstrument.isEmpty());
    assertTrue(actualMarketCoverage.isEmpty());
    assertTrue(actualResponsibility.isEmpty());
    assertSame(actualProfile, actualAssetClassesOfInterestResult);
    assertSame(actualProfile, actualAvatarsResult);
    assertSame(actualProfile, actualCompanyNameResult);
    assertSame(actualProfile, actualDisplayNameResult);
    assertSame(actualProfile, actualEmailResult);
    assertSame(actualProfile, actualFunctionResult);
    assertSame(actualProfile, actualIdResult);
    assertSame(actualProfile, actualIndustryOfInterestResult);
    assertSame(actualProfile, actualInstrumentResult);
    assertSame(actualProfile, actualJobCityResult);
    assertSame(actualProfile, actualJobDepartmentResult);
    assertSame(actualProfile, actualJobDivisionResult);
    assertSame(actualProfile, actualJobPhoneResult);
    assertSame(actualProfile, actualJobRoleResult);
    assertSame(actualProfile, actualJobTitleResult);
    assertSame(actualProfile, actualMarketCoverageResult);
    assertSame(actualProfile, actualMobileResult);
    assertSame(actualProfile, actualResponsibilityResult);
    assertSame(assetClassesOfInterest, actualAssetClassesOfInterest);
    assertSame(avatars, actualAvatars);
    assertSame(industryOfInterest, actualIndustryOfInterest);
    assertSame(function, actualFunction);
    assertSame(instrument, actualInstrument);
    assertSame(marketCoverage, actualMarketCoverage);
    assertSame(responsibility, actualResponsibility);
  }
}
