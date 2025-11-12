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

class V1DLPDictionaryMetadataCollectionResponseDiffblueTest {
  /**
   * Test {@link V1DLPDictionaryMetadataCollectionResponse#addItemsItem(V1DLPDictionaryMetadata)}.
   *
   * <p>Method under test: {@link
   * V1DLPDictionaryMetadataCollectionResponse#addItemsItem(V1DLPDictionaryMetadata)}
   */
  @Test
  @DisplayName("Test addItemsItem(V1DLPDictionaryMetadata)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "V1DLPDictionaryMetadataCollectionResponse V1DLPDictionaryMetadataCollectionResponse.addItemsItem(V1DLPDictionaryMetadata)"
  })
  void testAddItemsItem() {
    // Arrange
    V1DLPDictionaryMetadataCollectionResponse v1dlpDictionaryMetadataCollectionResponse =
        new V1DLPDictionaryMetadataCollectionResponse();

    // Act
    V1DLPDictionaryMetadataCollectionResponse actualAddItemsItemResult =
        v1dlpDictionaryMetadataCollectionResponse.addItemsItem(new V1DLPDictionaryMetadata());

    // Assert
    assertSame(v1dlpDictionaryMetadataCollectionResponse, actualAddItemsItemResult);
  }

  /**
   * Test {@link V1DLPDictionaryMetadataCollectionResponse#equals(Object)}, and {@link
   * V1DLPDictionaryMetadataCollectionResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V1DLPDictionaryMetadataCollectionResponse#equals(Object)}
   *   <li>{@link V1DLPDictionaryMetadataCollectionResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPDictionaryMetadataCollectionResponse.equals(Object)",
    "int V1DLPDictionaryMetadataCollectionResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V1DLPDictionaryMetadataCollectionResponse v1dlpDictionaryMetadataCollectionResponse =
        new V1DLPDictionaryMetadataCollectionResponse();
    V1DLPDictionaryMetadataCollectionResponse v1dlpDictionaryMetadataCollectionResponse2 =
        new V1DLPDictionaryMetadataCollectionResponse();

    // Act and Assert
    assertEquals(
        v1dlpDictionaryMetadataCollectionResponse, v1dlpDictionaryMetadataCollectionResponse2);
    assertEquals(
        v1dlpDictionaryMetadataCollectionResponse.hashCode(),
        v1dlpDictionaryMetadataCollectionResponse2.hashCode());
  }

  /**
   * Test {@link V1DLPDictionaryMetadataCollectionResponse#equals(Object)}, and {@link
   * V1DLPDictionaryMetadataCollectionResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V1DLPDictionaryMetadataCollectionResponse#equals(Object)}
   *   <li>{@link V1DLPDictionaryMetadataCollectionResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPDictionaryMetadataCollectionResponse.equals(Object)",
    "int V1DLPDictionaryMetadataCollectionResponse.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V1DLPDictionaryMetadataCollectionResponse v1dlpDictionaryMetadataCollectionResponse =
        new V1DLPDictionaryMetadataCollectionResponse();

    // Act and Assert
    assertEquals(
        v1dlpDictionaryMetadataCollectionResponse, v1dlpDictionaryMetadataCollectionResponse);
    int expectedHashCodeResult = v1dlpDictionaryMetadataCollectionResponse.hashCode();
    assertEquals(expectedHashCodeResult, v1dlpDictionaryMetadataCollectionResponse.hashCode());
  }

  /**
   * Test {@link V1DLPDictionaryMetadataCollectionResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPDictionaryMetadataCollectionResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPDictionaryMetadataCollectionResponse.equals(Object)",
    "int V1DLPDictionaryMetadataCollectionResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V1DLPDictionaryMetadataCollectionResponse v1dlpDictionaryMetadataCollectionResponse =
        new V1DLPDictionaryMetadataCollectionResponse();
    v1dlpDictionaryMetadataCollectionResponse.addItemsItem(new V1DLPDictionaryMetadata());

    // Act and Assert
    assertNotEquals(
        v1dlpDictionaryMetadataCollectionResponse, new V1DLPDictionaryMetadataCollectionResponse());
  }

  /**
   * Test {@link V1DLPDictionaryMetadataCollectionResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPDictionaryMetadataCollectionResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPDictionaryMetadataCollectionResponse.equals(Object)",
    "int V1DLPDictionaryMetadataCollectionResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V1DLPDictionaryMetadataCollectionResponse v1dlpDictionaryMetadataCollectionResponse =
        new V1DLPDictionaryMetadataCollectionResponse();
    v1dlpDictionaryMetadataCollectionResponse.page(1);

    // Act and Assert
    assertNotEquals(
        v1dlpDictionaryMetadataCollectionResponse, new V1DLPDictionaryMetadataCollectionResponse());
  }

  /**
   * Test {@link V1DLPDictionaryMetadataCollectionResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPDictionaryMetadataCollectionResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPDictionaryMetadataCollectionResponse.equals(Object)",
    "int V1DLPDictionaryMetadataCollectionResponse.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V1DLPDictionaryMetadataCollectionResponse v1dlpDictionaryMetadataCollectionResponse =
        new V1DLPDictionaryMetadataCollectionResponse();
    v1dlpDictionaryMetadataCollectionResponse.pageCount(3);

    // Act and Assert
    assertNotEquals(
        v1dlpDictionaryMetadataCollectionResponse, new V1DLPDictionaryMetadataCollectionResponse());
  }

  /**
   * Test {@link V1DLPDictionaryMetadataCollectionResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPDictionaryMetadataCollectionResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPDictionaryMetadataCollectionResponse.equals(Object)",
    "int V1DLPDictionaryMetadataCollectionResponse.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V1DLPDictionaryMetadataCollectionResponse(), null);
  }

  /**
   * Test {@link V1DLPDictionaryMetadataCollectionResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V1DLPDictionaryMetadataCollectionResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V1DLPDictionaryMetadataCollectionResponse.equals(Object)",
    "int V1DLPDictionaryMetadataCollectionResponse.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new V1DLPDictionaryMetadataCollectionResponse(),
        "Different type to V1DLPDictionaryMetadataCollectionResponse");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V1DLPDictionaryMetadataCollectionResponse}
   *   <li>{@link V1DLPDictionaryMetadataCollectionResponse#items(List)}
   *   <li>{@link V1DLPDictionaryMetadataCollectionResponse#page(Integer)}
   *   <li>{@link V1DLPDictionaryMetadataCollectionResponse#pageCount(Integer)}
   *   <li>{@link V1DLPDictionaryMetadataCollectionResponse#setItems(List)}
   *   <li>{@link V1DLPDictionaryMetadataCollectionResponse#setPage(Integer)}
   *   <li>{@link V1DLPDictionaryMetadataCollectionResponse#setPageCount(Integer)}
   *   <li>{@link V1DLPDictionaryMetadataCollectionResponse#toString()}
   *   <li>{@link V1DLPDictionaryMetadataCollectionResponse#getItems()}
   *   <li>{@link V1DLPDictionaryMetadataCollectionResponse#getPage()}
   *   <li>{@link V1DLPDictionaryMetadataCollectionResponse#getPageCount()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V1DLPDictionaryMetadataCollectionResponse.<init>()",
    "List V1DLPDictionaryMetadataCollectionResponse.getItems()",
    "Integer V1DLPDictionaryMetadataCollectionResponse.getPage()",
    "Integer V1DLPDictionaryMetadataCollectionResponse.getPageCount()",
    "V1DLPDictionaryMetadataCollectionResponse V1DLPDictionaryMetadataCollectionResponse.items(List)",
    "V1DLPDictionaryMetadataCollectionResponse V1DLPDictionaryMetadataCollectionResponse.page(Integer)",
    "V1DLPDictionaryMetadataCollectionResponse V1DLPDictionaryMetadataCollectionResponse.pageCount(Integer)",
    "void V1DLPDictionaryMetadataCollectionResponse.setItems(List)",
    "void V1DLPDictionaryMetadataCollectionResponse.setPage(Integer)",
    "void V1DLPDictionaryMetadataCollectionResponse.setPageCount(Integer)",
    "String V1DLPDictionaryMetadataCollectionResponse.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V1DLPDictionaryMetadataCollectionResponse actualV1dlpDictionaryMetadataCollectionResponse =
        new V1DLPDictionaryMetadataCollectionResponse();
    V1DLPDictionaryMetadataCollectionResponse actualItemsResult =
        actualV1dlpDictionaryMetadataCollectionResponse.items(new ArrayList<>());
    V1DLPDictionaryMetadataCollectionResponse actualPageResult =
        actualV1dlpDictionaryMetadataCollectionResponse.page(1);
    V1DLPDictionaryMetadataCollectionResponse actualPageCountResult =
        actualV1dlpDictionaryMetadataCollectionResponse.pageCount(3);
    ArrayList<V1DLPDictionaryMetadata> items = new ArrayList<>();
    actualV1dlpDictionaryMetadataCollectionResponse.setItems(items);
    actualV1dlpDictionaryMetadataCollectionResponse.setPage(1);
    actualV1dlpDictionaryMetadataCollectionResponse.setPageCount(3);
    String actualToStringResult = actualV1dlpDictionaryMetadataCollectionResponse.toString();
    List<V1DLPDictionaryMetadata> actualItems =
        actualV1dlpDictionaryMetadataCollectionResponse.getItems();
    Integer actualPage = actualV1dlpDictionaryMetadataCollectionResponse.getPage();
    Integer actualPageCount = actualV1dlpDictionaryMetadataCollectionResponse.getPageCount();

    // Assert
    assertEquals(
        "class V1DLPDictionaryMetadataCollectionResponse {\n    items: []\n    page: 1\n    pageCount: 3\n}",
        actualToStringResult);
    assertEquals(1, actualPage.intValue());
    assertEquals(3, actualPageCount.intValue());
    assertTrue(actualItems.isEmpty());
    assertSame(actualV1dlpDictionaryMetadataCollectionResponse, actualItemsResult);
    assertSame(actualV1dlpDictionaryMetadataCollectionResponse, actualPageResult);
    assertSame(actualV1dlpDictionaryMetadataCollectionResponse, actualPageCountResult);
    assertSame(items, actualItems);
  }
}
