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

class V4RoomPropertiesDiffblueTest {
  /**
   * Test {@link V4RoomProperties#addKeywordsItem(V4KeyValuePair)}.
   * <ul>
   *   <li>Given {@link V4RoomProperties} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link V4RoomProperties#addKeywordsItem(V4KeyValuePair)}
   */
  @Test
  @DisplayName("Test addKeywordsItem(V4KeyValuePair); given V4RoomProperties (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V4RoomProperties V4RoomProperties.addKeywordsItem(V4KeyValuePair)"})
  void testAddKeywordsItem_givenV4RoomProperties() {
    // Arrange
    V4RoomProperties v4RoomProperties = new V4RoomProperties();

    // Act and Assert
    assertSame(v4RoomProperties, v4RoomProperties.addKeywordsItem(new V4KeyValuePair()));
  }

  /**
   * Test {@link V4RoomProperties#addKeywordsItem(V4KeyValuePair)}.
   * <ul>
   *   <li>Given {@link V4RoomProperties} (default constructor) keywords {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4RoomProperties#addKeywordsItem(V4KeyValuePair)}
   */
  @Test
  @DisplayName("Test addKeywordsItem(V4KeyValuePair); given V4RoomProperties (default constructor) keywords ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V4RoomProperties V4RoomProperties.addKeywordsItem(V4KeyValuePair)"})
  void testAddKeywordsItem_givenV4RoomPropertiesKeywordsArrayList() {
    // Arrange
    V4RoomProperties v4RoomProperties = new V4RoomProperties();
    v4RoomProperties.keywords(new ArrayList<>());

    // Act and Assert
    assertSame(v4RoomProperties, v4RoomProperties.addKeywordsItem(new V4KeyValuePair()));
  }

  /**
   * Test {@link V4RoomProperties#equals(Object)}, and {@link V4RoomProperties#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4RoomProperties#equals(Object)}
   *   <li>{@link V4RoomProperties#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4RoomProperties.equals(Object)", "int V4RoomProperties.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4RoomProperties v4RoomProperties = new V4RoomProperties();
    V4RoomProperties v4RoomProperties2 = new V4RoomProperties();

    // Act and Assert
    assertEquals(v4RoomProperties, v4RoomProperties2);
    int expectedHashCodeResult = v4RoomProperties.hashCode();
    assertEquals(expectedHashCodeResult, v4RoomProperties2.hashCode());
  }

  /**
   * Test {@link V4RoomProperties#equals(Object)}, and {@link V4RoomProperties#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4RoomProperties#equals(Object)}
   *   <li>{@link V4RoomProperties#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4RoomProperties.equals(Object)", "int V4RoomProperties.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4RoomProperties v4RoomProperties = new V4RoomProperties();

    // Act and Assert
    assertEquals(v4RoomProperties, v4RoomProperties);
    int expectedHashCodeResult = v4RoomProperties.hashCode();
    assertEquals(expectedHashCodeResult, v4RoomProperties.hashCode());
  }

  /**
   * Test {@link V4RoomProperties#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4RoomProperties#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4RoomProperties.equals(Object)", "int V4RoomProperties.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V4RoomProperties v4RoomProperties = new V4RoomProperties();
    v4RoomProperties.addKeywordsItem(new V4KeyValuePair());

    // Act and Assert
    assertNotEquals(v4RoomProperties, new V4RoomProperties());
  }

  /**
   * Test {@link V4RoomProperties#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4RoomProperties#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4RoomProperties.equals(Object)", "int V4RoomProperties.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V4RoomProperties v4RoomProperties = new V4RoomProperties();
    v4RoomProperties.name("Name");
    v4RoomProperties.addKeywordsItem(new V4KeyValuePair());

    // Act and Assert
    assertNotEquals(v4RoomProperties, new V4RoomProperties());
  }

  /**
   * Test {@link V4RoomProperties#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4RoomProperties#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4RoomProperties.equals(Object)", "int V4RoomProperties.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V4RoomProperties v4RoomProperties = new V4RoomProperties();
    v4RoomProperties.description("The characteristics of someone or something");
    v4RoomProperties.addKeywordsItem(new V4KeyValuePair());

    // Act and Assert
    assertNotEquals(v4RoomProperties, new V4RoomProperties());
  }

  /**
   * Test {@link V4RoomProperties#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4RoomProperties#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4RoomProperties.equals(Object)", "int V4RoomProperties.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V4RoomProperties v4RoomProperties = new V4RoomProperties();
    v4RoomProperties.creatorUser(new V4User());
    v4RoomProperties.addKeywordsItem(new V4KeyValuePair());

    // Act and Assert
    assertNotEquals(v4RoomProperties, new V4RoomProperties());
  }

  /**
   * Test {@link V4RoomProperties#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4RoomProperties#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4RoomProperties.equals(Object)", "int V4RoomProperties.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V4RoomProperties v4RoomProperties = new V4RoomProperties();
    v4RoomProperties.createdDate(1L);
    v4RoomProperties.addKeywordsItem(new V4KeyValuePair());

    // Act and Assert
    assertNotEquals(v4RoomProperties, new V4RoomProperties());
  }

  /**
   * Test {@link V4RoomProperties#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4RoomProperties#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4RoomProperties.equals(Object)", "int V4RoomProperties.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    V4RoomProperties v4RoomProperties = new V4RoomProperties();
    v4RoomProperties.external(true);
    v4RoomProperties.addKeywordsItem(new V4KeyValuePair());

    // Act and Assert
    assertNotEquals(v4RoomProperties, new V4RoomProperties());
  }

  /**
   * Test {@link V4RoomProperties#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4RoomProperties#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4RoomProperties.equals(Object)", "int V4RoomProperties.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    V4RoomProperties v4RoomProperties = new V4RoomProperties();
    v4RoomProperties.crossPod(true);
    v4RoomProperties.addKeywordsItem(new V4KeyValuePair());

    // Act and Assert
    assertNotEquals(v4RoomProperties, new V4RoomProperties());
  }

  /**
   * Test {@link V4RoomProperties#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4RoomProperties#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4RoomProperties.equals(Object)", "int V4RoomProperties.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    V4RoomProperties v4RoomProperties = new V4RoomProperties();
    v4RoomProperties._public(true);
    v4RoomProperties.addKeywordsItem(new V4KeyValuePair());

    // Act and Assert
    assertNotEquals(v4RoomProperties, new V4RoomProperties());
  }

  /**
   * Test {@link V4RoomProperties#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4RoomProperties#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4RoomProperties.equals(Object)", "int V4RoomProperties.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    V4RoomProperties v4RoomProperties = new V4RoomProperties();
    v4RoomProperties.copyProtected(true);
    v4RoomProperties.addKeywordsItem(new V4KeyValuePair());

    // Act and Assert
    assertNotEquals(v4RoomProperties, new V4RoomProperties());
  }

  /**
   * Test {@link V4RoomProperties#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4RoomProperties#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4RoomProperties.equals(Object)", "int V4RoomProperties.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual10() {
    // Arrange
    V4RoomProperties v4RoomProperties = new V4RoomProperties();
    v4RoomProperties.readOnly(true);
    v4RoomProperties.addKeywordsItem(new V4KeyValuePair());

    // Act and Assert
    assertNotEquals(v4RoomProperties, new V4RoomProperties());
  }

  /**
   * Test {@link V4RoomProperties#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4RoomProperties#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4RoomProperties.equals(Object)", "int V4RoomProperties.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual11() {
    // Arrange
    V4RoomProperties v4RoomProperties = new V4RoomProperties();
    v4RoomProperties.discoverable(true);
    v4RoomProperties.addKeywordsItem(new V4KeyValuePair());

    // Act and Assert
    assertNotEquals(v4RoomProperties, new V4RoomProperties());
  }

  /**
   * Test {@link V4RoomProperties#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4RoomProperties#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4RoomProperties.equals(Object)", "int V4RoomProperties.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual12() {
    // Arrange
    V4RoomProperties v4RoomProperties = new V4RoomProperties();
    v4RoomProperties.membersCanInvite(true);
    v4RoomProperties.addKeywordsItem(new V4KeyValuePair());

    // Act and Assert
    assertNotEquals(v4RoomProperties, new V4RoomProperties());
  }

  /**
   * Test {@link V4RoomProperties#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4RoomProperties#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4RoomProperties.equals(Object)", "int V4RoomProperties.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual13() {
    // Arrange
    V4RoomProperties v4RoomProperties = new V4RoomProperties();
    v4RoomProperties.canViewHistory(true);

    // Act and Assert
    assertNotEquals(v4RoomProperties, new V4RoomProperties());
  }

  /**
   * Test {@link V4RoomProperties#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4RoomProperties#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4RoomProperties.equals(Object)", "int V4RoomProperties.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4RoomProperties(), null);
  }

  /**
   * Test {@link V4RoomProperties#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4RoomProperties#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4RoomProperties.equals(Object)", "int V4RoomProperties.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4RoomProperties(), "Different type to V4RoomProperties");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V4RoomProperties}
   *   <li>{@link V4RoomProperties#_public(Boolean)}
   *   <li>{@link V4RoomProperties#canViewHistory(Boolean)}
   *   <li>{@link V4RoomProperties#copyProtected(Boolean)}
   *   <li>{@link V4RoomProperties#createdDate(Long)}
   *   <li>{@link V4RoomProperties#creatorUser(V4User)}
   *   <li>{@link V4RoomProperties#crossPod(Boolean)}
   *   <li>{@link V4RoomProperties#description(String)}
   *   <li>{@link V4RoomProperties#discoverable(Boolean)}
   *   <li>{@link V4RoomProperties#external(Boolean)}
   *   <li>{@link V4RoomProperties#keywords(List)}
   *   <li>{@link V4RoomProperties#membersCanInvite(Boolean)}
   *   <li>{@link V4RoomProperties#name(String)}
   *   <li>{@link V4RoomProperties#readOnly(Boolean)}
   *   <li>{@link V4RoomProperties#setCanViewHistory(Boolean)}
   *   <li>{@link V4RoomProperties#setCopyProtected(Boolean)}
   *   <li>{@link V4RoomProperties#setCreatedDate(Long)}
   *   <li>{@link V4RoomProperties#setCreatorUser(V4User)}
   *   <li>{@link V4RoomProperties#setCrossPod(Boolean)}
   *   <li>{@link V4RoomProperties#setDescription(String)}
   *   <li>{@link V4RoomProperties#setDiscoverable(Boolean)}
   *   <li>{@link V4RoomProperties#setExternal(Boolean)}
   *   <li>{@link V4RoomProperties#setKeywords(List)}
   *   <li>{@link V4RoomProperties#setMembersCanInvite(Boolean)}
   *   <li>{@link V4RoomProperties#setName(String)}
   *   <li>{@link V4RoomProperties#setPublic(Boolean)}
   *   <li>{@link V4RoomProperties#setReadOnly(Boolean)}
   *   <li>{@link V4RoomProperties#toString()}
   *   <li>{@link V4RoomProperties#getCanViewHistory()}
   *   <li>{@link V4RoomProperties#getCopyProtected()}
   *   <li>{@link V4RoomProperties#getCreatedDate()}
   *   <li>{@link V4RoomProperties#getCreatorUser()}
   *   <li>{@link V4RoomProperties#getCrossPod()}
   *   <li>{@link V4RoomProperties#getDescription()}
   *   <li>{@link V4RoomProperties#getDiscoverable()}
   *   <li>{@link V4RoomProperties#getExternal()}
   *   <li>{@link V4RoomProperties#getKeywords()}
   *   <li>{@link V4RoomProperties#getMembersCanInvite()}
   *   <li>{@link V4RoomProperties#getName()}
   *   <li>{@link V4RoomProperties#getPublic()}
   *   <li>{@link V4RoomProperties#getReadOnly()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V4RoomProperties.<init>()", "V4RoomProperties V4RoomProperties._public(Boolean)",
      "V4RoomProperties V4RoomProperties.canViewHistory(Boolean)",
      "V4RoomProperties V4RoomProperties.copyProtected(Boolean)", "V4RoomProperties V4RoomProperties.createdDate(Long)",
      "V4RoomProperties V4RoomProperties.creatorUser(V4User)", "V4RoomProperties V4RoomProperties.crossPod(Boolean)",
      "V4RoomProperties V4RoomProperties.description(String)",
      "V4RoomProperties V4RoomProperties.discoverable(Boolean)", "V4RoomProperties V4RoomProperties.external(Boolean)",
      "Boolean V4RoomProperties.getCanViewHistory()", "Boolean V4RoomProperties.getCopyProtected()",
      "Long V4RoomProperties.getCreatedDate()", "V4User V4RoomProperties.getCreatorUser()",
      "Boolean V4RoomProperties.getCrossPod()", "String V4RoomProperties.getDescription()",
      "Boolean V4RoomProperties.getDiscoverable()", "Boolean V4RoomProperties.getExternal()",
      "List V4RoomProperties.getKeywords()", "Boolean V4RoomProperties.getMembersCanInvite()",
      "String V4RoomProperties.getName()", "Boolean V4RoomProperties.getPublic()",
      "Boolean V4RoomProperties.getReadOnly()", "V4RoomProperties V4RoomProperties.keywords(List)",
      "V4RoomProperties V4RoomProperties.membersCanInvite(Boolean)", "V4RoomProperties V4RoomProperties.name(String)",
      "V4RoomProperties V4RoomProperties.readOnly(Boolean)", "void V4RoomProperties.setCanViewHistory(Boolean)",
      "void V4RoomProperties.setCopyProtected(Boolean)", "void V4RoomProperties.setCreatedDate(Long)",
      "void V4RoomProperties.setCreatorUser(V4User)", "void V4RoomProperties.setCrossPod(Boolean)",
      "void V4RoomProperties.setDescription(String)", "void V4RoomProperties.setDiscoverable(Boolean)",
      "void V4RoomProperties.setExternal(Boolean)", "void V4RoomProperties.setKeywords(List)",
      "void V4RoomProperties.setMembersCanInvite(Boolean)", "void V4RoomProperties.setName(String)",
      "void V4RoomProperties.setPublic(Boolean)", "void V4RoomProperties.setReadOnly(Boolean)",
      "String V4RoomProperties.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    V4RoomProperties actualV4RoomProperties = new V4RoomProperties();
    V4RoomProperties actual_publicResult = actualV4RoomProperties._public(true);
    V4RoomProperties actualCanViewHistoryResult = actualV4RoomProperties.canViewHistory(true);
    V4RoomProperties actualCopyProtectedResult = actualV4RoomProperties.copyProtected(true);
    V4RoomProperties actualCreatedDateResult = actualV4RoomProperties.createdDate(1L);
    V4RoomProperties actualCreatorUserResult = actualV4RoomProperties.creatorUser(new V4User());
    V4RoomProperties actualCrossPodResult = actualV4RoomProperties.crossPod(true);
    V4RoomProperties actualDescriptionResult = actualV4RoomProperties
        .description("The characteristics of someone or something");
    V4RoomProperties actualDiscoverableResult = actualV4RoomProperties.discoverable(true);
    V4RoomProperties actualExternalResult = actualV4RoomProperties.external(true);
    V4RoomProperties actualKeywordsResult = actualV4RoomProperties.keywords(new ArrayList<>());
    V4RoomProperties actualMembersCanInviteResult = actualV4RoomProperties.membersCanInvite(true);
    V4RoomProperties actualNameResult = actualV4RoomProperties.name("Name");
    V4RoomProperties actualReadOnlyResult = actualV4RoomProperties.readOnly(true);
    actualV4RoomProperties.setCanViewHistory(true);
    actualV4RoomProperties.setCopyProtected(true);
    actualV4RoomProperties.setCreatedDate(1L);
    V4User creatorUser = new V4User();
    actualV4RoomProperties.setCreatorUser(creatorUser);
    actualV4RoomProperties.setCrossPod(true);
    actualV4RoomProperties.setDescription("The characteristics of someone or something");
    actualV4RoomProperties.setDiscoverable(true);
    actualV4RoomProperties.setExternal(true);
    ArrayList<V4KeyValuePair> keywords = new ArrayList<>();
    actualV4RoomProperties.setKeywords(keywords);
    actualV4RoomProperties.setMembersCanInvite(true);
    actualV4RoomProperties.setName("Name");
    actualV4RoomProperties.setPublic(true);
    actualV4RoomProperties.setReadOnly(true);
    String actualToStringResult = actualV4RoomProperties.toString();
    Boolean actualCanViewHistory = actualV4RoomProperties.getCanViewHistory();
    Boolean actualCopyProtected = actualV4RoomProperties.getCopyProtected();
    Long actualCreatedDate = actualV4RoomProperties.getCreatedDate();
    V4User actualCreatorUser = actualV4RoomProperties.getCreatorUser();
    Boolean actualCrossPod = actualV4RoomProperties.getCrossPod();
    String actualDescription = actualV4RoomProperties.getDescription();
    Boolean actualDiscoverable = actualV4RoomProperties.getDiscoverable();
    Boolean actualExternal = actualV4RoomProperties.getExternal();
    List<V4KeyValuePair> actualKeywords = actualV4RoomProperties.getKeywords();
    Boolean actualMembersCanInvite = actualV4RoomProperties.getMembersCanInvite();
    String actualName = actualV4RoomProperties.getName();
    Boolean actualPublic = actualV4RoomProperties.getPublic();
    Boolean actualReadOnly = actualV4RoomProperties.getReadOnly();

    // Assert
    assertEquals("Name", actualName);
    assertEquals("The characteristics of someone or something", actualDescription);
    assertEquals(
        "class V4RoomProperties {\n" + "    name: Name\n"
            + "    description: The characteristics of someone or something\n" + "    creatorUser: class V4User {\n"
            + "        userId: null\n" + "        firstName: null\n" + "        lastName: null\n"
            + "        displayName: null\n" + "        email: null\n" + "        username: null\n" + "    }\n"
            + "    createdDate: 1\n" + "    external: true\n" + "    crossPod: true\n" + "    _public: true\n"
            + "    copyProtected: true\n" + "    readOnly: true\n" + "    discoverable: true\n"
            + "    membersCanInvite: true\n" + "    keywords: []\n" + "    canViewHistory: true\n" + "}",
        actualToStringResult);
    assertEquals(1L, actualCreatedDate.longValue());
    assertTrue(actualCanViewHistory);
    assertTrue(actualCopyProtected);
    assertTrue(actualCrossPod);
    assertTrue(actualDiscoverable);
    assertTrue(actualExternal);
    assertTrue(actualMembersCanInvite);
    assertTrue(actualPublic);
    assertTrue(actualReadOnly);
    assertTrue(actualKeywords.isEmpty());
    assertSame(actualV4RoomProperties, actual_publicResult);
    assertSame(actualV4RoomProperties, actualCanViewHistoryResult);
    assertSame(actualV4RoomProperties, actualCopyProtectedResult);
    assertSame(actualV4RoomProperties, actualCreatedDateResult);
    assertSame(actualV4RoomProperties, actualCreatorUserResult);
    assertSame(actualV4RoomProperties, actualCrossPodResult);
    assertSame(actualV4RoomProperties, actualDescriptionResult);
    assertSame(actualV4RoomProperties, actualDiscoverableResult);
    assertSame(actualV4RoomProperties, actualExternalResult);
    assertSame(actualV4RoomProperties, actualKeywordsResult);
    assertSame(actualV4RoomProperties, actualMembersCanInviteResult);
    assertSame(actualV4RoomProperties, actualNameResult);
    assertSame(actualV4RoomProperties, actualReadOnlyResult);
    assertSame(creatorUser, actualCreatorUser);
    assertSame(keywords, actualKeywords);
  }
}
