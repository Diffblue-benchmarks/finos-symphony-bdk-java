package com.symphony.bdk.core.config.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkRetryConfigDiffblueTest {
  /**
   * Test {@link BdkRetryConfig#BdkRetryConfig(Integer)}.
   *
   * <p>Method under test: {@link BdkRetryConfig#BdkRetryConfig(Integer)}
   */
  @Test
  @DisplayName("Test new BdkRetryConfig(Integer)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BdkRetryConfig.<init>(Integer)"})
  void testNewBdkRetryConfig() {
    // Arrange and Act
    BdkRetryConfig actualBdkRetryConfig = new BdkRetryConfig(3);

    // Assert
    assertEquals(3, actualBdkRetryConfig.getMaxAttempts().intValue());
    assertEquals(
        BdkRetryConfig.DEFAULT_INITIAL_INTERVAL_MILLIS,
        actualBdkRetryConfig.getInitialIntervalMillis().longValue());
    assertEquals(
        BdkRetryConfig.DEFAULT_MAX_INTERVAL_MILLIS,
        actualBdkRetryConfig.getMaxIntervalMillis().longValue());
    assertEquals(
        BdkRetryConfig.DEFAULT_MULTIPLIER, actualBdkRetryConfig.getMultiplier().doubleValue());
  }

  /**
   * Test {@link BdkRetryConfig#getMaxAttempts()}.
   *
   * <ul>
   *   <li>Given {@link BdkRetryConfig#BdkRetryConfig()}.
   *   <li>Then return intValue is {@link BdkRetryConfig#DEFAULT_MAX_ATTEMPTS}.
   * </ul>
   *
   * <p>Method under test: {@link BdkRetryConfig#getMaxAttempts()}
   */
  @Test
  @DisplayName(
      "Test getMaxAttempts(); given BdkRetryConfig(); then return intValue is DEFAULT_MAX_ATTEMPTS")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer BdkRetryConfig.getMaxAttempts()"})
  void testGetMaxAttempts_givenBdkRetryConfig_thenReturnIntValueIsDefault_max_attempts() {
    // Arrange, Act and Assert
    assertEquals(
        BdkRetryConfig.DEFAULT_MAX_ATTEMPTS, new BdkRetryConfig().getMaxAttempts().intValue());
  }

  /**
   * Test {@link BdkRetryConfig#getMaxAttempts()}.
   *
   * <ul>
   *   <li>Then return intValue is {@link Integer#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link BdkRetryConfig#getMaxAttempts()}
   */
  @Test
  @DisplayName("Test getMaxAttempts(); then return intValue is MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer BdkRetryConfig.getMaxAttempts()"})
  void testGetMaxAttempts_thenReturnIntValueIsMax_value() {
    // Arrange, Act and Assert
    assertEquals(
        Integer.MAX_VALUE,
        new BdkRetryConfig(BdkRetryConfig.INFINITE_MAX_ATTEMPTS).getMaxAttempts().intValue());
  }

  /**
   * Test {@link BdkRetryConfig#getMaxAttempts()}.
   *
   * <ul>
   *   <li>Then return intValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link BdkRetryConfig#getMaxAttempts()}
   */
  @Test
  @DisplayName("Test getMaxAttempts(); then return intValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer BdkRetryConfig.getMaxAttempts()"})
  void testGetMaxAttempts_thenReturnIntValueIsZero() {
    // Arrange, Act and Assert
    assertEquals(0, new BdkRetryConfig(0).getMaxAttempts().intValue());
  }

  /**
   * Test {@link BdkRetryConfig#getInitialIntervalMillis()}.
   *
   * <p>Method under test: {@link BdkRetryConfig#getInitialIntervalMillis()}
   */
  @Test
  @DisplayName("Test getInitialIntervalMillis()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Long BdkRetryConfig.getInitialIntervalMillis()"})
  void testGetInitialIntervalMillis() {
    // Arrange, Act and Assert
    assertEquals(
        BdkRetryConfig.DEFAULT_INITIAL_INTERVAL_MILLIS,
        new BdkRetryConfig().getInitialIntervalMillis().longValue());
  }

  /**
   * Test {@link BdkRetryConfig#getInitialIntervalMillis()}.
   *
   * <ul>
   *   <li>Then return longValue is one.
   * </ul>
   *
   * <p>Method under test: {@link BdkRetryConfig#getInitialIntervalMillis()}
   */
  @Test
  @DisplayName("Test getInitialIntervalMillis(); then return longValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Long BdkRetryConfig.getInitialIntervalMillis()"})
  void testGetInitialIntervalMillis_thenReturnLongValueIsOne() {
    // Arrange
    BdkRetryConfig bdkRetryConfig = new BdkRetryConfig(3);
    bdkRetryConfig.setInitialIntervalMillis(1L);

    // Act and Assert
    assertEquals(1L, bdkRetryConfig.getInitialIntervalMillis().longValue());
  }

  /**
   * Test {@link BdkRetryConfig#getMultiplier()}.
   *
   * <p>Method under test: {@link BdkRetryConfig#getMultiplier()}
   */
  @Test
  @DisplayName("Test getMultiplier()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Double BdkRetryConfig.getMultiplier()"})
  void testGetMultiplier() {
    // Arrange
    BdkRetryConfig bdkRetryConfig = new BdkRetryConfig(3);
    bdkRetryConfig.setMultiplier(0.9999999999999999d);

    // Act and Assert
    assertEquals(BdkRetryConfig.DEFAULT_MULTIPLIER, bdkRetryConfig.getMultiplier().doubleValue());
  }

  /**
   * Test {@link BdkRetryConfig#getMultiplier()}.
   *
   * <ul>
   *   <li>Given {@link BdkRetryConfig#BdkRetryConfig()}.
   *   <li>Then return doubleValue is {@link BdkRetryConfig#DEFAULT_MULTIPLIER}.
   * </ul>
   *
   * <p>Method under test: {@link BdkRetryConfig#getMultiplier()}
   */
  @Test
  @DisplayName(
      "Test getMultiplier(); given BdkRetryConfig(); then return doubleValue is DEFAULT_MULTIPLIER")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Double BdkRetryConfig.getMultiplier()"})
  void testGetMultiplier_givenBdkRetryConfig_thenReturnDoubleValueIsDefault_multiplier() {
    // Arrange, Act and Assert
    assertEquals(
        BdkRetryConfig.DEFAULT_MULTIPLIER, new BdkRetryConfig().getMultiplier().doubleValue());
  }

  /**
   * Test {@link BdkRetryConfig#getMultiplier()}.
   *
   * <ul>
   *   <li>Then return doubleValue is one.
   * </ul>
   *
   * <p>Method under test: {@link BdkRetryConfig#getMultiplier()}
   */
  @Test
  @DisplayName("Test getMultiplier(); then return doubleValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Double BdkRetryConfig.getMultiplier()"})
  void testGetMultiplier_thenReturnDoubleValueIsOne() {
    // Arrange
    BdkRetryConfig bdkRetryConfig = new BdkRetryConfig(3);
    bdkRetryConfig.setMultiplier(1.0d);

    // Act and Assert
    assertEquals(1.0d, bdkRetryConfig.getMultiplier().doubleValue());
  }

  /**
   * Test {@link BdkRetryConfig#getMaxIntervalMillis()}.
   *
   * <ul>
   *   <li>Then return longValue is {@link BdkRetryConfig#DEFAULT_MAX_INTERVAL_MILLIS}.
   * </ul>
   *
   * <p>Method under test: {@link BdkRetryConfig#getMaxIntervalMillis()}
   */
  @Test
  @DisplayName("Test getMaxIntervalMillis(); then return longValue is DEFAULT_MAX_INTERVAL_MILLIS")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Long BdkRetryConfig.getMaxIntervalMillis()"})
  void testGetMaxIntervalMillis_thenReturnLongValueIsDefault_max_interval_millis() {
    // Arrange, Act and Assert
    assertEquals(
        BdkRetryConfig.DEFAULT_MAX_INTERVAL_MILLIS,
        new BdkRetryConfig().getMaxIntervalMillis().longValue());
  }

  /**
   * Test {@link BdkRetryConfig#getMaxIntervalMillis()}.
   *
   * <ul>
   *   <li>Then return longValue is one.
   * </ul>
   *
   * <p>Method under test: {@link BdkRetryConfig#getMaxIntervalMillis()}
   */
  @Test
  @DisplayName("Test getMaxIntervalMillis(); then return longValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Long BdkRetryConfig.getMaxIntervalMillis()"})
  void testGetMaxIntervalMillis_thenReturnLongValueIsOne() {
    // Arrange
    BdkRetryConfig bdkRetryConfig = new BdkRetryConfig(3);
    bdkRetryConfig.setMaxIntervalMillis(1L);

    // Act and Assert
    assertEquals(1L, bdkRetryConfig.getMaxIntervalMillis().longValue());
  }
}
