package com.symphony.bdk.core.config.model;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkAgentConfigDiffblueTest {
  /**
   * Test {@link BdkAgentConfig#BdkAgentConfig(BdkConfig)}.
   *
   * <ul>
   *   <li>Then return ParentConfig is {@link BdkConfig} (default constructor).
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BdkAgentConfig#BdkAgentConfig(BdkConfig)}
   *   <li>{@link BdkAgentConfig#BdkAgentConfig()}
   * </ul>
   */
  @Test
  @DisplayName(
      "Test new BdkAgentConfig(BdkConfig); then return ParentConfig is BdkConfig (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BdkAgentConfig.<init>()", "void BdkAgentConfig.<init>(BdkConfig)"})
  void testNewBdkAgentConfig_thenReturnParentConfigIsBdkConfig()
      throws UnsupportedEncodingException {
    // Arrange
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

    BdkConfig parentConfig = new BdkConfig();
    parentConfig.setAgent(new BdkAgentConfig());
    parentConfig.setApp(app);
    parentConfig.setBot(bot);
    parentConfig.setCommonJwt(commonJwt);
    parentConfig.setConnectionPoolMax(1);
    parentConfig.setConnectionPoolPerRoute(1);
    parentConfig.setConnectionTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    BdkProxyConfig proxy = new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou");
    parentConfig.setProxy(proxy);
    parentConfig.setReadTimeout(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS);
    parentConfig.setRetry(new BdkRetryConfig());
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    // Act
    BdkAgentConfig actualBdkAgentConfig = new BdkAgentConfig(parentConfig);

    // Assert
    assertNull(actualBdkAgentConfig.getLoadBalancing());
    assertSame(parentConfig, actualBdkAgentConfig.getParentConfig());
  }

  /**
   * Test {@link BdkAgentConfig#BdkAgentConfig()}.
   *
   * <ul>
   *   <li>Then return ParentConfig is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkAgentConfig#BdkAgentConfig()}
   */
  @Test
  @DisplayName("Test new BdkAgentConfig(); then return ParentConfig is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BdkAgentConfig.<init>()", "void BdkAgentConfig.<init>(BdkConfig)"})
  void testNewBdkAgentConfig_thenReturnParentConfigIsNull() {
    // Arrange and Act
    BdkAgentConfig actualBdkAgentConfig = new BdkAgentConfig();

    // Assert
    assertNull(actualBdkAgentConfig.getParentConfig());
    assertNull(actualBdkAgentConfig.getLoadBalancing());
  }
}
