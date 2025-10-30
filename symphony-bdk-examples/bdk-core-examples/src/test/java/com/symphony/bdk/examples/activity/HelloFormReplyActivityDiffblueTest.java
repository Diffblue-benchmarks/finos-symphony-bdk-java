package com.symphony.bdk.examples.activity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.activity.ActivityContext;
import com.symphony.bdk.core.activity.ActivityMatcher;
import com.symphony.bdk.core.activity.form.FormReplyContext;
import com.symphony.bdk.core.activity.model.ActivityInfo;
import com.symphony.bdk.core.activity.model.ActivityType;
import com.symphony.bdk.core.service.datafeed.EventException;
import com.symphony.bdk.core.service.message.MessageService;
import com.symphony.bdk.gen.api.model.V4Initiator;
import com.symphony.bdk.gen.api.model.V4Message;
import com.symphony.bdk.gen.api.model.V4Stream;
import com.symphony.bdk.gen.api.model.V4SymphonyElementsAction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class HelloFormReplyActivityDiffblueTest {
  /**
   * Test {@link HelloFormReplyActivity#HelloFormReplyActivity(MessageService)}.
   * <ul>
   *   <li>Then return Info name is {@code Hello Form Reply Activity}.</li>
   * </ul>
   * <p>
   * Method under test: {@link HelloFormReplyActivity#HelloFormReplyActivity(MessageService)}
   */
  @Test
  @DisplayName("Test new HelloFormReplyActivity(MessageService); then return Info name is 'Hello Form Reply Activity'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void HelloFormReplyActivity.<init>(MessageService)"})
  void testNewHelloFormReplyActivity_thenReturnInfoNameIsHelloFormReplyActivity() {
    // Arrange, Act and Assert
    ActivityInfo info = (new HelloFormReplyActivity(null)).getInfo();
    assertEquals("Hello Form Reply Activity", info.name());
    assertNull(info.description());
    assertEquals(ActivityType.FORM, info.type());
  }

  /**
   * Test {@link HelloFormReplyActivity#matcher()}.
   * <p>
   * Method under test: {@link HelloFormReplyActivity#matcher()}
   */
  @Test
  @DisplayName("Test matcher()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ActivityMatcher HelloFormReplyActivity.matcher()"})
  void testMatcher() throws EventException {
    // Arrange and Act
    ActivityMatcher<FormReplyContext> actualMatcherResult = (new HelloFormReplyActivity(null)).matcher();
    V4Initiator initiator = new V4Initiator();

    // Assert
    assertFalse(actualMatcherResult.matches(new FormReplyContext(initiator, new V4SymphonyElementsAction())));
  }

  /**
   * Test {@link HelloFormReplyActivity#onActivity(FormReplyContext)} with {@code FormReplyContext}.
   * <ul>
   *   <li>Then calls {@link ActivityContext#getSourceEvent()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link HelloFormReplyActivity#onActivity(FormReplyContext)}
   */
  @Test
  @DisplayName("Test onActivity(FormReplyContext) with 'FormReplyContext'; then calls getSourceEvent()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void HelloFormReplyActivity.onActivity(FormReplyContext)"})
  void testOnActivityWithFormReplyContext_thenCallsGetSourceEvent() {
    // Arrange
    MessageService messageService = mock(MessageService.class);
    when(messageService.send(Mockito.<V4Stream>any(), Mockito.<String>any())).thenReturn(new V4Message());
    HelloFormReplyActivity helloFormReplyActivity = new HelloFormReplyActivity(messageService);
    FormReplyContext context = mock(FormReplyContext.class);
    when(context.getSourceEvent()).thenReturn(new V4SymphonyElementsAction());
    when(context.getFormValue(Mockito.<String>any())).thenReturn("42");

    // Act
    helloFormReplyActivity.onActivity(context);

    // Assert
    verify(context).getSourceEvent();
    verify(context).getFormValue(eq("name"));
    verify(messageService).send((V4Stream) isNull(), eq("<messageML>Hello, 42!</messageML>"));
  }

  /**
   * Test {@link HelloFormReplyActivity#info()}.
   * <ul>
   *   <li>Then return name is {@code Hello Form Reply Activity}.</li>
   * </ul>
   * <p>
   * Method under test: {@link HelloFormReplyActivity#info()}
   */
  @Test
  @DisplayName("Test info(); then return name is 'Hello Form Reply Activity'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ActivityInfo HelloFormReplyActivity.info()"})
  void testInfo_thenReturnNameIsHelloFormReplyActivity() {
    // Arrange and Act
    ActivityInfo actualInfoResult = (new HelloFormReplyActivity(null)).info();

    // Assert
    assertEquals("Hello Form Reply Activity", actualInfoResult.name());
    assertNull(actualInfoResult.description());
    assertEquals(ActivityType.FORM, actualInfoResult.type());
  }
}
