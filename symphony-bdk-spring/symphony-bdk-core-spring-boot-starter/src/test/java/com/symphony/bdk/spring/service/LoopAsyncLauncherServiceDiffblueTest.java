package com.symphony.bdk.spring.service;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.service.datafeed.RealTimeEventListener;
import com.symphony.bdk.core.service.datafeed.impl.DatahoseLoopImpl;
import com.symphony.bdk.spring.events.RealTimeEventsDispatcher;
import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.context.ApplicationEventPublisher;

class LoopAsyncLauncherServiceDiffblueTest {
  /**
   * Test {@link LoopAsyncLauncherService#registerListeners()}.
   *
   * <ul>
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link LoopAsyncLauncherService#registerListeners()}
   */
  @Test
  @DisplayName("Test registerListeners(); then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LoopAsyncLauncherService.registerListeners()"})
  void testRegisterListeners_thenDoesNotThrow() {
    // Arrange
    DatahoseLoopImpl datafeedLoop = mock(DatahoseLoopImpl.class);
    DatafeedAsyncLauncherService datafeedAsyncLauncherService =
        new DatafeedAsyncLauncherService(datafeedLoop, new ArrayList<>());

    // Act and Assert
    assertDoesNotThrow(() -> datafeedAsyncLauncherService.registerListeners());
  }

  /**
   * Test {@link LoopAsyncLauncherService#registerListeners()}.
   *
   * <ul>
   *   <li>Then throw {@link RuntimeException}.
   * </ul>
   *
   * <p>Method under test: {@link LoopAsyncLauncherService#registerListeners()}
   */
  @Test
  @DisplayName("Test registerListeners(); then throw RuntimeException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LoopAsyncLauncherService.registerListeners()"})
  void testRegisterListeners_thenThrowRuntimeException() {
    // Arrange
    DatahoseLoopImpl datafeedLoop = mock(DatahoseLoopImpl.class);
    doThrow(new RuntimeException())
        .when(datafeedLoop)
        .subscribe(Mockito.<RealTimeEventListener>any());

    ArrayList<RealTimeEventListener> realTimeEventListeners = new ArrayList<>();
    realTimeEventListeners.add(new RealTimeEventsDispatcher(mock(ApplicationEventPublisher.class)));

    DatafeedAsyncLauncherService datafeedAsyncLauncherService =
        new DatafeedAsyncLauncherService(datafeedLoop, realTimeEventListeners);

    // Act and Assert
    assertThrows(RuntimeException.class, () -> datafeedAsyncLauncherService.registerListeners());
    verify(datafeedLoop).subscribe(isA(RealTimeEventListener.class));
  }

  /**
   * Test {@link LoopAsyncLauncherService#stop()}.
   *
   * <ul>
   *   <li>Given {@link DatahoseLoopImpl} {@link DatahoseLoopImpl#stop()} does nothing.
   *   <li>Then calls {@link DatahoseLoopImpl#stop()}.
   * </ul>
   *
   * <p>Method under test: {@link LoopAsyncLauncherService#stop()}
   */
  @Test
  @DisplayName("Test stop(); given DatahoseLoopImpl stop() does nothing; then calls stop()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LoopAsyncLauncherService.stop()"})
  void testStop_givenDatahoseLoopImplStopDoesNothing_thenCallsStop() {
    // Arrange
    DatahoseLoopImpl datafeedLoop = mock(DatahoseLoopImpl.class);
    doNothing().when(datafeedLoop).stop();
    DatafeedAsyncLauncherService datafeedAsyncLauncherService =
        new DatafeedAsyncLauncherService(datafeedLoop, new ArrayList<>());

    // Act
    datafeedAsyncLauncherService.stop();

    // Assert
    verify(datafeedLoop).stop();
  }
}
