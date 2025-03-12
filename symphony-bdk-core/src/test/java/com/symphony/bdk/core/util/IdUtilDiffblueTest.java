package com.symphony.bdk.core.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IdUtilDiffblueTest {
  /**
   * Test {@link IdUtil#toUrlSafeIdIfNeeded(String)}.
   * <ul>
   *   <li>When {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IdUtil#toUrlSafeIdIfNeeded(String)}
   */
  @Test
  @DisplayName("Test toUrlSafeIdIfNeeded(String); when '42'; then return '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String IdUtil.toUrlSafeIdIfNeeded(String)"})
  void testToUrlSafeIdIfNeeded_when42_thenReturn42() {
    // Arrange, Act and Assert
    assertEquals("42", IdUtil.toUrlSafeIdIfNeeded("42"));
  }

  /**
   * Test {@link IdUtil#toUrlSafeIdIfNeeded(String)}.
   * <ul>
   *   <li>When empty string.</li>
   *   <li>Then return empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link IdUtil#toUrlSafeIdIfNeeded(String)}
   */
  @Test
  @DisplayName("Test toUrlSafeIdIfNeeded(String); when empty string; then return empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String IdUtil.toUrlSafeIdIfNeeded(String)"})
  void testToUrlSafeIdIfNeeded_whenEmptyString_thenReturnEmptyString() {
    // Arrange, Act and Assert
    assertEquals("", IdUtil.toUrlSafeIdIfNeeded(""));
  }

  /**
   * Test {@link IdUtil#toUrlSafeIdIfNeeded(String)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IdUtil#toUrlSafeIdIfNeeded(String)}
   */
  @Test
  @DisplayName("Test toUrlSafeIdIfNeeded(String); when 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String IdUtil.toUrlSafeIdIfNeeded(String)"})
  void testToUrlSafeIdIfNeeded_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(IdUtil.toUrlSafeIdIfNeeded(null));
  }

  /**
   * Test {@link IdUtil#toUrlSafeId(String)}.
   * <ul>
   *   <li>When {@code 42}.</li>
   *   <li>Then return {@code 4w}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IdUtil#toUrlSafeId(String)}
   */
  @Test
  @DisplayName("Test toUrlSafeId(String); when '42'; then return '4w'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String IdUtil.toUrlSafeId(String)"})
  void testToUrlSafeId_when42_thenReturn4w() {
    // Arrange, Act and Assert
    assertEquals("4w", IdUtil.toUrlSafeId("42"));
  }

  /**
   * Test {@link IdUtil#fromUrlSafeId(String)}.
   * <ul>
   *   <li>When {@code 42}.</li>
   *   <li>Then return {@code 4w==}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IdUtil#fromUrlSafeId(String)}
   */
  @Test
  @DisplayName("Test fromUrlSafeId(String); when '42'; then return '4w=='")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String IdUtil.fromUrlSafeId(String)"})
  void testFromUrlSafeId_when42_thenReturn4w() {
    // Arrange, Act and Assert
    assertEquals("4w==", IdUtil.fromUrlSafeId("42"));
  }
}
