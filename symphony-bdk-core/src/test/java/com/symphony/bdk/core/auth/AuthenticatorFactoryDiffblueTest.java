package com.symphony.bdk.core.auth;

import static org.junit.jupiter.api.Assertions.assertThrows;
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
   * <p>
   * Method under test: {@link AuthenticatorFactory#getOboAuthenticator()}
   */
  @Test
  @DisplayName("Test getOboAuthenticator()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.core.auth.OboAuthenticator AuthenticatorFactory.getOboAuthenticator()"})
  void testGetOboAuthenticator() throws AuthInitializationException {
    // Arrange
    BdkConfig bdkConfig = new BdkConfig();

    // Act and Assert
    assertThrows(AuthInitializationException.class,
        () -> (new AuthenticatorFactory(bdkConfig, new ApiClientFactory(new BdkConfig()))).getOboAuthenticator());
  }

  /**
   * Test {@link AuthenticatorFactory#getOboAuthenticator()}.
   * <p>
   * Method under test: {@link AuthenticatorFactory#getOboAuthenticator()}
   */
  @Test
  @DisplayName("Test getOboAuthenticator()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.core.auth.OboAuthenticator AuthenticatorFactory.getOboAuthenticator()"})
  void testGetOboAuthenticator2() throws AuthInitializationException, UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Neither RSA private key nor certificate is configured.");

    BdkExtAppConfig app = new BdkExtAppConfig();
    app.setAppId("42");
    app.setCertificate(new BdkCertificateConfig("", "iloveyou"));
    app.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    app.setCertificatePassword("iloveyou");
    app.setCertificatePath("Neither RSA private key nor certificate is configured.");
    app.setPrivateKey(privateKey);
    app.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    app.setPrivateKeyPath("Neither RSA private key nor certificate is configured.");

    BdkConfig bdkConfig = new BdkConfig();
    bdkConfig.setApp(app);

    // Act and Assert
    assertThrows(AuthInitializationException.class,
        () -> (new AuthenticatorFactory(bdkConfig, new ApiClientFactory(new BdkConfig()))).getOboAuthenticator());
  }

  /**
   * Test {@link AuthenticatorFactory#getOboAuthenticator()}.
   * <ul>
   *   <li>Given {@link BdkRsaKeyConfig} (default constructor) Content is {@code AXAXAXAX} Bytes is {@code UTF-8}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuthenticatorFactory#getOboAuthenticator()}
   */
  @Test
  @DisplayName("Test getOboAuthenticator(); given BdkRsaKeyConfig (default constructor) Content is 'AXAXAXAX' Bytes is 'UTF-8'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.core.auth.OboAuthenticator AuthenticatorFactory.getOboAuthenticator()"})
  void testGetOboAuthenticator_givenBdkRsaKeyConfigContentIsAxaxaxaxBytesIsUtf8()
      throws AuthInitializationException, UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Neither RSA private key nor certificate is configured.");

    BdkExtAppConfig app = new BdkExtAppConfig();
    app.setAppId("42");
    app.setCertificate(new BdkCertificateConfig("Neither RSA private key nor certificate is configured.", "iloveyou"));
    app.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    app.setCertificatePassword("iloveyou");
    app.setCertificatePath("Neither RSA private key nor certificate is configured.");
    app.setPrivateKey(privateKey);
    app.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    app.setPrivateKeyPath("Neither RSA private key nor certificate is configured.");

    BdkConfig bdkConfig = new BdkConfig();
    bdkConfig.setApp(app);

    // Act and Assert
    assertThrows(AuthInitializationException.class,
        () -> (new AuthenticatorFactory(bdkConfig, new ApiClientFactory(new BdkConfig()))).getOboAuthenticator());
  }

  /**
   * Test {@link AuthenticatorFactory#getOboAuthenticator()}.
   * <ul>
   *   <li>Given {@link BdkRsaKeyConfig} (default constructor) Content is empty array of {@code byte}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuthenticatorFactory#getOboAuthenticator()}
   */
  @Test
  @DisplayName("Test getOboAuthenticator(); given BdkRsaKeyConfig (default constructor) Content is empty array of byte")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.core.auth.OboAuthenticator AuthenticatorFactory.getOboAuthenticator()"})
  void testGetOboAuthenticator_givenBdkRsaKeyConfigContentIsEmptyArrayOfByte()
      throws AuthInitializationException, UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent(new byte[]{});
    privateKey.setPath("Neither RSA private key nor certificate is configured.");

    BdkExtAppConfig app = new BdkExtAppConfig();
    app.setAppId("42");
    app.setCertificate(new BdkCertificateConfig("Neither RSA private key nor certificate is configured.", "iloveyou"));
    app.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    app.setCertificatePassword("iloveyou");
    app.setCertificatePath("Neither RSA private key nor certificate is configured.");
    app.setPrivateKey(privateKey);
    app.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    app.setPrivateKeyPath("Neither RSA private key nor certificate is configured.");

    BdkConfig bdkConfig = new BdkConfig();
    bdkConfig.setApp(app);

    // Act and Assert
    assertThrows(AuthInitializationException.class,
        () -> (new AuthenticatorFactory(bdkConfig, new ApiClientFactory(new BdkConfig()))).getOboAuthenticator());
  }

  /**
   * Test {@link AuthenticatorFactory#getExtensionAppAuthenticator()}.
   * <p>
   * Method under test: {@link AuthenticatorFactory#getExtensionAppAuthenticator()}
   */
  @Test
  @DisplayName("Test getExtensionAppAuthenticator()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.core.auth.ExtensionAppAuthenticator AuthenticatorFactory.getExtensionAppAuthenticator()"})
  void testGetExtensionAppAuthenticator() throws AuthInitializationException {
    // Arrange
    BdkConfig bdkConfig = new BdkConfig();

    // Act and Assert
    assertThrows(AuthInitializationException.class,
        () -> (new AuthenticatorFactory(bdkConfig, new ApiClientFactory(new BdkConfig())))
            .getExtensionAppAuthenticator());
  }

  /**
   * Test {@link AuthenticatorFactory#getExtensionAppAuthenticator()}.
   * <p>
   * Method under test: {@link AuthenticatorFactory#getExtensionAppAuthenticator()}
   */
  @Test
  @DisplayName("Test getExtensionAppAuthenticator()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.core.auth.ExtensionAppAuthenticator AuthenticatorFactory.getExtensionAppAuthenticator()"})
  void testGetExtensionAppAuthenticator2() throws AuthInitializationException, UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Neither RSA private key nor certificate is configured.");

    BdkExtAppConfig app = new BdkExtAppConfig();
    app.setAppId("42");
    app.setCertificate(new BdkCertificateConfig("Neither RSA private key nor certificate is configured.", "iloveyou"));
    app.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    app.setCertificatePassword("iloveyou");
    app.setCertificatePath("Neither RSA private key nor certificate is configured.");
    app.setPrivateKey(privateKey);
    app.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    app.setPrivateKeyPath("Neither RSA private key nor certificate is configured.");

    BdkConfig bdkConfig = new BdkConfig();
    bdkConfig.setApp(app);

    // Act and Assert
    assertThrows(AuthInitializationException.class,
        () -> (new AuthenticatorFactory(bdkConfig, new ApiClientFactory(new BdkConfig())))
            .getExtensionAppAuthenticator());
  }

  /**
   * Test {@link AuthenticatorFactory#getExtensionAppAuthenticator()}.
   * <p>
   * Method under test: {@link AuthenticatorFactory#getExtensionAppAuthenticator()}
   */
  @Test
  @DisplayName("Test getExtensionAppAuthenticator()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.core.auth.ExtensionAppAuthenticator AuthenticatorFactory.getExtensionAppAuthenticator()"})
  void testGetExtensionAppAuthenticator3() throws AuthInitializationException, UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent("AXAXAXAX".getBytes("UTF-8"));
    privateKey.setPath("Neither RSA private key nor certificate is configured.");

    BdkExtAppConfig app = new BdkExtAppConfig();
    app.setAppId("42");
    app.setCertificate(new BdkCertificateConfig("", "iloveyou"));
    app.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    app.setCertificatePassword("iloveyou");
    app.setCertificatePath("Neither RSA private key nor certificate is configured.");
    app.setPrivateKey(privateKey);
    app.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    app.setPrivateKeyPath("Neither RSA private key nor certificate is configured.");

    BdkConfig bdkConfig = new BdkConfig();
    bdkConfig.setApp(app);

    // Act and Assert
    assertThrows(AuthInitializationException.class,
        () -> (new AuthenticatorFactory(bdkConfig, new ApiClientFactory(new BdkConfig())))
            .getExtensionAppAuthenticator());
  }

  /**
   * Test {@link AuthenticatorFactory#getExtensionAppAuthenticator()}.
   * <ul>
   *   <li>Given {@link BdkRsaKeyConfig} (default constructor) Content is empty array of {@code byte}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuthenticatorFactory#getExtensionAppAuthenticator()}
   */
  @Test
  @DisplayName("Test getExtensionAppAuthenticator(); given BdkRsaKeyConfig (default constructor) Content is empty array of byte")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.core.auth.ExtensionAppAuthenticator AuthenticatorFactory.getExtensionAppAuthenticator()"})
  void testGetExtensionAppAuthenticator_givenBdkRsaKeyConfigContentIsEmptyArrayOfByte()
      throws AuthInitializationException, UnsupportedEncodingException {
    // Arrange
    BdkRsaKeyConfig privateKey = new BdkRsaKeyConfig();
    privateKey.setContent(new byte[]{});
    privateKey.setPath("Neither RSA private key nor certificate is configured.");

    BdkExtAppConfig app = new BdkExtAppConfig();
    app.setAppId("42");
    app.setCertificate(new BdkCertificateConfig("Neither RSA private key nor certificate is configured.", "iloveyou"));
    app.setCertificateContent("AXAXAXAX".getBytes("UTF-8"));
    app.setCertificatePassword("iloveyou");
    app.setCertificatePath("Neither RSA private key nor certificate is configured.");
    app.setPrivateKey(privateKey);
    app.setPrivateKeyContent("AXAXAXAX".getBytes("UTF-8"));
    app.setPrivateKeyPath("Neither RSA private key nor certificate is configured.");

    BdkConfig bdkConfig = new BdkConfig();
    bdkConfig.setApp(app);

    // Act and Assert
    assertThrows(AuthInitializationException.class,
        () -> (new AuthenticatorFactory(bdkConfig, new ApiClientFactory(new BdkConfig())))
            .getExtensionAppAuthenticator());
  }
}
