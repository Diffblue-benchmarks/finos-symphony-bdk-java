package com.symphony.bdk.ext.group.gen.api.model;

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

class TypeListDiffblueTest {
  /**
   * Test {@link TypeList#addDataItem(BaseType)}.
   *
   * <ul>
   *   <li>Given {@link TypeList} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link TypeList#addDataItem(BaseType)}
   */
  @Test
  @DisplayName("Test addDataItem(BaseType); given TypeList (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypeList TypeList.addDataItem(BaseType)"})
  void testAddDataItem_givenTypeList() {
    // Arrange
    TypeList typeList = new TypeList();

    // Act and Assert
    assertSame(typeList, typeList.addDataItem(new BaseType()));
  }

  /**
   * Test {@link TypeList#addDataItem(BaseType)}.
   *
   * <ul>
   *   <li>Given {@link TypeList} (default constructor) data {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link TypeList#addDataItem(BaseType)}
   */
  @Test
  @DisplayName("Test addDataItem(BaseType); given TypeList (default constructor) data ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypeList TypeList.addDataItem(BaseType)"})
  void testAddDataItem_givenTypeListDataArrayList() {
    // Arrange
    TypeList typeList = new TypeList();
    typeList.data(new ArrayList<>());

    // Act and Assert
    assertSame(typeList, typeList.addDataItem(new BaseType()));
  }

  /**
   * Test {@link TypeList#equals(Object)}, and {@link TypeList#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TypeList#equals(Object)}
   *   <li>{@link TypeList#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TypeList.equals(Object)", "int TypeList.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    TypeList typeList = new TypeList();
    TypeList typeList2 = new TypeList();

    // Act and Assert
    assertEquals(typeList, typeList2);
    int expectedHashCodeResult = typeList.hashCode();
    assertEquals(expectedHashCodeResult, typeList2.hashCode());
  }

  /**
   * Test {@link TypeList#equals(Object)}, and {@link TypeList#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TypeList#equals(Object)}
   *   <li>{@link TypeList#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TypeList.equals(Object)", "int TypeList.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    TypeList typeList = new TypeList();

    // Act and Assert
    assertEquals(typeList, typeList);
    int expectedHashCodeResult = typeList.hashCode();
    assertEquals(expectedHashCodeResult, typeList.hashCode());
  }

  /**
   * Test {@link TypeList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TypeList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TypeList.equals(Object)", "int TypeList.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    TypeList typeList = new TypeList();
    typeList.addDataItem(new BaseType());

    // Act and Assert
    assertNotEquals(typeList, new TypeList());
  }

  /**
   * Test {@link TypeList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TypeList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TypeList.equals(Object)", "int TypeList.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    TypeList typeList = new TypeList();
    typeList.pagination(new Pagination());
    typeList.addDataItem(new BaseType());

    // Act and Assert
    assertNotEquals(typeList, new TypeList());
  }

  /**
   * Test {@link TypeList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TypeList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TypeList.equals(Object)", "int TypeList.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new TypeList(), null);
  }

  /**
   * Test {@link TypeList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TypeList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TypeList.equals(Object)", "int TypeList.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new TypeList(), "Different type to TypeList");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link TypeList}
   *   <li>{@link TypeList#data(List)}
   *   <li>{@link TypeList#pagination(Pagination)}
   *   <li>{@link TypeList#setData(List)}
   *   <li>{@link TypeList#setPagination(Pagination)}
   *   <li>{@link TypeList#toString()}
   *   <li>{@link TypeList#getData()}
   *   <li>{@link TypeList#getPagination()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void TypeList.<init>()",
    "TypeList TypeList.data(List)",
    "List TypeList.getData()",
    "Pagination TypeList.getPagination()",
    "TypeList TypeList.pagination(Pagination)",
    "void TypeList.setData(List)",
    "void TypeList.setPagination(Pagination)",
    "String TypeList.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    TypeList actualTypeList = new TypeList();
    TypeList actualDataResult = actualTypeList.data(new ArrayList<>());
    TypeList actualPaginationResult = actualTypeList.pagination(new Pagination());
    ArrayList<BaseType> data = new ArrayList<>();
    actualTypeList.setData(data);
    Pagination pagination = new Pagination();
    actualTypeList.setPagination(pagination);
    String actualToStringResult = actualTypeList.toString();
    List<BaseType> actualData = actualTypeList.getData();
    Pagination actualPagination = actualTypeList.getPagination();

    // Assert
    assertEquals(
        "class TypeList {\n"
            + "    pagination: class Pagination {\n"
            + "        previous: null\n"
            + "        next: null\n"
            + "        cursors: null\n"
            + "    }\n"
            + "    data: []\n"
            + "}",
        actualToStringResult);
    assertTrue(actualData.isEmpty());
    assertSame(pagination, actualPagination);
    assertSame(actualTypeList, actualDataResult);
    assertSame(actualTypeList, actualPaginationResult);
    assertSame(data, actualData);
  }
}
