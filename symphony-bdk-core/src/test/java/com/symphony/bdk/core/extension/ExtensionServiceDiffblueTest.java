package com.symphony.bdk.core.extension;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.AuthSession;
import com.symphony.bdk.core.client.ApiClientFactory;
import com.symphony.bdk.core.config.model.BdkConfig;
import com.symphony.bdk.core.extension.exception.BdkExtensionException;
import com.symphony.bdk.core.retry.RetryWithRecoveryBuilder;
import com.symphony.bdk.extension.BdkExtension;
import com.symphony.bdk.extension.BdkExtensionService;
import com.symphony.bdk.extension.BdkExtensionServiceProvider;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ExtensionServiceDiffblueTest {
  /**
   * Test {@link ExtensionService#register(Class)} with {@code extClz}.
   *
   * <ul>
   *   <li>Then throw {@link BdkExtensionException}.
   * </ul>
   *
   * <p>Method under test: {@link ExtensionService#register(Class)}
   */
  @Test
  @DisplayName("Test register(Class) with 'extClz'; then throw BdkExtensionException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ExtensionService.register(Class)"})
  void testRegisterWithExtClz_thenThrowBdkExtensionException() {
    // Arrange
    ExtensionService extensionService =
        new ExtensionService(
            mock(ApiClientFactory.class),
            mock(AuthSession.class),
            mock(RetryWithRecoveryBuilder.class),
            mock(BdkConfig.class));
    Class<BdkExtension> extClz = BdkExtension.class;

    // Act and Assert
    assertThrows(BdkExtensionException.class, () -> extensionService.register(extClz));
  }

  /**
   * Test {@link ExtensionService#register(BdkExtension)} with {@code extension}.
   *
   * <ul>
   *   <li>Then throw {@link BdkExtensionException}.
   * </ul>
   *
   * <p>Method under test: {@link ExtensionService#register(BdkExtension)}
   */
  @Test
  @DisplayName("Test register(BdkExtension) with 'extension'; then throw BdkExtensionException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ExtensionService.register(BdkExtension)"})
  void testRegisterWithExtension_thenThrowBdkExtensionException() {
    // Arrange
    ExtensionService extensionService =
        new ExtensionService(
            mock(ApiClientFactory.class),
            mock(AuthSession.class),
            mock(RetryWithRecoveryBuilder.class),
            mock(BdkConfig.class));

    TestExtensionAuthenticationAware extension = mock(TestExtensionAuthenticationAware.class);
    BdkExtensionException bdkExtensionException =
        new BdkExtensionException("An error occurred", new Throwable());
    doThrow(bdkExtensionException).when(extension).setAuthSession(Mockito.<AuthSession>any());

    // Act and Assert
    assertThrows(BdkExtensionException.class, () -> extensionService.register(extension));
    verify(extension).setAuthSession(isA(AuthSession.class));
  }

  /**
   * Test {@link ExtensionService#service(Class)}.
   *
   * <p>Method under test: {@link ExtensionService#service(Class)}
   */
  @Test
  @DisplayName("Test service(Class)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkExtensionService ExtensionService.service(Class)"})
  void testService() {
    // Arrange
    ExtensionService extensionService =
        new ExtensionService(
            mock(ApiClientFactory.class),
            mock(AuthSession.class),
            mock(RetryWithRecoveryBuilder.class),
            mock(BdkConfig.class));
    Class<BdkExtensionServiceProvider> forNameResult = BdkExtensionServiceProvider.class;

    // Act and Assert
    assertThrows(
        IllegalStateException.class,
        () ->
            extensionService.service(
                (Class<BdkExtensionServiceProvider<BdkExtensionService>>) (Class) forNameResult));
  }
}
