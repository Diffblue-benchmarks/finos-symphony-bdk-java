package com.symphony.bdk.app.spring.auth;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.fasterxml.jackson.databind.ObjectMapper;
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
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.result.StatusResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {CircleOfTrustController.class, SymphonyBdkAppProperties.class,
    GlobalControllerExceptionHandler.class})
@ExtendWith(SpringExtension.class)
@DisabledInAotMode
class CircleOfTrustControllerDiffblueTest {
  @Autowired
  private CircleOfTrustController circleOfTrustController;

  @MockBean
  private CircleOfTrustService circleOfTrustService;

  @Autowired
  private GlobalControllerExceptionHandler globalControllerExceptionHandler;

  @Autowired
  private SymphonyBdkAppProperties symphonyBdkAppProperties;

  /**
   * Test {@link CircleOfTrustController#authenticate()}.
   * <p>
   * Method under test: {@link CircleOfTrustController#authenticate()}
   */
  @Test
  @DisplayName("Test authenticate()")
  @Tag("MaintainedByDiffblue")
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
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
        .andExpect(MockMvcResultMatchers.content().string("{\"appToken\":\"ABC123\"}"));
  }

  /**
   * Test {@link CircleOfTrustController#validateTokens(TokenPair)}.
   * <p>
   * Method under test: {@link CircleOfTrustController#validateTokens(TokenPair)}
   */
  @Test
  @DisplayName("Test validateTokens(TokenPair)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CircleOfTrustController.validateTokens(TokenPair)"})
  void testValidateTokens() throws Exception {
    // Arrange
    doNothing().when(circleOfTrustService).validateTokens(Mockito.<TokenPair>any());
    MockHttpServletRequestBuilder contentTypeResult = MockMvcRequestBuilders.post("/bdk/v1/app/tokens")
        .contentType(MediaType.APPLICATION_JSON);

    ObjectMapper objectMapper = new ObjectMapper();
    MockHttpServletRequestBuilder requestBuilder = contentTypeResult
        .content(objectMapper.writeValueAsString(new TokenPair("ABC123", "ABC123")));

    // Act and Assert
    MockMvcBuilders.standaloneSetup(circleOfTrustController)
        .setControllerAdvice(globalControllerExceptionHandler)
        .build()
        .perform(requestBuilder)
        .andExpect(MockMvcResultMatchers.status().isNoContent());
  }

  /**
   * Test {@link CircleOfTrustController#validateJwt(JwtInfo, HttpServletRequest, HttpServletResponse)}.
   * <ul>
   *   <li>Then status four hundred.</li>
   * </ul>
   * <p>
   * Method under test: {@link CircleOfTrustController#validateJwt(JwtInfo, HttpServletRequest, HttpServletResponse)}
   */
  @Test
  @DisplayName("Test validateJwt(JwtInfo, HttpServletRequest, HttpServletResponse); then status four hundred")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"UserId CircleOfTrustController.validateJwt(JwtInfo, HttpServletRequest, HttpServletResponse)"})
  void testValidateJwt_thenStatusFourHundred() throws Exception {
    // Arrange
    when(circleOfTrustService.validateJwt(Mockito.<String>any())).thenReturn(new UserId(1L));
    MockHttpServletRequestBuilder contentTypeResult = MockMvcRequestBuilders.post("/bdk/v1/app/jwt")
        .contentType(MediaType.APPLICATION_JSON);

    ObjectMapper objectMapper = new ObjectMapper();
    MockHttpServletRequestBuilder requestBuilder = contentTypeResult
        .content(objectMapper.writeValueAsString(new JwtInfo("")));

    // Act and Assert
    MockMvcBuilders.standaloneSetup(circleOfTrustController)
        .setControllerAdvice(globalControllerExceptionHandler)
        .build()
        .perform(requestBuilder)
        .andExpect(MockMvcResultMatchers.status().is(400))
        .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
        .andExpect(
            MockMvcResultMatchers.content().string("{\"code\":\"MISSING_FIELDS\",\"message\":[\"Jwt is mandatory\"]}"));
  }

  /**
   * Test {@link CircleOfTrustController#validateJwt(JwtInfo, HttpServletRequest, HttpServletResponse)}.
   * <ul>
   *   <li>Then status {@link StatusResultMatchers#isOk()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CircleOfTrustController#validateJwt(JwtInfo, HttpServletRequest, HttpServletResponse)}
   */
  @Test
  @DisplayName("Test validateJwt(JwtInfo, HttpServletRequest, HttpServletResponse); then status isOk()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"UserId CircleOfTrustController.validateJwt(JwtInfo, HttpServletRequest, HttpServletResponse)"})
  void testValidateJwt_thenStatusIsOk() throws Exception {
    // Arrange
    when(circleOfTrustService.validateJwt(Mockito.<String>any())).thenReturn(new UserId(1L));
    MockHttpServletRequestBuilder contentTypeResult = MockMvcRequestBuilders.post("/bdk/v1/app/jwt")
        .contentType(MediaType.APPLICATION_JSON);

    ObjectMapper objectMapper = new ObjectMapper();
    MockHttpServletRequestBuilder requestBuilder = contentTypeResult
        .content(objectMapper.writeValueAsString(new JwtInfo("Jwt")));

    // Act and Assert
    MockMvcBuilders.standaloneSetup(circleOfTrustController)
        .setControllerAdvice(globalControllerExceptionHandler)
        .build()
        .perform(requestBuilder)
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
        .andExpect(MockMvcResultMatchers.content().string("{\"userId\":1}"));
  }
}
