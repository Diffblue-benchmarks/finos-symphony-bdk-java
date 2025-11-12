package com.symphony.bdk.core.service.datafeed.util;

import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.service.datafeed.RealTimeEventListener;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class RealTimeEventsBinderDiffblueTest {
  /**
   * Test {@link RealTimeEventsBinder#bindOnMessageSent(Consumer, BiConsumer)}.
   *
   * <p>Method under test: {@link RealTimeEventsBinder#bindOnMessageSent(Consumer, BiConsumer)}
   */
  @Test
  @DisplayName("Test bindOnMessageSent(Consumer, BiConsumer)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RealTimeEventsBinder.bindOnMessageSent(Consumer, BiConsumer)"})
  void testBindOnMessageSent() {
    // Arrange
    Consumer<RealTimeEventListener> subscriber = mock(Consumer.class);
    doNothing().when(subscriber).accept(Mockito.<RealTimeEventListener>any());

    // Act
    RealTimeEventsBinder.bindOnMessageSent(subscriber, mock(BiConsumer.class));

    // Assert
    verify(subscriber).accept(isA(RealTimeEventListener.class));
  }

  /**
   * Test {@link RealTimeEventsBinder#bindOnSymphonyElementsAction(Consumer, BiConsumer)}.
   *
   * <p>Method under test: {@link RealTimeEventsBinder#bindOnSymphonyElementsAction(Consumer,
   * BiConsumer)}
   */
  @Test
  @DisplayName("Test bindOnSymphonyElementsAction(Consumer, BiConsumer)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RealTimeEventsBinder.bindOnSymphonyElementsAction(Consumer, BiConsumer)"
  })
  void testBindOnSymphonyElementsAction() {
    // Arrange
    Consumer<RealTimeEventListener> subscriber = mock(Consumer.class);
    doNothing().when(subscriber).accept(Mockito.<RealTimeEventListener>any());

    // Act
    RealTimeEventsBinder.bindOnSymphonyElementsAction(subscriber, mock(BiConsumer.class));

    // Assert
    verify(subscriber).accept(isA(RealTimeEventListener.class));
  }

  /**
   * Test {@link RealTimeEventsBinder#bindOnUserJoinedRoom(Consumer, BiConsumer)}.
   *
   * <p>Method under test: {@link RealTimeEventsBinder#bindOnUserJoinedRoom(Consumer, BiConsumer)}
   */
  @Test
  @DisplayName("Test bindOnUserJoinedRoom(Consumer, BiConsumer)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RealTimeEventsBinder.bindOnUserJoinedRoom(Consumer, BiConsumer)"})
  void testBindOnUserJoinedRoom() {
    // Arrange
    Consumer<RealTimeEventListener> subscriber = mock(Consumer.class);
    doNothing().when(subscriber).accept(Mockito.<RealTimeEventListener>any());

    // Act
    RealTimeEventsBinder.bindOnUserJoinedRoom(subscriber, mock(BiConsumer.class));

    // Assert
    verify(subscriber).accept(isA(RealTimeEventListener.class));
  }

  /**
   * Test {@link RealTimeEventsBinder#bindRealTimeListener(Consumer, RealTimeEventListener)}.
   *
   * <p>Method under test: {@link RealTimeEventsBinder#bindRealTimeListener(Consumer,
   * RealTimeEventListener)}
   */
  @Test
  @DisplayName("Test bindRealTimeListener(Consumer, RealTimeEventListener)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RealTimeEventsBinder.bindRealTimeListener(Consumer, RealTimeEventListener)"
  })
  void testBindRealTimeListener() {
    // Arrange
    Consumer<RealTimeEventListener> consumer = mock(Consumer.class);
    doNothing().when(consumer).accept(Mockito.<RealTimeEventListener>any());

    // Act
    RealTimeEventsBinder.bindRealTimeListener(consumer, mock(RealTimeEventListener.class));

    // Assert
    verify(consumer).accept(isA(RealTimeEventListener.class));
  }
}
