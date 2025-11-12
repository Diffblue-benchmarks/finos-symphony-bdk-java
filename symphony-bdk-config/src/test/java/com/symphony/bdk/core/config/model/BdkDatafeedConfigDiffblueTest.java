package com.symphony.bdk.core.config.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkDatafeedConfigDiffblueTest {
  /**
   * Test {@link BdkDatafeedConfig#setVersion(String)}.
   *
   * <ul>
   *   <li>When {@code 1.0.2}.
   *   <li>Then {@link BdkDatafeedConfig} (default constructor) Version is {@code 1.0.2}.
   * </ul>
   *
   * <p>Method under test: {@link BdkDatafeedConfig#setVersion(String)}
   */
  @Test
  @DisplayName(
      "Test setVersion(String); when '1.0.2'; then BdkDatafeedConfig (default constructor) Version is '1.0.2'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BdkDatafeedConfig.setVersion(String)"})
  void testSetVersion_when102_thenBdkDatafeedConfigVersionIs102() {
    // Arrange
    BdkDatafeedConfig bdkDatafeedConfig = new BdkDatafeedConfig();

    // Act
    bdkDatafeedConfig.setVersion("1.0.2");

    // Assert
    assertEquals("1.0.2", bdkDatafeedConfig.getVersion());
  }

  /**
   * Test {@link BdkDatafeedConfig#setVersion(String)}.
   *
   * <ul>
   *   <li>When {@code v1}.
   *   <li>Then {@link BdkDatafeedConfig} (default constructor) Version is {@code v1}.
   * </ul>
   *
   * <p>Method under test: {@link BdkDatafeedConfig#setVersion(String)}
   */
  @Test
  @DisplayName(
      "Test setVersion(String); when 'v1'; then BdkDatafeedConfig (default constructor) Version is 'v1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BdkDatafeedConfig.setVersion(String)"})
  void testSetVersion_whenV1_thenBdkDatafeedConfigVersionIsV1() {
    // Arrange
    BdkDatafeedConfig bdkDatafeedConfig = new BdkDatafeedConfig();

    // Act
    bdkDatafeedConfig.setVersion("v1");

    // Assert
    assertEquals("v1", bdkDatafeedConfig.getVersion());
  }

  /**
   * Test {@link BdkDatafeedConfig#getIdFilePath()}.
   *
   * <ul>
   *   <li>Given {@link BdkDatafeedConfig} (default constructor) Retry is {@link
   *       BdkRetryConfig#BdkRetryConfig()}.
   *   <li>Then return {@code ./}.
   * </ul>
   *
   * <p>Method under test: {@link BdkDatafeedConfig#getIdFilePath()}
   */
  @Test
  @DisplayName(
      "Test getIdFilePath(); given BdkDatafeedConfig (default constructor) Retry is BdkRetryConfig(); then return './'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BdkDatafeedConfig.getIdFilePath()"})
  void testGetIdFilePath_givenBdkDatafeedConfigRetryIsBdkRetryConfig_thenReturnDotSlash() {
    // Arrange
    BdkDatafeedConfig bdkDatafeedConfig = new BdkDatafeedConfig();
    bdkDatafeedConfig.setRetry(new BdkRetryConfig());
    bdkDatafeedConfig.setVersion("1.0.2");
    bdkDatafeedConfig.setIdFilePath("");

    // Act and Assert
    assertEquals("./", bdkDatafeedConfig.getIdFilePath());
  }

  /**
   * Test {@link BdkDatafeedConfig#getIdFilePath()}.
   *
   * <ul>
   *   <li>Given {@link BdkDatafeedConfig} (default constructor).
   *   <li>Then return {@code ./}.
   * </ul>
   *
   * <p>Method under test: {@link BdkDatafeedConfig#getIdFilePath()}
   */
  @Test
  @DisplayName(
      "Test getIdFilePath(); given BdkDatafeedConfig (default constructor); then return './'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BdkDatafeedConfig.getIdFilePath()"})
  void testGetIdFilePath_givenBdkDatafeedConfig_thenReturnDotSlash() {
    // Arrange, Act and Assert
    assertEquals("./", new BdkDatafeedConfig().getIdFilePath());
  }

  /**
   * Test {@link BdkDatafeedConfig#getIdFilePath()}.
   *
   * <ul>
   *   <li>Then return {@code /directory/foo.txt/}.
   * </ul>
   *
   * <p>Method under test: {@link BdkDatafeedConfig#getIdFilePath()}
   */
  @Test
  @DisplayName("Test getIdFilePath(); then return '/directory/foo.txt/'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BdkDatafeedConfig.getIdFilePath()"})
  void testGetIdFilePath_thenReturnDirectoryFooTxt() {
    // Arrange
    BdkDatafeedConfig bdkDatafeedConfig = new BdkDatafeedConfig();
    bdkDatafeedConfig.setIdFilePath("/directory/foo.txt");

    // Act and Assert
    assertEquals("/directory/foo.txt/", bdkDatafeedConfig.getIdFilePath());
  }

  /**
   * Test new {@link BdkDatafeedConfig} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link BdkDatafeedConfig}
   */
  @Test
  @DisplayName("Test new BdkDatafeedConfig (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BdkDatafeedConfig.<init>()"})
  void testNewBdkDatafeedConfig() {
    // Arrange and Act
    BdkDatafeedConfig actualBdkDatafeedConfig = new BdkDatafeedConfig();

    // Assert
    assertEquals("./", actualBdkDatafeedConfig.getIdFilePath());
    assertEquals("v2", actualBdkDatafeedConfig.getVersion());
    BdkRetryConfig retry = actualBdkDatafeedConfig.getRetry();
    assertEquals(
        BdkRetryConfig.DEFAULT_INITIAL_INTERVAL_MILLIS,
        retry.getInitialIntervalMillis().longValue());
    assertEquals(
        BdkRetryConfig.DEFAULT_MAX_INTERVAL_MILLIS, retry.getMaxIntervalMillis().longValue());
    assertEquals(BdkRetryConfig.DEFAULT_MULTIPLIER, retry.getMultiplier().doubleValue());
    assertEquals(Integer.MAX_VALUE, retry.getMaxAttempts().intValue());
  }
}
