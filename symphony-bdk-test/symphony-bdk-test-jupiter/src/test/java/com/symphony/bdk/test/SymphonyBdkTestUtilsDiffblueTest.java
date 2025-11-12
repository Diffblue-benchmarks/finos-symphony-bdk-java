package com.symphony.bdk.test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.UserV2;
import com.symphony.bdk.gen.api.model.V4Event;
import com.symphony.bdk.gen.api.model.V4Stream;
import com.symphony.bdk.gen.api.model.V4User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SymphonyBdkTestUtilsDiffblueTest {
  /**
   * Test {@link SymphonyBdkTestUtils#pushMessageToDF(V4User, V4Stream, String, UserV2)} with {@code
   * initiator}, {@code stream}, {@code message}, {@code botInfo}.
   *
   * <ul>
   *   <li>Then throw {@link RuntimeException}.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyBdkTestUtils#pushMessageToDF(V4User, V4Stream, String,
   * UserV2)}
   */
  @Test
  @DisplayName(
      "Test pushMessageToDF(V4User, V4Stream, String, UserV2) with 'initiator', 'stream', 'message', 'botInfo'; then throw RuntimeException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SymphonyBdkTestUtils.pushMessageToDF(V4User, V4Stream, String, UserV2)"})
  void testPushMessageToDFWithInitiatorStreamMessageBotInfo_thenThrowRuntimeException() {
    // Arrange
    V4User initiator = new V4User();
    V4Stream stream = new V4Stream();

    UserV2 botInfo = mock(UserV2.class);
    when(botInfo.getDisplayName()).thenThrow(new RuntimeException());

    // Act and Assert
    assertThrows(
        RuntimeException.class,
        () ->
            SymphonyBdkTestUtils.pushMessageToDF(
                initiator, stream, "Not all who wander are lost", botInfo));
    verify(botInfo).getDisplayName();
  }

  /**
   * Test {@link SymphonyBdkTestUtils#pushMessageToDF(V4User, V4Stream, String, UserV2)} with {@code
   * initiator}, {@code stream}, {@code message}, {@code botInfo}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyBdkTestUtils#pushMessageToDF(V4User, V4Stream, String,
   * UserV2)}
   */
  @Test
  @DisplayName(
      "Test pushMessageToDF(V4User, V4Stream, String, UserV2) with 'initiator', 'stream', 'message', 'botInfo'; when 'null'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SymphonyBdkTestUtils.pushMessageToDF(V4User, V4Stream, String, UserV2)"})
  void testPushMessageToDFWithInitiatorStreamMessageBotInfo_whenNull_thenDoesNotThrow() {
    // Arrange
    V4User initiator = new V4User();

    // Act and Assert
    assertDoesNotThrow(
        () ->
            SymphonyBdkTestUtils.pushMessageToDF(
                initiator, new V4Stream(), "Not all who wander are lost", null));
  }

  /**
   * Test {@link SymphonyBdkTestUtils#pushMessageToDF(V4User, V4Stream, String, UserV2)} with {@code
   * initiator}, {@code stream}, {@code message}, {@code botInfo}.
   *
   * <ul>
   *   <li>When {@link UserV2} (default constructor).
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyBdkTestUtils#pushMessageToDF(V4User, V4Stream, String,
   * UserV2)}
   */
  @Test
  @DisplayName(
      "Test pushMessageToDF(V4User, V4Stream, String, UserV2) with 'initiator', 'stream', 'message', 'botInfo'; when UserV2 (default constructor); then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SymphonyBdkTestUtils.pushMessageToDF(V4User, V4Stream, String, UserV2)"})
  void testPushMessageToDFWithInitiatorStreamMessageBotInfo_whenUserV2_thenDoesNotThrow() {
    // Arrange
    V4User initiator = new V4User();
    V4Stream stream = new V4Stream();

    // Act and Assert
    assertDoesNotThrow(
        () ->
            SymphonyBdkTestUtils.pushMessageToDF(
                initiator, stream, "Not all who wander are lost", new UserV2()));
  }

  /**
   * Test {@link SymphonyBdkTestUtils#pushEventToDataFeed(V4Event)}.
   *
   * <ul>
   *   <li>Given {@code Event}.
   *   <li>When {@link V4Event} (default constructor) type {@code Event}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyBdkTestUtils#pushEventToDataFeed(V4Event)}
   */
  @Test
  @DisplayName(
      "Test pushEventToDataFeed(V4Event); given 'Event'; when V4Event (default constructor) type 'Event'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SymphonyBdkTestUtils.pushEventToDataFeed(V4Event)"})
  void testPushEventToDataFeed_givenEvent_whenV4EventTypeEvent_thenDoesNotThrow() {
    // Arrange
    V4Event event = new V4Event();
    event.type("Event");

    // Act and Assert
    assertDoesNotThrow(() -> SymphonyBdkTestUtils.pushEventToDataFeed(event));
  }

  /**
   * Test {@link SymphonyBdkTestUtils#pushEventToDataFeed(V4Event)}.
   *
   * <ul>
   *   <li>Given {@link RuntimeException#RuntimeException()}.
   *   <li>Then throw {@link RuntimeException}.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyBdkTestUtils#pushEventToDataFeed(V4Event)}
   */
  @Test
  @DisplayName(
      "Test pushEventToDataFeed(V4Event); given RuntimeException(); then throw RuntimeException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SymphonyBdkTestUtils.pushEventToDataFeed(V4Event)"})
  void testPushEventToDataFeed_givenRuntimeException_thenThrowRuntimeException() {
    // Arrange
    V4Event event = mock(V4Event.class);
    when(event.getType()).thenThrow(new RuntimeException());

    // Act and Assert
    assertThrows(RuntimeException.class, () -> SymphonyBdkTestUtils.pushEventToDataFeed(event));
    verify(event).getType();
  }

  /**
   * Test {@link SymphonyBdkTestUtils#pushEventToDataFeed(V4Event)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyBdkTestUtils#pushEventToDataFeed(V4Event)}
   */
  @Test
  @DisplayName("Test pushEventToDataFeed(V4Event); when 'null'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SymphonyBdkTestUtils.pushEventToDataFeed(V4Event)"})
  void testPushEventToDataFeed_whenNull_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> SymphonyBdkTestUtils.pushEventToDataFeed(null));
  }

  /**
   * Test {@link SymphonyBdkTestUtils#pushEventToDataFeed(V4Event)}.
   *
   * <ul>
   *   <li>When {@link V4Event} (default constructor).
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyBdkTestUtils#pushEventToDataFeed(V4Event)}
   */
  @Test
  @DisplayName(
      "Test pushEventToDataFeed(V4Event); when V4Event (default constructor); then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SymphonyBdkTestUtils.pushEventToDataFeed(V4Event)"})
  void testPushEventToDataFeed_whenV4Event_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> SymphonyBdkTestUtils.pushEventToDataFeed(new V4Event()));
  }
}
