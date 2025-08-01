package com.symphony.bdk.core.service.datafeed;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DatafeedVersionDiffblueTest {
  /**
   * Test {@link DatafeedVersion#of(String)}.
   *
   * <ul>
   *   <li>When {@code 1.0.2}.
   *   <li>Then return {@code V1}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedVersion#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when '1.0.2'; then return 'V1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DatafeedVersion DatafeedVersion.of(String)"})
  void testOf_when102_thenReturnV1() {
    // Arrange, Act and Assert
    assertEquals(DatafeedVersion.V1, DatafeedVersion.of("1.0.2"));
  }

  /**
   * Test {@link DatafeedVersion#of(String)}.
   *
   * <ul>
   *   <li>When {@code v2}.
   *   <li>Then return {@code V2}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedVersion#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'v2'; then return 'V2'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DatafeedVersion DatafeedVersion.of(String)"})
  void testOf_whenV2_thenReturnV2() {
    // Arrange, Act and Assert
    assertEquals(DatafeedVersion.V2, DatafeedVersion.of("v2"));
  }
}
