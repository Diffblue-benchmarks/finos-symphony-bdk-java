package com.symphony.bdk.http.jersey2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.http.api.ApiClient;
import java.util.Map;
import org.glassfish.jersey.client.JerseyClient;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ApiClientBuilderJersey2DiffblueTest {
  /**
   * Test new {@link ApiClientBuilderJersey2} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link ApiClientBuilderJersey2}
   */
  @Test
  @DisplayName("Test new ApiClientBuilderJersey2 (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiClientBuilderJersey2.<init>()"})
  void testNewApiClientBuilderJersey2() {
    // Arrange and Act
    ApiClientBuilderJersey2 actualApiClientBuilderJersey2 = new ApiClientBuilderJersey2();

    // Assert
    assertEquals("https://acme.symphony.com", actualApiClientBuilderJersey2.basePath);
    assertNull(actualApiClientBuilderJersey2.keyStoreBytes);
    assertNull(actualApiClientBuilderJersey2.trustStoreBytes);
    assertNull(actualApiClientBuilderJersey2.keyStorePassword);
    assertNull(actualApiClientBuilderJersey2.proxyPassword);
    assertNull(actualApiClientBuilderJersey2.proxyUrl);
    assertNull(actualApiClientBuilderJersey2.proxyUser);
    assertNull(actualApiClientBuilderJersey2.temporaryFolderPath);
    assertNull(actualApiClientBuilderJersey2.trustStorePassword);
    Map<String, String> stringStringMap = actualApiClientBuilderJersey2.defaultHeaders;
    assertEquals(1, stringStringMap.size());
    assertEquals(15000, actualApiClientBuilderJersey2.connectionTimeout);
    assertEquals(20, actualApiClientBuilderJersey2.connectionPoolMax);
    assertEquals(20, actualApiClientBuilderJersey2.connectionPoolPerRoute);
    assertEquals(60000, actualApiClientBuilderJersey2.readTimeout);
    assertTrue(stringStringMap.containsKey("User-Agent"));
    assertTrue(actualApiClientBuilderJersey2.authentications.isEmpty());
  }

  /**
   * Test new {@link ApiClientBuilderJersey2} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link ApiClientBuilderJersey2}
   */
  @Test
  @DisplayName("Test new ApiClientBuilderJersey2 (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiClientBuilderJersey2.<init>()"})
  void testNewApiClientBuilderJersey22() {
    // Arrange and Act
    ApiClientBuilderJersey2 actualApiClientBuilderJersey2 = new ApiClientBuilderJersey2();

    // Assert
    assertEquals("https://acme.symphony.com", actualApiClientBuilderJersey2.basePath);
    assertNull(actualApiClientBuilderJersey2.keyStoreBytes);
    assertNull(actualApiClientBuilderJersey2.trustStoreBytes);
    assertNull(actualApiClientBuilderJersey2.keyStorePassword);
    assertNull(actualApiClientBuilderJersey2.proxyPassword);
    assertNull(actualApiClientBuilderJersey2.proxyUrl);
    assertNull(actualApiClientBuilderJersey2.proxyUser);
    assertNull(actualApiClientBuilderJersey2.temporaryFolderPath);
    assertNull(actualApiClientBuilderJersey2.trustStorePassword);
    Map<String, String> stringStringMap = actualApiClientBuilderJersey2.defaultHeaders;
    assertEquals(1, stringStringMap.size());
    assertEquals(15000, actualApiClientBuilderJersey2.connectionTimeout);
    assertEquals(20, actualApiClientBuilderJersey2.connectionPoolMax);
    assertEquals(20, actualApiClientBuilderJersey2.connectionPoolPerRoute);
    assertEquals(60000, actualApiClientBuilderJersey2.readTimeout);
    assertTrue(stringStringMap.containsKey("User-Agent"));
    assertTrue(actualApiClientBuilderJersey2.authentications.isEmpty());
  }

  /**
   * Test {@link ApiClientBuilderJersey2#build()}.
   *
   * <p>Method under test: {@link ApiClientBuilderJersey2#build()}
   */
  @Test
  @DisplayName("Test build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiClient ApiClientBuilderJersey2.build()",
    "ApiClientBuilder ApiClientBuilderJersey2.withBasePath(String)",
    "ApiClientBuilder ApiClientBuilderJersey2.withTemporaryFolderPath(String)"
  })
  void testBuild() {
    // Arrange and Act
    ApiClient actualBuildResult = new ApiClientBuilderJersey2().build();

    // Assert
    assertTrue(actualBuildResult instanceof ApiClientJersey2);
    assertTrue(((ApiClientJersey2) actualBuildResult).httpClient instanceof JerseyClient);
    assertNull(((ApiClientJersey2) actualBuildResult).tempFolderPath);
    Map<String, String> stringStringMap = ((ApiClientJersey2) actualBuildResult).defaultHeaderMap;
    assertEquals(1, stringStringMap.size());
    assertTrue(((ApiClientJersey2) actualBuildResult).enforcedAuthenticationSchemes.isEmpty());
    String expectedGetResult =
        String.join("", "Symphony-BDK-Java/3.0.0 Java/", System.getProperty("java.version"));
    assertEquals(expectedGetResult, stringStringMap.get("User-Agent"));
  }

  /**
   * Test {@link ApiClientBuilderJersey2#build()}.
   *
   * <p>Method under test: {@link ApiClientBuilderJersey2#build()}
   */
  @Test
  @DisplayName("Test build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiClient ApiClientBuilderJersey2.build()",
    "ApiClientBuilder ApiClientBuilderJersey2.withBasePath(String)",
    "ApiClientBuilder ApiClientBuilderJersey2.withTemporaryFolderPath(String)"
  })
  void testBuild2() {
    // Arrange and Act
    ApiClient actualBuildResult = new ApiClientBuilderJersey2().build();

    // Assert
    assertTrue(actualBuildResult instanceof ApiClientJersey2);
    assertTrue(((ApiClientJersey2) actualBuildResult).httpClient instanceof JerseyClient);
    assertNull(((ApiClientJersey2) actualBuildResult).tempFolderPath);
    Map<String, String> stringStringMap = ((ApiClientJersey2) actualBuildResult).defaultHeaderMap;
    assertEquals(1, stringStringMap.size());
    assertTrue(((ApiClientJersey2) actualBuildResult).enforcedAuthenticationSchemes.isEmpty());
    String expectedGetResult =
        String.join("", "Symphony-BDK-Java/3.0.0 Java/", System.getProperty("java.version"));
    assertEquals(expectedGetResult, stringStringMap.get("User-Agent"));
  }
}
