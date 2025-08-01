package com.symphony.bdk.core.util;

import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ServiceLookupDiffblueTest {
  /**
   * Test {@link ServiceLookup#lookupSingleService(Class)}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link ServiceLookup#lookupSingleService(Class)}
   */
  @Test
  @DisplayName(
      "Test lookupSingleService(Class); when 'java.lang.Object'; then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ServiceLookup.lookupSingleService(Class)"})
  void testLookupSingleService_whenJavaLangObject_thenThrowIllegalStateException() {
    // Arrange
    Class<Object> clz = Object.class;

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> ServiceLookup.lookupSingleService(clz));
  }
}
