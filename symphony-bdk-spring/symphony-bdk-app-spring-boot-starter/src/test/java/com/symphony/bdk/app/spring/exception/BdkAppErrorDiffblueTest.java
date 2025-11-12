package com.symphony.bdk.app.spring.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkAppErrorDiffblueTest {
  /**
   * Test {@link BdkAppError#fromException(BdkAppException)}.
   *
   * <p>Method under test: {@link BdkAppError#fromException(BdkAppException)}
   */
  @Test
  @DisplayName("Test fromException(BdkAppException)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkAppError BdkAppError.fromException(BdkAppException)"})
  void testFromException() {
    // Arrange and Act
    BdkAppError actualFromExceptionResult =
        BdkAppError.fromException(
            new BdkAppException(BdkAppErrorCode.AUTH_FAILURE, "An error occurred"));

    // Assert
    List<String> message = actualFromExceptionResult.getMessage();
    assertEquals(1, message.size());
    assertEquals(
        "Failed to authenticate the extension app with appId=An error occurred", message.get(0));
    assertEquals(BdkAppErrorCode.AUTH_FAILURE, actualFromExceptionResult.getCode());
  }

  /**
   * Test {@link BdkAppError#fromException(BdkAppException)}.
   *
   * <p>Method under test: {@link BdkAppError#fromException(BdkAppException)}
   */
  @Test
  @DisplayName("Test fromException(BdkAppException)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkAppError BdkAppError.fromException(BdkAppException)"})
  void testFromException2() {
    // Arrange and Act
    BdkAppError actualFromExceptionResult =
        BdkAppError.fromException(
            new BdkAppException(BdkAppErrorCode.AUTH_FAILURE, "Error Message Params"));

    // Assert
    List<String> message = actualFromExceptionResult.getMessage();
    assertEquals(1, message.size());
    assertEquals(
        "Failed to authenticate the extension app with appId=Error Message Params", message.get(0));
    assertEquals(BdkAppErrorCode.AUTH_FAILURE, actualFromExceptionResult.getCode());
  }

  /**
   * Test {@link BdkAppError#fromException(BdkAppException)}.
   *
   * <p>Method under test: {@link BdkAppError#fromException(BdkAppException)}
   */
  @Test
  @DisplayName("Test fromException(BdkAppException)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkAppError BdkAppError.fromException(BdkAppException)"})
  void testFromException3() {
    // Arrange and Act
    BdkAppError actualFromExceptionResult =
        BdkAppError.fromException(new BdkAppException(BdkAppErrorCode.AUTH_FAILURE, "42"));

    // Assert
    List<String> message = actualFromExceptionResult.getMessage();
    assertEquals(1, message.size());
    assertEquals("Failed to authenticate the extension app with appId=42", message.get(0));
    assertEquals(BdkAppErrorCode.AUTH_FAILURE, actualFromExceptionResult.getCode());
  }

  /**
   * Test {@link BdkAppError#fromException(BdkAppException)}.
   *
   * <p>Method under test: {@link BdkAppError#fromException(BdkAppException)}
   */
  @Test
  @DisplayName("Test fromException(BdkAppException)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkAppError BdkAppError.fromException(BdkAppException)"})
  void testFromException4() {
    // Arrange and Act
    BdkAppError actualFromExceptionResult =
        BdkAppError.fromException(new BdkAppException(BdkAppErrorCode.AUTH_FAILURE, ""));

    // Assert
    List<String> message = actualFromExceptionResult.getMessage();
    assertEquals(1, message.size());
    assertEquals("Failed to authenticate the extension app with appId=", message.get(0));
    assertEquals(BdkAppErrorCode.AUTH_FAILURE, actualFromExceptionResult.getCode());
  }

  /**
   * Test {@link BdkAppError#fromException(BdkAppException)}.
   *
   * <ul>
   *   <li>Then return Message first is {@code Failed to validate the app token}.
   * </ul>
   *
   * <p>Method under test: {@link BdkAppError#fromException(BdkAppException)}
   */
  @Test
  @DisplayName(
      "Test fromException(BdkAppException); then return Message first is 'Failed to validate the app token'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkAppError BdkAppError.fromException(BdkAppException)"})
  void testFromException_thenReturnMessageFirstIsFailedToValidateTheAppToken() {
    // Arrange and Act
    BdkAppError actualFromExceptionResult =
        BdkAppError.fromException(
            new BdkAppException(BdkAppErrorCode.INVALID_TOKEN, "An error occurred"));

    // Assert
    List<String> message = actualFromExceptionResult.getMessage();
    assertEquals(1, message.size());
    assertEquals("Failed to validate the app token", message.get(0));
    assertEquals(BdkAppErrorCode.INVALID_TOKEN, actualFromExceptionResult.getCode());
  }

  /**
   * Test new {@link BdkAppError} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link BdkAppError}
   */
  @Test
  @DisplayName("Test new BdkAppError (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BdkAppError.<init>()"})
  void testNewBdkAppError() {
    // Arrange and Act
    BdkAppError actualBdkAppError = new BdkAppError();

    // Assert
    assertNull(actualBdkAppError.getCode());
    assertNull(actualBdkAppError.getMessage());
  }
}
