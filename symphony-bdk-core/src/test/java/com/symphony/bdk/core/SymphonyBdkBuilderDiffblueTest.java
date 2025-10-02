package com.symphony.bdk.core;

import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.extension.BdkExtension;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SymphonyBdkBuilderDiffblueTest {
  /**
   * Test {@link SymphonyBdkBuilder#extension(Class)}.
   *
   * <p>Method under test: {@link SymphonyBdkBuilder#extension(Class)}
   */
  @Test
  @DisplayName("Test extension(Class)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SymphonyBdkBuilder SymphonyBdkBuilder.extension(Class)"})
  void testExtension() {
    // Arrange
    SymphonyBdkBuilder builderResult = SymphonyBdk.builder();
    Class<BdkExtension> extension = BdkExtension.class;

    // Act
    SymphonyBdkBuilder actualExtensionResult = builderResult.extension(extension);

    // Assert
    assertSame(builderResult, actualExtensionResult);
  }
}
