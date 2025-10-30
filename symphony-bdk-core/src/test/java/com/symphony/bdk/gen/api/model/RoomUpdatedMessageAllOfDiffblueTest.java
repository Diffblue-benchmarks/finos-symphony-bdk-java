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

class RoomUpdatedMessageAllOfDiffblueTest {
  /**
   * Test {@link RoomUpdatedMessageAllOf#addKeywordsItem(RoomTag)}.
   * <ul>
   *   <li>Given {@link RoomUpdatedMessageAllOf} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomUpdatedMessageAllOf#addKeywordsItem(RoomTag)}
   */
  @Test
  @DisplayName("Test addKeywordsItem(RoomTag); given RoomUpdatedMessageAllOf (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"RoomUpdatedMessageAllOf RoomUpdatedMessageAllOf.addKeywordsItem(RoomTag)"})
  void testAddKeywordsItem_givenRoomUpdatedMessageAllOf() {
    // Arrange
    RoomUpdatedMessageAllOf roomUpdatedMessageAllOf = new RoomUpdatedMessageAllOf();

    // Act and Assert
    assertSame(roomUpdatedMessageAllOf, roomUpdatedMessageAllOf.addKeywordsItem(new RoomTag()));
  }

  /**
   * Test {@link RoomUpdatedMessageAllOf#addKeywordsItem(RoomTag)}.
   * <ul>
   *   <li>Given {@link RoomUpdatedMessageAllOf} (default constructor) keywords {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomUpdatedMessageAllOf#addKeywordsItem(RoomTag)}
   */
  @Test
  @DisplayName("Test addKeywordsItem(RoomTag); given RoomUpdatedMessageAllOf (default constructor) keywords ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"RoomUpdatedMessageAllOf RoomUpdatedMessageAllOf.addKeywordsItem(RoomTag)"})
  void testAddKeywordsItem_givenRoomUpdatedMessageAllOfKeywordsArrayList() {
    // Arrange
    RoomUpdatedMessageAllOf roomUpdatedMessageAllOf = new RoomUpdatedMessageAllOf();
    roomUpdatedMessageAllOf.keywords(new ArrayList<>());

    // Act and Assert
    assertSame(roomUpdatedMessageAllOf, roomUpdatedMessageAllOf.addKeywordsItem(new RoomTag()));
  }

  /**
   * Test {@link RoomUpdatedMessageAllOf#equals(Object)}, and {@link RoomUpdatedMessageAllOf#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link RoomUpdatedMessageAllOf#equals(Object)}
   *   <li>{@link RoomUpdatedMessageAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomUpdatedMessageAllOf.equals(Object)", "int RoomUpdatedMessageAllOf.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    RoomUpdatedMessageAllOf roomUpdatedMessageAllOf = new RoomUpdatedMessageAllOf();
    RoomUpdatedMessageAllOf roomUpdatedMessageAllOf2 = new RoomUpdatedMessageAllOf();

    // Act and Assert
    assertEquals(roomUpdatedMessageAllOf, roomUpdatedMessageAllOf2);
    int expectedHashCodeResult = roomUpdatedMessageAllOf.hashCode();
    assertEquals(expectedHashCodeResult, roomUpdatedMessageAllOf2.hashCode());
  }

  /**
   * Test {@link RoomUpdatedMessageAllOf#equals(Object)}, and {@link RoomUpdatedMessageAllOf#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link RoomUpdatedMessageAllOf#equals(Object)}
   *   <li>{@link RoomUpdatedMessageAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomUpdatedMessageAllOf.equals(Object)", "int RoomUpdatedMessageAllOf.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    RoomUpdatedMessageAllOf roomUpdatedMessageAllOf = new RoomUpdatedMessageAllOf();

    // Act and Assert
    assertEquals(roomUpdatedMessageAllOf, roomUpdatedMessageAllOf);
    int expectedHashCodeResult = roomUpdatedMessageAllOf.hashCode();
    assertEquals(expectedHashCodeResult, roomUpdatedMessageAllOf.hashCode());
  }

  /**
   * Test {@link RoomUpdatedMessageAllOf#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomUpdatedMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomUpdatedMessageAllOf.equals(Object)", "int RoomUpdatedMessageAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    RoomUpdatedMessageAllOf roomUpdatedMessageAllOf = new RoomUpdatedMessageAllOf();
    roomUpdatedMessageAllOf.addKeywordsItem(new RoomTag());

    // Act and Assert
    assertNotEquals(roomUpdatedMessageAllOf, new RoomUpdatedMessageAllOf());
  }

  /**
   * Test {@link RoomUpdatedMessageAllOf#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomUpdatedMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomUpdatedMessageAllOf.equals(Object)", "int RoomUpdatedMessageAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    RoomUpdatedMessageAllOf roomUpdatedMessageAllOf = new RoomUpdatedMessageAllOf();
    roomUpdatedMessageAllOf.oldName("Old Name");
    roomUpdatedMessageAllOf.addKeywordsItem(new RoomTag());

    // Act and Assert
    assertNotEquals(roomUpdatedMessageAllOf, new RoomUpdatedMessageAllOf());
  }

  /**
   * Test {@link RoomUpdatedMessageAllOf#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomUpdatedMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomUpdatedMessageAllOf.equals(Object)", "int RoomUpdatedMessageAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    RoomUpdatedMessageAllOf roomUpdatedMessageAllOf = new RoomUpdatedMessageAllOf();
    roomUpdatedMessageAllOf.newName("New Name");
    roomUpdatedMessageAllOf.addKeywordsItem(new RoomTag());

    // Act and Assert
    assertNotEquals(roomUpdatedMessageAllOf, new RoomUpdatedMessageAllOf());
  }

  /**
   * Test {@link RoomUpdatedMessageAllOf#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomUpdatedMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomUpdatedMessageAllOf.equals(Object)", "int RoomUpdatedMessageAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    RoomUpdatedMessageAllOf roomUpdatedMessageAllOf = new RoomUpdatedMessageAllOf();
    roomUpdatedMessageAllOf.oldDescription("Old Description");

    // Act and Assert
    assertNotEquals(roomUpdatedMessageAllOf, new RoomUpdatedMessageAllOf());
  }

  /**
   * Test {@link RoomUpdatedMessageAllOf#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomUpdatedMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomUpdatedMessageAllOf.equals(Object)", "int RoomUpdatedMessageAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    RoomUpdatedMessageAllOf roomUpdatedMessageAllOf = new RoomUpdatedMessageAllOf();
    roomUpdatedMessageAllOf.newDescription("New Description");

    // Act and Assert
    assertNotEquals(roomUpdatedMessageAllOf, new RoomUpdatedMessageAllOf());
  }

  /**
   * Test {@link RoomUpdatedMessageAllOf#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomUpdatedMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomUpdatedMessageAllOf.equals(Object)", "int RoomUpdatedMessageAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    RoomUpdatedMessageAllOf roomUpdatedMessageAllOf = new RoomUpdatedMessageAllOf();
    roomUpdatedMessageAllOf.membersCanInvite(true);

    // Act and Assert
    assertNotEquals(roomUpdatedMessageAllOf, new RoomUpdatedMessageAllOf());
  }

  /**
   * Test {@link RoomUpdatedMessageAllOf#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomUpdatedMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomUpdatedMessageAllOf.equals(Object)", "int RoomUpdatedMessageAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    RoomUpdatedMessageAllOf roomUpdatedMessageAllOf = new RoomUpdatedMessageAllOf();
    roomUpdatedMessageAllOf.discoverable(true);

    // Act and Assert
    assertNotEquals(roomUpdatedMessageAllOf, new RoomUpdatedMessageAllOf());
  }

  /**
   * Test {@link RoomUpdatedMessageAllOf#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomUpdatedMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomUpdatedMessageAllOf.equals(Object)", "int RoomUpdatedMessageAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    RoomUpdatedMessageAllOf roomUpdatedMessageAllOf = new RoomUpdatedMessageAllOf();
    roomUpdatedMessageAllOf.readOnly(true);

    // Act and Assert
    assertNotEquals(roomUpdatedMessageAllOf, new RoomUpdatedMessageAllOf());
  }

  /**
   * Test {@link RoomUpdatedMessageAllOf#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomUpdatedMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomUpdatedMessageAllOf.equals(Object)", "int RoomUpdatedMessageAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    RoomUpdatedMessageAllOf roomUpdatedMessageAllOf = new RoomUpdatedMessageAllOf();
    roomUpdatedMessageAllOf.copyProtected(true);

    // Act and Assert
    assertNotEquals(roomUpdatedMessageAllOf, new RoomUpdatedMessageAllOf());
  }

  /**
   * Test {@link RoomUpdatedMessageAllOf#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomUpdatedMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomUpdatedMessageAllOf.equals(Object)", "int RoomUpdatedMessageAllOf.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomUpdatedMessageAllOf(), null);
  }

  /**
   * Test {@link RoomUpdatedMessageAllOf#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomUpdatedMessageAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RoomUpdatedMessageAllOf.equals(Object)", "int RoomUpdatedMessageAllOf.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomUpdatedMessageAllOf(), "Different type to RoomUpdatedMessageAllOf");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link RoomUpdatedMessageAllOf}
   *   <li>{@link RoomUpdatedMessageAllOf#copyProtected(Boolean)}
   *   <li>{@link RoomUpdatedMessageAllOf#discoverable(Boolean)}
   *   <li>{@link RoomUpdatedMessageAllOf#keywords(List)}
   *   <li>{@link RoomUpdatedMessageAllOf#membersCanInvite(Boolean)}
   *   <li>{@link RoomUpdatedMessageAllOf#newDescription(String)}
   *   <li>{@link RoomUpdatedMessageAllOf#newName(String)}
   *   <li>{@link RoomUpdatedMessageAllOf#oldDescription(String)}
   *   <li>{@link RoomUpdatedMessageAllOf#oldName(String)}
   *   <li>{@link RoomUpdatedMessageAllOf#readOnly(Boolean)}
   *   <li>{@link RoomUpdatedMessageAllOf#setCopyProtected(Boolean)}
   *   <li>{@link RoomUpdatedMessageAllOf#setDiscoverable(Boolean)}
   *   <li>{@link RoomUpdatedMessageAllOf#setKeywords(List)}
   *   <li>{@link RoomUpdatedMessageAllOf#setMembersCanInvite(Boolean)}
   *   <li>{@link RoomUpdatedMessageAllOf#setNewDescription(String)}
   *   <li>{@link RoomUpdatedMessageAllOf#setNewName(String)}
   *   <li>{@link RoomUpdatedMessageAllOf#setOldDescription(String)}
   *   <li>{@link RoomUpdatedMessageAllOf#setOldName(String)}
   *   <li>{@link RoomUpdatedMessageAllOf#setReadOnly(Boolean)}
   *   <li>{@link RoomUpdatedMessageAllOf#toString()}
   *   <li>{@link RoomUpdatedMessageAllOf#getCopyProtected()}
   *   <li>{@link RoomUpdatedMessageAllOf#getDiscoverable()}
   *   <li>{@link RoomUpdatedMessageAllOf#getKeywords()}
   *   <li>{@link RoomUpdatedMessageAllOf#getMembersCanInvite()}
   *   <li>{@link RoomUpdatedMessageAllOf#getNewDescription()}
   *   <li>{@link RoomUpdatedMessageAllOf#getNewName()}
   *   <li>{@link RoomUpdatedMessageAllOf#getOldDescription()}
   *   <li>{@link RoomUpdatedMessageAllOf#getOldName()}
   *   <li>{@link RoomUpdatedMessageAllOf#getReadOnly()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void RoomUpdatedMessageAllOf.<init>()",
      "RoomUpdatedMessageAllOf RoomUpdatedMessageAllOf.copyProtected(Boolean)",
      "RoomUpdatedMessageAllOf RoomUpdatedMessageAllOf.discoverable(Boolean)",
      "Boolean RoomUpdatedMessageAllOf.getCopyProtected()", "Boolean RoomUpdatedMessageAllOf.getDiscoverable()",
      "List RoomUpdatedMessageAllOf.getKeywords()", "Boolean RoomUpdatedMessageAllOf.getMembersCanInvite()",
      "String RoomUpdatedMessageAllOf.getNewDescription()", "String RoomUpdatedMessageAllOf.getNewName()",
      "String RoomUpdatedMessageAllOf.getOldDescription()", "String RoomUpdatedMessageAllOf.getOldName()",
      "Boolean RoomUpdatedMessageAllOf.getReadOnly()", "RoomUpdatedMessageAllOf RoomUpdatedMessageAllOf.keywords(List)",
      "RoomUpdatedMessageAllOf RoomUpdatedMessageAllOf.membersCanInvite(Boolean)",
      "RoomUpdatedMessageAllOf RoomUpdatedMessageAllOf.newDescription(String)",
      "RoomUpdatedMessageAllOf RoomUpdatedMessageAllOf.newName(String)",
      "RoomUpdatedMessageAllOf RoomUpdatedMessageAllOf.oldDescription(String)",
      "RoomUpdatedMessageAllOf RoomUpdatedMessageAllOf.oldName(String)",
      "RoomUpdatedMessageAllOf RoomUpdatedMessageAllOf.readOnly(Boolean)",
      "void RoomUpdatedMessageAllOf.setCopyProtected(Boolean)", "void RoomUpdatedMessageAllOf.setDiscoverable(Boolean)",
      "void RoomUpdatedMessageAllOf.setKeywords(List)", "void RoomUpdatedMessageAllOf.setMembersCanInvite(Boolean)",
      "void RoomUpdatedMessageAllOf.setNewDescription(String)", "void RoomUpdatedMessageAllOf.setNewName(String)",
      "void RoomUpdatedMessageAllOf.setOldDescription(String)", "void RoomUpdatedMessageAllOf.setOldName(String)",
      "void RoomUpdatedMessageAllOf.setReadOnly(Boolean)", "String RoomUpdatedMessageAllOf.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    RoomUpdatedMessageAllOf actualRoomUpdatedMessageAllOf = new RoomUpdatedMessageAllOf();
    RoomUpdatedMessageAllOf actualCopyProtectedResult = actualRoomUpdatedMessageAllOf.copyProtected(true);
    RoomUpdatedMessageAllOf actualDiscoverableResult = actualRoomUpdatedMessageAllOf.discoverable(true);
    RoomUpdatedMessageAllOf actualKeywordsResult = actualRoomUpdatedMessageAllOf.keywords(new ArrayList<>());
    RoomUpdatedMessageAllOf actualMembersCanInviteResult = actualRoomUpdatedMessageAllOf.membersCanInvite(true);
    RoomUpdatedMessageAllOf actualNewDescriptionResult = actualRoomUpdatedMessageAllOf
        .newDescription("New Description");
    RoomUpdatedMessageAllOf actualNewNameResult = actualRoomUpdatedMessageAllOf.newName("New Name");
    RoomUpdatedMessageAllOf actualOldDescriptionResult = actualRoomUpdatedMessageAllOf
        .oldDescription("Old Description");
    RoomUpdatedMessageAllOf actualOldNameResult = actualRoomUpdatedMessageAllOf.oldName("Old Name");
    RoomUpdatedMessageAllOf actualReadOnlyResult = actualRoomUpdatedMessageAllOf.readOnly(true);
    actualRoomUpdatedMessageAllOf.setCopyProtected(true);
    actualRoomUpdatedMessageAllOf.setDiscoverable(true);
    ArrayList<RoomTag> keywords = new ArrayList<>();
    actualRoomUpdatedMessageAllOf.setKeywords(keywords);
    actualRoomUpdatedMessageAllOf.setMembersCanInvite(true);
    actualRoomUpdatedMessageAllOf.setNewDescription("New Description");
    actualRoomUpdatedMessageAllOf.setNewName("New Name");
    actualRoomUpdatedMessageAllOf.setOldDescription("Old Description");
    actualRoomUpdatedMessageAllOf.setOldName("Old Name");
    actualRoomUpdatedMessageAllOf.setReadOnly(true);
    String actualToStringResult = actualRoomUpdatedMessageAllOf.toString();
    Boolean actualCopyProtected = actualRoomUpdatedMessageAllOf.getCopyProtected();
    Boolean actualDiscoverable = actualRoomUpdatedMessageAllOf.getDiscoverable();
    List<RoomTag> actualKeywords = actualRoomUpdatedMessageAllOf.getKeywords();
    Boolean actualMembersCanInvite = actualRoomUpdatedMessageAllOf.getMembersCanInvite();
    String actualNewDescription = actualRoomUpdatedMessageAllOf.getNewDescription();
    String actualNewName = actualRoomUpdatedMessageAllOf.getNewName();
    String actualOldDescription = actualRoomUpdatedMessageAllOf.getOldDescription();
    String actualOldName = actualRoomUpdatedMessageAllOf.getOldName();

    // Assert
    assertEquals("New Description", actualNewDescription);
    assertEquals("New Name", actualNewName);
    assertEquals("Old Description", actualOldDescription);
    assertEquals("Old Name", actualOldName);
    assertEquals("class RoomUpdatedMessageAllOf {\n" + "    oldName: Old Name\n" + "    newName: New Name\n"
        + "    keywords: []\n" + "    oldDescription: Old Description\n" + "    newDescription: New Description\n"
        + "    membersCanInvite: true\n" + "    discoverable: true\n" + "    readOnly: true\n"
        + "    copyProtected: true\n" + "}", actualToStringResult);
    assertTrue(actualCopyProtected);
    assertTrue(actualDiscoverable);
    assertTrue(actualMembersCanInvite);
    assertTrue(actualRoomUpdatedMessageAllOf.getReadOnly());
    assertTrue(actualKeywords.isEmpty());
    assertSame(actualRoomUpdatedMessageAllOf, actualCopyProtectedResult);
    assertSame(actualRoomUpdatedMessageAllOf, actualDiscoverableResult);
    assertSame(actualRoomUpdatedMessageAllOf, actualKeywordsResult);
    assertSame(actualRoomUpdatedMessageAllOf, actualMembersCanInviteResult);
    assertSame(actualRoomUpdatedMessageAllOf, actualNewDescriptionResult);
    assertSame(actualRoomUpdatedMessageAllOf, actualNewNameResult);
    assertSame(actualRoomUpdatedMessageAllOf, actualOldDescriptionResult);
    assertSame(actualRoomUpdatedMessageAllOf, actualOldNameResult);
    assertSame(actualRoomUpdatedMessageAllOf, actualReadOnlyResult);
    assertSame(keywords, actualKeywords);
  }
}
