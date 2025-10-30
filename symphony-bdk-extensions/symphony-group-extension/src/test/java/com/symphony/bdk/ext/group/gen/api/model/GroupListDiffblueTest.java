package com.symphony.bdk.ext.group.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class GroupListDiffblueTest {
  /**
   * Test {@link GroupList#addDataItem(ReadGroup)}.
   * <ul>
   *   <li>Given {@link GroupList} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupList#addDataItem(ReadGroup)}
   */
  @Test
  @DisplayName("Test addDataItem(ReadGroup); given GroupList (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"GroupList GroupList.addDataItem(ReadGroup)"})
  void testAddDataItem_givenGroupList() {
    // Arrange
    GroupList groupList = new GroupList();

    // Act and Assert
    assertSame(groupList, groupList.addDataItem(new ReadGroup()));
  }

  /**
   * Test {@link GroupList#addDataItem(ReadGroup)}.
   * <ul>
   *   <li>Given {@link GroupList} (default constructor) data {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupList#addDataItem(ReadGroup)}
   */
  @Test
  @DisplayName("Test addDataItem(ReadGroup); given GroupList (default constructor) data ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"GroupList GroupList.addDataItem(ReadGroup)"})
  void testAddDataItem_givenGroupListDataArrayList() {
    // Arrange
    GroupList groupList = new GroupList();
    groupList.data(new ArrayList<>());

    // Act and Assert
    assertSame(groupList, groupList.addDataItem(new ReadGroup()));
  }

  /**
   * Test {@link GroupList#equals(Object)}, and {@link GroupList#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link GroupList#equals(Object)}
   *   <li>{@link GroupList#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean GroupList.equals(Object)", "int GroupList.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    GroupList groupList = new GroupList();
    GroupList groupList2 = new GroupList();

    // Act and Assert
    assertEquals(groupList, groupList2);
    int expectedHashCodeResult = groupList.hashCode();
    assertEquals(expectedHashCodeResult, groupList2.hashCode());
  }

  /**
   * Test {@link GroupList#equals(Object)}, and {@link GroupList#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link GroupList#equals(Object)}
   *   <li>{@link GroupList#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean GroupList.equals(Object)", "int GroupList.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    GroupList groupList = new GroupList();

    // Act and Assert
    assertEquals(groupList, groupList);
    int expectedHashCodeResult = groupList.hashCode();
    assertEquals(expectedHashCodeResult, groupList.hashCode());
  }

  /**
   * Test {@link GroupList#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean GroupList.equals(Object)", "int GroupList.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    GroupList groupList = new GroupList();
    groupList.addDataItem(new ReadGroup());

    // Act and Assert
    assertNotEquals(groupList, new GroupList());
  }

  /**
   * Test {@link GroupList#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean GroupList.equals(Object)", "int GroupList.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    GroupList groupList = new GroupList();
    groupList.pagination(new Pagination());
    groupList.addDataItem(new ReadGroup());

    // Act and Assert
    assertNotEquals(groupList, new GroupList());
  }

  /**
   * Test {@link GroupList#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean GroupList.equals(Object)", "int GroupList.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new GroupList(), null);
  }

  /**
   * Test {@link GroupList#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link GroupList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean GroupList.equals(Object)", "int GroupList.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new GroupList(), "Different type to GroupList");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link GroupList}
   *   <li>{@link GroupList#data(List)}
   *   <li>{@link GroupList#pagination(Pagination)}
   *   <li>{@link GroupList#setData(List)}
   *   <li>{@link GroupList#setPagination(Pagination)}
   *   <li>{@link GroupList#toString()}
   *   <li>{@link GroupList#getData()}
   *   <li>{@link GroupList#getPagination()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void GroupList.<init>()", "GroupList GroupList.data(List)", "List GroupList.getData()",
      "Pagination GroupList.getPagination()", "GroupList GroupList.pagination(Pagination)",
      "void GroupList.setData(List)", "void GroupList.setPagination(Pagination)", "String GroupList.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    GroupList actualGroupList = new GroupList();
    GroupList actualDataResult = actualGroupList.data(new ArrayList<>());
    GroupList actualPaginationResult = actualGroupList.pagination(new Pagination());
    ArrayList<ReadGroup> data = new ArrayList<>();
    actualGroupList.setData(data);
    Pagination pagination = new Pagination();
    actualGroupList.setPagination(pagination);
    String actualToStringResult = actualGroupList.toString();
    List<ReadGroup> actualData = actualGroupList.getData();
    Pagination actualPagination = actualGroupList.getPagination();

    // Assert
    assertEquals(
        "class GroupList {\n" + "    pagination: class Pagination {\n" + "        previous: null\n"
            + "        next: null\n" + "        cursors: null\n" + "    }\n" + "    data: []\n" + "}",
        actualToStringResult);
    assertTrue(actualData.isEmpty());
    assertSame(actualGroupList, actualDataResult);
    assertSame(actualGroupList, actualPaginationResult);
    assertSame(pagination, actualPagination);
    assertSame(data, actualData);
  }
}
