package com.symphony.bdk.core.config.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

class BdkCertificateConfigDiffblueTest {
  /**
   * Test {@link BdkCertificateConfig#BdkCertificateConfig(String, byte[], String)}.
   *
   * <ul>
   *   <li>Then return Content is {@code AXAXAXAX} Bytes is {@code UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link BdkCertificateConfig#BdkCertificateConfig(String, byte[], String)}
   */
  @Test
  @DisplayName(
      "Test new BdkCertificateConfig(String, byte[], String); then return Content is 'AXAXAXAX' Bytes is 'UTF-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void BdkCertificateConfig.<init>()",
    "void BdkCertificateConfig.<init>(String, String)",
    "void BdkCertificateConfig.<init>(String, byte[], String)"
  })
  void testNewBdkCertificateConfig_thenReturnContentIsAxaxaxaxBytesIsUtf8()
      throws UnsupportedEncodingException {
    // Arrange
    byte[] content = "AXAXAXAX".getBytes("UTF-8");

    // Act
    BdkCertificateConfig actualBdkCertificateConfig =
        new BdkCertificateConfig("Path", content, "iloveyou");

    // Assert
    assertEquals("Path", actualBdkCertificateConfig.getPath());
    assertEquals("iloveyou", actualBdkCertificateConfig.getPassword());
    assertSame(content, actualBdkCertificateConfig.getContent());
  }

  /**
   * Test {@link BdkCertificateConfig#BdkCertificateConfig()}.
   *
   * <ul>
   *   <li>Then return Password is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkCertificateConfig#BdkCertificateConfig()}
   */
  @Test
  @DisplayName("Test new BdkCertificateConfig(); then return Password is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void BdkCertificateConfig.<init>()",
    "void BdkCertificateConfig.<init>(String, String)",
    "void BdkCertificateConfig.<init>(String, byte[], String)"
  })
  void testNewBdkCertificateConfig_thenReturnPasswordIsNull() {
    // Arrange and Act
    BdkCertificateConfig actualBdkCertificateConfig = new BdkCertificateConfig();

    // Assert
    assertNull(actualBdkCertificateConfig.getContent());
    assertNull(actualBdkCertificateConfig.getPassword());
    assertNull(actualBdkCertificateConfig.getPath());
  }

  /**
   * Test {@link BdkCertificateConfig#BdkCertificateConfig(String, String)}.
   *
   * <ul>
   *   <li>When {@code Path}.
   *   <li>Then return {@code Path}.
   * </ul>
   *
   * <p>Method under test: {@link BdkCertificateConfig#BdkCertificateConfig(String, String)}
   */
  @Test
  @DisplayName("Test new BdkCertificateConfig(String, String); when 'Path'; then return 'Path'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void BdkCertificateConfig.<init>()",
    "void BdkCertificateConfig.<init>(String, String)",
    "void BdkCertificateConfig.<init>(String, byte[], String)"
  })
  void testNewBdkCertificateConfig_whenPath_thenReturnPath() {
    // Arrange and Act
    BdkCertificateConfig actualBdkCertificateConfig = new BdkCertificateConfig("Path", "iloveyou");

    // Assert
    assertEquals("Path", actualBdkCertificateConfig.getPath());
    assertEquals("iloveyou", actualBdkCertificateConfig.getPassword());
    assertNull(actualBdkCertificateConfig.getContent());
  }

  /**
   * Test {@link BdkCertificateConfig#isConfigured()}.
   *
   * <p>Method under test: {@link BdkCertificateConfig#isConfigured()}
   */
  @Test
  @DisplayName("Test isConfigured()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkCertificateConfig.isConfigured()"})
  void testIsConfigured() {
    // Arrange, Act and Assert
    assertFalse(new BdkCertificateConfig("", "iloveyou").isConfigured());
  }

  /**
   * Test {@link BdkCertificateConfig#isConfigured()}.
   *
   * <p>Method under test: {@link BdkCertificateConfig#isConfigured()}
   */
  @Test
  @DisplayName("Test isConfigured()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkCertificateConfig.isConfigured()"})
  void testIsConfigured2() {
    // Arrange
    BdkCertificateConfig bdkCertificateConfig =
        new BdkCertificateConfig("Path", new byte[] {'A', 1, 'A', 1, 'A', 1, 'A', 1}, "iloveyou");

    // Act and Assert
    assertTrue(bdkCertificateConfig.isConfigured());
  }

  /**
   * Test {@link BdkCertificateConfig#isConfigured()}.
   *
   * <p>Method under test: {@link BdkCertificateConfig#isConfigured()}
   */
  @Test
  @DisplayName("Test isConfigured()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkCertificateConfig.isConfigured()"})
  void testIsConfigured3() {
    // Arrange
    BdkCertificateConfig bdkCertificateConfig =
        new BdkCertificateConfig(null, new byte[] {'A', 1, 'A', 1, 'A', 1, 'A', 1}, "iloveyou");

    // Act and Assert
    assertTrue(bdkCertificateConfig.isConfigured());
  }

  /**
   * Test {@link BdkCertificateConfig#isConfigured()}.
   *
   * <p>Method under test: {@link BdkCertificateConfig#isConfigured()}
   */
  @Test
  @DisplayName("Test isConfigured()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkCertificateConfig.isConfigured()"})
  void testIsConfigured4() {
    // Arrange
    BdkCertificateConfig bdkCertificateConfig =
        new BdkCertificateConfig("Path", new byte[] {}, "iloveyou");

    // Act and Assert
    assertTrue(bdkCertificateConfig.isConfigured());
  }

  /**
   * Test {@link BdkCertificateConfig#isConfigured()}.
   *
   * <ul>
   *   <li>Given {@link BdkCertificateConfig#BdkCertificateConfig()} Content is array of {@code
   *       byte} with {@code A} and one.
   * </ul>
   *
   * <p>Method under test: {@link BdkCertificateConfig#isConfigured()}
   */
  @Test
  @DisplayName(
      "Test isConfigured(); given BdkCertificateConfig() Content is array of byte with 'A' and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkCertificateConfig.isConfigured()"})
  void testIsConfigured_givenBdkCertificateConfigContentIsArrayOfByteWithAAndOne() {
    // Arrange
    BdkCertificateConfig bdkCertificateConfig = new BdkCertificateConfig();
    bdkCertificateConfig.setContent(new byte[] {'A', 1, 'A', 1, 'A', 1, 'A', 1});

    // Act and Assert
    assertFalse(bdkCertificateConfig.isConfigured());
  }

  /**
   * Test {@link BdkCertificateConfig#isConfigured()}.
   *
   * <ul>
   *   <li>Given {@link BdkCertificateConfig#BdkCertificateConfig(String, String)} with {@code Path}
   *       and password is {@code iloveyou}.
   * </ul>
   *
   * <p>Method under test: {@link BdkCertificateConfig#isConfigured()}
   */
  @Test
  @DisplayName(
      "Test isConfigured(); given BdkCertificateConfig(String, String) with 'Path' and password is 'iloveyou'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkCertificateConfig.isConfigured()"})
  void testIsConfigured_givenBdkCertificateConfigWithPathAndPasswordIsIloveyou() {
    // Arrange, Act and Assert
    assertTrue(new BdkCertificateConfig("Path", "iloveyou").isConfigured());
  }

  /**
   * Test {@link BdkCertificateConfig#isConfigured()}.
   *
   * <ul>
   *   <li>Given {@link BdkCertificateConfig#BdkCertificateConfig(String, String)} with {@code Path}
   *       and password is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkCertificateConfig#isConfigured()}
   */
  @Test
  @DisplayName(
      "Test isConfigured(); given BdkCertificateConfig(String, String) with 'Path' and password is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkCertificateConfig.isConfigured()"})
  void testIsConfigured_givenBdkCertificateConfigWithPathAndPasswordIsNull() {
    // Arrange
    BdkCertificateConfig bdkCertificateConfig = new BdkCertificateConfig("Path", null);

    // Act and Assert
    assertFalse(bdkCertificateConfig.isConfigured());
  }

  /**
   * Test {@link BdkCertificateConfig#isConfigured()}.
   *
   * <ul>
   *   <li>Given {@link BdkCertificateConfig#BdkCertificateConfig(String, String)} with path is
   *       {@code null} and password is {@code iloveyou}.
   * </ul>
   *
   * <p>Method under test: {@link BdkCertificateConfig#isConfigured()}
   */
  @Test
  @DisplayName(
      "Test isConfigured(); given BdkCertificateConfig(String, String) with path is 'null' and password is 'iloveyou'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkCertificateConfig.isConfigured()"})
  void testIsConfigured_givenBdkCertificateConfigWithPathIsNullAndPasswordIsIloveyou() {
    // Arrange, Act and Assert
    assertFalse(new BdkCertificateConfig(null, "iloveyou").isConfigured());
  }

  /**
   * Test {@link BdkCertificateConfig#isConfigured()}.
   *
   * <ul>
   *   <li>Given {@link BdkCertificateConfig#BdkCertificateConfig()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link BdkCertificateConfig#isConfigured()}
   */
  @Test
  @DisplayName("Test isConfigured(); given BdkCertificateConfig(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkCertificateConfig.isConfigured()"})
  void testIsConfigured_givenBdkCertificateConfig_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(new BdkCertificateConfig().isConfigured());
  }

  /**
   * Test {@link BdkCertificateConfig#isValid()}.
   *
   * <p>Method under test: {@link BdkCertificateConfig#isValid()}
   */
  @Test
  @DisplayName("Test isValid()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkCertificateConfig.isValid()"})
  void testIsValid() {
    // Arrange
    BdkCertificateConfig bdkCertificateConfig =
        new BdkCertificateConfig("Path", new byte[] {}, "iloveyou");

    // Act and Assert
    assertTrue(bdkCertificateConfig.isValid());
  }

  /**
   * Test {@link BdkCertificateConfig#isValid()}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link BdkCertificateConfig#isValid()}
   */
  @Test
  @DisplayName("Test isValid(); given 'A'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkCertificateConfig.isValid()"})
  void testIsValid_givenA_thenReturnFalse() {
    // Arrange
    BdkCertificateConfig bdkCertificateConfig =
        new BdkCertificateConfig("Path", new byte[] {'A', 1, 'A', 1, 'A', 1, 'A', 1}, "iloveyou");

    // Act and Assert
    assertFalse(bdkCertificateConfig.isValid());
  }

  /**
   * Test {@link BdkCertificateConfig#isValid()}.
   *
   * <ul>
   *   <li>Given {@link BdkCertificateConfig#BdkCertificateConfig(String, String)} with {@code Path}
   *       and password is {@code iloveyou}.
   * </ul>
   *
   * <p>Method under test: {@link BdkCertificateConfig#isValid()}
   */
  @Test
  @DisplayName(
      "Test isValid(); given BdkCertificateConfig(String, String) with 'Path' and password is 'iloveyou'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkCertificateConfig.isValid()"})
  void testIsValid_givenBdkCertificateConfigWithPathAndPasswordIsIloveyou() {
    // Arrange, Act and Assert
    assertTrue(new BdkCertificateConfig("Path", "iloveyou").isValid());
  }

  /**
   * Test {@link BdkCertificateConfig#isValid()}.
   *
   * <ul>
   *   <li>Given {@link BdkCertificateConfig#BdkCertificateConfig(String, String)} with path is
   *       empty string and password is {@code iloveyou}.
   * </ul>
   *
   * <p>Method under test: {@link BdkCertificateConfig#isValid()}
   */
  @Test
  @DisplayName(
      "Test isValid(); given BdkCertificateConfig(String, String) with path is empty string and password is 'iloveyou'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BdkCertificateConfig.isValid()"})
  void testIsValid_givenBdkCertificateConfigWithPathIsEmptyStringAndPasswordIsIloveyou() {
    // Arrange, Act and Assert
    assertTrue(new BdkCertificateConfig("", "iloveyou").isValid());
  }
}
