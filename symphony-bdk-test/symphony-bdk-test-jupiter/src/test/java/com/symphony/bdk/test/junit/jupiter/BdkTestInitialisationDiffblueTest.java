package com.symphony.bdk.test.junit.jupiter;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.test.SymphonyBdkTestMock;
import java.lang.reflect.AnnotatedElement;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;

class BdkTestInitialisationDiffblueTest {
  /**
   * Test {@link BdkTestInitialisation#beforeAll(ExtensionContext)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link ExtensionContext} {@link ExtensionContext#getElement()} return empty.
   * </ul>
   *
   * <p>Method under test: {@link BdkTestInitialisation#beforeAll(ExtensionContext)}
   */
  @Test
  @DisplayName(
      "Test beforeAll(ExtensionContext); given empty; when ExtensionContext getElement() return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BdkTestInitialisation.beforeAll(ExtensionContext)"})
  void testBeforeAll_givenEmpty_whenExtensionContextGetElementReturnEmpty() throws Exception {
    // Arrange
    BdkTestInitialisation bdkTestInitialisation =
        new BdkTestInitialisation(new SymphonyBdkTestMock());
    ExtensionContext context = mock(ExtensionContext.class);
    Optional<AnnotatedElement> emptyResult = Optional.empty();
    when(context.getElement()).thenReturn(emptyResult);

    // Act and Assert
    assertThrows(RuntimeException.class, () -> bdkTestInitialisation.beforeAll(context));
    verify(context).getElement();
  }

  /**
   * Test {@link BdkTestInitialisation#beforeAll(ExtensionContext)}.
   *
   * <ul>
   *   <li>Given {@link RuntimeException#RuntimeException()}.
   * </ul>
   *
   * <p>Method under test: {@link BdkTestInitialisation#beforeAll(ExtensionContext)}
   */
  @Test
  @DisplayName("Test beforeAll(ExtensionContext); given RuntimeException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BdkTestInitialisation.beforeAll(ExtensionContext)"})
  void testBeforeAll_givenRuntimeException() throws Exception {
    // Arrange
    BdkTestInitialisation bdkTestInitialisation =
        new BdkTestInitialisation(new SymphonyBdkTestMock());
    ExtensionContext context = mock(ExtensionContext.class);
    when(context.getElement()).thenThrow(new RuntimeException());

    // Act and Assert
    assertThrows(RuntimeException.class, () -> bdkTestInitialisation.beforeAll(context));
    verify(context).getElement();
  }
}
