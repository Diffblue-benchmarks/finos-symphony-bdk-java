package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.UserAttributes.AccountTypeEnum;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserAttributesDiffblueTest {
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
   * Test {@link UserAttributes#addAssetClassesItem(String)}.
   *
   * <ul>
   *   <li>Given {@link UserAttributes} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link UserAttributes#addAssetClassesItem(String)}
   */
  @Test
  @DisplayName("Test addAssetClassesItem(String); given UserAttributes (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UserAttributes UserAttributes.addAssetClassesItem(String)"})
  void testAddAssetClassesItem_givenUserAttributes() {
    // Arrange
    UserAttributes userAttributes = new UserAttributes();

    // Act
    UserAttributes actualAddAssetClassesItemResult =
        userAttributes.addAssetClassesItem("Asset Classes Item");

    // Assert
    assertSame(userAttributes, actualAddAssetClassesItemResult);
  }

  /**
   * Test {@link UserAttributes#addAssetClassesItem(String)}.
   *
   * <ul>
   *   <li>Given {@link UserAttributes} (default constructor) assetClasses {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link UserAttributes#addAssetClassesItem(String)}
   */
  @Test
  @DisplayName(
      "Test addAssetClassesItem(String); given UserAttributes (default constructor) assetClasses ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UserAttributes UserAttributes.addAssetClassesItem(String)"})
  void testAddAssetClassesItem_givenUserAttributesAssetClassesArrayList() {
    // Arrange
    UserAttributes userAttributes = new UserAttributes();
    userAttributes.assetClasses(new ArrayList<>());

    // Act
    UserAttributes actualAddAssetClassesItemResult =
        userAttributes.addAssetClassesItem("Asset Classes Item");

    // Assert
    assertSame(userAttributes, actualAddAssetClassesItemResult);
  }

  /**
   * Test {@link UserAttributes#addIndustriesItem(String)}.
   *
   * <ul>
   *   <li>Given {@link UserAttributes} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link UserAttributes#addIndustriesItem(String)}
   */
  @Test
  @DisplayName("Test addIndustriesItem(String); given UserAttributes (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UserAttributes UserAttributes.addIndustriesItem(String)"})
  void testAddIndustriesItem_givenUserAttributes() {
    // Arrange
    UserAttributes userAttributes = new UserAttributes();

    // Act
    UserAttributes actualAddIndustriesItemResult =
        userAttributes.addIndustriesItem("Industries Item");

    // Assert
    assertSame(userAttributes, actualAddIndustriesItemResult);
  }

  /**
   * Test {@link UserAttributes#addIndustriesItem(String)}.
   *
   * <ul>
   *   <li>Given {@link UserAttributes} (default constructor) industries {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link UserAttributes#addIndustriesItem(String)}
   */
  @Test
  @DisplayName(
      "Test addIndustriesItem(String); given UserAttributes (default constructor) industries ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UserAttributes UserAttributes.addIndustriesItem(String)"})
  void testAddIndustriesItem_givenUserAttributesIndustriesArrayList() {
    // Arrange
    UserAttributes userAttributes = new UserAttributes();
    userAttributes.industries(new ArrayList<>());

    // Act
    UserAttributes actualAddIndustriesItemResult =
        userAttributes.addIndustriesItem("Industries Item");

    // Assert
    assertSame(userAttributes, actualAddIndustriesItemResult);
  }

  /**
   * Test {@link UserAttributes#equals(Object)}, and {@link UserAttributes#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserAttributes#equals(Object)}
   *   <li>{@link UserAttributes#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserAttributes.equals(Object)", "int UserAttributes.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserAttributes userAttributes = new UserAttributes();
    UserAttributes userAttributes2 = new UserAttributes();

    // Act and Assert
    assertEquals(userAttributes, userAttributes2);
    assertEquals(userAttributes.hashCode(), userAttributes2.hashCode());
  }

  /**
   * Test {@link UserAttributes#equals(Object)}, and {@link UserAttributes#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserAttributes#equals(Object)}
   *   <li>{@link UserAttributes#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserAttributes.equals(Object)", "int UserAttributes.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserAttributes userAttributes = new UserAttributes();

    // Act and Assert
    assertEquals(userAttributes, userAttributes);
    int expectedHashCodeResult = userAttributes.hashCode();
    assertEquals(expectedHashCodeResult, userAttributes.hashCode());
  }

  /**
   * Test {@link UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserAttributes.equals(Object)", "int UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    UserAttributes userAttributes = new UserAttributes();
    userAttributes.addAssetClassesItem("Asset Classes Item");

    // Act and Assert
    assertNotEquals(userAttributes, new UserAttributes());
  }

  /**
   * Test {@link UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserAttributes.equals(Object)", "int UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserAttributes userAttributes = new UserAttributes();
    userAttributes.emailAddress("42 Main St");
    userAttributes.addAssetClassesItem("Asset Classes Item");

    // Act and Assert
    assertNotEquals(userAttributes, new UserAttributes());
  }

  /**
   * Test {@link UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserAttributes.equals(Object)", "int UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserAttributes userAttributes = new UserAttributes();
    userAttributes.firstName("Jane");
    userAttributes.addAssetClassesItem("Asset Classes Item");

    // Act and Assert
    assertNotEquals(userAttributes, new UserAttributes());
  }

  /**
   * Test {@link UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserAttributes.equals(Object)", "int UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    UserAttributes userAttributes = new UserAttributes();
    userAttributes.lastName("Doe");
    userAttributes.addAssetClassesItem("Asset Classes Item");

    // Act and Assert
    assertNotEquals(userAttributes, new UserAttributes());
  }

  /**
   * Test {@link UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserAttributes.equals(Object)", "int UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    UserAttributes userAttributes = new UserAttributes();
    userAttributes.userName("janedoe");
    userAttributes.addAssetClassesItem("Asset Classes Item");

    // Act and Assert
    assertNotEquals(userAttributes, new UserAttributes());
  }

  /**
   * Test {@link UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserAttributes.equals(Object)", "int UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    UserAttributes userAttributes = new UserAttributes();
    userAttributes.displayName("Display Name");
    userAttributes.addAssetClassesItem("Asset Classes Item");

    // Act and Assert
    assertNotEquals(userAttributes, new UserAttributes());
  }

  /**
   * Test {@link UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserAttributes.equals(Object)", "int UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    UserAttributes userAttributes = new UserAttributes();
    userAttributes.companyName("Company Name");
    userAttributes.addAssetClassesItem("Asset Classes Item");

    // Act and Assert
    assertNotEquals(userAttributes, new UserAttributes());
  }

  /**
   * Test {@link UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserAttributes.equals(Object)", "int UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    UserAttributes userAttributes = new UserAttributes();
    userAttributes.department("Department");
    userAttributes.addAssetClassesItem("Asset Classes Item");

    // Act and Assert
    assertNotEquals(userAttributes, new UserAttributes());
  }

  /**
   * Test {@link UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserAttributes.equals(Object)", "int UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    UserAttributes userAttributes = new UserAttributes();
    userAttributes.division("Division");
    userAttributes.addAssetClassesItem("Asset Classes Item");

    // Act and Assert
    assertNotEquals(userAttributes, new UserAttributes());
  }

  /**
   * Test {@link UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserAttributes.equals(Object)", "int UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual10() {
    // Arrange
    UserAttributes userAttributes = new UserAttributes();
    userAttributes.title("Dr");
    userAttributes.addAssetClassesItem("Asset Classes Item");

    // Act and Assert
    assertNotEquals(userAttributes, new UserAttributes());
  }

  /**
   * Test {@link UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserAttributes.equals(Object)", "int UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual11() {
    // Arrange
    UserAttributes userAttributes = new UserAttributes();
    userAttributes.workPhoneNumber("6625550144");
    userAttributes.addAssetClassesItem("Asset Classes Item");

    // Act and Assert
    assertNotEquals(userAttributes, new UserAttributes());
  }

  /**
   * Test {@link UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserAttributes.equals(Object)", "int UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual12() {
    // Arrange
    UserAttributes userAttributes = new UserAttributes();
    userAttributes.mobilePhoneNumber("6625550144");
    userAttributes.addAssetClassesItem("Asset Classes Item");

    // Act and Assert
    assertNotEquals(userAttributes, new UserAttributes());
  }

  /**
   * Test {@link UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserAttributes.equals(Object)", "int UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual13() {
    // Arrange
    UserAttributes userAttributes = new UserAttributes();
    userAttributes.smsNumber("42");
    userAttributes.addAssetClassesItem("Asset Classes Item");

    // Act and Assert
    assertNotEquals(userAttributes, new UserAttributes());
  }

  /**
   * Test {@link UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserAttributes.equals(Object)", "int UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual14() {
    // Arrange
    UserAttributes userAttributes = new UserAttributes();
    userAttributes.accountType(AccountTypeEnum.NORMAL);
    userAttributes.addAssetClassesItem("Asset Classes Item");

    // Act and Assert
    assertNotEquals(userAttributes, new UserAttributes());
  }

  /**
   * Test {@link UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserAttributes.equals(Object)", "int UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual15() {
    // Arrange
    UserAttributes userAttributes = new UserAttributes();
    userAttributes.location("Location");
    userAttributes.addAssetClassesItem("Asset Classes Item");

    // Act and Assert
    assertNotEquals(userAttributes, new UserAttributes());
  }

  /**
   * Test {@link UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserAttributes.equals(Object)", "int UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual16() {
    // Arrange
    UserAttributes userAttributes = new UserAttributes();
    userAttributes.jobFunction("Job Function");
    userAttributes.addAssetClassesItem("Asset Classes Item");

    // Act and Assert
    assertNotEquals(userAttributes, new UserAttributes());
  }

  /**
   * Test {@link UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserAttributes.equals(Object)", "int UserAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual17() {
    // Arrange
    UserAttributes userAttributes = new UserAttributes();
    userAttributes.addIndustriesItem("Industries Item");

    // Act and Assert
    assertNotEquals(userAttributes, new UserAttributes());
  }

  /**
   * Test {@link UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserAttributes.equals(Object)", "int UserAttributes.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserAttributes(), null);
  }

  /**
   * Test {@link UserAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserAttributes.equals(Object)", "int UserAttributes.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserAttributes(), "Different type to UserAttributes");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UserAttributes}
   *   <li>{@link UserAttributes#accountType(AccountTypeEnum)}
   *   <li>{@link UserAttributes#assetClasses(List)}
   *   <li>{@link UserAttributes#companyName(String)}
   *   <li>{@link UserAttributes#department(String)}
   *   <li>{@link UserAttributes#displayName(String)}
   *   <li>{@link UserAttributes#division(String)}
   *   <li>{@link UserAttributes#emailAddress(String)}
   *   <li>{@link UserAttributes#firstName(String)}
   *   <li>{@link UserAttributes#industries(List)}
   *   <li>{@link UserAttributes#jobFunction(String)}
   *   <li>{@link UserAttributes#lastName(String)}
   *   <li>{@link UserAttributes#location(String)}
   *   <li>{@link UserAttributes#mobilePhoneNumber(String)}
   *   <li>{@link UserAttributes#setAccountType(AccountTypeEnum)}
   *   <li>{@link UserAttributes#setAssetClasses(List)}
   *   <li>{@link UserAttributes#setCompanyName(String)}
   *   <li>{@link UserAttributes#setDepartment(String)}
   *   <li>{@link UserAttributes#setDisplayName(String)}
   *   <li>{@link UserAttributes#setDivision(String)}
   *   <li>{@link UserAttributes#setEmailAddress(String)}
   *   <li>{@link UserAttributes#setFirstName(String)}
   *   <li>{@link UserAttributes#setIndustries(List)}
   *   <li>{@link UserAttributes#setJobFunction(String)}
   *   <li>{@link UserAttributes#setLastName(String)}
   *   <li>{@link UserAttributes#setLocation(String)}
   *   <li>{@link UserAttributes#setMobilePhoneNumber(String)}
   *   <li>{@link UserAttributes#setSmsNumber(String)}
   *   <li>{@link UserAttributes#setTitle(String)}
   *   <li>{@link UserAttributes#setUserName(String)}
   *   <li>{@link UserAttributes#setWorkPhoneNumber(String)}
   *   <li>{@link UserAttributes#smsNumber(String)}
   *   <li>{@link UserAttributes#title(String)}
   *   <li>{@link UserAttributes#userName(String)}
   *   <li>{@link UserAttributes#workPhoneNumber(String)}
   *   <li>{@link UserAttributes#toString()}
   *   <li>{@link UserAttributes#getAccountType()}
   *   <li>{@link UserAttributes#getAssetClasses()}
   *   <li>{@link UserAttributes#getCompanyName()}
   *   <li>{@link UserAttributes#getDepartment()}
   *   <li>{@link UserAttributes#getDisplayName()}
   *   <li>{@link UserAttributes#getDivision()}
   *   <li>{@link UserAttributes#getEmailAddress()}
   *   <li>{@link UserAttributes#getFirstName()}
   *   <li>{@link UserAttributes#getIndustries()}
   *   <li>{@link UserAttributes#getJobFunction()}
   *   <li>{@link UserAttributes#getLastName()}
   *   <li>{@link UserAttributes#getLocation()}
   *   <li>{@link UserAttributes#getMobilePhoneNumber()}
   *   <li>{@link UserAttributes#getSmsNumber()}
   *   <li>{@link UserAttributes#getTitle()}
   *   <li>{@link UserAttributes#getUserName()}
   *   <li>{@link UserAttributes#getWorkPhoneNumber()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserAttributes.<init>()",
    "UserAttributes UserAttributes.accountType(AccountTypeEnum)",
    "UserAttributes UserAttributes.assetClasses(List)",
    "UserAttributes UserAttributes.companyName(String)",
    "UserAttributes UserAttributes.department(String)",
    "UserAttributes UserAttributes.displayName(String)",
    "UserAttributes UserAttributes.division(String)",
    "UserAttributes UserAttributes.emailAddress(String)",
    "UserAttributes UserAttributes.firstName(String)",
    "AccountTypeEnum UserAttributes.getAccountType()",
    "List UserAttributes.getAssetClasses()",
    "String UserAttributes.getCompanyName()",
    "String UserAttributes.getDepartment()",
    "String UserAttributes.getDisplayName()",
    "String UserAttributes.getDivision()",
    "String UserAttributes.getEmailAddress()",
    "String UserAttributes.getFirstName()",
    "List UserAttributes.getIndustries()",
    "String UserAttributes.getJobFunction()",
    "String UserAttributes.getLastName()",
    "String UserAttributes.getLocation()",
    "String UserAttributes.getMobilePhoneNumber()",
    "String UserAttributes.getSmsNumber()",
    "String UserAttributes.getTitle()",
    "String UserAttributes.getUserName()",
    "String UserAttributes.getWorkPhoneNumber()",
    "UserAttributes UserAttributes.industries(List)",
    "UserAttributes UserAttributes.jobFunction(String)",
    "UserAttributes UserAttributes.lastName(String)",
    "UserAttributes UserAttributes.location(String)",
    "UserAttributes UserAttributes.mobilePhoneNumber(String)",
    "void UserAttributes.setAccountType(AccountTypeEnum)",
    "void UserAttributes.setAssetClasses(List)",
    "void UserAttributes.setCompanyName(String)",
    "void UserAttributes.setDepartment(String)",
    "void UserAttributes.setDisplayName(String)",
    "void UserAttributes.setDivision(String)",
    "void UserAttributes.setEmailAddress(String)",
    "void UserAttributes.setFirstName(String)",
    "void UserAttributes.setIndustries(List)",
    "void UserAttributes.setJobFunction(String)",
    "void UserAttributes.setLastName(String)",
    "void UserAttributes.setLocation(String)",
    "void UserAttributes.setMobilePhoneNumber(String)",
    "void UserAttributes.setSmsNumber(String)",
    "void UserAttributes.setTitle(String)",
    "void UserAttributes.setUserName(String)",
    "void UserAttributes.setWorkPhoneNumber(String)",
    "UserAttributes UserAttributes.smsNumber(String)",
    "UserAttributes UserAttributes.title(String)",
    "String UserAttributes.toString()",
    "UserAttributes UserAttributes.userName(String)",
    "UserAttributes UserAttributes.workPhoneNumber(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    UserAttributes actualUserAttributes = new UserAttributes();
    UserAttributes actualAccountTypeResult =
        actualUserAttributes.accountType(AccountTypeEnum.NORMAL);
    UserAttributes actualAssetClassesResult = actualUserAttributes.assetClasses(new ArrayList<>());
    UserAttributes actualCompanyNameResult = actualUserAttributes.companyName("Company Name");
    UserAttributes actualDepartmentResult = actualUserAttributes.department("Department");
    UserAttributes actualDisplayNameResult = actualUserAttributes.displayName("Display Name");
    UserAttributes actualDivisionResult = actualUserAttributes.division("Division");
    UserAttributes actualEmailAddressResult = actualUserAttributes.emailAddress("42 Main St");
    UserAttributes actualFirstNameResult = actualUserAttributes.firstName("Jane");
    UserAttributes actualIndustriesResult = actualUserAttributes.industries(new ArrayList<>());
    UserAttributes actualJobFunctionResult = actualUserAttributes.jobFunction("Job Function");
    UserAttributes actualLastNameResult = actualUserAttributes.lastName("Doe");
    UserAttributes actualLocationResult = actualUserAttributes.location("Location");
    UserAttributes actualMobilePhoneNumberResult =
        actualUserAttributes.mobilePhoneNumber("6625550144");
    actualUserAttributes.setAccountType(AccountTypeEnum.NORMAL);
    ArrayList<String> assetClasses = new ArrayList<>();
    actualUserAttributes.setAssetClasses(assetClasses);
    actualUserAttributes.setCompanyName("Company Name");
    actualUserAttributes.setDepartment("Department");
    actualUserAttributes.setDisplayName("Display Name");
    actualUserAttributes.setDivision("Division");
    actualUserAttributes.setEmailAddress("42 Main St");
    actualUserAttributes.setFirstName("Jane");
    ArrayList<String> industries = new ArrayList<>();
    actualUserAttributes.setIndustries(industries);
    actualUserAttributes.setJobFunction("Job Function");
    actualUserAttributes.setLastName("Doe");
    actualUserAttributes.setLocation("Location");
    actualUserAttributes.setMobilePhoneNumber("6625550144");
    actualUserAttributes.setSmsNumber("42");
    actualUserAttributes.setTitle("Dr");
    actualUserAttributes.setUserName("janedoe");
    actualUserAttributes.setWorkPhoneNumber("6625550144");
    UserAttributes actualSmsNumberResult = actualUserAttributes.smsNumber("42");
    UserAttributes actualTitleResult = actualUserAttributes.title("Dr");
    UserAttributes actualUserNameResult = actualUserAttributes.userName("janedoe");
    UserAttributes actualWorkPhoneNumberResult = actualUserAttributes.workPhoneNumber("6625550144");
    String actualToStringResult = actualUserAttributes.toString();
    AccountTypeEnum actualAccountType = actualUserAttributes.getAccountType();
    List<String> actualAssetClasses = actualUserAttributes.getAssetClasses();
    String actualCompanyName = actualUserAttributes.getCompanyName();
    String actualDepartment = actualUserAttributes.getDepartment();
    String actualDisplayName = actualUserAttributes.getDisplayName();
    String actualDivision = actualUserAttributes.getDivision();
    String actualEmailAddress = actualUserAttributes.getEmailAddress();
    String actualFirstName = actualUserAttributes.getFirstName();
    List<String> actualIndustries = actualUserAttributes.getIndustries();
    String actualJobFunction = actualUserAttributes.getJobFunction();
    String actualLastName = actualUserAttributes.getLastName();
    String actualLocation = actualUserAttributes.getLocation();
    String actualMobilePhoneNumber = actualUserAttributes.getMobilePhoneNumber();
    String actualSmsNumber = actualUserAttributes.getSmsNumber();
    String actualTitle = actualUserAttributes.getTitle();
    String actualUserName = actualUserAttributes.getUserName();

    // Assert
    assertEquals("42 Main St", actualEmailAddress);
    assertEquals("42", actualSmsNumber);
    assertEquals("6625550144", actualMobilePhoneNumber);
    assertEquals("6625550144", actualUserAttributes.getWorkPhoneNumber());
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
        "class UserAttributes {\n"
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
            + "    smsNumber: 42\n"
            + "    accountType: NORMAL\n"
            + "    location: Location\n"
            + "    jobFunction: Job Function\n"
            + "    assetClasses: []\n"
            + "    industries: []\n"
            + "}",
        actualToStringResult);
    assertEquals("janedoe", actualUserName);
    assertEquals(AccountTypeEnum.NORMAL, actualAccountType);
    assertTrue(actualAssetClasses.isEmpty());
    assertTrue(actualIndustries.isEmpty());
    assertSame(actualUserAttributes, actualAccountTypeResult);
    assertSame(actualUserAttributes, actualAssetClassesResult);
    assertSame(actualUserAttributes, actualCompanyNameResult);
    assertSame(actualUserAttributes, actualDepartmentResult);
    assertSame(actualUserAttributes, actualDisplayNameResult);
    assertSame(actualUserAttributes, actualDivisionResult);
    assertSame(actualUserAttributes, actualEmailAddressResult);
    assertSame(actualUserAttributes, actualFirstNameResult);
    assertSame(actualUserAttributes, actualIndustriesResult);
    assertSame(actualUserAttributes, actualJobFunctionResult);
    assertSame(actualUserAttributes, actualLastNameResult);
    assertSame(actualUserAttributes, actualLocationResult);
    assertSame(actualUserAttributes, actualMobilePhoneNumberResult);
    assertSame(actualUserAttributes, actualSmsNumberResult);
    assertSame(actualUserAttributes, actualTitleResult);
    assertSame(actualUserAttributes, actualUserNameResult);
    assertSame(actualUserAttributes, actualWorkPhoneNumberResult);
    assertSame(assetClasses, actualAssetClasses);
    assertSame(industries, actualIndustries);
  }
}
