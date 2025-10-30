package com.symphony.bdk.core.config.model;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkRsaKeyConfigDiffblueTest {
  /**
   * Test {@link BdkRsaKeyConfig#isConfigured()}.
   * <ul>
   *   <li>Given {@link BdkRsaKeyConfig} (default constructor) Content is {@code AXAXAXAX} Bytes is {@code UTF-8}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkRsaKeyConfig#isConfigured()}
   */
  @Test
  @DisplayName("Test isConfigured(); given BdkRsaKeyConfig (default constructor) Content is 'AXAXAXAX' Bytes is 'UTF-8'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkRsaKeyConfig.isConfigured()"})
  void testIsConfigured_givenBdkRsaKeyConfigContentIsAxaxaxaxBytesIsUtf8() throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig bdkRsaKeyConfig = new BdkRsaKeyConfig();
    bdkRsaKeyConfig.setContent("AXAXAXAX".getBytes("UTF-8"));
    bdkRsaKeyConfig.setPath("foo");

    // Act and Assert
    assertFalse(bdkRsaKeyConfig.isConfigured());
  }

  /**
   * Test {@link BdkRsaKeyConfig#isConfigured()}.
   * <ul>
   *   <li>Given {@link BdkRsaKeyConfig} (default constructor) Content is empty array of {@code byte}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkRsaKeyConfig#isConfigured()}
   */
  @Test
  @DisplayName("Test isConfigured(); given BdkRsaKeyConfig (default constructor) Content is empty array of byte; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkRsaKeyConfig.isConfigured()"})
  void testIsConfigured_givenBdkRsaKeyConfigContentIsEmptyArrayOfByte_thenReturnTrue() {
    // Arrange
    BdkRsaKeyConfig bdkRsaKeyConfig = new BdkRsaKeyConfig();
    bdkRsaKeyConfig.setContent(new byte[]{});
    bdkRsaKeyConfig.setPath("foo");

    // Act and Assert
    assertTrue(bdkRsaKeyConfig.isConfigured());
  }

  /**
   * Test {@link BdkRsaKeyConfig#isConfigured()}.
   * <ul>
   *   <li>Given {@link BdkRsaKeyConfig} (default constructor) Content is {@code null}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkRsaKeyConfig#isConfigured()}
   */
  @Test
  @DisplayName("Test isConfigured(); given BdkRsaKeyConfig (default constructor) Content is 'null'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkRsaKeyConfig.isConfigured()"})
  void testIsConfigured_givenBdkRsaKeyConfigContentIsNull_thenReturnTrue() {
    // Arrange
    BdkRsaKeyConfig bdkRsaKeyConfig = new BdkRsaKeyConfig();
    bdkRsaKeyConfig.setContent(null);
    bdkRsaKeyConfig.setPath("foo");

    // Act and Assert
    assertTrue(bdkRsaKeyConfig.isConfigured());
  }

  /**
   * Test {@link BdkRsaKeyConfig#isConfigured()}.
   * <ul>
   *   <li>Given {@link BdkRsaKeyConfig} (default constructor) Path is empty string.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkRsaKeyConfig#isConfigured()}
   */
  @Test
  @DisplayName("Test isConfigured(); given BdkRsaKeyConfig (default constructor) Path is empty string; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkRsaKeyConfig.isConfigured()"})
  void testIsConfigured_givenBdkRsaKeyConfigPathIsEmptyString_thenReturnFalse() {
    // Arrange
    BdkRsaKeyConfig bdkRsaKeyConfig = new BdkRsaKeyConfig();
    bdkRsaKeyConfig.setContent(null);
    bdkRsaKeyConfig.setPath("");

    // Act and Assert
    assertFalse(bdkRsaKeyConfig.isConfigured());
  }

  /**
   * Test {@link BdkRsaKeyConfig#isConfigured()}.
   * <ul>
   *   <li>Given {@link BdkRsaKeyConfig} (default constructor) Path is {@code null}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkRsaKeyConfig#isConfigured()}
   */
  @Test
  @DisplayName("Test isConfigured(); given BdkRsaKeyConfig (default constructor) Path is 'null'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkRsaKeyConfig.isConfigured()"})
  void testIsConfigured_givenBdkRsaKeyConfigPathIsNull_thenReturnTrue() throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig bdkRsaKeyConfig = new BdkRsaKeyConfig();
    bdkRsaKeyConfig.setContent("AXAXAXAX".getBytes("UTF-8"));
    bdkRsaKeyConfig.setPath(null);

    // Act and Assert
    assertTrue(bdkRsaKeyConfig.isConfigured());
  }

  /**
   * Test {@link BdkRsaKeyConfig#isConfigured()}.
   * <ul>
   *   <li>Given {@link BdkRsaKeyConfig} (default constructor).</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkRsaKeyConfig#isConfigured()}
   */
  @Test
  @DisplayName("Test isConfigured(); given BdkRsaKeyConfig (default constructor); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkRsaKeyConfig.isConfigured()"})
  void testIsConfigured_givenBdkRsaKeyConfig_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new BdkRsaKeyConfig()).isConfigured());
  }

  /**
   * Test {@link BdkRsaKeyConfig#isValid()}.
   * <ul>
   *   <li>Given {@link BdkRsaKeyConfig} (default constructor) Content is {@code AXAXAXAX} Bytes is {@code UTF-8}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkRsaKeyConfig#isValid()}
   */
  @Test
  @DisplayName("Test isValid(); given BdkRsaKeyConfig (default constructor) Content is 'AXAXAXAX' Bytes is 'UTF-8'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkRsaKeyConfig.isValid()"})
  void testIsValid_givenBdkRsaKeyConfigContentIsAxaxaxaxBytesIsUtf8_thenReturnFalse()
      throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig bdkRsaKeyConfig = new BdkRsaKeyConfig();
    bdkRsaKeyConfig.setContent("AXAXAXAX".getBytes("UTF-8"));
    bdkRsaKeyConfig.setPath("foo");

    // Act and Assert
    assertFalse(bdkRsaKeyConfig.isValid());
  }

  /**
   * Test {@link BdkRsaKeyConfig#isValid()}.
   * <ul>
   *   <li>Given {@link BdkRsaKeyConfig} (default constructor) Content is empty array of {@code byte}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkRsaKeyConfig#isValid()}
   */
  @Test
  @DisplayName("Test isValid(); given BdkRsaKeyConfig (default constructor) Content is empty array of byte; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkRsaKeyConfig.isValid()"})
  void testIsValid_givenBdkRsaKeyConfigContentIsEmptyArrayOfByte_thenReturnTrue() {
    // Arrange
    BdkRsaKeyConfig bdkRsaKeyConfig = new BdkRsaKeyConfig();
    bdkRsaKeyConfig.setContent(new byte[]{});
    bdkRsaKeyConfig.setPath("foo");

    // Act and Assert
    assertTrue(bdkRsaKeyConfig.isValid());
  }

  /**
   * Test {@link BdkRsaKeyConfig#isValid()}.
   * <ul>
   *   <li>Given {@link BdkRsaKeyConfig} (default constructor) Content is {@code null}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkRsaKeyConfig#isValid()}
   */
  @Test
  @DisplayName("Test isValid(); given BdkRsaKeyConfig (default constructor) Content is 'null'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkRsaKeyConfig.isValid()"})
  void testIsValid_givenBdkRsaKeyConfigContentIsNull_thenReturnTrue() {
    // Arrange
    BdkRsaKeyConfig bdkRsaKeyConfig = new BdkRsaKeyConfig();
    bdkRsaKeyConfig.setContent(null);
    bdkRsaKeyConfig.setPath("foo");

    // Act and Assert
    assertTrue(bdkRsaKeyConfig.isValid());
  }

  /**
   * Test {@link BdkRsaKeyConfig#isValid()}.
   * <ul>
   *   <li>Given {@link BdkRsaKeyConfig} (default constructor) Path is empty string.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkRsaKeyConfig#isValid()}
   */
  @Test
  @DisplayName("Test isValid(); given BdkRsaKeyConfig (default constructor) Path is empty string; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkRsaKeyConfig.isValid()"})
  void testIsValid_givenBdkRsaKeyConfigPathIsEmptyString_thenReturnTrue() {
    // Arrange
    BdkRsaKeyConfig bdkRsaKeyConfig = new BdkRsaKeyConfig();
    bdkRsaKeyConfig.setContent(null);
    bdkRsaKeyConfig.setPath("");

    // Act and Assert
    assertTrue(bdkRsaKeyConfig.isValid());
  }

  /**
   * Test {@link BdkRsaKeyConfig#isValid()}.
   * <ul>
   *   <li>Given {@link BdkRsaKeyConfig} (default constructor).</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkRsaKeyConfig#isValid()}
   */
  @Test
  @DisplayName("Test isValid(); given BdkRsaKeyConfig (default constructor); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkRsaKeyConfig.isValid()"})
  void testIsValid_givenBdkRsaKeyConfig_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new BdkRsaKeyConfig()).isValid());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link BdkRsaKeyConfig}
   *   <li>{@link BdkRsaKeyConfig#setContent(byte[])}
   *   <li>{@link BdkRsaKeyConfig#setPath(String)}
   *   <li>{@link BdkRsaKeyConfig#getContent()}
   *   <li>{@link BdkRsaKeyConfig#getPath()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BdkRsaKeyConfig.<init>()", "byte[] BdkRsaKeyConfig.getContent()",
      "String BdkRsaKeyConfig.getPath()", "void BdkRsaKeyConfig.setContent(byte[])",
      "void BdkRsaKeyConfig.setPath(String)"})
  void testGettersAndSetters() throws UnsupportedEncodingException {
    // Arrange and Act
    BdkRsaKeyConfig actualBdkRsaKeyConfig = new BdkRsaKeyConfig();
    byte[] content = "AXAXAXAX".getBytes("UTF-8");
    actualBdkRsaKeyConfig.setContent(content);
    actualBdkRsaKeyConfig.setPath("Path");
    byte[] actualContent = actualBdkRsaKeyConfig.getContent();

    // Assert
    assertEquals("Path", actualBdkRsaKeyConfig.getPath());
    assertSame(content, actualContent);
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), actualContent);
  }
}
