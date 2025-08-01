package com.symphony.bdk.spring.config;

import static org.junit.jupiter.api.Assertions.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.http.api.ApiClient;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkApiClientsConfigDiffblueTest {
  /**
   * Test {@link BdkApiClientsConfig#appEntitlementApi(ApiClient)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ApiClient is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkApiClientsConfig#appEntitlementApi(ApiClient)}
   */
  @Test
  @DisplayName("Test appEntitlementApi(ApiClient); when 'null'; then return ApiClient is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.AppEntitlementApi BdkApiClientsConfig.appEntitlementApi(ApiClient)"
  })
  void testAppEntitlementApi_whenNull_thenReturnApiClientIsNull() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange, Act and Assert
    assertNull(new BdkApiClientsConfig().appEntitlementApi(null).getApiClient());
  }

  /**
   * Test {@link BdkApiClientsConfig#applicationApi(ApiClient)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ApiClient is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkApiClientsConfig#applicationApi(ApiClient)}
   */
  @Test
  @DisplayName("Test applicationApi(ApiClient); when 'null'; then return ApiClient is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.ApplicationApi BdkApiClientsConfig.applicationApi(ApiClient)"
  })
  void testApplicationApi_whenNull_thenReturnApiClientIsNull() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange, Act and Assert
    assertNull(new BdkApiClientsConfig().applicationApi(null).getApiClient());
  }

  /**
   * Test {@link BdkApiClientsConfig#attachmentsApi(ApiClient)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ApiClient is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkApiClientsConfig#attachmentsApi(ApiClient)}
   */
  @Test
  @DisplayName("Test attachmentsApi(ApiClient); when 'null'; then return ApiClient is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.AttachmentsApi BdkApiClientsConfig.attachmentsApi(ApiClient)"
  })
  void testAttachmentsApi_whenNull_thenReturnApiClientIsNull() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange, Act and Assert
    assertNull(new BdkApiClientsConfig().attachmentsApi(null).getApiClient());
  }

  /**
   * Test {@link BdkApiClientsConfig#auditTrailApi(ApiClient)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ApiClient is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkApiClientsConfig#auditTrailApi(ApiClient)}
   */
  @Test
  @DisplayName("Test auditTrailApi(ApiClient); when 'null'; then return ApiClient is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.AuditTrailApi BdkApiClientsConfig.auditTrailApi(ApiClient)"
  })
  void testAuditTrailApi_whenNull_thenReturnApiClientIsNull() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange, Act and Assert
    assertNull(new BdkApiClientsConfig().auditTrailApi(null).getApiClient());
  }

  /**
   * Test {@link BdkApiClientsConfig#certificatePodApi(ApiClient)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ApiClient is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkApiClientsConfig#certificatePodApi(ApiClient)}
   */
  @Test
  @DisplayName("Test certificatePodApi(ApiClient); when 'null'; then return ApiClient is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.CertificatePodApi BdkApiClientsConfig.certificatePodApi(ApiClient)"
  })
  void testCertificatePodApi_whenNull_thenReturnApiClientIsNull() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange, Act and Assert
    assertNull(new BdkApiClientsConfig().certificatePodApi(null).getApiClient());
  }

  /**
   * Test {@link BdkApiClientsConfig#connectionApi(ApiClient)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ApiClient is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkApiClientsConfig#connectionApi(ApiClient)}
   */
  @Test
  @DisplayName("Test connectionApi(ApiClient); when 'null'; then return ApiClient is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.ConnectionApi BdkApiClientsConfig.connectionApi(ApiClient)"
  })
  void testConnectionApi_whenNull_thenReturnApiClientIsNull() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange, Act and Assert
    assertNull(new BdkApiClientsConfig().connectionApi(null).getApiClient());
  }

  /**
   * Test {@link BdkApiClientsConfig#datafeedApi(ApiClient)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ApiClient is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkApiClientsConfig#datafeedApi(ApiClient)}
   */
  @Test
  @DisplayName("Test datafeedApi(ApiClient); when 'null'; then return ApiClient is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.DatafeedApi BdkApiClientsConfig.datafeedApi(ApiClient)"
  })
  void testDatafeedApi_whenNull_thenReturnApiClientIsNull() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange, Act and Assert
    assertNull(new BdkApiClientsConfig().datafeedApi(null).getApiClient());
  }

  /**
   * Test {@link BdkApiClientsConfig#datahoseApi(ApiClient)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ApiClient is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkApiClientsConfig#datahoseApi(ApiClient)}
   */
  @Test
  @DisplayName("Test datahoseApi(ApiClient); when 'null'; then return ApiClient is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.DatafeedApi BdkApiClientsConfig.datahoseApi(ApiClient)"
  })
  void testDatahoseApi_whenNull_thenReturnApiClientIsNull() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange, Act and Assert
    assertNull(new BdkApiClientsConfig().datahoseApi(null).getApiClient());
  }

  /**
   * Test {@link BdkApiClientsConfig#defaultApi(ApiClient)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ApiClient is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkApiClientsConfig#defaultApi(ApiClient)}
   */
  @Test
  @DisplayName("Test defaultApi(ApiClient); when 'null'; then return ApiClient is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.DefaultApi BdkApiClientsConfig.defaultApi(ApiClient)"
  })
  void testDefaultApi_whenNull_thenReturnApiClientIsNull() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange, Act and Assert
    assertNull(new BdkApiClientsConfig().defaultApi(null).getApiClient());
  }

  /**
   * Test {@link BdkApiClientsConfig#disclaimerApi(ApiClient)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ApiClient is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkApiClientsConfig#disclaimerApi(ApiClient)}
   */
  @Test
  @DisplayName("Test disclaimerApi(ApiClient); when 'null'; then return ApiClient is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.DisclaimerApi BdkApiClientsConfig.disclaimerApi(ApiClient)"
  })
  void testDisclaimerApi_whenNull_thenReturnApiClientIsNull() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange, Act and Assert
    assertNull(new BdkApiClientsConfig().disclaimerApi(null).getApiClient());
  }

  /**
   * Test {@link BdkApiClientsConfig#dlpPoliciesAndDictionaryManagementApi(ApiClient)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ApiClient is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * BdkApiClientsConfig#dlpPoliciesAndDictionaryManagementApi(ApiClient)}
   */
  @Test
  @DisplayName(
      "Test dlpPoliciesAndDictionaryManagementApi(ApiClient); when 'null'; then return ApiClient is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.DlpPoliciesAndDictionaryManagementApi BdkApiClientsConfig.dlpPoliciesAndDictionaryManagementApi(ApiClient)"
  })
  void testDlpPoliciesAndDictionaryManagementApi_whenNull_thenReturnApiClientIsNull() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange, Act and Assert
    assertNull(
        new BdkApiClientsConfig().dlpPoliciesAndDictionaryManagementApi(null).getApiClient());
  }

  /**
   * Test {@link BdkApiClientsConfig#infoBarriersApi(ApiClient)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ApiClient is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkApiClientsConfig#infoBarriersApi(ApiClient)}
   */
  @Test
  @DisplayName("Test infoBarriersApi(ApiClient); when 'null'; then return ApiClient is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.InfoBarriersApi BdkApiClientsConfig.infoBarriersApi(ApiClient)"
  })
  void testInfoBarriersApi_whenNull_thenReturnApiClientIsNull() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange, Act and Assert
    assertNull(new BdkApiClientsConfig().infoBarriersApi(null).getApiClient());
  }

  /**
   * Test {@link BdkApiClientsConfig#messagesApi(ApiClient)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ApiClient is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkApiClientsConfig#messagesApi(ApiClient)}
   */
  @Test
  @DisplayName("Test messagesApi(ApiClient); when 'null'; then return ApiClient is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.MessagesApi BdkApiClientsConfig.messagesApi(ApiClient)"
  })
  void testMessagesApi_whenNull_thenReturnApiClientIsNull() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange, Act and Assert
    assertNull(new BdkApiClientsConfig().messagesApi(null).getApiClient());
  }

  /**
   * Test {@link BdkApiClientsConfig#messageApi(ApiClient)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ApiClient is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkApiClientsConfig#messageApi(ApiClient)}
   */
  @Test
  @DisplayName("Test messageApi(ApiClient); when 'null'; then return ApiClient is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.MessageApi BdkApiClientsConfig.messageApi(ApiClient)"
  })
  void testMessageApi_whenNull_thenReturnApiClientIsNull() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange, Act and Assert
    assertNull(new BdkApiClientsConfig().messageApi(null).getApiClient());
  }

  /**
   * Test {@link BdkApiClientsConfig#messageSuppressionApi(ApiClient)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ApiClient is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkApiClientsConfig#messageSuppressionApi(ApiClient)}
   */
  @Test
  @DisplayName(
      "Test messageSuppressionApi(ApiClient); when 'null'; then return ApiClient is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.MessageSuppressionApi BdkApiClientsConfig.messageSuppressionApi(ApiClient)"
  })
  void testMessageSuppressionApi_whenNull_thenReturnApiClientIsNull() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange, Act and Assert
    assertNull(new BdkApiClientsConfig().messageSuppressionApi(null).getApiClient());
  }

  /**
   * Test {@link BdkApiClientsConfig#podApi(ApiClient)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ApiClient is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkApiClientsConfig#podApi(ApiClient)}
   */
  @Test
  @DisplayName("Test podApi(ApiClient); when 'null'; then return ApiClient is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.symphony.bdk.gen.api.PodApi BdkApiClientsConfig.podApi(ApiClient)"})
  void testPodApi_whenNull_thenReturnApiClientIsNull() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange, Act and Assert
    assertNull(new BdkApiClientsConfig().podApi(null).getApiClient());
  }

  /**
   * Test {@link BdkApiClientsConfig#presenceApi(ApiClient)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ApiClient is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkApiClientsConfig#presenceApi(ApiClient)}
   */
  @Test
  @DisplayName("Test presenceApi(ApiClient); when 'null'; then return ApiClient is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.PresenceApi BdkApiClientsConfig.presenceApi(ApiClient)"
  })
  void testPresenceApi_whenNull_thenReturnApiClientIsNull() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange, Act and Assert
    assertNull(new BdkApiClientsConfig().presenceApi(null).getApiClient());
  }

  /**
   * Test {@link BdkApiClientsConfig#roomMembershipApi(ApiClient)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ApiClient is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkApiClientsConfig#roomMembershipApi(ApiClient)}
   */
  @Test
  @DisplayName("Test roomMembershipApi(ApiClient); when 'null'; then return ApiClient is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.RoomMembershipApi BdkApiClientsConfig.roomMembershipApi(ApiClient)"
  })
  void testRoomMembershipApi_whenNull_thenReturnApiClientIsNull() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange, Act and Assert
    assertNull(new BdkApiClientsConfig().roomMembershipApi(null).getApiClient());
  }

  /**
   * Test {@link BdkApiClientsConfig#sessionApi(ApiClient)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ApiClient is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkApiClientsConfig#sessionApi(ApiClient)}
   */
  @Test
  @DisplayName("Test sessionApi(ApiClient); when 'null'; then return ApiClient is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.SessionApi BdkApiClientsConfig.sessionApi(ApiClient)"
  })
  void testSessionApi_whenNull_thenReturnApiClientIsNull() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange, Act and Assert
    assertNull(new BdkApiClientsConfig().sessionApi(null).getApiClient());
  }

  /**
   * Test {@link BdkApiClientsConfig#securityApi(ApiClient)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ApiClient is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkApiClientsConfig#securityApi(ApiClient)}
   */
  @Test
  @DisplayName("Test securityApi(ApiClient); when 'null'; then return ApiClient is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.SecurityApi BdkApiClientsConfig.securityApi(ApiClient)"
  })
  void testSecurityApi_whenNull_thenReturnApiClientIsNull() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange, Act and Assert
    assertNull(new BdkApiClientsConfig().securityApi(null).getApiClient());
  }

  /**
   * Test {@link BdkApiClientsConfig#shareApi(ApiClient)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ApiClient is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkApiClientsConfig#shareApi(ApiClient)}
   */
  @Test
  @DisplayName("Test shareApi(ApiClient); when 'null'; then return ApiClient is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.symphony.bdk.gen.api.ShareApi BdkApiClientsConfig.shareApi(ApiClient)"})
  void testShareApi_whenNull_thenReturnApiClientIsNull() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange, Act and Assert
    assertNull(new BdkApiClientsConfig().shareApi(null).getApiClient());
  }

  /**
   * Test {@link BdkApiClientsConfig#signalsApi(ApiClient)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ApiClient is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkApiClientsConfig#signalsApi(ApiClient)}
   */
  @Test
  @DisplayName("Test signalsApi(ApiClient); when 'null'; then return ApiClient is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.SignalsApi BdkApiClientsConfig.signalsApi(ApiClient)"
  })
  void testSignalsApi_whenNull_thenReturnApiClientIsNull() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange, Act and Assert
    assertNull(new BdkApiClientsConfig().signalsApi(null).getApiClient());
  }

  /**
   * Test {@link BdkApiClientsConfig#streamsApi(ApiClient)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ApiClient is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkApiClientsConfig#streamsApi(ApiClient)}
   */
  @Test
  @DisplayName("Test streamsApi(ApiClient); when 'null'; then return ApiClient is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.StreamsApi BdkApiClientsConfig.streamsApi(ApiClient)"
  })
  void testStreamsApi_whenNull_thenReturnApiClientIsNull() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange, Act and Assert
    assertNull(new BdkApiClientsConfig().streamsApi(null).getApiClient());
  }

  /**
   * Test {@link BdkApiClientsConfig#systemApi(ApiClient)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ApiClient is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkApiClientsConfig#systemApi(ApiClient)}
   */
  @Test
  @DisplayName("Test systemApi(ApiClient); when 'null'; then return ApiClient is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.symphony.bdk.gen.api.SystemApi BdkApiClientsConfig.systemApi(ApiClient)"})
  void testSystemApi_whenNull_thenReturnApiClientIsNull() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange, Act and Assert
    assertNull(new BdkApiClientsConfig().systemApi(null).getApiClient());
  }

  /**
   * Test {@link BdkApiClientsConfig#userApi(ApiClient)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ApiClient is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkApiClientsConfig#userApi(ApiClient)}
   */
  @Test
  @DisplayName("Test userApi(ApiClient); when 'null'; then return ApiClient is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.symphony.bdk.gen.api.UserApi BdkApiClientsConfig.userApi(ApiClient)"})
  void testUserApi_whenNull_thenReturnApiClientIsNull() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange, Act and Assert
    assertNull(new BdkApiClientsConfig().userApi(null).getApiClient());
  }

  /**
   * Test {@link BdkApiClientsConfig#usersApi(ApiClient)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ApiClient is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkApiClientsConfig#usersApi(ApiClient)}
   */
  @Test
  @DisplayName("Test usersApi(ApiClient); when 'null'; then return ApiClient is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.symphony.bdk.gen.api.UsersApi BdkApiClientsConfig.usersApi(ApiClient)"})
  void testUsersApi_whenNull_thenReturnApiClientIsNull() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange, Act and Assert
    assertNull(new BdkApiClientsConfig().usersApi(null).getApiClient());
  }

  /**
   * Test {@link BdkApiClientsConfig#utilApi(ApiClient)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ApiClient is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkApiClientsConfig#utilApi(ApiClient)}
   */
  @Test
  @DisplayName("Test utilApi(ApiClient); when 'null'; then return ApiClient is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.symphony.bdk.gen.api.UtilApi BdkApiClientsConfig.utilApi(ApiClient)"})
  void testUtilApi_whenNull_thenReturnApiClientIsNull() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange, Act and Assert
    assertNull(new BdkApiClientsConfig().utilApi(null).getApiClient());
  }

  /**
   * Test {@link BdkApiClientsConfig#violationsApi(ApiClient)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ApiClient is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BdkApiClientsConfig#violationsApi(ApiClient)}
   */
  @Test
  @DisplayName("Test violationsApi(ApiClient); when 'null'; then return ApiClient is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.ViolationsApi BdkApiClientsConfig.violationsApi(ApiClient)"
  })
  void testViolationsApi_whenNull_thenReturnApiClientIsNull() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange, Act and Assert
    assertNull(new BdkApiClientsConfig().violationsApi(null).getApiClient());
  }
}
