package com.symphony.bdk.core.service.stream.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class StreamUtilDiffblueTest {
  /**
   * Test {@link StreamUtil#toUrlSafeStreamId(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link StreamUtil#toUrlSafeStreamId(String)}
   */
  @Test
  @DisplayName("Test toUrlSafeStreamId(String); when '42'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String StreamUtil.toUrlSafeStreamId(String)"})
  void testToUrlSafeStreamId_when42_thenReturn42() {
    // Arrange, Act and Assert
    assertEquals("42", StreamUtil.toUrlSafeStreamId("42"));
  }

  /**
   * Test {@link StreamUtil#toUrlSafeStreamId(String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link StreamUtil#toUrlSafeStreamId(String)}
   */
  @Test
  @DisplayName("Test toUrlSafeStreamId(String); when empty string; then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String StreamUtil.toUrlSafeStreamId(String)"})
  void testToUrlSafeStreamId_whenEmptyString_thenReturnEmptyString() {
    // Arrange, Act and Assert
    assertEquals("", StreamUtil.toUrlSafeStreamId(""));
  }

  /**
   * Test {@link StreamUtil#toUrlSafeStreamId(String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link StreamUtil#toUrlSafeStreamId(String)}
   */
  @Test
  @DisplayName("Test toUrlSafeStreamId(String); when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String StreamUtil.toUrlSafeStreamId(String)"})
  void testToUrlSafeStreamId_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(StreamUtil.toUrlSafeStreamId(null));
  }

  /**
   * Test {@link StreamUtil#fromUrlSafeStreamId(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return {@code 4w==}.
   * </ul>
   *
   * <p>Method under test: {@link StreamUtil#fromUrlSafeStreamId(String)}
   */
  @Test
  @DisplayName("Test fromUrlSafeStreamId(String); when '42'; then return '4w=='")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String StreamUtil.fromUrlSafeStreamId(String)"})
  void testFromUrlSafeStreamId_when42_thenReturn4w() {
    // Arrange, Act and Assert
    assertEquals("4w==", StreamUtil.fromUrlSafeStreamId("42"));
  }
}
