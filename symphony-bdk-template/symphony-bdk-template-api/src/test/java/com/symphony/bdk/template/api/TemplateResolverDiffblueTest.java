package com.symphony.bdk.template.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class TemplateResolverDiffblueTest {
  /**
   * Test {@link TemplateResolver#resolve(String)}.
   *
   * <ul>
   *   <li>Then return process {@code Parameters} is {@code Process}.
   * </ul>
   *
   * <p>Method under test: {@link TemplateResolver#resolve(String)}
   */
  @Test
  @DisplayName("Test resolve(String); then return process 'Parameters' is 'Process'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Template TemplateResolver.resolve(String)"})
  void testResolve_thenReturnProcessParametersIsProcess() {
    // Arrange
    Template template = mock(Template.class);
    when(template.process(Mockito.<Object>any())).thenReturn("Process");
    TemplateEngine templateEngine = mock(TemplateEngine.class);
    when(templateEngine.newTemplateFromClasspath(Mockito.<String>any())).thenReturn(template);

    // Act
    String actualProcessResult =
        new TemplateResolver(templateEngine).resolve("Template").process("Parameters");

    // Assert
    verify(template).process(isA(Object.class));
    verify(templateEngine).newTemplateFromClasspath("Template");
    assertEquals("Process", actualProcessResult);
  }
}
