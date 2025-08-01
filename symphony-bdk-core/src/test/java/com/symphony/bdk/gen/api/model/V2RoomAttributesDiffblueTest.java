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

class V2RoomAttributesDiffblueTest {
  /**
   * Test {@link V2RoomAttributes#addKeywordsItem(RoomTag)}.
   *
   * <ul>
   *   <li>Given {@link V2RoomAttributes} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link V2RoomAttributes#addKeywordsItem(RoomTag)}
   */
  @Test
  @DisplayName("Test addKeywordsItem(RoomTag); given V2RoomAttributes (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2RoomAttributes V2RoomAttributes.addKeywordsItem(RoomTag)"})
  void testAddKeywordsItem_givenV2RoomAttributes() {
    // Arrange
    V2RoomAttributes v2RoomAttributes = new V2RoomAttributes();

    // Act and Assert
    assertSame(v2RoomAttributes, v2RoomAttributes.addKeywordsItem(new RoomTag()));
  }

  /**
   * Test {@link V2RoomAttributes#addKeywordsItem(RoomTag)}.
   *
   * <ul>
   *   <li>Given {@link V2RoomAttributes} (default constructor) keywords {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link V2RoomAttributes#addKeywordsItem(RoomTag)}
   */
  @Test
  @DisplayName(
      "Test addKeywordsItem(RoomTag); given V2RoomAttributes (default constructor) keywords ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V2RoomAttributes V2RoomAttributes.addKeywordsItem(RoomTag)"})
  void testAddKeywordsItem_givenV2RoomAttributesKeywordsArrayList() {
    // Arrange
    V2RoomAttributes v2RoomAttributes = new V2RoomAttributes();
    v2RoomAttributes.keywords(new ArrayList<>());

    // Act and Assert
    assertSame(v2RoomAttributes, v2RoomAttributes.addKeywordsItem(new RoomTag()));
  }

  /**
   * Test {@link V2RoomAttributes#equals(Object)}, and {@link V2RoomAttributes#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2RoomAttributes#equals(Object)}
   *   <li>{@link V2RoomAttributes#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2RoomAttributes.equals(Object)", "int V2RoomAttributes.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2RoomAttributes v2RoomAttributes = new V2RoomAttributes();
    V2RoomAttributes v2RoomAttributes2 = new V2RoomAttributes();

    // Act and Assert
    assertEquals(v2RoomAttributes, v2RoomAttributes2);
    int expectedHashCodeResult = v2RoomAttributes.hashCode();
    assertEquals(expectedHashCodeResult, v2RoomAttributes2.hashCode());
  }

  /**
   * Test {@link V2RoomAttributes#equals(Object)}, and {@link V2RoomAttributes#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2RoomAttributes#equals(Object)}
   *   <li>{@link V2RoomAttributes#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2RoomAttributes.equals(Object)", "int V2RoomAttributes.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2RoomAttributes v2RoomAttributes = new V2RoomAttributes();

    // Act and Assert
    assertEquals(v2RoomAttributes, v2RoomAttributes);
    int expectedHashCodeResult = v2RoomAttributes.hashCode();
    assertEquals(expectedHashCodeResult, v2RoomAttributes.hashCode());
  }

  /**
   * Test {@link V2RoomAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2RoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2RoomAttributes.equals(Object)", "int V2RoomAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V2RoomAttributes v2RoomAttributes = new V2RoomAttributes();
    v2RoomAttributes.addKeywordsItem(new RoomTag());

    // Act and Assert
    assertNotEquals(v2RoomAttributes, new V2RoomAttributes());
  }

  /**
   * Test {@link V2RoomAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2RoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2RoomAttributes.equals(Object)", "int V2RoomAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V2RoomAttributes v2RoomAttributes = new V2RoomAttributes();
    v2RoomAttributes.name("Name");
    v2RoomAttributes.addKeywordsItem(new RoomTag());

    // Act and Assert
    assertNotEquals(v2RoomAttributes, new V2RoomAttributes());
  }

  /**
   * Test {@link V2RoomAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2RoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2RoomAttributes.equals(Object)", "int V2RoomAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V2RoomAttributes v2RoomAttributes = new V2RoomAttributes();
    v2RoomAttributes.description("The characteristics of someone or something");

    // Act and Assert
    assertNotEquals(v2RoomAttributes, new V2RoomAttributes());
  }

  /**
   * Test {@link V2RoomAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2RoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2RoomAttributes.equals(Object)", "int V2RoomAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V2RoomAttributes v2RoomAttributes = new V2RoomAttributes();
    v2RoomAttributes.membersCanInvite(true);

    // Act and Assert
    assertNotEquals(v2RoomAttributes, new V2RoomAttributes());
  }

  /**
   * Test {@link V2RoomAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2RoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2RoomAttributes.equals(Object)", "int V2RoomAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V2RoomAttributes v2RoomAttributes = new V2RoomAttributes();
    v2RoomAttributes.discoverable(true);

    // Act and Assert
    assertNotEquals(v2RoomAttributes, new V2RoomAttributes());
  }

  /**
   * Test {@link V2RoomAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2RoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2RoomAttributes.equals(Object)", "int V2RoomAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    V2RoomAttributes v2RoomAttributes = new V2RoomAttributes();
    v2RoomAttributes._public(true);

    // Act and Assert
    assertNotEquals(v2RoomAttributes, new V2RoomAttributes());
  }

  /**
   * Test {@link V2RoomAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2RoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2RoomAttributes.equals(Object)", "int V2RoomAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    V2RoomAttributes v2RoomAttributes = new V2RoomAttributes();
    v2RoomAttributes.readOnly(true);

    // Act and Assert
    assertNotEquals(v2RoomAttributes, new V2RoomAttributes());
  }

  /**
   * Test {@link V2RoomAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2RoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2RoomAttributes.equals(Object)", "int V2RoomAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    V2RoomAttributes v2RoomAttributes = new V2RoomAttributes();
    v2RoomAttributes.copyProtected(true);

    // Act and Assert
    assertNotEquals(v2RoomAttributes, new V2RoomAttributes());
  }

  /**
   * Test {@link V2RoomAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2RoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2RoomAttributes.equals(Object)", "int V2RoomAttributes.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2RoomAttributes(), null);
  }

  /**
   * Test {@link V2RoomAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2RoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2RoomAttributes.equals(Object)", "int V2RoomAttributes.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2RoomAttributes(), "Different type to V2RoomAttributes");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V2RoomAttributes}
   *   <li>{@link V2RoomAttributes#_public(Boolean)}
   *   <li>{@link V2RoomAttributes#copyProtected(Boolean)}
   *   <li>{@link V2RoomAttributes#description(String)}
   *   <li>{@link V2RoomAttributes#discoverable(Boolean)}
   *   <li>{@link V2RoomAttributes#keywords(List)}
   *   <li>{@link V2RoomAttributes#membersCanInvite(Boolean)}
   *   <li>{@link V2RoomAttributes#name(String)}
   *   <li>{@link V2RoomAttributes#readOnly(Boolean)}
   *   <li>{@link V2RoomAttributes#setCopyProtected(Boolean)}
   *   <li>{@link V2RoomAttributes#setDescription(String)}
   *   <li>{@link V2RoomAttributes#setDiscoverable(Boolean)}
   *   <li>{@link V2RoomAttributes#setKeywords(List)}
   *   <li>{@link V2RoomAttributes#setMembersCanInvite(Boolean)}
   *   <li>{@link V2RoomAttributes#setName(String)}
   *   <li>{@link V2RoomAttributes#setPublic(Boolean)}
   *   <li>{@link V2RoomAttributes#setReadOnly(Boolean)}
   *   <li>{@link V2RoomAttributes#toString()}
   *   <li>{@link V2RoomAttributes#getCopyProtected()}
   *   <li>{@link V2RoomAttributes#getDescription()}
   *   <li>{@link V2RoomAttributes#getDiscoverable()}
   *   <li>{@link V2RoomAttributes#getKeywords()}
   *   <li>{@link V2RoomAttributes#getMembersCanInvite()}
   *   <li>{@link V2RoomAttributes#getName()}
   *   <li>{@link V2RoomAttributes#getPublic()}
   *   <li>{@link V2RoomAttributes#getReadOnly()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V2RoomAttributes.<init>()",
    "V2RoomAttributes V2RoomAttributes._public(Boolean)",
    "V2RoomAttributes V2RoomAttributes.copyProtected(Boolean)",
    "V2RoomAttributes V2RoomAttributes.description(String)",
    "V2RoomAttributes V2RoomAttributes.discoverable(Boolean)",
    "Boolean V2RoomAttributes.getCopyProtected()",
    "String V2RoomAttributes.getDescription()",
    "Boolean V2RoomAttributes.getDiscoverable()",
    "List V2RoomAttributes.getKeywords()",
    "Boolean V2RoomAttributes.getMembersCanInvite()",
    "String V2RoomAttributes.getName()",
    "Boolean V2RoomAttributes.getPublic()",
    "Boolean V2RoomAttributes.getReadOnly()",
    "V2RoomAttributes V2RoomAttributes.keywords(List)",
    "V2RoomAttributes V2RoomAttributes.membersCanInvite(Boolean)",
    "V2RoomAttributes V2RoomAttributes.name(String)",
    "V2RoomAttributes V2RoomAttributes.readOnly(Boolean)",
    "void V2RoomAttributes.setCopyProtected(Boolean)",
    "void V2RoomAttributes.setDescription(String)",
    "void V2RoomAttributes.setDiscoverable(Boolean)",
    "void V2RoomAttributes.setKeywords(List)",
    "void V2RoomAttributes.setMembersCanInvite(Boolean)",
    "void V2RoomAttributes.setName(String)",
    "void V2RoomAttributes.setPublic(Boolean)",
    "void V2RoomAttributes.setReadOnly(Boolean)",
    "String V2RoomAttributes.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V2RoomAttributes actualV2RoomAttributes = new V2RoomAttributes();
    V2RoomAttributes actual_publicResult = actualV2RoomAttributes._public(true);
    V2RoomAttributes actualCopyProtectedResult = actualV2RoomAttributes.copyProtected(true);
    V2RoomAttributes actualDescriptionResult =
        actualV2RoomAttributes.description("The characteristics of someone or something");
    V2RoomAttributes actualDiscoverableResult = actualV2RoomAttributes.discoverable(true);
    V2RoomAttributes actualKeywordsResult = actualV2RoomAttributes.keywords(new ArrayList<>());
    V2RoomAttributes actualMembersCanInviteResult = actualV2RoomAttributes.membersCanInvite(true);
    V2RoomAttributes actualNameResult = actualV2RoomAttributes.name("Name");
    V2RoomAttributes actualReadOnlyResult = actualV2RoomAttributes.readOnly(true);
    actualV2RoomAttributes.setCopyProtected(true);
    actualV2RoomAttributes.setDescription("The characteristics of someone or something");
    actualV2RoomAttributes.setDiscoverable(true);
    ArrayList<RoomTag> keywords = new ArrayList<>();
    actualV2RoomAttributes.setKeywords(keywords);
    actualV2RoomAttributes.setMembersCanInvite(true);
    actualV2RoomAttributes.setName("Name");
    actualV2RoomAttributes.setPublic(true);
    actualV2RoomAttributes.setReadOnly(true);
    String actualToStringResult = actualV2RoomAttributes.toString();
    Boolean actualCopyProtected = actualV2RoomAttributes.getCopyProtected();
    String actualDescription = actualV2RoomAttributes.getDescription();
    Boolean actualDiscoverable = actualV2RoomAttributes.getDiscoverable();
    List<RoomTag> actualKeywords = actualV2RoomAttributes.getKeywords();
    Boolean actualMembersCanInvite = actualV2RoomAttributes.getMembersCanInvite();
    String actualName = actualV2RoomAttributes.getName();
    Boolean actualPublic = actualV2RoomAttributes.getPublic();

    // Assert
    assertEquals("Name", actualName);
    assertEquals("The characteristics of someone or something", actualDescription);
    assertEquals(
        "class V2RoomAttributes {\n"
            + "    name: Name\n"
            + "    keywords: []\n"
            + "    description: The characteristics of someone or something\n"
            + "    membersCanInvite: true\n"
            + "    discoverable: true\n"
            + "    _public: true\n"
            + "    readOnly: true\n"
            + "    copyProtected: true\n"
            + "}",
        actualToStringResult);
    assertTrue(actualCopyProtected);
    assertTrue(actualDiscoverable);
    assertTrue(actualMembersCanInvite);
    assertTrue(actualPublic);
    assertTrue(actualV2RoomAttributes.getReadOnly());
    assertTrue(actualKeywords.isEmpty());
    assertSame(actualV2RoomAttributes, actual_publicResult);
    assertSame(actualV2RoomAttributes, actualCopyProtectedResult);
    assertSame(actualV2RoomAttributes, actualDescriptionResult);
    assertSame(actualV2RoomAttributes, actualDiscoverableResult);
    assertSame(actualV2RoomAttributes, actualKeywordsResult);
    assertSame(actualV2RoomAttributes, actualMembersCanInviteResult);
    assertSame(actualV2RoomAttributes, actualNameResult);
    assertSame(actualV2RoomAttributes, actualReadOnlyResult);
    assertSame(keywords, actualKeywords);
  }
}
