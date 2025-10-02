package com.symphony.bdk.core.service.datafeed.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.AuthSession;
import com.symphony.bdk.core.config.model.BdkConfig;
import com.symphony.bdk.core.config.model.BdkDatahoseConfig;
import com.symphony.bdk.core.test.BdkRetryConfigTestHelper;
import com.symphony.bdk.gen.api.DatafeedApi;
import com.symphony.bdk.gen.api.DatahoseApi;
import com.symphony.bdk.gen.api.model.UserV2;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import jakarta.ws.rs.client.Client;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DatahoseLoopImplDiffblueTest {
  /**
   * Test {@link DatahoseLoopImpl#DatahoseLoopImpl(DatafeedApi, AuthSession, BdkConfig, UserV2,
   * DatahoseApi)}.
   *
   * <ul>
   *   <li>Given {@link BdkDatahoseConfig} (default constructor) Tag is {@code null}.
   *   <li>Then calls {@link UserV2#getUsername()}.
   * </ul>
   *
   * <p>Method under test: {@link DatahoseLoopImpl#DatahoseLoopImpl(DatafeedApi, AuthSession,
   * BdkConfig, UserV2, DatahoseApi)}
   */
  @Test
  @DisplayName(
      "Test new DatahoseLoopImpl(DatafeedApi, AuthSession, BdkConfig, UserV2, DatahoseApi); given BdkDatahoseConfig (default constructor) Tag is 'null'; then calls getUsername()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DatahoseLoopImpl.<init>(DatafeedApi, AuthSession, BdkConfig, UserV2, DatahoseApi)"
  })
  void testNewDatahoseLoopImpl_givenBdkDatahoseConfigTagIsNull_thenCallsGetUsername() {
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

    BdkDatahoseConfig bdkDatahoseConfig = new BdkDatahoseConfig();
    bdkDatahoseConfig.setEventTypes(new ArrayList<>());
    bdkDatahoseConfig.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    bdkDatahoseConfig.setTag(null);

    BdkConfig config = mock(BdkConfig.class);
    when(config.getDatahose()).thenReturn(bdkDatahoseConfig);

    UserV2 botInfo = mock(UserV2.class);
    when(botInfo.getUsername()).thenReturn("janedoe");

    // Act
    DatahoseLoopImpl actualDatahoseLoopImpl =
        new DatahoseLoopImpl(datafeedApi, authSession, config, botInfo, mock(DatahoseApi.class));

    // Assert
    verify(config, atLeast(1)).getDatahose();
    verify(datafeedApi).getApiClient();
    verify(botInfo).getUsername();
    assertEquals("", actualDatahoseLoopImpl.getAckId());
    assertEquals(0L, actualDatahoseLoopImpl.lastPullTimestamp());
    assertFalse(actualDatahoseLoopImpl.started.get());
  }

  /**
   * Test {@link DatahoseLoopImpl#DatahoseLoopImpl(DatafeedApi, AuthSession, BdkConfig, UserV2,
   * DatahoseApi)}.
   *
   * <ul>
   *   <li>Given {@link BdkDatahoseConfig} (default constructor) Tag is {@code readEvents}.
   *   <li>When {@link UserV2}.
   * </ul>
   *
   * <p>Method under test: {@link DatahoseLoopImpl#DatahoseLoopImpl(DatafeedApi, AuthSession,
   * BdkConfig, UserV2, DatahoseApi)}
   */
  @Test
  @DisplayName(
      "Test new DatahoseLoopImpl(DatafeedApi, AuthSession, BdkConfig, UserV2, DatahoseApi); given BdkDatahoseConfig (default constructor) Tag is 'readEvents'; when UserV2")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DatahoseLoopImpl.<init>(DatafeedApi, AuthSession, BdkConfig, UserV2, DatahoseApi)"
  })
  void testNewDatahoseLoopImpl_givenBdkDatahoseConfigTagIsReadEvents_whenUserV2() {
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

    BdkDatahoseConfig bdkDatahoseConfig = new BdkDatahoseConfig();
    bdkDatahoseConfig.setEventTypes(new ArrayList<>());
    bdkDatahoseConfig.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    bdkDatahoseConfig.setTag("readEvents");

    BdkConfig config = mock(BdkConfig.class);
    when(config.getDatahose()).thenReturn(bdkDatahoseConfig);

    // Act
    DatahoseLoopImpl actualDatahoseLoopImpl =
        new DatahoseLoopImpl(
            datafeedApi, authSession, config, mock(UserV2.class), mock(DatahoseApi.class));

    // Assert
    verify(config, atLeast(1)).getDatahose();
    verify(datafeedApi).getApiClient();
    assertEquals("", actualDatahoseLoopImpl.getAckId());
    assertEquals(0L, actualDatahoseLoopImpl.lastPullTimestamp());
    assertFalse(actualDatahoseLoopImpl.started.get());
  }

  /**
   * Test {@link DatahoseLoopImpl#DatahoseLoopImpl(DatafeedApi, AuthSession, BdkConfig, UserV2,
   * DatahoseApi)}.
   *
   * <ul>
   *   <li>Then calls {@link UserV2#getUsername()}.
   * </ul>
   *
   * <p>Method under test: {@link DatahoseLoopImpl#DatahoseLoopImpl(DatafeedApi, AuthSession,
   * BdkConfig, UserV2, DatahoseApi)}
   */
  @Test
  @DisplayName(
      "Test new DatahoseLoopImpl(DatafeedApi, AuthSession, BdkConfig, UserV2, DatahoseApi); then calls getUsername()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DatahoseLoopImpl.<init>(DatafeedApi, AuthSession, BdkConfig, UserV2, DatahoseApi)"
  })
  void testNewDatahoseLoopImpl_thenCallsGetUsername() {
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

    BdkDatahoseConfig bdkDatahoseConfig = new BdkDatahoseConfig();
    bdkDatahoseConfig.setEventTypes(new ArrayList<>());
    bdkDatahoseConfig.setRetry(BdkRetryConfigTestHelper.ofMinimalInterval(3));
    bdkDatahoseConfig.setTag("");

    BdkConfig config = mock(BdkConfig.class);
    when(config.getDatahose()).thenReturn(bdkDatahoseConfig);

    UserV2 botInfo = mock(UserV2.class);
    when(botInfo.getUsername()).thenReturn("janedoe");

    // Act
    DatahoseLoopImpl actualDatahoseLoopImpl =
        new DatahoseLoopImpl(datafeedApi, authSession, config, botInfo, mock(DatahoseApi.class));

    // Assert
    verify(config, atLeast(1)).getDatahose();
    verify(datafeedApi).getApiClient();
    verify(botInfo).getUsername();
    assertEquals("", actualDatahoseLoopImpl.getAckId());
    assertEquals(0L, actualDatahoseLoopImpl.lastPullTimestamp());
    assertFalse(actualDatahoseLoopImpl.started.get());
  }
}
