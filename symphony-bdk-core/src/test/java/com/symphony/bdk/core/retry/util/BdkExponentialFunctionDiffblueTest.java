package com.symphony.bdk.core.retry.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.config.model.BdkRetryConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkExponentialFunctionDiffblueTest {
  /**
   * Test {@link BdkExponentialFunction#ofExponentialBackoff(BdkRetryConfig)}.
   * <ul>
   *   <li>Then return apply one longValue is five hundred.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkExponentialFunction#ofExponentialBackoff(BdkRetryConfig)}
   */
  @Test
  @DisplayName("Test ofExponentialBackoff(BdkRetryConfig); then return apply one longValue is five hundred")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "io.github.resilience4j.core.IntervalFunction BdkExponentialFunction.ofExponentialBackoff(BdkRetryConfig)"})
  void testOfExponentialBackoff_thenReturnApplyOneLongValueIsFiveHundred() {
    // Arrange, Act and Assert
    assertEquals(500L, BdkExponentialFunction.ofExponentialBackoff(new BdkRetryConfig()).apply(1).longValue());
  }
}
