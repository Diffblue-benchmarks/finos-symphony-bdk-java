package com.symphony.bdk.core.retry.resilience4j;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.config.model.BdkRetryConfig;
import com.symphony.bdk.core.retry.RecoveryStrategy;
import com.symphony.bdk.core.retry.function.ConsumerWithThrowable;
import com.symphony.bdk.core.retry.function.SupplierWithApiException;
import com.symphony.bdk.core.test.BdkRetryConfigTestHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class Resilience4jRetryWithRecoveryDiffblueTest {
  /**
   * Test {@link Resilience4jRetryWithRecovery#Resilience4jRetryWithRecovery(String, String,
   * BdkRetryConfig, SupplierWithApiException, Predicate, List)}.
   *
   * <ul>
   *   <li>Given {@code Exception}.
   * </ul>
   *
   * <p>Method under test: {@link
   * Resilience4jRetryWithRecovery#Resilience4jRetryWithRecovery(String, String, BdkRetryConfig,
   * SupplierWithApiException, Predicate, List)}
   */
  @Test
  @DisplayName(
      "Test new Resilience4jRetryWithRecovery(String, String, BdkRetryConfig, SupplierWithApiException, Predicate, List); given 'java.lang.Exception'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Resilience4jRetryWithRecovery.<init>(String, String, BdkRetryConfig, SupplierWithApiException, Predicate, List)"
  })
  void testNewResilience4jRetryWithRecovery_givenJavaLangException() throws Throwable {
    // Arrange
    BdkRetryConfig bdkRetryConfig = BdkRetryConfigTestHelper.ofMinimalInterval(3);
    SupplierWithApiException<Object> supplier = mock(SupplierWithApiException.class);
    Predicate<Throwable> retryOnExceptionPredicate = mock(Predicate.class);
    when(retryOnExceptionPredicate.and(Mockito.<Predicate<Throwable>>any()))
        .thenReturn(mock(Predicate.class));

    ArrayList<RecoveryStrategy> recoveryStrategies = new ArrayList<>();
    Class<Exception> exceptionType = Exception.class;
    recoveryStrategies.add(
        new RecoveryStrategy(
            exceptionType, mock(Predicate.class), mock(ConsumerWithThrowable.class)));

    // Act
    Resilience4jRetryWithRecovery<Object> actualResilience4jRetryWithRecovery =
        new Resilience4jRetryWithRecovery<>(
            "Name",
            "42 Main St",
            bdkRetryConfig,
            supplier,
            retryOnExceptionPredicate,
            recoveryStrategies);

    // Assert
    verify(retryOnExceptionPredicate).and(isA(Predicate.class));
    assertNull(actualResilience4jRetryWithRecovery.execute());
  }

  /**
   * Test {@link Resilience4jRetryWithRecovery#Resilience4jRetryWithRecovery(String, String,
   * BdkRetryConfig, SupplierWithApiException, Predicate, List)}.
   *
   * <ul>
   *   <li>Given {@code Exception}.
   * </ul>
   *
   * <p>Method under test: {@link
   * Resilience4jRetryWithRecovery#Resilience4jRetryWithRecovery(String, String, BdkRetryConfig,
   * SupplierWithApiException, Predicate, List)}
   */
  @Test
  @DisplayName(
      "Test new Resilience4jRetryWithRecovery(String, String, BdkRetryConfig, SupplierWithApiException, Predicate, List); given 'java.lang.Exception'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Resilience4jRetryWithRecovery.<init>(String, String, BdkRetryConfig, SupplierWithApiException, Predicate, List)"
  })
  void testNewResilience4jRetryWithRecovery_givenJavaLangException2() throws Throwable {
    // Arrange
    BdkRetryConfig bdkRetryConfig = BdkRetryConfigTestHelper.ofMinimalInterval(3);
    SupplierWithApiException<Object> supplier = mock(SupplierWithApiException.class);
    Predicate<Throwable> retryOnExceptionPredicate = mock(Predicate.class);
    when(retryOnExceptionPredicate.and(Mockito.<Predicate<Throwable>>any()))
        .thenReturn(mock(Predicate.class));

    ArrayList<RecoveryStrategy> recoveryStrategies = new ArrayList<>();
    Class<Exception> exceptionType = Exception.class;
    recoveryStrategies.add(
        new RecoveryStrategy(
            exceptionType, mock(Predicate.class), mock(ConsumerWithThrowable.class)));
    Class<Exception> exceptionType2 = Exception.class;
    recoveryStrategies.add(
        new RecoveryStrategy(
            exceptionType2, mock(Predicate.class), mock(ConsumerWithThrowable.class)));

    // Act
    Resilience4jRetryWithRecovery<Object> actualResilience4jRetryWithRecovery =
        new Resilience4jRetryWithRecovery<>(
            "Name",
            "42 Main St",
            bdkRetryConfig,
            supplier,
            retryOnExceptionPredicate,
            recoveryStrategies);

    // Assert
    verify(retryOnExceptionPredicate).and(isA(Predicate.class));
    assertNull(actualResilience4jRetryWithRecovery.execute());
  }

  /**
   * Test {@link Resilience4jRetryWithRecovery#Resilience4jRetryWithRecovery(String, String,
   * BdkRetryConfig, SupplierWithApiException, Predicate, Predicate, List)}.
   *
   * <ul>
   *   <li>Given {@code Exception}.
   * </ul>
   *
   * <p>Method under test: {@link
   * Resilience4jRetryWithRecovery#Resilience4jRetryWithRecovery(String, String, BdkRetryConfig,
   * SupplierWithApiException, Predicate, Predicate, List)}
   */
  @Test
  @DisplayName(
      "Test new Resilience4jRetryWithRecovery(String, String, BdkRetryConfig, SupplierWithApiException, Predicate, Predicate, List); given 'java.lang.Exception'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Resilience4jRetryWithRecovery.<init>(String, String, BdkRetryConfig, SupplierWithApiException, Predicate, Predicate, List)"
  })
  void testNewResilience4jRetryWithRecovery_givenJavaLangException3() throws Throwable {
    // Arrange
    BdkRetryConfig bdkRetryConfig = BdkRetryConfigTestHelper.ofMinimalInterval(3);
    SupplierWithApiException<Object> supplier = mock(SupplierWithApiException.class);
    Predicate<Throwable> retryOnExceptionPredicate = mock(Predicate.class);
    when(retryOnExceptionPredicate.and(Mockito.<Predicate<Throwable>>any()))
        .thenReturn(mock(Predicate.class));
    Predicate<Exception> ignoreException = mock(Predicate.class);

    ArrayList<RecoveryStrategy> recoveryStrategies = new ArrayList<>();
    Class<Exception> exceptionType = Exception.class;
    recoveryStrategies.add(
        new RecoveryStrategy(
            exceptionType, mock(Predicate.class), mock(ConsumerWithThrowable.class)));

    // Act
    Resilience4jRetryWithRecovery<Object> actualResilience4jRetryWithRecovery =
        new Resilience4jRetryWithRecovery<>(
            "Name",
            "42 Main St",
            bdkRetryConfig,
            supplier,
            retryOnExceptionPredicate,
            ignoreException,
            recoveryStrategies);

    // Assert
    verify(retryOnExceptionPredicate).and(isA(Predicate.class));
    assertNull(actualResilience4jRetryWithRecovery.execute());
  }

  /**
   * Test {@link Resilience4jRetryWithRecovery#Resilience4jRetryWithRecovery(String, String,
   * BdkRetryConfig, SupplierWithApiException, Predicate, Predicate, List)}.
   *
   * <ul>
   *   <li>Given {@code Exception}.
   * </ul>
   *
   * <p>Method under test: {@link
   * Resilience4jRetryWithRecovery#Resilience4jRetryWithRecovery(String, String, BdkRetryConfig,
   * SupplierWithApiException, Predicate, Predicate, List)}
   */
  @Test
  @DisplayName(
      "Test new Resilience4jRetryWithRecovery(String, String, BdkRetryConfig, SupplierWithApiException, Predicate, Predicate, List); given 'java.lang.Exception'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Resilience4jRetryWithRecovery.<init>(String, String, BdkRetryConfig, SupplierWithApiException, Predicate, Predicate, List)"
  })
  void testNewResilience4jRetryWithRecovery_givenJavaLangException4() throws Throwable {
    // Arrange
    BdkRetryConfig bdkRetryConfig = BdkRetryConfigTestHelper.ofMinimalInterval(3);
    SupplierWithApiException<Object> supplier = mock(SupplierWithApiException.class);
    Predicate<Throwable> retryOnExceptionPredicate = mock(Predicate.class);
    when(retryOnExceptionPredicate.and(Mockito.<Predicate<Throwable>>any()))
        .thenReturn(mock(Predicate.class));
    Predicate<Exception> ignoreException = mock(Predicate.class);

    ArrayList<RecoveryStrategy> recoveryStrategies = new ArrayList<>();
    Class<Exception> exceptionType = Exception.class;
    recoveryStrategies.add(
        new RecoveryStrategy(
            exceptionType, mock(Predicate.class), mock(ConsumerWithThrowable.class)));
    Class<Exception> exceptionType2 = Exception.class;
    recoveryStrategies.add(
        new RecoveryStrategy(
            exceptionType2, mock(Predicate.class), mock(ConsumerWithThrowable.class)));

    // Act
    Resilience4jRetryWithRecovery<Object> actualResilience4jRetryWithRecovery =
        new Resilience4jRetryWithRecovery<>(
            "Name",
            "42 Main St",
            bdkRetryConfig,
            supplier,
            retryOnExceptionPredicate,
            ignoreException,
            recoveryStrategies);

    // Assert
    verify(retryOnExceptionPredicate).and(isA(Predicate.class));
    assertNull(actualResilience4jRetryWithRecovery.execute());
  }

  /**
   * Test {@link Resilience4jRetryWithRecovery#Resilience4jRetryWithRecovery(String, String,
   * BdkRetryConfig, SupplierWithApiException, Predicate, List)}.
   *
   * <ul>
   *   <li>Then return execute is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * Resilience4jRetryWithRecovery#Resilience4jRetryWithRecovery(String, String, BdkRetryConfig,
   * SupplierWithApiException, Predicate, List)}
   */
  @Test
  @DisplayName(
      "Test new Resilience4jRetryWithRecovery(String, String, BdkRetryConfig, SupplierWithApiException, Predicate, List); then return execute is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Resilience4jRetryWithRecovery.<init>(String, String, BdkRetryConfig, SupplierWithApiException, Predicate, List)"
  })
  void testNewResilience4jRetryWithRecovery_thenReturnExecuteIsNull() throws Throwable {
    // Arrange
    BdkRetryConfig bdkRetryConfig = BdkRetryConfigTestHelper.ofMinimalInterval(3);
    SupplierWithApiException<Object> supplier = mock(SupplierWithApiException.class);
    Predicate<Throwable> retryOnExceptionPredicate = mock(Predicate.class);
    when(retryOnExceptionPredicate.and(Mockito.<Predicate<Throwable>>any()))
        .thenReturn(mock(Predicate.class));

    // Act
    Resilience4jRetryWithRecovery<Object> actualResilience4jRetryWithRecovery =
        new Resilience4jRetryWithRecovery<>(
            "Name",
            "42 Main St",
            bdkRetryConfig,
            supplier,
            retryOnExceptionPredicate,
            new ArrayList<>());

    // Assert
    verify(retryOnExceptionPredicate).and(isA(Predicate.class));
    assertNull(actualResilience4jRetryWithRecovery.execute());
  }

  /**
   * Test {@link Resilience4jRetryWithRecovery#Resilience4jRetryWithRecovery(String, String,
   * BdkRetryConfig, SupplierWithApiException, Predicate, Predicate, List)}.
   *
   * <ul>
   *   <li>Then return execute is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * Resilience4jRetryWithRecovery#Resilience4jRetryWithRecovery(String, String, BdkRetryConfig,
   * SupplierWithApiException, Predicate, Predicate, List)}
   */
  @Test
  @DisplayName(
      "Test new Resilience4jRetryWithRecovery(String, String, BdkRetryConfig, SupplierWithApiException, Predicate, Predicate, List); then return execute is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Resilience4jRetryWithRecovery.<init>(String, String, BdkRetryConfig, SupplierWithApiException, Predicate, Predicate, List)"
  })
  void testNewResilience4jRetryWithRecovery_thenReturnExecuteIsNull2() throws Throwable {
    // Arrange
    BdkRetryConfig bdkRetryConfig = BdkRetryConfigTestHelper.ofMinimalInterval(3);
    SupplierWithApiException<Object> supplier = mock(SupplierWithApiException.class);
    Predicate<Throwable> retryOnExceptionPredicate = mock(Predicate.class);
    when(retryOnExceptionPredicate.and(Mockito.<Predicate<Throwable>>any()))
        .thenReturn(mock(Predicate.class));
    Predicate<Exception> ignoreException = mock(Predicate.class);

    // Act
    Resilience4jRetryWithRecovery<Object> actualResilience4jRetryWithRecovery =
        new Resilience4jRetryWithRecovery<>(
            "Name",
            "42 Main St",
            bdkRetryConfig,
            supplier,
            retryOnExceptionPredicate,
            ignoreException,
            new ArrayList<>());

    // Assert
    verify(retryOnExceptionPredicate).and(isA(Predicate.class));
    assertNull(actualResilience4jRetryWithRecovery.execute());
  }

  /**
   * Test {@link Resilience4jRetryWithRecovery#execute()}.
   *
   * <p>Method under test: {@link Resilience4jRetryWithRecovery#execute()}
   */
  @Test
  @DisplayName("Test execute()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Resilience4jRetryWithRecovery.execute()"})
  void testExecute() throws Throwable {
    // Arrange
    SupplierWithApiException<Object> supplier = mock(SupplierWithApiException.class);
    when(supplier.get()).thenReturn("Get");
    Predicate<Throwable> retryOnExceptionPredicate = mock(Predicate.class);
    when(retryOnExceptionPredicate.and(Mockito.<Predicate<Throwable>>any()))
        .thenReturn(mock(Predicate.class));
    BdkRetryConfig bdkRetryConfig = BdkRetryConfigTestHelper.ofMinimalInterval(3);
    Resilience4jRetryWithRecovery<Object> resilience4jRetryWithRecovery =
        new Resilience4jRetryWithRecovery<>(
            "Name",
            "42 Main St",
            bdkRetryConfig,
            supplier,
            retryOnExceptionPredicate,
            new ArrayList<>());

    // Act
    Object actualExecuteResult = resilience4jRetryWithRecovery.execute();

    // Assert
    verify(supplier).get();
    verify(retryOnExceptionPredicate).and(isA(Predicate.class));
    assertEquals("Get", actualExecuteResult);
  }
}
