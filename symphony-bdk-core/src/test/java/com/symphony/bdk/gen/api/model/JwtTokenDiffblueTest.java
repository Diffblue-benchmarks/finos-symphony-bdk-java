package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class JwtTokenDiffblueTest {
  /**
   * Test {@link JwtToken#equals(Object)}, and {@link JwtToken#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link JwtToken#equals(Object)}
   *   <li>{@link JwtToken#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean JwtToken.equals(Object)", "int JwtToken.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    JwtToken jwtToken = new JwtToken();
    JwtToken jwtToken2 = new JwtToken();

    // Act and Assert
    assertEquals(jwtToken, jwtToken2);
    assertEquals(jwtToken.hashCode(), jwtToken2.hashCode());
  }

  /**
   * Test {@link JwtToken#equals(Object)}, and {@link JwtToken#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link JwtToken#equals(Object)}
   *   <li>{@link JwtToken#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean JwtToken.equals(Object)", "int JwtToken.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    JwtToken jwtToken = new JwtToken();

    // Act and Assert
    assertEquals(jwtToken, jwtToken);
    int expectedHashCodeResult = jwtToken.hashCode();
    assertEquals(expectedHashCodeResult, jwtToken.hashCode());
  }

  /**
   * Test {@link JwtToken#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link JwtToken#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean JwtToken.equals(Object)", "int JwtToken.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new JwtToken(), 1);
  }

  /**
   * Test {@link JwtToken#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link JwtToken#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean JwtToken.equals(Object)", "int JwtToken.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    JwtToken jwtToken = new JwtToken();
    jwtToken.tokenType("ABC123");

    // Act and Assert
    assertNotEquals(jwtToken, new JwtToken());
  }

  /**
   * Test {@link JwtToken#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link JwtToken#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean JwtToken.equals(Object)", "int JwtToken.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    JwtToken jwtToken = new JwtToken();
    jwtToken.expiresIn(1L);

    // Act and Assert
    assertNotEquals(jwtToken, new JwtToken());
  }

  /**
   * Test {@link JwtToken#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link JwtToken#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean JwtToken.equals(Object)", "int JwtToken.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    JwtToken jwtToken = new JwtToken();
    jwtToken.accessToken("ABC123");

    // Act and Assert
    assertNotEquals(jwtToken, new JwtToken());
  }

  /**
   * Test {@link JwtToken#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link JwtToken#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean JwtToken.equals(Object)", "int JwtToken.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new JwtToken(), null);
  }

  /**
   * Test {@link JwtToken#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link JwtToken#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean JwtToken.equals(Object)", "int JwtToken.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new JwtToken(), "Different type to JwtToken");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link JwtToken}
   *   <li>{@link JwtToken#accessToken(String)}
   *   <li>{@link JwtToken#expiresIn(Long)}
   *   <li>{@link JwtToken#setAccessToken(String)}
   *   <li>{@link JwtToken#setExpiresIn(Long)}
   *   <li>{@link JwtToken#setTokenType(String)}
   *   <li>{@link JwtToken#tokenType(String)}
   *   <li>{@link JwtToken#toString()}
   *   <li>{@link JwtToken#getAccessToken()}
   *   <li>{@link JwtToken#getExpiresIn()}
   *   <li>{@link JwtToken#getTokenType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void JwtToken.<init>()",
    "JwtToken JwtToken.accessToken(String)",
    "JwtToken JwtToken.expiresIn(Long)",
    "String JwtToken.getAccessToken()",
    "Long JwtToken.getExpiresIn()",
    "String JwtToken.getTokenType()",
    "void JwtToken.setAccessToken(String)",
    "void JwtToken.setExpiresIn(Long)",
    "void JwtToken.setTokenType(String)",
    "String JwtToken.toString()",
    "JwtToken JwtToken.tokenType(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    JwtToken actualJwtToken = new JwtToken();
    JwtToken actualAccessTokenResult = actualJwtToken.accessToken("ABC123");
    JwtToken actualExpiresInResult = actualJwtToken.expiresIn(1L);
    actualJwtToken.setAccessToken("ABC123");
    actualJwtToken.setExpiresIn(1L);
    actualJwtToken.setTokenType("ABC123");
    JwtToken actualTokenTypeResult = actualJwtToken.tokenType("ABC123");
    String actualToStringResult = actualJwtToken.toString();
    String actualAccessToken = actualJwtToken.getAccessToken();
    Long actualExpiresIn = actualJwtToken.getExpiresIn();

    // Assert
    assertEquals("ABC123", actualAccessToken);
    assertEquals("ABC123", actualJwtToken.getTokenType());
    assertEquals(
        "class JwtToken {\n    tokenType: ABC123\n    expiresIn: 1\n    accessToken: ABC123\n}",
        actualToStringResult);
    assertEquals(1L, actualExpiresIn.longValue());
    assertSame(actualJwtToken, actualAccessTokenResult);
    assertSame(actualJwtToken, actualExpiresInResult);
    assertSame(actualJwtToken, actualTokenTypeResult);
  }
}
