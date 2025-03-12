package com.symphony.bdk.core.activity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.impl.AuthSessionImpl;
import com.symphony.bdk.core.auth.impl.BotAuthenticatorCertImpl;
import com.symphony.bdk.core.config.model.BdkCommonJwtConfig;
import com.symphony.bdk.core.config.model.BdkConfig;
import com.symphony.bdk.core.config.model.BdkRetryConfig;
import com.symphony.bdk.core.service.datafeed.impl.DatafeedLoopV1;
import com.symphony.bdk.core.service.version.AgentVersionService;
import com.symphony.bdk.gen.api.DatafeedApi;
import com.symphony.bdk.gen.api.model.UserV2;
import com.symphony.bdk.http.api.ApiClient;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import jakarta.ws.rs.client.Client;
import java.util.HashMap;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ActivityRegistryDiffblueTest {
  /**
   * Test {@link ActivityRegistry#register(AbstractActivity)}.
   * <p>
   * Method under test: {@link ActivityRegistry#register(AbstractActivity)}
   */
  @Test
  @DisplayName("Test register(AbstractActivity)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ActivityRegistry.register(AbstractActivity)"})
  void testRegister() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    DatafeedApi datafeedApi = new DatafeedApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));
    AuthSessionImpl authSession = new AuthSessionImpl(
        new BotAuthenticatorCertImpl(mock(BdkRetryConfig.class), "janedoe", mock(BdkCommonJwtConfig.class),
            mock(ApiClient.class), mock(ApiClient.class), mock(ApiClient.class), mock(AgentVersionService.class)));
    BdkConfig config = new BdkConfig();
    DatafeedLoopV1 datafeedLoop = new DatafeedLoopV1(datafeedApi, authSession, config, new UserV2());

    ActivityRegistry activityRegistry = new ActivityRegistry(new UserV2(), datafeedLoop);
    TestCommandActivity activity = new TestCommandActivity("Name");

    // Act
    activityRegistry.register(activity);

    // Assert
    List<AbstractActivity<?, ?>> activityList = activityRegistry.getActivityList();
    assertEquals(1, activityList.size());
    assertSame(activity, activityList.get(0));
  }

  /**
   * Test {@link ActivityRegistry#getActivityList()}.
   * <ul>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ActivityRegistry#getActivityList()}
   */
  @Test
  @DisplayName("Test getActivityList(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List ActivityRegistry.getActivityList()"})
  void testGetActivityList_thenReturnEmpty() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    DatafeedApi datafeedApi = new DatafeedApi(new ApiClientJersey2(mock(Client.class), "https://example.org/example",
        defaultHeaders, "https://example.org/example"));
    AuthSessionImpl authSession = new AuthSessionImpl(
        new BotAuthenticatorCertImpl(mock(BdkRetryConfig.class), "janedoe", mock(BdkCommonJwtConfig.class),
            mock(ApiClient.class), mock(ApiClient.class), mock(ApiClient.class), mock(AgentVersionService.class)));
    BdkConfig config = new BdkConfig();
    DatafeedLoopV1 datafeedLoop = new DatafeedLoopV1(datafeedApi, authSession, config, new UserV2());

    // Act and Assert
    assertTrue((new ActivityRegistry(new UserV2(), datafeedLoop)).getActivityList().isEmpty());
  }
}
