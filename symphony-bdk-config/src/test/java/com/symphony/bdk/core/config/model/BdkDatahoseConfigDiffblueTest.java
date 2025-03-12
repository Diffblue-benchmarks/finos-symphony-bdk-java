package com.symphony.bdk.core.config.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkDatahoseConfigDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BdkDatahoseConfig#setEventTypes(List)}
   *   <li>{@link BdkDatahoseConfig#setRetry(BdkRetryConfig)}
   *   <li>{@link BdkDatahoseConfig#setTag(String)}
   *   <li>{@link BdkDatahoseConfig#getEventTypes()}
   *   <li>{@link BdkDatahoseConfig#getRetry()}
   *   <li>{@link BdkDatahoseConfig#getTag()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List BdkDatahoseConfig.getEventTypes()", "BdkRetryConfig BdkDatahoseConfig.getRetry()",
      "String BdkDatahoseConfig.getTag()", "void BdkDatahoseConfig.setEventTypes(List)",
      "void BdkDatahoseConfig.setRetry(BdkRetryConfig)", "void BdkDatahoseConfig.setTag(String)"})
  void testGettersAndSetters() {
    // Arrange
    BdkDatahoseConfig bdkDatahoseConfig = new BdkDatahoseConfig();
    ArrayList<String> eventTypes = new ArrayList<>();

    // Act
    bdkDatahoseConfig.setEventTypes(eventTypes);
    BdkRetryConfig retry = new BdkRetryConfig();
    bdkDatahoseConfig.setRetry(retry);
    bdkDatahoseConfig.setTag("Tag");
    List<String> actualEventTypes = bdkDatahoseConfig.getEventTypes();
    BdkRetryConfig actualRetry = bdkDatahoseConfig.getRetry();

    // Assert
    assertEquals("Tag", bdkDatahoseConfig.getTag());
    assertTrue(actualEventTypes.isEmpty());
    assertSame(retry, actualRetry);
    assertSame(eventTypes, actualEventTypes);
  }

  /**
   * Test new {@link BdkDatahoseConfig} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link BdkDatahoseConfig}
   */
  @Test
  @DisplayName("Test new BdkDatahoseConfig (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BdkDatahoseConfig.<init>()"})
  void testNewBdkDatahoseConfig() {
    // Arrange and Act
    BdkDatahoseConfig actualBdkDatahoseConfig = new BdkDatahoseConfig();

    // Assert
    assertEquals("", actualBdkDatahoseConfig.getTag());
    assertNull(actualBdkDatahoseConfig.getEventTypes());
    BdkRetryConfig retry = actualBdkDatahoseConfig.getRetry();
    assertEquals(BdkRetryConfig.DEFAULT_INITIAL_INTERVAL_MILLIS, retry.getInitialIntervalMillis().longValue());
    assertEquals(BdkRetryConfig.DEFAULT_MAX_INTERVAL_MILLIS, retry.getMaxIntervalMillis().longValue());
    assertEquals(BdkRetryConfig.DEFAULT_MULTIPLIER, retry.getMultiplier().doubleValue());
    assertEquals(Integer.MAX_VALUE, retry.getMaxAttempts().intValue());
  }
}
