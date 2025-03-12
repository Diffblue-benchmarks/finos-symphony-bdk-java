package com.symphony.bdk.core.config.model;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkAuthenticationConfigDiffblueTest {
  /**
   * Test {@link BdkAuthenticationConfig#isRsaAuthenticationConfigured()}.
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#isRsaAuthenticationConfigured()}
   */
  @Test
  @DisplayName("Test isRsaAuthenticationConfigured()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isRsaAuthenticationConfigured()"})
  void testIsRsaAuthenticationConfigured() throws UnsupportedEncodingException {
    // Arrange
    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    bdkAuthenticationConfig.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bdkAuthenticationConfig.setCertificatePassword("iloveyou");
    bdkAuthenticationConfig.setCertificatePath("Certificate Path");
    bdkAuthenticationConfig.setPrivateKey(null);
    bdkAuthenticationConfig.setPrivateKeyPath(null);
    bdkAuthenticationConfig.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));

    // Act and Assert
    assertTrue(bdkAuthenticationConfig.isRsaAuthenticationConfigured());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isRsaAuthenticationConfigured()}.
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#isRsaAuthenticationConfigured()}
   */
  @Test
  @DisplayName("Test isRsaAuthenticationConfigured()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isRsaAuthenticationConfigured()"})
  void testIsRsaAuthenticationConfigured2() throws UnsupportedEncodingException {
    // Arrange
    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    bdkAuthenticationConfig.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bdkAuthenticationConfig.setCertificatePassword("iloveyou");
    bdkAuthenticationConfig.setCertificatePath("Certificate Path");
    bdkAuthenticationConfig.setPrivateKey(null);
    bdkAuthenticationConfig.setPrivateKeyPath("foo");
    bdkAuthenticationConfig.setPrivateKeyContent(null);

    // Act and Assert
    assertTrue(bdkAuthenticationConfig.isRsaAuthenticationConfigured());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isRsaAuthenticationConfigured()}.
   * <ul>
   *   <li>Given {@link BdkAuthenticationConfig} (default constructor).</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#isRsaAuthenticationConfigured()}
   */
  @Test
  @DisplayName("Test isRsaAuthenticationConfigured(); given BdkAuthenticationConfig (default constructor); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isRsaAuthenticationConfigured()"})
  void testIsRsaAuthenticationConfigured_givenBdkAuthenticationConfig_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new BdkAuthenticationConfig()).isRsaAuthenticationConfigured());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isRsaAuthenticationConfigured()}.
   * <ul>
   *   <li>Given {@link BdkRsaKeyConfig} (default constructor) Path is {@code null}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#isRsaAuthenticationConfigured()}
   */
  @Test
  @DisplayName("Test isRsaAuthenticationConfigured(); given BdkRsaKeyConfig (default constructor) Path is 'null'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isRsaAuthenticationConfigured()"})
  void testIsRsaAuthenticationConfigured_givenBdkRsaKeyConfigPathIsNull_thenReturnTrue()
      throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setPath(null);
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));

    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    bdkAuthenticationConfig.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bdkAuthenticationConfig.setCertificatePassword("iloveyou");
    bdkAuthenticationConfig.setCertificatePath("Certificate Path");
    bdkAuthenticationConfig.setPrivateKey(privateKey);
    bdkAuthenticationConfig.setPrivateKeyPath(null);
    bdkAuthenticationConfig.setPrivateKeyContent(null);

    // Act and Assert
    assertTrue(bdkAuthenticationConfig.isRsaAuthenticationConfigured());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isRsaAuthenticationConfigured()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#isRsaAuthenticationConfigured()}
   */
  @Test
  @DisplayName("Test isRsaAuthenticationConfigured(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isRsaAuthenticationConfigured()"})
  void testIsRsaAuthenticationConfigured_thenReturnFalse() throws UnsupportedEncodingException {
    // Arrange
    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    bdkAuthenticationConfig.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bdkAuthenticationConfig.setCertificatePassword("iloveyou");
    bdkAuthenticationConfig.setCertificatePath("Certificate Path");
    bdkAuthenticationConfig.setPrivateKey(null);
    bdkAuthenticationConfig.setPrivateKeyPath(null);
    bdkAuthenticationConfig.setPrivateKeyContent(null);

    // Act and Assert
    assertFalse(bdkAuthenticationConfig.isRsaAuthenticationConfigured());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isRsaConfigurationValid()}.
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#isRsaConfigurationValid()}
   */
  @Test
  @DisplayName("Test isRsaConfigurationValid()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isRsaConfigurationValid()"})
  void testIsRsaConfigurationValid() throws UnsupportedEncodingException {
    // Arrange
    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    bdkAuthenticationConfig.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bdkAuthenticationConfig.setCertificatePassword("iloveyou");
    bdkAuthenticationConfig.setCertificatePath("Certificate Path");
    bdkAuthenticationConfig.setPrivateKey(null);
    bdkAuthenticationConfig.setPrivateKeyPath("foo");
    bdkAuthenticationConfig.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));

    // Act and Assert
    assertFalse(bdkAuthenticationConfig.isRsaConfigurationValid());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isRsaConfigurationValid()}.
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#isRsaConfigurationValid()}
   */
  @Test
  @DisplayName("Test isRsaConfigurationValid()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isRsaConfigurationValid()"})
  void testIsRsaConfigurationValid2() throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setPath(null);
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));

    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    bdkAuthenticationConfig.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bdkAuthenticationConfig.setCertificatePassword("iloveyou");
    bdkAuthenticationConfig.setCertificatePath("Certificate Path");
    bdkAuthenticationConfig.setPrivateKey(privateKey);
    bdkAuthenticationConfig.setPrivateKeyPath(null);
    bdkAuthenticationConfig.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));

    // Act and Assert
    assertFalse(bdkAuthenticationConfig.isRsaConfigurationValid());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isRsaConfigurationValid()}.
   * <ul>
   *   <li>Given {@link BdkAuthenticationConfig} (default constructor) PrivateKey is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#isRsaConfigurationValid()}
   */
  @Test
  @DisplayName("Test isRsaConfigurationValid(); given BdkAuthenticationConfig (default constructor) PrivateKey is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isRsaConfigurationValid()"})
  void testIsRsaConfigurationValid_givenBdkAuthenticationConfigPrivateKeyIsNull() throws UnsupportedEncodingException {
    // Arrange
    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    bdkAuthenticationConfig.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bdkAuthenticationConfig.setCertificatePassword("iloveyou");
    bdkAuthenticationConfig.setCertificatePath("Certificate Path");
    bdkAuthenticationConfig.setPrivateKey(null);
    bdkAuthenticationConfig.setPrivateKeyPath(null);
    bdkAuthenticationConfig.setPrivateKeyContent(null);

    // Act and Assert
    assertTrue(bdkAuthenticationConfig.isRsaConfigurationValid());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isRsaConfigurationValid()}.
   * <ul>
   *   <li>Given {@link BdkAuthenticationConfig} (default constructor) PrivateKey is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#isRsaConfigurationValid()}
   */
  @Test
  @DisplayName("Test isRsaConfigurationValid(); given BdkAuthenticationConfig (default constructor) PrivateKey is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isRsaConfigurationValid()"})
  void testIsRsaConfigurationValid_givenBdkAuthenticationConfigPrivateKeyIsNull2() throws UnsupportedEncodingException {
    // Arrange
    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    bdkAuthenticationConfig.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bdkAuthenticationConfig.setCertificatePassword("iloveyou");
    bdkAuthenticationConfig.setCertificatePath("Certificate Path");
    bdkAuthenticationConfig.setPrivateKey(null);
    bdkAuthenticationConfig.setPrivateKeyPath("foo");
    bdkAuthenticationConfig.setPrivateKeyContent(null);

    // Act and Assert
    assertTrue(bdkAuthenticationConfig.isRsaConfigurationValid());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isRsaConfigurationValid()}.
   * <ul>
   *   <li>Given {@link BdkAuthenticationConfig} (default constructor).</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#isRsaConfigurationValid()}
   */
  @Test
  @DisplayName("Test isRsaConfigurationValid(); given BdkAuthenticationConfig (default constructor); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isRsaConfigurationValid()"})
  void testIsRsaConfigurationValid_givenBdkAuthenticationConfig_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new BdkAuthenticationConfig()).isRsaConfigurationValid());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isRsaConfigurationValid()}.
   * <ul>
   *   <li>Given {@link BdkRsaKeyConfig} (default constructor) Path is {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#isRsaConfigurationValid()}
   */
  @Test
  @DisplayName("Test isRsaConfigurationValid(); given BdkRsaKeyConfig (default constructor) Path is 'null'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isRsaConfigurationValid()"})
  void testIsRsaConfigurationValid_givenBdkRsaKeyConfigPathIsNull_thenReturnFalse()
      throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setPath(null);
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));

    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    bdkAuthenticationConfig.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bdkAuthenticationConfig.setCertificatePassword("iloveyou");
    bdkAuthenticationConfig.setCertificatePath("Certificate Path");
    bdkAuthenticationConfig.setPrivateKey(privateKey);
    bdkAuthenticationConfig.setPrivateKeyPath("foo");
    bdkAuthenticationConfig.setPrivateKeyContent(null);

    // Act and Assert
    assertFalse(bdkAuthenticationConfig.isRsaConfigurationValid());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isRsaConfigurationValid()}.
   * <ul>
   *   <li>Given {@link BdkRsaKeyConfig} (default constructor) Path is {@code null}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#isRsaConfigurationValid()}
   */
  @Test
  @DisplayName("Test isRsaConfigurationValid(); given BdkRsaKeyConfig (default constructor) Path is 'null'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isRsaConfigurationValid()"})
  void testIsRsaConfigurationValid_givenBdkRsaKeyConfigPathIsNull_thenReturnTrue() throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setPath(null);
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));

    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    bdkAuthenticationConfig.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bdkAuthenticationConfig.setCertificatePassword("iloveyou");
    bdkAuthenticationConfig.setCertificatePath("Certificate Path");
    bdkAuthenticationConfig.setPrivateKey(privateKey);
    bdkAuthenticationConfig.setPrivateKeyPath(null);
    bdkAuthenticationConfig.setPrivateKeyContent(null);

    // Act and Assert
    assertTrue(bdkAuthenticationConfig.isRsaConfigurationValid());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isCertificateAuthenticationConfigured()}.
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#isCertificateAuthenticationConfigured()}
   */
  @Test
  @DisplayName("Test isCertificateAuthenticationConfigured()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isCertificateAuthenticationConfigured()"})
  void testIsCertificateAuthenticationConfigured() throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setPrivateKey(privateKey);
    bdkAuthenticationConfig.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bdkAuthenticationConfig.setPrivateKeyPath("Private Key Path");
    bdkAuthenticationConfig.setCertificate(null);
    bdkAuthenticationConfig.setCertificatePassword(null);
    bdkAuthenticationConfig.setCertificateContent(null);
    bdkAuthenticationConfig.setCertificatePath(null);

    // Act and Assert
    assertFalse(bdkAuthenticationConfig.isCertificateAuthenticationConfigured());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isCertificateAuthenticationConfigured()}.
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#isCertificateAuthenticationConfigured()}
   */
  @Test
  @DisplayName("Test isCertificateAuthenticationConfigured()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isCertificateAuthenticationConfigured()"})
  void testIsCertificateAuthenticationConfigured2() throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setPrivateKey(privateKey);
    bdkAuthenticationConfig.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bdkAuthenticationConfig.setPrivateKeyPath("Private Key Path");
    bdkAuthenticationConfig.setCertificate(null);
    bdkAuthenticationConfig.setCertificatePassword(null);
    bdkAuthenticationConfig.setCertificateContent(null);
    bdkAuthenticationConfig.setCertificatePath("foo");

    // Act and Assert
    assertFalse(bdkAuthenticationConfig.isCertificateAuthenticationConfigured());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isCertificateAuthenticationConfigured()}.
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#isCertificateAuthenticationConfigured()}
   */
  @Test
  @DisplayName("Test isCertificateAuthenticationConfigured()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isCertificateAuthenticationConfigured()"})
  void testIsCertificateAuthenticationConfigured3() throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setPrivateKey(privateKey);
    bdkAuthenticationConfig.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bdkAuthenticationConfig.setPrivateKeyPath("Private Key Path");
    bdkAuthenticationConfig.setCertificate(null);
    bdkAuthenticationConfig.setCertificatePassword(null);
    bdkAuthenticationConfig.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bdkAuthenticationConfig.setCertificatePath(null);

    // Act and Assert
    assertFalse(bdkAuthenticationConfig.isCertificateAuthenticationConfigured());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isCertificateAuthenticationConfigured()}.
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#isCertificateAuthenticationConfigured()}
   */
  @Test
  @DisplayName("Test isCertificateAuthenticationConfigured()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isCertificateAuthenticationConfigured()"})
  void testIsCertificateAuthenticationConfigured4() throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setPrivateKey(privateKey);
    bdkAuthenticationConfig.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bdkAuthenticationConfig.setPrivateKeyPath("Private Key Path");
    bdkAuthenticationConfig.setCertificate(null);
    bdkAuthenticationConfig.setCertificatePassword("foo");
    bdkAuthenticationConfig.setCertificateContent(null);
    bdkAuthenticationConfig.setCertificatePath("foo");

    // Act and Assert
    assertTrue(bdkAuthenticationConfig.isCertificateAuthenticationConfigured());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isCertificateAuthenticationConfigured()}.
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#isCertificateAuthenticationConfigured()}
   */
  @Test
  @DisplayName("Test isCertificateAuthenticationConfigured()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isCertificateAuthenticationConfigured()"})
  void testIsCertificateAuthenticationConfigured5() throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setPrivateKey(privateKey);
    bdkAuthenticationConfig.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bdkAuthenticationConfig.setPrivateKeyPath("Private Key Path");
    bdkAuthenticationConfig.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    bdkAuthenticationConfig.setCertificatePassword(null);
    bdkAuthenticationConfig.setCertificateContent(null);
    bdkAuthenticationConfig.setCertificatePath(null);

    // Act and Assert
    assertTrue(bdkAuthenticationConfig.isCertificateAuthenticationConfigured());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isCertificateAuthenticationConfigured()}.
   * <ul>
   *   <li>Given {@link BdkAuthenticationConfig} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#isCertificateAuthenticationConfigured()}
   */
  @Test
  @DisplayName("Test isCertificateAuthenticationConfigured(); given BdkAuthenticationConfig (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isCertificateAuthenticationConfigured()"})
  void testIsCertificateAuthenticationConfigured_givenBdkAuthenticationConfig() {
    // Arrange, Act and Assert
    assertFalse((new BdkAuthenticationConfig()).isCertificateAuthenticationConfigured());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isCertificateConfigurationValid()}.
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#isCertificateConfigurationValid()}
   */
  @Test
  @DisplayName("Test isCertificateConfigurationValid()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isCertificateConfigurationValid()"})
  void testIsCertificateConfigurationValid() throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificatePassword("iloveyou");
    bdkAuthenticationConfig.setPrivateKey(privateKey);
    bdkAuthenticationConfig.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bdkAuthenticationConfig.setPrivateKeyPath("Private Key Path");
    bdkAuthenticationConfig.setCertificate(null);
    bdkAuthenticationConfig.setCertificateContent(null);
    bdkAuthenticationConfig.setCertificatePath(null);

    // Act and Assert
    assertTrue(bdkAuthenticationConfig.isCertificateConfigurationValid());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isCertificateConfigurationValid()}.
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#isCertificateConfigurationValid()}
   */
  @Test
  @DisplayName("Test isCertificateConfigurationValid()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isCertificateConfigurationValid()"})
  void testIsCertificateConfigurationValid2() throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificatePassword("iloveyou");
    bdkAuthenticationConfig.setPrivateKey(privateKey);
    bdkAuthenticationConfig.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bdkAuthenticationConfig.setPrivateKeyPath("Private Key Path");
    bdkAuthenticationConfig.setCertificate(null);
    bdkAuthenticationConfig.setCertificateContent(null);
    bdkAuthenticationConfig.setCertificatePath("foo");

    // Act and Assert
    assertTrue(bdkAuthenticationConfig.isCertificateConfigurationValid());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isCertificateConfigurationValid()}.
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#isCertificateConfigurationValid()}
   */
  @Test
  @DisplayName("Test isCertificateConfigurationValid()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isCertificateConfigurationValid()"})
  void testIsCertificateConfigurationValid3() throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificatePassword("iloveyou");
    bdkAuthenticationConfig.setPrivateKey(privateKey);
    bdkAuthenticationConfig.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bdkAuthenticationConfig.setPrivateKeyPath("Private Key Path");
    bdkAuthenticationConfig.setCertificate(null);
    bdkAuthenticationConfig.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bdkAuthenticationConfig.setCertificatePath("foo");

    // Act and Assert
    assertFalse(bdkAuthenticationConfig.isCertificateConfigurationValid());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isCertificateConfigurationValid()}.
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#isCertificateConfigurationValid()}
   */
  @Test
  @DisplayName("Test isCertificateConfigurationValid()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isCertificateConfigurationValid()"})
  void testIsCertificateConfigurationValid4() throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificatePassword("iloveyou");
    bdkAuthenticationConfig.setPrivateKey(privateKey);
    bdkAuthenticationConfig.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bdkAuthenticationConfig.setPrivateKeyPath("Private Key Path");
    bdkAuthenticationConfig.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    bdkAuthenticationConfig.setCertificateContent(null);
    bdkAuthenticationConfig.setCertificatePath(null);

    // Act and Assert
    assertTrue(bdkAuthenticationConfig.isCertificateConfigurationValid());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isCertificateConfigurationValid()}.
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#isCertificateConfigurationValid()}
   */
  @Test
  @DisplayName("Test isCertificateConfigurationValid()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isCertificateConfigurationValid()"})
  void testIsCertificateConfigurationValid5() throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificatePassword("iloveyou");
    bdkAuthenticationConfig.setPrivateKey(privateKey);
    bdkAuthenticationConfig.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bdkAuthenticationConfig.setPrivateKeyPath("Private Key Path");
    bdkAuthenticationConfig.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    bdkAuthenticationConfig.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bdkAuthenticationConfig.setCertificatePath(null);

    // Act and Assert
    assertFalse(bdkAuthenticationConfig.isCertificateConfigurationValid());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isCertificateConfigurationValid()}.
   * <ul>
   *   <li>Given {@link BdkAuthenticationConfig} (default constructor).</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#isCertificateConfigurationValid()}
   */
  @Test
  @DisplayName("Test isCertificateConfigurationValid(); given BdkAuthenticationConfig (default constructor); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isCertificateConfigurationValid()"})
  void testIsCertificateConfigurationValid_givenBdkAuthenticationConfig_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new BdkAuthenticationConfig()).isCertificateConfigurationValid());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isCertificateConfigurationValid()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#isCertificateConfigurationValid()}
   */
  @Test
  @DisplayName("Test isCertificateConfigurationValid(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isCertificateConfigurationValid()"})
  void testIsCertificateConfigurationValid_thenReturnFalse() throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificatePassword("iloveyou");
    bdkAuthenticationConfig.setPrivateKey(privateKey);
    bdkAuthenticationConfig.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bdkAuthenticationConfig.setPrivateKeyPath("Private Key Path");
    bdkAuthenticationConfig.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    bdkAuthenticationConfig.setCertificateContent(null);
    bdkAuthenticationConfig.setCertificatePath("foo");

    // Act and Assert
    assertFalse(bdkAuthenticationConfig.isCertificateConfigurationValid());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isBothCertificateAndRsaConfigured()}.
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#isBothCertificateAndRsaConfigured()}
   */
  @Test
  @DisplayName("Test isBothCertificateAndRsaConfigured()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isBothCertificateAndRsaConfigured()"})
  void testIsBothCertificateAndRsaConfigured() {
    // Arrange
    BdkCertificateConfig certificate = new BdkCertificateConfig("Path", "iloveyou");
    certificate.setPath(null);
    certificate.setPassword(null);
    certificate.setContent(null);

    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent(null);
    privateKey.setPath(null);

    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificate(certificate);
    bdkAuthenticationConfig.setCertificatePath(null);
    bdkAuthenticationConfig.setPrivateKey(privateKey);
    bdkAuthenticationConfig.setPrivateKeyContent(null);
    bdkAuthenticationConfig.setCertificateContent(null);
    bdkAuthenticationConfig.setPrivateKeyPath("foo");
    bdkAuthenticationConfig.setCertificatePassword(null);

    // Act and Assert
    assertFalse(bdkAuthenticationConfig.isBothCertificateAndRsaConfigured());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isBothCertificateAndRsaConfigured()}.
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#isBothCertificateAndRsaConfigured()}
   */
  @Test
  @DisplayName("Test isBothCertificateAndRsaConfigured()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isBothCertificateAndRsaConfigured()"})
  void testIsBothCertificateAndRsaConfigured2() throws UnsupportedEncodingException {
    // Arrange
    BdkCertificateConfig certificate = new BdkCertificateConfig("Path", "iloveyou");
    certificate.setPath(null);
    certificate.setPassword(null);
    certificate.setContent(null);

    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent(null);
    privateKey.setPath(null);

    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificate(certificate);
    bdkAuthenticationConfig.setCertificatePath(null);
    bdkAuthenticationConfig.setPrivateKey(privateKey);
    bdkAuthenticationConfig.setPrivateKeyContent(null);
    bdkAuthenticationConfig.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bdkAuthenticationConfig.setPrivateKeyPath("foo");
    bdkAuthenticationConfig.setCertificatePassword(null);

    // Act and Assert
    assertFalse(bdkAuthenticationConfig.isBothCertificateAndRsaConfigured());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isBothCertificateAndRsaConfigured()}.
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#isBothCertificateAndRsaConfigured()}
   */
  @Test
  @DisplayName("Test isBothCertificateAndRsaConfigured()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isBothCertificateAndRsaConfigured()"})
  void testIsBothCertificateAndRsaConfigured3() throws UnsupportedEncodingException {
    // Arrange
    BdkCertificateConfig certificate = new BdkCertificateConfig("Path", "iloveyou");
    certificate.setPath(null);
    certificate.setPassword(null);
    certificate.setContent(null);

    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent(null);
    privateKey.setPath(null);

    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificate(certificate);
    bdkAuthenticationConfig.setCertificatePath(null);
    bdkAuthenticationConfig.setPrivateKey(privateKey);
    bdkAuthenticationConfig.setPrivateKeyContent(null);
    bdkAuthenticationConfig.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bdkAuthenticationConfig.setPrivateKeyPath("foo");
    bdkAuthenticationConfig.setCertificatePassword("foo");

    // Act and Assert
    assertTrue(bdkAuthenticationConfig.isBothCertificateAndRsaConfigured());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isBothCertificateAndRsaConfigured()}.
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#isBothCertificateAndRsaConfigured()}
   */
  @Test
  @DisplayName("Test isBothCertificateAndRsaConfigured()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isBothCertificateAndRsaConfigured()"})
  void testIsBothCertificateAndRsaConfigured4() throws UnsupportedEncodingException {
    // Arrange
    BdkCertificateConfig certificate = new BdkCertificateConfig("Path", "iloveyou");
    certificate.setPath(null);
    certificate.setPassword(null);
    certificate.setContent(null);

    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent(null);
    privateKey.setPath(null);

    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificate(certificate);
    bdkAuthenticationConfig.setCertificatePath(null);
    bdkAuthenticationConfig.setPrivateKey(privateKey);
    bdkAuthenticationConfig.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bdkAuthenticationConfig.setCertificateContent(null);
    bdkAuthenticationConfig.setPrivateKeyPath(null);
    bdkAuthenticationConfig.setCertificatePassword(null);

    // Act and Assert
    assertFalse(bdkAuthenticationConfig.isBothCertificateAndRsaConfigured());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isBothCertificateAndRsaConfigured()}.
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#isBothCertificateAndRsaConfigured()}
   */
  @Test
  @DisplayName("Test isBothCertificateAndRsaConfigured()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isBothCertificateAndRsaConfigured()"})
  void testIsBothCertificateAndRsaConfigured5() throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkBotConfig bdkBotConfig = new BdkBotConfig();
    bdkBotConfig.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    bdkBotConfig.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bdkBotConfig.setCertificatePassword("iloveyou");
    bdkBotConfig.setCertificatePath("Certificate Path");
    bdkBotConfig.setPrivateKey(privateKey);
    bdkBotConfig.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bdkBotConfig.setPrivateKeyPath("Private Key Path");
    bdkBotConfig.setUsername("janedoe");

    // Act and Assert
    assertTrue(bdkBotConfig.isBothCertificateAndRsaConfigured());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isBothCertificateAndRsaConfigured()}.
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#isBothCertificateAndRsaConfigured()}
   */
  @Test
  @DisplayName("Test isBothCertificateAndRsaConfigured()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isBothCertificateAndRsaConfigured()"})
  void testIsBothCertificateAndRsaConfigured6() throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkBotConfig bdkBotConfig = new BdkBotConfig();
    bdkBotConfig.setCertificate(new BdkCertificateConfig(null, "iloveyou"));
    bdkBotConfig.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bdkBotConfig.setCertificatePassword("iloveyou");
    bdkBotConfig.setCertificatePath("Certificate Path");
    bdkBotConfig.setPrivateKey(privateKey);
    bdkBotConfig.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bdkBotConfig.setPrivateKeyPath("Private Key Path");
    bdkBotConfig.setUsername("janedoe");

    // Act and Assert
    assertTrue(bdkBotConfig.isBothCertificateAndRsaConfigured());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isBothCertificateAndRsaConfigured()}.
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#isBothCertificateAndRsaConfigured()}
   */
  @Test
  @DisplayName("Test isBothCertificateAndRsaConfigured()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isBothCertificateAndRsaConfigured()"})
  void testIsBothCertificateAndRsaConfigured7() throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkBotConfig bdkBotConfig = new BdkBotConfig();
    bdkBotConfig.setCertificate(new BdkCertificateConfig("", "iloveyou"));
    bdkBotConfig.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bdkBotConfig.setCertificatePassword("iloveyou");
    bdkBotConfig.setCertificatePath("Certificate Path");
    bdkBotConfig.setPrivateKey(privateKey);
    bdkBotConfig.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bdkBotConfig.setPrivateKeyPath("Private Key Path");
    bdkBotConfig.setUsername("janedoe");

    // Act and Assert
    assertTrue(bdkBotConfig.isBothCertificateAndRsaConfigured());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isBothCertificateAndRsaConfigured()}.
   * <ul>
   *   <li>Given {@link BdkAuthenticationConfig} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#isBothCertificateAndRsaConfigured()}
   */
  @Test
  @DisplayName("Test isBothCertificateAndRsaConfigured(); given BdkAuthenticationConfig (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isBothCertificateAndRsaConfigured()"})
  void testIsBothCertificateAndRsaConfigured_givenBdkAuthenticationConfig() {
    // Arrange, Act and Assert
    assertFalse((new BdkAuthenticationConfig()).isBothCertificateAndRsaConfigured());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isBothCertificateAndRsaConfigured()}.
   * <ul>
   *   <li>Given {@link BdkBotConfig} (default constructor) Certificate is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#isBothCertificateAndRsaConfigured()}
   */
  @Test
  @DisplayName("Test isBothCertificateAndRsaConfigured(); given BdkBotConfig (default constructor) Certificate is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isBothCertificateAndRsaConfigured()"})
  void testIsBothCertificateAndRsaConfigured_givenBdkBotConfigCertificateIsNull() throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkBotConfig bdkBotConfig = new BdkBotConfig();
    bdkBotConfig.setCertificate(null);
    bdkBotConfig.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bdkBotConfig.setCertificatePassword("iloveyou");
    bdkBotConfig.setCertificatePath("Certificate Path");
    bdkBotConfig.setPrivateKey(privateKey);
    bdkBotConfig.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bdkBotConfig.setPrivateKeyPath("Private Key Path");
    bdkBotConfig.setUsername("janedoe");

    // Act and Assert
    assertTrue(bdkBotConfig.isBothCertificateAndRsaConfigured());
  }

  /**
   * Test {@link BdkAuthenticationConfig#isBothCertificateAndRsaConfigured()}.
   * <ul>
   *   <li>Given {@link BdkRsaKeyConfig} (default constructor) Path is {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#isBothCertificateAndRsaConfigured()}
   */
  @Test
  @DisplayName("Test isBothCertificateAndRsaConfigured(); given BdkRsaKeyConfig (default constructor) Path is 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkAuthenticationConfig.isBothCertificateAndRsaConfigured()"})
  void testIsBothCertificateAndRsaConfigured_givenBdkRsaKeyConfigPathIsFoo() {
    // Arrange
    BdkCertificateConfig certificate = new BdkCertificateConfig("Path", "iloveyou");
    certificate.setPath(null);
    certificate.setPassword(null);
    certificate.setContent(null);

    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent(null);
    privateKey.setPath("foo");

    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificate(certificate);
    bdkAuthenticationConfig.setCertificatePath(null);
    bdkAuthenticationConfig.setPrivateKey(privateKey);
    bdkAuthenticationConfig.setPrivateKeyContent(null);
    bdkAuthenticationConfig.setCertificateContent(null);
    bdkAuthenticationConfig.setPrivateKeyPath(null);
    bdkAuthenticationConfig.setCertificatePassword(null);

    // Act and Assert
    assertFalse(bdkAuthenticationConfig.isBothCertificateAndRsaConfigured());
  }

  /**
   * Test {@link BdkAuthenticationConfig#getCertificateConfig()}.
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#getCertificateConfig()}
   */
  @Test
  @DisplayName("Test getCertificateConfig()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"BdkCertificateConfig BdkAuthenticationConfig.getCertificateConfig()"})
  void testGetCertificateConfig() throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bdkAuthenticationConfig.setCertificatePassword("iloveyou");
    bdkAuthenticationConfig.setCertificatePath("Certificate Path");
    bdkAuthenticationConfig.setPrivateKey(privateKey);
    bdkAuthenticationConfig.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bdkAuthenticationConfig.setPrivateKeyPath("Private Key Path");
    BdkCertificateConfig certificate = new BdkCertificateConfig("Path", "iloveyou");

    bdkAuthenticationConfig.setCertificate(certificate);

    // Act and Assert
    assertSame(certificate, bdkAuthenticationConfig.getCertificateConfig());
  }

  /**
   * Test {@link BdkAuthenticationConfig#getCertificateConfig()}.
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#getCertificateConfig()}
   */
  @Test
  @DisplayName("Test getCertificateConfig()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"BdkCertificateConfig BdkAuthenticationConfig.getCertificateConfig()"})
  void testGetCertificateConfig2() throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkCertificateConfig certificate = new BdkCertificateConfig("Path", "iloveyou");
    certificate.setContent("AXAXAXAX".getBytes("UTF-8"));
    certificate.setPath(null);
    certificate.setPassword(null);

    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bdkAuthenticationConfig.setCertificatePassword("iloveyou");
    bdkAuthenticationConfig.setCertificatePath("Certificate Path");
    bdkAuthenticationConfig.setPrivateKey(privateKey);
    bdkAuthenticationConfig.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bdkAuthenticationConfig.setPrivateKeyPath("Private Key Path");
    bdkAuthenticationConfig.setCertificate(certificate);

    // Act
    BdkCertificateConfig actualCertificateConfig = bdkAuthenticationConfig.getCertificateConfig();

    // Assert
    assertEquals("Certificate Path", actualCertificateConfig.getPath());
    assertFalse(actualCertificateConfig.isValid());
    byte[] certificateBytes = actualCertificateConfig.getCertificateBytes();
    assertSame(certificateBytes, actualCertificateConfig.getContent());
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), certificateBytes);
  }

  /**
   * Test {@link BdkAuthenticationConfig#getCertificateConfig()}.
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#getCertificateConfig()}
   */
  @Test
  @DisplayName("Test getCertificateConfig()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"BdkCertificateConfig BdkAuthenticationConfig.getCertificateConfig()"})
  void testGetCertificateConfig3() throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Certificate should be configured under \"certificate\" field");

    BdkBotConfig bdkBotConfig = new BdkBotConfig();
    bdkBotConfig.setCertificate(new BdkCertificateConfig("", "iloveyou"));
    bdkBotConfig.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bdkBotConfig.setCertificatePassword("iloveyou");
    bdkBotConfig.setCertificatePath("Certificate should be configured under \"certificate\" field");
    bdkBotConfig.setPrivateKey(privateKey);
    bdkBotConfig.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bdkBotConfig.setPrivateKeyPath("Certificate should be configured under \"certificate\" field");
    bdkBotConfig.setUsername("janedoe");

    // Act
    BdkCertificateConfig actualCertificateConfig = bdkBotConfig.getCertificateConfig();

    // Assert
    assertEquals("Certificate should be configured under \"certificate\" field", actualCertificateConfig.getPath());
    assertFalse(actualCertificateConfig.isValid());
    byte[] certificateBytes = actualCertificateConfig.getCertificateBytes();
    assertSame(certificateBytes, actualCertificateConfig.getContent());
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), certificateBytes);
  }

  /**
   * Test {@link BdkAuthenticationConfig#getCertificateConfig()}.
   * <ul>
   *   <li>Given {@link BdkAuthenticationConfig} (default constructor) Certificate is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#getCertificateConfig()}
   */
  @Test
  @DisplayName("Test getCertificateConfig(); given BdkAuthenticationConfig (default constructor) Certificate is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"BdkCertificateConfig BdkAuthenticationConfig.getCertificateConfig()"})
  void testGetCertificateConfig_givenBdkAuthenticationConfigCertificateIsNull() throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    bdkAuthenticationConfig.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bdkAuthenticationConfig.setCertificatePassword("iloveyou");
    bdkAuthenticationConfig.setCertificatePath("Certificate Path");
    bdkAuthenticationConfig.setPrivateKey(privateKey);
    bdkAuthenticationConfig.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bdkAuthenticationConfig.setPrivateKeyPath("Private Key Path");
    bdkAuthenticationConfig.setCertificate(null);

    // Act
    BdkCertificateConfig actualCertificateConfig = bdkAuthenticationConfig.getCertificateConfig();

    // Assert
    assertEquals("Certificate Path", actualCertificateConfig.getPath());
    assertFalse(actualCertificateConfig.isValid());
    byte[] certificateBytes = actualCertificateConfig.getCertificateBytes();
    assertSame(certificateBytes, actualCertificateConfig.getContent());
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), certificateBytes);
  }

  /**
   * Test {@link BdkAuthenticationConfig#getCertificateConfig()}.
   * <ul>
   *   <li>Given {@link BdkAuthenticationConfig} (default constructor).</li>
   *   <li>Then return Content is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkAuthenticationConfig#getCertificateConfig()}
   */
  @Test
  @DisplayName("Test getCertificateConfig(); given BdkAuthenticationConfig (default constructor); then return Content is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"BdkCertificateConfig BdkAuthenticationConfig.getCertificateConfig()"})
  void testGetCertificateConfig_givenBdkAuthenticationConfig_thenReturnContentIsNull() {
    // Arrange and Act
    BdkCertificateConfig actualCertificateConfig = (new BdkAuthenticationConfig()).getCertificateConfig();

    // Assert
    assertNull(actualCertificateConfig.getContent());
    assertNull(actualCertificateConfig.getPassword());
    assertNull(actualCertificateConfig.getPath());
    assertFalse(actualCertificateConfig.isConfigured());
    assertTrue(actualCertificateConfig.isValid());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BdkAuthenticationConfig#setCertificate(BdkCertificateConfig)}
   *   <li>{@link BdkAuthenticationConfig#setCertificateContent(byte[])}
   *   <li>{@link BdkAuthenticationConfig#setCertificatePassword(String)}
   *   <li>{@link BdkAuthenticationConfig#setCertificatePath(String)}
   *   <li>{@link BdkAuthenticationConfig#setPrivateKey(BdkRsaKeyConfig)}
   *   <li>{@link BdkAuthenticationConfig#setPrivateKeyContent(byte[])}
   *   <li>{@link BdkAuthenticationConfig#setPrivateKeyPath(String)}
   *   <li>{@link BdkAuthenticationConfig#getCertificate()}
   *   <li>{@link BdkAuthenticationConfig#getCertificateContent()}
   *   <li>{@link BdkAuthenticationConfig#getCertificatePassword()}
   *   <li>{@link BdkAuthenticationConfig#getCertificatePath()}
   *   <li>{@link BdkAuthenticationConfig#getPrivateKey()}
   *   <li>{@link BdkAuthenticationConfig#getPrivateKeyContent()}
   *   <li>{@link BdkAuthenticationConfig#getPrivateKeyPath()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"BdkCertificateConfig BdkAuthenticationConfig.getCertificate()",
      "byte[] BdkAuthenticationConfig.getCertificateContent()",
      "String BdkAuthenticationConfig.getCertificatePassword()", "String BdkAuthenticationConfig.getCertificatePath()",
      "BdkRsaKeyConfig BdkAuthenticationConfig.getPrivateKey()",
      "byte[] BdkAuthenticationConfig.getPrivateKeyContent()", "String BdkAuthenticationConfig.getPrivateKeyPath()",
      "void BdkAuthenticationConfig.setCertificate(BdkCertificateConfig)",
      "void BdkAuthenticationConfig.setCertificateContent(byte[])",
      "void BdkAuthenticationConfig.setCertificatePassword(String)",
      "void BdkAuthenticationConfig.setCertificatePath(String)",
      "void BdkAuthenticationConfig.setPrivateKey(BdkRsaKeyConfig)",
      "void BdkAuthenticationConfig.setPrivateKeyContent(byte[])",
      "void BdkAuthenticationConfig.setPrivateKeyPath(String)"})
  void testGettersAndSetters() throws UnsupportedEncodingException {
    // Arrange
    BdkAuthenticationConfig bdkAuthenticationConfig = new BdkAuthenticationConfig();
    BdkCertificateConfig certificate = new BdkCertificateConfig("Path", "iloveyou");

    // Act
    bdkAuthenticationConfig.setCertificate(certificate);
    byte[] certificateContent = "AXAXAXAX".getBytes("UTF-8");
    bdkAuthenticationConfig.setCertificateContent(certificateContent);
    bdkAuthenticationConfig.setCertificatePassword("iloveyou");
    bdkAuthenticationConfig.setCertificatePath("Certificate Path");
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");
    bdkAuthenticationConfig.setPrivateKey(privateKey);
    byte[] privateKeyContent = "AXAXAXAX".getBytes("UTF-8");
    bdkAuthenticationConfig.setPrivateKeyContent(privateKeyContent);
    bdkAuthenticationConfig.setPrivateKeyPath("Private Key Path");
    BdkCertificateConfig actualCertificate = bdkAuthenticationConfig.getCertificate();
    byte[] actualCertificateContent = bdkAuthenticationConfig.getCertificateContent();
    String actualCertificatePassword = bdkAuthenticationConfig.getCertificatePassword();
    String actualCertificatePath = bdkAuthenticationConfig.getCertificatePath();
    BdkRsaKeyConfig actualPrivateKey = bdkAuthenticationConfig.getPrivateKey();
    byte[] actualPrivateKeyContent = bdkAuthenticationConfig.getPrivateKeyContent();

    // Assert
    assertEquals("Certificate Path", actualCertificatePath);
    assertEquals("Private Key Path", bdkAuthenticationConfig.getPrivateKeyPath());
    assertEquals("iloveyou", actualCertificatePassword);
    assertSame(certificate, actualCertificate);
    assertSame(privateKey, actualPrivateKey);
    assertSame(certificateContent, actualCertificateContent);
    assertSame(privateKeyContent, actualPrivateKeyContent);
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), actualCertificateContent);
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), actualPrivateKeyContent);
  }

  /**
   * Test new {@link BdkAuthenticationConfig} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link BdkAuthenticationConfig}
   */
  @Test
  @DisplayName("Test new BdkAuthenticationConfig (default constructor)")
  @Tag("MaintainedByDiffblue")
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
