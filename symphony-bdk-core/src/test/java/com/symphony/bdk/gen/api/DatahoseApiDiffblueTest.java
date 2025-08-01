package com.symphony.bdk.gen.api;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.V5EventsReadBody;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import jakarta.ws.rs.client.Client;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DatahoseApiDiffblueTest {
  /**
   * Test {@link DatahoseApi#readEvents(String, String, V5EventsReadBody)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DatahoseApi#readEvents(String, String, V5EventsReadBody)}
   */
  @Test
  @DisplayName("Test readEvents(String, String, V5EventsReadBody); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V5EventList DatahoseApi.readEvents(String, String, V5EventsReadBody)"
  })
  void testReadEvents_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    DatahoseApi datahoseApi =
        new DatahoseApi(
            new ApiClientJersey2(
                mock(Client.class),
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"));

    // Act and Assert
    assertThrows(
        ApiException.class, () -> datahoseApi.readEvents(null, "ABC123", new V5EventsReadBody()));
  }

  /**
   * Test {@link DatahoseApi#readEvents(String, String, V5EventsReadBody)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DatahoseApi#readEvents(String, String, V5EventsReadBody)}
   */
  @Test
  @DisplayName("Test readEvents(String, String, V5EventsReadBody); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.V5EventList DatahoseApi.readEvents(String, String, V5EventsReadBody)"
  })
  void testReadEvents_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new DatahoseApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .readEvents("ABC123", null, null));
  }

  /**
   * Test {@link DatahoseApi#readEventsWithHttpInfo(String, String, V5EventsReadBody)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DatahoseApi#readEventsWithHttpInfo(String, String,
   * V5EventsReadBody)}
   */
  @Test
  @DisplayName(
      "Test readEventsWithHttpInfo(String, String, V5EventsReadBody); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse DatahoseApi.readEventsWithHttpInfo(String, String, V5EventsReadBody)"
  })
  void testReadEventsWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    DatahoseApi datahoseApi =
        new DatahoseApi(
            new ApiClientJersey2(
                mock(Client.class),
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"));

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            datahoseApi.readEventsWithHttpInfo(
                null, "https://example.org/example", new V5EventsReadBody()));
  }

  /**
   * Test {@link DatahoseApi#readEventsWithHttpInfo(String, String, V5EventsReadBody)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DatahoseApi#readEventsWithHttpInfo(String, String,
   * V5EventsReadBody)}
   */
  @Test
  @DisplayName(
      "Test readEventsWithHttpInfo(String, String, V5EventsReadBody); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.http.api.ApiResponse DatahoseApi.readEventsWithHttpInfo(String, String, V5EventsReadBody)"
  })
  void testReadEventsWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new DatahoseApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .readEventsWithHttpInfo("https://example.org/example", null, null));
  }
}
