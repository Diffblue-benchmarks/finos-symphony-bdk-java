package com.symphony.bdk.core.retry;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.retry.function.ConsumerWithThrowable;
import com.symphony.bdk.core.retry.resilience4j.Resilience4jRetryWithRecovery;
import java.util.function.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RetryWithRecoveryBuilderDiffblueTest {
  /**
   * Test new {@link RetryWithRecoveryBuilder} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link RetryWithRecoveryBuilder}
   */
  @Test
  @DisplayName("Test new RetryWithRecoveryBuilder (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void RetryWithRecoveryBuilder.<init>()"})
  void testNewRetryWithRecoveryBuilder() {
    // Arrange and Act
    RetryWithRecoveryBuilder<Object> actualRetryWithRecoveryBuilder = new RetryWithRecoveryBuilder<>();

    // Assert
    assertTrue(actualRetryWithRecoveryBuilder.build() instanceof Resilience4jRetryWithRecovery);
  }

  /**
   * Test {@link RetryWithRecoveryBuilder#from(RetryWithRecoveryBuilder)}.
   * <ul>
   *   <li>Then build return {@link Resilience4jRetryWithRecovery}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RetryWithRecoveryBuilder#from(RetryWithRecoveryBuilder)}
   */
  @Test
  @DisplayName("Test from(RetryWithRecoveryBuilder); then build return Resilience4jRetryWithRecovery")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"RetryWithRecoveryBuilder RetryWithRecoveryBuilder.from(RetryWithRecoveryBuilder)"})
  void testFrom_thenBuildReturnResilience4jRetryWithRecovery() {
    // Arrange and Act
    RetryWithRecoveryBuilder<Object> actualFromResult = RetryWithRecoveryBuilder.from(new RetryWithRecoveryBuilder<>());

    // Assert
    assertTrue(actualFromResult.build() instanceof Resilience4jRetryWithRecovery);
  }

  /**
   * Test {@link RetryWithRecoveryBuilder#copyWithoutRecoveryStrategies(RetryWithRecoveryBuilder)}.
   * <ul>
   *   <li>Then build return {@link Resilience4jRetryWithRecovery}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RetryWithRecoveryBuilder#copyWithoutRecoveryStrategies(RetryWithRecoveryBuilder)}
   */
  @Test
  @DisplayName("Test copyWithoutRecoveryStrategies(RetryWithRecoveryBuilder); then build return Resilience4jRetryWithRecovery")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "RetryWithRecoveryBuilder RetryWithRecoveryBuilder.copyWithoutRecoveryStrategies(RetryWithRecoveryBuilder)"})
  void testCopyWithoutRecoveryStrategies_thenBuildReturnResilience4jRetryWithRecovery() {
    // Arrange and Act
    RetryWithRecoveryBuilder<Object> actualCopyWithoutRecoveryStrategiesResult = RetryWithRecoveryBuilder
        .copyWithoutRecoveryStrategies(new RetryWithRecoveryBuilder<>());

    // Assert
    assertTrue(actualCopyWithoutRecoveryStrategiesResult.build() instanceof Resilience4jRetryWithRecovery);
  }

  /**
   * Test {@link RetryWithRecoveryBuilder#isNetworkIssueOrMinorError(Throwable)}.
   * <p>
   * Method under test: {@link RetryWithRecoveryBuilder#isNetworkIssueOrMinorError(Throwable)}
   */
  @Test
  @DisplayName("Test isNetworkIssueOrMinorError(Throwable)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RetryWithRecoveryBuilder.isNetworkIssueOrMinorError(Throwable)"})
  void testIsNetworkIssueOrMinorError() {
    // Arrange, Act and Assert
    assertFalse(RetryWithRecoveryBuilder.isNetworkIssueOrMinorError(new Throwable()));
  }

  /**
   * Test {@link RetryWithRecoveryBuilder#isNetworkIssueOrMinorErrorOrClientError(Throwable)}.
   * <p>
   * Method under test: {@link RetryWithRecoveryBuilder#isNetworkIssueOrMinorErrorOrClientError(Throwable)}
   */
  @Test
  @DisplayName("Test isNetworkIssueOrMinorErrorOrClientError(Throwable)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean RetryWithRecoveryBuilder.isNetworkIssueOrMinorErrorOrClientError(Throwable)"})
  void testIsNetworkIssueOrMinorErrorOrClientError() {
    // Arrange, Act and Assert
    assertFalse(RetryWithRecoveryBuilder.isNetworkIssueOrMinorErrorOrClientError(new Throwable()));
  }

  /**
   * Test {@link RetryWithRecoveryBuilder#ignoreException(Predicate)}.
   * <p>
   * Method under test: {@link RetryWithRecoveryBuilder#ignoreException(Predicate)}
   */
  @Test
  @DisplayName("Test ignoreException(Predicate)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"RetryWithRecoveryBuilder RetryWithRecoveryBuilder.ignoreException(Predicate)"})
  void testIgnoreException() {
    // Arrange
    RetryWithRecoveryBuilder<Object> retryWithRecoveryBuilder = new RetryWithRecoveryBuilder<>();

    // Act and Assert
    assertSame(retryWithRecoveryBuilder, retryWithRecoveryBuilder.ignoreException(mock(Predicate.class)));
  }

  /**
   * Test {@link RetryWithRecoveryBuilder#recoveryStrategy(Predicate, ConsumerWithThrowable)} with {@code condition}, {@code recovery}.
   * <p>
   * Method under test: {@link RetryWithRecoveryBuilder#recoveryStrategy(Predicate, ConsumerWithThrowable)}
   */
  @Test
  @DisplayName("Test recoveryStrategy(Predicate, ConsumerWithThrowable) with 'condition', 'recovery'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "RetryWithRecoveryBuilder RetryWithRecoveryBuilder.recoveryStrategy(Predicate, ConsumerWithThrowable)"})
  void testRecoveryStrategyWithConditionRecovery() {
    // Arrange
    RetryWithRecoveryBuilder<Object> retryWithRecoveryBuilder = new RetryWithRecoveryBuilder<>();

    // Act and Assert
    assertSame(retryWithRecoveryBuilder,
        retryWithRecoveryBuilder.recoveryStrategy(mock(Predicate.class), mock(ConsumerWithThrowable.class)));
  }

  /**
   * Test {@link RetryWithRecoveryBuilder#recoveryStrategy(Class, ConsumerWithThrowable)} with {@code exceptionType}, {@code recovery}.
   * <p>
   * Method under test: {@link RetryWithRecoveryBuilder#recoveryStrategy(Class, ConsumerWithThrowable)}
   */
  @Test
  @DisplayName("Test recoveryStrategy(Class, ConsumerWithThrowable) with 'exceptionType', 'recovery'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "RetryWithRecoveryBuilder RetryWithRecoveryBuilder.recoveryStrategy(Class, ConsumerWithThrowable)"})
  void testRecoveryStrategyWithExceptionTypeRecovery() {
    // Arrange
    RetryWithRecoveryBuilder<Object> retryWithRecoveryBuilder = new RetryWithRecoveryBuilder<>();
    Class<Exception> exceptionType = Exception.class;

    // Act and Assert
    assertSame(retryWithRecoveryBuilder,
        retryWithRecoveryBuilder.recoveryStrategy(exceptionType, mock(ConsumerWithThrowable.class)));
  }

  /**
   * Test {@link RetryWithRecoveryBuilder#clearRecoveryStrategies()}.
   * <p>
   * Method under test: {@link RetryWithRecoveryBuilder#clearRecoveryStrategies()}
   */
  @Test
  @DisplayName("Test clearRecoveryStrategies()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"RetryWithRecoveryBuilder RetryWithRecoveryBuilder.clearRecoveryStrategies()"})
  void testClearRecoveryStrategies() {
    // Arrange
    RetryWithRecoveryBuilder<Object> retryWithRecoveryBuilder = new RetryWithRecoveryBuilder<>();

    // Act and Assert
    assertSame(retryWithRecoveryBuilder, retryWithRecoveryBuilder.clearRecoveryStrategies());
  }
}
