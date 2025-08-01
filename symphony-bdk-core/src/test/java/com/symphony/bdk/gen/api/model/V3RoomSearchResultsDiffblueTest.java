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

class V3RoomSearchResultsDiffblueTest {
  /**
   * Test {@link V3RoomSearchResults#addRoomsItem(V3RoomDetail)}.
   *
   * <ul>
   *   <li>Given {@link V3RoomSearchResults} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link V3RoomSearchResults#addRoomsItem(V3RoomDetail)}
   */
  @Test
  @DisplayName("Test addRoomsItem(V3RoomDetail); given V3RoomSearchResults (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V3RoomSearchResults V3RoomSearchResults.addRoomsItem(V3RoomDetail)"})
  void testAddRoomsItem_givenV3RoomSearchResults() {
    // Arrange
    V3RoomSearchResults v3RoomSearchResults = new V3RoomSearchResults();

    // Act and Assert
    assertSame(v3RoomSearchResults, v3RoomSearchResults.addRoomsItem(new V3RoomDetail()));
  }

  /**
   * Test {@link V3RoomSearchResults#addRoomsItem(V3RoomDetail)}.
   *
   * <ul>
   *   <li>Given {@link V3RoomSearchResults} (default constructor) rooms {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link V3RoomSearchResults#addRoomsItem(V3RoomDetail)}
   */
  @Test
  @DisplayName(
      "Test addRoomsItem(V3RoomDetail); given V3RoomSearchResults (default constructor) rooms ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V3RoomSearchResults V3RoomSearchResults.addRoomsItem(V3RoomDetail)"})
  void testAddRoomsItem_givenV3RoomSearchResultsRoomsArrayList() {
    // Arrange
    V3RoomSearchResults v3RoomSearchResults = new V3RoomSearchResults();
    v3RoomSearchResults.rooms(new ArrayList<>());

    // Act and Assert
    assertSame(v3RoomSearchResults, v3RoomSearchResults.addRoomsItem(new V3RoomDetail()));
  }

  /**
   * Test {@link V3RoomSearchResults#addFacetedMatchCountItem(FacetedMatchCount)}.
   *
   * <ul>
   *   <li>Given {@link V3RoomSearchResults} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link V3RoomSearchResults#addFacetedMatchCountItem(FacetedMatchCount)}
   */
  @Test
  @DisplayName(
      "Test addFacetedMatchCountItem(FacetedMatchCount); given V3RoomSearchResults (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "V3RoomSearchResults V3RoomSearchResults.addFacetedMatchCountItem(FacetedMatchCount)"
  })
  void testAddFacetedMatchCountItem_givenV3RoomSearchResults() {
    // Arrange
    V3RoomSearchResults v3RoomSearchResults = new V3RoomSearchResults();

    // Act and Assert
    assertSame(
        v3RoomSearchResults, v3RoomSearchResults.addFacetedMatchCountItem(new FacetedMatchCount()));
  }

  /**
   * Test {@link V3RoomSearchResults#addFacetedMatchCountItem(FacetedMatchCount)}.
   *
   * <ul>
   *   <li>Given {@link V3RoomSearchResults} (default constructor) facetedMatchCount {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link V3RoomSearchResults#addFacetedMatchCountItem(FacetedMatchCount)}
   */
  @Test
  @DisplayName(
      "Test addFacetedMatchCountItem(FacetedMatchCount); given V3RoomSearchResults (default constructor) facetedMatchCount ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "V3RoomSearchResults V3RoomSearchResults.addFacetedMatchCountItem(FacetedMatchCount)"
  })
  void testAddFacetedMatchCountItem_givenV3RoomSearchResultsFacetedMatchCountArrayList() {
    // Arrange
    V3RoomSearchResults v3RoomSearchResults = new V3RoomSearchResults();
    v3RoomSearchResults.facetedMatchCount(new ArrayList<>());

    // Act and Assert
    assertSame(
        v3RoomSearchResults, v3RoomSearchResults.addFacetedMatchCountItem(new FacetedMatchCount()));
  }

  /**
   * Test {@link V3RoomSearchResults#equals(Object)}, and {@link V3RoomSearchResults#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3RoomSearchResults#equals(Object)}
   *   <li>{@link V3RoomSearchResults#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3RoomSearchResults.equals(Object)",
    "int V3RoomSearchResults.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V3RoomSearchResults v3RoomSearchResults = new V3RoomSearchResults();
    V3RoomSearchResults v3RoomSearchResults2 = new V3RoomSearchResults();

    // Act and Assert
    assertEquals(v3RoomSearchResults, v3RoomSearchResults2);
    int expectedHashCodeResult = v3RoomSearchResults.hashCode();
    assertEquals(expectedHashCodeResult, v3RoomSearchResults2.hashCode());
  }

  /**
   * Test {@link V3RoomSearchResults#equals(Object)}, and {@link V3RoomSearchResults#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3RoomSearchResults#equals(Object)}
   *   <li>{@link V3RoomSearchResults#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3RoomSearchResults.equals(Object)",
    "int V3RoomSearchResults.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V3RoomSearchResults v3RoomSearchResults = new V3RoomSearchResults();

    // Act and Assert
    assertEquals(v3RoomSearchResults, v3RoomSearchResults);
    int expectedHashCodeResult = v3RoomSearchResults.hashCode();
    assertEquals(expectedHashCodeResult, v3RoomSearchResults.hashCode());
  }

  /**
   * Test {@link V3RoomSearchResults#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3RoomSearchResults#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3RoomSearchResults.equals(Object)",
    "int V3RoomSearchResults.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V3RoomSearchResults v3RoomSearchResults = new V3RoomSearchResults();
    v3RoomSearchResults.addRoomsItem(new V3RoomDetail());

    // Act and Assert
    assertNotEquals(v3RoomSearchResults, new V3RoomSearchResults());
  }

  /**
   * Test {@link V3RoomSearchResults#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3RoomSearchResults#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3RoomSearchResults.equals(Object)",
    "int V3RoomSearchResults.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V3RoomSearchResults v3RoomSearchResults = new V3RoomSearchResults();
    v3RoomSearchResults.count(3L);
    v3RoomSearchResults.addRoomsItem(new V3RoomDetail());

    // Act and Assert
    assertNotEquals(v3RoomSearchResults, new V3RoomSearchResults());
  }

  /**
   * Test {@link V3RoomSearchResults#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3RoomSearchResults#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3RoomSearchResults.equals(Object)",
    "int V3RoomSearchResults.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V3RoomSearchResults v3RoomSearchResults = new V3RoomSearchResults();
    v3RoomSearchResults.skip(1);
    v3RoomSearchResults.addRoomsItem(new V3RoomDetail());

    // Act and Assert
    assertNotEquals(v3RoomSearchResults, new V3RoomSearchResults());
  }

  /**
   * Test {@link V3RoomSearchResults#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3RoomSearchResults#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3RoomSearchResults.equals(Object)",
    "int V3RoomSearchResults.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V3RoomSearchResults v3RoomSearchResults = new V3RoomSearchResults();
    v3RoomSearchResults.limit(1);
    v3RoomSearchResults.addRoomsItem(new V3RoomDetail());

    // Act and Assert
    assertNotEquals(v3RoomSearchResults, new V3RoomSearchResults());
  }

  /**
   * Test {@link V3RoomSearchResults#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3RoomSearchResults#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3RoomSearchResults.equals(Object)",
    "int V3RoomSearchResults.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V3RoomSearchResults v3RoomSearchResults = new V3RoomSearchResults();
    v3RoomSearchResults.query(new V2RoomSearchCriteria());
    v3RoomSearchResults.addRoomsItem(new V3RoomDetail());

    // Act and Assert
    assertNotEquals(v3RoomSearchResults, new V3RoomSearchResults());
  }

  /**
   * Test {@link V3RoomSearchResults#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3RoomSearchResults#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3RoomSearchResults.equals(Object)",
    "int V3RoomSearchResults.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    V3RoomSearchResults v3RoomSearchResults = new V3RoomSearchResults();
    v3RoomSearchResults.addFacetedMatchCountItem(new FacetedMatchCount());

    // Act and Assert
    assertNotEquals(v3RoomSearchResults, new V3RoomSearchResults());
  }

  /**
   * Test {@link V3RoomSearchResults#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3RoomSearchResults#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3RoomSearchResults.equals(Object)",
    "int V3RoomSearchResults.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3RoomSearchResults(), null);
  }

  /**
   * Test {@link V3RoomSearchResults#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3RoomSearchResults#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V3RoomSearchResults.equals(Object)",
    "int V3RoomSearchResults.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3RoomSearchResults(), "Different type to V3RoomSearchResults");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V3RoomSearchResults}
   *   <li>{@link V3RoomSearchResults#count(Long)}
   *   <li>{@link V3RoomSearchResults#facetedMatchCount(List)}
   *   <li>{@link V3RoomSearchResults#limit(Integer)}
   *   <li>{@link V3RoomSearchResults#query(V2RoomSearchCriteria)}
   *   <li>{@link V3RoomSearchResults#rooms(List)}
   *   <li>{@link V3RoomSearchResults#setCount(Long)}
   *   <li>{@link V3RoomSearchResults#setFacetedMatchCount(List)}
   *   <li>{@link V3RoomSearchResults#setLimit(Integer)}
   *   <li>{@link V3RoomSearchResults#setQuery(V2RoomSearchCriteria)}
   *   <li>{@link V3RoomSearchResults#setRooms(List)}
   *   <li>{@link V3RoomSearchResults#setSkip(Integer)}
   *   <li>{@link V3RoomSearchResults#skip(Integer)}
   *   <li>{@link V3RoomSearchResults#toString()}
   *   <li>{@link V3RoomSearchResults#getCount()}
   *   <li>{@link V3RoomSearchResults#getFacetedMatchCount()}
   *   <li>{@link V3RoomSearchResults#getLimit()}
   *   <li>{@link V3RoomSearchResults#getQuery()}
   *   <li>{@link V3RoomSearchResults#getRooms()}
   *   <li>{@link V3RoomSearchResults#getSkip()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V3RoomSearchResults.<init>()",
    "V3RoomSearchResults V3RoomSearchResults.count(Long)",
    "V3RoomSearchResults V3RoomSearchResults.facetedMatchCount(List)",
    "Long V3RoomSearchResults.getCount()",
    "List V3RoomSearchResults.getFacetedMatchCount()",
    "Integer V3RoomSearchResults.getLimit()",
    "V2RoomSearchCriteria V3RoomSearchResults.getQuery()",
    "List V3RoomSearchResults.getRooms()",
    "Integer V3RoomSearchResults.getSkip()",
    "V3RoomSearchResults V3RoomSearchResults.limit(Integer)",
    "V3RoomSearchResults V3RoomSearchResults.query(V2RoomSearchCriteria)",
    "V3RoomSearchResults V3RoomSearchResults.rooms(List)",
    "void V3RoomSearchResults.setCount(Long)",
    "void V3RoomSearchResults.setFacetedMatchCount(List)",
    "void V3RoomSearchResults.setLimit(Integer)",
    "void V3RoomSearchResults.setQuery(V2RoomSearchCriteria)",
    "void V3RoomSearchResults.setRooms(List)",
    "void V3RoomSearchResults.setSkip(Integer)",
    "V3RoomSearchResults V3RoomSearchResults.skip(Integer)",
    "String V3RoomSearchResults.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V3RoomSearchResults actualV3RoomSearchResults = new V3RoomSearchResults();
    V3RoomSearchResults actualCountResult = actualV3RoomSearchResults.count(3L);
    V3RoomSearchResults actualFacetedMatchCountResult =
        actualV3RoomSearchResults.facetedMatchCount(new ArrayList<>());
    V3RoomSearchResults actualLimitResult = actualV3RoomSearchResults.limit(1);
    V3RoomSearchResults actualQueryResult =
        actualV3RoomSearchResults.query(new V2RoomSearchCriteria());
    V3RoomSearchResults actualRoomsResult = actualV3RoomSearchResults.rooms(new ArrayList<>());
    actualV3RoomSearchResults.setCount(3L);
    ArrayList<FacetedMatchCount> facetedMatchCount = new ArrayList<>();
    actualV3RoomSearchResults.setFacetedMatchCount(facetedMatchCount);
    actualV3RoomSearchResults.setLimit(1);
    V2RoomSearchCriteria query = new V2RoomSearchCriteria();
    actualV3RoomSearchResults.setQuery(query);
    ArrayList<V3RoomDetail> rooms = new ArrayList<>();
    actualV3RoomSearchResults.setRooms(rooms);
    actualV3RoomSearchResults.setSkip(1);
    V3RoomSearchResults actualSkipResult = actualV3RoomSearchResults.skip(1);
    String actualToStringResult = actualV3RoomSearchResults.toString();
    Long actualCount = actualV3RoomSearchResults.getCount();
    List<FacetedMatchCount> actualFacetedMatchCount =
        actualV3RoomSearchResults.getFacetedMatchCount();
    Integer actualLimit = actualV3RoomSearchResults.getLimit();
    V2RoomSearchCriteria actualQuery = actualV3RoomSearchResults.getQuery();
    List<V3RoomDetail> actualRooms = actualV3RoomSearchResults.getRooms();
    Integer actualSkip = actualV3RoomSearchResults.getSkip();

    // Assert
    assertEquals(
        "class V3RoomSearchResults {\n"
            + "    count: 3\n"
            + "    skip: 1\n"
            + "    limit: 1\n"
            + "    query: class V2RoomSearchCriteria {\n"
            + "        query: null\n"
            + "        labels: null\n"
            + "        active: null\n"
            + "        _private: null\n"
            + "        owner: null\n"
            + "        creator: null\n"
            + "        member: null\n"
            + "        sortOrder: null\n"
            + "        subType: null\n"
            + "    }\n"
            + "    rooms: []\n"
            + "    facetedMatchCount: []\n"
            + "}",
        actualToStringResult);
    assertEquals(1, actualLimit.intValue());
    assertEquals(1, actualSkip.intValue());
    assertEquals(3L, actualCount.longValue());
    assertTrue(actualFacetedMatchCount.isEmpty());
    assertTrue(actualRooms.isEmpty());
    assertSame(query, actualQuery);
    assertSame(actualV3RoomSearchResults, actualCountResult);
    assertSame(actualV3RoomSearchResults, actualFacetedMatchCountResult);
    assertSame(actualV3RoomSearchResults, actualLimitResult);
    assertSame(actualV3RoomSearchResults, actualQueryResult);
    assertSame(actualV3RoomSearchResults, actualRoomsResult);
    assertSame(actualV3RoomSearchResults, actualSkipResult);
    assertSame(facetedMatchCount, actualFacetedMatchCount);
    assertSame(rooms, actualRooms);
  }
}
