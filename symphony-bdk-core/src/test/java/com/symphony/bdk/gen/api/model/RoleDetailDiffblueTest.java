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

class RoleDetailDiffblueTest {
  /**
   * Test {@link RoleDetail#addUserTypesItem(String)}.
   *
   * <ul>
   *   <li>Given {@link RoleDetail} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link RoleDetail#addUserTypesItem(String)}
   */
  @Test
  @DisplayName("Test addUserTypesItem(String); given RoleDetail (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RoleDetail RoleDetail.addUserTypesItem(String)"})
  void testAddUserTypesItem_givenRoleDetail() {
    // Arrange
    RoleDetail roleDetail = new RoleDetail();

    // Act
    RoleDetail actualAddUserTypesItemResult = roleDetail.addUserTypesItem("User Types Item");

    // Assert
    assertSame(roleDetail, actualAddUserTypesItemResult);
  }

  /**
   * Test {@link RoleDetail#addUserTypesItem(String)}.
   *
   * <ul>
   *   <li>Given {@link RoleDetail} (default constructor) userTypes {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link RoleDetail#addUserTypesItem(String)}
   */
  @Test
  @DisplayName(
      "Test addUserTypesItem(String); given RoleDetail (default constructor) userTypes ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RoleDetail RoleDetail.addUserTypesItem(String)"})
  void testAddUserTypesItem_givenRoleDetailUserTypesArrayList() {
    // Arrange
    RoleDetail roleDetail = new RoleDetail();
    roleDetail.userTypes(new ArrayList<>());

    // Act
    RoleDetail actualAddUserTypesItemResult = roleDetail.addUserTypesItem("User Types Item");

    // Assert
    assertSame(roleDetail, actualAddUserTypesItemResult);
  }

  /**
   * Test {@link RoleDetail#addOptionalActionsItem(String)}.
   *
   * <ul>
   *   <li>Given {@link RoleDetail} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link RoleDetail#addOptionalActionsItem(String)}
   */
  @Test
  @DisplayName("Test addOptionalActionsItem(String); given RoleDetail (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RoleDetail RoleDetail.addOptionalActionsItem(String)"})
  void testAddOptionalActionsItem_givenRoleDetail() {
    // Arrange
    RoleDetail roleDetail = new RoleDetail();

    // Act
    RoleDetail actualAddOptionalActionsItemResult =
        roleDetail.addOptionalActionsItem("Optional Actions Item");

    // Assert
    assertSame(roleDetail, actualAddOptionalActionsItemResult);
  }

  /**
   * Test {@link RoleDetail#addOptionalActionsItem(String)}.
   *
   * <ul>
   *   <li>Given {@link RoleDetail} (default constructor) optionalActions {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link RoleDetail#addOptionalActionsItem(String)}
   */
  @Test
  @DisplayName(
      "Test addOptionalActionsItem(String); given RoleDetail (default constructor) optionalActions ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RoleDetail RoleDetail.addOptionalActionsItem(String)"})
  void testAddOptionalActionsItem_givenRoleDetailOptionalActionsArrayList() {
    // Arrange
    RoleDetail roleDetail = new RoleDetail();
    roleDetail.optionalActions(new ArrayList<>());

    // Act
    RoleDetail actualAddOptionalActionsItemResult =
        roleDetail.addOptionalActionsItem("Optional Actions Item");

    // Assert
    assertSame(roleDetail, actualAddOptionalActionsItemResult);
  }

  /**
   * Test {@link RoleDetail#equals(Object)}, and {@link RoleDetail#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RoleDetail#equals(Object)}
   *   <li>{@link RoleDetail#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RoleDetail.equals(Object)", "int RoleDetail.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    RoleDetail roleDetail = new RoleDetail();
    RoleDetail roleDetail2 = new RoleDetail();

    // Act and Assert
    assertEquals(roleDetail, roleDetail2);
    assertEquals(roleDetail.hashCode(), roleDetail2.hashCode());
  }

  /**
   * Test {@link RoleDetail#equals(Object)}, and {@link RoleDetail#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RoleDetail#equals(Object)}
   *   <li>{@link RoleDetail#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RoleDetail.equals(Object)", "int RoleDetail.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    RoleDetail roleDetail = new RoleDetail();

    // Act and Assert
    assertEquals(roleDetail, roleDetail);
    int expectedHashCodeResult = roleDetail.hashCode();
    assertEquals(expectedHashCodeResult, roleDetail.hashCode());
  }

  /**
   * Test {@link RoleDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoleDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RoleDetail.equals(Object)", "int RoleDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    RoleDetail roleDetail = new RoleDetail();
    roleDetail.addUserTypesItem("User Types Item");

    // Act and Assert
    assertNotEquals(roleDetail, new RoleDetail());
  }

  /**
   * Test {@link RoleDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoleDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RoleDetail.equals(Object)", "int RoleDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    RoleDetail roleDetail = new RoleDetail();
    roleDetail.id("42");
    roleDetail.addUserTypesItem("User Types Item");

    // Act and Assert
    assertNotEquals(roleDetail, new RoleDetail());
  }

  /**
   * Test {@link RoleDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoleDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RoleDetail.equals(Object)", "int RoleDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    RoleDetail roleDetail = new RoleDetail();
    roleDetail.name("Name");
    roleDetail.addUserTypesItem("User Types Item");

    // Act and Assert
    assertNotEquals(roleDetail, new RoleDetail());
  }

  /**
   * Test {@link RoleDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoleDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RoleDetail.equals(Object)", "int RoleDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    RoleDetail roleDetail = new RoleDetail();
    roleDetail.addOptionalActionsItem("Optional Actions Item");

    // Act and Assert
    assertNotEquals(roleDetail, new RoleDetail());
  }

  /**
   * Test {@link RoleDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoleDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RoleDetail.equals(Object)", "int RoleDetail.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoleDetail(), null);
  }

  /**
   * Test {@link RoleDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoleDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RoleDetail.equals(Object)", "int RoleDetail.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoleDetail(), "Different type to RoleDetail");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link RoleDetail}
   *   <li>{@link RoleDetail#id(String)}
   *   <li>{@link RoleDetail#name(String)}
   *   <li>{@link RoleDetail#optionalActions(List)}
   *   <li>{@link RoleDetail#setId(String)}
   *   <li>{@link RoleDetail#setName(String)}
   *   <li>{@link RoleDetail#setOptionalActions(List)}
   *   <li>{@link RoleDetail#setUserTypes(List)}
   *   <li>{@link RoleDetail#userTypes(List)}
   *   <li>{@link RoleDetail#toString()}
   *   <li>{@link RoleDetail#getId()}
   *   <li>{@link RoleDetail#getName()}
   *   <li>{@link RoleDetail#getOptionalActions()}
   *   <li>{@link RoleDetail#getUserTypes()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RoleDetail.<init>()",
    "String RoleDetail.getId()",
    "String RoleDetail.getName()",
    "List RoleDetail.getOptionalActions()",
    "List RoleDetail.getUserTypes()",
    "RoleDetail RoleDetail.id(String)",
    "RoleDetail RoleDetail.name(String)",
    "RoleDetail RoleDetail.optionalActions(List)",
    "void RoleDetail.setId(String)",
    "void RoleDetail.setName(String)",
    "void RoleDetail.setOptionalActions(List)",
    "void RoleDetail.setUserTypes(List)",
    "String RoleDetail.toString()",
    "RoleDetail RoleDetail.userTypes(List)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    RoleDetail actualRoleDetail = new RoleDetail();
    RoleDetail actualIdResult = actualRoleDetail.id("42");
    RoleDetail actualNameResult = actualRoleDetail.name("Name");
    RoleDetail actualOptionalActionsResult = actualRoleDetail.optionalActions(new ArrayList<>());
    actualRoleDetail.setId("42");
    actualRoleDetail.setName("Name");
    ArrayList<String> optionalActions = new ArrayList<>();
    actualRoleDetail.setOptionalActions(optionalActions);
    actualRoleDetail.setUserTypes(new ArrayList<>());
    ArrayList<String> userTypes = new ArrayList<>();
    RoleDetail actualUserTypesResult = actualRoleDetail.userTypes(userTypes);
    String actualToStringResult = actualRoleDetail.toString();
    String actualId = actualRoleDetail.getId();
    String actualName = actualRoleDetail.getName();
    List<String> actualOptionalActions = actualRoleDetail.getOptionalActions();
    List<String> actualUserTypes = actualRoleDetail.getUserTypes();

    // Assert
    assertEquals("42", actualId);
    assertEquals("Name", actualName);
    assertEquals(
        "class RoleDetail {\n    id: 42\n    name: Name\n    userTypes: []\n    optionalActions: []\n}",
        actualToStringResult);
    assertTrue(actualOptionalActions.isEmpty());
    assertTrue(actualUserTypes.isEmpty());
    assertSame(actualRoleDetail, actualIdResult);
    assertSame(actualRoleDetail, actualNameResult);
    assertSame(actualRoleDetail, actualOptionalActionsResult);
    assertSame(actualRoleDetail, actualUserTypesResult);
    assertSame(optionalActions, actualOptionalActions);
    assertSame(userTypes, actualUserTypes);
  }
}
