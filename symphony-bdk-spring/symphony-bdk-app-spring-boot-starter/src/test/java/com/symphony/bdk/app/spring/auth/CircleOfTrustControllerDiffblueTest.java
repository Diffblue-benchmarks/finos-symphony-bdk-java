package com.symphony.bdk.app.spring.auth;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.symphony.bdk.app.spring.SymphonyBdkAppProperties;
import com.symphony.bdk.app.spring.auth.model.AppToken;
import com.symphony.bdk.app.spring.auth.model.JwtInfo;
import com.symphony.bdk.app.spring.auth.model.TokenPair;
import com.symphony.bdk.app.spring.auth.model.UserId;
import com.symphony.bdk.app.spring.auth.service.CircleOfTrustService;
import com.symphony.bdk.app.spring.exception.GlobalControllerExceptionHandler;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.aot.DisabledInAotMode;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.StatusResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(
    classes = {
      CircleOfTrustController.class,
      SymphonyBdkAppProperties.class,
      GlobalControllerExceptionHandler.class
    })
@DisabledInAotMode
@ExtendWith(SpringExtension.class)
class CircleOfTrustControllerDiffblueTest {
  @Autowired private CircleOfTrustController circleOfTrustController;

  @MockBean private CircleOfTrustService circleOfTrustService;

  @Autowired private GlobalControllerExceptionHandler globalControllerExceptionHandler;

  @Autowired private SymphonyBdkAppProperties symphonyBdkAppProperties;

  /**
   * Test {@link CircleOfTrustController#authenticate()}.
   *
   * <p>Method under test: {@link CircleOfTrustController#authenticate()}
   */
  @Test
  @DisplayName("Test authenticate()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AppToken CircleOfTrustController.authenticate()"})
  void testAuthenticate() throws Exception {
    // Arrange
    when(circleOfTrustService.authenticate()).thenReturn(new AppToken("ABC123"));

    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/bdk/v1/app/auth");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(circleOfTrustController)
        .setControllerAdvice(globalControllerExceptionHandler)
        .build()
        .perform(requestBuilder)
        .andExpect(status().isOk())
        .andExpect(content().contentType("application/json"))
        .andExpect(content().string("{\"appToken\":\"ABC123\"}"));
  }

  /**
   * Test {@link CircleOfTrustController#validateTokens(TokenPair)}.
   *
   * <p>Method under test: {@link CircleOfTrustController#validateTokens(TokenPair)}
   */
  @Test
  @DisplayName("Test validateTokens(TokenPair)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CircleOfTrustController.validateTokens(TokenPair)"})
  void testValidateTokens() throws Exception {
    // Arrange
    doNothing().when(circleOfTrustService).validateTokens(Mockito.<TokenPair>any());

    MockHttpServletRequestBuilder contentTypeResult =
        MockMvcRequestBuilders.post("/bdk/v1/app/tokens").contentType(MediaType.APPLICATION_JSON);

    JsonMapper jsonMapper = JsonMapper.builder().findAndAddModules().build();
    String content = jsonMapper.writeValueAsString(new TokenPair("ABC123", "ABC123"));

    MockHttpServletRequestBuilder requestBuilder = contentTypeResult.content(content);

    // Act and Assert
    MockMvcBuilders.standaloneSetup(circleOfTrustController)
        .setControllerAdvice(globalControllerExceptionHandler)
        .build()
        .perform(requestBuilder)
        .andExpect(status().isNoContent());
  }

  /**
   * Test {@link CircleOfTrustController#validateJwt(JwtInfo, HttpServletRequest,
   * HttpServletResponse)}.
   *
   * <ul>
   *   <li>Then status {@link StatusResultMatchers#isOk()}.
   * </ul>
   *
   * <p>Method under test: {@link CircleOfTrustController#validateJwt(JwtInfo, HttpServletRequest,
   * HttpServletResponse)}
   */
  @Test
  @DisplayName(
      "Test validateJwt(JwtInfo, HttpServletRequest, HttpServletResponse); then status isOk()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UserId CircleOfTrustController.validateJwt(JwtInfo, HttpServletRequest, HttpServletResponse)"
  })
  void testValidateJwt_thenStatusIsOk() throws Exception {
    // Arrange
    when(circleOfTrustService.validateJwt(Mockito.<String>any())).thenReturn(new UserId(1L));

    MockHttpServletRequestBuilder contentTypeResult =
        MockMvcRequestBuilders.post("/bdk/v1/app/jwt").contentType(MediaType.APPLICATION_JSON);

    JsonMapper jsonMapper = JsonMapper.builder().findAndAddModules().build();
    String content = jsonMapper.writeValueAsString(new JwtInfo("Jwt"));

    MockHttpServletRequestBuilder requestBuilder = contentTypeResult.content(content);

    // Act and Assert
    MockMvcBuilders.standaloneSetup(circleOfTrustController)
        .setControllerAdvice(globalControllerExceptionHandler)
        .build()
        .perform(requestBuilder)
        .andExpect(status().isOk())
        .andExpect(content().contentType("application/json"))
        .andExpect(content().string("{\"userId\":1}"));
  }
}
