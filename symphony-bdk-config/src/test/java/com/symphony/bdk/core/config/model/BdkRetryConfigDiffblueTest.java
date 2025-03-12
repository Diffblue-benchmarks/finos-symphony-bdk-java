package com.symphony.bdk.core.config.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkRetryConfigDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BdkRetryConfig#BdkRetryConfig()}
   *   <li>{@link BdkRetryConfig#setInitialIntervalMillis(Long)}
   *   <li>{@link BdkRetryConfig#setMaxAttempts(Integer)}
   *   <li>{@link BdkRetryConfig#setMaxIntervalMillis(Long)}
   *   <li>{@link BdkRetryConfig#setMultiplier(Double)}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BdkRetryConfig.<init>()", "void BdkRetryConfig.<init>(Integer)",
      "void BdkRetryConfig.setInitialIntervalMillis(Long)", "void BdkRetryConfig.setMaxAttempts(Integer)",
      "void BdkRetryConfig.setMaxIntervalMillis(Long)", "void BdkRetryConfig.setMultiplier(Double)"})
  void testGettersAndSetters() {
    // Arrange and Act
    BdkRetryConfig actualBdkRetryConfig = new BdkRetryConfig();
    actualBdkRetryConfig.setInitialIntervalMillis(42L);
    actualBdkRetryConfig.setMaxAttempts(3);
    actualBdkRetryConfig.setMaxIntervalMillis(42L);
    actualBdkRetryConfig.setMultiplier(10.0d);

    // Assert
    assertEquals(10.0d, actualBdkRetryConfig.getMultiplier().doubleValue());
    assertEquals(3, actualBdkRetryConfig.getMaxAttempts().intValue());
    assertEquals(42L, actualBdkRetryConfig.getInitialIntervalMillis().longValue());
    assertEquals(42L, actualBdkRetryConfig.getMaxIntervalMillis().longValue());
  }

  /**
   * Test getters and setters.
   * <ul>
   *   <li>When three.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BdkRetryConfig#BdkRetryConfig(Integer)}
   *   <li>{@link BdkRetryConfig#setInitialIntervalMillis(Long)}
   *   <li>{@link BdkRetryConfig#setMaxAttempts(Integer)}
   *   <li>{@link BdkRetryConfig#setMaxIntervalMillis(Long)}
   *   <li>{@link BdkRetryConfig#setMultiplier(Double)}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters; when three")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BdkRetryConfig.<init>()", "void BdkRetryConfig.<init>(Integer)",
      "void BdkRetryConfig.setInitialIntervalMillis(Long)", "void BdkRetryConfig.setMaxAttempts(Integer)",
      "void BdkRetryConfig.setMaxIntervalMillis(Long)", "void BdkRetryConfig.setMultiplier(Double)"})
  void testGettersAndSetters_whenThree() {
    // Arrange and Act
    BdkRetryConfig actualBdkRetryConfig = new BdkRetryConfig(3);
    actualBdkRetryConfig.setInitialIntervalMillis(42L);
    actualBdkRetryConfig.setMaxAttempts(3);
    actualBdkRetryConfig.setMaxIntervalMillis(42L);
    actualBdkRetryConfig.setMultiplier(10.0d);

    // Assert
    assertEquals(10.0d, actualBdkRetryConfig.getMultiplier().doubleValue());
    assertEquals(3, actualBdkRetryConfig.getMaxAttempts().intValue());
    assertEquals(42L, actualBdkRetryConfig.getInitialIntervalMillis().longValue());
    assertEquals(42L, actualBdkRetryConfig.getMaxIntervalMillis().longValue());
  }

  /**
   * Test {@link BdkRetryConfig#getMaxAttempts()}.
   * <ul>
   *   <li>Given {@link BdkRetryConfig#BdkRetryConfig()} MaxAttempts is zero.</li>
   *   <li>Then return intValue is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkRetryConfig#getMaxAttempts()}
   */
  @Test
  @DisplayName("Test getMaxAttempts(); given BdkRetryConfig() MaxAttempts is zero; then return intValue is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Integer BdkRetryConfig.getMaxAttempts()"})
  void testGetMaxAttempts_givenBdkRetryConfigMaxAttemptsIsZero_thenReturnIntValueIsZero() {
    // Arrange
    BdkRetryConfig bdkRetryConfig = new BdkRetryConfig();
    bdkRetryConfig.setMaxAttempts(0);

    // Act and Assert
    assertEquals(0, bdkRetryConfig.getMaxAttempts().intValue());
  }

  /**
   * Test {@link BdkRetryConfig#getMaxAttempts()}.
   * <ul>
   *   <li>Given {@link BdkRetryConfig#BdkRetryConfig()}.</li>
   *   <li>Then return intValue is {@link BdkRetryConfig#DEFAULT_MAX_ATTEMPTS}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkRetryConfig#getMaxAttempts()}
   */
  @Test
  @DisplayName("Test getMaxAttempts(); given BdkRetryConfig(); then return intValue is DEFAULT_MAX_ATTEMPTS")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Integer BdkRetryConfig.getMaxAttempts()"})
  void testGetMaxAttempts_givenBdkRetryConfig_thenReturnIntValueIsDefault_max_attempts() {
    // Arrange, Act and Assert
    assertEquals(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS, (new BdkRetryConfig()).getMaxAttempts().intValue());
  }

  /**
   * Test {@link BdkRetryConfig#getMaxAttempts()}.
   * <ul>
   *   <li>Then return intValue is {@link Integer#MAX_VALUE}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkRetryConfig#getMaxAttempts()}
   */
  @Test
  @DisplayName("Test getMaxAttempts(); then return intValue is MAX_VALUE")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Integer BdkRetryConfig.getMaxAttempts()"})
  void testGetMaxAttempts_thenReturnIntValueIsMax_value() {
    // Arrange
    BdkRetryConfig bdkRetryConfig = new BdkRetryConfig();
    bdkRetryConfig.setMaxAttempts(BdkRetryConfig.INFINITE_MAX_ATTEMPTS);

    // Act and Assert
    assertEquals(Integer.MAX_VALUE, bdkRetryConfig.getMaxAttempts().intValue());
  }

  /**
   * Test {@link BdkRetryConfig#getInitialIntervalMillis()}.
   * <p>
   * Method under test: {@link BdkRetryConfig#getInitialIntervalMillis()}
   */
  @Test
  @DisplayName("Test getInitialIntervalMillis()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Long BdkRetryConfig.getInitialIntervalMillis()"})
  void testGetInitialIntervalMillis() {
    // Arrange, Act and Assert
    assertEquals(BdkRetryConfig.DEFAULT_INITIAL_INTERVAL_MILLIS,
        (new BdkRetryConfig()).getInitialIntervalMillis().longValue());
  }

  /**
   * Test {@link BdkRetryConfig#getInitialIntervalMillis()}.
   * <ul>
   *   <li>Then return longValue is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkRetryConfig#getInitialIntervalMillis()}
   */
  @Test
  @DisplayName("Test getInitialIntervalMillis(); then return longValue is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Long BdkRetryConfig.getInitialIntervalMillis()"})
  void testGetInitialIntervalMillis_thenReturnLongValueIsOne() {
    // Arrange
    BdkRetryConfig bdkRetryConfig = new BdkRetryConfig();
    bdkRetryConfig.setInitialIntervalMillis(1L);

    // Act and Assert
    assertEquals(1L, bdkRetryConfig.getInitialIntervalMillis().longValue());
  }

  /**
   * Test {@link BdkRetryConfig#getMultiplier()}.
   * <ul>
   *   <li>Given {@link BdkRetryConfig#BdkRetryConfig()} Multiplier is {@code 0.9999999999999999}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkRetryConfig#getMultiplier()}
   */
  @Test
  @DisplayName("Test getMultiplier(); given BdkRetryConfig() Multiplier is '0.9999999999999999'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Double BdkRetryConfig.getMultiplier()"})
  void testGetMultiplier_givenBdkRetryConfigMultiplierIs09999999999999999() {
    // Arrange
    BdkRetryConfig bdkRetryConfig = new BdkRetryConfig();
    bdkRetryConfig.setMultiplier(0.9999999999999999d);

    // Act and Assert
    assertEquals(BdkRetryConfig.DEFAULT_MULTIPLIER, bdkRetryConfig.getMultiplier().doubleValue());
  }

  /**
   * Test {@link BdkRetryConfig#getMultiplier()}.
   * <ul>
   *   <li>Given {@link BdkRetryConfig#BdkRetryConfig()} Multiplier is one.</li>
   *   <li>Then return doubleValue is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkRetryConfig#getMultiplier()}
   */
  @Test
  @DisplayName("Test getMultiplier(); given BdkRetryConfig() Multiplier is one; then return doubleValue is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Double BdkRetryConfig.getMultiplier()"})
  void testGetMultiplier_givenBdkRetryConfigMultiplierIsOne_thenReturnDoubleValueIsOne() {
    // Arrange
    BdkRetryConfig bdkRetryConfig = new BdkRetryConfig();
    bdkRetryConfig.setMultiplier(1.0d);

    // Act and Assert
    assertEquals(1.0d, bdkRetryConfig.getMultiplier().doubleValue());
  }

  /**
   * Test {@link BdkRetryConfig#getMultiplier()}.
   * <ul>
   *   <li>Given {@link BdkRetryConfig#BdkRetryConfig()}.</li>
   *   <li>Then return doubleValue is {@link BdkRetryConfig#DEFAULT_MULTIPLIER}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkRetryConfig#getMultiplier()}
   */
  @Test
  @DisplayName("Test getMultiplier(); given BdkRetryConfig(); then return doubleValue is DEFAULT_MULTIPLIER")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Double BdkRetryConfig.getMultiplier()"})
  void testGetMultiplier_givenBdkRetryConfig_thenReturnDoubleValueIsDefault_multiplier() {
    // Arrange, Act and Assert
    assertEquals(BdkRetryConfig.DEFAULT_MULTIPLIER, (new BdkRetryConfig()).getMultiplier().doubleValue());
  }

  /**
   * Test {@link BdkRetryConfig#getMaxIntervalMillis()}.
   * <ul>
   *   <li>Then return longValue is {@link BdkRetryConfig#DEFAULT_MAX_INTERVAL_MILLIS}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkRetryConfig#getMaxIntervalMillis()}
   */
  @Test
  @DisplayName("Test getMaxIntervalMillis(); then return longValue is DEFAULT_MAX_INTERVAL_MILLIS")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Long BdkRetryConfig.getMaxIntervalMillis()"})
  void testGetMaxIntervalMillis_thenReturnLongValueIsDefault_max_interval_millis() {
    // Arrange, Act and Assert
    assertEquals(BdkRetryConfig.DEFAULT_MAX_INTERVAL_MILLIS, (new BdkRetryConfig()).getMaxIntervalMillis().longValue());
  }

  /**
   * Test {@link BdkRetryConfig#getMaxIntervalMillis()}.
   * <ul>
   *   <li>Then return longValue is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkRetryConfig#getMaxIntervalMillis()}
   */
  @Test
  @DisplayName("Test getMaxIntervalMillis(); then return longValue is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Long BdkRetryConfig.getMaxIntervalMillis()"})
  void testGetMaxIntervalMillis_thenReturnLongValueIsOne() {
    // Arrange
    BdkRetryConfig bdkRetryConfig = new BdkRetryConfig();
    bdkRetryConfig.setMaxIntervalMillis(1L);

    // Act and Assert
    assertEquals(1L, bdkRetryConfig.getMaxIntervalMillis().longValue());
  }
}
