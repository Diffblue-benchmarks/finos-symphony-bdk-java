package com.symphony.bdk.core.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.util.UserIdUtil.LongUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserIdUtilDiffblueTest {
  /**
   * Test {@link UserIdUtil#extractTenantId(long)}.
   *
   * <p>Method under test: {@link UserIdUtil#extractTenantId(long)}
   */
  @Test
  @DisplayName("Test extractTenantId(long)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int UserIdUtil.extractTenantId(long)"})
  void testExtractTenantId() {
    // Arrange, Act and Assert
    assertEquals(0, UserIdUtil.extractTenantId(1L));
  }

  /**
   * Test LongUtil {@link LongUtil#extract(long, int)}.
   *
   * <ul>
   *   <li>Given {@link LongUtil#LongUtil(int[])} with sizes is three and one.
   *   <li>When five.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link LongUtil#extract(long, int)}
   */
  @Test
  @DisplayName(
      "Test LongUtil extract(long, int); given LongUtil(int[]) with sizes is three and one; when five; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long LongUtil.extract(long, int)"})
  void testLongUtilExtract_givenLongUtilWithSizesIsThreeAndOne_whenFive_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0L, new LongUtil(3, 1, 3, 1).extract(5L, 1));
  }

  /**
   * Test LongUtil {@link LongUtil#extract(long, int)}.
   *
   * <ul>
   *   <li>Given {@link LongUtil#LongUtil(int[])} with sizes is three and one.
   *   <li>When one.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link LongUtil#extract(long, int)}
   */
  @Test
  @DisplayName(
      "Test LongUtil extract(long, int); given LongUtil(int[]) with sizes is three and one; when one; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long LongUtil.extract(long, int)"})
  void testLongUtilExtract_givenLongUtilWithSizesIsThreeAndOne_whenOne_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0L, new LongUtil(3, 1, 3, 1).extract(1L, 1));
  }

  /**
   * Test LongUtil {@link LongUtil#extract(long, int)}.
   *
   * <ul>
   *   <li>Given {@link LongUtil#LongUtil(int[])} with sizes is three and one.
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link LongUtil#extract(long, int)}
   */
  @Test
  @DisplayName(
      "Test LongUtil extract(long, int); given LongUtil(int[]) with sizes is three and one; when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long LongUtil.extract(long, int)"})
  void testLongUtilExtract_givenLongUtilWithSizesIsThreeAndOne_whenZero_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0L, new LongUtil(3, 1, 3, 1).extract(0L, 1));
  }

  /**
   * Test LongUtil {@link LongUtil#extract(long, int)}.
   *
   * <ul>
   *   <li>When forty-two.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link LongUtil#extract(long, int)}
   */
  @Test
  @DisplayName("Test LongUtil extract(long, int); when forty-two; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long LongUtil.extract(long, int)"})
  void testLongUtilExtract_whenFortyTwo_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1L, new LongUtil(3, 1, 3, 1).extract(42L, 1));
  }

  /**
   * Test LongUtil {@link LongUtil#LongUtil(int[])}.
   *
   * <ul>
   *   <li>When {@link Double#SIZE} and one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link LongUtil#LongUtil(int[])}
   */
  @Test
  @DisplayName(
      "Test LongUtil new LongUtil(int[]); when SIZE and one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LongUtil.<init>(int[])"})
  void testLongUtilNewLongUtil_whenSizeAndOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LongUtil(Double.SIZE, 1, 3, 1));
  }

  /**
   * Test LongUtil {@link LongUtil#LongUtil(int[])}.
   *
   * <ul>
   *   <li>When three and one.
   *   <li>Then return extract forty-two and one is one.
   * </ul>
   *
   * <p>Method under test: {@link LongUtil#LongUtil(int[])}
   */
  @Test
  @DisplayName(
      "Test LongUtil new LongUtil(int[]); when three and one; then return extract forty-two and one is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LongUtil.<init>(int[])"})
  void testLongUtilNewLongUtil_whenThreeAndOne_thenReturnExtractFortyTwoAndOneIsOne() {
    // Arrange, Act and Assert
    assertEquals(1L, new LongUtil(3, 1, 3, 1).extract(42L, 1));
  }
}
