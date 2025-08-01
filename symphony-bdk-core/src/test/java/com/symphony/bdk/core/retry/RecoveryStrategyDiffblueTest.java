package com.symphony.bdk.core.retry;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.retry.function.ConsumerWithThrowable;
import java.util.function.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class RecoveryStrategyDiffblueTest {
  /**
   * Test {@link RecoveryStrategy#matches(Exception)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>When {@link Exception#Exception()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link RecoveryStrategy#matches(Exception)}
   */
  @Test
  @DisplayName(
      "Test matches(Exception); given Predicate test(Object) return 'false'; when Exception(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RecoveryStrategy.matches(Exception)"})
  void testMatches_givenPredicateTestReturnFalse_whenException_thenReturnFalse() {
    // Arrange
    Predicate<Exception> condition = mock(Predicate.class);
    when(condition.test(Mockito.<Exception>any())).thenReturn(false);
    Class<Exception> exceptionType = Exception.class;
    RecoveryStrategy recoveryStrategy =
        new RecoveryStrategy(exceptionType, condition, mock(ConsumerWithThrowable.class));

    // Act
    boolean actualMatchesResult = recoveryStrategy.matches(new Exception());

    // Assert
    verify(condition).test(isA(Exception.class));
    assertFalse(actualMatchesResult);
  }

  /**
   * Test {@link RecoveryStrategy#matches(Exception)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>When {@link Exception#Exception()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link RecoveryStrategy#matches(Exception)}
   */
  @Test
  @DisplayName(
      "Test matches(Exception); given Predicate test(Object) return 'true'; when Exception(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RecoveryStrategy.matches(Exception)"})
  void testMatches_givenPredicateTestReturnTrue_whenException_thenReturnTrue() {
    // Arrange
    Predicate<Exception> condition = mock(Predicate.class);
    when(condition.test(Mockito.<Exception>any())).thenReturn(true);
    Class<Exception> exceptionType = Exception.class;
    RecoveryStrategy recoveryStrategy =
        new RecoveryStrategy(exceptionType, condition, mock(ConsumerWithThrowable.class));

    // Act
    boolean actualMatchesResult = recoveryStrategy.matches(new Exception());

    // Assert
    verify(condition).test(isA(Exception.class));
    assertTrue(actualMatchesResult);
  }

  /**
   * Test {@link RecoveryStrategy#runRecovery()}.
   *
   * <ul>
   *   <li>Given {@link ConsumerWithThrowable} {@link ConsumerWithThrowable#consume()} does nothing.
   * </ul>
   *
   * <p>Method under test: {@link RecoveryStrategy#runRecovery()}
   */
  @Test
  @DisplayName("Test runRecovery(); given ConsumerWithThrowable consume() does nothing")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RecoveryStrategy.runRecovery()"})
  void testRunRecovery_givenConsumerWithThrowableConsumeDoesNothing() throws Throwable {
    // Arrange
    ConsumerWithThrowable recovery = mock(ConsumerWithThrowable.class);
    doNothing().when(recovery).consume();
    Class<Exception> exceptionType = Exception.class;

    // Act
    new RecoveryStrategy(exceptionType, mock(Predicate.class), recovery).runRecovery();

    // Assert
    verify(recovery).consume();
  }

  /**
   * Test {@link RecoveryStrategy#runRecovery()}.
   *
   * <ul>
   *   <li>Then throw {@link Exception}.
   * </ul>
   *
   * <p>Method under test: {@link RecoveryStrategy#runRecovery()}
   */
  @Test
  @DisplayName("Test runRecovery(); then throw Exception")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RecoveryStrategy.runRecovery()"})
  void testRunRecovery_thenThrowException() throws Throwable {
    // Arrange
    ConsumerWithThrowable recovery = mock(ConsumerWithThrowable.class);
    doThrow(new Exception()).when(recovery).consume();
    Class<Exception> exceptionType = Exception.class;

    // Act and Assert
    assertThrows(
        Exception.class,
        () -> new RecoveryStrategy(exceptionType, mock(Predicate.class), recovery).runRecovery());
    verify(recovery).consume();
  }
}
