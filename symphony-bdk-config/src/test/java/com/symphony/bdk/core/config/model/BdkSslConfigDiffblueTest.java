package com.symphony.bdk.core.config.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.config.exception.BdkConfigFormatException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkSslConfigDiffblueTest {
  /**
   * Test {@link BdkSslConfig#isValid()}.
   *
   * <p>Method under test: {@link BdkSslConfig#isValid()}
   */
  @Test
  @DisplayName("Test isValid()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkSslConfig.isValid()"})
  void testIsValid() {
    // Arrange
    BdkSslConfig bdkSslConfig = new BdkSslConfig();
    bdkSslConfig.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));

    // Act and Assert
    assertTrue(bdkSslConfig.isValid());
  }

  /**
   * Test {@link BdkSslConfig#isValid()}.
   *
   * <p>Method under test: {@link BdkSslConfig#isValid()}
   */
  @Test
  @DisplayName("Test isValid()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkSslConfig.isValid()"})
  void testIsValid2() {
    // Arrange
    BdkSslConfig bdkSslConfig = new BdkSslConfig();
    bdkSslConfig.setTrustStore(new BdkCertificateConfig("", "iloveyou"));

    // Act and Assert
    assertTrue(bdkSslConfig.isValid());
  }

  /**
   * Test {@link BdkSslConfig#isValid()}.
   *
   * <p>Method under test: {@link BdkSslConfig#isValid()}
   */
  @Test
  @DisplayName("Test isValid()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkSslConfig.isValid()"})
  void testIsValid3() {
    // Arrange
    BdkSslConfig bdkSslConfig = new BdkSslConfig();
    BdkCertificateConfig trustStore = new BdkCertificateConfig("Path", new byte[] {}, "iloveyou");
    bdkSslConfig.setTrustStore(trustStore);

    // Act and Assert
    assertTrue(bdkSslConfig.isValid());
  }

  /**
   * Test {@link BdkSslConfig#isValid()}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link BdkSslConfig#isValid()}
   */
  @Test
  @DisplayName("Test isValid(); given 'A'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkSslConfig.isValid()"})
  void testIsValid_givenA_thenReturnFalse() {
    // Arrange
    BdkSslConfig bdkSslConfig = new BdkSslConfig();
    BdkCertificateConfig trustStore =
        new BdkCertificateConfig("Path", new byte[] {'A', 1, 'A', 1, 'A', 1, 'A', 1}, "iloveyou");
    bdkSslConfig.setTrustStore(trustStore);

    // Act and Assert
    assertFalse(bdkSslConfig.isValid());
  }

  /**
   * Test {@link BdkSslConfig#isValid()}.
   *
   * <ul>
   *   <li>Given {@link BdkSslConfig} (default constructor) TrustStore is {@code null}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link BdkSslConfig#isValid()}
   */
  @Test
  @DisplayName(
      "Test isValid(); given BdkSslConfig (default constructor) TrustStore is 'null'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkSslConfig.isValid()"})
  void testIsValid_givenBdkSslConfigTrustStoreIsNull_thenReturnTrue() {
    // Arrange
    BdkSslConfig bdkSslConfig = new BdkSslConfig();
    bdkSslConfig.setTrustStore(null);

    // Act and Assert
    assertTrue(bdkSslConfig.isValid());
  }

  /**
   * Test {@link BdkSslConfig#isValid()}.
   *
   * <ul>
   *   <li>Given {@link BdkSslConfig} (default constructor) TrustStorePath is {@code Trust Store
   *       Path}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link BdkSslConfig#isValid()}
   */
  @Test
  @DisplayName(
      "Test isValid(); given BdkSslConfig (default constructor) TrustStorePath is 'Trust Store Path'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkSslConfig.isValid()"})
  void testIsValid_givenBdkSslConfigTrustStorePathIsTrustStorePath_thenReturnFalse() {
    // Arrange
    BdkSslConfig bdkSslConfig = new BdkSslConfig();
    bdkSslConfig.setTrustStorePath("Trust Store Path");
    BdkCertificateConfig trustStore = new BdkCertificateConfig("Path", new byte[] {}, "iloveyou");
    bdkSslConfig.setTrustStore(trustStore);

    // Act and Assert
    assertFalse(bdkSslConfig.isValid());
  }

  /**
   * Test {@link BdkSslConfig#isValid()}.
   *
   * <ul>
   *   <li>Given {@link BdkSslConfig} (default constructor).
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link BdkSslConfig#isValid()}
   */
  @Test
  @DisplayName("Test isValid(); given BdkSslConfig (default constructor); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkSslConfig.isValid()"})
  void testIsValid_givenBdkSslConfig_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(new BdkSslConfig().isValid());
  }

  /**
   * Test {@link BdkSslConfig#getCertificateConfig()}.
   *
   * <p>Method under test: {@link BdkSslConfig#getCertificateConfig()}
   */
  @Test
  @DisplayName("Test getCertificateConfig()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkCertificateConfig BdkSslConfig.getCertificateConfig()"})
  void testGetCertificateConfig() {
    // Arrange
    BdkSslConfig bdkSslConfig = new BdkSslConfig();
    BdkCertificateConfig trustStore = new BdkCertificateConfig("Path", "iloveyou");
    bdkSslConfig.setTrustStore(trustStore);

    // Act and Assert
    assertSame(trustStore, bdkSslConfig.getCertificateConfig());
  }

  /**
   * Test {@link BdkSslConfig#getCertificateConfig()}.
   *
   * <p>Method under test: {@link BdkSslConfig#getCertificateConfig()}
   */
  @Test
  @DisplayName("Test getCertificateConfig()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkCertificateConfig BdkSslConfig.getCertificateConfig()"})
  void testGetCertificateConfig2() {
    // Arrange
    BdkSslConfig bdkSslConfig = new BdkSslConfig();
    BdkCertificateConfig trustStore = new BdkCertificateConfig("Path", new byte[] {}, "iloveyou");
    bdkSslConfig.setTrustStore(trustStore);

    // Act and Assert
    assertSame(trustStore, bdkSslConfig.getCertificateConfig());
  }

  /**
   * Test {@link BdkSslConfig#getCertificateConfig()}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then throw {@link BdkConfigFormatException}.
   * </ul>
   *
   * <p>Method under test: {@link BdkSslConfig#getCertificateConfig()}
   */
  @Test
  @DisplayName("Test getCertificateConfig(); given 'A'; then throw BdkConfigFormatException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkCertificateConfig BdkSslConfig.getCertificateConfig()"})
  void testGetCertificateConfig_givenA_thenThrowBdkConfigFormatException() {
    // Arrange
    BdkSslConfig bdkSslConfig = new BdkSslConfig();
    BdkCertificateConfig trustStore =
        new BdkCertificateConfig("Path", new byte[] {'A', 1, 'A', 1, 'A', 1, 'A', 1}, "iloveyou");
    bdkSslConfig.setTrustStore(trustStore);

    // Act and Assert
    assertThrows(BdkConfigFormatException.class, () -> bdkSslConfig.getCertificateConfig());
  }

  /**
   * Test {@link BdkSslConfig#getCertificateConfig()}.
   *
   * <ul>
   *   <li>Given {@link BdkSslConfig} (default constructor) TrustStore is {@code null}.
   *   <li>Then return Path is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkSslConfig#getCertificateConfig()}
   */
  @Test
  @DisplayName(
      "Test getCertificateConfig(); given BdkSslConfig (default constructor) TrustStore is 'null'; then return Path is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkCertificateConfig BdkSslConfig.getCertificateConfig()"})
  void testGetCertificateConfig_givenBdkSslConfigTrustStoreIsNull_thenReturnPathIsNull() {
    // Arrange
    BdkSslConfig bdkSslConfig = new BdkSslConfig();
    bdkSslConfig.setTrustStore(null);

    // Act
    BdkCertificateConfig actualCertificateConfig = bdkSslConfig.getCertificateConfig();

    // Assert
    assertNull(actualCertificateConfig.getContent());
    assertNull(actualCertificateConfig.getPassword());
    assertNull(actualCertificateConfig.getPath());
    assertFalse(actualCertificateConfig.isConfigured());
  }

  /**
   * Test {@link BdkSslConfig#getCertificateConfig()}.
   *
   * <ul>
   *   <li>Given {@link BdkSslConfig} (default constructor).
   *   <li>Then return Path is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkSslConfig#getCertificateConfig()}
   */
  @Test
  @DisplayName(
      "Test getCertificateConfig(); given BdkSslConfig (default constructor); then return Path is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkCertificateConfig BdkSslConfig.getCertificateConfig()"})
  void testGetCertificateConfig_givenBdkSslConfig_thenReturnPathIsNull() {
    // Arrange and Act
    BdkCertificateConfig actualCertificateConfig = new BdkSslConfig().getCertificateConfig();

    // Assert
    assertNull(actualCertificateConfig.getContent());
    assertNull(actualCertificateConfig.getPassword());
    assertNull(actualCertificateConfig.getPath());
    assertFalse(actualCertificateConfig.isConfigured());
  }

  /**
   * Test {@link BdkSslConfig#getCertificateConfig()}.
   *
   * <ul>
   *   <li>Then return Configured.
   * </ul>
   *
   * <p>Method under test: {@link BdkSslConfig#getCertificateConfig()}
   */
  @Test
  @DisplayName("Test getCertificateConfig(); then return Configured")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkCertificateConfig BdkSslConfig.getCertificateConfig()"})
  void testGetCertificateConfig_thenReturnConfigured() {
    // Arrange
    BdkSslConfig bdkSslConfig = new BdkSslConfig();
    bdkSslConfig.setTrustStorePassword("iloveyou");
    bdkSslConfig.setTrustStorePath("Trust Store Path");

    // Act
    BdkCertificateConfig actualCertificateConfig = bdkSslConfig.getCertificateConfig();

    // Assert
    assertEquals("Trust Store Path", actualCertificateConfig.getPath());
    assertEquals("iloveyou", actualCertificateConfig.getPassword());
    assertNull(actualCertificateConfig.getContent());
    assertTrue(actualCertificateConfig.isConfigured());
  }

  /**
   * Test {@link BdkSslConfig#getCertificateConfig()}.
   *
   * <ul>
   *   <li>Then return Password is {@code iloveyou}.
   * </ul>
   *
   * <p>Method under test: {@link BdkSslConfig#getCertificateConfig()}
   */
  @Test
  @DisplayName("Test getCertificateConfig(); then return Password is 'iloveyou'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkCertificateConfig BdkSslConfig.getCertificateConfig()"})
  void testGetCertificateConfig_thenReturnPasswordIsIloveyou() {
    // Arrange
    BdkSslConfig bdkSslConfig = new BdkSslConfig();
    bdkSslConfig.setTrustStorePassword("iloveyou");

    // Act
    BdkCertificateConfig actualCertificateConfig = bdkSslConfig.getCertificateConfig();

    // Assert
    assertEquals("iloveyou", actualCertificateConfig.getPassword());
    assertNull(actualCertificateConfig.getContent());
    assertNull(actualCertificateConfig.getPath());
    assertFalse(actualCertificateConfig.isConfigured());
  }

  /**
   * Test {@link BdkSslConfig#getCertificateConfig()}.
   *
   * <ul>
   *   <li>Then return Path is empty string.
   * </ul>
   *
   * <p>Method under test: {@link BdkSslConfig#getCertificateConfig()}
   */
  @Test
  @DisplayName("Test getCertificateConfig(); then return Path is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkCertificateConfig BdkSslConfig.getCertificateConfig()"})
  void testGetCertificateConfig_thenReturnPathIsEmptyString() {
    // Arrange
    BdkSslConfig bdkSslConfig = new BdkSslConfig();
    bdkSslConfig.setTrustStorePath("");

    // Act
    BdkCertificateConfig actualCertificateConfig = bdkSslConfig.getCertificateConfig();

    // Assert
    assertEquals("", actualCertificateConfig.getPath());
    assertNull(actualCertificateConfig.getContent());
    assertNull(actualCertificateConfig.getPassword());
    assertFalse(actualCertificateConfig.isConfigured());
  }

  /**
   * Test {@link BdkSslConfig#getCertificateConfig()}.
   *
   * <ul>
   *   <li>Then return Path is {@code Trust Store Path}.
   * </ul>
   *
   * <p>Method under test: {@link BdkSslConfig#getCertificateConfig()}
   */
  @Test
  @DisplayName("Test getCertificateConfig(); then return Path is 'Trust Store Path'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkCertificateConfig BdkSslConfig.getCertificateConfig()"})
  void testGetCertificateConfig_thenReturnPathIsTrustStorePath() {
    // Arrange
    BdkSslConfig bdkSslConfig = new BdkSslConfig();
    bdkSslConfig.setTrustStorePath("Trust Store Path");

    // Act
    BdkCertificateConfig actualCertificateConfig = bdkSslConfig.getCertificateConfig();

    // Assert
    assertEquals("Trust Store Path", actualCertificateConfig.getPath());
    assertNull(actualCertificateConfig.getContent());
    assertNull(actualCertificateConfig.getPassword());
    assertFalse(actualCertificateConfig.isConfigured());
  }

  /**
   * Test {@link BdkSslConfig#getCertificateConfig()}.
   *
   * <ul>
   *   <li>Then throw {@link BdkConfigFormatException}.
   * </ul>
   *
   * <p>Method under test: {@link BdkSslConfig#getCertificateConfig()}
   */
  @Test
  @DisplayName("Test getCertificateConfig(); then throw BdkConfigFormatException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkCertificateConfig BdkSslConfig.getCertificateConfig()"})
  void testGetCertificateConfig_thenThrowBdkConfigFormatException() {
    // Arrange
    BdkSslConfig bdkSslConfig = new BdkSslConfig();
    bdkSslConfig.setTrustStorePath("Trust Store Path");
    BdkCertificateConfig trustStore = new BdkCertificateConfig("Path", new byte[] {}, "iloveyou");
    bdkSslConfig.setTrustStore(trustStore);

    // Act and Assert
    assertThrows(BdkConfigFormatException.class, () -> bdkSslConfig.getCertificateConfig());
  }

  /**
   * Test new {@link BdkSslConfig} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link BdkSslConfig}
   */
  @Test
  @DisplayName("Test new BdkSslConfig (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BdkSslConfig.<init>()"})
  void testNewBdkSslConfig() {
    // Arrange and Act
    BdkSslConfig actualBdkSslConfig = new BdkSslConfig();

    // Assert
    BdkCertificateConfig certificateConfig = actualBdkSslConfig.getCertificateConfig();
    assertNull(certificateConfig.getContent());
    BdkCertificateConfig trustStore = actualBdkSslConfig.getTrustStore();
    assertNull(trustStore.getContent());
    assertNull(certificateConfig.getPassword());
    assertNull(trustStore.getPassword());
    assertNull(certificateConfig.getPath());
    assertNull(trustStore.getPath());
    assertNull(actualBdkSslConfig.getTrustStorePassword());
    assertNull(actualBdkSslConfig.getTrustStorePath());
    assertFalse(certificateConfig.isConfigured());
    assertFalse(trustStore.isConfigured());
    assertTrue(certificateConfig.isValid());
    assertTrue(trustStore.isValid());
    assertTrue(actualBdkSslConfig.isValid());
  }
}
