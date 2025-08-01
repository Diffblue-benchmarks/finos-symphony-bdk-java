package com.symphony.bdk.examples.app.spring;

import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.app.spring.exception.GlobalControllerExceptionHandler;
import com.symphony.bdk.core.service.stream.StreamService;
import com.symphony.bdk.gen.api.model.StreamFilter;
import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.aot.DisabledInAotMode;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {HelloController.class, GlobalControllerExceptionHandler.class})
@DisabledInAotMode
@ExtendWith(SpringExtension.class)
class HelloControllerDiffblueTest {
  @Autowired private GlobalControllerExceptionHandler globalControllerExceptionHandler;

  @Autowired private HelloController helloController;

  @MockBean private StreamService streamService;

  /**
   * Test {@link HelloController#hello()}.
   *
   * <p>Method under test: {@link HelloController#hello()}
   */
  @Test
  @DisplayName("Test hello()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String HelloController.hello()"})
  void testHello() throws Exception {
    // Arrange
    when(streamService.listStreams(Mockito.<StreamFilter>any())).thenReturn(new ArrayList<>());
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/hello");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(helloController)
        .setControllerAdvice(globalControllerExceptionHandler)
        .build()
        .perform(requestBuilder)
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
        .andExpect(MockMvcResultMatchers.content().string("0 streams found."));
  }
}
