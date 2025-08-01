package com.symphony.bdk.examples.spring.api;

import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.symphony.bdk.ext.group.SymphonyGroupService;
import com.symphony.bdk.ext.group.gen.api.model.GroupList;
import com.symphony.bdk.ext.group.gen.api.model.SortOrder;
import com.symphony.bdk.ext.group.gen.api.model.Status;
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

@ContextConfiguration(classes = {GroupApi.class, ApiExceptionHandler.class, ObjectMapper.class})
@DisabledInAotMode
@ExtendWith(SpringExtension.class)
class GroupApiDiffblueTest {
  @Autowired private ApiExceptionHandler apiExceptionHandler;

  @Autowired private GroupApi groupApi;

  @MockBean private SymphonyGroupService symphonyGroupService;

  /**
   * Test {@link GroupApi#getGroups()}.
   *
   * <p>Method under test: {@link GroupApi#getGroups()}
   */
  @Test
  @DisplayName("Test getGroups()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"GroupList GroupApi.getGroups()"})
  void testGetGroups() throws Exception {
    // Arrange
    when(symphonyGroupService.listGroups(
            Mockito.<Status>any(),
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<Integer>any(),
            Mockito.<SortOrder>any()))
        .thenReturn(new GroupList());
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/v1/groups");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(groupApi)
        .setControllerAdvice(apiExceptionHandler)
        .build()
        .perform(requestBuilder)
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
        .andExpect(MockMvcResultMatchers.content().string("{\"pagination\":null,\"data\":null}"));
  }
}
