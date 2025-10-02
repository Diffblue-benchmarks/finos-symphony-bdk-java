package com.symphony.bdk.spring.config;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.config.model.BdkRetryConfig;
import com.symphony.bdk.core.service.datafeed.DatafeedVersion;
import com.symphony.bdk.spring.SymphonyBdkCoreProperties;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkDatafeedConfigDiffblueTest {
  /**
   * Test {@link BdkDatafeedConfig#datafeedVersion(SymphonyBdkCoreProperties)}.
   *
   * <ul>
   *   <li>Then return {@code V1}.
   * </ul>
   *
   * <p>Method under test: {@link BdkDatafeedConfig#datafeedVersion(SymphonyBdkCoreProperties)}
   */
  @Test
  @DisplayName("Test datafeedVersion(SymphonyBdkCoreProperties); then return 'V1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DatafeedVersion BdkDatafeedConfig.datafeedVersion(SymphonyBdkCoreProperties)"
  })
  void testDatafeedVersion_thenReturnV1() {
    // Arrange
    BdkDatafeedConfig bdkDatafeedConfig = new BdkDatafeedConfig();

    com.symphony.bdk.core.config.model.BdkDatafeedConfig datafeed =
        new com.symphony.bdk.core.config.model.BdkDatafeedConfig();
    datafeed.setIdFilePath("/directory/foo.txt");
    datafeed.setRetry(new BdkRetryConfig());
    datafeed.setVersion("1.0.2");

    SymphonyBdkCoreProperties properties = new SymphonyBdkCoreProperties();
    properties.setDatafeed(datafeed);

    // Act and Assert
    assertEquals(DatafeedVersion.V1, bdkDatafeedConfig.datafeedVersion(properties));
  }

  /**
   * Test {@link BdkDatafeedConfig#datafeedVersion(SymphonyBdkCoreProperties)}.
   *
   * <ul>
   *   <li>When {@link SymphonyBdkCoreProperties} (default constructor).
   *   <li>Then return {@code V2}.
   * </ul>
   *
   * <p>Method under test: {@link BdkDatafeedConfig#datafeedVersion(SymphonyBdkCoreProperties)}
   */
  @Test
  @DisplayName(
      "Test datafeedVersion(SymphonyBdkCoreProperties); when SymphonyBdkCoreProperties (default constructor); then return 'V2'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DatafeedVersion BdkDatafeedConfig.datafeedVersion(SymphonyBdkCoreProperties)"
  })
  void testDatafeedVersion_whenSymphonyBdkCoreProperties_thenReturnV2() {
    // Arrange
    BdkDatafeedConfig bdkDatafeedConfig = new BdkDatafeedConfig();

    // Act and Assert
    assertEquals(
        DatafeedVersion.V2, bdkDatafeedConfig.datafeedVersion(new SymphonyBdkCoreProperties()));
  }
}
