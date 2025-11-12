package com.symphony.bdk.core.activity.room;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.service.datafeed.RealTimeEventListener;
import com.symphony.bdk.gen.api.model.V4Initiator;
import com.symphony.bdk.gen.api.model.V4Stream;
import com.symphony.bdk.gen.api.model.V4User;
import com.symphony.bdk.gen.api.model.V4UserJoinedRoom;
import java.util.function.Consumer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class UserJoinedRoomActivityDiffblueTest {
  /**
   * Test {@link UserJoinedRoomActivity#bindToRealTimeEventsSource(Consumer)}.
   *
   * <ul>
   *   <li>Given {@link TestUserJoinedRoomActivity} (default constructor).
   *   <li>Then calls {@link Consumer#accept(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link UserJoinedRoomActivity#bindToRealTimeEventsSource(Consumer)}
   */
  @Test
  @DisplayName(
      "Test bindToRealTimeEventsSource(Consumer); given TestUserJoinedRoomActivity (default constructor); then calls accept(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void UserJoinedRoomActivity.bindToRealTimeEventsSource(Consumer)"})
  void testBindToRealTimeEventsSource_givenTestUserJoinedRoomActivity_thenCallsAccept() {
    // Arrange
    TestUserJoinedRoomActivity testUserJoinedRoomActivity = new TestUserJoinedRoomActivity();

    Consumer<RealTimeEventListener> realTimeEventsSource = mock(Consumer.class);
    doNothing().when(realTimeEventsSource).accept(Mockito.<RealTimeEventListener>any());

    // Act
    testUserJoinedRoomActivity.bindToRealTimeEventsSource(realTimeEventsSource);

    // Assert
    verify(realTimeEventsSource).accept(isA(RealTimeEventListener.class));
  }

  /**
   * Test {@link UserJoinedRoomActivity#beforeMatcher(UserJoinedRoomContext)} with {@code
   * UserJoinedRoomContext}.
   *
   * <p>Method under test: {@link UserJoinedRoomActivity#beforeMatcher(UserJoinedRoomContext)}
   */
  @Test
  @DisplayName("Test beforeMatcher(UserJoinedRoomContext) with 'UserJoinedRoomContext'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void UserJoinedRoomActivity.beforeMatcher(UserJoinedRoomContext)"})
  void testBeforeMatcherWithUserJoinedRoomContext() {
    // Arrange
    TestUserJoinedRoomActivity testUserJoinedRoomActivity = new TestUserJoinedRoomActivity();

    V4Stream stream = new V4Stream();
    stream.streamId("42");

    V4UserJoinedRoom sourceEvent = new V4UserJoinedRoom();
    sourceEvent.affectedUser(new V4User());
    sourceEvent.stream(stream);
    UserJoinedRoomContext context = new UserJoinedRoomContext(new V4Initiator(), sourceEvent);

    // Act
    testUserJoinedRoomActivity.beforeMatcher(context);

    // Assert
    assertEquals("42", context.getRoomId());
  }
}
