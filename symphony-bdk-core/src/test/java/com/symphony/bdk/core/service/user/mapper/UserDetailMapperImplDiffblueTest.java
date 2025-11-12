package com.symphony.bdk.core.service.user.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.UserAttributes;
import com.symphony.bdk.gen.api.model.UserAttributes.AccountTypeEnum;
import com.symphony.bdk.gen.api.model.UserDetail;
import com.symphony.bdk.gen.api.model.V2UserAttributes;
import com.symphony.bdk.gen.api.model.V2UserDetail;
import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserDetailMapperImplDiffblueTest {
  /**
   * Test {@link UserDetailMapperImpl#accountTypeEnumToAccountTypeEnum(AccountTypeEnum)}.
   *
   * <ul>
   *   <li>When {@code NORMAL}.
   *   <li>Then return {@code NORMAL}.
   * </ul>
   *
   * <p>Method under test: {@link
   * UserDetailMapperImpl#accountTypeEnumToAccountTypeEnum(UserAttributes.AccountTypeEnum)}
   */
  @Test
  @DisplayName(
      "Test accountTypeEnumToAccountTypeEnum(AccountTypeEnum); when 'NORMAL'; then return 'NORMAL'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "V2UserAttributes.AccountTypeEnum UserDetailMapperImpl.accountTypeEnumToAccountTypeEnum(UserAttributes.AccountTypeEnum)"
  })
  void testAccountTypeEnumToAccountTypeEnum_whenNormal_thenReturnNormal() {
    // Arrange, Act and Assert
    assertEquals(
        V2UserAttributes.AccountTypeEnum.NORMAL,
        new UserDetailMapperImpl().accountTypeEnumToAccountTypeEnum(AccountTypeEnum.NORMAL));
  }

  /**
   * Test {@link UserDetailMapperImpl#accountTypeEnumToAccountTypeEnum(AccountTypeEnum)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * UserDetailMapperImpl#accountTypeEnumToAccountTypeEnum(UserAttributes.AccountTypeEnum)}
   */
  @Test
  @DisplayName(
      "Test accountTypeEnumToAccountTypeEnum(AccountTypeEnum); when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "V2UserAttributes.AccountTypeEnum UserDetailMapperImpl.accountTypeEnumToAccountTypeEnum(UserAttributes.AccountTypeEnum)"
  })
  void testAccountTypeEnumToAccountTypeEnum_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(new UserDetailMapperImpl().accountTypeEnumToAccountTypeEnum(null));
  }

  /**
   * Test {@link UserDetailMapperImpl#accountTypeEnumToAccountTypeEnum(AccountTypeEnum)}.
   *
   * <ul>
   *   <li>When {@code SDL}.
   *   <li>Then return {@code SDL}.
   * </ul>
   *
   * <p>Method under test: {@link
   * UserDetailMapperImpl#accountTypeEnumToAccountTypeEnum(UserAttributes.AccountTypeEnum)}
   */
  @Test
  @DisplayName(
      "Test accountTypeEnumToAccountTypeEnum(AccountTypeEnum); when 'SDL'; then return 'SDL'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "V2UserAttributes.AccountTypeEnum UserDetailMapperImpl.accountTypeEnumToAccountTypeEnum(UserAttributes.AccountTypeEnum)"
  })
  void testAccountTypeEnumToAccountTypeEnum_whenSdl_thenReturnSdl() {
    // Arrange, Act and Assert
    assertEquals(
        V2UserAttributes.AccountTypeEnum.SDL,
        new UserDetailMapperImpl().accountTypeEnumToAccountTypeEnum(AccountTypeEnum.SDL));
  }

  /**
   * Test {@link UserDetailMapperImpl#accountTypeEnumToAccountTypeEnum(AccountTypeEnum)}.
   *
   * <ul>
   *   <li>When {@code SYSTEM}.
   *   <li>Then return {@code SYSTEM}.
   * </ul>
   *
   * <p>Method under test: {@link
   * UserDetailMapperImpl#accountTypeEnumToAccountTypeEnum(UserAttributes.AccountTypeEnum)}
   */
  @Test
  @DisplayName(
      "Test accountTypeEnumToAccountTypeEnum(AccountTypeEnum); when 'SYSTEM'; then return 'SYSTEM'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "V2UserAttributes.AccountTypeEnum UserDetailMapperImpl.accountTypeEnumToAccountTypeEnum(UserAttributes.AccountTypeEnum)"
  })
  void testAccountTypeEnumToAccountTypeEnum_whenSystem_thenReturnSystem() {
    // Arrange, Act and Assert
    assertEquals(
        V2UserAttributes.AccountTypeEnum.SYSTEM,
        new UserDetailMapperImpl().accountTypeEnumToAccountTypeEnum(AccountTypeEnum.SYSTEM));
  }

  /**
   * Test {@link UserDetailMapperImpl#userAttributesToV2UserAttributes(UserAttributes)}.
   *
   * <ul>
   *   <li>Given {@code NORMAL}.
   *   <li>Then return AccountType is {@code NORMAL}.
   * </ul>
   *
   * <p>Method under test: {@link
   * UserDetailMapperImpl#userAttributesToV2UserAttributes(UserAttributes)}
   */
  @Test
  @DisplayName(
      "Test userAttributesToV2UserAttributes(UserAttributes); given 'NORMAL'; then return AccountType is 'NORMAL'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "V2UserAttributes UserDetailMapperImpl.userAttributesToV2UserAttributes(UserAttributes)"
  })
  void testUserAttributesToV2UserAttributes_givenNormal_thenReturnAccountTypeIsNormal() {
    // Arrange
    UserDetailMapperImpl userDetailMapperImpl = new UserDetailMapperImpl();

    UserAttributes userAttributes = new UserAttributes();
    userAttributes.assetClasses(new ArrayList<>());
    userAttributes.industries(new ArrayList<>());
    userAttributes.accountType(AccountTypeEnum.NORMAL);

    // Act
    V2UserAttributes actualUserAttributesToV2UserAttributesResult =
        userDetailMapperImpl.userAttributesToV2UserAttributes(userAttributes);

    // Assert
    assertNull(actualUserAttributesToV2UserAttributesResult.getCurrentKey());
    assertNull(actualUserAttributesToV2UserAttributesResult.getPreviousKey());
    assertNull(actualUserAttributesToV2UserAttributesResult.getCompanyName());
    assertNull(actualUserAttributesToV2UserAttributesResult.getDepartment());
    assertNull(actualUserAttributesToV2UserAttributesResult.getDisplayName());
    assertNull(actualUserAttributesToV2UserAttributesResult.getDivision());
    assertNull(actualUserAttributesToV2UserAttributesResult.getEmailAddress());
    assertNull(actualUserAttributesToV2UserAttributesResult.getFirstName());
    assertNull(actualUserAttributesToV2UserAttributesResult.getJobFunction());
    assertNull(actualUserAttributesToV2UserAttributesResult.getLastName());
    assertNull(actualUserAttributesToV2UserAttributesResult.getLocation());
    assertNull(actualUserAttributesToV2UserAttributesResult.getMobilePhoneNumber());
    assertNull(actualUserAttributesToV2UserAttributesResult.getRecommendedLanguage());
    assertNull(actualUserAttributesToV2UserAttributesResult.getSmsNumber());
    assertNull(actualUserAttributesToV2UserAttributesResult.getTitle());
    assertNull(actualUserAttributesToV2UserAttributesResult.getTwoFactorAuthPhone());
    assertNull(actualUserAttributesToV2UserAttributesResult.getUserName());
    assertNull(actualUserAttributesToV2UserAttributesResult.getWorkPhoneNumber());
    assertNull(actualUserAttributesToV2UserAttributesResult.getFunction());
    assertNull(actualUserAttributesToV2UserAttributesResult.getInstrument());
    assertNull(actualUserAttributesToV2UserAttributesResult.getMarketCoverage());
    assertNull(actualUserAttributesToV2UserAttributesResult.getResponsibility());
    assertEquals(
        V2UserAttributes.AccountTypeEnum.NORMAL,
        actualUserAttributesToV2UserAttributesResult.getAccountType());
    assertTrue(actualUserAttributesToV2UserAttributesResult.getAssetClasses().isEmpty());
    assertTrue(actualUserAttributesToV2UserAttributesResult.getIndustries().isEmpty());
  }

  /**
   * Test {@link UserDetailMapperImpl#userAttributesToV2UserAttributes(UserAttributes)}.
   *
   * <ul>
   *   <li>Given {@code SDL}.
   *   <li>Then return AccountType is {@code SDL}.
   * </ul>
   *
   * <p>Method under test: {@link
   * UserDetailMapperImpl#userAttributesToV2UserAttributes(UserAttributes)}
   */
  @Test
  @DisplayName(
      "Test userAttributesToV2UserAttributes(UserAttributes); given 'SDL'; then return AccountType is 'SDL'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "V2UserAttributes UserDetailMapperImpl.userAttributesToV2UserAttributes(UserAttributes)"
  })
  void testUserAttributesToV2UserAttributes_givenSdl_thenReturnAccountTypeIsSdl() {
    // Arrange
    UserDetailMapperImpl userDetailMapperImpl = new UserDetailMapperImpl();

    UserAttributes userAttributes = new UserAttributes();
    userAttributes.assetClasses(new ArrayList<>());
    userAttributes.industries(new ArrayList<>());
    userAttributes.accountType(AccountTypeEnum.SDL);

    // Act
    V2UserAttributes actualUserAttributesToV2UserAttributesResult =
        userDetailMapperImpl.userAttributesToV2UserAttributes(userAttributes);

    // Assert
    assertNull(actualUserAttributesToV2UserAttributesResult.getCurrentKey());
    assertNull(actualUserAttributesToV2UserAttributesResult.getPreviousKey());
    assertNull(actualUserAttributesToV2UserAttributesResult.getCompanyName());
    assertNull(actualUserAttributesToV2UserAttributesResult.getDepartment());
    assertNull(actualUserAttributesToV2UserAttributesResult.getDisplayName());
    assertNull(actualUserAttributesToV2UserAttributesResult.getDivision());
    assertNull(actualUserAttributesToV2UserAttributesResult.getEmailAddress());
    assertNull(actualUserAttributesToV2UserAttributesResult.getFirstName());
    assertNull(actualUserAttributesToV2UserAttributesResult.getJobFunction());
    assertNull(actualUserAttributesToV2UserAttributesResult.getLastName());
    assertNull(actualUserAttributesToV2UserAttributesResult.getLocation());
    assertNull(actualUserAttributesToV2UserAttributesResult.getMobilePhoneNumber());
    assertNull(actualUserAttributesToV2UserAttributesResult.getRecommendedLanguage());
    assertNull(actualUserAttributesToV2UserAttributesResult.getSmsNumber());
    assertNull(actualUserAttributesToV2UserAttributesResult.getTitle());
    assertNull(actualUserAttributesToV2UserAttributesResult.getTwoFactorAuthPhone());
    assertNull(actualUserAttributesToV2UserAttributesResult.getUserName());
    assertNull(actualUserAttributesToV2UserAttributesResult.getWorkPhoneNumber());
    assertNull(actualUserAttributesToV2UserAttributesResult.getFunction());
    assertNull(actualUserAttributesToV2UserAttributesResult.getInstrument());
    assertNull(actualUserAttributesToV2UserAttributesResult.getMarketCoverage());
    assertNull(actualUserAttributesToV2UserAttributesResult.getResponsibility());
    assertEquals(
        V2UserAttributes.AccountTypeEnum.SDL,
        actualUserAttributesToV2UserAttributesResult.getAccountType());
    assertTrue(actualUserAttributesToV2UserAttributesResult.getAssetClasses().isEmpty());
    assertTrue(actualUserAttributesToV2UserAttributesResult.getIndustries().isEmpty());
  }

  /**
   * Test {@link UserDetailMapperImpl#userAttributesToV2UserAttributes(UserAttributes)}.
   *
   * <ul>
   *   <li>Given {@code SYSTEM}.
   *   <li>Then return AccountType is {@code SYSTEM}.
   * </ul>
   *
   * <p>Method under test: {@link
   * UserDetailMapperImpl#userAttributesToV2UserAttributes(UserAttributes)}
   */
  @Test
  @DisplayName(
      "Test userAttributesToV2UserAttributes(UserAttributes); given 'SYSTEM'; then return AccountType is 'SYSTEM'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "V2UserAttributes UserDetailMapperImpl.userAttributesToV2UserAttributes(UserAttributes)"
  })
  void testUserAttributesToV2UserAttributes_givenSystem_thenReturnAccountTypeIsSystem() {
    // Arrange
    UserDetailMapperImpl userDetailMapperImpl = new UserDetailMapperImpl();

    UserAttributes userAttributes = new UserAttributes();
    userAttributes.assetClasses(new ArrayList<>());
    userAttributes.industries(new ArrayList<>());
    userAttributes.accountType(AccountTypeEnum.SYSTEM);

    // Act
    V2UserAttributes actualUserAttributesToV2UserAttributesResult =
        userDetailMapperImpl.userAttributesToV2UserAttributes(userAttributes);

    // Assert
    assertNull(actualUserAttributesToV2UserAttributesResult.getCurrentKey());
    assertNull(actualUserAttributesToV2UserAttributesResult.getPreviousKey());
    assertNull(actualUserAttributesToV2UserAttributesResult.getCompanyName());
    assertNull(actualUserAttributesToV2UserAttributesResult.getDepartment());
    assertNull(actualUserAttributesToV2UserAttributesResult.getDisplayName());
    assertNull(actualUserAttributesToV2UserAttributesResult.getDivision());
    assertNull(actualUserAttributesToV2UserAttributesResult.getEmailAddress());
    assertNull(actualUserAttributesToV2UserAttributesResult.getFirstName());
    assertNull(actualUserAttributesToV2UserAttributesResult.getJobFunction());
    assertNull(actualUserAttributesToV2UserAttributesResult.getLastName());
    assertNull(actualUserAttributesToV2UserAttributesResult.getLocation());
    assertNull(actualUserAttributesToV2UserAttributesResult.getMobilePhoneNumber());
    assertNull(actualUserAttributesToV2UserAttributesResult.getRecommendedLanguage());
    assertNull(actualUserAttributesToV2UserAttributesResult.getSmsNumber());
    assertNull(actualUserAttributesToV2UserAttributesResult.getTitle());
    assertNull(actualUserAttributesToV2UserAttributesResult.getTwoFactorAuthPhone());
    assertNull(actualUserAttributesToV2UserAttributesResult.getUserName());
    assertNull(actualUserAttributesToV2UserAttributesResult.getWorkPhoneNumber());
    assertNull(actualUserAttributesToV2UserAttributesResult.getFunction());
    assertNull(actualUserAttributesToV2UserAttributesResult.getInstrument());
    assertNull(actualUserAttributesToV2UserAttributesResult.getMarketCoverage());
    assertNull(actualUserAttributesToV2UserAttributesResult.getResponsibility());
    assertEquals(
        V2UserAttributes.AccountTypeEnum.SYSTEM,
        actualUserAttributesToV2UserAttributesResult.getAccountType());
    assertTrue(actualUserAttributesToV2UserAttributesResult.getAssetClasses().isEmpty());
    assertTrue(actualUserAttributesToV2UserAttributesResult.getIndustries().isEmpty());
  }

  /**
   * Test {@link UserDetailMapperImpl#userAttributesToV2UserAttributes(UserAttributes)}.
   *
   * <ul>
   *   <li>Then return AccountType is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * UserDetailMapperImpl#userAttributesToV2UserAttributes(UserAttributes)}
   */
  @Test
  @DisplayName(
      "Test userAttributesToV2UserAttributes(UserAttributes); then return AccountType is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "V2UserAttributes UserDetailMapperImpl.userAttributesToV2UserAttributes(UserAttributes)"
  })
  void testUserAttributesToV2UserAttributes_thenReturnAccountTypeIsNull() {
    // Arrange
    UserDetailMapperImpl userDetailMapperImpl = new UserDetailMapperImpl();

    // Act
    V2UserAttributes actualUserAttributesToV2UserAttributesResult =
        userDetailMapperImpl.userAttributesToV2UserAttributes(new UserAttributes());

    // Assert
    assertNull(actualUserAttributesToV2UserAttributesResult.getAccountType());
    assertNull(actualUserAttributesToV2UserAttributesResult.getCurrentKey());
    assertNull(actualUserAttributesToV2UserAttributesResult.getPreviousKey());
    assertNull(actualUserAttributesToV2UserAttributesResult.getCompanyName());
    assertNull(actualUserAttributesToV2UserAttributesResult.getDepartment());
    assertNull(actualUserAttributesToV2UserAttributesResult.getDisplayName());
    assertNull(actualUserAttributesToV2UserAttributesResult.getDivision());
    assertNull(actualUserAttributesToV2UserAttributesResult.getEmailAddress());
    assertNull(actualUserAttributesToV2UserAttributesResult.getFirstName());
    assertNull(actualUserAttributesToV2UserAttributesResult.getJobFunction());
    assertNull(actualUserAttributesToV2UserAttributesResult.getLastName());
    assertNull(actualUserAttributesToV2UserAttributesResult.getLocation());
    assertNull(actualUserAttributesToV2UserAttributesResult.getMobilePhoneNumber());
    assertNull(actualUserAttributesToV2UserAttributesResult.getRecommendedLanguage());
    assertNull(actualUserAttributesToV2UserAttributesResult.getSmsNumber());
    assertNull(actualUserAttributesToV2UserAttributesResult.getTitle());
    assertNull(actualUserAttributesToV2UserAttributesResult.getTwoFactorAuthPhone());
    assertNull(actualUserAttributesToV2UserAttributesResult.getUserName());
    assertNull(actualUserAttributesToV2UserAttributesResult.getWorkPhoneNumber());
    assertNull(actualUserAttributesToV2UserAttributesResult.getAssetClasses());
    assertNull(actualUserAttributesToV2UserAttributesResult.getFunction());
    assertNull(actualUserAttributesToV2UserAttributesResult.getIndustries());
    assertNull(actualUserAttributesToV2UserAttributesResult.getInstrument());
    assertNull(actualUserAttributesToV2UserAttributesResult.getMarketCoverage());
    assertNull(actualUserAttributesToV2UserAttributesResult.getResponsibility());
  }

  /**
   * Test {@link UserDetailMapperImpl#userAttributesToV2UserAttributes(UserAttributes)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * UserDetailMapperImpl#userAttributesToV2UserAttributes(UserAttributes)}
   */
  @Test
  @DisplayName(
      "Test userAttributesToV2UserAttributes(UserAttributes); when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "V2UserAttributes UserDetailMapperImpl.userAttributesToV2UserAttributes(UserAttributes)"
  })
  void testUserAttributesToV2UserAttributes_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(new UserDetailMapperImpl().userAttributesToV2UserAttributes(null));
  }

  /**
   * Test {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}.
   *
   * <ul>
   *   <li>Given {@link UserAttributes} (default constructor) accountType {@code NORMAL}.
   * </ul>
   *
   * <p>Method under test: {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}
   */
  @Test
  @DisplayName(
      "Test userDetailToV2UserDetail(UserDetail); given UserAttributes (default constructor) accountType 'NORMAL'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserDetail UserDetailMapperImpl.userDetailToV2UserDetail(UserDetail)"})
  void testUserDetailToV2UserDetail_givenUserAttributesAccountTypeNormal() {
    // Arrange
    UserDetailMapperImpl userDetailMapperImpl = new UserDetailMapperImpl();

    UserAttributes userAttributes = new UserAttributes();
    userAttributes.assetClasses(new ArrayList<>());
    userAttributes.industries(new ArrayList<>());
    userAttributes.accountType(AccountTypeEnum.NORMAL);

    UserDetail userDetail = new UserDetail();
    userDetail.features(new ArrayList<>());
    userDetail.apps(new ArrayList<>());
    userDetail.groups(new ArrayList<>());
    userDetail.roles(new ArrayList<>());
    userDetail.disclaimers(new ArrayList<>());
    userDetail.userAttributes(userAttributes);

    // Act
    V2UserDetail actualUserDetailToV2UserDetailResult =
        userDetailMapperImpl.userDetailToV2UserDetail(userDetail);

    // Assert
    assertTrue(actualUserDetailToV2UserDetailResult.getApps().isEmpty());
    assertTrue(actualUserDetailToV2UserDetailResult.getDisclaimers().isEmpty());
    assertTrue(actualUserDetailToV2UserDetailResult.getFeatures().isEmpty());
    assertTrue(actualUserDetailToV2UserDetailResult.getGroups().isEmpty());
    assertTrue(actualUserDetailToV2UserDetailResult.getRoles().isEmpty());
  }

  /**
   * Test {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}.
   *
   * <ul>
   *   <li>Given {@link UserAttributes} (default constructor) accountType {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}
   */
  @Test
  @DisplayName(
      "Test userDetailToV2UserDetail(UserDetail); given UserAttributes (default constructor) accountType 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserDetail UserDetailMapperImpl.userDetailToV2UserDetail(UserDetail)"})
  void testUserDetailToV2UserDetail_givenUserAttributesAccountTypeNull() {
    // Arrange
    UserDetailMapperImpl userDetailMapperImpl = new UserDetailMapperImpl();

    UserAttributes userAttributes = new UserAttributes();
    userAttributes.assetClasses(new ArrayList<>());
    userAttributes.industries(new ArrayList<>());
    userAttributes.accountType(null);

    UserDetail userDetail = new UserDetail();
    userDetail.features(new ArrayList<>());
    userDetail.apps(new ArrayList<>());
    userDetail.groups(new ArrayList<>());
    userDetail.roles(new ArrayList<>());
    userDetail.disclaimers(new ArrayList<>());
    userDetail.userAttributes(userAttributes);

    // Act
    V2UserDetail actualUserDetailToV2UserDetailResult =
        userDetailMapperImpl.userDetailToV2UserDetail(userDetail);

    // Assert
    assertTrue(actualUserDetailToV2UserDetailResult.getApps().isEmpty());
    assertTrue(actualUserDetailToV2UserDetailResult.getDisclaimers().isEmpty());
    assertTrue(actualUserDetailToV2UserDetailResult.getFeatures().isEmpty());
    assertTrue(actualUserDetailToV2UserDetailResult.getGroups().isEmpty());
    assertTrue(actualUserDetailToV2UserDetailResult.getRoles().isEmpty());
  }

  /**
   * Test {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}.
   *
   * <ul>
   *   <li>Given {@link UserAttributes} (default constructor) accountType {@code SDL}.
   * </ul>
   *
   * <p>Method under test: {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}
   */
  @Test
  @DisplayName(
      "Test userDetailToV2UserDetail(UserDetail); given UserAttributes (default constructor) accountType 'SDL'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserDetail UserDetailMapperImpl.userDetailToV2UserDetail(UserDetail)"})
  void testUserDetailToV2UserDetail_givenUserAttributesAccountTypeSdl() {
    // Arrange
    UserDetailMapperImpl userDetailMapperImpl = new UserDetailMapperImpl();

    UserAttributes userAttributes = new UserAttributes();
    userAttributes.assetClasses(new ArrayList<>());
    userAttributes.industries(new ArrayList<>());
    userAttributes.accountType(AccountTypeEnum.SDL);

    UserDetail userDetail = new UserDetail();
    userDetail.features(new ArrayList<>());
    userDetail.apps(new ArrayList<>());
    userDetail.groups(new ArrayList<>());
    userDetail.roles(new ArrayList<>());
    userDetail.disclaimers(new ArrayList<>());
    userDetail.userAttributes(userAttributes);

    // Act
    V2UserDetail actualUserDetailToV2UserDetailResult =
        userDetailMapperImpl.userDetailToV2UserDetail(userDetail);

    // Assert
    assertTrue(actualUserDetailToV2UserDetailResult.getApps().isEmpty());
    assertTrue(actualUserDetailToV2UserDetailResult.getDisclaimers().isEmpty());
    assertTrue(actualUserDetailToV2UserDetailResult.getFeatures().isEmpty());
    assertTrue(actualUserDetailToV2UserDetailResult.getGroups().isEmpty());
    assertTrue(actualUserDetailToV2UserDetailResult.getRoles().isEmpty());
  }

  /**
   * Test {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}.
   *
   * <ul>
   *   <li>Given {@link UserAttributes} (default constructor) accountType {@code SYSTEM}.
   * </ul>
   *
   * <p>Method under test: {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}
   */
  @Test
  @DisplayName(
      "Test userDetailToV2UserDetail(UserDetail); given UserAttributes (default constructor) accountType 'SYSTEM'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserDetail UserDetailMapperImpl.userDetailToV2UserDetail(UserDetail)"})
  void testUserDetailToV2UserDetail_givenUserAttributesAccountTypeSystem() {
    // Arrange
    UserDetailMapperImpl userDetailMapperImpl = new UserDetailMapperImpl();

    UserAttributes userAttributes = new UserAttributes();
    userAttributes.assetClasses(new ArrayList<>());
    userAttributes.industries(new ArrayList<>());
    userAttributes.accountType(AccountTypeEnum.SYSTEM);

    UserDetail userDetail = new UserDetail();
    userDetail.features(new ArrayList<>());
    userDetail.apps(new ArrayList<>());
    userDetail.groups(new ArrayList<>());
    userDetail.roles(new ArrayList<>());
    userDetail.disclaimers(new ArrayList<>());
    userDetail.userAttributes(userAttributes);

    // Act
    V2UserDetail actualUserDetailToV2UserDetailResult =
        userDetailMapperImpl.userDetailToV2UserDetail(userDetail);

    // Assert
    assertTrue(actualUserDetailToV2UserDetailResult.getApps().isEmpty());
    assertTrue(actualUserDetailToV2UserDetailResult.getDisclaimers().isEmpty());
    assertTrue(actualUserDetailToV2UserDetailResult.getFeatures().isEmpty());
    assertTrue(actualUserDetailToV2UserDetailResult.getGroups().isEmpty());
    assertTrue(actualUserDetailToV2UserDetailResult.getRoles().isEmpty());
  }

  /**
   * Test {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}.
   *
   * <ul>
   *   <li>Given {@link UserAttributes} (default constructor) assetClasses {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}
   */
  @Test
  @DisplayName(
      "Test userDetailToV2UserDetail(UserDetail); given UserAttributes (default constructor) assetClasses 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserDetail UserDetailMapperImpl.userDetailToV2UserDetail(UserDetail)"})
  void testUserDetailToV2UserDetail_givenUserAttributesAssetClassesNull() {
    // Arrange
    UserDetailMapperImpl userDetailMapperImpl = new UserDetailMapperImpl();

    UserAttributes userAttributes = new UserAttributes();
    userAttributes.assetClasses(null);
    userAttributes.industries(new ArrayList<>());
    userAttributes.accountType(AccountTypeEnum.NORMAL);

    UserDetail userDetail = new UserDetail();
    userDetail.features(new ArrayList<>());
    userDetail.apps(new ArrayList<>());
    userDetail.groups(new ArrayList<>());
    userDetail.roles(new ArrayList<>());
    userDetail.disclaimers(new ArrayList<>());
    userDetail.userAttributes(userAttributes);

    // Act
    V2UserDetail actualUserDetailToV2UserDetailResult =
        userDetailMapperImpl.userDetailToV2UserDetail(userDetail);

    // Assert
    assertTrue(actualUserDetailToV2UserDetailResult.getApps().isEmpty());
    assertTrue(actualUserDetailToV2UserDetailResult.getDisclaimers().isEmpty());
    assertTrue(actualUserDetailToV2UserDetailResult.getFeatures().isEmpty());
    assertTrue(actualUserDetailToV2UserDetailResult.getGroups().isEmpty());
    assertTrue(actualUserDetailToV2UserDetailResult.getRoles().isEmpty());
  }

  /**
   * Test {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}.
   *
   * <ul>
   *   <li>Given {@link UserAttributes} (default constructor) industries {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}
   */
  @Test
  @DisplayName(
      "Test userDetailToV2UserDetail(UserDetail); given UserAttributes (default constructor) industries 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserDetail UserDetailMapperImpl.userDetailToV2UserDetail(UserDetail)"})
  void testUserDetailToV2UserDetail_givenUserAttributesIndustriesNull() {
    // Arrange
    UserDetailMapperImpl userDetailMapperImpl = new UserDetailMapperImpl();

    UserAttributes userAttributes = new UserAttributes();
    userAttributes.assetClasses(new ArrayList<>());
    userAttributes.industries(null);
    userAttributes.accountType(AccountTypeEnum.NORMAL);

    UserDetail userDetail = new UserDetail();
    userDetail.features(new ArrayList<>());
    userDetail.apps(new ArrayList<>());
    userDetail.groups(new ArrayList<>());
    userDetail.roles(new ArrayList<>());
    userDetail.disclaimers(new ArrayList<>());
    userDetail.userAttributes(userAttributes);

    // Act
    V2UserDetail actualUserDetailToV2UserDetailResult =
        userDetailMapperImpl.userDetailToV2UserDetail(userDetail);

    // Assert
    assertTrue(actualUserDetailToV2UserDetailResult.getApps().isEmpty());
    assertTrue(actualUserDetailToV2UserDetailResult.getDisclaimers().isEmpty());
    assertTrue(actualUserDetailToV2UserDetailResult.getFeatures().isEmpty());
    assertTrue(actualUserDetailToV2UserDetailResult.getGroups().isEmpty());
    assertTrue(actualUserDetailToV2UserDetailResult.getRoles().isEmpty());
  }

  /**
   * Test {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}
   */
  @Test
  @DisplayName("Test userDetailToV2UserDetail(UserDetail); when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserDetail UserDetailMapperImpl.userDetailToV2UserDetail(UserDetail)"})
  void testUserDetailToV2UserDetail_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(new UserDetailMapperImpl().userDetailToV2UserDetail(null));
  }

  /**
   * Test {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}.
   *
   * <ul>
   *   <li>When {@link UserDetail} (default constructor).
   *   <li>Then return UserAttributes is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}
   */
  @Test
  @DisplayName(
      "Test userDetailToV2UserDetail(UserDetail); when UserDetail (default constructor); then return UserAttributes is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserDetail UserDetailMapperImpl.userDetailToV2UserDetail(UserDetail)"})
  void testUserDetailToV2UserDetail_whenUserDetail_thenReturnUserAttributesIsNull() {
    // Arrange
    UserDetailMapperImpl userDetailMapperImpl = new UserDetailMapperImpl();

    // Act
    V2UserDetail actualUserDetailToV2UserDetailResult =
        userDetailMapperImpl.userDetailToV2UserDetail(new UserDetail());

    // Assert
    assertNull(actualUserDetailToV2UserDetailResult.getUserAttributes());
    assertNull(actualUserDetailToV2UserDetailResult.getApps());
    assertNull(actualUserDetailToV2UserDetailResult.getDisclaimers());
    assertNull(actualUserDetailToV2UserDetailResult.getFeatures());
    assertNull(actualUserDetailToV2UserDetailResult.getGroups());
    assertNull(actualUserDetailToV2UserDetailResult.getRoles());
  }
}
