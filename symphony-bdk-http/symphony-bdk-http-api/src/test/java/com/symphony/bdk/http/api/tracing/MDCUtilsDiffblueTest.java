package com.symphony.bdk.http.api.tracing;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MDCUtilsDiffblueTest {
  /**
   * Test {@link MDCUtils#wrap(Runnable)}.
   *
   * <ul>
   *   <li>When {@link Runnable} {@link Runnable#run()} does nothing.
   *   <li>Then calls {@link Runnable#run()}.
   * </ul>
   *
   * <p>Method under test: {@link MDCUtils#wrap(Runnable)}
   */
  @Test
  @DisplayName("Test wrap(Runnable); when Runnable run() does nothing; then calls run()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Runnable MDCUtils.wrap(Runnable)"})
  void testWrap_whenRunnableRunDoesNothing_thenCallsRun() {
    // Arrange
    Runnable runnable = mock(Runnable.class);
    doNothing().when(runnable).run();

    // Act
    MDCUtils.wrap(runnable).run();

    // Assert
    verify(runnable).run();
  }
}
