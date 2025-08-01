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

class V5EventsReadBodyDiffblueTest {
  /**
   * Test {@link V5EventsReadBody#addEventTypesItem(String)}.
   *
   * <ul>
   *   <li>Given {@link V5EventsReadBody} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link V5EventsReadBody#addEventTypesItem(String)}
   */
  @Test
  @DisplayName("Test addEventTypesItem(String); given V5EventsReadBody (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V5EventsReadBody V5EventsReadBody.addEventTypesItem(String)"})
  void testAddEventTypesItem_givenV5EventsReadBody() {
    // Arrange
    V5EventsReadBody v5EventsReadBody = new V5EventsReadBody();

    // Act and Assert
    assertSame(v5EventsReadBody, v5EventsReadBody.addEventTypesItem("Event Types Item"));
  }

  /**
   * Test {@link V5EventsReadBody#addEventTypesItem(String)}.
   *
   * <ul>
   *   <li>Given {@link V5EventsReadBody} (default constructor) eventTypes {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link V5EventsReadBody#addEventTypesItem(String)}
   */
  @Test
  @DisplayName(
      "Test addEventTypesItem(String); given V5EventsReadBody (default constructor) eventTypes ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V5EventsReadBody V5EventsReadBody.addEventTypesItem(String)"})
  void testAddEventTypesItem_givenV5EventsReadBodyEventTypesArrayList() {
    // Arrange
    V5EventsReadBody v5EventsReadBody = new V5EventsReadBody();
    v5EventsReadBody.eventTypes(new ArrayList<>());

    // Act and Assert
    assertSame(v5EventsReadBody, v5EventsReadBody.addEventTypesItem("Event Types Item"));
  }

  /**
   * Test {@link V5EventsReadBody#equals(Object)}, and {@link V5EventsReadBody#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V5EventsReadBody#equals(Object)}
   *   <li>{@link V5EventsReadBody#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V5EventsReadBody.equals(Object)", "int V5EventsReadBody.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V5EventsReadBody v5EventsReadBody = new V5EventsReadBody();
    V5EventsReadBody v5EventsReadBody2 = new V5EventsReadBody();

    // Act and Assert
    assertEquals(v5EventsReadBody, v5EventsReadBody2);
    int expectedHashCodeResult = v5EventsReadBody.hashCode();
    assertEquals(expectedHashCodeResult, v5EventsReadBody2.hashCode());
  }

  /**
   * Test {@link V5EventsReadBody#equals(Object)}, and {@link V5EventsReadBody#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V5EventsReadBody#equals(Object)}
   *   <li>{@link V5EventsReadBody#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V5EventsReadBody.equals(Object)", "int V5EventsReadBody.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V5EventsReadBody v5EventsReadBody = new V5EventsReadBody();

    // Act and Assert
    assertEquals(v5EventsReadBody, v5EventsReadBody);
    int expectedHashCodeResult = v5EventsReadBody.hashCode();
    assertEquals(expectedHashCodeResult, v5EventsReadBody.hashCode());
  }

  /**
   * Test {@link V5EventsReadBody#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V5EventsReadBody#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V5EventsReadBody.equals(Object)", "int V5EventsReadBody.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V5EventsReadBody v5EventsReadBody = new V5EventsReadBody();
    v5EventsReadBody.addEventTypesItem("Event Types Item");

    // Act and Assert
    assertNotEquals(v5EventsReadBody, new V5EventsReadBody());
  }

  /**
   * Test {@link V5EventsReadBody#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V5EventsReadBody#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V5EventsReadBody.equals(Object)", "int V5EventsReadBody.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V5EventsReadBody v5EventsReadBody = new V5EventsReadBody();
    v5EventsReadBody.type("Type");
    v5EventsReadBody.addEventTypesItem("Event Types Item");

    // Act and Assert
    assertNotEquals(v5EventsReadBody, new V5EventsReadBody());
  }

  /**
   * Test {@link V5EventsReadBody#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V5EventsReadBody#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V5EventsReadBody.equals(Object)", "int V5EventsReadBody.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V5EventsReadBody v5EventsReadBody = new V5EventsReadBody();
    v5EventsReadBody.tag("Tag");
    v5EventsReadBody.addEventTypesItem("Event Types Item");

    // Act and Assert
    assertNotEquals(v5EventsReadBody, new V5EventsReadBody());
  }

  /**
   * Test {@link V5EventsReadBody#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V5EventsReadBody#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V5EventsReadBody.equals(Object)", "int V5EventsReadBody.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V5EventsReadBody v5EventsReadBody = new V5EventsReadBody();
    v5EventsReadBody.ackId("42");

    // Act and Assert
    assertNotEquals(v5EventsReadBody, new V5EventsReadBody());
  }

  /**
   * Test {@link V5EventsReadBody#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V5EventsReadBody#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V5EventsReadBody.equals(Object)", "int V5EventsReadBody.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V5EventsReadBody(), null);
  }

  /**
   * Test {@link V5EventsReadBody#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V5EventsReadBody#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V5EventsReadBody.equals(Object)", "int V5EventsReadBody.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V5EventsReadBody(), "Different type to V5EventsReadBody");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V5EventsReadBody}
   *   <li>{@link V5EventsReadBody#ackId(String)}
   *   <li>{@link V5EventsReadBody#eventTypes(List)}
   *   <li>{@link V5EventsReadBody#setAckId(String)}
   *   <li>{@link V5EventsReadBody#setEventTypes(List)}
   *   <li>{@link V5EventsReadBody#setTag(String)}
   *   <li>{@link V5EventsReadBody#setType(String)}
   *   <li>{@link V5EventsReadBody#setUpdatePresence(Boolean)}
   *   <li>{@link V5EventsReadBody#tag(String)}
   *   <li>{@link V5EventsReadBody#type(String)}
   *   <li>{@link V5EventsReadBody#updatePresence(Boolean)}
   *   <li>{@link V5EventsReadBody#toString()}
   *   <li>{@link V5EventsReadBody#getAckId()}
   *   <li>{@link V5EventsReadBody#getEventTypes()}
   *   <li>{@link V5EventsReadBody#getTag()}
   *   <li>{@link V5EventsReadBody#getType()}
   *   <li>{@link V5EventsReadBody#getUpdatePresence()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V5EventsReadBody.<init>()",
    "V5EventsReadBody V5EventsReadBody.ackId(String)",
    "V5EventsReadBody V5EventsReadBody.eventTypes(List)",
    "String V5EventsReadBody.getAckId()",
    "List V5EventsReadBody.getEventTypes()",
    "String V5EventsReadBody.getTag()",
    "String V5EventsReadBody.getType()",
    "Boolean V5EventsReadBody.getUpdatePresence()",
    "void V5EventsReadBody.setAckId(String)",
    "void V5EventsReadBody.setEventTypes(List)",
    "void V5EventsReadBody.setTag(String)",
    "void V5EventsReadBody.setType(String)",
    "void V5EventsReadBody.setUpdatePresence(Boolean)",
    "V5EventsReadBody V5EventsReadBody.tag(String)",
    "String V5EventsReadBody.toString()",
    "V5EventsReadBody V5EventsReadBody.type(String)",
    "V5EventsReadBody V5EventsReadBody.updatePresence(Boolean)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V5EventsReadBody actualV5EventsReadBody = new V5EventsReadBody();
    V5EventsReadBody actualAckIdResult = actualV5EventsReadBody.ackId("42");
    V5EventsReadBody actualEventTypesResult = actualV5EventsReadBody.eventTypes(new ArrayList<>());
    actualV5EventsReadBody.setAckId("42");
    ArrayList<String> eventTypes = new ArrayList<>();
    actualV5EventsReadBody.setEventTypes(eventTypes);
    actualV5EventsReadBody.setTag("Tag");
    actualV5EventsReadBody.setType("Type");
    actualV5EventsReadBody.setUpdatePresence(true);
    V5EventsReadBody actualTagResult = actualV5EventsReadBody.tag("Tag");
    V5EventsReadBody actualTypeResult = actualV5EventsReadBody.type("Type");
    V5EventsReadBody actualUpdatePresenceResult = actualV5EventsReadBody.updatePresence(true);
    String actualToStringResult = actualV5EventsReadBody.toString();
    String actualAckId = actualV5EventsReadBody.getAckId();
    List<String> actualEventTypes = actualV5EventsReadBody.getEventTypes();
    String actualTag = actualV5EventsReadBody.getTag();
    String actualType = actualV5EventsReadBody.getType();

    // Assert
    assertEquals("42", actualAckId);
    assertEquals("Tag", actualTag);
    assertEquals("Type", actualType);
    assertEquals(
        "class V5EventsReadBody {\n"
            + "    type: Type\n"
            + "    tag: Tag\n"
            + "    eventTypes: []\n"
            + "    ackId: 42\n"
            + "    updatePresence: true\n"
            + "}",
        actualToStringResult);
    assertTrue(actualV5EventsReadBody.getUpdatePresence());
    assertTrue(actualEventTypes.isEmpty());
    assertSame(actualV5EventsReadBody, actualAckIdResult);
    assertSame(actualV5EventsReadBody, actualEventTypesResult);
    assertSame(actualV5EventsReadBody, actualTagResult);
    assertSame(actualV5EventsReadBody, actualTypeResult);
    assertSame(actualV5EventsReadBody, actualUpdatePresenceResult);
    assertSame(eventTypes, actualEventTypes);
  }
}
