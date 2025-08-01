package com.symphony.bdk.gen.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.FileExtension;
import com.symphony.bdk.gen.api.model.FileExtensionsResponse;
import com.symphony.bdk.gen.api.model.MessageIds;
import com.symphony.bdk.http.api.ApiClient;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.api.ApiResponse;
import com.symphony.bdk.http.api.Pair;
import com.symphony.bdk.http.api.util.TypeReference;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.Invocation.Builder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jakarta.ws.rs.core.Response.Status.Family;
import jakarta.ws.rs.core.Response.StatusType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.glassfish.jersey.message.internal.OutboundJaxrsResponse;
import org.glassfish.jersey.message.internal.OutboundMessageContext;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class DefaultApiDiffblueTest {
  /**
   * Test {@link DefaultApi#deleteAllowedFileExtension(String, String)}.
   *
   * <ul>
   *   <li>When {@code %20}.
   *   <li>Then calls {@link Client#target(String)}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#deleteAllowedFileExtension(String, String)}
   */
  @Test
  @DisplayName(
      "Test deleteAllowedFileExtension(String, String); when '%20'; then calls target(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DefaultApi.deleteAllowedFileExtension(String, String)"})
  void testDeleteAllowedFileExtension_when20_thenCallsTarget() throws ApiException {
    // Arrange
    StatusType status = mock(StatusType.class);
    when(status.getStatusCode()).thenReturn(1);
    when(status.getFamily()).thenReturn(Family.SUCCESSFUL);
    Builder builder = mock(Builder.class);
    when(builder.method(Mockito.<String>any(), Mockito.<Entity<?>>any()))
        .thenReturn(new OutboundJaxrsResponse(status, new OutboundMessageContext()));
    Builder builder2 = mock(Builder.class);
    when(builder2.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder);
    Builder builder3 = mock(Builder.class);
    when(builder3.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder2);
    Builder builder4 = mock(Builder.class);
    when(builder4.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder3);
    Builder builder5 = mock(Builder.class);
    when(builder5.accept(isA(String[].class))).thenReturn(builder4);
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder5);
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act
    new DefaultApi(
            new ApiClientJersey2(
                httpClient,
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"))
        .deleteAllowedFileExtension("ABC123", "%20");

    // Assert
    verify(httpClient).target("https://example.org/example/file_ext/v1/allowed_extensions/%2520");
    verify(builder5).accept(isA(String[].class));
    verify(builder2).header(eq("Delivered-To"), isA(Object.class));
    verify(builder4).header(eq("X-Trace-Id"), isA(Object.class));
    verify(builder3).header(eq("sessionToken"), isA(Object.class));
    verify(builder).method(eq("DELETE"), isA(Entity.class));
    verify(webTarget).request();
    verify(status).getFamily();
    verify(status, atLeast(1)).getStatusCode();
  }

  /**
   * Test {@link DefaultApi#deleteAllowedFileExtension(String, String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then calls {@link Client#target(String)}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#deleteAllowedFileExtension(String, String)}
   */
  @Test
  @DisplayName(
      "Test deleteAllowedFileExtension(String, String); when '42'; then calls target(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DefaultApi.deleteAllowedFileExtension(String, String)"})
  void testDeleteAllowedFileExtension_when42_thenCallsTarget() throws ApiException {
    // Arrange
    StatusType status = mock(StatusType.class);
    when(status.getStatusCode()).thenReturn(1);
    when(status.getFamily()).thenReturn(Family.SUCCESSFUL);
    Builder builder = mock(Builder.class);
    when(builder.method(Mockito.<String>any(), Mockito.<Entity<?>>any()))
        .thenReturn(new OutboundJaxrsResponse(status, new OutboundMessageContext()));
    Builder builder2 = mock(Builder.class);
    when(builder2.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder);
    Builder builder3 = mock(Builder.class);
    when(builder3.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder2);
    Builder builder4 = mock(Builder.class);
    when(builder4.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder3);
    Builder builder5 = mock(Builder.class);
    when(builder5.accept(isA(String[].class))).thenReturn(builder4);
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder5);
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act
    new DefaultApi(
            new ApiClientJersey2(
                httpClient,
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"))
        .deleteAllowedFileExtension("ABC123", "42");

    // Assert
    verify(httpClient).target("https://example.org/example/file_ext/v1/allowed_extensions/42");
    verify(builder5).accept(isA(String[].class));
    verify(builder2).header(eq("Delivered-To"), isA(Object.class));
    verify(builder4).header(eq("X-Trace-Id"), isA(Object.class));
    verify(builder3).header(eq("sessionToken"), isA(Object.class));
    verify(builder).method(eq("DELETE"), isA(Entity.class));
    verify(webTarget).request();
    verify(status).getFamily();
    verify(status, atLeast(1)).getStatusCode();
  }

  /**
   * Test {@link DefaultApi#deleteAllowedFileExtension(String, String)}.
   *
   * <ul>
   *   <li>When {@code application/json ;U}.
   *   <li>Then calls {@link Client#target(String)}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#deleteAllowedFileExtension(String, String)}
   */
  @Test
  @DisplayName(
      "Test deleteAllowedFileExtension(String, String); when 'application/json ;U'; then calls target(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DefaultApi.deleteAllowedFileExtension(String, String)"})
  void testDeleteAllowedFileExtension_whenApplicationJsonU_thenCallsTarget() throws ApiException {
    // Arrange
    StatusType status = mock(StatusType.class);
    when(status.getStatusCode()).thenReturn(1);
    when(status.getFamily()).thenReturn(Family.SUCCESSFUL);
    Builder builder = mock(Builder.class);
    when(builder.method(Mockito.<String>any(), Mockito.<Entity<?>>any()))
        .thenReturn(new OutboundJaxrsResponse(status, new OutboundMessageContext()));
    Builder builder2 = mock(Builder.class);
    when(builder2.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder);
    Builder builder3 = mock(Builder.class);
    when(builder3.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder2);
    Builder builder4 = mock(Builder.class);
    when(builder4.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder3);
    Builder builder5 = mock(Builder.class);
    when(builder5.accept(isA(String[].class))).thenReturn(builder4);
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder5);
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act
    new DefaultApi(
            new ApiClientJersey2(
                httpClient,
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"))
        .deleteAllowedFileExtension("ABC123", "application/json ;U");

    // Assert
    verify(httpClient)
        .target(
            "https://example.org/example/file_ext/v1/allowed_extensions/application%2Fjson%20%3BU");
    verify(builder5).accept(isA(String[].class));
    verify(builder2).header(eq("Delivered-To"), isA(Object.class));
    verify(builder4).header(eq("X-Trace-Id"), isA(Object.class));
    verify(builder3).header(eq("sessionToken"), isA(Object.class));
    verify(builder).method(eq("DELETE"), isA(Entity.class));
    verify(webTarget).request();
    verify(status).getFamily();
    verify(status, atLeast(1)).getStatusCode();
  }

  /**
   * Test {@link DefaultApi#deleteAllowedFileExtension(String, String)}.
   *
   * <ul>
   *   <li>When {@code \+}.
   *   <li>Then calls {@link Client#target(String)}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#deleteAllowedFileExtension(String, String)}
   */
  @Test
  @DisplayName(
      "Test deleteAllowedFileExtension(String, String); when '\\+'; then calls target(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DefaultApi.deleteAllowedFileExtension(String, String)"})
  void testDeleteAllowedFileExtension_whenBackslashPlusSign_thenCallsTarget() throws ApiException {
    // Arrange
    StatusType status = mock(StatusType.class);
    when(status.getStatusCode()).thenReturn(1);
    when(status.getFamily()).thenReturn(Family.SUCCESSFUL);
    Builder builder = mock(Builder.class);
    when(builder.method(Mockito.<String>any(), Mockito.<Entity<?>>any()))
        .thenReturn(new OutboundJaxrsResponse(status, new OutboundMessageContext()));
    Builder builder2 = mock(Builder.class);
    when(builder2.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder);
    Builder builder3 = mock(Builder.class);
    when(builder3.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder2);
    Builder builder4 = mock(Builder.class);
    when(builder4.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder3);
    Builder builder5 = mock(Builder.class);
    when(builder5.accept(isA(String[].class))).thenReturn(builder4);
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder5);
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act
    new DefaultApi(
            new ApiClientJersey2(
                httpClient,
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"))
        .deleteAllowedFileExtension("ABC123", "\\+");

    // Assert
    verify(httpClient).target("https://example.org/example/file_ext/v1/allowed_extensions/%5C%2B");
    verify(builder5).accept(isA(String[].class));
    verify(builder2).header(eq("Delivered-To"), isA(Object.class));
    verify(builder4).header(eq("X-Trace-Id"), isA(Object.class));
    verify(builder3).header(eq("sessionToken"), isA(Object.class));
    verify(builder).method(eq("DELETE"), isA(Entity.class));
    verify(webTarget).request();
    verify(status).getFamily();
    verify(status, atLeast(1)).getStatusCode();
  }

  /**
   * Test {@link DefaultApi#deleteAllowedFileExtension(String, String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then calls {@link Client#target(String)}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#deleteAllowedFileExtension(String, String)}
   */
  @Test
  @DisplayName(
      "Test deleteAllowedFileExtension(String, String); when empty string; then calls target(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DefaultApi.deleteAllowedFileExtension(String, String)"})
  void testDeleteAllowedFileExtension_whenEmptyString_thenCallsTarget() throws ApiException {
    // Arrange
    StatusType status = mock(StatusType.class);
    when(status.getStatusCode()).thenReturn(1);
    when(status.getFamily()).thenReturn(Family.SUCCESSFUL);
    Builder builder = mock(Builder.class);
    when(builder.method(Mockito.<String>any(), Mockito.<Entity<?>>any()))
        .thenReturn(new OutboundJaxrsResponse(status, new OutboundMessageContext()));
    Builder builder2 = mock(Builder.class);
    when(builder2.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder);
    Builder builder3 = mock(Builder.class);
    when(builder3.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder2);
    Builder builder4 = mock(Builder.class);
    when(builder4.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder3);
    Builder builder5 = mock(Builder.class);
    when(builder5.accept(isA(String[].class))).thenReturn(builder4);
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder5);
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act
    new DefaultApi(
            new ApiClientJersey2(
                httpClient,
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"))
        .deleteAllowedFileExtension("ABC123", "");

    // Assert
    verify(httpClient).target("https://example.org/example/file_ext/v1/allowed_extensions/");
    verify(builder5).accept(isA(String[].class));
    verify(builder2).header(eq("Delivered-To"), isA(Object.class));
    verify(builder4).header(eq("X-Trace-Id"), isA(Object.class));
    verify(builder3).header(eq("sessionToken"), isA(Object.class));
    verify(builder).method(eq("DELETE"), isA(Entity.class));
    verify(webTarget).request();
    verify(status).getFamily();
    verify(status, atLeast(1)).getStatusCode();
  }

  /**
   * Test {@link DefaultApi#deleteAllowedFileExtension(String, String)}.
   *
   * <ul>
   *   <li>When {@code Extension}.
   *   <li>Then calls {@link Client#target(String)}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#deleteAllowedFileExtension(String, String)}
   */
  @Test
  @DisplayName(
      "Test deleteAllowedFileExtension(String, String); when 'Extension'; then calls target(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DefaultApi.deleteAllowedFileExtension(String, String)"})
  void testDeleteAllowedFileExtension_whenExtension_thenCallsTarget() throws ApiException {
    // Arrange
    StatusType status = mock(StatusType.class);
    when(status.getStatusCode()).thenReturn(1);
    when(status.getFamily()).thenReturn(Family.SUCCESSFUL);
    Builder builder = mock(Builder.class);
    when(builder.method(Mockito.<String>any(), Mockito.<Entity<?>>any()))
        .thenReturn(new OutboundJaxrsResponse(status, new OutboundMessageContext()));
    Builder builder2 = mock(Builder.class);
    when(builder2.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder);
    Builder builder3 = mock(Builder.class);
    when(builder3.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder2);
    Builder builder4 = mock(Builder.class);
    when(builder4.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder3);
    Builder builder5 = mock(Builder.class);
    when(builder5.accept(isA(String[].class))).thenReturn(builder4);
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder5);
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act
    new DefaultApi(
            new ApiClientJersey2(
                httpClient,
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"))
        .deleteAllowedFileExtension("ABC123", "Extension");

    // Assert
    verify(httpClient)
        .target("https://example.org/example/file_ext/v1/allowed_extensions/Extension");
    verify(builder5).accept(isA(String[].class));
    verify(builder2).header(eq("Delivered-To"), isA(Object.class));
    verify(builder4).header(eq("X-Trace-Id"), isA(Object.class));
    verify(builder3).header(eq("sessionToken"), isA(Object.class));
    verify(builder).method(eq("DELETE"), isA(Entity.class));
    verify(webTarget).request();
    verify(status).getFamily();
    verify(status, atLeast(1)).getStatusCode();
  }

  /**
   * Test {@link DefaultApi#deleteAllowedFileExtension(String, String)}.
   *
   * <ul>
   *   <li>When {@code {extension}}.
   *   <li>Then calls {@link Client#target(String)}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#deleteAllowedFileExtension(String, String)}
   */
  @Test
  @DisplayName(
      "Test deleteAllowedFileExtension(String, String); when '{extension}'; then calls target(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DefaultApi.deleteAllowedFileExtension(String, String)"})
  void testDeleteAllowedFileExtension_whenExtension_thenCallsTarget2() throws ApiException {
    // Arrange
    StatusType status = mock(StatusType.class);
    when(status.getStatusCode()).thenReturn(1);
    when(status.getFamily()).thenReturn(Family.SUCCESSFUL);
    Builder builder = mock(Builder.class);
    when(builder.method(Mockito.<String>any(), Mockito.<Entity<?>>any()))
        .thenReturn(new OutboundJaxrsResponse(status, new OutboundMessageContext()));
    Builder builder2 = mock(Builder.class);
    when(builder2.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder);
    Builder builder3 = mock(Builder.class);
    when(builder3.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder2);
    Builder builder4 = mock(Builder.class);
    when(builder4.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder3);
    Builder builder5 = mock(Builder.class);
    when(builder5.accept(isA(String[].class))).thenReturn(builder4);
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder5);
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act
    new DefaultApi(
            new ApiClientJersey2(
                httpClient,
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"))
        .deleteAllowedFileExtension("ABC123", "{extension}");

    // Assert
    verify(httpClient)
        .target("https://example.org/example/file_ext/v1/allowed_extensions/%7Bextension%7D");
    verify(builder5).accept(isA(String[].class));
    verify(builder2).header(eq("Delivered-To"), isA(Object.class));
    verify(builder4).header(eq("X-Trace-Id"), isA(Object.class));
    verify(builder3).header(eq("sessionToken"), isA(Object.class));
    verify(builder).method(eq("DELETE"), isA(Entity.class));
    verify(webTarget).request();
    verify(status).getFamily();
    verify(status, atLeast(1)).getStatusCode();
  }

  /**
   * Test {@link DefaultApi#deleteAllowedFileExtension(String, String)}.
   *
   * <ul>
   *   <li>When {@code \{extension\}}.
   *   <li>Then calls {@link Client#target(String)}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#deleteAllowedFileExtension(String, String)}
   */
  @Test
  @DisplayName(
      "Test deleteAllowedFileExtension(String, String); when '\\{extension\\}'; then calls target(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DefaultApi.deleteAllowedFileExtension(String, String)"})
  void testDeleteAllowedFileExtension_whenExtension_thenCallsTarget3() throws ApiException {
    // Arrange
    StatusType status = mock(StatusType.class);
    when(status.getStatusCode()).thenReturn(1);
    when(status.getFamily()).thenReturn(Family.SUCCESSFUL);
    Builder builder = mock(Builder.class);
    when(builder.method(Mockito.<String>any(), Mockito.<Entity<?>>any()))
        .thenReturn(new OutboundJaxrsResponse(status, new OutboundMessageContext()));
    Builder builder2 = mock(Builder.class);
    when(builder2.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder);
    Builder builder3 = mock(Builder.class);
    when(builder3.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder2);
    Builder builder4 = mock(Builder.class);
    when(builder4.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder3);
    Builder builder5 = mock(Builder.class);
    when(builder5.accept(isA(String[].class))).thenReturn(builder4);
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder5);
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act
    new DefaultApi(
            new ApiClientJersey2(
                httpClient,
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"))
        .deleteAllowedFileExtension("ABC123", "\\{extension\\}");

    // Assert
    verify(httpClient)
        .target("https://example.org/example/file_ext/v1/allowed_extensions/%5C%7Bextension%5C%7D");
    verify(builder5).accept(isA(String[].class));
    verify(builder2).header(eq("Delivered-To"), isA(Object.class));
    verify(builder4).header(eq("X-Trace-Id"), isA(Object.class));
    verify(builder3).header(eq("sessionToken"), isA(Object.class));
    verify(builder).method(eq("DELETE"), isA(Entity.class));
    verify(webTarget).request();
    verify(status).getFamily();
    verify(status, atLeast(1)).getStatusCode();
  }

  /**
   * Test {@link DefaultApi#deleteAllowedFileExtension(String, String)}.
   *
   * <ul>
   *   <li>When {@code /file_ext/v1/allowed_extensions/{extension}}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#deleteAllowedFileExtension(String, String)}
   */
  @Test
  @DisplayName(
      "Test deleteAllowedFileExtension(String, String); when '/file_ext/v1/allowed_extensions/{extension}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DefaultApi.deleteAllowedFileExtension(String, String)"})
  void testDeleteAllowedFileExtension_whenFileExtV1AllowedExtensionsExtension()
      throws ApiException {
    // Arrange
    StatusType status = mock(StatusType.class);
    when(status.getStatusCode()).thenReturn(1);
    when(status.getFamily()).thenReturn(Family.SUCCESSFUL);
    Builder builder = mock(Builder.class);
    when(builder.method(Mockito.<String>any(), Mockito.<Entity<?>>any()))
        .thenReturn(new OutboundJaxrsResponse(status, new OutboundMessageContext()));
    Builder builder2 = mock(Builder.class);
    when(builder2.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder);
    Builder builder3 = mock(Builder.class);
    when(builder3.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder2);
    Builder builder4 = mock(Builder.class);
    when(builder4.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder3);
    Builder builder5 = mock(Builder.class);
    when(builder5.accept(isA(String[].class))).thenReturn(builder4);
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder5);
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act
    new DefaultApi(
            new ApiClientJersey2(
                httpClient,
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"))
        .deleteAllowedFileExtension("ABC123", "/file_ext/v1/allowed_extensions/{extension}");

    // Assert
    verify(httpClient)
        .target(
            "https://example.org/example/file_ext/v1/allowed_extensions/%2Ffile_ext%2Fv1%2Fallowed_extensions%2F%7Bextension%7D");
    verify(builder5).accept(isA(String[].class));
    verify(builder2).header(eq("Delivered-To"), isA(Object.class));
    verify(builder4).header(eq("X-Trace-Id"), isA(Object.class));
    verify(builder3).header(eq("sessionToken"), isA(Object.class));
    verify(builder).method(eq("DELETE"), isA(Entity.class));
    verify(webTarget).request();
    verify(status).getFamily();
    verify(status, atLeast(1)).getStatusCode();
  }

  /**
   * Test {@link DefaultApi#deleteAllowedFileExtension(String, String)}.
   *
   * <ul>
   *   <li>When {@code /file_ext/v1/allowed_extensions}.
   *   <li>Then calls {@link Client#target(String)}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#deleteAllowedFileExtension(String, String)}
   */
  @Test
  @DisplayName(
      "Test deleteAllowedFileExtension(String, String); when '/file_ext/v1/allowed_extensions'; then calls target(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DefaultApi.deleteAllowedFileExtension(String, String)"})
  void testDeleteAllowedFileExtension_whenFileExtV1AllowedExtensions_thenCallsTarget()
      throws ApiException {
    // Arrange
    StatusType status = mock(StatusType.class);
    when(status.getStatusCode()).thenReturn(1);
    when(status.getFamily()).thenReturn(Family.SUCCESSFUL);
    Builder builder = mock(Builder.class);
    when(builder.method(Mockito.<String>any(), Mockito.<Entity<?>>any()))
        .thenReturn(new OutboundJaxrsResponse(status, new OutboundMessageContext()));
    Builder builder2 = mock(Builder.class);
    when(builder2.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder);
    Builder builder3 = mock(Builder.class);
    when(builder3.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder2);
    Builder builder4 = mock(Builder.class);
    when(builder4.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder3);
    Builder builder5 = mock(Builder.class);
    when(builder5.accept(isA(String[].class))).thenReturn(builder4);
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder5);
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act
    new DefaultApi(
            new ApiClientJersey2(
                httpClient,
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"))
        .deleteAllowedFileExtension("ABC123", "/file_ext/v1/allowed_extensions");

    // Assert
    verify(httpClient)
        .target(
            "https://example.org/example/file_ext/v1/allowed_extensions/%2Ffile_ext%2Fv1%2Fallowed_extensions");
    verify(builder5).accept(isA(String[].class));
    verify(builder2).header(eq("Delivered-To"), isA(Object.class));
    verify(builder4).header(eq("X-Trace-Id"), isA(Object.class));
    verify(builder3).header(eq("sessionToken"), isA(Object.class));
    verify(builder).method(eq("DELETE"), isA(Entity.class));
    verify(webTarget).request();
    verify(status).getFamily();
    verify(status, atLeast(1)).getStatusCode();
  }

  /**
   * Test {@link DefaultApi#deleteAllowedFileExtension(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#deleteAllowedFileExtension(String, String)}
   */
  @Test
  @DisplayName(
      "Test deleteAllowedFileExtension(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DefaultApi.deleteAllowedFileExtension(String, String)"})
  void testDeleteAllowedFileExtension_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new DefaultApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .deleteAllowedFileExtension(null, "Extension"));
  }

  /**
   * Test {@link DefaultApi#deleteAllowedFileExtension(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#deleteAllowedFileExtension(String, String)}
   */
  @Test
  @DisplayName(
      "Test deleteAllowedFileExtension(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DefaultApi.deleteAllowedFileExtension(String, String)"})
  void testDeleteAllowedFileExtension_whenNull_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new DefaultApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .deleteAllowedFileExtension("ABC123", null));
  }

  /**
   * Test {@link DefaultApi#deleteAllowedFileExtension(String, String)}.
   *
   * <ul>
   *   <li>When {@code +}.
   *   <li>Then calls {@link Client#target(String)}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#deleteAllowedFileExtension(String, String)}
   */
  @Test
  @DisplayName(
      "Test deleteAllowedFileExtension(String, String); when '+'; then calls target(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DefaultApi.deleteAllowedFileExtension(String, String)"})
  void testDeleteAllowedFileExtension_whenPlusSign_thenCallsTarget() throws ApiException {
    // Arrange
    StatusType status = mock(StatusType.class);
    when(status.getStatusCode()).thenReturn(1);
    when(status.getFamily()).thenReturn(Family.SUCCESSFUL);
    Builder builder = mock(Builder.class);
    when(builder.method(Mockito.<String>any(), Mockito.<Entity<?>>any()))
        .thenReturn(new OutboundJaxrsResponse(status, new OutboundMessageContext()));
    Builder builder2 = mock(Builder.class);
    when(builder2.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder);
    Builder builder3 = mock(Builder.class);
    when(builder3.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder2);
    Builder builder4 = mock(Builder.class);
    when(builder4.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder3);
    Builder builder5 = mock(Builder.class);
    when(builder5.accept(isA(String[].class))).thenReturn(builder4);
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder5);
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act
    new DefaultApi(
            new ApiClientJersey2(
                httpClient,
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"))
        .deleteAllowedFileExtension("ABC123", "+");

    // Assert
    verify(httpClient).target("https://example.org/example/file_ext/v1/allowed_extensions/%2B");
    verify(builder5).accept(isA(String[].class));
    verify(builder2).header(eq("Delivered-To"), isA(Object.class));
    verify(builder4).header(eq("X-Trace-Id"), isA(Object.class));
    verify(builder3).header(eq("sessionToken"), isA(Object.class));
    verify(builder).method(eq("DELETE"), isA(Entity.class));
    verify(webTarget).request();
    verify(status).getFamily();
    verify(status, atLeast(1)).getStatusCode();
  }

  /**
   * Test {@link DefaultApi#deleteAllowedFileExtension(String, String)}.
   *
   * <ul>
   *   <li>When {@code sessionToken}.
   *   <li>Then calls {@link Client#target(String)}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#deleteAllowedFileExtension(String, String)}
   */
  @Test
  @DisplayName(
      "Test deleteAllowedFileExtension(String, String); when 'sessionToken'; then calls target(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DefaultApi.deleteAllowedFileExtension(String, String)"})
  void testDeleteAllowedFileExtension_whenSessionToken_thenCallsTarget() throws ApiException {
    // Arrange
    StatusType status = mock(StatusType.class);
    when(status.getStatusCode()).thenReturn(1);
    when(status.getFamily()).thenReturn(Family.SUCCESSFUL);
    Builder builder = mock(Builder.class);
    when(builder.method(Mockito.<String>any(), Mockito.<Entity<?>>any()))
        .thenReturn(new OutboundJaxrsResponse(status, new OutboundMessageContext()));
    Builder builder2 = mock(Builder.class);
    when(builder2.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder);
    Builder builder3 = mock(Builder.class);
    when(builder3.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder2);
    Builder builder4 = mock(Builder.class);
    when(builder4.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder3);
    Builder builder5 = mock(Builder.class);
    when(builder5.accept(isA(String[].class))).thenReturn(builder4);
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder5);
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act
    new DefaultApi(
            new ApiClientJersey2(
                httpClient,
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"))
        .deleteAllowedFileExtension("ABC123", "sessionToken");

    // Assert
    verify(httpClient)
        .target("https://example.org/example/file_ext/v1/allowed_extensions/sessionToken");
    verify(builder5).accept(isA(String[].class));
    verify(builder2).header(eq("Delivered-To"), isA(Object.class));
    verify(builder4).header(eq("X-Trace-Id"), isA(Object.class));
    verify(builder3).header(eq("sessionToken"), isA(Object.class));
    verify(builder).method(eq("DELETE"), isA(Entity.class));
    verify(webTarget).request();
    verify(status).getFamily();
    verify(status, atLeast(1)).getStatusCode();
  }

  /**
   * Test {@link DefaultApi#deleteAllowedFileExtension(String, String)}.
   *
   * <ul>
   *   <li>When {@code utf8}.
   *   <li>Then calls {@link Client#target(String)}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#deleteAllowedFileExtension(String, String)}
   */
  @Test
  @DisplayName(
      "Test deleteAllowedFileExtension(String, String); when 'utf8'; then calls target(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DefaultApi.deleteAllowedFileExtension(String, String)"})
  void testDeleteAllowedFileExtension_whenUtf8_thenCallsTarget() throws ApiException {
    // Arrange
    StatusType status = mock(StatusType.class);
    when(status.getStatusCode()).thenReturn(1);
    when(status.getFamily()).thenReturn(Family.SUCCESSFUL);
    Builder builder = mock(Builder.class);
    when(builder.method(Mockito.<String>any(), Mockito.<Entity<?>>any()))
        .thenReturn(new OutboundJaxrsResponse(status, new OutboundMessageContext()));
    Builder builder2 = mock(Builder.class);
    when(builder2.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder);
    Builder builder3 = mock(Builder.class);
    when(builder3.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder2);
    Builder builder4 = mock(Builder.class);
    when(builder4.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder3);
    Builder builder5 = mock(Builder.class);
    when(builder5.accept(isA(String[].class))).thenReturn(builder4);
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder5);
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act
    new DefaultApi(
            new ApiClientJersey2(
                httpClient,
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"))
        .deleteAllowedFileExtension("ABC123", "utf8");

    // Assert
    verify(httpClient).target("https://example.org/example/file_ext/v1/allowed_extensions/utf8");
    verify(builder5).accept(isA(String[].class));
    verify(builder2).header(eq("Delivered-To"), isA(Object.class));
    verify(builder4).header(eq("X-Trace-Id"), isA(Object.class));
    verify(builder3).header(eq("sessionToken"), isA(Object.class));
    verify(builder).method(eq("DELETE"), isA(Entity.class));
    verify(webTarget).request();
    verify(status).getFamily();
    verify(status, atLeast(1)).getStatusCode();
  }

  /**
   * Test {@link DefaultApi#deleteAllowedFileExtension(String, String)}.
   *
   * <ul>
   *   <li>When {@code /v1/admin/messages}.
   *   <li>Then calls {@link Client#target(String)}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#deleteAllowedFileExtension(String, String)}
   */
  @Test
  @DisplayName(
      "Test deleteAllowedFileExtension(String, String); when '/v1/admin/messages'; then calls target(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DefaultApi.deleteAllowedFileExtension(String, String)"})
  void testDeleteAllowedFileExtension_whenV1AdminMessages_thenCallsTarget() throws ApiException {
    // Arrange
    StatusType status = mock(StatusType.class);
    when(status.getStatusCode()).thenReturn(1);
    when(status.getFamily()).thenReturn(Family.SUCCESSFUL);
    Builder builder = mock(Builder.class);
    when(builder.method(Mockito.<String>any(), Mockito.<Entity<?>>any()))
        .thenReturn(new OutboundJaxrsResponse(status, new OutboundMessageContext()));
    Builder builder2 = mock(Builder.class);
    when(builder2.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder);
    Builder builder3 = mock(Builder.class);
    when(builder3.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder2);
    Builder builder4 = mock(Builder.class);
    when(builder4.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder3);
    Builder builder5 = mock(Builder.class);
    when(builder5.accept(isA(String[].class))).thenReturn(builder4);
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder5);
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act
    new DefaultApi(
            new ApiClientJersey2(
                httpClient,
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"))
        .deleteAllowedFileExtension("ABC123", "/v1/admin/messages");

    // Assert
    verify(httpClient)
        .target(
            "https://example.org/example/file_ext/v1/allowed_extensions/%2Fv1%2Fadmin%2Fmessages");
    verify(builder5).accept(isA(String[].class));
    verify(builder2).header(eq("Delivered-To"), isA(Object.class));
    verify(builder4).header(eq("X-Trace-Id"), isA(Object.class));
    verify(builder3).header(eq("sessionToken"), isA(Object.class));
    verify(builder).method(eq("DELETE"), isA(Entity.class));
    verify(webTarget).request();
    verify(status).getFamily();
    verify(status, atLeast(1)).getStatusCode();
  }

  /**
   * Test {@link DefaultApi#deleteAllowedFileExtensionWithHttpInfo(String, String)}.
   *
   * <p>Method under test: {@link DefaultApi#deleteAllowedFileExtensionWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName("Test deleteAllowedFileExtensionWithHttpInfo(String, String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse DefaultApi.deleteAllowedFileExtensionWithHttpInfo(String, String)"
  })
  void testDeleteAllowedFileExtensionWithHttpInfo() throws ApiException {
    // Arrange
    StatusType status = mock(StatusType.class);
    when(status.getStatusCode()).thenReturn(1);
    when(status.getFamily()).thenReturn(Family.SUCCESSFUL);
    Builder builder = mock(Builder.class);
    when(builder.method(Mockito.<String>any(), Mockito.<Entity<?>>any()))
        .thenReturn(new OutboundJaxrsResponse(status, new OutboundMessageContext()));
    Builder builder2 = mock(Builder.class);
    when(builder2.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder);
    Builder builder3 = mock(Builder.class);
    when(builder3.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder2);
    Builder builder4 = mock(Builder.class);
    when(builder4.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder3);
    Builder builder5 = mock(Builder.class);
    when(builder5.accept(isA(String[].class))).thenReturn(builder4);
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder5);
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act
    ApiResponse<Void> actualDeleteAllowedFileExtensionWithHttpInfoResult =
        new DefaultApi(
                new ApiClientJersey2(
                    httpClient,
                    "https://example.org/example",
                    defaultHeaders,
                    "https://example.org/example"))
            .deleteAllowedFileExtensionWithHttpInfo(
                "https://example.org/example", "/file_ext/v1/allowed_extensions/{extension}");

    // Assert
    verify(httpClient)
        .target(
            "https://example.org/example/file_ext/v1/allowed_extensions/%2Ffile_ext%2Fv1%2Fallowed_extensions%2F%7Bextension%7D");
    verify(builder5).accept(isA(String[].class));
    verify(builder2).header(eq("Delivered-To"), isA(Object.class));
    verify(builder4).header(eq("X-Trace-Id"), isA(Object.class));
    verify(builder3).header(eq("sessionToken"), isA(Object.class));
    verify(builder).method(eq("DELETE"), isA(Entity.class));
    verify(webTarget).request();
    verify(status).getFamily();
    verify(status, atLeast(1)).getStatusCode();
    assertNull(actualDeleteAllowedFileExtensionWithHttpInfoResult.getData());
    assertEquals(1, actualDeleteAllowedFileExtensionWithHttpInfoResult.getStatusCode());
    assertTrue(actualDeleteAllowedFileExtensionWithHttpInfoResult.getHeaders().isEmpty());
  }

  /**
   * Test {@link DefaultApi#deleteAllowedFileExtensionWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>Then return Data is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#deleteAllowedFileExtensionWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test deleteAllowedFileExtensionWithHttpInfo(String, String); then return Data is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse DefaultApi.deleteAllowedFileExtensionWithHttpInfo(String, String)"
  })
  void testDeleteAllowedFileExtensionWithHttpInfo_thenReturnDataIsNull() throws ApiException {
    // Arrange
    StatusType status = mock(StatusType.class);
    when(status.getStatusCode()).thenReturn(1);
    when(status.getFamily()).thenReturn(Family.SUCCESSFUL);
    Builder builder = mock(Builder.class);
    when(builder.method(Mockito.<String>any(), Mockito.<Entity<?>>any()))
        .thenReturn(new OutboundJaxrsResponse(status, new OutboundMessageContext()));
    Builder builder2 = mock(Builder.class);
    when(builder2.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder);
    Builder builder3 = mock(Builder.class);
    when(builder3.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder2);
    Builder builder4 = mock(Builder.class);
    when(builder4.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder3);
    Builder builder5 = mock(Builder.class);
    when(builder5.accept(isA(String[].class))).thenReturn(builder4);
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder5);
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act
    ApiResponse<Void> actualDeleteAllowedFileExtensionWithHttpInfoResult =
        new DefaultApi(
                new ApiClientJersey2(
                    httpClient,
                    "https://example.org/example",
                    defaultHeaders,
                    "https://example.org/example"))
            .deleteAllowedFileExtensionWithHttpInfo(
                "https://example.org/example", "https://example.org/example");

    // Assert
    verify(httpClient)
        .target(
            "https://example.org/example/file_ext/v1/allowed_extensions/https%3A%2F%2Fexample.org%2Fexample");
    verify(builder5).accept(isA(String[].class));
    verify(builder2).header(eq("Delivered-To"), isA(Object.class));
    verify(builder4).header(eq("X-Trace-Id"), isA(Object.class));
    verify(builder3).header(eq("sessionToken"), isA(Object.class));
    verify(builder).method(eq("DELETE"), isA(Entity.class));
    verify(webTarget).request();
    verify(status).getFamily();
    verify(status, atLeast(1)).getStatusCode();
    assertNull(actualDeleteAllowedFileExtensionWithHttpInfoResult.getData());
    assertEquals(1, actualDeleteAllowedFileExtensionWithHttpInfoResult.getStatusCode());
    assertTrue(actualDeleteAllowedFileExtensionWithHttpInfoResult.getHeaders().isEmpty());
  }

  /**
   * Test {@link DefaultApi#deleteAllowedFileExtensionWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code %20}.
   *   <li>Then return Data is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#deleteAllowedFileExtensionWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test deleteAllowedFileExtensionWithHttpInfo(String, String); when '%20'; then return Data is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse DefaultApi.deleteAllowedFileExtensionWithHttpInfo(String, String)"
  })
  void testDeleteAllowedFileExtensionWithHttpInfo_when20_thenReturnDataIsNull()
      throws ApiException {
    // Arrange
    StatusType status = mock(StatusType.class);
    when(status.getStatusCode()).thenReturn(1);
    when(status.getFamily()).thenReturn(Family.SUCCESSFUL);
    Builder builder = mock(Builder.class);
    when(builder.method(Mockito.<String>any(), Mockito.<Entity<?>>any()))
        .thenReturn(new OutboundJaxrsResponse(status, new OutboundMessageContext()));
    Builder builder2 = mock(Builder.class);
    when(builder2.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder);
    Builder builder3 = mock(Builder.class);
    when(builder3.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder2);
    Builder builder4 = mock(Builder.class);
    when(builder4.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder3);
    Builder builder5 = mock(Builder.class);
    when(builder5.accept(isA(String[].class))).thenReturn(builder4);
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder5);
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act
    ApiResponse<Void> actualDeleteAllowedFileExtensionWithHttpInfoResult =
        new DefaultApi(
                new ApiClientJersey2(
                    httpClient,
                    "https://example.org/example",
                    defaultHeaders,
                    "https://example.org/example"))
            .deleteAllowedFileExtensionWithHttpInfo("https://example.org/example", "%20");

    // Assert
    verify(httpClient).target("https://example.org/example/file_ext/v1/allowed_extensions/%2520");
    verify(builder5).accept(isA(String[].class));
    verify(builder2).header(eq("Delivered-To"), isA(Object.class));
    verify(builder4).header(eq("X-Trace-Id"), isA(Object.class));
    verify(builder3).header(eq("sessionToken"), isA(Object.class));
    verify(builder).method(eq("DELETE"), isA(Entity.class));
    verify(webTarget).request();
    verify(status).getFamily();
    verify(status, atLeast(1)).getStatusCode();
    assertNull(actualDeleteAllowedFileExtensionWithHttpInfoResult.getData());
    assertEquals(1, actualDeleteAllowedFileExtensionWithHttpInfoResult.getStatusCode());
    assertTrue(actualDeleteAllowedFileExtensionWithHttpInfoResult.getHeaders().isEmpty());
  }

  /**
   * Test {@link DefaultApi#deleteAllowedFileExtensionWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return Data is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#deleteAllowedFileExtensionWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test deleteAllowedFileExtensionWithHttpInfo(String, String); when '42'; then return Data is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse DefaultApi.deleteAllowedFileExtensionWithHttpInfo(String, String)"
  })
  void testDeleteAllowedFileExtensionWithHttpInfo_when42_thenReturnDataIsNull()
      throws ApiException {
    // Arrange
    StatusType status = mock(StatusType.class);
    when(status.getStatusCode()).thenReturn(1);
    when(status.getFamily()).thenReturn(Family.SUCCESSFUL);
    Builder builder = mock(Builder.class);
    when(builder.method(Mockito.<String>any(), Mockito.<Entity<?>>any()))
        .thenReturn(new OutboundJaxrsResponse(status, new OutboundMessageContext()));
    Builder builder2 = mock(Builder.class);
    when(builder2.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder);
    Builder builder3 = mock(Builder.class);
    when(builder3.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder2);
    Builder builder4 = mock(Builder.class);
    when(builder4.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder3);
    Builder builder5 = mock(Builder.class);
    when(builder5.accept(isA(String[].class))).thenReturn(builder4);
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder5);
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act
    ApiResponse<Void> actualDeleteAllowedFileExtensionWithHttpInfoResult =
        new DefaultApi(
                new ApiClientJersey2(
                    httpClient,
                    "https://example.org/example",
                    defaultHeaders,
                    "https://example.org/example"))
            .deleteAllowedFileExtensionWithHttpInfo("https://example.org/example", "42");

    // Assert
    verify(httpClient).target("https://example.org/example/file_ext/v1/allowed_extensions/42");
    verify(builder5).accept(isA(String[].class));
    verify(builder2).header(eq("Delivered-To"), isA(Object.class));
    verify(builder4).header(eq("X-Trace-Id"), isA(Object.class));
    verify(builder3).header(eq("sessionToken"), isA(Object.class));
    verify(builder).method(eq("DELETE"), isA(Entity.class));
    verify(webTarget).request();
    verify(status).getFamily();
    verify(status, atLeast(1)).getStatusCode();
    assertNull(actualDeleteAllowedFileExtensionWithHttpInfoResult.getData());
    assertEquals(1, actualDeleteAllowedFileExtensionWithHttpInfoResult.getStatusCode());
    assertTrue(actualDeleteAllowedFileExtensionWithHttpInfoResult.getHeaders().isEmpty());
  }

  /**
   * Test {@link DefaultApi#deleteAllowedFileExtensionWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code application/json ;U}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#deleteAllowedFileExtensionWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test deleteAllowedFileExtensionWithHttpInfo(String, String); when 'application/json ;U'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse DefaultApi.deleteAllowedFileExtensionWithHttpInfo(String, String)"
  })
  void testDeleteAllowedFileExtensionWithHttpInfo_whenApplicationJsonU() throws ApiException {
    // Arrange
    StatusType status = mock(StatusType.class);
    when(status.getStatusCode()).thenReturn(1);
    when(status.getFamily()).thenReturn(Family.SUCCESSFUL);
    Builder builder = mock(Builder.class);
    when(builder.method(Mockito.<String>any(), Mockito.<Entity<?>>any()))
        .thenReturn(new OutboundJaxrsResponse(status, new OutboundMessageContext()));
    Builder builder2 = mock(Builder.class);
    when(builder2.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder);
    Builder builder3 = mock(Builder.class);
    when(builder3.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder2);
    Builder builder4 = mock(Builder.class);
    when(builder4.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder3);
    Builder builder5 = mock(Builder.class);
    when(builder5.accept(isA(String[].class))).thenReturn(builder4);
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder5);
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act
    ApiResponse<Void> actualDeleteAllowedFileExtensionWithHttpInfoResult =
        new DefaultApi(
                new ApiClientJersey2(
                    httpClient,
                    "https://example.org/example",
                    defaultHeaders,
                    "https://example.org/example"))
            .deleteAllowedFileExtensionWithHttpInfo(
                "https://example.org/example", "application/json ;U");

    // Assert
    verify(httpClient)
        .target(
            "https://example.org/example/file_ext/v1/allowed_extensions/application%2Fjson%20%3BU");
    verify(builder5).accept(isA(String[].class));
    verify(builder2).header(eq("Delivered-To"), isA(Object.class));
    verify(builder4).header(eq("X-Trace-Id"), isA(Object.class));
    verify(builder3).header(eq("sessionToken"), isA(Object.class));
    verify(builder).method(eq("DELETE"), isA(Entity.class));
    verify(webTarget).request();
    verify(status).getFamily();
    verify(status, atLeast(1)).getStatusCode();
    assertNull(actualDeleteAllowedFileExtensionWithHttpInfoResult.getData());
    assertEquals(1, actualDeleteAllowedFileExtensionWithHttpInfoResult.getStatusCode());
    assertTrue(actualDeleteAllowedFileExtensionWithHttpInfoResult.getHeaders().isEmpty());
  }

  /**
   * Test {@link DefaultApi#deleteAllowedFileExtensionWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code \+}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#deleteAllowedFileExtensionWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName("Test deleteAllowedFileExtensionWithHttpInfo(String, String); when '\\+'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse DefaultApi.deleteAllowedFileExtensionWithHttpInfo(String, String)"
  })
  void testDeleteAllowedFileExtensionWithHttpInfo_whenBackslashPlusSign() throws ApiException {
    // Arrange
    StatusType status = mock(StatusType.class);
    when(status.getStatusCode()).thenReturn(1);
    when(status.getFamily()).thenReturn(Family.SUCCESSFUL);
    Builder builder = mock(Builder.class);
    when(builder.method(Mockito.<String>any(), Mockito.<Entity<?>>any()))
        .thenReturn(new OutboundJaxrsResponse(status, new OutboundMessageContext()));
    Builder builder2 = mock(Builder.class);
    when(builder2.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder);
    Builder builder3 = mock(Builder.class);
    when(builder3.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder2);
    Builder builder4 = mock(Builder.class);
    when(builder4.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder3);
    Builder builder5 = mock(Builder.class);
    when(builder5.accept(isA(String[].class))).thenReturn(builder4);
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder5);
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act
    ApiResponse<Void> actualDeleteAllowedFileExtensionWithHttpInfoResult =
        new DefaultApi(
                new ApiClientJersey2(
                    httpClient,
                    "https://example.org/example",
                    defaultHeaders,
                    "https://example.org/example"))
            .deleteAllowedFileExtensionWithHttpInfo("https://example.org/example", "\\+");

    // Assert
    verify(httpClient).target("https://example.org/example/file_ext/v1/allowed_extensions/%5C%2B");
    verify(builder5).accept(isA(String[].class));
    verify(builder2).header(eq("Delivered-To"), isA(Object.class));
    verify(builder4).header(eq("X-Trace-Id"), isA(Object.class));
    verify(builder3).header(eq("sessionToken"), isA(Object.class));
    verify(builder).method(eq("DELETE"), isA(Entity.class));
    verify(webTarget).request();
    verify(status).getFamily();
    verify(status, atLeast(1)).getStatusCode();
    assertNull(actualDeleteAllowedFileExtensionWithHttpInfoResult.getData());
    assertEquals(1, actualDeleteAllowedFileExtensionWithHttpInfoResult.getStatusCode());
    assertTrue(actualDeleteAllowedFileExtensionWithHttpInfoResult.getHeaders().isEmpty());
  }

  /**
   * Test {@link DefaultApi#deleteAllowedFileExtensionWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then return Data is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#deleteAllowedFileExtensionWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test deleteAllowedFileExtensionWithHttpInfo(String, String); when empty string; then return Data is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse DefaultApi.deleteAllowedFileExtensionWithHttpInfo(String, String)"
  })
  void testDeleteAllowedFileExtensionWithHttpInfo_whenEmptyString_thenReturnDataIsNull()
      throws ApiException {
    // Arrange
    StatusType status = mock(StatusType.class);
    when(status.getStatusCode()).thenReturn(1);
    when(status.getFamily()).thenReturn(Family.SUCCESSFUL);
    Builder builder = mock(Builder.class);
    when(builder.method(Mockito.<String>any(), Mockito.<Entity<?>>any()))
        .thenReturn(new OutboundJaxrsResponse(status, new OutboundMessageContext()));
    Builder builder2 = mock(Builder.class);
    when(builder2.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder);
    Builder builder3 = mock(Builder.class);
    when(builder3.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder2);
    Builder builder4 = mock(Builder.class);
    when(builder4.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder3);
    Builder builder5 = mock(Builder.class);
    when(builder5.accept(isA(String[].class))).thenReturn(builder4);
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder5);
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act
    ApiResponse<Void> actualDeleteAllowedFileExtensionWithHttpInfoResult =
        new DefaultApi(
                new ApiClientJersey2(
                    httpClient,
                    "https://example.org/example",
                    defaultHeaders,
                    "https://example.org/example"))
            .deleteAllowedFileExtensionWithHttpInfo("https://example.org/example", "");

    // Assert
    verify(httpClient).target("https://example.org/example/file_ext/v1/allowed_extensions/");
    verify(builder5).accept(isA(String[].class));
    verify(builder2).header(eq("Delivered-To"), isA(Object.class));
    verify(builder4).header(eq("X-Trace-Id"), isA(Object.class));
    verify(builder3).header(eq("sessionToken"), isA(Object.class));
    verify(builder).method(eq("DELETE"), isA(Entity.class));
    verify(webTarget).request();
    verify(status).getFamily();
    verify(status, atLeast(1)).getStatusCode();
    assertNull(actualDeleteAllowedFileExtensionWithHttpInfoResult.getData());
    assertEquals(1, actualDeleteAllowedFileExtensionWithHttpInfoResult.getStatusCode());
    assertTrue(actualDeleteAllowedFileExtensionWithHttpInfoResult.getHeaders().isEmpty());
  }

  /**
   * Test {@link DefaultApi#deleteAllowedFileExtensionWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code {extension}}.
   *   <li>Then return Data is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#deleteAllowedFileExtensionWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test deleteAllowedFileExtensionWithHttpInfo(String, String); when '{extension}'; then return Data is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse DefaultApi.deleteAllowedFileExtensionWithHttpInfo(String, String)"
  })
  void testDeleteAllowedFileExtensionWithHttpInfo_whenExtension_thenReturnDataIsNull()
      throws ApiException {
    // Arrange
    StatusType status = mock(StatusType.class);
    when(status.getStatusCode()).thenReturn(1);
    when(status.getFamily()).thenReturn(Family.SUCCESSFUL);
    Builder builder = mock(Builder.class);
    when(builder.method(Mockito.<String>any(), Mockito.<Entity<?>>any()))
        .thenReturn(new OutboundJaxrsResponse(status, new OutboundMessageContext()));
    Builder builder2 = mock(Builder.class);
    when(builder2.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder);
    Builder builder3 = mock(Builder.class);
    when(builder3.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder2);
    Builder builder4 = mock(Builder.class);
    when(builder4.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder3);
    Builder builder5 = mock(Builder.class);
    when(builder5.accept(isA(String[].class))).thenReturn(builder4);
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder5);
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act
    ApiResponse<Void> actualDeleteAllowedFileExtensionWithHttpInfoResult =
        new DefaultApi(
                new ApiClientJersey2(
                    httpClient,
                    "https://example.org/example",
                    defaultHeaders,
                    "https://example.org/example"))
            .deleteAllowedFileExtensionWithHttpInfo("https://example.org/example", "{extension}");

    // Assert
    verify(httpClient)
        .target("https://example.org/example/file_ext/v1/allowed_extensions/%7Bextension%7D");
    verify(builder5).accept(isA(String[].class));
    verify(builder2).header(eq("Delivered-To"), isA(Object.class));
    verify(builder4).header(eq("X-Trace-Id"), isA(Object.class));
    verify(builder3).header(eq("sessionToken"), isA(Object.class));
    verify(builder).method(eq("DELETE"), isA(Entity.class));
    verify(webTarget).request();
    verify(status).getFamily();
    verify(status, atLeast(1)).getStatusCode();
    assertNull(actualDeleteAllowedFileExtensionWithHttpInfoResult.getData());
    assertEquals(1, actualDeleteAllowedFileExtensionWithHttpInfoResult.getStatusCode());
    assertTrue(actualDeleteAllowedFileExtensionWithHttpInfoResult.getHeaders().isEmpty());
  }

  /**
   * Test {@link DefaultApi#deleteAllowedFileExtensionWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code \{extension\}}.
   *   <li>Then return Data is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#deleteAllowedFileExtensionWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test deleteAllowedFileExtensionWithHttpInfo(String, String); when '\\{extension\\}'; then return Data is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse DefaultApi.deleteAllowedFileExtensionWithHttpInfo(String, String)"
  })
  void testDeleteAllowedFileExtensionWithHttpInfo_whenExtension_thenReturnDataIsNull2()
      throws ApiException {
    // Arrange
    StatusType status = mock(StatusType.class);
    when(status.getStatusCode()).thenReturn(1);
    when(status.getFamily()).thenReturn(Family.SUCCESSFUL);
    Builder builder = mock(Builder.class);
    when(builder.method(Mockito.<String>any(), Mockito.<Entity<?>>any()))
        .thenReturn(new OutboundJaxrsResponse(status, new OutboundMessageContext()));
    Builder builder2 = mock(Builder.class);
    when(builder2.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder);
    Builder builder3 = mock(Builder.class);
    when(builder3.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder2);
    Builder builder4 = mock(Builder.class);
    when(builder4.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder3);
    Builder builder5 = mock(Builder.class);
    when(builder5.accept(isA(String[].class))).thenReturn(builder4);
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder5);
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act
    ApiResponse<Void> actualDeleteAllowedFileExtensionWithHttpInfoResult =
        new DefaultApi(
                new ApiClientJersey2(
                    httpClient,
                    "https://example.org/example",
                    defaultHeaders,
                    "https://example.org/example"))
            .deleteAllowedFileExtensionWithHttpInfo(
                "https://example.org/example", "\\{extension\\}");

    // Assert
    verify(httpClient)
        .target("https://example.org/example/file_ext/v1/allowed_extensions/%5C%7Bextension%5C%7D");
    verify(builder5).accept(isA(String[].class));
    verify(builder2).header(eq("Delivered-To"), isA(Object.class));
    verify(builder4).header(eq("X-Trace-Id"), isA(Object.class));
    verify(builder3).header(eq("sessionToken"), isA(Object.class));
    verify(builder).method(eq("DELETE"), isA(Entity.class));
    verify(webTarget).request();
    verify(status).getFamily();
    verify(status, atLeast(1)).getStatusCode();
    assertNull(actualDeleteAllowedFileExtensionWithHttpInfoResult.getData());
    assertEquals(1, actualDeleteAllowedFileExtensionWithHttpInfoResult.getStatusCode());
    assertTrue(actualDeleteAllowedFileExtensionWithHttpInfoResult.getHeaders().isEmpty());
  }

  /**
   * Test {@link DefaultApi#deleteAllowedFileExtensionWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code Extension}.
   *   <li>Then return Data is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#deleteAllowedFileExtensionWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test deleteAllowedFileExtensionWithHttpInfo(String, String); when 'Extension'; then return Data is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse DefaultApi.deleteAllowedFileExtensionWithHttpInfo(String, String)"
  })
  void testDeleteAllowedFileExtensionWithHttpInfo_whenExtension_thenReturnDataIsNull3()
      throws ApiException {
    // Arrange
    StatusType status = mock(StatusType.class);
    when(status.getStatusCode()).thenReturn(1);
    when(status.getFamily()).thenReturn(Family.SUCCESSFUL);
    Builder builder = mock(Builder.class);
    when(builder.method(Mockito.<String>any(), Mockito.<Entity<?>>any()))
        .thenReturn(new OutboundJaxrsResponse(status, new OutboundMessageContext()));
    Builder builder2 = mock(Builder.class);
    when(builder2.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder);
    Builder builder3 = mock(Builder.class);
    when(builder3.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder2);
    Builder builder4 = mock(Builder.class);
    when(builder4.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder3);
    Builder builder5 = mock(Builder.class);
    when(builder5.accept(isA(String[].class))).thenReturn(builder4);
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder5);
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act
    ApiResponse<Void> actualDeleteAllowedFileExtensionWithHttpInfoResult =
        new DefaultApi(
                new ApiClientJersey2(
                    httpClient,
                    "https://example.org/example",
                    defaultHeaders,
                    "https://example.org/example"))
            .deleteAllowedFileExtensionWithHttpInfo("https://example.org/example", "Extension");

    // Assert
    verify(httpClient)
        .target("https://example.org/example/file_ext/v1/allowed_extensions/Extension");
    verify(builder5).accept(isA(String[].class));
    verify(builder2).header(eq("Delivered-To"), isA(Object.class));
    verify(builder4).header(eq("X-Trace-Id"), isA(Object.class));
    verify(builder3).header(eq("sessionToken"), isA(Object.class));
    verify(builder).method(eq("DELETE"), isA(Entity.class));
    verify(webTarget).request();
    verify(status).getFamily();
    verify(status, atLeast(1)).getStatusCode();
    assertNull(actualDeleteAllowedFileExtensionWithHttpInfoResult.getData());
    assertEquals(1, actualDeleteAllowedFileExtensionWithHttpInfoResult.getStatusCode());
    assertTrue(actualDeleteAllowedFileExtensionWithHttpInfoResult.getHeaders().isEmpty());
  }

  /**
   * Test {@link DefaultApi#deleteAllowedFileExtensionWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code /file_ext/v1/allowed_extensions}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#deleteAllowedFileExtensionWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test deleteAllowedFileExtensionWithHttpInfo(String, String); when '/file_ext/v1/allowed_extensions'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse DefaultApi.deleteAllowedFileExtensionWithHttpInfo(String, String)"
  })
  void testDeleteAllowedFileExtensionWithHttpInfo_whenFileExtV1AllowedExtensions()
      throws ApiException {
    // Arrange
    StatusType status = mock(StatusType.class);
    when(status.getStatusCode()).thenReturn(1);
    when(status.getFamily()).thenReturn(Family.SUCCESSFUL);
    Builder builder = mock(Builder.class);
    when(builder.method(Mockito.<String>any(), Mockito.<Entity<?>>any()))
        .thenReturn(new OutboundJaxrsResponse(status, new OutboundMessageContext()));
    Builder builder2 = mock(Builder.class);
    when(builder2.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder);
    Builder builder3 = mock(Builder.class);
    when(builder3.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder2);
    Builder builder4 = mock(Builder.class);
    when(builder4.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder3);
    Builder builder5 = mock(Builder.class);
    when(builder5.accept(isA(String[].class))).thenReturn(builder4);
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder5);
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act
    ApiResponse<Void> actualDeleteAllowedFileExtensionWithHttpInfoResult =
        new DefaultApi(
                new ApiClientJersey2(
                    httpClient,
                    "https://example.org/example",
                    defaultHeaders,
                    "https://example.org/example"))
            .deleteAllowedFileExtensionWithHttpInfo(
                "https://example.org/example", "/file_ext/v1/allowed_extensions");

    // Assert
    verify(httpClient)
        .target(
            "https://example.org/example/file_ext/v1/allowed_extensions/%2Ffile_ext%2Fv1%2Fallowed_extensions");
    verify(builder5).accept(isA(String[].class));
    verify(builder2).header(eq("Delivered-To"), isA(Object.class));
    verify(builder4).header(eq("X-Trace-Id"), isA(Object.class));
    verify(builder3).header(eq("sessionToken"), isA(Object.class));
    verify(builder).method(eq("DELETE"), isA(Entity.class));
    verify(webTarget).request();
    verify(status).getFamily();
    verify(status, atLeast(1)).getStatusCode();
    assertNull(actualDeleteAllowedFileExtensionWithHttpInfoResult.getData());
    assertEquals(1, actualDeleteAllowedFileExtensionWithHttpInfoResult.getStatusCode());
    assertTrue(actualDeleteAllowedFileExtensionWithHttpInfoResult.getHeaders().isEmpty());
  }

  /**
   * Test {@link DefaultApi#deleteAllowedFileExtensionWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#deleteAllowedFileExtensionWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test deleteAllowedFileExtensionWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse DefaultApi.deleteAllowedFileExtensionWithHttpInfo(String, String)"
  })
  void testDeleteAllowedFileExtensionWithHttpInfo_whenNull_thenThrowApiException()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new DefaultApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .deleteAllowedFileExtensionWithHttpInfo(null, "https://example.org/example"));
  }

  /**
   * Test {@link DefaultApi#deleteAllowedFileExtensionWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#deleteAllowedFileExtensionWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test deleteAllowedFileExtensionWithHttpInfo(String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse DefaultApi.deleteAllowedFileExtensionWithHttpInfo(String, String)"
  })
  void testDeleteAllowedFileExtensionWithHttpInfo_whenNull_thenThrowApiException2()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new DefaultApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .deleteAllowedFileExtensionWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link DefaultApi#deleteAllowedFileExtensionWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code +}.
   *   <li>Then return Data is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#deleteAllowedFileExtensionWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test deleteAllowedFileExtensionWithHttpInfo(String, String); when '+'; then return Data is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse DefaultApi.deleteAllowedFileExtensionWithHttpInfo(String, String)"
  })
  void testDeleteAllowedFileExtensionWithHttpInfo_whenPlusSign_thenReturnDataIsNull()
      throws ApiException {
    // Arrange
    StatusType status = mock(StatusType.class);
    when(status.getStatusCode()).thenReturn(1);
    when(status.getFamily()).thenReturn(Family.SUCCESSFUL);
    Builder builder = mock(Builder.class);
    when(builder.method(Mockito.<String>any(), Mockito.<Entity<?>>any()))
        .thenReturn(new OutboundJaxrsResponse(status, new OutboundMessageContext()));
    Builder builder2 = mock(Builder.class);
    when(builder2.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder);
    Builder builder3 = mock(Builder.class);
    when(builder3.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder2);
    Builder builder4 = mock(Builder.class);
    when(builder4.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder3);
    Builder builder5 = mock(Builder.class);
    when(builder5.accept(isA(String[].class))).thenReturn(builder4);
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder5);
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act
    ApiResponse<Void> actualDeleteAllowedFileExtensionWithHttpInfoResult =
        new DefaultApi(
                new ApiClientJersey2(
                    httpClient,
                    "https://example.org/example",
                    defaultHeaders,
                    "https://example.org/example"))
            .deleteAllowedFileExtensionWithHttpInfo("https://example.org/example", "+");

    // Assert
    verify(httpClient).target("https://example.org/example/file_ext/v1/allowed_extensions/%2B");
    verify(builder5).accept(isA(String[].class));
    verify(builder2).header(eq("Delivered-To"), isA(Object.class));
    verify(builder4).header(eq("X-Trace-Id"), isA(Object.class));
    verify(builder3).header(eq("sessionToken"), isA(Object.class));
    verify(builder).method(eq("DELETE"), isA(Entity.class));
    verify(webTarget).request();
    verify(status).getFamily();
    verify(status, atLeast(1)).getStatusCode();
    assertNull(actualDeleteAllowedFileExtensionWithHttpInfoResult.getData());
    assertEquals(1, actualDeleteAllowedFileExtensionWithHttpInfoResult.getStatusCode());
    assertTrue(actualDeleteAllowedFileExtensionWithHttpInfoResult.getHeaders().isEmpty());
  }

  /**
   * Test {@link DefaultApi#deleteAllowedFileExtensionWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code sessionToken}.
   *   <li>Then return Data is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#deleteAllowedFileExtensionWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test deleteAllowedFileExtensionWithHttpInfo(String, String); when 'sessionToken'; then return Data is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse DefaultApi.deleteAllowedFileExtensionWithHttpInfo(String, String)"
  })
  void testDeleteAllowedFileExtensionWithHttpInfo_whenSessionToken_thenReturnDataIsNull()
      throws ApiException {
    // Arrange
    StatusType status = mock(StatusType.class);
    when(status.getStatusCode()).thenReturn(1);
    when(status.getFamily()).thenReturn(Family.SUCCESSFUL);
    Builder builder = mock(Builder.class);
    when(builder.method(Mockito.<String>any(), Mockito.<Entity<?>>any()))
        .thenReturn(new OutboundJaxrsResponse(status, new OutboundMessageContext()));
    Builder builder2 = mock(Builder.class);
    when(builder2.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder);
    Builder builder3 = mock(Builder.class);
    when(builder3.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder2);
    Builder builder4 = mock(Builder.class);
    when(builder4.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder3);
    Builder builder5 = mock(Builder.class);
    when(builder5.accept(isA(String[].class))).thenReturn(builder4);
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder5);
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act
    ApiResponse<Void> actualDeleteAllowedFileExtensionWithHttpInfoResult =
        new DefaultApi(
                new ApiClientJersey2(
                    httpClient,
                    "https://example.org/example",
                    defaultHeaders,
                    "https://example.org/example"))
            .deleteAllowedFileExtensionWithHttpInfo("https://example.org/example", "sessionToken");

    // Assert
    verify(httpClient)
        .target("https://example.org/example/file_ext/v1/allowed_extensions/sessionToken");
    verify(builder5).accept(isA(String[].class));
    verify(builder2).header(eq("Delivered-To"), isA(Object.class));
    verify(builder4).header(eq("X-Trace-Id"), isA(Object.class));
    verify(builder3).header(eq("sessionToken"), isA(Object.class));
    verify(builder).method(eq("DELETE"), isA(Entity.class));
    verify(webTarget).request();
    verify(status).getFamily();
    verify(status, atLeast(1)).getStatusCode();
    assertNull(actualDeleteAllowedFileExtensionWithHttpInfoResult.getData());
    assertEquals(1, actualDeleteAllowedFileExtensionWithHttpInfoResult.getStatusCode());
    assertTrue(actualDeleteAllowedFileExtensionWithHttpInfoResult.getHeaders().isEmpty());
  }

  /**
   * Test {@link DefaultApi#deleteAllowedFileExtensionWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code utf8}.
   *   <li>Then return Data is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#deleteAllowedFileExtensionWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test deleteAllowedFileExtensionWithHttpInfo(String, String); when 'utf8'; then return Data is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse DefaultApi.deleteAllowedFileExtensionWithHttpInfo(String, String)"
  })
  void testDeleteAllowedFileExtensionWithHttpInfo_whenUtf8_thenReturnDataIsNull()
      throws ApiException {
    // Arrange
    StatusType status = mock(StatusType.class);
    when(status.getStatusCode()).thenReturn(1);
    when(status.getFamily()).thenReturn(Family.SUCCESSFUL);
    Builder builder = mock(Builder.class);
    when(builder.method(Mockito.<String>any(), Mockito.<Entity<?>>any()))
        .thenReturn(new OutboundJaxrsResponse(status, new OutboundMessageContext()));
    Builder builder2 = mock(Builder.class);
    when(builder2.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder);
    Builder builder3 = mock(Builder.class);
    when(builder3.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder2);
    Builder builder4 = mock(Builder.class);
    when(builder4.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder3);
    Builder builder5 = mock(Builder.class);
    when(builder5.accept(isA(String[].class))).thenReturn(builder4);
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder5);
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act
    ApiResponse<Void> actualDeleteAllowedFileExtensionWithHttpInfoResult =
        new DefaultApi(
                new ApiClientJersey2(
                    httpClient,
                    "https://example.org/example",
                    defaultHeaders,
                    "https://example.org/example"))
            .deleteAllowedFileExtensionWithHttpInfo("https://example.org/example", "utf8");

    // Assert
    verify(httpClient).target("https://example.org/example/file_ext/v1/allowed_extensions/utf8");
    verify(builder5).accept(isA(String[].class));
    verify(builder2).header(eq("Delivered-To"), isA(Object.class));
    verify(builder4).header(eq("X-Trace-Id"), isA(Object.class));
    verify(builder3).header(eq("sessionToken"), isA(Object.class));
    verify(builder).method(eq("DELETE"), isA(Entity.class));
    verify(webTarget).request();
    verify(status).getFamily();
    verify(status, atLeast(1)).getStatusCode();
    assertNull(actualDeleteAllowedFileExtensionWithHttpInfoResult.getData());
    assertEquals(1, actualDeleteAllowedFileExtensionWithHttpInfoResult.getStatusCode());
    assertTrue(actualDeleteAllowedFileExtensionWithHttpInfoResult.getHeaders().isEmpty());
  }

  /**
   * Test {@link DefaultApi#deleteAllowedFileExtensionWithHttpInfo(String, String)}.
   *
   * <ul>
   *   <li>When {@code /v1/admin/messages}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#deleteAllowedFileExtensionWithHttpInfo(String, String)}
   */
  @Test
  @DisplayName(
      "Test deleteAllowedFileExtensionWithHttpInfo(String, String); when '/v1/admin/messages'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse DefaultApi.deleteAllowedFileExtensionWithHttpInfo(String, String)"
  })
  void testDeleteAllowedFileExtensionWithHttpInfo_whenV1AdminMessages() throws ApiException {
    // Arrange
    StatusType status = mock(StatusType.class);
    when(status.getStatusCode()).thenReturn(1);
    when(status.getFamily()).thenReturn(Family.SUCCESSFUL);
    Builder builder = mock(Builder.class);
    when(builder.method(Mockito.<String>any(), Mockito.<Entity<?>>any()))
        .thenReturn(new OutboundJaxrsResponse(status, new OutboundMessageContext()));
    Builder builder2 = mock(Builder.class);
    when(builder2.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder);
    Builder builder3 = mock(Builder.class);
    when(builder3.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder2);
    Builder builder4 = mock(Builder.class);
    when(builder4.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder3);
    Builder builder5 = mock(Builder.class);
    when(builder5.accept(isA(String[].class))).thenReturn(builder4);
    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder5);
    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act
    ApiResponse<Void> actualDeleteAllowedFileExtensionWithHttpInfoResult =
        new DefaultApi(
                new ApiClientJersey2(
                    httpClient,
                    "https://example.org/example",
                    defaultHeaders,
                    "https://example.org/example"))
            .deleteAllowedFileExtensionWithHttpInfo(
                "https://example.org/example", "/v1/admin/messages");

    // Assert
    verify(httpClient)
        .target(
            "https://example.org/example/file_ext/v1/allowed_extensions/%2Fv1%2Fadmin%2Fmessages");
    verify(builder5).accept(isA(String[].class));
    verify(builder2).header(eq("Delivered-To"), isA(Object.class));
    verify(builder4).header(eq("X-Trace-Id"), isA(Object.class));
    verify(builder3).header(eq("sessionToken"), isA(Object.class));
    verify(builder).method(eq("DELETE"), isA(Entity.class));
    verify(webTarget).request();
    verify(status).getFamily();
    verify(status, atLeast(1)).getStatusCode();
    assertNull(actualDeleteAllowedFileExtensionWithHttpInfoResult.getData());
    assertEquals(1, actualDeleteAllowedFileExtensionWithHttpInfoResult.getStatusCode());
    assertTrue(actualDeleteAllowedFileExtensionWithHttpInfoResult.getHeaders().isEmpty());
  }

  /**
   * Test {@link DefaultApi#listAllowedFileExtensions(Integer, String, String)}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#listAllowedFileExtensions(Integer, String, String)}
   */
  @Test
  @DisplayName("Test listAllowedFileExtensions(Integer, String, String); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FileExtensionsResponse DefaultApi.listAllowedFileExtensions(Integer, String, String)"
  })
  void testListAllowedFileExtensions_thenReturnNull() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    when(apiClient.invokeAPI(
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<List<Pair>>any(),
            Mockito.<Object>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, Object>>any(),
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<String[]>any(),
            Mockito.<TypeReference<Object>>any()))
        .thenReturn(new ApiResponse<>(1, new HashMap<>()));
    when(apiClient.selectHeaderAccept(isA(String[].class)))
        .thenReturn("https://example.org/example");
    when(apiClient.selectHeaderContentType(isA(String[].class))).thenReturn("text/plain");
    when(apiClient.parameterToPairs(
            Mockito.<String>any(), Mockito.<String>any(), Mockito.<Object>any()))
        .thenReturn(new ArrayList<>());

    // Act
    FileExtensionsResponse actualListAllowedFileExtensionsResult =
        new DefaultApi(apiClient).listAllowedFileExtensions(1, "Before", "After");

    // Assert
    verify(apiClient)
        .invokeAPI(
            eq("/file_ext/v1/allowed_extensions"),
            eq("GET"),
            isA(List.class),
            isNull(),
            isA(Map.class),
            isA(Map.class),
            isA(Map.class),
            eq("https://example.org/example"),
            eq("text/plain"),
            isA(String[].class),
            isA(TypeReference.class));
    verify(apiClient, atLeast(1))
        .parameterToPairs(eq(""), Mockito.<String>any(), Mockito.<Object>any());
    verify(apiClient).selectHeaderAccept(isA(String[].class));
    verify(apiClient).selectHeaderContentType(isA(String[].class));
    assertNull(actualListAllowedFileExtensionsResult);
  }

  /**
   * Test {@link DefaultApi#listAllowedFileExtensionsWithHttpInfo(Integer, String, String)}.
   *
   * <p>Method under test: {@link DefaultApi#listAllowedFileExtensionsWithHttpInfo(Integer, String,
   * String)}
   */
  @Test
  @DisplayName("Test listAllowedFileExtensionsWithHttpInfo(Integer, String, String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse DefaultApi.listAllowedFileExtensionsWithHttpInfo(Integer, String, String)"
  })
  void testListAllowedFileExtensionsWithHttpInfo() throws ApiException {
    // Arrange
    ApiClient apiClient = mock(ApiClient.class);
    ApiResponse<Object> apiResponse = new ApiResponse<>(1, new HashMap<>());

    when(apiClient.invokeAPI(
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<List<Pair>>any(),
            Mockito.<Object>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, Object>>any(),
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<String[]>any(),
            Mockito.<TypeReference<Object>>any()))
        .thenReturn(apiResponse);
    when(apiClient.selectHeaderAccept(isA(String[].class)))
        .thenReturn("https://example.org/example");
    when(apiClient.selectHeaderContentType(isA(String[].class))).thenReturn("text/plain");
    when(apiClient.parameterToPairs(
            Mockito.<String>any(), Mockito.<String>any(), Mockito.<Object>any()))
        .thenReturn(new ArrayList<>());

    // Act
    ApiResponse<FileExtensionsResponse> actualListAllowedFileExtensionsWithHttpInfoResult =
        new DefaultApi(apiClient)
            .listAllowedFileExtensionsWithHttpInfo(
                1, "https://example.org/example", "https://example.org/example");

    // Assert
    verify(apiClient)
        .invokeAPI(
            eq("/file_ext/v1/allowed_extensions"),
            eq("GET"),
            isA(List.class),
            isNull(),
            isA(Map.class),
            isA(Map.class),
            isA(Map.class),
            eq("https://example.org/example"),
            eq("text/plain"),
            isA(String[].class),
            isA(TypeReference.class));
    verify(apiClient, atLeast(1))
        .parameterToPairs(eq(""), Mockito.<String>any(), Mockito.<Object>any());
    verify(apiClient).selectHeaderAccept(isA(String[].class));
    verify(apiClient).selectHeaderContentType(isA(String[].class));
    assertSame(apiResponse, actualListAllowedFileExtensionsWithHttpInfoResult);
  }

  /**
   * Test {@link DefaultApi#putAllowedFileExtension(String, String, FileExtension)}.
   *
   * <ul>
   *   <li>When {@code Extension}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#putAllowedFileExtension(String, String, FileExtension)}
   */
  @Test
  @DisplayName(
      "Test putAllowedFileExtension(String, String, FileExtension); when 'Extension'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FileExtension DefaultApi.putAllowedFileExtension(String, String, FileExtension)"
  })
  void testPutAllowedFileExtension_whenExtension_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    DefaultApi defaultApi =
        new DefaultApi(
            new ApiClientJersey2(
                mock(Client.class),
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"));

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> defaultApi.putAllowedFileExtension(null, "Extension", new FileExtension()));
  }

  /**
   * Test {@link DefaultApi#putAllowedFileExtension(String, String, FileExtension)}.
   *
   * <ul>
   *   <li>When {@code Extension}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#putAllowedFileExtension(String, String, FileExtension)}
   */
  @Test
  @DisplayName(
      "Test putAllowedFileExtension(String, String, FileExtension); when 'Extension'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FileExtension DefaultApi.putAllowedFileExtension(String, String, FileExtension)"
  })
  void testPutAllowedFileExtension_whenExtension_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new DefaultApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .putAllowedFileExtension("ABC123", "Extension", null));
  }

  /**
   * Test {@link DefaultApi#putAllowedFileExtension(String, String, FileExtension)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#putAllowedFileExtension(String, String, FileExtension)}
   */
  @Test
  @DisplayName(
      "Test putAllowedFileExtension(String, String, FileExtension); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FileExtension DefaultApi.putAllowedFileExtension(String, String, FileExtension)"
  })
  void testPutAllowedFileExtension_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    DefaultApi defaultApi =
        new DefaultApi(
            new ApiClientJersey2(
                mock(Client.class),
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"));

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> defaultApi.putAllowedFileExtension("ABC123", null, new FileExtension()));
  }

  /**
   * Test {@link DefaultApi#putAllowedFileExtensionWithHttpInfo(String, String, FileExtension)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#putAllowedFileExtensionWithHttpInfo(String, String,
   * FileExtension)}
   */
  @Test
  @DisplayName(
      "Test putAllowedFileExtensionWithHttpInfo(String, String, FileExtension); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse DefaultApi.putAllowedFileExtensionWithHttpInfo(String, String, FileExtension)"
  })
  void testPutAllowedFileExtensionWithHttpInfo_whenNull_thenThrowApiException()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    DefaultApi defaultApi =
        new DefaultApi(
            new ApiClientJersey2(
                mock(Client.class),
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"));

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            defaultApi.putAllowedFileExtensionWithHttpInfo(
                null, "https://example.org/example", new FileExtension()));
  }

  /**
   * Test {@link DefaultApi#putAllowedFileExtensionWithHttpInfo(String, String, FileExtension)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#putAllowedFileExtensionWithHttpInfo(String, String,
   * FileExtension)}
   */
  @Test
  @DisplayName(
      "Test putAllowedFileExtensionWithHttpInfo(String, String, FileExtension); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse DefaultApi.putAllowedFileExtensionWithHttpInfo(String, String, FileExtension)"
  })
  void testPutAllowedFileExtensionWithHttpInfo_whenNull_thenThrowApiException2()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    DefaultApi defaultApi =
        new DefaultApi(
            new ApiClientJersey2(
                mock(Client.class),
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"));

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            defaultApi.putAllowedFileExtensionWithHttpInfo(
                "https://example.org/example", null, new FileExtension()));
  }

  /**
   * Test {@link DefaultApi#putAllowedFileExtensionWithHttpInfo(String, String, FileExtension)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#putAllowedFileExtensionWithHttpInfo(String, String,
   * FileExtension)}
   */
  @Test
  @DisplayName(
      "Test putAllowedFileExtensionWithHttpInfo(String, String, FileExtension); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse DefaultApi.putAllowedFileExtensionWithHttpInfo(String, String, FileExtension)"
  })
  void testPutAllowedFileExtensionWithHttpInfo_whenNull_thenThrowApiException3()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new DefaultApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .putAllowedFileExtensionWithHttpInfo(
                    "https://example.org/example", "https://example.org/example", null));
  }

  /**
   * Test {@link DefaultApi#v1AdminMessagesMessageIdMetadataRelationshipsGet(String, String,
   * String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultApi#v1AdminMessagesMessageIdMetadataRelationshipsGet(String, String, String)}
   */
  @Test
  @DisplayName(
      "Test v1AdminMessagesMessageIdMetadataRelationshipsGet(String, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.MessageMetadataResponse DefaultApi.v1AdminMessagesMessageIdMetadataRelationshipsGet(String, String, String)"
  })
  void testV1AdminMessagesMessageIdMetadataRelationshipsGet_thenThrowApiException()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new DefaultApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminMessagesMessageIdMetadataRelationshipsGet(null, "User Agent", "42"));
  }

  /**
   * Test {@link DefaultApi#v1AdminMessagesMessageIdMetadataRelationshipsGet(String, String,
   * String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultApi#v1AdminMessagesMessageIdMetadataRelationshipsGet(String, String, String)}
   */
  @Test
  @DisplayName(
      "Test v1AdminMessagesMessageIdMetadataRelationshipsGet(String, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.MessageMetadataResponse DefaultApi.v1AdminMessagesMessageIdMetadataRelationshipsGet(String, String, String)"
  })
  void testV1AdminMessagesMessageIdMetadataRelationshipsGet_thenThrowApiException2()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new DefaultApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminMessagesMessageIdMetadataRelationshipsGet("ABC123", null, "42"));
  }

  /**
   * Test {@link DefaultApi#v1AdminMessagesMessageIdMetadataRelationshipsGet(String, String,
   * String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultApi#v1AdminMessagesMessageIdMetadataRelationshipsGet(String, String, String)}
   */
  @Test
  @DisplayName(
      "Test v1AdminMessagesMessageIdMetadataRelationshipsGet(String, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.MessageMetadataResponse DefaultApi.v1AdminMessagesMessageIdMetadataRelationshipsGet(String, String, String)"
  })
  void testV1AdminMessagesMessageIdMetadataRelationshipsGet_thenThrowApiException3()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new DefaultApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminMessagesMessageIdMetadataRelationshipsGet("ABC123", "User Agent", null));
  }

  /**
   * Test {@link DefaultApi#v1AdminMessagesMessageIdMetadataRelationshipsGetWithHttpInfo(String,
   * String, String)}.
   *
   * <p>Method under test: {@link
   * DefaultApi#v1AdminMessagesMessageIdMetadataRelationshipsGetWithHttpInfo(String, String,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v1AdminMessagesMessageIdMetadataRelationshipsGetWithHttpInfo(String, String, String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse DefaultApi.v1AdminMessagesMessageIdMetadataRelationshipsGetWithHttpInfo(String, String, String)"
  })
  void testV1AdminMessagesMessageIdMetadataRelationshipsGetWithHttpInfo() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new DefaultApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminMessagesMessageIdMetadataRelationshipsGetWithHttpInfo(
                    null, "https://example.org/example", "https://example.org/example"));
  }

  /**
   * Test {@link DefaultApi#v1AdminMessagesMessageIdMetadataRelationshipsGetWithHttpInfo(String,
   * String, String)}.
   *
   * <p>Method under test: {@link
   * DefaultApi#v1AdminMessagesMessageIdMetadataRelationshipsGetWithHttpInfo(String, String,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v1AdminMessagesMessageIdMetadataRelationshipsGetWithHttpInfo(String, String, String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse DefaultApi.v1AdminMessagesMessageIdMetadataRelationshipsGetWithHttpInfo(String, String, String)"
  })
  void testV1AdminMessagesMessageIdMetadataRelationshipsGetWithHttpInfo2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new DefaultApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminMessagesMessageIdMetadataRelationshipsGetWithHttpInfo(
                    "https://example.org/example", null, "https://example.org/example"));
  }

  /**
   * Test {@link DefaultApi#v1AdminMessagesMessageIdMetadataRelationshipsGetWithHttpInfo(String,
   * String, String)}.
   *
   * <p>Method under test: {@link
   * DefaultApi#v1AdminMessagesMessageIdMetadataRelationshipsGetWithHttpInfo(String, String,
   * String)}
   */
  @Test
  @DisplayName(
      "Test v1AdminMessagesMessageIdMetadataRelationshipsGetWithHttpInfo(String, String, String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse DefaultApi.v1AdminMessagesMessageIdMetadataRelationshipsGetWithHttpInfo(String, String, String)"
  })
  void testV1AdminMessagesMessageIdMetadataRelationshipsGetWithHttpInfo3() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new DefaultApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminMessagesMessageIdMetadataRelationshipsGetWithHttpInfo(
                    "https://example.org/example", "https://example.org/example", null));
  }

  /**
   * Test {@link DefaultApi#v1AdminMessagesMessageIdReceiptsGet(String, String, String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#v1AdminMessagesMessageIdReceiptsGet(String, String,
   * String, String)}
   */
  @Test
  @DisplayName(
      "Test v1AdminMessagesMessageIdReceiptsGet(String, String, String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.MessageReceiptDetailResponse DefaultApi.v1AdminMessagesMessageIdReceiptsGet(String, String, String, String)"
  })
  void testV1AdminMessagesMessageIdReceiptsGet_whenNull_thenThrowApiException()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new DefaultApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminMessagesMessageIdReceiptsGet(null, "42", "Before", "After"));
  }

  /**
   * Test {@link DefaultApi#v1AdminMessagesMessageIdReceiptsGet(String, String, String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#v1AdminMessagesMessageIdReceiptsGet(String, String,
   * String, String)}
   */
  @Test
  @DisplayName(
      "Test v1AdminMessagesMessageIdReceiptsGet(String, String, String, String); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.gen.api.model.MessageReceiptDetailResponse DefaultApi.v1AdminMessagesMessageIdReceiptsGet(String, String, String, String)"
  })
  void testV1AdminMessagesMessageIdReceiptsGet_whenNull_thenThrowApiException2()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new DefaultApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminMessagesMessageIdReceiptsGet("ABC123", null, "Before", "After"));
  }

  /**
   * Test {@link DefaultApi#v1AdminMessagesMessageIdReceiptsGetWithHttpInfo(String, String, String,
   * String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#v1AdminMessagesMessageIdReceiptsGetWithHttpInfo(String,
   * String, String, String)}
   */
  @Test
  @DisplayName(
      "Test v1AdminMessagesMessageIdReceiptsGetWithHttpInfo(String, String, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse DefaultApi.v1AdminMessagesMessageIdReceiptsGetWithHttpInfo(String, String, String, String)"
  })
  void testV1AdminMessagesMessageIdReceiptsGetWithHttpInfo_thenThrowApiException()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new DefaultApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminMessagesMessageIdReceiptsGetWithHttpInfo(
                    null,
                    "https://example.org/example",
                    "https://example.org/example",
                    "https://example.org/example"));
  }

  /**
   * Test {@link DefaultApi#v1AdminMessagesMessageIdReceiptsGetWithHttpInfo(String, String, String,
   * String)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#v1AdminMessagesMessageIdReceiptsGetWithHttpInfo(String,
   * String, String, String)}
   */
  @Test
  @DisplayName(
      "Test v1AdminMessagesMessageIdReceiptsGetWithHttpInfo(String, String, String, String); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse DefaultApi.v1AdminMessagesMessageIdReceiptsGetWithHttpInfo(String, String, String, String)"
  })
  void testV1AdminMessagesMessageIdReceiptsGetWithHttpInfo_thenThrowApiException2()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new DefaultApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminMessagesMessageIdReceiptsGetWithHttpInfo(
                    "https://example.org/example",
                    null,
                    "https://example.org/example",
                    "https://example.org/example"));
  }

  /**
   * Test {@link DefaultApi#v1AdminMessagesPost(String, MessageIds)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#v1AdminMessagesPost(String, MessageIds)}
   */
  @Test
  @DisplayName("Test v1AdminMessagesPost(String, MessageIds); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List DefaultApi.v1AdminMessagesPost(String, MessageIds)"})
  void testV1AdminMessagesPost_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    DefaultApi defaultApi =
        new DefaultApi(
            new ApiClientJersey2(
                mock(Client.class),
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"));

    // Act and Assert
    assertThrows(ApiException.class, () -> defaultApi.v1AdminMessagesPost(null, new MessageIds()));
  }

  /**
   * Test {@link DefaultApi#v1AdminMessagesPost(String, MessageIds)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#v1AdminMessagesPost(String, MessageIds)}
   */
  @Test
  @DisplayName("Test v1AdminMessagesPost(String, MessageIds); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List DefaultApi.v1AdminMessagesPost(String, MessageIds)"})
  void testV1AdminMessagesPost_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new DefaultApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminMessagesPost("ABC123", null));
  }

  /**
   * Test {@link DefaultApi#v1AdminMessagesPostWithHttpInfo(String, MessageIds)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#v1AdminMessagesPostWithHttpInfo(String, MessageIds)}
   */
  @Test
  @DisplayName("Test v1AdminMessagesPostWithHttpInfo(String, MessageIds); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiResponse DefaultApi.v1AdminMessagesPostWithHttpInfo(String, MessageIds)"})
  void testV1AdminMessagesPostWithHttpInfo_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    DefaultApi defaultApi =
        new DefaultApi(
            new ApiClientJersey2(
                mock(Client.class),
                "https://example.org/example",
                defaultHeaders,
                "https://example.org/example"));

    // Act and Assert
    assertThrows(
        ApiException.class,
        () -> defaultApi.v1AdminMessagesPostWithHttpInfo(null, new MessageIds()));
  }

  /**
   * Test {@link DefaultApi#v1AdminMessagesPostWithHttpInfo(String, MessageIds)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#v1AdminMessagesPostWithHttpInfo(String, MessageIds)}
   */
  @Test
  @DisplayName("Test v1AdminMessagesPostWithHttpInfo(String, MessageIds); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiResponse DefaultApi.v1AdminMessagesPostWithHttpInfo(String, MessageIds)"})
  void testV1AdminMessagesPostWithHttpInfo_thenThrowApiException2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new DefaultApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v1AdminMessagesPostWithHttpInfo("https://example.org/example", null));
  }

  /**
   * Test {@link DefaultApi#v2AdminStreamsStreamIdMessageIdsGet(String, String, Long, Long, Integer,
   * Integer)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#v2AdminStreamsStreamIdMessageIdsGet(String, String,
   * Long, Long, Integer, Integer)}
   */
  @Test
  @DisplayName(
      "Test v2AdminStreamsStreamIdMessageIdsGet(String, String, Long, Long, Integer, Integer); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MessageIdsFromStream DefaultApi.v2AdminStreamsStreamIdMessageIdsGet(String, String, Long, Long, Integer, Integer)"
  })
  void testV2AdminStreamsStreamIdMessageIdsGet_whenNull_thenThrowApiException()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new DefaultApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v2AdminStreamsStreamIdMessageIdsGet(null, "42", 1L, 1L, 1, 2));
  }

  /**
   * Test {@link DefaultApi#v2AdminStreamsStreamIdMessageIdsGet(String, String, Long, Long, Integer,
   * Integer)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#v2AdminStreamsStreamIdMessageIdsGet(String, String,
   * Long, Long, Integer, Integer)}
   */
  @Test
  @DisplayName(
      "Test v2AdminStreamsStreamIdMessageIdsGet(String, String, Long, Long, Integer, Integer); when 'null'; then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MessageIdsFromStream DefaultApi.v2AdminStreamsStreamIdMessageIdsGet(String, String, Long, Long, Integer, Integer)"
  })
  void testV2AdminStreamsStreamIdMessageIdsGet_whenNull_thenThrowApiException2()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new DefaultApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v2AdminStreamsStreamIdMessageIdsGet("ABC123", null, 1L, 1L, 1, 2));
  }

  /**
   * Test {@link DefaultApi#v2AdminStreamsStreamIdMessageIdsGetWithHttpInfo(String, String, Long,
   * Long, Integer, Integer)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#v2AdminStreamsStreamIdMessageIdsGetWithHttpInfo(String,
   * String, Long, Long, Integer, Integer)}
   */
  @Test
  @DisplayName(
      "Test v2AdminStreamsStreamIdMessageIdsGetWithHttpInfo(String, String, Long, Long, Integer, Integer); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse DefaultApi.v2AdminStreamsStreamIdMessageIdsGetWithHttpInfo(String, String, Long, Long, Integer, Integer)"
  })
  void testV2AdminStreamsStreamIdMessageIdsGetWithHttpInfo_thenThrowApiException()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new DefaultApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v2AdminStreamsStreamIdMessageIdsGetWithHttpInfo(
                    null, "https://example.org/example", 1L, 1L, 1, 2));
  }

  /**
   * Test {@link DefaultApi#v2AdminStreamsStreamIdMessageIdsGetWithHttpInfo(String, String, Long,
   * Long, Integer, Integer)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultApi#v2AdminStreamsStreamIdMessageIdsGetWithHttpInfo(String,
   * String, Long, Long, Integer, Integer)}
   */
  @Test
  @DisplayName(
      "Test v2AdminStreamsStreamIdMessageIdsGetWithHttpInfo(String, String, Long, Long, Integer, Integer); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ApiResponse DefaultApi.v2AdminStreamsStreamIdMessageIdsGetWithHttpInfo(String, String, Long, Long, Integer, Integer)"
  })
  void testV2AdminStreamsStreamIdMessageIdsGetWithHttpInfo_thenThrowApiException2()
      throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertThrows(
        ApiException.class,
        () ->
            new DefaultApi(
                    new ApiClientJersey2(
                        mock(Client.class),
                        "https://example.org/example",
                        defaultHeaders,
                        "https://example.org/example"))
                .v2AdminStreamsStreamIdMessageIdsGetWithHttpInfo(
                    "https://example.org/example", null, 1L, 1L, 1, 2));
  }
}
