package com.symphony.bdk.examples.spring.api;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.json.JsonMapper.Builder;
import com.symphony.bdk.examples.spring.api.ApiExceptionHandler.ErrorMessage;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.api.ApiRuntimeException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ApiExceptionHandlerDiffblueTest {
  /**
   * Test {@link ApiExceptionHandler#resourceNotFoundException(ApiRuntimeException)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then calls {@link ApiRuntimeException#getCode()}.
   * </ul>
   *
   * <p>Method under test: {@link
   * ApiExceptionHandler#resourceNotFoundException(ApiRuntimeException)}
   */
  @Test
  @DisplayName(
      "Test resourceNotFoundException(ApiRuntimeException); given 'java.lang.Object'; then calls getCode()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "org.springframework.http.ResponseEntity ApiExceptionHandler.resourceNotFoundException(ApiRuntimeException)"
  })
  void testResourceNotFoundException_givenJavaLangObject_thenCallsGetCode()
      throws JsonProcessingException {
    // Arrange
    Builder builderResult = JsonMapper.builder();
    Class<Object> target = Object.class;
    Class<Object> mixinSource = Object.class;

    builderResult.addMixIn(target, mixinSource);
    JsonMapper objectMapper = builderResult.findAndAddModules().build();
    ApiExceptionHandler apiExceptionHandler = new ApiExceptionHandler(objectMapper);

    ErrorMessage errorMessage = new ErrorMessage();
    errorMessage.setCode("Code");
    errorMessage.setMessage("An error occurred");
    String writeValueAsStringResult =
        JsonMapper.builder().findAndAddModules().build().writeValueAsString(errorMessage);

    ApiRuntimeException ex = mock(ApiRuntimeException.class);
    when(ex.getCode())
        .thenThrow(new ApiRuntimeException(new ApiException(1, "https://example.org/example")));
    when(ex.getResponseBody()).thenReturn(writeValueAsStringResult);

    // Act and Assert
    assertThrows(
        ApiRuntimeException.class, () -> apiExceptionHandler.resourceNotFoundException(ex));
    verify(ex).getCode();
    verify(ex).getResponseBody();
  }
}
