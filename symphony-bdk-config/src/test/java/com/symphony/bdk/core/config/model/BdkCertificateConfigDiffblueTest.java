package com.symphony.bdk.core.config.model;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkCertificateConfigDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BdkCertificateConfig#BdkCertificateConfig()}
   *   <li>{@link BdkCertificateConfig#setContent(byte[])}
   *   <li>{@link BdkCertificateConfig#setPassword(String)}
   *   <li>{@link BdkCertificateConfig#setPath(String)}
   *   <li>{@link BdkCertificateConfig#getContent()}
   *   <li>{@link BdkCertificateConfig#getPassword()}
   *   <li>{@link BdkCertificateConfig#getPath()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BdkCertificateConfig.<init>()", "void BdkCertificateConfig.<init>(String, String)",
      "void BdkCertificateConfig.<init>(String, byte[], String)", "byte[] BdkCertificateConfig.getContent()",
      "String BdkCertificateConfig.getPassword()", "String BdkCertificateConfig.getPath()",
      "void BdkCertificateConfig.setContent(byte[])", "void BdkCertificateConfig.setPassword(String)",
      "void BdkCertificateConfig.setPath(String)"})
  void testGettersAndSetters() throws UnsupportedEncodingException {
    // Arrange and Act
    BdkCertificateConfig actualBdkCertificateConfig = new BdkCertificateConfig();
    byte[] content = "AXAXAXAX".getBytes("UTF-8");
    actualBdkCertificateConfig.setContent(content);
    actualBdkCertificateConfig.setPassword("iloveyou");
    actualBdkCertificateConfig.setPath("Path");
    byte[] actualContent = actualBdkCertificateConfig.getContent();
    String actualPassword = actualBdkCertificateConfig.getPassword();

    // Assert
    assertEquals("Path", actualBdkCertificateConfig.getPath());
    assertEquals("iloveyou", actualPassword);
    assertSame(content, actualContent);
  }

  /**
   * Test getters and setters.
   * <ul>
   *   <li>When {@code AXAXAXAX} Bytes is {@code UTF-8}.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BdkCertificateConfig#BdkCertificateConfig(String, byte[], String)}
   *   <li>{@link BdkCertificateConfig#setContent(byte[])}
   *   <li>{@link BdkCertificateConfig#setPassword(String)}
   *   <li>{@link BdkCertificateConfig#setPath(String)}
   *   <li>{@link BdkCertificateConfig#getContent()}
   *   <li>{@link BdkCertificateConfig#getPassword()}
   *   <li>{@link BdkCertificateConfig#getPath()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters; when 'AXAXAXAX' Bytes is 'UTF-8'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BdkCertificateConfig.<init>()", "void BdkCertificateConfig.<init>(String, String)",
      "void BdkCertificateConfig.<init>(String, byte[], String)", "byte[] BdkCertificateConfig.getContent()",
      "String BdkCertificateConfig.getPassword()", "String BdkCertificateConfig.getPath()",
      "void BdkCertificateConfig.setContent(byte[])", "void BdkCertificateConfig.setPassword(String)",
      "void BdkCertificateConfig.setPath(String)"})
  void testGettersAndSetters_whenAxaxaxaxBytesIsUtf8() throws UnsupportedEncodingException {
    // Arrange and Act
    BdkCertificateConfig actualBdkCertificateConfig = new BdkCertificateConfig("Path", "AXAXAXAX".getBytes("UTF-8"),
        "iloveyou");
    byte[] content = "AXAXAXAX".getBytes("UTF-8");
    actualBdkCertificateConfig.setContent(content);
    actualBdkCertificateConfig.setPassword("iloveyou");
    actualBdkCertificateConfig.setPath("Path");
    byte[] actualContent = actualBdkCertificateConfig.getContent();
    String actualPassword = actualBdkCertificateConfig.getPassword();

    // Assert
    assertEquals("Path", actualBdkCertificateConfig.getPath());
    assertEquals("iloveyou", actualPassword);
    assertSame(content, actualContent);
  }

  /**
   * Test getters and setters.
   * <ul>
   *   <li>When {@code Path}.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BdkCertificateConfig#BdkCertificateConfig(String, String)}
   *   <li>{@link BdkCertificateConfig#setContent(byte[])}
   *   <li>{@link BdkCertificateConfig#setPassword(String)}
   *   <li>{@link BdkCertificateConfig#setPath(String)}
   *   <li>{@link BdkCertificateConfig#getContent()}
   *   <li>{@link BdkCertificateConfig#getPassword()}
   *   <li>{@link BdkCertificateConfig#getPath()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters; when 'Path'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BdkCertificateConfig.<init>()", "void BdkCertificateConfig.<init>(String, String)",
      "void BdkCertificateConfig.<init>(String, byte[], String)", "byte[] BdkCertificateConfig.getContent()",
      "String BdkCertificateConfig.getPassword()", "String BdkCertificateConfig.getPath()",
      "void BdkCertificateConfig.setContent(byte[])", "void BdkCertificateConfig.setPassword(String)",
      "void BdkCertificateConfig.setPath(String)"})
  void testGettersAndSetters_whenPath() throws UnsupportedEncodingException {
    // Arrange and Act
    BdkCertificateConfig actualBdkCertificateConfig = new BdkCertificateConfig("Path", "iloveyou");
    byte[] content = "AXAXAXAX".getBytes("UTF-8");
    actualBdkCertificateConfig.setContent(content);
    actualBdkCertificateConfig.setPassword("iloveyou");
    actualBdkCertificateConfig.setPath("Path");
    byte[] actualContent = actualBdkCertificateConfig.getContent();
    String actualPassword = actualBdkCertificateConfig.getPassword();

    // Assert
    assertEquals("Path", actualBdkCertificateConfig.getPath());
    assertEquals("iloveyou", actualPassword);
    assertSame(content, actualContent);
  }

  /**
   * Test {@link BdkCertificateConfig#isConfigured()}.
   * <p>
   * Method under test: {@link BdkCertificateConfig#isConfigured()}
   */
  @Test
  @DisplayName("Test isConfigured()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkCertificateConfig.isConfigured()"})
  void testIsConfigured() {
    // Arrange
    BdkCertificateConfig bdkCertificateConfig = new BdkCertificateConfig("Path", "iloveyou");
    bdkCertificateConfig.setPassword(null);
    bdkCertificateConfig.setPath(null);
    bdkCertificateConfig.setContent(null);

    // Act and Assert
    assertFalse(bdkCertificateConfig.isConfigured());
  }

  /**
   * Test {@link BdkCertificateConfig#isConfigured()}.
   * <p>
   * Method under test: {@link BdkCertificateConfig#isConfigured()}
   */
  @Test
  @DisplayName("Test isConfigured()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkCertificateConfig.isConfigured()"})
  void testIsConfigured2() throws UnsupportedEncodingException {
    // Arrange
    BdkCertificateConfig bdkCertificateConfig = new BdkCertificateConfig("Path", "iloveyou");
    bdkCertificateConfig.setPassword(null);
    bdkCertificateConfig.setPath(null);
    bdkCertificateConfig.setContent("AXAXAXAX".getBytes("UTF-8"));

    // Act and Assert
    assertFalse(bdkCertificateConfig.isConfigured());
  }

  /**
   * Test {@link BdkCertificateConfig#isConfigured()}.
   * <p>
   * Method under test: {@link BdkCertificateConfig#isConfigured()}
   */
  @Test
  @DisplayName("Test isConfigured()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkCertificateConfig.isConfigured()"})
  void testIsConfigured3() {
    // Arrange
    BdkCertificateConfig bdkCertificateConfig = new BdkCertificateConfig("Path", "iloveyou");
    bdkCertificateConfig.setPassword("foo");
    bdkCertificateConfig.setPath(null);
    bdkCertificateConfig.setContent(null);

    // Act and Assert
    assertFalse(bdkCertificateConfig.isConfigured());
  }

  /**
   * Test {@link BdkCertificateConfig#isConfigured()}.
   * <p>
   * Method under test: {@link BdkCertificateConfig#isConfigured()}
   */
  @Test
  @DisplayName("Test isConfigured()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkCertificateConfig.isConfigured()"})
  void testIsConfigured4() {
    // Arrange, Act and Assert
    assertFalse((new BdkCertificateConfig("", "iloveyou")).isConfigured());
  }

  /**
   * Test {@link BdkCertificateConfig#isConfigured()}.
   * <p>
   * Method under test: {@link BdkCertificateConfig#isConfigured()}
   */
  @Test
  @DisplayName("Test isConfigured()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkCertificateConfig.isConfigured()"})
  void testIsConfigured5() {
    // Arrange
    BdkCertificateConfig bdkCertificateConfig = new BdkCertificateConfig("Path", "iloveyou");
    bdkCertificateConfig.setPassword(null);
    bdkCertificateConfig.setPath(null);
    bdkCertificateConfig.setContent(new byte[]{});

    // Act and Assert
    assertFalse(bdkCertificateConfig.isConfigured());
  }

  /**
   * Test {@link BdkCertificateConfig#isConfigured()}.
   * <ul>
   *   <li>Given {@link BdkCertificateConfig#BdkCertificateConfig(String, String)} with {@code Path} and password is {@code iloveyou}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkCertificateConfig#isConfigured()}
   */
  @Test
  @DisplayName("Test isConfigured(); given BdkCertificateConfig(String, String) with 'Path' and password is 'iloveyou'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkCertificateConfig.isConfigured()"})
  void testIsConfigured_givenBdkCertificateConfigWithPathAndPasswordIsIloveyou() {
    // Arrange, Act and Assert
    assertTrue((new BdkCertificateConfig("Path", "iloveyou")).isConfigured());
  }

  /**
   * Test {@link BdkCertificateConfig#isConfigured()}.
   * <ul>
   *   <li>Given {@link BdkCertificateConfig#BdkCertificateConfig(String, String)} with {@code Path} and password is {@code iloveyou} Path is {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkCertificateConfig#isConfigured()}
   */
  @Test
  @DisplayName("Test isConfigured(); given BdkCertificateConfig(String, String) with 'Path' and password is 'iloveyou' Path is 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkCertificateConfig.isConfigured()"})
  void testIsConfigured_givenBdkCertificateConfigWithPathAndPasswordIsIloveyouPathIsFoo() {
    // Arrange
    BdkCertificateConfig bdkCertificateConfig = new BdkCertificateConfig("Path", "iloveyou");
    bdkCertificateConfig.setPassword(null);
    bdkCertificateConfig.setPath("foo");
    bdkCertificateConfig.setContent(null);

    // Act and Assert
    assertFalse(bdkCertificateConfig.isConfigured());
  }

  /**
   * Test {@link BdkCertificateConfig#isConfigured()}.
   * <ul>
   *   <li>Given {@link BdkCertificateConfig#BdkCertificateConfig(String, String)} with {@code Path} and password is {@code iloveyou} Path is {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkCertificateConfig#isConfigured()}
   */
  @Test
  @DisplayName("Test isConfigured(); given BdkCertificateConfig(String, String) with 'Path' and password is 'iloveyou' Path is 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkCertificateConfig.isConfigured()"})
  void testIsConfigured_givenBdkCertificateConfigWithPathAndPasswordIsIloveyouPathIsFoo2()
      throws UnsupportedEncodingException {
    // Arrange
    BdkCertificateConfig bdkCertificateConfig = new BdkCertificateConfig("Path", "iloveyou");
    bdkCertificateConfig.setPassword("foo");
    bdkCertificateConfig.setPath("foo");
    bdkCertificateConfig.setContent("AXAXAXAX".getBytes("UTF-8"));

    // Act and Assert
    assertTrue(bdkCertificateConfig.isConfigured());
  }

  /**
   * Test {@link BdkCertificateConfig#isConfigured()}.
   * <ul>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkCertificateConfig#isConfigured()}
   */
  @Test
  @DisplayName("Test isConfigured(); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkCertificateConfig.isConfigured()"})
  void testIsConfigured_thenReturnTrue() throws UnsupportedEncodingException {
    // Arrange
    BdkCertificateConfig bdkCertificateConfig = new BdkCertificateConfig("Path", "iloveyou");
    bdkCertificateConfig.setPassword("foo");
    bdkCertificateConfig.setPath(null);
    bdkCertificateConfig.setContent("AXAXAXAX".getBytes("UTF-8"));

    // Act and Assert
    assertTrue(bdkCertificateConfig.isConfigured());
  }

  /**
   * Test {@link BdkCertificateConfig#isValid()}.
   * <p>
   * Method under test: {@link BdkCertificateConfig#isValid()}
   */
  @Test
  @DisplayName("Test isValid()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkCertificateConfig.isValid()"})
  void testIsValid() {
    // Arrange
    BdkCertificateConfig bdkCertificateConfig = new BdkCertificateConfig("Path", "iloveyou");
    bdkCertificateConfig.setPath("foo");
    bdkCertificateConfig.setContent(new byte[]{});

    // Act and Assert
    assertTrue(bdkCertificateConfig.isValid());
  }

  /**
   * Test {@link BdkCertificateConfig#isValid()}.
   * <ul>
   *   <li>Given {@link BdkCertificateConfig#BdkCertificateConfig(String, String)} with {@code Path} and password is {@code iloveyou}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkCertificateConfig#isValid()}
   */
  @Test
  @DisplayName("Test isValid(); given BdkCertificateConfig(String, String) with 'Path' and password is 'iloveyou'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkCertificateConfig.isValid()"})
  void testIsValid_givenBdkCertificateConfigWithPathAndPasswordIsIloveyou() {
    // Arrange, Act and Assert
    assertTrue((new BdkCertificateConfig("Path", "iloveyou")).isValid());
  }

  /**
   * Test {@link BdkCertificateConfig#isValid()}.
   * <ul>
   *   <li>Given {@link BdkCertificateConfig#BdkCertificateConfig(String, String)} with {@code Path} and password is {@code iloveyou} Path is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkCertificateConfig#isValid()}
   */
  @Test
  @DisplayName("Test isValid(); given BdkCertificateConfig(String, String) with 'Path' and password is 'iloveyou' Path is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkCertificateConfig.isValid()"})
  void testIsValid_givenBdkCertificateConfigWithPathAndPasswordIsIloveyouPathIsNull() {
    // Arrange
    BdkCertificateConfig bdkCertificateConfig = new BdkCertificateConfig("Path", "iloveyou");
    bdkCertificateConfig.setPath(null);
    bdkCertificateConfig.setContent(null);

    // Act and Assert
    assertTrue(bdkCertificateConfig.isValid());
  }

  /**
   * Test {@link BdkCertificateConfig#isValid()}.
   * <ul>
   *   <li>Given {@link BdkCertificateConfig#BdkCertificateConfig(String, String)} with path is empty string and password is {@code iloveyou}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkCertificateConfig#isValid()}
   */
  @Test
  @DisplayName("Test isValid(); given BdkCertificateConfig(String, String) with path is empty string and password is 'iloveyou'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkCertificateConfig.isValid()"})
  void testIsValid_givenBdkCertificateConfigWithPathIsEmptyStringAndPasswordIsIloveyou() {
    // Arrange, Act and Assert
    assertTrue((new BdkCertificateConfig("", "iloveyou")).isValid());
  }

  /**
   * Test {@link BdkCertificateConfig#isValid()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkCertificateConfig#isValid()}
   */
  @Test
  @DisplayName("Test isValid(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BdkCertificateConfig.isValid()"})
  void testIsValid_thenReturnFalse() throws UnsupportedEncodingException {
    // Arrange
    BdkCertificateConfig bdkCertificateConfig = new BdkCertificateConfig("Path", "iloveyou");
    bdkCertificateConfig.setPath("foo");
    bdkCertificateConfig.setContent("AXAXAXAX".getBytes("UTF-8"));

    // Act and Assert
    assertFalse(bdkCertificateConfig.isValid());
  }

  /**
   * Test {@link BdkCertificateConfig#getCertificateBytes()}.
   * <p>
   * Method under test: {@link BdkCertificateConfig#getCertificateBytes()}
   */
  @Test
  @DisplayName("Test getCertificateBytes()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"byte[] BdkCertificateConfig.getCertificateBytes()"})
  void testGetCertificateBytes() {
    // Arrange
    BdkCertificateConfig bdkCertificateConfig = new BdkCertificateConfig("Path", "iloveyou");
    bdkCertificateConfig.setPath("classpath:");
    bdkCertificateConfig.setContent(null);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> bdkCertificateConfig.getCertificateBytes());
  }

  /**
   * Test {@link BdkCertificateConfig#getCertificateBytes()}.
   * <p>
   * Method under test: {@link BdkCertificateConfig#getCertificateBytes()}
   */
  @Test
  @DisplayName("Test getCertificateBytes()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"byte[] BdkCertificateConfig.getCertificateBytes()"})
  void testGetCertificateBytes2() {
    // Arrange
    BdkCertificateConfig bdkCertificateConfig = new BdkCertificateConfig("Path", "iloveyou");
    bdkCertificateConfig.setPath("classpath:");
    bdkCertificateConfig.setContent(new byte[]{});

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> bdkCertificateConfig.getCertificateBytes());
  }

  /**
   * Test {@link BdkCertificateConfig#getCertificateBytes()}.
   * <p>
   * Method under test: {@link BdkCertificateConfig#getCertificateBytes()}
   */
  @Test
  @DisplayName("Test getCertificateBytes()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"byte[] BdkCertificateConfig.getCertificateBytes()"})
  void testGetCertificateBytes3() {
    // Arrange
    BdkCertificateConfig bdkCertificateConfig = new BdkCertificateConfig("Path", "iloveyou");
    bdkCertificateConfig.setPath("classpath:Path");
    bdkCertificateConfig.setContent(null);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> bdkCertificateConfig.getCertificateBytes());
  }

  /**
   * Test {@link BdkCertificateConfig#getCertificateBytes()}.
   * <ul>
   *   <li>Given {@link BdkCertificateConfig#BdkCertificateConfig(String, String)} with {@code Path} and password is {@code iloveyou}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkCertificateConfig#getCertificateBytes()}
   */
  @Test
  @DisplayName("Test getCertificateBytes(); given BdkCertificateConfig(String, String) with 'Path' and password is 'iloveyou'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"byte[] BdkCertificateConfig.getCertificateBytes()"})
  void testGetCertificateBytes_givenBdkCertificateConfigWithPathAndPasswordIsIloveyou() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> (new BdkCertificateConfig("Path", "iloveyou")).getCertificateBytes());
  }

  /**
   * Test {@link BdkCertificateConfig#getCertificateBytes()}.
   * <ul>
   *   <li>Then return {@code AXAXAXAX} Bytes is {@code UTF-8}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkCertificateConfig#getCertificateBytes()}
   */
  @Test
  @DisplayName("Test getCertificateBytes(); then return 'AXAXAXAX' Bytes is 'UTF-8'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"byte[] BdkCertificateConfig.getCertificateBytes()"})
  void testGetCertificateBytes_thenReturnAxaxaxaxBytesIsUtf8() throws UnsupportedEncodingException {
    // Arrange
    BdkCertificateConfig bdkCertificateConfig = new BdkCertificateConfig("Path", "iloveyou");
    bdkCertificateConfig.setPath("classpath:");
    bdkCertificateConfig.setContent("AXAXAXAX".getBytes("UTF-8"));

    // Act
    byte[] actualCertificateBytes = bdkCertificateConfig.getCertificateBytes();

    // Assert
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), actualCertificateBytes);
  }
}
