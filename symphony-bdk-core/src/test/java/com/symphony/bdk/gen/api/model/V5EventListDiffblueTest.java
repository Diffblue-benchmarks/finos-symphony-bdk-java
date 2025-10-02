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

class V5EventListDiffblueTest {
  /**
   * Test {@link V5EventList#addEventsItem(V4Event)}.
   *
   * <ul>
   *   <li>Given {@link V5EventList} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link V5EventList#addEventsItem(V4Event)}
   */
  @Test
  @DisplayName("Test addEventsItem(V4Event); given V5EventList (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V5EventList V5EventList.addEventsItem(V4Event)"})
  void testAddEventsItem_givenV5EventList() {
    // Arrange
    V5EventList v5EventList = new V5EventList();

    // Act
    V5EventList actualAddEventsItemResult = v5EventList.addEventsItem(new V4Event());

    // Assert
    assertSame(v5EventList, actualAddEventsItemResult);
  }

  /**
   * Test {@link V5EventList#addEventsItem(V4Event)}.
   *
   * <ul>
   *   <li>Given {@link V5EventList} (default constructor) events {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link V5EventList#addEventsItem(V4Event)}
   */
  @Test
  @DisplayName(
      "Test addEventsItem(V4Event); given V5EventList (default constructor) events ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V5EventList V5EventList.addEventsItem(V4Event)"})
  void testAddEventsItem_givenV5EventListEventsArrayList() {
    // Arrange
    V5EventList v5EventList = new V5EventList();
    v5EventList.events(new ArrayList<>());

    // Act
    V5EventList actualAddEventsItemResult = v5EventList.addEventsItem(new V4Event());

    // Assert
    assertSame(v5EventList, actualAddEventsItemResult);
  }

  /**
   * Test {@link V5EventList#equals(Object)}, and {@link V5EventList#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V5EventList#equals(Object)}
   *   <li>{@link V5EventList#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V5EventList.equals(Object)", "int V5EventList.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V5EventList v5EventList = new V5EventList();
    V5EventList v5EventList2 = new V5EventList();

    // Act and Assert
    assertEquals(v5EventList, v5EventList2);
    assertEquals(v5EventList.hashCode(), v5EventList2.hashCode());
  }

  /**
   * Test {@link V5EventList#equals(Object)}, and {@link V5EventList#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V5EventList#equals(Object)}
   *   <li>{@link V5EventList#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V5EventList.equals(Object)", "int V5EventList.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V5EventList v5EventList = new V5EventList();

    // Act and Assert
    assertEquals(v5EventList, v5EventList);
    int expectedHashCodeResult = v5EventList.hashCode();
    assertEquals(expectedHashCodeResult, v5EventList.hashCode());
  }

  /**
   * Test {@link V5EventList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V5EventList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V5EventList.equals(Object)", "int V5EventList.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V5EventList v5EventList = new V5EventList();
    v5EventList.addEventsItem(new V4Event());

    // Act and Assert
    assertNotEquals(v5EventList, new V5EventList());
  }

  /**
   * Test {@link V5EventList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V5EventList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V5EventList.equals(Object)", "int V5EventList.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V5EventList v5EventList = new V5EventList();
    v5EventList.ackId("42");

    // Act and Assert
    assertNotEquals(v5EventList, new V5EventList());
  }

  /**
   * Test {@link V5EventList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V5EventList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V5EventList.equals(Object)", "int V5EventList.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V5EventList(), null);
  }

  /**
   * Test {@link V5EventList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V5EventList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V5EventList.equals(Object)", "int V5EventList.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V5EventList(), "Different type to V5EventList");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V5EventList}
   *   <li>{@link V5EventList#ackId(String)}
   *   <li>{@link V5EventList#events(List)}
   *   <li>{@link V5EventList#setAckId(String)}
   *   <li>{@link V5EventList#setEvents(List)}
   *   <li>{@link V5EventList#toString()}
   *   <li>{@link V5EventList#getAckId()}
   *   <li>{@link V5EventList#getEvents()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V5EventList.<init>()",
    "V5EventList V5EventList.ackId(String)",
    "V5EventList V5EventList.events(List)",
    "String V5EventList.getAckId()",
    "List V5EventList.getEvents()",
    "void V5EventList.setAckId(String)",
    "void V5EventList.setEvents(List)",
    "String V5EventList.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V5EventList actualV5EventList = new V5EventList();
    V5EventList actualAckIdResult = actualV5EventList.ackId("42");
    V5EventList actualEventsResult = actualV5EventList.events(new ArrayList<>());
    actualV5EventList.setAckId("42");
    ArrayList<V4Event> events = new ArrayList<>();
    actualV5EventList.setEvents(events);
    String actualToStringResult = actualV5EventList.toString();
    String actualAckId = actualV5EventList.getAckId();
    List<V4Event> actualEvents = actualV5EventList.getEvents();

    // Assert
    assertEquals("42", actualAckId);
    assertEquals("class V5EventList {\n    events: []\n    ackId: 42\n}", actualToStringResult);
    assertTrue(actualEvents.isEmpty());
    assertSame(actualV5EventList, actualAckIdResult);
    assertSame(actualV5EventList, actualEventsResult);
    assertSame(events, actualEvents);
  }
}
