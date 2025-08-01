package com.symphony.bdk.core.service.message;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.AuthSession;
import com.symphony.bdk.core.auth.impl.AuthSessionImpl;
import com.symphony.bdk.core.auth.impl.BotAuthenticatorCertImpl;
import com.symphony.bdk.core.config.model.BdkCommonJwtConfig;
import com.symphony.bdk.core.config.model.BdkRetryConfig;
import com.symphony.bdk.core.retry.RetryWithRecoveryBuilder;
import com.symphony.bdk.core.service.message.model.Message;
import com.symphony.bdk.core.service.message.model.SortDir;
import com.symphony.bdk.core.service.pagination.model.PaginationAttribute;
import com.symphony.bdk.core.service.stream.constant.AttachmentSort;
import com.symphony.bdk.core.service.version.AgentVersionService;
import com.symphony.bdk.gen.api.AttachmentsApi;
import com.symphony.bdk.gen.api.DefaultApi;
import com.symphony.bdk.gen.api.MessageApi;
import com.symphony.bdk.gen.api.MessageSuppressionApi;
import com.symphony.bdk.gen.api.MessagesApi;
import com.symphony.bdk.gen.api.PodApi;
import com.symphony.bdk.gen.api.StreamsApi;
import com.symphony.bdk.gen.api.model.MessageSearchQuery;
import com.symphony.bdk.gen.api.model.V4Message;
import com.symphony.bdk.gen.api.model.V4Stream;
import com.symphony.bdk.http.api.ApiClient;
import com.symphony.bdk.template.api.TemplateEngine;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MessageServiceDiffblueTest {
  /**
   * Test {@link MessageService#obo(AuthSession)}.
   *
   * <ul>
   *   <li>Then return {@link MessageService}.
   * </ul>
   *
   * <p>Method under test: {@link MessageService#obo(AuthSession)}
   */
  @Test
  @DisplayName("Test obo(AuthSession); then return MessageService")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.core.service.message.OboMessageService MessageService.obo(AuthSession)"
  })
  void testObo_thenReturnMessageService() {
    // Arrange
    MessageService messageService =
        new MessageService(
            mock(MessagesApi.class),
            mock(MessageApi.class),
            mock(MessageSuppressionApi.class),
            mock(StreamsApi.class),
            mock(PodApi.class),
            mock(AttachmentsApi.class),
            mock(DefaultApi.class),
            mock(TemplateEngine.class),
            mock(RetryWithRecoveryBuilder.class));

    // Act and Assert
    assertTrue(
        messageService.obo(
                new AuthSessionImpl(
                    new BotAuthenticatorCertImpl(
                        mock(BdkRetryConfig.class),
                        "janedoe",
                        mock(BdkCommonJwtConfig.class),
                        mock(ApiClient.class),
                        mock(ApiClient.class),
                        mock(ApiClient.class),
                        mock(AgentVersionService.class))))
            instanceof MessageService);
  }

  /**
   * Test {@link MessageService#listMessages(String, Instant, PaginationAttribute)} with {@code
   * streamId}, {@code since}, {@code pagination}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MessageService#listMessages(String, Instant, PaginationAttribute)}
   */
  @Test
  @DisplayName(
      "Test listMessages(String, Instant, PaginationAttribute) with 'streamId', 'since', 'pagination'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List MessageService.listMessages(String, Instant, PaginationAttribute)"})
  void testListMessagesWithStreamIdSincePagination_thenThrowIllegalArgumentException() {
    // Arrange
    MessageApi messageApi = mock(MessageApi.class);
    when(messageApi.getApiClient()).thenThrow(new IllegalArgumentException());
    MessageService messageService =
        new MessageService(
            mock(MessagesApi.class),
            messageApi,
            mock(MessageSuppressionApi.class),
            mock(StreamsApi.class),
            mock(PodApi.class),
            mock(AttachmentsApi.class),
            mock(DefaultApi.class),
            mock(TemplateEngine.class),
            mock(RetryWithRecoveryBuilder.class));
    Instant since = LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> messageService.listMessages("42", since, new PaginationAttribute(1, 1)));
    verify(messageApi).getApiClient();
  }

  /**
   * Test {@link MessageService#listMessages(String, Instant)} with {@code streamId}, {@code since}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MessageService#listMessages(String, Instant)}
   */
  @Test
  @DisplayName(
      "Test listMessages(String, Instant) with 'streamId', 'since'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List MessageService.listMessages(String, Instant)"})
  void testListMessagesWithStreamIdSince_thenThrowIllegalArgumentException() {
    // Arrange
    MessageApi messageApi = mock(MessageApi.class);
    when(messageApi.getApiClient()).thenThrow(new IllegalArgumentException());
    MessageService messageService =
        new MessageService(
            mock(MessagesApi.class),
            messageApi,
            mock(MessageSuppressionApi.class),
            mock(StreamsApi.class),
            mock(PodApi.class),
            mock(AttachmentsApi.class),
            mock(DefaultApi.class),
            mock(TemplateEngine.class),
            mock(RetryWithRecoveryBuilder.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            messageService.listMessages(
                "42", LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
    verify(messageApi).getApiClient();
  }

  /**
   * Test {@link MessageService#listMessages(V4Stream, Instant, PaginationAttribute)} with {@code
   * stream}, {@code since}, {@code pagination}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MessageService#listMessages(V4Stream, Instant,
   * PaginationAttribute)}
   */
  @Test
  @DisplayName(
      "Test listMessages(V4Stream, Instant, PaginationAttribute) with 'stream', 'since', 'pagination'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List MessageService.listMessages(V4Stream, Instant, PaginationAttribute)"})
  void testListMessagesWithStreamSincePagination_thenThrowIllegalArgumentException() {
    // Arrange
    MessageApi messageApi = mock(MessageApi.class);
    when(messageApi.getApiClient()).thenThrow(new IllegalArgumentException());
    MessageService messageService =
        new MessageService(
            mock(MessagesApi.class),
            messageApi,
            mock(MessageSuppressionApi.class),
            mock(StreamsApi.class),
            mock(PodApi.class),
            mock(AttachmentsApi.class),
            mock(DefaultApi.class),
            mock(TemplateEngine.class),
            mock(RetryWithRecoveryBuilder.class));
    V4Stream stream = new V4Stream();
    Instant since = LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> messageService.listMessages(stream, since, new PaginationAttribute(1, 1)));
    verify(messageApi).getApiClient();
  }

  /**
   * Test {@link MessageService#listMessages(V4Stream, Instant)} with {@code stream}, {@code since}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MessageService#listMessages(V4Stream, Instant)}
   */
  @Test
  @DisplayName(
      "Test listMessages(V4Stream, Instant) with 'stream', 'since'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List MessageService.listMessages(V4Stream, Instant)"})
  void testListMessagesWithStreamSince_thenThrowIllegalArgumentException() {
    // Arrange
    MessageApi messageApi = mock(MessageApi.class);
    when(messageApi.getApiClient()).thenThrow(new IllegalArgumentException());
    MessageService messageService =
        new MessageService(
            mock(MessagesApi.class),
            messageApi,
            mock(MessageSuppressionApi.class),
            mock(StreamsApi.class),
            mock(PodApi.class),
            mock(AttachmentsApi.class),
            mock(DefaultApi.class),
            mock(TemplateEngine.class),
            mock(RetryWithRecoveryBuilder.class));
    V4Stream stream = new V4Stream();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            messageService.listMessages(
                stream,
                LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
    verify(messageApi).getApiClient();
  }

  /**
   * Test {@link MessageService#searchMessages(MessageSearchQuery, PaginationAttribute)} with {@code
   * query}, {@code pagination}.
   *
   * <p>Method under test: {@link MessageService#searchMessages(MessageSearchQuery,
   * PaginationAttribute)}
   */
  @Test
  @DisplayName(
      "Test searchMessages(MessageSearchQuery, PaginationAttribute) with 'query', 'pagination'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List MessageService.searchMessages(MessageSearchQuery, PaginationAttribute)"})
  void testSearchMessagesWithQueryPagination() {
    // Arrange
    MessageService messageService =
        new MessageService(
            mock(MessagesApi.class),
            mock(MessageApi.class),
            mock(MessageSuppressionApi.class),
            mock(StreamsApi.class),
            mock(PodApi.class),
            mock(AttachmentsApi.class),
            mock(DefaultApi.class),
            mock(TemplateEngine.class),
            mock(RetryWithRecoveryBuilder.class));

    MessageSearchQuery query = new MessageSearchQuery();
    query.streamType("searchMessages");

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> messageService.searchMessages(query, new PaginationAttribute(1, 1)));
  }

  /**
   * Test {@link MessageService#searchMessages(MessageSearchQuery, PaginationAttribute, SortDir)}
   * with {@code query}, {@code pagination}, {@code sortDir}.
   *
   * <p>Method under test: {@link MessageService#searchMessages(MessageSearchQuery,
   * PaginationAttribute, SortDir)}
   */
  @Test
  @DisplayName(
      "Test searchMessages(MessageSearchQuery, PaginationAttribute, SortDir) with 'query', 'pagination', 'sortDir'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "List MessageService.searchMessages(MessageSearchQuery, PaginationAttribute, SortDir)"
  })
  void testSearchMessagesWithQueryPaginationSortDir() {
    // Arrange
    MessageService messageService =
        new MessageService(
            mock(MessagesApi.class),
            mock(MessageApi.class),
            mock(MessageSuppressionApi.class),
            mock(StreamsApi.class),
            mock(PodApi.class),
            mock(AttachmentsApi.class),
            mock(DefaultApi.class),
            mock(TemplateEngine.class),
            mock(RetryWithRecoveryBuilder.class));

    MessageSearchQuery query = new MessageSearchQuery();
    query.text("searchMessages");

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> messageService.searchMessages(query, new PaginationAttribute(1, 1), SortDir.DESC));
  }

  /**
   * Test {@link MessageService#searchMessages(MessageSearchQuery, PaginationAttribute, SortDir)}
   * with {@code query}, {@code pagination}, {@code sortDir}.
   *
   * <p>Method under test: {@link MessageService#searchMessages(MessageSearchQuery,
   * PaginationAttribute, SortDir)}
   */
  @Test
  @DisplayName(
      "Test searchMessages(MessageSearchQuery, PaginationAttribute, SortDir) with 'query', 'pagination', 'sortDir'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "List MessageService.searchMessages(MessageSearchQuery, PaginationAttribute, SortDir)"
  })
  void testSearchMessagesWithQueryPaginationSortDir2() {
    // Arrange
    MessageService messageService =
        new MessageService(
            mock(MessagesApi.class),
            mock(MessageApi.class),
            mock(MessageSuppressionApi.class),
            mock(StreamsApi.class),
            mock(PodApi.class),
            mock(AttachmentsApi.class),
            mock(DefaultApi.class),
            mock(TemplateEngine.class),
            mock(RetryWithRecoveryBuilder.class));

    MessageSearchQuery query = new MessageSearchQuery();
    query.streamType("searchMessages");

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> messageService.searchMessages(query, new PaginationAttribute(1, 1), SortDir.DESC));
  }

  /**
   * Test {@link MessageService#searchMessages(MessageSearchQuery, PaginationAttribute, SortDir)}
   * with {@code query}, {@code pagination}, {@code sortDir}.
   *
   * <ul>
   *   <li>Then calls {@link MessageApi#getApiClient()}.
   * </ul>
   *
   * <p>Method under test: {@link MessageService#searchMessages(MessageSearchQuery,
   * PaginationAttribute, SortDir)}
   */
  @Test
  @DisplayName(
      "Test searchMessages(MessageSearchQuery, PaginationAttribute, SortDir) with 'query', 'pagination', 'sortDir'; then calls getApiClient()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "List MessageService.searchMessages(MessageSearchQuery, PaginationAttribute, SortDir)"
  })
  void testSearchMessagesWithQueryPaginationSortDir_thenCallsGetApiClient() {
    // Arrange
    MessageApi messageApi = mock(MessageApi.class);
    when(messageApi.getApiClient()).thenThrow(new IllegalArgumentException());
    MessageService messageService =
        new MessageService(
            mock(MessagesApi.class),
            messageApi,
            mock(MessageSuppressionApi.class),
            mock(StreamsApi.class),
            mock(PodApi.class),
            mock(AttachmentsApi.class),
            mock(DefaultApi.class),
            mock(TemplateEngine.class),
            mock(RetryWithRecoveryBuilder.class));
    MessageSearchQuery query = new MessageSearchQuery();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> messageService.searchMessages(query, new PaginationAttribute(1, 1), SortDir.DESC));
    verify(messageApi).getApiClient();
  }

  /**
   * Test {@link MessageService#searchMessages(MessageSearchQuery, PaginationAttribute)} with {@code
   * query}, {@code pagination}.
   *
   * <ul>
   *   <li>Then calls {@link MessageApi#getApiClient()}.
   * </ul>
   *
   * <p>Method under test: {@link MessageService#searchMessages(MessageSearchQuery,
   * PaginationAttribute)}
   */
  @Test
  @DisplayName(
      "Test searchMessages(MessageSearchQuery, PaginationAttribute) with 'query', 'pagination'; then calls getApiClient()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List MessageService.searchMessages(MessageSearchQuery, PaginationAttribute)"})
  void testSearchMessagesWithQueryPagination_thenCallsGetApiClient() {
    // Arrange
    MessageApi messageApi = mock(MessageApi.class);
    when(messageApi.getApiClient()).thenThrow(new IllegalArgumentException());
    MessageService messageService =
        new MessageService(
            mock(MessagesApi.class),
            messageApi,
            mock(MessageSuppressionApi.class),
            mock(StreamsApi.class),
            mock(PodApi.class),
            mock(AttachmentsApi.class),
            mock(DefaultApi.class),
            mock(TemplateEngine.class),
            mock(RetryWithRecoveryBuilder.class));
    MessageSearchQuery query = new MessageSearchQuery();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> messageService.searchMessages(query, new PaginationAttribute(1, 1)));
    verify(messageApi).getApiClient();
  }

  /**
   * Test {@link MessageService#searchMessages(MessageSearchQuery, PaginationAttribute)} with {@code
   * query}, {@code pagination}.
   *
   * <ul>
   *   <li>When {@link MessageSearchQuery} (default constructor) text {@code searchMessages}.
   * </ul>
   *
   * <p>Method under test: {@link MessageService#searchMessages(MessageSearchQuery,
   * PaginationAttribute)}
   */
  @Test
  @DisplayName(
      "Test searchMessages(MessageSearchQuery, PaginationAttribute) with 'query', 'pagination'; when MessageSearchQuery (default constructor) text 'searchMessages'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List MessageService.searchMessages(MessageSearchQuery, PaginationAttribute)"})
  void testSearchMessagesWithQueryPagination_whenMessageSearchQueryTextSearchMessages() {
    // Arrange
    MessageService messageService =
        new MessageService(
            mock(MessagesApi.class),
            mock(MessageApi.class),
            mock(MessageSuppressionApi.class),
            mock(StreamsApi.class),
            mock(PodApi.class),
            mock(AttachmentsApi.class),
            mock(DefaultApi.class),
            mock(TemplateEngine.class),
            mock(RetryWithRecoveryBuilder.class));

    MessageSearchQuery query = new MessageSearchQuery();
    query.text("searchMessages");

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> messageService.searchMessages(query, new PaginationAttribute(1, 1)));
  }

  /**
   * Test {@link MessageService#searchMessages(MessageSearchQuery)} with {@code query}.
   *
   * <ul>
   *   <li>Then calls {@link MessageApi#getApiClient()}.
   * </ul>
   *
   * <p>Method under test: {@link MessageService#searchMessages(MessageSearchQuery)}
   */
  @Test
  @DisplayName("Test searchMessages(MessageSearchQuery) with 'query'; then calls getApiClient()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List MessageService.searchMessages(MessageSearchQuery)"})
  void testSearchMessagesWithQuery_thenCallsGetApiClient() {
    // Arrange
    MessageApi messageApi = mock(MessageApi.class);
    when(messageApi.getApiClient()).thenThrow(new IllegalArgumentException());
    MessageService messageService =
        new MessageService(
            mock(MessagesApi.class),
            messageApi,
            mock(MessageSuppressionApi.class),
            mock(StreamsApi.class),
            mock(PodApi.class),
            mock(AttachmentsApi.class),
            mock(DefaultApi.class),
            mock(TemplateEngine.class),
            mock(RetryWithRecoveryBuilder.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> messageService.searchMessages(new MessageSearchQuery()));
    verify(messageApi).getApiClient();
  }

  /**
   * Test {@link MessageService#searchMessages(MessageSearchQuery)} with {@code query}.
   *
   * <ul>
   *   <li>When {@link MessageSearchQuery} (default constructor) streamType {@code searchMessages}.
   * </ul>
   *
   * <p>Method under test: {@link MessageService#searchMessages(MessageSearchQuery)}
   */
  @Test
  @DisplayName(
      "Test searchMessages(MessageSearchQuery) with 'query'; when MessageSearchQuery (default constructor) streamType 'searchMessages'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List MessageService.searchMessages(MessageSearchQuery)"})
  void testSearchMessagesWithQuery_whenMessageSearchQueryStreamTypeSearchMessages() {
    // Arrange
    MessageService messageService =
        new MessageService(
            mock(MessagesApi.class),
            mock(MessageApi.class),
            mock(MessageSuppressionApi.class),
            mock(StreamsApi.class),
            mock(PodApi.class),
            mock(AttachmentsApi.class),
            mock(DefaultApi.class),
            mock(TemplateEngine.class),
            mock(RetryWithRecoveryBuilder.class));

    MessageSearchQuery query = new MessageSearchQuery();
    query.streamType("searchMessages");

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> messageService.searchMessages(query));
  }

  /**
   * Test {@link MessageService#searchMessages(MessageSearchQuery)} with {@code query}.
   *
   * <ul>
   *   <li>When {@link MessageSearchQuery} (default constructor) text {@code searchMessages}.
   * </ul>
   *
   * <p>Method under test: {@link MessageService#searchMessages(MessageSearchQuery)}
   */
  @Test
  @DisplayName(
      "Test searchMessages(MessageSearchQuery) with 'query'; when MessageSearchQuery (default constructor) text 'searchMessages'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List MessageService.searchMessages(MessageSearchQuery)"})
  void testSearchMessagesWithQuery_whenMessageSearchQueryTextSearchMessages() {
    // Arrange
    MessageService messageService =
        new MessageService(
            mock(MessagesApi.class),
            mock(MessageApi.class),
            mock(MessageSuppressionApi.class),
            mock(StreamsApi.class),
            mock(PodApi.class),
            mock(AttachmentsApi.class),
            mock(DefaultApi.class),
            mock(TemplateEngine.class),
            mock(RetryWithRecoveryBuilder.class));

    MessageSearchQuery query = new MessageSearchQuery();
    query.text("searchMessages");

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> messageService.searchMessages(query));
  }

  /**
   * Test {@link MessageService#send(List, Message)} with {@code List}, {@code Message}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MessageService#send(List, Message)}
   */
  @Test
  @DisplayName(
      "Test send(List, Message) with 'List', 'Message'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V4MessageBlastResponse MessageService.send(List, Message)"})
  void testSendWithListMessage_thenThrowIllegalArgumentException() {
    // Arrange
    MessagesApi messagesApi = mock(MessagesApi.class);
    when(messagesApi.getApiClient()).thenThrow(new IllegalArgumentException());
    MessageService messageService =
        new MessageService(
            messagesApi,
            mock(MessageApi.class),
            mock(MessageSuppressionApi.class),
            mock(StreamsApi.class),
            mock(PodApi.class),
            mock(AttachmentsApi.class),
            mock(DefaultApi.class),
            mock(TemplateEngine.class),
            mock(RetryWithRecoveryBuilder.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> messageService.send(new ArrayList<>(), mock(Message.class)));
    verify(messagesApi).getApiClient();
  }

  /**
   * Test {@link MessageService#send(String, Message)} with {@code String}, {@code Message}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MessageService#send(String, Message)}
   */
  @Test
  @DisplayName(
      "Test send(String, Message) with 'String', 'Message'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V4Message MessageService.send(String, Message)"})
  void testSendWithStringMessage_thenThrowIllegalArgumentException() {
    // Arrange
    MessagesApi messagesApi = mock(MessagesApi.class);
    when(messagesApi.getApiClient()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new MessageService(
                    messagesApi,
                    mock(MessageApi.class),
                    mock(MessageSuppressionApi.class),
                    mock(StreamsApi.class),
                    mock(PodApi.class),
                    mock(AttachmentsApi.class),
                    mock(DefaultApi.class),
                    mock(TemplateEngine.class),
                    mock(RetryWithRecoveryBuilder.class))
                .send("42", mock(Message.class)));
    verify(messagesApi).getApiClient();
  }

  /**
   * Test {@link MessageService#send(String, String)} with {@code String}, {@code String}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MessageService#send(String, String)}
   */
  @Test
  @DisplayName(
      "Test send(String, String) with 'String', 'String'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V4Message MessageService.send(String, String)"})
  void testSendWithStringString_thenThrowIllegalArgumentException() {
    // Arrange
    MessagesApi messagesApi = mock(MessagesApi.class);
    when(messagesApi.getApiClient()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new MessageService(
                    messagesApi,
                    mock(MessageApi.class),
                    mock(MessageSuppressionApi.class),
                    mock(StreamsApi.class),
                    mock(PodApi.class),
                    mock(AttachmentsApi.class),
                    mock(DefaultApi.class),
                    mock(TemplateEngine.class),
                    mock(RetryWithRecoveryBuilder.class))
                .send("42", "Not all who wander are lost"));
    verify(messagesApi).getApiClient();
  }

  /**
   * Test {@link MessageService#send(V4Stream, Message)} with {@code V4Stream}, {@code Message}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link MessageService#send(V4Stream, Message)}
   */
  @Test
  @DisplayName(
      "Test send(V4Stream, Message) with 'V4Stream', 'Message'; given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V4Message MessageService.send(V4Stream, Message)"})
  void testSendWithV4StreamMessage_givenIllegalArgumentException() {
    // Arrange
    MessageService messageService =
        new MessageService(
            mock(MessagesApi.class),
            mock(MessageApi.class),
            mock(MessageSuppressionApi.class),
            mock(StreamsApi.class),
            mock(PodApi.class),
            mock(AttachmentsApi.class),
            mock(DefaultApi.class),
            mock(TemplateEngine.class),
            mock(RetryWithRecoveryBuilder.class));
    V4Stream stream = mock(V4Stream.class);
    when(stream.getStreamId()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> messageService.send(stream, mock(Message.class)));
    verify(stream).getStreamId();
  }

  /**
   * Test {@link MessageService#send(V4Stream, Message)} with {@code V4Stream}, {@code Message}.
   *
   * <ul>
   *   <li>Then calls {@link MessagesApi#getApiClient()}.
   * </ul>
   *
   * <p>Method under test: {@link MessageService#send(V4Stream, Message)}
   */
  @Test
  @DisplayName("Test send(V4Stream, Message) with 'V4Stream', 'Message'; then calls getApiClient()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V4Message MessageService.send(V4Stream, Message)"})
  void testSendWithV4StreamMessage_thenCallsGetApiClient() {
    // Arrange
    MessagesApi messagesApi = mock(MessagesApi.class);
    when(messagesApi.getApiClient()).thenThrow(new IllegalArgumentException());
    MessageService messageService =
        new MessageService(
            messagesApi,
            mock(MessageApi.class),
            mock(MessageSuppressionApi.class),
            mock(StreamsApi.class),
            mock(PodApi.class),
            mock(AttachmentsApi.class),
            mock(DefaultApi.class),
            mock(TemplateEngine.class),
            mock(RetryWithRecoveryBuilder.class));
    V4Stream stream = mock(V4Stream.class);
    when(stream.getStreamId()).thenReturn("42");

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> messageService.send(stream, mock(Message.class)));
    verify(messagesApi).getApiClient();
    verify(stream).getStreamId();
  }

  /**
   * Test {@link MessageService#send(V4Stream, String)} with {@code V4Stream}, {@code String}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MessageService#send(V4Stream, String)}
   */
  @Test
  @DisplayName(
      "Test send(V4Stream, String) with 'V4Stream', 'String'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V4Message MessageService.send(V4Stream, String)"})
  void testSendWithV4StreamString_thenThrowIllegalArgumentException() {
    // Arrange
    MessagesApi messagesApi = mock(MessagesApi.class);
    when(messagesApi.getApiClient()).thenThrow(new IllegalArgumentException());
    MessageService messageService =
        new MessageService(
            messagesApi,
            mock(MessageApi.class),
            mock(MessageSuppressionApi.class),
            mock(StreamsApi.class),
            mock(PodApi.class),
            mock(AttachmentsApi.class),
            mock(DefaultApi.class),
            mock(TemplateEngine.class),
            mock(RetryWithRecoveryBuilder.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> messageService.send(new V4Stream(), "Not all who wander are lost"));
    verify(messagesApi).getApiClient();
  }

  /**
   * Test {@link MessageService#getAttachmentTypes()}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MessageService#getAttachmentTypes()}
   */
  @Test
  @DisplayName("Test getAttachmentTypes(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List MessageService.getAttachmentTypes()"})
  void testGetAttachmentTypes_thenThrowIllegalArgumentException() {
    // Arrange
    PodApi podApi = mock(PodApi.class);
    when(podApi.getApiClient()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new MessageService(
                    mock(MessagesApi.class),
                    mock(MessageApi.class),
                    mock(MessageSuppressionApi.class),
                    mock(StreamsApi.class),
                    podApi,
                    mock(AttachmentsApi.class),
                    mock(DefaultApi.class),
                    mock(TemplateEngine.class),
                    mock(RetryWithRecoveryBuilder.class))
                .getAttachmentTypes());
    verify(podApi).getApiClient();
  }

  /**
   * Test {@link MessageService#update(V4Message, Message)} with {@code messageToUpdate}, {@code
   * content}.
   *
   * <p>Method under test: {@link MessageService#update(V4Message, Message)}
   */
  @Test
  @DisplayName("Test update(V4Message, Message) with 'messageToUpdate', 'content'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V4Message MessageService.update(V4Message, Message)"})
  void testUpdateWithMessageToUpdateContent() {
    // Arrange
    MessageService messageService =
        new MessageService(
            mock(MessagesApi.class),
            mock(MessageApi.class),
            mock(MessageSuppressionApi.class),
            mock(StreamsApi.class),
            mock(PodApi.class),
            mock(AttachmentsApi.class),
            mock(DefaultApi.class),
            mock(TemplateEngine.class),
            mock(RetryWithRecoveryBuilder.class));
    V4Message messageToUpdate = mock(V4Message.class);
    when(messageToUpdate.getStream()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> messageService.update(messageToUpdate, mock(Message.class)));
    verify(messageToUpdate).getStream();
  }

  /**
   * Test {@link MessageService#update(V4Message, Message)} with {@code messageToUpdate}, {@code
   * content}.
   *
   * <p>Method under test: {@link MessageService#update(V4Message, Message)}
   */
  @Test
  @DisplayName("Test update(V4Message, Message) with 'messageToUpdate', 'content'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V4Message MessageService.update(V4Message, Message)"})
  void testUpdateWithMessageToUpdateContent2() {
    // Arrange
    MessageService messageService =
        new MessageService(
            mock(MessagesApi.class),
            mock(MessageApi.class),
            mock(MessageSuppressionApi.class),
            mock(StreamsApi.class),
            mock(PodApi.class),
            mock(AttachmentsApi.class),
            mock(DefaultApi.class),
            mock(TemplateEngine.class),
            mock(RetryWithRecoveryBuilder.class));
    V4Message messageToUpdate = mock(V4Message.class);
    when(messageToUpdate.getMessageId()).thenThrow(new IllegalArgumentException());
    when(messageToUpdate.getStream()).thenReturn(new V4Stream());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> messageService.update(messageToUpdate, mock(Message.class)));
    verify(messageToUpdate).getMessageId();
    verify(messageToUpdate).getStream();
  }

  /**
   * Test {@link MessageService#update(V4Message, Message)} with {@code messageToUpdate}, {@code
   * content}.
   *
   * <ul>
   *   <li>Then calls {@link MessagesApi#getApiClient()}.
   * </ul>
   *
   * <p>Method under test: {@link MessageService#update(V4Message, Message)}
   */
  @Test
  @DisplayName(
      "Test update(V4Message, Message) with 'messageToUpdate', 'content'; then calls getApiClient()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V4Message MessageService.update(V4Message, Message)"})
  void testUpdateWithMessageToUpdateContent_thenCallsGetApiClient() {
    // Arrange
    MessagesApi messagesApi = mock(MessagesApi.class);
    when(messagesApi.getApiClient()).thenThrow(new IllegalArgumentException());
    MessageService messageService =
        new MessageService(
            messagesApi,
            mock(MessageApi.class),
            mock(MessageSuppressionApi.class),
            mock(StreamsApi.class),
            mock(PodApi.class),
            mock(AttachmentsApi.class),
            mock(DefaultApi.class),
            mock(TemplateEngine.class),
            mock(RetryWithRecoveryBuilder.class));
    V4Message messageToUpdate = mock(V4Message.class);
    when(messageToUpdate.getMessageId()).thenReturn("42");
    when(messageToUpdate.getStream()).thenReturn(new V4Stream());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> messageService.update(messageToUpdate, mock(Message.class)));
    verify(messagesApi).getApiClient();
    verify(messageToUpdate).getMessageId();
    verify(messageToUpdate).getStream();
  }

  /**
   * Test {@link MessageService#update(String, String, Message)} with {@code streamId}, {@code
   * messageId}, {@code content}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MessageService#update(String, String, Message)}
   */
  @Test
  @DisplayName(
      "Test update(String, String, Message) with 'streamId', 'messageId', 'content'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V4Message MessageService.update(String, String, Message)"})
  void testUpdateWithStreamIdMessageIdContent_thenThrowIllegalArgumentException() {
    // Arrange
    MessagesApi messagesApi = mock(MessagesApi.class);
    when(messagesApi.getApiClient()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new MessageService(
                    messagesApi,
                    mock(MessageApi.class),
                    mock(MessageSuppressionApi.class),
                    mock(StreamsApi.class),
                    mock(PodApi.class),
                    mock(AttachmentsApi.class),
                    mock(DefaultApi.class),
                    mock(TemplateEngine.class),
                    mock(RetryWithRecoveryBuilder.class))
                .update("42", "42", mock(Message.class)));
    verify(messagesApi).getApiClient();
  }

  /**
   * Test {@link MessageService#getAttachment(String, String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MessageService#getAttachment(String, String, String)}
   */
  @Test
  @DisplayName("Test getAttachment(String, String, String); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] MessageService.getAttachment(String, String, String)"})
  void testGetAttachment_thenThrowIllegalArgumentException() {
    // Arrange
    AttachmentsApi attachmentsApi = mock(AttachmentsApi.class);
    when(attachmentsApi.getApiClient()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new MessageService(
                    mock(MessagesApi.class),
                    mock(MessageApi.class),
                    mock(MessageSuppressionApi.class),
                    mock(StreamsApi.class),
                    mock(PodApi.class),
                    attachmentsApi,
                    mock(DefaultApi.class),
                    mock(TemplateEngine.class),
                    mock(RetryWithRecoveryBuilder.class))
                .getAttachment("42", "42", "42"));
    verify(attachmentsApi).getApiClient();
  }

  /**
   * Test {@link MessageService#importMessages(List)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MessageService#importMessages(List)}
   */
  @Test
  @DisplayName("Test importMessages(List); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List MessageService.importMessages(List)"})
  void testImportMessages_thenThrowIllegalArgumentException() {
    // Arrange
    MessagesApi messagesApi = mock(MessagesApi.class);
    when(messagesApi.getApiClient()).thenThrow(new IllegalArgumentException());
    MessageService messageService =
        new MessageService(
            messagesApi,
            mock(MessageApi.class),
            mock(MessageSuppressionApi.class),
            mock(StreamsApi.class),
            mock(PodApi.class),
            mock(AttachmentsApi.class),
            mock(DefaultApi.class),
            mock(TemplateEngine.class),
            mock(RetryWithRecoveryBuilder.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> messageService.importMessages(new ArrayList<>()));
    verify(messagesApi).getApiClient();
  }

  /**
   * Test {@link MessageService#suppressMessage(String)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MessageService#suppressMessage(String)}
   */
  @Test
  @DisplayName("Test suppressMessage(String); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.MessageSuppressionResponse MessageService.suppressMessage(String)"
  })
  void testSuppressMessage_thenThrowIllegalArgumentException() {
    // Arrange
    MessageSuppressionApi messageSuppressionApi = mock(MessageSuppressionApi.class);
    when(messageSuppressionApi.getApiClient()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new MessageService(
                    mock(MessagesApi.class),
                    mock(MessageApi.class),
                    messageSuppressionApi,
                    mock(StreamsApi.class),
                    mock(PodApi.class),
                    mock(AttachmentsApi.class),
                    mock(DefaultApi.class),
                    mock(TemplateEngine.class),
                    mock(RetryWithRecoveryBuilder.class))
                .suppressMessage("42"));
    verify(messageSuppressionApi).getApiClient();
  }

  /**
   * Test {@link MessageService#getMessageStatus(String)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MessageService#getMessageStatus(String)}
   */
  @Test
  @DisplayName("Test getMessageStatus(String); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.MessageStatus MessageService.getMessageStatus(String)"
  })
  void testGetMessageStatus_thenThrowIllegalArgumentException() {
    // Arrange
    MessageApi messageApi = mock(MessageApi.class);
    when(messageApi.getApiClient()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new MessageService(
                    mock(MessagesApi.class),
                    messageApi,
                    mock(MessageSuppressionApi.class),
                    mock(StreamsApi.class),
                    mock(PodApi.class),
                    mock(AttachmentsApi.class),
                    mock(DefaultApi.class),
                    mock(TemplateEngine.class),
                    mock(RetryWithRecoveryBuilder.class))
                .getMessageStatus("42"));
    verify(messageApi).getApiClient();
  }

  /**
   * Test {@link MessageService#getMessage(String)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MessageService#getMessage(String)}
   */
  @Test
  @DisplayName("Test getMessage(String); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V4Message MessageService.getMessage(String)"})
  void testGetMessage_thenThrowIllegalArgumentException() {
    // Arrange
    MessagesApi messagesApi = mock(MessagesApi.class);
    when(messagesApi.getApiClient()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new MessageService(
                    messagesApi,
                    mock(MessageApi.class),
                    mock(MessageSuppressionApi.class),
                    mock(StreamsApi.class),
                    mock(PodApi.class),
                    mock(AttachmentsApi.class),
                    mock(DefaultApi.class),
                    mock(TemplateEngine.class),
                    mock(RetryWithRecoveryBuilder.class))
                .getMessage("42"));
    verify(messagesApi).getApiClient();
  }

  /**
   * Test {@link MessageService#listAttachments(String, Instant, Instant, Integer, AttachmentSort)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MessageService#listAttachments(String, Instant, Instant, Integer,
   * AttachmentSort)}
   */
  @Test
  @DisplayName(
      "Test listAttachments(String, Instant, Instant, Integer, AttachmentSort); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "List MessageService.listAttachments(String, Instant, Instant, Integer, AttachmentSort)"
  })
  void testListAttachments_thenThrowIllegalArgumentException() {
    // Arrange
    StreamsApi streamsApi = mock(StreamsApi.class);
    when(streamsApi.getApiClient()).thenThrow(new IllegalArgumentException());
    MessageService messageService =
        new MessageService(
            mock(MessagesApi.class),
            mock(MessageApi.class),
            mock(MessageSuppressionApi.class),
            streamsApi,
            mock(PodApi.class),
            mock(AttachmentsApi.class),
            mock(DefaultApi.class),
            mock(TemplateEngine.class),
            mock(RetryWithRecoveryBuilder.class));
    Instant since = LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            messageService.listAttachments(
                "42",
                since,
                LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant(),
                1,
                AttachmentSort.ASC));
    verify(streamsApi).getApiClient();
  }

  /**
   * Test {@link MessageService#listMessageReceipts(String)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MessageService#listMessageReceipts(String)}
   */
  @Test
  @DisplayName("Test listMessageReceipts(String); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.MessageReceiptDetailResponse MessageService.listMessageReceipts(String)"
  })
  void testListMessageReceipts_thenThrowIllegalArgumentException() {
    // Arrange
    DefaultApi defaultApi = mock(DefaultApi.class);
    when(defaultApi.getApiClient()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new MessageService(
                    mock(MessagesApi.class),
                    mock(MessageApi.class),
                    mock(MessageSuppressionApi.class),
                    mock(StreamsApi.class),
                    mock(PodApi.class),
                    mock(AttachmentsApi.class),
                    defaultApi,
                    mock(TemplateEngine.class),
                    mock(RetryWithRecoveryBuilder.class))
                .listMessageReceipts("42"));
    verify(defaultApi).getApiClient();
  }

  /**
   * Test {@link MessageService#getMessageRelationships(String)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MessageService#getMessageRelationships(String)}
   */
  @Test
  @DisplayName("Test getMessageRelationships(String); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.MessageMetadataResponse MessageService.getMessageRelationships(String)"
  })
  void testGetMessageRelationships_thenThrowIllegalArgumentException() {
    // Arrange
    DefaultApi defaultApi = mock(DefaultApi.class);
    when(defaultApi.getApiClient()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new MessageService(
                    mock(MessagesApi.class),
                    mock(MessageApi.class),
                    mock(MessageSuppressionApi.class),
                    mock(StreamsApi.class),
                    mock(PodApi.class),
                    mock(AttachmentsApi.class),
                    defaultApi,
                    mock(TemplateEngine.class),
                    mock(RetryWithRecoveryBuilder.class))
                .getMessageRelationships("42"));
    verify(defaultApi).getApiClient();
  }
}
