package com.symphony.bdk.core.activity;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.service.datafeed.EventException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ActivityMatcherDiffblueTest {
  /**
   * Test {@link ActivityMatcher#always()}.
   * <ul>
   *   <li>Then return matches {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ActivityMatcher#always()}
   */
  @Test
  @DisplayName("Test always(); then return matches 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ActivityMatcher ActivityMatcher.always()"})
  void testAlways_thenReturnMatchesNull() throws EventException {
    // Arrange and Act
    ActivityMatcher<ActivityContext<?>> actualAlwaysResult = ActivityMatcher.always();

    // Assert
    assertTrue(actualAlwaysResult.matches(null));
  }
}
