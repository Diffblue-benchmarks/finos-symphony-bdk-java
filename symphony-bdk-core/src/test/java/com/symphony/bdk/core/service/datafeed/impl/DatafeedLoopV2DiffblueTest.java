package com.symphony.bdk.core.service.datafeed.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.AuthSession;
import com.symphony.bdk.core.config.model.BdkConfig;
import com.symphony.bdk.core.config.model.BdkRetryConfig;
import com.symphony.bdk.core.service.datafeed.exception.NestedRetryException;
import com.symphony.bdk.gen.api.DatafeedApi;
import com.symphony.bdk.gen.api.model.UserV2;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import jakarta.ws.rs.client.Client;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DatafeedLoopV2DiffblueTest {
  /**
   * Test {@link DatafeedLoopV2#DatafeedLoopV2(DatafeedApi, AuthSession, BdkConfig, UserV2)}.
   * <ul>
   *   <li>Given {@link BdkRetryConfig#BdkRetryConfig()}.</li>
   *   <li>Then return AckId is empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link DatafeedLoopV2#DatafeedLoopV2(DatafeedApi, AuthSession, BdkConfig, UserV2)}
   */
  @Test
  @DisplayName("Test new DatafeedLoopV2(DatafeedApi, AuthSession, BdkConfig, UserV2); given BdkRetryConfig(); then return AckId is empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void DatafeedLoopV2.<init>(DatafeedApi, AuthSession, BdkConfig, UserV2)"})
  void testNewDatafeedLoopV2_givenBdkRetryConfig_thenReturnAckIdIsEmptyString() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    DatafeedApi datafeedApi = mock(DatafeedApi.class);
    when(datafeedApi.getApiClient()).thenReturn(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));
    AuthSession authSession = mock(AuthSession.class);
    BdkConfig config = mock(BdkConfig.class);
    when(config.getDatafeedRetryConfig()).thenReturn(new BdkRetryConfig());

    // Act
    DatafeedLoopV2 actualDatafeedLoopV2 = new DatafeedLoopV2(datafeedApi, authSession, config, mock(UserV2.class));

    // Assert
    verify(config).getDatafeedRetryConfig();
    verify(datafeedApi).getApiClient();
    assertEquals("", actualDatafeedLoopV2.getAckId());
    assertFalse(actualDatafeedLoopV2.started.get());
  }

  /**
   * Test {@link DatafeedLoopV2#DatafeedLoopV2(DatafeedApi, AuthSession, BdkConfig, UserV2)}.
   * <ul>
   *   <li>Then throw {@link NestedRetryException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DatafeedLoopV2#DatafeedLoopV2(DatafeedApi, AuthSession, BdkConfig, UserV2)}
   */
  @Test
  @DisplayName("Test new DatafeedLoopV2(DatafeedApi, AuthSession, BdkConfig, UserV2); then throw NestedRetryException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void DatafeedLoopV2.<init>(DatafeedApi, AuthSession, BdkConfig, UserV2)"})
  void testNewDatafeedLoopV2_thenThrowNestedRetryException() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    DatafeedApi datafeedApi = mock(DatafeedApi.class);
    when(datafeedApi.getApiClient()).thenReturn(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));
    AuthSession authSession = mock(AuthSession.class);
    BdkConfig config = mock(BdkConfig.class);
    when(config.getDatafeedRetryConfig()).thenThrow(new NestedRetryException("An error occurred", new Throwable()));

    // Act and Assert
    assertThrows(NestedRetryException.class,
        () -> new DatafeedLoopV2(datafeedApi, authSession, config, mock(UserV2.class)));

    verify(config).getDatafeedRetryConfig();
    verify(datafeedApi).getApiClient();
  }
}
