package com.symphony.bdk.app.spring.config;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.app.spring.SymphonyBdkAppProperties;
import com.symphony.bdk.app.spring.filter.TracingFilter;
import com.symphony.bdk.app.spring.properties.AppAuthProperties;
import com.symphony.bdk.app.spring.properties.JwtCookieProperties;
import com.symphony.bdk.app.spring.properties.TracingProperties;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;

class BdkExtAppTracingFilterConfigDiffblueTest {
  /**
   * Test {@link BdkExtAppTracingFilterConfig#tracingFilter(SymphonyBdkAppProperties)}.
   *
   * <p>Method under test: {@link
   * BdkExtAppTracingFilterConfig#tracingFilter(SymphonyBdkAppProperties)}
   */
  @Test
  @DisplayName("Test tracingFilter(SymphonyBdkAppProperties)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FilterRegistrationBean BdkExtAppTracingFilterConfig.tracingFilter(SymphonyBdkAppProperties)"
  })
  void testTracingFilter() {
    // Arrange
    BdkExtAppTracingFilterConfig bdkExtAppTracingFilterConfig = new BdkExtAppTracingFilterConfig();

    JwtCookieProperties jwtCookie = new JwtCookieProperties();
    jwtCookie.setEnabled(true);
    jwtCookie.setMaxAge(Duration.ofSeconds(1L));
    jwtCookie.setSameSite("Same Site");

    AppAuthProperties auth = new AppAuthProperties();
    auth.setEnabled(true);
    auth.setJwtCookie(jwtCookie);

    TracingProperties tracing = new TracingProperties();
    tracing.setEnabled(true);
    tracing.setUrlPatterns(new ArrayList<>());

    SymphonyBdkAppProperties properties = new SymphonyBdkAppProperties();
    properties.setAuth(auth);
    properties.setCors(new HashMap<>());
    properties.setTracing(tracing);

    // Act
    FilterRegistrationBean<TracingFilter> actualTracingFilterResult =
        bdkExtAppTracingFilterConfig.tracingFilter(properties);

    // Assert
    Collection<String> servletNames = actualTracingFilterResult.getServletNames();
    assertTrue(servletNames instanceof Set);
    Collection<ServletRegistrationBean<?>> servletRegistrationBeans =
        actualTracingFilterResult.getServletRegistrationBeans();
    assertTrue(servletRegistrationBeans instanceof Set);
    assertEquals("tracingFilter", actualTracingFilterResult.getFilterName());
    assertFalse(actualTracingFilterResult.isMatchAfter());
    assertTrue(servletNames.isEmpty());
    assertTrue(servletRegistrationBeans.isEmpty());
    assertTrue(actualTracingFilterResult.getInitParameters().isEmpty());
    assertTrue(actualTracingFilterResult.isAsyncSupported());
    assertTrue(actualTracingFilterResult.isEnabled());
    assertEquals(Integer.MIN_VALUE, actualTracingFilterResult.getOrder());
    assertEquals(servletNames, actualTracingFilterResult.getUrlPatterns());
  }
}
