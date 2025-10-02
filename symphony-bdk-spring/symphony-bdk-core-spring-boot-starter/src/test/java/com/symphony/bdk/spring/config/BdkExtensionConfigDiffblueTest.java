package com.symphony.bdk.spring.config;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.AuthSession;
import com.symphony.bdk.core.auth.impl.AuthSessionImpl;
import com.symphony.bdk.core.client.ApiClientFactory;
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
import com.symphony.bdk.core.config.model.BdkRetryConfig;
import com.symphony.bdk.core.config.model.BdkRsaKeyConfig;
import com.symphony.bdk.core.config.model.BdkSslConfig;
import com.symphony.bdk.core.extension.TestExtensionApiClientFactoryAware;
import com.symphony.bdk.core.extension.TestExtensionApiClientFactoryAware.TestService;
import com.symphony.bdk.core.extension.TestExtensionAuthenticationAware;
import com.symphony.bdk.core.extension.TestExtensionRetryBuilderAware;
import com.symphony.bdk.core.extension.TestExtensionWithoutDefaultConstructor;
import com.symphony.bdk.core.retry.RetryWithRecoveryBuilder;
import com.symphony.bdk.extension.BdkExtension;
import com.symphony.bdk.extension.BdkExtensionService;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.util.CompositeIterator;

class BdkExtensionConfigDiffblueTest {
  /**
   * Test {@link BdkExtensionConfig#extensionService(RetryWithRecoveryBuilder, ApiClientFactory,
   * Optional, BdkConfig, List)}.
   *
   * <ul>
   *   <li>Then {@link ArrayList#ArrayList()} first {@link TestExtensionApiClientFactoryAware}.
   * </ul>
   *
   * <p>Method under test: {@link BdkExtensionConfig#extensionService(RetryWithRecoveryBuilder,
   * ApiClientFactory, Optional, BdkConfig, List)}
   */
  @Test
  @DisplayName(
      "Test extensionService(RetryWithRecoveryBuilder, ApiClientFactory, Optional, BdkConfig, List); then ArrayList() first TestExtensionApiClientFactoryAware")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.core.extension.ExtensionService BdkExtensionConfig.extensionService(RetryWithRecoveryBuilder, ApiClientFactory, Optional, BdkConfig, List)"
  })
  void testExtensionService_thenArrayListFirstTestExtensionApiClientFactoryAware()
      throws UnsupportedEncodingException {
    // Arrange
    BdkExtensionConfig bdkExtensionConfig = new BdkExtensionConfig();
    RetryWithRecoveryBuilder<?> retryWithRecoveryBuilder = new RetryWithRecoveryBuilder<>();

    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkExtAppConfig app = new BdkExtAppConfig();
    app.setAppId("42");
    app.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
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
    bot.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    bot.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setCertificatePassword("iloveyou");
    bot.setCertificatePath("Certificate Path");
    bot.setPrivateKey(privateKey2);
    bot.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setPrivateKeyPath("Private Key Path");
    bot.setUsername("janedoe");

    BdkCommonJwtConfig commonJwt = new BdkCommonJwtConfig();
    commonJwt.setEnabled(true);

    BdkDatafeedConfig datafeed = new BdkDatafeedConfig();
    datafeed.setIdFilePath("/directory/foo.txt");
    datafeed.setRetry(new BdkRetryConfig());
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(new BdkRetryConfig());
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkConfig config = new BdkConfig();
    config.setAgent(new BdkAgentConfig());
    config.setApp(app);
    config.setBot(bot);
    config.setCommonJwt(commonJwt);
    config.setConnectionPoolMax(1);
    config.setConnectionPoolPerRoute(1);
    config.setConnectionTimeout(10);
    config.setContext("Context");
    config.setDatafeed(datafeed);
    config.setDatahose(datahose);
    config.setDefaultHeaders(defaultHeaders);
    config.setHost("localhost");
    config.setKeyManager(new BdkClientConfig());
    config.setPod(new BdkClientConfig());
    config.setPort(8080);
    BdkProxyConfig proxy = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");
    config.setProxy(proxy);
    config.setReadTimeout(10);
    config.setRetry(new BdkRetryConfig());
    config.setScheme("Scheme");
    config.setSessionAuth(new BdkClientConfig());
    config.setSsl(ssl);
    ApiClientFactory apiClientFactory = new ApiClientFactory(config);
    Optional<AuthSession> botSession = Optional.of(new AuthSessionImpl(null));

    BdkRsaKeyConfig privateKey3 = new BdkRsaKeyConfig();
    privateKey3.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey3.setPath("Path");

    BdkExtAppConfig app2 = new BdkExtAppConfig();
    app2.setAppId("42");
    app2.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    app2.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    app2.setCertificatePassword("iloveyou");
    app2.setCertificatePath("Certificate Path");
    app2.setPrivateKey(privateKey3);
    app2.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    app2.setPrivateKeyPath("Private Key Path");

    BdkRsaKeyConfig privateKey4 = new BdkRsaKeyConfig();
    privateKey4.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey4.setPath("Path");

    BdkBotConfig bot2 = new BdkBotConfig();
    bot2.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    bot2.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bot2.setCertificatePassword("iloveyou");
    bot2.setCertificatePath("Certificate Path");
    bot2.setPrivateKey(privateKey4);
    bot2.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bot2.setPrivateKeyPath("Private Key Path");
    bot2.setUsername("janedoe");

    BdkCommonJwtConfig commonJwt2 = new BdkCommonJwtConfig();
    commonJwt2.setEnabled(true);

    BdkDatafeedConfig datafeed2 = new BdkDatafeedConfig();
    datafeed2.setIdFilePath("/directory/foo.txt");
    datafeed2.setRetry(new BdkRetryConfig());
    datafeed2.setVersion("1.0.2");

    BdkDatahoseConfig datahose2 = new BdkDatahoseConfig();
    datahose2.setEventTypes(new ArrayList<>());
    datahose2.setRetry(new BdkRetryConfig());
    datahose2.setTag("Tag");

    HashMap<String, String> defaultHeaders2 = new HashMap<>();
    defaultHeaders2.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl2 = new BdkSslConfig();
    ssl2.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl2.setTrustStorePassword("iloveyou");
    ssl2.setTrustStorePath("Trust Store Path");

    BdkConfig config2 = new BdkConfig();
    config2.setAgent(new BdkAgentConfig());
    config2.setApp(app2);
    config2.setBot(bot2);
    config2.setCommonJwt(commonJwt2);
    config2.setConnectionPoolMax(1);
    config2.setConnectionPoolPerRoute(1);
    config2.setConnectionTimeout(10);
    config2.setContext("Context");
    config2.setDatafeed(datafeed2);
    config2.setDatahose(datahose2);
    config2.setDefaultHeaders(defaultHeaders2);
    config2.setHost("localhost");
    config2.setKeyManager(new BdkClientConfig());
    config2.setPod(new BdkClientConfig());
    config2.setPort(8080);
    BdkProxyConfig proxy2 = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");
    config2.setProxy(proxy2);
    config2.setReadTimeout(10);
    config2.setRetry(new BdkRetryConfig());
    config2.setScheme("Scheme");
    config2.setSessionAuth(new BdkClientConfig());
    config2.setSsl(ssl2);

    ArrayList<BdkExtension> extensions = new ArrayList<>();
    extensions.add(new TestExtensionApiClientFactoryAware());

    // Act
    bdkExtensionConfig.extensionService(
        retryWithRecoveryBuilder, apiClientFactory, botSession, config2, extensions);

    // Assert
    assertEquals(1, extensions.size());
    BdkExtension getResult = extensions.get(0);
    assertTrue(getResult instanceof TestExtensionApiClientFactoryAware);
    assertSame(
        apiClientFactory,
        ((TestExtensionApiClientFactoryAware) getResult).getService().getApiClientFactory());
  }

  /**
   * Test {@link BdkExtensionConfig#extensionService(RetryWithRecoveryBuilder, ApiClientFactory,
   * Optional, BdkConfig, List)}.
   *
   * <ul>
   *   <li>Then {@link ArrayList#ArrayList()} first {@link TestExtensionAuthenticationAware}.
   * </ul>
   *
   * <p>Method under test: {@link BdkExtensionConfig#extensionService(RetryWithRecoveryBuilder,
   * ApiClientFactory, Optional, BdkConfig, List)}
   */
  @Test
  @DisplayName(
      "Test extensionService(RetryWithRecoveryBuilder, ApiClientFactory, Optional, BdkConfig, List); then ArrayList() first TestExtensionAuthenticationAware")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.core.extension.ExtensionService BdkExtensionConfig.extensionService(RetryWithRecoveryBuilder, ApiClientFactory, Optional, BdkConfig, List)"
  })
  void testExtensionService_thenArrayListFirstTestExtensionAuthenticationAware()
      throws UnsupportedEncodingException {
    // Arrange
    BdkExtensionConfig bdkExtensionConfig = new BdkExtensionConfig();
    RetryWithRecoveryBuilder<?> retryWithRecoveryBuilder = new RetryWithRecoveryBuilder<>();

    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkExtAppConfig app = new BdkExtAppConfig();
    app.setAppId("42");
    app.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
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
    bot.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    bot.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setCertificatePassword("iloveyou");
    bot.setCertificatePath("Certificate Path");
    bot.setPrivateKey(privateKey2);
    bot.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setPrivateKeyPath("Private Key Path");
    bot.setUsername("janedoe");

    BdkCommonJwtConfig commonJwt = new BdkCommonJwtConfig();
    commonJwt.setEnabled(true);

    BdkDatafeedConfig datafeed = new BdkDatafeedConfig();
    datafeed.setIdFilePath("/directory/foo.txt");
    datafeed.setRetry(new BdkRetryConfig());
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(new BdkRetryConfig());
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkConfig config = new BdkConfig();
    config.setAgent(new BdkAgentConfig());
    config.setApp(app);
    config.setBot(bot);
    config.setCommonJwt(commonJwt);
    config.setConnectionPoolMax(1);
    config.setConnectionPoolPerRoute(1);
    config.setConnectionTimeout(10);
    config.setContext("Context");
    config.setDatafeed(datafeed);
    config.setDatahose(datahose);
    config.setDefaultHeaders(defaultHeaders);
    config.setHost("localhost");
    config.setKeyManager(new BdkClientConfig());
    config.setPod(new BdkClientConfig());
    config.setPort(8080);
    BdkProxyConfig proxy = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");
    config.setProxy(proxy);
    config.setReadTimeout(10);
    config.setRetry(new BdkRetryConfig());
    config.setScheme("Scheme");
    config.setSessionAuth(new BdkClientConfig());
    config.setSsl(ssl);
    ApiClientFactory apiClientFactory = new ApiClientFactory(config);
    AuthSessionImpl authSessionImpl = new AuthSessionImpl(null);
    Optional<AuthSession> botSession = Optional.of(authSessionImpl);

    BdkRsaKeyConfig privateKey3 = new BdkRsaKeyConfig();
    privateKey3.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey3.setPath("Path");

    BdkExtAppConfig app2 = new BdkExtAppConfig();
    app2.setAppId("42");
    app2.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    app2.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    app2.setCertificatePassword("iloveyou");
    app2.setCertificatePath("Certificate Path");
    app2.setPrivateKey(privateKey3);
    app2.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    app2.setPrivateKeyPath("Private Key Path");

    BdkRsaKeyConfig privateKey4 = new BdkRsaKeyConfig();
    privateKey4.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey4.setPath("Path");

    BdkBotConfig bot2 = new BdkBotConfig();
    bot2.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    bot2.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bot2.setCertificatePassword("iloveyou");
    bot2.setCertificatePath("Certificate Path");
    bot2.setPrivateKey(privateKey4);
    bot2.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bot2.setPrivateKeyPath("Private Key Path");
    bot2.setUsername("janedoe");

    BdkCommonJwtConfig commonJwt2 = new BdkCommonJwtConfig();
    commonJwt2.setEnabled(true);

    BdkDatafeedConfig datafeed2 = new BdkDatafeedConfig();
    datafeed2.setIdFilePath("/directory/foo.txt");
    datafeed2.setRetry(new BdkRetryConfig());
    datafeed2.setVersion("1.0.2");

    BdkDatahoseConfig datahose2 = new BdkDatahoseConfig();
    datahose2.setEventTypes(new ArrayList<>());
    datahose2.setRetry(new BdkRetryConfig());
    datahose2.setTag("Tag");

    HashMap<String, String> defaultHeaders2 = new HashMap<>();
    defaultHeaders2.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl2 = new BdkSslConfig();
    ssl2.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl2.setTrustStorePassword("iloveyou");
    ssl2.setTrustStorePath("Trust Store Path");

    BdkConfig config2 = new BdkConfig();
    config2.setAgent(new BdkAgentConfig());
    config2.setApp(app2);
    config2.setBot(bot2);
    config2.setCommonJwt(commonJwt2);
    config2.setConnectionPoolMax(1);
    config2.setConnectionPoolPerRoute(1);
    config2.setConnectionTimeout(10);
    config2.setContext("Context");
    config2.setDatafeed(datafeed2);
    config2.setDatahose(datahose2);
    config2.setDefaultHeaders(defaultHeaders2);
    config2.setHost("localhost");
    config2.setKeyManager(new BdkClientConfig());
    config2.setPod(new BdkClientConfig());
    config2.setPort(8080);
    BdkProxyConfig proxy2 = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");
    config2.setProxy(proxy2);
    config2.setReadTimeout(10);
    config2.setRetry(new BdkRetryConfig());
    config2.setScheme("Scheme");
    config2.setSessionAuth(new BdkClientConfig());
    config2.setSsl(ssl2);

    ArrayList<BdkExtension> extensions = new ArrayList<>();
    extensions.add(new TestExtensionAuthenticationAware());

    // Act
    bdkExtensionConfig.extensionService(
        retryWithRecoveryBuilder, apiClientFactory, botSession, config2, extensions);

    // Assert
    assertEquals(1, extensions.size());
    BdkExtension getResult = extensions.get(0);
    assertTrue(getResult instanceof TestExtensionAuthenticationAware);
    assertSame(
        authSessionImpl,
        ((TestExtensionAuthenticationAware) getResult).getService().getAuthSession());
  }

  /**
   * Test {@link BdkExtensionConfig#extensionService(RetryWithRecoveryBuilder, ApiClientFactory,
   * Optional, BdkConfig, List)}.
   *
   * <ul>
   *   <li>Then {@link ArrayList#ArrayList()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link BdkExtensionConfig#extensionService(RetryWithRecoveryBuilder,
   * ApiClientFactory, Optional, BdkConfig, List)}
   */
  @Test
  @DisplayName(
      "Test extensionService(RetryWithRecoveryBuilder, ApiClientFactory, Optional, BdkConfig, List); then ArrayList() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.core.extension.ExtensionService BdkExtensionConfig.extensionService(RetryWithRecoveryBuilder, ApiClientFactory, Optional, BdkConfig, List)"
  })
  void testExtensionService_thenArrayListSizeIsTwo() throws UnsupportedEncodingException {
    // Arrange
    BdkExtensionConfig bdkExtensionConfig = new BdkExtensionConfig();
    RetryWithRecoveryBuilder<?> retryWithRecoveryBuilder = new RetryWithRecoveryBuilder<>();

    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkExtAppConfig app = new BdkExtAppConfig();
    app.setAppId("42");
    app.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
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
    bot.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    bot.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setCertificatePassword("iloveyou");
    bot.setCertificatePath("Certificate Path");
    bot.setPrivateKey(privateKey2);
    bot.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setPrivateKeyPath("Private Key Path");
    bot.setUsername("janedoe");

    BdkCommonJwtConfig commonJwt = new BdkCommonJwtConfig();
    commonJwt.setEnabled(true);

    BdkDatafeedConfig datafeed = new BdkDatafeedConfig();
    datafeed.setIdFilePath("/directory/foo.txt");
    datafeed.setRetry(new BdkRetryConfig());
    datafeed.setVersion("1.0.2");

    BdkDatahoseConfig datahose = new BdkDatahoseConfig();
    datahose.setEventTypes(new ArrayList<>());
    datahose.setRetry(new BdkRetryConfig());
    datahose.setTag("Tag");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkConfig config = new BdkConfig();
    config.setAgent(new BdkAgentConfig());
    config.setApp(app);
    config.setBot(bot);
    config.setCommonJwt(commonJwt);
    config.setConnectionPoolMax(1);
    config.setConnectionPoolPerRoute(1);
    config.setConnectionTimeout(10);
    config.setContext("Context");
    config.setDatafeed(datafeed);
    config.setDatahose(datahose);
    config.setDefaultHeaders(defaultHeaders);
    config.setHost("localhost");
    config.setKeyManager(new BdkClientConfig());
    config.setPod(new BdkClientConfig());
    config.setPort(8080);
    BdkProxyConfig proxy = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");
    config.setProxy(proxy);
    config.setReadTimeout(10);
    config.setRetry(new BdkRetryConfig());
    config.setScheme("Scheme");
    config.setSessionAuth(new BdkClientConfig());
    config.setSsl(ssl);
    ApiClientFactory apiClientFactory = new ApiClientFactory(config);
    Optional<AuthSession> botSession = Optional.of(new AuthSessionImpl(null));

    BdkRsaKeyConfig privateKey3 = new BdkRsaKeyConfig();
    privateKey3.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey3.setPath("Path");

    BdkExtAppConfig app2 = new BdkExtAppConfig();
    app2.setAppId("42");
    app2.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    app2.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    app2.setCertificatePassword("iloveyou");
    app2.setCertificatePath("Certificate Path");
    app2.setPrivateKey(privateKey3);
    app2.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    app2.setPrivateKeyPath("Private Key Path");

    BdkRsaKeyConfig privateKey4 = new BdkRsaKeyConfig();
    privateKey4.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey4.setPath("Path");

    BdkBotConfig bot2 = new BdkBotConfig();
    bot2.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    bot2.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bot2.setCertificatePassword("iloveyou");
    bot2.setCertificatePath("Certificate Path");
    bot2.setPrivateKey(privateKey4);
    bot2.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bot2.setPrivateKeyPath("Private Key Path");
    bot2.setUsername("janedoe");

    BdkCommonJwtConfig commonJwt2 = new BdkCommonJwtConfig();
    commonJwt2.setEnabled(true);

    BdkDatafeedConfig datafeed2 = new BdkDatafeedConfig();
    datafeed2.setIdFilePath("/directory/foo.txt");
    datafeed2.setRetry(new BdkRetryConfig());
    datafeed2.setVersion("1.0.2");

    BdkDatahoseConfig datahose2 = new BdkDatahoseConfig();
    datahose2.setEventTypes(new ArrayList<>());
    datahose2.setRetry(new BdkRetryConfig());
    datahose2.setTag("Tag");

    HashMap<String, String> defaultHeaders2 = new HashMap<>();
    defaultHeaders2.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl2 = new BdkSslConfig();
    ssl2.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    ssl2.setTrustStorePassword("iloveyou");
    ssl2.setTrustStorePath("Trust Store Path");

    BdkConfig config2 = new BdkConfig();
    config2.setAgent(new BdkAgentConfig());
    config2.setApp(app2);
    config2.setBot(bot2);
    config2.setCommonJwt(commonJwt2);
    config2.setConnectionPoolMax(1);
    config2.setConnectionPoolPerRoute(1);
    config2.setConnectionTimeout(10);
    config2.setContext("Context");
    config2.setDatafeed(datafeed2);
    config2.setDatahose(datahose2);
    config2.setDefaultHeaders(defaultHeaders2);
    config2.setHost("localhost");
    config2.setKeyManager(new BdkClientConfig());
    config2.setPod(new BdkClientConfig());
    config2.setPort(8080);
    BdkProxyConfig proxy2 = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");
    config2.setProxy(proxy2);
    config2.setReadTimeout(10);
    config2.setRetry(new BdkRetryConfig());
    config2.setScheme("Scheme");
    config2.setSessionAuth(new BdkClientConfig());
    config2.setSsl(ssl2);

    TestExtensionRetryBuilderAware testExtensionRetryBuilderAware =
        new TestExtensionRetryBuilderAware();
    testExtensionRetryBuilderAware.setRetryBuilder(new RetryWithRecoveryBuilder<>());

    ArrayList<BdkExtension> extensions = new ArrayList<>();
    extensions.add(testExtensionRetryBuilderAware);
    extensions.add(new TestExtensionApiClientFactoryAware());

    // Act
    bdkExtensionConfig.extensionService(
        retryWithRecoveryBuilder, apiClientFactory, botSession, config2, extensions);

    // Assert
    assertEquals(2, extensions.size());
    BdkExtension getResult = extensions.get(1);
    assertTrue(getResult instanceof TestExtensionApiClientFactoryAware);
    assertSame(
        apiClientFactory,
        ((TestExtensionApiClientFactoryAware) getResult).getService().getApiClientFactory());
  }

  /**
   * Test {@link BdkExtensionConfig#bdkExtensionServices(List, ConfigurableListableBeanFactory)}.
   *
   * <p>Method under test: {@link BdkExtensionConfig#bdkExtensionServices(List,
   * ConfigurableListableBeanFactory)}
   */
  @Test
  @DisplayName("Test bdkExtensionServices(List, ConfigurableListableBeanFactory)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "List BdkExtensionConfig.bdkExtensionServices(List, ConfigurableListableBeanFactory)"
  })
  void testBdkExtensionServices() {
    // Arrange
    BdkExtensionConfig bdkExtensionConfig = new BdkExtensionConfig();

    ArrayList<BdkExtension> extensions = new ArrayList<>();
    extensions.add(
        new TestExtensionWithoutDefaultConstructor(
            "Extension service bean <{}> successfully registered in application context"));
    DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

    // Act
    List<BdkExtensionService> actualBdkExtensionServicesResult =
        bdkExtensionConfig.bdkExtensionServices(extensions, beanFactory);

    // Assert
    Object singletonMutex = beanFactory.getSingletonMutex();
    assertTrue(singletonMutex instanceof Map);
    Iterator<String> beanNamesIterator = beanFactory.getBeanNamesIterator();
    assertTrue(beanNamesIterator instanceof CompositeIterator);
    assertEquals(0, beanFactory.getSingletonCount());
    assertFalse(beanNamesIterator.hasNext());
    assertTrue(actualBdkExtensionServicesResult.isEmpty());
    assertTrue(((Map<Object, Object>) singletonMutex).isEmpty());
  }

  /**
   * Test {@link BdkExtensionConfig#bdkExtensionServices(List, ConfigurableListableBeanFactory)}.
   *
   * <ul>
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link BdkExtensionConfig#bdkExtensionServices(List,
   * ConfigurableListableBeanFactory)}
   */
  @Test
  @DisplayName(
      "Test bdkExtensionServices(List, ConfigurableListableBeanFactory); then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "List BdkExtensionConfig.bdkExtensionServices(List, ConfigurableListableBeanFactory)"
  })
  void testBdkExtensionServices_thenReturnSizeIsOne() {
    // Arrange
    BdkExtensionConfig bdkExtensionConfig = new BdkExtensionConfig();

    ArrayList<BdkExtension> extensions = new ArrayList<>();
    extensions.add(new TestExtensionApiClientFactoryAware());
    DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

    // Act
    List<BdkExtensionService> actualBdkExtensionServicesResult =
        bdkExtensionConfig.bdkExtensionServices(extensions, beanFactory);

    // Assert
    assertEquals(1, actualBdkExtensionServicesResult.size());
    BdkExtensionService getResult = actualBdkExtensionServicesResult.get(0);
    assertTrue(getResult instanceof TestService);
    Object singletonMutex = beanFactory.getSingletonMutex();
    assertTrue(singletonMutex instanceof Map);
    Iterator<String> beanNamesIterator = beanFactory.getBeanNamesIterator();
    assertTrue(beanNamesIterator instanceof CompositeIterator);
    assertEquals(
        "com.symphony.bdk.core.extension.TestExtensionApiClientFactoryAware.TestService",
        beanNamesIterator.next());
    assertNull(((TestService) getResult).getApiClientFactory());
    assertEquals(1, ((Map<String, TestService>) singletonMutex).size());
    assertEquals(1, beanFactory.getSingletonCount());
    assertFalse(beanNamesIterator.hasNext());
    assertTrue(
        ((Map<String, TestService>) singletonMutex)
            .containsKey(
                "com.symphony.bdk.core.extension.TestExtensionApiClientFactoryAware.TestService"));
    assertArrayEquals(
        new String[] {
          "com.symphony.bdk.core.extension.TestExtensionApiClientFactoryAware.TestService"
        },
        beanFactory.getSingletonNames());
  }

  /**
   * Test {@link BdkExtensionConfig#bdkExtensionServices(List, ConfigurableListableBeanFactory)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link BdkExtensionConfig#bdkExtensionServices(List,
   * ConfigurableListableBeanFactory)}
   */
  @Test
  @DisplayName("Test bdkExtensionServices(List, ConfigurableListableBeanFactory); when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "List BdkExtensionConfig.bdkExtensionServices(List, ConfigurableListableBeanFactory)"
  })
  void testBdkExtensionServices_whenArrayList() {
    // Arrange
    BdkExtensionConfig bdkExtensionConfig = new BdkExtensionConfig();
    ArrayList<BdkExtension> extensions = new ArrayList<>();
    DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

    // Act
    List<BdkExtensionService> actualBdkExtensionServicesResult =
        bdkExtensionConfig.bdkExtensionServices(extensions, beanFactory);

    // Assert
    Object singletonMutex = beanFactory.getSingletonMutex();
    assertTrue(singletonMutex instanceof Map);
    Iterator<String> beanNamesIterator = beanFactory.getBeanNamesIterator();
    assertTrue(beanNamesIterator instanceof CompositeIterator);
    assertEquals(0, beanFactory.getSingletonCount());
    assertFalse(beanNamesIterator.hasNext());
    assertTrue(actualBdkExtensionServicesResult.isEmpty());
    assertTrue(((Map<Object, Object>) singletonMutex).isEmpty());
  }
}
