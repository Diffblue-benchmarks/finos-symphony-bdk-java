package com.symphony.bdk.http.api.tracing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DistributedTracingContextDiffblueTest {
  /**
   * Test {@link DistributedTracingContext#getTraceId()}.
   *
   * <p>Method under test: {@link DistributedTracingContext#getTraceId()}
   */
  @Test
  @DisplayName("Test getTraceId()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String DistributedTracingContext.getTraceId()"})
  void testGetTraceId() {
    // Arrange, Act and Assert
    assertEquals("", DistributedTracingContext.getTraceId());
  }

  /**
   * Test {@link DistributedTracingContext#hasTraceId()}.
   *
   * <p>Method under test: {@link DistributedTracingContext#hasTraceId()}
   */
  @Test
  @DisplayName("Test hasTraceId()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DistributedTracingContext.hasTraceId()"})
  void testHasTraceId() {
    // Arrange, Act and Assert
    assertFalse(DistributedTracingContext.hasTraceId());
  }

  /**
   * Test {@link DistributedTracingContext#doWithTraceId(String, Runnable)}.
   *
   * <p>Method under test: {@link DistributedTracingContext#doWithTraceId(String, Runnable)}
   */
  @Test
  @DisplayName("Test doWithTraceId(String, Runnable)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DistributedTracingContext.doWithTraceId(String, Runnable)"})
  void testDoWithTraceId() {
    // Arrange
    Runnable runnable = mock(Runnable.class);
    doNothing().when(runnable).run();

    // Act
    DistributedTracingContext.doWithTraceId("https://example.org/example", runnable);

    // Assert
    verify(runnable).run();
  }
}
