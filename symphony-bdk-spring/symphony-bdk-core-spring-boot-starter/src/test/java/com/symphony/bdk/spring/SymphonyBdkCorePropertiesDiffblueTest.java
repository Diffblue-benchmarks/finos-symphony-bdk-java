package com.symphony.bdk.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {SymphonyBdkCoreProperties.class})
@ExtendWith(SpringExtension.class)
class SymphonyBdkCorePropertiesDiffblueTest {
  @Autowired
  private SymphonyBdkCoreProperties symphonyBdkCoreProperties;

  /**
   * Test new {@link SymphonyBdkCoreProperties} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link SymphonyBdkCoreProperties}
   */
  @Test
  @DisplayName("Test new SymphonyBdkCoreProperties (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SymphonyBdkCoreProperties.<init>()"})
  void testNewSymphonyBdkCoreProperties() {
    // Arrange and Act
    SymphonyBdkCoreProperties actualSymphonyBdkCoreProperties = new SymphonyBdkCoreProperties();

    // Assert
    assertEquals("", actualSymphonyBdkCoreProperties.getContext());
    assertEquals("", actualSymphonyBdkCoreProperties.getFormattedContext());
    assertEquals("https", actualSymphonyBdkCoreProperties.getScheme());
    assertEquals("https://null:443", actualSymphonyBdkCoreProperties.getBasePath());
    assertNull(actualSymphonyBdkCoreProperties.getProxy());
    assertNull(actualSymphonyBdkCoreProperties.getConnectionPoolMax());
    assertNull(actualSymphonyBdkCoreProperties.getConnectionPoolPerRoute());
    assertNull(actualSymphonyBdkCoreProperties.getConnectionTimeout());
    assertNull(actualSymphonyBdkCoreProperties.getReadTimeout());
    assertNull(actualSymphonyBdkCoreProperties.getHost());
    assertNull(actualSymphonyBdkCoreProperties.getDefaultHeaders());
    assertEquals(443, actualSymphonyBdkCoreProperties.getPort().intValue());
    assertFalse(actualSymphonyBdkCoreProperties.isBotConfigured());
    assertFalse(actualSymphonyBdkCoreProperties.isOboConfigured());
  }
}
