package com.symphony.bdk.core.config.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
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
}
