package com.symphony.bdk.core.activity.form;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.fasterxml.jackson.databind.node.NullNode;
import com.symphony.bdk.core.service.datafeed.RealTimeEventListener;
import com.symphony.bdk.gen.api.model.V4Initiator;
import com.symphony.bdk.gen.api.model.V4Stream;
import com.symphony.bdk.gen.api.model.V4SymphonyElementsAction;
import java.util.function.Consumer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class FormReplyActivityDiffblueTest {
  /**
   * Test {@link FormReplyActivity#bindToRealTimeEventsSource(Consumer)}.
   * <ul>
   *   <li>When {@link Consumer} {@link Consumer#accept(Object)} does nothing.</li>
   *   <li>Then calls {@link Consumer#accept(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FormReplyActivity#bindToRealTimeEventsSource(Consumer)}
   */
  @Test
  @DisplayName("Test bindToRealTimeEventsSource(Consumer); when Consumer accept(Object) does nothing; then calls accept(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void FormReplyActivity.bindToRealTimeEventsSource(Consumer)"})
  void testBindToRealTimeEventsSource_whenConsumerAcceptDoesNothing_thenCallsAccept() {
    // Arrange
    TestFormReplyActivity testFormReplyActivity = new TestFormReplyActivity();
    Consumer<RealTimeEventListener> realTimeEventsSource = mock(Consumer.class);
    doNothing().when(realTimeEventsSource).accept(Mockito.<RealTimeEventListener>any());

    // Act
    testFormReplyActivity.bindToRealTimeEventsSource(realTimeEventsSource);

    // Assert
    verify(realTimeEventsSource).accept(isA(RealTimeEventListener.class));
  }

  /**
   * Test {@link FormReplyActivity#beforeMatcher(FormReplyContext)} with {@code FormReplyContext}.
   * <p>
   * Method under test: {@link FormReplyActivity#beforeMatcher(FormReplyContext)}
   */
  @Test
  @DisplayName("Test beforeMatcher(FormReplyContext) with 'FormReplyContext'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void FormReplyActivity.beforeMatcher(FormReplyContext)"})
  void testBeforeMatcherWithFormReplyContext() {
    // Arrange
    TestFormReplyActivity testFormReplyActivity = new TestFormReplyActivity();

    V4SymphonyElementsAction eventSource = new V4SymphonyElementsAction();
    eventSource.stream(new V4Stream());
    FormReplyContext context = new FormReplyContext(new V4Initiator(), eventSource);

    // Act
    testFormReplyActivity.beforeMatcher(context);

    // Assert
    assertTrue(context.getFormValues() instanceof NullNode);
  }
}
