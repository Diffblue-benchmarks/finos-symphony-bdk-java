package com.symphony.bdk.core.service.version;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.service.version.model.AgentVersion;
import com.symphony.bdk.gen.api.SignalsApi;
import com.symphony.bdk.http.jersey2.ApiClientJersey2;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.Invocation.Builder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jakarta.ws.rs.core.Response.Status.Family;
import jakarta.ws.rs.core.Response.StatusType;
import java.util.HashMap;
import java.util.Optional;
import org.glassfish.jersey.message.internal.OutboundJaxrsResponse;
import org.glassfish.jersey.message.internal.OutboundMessageContext;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class AgentVersionServiceDiffblueTest {
  /**
   * Test {@link AgentVersionService#retrieveAgentVersion()}.
   *
   * <ul>
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link AgentVersionService#retrieveAgentVersion()}
   */
  @Test
  @DisplayName("Test retrieveAgentVersion(); then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional AgentVersionService.retrieveAgentVersion()"})
  void testRetrieveAgentVersion_thenReturnNotPresent() {
    // Arrange
    StatusType status = mock(StatusType.class);
    when(status.getStatusCode()).thenReturn(1);
    when(status.getFamily()).thenReturn(Family.INFORMATIONAL);
    OutboundJaxrsResponse outboundJaxrsResponse =
        new OutboundJaxrsResponse(status, new OutboundMessageContext());

    Builder builder = mock(Builder.class);
    when(builder.get()).thenReturn(outboundJaxrsResponse);

    Builder builder2 = mock(Builder.class);
    when(builder2.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder);

    Builder builder3 = mock(Builder.class);
    when(builder3.header(Mockito.<String>any(), Mockito.<Object>any())).thenReturn(builder2);

    Builder builder4 = mock(Builder.class);
    when(builder4.accept(isA(String[].class))).thenReturn(builder3);

    WebTarget webTarget = mock(WebTarget.class);
    when(webTarget.request()).thenReturn(builder4);

    Client httpClient = mock(Client.class);
    when(httpClient.target(Mockito.<String>any())).thenReturn(webTarget);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    ApiClientJersey2 apiClient =
        new ApiClientJersey2(
            httpClient,
            "https://example.org/example",
            defaultHeaders,
            "https://example.org/example");

    // Act
    Optional<AgentVersion> actualRetrieveAgentVersionResult =
        new AgentVersionService(new SignalsApi(apiClient)).retrieveAgentVersion();

    // Assert
    verify(httpClient).target("https://example.org/example/v1/info");
    verify(builder4).accept(isA(String[].class));
    verify(builder2).header(eq("Delivered-To"), isA(Object.class));
    verify(builder3).header(eq("X-Trace-Id"), isA(Object.class));
    verify(builder).get();
    verify(webTarget).request();
    verify(status).getFamily();
    verify(status, atLeast(1)).getStatusCode();
    assertFalse(actualRetrieveAgentVersionResult.isPresent());
  }
}
