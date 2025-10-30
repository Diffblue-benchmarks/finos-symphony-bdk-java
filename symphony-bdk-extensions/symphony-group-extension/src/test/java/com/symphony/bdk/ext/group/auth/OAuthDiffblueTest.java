package com.symphony.bdk.ext.group.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class OAuthDiffblueTest {
  /**
   * Test {@link OAuth#apply(Map)}.
   * <p>
   * Method under test: {@link OAuth#apply(Map)}
   */
  @Test
  @DisplayName("Test apply(Map)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void OAuth.apply(Map)"})
  void testApply() {
    // Arrange
    Supplier<String> bearerTokenSupplier = mock(Supplier.class);
    when(bearerTokenSupplier.get()).thenReturn("Get");
    OAuth oAuth = new OAuth(bearerTokenSupplier);
    HashMap<String, String> headerParams = new HashMap<>();

    // Act
    oAuth.apply(headerParams);

    // Assert
    verify(bearerTokenSupplier).get();
    assertEquals(1, headerParams.size());
    assertEquals("Bearer Get", headerParams.get("Authorization"));
  }
}
