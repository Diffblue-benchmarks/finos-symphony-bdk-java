package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserSearchQueryDiffblueTest {
  /**
   * Test {@link UserSearchQuery#equals(Object)}, and {@link UserSearchQuery#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserSearchQuery#equals(Object)}
   *   <li>{@link UserSearchQuery#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSearchQuery.equals(Object)", "int UserSearchQuery.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserSearchQuery userSearchQuery = new UserSearchQuery();
    UserSearchQuery userSearchQuery2 = new UserSearchQuery();

    // Act and Assert
    assertEquals(userSearchQuery, userSearchQuery2);
    assertEquals(userSearchQuery.hashCode(), userSearchQuery2.hashCode());
  }

  /**
   * Test {@link UserSearchQuery#equals(Object)}, and {@link UserSearchQuery#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserSearchQuery#equals(Object)}
   *   <li>{@link UserSearchQuery#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSearchQuery.equals(Object)", "int UserSearchQuery.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserSearchQuery userSearchQuery = new UserSearchQuery();

    // Act and Assert
    assertEquals(userSearchQuery, userSearchQuery);
    int expectedHashCodeResult = userSearchQuery.hashCode();
    assertEquals(expectedHashCodeResult, userSearchQuery.hashCode());
  }

  /**
   * Test {@link UserSearchQuery#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSearchQuery#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSearchQuery.equals(Object)", "int UserSearchQuery.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserSearchQuery(), 1);
  }

  /**
   * Test {@link UserSearchQuery#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSearchQuery#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSearchQuery.equals(Object)", "int UserSearchQuery.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserSearchQuery userSearchQuery = new UserSearchQuery();
    userSearchQuery.query("Query");

    // Act and Assert
    assertNotEquals(userSearchQuery, new UserSearchQuery());
  }

  /**
   * Test {@link UserSearchQuery#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSearchQuery#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSearchQuery.equals(Object)", "int UserSearchQuery.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserSearchQuery userSearchQuery = new UserSearchQuery();
    userSearchQuery.filters(new UserSearchFilter());

    // Act and Assert
    assertNotEquals(userSearchQuery, new UserSearchQuery());
  }

  /**
   * Test {@link UserSearchQuery#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSearchQuery#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSearchQuery.equals(Object)", "int UserSearchQuery.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserSearchQuery(), null);
  }

  /**
   * Test {@link UserSearchQuery#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSearchQuery#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSearchQuery.equals(Object)", "int UserSearchQuery.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserSearchQuery(), "Different type to UserSearchQuery");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UserSearchQuery}
   *   <li>{@link UserSearchQuery#filters(UserSearchFilter)}
   *   <li>{@link UserSearchQuery#query(String)}
   *   <li>{@link UserSearchQuery#setFilters(UserSearchFilter)}
   *   <li>{@link UserSearchQuery#setQuery(String)}
   *   <li>{@link UserSearchQuery#toString()}
   *   <li>{@link UserSearchQuery#getFilters()}
   *   <li>{@link UserSearchQuery#getQuery()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserSearchQuery.<init>()",
    "UserSearchQuery UserSearchQuery.filters(UserSearchFilter)",
    "UserSearchFilter UserSearchQuery.getFilters()",
    "String UserSearchQuery.getQuery()",
    "UserSearchQuery UserSearchQuery.query(String)",
    "void UserSearchQuery.setFilters(UserSearchFilter)",
    "void UserSearchQuery.setQuery(String)",
    "String UserSearchQuery.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    UserSearchQuery actualUserSearchQuery = new UserSearchQuery();
    UserSearchQuery actualFiltersResult = actualUserSearchQuery.filters(new UserSearchFilter());
    UserSearchQuery actualQueryResult = actualUserSearchQuery.query("Query");
    UserSearchFilter filters = new UserSearchFilter();
    actualUserSearchQuery.setFilters(filters);
    actualUserSearchQuery.setQuery("Query");
    String actualToStringResult = actualUserSearchQuery.toString();
    UserSearchFilter actualFilters = actualUserSearchQuery.getFilters();

    // Assert
    assertEquals("Query", actualUserSearchQuery.getQuery());
    assertEquals(
        "class UserSearchQuery {\n"
            + "    query: Query\n"
            + "    filters: class UserSearchFilter {\n"
            + "        accountTypes: null\n"
            + "        title: null\n"
            + "        company: null\n"
            + "        location: null\n"
            + "        marketCoverage: null\n"
            + "        responsibility: null\n"
            + "        function: null\n"
            + "        instrument: null\n"
            + "    }\n"
            + "}",
        actualToStringResult);
    assertSame(filters, actualFilters);
    assertSame(actualUserSearchQuery, actualFiltersResult);
    assertSame(actualUserSearchQuery, actualQueryResult);
  }
}
