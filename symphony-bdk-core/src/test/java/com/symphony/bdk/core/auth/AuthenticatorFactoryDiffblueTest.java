package com.symphony.bdk.core.auth;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.exception.AuthInitializationException;
import com.symphony.bdk.core.client.ApiClientFactory;
import com.symphony.bdk.core.config.model.BdkCertificateConfig;
import com.symphony.bdk.core.config.model.BdkConfig;
import com.symphony.bdk.core.config.model.BdkExtAppConfig;
import com.symphony.bdk.core.config.model.BdkRsaKeyConfig;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AuthenticatorFactoryDiffblueTest {
  /**
   * Test {@link AuthenticatorFactory#getOboAuthenticator()}.
   *
   * <p>Method under test: {@link AuthenticatorFactory#getOboAuthenticator()}
   */
  @Test
  @DisplayName("Test getOboAuthenticator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.core.auth.OboAuthenticator AuthenticatorFactory.getOboAuthenticator()"
  })
  void testGetOboAuthenticator() throws AuthInitializationException, UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkExtAppConfig bdkExtAppConfig = new BdkExtAppConfig();
    bdkExtAppConfig.setAppId("42");
    bdkExtAppConfig.setCertificate(new BdkCertificateConfig("", "iloveyou"));
    bdkExtAppConfig.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bdkExtAppConfig.setCertificatePassword("iloveyou");
    bdkExtAppConfig.setCertificatePath("Certificate Path");
    bdkExtAppConfig.setPrivateKey(privateKey);
    bdkExtAppConfig.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bdkExtAppConfig.setPrivateKeyPath("Private Key Path");
    BdkConfig bdkConfig = mock(BdkConfig.class);
    when(bdkConfig.getApp()).thenReturn(bdkExtAppConfig);

    // Act and Assert
    assertThrows(
        AuthInitializationException.class,
        () ->
            new AuthenticatorFactory(bdkConfig, mock(ApiClientFactory.class))
                .getOboAuthenticator());
    verify(bdkConfig).getApp();
  }

  /**
   * Test {@link AuthenticatorFactory#getOboAuthenticator()}.
   *
   * <ul>
   *   <li>Given {@link BdkRsaKeyConfig} (default constructor) Content is {@code AXAXAXAX} Bytes is
   *       {@code UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticatorFactory#getOboAuthenticator()}
   */
  @Test
  @DisplayName(
      "Test getOboAuthenticator(); given BdkRsaKeyConfig (default constructor) Content is 'AXAXAXAX' Bytes is 'UTF-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.core.auth.OboAuthenticator AuthenticatorFactory.getOboAuthenticator()"
  })
  void testGetOboAuthenticator_givenBdkRsaKeyConfigContentIsAxaxaxaxBytesIsUtf8()
      throws AuthInitializationException, UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkExtAppConfig bdkExtAppConfig = new BdkExtAppConfig();
    bdkExtAppConfig.setAppId("42");
    bdkExtAppConfig.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    bdkExtAppConfig.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bdkExtAppConfig.setCertificatePassword("iloveyou");
    bdkExtAppConfig.setCertificatePath("Certificate Path");
    bdkExtAppConfig.setPrivateKey(privateKey);
    bdkExtAppConfig.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bdkExtAppConfig.setPrivateKeyPath("Private Key Path");
    BdkConfig bdkConfig = mock(BdkConfig.class);
    when(bdkConfig.getApp()).thenReturn(bdkExtAppConfig);

    // Act and Assert
    assertThrows(
        AuthInitializationException.class,
        () ->
            new AuthenticatorFactory(bdkConfig, mock(ApiClientFactory.class))
                .getOboAuthenticator());
    verify(bdkConfig).getApp();
  }

  /**
   * Test {@link AuthenticatorFactory#getOboAuthenticator()}.
   *
   * <ul>
   *   <li>Given {@link BdkRsaKeyConfig} (default constructor) Content is empty array of {@code
   *       byte}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticatorFactory#getOboAuthenticator()}
   */
  @Test
  @DisplayName(
      "Test getOboAuthenticator(); given BdkRsaKeyConfig (default constructor) Content is empty array of byte")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.core.auth.OboAuthenticator AuthenticatorFactory.getOboAuthenticator()"
  })
  void testGetOboAuthenticator_givenBdkRsaKeyConfigContentIsEmptyArrayOfByte()
      throws AuthInitializationException, UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent(new byte[] {});
    privateKey.setPath("Path");

    BdkExtAppConfig bdkExtAppConfig = new BdkExtAppConfig();
    bdkExtAppConfig.setAppId("42");
    bdkExtAppConfig.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    bdkExtAppConfig.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bdkExtAppConfig.setCertificatePassword("iloveyou");
    bdkExtAppConfig.setCertificatePath("Certificate Path");
    bdkExtAppConfig.setPrivateKey(privateKey);
    bdkExtAppConfig.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bdkExtAppConfig.setPrivateKeyPath("Private Key Path");
    BdkConfig bdkConfig = mock(BdkConfig.class);
    when(bdkConfig.getApp()).thenReturn(bdkExtAppConfig);

    // Act and Assert
    assertThrows(
        AuthInitializationException.class,
        () ->
            new AuthenticatorFactory(bdkConfig, mock(ApiClientFactory.class))
                .getOboAuthenticator());
    verify(bdkConfig).getApp();
  }

  /**
   * Test {@link AuthenticatorFactory#getExtensionAppAuthenticator()}.
   *
   * <p>Method under test: {@link AuthenticatorFactory#getExtensionAppAuthenticator()}
   */
  @Test
  @DisplayName("Test getExtensionAppAuthenticator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.core.auth.ExtensionAppAuthenticator AuthenticatorFactory.getExtensionAppAuthenticator()"
  })
  void testGetExtensionAppAuthenticator()
      throws AuthInitializationException, UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkExtAppConfig bdkExtAppConfig = new BdkExtAppConfig();
    bdkExtAppConfig.setAppId("42");
    bdkExtAppConfig.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    bdkExtAppConfig.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bdkExtAppConfig.setCertificatePassword("iloveyou");
    bdkExtAppConfig.setCertificatePath("Certificate Path");
    bdkExtAppConfig.setPrivateKey(privateKey);
    bdkExtAppConfig.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bdkExtAppConfig.setPrivateKeyPath("Private Key Path");
    BdkConfig bdkConfig = mock(BdkConfig.class);
    when(bdkConfig.getApp()).thenReturn(bdkExtAppConfig);

    // Act and Assert
    assertThrows(
        AuthInitializationException.class,
        () ->
            new AuthenticatorFactory(bdkConfig, mock(ApiClientFactory.class))
                .getExtensionAppAuthenticator());
    verify(bdkConfig).getApp();
  }

  /**
   * Test {@link AuthenticatorFactory#getExtensionAppAuthenticator()}.
   *
   * <p>Method under test: {@link AuthenticatorFactory#getExtensionAppAuthenticator()}
   */
  @Test
  @DisplayName("Test getExtensionAppAuthenticator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.core.auth.ExtensionAppAuthenticator AuthenticatorFactory.getExtensionAppAuthenticator()"
  })
  void testGetExtensionAppAuthenticator2()
      throws AuthInitializationException, UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Path");

    BdkExtAppConfig bdkExtAppConfig = new BdkExtAppConfig();
    bdkExtAppConfig.setAppId("42");
    bdkExtAppConfig.setCertificate(new BdkCertificateConfig("", "iloveyou"));
    bdkExtAppConfig.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bdkExtAppConfig.setCertificatePassword("iloveyou");
    bdkExtAppConfig.setCertificatePath("Certificate Path");
    bdkExtAppConfig.setPrivateKey(privateKey);
    bdkExtAppConfig.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bdkExtAppConfig.setPrivateKeyPath("Private Key Path");
    BdkConfig bdkConfig = mock(BdkConfig.class);
    when(bdkConfig.getApp()).thenReturn(bdkExtAppConfig);

    // Act and Assert
    assertThrows(
        AuthInitializationException.class,
        () ->
            new AuthenticatorFactory(bdkConfig, mock(ApiClientFactory.class))
                .getExtensionAppAuthenticator());
    verify(bdkConfig).getApp();
  }

  /**
   * Test {@link AuthenticatorFactory#getExtensionAppAuthenticator()}.
   *
   * <ul>
   *   <li>Given {@link BdkRsaKeyConfig} (default constructor) Content is empty array of {@code
   *       byte}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticatorFactory#getExtensionAppAuthenticator()}
   */
  @Test
  @DisplayName(
      "Test getExtensionAppAuthenticator(); given BdkRsaKeyConfig (default constructor) Content is empty array of byte")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.symphony.bdk.core.auth.ExtensionAppAuthenticator AuthenticatorFactory.getExtensionAppAuthenticator()"
  })
  void testGetExtensionAppAuthenticator_givenBdkRsaKeyConfigContentIsEmptyArrayOfByte()
      throws AuthInitializationException, UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent(new byte[] {});
    privateKey.setPath("Path");

    BdkExtAppConfig bdkExtAppConfig = new BdkExtAppConfig();
    bdkExtAppConfig.setAppId("42");
    bdkExtAppConfig.setCertificate(new BdkCertificateConfig("Path", "iloveyou"));
    bdkExtAppConfig.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    bdkExtAppConfig.setCertificatePassword("iloveyou");
    bdkExtAppConfig.setCertificatePath("Certificate Path");
    bdkExtAppConfig.setPrivateKey(privateKey);
    bdkExtAppConfig.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    bdkExtAppConfig.setPrivateKeyPath("Private Key Path");
    BdkConfig bdkConfig = mock(BdkConfig.class);
    when(bdkConfig.getApp()).thenReturn(bdkExtAppConfig);

    // Act and Assert
    assertThrows(
        AuthInitializationException.class,
        () ->
            new AuthenticatorFactory(bdkConfig, mock(ApiClientFactory.class))
                .getExtensionAppAuthenticator());
    verify(bdkConfig).getApp();
  }
}
