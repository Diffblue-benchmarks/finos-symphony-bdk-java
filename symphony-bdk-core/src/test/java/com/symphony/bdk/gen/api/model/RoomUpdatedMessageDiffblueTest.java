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

class RoomUpdatedMessageDiffblueTest {
  /**
   * Test {@link RoomUpdatedMessage#addKeywordsItem(RoomTag)}.
   * <ul>
   *   <li>Given {@link RoomUpdatedMessage} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomUpdatedMessage#addKeywordsItem(RoomTag)}
   */
  @Test
  @DisplayName("Test addKeywordsItem(RoomTag); given RoomUpdatedMessage (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"RoomUpdatedMessage RoomUpdatedMessage.addKeywordsItem(RoomTag)"})
  void testAddKeywordsItem_givenRoomUpdatedMessage() {
    // Arrange
    RoomUpdatedMessage roomUpdatedMessage = new RoomUpdatedMessage();

    // Act and Assert
    assertSame(roomUpdatedMessage, roomUpdatedMessage.addKeywordsItem(new RoomTag()));
  }

  /**
   * Test {@link RoomUpdatedMessage#addKeywordsItem(RoomTag)}.
   * <ul>
   *   <li>Given {@link RoomUpdatedMessage} (default constructor) keywords {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomUpdatedMessage#addKeywordsItem(RoomTag)}
   */
  @Test
  @DisplayName("Test addKeywordsItem(RoomTag); given RoomUpdatedMessage (default constructor) keywords ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"RoomUpdatedMessage RoomUpdatedMessage.addKeywordsItem(RoomTag)"})
  void testAddKeywordsItem_givenRoomUpdatedMessageKeywordsArrayList() {
    // Arrange
    RoomUpdatedMessage roomUpdatedMessage = new RoomUpdatedMessage();
    roomUpdatedMessage.keywords(new ArrayList<>());

    // Act and Assert
    assertSame(roomUpdatedMessage, roomUpdatedMessage.addKeywordsItem(new RoomTag()));
  }

  /**
   * Test {@link RoomUpdatedMessage#equals(Object)}, and {@link RoomUpdatedMessage#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link RoomUpdatedMessage#equals(Object)}
   *   <li>{@link RoomUpdatedMessage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomUpdatedMessage.equals(Object)", "int RoomUpdatedMessage.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    RoomUpdatedMessage roomUpdatedMessage = new RoomUpdatedMessage();
    RoomUpdatedMessage roomUpdatedMessage2 = new RoomUpdatedMessage();

    // Act and Assert
    assertEquals(roomUpdatedMessage, roomUpdatedMessage2);
    int expectedHashCodeResult = roomUpdatedMessage.hashCode();
    assertEquals(expectedHashCodeResult, roomUpdatedMessage2.hashCode());
  }

  /**
   * Test {@link RoomUpdatedMessage#equals(Object)}, and {@link RoomUpdatedMessage#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link RoomUpdatedMessage#equals(Object)}
   *   <li>{@link RoomUpdatedMessage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomUpdatedMessage.equals(Object)", "int RoomUpdatedMessage.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    RoomUpdatedMessage roomUpdatedMessage = new RoomUpdatedMessage();

    // Act and Assert
    assertEquals(roomUpdatedMessage, roomUpdatedMessage);
    int expectedHashCodeResult = roomUpdatedMessage.hashCode();
    assertEquals(expectedHashCodeResult, roomUpdatedMessage.hashCode());
  }

  /**
   * Test {@link RoomUpdatedMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomUpdatedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomUpdatedMessage.equals(Object)", "int RoomUpdatedMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    RoomUpdatedMessage roomUpdatedMessage = new RoomUpdatedMessage();
    roomUpdatedMessage.addKeywordsItem(new RoomTag());

    // Act and Assert
    assertNotEquals(roomUpdatedMessage, new RoomUpdatedMessage());
  }

  /**
   * Test {@link RoomUpdatedMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomUpdatedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomUpdatedMessage.equals(Object)", "int RoomUpdatedMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    RoomUpdatedMessage roomUpdatedMessage = new RoomUpdatedMessage();
    roomUpdatedMessage.oldName("Old Name");
    roomUpdatedMessage.addKeywordsItem(new RoomTag());

    // Act and Assert
    assertNotEquals(roomUpdatedMessage, new RoomUpdatedMessage());
  }

  /**
   * Test {@link RoomUpdatedMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomUpdatedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomUpdatedMessage.equals(Object)", "int RoomUpdatedMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    RoomUpdatedMessage roomUpdatedMessage = new RoomUpdatedMessage();
    roomUpdatedMessage.newName("New Name");
    roomUpdatedMessage.addKeywordsItem(new RoomTag());

    // Act and Assert
    assertNotEquals(roomUpdatedMessage, new RoomUpdatedMessage());
  }

  /**
   * Test {@link RoomUpdatedMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomUpdatedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomUpdatedMessage.equals(Object)", "int RoomUpdatedMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    RoomUpdatedMessage roomUpdatedMessage = new RoomUpdatedMessage();
    roomUpdatedMessage.oldDescription("Old Description");

    // Act and Assert
    assertNotEquals(roomUpdatedMessage, new RoomUpdatedMessage());
  }

  /**
   * Test {@link RoomUpdatedMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomUpdatedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomUpdatedMessage.equals(Object)", "int RoomUpdatedMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    RoomUpdatedMessage roomUpdatedMessage = new RoomUpdatedMessage();
    roomUpdatedMessage.newDescription("New Description");

    // Act and Assert
    assertNotEquals(roomUpdatedMessage, new RoomUpdatedMessage());
  }

  /**
   * Test {@link RoomUpdatedMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomUpdatedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomUpdatedMessage.equals(Object)", "int RoomUpdatedMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    RoomUpdatedMessage roomUpdatedMessage = new RoomUpdatedMessage();
    roomUpdatedMessage.membersCanInvite(true);

    // Act and Assert
    assertNotEquals(roomUpdatedMessage, new RoomUpdatedMessage());
  }

  /**
   * Test {@link RoomUpdatedMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomUpdatedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomUpdatedMessage.equals(Object)", "int RoomUpdatedMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    RoomUpdatedMessage roomUpdatedMessage = new RoomUpdatedMessage();
    roomUpdatedMessage.discoverable(true);

    // Act and Assert
    assertNotEquals(roomUpdatedMessage, new RoomUpdatedMessage());
  }

  /**
   * Test {@link RoomUpdatedMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomUpdatedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomUpdatedMessage.equals(Object)", "int RoomUpdatedMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    RoomUpdatedMessage roomUpdatedMessage = new RoomUpdatedMessage();
    roomUpdatedMessage.readOnly(true);

    // Act and Assert
    assertNotEquals(roomUpdatedMessage, new RoomUpdatedMessage());
  }

  /**
   * Test {@link RoomUpdatedMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomUpdatedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomUpdatedMessage.equals(Object)", "int RoomUpdatedMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    RoomUpdatedMessage roomUpdatedMessage = new RoomUpdatedMessage();
    roomUpdatedMessage.copyProtected(true);

    // Act and Assert
    assertNotEquals(roomUpdatedMessage, new RoomUpdatedMessage());
  }

  /**
   * Test {@link RoomUpdatedMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomUpdatedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomUpdatedMessage.equals(Object)", "int RoomUpdatedMessage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual10() {
    // Arrange
    RoomUpdatedMessage roomUpdatedMessage = new RoomUpdatedMessage();
    roomUpdatedMessage.id("42");

    // Act and Assert
    assertNotEquals(roomUpdatedMessage, new RoomUpdatedMessage());
  }

  /**
   * Test {@link RoomUpdatedMessage#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomUpdatedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomUpdatedMessage.equals(Object)", "int RoomUpdatedMessage.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomUpdatedMessage(), null);
  }

  /**
   * Test {@link RoomUpdatedMessage#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomUpdatedMessage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomUpdatedMessage.equals(Object)", "int RoomUpdatedMessage.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomUpdatedMessage(), "Different type to RoomUpdatedMessage");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link RoomUpdatedMessage}
   *   <li>{@link RoomUpdatedMessage#copyProtected(Boolean)}
   *   <li>{@link RoomUpdatedMessage#discoverable(Boolean)}
   *   <li>{@link RoomUpdatedMessage#keywords(List)}
   *   <li>{@link RoomUpdatedMessage#membersCanInvite(Boolean)}
   *   <li>{@link RoomUpdatedMessage#newDescription(String)}
   *   <li>{@link RoomUpdatedMessage#newName(String)}
   *   <li>{@link RoomUpdatedMessage#oldDescription(String)}
   *   <li>{@link RoomUpdatedMessage#oldName(String)}
   *   <li>{@link RoomUpdatedMessage#readOnly(Boolean)}
   *   <li>{@link RoomUpdatedMessage#setCopyProtected(Boolean)}
   *   <li>{@link RoomUpdatedMessage#setDiscoverable(Boolean)}
   *   <li>{@link RoomUpdatedMessage#setKeywords(List)}
   *   <li>{@link RoomUpdatedMessage#setMembersCanInvite(Boolean)}
   *   <li>{@link RoomUpdatedMessage#setNewDescription(String)}
   *   <li>{@link RoomUpdatedMessage#setNewName(String)}
   *   <li>{@link RoomUpdatedMessage#setOldDescription(String)}
   *   <li>{@link RoomUpdatedMessage#setOldName(String)}
   *   <li>{@link RoomUpdatedMessage#setReadOnly(Boolean)}
   *   <li>{@link RoomUpdatedMessage#toString()}
   *   <li>{@link RoomUpdatedMessage#getCopyProtected()}
   *   <li>{@link RoomUpdatedMessage#getDiscoverable()}
   *   <li>{@link RoomUpdatedMessage#getKeywords()}
   *   <li>{@link RoomUpdatedMessage#getMembersCanInvite()}
   *   <li>{@link RoomUpdatedMessage#getNewDescription()}
   *   <li>{@link RoomUpdatedMessage#getNewName()}
   *   <li>{@link RoomUpdatedMessage#getOldDescription()}
   *   <li>{@link RoomUpdatedMessage#getOldName()}
   *   <li>{@link RoomUpdatedMessage#getReadOnly()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void RoomUpdatedMessage.<init>()", "RoomUpdatedMessage RoomUpdatedMessage.copyProtected(Boolean)",
      "RoomUpdatedMessage RoomUpdatedMessage.discoverable(Boolean)", "Boolean RoomUpdatedMessage.getCopyProtected()",
      "Boolean RoomUpdatedMessage.getDiscoverable()", "List RoomUpdatedMessage.getKeywords()",
      "Boolean RoomUpdatedMessage.getMembersCanInvite()", "String RoomUpdatedMessage.getNewDescription()",
      "String RoomUpdatedMessage.getNewName()", "String RoomUpdatedMessage.getOldDescription()",
      "String RoomUpdatedMessage.getOldName()", "Boolean RoomUpdatedMessage.getReadOnly()",
      "RoomUpdatedMessage RoomUpdatedMessage.keywords(List)",
      "RoomUpdatedMessage RoomUpdatedMessage.membersCanInvite(Boolean)",
      "RoomUpdatedMessage RoomUpdatedMessage.newDescription(String)",
      "RoomUpdatedMessage RoomUpdatedMessage.newName(String)",
      "RoomUpdatedMessage RoomUpdatedMessage.oldDescription(String)",
      "RoomUpdatedMessage RoomUpdatedMessage.oldName(String)",
      "RoomUpdatedMessage RoomUpdatedMessage.readOnly(Boolean)", "void RoomUpdatedMessage.setCopyProtected(Boolean)",
      "void RoomUpdatedMessage.setDiscoverable(Boolean)", "void RoomUpdatedMessage.setKeywords(List)",
      "void RoomUpdatedMessage.setMembersCanInvite(Boolean)", "void RoomUpdatedMessage.setNewDescription(String)",
      "void RoomUpdatedMessage.setNewName(String)", "void RoomUpdatedMessage.setOldDescription(String)",
      "void RoomUpdatedMessage.setOldName(String)", "void RoomUpdatedMessage.setReadOnly(Boolean)",
      "String RoomUpdatedMessage.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    RoomUpdatedMessage actualRoomUpdatedMessage = new RoomUpdatedMessage();
    RoomUpdatedMessage actualCopyProtectedResult = actualRoomUpdatedMessage.copyProtected(true);
    RoomUpdatedMessage actualDiscoverableResult = actualRoomUpdatedMessage.discoverable(true);
    RoomUpdatedMessage actualKeywordsResult = actualRoomUpdatedMessage.keywords(new ArrayList<>());
    RoomUpdatedMessage actualMembersCanInviteResult = actualRoomUpdatedMessage.membersCanInvite(true);
    RoomUpdatedMessage actualNewDescriptionResult = actualRoomUpdatedMessage.newDescription("New Description");
    RoomUpdatedMessage actualNewNameResult = actualRoomUpdatedMessage.newName("New Name");
    RoomUpdatedMessage actualOldDescriptionResult = actualRoomUpdatedMessage.oldDescription("Old Description");
    RoomUpdatedMessage actualOldNameResult = actualRoomUpdatedMessage.oldName("Old Name");
    RoomUpdatedMessage actualReadOnlyResult = actualRoomUpdatedMessage.readOnly(true);
    actualRoomUpdatedMessage.setCopyProtected(true);
    actualRoomUpdatedMessage.setDiscoverable(true);
    ArrayList<RoomTag> keywords = new ArrayList<>();
    actualRoomUpdatedMessage.setKeywords(keywords);
    actualRoomUpdatedMessage.setMembersCanInvite(true);
    actualRoomUpdatedMessage.setNewDescription("New Description");
    actualRoomUpdatedMessage.setNewName("New Name");
    actualRoomUpdatedMessage.setOldDescription("Old Description");
    actualRoomUpdatedMessage.setOldName("Old Name");
    actualRoomUpdatedMessage.setReadOnly(true);
    String actualToStringResult = actualRoomUpdatedMessage.toString();
    Boolean actualCopyProtected = actualRoomUpdatedMessage.getCopyProtected();
    Boolean actualDiscoverable = actualRoomUpdatedMessage.getDiscoverable();
    List<RoomTag> actualKeywords = actualRoomUpdatedMessage.getKeywords();
    Boolean actualMembersCanInvite = actualRoomUpdatedMessage.getMembersCanInvite();
    String actualNewDescription = actualRoomUpdatedMessage.getNewDescription();
    String actualNewName = actualRoomUpdatedMessage.getNewName();
    String actualOldDescription = actualRoomUpdatedMessage.getOldDescription();
    String actualOldName = actualRoomUpdatedMessage.getOldName();
    Boolean actualReadOnly = actualRoomUpdatedMessage.getReadOnly();

    // Assert
    assertEquals("New Description", actualNewDescription);
    assertEquals("New Name", actualNewName);
    assertEquals("Old Description", actualOldDescription);
    assertEquals("Old Name", actualOldName);
    assertEquals("class RoomUpdatedMessage {\n" + "    class V2BaseMessage {\n" + "        id: null\n"
        + "        timestamp: null\n" + "        v2messageType: null\n" + "        streamId: null\n" + "    }\n"
        + "    oldName: Old Name\n" + "    newName: New Name\n" + "    keywords: []\n"
        + "    oldDescription: Old Description\n" + "    newDescription: New Description\n"
        + "    membersCanInvite: true\n" + "    discoverable: true\n" + "    readOnly: true\n"
        + "    copyProtected: true\n" + "}", actualToStringResult);
    assertNull(actualRoomUpdatedMessage.getId());
    assertNull(actualRoomUpdatedMessage.getStreamId());
    assertNull(actualRoomUpdatedMessage.getTimestamp());
    assertNull(actualRoomUpdatedMessage.getV2messageType());
    assertTrue(actualCopyProtected);
    assertTrue(actualDiscoverable);
    assertTrue(actualMembersCanInvite);
    assertTrue(actualReadOnly);
    assertTrue(actualKeywords.isEmpty());
    assertSame(actualRoomUpdatedMessage, actualCopyProtectedResult);
    assertSame(actualRoomUpdatedMessage, actualDiscoverableResult);
    assertSame(actualRoomUpdatedMessage, actualKeywordsResult);
    assertSame(actualRoomUpdatedMessage, actualMembersCanInviteResult);
    assertSame(actualRoomUpdatedMessage, actualNewDescriptionResult);
    assertSame(actualRoomUpdatedMessage, actualNewNameResult);
    assertSame(actualRoomUpdatedMessage, actualOldDescriptionResult);
    assertSame(actualRoomUpdatedMessage, actualOldNameResult);
    assertSame(actualRoomUpdatedMessage, actualReadOnlyResult);
    assertSame(keywords, actualKeywords);
  }
}
