package com.symphony.bdk.core.client;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.client.ApiClientFactory.ServiceEnum;
import com.symphony.bdk.core.client.exception.ApiClientInitializationException;
import com.symphony.bdk.core.config.model.BdkAgentConfig;
import com.symphony.bdk.core.config.model.BdkAuthenticationConfig;
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
import com.symphony.bdk.http.api.ApiClient;
import com.symphony.bdk.http.api.ApiClientBuilder;
import com.symphony.bdk.http.api.ApiClientBuilderProvider;
import com.symphony.bdk.http.jersey2.ApiClientBuilderJersey2;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ApiClientFactoryDiffblueTest {
  /**
   * Test {@link ApiClientFactory#getLoginClient()}.
   * <p>
   * Method under test: {@link ApiClientFactory#getLoginClient()}
   */
  @Test
  @DisplayName("Test getLoginClient()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getLoginClient()"})
  void testGetLoginClient() {
    // Arrange
    BdkConfig config = new BdkConfig();
    config.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    when(apiClientBuilderProvider.newInstance()).thenReturn(new ApiClientBuilderJersey2());

    // Act
    ApiClient actualLoginClient = (new ApiClientFactory(config, apiClientBuilderProvider)).getLoginClient();

    // Assert
    verify(apiClientBuilderProvider).newInstance();
    assertTrue(actualLoginClient instanceof ApiClientJersey2);
    assertEquals("https://null:443/login", actualLoginClient.getBasePath());
    assertTrue(actualLoginClient.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#getLoginClient()}.
   * <ul>
   *   <li>Given {@link ApiClientFactory#ApiClientFactory(BdkConfig)} with config is {@link BdkConfig} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getLoginClient()}
   */
  @Test
  @DisplayName("Test getLoginClient(); given ApiClientFactory(BdkConfig) with config is BdkConfig (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getLoginClient()"})
  void testGetLoginClient_givenApiClientFactoryWithConfigIsBdkConfig() {
    // Arrange and Act
    ApiClient actualLoginClient = (new ApiClientFactory(new BdkConfig())).getLoginClient();

    // Assert
    assertTrue(actualLoginClient instanceof ApiClientJersey2);
    assertEquals("https://null:443/login", actualLoginClient.getBasePath());
    assertTrue(actualLoginClient.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#getLoginClient()}.
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code Delivered-To} is {@code alice.liddell@example.org}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getLoginClient()}
   */
  @Test
  @DisplayName("Test getLoginClient(); given HashMap() 'Delivered-To' is 'alice.liddell@example.org'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getLoginClient()"})
  void testGetLoginClient_givenHashMapDeliveredToIsAliceLiddellExampleOrg() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkConfig config = new BdkConfig();
    config.setDefaultHeaders(defaultHeaders);
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    when(apiClientBuilderProvider.newInstance()).thenReturn(new ApiClientBuilderJersey2());

    // Act
    ApiClient actualLoginClient = (new ApiClientFactory(config, apiClientBuilderProvider)).getLoginClient();

    // Assert
    verify(apiClientBuilderProvider).newInstance();
    assertTrue(actualLoginClient instanceof ApiClientJersey2);
    assertEquals("https://null:443/login", actualLoginClient.getBasePath());
    assertTrue(actualLoginClient.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#getLoginClient()}.
   * <ul>
   *   <li>Then throw {@link ApiClientInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getLoginClient()}
   */
  @Test
  @DisplayName("Test getLoginClient(); then throw ApiClientInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getLoginClient()"})
  void testGetLoginClient_thenThrowApiClientInitializationException() {
    // Arrange
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    when(apiClientBuilderProvider.newInstance()).thenThrow(new ApiClientInitializationException("An error occurred"));

    // Act and Assert
    assertThrows(ApiClientInitializationException.class,
        () -> (new ApiClientFactory(new BdkConfig(), apiClientBuilderProvider)).getLoginClient());
    verify(apiClientBuilderProvider).newInstance();
  }

  /**
   * Test {@link ApiClientFactory#getPodClient()}.
   * <p>
   * Method under test: {@link ApiClientFactory#getPodClient()}
   */
  @Test
  @DisplayName("Test getPodClient()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getPodClient()"})
  void testGetPodClient() {
    // Arrange
    BdkConfig config = new BdkConfig();
    config.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    when(apiClientBuilderProvider.newInstance()).thenReturn(new ApiClientBuilderJersey2());

    // Act
    ApiClient actualPodClient = (new ApiClientFactory(config, apiClientBuilderProvider)).getPodClient();

    // Assert
    verify(apiClientBuilderProvider).newInstance();
    assertTrue(actualPodClient instanceof ApiClientJersey2);
    assertEquals("https://null:443/pod", actualPodClient.getBasePath());
    assertTrue(actualPodClient.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#getPodClient(String)} with {@code String}.
   * <p>
   * Method under test: {@link ApiClientFactory#getPodClient(String)}
   */
  @Test
  @DisplayName("Test getPodClient(String) with 'String'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getPodClient(String)"})
  void testGetPodClientWithString() {
    // Arrange
    BdkConfig config = new BdkConfig();
    config.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    when(apiClientBuilderProvider.newInstance()).thenReturn(new ApiClientBuilderJersey2());

    // Act
    ApiClient actualPodClient = (new ApiClientFactory(config, apiClientBuilderProvider)).getPodClient("Context Path");

    // Assert
    verify(apiClientBuilderProvider).newInstance();
    assertTrue(actualPodClient instanceof ApiClientJersey2);
    assertEquals("https://null:443Context Path", actualPodClient.getBasePath());
    assertTrue(actualPodClient.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#getPodClient(String)} with {@code String}.
   * <ul>
   *   <li>Given {@link ApiClientFactory#ApiClientFactory(BdkConfig)} with config is {@link BdkConfig} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getPodClient(String)}
   */
  @Test
  @DisplayName("Test getPodClient(String) with 'String'; given ApiClientFactory(BdkConfig) with config is BdkConfig (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getPodClient(String)"})
  void testGetPodClientWithString_givenApiClientFactoryWithConfigIsBdkConfig() {
    // Arrange and Act
    ApiClient actualPodClient = (new ApiClientFactory(new BdkConfig())).getPodClient("Context Path");

    // Assert
    assertTrue(actualPodClient instanceof ApiClientJersey2);
    assertEquals("https://null:443Context Path", actualPodClient.getBasePath());
    assertTrue(actualPodClient.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#getPodClient(String)} with {@code String}.
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code Delivered-To} is {@code alice.liddell@example.org}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getPodClient(String)}
   */
  @Test
  @DisplayName("Test getPodClient(String) with 'String'; given HashMap() 'Delivered-To' is 'alice.liddell@example.org'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getPodClient(String)"})
  void testGetPodClientWithString_givenHashMapDeliveredToIsAliceLiddellExampleOrg() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkConfig config = new BdkConfig();
    config.setDefaultHeaders(defaultHeaders);
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    when(apiClientBuilderProvider.newInstance()).thenReturn(new ApiClientBuilderJersey2());

    // Act
    ApiClient actualPodClient = (new ApiClientFactory(config, apiClientBuilderProvider)).getPodClient("Context Path");

    // Assert
    verify(apiClientBuilderProvider).newInstance();
    assertTrue(actualPodClient instanceof ApiClientJersey2);
    assertEquals("https://null:443Context Path", actualPodClient.getBasePath());
    assertTrue(actualPodClient.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#getPodClient(String)} with {@code String}.
   * <ul>
   *   <li>Then throw {@link ApiClientInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getPodClient(String)}
   */
  @Test
  @DisplayName("Test getPodClient(String) with 'String'; then throw ApiClientInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getPodClient(String)"})
  void testGetPodClientWithString_thenThrowApiClientInitializationException() {
    // Arrange
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    when(apiClientBuilderProvider.newInstance()).thenThrow(new ApiClientInitializationException("An error occurred"));

    // Act and Assert
    assertThrows(ApiClientInitializationException.class,
        () -> (new ApiClientFactory(new BdkConfig(), apiClientBuilderProvider)).getPodClient("Context Path"));
    verify(apiClientBuilderProvider).newInstance();
  }

  /**
   * Test {@link ApiClientFactory#getPodClient()}.
   * <ul>
   *   <li>Given {@link ApiClientFactory#ApiClientFactory(BdkConfig)} with config is {@link BdkConfig} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getPodClient()}
   */
  @Test
  @DisplayName("Test getPodClient(); given ApiClientFactory(BdkConfig) with config is BdkConfig (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getPodClient()"})
  void testGetPodClient_givenApiClientFactoryWithConfigIsBdkConfig() {
    // Arrange and Act
    ApiClient actualPodClient = (new ApiClientFactory(new BdkConfig())).getPodClient();

    // Assert
    assertTrue(actualPodClient instanceof ApiClientJersey2);
    assertEquals("https://null:443/pod", actualPodClient.getBasePath());
    assertTrue(actualPodClient.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#getPodClient()}.
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code Delivered-To} is {@code alice.liddell@example.org}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getPodClient()}
   */
  @Test
  @DisplayName("Test getPodClient(); given HashMap() 'Delivered-To' is 'alice.liddell@example.org'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getPodClient()"})
  void testGetPodClient_givenHashMapDeliveredToIsAliceLiddellExampleOrg() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkConfig config = new BdkConfig();
    config.setDefaultHeaders(defaultHeaders);
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    when(apiClientBuilderProvider.newInstance()).thenReturn(new ApiClientBuilderJersey2());

    // Act
    ApiClient actualPodClient = (new ApiClientFactory(config, apiClientBuilderProvider)).getPodClient();

    // Assert
    verify(apiClientBuilderProvider).newInstance();
    assertTrue(actualPodClient instanceof ApiClientJersey2);
    assertEquals("https://null:443/pod", actualPodClient.getBasePath());
    assertTrue(actualPodClient.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#getRelayClient()}.
   * <p>
   * Method under test: {@link ApiClientFactory#getRelayClient()}
   */
  @Test
  @DisplayName("Test getRelayClient()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getRelayClient()"})
  void testGetRelayClient() {
    // Arrange
    BdkConfig config = new BdkConfig();
    config.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    when(apiClientBuilderProvider.newInstance()).thenReturn(new ApiClientBuilderJersey2());

    // Act
    ApiClient actualRelayClient = (new ApiClientFactory(config, apiClientBuilderProvider)).getRelayClient();

    // Assert
    verify(apiClientBuilderProvider).newInstance();
    assertTrue(actualRelayClient instanceof ApiClientJersey2);
    assertEquals("https://null:443/relay", actualRelayClient.getBasePath());
    assertTrue(actualRelayClient.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#getRelayClient()}.
   * <ul>
   *   <li>Given {@link ApiClientFactory#ApiClientFactory(BdkConfig)} with config is {@link BdkConfig} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getRelayClient()}
   */
  @Test
  @DisplayName("Test getRelayClient(); given ApiClientFactory(BdkConfig) with config is BdkConfig (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getRelayClient()"})
  void testGetRelayClient_givenApiClientFactoryWithConfigIsBdkConfig() {
    // Arrange and Act
    ApiClient actualRelayClient = (new ApiClientFactory(new BdkConfig())).getRelayClient();

    // Assert
    assertTrue(actualRelayClient instanceof ApiClientJersey2);
    assertEquals("https://null:443/relay", actualRelayClient.getBasePath());
    assertTrue(actualRelayClient.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#getRelayClient()}.
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code Delivered-To} is {@code alice.liddell@example.org}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getRelayClient()}
   */
  @Test
  @DisplayName("Test getRelayClient(); given HashMap() 'Delivered-To' is 'alice.liddell@example.org'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getRelayClient()"})
  void testGetRelayClient_givenHashMapDeliveredToIsAliceLiddellExampleOrg() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkConfig config = new BdkConfig();
    config.setDefaultHeaders(defaultHeaders);
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    when(apiClientBuilderProvider.newInstance()).thenReturn(new ApiClientBuilderJersey2());

    // Act
    ApiClient actualRelayClient = (new ApiClientFactory(config, apiClientBuilderProvider)).getRelayClient();

    // Assert
    verify(apiClientBuilderProvider).newInstance();
    assertTrue(actualRelayClient instanceof ApiClientJersey2);
    assertEquals("https://null:443/relay", actualRelayClient.getBasePath());
    assertTrue(actualRelayClient.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#getRelayClient()}.
   * <ul>
   *   <li>Then throw {@link ApiClientInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getRelayClient()}
   */
  @Test
  @DisplayName("Test getRelayClient(); then throw ApiClientInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getRelayClient()"})
  void testGetRelayClient_thenThrowApiClientInitializationException() {
    // Arrange
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    when(apiClientBuilderProvider.newInstance()).thenThrow(new ApiClientInitializationException("An error occurred"));

    // Act and Assert
    assertThrows(ApiClientInitializationException.class,
        () -> (new ApiClientFactory(new BdkConfig(), apiClientBuilderProvider)).getRelayClient());
    verify(apiClientBuilderProvider).newInstance();
  }

  /**
   * Test {@link ApiClientFactory#getAgentClient()}.
   * <p>
   * Method under test: {@link ApiClientFactory#getAgentClient()}
   */
  @Test
  @DisplayName("Test getAgentClient()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getAgentClient()"})
  void testGetAgentClient() {
    // Arrange
    BdkConfig config = new BdkConfig();
    config.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    when(apiClientBuilderProvider.newInstance()).thenReturn(new ApiClientBuilderJersey2());

    // Act
    ApiClient actualAgentClient = (new ApiClientFactory(config, apiClientBuilderProvider)).getAgentClient();

    // Assert
    verify(apiClientBuilderProvider).newInstance();
    assertTrue(actualAgentClient instanceof ApiClientJersey2);
    assertEquals("https://null:443/agent", actualAgentClient.getBasePath());
    assertTrue(actualAgentClient.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#getAgentClient()}.
   * <ul>
   *   <li>Given {@link ApiClientFactory#ApiClientFactory(BdkConfig)} with config is {@link BdkConfig} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getAgentClient()}
   */
  @Test
  @DisplayName("Test getAgentClient(); given ApiClientFactory(BdkConfig) with config is BdkConfig (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getAgentClient()"})
  void testGetAgentClient_givenApiClientFactoryWithConfigIsBdkConfig() {
    // Arrange and Act
    ApiClient actualAgentClient = (new ApiClientFactory(new BdkConfig())).getAgentClient();

    // Assert
    assertTrue(actualAgentClient instanceof ApiClientJersey2);
    assertEquals("https://null:443/agent", actualAgentClient.getBasePath());
    assertTrue(actualAgentClient.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#getAgentClient()}.
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code Delivered-To} is {@code alice.liddell@example.org}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getAgentClient()}
   */
  @Test
  @DisplayName("Test getAgentClient(); given HashMap() 'Delivered-To' is 'alice.liddell@example.org'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getAgentClient()"})
  void testGetAgentClient_givenHashMapDeliveredToIsAliceLiddellExampleOrg() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkConfig config = new BdkConfig();
    config.setDefaultHeaders(defaultHeaders);
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    when(apiClientBuilderProvider.newInstance()).thenReturn(new ApiClientBuilderJersey2());

    // Act
    ApiClient actualAgentClient = (new ApiClientFactory(config, apiClientBuilderProvider)).getAgentClient();

    // Assert
    verify(apiClientBuilderProvider).newInstance();
    assertTrue(actualAgentClient instanceof ApiClientJersey2);
    assertEquals("https://null:443/agent", actualAgentClient.getBasePath());
    assertTrue(actualAgentClient.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#getAgentClient()}.
   * <ul>
   *   <li>Then throw {@link ApiClientInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getAgentClient()}
   */
  @Test
  @DisplayName("Test getAgentClient(); then throw ApiClientInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getAgentClient()"})
  void testGetAgentClient_thenThrowApiClientInitializationException() {
    // Arrange
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    when(apiClientBuilderProvider.newInstance()).thenThrow(new ApiClientInitializationException("An error occurred"));

    // Act and Assert
    assertThrows(ApiClientInitializationException.class,
        () -> (new ApiClientFactory(new BdkConfig(), apiClientBuilderProvider)).getAgentClient());
    verify(apiClientBuilderProvider).newInstance();
  }

  /**
   * Test {@link ApiClientFactory#getDatafeedAgentClient()}.
   * <p>
   * Method under test: {@link ApiClientFactory#getDatafeedAgentClient()}
   */
  @Test
  @DisplayName("Test getDatafeedAgentClient()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getDatafeedAgentClient()"})
  void testGetDatafeedAgentClient() {
    // Arrange
    BdkConfig config = new BdkConfig();
    config.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    when(apiClientBuilderProvider.newInstance()).thenReturn(new ApiClientBuilderJersey2());

    // Act
    ApiClient actualDatafeedAgentClient = (new ApiClientFactory(config, apiClientBuilderProvider))
        .getDatafeedAgentClient();

    // Assert
    verify(apiClientBuilderProvider).newInstance();
    assertTrue(actualDatafeedAgentClient instanceof ApiClientJersey2);
    assertEquals("https://null:443/agent", actualDatafeedAgentClient.getBasePath());
    assertTrue(actualDatafeedAgentClient.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#getDatafeedAgentClient()}.
   * <ul>
   *   <li>Given {@link ApiClientFactory#ApiClientFactory(BdkConfig)} with config is {@link BdkConfig} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getDatafeedAgentClient()}
   */
  @Test
  @DisplayName("Test getDatafeedAgentClient(); given ApiClientFactory(BdkConfig) with config is BdkConfig (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getDatafeedAgentClient()"})
  void testGetDatafeedAgentClient_givenApiClientFactoryWithConfigIsBdkConfig() {
    // Arrange and Act
    ApiClient actualDatafeedAgentClient = (new ApiClientFactory(new BdkConfig())).getDatafeedAgentClient();

    // Assert
    assertTrue(actualDatafeedAgentClient instanceof ApiClientJersey2);
    assertEquals("https://null:443/agent", actualDatafeedAgentClient.getBasePath());
    assertTrue(actualDatafeedAgentClient.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#getDatafeedAgentClient()}.
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code Delivered-To} is {@code alice.liddell@example.org}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getDatafeedAgentClient()}
   */
  @Test
  @DisplayName("Test getDatafeedAgentClient(); given HashMap() 'Delivered-To' is 'alice.liddell@example.org'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getDatafeedAgentClient()"})
  void testGetDatafeedAgentClient_givenHashMapDeliveredToIsAliceLiddellExampleOrg() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkConfig config = new BdkConfig();
    config.setDefaultHeaders(defaultHeaders);
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    when(apiClientBuilderProvider.newInstance()).thenReturn(new ApiClientBuilderJersey2());

    // Act
    ApiClient actualDatafeedAgentClient = (new ApiClientFactory(config, apiClientBuilderProvider))
        .getDatafeedAgentClient();

    // Assert
    verify(apiClientBuilderProvider).newInstance();
    assertTrue(actualDatafeedAgentClient instanceof ApiClientJersey2);
    assertEquals("https://null:443/agent", actualDatafeedAgentClient.getBasePath());
    assertTrue(actualDatafeedAgentClient.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#getDatafeedAgentClient()}.
   * <ul>
   *   <li>Then throw {@link ApiClientInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getDatafeedAgentClient()}
   */
  @Test
  @DisplayName("Test getDatafeedAgentClient(); then throw ApiClientInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getDatafeedAgentClient()"})
  void testGetDatafeedAgentClient_thenThrowApiClientInitializationException() {
    // Arrange
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    when(apiClientBuilderProvider.newInstance()).thenThrow(new ApiClientInitializationException("An error occurred"));

    // Act and Assert
    assertThrows(ApiClientInitializationException.class,
        () -> (new ApiClientFactory(new BdkConfig(), apiClientBuilderProvider)).getDatafeedAgentClient());
    verify(apiClientBuilderProvider).newInstance();
  }

  /**
   * Test {@link ApiClientFactory#getDatahoseAgentClient()}.
   * <p>
   * Method under test: {@link ApiClientFactory#getDatahoseAgentClient()}
   */
  @Test
  @DisplayName("Test getDatahoseAgentClient()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getDatahoseAgentClient()"})
  void testGetDatahoseAgentClient() {
    // Arrange
    BdkConfig config = new BdkConfig();
    config.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    when(apiClientBuilderProvider.newInstance()).thenReturn(new ApiClientBuilderJersey2());

    // Act
    ApiClient actualDatahoseAgentClient = (new ApiClientFactory(config, apiClientBuilderProvider))
        .getDatahoseAgentClient();

    // Assert
    verify(apiClientBuilderProvider).newInstance();
    assertTrue(actualDatahoseAgentClient instanceof ApiClientJersey2);
    assertEquals("https://null:443/agent", actualDatahoseAgentClient.getBasePath());
    assertTrue(actualDatahoseAgentClient.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#getDatahoseAgentClient()}.
   * <ul>
   *   <li>Given {@link ApiClientFactory#ApiClientFactory(BdkConfig)} with config is {@link BdkConfig} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getDatahoseAgentClient()}
   */
  @Test
  @DisplayName("Test getDatahoseAgentClient(); given ApiClientFactory(BdkConfig) with config is BdkConfig (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getDatahoseAgentClient()"})
  void testGetDatahoseAgentClient_givenApiClientFactoryWithConfigIsBdkConfig() {
    // Arrange and Act
    ApiClient actualDatahoseAgentClient = (new ApiClientFactory(new BdkConfig())).getDatahoseAgentClient();

    // Assert
    assertTrue(actualDatahoseAgentClient instanceof ApiClientJersey2);
    assertEquals("https://null:443/agent", actualDatahoseAgentClient.getBasePath());
    assertTrue(actualDatahoseAgentClient.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#getDatahoseAgentClient()}.
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code Delivered-To} is {@code alice.liddell@example.org}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getDatahoseAgentClient()}
   */
  @Test
  @DisplayName("Test getDatahoseAgentClient(); given HashMap() 'Delivered-To' is 'alice.liddell@example.org'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getDatahoseAgentClient()"})
  void testGetDatahoseAgentClient_givenHashMapDeliveredToIsAliceLiddellExampleOrg() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkConfig config = new BdkConfig();
    config.setDefaultHeaders(defaultHeaders);
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    when(apiClientBuilderProvider.newInstance()).thenReturn(new ApiClientBuilderJersey2());

    // Act
    ApiClient actualDatahoseAgentClient = (new ApiClientFactory(config, apiClientBuilderProvider))
        .getDatahoseAgentClient();

    // Assert
    verify(apiClientBuilderProvider).newInstance();
    assertTrue(actualDatahoseAgentClient instanceof ApiClientJersey2);
    assertEquals("https://null:443/agent", actualDatahoseAgentClient.getBasePath());
    assertTrue(actualDatahoseAgentClient.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#getDatahoseAgentClient()}.
   * <ul>
   *   <li>Then throw {@link ApiClientInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getDatahoseAgentClient()}
   */
  @Test
  @DisplayName("Test getDatahoseAgentClient(); then throw ApiClientInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getDatahoseAgentClient()"})
  void testGetDatahoseAgentClient_thenThrowApiClientInitializationException() {
    // Arrange
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    when(apiClientBuilderProvider.newInstance()).thenThrow(new ApiClientInitializationException("An error occurred"));

    // Act and Assert
    assertThrows(ApiClientInitializationException.class,
        () -> (new ApiClientFactory(new BdkConfig(), apiClientBuilderProvider)).getDatahoseAgentClient());
    verify(apiClientBuilderProvider).newInstance();
  }

  /**
   * Test {@link ApiClientFactory#getRegularAgentClient()}.
   * <p>
   * Method under test: {@link ApiClientFactory#getRegularAgentClient()}
   */
  @Test
  @DisplayName("Test getRegularAgentClient()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getRegularAgentClient()"})
  void testGetRegularAgentClient() {
    // Arrange
    BdkConfig config = new BdkConfig();
    config.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    when(apiClientBuilderProvider.newInstance()).thenReturn(new ApiClientBuilderJersey2());

    // Act
    ApiClient actualRegularAgentClient = (new ApiClientFactory(config, apiClientBuilderProvider))
        .getRegularAgentClient();

    // Assert
    verify(apiClientBuilderProvider).newInstance();
    assertTrue(actualRegularAgentClient instanceof ApiClientJersey2);
    assertEquals("https://null:443/agent", actualRegularAgentClient.getBasePath());
    assertTrue(actualRegularAgentClient.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#getRegularAgentClient(String)} with {@code String}.
   * <p>
   * Method under test: {@link ApiClientFactory#getRegularAgentClient(String)}
   */
  @Test
  @DisplayName("Test getRegularAgentClient(String) with 'String'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getRegularAgentClient(String)"})
  void testGetRegularAgentClientWithString() {
    // Arrange
    BdkConfig config = new BdkConfig();
    config.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    when(apiClientBuilderProvider.newInstance()).thenReturn(new ApiClientBuilderJersey2());

    // Act
    ApiClient actualRegularAgentClient = (new ApiClientFactory(config, apiClientBuilderProvider))
        .getRegularAgentClient("Agent Base Path");

    // Assert
    verify(apiClientBuilderProvider).newInstance();
    assertTrue(actualRegularAgentClient instanceof ApiClientJersey2);
    assertEquals("Agent Base Path/agent", actualRegularAgentClient.getBasePath());
    assertTrue(actualRegularAgentClient.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#getRegularAgentClient(String)} with {@code String}.
   * <p>
   * Method under test: {@link ApiClientFactory#getRegularAgentClient(String)}
   */
  @Test
  @DisplayName("Test getRegularAgentClient(String) with 'String'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getRegularAgentClient(String)"})
  void testGetRegularAgentClientWithString2() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkConfig config = new BdkConfig();
    config.setDefaultHeaders(defaultHeaders);
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    when(apiClientBuilderProvider.newInstance()).thenReturn(new ApiClientBuilderJersey2());

    // Act
    ApiClient actualRegularAgentClient = (new ApiClientFactory(config, apiClientBuilderProvider))
        .getRegularAgentClient("Agent Base Path");

    // Assert
    verify(apiClientBuilderProvider).newInstance();
    assertTrue(actualRegularAgentClient instanceof ApiClientJersey2);
    assertEquals("Agent Base Path/agent", actualRegularAgentClient.getBasePath());
    assertTrue(actualRegularAgentClient.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#getRegularAgentClient(String)} with {@code String}.
   * <ul>
   *   <li>Given {@link ApiClientFactory#ApiClientFactory(BdkConfig)} with config is {@link BdkConfig} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getRegularAgentClient(String)}
   */
  @Test
  @DisplayName("Test getRegularAgentClient(String) with 'String'; given ApiClientFactory(BdkConfig) with config is BdkConfig (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getRegularAgentClient(String)"})
  void testGetRegularAgentClientWithString_givenApiClientFactoryWithConfigIsBdkConfig() {
    // Arrange and Act
    ApiClient actualRegularAgentClient = (new ApiClientFactory(new BdkConfig()))
        .getRegularAgentClient("Agent Base Path");

    // Assert
    assertTrue(actualRegularAgentClient instanceof ApiClientJersey2);
    assertEquals("Agent Base Path/agent", actualRegularAgentClient.getBasePath());
    assertTrue(actualRegularAgentClient.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#getRegularAgentClient(String)} with {@code String}.
   * <ul>
   *   <li>Then throw {@link ApiClientInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getRegularAgentClient(String)}
   */
  @Test
  @DisplayName("Test getRegularAgentClient(String) with 'String'; then throw ApiClientInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getRegularAgentClient(String)"})
  void testGetRegularAgentClientWithString_thenThrowApiClientInitializationException() {
    // Arrange
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    when(apiClientBuilderProvider.newInstance()).thenThrow(new ApiClientInitializationException("An error occurred"));

    // Act and Assert
    assertThrows(ApiClientInitializationException.class,
        () -> (new ApiClientFactory(new BdkConfig(), apiClientBuilderProvider))
            .getRegularAgentClient("Agent Base Path"));
    verify(apiClientBuilderProvider).newInstance();
  }

  /**
   * Test {@link ApiClientFactory#getRegularAgentClient()}.
   * <ul>
   *   <li>Given {@link ApiClientFactory#ApiClientFactory(BdkConfig)} with config is {@link BdkConfig} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getRegularAgentClient()}
   */
  @Test
  @DisplayName("Test getRegularAgentClient(); given ApiClientFactory(BdkConfig) with config is BdkConfig (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getRegularAgentClient()"})
  void testGetRegularAgentClient_givenApiClientFactoryWithConfigIsBdkConfig() {
    // Arrange and Act
    ApiClient actualRegularAgentClient = (new ApiClientFactory(new BdkConfig())).getRegularAgentClient();

    // Assert
    assertTrue(actualRegularAgentClient instanceof ApiClientJersey2);
    assertEquals("https://null:443/agent", actualRegularAgentClient.getBasePath());
    assertTrue(actualRegularAgentClient.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#getRegularAgentClient()}.
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code Delivered-To} is {@code alice.liddell@example.org}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getRegularAgentClient()}
   */
  @Test
  @DisplayName("Test getRegularAgentClient(); given HashMap() 'Delivered-To' is 'alice.liddell@example.org'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getRegularAgentClient()"})
  void testGetRegularAgentClient_givenHashMapDeliveredToIsAliceLiddellExampleOrg() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkConfig config = new BdkConfig();
    config.setDefaultHeaders(defaultHeaders);
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    when(apiClientBuilderProvider.newInstance()).thenReturn(new ApiClientBuilderJersey2());

    // Act
    ApiClient actualRegularAgentClient = (new ApiClientFactory(config, apiClientBuilderProvider))
        .getRegularAgentClient();

    // Assert
    verify(apiClientBuilderProvider).newInstance();
    assertTrue(actualRegularAgentClient instanceof ApiClientJersey2);
    assertEquals("https://null:443/agent", actualRegularAgentClient.getBasePath());
    assertTrue(actualRegularAgentClient.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#getRegularAgentClient()}.
   * <ul>
   *   <li>Then throw {@link ApiClientInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getRegularAgentClient()}
   */
  @Test
  @DisplayName("Test getRegularAgentClient(); then throw ApiClientInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getRegularAgentClient()"})
  void testGetRegularAgentClient_thenThrowApiClientInitializationException() {
    // Arrange
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    when(apiClientBuilderProvider.newInstance()).thenThrow(new ApiClientInitializationException("An error occurred"));

    // Act and Assert
    assertThrows(ApiClientInitializationException.class,
        () -> (new ApiClientFactory(new BdkConfig(), apiClientBuilderProvider)).getRegularAgentClient());
    verify(apiClientBuilderProvider).newInstance();
  }

  /**
   * Test {@link ApiClientFactory#getSessionAuthClient()}.
   * <p>
   * Method under test: {@link ApiClientFactory#getSessionAuthClient()}
   */
  @Test
  @DisplayName("Test getSessionAuthClient()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getSessionAuthClient()"})
  void testGetSessionAuthClient() throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("/sessionauth");

    BdkBotConfig bot = new BdkBotConfig();
    bot.setCertificate(new BdkCertificateConfig("", "iloveyou"));
    bot.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setCertificatePassword("iloveyou");
    bot.setCertificatePath("/sessionauth");
    bot.setPrivateKey(privateKey);
    bot.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setPrivateKeyPath("/sessionauth");
    bot.setUsername("janedoe");

    BdkConfig config = new BdkConfig();
    config.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    config.setBot(bot);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> (new ApiClientFactory(config)).getSessionAuthClient());
  }

  /**
   * Test {@link ApiClientFactory#getSessionAuthClient()}.
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code Delivered-To} is {@code alice.liddell@example.org}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getSessionAuthClient()}
   */
  @Test
  @DisplayName("Test getSessionAuthClient(); given HashMap() 'Delivered-To' is 'alice.liddell@example.org'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getSessionAuthClient()"})
  void testGetSessionAuthClient_givenHashMapDeliveredToIsAliceLiddellExampleOrg() throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("/sessionauth");

    BdkBotConfig bot = new BdkBotConfig();
    bot.setCertificate(new BdkCertificateConfig("", "iloveyou"));
    bot.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setCertificatePassword("iloveyou");
    bot.setCertificatePath("/sessionauth");
    bot.setPrivateKey(privateKey);
    bot.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setPrivateKeyPath("/sessionauth");
    bot.setUsername("janedoe");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkConfig config = new BdkConfig();
    config.setDefaultHeaders(defaultHeaders);
    config.setBot(bot);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> (new ApiClientFactory(config)).getSessionAuthClient());
  }

  /**
   * Test {@link ApiClientFactory#getSessionAuthClient()}.
   * <ul>
   *   <li>Then return {@link ApiClientJersey2}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getSessionAuthClient()}
   */
  @Test
  @DisplayName("Test getSessionAuthClient(); then return ApiClientJersey2")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getSessionAuthClient()"})
  void testGetSessionAuthClient_thenReturnApiClientJersey2() throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("/sessionauth");

    BdkBotConfig bot = new BdkBotConfig();
    bot.setCertificate(new BdkCertificateConfig("", "iloveyou"));
    bot.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setCertificatePassword("");
    bot.setCertificatePath("/sessionauth");
    bot.setPrivateKey(privateKey);
    bot.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setPrivateKeyPath("/sessionauth");
    bot.setUsername("janedoe");

    BdkConfig config = new BdkConfig();
    config.setBot(bot);

    // Act
    ApiClient actualSessionAuthClient = (new ApiClientFactory(config)).getSessionAuthClient();

    // Assert
    assertTrue(actualSessionAuthClient instanceof ApiClientJersey2);
    assertEquals("https://null:443/sessionauth", actualSessionAuthClient.getBasePath());
    assertTrue(actualSessionAuthClient.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#getSessionAuthClient()}.
   * <ul>
   *   <li>Then throw {@link ApiClientInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getSessionAuthClient()}
   */
  @Test
  @DisplayName("Test getSessionAuthClient(); then throw ApiClientInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getSessionAuthClient()"})
  void testGetSessionAuthClient_thenThrowApiClientInitializationException() {
    // Arrange, Act and Assert
    assertThrows(ApiClientInitializationException.class,
        () -> (new ApiClientFactory(new BdkConfig())).getSessionAuthClient());
  }

  /**
   * Test {@link ApiClientFactory#getSessionAuthClient()}.
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getSessionAuthClient()}
   */
  @Test
  @DisplayName("Test getSessionAuthClient(); then throw IllegalStateException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getSessionAuthClient()"})
  void testGetSessionAuthClient_thenThrowIllegalStateException() throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("/sessionauth");

    BdkBotConfig bot = new BdkBotConfig();
    bot.setCertificate(new BdkCertificateConfig("", "iloveyou"));
    bot.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setCertificatePassword("iloveyou");
    bot.setCertificatePath("/sessionauth");
    bot.setPrivateKey(privateKey);
    bot.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setPrivateKeyPath("/sessionauth");
    bot.setUsername("janedoe");

    BdkConfig config = new BdkConfig();
    config.setBot(bot);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> (new ApiClientFactory(config)).getSessionAuthClient());
  }

  /**
   * Test {@link ApiClientFactory#getExtAppSessionAuthClient()}.
   * <p>
   * Method under test: {@link ApiClientFactory#getExtAppSessionAuthClient()}
   */
  @Test
  @DisplayName("Test getExtAppSessionAuthClient()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getExtAppSessionAuthClient()"})
  void testGetExtAppSessionAuthClient() throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("/sessionauth");

    BdkExtAppConfig app = new BdkExtAppConfig();
    app.setAppId("42");
    app.setCertificate(new BdkCertificateConfig("", "iloveyou"));
    app.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    app.setCertificatePassword("iloveyou");
    app.setCertificatePath("/sessionauth");
    app.setPrivateKey(privateKey);
    app.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    app.setPrivateKeyPath("/sessionauth");

    BdkConfig config = new BdkConfig();
    config.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    config.setApp(app);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> (new ApiClientFactory(config)).getExtAppSessionAuthClient());
  }

  /**
   * Test {@link ApiClientFactory#getExtAppSessionAuthClient()}.
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code Delivered-To} is {@code alice.liddell@example.org}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getExtAppSessionAuthClient()}
   */
  @Test
  @DisplayName("Test getExtAppSessionAuthClient(); given HashMap() 'Delivered-To' is 'alice.liddell@example.org'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getExtAppSessionAuthClient()"})
  void testGetExtAppSessionAuthClient_givenHashMapDeliveredToIsAliceLiddellExampleOrg()
      throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("/sessionauth");

    BdkExtAppConfig app = new BdkExtAppConfig();
    app.setAppId("42");
    app.setCertificate(new BdkCertificateConfig("", "iloveyou"));
    app.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    app.setCertificatePassword("iloveyou");
    app.setCertificatePath("/sessionauth");
    app.setPrivateKey(privateKey);
    app.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    app.setPrivateKeyPath("/sessionauth");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkConfig config = new BdkConfig();
    config.setDefaultHeaders(defaultHeaders);
    config.setApp(app);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> (new ApiClientFactory(config)).getExtAppSessionAuthClient());
  }

  /**
   * Test {@link ApiClientFactory#getExtAppSessionAuthClient()}.
   * <ul>
   *   <li>Then return {@link ApiClientJersey2}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getExtAppSessionAuthClient()}
   */
  @Test
  @DisplayName("Test getExtAppSessionAuthClient(); then return ApiClientJersey2")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getExtAppSessionAuthClient()"})
  void testGetExtAppSessionAuthClient_thenReturnApiClientJersey2() throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("/sessionauth");

    BdkExtAppConfig app = new BdkExtAppConfig();
    app.setAppId("42");
    app.setCertificate(new BdkCertificateConfig("", "iloveyou"));
    app.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    app.setCertificatePassword("");
    app.setCertificatePath("/sessionauth");
    app.setPrivateKey(privateKey);
    app.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    app.setPrivateKeyPath("/sessionauth");

    BdkConfig config = new BdkConfig();
    config.setApp(app);

    // Act
    ApiClient actualExtAppSessionAuthClient = (new ApiClientFactory(config)).getExtAppSessionAuthClient();

    // Assert
    assertTrue(actualExtAppSessionAuthClient instanceof ApiClientJersey2);
    assertEquals("https://null:443/sessionauth", actualExtAppSessionAuthClient.getBasePath());
    assertTrue(actualExtAppSessionAuthClient.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#getExtAppSessionAuthClient()}.
   * <ul>
   *   <li>Then throw {@link ApiClientInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getExtAppSessionAuthClient()}
   */
  @Test
  @DisplayName("Test getExtAppSessionAuthClient(); then throw ApiClientInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getExtAppSessionAuthClient()"})
  void testGetExtAppSessionAuthClient_thenThrowApiClientInitializationException() {
    // Arrange, Act and Assert
    assertThrows(ApiClientInitializationException.class,
        () -> (new ApiClientFactory(new BdkConfig())).getExtAppSessionAuthClient());
  }

  /**
   * Test {@link ApiClientFactory#getExtAppSessionAuthClient()}.
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getExtAppSessionAuthClient()}
   */
  @Test
  @DisplayName("Test getExtAppSessionAuthClient(); then throw IllegalStateException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getExtAppSessionAuthClient()"})
  void testGetExtAppSessionAuthClient_thenThrowIllegalStateException() throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("/sessionauth");

    BdkExtAppConfig app = new BdkExtAppConfig();
    app.setAppId("42");
    app.setCertificate(new BdkCertificateConfig("", "iloveyou"));
    app.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    app.setCertificatePassword("iloveyou");
    app.setCertificatePath("/sessionauth");
    app.setPrivateKey(privateKey);
    app.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    app.setPrivateKeyPath("/sessionauth");

    BdkConfig config = new BdkConfig();
    config.setApp(app);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> (new ApiClientFactory(config)).getExtAppSessionAuthClient());
  }

  /**
   * Test {@link ApiClientFactory#getKeyAuthClient()}.
   * <p>
   * Method under test: {@link ApiClientFactory#getKeyAuthClient()}
   */
  @Test
  @DisplayName("Test getKeyAuthClient()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getKeyAuthClient()"})
  void testGetKeyAuthClient() throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("/keyauth");

    BdkBotConfig bot = new BdkBotConfig();
    bot.setCertificate(new BdkCertificateConfig("", "iloveyou"));
    bot.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setCertificatePassword("iloveyou");
    bot.setCertificatePath("/keyauth");
    bot.setPrivateKey(privateKey);
    bot.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setPrivateKeyPath("/keyauth");
    bot.setUsername("janedoe");

    BdkConfig config = new BdkConfig();
    config.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    config.setBot(bot);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> (new ApiClientFactory(config)).getKeyAuthClient());
  }

  /**
   * Test {@link ApiClientFactory#getKeyAuthClient()}.
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code Delivered-To} is {@code alice.liddell@example.org}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getKeyAuthClient()}
   */
  @Test
  @DisplayName("Test getKeyAuthClient(); given HashMap() 'Delivered-To' is 'alice.liddell@example.org'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getKeyAuthClient()"})
  void testGetKeyAuthClient_givenHashMapDeliveredToIsAliceLiddellExampleOrg() throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("/keyauth");

    BdkBotConfig bot = new BdkBotConfig();
    bot.setCertificate(new BdkCertificateConfig("", "iloveyou"));
    bot.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setCertificatePassword("iloveyou");
    bot.setCertificatePath("/keyauth");
    bot.setPrivateKey(privateKey);
    bot.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setPrivateKeyPath("/keyauth");
    bot.setUsername("janedoe");

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    BdkConfig config = new BdkConfig();
    config.setDefaultHeaders(defaultHeaders);
    config.setBot(bot);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> (new ApiClientFactory(config)).getKeyAuthClient());
  }

  /**
   * Test {@link ApiClientFactory#getKeyAuthClient()}.
   * <ul>
   *   <li>Then return {@link ApiClientJersey2}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getKeyAuthClient()}
   */
  @Test
  @DisplayName("Test getKeyAuthClient(); then return ApiClientJersey2")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getKeyAuthClient()"})
  void testGetKeyAuthClient_thenReturnApiClientJersey2() throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("/keyauth");

    BdkBotConfig bot = new BdkBotConfig();
    bot.setCertificate(new BdkCertificateConfig("", "iloveyou"));
    bot.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setCertificatePassword("");
    bot.setCertificatePath("/keyauth");
    bot.setPrivateKey(privateKey);
    bot.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setPrivateKeyPath("/keyauth");
    bot.setUsername("janedoe");

    BdkConfig config = new BdkConfig();
    config.setBot(bot);

    // Act
    ApiClient actualKeyAuthClient = (new ApiClientFactory(config)).getKeyAuthClient();

    // Assert
    assertTrue(actualKeyAuthClient instanceof ApiClientJersey2);
    assertEquals("https://null:443/keyauth", actualKeyAuthClient.getBasePath());
    assertTrue(actualKeyAuthClient.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#getKeyAuthClient()}.
   * <ul>
   *   <li>Then throw {@link ApiClientInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getKeyAuthClient()}
   */
  @Test
  @DisplayName("Test getKeyAuthClient(); then throw ApiClientInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getKeyAuthClient()"})
  void testGetKeyAuthClient_thenThrowApiClientInitializationException() {
    // Arrange, Act and Assert
    assertThrows(ApiClientInitializationException.class,
        () -> (new ApiClientFactory(new BdkConfig())).getKeyAuthClient());
  }

  /**
   * Test {@link ApiClientFactory#getKeyAuthClient()}.
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getKeyAuthClient()}
   */
  @Test
  @DisplayName("Test getKeyAuthClient(); then throw IllegalStateException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.getKeyAuthClient()"})
  void testGetKeyAuthClient_thenThrowIllegalStateException() throws UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("/keyauth");

    BdkBotConfig bot = new BdkBotConfig();
    bot.setCertificate(new BdkCertificateConfig("", "iloveyou"));
    bot.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setCertificatePassword("iloveyou");
    bot.setCertificatePath("/keyauth");
    bot.setPrivateKey(privateKey);
    bot.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bot.setPrivateKeyPath("/keyauth");
    bot.setUsername("janedoe");

    BdkConfig config = new BdkConfig();
    config.setBot(bot);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> (new ApiClientFactory(config)).getKeyAuthClient());
  }

  /**
   * Test {@link ApiClientFactory#buildClient(String, BdkClientConfig)}.
   * <ul>
   *   <li>Then return BasePath is {@code https://null:443Context Path}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#buildClient(String, BdkClientConfig)}
   */
  @Test
  @DisplayName("Test buildClient(String, BdkClientConfig); then return BasePath is 'https://null:443Context Path'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.buildClient(String, BdkClientConfig)"})
  void testBuildClient_thenReturnBasePathIsHttpsNull443ContextPath() {
    // Arrange
    ApiClientFactory apiClientFactory = new ApiClientFactory(new BdkConfig());

    // Act
    ApiClient actualBuildClientResult = apiClientFactory.buildClient("Context Path",
        new BdkAgentConfig(new BdkConfig()));

    // Assert
    assertTrue(actualBuildClientResult instanceof ApiClientJersey2);
    assertEquals("https://null:443Context Path", actualBuildClientResult.getBasePath());
    assertTrue(actualBuildClientResult.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#buildClient(String, BdkClientConfig)}.
   * <ul>
   *   <li>Then return BasePath is {@code Scheme://localhost:8080/ContextContext Path}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#buildClient(String, BdkClientConfig)}
   */
  @Test
  @DisplayName("Test buildClient(String, BdkClientConfig); then return BasePath is 'Scheme://localhost:8080/ContextContext Path'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.buildClient(String, BdkClientConfig)"})
  void testBuildClient_thenReturnBasePathIsSchemeLocalhost8080ContextContextPath() throws UnsupportedEncodingException {
    // Arrange
    ApiClientFactory apiClientFactory = new ApiClientFactory(new BdkConfig());

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
    parentConfig.setConnectionTimeout(10);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    parentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    parentConfig.setReadTimeout(10);
    parentConfig.setRetry(new BdkRetryConfig());
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    BdkClientConfig clientConfig = new BdkClientConfig();
    clientConfig.setParentConfig(parentConfig);

    // Act
    ApiClient actualBuildClientResult = apiClientFactory.buildClient("Context Path", clientConfig);

    // Assert
    assertTrue(actualBuildClientResult instanceof ApiClientJersey2);
    assertEquals("Scheme://localhost:8080/ContextContext Path", actualBuildClientResult.getBasePath());
    assertTrue(actualBuildClientResult.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#buildAgentClient(String, BdkAgentConfig)}.
   * <ul>
   *   <li>Given {@link BdkRsaKeyConfig} (default constructor) Content is {@code AXAXAXAX} Bytes is {@code UTF-8}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#buildAgentClient(String, BdkAgentConfig)}
   */
  @Test
  @DisplayName("Test buildAgentClient(String, BdkAgentConfig); given BdkRsaKeyConfig (default constructor) Content is 'AXAXAXAX' Bytes is 'UTF-8'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.buildAgentClient(String, BdkAgentConfig)"})
  void testBuildAgentClient_givenBdkRsaKeyConfigContentIsAxaxaxaxBytesIsUtf8() throws UnsupportedEncodingException {
    // Arrange
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    when(apiClientBuilderProvider.newInstance()).thenReturn(new ApiClientBuilderJersey2());
    ApiClientFactory apiClientFactory = new ApiClientFactory(new BdkConfig(), apiClientBuilderProvider);

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
    parentConfig.setConnectionTimeout(10);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    parentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    parentConfig.setReadTimeout(10);
    parentConfig.setRetry(new BdkRetryConfig());
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    BdkAgentConfig agentConfig = new BdkAgentConfig();
    agentConfig.setParentConfig(parentConfig);

    // Act
    ApiClient actualBuildAgentClientResult = apiClientFactory.buildAgentClient("Base Path", agentConfig);

    // Assert
    verify(apiClientBuilderProvider).newInstance();
    assertTrue(actualBuildAgentClientResult instanceof ApiClientJersey2);
    assertEquals("Base Path", actualBuildAgentClientResult.getBasePath());
    assertTrue(actualBuildAgentClientResult.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#buildAgentClient(String, BdkAgentConfig)}.
   * <ul>
   *   <li>Then throw {@link ApiClientInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#buildAgentClient(String, BdkAgentConfig)}
   */
  @Test
  @DisplayName("Test buildAgentClient(String, BdkAgentConfig); then throw ApiClientInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.buildAgentClient(String, BdkAgentConfig)"})
  void testBuildAgentClient_thenThrowApiClientInitializationException() {
    // Arrange
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    when(apiClientBuilderProvider.newInstance()).thenThrow(new ApiClientInitializationException("An error occurred"));
    ApiClientFactory apiClientFactory = new ApiClientFactory(new BdkConfig(), apiClientBuilderProvider);

    // Act and Assert
    assertThrows(ApiClientInitializationException.class,
        () -> apiClientFactory.buildAgentClient("Base Path", new BdkAgentConfig()));
    verify(apiClientBuilderProvider).newInstance();
  }

  /**
   * Test {@link ApiClientFactory#buildAgentClient(String, BdkAgentConfig)}.
   * <ul>
   *   <li>When {@link BdkAgentConfig#BdkAgentConfig(BdkConfig)} with parentConfig is {@link BdkConfig} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#buildAgentClient(String, BdkAgentConfig)}
   */
  @Test
  @DisplayName("Test buildAgentClient(String, BdkAgentConfig); when BdkAgentConfig(BdkConfig) with parentConfig is BdkConfig (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClient ApiClientFactory.buildAgentClient(String, BdkAgentConfig)"})
  void testBuildAgentClient_whenBdkAgentConfigWithParentConfigIsBdkConfig() {
    // Arrange
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    when(apiClientBuilderProvider.newInstance()).thenReturn(new ApiClientBuilderJersey2());
    ApiClientFactory apiClientFactory = new ApiClientFactory(new BdkConfig(), apiClientBuilderProvider);

    // Act
    ApiClient actualBuildAgentClientResult = apiClientFactory.buildAgentClient("Base Path",
        new BdkAgentConfig(new BdkConfig()));

    // Assert
    verify(apiClientBuilderProvider).newInstance();
    assertTrue(actualBuildAgentClientResult instanceof ApiClientJersey2);
    assertEquals("Base Path", actualBuildAgentClientResult.getBasePath());
    assertTrue(actualBuildAgentClientResult.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClientFactory#buildClientWithCertificate(BdkClientConfig, String, BdkAuthenticationConfig)}.
   * <p>
   * Method under test: {@link ApiClientFactory#buildClientWithCertificate(BdkClientConfig, String, BdkAuthenticationConfig)}
   */
  @Test
  @DisplayName("Test buildClientWithCertificate(BdkClientConfig, String, BdkAuthenticationConfig)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "ApiClient ApiClientFactory.buildClientWithCertificate(BdkClientConfig, String, BdkAuthenticationConfig)"})
  void testBuildClientWithCertificate() throws UnsupportedEncodingException {
    // Arrange
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    when(apiClientBuilderProvider.newInstance()).thenReturn(new ApiClientBuilderJersey2());
    ApiClientFactory apiClientFactory = new ApiClientFactory(new BdkConfig(), apiClientBuilderProvider);
    BdkAgentConfig clientConfig = new BdkAgentConfig(new BdkConfig());

    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkAuthenticationConfig config = new BdkAuthenticationConfig();
    config.setCertificate(new BdkCertificateConfig("", "iloveyou"));
    config.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    config.setCertificatePassword("iloveyou");
    config.setCertificatePath("Certificate Path");
    config.setPrivateKey(privateKey);
    config.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    config.setPrivateKeyPath("Private Key Path");

    // Act and Assert
    assertThrows(IllegalStateException.class,
        () -> apiClientFactory.buildClientWithCertificate(clientConfig, "Context Path", config));
    verify(apiClientBuilderProvider).newInstance();
  }

  /**
   * Test {@link ApiClientFactory#buildClientWithCertificate(BdkClientConfig, String, BdkAuthenticationConfig)}.
   * <p>
   * Method under test: {@link ApiClientFactory#buildClientWithCertificate(BdkClientConfig, String, BdkAuthenticationConfig)}
   */
  @Test
  @DisplayName("Test buildClientWithCertificate(BdkClientConfig, String, BdkAuthenticationConfig)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "ApiClient ApiClientFactory.buildClientWithCertificate(BdkClientConfig, String, BdkAuthenticationConfig)"})
  void testBuildClientWithCertificate2() throws UnsupportedEncodingException {
    // Arrange
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    when(apiClientBuilderProvider.newInstance()).thenThrow(new IllegalStateException("foo"));
    ApiClientFactory apiClientFactory = new ApiClientFactory(new BdkConfig(), apiClientBuilderProvider);
    BdkAgentConfig clientConfig = new BdkAgentConfig(new BdkConfig());

    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkAuthenticationConfig config = new BdkAuthenticationConfig();
    config.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    config.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    config.setCertificatePassword("iloveyou");
    config.setCertificatePath("Certificate Path");
    config.setPrivateKey(privateKey);
    config.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    config.setPrivateKeyPath("Private Key Path");

    // Act and Assert
    assertThrows(IllegalStateException.class,
        () -> apiClientFactory.buildClientWithCertificate(clientConfig, "Context Path", config));
    verify(apiClientBuilderProvider).newInstance();
  }

  /**
   * Test {@link ApiClientFactory#buildClientWithCertificate(BdkClientConfig, String, BdkAuthenticationConfig)}.
   * <ul>
   *   <li>Then throw {@link ApiClientInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#buildClientWithCertificate(BdkClientConfig, String, BdkAuthenticationConfig)}
   */
  @Test
  @DisplayName("Test buildClientWithCertificate(BdkClientConfig, String, BdkAuthenticationConfig); then throw ApiClientInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "ApiClient ApiClientFactory.buildClientWithCertificate(BdkClientConfig, String, BdkAuthenticationConfig)"})
  void testBuildClientWithCertificate_thenThrowApiClientInitializationException() throws UnsupportedEncodingException {
    // Arrange
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    when(apiClientBuilderProvider.newInstance()).thenThrow(new ApiClientInitializationException("An error occurred"));
    ApiClientFactory apiClientFactory = new ApiClientFactory(new BdkConfig(), apiClientBuilderProvider);
    BdkAgentConfig clientConfig = new BdkAgentConfig(new BdkConfig());

    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkAuthenticationConfig config = new BdkAuthenticationConfig();
    config.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    config.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    config.setCertificatePassword("iloveyou");
    config.setCertificatePath("Certificate Path");
    config.setPrivateKey(privateKey);
    config.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    config.setPrivateKeyPath("Private Key Path");

    // Act and Assert
    assertThrows(ApiClientInitializationException.class,
        () -> apiClientFactory.buildClientWithCertificate(clientConfig, "Context Path", config));
    verify(apiClientBuilderProvider).newInstance();
  }

  /**
   * Test {@link ApiClientFactory#getApiClientBuilder(String, BdkClientConfig)}.
   * <ul>
   *   <li>Given {@link BdkRsaKeyConfig} (default constructor) Content is {@code AXAXAXAX} Bytes is {@code UTF-8}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getApiClientBuilder(String, BdkClientConfig)}
   */
  @Test
  @DisplayName("Test getApiClientBuilder(String, BdkClientConfig); given BdkRsaKeyConfig (default constructor) Content is 'AXAXAXAX' Bytes is 'UTF-8'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClientBuilder ApiClientFactory.getApiClientBuilder(String, BdkClientConfig)"})
  void testGetApiClientBuilder_givenBdkRsaKeyConfigContentIsAxaxaxaxBytesIsUtf8() throws UnsupportedEncodingException {
    // Arrange
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    ApiClientBuilderJersey2 apiClientBuilderJersey2 = new ApiClientBuilderJersey2();
    when(apiClientBuilderProvider.newInstance()).thenReturn(apiClientBuilderJersey2);
    ApiClientFactory apiClientFactory = new ApiClientFactory(new BdkConfig(), apiClientBuilderProvider);

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
    parentConfig.setConnectionTimeout(10);
    parentConfig.setContext("Context");
    parentConfig.setDatafeed(datafeed);
    parentConfig.setDatahose(datahose);
    parentConfig.setDefaultHeaders(defaultHeaders);
    parentConfig.setHost("localhost");
    parentConfig.setKeyManager(new BdkClientConfig());
    parentConfig.setPod(new BdkClientConfig());
    parentConfig.setPort(8080);
    parentConfig.setProxy(new BdkProxyConfig("localhost", 8080, "janedoe", "iloveyou"));
    parentConfig.setReadTimeout(10);
    parentConfig.setRetry(new BdkRetryConfig());
    parentConfig.setScheme("Scheme");
    parentConfig.setSessionAuth(new BdkClientConfig());
    parentConfig.setSsl(ssl);

    BdkClientConfig clientConfig = new BdkClientConfig();
    clientConfig.setParentConfig(parentConfig);

    // Act
    ApiClientBuilder actualApiClientBuilder = apiClientFactory.getApiClientBuilder("Base Path", clientConfig);

    // Assert
    verify(apiClientBuilderProvider).newInstance();
    assertSame(apiClientBuilderJersey2, actualApiClientBuilder);
  }

  /**
   * Test {@link ApiClientFactory#getApiClientBuilder(String, BdkClientConfig)}.
   * <ul>
   *   <li>Then throw {@link ApiClientInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getApiClientBuilder(String, BdkClientConfig)}
   */
  @Test
  @DisplayName("Test getApiClientBuilder(String, BdkClientConfig); then throw ApiClientInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClientBuilder ApiClientFactory.getApiClientBuilder(String, BdkClientConfig)"})
  void testGetApiClientBuilder_thenThrowApiClientInitializationException() {
    // Arrange
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    when(apiClientBuilderProvider.newInstance()).thenThrow(new ApiClientInitializationException("An error occurred"));
    ApiClientFactory apiClientFactory = new ApiClientFactory(new BdkConfig(), apiClientBuilderProvider);

    // Act and Assert
    assertThrows(ApiClientInitializationException.class,
        () -> apiClientFactory.getApiClientBuilder("Base Path", new BdkClientConfig()));
    verify(apiClientBuilderProvider).newInstance();
  }

  /**
   * Test {@link ApiClientFactory#getApiClientBuilder(String, BdkClientConfig)}.
   * <ul>
   *   <li>When {@link BdkAgentConfig#BdkAgentConfig(BdkConfig)} with parentConfig is {@link BdkConfig} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getApiClientBuilder(String, BdkClientConfig)}
   */
  @Test
  @DisplayName("Test getApiClientBuilder(String, BdkClientConfig); when BdkAgentConfig(BdkConfig) with parentConfig is BdkConfig (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ApiClientBuilder ApiClientFactory.getApiClientBuilder(String, BdkClientConfig)"})
  void testGetApiClientBuilder_whenBdkAgentConfigWithParentConfigIsBdkConfig() {
    // Arrange
    ApiClientBuilderProvider apiClientBuilderProvider = mock(ApiClientBuilderProvider.class);
    ApiClientBuilderJersey2 apiClientBuilderJersey2 = new ApiClientBuilderJersey2();
    when(apiClientBuilderProvider.newInstance()).thenReturn(apiClientBuilderJersey2);
    ApiClientFactory apiClientFactory = new ApiClientFactory(new BdkConfig(), apiClientBuilderProvider);

    // Act
    ApiClientBuilder actualApiClientBuilder = apiClientFactory.getApiClientBuilder("Base Path",
        new BdkAgentConfig(new BdkConfig()));

    // Assert
    verify(apiClientBuilderProvider).newInstance();
    assertSame(apiClientBuilderJersey2, actualApiClientBuilder);
  }

  /**
   * Test {@link ApiClientFactory#configureTruststore(ApiClientBuilder)}.
   * <ul>
   *   <li>Given {@code A}.</li>
   *   <li>When {@link ApiClientBuilderJersey2} (default constructor).</li>
   *   <li>Then calls {@link BdkConfig#getSsl()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#configureTruststore(ApiClientBuilder)}
   */
  @Test
  @DisplayName("Test configureTruststore(ApiClientBuilder); given 'A'; when ApiClientBuilderJersey2 (default constructor); then calls getSsl()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ApiClientFactory.configureTruststore(ApiClientBuilder)"})
  void testConfigureTruststore_givenA_whenApiClientBuilderJersey2_thenCallsGetSsl() {
    // Arrange
    BdkSslConfig bdkSslConfig = mock(BdkSslConfig.class);
    when(bdkSslConfig.getCertificateConfig())
        .thenReturn(new BdkCertificateConfig("classpath:", new byte[]{'A', 1, 'A', 1, 'A', 1, 'A', 1}, "iloveyou"));
    doNothing().when(bdkSslConfig).setTrustStore(Mockito.<BdkCertificateConfig>any());
    doNothing().when(bdkSslConfig).setTrustStorePassword(Mockito.<String>any());
    doNothing().when(bdkSslConfig).setTrustStorePath(Mockito.<String>any());
    bdkSslConfig.setTrustStore(new BdkCertificateConfig("Path", "iloveyou"));
    bdkSslConfig.setTrustStorePassword("iloveyou");
    bdkSslConfig.setTrustStorePath("Trust Store Path");
    BdkConfig config = mock(BdkConfig.class);
    when(config.getSsl()).thenReturn(bdkSslConfig);
    ApiClientFactory apiClientFactory = new ApiClientFactory(config);

    // Act
    apiClientFactory.configureTruststore(new ApiClientBuilderJersey2());

    // Assert
    verify(config).getSsl();
    verify(bdkSslConfig).getCertificateConfig();
    verify(bdkSslConfig).setTrustStore(isA(BdkCertificateConfig.class));
    verify(bdkSslConfig).setTrustStorePassword(eq("iloveyou"));
    verify(bdkSslConfig).setTrustStorePath(eq("Trust Store Path"));
  }

  /**
   * Test {@link ApiClientFactory#configureProxy(BdkProxyConfig, ApiClientBuilder)}.
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#configureProxy(BdkProxyConfig, ApiClientBuilder)}
   */
  @Test
  @DisplayName("Test configureProxy(BdkProxyConfig, ApiClientBuilder); then throw IllegalStateException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ApiClientFactory.configureProxy(BdkProxyConfig, ApiClientBuilder)"})
  void testConfigureProxy_thenThrowIllegalStateException() {
    // Arrange
    ApiClientFactory apiClientFactory = new ApiClientFactory(new BdkConfig());
    BdkProxyConfig proxyConfig = mock(BdkProxyConfig.class);
    when(proxyConfig.getHost()).thenThrow(new IllegalStateException("foo"));

    // Act and Assert
    assertThrows(IllegalStateException.class,
        () -> apiClientFactory.configureProxy(proxyConfig, new ApiClientBuilderJersey2()));
    verify(proxyConfig).getHost();
  }

  /**
   * Test {@link ApiClientFactory#getServiceNameFromBasePath(String)}.
   * <ul>
   *   <li>When {@code /agent}.</li>
   *   <li>Then return {@code AGENT}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getServiceNameFromBasePath(String)}
   */
  @Test
  @DisplayName("Test getServiceNameFromBasePath(String); when '/agent'; then return 'AGENT'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ServiceEnum ApiClientFactory.getServiceNameFromBasePath(String)"})
  void testGetServiceNameFromBasePath_whenAgent_thenReturnAgent() {
    // Arrange, Act and Assert
    assertEquals(ServiceEnum.AGENT, ApiClientFactory.getServiceNameFromBasePath("/agent"));
  }

  /**
   * Test {@link ApiClientFactory#getServiceNameFromBasePath(String)}.
   * <ul>
   *   <li>When {@code Base Path}.</li>
   *   <li>Then return {@code POD}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getServiceNameFromBasePath(String)}
   */
  @Test
  @DisplayName("Test getServiceNameFromBasePath(String); when 'Base Path'; then return 'POD'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ServiceEnum ApiClientFactory.getServiceNameFromBasePath(String)"})
  void testGetServiceNameFromBasePath_whenBasePath_thenReturnPod() {
    // Arrange, Act and Assert
    assertEquals(ServiceEnum.POD, ApiClientFactory.getServiceNameFromBasePath("Base Path"));
  }

  /**
   * Test {@link ApiClientFactory#getServiceNameFromBasePath(String)}.
   * <ul>
   *   <li>When {@code /keyauth}.</li>
   *   <li>Then return {@code KEY_MANAGER}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getServiceNameFromBasePath(String)}
   */
  @Test
  @DisplayName("Test getServiceNameFromBasePath(String); when '/keyauth'; then return 'KEY_MANAGER'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ServiceEnum ApiClientFactory.getServiceNameFromBasePath(String)"})
  void testGetServiceNameFromBasePath_whenKeyauth_thenReturnKeyManager() {
    // Arrange, Act and Assert
    assertEquals(ServiceEnum.KEY_MANAGER, ApiClientFactory.getServiceNameFromBasePath("/keyauth"));
  }

  /**
   * Test {@link ApiClientFactory#getServiceNameFromBasePath(String)}.
   * <ul>
   *   <li>When {@code /relay}.</li>
   *   <li>Then return {@code KEY_MANAGER}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getServiceNameFromBasePath(String)}
   */
  @Test
  @DisplayName("Test getServiceNameFromBasePath(String); when '/relay'; then return 'KEY_MANAGER'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ServiceEnum ApiClientFactory.getServiceNameFromBasePath(String)"})
  void testGetServiceNameFromBasePath_whenRelay_thenReturnKeyManager() {
    // Arrange, Act and Assert
    assertEquals(ServiceEnum.KEY_MANAGER, ApiClientFactory.getServiceNameFromBasePath("/relay"));
  }

  /**
   * Test {@link ApiClientFactory#getServiceNameFromBasePath(String)}.
   * <ul>
   *   <li>When {@code /sessionauth}.</li>
   *   <li>Then return {@code SESSION_AUTH}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientFactory#getServiceNameFromBasePath(String)}
   */
  @Test
  @DisplayName("Test getServiceNameFromBasePath(String); when '/sessionauth'; then return 'SESSION_AUTH'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ServiceEnum ApiClientFactory.getServiceNameFromBasePath(String)"})
  void testGetServiceNameFromBasePath_whenSessionauth_thenReturnSessionAuth() {
    // Arrange, Act and Assert
    assertEquals(ServiceEnum.SESSION_AUTH, ApiClientFactory.getServiceNameFromBasePath("/sessionauth"));
  }
}
