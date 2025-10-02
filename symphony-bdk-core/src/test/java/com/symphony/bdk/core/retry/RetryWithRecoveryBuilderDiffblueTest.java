package com.symphony.bdk.core.retry;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.retry.resilience4j.Resilience4jRetryWithRecovery;
import java.util.function.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RetryWithRecoveryBuilderDiffblueTest {
  /**
   * Test new {@link RetryWithRecoveryBuilder} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link RetryWithRecoveryBuilder}
   */
  @Test
  @DisplayName("Test new RetryWithRecoveryBuilder (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RetryWithRecoveryBuilder.<init>()"})
  void testNewRetryWithRecoveryBuilder() {
    // Arrange and Act
    RetryWithRecoveryBuilder<Object> actualRetryWithRecoveryBuilder =
        new RetryWithRecoveryBuilder<>();

    // Assert
    RetryWithRecovery<Object> retryWithRecovery = actualRetryWithRecoveryBuilder.build();
    assertTrue(retryWithRecovery instanceof Resilience4jRetryWithRecovery);
  }

  /**
   * Test {@link RetryWithRecoveryBuilder#from(RetryWithRecoveryBuilder)}.
   *
   * <ul>
   *   <li>Then build return {@link Resilience4jRetryWithRecovery}.
   * </ul>
   *
   * <p>Method under test: {@link RetryWithRecoveryBuilder#from(RetryWithRecoveryBuilder)}
   */
  @Test
  @DisplayName(
      "Test from(RetryWithRecoveryBuilder); then build return Resilience4jRetryWithRecovery")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RetryWithRecoveryBuilder RetryWithRecoveryBuilder.from(RetryWithRecoveryBuilder)"
  })
  void testFrom_thenBuildReturnResilience4jRetryWithRecovery() {
    // Arrange and Act
    RetryWithRecoveryBuilder<Object> actualFromResult =
        RetryWithRecoveryBuilder.from(new RetryWithRecoveryBuilder<>());

    // Assert
    RetryWithRecovery<Object> retryWithRecovery = actualFromResult.build();
    assertTrue(retryWithRecovery instanceof Resilience4jRetryWithRecovery);
  }

  /**
   * Test {@link RetryWithRecoveryBuilder#copyWithoutRecoveryStrategies(RetryWithRecoveryBuilder)}.
   *
   * <ul>
   *   <li>Then build return {@link Resilience4jRetryWithRecovery}.
   * </ul>
   *
   * <p>Method under test: {@link
   * RetryWithRecoveryBuilder#copyWithoutRecoveryStrategies(RetryWithRecoveryBuilder)}
   */
  @Test
  @DisplayName(
      "Test copyWithoutRecoveryStrategies(RetryWithRecoveryBuilder); then build return Resilience4jRetryWithRecovery")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RetryWithRecoveryBuilder RetryWithRecoveryBuilder.copyWithoutRecoveryStrategies(RetryWithRecoveryBuilder)"
  })
  void testCopyWithoutRecoveryStrategies_thenBuildReturnResilience4jRetryWithRecovery() {
    // Arrange and Act
    RetryWithRecoveryBuilder<Object> actualCopyWithoutRecoveryStrategiesResult =
        RetryWithRecoveryBuilder.copyWithoutRecoveryStrategies(new RetryWithRecoveryBuilder<>());

    // Assert
    RetryWithRecovery<Object> retryWithRecovery = actualCopyWithoutRecoveryStrategiesResult.build();
    assertTrue(retryWithRecovery instanceof Resilience4jRetryWithRecovery);
  }

  /**
   * Test {@link RetryWithRecoveryBuilder#ignoreException(Predicate)}.
   *
   * <p>Method under test: {@link RetryWithRecoveryBuilder#ignoreException(Predicate)}
   */
  @Test
  @DisplayName("Test ignoreException(Predicate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RetryWithRecoveryBuilder RetryWithRecoveryBuilder.ignoreException(Predicate)"
  })
  void testIgnoreException() {
    // Arrange
    RetryWithRecoveryBuilder<Object> retryWithRecoveryBuilder = new RetryWithRecoveryBuilder<>();

    // Act
    RetryWithRecoveryBuilder<Object> actualIgnoreExceptionResult =
        retryWithRecoveryBuilder.ignoreException(mock(Predicate.class));

    // Assert
    assertSame(retryWithRecoveryBuilder, actualIgnoreExceptionResult);
  }

  /**
   * Test {@link RetryWithRecoveryBuilder#clearRecoveryStrategies()}.
   *
   * <p>Method under test: {@link RetryWithRecoveryBuilder#clearRecoveryStrategies()}
   */
  @Test
  @DisplayName("Test clearRecoveryStrategies()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RetryWithRecoveryBuilder RetryWithRecoveryBuilder.clearRecoveryStrategies()"})
  void testClearRecoveryStrategies() {
    // Arrange
    RetryWithRecoveryBuilder<Object> retryWithRecoveryBuilder = new RetryWithRecoveryBuilder<>();

    // Act
    RetryWithRecoveryBuilder<Object> actualClearRecoveryStrategiesResult =
        retryWithRecoveryBuilder.clearRecoveryStrategies();

    // Assert
    assertSame(retryWithRecoveryBuilder, actualClearRecoveryStrategiesResult);
  }
}
