package com.symphony.bdk.core.service.datafeed.impl;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.AuthSession;
import com.symphony.bdk.core.config.model.BdkAgentConfig;
import com.symphony.bdk.core.config.model.BdkConfig;
import com.symphony.bdk.core.config.model.BdkDatafeedConfig;
import com.symphony.bdk.core.config.model.BdkLoadBalancingConfig;
import com.symphony.bdk.core.config.model.BdkLoadBalancingMode;
import com.symphony.bdk.core.config.model.BdkRetryConfig;
import com.symphony.bdk.core.service.datafeed.DatafeedIdRepository;
import com.symphony.bdk.gen.api.DatafeedApi;
import com.symphony.bdk.gen.api.model.UserV2;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import jakarta.ws.rs.client.Client;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DatafeedLoopV1DiffblueTest {
  /**
   * Test {@link DatafeedLoopV1#DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2)}.
   * <ul>
   *   <li>Given {@link BdkAgentConfig#BdkAgentConfig()}.</li>
   *   <li>Then return not {@link AbstractDatafeedLoop#started}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DatafeedLoopV1#DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2)}
   */
  @Test
  @DisplayName("Test new DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2); given BdkAgentConfig(); then return not started")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void DatafeedLoopV1.<init>(DatafeedApi, AuthSession, BdkConfig, UserV2)"})
  void testNewDatafeedLoopV1_givenBdkAgentConfig_thenReturnNotStarted() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    DatafeedApi datafeedApi = mock(DatafeedApi.class);
    when(datafeedApi.getApiClient()).thenReturn(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));
    AuthSession authSession = mock(AuthSession.class);

    BdkDatafeedConfig bdkDatafeedConfig = new BdkDatafeedConfig();
    bdkDatafeedConfig.setIdFilePath("/directory/foo.txt");
    bdkDatafeedConfig.setRetry(new BdkRetryConfig());
    bdkDatafeedConfig.setVersion("1.0.2");
    BdkConfig config = mock(BdkConfig.class);
    when(config.getDatafeed()).thenReturn(bdkDatafeedConfig);
    when(config.getAgent()).thenReturn(new BdkAgentConfig());
    when(config.getDatafeedRetryConfig()).thenReturn(new BdkRetryConfig());

    // Act
    DatafeedLoopV1 actualDatafeedLoopV1 = new DatafeedLoopV1(datafeedApi, authSession, config, mock(UserV2.class));

    // Assert
    verify(config).getAgent();
    verify(config, atLeast(1)).getDatafeed();
    verify(config).getDatafeedRetryConfig();
    verify(datafeedApi).getApiClient();
    assertFalse(actualDatafeedLoopV1.started.get());
  }

  /**
   * Test {@link DatafeedLoopV1#DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2, DatafeedIdRepository)}.
   * <ul>
   *   <li>Given {@link BdkAgentConfig#BdkAgentConfig()}.</li>
   *   <li>Then return not {@link AbstractDatafeedLoop#started}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DatafeedLoopV1#DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2, DatafeedIdRepository)}
   */
  @Test
  @DisplayName("Test new DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2, DatafeedIdRepository); given BdkAgentConfig(); then return not started")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void DatafeedLoopV1.<init>(DatafeedApi, AuthSession, BdkConfig, UserV2, DatafeedIdRepository)"})
  void testNewDatafeedLoopV1_givenBdkAgentConfig_thenReturnNotStarted2() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    DatafeedApi datafeedApi = mock(DatafeedApi.class);
    when(datafeedApi.getApiClient()).thenReturn(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));
    AuthSession authSession = mock(AuthSession.class);
    BdkConfig config = mock(BdkConfig.class);
    when(config.getAgent()).thenReturn(new BdkAgentConfig());
    when(config.getDatafeedRetryConfig()).thenReturn(new BdkRetryConfig());
    UserV2 botInfo = mock(UserV2.class);
    DatafeedIdRepository repository = mock(DatafeedIdRepository.class);
    Optional<String> ofResult = Optional.of("foo");
    when(repository.read()).thenReturn(ofResult);

    // Act
    DatafeedLoopV1 actualDatafeedLoopV1 = new DatafeedLoopV1(datafeedApi, authSession, config, botInfo, repository);

    // Assert
    verify(config).getAgent();
    verify(config).getDatafeedRetryConfig();
    verify(repository).read();
    verify(datafeedApi).getApiClient();
    assertFalse(actualDatafeedLoopV1.started.get());
  }

  /**
   * Test {@link DatafeedLoopV1#DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2)}.
   * <ul>
   *   <li>Given {@link BdkLoadBalancingConfig} (default constructor) Mode is {@code EXTERNAL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DatafeedLoopV1#DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2)}
   */
  @Test
  @DisplayName("Test new DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2); given BdkLoadBalancingConfig (default constructor) Mode is 'EXTERNAL'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void DatafeedLoopV1.<init>(DatafeedApi, AuthSession, BdkConfig, UserV2)"})
  void testNewDatafeedLoopV1_givenBdkLoadBalancingConfigModeIsExternal() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    DatafeedApi datafeedApi = mock(DatafeedApi.class);
    when(datafeedApi.getApiClient()).thenReturn(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));
    AuthSession authSession = mock(AuthSession.class);

    BdkLoadBalancingConfig loadBalancing = new BdkLoadBalancingConfig();
    loadBalancing.setMode(BdkLoadBalancingMode.EXTERNAL);
    loadBalancing.setNodes(new ArrayList<>());
    loadBalancing.setStickiness(true);

    BdkAgentConfig bdkAgentConfig = new BdkAgentConfig();
    bdkAgentConfig.setLoadBalancing(loadBalancing);

    BdkDatafeedConfig bdkDatafeedConfig = new BdkDatafeedConfig();
    bdkDatafeedConfig.setIdFilePath("/directory/foo.txt");
    bdkDatafeedConfig.setRetry(new BdkRetryConfig());
    bdkDatafeedConfig.setVersion("1.0.2");
    BdkConfig config = mock(BdkConfig.class);
    when(config.getDatafeed()).thenReturn(bdkDatafeedConfig);
    when(config.getAgent()).thenReturn(bdkAgentConfig);
    when(config.getDatafeedRetryConfig()).thenReturn(new BdkRetryConfig());

    // Act
    DatafeedLoopV1 actualDatafeedLoopV1 = new DatafeedLoopV1(datafeedApi, authSession, config, mock(UserV2.class));

    // Assert
    verify(config).getAgent();
    verify(config, atLeast(1)).getDatafeed();
    verify(config).getDatafeedRetryConfig();
    verify(datafeedApi).getApiClient();
    assertFalse(actualDatafeedLoopV1.started.get());
  }

  /**
   * Test {@link DatafeedLoopV1#DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2, DatafeedIdRepository)}.
   * <ul>
   *   <li>Given {@link BdkLoadBalancingConfig} (default constructor) Mode is {@code EXTERNAL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DatafeedLoopV1#DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2, DatafeedIdRepository)}
   */
  @Test
  @DisplayName("Test new DatafeedLoopV1(DatafeedApi, AuthSession, BdkConfig, UserV2, DatafeedIdRepository); given BdkLoadBalancingConfig (default constructor) Mode is 'EXTERNAL'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void DatafeedLoopV1.<init>(DatafeedApi, AuthSession, BdkConfig, UserV2, DatafeedIdRepository)"})
  void testNewDatafeedLoopV1_givenBdkLoadBalancingConfigModeIsExternal2() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    DatafeedApi datafeedApi = mock(DatafeedApi.class);
    when(datafeedApi.getApiClient()).thenReturn(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));
    AuthSession authSession = mock(AuthSession.class);

    BdkLoadBalancingConfig loadBalancing = new BdkLoadBalancingConfig();
    loadBalancing.setMode(BdkLoadBalancingMode.EXTERNAL);
    loadBalancing.setNodes(new ArrayList<>());
    loadBalancing.setStickiness(true);

    BdkAgentConfig bdkAgentConfig = new BdkAgentConfig();
    bdkAgentConfig.setLoadBalancing(loadBalancing);
    BdkConfig config = mock(BdkConfig.class);
    when(config.getAgent()).thenReturn(bdkAgentConfig);
    when(config.getDatafeedRetryConfig()).thenReturn(new BdkRetryConfig());
    UserV2 botInfo = mock(UserV2.class);
    DatafeedIdRepository repository = mock(DatafeedIdRepository.class);
    Optional<String> ofResult = Optional.of("foo");
    when(repository.read()).thenReturn(ofResult);

    // Act
    DatafeedLoopV1 actualDatafeedLoopV1 = new DatafeedLoopV1(datafeedApi, authSession, config, botInfo, repository);

    // Assert
    verify(config).getAgent();
    verify(config).getDatafeedRetryConfig();
    verify(repository).read();
    verify(datafeedApi).getApiClient();
    assertFalse(actualDatafeedLoopV1.started.get());
  }
}
