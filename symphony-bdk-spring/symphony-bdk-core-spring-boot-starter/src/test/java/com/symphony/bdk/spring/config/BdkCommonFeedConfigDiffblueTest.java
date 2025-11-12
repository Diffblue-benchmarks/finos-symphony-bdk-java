package com.symphony.bdk.spring.config;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.context.event.SimpleApplicationEventMulticaster;

class BdkCommonFeedConfigDiffblueTest {
  /**
   * Test {@link BdkCommonFeedConfig#simpleApplicationEventMulticaster()}.
   *
   * <p>Method under test: {@link BdkCommonFeedConfig#simpleApplicationEventMulticaster()}
   */
  @Test
  @DisplayName("Test simpleApplicationEventMulticaster()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "org.springframework.context.event.ApplicationEventMulticaster BdkCommonFeedConfig.simpleApplicationEventMulticaster()"
  })
  void testSimpleApplicationEventMulticaster() {
    // Arrange, Act and Assert
    assertTrue(
        new BdkCommonFeedConfig().simpleApplicationEventMulticaster()
            instanceof SimpleApplicationEventMulticaster);
  }
}
