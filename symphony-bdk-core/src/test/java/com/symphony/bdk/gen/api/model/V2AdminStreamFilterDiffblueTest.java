package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V2AdminStreamFilterDiffblueTest {
  /**
   * Test {@link V2AdminStreamFilter#addStreamTypesItem(V2AdminStreamType)}.
   * <ul>
   *   <li>Given {@link V2AdminStreamFilter} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link V2AdminStreamFilter#addStreamTypesItem(V2AdminStreamType)}
   */
  @Test
  @DisplayName("Test addStreamTypesItem(V2AdminStreamType); given V2AdminStreamFilter (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V2AdminStreamFilter V2AdminStreamFilter.addStreamTypesItem(V2AdminStreamType)"})
  void testAddStreamTypesItem_givenV2AdminStreamFilter() {
    // Arrange
    V2AdminStreamFilter v2AdminStreamFilter = new V2AdminStreamFilter();

    // Act and Assert
    assertSame(v2AdminStreamFilter, v2AdminStreamFilter.addStreamTypesItem(new V2AdminStreamType()));
  }

  /**
   * Test {@link V2AdminStreamFilter#addStreamTypesItem(V2AdminStreamType)}.
   * <ul>
   *   <li>Given {@link V2AdminStreamFilter} (default constructor) streamTypes {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2AdminStreamFilter#addStreamTypesItem(V2AdminStreamType)}
   */
  @Test
  @DisplayName("Test addStreamTypesItem(V2AdminStreamType); given V2AdminStreamFilter (default constructor) streamTypes ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V2AdminStreamFilter V2AdminStreamFilter.addStreamTypesItem(V2AdminStreamType)"})
  void testAddStreamTypesItem_givenV2AdminStreamFilterStreamTypesArrayList() {
    // Arrange
    V2AdminStreamFilter v2AdminStreamFilter = new V2AdminStreamFilter();
    v2AdminStreamFilter.streamTypes(new ArrayList<>());

    // Act and Assert
    assertSame(v2AdminStreamFilter, v2AdminStreamFilter.addStreamTypesItem(new V2AdminStreamType()));
  }

  /**
   * Test {@link V2AdminStreamFilter#equals(Object)}, and {@link V2AdminStreamFilter#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V2AdminStreamFilter#equals(Object)}
   *   <li>{@link V2AdminStreamFilter#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2AdminStreamFilter.equals(Object)", "int V2AdminStreamFilter.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2AdminStreamFilter v2AdminStreamFilter = new V2AdminStreamFilter();
    V2AdminStreamFilter v2AdminStreamFilter2 = new V2AdminStreamFilter();

    // Act and Assert
    assertEquals(v2AdminStreamFilter, v2AdminStreamFilter2);
    int expectedHashCodeResult = v2AdminStreamFilter.hashCode();
    assertEquals(expectedHashCodeResult, v2AdminStreamFilter2.hashCode());
  }

  /**
   * Test {@link V2AdminStreamFilter#equals(Object)}, and {@link V2AdminStreamFilter#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V2AdminStreamFilter#equals(Object)}
   *   <li>{@link V2AdminStreamFilter#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2AdminStreamFilter.equals(Object)", "int V2AdminStreamFilter.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2AdminStreamFilter v2AdminStreamFilter = new V2AdminStreamFilter();

    // Act and Assert
    assertEquals(v2AdminStreamFilter, v2AdminStreamFilter);
    int expectedHashCodeResult = v2AdminStreamFilter.hashCode();
    assertEquals(expectedHashCodeResult, v2AdminStreamFilter.hashCode());
  }

  /**
   * Test {@link V2AdminStreamFilter#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2AdminStreamFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2AdminStreamFilter.equals(Object)", "int V2AdminStreamFilter.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V2AdminStreamFilter v2AdminStreamFilter = new V2AdminStreamFilter();
    v2AdminStreamFilter.addStreamTypesItem(new V2AdminStreamType());

    // Act and Assert
    assertNotEquals(v2AdminStreamFilter, new V2AdminStreamFilter());
  }

  /**
   * Test {@link V2AdminStreamFilter#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2AdminStreamFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2AdminStreamFilter.equals(Object)", "int V2AdminStreamFilter.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V2AdminStreamFilter v2AdminStreamFilter = new V2AdminStreamFilter();
    v2AdminStreamFilter.scope("Scope");

    // Act and Assert
    assertNotEquals(v2AdminStreamFilter, new V2AdminStreamFilter());
  }

  /**
   * Test {@link V2AdminStreamFilter#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2AdminStreamFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2AdminStreamFilter.equals(Object)", "int V2AdminStreamFilter.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V2AdminStreamFilter v2AdminStreamFilter = new V2AdminStreamFilter();
    v2AdminStreamFilter.origin("Origin");

    // Act and Assert
    assertNotEquals(v2AdminStreamFilter, new V2AdminStreamFilter());
  }

  /**
   * Test {@link V2AdminStreamFilter#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2AdminStreamFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2AdminStreamFilter.equals(Object)", "int V2AdminStreamFilter.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V2AdminStreamFilter v2AdminStreamFilter = new V2AdminStreamFilter();
    v2AdminStreamFilter.status("Status");

    // Act and Assert
    assertNotEquals(v2AdminStreamFilter, new V2AdminStreamFilter());
  }

  /**
   * Test {@link V2AdminStreamFilter#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2AdminStreamFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2AdminStreamFilter.equals(Object)", "int V2AdminStreamFilter.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V2AdminStreamFilter v2AdminStreamFilter = new V2AdminStreamFilter();
    v2AdminStreamFilter.privacy("Privacy");

    // Act and Assert
    assertNotEquals(v2AdminStreamFilter, new V2AdminStreamFilter());
  }

  /**
   * Test {@link V2AdminStreamFilter#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2AdminStreamFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2AdminStreamFilter.equals(Object)", "int V2AdminStreamFilter.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    V2AdminStreamFilter v2AdminStreamFilter = new V2AdminStreamFilter();
    v2AdminStreamFilter.startDate(1L);

    // Act and Assert
    assertNotEquals(v2AdminStreamFilter, new V2AdminStreamFilter());
  }

  /**
   * Test {@link V2AdminStreamFilter#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2AdminStreamFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2AdminStreamFilter.equals(Object)", "int V2AdminStreamFilter.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    V2AdminStreamFilter v2AdminStreamFilter = new V2AdminStreamFilter();
    v2AdminStreamFilter.endDate(1L);

    // Act and Assert
    assertNotEquals(v2AdminStreamFilter, new V2AdminStreamFilter());
  }

  /**
   * Test {@link V2AdminStreamFilter#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2AdminStreamFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2AdminStreamFilter.equals(Object)", "int V2AdminStreamFilter.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2AdminStreamFilter(), null);
  }

  /**
   * Test {@link V2AdminStreamFilter#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2AdminStreamFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V2AdminStreamFilter.equals(Object)", "int V2AdminStreamFilter.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2AdminStreamFilter(), "Different type to V2AdminStreamFilter");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V2AdminStreamFilter}
   *   <li>{@link V2AdminStreamFilter#endDate(Long)}
   *   <li>{@link V2AdminStreamFilter#origin(String)}
   *   <li>{@link V2AdminStreamFilter#privacy(String)}
   *   <li>{@link V2AdminStreamFilter#scope(String)}
   *   <li>{@link V2AdminStreamFilter#setEndDate(Long)}
   *   <li>{@link V2AdminStreamFilter#setOrigin(String)}
   *   <li>{@link V2AdminStreamFilter#setPrivacy(String)}
   *   <li>{@link V2AdminStreamFilter#setScope(String)}
   *   <li>{@link V2AdminStreamFilter#setStartDate(Long)}
   *   <li>{@link V2AdminStreamFilter#setStatus(String)}
   *   <li>{@link V2AdminStreamFilter#setStreamTypes(List)}
   *   <li>{@link V2AdminStreamFilter#startDate(Long)}
   *   <li>{@link V2AdminStreamFilter#status(String)}
   *   <li>{@link V2AdminStreamFilter#streamTypes(List)}
   *   <li>{@link V2AdminStreamFilter#toString()}
   *   <li>{@link V2AdminStreamFilter#getEndDate()}
   *   <li>{@link V2AdminStreamFilter#getOrigin()}
   *   <li>{@link V2AdminStreamFilter#getPrivacy()}
   *   <li>{@link V2AdminStreamFilter#getScope()}
   *   <li>{@link V2AdminStreamFilter#getStartDate()}
   *   <li>{@link V2AdminStreamFilter#getStatus()}
   *   <li>{@link V2AdminStreamFilter#getStreamTypes()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V2AdminStreamFilter.<init>()", "V2AdminStreamFilter V2AdminStreamFilter.endDate(Long)",
      "Long V2AdminStreamFilter.getEndDate()", "String V2AdminStreamFilter.getOrigin()",
      "String V2AdminStreamFilter.getPrivacy()", "String V2AdminStreamFilter.getScope()",
      "Long V2AdminStreamFilter.getStartDate()", "String V2AdminStreamFilter.getStatus()",
      "List V2AdminStreamFilter.getStreamTypes()", "V2AdminStreamFilter V2AdminStreamFilter.origin(String)",
      "V2AdminStreamFilter V2AdminStreamFilter.privacy(String)",
      "V2AdminStreamFilter V2AdminStreamFilter.scope(String)", "void V2AdminStreamFilter.setEndDate(Long)",
      "void V2AdminStreamFilter.setOrigin(String)", "void V2AdminStreamFilter.setPrivacy(String)",
      "void V2AdminStreamFilter.setScope(String)", "void V2AdminStreamFilter.setStartDate(Long)",
      "void V2AdminStreamFilter.setStatus(String)", "void V2AdminStreamFilter.setStreamTypes(List)",
      "V2AdminStreamFilter V2AdminStreamFilter.startDate(Long)",
      "V2AdminStreamFilter V2AdminStreamFilter.status(String)",
      "V2AdminStreamFilter V2AdminStreamFilter.streamTypes(List)", "String V2AdminStreamFilter.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    V2AdminStreamFilter actualV2AdminStreamFilter = new V2AdminStreamFilter();
    V2AdminStreamFilter actualEndDateResult = actualV2AdminStreamFilter.endDate(1L);
    V2AdminStreamFilter actualOriginResult = actualV2AdminStreamFilter.origin("Origin");
    V2AdminStreamFilter actualPrivacyResult = actualV2AdminStreamFilter.privacy("Privacy");
    V2AdminStreamFilter actualScopeResult = actualV2AdminStreamFilter.scope("Scope");
    actualV2AdminStreamFilter.setEndDate(1L);
    actualV2AdminStreamFilter.setOrigin("Origin");
    actualV2AdminStreamFilter.setPrivacy("Privacy");
    actualV2AdminStreamFilter.setScope("Scope");
    actualV2AdminStreamFilter.setStartDate(1L);
    actualV2AdminStreamFilter.setStatus("Status");
    actualV2AdminStreamFilter.setStreamTypes(new ArrayList<>());
    V2AdminStreamFilter actualStartDateResult = actualV2AdminStreamFilter.startDate(1L);
    V2AdminStreamFilter actualStatusResult = actualV2AdminStreamFilter.status("Status");
    ArrayList<V2AdminStreamType> streamTypes = new ArrayList<>();
    V2AdminStreamFilter actualStreamTypesResult = actualV2AdminStreamFilter.streamTypes(streamTypes);
    String actualToStringResult = actualV2AdminStreamFilter.toString();
    Long actualEndDate = actualV2AdminStreamFilter.getEndDate();
    String actualOrigin = actualV2AdminStreamFilter.getOrigin();
    String actualPrivacy = actualV2AdminStreamFilter.getPrivacy();
    String actualScope = actualV2AdminStreamFilter.getScope();
    Long actualStartDate = actualV2AdminStreamFilter.getStartDate();
    String actualStatus = actualV2AdminStreamFilter.getStatus();
    List<V2AdminStreamType> actualStreamTypes = actualV2AdminStreamFilter.getStreamTypes();

    // Assert
    assertEquals("Origin", actualOrigin);
    assertEquals("Privacy", actualPrivacy);
    assertEquals("Scope", actualScope);
    assertEquals("Status", actualStatus);
    assertEquals(
        "class V2AdminStreamFilter {\n" + "    streamTypes: []\n" + "    scope: Scope\n" + "    origin: Origin\n"
            + "    status: Status\n" + "    privacy: Privacy\n" + "    startDate: 1\n" + "    endDate: 1\n" + "}",
        actualToStringResult);
    assertEquals(1L, actualEndDate.longValue());
    assertEquals(1L, actualStartDate.longValue());
    assertTrue(actualStreamTypes.isEmpty());
    assertSame(actualV2AdminStreamFilter, actualEndDateResult);
    assertSame(actualV2AdminStreamFilter, actualOriginResult);
    assertSame(actualV2AdminStreamFilter, actualPrivacyResult);
    assertSame(actualV2AdminStreamFilter, actualScopeResult);
    assertSame(actualV2AdminStreamFilter, actualStartDateResult);
    assertSame(actualV2AdminStreamFilter, actualStatusResult);
    assertSame(actualV2AdminStreamFilter, actualStreamTypesResult);
    assertSame(streamTypes, actualStreamTypes);
  }
}
