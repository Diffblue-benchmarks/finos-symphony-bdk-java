package com.symphony.bdk.app.spring.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;

@ContextConfiguration(classes = {GlobalControllerExceptionHandler.class})
@ExtendWith(SpringExtension.class)
class GlobalControllerExceptionHandlerDiffblueTest {
  @Autowired private GlobalControllerExceptionHandler globalControllerExceptionHandler;

  /**
   * Test {@link GlobalControllerExceptionHandler#handleBdkAppException(BdkAppException,
   * WebRequest)}.
   *
   * <p>Method under test: {@link
   * GlobalControllerExceptionHandler#handleBdkAppException(BdkAppException, WebRequest)}
   */
  @Test
  @DisplayName("Test handleBdkAppException(BdkAppException, WebRequest)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ResponseEntity GlobalControllerExceptionHandler.handleBdkAppException(BdkAppException, WebRequest)"
  })
  void testHandleBdkAppException() {
    // Arrange
    BdkAppException e = new BdkAppException(BdkAppErrorCode.AUTH_FAILURE, "An error occurred");

    // Act
    ResponseEntity<Object> actualHandleBdkAppExceptionResult =
        globalControllerExceptionHandler.handleBdkAppException(
            e, new ServletWebRequest(new MockHttpServletRequest()));

    // Assert
    Object body = actualHandleBdkAppExceptionResult.getBody();
    assertTrue(body instanceof BdkAppError);
    HttpStatusCode statusCode = actualHandleBdkAppExceptionResult.getStatusCode();
    assertTrue(statusCode instanceof HttpStatus);
    List<String> message = ((BdkAppError) body).getMessage();
    assertEquals(1, message.size());
    assertEquals(
        "Failed to authenticate the extension app with appId=An error occurred", message.get(0));
    assertEquals(401, actualHandleBdkAppExceptionResult.getStatusCodeValue());
    assertEquals(BdkAppErrorCode.AUTH_FAILURE, ((BdkAppError) body).getCode());
    assertEquals(HttpStatus.UNAUTHORIZED, statusCode);
    assertTrue(actualHandleBdkAppExceptionResult.hasBody());
    assertTrue(actualHandleBdkAppExceptionResult.getHeaders().isEmpty());
  }

  /**
   * Test {@link GlobalControllerExceptionHandler#handleBdkAppException(BdkAppException,
   * WebRequest)}.
   *
   * <p>Method under test: {@link
   * GlobalControllerExceptionHandler#handleBdkAppException(BdkAppException, WebRequest)}
   */
  @Test
  @DisplayName("Test handleBdkAppException(BdkAppException, WebRequest)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ResponseEntity GlobalControllerExceptionHandler.handleBdkAppException(BdkAppException, WebRequest)"
  })
  void testHandleBdkAppException2() {
    // Arrange
    BdkAppException e = new BdkAppException(BdkAppErrorCode.INVALID_TOKEN, "An error occurred");

    // Act
    ResponseEntity<Object> actualHandleBdkAppExceptionResult =
        globalControllerExceptionHandler.handleBdkAppException(
            e, new ServletWebRequest(new MockHttpServletRequest()));

    // Assert
    Object body = actualHandleBdkAppExceptionResult.getBody();
    assertTrue(body instanceof BdkAppError);
    HttpStatusCode statusCode = actualHandleBdkAppExceptionResult.getStatusCode();
    assertTrue(statusCode instanceof HttpStatus);
    List<String> message = ((BdkAppError) body).getMessage();
    assertEquals(1, message.size());
    assertEquals("Failed to validate the app token", message.get(0));
    assertEquals(401, actualHandleBdkAppExceptionResult.getStatusCodeValue());
    assertEquals(BdkAppErrorCode.INVALID_TOKEN, ((BdkAppError) body).getCode());
    assertEquals(HttpStatus.UNAUTHORIZED, statusCode);
    assertTrue(actualHandleBdkAppExceptionResult.hasBody());
    assertTrue(actualHandleBdkAppExceptionResult.getHeaders().isEmpty());
  }

  /**
   * Test {@link GlobalControllerExceptionHandler#handleBdkAppException(BdkAppException,
   * WebRequest)}.
   *
   * <ul>
   *   <li>Then throw {@link BdkAppException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * GlobalControllerExceptionHandler#handleBdkAppException(BdkAppException, WebRequest)}
   */
  @Test
  @DisplayName(
      "Test handleBdkAppException(BdkAppException, WebRequest); then throw BdkAppException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ResponseEntity GlobalControllerExceptionHandler.handleBdkAppException(BdkAppException, WebRequest)"
  })
  void testHandleBdkAppException_thenThrowBdkAppException() {
    // Arrange
    BdkAppException e = mock(BdkAppException.class);
    when(e.getParams())
        .thenThrow(new BdkAppException(BdkAppErrorCode.AUTH_FAILURE, "An error occurred"));
    when(e.getErrorCode()).thenReturn(BdkAppErrorCode.AUTH_FAILURE);

    // Act and Assert
    assertThrows(
        BdkAppException.class,
        () ->
            globalControllerExceptionHandler.handleBdkAppException(
                e, new ServletWebRequest(new MockHttpServletRequest())));
    verify(e, atLeast(1)).getErrorCode();
    verify(e).getParams();
  }

  /**
   * Test {@link
   * GlobalControllerExceptionHandler#handleMethodArgumentNotValid(MethodArgumentNotValidException,
   * HttpHeaders, HttpStatusCode, WebRequest)}.
   *
   * <ul>
   *   <li>Then Body return {@link BdkAppError}.
   * </ul>
   *
   * <p>Method under test: {@link
   * GlobalControllerExceptionHandler#handleMethodArgumentNotValid(MethodArgumentNotValidException,
   * HttpHeaders, HttpStatusCode, WebRequest)}
   */
  @Test
  @DisplayName(
      "Test handleMethodArgumentNotValid(MethodArgumentNotValidException, HttpHeaders, HttpStatusCode, WebRequest); then Body return BdkAppError")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ResponseEntity GlobalControllerExceptionHandler.handleMethodArgumentNotValid(MethodArgumentNotValidException, HttpHeaders, HttpStatusCode, WebRequest)"
  })
  void testHandleMethodArgumentNotValid_thenBodyReturnBdkAppError() {
    // Arrange
    MethodArgumentNotValidException ex =
        new MethodArgumentNotValidException(null, new BindException("Target", "Object Name"));
    HttpHeaders headers = new HttpHeaders();

    // Act
    ResponseEntity<Object> actualHandleMethodArgumentNotValidResult =
        globalControllerExceptionHandler.handleMethodArgumentNotValid(
            ex, headers, HttpStatus.OK, new ServletWebRequest(new MockHttpServletRequest()));

    // Assert
    Object body = actualHandleMethodArgumentNotValidResult.getBody();
    assertTrue(body instanceof BdkAppError);
    HttpStatusCode statusCode = actualHandleMethodArgumentNotValidResult.getStatusCode();
    assertTrue(statusCode instanceof HttpStatus);
    assertEquals(400, actualHandleMethodArgumentNotValidResult.getStatusCodeValue());
    assertEquals(BdkAppErrorCode.MISSING_FIELDS, ((BdkAppError) body).getCode());
    assertEquals(HttpStatus.BAD_REQUEST, statusCode);
    assertTrue(((BdkAppError) body).getMessage().isEmpty());
    assertTrue(actualHandleMethodArgumentNotValidResult.hasBody());
    assertEquals(headers, actualHandleMethodArgumentNotValidResult.getHeaders());
  }
}
