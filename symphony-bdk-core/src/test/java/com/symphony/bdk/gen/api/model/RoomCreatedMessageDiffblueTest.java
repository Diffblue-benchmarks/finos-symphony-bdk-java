package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RoomCreatedMessageDiffblueTest {
  /**
   * Test {@link RoomCreatedMessage#addKeywordsItem(RoomTag)}.
   *
   * <ul>
   *   <li>Given {@link RoomCreatedMessage} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link RoomCreatedMessage#addKeywordsItem(RoomTag)}
   */
  @Test
  @DisplayName("Test addKeywordsItem(RoomTag); given RoomCreatedMessage (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RoomCreatedMessage RoomCreatedMessage.addKeywordsItem(RoomTag)"})
  void testAddKeywordsItem_givenRoomCreatedMessage() {
    // Arrange
    RoomCreatedMessage roomCreatedMessage = new RoomCreatedMessage();

    // Act and Assert
    assertSame(roomCreatedMessage, roomCreatedMessage.addKeywordsItem(new RoomTag()));
  }

  /**
   * Test {@link RoomCreatedMessage#addKeywordsItem(RoomTag)}.
   *
   * <ul>
   *   <li>Given {@link RoomCreatedMessage} (default constructor) keywords {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link RoomCreatedMessage#addKeywordsItem(RoomTag)}
   */
  @Test
  @DisplayName(
      "Test addKeywordsItem(RoomTag); given RoomCreatedMessage (default constructor) keywords ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RoomCreatedMessage RoomCreatedMessage.addKeywordsItem(RoomTag)"})
  void testAddKeywordsItem_givenRoomCreatedMessageKeywordsArrayList() {
    // Arrange
    RoomCreatedMessage roomCreatedMessage = new RoomCreatedMessage();
    roomCreatedMessage.keywords(new ArrayList<>());

    // Act and Assert
    assertSame(roomCreatedMessage, roomCreatedMessage.addKeywordsItem(new RoomTag()));
  }

  /**
   * Test {@link RoomCreatedMessage#equals(Object)}, and {@link RoomCreatedMessage#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RoomCreatedMessage#equals(Object)}
   *   <li>{@link RoomCreatedMessage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomCreatedMessage.equals(Object)",
    "int RoomCreatedMessage.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    RoomCreatedMessage roomCreatedMessage = new RoomCreatedMessage();
    RoomCreatedMessage roomCreatedMessage2 = new RoomCreatedMessage();

    // Act and Assert
    assertEquals(roomCreatedMessage, roomCreatedMessage2);
    int expectedHashCodeResult = roomCreatedMessage.hashCode();
    assertEquals(expectedHashCodeResult, roomCreatedMessage2.hashCode());
  }

  /**
   * Test {@link RoomCreatedMessage#equals(Object)}, and {@link RoomCreatedMessage#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RoomCreatedMessage#equals(Object)}
   *   <li>{@link RoomCreatedMessage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomCreatedMessage.equals(Object)",
    "int RoomCreatedMessage.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    RoomCreatedMessage roomCreatedMessage = new RoomCreatedMessage();

    // Act and Assert
    assertEquals(roomCreatedMessage, roomCreatedMessage);
    int expectedHashCodeResult = roomCreatedMessage.hashCode();
    assertEquals(expectedHashCodeResult, roomCreatedMessage.hashCode());
  }

  /**
   * Test {@link RoomCreatedMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomCreatedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomCreatedMessage.equals(Object)",
    "int RoomCreatedMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    RoomCreatedMessage roomCreatedMessage = new RoomCreatedMessage();
    roomCreatedMessage.addKeywordsItem(new RoomTag());

    // Act and Assert
    assertNotEquals(roomCreatedMessage, new RoomCreatedMessage());
  }

  /**
   * Test {@link RoomCreatedMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomCreatedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomCreatedMessage.equals(Object)",
    "int RoomCreatedMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    RoomCreatedMessage roomCreatedMessage = new RoomCreatedMessage();
    roomCreatedMessage.creationDate(1L);
    roomCreatedMessage.addKeywordsItem(new RoomTag());

    // Act and Assert
    assertNotEquals(roomCreatedMessage, new RoomCreatedMessage());
  }

  /**
   * Test {@link RoomCreatedMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomCreatedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomCreatedMessage.equals(Object)",
    "int RoomCreatedMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    RoomCreatedMessage roomCreatedMessage = new RoomCreatedMessage();
    roomCreatedMessage.name("Name");
    roomCreatedMessage.addKeywordsItem(new RoomTag());

    // Act and Assert
    assertNotEquals(roomCreatedMessage, new RoomCreatedMessage());
  }

  /**
   * Test {@link RoomCreatedMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomCreatedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomCreatedMessage.equals(Object)",
    "int RoomCreatedMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    RoomCreatedMessage roomCreatedMessage = new RoomCreatedMessage();
    roomCreatedMessage.description("The characteristics of someone or something");

    // Act and Assert
    assertNotEquals(roomCreatedMessage, new RoomCreatedMessage());
  }

  /**
   * Test {@link RoomCreatedMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomCreatedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomCreatedMessage.equals(Object)",
    "int RoomCreatedMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    RoomCreatedMessage roomCreatedMessage = new RoomCreatedMessage();
    roomCreatedMessage.createdByUserId(1L);

    // Act and Assert
    assertNotEquals(roomCreatedMessage, new RoomCreatedMessage());
  }

  /**
   * Test {@link RoomCreatedMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomCreatedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomCreatedMessage.equals(Object)",
    "int RoomCreatedMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    RoomCreatedMessage roomCreatedMessage = new RoomCreatedMessage();
    roomCreatedMessage.readOnly(true);

    // Act and Assert
    assertNotEquals(roomCreatedMessage, new RoomCreatedMessage());
  }

  /**
   * Test {@link RoomCreatedMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomCreatedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomCreatedMessage.equals(Object)",
    "int RoomCreatedMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    RoomCreatedMessage roomCreatedMessage = new RoomCreatedMessage();
    roomCreatedMessage.discoverable(true);

    // Act and Assert
    assertNotEquals(roomCreatedMessage, new RoomCreatedMessage());
  }

  /**
   * Test {@link RoomCreatedMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomCreatedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomCreatedMessage.equals(Object)",
    "int RoomCreatedMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    RoomCreatedMessage roomCreatedMessage = new RoomCreatedMessage();
    roomCreatedMessage._public(true);

    // Act and Assert
    assertNotEquals(roomCreatedMessage, new RoomCreatedMessage());
  }

  /**
   * Test {@link RoomCreatedMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomCreatedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomCreatedMessage.equals(Object)",
    "int RoomCreatedMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    RoomCreatedMessage roomCreatedMessage = new RoomCreatedMessage();
    roomCreatedMessage.membersCanInvite(true);

    // Act and Assert
    assertNotEquals(roomCreatedMessage, new RoomCreatedMessage());
  }

  /**
   * Test {@link RoomCreatedMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomCreatedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomCreatedMessage.equals(Object)",
    "int RoomCreatedMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual10() {
    // Arrange
    RoomCreatedMessage roomCreatedMessage = new RoomCreatedMessage();
    roomCreatedMessage.copyProtected(true);

    // Act and Assert
    assertNotEquals(roomCreatedMessage, new RoomCreatedMessage());
  }

  /**
   * Test {@link RoomCreatedMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomCreatedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomCreatedMessage.equals(Object)",
    "int RoomCreatedMessage.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual11() {
    // Arrange
    RoomCreatedMessage roomCreatedMessage = new RoomCreatedMessage();
    roomCreatedMessage.id("42");

    // Act and Assert
    assertNotEquals(roomCreatedMessage, new RoomCreatedMessage());
  }

  /**
   * Test {@link RoomCreatedMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomCreatedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomCreatedMessage.equals(Object)",
    "int RoomCreatedMessage.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomCreatedMessage(), null);
  }

  /**
   * Test {@link RoomCreatedMessage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomCreatedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomCreatedMessage.equals(Object)",
    "int RoomCreatedMessage.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomCreatedMessage(), "Different type to RoomCreatedMessage");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link RoomCreatedMessage}
   *   <li>{@link RoomCreatedMessage#_public(Boolean)}
   *   <li>{@link RoomCreatedMessage#copyProtected(Boolean)}
   *   <li>{@link RoomCreatedMessage#createdByUserId(Long)}
   *   <li>{@link RoomCreatedMessage#creationDate(Long)}
   *   <li>{@link RoomCreatedMessage#description(String)}
   *   <li>{@link RoomCreatedMessage#discoverable(Boolean)}
   *   <li>{@link RoomCreatedMessage#keywords(List)}
   *   <li>{@link RoomCreatedMessage#membersCanInvite(Boolean)}
   *   <li>{@link RoomCreatedMessage#name(String)}
   *   <li>{@link RoomCreatedMessage#readOnly(Boolean)}
   *   <li>{@link RoomCreatedMessage#setCopyProtected(Boolean)}
   *   <li>{@link RoomCreatedMessage#setCreatedByUserId(Long)}
   *   <li>{@link RoomCreatedMessage#setCreationDate(Long)}
   *   <li>{@link RoomCreatedMessage#setDescription(String)}
   *   <li>{@link RoomCreatedMessage#setDiscoverable(Boolean)}
   *   <li>{@link RoomCreatedMessage#setKeywords(List)}
   *   <li>{@link RoomCreatedMessage#setMembersCanInvite(Boolean)}
   *   <li>{@link RoomCreatedMessage#setName(String)}
   *   <li>{@link RoomCreatedMessage#setPublic(Boolean)}
   *   <li>{@link RoomCreatedMessage#setReadOnly(Boolean)}
   *   <li>{@link RoomCreatedMessage#toString()}
   *   <li>{@link RoomCreatedMessage#getCopyProtected()}
   *   <li>{@link RoomCreatedMessage#getCreatedByUserId()}
   *   <li>{@link RoomCreatedMessage#getCreationDate()}
   *   <li>{@link RoomCreatedMessage#getDescription()}
   *   <li>{@link RoomCreatedMessage#getDiscoverable()}
   *   <li>{@link RoomCreatedMessage#getKeywords()}
   *   <li>{@link RoomCreatedMessage#getMembersCanInvite()}
   *   <li>{@link RoomCreatedMessage#getName()}
   *   <li>{@link RoomCreatedMessage#getPublic()}
   *   <li>{@link RoomCreatedMessage#getReadOnly()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RoomCreatedMessage.<init>()",
    "RoomCreatedMessage RoomCreatedMessage._public(Boolean)",
    "RoomCreatedMessage RoomCreatedMessage.copyProtected(Boolean)",
    "RoomCreatedMessage RoomCreatedMessage.createdByUserId(Long)",
    "RoomCreatedMessage RoomCreatedMessage.creationDate(Long)",
    "RoomCreatedMessage RoomCreatedMessage.description(String)",
    "RoomCreatedMessage RoomCreatedMessage.discoverable(Boolean)",
    "Boolean RoomCreatedMessage.getCopyProtected()",
    "Long RoomCreatedMessage.getCreatedByUserId()",
    "Long RoomCreatedMessage.getCreationDate()",
    "String RoomCreatedMessage.getDescription()",
    "Boolean RoomCreatedMessage.getDiscoverable()",
    "List RoomCreatedMessage.getKeywords()",
    "Boolean RoomCreatedMessage.getMembersCanInvite()",
    "String RoomCreatedMessage.getName()",
    "Boolean RoomCreatedMessage.getPublic()",
    "Boolean RoomCreatedMessage.getReadOnly()",
    "RoomCreatedMessage RoomCreatedMessage.keywords(List)",
    "RoomCreatedMessage RoomCreatedMessage.membersCanInvite(Boolean)",
    "RoomCreatedMessage RoomCreatedMessage.name(String)",
    "RoomCreatedMessage RoomCreatedMessage.readOnly(Boolean)",
    "void RoomCreatedMessage.setCopyProtected(Boolean)",
    "void RoomCreatedMessage.setCreatedByUserId(Long)",
    "void RoomCreatedMessage.setCreationDate(Long)",
    "void RoomCreatedMessage.setDescription(String)",
    "void RoomCreatedMessage.setDiscoverable(Boolean)",
    "void RoomCreatedMessage.setKeywords(List)",
    "void RoomCreatedMessage.setMembersCanInvite(Boolean)",
    "void RoomCreatedMessage.setName(String)",
    "void RoomCreatedMessage.setPublic(Boolean)",
    "void RoomCreatedMessage.setReadOnly(Boolean)",
    "String RoomCreatedMessage.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    RoomCreatedMessage actualRoomCreatedMessage = new RoomCreatedMessage();
    RoomCreatedMessage actual_publicResult = actualRoomCreatedMessage._public(true);
    RoomCreatedMessage actualCopyProtectedResult = actualRoomCreatedMessage.copyProtected(true);
    RoomCreatedMessage actualCreatedByUserIdResult = actualRoomCreatedMessage.createdByUserId(1L);
    RoomCreatedMessage actualCreationDateResult = actualRoomCreatedMessage.creationDate(1L);
    RoomCreatedMessage actualDescriptionResult =
        actualRoomCreatedMessage.description("The characteristics of someone or something");
    RoomCreatedMessage actualDiscoverableResult = actualRoomCreatedMessage.discoverable(true);
    RoomCreatedMessage actualKeywordsResult = actualRoomCreatedMessage.keywords(new ArrayList<>());
    RoomCreatedMessage actualMembersCanInviteResult =
        actualRoomCreatedMessage.membersCanInvite(true);
    RoomCreatedMessage actualNameResult = actualRoomCreatedMessage.name("Name");
    RoomCreatedMessage actualReadOnlyResult = actualRoomCreatedMessage.readOnly(true);
    actualRoomCreatedMessage.setCopyProtected(true);
    actualRoomCreatedMessage.setCreatedByUserId(1L);
    actualRoomCreatedMessage.setCreationDate(1L);
    actualRoomCreatedMessage.setDescription("The characteristics of someone or something");
    actualRoomCreatedMessage.setDiscoverable(true);
    ArrayList<RoomTag> keywords = new ArrayList<>();
    actualRoomCreatedMessage.setKeywords(keywords);
    actualRoomCreatedMessage.setMembersCanInvite(true);
    actualRoomCreatedMessage.setName("Name");
    actualRoomCreatedMessage.setPublic(true);
    actualRoomCreatedMessage.setReadOnly(true);
    String actualToStringResult = actualRoomCreatedMessage.toString();
    Boolean actualCopyProtected = actualRoomCreatedMessage.getCopyProtected();
    Long actualCreatedByUserId = actualRoomCreatedMessage.getCreatedByUserId();
    Long actualCreationDate = actualRoomCreatedMessage.getCreationDate();
    String actualDescription = actualRoomCreatedMessage.getDescription();
    Boolean actualDiscoverable = actualRoomCreatedMessage.getDiscoverable();
    List<RoomTag> actualKeywords = actualRoomCreatedMessage.getKeywords();
    Boolean actualMembersCanInvite = actualRoomCreatedMessage.getMembersCanInvite();
    String actualName = actualRoomCreatedMessage.getName();
    Boolean actualPublic = actualRoomCreatedMessage.getPublic();
    Boolean actualReadOnly = actualRoomCreatedMessage.getReadOnly();

    // Assert
    assertEquals("Name", actualName);
    assertEquals("The characteristics of someone or something", actualDescription);
    assertEquals(
        "class RoomCreatedMessage {\n"
            + "    class V2BaseMessage {\n"
            + "        id: null\n"
            + "        timestamp: null\n"
            + "        v2messageType: null\n"
            + "        streamId: null\n"
            + "    }\n"
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
    assertNull(actualRoomCreatedMessage.getId());
    assertNull(actualRoomCreatedMessage.getStreamId());
    assertNull(actualRoomCreatedMessage.getTimestamp());
    assertNull(actualRoomCreatedMessage.getV2messageType());
    assertEquals(1L, actualCreatedByUserId.longValue());
    assertEquals(1L, actualCreationDate.longValue());
    assertTrue(actualCopyProtected);
    assertTrue(actualDiscoverable);
    assertTrue(actualMembersCanInvite);
    assertTrue(actualPublic);
    assertTrue(actualReadOnly);
    assertTrue(actualKeywords.isEmpty());
    assertSame(actualRoomCreatedMessage, actual_publicResult);
    assertSame(actualRoomCreatedMessage, actualCopyProtectedResult);
    assertSame(actualRoomCreatedMessage, actualCreatedByUserIdResult);
    assertSame(actualRoomCreatedMessage, actualCreationDateResult);
    assertSame(actualRoomCreatedMessage, actualDescriptionResult);
    assertSame(actualRoomCreatedMessage, actualDiscoverableResult);
    assertSame(actualRoomCreatedMessage, actualKeywordsResult);
    assertSame(actualRoomCreatedMessage, actualMembersCanInviteResult);
    assertSame(actualRoomCreatedMessage, actualNameResult);
    assertSame(actualRoomCreatedMessage, actualReadOnlyResult);
    assertSame(keywords, actualKeywords);
  }
}
