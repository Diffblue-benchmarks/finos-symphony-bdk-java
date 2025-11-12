package com.symphony.bdk.core.service.datafeed.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.AuthSession;
import com.symphony.bdk.core.auth.impl.AuthSessionImpl;
import com.symphony.bdk.core.auth.impl.BotAuthenticatorCertImpl;
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
import com.symphony.bdk.core.service.datafeed.exception.NestedRetryException;
import com.symphony.bdk.core.service.version.AgentVersionService;
import com.symphony.bdk.core.test.BdkRetryConfigTestHelper;
import com.symphony.bdk.gen.api.DatafeedApi;
import com.symphony.bdk.gen.api.model.UserV2;
import com.symphony.bdk.http.api.ApiClient;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import jakarta.ws.rs.client.Client;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DatafeedLoopV2DiffblueTest {
  /**
   * Test {@link DatafeedLoopV2#DatafeedLoopV2(DatafeedApi, AuthSession, BdkConfig, UserV2)}.
   *
   * <p>Method under test: {@link DatafeedLoopV2#DatafeedLoopV2(DatafeedApi, AuthSession, BdkConfig,
   * UserV2)}
   */
  @Test
  @DisplayName("Test new DatafeedLoopV2(DatafeedApi, AuthSession, BdkConfig, UserV2)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DatafeedLoopV2.<init>(DatafeedApi, AuthSession, BdkConfig, UserV2)"})
  void testNewDatafeedLoopV2() {
    // Arrange
    DatafeedApi datafeedApi = mock(DatafeedApi.class);
    NestedRetryException nestedRetryException =
        new NestedRetryException("An error occurred", new Throwable());
    when(datafeedApi.getApiClient()).thenThrow(nestedRetryException);

    // Act and Assert
    assertThrows(
        NestedRetryException.class,
        () ->
            new DatafeedLoopV2(
                datafeedApi, mock(AuthSession.class), mock(BdkConfig.class), mock(UserV2.class)));
    verify(datafeedApi).getApiClient();
  }

  /**
   * Test {@link DatafeedLoopV2#DatafeedLoopV2(DatafeedApi, AuthSession, BdkConfig, UserV2)}.
   *
   * <ul>
   *   <li>Given {@code Delivered-To}.
   *   <li>Then {@link AbstractDatafeedLoop#authSession} return {@link AuthSessionImpl}.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedLoopV2#DatafeedLoopV2(DatafeedApi, AuthSession, BdkConfig,
   * UserV2)}
   */
  @Test
  @DisplayName(
      "Test new DatafeedLoopV2(DatafeedApi, AuthSession, BdkConfig, UserV2); given 'Delivered-To'; then authSession return AuthSessionImpl")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DatafeedLoopV2.<init>(DatafeedApi, AuthSession, BdkConfig, UserV2)"})
  void testNewDatafeedLoopV2_givenDeliveredTo_thenAuthSessionReturnAuthSessionImpl()
      throws UnsupportedEncodingException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");
    DatafeedApi datafeedApi = new DatafeedApi(apiClient);
    BotAuthenticatorCertImpl authenticator =
        new BotAuthenticatorCertImpl(
            mock(BdkRetryConfig.class),
            "janedoe",
            mock(BdkCommonJwtConfig.class),
            mock(ApiClient.class),
            mock(ApiClient.class),
            mock(ApiClient.class),
            mock(AgentVersionService.class));
    AuthSessionImpl authSession = new AuthSessionImpl(authenticator);

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

    HashMap<String, String> defaultHeaders2 = new HashMap<>();
    defaultHeaders2.put("Delivered-To", "alice.liddell@example.org");

    BdkSslConfig ssl = new BdkSslConfig();
    ssl.setTrustStore(new BdkCertificateConfig());
    ssl.setTrustStorePassword("iloveyou");
    ssl.setTrustStorePath("Trust Store Path");

    BdkDatafeedConfig datafeed = new BdkDatafeedConfig();
    datafeed.setIdFilePath("/directory/foo.txt");
    datafeed.setVersion("1.0.2");
    datafeed.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));

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
    config.setDefaultHeaders(defaultHeaders2);
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
    DatafeedLoopV2 actualDatafeedLoopV2 =
        new DatafeedLoopV2(datafeedApi, authSession, config, new UserV2());

    // Assert
    assertTrue(actualDatafeedLoopV2.authSession instanceof AuthSessionImpl);
  }

  /**
   * Test {@link DatafeedLoopV2#DatafeedLoopV2(DatafeedApi, AuthSession, BdkConfig, UserV2)}.
   *
   * <ul>
   *   <li>Then return AckId is empty string.
   * </ul>
   *
   * <p>Method under test: {@link DatafeedLoopV2#DatafeedLoopV2(DatafeedApi, AuthSession, BdkConfig,
   * UserV2)}
   */
  @Test
  @DisplayName(
      "Test new DatafeedLoopV2(DatafeedApi, AuthSession, BdkConfig, UserV2); then return AckId is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DatafeedLoopV2.<init>(DatafeedApi, AuthSession, BdkConfig, UserV2)"})
  void testNewDatafeedLoopV2_thenReturnAckIdIsEmptyString() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    DatafeedApi datafeedApi = mock(DatafeedApi.class);
    when(datafeedApi.getApiClient()).thenReturn(apiClientJersey2);
    AuthSession authSession = mock(AuthSession.class);

    BdkConfig config = mock(BdkConfig.class);
    when(config.getDatafeedRetryConfig()).thenReturn(BdkRetryConfigTestHelper.ofMinimalInterval(3));

    // Act
    DatafeedLoopV2 actualDatafeedLoopV2 =
        new DatafeedLoopV2(datafeedApi, authSession, config, mock(UserV2.class));

    // Assert
    verify(config).getDatafeedRetryConfig();
    verify(datafeedApi).getApiClient();
    assertEquals("", actualDatafeedLoopV2.getAckId());
    assertEquals(0L, actualDatafeedLoopV2.lastPullTimestamp());
    AtomicBoolean atomicBoolean = actualDatafeedLoopV2.started;
    assertFalse(atomicBoolean.get());
    assertFalse(atomicBoolean.getAcquire());
    assertFalse(atomicBoolean.getOpaque());
    assertFalse(atomicBoolean.getPlain());
  }

  /**
   * Test {@link DatafeedLoopV2#DatafeedLoopV2(DatafeedApi, AuthSession, BdkConfig, UserV2)}.
   *
   * <p>Method under test: {@link DatafeedLoopV2#DatafeedLoopV2(DatafeedApi, AuthSession, BdkConfig,
   * UserV2)}
   */
  @Test
  @DisplayName("Test new DatafeedLoopV2(DatafeedApi, AuthSession, BdkConfig, UserV2)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DatafeedLoopV2.<init>(DatafeedApi, AuthSession, BdkConfig, UserV2)"})
  void testNewDatafeedLoopV22() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientJersey2 apiClientJersey2 =
        new ApiClientJersey2(
            mock(Client.class),
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    DatafeedApi datafeedApi = mock(DatafeedApi.class);
    when(datafeedApi.getApiClient()).thenReturn(apiClientJersey2);
    AuthSession authSession = mock(AuthSession.class);

    BdkConfig config = mock(BdkConfig.class);
    NestedRetryException nestedRetryException =
        new NestedRetryException("An error occurred", new Throwable());
    when(config.getDatafeedRetryConfig()).thenThrow(nestedRetryException);

    // Act and Assert
    assertThrows(
        NestedRetryException.class,
        () -> new DatafeedLoopV2(datafeedApi, authSession, config, mock(UserV2.class)));
    verify(config).getDatafeedRetryConfig();
    verify(datafeedApi).getApiClient();
  }
}
