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

class V2UserListDiffblueTest {
  /**
   * Test {@link V2UserList#addUsersItem(UserV2)}.
   *
   * <ul>
   *   <li>Given {@link V2UserList} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link V2UserList#addUsersItem(UserV2)}
   */
  @Test
  @DisplayName("Test addUsersItem(UserV2); given V2UserList (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserList V2UserList.addUsersItem(UserV2)"})
  void testAddUsersItem_givenV2UserList() {
    // Arrange
    V2UserList v2UserList = new V2UserList();

    // Act
    V2UserList actualAddUsersItemResult = v2UserList.addUsersItem(new UserV2());

    // Assert
    assertSame(v2UserList, actualAddUsersItemResult);
  }

  /**
   * Test {@link V2UserList#addUsersItem(UserV2)}.
   *
   * <ul>
   *   <li>Given {@link V2UserList} (default constructor) users {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link V2UserList#addUsersItem(UserV2)}
   */
  @Test
  @DisplayName(
      "Test addUsersItem(UserV2); given V2UserList (default constructor) users ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserList V2UserList.addUsersItem(UserV2)"})
  void testAddUsersItem_givenV2UserListUsersArrayList() {
    // Arrange
    V2UserList v2UserList = new V2UserList();
    v2UserList.users(new ArrayList<>());

    // Act
    V2UserList actualAddUsersItemResult = v2UserList.addUsersItem(new UserV2());

    // Assert
    assertSame(v2UserList, actualAddUsersItemResult);
  }

  /**
   * Test {@link V2UserList#addErrorsItem(UserError)}.
   *
   * <ul>
   *   <li>Given {@link V2UserList} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link V2UserList#addErrorsItem(UserError)}
   */
  @Test
  @DisplayName("Test addErrorsItem(UserError); given V2UserList (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserList V2UserList.addErrorsItem(UserError)"})
  void testAddErrorsItem_givenV2UserList() {
    // Arrange
    V2UserList v2UserList = new V2UserList();

    // Act
    V2UserList actualAddErrorsItemResult = v2UserList.addErrorsItem(new UserError());

    // Assert
    assertSame(v2UserList, actualAddErrorsItemResult);
  }

  /**
   * Test {@link V2UserList#addErrorsItem(UserError)}.
   *
   * <ul>
   *   <li>Given {@link V2UserList} (default constructor) errors {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link V2UserList#addErrorsItem(UserError)}
   */
  @Test
  @DisplayName(
      "Test addErrorsItem(UserError); given V2UserList (default constructor) errors ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserList V2UserList.addErrorsItem(UserError)"})
  void testAddErrorsItem_givenV2UserListErrorsArrayList() {
    // Arrange
    V2UserList v2UserList = new V2UserList();
    v2UserList.errors(new ArrayList<>());

    // Act
    V2UserList actualAddErrorsItemResult = v2UserList.addErrorsItem(new UserError());

    // Assert
    assertSame(v2UserList, actualAddErrorsItemResult);
  }

  /**
   * Test {@link V2UserList#equals(Object)}, and {@link V2UserList#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2UserList#equals(Object)}
   *   <li>{@link V2UserList#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserList.equals(Object)", "int V2UserList.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2UserList v2UserList = new V2UserList();
    V2UserList v2UserList2 = new V2UserList();

    // Act and Assert
    assertEquals(v2UserList, v2UserList2);
    assertEquals(v2UserList.hashCode(), v2UserList2.hashCode());
  }

  /**
   * Test {@link V2UserList#equals(Object)}, and {@link V2UserList#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2UserList#equals(Object)}
   *   <li>{@link V2UserList#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserList.equals(Object)", "int V2UserList.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2UserList v2UserList = new V2UserList();

    // Act and Assert
    assertEquals(v2UserList, v2UserList);
    int expectedHashCodeResult = v2UserList.hashCode();
    assertEquals(expectedHashCodeResult, v2UserList.hashCode());
  }

  /**
   * Test {@link V2UserList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserList.equals(Object)", "int V2UserList.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V2UserList v2UserList = new V2UserList();
    v2UserList.addUsersItem(new UserV2());

    // Act and Assert
    assertNotEquals(v2UserList, new V2UserList());
  }

  /**
   * Test {@link V2UserList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserList.equals(Object)", "int V2UserList.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V2UserList v2UserList = new V2UserList();
    v2UserList.addErrorsItem(new UserError());

    // Act and Assert
    assertNotEquals(v2UserList, new V2UserList());
  }

  /**
   * Test {@link V2UserList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserList.equals(Object)", "int V2UserList.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2UserList(), null);
  }

  /**
   * Test {@link V2UserList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserList.equals(Object)", "int V2UserList.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2UserList(), "Different type to V2UserList");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V2UserList}
   *   <li>{@link V2UserList#errors(List)}
   *   <li>{@link V2UserList#setErrors(List)}
   *   <li>{@link V2UserList#setUsers(List)}
   *   <li>{@link V2UserList#users(List)}
   *   <li>{@link V2UserList#toString()}
   *   <li>{@link V2UserList#getErrors()}
   *   <li>{@link V2UserList#getUsers()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V2UserList.<init>()",
    "V2UserList V2UserList.errors(List)",
    "List V2UserList.getErrors()",
    "List V2UserList.getUsers()",
    "void V2UserList.setErrors(List)",
    "void V2UserList.setUsers(List)",
    "String V2UserList.toString()",
    "V2UserList V2UserList.users(List)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V2UserList actualV2UserList = new V2UserList();
    V2UserList actualErrorsResult = actualV2UserList.errors(new ArrayList<>());
    ArrayList<UserError> errors = new ArrayList<>();
    actualV2UserList.setErrors(errors);
    actualV2UserList.setUsers(new ArrayList<>());
    ArrayList<UserV2> users = new ArrayList<>();
    V2UserList actualUsersResult = actualV2UserList.users(users);
    String actualToStringResult = actualV2UserList.toString();
    List<UserError> actualErrors = actualV2UserList.getErrors();
    List<UserV2> actualUsers = actualV2UserList.getUsers();

    // Assert
    assertEquals("class V2UserList {\n    users: []\n    errors: []\n}", actualToStringResult);
    assertTrue(actualErrors.isEmpty());
    assertTrue(actualUsers.isEmpty());
    assertSame(actualV2UserList, actualErrorsResult);
    assertSame(actualV2UserList, actualUsersResult);
    assertSame(errors, actualErrors);
    assertSame(users, actualUsers);
  }
}
