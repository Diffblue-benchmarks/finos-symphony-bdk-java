package com.symphony.bdk.core.activity;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ThreadFactoryBuilderDiffblueTest {
  /**
   * Test {@link ThreadFactoryBuilder#setPriority(int)}.
   *
   * <ul>
   *   <li>When eleven.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ThreadFactoryBuilder#setPriority(int)}
   */
  @Test
  @DisplayName("Test setPriority(int); when eleven; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ThreadFactoryBuilder ThreadFactoryBuilder.setPriority(int)"})
  void testSetPriority_whenEleven_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new ThreadFactoryBuilder().setPriority(11));
  }

  /**
   * Test {@link ThreadFactoryBuilder#setPriority(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@link ThreadFactoryBuilder} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link ThreadFactoryBuilder#setPriority(int)}
   */
  @Test
  @DisplayName(
      "Test setPriority(int); when one; then return ThreadFactoryBuilder (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ThreadFactoryBuilder ThreadFactoryBuilder.setPriority(int)"})
  void testSetPriority_whenOne_thenReturnThreadFactoryBuilder() {
    // Arrange
    ThreadFactoryBuilder threadFactoryBuilder = new ThreadFactoryBuilder();

    // Act
    ThreadFactoryBuilder actualSetPriorityResult = threadFactoryBuilder.setPriority(1);

    // Assert
    assertSame(threadFactoryBuilder, actualSetPriorityResult);
  }

  /**
   * Test {@link ThreadFactoryBuilder#setPriority(int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ThreadFactoryBuilder#setPriority(int)}
   */
  @Test
  @DisplayName("Test setPriority(int); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ThreadFactoryBuilder ThreadFactoryBuilder.setPriority(int)"})
  void testSetPriority_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new ThreadFactoryBuilder().setPriority(0));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link ThreadFactoryBuilder}
   *   <li>{@link ThreadFactoryBuilder#setName(String)}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ThreadFactoryBuilder.<init>()",
    "ThreadFactoryBuilder ThreadFactoryBuilder.setName(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    ThreadFactoryBuilder actualThreadFactoryBuilder = new ThreadFactoryBuilder();
    ThreadFactoryBuilder actualSetNameResult = actualThreadFactoryBuilder.setName("Name");

    // Assert
    assertSame(actualThreadFactoryBuilder, actualSetNameResult);
  }
}
