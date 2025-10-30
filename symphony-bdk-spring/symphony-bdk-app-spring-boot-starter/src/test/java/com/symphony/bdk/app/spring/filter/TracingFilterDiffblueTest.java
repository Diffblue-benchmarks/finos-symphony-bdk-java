package com.symphony.bdk.app.spring.filter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import com.diffblue.cover.annotations.MethodsUnderTest;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.util.Collection;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

class TracingFilterDiffblueTest {
  /**
   * Test {@link TracingFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   * <ul>
   *   <li>Given {@link IOException#IOException(String)} with {@code X-Trace-Id}.</li>
   *   <li>Then throw {@link IOException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TracingFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}
   */
  @Test
  @DisplayName("Test doFilter(ServletRequest, ServletResponse, FilterChain); given IOException(String) with 'X-Trace-Id'; then throw IOException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void TracingFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"})
  void testDoFilter_givenIOExceptionWithXTraceId_thenThrowIOException() throws ServletException, IOException {
    // Arrange
    TracingFilter tracingFilter = new TracingFilter();
    MockHttpServletRequest servletRequest = new MockHttpServletRequest();
    MockHttpServletResponse servletResponse = new MockHttpServletResponse();
    FilterChain filterChain = mock(FilterChain.class);
    doThrow(new IOException("X-Trace-Id")).when(filterChain)
        .doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act and Assert
    assertThrows(IOException.class, () -> tracingFilter.doFilter(servletRequest, servletResponse, filterChain));
    verify(filterChain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
  }

  /**
   * Test {@link TracingFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   * <ul>
   *   <li>Given {@code X-Trace-Id}.</li>
   *   <li>When {@link MockHttpServletRequest#MockHttpServletRequest()} addHeader {@code X-Trace-Id} and {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TracingFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}
   */
  @Test
  @DisplayName("Test doFilter(ServletRequest, ServletResponse, FilterChain); given 'X-Trace-Id'; when MockHttpServletRequest() addHeader 'X-Trace-Id' and 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void TracingFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"})
  void testDoFilter_givenXTraceId_whenMockHttpServletRequestAddHeaderXTraceIdAndValue()
      throws ServletException, IOException {
    // Arrange
    TracingFilter tracingFilter = new TracingFilter();

    MockHttpServletRequest servletRequest = new MockHttpServletRequest();
    servletRequest.addHeader("X-Trace-Id", "Value");
    MockHttpServletResponse servletResponse = new MockHttpServletResponse();
    FilterChain filterChain = mock(FilterChain.class);
    doNothing().when(filterChain).doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act
    tracingFilter.doFilter(servletRequest, servletResponse, filterChain);

    // Assert
    verify(filterChain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
    Collection<String> headerNames = servletResponse.getHeaderNames();
    assertEquals(1, headerNames.size());
    assertTrue(headerNames instanceof Set);
    assertTrue(headerNames.contains("X-Trace-Id"));
  }

  /**
   * Test {@link TracingFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   * <ul>
   *   <li>Then {@link MockHttpServletResponse} (default constructor) HeaderNames size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link TracingFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}
   */
  @Test
  @DisplayName("Test doFilter(ServletRequest, ServletResponse, FilterChain); then MockHttpServletResponse (default constructor) HeaderNames size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void TracingFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"})
  void testDoFilter_thenMockHttpServletResponseHeaderNamesSizeIsOne() throws ServletException, IOException {
    // Arrange
    TracingFilter tracingFilter = new TracingFilter();
    MockHttpServletRequest servletRequest = new MockHttpServletRequest();
    MockHttpServletResponse servletResponse = new MockHttpServletResponse();
    FilterChain filterChain = mock(FilterChain.class);
    doNothing().when(filterChain).doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act
    tracingFilter.doFilter(servletRequest, servletResponse, filterChain);

    // Assert
    verify(filterChain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
    Collection<String> headerNames = servletResponse.getHeaderNames();
    assertEquals(1, headerNames.size());
    assertTrue(headerNames instanceof Set);
    assertTrue(headerNames.contains("X-Trace-Id"));
  }
}
