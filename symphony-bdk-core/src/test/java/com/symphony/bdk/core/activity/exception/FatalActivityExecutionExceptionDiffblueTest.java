package com.symphony.bdk.core.activity.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.activity.model.ActivityInfo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FatalActivityExecutionExceptionDiffblueTest {
  /**
   * Test {@link FatalActivityExecutionException#FatalActivityExecutionException(ActivityInfo,
   * String, Throwable)}.
   *
   * <p>Method under test: {@link
   * FatalActivityExecutionException#FatalActivityExecutionException(ActivityInfo, String,
   * Throwable)}
   */
  @Test
  @DisplayName("Test new FatalActivityExecutionException(ActivityInfo, String, Throwable)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void FatalActivityExecutionException.<init>(ActivityInfo, String, Throwable)"
  })
  void testNewFatalActivityExecutionException() {
    // Arrange
    ActivityInfo activityInfo = new ActivityInfo();
    Throwable cause = new Throwable();

    // Act
    FatalActivityExecutionException actualFatalActivityExecutionException =
        new FatalActivityExecutionException(activityInfo, "An error occurred", cause);

    // Assert
    assertEquals("An error occurred", actualFatalActivityExecutionException.getMessage());
    assertEquals(0, actualFatalActivityExecutionException.getSuppressed().length);
    assertSame(activityInfo, actualFatalActivityExecutionException.getActivityInfo());
    assertSame(cause, actualFatalActivityExecutionException.getCause());
  }
}
