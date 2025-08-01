package com.symphony.bdk.examples.activity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.activity.ActivityMatcher;
import com.symphony.bdk.core.activity.form.FormReplyContext;
import com.symphony.bdk.core.activity.model.ActivityInfo;
import com.symphony.bdk.core.activity.model.ActivityType;
import com.symphony.bdk.core.retry.RetryWithRecoveryBuilder;
import com.symphony.bdk.core.service.datafeed.EventException;
import com.symphony.bdk.core.service.message.MessageService;
import com.symphony.bdk.gen.api.AttachmentsApi;
import com.symphony.bdk.gen.api.DefaultApi;
import com.symphony.bdk.gen.api.MessageApi;
import com.symphony.bdk.gen.api.MessageSuppressionApi;
import com.symphony.bdk.gen.api.MessagesApi;
import com.symphony.bdk.gen.api.PodApi;
import com.symphony.bdk.gen.api.StreamsApi;
import com.symphony.bdk.gen.api.model.V4Initiator;
import com.symphony.bdk.gen.api.model.V4SymphonyElementsAction;
import com.symphony.bdk.template.api.TemplateEngine;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class HelloFormReplyActivityDiffblueTest {
  /**
   * Test {@link HelloFormReplyActivity#HelloFormReplyActivity(MessageService)}.
   *
   * <p>Method under test: {@link HelloFormReplyActivity#HelloFormReplyActivity(MessageService)}
   */
  @Test
  @DisplayName("Test new HelloFormReplyActivity(MessageService)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void HelloFormReplyActivity.<init>(MessageService)"})
  void testNewHelloFormReplyActivity() {
    // Arrange, Act and Assert
    ActivityInfo info =
        new HelloFormReplyActivity(
                new MessageService(
                    mock(MessagesApi.class),
                    mock(MessageApi.class),
                    mock(MessageSuppressionApi.class),
                    mock(StreamsApi.class),
                    mock(PodApi.class),
                    mock(AttachmentsApi.class),
                    mock(DefaultApi.class),
                    mock(TemplateEngine.class),
                    mock(RetryWithRecoveryBuilder.class)))
            .getInfo();
    assertEquals("Hello Form Reply Activity", info.name());
    assertNull(info.description());
    assertEquals(ActivityType.FORM, info.type());
  }

  /**
   * Test {@link HelloFormReplyActivity#matcher()}.
   *
   * <p>Method under test: {@link HelloFormReplyActivity#matcher()}
   */
  @Test
  @DisplayName("Test matcher()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ActivityMatcher HelloFormReplyActivity.matcher()"})
  void testMatcher() throws EventException {
    // Arrange and Act
    ActivityMatcher<FormReplyContext> actualMatcherResult =
        new HelloFormReplyActivity(null).matcher();
    V4Initiator initiator = new V4Initiator();

    // Assert
    assertFalse(
        actualMatcherResult.matches(
            new FormReplyContext(initiator, new V4SymphonyElementsAction())));
  }

  /**
   * Test {@link HelloFormReplyActivity#info()}.
   *
   * <ul>
   *   <li>Then return name is {@code Hello Form Reply Activity}.
   * </ul>
   *
   * <p>Method under test: {@link HelloFormReplyActivity#info()}
   */
  @Test
  @DisplayName("Test info(); then return name is 'Hello Form Reply Activity'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ActivityInfo HelloFormReplyActivity.info()"})
  void testInfo_thenReturnNameIsHelloFormReplyActivity() {
    // Arrange and Act
    ActivityInfo actualInfoResult = new HelloFormReplyActivity(null).info();

    // Assert
    assertEquals("Hello Form Reply Activity", actualInfoResult.name());
    assertNull(actualInfoResult.description());
    assertEquals(ActivityType.FORM, actualInfoResult.type());
  }
}
