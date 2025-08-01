package com.symphony.bdk.core.activity.model;

import static org.junit.jupiter.api.Assertions.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ActivityInfoDiffblueTest {
  /**
   * Test new {@link ActivityInfo} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link ActivityInfo}
   */
  @Test
  @DisplayName("Test new ActivityInfo (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ActivityInfo.<init>()"})
  void testNewActivityInfo() {
    // Arrange and Act
    ActivityInfo actualActivityInfo = new ActivityInfo();

    // Assert
    assertNull(actualActivityInfo.type());
    assertNull(actualActivityInfo.description());
    assertNull(actualActivityInfo.name());
  }
}
