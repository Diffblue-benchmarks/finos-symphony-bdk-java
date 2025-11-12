package com.symphony.bdk.core.config;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.config.exception.BdkConfigException;
import com.symphony.bdk.core.config.model.BdkConfig;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkConfigLoaderDiffblueTest {
  /**
   * Test {@link BdkConfigLoader#loadFromFile(String)}.
   *
   * <p>Method under test: {@link BdkConfigLoader#loadFromFile(String)}
   */
  @Test
  @DisplayName("Test loadFromFile(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkConfig BdkConfigLoader.loadFromFile(String)"})
  void testLoadFromFile() throws BdkConfigException {
    // Arrange, Act and Assert
    assertThrows(BdkConfigException.class, () -> BdkConfigLoader.loadFromFile("Config Path"));
  }

  /**
   * Test {@link BdkConfigLoader#loadFromInputStream(InputStream)}.
   *
   * <ul>
   *   <li>Given {@link ByteArrayOutputStream#ByteArrayOutputStream()}.
   * </ul>
   *
   * <p>Method under test: {@link BdkConfigLoader#loadFromInputStream(InputStream)}
   */
  @Test
  @DisplayName("Test loadFromInputStream(InputStream); given ByteArrayOutputStream()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkConfig BdkConfigLoader.loadFromInputStream(InputStream)"})
  void testLoadFromInputStream_givenByteArrayOutputStream() throws BdkConfigException, IOException {
    // Arrange
    ByteArrayInputStream inputStream = new ByteArrayInputStream("AXAXAXAX".getBytes("UTF-8"));
    inputStream.transferTo(new ByteArrayOutputStream());

    // Act and Assert
    assertNull(BdkConfigLoader.loadFromInputStream(inputStream));
  }

  /**
   * Test {@link BdkConfigLoader#loadFromInputStream(InputStream)}.
   *
   * <ul>
   *   <li>When {@link ByteArrayInputStream#ByteArrayInputStream(byte[])} with empty array of {@code
   *       byte}.
   * </ul>
   *
   * <p>Method under test: {@link BdkConfigLoader#loadFromInputStream(InputStream)}
   */
  @Test
  @DisplayName(
      "Test loadFromInputStream(InputStream); when ByteArrayInputStream(byte[]) with empty array of byte")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkConfig BdkConfigLoader.loadFromInputStream(InputStream)"})
  void testLoadFromInputStream_whenByteArrayInputStreamWithEmptyArrayOfByte()
      throws BdkConfigException {
    // Arrange
    ByteArrayInputStream inputStream = new ByteArrayInputStream(new byte[] {});

    // Act and Assert
    assertNull(BdkConfigLoader.loadFromInputStream(inputStream));
  }

  /**
   * Test {@link BdkConfigLoader#loadFromClasspath(String)}.
   *
   * <ul>
   *   <li>When {@code Config Path}.
   *   <li>Then throw {@link BdkConfigException}.
   * </ul>
   *
   * <p>Method under test: {@link BdkConfigLoader#loadFromClasspath(String)}
   */
  @Test
  @DisplayName("Test loadFromClasspath(String); when 'Config Path'; then throw BdkConfigException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkConfig BdkConfigLoader.loadFromClasspath(String)"})
  void testLoadFromClasspath_whenConfigPath_thenThrowBdkConfigException()
      throws BdkConfigException {
    // Arrange, Act and Assert
    assertThrows(BdkConfigException.class, () -> BdkConfigLoader.loadFromClasspath("Config Path"));
  }

  /**
   * Test {@link BdkConfigLoader#loadFromProperties(Properties)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link Properties#Properties()} {@code 42} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link BdkConfigLoader#loadFromProperties(Properties)}
   */
  @Test
  @DisplayName("Test loadFromProperties(Properties); given '42'; when Properties() '42' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkConfig BdkConfigLoader.loadFromProperties(Properties)"})
  void testLoadFromProperties_given42_whenProperties42IsValue() throws IOException {
    // Arrange
    Properties properties = new Properties();
    properties.put("42", "Value");
    properties.put("Key", "Value");

    // Act
    BdkConfig actualLoadFromPropertiesResult = BdkConfigLoader.loadFromProperties(properties);

    // Assert
    assertEquals("", actualLoadFromPropertiesResult.getContext());
    assertEquals("", actualLoadFromPropertiesResult.getFormattedContext());
    assertEquals("https", actualLoadFromPropertiesResult.getScheme());
    assertEquals("https://null:443", actualLoadFromPropertiesResult.getBasePath());
    assertNull(actualLoadFromPropertiesResult.getProxy());
    assertNull(actualLoadFromPropertiesResult.getConnectionPoolMax());
    assertNull(actualLoadFromPropertiesResult.getConnectionPoolPerRoute());
    assertNull(actualLoadFromPropertiesResult.getConnectionTimeout());
    assertNull(actualLoadFromPropertiesResult.getReadTimeout());
    assertNull(actualLoadFromPropertiesResult.getHost());
    assertNull(actualLoadFromPropertiesResult.getDefaultHeaders());
    assertEquals(443, actualLoadFromPropertiesResult.getPort().intValue());
    assertFalse(actualLoadFromPropertiesResult.isBotConfigured());
    assertFalse(actualLoadFromPropertiesResult.isOboConfigured());
  }

  /**
   * Test {@link BdkConfigLoader#loadFromProperties(Properties)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()}.
   *   <li>When {@link Properties#Properties()} All is {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link BdkConfigLoader#loadFromProperties(Properties)}
   */
  @Test
  @DisplayName(
      "Test loadFromProperties(Properties); given HashMap(); when Properties() All is HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkConfig BdkConfigLoader.loadFromProperties(Properties)"})
  void testLoadFromProperties_givenHashMap_whenPropertiesAllIsHashMap() throws IOException {
    // Arrange
    Properties properties = new Properties();
    properties.putAll(new HashMap<>());

    // Act
    BdkConfig actualLoadFromPropertiesResult = BdkConfigLoader.loadFromProperties(properties);

    // Assert
    assertEquals("", actualLoadFromPropertiesResult.getContext());
    assertEquals("", actualLoadFromPropertiesResult.getFormattedContext());
    assertEquals("https", actualLoadFromPropertiesResult.getScheme());
    assertEquals("https://null:443", actualLoadFromPropertiesResult.getBasePath());
    assertNull(actualLoadFromPropertiesResult.getProxy());
    assertNull(actualLoadFromPropertiesResult.getConnectionPoolMax());
    assertNull(actualLoadFromPropertiesResult.getConnectionPoolPerRoute());
    assertNull(actualLoadFromPropertiesResult.getConnectionTimeout());
    assertNull(actualLoadFromPropertiesResult.getReadTimeout());
    assertNull(actualLoadFromPropertiesResult.getHost());
    assertNull(actualLoadFromPropertiesResult.getDefaultHeaders());
    assertEquals(443, actualLoadFromPropertiesResult.getPort().intValue());
    assertFalse(actualLoadFromPropertiesResult.isBotConfigured());
    assertFalse(actualLoadFromPropertiesResult.isOboConfigured());
  }

  /**
   * Test {@link BdkConfigLoader#loadFromProperties(Properties)}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When {@link Properties#Properties()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link BdkConfigLoader#loadFromProperties(Properties)}
   */
  @Test
  @DisplayName(
      "Test loadFromProperties(Properties); given 'Key'; when Properties() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkConfig BdkConfigLoader.loadFromProperties(Properties)"})
  void testLoadFromProperties_givenKey_whenPropertiesKeyIsValue() throws IOException {
    // Arrange
    Properties properties = new Properties();
    properties.put("Key", "Value");

    // Act
    BdkConfig actualLoadFromPropertiesResult = BdkConfigLoader.loadFromProperties(properties);

    // Assert
    assertEquals("", actualLoadFromPropertiesResult.getContext());
    assertEquals("", actualLoadFromPropertiesResult.getFormattedContext());
    assertEquals("https", actualLoadFromPropertiesResult.getScheme());
    assertEquals("https://null:443", actualLoadFromPropertiesResult.getBasePath());
    assertNull(actualLoadFromPropertiesResult.getProxy());
    assertNull(actualLoadFromPropertiesResult.getConnectionPoolMax());
    assertNull(actualLoadFromPropertiesResult.getConnectionPoolPerRoute());
    assertNull(actualLoadFromPropertiesResult.getConnectionTimeout());
    assertNull(actualLoadFromPropertiesResult.getReadTimeout());
    assertNull(actualLoadFromPropertiesResult.getHost());
    assertNull(actualLoadFromPropertiesResult.getDefaultHeaders());
    assertEquals(443, actualLoadFromPropertiesResult.getPort().intValue());
    assertFalse(actualLoadFromPropertiesResult.isBotConfigured());
    assertFalse(actualLoadFromPropertiesResult.isOboConfigured());
  }

  /**
   * Test {@link BdkConfigLoader#loadFromProperties(Properties)}.
   *
   * <ul>
   *   <li>When {@link Properties#Properties()}.
   *   <li>Then return Context is empty string.
   * </ul>
   *
   * <p>Method under test: {@link BdkConfigLoader#loadFromProperties(Properties)}
   */
  @Test
  @DisplayName(
      "Test loadFromProperties(Properties); when Properties(); then return Context is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkConfig BdkConfigLoader.loadFromProperties(Properties)"})
  void testLoadFromProperties_whenProperties_thenReturnContextIsEmptyString() throws IOException {
    // Arrange and Act
    BdkConfig actualLoadFromPropertiesResult = BdkConfigLoader.loadFromProperties(new Properties());

    // Assert
    assertEquals("", actualLoadFromPropertiesResult.getContext());
    assertEquals("", actualLoadFromPropertiesResult.getFormattedContext());
    assertEquals("https", actualLoadFromPropertiesResult.getScheme());
    assertEquals("https://null:443", actualLoadFromPropertiesResult.getBasePath());
    assertNull(actualLoadFromPropertiesResult.getProxy());
    assertNull(actualLoadFromPropertiesResult.getConnectionPoolMax());
    assertNull(actualLoadFromPropertiesResult.getConnectionPoolPerRoute());
    assertNull(actualLoadFromPropertiesResult.getConnectionTimeout());
    assertNull(actualLoadFromPropertiesResult.getReadTimeout());
    assertNull(actualLoadFromPropertiesResult.getHost());
    assertNull(actualLoadFromPropertiesResult.getDefaultHeaders());
    assertEquals(443, actualLoadFromPropertiesResult.getPort().intValue());
    assertFalse(actualLoadFromPropertiesResult.isBotConfigured());
    assertFalse(actualLoadFromPropertiesResult.isOboConfigured());
  }

  /**
   * Test {@link BdkConfigLoader#loadFromPropertyMap(Map)}.
   *
   * <ul>
   *   <li>Given {@code https}.
   *   <li>When {@link HashMap#HashMap()} {@code https} is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link BdkConfigLoader#loadFromPropertyMap(Map)}
   */
  @Test
  @DisplayName("Test loadFromPropertyMap(Map); given 'https'; when HashMap() 'https' is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkConfig BdkConfigLoader.loadFromPropertyMap(Map)"})
  void testLoadFromPropertyMap_givenHttps_whenHashMapHttpsIs42() throws IOException {
    // Arrange
    HashMap<String, String> properties = new HashMap<>();
    properties.put("https", "42");

    // Act
    BdkConfig actualLoadFromPropertyMapResult = BdkConfigLoader.loadFromPropertyMap(properties);

    // Assert
    assertEquals("", actualLoadFromPropertyMapResult.getContext());
    assertEquals("", actualLoadFromPropertyMapResult.getFormattedContext());
    assertEquals("https", actualLoadFromPropertyMapResult.getScheme());
    assertEquals("https://null:443", actualLoadFromPropertyMapResult.getBasePath());
    assertNull(actualLoadFromPropertyMapResult.getProxy());
    assertNull(actualLoadFromPropertyMapResult.getConnectionPoolMax());
    assertNull(actualLoadFromPropertyMapResult.getConnectionPoolPerRoute());
    assertNull(actualLoadFromPropertyMapResult.getConnectionTimeout());
    assertNull(actualLoadFromPropertyMapResult.getReadTimeout());
    assertNull(actualLoadFromPropertyMapResult.getHost());
    assertNull(actualLoadFromPropertyMapResult.getDefaultHeaders());
    assertEquals(443, actualLoadFromPropertyMapResult.getPort().intValue());
    assertFalse(actualLoadFromPropertyMapResult.isBotConfigured());
    assertFalse(actualLoadFromPropertyMapResult.isOboConfigured());
  }

  /**
   * Test {@link BdkConfigLoader#loadFromPropertyMap(Map)}.
   *
   * <ul>
   *   <li>Given {@code v2}.
   *   <li>When {@link HashMap#HashMap()} {@code v2} is {@code https}.
   * </ul>
   *
   * <p>Method under test: {@link BdkConfigLoader#loadFromPropertyMap(Map)}
   */
  @Test
  @DisplayName("Test loadFromPropertyMap(Map); given 'v2'; when HashMap() 'v2' is 'https'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkConfig BdkConfigLoader.loadFromPropertyMap(Map)"})
  void testLoadFromPropertyMap_givenV2_whenHashMapV2IsHttps() throws IOException {
    // Arrange
    HashMap<String, String> properties = new HashMap<>();
    properties.put("v2", "https");
    properties.put("https", "42");

    // Act
    BdkConfig actualLoadFromPropertyMapResult = BdkConfigLoader.loadFromPropertyMap(properties);

    // Assert
    assertEquals("", actualLoadFromPropertyMapResult.getContext());
    assertEquals("", actualLoadFromPropertyMapResult.getFormattedContext());
    assertEquals("https", actualLoadFromPropertyMapResult.getScheme());
    assertEquals("https://null:443", actualLoadFromPropertyMapResult.getBasePath());
    assertNull(actualLoadFromPropertyMapResult.getProxy());
    assertNull(actualLoadFromPropertyMapResult.getConnectionPoolMax());
    assertNull(actualLoadFromPropertyMapResult.getConnectionPoolPerRoute());
    assertNull(actualLoadFromPropertyMapResult.getConnectionTimeout());
    assertNull(actualLoadFromPropertyMapResult.getReadTimeout());
    assertNull(actualLoadFromPropertyMapResult.getHost());
    assertNull(actualLoadFromPropertyMapResult.getDefaultHeaders());
    assertEquals(443, actualLoadFromPropertyMapResult.getPort().intValue());
    assertFalse(actualLoadFromPropertyMapResult.isBotConfigured());
    assertFalse(actualLoadFromPropertyMapResult.isOboConfigured());
  }

  /**
   * Test {@link BdkConfigLoader#loadFromPropertyMap(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return Context is empty string.
   * </ul>
   *
   * <p>Method under test: {@link BdkConfigLoader#loadFromPropertyMap(Map)}
   */
  @Test
  @DisplayName("Test loadFromPropertyMap(Map); when HashMap(); then return Context is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BdkConfig BdkConfigLoader.loadFromPropertyMap(Map)"})
  void testLoadFromPropertyMap_whenHashMap_thenReturnContextIsEmptyString() throws IOException {
    // Arrange and Act
    BdkConfig actualLoadFromPropertyMapResult =
        BdkConfigLoader.loadFromPropertyMap(new HashMap<>());

    // Assert
    assertEquals("", actualLoadFromPropertyMapResult.getContext());
    assertEquals("", actualLoadFromPropertyMapResult.getFormattedContext());
    assertEquals("https", actualLoadFromPropertyMapResult.getScheme());
    assertEquals("https://null:443", actualLoadFromPropertyMapResult.getBasePath());
    assertNull(actualLoadFromPropertyMapResult.getProxy());
    assertNull(actualLoadFromPropertyMapResult.getConnectionPoolMax());
    assertNull(actualLoadFromPropertyMapResult.getConnectionPoolPerRoute());
    assertNull(actualLoadFromPropertyMapResult.getConnectionTimeout());
    assertNull(actualLoadFromPropertyMapResult.getReadTimeout());
    assertNull(actualLoadFromPropertyMapResult.getHost());
    assertNull(actualLoadFromPropertyMapResult.getDefaultHeaders());
    assertEquals(443, actualLoadFromPropertyMapResult.getPort().intValue());
    assertFalse(actualLoadFromPropertyMapResult.isBotConfigured());
    assertFalse(actualLoadFromPropertyMapResult.isOboConfigured());
  }
}
