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

class V4StreamDiffblueTest {
  /**
   * Test {@link V4Stream#addMembersItem(V4User)}.
   * <ul>
   *   <li>Given {@link V4Stream} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Stream#addMembersItem(V4User)}
   */
  @Test
  @DisplayName("Test addMembersItem(V4User); given V4Stream (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V4Stream V4Stream.addMembersItem(V4User)"})
  void testAddMembersItem_givenV4Stream() {
    // Arrange
    V4Stream v4Stream = new V4Stream();

    // Act and Assert
    assertSame(v4Stream, v4Stream.addMembersItem(new V4User()));
  }

  /**
   * Test {@link V4Stream#addMembersItem(V4User)}.
   * <ul>
   *   <li>Given {@link V4Stream} (default constructor) members {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Stream#addMembersItem(V4User)}
   */
  @Test
  @DisplayName("Test addMembersItem(V4User); given V4Stream (default constructor) members ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V4Stream V4Stream.addMembersItem(V4User)"})
  void testAddMembersItem_givenV4StreamMembersArrayList() {
    // Arrange
    V4Stream v4Stream = new V4Stream();
    v4Stream.members(new ArrayList<>());

    // Act and Assert
    assertSame(v4Stream, v4Stream.addMembersItem(new V4User()));
  }

  /**
   * Test {@link V4Stream#addRecipientTenantIdsItem(Integer)}.
   * <ul>
   *   <li>Given {@link V4Stream} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Stream#addRecipientTenantIdsItem(Integer)}
   */
  @Test
  @DisplayName("Test addRecipientTenantIdsItem(Integer); given V4Stream (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V4Stream V4Stream.addRecipientTenantIdsItem(Integer)"})
  void testAddRecipientTenantIdsItem_givenV4Stream() {
    // Arrange
    V4Stream v4Stream = new V4Stream();

    // Act and Assert
    assertSame(v4Stream, v4Stream.addRecipientTenantIdsItem(1));
  }

  /**
   * Test {@link V4Stream#addRecipientTenantIdsItem(Integer)}.
   * <ul>
   *   <li>Given {@link V4Stream} (default constructor) recipientTenantIds {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Stream#addRecipientTenantIdsItem(Integer)}
   */
  @Test
  @DisplayName("Test addRecipientTenantIdsItem(Integer); given V4Stream (default constructor) recipientTenantIds ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"V4Stream V4Stream.addRecipientTenantIdsItem(Integer)"})
  void testAddRecipientTenantIdsItem_givenV4StreamRecipientTenantIdsArrayList() {
    // Arrange
    V4Stream v4Stream = new V4Stream();
    v4Stream.recipientTenantIds(new ArrayList<>());

    // Act and Assert
    assertSame(v4Stream, v4Stream.addRecipientTenantIdsItem(1));
  }

  /**
   * Test {@link V4Stream#equals(Object)}, and {@link V4Stream#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4Stream#equals(Object)}
   *   <li>{@link V4Stream#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4Stream.equals(Object)", "int V4Stream.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4Stream v4Stream = new V4Stream();
    V4Stream v4Stream2 = new V4Stream();

    // Act and Assert
    assertEquals(v4Stream, v4Stream2);
    int expectedHashCodeResult = v4Stream.hashCode();
    assertEquals(expectedHashCodeResult, v4Stream2.hashCode());
  }

  /**
   * Test {@link V4Stream#equals(Object)}, and {@link V4Stream#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4Stream#equals(Object)}
   *   <li>{@link V4Stream#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4Stream.equals(Object)", "int V4Stream.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4Stream v4Stream = new V4Stream();

    // Act and Assert
    assertEquals(v4Stream, v4Stream);
    int expectedHashCodeResult = v4Stream.hashCode();
    assertEquals(expectedHashCodeResult, v4Stream.hashCode());
  }

  /**
   * Test {@link V4Stream#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Stream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4Stream.equals(Object)", "int V4Stream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V4Stream v4Stream = new V4Stream();
    v4Stream.addMembersItem(new V4User());

    // Act and Assert
    assertNotEquals(v4Stream, new V4Stream());
  }

  /**
   * Test {@link V4Stream#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Stream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4Stream.equals(Object)", "int V4Stream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V4Stream v4Stream = new V4Stream();
    v4Stream.streamId("42");
    v4Stream.addMembersItem(new V4User());

    // Act and Assert
    assertNotEquals(v4Stream, new V4Stream());
  }

  /**
   * Test {@link V4Stream#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Stream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4Stream.equals(Object)", "int V4Stream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V4Stream v4Stream = new V4Stream();
    v4Stream.streamType("Stream Type");
    v4Stream.addMembersItem(new V4User());

    // Act and Assert
    assertNotEquals(v4Stream, new V4Stream());
  }

  /**
   * Test {@link V4Stream#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Stream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4Stream.equals(Object)", "int V4Stream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V4Stream v4Stream = new V4Stream();
    v4Stream.roomName("Room Name");
    v4Stream.addMembersItem(new V4User());

    // Act and Assert
    assertNotEquals(v4Stream, new V4Stream());
  }

  /**
   * Test {@link V4Stream#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Stream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4Stream.equals(Object)", "int V4Stream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V4Stream v4Stream = new V4Stream();
    v4Stream.addRecipientTenantIdsItem(1);

    // Act and Assert
    assertNotEquals(v4Stream, new V4Stream());
  }

  /**
   * Test {@link V4Stream#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Stream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4Stream.equals(Object)", "int V4Stream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    V4Stream v4Stream = new V4Stream();
    v4Stream.external(true);
    v4Stream.addRecipientTenantIdsItem(1);

    // Act and Assert
    assertNotEquals(v4Stream, new V4Stream());
  }

  /**
   * Test {@link V4Stream#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Stream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4Stream.equals(Object)", "int V4Stream.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    V4Stream v4Stream = new V4Stream();
    v4Stream.crossPod(true);
    v4Stream.addRecipientTenantIdsItem(1);

    // Act and Assert
    assertNotEquals(v4Stream, new V4Stream());
  }

  /**
   * Test {@link V4Stream#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Stream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4Stream.equals(Object)", "int V4Stream.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4Stream(), null);
  }

  /**
   * Test {@link V4Stream#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Stream#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V4Stream.equals(Object)", "int V4Stream.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4Stream(), "Different type to V4Stream");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V4Stream}
   *   <li>{@link V4Stream#crossPod(Boolean)}
   *   <li>{@link V4Stream#external(Boolean)}
   *   <li>{@link V4Stream#members(List)}
   *   <li>{@link V4Stream#recipientTenantIds(List)}
   *   <li>{@link V4Stream#roomName(String)}
   *   <li>{@link V4Stream#setCrossPod(Boolean)}
   *   <li>{@link V4Stream#setExternal(Boolean)}
   *   <li>{@link V4Stream#setMembers(List)}
   *   <li>{@link V4Stream#setRecipientTenantIds(List)}
   *   <li>{@link V4Stream#setRoomName(String)}
   *   <li>{@link V4Stream#setStreamId(String)}
   *   <li>{@link V4Stream#setStreamType(String)}
   *   <li>{@link V4Stream#streamId(String)}
   *   <li>{@link V4Stream#streamType(String)}
   *   <li>{@link V4Stream#toString()}
   *   <li>{@link V4Stream#getCrossPod()}
   *   <li>{@link V4Stream#getExternal()}
   *   <li>{@link V4Stream#getMembers()}
   *   <li>{@link V4Stream#getRecipientTenantIds()}
   *   <li>{@link V4Stream#getRoomName()}
   *   <li>{@link V4Stream#getStreamId()}
   *   <li>{@link V4Stream#getStreamType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V4Stream.<init>()", "V4Stream V4Stream.crossPod(Boolean)",
      "V4Stream V4Stream.external(Boolean)", "Boolean V4Stream.getCrossPod()", "Boolean V4Stream.getExternal()",
      "List V4Stream.getMembers()", "List V4Stream.getRecipientTenantIds()", "String V4Stream.getRoomName()",
      "String V4Stream.getStreamId()", "String V4Stream.getStreamType()", "V4Stream V4Stream.members(List)",
      "V4Stream V4Stream.recipientTenantIds(List)", "V4Stream V4Stream.roomName(String)",
      "void V4Stream.setCrossPod(Boolean)", "void V4Stream.setExternal(Boolean)", "void V4Stream.setMembers(List)",
      "void V4Stream.setRecipientTenantIds(List)", "void V4Stream.setRoomName(String)",
      "void V4Stream.setStreamId(String)", "void V4Stream.setStreamType(String)", "V4Stream V4Stream.streamId(String)",
      "V4Stream V4Stream.streamType(String)", "String V4Stream.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    V4Stream actualV4Stream = new V4Stream();
    V4Stream actualCrossPodResult = actualV4Stream.crossPod(true);
    V4Stream actualExternalResult = actualV4Stream.external(true);
    V4Stream actualMembersResult = actualV4Stream.members(new ArrayList<>());
    V4Stream actualRecipientTenantIdsResult = actualV4Stream.recipientTenantIds(new ArrayList<>());
    V4Stream actualRoomNameResult = actualV4Stream.roomName("Room Name");
    actualV4Stream.setCrossPod(true);
    actualV4Stream.setExternal(true);
    ArrayList<V4User> members = new ArrayList<>();
    actualV4Stream.setMembers(members);
    ArrayList<Integer> recipientTenantIds = new ArrayList<>();
    actualV4Stream.setRecipientTenantIds(recipientTenantIds);
    actualV4Stream.setRoomName("Room Name");
    actualV4Stream.setStreamId("42");
    actualV4Stream.setStreamType("Stream Type");
    V4Stream actualStreamIdResult = actualV4Stream.streamId("42");
    V4Stream actualStreamTypeResult = actualV4Stream.streamType("Stream Type");
    String actualToStringResult = actualV4Stream.toString();
    Boolean actualCrossPod = actualV4Stream.getCrossPod();
    Boolean actualExternal = actualV4Stream.getExternal();
    List<V4User> actualMembers = actualV4Stream.getMembers();
    List<Integer> actualRecipientTenantIds = actualV4Stream.getRecipientTenantIds();
    String actualRoomName = actualV4Stream.getRoomName();
    String actualStreamId = actualV4Stream.getStreamId();

    // Assert
    assertEquals("42", actualStreamId);
    assertEquals("Room Name", actualRoomName);
    assertEquals("Stream Type", actualV4Stream.getStreamType());
    assertEquals("class V4Stream {\n" + "    streamId: 42\n" + "    streamType: Stream Type\n"
        + "    roomName: Room Name\n" + "    members: []\n" + "    external: true\n" + "    crossPod: true\n"
        + "    recipientTenantIds: []\n" + "}", actualToStringResult);
    assertTrue(actualCrossPod);
    assertTrue(actualExternal);
    assertTrue(actualMembers.isEmpty());
    assertTrue(actualRecipientTenantIds.isEmpty());
    assertSame(actualV4Stream, actualCrossPodResult);
    assertSame(actualV4Stream, actualExternalResult);
    assertSame(actualV4Stream, actualMembersResult);
    assertSame(actualV4Stream, actualRecipientTenantIdsResult);
    assertSame(actualV4Stream, actualRoomNameResult);
    assertSame(actualV4Stream, actualStreamIdResult);
    assertSame(actualV4Stream, actualStreamTypeResult);
    assertSame(members, actualMembers);
    assertSame(recipientTenantIds, actualRecipientTenantIds);
  }
}
