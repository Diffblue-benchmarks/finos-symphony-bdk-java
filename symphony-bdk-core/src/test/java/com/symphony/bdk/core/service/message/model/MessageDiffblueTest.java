package com.symphony.bdk.core.service.message.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.node.MissingNode;
import com.github.fge.jackson.jsonpointer.JsonPointer;
import com.github.fge.jackson.jsonpointer.TreePointer;
import com.github.fge.jsonpatch.AddOperation;
import com.github.fge.jsonpatch.TestOperation;
import com.github.fge.jsonpatch.mergepatch.JsonMergePatch;
import com.symphony.bdk.core.auth.jwt.UserClaim;
import com.symphony.bdk.core.config.model.BdkLoadBalancingMode;
import com.symphony.bdk.core.service.message.exception.MessageCreationException;
import com.symphony.bdk.core.service.message.model.Message.MessageBuilder;
import com.symphony.bdk.gen.api.model.AckId;
import com.symphony.bdk.gen.api.model.AdminStreamAttributes;
import com.symphony.bdk.gen.api.model.AdminStreamFilter;
import com.symphony.bdk.gen.api.model.AttachmentInfo;
import com.symphony.bdk.gen.api.model.BaseMessage;
import com.symphony.bdk.template.api.Template;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {MessageBuilder.class})
@ExtendWith(SpringExtension.class)
class MessageDiffblueTest {
  @Autowired
  private MessageBuilder messageBuilder;

  /**
   * Test {@link Message#builder()}.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Message#builder()}
   *   <li>{@link Message#attachments(List)}
   *   <li>{@link Message#content(String)}
   *   <li>{@link Message#silent(Boolean)}
   *   <li>{@link Message#version(String)}
   *   <li>{@link Message#version()}
   *   <li>{@link Message#data()}
   *   <li>{@link Message#content()}
   *   <li>{@link Message#silent()}
   *   <li>{@link Message#attachments()}
   *   <li>{@link Message#previews()}
   * </ul>
   */
  @Test
  @DisplayName("Test builder()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List MessageBuilder.attachments()", "MessageBuilder MessageBuilder.attachments(List)",
      "Message MessageBuilder.build()", "String MessageBuilder.content()",
      "MessageBuilder MessageBuilder.content(String)", "String MessageBuilder.data()", "List MessageBuilder.previews()",
      "Boolean MessageBuilder.silent()", "MessageBuilder MessageBuilder.silent(Boolean)",
      "String MessageBuilder.version()", "MessageBuilder MessageBuilder.version(String)"})
  void testBuilder() {
    // Arrange and Act
    MessageBuilder actualBuilderResult = Message.builder();
    ArrayList<Attachment> attachments = new ArrayList<>();
    MessageBuilder actualAttachmentsResult = actualBuilderResult.attachments(attachments);
    MessageBuilder actualContentResult = actualAttachmentsResult.content("Not all who wander are lost");
    MessageBuilder actualDataResult = actualContentResult.data(null);
    MessageBuilder actualSilentResult = actualDataResult.silent(true);
    MessageBuilder actualTemplateResult = actualSilentResult.template(mock(Template.class), "Parameters");
    MessageBuilder actualVersionResult = actualTemplateResult.version("1.0.2");

    // Assert
    assertEquals("1.0.2", actualAttachmentsResult.version());
    assertEquals("1.0.2", actualContentResult.version());
    assertEquals("1.0.2", actualDataResult.version());
    assertEquals("1.0.2", actualSilentResult.version());
    assertEquals("1.0.2", actualTemplateResult.version());
    assertEquals("1.0.2", actualBuilderResult.version());
    assertEquals("null", actualAttachmentsResult.data());
    assertEquals("null", actualContentResult.data());
    assertEquals("null", actualDataResult.data());
    assertEquals("null", actualSilentResult.data());
    assertEquals("null", actualTemplateResult.data());
    assertEquals("null", actualBuilderResult.data());
    assertNull(actualAttachmentsResult.content());
    assertNull(actualContentResult.content());
    assertNull(actualDataResult.content());
    assertNull(actualSilentResult.content());
    assertNull(actualTemplateResult.content());
    assertNull(actualBuilderResult.content());
    assertTrue(actualAttachmentsResult.silent());
    assertTrue(actualContentResult.silent());
    assertTrue(actualDataResult.silent());
    assertTrue(actualSilentResult.silent());
    assertTrue(actualTemplateResult.silent());
    assertTrue(actualBuilderResult.silent());
    List<Attachment> attachmentsResult = actualBuilderResult.attachments();
    assertTrue(attachmentsResult.isEmpty());
    List<Attachment> previewsResult = actualBuilderResult.previews();
    assertTrue(previewsResult.isEmpty());
    assertSame(attachments, actualAttachmentsResult.attachments());
    assertSame(attachments, actualContentResult.attachments());
    assertSame(attachments, actualDataResult.attachments());
    assertSame(attachments, actualSilentResult.attachments());
    assertSame(attachments, actualTemplateResult.attachments());
    assertSame(attachments, attachmentsResult);
    assertSame(previewsResult, actualAttachmentsResult.previews());
    assertSame(previewsResult, actualContentResult.previews());
    assertSame(previewsResult, actualDataResult.previews());
    assertSame(previewsResult, actualSilentResult.previews());
    assertSame(previewsResult, actualTemplateResult.previews());
    assertSame(actualTemplateResult, actualVersionResult);
  }

  /**
   * Test MessageBuilder {@link MessageBuilder#addAttachment(InputStream, InputStream, String)} with {@code attachment}, {@code preview}, {@code filename}.
   * <ul>
   *   <li>Then return builder.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageBuilder#addAttachment(InputStream, InputStream, String)}
   */
  @Test
  @DisplayName("Test MessageBuilder addAttachment(InputStream, InputStream, String) with 'attachment', 'preview', 'filename'; then return builder")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"MessageBuilder MessageBuilder.addAttachment(InputStream, InputStream, String)"})
  void testMessageBuilderAddAttachmentWithAttachmentPreviewFilename_thenReturnBuilder()
      throws UnsupportedEncodingException {
    // Arrange
    MessageBuilder builderResult = Message.builder();
    ByteArrayInputStream attachment = new ByteArrayInputStream("AXAXAXAX".getBytes("UTF-8"));

    // Act and Assert
    assertSame(builderResult,
        builderResult.addAttachment(attachment, new ByteArrayInputStream("AXAXAXAX".getBytes("UTF-8")), "foo.txt"));
  }

  /**
   * Test MessageBuilder {@link MessageBuilder#addAttachment(InputStream, String)} with {@code content}, {@code filename}.
   * <ul>
   *   <li>When {@code foo.txt}.</li>
   *   <li>Then return builder.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageBuilder#addAttachment(InputStream, String)}
   */
  @Test
  @DisplayName("Test MessageBuilder addAttachment(InputStream, String) with 'content', 'filename'; when 'foo.txt'; then return builder")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"MessageBuilder MessageBuilder.addAttachment(InputStream, String)"})
  void testMessageBuilderAddAttachmentWithContentFilename_whenFooTxt_thenReturnBuilder()
      throws UnsupportedEncodingException {
    // Arrange
    MessageBuilder builderResult = Message.builder();

    // Act and Assert
    assertSame(builderResult,
        builderResult.addAttachment(new ByteArrayInputStream("AXAXAXAX".getBytes("UTF-8")), "foo.txt"));
  }

  /**
   * Test MessageBuilder {@link MessageBuilder#data(Object)} with {@code Object}.
   * <p>
   * Method under test: {@link MessageBuilder#data(Object)}
   */
  @Test
  @DisplayName("Test MessageBuilder data(Object) with 'Object'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"MessageBuilder MessageBuilder.data(Object)"})
  void testMessageBuilderDataWithObject() {
    // Arrange
    MessageBuilder builderResult = Message.builder();

    // Act
    MessageBuilder actualDataResult = builderResult.data(new BaseMessage());

    // Assert
    assertEquals("{\"id\":null,\"timestamp\":null,\"messageType\":null,\"streamId\":null}", builderResult.data());
    assertSame(builderResult, actualDataResult);
  }

  /**
   * Test MessageBuilder {@link MessageBuilder#data(Object)} with {@code Object}.
   * <p>
   * Method under test: {@link MessageBuilder#data(Object)}
   */
  @Test
  @DisplayName("Test MessageBuilder data(Object) with 'Object'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"MessageBuilder MessageBuilder.data(Object)"})
  void testMessageBuilderDataWithObject2() throws IOException {
    // Arrange
    MessageBuilder builderResult = Message.builder();
    JsonMergePatch jsonMergePatch = mock(JsonMergePatch.class);
    doThrow(new MessageCreationException("An error occurred")).when(jsonMergePatch)
        .serialize(Mockito.<JsonGenerator>any(), Mockito.<SerializerProvider>any());

    // Act and Assert
    assertThrows(MessageCreationException.class, () -> builderResult.data(jsonMergePatch));
    verify(jsonMergePatch).serialize(isA(JsonGenerator.class), isA(SerializerProvider.class));
  }

  /**
   * Test MessageBuilder {@link MessageBuilder#data(Object)} with {@code Object}.
   * <ul>
   *   <li>Given {@code https://example.org/example}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageBuilder#data(Object)}
   */
  @Test
  @DisplayName("Test MessageBuilder data(Object) with 'Object'; given 'https://example.org/example'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"MessageBuilder MessageBuilder.data(Object)"})
  void testMessageBuilderDataWithObject_givenHttpsExampleOrgExample() {
    // Arrange
    MessageBuilder builderResult = Message.builder();

    UserClaim userClaim = new UserClaim();
    userClaim.setAvatarSmallUrl("https://example.org/example");
    userClaim.setAvatarUrl("https://example.org/example");
    userClaim.setCompany("Company");
    userClaim.setCompanyId("42");
    userClaim.setDisplayName("Display Name");
    userClaim.setEmailAddress("42 Main St");
    userClaim.setFirstName("Jane");
    userClaim.setId(1L);
    userClaim.setLastName("Doe");
    userClaim.setLocation("Location");
    userClaim.setTitle("Dr");
    userClaim.setUsername("janedoe");

    // Act
    MessageBuilder actualDataResult = builderResult.data(userClaim);

    // Assert
    assertEquals(
        "{\"id\":1,\"emailAddress\":\"42 Main St\",\"username\":\"janedoe\",\"firstName\":\"Jane\",\"lastName\":\"Doe\",\"displayName"
            + "\":\"Display Name\",\"title\":\"Dr\",\"company\":\"Company\",\"companyId\":\"42\",\"location\":\"Location\",\"avatarUrl\""
            + ":\"https://example.org/example\",\"avatarSmallUrl\":\"https://example.org/example\"}",
        builderResult.data());
    assertSame(builderResult, actualDataResult);
  }

  /**
   * Test MessageBuilder {@link MessageBuilder#data(Object)} with {@code Object}.
   * <ul>
   *   <li>Given {@link JsonProcessingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageBuilder#data(Object)}
   */
  @Test
  @DisplayName("Test MessageBuilder data(Object) with 'Object'; given JsonProcessingException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"MessageBuilder MessageBuilder.data(Object)"})
  void testMessageBuilderDataWithObject_givenJsonProcessingException() throws IOException {
    // Arrange
    MessageBuilder builderResult = Message.builder();
    JsonMergePatch jsonMergePatch = mock(JsonMergePatch.class);
    doThrow(mock(JsonProcessingException.class)).when(jsonMergePatch)
        .serialize(Mockito.<JsonGenerator>any(), Mockito.<SerializerProvider>any());

    // Act and Assert
    assertThrows(MessageCreationException.class, () -> builderResult.data(jsonMergePatch));
    verify(jsonMergePatch).serialize(isA(JsonGenerator.class), isA(SerializerProvider.class));
  }

  /**
   * Test MessageBuilder {@link MessageBuilder#data(Object)} with {@code Object}.
   * <ul>
   *   <li>Then builder data is {@code {"ackId":null,"updatePresence":true}}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageBuilder#data(Object)}
   */
  @Test
  @DisplayName("Test MessageBuilder data(Object) with 'Object'; then builder data is '{\"ackId\":null,\"updatePresence\":true}'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"MessageBuilder MessageBuilder.data(Object)"})
  void testMessageBuilderDataWithObject_thenBuilderDataIsAckIdNullUpdatePresenceTrue() {
    // Arrange
    MessageBuilder builderResult = Message.builder();

    // Act
    MessageBuilder actualDataResult = builderResult.data(new AckId());

    // Assert
    assertEquals("{\"ackId\":null,\"updatePresence\":true}", builderResult.data());
    assertSame(builderResult, actualDataResult);
  }

  /**
   * Test MessageBuilder {@link MessageBuilder#data(Object)} with {@code Object}.
   * <ul>
   *   <li>Then builder data is empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageBuilder#data(Object)}
   */
  @Test
  @DisplayName("Test MessageBuilder data(Object) with 'Object'; then builder data is empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"MessageBuilder MessageBuilder.data(Object)"})
  void testMessageBuilderDataWithObject_thenBuilderDataIsEmptyString() throws IOException {
    // Arrange
    MessageBuilder builderResult = Message.builder();
    JsonMergePatch jsonMergePatch = mock(JsonMergePatch.class);
    doNothing().when(jsonMergePatch).serialize(Mockito.<JsonGenerator>any(), Mockito.<SerializerProvider>any());

    // Act
    MessageBuilder actualDataResult = builderResult.data(jsonMergePatch);

    // Assert
    verify(jsonMergePatch).serialize(isA(JsonGenerator.class), isA(SerializerProvider.class));
    assertEquals("", builderResult.data());
    assertSame(builderResult, actualDataResult);
  }

  /**
   * Test MessageBuilder {@link MessageBuilder#data(Object)} with {@code Object}.
   * <ul>
   *   <li>Then builder data is {@code {"id":null,"name":null,"size":null}}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageBuilder#data(Object)}
   */
  @Test
  @DisplayName("Test MessageBuilder data(Object) with 'Object'; then builder data is '{\"id\":null,\"name\":null,\"size\":null}'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"MessageBuilder MessageBuilder.data(Object)"})
  void testMessageBuilderDataWithObject_thenBuilderDataIsIdNullNameNullSizeNull() {
    // Arrange
    MessageBuilder builderResult = Message.builder();

    // Act
    MessageBuilder actualDataResult = builderResult.data(new AttachmentInfo());

    // Assert
    assertEquals("{\"id\":null,\"name\":null,\"size\":null}", builderResult.data());
    assertSame(builderResult, actualDataResult);
  }

  /**
   * Test MessageBuilder {@link MessageBuilder#data(Object)} with {@code Object}.
   * <ul>
   *   <li>Then builder data is {@code {"op":"add","path":"","value":null}}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageBuilder#data(Object)}
   */
  @Test
  @DisplayName("Test MessageBuilder data(Object) with 'Object'; then builder data is '{\"op\":\"add\",\"path\":\"\",\"value\":null}'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"MessageBuilder MessageBuilder.data(Object)"})
  void testMessageBuilderDataWithObject_thenBuilderDataIsOpAddPathValueNull() {
    // Arrange
    MessageBuilder builderResult = Message.builder();
    JsonPointer path = JsonPointer.empty();

    // Act
    MessageBuilder actualDataResult = builderResult.data(new AddOperation(path, MissingNode.getInstance()));

    // Assert
    assertEquals("{\"op\":\"add\",\"path\":\"\",\"value\":null}", builderResult.data());
    assertSame(builderResult, actualDataResult);
  }

  /**
   * Test MessageBuilder {@link MessageBuilder#data(Object)} with {@code Object}.
   * <ul>
   *   <li>Then builder data is {@code {"op":"test","path":"","value":null}}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageBuilder#data(Object)}
   */
  @Test
  @DisplayName("Test MessageBuilder data(Object) with 'Object'; then builder data is '{\"op\":\"test\",\"path\":\"\",\"value\":null}'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"MessageBuilder MessageBuilder.data(Object)"})
  void testMessageBuilderDataWithObject_thenBuilderDataIsOpTestPathValueNull() {
    // Arrange
    MessageBuilder builderResult = Message.builder();
    JsonPointer path = JsonPointer.empty();

    // Act
    MessageBuilder actualDataResult = builderResult.data(new TestOperation(path, MissingNode.getInstance()));

    // Assert
    assertEquals("{\"op\":\"test\",\"path\":\"\",\"value\":null}", builderResult.data());
    assertSame(builderResult, actualDataResult);
  }

  /**
   * Test MessageBuilder {@link MessageBuilder#data(Object)} with {@code Object}.
   * <ul>
   *   <li>When {@link AdminStreamAttributes} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageBuilder#data(Object)}
   */
  @Test
  @DisplayName("Test MessageBuilder data(Object) with 'Object'; when AdminStreamAttributes (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"MessageBuilder MessageBuilder.data(Object)"})
  void testMessageBuilderDataWithObject_whenAdminStreamAttributes() {
    // Arrange
    MessageBuilder builderResult = Message.builder();

    // Act
    MessageBuilder actualDataResult = builderResult.data(new AdminStreamAttributes());

    // Assert
    assertEquals(
        "{\"roomName\":null,\"roomDescription\":null,\"members\":null,\"createdByUserId\":null,\"createdDate\":null,"
            + "\"lastModifiedDate\":null,\"originCompany\":null,\"originCompanyId\":null,\"membersCount\":null}",
        builderResult.data());
    assertSame(builderResult, actualDataResult);
  }

  /**
   * Test MessageBuilder {@link MessageBuilder#data(Object)} with {@code Object}.
   * <ul>
   *   <li>When {@link AdminStreamFilter} (default constructor).</li>
   *   <li>Then builder data is a string.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageBuilder#data(Object)}
   */
  @Test
  @DisplayName("Test MessageBuilder data(Object) with 'Object'; when AdminStreamFilter (default constructor); then builder data is a string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"MessageBuilder MessageBuilder.data(Object)"})
  void testMessageBuilderDataWithObject_whenAdminStreamFilter_thenBuilderDataIsAString() {
    // Arrange
    MessageBuilder builderResult = Message.builder();

    // Act
    MessageBuilder actualDataResult = builderResult.data(new AdminStreamFilter());

    // Assert
    assertEquals(
        "{\"streamTypes\":null,\"scope\":null,\"origin\":null,\"status\":null,\"privacy\":null,\"startDate\":null,\"endDate"
            + "\":null}",
        builderResult.data());
    assertSame(builderResult, actualDataResult);
  }

  /**
   * Test MessageBuilder {@link MessageBuilder#data(Object)} with {@code Object}.
   * <ul>
   *   <li>When {@code EXTERNAL}.</li>
   *   <li>Then builder data is {@code "external"}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageBuilder#data(Object)}
   */
  @Test
  @DisplayName("Test MessageBuilder data(Object) with 'Object'; when 'EXTERNAL'; then builder data is '\"external\"'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"MessageBuilder MessageBuilder.data(Object)"})
  void testMessageBuilderDataWithObject_whenExternal_thenBuilderDataIsExternal() {
    // Arrange
    MessageBuilder builderResult = Message.builder();

    // Act
    MessageBuilder actualDataResult = builderResult.data(BdkLoadBalancingMode.EXTERNAL);

    // Assert
    assertEquals("\"external\"", builderResult.data());
    assertSame(builderResult, actualDataResult);
  }

  /**
   * Test MessageBuilder {@link MessageBuilder#data(Object)} with {@code Object}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then builder data is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageBuilder#data(Object)}
   */
  @Test
  @DisplayName("Test MessageBuilder data(Object) with 'Object'; when 'null'; then builder data is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"MessageBuilder MessageBuilder.data(Object)"})
  void testMessageBuilderDataWithObject_whenNull_thenBuilderDataIsNull() {
    // Arrange
    MessageBuilder builderResult = Message.builder();

    // Act
    MessageBuilder actualDataResult = builderResult.data(null);

    // Assert
    assertEquals("null", builderResult.data());
    assertSame(builderResult, actualDataResult);
  }

  /**
   * Test MessageBuilder {@link MessageBuilder#data(Object)} with {@code Object}.
   * <ul>
   *   <li>When {@link TreePointer}.</li>
   *   <li>Then return builder.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageBuilder#data(Object)}
   */
  @Test
  @DisplayName("Test MessageBuilder data(Object) with 'Object'; when TreePointer; then return builder")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"MessageBuilder MessageBuilder.data(Object)"})
  void testMessageBuilderDataWithObject_whenTreePointer_thenReturnBuilder() {
    // Arrange
    MessageBuilder builderResult = Message.builder();

    // Act and Assert
    assertSame(builderResult, builderResult.data(mock(TreePointer.class)));
  }

  /**
   * Test MessageBuilder {@link MessageBuilder#template(Template, Object)} with {@code template}, {@code parameters}.
   * <p>
   * Method under test: {@link MessageBuilder#template(Template, Object)}
   */
  @Test
  @DisplayName("Test MessageBuilder template(Template, Object) with 'template', 'parameters'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"MessageBuilder MessageBuilder.template(Template, Object)"})
  void testMessageBuilderTemplateWithTemplateParameters() {
    // Arrange
    MessageBuilder builderResult = Message.builder();
    Template template = mock(Template.class);
    when(template.process(Mockito.<Object>any())).thenThrow(new MessageCreationException("An error occurred"));

    // Act and Assert
    assertThrows(MessageCreationException.class, () -> builderResult.template(template, "Parameters"));
    verify(template).process(isA(Object.class));
  }

  /**
   * Test MessageBuilder {@link MessageBuilder#template(Template, Object)} with {@code template}, {@code parameters}.
   * <ul>
   *   <li>Then builder content is {@code Process}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageBuilder#template(Template, Object)}
   */
  @Test
  @DisplayName("Test MessageBuilder template(Template, Object) with 'template', 'parameters'; then builder content is 'Process'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"MessageBuilder MessageBuilder.template(Template, Object)"})
  void testMessageBuilderTemplateWithTemplateParameters_thenBuilderContentIsProcess() {
    // Arrange
    MessageBuilder builderResult = Message.builder();
    Template template = mock(Template.class);
    when(template.process(Mockito.<Object>any())).thenReturn("Process");

    // Act
    MessageBuilder actualTemplateResult = builderResult.template(template, "Parameters");

    // Assert
    verify(template).process(isA(Object.class));
    assertEquals("Process", builderResult.content());
    assertSame(builderResult, actualTemplateResult);
  }

  /**
   * Test MessageBuilder {@link MessageBuilder#template(Template)} with {@code template}.
   * <ul>
   *   <li>Given {@code Process}.</li>
   *   <li>Then builder content is {@code Process}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageBuilder#template(Template)}
   */
  @Test
  @DisplayName("Test MessageBuilder template(Template) with 'template'; given 'Process'; then builder content is 'Process'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"MessageBuilder MessageBuilder.template(Template)"})
  void testMessageBuilderTemplateWithTemplate_givenProcess_thenBuilderContentIsProcess() {
    // Arrange
    MessageBuilder builderResult = Message.builder();
    Template template = mock(Template.class);
    when(template.process(Mockito.<Object>any())).thenReturn("Process");

    // Act
    MessageBuilder actualTemplateResult = builderResult.template(template);

    // Assert
    verify(template).process(isA(Object.class));
    assertEquals("Process", builderResult.content());
    assertSame(builderResult, actualTemplateResult);
  }

  /**
   * Test MessageBuilder {@link MessageBuilder#template(Template)} with {@code template}.
   * <ul>
   *   <li>Then throw {@link MessageCreationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageBuilder#template(Template)}
   */
  @Test
  @DisplayName("Test MessageBuilder template(Template) with 'template'; then throw MessageCreationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"MessageBuilder MessageBuilder.template(Template)"})
  void testMessageBuilderTemplateWithTemplate_thenThrowMessageCreationException() {
    // Arrange
    MessageBuilder builderResult = Message.builder();
    Template template = mock(Template.class);
    when(template.process(Mockito.<Object>any())).thenThrow(new MessageCreationException("An error occurred"));

    // Act and Assert
    assertThrows(MessageCreationException.class, () -> builderResult.template(template));
    verify(template).process(isA(Object.class));
  }

  /**
   * Test {@link Message#Message(MessageBuilder)}.
   * <ul>
   *   <li>When builder.</li>
   *   <li>Then return Version is {@code 2.0}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Message#Message(MessageBuilder)}
   */
  @Test
  @DisplayName("Test new Message(MessageBuilder); when builder; then return Version is '2.0'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void Message.<init>(MessageBuilder)"})
  void testNewMessage_whenBuilder_thenReturnVersionIs20() {
    // Arrange and Act
    Message actualMessage = new Message(Message.builder());

    // Assert
    assertEquals("2.0", actualMessage.getVersion());
    assertNull(actualMessage.getContent());
    assertNull(actualMessage.getData());
    assertTrue(actualMessage.getSilent());
    assertTrue(actualMessage.getAttachments().isEmpty());
    assertTrue(actualMessage.getPreviews().isEmpty());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Message#getAttachments()}
   *   <li>{@link Message#getContent()}
   *   <li>{@link Message#getData()}
   *   <li>{@link Message#getPreviews()}
   *   <li>{@link Message#getSilent()}
   *   <li>{@link Message#getVersion()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List Message.getAttachments()", "String Message.getContent()", "String Message.getData()",
      "List Message.getPreviews()", "Boolean Message.getSilent()", "String Message.getVersion()"})
  void testGettersAndSetters() {
    // Arrange
    MessageBuilder builderResult = Message.builder();
    ArrayList<Attachment> attachments = new ArrayList<>();
    Message buildResult = builderResult.attachments(attachments)
        .content("Not all who wander are lost")
        .data(null)
        .silent(true)
        .version("1.0.2")
        .build();

    // Act
    List<Attachment> actualAttachments = buildResult.getAttachments();
    String actualContent = buildResult.getContent();
    String actualData = buildResult.getData();
    List<Attachment> actualPreviews = buildResult.getPreviews();
    Boolean actualSilent = buildResult.getSilent();

    // Assert
    assertEquals("1.0.2", buildResult.getVersion());
    assertEquals("<messageML>Not all who wander are lost</messageML>", actualContent);
    assertEquals("null", actualData);
    assertTrue(actualSilent);
    assertTrue(actualAttachments.isEmpty());
    assertTrue(actualPreviews.isEmpty());
    assertSame(attachments, actualAttachments);
  }
}
