package com.symphony.bdk.core.service.datafeed.impl;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.config.model.BdkAgentConfig;
import com.symphony.bdk.core.config.model.BdkBotConfig;
import com.symphony.bdk.core.config.model.BdkCertificateConfig;
import com.symphony.bdk.core.config.model.BdkClientConfig;
import com.symphony.bdk.core.config.model.BdkCommonJwtConfig;
import com.symphony.bdk.core.config.model.BdkConfig;
import com.symphony.bdk.core.config.model.BdkDatafeedConfig;
import com.symphony.bdk.core.config.model.BdkDatahoseConfig;
import com.symphony.bdk.core.config.model.BdkExtAppConfig;
import com.symphony.bdk.core.config.model.BdkProxyConfig;
import com.symphony.bdk.core.config.model.BdkRsaKeyConfig;
import com.symphony.bdk.core.config.model.BdkSslConfig;
import com.symphony.bdk.core.test.BdkRetryConfigTestHelper;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

class OnDiskDatafeedIdRepositoryDiffblueTest {
  /**
   * Test {@link OnDiskDatafeedIdRepository#write(String, String)} with {@code datafeedId}, {@code
   * agentBasePath}.
   *
   * <p>Method under test: {@link OnDiskDatafeedIdRepository#write(String, String)}
   */
  @Test
  @DisplayName("Test write(String, String) with 'datafeedId', 'agentBasePath'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void OnDiskDatafeedIdRepository.write(String, String)"})
  void testWriteWithDatafeedIdAgentBasePath() throws IOException {
    // Arrange
    try (MockedStatic<Files> mockFiles = mockStatic(Files.class)) {
      mockFiles
          .when(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)))
          .thenReturn(true);
      mockFiles.when(() -> Files.isSymbolicLink(Mockito.<Path>any())).thenReturn(true);
      mockFiles
          .when(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)))
          .thenReturn(new ByteArrayOutputStream());
      mockFiles
          .when(() -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

      BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
      privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
      privateKey.setPath("Path");

      BdkExtAppConfig app = new BdkExtAppConfig();
      app.setAppId("42");
      app.setCertificate(new BdkCertificateConfig());
      app.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
      app.setCertificatePassword("iloveyou");
      app.setCertificatePath("Certificate Path");
      app.setPrivateKey(privateKey);
      app.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
      app.setPrivateKeyPath("Private Key Path");

      BdkRsaKeyConfig privateKey2 = new BdkRsaKeyConfig();
      privateKey2.setContent("AXAXAXAX".getBytes("UTF-8"));
      privateKey2.setPath("Path");

      BdkBotConfig bot = new BdkBotConfig();
      bot.setCertificate(new BdkCertificateConfig());
      bot.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
      bot.setCertificatePassword("iloveyou");
      bot.setCertificatePath("Certificate Path");
      bot.setPrivateKey(privateKey2);
      bot.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
      bot.setPrivateKeyPath("Private Key Path");
      bot.setUsername("janedoe");

      BdkCommonJwtConfig commonJwt = new BdkCommonJwtConfig();
      commonJwt.setEnabled(true);

      BdkDatahoseConfig datahose = new BdkDatahoseConfig();
      datahose.setEventTypes(new ArrayList<>());
      datahose.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      datahose.setTag("Tag");

      HashMap<String, String> defaultHeaders = new HashMap<>();
      defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

      BdkSslConfig ssl = new BdkSslConfig();
      ssl.setTrustStore(new BdkCertificateConfig());
      ssl.setTrustStorePassword("iloveyou");
      ssl.setTrustStorePath("Trust Store Path");

      BdkDatafeedConfig datafeed = new BdkDatafeedConfig();
      datafeed.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      datafeed.setVersion("1.0.2");
      datafeed.setIdFilePath("/directory/foo.txt");

      BdkConfig config = new BdkConfig();
      config.setAgent(new BdkAgentConfig());
      config.setApp(app);
      config.setBot(bot);
      config.setCommonJwt(commonJwt);
      config.setConnectionPoolMax(1);
      config.setConnectionPoolPerRoute(1);
      config.setConnectionTimeout(10);
      config.setContext("Context");
      config.setDatahose(datahose);
      config.setDefaultHeaders(defaultHeaders);
      config.setHost("localhost");
      config.setKeyManager(new BdkClientConfig());
      config.setPod(new BdkClientConfig());
      config.setPort(8080);
      config.setProxy(new BdkProxyConfig());
      config.setReadTimeout(10);
      config.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      config.setScheme("Scheme");
      config.setSessionAuth(new BdkClientConfig());
      config.setSsl(ssl);
      config.setDatafeed(datafeed);

      // Act
      new OnDiskDatafeedIdRepository(config).write("42", "Agent Base Path");

      // Assert
      mockFiles.verify(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)));
      mockFiles.verify(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)));
    }
  }

  /**
   * Test {@link OnDiskDatafeedIdRepository#write(String, String)} with {@code datafeedId}, {@code
   * agentBasePath}.
   *
   * <p>Method under test: {@link OnDiskDatafeedIdRepository#write(String, String)}
   */
  @Test
  @DisplayName("Test write(String, String) with 'datafeedId', 'agentBasePath'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void OnDiskDatafeedIdRepository.write(String, String)"})
  void testWriteWithDatafeedIdAgentBasePath2() throws IOException {
    // Arrange
    try (MockedStatic<Files> mockFiles = mockStatic(Files.class)) {
      mockFiles
          .when(() -> Files.readSymbolicLink(Mockito.<Path>any()))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
      mockFiles
          .when(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)))
          .thenReturn(false);
      mockFiles.when(() -> Files.isSymbolicLink(Mockito.<Path>any())).thenReturn(true);
      mockFiles
          .when(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)))
          .thenReturn(new ByteArrayOutputStream());
      mockFiles
          .when(() -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

      BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
      privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
      privateKey.setPath("Path");

      BdkExtAppConfig app = new BdkExtAppConfig();
      app.setAppId("42");
      app.setCertificate(new BdkCertificateConfig());
      app.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
      app.setCertificatePassword("iloveyou");
      app.setCertificatePath("Certificate Path");
      app.setPrivateKey(privateKey);
      app.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
      app.setPrivateKeyPath("Private Key Path");

      BdkRsaKeyConfig privateKey2 = new BdkRsaKeyConfig();
      privateKey2.setContent("AXAXAXAX".getBytes("UTF-8"));
      privateKey2.setPath("Path");

      BdkBotConfig bot = new BdkBotConfig();
      bot.setCertificate(new BdkCertificateConfig());
      bot.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
      bot.setCertificatePassword("iloveyou");
      bot.setCertificatePath("Certificate Path");
      bot.setPrivateKey(privateKey2);
      bot.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
      bot.setPrivateKeyPath("Private Key Path");
      bot.setUsername("janedoe");

      BdkCommonJwtConfig commonJwt = new BdkCommonJwtConfig();
      commonJwt.setEnabled(true);

      BdkDatahoseConfig datahose = new BdkDatahoseConfig();
      datahose.setEventTypes(new ArrayList<>());
      datahose.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      datahose.setTag("Tag");

      HashMap<String, String> defaultHeaders = new HashMap<>();
      defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

      BdkSslConfig ssl = new BdkSslConfig();
      ssl.setTrustStore(new BdkCertificateConfig());
      ssl.setTrustStorePassword("iloveyou");
      ssl.setTrustStorePath("Trust Store Path");

      BdkDatafeedConfig datafeed = new BdkDatafeedConfig();
      datafeed.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      datafeed.setVersion("1.0.2");
      datafeed.setIdFilePath("Writing datafeed id {} to file: {}");

      BdkConfig config = new BdkConfig();
      config.setAgent(new BdkAgentConfig());
      config.setApp(app);
      config.setBot(bot);
      config.setCommonJwt(commonJwt);
      config.setConnectionPoolMax(1);
      config.setConnectionPoolPerRoute(1);
      config.setConnectionTimeout(10);
      config.setContext("Context");
      config.setDatahose(datahose);
      config.setDefaultHeaders(defaultHeaders);
      config.setHost("localhost");
      config.setKeyManager(new BdkClientConfig());
      config.setPod(new BdkClientConfig());
      config.setPort(8080);
      config.setProxy(new BdkProxyConfig());
      config.setReadTimeout(10);
      config.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      config.setScheme("Scheme");
      config.setSessionAuth(new BdkClientConfig());
      config.setSsl(ssl);
      config.setDatafeed(datafeed);

      // Act
      new OnDiskDatafeedIdRepository(config).write("42", "Agent Base Path");

      // Assert
      mockFiles.verify(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)));
      mockFiles.verify(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)));
    }
  }

  /**
   * Test {@link OnDiskDatafeedIdRepository#write(String, String)} with {@code datafeedId}, {@code
   * agentBasePath}.
   *
   * <ul>
   *   <li>Given {@link Files} {@link Files#exists(Path, LinkOption[])} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link OnDiskDatafeedIdRepository#write(String, String)}
   */
  @Test
  @DisplayName(
      "Test write(String, String) with 'datafeedId', 'agentBasePath'; given Files exists(Path, LinkOption[]) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void OnDiskDatafeedIdRepository.write(String, String)"})
  void testWriteWithDatafeedIdAgentBasePath_givenFilesExistsReturnTrue() throws IOException {
    // Arrange
    try (MockedStatic<Files> mockFiles = mockStatic(Files.class)) {
      mockFiles
          .when(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)))
          .thenReturn(true);
      mockFiles.when(() -> Files.isSymbolicLink(Mockito.<Path>any())).thenReturn(true);
      mockFiles
          .when(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)))
          .thenReturn(new ByteArrayOutputStream());
      mockFiles
          .when(() -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

      BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
      privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
      privateKey.setPath("Path");

      BdkExtAppConfig app = new BdkExtAppConfig();
      app.setAppId("42");
      app.setCertificate(new BdkCertificateConfig());
      app.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
      app.setCertificatePassword("iloveyou");
      app.setCertificatePath("Certificate Path");
      app.setPrivateKey(privateKey);
      app.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
      app.setPrivateKeyPath("Private Key Path");

      BdkRsaKeyConfig privateKey2 = new BdkRsaKeyConfig();
      privateKey2.setContent("AXAXAXAX".getBytes("UTF-8"));
      privateKey2.setPath("Path");

      BdkBotConfig bot = new BdkBotConfig();
      bot.setCertificate(new BdkCertificateConfig());
      bot.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
      bot.setCertificatePassword("iloveyou");
      bot.setCertificatePath("Certificate Path");
      bot.setPrivateKey(privateKey2);
      bot.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
      bot.setPrivateKeyPath("Private Key Path");
      bot.setUsername("janedoe");

      BdkCommonJwtConfig commonJwt = new BdkCommonJwtConfig();
      commonJwt.setEnabled(true);

      BdkDatahoseConfig datahose = new BdkDatahoseConfig();
      datahose.setEventTypes(new ArrayList<>());
      datahose.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      datahose.setTag("Tag");

      HashMap<String, String> defaultHeaders = new HashMap<>();
      defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

      BdkSslConfig ssl = new BdkSslConfig();
      ssl.setTrustStore(new BdkCertificateConfig());
      ssl.setTrustStorePassword("iloveyou");
      ssl.setTrustStorePath("Trust Store Path");

      BdkDatafeedConfig datafeed = new BdkDatafeedConfig();
      datafeed.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      datafeed.setVersion("1.0.2");
      datafeed.setIdFilePath("");

      BdkConfig config = new BdkConfig();
      config.setAgent(new BdkAgentConfig());
      config.setApp(app);
      config.setBot(bot);
      config.setCommonJwt(commonJwt);
      config.setConnectionPoolMax(1);
      config.setConnectionPoolPerRoute(1);
      config.setConnectionTimeout(10);
      config.setContext("Context");
      config.setDatahose(datahose);
      config.setDefaultHeaders(defaultHeaders);
      config.setHost("localhost");
      config.setKeyManager(new BdkClientConfig());
      config.setPod(new BdkClientConfig());
      config.setPort(8080);
      config.setProxy(new BdkProxyConfig());
      config.setReadTimeout(10);
      config.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      config.setScheme("Scheme");
      config.setSessionAuth(new BdkClientConfig());
      config.setSsl(ssl);
      config.setDatafeed(datafeed);

      // Act
      new OnDiskDatafeedIdRepository(config).write("42", "Agent Base Path");

      // Assert
      mockFiles.verify(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)));
      mockFiles.verify(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)));
    }
  }

  /**
   * Test {@link OnDiskDatafeedIdRepository#write(String, String)} with {@code datafeedId}, {@code
   * agentBasePath}.
   *
   * <ul>
   *   <li>Given {@link Files} {@link Files#isSymbolicLink(Path)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link OnDiskDatafeedIdRepository#write(String, String)}
   */
  @Test
  @DisplayName(
      "Test write(String, String) with 'datafeedId', 'agentBasePath'; given Files isSymbolicLink(Path) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void OnDiskDatafeedIdRepository.write(String, String)"})
  void testWriteWithDatafeedIdAgentBasePath_givenFilesIsSymbolicLinkReturnFalse()
      throws IOException {
    // Arrange
    try (MockedStatic<Files> mockFiles = mockStatic(Files.class)) {
      mockFiles
          .when(() -> Files.readSymbolicLink(Mockito.<Path>any()))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
      mockFiles
          .when(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)))
          .thenReturn(false);
      mockFiles.when(() -> Files.isSymbolicLink(Mockito.<Path>any())).thenReturn(false);
      mockFiles
          .when(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)))
          .thenReturn(new ByteArrayOutputStream());
      mockFiles
          .when(() -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

      BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
      privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
      privateKey.setPath("Path");

      BdkExtAppConfig app = new BdkExtAppConfig();
      app.setAppId("42");
      app.setCertificate(new BdkCertificateConfig());
      app.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
      app.setCertificatePassword("iloveyou");
      app.setCertificatePath("Certificate Path");
      app.setPrivateKey(privateKey);
      app.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
      app.setPrivateKeyPath("Private Key Path");

      BdkRsaKeyConfig privateKey2 = new BdkRsaKeyConfig();
      privateKey2.setContent("AXAXAXAX".getBytes("UTF-8"));
      privateKey2.setPath("Path");

      BdkBotConfig bot = new BdkBotConfig();
      bot.setCertificate(new BdkCertificateConfig());
      bot.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
      bot.setCertificatePassword("iloveyou");
      bot.setCertificatePath("Certificate Path");
      bot.setPrivateKey(privateKey2);
      bot.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
      bot.setPrivateKeyPath("Private Key Path");
      bot.setUsername("janedoe");

      BdkCommonJwtConfig commonJwt = new BdkCommonJwtConfig();
      commonJwt.setEnabled(true);

      BdkDatahoseConfig datahose = new BdkDatahoseConfig();
      datahose.setEventTypes(new ArrayList<>());
      datahose.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      datahose.setTag("Tag");

      HashMap<String, String> defaultHeaders = new HashMap<>();
      defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

      BdkSslConfig ssl = new BdkSslConfig();
      ssl.setTrustStore(new BdkCertificateConfig());
      ssl.setTrustStorePassword("iloveyou");
      ssl.setTrustStorePath("Trust Store Path");

      BdkDatafeedConfig datafeed = new BdkDatafeedConfig();
      datafeed.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      datafeed.setVersion("1.0.2");
      datafeed.setIdFilePath("");

      BdkConfig config = new BdkConfig();
      config.setAgent(new BdkAgentConfig());
      config.setApp(app);
      config.setBot(bot);
      config.setCommonJwt(commonJwt);
      config.setConnectionPoolMax(1);
      config.setConnectionPoolPerRoute(1);
      config.setConnectionTimeout(10);
      config.setContext("Context");
      config.setDatahose(datahose);
      config.setDefaultHeaders(defaultHeaders);
      config.setHost("localhost");
      config.setKeyManager(new BdkClientConfig());
      config.setPod(new BdkClientConfig());
      config.setPort(8080);
      config.setProxy(new BdkProxyConfig());
      config.setReadTimeout(10);
      config.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      config.setScheme("Scheme");
      config.setSessionAuth(new BdkClientConfig());
      config.setSsl(ssl);
      config.setDatafeed(datafeed);

      // Act
      new OnDiskDatafeedIdRepository(config).write("42", "Agent Base Path");

      // Assert
      mockFiles.verify(
          () -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)));
      mockFiles.verify(
          () -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)), atLeast(1));
      mockFiles.verify(() -> Files.isSymbolicLink(Mockito.<Path>any()));
      mockFiles.verify(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)));
    }
  }

  /**
   * Test {@link OnDiskDatafeedIdRepository#write(String, String)} with {@code datafeedId}, {@code
   * agentBasePath}.
   *
   * <ul>
   *   <li>Given {@link Files} {@link Files#newOutputStream(Path, OpenOption[])} throw {@link
   *       IOException#IOException()}.
   * </ul>
   *
   * <p>Method under test: {@link OnDiskDatafeedIdRepository#write(String, String)}
   */
  @Test
  @DisplayName(
      "Test write(String, String) with 'datafeedId', 'agentBasePath'; given Files newOutputStream(Path, OpenOption[]) throw IOException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void OnDiskDatafeedIdRepository.write(String, String)"})
  void testWriteWithDatafeedIdAgentBasePath_givenFilesNewOutputStreamThrowIOException()
      throws IOException {
    // Arrange
    try (MockedStatic<Files> mockFiles = mockStatic(Files.class)) {
      mockFiles
          .when(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)))
          .thenReturn(true);
      mockFiles.when(() -> Files.isSymbolicLink(Mockito.<Path>any())).thenReturn(true);
      mockFiles
          .when(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)))
          .thenThrow(new IOException());
      mockFiles
          .when(() -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)))
          .thenThrow(new IOException());

      BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
      privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
      privateKey.setPath("Path");

      BdkExtAppConfig app = new BdkExtAppConfig();
      app.setAppId("42");
      app.setCertificate(new BdkCertificateConfig());
      app.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
      app.setCertificatePassword("iloveyou");
      app.setCertificatePath("Certificate Path");
      app.setPrivateKey(privateKey);
      app.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
      app.setPrivateKeyPath("Private Key Path");

      BdkRsaKeyConfig privateKey2 = new BdkRsaKeyConfig();
      privateKey2.setContent("AXAXAXAX".getBytes("UTF-8"));
      privateKey2.setPath("Path");

      BdkBotConfig bot = new BdkBotConfig();
      bot.setCertificate(new BdkCertificateConfig());
      bot.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
      bot.setCertificatePassword("iloveyou");
      bot.setCertificatePath("Certificate Path");
      bot.setPrivateKey(privateKey2);
      bot.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
      bot.setPrivateKeyPath("Private Key Path");
      bot.setUsername("janedoe");

      BdkCommonJwtConfig commonJwt = new BdkCommonJwtConfig();
      commonJwt.setEnabled(true);

      BdkDatahoseConfig datahose = new BdkDatahoseConfig();
      datahose.setEventTypes(new ArrayList<>());
      datahose.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      datahose.setTag("Tag");

      HashMap<String, String> defaultHeaders = new HashMap<>();
      defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

      BdkSslConfig ssl = new BdkSslConfig();
      ssl.setTrustStore(new BdkCertificateConfig());
      ssl.setTrustStorePassword("iloveyou");
      ssl.setTrustStorePath("Trust Store Path");

      BdkDatafeedConfig datafeed = new BdkDatafeedConfig();
      datafeed.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      datafeed.setVersion("1.0.2");
      datafeed.setIdFilePath("");

      BdkConfig config = new BdkConfig();
      config.setAgent(new BdkAgentConfig());
      config.setApp(app);
      config.setBot(bot);
      config.setCommonJwt(commonJwt);
      config.setConnectionPoolMax(1);
      config.setConnectionPoolPerRoute(1);
      config.setConnectionTimeout(10);
      config.setContext("Context");
      config.setDatahose(datahose);
      config.setDefaultHeaders(defaultHeaders);
      config.setHost("localhost");
      config.setKeyManager(new BdkClientConfig());
      config.setPod(new BdkClientConfig());
      config.setPort(8080);
      config.setProxy(new BdkProxyConfig());
      config.setReadTimeout(10);
      config.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      config.setScheme("Scheme");
      config.setSessionAuth(new BdkClientConfig());
      config.setSsl(ssl);
      config.setDatafeed(datafeed);

      // Act
      new OnDiskDatafeedIdRepository(config).write("42", "Agent Base Path");

      // Assert
      mockFiles.verify(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)));
      mockFiles.verify(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)));
    }
  }

  /**
   * Test {@link OnDiskDatafeedIdRepository#write(String, String)} with {@code datafeedId}, {@code
   * agentBasePath}.
   *
   * <ul>
   *   <li>Given {@link Files} {@link Files#readSymbolicLink(Path)} throw {@link
   *       IOException#IOException()}.
   * </ul>
   *
   * <p>Method under test: {@link OnDiskDatafeedIdRepository#write(String, String)}
   */
  @Test
  @DisplayName(
      "Test write(String, String) with 'datafeedId', 'agentBasePath'; given Files readSymbolicLink(Path) throw IOException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void OnDiskDatafeedIdRepository.write(String, String)"})
  void testWriteWithDatafeedIdAgentBasePath_givenFilesReadSymbolicLinkThrowIOException()
      throws IOException {
    // Arrange
    try (MockedStatic<Files> mockFiles = mockStatic(Files.class)) {
      mockFiles
          .when(() -> Files.readSymbolicLink(Mockito.<Path>any()))
          .thenThrow(new IOException());
      mockFiles
          .when(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)))
          .thenReturn(false);
      mockFiles.when(() -> Files.isSymbolicLink(Mockito.<Path>any())).thenReturn(true);
      mockFiles
          .when(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)))
          .thenReturn(new ByteArrayOutputStream());
      mockFiles
          .when(() -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

      BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
      privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
      privateKey.setPath("Path");

      BdkExtAppConfig app = new BdkExtAppConfig();
      app.setAppId("42");
      app.setCertificate(new BdkCertificateConfig());
      app.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
      app.setCertificatePassword("iloveyou");
      app.setCertificatePath("Certificate Path");
      app.setPrivateKey(privateKey);
      app.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
      app.setPrivateKeyPath("Private Key Path");

      BdkRsaKeyConfig privateKey2 = new BdkRsaKeyConfig();
      privateKey2.setContent("AXAXAXAX".getBytes("UTF-8"));
      privateKey2.setPath("Path");

      BdkBotConfig bot = new BdkBotConfig();
      bot.setCertificate(new BdkCertificateConfig());
      bot.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
      bot.setCertificatePassword("iloveyou");
      bot.setCertificatePath("Certificate Path");
      bot.setPrivateKey(privateKey2);
      bot.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
      bot.setPrivateKeyPath("Private Key Path");
      bot.setUsername("janedoe");

      BdkCommonJwtConfig commonJwt = new BdkCommonJwtConfig();
      commonJwt.setEnabled(true);

      BdkDatahoseConfig datahose = new BdkDatahoseConfig();
      datahose.setEventTypes(new ArrayList<>());
      datahose.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      datahose.setTag("Tag");

      HashMap<String, String> defaultHeaders = new HashMap<>();
      defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

      BdkSslConfig ssl = new BdkSslConfig();
      ssl.setTrustStore(new BdkCertificateConfig());
      ssl.setTrustStorePassword("iloveyou");
      ssl.setTrustStorePath("Trust Store Path");

      BdkDatafeedConfig datafeed = new BdkDatafeedConfig();
      datafeed.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      datafeed.setVersion("1.0.2");
      datafeed.setIdFilePath("");

      BdkConfig config = new BdkConfig();
      config.setAgent(new BdkAgentConfig());
      config.setApp(app);
      config.setBot(bot);
      config.setCommonJwt(commonJwt);
      config.setConnectionPoolMax(1);
      config.setConnectionPoolPerRoute(1);
      config.setConnectionTimeout(10);
      config.setContext("Context");
      config.setDatahose(datahose);
      config.setDefaultHeaders(defaultHeaders);
      config.setHost("localhost");
      config.setKeyManager(new BdkClientConfig());
      config.setPod(new BdkClientConfig());
      config.setPort(8080);
      config.setProxy(new BdkProxyConfig());
      config.setReadTimeout(10);
      config.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      config.setScheme("Scheme");
      config.setSessionAuth(new BdkClientConfig());
      config.setSsl(ssl);
      config.setDatafeed(datafeed);

      // Act
      new OnDiskDatafeedIdRepository(config).write("42", "Agent Base Path");

      // Assert
      mockFiles.verify(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)));
      mockFiles.verify(() -> Files.isSymbolicLink(Mockito.<Path>any()));
      mockFiles.verify(() -> Files.readSymbolicLink(Mockito.<Path>any()));
    }
  }

  /**
   * Test {@link OnDiskDatafeedIdRepository#write(String, String)} with {@code datafeedId}, {@code
   * agentBasePath}.
   *
   * <ul>
   *   <li>Then calls {@link Files#createDirectories(Path, FileAttribute[])}.
   * </ul>
   *
   * <p>Method under test: {@link OnDiskDatafeedIdRepository#write(String, String)}
   */
  @Test
  @DisplayName(
      "Test write(String, String) with 'datafeedId', 'agentBasePath'; then calls createDirectories(Path, FileAttribute[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void OnDiskDatafeedIdRepository.write(String, String)"})
  void testWriteWithDatafeedIdAgentBasePath_thenCallsCreateDirectories() throws IOException {
    // Arrange
    try (MockedStatic<Files> mockFiles = mockStatic(Files.class)) {
      mockFiles
          .when(() -> Files.readSymbolicLink(Mockito.<Path>any()))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
      mockFiles
          .when(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)))
          .thenReturn(false);
      mockFiles.when(() -> Files.isSymbolicLink(Mockito.<Path>any())).thenReturn(true);
      mockFiles
          .when(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)))
          .thenReturn(new ByteArrayOutputStream());
      mockFiles
          .when(() -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

      BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
      privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
      privateKey.setPath("Path");

      BdkExtAppConfig app = new BdkExtAppConfig();
      app.setAppId("42");
      app.setCertificate(new BdkCertificateConfig());
      app.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
      app.setCertificatePassword("iloveyou");
      app.setCertificatePath("Certificate Path");
      app.setPrivateKey(privateKey);
      app.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
      app.setPrivateKeyPath("Private Key Path");

      BdkRsaKeyConfig privateKey2 = new BdkRsaKeyConfig();
      privateKey2.setContent("AXAXAXAX".getBytes("UTF-8"));
      privateKey2.setPath("Path");

      BdkBotConfig bot = new BdkBotConfig();
      bot.setCertificate(new BdkCertificateConfig());
      bot.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
      bot.setCertificatePassword("iloveyou");
      bot.setCertificatePath("Certificate Path");
      bot.setPrivateKey(privateKey2);
      bot.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
      bot.setPrivateKeyPath("Private Key Path");
      bot.setUsername("janedoe");

      BdkCommonJwtConfig commonJwt = new BdkCommonJwtConfig();
      commonJwt.setEnabled(true);

      BdkDatahoseConfig datahose = new BdkDatahoseConfig();
      datahose.setEventTypes(new ArrayList<>());
      datahose.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      datahose.setTag("Tag");

      HashMap<String, String> defaultHeaders = new HashMap<>();
      defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

      BdkSslConfig ssl = new BdkSslConfig();
      ssl.setTrustStore(new BdkCertificateConfig());
      ssl.setTrustStorePassword("iloveyou");
      ssl.setTrustStorePath("Trust Store Path");

      BdkDatafeedConfig datafeed = new BdkDatafeedConfig();
      datafeed.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      datafeed.setVersion("1.0.2");
      datafeed.setIdFilePath("");

      BdkConfig config = new BdkConfig();
      config.setAgent(new BdkAgentConfig());
      config.setApp(app);
      config.setBot(bot);
      config.setCommonJwt(commonJwt);
      config.setConnectionPoolMax(1);
      config.setConnectionPoolPerRoute(1);
      config.setConnectionTimeout(10);
      config.setContext("Context");
      config.setDatahose(datahose);
      config.setDefaultHeaders(defaultHeaders);
      config.setHost("localhost");
      config.setKeyManager(new BdkClientConfig());
      config.setPod(new BdkClientConfig());
      config.setPort(8080);
      config.setProxy(new BdkProxyConfig());
      config.setReadTimeout(10);
      config.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      config.setScheme("Scheme");
      config.setSessionAuth(new BdkClientConfig());
      config.setSsl(ssl);
      config.setDatafeed(datafeed);

      // Act
      new OnDiskDatafeedIdRepository(config).write("42", "Agent Base Path");

      // Assert
      mockFiles.verify(
          () -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)));
      mockFiles.verify(
          () -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)), atLeast(1));
      mockFiles.verify(() -> Files.isSymbolicLink(Mockito.<Path>any()));
      mockFiles.verify(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)));
      mockFiles.verify(() -> Files.readSymbolicLink(Mockito.<Path>any()));
    }
  }

  /**
   * Test {@link OnDiskDatafeedIdRepository#write(String)} with {@code datafeedId}.
   *
   * <ul>
   *   <li>Given {@link BdkDatafeedConfig} (default constructor) IdFilePath is {@code Context}.
   * </ul>
   *
   * <p>Method under test: {@link OnDiskDatafeedIdRepository#write(String)}
   */
  @Test
  @DisplayName(
      "Test write(String) with 'datafeedId'; given BdkDatafeedConfig (default constructor) IdFilePath is 'Context'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void OnDiskDatafeedIdRepository.write(String)"})
  void testWriteWithDatafeedId_givenBdkDatafeedConfigIdFilePathIsContext() throws IOException {
    // Arrange
    try (MockedStatic<Files> mockFiles = mockStatic(Files.class)) {
      mockFiles
          .when(() -> Files.readSymbolicLink(Mockito.<Path>any()))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
      mockFiles
          .when(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)))
          .thenReturn(false);
      mockFiles.when(() -> Files.isSymbolicLink(Mockito.<Path>any())).thenReturn(true);
      mockFiles
          .when(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)))
          .thenReturn(new ByteArrayOutputStream());
      mockFiles
          .when(() -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

      BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
      privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
      privateKey.setPath("Path");

      BdkExtAppConfig app = new BdkExtAppConfig();
      app.setAppId("42");
      app.setCertificate(new BdkCertificateConfig());
      app.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
      app.setCertificatePassword("iloveyou");
      app.setCertificatePath("Certificate Path");
      app.setPrivateKey(privateKey);
      app.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
      app.setPrivateKeyPath("Private Key Path");

      BdkRsaKeyConfig privateKey2 = new BdkRsaKeyConfig();
      privateKey2.setContent("AXAXAXAX".getBytes("UTF-8"));
      privateKey2.setPath("Path");

      BdkBotConfig bot = new BdkBotConfig();
      bot.setCertificate(new BdkCertificateConfig());
      bot.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
      bot.setCertificatePassword("iloveyou");
      bot.setCertificatePath("Certificate Path");
      bot.setPrivateKey(privateKey2);
      bot.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
      bot.setPrivateKeyPath("Private Key Path");
      bot.setUsername("janedoe");

      BdkCommonJwtConfig commonJwt = new BdkCommonJwtConfig();
      commonJwt.setEnabled(true);

      BdkDatahoseConfig datahose = new BdkDatahoseConfig();
      datahose.setEventTypes(new ArrayList<>());
      datahose.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      datahose.setTag("Tag");

      HashMap<String, String> defaultHeaders = new HashMap<>();
      defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

      BdkSslConfig ssl = new BdkSslConfig();
      ssl.setTrustStore(new BdkCertificateConfig());
      ssl.setTrustStorePassword("iloveyou");
      ssl.setTrustStorePath("Trust Store Path");

      BdkDatafeedConfig datafeed = new BdkDatafeedConfig();
      datafeed.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      datafeed.setVersion("1.0.2");
      datafeed.setIdFilePath("Context");

      BdkConfig config = new BdkConfig();
      config.setAgent(new BdkAgentConfig());
      config.setApp(app);
      config.setBot(bot);
      config.setCommonJwt(commonJwt);
      config.setConnectionPoolMax(1);
      config.setConnectionPoolPerRoute(1);
      config.setConnectionTimeout(10);
      config.setContext("Context");
      config.setDatahose(datahose);
      config.setDefaultHeaders(defaultHeaders);
      config.setHost("localhost");
      config.setKeyManager(new BdkClientConfig());
      config.setPod(new BdkClientConfig());
      config.setPort(8080);
      config.setProxy(new BdkProxyConfig());
      config.setReadTimeout(10);
      config.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      config.setScheme("Scheme");
      config.setSessionAuth(new BdkClientConfig());
      config.setSsl(ssl);
      config.setDatafeed(datafeed);

      // Act
      new OnDiskDatafeedIdRepository(config).write("42");

      // Assert
      mockFiles.verify(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)));
      mockFiles.verify(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)));
    }
  }

  /**
   * Test {@link OnDiskDatafeedIdRepository#write(String)} with {@code datafeedId}.
   *
   * <ul>
   *   <li>Given {@link BdkDatafeedConfig} (default constructor) IdFilePath is {@code
   *       /directory/foo.txt}.
   * </ul>
   *
   * <p>Method under test: {@link OnDiskDatafeedIdRepository#write(String)}
   */
  @Test
  @DisplayName(
      "Test write(String) with 'datafeedId'; given BdkDatafeedConfig (default constructor) IdFilePath is '/directory/foo.txt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void OnDiskDatafeedIdRepository.write(String)"})
  void testWriteWithDatafeedId_givenBdkDatafeedConfigIdFilePathIsDirectoryFooTxt()
      throws IOException {
    // Arrange
    try (MockedStatic<Files> mockFiles = mockStatic(Files.class)) {
      mockFiles
          .when(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)))
          .thenReturn(true);
      mockFiles.when(() -> Files.isSymbolicLink(Mockito.<Path>any())).thenReturn(true);
      mockFiles
          .when(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)))
          .thenReturn(new ByteArrayOutputStream());
      mockFiles
          .when(() -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

      BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
      privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
      privateKey.setPath("Path");

      BdkExtAppConfig app = new BdkExtAppConfig();
      app.setAppId("42");
      app.setCertificate(new BdkCertificateConfig());
      app.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
      app.setCertificatePassword("iloveyou");
      app.setCertificatePath("Certificate Path");
      app.setPrivateKey(privateKey);
      app.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
      app.setPrivateKeyPath("Private Key Path");

      BdkRsaKeyConfig privateKey2 = new BdkRsaKeyConfig();
      privateKey2.setContent("AXAXAXAX".getBytes("UTF-8"));
      privateKey2.setPath("Path");

      BdkBotConfig bot = new BdkBotConfig();
      bot.setCertificate(new BdkCertificateConfig());
      bot.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
      bot.setCertificatePassword("iloveyou");
      bot.setCertificatePath("Certificate Path");
      bot.setPrivateKey(privateKey2);
      bot.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
      bot.setPrivateKeyPath("Private Key Path");
      bot.setUsername("janedoe");

      BdkCommonJwtConfig commonJwt = new BdkCommonJwtConfig();
      commonJwt.setEnabled(true);

      BdkDatahoseConfig datahose = new BdkDatahoseConfig();
      datahose.setEventTypes(new ArrayList<>());
      datahose.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      datahose.setTag("Tag");

      HashMap<String, String> defaultHeaders = new HashMap<>();
      defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

      BdkSslConfig ssl = new BdkSslConfig();
      ssl.setTrustStore(new BdkCertificateConfig());
      ssl.setTrustStorePassword("iloveyou");
      ssl.setTrustStorePath("Trust Store Path");

      BdkDatafeedConfig datafeed = new BdkDatafeedConfig();
      datafeed.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      datafeed.setVersion("1.0.2");
      datafeed.setIdFilePath("/directory/foo.txt");

      BdkConfig config = new BdkConfig();
      config.setAgent(new BdkAgentConfig());
      config.setApp(app);
      config.setBot(bot);
      config.setCommonJwt(commonJwt);
      config.setConnectionPoolMax(1);
      config.setConnectionPoolPerRoute(1);
      config.setConnectionTimeout(10);
      config.setContext("Context");
      config.setDatahose(datahose);
      config.setDefaultHeaders(defaultHeaders);
      config.setHost("localhost");
      config.setKeyManager(new BdkClientConfig());
      config.setPod(new BdkClientConfig());
      config.setPort(8080);
      config.setProxy(new BdkProxyConfig());
      config.setReadTimeout(10);
      config.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      config.setScheme("Scheme");
      config.setSessionAuth(new BdkClientConfig());
      config.setSsl(ssl);
      config.setDatafeed(datafeed);

      // Act
      new OnDiskDatafeedIdRepository(config).write("42");

      // Assert
      mockFiles.verify(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)));
      mockFiles.verify(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)));
    }
  }

  /**
   * Test {@link OnDiskDatafeedIdRepository#write(String)} with {@code datafeedId}.
   *
   * <ul>
   *   <li>Given {@link Files} {@link Files#exists(Path, LinkOption[])} return {@code true}.
   *   <li>Then calls {@link Files#newOutputStream(Path, OpenOption[])}.
   * </ul>
   *
   * <p>Method under test: {@link OnDiskDatafeedIdRepository#write(String)}
   */
  @Test
  @DisplayName(
      "Test write(String) with 'datafeedId'; given Files exists(Path, LinkOption[]) return 'true'; then calls newOutputStream(Path, OpenOption[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void OnDiskDatafeedIdRepository.write(String)"})
  void testWriteWithDatafeedId_givenFilesExistsReturnTrue_thenCallsNewOutputStream()
      throws IOException {
    // Arrange
    try (MockedStatic<Files> mockFiles = mockStatic(Files.class)) {
      mockFiles
          .when(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)))
          .thenReturn(true);
      mockFiles.when(() -> Files.isSymbolicLink(Mockito.<Path>any())).thenReturn(true);
      mockFiles
          .when(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)))
          .thenReturn(new ByteArrayOutputStream());
      mockFiles
          .when(() -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

      BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
      privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
      privateKey.setPath("Path");

      BdkExtAppConfig app = new BdkExtAppConfig();
      app.setAppId("42");
      app.setCertificate(new BdkCertificateConfig());
      app.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
      app.setCertificatePassword("iloveyou");
      app.setCertificatePath("Certificate Path");
      app.setPrivateKey(privateKey);
      app.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
      app.setPrivateKeyPath("Private Key Path");

      BdkRsaKeyConfig privateKey2 = new BdkRsaKeyConfig();
      privateKey2.setContent("AXAXAXAX".getBytes("UTF-8"));
      privateKey2.setPath("Path");

      BdkBotConfig bot = new BdkBotConfig();
      bot.setCertificate(new BdkCertificateConfig());
      bot.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
      bot.setCertificatePassword("iloveyou");
      bot.setCertificatePath("Certificate Path");
      bot.setPrivateKey(privateKey2);
      bot.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
      bot.setPrivateKeyPath("Private Key Path");
      bot.setUsername("janedoe");

      BdkCommonJwtConfig commonJwt = new BdkCommonJwtConfig();
      commonJwt.setEnabled(true);

      BdkDatahoseConfig datahose = new BdkDatahoseConfig();
      datahose.setEventTypes(new ArrayList<>());
      datahose.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      datahose.setTag("Tag");

      HashMap<String, String> defaultHeaders = new HashMap<>();
      defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

      BdkSslConfig ssl = new BdkSslConfig();
      ssl.setTrustStore(new BdkCertificateConfig());
      ssl.setTrustStorePassword("iloveyou");
      ssl.setTrustStorePath("Trust Store Path");

      BdkDatafeedConfig datafeed = new BdkDatafeedConfig();
      datafeed.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      datafeed.setVersion("1.0.2");
      datafeed.setIdFilePath("");

      BdkConfig config = new BdkConfig();
      config.setAgent(new BdkAgentConfig());
      config.setApp(app);
      config.setBot(bot);
      config.setCommonJwt(commonJwt);
      config.setConnectionPoolMax(1);
      config.setConnectionPoolPerRoute(1);
      config.setConnectionTimeout(10);
      config.setContext("Context");
      config.setDatahose(datahose);
      config.setDefaultHeaders(defaultHeaders);
      config.setHost("localhost");
      config.setKeyManager(new BdkClientConfig());
      config.setPod(new BdkClientConfig());
      config.setPort(8080);
      config.setProxy(new BdkProxyConfig());
      config.setReadTimeout(10);
      config.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      config.setScheme("Scheme");
      config.setSessionAuth(new BdkClientConfig());
      config.setSsl(ssl);
      config.setDatafeed(datafeed);

      // Act
      new OnDiskDatafeedIdRepository(config).write("42");

      // Assert
      mockFiles.verify(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)));
      mockFiles.verify(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)));
    }
  }

  /**
   * Test {@link OnDiskDatafeedIdRepository#write(String)} with {@code datafeedId}.
   *
   * <ul>
   *   <li>Given {@link Files} {@link Files#isSymbolicLink(Path)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link OnDiskDatafeedIdRepository#write(String)}
   */
  @Test
  @DisplayName(
      "Test write(String) with 'datafeedId'; given Files isSymbolicLink(Path) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void OnDiskDatafeedIdRepository.write(String)"})
  void testWriteWithDatafeedId_givenFilesIsSymbolicLinkReturnFalse() throws IOException {
    // Arrange
    try (MockedStatic<Files> mockFiles = mockStatic(Files.class)) {
      mockFiles
          .when(() -> Files.readSymbolicLink(Mockito.<Path>any()))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
      mockFiles
          .when(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)))
          .thenReturn(false);
      mockFiles.when(() -> Files.isSymbolicLink(Mockito.<Path>any())).thenReturn(false);
      mockFiles
          .when(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)))
          .thenReturn(new ByteArrayOutputStream());
      mockFiles
          .when(() -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

      BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
      privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
      privateKey.setPath("Path");

      BdkExtAppConfig app = new BdkExtAppConfig();
      app.setAppId("42");
      app.setCertificate(new BdkCertificateConfig());
      app.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
      app.setCertificatePassword("iloveyou");
      app.setCertificatePath("Certificate Path");
      app.setPrivateKey(privateKey);
      app.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
      app.setPrivateKeyPath("Private Key Path");

      BdkRsaKeyConfig privateKey2 = new BdkRsaKeyConfig();
      privateKey2.setContent("AXAXAXAX".getBytes("UTF-8"));
      privateKey2.setPath("Path");

      BdkBotConfig bot = new BdkBotConfig();
      bot.setCertificate(new BdkCertificateConfig());
      bot.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
      bot.setCertificatePassword("iloveyou");
      bot.setCertificatePath("Certificate Path");
      bot.setPrivateKey(privateKey2);
      bot.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
      bot.setPrivateKeyPath("Private Key Path");
      bot.setUsername("janedoe");

      BdkCommonJwtConfig commonJwt = new BdkCommonJwtConfig();
      commonJwt.setEnabled(true);

      BdkDatahoseConfig datahose = new BdkDatahoseConfig();
      datahose.setEventTypes(new ArrayList<>());
      datahose.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      datahose.setTag("Tag");

      HashMap<String, String> defaultHeaders = new HashMap<>();
      defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

      BdkSslConfig ssl = new BdkSslConfig();
      ssl.setTrustStore(new BdkCertificateConfig());
      ssl.setTrustStorePassword("iloveyou");
      ssl.setTrustStorePath("Trust Store Path");

      BdkDatafeedConfig datafeed = new BdkDatafeedConfig();
      datafeed.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      datafeed.setVersion("1.0.2");
      datafeed.setIdFilePath("");

      BdkConfig config = new BdkConfig();
      config.setAgent(new BdkAgentConfig());
      config.setApp(app);
      config.setBot(bot);
      config.setCommonJwt(commonJwt);
      config.setConnectionPoolMax(1);
      config.setConnectionPoolPerRoute(1);
      config.setConnectionTimeout(10);
      config.setContext("Context");
      config.setDatahose(datahose);
      config.setDefaultHeaders(defaultHeaders);
      config.setHost("localhost");
      config.setKeyManager(new BdkClientConfig());
      config.setPod(new BdkClientConfig());
      config.setPort(8080);
      config.setProxy(new BdkProxyConfig());
      config.setReadTimeout(10);
      config.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      config.setScheme("Scheme");
      config.setSessionAuth(new BdkClientConfig());
      config.setSsl(ssl);
      config.setDatafeed(datafeed);

      // Act
      new OnDiskDatafeedIdRepository(config).write("42");

      // Assert
      mockFiles.verify(
          () -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)));
      mockFiles.verify(
          () -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)), atLeast(1));
      mockFiles.verify(() -> Files.isSymbolicLink(Mockito.<Path>any()));
      mockFiles.verify(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)));
    }
  }

  /**
   * Test {@link OnDiskDatafeedIdRepository#write(String)} with {@code datafeedId}.
   *
   * <ul>
   *   <li>Given {@link Files} {@link Files#newOutputStream(Path, OpenOption[])} throw {@link
   *       IOException#IOException()}.
   * </ul>
   *
   * <p>Method under test: {@link OnDiskDatafeedIdRepository#write(String)}
   */
  @Test
  @DisplayName(
      "Test write(String) with 'datafeedId'; given Files newOutputStream(Path, OpenOption[]) throw IOException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void OnDiskDatafeedIdRepository.write(String)"})
  void testWriteWithDatafeedId_givenFilesNewOutputStreamThrowIOException() throws IOException {
    // Arrange
    try (MockedStatic<Files> mockFiles = mockStatic(Files.class)) {
      mockFiles
          .when(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)))
          .thenReturn(true);
      mockFiles.when(() -> Files.isSymbolicLink(Mockito.<Path>any())).thenReturn(true);
      mockFiles
          .when(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)))
          .thenThrow(new IOException());
      mockFiles
          .when(() -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)))
          .thenThrow(new IOException());

      BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
      privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
      privateKey.setPath("Path");

      BdkExtAppConfig app = new BdkExtAppConfig();
      app.setAppId("42");
      app.setCertificate(new BdkCertificateConfig());
      app.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
      app.setCertificatePassword("iloveyou");
      app.setCertificatePath("Certificate Path");
      app.setPrivateKey(privateKey);
      app.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
      app.setPrivateKeyPath("Private Key Path");

      BdkRsaKeyConfig privateKey2 = new BdkRsaKeyConfig();
      privateKey2.setContent("AXAXAXAX".getBytes("UTF-8"));
      privateKey2.setPath("Path");

      BdkBotConfig bot = new BdkBotConfig();
      bot.setCertificate(new BdkCertificateConfig());
      bot.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
      bot.setCertificatePassword("iloveyou");
      bot.setCertificatePath("Certificate Path");
      bot.setPrivateKey(privateKey2);
      bot.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
      bot.setPrivateKeyPath("Private Key Path");
      bot.setUsername("janedoe");

      BdkCommonJwtConfig commonJwt = new BdkCommonJwtConfig();
      commonJwt.setEnabled(true);

      BdkDatahoseConfig datahose = new BdkDatahoseConfig();
      datahose.setEventTypes(new ArrayList<>());
      datahose.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      datahose.setTag("Tag");

      HashMap<String, String> defaultHeaders = new HashMap<>();
      defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

      BdkSslConfig ssl = new BdkSslConfig();
      ssl.setTrustStore(new BdkCertificateConfig());
      ssl.setTrustStorePassword("iloveyou");
      ssl.setTrustStorePath("Trust Store Path");

      BdkDatafeedConfig datafeed = new BdkDatafeedConfig();
      datafeed.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      datafeed.setVersion("1.0.2");
      datafeed.setIdFilePath("");

      BdkConfig config = new BdkConfig();
      config.setAgent(new BdkAgentConfig());
      config.setApp(app);
      config.setBot(bot);
      config.setCommonJwt(commonJwt);
      config.setConnectionPoolMax(1);
      config.setConnectionPoolPerRoute(1);
      config.setConnectionTimeout(10);
      config.setContext("Context");
      config.setDatahose(datahose);
      config.setDefaultHeaders(defaultHeaders);
      config.setHost("localhost");
      config.setKeyManager(new BdkClientConfig());
      config.setPod(new BdkClientConfig());
      config.setPort(8080);
      config.setProxy(new BdkProxyConfig());
      config.setReadTimeout(10);
      config.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      config.setScheme("Scheme");
      config.setSessionAuth(new BdkClientConfig());
      config.setSsl(ssl);
      config.setDatafeed(datafeed);

      // Act
      new OnDiskDatafeedIdRepository(config).write("42");

      // Assert
      mockFiles.verify(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)));
      mockFiles.verify(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)));
    }
  }

  /**
   * Test {@link OnDiskDatafeedIdRepository#write(String)} with {@code datafeedId}.
   *
   * <ul>
   *   <li>Given {@link Files} {@link Files#readSymbolicLink(Path)} throw {@link
   *       IOException#IOException()}.
   * </ul>
   *
   * <p>Method under test: {@link OnDiskDatafeedIdRepository#write(String)}
   */
  @Test
  @DisplayName(
      "Test write(String) with 'datafeedId'; given Files readSymbolicLink(Path) throw IOException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void OnDiskDatafeedIdRepository.write(String)"})
  void testWriteWithDatafeedId_givenFilesReadSymbolicLinkThrowIOException() throws IOException {
    // Arrange
    try (MockedStatic<Files> mockFiles = mockStatic(Files.class)) {
      mockFiles
          .when(() -> Files.readSymbolicLink(Mockito.<Path>any()))
          .thenThrow(new IOException());
      mockFiles
          .when(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)))
          .thenReturn(false);
      mockFiles.when(() -> Files.isSymbolicLink(Mockito.<Path>any())).thenReturn(true);
      mockFiles
          .when(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)))
          .thenReturn(new ByteArrayOutputStream());
      mockFiles
          .when(() -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

      BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
      privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
      privateKey.setPath("Path");

      BdkExtAppConfig app = new BdkExtAppConfig();
      app.setAppId("42");
      app.setCertificate(new BdkCertificateConfig());
      app.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
      app.setCertificatePassword("iloveyou");
      app.setCertificatePath("Certificate Path");
      app.setPrivateKey(privateKey);
      app.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
      app.setPrivateKeyPath("Private Key Path");

      BdkRsaKeyConfig privateKey2 = new BdkRsaKeyConfig();
      privateKey2.setContent("AXAXAXAX".getBytes("UTF-8"));
      privateKey2.setPath("Path");

      BdkBotConfig bot = new BdkBotConfig();
      bot.setCertificate(new BdkCertificateConfig());
      bot.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
      bot.setCertificatePassword("iloveyou");
      bot.setCertificatePath("Certificate Path");
      bot.setPrivateKey(privateKey2);
      bot.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
      bot.setPrivateKeyPath("Private Key Path");
      bot.setUsername("janedoe");

      BdkCommonJwtConfig commonJwt = new BdkCommonJwtConfig();
      commonJwt.setEnabled(true);

      BdkDatahoseConfig datahose = new BdkDatahoseConfig();
      datahose.setEventTypes(new ArrayList<>());
      datahose.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      datahose.setTag("Tag");

      HashMap<String, String> defaultHeaders = new HashMap<>();
      defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

      BdkSslConfig ssl = new BdkSslConfig();
      ssl.setTrustStore(new BdkCertificateConfig());
      ssl.setTrustStorePassword("iloveyou");
      ssl.setTrustStorePath("Trust Store Path");

      BdkDatafeedConfig datafeed = new BdkDatafeedConfig();
      datafeed.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      datafeed.setVersion("1.0.2");
      datafeed.setIdFilePath("");

      BdkConfig config = new BdkConfig();
      config.setAgent(new BdkAgentConfig());
      config.setApp(app);
      config.setBot(bot);
      config.setCommonJwt(commonJwt);
      config.setConnectionPoolMax(1);
      config.setConnectionPoolPerRoute(1);
      config.setConnectionTimeout(10);
      config.setContext("Context");
      config.setDatahose(datahose);
      config.setDefaultHeaders(defaultHeaders);
      config.setHost("localhost");
      config.setKeyManager(new BdkClientConfig());
      config.setPod(new BdkClientConfig());
      config.setPort(8080);
      config.setProxy(new BdkProxyConfig());
      config.setReadTimeout(10);
      config.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      config.setScheme("Scheme");
      config.setSessionAuth(new BdkClientConfig());
      config.setSsl(ssl);
      config.setDatafeed(datafeed);

      // Act
      new OnDiskDatafeedIdRepository(config).write("42");

      // Assert
      mockFiles.verify(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)));
      mockFiles.verify(() -> Files.isSymbolicLink(Mockito.<Path>any()));
      mockFiles.verify(() -> Files.readSymbolicLink(Mockito.<Path>any()));
    }
  }

  /**
   * Test {@link OnDiskDatafeedIdRepository#write(String)} with {@code datafeedId}.
   *
   * <ul>
   *   <li>Then calls {@link Files#createDirectories(Path, FileAttribute[])}.
   * </ul>
   *
   * <p>Method under test: {@link OnDiskDatafeedIdRepository#write(String)}
   */
  @Test
  @DisplayName(
      "Test write(String) with 'datafeedId'; then calls createDirectories(Path, FileAttribute[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void OnDiskDatafeedIdRepository.write(String)"})
  void testWriteWithDatafeedId_thenCallsCreateDirectories() throws IOException {
    // Arrange
    try (MockedStatic<Files> mockFiles = mockStatic(Files.class)) {
      mockFiles
          .when(() -> Files.readSymbolicLink(Mockito.<Path>any()))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
      mockFiles
          .when(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)))
          .thenReturn(false);
      mockFiles.when(() -> Files.isSymbolicLink(Mockito.<Path>any())).thenReturn(true);
      mockFiles
          .when(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)))
          .thenReturn(new ByteArrayOutputStream());
      mockFiles
          .when(() -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

      BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
      privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
      privateKey.setPath("Path");

      BdkExtAppConfig app = new BdkExtAppConfig();
      app.setAppId("42");
      app.setCertificate(new BdkCertificateConfig());
      app.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
      app.setCertificatePassword("iloveyou");
      app.setCertificatePath("Certificate Path");
      app.setPrivateKey(privateKey);
      app.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
      app.setPrivateKeyPath("Private Key Path");

      BdkRsaKeyConfig privateKey2 = new BdkRsaKeyConfig();
      privateKey2.setContent("AXAXAXAX".getBytes("UTF-8"));
      privateKey2.setPath("Path");

      BdkBotConfig bot = new BdkBotConfig();
      bot.setCertificate(new BdkCertificateConfig());
      bot.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
      bot.setCertificatePassword("iloveyou");
      bot.setCertificatePath("Certificate Path");
      bot.setPrivateKey(privateKey2);
      bot.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
      bot.setPrivateKeyPath("Private Key Path");
      bot.setUsername("janedoe");

      BdkCommonJwtConfig commonJwt = new BdkCommonJwtConfig();
      commonJwt.setEnabled(true);

      BdkDatahoseConfig datahose = new BdkDatahoseConfig();
      datahose.setEventTypes(new ArrayList<>());
      datahose.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      datahose.setTag("Tag");

      HashMap<String, String> defaultHeaders = new HashMap<>();
      defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

      BdkSslConfig ssl = new BdkSslConfig();
      ssl.setTrustStore(new BdkCertificateConfig());
      ssl.setTrustStorePassword("iloveyou");
      ssl.setTrustStorePath("Trust Store Path");

      BdkDatafeedConfig datafeed = new BdkDatafeedConfig();
      datafeed.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      datafeed.setVersion("1.0.2");
      datafeed.setIdFilePath("");

      BdkConfig config = new BdkConfig();
      config.setAgent(new BdkAgentConfig());
      config.setApp(app);
      config.setBot(bot);
      config.setCommonJwt(commonJwt);
      config.setConnectionPoolMax(1);
      config.setConnectionPoolPerRoute(1);
      config.setConnectionTimeout(10);
      config.setContext("Context");
      config.setDatahose(datahose);
      config.setDefaultHeaders(defaultHeaders);
      config.setHost("localhost");
      config.setKeyManager(new BdkClientConfig());
      config.setPod(new BdkClientConfig());
      config.setPort(8080);
      config.setProxy(new BdkProxyConfig());
      config.setReadTimeout(10);
      config.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
      config.setScheme("Scheme");
      config.setSessionAuth(new BdkClientConfig());
      config.setSsl(ssl);
      config.setDatafeed(datafeed);

      // Act
      new OnDiskDatafeedIdRepository(config).write("42");

      // Assert
      mockFiles.verify(
          () -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)));
      mockFiles.verify(
          () -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)), atLeast(1));
      mockFiles.verify(() -> Files.isSymbolicLink(Mockito.<Path>any()));
      mockFiles.verify(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)));
      mockFiles.verify(() -> Files.readSymbolicLink(Mockito.<Path>any()));
    }
  }

  /**
   * Test {@link OnDiskDatafeedIdRepository#read()}.
   *
   * <ul>
   *   <li>Given {@link BdkDatafeedConfig} (default constructor) IdFilePath is {@code
   *       /directory/foo.txt}.
   *   <li>Then calls {@link BdkConfig#getDatafeed()}.
   * </ul>
   *
   * <p>Method under test: {@link OnDiskDatafeedIdRepository#read()}
   */
  @Test
  @DisplayName(
      "Test read(); given BdkDatafeedConfig (default constructor) IdFilePath is '/directory/foo.txt'; then calls getDatafeed()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional OnDiskDatafeedIdRepository.read()"})
  void testRead_givenBdkDatafeedConfigIdFilePathIsDirectoryFooTxt_thenCallsGetDatafeed() {
    // Arrange
    BdkDatafeedConfig bdkDatafeedConfig = new BdkDatafeedConfig();
    bdkDatafeedConfig.setIdFilePath("/directory/foo.txt");
    bdkDatafeedConfig.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    bdkDatafeedConfig.setVersion("1.0.2");

    BdkConfig config = mock(BdkConfig.class);
    when(config.getDatafeed()).thenReturn(bdkDatafeedConfig);

    // Act
    Optional<String> actualReadResult = new OnDiskDatafeedIdRepository(config).read();

    // Assert
    verify(config, atLeast(1)).getDatafeed();
    assertFalse(actualReadResult.isPresent());
  }

  /**
   * Test {@link OnDiskDatafeedIdRepository#read()}.
   *
   * <ul>
   *   <li>Given {@link BdkRsaKeyConfig} (default constructor) Content is {@code AXAXAXAX} Bytes is
   *       {@code UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link OnDiskDatafeedIdRepository#read()}
   */
  @Test
  @DisplayName(
      "Test read(); given BdkRsaKeyConfig (default constructor) Content is 'AXAXAXAX' Bytes is 'UTF-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional OnDiskDatafeedIdRepository.read()"})
  void testRead_givenBdkRsaKeyConfigContentIsAxaxaxaxBytesIsUtf8()
      throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkExtAppConfig app = new BdkExtAppConfig();
    app.setAppId("42");
    app.setCertificate(new BdkCertificateConfig());
    app.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    app.setCertificatePassword("iloveyou");
    app.setCertificatePath("Certificate Path");
    app.setPrivateKey(privateKey);
    app.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    app.setPrivateKeyPath("Private Key Path");

    BdkRsaKeyConfig privateKey2 = new BdkRsaKeyConfig();
    privateKey2.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey2.setPath("Path");

    BdkBotConfig bot = new BdkBotConfig();
    bot.setCertificate(new BdkCertificateConfig());
    bot.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setCertificatePassword("iloveyou");
    bot.setCertificatePath("Certificate Path");
    bot.setPrivateKey(privateKey2);
    bot.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setPrivateKeyPath("Private Key Path");
    bot.setUsername("janedoe");

    BdkCommonJwtConfig commonJwt = new BdkCommonJwtConfig();
    commonJwt.setEnabled(true);

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig());
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkDatafeedConfig datafeed = new BdkDatafeedConfig();
    datafeed.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    datafeed.setVersion("1.0.2");
    datafeed.setIdFilePath("");

    BdkConfig config = new BdkConfig();
    config.setAgent(new BdkAgentConfig());
    config.setApp(app);
    config.setBot(bot);
    config.setCommonJwt(commonJwt);
    config.setConnectionPoolMax(1);
    config.setConnectionPoolPerRoute(1);
    config.setConnectionTimeout(10);
    config.setContext("Context");
    config.setDatahose(datahose);
    config.setDefaultHeaders(defaultHeaders);
    config.setHost("localhost");
    config.setKeyManager(new BdkClientConfig());
    config.setPod(new BdkClientConfig());
    config.setPort(8080);
    config.setProxy(new BdkProxyConfig());
    config.setReadTimeout(10);
    config.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    config.setScheme("Scheme");
    config.setSessionAuth(new BdkClientConfig());
    config.setSsl(ssl);
    config.setDatafeed(datafeed);

    // Act and Assert
    assertFalse(new OnDiskDatafeedIdRepository(config).read().isPresent());
  }

  /**
   * Test {@link OnDiskDatafeedIdRepository#readAgentBasePath()}.
   *
   * <ul>
   *   <li>Given {@link BdkRsaKeyConfig} (default constructor) Content is {@code AXAXAXAX} Bytes is
   *       {@code UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link OnDiskDatafeedIdRepository#readAgentBasePath()}
   */
  @Test
  @DisplayName(
      "Test readAgentBasePath(); given BdkRsaKeyConfig (default constructor) Content is 'AXAXAXAX' Bytes is 'UTF-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional OnDiskDatafeedIdRepository.readAgentBasePath()"})
  void testReadAgentBasePath_givenBdkRsaKeyConfigContentIsAxaxaxaxBytesIsUtf8()
      throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkExtAppConfig app = new BdkExtAppConfig();
    app.setAppId("42");
    app.setCertificate(new BdkCertificateConfig());
    app.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    app.setCertificatePassword("iloveyou");
    app.setCertificatePath("Certificate Path");
    app.setPrivateKey(privateKey);
    app.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    app.setPrivateKeyPath("Private Key Path");

    BdkRsaKeyConfig privateKey2 = new BdkRsaKeyConfig();
    privateKey2.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey2.setPath("Path");

    BdkBotConfig bot = new BdkBotConfig();
    bot.setCertificate(new BdkCertificateConfig());
    bot.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setCertificatePassword("iloveyou");
    bot.setCertificatePath("Certificate Path");
    bot.setPrivateKey(privateKey2);
    bot.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setPrivateKeyPath("Private Key Path");
    bot.setUsername("janedoe");

    BdkCommonJwtConfig commonJwt = new BdkCommonJwtConfig();
    commonJwt.setEnabled(true);

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig());
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkDatafeedConfig datafeed = new BdkDatafeedConfig();
    datafeed.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    datafeed.setVersion("1.0.2");
    datafeed.setIdFilePath("");

    BdkConfig config = new BdkConfig();
    config.setAgent(new BdkAgentConfig());
    config.setApp(app);
    config.setBot(bot);
    config.setCommonJwt(commonJwt);
    config.setConnectionPoolMax(1);
    config.setConnectionPoolPerRoute(1);
    config.setConnectionTimeout(10);
    config.setContext("Context");
    config.setDatahose(datahose);
    config.setDefaultHeaders(defaultHeaders);
    config.setHost("localhost");
    config.setKeyManager(new BdkClientConfig());
    config.setPod(new BdkClientConfig());
    config.setPort(8080);
    config.setProxy(new BdkProxyConfig());
    config.setReadTimeout(10);
    config.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    config.setScheme("Scheme");
    config.setSessionAuth(new BdkClientConfig());
    config.setSsl(ssl);
    config.setDatafeed(datafeed);

    // Act and Assert
    assertFalse(new OnDiskDatafeedIdRepository(config).readAgentBasePath().isPresent());
  }

  /**
   * Test {@link OnDiskDatafeedIdRepository#readAgentBasePath()}.
   *
   * <ul>
   *   <li>Then calls {@link BdkConfig#getDatafeed()}.
   * </ul>
   *
   * <p>Method under test: {@link OnDiskDatafeedIdRepository#readAgentBasePath()}
   */
  @Test
  @DisplayName("Test readAgentBasePath(); then calls getDatafeed()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional OnDiskDatafeedIdRepository.readAgentBasePath()"})
  void testReadAgentBasePath_thenCallsGetDatafeed() {
    // Arrange
    BdkDatafeedConfig bdkDatafeedConfig = new BdkDatafeedConfig();
    bdkDatafeedConfig.setIdFilePath("/directory/foo.txt");
    bdkDatafeedConfig.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    bdkDatafeedConfig.setVersion("1.0.2");

    BdkConfig config = mock(BdkConfig.class);
    when(config.getDatafeed()).thenReturn(bdkDatafeedConfig);

    // Act
    Optional<String> actualReadAgentBasePathResult =
        new OnDiskDatafeedIdRepository(config).readAgentBasePath();

    // Assert
    verify(config, atLeast(1)).getDatafeed();
    assertFalse(actualReadAgentBasePathResult.isPresent());
  }
}
