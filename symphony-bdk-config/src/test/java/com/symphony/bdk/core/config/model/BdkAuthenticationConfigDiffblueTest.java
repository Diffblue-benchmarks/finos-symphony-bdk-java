package com.symphony.bdk.core.config.model;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkAuthenticationConfigDiffblueTest {
  /**
   * Test {@link BdkAuthenticationConfig#isCertificateAuthenticationConfigured()}.
   *
   * <p>Method under test: {@link BdkAuthenticationConfig#isCertificateAuthenticationConfigured()}
   */
  @Test
  @DisplayName("Test isCertificateAuthenticationConfigured()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isCertificateAuthenticationConfigured()"})
  void testIsCertificateAuthenticationConfigured() {
    // Arrange
    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificatePath("Certificate Path");

    // Act and Assert
    assertFalse(bdkAuthenticationConfig.isCertificateAuthenticationConfigured());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isCertificateAuthenticationConfigured()}.
   *
   * <p>Method under test: {@link BdkAuthenticationConfig#isCertificateAuthenticationConfigured()}
   */
  @Test
  @DisplayName("Test isCertificateAuthenticationConfigured()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isCertificateAuthenticationConfigured()"})
  void testIsCertificateAuthenticationConfigured2() throws UnsupportedEncodingException {
    // Arrange
    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));

    // Act and Assert
    assertFalse(bdkAuthenticationConfig.isCertificateAuthenticationConfigured());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isCertificateAuthenticationConfigured()}.
   *
   * <p>Method under test: {@link BdkAuthenticationConfig#isCertificateAuthenticationConfigured()}
   */
  @Test
  @DisplayName("Test isCertificateAuthenticationConfigured()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isCertificateAuthenticationConfigured()"})
  void testIsCertificateAuthenticationConfigured3() {
    // Arrange
    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));

    // Act and Assert
    assertTrue(bdkAuthenticationConfig.isCertificateAuthenticationConfigured());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isCertificateAuthenticationConfigured()}.
   *
   * <p>Method under test: {@link BdkAuthenticationConfig#isCertificateAuthenticationConfigured()}
   */
  @Test
  @DisplayName("Test isCertificateAuthenticationConfigured()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isCertificateAuthenticationConfigured()"})
  void testIsCertificateAuthenticationConfigured4() {
    // Arrange
    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificatePath("");

    // Act and Assert
    assertFalse(bdkAuthenticationConfig.isCertificateAuthenticationConfigured());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isCertificateAuthenticationConfigured()}.
   *
   * <p>Method under test: {@link BdkAuthenticationConfig#isCertificateAuthenticationConfigured()}
   */
  @Test
  @DisplayName("Test isCertificateAuthenticationConfigured()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isCertificateAuthenticationConfigured()"})
  void testIsCertificateAuthenticationConfigured5() {
    // Arrange
    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificateContent(new byte[] {});

    // Act and Assert
    assertFalse(bdkAuthenticationConfig.isCertificateAuthenticationConfigured());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isCertificateAuthenticationConfigured()}.
   *
   * <p>Method under test: {@link BdkAuthenticationConfig#isCertificateAuthenticationConfigured()}
   */
  @Test
  @DisplayName("Test isCertificateAuthenticationConfigured()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isCertificateAuthenticationConfigured()"})
  void testIsCertificateAuthenticationConfigured6() {
    // Arrange
    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificate(null);

    // Act and Assert
    assertFalse(bdkAuthenticationConfig.isCertificateAuthenticationConfigured());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isCertificateAuthenticationConfigured()}.
   *
   * <p>Method under test: {@link BdkAuthenticationConfig#isCertificateAuthenticationConfigured()}
   */
  @Test
  @DisplayName("Test isCertificateAuthenticationConfigured()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isCertificateAuthenticationConfigured()"})
  void testIsCertificateAuthenticationConfigured7() {
    // Arrange
    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificatePassword("iloveyou");
    bdkAuthenticationConfig.setCertificatePath("Certificate Path");

    // Act and Assert
    assertTrue(bdkAuthenticationConfig.isCertificateAuthenticationConfigured());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isCertificateAuthenticationConfigured()}.
   *
   * <ul>
   *   <li>Given {@link BdkAuthenticationConfig} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link BdkAuthenticationConfig#isCertificateAuthenticationConfigured()}
   */
  @Test
  @DisplayName(
      "Test isCertificateAuthenticationConfigured(); given BdkAuthenticationConfig (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isCertificateAuthenticationConfigured()"})
  void testIsCertificateAuthenticationConfigured_givenBdkAuthenticationConfig() {
    // Arrange, Act and Assert
    assertFalse(new BdkAuthenticationConfig().isCertificateAuthenticationConfigured());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isCertificateConfigurationValid()}.
   *
   * <p>Method under test: {@link BdkAuthenticationConfig#isCertificateConfigurationValid()}
   */
  @Test
  @DisplayName("Test isCertificateConfigurationValid()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isCertificateConfigurationValid()"})
  void testIsCertificateConfigurationValid() {
    // Arrange
    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificatePath("Certificate Path");

    // Act and Assert
    assertTrue(bdkAuthenticationConfig.isCertificateConfigurationValid());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isCertificateConfigurationValid()}.
   *
   * <p>Method under test: {@link BdkAuthenticationConfig#isCertificateConfigurationValid()}
   */
  @Test
  @DisplayName("Test isCertificateConfigurationValid()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isCertificateConfigurationValid()"})
  void testIsCertificateConfigurationValid2() {
    // Arrange
    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));

    // Act and Assert
    assertTrue(bdkAuthenticationConfig.isCertificateConfigurationValid());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isCertificateConfigurationValid()}.
   *
   * <p>Method under test: {@link BdkAuthenticationConfig#isCertificateConfigurationValid()}
   */
  @Test
  @DisplayName("Test isCertificateConfigurationValid()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isCertificateConfigurationValid()"})
  void testIsCertificateConfigurationValid3() {
    // Arrange
    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificatePath("");

    // Act and Assert
    assertTrue(bdkAuthenticationConfig.isCertificateConfigurationValid());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isCertificateConfigurationValid()}.
   *
   * <p>Method under test: {@link BdkAuthenticationConfig#isCertificateConfigurationValid()}
   */
  @Test
  @DisplayName("Test isCertificateConfigurationValid()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isCertificateConfigurationValid()"})
  void testIsCertificateConfigurationValid4() {
    // Arrange
    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificate(null);

    // Act and Assert
    assertTrue(bdkAuthenticationConfig.isCertificateConfigurationValid());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isCertificateConfigurationValid()}.
   *
   * <p>Method under test: {@link BdkAuthenticationConfig#isCertificateConfigurationValid()}
   */
  @Test
  @DisplayName("Test isCertificateConfigurationValid()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isCertificateConfigurationValid()"})
  void testIsCertificateConfigurationValid5() {
    // Arrange
    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    BdkCertificateConfig certificate =
        new BdkCertificateConfig("Path", new byte[] {'A', 1, 'A', 1, 'A', 1, 'A', 1}, "iloveyou");
    bdkAuthenticationConfig.setCertificate(certificate);

    // Act and Assert
    assertFalse(bdkAuthenticationConfig.isCertificateConfigurationValid());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isCertificateConfigurationValid()}.
   *
   * <p>Method under test: {@link BdkAuthenticationConfig#isCertificateConfigurationValid()}
   */
  @Test
  @DisplayName("Test isCertificateConfigurationValid()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isCertificateConfigurationValid()"})
  void testIsCertificateConfigurationValid6() {
    // Arrange
    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    BdkCertificateConfig certificate = new BdkCertificateConfig("Path", new byte[] {}, "iloveyou");
    bdkAuthenticationConfig.setCertificate(certificate);

    // Act and Assert
    assertTrue(bdkAuthenticationConfig.isCertificateConfigurationValid());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isCertificateConfigurationValid()}.
   *
   * <p>Method under test: {@link BdkAuthenticationConfig#isCertificateConfigurationValid()}
   */
  @Test
  @DisplayName("Test isCertificateConfigurationValid()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isCertificateConfigurationValid()"})
  void testIsCertificateConfigurationValid7() {
    // Arrange
    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificatePath(
        "Found both \"content\" and \"path\" field while configuring certificate authentication, only one"
            + " is allowed");
    BdkCertificateConfig certificate =
        new BdkCertificateConfig("Path", new byte[] {'A', 1, 'A', 1, 'A', 1, 'A', 1}, "iloveyou");
    bdkAuthenticationConfig.setCertificate(certificate);

    // Act and Assert
    assertFalse(bdkAuthenticationConfig.isCertificateConfigurationValid());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isCertificateConfigurationValid()}.
   *
   * <p>Method under test: {@link BdkAuthenticationConfig#isCertificateConfigurationValid()}
   */
  @Test
  @DisplayName("Test isCertificateConfigurationValid()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isCertificateConfigurationValid()"})
  void testIsCertificateConfigurationValid8() {
    // Arrange
    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificateContent(new byte[] {'A', 1, 'A', 1, 'A', 1, 'A', 1});
    BdkCertificateConfig certificate =
        new BdkCertificateConfig("Path", new byte[] {'A', 1, 'A', 1, 'A', 1, 'A', 1}, "iloveyou");
    bdkAuthenticationConfig.setCertificate(certificate);

    // Act and Assert
    assertFalse(bdkAuthenticationConfig.isCertificateConfigurationValid());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isCertificateConfigurationValid()}.
   *
   * <p>Method under test: {@link BdkAuthenticationConfig#isCertificateConfigurationValid()}
   */
  @Test
  @DisplayName("Test isCertificateConfigurationValid()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isCertificateConfigurationValid()"})
  void testIsCertificateConfigurationValid9() {
    // Arrange
    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificateContent(new byte[] {'A', 1, 'A', 1, 'A', 1, 'A', 1});
    bdkAuthenticationConfig.setCertificatePath("Certificate Path");

    // Act and Assert
    assertFalse(bdkAuthenticationConfig.isCertificateConfigurationValid());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isCertificateConfigurationValid()}.
   *
   * <ul>
   *   <li>Given {@link BdkAuthenticationConfig} (default constructor).
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link BdkAuthenticationConfig#isCertificateConfigurationValid()}
   */
  @Test
  @DisplayName(
      "Test isCertificateConfigurationValid(); given BdkAuthenticationConfig (default constructor); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isCertificateConfigurationValid()"})
  void testIsCertificateConfigurationValid_givenBdkAuthenticationConfig_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(new BdkAuthenticationConfig().isCertificateConfigurationValid());
  }

  /**
   * Test {@link BdkAuthenticationConfig#getCertificateConfig()}.
   *
   * <p>Method under test: {@link BdkAuthenticationConfig#getCertificateConfig()}
   */
  @Test
  @DisplayName("Test getCertificateConfig()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkCertificateConfig BdkAuthenticationConfig.getCertificateConfig()"})
  void testGetCertificateConfig() {
    // Arrange
    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    BdkCertificateConfig certificate =
        new BdkCertificateConfig(
            "Certificate should be configured under \"certificate\" field", "iloveyou");
    bdkAuthenticationConfig.setCertificate(certificate);

    // Act and Assert
    assertSame(certificate, bdkAuthenticationConfig.getCertificateConfig());
  }

  /**
   * Test {@link BdkAuthenticationConfig#getCertificateConfig()}.
   *
   * <p>Method under test: {@link BdkAuthenticationConfig#getCertificateConfig()}
   */
  @Test
  @DisplayName("Test getCertificateConfig()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkCertificateConfig BdkAuthenticationConfig.getCertificateConfig()"})
  void testGetCertificateConfig2() {
    // Arrange
    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificate(new BdkCertificateConfig("", "iloveyou"));

    // Act
    BdkCertificateConfig actualCertificateConfig = bdkAuthenticationConfig.getCertificateConfig();

    // Assert
    assertNull(actualCertificateConfig.getContent());
    assertNull(actualCertificateConfig.getPassword());
    assertNull(actualCertificateConfig.getPath());
    assertFalse(actualCertificateConfig.isConfigured());
  }

  /**
   * Test {@link BdkAuthenticationConfig#getCertificateConfig()}.
   *
   * <p>Method under test: {@link BdkAuthenticationConfig#getCertificateConfig()}
   */
  @Test
  @DisplayName("Test getCertificateConfig()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkCertificateConfig BdkAuthenticationConfig.getCertificateConfig()"})
  void testGetCertificateConfig3() {
    // Arrange
    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    BdkCertificateConfig certificate =
        new BdkCertificateConfig("Path", new byte[] {'A', 1, 'A', 1, 'A', 1, 'A', 1}, "iloveyou");
    bdkAuthenticationConfig.setCertificate(certificate);

    // Act and Assert
    assertSame(certificate, bdkAuthenticationConfig.getCertificateConfig());
  }

  /**
   * Test {@link BdkAuthenticationConfig#getCertificateConfig()}.
   *
   * <p>Method under test: {@link BdkAuthenticationConfig#getCertificateConfig()}
   */
  @Test
  @DisplayName("Test getCertificateConfig()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkCertificateConfig BdkAuthenticationConfig.getCertificateConfig()"})
  void testGetCertificateConfig4() {
    // Arrange
    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    BdkCertificateConfig certificate = new BdkCertificateConfig("Path", new byte[] {}, "iloveyou");
    bdkAuthenticationConfig.setCertificate(certificate);

    // Act and Assert
    assertSame(certificate, bdkAuthenticationConfig.getCertificateConfig());
  }

  /**
   * Test {@link BdkAuthenticationConfig#getCertificateConfig()}.
   *
   * <ul>
   *   <li>Given {@link BdkAuthenticationConfig} (default constructor) Certificate is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkAuthenticationConfig#getCertificateConfig()}
   */
  @Test
  @DisplayName(
      "Test getCertificateConfig(); given BdkAuthenticationConfig (default constructor) Certificate is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkCertificateConfig BdkAuthenticationConfig.getCertificateConfig()"})
  void testGetCertificateConfig_givenBdkAuthenticationConfigCertificateIsNull() {
    // Arrange
    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificate(null);

    // Act
    BdkCertificateConfig actualCertificateConfig = bdkAuthenticationConfig.getCertificateConfig();

    // Assert
    assertNull(actualCertificateConfig.getContent());
    assertNull(actualCertificateConfig.getPassword());
    assertNull(actualCertificateConfig.getPath());
    assertFalse(actualCertificateConfig.isConfigured());
  }

  /**
   * Test {@link BdkAuthenticationConfig#getCertificateConfig()}.
   *
   * <ul>
   *   <li>Given {@link BdkAuthenticationConfig} (default constructor).
   *   <li>Then return Content is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkAuthenticationConfig#getCertificateConfig()}
   */
  @Test
  @DisplayName(
      "Test getCertificateConfig(); given BdkAuthenticationConfig (default constructor); then return Content is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkCertificateConfig BdkAuthenticationConfig.getCertificateConfig()"})
  void testGetCertificateConfig_givenBdkAuthenticationConfig_thenReturnContentIsNull() {
    // Arrange and Act
    BdkCertificateConfig actualCertificateConfig =
        new BdkAuthenticationConfig().getCertificateConfig();

    // Assert
    assertNull(actualCertificateConfig.getContent());
    assertNull(actualCertificateConfig.getPassword());
    assertNull(actualCertificateConfig.getPath());
    assertFalse(actualCertificateConfig.isConfigured());
  }

  /**
   * Test new {@link BdkAuthenticationConfig} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link BdkAuthenticationConfig}
   */
  @Test
  @DisplayName("Test new BdkAuthenticationConfig (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BdkAuthenticationConfig.<init>()"})
  void testNewBdkAuthenticationConfig() {
    // Arrange and Act
    BdkAuthenticationConfig actualBdkAuthenticationConfig = new BdkAuthenticationConfig();

    // Assert
    assertNull(actualBdkAuthenticationConfig.getCertificateContent());
    assertNull(actualBdkAuthenticationConfig.getPrivateKeyContent());
    assertNull(actualBdkAuthenticationConfig.getCertificatePassword());
    assertNull(actualBdkAuthenticationConfig.getCertificatePath());
    assertNull(actualBdkAuthenticationConfig.getPrivateKeyPath());
    assertFalse(actualBdkAuthenticationConfig.isBothCertificateAndRsaConfigured());
    assertFalse(actualBdkAuthenticationConfig.isCertificateAuthenticationConfigured());
    assertFalse(actualBdkAuthenticationConfig.isRsaAuthenticationConfigured());
    assertTrue(actualBdkAuthenticationConfig.isCertificateConfigurationValid());
    assertTrue(actualBdkAuthenticationConfig.isRsaConfigurationValid());
  }
}
