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

class V2UserCreateDiffblueTest {
  /**
   * Test {@link V2UserCreate#addRolesItem(String)}.
   *
   * <ul>
   *   <li>Given {@link V2UserCreate} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link V2UserCreate#addRolesItem(String)}
   */
  @Test
  @DisplayName("Test addRolesItem(String); given V2UserCreate (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserCreate V2UserCreate.addRolesItem(String)"})
  void testAddRolesItem_givenV2UserCreate() {
    // Arrange
    V2UserCreate v2UserCreate = new V2UserCreate();

    // Act and Assert
    assertSame(v2UserCreate, v2UserCreate.addRolesItem("Roles Item"));
  }

  /**
   * Test {@link V2UserCreate#addRolesItem(String)}.
   *
   * <ul>
   *   <li>Given {@link V2UserCreate} (default constructor) roles {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link V2UserCreate#addRolesItem(String)}
   */
  @Test
  @DisplayName(
      "Test addRolesItem(String); given V2UserCreate (default constructor) roles ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserCreate V2UserCreate.addRolesItem(String)"})
  void testAddRolesItem_givenV2UserCreateRolesArrayList() {
    // Arrange
    V2UserCreate v2UserCreate = new V2UserCreate();
    v2UserCreate.roles(new ArrayList<>());

    // Act and Assert
    assertSame(v2UserCreate, v2UserCreate.addRolesItem("Roles Item"));
  }

  /**
   * Test {@link V2UserCreate#equals(Object)}, and {@link V2UserCreate#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2UserCreate#equals(Object)}
   *   <li>{@link V2UserCreate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserCreate.equals(Object)", "int V2UserCreate.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2UserCreate v2UserCreate = new V2UserCreate();
    V2UserCreate v2UserCreate2 = new V2UserCreate();

    // Act and Assert
    assertEquals(v2UserCreate, v2UserCreate2);
    int expectedHashCodeResult = v2UserCreate.hashCode();
    assertEquals(expectedHashCodeResult, v2UserCreate2.hashCode());
  }

  /**
   * Test {@link V2UserCreate#equals(Object)}, and {@link V2UserCreate#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2UserCreate#equals(Object)}
   *   <li>{@link V2UserCreate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserCreate.equals(Object)", "int V2UserCreate.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2UserCreate v2UserCreate = new V2UserCreate();

    // Act and Assert
    assertEquals(v2UserCreate, v2UserCreate);
    int expectedHashCodeResult = v2UserCreate.hashCode();
    assertEquals(expectedHashCodeResult, v2UserCreate.hashCode());
  }

  /**
   * Test {@link V2UserCreate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserCreate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserCreate.equals(Object)", "int V2UserCreate.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V2UserCreate v2UserCreate = new V2UserCreate();
    v2UserCreate.addRolesItem("Roles Item");

    // Act and Assert
    assertNotEquals(v2UserCreate, new V2UserCreate());
  }

  /**
   * Test {@link V2UserCreate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserCreate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserCreate.equals(Object)", "int V2UserCreate.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V2UserCreate v2UserCreate = new V2UserCreate();
    v2UserCreate.userAttributes(new V2UserAttributes());
    v2UserCreate.addRolesItem("Roles Item");

    // Act and Assert
    assertNotEquals(v2UserCreate, new V2UserCreate());
  }

  /**
   * Test {@link V2UserCreate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserCreate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserCreate.equals(Object)", "int V2UserCreate.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V2UserCreate v2UserCreate = new V2UserCreate();
    v2UserCreate.password(new Password());
    v2UserCreate.addRolesItem("Roles Item");

    // Act and Assert
    assertNotEquals(v2UserCreate, new V2UserCreate());
  }

  /**
   * Test {@link V2UserCreate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserCreate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserCreate.equals(Object)", "int V2UserCreate.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2UserCreate(), null);
  }

  /**
   * Test {@link V2UserCreate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserCreate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserCreate.equals(Object)", "int V2UserCreate.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2UserCreate(), "Different type to V2UserCreate");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V2UserCreate}
   *   <li>{@link V2UserCreate#password(Password)}
   *   <li>{@link V2UserCreate#roles(List)}
   *   <li>{@link V2UserCreate#setPassword(Password)}
   *   <li>{@link V2UserCreate#setRoles(List)}
   *   <li>{@link V2UserCreate#setUserAttributes(V2UserAttributes)}
   *   <li>{@link V2UserCreate#userAttributes(V2UserAttributes)}
   *   <li>{@link V2UserCreate#toString()}
   *   <li>{@link V2UserCreate#getPassword()}
   *   <li>{@link V2UserCreate#getRoles()}
   *   <li>{@link V2UserCreate#getUserAttributes()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V2UserCreate.<init>()",
    "Password V2UserCreate.getPassword()",
    "List V2UserCreate.getRoles()",
    "V2UserAttributes V2UserCreate.getUserAttributes()",
    "V2UserCreate V2UserCreate.password(Password)",
    "V2UserCreate V2UserCreate.roles(List)",
    "void V2UserCreate.setPassword(Password)",
    "void V2UserCreate.setRoles(List)",
    "void V2UserCreate.setUserAttributes(V2UserAttributes)",
    "String V2UserCreate.toString()",
    "V2UserCreate V2UserCreate.userAttributes(V2UserAttributes)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V2UserCreate actualV2UserCreate = new V2UserCreate();
    V2UserCreate actualPasswordResult = actualV2UserCreate.password(new Password());
    V2UserCreate actualRolesResult = actualV2UserCreate.roles(new ArrayList<>());
    Password password = new Password();
    actualV2UserCreate.setPassword(password);
    ArrayList<String> roles = new ArrayList<>();
    actualV2UserCreate.setRoles(roles);
    actualV2UserCreate.setUserAttributes(new V2UserAttributes());
    V2UserAttributes userAttributes = new V2UserAttributes();
    V2UserCreate actualUserAttributesResult = actualV2UserCreate.userAttributes(userAttributes);
    String actualToStringResult = actualV2UserCreate.toString();
    Password actualPassword = actualV2UserCreate.getPassword();
    List<String> actualRoles = actualV2UserCreate.getRoles();
    V2UserAttributes actualUserAttributes = actualV2UserCreate.getUserAttributes();

    // Assert
    assertEquals(
        "class V2UserCreate {\n"
            + "    userAttributes: class V2UserAttributes {\n"
            + "        emailAddress: null\n"
            + "        firstName: null\n"
            + "        lastName: null\n"
            + "        userName: null\n"
            + "        displayName: null\n"
            + "        companyName: null\n"
            + "        department: null\n"
            + "        division: null\n"
            + "        title: null\n"
            + "        workPhoneNumber: null\n"
            + "        mobilePhoneNumber: null\n"
            + "        twoFactorAuthPhone: null\n"
            + "        smsNumber: null\n"
            + "        accountType: null\n"
            + "        location: null\n"
            + "        recommendedLanguage: null\n"
            + "        jobFunction: null\n"
            + "        assetClasses: null\n"
            + "        industries: null\n"
            + "        marketCoverage: null\n"
            + "        responsibility: null\n"
            + "        function: null\n"
            + "        instrument: null\n"
            + "        currentKey: null\n"
            + "        previousKey: null\n"
            + "    }\n"
            + "    password: class Password {\n"
            + "        hSalt: null\n"
            + "        hPassword: null\n"
            + "        khSalt: null\n"
            + "        khPassword: null\n"
            + "    }\n"
            + "    roles: []\n"
            + "}",
        actualToStringResult);
    assertTrue(actualRoles.isEmpty());
    assertSame(password, actualPassword);
    assertSame(userAttributes, actualUserAttributes);
    assertSame(actualV2UserCreate, actualPasswordResult);
    assertSame(actualV2UserCreate, actualRolesResult);
    assertSame(actualV2UserCreate, actualUserAttributesResult);
    assertSame(roles, actualRoles);
  }
}
