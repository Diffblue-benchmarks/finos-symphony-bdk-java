package com.symphony.bdk.app.spring.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

class BdkAppErrorCodeDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BdkAppErrorCode#getMessage()}
   *   <li>{@link BdkAppErrorCode#getStatus()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String BdkAppErrorCode.getMessage()", "HttpStatus BdkAppErrorCode.getStatus()"})
  void testGettersAndSetters() {
    // Arrange
    BdkAppErrorCode valueOfResult = BdkAppErrorCode.valueOf("AUTH_FAILURE");

    // Act
    String actualMessage = valueOfResult.getMessage();

    // Assert
    assertEquals("Failed to authenticate the extension app with appId={}", actualMessage);
    assertEquals(HttpStatus.UNAUTHORIZED, valueOfResult.getStatus());
  }
}
