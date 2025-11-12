package com.symphony.bdk.core.auth.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.exception.AuthUnauthorizedException;
import com.symphony.bdk.core.config.model.BdkRetryConfig;
import com.symphony.bdk.core.retry.RetryWithRecovery;
import com.symphony.bdk.core.retry.RetryWithRecoveryBuilder;
import com.symphony.bdk.core.retry.function.SupplierWithApiException;
import com.symphony.bdk.core.retry.resilience4j.Resilience4jRetryWithRecovery;
import com.symphony.bdk.core.test.BdkRetryConfigTestHelper;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.api.ApiRuntimeException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AuthenticationRetryDiffblueTest {
  @InjectMocks private AuthenticationRetry<Object> authenticationRetry;

  @Mock private BdkRetryConfig bdkRetryConfig;

  /**
   * Test {@link AuthenticationRetry#getBaseRetryBuilder(BdkRetryConfig)}.
   *
   * <p>Method under test: {@link AuthenticationRetry#getBaseRetryBuilder(BdkRetryConfig)}
   */
  @Test
  @DisplayName("Test getBaseRetryBuilder(BdkRetryConfig)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RetryWithRecoveryBuilder AuthenticationRetry.getBaseRetryBuilder(BdkRetryConfig)"
  })
  void testGetBaseRetryBuilder() {
    // Arrange and Act
    RetryWithRecoveryBuilder<Object> actualBaseRetryBuilder =
        AuthenticationRetry.getBaseRetryBuilder(BdkRetryConfigTestHelper.ofMinimalInterval(3));

    // Assert
    RetryWithRecovery<Object> retryWithRecovery = actualBaseRetryBuilder.build();
    assertTrue(retryWithRecovery instanceof Resilience4jRetryWithRecovery);
  }

  /**
   * Test {@link AuthenticationRetry#canAuthenticationBeRetried(Throwable)}.
   *
   * <p>Method under test: {@link AuthenticationRetry#canAuthenticationBeRetried(Throwable)}
   */
  @Test
  @DisplayName("Test canAuthenticationBeRetried(Throwable)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AuthenticationRetry.canAuthenticationBeRetried(Throwable)"})
  void testCanAuthenticationBeRetried() {
    // Arrange, Act and Assert
    assertTrue(
        AuthenticationRetry.canAuthenticationBeRetried(
            new ApiException(500, "https://example.org/example")));
  }

  /**
   * Test {@link AuthenticationRetry#canAuthenticationBeRetried(Throwable)}.
   *
   * <p>Method under test: {@link AuthenticationRetry#canAuthenticationBeRetried(Throwable)}
   */
  @Test
  @DisplayName("Test canAuthenticationBeRetried(Throwable)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AuthenticationRetry.canAuthenticationBeRetried(Throwable)"})
  void testCanAuthenticationBeRetried2() {
    // Arrange, Act and Assert
    assertFalse(
        AuthenticationRetry.canAuthenticationBeRetried(
            new ApiException(499, "https://example.org/example")));
  }

  /**
   * Test {@link AuthenticationRetry#canAuthenticationBeRetried(Throwable)}.
   *
   * <p>Method under test: {@link AuthenticationRetry#canAuthenticationBeRetried(Throwable)}
   */
  @Test
  @DisplayName("Test canAuthenticationBeRetried(Throwable)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AuthenticationRetry.canAuthenticationBeRetried(Throwable)"})
  void testCanAuthenticationBeRetried3() {
    // Arrange, Act and Assert
    assertTrue(
        AuthenticationRetry.canAuthenticationBeRetried(
            new ApiException(429, "https://example.org/example")));
  }

  /**
   * Test {@link AuthenticationRetry#canAuthenticationBeRetried(Throwable)}.
   *
   * <ul>
   *   <li>Given {@link ConnectException#ConnectException()}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticationRetry#canAuthenticationBeRetried(Throwable)}
   */
  @Test
  @DisplayName("Test canAuthenticationBeRetried(Throwable); given ConnectException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AuthenticationRetry.canAuthenticationBeRetried(Throwable)"})
  void testCanAuthenticationBeRetried_givenConnectException() {
    // Arrange
    Exception t = new Exception("An error occurred");
    t.initCause(new ConnectException());

    // Act and Assert
    assertTrue(AuthenticationRetry.canAuthenticationBeRetried(t));
  }

  /**
   * Test {@link AuthenticationRetry#canAuthenticationBeRetried(Throwable)}.
   *
   * <ul>
   *   <li>Given {@link SocketTimeoutException#SocketTimeoutException()}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticationRetry#canAuthenticationBeRetried(Throwable)}
   */
  @Test
  @DisplayName("Test canAuthenticationBeRetried(Throwable); given SocketTimeoutException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AuthenticationRetry.canAuthenticationBeRetried(Throwable)"})
  void testCanAuthenticationBeRetried_givenSocketTimeoutException() {
    // Arrange
    Exception t = new Exception("An error occurred");
    t.initCause(new SocketTimeoutException());

    // Act and Assert
    assertTrue(AuthenticationRetry.canAuthenticationBeRetried(t));
  }

  /**
   * Test {@link AuthenticationRetry#canAuthenticationBeRetried(Throwable)}.
   *
   * <ul>
   *   <li>When {@link Throwable#Throwable()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticationRetry#canAuthenticationBeRetried(Throwable)}
   */
  @Test
  @DisplayName("Test canAuthenticationBeRetried(Throwable); when Throwable(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AuthenticationRetry.canAuthenticationBeRetried(Throwable)"})
  void testCanAuthenticationBeRetried_whenThrowable_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(AuthenticationRetry.canAuthenticationBeRetried(new Throwable()));
  }

  /**
   * Test {@link AuthenticationRetry#executeAndRetry(String, String, SupplierWithApiException,
   * String)}.
   *
   * <p>Method under test: {@link AuthenticationRetry#executeAndRetry(String, String,
   * SupplierWithApiException, String)}
   */
  @Test
  @DisplayName("Test executeAndRetry(String, String, SupplierWithApiException, String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Object AuthenticationRetry.executeAndRetry(String, String, SupplierWithApiException, String)"
  })
  void testExecuteAndRetry() throws AuthUnauthorizedException, ApiException {
    // Arrange
    BdkRetryConfig retryConfig = BdkRetryConfigTestHelper.ofMinimalInterval(3);
    AuthenticationRetry<Object> authenticationRetry = new AuthenticationRetry<>(retryConfig);

    SupplierWithApiException<Object> supplier = mock(SupplierWithApiException.class);
    when(supplier.get()).thenThrow(new ApiException(3, "https://example.org/example"));

    // Act and Assert
    assertThrows(
        ApiRuntimeException.class,
        () ->
            authenticationRetry.executeAndRetry(
                "Name", "42 Main St", supplier, "An error occurred"));
    verify(supplier).get();
  }

  /**
   * Test {@link AuthenticationRetry#executeAndRetry(String, String, SupplierWithApiException,
   * String)}.
   *
   * <p>Method under test: {@link AuthenticationRetry#executeAndRetry(String, String,
   * SupplierWithApiException, String)}
   */
  @Test
  @DisplayName("Test executeAndRetry(String, String, SupplierWithApiException, String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Object AuthenticationRetry.executeAndRetry(String, String, SupplierWithApiException, String)"
  })
  void testExecuteAndRetry2() throws AuthUnauthorizedException {
    // Arrange
    when(bdkRetryConfig.getMaxAttempts())
        .thenThrow(new ApiRuntimeException(new ApiException(1, "https://example.org/example")));

    // Act and Assert
    assertThrows(
        ApiRuntimeException.class,
        () ->
            authenticationRetry.executeAndRetry(
                "Name", "42 Main St", mock(SupplierWithApiException.class), "An error occurred"));
    verify(bdkRetryConfig).getMaxAttempts();
  }

  /**
   * Test {@link AuthenticationRetry#executeAndRetry(String, String, SupplierWithApiException,
   * String)}.
   *
   * <p>Method under test: {@link AuthenticationRetry#executeAndRetry(String, String,
   * SupplierWithApiException, String)}
   */
  @Test
  @DisplayName("Test executeAndRetry(String, String, SupplierWithApiException, String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Object AuthenticationRetry.executeAndRetry(String, String, SupplierWithApiException, String)"
  })
  void testExecuteAndRetry3() throws AuthUnauthorizedException {
    // Arrange
    when(bdkRetryConfig.getInitialIntervalMillis())
        .thenThrow(new ApiRuntimeException(new ApiException(1, "https://example.org/example")));
    when(bdkRetryConfig.getMaxAttempts()).thenReturn(3);

    // Act and Assert
    assertThrows(
        ApiRuntimeException.class,
        () ->
            authenticationRetry.executeAndRetry(
                "Name", "42 Main St", mock(SupplierWithApiException.class), "An error occurred"));
    verify(bdkRetryConfig).getInitialIntervalMillis();
    verify(bdkRetryConfig).getMaxAttempts();
  }

  /**
   * Test {@link AuthenticationRetry#executeAndRetry(String, String, SupplierWithApiException,
   * String)}.
   *
   * <p>Method under test: {@link AuthenticationRetry#executeAndRetry(String, String,
   * SupplierWithApiException, String)}
   */
  @Test
  @DisplayName("Test executeAndRetry(String, String, SupplierWithApiException, String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Object AuthenticationRetry.executeAndRetry(String, String, SupplierWithApiException, String)"
  })
  void testExecuteAndRetry4() throws AuthUnauthorizedException, ApiException {
    // Arrange
    when(bdkRetryConfig.getMultiplier()).thenReturn(10.0d);
    when(bdkRetryConfig.getInitialIntervalMillis()).thenReturn(42L);
    when(bdkRetryConfig.getMaxIntervalMillis()).thenReturn(42L);
    when(bdkRetryConfig.getMaxAttempts()).thenReturn(3);

    SupplierWithApiException<Object> supplier = mock(SupplierWithApiException.class);
    when(supplier.get()).thenThrow(new ApiException(500, "https://example.org/example"));

    // Act and Assert
    assertThrows(
        ApiRuntimeException.class,
        () ->
            authenticationRetry.executeAndRetry(
                "Name", "42 Main St", supplier, "An error occurred"));
    verify(bdkRetryConfig).getInitialIntervalMillis();
    verify(bdkRetryConfig).getMaxAttempts();
    verify(bdkRetryConfig).getMaxIntervalMillis();
    verify(bdkRetryConfig).getMultiplier();
    verify(supplier, atLeast(1)).get();
  }

  /**
   * Test {@link AuthenticationRetry#executeAndRetry(String, String, SupplierWithApiException,
   * String)}.
   *
   * <p>Method under test: {@link AuthenticationRetry#executeAndRetry(String, String,
   * SupplierWithApiException, String)}
   */
  @Test
  @DisplayName("Test executeAndRetry(String, String, SupplierWithApiException, String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Object AuthenticationRetry.executeAndRetry(String, String, SupplierWithApiException, String)"
  })
  void testExecuteAndRetry5() throws AuthUnauthorizedException, ApiException {
    // Arrange
    when(bdkRetryConfig.getMultiplier()).thenReturn(10.0d);
    when(bdkRetryConfig.getInitialIntervalMillis()).thenReturn(42L);
    when(bdkRetryConfig.getMaxIntervalMillis()).thenReturn(42L);
    when(bdkRetryConfig.getMaxAttempts()).thenReturn(3);

    SupplierWithApiException<Object> supplier = mock(SupplierWithApiException.class);
    when(supplier.get()).thenThrow(new ApiException(429, "https://example.org/example"));

    // Act and Assert
    assertThrows(
        ApiRuntimeException.class,
        () -> authenticationRetry.executeAndRetry("Name", "/relay", supplier, "An error occurred"));
    verify(bdkRetryConfig).getInitialIntervalMillis();
    verify(bdkRetryConfig).getMaxAttempts();
    verify(bdkRetryConfig).getMaxIntervalMillis();
    verify(bdkRetryConfig).getMultiplier();
    verify(supplier, atLeast(1)).get();
  }

  /**
   * Test {@link AuthenticationRetry#executeAndRetry(String, String, SupplierWithApiException,
   * String)}.
   *
   * <ul>
   *   <li>Given {@code Get}.
   *   <li>Then return {@code Get}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticationRetry#executeAndRetry(String, String,
   * SupplierWithApiException, String)}
   */
  @Test
  @DisplayName(
      "Test executeAndRetry(String, String, SupplierWithApiException, String); given 'Get'; then return 'Get'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Object AuthenticationRetry.executeAndRetry(String, String, SupplierWithApiException, String)"
  })
  void testExecuteAndRetry_givenGet_thenReturnGet() throws AuthUnauthorizedException, ApiException {
    // Arrange
    BdkRetryConfig retryConfig = BdkRetryConfigTestHelper.ofMinimalInterval(3);
    AuthenticationRetry<Object> authenticationRetry = new AuthenticationRetry<>(retryConfig);

    SupplierWithApiException<Object> supplier = mock(SupplierWithApiException.class);
    when(supplier.get()).thenReturn("Get");

    // Act
    Object actualExecuteAndRetryResult =
        authenticationRetry.executeAndRetry("Name", "42 Main St", supplier, "An error occurred");

    // Assert
    verify(supplier).get();
    assertEquals("Get", actualExecuteAndRetryResult);
  }

  /**
   * Test {@link AuthenticationRetry#executeAndRetry(String, String, SupplierWithApiException,
   * String)}.
   *
   * <ul>
   *   <li>Then throw {@link RuntimeException}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticationRetry#executeAndRetry(String, String,
   * SupplierWithApiException, String)}
   */
  @Test
  @DisplayName(
      "Test executeAndRetry(String, String, SupplierWithApiException, String); then throw RuntimeException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Object AuthenticationRetry.executeAndRetry(String, String, SupplierWithApiException, String)"
  })
  void testExecuteAndRetry_thenThrowRuntimeException()
      throws AuthUnauthorizedException, ApiException {
    // Arrange
    BdkRetryConfig retryConfig = BdkRetryConfigTestHelper.ofMinimalInterval(3);
    AuthenticationRetry<Object> authenticationRetry = new AuthenticationRetry<>(retryConfig);

    SupplierWithApiException<Object> supplier = mock(SupplierWithApiException.class);
    when(supplier.get())
        .thenThrow(new ApiRuntimeException(new ApiException(3, "https://example.org/example")));

    // Act and Assert
    assertThrows(
        RuntimeException.class,
        () ->
            authenticationRetry.executeAndRetry(
                "Name", "42 Main St", supplier, "An error occurred"));
    verify(supplier).get();
  }

  /**
   * Test {@link AuthenticationRetry#executeAndRetry(String, String, SupplierWithApiException,
   * String)}.
   *
   * <ul>
   *   <li>When {@code /agent}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticationRetry#executeAndRetry(String, String,
   * SupplierWithApiException, String)}
   */
  @Test
  @DisplayName(
      "Test executeAndRetry(String, String, SupplierWithApiException, String); when '/agent'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Object AuthenticationRetry.executeAndRetry(String, String, SupplierWithApiException, String)"
  })
  void testExecuteAndRetry_whenAgent() throws AuthUnauthorizedException, ApiException {
    // Arrange
    BdkRetryConfig retryConfig = BdkRetryConfigTestHelper.ofMinimalInterval(3);
    AuthenticationRetry<Object> authenticationRetry = new AuthenticationRetry<>(retryConfig);

    SupplierWithApiException<Object> supplier = mock(SupplierWithApiException.class);
    when(supplier.get()).thenThrow(new ApiException(3, "https://example.org/example"));

    // Act and Assert
    assertThrows(
        ApiRuntimeException.class,
        () -> authenticationRetry.executeAndRetry("Name", "/agent", supplier, "An error occurred"));
    verify(supplier).get();
  }

  /**
   * Test {@link AuthenticationRetry#executeAndRetry(String, String, SupplierWithApiException,
   * String)}.
   *
   * <ul>
   *   <li>When {@code /keyauth}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticationRetry#executeAndRetry(String, String,
   * SupplierWithApiException, String)}
   */
  @Test
  @DisplayName(
      "Test executeAndRetry(String, String, SupplierWithApiException, String); when '/keyauth'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Object AuthenticationRetry.executeAndRetry(String, String, SupplierWithApiException, String)"
  })
  void testExecuteAndRetry_whenKeyauth() throws AuthUnauthorizedException, ApiException {
    // Arrange
    BdkRetryConfig retryConfig = BdkRetryConfigTestHelper.ofMinimalInterval(3);
    AuthenticationRetry<Object> authenticationRetry = new AuthenticationRetry<>(retryConfig);

    SupplierWithApiException<Object> supplier = mock(SupplierWithApiException.class);
    when(supplier.get()).thenThrow(new ApiException(3, "https://example.org/example"));

    // Act and Assert
    assertThrows(
        ApiRuntimeException.class,
        () ->
            authenticationRetry.executeAndRetry("Name", "/keyauth", supplier, "An error occurred"));
    verify(supplier).get();
  }

  /**
   * Test {@link AuthenticationRetry#executeAndRetry(String, String, SupplierWithApiException,
   * String)}.
   *
   * <ul>
   *   <li>When {@code /relay}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticationRetry#executeAndRetry(String, String,
   * SupplierWithApiException, String)}
   */
  @Test
  @DisplayName(
      "Test executeAndRetry(String, String, SupplierWithApiException, String); when '/relay'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Object AuthenticationRetry.executeAndRetry(String, String, SupplierWithApiException, String)"
  })
  void testExecuteAndRetry_whenRelay() throws AuthUnauthorizedException, ApiException {
    // Arrange
    BdkRetryConfig retryConfig = BdkRetryConfigTestHelper.ofMinimalInterval(3);
    AuthenticationRetry<Object> authenticationRetry = new AuthenticationRetry<>(retryConfig);

    SupplierWithApiException<Object> supplier = mock(SupplierWithApiException.class);
    when(supplier.get()).thenThrow(new ApiException(3, "https://example.org/example"));

    // Act and Assert
    assertThrows(
        ApiRuntimeException.class,
        () -> authenticationRetry.executeAndRetry("Name", "/relay", supplier, "An error occurred"));
    verify(supplier).get();
  }

  /**
   * Test {@link AuthenticationRetry#executeAndRetry(String, String, SupplierWithApiException,
   * String)}.
   *
   * <ul>
   *   <li>When {@code /sessionauth}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticationRetry#executeAndRetry(String, String,
   * SupplierWithApiException, String)}
   */
  @Test
  @DisplayName(
      "Test executeAndRetry(String, String, SupplierWithApiException, String); when '/sessionauth'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Object AuthenticationRetry.executeAndRetry(String, String, SupplierWithApiException, String)"
  })
  void testExecuteAndRetry_whenSessionauth() throws AuthUnauthorizedException, ApiException {
    // Arrange
    BdkRetryConfig retryConfig = BdkRetryConfigTestHelper.ofMinimalInterval(3);
    AuthenticationRetry<Object> authenticationRetry = new AuthenticationRetry<>(retryConfig);

    SupplierWithApiException<Object> supplier = mock(SupplierWithApiException.class);
    when(supplier.get()).thenThrow(new ApiException(3, "https://example.org/example"));

    // Act and Assert
    assertThrows(
        ApiRuntimeException.class,
        () ->
            authenticationRetry.executeAndRetry(
                "Name", "/sessionauth", supplier, "An error occurred"));
    verify(supplier).get();
  }
}
