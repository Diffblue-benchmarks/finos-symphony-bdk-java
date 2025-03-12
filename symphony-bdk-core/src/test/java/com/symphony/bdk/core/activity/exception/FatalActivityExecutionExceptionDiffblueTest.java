package com.symphony.bdk.core.activity.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.activity.model.ActivityInfo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FatalActivityExecutionExceptionDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link FatalActivityExecutionException#FatalActivityExecutionException(ActivityInfo, String, Throwable)}
   *   <li>{@link FatalActivityExecutionException#getActivityInfo()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void FatalActivityExecutionException.<init>(ActivityInfo, String, Throwable)",
      "ActivityInfo FatalActivityExecutionException.getActivityInfo()"})
  void testGettersAndSetters() {
    // Arrange
    ActivityInfo activityInfo = new ActivityInfo();
    Throwable cause = new Throwable();

    // Act
    FatalActivityExecutionException actualFatalActivityExecutionException = new FatalActivityExecutionException(
        activityInfo, "An error occurred", cause);
    ActivityInfo actualActivityInfo = actualFatalActivityExecutionException.getActivityInfo();

    // Assert
    assertEquals("An error occurred", actualFatalActivityExecutionException.getMessage());
    assertEquals(0, actualFatalActivityExecutionException.getSuppressed().length);
    assertSame(activityInfo, actualActivityInfo);
    assertSame(cause, actualFatalActivityExecutionException.getCause());
  }
}
