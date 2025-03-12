package com.symphony.bdk.examples.activity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.activity.ActivityMatcher;
import com.symphony.bdk.core.activity.form.FormReplyContext;
import com.symphony.bdk.core.activity.model.ActivityInfo;
import com.symphony.bdk.core.activity.model.ActivityType;
import com.symphony.bdk.core.service.datafeed.EventException;
import com.symphony.bdk.examples.activity.context.GifFormReplyContext;
import com.symphony.bdk.gen.api.model.V4Initiator;
import com.symphony.bdk.gen.api.model.V4SymphonyElementsAction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class GifFormReplyActivityDiffblueTest {
  /**
   * Test {@link GifFormReplyActivity#matcher()}.
   * <p>
   * Method under test: {@link GifFormReplyActivity#matcher()}
   */
  @Test
  @DisplayName("Test matcher()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ActivityMatcher GifFormReplyActivity.matcher()"})
  void testMatcher() throws EventException {
    // Arrange and Act
    ActivityMatcher<GifFormReplyContext> actualMatcherResult = (new GifFormReplyActivity()).matcher();
    V4Initiator initiator = new V4Initiator();

    // Assert
    assertFalse(actualMatcherResult.matches(new GifFormReplyContext(initiator, new V4SymphonyElementsAction())));
  }

  /**
   * Test {@link GifFormReplyActivity#onActivity(GifFormReplyContext)} with {@code GifFormReplyContext}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then calls {@link FormReplyContext#getFormValue(String)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GifFormReplyActivity#onActivity(GifFormReplyContext)}
   */
  @Test
  @DisplayName("Test onActivity(GifFormReplyContext) with 'GifFormReplyContext'; given '42'; then calls getFormValue(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void GifFormReplyActivity.onActivity(GifFormReplyContext)"})
  void testOnActivityWithGifFormReplyContext_given42_thenCallsGetFormValue() {
    // Arrange
    GifFormReplyActivity gifFormReplyActivity = new GifFormReplyActivity();
    GifFormReplyContext context = mock(GifFormReplyContext.class);
    when(context.getFormValue(Mockito.<String>any())).thenReturn("42");

    // Act
    gifFormReplyActivity.onActivity(context);

    // Assert
    verify(context).getFormValue(eq("category"));
  }

  /**
   * Test {@link GifFormReplyActivity#isAsynchronous()}.
   * <p>
   * Method under test: {@link GifFormReplyActivity#isAsynchronous()}
   */
  @Test
  @DisplayName("Test isAsynchronous()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean GifFormReplyActivity.isAsynchronous()"})
  void testIsAsynchronous() {
    // Arrange, Act and Assert
    assertTrue((new GifFormReplyActivity()).isAsynchronous());
  }

  /**
   * Test {@link GifFormReplyActivity#info()}.
   * <p>
   * Method under test: {@link GifFormReplyActivity#info()}
   */
  @Test
  @DisplayName("Test info()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ActivityInfo GifFormReplyActivity.info()"})
  void testInfo() {
    // Arrange and Act
    ActivityInfo actualInfoResult = (new GifFormReplyActivity()).info();

    // Assert
    assertEquals("Form handler for the Gif Category form", actualInfoResult.description());
    assertEquals("Gif Display category form command", actualInfoResult.name());
    assertEquals(ActivityType.FORM, actualInfoResult.type());
  }

  /**
   * Test new {@link GifFormReplyActivity} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link GifFormReplyActivity}
   */
  @Test
  @DisplayName("Test new GifFormReplyActivity (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void GifFormReplyActivity.<init>()"})
  void testNewGifFormReplyActivity() {
    // Arrange and Act
    GifFormReplyActivity actualGifFormReplyActivity = new GifFormReplyActivity();

    // Assert
    ActivityInfo info = actualGifFormReplyActivity.getInfo();
    assertEquals("Form handler for the Gif Category form", info.description());
    assertEquals("Gif Display category form command", info.name());
    assertEquals(ActivityType.FORM, info.type());
    assertTrue(actualGifFormReplyActivity.isAsynchronous());
  }
}
