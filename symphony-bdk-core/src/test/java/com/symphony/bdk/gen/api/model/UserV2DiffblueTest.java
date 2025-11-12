package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.UserV2.AccountTypeEnum;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserV2DiffblueTest {
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
   * Test {@link UserV2#addAvatarsItem(Avatar)}.
   *
   * <ul>
   *   <li>Given {@link UserV2} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link UserV2#addAvatarsItem(Avatar)}
   */
  @Test
  @DisplayName("Test addAvatarsItem(Avatar); given UserV2 (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UserV2 UserV2.addAvatarsItem(Avatar)"})
  void testAddAvatarsItem_givenUserV2() {
    // Arrange
    UserV2 userV2 = new UserV2();

    // Act
    UserV2 actualAddAvatarsItemResult = userV2.addAvatarsItem(new Avatar());

    // Assert
    assertSame(userV2, actualAddAvatarsItemResult);
  }

  /**
   * Test {@link UserV2#addAvatarsItem(Avatar)}.
   *
   * <ul>
   *   <li>Given {@link UserV2} (default constructor) avatars {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link UserV2#addAvatarsItem(Avatar)}
   */
  @Test
  @DisplayName(
      "Test addAvatarsItem(Avatar); given UserV2 (default constructor) avatars ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UserV2 UserV2.addAvatarsItem(Avatar)"})
  void testAddAvatarsItem_givenUserV2AvatarsArrayList() {
    // Arrange
    UserV2 userV2 = new UserV2();
    userV2.avatars(new ArrayList<>());

    // Act
    UserV2 actualAddAvatarsItemResult = userV2.addAvatarsItem(new Avatar());

    // Assert
    assertSame(userV2, actualAddAvatarsItemResult);
  }

  /**
   * Test {@link UserV2#addRolesItem(String)}.
   *
   * <ul>
   *   <li>Given {@link UserV2} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link UserV2#addRolesItem(String)}
   */
  @Test
  @DisplayName("Test addRolesItem(String); given UserV2 (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UserV2 UserV2.addRolesItem(String)"})
  void testAddRolesItem_givenUserV2() {
    // Arrange
    UserV2 userV2 = new UserV2();

    // Act
    UserV2 actualAddRolesItemResult = userV2.addRolesItem("Roles Item");

    // Assert
    assertSame(userV2, actualAddRolesItemResult);
  }

  /**
   * Test {@link UserV2#addRolesItem(String)}.
   *
   * <ul>
   *   <li>Given {@link UserV2} (default constructor) roles {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link UserV2#addRolesItem(String)}
   */
  @Test
  @DisplayName("Test addRolesItem(String); given UserV2 (default constructor) roles ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UserV2 UserV2.addRolesItem(String)"})
  void testAddRolesItem_givenUserV2RolesArrayList() {
    // Arrange
    UserV2 userV2 = new UserV2();
    userV2.roles(new ArrayList<>());

    // Act
    UserV2 actualAddRolesItemResult = userV2.addRolesItem("Roles Item");

    // Assert
    assertSame(userV2, actualAddRolesItemResult);
  }

  /**
   * Test {@link UserV2#equals(Object)}, and {@link UserV2#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserV2#equals(Object)}
   *   <li>{@link UserV2#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserV2 userV2 = new UserV2();
    UserV2 userV22 = new UserV2();

    // Act and Assert
    assertEquals(userV2, userV22);
    assertEquals(userV2.hashCode(), userV22.hashCode());
  }

  /**
   * Test {@link UserV2#equals(Object)}, and {@link UserV2#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserV2#equals(Object)}
   *   <li>{@link UserV2#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserV2 userV2 = new UserV2();

    // Act and Assert
    assertEquals(userV2, userV2);
    int expectedHashCodeResult = userV2.hashCode();
    assertEquals(expectedHashCodeResult, userV2.hashCode());
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    UserV2 userV2 = new UserV2();
    userV2.addAvatarsItem(new Avatar());

    // Act and Assert
    assertNotEquals(userV2, new UserV2());
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserV2 userV2 = new UserV2();
    userV2.id(1L);
    userV2.addAvatarsItem(new Avatar());

    // Act and Assert
    assertNotEquals(userV2, new UserV2());
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserV2 userV2 = new UserV2();
    userV2.emailAddress("42 Main St");
    userV2.addAvatarsItem(new Avatar());

    // Act and Assert
    assertNotEquals(userV2, new UserV2());
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    UserV2 userV2 = new UserV2();
    userV2.firstName("Jane");
    userV2.addAvatarsItem(new Avatar());

    // Act and Assert
    assertNotEquals(userV2, new UserV2());
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    UserV2 userV2 = new UserV2();
    userV2.lastName("Doe");
    userV2.addAvatarsItem(new Avatar());

    // Act and Assert
    assertNotEquals(userV2, new UserV2());
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    UserV2 userV2 = new UserV2();
    userV2.displayName("Display Name");
    userV2.addAvatarsItem(new Avatar());

    // Act and Assert
    assertNotEquals(userV2, new UserV2());
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    UserV2 userV2 = new UserV2();
    userV2.title("Dr");
    userV2.addAvatarsItem(new Avatar());

    // Act and Assert
    assertNotEquals(userV2, new UserV2());
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    UserV2 userV2 = new UserV2();
    userV2.company("Company");
    userV2.addAvatarsItem(new Avatar());

    // Act and Assert
    assertNotEquals(userV2, new UserV2());
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    UserV2 userV2 = new UserV2();
    userV2.username("janedoe");
    userV2.addAvatarsItem(new Avatar());

    // Act and Assert
    assertNotEquals(userV2, new UserV2());
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual10() {
    // Arrange
    UserV2 userV2 = new UserV2();
    userV2.location("Location");
    userV2.addAvatarsItem(new Avatar());

    // Act and Assert
    assertNotEquals(userV2, new UserV2());
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual11() {
    // Arrange
    UserV2 userV2 = new UserV2();
    userV2.accountType(AccountTypeEnum.NORMAL);
    userV2.addAvatarsItem(new Avatar());

    // Act and Assert
    assertNotEquals(userV2, new UserV2());
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual12() {
    // Arrange
    UserV2 userV2 = new UserV2();
    userV2.addRolesItem("Roles Item");

    // Act and Assert
    assertNotEquals(userV2, new UserV2());
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual13() {
    // Arrange
    UserV2 userV2 = new UserV2();
    userV2.workPhoneNumber("6625550144");
    userV2.addRolesItem("Roles Item");

    // Act and Assert
    assertNotEquals(userV2, new UserV2());
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual14() {
    // Arrange
    UserV2 userV2 = new UserV2();
    userV2.mobilePhoneNumber("6625550144");
    userV2.addRolesItem("Roles Item");

    // Act and Assert
    assertNotEquals(userV2, new UserV2());
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual15() {
    // Arrange
    UserV2 userV2 = new UserV2();
    userV2.jobFunction("Job Function");
    userV2.addRolesItem("Roles Item");

    // Act and Assert
    assertNotEquals(userV2, new UserV2());
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual16() {
    // Arrange
    UserV2 userV2 = new UserV2();
    userV2.department("Department");
    userV2.addRolesItem("Roles Item");

    // Act and Assert
    assertNotEquals(userV2, new UserV2());
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual17() {
    // Arrange
    UserV2 userV2 = new UserV2();
    userV2.division("Division");
    userV2.addRolesItem("Roles Item");

    // Act and Assert
    assertNotEquals(userV2, new UserV2());
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserV2(), null);
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserV2(), "Different type to UserV2");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UserV2}
   *   <li>{@link UserV2#accountType(AccountTypeEnum)}
   *   <li>{@link UserV2#avatars(List)}
   *   <li>{@link UserV2#company(String)}
   *   <li>{@link UserV2#department(String)}
   *   <li>{@link UserV2#displayName(String)}
   *   <li>{@link UserV2#division(String)}
   *   <li>{@link UserV2#emailAddress(String)}
   *   <li>{@link UserV2#firstName(String)}
   *   <li>{@link UserV2#id(Long)}
   *   <li>{@link UserV2#jobFunction(String)}
   *   <li>{@link UserV2#lastName(String)}
   *   <li>{@link UserV2#location(String)}
   *   <li>{@link UserV2#mobilePhoneNumber(String)}
   *   <li>{@link UserV2#roles(List)}
   *   <li>{@link UserV2#setAccountType(AccountTypeEnum)}
   *   <li>{@link UserV2#setAvatars(List)}
   *   <li>{@link UserV2#setCompany(String)}
   *   <li>{@link UserV2#setDepartment(String)}
   *   <li>{@link UserV2#setDisplayName(String)}
   *   <li>{@link UserV2#setDivision(String)}
   *   <li>{@link UserV2#setEmailAddress(String)}
   *   <li>{@link UserV2#setFirstName(String)}
   *   <li>{@link UserV2#setId(Long)}
   *   <li>{@link UserV2#setJobFunction(String)}
   *   <li>{@link UserV2#setLastName(String)}
   *   <li>{@link UserV2#setLocation(String)}
   *   <li>{@link UserV2#setMobilePhoneNumber(String)}
   *   <li>{@link UserV2#setRoles(List)}
   *   <li>{@link UserV2#setTitle(String)}
   *   <li>{@link UserV2#setUsername(String)}
   *   <li>{@link UserV2#setWorkPhoneNumber(String)}
   *   <li>{@link UserV2#title(String)}
   *   <li>{@link UserV2#username(String)}
   *   <li>{@link UserV2#workPhoneNumber(String)}
   *   <li>{@link UserV2#toString()}
   *   <li>{@link UserV2#getAccountType()}
   *   <li>{@link UserV2#getAvatars()}
   *   <li>{@link UserV2#getCompany()}
   *   <li>{@link UserV2#getDepartment()}
   *   <li>{@link UserV2#getDisplayName()}
   *   <li>{@link UserV2#getDivision()}
   *   <li>{@link UserV2#getEmailAddress()}
   *   <li>{@link UserV2#getFirstName()}
   *   <li>{@link UserV2#getId()}
   *   <li>{@link UserV2#getJobFunction()}
   *   <li>{@link UserV2#getLastName()}
   *   <li>{@link UserV2#getLocation()}
   *   <li>{@link UserV2#getMobilePhoneNumber()}
   *   <li>{@link UserV2#getRoles()}
   *   <li>{@link UserV2#getTitle()}
   *   <li>{@link UserV2#getUsername()}
   *   <li>{@link UserV2#getWorkPhoneNumber()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserV2.<init>()",
    "UserV2 UserV2.accountType(AccountTypeEnum)",
    "UserV2 UserV2.avatars(List)",
    "UserV2 UserV2.company(String)",
    "UserV2 UserV2.department(String)",
    "UserV2 UserV2.displayName(String)",
    "UserV2 UserV2.division(String)",
    "UserV2 UserV2.emailAddress(String)",
    "UserV2 UserV2.firstName(String)",
    "AccountTypeEnum UserV2.getAccountType()",
    "List UserV2.getAvatars()",
    "String UserV2.getCompany()",
    "String UserV2.getDepartment()",
    "String UserV2.getDisplayName()",
    "String UserV2.getDivision()",
    "String UserV2.getEmailAddress()",
    "String UserV2.getFirstName()",
    "Long UserV2.getId()",
    "String UserV2.getJobFunction()",
    "String UserV2.getLastName()",
    "String UserV2.getLocation()",
    "String UserV2.getMobilePhoneNumber()",
    "List UserV2.getRoles()",
    "String UserV2.getTitle()",
    "String UserV2.getUsername()",
    "String UserV2.getWorkPhoneNumber()",
    "UserV2 UserV2.id(Long)",
    "UserV2 UserV2.jobFunction(String)",
    "UserV2 UserV2.lastName(String)",
    "UserV2 UserV2.location(String)",
    "UserV2 UserV2.mobilePhoneNumber(String)",
    "UserV2 UserV2.roles(List)",
    "void UserV2.setAccountType(AccountTypeEnum)",
    "void UserV2.setAvatars(List)",
    "void UserV2.setCompany(String)",
    "void UserV2.setDepartment(String)",
    "void UserV2.setDisplayName(String)",
    "void UserV2.setDivision(String)",
    "void UserV2.setEmailAddress(String)",
    "void UserV2.setFirstName(String)",
    "void UserV2.setId(Long)",
    "void UserV2.setJobFunction(String)",
    "void UserV2.setLastName(String)",
    "void UserV2.setLocation(String)",
    "void UserV2.setMobilePhoneNumber(String)",
    "void UserV2.setRoles(List)",
    "void UserV2.setTitle(String)",
    "void UserV2.setUsername(String)",
    "void UserV2.setWorkPhoneNumber(String)",
    "UserV2 UserV2.title(String)",
    "String UserV2.toString()",
    "UserV2 UserV2.username(String)",
    "UserV2 UserV2.workPhoneNumber(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    UserV2 actualUserV2 = new UserV2();
    UserV2 actualAccountTypeResult = actualUserV2.accountType(AccountTypeEnum.NORMAL);
    UserV2 actualAvatarsResult = actualUserV2.avatars(new ArrayList<>());
    UserV2 actualCompanyResult = actualUserV2.company("Company");
    UserV2 actualDepartmentResult = actualUserV2.department("Department");
    UserV2 actualDisplayNameResult = actualUserV2.displayName("Display Name");
    UserV2 actualDivisionResult = actualUserV2.division("Division");
    UserV2 actualEmailAddressResult = actualUserV2.emailAddress("42 Main St");
    UserV2 actualFirstNameResult = actualUserV2.firstName("Jane");
    UserV2 actualIdResult = actualUserV2.id(1L);
    UserV2 actualJobFunctionResult = actualUserV2.jobFunction("Job Function");
    UserV2 actualLastNameResult = actualUserV2.lastName("Doe");
    UserV2 actualLocationResult = actualUserV2.location("Location");
    UserV2 actualMobilePhoneNumberResult = actualUserV2.mobilePhoneNumber("6625550144");
    UserV2 actualRolesResult = actualUserV2.roles(new ArrayList<>());
    actualUserV2.setAccountType(AccountTypeEnum.NORMAL);
    ArrayList<Avatar> avatars = new ArrayList<>();
    actualUserV2.setAvatars(avatars);
    actualUserV2.setCompany("Company");
    actualUserV2.setDepartment("Department");
    actualUserV2.setDisplayName("Display Name");
    actualUserV2.setDivision("Division");
    actualUserV2.setEmailAddress("42 Main St");
    actualUserV2.setFirstName("Jane");
    actualUserV2.setId(1L);
    actualUserV2.setJobFunction("Job Function");
    actualUserV2.setLastName("Doe");
    actualUserV2.setLocation("Location");
    actualUserV2.setMobilePhoneNumber("6625550144");
    ArrayList<String> roles = new ArrayList<>();
    actualUserV2.setRoles(roles);
    actualUserV2.setTitle("Dr");
    actualUserV2.setUsername("janedoe");
    actualUserV2.setWorkPhoneNumber("6625550144");
    UserV2 actualTitleResult = actualUserV2.title("Dr");
    UserV2 actualUsernameResult = actualUserV2.username("janedoe");
    UserV2 actualWorkPhoneNumberResult = actualUserV2.workPhoneNumber("6625550144");
    String actualToStringResult = actualUserV2.toString();
    AccountTypeEnum actualAccountType = actualUserV2.getAccountType();
    List<Avatar> actualAvatars = actualUserV2.getAvatars();
    String actualCompany = actualUserV2.getCompany();
    String actualDepartment = actualUserV2.getDepartment();
    String actualDisplayName = actualUserV2.getDisplayName();
    String actualDivision = actualUserV2.getDivision();
    String actualEmailAddress = actualUserV2.getEmailAddress();
    String actualFirstName = actualUserV2.getFirstName();
    Long actualId = actualUserV2.getId();
    String actualJobFunction = actualUserV2.getJobFunction();
    String actualLastName = actualUserV2.getLastName();
    String actualLocation = actualUserV2.getLocation();
    String actualMobilePhoneNumber = actualUserV2.getMobilePhoneNumber();
    List<String> actualRoles = actualUserV2.getRoles();
    String actualTitle = actualUserV2.getTitle();
    String actualUsername = actualUserV2.getUsername();

    // Assert
    assertEquals("42 Main St", actualEmailAddress);
    assertEquals("6625550144", actualMobilePhoneNumber);
    assertEquals("6625550144", actualUserV2.getWorkPhoneNumber());
    assertEquals("Company", actualCompany);
    assertEquals("Department", actualDepartment);
    assertEquals("Display Name", actualDisplayName);
    assertEquals("Division", actualDivision);
    assertEquals("Doe", actualLastName);
    assertEquals("Dr", actualTitle);
    assertEquals("Jane", actualFirstName);
    assertEquals("Job Function", actualJobFunction);
    assertEquals("Location", actualLocation);
    assertEquals(
        "class UserV2 {\n"
            + "    id: 1\n"
            + "    emailAddress: 42 Main St\n"
            + "    firstName: Jane\n"
            + "    lastName: Doe\n"
            + "    displayName: Display Name\n"
            + "    title: Dr\n"
            + "    company: Company\n"
            + "    username: janedoe\n"
            + "    location: Location\n"
            + "    accountType: NORMAL\n"
            + "    avatars: []\n"
            + "    workPhoneNumber: 6625550144\n"
            + "    mobilePhoneNumber: 6625550144\n"
            + "    jobFunction: Job Function\n"
            + "    department: Department\n"
            + "    division: Division\n"
            + "    roles: []\n"
            + "}",
        actualToStringResult);
    assertEquals("janedoe", actualUsername);
    assertEquals(1L, actualId.longValue());
    assertEquals(AccountTypeEnum.NORMAL, actualAccountType);
    assertTrue(actualAvatars.isEmpty());
    assertTrue(actualRoles.isEmpty());
    assertSame(actualUserV2, actualAccountTypeResult);
    assertSame(actualUserV2, actualAvatarsResult);
    assertSame(actualUserV2, actualCompanyResult);
    assertSame(actualUserV2, actualDepartmentResult);
    assertSame(actualUserV2, actualDisplayNameResult);
    assertSame(actualUserV2, actualDivisionResult);
    assertSame(actualUserV2, actualEmailAddressResult);
    assertSame(actualUserV2, actualFirstNameResult);
    assertSame(actualUserV2, actualIdResult);
    assertSame(actualUserV2, actualJobFunctionResult);
    assertSame(actualUserV2, actualLastNameResult);
    assertSame(actualUserV2, actualLocationResult);
    assertSame(actualUserV2, actualMobilePhoneNumberResult);
    assertSame(actualUserV2, actualRolesResult);
    assertSame(actualUserV2, actualTitleResult);
    assertSame(actualUserV2, actualUsernameResult);
    assertSame(actualUserV2, actualWorkPhoneNumberResult);
    assertSame(avatars, actualAvatars);
    assertSame(roles, actualRoles);
  }
}
