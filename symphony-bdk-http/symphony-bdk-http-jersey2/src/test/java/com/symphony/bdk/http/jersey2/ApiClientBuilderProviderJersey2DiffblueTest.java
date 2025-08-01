package com.symphony.bdk.http.jersey2;

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

class ApiClientBuilderProviderJersey2DiffblueTest {
  /**
   * Test {@link ApiClientBuilderProviderJersey2#newInstance()}.
   *
   * <p>Method under test: {@link ApiClientBuilderProviderJersey2#newInstance()}
   */
  @Test
  @DisplayName("Test newInstance()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiClientBuilder ApiClientBuilderProviderJersey2.newInstance()"})
  void testNewInstance() {
    // Arrange and Act
    ApiClientBuilder actualNewInstanceResult = new ApiClientBuilderProviderJersey2().newInstance();

    // Assert
    assertTrue(actualNewInstanceResult instanceof ApiClientBuilderJersey2);
    assertEquals(
        "https://acme.symphony.com", ((ApiClientBuilderJersey2) actualNewInstanceResult).basePath);
    assertNull(((ApiClientBuilderJersey2) actualNewInstanceResult).keyStoreBytes);
    assertNull(((ApiClientBuilderJersey2) actualNewInstanceResult).trustStoreBytes);
    assertNull(((ApiClientBuilderJersey2) actualNewInstanceResult).keyStorePassword);
    assertNull(((ApiClientBuilderJersey2) actualNewInstanceResult).proxyPassword);
    assertNull(((ApiClientBuilderJersey2) actualNewInstanceResult).proxyUrl);
    assertNull(((ApiClientBuilderJersey2) actualNewInstanceResult).proxyUser);
    assertNull(((ApiClientBuilderJersey2) actualNewInstanceResult).temporaryFolderPath);
    assertNull(((ApiClientBuilderJersey2) actualNewInstanceResult).trustStorePassword);
    Map<String, String> stringStringMap =
        ((ApiClientBuilderJersey2) actualNewInstanceResult).defaultHeaders;
    assertEquals(1, stringStringMap.size());
    assertEquals(15000, ((ApiClientBuilderJersey2) actualNewInstanceResult).connectionTimeout);
    assertEquals(20, ((ApiClientBuilderJersey2) actualNewInstanceResult).connectionPoolMax);
    assertEquals(20, ((ApiClientBuilderJersey2) actualNewInstanceResult).connectionPoolPerRoute);
    assertEquals(60000, ((ApiClientBuilderJersey2) actualNewInstanceResult).readTimeout);
    assertTrue(stringStringMap.containsKey("User-Agent"));
    assertTrue(((ApiClientBuilderJersey2) actualNewInstanceResult).authentications.isEmpty());
  }
}
