package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.RoomSearchCriteria.SortOrderEnum;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RoomSearchCriteriaDiffblueTest {
  /**
   * Test {@link RoomSearchCriteria#addLabelsItem(String)}.
   *
   * <ul>
   *   <li>Given {@link RoomSearchCriteria} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link RoomSearchCriteria#addLabelsItem(String)}
   */
  @Test
  @DisplayName("Test addLabelsItem(String); given RoomSearchCriteria (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RoomSearchCriteria RoomSearchCriteria.addLabelsItem(String)"})
  void testAddLabelsItem_givenRoomSearchCriteria() {
    // Arrange
    RoomSearchCriteria roomSearchCriteria = new RoomSearchCriteria();

    // Act
    RoomSearchCriteria actualAddLabelsItemResult = roomSearchCriteria.addLabelsItem("Labels Item");

    // Assert
    assertSame(roomSearchCriteria, actualAddLabelsItemResult);
  }

  /**
   * Test {@link RoomSearchCriteria#addLabelsItem(String)}.
   *
   * <ul>
   *   <li>Given {@link RoomSearchCriteria} (default constructor) labels {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link RoomSearchCriteria#addLabelsItem(String)}
   */
  @Test
  @DisplayName(
      "Test addLabelsItem(String); given RoomSearchCriteria (default constructor) labels ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RoomSearchCriteria RoomSearchCriteria.addLabelsItem(String)"})
  void testAddLabelsItem_givenRoomSearchCriteriaLabelsArrayList() {
    // Arrange
    RoomSearchCriteria roomSearchCriteria = new RoomSearchCriteria();
    roomSearchCriteria.labels(new ArrayList<>());

    // Act
    RoomSearchCriteria actualAddLabelsItemResult = roomSearchCriteria.addLabelsItem("Labels Item");

    // Assert
    assertSame(roomSearchCriteria, actualAddLabelsItemResult);
  }

  /**
   * Test {@link RoomSearchCriteria#equals(Object)}, and {@link RoomSearchCriteria#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RoomSearchCriteria#equals(Object)}
   *   <li>{@link RoomSearchCriteria#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomSearchCriteria.equals(Object)",
    "int RoomSearchCriteria.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    RoomSearchCriteria roomSearchCriteria = new RoomSearchCriteria();
    RoomSearchCriteria roomSearchCriteria2 = new RoomSearchCriteria();

    // Act and Assert
    assertEquals(roomSearchCriteria, roomSearchCriteria2);
    assertEquals(roomSearchCriteria.hashCode(), roomSearchCriteria2.hashCode());
  }

  /**
   * Test {@link RoomSearchCriteria#equals(Object)}, and {@link RoomSearchCriteria#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RoomSearchCriteria#equals(Object)}
   *   <li>{@link RoomSearchCriteria#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomSearchCriteria.equals(Object)",
    "int RoomSearchCriteria.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    RoomSearchCriteria roomSearchCriteria = new RoomSearchCriteria();

    // Act and Assert
    assertEquals(roomSearchCriteria, roomSearchCriteria);
    int expectedHashCodeResult = roomSearchCriteria.hashCode();
    assertEquals(expectedHashCodeResult, roomSearchCriteria.hashCode());
  }

  /**
   * Test {@link RoomSearchCriteria#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomSearchCriteria#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomSearchCriteria.equals(Object)",
    "int RoomSearchCriteria.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    RoomSearchCriteria roomSearchCriteria = new RoomSearchCriteria();
    roomSearchCriteria.addLabelsItem("Labels Item");

    // Act and Assert
    assertNotEquals(roomSearchCriteria, new RoomSearchCriteria());
  }

  /**
   * Test {@link RoomSearchCriteria#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomSearchCriteria#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomSearchCriteria.equals(Object)",
    "int RoomSearchCriteria.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    RoomSearchCriteria roomSearchCriteria = new RoomSearchCriteria();
    roomSearchCriteria.query("Query");
    roomSearchCriteria.addLabelsItem("Labels Item");

    // Act and Assert
    assertNotEquals(roomSearchCriteria, new RoomSearchCriteria());
  }

  /**
   * Test {@link RoomSearchCriteria#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomSearchCriteria#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomSearchCriteria.equals(Object)",
    "int RoomSearchCriteria.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    RoomSearchCriteria roomSearchCriteria = new RoomSearchCriteria();
    roomSearchCriteria.active(true);

    // Act and Assert
    assertNotEquals(roomSearchCriteria, new RoomSearchCriteria());
  }

  /**
   * Test {@link RoomSearchCriteria#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomSearchCriteria#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomSearchCriteria.equals(Object)",
    "int RoomSearchCriteria.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    RoomSearchCriteria roomSearchCriteria = new RoomSearchCriteria();
    roomSearchCriteria._private(true);

    // Act and Assert
    assertNotEquals(roomSearchCriteria, new RoomSearchCriteria());
  }

  /**
   * Test {@link RoomSearchCriteria#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomSearchCriteria#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomSearchCriteria.equals(Object)",
    "int RoomSearchCriteria.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    RoomSearchCriteria roomSearchCriteria = new RoomSearchCriteria();
    roomSearchCriteria.owner(new UserId());

    // Act and Assert
    assertNotEquals(roomSearchCriteria, new RoomSearchCriteria());
  }

  /**
   * Test {@link RoomSearchCriteria#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomSearchCriteria#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomSearchCriteria.equals(Object)",
    "int RoomSearchCriteria.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    RoomSearchCriteria roomSearchCriteria = new RoomSearchCriteria();
    roomSearchCriteria.creator(new UserId());

    // Act and Assert
    assertNotEquals(roomSearchCriteria, new RoomSearchCriteria());
  }

  /**
   * Test {@link RoomSearchCriteria#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomSearchCriteria#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomSearchCriteria.equals(Object)",
    "int RoomSearchCriteria.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    RoomSearchCriteria roomSearchCriteria = new RoomSearchCriteria();
    roomSearchCriteria.member(new UserId());

    // Act and Assert
    assertNotEquals(roomSearchCriteria, new RoomSearchCriteria());
  }

  /**
   * Test {@link RoomSearchCriteria#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomSearchCriteria#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomSearchCriteria.equals(Object)",
    "int RoomSearchCriteria.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    RoomSearchCriteria roomSearchCriteria = new RoomSearchCriteria();
    roomSearchCriteria.sortOrder(SortOrderEnum.BASIC);

    // Act and Assert
    assertNotEquals(roomSearchCriteria, new RoomSearchCriteria());
  }

  /**
   * Test {@link RoomSearchCriteria#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomSearchCriteria#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomSearchCriteria.equals(Object)",
    "int RoomSearchCriteria.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomSearchCriteria(), null);
  }

  /**
   * Test {@link RoomSearchCriteria#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomSearchCriteria#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomSearchCriteria.equals(Object)",
    "int RoomSearchCriteria.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomSearchCriteria(), "Different type to RoomSearchCriteria");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link RoomSearchCriteria}
   *   <li>{@link RoomSearchCriteria#_private(Boolean)}
   *   <li>{@link RoomSearchCriteria#active(Boolean)}
   *   <li>{@link RoomSearchCriteria#creator(UserId)}
   *   <li>{@link RoomSearchCriteria#labels(List)}
   *   <li>{@link RoomSearchCriteria#member(UserId)}
   *   <li>{@link RoomSearchCriteria#owner(UserId)}
   *   <li>{@link RoomSearchCriteria#query(String)}
   *   <li>{@link RoomSearchCriteria#setActive(Boolean)}
   *   <li>{@link RoomSearchCriteria#setCreator(UserId)}
   *   <li>{@link RoomSearchCriteria#setLabels(List)}
   *   <li>{@link RoomSearchCriteria#setMember(UserId)}
   *   <li>{@link RoomSearchCriteria#setOwner(UserId)}
   *   <li>{@link RoomSearchCriteria#setPrivate(Boolean)}
   *   <li>{@link RoomSearchCriteria#setQuery(String)}
   *   <li>{@link RoomSearchCriteria#setSortOrder(SortOrderEnum)}
   *   <li>{@link RoomSearchCriteria#sortOrder(SortOrderEnum)}
   *   <li>{@link RoomSearchCriteria#toString()}
   *   <li>{@link RoomSearchCriteria#getActive()}
   *   <li>{@link RoomSearchCriteria#getCreator()}
   *   <li>{@link RoomSearchCriteria#getLabels()}
   *   <li>{@link RoomSearchCriteria#getMember()}
   *   <li>{@link RoomSearchCriteria#getOwner()}
   *   <li>{@link RoomSearchCriteria#getPrivate()}
   *   <li>{@link RoomSearchCriteria#getQuery()}
   *   <li>{@link RoomSearchCriteria#getSortOrder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RoomSearchCriteria.<init>()",
    "RoomSearchCriteria RoomSearchCriteria._private(Boolean)",
    "RoomSearchCriteria RoomSearchCriteria.active(Boolean)",
    "RoomSearchCriteria RoomSearchCriteria.creator(UserId)",
    "Boolean RoomSearchCriteria.getActive()",
    "UserId RoomSearchCriteria.getCreator()",
    "List RoomSearchCriteria.getLabels()",
    "UserId RoomSearchCriteria.getMember()",
    "UserId RoomSearchCriteria.getOwner()",
    "Boolean RoomSearchCriteria.getPrivate()",
    "String RoomSearchCriteria.getQuery()",
    "SortOrderEnum RoomSearchCriteria.getSortOrder()",
    "RoomSearchCriteria RoomSearchCriteria.labels(List)",
    "RoomSearchCriteria RoomSearchCriteria.member(UserId)",
    "RoomSearchCriteria RoomSearchCriteria.owner(UserId)",
    "RoomSearchCriteria RoomSearchCriteria.query(String)",
    "void RoomSearchCriteria.setActive(Boolean)",
    "void RoomSearchCriteria.setCreator(UserId)",
    "void RoomSearchCriteria.setLabels(List)",
    "void RoomSearchCriteria.setMember(UserId)",
    "void RoomSearchCriteria.setOwner(UserId)",
    "void RoomSearchCriteria.setPrivate(Boolean)",
    "void RoomSearchCriteria.setQuery(String)",
    "void RoomSearchCriteria.setSortOrder(SortOrderEnum)",
    "RoomSearchCriteria RoomSearchCriteria.sortOrder(SortOrderEnum)",
    "String RoomSearchCriteria.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    RoomSearchCriteria actualRoomSearchCriteria = new RoomSearchCriteria();
    RoomSearchCriteria actual_privateResult = actualRoomSearchCriteria._private(true);
    RoomSearchCriteria actualActiveResult = actualRoomSearchCriteria.active(true);
    RoomSearchCriteria actualCreatorResult = actualRoomSearchCriteria.creator(new UserId());
    RoomSearchCriteria actualLabelsResult = actualRoomSearchCriteria.labels(new ArrayList<>());
    RoomSearchCriteria actualMemberResult = actualRoomSearchCriteria.member(new UserId());
    RoomSearchCriteria actualOwnerResult = actualRoomSearchCriteria.owner(new UserId());
    RoomSearchCriteria actualQueryResult = actualRoomSearchCriteria.query("Query");
    actualRoomSearchCriteria.setActive(true);
    UserId creator = new UserId();
    actualRoomSearchCriteria.setCreator(creator);
    ArrayList<String> labels = new ArrayList<>();
    actualRoomSearchCriteria.setLabels(labels);
    UserId member = new UserId();
    actualRoomSearchCriteria.setMember(member);
    UserId owner = new UserId();
    actualRoomSearchCriteria.setOwner(owner);
    actualRoomSearchCriteria.setPrivate(true);
    actualRoomSearchCriteria.setQuery("Query");
    actualRoomSearchCriteria.setSortOrder(SortOrderEnum.BASIC);
    RoomSearchCriteria actualSortOrderResult =
        actualRoomSearchCriteria.sortOrder(SortOrderEnum.BASIC);
    String actualToStringResult = actualRoomSearchCriteria.toString();
    Boolean actualActive = actualRoomSearchCriteria.getActive();
    UserId actualCreator = actualRoomSearchCriteria.getCreator();
    List<String> actualLabels = actualRoomSearchCriteria.getLabels();
    UserId actualMember = actualRoomSearchCriteria.getMember();
    UserId actualOwner = actualRoomSearchCriteria.getOwner();
    Boolean actualPrivate = actualRoomSearchCriteria.getPrivate();
    String actualQuery = actualRoomSearchCriteria.getQuery();

    // Assert
    assertEquals("Query", actualQuery);
    assertEquals(
        "class RoomSearchCriteria {\n"
            + "    query: Query\n"
            + "    labels: []\n"
            + "    active: true\n"
            + "    _private: true\n"
            + "    owner: class UserId {\n"
            + "        id: null\n"
            + "    }\n"
            + "    creator: class UserId {\n"
            + "        id: null\n"
            + "    }\n"
            + "    member: class UserId {\n"
            + "        id: null\n"
            + "    }\n"
            + "    sortOrder: BASIC\n"
            + "}",
        actualToStringResult);
    assertNull(actualCreator.getId());
    assertNull(actualMember.getId());
    assertNull(actualOwner.getId());
    assertEquals(SortOrderEnum.BASIC, actualRoomSearchCriteria.getSortOrder());
    assertTrue(actualActive);
    assertTrue(actualPrivate);
    assertTrue(actualLabels.isEmpty());
    assertSame(actualRoomSearchCriteria, actual_privateResult);
    assertSame(actualRoomSearchCriteria, actualActiveResult);
    assertSame(actualRoomSearchCriteria, actualCreatorResult);
    assertSame(actualRoomSearchCriteria, actualLabelsResult);
    assertSame(actualRoomSearchCriteria, actualMemberResult);
    assertSame(actualRoomSearchCriteria, actualOwnerResult);
    assertSame(actualRoomSearchCriteria, actualQueryResult);
    assertSame(actualRoomSearchCriteria, actualSortOrderResult);
    assertSame(creator, actualCreator);
    assertSame(member, actualMember);
    assertSame(owner, actualOwner);
    assertSame(labels, actualLabels);
  }

  /**
   * Test SortOrderEnum {@link SortOrderEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link SortOrderEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test SortOrderEnum fromValue(String); when '42'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortOrderEnum SortOrderEnum.fromValue(String)"})
  void testSortOrderEnumFromValue_when42_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(SortOrderEnum.fromValue("42"));
  }

  /**
   * Test SortOrderEnum {@link SortOrderEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code BASIC}.
   *   <li>Then return {@code BASIC}.
   * </ul>
   *
   * <p>Method under test: {@link SortOrderEnum#fromValue(String)}
   */
  @Test
  @DisplayName("Test SortOrderEnum fromValue(String); when 'BASIC'; then return 'BASIC'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortOrderEnum SortOrderEnum.fromValue(String)"})
  void testSortOrderEnumFromValue_whenBasic_thenReturnBasic() {
    // Arrange, Act and Assert
    assertEquals(SortOrderEnum.BASIC, SortOrderEnum.fromValue("BASIC"));
  }

  /**
   * Test SortOrderEnum getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SortOrderEnum#toString()}
   *   <li>{@link SortOrderEnum#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test SortOrderEnum getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String SortOrderEnum.getValue()", "String SortOrderEnum.toString()"})
  void testSortOrderEnumGettersAndSetters() {
    // Arrange
    SortOrderEnum valueOfResult = SortOrderEnum.valueOf("BASIC");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("BASIC", valueOfResult.getValue());
    assertEquals("BASIC", actualToStringResult);
  }
}
