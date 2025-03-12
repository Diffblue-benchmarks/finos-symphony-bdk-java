package com.symphony.bdk.test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
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
   * Test {@link SymphonyBdkTestUtils#pushMessageToDF(V4User, V4Stream, String, UserV2)} with {@code initiator}, {@code stream}, {@code message}, {@code botInfo}.
   * <ul>
   *   <li>Then throw {@link RuntimeException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SymphonyBdkTestUtils#pushMessageToDF(V4User, V4Stream, String, UserV2)}
   */
  @Test
  @DisplayName("Test pushMessageToDF(V4User, V4Stream, String, UserV2) with 'initiator', 'stream', 'message', 'botInfo'; then throw RuntimeException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SymphonyBdkTestUtils.pushMessageToDF(V4User, V4Stream, String, UserV2)"})
  void testPushMessageToDFWithInitiatorStreamMessageBotInfo_thenThrowRuntimeException() {
    // Arrange
    V4User initiator = new V4User();
    V4Stream stream = new V4Stream();
    UserV2 botInfo = mock(UserV2.class);
    when(botInfo.getDisplayName()).thenThrow(new RuntimeException("foo"));

    // Act and Assert
    assertThrows(RuntimeException.class,
        () -> SymphonyBdkTestUtils.pushMessageToDF(initiator, stream, "Not all who wander are lost", botInfo));
    verify(botInfo).getDisplayName();
  }

  /**
   * Test {@link SymphonyBdkTestUtils#pushEventToDataFeed(V4Event)}.
   * <ul>
   *   <li>Given {@link RuntimeException#RuntimeException(String)} with {@code foo}.</li>
   *   <li>Then throw {@link RuntimeException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SymphonyBdkTestUtils#pushEventToDataFeed(V4Event)}
   */
  @Test
  @DisplayName("Test pushEventToDataFeed(V4Event); given RuntimeException(String) with 'foo'; then throw RuntimeException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SymphonyBdkTestUtils.pushEventToDataFeed(V4Event)"})
  void testPushEventToDataFeed_givenRuntimeExceptionWithFoo_thenThrowRuntimeException() {
    // Arrange
    V4Event event = mock(V4Event.class);
    when(event.getType()).thenThrow(new RuntimeException("foo"));

    // Act and Assert
    assertThrows(RuntimeException.class, () -> SymphonyBdkTestUtils.pushEventToDataFeed(event));
    verify(event).getType();
  }
}
