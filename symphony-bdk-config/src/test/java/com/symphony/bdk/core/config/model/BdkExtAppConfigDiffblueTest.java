package com.symphony.bdk.core.config.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkExtAppConfigDiffblueTest {
  /**
   * Test {@link BdkExtAppConfig#isConfigured()}.
   * <p>
   * Method under test: {@link BdkExtAppConfig#isConfigured()}
   */
  @Test
  @DisplayName("Test isConfigured()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkExtAppConfig.isConfigured()"})
  void testIsConfigured() {
    // Arrange
    BdkExtAppConfig bdkExtAppConfig = new BdkExtAppConfig();
    bdkExtAppConfig.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    bdkExtAppConfig.setPrivateKeyContent(new byte[]{});
    bdkExtAppConfig.setAppId("42");

    // Act and Assert
    assertTrue(bdkExtAppConfig.isConfigured());
  }

  /**
   * Test {@link BdkExtAppConfig#isConfigured()}.
   * <ul>
   *   <li>Given {@link BdkExtAppConfig} (default constructor) AppId is {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkExtAppConfig#isConfigured()}
   */
  @Test
  @DisplayName("Test isConfigured(); given BdkExtAppConfig (default constructor) AppId is '42'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkExtAppConfig.isConfigured()"})
  void testIsConfigured_givenBdkExtAppConfigAppIdIs42_thenReturnFalse() {
    // Arrange
    BdkExtAppConfig bdkExtAppConfig = new BdkExtAppConfig();
    bdkExtAppConfig.setAppId("42");

    // Act and Assert
    assertFalse(bdkExtAppConfig.isConfigured());
  }

  /**
   * Test {@link BdkExtAppConfig#isConfigured()}.
   * <ul>
   *   <li>Given {@link BdkExtAppConfig} (default constructor) AppId is empty string.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkExtAppConfig#isConfigured()}
   */
  @Test
  @DisplayName("Test isConfigured(); given BdkExtAppConfig (default constructor) AppId is empty string; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkExtAppConfig.isConfigured()"})
  void testIsConfigured_givenBdkExtAppConfigAppIdIsEmptyString_thenReturnFalse() {
    // Arrange
    BdkExtAppConfig bdkExtAppConfig = new BdkExtAppConfig();
    bdkExtAppConfig.setAppId("");

    // Act and Assert
    assertFalse(bdkExtAppConfig.isConfigured());
  }

  /**
   * Test {@link BdkExtAppConfig#isConfigured()}.
   * <ul>
   *   <li>Given {@link BdkExtAppConfig} (default constructor) CertificateContent is {@code AXAXAXAX} Bytes is {@code UTF-8}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkExtAppConfig#isConfigured()}
   */
  @Test
  @DisplayName("Test isConfigured(); given BdkExtAppConfig (default constructor) CertificateContent is 'AXAXAXAX' Bytes is 'UTF-8'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkExtAppConfig.isConfigured()"})
  void testIsConfigured_givenBdkExtAppConfigCertificateContentIsAxaxaxaxBytesIsUtf8()
      throws UnsupportedEncodingException {
    // Arrange
    BdkExtAppConfig bdkExtAppConfig = new BdkExtAppConfig();
    bdkExtAppConfig.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bdkExtAppConfig.setPrivateKeyContent(new byte[]{});
    bdkExtAppConfig.setAppId("42");

    // Act and Assert
    assertFalse(bdkExtAppConfig.isConfigured());
  }

  /**
   * Test {@link BdkExtAppConfig#isConfigured()}.
   * <ul>
   *   <li>Given {@link BdkExtAppConfig} (default constructor) Certificate is {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkExtAppConfig#isConfigured()}
   */
  @Test
  @DisplayName("Test isConfigured(); given BdkExtAppConfig (default constructor) Certificate is 'null'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkExtAppConfig.isConfigured()"})
  void testIsConfigured_givenBdkExtAppConfigCertificateIsNull_thenReturnFalse() {
    // Arrange
    BdkExtAppConfig bdkExtAppConfig = new BdkExtAppConfig();
    bdkExtAppConfig.setCertificate(null);
    bdkExtAppConfig.setPrivateKeyContent(new byte[]{});
    bdkExtAppConfig.setAppId("42");

    // Act and Assert
    assertFalse(bdkExtAppConfig.isConfigured());
  }

  /**
   * Test {@link BdkExtAppConfig#isConfigured()}.
   * <ul>
   *   <li>Given {@link BdkExtAppConfig} (default constructor) CertificatePassword is {@code iloveyou}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkExtAppConfig#isConfigured()}
   */
  @Test
  @DisplayName("Test isConfigured(); given BdkExtAppConfig (default constructor) CertificatePassword is 'iloveyou'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkExtAppConfig.isConfigured()"})
  void testIsConfigured_givenBdkExtAppConfigCertificatePasswordIsIloveyou() {
    // Arrange
    BdkExtAppConfig bdkExtAppConfig = new BdkExtAppConfig();
    bdkExtAppConfig.setCertificatePassword("iloveyou");
    bdkExtAppConfig.setCertificatePath("Certificate Path");
    bdkExtAppConfig.setPrivateKeyContent(new byte[]{});
    bdkExtAppConfig.setAppId("42");

    // Act and Assert
    assertTrue(bdkExtAppConfig.isConfigured());
  }

  /**
   * Test {@link BdkExtAppConfig#isConfigured()}.
   * <ul>
   *   <li>Given {@link BdkExtAppConfig} (default constructor) CertificatePath is {@code Certificate Path}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkExtAppConfig#isConfigured()}
   */
  @Test
  @DisplayName("Test isConfigured(); given BdkExtAppConfig (default constructor) CertificatePath is 'Certificate Path'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkExtAppConfig.isConfigured()"})
  void testIsConfigured_givenBdkExtAppConfigCertificatePathIsCertificatePath() {
    // Arrange
    BdkExtAppConfig bdkExtAppConfig = new BdkExtAppConfig();
    bdkExtAppConfig.setCertificatePath("Certificate Path");
    bdkExtAppConfig.setPrivateKeyContent(new byte[]{});
    bdkExtAppConfig.setAppId("42");

    // Act and Assert
    assertFalse(bdkExtAppConfig.isConfigured());
  }

  /**
   * Test {@link BdkExtAppConfig#isConfigured()}.
   * <ul>
   *   <li>Given {@link BdkExtAppConfig} (default constructor) PrivateKeyContent is {@code AXAXAXAX} Bytes is {@code UTF-8}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkExtAppConfig#isConfigured()}
   */
  @Test
  @DisplayName("Test isConfigured(); given BdkExtAppConfig (default constructor) PrivateKeyContent is 'AXAXAXAX' Bytes is 'UTF-8'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkExtAppConfig.isConfigured()"})
  void testIsConfigured_givenBdkExtAppConfigPrivateKeyContentIsAxaxaxaxBytesIsUtf8()
      throws UnsupportedEncodingException {
    // Arrange
    BdkExtAppConfig bdkExtAppConfig = new BdkExtAppConfig();
    bdkExtAppConfig.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bdkExtAppConfig.setAppId("42");

    // Act and Assert
    assertTrue(bdkExtAppConfig.isConfigured());
  }

  /**
   * Test {@link BdkExtAppConfig#isConfigured()}.
   * <ul>
   *   <li>Given {@link BdkExtAppConfig} (default constructor) PrivateKeyContent is empty array of {@code byte}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkExtAppConfig#isConfigured()}
   */
  @Test
  @DisplayName("Test isConfigured(); given BdkExtAppConfig (default constructor) PrivateKeyContent is empty array of byte")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkExtAppConfig.isConfigured()"})
  void testIsConfigured_givenBdkExtAppConfigPrivateKeyContentIsEmptyArrayOfByte() {
    // Arrange
    BdkExtAppConfig bdkExtAppConfig = new BdkExtAppConfig();
    bdkExtAppConfig.setPrivateKeyContent(new byte[]{});
    bdkExtAppConfig.setAppId("42");

    // Act and Assert
    assertFalse(bdkExtAppConfig.isConfigured());
  }

  /**
   * Test {@link BdkExtAppConfig#isConfigured()}.
   * <ul>
   *   <li>Given {@link BdkExtAppConfig} (default constructor).</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkExtAppConfig#isConfigured()}
   */
  @Test
  @DisplayName("Test isConfigured(); given BdkExtAppConfig (default constructor); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkExtAppConfig.isConfigured()"})
  void testIsConfigured_givenBdkExtAppConfig_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new BdkExtAppConfig()).isConfigured());
  }

  /**
   * Test {@link BdkExtAppConfig#isConfigured()}.
   * <ul>
   *   <li>Given {@link BdkRsaKeyConfig} (default constructor) Content is {@code AXAXAXAX} Bytes is {@code UTF-8}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkExtAppConfig#isConfigured()}
   */
  @Test
  @DisplayName("Test isConfigured(); given BdkRsaKeyConfig (default constructor) Content is 'AXAXAXAX' Bytes is 'UTF-8'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkExtAppConfig.isConfigured()"})
  void testIsConfigured_givenBdkRsaKeyConfigContentIsAxaxaxaxBytesIsUtf8_thenReturnTrue()
      throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkExtAppConfig bdkExtAppConfig = new BdkExtAppConfig();
    bdkExtAppConfig.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    bdkExtAppConfig.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bdkExtAppConfig.setCertificatePassword("iloveyou");
    bdkExtAppConfig.setCertificatePath("Certificate Path");
    bdkExtAppConfig.setPrivateKey(privateKey);
    bdkExtAppConfig.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bdkExtAppConfig.setPrivateKeyPath("Private Key Path");
    bdkExtAppConfig.setAppId("foo");

    // Act and Assert
    assertTrue(bdkExtAppConfig.isConfigured());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BdkExtAppConfig#setAppId(String)}
   *   <li>{@link BdkExtAppConfig#getAppId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String BdkExtAppConfig.getAppId()", "void BdkExtAppConfig.setAppId(String)"})
  void testGettersAndSetters() {
    // Arrange
    BdkExtAppConfig bdkExtAppConfig = new BdkExtAppConfig();

    // Act
    bdkExtAppConfig.setAppId("42");

    // Assert
    assertEquals("42", bdkExtAppConfig.getAppId());
  }

  /**
   * Test new {@link BdkExtAppConfig} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link BdkExtAppConfig}
   */
  @Test
  @DisplayName("Test new BdkExtAppConfig (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BdkExtAppConfig.<init>()"})
  void testNewBdkExtAppConfig() {
    // Arrange and Act
    BdkExtAppConfig actualBdkExtAppConfig = new BdkExtAppConfig();

    // Assert
    assertNull(actualBdkExtAppConfig.getCertificateContent());
    assertNull(actualBdkExtAppConfig.getPrivateKeyContent());
    assertNull(actualBdkExtAppConfig.getCertificatePassword());
    assertNull(actualBdkExtAppConfig.getCertificatePath());
    assertNull(actualBdkExtAppConfig.getPrivateKeyPath());
    assertNull(actualBdkExtAppConfig.getAppId());
    assertFalse(actualBdkExtAppConfig.isBothCertificateAndRsaConfigured());
    assertFalse(actualBdkExtAppConfig.isCertificateAuthenticationConfigured());
    assertFalse(actualBdkExtAppConfig.isRsaAuthenticationConfigured());
    assertFalse(actualBdkExtAppConfig.isConfigured());
    assertTrue(actualBdkExtAppConfig.isCertificateConfigurationValid());
    assertTrue(actualBdkExtAppConfig.isRsaConfigurationValid());
  }
}
