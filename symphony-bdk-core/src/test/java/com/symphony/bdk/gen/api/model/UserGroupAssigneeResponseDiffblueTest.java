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

class UserGroupAssigneeResponseDiffblueTest {
  /**
   * Test {@link UserGroupAssigneeResponse#addDataItem(UserGroupAssignee)}.
   *
   * <ul>
   *   <li>Given {@link UserGroupAssigneeResponse} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link UserGroupAssigneeResponse#addDataItem(UserGroupAssignee)}
   */
  @Test
  @DisplayName(
      "Test addDataItem(UserGroupAssignee); given UserGroupAssigneeResponse (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UserGroupAssigneeResponse UserGroupAssigneeResponse.addDataItem(UserGroupAssignee)"
  })
  void testAddDataItem_givenUserGroupAssigneeResponse() {
    // Arrange
    UserGroupAssigneeResponse userGroupAssigneeResponse = new UserGroupAssigneeResponse();

    // Act and Assert
    assertSame(
        userGroupAssigneeResponse, userGroupAssigneeResponse.addDataItem(new UserGroupAssignee()));
  }

  /**
   * Test {@link UserGroupAssigneeResponse#addDataItem(UserGroupAssignee)}.
   *
   * <ul>
   *   <li>Given {@link UserGroupAssigneeResponse} (default constructor) data {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupAssigneeResponse#addDataItem(UserGroupAssignee)}
   */
  @Test
  @DisplayName(
      "Test addDataItem(UserGroupAssignee); given UserGroupAssigneeResponse (default constructor) data ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UserGroupAssigneeResponse UserGroupAssigneeResponse.addDataItem(UserGroupAssignee)"
  })
  void testAddDataItem_givenUserGroupAssigneeResponseDataArrayList() {
    // Arrange
    UserGroupAssigneeResponse userGroupAssigneeResponse = new UserGroupAssigneeResponse();
    userGroupAssigneeResponse.data(new ArrayList<>());

    // Act and Assert
    assertSame(
        userGroupAssigneeResponse, userGroupAssigneeResponse.addDataItem(new UserGroupAssignee()));
  }

  /**
   * Test {@link UserGroupAssigneeResponse#equals(Object)}, and {@link
   * UserGroupAssigneeResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserGroupAssigneeResponse#equals(Object)}
   *   <li>{@link UserGroupAssigneeResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupAssigneeResponse.equals(Object)",
    "int UserGroupAssigneeResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserGroupAssigneeResponse userGroupAssigneeResponse = new UserGroupAssigneeResponse();
    UserGroupAssigneeResponse userGroupAssigneeResponse2 = new UserGroupAssigneeResponse();

    // Act and Assert
    assertEquals(userGroupAssigneeResponse, userGroupAssigneeResponse2);
    int expectedHashCodeResult = userGroupAssigneeResponse.hashCode();
    assertEquals(expectedHashCodeResult, userGroupAssigneeResponse2.hashCode());
  }

  /**
   * Test {@link UserGroupAssigneeResponse#equals(Object)}, and {@link
   * UserGroupAssigneeResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserGroupAssigneeResponse#equals(Object)}
   *   <li>{@link UserGroupAssigneeResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupAssigneeResponse.equals(Object)",
    "int UserGroupAssigneeResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserGroupAssigneeResponse userGroupAssigneeResponse = new UserGroupAssigneeResponse();

    // Act and Assert
    assertEquals(userGroupAssigneeResponse, userGroupAssigneeResponse);
    int expectedHashCodeResult = userGroupAssigneeResponse.hashCode();
    assertEquals(expectedHashCodeResult, userGroupAssigneeResponse.hashCode());
  }

  /**
   * Test {@link UserGroupAssigneeResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupAssigneeResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupAssigneeResponse.equals(Object)",
    "int UserGroupAssigneeResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    UserGroupAssigneeResponse userGroupAssigneeResponse = new UserGroupAssigneeResponse();
    userGroupAssigneeResponse.addDataItem(new UserGroupAssignee());

    // Act and Assert
    assertNotEquals(userGroupAssigneeResponse, new UserGroupAssigneeResponse());
  }

  /**
   * Test {@link UserGroupAssigneeResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupAssigneeResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupAssigneeResponse.equals(Object)",
    "int UserGroupAssigneeResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserGroupAssigneeResponse userGroupAssigneeResponse = new UserGroupAssigneeResponse();
    userGroupAssigneeResponse.pagination(new Pagination());

    // Act and Assert
    assertNotEquals(userGroupAssigneeResponse, new UserGroupAssigneeResponse());
  }

  /**
   * Test {@link UserGroupAssigneeResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupAssigneeResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupAssigneeResponse.equals(Object)",
    "int UserGroupAssigneeResponse.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserGroupAssigneeResponse(), null);
  }

  /**
   * Test {@link UserGroupAssigneeResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupAssigneeResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupAssigneeResponse.equals(Object)",
    "int UserGroupAssigneeResponse.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserGroupAssigneeResponse(), "Different type to UserGroupAssigneeResponse");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UserGroupAssigneeResponse}
   *   <li>{@link UserGroupAssigneeResponse#data(List)}
   *   <li>{@link UserGroupAssigneeResponse#pagination(Pagination)}
   *   <li>{@link UserGroupAssigneeResponse#setData(List)}
   *   <li>{@link UserGroupAssigneeResponse#setPagination(Pagination)}
   *   <li>{@link UserGroupAssigneeResponse#toString()}
   *   <li>{@link UserGroupAssigneeResponse#getData()}
   *   <li>{@link UserGroupAssigneeResponse#getPagination()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserGroupAssigneeResponse.<init>()",
    "UserGroupAssigneeResponse UserGroupAssigneeResponse.data(List)",
    "List UserGroupAssigneeResponse.getData()",
    "Pagination UserGroupAssigneeResponse.getPagination()",
    "UserGroupAssigneeResponse UserGroupAssigneeResponse.pagination(Pagination)",
    "void UserGroupAssigneeResponse.setData(List)",
    "void UserGroupAssigneeResponse.setPagination(Pagination)",
    "String UserGroupAssigneeResponse.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    UserGroupAssigneeResponse actualUserGroupAssigneeResponse = new UserGroupAssigneeResponse();
    UserGroupAssigneeResponse actualDataResult =
        actualUserGroupAssigneeResponse.data(new ArrayList<>());
    UserGroupAssigneeResponse actualPaginationResult =
        actualUserGroupAssigneeResponse.pagination(new Pagination());
    ArrayList<UserGroupAssignee> data = new ArrayList<>();
    actualUserGroupAssigneeResponse.setData(data);
    Pagination pagination = new Pagination();
    actualUserGroupAssigneeResponse.setPagination(pagination);
    String actualToStringResult = actualUserGroupAssigneeResponse.toString();
    List<UserGroupAssignee> actualData = actualUserGroupAssigneeResponse.getData();
    Pagination actualPagination = actualUserGroupAssigneeResponse.getPagination();

    // Assert
    assertEquals(
        "class UserGroupAssigneeResponse {\n"
            + "    data: []\n"
            + "    pagination: class Pagination {\n"
            + "        cursors: null\n"
            + "        previous: null\n"
            + "        next: null\n"
            + "    }\n"
            + "}",
        actualToStringResult);
    assertTrue(actualData.isEmpty());
    assertSame(pagination, actualPagination);
    assertSame(actualUserGroupAssigneeResponse, actualDataResult);
    assertSame(actualUserGroupAssigneeResponse, actualPaginationResult);
    assertSame(data, actualData);
  }
}
