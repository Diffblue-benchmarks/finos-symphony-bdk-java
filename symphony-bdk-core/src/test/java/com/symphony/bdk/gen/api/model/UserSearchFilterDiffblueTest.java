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

class UserSearchFilterDiffblueTest {
  /**
   * Test {@link UserSearchFilter#addAccountTypesItem(String)}.
   *
   * <ul>
   *   <li>Given {@link UserSearchFilter} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link UserSearchFilter#addAccountTypesItem(String)}
   */
  @Test
  @DisplayName("Test addAccountTypesItem(String); given UserSearchFilter (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UserSearchFilter UserSearchFilter.addAccountTypesItem(String)"})
  void testAddAccountTypesItem_givenUserSearchFilter() {
    // Arrange
    UserSearchFilter userSearchFilter = new UserSearchFilter();

    // Act and Assert
    assertSame(userSearchFilter, userSearchFilter.addAccountTypesItem("3"));
  }

  /**
   * Test {@link UserSearchFilter#addAccountTypesItem(String)}.
   *
   * <ul>
   *   <li>Given {@link UserSearchFilter} (default constructor) accountTypes {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link UserSearchFilter#addAccountTypesItem(String)}
   */
  @Test
  @DisplayName(
      "Test addAccountTypesItem(String); given UserSearchFilter (default constructor) accountTypes ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UserSearchFilter UserSearchFilter.addAccountTypesItem(String)"})
  void testAddAccountTypesItem_givenUserSearchFilterAccountTypesArrayList() {
    // Arrange
    UserSearchFilter userSearchFilter = new UserSearchFilter();
    userSearchFilter.accountTypes(new ArrayList<>());

    // Act and Assert
    assertSame(userSearchFilter, userSearchFilter.addAccountTypesItem("3"));
  }

  /**
   * Test {@link UserSearchFilter#equals(Object)}, and {@link UserSearchFilter#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserSearchFilter#equals(Object)}
   *   <li>{@link UserSearchFilter#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSearchFilter.equals(Object)", "int UserSearchFilter.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserSearchFilter userSearchFilter = new UserSearchFilter();
    UserSearchFilter userSearchFilter2 = new UserSearchFilter();

    // Act and Assert
    assertEquals(userSearchFilter, userSearchFilter2);
    int expectedHashCodeResult = userSearchFilter.hashCode();
    assertEquals(expectedHashCodeResult, userSearchFilter2.hashCode());
  }

  /**
   * Test {@link UserSearchFilter#equals(Object)}, and {@link UserSearchFilter#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserSearchFilter#equals(Object)}
   *   <li>{@link UserSearchFilter#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSearchFilter.equals(Object)", "int UserSearchFilter.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserSearchFilter userSearchFilter = new UserSearchFilter();

    // Act and Assert
    assertEquals(userSearchFilter, userSearchFilter);
    int expectedHashCodeResult = userSearchFilter.hashCode();
    assertEquals(expectedHashCodeResult, userSearchFilter.hashCode());
  }

  /**
   * Test {@link UserSearchFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSearchFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSearchFilter.equals(Object)", "int UserSearchFilter.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    UserSearchFilter userSearchFilter = new UserSearchFilter();
    userSearchFilter.addAccountTypesItem("3");

    // Act and Assert
    assertNotEquals(userSearchFilter, new UserSearchFilter());
  }

  /**
   * Test {@link UserSearchFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSearchFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSearchFilter.equals(Object)", "int UserSearchFilter.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserSearchFilter userSearchFilter = new UserSearchFilter();
    userSearchFilter.title("Dr");

    // Act and Assert
    assertNotEquals(userSearchFilter, new UserSearchFilter());
  }

  /**
   * Test {@link UserSearchFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSearchFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSearchFilter.equals(Object)", "int UserSearchFilter.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserSearchFilter userSearchFilter = new UserSearchFilter();
    userSearchFilter.company("Company");

    // Act and Assert
    assertNotEquals(userSearchFilter, new UserSearchFilter());
  }

  /**
   * Test {@link UserSearchFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSearchFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSearchFilter.equals(Object)", "int UserSearchFilter.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    UserSearchFilter userSearchFilter = new UserSearchFilter();
    userSearchFilter.location("Location");

    // Act and Assert
    assertNotEquals(userSearchFilter, new UserSearchFilter());
  }

  /**
   * Test {@link UserSearchFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSearchFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSearchFilter.equals(Object)", "int UserSearchFilter.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    UserSearchFilter userSearchFilter = new UserSearchFilter();
    userSearchFilter.marketCoverage("Market Coverage");

    // Act and Assert
    assertNotEquals(userSearchFilter, new UserSearchFilter());
  }

  /**
   * Test {@link UserSearchFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSearchFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSearchFilter.equals(Object)", "int UserSearchFilter.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    UserSearchFilter userSearchFilter = new UserSearchFilter();
    userSearchFilter.responsibility("Responsibility");

    // Act and Assert
    assertNotEquals(userSearchFilter, new UserSearchFilter());
  }

  /**
   * Test {@link UserSearchFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSearchFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSearchFilter.equals(Object)", "int UserSearchFilter.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    UserSearchFilter userSearchFilter = new UserSearchFilter();
    userSearchFilter.function("Function");

    // Act and Assert
    assertNotEquals(userSearchFilter, new UserSearchFilter());
  }

  /**
   * Test {@link UserSearchFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSearchFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSearchFilter.equals(Object)", "int UserSearchFilter.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    UserSearchFilter userSearchFilter = new UserSearchFilter();
    userSearchFilter.instrument("Instrument");

    // Act and Assert
    assertNotEquals(userSearchFilter, new UserSearchFilter());
  }

  /**
   * Test {@link UserSearchFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSearchFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSearchFilter.equals(Object)", "int UserSearchFilter.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserSearchFilter(), null);
  }

  /**
   * Test {@link UserSearchFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSearchFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSearchFilter.equals(Object)", "int UserSearchFilter.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserSearchFilter(), "Different type to UserSearchFilter");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UserSearchFilter}
   *   <li>{@link UserSearchFilter#accountTypes(List)}
   *   <li>{@link UserSearchFilter#company(String)}
   *   <li>{@link UserSearchFilter#function(String)}
   *   <li>{@link UserSearchFilter#instrument(String)}
   *   <li>{@link UserSearchFilter#location(String)}
   *   <li>{@link UserSearchFilter#marketCoverage(String)}
   *   <li>{@link UserSearchFilter#responsibility(String)}
   *   <li>{@link UserSearchFilter#setAccountTypes(List)}
   *   <li>{@link UserSearchFilter#setCompany(String)}
   *   <li>{@link UserSearchFilter#setFunction(String)}
   *   <li>{@link UserSearchFilter#setInstrument(String)}
   *   <li>{@link UserSearchFilter#setLocation(String)}
   *   <li>{@link UserSearchFilter#setMarketCoverage(String)}
   *   <li>{@link UserSearchFilter#setResponsibility(String)}
   *   <li>{@link UserSearchFilter#setTitle(String)}
   *   <li>{@link UserSearchFilter#title(String)}
   *   <li>{@link UserSearchFilter#toString()}
   *   <li>{@link UserSearchFilter#getAccountTypes()}
   *   <li>{@link UserSearchFilter#getCompany()}
   *   <li>{@link UserSearchFilter#getFunction()}
   *   <li>{@link UserSearchFilter#getInstrument()}
   *   <li>{@link UserSearchFilter#getLocation()}
   *   <li>{@link UserSearchFilter#getMarketCoverage()}
   *   <li>{@link UserSearchFilter#getResponsibility()}
   *   <li>{@link UserSearchFilter#getTitle()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserSearchFilter.<init>()",
    "UserSearchFilter UserSearchFilter.accountTypes(List)",
    "UserSearchFilter UserSearchFilter.company(String)",
    "UserSearchFilter UserSearchFilter.function(String)",
    "List UserSearchFilter.getAccountTypes()",
    "String UserSearchFilter.getCompany()",
    "String UserSearchFilter.getFunction()",
    "String UserSearchFilter.getInstrument()",
    "String UserSearchFilter.getLocation()",
    "String UserSearchFilter.getMarketCoverage()",
    "String UserSearchFilter.getResponsibility()",
    "String UserSearchFilter.getTitle()",
    "UserSearchFilter UserSearchFilter.instrument(String)",
    "UserSearchFilter UserSearchFilter.location(String)",
    "UserSearchFilter UserSearchFilter.marketCoverage(String)",
    "UserSearchFilter UserSearchFilter.responsibility(String)",
    "void UserSearchFilter.setAccountTypes(List)",
    "void UserSearchFilter.setCompany(String)",
    "void UserSearchFilter.setFunction(String)",
    "void UserSearchFilter.setInstrument(String)",
    "void UserSearchFilter.setLocation(String)",
    "void UserSearchFilter.setMarketCoverage(String)",
    "void UserSearchFilter.setResponsibility(String)",
    "void UserSearchFilter.setTitle(String)",
    "UserSearchFilter UserSearchFilter.title(String)",
    "String UserSearchFilter.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    UserSearchFilter actualUserSearchFilter = new UserSearchFilter();
    UserSearchFilter actualAccountTypesResult =
        actualUserSearchFilter.accountTypes(new ArrayList<>());
    UserSearchFilter actualCompanyResult = actualUserSearchFilter.company("Company");
    UserSearchFilter actualFunctionResult = actualUserSearchFilter.function("Function");
    UserSearchFilter actualInstrumentResult = actualUserSearchFilter.instrument("Instrument");
    UserSearchFilter actualLocationResult = actualUserSearchFilter.location("Location");
    UserSearchFilter actualMarketCoverageResult =
        actualUserSearchFilter.marketCoverage("Market Coverage");
    UserSearchFilter actualResponsibilityResult =
        actualUserSearchFilter.responsibility("Responsibility");
    ArrayList<String> accountTypes = new ArrayList<>();
    actualUserSearchFilter.setAccountTypes(accountTypes);
    actualUserSearchFilter.setCompany("Company");
    actualUserSearchFilter.setFunction("Function");
    actualUserSearchFilter.setInstrument("Instrument");
    actualUserSearchFilter.setLocation("Location");
    actualUserSearchFilter.setMarketCoverage("Market Coverage");
    actualUserSearchFilter.setResponsibility("Responsibility");
    actualUserSearchFilter.setTitle("Dr");
    UserSearchFilter actualTitleResult = actualUserSearchFilter.title("Dr");
    String actualToStringResult = actualUserSearchFilter.toString();
    List<String> actualAccountTypes = actualUserSearchFilter.getAccountTypes();
    String actualCompany = actualUserSearchFilter.getCompany();
    String actualFunction = actualUserSearchFilter.getFunction();
    String actualInstrument = actualUserSearchFilter.getInstrument();
    String actualLocation = actualUserSearchFilter.getLocation();
    String actualMarketCoverage = actualUserSearchFilter.getMarketCoverage();
    String actualResponsibility = actualUserSearchFilter.getResponsibility();

    // Assert
    assertEquals("Company", actualCompany);
    assertEquals("Dr", actualUserSearchFilter.getTitle());
    assertEquals("Function", actualFunction);
    assertEquals("Instrument", actualInstrument);
    assertEquals("Location", actualLocation);
    assertEquals("Market Coverage", actualMarketCoverage);
    assertEquals("Responsibility", actualResponsibility);
    assertEquals(
        "class UserSearchFilter {\n"
            + "    accountTypes: []\n"
            + "    title: Dr\n"
            + "    company: Company\n"
            + "    location: Location\n"
            + "    marketCoverage: Market Coverage\n"
            + "    responsibility: Responsibility\n"
            + "    function: Function\n"
            + "    instrument: Instrument\n"
            + "}",
        actualToStringResult);
    assertTrue(actualAccountTypes.isEmpty());
    assertSame(actualUserSearchFilter, actualAccountTypesResult);
    assertSame(actualUserSearchFilter, actualCompanyResult);
    assertSame(actualUserSearchFilter, actualFunctionResult);
    assertSame(actualUserSearchFilter, actualInstrumentResult);
    assertSame(actualUserSearchFilter, actualLocationResult);
    assertSame(actualUserSearchFilter, actualMarketCoverageResult);
    assertSame(actualUserSearchFilter, actualResponsibilityResult);
    assertSame(actualUserSearchFilter, actualTitleResult);
    assertSame(accountTypes, actualAccountTypes);
  }
}
