package com.symphony.bdk.gen.api.model;

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

class V1AuditTrailInitiatorListDiffblueTest {
  /**
   * Test {@link V1AuditTrailInitiatorList#addItemsItem(V1AuditTrailInitiatorResponse)}.
   * <ul>
   *   <li>Given {@link V1AuditTrailInitiatorList} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link V1AuditTrailInitiatorList#addItemsItem(V1AuditTrailInitiatorResponse)}
   */
  @Test
  @DisplayName("Test addItemsItem(V1AuditTrailInitiatorResponse); given V1AuditTrailInitiatorList (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V1AuditTrailInitiatorList V1AuditTrailInitiatorList.addItemsItem(V1AuditTrailInitiatorResponse)"})
  void testAddItemsItem_givenV1AuditTrailInitiatorList() {
    // Arrange
    V1AuditTrailInitiatorList v1AuditTrailInitiatorList = new V1AuditTrailInitiatorList();

    // Act and Assert
    assertSame(v1AuditTrailInitiatorList, v1AuditTrailInitiatorList.addItemsItem(new V1AuditTrailInitiatorResponse()));
  }

  /**
   * Test {@link V1AuditTrailInitiatorList#addItemsItem(V1AuditTrailInitiatorResponse)}.
   * <ul>
   *   <li>Given {@link V1AuditTrailInitiatorList} (default constructor) items {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1AuditTrailInitiatorList#addItemsItem(V1AuditTrailInitiatorResponse)}
   */
  @Test
  @DisplayName("Test addItemsItem(V1AuditTrailInitiatorResponse); given V1AuditTrailInitiatorList (default constructor) items ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V1AuditTrailInitiatorList V1AuditTrailInitiatorList.addItemsItem(V1AuditTrailInitiatorResponse)"})
  void testAddItemsItem_givenV1AuditTrailInitiatorListItemsArrayList() {
    // Arrange
    V1AuditTrailInitiatorList v1AuditTrailInitiatorList = new V1AuditTrailInitiatorList();
    v1AuditTrailInitiatorList.items(new ArrayList<>());

    // Act and Assert
    assertSame(v1AuditTrailInitiatorList, v1AuditTrailInitiatorList.addItemsItem(new V1AuditTrailInitiatorResponse()));
  }

  /**
   * Test {@link V1AuditTrailInitiatorList#equals(Object)}, and {@link V1AuditTrailInitiatorList#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V1AuditTrailInitiatorList#equals(Object)}
   *   <li>{@link V1AuditTrailInitiatorList#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1AuditTrailInitiatorList.equals(Object)", "int V1AuditTrailInitiatorList.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V1AuditTrailInitiatorList v1AuditTrailInitiatorList = new V1AuditTrailInitiatorList();
    V1AuditTrailInitiatorList v1AuditTrailInitiatorList2 = new V1AuditTrailInitiatorList();

    // Act and Assert
    assertEquals(v1AuditTrailInitiatorList, v1AuditTrailInitiatorList2);
    int expectedHashCodeResult = v1AuditTrailInitiatorList.hashCode();
    assertEquals(expectedHashCodeResult, v1AuditTrailInitiatorList2.hashCode());
  }

  /**
   * Test {@link V1AuditTrailInitiatorList#equals(Object)}, and {@link V1AuditTrailInitiatorList#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V1AuditTrailInitiatorList#equals(Object)}
   *   <li>{@link V1AuditTrailInitiatorList#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1AuditTrailInitiatorList.equals(Object)", "int V1AuditTrailInitiatorList.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V1AuditTrailInitiatorList v1AuditTrailInitiatorList = new V1AuditTrailInitiatorList();

    // Act and Assert
    assertEquals(v1AuditTrailInitiatorList, v1AuditTrailInitiatorList);
    int expectedHashCodeResult = v1AuditTrailInitiatorList.hashCode();
    assertEquals(expectedHashCodeResult, v1AuditTrailInitiatorList.hashCode());
  }

  /**
   * Test {@link V1AuditTrailInitiatorList#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1AuditTrailInitiatorList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1AuditTrailInitiatorList.equals(Object)", "int V1AuditTrailInitiatorList.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V1AuditTrailInitiatorList v1AuditTrailInitiatorList = new V1AuditTrailInitiatorList();
    v1AuditTrailInitiatorList.addItemsItem(new V1AuditTrailInitiatorResponse());

    // Act and Assert
    assertNotEquals(v1AuditTrailInitiatorList, new V1AuditTrailInitiatorList());
  }

  /**
   * Test {@link V1AuditTrailInitiatorList#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1AuditTrailInitiatorList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1AuditTrailInitiatorList.equals(Object)", "int V1AuditTrailInitiatorList.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V1AuditTrailInitiatorList v1AuditTrailInitiatorList = new V1AuditTrailInitiatorList();
    v1AuditTrailInitiatorList.pagination(new Pagination());

    // Act and Assert
    assertNotEquals(v1AuditTrailInitiatorList, new V1AuditTrailInitiatorList());
  }

  /**
   * Test {@link V1AuditTrailInitiatorList#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1AuditTrailInitiatorList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1AuditTrailInitiatorList.equals(Object)", "int V1AuditTrailInitiatorList.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1AuditTrailInitiatorList(), null);
  }

  /**
   * Test {@link V1AuditTrailInitiatorList#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V1AuditTrailInitiatorList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V1AuditTrailInitiatorList.equals(Object)", "int V1AuditTrailInitiatorList.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1AuditTrailInitiatorList(), "Different type to V1AuditTrailInitiatorList");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V1AuditTrailInitiatorList}
   *   <li>{@link V1AuditTrailInitiatorList#items(List)}
   *   <li>{@link V1AuditTrailInitiatorList#pagination(Pagination)}
   *   <li>{@link V1AuditTrailInitiatorList#setItems(List)}
   *   <li>{@link V1AuditTrailInitiatorList#setPagination(Pagination)}
   *   <li>{@link V1AuditTrailInitiatorList#toString()}
   *   <li>{@link V1AuditTrailInitiatorList#getItems()}
   *   <li>{@link V1AuditTrailInitiatorList#getPagination()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V1AuditTrailInitiatorList.<init>()", "List V1AuditTrailInitiatorList.getItems()",
      "Pagination V1AuditTrailInitiatorList.getPagination()",
      "V1AuditTrailInitiatorList V1AuditTrailInitiatorList.items(List)",
      "V1AuditTrailInitiatorList V1AuditTrailInitiatorList.pagination(Pagination)",
      "void V1AuditTrailInitiatorList.setItems(List)", "void V1AuditTrailInitiatorList.setPagination(Pagination)",
      "String V1AuditTrailInitiatorList.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    V1AuditTrailInitiatorList actualV1AuditTrailInitiatorList = new V1AuditTrailInitiatorList();
    V1AuditTrailInitiatorList actualItemsResult = actualV1AuditTrailInitiatorList.items(new ArrayList<>());
    V1AuditTrailInitiatorList actualPaginationResult = actualV1AuditTrailInitiatorList.pagination(new Pagination());
    ArrayList<V1AuditTrailInitiatorResponse> items = new ArrayList<>();
    actualV1AuditTrailInitiatorList.setItems(items);
    Pagination pagination = new Pagination();
    actualV1AuditTrailInitiatorList.setPagination(pagination);
    String actualToStringResult = actualV1AuditTrailInitiatorList.toString();
    List<V1AuditTrailInitiatorResponse> actualItems = actualV1AuditTrailInitiatorList.getItems();
    Pagination actualPagination = actualV1AuditTrailInitiatorList.getPagination();

    // Assert
    assertEquals(
        "class V1AuditTrailInitiatorList {\n" + "    items: []\n" + "    pagination: class Pagination {\n"
            + "        cursors: null\n" + "        previous: null\n" + "        next: null\n" + "    }\n" + "}",
        actualToStringResult);
    assertTrue(actualItems.isEmpty());
    assertSame(pagination, actualPagination);
    assertSame(actualV1AuditTrailInitiatorList, actualItemsResult);
    assertSame(actualV1AuditTrailInitiatorList, actualPaginationResult);
    assertSame(items, actualItems);
  }
}
