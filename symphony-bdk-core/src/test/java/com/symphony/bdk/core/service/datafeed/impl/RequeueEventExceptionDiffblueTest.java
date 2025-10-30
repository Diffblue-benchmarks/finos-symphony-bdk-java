package com.symphony.bdk.core.service.datafeed.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.service.datafeed.EventException;
import com.symphony.bdk.core.service.datafeed.RealTimeEventListener;
import com.symphony.bdk.gen.api.model.V4Event;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RequeueEventExceptionDiffblueTest {
  /**
   * Test {@link RequeueEventException#RequeueEventException(V4Event, RealTimeEventListener, EventException)}.
   * <p>
   * Method under test: {@link RequeueEventException#RequeueEventException(V4Event, RealTimeEventListener, EventException)}
   */
  @Test
  @DisplayName("Test new RequeueEventException(V4Event, RealTimeEventListener, EventException)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void RequeueEventException.<init>(V4Event, RealTimeEventListener, EventException)"})
  void testNewRequeueEventException() {
    // Arrange
    V4Event event = new V4Event();
    RealTimeEventListener listener = mock(RealTimeEventListener.class);
    EventException e = new EventException("An error occurred");

    // Act
    RequeueEventException actualRequeueEventException = new RequeueEventException(event, listener, e);

    // Assert
    assertEquals(0, actualRequeueEventException.getSuppressed().length);
    assertSame(e, actualRequeueEventException.getCause());
  }
}
