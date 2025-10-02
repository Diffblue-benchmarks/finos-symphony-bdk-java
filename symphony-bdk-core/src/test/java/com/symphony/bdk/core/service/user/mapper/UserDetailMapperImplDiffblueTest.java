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
import java.util.List;
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
    userAttributes.assetClasses(null);
    userAttributes.industries(null);
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
    assertNull(actualUserAttributesToV2UserAttributesResult.getAssetClasses());
    assertNull(actualUserAttributesToV2UserAttributesResult.getFunction());
    assertNull(actualUserAttributesToV2UserAttributesResult.getIndustries());
    assertNull(actualUserAttributesToV2UserAttributesResult.getInstrument());
    assertNull(actualUserAttributesToV2UserAttributesResult.getMarketCoverage());
    assertNull(actualUserAttributesToV2UserAttributesResult.getResponsibility());
    assertEquals(
        V2UserAttributes.AccountTypeEnum.NORMAL,
        actualUserAttributesToV2UserAttributesResult.getAccountType());
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
    userAttributes.assetClasses(null);
    userAttributes.industries(null);
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
    assertNull(actualUserAttributesToV2UserAttributesResult.getAssetClasses());
    assertNull(actualUserAttributesToV2UserAttributesResult.getFunction());
    assertNull(actualUserAttributesToV2UserAttributesResult.getIndustries());
    assertNull(actualUserAttributesToV2UserAttributesResult.getInstrument());
    assertNull(actualUserAttributesToV2UserAttributesResult.getMarketCoverage());
    assertNull(actualUserAttributesToV2UserAttributesResult.getResponsibility());
    assertEquals(
        V2UserAttributes.AccountTypeEnum.SDL,
        actualUserAttributesToV2UserAttributesResult.getAccountType());
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
    userAttributes.assetClasses(null);
    userAttributes.industries(null);
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
    assertNull(actualUserAttributesToV2UserAttributesResult.getAssetClasses());
    assertNull(actualUserAttributesToV2UserAttributesResult.getFunction());
    assertNull(actualUserAttributesToV2UserAttributesResult.getIndustries());
    assertNull(actualUserAttributesToV2UserAttributesResult.getInstrument());
    assertNull(actualUserAttributesToV2UserAttributesResult.getMarketCoverage());
    assertNull(actualUserAttributesToV2UserAttributesResult.getResponsibility());
    assertEquals(
        V2UserAttributes.AccountTypeEnum.SYSTEM,
        actualUserAttributesToV2UserAttributesResult.getAccountType());
  }

  /**
   * Test {@link UserDetailMapperImpl#userAttributesToV2UserAttributes(UserAttributes)}.
   *
   * <ul>
   *   <li>Then return AssetClasses Empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * UserDetailMapperImpl#userAttributesToV2UserAttributes(UserAttributes)}
   */
  @Test
  @DisplayName(
      "Test userAttributesToV2UserAttributes(UserAttributes); then return AssetClasses Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "V2UserAttributes UserDetailMapperImpl.userAttributesToV2UserAttributes(UserAttributes)"
  })
  void testUserAttributesToV2UserAttributes_thenReturnAssetClassesEmpty() {
    // Arrange
    UserDetailMapperImpl userDetailMapperImpl = new UserDetailMapperImpl();

    UserAttributes userAttributes = new UserAttributes();
    userAttributes.assetClasses(new ArrayList<>());
    userAttributes.industries(null);
    userAttributes.accountType(null);

    // Act
    V2UserAttributes actualUserAttributesToV2UserAttributesResult =
        userDetailMapperImpl.userAttributesToV2UserAttributes(userAttributes);

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
    assertNull(actualUserAttributesToV2UserAttributesResult.getFunction());
    assertNull(actualUserAttributesToV2UserAttributesResult.getIndustries());
    assertNull(actualUserAttributesToV2UserAttributesResult.getInstrument());
    assertNull(actualUserAttributesToV2UserAttributesResult.getMarketCoverage());
    assertNull(actualUserAttributesToV2UserAttributesResult.getResponsibility());
    assertTrue(actualUserAttributesToV2UserAttributesResult.getAssetClasses().isEmpty());
  }

  /**
   * Test {@link UserDetailMapperImpl#userAttributesToV2UserAttributes(UserAttributes)}.
   *
   * <ul>
   *   <li>Then return Industries Empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * UserDetailMapperImpl#userAttributesToV2UserAttributes(UserAttributes)}
   */
  @Test
  @DisplayName(
      "Test userAttributesToV2UserAttributes(UserAttributes); then return Industries Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "V2UserAttributes UserDetailMapperImpl.userAttributesToV2UserAttributes(UserAttributes)"
  })
  void testUserAttributesToV2UserAttributes_thenReturnIndustriesEmpty() {
    // Arrange
    UserDetailMapperImpl userDetailMapperImpl = new UserDetailMapperImpl();

    UserAttributes userAttributes = new UserAttributes();
    userAttributes.assetClasses(null);
    userAttributes.industries(new ArrayList<>());
    userAttributes.accountType(null);

    // Act
    V2UserAttributes actualUserAttributesToV2UserAttributesResult =
        userDetailMapperImpl.userAttributesToV2UserAttributes(userAttributes);

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
    assertNull(actualUserAttributesToV2UserAttributesResult.getInstrument());
    assertNull(actualUserAttributesToV2UserAttributesResult.getMarketCoverage());
    assertNull(actualUserAttributesToV2UserAttributesResult.getResponsibility());
    assertTrue(actualUserAttributesToV2UserAttributesResult.getIndustries().isEmpty());
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
   * Test {@link UserDetailMapperImpl#userAttributesToV2UserAttributes(UserAttributes)}.
   *
   * <ul>
   *   <li>When {@link UserAttributes} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link
   * UserDetailMapperImpl#userAttributesToV2UserAttributes(UserAttributes)}
   */
  @Test
  @DisplayName(
      "Test userAttributesToV2UserAttributes(UserAttributes); when UserAttributes (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "V2UserAttributes UserDetailMapperImpl.userAttributesToV2UserAttributes(UserAttributes)"
  })
  void testUserAttributesToV2UserAttributes_whenUserAttributes() {
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
   * Test {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return Disclaimers is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}
   */
  @Test
  @DisplayName(
      "Test userDetailToV2UserDetail(UserDetail); given one; then return Disclaimers is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserDetail UserDetailMapperImpl.userDetailToV2UserDetail(UserDetail)"})
  void testUserDetailToV2UserDetail_givenOne_thenReturnDisclaimersIsNull() {
    // Arrange
    UserDetailMapperImpl userDetailMapperImpl = new UserDetailMapperImpl();

    UserDetail userDetail = new UserDetail();
    userDetail.addFeaturesItem(1L);

    // Act
    V2UserDetail actualUserDetailToV2UserDetailResult =
        userDetailMapperImpl.userDetailToV2UserDetail(userDetail);

    // Assert
    assertNull(actualUserDetailToV2UserDetailResult.getDisclaimers());
    assertNull(actualUserDetailToV2UserDetailResult.getRoles());
    List<Long> features = actualUserDetailToV2UserDetailResult.getFeatures();
    assertEquals(1, features.size());
    assertEquals(1L, features.get(0).longValue());
  }

  /**
   * Test {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}.
   *
   * <ul>
   *   <li>Given {@link UserAttributes} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}
   */
  @Test
  @DisplayName(
      "Test userDetailToV2UserDetail(UserDetail); given UserAttributes (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserDetail UserDetailMapperImpl.userDetailToV2UserDetail(UserDetail)"})
  void testUserDetailToV2UserDetail_givenUserAttributes() {
    // Arrange
    UserDetailMapperImpl userDetailMapperImpl = new UserDetailMapperImpl();

    UserDetail userDetail = new UserDetail();
    userDetail.features(null);
    userDetail.apps(null);
    userDetail.groups(null);
    userDetail.roles(null);
    userDetail.disclaimers(null);
    userDetail.userAttributes(new UserAttributes());

    // Act and Assert
    V2UserAttributes userAttributes =
        userDetailMapperImpl.userDetailToV2UserDetail(userDetail).getUserAttributes();
    assertNull(userAttributes.getAccountType());
    assertNull(userAttributes.getCurrentKey());
    assertNull(userAttributes.getPreviousKey());
    assertNull(userAttributes.getCompanyName());
    assertNull(userAttributes.getDepartment());
    assertNull(userAttributes.getDisplayName());
    assertNull(userAttributes.getDivision());
    assertNull(userAttributes.getEmailAddress());
    assertNull(userAttributes.getFirstName());
    assertNull(userAttributes.getJobFunction());
    assertNull(userAttributes.getLastName());
    assertNull(userAttributes.getLocation());
    assertNull(userAttributes.getMobilePhoneNumber());
    assertNull(userAttributes.getRecommendedLanguage());
    assertNull(userAttributes.getSmsNumber());
    assertNull(userAttributes.getTitle());
    assertNull(userAttributes.getTwoFactorAuthPhone());
    assertNull(userAttributes.getUserName());
    assertNull(userAttributes.getWorkPhoneNumber());
    assertNull(userAttributes.getAssetClasses());
    assertNull(userAttributes.getFunction());
    assertNull(userAttributes.getIndustries());
    assertNull(userAttributes.getInstrument());
    assertNull(userAttributes.getMarketCoverage());
    assertNull(userAttributes.getResponsibility());
  }

  /**
   * Test {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}.
   *
   * <ul>
   *   <li>Then return Apps size is one.
   * </ul>
   *
   * <p>Method under test: {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}
   */
  @Test
  @DisplayName("Test userDetailToV2UserDetail(UserDetail); then return Apps size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserDetail UserDetailMapperImpl.userDetailToV2UserDetail(UserDetail)"})
  void testUserDetailToV2UserDetail_thenReturnAppsSizeIsOne() {
    // Arrange
    UserDetailMapperImpl userDetailMapperImpl = new UserDetailMapperImpl();

    UserDetail userDetail = new UserDetail();
    userDetail.addAppsItem(0L);
    userDetail.addFeaturesItem(1L);

    // Act
    V2UserDetail actualUserDetailToV2UserDetailResult =
        userDetailMapperImpl.userDetailToV2UserDetail(userDetail);

    // Assert
    List<Long> apps = actualUserDetailToV2UserDetailResult.getApps();
    assertEquals(1, apps.size());
    assertEquals(0L, apps.get(0).longValue());
    List<Long> features = actualUserDetailToV2UserDetailResult.getFeatures();
    assertEquals(1, features.size());
    assertEquals(1L, features.get(0).longValue());
  }

  /**
   * Test {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}.
   *
   * <ul>
   *   <li>Then return Disclaimers Empty.
   * </ul>
   *
   * <p>Method under test: {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}
   */
  @Test
  @DisplayName("Test userDetailToV2UserDetail(UserDetail); then return Disclaimers Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserDetail UserDetailMapperImpl.userDetailToV2UserDetail(UserDetail)"})
  void testUserDetailToV2UserDetail_thenReturnDisclaimersEmpty() {
    // Arrange
    UserDetailMapperImpl userDetailMapperImpl = new UserDetailMapperImpl();

    UserDetail userDetail = new UserDetail();
    userDetail.features(null);
    userDetail.apps(null);
    userDetail.groups(null);
    userDetail.roles(null);
    userDetail.disclaimers(new ArrayList<>());
    userDetail.userAttributes(null);

    // Act
    V2UserDetail actualUserDetailToV2UserDetailResult =
        userDetailMapperImpl.userDetailToV2UserDetail(userDetail);

    // Assert
    assertNull(actualUserDetailToV2UserDetailResult.getUserAttributes());
    assertNull(actualUserDetailToV2UserDetailResult.getApps());
    assertNull(actualUserDetailToV2UserDetailResult.getFeatures());
    assertNull(actualUserDetailToV2UserDetailResult.getGroups());
    assertNull(actualUserDetailToV2UserDetailResult.getRoles());
    assertTrue(actualUserDetailToV2UserDetailResult.getDisclaimers().isEmpty());
  }

  /**
   * Test {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}.
   *
   * <ul>
   *   <li>Then return Groups size is one.
   * </ul>
   *
   * <p>Method under test: {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}
   */
  @Test
  @DisplayName("Test userDetailToV2UserDetail(UserDetail); then return Groups size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserDetail UserDetailMapperImpl.userDetailToV2UserDetail(UserDetail)"})
  void testUserDetailToV2UserDetail_thenReturnGroupsSizeIsOne() {
    // Arrange
    UserDetailMapperImpl userDetailMapperImpl = new UserDetailMapperImpl();

    UserDetail userDetail = new UserDetail();
    userDetail.addGroupsItem(0L);
    userDetail.addFeaturesItem(1L);

    // Act
    V2UserDetail actualUserDetailToV2UserDetailResult =
        userDetailMapperImpl.userDetailToV2UserDetail(userDetail);

    // Assert
    List<Long> groups = actualUserDetailToV2UserDetailResult.getGroups();
    assertEquals(1, groups.size());
    assertEquals(0L, groups.get(0).longValue());
    List<Long> features = actualUserDetailToV2UserDetailResult.getFeatures();
    assertEquals(1, features.size());
    assertEquals(1L, features.get(0).longValue());
  }

  /**
   * Test {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}.
   *
   * <ul>
   *   <li>Then return UserAttributes AccountType is {@code NORMAL}.
   * </ul>
   *
   * <p>Method under test: {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}
   */
  @Test
  @DisplayName(
      "Test userDetailToV2UserDetail(UserDetail); then return UserAttributes AccountType is 'NORMAL'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserDetail UserDetailMapperImpl.userDetailToV2UserDetail(UserDetail)"})
  void testUserDetailToV2UserDetail_thenReturnUserAttributesAccountTypeIsNormal() {
    // Arrange
    UserDetailMapperImpl userDetailMapperImpl = new UserDetailMapperImpl();

    UserAttributes userAttributes = new UserAttributes();
    userAttributes.assetClasses(null);
    userAttributes.industries(null);
    userAttributes.accountType(AccountTypeEnum.NORMAL);

    UserDetail userDetail = new UserDetail();
    userDetail.features(null);
    userDetail.apps(null);
    userDetail.groups(null);
    userDetail.roles(null);
    userDetail.disclaimers(null);
    userDetail.userAttributes(userAttributes);

    // Act and Assert
    V2UserAttributes userAttributes2 =
        userDetailMapperImpl.userDetailToV2UserDetail(userDetail).getUserAttributes();
    assertNull(userAttributes2.getCurrentKey());
    assertNull(userAttributes2.getPreviousKey());
    assertNull(userAttributes2.getCompanyName());
    assertNull(userAttributes2.getDepartment());
    assertNull(userAttributes2.getDisplayName());
    assertNull(userAttributes2.getDivision());
    assertNull(userAttributes2.getEmailAddress());
    assertNull(userAttributes2.getFirstName());
    assertNull(userAttributes2.getJobFunction());
    assertNull(userAttributes2.getLastName());
    assertNull(userAttributes2.getLocation());
    assertNull(userAttributes2.getMobilePhoneNumber());
    assertNull(userAttributes2.getRecommendedLanguage());
    assertNull(userAttributes2.getSmsNumber());
    assertNull(userAttributes2.getTitle());
    assertNull(userAttributes2.getTwoFactorAuthPhone());
    assertNull(userAttributes2.getUserName());
    assertNull(userAttributes2.getWorkPhoneNumber());
    assertNull(userAttributes2.getAssetClasses());
    assertNull(userAttributes2.getFunction());
    assertNull(userAttributes2.getIndustries());
    assertNull(userAttributes2.getInstrument());
    assertNull(userAttributes2.getMarketCoverage());
    assertNull(userAttributes2.getResponsibility());
    assertEquals(V2UserAttributes.AccountTypeEnum.NORMAL, userAttributes2.getAccountType());
  }

  /**
   * Test {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}.
   *
   * <ul>
   *   <li>Then return UserAttributes AccountType is {@code SDL}.
   * </ul>
   *
   * <p>Method under test: {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}
   */
  @Test
  @DisplayName(
      "Test userDetailToV2UserDetail(UserDetail); then return UserAttributes AccountType is 'SDL'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserDetail UserDetailMapperImpl.userDetailToV2UserDetail(UserDetail)"})
  void testUserDetailToV2UserDetail_thenReturnUserAttributesAccountTypeIsSdl() {
    // Arrange
    UserDetailMapperImpl userDetailMapperImpl = new UserDetailMapperImpl();

    UserAttributes userAttributes = new UserAttributes();
    userAttributes.assetClasses(null);
    userAttributes.industries(null);
    userAttributes.accountType(AccountTypeEnum.SDL);

    UserDetail userDetail = new UserDetail();
    userDetail.features(null);
    userDetail.apps(null);
    userDetail.groups(null);
    userDetail.roles(null);
    userDetail.disclaimers(null);
    userDetail.userAttributes(userAttributes);

    // Act and Assert
    V2UserAttributes userAttributes2 =
        userDetailMapperImpl.userDetailToV2UserDetail(userDetail).getUserAttributes();
    assertNull(userAttributes2.getCurrentKey());
    assertNull(userAttributes2.getPreviousKey());
    assertNull(userAttributes2.getCompanyName());
    assertNull(userAttributes2.getDepartment());
    assertNull(userAttributes2.getDisplayName());
    assertNull(userAttributes2.getDivision());
    assertNull(userAttributes2.getEmailAddress());
    assertNull(userAttributes2.getFirstName());
    assertNull(userAttributes2.getJobFunction());
    assertNull(userAttributes2.getLastName());
    assertNull(userAttributes2.getLocation());
    assertNull(userAttributes2.getMobilePhoneNumber());
    assertNull(userAttributes2.getRecommendedLanguage());
    assertNull(userAttributes2.getSmsNumber());
    assertNull(userAttributes2.getTitle());
    assertNull(userAttributes2.getTwoFactorAuthPhone());
    assertNull(userAttributes2.getUserName());
    assertNull(userAttributes2.getWorkPhoneNumber());
    assertNull(userAttributes2.getAssetClasses());
    assertNull(userAttributes2.getFunction());
    assertNull(userAttributes2.getIndustries());
    assertNull(userAttributes2.getInstrument());
    assertNull(userAttributes2.getMarketCoverage());
    assertNull(userAttributes2.getResponsibility());
    assertEquals(V2UserAttributes.AccountTypeEnum.SDL, userAttributes2.getAccountType());
  }

  /**
   * Test {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}.
   *
   * <ul>
   *   <li>Then return UserAttributes AccountType is {@code SYSTEM}.
   * </ul>
   *
   * <p>Method under test: {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}
   */
  @Test
  @DisplayName(
      "Test userDetailToV2UserDetail(UserDetail); then return UserAttributes AccountType is 'SYSTEM'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserDetail UserDetailMapperImpl.userDetailToV2UserDetail(UserDetail)"})
  void testUserDetailToV2UserDetail_thenReturnUserAttributesAccountTypeIsSystem() {
    // Arrange
    UserDetailMapperImpl userDetailMapperImpl = new UserDetailMapperImpl();

    UserAttributes userAttributes = new UserAttributes();
    userAttributes.assetClasses(null);
    userAttributes.industries(null);
    userAttributes.accountType(AccountTypeEnum.SYSTEM);

    UserDetail userDetail = new UserDetail();
    userDetail.features(null);
    userDetail.apps(null);
    userDetail.groups(null);
    userDetail.roles(null);
    userDetail.disclaimers(null);
    userDetail.userAttributes(userAttributes);

    // Act and Assert
    V2UserAttributes userAttributes2 =
        userDetailMapperImpl.userDetailToV2UserDetail(userDetail).getUserAttributes();
    assertNull(userAttributes2.getCurrentKey());
    assertNull(userAttributes2.getPreviousKey());
    assertNull(userAttributes2.getCompanyName());
    assertNull(userAttributes2.getDepartment());
    assertNull(userAttributes2.getDisplayName());
    assertNull(userAttributes2.getDivision());
    assertNull(userAttributes2.getEmailAddress());
    assertNull(userAttributes2.getFirstName());
    assertNull(userAttributes2.getJobFunction());
    assertNull(userAttributes2.getLastName());
    assertNull(userAttributes2.getLocation());
    assertNull(userAttributes2.getMobilePhoneNumber());
    assertNull(userAttributes2.getRecommendedLanguage());
    assertNull(userAttributes2.getSmsNumber());
    assertNull(userAttributes2.getTitle());
    assertNull(userAttributes2.getTwoFactorAuthPhone());
    assertNull(userAttributes2.getUserName());
    assertNull(userAttributes2.getWorkPhoneNumber());
    assertNull(userAttributes2.getAssetClasses());
    assertNull(userAttributes2.getFunction());
    assertNull(userAttributes2.getIndustries());
    assertNull(userAttributes2.getInstrument());
    assertNull(userAttributes2.getMarketCoverage());
    assertNull(userAttributes2.getResponsibility());
    assertEquals(V2UserAttributes.AccountTypeEnum.SYSTEM, userAttributes2.getAccountType());
  }

  /**
   * Test {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}.
   *
   * <ul>
   *   <li>Then return UserAttributes AssetClasses Empty.
   * </ul>
   *
   * <p>Method under test: {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}
   */
  @Test
  @DisplayName(
      "Test userDetailToV2UserDetail(UserDetail); then return UserAttributes AssetClasses Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserDetail UserDetailMapperImpl.userDetailToV2UserDetail(UserDetail)"})
  void testUserDetailToV2UserDetail_thenReturnUserAttributesAssetClassesEmpty() {
    // Arrange
    UserDetailMapperImpl userDetailMapperImpl = new UserDetailMapperImpl();

    UserAttributes userAttributes = new UserAttributes();
    userAttributes.assetClasses(new ArrayList<>());
    userAttributes.industries(null);
    userAttributes.accountType(null);

    UserDetail userDetail = new UserDetail();
    userDetail.features(null);
    userDetail.apps(null);
    userDetail.groups(null);
    userDetail.roles(null);
    userDetail.disclaimers(null);
    userDetail.userAttributes(userAttributes);

    // Act and Assert
    V2UserAttributes userAttributes2 =
        userDetailMapperImpl.userDetailToV2UserDetail(userDetail).getUserAttributes();
    assertNull(userAttributes2.getAccountType());
    assertNull(userAttributes2.getCurrentKey());
    assertNull(userAttributes2.getPreviousKey());
    assertNull(userAttributes2.getCompanyName());
    assertNull(userAttributes2.getDepartment());
    assertNull(userAttributes2.getDisplayName());
    assertNull(userAttributes2.getDivision());
    assertNull(userAttributes2.getEmailAddress());
    assertNull(userAttributes2.getFirstName());
    assertNull(userAttributes2.getJobFunction());
    assertNull(userAttributes2.getLastName());
    assertNull(userAttributes2.getLocation());
    assertNull(userAttributes2.getMobilePhoneNumber());
    assertNull(userAttributes2.getRecommendedLanguage());
    assertNull(userAttributes2.getSmsNumber());
    assertNull(userAttributes2.getTitle());
    assertNull(userAttributes2.getTwoFactorAuthPhone());
    assertNull(userAttributes2.getUserName());
    assertNull(userAttributes2.getWorkPhoneNumber());
    assertNull(userAttributes2.getFunction());
    assertNull(userAttributes2.getIndustries());
    assertNull(userAttributes2.getInstrument());
    assertNull(userAttributes2.getMarketCoverage());
    assertNull(userAttributes2.getResponsibility());
    assertTrue(userAttributes2.getAssetClasses().isEmpty());
  }

  /**
   * Test {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}.
   *
   * <ul>
   *   <li>Then return UserAttributes Industries Empty.
   * </ul>
   *
   * <p>Method under test: {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}
   */
  @Test
  @DisplayName(
      "Test userDetailToV2UserDetail(UserDetail); then return UserAttributes Industries Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserDetail UserDetailMapperImpl.userDetailToV2UserDetail(UserDetail)"})
  void testUserDetailToV2UserDetail_thenReturnUserAttributesIndustriesEmpty() {
    // Arrange
    UserDetailMapperImpl userDetailMapperImpl = new UserDetailMapperImpl();

    UserAttributes userAttributes = new UserAttributes();
    userAttributes.assetClasses(null);
    userAttributes.industries(new ArrayList<>());
    userAttributes.accountType(null);

    UserDetail userDetail = new UserDetail();
    userDetail.features(null);
    userDetail.apps(null);
    userDetail.groups(null);
    userDetail.roles(null);
    userDetail.disclaimers(null);
    userDetail.userAttributes(userAttributes);

    // Act and Assert
    V2UserAttributes userAttributes2 =
        userDetailMapperImpl.userDetailToV2UserDetail(userDetail).getUserAttributes();
    assertNull(userAttributes2.getAccountType());
    assertNull(userAttributes2.getCurrentKey());
    assertNull(userAttributes2.getPreviousKey());
    assertNull(userAttributes2.getCompanyName());
    assertNull(userAttributes2.getDepartment());
    assertNull(userAttributes2.getDisplayName());
    assertNull(userAttributes2.getDivision());
    assertNull(userAttributes2.getEmailAddress());
    assertNull(userAttributes2.getFirstName());
    assertNull(userAttributes2.getJobFunction());
    assertNull(userAttributes2.getLastName());
    assertNull(userAttributes2.getLocation());
    assertNull(userAttributes2.getMobilePhoneNumber());
    assertNull(userAttributes2.getRecommendedLanguage());
    assertNull(userAttributes2.getSmsNumber());
    assertNull(userAttributes2.getTitle());
    assertNull(userAttributes2.getTwoFactorAuthPhone());
    assertNull(userAttributes2.getUserName());
    assertNull(userAttributes2.getWorkPhoneNumber());
    assertNull(userAttributes2.getAssetClasses());
    assertNull(userAttributes2.getFunction());
    assertNull(userAttributes2.getInstrument());
    assertNull(userAttributes2.getMarketCoverage());
    assertNull(userAttributes2.getResponsibility());
    assertTrue(userAttributes2.getIndustries().isEmpty());
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
   *   <li>When {@link UserDetail} (default constructor) roles {@link ArrayList#ArrayList()}.
   *   <li>Then return Roles Empty.
   * </ul>
   *
   * <p>Method under test: {@link UserDetailMapperImpl#userDetailToV2UserDetail(UserDetail)}
   */
  @Test
  @DisplayName(
      "Test userDetailToV2UserDetail(UserDetail); when UserDetail (default constructor) roles ArrayList(); then return Roles Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserDetail UserDetailMapperImpl.userDetailToV2UserDetail(UserDetail)"})
  void testUserDetailToV2UserDetail_whenUserDetailRolesArrayList_thenReturnRolesEmpty() {
    // Arrange
    UserDetailMapperImpl userDetailMapperImpl = new UserDetailMapperImpl();

    UserDetail userDetail = new UserDetail();
    userDetail.features(null);
    userDetail.apps(null);
    userDetail.groups(null);
    userDetail.roles(new ArrayList<>());
    userDetail.disclaimers(null);
    userDetail.userAttributes(null);

    // Act
    V2UserDetail actualUserDetailToV2UserDetailResult =
        userDetailMapperImpl.userDetailToV2UserDetail(userDetail);

    // Assert
    assertNull(actualUserDetailToV2UserDetailResult.getUserAttributes());
    assertNull(actualUserDetailToV2UserDetailResult.getApps());
    assertNull(actualUserDetailToV2UserDetailResult.getDisclaimers());
    assertNull(actualUserDetailToV2UserDetailResult.getFeatures());
    assertNull(actualUserDetailToV2UserDetailResult.getGroups());
    assertTrue(actualUserDetailToV2UserDetailResult.getRoles().isEmpty());
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
