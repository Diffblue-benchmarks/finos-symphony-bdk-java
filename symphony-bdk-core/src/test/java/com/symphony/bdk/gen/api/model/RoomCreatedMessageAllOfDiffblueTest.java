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

class RoomCreatedMessageAllOfDiffblueTest {
  /**
   * Test {@link RoomCreatedMessageAllOf#addKeywordsItem(RoomTag)}.
   *
   * <ul>
   *   <li>Given {@link RoomCreatedMessageAllOf} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link RoomCreatedMessageAllOf#addKeywordsItem(RoomTag)}
   */
  @Test
  @DisplayName("Test addKeywordsItem(RoomTag); given RoomCreatedMessageAllOf (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RoomCreatedMessageAllOf RoomCreatedMessageAllOf.addKeywordsItem(RoomTag)"})
  void testAddKeywordsItem_givenRoomCreatedMessageAllOf() {
    // Arrange
    RoomCreatedMessageAllOf roomCreatedMessageAllOf = new RoomCreatedMessageAllOf();

    // Act
    RoomCreatedMessageAllOf actualAddKeywordsItemResult =
        roomCreatedMessageAllOf.addKeywordsItem(new RoomTag());

    // Assert
    assertSame(roomCreatedMessageAllOf, actualAddKeywordsItemResult);
  }

  /**
   * Test {@link RoomCreatedMessageAllOf#addKeywordsItem(RoomTag)}.
   *
   * <ul>
   *   <li>Given {@link RoomCreatedMessageAllOf} (default constructor) keywords {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link RoomCreatedMessageAllOf#addKeywordsItem(RoomTag)}
   */
  @Test
  @DisplayName(
      "Test addKeywordsItem(RoomTag); given RoomCreatedMessageAllOf (default constructor) keywords ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RoomCreatedMessageAllOf RoomCreatedMessageAllOf.addKeywordsItem(RoomTag)"})
  void testAddKeywordsItem_givenRoomCreatedMessageAllOfKeywordsArrayList() {
    // Arrange
    RoomCreatedMessageAllOf roomCreatedMessageAllOf = new RoomCreatedMessageAllOf();
    roomCreatedMessageAllOf.keywords(new ArrayList<>());

    // Act
    RoomCreatedMessageAllOf actualAddKeywordsItemResult =
        roomCreatedMessageAllOf.addKeywordsItem(new RoomTag());

    // Assert
    assertSame(roomCreatedMessageAllOf, actualAddKeywordsItemResult);
  }

  /**
   * Test {@link RoomCreatedMessageAllOf#equals(Object)}, and {@link
   * RoomCreatedMessageAllOf#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RoomCreatedMessageAllOf#equals(Object)}
   *   <li>{@link RoomCreatedMessageAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomCreatedMessageAllOf.equals(Object)",
    "int RoomCreatedMessageAllOf.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    RoomCreatedMessageAllOf roomCreatedMessageAllOf = new RoomCreatedMessageAllOf();
    RoomCreatedMessageAllOf roomCreatedMessageAllOf2 = new RoomCreatedMessageAllOf();

    // Act and Assert
    assertEquals(roomCreatedMessageAllOf, roomCreatedMessageAllOf2);
    assertEquals(roomCreatedMessageAllOf.hashCode(), roomCreatedMessageAllOf2.hashCode());
  }

  /**
   * Test {@link RoomCreatedMessageAllOf#equals(Object)}, and {@link
   * RoomCreatedMessageAllOf#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RoomCreatedMessageAllOf#equals(Object)}
   *   <li>{@link RoomCreatedMessageAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomCreatedMessageAllOf.equals(Object)",
    "int RoomCreatedMessageAllOf.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    RoomCreatedMessageAllOf roomCreatedMessageAllOf = new RoomCreatedMessageAllOf();

    // Act and Assert
    assertEquals(roomCreatedMessageAllOf, roomCreatedMessageAllOf);
    int expectedHashCodeResult = roomCreatedMessageAllOf.hashCode();
    assertEquals(expectedHashCodeResult, roomCreatedMessageAllOf.hashCode());
  }

  /**
   * Test {@link RoomCreatedMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomCreatedMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomCreatedMessageAllOf.equals(Object)",
    "int RoomCreatedMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    RoomCreatedMessageAllOf roomCreatedMessageAllOf = new RoomCreatedMessageAllOf();
    roomCreatedMessageAllOf.addKeywordsItem(new RoomTag());

    // Act and Assert
    assertNotEquals(roomCreatedMessageAllOf, new RoomCreatedMessageAllOf());
  }

  /**
   * Test {@link RoomCreatedMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomCreatedMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomCreatedMessageAllOf.equals(Object)",
    "int RoomCreatedMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    RoomCreatedMessageAllOf roomCreatedMessageAllOf = new RoomCreatedMessageAllOf();
    roomCreatedMessageAllOf.creationDate(1L);
    roomCreatedMessageAllOf.addKeywordsItem(new RoomTag());

    // Act and Assert
    assertNotEquals(roomCreatedMessageAllOf, new RoomCreatedMessageAllOf());
  }

  /**
   * Test {@link RoomCreatedMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomCreatedMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomCreatedMessageAllOf.equals(Object)",
    "int RoomCreatedMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    RoomCreatedMessageAllOf roomCreatedMessageAllOf = new RoomCreatedMessageAllOf();
    roomCreatedMessageAllOf.name("Name");
    roomCreatedMessageAllOf.addKeywordsItem(new RoomTag());

    // Act and Assert
    assertNotEquals(roomCreatedMessageAllOf, new RoomCreatedMessageAllOf());
  }

  /**
   * Test {@link RoomCreatedMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomCreatedMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomCreatedMessageAllOf.equals(Object)",
    "int RoomCreatedMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    RoomCreatedMessageAllOf roomCreatedMessageAllOf = new RoomCreatedMessageAllOf();
    roomCreatedMessageAllOf.description("The characteristics of someone or something");

    // Act and Assert
    assertNotEquals(roomCreatedMessageAllOf, new RoomCreatedMessageAllOf());
  }

  /**
   * Test {@link RoomCreatedMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomCreatedMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomCreatedMessageAllOf.equals(Object)",
    "int RoomCreatedMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    RoomCreatedMessageAllOf roomCreatedMessageAllOf = new RoomCreatedMessageAllOf();
    roomCreatedMessageAllOf.createdByUserId(1L);

    // Act and Assert
    assertNotEquals(roomCreatedMessageAllOf, new RoomCreatedMessageAllOf());
  }

  /**
   * Test {@link RoomCreatedMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomCreatedMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomCreatedMessageAllOf.equals(Object)",
    "int RoomCreatedMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    RoomCreatedMessageAllOf roomCreatedMessageAllOf = new RoomCreatedMessageAllOf();
    roomCreatedMessageAllOf.readOnly(true);

    // Act and Assert
    assertNotEquals(roomCreatedMessageAllOf, new RoomCreatedMessageAllOf());
  }

  /**
   * Test {@link RoomCreatedMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomCreatedMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomCreatedMessageAllOf.equals(Object)",
    "int RoomCreatedMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    RoomCreatedMessageAllOf roomCreatedMessageAllOf = new RoomCreatedMessageAllOf();
    roomCreatedMessageAllOf.discoverable(true);

    // Act and Assert
    assertNotEquals(roomCreatedMessageAllOf, new RoomCreatedMessageAllOf());
  }

  /**
   * Test {@link RoomCreatedMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomCreatedMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomCreatedMessageAllOf.equals(Object)",
    "int RoomCreatedMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    RoomCreatedMessageAllOf roomCreatedMessageAllOf = new RoomCreatedMessageAllOf();
    roomCreatedMessageAllOf._public(true);

    // Act and Assert
    assertNotEquals(roomCreatedMessageAllOf, new RoomCreatedMessageAllOf());
  }

  /**
   * Test {@link RoomCreatedMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomCreatedMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomCreatedMessageAllOf.equals(Object)",
    "int RoomCreatedMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    RoomCreatedMessageAllOf roomCreatedMessageAllOf = new RoomCreatedMessageAllOf();
    roomCreatedMessageAllOf.membersCanInvite(true);

    // Act and Assert
    assertNotEquals(roomCreatedMessageAllOf, new RoomCreatedMessageAllOf());
  }

  /**
   * Test {@link RoomCreatedMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomCreatedMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomCreatedMessageAllOf.equals(Object)",
    "int RoomCreatedMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual10() {
    // Arrange
    RoomCreatedMessageAllOf roomCreatedMessageAllOf = new RoomCreatedMessageAllOf();
    roomCreatedMessageAllOf.copyProtected(true);

    // Act and Assert
    assertNotEquals(roomCreatedMessageAllOf, new RoomCreatedMessageAllOf());
  }

  /**
   * Test {@link RoomCreatedMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomCreatedMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomCreatedMessageAllOf.equals(Object)",
    "int RoomCreatedMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomCreatedMessageAllOf(), null);
  }

  /**
   * Test {@link RoomCreatedMessageAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomCreatedMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomCreatedMessageAllOf.equals(Object)",
    "int RoomCreatedMessageAllOf.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomCreatedMessageAllOf(), "Different type to RoomCreatedMessageAllOf");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link RoomCreatedMessageAllOf}
   *   <li>{@link RoomCreatedMessageAllOf#_public(Boolean)}
   *   <li>{@link RoomCreatedMessageAllOf#copyProtected(Boolean)}
   *   <li>{@link RoomCreatedMessageAllOf#createdByUserId(Long)}
   *   <li>{@link RoomCreatedMessageAllOf#creationDate(Long)}
   *   <li>{@link RoomCreatedMessageAllOf#description(String)}
   *   <li>{@link RoomCreatedMessageAllOf#discoverable(Boolean)}
   *   <li>{@link RoomCreatedMessageAllOf#keywords(List)}
   *   <li>{@link RoomCreatedMessageAllOf#membersCanInvite(Boolean)}
   *   <li>{@link RoomCreatedMessageAllOf#name(String)}
   *   <li>{@link RoomCreatedMessageAllOf#readOnly(Boolean)}
   *   <li>{@link RoomCreatedMessageAllOf#setCopyProtected(Boolean)}
   *   <li>{@link RoomCreatedMessageAllOf#setCreatedByUserId(Long)}
   *   <li>{@link RoomCreatedMessageAllOf#setCreationDate(Long)}
   *   <li>{@link RoomCreatedMessageAllOf#setDescription(String)}
   *   <li>{@link RoomCreatedMessageAllOf#setDiscoverable(Boolean)}
   *   <li>{@link RoomCreatedMessageAllOf#setKeywords(List)}
   *   <li>{@link RoomCreatedMessageAllOf#setMembersCanInvite(Boolean)}
   *   <li>{@link RoomCreatedMessageAllOf#setName(String)}
   *   <li>{@link RoomCreatedMessageAllOf#setPublic(Boolean)}
   *   <li>{@link RoomCreatedMessageAllOf#setReadOnly(Boolean)}
   *   <li>{@link RoomCreatedMessageAllOf#toString()}
   *   <li>{@link RoomCreatedMessageAllOf#getCopyProtected()}
   *   <li>{@link RoomCreatedMessageAllOf#getCreatedByUserId()}
   *   <li>{@link RoomCreatedMessageAllOf#getCreationDate()}
   *   <li>{@link RoomCreatedMessageAllOf#getDescription()}
   *   <li>{@link RoomCreatedMessageAllOf#getDiscoverable()}
   *   <li>{@link RoomCreatedMessageAllOf#getKeywords()}
   *   <li>{@link RoomCreatedMessageAllOf#getMembersCanInvite()}
   *   <li>{@link RoomCreatedMessageAllOf#getName()}
   *   <li>{@link RoomCreatedMessageAllOf#getPublic()}
   *   <li>{@link RoomCreatedMessageAllOf#getReadOnly()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RoomCreatedMessageAllOf.<init>()",
    "RoomCreatedMessageAllOf RoomCreatedMessageAllOf._public(Boolean)",
    "RoomCreatedMessageAllOf RoomCreatedMessageAllOf.copyProtected(Boolean)",
    "RoomCreatedMessageAllOf RoomCreatedMessageAllOf.createdByUserId(Long)",
    "RoomCreatedMessageAllOf RoomCreatedMessageAllOf.creationDate(Long)",
    "RoomCreatedMessageAllOf RoomCreatedMessageAllOf.description(String)",
    "RoomCreatedMessageAllOf RoomCreatedMessageAllOf.discoverable(Boolean)",
    "Boolean RoomCreatedMessageAllOf.getCopyProtected()",
    "Long RoomCreatedMessageAllOf.getCreatedByUserId()",
    "Long RoomCreatedMessageAllOf.getCreationDate()",
    "String RoomCreatedMessageAllOf.getDescription()",
    "Boolean RoomCreatedMessageAllOf.getDiscoverable()",
    "List RoomCreatedMessageAllOf.getKeywords()",
    "Boolean RoomCreatedMessageAllOf.getMembersCanInvite()",
    "String RoomCreatedMessageAllOf.getName()",
    "Boolean RoomCreatedMessageAllOf.getPublic()",
    "Boolean RoomCreatedMessageAllOf.getReadOnly()",
    "RoomCreatedMessageAllOf RoomCreatedMessageAllOf.keywords(List)",
    "RoomCreatedMessageAllOf RoomCreatedMessageAllOf.membersCanInvite(Boolean)",
    "RoomCreatedMessageAllOf RoomCreatedMessageAllOf.name(String)",
    "RoomCreatedMessageAllOf RoomCreatedMessageAllOf.readOnly(Boolean)",
    "void RoomCreatedMessageAllOf.setCopyProtected(Boolean)",
    "void RoomCreatedMessageAllOf.setCreatedByUserId(Long)",
    "void RoomCreatedMessageAllOf.setCreationDate(Long)",
    "void RoomCreatedMessageAllOf.setDescription(String)",
    "void RoomCreatedMessageAllOf.setDiscoverable(Boolean)",
    "void RoomCreatedMessageAllOf.setKeywords(List)",
    "void RoomCreatedMessageAllOf.setMembersCanInvite(Boolean)",
    "void RoomCreatedMessageAllOf.setName(String)",
    "void RoomCreatedMessageAllOf.setPublic(Boolean)",
    "void RoomCreatedMessageAllOf.setReadOnly(Boolean)",
    "String RoomCreatedMessageAllOf.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    RoomCreatedMessageAllOf actualRoomCreatedMessageAllOf = new RoomCreatedMessageAllOf();
    RoomCreatedMessageAllOf actual_publicResult = actualRoomCreatedMessageAllOf._public(true);
    RoomCreatedMessageAllOf actualCopyProtectedResult =
        actualRoomCreatedMessageAllOf.copyProtected(true);
    RoomCreatedMessageAllOf actualCreatedByUserIdResult =
        actualRoomCreatedMessageAllOf.createdByUserId(1L);
    RoomCreatedMessageAllOf actualCreationDateResult =
        actualRoomCreatedMessageAllOf.creationDate(1L);
    RoomCreatedMessageAllOf actualDescriptionResult =
        actualRoomCreatedMessageAllOf.description("The characteristics of someone or something");
    RoomCreatedMessageAllOf actualDiscoverableResult =
        actualRoomCreatedMessageAllOf.discoverable(true);
    RoomCreatedMessageAllOf actualKeywordsResult =
        actualRoomCreatedMessageAllOf.keywords(new ArrayList<>());
    RoomCreatedMessageAllOf actualMembersCanInviteResult =
        actualRoomCreatedMessageAllOf.membersCanInvite(true);
    RoomCreatedMessageAllOf actualNameResult = actualRoomCreatedMessageAllOf.name("Name");
    RoomCreatedMessageAllOf actualReadOnlyResult = actualRoomCreatedMessageAllOf.readOnly(true);
    actualRoomCreatedMessageAllOf.setCopyProtected(true);
    actualRoomCreatedMessageAllOf.setCreatedByUserId(1L);
    actualRoomCreatedMessageAllOf.setCreationDate(1L);
    actualRoomCreatedMessageAllOf.setDescription("The characteristics of someone or something");
    actualRoomCreatedMessageAllOf.setDiscoverable(true);
    ArrayList<RoomTag> keywords = new ArrayList<>();
    actualRoomCreatedMessageAllOf.setKeywords(keywords);
    actualRoomCreatedMessageAllOf.setMembersCanInvite(true);
    actualRoomCreatedMessageAllOf.setName("Name");
    actualRoomCreatedMessageAllOf.setPublic(true);
    actualRoomCreatedMessageAllOf.setReadOnly(true);
    String actualToStringResult = actualRoomCreatedMessageAllOf.toString();
    Boolean actualCopyProtected = actualRoomCreatedMessageAllOf.getCopyProtected();
    Long actualCreatedByUserId = actualRoomCreatedMessageAllOf.getCreatedByUserId();
    Long actualCreationDate = actualRoomCreatedMessageAllOf.getCreationDate();
    String actualDescription = actualRoomCreatedMessageAllOf.getDescription();
    Boolean actualDiscoverable = actualRoomCreatedMessageAllOf.getDiscoverable();
    List<RoomTag> actualKeywords = actualRoomCreatedMessageAllOf.getKeywords();
    Boolean actualMembersCanInvite = actualRoomCreatedMessageAllOf.getMembersCanInvite();
    String actualName = actualRoomCreatedMessageAllOf.getName();
    Boolean actualPublic = actualRoomCreatedMessageAllOf.getPublic();
    Boolean actualReadOnly = actualRoomCreatedMessageAllOf.getReadOnly();

    // Assert
    assertEquals("Name", actualName);
    assertEquals("The characteristics of someone or something", actualDescription);
    assertEquals(
        "class RoomCreatedMessageAllOf {\n"
            + "    creationDate: 1\n"
            + "    name: Name\n"
            + "    keywords: []\n"
            + "    description: The characteristics of someone or something\n"
            + "    createdByUserId: 1\n"
            + "    readOnly: true\n"
            + "    discoverable: true\n"
            + "    _public: true\n"
            + "    membersCanInvite: true\n"
            + "    copyProtected: true\n"
            + "}",
        actualToStringResult);
    assertEquals(1L, actualCreatedByUserId.longValue());
    assertEquals(1L, actualCreationDate.longValue());
    assertTrue(actualCopyProtected);
    assertTrue(actualDiscoverable);
    assertTrue(actualMembersCanInvite);
    assertTrue(actualPublic);
    assertTrue(actualReadOnly);
    assertTrue(actualKeywords.isEmpty());
    assertSame(actualRoomCreatedMessageAllOf, actual_publicResult);
    assertSame(actualRoomCreatedMessageAllOf, actualCopyProtectedResult);
    assertSame(actualRoomCreatedMessageAllOf, actualCreatedByUserIdResult);
    assertSame(actualRoomCreatedMessageAllOf, actualCreationDateResult);
    assertSame(actualRoomCreatedMessageAllOf, actualDescriptionResult);
    assertSame(actualRoomCreatedMessageAllOf, actualDiscoverableResult);
    assertSame(actualRoomCreatedMessageAllOf, actualKeywordsResult);
    assertSame(actualRoomCreatedMessageAllOf, actualMembersCanInviteResult);
    assertSame(actualRoomCreatedMessageAllOf, actualNameResult);
    assertSame(actualRoomCreatedMessageAllOf, actualReadOnlyResult);
    assertSame(keywords, actualKeywords);
  }
}
