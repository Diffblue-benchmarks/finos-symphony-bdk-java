package com.symphony.bdk.core.config.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkAgentConfigDiffblueTest {
  /**
   * Test getters and setters.
   * <ul>
   *   <li>Then return {@code Context}.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BdkAgentConfig#BdkAgentConfig(BdkConfig)}
   *   <li>{@link BdkAgentConfig#BdkAgentConfig()}
   *   <li>{@link BdkAgentConfig#setLoadBalancing(BdkLoadBalancingConfig)}
   *   <li>{@link BdkAgentConfig#getLoadBalancing()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters; then return 'Context'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BdkAgentConfig.<init>()", "void BdkAgentConfig.<init>(BdkConfig)",
      "BdkLoadBalancingConfig BdkAgentConfig.getLoadBalancing()",
      "void BdkAgentConfig.setLoadBalancing(BdkLoadBalancingConfig)"})
  void testGettersAndSetters_thenReturnContext() throws UnsupportedEncodingException {
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
    BdkLoadBalancingConfig loadBalancing = new BdkLoadBalancingConfig();
    loadBalancing.setMode(BdkLoadBalancingMode.EXTERNAL);
    loadBalancing.setNodes(new ArrayList<>());
    loadBalancing.setStickiness(true);
    actualBdkAgentConfig.setLoadBalancing(loadBalancing);
    BdkLoadBalancingConfig actualLoadBalancing = actualBdkAgentConfig.getLoadBalancing();

    // Assert
    assertEquals("Context", actualBdkAgentConfig.getContext());
    assertEquals("Scheme", actualBdkAgentConfig.getScheme());
    Map<String, String> defaultHeaders2 = actualBdkAgentConfig.getDefaultHeaders();
    assertEquals(1, defaultHeaders2.size());
    assertEquals("alice.liddell@example.org", defaultHeaders2.get("Delivered-To"));
    assertEquals("localhost", actualBdkAgentConfig.getHost());
    assertEquals(1, actualBdkAgentConfig.getConnectionPoolMax().intValue());
    assertEquals(1, actualBdkAgentConfig.getConnectionPoolPerRoute().intValue());
    assertEquals(8080, actualBdkAgentConfig.getPort().intValue());
    assertEquals(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS, actualBdkAgentConfig.getConnectionTimeout().intValue());
    assertEquals(BdkRetryConfig.DEFAULT_MAX_ATTEMPTS, actualBdkAgentConfig.getReadTimeout().intValue());
    assertSame(parentConfig, actualBdkAgentConfig.getParentConfig());
    assertSame(loadBalancing, actualLoadBalancing);
    assertSame(proxy, actualBdkAgentConfig.getProxy());
    assertSame(defaultHeaders, defaultHeaders2);
  }

  /**
   * Test getters and setters.
   * <ul>
   *   <li>Then return ParentConfig is {@code null}.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BdkAgentConfig#BdkAgentConfig()}
   *   <li>{@link BdkAgentConfig#setLoadBalancing(BdkLoadBalancingConfig)}
   *   <li>{@link BdkAgentConfig#getLoadBalancing()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters; then return ParentConfig is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BdkAgentConfig.<init>()", "void BdkAgentConfig.<init>(BdkConfig)",
      "BdkLoadBalancingConfig BdkAgentConfig.getLoadBalancing()",
      "void BdkAgentConfig.setLoadBalancing(BdkLoadBalancingConfig)"})
  void testGettersAndSetters_thenReturnParentConfigIsNull() {
    // Arrange and Act
    BdkAgentConfig actualBdkAgentConfig = new BdkAgentConfig();
    BdkLoadBalancingConfig loadBalancing = new BdkLoadBalancingConfig();
    loadBalancing.setMode(BdkLoadBalancingMode.EXTERNAL);
    loadBalancing.setNodes(new ArrayList<>());
    loadBalancing.setStickiness(true);
    actualBdkAgentConfig.setLoadBalancing(loadBalancing);
    BdkLoadBalancingConfig actualLoadBalancing = actualBdkAgentConfig.getLoadBalancing();

    // Assert
    assertNull(actualBdkAgentConfig.getParentConfig());
    assertSame(loadBalancing, actualLoadBalancing);
  }
}
