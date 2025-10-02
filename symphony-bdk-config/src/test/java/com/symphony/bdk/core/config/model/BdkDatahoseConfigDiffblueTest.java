package com.symphony.bdk.core.config.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkDatahoseConfigDiffblueTest {
  /**
   * Test new {@link BdkDatahoseConfig} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link BdkDatahoseConfig}
   */
  @Test
  @DisplayName("Test new BdkDatahoseConfig (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BdkDatahoseConfig.<init>()"})
  void testNewBdkDatahoseConfig() {
    // Arrange and Act
    BdkDatahoseConfig actualBdkDatahoseConfig = new BdkDatahoseConfig();

    // Assert
    assertEquals("", actualBdkDatahoseConfig.getTag());
    assertNull(actualBdkDatahoseConfig.getEventTypes());
    BdkRetryConfig retry = actualBdkDatahoseConfig.getRetry();
    assertEquals(
        BdkRetryConfig.DEFAULT_INITIAL_INTERVAL_MILLIS,
        retry.getInitialIntervalMillis().longValue());
    assertEquals(
        BdkRetryConfig.DEFAULT_MAX_INTERVAL_MILLIS, retry.getMaxIntervalMillis().longValue());
    assertEquals(BdkRetryConfig.DEFAULT_MULTIPLIER, retry.getMultiplier().doubleValue());
    assertEquals(Integer.MAX_VALUE, retry.getMaxAttempts().intValue());
  }
}
