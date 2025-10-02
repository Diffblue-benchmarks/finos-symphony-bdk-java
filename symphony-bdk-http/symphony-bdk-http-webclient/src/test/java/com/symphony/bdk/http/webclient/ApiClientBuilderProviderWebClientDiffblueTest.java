package com.symphony.bdk.http.webclient;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.http.api.ApiClientBuilder;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ApiClientBuilderProviderWebClientDiffblueTest {
  /**
   * Test {@link ApiClientBuilderProviderWebClient#newInstance()}.
   *
   * <p>Method under test: {@link ApiClientBuilderProviderWebClient#newInstance()}
   */
  @Test
  @DisplayName("Test newInstance()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiClientBuilder ApiClientBuilderProviderWebClient.newInstance()"})
  void testNewInstance() {
    // Arrange and Act
    ApiClientBuilder actualNewInstanceResult =
        new ApiClientBuilderProviderWebClient().newInstance();

    // Assert
    assertTrue(actualNewInstanceResult instanceof ApiClientBuilderWebClient);
    assertEquals("", ((ApiClientBuilderWebClient) actualNewInstanceResult).basePath);
    assertNull(((ApiClientBuilderWebClient) actualNewInstanceResult).keyStoreBytes);
    assertNull(((ApiClientBuilderWebClient) actualNewInstanceResult).trustStoreBytes);
    assertNull(((ApiClientBuilderWebClient) actualNewInstanceResult).keyStorePassword);
    assertNull(((ApiClientBuilderWebClient) actualNewInstanceResult).proxyHost);
    assertNull(((ApiClientBuilderWebClient) actualNewInstanceResult).proxyPassword);
    assertNull(((ApiClientBuilderWebClient) actualNewInstanceResult).proxyUser);
    assertNull(((ApiClientBuilderWebClient) actualNewInstanceResult).trustStorePassword);
    assertEquals(-1, ((ApiClientBuilderWebClient) actualNewInstanceResult).proxyPort);
    Map<String, String> stringStringMap =
        ((ApiClientBuilderWebClient) actualNewInstanceResult).defaultHeaders;
    assertEquals(1, stringStringMap.size());
    assertEquals(15000, ((ApiClientBuilderWebClient) actualNewInstanceResult).connectionTimeout);
    assertEquals(60000, ((ApiClientBuilderWebClient) actualNewInstanceResult).readTimeout);
    assertTrue(stringStringMap.containsKey("User-Agent"));
    assertTrue(((ApiClientBuilderWebClient) actualNewInstanceResult).authentications.isEmpty());
  }
}
