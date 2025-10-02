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

class UserGroupResponseListDiffblueTest {
  /**
   * Test {@link UserGroupResponseList#addDataItem(UserGroupResponse)}.
   *
   * <ul>
   *   <li>Given {@link UserGroupResponseList} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link UserGroupResponseList#addDataItem(UserGroupResponse)}
   */
  @Test
  @DisplayName(
      "Test addDataItem(UserGroupResponse); given UserGroupResponseList (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UserGroupResponseList UserGroupResponseList.addDataItem(UserGroupResponse)"})
  void testAddDataItem_givenUserGroupResponseList() {
    // Arrange
    UserGroupResponseList userGroupResponseList = new UserGroupResponseList();

    // Act
    UserGroupResponseList actualAddDataItemResult =
        userGroupResponseList.addDataItem(new UserGroupResponse());

    // Assert
    assertSame(userGroupResponseList, actualAddDataItemResult);
  }

  /**
   * Test {@link UserGroupResponseList#addDataItem(UserGroupResponse)}.
   *
   * <ul>
   *   <li>Given {@link UserGroupResponseList} (default constructor) data {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupResponseList#addDataItem(UserGroupResponse)}
   */
  @Test
  @DisplayName(
      "Test addDataItem(UserGroupResponse); given UserGroupResponseList (default constructor) data ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UserGroupResponseList UserGroupResponseList.addDataItem(UserGroupResponse)"})
  void testAddDataItem_givenUserGroupResponseListDataArrayList() {
    // Arrange
    UserGroupResponseList userGroupResponseList = new UserGroupResponseList();
    userGroupResponseList.data(new ArrayList<>());

    // Act
    UserGroupResponseList actualAddDataItemResult =
        userGroupResponseList.addDataItem(new UserGroupResponse());

    // Assert
    assertSame(userGroupResponseList, actualAddDataItemResult);
  }

  /**
   * Test {@link UserGroupResponseList#equals(Object)}, and {@link
   * UserGroupResponseList#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserGroupResponseList#equals(Object)}
   *   <li>{@link UserGroupResponseList#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupResponseList.equals(Object)",
    "int UserGroupResponseList.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserGroupResponseList userGroupResponseList = new UserGroupResponseList();
    UserGroupResponseList userGroupResponseList2 = new UserGroupResponseList();

    // Act and Assert
    assertEquals(userGroupResponseList, userGroupResponseList2);
    assertEquals(userGroupResponseList.hashCode(), userGroupResponseList2.hashCode());
  }

  /**
   * Test {@link UserGroupResponseList#equals(Object)}, and {@link
   * UserGroupResponseList#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserGroupResponseList#equals(Object)}
   *   <li>{@link UserGroupResponseList#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupResponseList.equals(Object)",
    "int UserGroupResponseList.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserGroupResponseList userGroupResponseList = new UserGroupResponseList();

    // Act and Assert
    assertEquals(userGroupResponseList, userGroupResponseList);
    int expectedHashCodeResult = userGroupResponseList.hashCode();
    assertEquals(expectedHashCodeResult, userGroupResponseList.hashCode());
  }

  /**
   * Test {@link UserGroupResponseList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupResponseList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupResponseList.equals(Object)",
    "int UserGroupResponseList.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    UserGroupResponseList userGroupResponseList = new UserGroupResponseList();
    userGroupResponseList.addDataItem(new UserGroupResponse());

    // Act and Assert
    assertNotEquals(userGroupResponseList, new UserGroupResponseList());
  }

  /**
   * Test {@link UserGroupResponseList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupResponseList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupResponseList.equals(Object)",
    "int UserGroupResponseList.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserGroupResponseList userGroupResponseList = new UserGroupResponseList();
    userGroupResponseList.pagination(new Pagination());

    // Act and Assert
    assertNotEquals(userGroupResponseList, new UserGroupResponseList());
  }

  /**
   * Test {@link UserGroupResponseList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupResponseList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupResponseList.equals(Object)",
    "int UserGroupResponseList.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserGroupResponseList(), null);
  }

  /**
   * Test {@link UserGroupResponseList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserGroupResponseList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserGroupResponseList.equals(Object)",
    "int UserGroupResponseList.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserGroupResponseList(), "Different type to UserGroupResponseList");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UserGroupResponseList}
   *   <li>{@link UserGroupResponseList#data(List)}
   *   <li>{@link UserGroupResponseList#pagination(Pagination)}
   *   <li>{@link UserGroupResponseList#setData(List)}
   *   <li>{@link UserGroupResponseList#setPagination(Pagination)}
   *   <li>{@link UserGroupResponseList#toString()}
   *   <li>{@link UserGroupResponseList#getData()}
   *   <li>{@link UserGroupResponseList#getPagination()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserGroupResponseList.<init>()",
    "UserGroupResponseList UserGroupResponseList.data(List)",
    "List UserGroupResponseList.getData()",
    "Pagination UserGroupResponseList.getPagination()",
    "UserGroupResponseList UserGroupResponseList.pagination(Pagination)",
    "void UserGroupResponseList.setData(List)",
    "void UserGroupResponseList.setPagination(Pagination)",
    "String UserGroupResponseList.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    UserGroupResponseList actualUserGroupResponseList = new UserGroupResponseList();
    UserGroupResponseList actualDataResult = actualUserGroupResponseList.data(new ArrayList<>());
    UserGroupResponseList actualPaginationResult =
        actualUserGroupResponseList.pagination(new Pagination());
    ArrayList<UserGroupResponse> data = new ArrayList<>();
    actualUserGroupResponseList.setData(data);
    Pagination pagination = new Pagination();
    actualUserGroupResponseList.setPagination(pagination);
    String actualToStringResult = actualUserGroupResponseList.toString();
    List<UserGroupResponse> actualData = actualUserGroupResponseList.getData();
    Pagination actualPagination = actualUserGroupResponseList.getPagination();

    // Assert
    assertEquals(
        "class UserGroupResponseList {\n"
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
    assertSame(actualUserGroupResponseList, actualDataResult);
    assertSame(actualUserGroupResponseList, actualPaginationResult);
    assertSame(data, actualData);
  }
}
