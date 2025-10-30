package com.symphony.bdk.http.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ApiClientBodyPartDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ApiClientBodyPart#ApiClientBodyPart(InputStream, String)}
   *   <li>{@link ApiClientBodyPart#getContent()}
   *   <li>{@link ApiClientBodyPart#getFilename()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ApiClientBodyPart.<init>(InputStream, String)", "InputStream ApiClientBodyPart.getContent()",
      "String ApiClientBodyPart.getFilename()"})
  void testGettersAndSetters() throws IOException {
    // Arrange
    ByteArrayInputStream content = new ByteArrayInputStream("AXAXAXAX".getBytes("UTF-8"));

    // Act
    ApiClientBodyPart actualApiClientBodyPart = new ApiClientBodyPart(content, "https://example.org/example");
    InputStream actualContent = actualApiClientBodyPart.getContent();

    // Assert
    assertEquals("https://example.org/example", actualApiClientBodyPart.getFilename());
    assertEquals(8, actualContent.read(new byte[8]));
    assertSame(content, actualContent);
  }
}
