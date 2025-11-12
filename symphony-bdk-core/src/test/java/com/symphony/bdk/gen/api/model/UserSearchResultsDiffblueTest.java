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

class UserSearchResultsDiffblueTest {
  /**
   * Test {@link UserSearchResults#addUsersItem(UserV2)}.
   *
   * <ul>
   *   <li>Given {@link UserSearchResults} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link UserSearchResults#addUsersItem(UserV2)}
   */
  @Test
  @DisplayName("Test addUsersItem(UserV2); given UserSearchResults (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UserSearchResults UserSearchResults.addUsersItem(UserV2)"})
  void testAddUsersItem_givenUserSearchResults() {
    // Arrange
    UserSearchResults userSearchResults = new UserSearchResults();

    // Act
    UserSearchResults actualAddUsersItemResult = userSearchResults.addUsersItem(new UserV2());

    // Assert
    assertSame(userSearchResults, actualAddUsersItemResult);
  }

  /**
   * Test {@link UserSearchResults#addUsersItem(UserV2)}.
   *
   * <ul>
   *   <li>Given {@link UserSearchResults} (default constructor) users {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link UserSearchResults#addUsersItem(UserV2)}
   */
  @Test
  @DisplayName(
      "Test addUsersItem(UserV2); given UserSearchResults (default constructor) users ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UserSearchResults UserSearchResults.addUsersItem(UserV2)"})
  void testAddUsersItem_givenUserSearchResultsUsersArrayList() {
    // Arrange
    UserSearchResults userSearchResults = new UserSearchResults();
    userSearchResults.users(new ArrayList<>());

    // Act
    UserSearchResults actualAddUsersItemResult = userSearchResults.addUsersItem(new UserV2());

    // Assert
    assertSame(userSearchResults, actualAddUsersItemResult);
  }

  /**
   * Test {@link UserSearchResults#equals(Object)}, and {@link UserSearchResults#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserSearchResults#equals(Object)}
   *   <li>{@link UserSearchResults#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserSearchResults.equals(Object)",
    "int UserSearchResults.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserSearchResults userSearchResults = new UserSearchResults();
    UserSearchResults userSearchResults2 = new UserSearchResults();

    // Act and Assert
    assertEquals(userSearchResults, userSearchResults2);
    assertEquals(userSearchResults.hashCode(), userSearchResults2.hashCode());
  }

  /**
   * Test {@link UserSearchResults#equals(Object)}, and {@link UserSearchResults#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserSearchResults#equals(Object)}
   *   <li>{@link UserSearchResults#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserSearchResults.equals(Object)",
    "int UserSearchResults.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserSearchResults userSearchResults = new UserSearchResults();

    // Act and Assert
    assertEquals(userSearchResults, userSearchResults);
    int expectedHashCodeResult = userSearchResults.hashCode();
    assertEquals(expectedHashCodeResult, userSearchResults.hashCode());
  }

  /**
   * Test {@link UserSearchResults#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSearchResults#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserSearchResults.equals(Object)",
    "int UserSearchResults.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    UserSearchResults userSearchResults = new UserSearchResults();
    userSearchResults.addUsersItem(new UserV2());

    // Act and Assert
    assertNotEquals(userSearchResults, new UserSearchResults());
  }

  /**
   * Test {@link UserSearchResults#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSearchResults#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserSearchResults.equals(Object)",
    "int UserSearchResults.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserSearchResults userSearchResults = new UserSearchResults();
    userSearchResults.count(3L);
    userSearchResults.addUsersItem(new UserV2());

    // Act and Assert
    assertNotEquals(userSearchResults, new UserSearchResults());
  }

  /**
   * Test {@link UserSearchResults#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSearchResults#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserSearchResults.equals(Object)",
    "int UserSearchResults.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserSearchResults userSearchResults = new UserSearchResults();
    userSearchResults.skip(1L);
    userSearchResults.addUsersItem(new UserV2());

    // Act and Assert
    assertNotEquals(userSearchResults, new UserSearchResults());
  }

  /**
   * Test {@link UserSearchResults#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSearchResults#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserSearchResults.equals(Object)",
    "int UserSearchResults.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    UserSearchResults userSearchResults = new UserSearchResults();
    userSearchResults.limit(1L);
    userSearchResults.addUsersItem(new UserV2());

    // Act and Assert
    assertNotEquals(userSearchResults, new UserSearchResults());
  }

  /**
   * Test {@link UserSearchResults#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSearchResults#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserSearchResults.equals(Object)",
    "int UserSearchResults.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    UserSearchResults userSearchResults = new UserSearchResults();
    userSearchResults.setSearchQuery(new UserSearchQuery());
    userSearchResults.addUsersItem(new UserV2());

    // Act and Assert
    assertNotEquals(userSearchResults, new UserSearchResults());
  }

  /**
   * Test {@link UserSearchResults#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSearchResults#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserSearchResults.equals(Object)",
    "int UserSearchResults.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserSearchResults(), null);
  }

  /**
   * Test {@link UserSearchResults#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSearchResults#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserSearchResults.equals(Object)",
    "int UserSearchResults.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserSearchResults(), "Different type to UserSearchResults");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UserSearchResults}
   *   <li>{@link UserSearchResults#count(Long)}
   *   <li>{@link UserSearchResults#limit(Long)}
   *   <li>{@link UserSearchResults#setCount(Long)}
   *   <li>{@link UserSearchResults#setLimit(Long)}
   *   <li>{@link UserSearchResults#setSearchQuery(UserSearchQuery)}
   *   <li>{@link UserSearchResults#setSkip(Long)}
   *   <li>{@link UserSearchResults#setUsers(List)}
   *   <li>{@link UserSearchResults#skip(Long)}
   *   <li>{@link UserSearchResults#users(List)}
   *   <li>{@link UserSearchResults#searchQuery(UserSearchQuery)}
   *   <li>{@link UserSearchResults#toString()}
   *   <li>{@link UserSearchResults#getCount()}
   *   <li>{@link UserSearchResults#getLimit()}
   *   <li>{@link UserSearchResults#getSearchQuery()}
   *   <li>{@link UserSearchResults#getSkip()}
   *   <li>{@link UserSearchResults#getUsers()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserSearchResults.<init>()",
    "UserSearchResults UserSearchResults.count(Long)",
    "Long UserSearchResults.getCount()",
    "Long UserSearchResults.getLimit()",
    "UserSearchQuery UserSearchResults.getSearchQuery()",
    "Long UserSearchResults.getSkip()",
    "List UserSearchResults.getUsers()",
    "UserSearchResults UserSearchResults.limit(Long)",
    "UserSearchResults UserSearchResults.searchQuery(UserSearchQuery)",
    "void UserSearchResults.setCount(Long)",
    "void UserSearchResults.setLimit(Long)",
    "void UserSearchResults.setSearchQuery(UserSearchQuery)",
    "void UserSearchResults.setSkip(Long)",
    "void UserSearchResults.setUsers(List)",
    "UserSearchResults UserSearchResults.skip(Long)",
    "String UserSearchResults.toString()",
    "UserSearchResults UserSearchResults.users(List)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    UserSearchResults actualUserSearchResults = new UserSearchResults();
    UserSearchResults actualCountResult = actualUserSearchResults.count(3L);
    UserSearchResults actualLimitResult = actualUserSearchResults.limit(1L);
    actualUserSearchResults.setCount(3L);
    actualUserSearchResults.setLimit(1L);
    actualUserSearchResults.setSearchQuery(new UserSearchQuery());
    actualUserSearchResults.setSkip(1L);
    actualUserSearchResults.setUsers(new ArrayList<>());
    UserSearchResults actualSkipResult = actualUserSearchResults.skip(1L);
    ArrayList<UserV2> users = new ArrayList<>();
    UserSearchResults actualUsersResult = actualUserSearchResults.users(users);
    UserSearchQuery searchQuery = new UserSearchQuery();
    UserSearchResults actualSearchQueryResult = actualUserSearchResults.searchQuery(searchQuery);
    String actualToStringResult = actualUserSearchResults.toString();
    Long actualCount = actualUserSearchResults.getCount();
    Long actualLimit = actualUserSearchResults.getLimit();
    UserSearchQuery actualSearchQuery = actualUserSearchResults.getSearchQuery();
    Long actualSkip = actualUserSearchResults.getSkip();
    List<UserV2> actualUsers = actualUserSearchResults.getUsers();

    // Assert
    assertEquals(
        "class UserSearchResults {\n"
            + "    count: 3\n"
            + "    skip: 1\n"
            + "    limit: 1\n"
            + "    searchQuery: class UserSearchQuery {\n"
            + "        query: null\n"
            + "        filters: null\n"
            + "    }\n"
            + "    users: []\n"
            + "}",
        actualToStringResult);
    assertEquals(1L, actualLimit.longValue());
    assertEquals(1L, actualSkip.longValue());
    assertEquals(3L, actualCount.longValue());
    assertTrue(actualUsers.isEmpty());
    assertSame(searchQuery, actualSearchQuery);
    assertSame(actualUserSearchResults, actualCountResult);
    assertSame(actualUserSearchResults, actualLimitResult);
    assertSame(actualUserSearchResults, actualSearchQueryResult);
    assertSame(actualUserSearchResults, actualSkipResult);
    assertSame(actualUserSearchResults, actualUsersResult);
    assertSame(users, actualUsers);
  }
}
