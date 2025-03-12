package com.symphony.bdk.core.auth.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.exception.AuthUnauthorizedException;
import com.symphony.bdk.core.config.model.BdkRetryConfig;
import com.symphony.bdk.core.retry.RetryWithRecoveryBuilder;
import com.symphony.bdk.core.retry.function.SupplierWithApiException;
import com.symphony.bdk.core.retry.resilience4j.Resilience4jRetryWithRecovery;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.api.ApiRuntimeException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AuthenticationRetryDiffblueTest {
  /**
   * Test {@link AuthenticationRetry#getBaseRetryBuilder(BdkRetryConfig)}.
   * <p>
   * Method under test: {@link AuthenticationRetry#getBaseRetryBuilder(BdkRetryConfig)}
   */
  @Test
  @DisplayName("Test getBaseRetryBuilder(BdkRetryConfig)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"RetryWithRecoveryBuilder AuthenticationRetry.getBaseRetryBuilder(BdkRetryConfig)"})
  void testGetBaseRetryBuilder() {
    // Arrange and Act
    RetryWithRecoveryBuilder<Object> actualBaseRetryBuilder = AuthenticationRetry
        .getBaseRetryBuilder(new BdkRetryConfig());

    // Assert
    assertTrue(actualBaseRetryBuilder.build() instanceof Resilience4jRetryWithRecovery);
  }

  /**
   * Test {@link AuthenticationRetry#canAuthenticationBeRetried(Throwable)}.
   * <ul>
   *   <li>Given {@link ConnectException#ConnectException(String)} with {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuthenticationRetry#canAuthenticationBeRetried(Throwable)}
   */
  @Test
  @DisplayName("Test canAuthenticationBeRetried(Throwable); given ConnectException(String) with 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AuthenticationRetry.canAuthenticationBeRetried(Throwable)"})
  void testCanAuthenticationBeRetried_givenConnectExceptionWithFoo() {
    // Arrange
    Throwable t = new Throwable();
    t.initCause(new ConnectException("foo"));

    // Act and Assert
    assertTrue(AuthenticationRetry.canAuthenticationBeRetried(t));
  }

  /**
   * Test {@link AuthenticationRetry#canAuthenticationBeRetried(Throwable)}.
   * <ul>
   *   <li>Given {@link SocketTimeoutException#SocketTimeoutException(String)} with {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuthenticationRetry#canAuthenticationBeRetried(Throwable)}
   */
  @Test
  @DisplayName("Test canAuthenticationBeRetried(Throwable); given SocketTimeoutException(String) with 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AuthenticationRetry.canAuthenticationBeRetried(Throwable)"})
  void testCanAuthenticationBeRetried_givenSocketTimeoutExceptionWithFoo() {
    // Arrange
    Throwable t = new Throwable();
    t.initCause(new SocketTimeoutException("foo"));

    // Act and Assert
    assertTrue(AuthenticationRetry.canAuthenticationBeRetried(t));
  }

  /**
   * Test {@link AuthenticationRetry#canAuthenticationBeRetried(Throwable)}.
   * <ul>
   *   <li>When {@link Throwable#Throwable()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuthenticationRetry#canAuthenticationBeRetried(Throwable)}
   */
  @Test
  @DisplayName("Test canAuthenticationBeRetried(Throwable); when Throwable(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AuthenticationRetry.canAuthenticationBeRetried(Throwable)"})
  void testCanAuthenticationBeRetried_whenThrowable_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(AuthenticationRetry.canAuthenticationBeRetried(new Throwable()));
  }

  /**
   * Test {@link AuthenticationRetry#executeAndRetry(String, String, SupplierWithApiException, String)}.
   * <ul>
   *   <li>Given {@code Get}.</li>
   *   <li>Then return {@code Get}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuthenticationRetry#executeAndRetry(String, String, SupplierWithApiException, String)}
   */
  @Test
  @DisplayName("Test executeAndRetry(String, String, SupplierWithApiException, String); given 'Get'; then return 'Get'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AuthenticationRetry.executeAndRetry(String, String, SupplierWithApiException, String)"})
  void testExecuteAndRetry_givenGet_thenReturnGet() throws AuthUnauthorizedException, ApiException {
    // Arrange
    AuthenticationRetry<Object> authenticationRetry = new AuthenticationRetry<>(new BdkRetryConfig());
    SupplierWithApiException<Object> supplier = mock(SupplierWithApiException.class);
    when(supplier.get()).thenReturn("Get");

    // Act
    Object actualExecuteAndRetryResult = authenticationRetry.executeAndRetry("Name", "42 Main St", supplier,
        "An error occurred");

    // Assert
    verify(supplier).get();
    assertEquals("Get", actualExecuteAndRetryResult);
  }

  /**
   * Test {@link AuthenticationRetry#executeAndRetry(String, String, SupplierWithApiException, String)}.
   * <ul>
   *   <li>When {@code 42 Main St}.</li>
   *   <li>Then throw {@link ApiRuntimeException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuthenticationRetry#executeAndRetry(String, String, SupplierWithApiException, String)}
   */
  @Test
  @DisplayName("Test executeAndRetry(String, String, SupplierWithApiException, String); when '42 Main St'; then throw ApiRuntimeException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AuthenticationRetry.executeAndRetry(String, String, SupplierWithApiException, String)"})
  void testExecuteAndRetry_when42MainSt_thenThrowApiRuntimeException() throws AuthUnauthorizedException, ApiException {
    // Arrange
    AuthenticationRetry<Object> authenticationRetry = new AuthenticationRetry<>(new BdkRetryConfig());
    SupplierWithApiException<Object> supplier = mock(SupplierWithApiException.class);
    when(supplier.get()).thenThrow(new ApiException(10, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiRuntimeException.class,
        () -> authenticationRetry.executeAndRetry("Name", "42 Main St", supplier, "An error occurred"));
    verify(supplier).get();
  }

  /**
   * Test {@link AuthenticationRetry#executeAndRetry(String, String, SupplierWithApiException, String)}.
   * <ul>
   *   <li>When {@code /agent}.</li>
   *   <li>Then throw {@link ApiRuntimeException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuthenticationRetry#executeAndRetry(String, String, SupplierWithApiException, String)}
   */
  @Test
  @DisplayName("Test executeAndRetry(String, String, SupplierWithApiException, String); when '/agent'; then throw ApiRuntimeException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AuthenticationRetry.executeAndRetry(String, String, SupplierWithApiException, String)"})
  void testExecuteAndRetry_whenAgent_thenThrowApiRuntimeException() throws AuthUnauthorizedException, ApiException {
    // Arrange
    AuthenticationRetry<Object> authenticationRetry = new AuthenticationRetry<>(new BdkRetryConfig());
    SupplierWithApiException<Object> supplier = mock(SupplierWithApiException.class);
    when(supplier.get()).thenThrow(new ApiException(10, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiRuntimeException.class,
        () -> authenticationRetry.executeAndRetry("Name", "/agent", supplier, "An error occurred"));
    verify(supplier).get();
  }

  /**
   * Test {@link AuthenticationRetry#executeAndRetry(String, String, SupplierWithApiException, String)}.
   * <ul>
   *   <li>When {@code /keyauth}.</li>
   *   <li>Then throw {@link ApiRuntimeException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuthenticationRetry#executeAndRetry(String, String, SupplierWithApiException, String)}
   */
  @Test
  @DisplayName("Test executeAndRetry(String, String, SupplierWithApiException, String); when '/keyauth'; then throw ApiRuntimeException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AuthenticationRetry.executeAndRetry(String, String, SupplierWithApiException, String)"})
  void testExecuteAndRetry_whenKeyauth_thenThrowApiRuntimeException() throws AuthUnauthorizedException, ApiException {
    // Arrange
    AuthenticationRetry<Object> authenticationRetry = new AuthenticationRetry<>(new BdkRetryConfig());
    SupplierWithApiException<Object> supplier = mock(SupplierWithApiException.class);
    when(supplier.get()).thenThrow(new ApiException(10, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiRuntimeException.class,
        () -> authenticationRetry.executeAndRetry("Name", "/keyauth", supplier, "An error occurred"));
    verify(supplier).get();
  }

  /**
   * Test {@link AuthenticationRetry#executeAndRetry(String, String, SupplierWithApiException, String)}.
   * <ul>
   *   <li>When {@code /relay}.</li>
   *   <li>Then throw {@link ApiRuntimeException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuthenticationRetry#executeAndRetry(String, String, SupplierWithApiException, String)}
   */
  @Test
  @DisplayName("Test executeAndRetry(String, String, SupplierWithApiException, String); when '/relay'; then throw ApiRuntimeException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AuthenticationRetry.executeAndRetry(String, String, SupplierWithApiException, String)"})
  void testExecuteAndRetry_whenRelay_thenThrowApiRuntimeException() throws AuthUnauthorizedException, ApiException {
    // Arrange
    AuthenticationRetry<Object> authenticationRetry = new AuthenticationRetry<>(new BdkRetryConfig());
    SupplierWithApiException<Object> supplier = mock(SupplierWithApiException.class);
    when(supplier.get()).thenThrow(new ApiException(10, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiRuntimeException.class,
        () -> authenticationRetry.executeAndRetry("Name", "/relay", supplier, "An error occurred"));
    verify(supplier).get();
  }

  /**
   * Test {@link AuthenticationRetry#executeAndRetry(String, String, SupplierWithApiException, String)}.
   * <ul>
   *   <li>When {@code /sessionauth}.</li>
   *   <li>Then throw {@link ApiRuntimeException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuthenticationRetry#executeAndRetry(String, String, SupplierWithApiException, String)}
   */
  @Test
  @DisplayName("Test executeAndRetry(String, String, SupplierWithApiException, String); when '/sessionauth'; then throw ApiRuntimeException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AuthenticationRetry.executeAndRetry(String, String, SupplierWithApiException, String)"})
  void testExecuteAndRetry_whenSessionauth_thenThrowApiRuntimeException()
      throws AuthUnauthorizedException, ApiException {
    // Arrange
    AuthenticationRetry<Object> authenticationRetry = new AuthenticationRetry<>(new BdkRetryConfig());
    SupplierWithApiException<Object> supplier = mock(SupplierWithApiException.class);
    when(supplier.get()).thenThrow(new ApiException(10, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiRuntimeException.class,
        () -> authenticationRetry.executeAndRetry("Name", "/sessionauth", supplier, "An error occurred"));
    verify(supplier).get();
  }
}
