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

class AdminStreamListDiffblueTest {
  /**
   * Test {@link AdminStreamList#addStreamsItem(AdminStreamInfo)}.
   *
   * <ul>
   *   <li>Given {@link AdminStreamList} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamList#addStreamsItem(AdminStreamInfo)}
   */
  @Test
  @DisplayName("Test addStreamsItem(AdminStreamInfo); given AdminStreamList (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AdminStreamList AdminStreamList.addStreamsItem(AdminStreamInfo)"})
  void testAddStreamsItem_givenAdminStreamList() {
    // Arrange
    AdminStreamList adminStreamList = new AdminStreamList();

    // Act and Assert
    assertSame(adminStreamList, adminStreamList.addStreamsItem(new AdminStreamInfo()));
  }

  /**
   * Test {@link AdminStreamList#addStreamsItem(AdminStreamInfo)}.
   *
   * <ul>
   *   <li>Given {@link AdminStreamList} (default constructor) streams {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamList#addStreamsItem(AdminStreamInfo)}
   */
  @Test
  @DisplayName(
      "Test addStreamsItem(AdminStreamInfo); given AdminStreamList (default constructor) streams ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AdminStreamList AdminStreamList.addStreamsItem(AdminStreamInfo)"})
  void testAddStreamsItem_givenAdminStreamListStreamsArrayList() {
    // Arrange
    AdminStreamList adminStreamList = new AdminStreamList();
    adminStreamList.streams(new ArrayList<>());

    // Act and Assert
    assertSame(adminStreamList, adminStreamList.addStreamsItem(new AdminStreamInfo()));
  }

  /**
   * Test {@link AdminStreamList#equals(Object)}, and {@link AdminStreamList#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AdminStreamList#equals(Object)}
   *   <li>{@link AdminStreamList#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdminStreamList.equals(Object)", "int AdminStreamList.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AdminStreamList adminStreamList = new AdminStreamList();
    AdminStreamList adminStreamList2 = new AdminStreamList();

    // Act and Assert
    assertEquals(adminStreamList, adminStreamList2);
    int expectedHashCodeResult = adminStreamList.hashCode();
    assertEquals(expectedHashCodeResult, adminStreamList2.hashCode());
  }

  /**
   * Test {@link AdminStreamList#equals(Object)}, and {@link AdminStreamList#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AdminStreamList#equals(Object)}
   *   <li>{@link AdminStreamList#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdminStreamList.equals(Object)", "int AdminStreamList.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AdminStreamList adminStreamList = new AdminStreamList();

    // Act and Assert
    assertEquals(adminStreamList, adminStreamList);
    int expectedHashCodeResult = adminStreamList.hashCode();
    assertEquals(expectedHashCodeResult, adminStreamList.hashCode());
  }

  /**
   * Test {@link AdminStreamList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdminStreamList.equals(Object)", "int AdminStreamList.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    AdminStreamList adminStreamList = new AdminStreamList();
    adminStreamList.addStreamsItem(new AdminStreamInfo());

    // Act and Assert
    assertNotEquals(adminStreamList, new AdminStreamList());
  }

  /**
   * Test {@link AdminStreamList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdminStreamList.equals(Object)", "int AdminStreamList.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    AdminStreamList adminStreamList = new AdminStreamList();
    adminStreamList.count(3L);
    adminStreamList.addStreamsItem(new AdminStreamInfo());

    // Act and Assert
    assertNotEquals(adminStreamList, new AdminStreamList());
  }

  /**
   * Test {@link AdminStreamList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdminStreamList.equals(Object)", "int AdminStreamList.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    AdminStreamList adminStreamList = new AdminStreamList();
    adminStreamList.skip(1);
    adminStreamList.addStreamsItem(new AdminStreamInfo());

    // Act and Assert
    assertNotEquals(adminStreamList, new AdminStreamList());
  }

  /**
   * Test {@link AdminStreamList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdminStreamList.equals(Object)", "int AdminStreamList.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    AdminStreamList adminStreamList = new AdminStreamList();
    adminStreamList.limit(1);
    adminStreamList.addStreamsItem(new AdminStreamInfo());

    // Act and Assert
    assertNotEquals(adminStreamList, new AdminStreamList());
  }

  /**
   * Test {@link AdminStreamList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdminStreamList.equals(Object)", "int AdminStreamList.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    AdminStreamList adminStreamList = new AdminStreamList();
    adminStreamList.filter(new AdminStreamFilter());
    adminStreamList.addStreamsItem(new AdminStreamInfo());

    // Act and Assert
    assertNotEquals(adminStreamList, new AdminStreamList());
  }

  /**
   * Test {@link AdminStreamList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdminStreamList.equals(Object)", "int AdminStreamList.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AdminStreamList(), null);
  }

  /**
   * Test {@link AdminStreamList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdminStreamList.equals(Object)", "int AdminStreamList.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AdminStreamList(), "Different type to AdminStreamList");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link AdminStreamList}
   *   <li>{@link AdminStreamList#count(Long)}
   *   <li>{@link AdminStreamList#filter(AdminStreamFilter)}
   *   <li>{@link AdminStreamList#limit(Integer)}
   *   <li>{@link AdminStreamList#setCount(Long)}
   *   <li>{@link AdminStreamList#setFilter(AdminStreamFilter)}
   *   <li>{@link AdminStreamList#setLimit(Integer)}
   *   <li>{@link AdminStreamList#setSkip(Integer)}
   *   <li>{@link AdminStreamList#setStreams(List)}
   *   <li>{@link AdminStreamList#skip(Integer)}
   *   <li>{@link AdminStreamList#streams(List)}
   *   <li>{@link AdminStreamList#toString()}
   *   <li>{@link AdminStreamList#getCount()}
   *   <li>{@link AdminStreamList#getFilter()}
   *   <li>{@link AdminStreamList#getLimit()}
   *   <li>{@link AdminStreamList#getSkip()}
   *   <li>{@link AdminStreamList#getStreams()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AdminStreamList.<init>()",
    "AdminStreamList AdminStreamList.count(Long)",
    "AdminStreamList AdminStreamList.filter(AdminStreamFilter)",
    "Long AdminStreamList.getCount()",
    "AdminStreamFilter AdminStreamList.getFilter()",
    "Integer AdminStreamList.getLimit()",
    "Integer AdminStreamList.getSkip()",
    "List AdminStreamList.getStreams()",
    "AdminStreamList AdminStreamList.limit(Integer)",
    "void AdminStreamList.setCount(Long)",
    "void AdminStreamList.setFilter(AdminStreamFilter)",
    "void AdminStreamList.setLimit(Integer)",
    "void AdminStreamList.setSkip(Integer)",
    "void AdminStreamList.setStreams(List)",
    "AdminStreamList AdminStreamList.skip(Integer)",
    "AdminStreamList AdminStreamList.streams(List)",
    "String AdminStreamList.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    AdminStreamList actualAdminStreamList = new AdminStreamList();
    AdminStreamList actualCountResult = actualAdminStreamList.count(3L);
    AdminStreamList actualFilterResult = actualAdminStreamList.filter(new AdminStreamFilter());
    AdminStreamList actualLimitResult = actualAdminStreamList.limit(1);
    actualAdminStreamList.setCount(3L);
    AdminStreamFilter filter = new AdminStreamFilter();
    actualAdminStreamList.setFilter(filter);
    actualAdminStreamList.setLimit(1);
    actualAdminStreamList.setSkip(1);
    actualAdminStreamList.setStreams(new ArrayList<>());
    AdminStreamList actualSkipResult = actualAdminStreamList.skip(1);
    ArrayList<AdminStreamInfo> streams = new ArrayList<>();
    AdminStreamList actualStreamsResult = actualAdminStreamList.streams(streams);
    String actualToStringResult = actualAdminStreamList.toString();
    Long actualCount = actualAdminStreamList.getCount();
    AdminStreamFilter actualFilter = actualAdminStreamList.getFilter();
    Integer actualLimit = actualAdminStreamList.getLimit();
    Integer actualSkip = actualAdminStreamList.getSkip();
    List<AdminStreamInfo> actualStreams = actualAdminStreamList.getStreams();

    // Assert
    assertEquals(
        "class AdminStreamList {\n"
            + "    count: 3\n"
            + "    skip: 1\n"
            + "    limit: 1\n"
            + "    filter: class AdminStreamFilter {\n"
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
    assertSame(actualAdminStreamList, actualCountResult);
    assertSame(actualAdminStreamList, actualFilterResult);
    assertSame(actualAdminStreamList, actualLimitResult);
    assertSame(actualAdminStreamList, actualSkipResult);
    assertSame(actualAdminStreamList, actualStreamsResult);
    assertSame(streams, actualStreams);
  }
}
