package com.symphony.bdk.core.retry.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.config.model.BdkRetryConfig;
import com.symphony.bdk.core.test.BdkRetryConfigTestHelper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkExponentialFunctionDiffblueTest {
  /**
   * Test {@link BdkExponentialFunction#ofExponentialBackoff(BdkRetryConfig)}.
   *
   * <ul>
   *   <li>Then return apply one longValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link BdkExponentialFunction#ofExponentialBackoff(BdkRetryConfig)}
   */
  @Test
  @DisplayName("Test ofExponentialBackoff(BdkRetryConfig); then return apply one longValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "io.github.resilience4j.core.IntervalFunction BdkExponentialFunction.ofExponentialBackoff(BdkRetryConfig)"
  })
  void testOfExponentialBackoff_thenReturnApplyOneLongValueIsTen() {
    // Arrange, Act and Assert
    assertEquals(
        10L,
        BdkExponentialFunction.ofExponentialBackoff(BdkRetryConfigTestHelper.ofMinimalInterval(3))
            .apply(1)
            .longValue());
  }
}
