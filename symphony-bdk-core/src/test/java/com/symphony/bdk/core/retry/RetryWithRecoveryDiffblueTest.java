package com.symphony.bdk.core.retry;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.retry.function.SupplierWithApiException;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.api.ApiRuntimeException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RetryWithRecoveryDiffblueTest {
  /**
   * Test {@link RetryWithRecovery#executeAndRetry(RetryWithRecoveryBuilder, String, String, SupplierWithApiException)}.
   * <ul>
   *   <li>Given {@code Get}.</li>
   *   <li>Then return {@code Get}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RetryWithRecovery#executeAndRetry(RetryWithRecoveryBuilder, String, String, SupplierWithApiException)}
   */
  @Test
  @DisplayName("Test executeAndRetry(RetryWithRecoveryBuilder, String, String, SupplierWithApiException); given 'Get'; then return 'Get'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "Object RetryWithRecovery.executeAndRetry(RetryWithRecoveryBuilder, String, String, SupplierWithApiException)"})
  void testExecuteAndRetry_givenGet_thenReturnGet() throws ApiException {
    // Arrange
    RetryWithRecoveryBuilder<?> baseRetryBuilder = new RetryWithRecoveryBuilder<>();
    SupplierWithApiException<Object> supplier = mock(SupplierWithApiException.class);
    when(supplier.get()).thenReturn("Get");

    // Act
    Object actualExecuteAndRetryResult = RetryWithRecovery.executeAndRetry(baseRetryBuilder, "Name", "42 Main St",
        supplier);

    // Assert
    verify(supplier).get();
    assertEquals("Get", actualExecuteAndRetryResult);
  }

  /**
   * Test {@link RetryWithRecovery#executeAndRetry(RetryWithRecoveryBuilder, String, String, SupplierWithApiException)}.
   * <ul>
   *   <li>When {@code 42 Main St}.</li>
   *   <li>Then throw {@link ApiRuntimeException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RetryWithRecovery#executeAndRetry(RetryWithRecoveryBuilder, String, String, SupplierWithApiException)}
   */
  @Test
  @DisplayName("Test executeAndRetry(RetryWithRecoveryBuilder, String, String, SupplierWithApiException); when '42 Main St'; then throw ApiRuntimeException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "Object RetryWithRecovery.executeAndRetry(RetryWithRecoveryBuilder, String, String, SupplierWithApiException)"})
  void testExecuteAndRetry_when42MainSt_thenThrowApiRuntimeException() throws ApiException {
    // Arrange
    RetryWithRecoveryBuilder<?> baseRetryBuilder = new RetryWithRecoveryBuilder<>();
    SupplierWithApiException<Object> supplier = mock(SupplierWithApiException.class);
    when(supplier.get()).thenThrow(new ApiException(10, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiRuntimeException.class,
        () -> RetryWithRecovery.executeAndRetry(baseRetryBuilder, "Name", "42 Main St", supplier));
    verify(supplier).get();
  }

  /**
   * Test {@link RetryWithRecovery#executeAndRetry(RetryWithRecoveryBuilder, String, String, SupplierWithApiException)}.
   * <ul>
   *   <li>When {@code /agent}.</li>
   *   <li>Then throw {@link ApiRuntimeException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RetryWithRecovery#executeAndRetry(RetryWithRecoveryBuilder, String, String, SupplierWithApiException)}
   */
  @Test
  @DisplayName("Test executeAndRetry(RetryWithRecoveryBuilder, String, String, SupplierWithApiException); when '/agent'; then throw ApiRuntimeException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "Object RetryWithRecovery.executeAndRetry(RetryWithRecoveryBuilder, String, String, SupplierWithApiException)"})
  void testExecuteAndRetry_whenAgent_thenThrowApiRuntimeException() throws ApiException {
    // Arrange
    RetryWithRecoveryBuilder<?> baseRetryBuilder = new RetryWithRecoveryBuilder<>();
    SupplierWithApiException<Object> supplier = mock(SupplierWithApiException.class);
    when(supplier.get()).thenThrow(new ApiException(10, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiRuntimeException.class,
        () -> RetryWithRecovery.executeAndRetry(baseRetryBuilder, "Name", "/agent", supplier));
    verify(supplier).get();
  }

  /**
   * Test {@link RetryWithRecovery#executeAndRetry(RetryWithRecoveryBuilder, String, String, SupplierWithApiException)}.
   * <ul>
   *   <li>When {@code /keyauth}.</li>
   *   <li>Then throw {@link ApiRuntimeException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RetryWithRecovery#executeAndRetry(RetryWithRecoveryBuilder, String, String, SupplierWithApiException)}
   */
  @Test
  @DisplayName("Test executeAndRetry(RetryWithRecoveryBuilder, String, String, SupplierWithApiException); when '/keyauth'; then throw ApiRuntimeException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "Object RetryWithRecovery.executeAndRetry(RetryWithRecoveryBuilder, String, String, SupplierWithApiException)"})
  void testExecuteAndRetry_whenKeyauth_thenThrowApiRuntimeException() throws ApiException {
    // Arrange
    RetryWithRecoveryBuilder<?> baseRetryBuilder = new RetryWithRecoveryBuilder<>();
    SupplierWithApiException<Object> supplier = mock(SupplierWithApiException.class);
    when(supplier.get()).thenThrow(new ApiException(10, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiRuntimeException.class,
        () -> RetryWithRecovery.executeAndRetry(baseRetryBuilder, "Name", "/keyauth", supplier));
    verify(supplier).get();
  }

  /**
   * Test {@link RetryWithRecovery#executeAndRetry(RetryWithRecoveryBuilder, String, String, SupplierWithApiException)}.
   * <ul>
   *   <li>When {@code /relay}.</li>
   *   <li>Then throw {@link ApiRuntimeException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RetryWithRecovery#executeAndRetry(RetryWithRecoveryBuilder, String, String, SupplierWithApiException)}
   */
  @Test
  @DisplayName("Test executeAndRetry(RetryWithRecoveryBuilder, String, String, SupplierWithApiException); when '/relay'; then throw ApiRuntimeException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "Object RetryWithRecovery.executeAndRetry(RetryWithRecoveryBuilder, String, String, SupplierWithApiException)"})
  void testExecuteAndRetry_whenRelay_thenThrowApiRuntimeException() throws ApiException {
    // Arrange
    RetryWithRecoveryBuilder<?> baseRetryBuilder = new RetryWithRecoveryBuilder<>();
    SupplierWithApiException<Object> supplier = mock(SupplierWithApiException.class);
    when(supplier.get()).thenThrow(new ApiException(10, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiRuntimeException.class,
        () -> RetryWithRecovery.executeAndRetry(baseRetryBuilder, "Name", "/relay", supplier));
    verify(supplier).get();
  }

  /**
   * Test {@link RetryWithRecovery#executeAndRetry(RetryWithRecoveryBuilder, String, String, SupplierWithApiException)}.
   * <ul>
   *   <li>When {@code /sessionauth}.</li>
   *   <li>Then throw {@link ApiRuntimeException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RetryWithRecovery#executeAndRetry(RetryWithRecoveryBuilder, String, String, SupplierWithApiException)}
   */
  @Test
  @DisplayName("Test executeAndRetry(RetryWithRecoveryBuilder, String, String, SupplierWithApiException); when '/sessionauth'; then throw ApiRuntimeException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "Object RetryWithRecovery.executeAndRetry(RetryWithRecoveryBuilder, String, String, SupplierWithApiException)"})
  void testExecuteAndRetry_whenSessionauth_thenThrowApiRuntimeException() throws ApiException {
    // Arrange
    RetryWithRecoveryBuilder<?> baseRetryBuilder = new RetryWithRecoveryBuilder<>();
    SupplierWithApiException<Object> supplier = mock(SupplierWithApiException.class);
    when(supplier.get()).thenThrow(new ApiException(10, "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiRuntimeException.class,
        () -> RetryWithRecovery.executeAndRetry(baseRetryBuilder, "Name", "/sessionauth", supplier));
    verify(supplier).get();
  }

  /**
   * Test {@link RetryWithRecovery#networkIssueMessageError(Throwable, String)}.
   * <ul>
   *   <li>Given {@link ConnectException#ConnectException(String)} with {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RetryWithRecovery#networkIssueMessageError(Throwable, String)}
   */
  @Test
  @DisplayName("Test networkIssueMessageError(Throwable, String); given ConnectException(String) with 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String RetryWithRecovery.networkIssueMessageError(Throwable, String)"})
  void testNetworkIssueMessageError_givenConnectExceptionWithFoo() {
    // Arrange
    Throwable t = new Throwable();
    t.initCause(new ConnectException("foo"));

    // Act and Assert
    assertEquals("Connection refused while trying to connect to the \"KEY_MANAGER\" at the following address: /relay."
        + " Please check if this remote address/port is reachable. Also consider checking your proxy/firewall"
        + " connections.", RetryWithRecovery.networkIssueMessageError(t, "/relay"));
  }

  /**
   * Test {@link RetryWithRecovery#networkIssueMessageError(Throwable, String)}.
   * <ul>
   *   <li>Given {@link SSLHandshakeException#SSLHandshakeException(String)} with {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RetryWithRecovery#networkIssueMessageError(Throwable, String)}
   */
  @Test
  @DisplayName("Test networkIssueMessageError(Throwable, String); given SSLHandshakeException(String) with 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String RetryWithRecovery.networkIssueMessageError(Throwable, String)"})
  void testNetworkIssueMessageError_givenSSLHandshakeExceptionWithFoo() {
    // Arrange
    Throwable t = new Throwable();
    t.initCause(new SSLHandshakeException("foo"));

    // Act and Assert
    assertEquals(
        "Network error occurred while trying to connect to the \"KEY_MANAGER\" at the following address: /relay."
            + " Error while trying to validate certificate for the trust store. This type of error typically means"
            + " that your network is using a self-signed certificate.",
        RetryWithRecovery.networkIssueMessageError(t, "/relay"));
  }

  /**
   * Test {@link RetryWithRecovery#networkIssueMessageError(Throwable, String)}.
   * <ul>
   *   <li>Given {@link SSLHandshakeException#SSLHandshakeException(String)} with {@code foo}.</li>
   *   <li>When {@code /agent}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RetryWithRecovery#networkIssueMessageError(Throwable, String)}
   */
  @Test
  @DisplayName("Test networkIssueMessageError(Throwable, String); given SSLHandshakeException(String) with 'foo'; when '/agent'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String RetryWithRecovery.networkIssueMessageError(Throwable, String)"})
  void testNetworkIssueMessageError_givenSSLHandshakeExceptionWithFoo_whenAgent() {
    // Arrange
    Throwable t = new Throwable();
    t.initCause(new SSLHandshakeException("foo"));

    // Act and Assert
    assertEquals(
        "Network error occurred while trying to connect to the \"AGENT\" at the following address: /agent. Error"
            + " while trying to validate certificate for the trust store. This type of error typically means that"
            + " your network is using a self-signed certificate.",
        RetryWithRecovery.networkIssueMessageError(t, "/agent"));
  }

  /**
   * Test {@link RetryWithRecovery#networkIssueMessageError(Throwable, String)}.
   * <ul>
   *   <li>Given {@link SSLHandshakeException#SSLHandshakeException(String)} with {@code foo}.</li>
   *   <li>When {@code /keyauth}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RetryWithRecovery#networkIssueMessageError(Throwable, String)}
   */
  @Test
  @DisplayName("Test networkIssueMessageError(Throwable, String); given SSLHandshakeException(String) with 'foo'; when '/keyauth'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String RetryWithRecovery.networkIssueMessageError(Throwable, String)"})
  void testNetworkIssueMessageError_givenSSLHandshakeExceptionWithFoo_whenKeyauth() {
    // Arrange
    Throwable t = new Throwable();
    t.initCause(new SSLHandshakeException("foo"));

    // Act and Assert
    assertEquals(
        "Network error occurred while trying to connect to the \"KEY_MANAGER\" at the following address: /keyauth."
            + " Error while trying to validate certificate for the trust store. This type of error typically means"
            + " that your network is using a self-signed certificate.",
        RetryWithRecovery.networkIssueMessageError(t, "/keyauth"));
  }

  /**
   * Test {@link RetryWithRecovery#networkIssueMessageError(Throwable, String)}.
   * <ul>
   *   <li>Given {@link SSLHandshakeException#SSLHandshakeException(String)} with {@code foo}.</li>
   *   <li>When {@code /sessionauth}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RetryWithRecovery#networkIssueMessageError(Throwable, String)}
   */
  @Test
  @DisplayName("Test networkIssueMessageError(Throwable, String); given SSLHandshakeException(String) with 'foo'; when '/sessionauth'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String RetryWithRecovery.networkIssueMessageError(Throwable, String)"})
  void testNetworkIssueMessageError_givenSSLHandshakeExceptionWithFoo_whenSessionauth() {
    // Arrange
    Throwable t = new Throwable();
    t.initCause(new SSLHandshakeException("foo"));

    // Act and Assert
    assertEquals(
        "Network error occurred while trying to connect to the \"SESSION_AUTH\" at the following address:"
            + " /sessionauth. Error while trying to validate certificate for the trust store. This type of error"
            + " typically means that your network is using a self-signed certificate.",
        RetryWithRecovery.networkIssueMessageError(t, "/sessionauth"));
  }

  /**
   * Test {@link RetryWithRecovery#networkIssueMessageError(Throwable, String)}.
   * <ul>
   *   <li>Given {@link SocketTimeoutException#SocketTimeoutException(String)} with {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RetryWithRecovery#networkIssueMessageError(Throwable, String)}
   */
  @Test
  @DisplayName("Test networkIssueMessageError(Throwable, String); given SocketTimeoutException(String) with 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String RetryWithRecovery.networkIssueMessageError(Throwable, String)"})
  void testNetworkIssueMessageError_givenSocketTimeoutExceptionWithFoo() {
    // Arrange
    Throwable t = new Throwable();
    t.initCause(new SocketTimeoutException("foo"));

    // Act and Assert
    assertEquals(
        "Timeout occurred while trying to connect to the \"KEY_MANAGER\" at the following address: /relay. Please"
            + " check that the address is correct. Also consider checking your proxy/firewall connections.",
        RetryWithRecovery.networkIssueMessageError(t, "/relay"));
  }

  /**
   * Test {@link RetryWithRecovery#networkIssueMessageError(Throwable, String)}.
   * <ul>
   *   <li>Given {@link UnknownHostException#UnknownHostException(String)} with {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RetryWithRecovery#networkIssueMessageError(Throwable, String)}
   */
  @Test
  @DisplayName("Test networkIssueMessageError(Throwable, String); given UnknownHostException(String) with 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String RetryWithRecovery.networkIssueMessageError(Throwable, String)"})
  void testNetworkIssueMessageError_givenUnknownHostExceptionWithFoo() {
    // Arrange
    Throwable t = new Throwable();
    t.initCause(new UnknownHostException("foo"));

    // Act and Assert
    assertEquals(
        "Network error occurred while trying to connect to the \"KEY_MANAGER\" at the following address: /relay."
            + " Your host is unknown, please check that the address is correct. Also consider checking your proxy/firewall"
            + " connections.",
        RetryWithRecovery.networkIssueMessageError(t, "/relay"));
  }

  /**
   * Test {@link RetryWithRecovery#networkIssueMessageError(Throwable, String)}.
   * <ul>
   *   <li>When {@link Throwable#Throwable()}.</li>
   *   <li>Then return a string.</li>
   * </ul>
   * <p>
   * Method under test: {@link RetryWithRecovery#networkIssueMessageError(Throwable, String)}
   */
  @Test
  @DisplayName("Test networkIssueMessageError(Throwable, String); when Throwable(); then return a string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String RetryWithRecovery.networkIssueMessageError(Throwable, String)"})
  void testNetworkIssueMessageError_whenThrowable_thenReturnAString() {
    // Arrange, Act and Assert
    assertEquals("An unknown error occurred while trying to connect to 42 Main St. Please check below for more"
        + " information: ", RetryWithRecovery.networkIssueMessageError(new Throwable(), "42 Main St"));
  }
}
