package com.symphony.bdk.core.service.health;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.AuthSession;
import com.symphony.bdk.core.service.datafeed.DatafeedLoop;
import com.symphony.bdk.gen.api.SignalsApi;
import com.symphony.bdk.gen.api.SystemApi;
import com.symphony.bdk.gen.api.model.AgentInfo;
import com.symphony.bdk.gen.api.model.V3Health;
import com.symphony.bdk.gen.api.model.V3HealthStatus;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.api.ApiRuntimeException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class HealthServiceDiffblueTest {
  /**
   * Test {@link HealthService#healthCheck()}.
   *
   * <p>Method under test: {@link HealthService#healthCheck()}
   */
  @Test
  @DisplayName("Test healthCheck()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V3Health HealthService.healthCheck()"})
  void testHealthCheck() throws ApiException {
    // Arrange
    SystemApi systemApi = mock(SystemApi.class);
    when(systemApi.v3Health()).thenThrow(new ApiException(1, "https://example.org/example"));

    // Act and Assert
    assertThrows(
        ApiRuntimeException.class,
        () ->
            new HealthService(systemApi, mock(SignalsApi.class), mock(AuthSession.class))
                .healthCheck());
    verify(systemApi).v3Health();
  }

  /**
   * Test {@link HealthService#healthCheck()}.
   *
   * <ul>
   *   <li>Given {@link ApiException#ApiException(int, String)} with code is one and message is
   *       {@code https://example.org/example}.
   * </ul>
   *
   * <p>Method under test: {@link HealthService#healthCheck()}
   */
  @Test
  @DisplayName(
      "Test healthCheck(); given ApiException(int, String) with code is one and message is 'https://example.org/example'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V3Health HealthService.healthCheck()"})
  void testHealthCheck_givenApiExceptionWithCodeIsOneAndMessageIsHttpsExampleOrgExample()
      throws ApiException {
    // Arrange
    SystemApi systemApi = mock(SystemApi.class);
    when(systemApi.v3Health())
        .thenThrow(new ApiRuntimeException(new ApiException(1, "https://example.org/example")));

    // Act and Assert
    assertThrows(
        ApiRuntimeException.class,
        () ->
            new HealthService(systemApi, mock(SignalsApi.class), mock(AuthSession.class))
                .healthCheck());
    verify(systemApi).v3Health();
  }

  /**
   * Test {@link HealthService#healthCheck()}.
   *
   * <ul>
   *   <li>Given {@link SystemApi} {@link SystemApi#v3Health()} return {@link V3Health} (default
   *       constructor).
   *   <li>Then return {@link V3Health} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link HealthService#healthCheck()}
   */
  @Test
  @DisplayName(
      "Test healthCheck(); given SystemApi v3Health() return V3Health (default constructor); then return V3Health (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V3Health HealthService.healthCheck()"})
  void testHealthCheck_givenSystemApiV3HealthReturnV3Health_thenReturnV3Health()
      throws ApiException {
    // Arrange
    SystemApi systemApi = mock(SystemApi.class);
    V3Health v3Health = new V3Health();
    when(systemApi.v3Health()).thenReturn(v3Health);

    // Act
    V3Health actualHealthCheckResult =
        new HealthService(systemApi, mock(SignalsApi.class), mock(AuthSession.class)).healthCheck();

    // Assert
    verify(systemApi).v3Health();
    assertSame(v3Health, actualHealthCheckResult);
  }

  /**
   * Test {@link HealthService#healthCheckExtended()}.
   *
   * <p>Method under test: {@link HealthService#healthCheckExtended()}
   */
  @Test
  @DisplayName("Test healthCheckExtended()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V3Health HealthService.healthCheckExtended()"})
  void testHealthCheckExtended() throws ApiException {
    // Arrange
    SystemApi systemApi = mock(SystemApi.class);
    when(systemApi.v3ExtendedHealth())
        .thenThrow(new ApiException(1, "https://example.org/example"));

    // Act and Assert
    assertThrows(
        ApiRuntimeException.class,
        () ->
            new HealthService(systemApi, mock(SignalsApi.class), mock(AuthSession.class))
                .healthCheckExtended());
    verify(systemApi).v3ExtendedHealth();
  }

  /**
   * Test {@link HealthService#healthCheckExtended()}.
   *
   * <p>Method under test: {@link HealthService#healthCheckExtended()}
   */
  @Test
  @DisplayName("Test healthCheckExtended()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V3Health HealthService.healthCheckExtended()"})
  void testHealthCheckExtended2() throws ApiException {
    // Arrange
    SystemApi systemApi = mock(SystemApi.class);
    when(systemApi.v3ExtendedHealth())
        .thenThrow(new ApiRuntimeException(new ApiException(1, "https://example.org/example")));

    // Act and Assert
    assertThrows(
        ApiRuntimeException.class,
        () ->
            new HealthService(systemApi, mock(SignalsApi.class), mock(AuthSession.class))
                .healthCheckExtended());
    verify(systemApi).v3ExtendedHealth();
  }

  /**
   * Test {@link HealthService#healthCheckExtended()}.
   *
   * <ul>
   *   <li>Then return {@link V3Health} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link HealthService#healthCheckExtended()}
   */
  @Test
  @DisplayName("Test healthCheckExtended(); then return V3Health (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V3Health HealthService.healthCheckExtended()"})
  void testHealthCheckExtended_thenReturnV3Health() throws ApiException {
    // Arrange
    SystemApi systemApi = mock(SystemApi.class);
    V3Health v3Health = new V3Health();
    when(systemApi.v3ExtendedHealth()).thenReturn(v3Health);

    // Act
    V3Health actualHealthCheckExtendedResult =
        new HealthService(systemApi, mock(SignalsApi.class), mock(AuthSession.class))
            .healthCheckExtended();

    // Assert
    verify(systemApi).v3ExtendedHealth();
    assertSame(v3Health, actualHealthCheckExtendedResult);
  }

  /**
   * Test {@link HealthService#datafeedHealthCheck()}.
   *
   * <ul>
   *   <li>Given {@link DatafeedLoop} {@link DatafeedLoop#lastPullTimestamp()} return one.
   * </ul>
   *
   * <p>Method under test: {@link HealthService#datafeedHealthCheck()}
   */
  @Test
  @DisplayName("Test datafeedHealthCheck(); given DatafeedLoop lastPullTimestamp() return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V3HealthStatus HealthService.datafeedHealthCheck()"})
  void testDatafeedHealthCheck_givenDatafeedLoopLastPullTimestampReturnOne() {
    // Arrange
    DatafeedLoop datafeedLoop = mock(DatafeedLoop.class);
    when(datafeedLoop.lastPullTimestamp()).thenReturn(1L);

    // Act
    new HealthService(
            mock(SystemApi.class), mock(SignalsApi.class), mock(AuthSession.class), datafeedLoop)
        .datafeedHealthCheck();

    // Assert
    verify(datafeedLoop).lastPullTimestamp();
  }

  /**
   * Test {@link HealthService#datafeedHealthCheck()}.
   *
   * <ul>
   *   <li>Then return {@code DOWN}.
   * </ul>
   *
   * <p>Method under test: {@link HealthService#datafeedHealthCheck()}
   */
  @Test
  @DisplayName("Test datafeedHealthCheck(); then return 'DOWN'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V3HealthStatus HealthService.datafeedHealthCheck()"})
  void testDatafeedHealthCheck_thenReturnDown() {
    // Arrange, Act and Assert
    assertEquals(
        V3HealthStatus.DOWN,
        new HealthService(mock(SystemApi.class), mock(SignalsApi.class), mock(AuthSession.class))
            .datafeedHealthCheck());
  }

  /**
   * Test {@link HealthService#datafeedHealthCheck()}.
   *
   * <ul>
   *   <li>Then return {@code UP}.
   * </ul>
   *
   * <p>Method under test: {@link HealthService#datafeedHealthCheck()}
   */
  @Test
  @DisplayName("Test datafeedHealthCheck(); then return 'UP'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V3HealthStatus HealthService.datafeedHealthCheck()"})
  void testDatafeedHealthCheck_thenReturnUp() {
    // Arrange
    DatafeedLoop datafeedLoop = mock(DatafeedLoop.class);
    when(datafeedLoop.lastPullTimestamp()).thenReturn(Long.MAX_VALUE);

    // Act
    V3HealthStatus actualDatafeedHealthCheckResult =
        new HealthService(
                mock(SystemApi.class),
                mock(SignalsApi.class),
                mock(AuthSession.class),
                datafeedLoop)
            .datafeedHealthCheck();

    // Assert
    verify(datafeedLoop).lastPullTimestamp();
    assertEquals(V3HealthStatus.UP, actualDatafeedHealthCheckResult);
  }

  /**
   * Test {@link HealthService#datafeedHealthCheck()}.
   *
   * <ul>
   *   <li>Then throw {@link ApiRuntimeException}.
   * </ul>
   *
   * <p>Method under test: {@link HealthService#datafeedHealthCheck()}
   */
  @Test
  @DisplayName("Test datafeedHealthCheck(); then throw ApiRuntimeException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"V3HealthStatus HealthService.datafeedHealthCheck()"})
  void testDatafeedHealthCheck_thenThrowApiRuntimeException() {
    // Arrange
    DatafeedLoop datafeedLoop = mock(DatafeedLoop.class);
    when(datafeedLoop.lastPullTimestamp())
        .thenThrow(new ApiRuntimeException(new ApiException(1, "https://example.org/example")));

    // Act and Assert
    assertThrows(
        ApiRuntimeException.class,
        () ->
            new HealthService(
                    mock(SystemApi.class),
                    mock(SignalsApi.class),
                    mock(AuthSession.class),
                    datafeedLoop)
                .datafeedHealthCheck());
    verify(datafeedLoop).lastPullTimestamp();
  }

  /**
   * Test {@link HealthService#getAgentInfo()}.
   *
   * <p>Method under test: {@link HealthService#getAgentInfo()}
   */
  @Test
  @DisplayName("Test getAgentInfo()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AgentInfo HealthService.getAgentInfo()"})
  void testGetAgentInfo() throws ApiException {
    // Arrange
    SignalsApi signalsApi = mock(SignalsApi.class);
    when(signalsApi.v1InfoGet()).thenThrow(new ApiException(1, "https://example.org/example"));

    // Act and Assert
    assertThrows(
        ApiRuntimeException.class,
        () ->
            new HealthService(mock(SystemApi.class), signalsApi, mock(AuthSession.class))
                .getAgentInfo());
    verify(signalsApi).v1InfoGet();
  }

  /**
   * Test {@link HealthService#getAgentInfo()}.
   *
   * <p>Method under test: {@link HealthService#getAgentInfo()}
   */
  @Test
  @DisplayName("Test getAgentInfo()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AgentInfo HealthService.getAgentInfo()"})
  void testGetAgentInfo2() throws ApiException {
    // Arrange
    SignalsApi signalsApi = mock(SignalsApi.class);
    when(signalsApi.v1InfoGet())
        .thenThrow(new ApiRuntimeException(new ApiException(1, "https://example.org/example")));

    // Act and Assert
    assertThrows(
        ApiRuntimeException.class,
        () ->
            new HealthService(mock(SystemApi.class), signalsApi, mock(AuthSession.class))
                .getAgentInfo());
    verify(signalsApi).v1InfoGet();
  }

  /**
   * Test {@link HealthService#getAgentInfo()}.
   *
   * <ul>
   *   <li>Given {@link SignalsApi} {@link SignalsApi#v1InfoGet()} return {@link AgentInfo} (default
   *       constructor).
   *   <li>Then return {@link AgentInfo} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link HealthService#getAgentInfo()}
   */
  @Test
  @DisplayName(
      "Test getAgentInfo(); given SignalsApi v1InfoGet() return AgentInfo (default constructor); then return AgentInfo (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AgentInfo HealthService.getAgentInfo()"})
  void testGetAgentInfo_givenSignalsApiV1InfoGetReturnAgentInfo_thenReturnAgentInfo()
      throws ApiException {
    // Arrange
    SignalsApi signalsApi = mock(SignalsApi.class);
    AgentInfo agentInfo = new AgentInfo();
    when(signalsApi.v1InfoGet()).thenReturn(agentInfo);

    // Act
    AgentInfo actualAgentInfo =
        new HealthService(mock(SystemApi.class), signalsApi, mock(AuthSession.class))
            .getAgentInfo();

    // Assert
    verify(signalsApi).v1InfoGet();
    assertSame(agentInfo, actualAgentInfo);
  }
}
