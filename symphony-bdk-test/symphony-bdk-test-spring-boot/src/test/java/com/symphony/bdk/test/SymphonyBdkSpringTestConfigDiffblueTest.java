package com.symphony.bdk.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.UserV2;
import com.symphony.bdk.template.api.TemplateEngine;
import com.symphony.bdk.template.freemarker.FreeMarkerEngine;
import com.symphony.bdk.template.freemarker.FreeMarkerTemplate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SymphonyBdkSpringTestConfigDiffblueTest {
  /**
   * Test {@link SymphonyBdkSpringTestConfig#botInfo(BdkSpringTestProperties)}.
   * <p>
   * Method under test: {@link SymphonyBdkSpringTestConfig#botInfo(BdkSpringTestProperties)}
   */
  @Test
  @DisplayName("Test botInfo(BdkSpringTestProperties)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"UserV2 SymphonyBdkSpringTestConfig.botInfo(BdkSpringTestProperties)"})
  void testBotInfo() {
    // Arrange
    SymphonyBdkSpringTestConfig symphonyBdkSpringTestConfig = new SymphonyBdkSpringTestConfig();

    BdkSpringTestProperties properties = new BdkSpringTestProperties();
    properties.setDisplayName("Display Name");
    properties.setEmail("jane.doe@example.org");
    properties.setId(1L);
    properties.setUsername("janedoe");

    // Act
    UserV2 actualBotInfoResult = symphonyBdkSpringTestConfig.botInfo(properties);

    // Assert
    assertEquals("Display Name", actualBotInfoResult.getDisplayName());
    assertEquals("janedoe", actualBotInfoResult.getUsername());
    assertNull(actualBotInfoResult.getAccountType());
    assertNull(actualBotInfoResult.getCompany());
    assertNull(actualBotInfoResult.getDepartment());
    assertNull(actualBotInfoResult.getDivision());
    assertNull(actualBotInfoResult.getEmailAddress());
    assertNull(actualBotInfoResult.getFirstName());
    assertNull(actualBotInfoResult.getJobFunction());
    assertNull(actualBotInfoResult.getLastName());
    assertNull(actualBotInfoResult.getLocation());
    assertNull(actualBotInfoResult.getMobilePhoneNumber());
    assertNull(actualBotInfoResult.getTitle());
    assertNull(actualBotInfoResult.getWorkPhoneNumber());
    assertNull(actualBotInfoResult.getAvatars());
    assertNull(actualBotInfoResult.getRoles());
    assertEquals(1L, actualBotInfoResult.getId().longValue());
  }

  /**
   * Test {@link SymphonyBdkSpringTestConfig#templateEngine()}.
   * <p>
   * Method under test: {@link SymphonyBdkSpringTestConfig#templateEngine()}
   */
  @Test
  @DisplayName("Test templateEngine()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TemplateEngine SymphonyBdkSpringTestConfig.templateEngine()"})
  void testTemplateEngine() {
    // Arrange and Act
    TemplateEngine actualTemplateEngineResult = (new SymphonyBdkSpringTestConfig()).templateEngine();

    // Assert
    assertTrue(actualTemplateEngineResult instanceof FreeMarkerEngine);
    assertTrue(actualTemplateEngineResult.newTemplateFromString("Template") instanceof FreeMarkerTemplate);
  }
}
