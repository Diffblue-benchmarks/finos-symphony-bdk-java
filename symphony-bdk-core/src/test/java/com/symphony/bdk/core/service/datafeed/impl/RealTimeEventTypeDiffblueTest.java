package com.symphony.bdk.core.service.datafeed.impl;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.service.datafeed.EventException;
import com.symphony.bdk.core.service.datafeed.RealTimeEventListener;
import com.symphony.bdk.gen.api.model.V4Event;
import com.symphony.bdk.gen.api.model.V4Initiator;
import com.symphony.bdk.gen.api.model.V4MessageSent;
import com.symphony.bdk.gen.api.model.V4MessageSuppressed;
import com.symphony.bdk.gen.api.model.V4Payload;
import com.symphony.bdk.gen.api.model.V4RoomMemberPromotedToOwner;
import com.symphony.bdk.gen.api.model.V4UserRequestedToJoinRoom;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class RealTimeEventTypeDiffblueTest {
  /**
   * Test {@link RealTimeEventType#fromV4Event(V4Event)}.
   *
   * <ul>
   *   <li>Given {@code Event}.
   *   <li>When {@link V4Event} (default constructor) type {@code Event}.
   * </ul>
   *
   * <p>Method under test: {@link RealTimeEventType#fromV4Event(V4Event)}
   */
  @Test
  @DisplayName(
      "Test fromV4Event(V4Event); given 'Event'; when V4Event (default constructor) type 'Event'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional RealTimeEventType.fromV4Event(V4Event)"})
  void testFromV4Event_givenEvent_whenV4EventTypeEvent() {
    // Arrange
    V4Event event = new V4Event();
    event.type("Event");

    // Act
    Optional<RealTimeEventType> actualFromV4EventResult = RealTimeEventType.fromV4Event(event);

    // Assert
    assertFalse(actualFromV4EventResult.isPresent());
  }

  /**
   * Test {@link RealTimeEventType#fromV4Event(V4Event)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link RealTimeEventType#fromV4Event(V4Event)}
   */
  @Test
  @DisplayName("Test fromV4Event(V4Event); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional RealTimeEventType.fromV4Event(V4Event)"})
  void testFromV4Event_whenNull() {
    // Arrange and Act
    Optional<RealTimeEventType> actualFromV4EventResult = RealTimeEventType.fromV4Event(null);

    // Assert
    assertFalse(actualFromV4EventResult.isPresent());
  }

  /**
   * Test {@link RealTimeEventType#fromV4Event(V4Event)}.
   *
   * <ul>
   *   <li>When {@link V4Event} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link RealTimeEventType#fromV4Event(V4Event)}
   */
  @Test
  @DisplayName("Test fromV4Event(V4Event); when V4Event (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional RealTimeEventType.fromV4Event(V4Event)"})
  void testFromV4Event_whenV4Event() {
    // Arrange and Act
    Optional<RealTimeEventType> actualFromV4EventResult =
        RealTimeEventType.fromV4Event(new V4Event());

    // Assert
    assertFalse(actualFromV4EventResult.isPresent());
  }

  /**
   * Test {@link RealTimeEventType#dispatch(RealTimeEventListener, V4Event)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link RealTimeEventType#dispatch(RealTimeEventListener, V4Event)}
   */
  @Test
  @DisplayName(
      "Test dispatch(RealTimeEventListener, V4Event); given IllegalArgumentException(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RealTimeEventType.dispatch(RealTimeEventListener, V4Event)"})
  void testDispatch_givenIllegalArgumentException_thenThrowIllegalArgumentException()
      throws EventException {
    // Arrange
    RealTimeEventListener listener = mock(RealTimeEventListener.class);
    doThrow(new IllegalArgumentException())
        .when(listener)
        .onMessageSent(Mockito.<V4Initiator>any(), Mockito.<V4MessageSent>any());

    V4Payload payload = new V4Payload();
    payload.messageSent(new V4MessageSent());

    V4Event event = new V4Event();
    event.payload(payload);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> RealTimeEventType.MESSAGESENT.dispatch(listener, event));
    verify(listener).onMessageSent(isNull(), isA(V4MessageSent.class));
  }

  /**
   * Test {@link RealTimeEventType#dispatch(RealTimeEventListener, V4Event)}.
   *
   * <ul>
   *   <li>Given {@code MESSAGESENT}.
   *   <li>Then calls {@link RealTimeEventListener#onMessageSent(V4Initiator, V4MessageSent)}.
   * </ul>
   *
   * <p>Method under test: {@link RealTimeEventType#dispatch(RealTimeEventListener, V4Event)}
   */
  @Test
  @DisplayName(
      "Test dispatch(RealTimeEventListener, V4Event); given 'MESSAGESENT'; then calls onMessageSent(V4Initiator, V4MessageSent)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RealTimeEventType.dispatch(RealTimeEventListener, V4Event)"})
  void testDispatch_givenMessagesent_thenCallsOnMessageSent() throws EventException {
    // Arrange
    RealTimeEventListener listener = mock(RealTimeEventListener.class);
    doNothing()
        .when(listener)
        .onMessageSent(Mockito.<V4Initiator>any(), Mockito.<V4MessageSent>any());

    V4Payload payload = new V4Payload();
    payload.messageSent(new V4MessageSent());

    V4Event event = new V4Event();
    event.payload(payload);

    // Act
    RealTimeEventType.MESSAGESENT.dispatch(listener, event);

    // Assert
    verify(listener).onMessageSent(isNull(), isA(V4MessageSent.class));
  }

  /**
   * Test {@link RealTimeEventType#dispatch(RealTimeEventListener, V4Event)}.
   *
   * <ul>
   *   <li>Given {@code MESSAGESUPPRESSED}.
   *   <li>Then calls {@link RealTimeEventListener#onMessageSuppressed(V4Initiator,
   *       V4MessageSuppressed)}.
   * </ul>
   *
   * <p>Method under test: {@link RealTimeEventType#dispatch(RealTimeEventListener, V4Event)}
   */
  @Test
  @DisplayName(
      "Test dispatch(RealTimeEventListener, V4Event); given 'MESSAGESUPPRESSED'; then calls onMessageSuppressed(V4Initiator, V4MessageSuppressed)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RealTimeEventType.dispatch(RealTimeEventListener, V4Event)"})
  void testDispatch_givenMessagesuppressed_thenCallsOnMessageSuppressed() throws EventException {
    // Arrange
    RealTimeEventListener listener = mock(RealTimeEventListener.class);
    doNothing()
        .when(listener)
        .onMessageSuppressed(Mockito.<V4Initiator>any(), Mockito.<V4MessageSuppressed>any());

    V4Payload payload = new V4Payload();
    payload.messageSuppressed(new V4MessageSuppressed());
    payload.messageSent(new V4MessageSent());

    V4Event event = new V4Event();
    event.payload(payload);

    // Act
    RealTimeEventType.MESSAGESUPPRESSED.dispatch(listener, event);

    // Assert
    verify(listener).onMessageSuppressed(isNull(), isA(V4MessageSuppressed.class));
  }

  /**
   * Test {@link RealTimeEventType#dispatch(RealTimeEventListener, V4Event)}.
   *
   * <ul>
   *   <li>Given {@code USERREQUESTEDTOJOINROOM}.
   *   <li>Then calls {@link RealTimeEventListener#onUserRequestedToJoinRoom(V4Initiator,
   *       V4UserRequestedToJoinRoom)}.
   * </ul>
   *
   * <p>Method under test: {@link RealTimeEventType#dispatch(RealTimeEventListener, V4Event)}
   */
  @Test
  @DisplayName(
      "Test dispatch(RealTimeEventListener, V4Event); given 'USERREQUESTEDTOJOINROOM'; then calls onUserRequestedToJoinRoom(V4Initiator, V4UserRequestedToJoinRoom)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RealTimeEventType.dispatch(RealTimeEventListener, V4Event)"})
  void testDispatch_givenUserrequestedtojoinroom_thenCallsOnUserRequestedToJoinRoom()
      throws EventException {
    // Arrange
    RealTimeEventListener listener = mock(RealTimeEventListener.class);
    doNothing()
        .when(listener)
        .onUserRequestedToJoinRoom(
            Mockito.<V4Initiator>any(), Mockito.<V4UserRequestedToJoinRoom>any());

    V4Payload payload = new V4Payload();
    payload.userRequestedToJoinRoom(new V4UserRequestedToJoinRoom());
    payload.messageSuppressed(new V4MessageSuppressed());
    payload.messageSent(new V4MessageSent());

    V4Event event = new V4Event();
    event.payload(payload);

    // Act
    RealTimeEventType.USERREQUESTEDTOJOINROOM.dispatch(listener, event);

    // Assert
    verify(listener).onUserRequestedToJoinRoom(isNull(), isA(V4UserRequestedToJoinRoom.class));
  }

  /**
   * Test {@link RealTimeEventType#dispatch(RealTimeEventListener, V4Event)}.
   *
   * <ul>
   *   <li>Then calls {@link RealTimeEventListener#onRoomMemberPromotedToOwner(V4Initiator,
   *       V4RoomMemberPromotedToOwner)}.
   * </ul>
   *
   * <p>Method under test: {@link RealTimeEventType#dispatch(RealTimeEventListener, V4Event)}
   */
  @Test
  @DisplayName(
      "Test dispatch(RealTimeEventListener, V4Event); then calls onRoomMemberPromotedToOwner(V4Initiator, V4RoomMemberPromotedToOwner)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RealTimeEventType.dispatch(RealTimeEventListener, V4Event)"})
  void testDispatch_thenCallsOnRoomMemberPromotedToOwner() throws EventException {
    // Arrange
    RealTimeEventListener listener = mock(RealTimeEventListener.class);
    doNothing()
        .when(listener)
        .onRoomMemberPromotedToOwner(
            Mockito.<V4Initiator>any(), Mockito.<V4RoomMemberPromotedToOwner>any());

    V4Payload payload = new V4Payload();
    payload.roomMemberPromotedToOwner(new V4RoomMemberPromotedToOwner());
    payload.userRequestedToJoinRoom(new V4UserRequestedToJoinRoom());
    payload.messageSuppressed(new V4MessageSuppressed());
    payload.messageSent(new V4MessageSent());

    V4Event event = new V4Event();
    event.payload(payload);

    // Act
    RealTimeEventType.ROOMMEMBERPROMOTEDTOOWNER.dispatch(listener, event);

    // Assert
    verify(listener).onRoomMemberPromotedToOwner(isNull(), isA(V4RoomMemberPromotedToOwner.class));
  }
}
