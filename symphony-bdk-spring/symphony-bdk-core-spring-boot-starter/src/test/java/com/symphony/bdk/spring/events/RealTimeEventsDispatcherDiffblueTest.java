package com.symphony.bdk.spring.events;

import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.V4ConnectionAccepted;
import com.symphony.bdk.gen.api.model.V4ConnectionRequested;
import com.symphony.bdk.gen.api.model.V4GenericSystemEvent;
import com.symphony.bdk.gen.api.model.V4Initiator;
import com.symphony.bdk.gen.api.model.V4InstantMessageCreated;
import com.symphony.bdk.gen.api.model.V4MessageSent;
import com.symphony.bdk.gen.api.model.V4MessageSuppressed;
import com.symphony.bdk.gen.api.model.V4RoomCreated;
import com.symphony.bdk.gen.api.model.V4RoomDeactivated;
import com.symphony.bdk.gen.api.model.V4RoomMemberDemotedFromOwner;
import com.symphony.bdk.gen.api.model.V4RoomMemberPromotedToOwner;
import com.symphony.bdk.gen.api.model.V4RoomReactivated;
import com.symphony.bdk.gen.api.model.V4RoomUpdated;
import com.symphony.bdk.gen.api.model.V4SharedPost;
import com.symphony.bdk.gen.api.model.V4SymphonyElementsAction;
import com.symphony.bdk.gen.api.model.V4UserJoinedRoom;
import com.symphony.bdk.gen.api.model.V4UserLeftRoom;
import com.symphony.bdk.gen.api.model.V4UserRequestedToJoinRoom;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;

class RealTimeEventsDispatcherDiffblueTest {
  /**
   * Test {@link RealTimeEventsDispatcher#onMessageSent(V4Initiator, V4MessageSent)}.
   *
   * <ul>
   *   <li>When {@link V4MessageSent} (default constructor).
   *   <li>Then calls {@link ApplicationEventPublisher#publishEvent(ApplicationEvent)}.
   * </ul>
   *
   * <p>Method under test: {@link RealTimeEventsDispatcher#onMessageSent(V4Initiator,
   * V4MessageSent)}
   */
  @Test
  @DisplayName(
      "Test onMessageSent(V4Initiator, V4MessageSent); when V4MessageSent (default constructor); then calls publishEvent(ApplicationEvent)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RealTimeEventsDispatcher.onMessageSent(V4Initiator, V4MessageSent)"})
  void testOnMessageSent_whenV4MessageSent_thenCallsPublishEvent() {
    // Arrange
    ApplicationEventPublisher publisher = mock(ApplicationEventPublisher.class);
    doNothing().when(publisher).publishEvent(Mockito.<ApplicationEvent>any());
    RealTimeEventsDispatcher realTimeEventsDispatcher = new RealTimeEventsDispatcher(publisher);
    V4Initiator initiator = new V4Initiator();

    // Act
    realTimeEventsDispatcher.onMessageSent(initiator, new V4MessageSent());

    // Assert
    verify(publisher).publishEvent(isA(ApplicationEvent.class));
  }

  /**
   * Test {@link RealTimeEventsDispatcher#onSharedPost(V4Initiator, V4SharedPost)}.
   *
   * <ul>
   *   <li>When {@link V4SharedPost} (default constructor).
   *   <li>Then calls {@link ApplicationEventPublisher#publishEvent(ApplicationEvent)}.
   * </ul>
   *
   * <p>Method under test: {@link RealTimeEventsDispatcher#onSharedPost(V4Initiator, V4SharedPost)}
   */
  @Test
  @DisplayName(
      "Test onSharedPost(V4Initiator, V4SharedPost); when V4SharedPost (default constructor); then calls publishEvent(ApplicationEvent)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RealTimeEventsDispatcher.onSharedPost(V4Initiator, V4SharedPost)"})
  void testOnSharedPost_whenV4SharedPost_thenCallsPublishEvent() {
    // Arrange
    ApplicationEventPublisher publisher = mock(ApplicationEventPublisher.class);
    doNothing().when(publisher).publishEvent(Mockito.<ApplicationEvent>any());
    RealTimeEventsDispatcher realTimeEventsDispatcher = new RealTimeEventsDispatcher(publisher);
    V4Initiator initiator = new V4Initiator();

    // Act
    realTimeEventsDispatcher.onSharedPost(initiator, new V4SharedPost());

    // Assert
    verify(publisher).publishEvent(isA(ApplicationEvent.class));
  }

  /**
   * Test {@link RealTimeEventsDispatcher#onInstantMessageCreated(V4Initiator,
   * V4InstantMessageCreated)}.
   *
   * <ul>
   *   <li>When {@link V4InstantMessageCreated} (default constructor).
   *   <li>Then calls {@link ApplicationEventPublisher#publishEvent(ApplicationEvent)}.
   * </ul>
   *
   * <p>Method under test: {@link RealTimeEventsDispatcher#onInstantMessageCreated(V4Initiator,
   * V4InstantMessageCreated)}
   */
  @Test
  @DisplayName(
      "Test onInstantMessageCreated(V4Initiator, V4InstantMessageCreated); when V4InstantMessageCreated (default constructor); then calls publishEvent(ApplicationEvent)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RealTimeEventsDispatcher.onInstantMessageCreated(V4Initiator, V4InstantMessageCreated)"
  })
  void testOnInstantMessageCreated_whenV4InstantMessageCreated_thenCallsPublishEvent() {
    // Arrange
    ApplicationEventPublisher publisher = mock(ApplicationEventPublisher.class);
    doNothing().when(publisher).publishEvent(Mockito.<ApplicationEvent>any());
    RealTimeEventsDispatcher realTimeEventsDispatcher = new RealTimeEventsDispatcher(publisher);
    V4Initiator initiator = new V4Initiator();

    // Act
    realTimeEventsDispatcher.onInstantMessageCreated(initiator, new V4InstantMessageCreated());

    // Assert
    verify(publisher).publishEvent(isA(ApplicationEvent.class));
  }

  /**
   * Test {@link RealTimeEventsDispatcher#onRoomCreated(V4Initiator, V4RoomCreated)}.
   *
   * <ul>
   *   <li>When {@link V4RoomCreated} (default constructor).
   *   <li>Then calls {@link ApplicationEventPublisher#publishEvent(ApplicationEvent)}.
   * </ul>
   *
   * <p>Method under test: {@link RealTimeEventsDispatcher#onRoomCreated(V4Initiator,
   * V4RoomCreated)}
   */
  @Test
  @DisplayName(
      "Test onRoomCreated(V4Initiator, V4RoomCreated); when V4RoomCreated (default constructor); then calls publishEvent(ApplicationEvent)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RealTimeEventsDispatcher.onRoomCreated(V4Initiator, V4RoomCreated)"})
  void testOnRoomCreated_whenV4RoomCreated_thenCallsPublishEvent() {
    // Arrange
    ApplicationEventPublisher publisher = mock(ApplicationEventPublisher.class);
    doNothing().when(publisher).publishEvent(Mockito.<ApplicationEvent>any());
    RealTimeEventsDispatcher realTimeEventsDispatcher = new RealTimeEventsDispatcher(publisher);
    V4Initiator initiator = new V4Initiator();

    // Act
    realTimeEventsDispatcher.onRoomCreated(initiator, new V4RoomCreated());

    // Assert
    verify(publisher).publishEvent(isA(ApplicationEvent.class));
  }

  /**
   * Test {@link RealTimeEventsDispatcher#onRoomUpdated(V4Initiator, V4RoomUpdated)}.
   *
   * <ul>
   *   <li>When {@link V4RoomUpdated} (default constructor).
   *   <li>Then calls {@link ApplicationEventPublisher#publishEvent(ApplicationEvent)}.
   * </ul>
   *
   * <p>Method under test: {@link RealTimeEventsDispatcher#onRoomUpdated(V4Initiator,
   * V4RoomUpdated)}
   */
  @Test
  @DisplayName(
      "Test onRoomUpdated(V4Initiator, V4RoomUpdated); when V4RoomUpdated (default constructor); then calls publishEvent(ApplicationEvent)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RealTimeEventsDispatcher.onRoomUpdated(V4Initiator, V4RoomUpdated)"})
  void testOnRoomUpdated_whenV4RoomUpdated_thenCallsPublishEvent() {
    // Arrange
    ApplicationEventPublisher publisher = mock(ApplicationEventPublisher.class);
    doNothing().when(publisher).publishEvent(Mockito.<ApplicationEvent>any());
    RealTimeEventsDispatcher realTimeEventsDispatcher = new RealTimeEventsDispatcher(publisher);
    V4Initiator initiator = new V4Initiator();

    // Act
    realTimeEventsDispatcher.onRoomUpdated(initiator, new V4RoomUpdated());

    // Assert
    verify(publisher).publishEvent(isA(ApplicationEvent.class));
  }

  /**
   * Test {@link RealTimeEventsDispatcher#onRoomDeactivated(V4Initiator, V4RoomDeactivated)}.
   *
   * <ul>
   *   <li>When {@link V4RoomDeactivated} (default constructor).
   *   <li>Then calls {@link ApplicationEventPublisher#publishEvent(ApplicationEvent)}.
   * </ul>
   *
   * <p>Method under test: {@link RealTimeEventsDispatcher#onRoomDeactivated(V4Initiator,
   * V4RoomDeactivated)}
   */
  @Test
  @DisplayName(
      "Test onRoomDeactivated(V4Initiator, V4RoomDeactivated); when V4RoomDeactivated (default constructor); then calls publishEvent(ApplicationEvent)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RealTimeEventsDispatcher.onRoomDeactivated(V4Initiator, V4RoomDeactivated)"
  })
  void testOnRoomDeactivated_whenV4RoomDeactivated_thenCallsPublishEvent() {
    // Arrange
    ApplicationEventPublisher publisher = mock(ApplicationEventPublisher.class);
    doNothing().when(publisher).publishEvent(Mockito.<ApplicationEvent>any());
    RealTimeEventsDispatcher realTimeEventsDispatcher = new RealTimeEventsDispatcher(publisher);
    V4Initiator initiator = new V4Initiator();

    // Act
    realTimeEventsDispatcher.onRoomDeactivated(initiator, new V4RoomDeactivated());

    // Assert
    verify(publisher).publishEvent(isA(ApplicationEvent.class));
  }

  /**
   * Test {@link RealTimeEventsDispatcher#onRoomReactivated(V4Initiator, V4RoomReactivated)}.
   *
   * <ul>
   *   <li>When {@link V4RoomReactivated} (default constructor).
   *   <li>Then calls {@link ApplicationEventPublisher#publishEvent(ApplicationEvent)}.
   * </ul>
   *
   * <p>Method under test: {@link RealTimeEventsDispatcher#onRoomReactivated(V4Initiator,
   * V4RoomReactivated)}
   */
  @Test
  @DisplayName(
      "Test onRoomReactivated(V4Initiator, V4RoomReactivated); when V4RoomReactivated (default constructor); then calls publishEvent(ApplicationEvent)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RealTimeEventsDispatcher.onRoomReactivated(V4Initiator, V4RoomReactivated)"
  })
  void testOnRoomReactivated_whenV4RoomReactivated_thenCallsPublishEvent() {
    // Arrange
    ApplicationEventPublisher publisher = mock(ApplicationEventPublisher.class);
    doNothing().when(publisher).publishEvent(Mockito.<ApplicationEvent>any());
    RealTimeEventsDispatcher realTimeEventsDispatcher = new RealTimeEventsDispatcher(publisher);
    V4Initiator initiator = new V4Initiator();

    // Act
    realTimeEventsDispatcher.onRoomReactivated(initiator, new V4RoomReactivated());

    // Assert
    verify(publisher).publishEvent(isA(ApplicationEvent.class));
  }

  /**
   * Test {@link RealTimeEventsDispatcher#onUserRequestedToJoinRoom(V4Initiator,
   * V4UserRequestedToJoinRoom)}.
   *
   * <ul>
   *   <li>Then calls {@link ApplicationEventPublisher#publishEvent(ApplicationEvent)}.
   * </ul>
   *
   * <p>Method under test: {@link RealTimeEventsDispatcher#onUserRequestedToJoinRoom(V4Initiator,
   * V4UserRequestedToJoinRoom)}
   */
  @Test
  @DisplayName(
      "Test onUserRequestedToJoinRoom(V4Initiator, V4UserRequestedToJoinRoom); then calls publishEvent(ApplicationEvent)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RealTimeEventsDispatcher.onUserRequestedToJoinRoom(V4Initiator, V4UserRequestedToJoinRoom)"
  })
  void testOnUserRequestedToJoinRoom_thenCallsPublishEvent() {
    // Arrange
    ApplicationEventPublisher publisher = mock(ApplicationEventPublisher.class);
    doNothing().when(publisher).publishEvent(Mockito.<ApplicationEvent>any());
    RealTimeEventsDispatcher realTimeEventsDispatcher = new RealTimeEventsDispatcher(publisher);
    V4Initiator initiator = new V4Initiator();

    // Act
    realTimeEventsDispatcher.onUserRequestedToJoinRoom(initiator, new V4UserRequestedToJoinRoom());

    // Assert
    verify(publisher).publishEvent(isA(ApplicationEvent.class));
  }

  /**
   * Test {@link RealTimeEventsDispatcher#onUserJoinedRoom(V4Initiator, V4UserJoinedRoom)}.
   *
   * <ul>
   *   <li>When {@link V4UserJoinedRoom} (default constructor).
   *   <li>Then calls {@link ApplicationEventPublisher#publishEvent(ApplicationEvent)}.
   * </ul>
   *
   * <p>Method under test: {@link RealTimeEventsDispatcher#onUserJoinedRoom(V4Initiator,
   * V4UserJoinedRoom)}
   */
  @Test
  @DisplayName(
      "Test onUserJoinedRoom(V4Initiator, V4UserJoinedRoom); when V4UserJoinedRoom (default constructor); then calls publishEvent(ApplicationEvent)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RealTimeEventsDispatcher.onUserJoinedRoom(V4Initiator, V4UserJoinedRoom)"
  })
  void testOnUserJoinedRoom_whenV4UserJoinedRoom_thenCallsPublishEvent() {
    // Arrange
    ApplicationEventPublisher publisher = mock(ApplicationEventPublisher.class);
    doNothing().when(publisher).publishEvent(Mockito.<ApplicationEvent>any());
    RealTimeEventsDispatcher realTimeEventsDispatcher = new RealTimeEventsDispatcher(publisher);
    V4Initiator initiator = new V4Initiator();

    // Act
    realTimeEventsDispatcher.onUserJoinedRoom(initiator, new V4UserJoinedRoom());

    // Assert
    verify(publisher).publishEvent(isA(ApplicationEvent.class));
  }

  /**
   * Test {@link RealTimeEventsDispatcher#onUserLeftRoom(V4Initiator, V4UserLeftRoom)}.
   *
   * <ul>
   *   <li>When {@link V4UserLeftRoom} (default constructor).
   *   <li>Then calls {@link ApplicationEventPublisher#publishEvent(ApplicationEvent)}.
   * </ul>
   *
   * <p>Method under test: {@link RealTimeEventsDispatcher#onUserLeftRoom(V4Initiator,
   * V4UserLeftRoom)}
   */
  @Test
  @DisplayName(
      "Test onUserLeftRoom(V4Initiator, V4UserLeftRoom); when V4UserLeftRoom (default constructor); then calls publishEvent(ApplicationEvent)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RealTimeEventsDispatcher.onUserLeftRoom(V4Initiator, V4UserLeftRoom)"})
  void testOnUserLeftRoom_whenV4UserLeftRoom_thenCallsPublishEvent() {
    // Arrange
    ApplicationEventPublisher publisher = mock(ApplicationEventPublisher.class);
    doNothing().when(publisher).publishEvent(Mockito.<ApplicationEvent>any());
    RealTimeEventsDispatcher realTimeEventsDispatcher = new RealTimeEventsDispatcher(publisher);
    V4Initiator initiator = new V4Initiator();

    // Act
    realTimeEventsDispatcher.onUserLeftRoom(initiator, new V4UserLeftRoom());

    // Assert
    verify(publisher).publishEvent(isA(ApplicationEvent.class));
  }

  /**
   * Test {@link RealTimeEventsDispatcher#onRoomMemberPromotedToOwner(V4Initiator,
   * V4RoomMemberPromotedToOwner)}.
   *
   * <ul>
   *   <li>Then calls {@link ApplicationEventPublisher#publishEvent(ApplicationEvent)}.
   * </ul>
   *
   * <p>Method under test: {@link RealTimeEventsDispatcher#onRoomMemberPromotedToOwner(V4Initiator,
   * V4RoomMemberPromotedToOwner)}
   */
  @Test
  @DisplayName(
      "Test onRoomMemberPromotedToOwner(V4Initiator, V4RoomMemberPromotedToOwner); then calls publishEvent(ApplicationEvent)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RealTimeEventsDispatcher.onRoomMemberPromotedToOwner(V4Initiator, V4RoomMemberPromotedToOwner)"
  })
  void testOnRoomMemberPromotedToOwner_thenCallsPublishEvent() {
    // Arrange
    ApplicationEventPublisher publisher = mock(ApplicationEventPublisher.class);
    doNothing().when(publisher).publishEvent(Mockito.<ApplicationEvent>any());
    RealTimeEventsDispatcher realTimeEventsDispatcher = new RealTimeEventsDispatcher(publisher);
    V4Initiator initiator = new V4Initiator();

    // Act
    realTimeEventsDispatcher.onRoomMemberPromotedToOwner(
        initiator, new V4RoomMemberPromotedToOwner());

    // Assert
    verify(publisher).publishEvent(isA(ApplicationEvent.class));
  }

  /**
   * Test {@link RealTimeEventsDispatcher#onRoomMemberDemotedFromOwner(V4Initiator,
   * V4RoomMemberDemotedFromOwner)}.
   *
   * <ul>
   *   <li>Then calls {@link ApplicationEventPublisher#publishEvent(ApplicationEvent)}.
   * </ul>
   *
   * <p>Method under test: {@link RealTimeEventsDispatcher#onRoomMemberDemotedFromOwner(V4Initiator,
   * V4RoomMemberDemotedFromOwner)}
   */
  @Test
  @DisplayName(
      "Test onRoomMemberDemotedFromOwner(V4Initiator, V4RoomMemberDemotedFromOwner); then calls publishEvent(ApplicationEvent)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RealTimeEventsDispatcher.onRoomMemberDemotedFromOwner(V4Initiator, V4RoomMemberDemotedFromOwner)"
  })
  void testOnRoomMemberDemotedFromOwner_thenCallsPublishEvent() {
    // Arrange
    ApplicationEventPublisher publisher = mock(ApplicationEventPublisher.class);
    doNothing().when(publisher).publishEvent(Mockito.<ApplicationEvent>any());
    RealTimeEventsDispatcher realTimeEventsDispatcher = new RealTimeEventsDispatcher(publisher);
    V4Initiator initiator = new V4Initiator();

    // Act
    realTimeEventsDispatcher.onRoomMemberDemotedFromOwner(
        initiator, new V4RoomMemberDemotedFromOwner());

    // Assert
    verify(publisher).publishEvent(isA(ApplicationEvent.class));
  }

  /**
   * Test {@link RealTimeEventsDispatcher#onConnectionRequested(V4Initiator,
   * V4ConnectionRequested)}.
   *
   * <ul>
   *   <li>When {@link V4ConnectionRequested} (default constructor).
   *   <li>Then calls {@link ApplicationEventPublisher#publishEvent(ApplicationEvent)}.
   * </ul>
   *
   * <p>Method under test: {@link RealTimeEventsDispatcher#onConnectionRequested(V4Initiator,
   * V4ConnectionRequested)}
   */
  @Test
  @DisplayName(
      "Test onConnectionRequested(V4Initiator, V4ConnectionRequested); when V4ConnectionRequested (default constructor); then calls publishEvent(ApplicationEvent)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RealTimeEventsDispatcher.onConnectionRequested(V4Initiator, V4ConnectionRequested)"
  })
  void testOnConnectionRequested_whenV4ConnectionRequested_thenCallsPublishEvent() {
    // Arrange
    ApplicationEventPublisher publisher = mock(ApplicationEventPublisher.class);
    doNothing().when(publisher).publishEvent(Mockito.<ApplicationEvent>any());
    RealTimeEventsDispatcher realTimeEventsDispatcher = new RealTimeEventsDispatcher(publisher);
    V4Initiator initiator = new V4Initiator();

    // Act
    realTimeEventsDispatcher.onConnectionRequested(initiator, new V4ConnectionRequested());

    // Assert
    verify(publisher).publishEvent(isA(ApplicationEvent.class));
  }

  /**
   * Test {@link RealTimeEventsDispatcher#onConnectionAccepted(V4Initiator, V4ConnectionAccepted)}.
   *
   * <ul>
   *   <li>When {@link V4ConnectionAccepted} (default constructor).
   *   <li>Then calls {@link ApplicationEventPublisher#publishEvent(ApplicationEvent)}.
   * </ul>
   *
   * <p>Method under test: {@link RealTimeEventsDispatcher#onConnectionAccepted(V4Initiator,
   * V4ConnectionAccepted)}
   */
  @Test
  @DisplayName(
      "Test onConnectionAccepted(V4Initiator, V4ConnectionAccepted); when V4ConnectionAccepted (default constructor); then calls publishEvent(ApplicationEvent)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RealTimeEventsDispatcher.onConnectionAccepted(V4Initiator, V4ConnectionAccepted)"
  })
  void testOnConnectionAccepted_whenV4ConnectionAccepted_thenCallsPublishEvent() {
    // Arrange
    ApplicationEventPublisher publisher = mock(ApplicationEventPublisher.class);
    doNothing().when(publisher).publishEvent(Mockito.<ApplicationEvent>any());
    RealTimeEventsDispatcher realTimeEventsDispatcher = new RealTimeEventsDispatcher(publisher);
    V4Initiator initiator = new V4Initiator();

    // Act
    realTimeEventsDispatcher.onConnectionAccepted(initiator, new V4ConnectionAccepted());

    // Assert
    verify(publisher).publishEvent(isA(ApplicationEvent.class));
  }

  /**
   * Test {@link RealTimeEventsDispatcher#onMessageSuppressed(V4Initiator, V4MessageSuppressed)}.
   *
   * <ul>
   *   <li>When {@link V4MessageSuppressed} (default constructor).
   *   <li>Then calls {@link ApplicationEventPublisher#publishEvent(ApplicationEvent)}.
   * </ul>
   *
   * <p>Method under test: {@link RealTimeEventsDispatcher#onMessageSuppressed(V4Initiator,
   * V4MessageSuppressed)}
   */
  @Test
  @DisplayName(
      "Test onMessageSuppressed(V4Initiator, V4MessageSuppressed); when V4MessageSuppressed (default constructor); then calls publishEvent(ApplicationEvent)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RealTimeEventsDispatcher.onMessageSuppressed(V4Initiator, V4MessageSuppressed)"
  })
  void testOnMessageSuppressed_whenV4MessageSuppressed_thenCallsPublishEvent() {
    // Arrange
    ApplicationEventPublisher publisher = mock(ApplicationEventPublisher.class);
    doNothing().when(publisher).publishEvent(Mockito.<ApplicationEvent>any());
    RealTimeEventsDispatcher realTimeEventsDispatcher = new RealTimeEventsDispatcher(publisher);
    V4Initiator initiator = new V4Initiator();

    // Act
    realTimeEventsDispatcher.onMessageSuppressed(initiator, new V4MessageSuppressed());

    // Assert
    verify(publisher).publishEvent(isA(ApplicationEvent.class));
  }

  /**
   * Test {@link RealTimeEventsDispatcher#onSymphonyElementsAction(V4Initiator,
   * V4SymphonyElementsAction)}.
   *
   * <ul>
   *   <li>When {@link V4SymphonyElementsAction} (default constructor).
   *   <li>Then calls {@link ApplicationEventPublisher#publishEvent(ApplicationEvent)}.
   * </ul>
   *
   * <p>Method under test: {@link RealTimeEventsDispatcher#onSymphonyElementsAction(V4Initiator,
   * V4SymphonyElementsAction)}
   */
  @Test
  @DisplayName(
      "Test onSymphonyElementsAction(V4Initiator, V4SymphonyElementsAction); when V4SymphonyElementsAction (default constructor); then calls publishEvent(ApplicationEvent)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RealTimeEventsDispatcher.onSymphonyElementsAction(V4Initiator, V4SymphonyElementsAction)"
  })
  void testOnSymphonyElementsAction_whenV4SymphonyElementsAction_thenCallsPublishEvent() {
    // Arrange
    ApplicationEventPublisher publisher = mock(ApplicationEventPublisher.class);
    doNothing().when(publisher).publishEvent(Mockito.<ApplicationEvent>any());
    RealTimeEventsDispatcher realTimeEventsDispatcher = new RealTimeEventsDispatcher(publisher);
    V4Initiator initiator = new V4Initiator();

    // Act
    realTimeEventsDispatcher.onSymphonyElementsAction(initiator, new V4SymphonyElementsAction());

    // Assert
    verify(publisher).publishEvent(isA(ApplicationEvent.class));
  }

  /**
   * Test {@link RealTimeEventsDispatcher#onGenericSystemEvent(V4Initiator, V4GenericSystemEvent)}.
   *
   * <ul>
   *   <li>When {@link V4GenericSystemEvent} (default constructor).
   *   <li>Then calls {@link ApplicationEventPublisher#publishEvent(ApplicationEvent)}.
   * </ul>
   *
   * <p>Method under test: {@link RealTimeEventsDispatcher#onGenericSystemEvent(V4Initiator,
   * V4GenericSystemEvent)}
   */
  @Test
  @DisplayName(
      "Test onGenericSystemEvent(V4Initiator, V4GenericSystemEvent); when V4GenericSystemEvent (default constructor); then calls publishEvent(ApplicationEvent)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RealTimeEventsDispatcher.onGenericSystemEvent(V4Initiator, V4GenericSystemEvent)"
  })
  void testOnGenericSystemEvent_whenV4GenericSystemEvent_thenCallsPublishEvent() {
    // Arrange
    ApplicationEventPublisher publisher = mock(ApplicationEventPublisher.class);
    doNothing().when(publisher).publishEvent(Mockito.<ApplicationEvent>any());
    RealTimeEventsDispatcher realTimeEventsDispatcher = new RealTimeEventsDispatcher(publisher);
    V4Initiator initiator = new V4Initiator();

    // Act
    realTimeEventsDispatcher.onGenericSystemEvent(initiator, new V4GenericSystemEvent());

    // Assert
    verify(publisher).publishEvent(isA(ApplicationEvent.class));
  }
}
