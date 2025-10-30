package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V4GenericSystemEventDiffblueTest {
  /**
   * Test {@link V4GenericSystemEvent#putParametersItem(String, Object)}.
   * <ul>
   *   <li>Given {@link V4GenericSystemEvent} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link V4GenericSystemEvent#putParametersItem(String, Object)}
   */
  @Test
  @DisplayName("Test putParametersItem(String, Object); given V4GenericSystemEvent (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V4GenericSystemEvent V4GenericSystemEvent.putParametersItem(String, Object)"})
  void testPutParametersItem_givenV4GenericSystemEvent() {
    // Arrange
    V4GenericSystemEvent v4GenericSystemEvent = new V4GenericSystemEvent();

    // Act and Assert
    assertSame(v4GenericSystemEvent, v4GenericSystemEvent.putParametersItem("Key", "Parameters Item"));
  }

  /**
   * Test {@link V4GenericSystemEvent#putParametersItem(String, Object)}.
   * <ul>
   *   <li>Given {@link V4GenericSystemEvent} (default constructor) parameters {@link HashMap#HashMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4GenericSystemEvent#putParametersItem(String, Object)}
   */
  @Test
  @DisplayName("Test putParametersItem(String, Object); given V4GenericSystemEvent (default constructor) parameters HashMap()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V4GenericSystemEvent V4GenericSystemEvent.putParametersItem(String, Object)"})
  void testPutParametersItem_givenV4GenericSystemEventParametersHashMap() {
    // Arrange
    V4GenericSystemEvent v4GenericSystemEvent = new V4GenericSystemEvent();
    v4GenericSystemEvent.parameters(new HashMap<>());

    // Act and Assert
    assertSame(v4GenericSystemEvent, v4GenericSystemEvent.putParametersItem("Key", "Parameters Item"));
  }

  /**
   * Test {@link V4GenericSystemEvent#equals(Object)}, and {@link V4GenericSystemEvent#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4GenericSystemEvent#equals(Object)}
   *   <li>{@link V4GenericSystemEvent#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4GenericSystemEvent.equals(Object)", "int V4GenericSystemEvent.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4GenericSystemEvent v4GenericSystemEvent = new V4GenericSystemEvent();
    V4GenericSystemEvent v4GenericSystemEvent2 = new V4GenericSystemEvent();

    // Act and Assert
    assertEquals(v4GenericSystemEvent, v4GenericSystemEvent2);
    int expectedHashCodeResult = v4GenericSystemEvent.hashCode();
    assertEquals(expectedHashCodeResult, v4GenericSystemEvent2.hashCode());
  }

  /**
   * Test {@link V4GenericSystemEvent#equals(Object)}, and {@link V4GenericSystemEvent#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4GenericSystemEvent#equals(Object)}
   *   <li>{@link V4GenericSystemEvent#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4GenericSystemEvent.equals(Object)", "int V4GenericSystemEvent.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4GenericSystemEvent v4GenericSystemEvent = new V4GenericSystemEvent();

    // Act and Assert
    assertEquals(v4GenericSystemEvent, v4GenericSystemEvent);
    int expectedHashCodeResult = v4GenericSystemEvent.hashCode();
    assertEquals(expectedHashCodeResult, v4GenericSystemEvent.hashCode());
  }

  /**
   * Test {@link V4GenericSystemEvent#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4GenericSystemEvent#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4GenericSystemEvent.equals(Object)", "int V4GenericSystemEvent.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V4GenericSystemEvent v4GenericSystemEvent = new V4GenericSystemEvent();
    v4GenericSystemEvent.putParametersItem("Key", "Parameters Item");

    // Act and Assert
    assertNotEquals(v4GenericSystemEvent, new V4GenericSystemEvent());
  }

  /**
   * Test {@link V4GenericSystemEvent#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4GenericSystemEvent#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4GenericSystemEvent.equals(Object)", "int V4GenericSystemEvent.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V4GenericSystemEvent v4GenericSystemEvent = new V4GenericSystemEvent();
    v4GenericSystemEvent.stream(new V4Stream());
    v4GenericSystemEvent.putParametersItem("Key", "Parameters Item");

    // Act and Assert
    assertNotEquals(v4GenericSystemEvent, new V4GenericSystemEvent());
  }

  /**
   * Test {@link V4GenericSystemEvent#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4GenericSystemEvent#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4GenericSystemEvent.equals(Object)", "int V4GenericSystemEvent.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V4GenericSystemEvent v4GenericSystemEvent = new V4GenericSystemEvent();
    v4GenericSystemEvent.eventTimestamp(1L);
    v4GenericSystemEvent.putParametersItem("Key", "Parameters Item");

    // Act and Assert
    assertNotEquals(v4GenericSystemEvent, new V4GenericSystemEvent());
  }

  /**
   * Test {@link V4GenericSystemEvent#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4GenericSystemEvent#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4GenericSystemEvent.equals(Object)", "int V4GenericSystemEvent.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V4GenericSystemEvent v4GenericSystemEvent = new V4GenericSystemEvent();
    v4GenericSystemEvent.sourceSystem("Source System");
    v4GenericSystemEvent.putParametersItem("Key", "Parameters Item");

    // Act and Assert
    assertNotEquals(v4GenericSystemEvent, new V4GenericSystemEvent());
  }

  /**
   * Test {@link V4GenericSystemEvent#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4GenericSystemEvent#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4GenericSystemEvent.equals(Object)", "int V4GenericSystemEvent.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V4GenericSystemEvent v4GenericSystemEvent = new V4GenericSystemEvent();
    v4GenericSystemEvent.eventSubtype("Event Subtype");
    v4GenericSystemEvent.putParametersItem("Key", "Parameters Item");

    // Act and Assert
    assertNotEquals(v4GenericSystemEvent, new V4GenericSystemEvent());
  }

  /**
   * Test {@link V4GenericSystemEvent#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4GenericSystemEvent#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4GenericSystemEvent.equals(Object)", "int V4GenericSystemEvent.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4GenericSystemEvent(), null);
  }

  /**
   * Test {@link V4GenericSystemEvent#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4GenericSystemEvent#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4GenericSystemEvent.equals(Object)", "int V4GenericSystemEvent.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4GenericSystemEvent(), "Different type to V4GenericSystemEvent");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V4GenericSystemEvent}
   *   <li>{@link V4GenericSystemEvent#eventSubtype(String)}
   *   <li>{@link V4GenericSystemEvent#eventTimestamp(Long)}
   *   <li>{@link V4GenericSystemEvent#parameters(Map)}
   *   <li>{@link V4GenericSystemEvent#setEventSubtype(String)}
   *   <li>{@link V4GenericSystemEvent#setEventTimestamp(Long)}
   *   <li>{@link V4GenericSystemEvent#setParameters(Map)}
   *   <li>{@link V4GenericSystemEvent#setSourceSystem(String)}
   *   <li>{@link V4GenericSystemEvent#setStream(V4Stream)}
   *   <li>{@link V4GenericSystemEvent#sourceSystem(String)}
   *   <li>{@link V4GenericSystemEvent#stream(V4Stream)}
   *   <li>{@link V4GenericSystemEvent#toString()}
   *   <li>{@link V4GenericSystemEvent#getEventSubtype()}
   *   <li>{@link V4GenericSystemEvent#getEventTimestamp()}
   *   <li>{@link V4GenericSystemEvent#getParameters()}
   *   <li>{@link V4GenericSystemEvent#getSourceSystem()}
   *   <li>{@link V4GenericSystemEvent#getStream()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V4GenericSystemEvent.<init>()",
      "V4GenericSystemEvent V4GenericSystemEvent.eventSubtype(String)",
      "V4GenericSystemEvent V4GenericSystemEvent.eventTimestamp(Long)", "String V4GenericSystemEvent.getEventSubtype()",
      "Long V4GenericSystemEvent.getEventTimestamp()", "Map V4GenericSystemEvent.getParameters()",
      "String V4GenericSystemEvent.getSourceSystem()", "V4Stream V4GenericSystemEvent.getStream()",
      "V4GenericSystemEvent V4GenericSystemEvent.parameters(Map)", "void V4GenericSystemEvent.setEventSubtype(String)",
      "void V4GenericSystemEvent.setEventTimestamp(Long)", "void V4GenericSystemEvent.setParameters(Map)",
      "void V4GenericSystemEvent.setSourceSystem(String)", "void V4GenericSystemEvent.setStream(V4Stream)",
      "V4GenericSystemEvent V4GenericSystemEvent.sourceSystem(String)",
      "V4GenericSystemEvent V4GenericSystemEvent.stream(V4Stream)", "String V4GenericSystemEvent.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    V4GenericSystemEvent actualV4GenericSystemEvent = new V4GenericSystemEvent();
    V4GenericSystemEvent actualEventSubtypeResult = actualV4GenericSystemEvent.eventSubtype("Event Subtype");
    V4GenericSystemEvent actualEventTimestampResult = actualV4GenericSystemEvent.eventTimestamp(1L);
    V4GenericSystemEvent actualParametersResult = actualV4GenericSystemEvent.parameters(new HashMap<>());
    actualV4GenericSystemEvent.setEventSubtype("Event Subtype");
    actualV4GenericSystemEvent.setEventTimestamp(1L);
    HashMap<String, Object> parameters = new HashMap<>();
    actualV4GenericSystemEvent.setParameters(parameters);
    actualV4GenericSystemEvent.setSourceSystem("Source System");
    actualV4GenericSystemEvent.setStream(new V4Stream());
    V4GenericSystemEvent actualSourceSystemResult = actualV4GenericSystemEvent.sourceSystem("Source System");
    V4Stream stream = new V4Stream();
    V4GenericSystemEvent actualStreamResult = actualV4GenericSystemEvent.stream(stream);
    String actualToStringResult = actualV4GenericSystemEvent.toString();
    String actualEventSubtype = actualV4GenericSystemEvent.getEventSubtype();
    Long actualEventTimestamp = actualV4GenericSystemEvent.getEventTimestamp();
    Map<String, Object> actualParameters = actualV4GenericSystemEvent.getParameters();
    String actualSourceSystem = actualV4GenericSystemEvent.getSourceSystem();
    V4Stream actualStream = actualV4GenericSystemEvent.getStream();

    // Assert
    assertEquals("Event Subtype", actualEventSubtype);
    assertEquals("Source System", actualSourceSystem);
    assertEquals("class V4GenericSystemEvent {\n" + "    stream: class V4Stream {\n" + "        streamId: null\n"
        + "        streamType: null\n" + "        roomName: null\n" + "        members: null\n"
        + "        external: null\n" + "        crossPod: null\n" + "        recipientTenantIds: null\n" + "    }\n"
        + "    eventTimestamp: 1\n" + "    sourceSystem: Source System\n" + "    eventSubtype: Event Subtype\n"
        + "    parameters: {}\n" + "}", actualToStringResult);
    assertEquals(1L, actualEventTimestamp.longValue());
    assertTrue(actualParameters.isEmpty());
    assertSame(actualV4GenericSystemEvent, actualEventSubtypeResult);
    assertSame(actualV4GenericSystemEvent, actualEventTimestampResult);
    assertSame(actualV4GenericSystemEvent, actualParametersResult);
    assertSame(actualV4GenericSystemEvent, actualSourceSystemResult);
    assertSame(actualV4GenericSystemEvent, actualStreamResult);
    assertSame(stream, actualStream);
    assertSame(parameters, actualParameters);
  }
}
