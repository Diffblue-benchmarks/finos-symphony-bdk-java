package com.symphony.bdk.core.auth.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.retry.function.SupplierWithApiException;
import com.symphony.bdk.http.api.ApiException;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class OAuthenticationDiffblueTest {
  /**
   * Test {@link OAuthentication#apply(Map)}.
   *
   * <ul>
   *   <li>Given {@link SupplierWithApiException} {@link SupplierWithApiException#get()} return
   *       {@code Get}.
   *   <li>Then {@link HashMap#HashMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link OAuthentication#apply(Map)}
   */
  @Test
  @DisplayName(
      "Test apply(Map); given SupplierWithApiException get() return 'Get'; then HashMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void OAuthentication.apply(Map)"})
  void testApply_givenSupplierWithApiExceptionGetReturnGet_thenHashMapSizeIsOne()
      throws ApiException {
    // Arrange
    SupplierWithApiException<String> bearerAuthSupplier = mock(SupplierWithApiException.class);
    when(bearerAuthSupplier.get()).thenReturn("Get");
    OAuthentication oAuthentication = new OAuthentication(bearerAuthSupplier);
    HashMap<String, String> headerParams = new HashMap<>();

    // Act
    oAuthentication.apply(headerParams);

    // Assert
    verify(bearerAuthSupplier).get();
    assertEquals(1, headerParams.size());
    assertEquals("Get", headerParams.get("Authorization"));
  }

  /**
   * Test {@link OAuthentication#apply(Map)}.
   *
   * <ul>
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link OAuthentication#apply(Map)}
   */
  @Test
  @DisplayName("Test apply(Map); then throw ApiException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void OAuthentication.apply(Map)"})
  void testApply_thenThrowApiException() throws ApiException {
    // Arrange
    SupplierWithApiException<String> bearerAuthSupplier = mock(SupplierWithApiException.class);
    when(bearerAuthSupplier.get()).thenThrow(new ApiException(1, "https://example.org/example"));
    OAuthentication oAuthentication = new OAuthentication(bearerAuthSupplier);

    // Act and Assert
    assertThrows(ApiException.class, () -> oAuthentication.apply(new HashMap<>()));
    verify(bearerAuthSupplier).get();
  }
}
