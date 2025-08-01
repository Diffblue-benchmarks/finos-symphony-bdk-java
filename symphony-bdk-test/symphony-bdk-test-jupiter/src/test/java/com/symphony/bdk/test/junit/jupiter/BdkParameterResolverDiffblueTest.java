package com.symphony.bdk.test.junit.jupiter;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.test.SymphonyBdkTestMock;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;

class BdkParameterResolverDiffblueTest {
  /**
   * Test {@link BdkParameterResolver#supportsParameter(ParameterContext, ExtensionContext)}.
   *
   * <ul>
   *   <li>Then throw {@link ParameterResolutionException}.
   * </ul>
   *
   * <p>Method under test: {@link BdkParameterResolver#supportsParameter(ParameterContext,
   * ExtensionContext)}
   */
  @Test
  @DisplayName(
      "Test supportsParameter(ParameterContext, ExtensionContext); then throw ParameterResolutionException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean BdkParameterResolver.supportsParameter(ParameterContext, ExtensionContext)"
  })
  void testSupportsParameter_thenThrowParameterResolutionException()
      throws ParameterResolutionException {
    // Arrange
    BdkParameterResolver bdkParameterResolver = new BdkParameterResolver(new SymphonyBdkTestMock());
    ParameterContext parameterContext = mock(ParameterContext.class);
    when(parameterContext.getParameter())
        .thenThrow(new ParameterResolutionException("An error occurred"));

    // Act and Assert
    assertThrows(
        ParameterResolutionException.class,
        () ->
            bdkParameterResolver.supportsParameter(parameterContext, mock(ExtensionContext.class)));
    verify(parameterContext).getParameter();
  }
}
