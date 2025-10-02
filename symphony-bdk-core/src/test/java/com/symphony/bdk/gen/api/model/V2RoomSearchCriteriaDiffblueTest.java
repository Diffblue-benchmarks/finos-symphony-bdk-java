package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.V2RoomSearchCriteria.SortOrderEnum;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V2RoomSearchCriteriaDiffblueTest {
  /**
   * Test {@link V2RoomSearchCriteria#addLabelsItem(String)}.
   *
   * <ul>
   *   <li>Given {@link V2RoomSearchCriteria} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link V2RoomSearchCriteria#addLabelsItem(String)}
   */
  @Test
  @DisplayName("Test addLabelsItem(String); given V2RoomSearchCriteria (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2RoomSearchCriteria V2RoomSearchCriteria.addLabelsItem(String)"})
  void testAddLabelsItem_givenV2RoomSearchCriteria() {
    // Arrange
    V2RoomSearchCriteria v2RoomSearchCriteria = new V2RoomSearchCriteria();

    // Act
    V2RoomSearchCriteria actualAddLabelsItemResult =
        v2RoomSearchCriteria.addLabelsItem("Labels Item");

    // Assert
    assertSame(v2RoomSearchCriteria, actualAddLabelsItemResult);
  }

  /**
   * Test {@link V2RoomSearchCriteria#addLabelsItem(String)}.
   *
   * <ul>
   *   <li>Given {@link V2RoomSearchCriteria} (default constructor) labels {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link V2RoomSearchCriteria#addLabelsItem(String)}
   */
  @Test
  @DisplayName(
      "Test addLabelsItem(String); given V2RoomSearchCriteria (default constructor) labels ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2RoomSearchCriteria V2RoomSearchCriteria.addLabelsItem(String)"})
  void testAddLabelsItem_givenV2RoomSearchCriteriaLabelsArrayList() {
    // Arrange
    V2RoomSearchCriteria v2RoomSearchCriteria = new V2RoomSearchCriteria();
    v2RoomSearchCriteria.labels(new ArrayList<>());

    // Act
    V2RoomSearchCriteria actualAddLabelsItemResult =
        v2RoomSearchCriteria.addLabelsItem("Labels Item");

    // Assert
    assertSame(v2RoomSearchCriteria, actualAddLabelsItemResult);
  }

  /**
   * Test {@link V2RoomSearchCriteria#equals(Object)}, and {@link V2RoomSearchCriteria#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2RoomSearchCriteria#equals(Object)}
   *   <li>{@link V2RoomSearchCriteria#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2RoomSearchCriteria.equals(Object)",
    "int V2RoomSearchCriteria.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2RoomSearchCriteria v2RoomSearchCriteria = new V2RoomSearchCriteria();
    V2RoomSearchCriteria v2RoomSearchCriteria2 = new V2RoomSearchCriteria();

    // Act and Assert
    assertEquals(v2RoomSearchCriteria, v2RoomSearchCriteria2);
    assertEquals(v2RoomSearchCriteria.hashCode(), v2RoomSearchCriteria2.hashCode());
  }

  /**
   * Test {@link V2RoomSearchCriteria#equals(Object)}, and {@link V2RoomSearchCriteria#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2RoomSearchCriteria#equals(Object)}
   *   <li>{@link V2RoomSearchCriteria#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2RoomSearchCriteria.equals(Object)",
    "int V2RoomSearchCriteria.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2RoomSearchCriteria v2RoomSearchCriteria = new V2RoomSearchCriteria();

    // Act and Assert
    assertEquals(v2RoomSearchCriteria, v2RoomSearchCriteria);
    int expectedHashCodeResult = v2RoomSearchCriteria.hashCode();
    assertEquals(expectedHashCodeResult, v2RoomSearchCriteria.hashCode());
  }

  /**
   * Test {@link V2RoomSearchCriteria#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2RoomSearchCriteria#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2RoomSearchCriteria.equals(Object)",
    "int V2RoomSearchCriteria.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V2RoomSearchCriteria v2RoomSearchCriteria = new V2RoomSearchCriteria();
    v2RoomSearchCriteria.addLabelsItem("Labels Item");

    // Act and Assert
    assertNotEquals(v2RoomSearchCriteria, new V2RoomSearchCriteria());
  }

  /**
   * Test {@link V2RoomSearchCriteria#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2RoomSearchCriteria#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2RoomSearchCriteria.equals(Object)",
    "int V2RoomSearchCriteria.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V2RoomSearchCriteria v2RoomSearchCriteria = new V2RoomSearchCriteria();
    v2RoomSearchCriteria.query("Query");
    v2RoomSearchCriteria.addLabelsItem("Labels Item");

    // Act and Assert
    assertNotEquals(v2RoomSearchCriteria, new V2RoomSearchCriteria());
  }

  /**
   * Test {@link V2RoomSearchCriteria#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2RoomSearchCriteria#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2RoomSearchCriteria.equals(Object)",
    "int V2RoomSearchCriteria.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V2RoomSearchCriteria v2RoomSearchCriteria = new V2RoomSearchCriteria();
    v2RoomSearchCriteria.active(true);

    // Act and Assert
    assertNotEquals(v2RoomSearchCriteria, new V2RoomSearchCriteria());
  }

  /**
   * Test {@link V2RoomSearchCriteria#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2RoomSearchCriteria#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2RoomSearchCriteria.equals(Object)",
    "int V2RoomSearchCriteria.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V2RoomSearchCriteria v2RoomSearchCriteria = new V2RoomSearchCriteria();
    v2RoomSearchCriteria._private(true);

    // Act and Assert
    assertNotEquals(v2RoomSearchCriteria, new V2RoomSearchCriteria());
  }

  /**
   * Test {@link V2RoomSearchCriteria#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2RoomSearchCriteria#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2RoomSearchCriteria.equals(Object)",
    "int V2RoomSearchCriteria.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V2RoomSearchCriteria v2RoomSearchCriteria = new V2RoomSearchCriteria();
    v2RoomSearchCriteria.owner(new UserId());

    // Act and Assert
    assertNotEquals(v2RoomSearchCriteria, new V2RoomSearchCriteria());
  }

  /**
   * Test {@link V2RoomSearchCriteria#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2RoomSearchCriteria#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2RoomSearchCriteria.equals(Object)",
    "int V2RoomSearchCriteria.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    V2RoomSearchCriteria v2RoomSearchCriteria = new V2RoomSearchCriteria();
    v2RoomSearchCriteria.creator(new UserId());

    // Act and Assert
    assertNotEquals(v2RoomSearchCriteria, new V2RoomSearchCriteria());
  }

  /**
   * Test {@link V2RoomSearchCriteria#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2RoomSearchCriteria#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2RoomSearchCriteria.equals(Object)",
    "int V2RoomSearchCriteria.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    V2RoomSearchCriteria v2RoomSearchCriteria = new V2RoomSearchCriteria();
    v2RoomSearchCriteria.member(new UserId());

    // Act and Assert
    assertNotEquals(v2RoomSearchCriteria, new V2RoomSearchCriteria());
  }

  /**
   * Test {@link V2RoomSearchCriteria#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2RoomSearchCriteria#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2RoomSearchCriteria.equals(Object)",
    "int V2RoomSearchCriteria.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    V2RoomSearchCriteria v2RoomSearchCriteria = new V2RoomSearchCriteria();
    v2RoomSearchCriteria.sortOrder(SortOrderEnum.BASIC);

    // Act and Assert
    assertNotEquals(v2RoomSearchCriteria, new V2RoomSearchCriteria());
  }

  /**
   * Test {@link V2RoomSearchCriteria#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2RoomSearchCriteria#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2RoomSearchCriteria.equals(Object)",
    "int V2RoomSearchCriteria.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    V2RoomSearchCriteria v2RoomSearchCriteria = new V2RoomSearchCriteria();
    v2RoomSearchCriteria.subType("Sub Type");

    // Act and Assert
    assertNotEquals(v2RoomSearchCriteria, new V2RoomSearchCriteria());
  }

  /**
   * Test {@link V2RoomSearchCriteria#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2RoomSearchCriteria#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2RoomSearchCriteria.equals(Object)",
    "int V2RoomSearchCriteria.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2RoomSearchCriteria(), null);
  }

  /**
   * Test {@link V2RoomSearchCriteria#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2RoomSearchCriteria#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2RoomSearchCriteria.equals(Object)",
    "int V2RoomSearchCriteria.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2RoomSearchCriteria(), "Different type to V2RoomSearchCriteria");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V2RoomSearchCriteria}
   *   <li>{@link V2RoomSearchCriteria#_private(Boolean)}
   *   <li>{@link V2RoomSearchCriteria#active(Boolean)}
   *   <li>{@link V2RoomSearchCriteria#creator(UserId)}
   *   <li>{@link V2RoomSearchCriteria#labels(List)}
   *   <li>{@link V2RoomSearchCriteria#member(UserId)}
   *   <li>{@link V2RoomSearchCriteria#owner(UserId)}
   *   <li>{@link V2RoomSearchCriteria#query(String)}
   *   <li>{@link V2RoomSearchCriteria#setActive(Boolean)}
   *   <li>{@link V2RoomSearchCriteria#setCreator(UserId)}
   *   <li>{@link V2RoomSearchCriteria#setLabels(List)}
   *   <li>{@link V2RoomSearchCriteria#setMember(UserId)}
   *   <li>{@link V2RoomSearchCriteria#setOwner(UserId)}
   *   <li>{@link V2RoomSearchCriteria#setPrivate(Boolean)}
   *   <li>{@link V2RoomSearchCriteria#setQuery(String)}
   *   <li>{@link V2RoomSearchCriteria#setSortOrder(SortOrderEnum)}
   *   <li>{@link V2RoomSearchCriteria#setSubType(String)}
   *   <li>{@link V2RoomSearchCriteria#sortOrder(SortOrderEnum)}
   *   <li>{@link V2RoomSearchCriteria#subType(String)}
   *   <li>{@link V2RoomSearchCriteria#toString()}
   *   <li>{@link V2RoomSearchCriteria#getActive()}
   *   <li>{@link V2RoomSearchCriteria#getCreator()}
   *   <li>{@link V2RoomSearchCriteria#getLabels()}
   *   <li>{@link V2RoomSearchCriteria#getMember()}
   *   <li>{@link V2RoomSearchCriteria#getOwner()}
   *   <li>{@link V2RoomSearchCriteria#getPrivate()}
   *   <li>{@link V2RoomSearchCriteria#getQuery()}
   *   <li>{@link V2RoomSearchCriteria#getSortOrder()}
   *   <li>{@link V2RoomSearchCriteria#getSubType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V2RoomSearchCriteria.<init>()",
    "V2RoomSearchCriteria V2RoomSearchCriteria._private(Boolean)",
    "V2RoomSearchCriteria V2RoomSearchCriteria.active(Boolean)",
    "V2RoomSearchCriteria V2RoomSearchCriteria.creator(UserId)",
    "Boolean V2RoomSearchCriteria.getActive()",
    "UserId V2RoomSearchCriteria.getCreator()",
    "List V2RoomSearchCriteria.getLabels()",
    "UserId V2RoomSearchCriteria.getMember()",
    "UserId V2RoomSearchCriteria.getOwner()",
    "Boolean V2RoomSearchCriteria.getPrivate()",
    "String V2RoomSearchCriteria.getQuery()",
    "SortOrderEnum V2RoomSearchCriteria.getSortOrder()",
    "String V2RoomSearchCriteria.getSubType()",
    "V2RoomSearchCriteria V2RoomSearchCriteria.labels(List)",
    "V2RoomSearchCriteria V2RoomSearchCriteria.member(UserId)",
    "V2RoomSearchCriteria V2RoomSearchCriteria.owner(UserId)",
    "V2RoomSearchCriteria V2RoomSearchCriteria.query(String)",
    "void V2RoomSearchCriteria.setActive(Boolean)",
    "void V2RoomSearchCriteria.setCreator(UserId)",
    "void V2RoomSearchCriteria.setLabels(List)",
    "void V2RoomSearchCriteria.setMember(UserId)",
    "void V2RoomSearchCriteria.setOwner(UserId)",
    "void V2RoomSearchCriteria.setPrivate(Boolean)",
    "void V2RoomSearchCriteria.setQuery(String)",
    "void V2RoomSearchCriteria.setSortOrder(SortOrderEnum)",
    "void V2RoomSearchCriteria.setSubType(String)",
    "V2RoomSearchCriteria V2RoomSearchCriteria.sortOrder(SortOrderEnum)",
    "V2RoomSearchCriteria V2RoomSearchCriteria.subType(String)",
    "String V2RoomSearchCriteria.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V2RoomSearchCriteria actualV2RoomSearchCriteria = new V2RoomSearchCriteria();
    V2RoomSearchCriteria actual_privateResult = actualV2RoomSearchCriteria._private(true);
    V2RoomSearchCriteria actualActiveResult = actualV2RoomSearchCriteria.active(true);
    V2RoomSearchCriteria actualCreatorResult = actualV2RoomSearchCriteria.creator(new UserId());
    V2RoomSearchCriteria actualLabelsResult = actualV2RoomSearchCriteria.labels(new ArrayList<>());
    V2RoomSearchCriteria actualMemberResult = actualV2RoomSearchCriteria.member(new UserId());
    V2RoomSearchCriteria actualOwnerResult = actualV2RoomSearchCriteria.owner(new UserId());
    V2RoomSearchCriteria actualQueryResult = actualV2RoomSearchCriteria.query("Query");
    actualV2RoomSearchCriteria.setActive(true);
    UserId creator = new UserId();
    actualV2RoomSearchCriteria.setCreator(creator);
    ArrayList<String> labels = new ArrayList<>();
    actualV2RoomSearchCriteria.setLabels(labels);
    UserId member = new UserId();
    actualV2RoomSearchCriteria.setMember(member);
    UserId owner = new UserId();
    actualV2RoomSearchCriteria.setOwner(owner);
    actualV2RoomSearchCriteria.setPrivate(true);
    actualV2RoomSearchCriteria.setQuery("Query");
    actualV2RoomSearchCriteria.setSortOrder(SortOrderEnum.BASIC);
    actualV2RoomSearchCriteria.setSubType("Sub Type");
    V2RoomSearchCriteria actualSortOrderResult =
        actualV2RoomSearchCriteria.sortOrder(SortOrderEnum.BASIC);
    V2RoomSearchCriteria actualSubTypeResult = actualV2RoomSearchCriteria.subType("Sub Type");
    String actualToStringResult = actualV2RoomSearchCriteria.toString();
    Boolean actualActive = actualV2RoomSearchCriteria.getActive();
    UserId actualCreator = actualV2RoomSearchCriteria.getCreator();
    List<String> actualLabels = actualV2RoomSearchCriteria.getLabels();
    UserId actualMember = actualV2RoomSearchCriteria.getMember();
    UserId actualOwner = actualV2RoomSearchCriteria.getOwner();
    Boolean actualPrivate = actualV2RoomSearchCriteria.getPrivate();
    String actualQuery = actualV2RoomSearchCriteria.getQuery();
    SortOrderEnum actualSortOrder = actualV2RoomSearchCriteria.getSortOrder();

    // Assert
    assertEquals("Query", actualQuery);
    assertEquals("Sub Type", actualV2RoomSearchCriteria.getSubType());
    assertEquals(
        "class V2RoomSearchCriteria {\n"
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
            + "    subType: Sub Type\n"
            + "}",
        actualToStringResult);
    assertNull(actualCreator.getId());
    assertNull(actualMember.getId());
    assertNull(actualOwner.getId());
    assertEquals(SortOrderEnum.BASIC, actualSortOrder);
    assertTrue(actualActive);
    assertTrue(actualPrivate);
    assertTrue(actualLabels.isEmpty());
    assertSame(creator, actualCreator);
    assertSame(member, actualMember);
    assertSame(owner, actualOwner);
    assertSame(actualV2RoomSearchCriteria, actual_privateResult);
    assertSame(actualV2RoomSearchCriteria, actualActiveResult);
    assertSame(actualV2RoomSearchCriteria, actualCreatorResult);
    assertSame(actualV2RoomSearchCriteria, actualLabelsResult);
    assertSame(actualV2RoomSearchCriteria, actualMemberResult);
    assertSame(actualV2RoomSearchCriteria, actualOwnerResult);
    assertSame(actualV2RoomSearchCriteria, actualQueryResult);
    assertSame(actualV2RoomSearchCriteria, actualSortOrderResult);
    assertSame(actualV2RoomSearchCriteria, actualSubTypeResult);
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
