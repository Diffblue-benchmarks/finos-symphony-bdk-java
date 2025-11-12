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

class V2AdminStreamListDiffblueTest {
  /**
   * Test {@link V2AdminStreamList#addStreamsItem(V2AdminStreamInfo)}.
   *
   * <ul>
   *   <li>Given {@link V2AdminStreamList} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link V2AdminStreamList#addStreamsItem(V2AdminStreamInfo)}
   */
  @Test
  @DisplayName(
      "Test addStreamsItem(V2AdminStreamInfo); given V2AdminStreamList (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2AdminStreamList V2AdminStreamList.addStreamsItem(V2AdminStreamInfo)"})
  void testAddStreamsItem_givenV2AdminStreamList() {
    // Arrange
    V2AdminStreamList v2AdminStreamList = new V2AdminStreamList();

    // Act
    V2AdminStreamList actualAddStreamsItemResult =
        v2AdminStreamList.addStreamsItem(new V2AdminStreamInfo());

    // Assert
    assertSame(v2AdminStreamList, actualAddStreamsItemResult);
  }

  /**
   * Test {@link V2AdminStreamList#addStreamsItem(V2AdminStreamInfo)}.
   *
   * <ul>
   *   <li>Given {@link V2AdminStreamList} (default constructor) streams {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link V2AdminStreamList#addStreamsItem(V2AdminStreamInfo)}
   */
  @Test
  @DisplayName(
      "Test addStreamsItem(V2AdminStreamInfo); given V2AdminStreamList (default constructor) streams ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2AdminStreamList V2AdminStreamList.addStreamsItem(V2AdminStreamInfo)"})
  void testAddStreamsItem_givenV2AdminStreamListStreamsArrayList() {
    // Arrange
    V2AdminStreamList v2AdminStreamList = new V2AdminStreamList();
    v2AdminStreamList.streams(new ArrayList<>());

    // Act
    V2AdminStreamList actualAddStreamsItemResult =
        v2AdminStreamList.addStreamsItem(new V2AdminStreamInfo());

    // Assert
    assertSame(v2AdminStreamList, actualAddStreamsItemResult);
  }

  /**
   * Test {@link V2AdminStreamList#equals(Object)}, and {@link V2AdminStreamList#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2AdminStreamList#equals(Object)}
   *   <li>{@link V2AdminStreamList#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2AdminStreamList.equals(Object)",
    "int V2AdminStreamList.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2AdminStreamList v2AdminStreamList = new V2AdminStreamList();
    V2AdminStreamList v2AdminStreamList2 = new V2AdminStreamList();

    // Act and Assert
    assertEquals(v2AdminStreamList, v2AdminStreamList2);
    assertEquals(v2AdminStreamList.hashCode(), v2AdminStreamList2.hashCode());
  }

  /**
   * Test {@link V2AdminStreamList#equals(Object)}, and {@link V2AdminStreamList#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2AdminStreamList#equals(Object)}
   *   <li>{@link V2AdminStreamList#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2AdminStreamList.equals(Object)",
    "int V2AdminStreamList.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2AdminStreamList v2AdminStreamList = new V2AdminStreamList();

    // Act and Assert
    assertEquals(v2AdminStreamList, v2AdminStreamList);
    int expectedHashCodeResult = v2AdminStreamList.hashCode();
    assertEquals(expectedHashCodeResult, v2AdminStreamList.hashCode());
  }

  /**
   * Test {@link V2AdminStreamList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2AdminStreamList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2AdminStreamList.equals(Object)",
    "int V2AdminStreamList.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V2AdminStreamList v2AdminStreamList = new V2AdminStreamList();
    v2AdminStreamList.addStreamsItem(new V2AdminStreamInfo());

    // Act and Assert
    assertNotEquals(v2AdminStreamList, new V2AdminStreamList());
  }

  /**
   * Test {@link V2AdminStreamList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2AdminStreamList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2AdminStreamList.equals(Object)",
    "int V2AdminStreamList.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V2AdminStreamList v2AdminStreamList = new V2AdminStreamList();
    v2AdminStreamList.count(3L);
    v2AdminStreamList.addStreamsItem(new V2AdminStreamInfo());

    // Act and Assert
    assertNotEquals(v2AdminStreamList, new V2AdminStreamList());
  }

  /**
   * Test {@link V2AdminStreamList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2AdminStreamList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2AdminStreamList.equals(Object)",
    "int V2AdminStreamList.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V2AdminStreamList v2AdminStreamList = new V2AdminStreamList();
    v2AdminStreamList.skip(1);
    v2AdminStreamList.addStreamsItem(new V2AdminStreamInfo());

    // Act and Assert
    assertNotEquals(v2AdminStreamList, new V2AdminStreamList());
  }

  /**
   * Test {@link V2AdminStreamList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2AdminStreamList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2AdminStreamList.equals(Object)",
    "int V2AdminStreamList.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V2AdminStreamList v2AdminStreamList = new V2AdminStreamList();
    v2AdminStreamList.limit(1);
    v2AdminStreamList.addStreamsItem(new V2AdminStreamInfo());

    // Act and Assert
    assertNotEquals(v2AdminStreamList, new V2AdminStreamList());
  }

  /**
   * Test {@link V2AdminStreamList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2AdminStreamList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2AdminStreamList.equals(Object)",
    "int V2AdminStreamList.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V2AdminStreamList v2AdminStreamList = new V2AdminStreamList();
    v2AdminStreamList.filter(new V2AdminStreamFilter());
    v2AdminStreamList.addStreamsItem(new V2AdminStreamInfo());

    // Act and Assert
    assertNotEquals(v2AdminStreamList, new V2AdminStreamList());
  }

  /**
   * Test {@link V2AdminStreamList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2AdminStreamList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2AdminStreamList.equals(Object)",
    "int V2AdminStreamList.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2AdminStreamList(), null);
  }

  /**
   * Test {@link V2AdminStreamList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2AdminStreamList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2AdminStreamList.equals(Object)",
    "int V2AdminStreamList.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2AdminStreamList(), "Different type to V2AdminStreamList");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V2AdminStreamList}
   *   <li>{@link V2AdminStreamList#count(Long)}
   *   <li>{@link V2AdminStreamList#filter(V2AdminStreamFilter)}
   *   <li>{@link V2AdminStreamList#limit(Integer)}
   *   <li>{@link V2AdminStreamList#setCount(Long)}
   *   <li>{@link V2AdminStreamList#setFilter(V2AdminStreamFilter)}
   *   <li>{@link V2AdminStreamList#setLimit(Integer)}
   *   <li>{@link V2AdminStreamList#setSkip(Integer)}
   *   <li>{@link V2AdminStreamList#setStreams(List)}
   *   <li>{@link V2AdminStreamList#skip(Integer)}
   *   <li>{@link V2AdminStreamList#streams(List)}
   *   <li>{@link V2AdminStreamList#toString()}
   *   <li>{@link V2AdminStreamList#getCount()}
   *   <li>{@link V2AdminStreamList#getFilter()}
   *   <li>{@link V2AdminStreamList#getLimit()}
   *   <li>{@link V2AdminStreamList#getSkip()}
   *   <li>{@link V2AdminStreamList#getStreams()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V2AdminStreamList.<init>()",
    "V2AdminStreamList V2AdminStreamList.count(Long)",
    "V2AdminStreamList V2AdminStreamList.filter(V2AdminStreamFilter)",
    "Long V2AdminStreamList.getCount()",
    "V2AdminStreamFilter V2AdminStreamList.getFilter()",
    "Integer V2AdminStreamList.getLimit()",
    "Integer V2AdminStreamList.getSkip()",
    "List V2AdminStreamList.getStreams()",
    "V2AdminStreamList V2AdminStreamList.limit(Integer)",
    "void V2AdminStreamList.setCount(Long)",
    "void V2AdminStreamList.setFilter(V2AdminStreamFilter)",
    "void V2AdminStreamList.setLimit(Integer)",
    "void V2AdminStreamList.setSkip(Integer)",
    "void V2AdminStreamList.setStreams(List)",
    "V2AdminStreamList V2AdminStreamList.skip(Integer)",
    "V2AdminStreamList V2AdminStreamList.streams(List)",
    "String V2AdminStreamList.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V2AdminStreamList actualV2AdminStreamList = new V2AdminStreamList();
    V2AdminStreamList actualCountResult = actualV2AdminStreamList.count(3L);
    V2AdminStreamList actualFilterResult =
        actualV2AdminStreamList.filter(new V2AdminStreamFilter());
    V2AdminStreamList actualLimitResult = actualV2AdminStreamList.limit(1);
    actualV2AdminStreamList.setCount(3L);
    V2AdminStreamFilter filter = new V2AdminStreamFilter();
    actualV2AdminStreamList.setFilter(filter);
    actualV2AdminStreamList.setLimit(1);
    actualV2AdminStreamList.setSkip(1);
    actualV2AdminStreamList.setStreams(new ArrayList<>());
    V2AdminStreamList actualSkipResult = actualV2AdminStreamList.skip(1);
    ArrayList<V2AdminStreamInfo> streams = new ArrayList<>();
    V2AdminStreamList actualStreamsResult = actualV2AdminStreamList.streams(streams);
    String actualToStringResult = actualV2AdminStreamList.toString();
    Long actualCount = actualV2AdminStreamList.getCount();
    V2AdminStreamFilter actualFilter = actualV2AdminStreamList.getFilter();
    Integer actualLimit = actualV2AdminStreamList.getLimit();
    Integer actualSkip = actualV2AdminStreamList.getSkip();
    List<V2AdminStreamInfo> actualStreams = actualV2AdminStreamList.getStreams();

    // Assert
    assertEquals(
        "class V2AdminStreamList {\n"
            + "    count: 3\n"
            + "    skip: 1\n"
            + "    limit: 1\n"
            + "    filter: class V2AdminStreamFilter {\n"
            + "        streamTypes: null\n"
            + "        scope: null\n"
            + "        origin: null\n"
            + "        status: null\n"
            + "        privacy: null\n"
            + "        startDate: null\n"
            + "        endDate: null\n"
            + "    }\n"
            + "    streams: []\n"
            + "}",
        actualToStringResult);
    assertEquals(1, actualLimit.intValue());
    assertEquals(1, actualSkip.intValue());
    assertEquals(3L, actualCount.longValue());
    assertTrue(actualStreams.isEmpty());
    assertSame(filter, actualFilter);
    assertSame(actualV2AdminStreamList, actualCountResult);
    assertSame(actualV2AdminStreamList, actualFilterResult);
    assertSame(actualV2AdminStreamList, actualLimitResult);
    assertSame(actualV2AdminStreamList, actualSkipResult);
    assertSame(actualV2AdminStreamList, actualStreamsResult);
    assertSame(streams, actualStreams);
  }
}
