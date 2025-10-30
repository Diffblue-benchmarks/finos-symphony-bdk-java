package com.symphony.bdk.core.auth.jwt;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.symphony.bdk.core.auth.exception.AuthInitializationException;
import com.symphony.bdk.core.auth.exception.AuthUnauthorizedException;
import java.security.GeneralSecurityException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class JwtHelperDiffblueTest {
  /**
   * Test {@link JwtHelper#parseRsaPrivateKey(String)}.
   * <p>
   * Method under test: {@link JwtHelper#parseRsaPrivateKey(String)}
   */
  @Test
  @DisplayName("Test parseRsaPrivateKey(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.PrivateKey JwtHelper.parseRsaPrivateKey(String)"})
  void testParseRsaPrivateKey() throws GeneralSecurityException {
    // Arrange, Act and Assert
    assertThrows(GeneralSecurityException.class,
        () -> JwtHelper.parseRsaPrivateKey("-----BEGIN PRIVATE KEY-----Pem Private KeycanUseSimplifiedKeyDelivery"));
  }

  /**
   * Test {@link JwtHelper#parseRsaPrivateKey(String)}.
   * <p>
   * Method under test: {@link JwtHelper#parseRsaPrivateKey(String)}
   */
  @Test
  @DisplayName("Test parseRsaPrivateKey(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.PrivateKey JwtHelper.parseRsaPrivateKey(String)"})
  void testParseRsaPrivateKey2() throws GeneralSecurityException {
    // Arrange, Act and Assert
    assertThrows(GeneralSecurityException.class,
        () -> JwtHelper.parseRsaPrivateKey("-----BEGIN PRIVATE KEY-----canUseSimplifiedKeyDeliveryPem Private Key"));
  }

  /**
   * Test {@link JwtHelper#parseRsaPrivateKey(String)}.
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----42Pem Private Key}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseRsaPrivateKey(String)}
   */
  @Test
  @DisplayName("Test parseRsaPrivateKey(String); when '-----BEGIN PRIVATE KEY-----42Pem Private Key'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.PrivateKey JwtHelper.parseRsaPrivateKey(String)"})
  void testParseRsaPrivateKey_whenBeginPrivateKey42PemPrivateKey() throws GeneralSecurityException {
    // Arrange, Act and Assert
    assertThrows(GeneralSecurityException.class,
        () -> JwtHelper.parseRsaPrivateKey("-----BEGIN PRIVATE KEY-----42Pem Private Key"));
  }

  /**
   * Test {@link JwtHelper#parseRsaPrivateKey(String)}.
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----expPem Private Key}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseRsaPrivateKey(String)}
   */
  @Test
  @DisplayName("Test parseRsaPrivateKey(String); when '-----BEGIN PRIVATE KEY-----expPem Private Key'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.PrivateKey JwtHelper.parseRsaPrivateKey(String)"})
  void testParseRsaPrivateKey_whenBeginPrivateKeyExpPemPrivateKey() throws GeneralSecurityException {
    // Arrange, Act and Assert
    assertThrows(GeneralSecurityException.class,
        () -> JwtHelper.parseRsaPrivateKey("-----BEGIN PRIVATE KEY-----expPem Private Key"));
  }

  /**
   * Test {@link JwtHelper#parseRsaPrivateKey(String)}.
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----Pem Private Key42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseRsaPrivateKey(String)}
   */
  @Test
  @DisplayName("Test parseRsaPrivateKey(String); when '-----BEGIN PRIVATE KEY-----Pem Private Key42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.PrivateKey JwtHelper.parseRsaPrivateKey(String)"})
  void testParseRsaPrivateKey_whenBeginPrivateKeyPemPrivateKey42() throws GeneralSecurityException {
    // Arrange, Act and Assert
    assertThrows(GeneralSecurityException.class,
        () -> JwtHelper.parseRsaPrivateKey("-----BEGIN PRIVATE KEY-----Pem Private Key42"));
  }

  /**
   * Test {@link JwtHelper#parseRsaPrivateKey(String)}.
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----Pem Private KeyPem Private Key}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseRsaPrivateKey(String)}
   */
  @Test
  @DisplayName("Test parseRsaPrivateKey(String); when '-----BEGIN PRIVATE KEY-----Pem Private KeyPem Private Key'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.PrivateKey JwtHelper.parseRsaPrivateKey(String)"})
  void testParseRsaPrivateKey_whenBeginPrivateKeyPemPrivateKeyPemPrivateKey() throws GeneralSecurityException {
    // Arrange, Act and Assert
    assertThrows(GeneralSecurityException.class,
        () -> JwtHelper.parseRsaPrivateKey("-----BEGIN PRIVATE KEY-----Pem Private KeyPem Private Key"));
  }

  /**
   * Test {@link JwtHelper#parseRsaPrivateKey(String)}.
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----Pem Private KeyRSA}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseRsaPrivateKey(String)}
   */
  @Test
  @DisplayName("Test parseRsaPrivateKey(String); when '-----BEGIN PRIVATE KEY-----Pem Private KeyRSA'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.PrivateKey JwtHelper.parseRsaPrivateKey(String)"})
  void testParseRsaPrivateKey_whenBeginPrivateKeyPemPrivateKeyRSA() throws GeneralSecurityException {
    // Arrange, Act and Assert
    assertThrows(GeneralSecurityException.class,
        () -> JwtHelper.parseRsaPrivateKey("-----BEGIN PRIVATE KEY-----Pem Private KeyRSA"));
  }

  /**
   * Test {@link JwtHelper#parseRsaPrivateKey(String)}.
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----Pem Private Keyexp}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseRsaPrivateKey(String)}
   */
  @Test
  @DisplayName("Test parseRsaPrivateKey(String); when '-----BEGIN PRIVATE KEY-----Pem Private Keyexp'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.PrivateKey JwtHelper.parseRsaPrivateKey(String)"})
  void testParseRsaPrivateKey_whenBeginPrivateKeyPemPrivateKeyexp() throws GeneralSecurityException {
    // Arrange, Act and Assert
    assertThrows(GeneralSecurityException.class,
        () -> JwtHelper.parseRsaPrivateKey("-----BEGIN PRIVATE KEY-----Pem Private Keyexp"));
  }

  /**
   * Test {@link JwtHelper#parseRsaPrivateKey(String)}.
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----RSAPem Private Key}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseRsaPrivateKey(String)}
   */
  @Test
  @DisplayName("Test parseRsaPrivateKey(String); when '-----BEGIN PRIVATE KEY-----RSAPem Private Key'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.PrivateKey JwtHelper.parseRsaPrivateKey(String)"})
  void testParseRsaPrivateKey_whenBeginPrivateKeyRSAPemPrivateKey() throws GeneralSecurityException {
    // Arrange, Act and Assert
    assertThrows(GeneralSecurityException.class,
        () -> JwtHelper.parseRsaPrivateKey("-----BEGIN PRIVATE KEY-----RSAPem Private Key"));
  }

  /**
   * Test {@link JwtHelper#parseRsaPrivateKey(String)}.
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----RSA}.</li>
   *   <li>Then throw {@link GeneralSecurityException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseRsaPrivateKey(String)}
   */
  @Test
  @DisplayName("Test parseRsaPrivateKey(String); when '-----BEGIN PRIVATE KEY-----RSA'; then throw GeneralSecurityException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.PrivateKey JwtHelper.parseRsaPrivateKey(String)"})
  void testParseRsaPrivateKey_whenBeginPrivateKeyRsa_thenThrowGeneralSecurityException()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    assertThrows(GeneralSecurityException.class, () -> JwtHelper.parseRsaPrivateKey("-----BEGIN PRIVATE KEY-----RSA"));
  }

  /**
   * Test {@link JwtHelper#parseRsaPrivateKey(String)}.
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----}.</li>
   *   <li>Then throw {@link GeneralSecurityException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseRsaPrivateKey(String)}
   */
  @Test
  @DisplayName("Test parseRsaPrivateKey(String); when '-----BEGIN PRIVATE KEY-----'; then throw GeneralSecurityException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.PrivateKey JwtHelper.parseRsaPrivateKey(String)"})
  void testParseRsaPrivateKey_whenBeginPrivateKey_thenThrowGeneralSecurityException() throws GeneralSecurityException {
    // Arrange, Act and Assert
    assertThrows(GeneralSecurityException.class, () -> JwtHelper.parseRsaPrivateKey("-----BEGIN PRIVATE KEY-----"));
  }

  /**
   * Test {@link JwtHelper#parseRsaPrivateKey(String)}.
   * <ul>
   *   <li>When {@code -----BEGIN RSA PRIVATE KEY-----}.</li>
   *   <li>Then throw {@link GeneralSecurityException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseRsaPrivateKey(String)}
   */
  @Test
  @DisplayName("Test parseRsaPrivateKey(String); when '-----BEGIN RSA PRIVATE KEY-----'; then throw GeneralSecurityException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.PrivateKey JwtHelper.parseRsaPrivateKey(String)"})
  void testParseRsaPrivateKey_whenBeginRsaPrivateKey_thenThrowGeneralSecurityException()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    assertThrows(GeneralSecurityException.class, () -> JwtHelper.parseRsaPrivateKey("-----BEGIN RSA PRIVATE KEY-----"));
  }

  /**
   * Test {@link JwtHelper#parseRsaPrivateKey(String)}.
   * <ul>
   *   <li>When {@code Pem Private Key}.</li>
   *   <li>Then throw {@link GeneralSecurityException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseRsaPrivateKey(String)}
   */
  @Test
  @DisplayName("Test parseRsaPrivateKey(String); when 'Pem Private Key'; then throw GeneralSecurityException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.PrivateKey JwtHelper.parseRsaPrivateKey(String)"})
  void testParseRsaPrivateKey_whenPemPrivateKey_thenThrowGeneralSecurityException() throws GeneralSecurityException {
    // Arrange, Act and Assert
    assertThrows(GeneralSecurityException.class, () -> JwtHelper.parseRsaPrivateKey("Pem Private Key"));
  }

  /**
   * Test {@link JwtHelper#validateJwt(String, String)}.
   * <ul>
   *   <li>When {@code Certificate}.</li>
   *   <li>Then throw {@link AuthInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#validateJwt(String, String)}
   */
  @Test
  @DisplayName("Test validateJwt(String, String); when 'Certificate'; then throw AuthInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.core.auth.jwt.UserClaim JwtHelper.validateJwt(String, String)"})
  void testValidateJwt_whenCertificate_thenThrowAuthInitializationException() throws AuthInitializationException {
    // Arrange, Act and Assert
    assertThrows(AuthInitializationException.class, () -> JwtHelper.validateJwt("Jwt", "Certificate"));
  }

  /**
   * Test {@link JwtHelper#validateJwt(String, String)}.
   * <ul>
   *   <li>When space.</li>
   *   <li>Then throw {@link AuthInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#validateJwt(String, String)}
   */
  @Test
  @DisplayName("Test validateJwt(String, String); when space; then throw AuthInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"com.symphony.bdk.core.auth.jwt.UserClaim JwtHelper.validateJwt(String, String)"})
  void testValidateJwt_whenSpace_thenThrowAuthInitializationException() throws AuthInitializationException {
    // Arrange, Act and Assert
    assertThrows(AuthInitializationException.class, () -> JwtHelper.validateJwt("Jwt", " "));
  }

  /**
   * Test {@link JwtHelper#isSkdEnabled(String)}.
   * <ul>
   *   <li>When {@code com.fasterxml.jackson.databind.node.ObjectNode}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#isSkdEnabled(String)}
   */
  @Test
  @DisplayName("Test isSkdEnabled(String); when 'com.fasterxml.jackson.databind.node.ObjectNode'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean JwtHelper.isSkdEnabled(String)"})
  void testIsSkdEnabled_whenComFasterxmlJacksonDatabindNodeObjectNode() {
    // Arrange, Act and Assert
    assertFalse(JwtHelper.isSkdEnabled("com.fasterxml.jackson.databind.node.ObjectNode"));
  }

  /**
   * Test {@link JwtHelper#isSkdEnabled(String)}.
   * <ul>
   *   <li>When {@code \.com.fasterxml.jackson.databind.node.ObjectNode}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#isSkdEnabled(String)}
   */
  @Test
  @DisplayName("Test isSkdEnabled(String); when '\\.com.fasterxml.jackson.databind.node.ObjectNode'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean JwtHelper.isSkdEnabled(String)"})
  void testIsSkdEnabled_whenComFasterxmlJacksonDatabindNodeObjectNode2() {
    // Arrange, Act and Assert
    assertFalse(JwtHelper.isSkdEnabled("\\.com.fasterxml.jackson.databind.node.ObjectNode"));
  }

  /**
   * Test {@link JwtHelper#isSkdEnabled(String)}.
   * <ul>
   *   <li>When {@code com.symphony.bdk.core.auth.jwt.UserClaim}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#isSkdEnabled(String)}
   */
  @Test
  @DisplayName("Test isSkdEnabled(String); when 'com.symphony.bdk.core.auth.jwt.UserClaim'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean JwtHelper.isSkdEnabled(String)"})
  void testIsSkdEnabled_whenComSymphonyBdkCoreAuthJwtUserClaim() {
    // Arrange, Act and Assert
    assertFalse(JwtHelper.isSkdEnabled("com.symphony.bdk.core.auth.jwt.UserClaim"));
  }

  /**
   * Test {@link JwtHelper#isSkdEnabled(String)}.
   * <ul>
   *   <li>When {@code Jwt}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#isSkdEnabled(String)}
   */
  @Test
  @DisplayName("Test isSkdEnabled(String); when 'Jwt'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean JwtHelper.isSkdEnabled(String)"})
  void testIsSkdEnabled_whenJwt() {
    // Arrange, Act and Assert
    assertFalse(JwtHelper.isSkdEnabled("Jwt"));
  }

  /**
   * Test {@link JwtHelper#extractExpirationDate(String)}.
   * <ul>
   *   <li>When {@code Jwt}.</li>
   *   <li>Then throw {@link AuthUnauthorizedException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#extractExpirationDate(String)}
   */
  @Test
  @DisplayName("Test extractExpirationDate(String); when 'Jwt'; then throw AuthUnauthorizedException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.Long JwtHelper.extractExpirationDate(String)"})
  void testExtractExpirationDate_whenJwt_thenThrowAuthUnauthorizedException()
      throws JsonProcessingException, AuthUnauthorizedException {
    // Arrange, Act and Assert
    assertThrows(AuthUnauthorizedException.class, () -> JwtHelper.extractExpirationDate("Jwt"));
  }

  /**
   * Test {@link JwtHelper#parseX509Certificate(String)}.
   * <ul>
   *   <li>When {@code 42}.</li>
   *   <li>Then throw {@link AuthInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseX509Certificate(String)}
   */
  @Test
  @DisplayName("Test parseX509Certificate(String); when '42'; then throw AuthInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.cert.Certificate JwtHelper.parseX509Certificate(String)"})
  void testParseX509Certificate_when42_thenThrowAuthInitializationException() throws AuthInitializationException {
    // Arrange, Act and Assert
    assertThrows(AuthInitializationException.class, () -> JwtHelper.parseX509Certificate(" 42"));
  }

  /**
   * Test {@link JwtHelper#parseX509Certificate(String)}.
   * <ul>
   *   <li>When {@code 42}.</li>
   *   <li>Then throw {@link AuthInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseX509Certificate(String)}
   */
  @Test
  @DisplayName("Test parseX509Certificate(String); when '42'; then throw AuthInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.cert.Certificate JwtHelper.parseX509Certificate(String)"})
  void testParseX509Certificate_when42_thenThrowAuthInitializationException2() throws AuthInitializationException {
    // Arrange, Act and Assert
    assertThrows(AuthInitializationException.class, () -> JwtHelper.parseX509Certificate("42 "));
  }

  /**
   * Test {@link JwtHelper#parseX509Certificate(String)}.
   * <ul>
   *   <li>When {@code 42}.</li>
   *   <li>Then throw {@link AuthInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseX509Certificate(String)}
   */
  @Test
  @DisplayName("Test parseX509Certificate(String); when '42'; then throw AuthInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.cert.Certificate JwtHelper.parseX509Certificate(String)"})
  void testParseX509Certificate_when42_thenThrowAuthInitializationException3() throws AuthInitializationException {
    // Arrange, Act and Assert
    assertThrows(AuthInitializationException.class, () -> JwtHelper.parseX509Certificate("  42"));
  }

  /**
   * Test {@link JwtHelper#parseX509Certificate(String)}.
   * <ul>
   *   <li>When {@code canUseSimplifiedKeyDelivery}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseX509Certificate(String)}
   */
  @Test
  @DisplayName("Test parseX509Certificate(String); when 'canUseSimplifiedKeyDelivery'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.cert.Certificate JwtHelper.parseX509Certificate(String)"})
  void testParseX509Certificate_whenCanUseSimplifiedKeyDelivery() throws AuthInitializationException {
    // Arrange, Act and Assert
    assertThrows(AuthInitializationException.class,
        () -> JwtHelper.parseX509Certificate(" canUseSimplifiedKeyDelivery"));
  }

  /**
   * Test {@link JwtHelper#parseX509Certificate(String)}.
   * <ul>
   *   <li>When {@code canUseSimplifiedKeyDelivery}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseX509Certificate(String)}
   */
  @Test
  @DisplayName("Test parseX509Certificate(String); when 'canUseSimplifiedKeyDelivery'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.cert.Certificate JwtHelper.parseX509Certificate(String)"})
  void testParseX509Certificate_whenCanUseSimplifiedKeyDelivery2() throws AuthInitializationException {
    // Arrange, Act and Assert
    assertThrows(AuthInitializationException.class,
        () -> JwtHelper.parseX509Certificate("canUseSimplifiedKeyDelivery "));
  }

  /**
   * Test {@link JwtHelper#parseX509Certificate(String)}.
   * <ul>
   *   <li>When {@code canUseSimplifiedKeyDelivery}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseX509Certificate(String)}
   */
  @Test
  @DisplayName("Test parseX509Certificate(String); when 'canUseSimplifiedKeyDelivery'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.cert.Certificate JwtHelper.parseX509Certificate(String)"})
  void testParseX509Certificate_whenCanUseSimplifiedKeyDelivery3() throws AuthInitializationException {
    // Arrange, Act and Assert
    assertThrows(AuthInitializationException.class,
        () -> JwtHelper.parseX509Certificate("  canUseSimplifiedKeyDelivery"));
  }

  /**
   * Test {@link JwtHelper#parseX509Certificate(String)}.
   * <ul>
   *   <li>When {@code CertificateCertificate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseX509Certificate(String)}
   */
  @Test
  @DisplayName("Test parseX509Certificate(String); when 'CertificateCertificate'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.cert.Certificate JwtHelper.parseX509Certificate(String)"})
  void testParseX509Certificate_whenCertificateCertificate() throws AuthInitializationException {
    // Arrange, Act and Assert
    assertThrows(AuthInitializationException.class, () -> JwtHelper.parseX509Certificate(" CertificateCertificate"));
  }

  /**
   * Test {@link JwtHelper#parseX509Certificate(String)}.
   * <ul>
   *   <li>When {@code CertificateRSA}.</li>
   *   <li>Then throw {@link AuthInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseX509Certificate(String)}
   */
  @Test
  @DisplayName("Test parseX509Certificate(String); when 'CertificateRSA'; then throw AuthInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.cert.Certificate JwtHelper.parseX509Certificate(String)"})
  void testParseX509Certificate_whenCertificateRSA_thenThrowAuthInitializationException()
      throws AuthInitializationException {
    // Arrange, Act and Assert
    assertThrows(AuthInitializationException.class, () -> JwtHelper.parseX509Certificate(" CertificateRSA"));
  }

  /**
   * Test {@link JwtHelper#parseX509Certificate(String)}.
   * <ul>
   *   <li>When {@code Certificate}.</li>
   *   <li>Then throw {@link AuthInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseX509Certificate(String)}
   */
  @Test
  @DisplayName("Test parseX509Certificate(String); when 'Certificate'; then throw AuthInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.cert.Certificate JwtHelper.parseX509Certificate(String)"})
  void testParseX509Certificate_whenCertificate_thenThrowAuthInitializationException()
      throws AuthInitializationException {
    // Arrange, Act and Assert
    assertThrows(AuthInitializationException.class, () -> JwtHelper.parseX509Certificate("Certificate"));
  }

  /**
   * Test {@link JwtHelper#parseX509Certificate(String)}.
   * <ul>
   *   <li>When {@code Certificate}.</li>
   *   <li>Then throw {@link AuthInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseX509Certificate(String)}
   */
  @Test
  @DisplayName("Test parseX509Certificate(String); when 'Certificate'; then throw AuthInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.cert.Certificate JwtHelper.parseX509Certificate(String)"})
  void testParseX509Certificate_whenCertificate_thenThrowAuthInitializationException2()
      throws AuthInitializationException {
    // Arrange, Act and Assert
    assertThrows(AuthInitializationException.class, () -> JwtHelper.parseX509Certificate(" Certificate"));
  }

  /**
   * Test {@link JwtHelper#parseX509Certificate(String)}.
   * <ul>
   *   <li>When {@code Certificate}.</li>
   *   <li>Then throw {@link AuthInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseX509Certificate(String)}
   */
  @Test
  @DisplayName("Test parseX509Certificate(String); when 'Certificate'; then throw AuthInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.cert.Certificate JwtHelper.parseX509Certificate(String)"})
  void testParseX509Certificate_whenCertificate_thenThrowAuthInitializationException3()
      throws AuthInitializationException {
    // Arrange, Act and Assert
    assertThrows(AuthInitializationException.class, () -> JwtHelper.parseX509Certificate("Certificate "));
  }

  /**
   * Test {@link JwtHelper#parseX509Certificate(String)}.
   * <ul>
   *   <li>When {@code Certificate}.</li>
   *   <li>Then throw {@link AuthInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseX509Certificate(String)}
   */
  @Test
  @DisplayName("Test parseX509Certificate(String); when 'Certificate'; then throw AuthInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.cert.Certificate JwtHelper.parseX509Certificate(String)"})
  void testParseX509Certificate_whenCertificate_thenThrowAuthInitializationException4()
      throws AuthInitializationException {
    // Arrange, Act and Assert
    assertThrows(AuthInitializationException.class, () -> JwtHelper.parseX509Certificate("  Certificate"));
  }

  /**
   * Test {@link JwtHelper#parseX509Certificate(String)}.
   * <ul>
   *   <li>When {@code Certificate}.</li>
   *   <li>Then throw {@link AuthInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseX509Certificate(String)}
   */
  @Test
  @DisplayName("Test parseX509Certificate(String); when 'Certificate'; then throw AuthInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.cert.Certificate JwtHelper.parseX509Certificate(String)"})
  void testParseX509Certificate_whenCertificate_thenThrowAuthInitializationException5()
      throws AuthInitializationException {
    // Arrange, Act and Assert
    assertThrows(AuthInitializationException.class, () -> JwtHelper.parseX509Certificate(" Certificate "));
  }

  /**
   * Test {@link JwtHelper#parseX509Certificate(String)}.
   * <ul>
   *   <li>When {@code CertificatecanUseSimplifiedKeyDelivery}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseX509Certificate(String)}
   */
  @Test
  @DisplayName("Test parseX509Certificate(String); when 'CertificatecanUseSimplifiedKeyDelivery'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.cert.Certificate JwtHelper.parseX509Certificate(String)"})
  void testParseX509Certificate_whenCertificatecanUseSimplifiedKeyDelivery() throws AuthInitializationException {
    // Arrange, Act and Assert
    assertThrows(AuthInitializationException.class,
        () -> JwtHelper.parseX509Certificate(" CertificatecanUseSimplifiedKeyDelivery"));
  }

  /**
   * Test {@link JwtHelper#parseX509Certificate(String)}.
   * <ul>
   *   <li>When {@code Certificateexp}.</li>
   *   <li>Then throw {@link AuthInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseX509Certificate(String)}
   */
  @Test
  @DisplayName("Test parseX509Certificate(String); when 'Certificateexp'; then throw AuthInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.cert.Certificate JwtHelper.parseX509Certificate(String)"})
  void testParseX509Certificate_whenCertificateexp_thenThrowAuthInitializationException()
      throws AuthInitializationException {
    // Arrange, Act and Assert
    assertThrows(AuthInitializationException.class, () -> JwtHelper.parseX509Certificate(" Certificateexp"));
  }

  /**
   * Test {@link JwtHelper#parseX509Certificate(String)}.
   * <ul>
   *   <li>When {@code exp}.</li>
   *   <li>Then throw {@link AuthInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseX509Certificate(String)}
   */
  @Test
  @DisplayName("Test parseX509Certificate(String); when 'exp'; then throw AuthInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.cert.Certificate JwtHelper.parseX509Certificate(String)"})
  void testParseX509Certificate_whenExp_thenThrowAuthInitializationException() throws AuthInitializationException {
    // Arrange, Act and Assert
    assertThrows(AuthInitializationException.class, () -> JwtHelper.parseX509Certificate(" exp"));
  }

  /**
   * Test {@link JwtHelper#parseX509Certificate(String)}.
   * <ul>
   *   <li>When {@code exp}.</li>
   *   <li>Then throw {@link AuthInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseX509Certificate(String)}
   */
  @Test
  @DisplayName("Test parseX509Certificate(String); when 'exp'; then throw AuthInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.cert.Certificate JwtHelper.parseX509Certificate(String)"})
  void testParseX509Certificate_whenExp_thenThrowAuthInitializationException2() throws AuthInitializationException {
    // Arrange, Act and Assert
    assertThrows(AuthInitializationException.class, () -> JwtHelper.parseX509Certificate("exp "));
  }

  /**
   * Test {@link JwtHelper#parseX509Certificate(String)}.
   * <ul>
   *   <li>When {@code exp}.</li>
   *   <li>Then throw {@link AuthInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseX509Certificate(String)}
   */
  @Test
  @DisplayName("Test parseX509Certificate(String); when 'exp'; then throw AuthInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.cert.Certificate JwtHelper.parseX509Certificate(String)"})
  void testParseX509Certificate_whenExp_thenThrowAuthInitializationException3() throws AuthInitializationException {
    // Arrange, Act and Assert
    assertThrows(AuthInitializationException.class, () -> JwtHelper.parseX509Certificate("  exp"));
  }

  /**
   * Test {@link JwtHelper#parseX509Certificate(String)}.
   * <ul>
   *   <li>When {@code RSACertificate}.</li>
   *   <li>Then throw {@link AuthInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseX509Certificate(String)}
   */
  @Test
  @DisplayName("Test parseX509Certificate(String); when 'RSACertificate'; then throw AuthInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.cert.Certificate JwtHelper.parseX509Certificate(String)"})
  void testParseX509Certificate_whenRSACertificate_thenThrowAuthInitializationException()
      throws AuthInitializationException {
    // Arrange, Act and Assert
    assertThrows(AuthInitializationException.class, () -> JwtHelper.parseX509Certificate(" RSACertificate"));
  }

  /**
   * Test {@link JwtHelper#parseX509Certificate(String)}.
   * <ul>
   *   <li>When {@code RSA}.</li>
   *   <li>Then throw {@link AuthInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseX509Certificate(String)}
   */
  @Test
  @DisplayName("Test parseX509Certificate(String); when 'RSA'; then throw AuthInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.cert.Certificate JwtHelper.parseX509Certificate(String)"})
  void testParseX509Certificate_whenRsa_thenThrowAuthInitializationException() throws AuthInitializationException {
    // Arrange, Act and Assert
    assertThrows(AuthInitializationException.class, () -> JwtHelper.parseX509Certificate(" RSA"));
  }

  /**
   * Test {@link JwtHelper#parseX509Certificate(String)}.
   * <ul>
   *   <li>When {@code RSA}.</li>
   *   <li>Then throw {@link AuthInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseX509Certificate(String)}
   */
  @Test
  @DisplayName("Test parseX509Certificate(String); when 'RSA'; then throw AuthInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.cert.Certificate JwtHelper.parseX509Certificate(String)"})
  void testParseX509Certificate_whenRsa_thenThrowAuthInitializationException2() throws AuthInitializationException {
    // Arrange, Act and Assert
    assertThrows(AuthInitializationException.class, () -> JwtHelper.parseX509Certificate("RSA "));
  }

  /**
   * Test {@link JwtHelper#parseX509Certificate(String)}.
   * <ul>
   *   <li>When {@code RSA}.</li>
   *   <li>Then throw {@link AuthInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseX509Certificate(String)}
   */
  @Test
  @DisplayName("Test parseX509Certificate(String); when 'RSA'; then throw AuthInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.cert.Certificate JwtHelper.parseX509Certificate(String)"})
  void testParseX509Certificate_whenRsa_thenThrowAuthInitializationException3() throws AuthInitializationException {
    // Arrange, Act and Assert
    assertThrows(AuthInitializationException.class, () -> JwtHelper.parseX509Certificate("  RSA"));
  }

  /**
   * Test {@link JwtHelper#parseX509Certificate(String)}.
   * <ul>
   *   <li>When {@code RSA}.</li>
   *   <li>Then throw {@link AuthInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseX509Certificate(String)}
   */
  @Test
  @DisplayName("Test parseX509Certificate(String); when 'RSA'; then throw AuthInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.cert.Certificate JwtHelper.parseX509Certificate(String)"})
  void testParseX509Certificate_whenRsa_thenThrowAuthInitializationException4() throws AuthInitializationException {
    // Arrange, Act and Assert
    assertThrows(AuthInitializationException.class, () -> JwtHelper.parseX509Certificate(" RSA "));
  }

  /**
   * Test {@link JwtHelper#parseX509Certificate(String)}.
   * <ul>
   *   <li>When space space space.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseX509Certificate(String)}
   */
  @Test
  @DisplayName("Test parseX509Certificate(String); when space space space")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.cert.Certificate JwtHelper.parseX509Certificate(String)"})
  void testParseX509Certificate_whenSpaceSpaceSpace() throws AuthInitializationException {
    // Arrange, Act and Assert
    assertThrows(AuthInitializationException.class, () -> JwtHelper.parseX509Certificate("   "));
  }

  /**
   * Test {@link JwtHelper#parseX509Certificate(String)}.
   * <ul>
   *   <li>When space space.</li>
   *   <li>Then throw {@link AuthInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseX509Certificate(String)}
   */
  @Test
  @DisplayName("Test parseX509Certificate(String); when space space; then throw AuthInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.cert.Certificate JwtHelper.parseX509Certificate(String)"})
  void testParseX509Certificate_whenSpaceSpace_thenThrowAuthInitializationException()
      throws AuthInitializationException {
    // Arrange, Act and Assert
    assertThrows(AuthInitializationException.class, () -> JwtHelper.parseX509Certificate("  "));
  }

  /**
   * Test {@link JwtHelper#parseX509Certificate(String)}.
   * <ul>
   *   <li>When space.</li>
   *   <li>Then throw {@link AuthInitializationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link JwtHelper#parseX509Certificate(String)}
   */
  @Test
  @DisplayName("Test parseX509Certificate(String); when space; then throw AuthInitializationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.security.cert.Certificate JwtHelper.parseX509Certificate(String)"})
  void testParseX509Certificate_whenSpace_thenThrowAuthInitializationException() throws AuthInitializationException {
    // Arrange, Act and Assert
    assertThrows(AuthInitializationException.class, () -> JwtHelper.parseX509Certificate(" "));
  }
}
