package com.symphony.bdk.core.service.message.model;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.service.message.exception.MessageCreationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AttachmentDiffblueTest {
  /**
   * Test {@link Attachment#Attachment(InputStream, String)}.
   * <ul>
   *   <li>When {@code \.}.</li>
   *   <li>Then throw {@link MessageCreationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Attachment#Attachment(InputStream, String)}
   */
  @Test
  @DisplayName("Test new Attachment(InputStream, String); when '\\.'; then throw MessageCreationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void Attachment.<init>(InputStream, String)"})
  void testNewAttachment_whenBackslashDot_thenThrowMessageCreationException() throws UnsupportedEncodingException {
    // Arrange, Act and Assert
    assertThrows(MessageCreationException.class,
        () -> new Attachment(new ByteArrayInputStream("AXAXAXAX".getBytes("UTF-8")), "\\."));

  }

  /**
   * Test {@link Attachment#Attachment(InputStream, String)}.
   * <ul>
   *   <li>When {@code foo.txt}.</li>
   *   <li>Then return Filename is {@code foo.txt}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Attachment#Attachment(InputStream, String)}
   */
  @Test
  @DisplayName("Test new Attachment(InputStream, String); when 'foo.txt'; then return Filename is 'foo.txt'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void Attachment.<init>(InputStream, String)"})
  void testNewAttachment_whenFooTxt_thenReturnFilenameIsFooTxt() throws IOException {
    // Arrange
    ByteArrayInputStream content = new ByteArrayInputStream("AXAXAXAX".getBytes("UTF-8"));

    // Act
    Attachment actualAttachment = new Attachment(content, "foo.txt");

    // Assert
    byte[] byteArray = new byte[8];
    int actualReadResult = actualAttachment.getContent().read(byteArray);
    assertEquals("foo.txt", actualAttachment.getFilename());
    assertEquals(-1, content.read(new byte[]{}));
    assertEquals(8, actualReadResult);
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), byteArray);
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Attachment#getContent()}
   *   <li>{@link Attachment#getFilename()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"InputStream Attachment.getContent()", "String Attachment.getFilename()"})
  void testGettersAndSetters() throws IOException {
    // Arrange
    ByteArrayInputStream content = new ByteArrayInputStream("AXAXAXAX".getBytes("UTF-8"));
    Attachment attachment = new Attachment(content, "foo.txt");

    // Act
    InputStream actualContent = attachment.getContent();

    // Assert
    assertEquals("foo.txt", attachment.getFilename());
    assertEquals(8, actualContent.read(new byte[8]));
    assertSame(content, actualContent);
  }
}
