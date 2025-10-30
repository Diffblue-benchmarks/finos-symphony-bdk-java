package com.symphony.bdk.spring.config;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
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
import com.symphony.bdk.core.extension.TestExtensionConfigAware;
import com.symphony.bdk.core.extension.TestExtensionRetryBuilderAware;
import com.symphony.bdk.core.extension.TestExtensionWithoutDefaultConstructor;
import com.symphony.bdk.core.retry.RetryWithRecoveryBuilder;
import com.symphony.bdk.extension.BdkExtension;
import com.symphony.bdk.extension.BdkExtensionService;
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
   * Test {@link BdkExtensionConfig#extensionService(RetryWithRecoveryBuilder, ApiClientFactory, Optional, BdkConfig, List)}.
   * <ul>
   *   <li>Given {@code A}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} first {@link TestExtensionConfigAware}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkExtensionConfig#extensionService(RetryWithRecoveryBuilder, ApiClientFactory, Optional, BdkConfig, List)}
   */
  @Test
  @DisplayName("Test extensionService(RetryWithRecoveryBuilder, ApiClientFactory, Optional, BdkConfig, List); given 'A'; then ArrayList() first TestExtensionConfigAware")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.core.extension.ExtensionService BdkExtensionConfig.extensionService(RetryWithRecoveryBuilder, ApiClientFactory, Optional, BdkConfig, List)"})
  void testExtensionService_givenA_thenArrayListFirstTestExtensionConfigAware() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange
    BdkExtensionConfig bdkExtensionConfig = new BdkExtensionConfig();
    RetryWithRecoveryBuilder<Object> retryWithRecoveryBuilder = mock(RetryWithRecoveryBuilder.class);
    ApiClientFactory apiClientFactory = mock(ApiClientFactory.class);
    Optional<AuthSession> botSession = Optional.of(new AuthSessionImpl(null));
    BdkConfig config = mock(BdkConfig.class);

    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent(new byte[]{'A', 1, 'A', 1, 'A', 1, 'A', 1});
    privateKey
        .setPath("{} extension(s) found from application context. The following extension(s) will be registered:");

    BdkExtAppConfig app = new BdkExtAppConfig();
    app.setAppId("42");
    app.setCertificate(new BdkCertificateConfig(
        "{} extension(s) found from application context. The following extension(s) will be registered:", "iloveyou"));
    app.setCertificateContent(new byte[]{'A', 1, 'A', 1, 'A', 1, 'A', 1});
    app.setCertificatePassword("iloveyou");
    app.setCertificatePath(
        "{} extension(s) found from application context. The following extension(s) will be registered:");
    app.setPrivateKey(privateKey);
    app.setPrivateKeyContent(new byte[]{'A', 1, 'A', 1, 'A', 1, 'A', 1});
    app.setPrivateKeyPath(
        "{} extension(s) found from application context. The following extension(s) will be registered:");

    BdkRsaKeyConfig privateKey2 = new BdkRsaKeyConfig();
    privateKey2.setContent(new byte[]{'A', 1, 'A', 1, 'A', 1, 'A', 1});
    privateKey2
        .setPath("{} extension(s) found from application context. The following extension(s) will be registered:");

    BdkBotConfig bot = new BdkBotConfig();
    bot.setCertificate(new BdkCertificateConfig(
        "{} extension(s) found from application context. The following extension(s) will be registered:", "iloveyou"));
    bot.setCertificateContent(new byte[]{'A', 1, 'A', 1, 'A', 1, 'A', 1});
    bot.setCertificatePassword("iloveyou");
    bot.setCertificatePath(
        "{} extension(s) found from application context. The following extension(s) will be registered:");
    bot.setPrivateKey(privateKey2);
    bot.setPrivateKeyContent(new byte[]{'A', 1, 'A', 1, 'A', 1, 'A', 1});
    bot.setPrivateKeyPath(
        "{} extension(s) found from application context. The following extension(s) will be registered:");
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
    datahose.setTag("{} extension(s) found from application context. The following extension(s) will be registered:");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig(
        "{} extension(s) found from application context. The following extension(s) will be registered:", "iloveyou"));
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath(
        "{} extension(s) found from application context. The following extension(s) will be registered:");

    BdkConfig config2 = new BdkConfig();
    config2.setAgent(new BdkAgentConfig());
    config2.setApp(app);
    config2.setBot(bot);
    config2.setCommonJwt(commonJwt);
    config2.setConnectionPoolMax(1);
    config2.setConnectionPoolPerRoute(1);
    config2.setConnectionTimeout(10);
    config2
        .setContext("{} extension(s) found from application context. The following extension(s) will be registered:");
    config2.setDatafeed(datafeed);
    config2.setDatahose(datahose);
    config2.setDefaultHeaders(defaultHeaders);
    config2.setHost("localhost");
    config2.setKeyManager(new BdkClientConfig());
    config2.setPod(new BdkClientConfig());
    config2.setPort(8080);
    config2.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    config2.setReadTimeout(10);
    config2.setRetry(new BdkRetryConfig());
    config2.setScheme("{} extension(s) found from application context. The following extension(s) will be registered:");
    config2.setSessionAuth(new BdkClientConfig());
    config2.setSsl(ssl);

    TestExtensionConfigAware testExtensionConfigAware = new TestExtensionConfigAware();
    testExtensionConfigAware.setConfiguration(config2);

    ArrayList<BdkExtension> extensions = new ArrayList<>();
    extensions.add(testExtensionConfigAware);

    // Act
    bdkExtensionConfig.extensionService(retryWithRecoveryBuilder, apiClientFactory, botSession, config, extensions);

    // Assert
    assertEquals(1, extensions.size());
    BdkExtension getResult = extensions.get(0);
    assertTrue(getResult instanceof TestExtensionConfigAware);
    assertSame(config, ((TestExtensionConfigAware) getResult).getService().getConfig());
  }

  /**
   * Test {@link BdkExtensionConfig#extensionService(RetryWithRecoveryBuilder, ApiClientFactory, Optional, BdkConfig, List)}.
   * <ul>
   *   <li>Then {@link ArrayList#ArrayList()} first {@link TestExtensionApiClientFactoryAware}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkExtensionConfig#extensionService(RetryWithRecoveryBuilder, ApiClientFactory, Optional, BdkConfig, List)}
   */
  @Test
  @DisplayName("Test extensionService(RetryWithRecoveryBuilder, ApiClientFactory, Optional, BdkConfig, List); then ArrayList() first TestExtensionApiClientFactoryAware")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.core.extension.ExtensionService BdkExtensionConfig.extensionService(RetryWithRecoveryBuilder, ApiClientFactory, Optional, BdkConfig, List)"})
  void testExtensionService_thenArrayListFirstTestExtensionApiClientFactoryAware() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange
    BdkExtensionConfig bdkExtensionConfig = new BdkExtensionConfig();
    RetryWithRecoveryBuilder<Object> retryWithRecoveryBuilder = mock(RetryWithRecoveryBuilder.class);
    ApiClientFactory apiClientFactory = mock(ApiClientFactory.class);
    Optional<AuthSession> botSession = Optional.of(new AuthSessionImpl(null));
    BdkConfig config = mock(BdkConfig.class);

    ArrayList<BdkExtension> extensions = new ArrayList<>();
    extensions.add(new TestExtensionApiClientFactoryAware());

    // Act
    bdkExtensionConfig.extensionService(retryWithRecoveryBuilder, apiClientFactory, botSession, config, extensions);

    // Assert
    assertEquals(1, extensions.size());
    BdkExtension getResult = extensions.get(0);
    assertTrue(getResult instanceof TestExtensionApiClientFactoryAware);
    assertSame(apiClientFactory, ((TestExtensionApiClientFactoryAware) getResult).getService().getApiClientFactory());
  }

  /**
   * Test {@link BdkExtensionConfig#extensionService(RetryWithRecoveryBuilder, ApiClientFactory, Optional, BdkConfig, List)}.
   * <ul>
   *   <li>Then {@link ArrayList#ArrayList()} first {@link TestExtensionAuthenticationAware}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkExtensionConfig#extensionService(RetryWithRecoveryBuilder, ApiClientFactory, Optional, BdkConfig, List)}
   */
  @Test
  @DisplayName("Test extensionService(RetryWithRecoveryBuilder, ApiClientFactory, Optional, BdkConfig, List); then ArrayList() first TestExtensionAuthenticationAware")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.core.extension.ExtensionService BdkExtensionConfig.extensionService(RetryWithRecoveryBuilder, ApiClientFactory, Optional, BdkConfig, List)"})
  void testExtensionService_thenArrayListFirstTestExtensionAuthenticationAware() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange
    BdkExtensionConfig bdkExtensionConfig = new BdkExtensionConfig();
    RetryWithRecoveryBuilder<Object> retryWithRecoveryBuilder = mock(RetryWithRecoveryBuilder.class);
    ApiClientFactory apiClientFactory = mock(ApiClientFactory.class);
    AuthSessionImpl authSessionImpl = new AuthSessionImpl(null);
    Optional<AuthSession> botSession = Optional.of(authSessionImpl);
    BdkConfig config = mock(BdkConfig.class);

    ArrayList<BdkExtension> extensions = new ArrayList<>();
    extensions.add(new TestExtensionAuthenticationAware());

    // Act
    bdkExtensionConfig.extensionService(retryWithRecoveryBuilder, apiClientFactory, botSession, config, extensions);

    // Assert
    assertEquals(1, extensions.size());
    BdkExtension getResult = extensions.get(0);
    assertTrue(getResult instanceof TestExtensionAuthenticationAware);
    assertSame(authSessionImpl, ((TestExtensionAuthenticationAware) getResult).getService().getAuthSession());
  }

  /**
   * Test {@link BdkExtensionConfig#extensionService(RetryWithRecoveryBuilder, ApiClientFactory, Optional, BdkConfig, List)}.
   * <ul>
   *   <li>Then {@link ArrayList#ArrayList()} first {@link TestExtensionRetryBuilderAware}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkExtensionConfig#extensionService(RetryWithRecoveryBuilder, ApiClientFactory, Optional, BdkConfig, List)}
   */
  @Test
  @DisplayName("Test extensionService(RetryWithRecoveryBuilder, ApiClientFactory, Optional, BdkConfig, List); then ArrayList() first TestExtensionRetryBuilderAware")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.core.extension.ExtensionService BdkExtensionConfig.extensionService(RetryWithRecoveryBuilder, ApiClientFactory, Optional, BdkConfig, List)"})
  void testExtensionService_thenArrayListFirstTestExtensionRetryBuilderAware() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange
    BdkExtensionConfig bdkExtensionConfig = new BdkExtensionConfig();
    RetryWithRecoveryBuilder<Object> retryWithRecoveryBuilder = mock(RetryWithRecoveryBuilder.class);
    ApiClientFactory apiClientFactory = mock(ApiClientFactory.class);
    Optional<AuthSession> botSession = Optional.of(new AuthSessionImpl(null));
    BdkConfig config = mock(BdkConfig.class);

    TestExtensionRetryBuilderAware testExtensionRetryBuilderAware = new TestExtensionRetryBuilderAware();
    testExtensionRetryBuilderAware.setRetryBuilder(new RetryWithRecoveryBuilder<>());

    ArrayList<BdkExtension> extensions = new ArrayList<>();
    extensions.add(testExtensionRetryBuilderAware);

    // Act
    bdkExtensionConfig.extensionService(retryWithRecoveryBuilder, apiClientFactory, botSession, config, extensions);

    // Assert
    assertEquals(1, extensions.size());
    BdkExtension getResult = extensions.get(0);
    assertTrue(getResult instanceof TestExtensionRetryBuilderAware);
    assertSame(retryWithRecoveryBuilder, ((TestExtensionRetryBuilderAware) getResult).getService().getRetryBuilder());
  }

  /**
   * Test {@link BdkExtensionConfig#bdkExtensionServices(List, ConfigurableListableBeanFactory)}.
   * <p>
   * Method under test: {@link BdkExtensionConfig#bdkExtensionServices(List, ConfigurableListableBeanFactory)}
   */
  @Test
  @DisplayName("Test bdkExtensionServices(List, ConfigurableListableBeanFactory)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List BdkExtensionConfig.bdkExtensionServices(List, ConfigurableListableBeanFactory)"})
  void testBdkExtensionServices() {
    // Arrange
    BdkExtensionConfig bdkExtensionConfig = new BdkExtensionConfig();

    ArrayList<BdkExtension> extensions = new ArrayList<>();
    extensions.add(new TestExtensionWithoutDefaultConstructor(
        "Extension service bean <{}> successfully registered in application context"));
    DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

    // Act
    List<BdkExtensionService> actualBdkExtensionServicesResult = bdkExtensionConfig.bdkExtensionServices(extensions,
        beanFactory);

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
   * <ul>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkExtensionConfig#bdkExtensionServices(List, ConfigurableListableBeanFactory)}
   */
  @Test
  @DisplayName("Test bdkExtensionServices(List, ConfigurableListableBeanFactory); then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List BdkExtensionConfig.bdkExtensionServices(List, ConfigurableListableBeanFactory)"})
  void testBdkExtensionServices_thenReturnSizeIsOne() {
    // Arrange
    BdkExtensionConfig bdkExtensionConfig = new BdkExtensionConfig();

    ArrayList<BdkExtension> extensions = new ArrayList<>();
    extensions.add(new TestExtensionApiClientFactoryAware());
    DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

    // Act
    List<BdkExtensionService> actualBdkExtensionServicesResult = bdkExtensionConfig.bdkExtensionServices(extensions,
        beanFactory);

    // Assert
    assertEquals(1, actualBdkExtensionServicesResult.size());
    BdkExtensionService getResult = actualBdkExtensionServicesResult.get(0);
    assertTrue(getResult instanceof TestService);
    Object singletonMutex = beanFactory.getSingletonMutex();
    assertTrue(singletonMutex instanceof Map);
    Iterator<String> beanNamesIterator = beanFactory.getBeanNamesIterator();
    assertTrue(beanNamesIterator instanceof CompositeIterator);
    assertEquals("com.symphony.bdk.core.extension.TestExtensionApiClientFactoryAware.TestService",
        beanNamesIterator.next());
    assertNull(((TestService) getResult).getApiClientFactory());
    assertEquals(1, ((Map<String, TestService>) singletonMutex).size());
    assertEquals(1, beanFactory.getSingletonCount());
    assertFalse(beanNamesIterator.hasNext());
    assertTrue(((Map<String, TestService>) singletonMutex)
        .containsKey("com.symphony.bdk.core.extension.TestExtensionApiClientFactoryAware.TestService"));
    assertArrayEquals(new String[]{"com.symphony.bdk.core.extension.TestExtensionApiClientFactoryAware.TestService"},
        beanFactory.getSingletonNames());
  }

  /**
   * Test {@link BdkExtensionConfig#bdkExtensionServices(List, ConfigurableListableBeanFactory)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkExtensionConfig#bdkExtensionServices(List, ConfigurableListableBeanFactory)}
   */
  @Test
  @DisplayName("Test bdkExtensionServices(List, ConfigurableListableBeanFactory); when ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List BdkExtensionConfig.bdkExtensionServices(List, ConfigurableListableBeanFactory)"})
  void testBdkExtensionServices_whenArrayList() {
    // Arrange
    BdkExtensionConfig bdkExtensionConfig = new BdkExtensionConfig();
    ArrayList<BdkExtension> extensions = new ArrayList<>();
    DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

    // Act
    List<BdkExtensionService> actualBdkExtensionServicesResult = bdkExtensionConfig.bdkExtensionServices(extensions,
        beanFactory);

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
