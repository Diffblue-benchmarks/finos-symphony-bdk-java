package com.symphony.bdk.core.activity.room;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.V4Initiator;
import com.symphony.bdk.gen.api.model.V4UserJoinedRoom;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserJoinedRoomContextDiffblueTest {
  /**
   * Test {@link UserJoinedRoomContext#UserJoinedRoomContext(V4Initiator, V4UserJoinedRoom)}.
   * <ul>
   *   <li>When {@link V4UserJoinedRoom} (default constructor).</li>
   *   <li>Then return EventTimestamp is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserJoinedRoomContext#UserJoinedRoomContext(V4Initiator, V4UserJoinedRoom)}
   */
  @Test
  @DisplayName("Test new UserJoinedRoomContext(V4Initiator, V4UserJoinedRoom); when V4UserJoinedRoom (default constructor); then return EventTimestamp is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void UserJoinedRoomContext.<init>(V4Initiator, V4UserJoinedRoom)"})
  void testNewUserJoinedRoomContext_whenV4UserJoinedRoom_thenReturnEventTimestampIsNull() {
    // Arrange
    V4Initiator initiator = new V4Initiator();
    V4UserJoinedRoom sourceEvent = new V4UserJoinedRoom();

    // Act
    UserJoinedRoomContext actualUserJoinedRoomContext = new UserJoinedRoomContext(initiator, sourceEvent);

    // Assert
    assertNull(actualUserJoinedRoomContext.getEventTimestamp());
    assertNull(actualUserJoinedRoomContext.getUserId());
    assertNull(actualUserJoinedRoomContext.getRoomId());
    assertSame(initiator, actualUserJoinedRoomContext.getInitiator());
    assertSame(sourceEvent, actualUserJoinedRoomContext.getSourceEvent());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserJoinedRoomContext#setRoomId(String)}
   *   <li>{@link UserJoinedRoomContext#setUserId(Long)}
   *   <li>{@link UserJoinedRoomContext#getRoomId()}
   *   <li>{@link UserJoinedRoomContext#getUserId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String UserJoinedRoomContext.getRoomId()", "Long UserJoinedRoomContext.getUserId()",
      "void UserJoinedRoomContext.setRoomId(String)", "void UserJoinedRoomContext.setUserId(Long)"})
  void testGettersAndSetters() {
    // Arrange
    V4Initiator initiator = new V4Initiator();
    UserJoinedRoomContext userJoinedRoomContext = new UserJoinedRoomContext(initiator, new V4UserJoinedRoom());

    // Act
    userJoinedRoomContext.setRoomId("42");
    userJoinedRoomContext.setUserId(1L);
    String actualRoomId = userJoinedRoomContext.getRoomId();

    // Assert
    assertEquals("42", actualRoomId);
    assertEquals(1L, userJoinedRoomContext.getUserId().longValue());
  }
}
