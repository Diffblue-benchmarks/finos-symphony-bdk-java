package com.symphony.bdk.core.activity;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.service.datafeed.EventException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ActivityMatcherDiffblueTest {
  /**
   * Test {@link ActivityMatcher#always()}.
   *
   * <ul>
   *   <li>Then {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ActivityMatcher#always()}
   */
  @Test
  @DisplayName("Test always(); then 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ActivityMatcher ActivityMatcher.always()"})
  void testAlways_thenNull() throws EventException {
    // Arrange and Act
    ActivityMatcher<ActivityContext<?>> actualAlwaysResult = ActivityMatcher.always();

    // Assert
    assertNull(null);
    assertTrue(actualAlwaysResult.matches(null));
  }
}
