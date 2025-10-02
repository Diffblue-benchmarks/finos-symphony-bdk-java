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

class V3RoomAttributesDiffblueTest {
  /**
   * Test {@link V3RoomAttributes#addKeywordsItem(RoomTag)}.
   *
   * <ul>
   *   <li>Given {@link V3RoomAttributes} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link V3RoomAttributes#addKeywordsItem(RoomTag)}
   */
  @Test
  @DisplayName("Test addKeywordsItem(RoomTag); given V3RoomAttributes (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V3RoomAttributes V3RoomAttributes.addKeywordsItem(RoomTag)"})
  void testAddKeywordsItem_givenV3RoomAttributes() {
    // Arrange
    V3RoomAttributes v3RoomAttributes = new V3RoomAttributes();

    // Act
    V3RoomAttributes actualAddKeywordsItemResult = v3RoomAttributes.addKeywordsItem(new RoomTag());

    // Assert
    assertSame(v3RoomAttributes, actualAddKeywordsItemResult);
  }

  /**
   * Test {@link V3RoomAttributes#addKeywordsItem(RoomTag)}.
   *
   * <ul>
   *   <li>Given {@link V3RoomAttributes} (default constructor) keywords {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link V3RoomAttributes#addKeywordsItem(RoomTag)}
   */
  @Test
  @DisplayName(
      "Test addKeywordsItem(RoomTag); given V3RoomAttributes (default constructor) keywords ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V3RoomAttributes V3RoomAttributes.addKeywordsItem(RoomTag)"})
  void testAddKeywordsItem_givenV3RoomAttributesKeywordsArrayList() {
    // Arrange
    V3RoomAttributes v3RoomAttributes = new V3RoomAttributes();
    v3RoomAttributes.keywords(new ArrayList<>());

    // Act
    V3RoomAttributes actualAddKeywordsItemResult = v3RoomAttributes.addKeywordsItem(new RoomTag());

    // Assert
    assertSame(v3RoomAttributes, actualAddKeywordsItemResult);
  }

  /**
   * Test {@link V3RoomAttributes#equals(Object)}, and {@link V3RoomAttributes#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3RoomAttributes#equals(Object)}
   *   <li>{@link V3RoomAttributes#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3RoomAttributes.equals(Object)", "int V3RoomAttributes.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V3RoomAttributes v3RoomAttributes = new V3RoomAttributes();
    V3RoomAttributes v3RoomAttributes2 = new V3RoomAttributes();

    // Act and Assert
    assertEquals(v3RoomAttributes, v3RoomAttributes2);
    assertEquals(v3RoomAttributes.hashCode(), v3RoomAttributes2.hashCode());
  }

  /**
   * Test {@link V3RoomAttributes#equals(Object)}, and {@link V3RoomAttributes#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V3RoomAttributes#equals(Object)}
   *   <li>{@link V3RoomAttributes#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3RoomAttributes.equals(Object)", "int V3RoomAttributes.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V3RoomAttributes v3RoomAttributes = new V3RoomAttributes();

    // Act and Assert
    assertEquals(v3RoomAttributes, v3RoomAttributes);
    int expectedHashCodeResult = v3RoomAttributes.hashCode();
    assertEquals(expectedHashCodeResult, v3RoomAttributes.hashCode());
  }

  /**
   * Test {@link V3RoomAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3RoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3RoomAttributes.equals(Object)", "int V3RoomAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V3RoomAttributes v3RoomAttributes = new V3RoomAttributes();
    v3RoomAttributes.addKeywordsItem(new RoomTag());

    // Act and Assert
    assertNotEquals(v3RoomAttributes, new V3RoomAttributes());
  }

  /**
   * Test {@link V3RoomAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3RoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3RoomAttributes.equals(Object)", "int V3RoomAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V3RoomAttributes v3RoomAttributes = new V3RoomAttributes();
    v3RoomAttributes.name("Name");
    v3RoomAttributes.addKeywordsItem(new RoomTag());

    // Act and Assert
    assertNotEquals(v3RoomAttributes, new V3RoomAttributes());
  }

  /**
   * Test {@link V3RoomAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3RoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3RoomAttributes.equals(Object)", "int V3RoomAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V3RoomAttributes v3RoomAttributes = new V3RoomAttributes();
    v3RoomAttributes.description("The characteristics of someone or something");

    // Act and Assert
    assertNotEquals(v3RoomAttributes, new V3RoomAttributes());
  }

  /**
   * Test {@link V3RoomAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3RoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3RoomAttributes.equals(Object)", "int V3RoomAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V3RoomAttributes v3RoomAttributes = new V3RoomAttributes();
    v3RoomAttributes.membersCanInvite(true);

    // Act and Assert
    assertNotEquals(v3RoomAttributes, new V3RoomAttributes());
  }

  /**
   * Test {@link V3RoomAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3RoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3RoomAttributes.equals(Object)", "int V3RoomAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V3RoomAttributes v3RoomAttributes = new V3RoomAttributes();
    v3RoomAttributes.discoverable(true);

    // Act and Assert
    assertNotEquals(v3RoomAttributes, new V3RoomAttributes());
  }

  /**
   * Test {@link V3RoomAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3RoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3RoomAttributes.equals(Object)", "int V3RoomAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    V3RoomAttributes v3RoomAttributes = new V3RoomAttributes();
    v3RoomAttributes._public(true);

    // Act and Assert
    assertNotEquals(v3RoomAttributes, new V3RoomAttributes());
  }

  /**
   * Test {@link V3RoomAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3RoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3RoomAttributes.equals(Object)", "int V3RoomAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    V3RoomAttributes v3RoomAttributes = new V3RoomAttributes();
    v3RoomAttributes.readOnly(true);

    // Act and Assert
    assertNotEquals(v3RoomAttributes, new V3RoomAttributes());
  }

  /**
   * Test {@link V3RoomAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3RoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3RoomAttributes.equals(Object)", "int V3RoomAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    V3RoomAttributes v3RoomAttributes = new V3RoomAttributes();
    v3RoomAttributes.copyProtected(true);

    // Act and Assert
    assertNotEquals(v3RoomAttributes, new V3RoomAttributes());
  }

  /**
   * Test {@link V3RoomAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3RoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3RoomAttributes.equals(Object)", "int V3RoomAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    V3RoomAttributes v3RoomAttributes = new V3RoomAttributes();
    v3RoomAttributes.crossPod(true);

    // Act and Assert
    assertNotEquals(v3RoomAttributes, new V3RoomAttributes());
  }

  /**
   * Test {@link V3RoomAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3RoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3RoomAttributes.equals(Object)", "int V3RoomAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual10() {
    // Arrange
    V3RoomAttributes v3RoomAttributes = new V3RoomAttributes();
    v3RoomAttributes.viewHistory(true);

    // Act and Assert
    assertNotEquals(v3RoomAttributes, new V3RoomAttributes());
  }

  /**
   * Test {@link V3RoomAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3RoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3RoomAttributes.equals(Object)", "int V3RoomAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual11() {
    // Arrange
    V3RoomAttributes v3RoomAttributes = new V3RoomAttributes();
    v3RoomAttributes.multiLateralRoom(true);

    // Act and Assert
    assertNotEquals(v3RoomAttributes, new V3RoomAttributes());
  }

  /**
   * Test {@link V3RoomAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3RoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3RoomAttributes.equals(Object)", "int V3RoomAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual12() {
    // Arrange
    V3RoomAttributes v3RoomAttributes = new V3RoomAttributes();
    v3RoomAttributes.scheduledMeeting(true);

    // Act and Assert
    assertNotEquals(v3RoomAttributes, new V3RoomAttributes());
  }

  /**
   * Test {@link V3RoomAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3RoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3RoomAttributes.equals(Object)", "int V3RoomAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual13() {
    // Arrange
    V3RoomAttributes v3RoomAttributes = new V3RoomAttributes();
    v3RoomAttributes.subType("Sub Type");

    // Act and Assert
    assertNotEquals(v3RoomAttributes, new V3RoomAttributes());
  }

  /**
   * Test {@link V3RoomAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3RoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3RoomAttributes.equals(Object)", "int V3RoomAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual14() {
    // Arrange
    V3RoomAttributes v3RoomAttributes = new V3RoomAttributes();
    v3RoomAttributes.pinnedMessageId("42");

    // Act and Assert
    assertNotEquals(v3RoomAttributes, new V3RoomAttributes());
  }

  /**
   * Test {@link V3RoomAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3RoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3RoomAttributes.equals(Object)", "int V3RoomAttributes.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3RoomAttributes(), null);
  }

  /**
   * Test {@link V3RoomAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V3RoomAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V3RoomAttributes.equals(Object)", "int V3RoomAttributes.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3RoomAttributes(), "Different type to V3RoomAttributes");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V3RoomAttributes}
   *   <li>{@link V3RoomAttributes#_public(Boolean)}
   *   <li>{@link V3RoomAttributes#copyProtected(Boolean)}
   *   <li>{@link V3RoomAttributes#crossPod(Boolean)}
   *   <li>{@link V3RoomAttributes#description(String)}
   *   <li>{@link V3RoomAttributes#discoverable(Boolean)}
   *   <li>{@link V3RoomAttributes#keywords(List)}
   *   <li>{@link V3RoomAttributes#membersCanInvite(Boolean)}
   *   <li>{@link V3RoomAttributes#multiLateralRoom(Boolean)}
   *   <li>{@link V3RoomAttributes#name(String)}
   *   <li>{@link V3RoomAttributes#pinnedMessageId(String)}
   *   <li>{@link V3RoomAttributes#readOnly(Boolean)}
   *   <li>{@link V3RoomAttributes#scheduledMeeting(Boolean)}
   *   <li>{@link V3RoomAttributes#setCopyProtected(Boolean)}
   *   <li>{@link V3RoomAttributes#setCrossPod(Boolean)}
   *   <li>{@link V3RoomAttributes#setDescription(String)}
   *   <li>{@link V3RoomAttributes#setDiscoverable(Boolean)}
   *   <li>{@link V3RoomAttributes#setKeywords(List)}
   *   <li>{@link V3RoomAttributes#setMembersCanInvite(Boolean)}
   *   <li>{@link V3RoomAttributes#setMultiLateralRoom(Boolean)}
   *   <li>{@link V3RoomAttributes#setName(String)}
   *   <li>{@link V3RoomAttributes#setPinnedMessageId(String)}
   *   <li>{@link V3RoomAttributes#setPublic(Boolean)}
   *   <li>{@link V3RoomAttributes#setReadOnly(Boolean)}
   *   <li>{@link V3RoomAttributes#setScheduledMeeting(Boolean)}
   *   <li>{@link V3RoomAttributes#setSubType(String)}
   *   <li>{@link V3RoomAttributes#setViewHistory(Boolean)}
   *   <li>{@link V3RoomAttributes#subType(String)}
   *   <li>{@link V3RoomAttributes#viewHistory(Boolean)}
   *   <li>{@link V3RoomAttributes#toString()}
   *   <li>{@link V3RoomAttributes#getCopyProtected()}
   *   <li>{@link V3RoomAttributes#getCrossPod()}
   *   <li>{@link V3RoomAttributes#getDescription()}
   *   <li>{@link V3RoomAttributes#getDiscoverable()}
   *   <li>{@link V3RoomAttributes#getKeywords()}
   *   <li>{@link V3RoomAttributes#getMembersCanInvite()}
   *   <li>{@link V3RoomAttributes#getMultiLateralRoom()}
   *   <li>{@link V3RoomAttributes#getName()}
   *   <li>{@link V3RoomAttributes#getPinnedMessageId()}
   *   <li>{@link V3RoomAttributes#getPublic()}
   *   <li>{@link V3RoomAttributes#getReadOnly()}
   *   <li>{@link V3RoomAttributes#getScheduledMeeting()}
   *   <li>{@link V3RoomAttributes#getSubType()}
   *   <li>{@link V3RoomAttributes#getViewHistory()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V3RoomAttributes.<init>()",
    "V3RoomAttributes V3RoomAttributes._public(Boolean)",
    "V3RoomAttributes V3RoomAttributes.copyProtected(Boolean)",
    "V3RoomAttributes V3RoomAttributes.crossPod(Boolean)",
    "V3RoomAttributes V3RoomAttributes.description(String)",
    "V3RoomAttributes V3RoomAttributes.discoverable(Boolean)",
    "Boolean V3RoomAttributes.getCopyProtected()",
    "Boolean V3RoomAttributes.getCrossPod()",
    "String V3RoomAttributes.getDescription()",
    "Boolean V3RoomAttributes.getDiscoverable()",
    "List V3RoomAttributes.getKeywords()",
    "Boolean V3RoomAttributes.getMembersCanInvite()",
    "Boolean V3RoomAttributes.getMultiLateralRoom()",
    "String V3RoomAttributes.getName()",
    "String V3RoomAttributes.getPinnedMessageId()",
    "Boolean V3RoomAttributes.getPublic()",
    "Boolean V3RoomAttributes.getReadOnly()",
    "Boolean V3RoomAttributes.getScheduledMeeting()",
    "String V3RoomAttributes.getSubType()",
    "Boolean V3RoomAttributes.getViewHistory()",
    "V3RoomAttributes V3RoomAttributes.keywords(List)",
    "V3RoomAttributes V3RoomAttributes.membersCanInvite(Boolean)",
    "V3RoomAttributes V3RoomAttributes.multiLateralRoom(Boolean)",
    "V3RoomAttributes V3RoomAttributes.name(String)",
    "V3RoomAttributes V3RoomAttributes.pinnedMessageId(String)",
    "V3RoomAttributes V3RoomAttributes.readOnly(Boolean)",
    "V3RoomAttributes V3RoomAttributes.scheduledMeeting(Boolean)",
    "void V3RoomAttributes.setCopyProtected(Boolean)",
    "void V3RoomAttributes.setCrossPod(Boolean)",
    "void V3RoomAttributes.setDescription(String)",
    "void V3RoomAttributes.setDiscoverable(Boolean)",
    "void V3RoomAttributes.setKeywords(List)",
    "void V3RoomAttributes.setMembersCanInvite(Boolean)",
    "void V3RoomAttributes.setMultiLateralRoom(Boolean)",
    "void V3RoomAttributes.setName(String)",
    "void V3RoomAttributes.setPinnedMessageId(String)",
    "void V3RoomAttributes.setPublic(Boolean)",
    "void V3RoomAttributes.setReadOnly(Boolean)",
    "void V3RoomAttributes.setScheduledMeeting(Boolean)",
    "void V3RoomAttributes.setSubType(String)",
    "void V3RoomAttributes.setViewHistory(Boolean)",
    "V3RoomAttributes V3RoomAttributes.subType(String)",
    "String V3RoomAttributes.toString()",
    "V3RoomAttributes V3RoomAttributes.viewHistory(Boolean)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    V3RoomAttributes actualV3RoomAttributes = new V3RoomAttributes();
    V3RoomAttributes actual_publicResult = actualV3RoomAttributes._public(true);
    V3RoomAttributes actualCopyProtectedResult = actualV3RoomAttributes.copyProtected(true);
    V3RoomAttributes actualCrossPodResult = actualV3RoomAttributes.crossPod(true);
    V3RoomAttributes actualDescriptionResult =
        actualV3RoomAttributes.description("The characteristics of someone or something");
    V3RoomAttributes actualDiscoverableResult = actualV3RoomAttributes.discoverable(true);
    V3RoomAttributes actualKeywordsResult = actualV3RoomAttributes.keywords(new ArrayList<>());
    V3RoomAttributes actualMembersCanInviteResult = actualV3RoomAttributes.membersCanInvite(true);
    V3RoomAttributes actualMultiLateralRoomResult = actualV3RoomAttributes.multiLateralRoom(true);
    V3RoomAttributes actualNameResult = actualV3RoomAttributes.name("Name");
    V3RoomAttributes actualPinnedMessageIdResult = actualV3RoomAttributes.pinnedMessageId("42");
    V3RoomAttributes actualReadOnlyResult = actualV3RoomAttributes.readOnly(true);
    V3RoomAttributes actualScheduledMeetingResult = actualV3RoomAttributes.scheduledMeeting(true);
    actualV3RoomAttributes.setCopyProtected(true);
    actualV3RoomAttributes.setCrossPod(true);
    actualV3RoomAttributes.setDescription("The characteristics of someone or something");
    actualV3RoomAttributes.setDiscoverable(true);
    ArrayList<RoomTag> keywords = new ArrayList<>();
    actualV3RoomAttributes.setKeywords(keywords);
    actualV3RoomAttributes.setMembersCanInvite(true);
    actualV3RoomAttributes.setMultiLateralRoom(true);
    actualV3RoomAttributes.setName("Name");
    actualV3RoomAttributes.setPinnedMessageId("42");
    actualV3RoomAttributes.setPublic(true);
    actualV3RoomAttributes.setReadOnly(true);
    actualV3RoomAttributes.setScheduledMeeting(true);
    actualV3RoomAttributes.setSubType("Sub Type");
    actualV3RoomAttributes.setViewHistory(true);
    V3RoomAttributes actualSubTypeResult = actualV3RoomAttributes.subType("Sub Type");
    V3RoomAttributes actualViewHistoryResult = actualV3RoomAttributes.viewHistory(true);
    String actualToStringResult = actualV3RoomAttributes.toString();
    Boolean actualCopyProtected = actualV3RoomAttributes.getCopyProtected();
    Boolean actualCrossPod = actualV3RoomAttributes.getCrossPod();
    String actualDescription = actualV3RoomAttributes.getDescription();
    Boolean actualDiscoverable = actualV3RoomAttributes.getDiscoverable();
    List<RoomTag> actualKeywords = actualV3RoomAttributes.getKeywords();
    Boolean actualMembersCanInvite = actualV3RoomAttributes.getMembersCanInvite();
    Boolean actualMultiLateralRoom = actualV3RoomAttributes.getMultiLateralRoom();
    String actualName = actualV3RoomAttributes.getName();
    String actualPinnedMessageId = actualV3RoomAttributes.getPinnedMessageId();
    Boolean actualPublic = actualV3RoomAttributes.getPublic();
    Boolean actualReadOnly = actualV3RoomAttributes.getReadOnly();
    Boolean actualScheduledMeeting = actualV3RoomAttributes.getScheduledMeeting();
    String actualSubType = actualV3RoomAttributes.getSubType();

    // Assert
    assertEquals("42", actualPinnedMessageId);
    assertEquals("Name", actualName);
    assertEquals("Sub Type", actualSubType);
    assertEquals("The characteristics of someone or something", actualDescription);
    assertEquals(
        "class V3RoomAttributes {\n"
            + "    name: Name\n"
            + "    keywords: []\n"
            + "    description: The characteristics of someone or something\n"
            + "    membersCanInvite: true\n"
            + "    discoverable: true\n"
            + "    _public: true\n"
            + "    readOnly: true\n"
            + "    copyProtected: true\n"
            + "    crossPod: true\n"
            + "    viewHistory: true\n"
            + "    multiLateralRoom: true\n"
            + "    scheduledMeeting: true\n"
            + "    subType: Sub Type\n"
            + "    pinnedMessageId: 42\n"
            + "}",
        actualToStringResult);
    assertTrue(actualCopyProtected);
    assertTrue(actualCrossPod);
    assertTrue(actualDiscoverable);
    assertTrue(actualMembersCanInvite);
    assertTrue(actualMultiLateralRoom);
    assertTrue(actualPublic);
    assertTrue(actualReadOnly);
    assertTrue(actualScheduledMeeting);
    assertTrue(actualV3RoomAttributes.getViewHistory());
    assertTrue(actualKeywords.isEmpty());
    assertSame(actualV3RoomAttributes, actual_publicResult);
    assertSame(actualV3RoomAttributes, actualCopyProtectedResult);
    assertSame(actualV3RoomAttributes, actualCrossPodResult);
    assertSame(actualV3RoomAttributes, actualDescriptionResult);
    assertSame(actualV3RoomAttributes, actualDiscoverableResult);
    assertSame(actualV3RoomAttributes, actualKeywordsResult);
    assertSame(actualV3RoomAttributes, actualMembersCanInviteResult);
    assertSame(actualV3RoomAttributes, actualMultiLateralRoomResult);
    assertSame(actualV3RoomAttributes, actualNameResult);
    assertSame(actualV3RoomAttributes, actualPinnedMessageIdResult);
    assertSame(actualV3RoomAttributes, actualReadOnlyResult);
    assertSame(actualV3RoomAttributes, actualScheduledMeetingResult);
    assertSame(actualV3RoomAttributes, actualSubTypeResult);
    assertSame(actualV3RoomAttributes, actualViewHistoryResult);
    assertSame(keywords, actualKeywords);
  }
}
