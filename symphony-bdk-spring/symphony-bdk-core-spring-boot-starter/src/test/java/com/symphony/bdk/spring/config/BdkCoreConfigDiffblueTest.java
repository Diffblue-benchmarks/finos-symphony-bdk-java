package com.symphony.bdk.spring.config;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.AuthenticatorFactory;
import com.symphony.bdk.core.auth.ExtensionAppTokensRepository;
import com.symphony.bdk.core.auth.impl.InMemoryTokensRepository;
import com.symphony.bdk.core.client.ApiClientFactory;
import com.symphony.bdk.core.config.model.BdkBotConfig;
import com.symphony.bdk.core.config.model.BdkCertificateConfig;
import com.symphony.bdk.core.config.model.BdkConfig;
import com.symphony.bdk.core.config.model.BdkRsaKeyConfig;
import com.symphony.bdk.template.api.TemplateEngine;
import com.symphony.bdk.template.freemarker.FreeMarkerEngine;
import com.symphony.bdk.template.freemarker.FreeMarkerTemplate;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanInitializationException;

class BdkCoreConfigDiffblueTest {
  /**
   * Test {@link BdkCoreConfig#extensionAppTokensRepository()}.
   *
   * <p>Method under test: {@link BdkCoreConfig#extensionAppTokensRepository()}
   */
  @Test
  @DisplayName("Test extensionAppTokensRepository()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtensionAppTokensRepository BdkCoreConfig.extensionAppTokensRepository()"})
  void testExtensionAppTokensRepository() {
    // Arrange and Act
    ExtensionAppTokensRepository actualExtensionAppTokensRepositoryResult =
        new BdkCoreConfig().extensionAppTokensRepository();

    // Assert
    assertTrue(actualExtensionAppTokensRepositoryResult instanceof InMemoryTokensRepository);
    assertFalse(actualExtensionAppTokensRepositoryResult.get("ABC123").isPresent());
  }

  /**
   * Test {@link BdkCoreConfig#extensionAppTokensRepository()}.
   *
   * <p>Method under test: {@link BdkCoreConfig#extensionAppTokensRepository()}
   */
  @Test
  @DisplayName("Test extensionAppTokensRepository()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtensionAppTokensRepository BdkCoreConfig.extensionAppTokensRepository()"})
  void testExtensionAppTokensRepository2() {
    // Arrange and Act
    ExtensionAppTokensRepository actualExtensionAppTokensRepositoryResult =
        new BdkCoreConfig().extensionAppTokensRepository();

    // Assert
    assertTrue(actualExtensionAppTokensRepositoryResult instanceof InMemoryTokensRepository);
    assertFalse(actualExtensionAppTokensRepositoryResult.get("ABC123").isPresent());
  }

  /**
   * Test {@link BdkCoreConfig#templateEngine()}.
   *
   * <p>Method under test: {@link BdkCoreConfig#templateEngine()}
   */
  @Test
  @DisplayName("Test templateEngine()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TemplateEngine BdkCoreConfig.templateEngine()"})
  void testTemplateEngine() {
    // Arrange and Act
    TemplateEngine actualTemplateEngineResult = new BdkCoreConfig().templateEngine();

    // Assert
    assertTrue(actualTemplateEngineResult instanceof FreeMarkerEngine);
    assertTrue(
        actualTemplateEngineResult.newTemplateFromString("Template") instanceof FreeMarkerTemplate);
  }

  /**
   * Test {@link BdkCoreConfig#templateEngine()}.
   *
   * <p>Method under test: {@link BdkCoreConfig#templateEngine()}
   */
  @Test
  @DisplayName("Test templateEngine()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TemplateEngine BdkCoreConfig.templateEngine()"})
  void testTemplateEngine2() {
    // Arrange and Act
    TemplateEngine actualTemplateEngineResult = new BdkCoreConfig().templateEngine();

    // Assert
    assertTrue(actualTemplateEngineResult instanceof FreeMarkerEngine);
    assertTrue(
        actualTemplateEngineResult.newTemplateFromString("Template") instanceof FreeMarkerTemplate);
  }

  /**
   * Test {@link BdkCoreConfig#botSession(AuthenticatorFactory)}.
   *
   * <ul>
   *   <li>Then throw {@link BeanInitializationException}.
   * </ul>
   *
   * <p>Method under test: {@link BdkCoreConfig#botSession(AuthenticatorFactory)}
   */
  @Test
  @DisplayName("Test botSession(AuthenticatorFactory); then throw BeanInitializationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.core.auth.AuthSession BdkCoreConfig.botSession(AuthenticatorFactory)"
  })
  void testBotSession_thenThrowBeanInitializationException() throws UnsupportedEncodingException {
    // Arrange
    BdkCoreConfig bdkCoreConfig = new BdkCoreConfig();

    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkBotConfig bdkBotConfig = new BdkBotConfig();
    bdkBotConfig.setCertificate(new BdkCertificateConfig());
    bdkBotConfig.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bdkBotConfig.setCertificatePassword("iloveyou");
    bdkBotConfig.setCertificatePath("Certificate Path");
    bdkBotConfig.setPrivateKey(privateKey);
    bdkBotConfig.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bdkBotConfig.setPrivateKeyPath("Private Key Path");
    bdkBotConfig.setUsername("janedoe");

    BdkConfig bdkConfig = mock(BdkConfig.class);
    when(bdkConfig.getBot()).thenReturn(bdkBotConfig);
    AuthenticatorFactory authenticatorFactory =
        new AuthenticatorFactory(bdkConfig, mock(ApiClientFactory.class));

    // Act and Assert
    assertThrows(
        BeanInitializationException.class, () -> bdkCoreConfig.botSession(authenticatorFactory));
    verify(bdkConfig).getBot();
  }

  /**
   * Test {@link BdkCoreConfig#botSession(AuthenticatorFactory)}.
   *
   * <ul>
   *   <li>Then throw {@link BeanInitializationException}.
   * </ul>
   *
   * <p>Method under test: {@link BdkCoreConfig#botSession(AuthenticatorFactory)}
   */
  @Test
  @DisplayName("Test botSession(AuthenticatorFactory); then throw BeanInitializationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.core.auth.AuthSession BdkCoreConfig.botSession(AuthenticatorFactory)"
  })
  void testBotSession_thenThrowBeanInitializationException2() throws UnsupportedEncodingException {
    // Arrange
    BdkCoreConfig bdkCoreConfig = new BdkCoreConfig();

    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkBotConfig bdkBotConfig = new BdkBotConfig();
    bdkBotConfig.setCertificate(new BdkCertificateConfig());
    bdkBotConfig.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bdkBotConfig.setCertificatePassword("iloveyou");
    bdkBotConfig.setCertificatePath("Certificate Path");
    bdkBotConfig.setPrivateKey(privateKey);
    bdkBotConfig.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bdkBotConfig.setPrivateKeyPath("Private Key Path");
    bdkBotConfig.setUsername("janedoe");

    BdkConfig bdkConfig = mock(BdkConfig.class);
    when(bdkConfig.getBot()).thenReturn(bdkBotConfig);
    AuthenticatorFactory authenticatorFactory =
        new AuthenticatorFactory(bdkConfig, mock(ApiClientFactory.class));

    // Act and Assert
    assertThrows(
        BeanInitializationException.class, () -> bdkCoreConfig.botSession(authenticatorFactory));
    verify(bdkConfig).getBot();
  }

  /**
   * Test {@link BdkCoreConfig#botSession(AuthenticatorFactory)}.
   *
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link BdkCoreConfig#botSession(AuthenticatorFactory)}
   */
  @Test
  @DisplayName("Test botSession(AuthenticatorFactory); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.core.auth.AuthSession BdkCoreConfig.botSession(AuthenticatorFactory)"
  })
  void testBotSession_thenThrowUnsupportedOperationException() {
    // Arrange
    BdkCoreConfig bdkCoreConfig = new BdkCoreConfig();

    BdkConfig bdkConfig = mock(BdkConfig.class);
    when(bdkConfig.getBot()).thenThrow(new UnsupportedOperationException());
    AuthenticatorFactory authenticatorFactory =
        new AuthenticatorFactory(bdkConfig, mock(ApiClientFactory.class));

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class, () -> bdkCoreConfig.botSession(authenticatorFactory));
    verify(bdkConfig).getBot();
  }

  /**
   * Test {@link BdkCoreConfig#botSession(AuthenticatorFactory)}.
   *
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link BdkCoreConfig#botSession(AuthenticatorFactory)}
   */
  @Test
  @DisplayName("Test botSession(AuthenticatorFactory); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.core.auth.AuthSession BdkCoreConfig.botSession(AuthenticatorFactory)"
  })
  void testBotSession_thenThrowUnsupportedOperationException2() {
    // Arrange
    BdkCoreConfig bdkCoreConfig = new BdkCoreConfig();

    BdkConfig bdkConfig = mock(BdkConfig.class);
    when(bdkConfig.getBot()).thenThrow(new UnsupportedOperationException());
    AuthenticatorFactory authenticatorFactory =
        new AuthenticatorFactory(bdkConfig, mock(ApiClientFactory.class));

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class, () -> bdkCoreConfig.botSession(authenticatorFactory));
    verify(bdkConfig).getBot();
  }
}
