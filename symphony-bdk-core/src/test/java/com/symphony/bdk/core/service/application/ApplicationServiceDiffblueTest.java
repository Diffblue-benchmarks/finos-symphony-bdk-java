package com.symphony.bdk.core.service.application;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.impl.AuthSessionImpl;
import com.symphony.bdk.core.auth.impl.BotAuthenticatorCertImpl;
import com.symphony.bdk.core.config.model.BdkCommonJwtConfig;
import com.symphony.bdk.core.config.model.BdkRetryConfig;
import com.symphony.bdk.core.retry.RetryWithRecoveryBuilder;
import com.symphony.bdk.core.service.version.AgentVersionService;
import com.symphony.bdk.gen.api.AppEntitlementApi;
import com.symphony.bdk.gen.api.ApplicationApi;
import com.symphony.bdk.gen.api.model.PodAppEntitlement;
import com.symphony.bdk.http.api.ApiClient;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import jakarta.ws.rs.client.Client;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ApplicationServiceDiffblueTest {
  /**
   * Test {@link ApplicationService#listApplicationEntitlements()}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ApplicationService#listApplicationEntitlements()}
   */
  @Test
  @DisplayName(
      "Test listApplicationEntitlements(); given Predicate test(Object) return 'true'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApplicationService.listApplicationEntitlements()"})
  void testListApplicationEntitlements_givenPredicateTestReturnTrue_thenReturnNull() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class), "/relay", defaultHeaders, "https://example.org/example");
    ApplicationApi applicationApi = new ApplicationApi(apiClient);

    Predicate<ApiException> ignoreException = mock(Predicate.class);
    when(ignoreException.test(Mockito.<ApiException>any())).thenReturn(true);

    RetryWithRecoveryBuilder<?> retryBuilder = new RetryWithRecoveryBuilder<>();
    retryBuilder.ignoreException(ignoreException);
    AppEntitlementApi appEntitlementApi = new AppEntitlementApi(null);
    BotAuthenticatorCertImpl authenticator =
        new BotAuthenticatorCertImpl(
            mock(BdkRetryConfig.class),
            "janedoe",
            mock(BdkCommonJwtConfig.class),
            mock(ApiClient.class),
            mock(ApiClient.class),
            mock(ApiClient.class),
            mock(AgentVersionService.class));

    ApplicationService applicationService =
        new ApplicationService(
            applicationApi, appEntitlementApi, new AuthSessionImpl(authenticator), retryBuilder);

    // Act
    List<PodAppEntitlement> actualListApplicationEntitlementsResult =
        applicationService.listApplicationEntitlements();

    // Assert
    verify(ignoreException).test(isA(ApiException.class));
    assertNull(actualListApplicationEntitlementsResult);
  }
}
