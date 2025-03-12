package com.symphony.bdk.core.config.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.config.exception.BdkConfigFormatException;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkSslConfigDiffblueTest {
  /**
   * Test {@link BdkSslConfig#isValid()}.
   * <p>
   * Method under test: {@link BdkSslConfig#isValid()}
   */
  @Test
  @DisplayName("Test isValid()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkSslConfig.isValid()"})
  void testIsValid() {
    // Arrange
    BdkSslConfig bdkSslConfig = new BdkSslConfig();
    bdkSslConfig.setTrustStorePassword("iloveyou");
    bdkSslConfig.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    bdkSslConfig.setTrustStorePath(null);

    // Act and Assert
    assertTrue(bdkSslConfig.isValid());
  }

  /**
   * Test {@link BdkSslConfig#isValid()}.
   * <p>
   * Method under test: {@link BdkSslConfig#isValid()}
   */
  @Test
  @DisplayName("Test isValid()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkSslConfig.isValid()"})
  void testIsValid2() {
    // Arrange
    BdkSslConfig bdkSslConfig = new BdkSslConfig();
    bdkSslConfig.setTrustStorePassword("iloveyou");
    bdkSslConfig.setTrustStore(new BdkCertificateConfig("", "iloveyou"));
    bdkSslConfig.setTrustStorePath(null);

    // Act and Assert
    assertTrue(bdkSslConfig.isValid());
  }

  /**
   * Test {@link BdkSslConfig#isValid()}.
   * <ul>
   *   <li>Given {@link BdkCertificateConfig#BdkCertificateConfig(String, String)} with {@code Path} and password is {@code iloveyou} Path is {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkSslConfig#isValid()}
   */
  @Test
  @DisplayName("Test isValid(); given BdkCertificateConfig(String, String) with 'Path' and password is 'iloveyou' Path is 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkSslConfig.isValid()"})
  void testIsValid_givenBdkCertificateConfigWithPathAndPasswordIsIloveyouPathIsFoo()
      throws UnsupportedEncodingException {
    // Arrange
    BdkCertificateConfig trustStore = new BdkCertificateConfig("Path", "iloveyou");
    trustStore.setPath("foo");
    trustStore.setPassword("foo");
    trustStore.setContent("AXAXAXAX".getBytes("UTF-8"));

    BdkSslConfig bdkSslConfig = new BdkSslConfig();
    bdkSslConfig.setTrustStorePassword("iloveyou");
    bdkSslConfig.setTrustStore(trustStore);
    bdkSslConfig.setTrustStorePath(null);

    // Act and Assert
    assertFalse(bdkSslConfig.isValid());
  }

  /**
   * Test {@link BdkSslConfig#isValid()}.
   * <ul>
   *   <li>Given {@link BdkCertificateConfig#BdkCertificateConfig(String, String)} with {@code Path} and password is {@code iloveyou} Path is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkSslConfig#isValid()}
   */
  @Test
  @DisplayName("Test isValid(); given BdkCertificateConfig(String, String) with 'Path' and password is 'iloveyou' Path is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkSslConfig.isValid()"})
  void testIsValid_givenBdkCertificateConfigWithPathAndPasswordIsIloveyouPathIsNull()
      throws UnsupportedEncodingException {
    // Arrange
    BdkCertificateConfig trustStore = new BdkCertificateConfig("Path", "iloveyou");
    trustStore.setPath(null);
    trustStore.setPassword(null);
    trustStore.setContent("AXAXAXAX".getBytes("UTF-8"));

    BdkSslConfig bdkSslConfig = new BdkSslConfig();
    bdkSslConfig.setTrustStorePassword("iloveyou");
    bdkSslConfig.setTrustStore(trustStore);
    bdkSslConfig.setTrustStorePath(null);

    // Act and Assert
    assertTrue(bdkSslConfig.isValid());
  }

  /**
   * Test {@link BdkSslConfig#isValid()}.
   * <ul>
   *   <li>Given {@link BdkSslConfig} (default constructor) TrustStore is {@code null}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkSslConfig#isValid()}
   */
  @Test
  @DisplayName("Test isValid(); given BdkSslConfig (default constructor) TrustStore is 'null'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkSslConfig.isValid()"})
  void testIsValid_givenBdkSslConfigTrustStoreIsNull_thenReturnTrue() {
    // Arrange
    BdkSslConfig bdkSslConfig = new BdkSslConfig();
    bdkSslConfig.setTrustStorePassword("iloveyou");
    bdkSslConfig.setTrustStore(null);
    bdkSslConfig.setTrustStorePath(null);

    // Act and Assert
    assertTrue(bdkSslConfig.isValid());
  }

  /**
   * Test {@link BdkSslConfig#isValid()}.
   * <ul>
   *   <li>Given {@link BdkSslConfig} (default constructor) TrustStorePath is {@code foo}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkSslConfig#isValid()}
   */
  @Test
  @DisplayName("Test isValid(); given BdkSslConfig (default constructor) TrustStorePath is 'foo'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkSslConfig.isValid()"})
  void testIsValid_givenBdkSslConfigTrustStorePathIsFoo_thenReturnFalse() {
    // Arrange
    BdkSslConfig bdkSslConfig = new BdkSslConfig();
    bdkSslConfig.setTrustStorePassword("iloveyou");
    bdkSslConfig.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    bdkSslConfig.setTrustStorePath("foo");

    // Act and Assert
    assertFalse(bdkSslConfig.isValid());
  }

  /**
   * Test {@link BdkSslConfig#isValid()}.
   * <ul>
   *   <li>Given {@link BdkSslConfig} (default constructor).</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkSslConfig#isValid()}
   */
  @Test
  @DisplayName("Test isValid(); given BdkSslConfig (default constructor); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkSslConfig.isValid()"})
  void testIsValid_givenBdkSslConfig_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new BdkSslConfig()).isValid());
  }

  /**
   * Test {@link BdkSslConfig#getCertificateConfig()}.
   * <p>
   * Method under test: {@link BdkSslConfig#getCertificateConfig()}
   */
  @Test
  @DisplayName("Test getCertificateConfig()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"BdkCertificateConfig BdkSslConfig.getCertificateConfig()"})
  void testGetCertificateConfig() {
    // Arrange
    BdkSslConfig bdkSslConfig = new BdkSslConfig();
    bdkSslConfig.setTrustStorePassword("iloveyou");
    BdkCertificateConfig trustStore = new BdkCertificateConfig("Path", "iloveyou");

    bdkSslConfig.setTrustStore(trustStore);
    bdkSslConfig.setTrustStorePath(null);

    // Act and Assert
    assertSame(trustStore, bdkSslConfig.getCertificateConfig());
  }

  /**
   * Test {@link BdkSslConfig#getCertificateConfig()}.
   * <p>
   * Method under test: {@link BdkSslConfig#getCertificateConfig()}
   */
  @Test
  @DisplayName("Test getCertificateConfig()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"BdkCertificateConfig BdkSslConfig.getCertificateConfig()"})
  void testGetCertificateConfig2() throws UnsupportedEncodingException {
    // Arrange
    BdkCertificateConfig trustStore = new BdkCertificateConfig("Path", "iloveyou");
    trustStore.setPath(null);
    trustStore.setPassword(null);
    trustStore.setContent("AXAXAXAX".getBytes("UTF-8"));

    BdkSslConfig bdkSslConfig = new BdkSslConfig();
    bdkSslConfig.setTrustStorePassword("iloveyou");
    bdkSslConfig.setTrustStore(trustStore);
    bdkSslConfig.setTrustStorePath(null);

    // Act
    BdkCertificateConfig actualCertificateConfig = bdkSslConfig.getCertificateConfig();

    // Assert
    assertEquals("iloveyou", actualCertificateConfig.getPassword());
    assertNull(actualCertificateConfig.getContent());
    assertNull(actualCertificateConfig.getPath());
    assertFalse(actualCertificateConfig.isConfigured());
    assertTrue(actualCertificateConfig.isValid());
  }

  /**
   * Test {@link BdkSslConfig#getCertificateConfig()}.
   * <p>
   * Method under test: {@link BdkSslConfig#getCertificateConfig()}
   */
  @Test
  @DisplayName("Test getCertificateConfig()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"BdkCertificateConfig BdkSslConfig.getCertificateConfig()"})
  void testGetCertificateConfig3() throws UnsupportedEncodingException {
    // Arrange
    BdkCertificateConfig trustStore = new BdkCertificateConfig("Path", "iloveyou");
    trustStore.setPath("foo");
    trustStore.setPassword("foo");
    trustStore.setContent("AXAXAXAX".getBytes("UTF-8"));

    BdkSslConfig bdkSslConfig = new BdkSslConfig();
    bdkSslConfig.setTrustStorePassword("iloveyou");
    bdkSslConfig.setTrustStore(trustStore);
    bdkSslConfig.setTrustStorePath(null);

    // Act and Assert
    assertThrows(BdkConfigFormatException.class, () -> bdkSslConfig.getCertificateConfig());
  }

  /**
   * Test {@link BdkSslConfig#getCertificateConfig()}.
   * <ul>
   *   <li>Given {@link BdkSslConfig} (default constructor) TrustStore is {@code null}.</li>
   *   <li>Then return Path is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkSslConfig#getCertificateConfig()}
   */
  @Test
  @DisplayName("Test getCertificateConfig(); given BdkSslConfig (default constructor) TrustStore is 'null'; then return Path is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"BdkCertificateConfig BdkSslConfig.getCertificateConfig()"})
  void testGetCertificateConfig_givenBdkSslConfigTrustStoreIsNull_thenReturnPathIsNull() {
    // Arrange
    BdkSslConfig bdkSslConfig = new BdkSslConfig();
    bdkSslConfig.setTrustStorePassword("iloveyou");
    bdkSslConfig.setTrustStore(null);
    bdkSslConfig.setTrustStorePath(null);

    // Act
    BdkCertificateConfig actualCertificateConfig = bdkSslConfig.getCertificateConfig();

    // Assert
    assertEquals("iloveyou", actualCertificateConfig.getPassword());
    assertNull(actualCertificateConfig.getContent());
    assertNull(actualCertificateConfig.getPath());
    assertFalse(actualCertificateConfig.isConfigured());
    assertTrue(actualCertificateConfig.isValid());
  }

  /**
   * Test {@link BdkSslConfig#getCertificateConfig()}.
   * <ul>
   *   <li>Given {@link BdkSslConfig} (default constructor).</li>
   *   <li>Then return Password is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkSslConfig#getCertificateConfig()}
   */
  @Test
  @DisplayName("Test getCertificateConfig(); given BdkSslConfig (default constructor); then return Password is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"BdkCertificateConfig BdkSslConfig.getCertificateConfig()"})
  void testGetCertificateConfig_givenBdkSslConfig_thenReturnPasswordIsNull() {
    // Arrange and Act
    BdkCertificateConfig actualCertificateConfig = (new BdkSslConfig()).getCertificateConfig();

    // Assert
    assertNull(actualCertificateConfig.getContent());
    assertNull(actualCertificateConfig.getPassword());
    assertNull(actualCertificateConfig.getPath());
    assertFalse(actualCertificateConfig.isConfigured());
    assertTrue(actualCertificateConfig.isValid());
  }

  /**
   * Test {@link BdkSslConfig#getCertificateConfig()}.
   * <ul>
   *   <li>Then return Path is empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkSslConfig#getCertificateConfig()}
   */
  @Test
  @DisplayName("Test getCertificateConfig(); then return Path is empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"BdkCertificateConfig BdkSslConfig.getCertificateConfig()"})
  void testGetCertificateConfig_thenReturnPathIsEmptyString() {
    // Arrange
    BdkSslConfig bdkSslConfig = new BdkSslConfig();
    bdkSslConfig.setTrustStorePassword("iloveyou");
    bdkSslConfig.setTrustStore(null);
    bdkSslConfig.setTrustStorePath("");

    // Act
    BdkCertificateConfig actualCertificateConfig = bdkSslConfig.getCertificateConfig();

    // Assert
    assertEquals("", actualCertificateConfig.getPath());
    assertEquals("iloveyou", actualCertificateConfig.getPassword());
    assertNull(actualCertificateConfig.getContent());
    assertFalse(actualCertificateConfig.isConfigured());
    assertTrue(actualCertificateConfig.isValid());
  }

  /**
   * Test {@link BdkSslConfig#getCertificateConfig()}.
   * <ul>
   *   <li>Then return Path is {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkSslConfig#getCertificateConfig()}
   */
  @Test
  @DisplayName("Test getCertificateConfig(); then return Path is 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"BdkCertificateConfig BdkSslConfig.getCertificateConfig()"})
  void testGetCertificateConfig_thenReturnPathIsFoo() {
    // Arrange
    BdkSslConfig bdkSslConfig = new BdkSslConfig();
    bdkSslConfig.setTrustStorePassword("iloveyou");
    bdkSslConfig.setTrustStore(null);
    bdkSslConfig.setTrustStorePath("foo");

    // Act
    BdkCertificateConfig actualCertificateConfig = bdkSslConfig.getCertificateConfig();

    // Assert
    assertEquals("foo", actualCertificateConfig.getPath());
    assertEquals("iloveyou", actualCertificateConfig.getPassword());
    assertNull(actualCertificateConfig.getContent());
    assertTrue(actualCertificateConfig.isConfigured());
    assertTrue(actualCertificateConfig.isValid());
  }

  /**
   * Test {@link BdkSslConfig#getCertificateConfig()}.
   * <ul>
   *   <li>Then throw {@link BdkConfigFormatException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkSslConfig#getCertificateConfig()}
   */
  @Test
  @DisplayName("Test getCertificateConfig(); then throw BdkConfigFormatException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"BdkCertificateConfig BdkSslConfig.getCertificateConfig()"})
  void testGetCertificateConfig_thenThrowBdkConfigFormatException() {
    // Arrange
    BdkSslConfig bdkSslConfig = new BdkSslConfig();
    bdkSslConfig.setTrustStorePassword("iloveyou");
    bdkSslConfig.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    bdkSslConfig.setTrustStorePath("foo");

    // Act and Assert
    assertThrows(BdkConfigFormatException.class, () -> bdkSslConfig.getCertificateConfig());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BdkSslConfig#setTrustStore(BdkCertificateConfig)}
   *   <li>{@link BdkSslConfig#setTrustStorePassword(String)}
   *   <li>{@link BdkSslConfig#setTrustStorePath(String)}
   *   <li>{@link BdkSslConfig#getTrustStore()}
   *   <li>{@link BdkSslConfig#getTrustStorePassword()}
   *   <li>{@link BdkSslConfig#getTrustStorePath()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"BdkCertificateConfig BdkSslConfig.getTrustStore()", "String BdkSslConfig.getTrustStorePassword()",
      "String BdkSslConfig.getTrustStorePath()", "void BdkSslConfig.setTrustStore(BdkCertificateConfig)",
      "void BdkSslConfig.setTrustStorePassword(String)", "void BdkSslConfig.setTrustStorePath(String)"})
  void testGettersAndSetters() {
    // Arrange
    BdkSslConfig bdkSslConfig = new BdkSslConfig();
    BdkCertificateConfig trustStore = new BdkCertificateConfig("Path", "iloveyou");

    // Act
    bdkSslConfig.setTrustStore(trustStore);
    bdkSslConfig.setTrustStorePassword("iloveyou");
    bdkSslConfig.setTrustStorePath("Trust Store Path");
    BdkCertificateConfig actualTrustStore = bdkSslConfig.getTrustStore();
    String actualTrustStorePassword = bdkSslConfig.getTrustStorePassword();

    // Assert
    assertEquals("Trust Store Path", bdkSslConfig.getTrustStorePath());
    assertEquals("iloveyou", actualTrustStorePassword);
    assertSame(trustStore, actualTrustStore);
  }

  /**
   * Test new {@link BdkSslConfig} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link BdkSslConfig}
   */
  @Test
  @DisplayName("Test new BdkSslConfig (default constructor)")
  @Tag("MaintainedByDiffblue")
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
