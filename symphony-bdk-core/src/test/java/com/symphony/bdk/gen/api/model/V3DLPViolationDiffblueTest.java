package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V3DLPViolationDiffblueTest {
  /**
   * Test {@link V3DLPViolation#addDetailsItem(Object)}.
   * <ul>
   *   <li>Given {@link V3DLPViolation} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link V3DLPViolation#addDetailsItem(Object)}
   */
  @Test
  @DisplayName("Test addDetailsItem(Object); given V3DLPViolation (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V3DLPViolation V3DLPViolation.addDetailsItem(Object)"})
  void testAddDetailsItem_givenV3DLPViolation() {
    // Arrange
    V3DLPViolation v3dlpViolation = new V3DLPViolation();

    // Act and Assert
    assertSame(v3dlpViolation, v3dlpViolation.addDetailsItem("Details Item"));
  }

  /**
   * Test {@link V3DLPViolation#addDetailsItem(Object)}.
   * <ul>
   *   <li>Given {@link V3DLPViolation} (default constructor) details {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3DLPViolation#addDetailsItem(Object)}
   */
  @Test
  @DisplayName("Test addDetailsItem(Object); given V3DLPViolation (default constructor) details ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V3DLPViolation V3DLPViolation.addDetailsItem(Object)"})
  void testAddDetailsItem_givenV3DLPViolationDetailsArrayList() {
    // Arrange
    V3DLPViolation v3dlpViolation = new V3DLPViolation();
    v3dlpViolation.details(new ArrayList<>());

    // Act and Assert
    assertSame(v3dlpViolation, v3dlpViolation.addDetailsItem("Details Item"));
  }

  /**
   * Test {@link V3DLPViolation#equals(Object)}, and {@link V3DLPViolation#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V3DLPViolation#equals(Object)}
   *   <li>{@link V3DLPViolation#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPViolation.equals(Object)", "int V3DLPViolation.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V3DLPViolation v3dlpViolation = new V3DLPViolation();
    V3DLPViolation v3dlpViolation2 = new V3DLPViolation();

    // Act and Assert
    assertEquals(v3dlpViolation, v3dlpViolation2);
    int expectedHashCodeResult = v3dlpViolation.hashCode();
    assertEquals(expectedHashCodeResult, v3dlpViolation2.hashCode());
  }

  /**
   * Test {@link V3DLPViolation#equals(Object)}, and {@link V3DLPViolation#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V3DLPViolation#equals(Object)}
   *   <li>{@link V3DLPViolation#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPViolation.equals(Object)", "int V3DLPViolation.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V3DLPViolation v3dlpViolation = new V3DLPViolation();

    // Act and Assert
    assertEquals(v3dlpViolation, v3dlpViolation);
    int expectedHashCodeResult = v3dlpViolation.hashCode();
    assertEquals(expectedHashCodeResult, v3dlpViolation.hashCode());
  }

  /**
   * Test {@link V3DLPViolation#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3DLPViolation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPViolation.equals(Object)", "int V3DLPViolation.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V3DLPViolation v3dlpViolation = new V3DLPViolation();
    v3dlpViolation.addDetailsItem("Details Item");

    // Act and Assert
    assertNotEquals(v3dlpViolation, new V3DLPViolation());
  }

  /**
   * Test {@link V3DLPViolation#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3DLPViolation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPViolation.equals(Object)", "int V3DLPViolation.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V3DLPViolation v3dlpViolation = new V3DLPViolation();
    v3dlpViolation.enforcementEventID("Enforcement Event ID");
    v3dlpViolation.addDetailsItem("Details Item");

    // Act and Assert
    assertNotEquals(v3dlpViolation, new V3DLPViolation());
  }

  /**
   * Test {@link V3DLPViolation#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3DLPViolation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPViolation.equals(Object)", "int V3DLPViolation.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V3DLPViolation v3dlpViolation = new V3DLPViolation();
    v3dlpViolation.entityID("Entity ID");
    v3dlpViolation.addDetailsItem("Details Item");

    // Act and Assert
    assertNotEquals(v3dlpViolation, new V3DLPViolation());
  }

  /**
   * Test {@link V3DLPViolation#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3DLPViolation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPViolation.equals(Object)", "int V3DLPViolation.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V3DLPViolation v3dlpViolation = new V3DLPViolation();
    v3dlpViolation.createTime(1L);
    v3dlpViolation.addDetailsItem("Details Item");

    // Act and Assert
    assertNotEquals(v3dlpViolation, new V3DLPViolation());
  }

  /**
   * Test {@link V3DLPViolation#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3DLPViolation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPViolation.equals(Object)", "int V3DLPViolation.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V3DLPViolation v3dlpViolation = new V3DLPViolation();
    v3dlpViolation.lastModified(1L);
    v3dlpViolation.addDetailsItem("Details Item");

    // Act and Assert
    assertNotEquals(v3dlpViolation, new V3DLPViolation());
  }

  /**
   * Test {@link V3DLPViolation#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3DLPViolation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPViolation.equals(Object)", "int V3DLPViolation.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    V3DLPViolation v3dlpViolation = new V3DLPViolation();
    v3dlpViolation.requesterId(1L);
    v3dlpViolation.addDetailsItem("Details Item");

    // Act and Assert
    assertNotEquals(v3dlpViolation, new V3DLPViolation());
  }

  /**
   * Test {@link V3DLPViolation#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3DLPViolation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPViolation.equals(Object)", "int V3DLPViolation.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    V3DLPViolation v3dlpViolation = new V3DLPViolation();
    v3dlpViolation.action("Action");

    // Act and Assert
    assertNotEquals(v3dlpViolation, new V3DLPViolation());
  }

  /**
   * Test {@link V3DLPViolation#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3DLPViolation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPViolation.equals(Object)", "int V3DLPViolation.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    V3DLPViolation v3dlpViolation = new V3DLPViolation();
    v3dlpViolation.outcome(new V1DLPOutcome());

    // Act and Assert
    assertNotEquals(v3dlpViolation, new V3DLPViolation());
  }

  /**
   * Test {@link V3DLPViolation#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3DLPViolation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPViolation.equals(Object)", "int V3DLPViolation.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    V3DLPViolation v3dlpViolation = new V3DLPViolation();
    v3dlpViolation.version("1.0.2");

    // Act and Assert
    assertNotEquals(v3dlpViolation, new V3DLPViolation());
  }

  /**
   * Test {@link V3DLPViolation#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3DLPViolation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPViolation.equals(Object)", "int V3DLPViolation.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual10() {
    // Arrange
    V3DLPViolation v3dlpViolation = new V3DLPViolation();
    v3dlpViolation.ignoreDLPwarning(true);

    // Act and Assert
    assertNotEquals(v3dlpViolation, new V3DLPViolation());
  }

  /**
   * Test {@link V3DLPViolation#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3DLPViolation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPViolation.equals(Object)", "int V3DLPViolation.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPViolation(), null);
  }

  /**
   * Test {@link V3DLPViolation#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3DLPViolation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3DLPViolation.equals(Object)", "int V3DLPViolation.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3DLPViolation(), "Different type to V3DLPViolation");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V3DLPViolation}
   *   <li>{@link V3DLPViolation#action(String)}
   *   <li>{@link V3DLPViolation#createTime(Long)}
   *   <li>{@link V3DLPViolation#details(List)}
   *   <li>{@link V3DLPViolation#enforcementEventID(String)}
   *   <li>{@link V3DLPViolation#entityID(String)}
   *   <li>{@link V3DLPViolation#ignoreDLPwarning(Boolean)}
   *   <li>{@link V3DLPViolation#lastModified(Long)}
   *   <li>{@link V3DLPViolation#outcome(V1DLPOutcome)}
   *   <li>{@link V3DLPViolation#requesterId(Long)}
   *   <li>{@link V3DLPViolation#setAction(String)}
   *   <li>{@link V3DLPViolation#setCreateTime(Long)}
   *   <li>{@link V3DLPViolation#setDetails(List)}
   *   <li>{@link V3DLPViolation#setEnforcementEventID(String)}
   *   <li>{@link V3DLPViolation#setEntityID(String)}
   *   <li>{@link V3DLPViolation#setIgnoreDLPwarning(Boolean)}
   *   <li>{@link V3DLPViolation#setLastModified(Long)}
   *   <li>{@link V3DLPViolation#setOutcome(V1DLPOutcome)}
   *   <li>{@link V3DLPViolation#setRequesterId(Long)}
   *   <li>{@link V3DLPViolation#setVersion(String)}
   *   <li>{@link V3DLPViolation#version(String)}
   *   <li>{@link V3DLPViolation#toString()}
   *   <li>{@link V3DLPViolation#getAction()}
   *   <li>{@link V3DLPViolation#getCreateTime()}
   *   <li>{@link V3DLPViolation#getDetails()}
   *   <li>{@link V3DLPViolation#getEnforcementEventID()}
   *   <li>{@link V3DLPViolation#getEntityID()}
   *   <li>{@link V3DLPViolation#getIgnoreDLPwarning()}
   *   <li>{@link V3DLPViolation#getLastModified()}
   *   <li>{@link V3DLPViolation#getOutcome()}
   *   <li>{@link V3DLPViolation#getRequesterId()}
   *   <li>{@link V3DLPViolation#getVersion()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V3DLPViolation.<init>()", "V3DLPViolation V3DLPViolation.action(String)",
      "V3DLPViolation V3DLPViolation.createTime(Long)", "V3DLPViolation V3DLPViolation.details(List)",
      "V3DLPViolation V3DLPViolation.enforcementEventID(String)", "V3DLPViolation V3DLPViolation.entityID(String)",
      "String V3DLPViolation.getAction()", "Long V3DLPViolation.getCreateTime()", "List V3DLPViolation.getDetails()",
      "String V3DLPViolation.getEnforcementEventID()", "String V3DLPViolation.getEntityID()",
      "Boolean V3DLPViolation.getIgnoreDLPwarning()", "Long V3DLPViolation.getLastModified()",
      "V1DLPOutcome V3DLPViolation.getOutcome()", "Long V3DLPViolation.getRequesterId()",
      "String V3DLPViolation.getVersion()", "V3DLPViolation V3DLPViolation.ignoreDLPwarning(Boolean)",
      "V3DLPViolation V3DLPViolation.lastModified(Long)", "V3DLPViolation V3DLPViolation.outcome(V1DLPOutcome)",
      "V3DLPViolation V3DLPViolation.requesterId(Long)", "void V3DLPViolation.setAction(String)",
      "void V3DLPViolation.setCreateTime(Long)", "void V3DLPViolation.setDetails(List)",
      "void V3DLPViolation.setEnforcementEventID(String)", "void V3DLPViolation.setEntityID(String)",
      "void V3DLPViolation.setIgnoreDLPwarning(Boolean)", "void V3DLPViolation.setLastModified(Long)",
      "void V3DLPViolation.setOutcome(V1DLPOutcome)", "void V3DLPViolation.setRequesterId(Long)",
      "void V3DLPViolation.setVersion(String)", "String V3DLPViolation.toString()",
      "V3DLPViolation V3DLPViolation.version(String)"})
  void testGettersAndSetters() {
    // Arrange and Act
    V3DLPViolation actualV3dlpViolation = new V3DLPViolation();
    V3DLPViolation actualActionResult = actualV3dlpViolation.action("Action");
    V3DLPViolation actualCreateTimeResult = actualV3dlpViolation.createTime(1L);
    V3DLPViolation actualDetailsResult = actualV3dlpViolation.details(new ArrayList<>());
    V3DLPViolation actualEnforcementEventIDResult = actualV3dlpViolation.enforcementEventID("Enforcement Event ID");
    V3DLPViolation actualEntityIDResult = actualV3dlpViolation.entityID("Entity ID");
    V3DLPViolation actualIgnoreDLPwarningResult = actualV3dlpViolation.ignoreDLPwarning(true);
    V3DLPViolation actualLastModifiedResult = actualV3dlpViolation.lastModified(1L);
    V3DLPViolation actualOutcomeResult = actualV3dlpViolation.outcome(new V1DLPOutcome());
    V3DLPViolation actualRequesterIdResult = actualV3dlpViolation.requesterId(1L);
    actualV3dlpViolation.setAction("Action");
    actualV3dlpViolation.setCreateTime(1L);
    ArrayList<Object> details = new ArrayList<>();
    actualV3dlpViolation.setDetails(details);
    actualV3dlpViolation.setEnforcementEventID("Enforcement Event ID");
    actualV3dlpViolation.setEntityID("Entity ID");
    actualV3dlpViolation.setIgnoreDLPwarning(true);
    actualV3dlpViolation.setLastModified(1L);
    V1DLPOutcome outcome = new V1DLPOutcome();
    actualV3dlpViolation.setOutcome(outcome);
    actualV3dlpViolation.setRequesterId(1L);
    actualV3dlpViolation.setVersion("1.0.2");
    V3DLPViolation actualVersionResult = actualV3dlpViolation.version("1.0.2");
    String actualToStringResult = actualV3dlpViolation.toString();
    String actualAction = actualV3dlpViolation.getAction();
    Long actualCreateTime = actualV3dlpViolation.getCreateTime();
    List<Object> actualDetails = actualV3dlpViolation.getDetails();
    String actualEnforcementEventID = actualV3dlpViolation.getEnforcementEventID();
    String actualEntityID = actualV3dlpViolation.getEntityID();
    Boolean actualIgnoreDLPwarning = actualV3dlpViolation.getIgnoreDLPwarning();
    Long actualLastModified = actualV3dlpViolation.getLastModified();
    V1DLPOutcome actualOutcome = actualV3dlpViolation.getOutcome();
    Long actualRequesterId = actualV3dlpViolation.getRequesterId();

    // Assert
    assertEquals("1.0.2", actualV3dlpViolation.getVersion());
    assertEquals("Action", actualAction);
    assertEquals("Enforcement Event ID", actualEnforcementEventID);
    assertEquals("Entity ID", actualEntityID);
    assertEquals("class V3DLPViolation {\n" + "    enforcementEventID: Enforcement Event ID\n"
        + "    entityID: Entity ID\n" + "    createTime: 1\n" + "    lastModified: 1\n" + "    requesterId: 1\n"
        + "    details: []\n" + "    action: Action\n" + "    outcome: class V1DLPOutcome {\n" + "        type: null\n"
        + "    }\n" + "    version: 1.0.2\n" + "    ignoreDLPwarning: true\n" + "}", actualToStringResult);
    assertNull(actualOutcome.getType());
    assertEquals(1L, actualCreateTime.longValue());
    assertEquals(1L, actualLastModified.longValue());
    assertEquals(1L, actualRequesterId.longValue());
    assertTrue(actualIgnoreDLPwarning);
    assertTrue(actualDetails.isEmpty());
    assertSame(outcome, actualOutcome);
    assertSame(actualV3dlpViolation, actualActionResult);
    assertSame(actualV3dlpViolation, actualCreateTimeResult);
    assertSame(actualV3dlpViolation, actualDetailsResult);
    assertSame(actualV3dlpViolation, actualEnforcementEventIDResult);
    assertSame(actualV3dlpViolation, actualEntityIDResult);
    assertSame(actualV3dlpViolation, actualIgnoreDLPwarningResult);
    assertSame(actualV3dlpViolation, actualLastModifiedResult);
    assertSame(actualV3dlpViolation, actualOutcomeResult);
    assertSame(actualV3dlpViolation, actualRequesterIdResult);
    assertSame(actualV3dlpViolation, actualVersionResult);
    assertSame(details, actualDetails);
  }
}
