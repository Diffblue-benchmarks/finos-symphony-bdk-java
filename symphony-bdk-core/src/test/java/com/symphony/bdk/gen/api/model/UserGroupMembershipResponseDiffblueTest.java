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

class UserGroupMembershipResponseDiffblueTest {
  /**
   * Test {@link UserGroupMembershipResponse#addDataItem(UserGroupMembershipResponseData)}.
   *
   * <ul>
   *   <li>Given {@link UserGroupMembershipResponse} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link
   * UserGroupMembershipResponse#addDataItem(UserGroupMembershipResponseData)}
   */
  @Test
  @DisplayName(
      "Test addDataItem(UserGroupMembershipResponseData); given UserGroupMembershipResponse (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UserGroupMembershipResponse UserGroupMembershipResponse.addDataItem(UserGroupMembershipResponseData)"
  })
  void testAddDataItem_givenUserGroupMembershipResponse() {
    // Arrange
    UserGroupMembershipResponse userGroupMembershipResponse = new UserGroupMembershipResponse();

    // Act
    UserGroupMembershipResponse actualAddDataItemResult =
        userGroupMembershipResponse.addDataItem(new UserGroupMembershipResponseData());

    // Assert
    assertSame(userGroupMembershipResponse, actualAddDataItemResult);
  }

  /**
   * Test {@link UserGroupMembershipResponse#addDataItem(UserGroupMembershipResponseData)}.
   *
   * <ul>
   *   <li>Given {@link UserGroupMembershipResponse} (default constructor) data {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link
   * UserGroupMembershipResponse#addDataItem(UserGroupMembershipResponseData)}
   */
  @Test
  @DisplayName(
      "Test addDataItem(UserGroupMembershipResponseData); given UserGroupMembershipResponse (default constructor) data ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UserGroupMembershipResponse UserGroupMembershipResponse.addDataItem(UserGroupMembershipResponseData)"
  })
  void testAddDataItem_givenUserGroupMembershipResponseDataArrayList() {
    // Arrange
    UserGroupMembershipResponse userGroupMembershipResponse = new UserGroupMembershipResponse();
    userGroupMembershipResponse.data(new ArrayList<>());

    // Act
    UserGroupMembershipResponse actualAddDataItemResult =
        userGroupMembershipResponse.addDataItem(new UserGroupMembershipResponseData());

    // Assert
    assertSame(userGroupMembershipResponse, actualAddDataItemResult);
  }

  /**
   * Test {@link UserGroupMembershipResponse#equals(Object)}, and {@link
   * UserGroupMembershipResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserGroupMembershipResponse#equals(Object)}
   *   <li>{@link UserGroupMembershipResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupMembershipResponse.equals(Object)",
    "int UserGroupMembershipResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserGroupMembershipResponse userGroupMembershipResponse = new UserGroupMembershipResponse();
    UserGroupMembershipResponse userGroupMembershipResponse2 = new UserGroupMembershipResponse();

    // Act and Assert
    assertEquals(userGroupMembershipResponse, userGroupMembershipResponse2);
    assertEquals(userGroupMembershipResponse.hashCode(), userGroupMembershipResponse2.hashCode());
  }

  /**
   * Test {@link UserGroupMembershipResponse#equals(Object)}, and {@link
   * UserGroupMembershipResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserGroupMembershipResponse#equals(Object)}
   *   <li>{@link UserGroupMembershipResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupMembershipResponse.equals(Object)",
    "int UserGroupMembershipResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserGroupMembershipResponse userGroupMembershipResponse = new UserGroupMembershipResponse();

    // Act and Assert
    assertEquals(userGroupMembershipResponse, userGroupMembershipResponse);
    int expectedHashCodeResult = userGroupMembershipResponse.hashCode();
    assertEquals(expectedHashCodeResult, userGroupMembershipResponse.hashCode());
  }

  /**
   * Test {@link UserGroupMembershipResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupMembershipResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupMembershipResponse.equals(Object)",
    "int UserGroupMembershipResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    UserGroupMembershipResponse userGroupMembershipResponse = new UserGroupMembershipResponse();
    userGroupMembershipResponse.addDataItem(new UserGroupMembershipResponseData());

    // Act and Assert
    assertNotEquals(userGroupMembershipResponse, new UserGroupMembershipResponse());
  }

  /**
   * Test {@link UserGroupMembershipResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupMembershipResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupMembershipResponse.equals(Object)",
    "int UserGroupMembershipResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserGroupMembershipResponse userGroupMembershipResponse = new UserGroupMembershipResponse();
    userGroupMembershipResponse.pagination(new Pagination());

    // Act and Assert
    assertNotEquals(userGroupMembershipResponse, new UserGroupMembershipResponse());
  }

  /**
   * Test {@link UserGroupMembershipResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupMembershipResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupMembershipResponse.equals(Object)",
    "int UserGroupMembershipResponse.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserGroupMembershipResponse(), null);
  }

  /**
   * Test {@link UserGroupMembershipResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupMembershipResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupMembershipResponse.equals(Object)",
    "int UserGroupMembershipResponse.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new UserGroupMembershipResponse(), "Different type to UserGroupMembershipResponse");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UserGroupMembershipResponse}
   *   <li>{@link UserGroupMembershipResponse#data(List)}
   *   <li>{@link UserGroupMembershipResponse#pagination(Pagination)}
   *   <li>{@link UserGroupMembershipResponse#setData(List)}
   *   <li>{@link UserGroupMembershipResponse#setPagination(Pagination)}
   *   <li>{@link UserGroupMembershipResponse#toString()}
   *   <li>{@link UserGroupMembershipResponse#getData()}
   *   <li>{@link UserGroupMembershipResponse#getPagination()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserGroupMembershipResponse.<init>()",
    "UserGroupMembershipResponse UserGroupMembershipResponse.data(List)",
    "List UserGroupMembershipResponse.getData()",
    "Pagination UserGroupMembershipResponse.getPagination()",
    "UserGroupMembershipResponse UserGroupMembershipResponse.pagination(Pagination)",
    "void UserGroupMembershipResponse.setData(List)",
    "void UserGroupMembershipResponse.setPagination(Pagination)",
    "String UserGroupMembershipResponse.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    UserGroupMembershipResponse actualUserGroupMembershipResponse =
        new UserGroupMembershipResponse();
    UserGroupMembershipResponse actualDataResult =
        actualUserGroupMembershipResponse.data(new ArrayList<>());
    UserGroupMembershipResponse actualPaginationResult =
        actualUserGroupMembershipResponse.pagination(new Pagination());
    ArrayList<UserGroupMembershipResponseData> data = new ArrayList<>();
    actualUserGroupMembershipResponse.setData(data);
    Pagination pagination = new Pagination();
    actualUserGroupMembershipResponse.setPagination(pagination);
    String actualToStringResult = actualUserGroupMembershipResponse.toString();
    List<UserGroupMembershipResponseData> actualData = actualUserGroupMembershipResponse.getData();
    Pagination actualPagination = actualUserGroupMembershipResponse.getPagination();

    // Assert
    assertEquals(
        "class UserGroupMembershipResponse {\n"
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
    assertSame(actualUserGroupMembershipResponse, actualDataResult);
    assertSame(actualUserGroupMembershipResponse, actualPaginationResult);
    assertSame(data, actualData);
  }
}
