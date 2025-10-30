package com.symphony.bdk.http.api.tracing;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MDCUtilsDiffblueTest {
  /**
   * Test {@link MDCUtils#wrap(Runnable)}.
   * <p>
   * Method under test: {@link MDCUtils#wrap(Runnable)}
   */
  @Test
  @DisplayName("Test wrap(Runnable)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Runnable MDCUtils.wrap(Runnable)"})
  void testWrap() {
    // Arrange
    Runnable runnable = mock(Runnable.class);
    doNothing().when(runnable).run();

    // Act
    MDCUtils.wrap(runnable).run();

    // Assert
    verify(runnable).run();
  }
}
