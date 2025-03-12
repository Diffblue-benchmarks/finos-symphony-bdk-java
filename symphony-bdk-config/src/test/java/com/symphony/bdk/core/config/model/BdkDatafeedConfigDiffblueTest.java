package com.symphony.bdk.core.config.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkDatafeedConfigDiffblueTest {
  /**
   * Test {@link BdkDatafeedConfig#setVersion(String)}.
   * <ul>
   *   <li>When {@code 1.0.2}.</li>
   *   <li>Then {@link BdkDatafeedConfig} (default constructor) Version is {@code 1.0.2}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkDatafeedConfig#setVersion(String)}
   */
  @Test
  @DisplayName("Test setVersion(String); when '1.0.2'; then BdkDatafeedConfig (default constructor) Version is '1.0.2'")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>When {@code v1}.</li>
   *   <li>Then {@link BdkDatafeedConfig} (default constructor) Version is {@code v1}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkDatafeedConfig#setVersion(String)}
   */
  @Test
  @DisplayName("Test setVersion(String); when 'v1'; then BdkDatafeedConfig (default constructor) Version is 'v1'")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>Given {@link BdkDatafeedConfig} (default constructor) IdFilePath is empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkDatafeedConfig#getIdFilePath()}
   */
  @Test
  @DisplayName("Test getIdFilePath(); given BdkDatafeedConfig (default constructor) IdFilePath is empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String BdkDatafeedConfig.getIdFilePath()"})
  void testGetIdFilePath_givenBdkDatafeedConfigIdFilePathIsEmptyString() {
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
   * <ul>
   *   <li>Given {@link BdkDatafeedConfig} (default constructor) IdFilePath is {@code foo}.</li>
   *   <li>Then return {@code foo/}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkDatafeedConfig#getIdFilePath()}
   */
  @Test
  @DisplayName("Test getIdFilePath(); given BdkDatafeedConfig (default constructor) IdFilePath is 'foo'; then return 'foo/'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String BdkDatafeedConfig.getIdFilePath()"})
  void testGetIdFilePath_givenBdkDatafeedConfigIdFilePathIsFoo_thenReturnFoo() {
    // Arrange
    BdkDatafeedConfig bdkDatafeedConfig = new BdkDatafeedConfig();
    bdkDatafeedConfig.setRetry(new BdkRetryConfig());
    bdkDatafeedConfig.setVersion("1.0.2");
    bdkDatafeedConfig.setIdFilePath("foo");

    // Act and Assert
    assertEquals("foo/", bdkDatafeedConfig.getIdFilePath());
  }

  /**
   * Test {@link BdkDatafeedConfig#getIdFilePath()}.
   * <ul>
   *   <li>Given {@link BdkDatafeedConfig} (default constructor).</li>
   *   <li>Then return {@code ./}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkDatafeedConfig#getIdFilePath()}
   */
  @Test
  @DisplayName("Test getIdFilePath(); given BdkDatafeedConfig (default constructor); then return './'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String BdkDatafeedConfig.getIdFilePath()"})
  void testGetIdFilePath_givenBdkDatafeedConfig_thenReturnDotSlash() {
    // Arrange, Act and Assert
    assertEquals("./", (new BdkDatafeedConfig()).getIdFilePath());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BdkDatafeedConfig#setIdFilePath(String)}
   *   <li>{@link BdkDatafeedConfig#setRetry(BdkRetryConfig)}
   *   <li>{@link BdkDatafeedConfig#getRetry()}
   *   <li>{@link BdkDatafeedConfig#getVersion()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"BdkRetryConfig BdkDatafeedConfig.getRetry()", "String BdkDatafeedConfig.getVersion()",
      "void BdkDatafeedConfig.setIdFilePath(String)", "void BdkDatafeedConfig.setRetry(BdkRetryConfig)"})
  void testGettersAndSetters() {
    // Arrange
    BdkDatafeedConfig bdkDatafeedConfig = new BdkDatafeedConfig();

    // Act
    bdkDatafeedConfig.setIdFilePath("/directory/foo.txt");
    BdkRetryConfig retry = new BdkRetryConfig();
    bdkDatafeedConfig.setRetry(retry);
    BdkRetryConfig actualRetry = bdkDatafeedConfig.getRetry();

    // Assert
    assertEquals("v2", bdkDatafeedConfig.getVersion());
    assertSame(retry, actualRetry);
  }

  /**
   * Test new {@link BdkDatafeedConfig} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link BdkDatafeedConfig}
   */
  @Test
  @DisplayName("Test new BdkDatafeedConfig (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BdkDatafeedConfig.<init>()"})
  void testNewBdkDatafeedConfig() {
    // Arrange and Act
    BdkDatafeedConfig actualBdkDatafeedConfig = new BdkDatafeedConfig();

    // Assert
    assertEquals("./", actualBdkDatafeedConfig.getIdFilePath());
    assertEquals("v2", actualBdkDatafeedConfig.getVersion());
    BdkRetryConfig retry = actualBdkDatafeedConfig.getRetry();
    assertEquals(BdkRetryConfig.DEFAULT_INITIAL_INTERVAL_MILLIS, retry.getInitialIntervalMillis().longValue());
    assertEquals(BdkRetryConfig.DEFAULT_MAX_INTERVAL_MILLIS, retry.getMaxIntervalMillis().longValue());
    assertEquals(BdkRetryConfig.DEFAULT_MULTIPLIER, retry.getMultiplier().doubleValue());
    assertEquals(Integer.MAX_VALUE, retry.getMaxAttempts().intValue());
  }
}
