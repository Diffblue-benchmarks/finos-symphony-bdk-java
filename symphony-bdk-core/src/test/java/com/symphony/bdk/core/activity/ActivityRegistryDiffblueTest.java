package com.symphony.bdk.core.activity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.activity.form.TestFormReplyActivity;
import com.symphony.bdk.core.service.datafeed.RealTimeEventListener;
import com.symphony.bdk.core.service.datafeed.impl.DatahoseLoopImpl;
import com.symphony.bdk.gen.api.model.UserV2;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ActivityRegistryDiffblueTest {
  /**
   * Test {@link ActivityRegistry#register(AbstractActivity)}.
   *
   * <p>Method under test: {@link ActivityRegistry#register(AbstractActivity)}
   */
  @Test
  @DisplayName("Test register(AbstractActivity)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ActivityRegistry.register(AbstractActivity)"})
  void testRegister() {
    // Arrange
    DatahoseLoopImpl datafeedLoop = mock(DatahoseLoopImpl.class);
    doNothing().when(datafeedLoop).subscribe(Mockito.<RealTimeEventListener>any());
    ActivityRegistry activityRegistry = new ActivityRegistry(new UserV2(), datafeedLoop);
    TestCommandActivity activity = new TestCommandActivity("Name");

    // Act
    activityRegistry.register(activity);

    // Assert
    verify(datafeedLoop).subscribe(isA(RealTimeEventListener.class));
    List<AbstractActivity<?, ?>> activityList = activityRegistry.getActivityList();
    assertEquals(1, activityList.size());
    assertSame(activity, activityList.get(0));
  }

  /**
   * Test {@link ActivityRegistry#register(AbstractActivity)}.
   *
   * <p>Method under test: {@link ActivityRegistry#register(AbstractActivity)}
   */
  @Test
  @DisplayName("Test register(AbstractActivity)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ActivityRegistry.register(AbstractActivity)"})
  void testRegister2() {
    // Arrange
    DatahoseLoopImpl datafeedLoop = mock(DatahoseLoopImpl.class);
    doNothing().when(datafeedLoop).subscribe(Mockito.<RealTimeEventListener>any());
    ActivityRegistry activityRegistry = new ActivityRegistry(new UserV2(), datafeedLoop);
    TestFormReplyActivity activity = new TestFormReplyActivity();

    // Act
    activityRegistry.register(activity);

    // Assert
    verify(datafeedLoop).subscribe(isA(RealTimeEventListener.class));
    List<AbstractActivity<?, ?>> activityList = activityRegistry.getActivityList();
    assertEquals(1, activityList.size());
    assertSame(activity, activityList.get(0));
  }

  /**
   * Test {@link ActivityRegistry#getActivityList()}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link ActivityRegistry#getActivityList()}
   */
  @Test
  @DisplayName("Test getActivityList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ActivityRegistry.getActivityList()"})
  void testGetActivityList_thenReturnEmpty() {
    // Arrange
    ActivityRegistry activityRegistry = new ActivityRegistry(new UserV2(), null);

    // Act and Assert
    assertTrue(activityRegistry.getActivityList().isEmpty());
  }
}
