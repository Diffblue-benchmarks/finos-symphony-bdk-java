package com.symphony.bdk.examples.app.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.service.stream.StreamService;
import com.symphony.bdk.gen.api.model.StreamFilter;
import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class HelloControllerDiffblueTest {
  /**
   * Test {@link HelloController#hello()}.
   * <ul>
   *   <li>Given {@link StreamService} {@link StreamService#listStreams(StreamFilter)} return {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code 0 streams found.}.</li>
   * </ul>
   * <p>
   * Method under test: {@link HelloController#hello()}
   */
  @Test
  @DisplayName("Test hello(); given StreamService listStreams(StreamFilter) return ArrayList(); then return '0 streams found.'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String HelloController.hello()"})
  void testHello_givenStreamServiceListStreamsReturnArrayList_thenReturn0StreamsFound() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange
    StreamService streamService = mock(StreamService.class);
    when(streamService.listStreams(Mockito.<StreamFilter>any())).thenReturn(new ArrayList<>());

    // Act
    String actualHelloResult = (new HelloController(streamService)).hello();

    // Assert
    verify(streamService).listStreams(isA(StreamFilter.class));
    assertEquals("0 streams found.", actualHelloResult);
  }
}
